package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.transition.ChangeBounds;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import java.util.HashMap;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.AccountSelectCell;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda70;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda77;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.SearchField;
import org.telegram.ui.Components.TimerDrawable;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.GroupCallActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkEditActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.iv.RichEditText;

public class ActionBarMenuItem extends FrameLayout {
    public int additionalXOffset;
    public int additionalYOffset;
    public boolean allowCloseAnimation;
    public boolean animateClear;
    public boolean animationEnabled;
    public EditTextEmoji.AnonymousClass3 clearButton;
    public AnimatorSet clearButtonAnimator;
    public final ArrayList currentSearchFilters;
    public ActionBarMenuItemDelegate delegate;
    public float dimMenu;
    public boolean fixBackground;
    public boolean forceSmoothKeyboard;
    public final RLottieImageView iconView;
    public int iconViewResId;
    public boolean isSearchField;
    public boolean layoutInScreen;
    public ArrayList lazyList;
    public HashMap lazyMap;
    public OKLCH listener;
    public int[] location;
    public boolean longClickEnabled;
    public final AnimationNotificationsLocker notificationsLocker;
    public View.OnClickListener onClickListener;
    public boolean overrideMenuClick;
    public final ActionBarMenu parentMenu;
    public ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    public ActionBarPopupWindow popupWindow;
    public boolean processedPopupClick;
    public SearchField.AnonymousClass1 progressDrawable;
    public Rect rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public View searchAdditionalButton;
    public AnonymousClass7 searchContainer;
    public AnimatorSet searchContainerAnimator;
    public UsersSelectActivity.AnonymousClass4 searchField;
    public TextView searchFieldCaption;
    public CharSequence searchFieldHint;
    public CharSequence searchFieldText;
    public LinearLayout searchFilterLayout;
    public int searchItemPaddingStart;
    public int selectedFilterIndex;
    public View selectedMenuView;
    public Theme$$ExternalSyntheticLambda8 showMenuRunnable;
    public ActionBarMenuItem showSubMenuFrom;
    public boolean showSubmenuByMove;
    public ActionBarSubMenuItemDelegate subMenuDelegate;
    public BlurredBackgroundDrawableViewFactory subMenuFactory;
    public int subMenuOpenSide;
    public BlurredBackgroundProviderBuilder subMenuProvider;
    public final TextView textView;
    public float transitionOffset;
    public int xOffset;
    public int yOffset;

    public final class AnonymousClass7 extends FrameLayout {
        public boolean ignoreRequestLayout;

        public AnonymousClass7(Context context) {
            super(context);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int measuredWidth;
            super.onLayout(z, i, i2, i3, i4);
            boolean z2 = LocaleController.isRTL;
            ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
            if (!z2 && actionBarMenuItem.searchFieldCaption.getVisibility() == 0) {
                measuredWidth = AndroidUtilities.dp(4.0f) + actionBarMenuItem.searchFieldCaption.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            if (actionBarMenuItem.searchFilterLayout.getVisibility() == 0) {
                measuredWidth += actionBarMenuItem.searchFilterLayout.getMeasuredWidth();
            }
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = actionBarMenuItem.searchField;
            anonymousClass4.layout(measuredWidth, anonymousClass4.getTop(), actionBarMenuItem.searchField.getMeasuredWidth() + measuredWidth, actionBarMenuItem.searchField.getBottom());
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iDp;
            AnonymousClass7 anonymousClass7;
            int iDp2;
            ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
            actionBarMenuItem.getClass();
            measureChildWithMargins(actionBarMenuItem.clearButton, i, 0, i2, 0);
            View view = actionBarMenuItem.searchAdditionalButton;
            if (view != null) {
                measureChildWithMargins(view, i, 0, i2, 0);
            }
            if (LocaleController.isRTL) {
                if (actionBarMenuItem.searchFieldCaption.getVisibility() == 0) {
                    measureChildWithMargins(actionBarMenuItem.searchFieldCaption, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                    iDp = AndroidUtilities.dp(4.0f) + actionBarMenuItem.searchFieldCaption.getMeasuredWidth();
                } else {
                    iDp = 0;
                }
                int size = View.MeasureSpec.getSize(i);
                this.ignoreRequestLayout = true;
                measureChildWithMargins(actionBarMenuItem.searchFilterLayout, i, iDp, i2, 0);
                int measuredWidth = actionBarMenuItem.searchFilterLayout.getVisibility() == 0 ? actionBarMenuItem.searchFilterLayout.getMeasuredWidth() : 0;
                measureChildWithMargins(actionBarMenuItem.searchField, OKLCH.m(size, 12.0f, 0), iDp + measuredWidth, i2, 0);
                this.ignoreRequestLayout = false;
                setMeasuredDimension(Math.max(actionBarMenuItem.searchField.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i2));
                return;
            }
            if (actionBarMenuItem.searchFieldCaption.getVisibility() == 0) {
                anonymousClass7 = this;
                anonymousClass7.measureChildWithMargins(actionBarMenuItem.searchFieldCaption, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                iDp2 = AndroidUtilities.dp(4.0f) + actionBarMenuItem.searchFieldCaption.getMeasuredWidth();
            } else {
                anonymousClass7 = this;
                iDp2 = 0;
            }
            int size2 = View.MeasureSpec.getSize(i);
            anonymousClass7.ignoreRequestLayout = true;
            anonymousClass7.measureChildWithMargins(actionBarMenuItem.searchFilterLayout, i, iDp2, i2, 0);
            int measuredWidth2 = actionBarMenuItem.searchFilterLayout.getVisibility() == 0 ? actionBarMenuItem.searchFilterLayout.getMeasuredWidth() : 0;
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = actionBarMenuItem.searchField;
            int i3 = iDp2 + measuredWidth2;
            View view2 = actionBarMenuItem.searchAdditionalButton;
            measureChildWithMargins(anonymousClass4, i, i3 + (view2 != null ? view2.getMeasuredWidth() : 0), i2, 0);
            this.ignoreRequestLayout = false;
            setMeasuredDimension(Math.max(actionBarMenuItem.searchField.getMeasuredWidth() + measuredWidth2, size2), View.MeasureSpec.getSize(i2));
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreRequestLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
            EditTextEmoji.AnonymousClass3 anonymousClass3 = actionBarMenuItem.clearButton;
            if (anonymousClass3 == null || anonymousClass3.getTag() == null) {
                return;
            }
            actionBarMenuItem.clearButton.setAlpha(f);
            actionBarMenuItem.clearButton.setScaleX(f);
            actionBarMenuItem.clearButton.setScaleY(f);
        }

        @Override
        public final void setVisibility(int i) {
            super.setVisibility(i);
            ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
            EditTextEmoji.AnonymousClass3 anonymousClass3 = actionBarMenuItem.clearButton;
            if (anonymousClass3 != null) {
                anonymousClass3.setVisibility(i);
            }
            View view = actionBarMenuItem.searchAdditionalButton;
            if (view != null) {
                view.setVisibility(i);
            }
            actionBarMenuItem.getClass();
        }
    }

    public interface ActionBarMenuItemDelegate {
        void onItemClick(int i);
    }

    public interface ActionBarSubMenuItemDelegate {
        void onHideSubMenu();

        void onShowSubMenu();
    }

    public final class Item {
        public boolean dismiss;
        public int icon;
        public Integer iconColor;
        public RLottieDrawable iconDrawable;
        public int id;
        public ChatActivity$$ExternalSyntheticLambda70 overrideClickListener;
        public CharSequence text;
        public Integer textColor;
        public int textSizeDp;
        public View view;
        public ProfileActivity.AnonymousClass39 viewToSwipeBack;
        public final int viewType;
        public int visibility = 0;
        public int rightIconVisibility = 0;

        public Item(int i) {
            this.viewType = i;
        }

        public final void setColors(int i, int i2) {
            Integer num = this.textColor;
            if (num == null || this.iconColor == null || num.intValue() != i || this.iconColor.intValue() != i2) {
                this.textColor = Integer.valueOf(i);
                this.iconColor = Integer.valueOf(i2);
                View view = this.view;
                if (view instanceof ActionBarMenuSubItem) {
                    ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) view;
                    actionBarMenuSubItem.setTextColor(i);
                    actionBarMenuSubItem.setIconColor(i2);
                }
            }
        }

        public final void setOnClickListener(ChatActivity$$ExternalSyntheticLambda70 chatActivity$$ExternalSyntheticLambda70) {
            this.overrideClickListener = chatActivity$$ExternalSyntheticLambda70;
            View view = this.view;
            if (view != null) {
                view.setOnClickListener(chatActivity$$ExternalSyntheticLambda70);
            }
        }

        public final void setText(CharSequence charSequence) {
            this.text = charSequence;
            View view = this.view;
            if (view instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) view).setText(charSequence);
            } else if (view instanceof TextView) {
                ((TextView) view).setText(charSequence);
            }
        }

