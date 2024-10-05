package org.telegram.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SMSJobController;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_boolFalse;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_eligibleToJoin;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_join;
import org.telegram.tgnet.TL_smsjobs$TL_smsjobs_status;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.Premium.boosts.GiftInfoBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.SMSStatsActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class SMSStatsActivity extends GradientHeaderActivity implements NotificationCenter.NotificationCenterDelegate {
    private View aboveTitleView;
    private TextView errorChipTextView;
    private boolean lastAirplaneMode;
    private LimitPreviewView limitPreviewView;
    private TableView table;
    private FrameLayout underTitleView;
    private ArrayList oldItems = new ArrayList();
    private ArrayList items = new ArrayList();
    private boolean allowInternationalSet = false;
    private boolean allowInternational = false;
    private boolean askedStatusToLoad = false;
    private final AdapterWithDiffUtils adapter = new AdapterWithDiffUtils() {
        @Override
        public int getItemCount() {
            return SMSStatsActivity.this.items.size();
        }

        @Override
        public int getItemViewType(int i) {
            if (i < 0 || i >= SMSStatsActivity.this.items.size()) {
                return 2;
            }
            return ((Item) SMSStatsActivity.this.items.get(i)).viewType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 3 || itemViewType == 4;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            int i3;
            if (i < 0 || i >= SMSStatsActivity.this.items.size()) {
                return;
            }
            Item item = (Item) SMSStatsActivity.this.items.get(i);
            int itemViewType = viewHolder.getItemViewType();
            int i4 = i + 1;
            boolean z = i4 < SMSStatsActivity.this.items.size() && ((Item) SMSStatsActivity.this.items.get(i4)).viewType == itemViewType;
            if (itemViewType == 2) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                boolean z2 = i == SMSStatsActivity.this.items.size() - 1;
                if (TextUtils.isEmpty(item.text)) {
                    textInfoPrivacyCell.setFixedSize(z2 ? 350 : 21);
                    textInfoPrivacyCell.setText("");
                    return;
                } else {
                    textInfoPrivacyCell.setFixedSize(0);
                    textInfoPrivacyCell.setText(item.text);
                    return;
                }
            }
            if (itemViewType != 3) {
                if (itemViewType == 4) {
                    ((TextCell) viewHolder.itemView).setTextAndCheck(item.text, item.id == 3 ? SMSStatsActivity.this.allowInternational : false, z);
                    return;
                } else if (itemViewType == 1) {
                    ((TableView) viewHolder.itemView).update(false);
                    return;
                } else {
                    if (itemViewType == 5) {
                        ((HeaderCell) viewHolder.itemView).setText(item.text);
                        return;
                    }
                    return;
                }
            }
            TextCell textCell = (TextCell) viewHolder.itemView;
            if (item.red) {
                i2 = Theme.key_text_RedBold;
                i3 = Theme.key_text_RedRegular;
            } else {
                i2 = Theme.key_windowBackgroundWhiteGrayIcon;
                i3 = Theme.key_windowBackgroundWhiteBlackText;
            }
            textCell.setColors(i2, i3);
            int i5 = item.id;
            if (i5 == 5) {
                textCell.setTextAndValueAndIcon(item.text.toString(), item.error ? SMSStatsActivity.error(19) : null, item.icon, z);
                return;
            }
            if (i5 != 4) {
                int i6 = item.icon;
                if (i6 == 0) {
                    textCell.setText(item.text, z);
                    return;
                } else {
                    textCell.setTextAndIcon(item.text, i6, z);
                    return;
                }
            }
            SMSJobController.SIM selectedSIM = SMSJobController.getInstance(((BaseFragment) SMSStatsActivity.this).currentAccount).getSelectedSIM();
            String str = selectedSIM != null ? selectedSIM.name : "";
            if (item.icon == 0) {
                textCell.setTextAndValue(item.text.toString(), str, z);
            } else {
                textCell.setTextAndValueAndIcon(item.text.toString(), str, item.icon, z);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View header;
            if (i == 0) {
                SMSStatsActivity sMSStatsActivity = SMSStatsActivity.this;
                header = sMSStatsActivity.getHeader(sMSStatsActivity.getContext());
            } else if (i == 1) {
                SMSStatsActivity sMSStatsActivity2 = SMSStatsActivity.this;
                SMSStatsActivity sMSStatsActivity3 = SMSStatsActivity.this;
                header = sMSStatsActivity2.table = new TableView(sMSStatsActivity3.getContext(), ((BaseFragment) SMSStatsActivity.this).currentAccount);
            } else if (i == 3) {
                header = new TextCell(SMSStatsActivity.this.getContext());
            } else if (i == 4) {
                header = new TextCell(SMSStatsActivity.this.getContext(), 23, false, true, SMSStatsActivity.this.getResourceProvider());
            } else if (i != 5) {
                header = new TextInfoPrivacyCell(SMSStatsActivity.this.getContext());
                CombinedDrawable combinedDrawable = new CombinedDrawable(new ColorDrawable(Theme.getColor(Theme.key_windowBackgroundGray)), Theme.getThemedDrawable(SMSStatsActivity.this.getContext(), 2131231022, Theme.getColor(Theme.key_windowBackgroundGrayShadow, ((BaseFragment) SMSStatsActivity.this).resourceProvider)), 0, 0);
                combinedDrawable.setFullsize(true);
                header.setBackground(combinedDrawable);
            } else {
                header = new HeaderCell(SMSStatsActivity.this.getContext());
            }
            header.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(header);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            if (viewHolder.getItemViewType() == 1) {
                ((TableView) viewHolder.itemView).update(false);
            }
        }
    };
    private Runnable checkAirplaneMode = new Runnable() {
        @Override
        public final void run() {
            SMSStatsActivity.this.lambda$new$7();
        }
    };

    public static class Item extends AdapterWithDiffUtils.Item {
        public SMSJobController.JobEntry entry;
        public boolean error;
        public int icon;
        public int id;
        public boolean red;
        public CharSequence text;

        public Item(int i) {
            super(i, false);
        }

        public static Item asButton(int i, int i2, CharSequence charSequence) {
            Item item = new Item(3);
            item.id = i;
            item.icon = i2;
            item.text = charSequence;
            return item;
        }

        public static Item asShadow(CharSequence charSequence) {
            Item item = new Item(2);
            item.text = charSequence;
            return item;
        }

        public static Item asSwitch(int i, CharSequence charSequence) {
            Item item = new Item(4);
            item.id = i;
            item.text = charSequence;
            return item;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Item item = (Item) obj;
            return item.id == this.id && item.viewType == this.viewType && item.entry == this.entry && this.icon == item.icon && this.red == item.red && Objects.equals(this.text, item.text);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.icon), this.text, Boolean.valueOf(this.red));
        }

        public Item makeRed() {
            this.red = true;
            return this;
        }

        public Item setError(boolean z) {
            this.error = z;
            return this;
        }
    }

    public static class SMSHistorySheet extends BottomSheetWithRecyclerListView implements NotificationCenter.NotificationCenterDelegate {
        private final Paint backgroundPaint;
        private final Paint strokePaint;

        public class HeaderCell extends LinearLayout {
            public HeaderCell(Context context) {
                super(context);
                setOrientation(1);
                ImageView imageView = new ImageView(context);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setImageResource(2131231163);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(80.0f), Theme.getColor(Theme.key_featuredStickers_addButton)));
                addView(imageView, LayoutHelper.createLinear(80, 80, 1, 0, 24, 0, 12));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 20.0f);
                textView.setGravity(17);
                textView.setTextAlignment(4);
                int i = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setText(LocaleController.getString(2131695849));
                addView(textView, LayoutHelper.createLinear(-1, -2, 1, 50, 0, 50, 6));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setGravity(17);
                textView2.setTextAlignment(4);
                textView2.setTextColor(Theme.getColor(i));
                textView2.setText(AndroidUtilities.replaceTags(LocaleController.getString(2131695848)));
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView2, LayoutHelper.createLinear(-1, -2, 1, 50, 0, 50, 20));
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            }
        }

        public class TableCell extends FrameLayout {
            private final LinearLayout container;
            private final TextView countryTextView;
            private final TextView dateTextView;
            private final TextView errorDescriptionTextView;
            private final TextView errorTextView;
            private boolean isLast;
            private final TextView statusTextView;

            public TableCell(Context context) {
                super(context);
                LinearLayout linearLayout = new LinearLayout(context) {
                    @Override
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(350.0f)), 1073741824), i2);
                    }
                };
                this.container = linearLayout;
                linearLayout.setOrientation(1);
                addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 1, 14.0f, 0.0f, 14.0f, 0.0f));
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.setMinimumHeight(AndroidUtilities.dp(50.0f));
                linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 23));
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(1);
                linearLayout3.setGravity(16);
                TextView textView = new TextView(context);
                this.dateTextView = textView;
                int i = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout3.addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 2.0f));
                TextView textView2 = new TextView(context);
                this.countryTextView = textView2;
                NotificationCenter.listenEmojiLoading(textView2);
                textView2.setTextColor(Theme.blendOver(Theme.getColor(Theme.key_dialogBackground), Theme.multAlpha(Theme.getColor(i), 0.55f)));
                textView2.setTextSize(1, 13.0f);
                textView2.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout3.addView(textView2, LayoutHelper.createLinear(-1, -2));
                linearLayout2.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 45.0f, 23));
                LinearLayout linearLayout4 = new LinearLayout(context);
                linearLayout4.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
                linearLayout4.setOrientation(1);
                linearLayout4.setGravity(16);
                TextView textView3 = new TextView(context);
                this.statusTextView = textView3;
                textView3.setGravity(16);
                textView3.setTypeface(AndroidUtilities.bold());
                textView3.setTextSize(1, 14.0f);
                textView3.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(13.0f), 0);
                linearLayout4.addView(textView3, LayoutHelper.createLinear(-1, -2, 55.0f, 119));
                TextView textView4 = new TextView(context);
                this.errorTextView = textView4;
                textView4.setGravity(16);
                textView4.setTextSize(1, 10.0f);
                textView4.setAlpha(0.7f);
                textView4.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(13.0f), 0);
                textView4.setVisibility(8);
                int i2 = Theme.key_text_RedRegular;
                textView4.setTextColor(Theme.getColor(i2));
                linearLayout4.addView(textView4, LayoutHelper.createLinear(-1, -2, 55.0f, 119));
                linearLayout2.addView(linearLayout4, LayoutHelper.createLinear(-1, -2, 55.0f, 119));
                TextView textView5 = new TextView(context);
                this.errorDescriptionTextView = textView5;
                textView5.setVisibility(8);
                textView5.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(6.0f));
                textView5.setTextSize(1, 11.0f);
                textView5.setTextColor(Theme.getColor(i2));
                textView5.setGravity(17);
                linearLayout.addView(textView5, LayoutHelper.createLinear(-1, -2, 119));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (this.isLast) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(this.container.getX() - AndroidUtilities.dpf2(0.5f), -AndroidUtilities.dp(6.0f), this.container.getX() + this.container.getMeasuredWidth() + AndroidUtilities.dpf2(0.5f), this.container.getMeasuredHeight() - AndroidUtilities.dpf2(0.5f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), SMSHistorySheet.this.strokePaint);
                } else {
                    canvas.drawRect(this.container.getX() - AndroidUtilities.dpf2(0.5f), -AndroidUtilities.dp(1.0f), this.container.getX() + this.container.getMeasuredWidth() + AndroidUtilities.dpf2(0.5f), this.container.getMeasuredHeight() - AndroidUtilities.dpf2(0.5f), SMSHistorySheet.this.strokePaint);
                }
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
            }

            public void setEntry(org.telegram.messenger.SMSJobController.JobEntry r9, boolean r10) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.SMSStatsActivity.SMSHistorySheet.TableCell.setEntry(org.telegram.messenger.SMSJobController$JobEntry, boolean):void");
            }
        }

        public class TableHeader extends FrameLayout {
            private final LinearLayout container;

            public TableHeader(Context context) {
                super(context);
                LinearLayout linearLayout = new LinearLayout(context) {
                    @Override
                    protected void onMeasure(int i, int i2) {
                        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), AndroidUtilities.dp(350.0f)), 1073741824), i2);
                    }
                };
                this.container = linearLayout;
                addView(linearLayout, LayoutHelper.createFrame(-1, 37.0f, 1, 14.0f, 0.0f, 14.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setGravity(16);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setText(LocaleController.getString(2131695843));
                int i = Theme.key_dialogTextBlack;
                textView.setTextColor(Theme.getColor(i));
                textView.setTextSize(1, 14.0f);
                textView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(4.0f), 0);
                linearLayout.addView(textView, LayoutHelper.createLinear(-1, 37, 45.0f, 119));
                TextView textView2 = new TextView(context);
                textView2.setGravity(16);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setText(LocaleController.getString(2131695844));
                textView2.setTextColor(Theme.getColor(i));
                textView2.setTextSize(1, 14.0f);
                textView2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(13.0f), 0);
                linearLayout.addView(textView2, LayoutHelper.createLinear(-1, 37, 55.0f, 119));
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(this.container.getX() - AndroidUtilities.dpf2(0.5f), AndroidUtilities.dpf2(0.5f), this.container.getX() + this.container.getMeasuredWidth() + AndroidUtilities.dpf2(0.5f), this.container.getMeasuredHeight() + AndroidUtilities.dp(5.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), SMSHistorySheet.this.backgroundPaint);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(5.0f), AndroidUtilities.dp(5.0f), SMSHistorySheet.this.strokePaint);
                canvas.drawLine(this.container.getX() - AndroidUtilities.dpf2(0.5f), this.container.getMeasuredHeight() - AndroidUtilities.dpf2(0.5f), this.container.getX() + this.container.getMeasuredWidth() + AndroidUtilities.dpf2(0.5f), this.container.getMeasuredHeight() - AndroidUtilities.dpf2(0.5f), SMSHistorySheet.this.strokePaint);
                super.dispatchDraw(canvas);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), AndroidUtilities.dp(37.0f));
            }
        }

        public SMSHistorySheet(BaseFragment baseFragment) {
            super(baseFragment, false, false);
            Paint paint = new Paint(1);
            this.backgroundPaint = paint;
            Paint paint2 = new Paint(1);
            this.strokePaint = paint2;
            SMSJobController.getInstance(this.currentAccount).seenError();
            paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(Theme.getColor(Theme.key_table_border, this.resourcesProvider));
            paint.setColor(Theme.getColor(Theme.key_table_background, this.resourcesProvider));
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(getContext(), this.resourcesProvider);
            buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SMSStatsActivity.SMSHistorySheet.this.lambda$new$0(view);
                }
            });
            buttonWithCounterView.setText(LocaleController.getString(2131691618), false);
            frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 16, 16.0f, 0.0f, 16.0f, 0.0f));
            View view = new View(getContext());
            view.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
            frameLayout.addView(view, LayoutHelper.createFrame(-1.0f, 1.5f / AndroidUtilities.density, 55));
            this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 68, 80));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setDurations(350L);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setSupportsChangeAnimations(false);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
        }

        public void lambda$new$0(View view) {
            dismiss();
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            return new RecyclerListView.SelectionAdapter() {
                @Override
                public int getItemCount() {
                    return SMSJobController.getInstance(((BottomSheet) SMSHistorySheet.this).currentAccount).journal.size() + 3;
                }

                @Override
                public int getItemViewType(int i) {
                    if (i == 0) {
                        return 0;
                    }
                    if (i == 1) {
                        return 1;
                    }
                    return i == getItemCount() - 1 ? 3 : 2;
                }

                @Override
                public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                    return false;
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    int i2 = i - 2;
                    ArrayList<SMSJobController.JobEntry> arrayList = SMSJobController.getInstance(((BottomSheet) SMSHistorySheet.this).currentAccount).journal;
                    if (i2 < 0 || arrayList == null || i2 >= arrayList.size()) {
                        return;
                    }
                    ((TableCell) viewHolder.itemView).setEntry(arrayList.get(i2), i + (-1) == arrayList.size());
                }

                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    View tableCell;
                    if (i == 0) {
                        SMSHistorySheet sMSHistorySheet = SMSHistorySheet.this;
                        tableCell = new HeaderCell(sMSHistorySheet.getContext());
                    } else if (i == 1) {
                        SMSHistorySheet sMSHistorySheet2 = SMSHistorySheet.this;
                        tableCell = new TableHeader(sMSHistorySheet2.getContext());
                    } else if (i == 3) {
                        tableCell = new View(SMSHistorySheet.this.getContext()) {
                            @Override
                            protected void onMeasure(int i2, int i3) {
                                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(88.0f), 1073741824));
                            }
                        };
                    } else {
                        SMSHistorySheet sMSHistorySheet3 = SMSHistorySheet.this;
                        tableCell = new TableCell(sMSHistorySheet3.getContext());
                    }
                    return new RecyclerListView.Holder(tableCell);
                }
            };
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            RecyclerListView recyclerListView;
            if (i != NotificationCenter.smsJobStatusUpdate || (recyclerListView = this.recyclerListView) == null || recyclerListView.getAdapter() == null) {
                return;
            }
            this.recyclerListView.getAdapter().notifyDataSetChanged();
        }

        @Override
        public void dismiss() {
            super.dismiss();
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.smsJobStatusUpdate);
        }

        @Override
        protected CharSequence getTitle() {
            return LocaleController.getString(2131695849);
        }

        @Override
        public void onCreate(Bundle bundle) {
            super.onCreate(bundle);
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.smsJobStatusUpdate);
        }
    }

    public class TableView extends LinearLayout {
        public final int currentAccount;
        public final AnimatedTextView giftSinceDateTextView;
        public final LinkSpanDrawable.LinksTextView lastGiftLinkTextView;
        public final AnimatedTextView sentSinceDateTextView;
        public final TextView sentSinceTitleView;
        public final AnimatedTextView smsRemainingTextView;
        public final AnimatedTextView smsSentTextView;

        public TableView(Context context, int i) {
            super(context);
            this.currentAccount = i;
            setOrientation(1);
            setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), AndroidUtilities.dp(20.0f));
            TextView textView = new TextView(context);
            textView.setTextSize(1, 15.0f);
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i2));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(2131695860));
            addView(textView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 23.0f, 0.0f, 0.0f));
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            linearLayout.addView(linearLayout2, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(1);
            linearLayout.addView(linearLayout3, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.smsSentTextView = animatedTextView;
            animatedTextView.setTextColor(Theme.getColor(i2, ((BaseFragment) SMSStatsActivity.this).resourceProvider));
            animatedTextView.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView.setTypeface(AndroidUtilities.bold());
            linearLayout2.addView(animatedTextView, LayoutHelper.createLinear(-1, 20, 4.0f, 0.0f, 4.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 13.0f);
            int i3 = Theme.key_windowBackgroundWhiteGrayText4;
            textView2.setTextColor(Theme.getColor(i3));
            textView2.setText(LocaleController.getString(2131695897));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-1, -2, 4.0f, 0.0f, 4.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, true, true);
            this.sentSinceDateTextView = animatedTextView2;
            animatedTextView2.setTextColor(Theme.getColor(i2, ((BaseFragment) SMSStatsActivity.this).resourceProvider));
            animatedTextView2.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView2.setTypeface(AndroidUtilities.bold());
            linearLayout3.addView(animatedTextView2, LayoutHelper.createLinear(-1, 20, 4.0f, 0.0f, 4.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.sentSinceTitleView = textView3;
            textView3.setTextSize(1, 13.0f);
            textView3.setTextColor(Theme.getColor(i3));
            textView3.setText(LocaleController.getString(2131695872));
            linearLayout3.addView(textView3, LayoutHelper.createLinear(-1, -2, 4.0f, 0.0f, 4.0f, 0.0f));
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(0);
            addView(linearLayout4, LayoutHelper.createLinear(-1, -2, 0.0f, 23.0f, 0.0f, 0.0f));
            LinearLayout linearLayout5 = new LinearLayout(context);
            linearLayout5.setOrientation(1);
            linearLayout4.addView(linearLayout5, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
            LinearLayout linearLayout6 = new LinearLayout(context);
            linearLayout6.setOrientation(1);
            linearLayout4.addView(linearLayout6, LayoutHelper.createLinear(-1, -2, 1.0f, 119));
            AnimatedTextView animatedTextView3 = new AnimatedTextView(context, false, true, true);
            this.smsRemainingTextView = animatedTextView3;
            animatedTextView3.setTextColor(Theme.getColor(i2, ((BaseFragment) SMSStatsActivity.this).resourceProvider));
            animatedTextView3.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView3.setTypeface(AndroidUtilities.bold());
            animatedTextView3.setText("0");
            linearLayout5.addView(animatedTextView3, LayoutHelper.createLinear(-1, 20, 4.0f, 0.0f, 4.0f, 0.0f));
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 13.0f);
            textView4.setTextColor(Theme.getColor(i3));
            textView4.setText(LocaleController.getString(2131695870));
            linearLayout5.addView(textView4, LayoutHelper.createLinear(-1, -2, 4.0f, 0.0f, 4.0f, 0.0f));
            AnimatedTextView animatedTextView4 = new AnimatedTextView(context, false, true, true);
            this.giftSinceDateTextView = animatedTextView4;
            animatedTextView4.setTextColor(Theme.getColor(i2, ((BaseFragment) SMSStatsActivity.this).resourceProvider));
            animatedTextView4.setTextSize(AndroidUtilities.dp(17.0f));
            animatedTextView4.setTypeface(AndroidUtilities.bold());
            linearLayout6.addView(animatedTextView4, LayoutHelper.createLinear(-1, 20, 4.0f, 0.0f, 4.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.lastGiftLinkTextView = linksTextView;
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, 0, 0);
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, ((BaseFragment) SMSStatsActivity.this).resourceProvider));
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextColor(Theme.getColor(i3));
            linksTextView.setText(LocaleController.getString(2131695855));
            linearLayout6.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, 0.0f));
            update(false);
        }

        public void update(boolean z) {
            AnimatedTextView animatedTextView;
            String string;
            final TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = SMSJobController.getInstance(this.currentAccount).currentStatus;
            TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = SMSJobController.getInstance(this.currentAccount).isEligible;
            if (tL_smsjobs$TL_smsjobs_status == null && !SMSStatsActivity.this.askedStatusToLoad) {
                SMSJobController.getInstance(this.currentAccount).loadStatus(true);
                SMSStatsActivity.this.askedStatusToLoad = true;
            }
            if (LocaleController.isRTL) {
                z = false;
            }
            int i = tL_smsjobs$TL_smsjobs_status == null ? tL_smsjobs$TL_smsjobs_eligibleToJoin == null ? 0 : tL_smsjobs$TL_smsjobs_eligibleToJoin.monthly_sent_sms : tL_smsjobs$TL_smsjobs_status.recent_remains;
            AnimatedTextView animatedTextView2 = this.smsSentTextView;
            StringBuilder sb = new StringBuilder();
            String str = "";
            sb.append("");
            sb.append(tL_smsjobs$TL_smsjobs_status == null ? 0 : tL_smsjobs$TL_smsjobs_status.total_sent);
            animatedTextView2.setText(sb.toString(), z);
            this.smsRemainingTextView.setText("" + i, z);
            if (tL_smsjobs$TL_smsjobs_status == null) {
                this.sentSinceDateTextView.setText(LocaleController.getString(2131693802), z);
            } else {
                String formatDateAudio = LocaleController.formatDateAudio(tL_smsjobs$TL_smsjobs_status.total_since, false);
                if (formatDateAudio.length() > 0) {
                    formatDateAudio = formatDateAudio.substring(0, 1).toUpperCase() + formatDateAudio.substring(1);
                }
                this.sentSinceDateTextView.setText(formatDateAudio, z);
            }
            this.sentSinceTitleView.setText(LocaleController.getString(2131695873));
            if (tL_smsjobs$TL_smsjobs_status == null || tL_smsjobs$TL_smsjobs_status.last_gift_slug == null) {
                animatedTextView = this.giftSinceDateTextView;
                string = LocaleController.getString(2131693802);
            } else {
                string = LocaleController.formatDateAudio(tL_smsjobs$TL_smsjobs_status.recent_since, false);
                if (string.length() > 0) {
                    string = string.substring(0, 1).toUpperCase() + string.substring(1);
                }
                animatedTextView = this.giftSinceDateTextView;
            }
            animatedTextView.setText(string, z);
            SpannableString spannableString = new SpannableString(LocaleController.getString(2131695855));
            if (tL_smsjobs$TL_smsjobs_status != null && tL_smsjobs$TL_smsjobs_status.last_gift_slug != null) {
                spannableString.setSpan(new URLSpan(str) {
                    @Override
                    public void onClick(View view) {
                        GiftInfoBottomSheet.show(SMSStatsActivity.this, tL_smsjobs$TL_smsjobs_status.last_gift_slug);
                    }

                    @Override
                    public void updateDrawState(TextPaint textPaint) {
                        textPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, ((BaseFragment) SMSStatsActivity.this).resourceProvider));
                    }
                }, 0, spannableString.length(), 17);
            }
            this.lastGiftLinkTextView.setText(spannableString);
        }
    }

    public SMSStatsActivity() {
        updateItems();
    }

    public static CharSequence error(final int i) {
        SpannableString spannableString = new SpannableString("!");
        Drawable drawable = new Drawable() {
            @Override
            public void draw(Canvas canvas) {
                Theme.chat_docBackPaint.setColor(Theme.getColor(Theme.key_text_RedBold));
                canvas.drawCircle(getIntrinsicWidth() / 2.0f, getIntrinsicHeight() / 2.0f, getIntrinsicWidth() / 2.0f, Theme.chat_docBackPaint);
                int intrinsicWidth = Theme.dialogs_errorDrawable.getIntrinsicWidth();
                int intrinsicHeight = Theme.dialogs_errorDrawable.getIntrinsicHeight();
                if (i < 18) {
                    intrinsicWidth = (int) (intrinsicWidth * 0.8f);
                    intrinsicHeight = (int) (intrinsicHeight * 0.8f);
                }
                float f = intrinsicWidth / 2;
                float f2 = intrinsicHeight / 2;
                Theme.dialogs_errorDrawable.setBounds((int) ((getIntrinsicWidth() / 2.0f) - f), (int) ((getIntrinsicHeight() / 2.0f) - f2), (int) ((getIntrinsicWidth() / 2.0f) + f), (int) ((getIntrinsicHeight() / 2.0f) + f2));
                Theme.dialogs_errorDrawable.draw(canvas);
            }

            @Override
            public int getIntrinsicHeight() {
                return AndroidUtilities.dp(i);
            }

            @Override
            public int getIntrinsicWidth() {
                return AndroidUtilities.dp(i);
            }

            @Override
            public int getOpacity() {
                return -2;
            }

            @Override
            public void setAlpha(int i2) {
            }

            @Override
            public void setColorFilter(ColorFilter colorFilter) {
            }
        };
        float f = i;
        drawable.setBounds(0, 0, AndroidUtilities.dp(f), AndroidUtilities.dp(f));
        spannableString.setSpan(new ImageSpan(drawable), 0, 1, 33);
        return spannableString;
    }

    public static boolean isAirplaneMode(Context context) {
        return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
    }

    public void lambda$createView$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString(2131696795)).show();
            return;
        }
        SMSJobController.getInstance(this.currentAccount).setState(3);
        SMSJobController.getInstance(this.currentAccount).loadStatus(true);
        SMSSubscribeSheet.showSubscribed(getContext(), getResourceProvider());
        update(true);
    }

    public void lambda$createView$1(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSStatsActivity.this.lambda$createView$0(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$createView$2() {
        SMSJobController.getInstance(this.currentAccount).checkSelectedSIMCard();
        if (SMSJobController.getInstance(this.currentAccount).getSelectedSIM() != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_smsjobs$TL_smsjobs_join(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SMSStatsActivity.this.lambda$createView$1(tLObject, tLRPC$TL_error);
                }
            });
        } else {
            SMSJobController.getInstance(this.currentAccount).setState(2);
            new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(2131695857)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(2131695856))).setPositiveButton(LocaleController.getString(2131694057), null).show();
        }
    }

    public void lambda$createView$3() {
        SMSJobController.getInstance(this.currentAccount).leave();
    }

    public void lambda$createView$4(DialogInterface dialogInterface, int i) {
        lambda$onBackPressed$307();
        if (SMSJobController.getInstance(this.currentAccount).getState() == 3) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SMSStatsActivity.this.lambda$createView$3();
                }
            }, 120L);
        } else {
            SMSJobController.getInstance(this.currentAccount).setState(0);
        }
    }

    public void lambda$createView$5(SMSJobController.SIM sim, View view, AlertDialog.Builder builder, View view2) {
        SMSJobController.getInstance(this.currentAccount).setSelectedSIM(sim);
        ((TextCell) view).setValue(sim.name, !LocaleController.isRTL);
        builder.getDismissRunnable().run();
    }

    public void lambda$createView$6(Context context, final View view, int i) {
        if (i < 0 || i >= this.items.size()) {
            return;
        }
        Item item = (Item) this.items.get(i);
        if (item.viewType == 0) {
            if (SMSJobController.getInstance(this.currentAccount).getState() == 1) {
                SMSSubscribeSheet.requestSMSPermissions(getContext(), new Runnable() {
                    @Override
                    public final void run() {
                        SMSStatsActivity.this.lambda$createView$2();
                    }
                }, false);
                return;
            }
            return;
        }
        int i2 = item.id;
        if (i2 == 1) {
            TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = SMSJobController.getInstance(this.currentAccount).currentStatus;
            TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = SMSJobController.getInstance(this.currentAccount).isEligible;
            if (tL_smsjobs$TL_smsjobs_status != null) {
                Browser.openUrl(getContext(), tL_smsjobs$TL_smsjobs_status.terms_url);
                return;
            } else {
                if (tL_smsjobs$TL_smsjobs_eligibleToJoin != null) {
                    Browser.openUrl(getContext(), tL_smsjobs$TL_smsjobs_eligibleToJoin.terms_of_use);
                    return;
                }
                return;
            }
        }
        if (i2 == 3) {
            if (SMSJobController.getInstance(this.currentAccount).currentState != 3) {
                return;
            }
            SMSJobController sMSJobController = SMSJobController.getInstance(this.currentAccount);
            boolean z = !this.allowInternational;
            this.allowInternational = z;
            sMSJobController.toggleAllowInternational(z);
            ((TextCell) view).setChecked(this.allowInternational);
            return;
        }
        if (i2 == 2) {
            presentFragment(new PremiumPreviewFragment("sms"));
            return;
        }
        if (i2 == 6) {
            AlertDialog create = new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(2131695838)).setMessage(LocaleController.getString(2131695837)).setPositiveButton(LocaleController.getString(2131697213), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    SMSStatsActivity.this.lambda$createView$4(dialogInterface, i3);
                }
            }).setNegativeButton(LocaleController.getString(2131690324), null).setDimAlpha(0.5f).create();
            showDialog(create);
            ((TextView) create.getButton(-1)).setTextColor(getThemedColor(Theme.key_text_RedBold));
            return;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                showDialog(new SMSHistorySheet(this));
                return;
            }
            return;
        }
        try {
            ArrayList<SMSJobController.SIM> sIMs = SMSJobController.getInstance(this.currentAccount).getSIMs();
            SMSJobController.SIM selectedSIM = SMSJobController.getInstance(this.currentAccount).getSelectedSIM();
            if (sIMs == null) {
                return;
            }
            final AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(2131695871));
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            builder.setView(linearLayout);
            int size = sIMs.size();
            for (int i3 = 0; i3 < size; i3++) {
                final SMSJobController.SIM sim = sIMs.get(i3);
                if (sim != null) {
                    LanguageCell languageCell = new LanguageCell(context);
                    languageCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                    languageCell.setTag(Integer.valueOf(i3));
                    String str = sim.country != null ? "" + LocationController.countryCodeToEmoji(sim.country) : "";
                    if (!TextUtils.isEmpty(str)) {
                        str = str + " ";
                    }
                    String str2 = str + sim.name;
                    NotificationCenter.listenEmojiLoading(languageCell.textView2);
                    languageCell.setValue(AndroidUtilities.replaceTags("**SIM" + (sim.slot + 1) + "**"), Emoji.replaceEmoji(str2, languageCell.textView2.getPaint().getFontMetricsInt(), false));
                    languageCell.setLanguageSelected(selectedSIM != null && selectedSIM.id == sim.id, false);
                    languageCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
                    linearLayout.addView(languageCell);
                    languageCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            SMSStatsActivity.this.lambda$createView$5(sim, view, builder, view2);
                        }
                    });
                }
            }
            builder.setNegativeButton(LocaleController.getString("Cancel", 2131691168), null);
            showDialog(builder.create());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$new$7() {
        boolean isAirplaneMode = isAirplaneMode(getContext());
        if (this.lastAirplaneMode != isAirplaneMode) {
            this.lastAirplaneMode = isAirplaneMode;
            update(true);
        }
        AndroidUtilities.runOnUIThread(this.checkAirplaneMode, 1200L);
    }

    public void lambda$update$8(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            BulletinFactory.showError(tLRPC$TL_error);
            return;
        }
        if (tLObject instanceof TLRPC$TL_boolFalse) {
            BulletinFactory.global().createErrorBulletin(LocaleController.getString(2131696795)).show();
            return;
        }
        SMSJobController.getInstance(this.currentAccount).setState(3);
        SMSJobController.getInstance(this.currentAccount).loadStatus(true);
        SMSSubscribeSheet.showSubscribed(getContext(), getResourceProvider());
        update(true);
    }

    public void lambda$update$9(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SMSStatsActivity.this.lambda$update$8(tLRPC$TL_error, tLObject);
            }
        });
    }

    private void update(boolean z) {
        String formatString;
        String formatPluralString;
        int i;
        CharSequence replaceTags;
        int i2;
        int checkSelfPermission;
        int checkSelfPermission2;
        int checkSelfPermission3;
        int state = SMSJobController.getInstance(this.currentAccount).getState();
        TL_smsjobs$TL_smsjobs_status tL_smsjobs$TL_smsjobs_status = SMSJobController.getInstance(this.currentAccount).currentStatus;
        TL_smsjobs$TL_smsjobs_eligibleToJoin tL_smsjobs$TL_smsjobs_eligibleToJoin = SMSJobController.getInstance(this.currentAccount).isEligible;
        if (tL_smsjobs$TL_smsjobs_status == null && !this.askedStatusToLoad) {
            SMSJobController.getInstance(this.currentAccount).loadStatus(true);
            this.askedStatusToLoad = true;
        }
        if (!this.allowInternational) {
            this.allowInternationalSet = tL_smsjobs$TL_smsjobs_status != null;
            this.allowInternational = tL_smsjobs$TL_smsjobs_status != null && tL_smsjobs$TL_smsjobs_status.allow_international;
        }
        if (isAirplaneMode(getContext())) {
            TextView textView = this.errorChipTextView;
            if (textView != null) {
                textView.setVisibility(0);
            }
            FrameLayout frameLayout = this.underTitleView;
            if (frameLayout != null) {
                frameLayout.setPadding(0, AndroidUtilities.dp(12.0f), 0, 0);
            }
        } else {
            TextView textView2 = this.errorChipTextView;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            FrameLayout frameLayout2 = this.underTitleView;
            if (frameLayout2 != null) {
                frameLayout2.setPadding(0, 0, 0, 0);
            }
        }
        int i3 = tL_smsjobs$TL_smsjobs_status == null ? 0 : tL_smsjobs$TL_smsjobs_status.recent_sent;
        int i4 = tL_smsjobs$TL_smsjobs_status == null ? tL_smsjobs$TL_smsjobs_eligibleToJoin == null ? 0 : tL_smsjobs$TL_smsjobs_eligibleToJoin.monthly_sent_sms : tL_smsjobs$TL_smsjobs_status.recent_remains;
        LimitPreviewView limitPreviewView = this.limitPreviewView;
        if (limitPreviewView != null) {
            limitPreviewView.setStatus(i3, i3 + i4, z);
        }
        TableView tableView = this.table;
        if (tableView != null) {
            tableView.update(z);
        }
        if (state == 2) {
            SMSJobController.getInstance(this.currentAccount).checkSelectedSIMCard();
            formatString = LocaleController.getString(2131695880);
            i2 = 2131695881;
        } else {
            if (state != 1) {
                if (tL_smsjobs$TL_smsjobs_status != null && i3 >= i3 + i4) {
                    formatString = LocaleController.formatString(2131695874, Integer.valueOf(i3));
                    i = 2131695875;
                } else {
                    if (i3 != 0) {
                        formatString = LocaleController.formatString(2131695882, Integer.valueOf(i3), Integer.valueOf(i3 + i4));
                        formatPluralString = LocaleController.formatPluralString("SmsStatusSendingSubtitle", i4, new Object[0]);
                        replaceTags = AndroidUtilities.replaceTags(formatPluralString);
                        configureHeader(formatString, replaceTags, this.aboveTitleView, this.underTitleView);
                    }
                    formatString = LocaleController.getString(2131695876);
                    i = 2131695877;
                }
                formatPluralString = LocaleController.getString(i);
                replaceTags = AndroidUtilities.replaceTags(formatPluralString);
                configureHeader(formatString, replaceTags, this.aboveTitleView, this.underTitleView);
            }
            if (getParentActivity() != null && Build.VERSION.SDK_INT >= 23) {
                checkSelfPermission = getParentActivity().checkSelfPermission("android.permission.SEND_SMS");
                if (checkSelfPermission == 0) {
                    checkSelfPermission2 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE");
                    if (checkSelfPermission2 == 0) {
                        checkSelfPermission3 = getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS");
                        if (checkSelfPermission3 == 0) {
                            SMSJobController.getInstance(this.currentAccount).checkSelectedSIMCard();
                            if (SMSJobController.getInstance(this.currentAccount).getSelectedSIM() == null) {
                                SMSJobController.getInstance(this.currentAccount).setState(2);
                                update(true);
                                new AlertDialog.Builder(getContext(), getResourceProvider()).setTitle(LocaleController.getString(2131695857)).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(2131695856))).setPositiveButton(LocaleController.getString(2131694057), null).show();
                                return;
                            }
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_smsjobs$TL_smsjobs_join(), new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                                    SMSStatsActivity.this.lambda$update$9(tLObject, tLRPC$TL_error);
                                }
                            });
                        }
                    }
                }
            }
            formatString = LocaleController.getString(2131695878);
            i2 = 2131695879;
        }
        replaceTags = LocaleController.getString(i2);
        configureHeader(formatString, replaceTags, this.aboveTitleView, this.underTitleView);
    }

    private void updateHeader() {
        LimitPreviewView limitPreviewView = new LimitPreviewView(getContext(), 2131231548, 0, 0, this.resourceProvider);
        this.limitPreviewView = limitPreviewView;
        limitPreviewView.isStatistic = true;
        limitPreviewView.setDarkGradientProvider(new LimitPreviewView.DarkGradientProvider() {
            @Override
            public final Paint setDarkGradientLocation(float f, float f2) {
                return SMSStatsActivity.this.setDarkGradientLocation(f, f2);
            }
        });
        this.aboveTitleView = new FrameLayout(getContext()) {
            {
                addView(SMSStatsActivity.this.limitPreviewView, LayoutHelper.createFrame(-1, -2.0f, 0, 8.0f, 60.0f, 8.0f, 33.0f));
            }
        };
        this.underTitleView = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.errorChipTextView = textView;
        textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(30.0f), Theme.multAlpha(-1, 0.2f)));
        this.errorChipTextView.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f));
        this.errorChipTextView.setTextColor(-1);
        this.errorChipTextView.setText(LocaleController.getString(2131695831));
        this.errorChipTextView.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        this.errorChipTextView.setGravity(17);
        Drawable mutate = getContext().getResources().getDrawable(2131231177).mutate();
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.errorChipTextView.setCompoundDrawables(mutate, null, null, null);
        this.underTitleView.addView(this.errorChipTextView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
        if (isAirplaneMode(getContext())) {
            this.underTitleView.setPadding(0, AndroidUtilities.dp(12.0f), 0, 0);
            this.errorChipTextView.setVisibility(0);
        } else {
            this.underTitleView.setPadding(0, 0, 0, 0);
            TextView textView2 = this.errorChipTextView;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        update(false);
    }

    @Override
    protected RecyclerView.Adapter createAdapter() {
        return this.adapter;
    }

    @Override
    public View createView(final Context context) {
        View createView = super.createView(context);
        updateHeader();
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                SMSStatsActivity.this.lambda$createView$6(context, view, i);
            }
        });
        AndroidUtilities.cancelRunOnUIThread(this.checkAirplaneMode);
        AndroidUtilities.runOnUIThread(this.checkAirplaneMode, 1200L);
        return createView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.smsJobStatusUpdate) {
            updateItems();
            update(true);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.smsJobStatusUpdate);
        SMSJobController.getInstance(this.currentAccount).init();
        SMSJobController.getInstance(this.currentAccount).atStatisticsPage = true;
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        AndroidUtilities.cancelRunOnUIThread(this.checkAirplaneMode);
        getNotificationCenter().removeObserver(this, NotificationCenter.smsJobStatusUpdate);
        SMSJobController.getInstance(this.currentAccount).atStatisticsPage = false;
        super.onFragmentDestroy();
    }

    public void updateItems() {
        int simsCount;
        int state = SMSJobController.getInstance(this.currentAccount).getState();
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        this.items.add(new Item(0));
        this.items.add(new Item(1));
        this.items.add(Item.asShadow(null));
        this.items.add(Item.asButton(1, 2131231270, LocaleController.getString(2131695896)));
        this.items.add(Item.asButton(2, 2131231280, LocaleController.getString(2131695869)));
        if (state == 3 && !SMSJobController.getInstance(this.currentAccount).journal.isEmpty()) {
            this.items.add(Item.asButton(5, 2131231299, LocaleController.getString(2131695842)).setError(SMSJobController.getInstance(this.currentAccount).hasError()));
        }
        if (state == 3 && ((simsCount = SMSJobController.getInstance(this.currentAccount).simsCount()) > 1 || (simsCount == 1 && Build.VERSION.SDK_INT < 22))) {
            this.items.add(Item.asButton(4, 2131231303, LocaleController.getString(2131695830)));
        }
        this.items.add(Item.asShadow(null));
        this.items.add(Item.asSwitch(3, LocaleController.getString(2131695832)));
        this.items.add(Item.asShadow(LocaleController.getString(2131695835)));
        if (state != 0) {
            this.items.add(Item.asButton(6, 0, LocaleController.getString(2131695836)).makeRed());
        }
        this.items.add(Item.asShadow(null));
        AdapterWithDiffUtils adapterWithDiffUtils = this.adapter;
        if (adapterWithDiffUtils != null) {
            adapterWithDiffUtils.setItems(this.oldItems, this.items);
        }
    }
}
