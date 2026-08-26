package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
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
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
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
import org.telegram.ui.Cells.ChatListCell$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda116;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CloseProgressDrawable2;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProvider;
import org.telegram.ui.Components.voip.VoIPNotificationsLayout;
import org.telegram.ui.iv.RichEditText;

public class ActionBarMenuItem extends FrameLayout {
    public static final int VIEW_TYPE_COLORED_GAP = 1;
    public static final int VIEW_TYPE_SUBITEM = 0;
    public static final int VIEW_TYPE_SWIPEBACKITEM = 2;
    public static final int VIEW_TYPE_TEXT = 3;
    private int additionalXOffset;
    private int additionalYOffset;
    private boolean allowCloseAnimation;
    private boolean animateClear;
    private boolean animationEnabled;
    private ImageView clearButton;
    private AnimatorSet clearButtonAnimator;
    private ArrayList<FiltersView.MediaFilterData> currentSearchFilters;
    private ActionBarMenuItemDelegate delegate;
    private float dimMenu;
    private boolean fixBackground;
    private boolean forceSmoothKeyboard;
    protected RLottieImageView iconView;
    private int iconViewResId;
    private boolean ignoreOnTextChange;
    private boolean isSearchField;
    private boolean layoutInScreen;
    private ArrayList<Item> lazyList;
    private HashMap<Integer, Item> lazyMap;
    protected ActionBarMenuItemSearchListener listener;
    private int[] location;
    private boolean longClickEnabled;
    private boolean measurePopup;
    private final AnimationNotificationsLocker notificationsLocker;
    private View.OnClickListener onClickListener;
    protected boolean overrideMenuClick;
    private ActionBarMenu parentMenu;
    private ActionBarPopupWindow.ActionBarPopupWindowLayout popupLayout;
    private ActionBarPopupWindow popupWindow;
    private boolean processedPopupClick;
    private CloseProgressDrawable2 progressDrawable;
    private Rect rect;
    private final Theme.ResourcesProvider resourcesProvider;
    private View searchAdditionalButton;
    private FrameLayout searchContainer;
    AnimatorSet searchContainerAnimator;
    private EditTextBoldCursor searchField;
    private TextView searchFieldCaption;
    private CharSequence searchFieldHint;
    private CharSequence searchFieldText;
    private LinearLayout searchFilterLayout;
    private ArrayList<SearchFilterView> searchFilterViews;
    public int searchItemPaddingStart;
    public int searchRightMargin;
    private int selectedFilterIndex;
    private View selectedMenuView;
    private Runnable showMenuRunnable;
    private View showSubMenuFrom;
    private boolean showSubmenuByMove;
    private ActionBarSubMenuItemDelegate subMenuDelegate;
    private BlurredBackgroundDrawableViewFactory subMenuFactory;
    private int subMenuOpenSide;
    private BlurredBackgroundProvider subMenuProvider;
    protected TextView textView;
    private float transitionOffset;
    private boolean wrapSearchInScrollView;
    private FrameLayout wrappedSearchFrameLayout;
    private int xOffset;
    private int yOffset;

    public final class AnonymousClass4 extends Visibility {
        public final int $r8$classId;

