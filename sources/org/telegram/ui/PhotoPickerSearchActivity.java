package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.SizeNotifierFrameLayout;

public final class PhotoPickerSearchActivity extends BaseFragment {
    public static final DialogsActivity$$ExternalSyntheticLambda79 interpolator = new DialogsActivity$$ExternalSyntheticLambda79(4);
    public boolean animatingForward;
    public boolean backAnimation;
    public final Paint backgroundPaint;
    public EditTextEmoji commentTextView;
    public final PhotoPickerActivity gifsSearch;
    public final PhotoPickerActivity imagesSearch;
    public int maximumVelocity;
    public ScrollSlidingTextTabStrip scrollSlidingTextTabStrip;
    public ActionBarMenuItem searchItem;
    public boolean swipeBackEnabled;
    public AnimatorSet tabsAnimation;
    public boolean tabsAnimationInProgress;
    public final AnonymousClass5[] viewPages;

    public final class AnonymousClass4 extends SizeNotifierFrameLayout {
        public boolean globalIgnoreLayout;
        public boolean maybeStartTracking;
        public boolean startedTracking;
        public int startedTrackingPointerId;
        public int startedTrackingX;
        public int startedTrackingY;
        public VelocityTracker velocityTracker;

        public AnonymousClass4(Context context) {
            super(context, null);
        }

