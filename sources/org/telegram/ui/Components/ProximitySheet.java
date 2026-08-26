package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda89;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.LocationActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.LocationActivity$$ExternalSyntheticLambda6;

public final class ProximitySheet extends FrameLayout {
    public static final int $r8$clinit = 0;
    public final int backgroundPaddingLeft;
    public final AnonymousClass3 buttonTextView;
    public final AnonymousClass1 containerView;
    public AnimatorSet currentAnimation;
    public AnimatorSet currentSheetAnimation;
    public final TLRPC.User currentUser;
    public final AnonymousClass2 customView;
    public boolean dismissed;
    public final TextView infoTextView;
    public final NumberPicker kmPicker;
    public final NumberPicker mPicker;
    public boolean maybeStartTracking;
    public final LocationActivity$$ExternalSyntheticLambda6 onDismissCallback;
    public final LocationActivity$$ExternalSyntheticLambda3 onRadiusChange;
    public final CubicBezierInterpolator openInterpolator;
    public boolean radiusSet;
    public final Rect rect;
    public boolean startedTracking;
    public int startedTrackingPointerId;
    public int startedTrackingX;
    public int startedTrackingY;
    public int totalWidth;
    public final int touchSlop;
    public boolean useFastDismiss;
    public final boolean useHardwareLayer;
    public final boolean useImperialSystem;
    public VelocityTracker velocityTracker;

    public final class AnonymousClass1 extends FrameLayout {
        @Override
        public final boolean hasOverlappingRendering() {
            return false;
        }
    }

    public final class AnonymousClass3 extends TextView {
        @Override
        public final CharSequence getAccessibilityClassName() {
            return Button.class.getName();
        }
    }

    public final class AnonymousClass4 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ProximitySheet this$0;

        public AnonymousClass4(ProximitySheet proximitySheet, int i) {
            this.$r8$classId = i;
            this.this$0 = proximitySheet;
        }