        public AnonymousClass4(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            switch (this.$r8$classId) {
                case 0:
                    if (!(view instanceof SearchFilterView)) {
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                case 1:
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(20.0f), 0.0f));
                    animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet2;
                default:
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    view.setAlpha(0.0f);
                    view.setScaleY(0.6f);
                    view.setScaleX(0.6f);
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.6f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.6f, 1.0f));
                    animatorSet3.setInterpolator(CubicBezierInterpolator.EASE_OUT_BACK);
                    return animatorSet3;
            }
        }

        @Override
        public final Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
            switch (this.$r8$classId) {
                case 0:
                    if (!(view instanceof SearchFilterView)) {
                        return ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                    animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet;
                case 1:
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, -AndroidUtilities.dp(20.0f)));
                    animatorSet2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet2;
                default:
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    if (view instanceof VoIPNotificationsLayout.NotificationView) {
                        ((VoIPNotificationsLayout.NotificationView) view).ignoreShader = true;
                    }
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.7f, 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 1.0f, 0.6f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.6f));
                    animatorSet3.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    return animatorSet3;
            }
        }
    }

    public final class AnonymousClass8 extends HorizontalScrollView {
        public boolean isDragging;

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.isDragging = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.isDragging = false;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
            if (this.isDragging) {
                super.onOverScrolled(i, i2, z, z2);
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.isDragging = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.isDragging = false;
            }
            return super.onTouchEvent(motionEvent);
        }
    }

    public interface ActionBarMenuItemDelegate {
        void onItemClick(int i);
    }

    public abstract class ActionBarMenuItemSearchListener {
        public boolean canClearCaption() {
            return true;
        }

        public boolean canCollapseSearch() {
            return true;
        }

        public boolean canToggleSearch() {
            return true;
        }

        public boolean forceShowClear() {
            return false;
        }

        public Animator getCustomToggleTransition() {
            return null;
        }

        public void onCaptionCleared() {
        }

        public void onLayout(int i, int i2, int i3, int i4) {
        }

        public void onPreToggleSearch() {
        }

        public void onSearchCollapse() {
        }

        public void onSearchExpand() {
        }

        public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
        }

        public void onSearchPressed(EditText editText) {
        }

        public void onTextChanged(EditText editText) {
        }

        public boolean showClearForCaption() {
            return true;
        }
    }

    public interface ActionBarSubMenuItemDelegate {
        void onHideSubMenu();

        void onShowSubMenu();
    }

    public final class Item {
        public boolean dismiss;
        public int icon;
        public Integer iconColor;
        public Drawable iconDrawable;
        public int id;
        public boolean needCheck;
        public ChatActivity$$ExternalSyntheticLambda116 overrideClickListener;
        public CharSequence text;
        public Integer textColor;
        public int textSizeDp;
        public View view;
        public View viewToSwipeBack;
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
                    ((ActionBarMenuSubItem) view).setColors(i, i2);
                }
            }
        }

        public final void setOnClickListener(ChatActivity$$ExternalSyntheticLambda116 chatActivity$$ExternalSyntheticLambda116) {
            this.overrideClickListener = chatActivity$$ExternalSyntheticLambda116;
            View view = this.view;
            if (view != null) {
                view.setOnClickListener(chatActivity$$ExternalSyntheticLambda116);
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
            addView(backupImageView, LayoutHelper.createFrame(32, 32.0f));
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
            updateColors();
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
        public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            if (i == 0) {
                updateColors();
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
            String string = mediaFilterData.title;
            if (string == null) {
                string = LocaleController.getString(mediaFilterData.titleResId);
            }
            this.titleView.setText(string);
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
                combinedDrawableCreateCircleDrawableWithIcon2.setIconSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
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
                    int iDp = AndroidUtilities.dp(this.isCommunity ? 10.0f : 16.0f);
                    this.mBackgroundRadius = iDp;
                    imageReceiver.setRoundRadius(iDp);
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
            combinedDrawableCreateCircleDrawableWithIcon3.setIconSize(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
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

        public final void updateColors() {
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

    public ActionBarMenuItem(Activity activity, int i) {
        this(activity, null, 0, i, false, null);
    }

    public static ActionBarMenuSubItem addItem(ViewGroup viewGroup, int i, CharSequence charSequence, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return addItem(false, false, viewGroup, i, charSequence, z, resourcesProvider);
    }

    public static void addText(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout, String str, Theme.ResourcesProvider resourcesProvider) {
        TextView textView = new TextView(actionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(str);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindowLayout.addView((View) textView, LayoutHelper.createLinear(-1, -2));
    }

    public static boolean checkRtl(String str) {
        char cCharAt;
        return !TextUtils.isEmpty(str) && (cCharAt = str.charAt(0)) >= 1424 && cCharAt <= 1791;
    }

    public ActionBarPopupWindow.GapView addColoredGap() {
        return addColoredGap(-1);
    }

    public View addDivider(int i) {
        createPopupLayout();
        TextView textView = new TextView(getContext());
        textView.setBackgroundColor(i);
        textView.setMinimumWidth(AndroidUtilities.dp(196.0f));
        this.popupLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.width = -1;
        layoutParams.height = 1;
        int iDp = AndroidUtilities.dp(3.0f);
        layoutParams.bottomMargin = iDp;
        layoutParams.topMargin = iDp;
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public View addGap(int i) {
        createPopupLayout();
        View view = new View(getContext());
        view.setMinimumWidth(AndroidUtilities.dp(196.0f));
        view.setTag(Integer.valueOf(i));
        view.setTag(R.id.object_tag, 1);
        this.popupLayout.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(6.0f);
        view.setLayoutParams(layoutParams);
        return view;
    }

    public void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        this.currentSearchFilters.add(mediaFilterData);
        if (this.searchContainer.getTag() != null) {
            this.selectedFilterIndex = this.currentSearchFilters.size() - 1;
        }
        onFiltersChanged();
    }

    public void addSubItem(View view, int i, int i2) {
        createPopupLayout();
        this.popupLayout.addView(view, new LinearLayout.LayoutParams(i, i2));
    }

    public ActionBarMenuSubItem addSwipeBackItem(int i, Drawable drawable, String str, View view) {
        createPopupLayout();
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
        actionBarMenuSubItem.setTextAndIcon(str, i, drawable);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarMenuSubItem.setRightIcon(R.drawable.msg_arrowright);
        this.popupLayout.addView(actionBarMenuSubItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        actionBarMenuSubItem.setLayoutParams(layoutParams);
        actionBarMenuSubItem.openSwipeBackLayout = new ActionBarMenuItem$$ExternalSyntheticLambda10(this, this.popupLayout.addViewToSwipeBack(view), 0);
        actionBarMenuSubItem.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda11(actionBarMenuSubItem, 0));
        this.popupLayout.swipeBackGravityRight = true;
        return actionBarMenuSubItem;
    }

    public final void checkClearButton() {
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener;
        TextView textView;
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener2;
        final int i = 0;
        final int i2 = 1;
        if (this.clearButton != null) {
            boolean zHasRemovableFilters = hasRemovableFilters();
            Property property = View.ROTATION;
            Property property2 = View.SCALE_Y;
            Property property3 = View.SCALE_X;
            Property property4 = View.ALPHA;
            if (!zHasRemovableFilters && TextUtils.isEmpty(this.searchField.getText()) && (((actionBarMenuItemSearchListener = this.listener) == null || !actionBarMenuItemSearchListener.forceShowClear()) && ((textView = this.searchFieldCaption) == null || textView.getVisibility() != 0 || ((actionBarMenuItemSearchListener2 = this.listener) != null && !actionBarMenuItemSearchListener2.showClearForCaption())))) {
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
                                    this.f$0.lambda$checkClearButton$15(valueAnimator);
                                    break;
                                default:
                                    this.f$0.lambda$checkClearButton$16(valueAnimator);
                                    break;
                            }
                        }
                    });
                    duration.playTogether(ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property4, 0.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property2, 0.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property, 45.0f), valueAnimatorOfFloat);
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
                                    this.f$0.lambda$checkClearButton$15(valueAnimator);
                                    break;
                                default:
                                    this.f$0.lambda$checkClearButton$16(valueAnimator);
                                    break;
                            }
                        }
                    });
                    duration2.playTogether(ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property3, 1.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.clearButton, (Property<ImageView, Float>) property, 0.0f), valueAnimatorOfFloat2);
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
            FrameLayout frameLayout = new FrameLayout(getContext()) {
                public boolean ignoreRequestLayout;

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
                    actionBarMenuItem.searchField.layout(measuredWidth, actionBarMenuItem.searchField.getTop(), actionBarMenuItem.searchField.getMeasuredWidth() + measuredWidth, actionBarMenuItem.searchField.getBottom());
                }

                @Override
                public final void onMeasure(int i, int i2) {
                    int iDp;
                    int iDp2;
                    ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
                    if (!actionBarMenuItem.wrapSearchInScrollView) {
                        measureChildWithMargins(actionBarMenuItem.clearButton, i, 0, i2, 0);
                        if (actionBarMenuItem.searchAdditionalButton != null) {
                            measureChildWithMargins(actionBarMenuItem.searchAdditionalButton, i, 0, i2, 0);
                        }
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
                        measureChildWithMargins(actionBarMenuItem.searchField, OKLCH.m(12.0f, size, 0), iDp + measuredWidth, i2, 0);
                        this.ignoreRequestLayout = false;
                        setMeasuredDimension(Math.max(actionBarMenuItem.searchField.getMeasuredWidth() + measuredWidth, size), View.MeasureSpec.getSize(i2));
                        return;
                    }
                    if (actionBarMenuItem.searchFieldCaption.getVisibility() == 0) {
                        measureChildWithMargins(actionBarMenuItem.searchFieldCaption, i, View.MeasureSpec.getSize(i) / 2, i2, 0);
                        iDp2 = AndroidUtilities.dp(4.0f) + actionBarMenuItem.searchFieldCaption.getMeasuredWidth();
                    } else {
                        iDp2 = 0;
                    }
                    int size2 = View.MeasureSpec.getSize(i);
                    this.ignoreRequestLayout = true;
                    measureChildWithMargins(actionBarMenuItem.searchFilterLayout, i, iDp2, i2, 0);
                    int measuredWidth2 = actionBarMenuItem.searchFilterLayout.getVisibility() == 0 ? actionBarMenuItem.searchFilterLayout.getMeasuredWidth() : 0;
                    measureChildWithMargins(actionBarMenuItem.searchField, i, iDp2 + measuredWidth2 + (actionBarMenuItem.searchAdditionalButton != null ? actionBarMenuItem.searchAdditionalButton.getMeasuredWidth() : 0), i2, 0);
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
                    if (actionBarMenuItem.clearButton == null || actionBarMenuItem.clearButton.getTag() == null) {
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
                    if (actionBarMenuItem.clearButton != null) {
                        actionBarMenuItem.clearButton.setVisibility(i);
                    }
                    if (actionBarMenuItem.searchAdditionalButton != null) {
                        actionBarMenuItem.searchAdditionalButton.setVisibility(i);
                    }
                    if (actionBarMenuItem.wrappedSearchFrameLayout != null) {
                        actionBarMenuItem.wrappedSearchFrameLayout.setVisibility(i);
                    }
                }
            };
            this.searchContainer = frameLayout;
            frameLayout.setClipChildren(this.searchItemPaddingStart != 0);
            this.wrappedSearchFrameLayout = null;
            if (this.wrapSearchInScrollView) {
                this.wrappedSearchFrameLayout = new FrameLayout(getContext());
                AnonymousClass8 anonymousClass8 = new AnonymousClass8(getContext());
                anonymousClass8.addView(this.searchContainer, LayoutHelper.createScroll(-2, -1, 0));
                anonymousClass8.setHorizontalScrollBarEnabled(false);
                anonymousClass8.setClipChildren(this.searchItemPaddingStart != 0);
                this.wrappedSearchFrameLayout.addView(anonymousClass8, LayoutHelper.createFrame(-1, -1.0f, 0, 0.0f, 0.0f, 48.0f, 0.0f));
                this.parentMenu.addView(this.wrappedSearchFrameLayout, 0, LayoutHelper.createLinear(0, -1, 1.0f, this.searchItemPaddingStart, 0, 0, 0));
            } else {
                this.parentMenu.addView(this.searchContainer, 0, LayoutHelper.createLinear(0, -1, 1.0f, this.searchItemPaddingStart + 6, 0, this.searchRightMargin, 0));
            }
            this.searchContainer.setVisibility(8);
            TextView textView = new TextView(getContext());
            this.searchFieldCaption = textView;
            textView.setTextSize(1, 18.0f);
            TextView textView2 = this.searchFieldCaption;
            int i = Theme.key_actionBarDefaultSearch;
            textView2.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.searchFieldCaption.setSingleLine(true);
            this.searchFieldCaption.setEllipsize(TextUtils.TruncateAt.END);
            this.searchFieldCaption.setVisibility(8);
            this.searchFieldCaption.setGravity(LocaleController.isRTL ? 5 : 3);
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(getContext()) {
                @Override
                public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                    if (i2 == 67) {
                        ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
                        if (actionBarMenuItem.searchField.length() == 0 && ((actionBarMenuItem.searchFieldCaption.getVisibility() == 0 && actionBarMenuItem.searchFieldCaption.length() > 0) || actionBarMenuItem.hasRemovableFilters())) {
                            if (actionBarMenuItem.hasRemovableFilters()) {
                                FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) actionBarMenuItem.currentSearchFilters.get(actionBarMenuItem.currentSearchFilters.size() - 1);
                                ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = actionBarMenuItem.listener;
                                if (actionBarMenuItemSearchListener != null) {
                                    actionBarMenuItemSearchListener.onSearchFilterCleared(mediaFilterData);
                                }
                                actionBarMenuItem.removeSearchFilter(mediaFilterData);
                            } else {
                                actionBarMenuItem.clearButton.callOnClick();
                            }
                            return true;
                        }
                    }
                    return super.onKeyDown(i2, keyEvent);
                }

                @Override
                public final void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, i3);
                    setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i2), getMeasuredWidth()), getMeasuredHeight());
                }

                @Override
                public final boolean onTouchEvent(MotionEvent motionEvent) {
                    boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                    if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return zOnTouchEvent;
                }
            };
            this.searchField = editTextBoldCursor;
            editTextBoldCursor.setScrollContainer(false);
            this.searchField.setCursorWidth(1.5f);
            this.searchField.setCursorColor(Theme.getColor(i, this.resourcesProvider));
            this.searchField.setTextSize(1, 18.0f);
            this.searchField.setHintTextColor(Theme.getColor(Theme.key_actionBarDefaultSearchPlaceholder, this.resourcesProvider));
            this.searchField.setTextColor(Theme.getColor(i, this.resourcesProvider));
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
                    return this.f$0.lambda$checkCreateSearchField$13(textView3, i2, keyEvent);
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
                    if (actionBarMenuItem.ignoreOnTextChange) {
                        actionBarMenuItem.ignoreOnTextChange = false;
                        return;
                    }
                    ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = actionBarMenuItem.listener;
                    if (actionBarMenuItemSearchListener != null) {
                        actionBarMenuItemSearchListener.onTextChanged(actionBarMenuItem.searchField);
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
            this.searchField.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
            this.searchField.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, this.resourcesProvider));
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
                this.searchContainer.addView(this.searchField, LayoutHelper.createFrame(-1, 36.0f, 16, 0.0f, 0.0f, this.wrapSearchInScrollView ? 0.0f : 48.0f, 0.0f));
                this.searchContainer.addView(this.searchFieldCaption, LayoutHelper.createFrame(-2, 36.0f, 21, 0.0f, 5.5f, 48.0f, 0.0f));
            } else {
                this.searchContainer.addView(this.searchFieldCaption, LayoutHelper.createFrame(-2, 36.0f, 19, 0.0f, 5.5f, 0.0f, 0.0f));
                this.searchContainer.addView(this.searchField, LayoutHelper.createFrame(-1, 36.0f, 16, 6.0f, 0.0f, this.wrapSearchInScrollView ? 0.0f : 48.0f, 0.0f));
                this.searchContainer.addView(this.searchFilterLayout, LayoutHelper.createFrame(-2, 32.0f, 16, 0.0f, 0.0f, 48.0f, 0.0f));
            }
            this.searchFilterLayout.setClipChildren(false);
            ImageView imageView = new ImageView(getContext()) {
                @Override
                public final void draw(Canvas canvas) {
                    getBackground().draw(canvas);
                    super.draw(canvas);
                }

                @Override
                public final void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    clearAnimation();
                    Object tag = getTag();
                    ActionBarMenuItem actionBarMenuItem = ActionBarMenuItem.this;
                    if (tag != null) {
                        actionBarMenuItem.clearButton.setAlpha(1.0f);
                        actionBarMenuItem.clearButton.setRotation(0.0f);
                        actionBarMenuItem.clearButton.setScaleX(1.0f);
                        actionBarMenuItem.clearButton.setScaleY(1.0f);
                        return;
                    }
                    actionBarMenuItem.clearButton.setVisibility(4);
                    actionBarMenuItem.clearButton.setAlpha(0.0f);
                    actionBarMenuItem.clearButton.setRotation(45.0f);
                    actionBarMenuItem.clearButton.setScaleX(0.0f);
                    actionBarMenuItem.clearButton.setScaleY(0.0f);
                }
            };
            this.clearButton = imageView;
            CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2() {
                @Override
                public final int getCurrentColor() {
                    return ActionBarMenuItem.this.parentMenu.parentActionBar.itemsColor;
                }
            };
            this.progressDrawable = closeProgressDrawable2;
            imageView.setImageDrawable(closeProgressDrawable2);
            this.clearButton.setBackground(Theme.createSelectorDrawable(this.parentMenu.parentActionBar.itemsActionModeBackgroundColor, 1, -1));
            this.clearButton.setScaleType(ImageView.ScaleType.CENTER);
            this.clearButton.setAlpha(0.0f);
            this.clearButton.setRotation(45.0f);
            this.clearButton.setScaleX(0.0f);
            this.clearButton.setScaleY(0.0f);
            this.clearButton.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda7(this, 1));
            this.clearButton.setContentDescription(LocaleController.getString(R.string.ClearButton));
            if (this.wrapSearchInScrollView) {
                this.wrappedSearchFrameLayout.addView(this.clearButton, LayoutHelper.createFrame(48, -1, 21));
            } else {
                this.searchContainer.addView(this.clearButton, LayoutHelper.createFrame(48, -1, 21));
            }
        }
    }

    public void checkHideMenuItem() {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.popupLayout.getItemsCount()) {
                i = 8;
                break;
            } else if (this.popupLayout.getItemAt(i2).getVisibility() == 0) {
                break;
            } else {
                i2++;
            }
        }
        if (i != getVisibility()) {
            setVisibility(i);
        }
    }

    public void clearFocusOnSearchView() {
        this.searchField.clearFocus();
        AndroidUtilities.hideKeyboard(this.searchField);
    }

    public void clearSearchFilters() {
        int i = 0;
        while (i < this.currentSearchFilters.size()) {
            if (this.currentSearchFilters.get(i).removable) {
                this.currentSearchFilters.remove(i);
                i--;
            }
            i++;
        }
        onFiltersChanged();
    }

    public void clearSearchText() {
        this.searchFieldText = null;
        EditTextBoldCursor editTextBoldCursor = this.searchField;
        if (editTextBoldCursor == null) {
            return;
        }
        editTextBoldCursor.setText("");
    }

    public void closeSubMenu() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupWindow.dismiss();
    }

    public void collapseSearchFilters() {
        this.selectedFilterIndex = -1;
        onFiltersChanged();
    }

    public final void createPopupLayout() {
        if (this.popupLayout != null) {
            return;
        }
        this.rect = new Rect();
        this.location = new int[2];
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(getContext(), R.drawable.popup_fixed_alert4, this.resourcesProvider, 1);
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
                return this.f$0.lambda$createPopupLayout$1(view, motionEvent);
            }
        });
        this.popupLayout.setDispatchKeyEventListener(new AlertDialog$$ExternalSyntheticLambda13(this, 3));
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.fixBackground) {
            getBackground().draw(canvas);
        }
        super.draw(canvas);
    }

    public void forceUpdatePopupPosition() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) {
            return;
        }
        this.popupLayout.measure(OKLCH.m(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
        updateOrShowPopup(true, true);
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

    public View getSubItem(int i) {
        return this.popupLayout.findViewWithTag(Integer.valueOf(i));
    }

    public TextView getTextView() {
        return this.textView;
    }

    public int getVisibleSubItemsCount() {
        int i = 0;
        for (int i2 = 0; i2 < this.popupLayout.getItemsCount(); i2++) {
            View itemAt = this.popupLayout.getItemAt(i2);
            if (itemAt != null && itemAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    public final boolean hasRemovableFilters() {
        if (!this.currentSearchFilters.isEmpty()) {
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                if (this.currentSearchFilters.get(i).removable) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasSubItem(int i) {
        HashMap<Integer, Item> map = this.lazyMap;
        if ((map == null ? null : map.get(Integer.valueOf(i))) != null) {
            return true;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        return (actionBarPopupWindowLayout == null || actionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i)) == null) ? false : true;
    }

    public boolean hasSubMenu() {
        if (this.popupLayout != null) {
            return true;
        }
        ArrayList<Item> arrayList = this.lazyList;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public void hideAllSubItems() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null) {
            return;
        }
        int itemsCount = actionBarPopupWindowLayout.getItemsCount();
        for (int i = 0; i < itemsCount; i++) {
            this.popupLayout.getItemAt(i).setVisibility(8);
        }
        this.measurePopup = true;
        checkHideMenuItem();
    }

    public void hideSubItem(int i) {
        View viewFindViewWithTag;
        HashMap<Integer, Item> map = this.lazyMap;
        Item item = map == null ? null : map.get(Integer.valueOf(i));
        if (item != null) {
            item.setVisibility(8);
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) == null || viewFindViewWithTag.getVisibility() == 8) {
            return;
        }
        viewFindViewWithTag.setVisibility(8);
        this.measurePopup = true;
    }

    public boolean isSearchField() {
        return this.isSearchField;
    }

    public boolean isSearchFieldVisible() {
        FrameLayout frameLayout = this.searchContainer;
        return frameLayout != null && frameLayout.getVisibility() == 0;
    }

    public boolean isSearchFieldVisible2() {
        FrameLayout frameLayout = this.searchContainer;
        return (frameLayout == null || frameLayout.getTag() == null) ? false : true;
    }

    public boolean isSubItemVisible(int i) {
        View viewFindViewWithTag;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        return (actionBarPopupWindowLayout == null || (viewFindViewWithTag = actionBarPopupWindowLayout.findViewWithTag(Integer.valueOf(i))) == null || viewFindViewWithTag.getVisibility() != 0) ? false : true;
    }

    public boolean isSubMenuShowing() {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        return actionBarPopupWindow != null && actionBarPopupWindow.isShowing();
    }

    public final void lambda$addSubItem$3(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            if (this.processedPopupClick) {
                return;
            }
            this.processedPopupClick = true;
            this.popupWindow.dismiss(this.allowCloseAnimation);
        }
        ActionBarMenu actionBarMenu = this.parentMenu;
        if (actionBarMenu != null) {
            actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
            return;
        }
        ActionBarMenuItemDelegate actionBarMenuItemDelegate = this.delegate;
        if (actionBarMenuItemDelegate != null) {
            actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
        }
    }

    public final void lambda$addSubItem$4(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            if (this.processedPopupClick) {
                return;
            }
            this.processedPopupClick = true;
            if (!this.allowCloseAnimation) {
                this.popupWindow.setAnimationStyle(R.style.PopupAnimation);
            }
            this.popupWindow.dismiss(this.allowCloseAnimation);
        }
        ActionBarMenu actionBarMenu = this.parentMenu;
        if (actionBarMenu != null) {
            actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
            return;
        }
        ActionBarMenuItemDelegate actionBarMenuItemDelegate = this.delegate;
        if (actionBarMenuItemDelegate != null) {
            actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
        }
    }

    public final void lambda$addSubItem$5(boolean z, View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing() && z) {
            if (this.processedPopupClick) {
                return;
            }
            this.processedPopupClick = true;
            this.popupWindow.dismiss(this.allowCloseAnimation);
        }
        ActionBarMenu actionBarMenu = this.parentMenu;
        if (actionBarMenu != null) {
            actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
            return;
        }
        ActionBarMenuItemDelegate actionBarMenuItemDelegate = this.delegate;
        if (actionBarMenuItemDelegate != null) {
            actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
        }
    }

    public final void lambda$addSubItem$6(View view) {
        ActionBarMenu actionBarMenu = this.parentMenu;
        if (actionBarMenu != null) {
            actionBarMenu.onItemClick(((Integer) view.getTag()).intValue());
            return;
        }
        ActionBarMenuItemDelegate actionBarMenuItemDelegate = this.delegate;
        if (actionBarMenuItemDelegate != null) {
            actionBarMenuItemDelegate.onItemClick(((Integer) view.getTag()).intValue());
        }
    }

    public final void lambda$addSwipeBackItem$7(int i) {
        if (this.popupLayout.getSwipeBack() != null) {
            this.popupLayout.getSwipeBack().openForeground(i);
        }
    }

    public final void lambda$checkClearButton$15(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.searchAdditionalButton;
        if (view != null) {
            view.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue);
        }
    }

    public final void lambda$checkClearButton$16(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = this.searchAdditionalButton;
        if (view != null) {
            view.setTranslationX(AndroidUtilities.dp(32.0f) * fFloatValue);
        }
    }

    public final boolean lambda$checkCreateSearchField$13(TextView textView, int i, KeyEvent keyEvent) {
        if (keyEvent == null) {
            return false;
        }
        if ((keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 84) && (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.searchField);
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = this.listener;
        if (actionBarMenuItemSearchListener == null) {
            return false;
        }
        actionBarMenuItemSearchListener.onSearchPressed(this.searchField);
        return false;
    }

    public final void lambda$checkCreateSearchField$14(View view) {
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener;
        if (this.searchField.length() != 0) {
            this.searchField.setText("");
        } else if (hasRemovableFilters()) {
            this.searchField.hideActionMode();
            for (int i = 0; i < this.currentSearchFilters.size(); i++) {
                if (this.listener != null && this.currentSearchFilters.get(i).removable) {
                    this.listener.onSearchFilterCleared(this.currentSearchFilters.get(i));
                }
            }
            clearSearchFilters();
        } else {
            TextView textView = this.searchFieldCaption;
            if (textView != null && textView.getVisibility() == 0 && ((actionBarMenuItemSearchListener = this.listener) == null || actionBarMenuItemSearchListener.canClearCaption())) {
                this.searchFieldCaption.setVisibility(8);
                ActionBarMenuItemSearchListener actionBarMenuItemSearchListener2 = this.listener;
                if (actionBarMenuItemSearchListener2 != null) {
                    actionBarMenuItemSearchListener2.onCaptionCleared();
                }
            }
        }
        this.searchField.requestFocus();
        AndroidUtilities.showKeyboard(this.searchField);
    }

    public final boolean lambda$createPopupLayout$1(View view, MotionEvent motionEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (motionEvent.getActionMasked() != 0 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        view.getHitRect(this.rect);
        if (this.rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        this.popupWindow.dismiss();
        return false;
    }

    public final void lambda$createPopupLayout$2(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.popupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    public final void lambda$onFiltersChanged$12(SearchFilterView searchFilterView, View view) {
        int iIndexOf = this.currentSearchFilters.indexOf(searchFilterView.getFilter());
        if (this.selectedFilterIndex != iIndexOf) {
            this.selectedFilterIndex = iIndexOf;
            onFiltersChanged();
            return;
        }
        if (searchFilterView.getFilter().removable) {
            if (!searchFilterView.animatorIsSelected.value) {
                searchFilterView.setSelectedForDelete(true);
                return;
            }
            FiltersView.MediaFilterData filter = searchFilterView.getFilter();
            removeSearchFilter(filter);
            ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = this.listener;
            if (actionBarMenuItemSearchListener != null) {
                actionBarMenuItemSearchListener.onSearchFilterCleared(filter);
                this.listener.onTextChanged(this.searchField);
            }
        }
    }

    public final void lambda$onTouchEvent$0() {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        toggleSubMenu();
    }

    public final void lambda$setOnMenuDismiss$11(Utilities.Callback callback) {
        if (callback != null) {
            callback.run(Boolean.valueOf(this.processedPopupClick));
        }
    }

    public final void lambda$toggleSubMenu$10() {
        onDismiss();
        ActionBarSubMenuItemDelegate actionBarSubMenuItemDelegate = this.subMenuDelegate;
        if (actionBarSubMenuItemDelegate != null) {
            actionBarSubMenuItemDelegate.onHideSubMenu();
        }
    }

    public final boolean lambda$toggleSubMenu$9(View view, int i, KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (i != 82 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 1 || (actionBarPopupWindow = this.popupWindow) == null || !actionBarPopupWindow.isShowing()) {
            return false;
        }
        this.popupWindow.dismiss();
        return true;
    }

    public Item lazilyAddColoredGap() {
        return putLazyItem(new Item(1));
    }

    public Item lazilyAddSubItem(int i, int i2, Drawable drawable, CharSequence charSequence, boolean z, boolean z2) {
        Item item = new Item(0);
        item.id = i;
        item.icon = i2;
        item.iconDrawable = drawable;
        item.text = charSequence;
        item.dismiss = z;
        item.needCheck = z2;
        return putLazyItem(item);
    }

    public Item lazilyAddSwipeBackItem(int i, Drawable drawable, String str, View view) {
        Item item = new Item(2);
        item.icon = i;
        item.iconDrawable = drawable;
        item.text = str;
        item.viewToSwipeBack = view;
        return putLazyItem(item);
    }

    public Item lazilyAddText(CharSequence charSequence, int i) {
        Item item = new Item(3);
        item.text = charSequence;
        item.textSizeDp = i;
        return putLazyItem(item);
    }

    public void onDismiss() {
    }

    public final void onFiltersChanged() {
        boolean zIsEmpty = this.currentSearchFilters.isEmpty();
        ArrayList arrayList = new ArrayList(this.currentSearchFilters);
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout != null && frameLayout.getTag() != null) {
            TransitionSet transitionSet = new TransitionSet();
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(150L);
            transitionSet.addTransition(new AnonymousClass4(0).setDuration(150L)).addTransition(changeBounds);
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
                if (!arrayList.remove(((SearchFilterView) this.searchFilterLayout.getChildAt(i)).getFilter())) {
                    this.searchFilterLayout.removeViewAt(i);
                    i--;
                }
                i++;
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            FiltersView.MediaFilterData mediaFilterData = (FiltersView.MediaFilterData) arrayList.get(i2);
            mediaFilterData.getClass();
            SearchFilterView searchFilterView = new SearchFilterView(getContext(), this.resourcesProvider);
            searchFilterView.setData(mediaFilterData);
            searchFilterView.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(3, this, searchFilterView));
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
                        actionBarMenuItem.searchField.setTranslationX(f - actionBarMenuItem.searchField.getX());
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
        } else if (this.textView != null) {
            accessibilityNodeInfo.setClassName("android.widget.Button");
            if (TextUtils.isEmpty(accessibilityNodeInfo.getText())) {
                accessibilityNodeInfo.setText(this.textView.getText());
            }
        }
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            updateOrShowPopup(false, true);
        }
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = this.listener;
        if (actionBarMenuItemSearchListener != null) {
            actionBarMenuItemSearchListener.onLayout(i, i2, i3, i4);
        }
    }

    public void onSearchPressed() {
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener = this.listener;
        if (actionBarMenuItemSearchListener != null) {
            actionBarMenuItemSearchListener.onSearchPressed(this.searchField);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
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
                    this.popupWindow.dismiss();
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
                toggleSubMenu();
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
                View itemAt = this.popupLayout.getItemAt(i);
                itemAt.getHitRect(this.rect);
                Object tag = itemAt.getTag();
                if ((tag instanceof Integer) && ((Integer) tag).intValue() < 100) {
                    if (this.rect.contains((int) f2, (int) f3)) {
                        itemAt.setPressed(true);
                        itemAt.setSelected(true);
                        if (Build.VERSION.SDK_INT == 21 && itemAt.getBackground() != null) {
                            itemAt.getBackground().setVisible(true, false);
                        }
                        itemAt.drawableHotspotChanged(f2, f3 - itemAt.getTop());
                        this.selectedMenuView = itemAt;
                    } else {
                        itemAt.setPressed(false);
                        itemAt.setSelected(false);
                        if (Build.VERSION.SDK_INT == 21 && itemAt.getBackground() != null) {
                            itemAt.getBackground().setVisible(false, false);
                        }
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void openSearch(boolean z) {
        ActionBarMenu actionBarMenu;
        checkCreateSearchField();
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout == null || frameLayout.getVisibility() == 0 || (actionBarMenu = this.parentMenu) == null) {
            return;
        }
        actionBarMenu.parentActionBar.onSearchFieldVisibilityChanged(toggleSearch(z));
    }

    public final Item putLazyItem(Item item) {
        if (this.lazyList == null) {
            this.lazyList = new ArrayList<>();
        }
        this.lazyList.add(item);
        if (this.lazyMap == null) {
            this.lazyMap = new HashMap<>();
        }
        this.lazyMap.put(Integer.valueOf(item.id), item);
        return item;
    }

    public void redrawPopup(int i) {
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

    public void removeAllSubItems() {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null) {
            return;
        }
        actionBarPopupWindowLayout.removeInnerViews();
    }

    public void removeSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        if (mediaFilterData.removable) {
            this.currentSearchFilters.remove(mediaFilterData);
            int i = this.selectedFilterIndex;
            if (i < 0 || i > this.currentSearchFilters.size() - 1) {
                this.selectedFilterIndex = this.currentSearchFilters.size() - 1;
            }
            onFiltersChanged();
            this.searchField.hideActionMode();
        }
    }

    public void requestFocusOnSearchView() {
        if (this.searchContainer.getWidth() == 0 || this.searchField.isFocused()) {
            return;
        }
        this.searchField.requestFocus();
        AndroidUtilities.showKeyboard(this.searchField);
    }

    public ActionBarMenuItem setActionBarMenuItemSearchListener(ActionBarMenuItemSearchListener actionBarMenuItemSearchListener) {
        this.listener = actionBarMenuItemSearchListener;
        return this;
    }

    public void setAdditionalXOffset(int i) {
        this.additionalXOffset = i;
    }

    public void setAdditionalYOffset(int i) {
        this.additionalYOffset = i;
    }

    public ActionBarMenuItem setAllowCloseAnimation(boolean z) {
        this.allowCloseAnimation = z;
        return this;
    }

    public void setBlurredBackgroundFactory(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory, BlurredBackgroundProvider blurredBackgroundProvider) {
        this.subMenuFactory = blurredBackgroundDrawableViewFactory;
        this.subMenuProvider = blurredBackgroundProvider;
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null || blurredBackgroundDrawableViewFactory == null) {
            return;
        }
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(actionBarPopupWindowLayout, null, true);
        blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProvider);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        actionBarPopupWindowLayout.setBackground(blurredBackgroundDrawableCreate);
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
        ImageView imageView = this.clearButton;
        if (imageView != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        }
    }

    public void setIgnoreOnTextChange() {
        this.ignoreOnTextChange = true;
    }

    public ActionBarMenuItem setIsSearchField(boolean z) {
        return setIsSearchField(z, false);
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
                    this.f$0.lambda$setOnMenuDismiss$11(callback);
                }
            });
        }
    }

    public ActionBarMenuItem setOverrideMenuClick(boolean z) {
        this.overrideMenuClick = z;
        return this;
    }

    public void setPopupAnimationEnabled(boolean z) {
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.setAnimationEnabled(z);
        }
        this.animationEnabled = z;
    }

    public void setPopupItemsColor(int i, boolean z) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
        if (actionBarPopupWindowLayout == null) {
            return;
        }
        LinearLayout linearLayout = actionBarPopupWindowLayout.linearLayout;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
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
        LinearLayout linearLayout = actionBarPopupWindowLayout.linearLayout;
        int childCount = linearLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = linearLayout.getChildAt(i2);
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

    public void setSearchFieldText(CharSequence charSequence, boolean z) {
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
        FrameLayout frameLayout = this.searchContainer;
        if (frameLayout != null) {
            ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).leftMargin = AndroidUtilities.dp(i);
            this.searchContainer.setClipChildren(this.searchItemPaddingStart != 0);
            FrameLayout frameLayout2 = this.searchContainer;
            frameLayout2.setLayoutParams(frameLayout2.getLayoutParams());
        }
    }

    public void setShowSearchProgress(boolean z) {
        CloseProgressDrawable2 closeProgressDrawable2 = this.progressDrawable;
        if (closeProgressDrawable2 == null) {
            return;
        }
        if (z) {
            closeProgressDrawable2.startAnimation();
        } else {
            closeProgressDrawable2.stopAnimation();
        }
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

    public void setSubItemShown(int i, boolean z) {
        if (z) {
            showSubItem(i);
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

    public void showSubItem(int i) {
        showSubItem(i, false);
    }

    public boolean toggleSearch(boolean z) {
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener;
        RLottieImageView iconView;
        Animator customToggleTransition;
        final int i = 0;
        final int i2 = 1;
        checkCreateSearchField();
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener2 = this.listener;
        if (actionBarMenuItemSearchListener2 != null) {
            actionBarMenuItemSearchListener2.onPreToggleSearch();
        }
        if (this.searchContainer == null || !((actionBarMenuItemSearchListener = this.listener) == null || actionBarMenuItemSearchListener.canToggleSearch())) {
            return false;
        }
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener3 = this.listener;
        if (actionBarMenuItemSearchListener3 != null && (customToggleTransition = actionBarMenuItemSearchListener3.getCustomToggleTransition()) != null) {
            customToggleTransition.start();
            return true;
        }
        final ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < this.parentMenu.getChildCount(); i3++) {
            View childAt = this.parentMenu.getChildAt(i3);
            if ((childAt instanceof ActionBarMenuItem) && (iconView = ((ActionBarMenuItem) childAt).getIconView()) != null) {
                arrayList.add(iconView);
            }
        }
        Object tag = this.searchContainer.getTag();
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
            FrameLayout frameLayout = this.searchContainer;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, frameLayout.getAlpha(), 1.0f));
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
                    switch (i2) {
                        case 0:
                            ActionBarMenuItem actionBarMenuItem = this.this$0;
                            actionBarMenuItem.searchContainer.setAlpha(0.0f);
                            int i5 = 0;
                            while (true) {
                                ArrayList arrayList2 = arrayList;
                                if (i5 >= arrayList2.size()) {
                                    actionBarMenuItem.searchContainer.setVisibility(8);
                                } else {
                                    ((View) arrayList2.get(i5)).setAlpha(1.0f);
                                    i5++;
                                }
                                break;
                            }
                            break;
                        default:
                            this.this$0.searchContainer.setAlpha(1.0f);
                            int i6 = 0;
                            while (true) {
                                ArrayList arrayList3 = arrayList;
                                if (i6 < arrayList3.size()) {
                                    ((View) arrayList3.get(i6)).setAlpha(0.0f);
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
            clearSearchFilters();
            this.searchField.setText("");
            this.searchField.requestFocus();
            if (z) {
                AndroidUtilities.showKeyboard(this.searchField);
            }
            this.searchContainer.setTag(1);
            ActionBarMenuItemSearchListener actionBarMenuItemSearchListener4 = this.listener;
            if (actionBarMenuItemSearchListener4 != null) {
                actionBarMenuItemSearchListener4.onSearchExpand();
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
        FrameLayout frameLayout2 = this.searchContainer;
        animatorSet4.playTogether(ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) property, frameLayout2.getAlpha(), 0.0f));
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
                switch (i) {
                    case 0:
                        ActionBarMenuItem actionBarMenuItem = this.this$0;
                        actionBarMenuItem.searchContainer.setAlpha(0.0f);
                        int i6 = 0;
                        while (true) {
                            ArrayList arrayList2 = arrayList;
                            if (i6 >= arrayList2.size()) {
                                actionBarMenuItem.searchContainer.setVisibility(8);
                            } else {
                                ((View) arrayList2.get(i6)).setAlpha(1.0f);
                                i6++;
                            }
                            break;
                        }
                        break;
                    default:
                        this.this$0.searchContainer.setAlpha(1.0f);
                        int i7 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList;
                            if (i7 < arrayList3.size()) {
                                ((View) arrayList3.get(i7)).setAlpha(0.0f);
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
        if (!this.currentSearchFilters.isEmpty() && this.listener != null) {
            for (int i6 = 0; i6 < this.currentSearchFilters.size(); i6++) {
                if (this.currentSearchFilters.get(i6).removable) {
                    this.listener.onSearchFilterCleared(this.currentSearchFilters.get(i6));
                }
            }
        }
        ActionBarMenuItemSearchListener actionBarMenuItemSearchListener5 = this.listener;
        if (actionBarMenuItemSearchListener5 != null) {
            actionBarMenuItemSearchListener5.onSearchCollapse();
        }
        if (z) {
            AndroidUtilities.hideKeyboard(this.searchField);
        }
        this.parentMenu.requestLayout();
        requestLayout();
        return false;
    }

    public void toggleSubMenu(View view, View view2) {
        View view3;
        View childAt;
        ActionBar actionBar;
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        FrameLayout frameLayout = null;
        if ((actionBarPopupWindow == null || !actionBarPopupWindow.isShowing()) && this.lazyList != null) {
            for (int i = 0; i < this.lazyList.size(); i++) {
                Item item = this.lazyList.get(i);
                item.getClass();
                createPopupLayout();
                if (item.view != null) {
                    this.popupLayout.addView(item.view);
                } else {
                    int i2 = item.viewType;
                    if (i2 == 0) {
                        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(item.needCheck ? 1 : 0, getContext(), this.resourcesProvider, false, false);
                        actionBarMenuSubItem.setTextAndIcon(item.text, item.icon, item.iconDrawable);
                        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        actionBarMenuSubItem.setTag(Integer.valueOf(item.id));
                        this.popupLayout.addView(actionBarMenuSubItem);
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams.gravity = 5;
                        }
                        layoutParams.width = -1;
                        layoutParams.height = AndroidUtilities.dp(48.0f);
                        actionBarMenuSubItem.setLayoutParams(layoutParams);
                        actionBarMenuSubItem.setOnClickListener(new AlertDialog$$ExternalSyntheticLambda5(4, item, this));
                        Integer num = item.textColor;
                        if (num != null && item.iconColor != null) {
                            actionBarMenuSubItem.setColors(num.intValue(), item.iconColor.intValue());
                        }
                        item.view = actionBarMenuSubItem;
                    } else if (i2 == 1) {
                        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
                        gapView.setTag(R.id.fit_width_tag, 1);
                        this.popupLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
                        item.view = gapView;
                    } else if (i2 == 2) {
                        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, getContext(), this.resourcesProvider, false, false);
                        actionBarMenuSubItem2.setTextAndIcon(item.text, item.icon, item.iconDrawable);
                        actionBarMenuSubItem2.setMinimumWidth(AndroidUtilities.dp(196.0f));
                        actionBarMenuSubItem2.setRightIcon(R.drawable.msg_arrowright);
                        actionBarMenuSubItem2.getRightIcon().setVisibility(item.rightIconVisibility);
                        this.popupLayout.addView(actionBarMenuSubItem2);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) actionBarMenuSubItem2.getLayoutParams();
                        if (LocaleController.isRTL) {
                            layoutParams2.gravity = 5;
                        }
                        layoutParams2.width = -1;
                        layoutParams2.height = AndroidUtilities.dp(48.0f);
                        actionBarMenuSubItem2.setLayoutParams(layoutParams2);
                        actionBarMenuSubItem2.openSwipeBackLayout = new ActionBarMenuItem$$ExternalSyntheticLambda10(this, this.popupLayout.addViewToSwipeBack(item.viewToSwipeBack), 1);
                        actionBarMenuSubItem2.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda11(actionBarMenuSubItem2, 1));
                        this.popupLayout.swipeBackGravityRight = true;
                        Integer num2 = item.textColor;
                        if (num2 != null && item.iconColor != null) {
                            actionBarMenuSubItem2.setColors(num2.intValue(), item.iconColor.intValue());
                        }
                        item.view = actionBarMenuSubItem2;
                    } else if (i2 == 3) {
                        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext());
                        linksTextView.setTag(R.id.fit_width_tag, 1);
                        linksTextView.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
                        linksTextView.setTextSize(1, item.textSizeDp);
                        linksTextView.setTextColor(Theme.getColor(null, Theme.key_actionBarDefaultSubmenuItem, false));
                        linksTextView.setMovementMethod(LinkMovementMethod.getInstance());
                        linksTextView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
                        linksTextView.setText(item.text);
                        linksTextView.setMaxWidth(AndroidUtilities.dp(200.0f));
                        this.popupLayout.addView((View) linksTextView, LayoutHelper.createLinear(-1, -2, 0.0f, 0, 0, 8, 0, 0));
                        item.view = linksTextView;
                    }
                }
                View view4 = item.view;
                if (view4 != null) {
                    view4.setVisibility(item.visibility);
                    ChatActivity$$ExternalSyntheticLambda116 chatActivity$$ExternalSyntheticLambda116 = item.overrideClickListener;
                    if (chatActivity$$ExternalSyntheticLambda116 != null) {
                        item.view.setOnClickListener(chatActivity$$ExternalSyntheticLambda116);
                    }
                }
            }
            this.lazyList.clear();
        }
        if (this.popupLayout != null) {
            ActionBarMenu actionBarMenu = this.parentMenu;
            if (actionBarMenu == null || !actionBarMenu.isActionMode || (actionBar = actionBarMenu.parentActionBar) == null || actionBar.isActionModeShowed()) {
                Runnable runnable = this.showMenuRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.showMenuRunnable = null;
                }
                ActionBarPopupWindow actionBarPopupWindow2 = this.popupWindow;
                if (actionBarPopupWindow2 != null && actionBarPopupWindow2.isShowing()) {
                    this.popupWindow.dismiss();
                    return;
                }
                this.showSubMenuFrom = view2;
                ActionBarSubMenuItemDelegate actionBarSubMenuItemDelegate = this.subMenuDelegate;
                if (actionBarSubMenuItemDelegate != null) {
                    actionBarSubMenuItemDelegate.onShowSubMenu();
                }
                if (this.popupLayout.getParent() != null) {
                    ((ViewGroup) this.popupLayout.getParent()).removeView(this.popupLayout);
                }
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = this.popupLayout;
                if (view != null) {
                    FloatingToolbar.AnonymousClass2 anonymousClass2 = new FloatingToolbar.AnonymousClass2(this, getContext(), view);
                    anonymousClass2.setOrientation(1);
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setAlpha(0.0f);
                    frameLayout2.animate().alpha(1.0f).setDuration(100L).setStartDelay(this.popupLayout.shownFromBottom ? 165L : 0L).start();
                    if (view.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    if ((view instanceof ActionBarMenuSubItem) || (view instanceof LinearLayout)) {
                        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.subMenuFactory;
                        if (blurredBackgroundDrawableViewFactory != null) {
                            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this.popupLayout, null, true);
                            blurredBackgroundDrawableCreate.setColorProvider(this.subMenuProvider);
                            Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(12.0f), 8.0f);
                            blurredBackgroundDrawableCreate.boundProps.hasPadding = true;
                            frameLayout2.setBackground(blurredBackgroundDrawableCreate);
                        } else {
                            Drawable drawableMutate = getContext().getDrawable(R.drawable.popup_fixed_alert2).mutate();
                            drawableMutate.setColorFilter(new PorterDuffColorFilter(this.popupLayout.getBackgroundColor(), PorterDuff.Mode.MULTIPLY));
                            frameLayout2.setBackground(drawableMutate);
                        }
                    }
                    frameLayout2.addView(view, LayoutHelper.createFrame(-1, -2.0f));
                    anonymousClass2.addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
                    anonymousClass2.addView(this.popupLayout, LayoutHelper.createLinear(-2, -2, 0, 0, -10, 0, 0));
                    this.popupLayout.setTopView(frameLayout2);
                    frameLayout = frameLayout2;
                    view3 = anonymousClass2;
                } else {
                    actionBarPopupWindowLayout.setTopView(null);
                    view3 = actionBarPopupWindowLayout;
                }
                if (this.subMenuFactory != null) {
                    ItemOptions.setGapBackgroundColor(this.popupLayout, Theme.multAlpha(0.06f, Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider)));
                }
                ActionBarPopupWindow actionBarPopupWindow3 = new ActionBarPopupWindow(view3, -2, -2);
                this.popupWindow = actionBarPopupWindow3;
                if (this.animationEnabled) {
                    actionBarPopupWindow3.setAnimationStyle(0);
                } else {
                    actionBarPopupWindow3.setAnimationStyle(R.style.PopupAnimation);
                }
                boolean z = this.animationEnabled;
                if (!z) {
                    this.popupWindow.setAnimationEnabled(z);
                }
                this.popupWindow.setOutsideTouchable(true);
                this.popupWindow.setClippingEnabled(true);
                if (this.layoutInScreen) {
                    this.popupWindow.setLayoutInScreen(true);
                }
                this.popupWindow.setInputMethodMode(2);
                this.popupWindow.setSoftInputMode(0);
                view3.setFocusableInTouchMode(true);
                view3.setOnKeyListener(new View.OnKeyListener() {
                    @Override
                    public final boolean onKey(View view5, int i3, KeyEvent keyEvent) {
                        return this.f$0.lambda$toggleSubMenu$9(view5, i3, keyEvent);
                    }
                });
                this.popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() {
                    @Override
                    public final void onDismiss() {
                        this.f$0.lambda$toggleSubMenu$10();
                    }
                });
                view3.measure(OKLCH.m(40.0f, AndroidUtilities.displaySize.x, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE));
                if (frameLayout != null && frameLayout.getLayoutParams() != null && this.popupLayout.getSwipeBack() != null && (childAt = this.popupLayout.getSwipeBack().getChildAt(0)) != null && childAt.getMeasuredWidth() > 0) {
                    frameLayout.getLayoutParams().width = AndroidUtilities.dp(16.0f) + childAt.getMeasuredWidth();
                }
                this.measurePopup = false;
                this.processedPopupClick = false;
                this.popupWindow.setFocusable(true);
                updateOrShowPopup(true, view3.getMeasuredWidth() == 0);
                this.popupLayout.updateRadialSelectors();
                if (this.popupLayout.getSwipeBack() != null) {
                    this.popupLayout.getSwipeBack().closeForeground(false);
                }
                this.popupWindow.startAnimation();
                float f = this.dimMenu;
                if (f > 0.0f) {
                    this.popupWindow.dimBehind(f);
                }
            }
        }
    }

    public void updateColor() {
        if (this.searchFilterLayout != null) {
            for (int i = 0; i < this.searchFilterLayout.getChildCount(); i++) {
                if (this.searchFilterLayout.getChildAt(i) instanceof SearchFilterView) {
                    ((SearchFilterView) this.searchFilterLayout.getChildAt(i)).updateColors();
                }
            }
        }
        if (this.popupLayout != null) {
            for (int i2 = 0; i2 < this.popupLayout.getItemsCount(); i2++) {
                if (this.popupLayout.getItemAt(i2) instanceof ActionBarMenuSubItem) {
                    ((ActionBarMenuSubItem) this.popupLayout.getItemAt(i2)).setSelectorColor(Theme.getColor(Theme.key_dialogButtonSelector, this.resourcesProvider));
                }
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.searchField;
        if (editTextBoldCursor != null) {
            int i3 = Theme.key_actionBarDefaultSearch;
            editTextBoldCursor.setCursorColor(Theme.getColor(i3, this.resourcesProvider));
            this.searchField.setHintTextColor(Theme.getColor(Theme.key_actionBarDefaultSearchPlaceholder, this.resourcesProvider));
            this.searchField.setTextColor(Theme.getColor(i3, this.resourcesProvider));
            this.searchField.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
            this.searchField.setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, this.resourcesProvider));
        }
    }

    public final void updateOrShowPopup(boolean z, boolean z2) {
        int paddingTop;
        int top;
        ActionBarMenu actionBarMenu = this.parentMenu;
        if (actionBarMenu != null) {
            top = this.parentMenu.getTop() + (-actionBarMenu.parentActionBar.getMeasuredHeight());
            paddingTop = this.parentMenu.getPaddingTop();
        } else {
            float scaleY = getScaleY();
            paddingTop = -((int) ((getMeasuredHeight() * scaleY) - ((this.subMenuOpenSide != 2 ? getTranslationY() : 0.0f) / scaleY)));
            top = this.additionalYOffset;
        }
        int i = paddingTop + top + this.yOffset;
        if (z) {
            this.popupLayout.scrollToTop();
        }
        View view = this.showSubMenuFrom;
        if (view == null) {
            view = this;
        }
        ActionBarMenu actionBarMenu2 = this.parentMenu;
        if (actionBarMenu2 != null) {
            int i2 = this.subMenuOpenSide;
            ActionBar actionBar = actionBarMenu2.parentActionBar;
            if (i2 == 0) {
                if (z) {
                    this.popupWindow.showAsDropDown(actionBar, ((view.getMeasuredWidth() + (this.parentMenu.getLeft() + view.getLeft())) - this.popupWindow.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.xOffset, i);
                }
                if (z2) {
                    this.popupWindow.update(actionBar, ((view.getMeasuredWidth() + (this.parentMenu.getLeft() + view.getLeft())) - this.popupWindow.getContentView().getMeasuredWidth()) + ((int) getTranslationX()) + this.xOffset, i, -1, -1);
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
                View view2 = (View) getParent();
                if (z) {
                    this.popupWindow.showAsDropDown(view2, ((getMeasuredWidth() + getLeft()) - this.popupWindow.getContentView().getMeasuredWidth()) + this.additionalXOffset + this.xOffset, i);
                }
                if (z2) {
                    this.popupWindow.update(view2, ((getMeasuredWidth() + getLeft()) - this.popupWindow.getContentView().getMeasuredWidth()) + this.additionalXOffset + this.xOffset, i, -1, -1);
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

    public static ActionBarMenuSubItem addItem(boolean z, boolean z2, ViewGroup viewGroup, int i, CharSequence charSequence, boolean z3, Theme.ResourcesProvider resourcesProvider) {
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(z3 ? 1 : 0, viewGroup.getContext(), resourcesProvider, z, z2);
        actionBarMenuSubItem.setTextAndIcon(charSequence, i);
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

    public ActionBarPopupWindow.GapView addColoredGap(int i) {
        createPopupLayout();
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), this.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
        if (i != -1) {
            gapView.setTag(Integer.valueOf(i));
        }
        gapView.setTag(R.id.fit_width_tag, 1);
        this.popupLayout.addView((View) gapView, LayoutHelper.createLinear(-1, 8));
        return gapView;
    }

    public ActionBarMenuItem setIsSearchField(boolean z, boolean z2) {
        if (this.parentMenu == null) {
            return this;
        }
        this.isSearchField = z;
        this.wrapSearchInScrollView = z2;
        return this;
    }

    public void showSubItem(int i, boolean z) {
        View viewFindViewWithTag;
        HashMap<Integer, Item> map = this.lazyMap;
        Item item = map == null ? null : map.get(Integer.valueOf(i));
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
        this.measurePopup = true;
    }

    public ActionBarMenuItem(Context context, ActionBarMenu actionBarMenu, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.searchFilterViews = new ArrayList<>();
        this.allowCloseAnimation = true;
        this.animationEnabled = true;
        this.animateClear = true;
        this.measurePopup = true;
        this.showSubmenuByMove = true;
        this.currentSearchFilters = new ArrayList<>();
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
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setGravity(17);
            this.textView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.textView.setImportantForAccessibility(2);
            if (i2 != 0) {
                this.textView.setTextColor(i2);
            }
            addView(this.textView, LayoutHelper.createFrame(-2, -1.0f));
            return;
        }
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.iconView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.iconView.setImportantForAccessibility(2);
        addView(this.iconView, LayoutHelper.createFrame(-1, -1.0f));
        if (i2 != 0) {
            this.iconView.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
        }
    }

    public void addSubItem(int i, View view, int i2, int i3) {
        createPopupLayout();
        view.setLayoutParams(new LinearLayout.LayoutParams(i2, i3));
        this.popupLayout.addView(view);
        view.setTag(Integer.valueOf(i));
        view.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda7(this, 2));
        view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
    }

    public void setIcon(int i) {
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView == null) {
            return;
        }
        this.iconViewResId = i;
        rLottieImageView.setImageResource(i);
    }

    public void setIcon(int i, boolean z) {
        RLottieImageView rLottieImageView = this.iconView;
        if (rLottieImageView == null || this.iconViewResId == i) {
            return;
        }
        if (z) {
            this.iconViewResId = i;
            AndroidUtilities.updateImageViewImageAnimated(rLottieImageView, i);
        } else {
            this.iconViewResId = i;
            rLottieImageView.setImageResource(i);
        }
    }

    public TextView addSubItem(int i, CharSequence charSequence) {
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
        this.popupLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda7(this, 3));
        return textView;
    }

    public Item lazilyAddSubItem(int i, int i2, CharSequence charSequence) {
        return lazilyAddSubItem(i, i2, null, charSequence, true, false);
    }

    public Item lazilyAddSubItem(int i, Drawable drawable, CharSequence charSequence) {
        return lazilyAddSubItem(i, 0, drawable, charSequence, true, false);
    }

    public static View addGap(int i, ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
        View view = new View(actionBarPopupWindowLayout.getContext());
        view.setTag(Integer.valueOf(i));
        view.setTag(R.id.object_tag, 1);
        view.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindowLayout.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(6.0f);
        view.setLayoutParams(layoutParams);
        return view;
    }

    public ActionBarMenuSubItem addSubItem(int i, int i2, CharSequence charSequence) {
        return addSubItem(i, i2, null, charSequence, true, false);
    }

    public ActionBarMenuSubItem addSubItem(int i, int i2, CharSequence charSequence, Theme.ResourcesProvider resourcesProvider) {
        return addSubItem(i, i2, null, charSequence, true, false, resourcesProvider);
    }

    public ActionBarMenuSubItem addSubItem(int i, int i2, CharSequence charSequence, boolean z) {
        return addSubItem(i, i2, null, charSequence, true, z);
    }

    public ActionBarMenuSubItem addSubItem(int i, int i2, Drawable drawable, CharSequence charSequence, boolean z, boolean z2) {
        return addSubItem(i, i2, drawable, charSequence, z, z2, this.resourcesProvider);
    }

    public ActionBarMenuSubItem addSubItem(int i, int i2, Drawable drawable, CharSequence charSequence, boolean z, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        createPopupLayout();
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(z2 ? 1 : 0, getContext(), resourcesProvider, false, false);
        actionBarMenuSubItem.setTextAndIcon(charSequence, i2, drawable);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarMenuSubItem.setTag(Integer.valueOf(i));
        this.popupLayout.addView(actionBarMenuSubItem);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) actionBarMenuSubItem.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        actionBarMenuSubItem.setLayoutParams(layoutParams);
        actionBarMenuSubItem.setOnClickListener(new ChatListCell$$ExternalSyntheticLambda0(this, z, 1));
        return actionBarMenuSubItem;
    }

    public View addSubItem(int i, View view) {
        createPopupLayout();
        view.setMinimumWidth(AndroidUtilities.dp(196.0f));
        view.setTag(Integer.valueOf(i));
        this.popupLayout.addView(view);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (LocaleController.isRTL) {
            layoutParams.gravity = 5;
        }
        layoutParams.width = -1;
        layoutParams.height = AndroidUtilities.dp(48.0f);
        view.setLayoutParams(layoutParams);
        view.setOnClickListener(new ActionBarMenuItem$$ExternalSyntheticLambda7(this, 0));
        return view;
    }

    public void toggleSubMenu() {
        toggleSubMenu(null, null);
    }
}