        public final void setVisibility(int i) {
            this.visibility = i;
            View view = this.view;
            if (view != null) {
                view.setVisibility(i);
            }
        }
    }

    public final class SearchFilterView extends FrameLayout implements FactorAnimator.Target {
        public final BoolAnimator animatorIsSelected;
        public final BackupImageView avatarImageView;
        public final ImageView closeIconView;
        public FiltersView.MediaFilterData data;
        public boolean glass;
        public boolean isCommunity;
        public int mBackgroundColor;
        public int mBackgroundRadius;
        public final Theme$$ExternalSyntheticLambda8 removeSelectionRunnable;
        public final Theme.ResourcesProvider resourcesProvider;
        public CombinedDrawable thumbDrawable;
        public final TextView titleView;

        public SearchFilterView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.animatorIsSelected = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
            this.removeSelectionRunnable = new Theme$$ExternalSyntheticLambda8(this, 3);
            this.resourcesProvider = resourcesProvider;
            BackupImageView backupImageView = new BackupImageView(context);
            this.avatarImageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(32.0f, 32));
            ImageView imageView = new ImageView(context);
            this.closeIconView = imageView;
            imageView.setImageResource(R.drawable.ic_close_white);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 16, 8.0f, 0.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextSize(1, 14.0f);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 38.0f, 0.0f, 12.0f, 0.0f));
            this.mBackgroundRadius = AndroidUtilities.dp(28.0f);
            updateColors$1();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            float f = this.mBackgroundRadius;
            canvas.drawRoundRect(0.0f, 0.0f, width, height, f, f, Theme.fillingPaint(this.mBackgroundColor));
            super.dispatchDraw(canvas);
        }

        public FiltersView.MediaFilterData getFilter() {
            return this.data;
        }

        @Override
        public final void onFactorChangeFinished(float f, int i) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            if (i == 0) {
                updateColors$1();
                invalidate();
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            if (this.isCommunity) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(135.0f), Integer.MIN_VALUE), i2);
            } else {
                super.onMeasure(i, i2);
            }
        }

        public void setData(FiltersView.MediaFilterData mediaFilterData) {
            this.data = mediaFilterData;
            this.isCommunity = false;
            TextView textView = this.titleView;
            String string = mediaFilterData.title;
            if (string == null) {
                string = LocaleController.getString(mediaFilterData.titleResId);
            }
            textView.setText(string);
            CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(32.0f), mediaFilterData.iconResFilled);
            this.thumbDrawable = combinedDrawableCreateCircleDrawableWithIcon;
            int i = Theme.key_featuredStickers_addButton;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon, Theme.getColor(i, resourcesProvider), false);
            CombinedDrawable combinedDrawable = this.thumbDrawable;
            int i2 = Theme.key_featuredStickers_buttonText;
            Theme.setCombinedDrawableColor(combinedDrawable, Theme.getColor(i2, resourcesProvider), true);
            BackupImageView backupImageView = this.avatarImageView;
            int i3 = mediaFilterData.filterType;
            if (i3 != 4) {
                if (i3 != 7) {
                    backupImageView.setImageDrawable(this.thumbDrawable);
                    return;
                }
                CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon2 = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
                int iDp = AndroidUtilities.dp(16.0f);
                int iDp2 = AndroidUtilities.dp(16.0f);
                combinedDrawableCreateCircleDrawableWithIcon2.iconWidth = iDp;
                combinedDrawableCreateCircleDrawableWithIcon2.iconHeight = iDp2;
                Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon2, Theme.getColor(i, resourcesProvider), false);
                Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon2, Theme.getColor(i2, resourcesProvider), true);
                backupImageView.setImageDrawable(combinedDrawableCreateCircleDrawableWithIcon2);
                return;
            }
            TLObject tLObject = mediaFilterData.chat;
            if (!(tLObject instanceof TLRPC.User)) {
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    this.isCommunity = ChatObject.isCommunity(chat);
                    ImageReceiver imageReceiver = backupImageView.getImageReceiver();
                    int iDp3 = AndroidUtilities.dp(this.isCommunity ? 10.0f : 16.0f);
                    this.mBackgroundRadius = iDp3;
                    imageReceiver.setRoundRadius(iDp3);
                    backupImageView.getImageReceiver().setForUserOrChat(chat, this.thumbDrawable);
                    return;
                }
                return;
            }
            TLRPC.User user = (TLRPC.User) tLObject;
            if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id != user.id) {
                backupImageView.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                backupImageView.getImageReceiver().setForUserOrChat(user, this.thumbDrawable);
                return;
            }
            CombinedDrawable combinedDrawableCreateCircleDrawableWithIcon3 = Theme.createCircleDrawableWithIcon(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
            int iDp4 = AndroidUtilities.dp(16.0f);
            int iDp5 = AndroidUtilities.dp(16.0f);
            combinedDrawableCreateCircleDrawableWithIcon3.iconWidth = iDp4;
            combinedDrawableCreateCircleDrawableWithIcon3.iconHeight = iDp5;
            Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon3, Theme.getColor(i, resourcesProvider), false);
            Theme.setCombinedDrawableColor(combinedDrawableCreateCircleDrawableWithIcon3, Theme.getColor(i2, resourcesProvider), true);
            backupImageView.setImageDrawable(combinedDrawableCreateCircleDrawableWithIcon3);
        }

        public void setExpanded(boolean z) {
            TextView textView = this.titleView;
            if (z) {
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
                setSelectedForDelete(false);
            }
        }

        public void setSelectedForDelete(boolean z) {
            BoolAnimator boolAnimator = this.animatorIsSelected;
            if (boolAnimator.value == z) {
                return;
            }
            Theme$$ExternalSyntheticLambda8 theme$$ExternalSyntheticLambda8 = this.removeSelectionRunnable;
            AndroidUtilities.cancelRunOnUIThread(theme$$ExternalSyntheticLambda8);
            boolAnimator.setValue(z, true);
            if (z) {
                AndroidUtilities.runOnUIThread(theme$$ExternalSyntheticLambda8, 2000L);
            }
        }

        public final void updateColors$1() {
            float f = this.animatorIsSelected.floatValue;
            boolean z = this.glass;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int iMultAlpha = z ? Theme.multAlpha(0.075f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider)) : Theme.getColor(Theme.key_groupcreate_spanBackground, resourcesProvider);
            int i = Theme.key_featuredStickers_addButton;
            int color = Theme.getColor(i, resourcesProvider);
            int color2 = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
            int i2 = Theme.key_featuredStickers_buttonText;
            int color3 = Theme.getColor(i2, resourcesProvider);
            this.mBackgroundColor = ColorUtils.blendARGB(f, iMultAlpha, color);
            this.titleView.setTextColor(ColorUtils.blendARGB(f, color2, color3));
            ImageView imageView = this.closeIconView;
            imageView.setColorFilter(color3);
            imageView.setAlpha(f);
            float f2 = 0.82f * f;
            imageView.setScaleX(f2);
            imageView.setScaleY(f2);
            CombinedDrawable combinedDrawable = this.thumbDrawable;
            if (combinedDrawable != null) {
                Theme.setCombinedDrawableColor(combinedDrawable, Theme.getColor(i, resourcesProvider), false);
                Theme.setCombinedDrawableColor(this.thumbDrawable, Theme.getColor(i2, resourcesProvider), true);
            }
            this.avatarImageView.setAlpha(1.0f - f);
            FiltersView.MediaFilterData mediaFilterData = this.data;
            if (mediaFilterData != null && mediaFilterData.filterType == 7) {
                setData(mediaFilterData);
            }
            invalidate();
        }
    }

    public ActionBarMenuItem(LaunchActivity launchActivity, int i) {
        this(launchActivity, null, 0, i, false, null);
    }

    public static ActionBarMenuSubItem addItem(boolean z, boolean z2, ViewGroup viewGroup, int i, CharSequence charSequence, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(z3 ? 1 : 0, viewGroup.getContext(), resourcesProvider, z, z2);
        actionBarMenuSubItem.setTextAndIcon(charSequence, i, null);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        viewGroup.addView(actionBarMenuSubItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        actionBarMenuSubItem.setLayoutParams(layoutParams);
        return actionBarMenuSubItem;
    }

    public final ActionBarPopupWindow.GapView addColoredGap(int i) {
        createPopupLayout();
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), Theme.key_actionBarDefaultSubmenuSeparator, this.resourcesProvider);
        if (i != -1) {
            gapView.setTag(Integer.valueOf(i));
        }
        gapView.setTag(R.id.fit_width_tag, 1);
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        actionBarPopupWindowLayout.linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
        return gapView;
    }

    public final TextView addDivider(int i) {
        createPopupLayout();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.popupLayout.linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int iDp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = iDp;
        layoutParams.topMargin = iDp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public final void addSubItem(AccountSelectCell accountSelectCell, int i) {
        createPopupLayout();
        accountSelectCell.setLayoutParams(new LinearLayout.LayoutParams(-2, i));
        this.popupLayout.linearLayout.addView(accountSelectCell);
        accountSelectCell.setTag(8);
        accountSelectCell.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda2(this, 1));
        accountSelectCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
    }

    public final ActionBarMenuSubItem addSwipeBackItem(int i, TimerDrawable timerDrawable, String str, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        createPopupLayout();
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
        actionBarMenuSubItem.setTextAndIcon(str, i, timerDrawable);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarMenuSubItem.setRightIcon(R.drawable.msg_arrowright);
        this.popupLayout.linearLayout.addView(actionBarMenuSubItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        actionBarMenuSubItem.setLayoutParams(layoutParams);
        actionBarMenuSubItem.openSwipeBackLayout = new ActionBarMenuItem$$ExternalSyntheticLambda4(this, this.popupLayout.addViewToSwipeBack(actionBarPopupWindowLayout), 0);
        actionBarMenuSubItem.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda5(actionBarMenuSubItem, 0));
        this.popupLayout.swipeBackGravityRight = true;
        return actionBarMenuSubItem;
    }

    public final void checkClearButton() {
        OKLCH oklch;
        TextView textView;
        OKLCH oklch2;
        final int i = 0;
        final int i2 = 1;
        if (this.clearButton != null) {
            boolean zHasRemovableFilters = hasRemovableFilters();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!zHasRemovableFilters && TextUtils.isEmpty(this.searchField.getText()) && (((oklch = this.listener) == null || !oklch.forceShowClear()) && ((textView = this.searchFieldCaption) == null || textView.getVisibility() != 0 || ((oklch2 = this.listener) != null && !oklch2.showClearForCaption())))) {
                if (this.clearButton.getTag() != null) {
                    this.clearButton.setTag(null);
                    AnimatorSet animatorSet = this.clearButtonAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    if (!this.animateClear) {
                        this.clearButton.setAlpha(0.0f);
                        this.clearButton.setRotation(45.0f);
                        this.clearButton.setScaleX(0.0f);
                        this.clearButton.setScaleY(0.0f);
                        this.clearButton.setVisibility(4);
                        this.animateClear = true;
                        return;
                    }
                    AnimatorSet duration = new AnimatorSet().setDuration(180L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ActionBarMenuItem f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i) {
                                case 0:
                                    ActionBarMenuItem actionBarMenuItem = this.f$0;
                                    actionBarMenuItem.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = actionBarMenuItem.searchAdditionalButton;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue);
                                    }
                                    break;
                                default:
                                    ActionBarMenuItem actionBarMenuItem2 = this.f$0;
                                    actionBarMenuItem2.getClass();
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = actionBarMenuItem2.searchAdditionalButton;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue2);
                                    }
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property, 45.0f), valueAnimatorOfFloat);
                    duration.addListener(new AnimatorListenerAdapter(this) {
                        public final ActionBarMenuItem this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i) {
                                case 0:
                                    ActionBarMenuItem actionBarMenuItem = this.this$0;
                                    actionBarMenuItem.clearButton.setVisibility(4);
                                    actionBarMenuItem.clearButtonAnimator = null;
                                    break;
                                default:
                                    this.this$0.clearButtonAnimator = null;
                                    break;
                            }
                        }
                    });
                    duration.start();
                    this.clearButtonAnimator = duration;
                    return;
                }
                return;
            }
            if (this.clearButton.getTag() == null) {
                this.clearButton.setTag(1);
                AnimatorSet animatorSet2 = this.clearButtonAnimator;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                }
                this.clearButton.setVisibility(0);
                if (this.animateClear) {
                    AnimatorSet duration2 = new AnimatorSet().setDuration(180L);
                    duration2.setInterpolator(new DecelerateInterpolator());
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
                    valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        public final ActionBarMenuItem f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i2) {
                                case 0:
                                    ActionBarMenuItem actionBarMenuItem = this.f$0;
                                    actionBarMenuItem.getClass();
                                    float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view = actionBarMenuItem.searchAdditionalButton;
                                    if (view != null) {
                                        view.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue);
                                    }
                                    break;
                                default:
                                    ActionBarMenuItem actionBarMenuItem2 = this.f$0;
                                    actionBarMenuItem2.getClass();
                                    float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                                    View view2 = actionBarMenuItem2.searchAdditionalButton;
                                    if (view2 != null) {
                                        view2.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue2);
                                    }
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<EditTextEmoji.AnonymousClass3, Float>) property, 0.0f), valueAnimatorOfFloat2);
                    duration2.addListener(new AnimatorListenerAdapter(this) {
                        public final ActionBarMenuItem this$0;

                        {
                            this.this$0 = this;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i2) {
                                case 0:
                                    ActionBarMenuItem actionBarMenuItem = this.this$0;
                                    actionBarMenuItem.clearButton.setVisibility(4);
                                    actionBarMenuItem.clearButtonAnimator = null;
                                    break;
                                default:
                                    this.this$0.clearButtonAnimator = null;
                                    break;
                            }
                        }
                    });
                    duration2.start();
                    this.clearButtonAnimator = duration2;
                    return;
                }
                this.clearButton.setAlpha(1.0f);
                this.clearButton.setRotation(0.0f);
                this.clearButton.setScaleX(1.0f);
                this.clearButton.setScaleY(1.0f);
                View view = this.searchAdditionalButton;
                if (view != null) {
                    view.setTranslationX(0.0f);
                }
                this.animateClear = true;
            }
        }
    }

    public final void checkCreateSearchField() {
        if (this.searchContainer == null && this.isSearchField) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(getContext());
            this.searchContainer = anonymousClass7;
            anonymousClass7.setClipChildren(this.searchItemPaddingStart != 0);
            AnonymousClass7 anonymousClass8 = this.searchContainer;
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(1.0f, 0, -1, this.searchItemPaddingStart + 6, 0, 0);
            ActionBarMenu actionBarMenu = this.parentMenu;
            actionBarMenu.addView(anonymousClass8, 0, layoutParamsCreateLinear);
            this.searchContainer.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.searchFieldCaption = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.searchFieldCaption;
            int i = Theme.key_actionBarDefaultSearch;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            textView2.setTextColor(Theme.getColor(i, resourcesProvider));
            this.searchFieldCaption.setSingleLine(true);
            this.searchFieldCaption.setEllipsize(TextUtils.TruncateAt.END);
            this.searchFieldCaption.setVisibility(8);
            this.searchFieldCaption.setGravity(LocaleController.isRTL ? 5 : 3);
            UsersSelectActivity.AnonymousClass4 anonymousClass4 = new UsersSelectActivity.AnonymousClass4(this, getContext(), 1);
            this.searchField = anonymousClass4;
            anonymousClass4.setScrollContainer(false);
            this.searchField.setCursorWidth(1.5f);
            this.searchField.setCursorColor(Theme.getColor(i, resourcesProvider));
            this.searchField.setTextSize(1, 18.0f);
            this.searchField.setHintTextColor(Theme.getColor(Theme.key_actionBarDefaultSearchPlaceholder, resourcesProvider));
            this.searchField.setTextColor(Theme.getColor(i, resourcesProvider));
            this.searchField.setSingleLine(true);
            this.searchField.setBackgroundResource(0);
            this.searchField.setPadding(0, 0, 0, 0);
            this.searchField.setInputType(this.searchField.getInputType() | 524288);
            if (Build.VERSION.SDK_INT < 23) {
                this.searchField.setCustomSelectionActionModeCallback(new RichEditText.AnonymousClass1(1));
            }
            this.searchField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                    ActionBarMenuItem actionBarMenuItem = this.f$0;
                    actionBarMenuItem.getClass();
                    if (keyEvent == null) {
                        return false;
                    }
                    if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                        return false;
                    }
                    AndroidUtilities.hideKeyboard(actionBarMenuItem.searchField);
                    OKLCH oklch = actionBarMenuItem.listener;
                    if (oklch == null) {
                        return false;
                    }
                    oklch.onSearchPressed(actionBarMenuItem.searchField);
                    return false;
                }
            });
            this.searchField.addTextChangedListener(new TextWatcher() {
                @Override
                public final void afterTextChanged(Editable editable) {
                }

                @Override
                public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
                    actionBarMenuItem.getClass();
                    OKLCH oklch = actionBarMenuItem.listener;
                    if (oklch != null) {
                        oklch.onTextChanged(actionBarMenuItem.searchField);
                    }
                    actionBarMenuItem.checkClearButton();
                    if (actionBarMenuItem.currentSearchFilters.isEmpty() || TextUtils.isEmpty(actionBarMenuItem.searchField.getText()) || actionBarMenuItem.selectedFilterIndex < 0) {
                        return;
                    }
                    actionBarMenuItem.selectedFilterIndex = -1;
                    actionBarMenuItem.onFiltersChanged();
                }
            });
            this.searchField.setImeOptions(234881027);
            this.searchField.setTextIsSelectable(false);
            this.searchField.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
            this.searchField.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
            CharSequence charSequence = this.searchFieldHint;
            if (charSequence != null) {
                this.searchField.setHint(charSequence);
                setContentDescription(this.searchFieldHint);
            }
            CharSequence charSequence2 = this.searchFieldText;
            if (charSequence2 != null) {
                this.searchField.setText(charSequence2);
            }
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.searchFilterLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.searchFilterLayout.setVisibility(0);
            if (LocaleController.isRTL) {
                this.searchContainer.addView(this.searchFilterLayout, LayoutHelper.createFrame(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.searchContainer.addView(this.searchField, LayoutHelper.createFrame(-1, 36.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
                this.searchContainer.addView(this.searchFieldCaption, LayoutHelper.createFrame(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.searchContainer.addView(this.searchFieldCaption, LayoutHelper.createFrame(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.searchContainer.addView(this.searchField, LayoutHelper.createFrame(-1, 36.0f, 16, 6.0f, 0.0f, 48.0f, 0.0f));
                this.searchContainer.addView(this.searchFilterLayout, LayoutHelper.createFrame(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.searchFilterLayout.setClipChildren(false);
            int i2 = 1;
            EditTextEmoji.AnonymousClass3 anonymousClass3 = new EditTextEmoji.AnonymousClass3(this, getContext(), i2);
            this.clearButton = anonymousClass3;
            SearchField.AnonymousClass1 anonymousClass1 = new SearchField.AnonymousClass1(this, i2);
            this.progressDrawable = anonymousClass1;
            anonymousClass3.setImageDrawable(anonymousClass1);
            this.clearButton.setBackground(Theme.createSelectorDrawable(actionBarMenu.parentActionBar.itemsActionModeBackgroundColor, 1, -1));
            this.clearButton.setScaleType(ImageView.ScaleType.CENTER);
            this.clearButton.setAlpha(0.0f);
            this.clearButton.setRotation(45.0f);
            this.clearButton.setScaleX(0.0f);
            this.clearButton.setScaleY(0.0f);
            this.clearButton.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda2(this, 3));
            this.clearButton.setContentDescription(LocaleController.getString(R.string.ClearButton));
            this.searchContainer.addView(this.clearButton, LayoutHelper.createFrame(48, -1, 21));
        }
    }

    public final void checkHideMenuItem() {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.popupLayout.getItemsCount()) {
                i = 8;
                break;
            } else if (this.popupLayout.linearLayout.getChildAt(i2).getVisibility() == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (i != getVisibility()) {
            setVisibility(i);
        }
    }

    public final void closeSubMenu() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    public final void createPopupLayout() {
        if (this.popupLayout != null) {
            return;
        }
        this.rect = new Rect();
        this.location = new int[2];
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 1, getContext(), this.resourcesProvider);
        this.popupLayout = actionBarPopupWindowLayout;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.subMenuFactory;
        if (blurredBackgroundDrawableViewFactory != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(actionBarPopupWindowLayout, null, true);
            blurredBackgroundDrawableCreate.setColorProvider(this.subMenuProvider);
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
            actionBarPopupWindowLayout.setBackground(blurredBackgroundDrawableCreate);
        }
        this.popupLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                ActionBarPopupWindow actionBarPopupWindow;
                ActionBarMenuItem actionBarMenuItem = this.f$0;
                actionBarMenuItem.getClass();
                if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = actionBarMenuItem.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
                    return false;
                }
                view.getHitRect(actionBarMenuItem.rect);
                if (actionBarMenuItem.rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                actionBarMenuItem.popupWindow.dismiss(true);
                return false;
            }
        });
        this.popupLayout.setDispatchKeyEventListener(new AlertDialog$$ExternalSyntheticLambda11(this, 3));
    }

    @Override
    public final void draw(Canvas canvas) {
        if (this.fixBackground) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public View getContentView() {
        RLottieImageView rLottieImageView = this.iconView;
        return rLottieImageView != null ? rLottieImageView : this.textView;
    }

    public RLottieImageView getIconView() {
        return this.iconView;
    }

    public View.OnClickListener getOnClickListener() {
        return this.onClickListener;
    }

    public ActionBarPopupWindow.ActionBarPopupWindowLayout getPopupLayout() {
        if (this.popupLayout == null) {
            createPopupLayout();
        }
        return this.popupLayout;
    }

    public ImageView getSearchClearButton() {
        return this.clearButton;
    }

    public FrameLayout getSearchContainer() {
        return this.searchContainer;
    }

    public EditTextBoldCursor getSearchField() {
        checkCreateSearchField();
        return this.searchField;
    }

    public TextView getTextView() {
        return this.textView;
    }

    public int getVisibleSubItemsCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.popupLayout.getItemsCount(); i2++) {
            View childAt = this.popupLayout.linearLayout.getChildAt(i2);
            if (childAt != null && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final boolean hasRemovableFilters() {
        ArrayList arrayList = this.currentSearchFilters;
        if (!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (((FiltersView.MediaFilterData) arrayList.get(i)).removable) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasSubMenu() {
        if (this.popupLayout != null) {
            return true;
        }
        ArrayList arrayList = this.lazyList;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public final void hideSubItem(int i) {
        View viewFindViewWithTag;
        HashMap map = this.lazyMap;
        Item item = map == null ? null : (Item) map.get(Integer.valueOf(i));
        if (item != null) {
            item.setVisibility(8);
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) == null || viewFindViewWithTag.getVisibility() == 8) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
    }

    public final Item lazilyAddSubItem(int i, int i2, RLottieDrawable rLottieDrawable, String str) {
        Item item = new Item(0);
        item.id = i;
        item.icon = i2;
        item.iconDrawable = rLottieDrawable;
        item.text = str;
        item.dismiss = true;
        putLazyItem(item);
        return item;
    }

    public final Item lazilyAddSwipeBackItem(ProfileActivity.AnonymousClass39 anonymousClass39, int i) {
        Item item = new Item(2);
        item.icon = i;
        item.iconDrawable = null;
        item.text = null;
        item.viewToSwipeBack = anonymousClass39;
        putLazyItem(item);
        return item;
    }

    public final Item lazilyAddText() {
        Item item = new Item(3);
        item.text = "";
        item.textSizeDp = 13;
        putLazyItem(item);
        return item;
    }

    public final void onFiltersChanged() {
        ArrayList arrayList = this.currentSearchFilters;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = new ArrayList(arrayList);
        AnonymousClass7 anonymousClass7 = this.searchContainer;
        if (anonymousClass7 != null && anonymousClass7.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new VoIPFragment.AnonymousClass23(1).setDuration(150L)).addTransition(changeBounds);
            transitionSet.setOrdering(0);
            transitionSet.setInterpolator((TimeInterpolator) CubicBezierInterpolator.EASE_OUT);
            transitionSet.addListener(new Transition.TransitionListener() {
                @Override
                public final void onTransitionCancel(Transition transition) {
                    ActionBarMenuItem.this.notificationsLocker.unlock();
                }

                @Override
                public final void onTransitionEnd(Transition transition) {
                    ActionBarMenuItem.this.notificationsLocker.unlock();
                }

                @Override
                public final void onTransitionPause(Transition transition) {
                }

                @Override
                public final void onTransitionResume(Transition transition) {
                }

                @Override
                public final void onTransitionStart(Transition transition) {
                    ActionBarMenuItem.this.notificationsLocker.lock();
                }
            });
            TransitionManager.beginDelayedTransition(this.searchFilterLayout, transitionSet);
        }
        if (this.searchFilterLayout != null) {
            int i = 0;
            while (i < this.searchFilterLayout.getChildCount()) {
                if (!arrayList2.remove(((SearchFilterView) this.searchFilterLayout.getChildAt(i)).getFilter())) {
                    this.searchFilterLayout.removeViewAt(i);
                    i--;
                }
                i++;
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) arrayList2.get(i2);
            mediaFilterData.getClass();
            SearchFilterView searchFilterView = new SearchFilterView(getContext(), this.resourcesProvider);
            searchFilterView.setData(mediaFilterData);
            searchFilterView.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(3, this, searchFilterView));
            this.searchFilterLayout.addView(searchFilterView, LayoutHelper.createLinear(-2, -1, 0, 0, 0, 6, 0));
        }
        if (this.searchFilterLayout != null) {
            int i3 = 0;
            while (i3 < this.searchFilterLayout.getChildCount()) {
                ((SearchFilterView) this.searchFilterLayout.getChildAt(i3)).setExpanded(i3 == this.selectedFilterIndex);
                i3++;
            }
        }
        LinearLayout linearLayout = this.searchFilterLayout;
        if (linearLayout != null) {
            linearLayout.setTag(!zIsEmpty ? 1 : null);
        }
        final float x = this.searchField.getX();
        if (this.searchContainer.getTag() != null) {
            this.searchField.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                @Override
                public final boolean onPreDraw() {
                    ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
                    actionBarMenuItem.searchField.getViewTreeObserver().removeOnPreDrawListener(this);
                    float x2 = actionBarMenuItem.searchField.getX();
                    float f = x;
                    if (x2 != f) {
                        UsersSelectActivity.AnonymousClass4 anonymousClass4 = actionBarMenuItem.searchField;
                        anonymousClass4.setTranslationX(f - anonymousClass4.getX());
                    }
                    actionBarMenuItem.searchField.animate().translationX(0.0f).setDuration(250L).setStartDelay(0L).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                    return true;
                }
            });
        }
        checkClearButton();
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.iconView != null) {
            accessibilityNodeInfo.setClassName("android.widget.ImageButton");
            return;
        }
        TextView textView = this.textView;
        if (textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(textView.getText());
            }
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            updateOrShowPopup(false, true);
        }
        OKLCH oklch = this.listener;
        if (oklch != null) {
            oklch.onLayout();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        ActionBarPopupWindow actionBarPopupWindow2;
        ActionBarPopupWindow actionBarPopupWindow3;
        if (motionEvent.getActionMasked() == 0) {
            if (this.longClickEnabled && hasSubMenu() && ((actionBarPopupWindow3 = this.popupWindow) == null || !actionBarPopupWindow3.isShowing())) {
                Theme$$ExternalSyntheticLambda8 theme$$ExternalSyntheticLambda8 = new Theme$$ExternalSyntheticLambda8(this, 2);
                this.showMenuRunnable = theme$$ExternalSyntheticLambda8;
                AndroidUtilities.runOnUIThread(theme$$ExternalSyntheticLambda8, 200L);
            }
        } else if (motionEvent.getActionMasked() != 2) {
            ActionBarPopupWindow actionBarPopupWindow4 = this.popupWindow;
            if (actionBarPopupWindow4 != null && actionBarPopupWindow4.isShowing() && motionEvent.getActionMasked() == 1) {
                View view = this.selectedMenuView;
                if (view != null) {
                    view.setSelected(false);
                    ActionBarMenu actionBarMenu = this.parentMenu;
                    if (actionBarMenu != null) {
                        actionBarMenu.onItemClick(((Integer) this.selectedMenuView.getTag()).intValue());
                    } else {
                        ActionBarMenuItemDelegate actionBarMenuItemDelegate = this.delegate;
                        if (actionBarMenuItemDelegate != null) {
                            actionBarMenuItemDelegate.onItemClick(((Integer) this.selectedMenuView.getTag()).intValue());
                        }
                    }
                    this.popupWindow.dismiss(this.allowCloseAnimation);
                } else if (this.showSubmenuByMove) {
                    this.popupWindow.dismiss(true);
                }
            } else {
                View view2 = this.selectedMenuView;
                if (view2 != null) {
                    view2.setSelected(false);
                    this.selectedMenuView = null;
                }
            }
        } else if (this.showSubmenuByMove && hasSubMenu() && ((actionBarPopupWindow2 = this.popupWindow) == null || !actionBarPopupWindow2.isShowing())) {
            if (motionEvent.getY() > getHeight()) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                toggleSubMenu(null, null);
                return true;
            }
        } else if (this.showSubmenuByMove && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            getLocationOnScreen(this.location);
            float x = motionEvent.getX() + this.location[0];
            float y = motionEvent.getY();
            int[] iArr = this.location;
            float f = y + iArr[1];
            this.popupLayout.getLocationOnScreen(iArr);
            int[] iArr2 = this.location;
            float f2 = x - iArr2[0];
            float f3 = f - iArr2[1];
            this.selectedMenuView = null;
            for (int i = 0; i < this.popupLayout.getItemsCount(); i++) {
                View childAt = this.popupLayout.linearLayout.getChildAt(i);
                childAt.getHitRect(this.rect);
                Object tag = childAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                    if (this.rect.contains((int) f2, (int) f3)) {
                        childAt.setPressed(true);
                        childAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(true, false);
                        }
                        childAt.drawableHotspotChanged(f2, f3 - childAt.getTop());
                        this.selectedMenuView = childAt;
                    } else {
                        childAt.setPressed(false);
                        childAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && childAt.getBackground() != null) {
                            childAt.getBackground().setVisible(false, false);
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void openSearch(boolean z) {
        ActionBarMenu actionBarMenu;
        checkCreateSearchField();
        AnonymousClass7 anonymousClass7 = this.searchContainer;
        if (anonymousClass7 == null || anonymousClass7.getVisibility() == 0 || (actionBarMenu = this.parentMenu) == null) {
            return;
        }
        actionBarMenu.parentActionBar.onSearchFieldVisibilityChanged(toggleSearch(z));
    }

    public final void putLazyItem(Item item) {
        if (this.lazyList == null) {
            this.lazyList = new ArrayList();
        }
        this.lazyList.add(item);
        if (this.lazyMap == null) {
            this.lazyMap = new HashMap();
        }
        this.lazyMap.put(Integer.valueOf(item.id), item);
    }

    public final void redrawPopup(int i) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null || actionBarPopupWindowLayout.getBackgroundColor() == i) {
            return;
        }
        this.popupLayout.setBackgroundColor(i);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupLayout.invalidate();
    }

    public void setAdditionalXOffset(int i) {
        this.additionalXOffset = i;
    }

    public void setAdditionalYOffset(int i) {
        this.additionalYOffset = i;
    }

    public final void setAllowCloseAnimation() {
        this.allowCloseAnimation = false;
    }

    public void setDelegate(ActionBarMenuItemDelegate actionBarMenuItemDelegate) {
        this.delegate = actionBarMenuItemDelegate;
    }

    public void setDimMenu(float f) {
        this.dimMenu = f;
    }

    public void setFitSubItems(boolean z) {
        this.popupLayout.setFitItems(z);
    }

    public void setFixBackground(boolean z) {
        this.fixBackground = z;
        invalidate();
    }

    public void setForceSmoothKeyboard(boolean z) {
        this.forceSmoothKeyboard = z;
    }

    public void setIcon(Drawable drawable) {
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView == null) {
            return;
        }
        if (drawable instanceof RLottieDrawable) {
            rLottieImageView.setAnimation((RLottieDrawable) drawable);
        } else {
            rLottieImageView.setImageDrawable(drawable);
        }
        this.iconViewResId = 0;
    }

    public void setIconColor(int i) {
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView != null) {
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
        TextView textView = this.textView;
        if (textView != null) {
            textView.setTextColor(i);
        }
        EditTextEmoji.AnonymousClass3 anonymousClass3 = this.clearButton;
        if (anonymousClass3 != null) {
            anonymousClass3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public final void setIsSearchField$1() {
        if (this.parentMenu == null) {
            return;
        }
        this.isSearchField = true;
    }

    public void setLayoutInScreen(boolean z) {
        this.layoutInScreen = z;
    }

    public void setLongClickEnabled(boolean z) {
        this.longClickEnabled = z;
    }

    public void setMenuXOffset(int i) {
        this.xOffset = i;
    }

    public void setMenuYOffset(int i) {
        this.yOffset = i;
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
        super.setOnClickListener(onClickListener);
    }

    public void setOnMenuDismiss(final Utilities.Callback<Boolean> callback) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                @Override
                public final void onDismiss() {
                    ActionBarMenuItem actionBarMenuItem = this.f$0;
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.valueOf(actionBarMenuItem.processedPopupClick));
                    }
                }
            });
        }
    }

    public void setPopupAnimationEnabled(boolean z) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.animationEnabled = z;
        }
        this.animationEnabled = z;
    }

    public final void setPopupItemsColor(int i, boolean z) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
        int childCount = anonymousClass2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = anonymousClass2.getChildAt(i2);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(i);
            } else if (childAt instanceof ActionBarMenuSubItem) {
                if (z) {
                    ((ActionBarMenuSubItem) childAt).setIconColor(i);
                } else {
                    ((ActionBarMenuSubItem) childAt).setTextColor(i);
                }
            }
        }
    }

    public void setPopupItemsSelectorColor(int i) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null) {
            return;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
        int childCount = anonymousClass2.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = anonymousClass2.getChildAt(i2);
            if (childAt instanceof ActionBarMenuSubItem) {
                ((ActionBarMenuSubItem) childAt).setSelectorColor(i);
            }
        }
    }

    public void setSearchAdditionalButton(View view) {
        this.searchAdditionalButton = view;
    }

    public void setSearchFieldCaption(CharSequence charSequence) {
        if (this.searchFieldCaption == null) {
            return;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.searchFieldCaption.setVisibility(8);
        } else {
            this.searchFieldCaption.setVisibility(0);
            this.searchFieldCaption.setText(charSequence);
        }
    }

    public void setSearchFieldHint(CharSequence charSequence) {
        this.searchFieldHint = charSequence;
        if (this.searchFieldCaption == null) {
            return;
        }
        this.searchField.setHint(charSequence);
        setContentDescription(charSequence);
    }

    public final void setSearchFieldText(CharSequence charSequence, boolean z) {
        this.searchFieldText = charSequence;
        if (this.searchFieldCaption == null) {
            return;
        }
        this.animateClear = z;
        this.searchField.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.searchField.setSelection(charSequence.length());
    }

    public void setSearchPaddingStart(int i) {
        this.searchItemPaddingStart = i;
        AnonymousClass7 anonymousClass7 = this.searchContainer;
        if (anonymousClass7 != null) {
            ((ViewGroup.MarginLayoutParams) anonymousClass7.getLayoutParams()).leftMargin = AndroidUtilities.dp(i);
            this.searchContainer.setClipChildren(this.searchItemPaddingStart != 0);
            AnonymousClass7 anonymousClass8 = this.searchContainer;
            anonymousClass8.setLayoutParams(anonymousClass8.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z) {
        SearchField.AnonymousClass1 anonymousClass1 = this.progressDrawable;
        if (anonymousClass1 == null) {
            return;
        }
        if (!z) {
            anonymousClass1.animating = false;
            return;
        }
        anonymousClass1.animating = true;
        anonymousClass1.lastFrameTime = System.currentTimeMillis();
        anonymousClass1.invalidateSelf();
    }

    public void setShowSubmenuByMove(boolean z) {
        this.showSubmenuByMove = z;
    }

    public void setShowedFromBottom(boolean z) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindowLayout.setShownFromBottom(z);
    }

    public final void setSubItemShown(int i, boolean z) {
        if (z) {
            showSubItem$1(i);
        } else {
            hideSubItem(i);
        }
    }

    public void setSubMenuDelegate(ActionBarSubMenuItemDelegate actionBarSubMenuItemDelegate) {
        this.subMenuDelegate = actionBarSubMenuItemDelegate;
    }

    public void setSubMenuOpenSide(int i) {
        this.subMenuOpenSide = i;
    }

    public void setText(CharSequence charSequence) {
        TextView textView = this.textView;
        if (textView == null) {
            return;
        }
        textView.setText(charSequence);
    }

    public void setTransitionOffset(float f) {
        this.transitionOffset = f;
        setTranslationX(0.0f);
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f + this.transitionOffset);
    }

    public void setupPopupRadialSelectors(int i) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.setupRadialSelectors(i);
        }
    }

    public final void showSubItem(int i) {
        showSubItem$1(i);
    }

    public final void showSubItem$1(int i) {
        View viewFindViewWithTag;
        HashMap map = this.lazyMap;
        Item item = map == null ? null : (Item) map.get(Integer.valueOf(i));
        if (item != null) {
            item.setVisibility(0);
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) == null || viewFindViewWithTag.getVisibility() == 0) {
            return;
        }
        viewFindViewWithTag.setAlpha(0.0f);
        OKLCH.m(viewFindViewWithTag.animate().alpha(1.0f), CubicBezierInterpolator.DEFAULT, 150L);
        viewFindViewWithTag.setVisibility(0);
    }

    public final boolean toggleSearch(boolean z) {
        ActionBarMenu actionBarMenu;
        RLottieImageView iconView;
        Animator customToggleTransition;
        final int i = 1;
        checkCreateSearchField();
        OKLCH oklch = this.listener;
        final int i2 = 0;
        if (this.searchContainer == null || !(oklch == null || oklch.canToggleSearch())) {
            return false;
        }
        OKLCH oklch2 = this.listener;
        if (oklch2 != null && (customToggleTransition = oklch2.getCustomToggleTransition()) != null) {
            customToggleTransition.start();
            return true;
        }
        final ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            actionBarMenu = this.parentMenu;
            if (i3 >= actionBarMenu.getChildCount()) {
                break;
            }
            View childAt = actionBarMenu.getChildAt(i3);
            if ((childAt instanceof ActionBarMenuItem) && (iconView = ((ActionBarMenuItem) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
            i3++;
        }
        Object tag = this.searchContainer.getTag();
        ArrayList arrayList2 = this.currentSearchFilters;
        Property property = View.ALPHA;
        if (tag == null) {
            this.searchContainer.setVisibility(0);
            this.searchContainer.setAlpha(0.0f);
            AnimatorSet animatorSet = this.searchContainerAnimator;
            if (animatorSet != null) {
                animatorSet.removeAllListeners();
                this.searchContainerAnimator.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.searchContainerAnimator = animatorSet2;
            AnonymousClass7 anonymousClass7 = this.searchContainer;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property, anonymousClass7.getAlpha(), 1.0f));
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                this.searchContainerAnimator.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i4), (Property<View, Float>) property, ((View) arrayList.get(i4)).getAlpha(), 0.0f));
            }
            this.searchContainerAnimator.setDuration(150L);
            this.searchContainerAnimator.addListener(new AnimatorListenerAdapter(this) {
                public final ActionBarMenuItem this$0;

                {
                    this.this$0 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 0:
                            ActionBarMenuItem actionBarMenuItem = this.this$0;
                            actionBarMenuItem.searchContainer.setAlpha(0.0f);
                            int i5 = 0;
                            while (true) {
                                ArrayList arrayList3 = arrayList;
                                if (i5 >= arrayList3.size()) {
                                    actionBarMenuItem.searchContainer.setVisibility(8);
                                } else {
                                    ((View) arrayList3.get(i5)).setAlpha(1.0f);
                                    i5++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.this$0.searchContainer.setAlpha(1.0f);
                            int i6 = 0;
                            while (true) {
                                ArrayList arrayList4 = arrayList;
                                if (i6 < arrayList4.size()) {
                                    ((View) arrayList4.get(i6)).setAlpha(0.0f);
                                    i6++;
                                }
                                break;
                            }
                            break;
                    }
                }
            });
            this.searchContainerAnimator.start();
            setVisibility(8);
            while (i2 < arrayList2.size()) {
                if (((FiltersView.MediaFilterData) arrayList2.get(i2)).removable) {
                    arrayList2.remove(i2);
                    i2--;
                }
                i2++;
            }
            onFiltersChanged();
            this.searchField.setText("");
            this.searchField.requestFocus();
            if (z) {
                AndroidUtilities.showKeyboard(this.searchField);
            }
            this.searchContainer.setTag(1);
            OKLCH oklch3 = this.listener;
            if (oklch3 != null) {
                oklch3.onSearchExpand();
            }
            return true;
        }
        this.searchContainer.setTag(null);
        AnimatorSet animatorSet3 = this.searchContainerAnimator;
        if (animatorSet3 != null) {
            animatorSet3.removeAllListeners();
            this.searchContainerAnimator.cancel();
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.searchContainerAnimator = animatorSet4;
        AnonymousClass7 anonymousClass8 = this.searchContainer;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass7, Float>) property, anonymousClass8.getAlpha(), 0.0f));
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            ((View) arrayList.get(i5)).setAlpha(0.0f);
            this.searchContainerAnimator.playTogether(ObjectAnimator.ofFloat((View) arrayList.get(i5), (Property<View, Float>) property, ((View) arrayList.get(i5)).getAlpha(), 1.0f));
        }
        this.searchContainerAnimator.setDuration(150L);
        this.searchContainerAnimator.addListener(new AnimatorListenerAdapter(this) {
            public final ActionBarMenuItem this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (i2) {
                    case 0:
                        ActionBarMenuItem actionBarMenuItem = this.this$0;
                        actionBarMenuItem.searchContainer.setAlpha(0.0f);
                        int i6 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList;
                            if (i6 >= arrayList3.size()) {
                                actionBarMenuItem.searchContainer.setVisibility(8);
                            } else {
                                ((View) arrayList3.get(i6)).setAlpha(1.0f);
                                i6++;
                            }
                            break;
                        }
                        break;
                    default:
                        this.this$0.searchContainer.setAlpha(1.0f);
                        int i7 = 0;
                        while (true) {
                            ArrayList arrayList4 = arrayList;
                            if (i7 < arrayList4.size()) {
                                ((View) arrayList4.get(i7)).setAlpha(0.0f);
                                i7++;
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.searchContainerAnimator.start();
        this.searchField.clearFocus();
        setVisibility(0);
        if (!arrayList2.isEmpty() && this.listener != null) {
            for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                if (((FiltersView.MediaFilterData) arrayList2.get(i6)).removable) {
                    this.listener.onSearchFilterCleared((FiltersView.MediaFilterData) arrayList2.get(i6));
                }
            }
        }
        OKLCH oklch4 = this.listener;
        if (oklch4 != null) {
            oklch4.onSearchCollapse();
        }
        if (z) {
            AndroidUtilities.hideKeyboard(this.searchField);
        }
        actionBarMenu.requestLayout();
        requestLayout();
        return false;
    }

    public final void toggleSubMenu(ActionBarMenuItem actionBarMenuItem, View view) {
        float f;
        FrameLayout frameLayout;
        View view2;
        ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2;
        View childAt;
        ActionBar actionBar;
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        View view3 = null;
        if ((actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) && this.lazyList != null) {
            for (int i = 0; i < this.lazyList.size(); i++) {
                Item item = (Item) this.lazyList.get(i);
                item.getClass();
                createPopupLayout();
                View view4 = item.view;
                if (view4 != null) {
                    this.popupLayout.linearLayout.addView(view4);
                } else {
                    int i2 = item.viewType;
                    if (i2 == 0) {
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
                        actionBarMenuSubItem.setTextAndIcon(item.text, item.icon, item.iconDrawable);
                        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        actionBarMenuSubItem.setTag(Integer.valueOf(item.id));
                        this.popupLayout.linearLayout.addView(actionBarMenuSubItem);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        actionBarMenuSubItem.setLayoutParams(layoutParams);
                        actionBarMenuSubItem.setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(4, item, this));
                        Integer num = item.textColor;
                        if (num != null && item.iconColor != null) {
                            int iIntValue = num.intValue();
                            int iIntValue2 = item.iconColor.intValue();
                            actionBarMenuSubItem.setTextColor(iIntValue);
                            actionBarMenuSubItem.setIconColor(iIntValue2);
                        }
                        item.view = actionBarMenuSubItem;
                    } else if (i2 == 1) {
                        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), Theme.key_actionBarDefaultSubmenuSeparator, resourcesProvider);
                        gapView.setTag(R.id.fit_width_tag, 1);
                        this.popupLayout.linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
                        item.view = gapView;
                    } else if (i2 == 2) {
                        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
                        actionBarMenuSubItem2.setTextAndIcon(item.text, item.icon, item.iconDrawable);
                        actionBarMenuSubItem2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        actionBarMenuSubItem2.setRightIcon(R.drawable.msg_arrowright);
                        actionBarMenuSubItem2.getRightIcon().setVisibility(item.rightIconVisibility);
                        this.popupLayout.linearLayout.addView(actionBarMenuSubItem2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) actionBarMenuSubItem2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        actionBarMenuSubItem2.setLayoutParams(layoutParams2);
                        actionBarMenuSubItem2.openSwipeBackLayout = new ActionBarMenuItem$$ExternalSyntheticLambda4(this, this.popupLayout.addViewToSwipeBack(item.viewToSwipeBack), 1);
                        actionBarMenuSubItem2.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda5(actionBarMenuSubItem2, 1));
                        this.popupLayout.swipeBackGravityRight = true;
                        Integer num2 = item.textColor;
                        if (num2 != null && item.iconColor != null) {
                            int iIntValue3 = num2.intValue();
                            int iIntValue4 = item.iconColor.intValue();
                            actionBarMenuSubItem2.setTextColor(iIntValue3);
                            actionBarMenuSubItem2.setIconColor(iIntValue4);
                        }
                        item.view = actionBarMenuSubItem2;
                    } else if (i2 == 3) {
                        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), null);
                        linksTextView.setTag(R.id.fit_width_tag, 1);
                        linksTextView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        linksTextView.setTextSize(1, item.textSizeDp);
                        linksTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
                        linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
                        linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
                        linksTextView.setText(item.text);
                        linksTextView.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.popupLayout.linearLayout.addView(linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        item.view = linksTextView;
                    }
                }
                View view5 = item.view;
                if (view5 != null) {
                    view5.setVisibility(item.visibility);
                    ChatActivity$$ExternalSyntheticLambda70 chatActivity$$ExternalSyntheticLambda70 = item.overrideClickListener;
                    if (chatActivity$$ExternalSyntheticLambda70 != null) {
                        item.view.setOnClickListener(chatActivity$$ExternalSyntheticLambda70);
                    }
                }
            }
            f = 8.0f;
            this.lazyList.clear();
        } else {
            f = 8.0f;
        }
        if (this.popupLayout != null) {
            ActionBarMenu actionBarMenu = this.parentMenu;
            if (actionBarMenu == null || !actionBarMenu.isActionMode || (actionBar = actionBarMenu.parentActionBar) == null || actionBar.isActionModeShowed()) {
                Theme$$ExternalSyntheticLambda8 theme$$ExternalSyntheticLambda8 = this.showMenuRunnable;
                if (theme$$ExternalSyntheticLambda8 != null) {
                    AndroidUtilities.cancelRunOnUIThread(theme$$ExternalSyntheticLambda8);
                    this.showMenuRunnable = null;
                }
                ActionBarPopupWindow actionBarPopupWindow2 = this.popupWindow;
                if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                    this.popupWindow.dismiss(true);
                    return;
                }
                this.showSubMenuFrom = actionBarMenuItem;
                ActionBarSubMenuItemDelegate actionBarSubMenuItemDelegate = this.subMenuDelegate;
                if (actionBarSubMenuItemDelegate != null) {
                    actionBarSubMenuItemDelegate.onShowSubMenu();
                }
                if (this.popupLayout.getParent() != null) {
                    ((ViewGroup) this.popupLayout.getParent()).removeView(this.popupLayout);
                }
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
                if (view != null) {
                    GroupCallActivity.AnonymousClass61 anonymousClass61 = new GroupCallActivity.AnonymousClass61(this, getContext(), view);
                    anonymousClass61.setOrientation(1);
                    frameLayout = new FrameLayout(getContext());
                    frameLayout.setAlpha(0.0f);
                    frameLayout.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.popupLayout.shownFromBottom ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof ActionBarMenuSubItem) || (view instanceof LinearLayout)) {
                        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.subMenuFactory;
                        if (blurredBackgroundDrawableViewFactory != null) {
                            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this.popupLayout, null, true);
                            blurredBackgroundDrawableCreate.setColorProvider(this.subMenuProvider);
                            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
                            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(f));
                            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
                            frameLayout.setBackground(blurredBackgroundDrawableCreate);
                        } else {
                            Drawable drawableMutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(this.popupLayout.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout.setBackground(drawableMutate);
                        }
                    }
                    frameLayout.addView(view, LayoutHelper.createFrame(-2.0f, -1));
                    anonymousClass61.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
                    anonymousClass61.addView(this.popupLayout, LayoutHelper.createLinear(-2, -2, 0, 0, -10, 0, 0));
                    this.popupLayout.setTopView(frameLayout);
                    view2 = anonymousClass61;
                } else {
                    actionBarPopupWindowLayout.setTopView(null);
                    frameLayout = null;
                    view2 = actionBarPopupWindowLayout;
                }
                if (this.subMenuFactory != null) {
                    ItemOptions.setGapBackgroundColor(this.popupLayout, Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider)));
                }
                ActionBarPopupWindow actionBarPopupWindow3 = new ActionBarPopupWindow(view2);
                this.popupWindow = actionBarPopupWindow3;
                if (this.animationEnabled) {
                    actionBarPopupWindow3.setAnimationStyle(0);
                } else {
                    actionBarPopupWindow3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z = this.animationEnabled;
                if (!z) {
                    this.popupWindow.animationEnabled = z;
                }
                this.popupWindow.setOutsideTouchable(true);
                this.popupWindow.setClippingEnabled(true);
                if (this.layoutInScreen) {
                    this.popupWindow.setLayoutInScreen();
                }
                this.popupWindow.setInputMethodMode(2);
                this.popupWindow.setSoftInputMode(0);
                view2.setFocusableInTouchMode(true);
                view2.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view6, int i3, KeyEvent keyEvent) {
                        ActionBarPopupWindow actionBarPopupWindow4;
                        ActionBarMenuItem actionBarMenuItem2 = this.f$0;
                        actionBarMenuItem2.getClass();
                        if (i3 != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (actionBarPopupWindow4 = actionBarMenuItem2.popupWindow) == null || !actionBarPopupWindow4.isShowing()) {
                            return false;
                        }
                        actionBarMenuItem2.popupWindow.dismiss(true);
                        return true;
                    }
                });
                this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        ActionBarMenuItem.ActionBarSubMenuItemDelegate actionBarSubMenuItemDelegate2 = this.f$0.subMenuDelegate;
                        if (actionBarSubMenuItemDelegate2 != null) {
                            actionBarSubMenuItemDelegate2.onHideSubMenu();
                        }
                    }
                });
                view2.measure(OKLCH.m(AndroidUtilities.displaySize.x, 40.0f, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.popupLayout.getSwipeBack() != null && (childAt = this.popupLayout.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.processedPopupClick = false;
                this.popupWindow.setFocusable(true);
                updateOrShowPopup(true, view2.getMeasuredWidth() == 0);
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = this.popupLayout;
                int childCount = actionBarPopupWindowLayout2.linearLayout.getChildCount();
                View view6 = null;
                int i3 = 0;
                while (true) {
                    anonymousClass2 = actionBarPopupWindowLayout2.linearLayout;
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt2 = anonymousClass2.getChildAt(i3);
                    if (childAt2.getVisibility() == 0) {
                        if (view3 == null) {
                            view3 = childAt2;
                        }
                        view6 = childAt2;
                    }
                    i3++;
                }
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt3 = anonymousClass2.getChildAt(i4);
                    if (childAt3.getVisibility() == 0) {
                        Object tag = childAt3.getTag(R.id.object_tag);
                        if (childAt3 instanceof ActionBarMenuSubItem) {
                            ActionBarMenuSubItem actionBarMenuSubItem3 = (ActionBarMenuSubItem) childAt3;
                            boolean z3 = childAt3 == view3 || z2;
                            boolean z4 = childAt3 == view6;
                            if (actionBarMenuSubItem3.top != z3 || actionBarMenuSubItem3.bottom != z4) {
                                actionBarMenuSubItem3.top = z3;
                                actionBarMenuSubItem3.bottom = z4;
                                actionBarMenuSubItem3.updateBackground();
                            }
                        }
                        z2 = tag != null;
                    }
                }
                if (this.popupLayout.getSwipeBack() != null) {
                    this.popupLayout.getSwipeBack().closeForeground(false);
                }
                this.popupWindow.startAnimation();
                float f2 = this.dimMenu;
                if (f2 > 0.0f) {
                    this.popupWindow.dimBehind(f2);
                }
            }
        }
    }

    public final void updateColor() {
        if (this.searchFilterLayout != null) {
            for (int i = 0; i < this.searchFilterLayout.getChildCount(); i++) {
                if (this.searchFilterLayout.getChildAt(i) instanceof SearchFilterView) {
                    ((SearchFilterView) this.searchFilterLayout.getChildAt(i)).updateColors$1();
                }
            }
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (actionBarPopupWindowLayout != null) {
            for (int i2 = 0; i2 < this.popupLayout.getItemsCount(); i2++) {
                if (this.popupLayout.linearLayout.getChildAt(i2) instanceof ActionBarMenuSubItem) {
                    ((ActionBarMenuSubItem) this.popupLayout.linearLayout.getChildAt(i2)).setSelectorColor(Theme.getColor(Theme.key_dialogButtonSelector, resourcesProvider));
                }
            }
        }
        UsersSelectActivity.AnonymousClass4 anonymousClass4 = this.searchField;
        if (anonymousClass4 != null) {
            int i3 = Theme.key_actionBarDefaultSearch;
            anonymousClass4.setCursorColor(Theme.getColor(i3, resourcesProvider));
            this.searchField.setHintTextColor(Theme.getColor(Theme.key_actionBarDefaultSearchPlaceholder, resourcesProvider));
            this.searchField.setTextColor(Theme.getColor(i3, resourcesProvider));
            this.searchField.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
            this.searchField.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
        }
    }

    public final void updateOrShowPopup(boolean z, boolean z2) {
        int paddingTop;
        int top;
        ScrollView scrollView;
        ActionBarMenu actionBarMenu = this.parentMenu;
        if (actionBarMenu != null) {
            top = actionBarMenu.getTop() + (-actionBarMenu.parentActionBar.getMeasuredHeight());
            paddingTop = actionBarMenu.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            paddingTop = -((int) ((getMeasuredHeight() * scaleY) - ((this.subMenuOpenSide != 2 ? getTranslationY() : 0.0f) / scaleY)));
            top = this.additionalYOffset;
        }
        int i = paddingTop + top + this.yOffset;
        if (z && (scrollView = this.popupLayout.scrollView) != null) {
            scrollView.scrollTo(0, 0);
        }
        ActionBarMenuItem actionBarMenuItem = this.showSubMenuFrom;
        if (actionBarMenuItem == null) {
            actionBarMenuItem = this;
        }
        if (actionBarMenu != null) {
            int i2 = this.subMenuOpenSide;
            ActionBar actionBar = actionBarMenu.parentActionBar;
            if (i2 == 0) {
                if (z) {
                    this.popupWindow.showAsDropDown(actionBar, ((actionBarMenuItem.getMeasuredWidth() + (actionBarMenu.getLeft() + actionBarMenuItem.getLeft())) - this.popupWindow.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.xOffset, i);
                }
                if (z2) {
                    this.popupWindow.update(actionBar, ((actionBarMenuItem.getMeasuredWidth() + (actionBarMenu.getLeft() + actionBarMenuItem.getLeft())) - this.popupWindow.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.xOffset, i, -1, -1);
                    return;
                }
                return;
            }
            if (z) {
                if (this.forceSmoothKeyboard) {
                    this.popupWindow.showAtLocation(actionBar, 51, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.xOffset, i);
                } else {
                    this.popupWindow.showAsDropDown(actionBar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.xOffset, i);
                }
            }
            if (z2) {
                this.popupWindow.update(actionBar, (getLeft() - AndroidUtilities.dp(8.0f)) + ((int) getTranslationX()) + this.xOffset, i, -1, -1);
                return;
            }
            return;
        }
        int i3 = this.subMenuOpenSide;
        if (i3 == 0) {
            if (getParent() != null) {
                View view = (View) getParent();
                if (z) {
                    this.popupWindow.showAsDropDown(view, ((getMeasuredWidth() + getLeft()) - this.popupWindow.getContentView().getMeasuredWidth()) + this.additionalXOffset + this.xOffset, i);
                }
                if (z2) {
                    this.popupWindow.update(view, ((getMeasuredWidth() + getLeft()) - this.popupWindow.getContentView().getMeasuredWidth()) + this.additionalXOffset + this.xOffset, i, -1, -1);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (z) {
                this.popupWindow.showAsDropDown(this, (-AndroidUtilities.dp(8.0f)) + this.additionalXOffset + this.xOffset, i);
            }
            if (z2) {
                this.popupWindow.update(this, (-AndroidUtilities.dp(8.0f)) + this.additionalXOffset + this.xOffset, i, -1, -1);
                return;
            }
            return;
        }
        if (z) {
            this.popupWindow.showAsDropDown(this, (getMeasuredWidth() - this.popupWindow.getContentView().getMeasuredWidth()) + this.additionalXOffset + this.xOffset, i);
        }
        if (z2) {
            this.popupWindow.update(this, (getMeasuredWidth() - this.popupWindow.getContentView().getMeasuredWidth()) + this.additionalXOffset + this.xOffset, i, -1, -1);
        }
    }

    public ActionBarMenuItem(Context context, int i, int i2, boolean z) {
        this(context, null, i, i2, z, null);
    }

    public ActionBarMenuItem(Context context, ActionBarMenu actionBarMenu, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        new ArrayList();
        this.allowCloseAnimation = true;
        this.animationEnabled = true;
        this.animateClear = true;
        this.showSubmenuByMove = true;
        this.currentSearchFilters = new ArrayList();
        this.selectedFilterIndex = -1;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.resourcesProvider = resourcesProvider;
        if (i != 0) {
            setBackgroundDrawable(Theme.createSelectorDrawable(i, z ? 5 : 1, -1));
        }
        this.parentMenu = actionBarMenu;
        if (z) {
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 15.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            textView.setImportantForAccessibility(2);
            if (i2 != 0) {
                textView.setTextColor(i2);
            }
            addView(textView, LayoutHelper.createFrame(-1.0f, -2));
            return;
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        rLottieImageView.setImportantForAccessibility(2);
        addView(rLottieImageView, LayoutHelper.createFrame(-1.0f, -1));
        if (i2 != 0) {
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIcon(int i) {
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView == null) {
            return;
        }
        this.iconViewResId = i;
        rLottieImageView.setImageResource(i);
    }

    public final Item lazilyAddSubItem(int i, int i2, String str) {
        return lazilyAddSubItem(i, i2, null, str);
    }

    public final void addSubItem(int i, CharSequence charSequence) {
        createPopupLayout();
        TextView textView = new TextView(getContext());
        textView.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider));
        textView.setBackgroundDrawable(Theme.getSelectorDrawable(false));
        if (!LocaleController.isRTL) {
            textView.setGravity(16);
        } else {
            textView.setGravity(21);
        }
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView.setTextSize(1, 16.0f);
        textView.setMinWidth(AndroidUtilities.dp(196.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTag(Integer.valueOf(i));
        textView.setText(charSequence);
        this.popupLayout.linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda2(this, 0));
    }

    public final void lazilyAddSubItem(RLottieDrawable rLottieDrawable, String str) {
        lazilyAddSubItem(29, 0, rLottieDrawable, str);
    }

    public final ActionBarMenuSubItem addSubItem(int i, int i2, String str) {
        return addSubItem(i, i2, null, str, true, false, this.resourcesProvider);
    }

    public final ActionBarMenuSubItem addSubItem(int i, int i2, Drawable drawable, String str, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        createPopupLayout();
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(z2 ? 1 : 0, getContext(), resourcesProvider, false, false);
        actionBarMenuSubItem.setTextAndIcon(str, i2, drawable);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarMenuSubItem.setTag(Integer.valueOf(i));
        this.popupLayout.linearLayout.addView(actionBarMenuSubItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        actionBarMenuSubItem.setLayoutParams(layoutParams);
        actionBarMenuSubItem.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda5(1, this, z));
        return actionBarMenuSubItem;
    }
}