        public final boolean checkTabsAnimationInProgress() {
            AnimatorSet animatorSet;
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            if (!photoPickerSearchActivity.tabsAnimationInProgress) {
                return false;
            }
            boolean z = photoPickerSearchActivity.backAnimation;
            AnonymousClass5[] anonymousClass5Arr = photoPickerSearchActivity.viewPages;
            if (z) {
                if (Math.abs(anonymousClass5Arr[0].getTranslationX()) < 1.0f) {
                    anonymousClass5Arr[0].setTranslationX(0.0f);
                    anonymousClass5Arr[1].setTranslationX(anonymousClass5Arr[0].getMeasuredWidth() * (photoPickerSearchActivity.animatingForward ? 1 : -1));
                    animatorSet = photoPickerSearchActivity.tabsAnimation;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        photoPickerSearchActivity.tabsAnimation = null;
                    }
                    photoPickerSearchActivity.tabsAnimationInProgress = false;
                }
            } else if (Math.abs(anonymousClass5Arr[1].getTranslationX()) < 1.0f) {
                AnonymousClass5 anonymousClass5 = anonymousClass5Arr[0];
                anonymousClass5.setTranslationX(anonymousClass5.getMeasuredWidth() * (photoPickerSearchActivity.animatingForward ? -1 : 1));
                anonymousClass5Arr[1].setTranslationX(0.0f);
                animatorSet = photoPickerSearchActivity.tabsAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    photoPickerSearchActivity.tabsAnimation = null;
                }
                photoPickerSearchActivity.tabsAnimationInProgress = false;
            }
            return photoPickerSearchActivity.tabsAnimationInProgress;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            float measuredHeight = ((BaseFragment) photoPickerSearchActivity).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) photoPickerSearchActivity).actionBar.getTranslationY());
            canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, Theme.dividerPaint);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            Paint paint = photoPickerSearchActivity.backgroundPaint;
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
            canvas.drawRect(0.0f, ((BaseFragment) photoPickerSearchActivity).actionBar.getTranslationY() + ((BaseFragment) photoPickerSearchActivity).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return checkTabsAnimationInProgress() || PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.animatingIndicator || onTouchEvent(motionEvent);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int paddingRight;
            int paddingLeft;
            int i6;
            int i7;
            int paddingTop;
            EditTextEmoji editTextEmoji;
            int measuredHeight;
            int measuredHeight2;
            int childCount = getChildCount();
            int iDp = AndroidUtilities.dp(20.0f);
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            int emojiPadding = (iDp < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : photoPickerSearchActivity.commentTextView.getEmojiPadding();
            setBottomClip(emojiPadding);
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    int i9 = layoutParams.gravity;
                    if (i9 == -1) {
                        i9 = 51;
                    }
                    int i10 = i9 & 112;
                    int i11 = i9 & 7;
                    if (i11 != 1) {
                        if (i11 != 5) {
                            paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                        } else {
                            i5 = ((i3 - i) - measuredWidth) - layoutParams.rightMargin;
                            paddingRight = getPaddingRight();
                        }
                        if (i10 != 16) {
                            if (i10 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i10 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i6 = ((i4 - emojiPadding) - i2) - measuredHeight3;
                                i7 = layoutParams.bottomMargin;
                            }
                            editTextEmoji = photoPickerSearchActivity.commentTextView;
                            if (editTextEmoji != null && editTextEmoji.isPopupView(childAt)) {
                                if (AndroidUtilities.isTablet()) {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                } else {
                                    measuredHeight = getMeasuredHeight();
                                    measuredHeight2 = childAt.getMeasuredHeight();
                                }
                                paddingTop = measuredHeight - measuredHeight2;
                            }
                            childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                        } else {
                            i6 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i7 = layoutParams.bottomMargin;
                        }
                        paddingTop = i6 - i7;
                        editTextEmoji = photoPickerSearchActivity.commentTextView;
                        if (editTextEmoji != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i5 = (((i3 - i) - measuredWidth) / 2) + layoutParams.leftMargin;
                        paddingRight = layoutParams.rightMargin;
                    }
                    paddingLeft = i5 - paddingRight;
                    if (i10 != 16) {
                        if (i10 != 48) {
                            paddingTop = layoutParams.topMargin + getPaddingTop();
                        } else if (i10 != 80) {
                            paddingTop = layoutParams.topMargin;
                        } else {
                            i6 = ((i4 - emojiPadding) - i2) - measuredHeight3;
                            i7 = layoutParams.bottomMargin;
                        }
                        editTextEmoji = photoPickerSearchActivity.commentTextView;
                        if (editTextEmoji != null) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            paddingTop = measuredHeight - measuredHeight2;
                        }
                        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                    } else {
                        i6 = ((((i4 - emojiPadding) - i2) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i7 = layoutParams.bottomMargin;
                    }
                    paddingTop = i6 - i7;
                    editTextEmoji = photoPickerSearchActivity.commentTextView;
                    if (editTextEmoji != null) {
                        if (AndroidUtilities.isTablet()) {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        } else {
                            measuredHeight = getMeasuredHeight();
                            measuredHeight2 = childAt.getMeasuredHeight();
                        }
                        paddingTop = measuredHeight - measuredHeight2;
                    }
                    childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight3 + paddingTop);
                }
            }
            notifyHeightChanged();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int iMakeMeasureSpec;
            int measuredHeight;
            int i3;
            AnonymousClass5[] anonymousClass5Arr;
            int childCount;
            int i4;
            View childAt;
            AnonymousClass5 anonymousClass5;
            RecyclerListView recyclerListView;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            setMeasuredDimension(size, size2);
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            measureChildWithMargins(((BaseFragment) photoPickerSearchActivity).actionBar, i, 0, i2, 0);
            if (AndroidUtilities.dp(20.0f) >= 0) {
                if (!AndroidUtilities.isInMultiwindow) {
                    size2 -= photoPickerSearchActivity.commentTextView.getEmojiPadding();
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
                measuredHeight = ((BaseFragment) photoPickerSearchActivity).actionBar.getMeasuredHeight();
                this.globalIgnoreLayout = true;
                i3 = 0;
                while (true) {
                    anonymousClass5Arr = photoPickerSearchActivity.viewPages;
                    if (i3 < anonymousClass5Arr.length) {
                        break;
                    }
                    anonymousClass5 = anonymousClass5Arr[i3];
                    if (anonymousClass5 != null && (recyclerListView = anonymousClass5.listView) != null) {
                        recyclerListView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                    }
                    i3++;
                }
                this.globalIgnoreLayout = false;
                childCount = getChildCount();
                for (i4 = 0; i4 < childCount; i4++) {
                    childAt = getChildAt(i4);
                    if (childAt == null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) photoPickerSearchActivity).actionBar) {
                        EditTextEmoji editTextEmoji = photoPickerSearchActivity.commentTextView;
                        if (editTextEmoji == null || !editTextEmoji.isPopupView(childAt)) {
                            measureChildWithMargins(childAt, i, 0, iMakeMeasureSpec, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight)), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size2 - AndroidUtilities.statusBarHeight), 1073741824));
                        }
                    }
                }
            }
            this.globalIgnoreLayout = true;
            photoPickerSearchActivity.commentTextView.hideEmojiView();
            this.globalIgnoreLayout = false;
            iMakeMeasureSpec = i2;
            measuredHeight = ((BaseFragment) photoPickerSearchActivity).actionBar.getMeasuredHeight();
            this.globalIgnoreLayout = true;
            i3 = 0;
            while (true) {
                anonymousClass5Arr = photoPickerSearchActivity.viewPages;
                if (i3 < anonymousClass5Arr.length) {
                    break;
                    break;
                }
                anonymousClass5 = anonymousClass5Arr[i3];
                if (anonymousClass5 != null) {
                    recyclerListView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                }
                i3++;
            }
            this.globalIgnoreLayout = false;
            childCount = getChildCount();
            while (i4 < childCount) {
                childAt = getChildAt(i4);
                if (childAt == null) {
                }
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            float xVelocity;
            float yVelocity;
            float measuredWidth;
            boolean z;
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            if (((ActionBarLayout) ((BaseFragment) photoPickerSearchActivity).parentLayout).checkTransitionAnimation() || checkTabsAnimationInProgress()) {
                return false;
            }
            if (motionEvent != null) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.addMovement(motionEvent);
            }
            if (motionEvent == null || motionEvent.getAction() != 0 || this.startedTracking || this.maybeStartTracking) {
                AnonymousClass5[] anonymousClass5Arr = photoPickerSearchActivity.viewPages;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                    int x = (int) (motionEvent.getX() - this.startedTrackingX);
                    int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                    if (this.startedTracking && (((z = photoPickerSearchActivity.animatingForward) && x > 0) || (!z && x < 0))) {
                        if (!prepareForMoving$3(motionEvent, x < 0)) {
                            this.maybeStartTracking = true;
                            this.startedTracking = false;
                            anonymousClass5Arr[0].setTranslationX(0.0f);
                            anonymousClass5Arr[1].setTranslationX(photoPickerSearchActivity.animatingForward ? anonymousClass5Arr[0].getMeasuredWidth() : -anonymousClass5Arr[0].getMeasuredWidth());
                            photoPickerSearchActivity.scrollSlidingTextTabStrip.selectTabWithId$1(0.0f, anonymousClass5Arr[1].selectedType);
                        }
                    }
                    if (!this.maybeStartTracking || this.startedTracking) {
                        if (this.startedTracking) {
                            anonymousClass5Arr[0].setTranslationX(x);
                            if (photoPickerSearchActivity.animatingForward) {
                                anonymousClass5Arr[1].setTranslationX(anonymousClass5Arr[0].getMeasuredWidth() + x);
                            } else {
                                anonymousClass5Arr[1].setTranslationX(x - anonymousClass5Arr[0].getMeasuredWidth());
                            }
                            photoPickerSearchActivity.scrollSlidingTextTabStrip.selectTabWithId$1(Math.abs(x) / anonymousClass5Arr[0].getMeasuredWidth(), anonymousClass5Arr[1].selectedType);
                        }
                    } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                        prepareForMoving$3(motionEvent, x < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    this.velocityTracker.computeCurrentVelocity(1000, photoPickerSearchActivity.maximumVelocity);
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    } else {
                        xVelocity = this.velocityTracker.getXVelocity();
                        yVelocity = this.velocityTracker.getYVelocity();
                        if (!this.startedTracking && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            prepareForMoving$3(motionEvent, xVelocity < 0.0f);
                        }
                    }
                    if (this.startedTracking) {
                        float x2 = anonymousClass5Arr[0].getX();
                        photoPickerSearchActivity.tabsAnimation = new AnimatorSet();
                        boolean z2 = Math.abs(x2) < ((float) anonymousClass5Arr[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                        photoPickerSearchActivity.backAnimation = z2;
                        Property property = View.TRANSLATION_X;
                        if (z2) {
                            measuredWidth = Math.abs(x2);
                            if (photoPickerSearchActivity.animatingForward) {
                                AnimatorSet animatorSet = photoPickerSearchActivity.tabsAnimation;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass5Arr[0], (Property<AnonymousClass5, Float>) property, 0.0f);
                                AnonymousClass5 anonymousClass5 = anonymousClass5Arr[1];
                                animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) property, anonymousClass5.getMeasuredWidth()));
                            } else {
                                AnimatorSet animatorSet2 = photoPickerSearchActivity.tabsAnimation;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass5Arr[0], (Property<AnonymousClass5, Float>) property, 0.0f);
                                AnonymousClass5 anonymousClass6 = anonymousClass5Arr[1];
                                animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property, -anonymousClass6.getMeasuredWidth()));
                            }
                        } else {
                            measuredWidth = anonymousClass5Arr[0].getMeasuredWidth() - Math.abs(x2);
                            if (photoPickerSearchActivity.animatingForward) {
                                AnimatorSet animatorSet3 = photoPickerSearchActivity.tabsAnimation;
                                AnonymousClass5 anonymousClass7 = anonymousClass5Arr[0];
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass5, Float>) property, -anonymousClass7.getMeasuredWidth()), ObjectAnimator.ofFloat(anonymousClass5Arr[1], (Property<AnonymousClass5, Float>) property, 0.0f));
                            } else {
                                AnimatorSet animatorSet4 = photoPickerSearchActivity.tabsAnimation;
                                AnonymousClass5 anonymousClass8 = anonymousClass5Arr[0];
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass5, Float>) property, anonymousClass8.getMeasuredWidth()), ObjectAnimator.ofFloat(anonymousClass5Arr[1], (Property<AnonymousClass5, Float>) property, 0.0f));
                            }
                        }
                        photoPickerSearchActivity.tabsAnimation.setInterpolator(PhotoPickerSearchActivity.interpolator);
                        int measuredWidth2 = getMeasuredWidth();
                        float f = measuredWidth2 / 2;
                        float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
                        float fAbs = Math.abs(xVelocity);
                        photoPickerSearchActivity.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        photoPickerSearchActivity.tabsAnimation.addListener(new PhotoViewer$41$1(this, 23));
                        photoPickerSearchActivity.tabsAnimation.start();
                        photoPickerSearchActivity.tabsAnimationInProgress = true;
                        this.startedTracking = false;
                    } else {
                        this.maybeStartTracking = false;
                        ((BaseFragment) photoPickerSearchActivity).actionBar.setEnabled(true);
                        photoPickerSearchActivity.scrollSlidingTextTabStrip.setEnabled(true);
                    }
                    VelocityTracker velocityTracker = this.velocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.velocityTracker = null;
                    }
                }
            } else {
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.maybeStartTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                this.startedTrackingY = (int) motionEvent.getY();
                this.velocityTracker.clear();
            }
            return this.startedTracking;
        }

        public final boolean prepareForMoving$3(MotionEvent motionEvent, boolean z) {
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = photoPickerSearchActivity.scrollSlidingTextTabStrip;
            int i = scrollSlidingTextTabStrip.positionToId.get(scrollSlidingTextTabStrip.currentPosition + (z ? 1 : -1), -1);
            if (i < 0) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            this.maybeStartTracking = false;
            this.startedTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            ((BaseFragment) photoPickerSearchActivity).actionBar.setEnabled(false);
            photoPickerSearchActivity.scrollSlidingTextTabStrip.setEnabled(false);
            AnonymousClass5[] anonymousClass5Arr = photoPickerSearchActivity.viewPages;
            AnonymousClass5 anonymousClass5 = anonymousClass5Arr[1];
            anonymousClass5.selectedType = i;
            anonymousClass5.setVisibility(0);
            photoPickerSearchActivity.animatingForward = z;
            photoPickerSearchActivity.switchToCurrentSelectedMode$3(true);
            if (z) {
                anonymousClass5Arr[1].setTranslationX(anonymousClass5Arr[0].getMeasuredWidth());
                return true;
            }
            anonymousClass5Arr[1].setTranslationX(-anonymousClass5Arr[0].getMeasuredWidth());
            return true;
        }

        @Override
        public final void requestLayout() {
            if (this.globalIgnoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final class AnonymousClass5 extends FrameLayout {
        public ActionBar actionBar;
        public FrameLayout fragmentView;
        public RecyclerListView listView;
        public PhotoPickerActivity parentFragment;
        public int selectedType;

        public AnonymousClass5(Context context) {
            super(context);
        }

        @Override
        public final void setTranslationX(float f) {
            AnonymousClass5[] anonymousClass5Arr;
            AnonymousClass5 anonymousClass5;
            super.setTranslationX(f);
            PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
            if (photoPickerSearchActivity.tabsAnimationInProgress && (anonymousClass5 = (anonymousClass5Arr = photoPickerSearchActivity.viewPages)[0]) == this) {
                photoPickerSearchActivity.scrollSlidingTextTabStrip.selectTabWithId$1(Math.abs(anonymousClass5.getTranslationX()) / anonymousClass5Arr[0].getMeasuredWidth(), anonymousClass5Arr[1].selectedType);
            }
        }
    }

    public PhotoPickerSearchActivity(HashMap map, ArrayList arrayList, int i, boolean z, ChatActivity chatActivity) {
        super(null);
        this.swipeBackEnabled = true;
        this.backgroundPaint = new Paint();
        this.viewPages = new AnonymousClass5[2];
        this.imagesSearch = new PhotoPickerActivity(0, null, map, arrayList, i, z, chatActivity, false);
        this.gifsSearch = new PhotoPickerActivity(1, null, map, arrayList, i, z, chatActivity, false);
    }

    public static void access$3500(PhotoPickerSearchActivity photoPickerSearchActivity, float f) {
        photoPickerSearchActivity.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            AnonymousClass5[] anonymousClass5Arr = photoPickerSearchActivity.viewPages;
            if (i >= anonymousClass5Arr.length) {
                photoPickerSearchActivity.fragmentView.invalidate();
                return;
            } else {
                anonymousClass5Arr[i].listView.setPinnedSectionOffsetY((int) f);
                i++;
            }
        }
    }

    public static void access$3600(PhotoPickerSearchActivity photoPickerSearchActivity, String str) {
        photoPickerSearchActivity.searchItem.getSearchField().setText(str);
        photoPickerSearchActivity.searchItem.getSearchField().setSelection(str.length());
        photoPickerSearchActivity.actionBar.onSearchPressed();
    }

    @Override
    public final View createView(Context context) {
        AnonymousClass5[] anonymousClass5Arr;
        View view;
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_dialogTextBlack;
        actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_dialogButtonSelector, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new LogoutActivity.AnonymousClass1(this, 10));
        this.hasOwnBackground = true;
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 15);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(Theme.getColor(null, i, false));
        searchField.setCursorColor(Theme.getColor(null, i, false));
        searchField.setHintTextColor(Theme.getColor(null, Theme.key_chat_messagePanelHint, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.scrollSlidingTextTabStrip = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.scrollSlidingTextTabStrip;
        int i2 = Theme.key_chat_attachActiveTab;
        int i3 = Theme.key_chat_attachUnactiveTab;
        scrollSlidingTextTabStrip2.activeTextColorKey = i2;
        scrollSlidingTextTabStrip2.unactiveTextColorKey = i3;
        scrollSlidingTextTabStrip2.updateColors$1();
        this.actionBar.addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 44, 83));
        this.scrollSlidingTextTabStrip.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public final void onPageScrolled(float f) {
                PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
                if (f != 1.0f || photoPickerSearchActivity.viewPages[1].getVisibility() == 0) {
                    boolean z = photoPickerSearchActivity.animatingForward;
                    AnonymousClass5[] anonymousClass5Arr2 = photoPickerSearchActivity.viewPages;
                    if (z) {
                        AnonymousClass5 anonymousClass5 = anonymousClass5Arr2[0];
                        anonymousClass5.setTranslationX((-f) * anonymousClass5.getMeasuredWidth());
                        AnonymousClass5[] anonymousClass5Arr3 = photoPickerSearchActivity.viewPages;
                        anonymousClass5Arr3[1].setTranslationX(anonymousClass5Arr3[0].getMeasuredWidth() - (f * photoPickerSearchActivity.viewPages[0].getMeasuredWidth()));
                    } else {
                        AnonymousClass5 anonymousClass6 = anonymousClass5Arr2[0];
                        anonymousClass6.setTranslationX(anonymousClass6.getMeasuredWidth() * f);
                        AnonymousClass5[] anonymousClass5Arr4 = photoPickerSearchActivity.viewPages;
                        anonymousClass5Arr4[1].setTranslationX((f * anonymousClass5Arr4[0].getMeasuredWidth()) - photoPickerSearchActivity.viewPages[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        AnonymousClass5[] anonymousClass5Arr5 = photoPickerSearchActivity.viewPages;
                        AnonymousClass5 anonymousClass7 = anonymousClass5Arr5[0];
                        anonymousClass5Arr5[0] = anonymousClass5Arr5[1];
                        anonymousClass5Arr5[1] = anonymousClass7;
                        anonymousClass7.setVisibility(8);
                    }
                }
            }

            @Override
            public final void onPageSelected(int i4, boolean z) {
                PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
                if (photoPickerSearchActivity.viewPages[0].selectedType == i4) {
                    return;
                }
                photoPickerSearchActivity.swipeBackEnabled = i4 == photoPickerSearchActivity.scrollSlidingTextTabStrip.getFirstTabId();
                AnonymousClass5 anonymousClass5 = photoPickerSearchActivity.viewPages[1];
                anonymousClass5.selectedType = i4;
                anonymousClass5.setVisibility(0);
                photoPickerSearchActivity.switchToCurrentSelectedMode$3(true);
                photoPickerSearchActivity.animatingForward = z;
                if (i4 == 0) {
                    photoPickerSearchActivity.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
                } else {
                    photoPickerSearchActivity.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
                }
            }

            @Override
            public final void onSamePageSelected() {
            }

            @Override
            public final boolean showOptions(int i4, View view2) {
                return false;
            }
        });
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
        this.fragmentView = anonymousClass4;
        anonymousClass4.setWillNotDraw(false);
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        photoPickerActivity.setParentFragment(this);
        EditTextEmoji editTextEmoji = photoPickerActivity.commentTextView;
        this.commentTextView = editTextEmoji;
        editTextEmoji.setSizeNotifierLayout(anonymousClass4);
        int i4 = 0;
        while (i4 < 4) {
            if (i4 == 0) {
                view = photoPickerActivity.frameLayout2;
            } else if (i4 != 1) {
                view = i4 != 2 ? photoPickerActivity.shadow : photoPickerActivity.selectedCountView;
            } else {
                view = photoPickerActivity.writeButtonContainer;
            }
            ((ViewGroup) view.getParent()).removeView(view);
            i4++;
        }
        FrameLayout frameLayout = photoPickerActivity.frameLayout2;
        LoginActivity.AnonymousClass4 anonymousClass5 = photoPickerActivity.writeButtonContainer;
        QrActivity.AnonymousClass2 anonymousClass2 = photoPickerActivity.selectedCountView;
        View view2 = photoPickerActivity.shadow;
        EditTextEmoji editTextEmoji2 = photoPickerActivity.commentTextView;
        PhotoPickerActivity photoPickerActivity2 = this.gifsSearch;
        photoPickerActivity2.frameLayout2 = frameLayout;
        photoPickerActivity2.writeButtonContainer = anonymousClass5;
        photoPickerActivity2.commentTextView = editTextEmoji2;
        photoPickerActivity2.selectedCountView = anonymousClass2;
        photoPickerActivity2.shadow = view2;
        photoPickerActivity2.needsBottomLayout = false;
        photoPickerActivity2.setParentFragment(this);
        int i5 = 0;
        while (true) {
            anonymousClass5Arr = this.viewPages;
            if (i5 >= anonymousClass5Arr.length) {
                break;
            }
            AnonymousClass5 anonymousClass6 = new AnonymousClass5(context);
            anonymousClass5Arr[i5] = anonymousClass6;
            anonymousClass4.addView(anonymousClass6, LayoutHelper.createFrame(-1.0f, -1));
            if (i5 == 0) {
                AnonymousClass5 anonymousClass7 = anonymousClass5Arr[i5];
                anonymousClass7.parentFragment = photoPickerActivity;
                anonymousClass7.listView = photoPickerActivity.listView;
            } else if (i5 == 1) {
                AnonymousClass5 anonymousClass8 = anonymousClass5Arr[i5];
                anonymousClass8.parentFragment = photoPickerActivity2;
                anonymousClass8.listView = photoPickerActivity2.listView;
                anonymousClass8.setVisibility(8);
            }
            anonymousClass5Arr[i5].listView.setScrollingTouchSlop(1);
            AnonymousClass5 anonymousClass9 = anonymousClass5Arr[i5];
            anonymousClass9.fragmentView = (FrameLayout) anonymousClass9.parentFragment.getFragmentView();
            anonymousClass5Arr[i5].listView.setClipToPadding(false);
            AnonymousClass5 anonymousClass10 = anonymousClass5Arr[i5];
            anonymousClass10.actionBar = anonymousClass10.parentFragment.getActionBar();
            AnonymousClass5 anonymousClass11 = anonymousClass5Arr[i5];
            anonymousClass11.addView(anonymousClass11.fragmentView, LayoutHelper.createFrame(-1.0f, -1));
            AnonymousClass5 anonymousClass12 = anonymousClass5Arr[i5];
            anonymousClass12.addView(anonymousClass12.actionBar, LayoutHelper.createFrame(-2.0f, -1));
            anonymousClass5Arr[i5].actionBar.setVisibility(8);
            anonymousClass5Arr[i5].listView.setOnScrollListener(new ChatActivity.AnonymousClass35(8, this, anonymousClass5Arr[i5].listView.getOnScrollListener()));
            i5++;
        }
        anonymousClass4.addView(this.actionBar, LayoutHelper.createFrame(-2.0f, -1));
        anonymousClass4.addView(photoPickerActivity.frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        anonymousClass4.addView(photoPickerActivity.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        anonymousClass4.addView(photoPickerActivity.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip3 = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStrip3 != null) {
            scrollSlidingTextTabStrip3.addTextTab(0, LocaleController.getString(R.string.ImagesTab2), null);
            this.scrollSlidingTextTabStrip.addTextTab(1, LocaleController.getString(R.string.GifsTab2), null);
            this.scrollSlidingTextTabStrip.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
            if (currentTabId >= 0) {
                anonymousClass5Arr[0].selectedType = currentTabId;
            }
            this.scrollSlidingTextTabStrip.finishAddingTabs();
        }
        switchToCurrentSelectedMode$3(false);
        this.swipeBackEnabled = this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId();
        int color = Theme.getColor(null, Theme.key_dialogBackground, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(color) >= 0.721f) {
            View view3 = this.fragmentView;
            view3.setSystemUiVisibility(view3.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i));
        ActionBar actionBar = this.actionBar;
        int i2 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(actionBar, 64, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, i2));
        ActionBar actionBar2 = this.actionBar;
        int i3 = Theme.key_dialogButtonSelector;
        arrayList.add(new ThemeDescription(actionBar2, 256, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_chat_messagePanelHint));
        arrayList.add(new ThemeDescription(this.searchItem.getSearchField(), 16777216, null, null, null, null, i2));
        int i4 = Theme.key_chat_attachActiveTab;
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_chat_attachUnactiveTab));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, i3));
        arrayList.add(new ThemeDescription(null, 0, null, null, new Drawable[]{this.scrollSlidingTextTabStrip.getSelectorDrawable()}, null, i4));
        arrayList.addAll(this.imagesSearch.getThemeDescriptions());
        arrayList.addAll(this.gifsSearch.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        if (photoPickerActivity != null) {
            photoPickerActivity.onConfigurationChanged(configuration);
        }
        PhotoPickerActivity photoPickerActivity2 = this.gifsSearch;
        if (photoPickerActivity2 != null) {
            photoPickerActivity2.onConfigurationChanged(configuration);
        }
    }

    @Override
    public final void onFragmentDestroy() {
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        if (photoPickerActivity != null) {
            photoPickerActivity.onFragmentDestroy();
        }
        PhotoPickerActivity photoPickerActivity2 = this.gifsSearch;
        if (photoPickerActivity2 != null) {
            photoPickerActivity2.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        if (photoPickerActivity != null) {
            photoPickerActivity.onPause();
        }
        PhotoPickerActivity photoPickerActivity2 = this.gifsSearch;
        if (photoPickerActivity2 != null) {
            photoPickerActivity2.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.openSearch(true);
            getParentActivity().getWindow().setSoftInputMode(32);
        }
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        if (photoPickerActivity != null) {
            photoPickerActivity.onResume();
        }
        PhotoPickerActivity photoPickerActivity2 = this.gifsSearch;
        if (photoPickerActivity2 != null) {
            photoPickerActivity2.onResume();
        }
    }

    public final void switchToCurrentSelectedMode$3(boolean z) {
        AnonymousClass5[] anonymousClass5Arr;
        int i = 0;
        while (true) {
            anonymousClass5Arr = this.viewPages;
            if (i >= anonymousClass5Arr.length) {
                break;
            }
            anonymousClass5Arr[i].listView.stopScroll();
            i++;
        }
        anonymousClass5Arr[z ? 1 : 0].listView.getAdapter();
        anonymousClass5Arr[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((LinearLayoutManager) anonymousClass5Arr[z ? 1 : 0].listView.getLayoutManager()).scrollToPositionWithOffset(0, (int) this.actionBar.getTranslationY());
        }
    }
}
