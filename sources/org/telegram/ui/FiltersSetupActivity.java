package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.GroupCallRecordAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ProgressButton;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UndoView;

public final class FiltersSetupActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public ListAdapter adapter;
    public int filtersSectionEnd;
    public int filtersSectionStart;
    public int filtersStartPosition;
    public int folderTagsPosition;
    public boolean highlightTags;
    public ItemTouchHelper itemTouchHelper;
    public final ArrayList items;
    public ChatActivity.AnonymousClass34 listView;
    public boolean loadedColors;
    public final ArrayList oldItems;
    public boolean orderChanged;
    public UndoView undoView;

    public final class FilterCell extends FrameLayout {
        public final View colorImageView;
        public MessagesController.DialogFilter currentFilter;
        public int lastAppliedColor;
        public int lastColor;
        public final ImageView moveImageView;
        public ValueAnimator moveImageViewAnimator;
        public boolean needDivider;
        public final ImageView optionsImageView;
        public float progressToLock;
        public final AnonymousClass1 shareImageView;
        public boolean shareLoading;
        public final LoadingDrawable shareLoadingDrawable;
        public final SimpleTextView textView;
        public final TextView valueTextView;

        public final class AnonymousClass1 extends ImageView {
            public final int $r8$classId;
            public final Object this$1;
            public final int val$stroke;

            public AnonymousClass1(Object obj, Context context, int i, int i2) {
                super(context);
                this.$r8$classId = i2;
                this.this$1 = obj;
                this.val$stroke = i;
            }

            @Override
            public void onDraw(Canvas canvas) {
                switch (this.$r8$classId) {
                    case 0:
                        super.onDraw(canvas);
                        FilterCell filterCell = (FilterCell) this.this$1;
                        if (filterCell.shareLoading) {
                            int i = this.val$stroke / 2;
                            int width = getWidth() - i;
                            int height = getHeight() - i;
                            LoadingDrawable loadingDrawable = filterCell.shareLoadingDrawable;
                            loadingDrawable.setBounds(i, i, width, height);
                            loadingDrawable.draw(canvas);
                        }
                        break;
                    default:
                        super.onDraw(canvas);
                        break;
                }
            }

            @Override
            public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                switch (this.$r8$classId) {
                    case 1:
                        super.onInitializeAccessibilityEvent(accessibilityEvent);
                        if (accessibilityEvent.getEventType() == 32768) {
                            ((GroupCallRecordAlert.Adapter) this.this$1).this$0.viewPager.setCurrentItem(this.val$stroke, true);
                        }
                        break;
                    default:
                        super.onInitializeAccessibilityEvent(accessibilityEvent);
                        break;
                }
            }

            @Override
            public boolean verifyDrawable(Drawable drawable) {
                switch (this.$r8$classId) {
                    case 0:
                        return drawable == ((FilterCell) this.this$1).shareLoadingDrawable || super.verifyDrawable(drawable);
                    default:
                        return super.verifyDrawable(drawable);
                }
            }
        }

        public FilterCell(Context context) {
            super(context);
            this.lastColor = -2;
            this.lastAppliedColor = -1;
            this.shareLoading = false;
            setWillNotDraw(false);
            ImageView imageView = new ImageView(context);
            this.moveImageView = imageView;
            imageView.setFocusable(false);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.list_reorder);
            int i = Theme.key_stickers_menu;
            int color = Theme.getColor(null, i, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
            imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
            imageView.setClickable(true);
            addView(imageView, LayoutHelper.createFrame(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
            View view = new View(context);
            this.colorImageView = view;
            addView(view, LayoutHelper.createFrame(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            simpleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            simpleTextView.setTextSize(16);
            simpleTextView.setMaxLines(1);
            simpleTextView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
            drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            simpleTextView.setRightDrawable(drawable);
            simpleTextView.setEmojiColor(Theme.getColor(Theme.key_featuredStickers_addButton, ((BaseFragment) FiltersSetupActivity.this).resourceProvider));
            boolean z = LocaleController.isRTL;
            addView(simpleTextView, LayoutHelper.createFrame(-1, -2.0f, (z ? 5 : 3) | 48, z ? 80.0f : 64.0f, 10.0f, z ? 64.0f : 80.0f, 0.0f));
            TextView textView = new TextView(context);
            this.valueTextView = textView;
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false));
            textView.setTextSize(1, 13.0f);
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            textView.setLines(1);
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setPadding(0, 0, 0, 0);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            boolean z2 = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 80.0f : 64.0f, 35.0f, z2 ? 64.0f : 80.0f, 0.0f));
            textView.setVisibility(8);
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.shareLoadingDrawable = loadingDrawable;
            loadingDrawable.appearByGradient = true;
            loadingDrawable.gradientWidthScale = 2.0f;
            int i2 = Theme.key_listSelector;
            int color2 = Theme.getColor(null, i2, false);
            loadingDrawable.setColors(Theme.multAlpha(0.4f, color2), Theme.multAlpha(1.0f, color2), Theme.multAlpha(0.9f, color2), Theme.multAlpha(1.7f, color2));
            int iDp = AndroidUtilities.dp(1.0f);
            loadingDrawable.strokePaint.setStrokeWidth(iDp);
            loadingDrawable.setRadii(AndroidUtilities.dp(40.0f));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this, context, iDp, 0);
            this.shareImageView = anonymousClass1;
            loadingDrawable.setCallback(anonymousClass1);
            anonymousClass1.setFocusable(false);
            anonymousClass1.setScaleType(scaleType);
            anonymousClass1.setBackground(Theme.createSelectorDrawable(color2, 1, -1));
            anonymousClass1.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            anonymousClass1.setContentDescription(LocaleController.getString(R.string.FilterShare));
            anonymousClass1.setVisibility(8);
            anonymousClass1.setImageResource(R.drawable.msg_link_folder);
            anonymousClass1.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            boolean z3 = LocaleController.isRTL;
            addView(anonymousClass1, LayoutHelper.createFrame(40, 40.0f, (z3 ? 3 : 5) | 16, z3 ? 52.0f : 6.0f, 0.0f, z3 ? 6.0f : 52.0f, 0.0f));
            anonymousClass1.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 23));
            ImageView imageView2 = new ImageView(context);
            this.optionsImageView = imageView2;
            imageView2.setFocusable(false);
            imageView2.setScaleType(scaleType);
            imageView2.setBackgroundDrawable(Theme.createSelectorDrawable(Theme.getColor(null, i2, false), 1, -1));
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
            imageView2.setImageResource(R.drawable.msg_actions);
            imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            addView(imageView2, LayoutHelper.createFrame(40, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        }

        public MessagesController.DialogFilter getCurrentFilter() {
            return this.currentFilter;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            float f;
            if (this.needDivider) {
                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(62.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
            }
            MessagesController.DialogFilter dialogFilter = this.currentFilter;
            if (dialogFilter != null) {
                boolean z = dialogFilter.locked;
                if (z) {
                    float f2 = this.progressToLock;
                    if (f2 != 1.0f) {
                        this.progressToLock = f2 + 0.10666667f;
                        invalidate();
                    } else if (!z) {
                        f = this.progressToLock;
                        if (f != 0.0f) {
                            this.progressToLock = f - 0.10666667f;
                            invalidate();
                        }
                    }
                } else if (!z) {
                    f = this.progressToLock;
                    if (f != 0.0f) {
                        this.progressToLock = f - 0.10666667f;
                        invalidate();
                    }
                }
            }
            float fClamp = Utilities.clamp(this.progressToLock, 1.0f, 0.0f);
            this.progressToLock = fClamp;
            SimpleTextView simpleTextView = this.textView;
            simpleTextView.setRightDrawableScale(fClamp);
            simpleTextView.invalidate();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
        }

        public void setOnOptionsClick(View.OnClickListener onClickListener) {
            this.optionsImageView.setOnClickListener(onClickListener);
        }

        public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
            this.moveImageView.setOnTouchListener(onTouchListener);
        }
    }

    public final class HintInnerCell extends FrameLayout {
        public final RLottieImageView imageView;

        public HintInnerCell(Context context, int i, SpannableStringBuilder spannableStringBuilder) {
            super(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setAnimation(i, 90, 90, null);
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.playAnimation();
            rLottieImageView.setImportantForAccessibility(2);
            addView(rLottieImageView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 14.0f, 0.0f, 0.0f));
            rLottieImageView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(this, 24));
            TextView textView = new TextView(context);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText4, false));
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            textView.setText(spannableStringBuilder);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 40.0f, 121.0f, 40.0f, 24.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }
    }

    public final class ItemInner extends AdapterWithDiffUtils.Item {
        public MessagesController.DialogFilter filter;
        public TLRPC.TL_dialogFilterSuggested suggested;
        public CharSequence text;

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemInner)) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            int i = itemInner.viewType;
            int i2 = this.viewType;
            if (i != i2) {
                return false;
            }
            if ((i2 == 0 || i2 == 4 || i2 == 3 || i2 == 6) && !TextUtils.equals(this.text, itemInner.text)) {
                return false;
            }
            int i3 = this.viewType;
            if (i3 == 2) {
                MessagesController.DialogFilter dialogFilter = this.filter;
                boolean z = dialogFilter == null;
                MessagesController.DialogFilter dialogFilter2 = itemInner.filter;
                if (z != (dialogFilter2 == null)) {
                    return false;
                }
                if (dialogFilter != null && dialogFilter.id != dialogFilter2.id) {
                    return false;
                }
            }
            if (i3 == 5) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = this.suggested;
                boolean z2 = tL_dialogFilterSuggested == null;
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested2 = itemInner.suggested;
                if (z2 != (tL_dialogFilterSuggested2 == null)) {
                    return false;
                }
                if (tL_dialogFilterSuggested != null && tL_dialogFilterSuggested.filter.id != tL_dialogFilterSuggested2.filter.id) {
                    return false;
                }
            }
            return true;
        }
    }

    public final class ListAdapter extends AdapterWithDiffUtils {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            return FiltersSetupActivity.this.items.size();
        }

        @Override
        public final int getItemViewType(int i) {
            ItemInner itemInner;
            if (i >= 0) {
                FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
                if (i < filtersSetupActivity.items.size() && (itemInner = (ItemInner) filtersSetupActivity.items.get(i)) != null) {
                    return itemInner.viewType;
                }
                return 3;
            }
            return 3;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return (i == 3 || i == 0 || i == 5 || i == 1) ? false : true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            char c;
            FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
            ArrayList arrayList = filtersSetupActivity.items;
            ItemInner itemInner = (ItemInner) arrayList.get(i);
            if (itemInner == null) {
                return;
            }
            int i2 = i + 1;
            boolean z = i2 < arrayList.size() && ((ItemInner) arrayList.get(i2)).viewType != 3;
            boolean z2 = i2 >= arrayList.size();
            int i3 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i3 == 0) {
                ((HeaderCell) view).setText(itemInner.text);
                return;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (TextUtils.isEmpty(itemInner.text)) {
                        textInfoPrivacyCell.setText(null);
                        textInfoPrivacyCell.setFixedSize(12);
                    } else {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                    }
                    textInfoPrivacyCell.setBottomPadding(z2 ? 32 : 17);
                    return;
                }
                if (i3 != 4) {
                    if (i3 != 5) {
                        if (i3 != 6) {
                            return;
                        }
                        TextCheckCell textCheckCell = (TextCheckCell) view;
                        textCheckCell.setTextAndCheck(itemInner.text, filtersSetupActivity.getMessagesController().folderTags, z);
                        textCheckCell.setCheckBoxIcon(filtersSetupActivity.getUserConfig().isPremium() ? 0 : R.drawable.permission_locked);
                        return;
                    }
                    SuggestedFilterCell suggestedFilterCell = (SuggestedFilterCell) view;
                    TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = itemInner.suggested;
                    suggestedFilterCell.needDivider = z;
                    suggestedFilterCell.suggestedFilter = tL_dialogFilterSuggested;
                    suggestedFilterCell.setWillNotDraw(!z);
                    suggestedFilterCell.textView.setText(tL_dialogFilterSuggested.filter.title.text);
                    suggestedFilterCell.valueTextView.setText(tL_dialogFilterSuggested.description);
                    return;
                }
                TextCell textCell = (TextCell) view;
                Context context = this.mContext;
                Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
                Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
                int color = Theme.getColor(null, Theme.key_switchTrackChecked, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawable.setColorFilter(new PorterDuffColorFilter(color, mode));
                drawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_checkboxCheck, false), mode));
                CombinedDrawable combinedDrawable = new CombinedDrawable(drawable, drawable2);
                textCell.textView.setText(((Object) itemInner.text) + "", false);
                textCell.imageView.setImageDrawable(combinedDrawable);
                return;
            }
            FilterCell filterCell = (FilterCell) view;
            MessagesController.DialogFilter dialogFilter = itemInner.filter;
            MessagesController.DialogFilter dialogFilter2 = filterCell.currentFilter;
            int i4 = dialogFilter2 == null ? -1 : dialogFilter2.id;
            filterCell.currentFilter = dialogFilter;
            int i5 = dialogFilter == null ? -1 : dialogFilter.id;
            boolean z3 = i4 != i5;
            FiltersSetupActivity filtersSetupActivity2 = FiltersSetupActivity.this;
            int i6 = filtersSetupActivity2.getMessagesController().folderTags ? dialogFilter.color : -1;
            View view2 = filterCell.colorImageView;
            if (i6 < 0 || dialogFilter.color == filterCell.lastAppliedColor) {
                c = 1;
            } else {
                int iDp = AndroidUtilities.dp(22.0f);
                int[] iArr = Theme.keys_avatar_nameInMessage;
                filterCell.lastAppliedColor = i6;
                c = 1;
                view2.setBackground(Theme.createCircleDrawable(iDp, filtersSetupActivity2.getThemedColor(iArr[i6 % iArr.length])));
            }
            if (i6 != filterCell.lastColor) {
                ValueAnimator valueAnimator = filterCell.moveImageViewAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ImageView imageView = filterCell.moveImageView;
                if (i4 == i5) {
                    float alpha = imageView.getAlpha();
                    float f = i6 >= 0 ? 0.0f : 1.0f;
                    float[] fArr = new float[2];
                    fArr[0] = alpha;
                    fArr[c] = f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                    filterCell.moveImageViewAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new PhotoViewer$73$$ExternalSyntheticLambda0(filterCell, 14));
                    filterCell.moveImageViewAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    filterCell.moveImageViewAnimator.setDuration(340L);
                    filterCell.moveImageViewAnimator.setStartDelay(i6 >= 0 ? ((long) Math.max(0, filtersSetupActivity2.filtersSectionEnd - i)) * 27 : ((long) Math.max(0, i - filtersSetupActivity2.filtersSectionStart)) * 27);
                    filterCell.moveImageViewAnimator.start();
                } else {
                    imageView.setScaleX(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setScaleY(i6 >= 0 ? 0.5f : 1.0f);
                    imageView.setAlpha(i6 >= 0 ? 0.0f : 1.0f);
                    view2.setScaleX(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setScaleY(i6 >= 0 ? 1.0f : 0.5f);
                    view2.setAlpha(i6 >= 0 ? 1.0f : 0.0f);
                }
                filterCell.lastColor = i6;
            }
            filterCell.shareImageView.setVisibility(dialogFilter.isChatlist() ? 0 : 8);
            StringBuilder sb = new StringBuilder();
            if (dialogFilter.isDefault()) {
                sb.append(LocaleController.getString(R.string.FilterAllChats));
            } else {
                int i7 = dialogFilter.flags;
                int i8 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                if ((i7 & i8) == i8) {
                    sb.append(LocaleController.getString(R.string.FilterAllChats));
                } else {
                    if ((i7 & MessagesController.DIALOG_FILTER_FLAG_CONTACTS) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString(R.string.FilterContacts));
                    }
                    if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString(R.string.FilterNonContacts));
                    }
                    if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_GROUPS) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString(R.string.FilterGroups));
                    }
                    if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_CHANNELS) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString(R.string.FilterChannels));
                    }
                    if ((dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_BOTS) != 0) {
                        if (sb.length() != 0) {
                            sb.append(", ");
                        }
                        sb.append(LocaleController.getString(R.string.FilterBots));
                    }
                }
            }
            if (!dialogFilter.alwaysShow.isEmpty() || !dialogFilter.neverShow.isEmpty()) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(LocaleController.formatPluralString("Exception", dialogFilter.neverShow.size() + dialogFilter.alwaysShow.size(), new Object[0]));
            }
            if (sb.length() == 0) {
                sb.append(LocaleController.getString(R.string.FilterNoChats));
            }
            String string = dialogFilter.name;
            if (dialogFilter.isDefault()) {
                string = LocaleController.getString(R.string.FilterAllChats);
            }
            if (!z3) {
                filterCell.progressToLock = filterCell.currentFilter.locked ? 1.0f : 0.0f;
            }
            SimpleTextView simpleTextView = filterCell.textView;
            Spannable spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(string, simpleTextView.getPaint().getFontMetricsInt(), false), dialogFilter.entities, simpleTextView.getPaint().getFontMetricsInt());
            simpleTextView.setEmojiCacheType(dialogFilter.title_noanimate ? 26 : 0);
            simpleTextView.setText(spannableReplaceAnimatedEmoji, false);
            filterCell.valueTextView.setText(sb);
            filterCell.needDivider = z;
            boolean zIsDefault = dialogFilter.isDefault();
            ImageView imageView2 = filterCell.optionsImageView;
            if (zIsDefault) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
            }
            filterCell.invalidate();
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            Context context = this.mContext;
            if (i == 0) {
                headerCell = new HeaderCell(context);
            } else if (i == 1) {
                headerCell = new HintInnerCell(context, R.raw.filters, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.CreateNewFilterInfo, new Object[0])));
            } else if (i == 2) {
                FilterCell filterCell = FiltersSetupActivity.this.new FilterCell(context);
                filterCell.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                filterCell.setOnReorderButtonTouchListener(new PassportActivity$$ExternalSyntheticLambda22(7, this, filterCell));
                filterCell.setOnOptionsClick(new GroupCallSheet$$ExternalSyntheticLambda5(this, 25));
                headerCell = filterCell;
            } else if (i == 3) {
                headerCell = new TextInfoPrivacyCell(context, 24, null);
            } else if (i == 4) {
                headerCell = new TextCell(context);
            } else if (i != 6) {
                SuggestedFilterCell suggestedFilterCell = new SuggestedFilterCell(context);
                suggestedFilterCell.setAddOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(8, this, suggestedFilterCell));
                headerCell = suggestedFilterCell;
            } else {
                headerCell = new TextCheckCell(context);
            }
            return new RecyclerListView.Holder(headerCell);
        }
    }

    public final class SuggestedFilterCell extends FrameLayout {
        public final ProgressButton addButton;
        public boolean needDivider;
        public TLRPC.TL_dialogFilterSuggested suggestedFilter;
        public final TextView textView;
        public final TextView valueTextView;

        public SuggestedFilterCell(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), 16.0f, 1, true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 10.0f, 22.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.valueTextView = textView2;
            ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), 13.0f, 1, true);
            textView2.setEllipsize(truncateAt);
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, LocaleController.isRTL ? 5 : 3, 22.0f, 35.0f, 22.0f, 0.0f));
            ProgressButton progressButton = new ProgressButton(context);
            this.addButton = progressButton;
            progressButton.setText(LocaleController.getString(R.string.Add));
            progressButton.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            progressButton.setProgressColor(Theme.getColor(null, Theme.key_featuredStickers_buttonProgress, false));
            int color = Theme.getColor(null, Theme.key_featuredStickers_addButton, false);
            Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            progressButton.setBackgroundRoundRect(14.0f, color);
            addView(progressButton, LayoutHelper.createFrameRelatively(-2.0f, 28.0f, 8388661, 0.0f, 18.0f, 14.0f, 0.0f));
        }

        public TLRPC.TL_dialogFilterSuggested getSuggestedFilter() {
            return this.suggestedFilter;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            if (this.needDivider) {
                canvas.drawLine(0.0f, getHeight() - 1, getWidth() - getPaddingRight(), getHeight() - 1, Theme.dividerPaint);
            }
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.setText(this.addButton.getText());
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(64.0f));
            measureChildWithMargins(this.addButton, i, 0, i2, 0);
            TextView textView = this.textView;
            ProgressButton progressButton = this.addButton;
            measureChildWithMargins(textView, i, progressButton.getMeasuredWidth(), i2, 0);
            measureChildWithMargins(this.valueTextView, i, progressButton.getMeasuredWidth(), i2, 0);
        }

        public void setAddOnClickListener(View.OnClickListener onClickListener) {
            this.addButton.setOnClickListener(onClickListener);
        }
    }

    public final class TextCell extends FrameLayout {
        public final ImageView imageView;
        public final SimpleTextView textView;

        public TextCell(Context context) {
            super(context);
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.textView = simpleTextView;
            simpleTextView.setTextSize(16);
            simpleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            int i = Theme.key_windowBackgroundWhiteBlueText2;
            simpleTextView.setTextColor(Theme.getColor(null, i, false));
            simpleTextView.setTag(Integer.valueOf(i));
            addView(simpleTextView);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            addView(imageView);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int iDp;
            int i5 = i3 - i;
            SimpleTextView simpleTextView = this.textView;
            int textHeight = ((i4 - i2) - simpleTextView.getTextHeight()) / 2;
            boolean z2 = LocaleController.isRTL;
            ImageView imageView = this.imageView;
            if (z2) {
                iDp = (getMeasuredWidth() - simpleTextView.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
            } else {
                iDp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
            }
            simpleTextView.layout(iDp, textHeight, simpleTextView.getMeasuredWidth() + iDp, simpleTextView.getMeasuredHeight() + textHeight);
            int iDp2 = !LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : (i5 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
            imageView.layout(iDp2, 0, imageView.getMeasuredWidth() + iDp2, imageView.getMeasuredHeight());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            AndroidUtilities.dp(48.0f);
            this.textView.measure(OKLCH.m(size, 94.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), 1073741824));
            this.imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
            setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
        }
    }

    public final class TouchHelperCallback extends ItemTouchHelper.Callback {
        public TouchHelperCallback() {
        }

        @Override
        public final void clearView(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            Object tag = view.getTag();
            if (tag instanceof Float) {
                float fFloatValue = ((Float) tag).floatValue();
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                ViewCompat.Api21Impl.setElevation(view, fFloatValue);
            }
            view.setTag(null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            View view2 = viewHolder.itemView;
            view2.setPressed(false);
            view2.setTag(R.id.dragging, null);
        }

        @Override
        public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 2 ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public final boolean isLongPressDragEnabled() {
            return true;
        }

        @Override
        public final void onChildDraw(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            View view = viewHolder.itemView;
            if (z && view.getTag() == null) {
                WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
                Float fValueOf = Float.valueOf(ViewCompat.Api21Impl.getElevation(view));
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        float elevation = ViewCompat.Api21Impl.getElevation(childAt);
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                ViewCompat.Api21Impl.setElevation(view, f3 + 1.0f);
                view.setTag(fValueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        @Override
        public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            MessagesController.DialogFilter dialogFilter;
            MessagesController.DialogFilter dialogFilter2;
            if (viewHolder.mItemViewType != viewHolder2.mItemViewType) {
                return false;
            }
            ListAdapter listAdapter = FiltersSetupActivity.this.adapter;
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            FiltersSetupActivity filtersSetupActivity = FiltersSetupActivity.this;
            int i = filtersSetupActivity.filtersStartPosition;
            if (adapterPosition >= i && adapterPosition2 >= i) {
                ItemInner itemInner = (ItemInner) filtersSetupActivity.items.get(adapterPosition);
                FiltersSetupActivity filtersSetupActivity2 = FiltersSetupActivity.this;
                ItemInner itemInner2 = (ItemInner) filtersSetupActivity2.items.get(adapterPosition2);
                if (itemInner != null && itemInner2 != null && (dialogFilter = itemInner.filter) != null && (dialogFilter2 = itemInner2.filter) != null) {
                    int i2 = dialogFilter.order;
                    dialogFilter.order = dialogFilter2.order;
                    dialogFilter2.order = i2;
                    ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                    try {
                        arrayList.set(adapterPosition - filtersSetupActivity2.filtersStartPosition, itemInner2.filter);
                        arrayList.set(adapterPosition2 - filtersSetupActivity2.filtersStartPosition, itemInner.filter);
                    } catch (Exception unused) {
                    }
                    filtersSetupActivity2.orderChanged = true;
                    filtersSetupActivity2.updateRows$3(true);
                }
            }
            return true;
        }

        @Override
        public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                FiltersSetupActivity.this.listView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            } else {
                int i2 = 25;
                AndroidUtilities.cancelRunOnUIThread(new ComposeDrawable$$ExternalSyntheticLambda0(this, i2));
                AndroidUtilities.runOnUIThread(new ComposeDrawable$$ExternalSyntheticLambda0(this, i2), 320L);
            }
            if (viewHolder != null) {
                viewHolder.itemView.setTag(R.id.dragging, i == 2 ? Boolean.TRUE : null);
            }
        }

        @Override
        public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
        }
    }

    public FiltersSetupActivity() {
        super(null);
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.filtersSectionStart = -1;
        this.filtersSectionEnd = -1;
    }

    public final void createFolder(INavigationLayout iNavigationLayout) {
        int size = getMessagesController().getDialogFilters().size();
        if ((size - 1 >= getMessagesController().dialogFiltersLimitDefault && !getUserConfig().isPremium()) || size >= getMessagesController().dialogFiltersLimitPremium) {
            showDialog(new LimitReachedBottomSheet(3, this.currentAccount, getParentActivity(), this, null));
        } else if (iNavigationLayout != null) {
            ((ActionBarLayout) iNavigationLayout).presentFragment(new INavigationLayout.NavigationParams(new FilterCreateActivity(null, null)));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Filters));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 18));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 24);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
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
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        this.listView.setLayoutManager(new LinearLayoutManager(1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new TouchHelperCallback());
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.listView);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        anonymousClass35.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new DialogsActivity$$ExternalSyntheticLambda89(3, this, context));
        if (this.highlightTags) {
            updateRows$3(false);
            this.highlightTags = false;
            this.listView.scrollToPosition(this.adapter.getItemCount() - 1);
            AndroidUtilities.runOnUIThread(new FiltersSetupActivity$$ExternalSyntheticLambda1(this, 0), 200L);
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.dialogFiltersUpdated) {
            updateRows$3(true);
        } else if (i == NotificationCenter.suggestedFiltersLoaded) {
            updateRows$3(true);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, TextCell.class, FilterCell.class, SuggestedFilterCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FilterCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FilterCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        int i = Theme.key_stickers_menu;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FilterCell.class}, new String[]{"moveImageView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{FilterCell.class}, new String[]{"optionsImageView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{FilterCell.class}, new String[]{"optionsImageView"}, null, null, -1, null, Theme.key_stickers_menuSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_checkboxCheck));
        return arrayList;
    }

    public final UndoView getUndoView() {
        if (getParentActivity() == null) {
            return null;
        }
        if (this.undoView == null) {
            FrameLayout frameLayout = (FrameLayout) this.fragmentView;
            UndoView undoView = new UndoView(getParentActivity(), null, false, null);
            this.undoView = undoView;
            frameLayout.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            this.undoView.setTranslationY(-getBottomInset());
        }
        return this.undoView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$4(Context context, View view, int i) {
        ItemInner itemInner;
        if (i >= 0) {
            ArrayList arrayList = this.items;
            if (i < arrayList.size() && (itemInner = (ItemInner) arrayList.get(i)) != null) {
                int i2 = itemInner.viewType;
                if (i2 == 6) {
                    if (!getUserConfig().isPremium()) {
                        showDialog(new PremiumFeatureBottomSheet(this, getParentActivity(), getCurrentAccount(), false, 35, true, null));
                        return;
                    }
                    TLRPC.TL_messages_toggleDialogFilterTags tL_messages_toggleDialogFilterTags = new TLRPC.TL_messages_toggleDialogFilterTags();
                    tL_messages_toggleDialogFilterTags.enabled = !getMessagesController().folderTags;
                    getMessagesController().setFolderTags(tL_messages_toggleDialogFilterTags.enabled);
                    getConnectionsManager().sendRequest(tL_messages_toggleDialogFilterTags, new LinkManager$$ExternalSyntheticLambda8(16, this, tL_messages_toggleDialogFilterTags));
                    ((TextCheckCell) view).setChecked(getMessagesController().folderTags);
                    ListAdapter listAdapter = this.adapter;
                    int i3 = this.filtersSectionStart;
                    listAdapter.mObservable.notifyItemRangeChanged(i3, this.filtersSectionEnd - i3, null);
                    return;
                }
                if (i2 != 2) {
                    if (i2 == 4) {
                        createFolder(getParentLayout());
                        return;
                    }
                    return;
                }
                MessagesController.DialogFilter dialogFilter = itemInner.filter;
                if (dialogFilter == null || dialogFilter.isDefault()) {
                    return;
                }
                if (dialogFilter.locked) {
                    showDialog(new LimitReachedBottomSheet(3, this.currentAccount, context, this, null));
                } else {
                    presentFragment(new FilterCreateActivity(dialogFilter, null));
                }
            }
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        updateRows$3(false);
        getMessagesController().loadRemoteFilters(true);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (getMessagesController().suggestedFilters.isEmpty()) {
            getMessagesController().loadSuggestedFilters();
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        NotificationCenter notificationCenter = getNotificationCenter();
        int i = NotificationCenter.dialogFiltersUpdated;
        notificationCenter.removeObserver(this, i);
        getNotificationCenter().removeObserver(this, NotificationCenter.suggestedFiltersLoaded);
        if (this.orderChanged) {
            int iM = 0;
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
            getMessagesStorage().saveDialogFiltersOrder();
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            int size = dialogFilters.size();
            while (iM < size) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(iM);
                iM = LocationController$$ExternalSyntheticOutline0.m(dialogFilter.id, iM, 1, tL_messages_updateDialogFiltersOrder.order);
            }
            getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, new PassportActivity$$ExternalSyntheticLambda1(1));
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
    }

    public final void updateRows$3(boolean z) {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34 != null) {
            ArrayList arrayList = anonymousClass34.forcedSections;
            if (arrayList == null) {
                anonymousClass34.forcedSections = new ArrayList();
            } else {
                arrayList.clear();
            }
        }
        ArrayList arrayList2 = this.oldItems;
        arrayList2.clear();
        ArrayList arrayList3 = this.items;
        arrayList2.addAll(arrayList3);
        arrayList3.clear();
        ArrayList<TLRPC.TL_dialogFilterSuggested> arrayList4 = getMessagesController().suggestedFilters;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        arrayList3.add(new ItemInner(1, false));
        if (!arrayList4.isEmpty() && dialogFilters.size() < 10) {
            int size = arrayList3.size();
            String string = LocaleController.getString(R.string.FilterRecommended);
            ItemInner itemInner = new ItemInner(0, false);
            itemInner.text = string;
            arrayList3.add(itemInner);
            for (int i = 0; i < arrayList4.size(); i++) {
                TLRPC.TL_dialogFilterSuggested tL_dialogFilterSuggested = arrayList4.get(i);
                ItemInner itemInner2 = new ItemInner(5, false);
                itemInner2.suggested = tL_dialogFilterSuggested;
                arrayList3.add(itemInner2);
            }
            ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
            if (anonymousClass35 != null) {
                anonymousClass35.forcedSections.add(Long.valueOf(AndroidUtilities.pack(size, arrayList3.size() - 1)));
            }
            ItemInner itemInner3 = new ItemInner(3, false);
            itemInner3.text = null;
            arrayList3.add(itemInner3);
        }
        if (dialogFilters.isEmpty()) {
            this.filtersSectionEnd = -1;
            this.filtersSectionStart = -1;
        } else {
            this.filtersSectionStart = arrayList3.size();
            String string2 = LocaleController.getString(R.string.Filters);
            ItemInner itemInner4 = new ItemInner(0, false);
            itemInner4.text = string2;
            arrayList3.add(itemInner4);
            this.filtersStartPosition = arrayList3.size();
            for (int i2 = 0; i2 < dialogFilters.size(); i2++) {
                MessagesController.DialogFilter dialogFilter = dialogFilters.get(i2);
                ItemInner itemInner5 = new ItemInner(2, false);
                itemInner5.filter = dialogFilter;
                arrayList3.add(itemInner5);
                if (MessagesController.getInstance(this.currentAccount).folderTags && dialogFilters.get(i2).color >= 0) {
                    this.loadedColors = true;
                }
            }
            int size2 = arrayList3.size();
            this.filtersSectionEnd = size2;
            ChatActivity.AnonymousClass34 anonymousClass36 = this.listView;
            if (anonymousClass36 != null) {
                anonymousClass36.forcedSections.add(Long.valueOf(AndroidUtilities.pack(this.filtersSectionStart, (size2 - 1) + (dialogFilters.size() >= getMessagesController().dialogFiltersLimitPremium ? 0 : 1))));
            }
        }
        if (dialogFilters.size() < getMessagesController().dialogFiltersLimitPremium) {
            String string3 = LocaleController.getString(R.string.CreateNewFilter);
            ItemInner itemInner6 = new ItemInner(4, false);
            itemInner6.text = string3;
            arrayList3.add(itemInner6);
        }
        ItemInner itemInner7 = new ItemInner(3, false);
        itemInner7.text = null;
        arrayList3.add(itemInner7);
        this.folderTagsPosition = arrayList3.size();
        arrayList3.size();
        String string4 = LocaleController.getString(R.string.FolderShowTags);
        ItemInner itemInner8 = new ItemInner(6, false);
        itemInner8.text = string4;
        arrayList3.add(itemInner8);
        CharSequence charSequenceReplaceSingleTag = !getUserConfig().isPremium() ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FolderShowTagsInfoPremium), Theme.key_windowBackgroundWhiteBlueHeader, 2, new FiltersSetupActivity$$ExternalSyntheticLambda1(this, 1)) : LocaleController.getString(R.string.FolderShowTagsInfo);
        ItemInner itemInner9 = new ItemInner(3, false);
        itemInner9.text = charSequenceReplaceSingleTag;
        arrayList3.add(itemInner9);
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            if (z) {
                listAdapter.setItems(arrayList2, arrayList3);
            } else {
                listAdapter.mObservable.notifyChanged();
            }
        }
    }
}
