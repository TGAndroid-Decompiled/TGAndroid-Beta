package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkg;
import com.google.android.gms.internal.mlkit_vision_common.zzlf;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditEmojiTextCell;
import org.telegram.ui.Cells.EditTextCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AnimatedColor;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimatedEmojiSpan;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.HintView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.TranslateButton;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda162;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class FilterCreateActivity extends BaseFragment {
    public ListAdapter adapter;
    public boolean creatingNew;
    public boolean doNotCloseWhenSave;
    public ActionBarMenuItem doneItem;
    public boolean excludeExpanded;
    public final MessagesController.DialogFilter filter;
    public HeaderCellColorPreview folderTagsHeader;
    public boolean hasUserChanged;
    public boolean includeExpanded;
    public final ArrayList invites;
    public final ArrayList items;
    public ChatActivity.AnonymousClass34 listView;
    public boolean loadingInvites;
    public boolean nameChangedManually;
    public ListAdapter.AnonymousClass1 nameEditTextCell;
    public HeaderCellWithRight nameHeaderCell;
    public int nameRow;
    public ArrayList newAlwaysShow;
    public boolean newFilterAnimations;
    public int newFilterColor;
    public int newFilterFlags;
    public CharSequence newFilterName;
    public ArrayList newNeverShow;
    public final LongSparseIntArray newPinned;
    public final ArrayList oldItems;
    public int requestingInvitesReqId;
    public AnonymousClass5 saveHintView;
    public float shiftDp;
    public FilterCreateActivity$$ExternalSyntheticLambda27 showBulletinOnResume;
    public boolean showedUpdateBulletin;

    public final class AnonymousClass5 extends HintView {
        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                try {
                    ((ViewGroup) getParent()).removeView(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final class ButtonCell extends FrameLayout {
        public boolean divider;
        public final ImageView imageView;
        public int lastIconResId;
        public final TextView textView;
        public Boolean translateText;

        public ButtonCell(Context context) {
            super(context);
            this.divider = true;
            this.translateText = null;
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            textView.setLines(1);
            textView.setSingleLine();
            boolean z = LocaleController.isRTL;
            textView.setPadding(z ? 24 : 0, 0, z ? 0 : 24, 0);
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z2 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, z2 ? 0.0f : 72.0f, 0.0f, z2 ? 72.0f : 0.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.divider) {
                TextView textView = this.textView;
                canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
        }
    }

    public final class ColorImageSpan extends ImageSpan {
        public int lastColor;

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            if (paint.getColor() != this.lastColor && getDrawable() != null) {
                Drawable drawable = getDrawable();
                int color = paint.getColor();
                this.lastColor = color;
                drawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.MULTIPLY));
            }
            super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
        }
    }

    public final class CreateLinkCell extends FrameLayout {
        public final ImageView imageView;
        public boolean needDivider;
        public final TextView textView;

        public CreateLinkCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            textView.setTextSize(1, 16.0f);
            textView.setText(LocaleController.getString(R.string.CreateNewLink));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z = LocaleController.isRTL;
            textView.setPadding(z ? 16 : 0, 0, z ? 0 : 16, 0);
            boolean z2 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 23, z2 ? 0.0f : 64.0f, 0.0f, z2 ? 64.0f : 0.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
            imageView.setImageDrawable(new CombinedDrawable(drawable, drawable2));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            boolean z3 = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(32, 32.0f, (z3 ? 5 : 3) | 16, z3 ? 0.0f : 16.0f, 0.0f, z3 ? 16.0f : 0.0f, 0.0f));
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                TextView textView = this.textView;
                canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(45.0f), 1073741824));
        }

        @Override
        public final void setEnabled(boolean z) {
            super.setEnabled(z);
            this.textView.setAlpha(z ? 1.0f : 0.5f);
            this.imageView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public final class FilterInvitesBottomSheet extends BottomSheetWithRecyclerListView {
        public AnonymousClass1 adapter;
        public final FrameLayout bulletinContainer;
        public final TextView button;
        public final MessagesController.DialogFilter filter;
        public final ArrayList invites;
        public final ArrayList items;
        public final ArrayList oldItems;

        public final class AnonymousClass1 extends AdapterWithDiffUtils {

            public final class C00111 extends LinkCell {
                public C00111(Context context, int i, int i2) {
                    super(context, null, i, i2);
                }

                @Override
                public final void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    FilterInvitesBottomSheet.this.invites.remove(tL_exportedChatlistInvite);
                    FilterInvitesBottomSheet filterInvitesBottomSheet = FilterInvitesBottomSheet.this;
                    TextView textView = filterInvitesBottomSheet.button;
                    ArrayList arrayList = filterInvitesBottomSheet.invites;
                    textView.setVisibility(arrayList.isEmpty() ? 0 : 8);
                    filterInvitesBottomSheet.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), arrayList.isEmpty() ? AndroidUtilities.dp(68.0f) : 0);
                    FilterInvitesBottomSheet.this.updateRows$9(true);
                }

                @Override
                public final void options() {
                    ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(FilterInvitesBottomSheet.this.container, null, this);
                    final int i = 0;
                    itemOptionsMakeOptions.add(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable(this) {
                        public final FilterCreateActivity.FilterInvitesBottomSheet.AnonymousClass1.C00111 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i) {
                                case 0:
                                    FilterCreateActivity.FilterInvitesBottomSheet.AnonymousClass1.C00111 c00111 = this.f$0;
                                    String str = c00111.lastUrl;
                                    if (str != null && AndroidUtilities.addToClipboard(str)) {
                                        new BulletinFactory(FilterCreateActivity.FilterInvitesBottomSheet.this.bulletinContainer, null).createCopyLinkBulletin(false).show();
                                    }
                                    break;
                                case 1:
                                    this.f$0.qrcode();
                                    break;
                                default:
                                    this.f$0.deleteLink();
                                    break;
                            }
                        }
                    }, false);
                    final int i2 = 1;
                    itemOptionsMakeOptions.add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new Runnable(this) {
                        public final FilterCreateActivity.FilterInvitesBottomSheet.AnonymousClass1.C00111 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    FilterCreateActivity.FilterInvitesBottomSheet.AnonymousClass1.C00111 c00111 = this.f$0;
                                    String str = c00111.lastUrl;
                                    if (str != null && AndroidUtilities.addToClipboard(str)) {
                                        new BulletinFactory(FilterCreateActivity.FilterInvitesBottomSheet.this.bulletinContainer, null).createCopyLinkBulletin(false).show();
                                    }
                                    break;
                                case 1:
                                    this.f$0.qrcode();
                                    break;
                                default:
                                    this.f$0.deleteLink();
                                    break;
                            }
                        }
                    }, false);
                    final int i3 = 2;
                    itemOptionsMakeOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new Runnable(this) {
                        public final FilterCreateActivity.FilterInvitesBottomSheet.AnonymousClass1.C00111 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    FilterCreateActivity.FilterInvitesBottomSheet.AnonymousClass1.C00111 c00111 = this.f$0;
                                    String str = c00111.lastUrl;
                                    if (str != null && AndroidUtilities.addToClipboard(str)) {
                                        new BulletinFactory(FilterCreateActivity.FilterInvitesBottomSheet.this.bulletinContainer, null).createCopyLinkBulletin(false).show();
                                    }
                                    break;
                                case 1:
                                    this.f$0.qrcode();
                                    break;
                                default:
                                    this.f$0.deleteLink();
                                    break;
                            }
                        }
                    }, true);
                    if (LocaleController.isRTL) {
                        itemOptionsMakeOptions.gravity = 3;
                    }
                    itemOptionsMakeOptions.show();
                }
            }

            public AnonymousClass1() {
            }

            @Override
            public final int getItemCount() {
                return FilterInvitesBottomSheet.this.items.size();
            }

            @Override
            public final int getItemViewType(int i) {
                return ((ItemInner) FilterInvitesBottomSheet.this.items.get(i)).viewType;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                int i = viewHolder.mItemViewType;
                return i == 8 || i == 7;
            }

            @Override
            public final void notifyDataSetChanged() {
                realAdapter().notifyDataSetChanged();
            }

            @Override
            public final void notifyItemChanged(int i) {
                realAdapter().notifyItemChanged(i + 1);
            }

            @Override
            public final void notifyItemMoved(int i, int i2) {
                realAdapter().notifyItemMoved(i + 1, i2);
            }

            @Override
            public final void notifyItemRangeChanged(int i, int i2) {
                realAdapter().notifyItemRangeChanged(i + 1, i2);
            }

            @Override
            public final void notifyItemRangeInserted(int i, int i2) {
                realAdapter().notifyItemRangeInserted(i + 1, i2);
            }

            @Override
            public final void notifyItemRangeRemoved(int i, int i2) {
                realAdapter().notifyItemRangeRemoved(i + 1, i2);
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int i2;
                int i3 = viewHolder.mItemViewType;
                FilterInvitesBottomSheet filterInvitesBottomSheet = FilterInvitesBottomSheet.this;
                ItemInner itemInner = (ItemInner) filterInvitesBottomSheet.items.get(i);
                int i4 = i + 1;
                ArrayList arrayList = filterInvitesBottomSheet.items;
                boolean z = (i4 >= arrayList.size() || (i2 = ((ItemInner) arrayList.get(i4)).viewType) == 3 || i2 == 6) ? false : true;
                View view = viewHolder.itemView;
                if (i3 == 7) {
                    ((LinkCell) view).setInvite(itemInner.link, z);
                    return;
                }
                if (i3 == 6 || i3 == 3) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i3 == 6) {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                        return;
                    } else {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText("");
                        return;
                    }
                }
                if (i3 != 0 && i3 == 8) {
                    CreateLinkCell createLinkCell = (CreateLinkCell) view;
                    createLinkCell.textView.setText(LocaleController.getString(R.string.CreateNewInviteLink));
                    if (createLinkCell.needDivider != z) {
                        createLinkCell.needDivider = z;
                        createLinkCell.setWillNotDraw(!z);
                    }
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View textInfoPrivacyCell;
                FilterInvitesBottomSheet filterInvitesBottomSheet = FilterInvitesBottomSheet.this;
                if (i == 8) {
                    textInfoPrivacyCell = new CreateLinkCell(filterInvitesBottomSheet.getContext());
                    textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                } else if (i == 7) {
                    textInfoPrivacyCell = new C00111(filterInvitesBottomSheet.getContext(), ((BottomSheet) filterInvitesBottomSheet).currentAccount, filterInvitesBottomSheet.filter.id);
                    textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
                } else if (i == 6 || i == 3) {
                    textInfoPrivacyCell = new TextInfoPrivacyCell(filterInvitesBottomSheet.getContext(), 24, null);
                    textInfoPrivacyCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                } else {
                    textInfoPrivacyCell = filterInvitesBottomSheet.new HeaderView(filterInvitesBottomSheet.getContext());
                }
                return new RecyclerListView.Holder(textInfoPrivacyCell);
            }

            public final RecyclerView.Adapter realAdapter() {
                return FilterInvitesBottomSheet.this.recyclerListView.getAdapter();
            }

            @Override
            public final void notifyItemRangeChanged(int i, int i2, Integer num) {
                realAdapter().notifyItemRangeChanged(i + 1, i2, num);
            }
        }

        public final class HeaderView extends FrameLayout {
            public HeaderView(Context context) {
                super(context);
                ImageView imageView = new ImageView(context);
                ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
                imageView.setScaleType(scaleType);
                imageView.setImageResource(R.drawable.msg_limit_links);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(22.0f), Theme.getColor(null, Theme.key_featuredStickers_addButton, false)));
                addView(imageView, LayoutHelper.createFrame(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
                SpoilersTextView spoilersTextView = new SpoilersTextView(context, null, true);
                spoilersTextView.setTypeface(AndroidUtilities.bold());
                spoilersTextView.setTextSize(1, 20.0f);
                int i = Theme.key_dialogTextBlack;
                spoilersTextView.setTextColor(Theme.getColor(null, i, false));
                spoilersTextView.setGravity(1);
                spoilersTextView.setText(FilterInvitesBottomSheet.this.getTitle(spoilersTextView));
                MessagesController.DialogFilter dialogFilter = FilterInvitesBottomSheet.this.filter;
                spoilersTextView.cacheType = (dialogFilter == null || !dialogFilter.title_noanimate) ? 0 : 26;
                addView(spoilersTextView, LayoutHelper.createFrame(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
                TextView textView = new TextView(context);
                textView.setText(FilterInvitesBottomSheet.this.invites.isEmpty() ? LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty) : LocaleController.getString(R.string.FolderLinkShareSubtitle));
                textView.setLines(2);
                textView.setGravity(1);
                textView.setTextSize(1, 14.0f);
                textView.setTextColor(Theme.getColor(null, i, false));
                addView(textView, LayoutHelper.createFrame(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
                ImageView imageView2 = new ImageView(context);
                imageView2.setScaleType(scaleType);
                imageView2.setImageResource(R.drawable.msg_close);
                imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText5, false), PorterDuff.Mode.MULTIPLY));
                imageView2.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 20));
                addView(imageView2, LayoutHelper.createFrame(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
            }

            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), 1073741824));
            }
        }

        public FilterInvitesBottomSheet(BaseFragment baseFragment, MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
            super(baseFragment, false);
            ArrayList arrayList2 = new ArrayList();
            this.invites = arrayList2;
            this.oldItems = new ArrayList();
            this.items = new ArrayList();
            this.filter = dialogFilter;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            updateRows$9(false);
            this.actionBar.setTitle(getTitle(null));
            fixNavigationBar(Theme.getColor(null, Theme.key_dialogBackground, false));
            TextView textView = new TextView(getContext());
            this.button = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setBackground(Theme.AdaptiveRipple.filledRectByKey(new float[]{8.0f}, Theme.key_featuredStickers_addButton));
            zzkg.m(R.string.FolderLinkShareButton, textView, 17);
            textView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 19));
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 87, 16.0f, 10.0f, 16.0f, 10.0f);
            int i = layoutParamsCreateFrame.leftMargin;
            int i2 = this.backgroundPaddingLeft;
            layoutParamsCreateFrame.leftMargin = i + i2;
            layoutParamsCreateFrame.rightMargin += i2;
            this.containerView.addView(textView, layoutParamsCreateFrame);
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.bulletinContainer = frameLayout;
            this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 100.0f, 80, 6.0f, 0.0f, 6.0f, 0.0f));
            textView.setVisibility(arrayList2.isEmpty() ? 0 : 8);
            this.recyclerListView.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), arrayList2.isEmpty() ? AndroidUtilities.dp(68.0f) : 0);
        }

        public static void show(BaseFragment baseFragment, MessagesController.DialogFilter dialogFilter, ComposeDrawable$$ExternalSyntheticLambda0 composeDrawable$$ExternalSyntheticLambda0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            baseFragment.getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new StarGiftSheet$$ExternalSyntheticLambda162(baseFragment, dialogFilter, composeDrawable$$ExternalSyntheticLambda0, jCurrentTimeMillis, 6));
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            this.adapter = anonymousClass1;
            return anonymousClass1;
        }

        public final void createLink() {
            MessagesController.DialogFilter dialogFilter;
            BaseFragment baseFragment;
            ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
            int i = 0;
            while (true) {
                dialogFilter = this.filter;
                int size = dialogFilter.alwaysShow.size();
                baseFragment = this.baseFragment;
                if (i >= size) {
                    break;
                }
                long jLongValue = dialogFilter.alwaysShow.get(i).longValue();
                if (jLongValue < 0 && FilterCreateActivity.canAddToFolder(baseFragment.getMessagesController().getChat(Long.valueOf(-jLongValue)))) {
                    arrayList.add(baseFragment.getMessagesController().getInputPeer(jLongValue));
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                lambda$showGiftOfferSheet$15();
                baseFragment.presentFragment(new FilterChatlistActivity(dialogFilter, null));
                return;
            }
            TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            tL_chatlists_exportChatlistInvite.peers = arrayList;
            tL_chatlists_exportChatlistInvite.title = "";
            baseFragment.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new LinkManager$$ExternalSyntheticLambda3(this, 10));
        }

        @Override
        public final CharSequence getTitle() {
            return getTitle(null);
        }

        @Override
        public final void onViewCreated(SizeNotifierFrameLayout sizeNotifierFrameLayout) {
            RecyclerListView recyclerListView = this.recyclerListView;
            recyclerListView.setOverScrollMode(2);
            recyclerListView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 12));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            recyclerListView.setItemAnimator(defaultItemAnimator);
        }

        public final void updateRows$9(boolean z) {
            ArrayList arrayList = this.oldItems;
            arrayList.clear();
            ArrayList arrayList2 = this.items;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            ItemInner itemInner = new ItemInner(0, false);
            itemInner.text = null;
            arrayList2.add(itemInner);
            ArrayList arrayList3 = this.invites;
            if (!arrayList3.isEmpty()) {
                arrayList2.add(ItemInner.asShadow(null));
                arrayList2.add(new ItemInner(8, false));
                for (int i = 0; i < arrayList3.size(); i++) {
                    TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i);
                    ItemInner itemInner2 = new ItemInner(7, false);
                    itemInner2.link = tL_exportedChatlistInvite;
                    arrayList2.add(itemInner2);
                }
            }
            AnonymousClass1 anonymousClass1 = this.adapter;
            if (anonymousClass1 != null) {
                if (z) {
                    anonymousClass1.setItems(arrayList, arrayList2);
                } else {
                    this.recyclerListView.getAdapter().notifyDataSetChanged();
                }
            }
        }

        public final CharSequence getTitle(SpoilersTextView spoilersTextView) {
            Object objReplaceAnimatedEmoji;
            MessagesController.DialogFilter dialogFilter = this.filter;
            if (dialogFilter != null) {
                Paint.FontMetricsInt fontMetricsInt = spoilersTextView == null ? null : spoilersTextView.getPaint().getFontMetricsInt();
                objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(new SpannableStringBuilder(dialogFilter.name), fontMetricsInt, false), dialogFilter.entities, fontMetricsInt);
            } else {
                objReplaceAnimatedEmoji = "";
            }
            return LocaleController.formatSpannable(R.string.FolderLinkShareTitle2, objReplaceAnimatedEmoji);
        }
    }

    public final class HeaderCellColorPreview extends HeaderCell {
        public final AnimatedColor animatedColor;
        public int currentColor;
        public final TextView noTag;
        public boolean noTagShown;
        public final StarsIntroActivity.StarsBalanceView.AnonymousClass1 previewView;

        public HeaderCellColorPreview(Context context) {
            super(context, Theme.key_windowBackgroundWhiteBlueHeader, 22, 15, 0, false, false, ((BaseFragment) FilterCreateActivity.this).resourceProvider);
            TextView textView = new TextView(getContext());
            this.noTag = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(FilterCreateActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
            zzkg.m(FilterCreateActivity.this.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium, textView, 5);
            int i = (LocaleController.isRTL ? 3 : 5) | 48;
            float f = this.padding;
            addView(textView, LayoutHelper.createFrame(-1, -1.0f, i, f, 16.66f, f, this.bottomMargin));
            textView.setAlpha(0.0f);
            StarsIntroActivity.StarsBalanceView.AnonymousClass1 anonymousClass1 = new StarsIntroActivity.StarsBalanceView.AnonymousClass1(this, getContext());
            this.previewView = anonymousClass1;
            this.animatedColor = new AnimatedColor(anonymousClass1, 320L, CubicBezierInterpolator.EASE_OUT_QUINT, 0);
            anonymousClass1.setTextSize(AndroidUtilities.dp(10.0f));
            anonymousClass1.setTypeface(AndroidUtilities.bold());
            anonymousClass1.setGravity(5);
            anonymousClass1.setPadding(AndroidUtilities.dp(4.66f), 0, AndroidUtilities.dp(4.66f), 0);
            int i2 = LocaleController.isRTL ? 3 : 5;
            float f2 = this.padding;
            addView(anonymousClass1, LayoutHelper.createFrame(-1, -1.0f, i2 | 48, f2, 16.66f, f2, this.bottomMargin));
        }

        public final void setPreviewColor(int i, boolean z) {
            TextView textView = this.noTag;
            FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
            textView.setText(LocaleController.getString(filterCreateActivity.getUserConfig().isPremium() ? R.string.FolderTagNoColor : R.string.FolderTagNoColorPremium));
            int themedColor = 0;
            boolean z2 = i < 0;
            if (!z2) {
                int[] iArr = Theme.keys_avatar_nameInMessage;
                themedColor = filterCreateActivity.getThemedColor(iArr[i % iArr.length]);
            }
            this.currentColor = themedColor;
            StarsIntroActivity.StarsBalanceView.AnonymousClass1 anonymousClass1 = this.previewView;
            if (!z2) {
                anonymousClass1.setEmojiColor(themedColor);
            }
            if (!z) {
                this.animatedColor.set(this.currentColor, true);
            }
            if (z2 != this.noTagShown) {
                this.noTagShown = z2;
                ViewPropertyAnimator duration = textView.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(320L);
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                duration.setInterpolator(cubicBezierInterpolator).start();
                anonymousClass1.animate().alpha(z2 ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator).start();
            }
        }

        public final void setPreviewText(CharSequence charSequence, boolean z) {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z2 = false;
            if (charSequence.length() > 12) {
                charSequence = charSequence.subSequence(0, 12);
            }
            StarsIntroActivity.StarsBalanceView.AnonymousClass1 anonymousClass1 = this.previewView;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(charSequence, anonymousClass1.getPaint().getFontMetricsInt(), false);
            if (z && !LocaleController.isRTL) {
                z2 = true;
            }
            anonymousClass1.setText(charSequenceReplaceEmoji, z2, true);
        }
    }

    public final class HeaderCellWithRight extends HeaderCell {
        public final TranslateButton.AnonymousClass1 rightTextView;

        public HeaderCellWithRight(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            boolean z = true;
            TranslateButton.AnonymousClass1 anonymousClass1 = new TranslateButton.AnonymousClass1(context, z, z, z, 1);
            this.rightTextView = anonymousClass1;
            anonymousClass1.setGravity(LocaleController.isRTL ? 3 : 5);
            anonymousClass1.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider));
            anonymousClass1.setTextSize(AndroidUtilities.dpf2(15.0f));
            addView(anonymousClass1, LayoutHelper.createFrame(-1, 18.0f, (LocaleController.isRTL ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
            ScaleStateListAnimator.apply(anonymousClass1, 0.04f, 1.2f);
        }
    }

    public final class HintInnerCell extends FrameLayout {
        public final RLottieImageView imageView;

        public HintInnerCell(Context context) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.filter_new, 100, 100, null);
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.playAnimation();
            addView(rLottieImageView, LayoutHelper.createFrame(100, 100.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
            rLottieImageView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 21));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(156.0f), 1073741824));
        }
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public String chatType;
        public long did;
        public int flags;
        public int iconResId;
        public boolean include;
        public boolean isRed;
        public TL_chatlists.TL_exportedChatlistInvite link;
        public boolean newSpan;
        public View.OnClickListener onClickListener;
        public String subtext;
        public String text;

        public static ItemInner asButton(int i, String str, boolean z) {
            ItemInner itemInner = new ItemInner(4, false);
            itemInner.iconResId = i;
            itemInner.text = str;
            itemInner.isRed = z;
            return itemInner;
        }

        public static ItemInner asChat(int i, String str, String str2, boolean z) {
            ItemInner itemInner = new ItemInner(1, false);
            itemInner.include = z;
            itemInner.text = str;
            itemInner.chatType = str2;
            itemInner.flags = i;
            return itemInner;
        }

        public static ItemInner asShadow(String str) {
            ItemInner itemInner = new ItemInner(TextUtils.isEmpty(str) ? 3 : 6, false);
            itemInner.text = str;
            return itemInner;
        }

        public final boolean equals(Object obj) {
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite;
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2;
            if (this != obj) {
                if (obj == null || ItemInner.class != obj.getClass()) {
                    return false;
                }
                ItemInner itemInner = (ItemInner) obj;
                int i = this.viewType;
                if (i != itemInner.viewType) {
                    return false;
                }
                if (i == 11) {
                    if (!TextUtils.equals(this.text, itemInner.text) || !TextUtils.equals(this.subtext, itemInner.subtext)) {
                        return false;
                    }
                } else {
                    if ((i == 0 || i == 1 || i == 3 || i == 4) && !TextUtils.equals(this.text, itemInner.text)) {
                        return false;
                    }
                    int i2 = this.viewType;
                    if (i2 == 0) {
                        if (this.newSpan != itemInner.newSpan) {
                            return false;
                        }
                    } else if (i2 == 1) {
                        if (this.did != itemInner.did || !TextUtils.equals(this.chatType, itemInner.chatType) || this.flags != itemInner.flags) {
                            return false;
                        }
                    } else if (i2 == 7 && (tL_exportedChatlistInvite = this.link) != (tL_exportedChatlistInvite2 = itemInner.link)) {
                        if (!TextUtils.equals(tL_exportedChatlistInvite.url, tL_exportedChatlistInvite2.url)) {
                            return false;
                        }
                        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite3 = this.link;
                        boolean z = tL_exportedChatlistInvite3.revoked;
                        TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite4 = itemInner.link;
                        if (z != tL_exportedChatlistInvite4.revoked || !TextUtils.equals(tL_exportedChatlistInvite3.title, tL_exportedChatlistInvite4.title) || this.link.peers.size() != itemInner.link.peers.size()) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
    }

    public abstract class LinkCell extends FrameLayout {
        public final int currentAccount;
        public final int filterId;
        public final BaseFragment fragment;
        public TL_chatlists.TL_exportedChatlistInvite lastInvite;
        public String lastUrl;
        public final Drawable linkIcon;
        public boolean needDivider;
        public final Paint paint;
        public float revokeT;
        public final Drawable revokedLinkIcon;
        public final Paint revokedPaint;
        public final AnimatedTextView subtitleTextView;
        public final AnimatedTextView titleTextView;
        public ValueAnimator valueAnimator;

        public LinkCell(Context context, BaseFragment baseFragment, int i, int i2) {
            super(context);
            this.fragment = baseFragment;
            this.currentAccount = i;
            this.filterId = i2;
            setImportantForAccessibility(1);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, true, false);
            this.titleTextView = animatedTextView;
            animatedTextView.setTextSize(AndroidUtilities.dp(15.66f));
            animatedTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            animatedTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            animatedTextView.setEllipsizeByGradient(true);
            boolean z = LocaleController.isRTL;
            addView(animatedTextView, LayoutHelper.createFrame(-1, 20.0f, 55, z ? 56.0f : 64.0f, 10.33f, z ? 64.0f : 56.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context, false, false, false);
            this.subtitleTextView = animatedTextView2;
            animatedTextView2.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView2.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            animatedTextView2.setGravity(LocaleController.isRTL ? 5 : 3);
            boolean z2 = LocaleController.isRTL;
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 16.0f, 55, z2 ? 56.0f : 64.0f, 33.33f, z2 ? 64.0f : 56.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_ab_other));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            int color = Theme.getColor(null, Theme.key_stickers_menu, false);
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            imageView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 22));
            imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            boolean z3 = LocaleController.isRTL;
            addView(imageView, LayoutHelper.createFrame(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 8.0f : 4.0f, 4.0f, z3 ? 4.0f : 8.0f, 4.0f));
            Paint paint = new Paint();
            this.paint = paint;
            paint.setColor(Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
            Paint paint2 = new Paint();
            this.revokedPaint = paint2;
            paint2.setColor(Theme.getColor(null, Theme.key_color_red, false));
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_link_1).mutate();
            this.linkIcon = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
            Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_link_2).mutate();
            this.revokedLinkIcon = drawableMutate2;
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
            setWillNotDraw(false);
        }

        public final void deleteLink() {
            String str = this.lastUrl;
            String strSubstring = str == null ? null : str.substring(str.lastIndexOf(47) + 1);
            if (strSubstring == null) {
                return;
            }
            TL_chatlists.TL_chatlists_deleteExportedInvite tL_chatlists_deleteExportedInvite = new TL_chatlists.TL_chatlists_deleteExportedInvite();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_deleteExportedInvite.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = this.filterId;
            tL_chatlists_deleteExportedInvite.slug = strSubstring;
            FilterCreateActivity$LinkCell$$ExternalSyntheticLambda2 filterCreateActivity$LinkCell$$ExternalSyntheticLambda2 = new FilterCreateActivity$LinkCell$$ExternalSyntheticLambda2(this, 2);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_chatlists_deleteExportedInvite, new LinkManager$$ExternalSyntheticLambda8(15, this, filterCreateActivity$LinkCell$$ExternalSyntheticLambda2));
            AndroidUtilities.runOnUIThread(filterCreateActivity$LinkCell$$ExternalSyntheticLambda2, 150L);
        }

        public abstract void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite);

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int measuredWidth = LocaleController.isRTL ? getMeasuredWidth() - AndroidUtilities.dp(32.0f) : AndroidUtilities.dp(32.0f);
            float f = measuredWidth;
            canvas.drawCircle(f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.paint);
            if (this.revokeT > 0.0f) {
                canvas.drawCircle(f, getMeasuredHeight() / 2.0f, AndroidUtilities.dp(16.0f) * this.revokeT, this.revokedPaint);
            }
            float f2 = this.revokeT;
            if (f2 < 1.0f) {
                Drawable drawable = this.linkIcon;
                drawable.setAlpha((int) ((1.0f - f2) * 255.0f));
                drawable.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
                drawable.draw(canvas);
            }
            float f3 = this.revokeT;
            if (f3 > 0.0f) {
                Drawable drawable2 = this.revokedLinkIcon;
                drawable2.setAlpha((int) (f3 * 255.0f));
                drawable2.setBounds(measuredWidth - AndroidUtilities.dp(14.0f), (getMeasuredHeight() / 2) - AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f) + measuredWidth, AndroidUtilities.dp(14.0f) + (getMeasuredHeight() / 2));
                drawable2.draw(canvas);
            }
            if (this.needDivider) {
                canvas.drawRect(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(64.0f) : 0), getMeasuredHeight(), Theme.dividerPaint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            StringBuilder sb = new StringBuilder();
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = this.lastInvite;
            String str = "";
            sb.append((tL_exportedChatlistInvite == null || TextUtils.isEmpty(tL_exportedChatlistInvite.title)) ? "" : MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(), this.lastInvite.title, "\n "));
            zzlf.m(R.string.InviteLink, ", ", sb);
            sb.append((Object) this.subtitleTextView.getText());
            TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite2 = this.lastInvite;
            if (tL_exportedChatlistInvite2 != null && TextUtils.isEmpty(tL_exportedChatlistInvite2.title)) {
                str = "\n\n" + this.lastInvite.url;
            }
            sb.append(str);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
        }

        public void options() {
            BaseFragment baseFragment = this.fragment;
            if (baseFragment instanceof FilterCreateActivity) {
                ChatActivity.AnonymousClass34 anonymousClass34 = ((FilterCreateActivity) baseFragment).listView;
                ItemOptions itemOptions = new ItemOptions(baseFragment, this, false, true);
                itemOptions.setScrimViewBackground(anonymousClass34.getClipBackground(this, false));
                itemOptions.add(R.drawable.msg_qrcode, LocaleController.getString(R.string.GetQRCode), new FilterCreateActivity$LinkCell$$ExternalSyntheticLambda2(this, 0), false);
                itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteLink), new FilterCreateActivity$LinkCell$$ExternalSyntheticLambda2(this, 1), true);
                if (LocaleController.isRTL) {
                    itemOptions.gravity = 3;
                }
                itemOptions.show();
            }
        }

        public final void qrcode() {
            if (this.lastUrl == null) {
                return;
            }
            QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet(getContext(), LocaleController.getString(R.string.InviteByQRCode), this.lastUrl, LocaleController.getString(R.string.QRCodeLinkHelpFolder), false);
            qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
            qRCodeBottomSheet.show();
        }

        public final void setInvite(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite, boolean z) {
            boolean z2 = this.lastInvite == tL_exportedChatlistInvite;
            this.lastInvite = tL_exportedChatlistInvite;
            String strSubstring = tL_exportedChatlistInvite.url;
            this.lastUrl = strSubstring;
            if (strSubstring.startsWith("http://")) {
                strSubstring = strSubstring.substring(7);
            }
            if (strSubstring.startsWith("https://")) {
                strSubstring = strSubstring.substring(8);
            }
            boolean zIsEmpty = TextUtils.isEmpty(tL_exportedChatlistInvite.title);
            AnimatedTextView animatedTextView = this.titleTextView;
            if (zIsEmpty) {
                animatedTextView.setText(strSubstring, z2, true);
            } else {
                animatedTextView.setText(tL_exportedChatlistInvite.title, z2, true);
            }
            this.subtitleTextView.setText(LocaleController.formatPluralString("FilterInviteChats", tL_exportedChatlistInvite.peers.size(), new Object[0]), z2, true);
            if (this.needDivider != z) {
                this.needDivider = z;
                invalidate();
            }
            boolean z3 = tL_exportedChatlistInvite.revoked;
            if ((z3 ? 1.0f : 0.0f) != this.revokeT) {
                ValueAnimator valueAnimator = this.valueAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.valueAnimator = null;
                }
                if (!z2) {
                    this.revokeT = z3 ? 1.0f : 0.0f;
                    invalidate();
                    return;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.revokeT, z3 ? 1.0f : 0.0f);
                this.valueAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(this, 13));
                this.valueAnimator.addListener(new LoginActivity.AnonymousClass9(18, this, z3));
                this.valueAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.valueAnimator.setDuration(350L);
                this.valueAnimator.start();
            }
        }
    }

    public final class ListAdapter extends AdapterWithDiffUtils {
        public final Context mContext;

        public final class AnonymousClass1 extends EditEmojiTextCell {
            @Override
            public final int emojiCacheType() {
                return 25;
            }
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return FilterCreateActivity.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            ItemInner itemInner = (ItemInner) FilterCreateActivity.this.items.get(i);
            if (itemInner == null) {
                return 3;
            }
            return itemInner.viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return (i == 3 || i == 0 || i == 2 || i == 5 || i == 9 || i == 11) ? false : true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            int i2;
            FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
            ArrayList arrayList = filterCreateActivity.items;
            ItemInner itemInner = (ItemInner) arrayList.get(i);
            if (itemInner == null) {
                return;
            }
            int i3 = i + 1;
            boolean z = false;
            boolean z2 = (i3 >= arrayList.size() || (i2 = ((ItemInner) arrayList.get(i3)).viewType) == 3 || i2 == 6) ? false : true;
            int i4 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i4 == 0) {
                HeaderCell headerCell = (HeaderCell) view;
                if (itemInner.newSpan) {
                    headerCell.setText(FilterCreateActivity.withNew(0, itemInner.text, false));
                    return;
                } else {
                    headerCell.setText(itemInner.text);
                    return;
                }
            }
            if (i4 == 1) {
                UserCell userCell = (UserCell) view;
                String str = itemInner.chatType;
                if (str != null) {
                    userCell.setData(str, itemInner.text, null, z2);
                    return;
                }
                long j = itemInner.did;
                if (j > 0) {
                    TLRPC.User user = filterCreateActivity.getMessagesController().getUser(Long.valueOf(j));
                    if (user != null) {
                        userCell.setData(user, null, user.bot ? LocaleController.getString(R.string.Bot) : user.contact ? LocaleController.getString(R.string.FilterContact) : LocaleController.getString(R.string.FilterNonContact), z2);
                        return;
                    }
                    return;
                }
                TLRPC.Chat chat = filterCreateActivity.getMessagesController().getChat(Long.valueOf(-j));
                if (chat != null) {
                    if (ChatObject.isCommunity(chat)) {
                        string = LocaleController.getString(R.string.Community);
                    } else if (chat.participants_count != 0) {
                        string = ChatObject.isChannelAndNotMegaGroup(chat) ? LocaleController.formatPluralStringComma("Subscribers", chat.participants_count) : LocaleController.formatPluralStringComma("Members", chat.participants_count);
                    } else if (ChatObject.isPublic(chat)) {
                        string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPublic) : LocaleController.getString(R.string.ChannelPublic);
                    } else {
                        string = (!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString(R.string.MegaPrivate) : LocaleController.getString(R.string.ChannelPrivate);
                    }
                    userCell.setData(chat, null, string, z2);
                    return;
                }
                return;
            }
            if (i4 != 4) {
                switch (i4) {
                    case 6:
                        ((TextInfoPrivacyCell) view).setText(itemInner.text);
                        break;
                    case 7:
                        ((LinkCell) view).setInvite(itemInner.link, z2);
                        break;
                    case 8:
                        CreateLinkCell createLinkCell = (CreateLinkCell) view;
                        if (createLinkCell.needDivider != z2) {
                            createLinkCell.needDivider = z2;
                            createLinkCell.setWillNotDraw(!z2);
                        }
                        break;
                    case 9:
                        HeaderCellColorPreview headerCellColorPreview = (HeaderCellColorPreview) view;
                        filterCreateActivity.folderTagsHeader = headerCellColorPreview;
                        headerCellColorPreview.setPreviewText(AnimatedEmojiSpan.cloneSpans(filterCreateActivity.newFilterName, -1, headerCellColorPreview.previewView.getPaint().getFontMetricsInt(), 0.5f), false);
                        filterCreateActivity.folderTagsHeader.setPreviewColor(filterCreateActivity.getUserConfig().isPremium() ? filterCreateActivity.newFilterColor : -1, false);
                        filterCreateActivity.folderTagsHeader.setText(LocaleController.getString(R.string.FolderTagColor));
                        break;
                    case 10:
                        PeerColorActivity.PeerColorGrid peerColorGrid = (PeerColorActivity.PeerColorGrid) view;
                        peerColorGrid.setCloseAsLock(!filterCreateActivity.getUserConfig().isPremium());
                        peerColorGrid.setSelected(filterCreateActivity.getUserConfig().isPremium() ? filterCreateActivity.newFilterColor : -1, false);
                        peerColorGrid.setOnColorClick(new OAuthSheet$$ExternalSyntheticLambda13(8, this, peerColorGrid));
                        break;
                    case 11:
                        HeaderCellWithRight headerCellWithRight = (HeaderCellWithRight) view;
                        filterCreateActivity.nameHeaderCell = headerCellWithRight;
                        headerCellWithRight.setText(itemInner.text);
                        String str2 = itemInner.subtext;
                        TranslateButton.AnonymousClass1 anonymousClass1 = headerCellWithRight.rightTextView;
                        anonymousClass1.setText(str2);
                        anonymousClass1.setOnClickListener(itemInner.onClickListener);
                        break;
                }
                return;
            }
            ButtonCell buttonCell = (ButtonCell) view;
            boolean z3 = itemInner.isRed;
            buttonCell.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, z3 ? Theme.key_text_RedBold : Theme.key_windowBackgroundWhiteBlueText2, false), PorterDuff.Mode.MULTIPLY));
            TextView textView = buttonCell.textView;
            textView.setTextColor(Theme.getColor(null, z3 ? Theme.key_text_RedRegular : Theme.key_windowBackgroundWhiteBlueText4, false));
            int i5 = itemInner.iconResId;
            String str3 = itemInner.text;
            int i6 = LocaleController.isRTL ? -1 : 1;
            ImageView imageView = buttonCell.imageView;
            if (i5 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                imageView.setImageResource(i5);
            }
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = AndroidUtilities.dp(i5 == 0 ? 24.0f : 72.0f);
            } else {
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = AndroidUtilities.dp(i5 == 0 ? 24.0f : 72.0f);
            }
            textView.setText(str3);
            if (!z2 && i5 != 0) {
                z = true;
            }
            Boolean bool = buttonCell.translateText;
            if (bool == null || bool.booleanValue() != z) {
                buttonCell.translateText = Boolean.valueOf(z);
                if (buttonCell.lastIconResId == i5) {
                    textView.clearAnimation();
                    textView.animate().translationX(z ? AndroidUtilities.dp(i6 * (-7)) : 0.0f).setDuration(180L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
                } else {
                    textView.setTranslationX(z ? AndroidUtilities.dp(i6 * (-7)) : 0.0f);
                }
            }
            buttonCell.divider = z2;
            buttonCell.setWillNotDraw(!z2);
            buttonCell.lastIconResId = i5;
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
            Context context = this.mContext;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(context, 22);
                    break;
                case 1:
                    UserCell userCell = new UserCell(6, 0, this.mContext, null, false, false);
                    userCell.setSelfAsSavedMessages(true);
                    headerCell = userCell;
                    break;
                case 2:
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.mContext, (SizeNotifierFrameLayout) filterCreateActivity.fragmentView, LocaleController.getString(R.string.FilterNameHint), false, 12, ((BaseFragment) filterCreateActivity).resourceProvider);
                    filterCreateActivity.nameEditTextCell = anonymousClass1;
                    anonymousClass1.allowEntities = false;
                    EditEmojiTextCell.AnonymousClass2 anonymousClass2 = anonymousClass1.editTextEmoji;
                    anonymousClass2.getEditText().setEmojiColor(Integer.valueOf(filterCreateActivity.getThemedColor(Theme.key_featuredStickers_addButton)));
                    anonymousClass2.setEmojiViewCacheType(25);
                    anonymousClass2.setText(filterCreateActivity.newFilterName);
                    AnimatedEmojiDrawable.toggleAnimations(((BaseFragment) filterCreateActivity).currentAccount, filterCreateActivity.newFilterAnimations);
                    EditTextCaption editText = anonymousClass2.getEditText();
                    editText.addTextChangedListener(new EditTextCell.AnonymousClass3());
                    editText.addTextChangedListener(new TextWatcher() {
                        @Override
                        public final void afterTextChanged(Editable editable) {
                            String string;
                            FilterCreateActivity filterCreateActivity2 = FilterCreateActivity.this;
                            if (!TextUtils.equals(editable, filterCreateActivity2.newFilterName)) {
                                filterCreateActivity2.nameChangedManually = !TextUtils.isEmpty(editable);
                                filterCreateActivity2.newFilterName = AnimatedEmojiSpan.onlyEmojiSpans(editable);
                                HeaderCellColorPreview headerCellColorPreview = filterCreateActivity2.folderTagsHeader;
                                if (headerCellColorPreview != null) {
                                    headerCellColorPreview.setPreviewText(AnimatedEmojiSpan.cloneSpans(filterCreateActivity2.newFilterName, -1, headerCellColorPreview.previewView.getPaint().getFontMetricsInt(), 0.5f), true);
                                }
                                HeaderCellWithRight headerCellWithRight = filterCreateActivity2.nameHeaderCell;
                                if (headerCellWithRight != null) {
                                    if (FilterCreateActivity.hasAnimatedEmojis(filterCreateActivity2.newFilterName)) {
                                        string = LocaleController.getString(filterCreateActivity2.newFilterAnimations ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
                                    } else {
                                        string = null;
                                    }
                                    headerCellWithRight.rightTextView.setText(string);
                                }
                                ((BaseFragment) filterCreateActivity2).actionBar.setTitle(AnimatedEmojiSpan.cloneSpans(filterCreateActivity2.newFilterName, -1, ((BaseFragment) filterCreateActivity2).actionBar.getTitleFontMetricsInt()));
                            }
                            filterCreateActivity2.checkDoneButton(true);
                        }

                        @Override
                        public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }

                        @Override
                        public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        }
                    });
                    editText.setPadding(AndroidUtilities.dp(7.0f), editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
                    anonymousClass2.getEditText().setImeOptions(268435462);
                    headerCell = anonymousClass1;
                    break;
                case 3:
                    headerCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 4:
                    headerCell = new ButtonCell(context);
                    break;
                case 5:
                    headerCell = new HintInnerCell(context);
                    break;
                case 6:
                default:
                    headerCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 7:
                    headerCell = new LinkCell(this.mContext, filterCreateActivity, ((BaseFragment) filterCreateActivity).currentAccount, filterCreateActivity.filter.id) {
                        @Override
                        public final void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
                            FilterCreateActivity.this.onDelete(tL_exportedChatlistInvite);
                        }
                    };
                    break;
                case 8:
                    headerCell = new CreateLinkCell(context);
                    break;
                case 9:
                    headerCell = filterCreateActivity.new HeaderCellColorPreview(context);
                    break;
                case 10:
                    headerCell = new PeerColorActivity.PeerColorGrid(2, ((BaseFragment) filterCreateActivity).currentAccount, filterCreateActivity.getParentActivity(), ((BaseFragment) filterCreateActivity).resourceProvider);
                    break;
                case 11:
                    headerCell = new HeaderCellWithRight(context, ((BaseFragment) filterCreateActivity).resourceProvider);
                    break;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            if (i != 2 && i == 9) {
                HeaderCellColorPreview headerCellColorPreview = (HeaderCellColorPreview) viewHolder.itemView;
                FilterCreateActivity filterCreateActivity = FilterCreateActivity.this;
                headerCellColorPreview.setPreviewText(AnimatedEmojiSpan.cloneSpans(filterCreateActivity.newFilterName, -1, filterCreateActivity.folderTagsHeader.previewView.getPaint().getFontMetricsInt(), 0.5f), true);
            }
        }

        @Override
        public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.mItemViewType == 2) {
                EditEmojiTextCell editEmojiTextCell = (EditEmojiTextCell) viewHolder.itemView;
                editEmojiTextCell.editTextEmoji.hidePopup(true);
                AndroidUtilities.hideKeyboard(editEmojiTextCell.editTextEmoji.editText);
            }
        }
    }

    public final class TextSpan extends ReplacementSpan {
        public final Paint bgPaint;
        public final int colorKey;
        public final Theme.ResourcesProvider resourcesProvider;
        public final Text text;

        public TextSpan(String str, int i, Theme.ResourcesProvider resourcesProvider) {
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.resourcesProvider = resourcesProvider;
            this.colorKey = i;
            this.text = new Text(str, 9.33f, AndroidUtilities.bold());
            paint.setStyle(Paint.Style.FILL);
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int color = Theme.getColor(this.colorKey, this.resourcesProvider);
            Paint paint2 = this.bgPaint;
            paint2.setColor(Theme.multAlpha(0.15f, color));
            float f2 = (i5 + i3) / 2.0f;
            float fDp = AndroidUtilities.dp(14.66f);
            RectF rectF = AndroidUtilities.rectTmp;
            float f3 = fDp / 2.0f;
            rectF.set(f, f2 - f3, this.text.getWidth() + f + AndroidUtilities.dp(9.33f), f3 + f2);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint2);
            this.text.draw(f + AndroidUtilities.dp(4.66f), f2, 1.0f, color, canvas);
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return (int) (this.text.getWidth() + AndroidUtilities.dp(9.33f));
        }
    }

    public FilterCreateActivity(MessagesController.DialogFilter dialogFilter, ArrayList arrayList) {
        super(null);
        this.nameRow = -1;
        this.newFilterAnimations = true;
        this.invites = new ArrayList();
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.shiftDp = -5.0f;
        this.filter = dialogFilter;
        if (dialogFilter == null) {
            MessagesController.DialogFilter dialogFilter2 = new MessagesController.DialogFilter();
            this.filter = dialogFilter2;
            dialogFilter2.id = 2;
            while (getMessagesController().dialogFiltersById.get(this.filter.id) != null) {
                this.filter.id++;
            }
            MessagesController.DialogFilter dialogFilter3 = this.filter;
            dialogFilter3.name = "";
            dialogFilter3.color = (int) (Math.random() * 8.0d);
            this.creatingNew = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(AndroidUtilities.dp(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.filter.name);
        this.newFilterName = spannableStringBuilder;
        CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textPaint.getFontMetricsInt(), false);
        this.newFilterName = charSequenceReplaceEmoji;
        this.newFilterName = MessageObject.replaceAnimatedEmoji(charSequenceReplaceEmoji, this.filter.entities, textPaint.getFontMetricsInt());
        boolean z = !this.filter.title_noanimate;
        this.newFilterAnimations = z;
        AnimatedEmojiDrawable.toggleAnimations(this.currentAccount, z);
        MessagesController.DialogFilter dialogFilter4 = this.filter;
        this.newFilterFlags = dialogFilter4.flags;
        this.newFilterColor = dialogFilter4.color;
        ArrayList arrayList2 = new ArrayList(this.filter.alwaysShow);
        this.newAlwaysShow = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.newNeverShow = new ArrayList(this.filter.neverShow);
        this.newPinned = this.filter.pinnedDialogs.clone();
    }

    public static boolean canAddToFolder(TLRPC.Chat chat) {
        if (ChatObject.canUserDoAdminAction(chat, 3)) {
            return true;
        }
        return ChatObject.isPublic(chat) && !chat.join_request;
    }

    public static boolean hasAnimatedEmojis(CharSequence charSequence) {
        if (!(charSequence instanceof Spanned)) {
            return false;
        }
        Spanned spanned = (Spanned) charSequence;
        AnimatedEmojiSpan[] animatedEmojiSpanArr = (AnimatedEmojiSpan[]) spanned.getSpans(0, spanned.length(), AnimatedEmojiSpan.class);
        return animatedEmojiSpanArr != null && animatedEmojiSpanArr.length > 0;
    }

    public static void processAddFilter(MessagesController.DialogFilter dialogFilter, int i, String str, ArrayList arrayList, boolean z, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z2, boolean z3, boolean z4, boolean z5, BaseFragment baseFragment, Runnable runnable) {
        if (dialogFilter.flags != i || z4) {
            dialogFilter.pendingUnreadCount = -1;
            if (z5) {
                dialogFilter.unreadCount = -1;
            }
        }
        dialogFilter.flags = i;
        dialogFilter.name = str;
        dialogFilter.entities = arrayList;
        dialogFilter.color = i2;
        dialogFilter.neverShow = arrayList3;
        dialogFilter.alwaysShow = arrayList2;
        dialogFilter.title_noanimate = z;
        if (z2) {
            baseFragment.getMessagesController().addFilter(dialogFilter, z3);
        } else {
            baseFragment.getMessagesController().onFilterUpdate(dialogFilter);
        }
        baseFragment.getMessagesStorage().saveDialogFilter(dialogFilter, z3, true);
        if (z3) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = baseFragment.getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            for (int iM = 0; iM < size; iM = LocationController$$ExternalSyntheticOutline0.m(dialogFilters.get(iM).id, iM, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            baseFragment.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void processErrors(TLRPC.TL_error tL_error, BaseFragment baseFragment, BulletinFactory bulletinFactory) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new LimitReachedBottomSheet(4, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FolderLinkNoChatsError, bulletinFactory, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.FolderLinkOtherAdminLimitError, bulletinFactory, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new LimitReachedBottomSheet(5, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new LimitReachedBottomSheet(12, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new LimitReachedBottomSheet(13, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.NoFolderFound, bulletinFactory, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new LimitReachedBottomSheet(4, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            UserNameResolver$$ExternalSyntheticOutline0.m(R.string.UnknownError, bulletinFactory, null);
        } else {
            new LimitReachedBottomSheet(3, baseFragment.getCurrentAccount(), baseFragment.getContext(), baseFragment, null).show();
        }
    }

    public static void saveFilterToServer(final MessagesController.DialogFilter dialogFilter, final int i, final String str, final ArrayList arrayList, final boolean z, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final BaseFragment baseFragment, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (baseFragment.getParentActivity() == null) {
            return;
        }
        final AlertDialog alertDialog = null;
        int i3 = 3;
        int i4 = 0;
        if (z6) {
            AlertDialog alertDialog2 = new AlertDialog(baseFragment.getParentActivity(), 3, null);
            alertDialog2.canCacnel = false;
            alertDialog2.show();
            alertDialog = alertDialog2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = dialogFilter.id;
        int i5 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        tL_dialogFilter.contacts = (i & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0;
        tL_dialogFilter.non_contacts = (i & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0;
        tL_dialogFilter.groups = (i & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0;
        tL_dialogFilter.broadcasts = (i & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0;
        tL_dialogFilter.bots = (i & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0;
        tL_dialogFilter.exclude_muted = (i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0;
        tL_dialogFilter.exclude_read = (i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0;
        tL_dialogFilter.exclude_archived = (i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0;
        tL_dialogFilter.id = dialogFilter.id;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z;
        if (i2 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= 134217728;
            tL_dialogFilter2.color = i2;
        }
        MessagesController messagesController = baseFragment.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i6 = 0; i6 < size; i6++) {
                long jKeyAt = longSparseIntArray.keyAt(i6);
                if (!DialogObject.isEncryptedDialog(jKeyAt)) {
                    arrayList6.add(Long.valueOf(jKeyAt));
                }
            }
            Collections.sort(arrayList6, new TableModel$$ExternalSyntheticLambda0(longSparseIntArray, 7));
        }
        int i7 = 0;
        while (i7 < i3) {
            if (i7 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i7 == i5) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i4 < size2) {
                Long l = (Long) arrayList5.get(i4);
                AlertDialog alertDialog3 = alertDialog;
                int i8 = size2;
                long jLongValue = l.longValue();
                if ((i7 != 0 || longSparseIntArray.indexOfKey(jLongValue) < 0) && !DialogObject.isEncryptedDialog(jLongValue)) {
                    if (jLongValue > 0) {
                        TLRPC.User user = messagesController.getUser(l);
                        if (user != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = jLongValue;
                            tL_inputPeerUser.access_hash = user.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j = -jLongValue;
                        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
                        if (chat != null) {
                            if (ChatObject.isChannel(chat)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j;
                                tL_inputPeerChannel.access_hash = chat.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i4++;
                alertDialog = alertDialog3;
                size2 = i8;
            }
            i7++;
            i3 = 3;
            i4 = 0;
            i5 = 1;
        }
        baseFragment.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final BaseFragment baseFragment2 = baseFragment;
                final Runnable runnable2 = runnable;
                final boolean z7 = z6;
                final AlertDialog alertDialog4 = alertDialog;
                final MessagesController.DialogFilter dialogFilter2 = dialogFilter;
                final int i9 = i;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z8 = z;
                final int i10 = i2;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z9 = z2;
                final boolean z10 = z3;
                final boolean z11 = z4;
                final boolean z12 = z5;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        boolean z13 = z7;
                        Runnable runnable3 = runnable2;
                        if (!z13) {
                            if (runnable3 != null) {
                                runnable3.run();
                                return;
                            }
                            return;
                        }
                        AlertDialog alertDialog5 = alertDialog4;
                        if (alertDialog5 != null) {
                            try {
                                alertDialog5.dismiss();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        }
                        FilterCreateActivity.processAddFilter(dialogFilter2, i9, str2, arrayList7, z8, i10, arrayList8, arrayList9, z9, z10, z11, z12, baseFragment2, runnable3);
                    }
                });
            }
        });
        if (z6) {
            return;
        }
        processAddFilter(dialogFilter, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, baseFragment, null);
    }

    public static CharSequence withNew(int i, String str, boolean z) {
        Context context;
        if (i >= 0) {
            if (!MessagesController.getGlobalMainSettings().getBoolean("n_" + i, false) && (context = ApplicationLoader.applicationContext) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z) {
                    Drawable drawableMutate = context.getResources().getDrawable(R.drawable.msg_other_new_outline).mutate();
                    drawableMutate.setBounds(0, -AndroidUtilities.dp(8.0f), drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight() - AndroidUtilities.dp(8.0f));
                    spannableString.setSpan(new ColorImageSpan(drawableMutate, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable drawableMutate2 = context.getResources().getDrawable(R.drawable.msg_other_new_filled).mutate();
                    Drawable drawableMutate3 = context.getResources().getDrawable(R.drawable.msg_other_new_filled_text).mutate();
                    int color = Theme.getColor(null, Theme.key_featuredStickers_unread, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    drawableMutate2.setColorFilter(new PorterDuffColorFilter(color, mode));
                    drawableMutate3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false), mode));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(drawableMutate2, drawableMutate3);
                    combinedDrawable.setBounds(0, 0, combinedDrawable.getIntrinsicWidth(), combinedDrawable.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(combinedDrawable, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return str;
    }

    @Override
    public final boolean canBeginSlide() {
        return checkDiscard$9(true);
    }

    public final boolean checkDiscard$9(boolean z) {
        if (this.doneItem.getAlpha() != 1.0f) {
            return true;
        }
        if (z) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            boolean z2 = this.creatingNew;
            AlertDialog alertDialog = builder.alertDialog;
            if (z2) {
                alertDialog.title = LocaleController.getString(R.string.FilterDiscardNewTitle);
                alertDialog.message = LocaleController.getString(R.string.FilterDiscardNewAlert);
                builder.setPositiveButton(LocaleController.getString(R.string.FilterDiscardNewSave), new FilterCreateActivity$$ExternalSyntheticLambda3(this, 0));
            } else {
                alertDialog.title = LocaleController.getString(R.string.FilterDiscardTitle);
                alertDialog.message = LocaleController.getString(R.string.FilterDiscardAlert);
                builder.setPositiveButton(LocaleController.getString(R.string.ApplyTheme), new FilterCreateActivity$$ExternalSyntheticLambda3(this, 2));
            }
            builder.setNegativeButton(LocaleController.getString(R.string.PassportDiscard), new FilterCreateActivity$$ExternalSyntheticLambda3(this, 3));
            showDialog(alertDialog);
        }
        return false;
    }

    public final void checkDoneButton(boolean z) {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.newFilterName) && this.newFilterName.length() <= 12;
        if (z3) {
            z3 = ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == 0 && this.newAlwaysShow.isEmpty()) ? false : true;
            if (!z3 || this.creatingNew) {
                z2 = z3;
            } else {
                this.hasUserChanged = false;
                MessagesController.DialogFilter dialogFilter = this.filter;
                if (dialogFilter.alwaysShow.size() != this.newAlwaysShow.size()) {
                    this.hasUserChanged = true;
                }
                if (dialogFilter.neverShow.size() != this.newNeverShow.size()) {
                    this.hasUserChanged = true;
                }
                if (dialogFilter.color != this.newFilterColor) {
                    this.hasUserChanged = true;
                }
                if (!this.hasUserChanged) {
                    Collections.sort(dialogFilter.alwaysShow);
                    Collections.sort(this.newAlwaysShow);
                    if (!dialogFilter.alwaysShow.equals(this.newAlwaysShow)) {
                        this.hasUserChanged = true;
                    }
                    Collections.sort(dialogFilter.neverShow);
                    Collections.sort(this.newNeverShow);
                    if (!dialogFilter.neverShow.equals(this.newNeverShow)) {
                        this.hasUserChanged = true;
                    }
                }
                if (dialogFilter.title_noanimate == (!this.newFilterAnimations) && TextUtils.equals(dialogFilter.name, this.newFilterName) && dialogFilter.flags == this.newFilterFlags) {
                    z2 = this.hasUserChanged;
                }
            }
        } else {
            z2 = z3;
        }
        if (this.doneItem.isEnabled() == z2) {
            return;
        }
        this.doneItem.setEnabled(z2);
        if (z) {
            this.doneItem.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.0f).scaleY(z2 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.doneItem.setAlpha(z2 ? 1.0f : 0.0f);
        this.doneItem.setScaleX(z2 ? 1.0f : 0.0f);
        this.doneItem.setScaleY(z2 ? 1.0f : 0.0f);
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        boolean z = this.creatingNew;
        MessagesController.DialogFilter dialogFilter = this.filter;
        if (z) {
            this.actionBar.setTitle(LocaleController.getString(R.string.FilterNew));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
            this.actionBar.setTitle(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt));
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                if (actionBar.getTitleTextView() != null) {
                    this.actionBar.getTitleTextView().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
                }
                if (this.actionBar.getTitleTextView2() != null) {
                    this.actionBar.getTitleTextView2().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
                }
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 17));
        this.doneItem = actionBarMenuCreateMenu.addItem(1, LocaleController.getString(R.string.Save).toUpperCase());
        LaunchActivity.AnonymousClass11 anonymousClass11 = new LaunchActivity.AnonymousClass11(context, null, 5);
        this.fragmentView = anonymousClass11;
        anonymousClass11.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 22);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new LinearLayoutManager(1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        anonymousClass11.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        anonymousClass35.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 11));
        this.listView.setOnItemLongClickListener(new FilterCreateActivity$$ExternalSyntheticLambda3(this, 4));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 17));
        checkDoneButton(false);
        if (!this.loadingInvites && dialogFilter != null && dialogFilter.isChatlist()) {
            this.loadingInvites = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
            this.requestingInvitesReqId = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new FilterCreateActivity$$ExternalSyntheticLambda20(this, 0));
        }
        return this.fragmentView;
    }

    public final void fillFilterName() {
        String string;
        if (this.creatingNew) {
            if (TextUtils.isEmpty(this.newFilterName) || !this.nameChangedManually) {
                int i = this.newFilterFlags;
                int i2 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                int i3 = i & i2;
                if ((i3 & i2) != i2) {
                    int i4 = MessagesController.DIALOG_FILTER_FLAG_CONTACTS;
                    if ((i3 & i4) == 0) {
                        int i5 = MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS;
                        if ((i3 & i5) == 0) {
                            int i6 = MessagesController.DIALOG_FILTER_FLAG_GROUPS;
                            if ((i3 & i6) == 0) {
                                int i7 = MessagesController.DIALOG_FILTER_FLAG_BOTS;
                                if ((i3 & i7) == 0) {
                                    int i8 = MessagesController.DIALOG_FILTER_FLAG_CHANNELS;
                                    if ((i3 & i8) == 0 || ((~i8) & i3) != 0) {
                                        string = "";
                                    } else {
                                        string = LocaleController.getString(R.string.FilterChannels);
                                    }
                                } else if (((~i7) & i3) == 0) {
                                    string = LocaleController.getString(R.string.FilterBots);
                                } else {
                                    string = "";
                                }
                            } else if (((~i6) & i3) == 0) {
                                string = LocaleController.getString(R.string.FilterGroups);
                            } else {
                                string = "";
                            }
                        } else if (((~i5) & i3) == 0) {
                            string = LocaleController.getString(R.string.FilterNonContacts);
                        } else {
                            string = "";
                        }
                    } else if (((~i4) & i3) == 0) {
                        string = LocaleController.getString(R.string.FilterContacts);
                    } else {
                        string = "";
                    }
                } else if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i) != 0) {
                    string = LocaleController.getString(R.string.FilterNameUnread);
                } else if ((i & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                    string = LocaleController.getString(R.string.FilterNameNonMuted);
                } else {
                    string = "";
                }
                String str = (string == null || string.length() <= 12) ? string : "";
                this.newFilterName = str;
                HeaderCellColorPreview headerCellColorPreview = this.folderTagsHeader;
                if (headerCellColorPreview != null) {
                    headerCellColorPreview.setPreviewText(AnimatedEmojiSpan.cloneSpans(str, -1, headerCellColorPreview.previewView.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(this.nameRow);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    this.adapter.onViewAttachedToWindow(viewHolderFindViewHolderForAdapterPosition);
                }
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 25);
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, TextCell.class, UserCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{TextCell.class}, new String[]{"ImageView"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{UserCell.class}, new String[]{"adminTextView"}, null, null, -1, null, Theme.key_profile_creatorIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$onClickCreateLink$13() {
        MessagesController messagesController = getMessagesController();
        MessagesController.DialogFilter dialogFilter = this.filter;
        messagesController.updateFilterDialogs(dialogFilter);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i = 0; i < dialogFilter.alwaysShow.size(); i++) {
            long jLongValue = dialogFilter.alwaysShow.get(i).longValue();
            if (jLongValue < 0 && canAddToFolder(getMessagesController().getChat(Long.valueOf(-jLongValue)))) {
                arrayList.add(getMessagesController().getInputPeer(jLongValue));
            }
        }
        if (arrayList.size() > (getUserConfig().isPremium() ? getMessagesController().dialogFiltersChatsLimitPremium : getMessagesController().dialogFiltersChatsLimitDefault)) {
            showDialog(new LimitReachedBottomSheet(4, this.currentAccount, getParentActivity(), this, null));
            return;
        }
        if (arrayList.isEmpty()) {
            FilterChatlistActivity filterChatlistActivity = new FilterChatlistActivity(dialogFilter, null);
            filterChatlistActivity.onEdit = new FilterCreateActivity$$ExternalSyntheticLambda18(this, 1);
            filterChatlistActivity.onDelete = new FilterCreateActivity$$ExternalSyntheticLambda18(this, 2);
            presentFragment(filterChatlistActivity);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = dialogFilter.id;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new FilterCreateActivity$$ExternalSyntheticLambda20(this, 1));
    }

    public final void lambda$processDone$23() {
        if (!this.doNotCloseWhenSave) {
            finishFragment();
            return;
        }
        this.doNotCloseWhenSave = false;
        Paint.FontMetricsInt titleFontMetricsInt = this.actionBar.getTitleFontMetricsInt();
        MessagesController.DialogFilter dialogFilter = this.filter;
        this.actionBar.setTitleAnimated(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, titleFontMetricsInt, false), dialogFilter.entities, titleFontMetricsInt), true, 220L, null);
    }

    public final void lambda$updateRows$2() {
        String string;
        this.newFilterAnimations = !this.newFilterAnimations;
        HeaderCellWithRight headerCellWithRight = this.nameHeaderCell;
        if (headerCellWithRight != null) {
            if (hasAnimatedEmojis(this.newFilterName)) {
                string = LocaleController.getString(this.newFilterAnimations ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable);
            } else {
                string = null;
            }
            headerCellWithRight.rightTextView.setText(string);
        }
        AnimatedEmojiDrawable.toggleAnimations(this.currentAccount, this.newFilterAnimations);
        checkDoneButton(true);
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            if (actionBar.getTitleTextView() != null) {
                this.actionBar.getTitleTextView().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
            }
            if (this.actionBar.getTitleTextView2() != null) {
                this.actionBar.getTitleTextView2().setEmojiCacheType(this.newFilterAnimations ? 0 : 26);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        EditEmojiTextCell.AnonymousClass2 anonymousClass2;
        ListAdapter.AnonymousClass1 anonymousClass1 = this.nameEditTextCell;
        if (anonymousClass1 == null || (anonymousClass2 = anonymousClass1.editTextEmoji) == null || !anonymousClass2.emojiViewVisible) {
            return checkDiscard$9(z);
        }
        if (!z) {
            return false;
        }
        anonymousClass2.hidePopup(true);
        return false;
    }

    public final void onDelete(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            arrayList = this.invites;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            if (arrayList.isEmpty()) {
                this.filter.flags &= ~MessagesController.DIALOG_FILTER_FLAG_CHATLIST;
            }
            updateRows$12();
        }
    }

    public final void onEdit(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            arrayList = this.invites;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i, tL_exportedChatlistInvite);
        }
        updateRows$12();
    }

    @Override
    public final boolean onFragmentCreate() {
        updateRows$12();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.requestingInvitesReqId != 0) {
            getConnectionsManager().cancelRequest(this.requestingInvitesReqId, true);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }

    @Override
    public final void onResume() {
        super.onResume();
        updateRows$12();
        FilterCreateActivity$$ExternalSyntheticLambda27 filterCreateActivity$$ExternalSyntheticLambda27 = this.showBulletinOnResume;
        if (filterCreateActivity$$ExternalSyntheticLambda27 != null) {
            filterCreateActivity$$ExternalSyntheticLambda27.run();
        }
    }

    public final void onUpdate(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        int size;
        int size2;
        if (arrayList != null) {
            size2 = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if (!arrayList2.contains(arrayList.get(i))) {
                    size2++;
                }
            }
            size = 0;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                if (!arrayList.contains(arrayList2.get(i2))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            size2 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            size2 = 0;
        }
        if (!z) {
            if (size > 0) {
                onUpdate(size, false);
            }
        } else if (size > 0 && size > size2) {
            onUpdate(size, true);
        } else if (size2 > 0) {
            onUpdate(size2, false);
        }
    }

    public final void processDone$15() {
        AnonymousClass5 anonymousClass5 = this.saveHintView;
        if (anonymousClass5 != null) {
            anonymousClass5.hide(true);
            this.saveHintView = null;
        }
        save(new FilterCreateActivity$$ExternalSyntheticLambda16(this, 0), true);
    }

    public final void save(Runnable runnable, boolean z) {
        CharSequence[] charSequenceArr = {this.newFilterName};
        saveFilterToServer(this.filter, this.newFilterFlags, charSequenceArr[0].toString(), getMediaDataController().getEntities(charSequenceArr, false), true ^ this.newFilterAnimations, this.newFilterColor, this.newAlwaysShow, this.newNeverShow, this.newPinned, this.creatingNew, false, this.hasUserChanged, true, z, this, new DialogsActivity$$ExternalSyntheticLambda8(29, this, runnable));
    }

    public final void selectChatsFor(boolean z) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.newFilterFlags, z ? this.newAlwaysShow : this.newNeverShow, z);
        usersSelectActivity.noChatTypes = this.filter.isChatlist();
        usersSelectActivity.delegate = new ChatActivity$$ExternalSyntheticLambda168(7, this, z);
        presentFragment(usersSelectActivity);
    }

    public final void showRemoveAlert(ItemInner itemInner, CharSequence charSequence, Object obj, boolean z) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        AlertDialog alertDialog = builder.alertDialog;
        if (z) {
            alertDialog.title = LocaleController.getString(R.string.FilterRemoveInclusionTitle);
            if (obj instanceof String) {
                alertDialog.message = LocaleController.formatString(R.string.FilterRemoveInclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                alertDialog.message = LocaleController.formatString(R.string.FilterRemoveInclusionUserText, charSequence);
            } else {
                alertDialog.message = LocaleController.formatString(R.string.FilterRemoveInclusionChatText, charSequence);
            }
        } else {
            alertDialog.title = LocaleController.getString(R.string.FilterRemoveExclusionTitle);
            if (obj instanceof String) {
                alertDialog.message = LocaleController.formatString(R.string.FilterRemoveExclusionText, charSequence);
            } else if (obj instanceof TLRPC.User) {
                alertDialog.message = LocaleController.formatString(R.string.FilterRemoveExclusionUserText, charSequence);
            } else {
                alertDialog.message = LocaleController.formatString(R.string.FilterRemoveExclusionChatText, charSequence);
            }
        }
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.StickersRemove), new LoginActivity$$ExternalSyntheticLambda31(this, itemInner, z, 10));
        showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void updateRows$12() {
        ArrayList arrayList = this.oldItems;
        arrayList.clear();
        ArrayList arrayList2 = this.items;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String string = LocaleController.getString(R.string.FilterNameHeader);
        String string2 = hasAnimatedEmojis(this.newFilterName) ? LocaleController.getString(this.newFilterAnimations ? R.string.FilterNameAnimationsDisable : R.string.FilterNameAnimationsEnable) : null;
        final int i = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final FilterCreateActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$updateRows$2();
                        break;
                    case 1:
                        FilterCreateActivity filterCreateActivity = this.f$0;
                        filterCreateActivity.includeExpanded = true;
                        filterCreateActivity.updateRows$12();
                        break;
                    case 2:
                        this.f$0.selectChatsFor(false);
                        break;
                    case 3:
                        FilterCreateActivity filterCreateActivity2 = this.f$0;
                        filterCreateActivity2.excludeExpanded = true;
                        filterCreateActivity2.updateRows$12();
                        break;
                    case 4:
                        FilterCreateActivity filterCreateActivity3 = this.f$0;
                        MessagesController.DialogFilter dialogFilter = filterCreateActivity3.filter;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            FolderBottomSheet.showForDeletion(dialogFilter.id, filterCreateActivity3, new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity3, 0));
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(filterCreateActivity3.getParentActivity(), 0, null);
                            String string3 = LocaleController.getString(R.string.FilterDelete);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string3;
                            alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlert);
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new FilterCreateActivity$$ExternalSyntheticLambda3(filterCreateActivity3, 1));
                            filterCreateActivity3.showDialog(alertDialog);
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                            }
                        }
                        break;
                    default:
                        this.f$0.selectChatsFor(true);
                        break;
                }
            }
        };
        ItemInner itemInner = new ItemInner(11, false);
        itemInner.text = string;
        itemInner.subtext = string2;
        itemInner.onClickListener = onClickListener;
        arrayList2.add(itemInner);
        this.nameRow = arrayList2.size();
        arrayList2.add(new ItemInner(2, false));
        arrayList2.add(ItemInner.asShadow(null));
        String string3 = LocaleController.getString(R.string.FilterInclude);
        ItemInner itemInner2 = new ItemInner(0, false);
        itemInner2.text = string3;
        arrayList2.add(itemInner2);
        ItemInner itemInnerAsButton = ItemInner.asButton(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterAddChats), false);
        final int i2 = 5;
        itemInnerAsButton.onClickListener = new View.OnClickListener(this) {
            public final FilterCreateActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$updateRows$2();
                        break;
                    case 1:
                        FilterCreateActivity filterCreateActivity = this.f$0;
                        filterCreateActivity.includeExpanded = true;
                        filterCreateActivity.updateRows$12();
                        break;
                    case 2:
                        this.f$0.selectChatsFor(false);
                        break;
                    case 3:
                        FilterCreateActivity filterCreateActivity2 = this.f$0;
                        filterCreateActivity2.excludeExpanded = true;
                        filterCreateActivity2.updateRows$12();
                        break;
                    case 4:
                        FilterCreateActivity filterCreateActivity3 = this.f$0;
                        MessagesController.DialogFilter dialogFilter = filterCreateActivity3.filter;
                        if (dialogFilter != null && dialogFilter.isChatlist()) {
                            FolderBottomSheet.showForDeletion(dialogFilter.id, filterCreateActivity3, new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity3, 0));
                        } else {
                            AlertDialog.Builder builder = new AlertDialog.Builder(filterCreateActivity3.getParentActivity(), 0, null);
                            String string4 = LocaleController.getString(R.string.FilterDelete);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string4;
                            alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlert);
                            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new FilterCreateActivity$$ExternalSyntheticLambda3(filterCreateActivity3, 1));
                            filterCreateActivity3.showDialog(alertDialog);
                            TextView textView = (TextView) alertDialog.getButton(-1);
                            if (textView != null) {
                                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                            }
                        }
                        break;
                    default:
                        this.f$0.selectChatsFor(true);
                        break;
                }
            }
        };
        arrayList2.add(itemInnerAsButton);
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
            arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_CONTACTS, LocaleController.getString(R.string.FilterContacts), "contacts", true));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
            arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS, LocaleController.getString(R.string.FilterNonContacts), "non_contacts", true));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
            arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_GROUPS, LocaleController.getString(R.string.FilterGroups), "groups", true));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
            arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_CHANNELS, LocaleController.getString(R.string.FilterChannels), "channels", true));
        }
        if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
            arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_BOTS, LocaleController.getString(R.string.FilterBots), "bots", true));
        }
        if (!this.newAlwaysShow.isEmpty()) {
            int size = (this.includeExpanded || this.newAlwaysShow.size() < 8) ? this.newAlwaysShow.size() : Math.min(5, this.newAlwaysShow.size());
            for (int i3 = 0; i3 < size; i3++) {
                long jLongValue = ((Long) this.newAlwaysShow.get(i3)).longValue();
                ItemInner itemInner3 = new ItemInner(1, false);
                itemInner3.include = true;
                itemInner3.did = jLongValue;
                arrayList2.add(itemInner3);
            }
            if (size != this.newAlwaysShow.size()) {
                ItemInner itemInnerAsButton2 = ItemInner.asButton(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.newAlwaysShow.size() - 5, new Object[0]), false);
                final int i4 = 1;
                itemInnerAsButton2.onClickListener = new View.OnClickListener(this) {
                    public final FilterCreateActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$updateRows$2();
                                break;
                            case 1:
                                FilterCreateActivity filterCreateActivity = this.f$0;
                                filterCreateActivity.includeExpanded = true;
                                filterCreateActivity.updateRows$12();
                                break;
                            case 2:
                                this.f$0.selectChatsFor(false);
                                break;
                            case 3:
                                FilterCreateActivity filterCreateActivity2 = this.f$0;
                                filterCreateActivity2.excludeExpanded = true;
                                filterCreateActivity2.updateRows$12();
                                break;
                            case 4:
                                FilterCreateActivity filterCreateActivity3 = this.f$0;
                                MessagesController.DialogFilter dialogFilter = filterCreateActivity3.filter;
                                if (dialogFilter != null && dialogFilter.isChatlist()) {
                                    FolderBottomSheet.showForDeletion(dialogFilter.id, filterCreateActivity3, new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity3, 0));
                                } else {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(filterCreateActivity3.getParentActivity(), 0, null);
                                    String string4 = LocaleController.getString(R.string.FilterDelete);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string4;
                                    alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlert);
                                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new FilterCreateActivity$$ExternalSyntheticLambda3(filterCreateActivity3, 1));
                                    filterCreateActivity3.showDialog(alertDialog);
                                    TextView textView = (TextView) alertDialog.getButton(-1);
                                    if (textView != null) {
                                        textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                    }
                                }
                                break;
                            default:
                                this.f$0.selectChatsFor(true);
                                break;
                        }
                    }
                };
                arrayList2.add(itemInnerAsButton2);
            }
        }
        arrayList2.add(ItemInner.asShadow(LocaleController.getString(R.string.FilterIncludeInfo)));
        MessagesController.DialogFilter dialogFilter = this.filter;
        if (!dialogFilter.isChatlist()) {
            String string4 = LocaleController.getString(R.string.FilterExclude);
            ItemInner itemInner4 = new ItemInner(0, false);
            itemInner4.text = string4;
            arrayList2.add(itemInner4);
            ItemInner itemInnerAsButton3 = ItemInner.asButton(R.drawable.msg2_chats_add, LocaleController.getString(R.string.FilterRemoveChats), false);
            final int i5 = 2;
            itemInnerAsButton3.onClickListener = new View.OnClickListener(this) {
                public final FilterCreateActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$updateRows$2();
                            break;
                        case 1:
                            FilterCreateActivity filterCreateActivity = this.f$0;
                            filterCreateActivity.includeExpanded = true;
                            filterCreateActivity.updateRows$12();
                            break;
                        case 2:
                            this.f$0.selectChatsFor(false);
                            break;
                        case 3:
                            FilterCreateActivity filterCreateActivity2 = this.f$0;
                            filterCreateActivity2.excludeExpanded = true;
                            filterCreateActivity2.updateRows$12();
                            break;
                        case 4:
                            FilterCreateActivity filterCreateActivity3 = this.f$0;
                            MessagesController.DialogFilter dialogFilter2 = filterCreateActivity3.filter;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                FolderBottomSheet.showForDeletion(dialogFilter2.id, filterCreateActivity3, new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity3, 0));
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(filterCreateActivity3.getParentActivity(), 0, null);
                                String string5 = LocaleController.getString(R.string.FilterDelete);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string5;
                                alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlert);
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new FilterCreateActivity$$ExternalSyntheticLambda3(filterCreateActivity3, 1));
                                filterCreateActivity3.showDialog(alertDialog);
                                TextView textView = (TextView) alertDialog.getButton(-1);
                                if (textView != null) {
                                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            }
                            break;
                        default:
                            this.f$0.selectChatsFor(true);
                            break;
                    }
                }
            };
            arrayList2.add(itemInnerAsButton3);
            if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED) != 0) {
                arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_MUTED, LocaleController.getString(R.string.FilterMuted), "muted", false));
            }
            if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0) {
                arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ, LocaleController.getString(R.string.FilterRead), "read", false));
            }
            if ((this.newFilterFlags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) != 0) {
                arrayList2.add(ItemInner.asChat(MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED, LocaleController.getString(R.string.FilterArchived), "archived", false));
            }
            if (!this.newNeverShow.isEmpty()) {
                int size2 = (this.excludeExpanded || this.newNeverShow.size() < 8) ? this.newNeverShow.size() : Math.min(5, this.newNeverShow.size());
                for (int i6 = 0; i6 < size2; i6++) {
                    long jLongValue2 = ((Long) this.newNeverShow.get(i6)).longValue();
                    ItemInner itemInner5 = new ItemInner(1, false);
                    itemInner5.include = false;
                    itemInner5.did = jLongValue2;
                    arrayList2.add(itemInner5);
                }
                if (size2 != this.newNeverShow.size()) {
                    ItemInner itemInnerAsButton4 = ItemInner.asButton(R.drawable.arrow_more, LocaleController.formatPluralString("FilterShowMoreChats", this.newNeverShow.size() - 5, new Object[0]), false);
                    final int i7 = 3;
                    itemInnerAsButton4.onClickListener = new View.OnClickListener(this) {
                        public final FilterCreateActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i7) {
                                case 0:
                                    this.f$0.lambda$updateRows$2();
                                    break;
                                case 1:
                                    FilterCreateActivity filterCreateActivity = this.f$0;
                                    filterCreateActivity.includeExpanded = true;
                                    filterCreateActivity.updateRows$12();
                                    break;
                                case 2:
                                    this.f$0.selectChatsFor(false);
                                    break;
                                case 3:
                                    FilterCreateActivity filterCreateActivity2 = this.f$0;
                                    filterCreateActivity2.excludeExpanded = true;
                                    filterCreateActivity2.updateRows$12();
                                    break;
                                case 4:
                                    FilterCreateActivity filterCreateActivity3 = this.f$0;
                                    MessagesController.DialogFilter dialogFilter2 = filterCreateActivity3.filter;
                                    if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                        FolderBottomSheet.showForDeletion(dialogFilter2.id, filterCreateActivity3, new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity3, 0));
                                    } else {
                                        AlertDialog.Builder builder = new AlertDialog.Builder(filterCreateActivity3.getParentActivity(), 0, null);
                                        String string5 = LocaleController.getString(R.string.FilterDelete);
                                        AlertDialog alertDialog = builder.alertDialog;
                                        alertDialog.title = string5;
                                        alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlert);
                                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new FilterCreateActivity$$ExternalSyntheticLambda3(filterCreateActivity3, 1));
                                        filterCreateActivity3.showDialog(alertDialog);
                                        TextView textView = (TextView) alertDialog.getButton(-1);
                                        if (textView != null) {
                                            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                        }
                                    }
                                    break;
                                default:
                                    this.f$0.selectChatsFor(true);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(itemInnerAsButton4);
                }
            }
            arrayList2.add(ItemInner.asShadow(LocaleController.getString(R.string.FilterExcludeInfo)));
        }
        if (getMessagesController().folderTags || !getUserConfig().isPremium()) {
            arrayList2.add(new ItemInner(9, false));
            arrayList2.add(new ItemInner(10, false));
            arrayList2.add(ItemInner.asShadow(LocaleController.getString(R.string.FolderTagColorInfo)));
        }
        ArrayList arrayList3 = this.invites;
        if (arrayList3.isEmpty()) {
            String string5 = LocaleController.getString(R.string.FilterShareFolder);
            ItemInner itemInner6 = new ItemInner(0, false);
            itemInner6.text = string5;
            itemInner6.newSpan = true;
            arrayList2.add(itemInner6);
            arrayList2.add(ItemInner.asButton(R.drawable.msg2_link2, LocaleController.getString(R.string.FilterShareFolderButton), false));
            arrayList2.add(ItemInner.asShadow(LocaleController.getString(R.string.FilterInviteLinksHintNew)));
        } else {
            String string6 = LocaleController.getString(R.string.FilterInviteLinks);
            ItemInner itemInner7 = new ItemInner(0, false);
            itemInner7.text = string6;
            itemInner7.newSpan = true;
            arrayList2.add(itemInner7);
            arrayList2.add(new ItemInner(8, false));
            for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i8);
                ItemInner itemInner8 = new ItemInner(7, false);
                itemInner8.link = tL_exportedChatlistInvite;
                arrayList2.add(itemInner8);
            }
            arrayList2.add(ItemInner.asShadow(dialogFilter.isChatlist() ? LocaleController.getString(R.string.FilterInviteLinksHintNew) : LocaleController.getString(R.string.FilterInviteLinksHint)));
        }
        if (!this.creatingNew) {
            ItemInner itemInnerAsButton5 = ItemInner.asButton(0, LocaleController.getString(R.string.FilterDelete), true);
            final int i9 = 4;
            itemInnerAsButton5.onClickListener = new View.OnClickListener(this) {
                public final FilterCreateActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i9) {
                        case 0:
                            this.f$0.lambda$updateRows$2();
                            break;
                        case 1:
                            FilterCreateActivity filterCreateActivity = this.f$0;
                            filterCreateActivity.includeExpanded = true;
                            filterCreateActivity.updateRows$12();
                            break;
                        case 2:
                            this.f$0.selectChatsFor(false);
                            break;
                        case 3:
                            FilterCreateActivity filterCreateActivity2 = this.f$0;
                            filterCreateActivity2.excludeExpanded = true;
                            filterCreateActivity2.updateRows$12();
                            break;
                        case 4:
                            FilterCreateActivity filterCreateActivity3 = this.f$0;
                            MessagesController.DialogFilter dialogFilter2 = filterCreateActivity3.filter;
                            if (dialogFilter2 != null && dialogFilter2.isChatlist()) {
                                FolderBottomSheet.showForDeletion(dialogFilter2.id, filterCreateActivity3, new FilterCreateActivity$$ExternalSyntheticLambda18(filterCreateActivity3, 0));
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(filterCreateActivity3.getParentActivity(), 0, null);
                                String string7 = LocaleController.getString(R.string.FilterDelete);
                                AlertDialog alertDialog = builder.alertDialog;
                                alertDialog.title = string7;
                                alertDialog.message = LocaleController.getString(R.string.FilterDeleteAlert);
                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new FilterCreateActivity$$ExternalSyntheticLambda3(filterCreateActivity3, 1));
                                filterCreateActivity3.showDialog(alertDialog);
                                TextView textView = (TextView) alertDialog.getButton(-1);
                                if (textView != null) {
                                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                                }
                            }
                            break;
                        default:
                            this.f$0.selectChatsFor(true);
                            break;
                    }
                }
            };
            arrayList2.add(itemInnerAsButton5);
            arrayList2.add(ItemInner.asShadow(null));
        }
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.setItems(arrayList, arrayList2);
        }
    }

    public class NewSpan extends ReplacementSpan {
        public final Paint bgPaint;
        public int color;
        public final int fontSize;
        public float height;
        public StaticLayout layout;
        public String text;
        public final TextPaint textPaint;
        public float width;

        public NewSpan(int i) {
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.text = "NEW";
            this.fontSize = i;
            textPaint.setTypeface(AndroidUtilities.bold());
            paint.setStyle(Paint.Style.FILL);
            textPaint.setTextSize(AndroidUtilities.dp(i < 0 ? 12.0f : i));
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            makeLayout();
            int color = this.color;
            if (color == 0) {
                color = paint.getColor();
            }
            Paint paint2 = this.bgPaint;
            paint2.setColor(color);
            TextPaint textPaint = this.textPaint;
            textPaint.setColor(AndroidUtilities.computePerceivedBrightness(color) > 0.721f ? -16777216 : -1);
            paint2.setAlpha((int) (paint2.getAlpha() * 1.0f));
            textPaint.setAlpha((int) (textPaint.getAlpha() * 1.0f));
            float fDp = f + AndroidUtilities.dp(2.0f);
            float fDp2 = (i4 - this.height) + AndroidUtilities.dp(1.0f);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(fDp, fDp2, this.width + fDp, this.height + fDp2);
            float fDp3 = AndroidUtilities.dp(4.4f);
            rectF.inset(AndroidUtilities.dp(-4.0f), AndroidUtilities.dp(this.fontSize == 8 ? -3.66f : -2.33f));
            canvas.drawRoundRect(rectF, fDp3, fDp3, paint2);
            canvas.save();
            canvas.translate(fDp, fDp2);
            this.layout.draw(canvas);
            canvas.restore();
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            makeLayout();
            return (int) (AndroidUtilities.dp(10.0f) + this.width);
        }

        public final void makeLayout() {
            if (this.layout == null) {
                StaticLayout staticLayout = new StaticLayout(this.text, this.textPaint, AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.layout = staticLayout;
                this.width = staticLayout.getLineWidth(0);
                this.height = this.layout.getHeight();
            }
        }

        public NewSpan() {
            TextPaint textPaint = new TextPaint(1);
            this.textPaint = textPaint;
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.text = "NEW";
            textPaint.setTypeface(AndroidUtilities.bold());
            paint.setStyle(Paint.Style.FILL);
            textPaint.setTextSize(AndroidUtilities.dp(10.0f));
        }
    }

    public final void onUpdate(int i, boolean z) {
        MessagesController.DialogFilter dialogFilter;
        if (!this.showedUpdateBulletin && (dialogFilter = this.filter) != null && dialogFilter.isChatlist() && dialogFilter.isMyChatlist()) {
            this.showedUpdateBulletin = true;
            this.showBulletinOnResume = new FilterCreateActivity$$ExternalSyntheticLambda27(this, z, i, 0);
            if (getLayoutContainer() != null) {
                this.showBulletinOnResume.run();
                this.showBulletinOnResume = null;
            }
        }
    }
}