        @Override
        public void onAnimationCancel(Animator animator) {
            switch (this.$r8$classId) {
                case 1:
                    ProximitySheet proximitySheet = this.this$0;
                    AnimatorSet animatorSet = proximitySheet.currentSheetAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        proximitySheet.currentSheetAnimation = null;
                        break;
                    }
                    break;
                case 2:
                    ProximitySheet proximitySheet2 = this.this$0;
                    AnimatorSet animatorSet2 = proximitySheet2.currentSheetAnimation;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        proximitySheet2.currentSheetAnimation = null;
                        break;
                    }
                    break;
                default:
                    super.onAnimationCancel(animator);
                    break;
            }
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            ProximitySheet proximitySheet = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    AnimatorSet animatorSet = proximitySheet.currentAnimation;
                    if (animatorSet != null && animatorSet.equals(animator)) {
                        proximitySheet.currentAnimation = null;
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    break;
                case 1:
                    AnimatorSet animatorSet2 = proximitySheet.currentSheetAnimation;
                    if (animatorSet2 != null && animatorSet2.equals(animator)) {
                        proximitySheet.currentSheetAnimation = null;
                        if (proximitySheet.useHardwareLayer) {
                            proximitySheet.setLayerType(0, null);
                        }
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    break;
                default:
                    AnimatorSet animatorSet3 = proximitySheet.currentSheetAnimation;
                    if (animatorSet3 != null && animatorSet3.equals(animator)) {
                        proximitySheet.currentSheetAnimation = null;
                        AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 26));
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                    break;
            }
        }
    }

    public ProximitySheet(Activity activity, TLRPC.User user, LocationActivity$$ExternalSyntheticLambda3 locationActivity$$ExternalSyntheticLambda3, DialogsActivity$$ExternalSyntheticLambda89 dialogsActivity$$ExternalSyntheticLambda89, LocationActivity$$ExternalSyntheticLambda6 locationActivity$$ExternalSyntheticLambda6) {
        super(activity);
        this.velocityTracker = null;
        this.startedTrackingPointerId = -1;
        this.maybeStartTracking = false;
        this.startedTracking = false;
        this.currentAnimation = null;
        this.rect = new Rect();
        new Paint();
        this.useHardwareLayer = true;
        this.openInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        setWillNotDraw(false);
        this.onDismissCallback = locationActivity$$ExternalSyntheticLambda6;
        this.touchSlop = ViewConfiguration.get(activity).getScaledTouchSlop();
        Rect rect = new Rect();
        Drawable drawableMutate = activity.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_dialogBackground, false), PorterDuff.Mode.MULTIPLY));
        drawableMutate.getPadding(rect);
        int i = rect.left;
        this.backgroundPaddingLeft = i;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(getContext());
        this.containerView = anonymousClass1;
        anonymousClass1.setBackgroundDrawable(drawableMutate);
        anonymousClass1.setPadding(i, (AndroidUtilities.dp(8.0f) + rect.top) - 1, i, 0);
        anonymousClass1.setVisibility(4);
        addView(anonymousClass1, 0, LayoutHelper.createFrame(-1, -2, 80));
        this.useImperialSystem = LocaleController.getUseImperialSystemType();
        this.currentUser = user;
        this.onRadiusChange = locationActivity$$ExternalSyntheticLambda3;
        NumberPicker numberPicker = new NumberPicker(activity, 18, null);
        this.kmPicker = numberPicker;
        numberPicker.setTextOffset(AndroidUtilities.dp(10.0f));
        numberPicker.setItemCount(5);
        NumberPicker numberPicker2 = new NumberPicker(activity, 18, null);
        this.mPicker = numberPicker2;
        numberPicker2.setItemCount(5);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(10.0f));
        ?? r9 = new LinearLayout(activity) {
            public boolean ignoreLayout = false;

            @Override
            public final void onMeasure(int i2, int i3) {
                this.ignoreLayout = true;
                Point point = AndroidUtilities.displaySize;
                int i4 = point.x > point.y ? 3 : 5;
                ProximitySheet proximitySheet = ProximitySheet.this;
                proximitySheet.kmPicker.setItemCount(i4);
                proximitySheet.mPicker.setItemCount(i4);
                proximitySheet.kmPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i4;
                proximitySheet.mPicker.getLayoutParams().height = AndroidUtilities.dp(54.0f) * i4;
                this.ignoreLayout = false;
                proximitySheet.totalWidth = View.MeasureSpec.getSize(i2);
                if (proximitySheet.totalWidth != 0) {
                    proximitySheet.updateText(false);
                }
                super.onMeasure(i2, i3);
            }

            @Override
            public final void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.customView = r9;
        r9.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(activity);
        r9.addView(frameLayout, LayoutHelper.createLinear(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(activity);
        textView.setText(LocaleController.getString(R.string.LocationNotifiation));
        FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline2.m(20.0f, Theme.getColor(null, Theme.key_dialogTextBlack, false), 1, textView);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(19));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        r9.addView(linearLayout, LayoutHelper.createLinear(-1, -2));
        System.currentTimeMillis();
        FrameLayout frameLayout2 = new FrameLayout(activity);
        TextView textView2 = new TextView(activity);
        this.infoTextView = textView2;
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(activity);
        this.buttonTextView = anonymousClass3;
        linearLayout.addView(numberPicker, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker.setFormatter(new ProximitySheet$$ExternalSyntheticLambda1(this, 0));
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue(10);
        numberPicker.setWrapSelectorWheel(false);
        numberPicker.setTextOffset(AndroidUtilities.dp(20.0f));
        ProximitySheet$$ExternalSyntheticLambda1 proximitySheet$$ExternalSyntheticLambda1 = new ProximitySheet$$ExternalSyntheticLambda1(this, 1);
        numberPicker.setOnValueChangedListener(proximitySheet$$ExternalSyntheticLambda1);
        numberPicker2.setMinValue(0);
        numberPicker2.setMaxValue(10);
        numberPicker2.setWrapSelectorWheel(false);
        numberPicker2.setTextOffset(-AndroidUtilities.dp(20.0f));
        linearLayout.addView(numberPicker2, LayoutHelper.createLinear(0.5f, 0, 270));
        numberPicker2.setFormatter(new ProximitySheet$$ExternalSyntheticLambda1(this, 2));
        numberPicker2.setOnValueChangedListener(proximitySheet$$ExternalSyntheticLambda1);
        numberPicker.setValue(0);
        numberPicker2.setValue(6);
        r9.addView(frameLayout2, LayoutHelper.createLinear(-1, 48, 83, 16, 15, 16, 16));
        anonymousClass3.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        anonymousClass3.setGravity(17);
        anonymousClass3.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
        anonymousClass3.setTextSize(1, 14.0f);
        anonymousClass3.setMaxLines(2);
        anonymousClass3.setTypeface(AndroidUtilities.bold());
        anonymousClass3.setBackgroundDrawable(Theme.AdaptiveRipple.filledRectByKey(new float[]{4.0f}, Theme.key_featuredStickers_addButton));
        frameLayout2.addView(anonymousClass3, LayoutHelper.createFrame(48.0f, -1));
        anonymousClass3.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(13, this, dialogsActivity$$ExternalSyntheticLambda89));
        textView2.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        textView2.setGravity(17);
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray2, false));
        textView2.setTextSize(1, 14.0f);
        textView2.setAlpha(0.0f);
        textView2.setScaleX(0.5f);
        textView2.setScaleY(0.5f);
        frameLayout2.addView(textView2, LayoutHelper.createFrame(48.0f, -1));
        anonymousClass1.addView((View) r9, LayoutHelper.createFrame(-1, -2, 51));
    }

    public final void dismiss() {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        AnimatorSet animatorSet = this.currentSheetAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.currentSheetAnimation = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.currentSheetAnimation = animatorSet2;
        AnonymousClass1 anonymousClass1 = this.containerView;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) View.TRANSLATION_Y, AndroidUtilities.dp(10.0f) + anonymousClass1.getMeasuredHeight()));
        if (this.useFastDismiss) {
            float measuredHeight = anonymousClass1.getMeasuredHeight();
            this.currentSheetAnimation.setDuration(Math.max(60, (int) (((measuredHeight - anonymousClass1.getTranslationY()) * 250.0f) / measuredHeight)));
            this.useFastDismiss = false;
        } else {
            this.currentSheetAnimation.setDuration(250L);
        }
        this.currentSheetAnimation.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.currentSheetAnimation.addListener(new AnonymousClass4(this, 2));
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
        this.currentSheetAnimation.start();
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.dismissed) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public View getCustomView() {
        return this.customView;
    }

    public boolean getRadiusSet() {
        return this.radiusSet;
    }

    public float getValue() {
        float f;
        float value = this.kmPicker.getValue() * 1000;
        int value2 = this.mPicker.getValue();
        boolean z = this.useImperialSystem;
        if (z) {
            if (value2 == 1) {
                f = 47.349f;
            } else {
                if (value2 > 1) {
                    value2--;
                }
                f = value2 * 100;
            }
        } else if (value2 == 1) {
            f = 50.0f;
        } else {
            if (value2 > 1) {
                value2--;
            }
            f = value2 * 100;
        }
        float f2 = value + f;
        return z ? f2 * 1.60934f : f2;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.dismissed || processTouchEvent(motionEvent, true);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = i4 - i2;
        AnonymousClass1 anonymousClass1 = this.containerView;
        int measuredHeight = i11 - anonymousClass1.getMeasuredHeight();
        int i12 = i3 - i;
        int measuredWidth = (i12 - anonymousClass1.getMeasuredWidth()) / 2;
        anonymousClass1.layout(measuredWidth, measuredHeight, anonymousClass1.getMeasuredWidth() + measuredWidth, anonymousClass1.getMeasuredHeight() + measuredHeight);
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && childAt != anonymousClass1) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth2 = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                int i14 = layoutParams.gravity;
                if (i14 == -1) {
                    i14 = 51;
                }
                int i15 = i14 & 112;
                int i16 = i14 & 7;
                if (i16 != 1) {
                    if (i16 != 5) {
                        i7 = layoutParams.leftMargin;
                    } else {
                        i5 = i3 - measuredWidth2;
                        i6 = layoutParams.rightMargin;
                    }
                    if (i15 != 16) {
                        if (i15 != 80) {
                            i10 = layoutParams.topMargin;
                        } else {
                            i8 = i11 - measuredHeight2;
                            i9 = layoutParams.bottomMargin;
                        }
                        childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                    } else {
                        i8 = ((i11 - measuredHeight2) / 2) + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    i10 = i8 - i9;
                    childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                } else {
                    i5 = ((i12 - measuredWidth2) / 2) + layoutParams.leftMargin;
                    i6 = layoutParams.rightMargin;
                }
                i7 = i5 - i6;
                if (i15 != 16) {
                    if (i15 != 80) {
                        i10 = layoutParams.topMargin;
                    } else {
                        i8 = i11 - measuredHeight2;
                        i9 = layoutParams.bottomMargin;
                    }
                    childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
                } else {
                    i8 = ((i11 - measuredHeight2) / 2) + layoutParams.topMargin;
                    i9 = layoutParams.bottomMargin;
                }
                i10 = i8 - i9;
                childAt.layout(i7, i10, measuredWidth2 + i7, measuredHeight2 + i10);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        getRootView();
        getWindowVisibleDisplayFrame(this.rect);
        setMeasuredDimension(size, size2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((this.backgroundPaddingLeft * 2) + size, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        AnonymousClass1 anonymousClass1 = this.containerView;
        anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8 && childAt != anonymousClass1) {
                measureChildWithMargins(childAt, View.MeasureSpec.makeMeasureSpec(size, 1073741824), 0, View.MeasureSpec.makeMeasureSpec(size2, 1073741824), 0);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.dismissed || processTouchEvent(motionEvent, false);
    }

    public final boolean processTouchEvent(MotionEvent motionEvent, boolean z) {
        int i = 0;
        if (!this.dismissed) {
            AnonymousClass1 anonymousClass1 = this.containerView;
            if (motionEvent == null || (!(motionEvent.getAction() == 0 || motionEvent.getAction() == 2) || this.startedTracking || this.maybeStartTracking || motionEvent.getPointerCount() != 1)) {
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    float fAbs = Math.abs((int) (motionEvent.getX() - this.startedTrackingX));
                    float y = ((int) motionEvent.getY()) - this.startedTrackingY;
                    this.velocityTracker.addMovement(motionEvent);
                    if (this.maybeStartTracking && !this.startedTracking && y > 0.0f && y / 3.0f > Math.abs(fAbs) && Math.abs(y) >= this.touchSlop) {
                        this.startedTrackingY = (int) motionEvent.getY();
                        this.maybeStartTracking = false;
                        this.startedTracking = true;
                        requestDisallowInterceptTouchEvent(true);
                    } else if (this.startedTracking) {
                        float translationY = anonymousClass1.getTranslationY() + y;
                        anonymousClass1.setTranslationY(translationY >= 0.0f ? translationY : 0.0f);
                        this.startedTrackingY = (int) motionEvent.getY();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.computeCurrentVelocity(1000);
                    float translationY2 = anonymousClass1.getTranslationY();
                    if (this.startedTracking || translationY2 != 0.0f) {
                        float xVelocity = this.velocityTracker.getXVelocity();
                        float yVelocity = this.velocityTracker.getYVelocity();
                        float translationY3 = anonymousClass1.getTranslationY();
                        if ((translationY3 >= AndroidUtilities.getPixelsInCM(0.8f, false) || (yVelocity >= 3500.0f && Math.abs(yVelocity) >= Math.abs(xVelocity))) && (yVelocity >= 0.0f || Math.abs(yVelocity) < 3500.0f)) {
                            this.useFastDismiss = true;
                            dismiss();
                        } else {
                            AnimatorSet animatorSet = new AnimatorSet();
                            this.currentAnimation = animatorSet;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                            this.currentAnimation.setDuration((int) ((Math.max(0.0f, translationY3) / AndroidUtilities.getPixelsInCM(0.8f, false)) * 150.0f));
                            this.currentAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                            this.currentAnimation.addListener(new AnonymousClass4(this, i));
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                            this.currentAnimation.start();
                        }
                        this.startedTracking = false;
                    } else {
                        this.maybeStartTracking = false;
                        this.startedTracking = false;
                    }
                    VelocityTracker velocityTracker = this.velocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.velocityTracker = null;
                    }
                    this.startedTrackingPointerId = -1;
                }
            } else {
                this.startedTrackingX = (int) motionEvent.getX();
                int y2 = (int) motionEvent.getY();
                this.startedTrackingY = y2;
                if (y2 < anonymousClass1.getTop() || this.startedTrackingX < anonymousClass1.getLeft() || this.startedTrackingX > anonymousClass1.getRight()) {
                    requestDisallowInterceptTouchEvent(true);
                    dismiss();
                    return true;
                }
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                AnimatorSet animatorSet2 = this.currentAnimation;
                if (animatorSet2 != null) {
                    animatorSet2.cancel();
                    this.currentAnimation = null;
                }
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            if ((!z && this.maybeStartTracking) || this.startedTracking) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.maybeStartTracking && !this.startedTracking) {
            onTouchEvent(null);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void updateText(boolean z) {
        boolean z2;
        float value = getValue();
        String distance = LocaleController.formatDistance(value, 2, Boolean.valueOf(this.useImperialSystem));
        int i = (int) value;
        LocationActivity locationActivity = this.onRadiusChange.f$0;
        IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
        if (iCircle != null) {
            iCircle.setRadius(i);
            if (z) {
                IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()));
                try {
                    int iMax = Math.max(i, 250);
                    IMapsProvider.LatLng center = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build().getCenter();
                    double d = iMax;
                    IMapsProvider.LatLng latLngMove = LocationActivity.move(center, d, d);
                    double d2 = -iMax;
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(LocationActivity.move(center, d2, d2));
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLngMove);
                    IMapsProvider.ILatLngBounds iLatLngBoundsBuild = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build();
                    try {
                        locationActivity.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), (int) ((locationActivity.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(40.0f)) + locationActivity.mapViewClip.getTranslationY()));
                        locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild, 0), 500, null);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (!DialogObject.isChatDialog(locationActivity.dialogId)) {
            ArrayList arrayList = locationActivity.markers;
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z2 = false;
                    break;
                }
                LocationActivity.LiveLocation liveLocation = (LocationActivity.LiveLocation) arrayList.get(i2);
                if (liveLocation.object != null && !UserObject.isUserSelf(liveLocation.user)) {
                    TLRPC.GeoPoint geoPoint = liveLocation.object.media.geo;
                    Location location = new Location("network");
                    location.setLatitude(geoPoint.lat);
                    location.setLongitude(geoPoint._long);
                    if (locationActivity.myLocation.distanceTo(location) > i) {
                        z2 = true;
                        break;
                    }
                }
                i2++;
            }
        } else {
            z2 = true;
            break;
        }
        TextView textView = this.infoTextView;
        TLRPC.User user = this.currentUser;
        AnonymousClass3 anonymousClass3 = this.buttonTextView;
        if (!z2 && user != null) {
            textView.setText(LocaleController.formatString("LocationNotifiationCloser", R.string.LocationNotifiationCloser, distance));
            if (anonymousClass3.getTag() == null) {
                anonymousClass3.setTag(1);
                anonymousClass3.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
                textView.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                return;
            }
            return;
        }
        if (user == null) {
            anonymousClass3.setText(LocaleController.formatString("LocationNotifiationButtonGroup", R.string.LocationNotifiationButtonGroup, distance));
        } else {
            int i3 = R.string.LocationNotifiationButtonUser;
            anonymousClass3.setText(LocaleController.formatString("LocationNotifiationButtonUser", i3, TextUtils.ellipsize(UserObject.getFirstName(user), anonymousClass3.getPaint(), Math.max(AndroidUtilities.dp(10.0f), (int) (((this.totalWidth - AndroidUtilities.dp(94.0f)) * 1.5f) - ((int) Math.ceil(anonymousClass3.getPaint().measureText(LocaleController.getString(i3)))))), TextUtils.TruncateAt.END), distance));
        }
        if (anonymousClass3.getTag() != null) {
            anonymousClass3.setTag(null);
            anonymousClass3.animate().setDuration(180L).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
            textView.animate().setDuration(180L).alpha(0.0f).scaleX(0.5f).scaleY(0.5f).start();
        }
    }
}
