package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.CacheChart;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.IntSeekBarAccessibilityDelegate;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ThanosEffect;

public final class LiteModeSettingsActivity extends BaseFragment {
    public int FLAGS_CHAT;
    public Adapter adapter;
    public FrameLayout contentView;
    public final boolean[] expanded;
    public final ArrayList items;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public final ArrayList oldItems;
    public final PollItemMenu$$ExternalSyntheticLambda14 onPowerAppliedChange;
    public Bulletin restrictBulletin;

    public final class Adapter extends AdapterWithDiffUtils {
        public final int $r8$classId;
        public final Object this$0;

        public final class AnonymousClass1 extends TextInfoPrivacyCell {
            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setEnabled(true);
            }

            @Override
            public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setContentDescription(getTextView().getText());
                setContentDescription(getTextView().getText());
            }
        }

        public Adapter(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final int getItemCount() {
            switch (this.$r8$classId) {
                case 0:
                    return ((LiteModeSettingsActivity) this.this$0).items.size();
                default:
                    return ((DataUsage2Activity.ListView) this.this$0).itemInners.size();
            }
        }

        @Override
        public final int getItemViewType(int i) {
            switch (this.$r8$classId) {
                case 0:
                    if (i >= 0) {
                        LiteModeSettingsActivity liteModeSettingsActivity = (LiteModeSettingsActivity) this.this$0;
                        if (i < liteModeSettingsActivity.items.size()) {
                            return ((Item) liteModeSettingsActivity.items.get(i)).viewType;
                        }
                    }
                    return 2;
                default:
                    return ((DataUsage2Activity.ItemInner) ((DataUsage2Activity.ListView) this.this$0).itemInners.get(i)).viewType;
            }
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            switch (this.$r8$classId) {
                case 0:
                    int i = viewHolder.mItemViewType;
                    return i == 4 || i == 3 || i == 5;
                default:
                    DataUsage2Activity.ItemInner itemInner = (DataUsage2Activity.ItemInner) ((DataUsage2Activity.ListView) this.this$0).itemInners.get(viewHolder.getAdapterPosition());
                    int i2 = itemInner.viewType;
                    return i2 == 5 || (i2 == 2 && itemInner.index != -1);
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            Boolean boolValueOf;
            switch (this.$r8$classId) {
                case 0:
                    if (i >= 0) {
                        ArrayList arrayList = ((LiteModeSettingsActivity) this.this$0).items;
                        if (i < arrayList.size()) {
                            Item item = (Item) arrayList.get(i);
                            int i2 = viewHolder.mItemViewType;
                            View view = viewHolder.itemView;
                            if (i2 == 0) {
                                ((HeaderCell) view).setText(item.text);
                            } else if (i2 == 1) {
                                ((PowerSaverSlider) view).update();
                            } else if (i2 == 2) {
                                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                                if (TextUtils.isEmpty(item.text)) {
                                    textInfoPrivacyCell.setFixedSize(12);
                                } else {
                                    textInfoPrivacyCell.setFixedSize(0);
                                }
                                String str = item.text;
                                textInfoPrivacyCell.setText(str);
                                textInfoPrivacyCell.setContentDescription(str);
                                textInfoPrivacyCell.setBackground(null);
                            } else if (i2 == 3 || i2 == 4) {
                                int i3 = i + 1;
                                boolean z = i3 < arrayList.size() && ((Item) arrayList.get(i3)).viewType != 2;
                                SwitchCell switchCell = (SwitchCell) view;
                                switchCell.getClass();
                                int i4 = item.viewType;
                                Switch r5 = switchCell.switchView;
                                ImageView imageView = switchCell.arrowView;
                                AnimatedTextView animatedTextView = switchCell.countTextView;
                                ImageView imageView2 = switchCell.imageView;
                                CheckBox2 checkBox2 = switchCell.checkBoxView;
                                ArticleViewer.AnonymousClass9 anonymousClass9 = switchCell.textView;
                                String str2 = item.text;
                                int i5 = item.flags;
                                if (i4 == 3) {
                                    checkBox2.setVisibility(8);
                                    imageView2.setVisibility(0);
                                    imageView2.setImageResource(item.iconResId);
                                    anonymousClass9.setText(str2);
                                    boolean z2 = Integer.bitCount(i5) > 1;
                                    switchCell.containing = z2;
                                    if (z2) {
                                        switchCell.updateCount(item, false);
                                        animatedTextView.setVisibility(0);
                                        imageView.setVisibility(0);
                                    } else {
                                        animatedTextView.setVisibility(8);
                                        imageView.setVisibility(8);
                                    }
                                    anonymousClass9.setTranslationX(0.0f);
                                    r5.setVisibility(0);
                                    r5.setChecked(r5.drawIconType, LiteMode.isEnabled(i5), false);
                                    switchCell.needLine = Integer.bitCount(i5) > 1;
                                } else {
                                    checkBox2.setVisibility(0);
                                    checkBox2.checkBoxBase.setChecked(-1, LiteMode.isEnabled(i5), false);
                                    imageView2.setVisibility(8);
                                    r5.setVisibility(8);
                                    animatedTextView.setVisibility(8);
                                    imageView.setVisibility(8);
                                    anonymousClass9.setText(str2);
                                    anonymousClass9.setTranslationX(AndroidUtilities.dp(41.0f) * (LocaleController.isRTL ? -2.2f : 1.0f));
                                    switchCell.containing = false;
                                    switchCell.needLine = false;
                                }
                                ((ViewGroup.MarginLayoutParams) switchCell.textViewLayout.getLayoutParams()).rightMargin = AndroidUtilities.dp(item.viewType == 3 ? (LocaleController.isRTL ? 64 : 75) + 4 : 8.0f);
                                switchCell.needDivider = z;
                                switchCell.setWillNotDraw((z || switchCell.needLine) ? false : true);
                                switchCell.setDisabled(LiteMode.isPowerSaverApplied(), false);
                            } else if (i2 == 5) {
                                TextCell textCell = (TextCell) view;
                                if (item.type == 1) {
                                    textCell.setTextAndCheck(item.text, MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), false);
                                }
                            }
                            break;
                        }
                    }
                    break;
                default:
                    DataUsage2Activity.ListView listView = (DataUsage2Activity.ListView) this.this$0;
                    DataUsage2Activity.ItemInner itemInner = (DataUsage2Activity.ItemInner) listView.itemInners.get(viewHolder.getAdapterPosition());
                    int i6 = viewHolder.mItemViewType;
                    View view2 = viewHolder.itemView;
                    if (i6 == 0) {
                        CacheChart cacheChart = (CacheChart) view2;
                        if (listView.segments != null) {
                            cacheChart.setSegments(listView.totalSize, listView.animateChart, listView.chartSegments);
                        }
                        listView.animateChart = false;
                    } else if (i6 == 1) {
                        ((DataUsage2Activity.SubtitleCell) view2).textView.setText(itemInner.text);
                    } else if (i6 == 2) {
                        DataUsage2Activity.Cell cell = (DataUsage2Activity.Cell) view2;
                        int i7 = itemInner.imageColorTop;
                        int i8 = i + 1;
                        boolean z3 = i8 < getItemCount() && ((DataUsage2Activity.ItemInner) listView.itemInners.get(i8)).viewType == i6;
                        ImageView imageView3 = cell.imageView;
                        int i9 = itemInner.imageResId;
                        if (i9 == 0) {
                            imageView3.setVisibility(8);
                        } else {
                            imageView3.setVisibility(0);
                            boolean zIsDark = Theme.currentTheme.isDark();
                            SettingsActivity.SettingCell.Background background = new SettingsActivity.SettingCell.Background();
                            background.setColor(i7, itemInner.imageColorBottom);
                            background.border = zIsDark;
                            imageView3.setBackground(background);
                            imageView3.setImageResource(i9);
                        }
                        cell.textView.setText(itemInner.text);
                        cell.valueTextView.setText(itemInner.valueText);
                        cell.divider = z3;
                        cell.setWillNotDraw(!z3);
                        int i10 = itemInner.index;
                        if (i10 >= 0) {
                            DataUsage2Activity.ListView.Size[] sizeArr = listView.segments;
                            if (i10 >= sizeArr.length || sizeArr[i10].size > 0) {
                                boolValueOf = Boolean.valueOf(listView.collapsed[i10]);
                            } else {
                                boolValueOf = null;
                            }
                        } else {
                            boolValueOf = null;
                        }
                        cell.setArrow(boolValueOf);
                    } else if (i6 == 3) {
                        ((TextInfoPrivacyCell) view2).setText(itemInner.text);
                    } else if (i6 == 4) {
                        ((HeaderCell) view2).setText(itemInner.text);
                    } else if (i6 == 5) {
                        ((TextCell) view2).setText(itemInner.text.toString(), false);
                    } else if (i6 == 6) {
                        ((DataUsage2Activity.RoundingCell) view2).setTop(true);
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View subtitleCell;
            View textInfoPrivacyCell;
            View switchCell = null;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    Context context = viewGroup.getContext();
                    if (i == 0) {
                        switchCell = new HeaderCell(context);
                    } else {
                        LiteModeSettingsActivity liteModeSettingsActivity = (LiteModeSettingsActivity) obj;
                        if (i == 1) {
                            switchCell = liteModeSettingsActivity.new PowerSaverSlider(context);
                        } else if (i == 2) {
                            switchCell = new AnonymousClass1(context, 24, null);
                        } else if (i == 3 || i == 4) {
                            switchCell = liteModeSettingsActivity.new SwitchCell(context);
                        } else if (i == 5) {
                            switchCell = new TextCell(23, context, null, false, true);
                        }
                    }
                    return new RecyclerListView.Holder(switchCell);
                default:
                    DataUsage2Activity.ListView listView = (DataUsage2Activity.ListView) obj;
                    if (i != 0) {
                        if (i == 1) {
                            subtitleCell = new DataUsage2Activity.SubtitleCell(DataUsage2Activity.this, listView.getContext());
                            subtitleCell.setTag(-33024);
                        } else if (i == 3) {
                            textInfoPrivacyCell = new TextInfoPrivacyCell(listView.getContext(), 24, null);
                        } else if (i == 4) {
                            HeaderCell headerCell = new HeaderCell(listView.getContext());
                            headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, listView.resourcesProvider));
                            textInfoPrivacyCell = headerCell;
                        } else if (i == 5) {
                            TextCell textCell = new TextCell(listView.getContext());
                            int i2 = Theme.key_text_RedRegular;
                            Theme.ResourcesProvider resourcesProvider = listView.resourcesProvider;
                            textCell.setTextColor(Theme.getColor(i2, resourcesProvider));
                            textCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                            textInfoPrivacyCell = textCell;
                        } else if (i == 6) {
                            textInfoPrivacyCell = new DataUsage2Activity.RoundingCell(listView.getContext());
                        } else if (i != 7) {
                            textInfoPrivacyCell = new DataUsage2Activity.Cell(DataUsage2Activity.this, listView.getContext());
                        } else {
                            PaymentFormActivity.AnonymousClass2 anonymousClass2 = new PaymentFormActivity.AnonymousClass2(listView.getContext(), 14);
                            int i3 = Theme.key_windowBackgroundWhite;
                            int i4 = DataUsage2Activity.ListView.$r8$clinit;
                            anonymousClass2.setBackgroundColor(Theme.getColor(i3, listView.resourcesProvider));
                            textInfoPrivacyCell = anonymousClass2;
                        }
                        return new RecyclerListView.Holder(textInfoPrivacyCell);
                    }
                    final Context context2 = listView.getContext();
                    final int[] iArr = DataUsage2Activity.colors;
                    final int length = iArr.length;
                    final int[] iArr2 = DataUsage2Activity.particles;
                    ?? r0 = new CacheChart(context2, length, iArr, iArr2) {
                        @Override
                        public final int heightDp() {
                            return 216;
                        }

                        @Override
                        public final void onSectionDown(int i5, boolean z) {
                            int i6;
                            DataUsage2Activity.ListView listView2 = (DataUsage2Activity.ListView) this.this$2.this$0;
                            if (!z) {
                                listView2.removeHighlightRow();
                                return;
                            }
                            if (i5 < 0 || i5 >= listView2.segments.length) {
                                return;
                            }
                            int i7 = 0;
                            while (true) {
                                DataUsage2Activity.ListView.Size[] sizeArr = listView2.segments;
                                i6 = -1;
                                if (i7 >= sizeArr.length) {
                                    i7 = -1;
                                    break;
                                } else if (sizeArr[i7].index == i5) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                            for (int i8 = 0; i8 < listView2.itemInners.size(); i8++) {
                                DataUsage2Activity.ItemInner itemInner = (DataUsage2Activity.ItemInner) listView2.itemInners.get(i8);
                                if (itemInner != null && itemInner.viewType == 2 && itemInner.index == i7) {
                                    i6 = i8;
                                    break;
                                }
                            }
                            if (i6 >= 0) {
                                listView2.highlightRowInternal(new LogoutActivity$$ExternalSyntheticLambda1(i6, 3), 0, true);
                            } else {
                                listView2.removeHighlightRow();
                            }
                        }

                        @Override
                        public final int padInsideDp() {
                            return 10;
                        }
                    };
                    listView.chart = r0;
                    r0.setInterceptTouch(false);
                    subtitleCell = listView.chart;
                    subtitleCell.setTag(-33024);
                    textInfoPrivacyCell = subtitleCell;
                    return new RecyclerListView.Holder(textInfoPrivacyCell);
            }
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final int flags;
        public final int iconResId;
        public final String text;
        public final int type;

        public Item(String str, int i, int i2, int i3, int i4) {
            super(i, false);
            this.text = str;
            this.iconResId = i2;
            this.flags = i3;
            this.type = i4;
        }

        public static Item asCheckbox(int i, String str) {
            return new Item(str, 4, 0, i, 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            int i = item.viewType;
            int i2 = this.viewType;
            if (i != i2) {
                return false;
            }
            if (i2 == 3 && item.iconResId != this.iconResId) {
                return false;
            }
            if (i2 == 5 && item.type != this.type) {
                return false;
            }
            if ((i2 == 3 || i2 == 4) && item.flags != this.flags) {
                return false;
            }
            return !(i2 == 0 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) || TextUtils.equals(item.text, this.text);
        }
    }

    public final class PowerSaverSlider extends FrameLayout {
        public final BatteryDrawable batteryIcon;
        public final SpannableStringBuilder batteryText;
        public final CheckBoxCell.AnonymousClass1 headerOnView;
        public boolean headerOnVisible;
        public final TextView leftTextView;
        public final CheckBoxCell.AnonymousClass1 middleTextView;
        public ValueAnimator offActiveAnimator;
        public float offActiveT;
        public ValueAnimator onActiveAnimator;
        public float onActiveT;
        public final TextView rightTextView;
        public final AnonymousClass4 seekBarAccessibilityDelegate;
        public final SeekBarView seekBarView;

        public final class AnonymousClass4 extends IntSeekBarAccessibilityDelegate {
            public AnonymousClass4() {
            }

            @Override
            public final int getDelta() {
                return 5;
            }

            @Override
            public final int getMaxValue() {
                return 100;
            }

            @Override
            public final int getProgress() {
                return LiteMode.getPowerSaverLevel();
            }

            @Override
            public final void onInitializeAccessibilityNodeInfoInternal(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfoInternal(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setEnabled(true);
            }

            @Override
            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
                StringBuilder sb = new StringBuilder(LocaleController.getString(R.string.LiteBatteryTitle));
                sb.append(", ");
                int powerSaverLevel = LiteMode.getPowerSaverLevel();
                if (powerSaverLevel <= 0) {
                    sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled));
                } else if (powerSaverLevel >= 100) {
                    sb.append(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled));
                } else {
                    sb.append(LocaleController.formatString(R.string.AccDescrLiteBatteryWhenBelow, Integer.valueOf(Math.round(powerSaverLevel))));
                }
                accessibilityEvent.setContentDescription(sb);
                PowerSaverSlider.this.setContentDescription(sb);
            }

            @Override
            public final void setProgress(int i) {
                PowerSaverSlider powerSaverSlider = PowerSaverSlider.this;
                float f = i / 100.0f;
                powerSaverSlider.seekBarView.delegate.onSeekBarDrag(f, true);
                powerSaverSlider.seekBarView.setProgress(f);
            }
        }

        public PowerSaverSlider(Context context) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            linearLayout.setImportantForAccessibility(4);
            TextView textView = new TextView(context);
            zzkk.m(15.0f, 1, textView);
            int i = Theme.key_windowBackgroundWhiteBlueHeader;
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            textView.setText(LocaleController.getString("LiteBatteryTitle"));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 16));
            CheckBoxCell.AnonymousClass1 anonymousClass1 = new CheckBoxCell.AnonymousClass1(context);
            this.headerOnView = anonymousClass1;
            anonymousClass1.setTypeface(AndroidUtilities.bold());
            anonymousClass1.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
            anonymousClass1.setTextSize(AndroidUtilities.dp(12.0f));
            anonymousClass1.setTextColor(Theme.getColor(null, i, false));
            linearLayout.addView(anonymousClass1, LayoutHelper.createLinear(-2, 17, 16, 6, 1, 0, 0));
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
            SeekBarView seekBarView = new SeekBarView(context, null, true);
            this.seekBarView = seekBarView;
            seekBarView.setReportChanges(true);
            seekBarView.setDelegate(new ChatActivity.AnonymousClass1(this, 29));
            seekBarView.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
            seekBarView.setImportantForAccessibility(2);
            addView(seekBarView, LayoutHelper.createFrame(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setImportantForAccessibility(4);
            TextView textView2 = new TextView(context);
            this.leftTextView = textView2;
            textView2.setTextSize(1, 13.0f);
            int i2 = Theme.key_windowBackgroundWhiteGrayText;
            zzkr.m(i2, textView2, 3);
            textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
            frameLayout.addView(textView2, LayoutHelper.createFrame(-2, -2, 19));
            CheckBoxCell.AnonymousClass1 anonymousClass2 = new CheckBoxCell.AnonymousClass1(this, context);
            this.middleTextView = anonymousClass2;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = anonymousClass2.drawable;
            animatedTextDrawable.moveAmplitude = 0.45f;
            animatedTextDrawable.animateDuration = 240L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            anonymousClass2.setGravity(1);
            anonymousClass2.setTextSize(AndroidUtilities.dp(13.0f));
            anonymousClass2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false));
            frameLayout.addView(anonymousClass2, LayoutHelper.createFrame(-2, -2, 17));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
            this.batteryText = spannableStringBuilder;
            BatteryDrawable batteryDrawable = new BatteryDrawable();
            this.batteryIcon = batteryDrawable;
            batteryDrawable.paintReference = anonymousClass2.getPaint();
            batteryDrawable.translateY = AndroidUtilities.dp(1.5f);
            batteryDrawable.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
            spannableStringBuilder.setSpan(new ImageSpan(batteryDrawable, 0), 0, spannableStringBuilder.length(), 33);
            TextView textView3 = new TextView(context);
            this.rightTextView = textView3;
            textView3.setTextSize(1, 13.0f);
            zzkr.m(i2, textView3, 5);
            textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, -2, 21));
            addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
            this.seekBarAccessibilityDelegate = new AnonymousClass4();
            update();
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            this.seekBarAccessibilityDelegate.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
        }

        @Override
        public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(accessibilityEvent);
            this.seekBarAccessibilityDelegate.onPopulateAccessibilityEvent(this, accessibilityEvent);
        }

        @Override
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            return this.seekBarAccessibilityDelegate.performAccessibilityAction(this, i, bundle);
        }

        public final void update() {
            final int i = 0;
            final int i2 = 1;
            int powerSaverLevel = LiteMode.getPowerSaverLevel();
            CheckBoxCell.AnonymousClass1 anonymousClass1 = this.middleTextView;
            ValueAnimator valueAnimator = anonymousClass1.drawable.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (powerSaverLevel <= 0) {
                anonymousClass1.setText(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
            } else if (powerSaverLevel >= 100) {
                anonymousClass1.setText(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
            } else {
                float f = powerSaverLevel;
                this.batteryIcon.setFillValue(f / 100.0f, true);
                anonymousClass1.setText(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f))), this.batteryText)), !LocaleController.isRTL, true);
            }
            String upperCase = LocaleController.getString(LiteMode.isPowerSaverApplied() ? R.string.LiteBatteryEnabled : R.string.LiteBatteryDisabled).toUpperCase();
            CheckBoxCell.AnonymousClass1 anonymousClass2 = this.headerOnView;
            anonymousClass2.setText(upperCase);
            boolean z = powerSaverLevel > 0 && powerSaverLevel < 100;
            if (z != this.headerOnVisible) {
                this.headerOnVisible = z;
                anonymousClass2.clearAnimation();
                OKLCH.m(anonymousClass2.animate().alpha(z ? 1.0f : 0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 220L);
            }
            final float f2 = powerSaverLevel >= 100 ? 1.0f : 0.0f;
            if (this.onActiveT != f2) {
                this.onActiveT = f2;
                ValueAnimator valueAnimator2 = this.onActiveAnimator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                    this.onActiveAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.onActiveT, f2);
                this.onActiveAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final LiteModeSettingsActivity.PowerSaverSlider f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        switch (i) {
                            case 0:
                                LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider = this.f$0;
                                TextView textView = powerSaverSlider.rightTextView;
                                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float fFloatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                powerSaverSlider.onActiveT = fFloatValue;
                                textView.setTextColor(ColorUtils.blendARGB(fFloatValue, color, color2));
                                break;
                            default:
                                LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider2 = this.f$0;
                                TextView textView2 = powerSaverSlider2.leftTextView;
                                int color3 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color4 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float fFloatValue2 = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                                powerSaverSlider2.offActiveT = fFloatValue2;
                                textView2.setTextColor(ColorUtils.blendARGB(fFloatValue2, color3, color4));
                                break;
                        }
                    }
                });
                this.onActiveAnimator.addListener(new AnimatorListenerAdapter(this) {
                    public final PowerSaverSlider this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i) {
                            case 0:
                                PowerSaverSlider powerSaverSlider = this.this$1;
                                TextView textView = powerSaverSlider.rightTextView;
                                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float f3 = f2;
                                powerSaverSlider.onActiveT = f3;
                                textView.setTextColor(ColorUtils.blendARGB(f3, color, color2));
                                break;
                            default:
                                PowerSaverSlider powerSaverSlider2 = this.this$1;
                                TextView textView2 = powerSaverSlider2.leftTextView;
                                int color3 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color4 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float f4 = f2;
                                powerSaverSlider2.offActiveT = f4;
                                textView2.setTextColor(ColorUtils.blendARGB(f4, color3, color4));
                                break;
                        }
                    }
                });
                this.onActiveAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.onActiveAnimator.setDuration(320L);
                this.onActiveAnimator.start();
            }
            final float f3 = powerSaverLevel <= 0 ? 1.0f : 0.0f;
            if (this.offActiveT != f3) {
                this.offActiveT = f3;
                ValueAnimator valueAnimator3 = this.offActiveAnimator;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                    this.offActiveAnimator = null;
                }
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.offActiveT, f3);
                this.offActiveAnimator = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                    public final LiteModeSettingsActivity.PowerSaverSlider f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        switch (i2) {
                            case 0:
                                LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider = this.f$0;
                                TextView textView = powerSaverSlider.rightTextView;
                                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float fFloatValue = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                                powerSaverSlider.onActiveT = fFloatValue;
                                textView.setTextColor(ColorUtils.blendARGB(fFloatValue, color, color2));
                                break;
                            default:
                                LiteModeSettingsActivity.PowerSaverSlider powerSaverSlider2 = this.f$0;
                                TextView textView2 = powerSaverSlider2.leftTextView;
                                int color3 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color4 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float fFloatValue2 = ((Float) valueAnimator4.getAnimatedValue()).floatValue();
                                powerSaverSlider2.offActiveT = fFloatValue2;
                                textView2.setTextColor(ColorUtils.blendARGB(fFloatValue2, color3, color4));
                                break;
                        }
                    }
                });
                this.offActiveAnimator.addListener(new AnimatorListenerAdapter(this) {
                    public final PowerSaverSlider this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                PowerSaverSlider powerSaverSlider = this.this$1;
                                TextView textView = powerSaverSlider.rightTextView;
                                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color2 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float f4 = f3;
                                powerSaverSlider.onActiveT = f4;
                                textView.setTextColor(ColorUtils.blendARGB(f4, color, color2));
                                break;
                            default:
                                PowerSaverSlider powerSaverSlider2 = this.this$1;
                                TextView textView2 = powerSaverSlider2.leftTextView;
                                int color3 = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false);
                                int color4 = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText, false);
                                float f5 = f3;
                                powerSaverSlider2.offActiveT = f5;
                                textView2.setTextColor(ColorUtils.blendARGB(f5, color3, color4));
                                break;
                        }
                    }
                });
                this.offActiveAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.offActiveAnimator.setDuration(320L);
                this.offActiveAnimator.start();
            }
        }
    }

    public final class SwitchCell extends FrameLayout {
        public int all;
        public final ImageView arrowView;
        public final CheckBox2 checkBoxView;
        public boolean containing;
        public final AnimatedTextView countTextView;
        public boolean disabled;
        public int enabled;
        public final ImageView imageView;
        public boolean needDivider;
        public boolean needLine;
        public final Switch switchView;
        public final ArticleViewer.AnonymousClass9 textView;
        public final LinearLayout textViewLayout;

        public SwitchCell(Context context) {
            super(context);
            setImportantForAccessibility(1);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            imageView.setVisibility(8);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 20.0f, 0.0f, 20.0f, 0.0f));
            ArticleViewer.AnonymousClass9 anonymousClass9 = new ArticleViewer.AnonymousClass9(context, 16);
            this.textView = anonymousClass9;
            anonymousClass9.setLines(1);
            anonymousClass9.setSingleLine(true);
            anonymousClass9.setEllipsize(TextUtils.TruncateAt.END);
            anonymousClass9.setTextSize(1, 16.0f);
            int i = Theme.key_windowBackgroundWhiteBlackText;
            anonymousClass9.setTextColor(Theme.getColor(null, i, false));
            anonymousClass9.setGravity(LocaleController.isRTL ? 5 : 3);
            anonymousClass9.setImportantForAccessibility(2);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, false, true, true);
            this.countTextView = animatedTextView;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = animatedTextView.drawable;
            animatedTextDrawable.moveAmplitude = 0.35f;
            animatedTextDrawable.animateDuration = 200L;
            animatedTextDrawable.animateWave = 1.0f;
            animatedTextDrawable.animateInterpolator = cubicBezierInterpolator;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextSize(AndroidUtilities.dp(14.0f));
            animatedTextView.setTextColor(Theme.getColor(null, i, false));
            animatedTextView.setImportantForAccessibility(2);
            ImageView imageView2 = new ImageView(context);
            this.arrowView = imageView2;
            imageView2.setVisibility(8);
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            imageView2.setImageResource(R.drawable.arrow_more);
            LinearLayout linearLayout = new LinearLayout(context);
            this.textViewLayout = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setGravity(LocaleController.isRTL ? 5 : 3);
            if (LocaleController.isRTL) {
                linearLayout.addView(imageView2, LayoutHelper.createLinear(16, 16, 0.0f, 16, 0, 0, 6, 0));
                linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 0, 0, 6, 0));
                linearLayout.addView(anonymousClass9, LayoutHelper.createLinear(-2, -2, 1.0f, 16));
            } else {
                linearLayout.addView(anonymousClass9, LayoutHelper.createLinear(-2, -2, 1.0f, 16));
                linearLayout.addView(animatedTextView, LayoutHelper.createLinear(-2, -2, 0.0f, 16, 6, 0, 0, 0));
                linearLayout.addView(imageView2, LayoutHelper.createLinear(16, 16, 0.0f, 16, 2, 0, 0, 0));
            }
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 64.0f, 0.0f, 8.0f, 0.0f));
            Switch r3 = new Switch(context, null);
            this.switchView = r3;
            r3.setVisibility(8);
            int i2 = Theme.key_switchTrack;
            int i3 = Theme.key_switchTrackChecked;
            int i4 = Theme.key_windowBackgroundWhite;
            r3.trackColorKey = i2;
            r3.trackCheckedColorKey = i3;
            r3.thumbColorKey = i4;
            r3.thumbCheckedColorKey = i4;
            r3.setImportantForAccessibility(2);
            addView(r3, LayoutHelper.createFrame(37, 50.0f, (LocaleController.isRTL ? 3 : 5) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            CheckBox2 checkBox2 = new CheckBox2(context, 21);
            this.checkBoxView = checkBox2;
            int i5 = Theme.key_radioBackgroundChecked;
            int i6 = Theme.key_checkboxDisabled;
            int i7 = Theme.key_checkboxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(i5, i6, i7);
            checkBox2.setDrawUnchecked(true);
            checkBoxBase.setChecked(-1, true, false);
            checkBox2.setDrawBackgroundAsArc(10);
            checkBox2.setVisibility(8);
            checkBox2.setImportantForAccessibility(2);
            boolean z = LocaleController.isRTL;
            addView(checkBox2, LayoutHelper.createFrame(21, 21.0f, (z ? 5 : 3) | 16, z ? 0.0f : 64.0f, 0.0f, z ? 64.0f : 0.0f, 0.0f));
            setFocusable(true);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            boolean z = LocaleController.isRTL;
            ArticleViewer.AnonymousClass9 anonymousClass9 = this.textView;
            if (z) {
                if (this.needLine) {
                    float fDp = AndroidUtilities.dp(75.0f);
                    canvas.drawRect(fDp - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, fDp, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, Theme.dividerPaint);
                }
                if (this.needDivider) {
                    canvas.drawLine((getMeasuredWidth() - AndroidUtilities.dp(64.0f)) + (anonymousClass9.getTranslationX() < 0.0f ? AndroidUtilities.dp(-32.0f) : 0), getMeasuredHeight() - 1, 0.0f, getMeasuredHeight() - 1, Theme.dividerPaint);
                    return;
                }
                return;
            }
            if (this.needLine) {
                float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(75.0f);
                canvas.drawRect(measuredWidth - AndroidUtilities.dp(0.66f), (getMeasuredHeight() - AndroidUtilities.dp(20.0f)) / 2.0f, measuredWidth, (AndroidUtilities.dp(20.0f) + getMeasuredHeight()) / 2.0f, Theme.dividerPaint);
            }
            if (this.needDivider) {
                canvas.drawLine(anonymousClass9.getTranslationX() + AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            CheckBox2 checkBox2 = this.checkBoxView;
            accessibilityNodeInfo.setClassName(checkBox2.getVisibility() == 0 ? "android.widget.CheckBox" : "android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setEnabled(true);
            if (checkBox2.getVisibility() == 0) {
                accessibilityNodeInfo.setChecked(checkBox2.checkBoxBase.isChecked);
            } else {
                accessibilityNodeInfo.setChecked(this.switchView.isChecked);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.textView.getText());
            if (this.containing) {
                sb.append('\n');
                sb.append(LocaleController.formatString("Of", R.string.Of, Integer.valueOf(this.enabled), Integer.valueOf(this.all)));
            }
            accessibilityNodeInfo.setContentDescription(sb);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public final int preprocessFlagsCount(int i) {
            boolean zIsPremium = LiteModeSettingsActivity.this.getUserConfig().isPremium();
            int iBitCount = Integer.bitCount(i);
            if (zIsPremium) {
                if ((i & 4096) > 0) {
                    iBitCount--;
                }
                if ((i & 8192) > 0) {
                    iBitCount--;
                }
                if ((i & 16384) > 0) {
                    iBitCount--;
                }
            } else {
                if ((i & 16) > 0) {
                    iBitCount--;
                }
                if ((i & 8) > 0) {
                    iBitCount--;
                }
                if ((i & 4) > 0) {
                    iBitCount--;
                }
            }
            if (SharedConfig.getDevicePerformanceClass() < 1 && (i & 256) > 0) {
                iBitCount--;
            }
            if ((Build.VERSION.SDK_INT < 33 || (SharedConfig.getDevicePerformanceClass() < 1 && !BuildVars.DEBUG_PRIVATE_VERSION)) && (262144 & i) > 0) {
                iBitCount--;
            }
            return (ThanosEffect.supports() || (i & 65536) <= 0) ? iBitCount : iBitCount - 1;
        }

        public final void setDisabled(boolean z, boolean z2) {
            if (this.disabled != z) {
                this.disabled = z;
                CheckBox2 checkBox2 = this.checkBoxView;
                Switch r1 = this.switchView;
                LinearLayout linearLayout = this.textViewLayout;
                ImageView imageView = this.imageView;
                if (z2) {
                    OKLCH.m(imageView.animate(), z ? 0.5f : 1.0f, 220L);
                    OKLCH.m(linearLayout.animate(), z ? 0.5f : 1.0f, 220L);
                    OKLCH.m(r1.animate(), z ? 0.5f : 1.0f, 220L);
                    OKLCH.m(checkBox2.animate(), z ? 0.5f : 1.0f, 220L);
                } else {
                    imageView.setAlpha(z ? 0.5f : 1.0f);
                    linearLayout.setAlpha(z ? 0.5f : 1.0f);
                    r1.setAlpha(z ? 0.5f : 1.0f);
                    checkBox2.setAlpha(z ? 0.5f : 1.0f);
                }
                setEnabled(!z);
            }
        }

        public final void updateCount(Item item, boolean z) {
            int value = LiteMode.getValue(true);
            int i = item.flags;
            this.enabled = preprocessFlagsCount(value & i);
            this.all = preprocessFlagsCount(i);
            AnimatedTextView animatedTextView = this.countTextView;
            boolean z2 = false;
            String str = String.format("%d/%d", Integer.valueOf(this.enabled), Integer.valueOf(this.all));
            if (z && !LocaleController.isRTL) {
                z2 = true;
            }
            animatedTextView.setText(str, z2, true);
        }
    }

    public LiteModeSettingsActivity() {
        super(null);
        this.onPowerAppliedChange = new PollItemMenu$$ExternalSyntheticLambda14(this, 17);
        this.expanded = new boolean[3];
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PowerUsage));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 29));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.contentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        RecyclerListView recyclerListView3 = this.listView;
        Adapter adapter = new Adapter(this, 0);
        this.adapter = adapter;
        recyclerListView3.setAdapter(adapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        this.contentView.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda115(this, 3));
        this.fragmentView = this.contentView;
        this.FLAGS_CHAT = AndroidUtilities.isTablet() ? 360864 : 360928;
        updateItems$2();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onBecomeFullyHidden() {
        super.onBecomeFullyHidden();
        LiteMode.removeOnPowerSaverAppliedListener(this.onPowerAppliedChange);
    }

    @Override
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        LiteMode.addOnPowerSaverAppliedListener(this.onPowerAppliedChange);
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        LiteMode.savePreference();
        AnimatedEmojiDrawable.updateAll();
        Theme.reloadWallpaper(true);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    public final void scrollToFlags(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.items;
            if (i2 >= arrayList.size()) {
                return;
            }
            if (((Item) arrayList.get(i2)).flags == i) {
                this.listView.highlightRowInternal(new LaunchActivity$$ExternalSyntheticLambda9(this, i2, 11), 700, true);
                return;
            }
            i2++;
        }
    }

    public final void setExpanded(int i) {
        byte b;
        if (i == 3) {
            b = 0;
        } else if (i == 28700) {
            b = 1;
        } else {
            b = i == this.FLAGS_CHAT ? (byte) 2 : (byte) -1;
        }
        if (b == -1) {
            return;
        }
        this.expanded[b] = true;
        updateValues();
        updateItems$2();
    }

    public final void updateItems$2() {
        String string;
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i = Build.VERSION.SDK_INT;
        arrayList2.add(new Item(null, 1, 0, 0, 0));
        if (LiteMode.getPowerSaverLevel() <= 0) {
            string = LocaleController.getString(R.string.LiteBatteryInfoDisabled);
        } else {
            string = LiteMode.getPowerSaverLevel() >= 100 ? LocaleController.getString(R.string.LiteBatteryInfoEnabled) : LocaleController.formatString(R.string.LiteBatteryInfoBelow, String.format("%d%%", Integer.valueOf(LiteMode.getPowerSaverLevel())));
        }
        arrayList2.add(new Item(string, 2, 0, 0, 0));
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsTitle), 0, 0, 0, 0));
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsStickers), 3, R.drawable.msg2_sticker, 3, 0));
        boolean[] zArr = this.expanded;
        if (zArr[0]) {
            arrayList2.add(Item.asCheckbox(1, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(Item.asCheckbox(2, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsEmoji), 3, R.drawable.msg2_smile_status, 28700, 0));
        if (zArr[1]) {
            arrayList2.add(Item.asCheckbox(16388, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard)));
            arrayList2.add(Item.asCheckbox(8200, LocaleController.getString(R.string.LiteOptionsAutoplayReactions)));
            arrayList2.add(Item.asCheckbox(4112, LocaleController.getString(R.string.LiteOptionsAutoplayChat)));
        }
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsChat), 3, R.drawable.msg2_ask_question, this.FLAGS_CHAT, 0));
        if (zArr[2]) {
            arrayList2.add(Item.asCheckbox(32, LocaleController.getString("LiteOptionsBackground")));
            if (!AndroidUtilities.isTablet()) {
                arrayList2.add(Item.asCheckbox(64, LocaleController.getString("LiteOptionsTopics")));
            }
            arrayList2.add(Item.asCheckbox(128, LocaleController.getString("LiteOptionsSpoiler")));
            if (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION) {
                arrayList2.add(Item.asCheckbox(256, LocaleController.getString("LiteOptionsBlur2")));
            }
            if (i >= 33 && (SharedConfig.getDevicePerformanceClass() >= 1 || BuildVars.DEBUG_PRIVATE_VERSION)) {
                arrayList2.add(Item.asCheckbox(262144, LocaleController.getString("LiteOptionsLiquidGlass")));
            }
            arrayList2.add(Item.asCheckbox(32768, LocaleController.getString("LiteOptionsScale")));
            if (ThanosEffect.supports()) {
                arrayList2.add(Item.asCheckbox(65536, LocaleController.getString("LiteOptionsThanos")));
            }
        }
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsCalls), 3, R.drawable.msg2_call_earpiece, 512, 0));
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsAutoplayVideo), 3, R.drawable.msg2_videocall, 1024, 0));
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsAutoplayGifs), 3, R.drawable.msg2_gif, 2048, 0));
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteOptionsParticles), 3, R.drawable.photo_star, 131072, 0));
        arrayList2.add(new Item("", 2, 0, 0, 0));
        arrayList2.add(new Item(LocaleController.getString(R.string.LiteSmoothTransitions), 5, 0, 0, 1));
        arrayList2.add(new Item(LocaleController.getString("LiteSmoothTransitionsInfo"), 2, 0, 0, 0));
        this.adapter.setItems(arrayList, arrayList2);
    }

    public final void updateValues() {
        if (this.listView == null) {
            return;
        }
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt != null) {
                this.listView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    ArrayList arrayList = this.items;
                    if (childAdapterPosition < arrayList.size()) {
                        Item item = (Item) arrayList.get(childAdapterPosition);
                        int i2 = item.viewType;
                        if (i2 == 3 || i2 == 4) {
                            SwitchCell switchCell = (SwitchCell) childAt;
                            byte b = -1;
                            int i3 = item.flags;
                            if (i2 == 3) {
                                boolean z = Integer.bitCount(i3) > 1;
                                switchCell.containing = z;
                                if (z) {
                                    switchCell.updateCount(item, true);
                                    LiteModeSettingsActivity liteModeSettingsActivity = LiteModeSettingsActivity.this;
                                    if (i3 == 3) {
                                        b = 0;
                                    } else if (i3 == 28700) {
                                        b = 1;
                                    } else if (i3 == liteModeSettingsActivity.FLAGS_CHAT) {
                                        b = 2;
                                    }
                                    ImageView imageView = switchCell.arrowView;
                                    imageView.clearAnimation();
                                    OKLCH.m(imageView.animate().rotation((b < 0 || !liteModeSettingsActivity.expanded[b]) ? 0.0f : 180.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 240L);
                                }
                                Switch r3 = switchCell.switchView;
                                r3.setChecked(r3.drawIconType, LiteMode.isEnabled(i3), true);
                            } else {
                                switchCell.checkBoxView.checkBoxBase.setChecked(-1, LiteMode.isEnabled(i3), true);
                            }
                            switchCell.setDisabled(LiteMode.isPowerSaverApplied(), true);
                        } else if (i2 == 1) {
                            ((PowerSaverSlider) childAt).update();
                        }
                    }
                }
            }
        }
        if (this.restrictBulletin == null || LiteMode.isPowerSaverApplied()) {
            return;
        }
        this.restrictBulletin.hide();
        this.restrictBulletin = null;
    }
}
