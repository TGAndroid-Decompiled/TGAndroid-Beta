package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Property;
import android.util.Size;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.Transformation;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.ExoPlayerImpl$$ExternalSyntheticLambda23;
import com.google.firebase.messaging.Metadata;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ImageUpdater$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LPhotoPaintView;
import org.telegram.ui.Components.PopupSwipeBackLayout;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundProviderBuilder;
import org.telegram.ui.Components.voip.VoIPBackgroundProvider;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.iv.RichEditor;

public final class FloatingToolbar {
    public static final FloatingToolbar$$ExternalSyntheticLambda1 NO_OP_MENUITEM_CLICK_LISTENER = new FloatingToolbar$$ExternalSyntheticLambda1();
    public static final List premiumOptions;
    public final BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory;
    public final int currentStyle;
    public Menu mMenu;
    public final FloatingToolbarPopup mPopup;
    public final View mWindowView;
    public Runnable premiumLockClickListener;
    public ImageUpdater$$ExternalSyntheticLambda3 quoteShowCallback;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Rect mContentRect = new Rect();
    public final Rect mPreviousContentRect = new Rect();
    public ArrayList mShowingMenuItems = new ArrayList();
    public MenuItem.OnMenuItemClickListener mMenuItemClickListener = NO_OP_MENUITEM_CLICK_LISTENER;
    public boolean mWidthChanged = true;
    public final AnonymousClass1 mOrientationChangeHandler = new View.OnLayoutChangeListener() {
        public final Rect mNewRect = new Rect();
        public final Rect mOldRect = new Rect();

        @Override
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Rect rect = this.mNewRect;
            rect.set(i, i2, i3, i4);
            Rect rect2 = this.mOldRect;
            rect2.set(i5, i6, i7, i8);
            FloatingToolbar floatingToolbar = FloatingToolbar.this;
            if (!floatingToolbar.mPopup.isShowing() || rect.equals(rect2)) {
                return;
            }
            floatingToolbar.mWidthChanged = true;
            if (floatingToolbar.mPopup.isShowing()) {
                floatingToolbar.doShow();
            }
        }
    };
    public final Theme$$ExternalSyntheticLambda5 mMenuItemComparator = new Theme$$ExternalSyntheticLambda5(23);

    public final class FloatingToolbarPopup {
        public final Drawable mArrow;
        public final AnimationSet mCloseOverflowAnimation;
        public final RelativeLayout mContentContainer;
        public final Context mContext;
        public final AnimatorSet mDismissAnimation;
        public final Interpolator mFastOutLinearInInterpolator;
        public final Interpolator mFastOutSlowInInterpolator;
        public boolean mHidden;
        public final AnimatorSet mHideAnimation;
        public boolean mIsOverflowOpen;
        public final int mLineHeight;
        public final Interpolator mLinearOutSlowInInterpolator;
        public final LogAccelerateInterpolator mLogAccelerateInterpolator;
        public final RichEditor.AnonymousClass6 mMainPanel;
        public Size mMainPanelSize;
        public final int mMarginHorizontal;
        public final int mMarginVertical;
        public MenuItem.OnMenuItemClickListener mOnMenuItemClickListener;
        public final AnimationSet mOpenOverflowAnimation;
        public boolean mOpenOverflowUpwards;
        public final Drawable mOverflow;
        public final FrameLayout mOverflowButton;
        public final AnonymousClass3 mOverflowButtonIcon;
        public final View mOverflowButtonShadow;
        public final Size mOverflowButtonSize;
        public final TextView mOverflowButtonText;
        public final OverflowPanel mOverflowPanel;
        public Size mOverflowPanelSize;
        public final Metadata mOverflowPanelViewHelper;
        public final View mParent;
        public final PopupWindow mPopupWindow;
        public final AnimatorSet mShowAnimation;
        public final AnimatedVectorDrawable mToArrow;
        public final AnimatedVectorDrawable mToOverflow;
        public int mTransitionDurationScale;
        public final Rect mViewPortOnScreen = new Rect();
        public final Point mCoordsOnWindow = new Point();
        public final int[] mTmpCoords = new int[2];
        public final Region mTouchableRegion = new Region();
        public boolean mDismissed = true;
        public final AnonymousClass2 mMenuItemButtonOnClickListener = new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                MenuItem.OnMenuItemClickListener onMenuItemClickListener;
                if (!(view.getTag() instanceof MenuItem) || (onMenuItemClickListener = FloatingToolbarPopup.this.mOnMenuItemClickListener) == null) {
                    return;
                }
                onMenuItemClickListener.onMenuItemClick((MenuItem) view.getTag());
            }
        };
        public int shiftDp = -4;

        public final class AnonymousClass4 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final FloatingToolbarPopup this$1;

            public AnonymousClass4(FloatingToolbarPopup floatingToolbarPopup, int i) {
                this.$r8$classId = i;
                this.this$1 = floatingToolbarPopup;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new Theme$$ExternalSyntheticLambda8(this, 14));
                        break;
                    default:
                        NotificationCenter.getInstance(UserConfig.selectedAccount).doOnIdle(new Theme$$ExternalSyntheticLambda8(this, 15));
                        break;
                }
            }
        }

        public final class LogAccelerateInterpolator implements Interpolator {
            public final float LOGS_SCALE = 1.0f / ((float) (1.0d - Math.pow(100, -1.0f)));

            @Override
            public final float getInterpolation(float f) {
                return 1.0f - (((float) (1.0d - Math.pow(100, -(1.0f - f)))) * this.LOGS_SCALE);
            }
        }

        public final class OverflowPanel extends ListView {
            public final FloatingToolbarPopup mPopup;
            public final Matrix matrix;
            public final Paint paintBottom;
            public final Paint paintTop;
            public final LinearGradient shaderBottom;

            public OverflowPanel(FloatingToolbarPopup floatingToolbarPopup) {
                super(floatingToolbarPopup.mContext);
                float fDp = AndroidUtilities.dp(16.0f);
                int[] iArr = new int[8];
                PathInterpolator pathInterpolator = GradientProtectionDrawable.DEFAULT_INTERPOLATOR;
                GradientProtectionDrawable.fillColors(pathInterpolator, -16777216, iArr);
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                LinearGradient linearGradient = new LinearGradient(0.0f, fDp, 0.0f, 0.0f, iArr, (float[]) null, tileMode);
                float fDp2 = AndroidUtilities.dp(16.0f);
                int[] iArr2 = new int[8];
                GradientProtectionDrawable.fillColors(pathInterpolator, -16777216, iArr2);
                LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, fDp2, iArr2, (float[]) null, tileMode);
                this.shaderBottom = linearGradient2;
                Paint paint = new Paint(1);
                this.paintTop = paint;
                Paint paint2 = new Paint(1);
                this.paintBottom = paint2;
                this.matrix = new Matrix();
                paint.setShader(linearGradient);
                PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
                paint.setXfermode(new PorterDuffXfermode(mode));
                paint2.setShader(linearGradient2);
                paint2.setXfermode(new PorterDuffXfermode(mode));
                this.mPopup = floatingToolbarPopup;
                setVerticalScrollBarEnabled(false);
            }

            @Override
            public final boolean awakenScrollBars() {
                return super.awakenScrollBars();
            }

            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (FloatingToolbarPopup.access$2700(this.mPopup)) {
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                float y = view.getY();
                float height = y + view.getHeight();
                boolean z = y < ((float) AndroidUtilities.dp(16.0f));
                boolean z2 = height > ((float) (getHeight() - AndroidUtilities.dp(16.0f)));
                if (!z && !z2) {
                    return super.drawChild(canvas, view, j);
                }
                canvas.saveLayer(0.0f, y, getWidth(), height, null);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                if (z) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.dp(16.0f), this.paintTop);
                }
                if (z2) {
                    canvas.drawRect(0.0f, getHeight() - AndroidUtilities.dp(16.0f), getWidth(), getHeight(), this.paintBottom);
                }
                canvas.restore();
                return zDrawChild;
            }

            @Override
            public final void onMeasure(int i, int i2) {
                FloatingToolbarPopup floatingToolbarPopup = this.mPopup;
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(floatingToolbarPopup.mOverflowPanelSize.getHeight() - floatingToolbarPopup.mOverflowButtonSize.getHeight(), 1073741824));
            }

            @Override
            public final void onSizeChanged(int i, int i2, int i3, int i4) {
                Matrix matrix = this.matrix;
                matrix.reset();
                matrix.postTranslate(0.0f, i2 - AndroidUtilities.dp(16.0f));
                this.shaderBottom.setLocalMatrix(matrix);
            }
        }

        public FloatingToolbarPopup(Context context, View view) {
            int i;
            int color;
            Object obj;
            int i2 = 2;
            this.mParent = view;
            this.mContext = context;
            FloatingToolbar.this.getClass();
            RelativeLayout relativeLayout = new RelativeLayout(context);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int iDp = AndroidUtilities.dp(20.0f);
            marginLayoutParams.rightMargin = iDp;
            marginLayoutParams.topMargin = iDp;
            marginLayoutParams.leftMargin = iDp;
            marginLayoutParams.bottomMargin = iDp;
            relativeLayout.setLayoutParams(marginLayoutParams);
            relativeLayout.setElevation(AndroidUtilities.dp(1.0f));
            relativeLayout.setFocusable(true);
            relativeLayout.setFocusableInTouchMode(true);
            int i3 = FloatingToolbar.this.currentStyle;
            Theme.ResourcesProvider resourcesProvider = FloatingToolbar.this.resourcesProvider;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = FloatingToolbar.this.blurredBackgroundDrawableViewFactory;
            if (blurredBackgroundDrawableViewFactory != null) {
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(relativeLayout, null, true);
                BlurredBackgroundProviderBuilder blurredBackgroundProviderBuilder = new BlurredBackgroundProviderBuilder(resourcesProvider);
                blurredBackgroundProviderBuilder.backgroundColor = new LivePlayer$$ExternalSyntheticLambda1(10);
                int i4 = 687865855;
                blurredBackgroundProviderBuilder.strokeColorTop = new ExoPlayerImpl$$ExternalSyntheticLambda23(i4, i4, i2);
                int i5 = 352321535;
                blurredBackgroundProviderBuilder.strokeColorBottom = new ExoPlayerImpl$$ExternalSyntheticLambda23(i5, i5, i2);
                float fDpf2 = AndroidUtilities.dpf2(0.6666667f);
                float fDpf3 = AndroidUtilities.dpf2(0.6666667f);
                blurredBackgroundProviderBuilder.strokeWidthTop = fDpf2;
                blurredBackgroundProviderBuilder.strokeWidthBottom = fDpf3;
                blurredBackgroundDrawableCreate.setColorProvider(blurredBackgroundProviderBuilder);
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(12.0f));
                relativeLayout.setBackground(blurredBackgroundDrawableCreate);
            } else {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                float fDp = AndroidUtilities.dp(12.0f);
                gradientDrawable.setCornerRadii(new float[]{fDp, fDp, fDp, fDp, fDp, fDp, fDp, fDp});
                if (i3 == 0) {
                    gradientDrawable.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                } else if (i3 == 2) {
                    gradientDrawable.setColor(-115203550);
                } else if (i3 == 1) {
                    gradientDrawable.setColor(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
                }
                relativeLayout.setBackground(gradientDrawable);
            }
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            relativeLayout.setClipToOutline(true);
            this.mContentContainer = relativeLayout;
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(relativeLayout.getContext(), 0);
            PopupWindow popupWindow = new PopupWindow(anonymousClass2);
            popupWindow.setClippingEnabled(false);
            popupWindow.setAnimationStyle(0);
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
            popupWindow.setSplitTouchEnabled(true);
            relativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            anonymousClass2.addView(relativeLayout);
            this.mPopupWindow = popupWindow;
            this.mMarginHorizontal = AndroidUtilities.dp(16.0f);
            this.mMarginVertical = AndroidUtilities.dp(8.0f);
            this.mLineHeight = AndroidUtilities.dp(48.0f);
            int iDp2 = AndroidUtilities.dp(8.0f);
            this.mLogAccelerateInterpolator = new LogAccelerateInterpolator();
            this.mFastOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, 17563661);
            this.mLinearOutSlowInInterpolator = AnimationUtils.loadInterpolator(context, 17563662);
            this.mFastOutLinearInInterpolator = AnimationUtils.loadInterpolator(context, 17563663);
            Drawable drawableMutate = context.getDrawable(R.drawable.ft_avd_tooverflow).mutate();
            this.mArrow = drawableMutate;
            drawableMutate.setAutoMirrored(true);
            Drawable drawableMutate2 = context.getDrawable(R.drawable.ft_avd_toarrow).mutate();
            this.mOverflow = drawableMutate2;
            drawableMutate2.setAutoMirrored(true);
            AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_toarrow_animation).mutate();
            this.mToArrow = animatedVectorDrawable;
            animatedVectorDrawable.setAutoMirrored(true);
            AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) context.getDrawable(R.drawable.ft_avd_tooverflow_animation).mutate();
            this.mToOverflow = animatedVectorDrawable2;
            animatedVectorDrawable2.setAutoMirrored(true);
            FrameLayout frameLayout = new FrameLayout(context);
            this.mOverflowButton = frameLayout;
            ?? r10 = new ImageButton(context) {
                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (FloatingToolbarPopup.this.mIsOverflowOpen) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
            };
            this.mOverflowButtonIcon = r10;
            r10.setLayoutParams(new ViewGroup.LayoutParams(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(48.0f)));
            r10.setPaddingRelative(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            r10.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            r10.setImageDrawable(drawableMutate2);
            TextView textView = new TextView(context);
            this.mOverflowButtonText = textView;
            textView.setText(LocaleController.getString(R.string.Back));
            textView.setTextSize(1, 16.0f);
            textView.setAlpha(0.0f);
            View view2 = new View(context);
            this.mOverflowButtonShadow = view2;
            if (i3 == 0) {
                int i6 = Theme.key_dialogTextBlack;
                int color2 = Theme.getColor(i6, resourcesProvider);
                int i7 = Theme.key_listSelector;
                obj = relativeLayout;
                i = iDp2;
                r10.setBackground(Theme.createSelectorDrawable(Theme.getColor(i7, resourcesProvider), 1, -1));
                frameLayout.setBackground(Theme.createSelectorDrawable(Theme.getColor(i7, resourcesProvider), 2, -1));
                view2.setBackgroundColor(Theme.multAlpha(0.4f, Theme.getColor(i6, resourcesProvider)));
                color = color2;
            } else {
                Object obj2 = relativeLayout;
                i = iDp2;
                if (i3 == 2) {
                    r10.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
                    frameLayout.setBackground(Theme.createSelectorDrawable(553648127, 2, -1));
                    view2.setBackgroundColor(553648127);
                    color = -328966;
                    obj = obj2;
                } else {
                    color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
                    int i8 = Theme.key_listSelector;
                    r10.setBackground(Theme.createSelectorDrawable(Theme.getColor(i8, resourcesProvider), 1, -1));
                    frameLayout.setBackground(Theme.createSelectorDrawable(Theme.getColor(i8, resourcesProvider), 2, -1));
                    view2.setBackgroundColor(Theme.getColor(Theme.key_divider, resourcesProvider));
                    obj = obj2;
                }
            }
            drawableMutate2.setTint(color);
            drawableMutate.setTint(color);
            animatedVectorDrawable.setTint(color);
            animatedVectorDrawable2.setTint(color);
            textView.setTextColor(color);
            r10.setOnClickListener(new FloatingToolbar$FloatingToolbarPopup$$ExternalSyntheticLambda0(this, 2));
            frameLayout.addView((View) r10, LayoutHelper.createFrame(-2, -2, 19));
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 19, 56.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.addView(view2, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
            r10.measure(0, 0);
            this.mOverflowButtonSize = new Size(r10.getMeasuredWidth(), r10.getMeasuredHeight());
            this.mMainPanel = new RichEditor.AnonymousClass6(this, context, 1);
            this.mOverflowPanelViewHelper = new Metadata(this, context, i);
            final OverflowPanel overflowPanel = new OverflowPanel(this);
            overflowPanel.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            overflowPanel.setDivider(null);
            overflowPanel.setDividerHeight(0);
            ArrayAdapter arrayAdapter = new ArrayAdapter(context) {
                @Override
                public final View getView(int i9, View view3, ViewGroup viewGroup) {
                    FloatingToolbarPopup floatingToolbarPopup = FloatingToolbarPopup.this;
                    Metadata metadata = floatingToolbarPopup.mOverflowPanelViewHelper;
                    MenuItem menuItem = (MenuItem) getItem(i9);
                    int width = floatingToolbarPopup.mOverflowPanelSize.getWidth();
                    if (view3 != null) {
                        int i10 = metadata.gmsVersionCode;
                        FloatingToolbar.updateMenuItemButton(view3, menuItem, FloatingToolbar.this.premiumLockClickListener != null);
                    } else {
                        view3 = FloatingToolbar.access$2600(FloatingToolbar.this, metadata.context, menuItem, true, false, false);
                        int i11 = metadata.iidImplementation;
                        view3.setPadding(i11, 0, i11, 0);
                    }
                    view3.setMinimumWidth(width);
                    return view3;
                }
            };
            overflowPanel.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(2.0f));
            overflowPanel.setClipToPadding(false);
            overflowPanel.setAdapter((ListAdapter) arrayAdapter);
            overflowPanel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public final void onItemClick(AdapterView adapterView, View view3, int i9, long j) {
                    FloatingToolbar.FloatingToolbarPopup floatingToolbarPopup = this.f$0;
                    floatingToolbarPopup.getClass();
                    MenuItem menuItem = (MenuItem) overflowPanel.getAdapter().getItem(i9);
                    FloatingToolbar floatingToolbar = FloatingToolbar.this;
                    if (floatingToolbar.premiumLockClickListener == null || !FloatingToolbar.premiumOptions.contains(Integer.valueOf(menuItem.getItemId()))) {
                        MenuItem.OnMenuItemClickListener onMenuItemClickListener = floatingToolbarPopup.mOnMenuItemClickListener;
                        if (onMenuItemClickListener != null) {
                            onMenuItemClickListener.onMenuItemClick(menuItem);
                            return;
                        }
                        return;
                    }
                    int i10 = -floatingToolbarPopup.shiftDp;
                    floatingToolbarPopup.shiftDp = i10;
                    AndroidUtilities.shakeViewSpring(view3, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    floatingToolbar.premiumLockClickListener.run();
                }
            });
            this.mOverflowPanel = overflowPanel;
            AlertDialogDecor.AnonymousClass2 anonymousClass3 = new AlertDialogDecor.AnonymousClass2(this, 1);
            AnimationSet animationSet = new AnimationSet(true);
            this.mOpenOverflowAnimation = animationSet;
            animationSet.setAnimationListener(anonymousClass3);
            AnimationSet animationSet2 = new AnimationSet(true);
            this.mCloseOverflowAnimation = animationSet2;
            animationSet2.setAnimationListener(anonymousClass3);
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.ALPHA;
            Object obj3 = obj;
            animatorSet.playTogether(ObjectAnimator.ofFloat(obj3, (Property<Object, Float>) property, 0.0f, 1.0f).setDuration(150L));
            this.mShowAnimation = animatorSet;
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this, 0);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(ObjectAnimator.ofFloat(obj3, (Property<Object, Float>) property, 1.0f, 0.0f).setDuration(100L));
            animatorSet2.setStartDelay(150);
            animatorSet2.addListener(anonymousClass4);
            this.mDismissAnimation = animatorSet2;
            AnonymousClass4 anonymousClass5 = new AnonymousClass4(this, 1);
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.playTogether(ObjectAnimator.ofFloat(obj3, (Property<Object, Float>) property, 1.0f, 0.0f).setDuration(100L));
            animatorSet3.setStartDelay(0);
            animatorSet3.addListener(anonymousClass5);
            this.mHideAnimation = animatorSet3;
        }

        public static void access$2100(FloatingToolbarPopup floatingToolbarPopup) {
            if (floatingToolbarPopup.mOpenOverflowUpwards) {
                RelativeLayout relativeLayout = floatingToolbarPopup.mContentContainer;
                floatingToolbarPopup.mMainPanel.setY(relativeLayout.getHeight() - floatingToolbarPopup.mMainPanelSize.getHeight());
                FrameLayout frameLayout = floatingToolbarPopup.mOverflowButton;
                frameLayout.setY(relativeLayout.getHeight() - frameLayout.getHeight());
                floatingToolbarPopup.mOverflowPanel.setY(relativeLayout.getHeight() - floatingToolbarPopup.mOverflowPanelSize.getHeight());
            }
        }

        public static boolean access$2700(FloatingToolbarPopup floatingToolbarPopup) {
            boolean z = floatingToolbarPopup.mOpenOverflowAnimation.hasStarted() && !floatingToolbarPopup.mOpenOverflowAnimation.hasEnded();
            AnimationSet animationSet = floatingToolbarPopup.mCloseOverflowAnimation;
            return z || (animationSet.hasStarted() && !animationSet.hasEnded());
        }

        public static void setSize(int i, int i2, View view) {
            view.setMinimumWidth(i);
            view.setMinimumHeight(i2);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(0, 0);
            }
            layoutParams.width = i;
            layoutParams.height = i2;
            view.setLayoutParams(layoutParams);
        }

        public final int calculateOverflowHeight(int i) {
            int iMax = Math.max(2, i);
            OverflowPanel overflowPanel = this.mOverflowPanel;
            int iMin = Math.min(4, Math.min(iMax, overflowPanel.getCount()));
            int count = overflowPanel.getCount();
            int i2 = this.mLineHeight;
            return this.mOverflowButtonSize.getHeight() + (iMin * i2) + (iMin < count ? (int) (i2 * 0.5f) : 0);
        }

        public final void cancelOverflowAnimations() {
            this.mContentContainer.clearAnimation();
            this.mMainPanel.animate().cancel();
            this.mOverflowPanel.animate().cancel();
            this.mToArrow.stop();
            this.mToOverflow.stop();
        }

        public final int getAdjustedDuration() {
            int i = this.mTransitionDurationScale;
            if (i < 150) {
                return Math.max(200, 0);
            }
            return i > 300 ? 300 : 250;
        }

        public final boolean isShowing() {
            return (this.mDismissed || this.mHidden) ? false : true;
        }

        public final void onBackPressed() {
            boolean z = this.mIsOverflowOpen;
            FrameLayout frameLayout = this.mOverflowButton;
            RelativeLayout relativeLayout = this.mContentContainer;
            Interpolator interpolator = this.mLinearOutSlowInInterpolator;
            RichEditor.AnonymousClass6 anonymousClass6 = this.mMainPanel;
            LogAccelerateInterpolator logAccelerateInterpolator = this.mLogAccelerateInterpolator;
            OverflowPanel overflowPanel = this.mOverflowPanel;
            Interpolator interpolator2 = this.mFastOutSlowInInterpolator;
            AnonymousClass3 anonymousClass3 = this.mOverflowButtonIcon;
            if (z) {
                AnimatedVectorDrawable animatedVectorDrawable = this.mToOverflow;
                anonymousClass3.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                final int width = this.mMainPanelSize.getWidth();
                final int width2 = relativeLayout.getWidth();
                final float width3 = relativeLayout.getWidth() + relativeLayout.getX();
                final int i = 3;
                Animation animation = new Animation(this) {
                    public final FloatingToolbarPopup this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void applyTransformation(float f, Transformation transformation) {
                        switch (i) {
                            case 0:
                                int i2 = width;
                                int i3 = width2;
                                FloatingToolbarPopup floatingToolbarPopup = this.this$1;
                                RelativeLayout relativeLayout2 = floatingToolbarPopup.mContentContainer;
                                FloatingToolbarPopup.setSize(((int) (f * (i2 - i3))) + i3, relativeLayout2.getLayoutParams().height, relativeLayout2);
                                floatingToolbarPopup.getClass();
                                RelativeLayout relativeLayout3 = floatingToolbarPopup.mContentContainer;
                                relativeLayout3.setX(width3 - relativeLayout3.getWidth());
                                floatingToolbarPopup.mMainPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i3);
                                floatingToolbarPopup.mOverflowPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i2);
                                break;
                            case 1:
                                int i4 = width;
                                int i5 = width2;
                                int i6 = (int) (f * (i4 - i5));
                                FloatingToolbarPopup floatingToolbarPopup2 = this.this$1;
                                RelativeLayout relativeLayout4 = floatingToolbarPopup2.mContentContainer;
                                FloatingToolbarPopup.setSize(relativeLayout4.getLayoutParams().width, i5 + i6, relativeLayout4);
                                if (floatingToolbarPopup2.mOpenOverflowUpwards) {
                                    RelativeLayout relativeLayout5 = floatingToolbarPopup2.mContentContainer;
                                    relativeLayout5.setY(width3 - relativeLayout5.getHeight());
                                    FloatingToolbarPopup.access$2100(floatingToolbarPopup2);
                                }
                                break;
                            case 2:
                                int i7 = width;
                                int i8 = width2;
                                int i9 = (int) (f * (i7 - i8));
                                FloatingToolbarPopup floatingToolbarPopup3 = this.this$1;
                                RelativeLayout relativeLayout6 = floatingToolbarPopup3.mContentContainer;
                                FloatingToolbarPopup.setSize(relativeLayout6.getLayoutParams().width, i9 + i8, relativeLayout6);
                                if (floatingToolbarPopup3.mOpenOverflowUpwards) {
                                    RelativeLayout relativeLayout7 = floatingToolbarPopup3.mContentContainer;
                                    relativeLayout7.setY(width3 - (relativeLayout7.getHeight() - i8));
                                    FloatingToolbarPopup.access$2100(floatingToolbarPopup3);
                                }
                                break;
                            default:
                                int i10 = width;
                                int i11 = width2;
                                FloatingToolbarPopup floatingToolbarPopup4 = this.this$1;
                                RelativeLayout relativeLayout8 = floatingToolbarPopup4.mContentContainer;
                                FloatingToolbarPopup.setSize(((int) (f * (i10 - i11))) + i11, relativeLayout8.getLayoutParams().height, relativeLayout8);
                                floatingToolbarPopup4.getClass();
                                RelativeLayout relativeLayout9 = floatingToolbarPopup4.mContentContainer;
                                relativeLayout9.setX(width3 - relativeLayout9.getWidth());
                                floatingToolbarPopup4.mMainPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i10);
                                floatingToolbarPopup4.mOverflowPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i11);
                                break;
                        }
                    }
                };
                final int height = this.mMainPanelSize.getHeight();
                final int height2 = relativeLayout.getHeight();
                final float y = relativeLayout.getY() + relativeLayout.getHeight();
                final int i2 = 1;
                Animation animation2 = new Animation(this) {
                    public final FloatingToolbarPopup this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void applyTransformation(float f, Transformation transformation) {
                        switch (i2) {
                            case 0:
                                int i3 = height;
                                int i4 = height2;
                                FloatingToolbarPopup floatingToolbarPopup = this.this$1;
                                RelativeLayout relativeLayout2 = floatingToolbarPopup.mContentContainer;
                                FloatingToolbarPopup.setSize(((int) (f * (i3 - i4))) + i4, relativeLayout2.getLayoutParams().height, relativeLayout2);
                                floatingToolbarPopup.getClass();
                                RelativeLayout relativeLayout3 = floatingToolbarPopup.mContentContainer;
                                relativeLayout3.setX(y - relativeLayout3.getWidth());
                                floatingToolbarPopup.mMainPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i4);
                                floatingToolbarPopup.mOverflowPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i3);
                                break;
                            case 1:
                                int i5 = height;
                                int i6 = height2;
                                int i7 = (int) (f * (i5 - i6));
                                FloatingToolbarPopup floatingToolbarPopup2 = this.this$1;
                                RelativeLayout relativeLayout4 = floatingToolbarPopup2.mContentContainer;
                                FloatingToolbarPopup.setSize(relativeLayout4.getLayoutParams().width, i6 + i7, relativeLayout4);
                                if (floatingToolbarPopup2.mOpenOverflowUpwards) {
                                    RelativeLayout relativeLayout5 = floatingToolbarPopup2.mContentContainer;
                                    relativeLayout5.setY(y - relativeLayout5.getHeight());
                                    FloatingToolbarPopup.access$2100(floatingToolbarPopup2);
                                }
                                break;
                            case 2:
                                int i8 = height;
                                int i9 = height2;
                                int i10 = (int) (f * (i8 - i9));
                                FloatingToolbarPopup floatingToolbarPopup3 = this.this$1;
                                RelativeLayout relativeLayout6 = floatingToolbarPopup3.mContentContainer;
                                FloatingToolbarPopup.setSize(relativeLayout6.getLayoutParams().width, i10 + i9, relativeLayout6);
                                if (floatingToolbarPopup3.mOpenOverflowUpwards) {
                                    RelativeLayout relativeLayout7 = floatingToolbarPopup3.mContentContainer;
                                    relativeLayout7.setY(y - (relativeLayout7.getHeight() - i9));
                                    FloatingToolbarPopup.access$2100(floatingToolbarPopup3);
                                }
                                break;
                            default:
                                int i11 = height;
                                int i12 = height2;
                                FloatingToolbarPopup floatingToolbarPopup4 = this.this$1;
                                RelativeLayout relativeLayout8 = floatingToolbarPopup4.mContentContainer;
                                FloatingToolbarPopup.setSize(((int) (f * (i11 - i12))) + i12, relativeLayout8.getLayoutParams().height, relativeLayout8);
                                floatingToolbarPopup4.getClass();
                                RelativeLayout relativeLayout9 = floatingToolbarPopup4.mContentContainer;
                                relativeLayout9.setX(y - relativeLayout9.getWidth());
                                floatingToolbarPopup4.mMainPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i11);
                                floatingToolbarPopup4.mOverflowPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i12);
                                break;
                        }
                    }
                };
                final float x = frameLayout.getX();
                final float width4 = (width2 + x) - anonymousClass3.getWidth();
                Animation animation3 = new Animation(this) {
                    public final FloatingToolbarPopup this$1;

                    {
                        this.this$1 = this;
                    }

                    @Override
                    public final void applyTransformation(float f, Transformation transformation) {
                        switch (i2) {
                            case 0:
                                float f2 = x;
                                float fM = DiffUtil.m(width4, f2, f, f2);
                                FloatingToolbarPopup floatingToolbarPopup = this.this$1;
                                floatingToolbarPopup.getClass();
                                floatingToolbarPopup.mOverflowButton.setX(fM + (floatingToolbarPopup.mContentContainer.getWidth() - width2));
                                floatingToolbarPopup.mOverflowButtonText.setAlpha(f);
                                floatingToolbarPopup.mOverflowButtonShadow.setAlpha(f);
                                break;
                            default:
                                float f3 = x;
                                float fM2 = DiffUtil.m(width4, f3, f, f3);
                                FloatingToolbarPopup floatingToolbarPopup2 = this.this$1;
                                floatingToolbarPopup2.getClass();
                                floatingToolbarPopup2.mOverflowButton.setX(fM2 + (floatingToolbarPopup2.mContentContainer.getWidth() - width2));
                                float f4 = 1.0f - f;
                                floatingToolbarPopup2.mOverflowButtonText.setAlpha(f4);
                                floatingToolbarPopup2.mOverflowButtonShadow.setAlpha(f4);
                                break;
                        }
                    }
                };
                animation.setInterpolator(interpolator2);
                animation.setDuration(getAdjustedDuration());
                animation2.setInterpolator(logAccelerateInterpolator);
                animation2.setDuration(getAdjustedDuration());
                animation3.setInterpolator(interpolator2);
                animation3.setDuration(getAdjustedDuration());
                AnimationSet animationSet = this.mCloseOverflowAnimation;
                animationSet.getAnimations().clear();
                animationSet.addAnimation(animation);
                animationSet.addAnimation(animation2);
                animationSet.addAnimation(animation3);
                relativeLayout.startAnimation(animationSet);
                this.mIsOverflowOpen = false;
                updateOverflowButtonClickListener();
                anonymousClass6.animate().alpha(1.0f).withLayer().setInterpolator(this.mFastOutLinearInInterpolator).setDuration(100L).start();
                overflowPanel.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(150L).start();
                return;
            }
            AnimatedVectorDrawable animatedVectorDrawable2 = this.mToArrow;
            anonymousClass3.setImageDrawable(animatedVectorDrawable2);
            animatedVectorDrawable2.start();
            final int width5 = this.mOverflowPanelSize.getWidth();
            final int height3 = this.mOverflowPanelSize.getHeight();
            final int width6 = relativeLayout.getWidth();
            final int height4 = relativeLayout.getHeight();
            final float y2 = relativeLayout.getY();
            final float width7 = relativeLayout.getWidth() + relativeLayout.getX();
            final int i3 = 0;
            Animation animation4 = new Animation(this) {
                public final FloatingToolbarPopup this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void applyTransformation(float f, Transformation transformation) {
                    switch (i3) {
                        case 0:
                            int i4 = width5;
                            int i5 = width6;
                            FloatingToolbarPopup floatingToolbarPopup = this.this$1;
                            RelativeLayout relativeLayout2 = floatingToolbarPopup.mContentContainer;
                            FloatingToolbarPopup.setSize(((int) (f * (i4 - i5))) + i5, relativeLayout2.getLayoutParams().height, relativeLayout2);
                            floatingToolbarPopup.getClass();
                            RelativeLayout relativeLayout3 = floatingToolbarPopup.mContentContainer;
                            relativeLayout3.setX(width7 - relativeLayout3.getWidth());
                            floatingToolbarPopup.mMainPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i5);
                            floatingToolbarPopup.mOverflowPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i4);
                            break;
                        case 1:
                            int i6 = width5;
                            int i7 = width6;
                            int i8 = (int) (f * (i6 - i7));
                            FloatingToolbarPopup floatingToolbarPopup2 = this.this$1;
                            RelativeLayout relativeLayout4 = floatingToolbarPopup2.mContentContainer;
                            FloatingToolbarPopup.setSize(relativeLayout4.getLayoutParams().width, i7 + i8, relativeLayout4);
                            if (floatingToolbarPopup2.mOpenOverflowUpwards) {
                                RelativeLayout relativeLayout5 = floatingToolbarPopup2.mContentContainer;
                                relativeLayout5.setY(width7 - relativeLayout5.getHeight());
                                FloatingToolbarPopup.access$2100(floatingToolbarPopup2);
                            }
                            break;
                        case 2:
                            int i9 = width5;
                            int i10 = width6;
                            int i11 = (int) (f * (i9 - i10));
                            FloatingToolbarPopup floatingToolbarPopup3 = this.this$1;
                            RelativeLayout relativeLayout6 = floatingToolbarPopup3.mContentContainer;
                            FloatingToolbarPopup.setSize(relativeLayout6.getLayoutParams().width, i11 + i10, relativeLayout6);
                            if (floatingToolbarPopup3.mOpenOverflowUpwards) {
                                RelativeLayout relativeLayout7 = floatingToolbarPopup3.mContentContainer;
                                relativeLayout7.setY(width7 - (relativeLayout7.getHeight() - i10));
                                FloatingToolbarPopup.access$2100(floatingToolbarPopup3);
                            }
                            break;
                        default:
                            int i12 = width5;
                            int i13 = width6;
                            FloatingToolbarPopup floatingToolbarPopup4 = this.this$1;
                            RelativeLayout relativeLayout8 = floatingToolbarPopup4.mContentContainer;
                            FloatingToolbarPopup.setSize(((int) (f * (i12 - i13))) + i13, relativeLayout8.getLayoutParams().height, relativeLayout8);
                            floatingToolbarPopup4.getClass();
                            RelativeLayout relativeLayout9 = floatingToolbarPopup4.mContentContainer;
                            relativeLayout9.setX(width7 - relativeLayout9.getWidth());
                            floatingToolbarPopup4.mMainPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i12);
                            floatingToolbarPopup4.mOverflowPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i13);
                            break;
                    }
                }
            };
            final int i4 = 2;
            Animation animation5 = new Animation(this) {
                public final FloatingToolbarPopup this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void applyTransformation(float f, Transformation transformation) {
                    switch (i4) {
                        case 0:
                            int i5 = height3;
                            int i6 = height4;
                            FloatingToolbarPopup floatingToolbarPopup = this.this$1;
                            RelativeLayout relativeLayout2 = floatingToolbarPopup.mContentContainer;
                            FloatingToolbarPopup.setSize(((int) (f * (i5 - i6))) + i6, relativeLayout2.getLayoutParams().height, relativeLayout2);
                            floatingToolbarPopup.getClass();
                            RelativeLayout relativeLayout3 = floatingToolbarPopup.mContentContainer;
                            relativeLayout3.setX(y2 - relativeLayout3.getWidth());
                            floatingToolbarPopup.mMainPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i6);
                            floatingToolbarPopup.mOverflowPanel.setX(floatingToolbarPopup.mContentContainer.getWidth() - i5);
                            break;
                        case 1:
                            int i7 = height3;
                            int i8 = height4;
                            int i9 = (int) (f * (i7 - i8));
                            FloatingToolbarPopup floatingToolbarPopup2 = this.this$1;
                            RelativeLayout relativeLayout4 = floatingToolbarPopup2.mContentContainer;
                            FloatingToolbarPopup.setSize(relativeLayout4.getLayoutParams().width, i8 + i9, relativeLayout4);
                            if (floatingToolbarPopup2.mOpenOverflowUpwards) {
                                RelativeLayout relativeLayout5 = floatingToolbarPopup2.mContentContainer;
                                relativeLayout5.setY(y2 - relativeLayout5.getHeight());
                                FloatingToolbarPopup.access$2100(floatingToolbarPopup2);
                            }
                            break;
                        case 2:
                            int i10 = height3;
                            int i11 = height4;
                            int i12 = (int) (f * (i10 - i11));
                            FloatingToolbarPopup floatingToolbarPopup3 = this.this$1;
                            RelativeLayout relativeLayout6 = floatingToolbarPopup3.mContentContainer;
                            FloatingToolbarPopup.setSize(relativeLayout6.getLayoutParams().width, i12 + i11, relativeLayout6);
                            if (floatingToolbarPopup3.mOpenOverflowUpwards) {
                                RelativeLayout relativeLayout7 = floatingToolbarPopup3.mContentContainer;
                                relativeLayout7.setY(y2 - (relativeLayout7.getHeight() - i11));
                                FloatingToolbarPopup.access$2100(floatingToolbarPopup3);
                            }
                            break;
                        default:
                            int i13 = height3;
                            int i14 = height4;
                            FloatingToolbarPopup floatingToolbarPopup4 = this.this$1;
                            RelativeLayout relativeLayout8 = floatingToolbarPopup4.mContentContainer;
                            FloatingToolbarPopup.setSize(((int) (f * (i13 - i14))) + i14, relativeLayout8.getLayoutParams().height, relativeLayout8);
                            floatingToolbarPopup4.getClass();
                            RelativeLayout relativeLayout9 = floatingToolbarPopup4.mContentContainer;
                            relativeLayout9.setX(y2 - relativeLayout9.getWidth());
                            floatingToolbarPopup4.mMainPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i13);
                            floatingToolbarPopup4.mOverflowPanel.setX(floatingToolbarPopup4.mContentContainer.getWidth() - i14);
                            break;
                    }
                }
            };
            final float x2 = frameLayout.getX();
            final float width8 = anonymousClass3.getWidth() + (x2 - width5);
            final int i5 = 0;
            Animation animation6 = new Animation(this) {
                public final FloatingToolbarPopup this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void applyTransformation(float f, Transformation transformation) {
                    switch (i5) {
                        case 0:
                            float f2 = x2;
                            float fM = DiffUtil.m(width8, f2, f, f2);
                            FloatingToolbarPopup floatingToolbarPopup = this.this$1;
                            floatingToolbarPopup.getClass();
                            floatingToolbarPopup.mOverflowButton.setX(fM + (floatingToolbarPopup.mContentContainer.getWidth() - width6));
                            floatingToolbarPopup.mOverflowButtonText.setAlpha(f);
                            floatingToolbarPopup.mOverflowButtonShadow.setAlpha(f);
                            break;
                        default:
                            float f3 = x2;
                            float fM2 = DiffUtil.m(width8, f3, f, f3);
                            FloatingToolbarPopup floatingToolbarPopup2 = this.this$1;
                            floatingToolbarPopup2.getClass();
                            floatingToolbarPopup2.mOverflowButton.setX(fM2 + (floatingToolbarPopup2.mContentContainer.getWidth() - width6));
                            float f4 = 1.0f - f;
                            floatingToolbarPopup2.mOverflowButtonText.setAlpha(f4);
                            floatingToolbarPopup2.mOverflowButtonShadow.setAlpha(f4);
                            break;
                    }
                }
            };
            animation4.setInterpolator(logAccelerateInterpolator);
            animation4.setDuration(getAdjustedDuration());
            animation5.setInterpolator(interpolator2);
            animation5.setDuration(getAdjustedDuration());
            animation6.setInterpolator(interpolator2);
            animation6.setDuration(getAdjustedDuration());
            AnimationSet animationSet2 = this.mOpenOverflowAnimation;
            animationSet2.getAnimations().clear();
            animationSet2.addAnimation(animation4);
            animationSet2.addAnimation(animation5);
            animationSet2.addAnimation(animation6);
            relativeLayout.startAnimation(animationSet2);
            this.mIsOverflowOpen = true;
            updateOverflowButtonClickListener();
            anonymousClass6.animate().alpha(0.0f).withLayer().setInterpolator(interpolator).setDuration(250L).start();
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.width = overflowPanel.getWidth();
            frameLayout.setLayoutParams(layoutParams);
            overflowPanel.setAlpha(1.0f);
        }

        public final void refreshCoordinatesAndOverflowDirection(Rect rect) {
            View view = this.mParent;
            Rect rect2 = this.mViewPortOnScreen;
            view.getWindowVisibleDisplayFrame(rect2);
            int iCenterX = rect.centerX();
            PopupWindow popupWindow = this.mPopupWindow;
            int iMin = Math.min(iCenterX - (popupWindow.getWidth() / 2), rect2.right - popupWindow.getWidth());
            int i = rect.top;
            int i2 = rect2.top;
            int i3 = i - i2;
            int i4 = rect2.bottom;
            int iMax = rect.bottom;
            int i5 = i4 - iMax;
            int i6 = this.mMarginVertical;
            int i7 = i6 * 2;
            int i8 = this.mLineHeight;
            int i9 = i8 + i7;
            if (this.mOverflowPanelSize != null) {
                int iCalculateOverflowHeight = calculateOverflowHeight(2) + i7;
                int i10 = (rect2.bottom - rect.top) + i9;
                int i11 = (rect.bottom - rect2.top) + i9;
                if (i3 >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i3 - i7);
                    iMax = rect.top - popupWindow.getHeight();
                    this.mOpenOverflowUpwards = true;
                } else if (i3 >= i9 && i10 >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i10 - i7);
                    iMax = rect.top - i9;
                    this.mOpenOverflowUpwards = false;
                } else if (i5 >= iCalculateOverflowHeight) {
                    updateOverflowHeight(i5 - i7);
                    iMax = rect.bottom;
                    this.mOpenOverflowUpwards = false;
                } else if (i5 < i9 || rect2.height() < iCalculateOverflowHeight) {
                    updateOverflowHeight(rect2.height() - i7);
                    iMax = rect2.top;
                    this.mOpenOverflowUpwards = false;
                } else {
                    updateOverflowHeight(i11 - i7);
                    iMax = (rect.bottom + i9) - popupWindow.getHeight();
                    this.mOpenOverflowUpwards = true;
                }
            } else if (i3 >= i9) {
                iMax = i - i9;
            } else if (i5 < i9) {
                iMax = i5 >= i8 ? iMax - i6 : Math.max(i2, i - i9);
            }
            View rootView = view.getRootView();
            int[] iArr = this.mTmpCoords;
            rootView.getLocationOnScreen(iArr);
            int i12 = iArr[0];
            int i13 = iArr[1];
            view.getRootView().getLocationInWindow(iArr);
            this.mCoordsOnWindow.set(Math.max(0, iMin - (i12 - iArr[0])), Math.max(0, iMax - (i13 - iArr[1])));
        }

        public final void setContentAreaAsTouchableSurface() {
            int width;
            int height;
            if (this.mIsOverflowOpen) {
                width = this.mOverflowPanelSize.getWidth();
                height = this.mOverflowPanelSize.getHeight();
            } else {
                width = this.mMainPanelSize.getWidth();
                height = this.mMainPanelSize.getHeight();
            }
            RelativeLayout relativeLayout = this.mContentContainer;
            this.mTouchableRegion.set((int) relativeLayout.getX(), (int) relativeLayout.getY(), ((int) relativeLayout.getX()) + width, ((int) relativeLayout.getY()) + height);
        }

        public final void setPanelsStatesAtRestingPosition() {
            FrameLayout frameLayout = this.mOverflowButton;
            frameLayout.setEnabled(true);
            OverflowPanel overflowPanel = this.mOverflowPanel;
            overflowPanel.awakenScrollBars();
            boolean z = this.mIsOverflowOpen;
            PopupWindow popupWindow = this.mPopupWindow;
            RelativeLayout relativeLayout = this.mContentContainer;
            AnonymousClass3 anonymousClass3 = this.mOverflowButtonIcon;
            int i = this.mMarginHorizontal;
            Size size = this.mOverflowButtonSize;
            int i2 = this.mMarginVertical;
            RichEditor.AnonymousClass6 anonymousClass6 = this.mMainPanel;
            if (z) {
                Size size2 = this.mOverflowPanelSize;
                setSize(size2.getWidth(), size2.getHeight(), relativeLayout);
                anonymousClass6.setAlpha(0.0f);
                anonymousClass6.setVisibility(4);
                overflowPanel.setAlpha(1.0f);
                overflowPanel.setVisibility(0);
                anonymousClass3.setImageDrawable(this.mArrow);
                frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                relativeLayout.setX((popupWindow.getWidth() - size2.getWidth()) - i);
                anonymousClass6.setX(-relativeLayout.getX());
                frameLayout.setX(0.0f);
                overflowPanel.setX(0.0f);
                if (this.mOpenOverflowUpwards) {
                    relativeLayout.setY(i2);
                    anonymousClass6.setY(size2.getHeight() - relativeLayout.getHeight());
                    frameLayout.setY(size2.getHeight() - size.getHeight());
                    overflowPanel.setY(0.0f);
                    return;
                }
                relativeLayout.setY(i2);
                anonymousClass6.setY(0.0f);
                frameLayout.setY(0.0f);
                overflowPanel.setY(size.getHeight());
                return;
            }
            Size size3 = this.mMainPanelSize;
            setSize(size3.getWidth(), size3.getHeight(), relativeLayout);
            anonymousClass6.setAlpha(1.0f);
            anonymousClass6.setVisibility(0);
            overflowPanel.setAlpha(0.0f);
            overflowPanel.setVisibility(4);
            anonymousClass3.setImageDrawable(this.mOverflow);
            frameLayout.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
            if (this.mOverflowPanelSize == null) {
                relativeLayout.setX(i);
                relativeLayout.setY(i2);
                anonymousClass6.setX(0.0f);
                anonymousClass6.setY(0.0f);
                return;
            }
            relativeLayout.setX((popupWindow.getWidth() - size3.getWidth()) - i);
            anonymousClass6.setX(0.0f);
            frameLayout.setX(size3.getWidth() - size.getWidth());
            overflowPanel.setX(size3.getWidth() - this.mOverflowPanelSize.getWidth());
            if (this.mOpenOverflowUpwards) {
                relativeLayout.setY((this.mOverflowPanelSize.getHeight() + i2) - size3.getHeight());
                anonymousClass6.setY(0.0f);
                frameLayout.setY(0.0f);
                overflowPanel.setY(size3.getHeight() - this.mOverflowPanelSize.getHeight());
                return;
            }
            relativeLayout.setY(i2);
            anonymousClass6.setY(0.0f);
            frameLayout.setY(0.0f);
            overflowPanel.setY(size.getHeight());
        }

        public final void updateOverflowButtonClickListener() {
            boolean z = this.mIsOverflowOpen;
            FrameLayout frameLayout = this.mOverflowButton;
            AnonymousClass3 anonymousClass3 = this.mOverflowButtonIcon;
            if (z) {
                frameLayout.setClickable(true);
                frameLayout.setOnClickListener(new FloatingToolbar$FloatingToolbarPopup$$ExternalSyntheticLambda0(this, 0));
                anonymousClass3.setClickable(false);
                anonymousClass3.setOnClickListener(null);
                return;
            }
            frameLayout.setClickable(false);
            frameLayout.setOnClickListener(null);
            anonymousClass3.setClickable(true);
            anonymousClass3.setOnClickListener(new FloatingToolbar$FloatingToolbarPopup$$ExternalSyntheticLambda0(this, 1));
        }

        public final void updateOverflowHeight(int i) {
            if (this.mOverflowPanelSize != null) {
                int iCalculateOverflowHeight = calculateOverflowHeight((i - this.mOverflowButtonSize.getHeight()) / this.mLineHeight);
                if (this.mOverflowPanelSize.getHeight() != iCalculateOverflowHeight) {
                    this.mOverflowPanelSize = new Size(this.mOverflowPanelSize.getWidth(), iCalculateOverflowHeight);
                }
                Size size = this.mOverflowPanelSize;
                setSize(size.getWidth(), size.getHeight(), this.mOverflowPanel);
                boolean z = this.mIsOverflowOpen;
                RelativeLayout relativeLayout = this.mContentContainer;
                if (z) {
                    Size size2 = this.mOverflowPanelSize;
                    setSize(size2.getWidth(), size2.getHeight(), relativeLayout);
                    if (this.mOpenOverflowUpwards) {
                        float height = this.mOverflowPanelSize.getHeight() - iCalculateOverflowHeight;
                        relativeLayout.setY(relativeLayout.getY() + height);
                        FrameLayout frameLayout = this.mOverflowButton;
                        frameLayout.setY(frameLayout.getY() - height);
                    }
                } else {
                    Size size3 = this.mMainPanelSize;
                    setSize(size3.getWidth(), size3.getHeight(), relativeLayout);
                }
                updatePopupSize();
            }
        }

        public final void updatePopupSize() {
            int iMax;
            Size size = this.mMainPanelSize;
            int iMax2 = 0;
            if (size != null) {
                iMax = Math.max(0, size.getWidth());
                iMax2 = Math.max(0, this.mMainPanelSize.getHeight());
            } else {
                iMax = 0;
            }
            Size size2 = this.mOverflowPanelSize;
            if (size2 != null) {
                iMax = Math.max(iMax, size2.getWidth());
                iMax2 = Math.max(iMax2, this.mOverflowPanelSize.getHeight());
            }
            int i = (this.mMarginHorizontal * 2) + iMax;
            PopupWindow popupWindow = this.mPopupWindow;
            popupWindow.setWidth(i);
            popupWindow.setHeight((this.mMarginVertical * 2) + iMax2);
            Size size3 = this.mMainPanelSize;
            if (size3 == null || this.mOverflowPanelSize == null) {
                return;
            }
            int width = size3.getWidth() - this.mOverflowPanelSize.getWidth();
            int height = this.mOverflowPanelSize.getHeight() - this.mMainPanelSize.getHeight();
            this.mTransitionDurationScale = (int) (Math.sqrt((height * height) + (width * width)) / ((double) this.mContentContainer.getContext().getResources().getDisplayMetrics().density));
        }
    }

    public interface StyleDelegate {
        void addStyle(int i, int i2, int i3);

        int getCurrentStyle(int i, int i2);

        void removeStyle(int i, int i2, int i3);
    }

    static {
        Integer numValueOf = Integer.valueOf(R.id.menu_regular);
        int i = R.id.menu_bold;
        Integer numValueOf2 = Integer.valueOf(i);
        int i2 = R.id.menu_italic;
        Integer numValueOf3 = Integer.valueOf(i2);
        int i3 = R.id.menu_strike;
        Integer numValueOf4 = Integer.valueOf(i3);
        int i4 = R.id.menu_mono;
        Integer numValueOf5 = Integer.valueOf(i4);
        int i5 = R.id.menu_underline;
        Integer numValueOf6 = Integer.valueOf(i5);
        int i6 = R.id.menu_spoiler;
        Integer numValueOf7 = Integer.valueOf(i6);
        int i7 = R.id.menu_link;
        Integer numValueOf8 = Integer.valueOf(i7);
        int i8 = R.id.menu_quote;
        Arrays.asList(numValueOf, numValueOf2, numValueOf3, numValueOf4, numValueOf5, numValueOf6, numValueOf7, numValueOf8, Integer.valueOf(i8), Integer.valueOf(R.id.menu_date));
        premiumOptions = Arrays.asList(Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i7), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i8));
    }

    public FloatingToolbar(Context context, View view, int i, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        this.mWindowView = view;
        this.currentStyle = i;
        this.blurredBackgroundDrawableViewFactory = blurredBackgroundDrawableViewFactory;
        this.resourcesProvider = resourcesProvider;
        this.mPopup = new FloatingToolbarPopup(context, view);
    }

    public static LinearLayout access$2600(FloatingToolbar floatingToolbar, Context context, MenuItem menuItem, boolean z, boolean z2, boolean z3) {
        int color;
        floatingToolbar.getClass();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        linearLayout.setOrientation(0);
        linearLayout.setMinimumWidth(AndroidUtilities.dp(48.0f));
        linearLayout.setMinimumHeight(AndroidUtilities.dp(z ? 42.0f : 48.0f));
        linearLayout.setPaddingRelative(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        TextView textView = new TextView(context);
        textView.setGravity(17);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setFocusable(false);
        textView.setImportantForAccessibility(2);
        textView.setFocusableInTouchMode(false);
        int i = Theme.key_listSelector;
        Theme.ResourcesProvider resourcesProvider = floatingToolbar.resourcesProvider;
        int color2 = Theme.getColor(i, resourcesProvider);
        int i2 = floatingToolbar.currentStyle;
        if (i2 == 0) {
            color = Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider);
            textView.setTextColor(color);
        } else if (i2 == 2) {
            color = -328966;
            textView.setTextColor(-328966);
            color2 = 553648127;
        } else if (i2 == 1) {
            color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
            textView.setTextColor(color);
        } else {
            color = Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider);
        }
        if (z2 || z3) {
            linearLayout.setBackground(Theme.createRadSelectorDrawable(color2, z2 ? 12 : 0, z3 ? 12 : 0, z3 ? 12 : 0, z2 ? 12 : 0));
        } else {
            linearLayout.setBackground(Theme.createSelectorDrawable(color2, 2, -1));
        }
        textView.setPaddingRelative(AndroidUtilities.dp(11.0f), 0, 0, 0);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, AndroidUtilities.dp(z ? 42.0f : 48.0f)));
        linearLayout.addView(new Space(context), new LinearLayout.LayoutParams(-1, 1, 1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.msg_mini_lock3);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.multAlpha(0.4f, color), PorterDuff.Mode.SRC_IN));
        imageView.setVisibility(8);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-2, -1, 0.0f, 0, 12, 0, 0, 0));
        if (menuItem != null) {
            updateMenuItemButton(linearLayout, menuItem, floatingToolbar.premiumLockClickListener != null);
        }
        return linearLayout;
    }

    public static void updateMenuItemButton(View view, MenuItem menuItem, boolean z) {
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) view;
        TextView textView = (TextView) viewGroup.getChildAt(0);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(menuItem.getTitle())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(menuItem.getTitle());
        }
        textView.setPaddingRelative(0, 0, 0, 0);
        if (z) {
            if (premiumOptions.contains(Integer.valueOf(menuItem.getItemId()))) {
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        viewGroup.getChildAt(2).setVisibility(z2 ? 0 : 8);
    }

    public final void dismiss() {
        this.mWindowView.removeOnLayoutChangeListener(this.mOrientationChangeHandler);
        FloatingToolbarPopup floatingToolbarPopup = this.mPopup;
        if (floatingToolbarPopup.mDismissed) {
            return;
        }
        floatingToolbarPopup.mHidden = false;
        floatingToolbarPopup.mDismissed = true;
        floatingToolbarPopup.mHideAnimation.cancel();
        floatingToolbarPopup.mDismissAnimation.start();
        floatingToolbarPopup.mTouchableRegion.setEmpty();
    }

    public final void doShow() {
        RichEditor.AnonymousClass6 anonymousClass6;
        FloatingToolbarPopup.OverflowPanel overflowPanel;
        int iMin;
        LinkedList linkedList;
        Iterator it;
        int i;
        boolean z;
        boolean zHasNext;
        List list;
        FloatingToolbar floatingToolbar;
        Size size;
        List list2;
        FloatingToolbar floatingToolbar2;
        Size size2;
        int i2;
        ArrayAdapter arrayAdapter;
        FloatingToolbar floatingToolbar3;
        int size3;
        boolean zPremiumFeaturesBlocked;
        int i3;
        int count;
        int i4;
        int iMax;
        Metadata metadata;
        boolean z2;
        MenuItem menuItem;
        List list3;
        boolean z3;
        MenuItem menuItem2;
        boolean zHasNext2;
        int i5;
        double d;
        int iMin2;
        boolean z4;
        boolean z5;
        ArrayList visibleAndEnabledMenuItems = getVisibleAndEnabledMenuItems(this.mMenu);
        Collections.sort(visibleAndEnabledMenuItems, this.mMenuItemComparator);
        ArrayList arrayList = this.mShowingMenuItems;
        FloatingToolbarPopup floatingToolbarPopup = this.mPopup;
        if (arrayList == null || visibleAndEnabledMenuItems.size() != this.mShowingMenuItems.size()) {
            if (!floatingToolbarPopup.mDismissed) {
                floatingToolbarPopup.mHidden = false;
                floatingToolbarPopup.mDismissed = true;
                floatingToolbarPopup.mHideAnimation.cancel();
                floatingToolbarPopup.mDismissAnimation.start();
                floatingToolbarPopup.mTouchableRegion.setEmpty();
            }
            floatingToolbarPopup.mOnMenuItemClickListener = this.mMenuItemClickListener;
            floatingToolbarPopup.cancelOverflowAnimations();
            floatingToolbarPopup.mOverflowPanelSize = null;
            floatingToolbarPopup.mMainPanelSize = null;
            floatingToolbarPopup.mIsOverflowOpen = false;
            floatingToolbarPopup.updateOverflowButtonClickListener();
            anonymousClass6 = floatingToolbarPopup.mMainPanel;
            anonymousClass6.removeAllViews();
            anonymousClass6.setPaddingRelative(0, 0, 0, 0);
            overflowPanel = floatingToolbarPopup.mOverflowPanel;
            ArrayAdapter arrayAdapter2 = (ArrayAdapter) overflowPanel.getAdapter();
            arrayAdapter2.clear();
            overflowPanel.setAdapter((ListAdapter) arrayAdapter2);
            floatingToolbarPopup.mContentContainer.removeAllViews();
            View view = floatingToolbarPopup.mParent;
            Rect rect = floatingToolbarPopup.mViewPortOnScreen;
            view.getWindowVisibleDisplayFrame(rect);
            iMin = Math.min(AndroidUtilities.dp(400.0f), OKLCH.m$3(16.0f, 2, rect.width()));
            linkedList = new LinkedList(visibleAndEnabledMenuItems);
            it = linkedList.iterator();
            i = iMin;
            z = true;
            while (true) {
                zHasNext = it.hasNext();
                list = premiumOptions;
                floatingToolbar = FloatingToolbar.this;
                size = floatingToolbarPopup.mOverflowButtonSize;
                if (zHasNext) {
                    list2 = list;
                    floatingToolbar2 = floatingToolbar;
                    size2 = size;
                    break;
                }
                menuItem2 = (MenuItem) it.next();
                zHasNext2 = it.hasNext();
                size2 = size;
                boolean z6 = !zHasNext2;
                if (menuItem2 != null || floatingToolbar.premiumLockClickListener == null || !list.contains(Integer.valueOf(menuItem2.getItemId()))) {
                    i5 = i;
                    list2 = list;
                    floatingToolbar2 = floatingToolbar;
                    LinearLayout linearLayoutAccess$2600 = access$2600(FloatingToolbar.this, floatingToolbarPopup.mContext, menuItem2, false, z, z6);
                    linearLayoutAccess$2600.setGravity(17);
                    if (z) {
                        d = 1.5d;
                    } else {
                        d = 1.0d;
                    }
                    linearLayoutAccess$2600.setPaddingRelative((int) (d * ((double) linearLayoutAccess$2600.getPaddingStart())), linearLayoutAccess$2600.getPaddingTop(), (int) (((double) linearLayoutAccess$2600.getPaddingEnd()) * (zHasNext2 ? 1.0d : 1.5d)), linearLayoutAccess$2600.getPaddingBottom());
                    linearLayoutAccess$2600.measure(0, 0);
                    iMin2 = Math.min(linearLayoutAccess$2600.getMeasuredWidth(), iMin);
                    if (iMin2 <= i5 - size2.getWidth()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!zHasNext2 || iMin2 > i5) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z4 && !z5) {
                        break;
                    }
                    linearLayoutAccess$2600.setTag(menuItem2);
                    linearLayoutAccess$2600.setOnClickListener(floatingToolbarPopup.mMenuItemButtonOnClickListener);
                    anonymousClass6.addView(linearLayoutAccess$2600);
                    ViewGroup.LayoutParams layoutParams = linearLayoutAccess$2600.getLayoutParams();
                    layoutParams.width = iMin2;
                    linearLayoutAccess$2600.setLayoutParams(layoutParams);
                    i = i5 - iMin2;
                    it.remove();
                    z = false;
                }
            }
            if (linkedList.isEmpty()) {
                i2 = 0;
            } else {
                i2 = 0;
                anonymousClass6.setPaddingRelative(0, 0, size2.getWidth(), 0);
            }
            anonymousClass6.measure(i2, i2);
            floatingToolbarPopup.mMainPanelSize = new Size(anonymousClass6.getMeasuredWidth(), anonymousClass6.getMeasuredHeight());
            if (!linkedList.isEmpty()) {
                arrayAdapter = (ArrayAdapter) overflowPanel.getAdapter();
                arrayAdapter.clear();
                floatingToolbar3 = floatingToolbar2;
                if (floatingToolbar3.premiumLockClickListener != null) {
                    Collections.sort(linkedList, new Theme$$ExternalSyntheticLambda5(24));
                }
                size3 = linkedList.size();
                zPremiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
                i3 = 0;
                while (i3 < size3) {
                    menuItem = (MenuItem) linkedList.get(i3);
                    if (floatingToolbar3.premiumLockClickListener == null) {
                        list3 = list2;
                    } else {
                        list3 = list2;
                        z3 = list3.contains(Integer.valueOf(menuItem.getItemId())) ? !zPremiumFeaturesBlocked : true;
                        if (z3) {
                            arrayAdapter.add(menuItem);
                        }
                        i3++;
                        list2 = list3;
                    }
                    if (z3) {
                        arrayAdapter.add(menuItem);
                    }
                    i3++;
                    list2 = list3;
                }
                overflowPanel.setAdapter((ListAdapter) arrayAdapter);
                if (floatingToolbarPopup.mOpenOverflowUpwards) {
                    overflowPanel.setY(0.0f);
                } else {
                    overflowPanel.setY(size2.getHeight());
                }
                count = overflowPanel.getAdapter().getCount();
                iMax = 0;
                for (i4 = 0; i4 < count; i4++) {
                    MenuItem menuItem3 = (MenuItem) overflowPanel.getAdapter().getItem(i4);
                    metadata = floatingToolbarPopup.mOverflowPanelViewHelper;
                    LinearLayout linearLayout = (LinearLayout) metadata.appVersionCode;
                    if (FloatingToolbar.this.premiumLockClickListener != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    updateMenuItemButton(linearLayout, menuItem3, z2);
                    LinearLayout linearLayout2 = (LinearLayout) metadata.appVersionCode;
                    linearLayout2.measure(0, 0);
                    iMax = Math.max(linearLayout2.getMeasuredWidth(), iMax);
                }
                Size size4 = new Size(Math.max(iMax, size2.getWidth()), floatingToolbarPopup.calculateOverflowHeight(4));
                floatingToolbarPopup.mOverflowPanelSize = size4;
                FloatingToolbarPopup.setSize(size4.getWidth(), size4.getHeight(), overflowPanel);
            }
            floatingToolbarPopup.updatePopupSize();
            this.mShowingMenuItems = visibleAndEnabledMenuItems;
        } else {
            int size5 = visibleAndEnabledMenuItems.size();
            int i6 = 0;
            while (true) {
                if (i6 < size5) {
                    MenuItem menuItem4 = (MenuItem) visibleAndEnabledMenuItems.get(i6);
                    MenuItem menuItem5 = (MenuItem) this.mShowingMenuItems.get(i6);
                    if (menuItem4.getItemId() == menuItem5.getItemId() && TextUtils.equals(menuItem4.getTitle(), menuItem5.getTitle()) && Objects.equals(menuItem4.getIcon(), menuItem5.getIcon()) && menuItem4.getGroupId() == menuItem5.getGroupId()) {
                        i6++;
                    }
                } else if (this.mWidthChanged) {
                }
                if (!floatingToolbarPopup.mDismissed) {
                    floatingToolbarPopup.mHidden = false;
                    floatingToolbarPopup.mDismissed = true;
                    floatingToolbarPopup.mHideAnimation.cancel();
                    floatingToolbarPopup.mDismissAnimation.start();
                    floatingToolbarPopup.mTouchableRegion.setEmpty();
                }
                floatingToolbarPopup.mOnMenuItemClickListener = this.mMenuItemClickListener;
                floatingToolbarPopup.cancelOverflowAnimations();
                floatingToolbarPopup.mOverflowPanelSize = null;
                floatingToolbarPopup.mMainPanelSize = null;
                floatingToolbarPopup.mIsOverflowOpen = false;
                floatingToolbarPopup.updateOverflowButtonClickListener();
                anonymousClass6 = floatingToolbarPopup.mMainPanel;
                anonymousClass6.removeAllViews();
                anonymousClass6.setPaddingRelative(0, 0, 0, 0);
                overflowPanel = floatingToolbarPopup.mOverflowPanel;
                ArrayAdapter arrayAdapter3 = (ArrayAdapter) overflowPanel.getAdapter();
                arrayAdapter3.clear();
                overflowPanel.setAdapter((ListAdapter) arrayAdapter3);
                floatingToolbarPopup.mContentContainer.removeAllViews();
                View view2 = floatingToolbarPopup.mParent;
                Rect rect2 = floatingToolbarPopup.mViewPortOnScreen;
                view2.getWindowVisibleDisplayFrame(rect2);
                iMin = Math.min(AndroidUtilities.dp(400.0f), OKLCH.m$3(16.0f, 2, rect2.width()));
                linkedList = new LinkedList(visibleAndEnabledMenuItems);
                it = linkedList.iterator();
                i = iMin;
                z = true;
                while (true) {
                    zHasNext = it.hasNext();
                    list = premiumOptions;
                    floatingToolbar = FloatingToolbar.this;
                    size = floatingToolbarPopup.mOverflowButtonSize;
                    if (zHasNext) {
                        list2 = list;
                        floatingToolbar2 = floatingToolbar;
                        size2 = size;
                        break;
                    }
                    menuItem2 = (MenuItem) it.next();
                    zHasNext2 = it.hasNext();
                    size2 = size;
                    boolean z7 = !zHasNext2;
                    if (menuItem2 != null) {
                    }
                    i5 = i;
                    list2 = list;
                    floatingToolbar2 = floatingToolbar;
                    LinearLayout linearLayoutAccess$2601 = access$2600(FloatingToolbar.this, floatingToolbarPopup.mContext, menuItem2, false, z, z7);
                    linearLayoutAccess$2601.setGravity(17);
                    if (z) {
                        d = 1.5d;
                    } else {
                        d = 1.0d;
                    }
                    linearLayoutAccess$2601.setPaddingRelative((int) (d * ((double) linearLayoutAccess$2601.getPaddingStart())), linearLayoutAccess$2601.getPaddingTop(), (int) (((double) linearLayoutAccess$2601.getPaddingEnd()) * (zHasNext2 ? 1.0d : 1.5d)), linearLayoutAccess$2601.getPaddingBottom());
                    linearLayoutAccess$2601.measure(0, 0);
                    iMin2 = Math.min(linearLayoutAccess$2601.getMeasuredWidth(), iMin);
                    if (iMin2 <= i5 - size2.getWidth()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (zHasNext2) {
                        z5 = false;
                    } else {
                        z5 = false;
                    }
                    if (z4) {
                    }
                    linearLayoutAccess$2601.setTag(menuItem2);
                    linearLayoutAccess$2601.setOnClickListener(floatingToolbarPopup.mMenuItemButtonOnClickListener);
                    anonymousClass6.addView(linearLayoutAccess$2601);
                    ViewGroup.LayoutParams layoutParams2 = linearLayoutAccess$2601.getLayoutParams();
                    layoutParams2.width = iMin2;
                    linearLayoutAccess$2601.setLayoutParams(layoutParams2);
                    i = i5 - iMin2;
                    it.remove();
                    z = false;
                }
                if (linkedList.isEmpty()) {
                    i2 = 0;
                    anonymousClass6.setPaddingRelative(0, 0, size2.getWidth(), 0);
                } else {
                    i2 = 0;
                }
                anonymousClass6.measure(i2, i2);
                floatingToolbarPopup.mMainPanelSize = new Size(anonymousClass6.getMeasuredWidth(), anonymousClass6.getMeasuredHeight());
                if (!linkedList.isEmpty()) {
                    arrayAdapter = (ArrayAdapter) overflowPanel.getAdapter();
                    arrayAdapter.clear();
                    floatingToolbar3 = floatingToolbar2;
                    if (floatingToolbar3.premiumLockClickListener != null) {
                        Collections.sort(linkedList, new Theme$$ExternalSyntheticLambda5(24));
                    }
                    size3 = linkedList.size();
                    zPremiumFeaturesBlocked = MessagesController.getInstance(UserConfig.selectedAccount).premiumFeaturesBlocked();
                    i3 = 0;
                    while (i3 < size3) {
                        menuItem = (MenuItem) linkedList.get(i3);
                        if (floatingToolbar3.premiumLockClickListener == null) {
                            list3 = list2;
                        } else {
                            list3 = list2;
                            if (list3.contains(Integer.valueOf(menuItem.getItemId()))) {
                            }
                            if (z3) {
                                arrayAdapter.add(menuItem);
                            }
                            i3++;
                            list2 = list3;
                        }
                        if (z3) {
                            arrayAdapter.add(menuItem);
                        }
                        i3++;
                        list2 = list3;
                    }
                    overflowPanel.setAdapter((ListAdapter) arrayAdapter);
                    if (floatingToolbarPopup.mOpenOverflowUpwards) {
                        overflowPanel.setY(0.0f);
                    } else {
                        overflowPanel.setY(size2.getHeight());
                    }
                    count = overflowPanel.getAdapter().getCount();
                    iMax = 0;
                    while (i4 < count) {
                        MenuItem menuItem6 = (MenuItem) overflowPanel.getAdapter().getItem(i4);
                        metadata = floatingToolbarPopup.mOverflowPanelViewHelper;
                        LinearLayout linearLayout3 = (LinearLayout) metadata.appVersionCode;
                        if (FloatingToolbar.this.premiumLockClickListener != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        updateMenuItemButton(linearLayout3, menuItem6, z2);
                        LinearLayout linearLayout4 = (LinearLayout) metadata.appVersionCode;
                        linearLayout4.measure(0, 0);
                        iMax = Math.max(linearLayout4.getMeasuredWidth(), iMax);
                    }
                    Size size6 = new Size(Math.max(iMax, size2.getWidth()), floatingToolbarPopup.calculateOverflowHeight(4));
                    floatingToolbarPopup.mOverflowPanelSize = size6;
                    FloatingToolbarPopup.setSize(size6.getWidth(), size6.getHeight(), overflowPanel);
                }
                floatingToolbarPopup.updatePopupSize();
                this.mShowingMenuItems = visibleAndEnabledMenuItems;
            }
        }
        boolean zIsShowing = floatingToolbarPopup.isShowing();
        Point point = floatingToolbarPopup.mCoordsOnWindow;
        PopupWindow popupWindow = floatingToolbarPopup.mPopupWindow;
        FrameLayout frameLayout = floatingToolbarPopup.mOverflowButton;
        RichEditor.AnonymousClass6 anonymousClass7 = floatingToolbarPopup.mMainPanel;
        FloatingToolbarPopup.OverflowPanel overflowPanel2 = floatingToolbarPopup.mOverflowPanel;
        RelativeLayout relativeLayout = floatingToolbarPopup.mContentContainer;
        Rect rect3 = this.mPreviousContentRect;
        Rect rect4 = this.mContentRect;
        if (zIsShowing) {
            if (!rect3.equals(rect4) && floatingToolbarPopup.isShowing() && popupWindow.isShowing()) {
                floatingToolbarPopup.cancelOverflowAnimations();
                floatingToolbarPopup.refreshCoordinatesAndOverflowDirection(rect4);
                relativeLayout.removeAllViews();
                if (floatingToolbarPopup.mOverflowPanelSize != null) {
                    relativeLayout.addView(overflowPanel2);
                }
                relativeLayout.addView(anonymousClass7);
                if (floatingToolbarPopup.mOverflowPanelSize != null) {
                    relativeLayout.addView(frameLayout);
                }
                floatingToolbarPopup.setPanelsStatesAtRestingPosition();
                floatingToolbarPopup.setContentAreaAsTouchableSurface();
                popupWindow.update(point.x, point.y, popupWindow.getWidth(), popupWindow.getHeight());
            }
        } else if (!floatingToolbarPopup.isShowing()) {
            floatingToolbarPopup.mHidden = false;
            floatingToolbarPopup.mDismissed = false;
            floatingToolbarPopup.mDismissAnimation.cancel();
            floatingToolbarPopup.mHideAnimation.cancel();
            floatingToolbarPopup.cancelOverflowAnimations();
            floatingToolbarPopup.refreshCoordinatesAndOverflowDirection(rect4);
            relativeLayout.removeAllViews();
            if (floatingToolbarPopup.mOverflowPanelSize != null) {
                relativeLayout.addView(overflowPanel2);
            }
            relativeLayout.addView(anonymousClass7);
            if (floatingToolbarPopup.mOverflowPanelSize != null) {
                relativeLayout.addView(frameLayout);
            }
            floatingToolbarPopup.setPanelsStatesAtRestingPosition();
            floatingToolbarPopup.setContentAreaAsTouchableSurface();
            popupWindow.showAtLocation(floatingToolbarPopup.mParent, 0, point.x, point.y);
            floatingToolbarPopup.mShowAnimation.start();
        }
        this.mWidthChanged = false;
        rect3.set(rect4);
    }

    public final ArrayList getVisibleAndEnabledMenuItems(Menu menu) {
        ImageUpdater$$ExternalSyntheticLambda3 imageUpdater$$ExternalSyntheticLambda3;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; menu != null && i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            if (item.isVisible() && item.isEnabled()) {
                SubMenu subMenu = item.getSubMenu();
                if (subMenu != null) {
                    arrayList.addAll(getVisibleAndEnabledMenuItems(subMenu));
                } else if ((item.getItemId() != R.id.menu_quote || (imageUpdater$$ExternalSyntheticLambda3 = this.quoteShowCallback) == null || ((Boolean) imageUpdater$$ExternalSyntheticLambda3.run()).booleanValue()) && item.getItemId() != 16908353 && item.getItemId() != 16909808 && (item.getItemId() != R.id.menu_regular || this.premiumLockClickListener == null)) {
                    arrayList.add(item);
                }
            }
        }
        return arrayList;
    }

    public final class AnonymousClass2 extends LinearLayout {
        public final int $r8$classId;
        public Object downRootView;
        public final Object p;

        public AnonymousClass2(Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 2:
                    super(context);
                    this.p = new Path();
                    Paint paint = new Paint(1);
                    this.downRootView = paint;
                    paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    paint.setShadowLayer(AndroidUtilities.dp(1.33f), 0.0f, AndroidUtilities.dp(0.33f), 503316480);
                    break;
                default:
                    this.p = new int[2];
                    this.downRootView = null;
                    break;
            }
        }

        public static boolean isParent(View view, View view2) {
            if (view == view2) {
                return true;
            }
            if (view.getParent() == null) {
                return false;
            }
            if (view.getParent() instanceof View) {
                return isParent((View) view.getParent(), view2);
            }
            return view.getParent() == view2 || view.getRootView() == view2;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 4:
                    RectF rectF = (RectF) this.p;
                    rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                    float x = getX();
                    float y = getY();
                    VoIPBackgroundProvider voIPBackgroundProvider = (VoIPBackgroundProvider) this.downRootView;
                    voIPBackgroundProvider.setDarkTranslation(x, y);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(20.0f), voIPBackgroundProvider.getDarkPaint());
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (!zDispatchTouchEvent) {
                        int[] iArr = (int[]) this.p;
                        getLocationOnScreen(iArr);
                        motionEvent.offsetLocation(iArr[0], iArr[1]);
                        if (motionEvent.getAction() == 0) {
                            List<View> listAllGlobalViews = AndroidUtilities.allGlobalViews();
                            if (listAllGlobalViews != null && listAllGlobalViews.size() > 1) {
                                for (int size = listAllGlobalViews.size() - 2; size >= 0; size--) {
                                    View view = listAllGlobalViews.get(size);
                                    if (!isParent(this, view)) {
                                        view.getLocationOnScreen(iArr);
                                        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                        zDispatchTouchEvent = view.dispatchTouchEvent(motionEvent);
                                        if (zDispatchTouchEvent) {
                                            this.downRootView = view;
                                            return true;
                                        }
                                        motionEvent.offsetLocation(iArr[0], iArr[1]);
                                    }
                                }
                            }
                        } else {
                            View view2 = (View) this.downRootView;
                            if (view2 != null) {
                                view2.getLocationOnScreen(iArr);
                                motionEvent.offsetLocation(-iArr[0], -iArr[1]);
                                zDispatchTouchEvent = view2.dispatchTouchEvent(motionEvent);
                            }
                        }
                    }
                    if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.downRootView = null;
                    }
                    return zDispatchTouchEvent;
                default:
                    return super.dispatchTouchEvent(motionEvent);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 2:
                    canvas.drawPath((Path) this.p, (Paint) this.downRootView);
                    super.onDraw(canvas);
                    break;
                case 3:
                    super.onDraw(canvas);
                    LPhotoPaintView lPhotoPaintView = (LPhotoPaintView) this.downRootView;
                    TextView textView = (TextView) getChildAt(lPhotoPaintView.tabsSelectedIndex);
                    TextView textView2 = lPhotoPaintView.tabsNewSelectedIndex != -1 ? (TextView) getChildAt(lPhotoPaintView.tabsNewSelectedIndex) : null;
                    Paint paint = (Paint) this.p;
                    paint.setColor(textView.getCurrentTextColor());
                    float y = ((textView.getY() + textView.getHeight()) - textView.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                    Layout layout = textView.getLayout();
                    Layout layout2 = textView2 != null ? textView2.getLayout() : null;
                    float interpolation = layout2 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(lPhotoPaintView.tabsSelectionProgress);
                    float fLerp = AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineStart(0)) + textView.getX(), textView2 != null ? layout2.getPrimaryHorizontal(layout.getLineStart(0)) + textView2.getX() : 0.0f, interpolation);
                    canvas.drawLine(fLerp, y, AndroidUtilities.lerp(layout.getPrimaryHorizontal(layout.getLineEnd(0)) - layout.getPrimaryHorizontal(layout.getLineStart(0)), layout2 != null ? layout2.getPrimaryHorizontal(layout2.getLineEnd(0)) - layout2.getPrimaryHorizontal(layout2.getLineStart(0)) : 0.0f, interpolation) + fLerp, y, paint);
                    break;
                case 4:
                default:
                    super.onDraw(canvas);
                    break;
                case 5:
                    super.onDraw(canvas);
                    PaintView paintView = (PaintView) this.downRootView;
                    TextView textView3 = (TextView) getChildAt(paintView.tabsSelectedIndex);
                    int i = paintView.tabsNewSelectedIndex;
                    TextView textView4 = i != -1 ? (TextView) getChildAt(i) : null;
                    Paint paint2 = (Paint) this.p;
                    paint2.setColor(textView3.getCurrentTextColor());
                    float y2 = ((textView3.getY() + textView3.getHeight()) - textView3.getPaddingBottom()) + AndroidUtilities.dp(3.0f);
                    Layout layout3 = textView3.getLayout();
                    if (layout3 != null) {
                        Layout layout4 = textView4 != null ? textView4.getLayout() : null;
                        float interpolation2 = layout4 == null ? 0.0f : CubicBezierInterpolator.DEFAULT.getInterpolation(paintView.tabsSelectionProgress);
                        float fLerp2 = AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineStart(0)) + textView3.getX(), layout4 != null ? layout4.getPrimaryHorizontal(layout3.getLineStart(0)) + textView4.getX() : 0.0f, interpolation2);
                        canvas.drawLine(fLerp2, y2, AndroidUtilities.lerp(layout3.getPrimaryHorizontal(layout3.getLineEnd(0)) - layout3.getPrimaryHorizontal(layout3.getLineStart(0)), layout4 != null ? layout4.getPrimaryHorizontal(layout4.getLineEnd(0)) - layout4.getPrimaryHorizontal(layout4.getLineStart(0)) : 0.0f, interpolation2) + fLerp2, y2, paint2);
                        break;
                    }
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    ActionBarMenuItem actionBarMenuItem = (ActionBarMenuItem) this.p;
                    actionBarMenuItem.popupLayout.measure(i, i2);
                    PopupSwipeBackLayout swipeBack = actionBarMenuItem.popupLayout.getSwipeBack();
                    View view = (View) this.downRootView;
                    if (swipeBack != null) {
                        view.getLayoutParams().width = actionBarMenuItem.popupLayout.getSwipeBack().getChildAt(0).getMeasuredWidth();
                    } else {
                        view.getLayoutParams().width = actionBarMenuItem.popupLayout.getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                    }
                    super.onMeasure(i, i2);
                    break;
                case 2:
                    super.onMeasure(i, i2);
                    Path path = (Path) this.p;
                    path.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), getMeasuredWidth() - AndroidUtilities.dp(12.0f), getMeasuredHeight() - AndroidUtilities.dp(12.0f));
                    path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        public AnonymousClass2(Context context, VoIPBackgroundProvider voIPBackgroundProvider) {
            super(context);
            this.$r8$classId = 4;
            this.p = new RectF();
            this.downRootView = voIPBackgroundProvider;
            voIPBackgroundProvider.views.add(this);
        }

        public AnonymousClass2(ActionBarMenuItem actionBarMenuItem, Context context, View view) {
            super(context);
            this.$r8$classId = 1;
            this.p = actionBarMenuItem;
            this.downRootView = view;
        }

        public AnonymousClass2(LPhotoPaintView lPhotoPaintView, Context context) {
            super(context);
            this.$r8$classId = 3;
            this.downRootView = lPhotoPaintView;
            Paint paint = new Paint(1);
            this.p = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            setWillNotDraw(false);
        }

        public AnonymousClass2(PaintView paintView, Context context) {
            super(context);
            this.$r8$classId = 5;
            this.downRootView = paintView;
            Paint paint = new Paint(1);
            this.p = paint;
            paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.ROUND);
            setWillNotDraw(false);
        }
    }
}
