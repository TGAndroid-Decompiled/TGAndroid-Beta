package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Property;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;

public final class DialogOrContactPickerActivity extends BaseFragment {
    public static final DialogsActivity$$ExternalSyntheticLambda79 interpolator = new DialogsActivity$$ExternalSyntheticLambda79(3);
    public boolean animatingForward;
    public boolean backAnimation;
    public final Paint backgroundPaint;
    public final ContactsActivity contactsActivity;
    public final DialogsActivity dialogsActivity;
    public int maximumVelocity;
    public ScrollSlidingTextTabStrip scrollSlidingTextTabStrip;
    public ActionBarMenuItem searchItem;
    public boolean swipeBackEnabled;
    public AnimatorSet tabsAnimation;
    public boolean tabsAnimationInProgress;
    public final AnonymousClass5[] viewPages;

    public final class AnonymousClass4 extends FrameLayout {
        public boolean globalIgnoreLayout;
        public boolean maybeStartTracking;
        public boolean startedTracking;
        public int startedTrackingPointerId;
        public int startedTrackingX;
        public int startedTrackingY;
        public VelocityTracker velocityTracker;

        public AnonymousClass4(Context context) {
            super(context);
        }

        public final boolean checkTabsAnimationInProgress() {
            AnimatorSet animatorSet;
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            if (!dialogOrContactPickerActivity.tabsAnimationInProgress) {
                return false;
            }
            boolean z = dialogOrContactPickerActivity.backAnimation;
            AnonymousClass5[] anonymousClass5Arr = dialogOrContactPickerActivity.viewPages;
            if (z) {
                if (Math.abs(anonymousClass5Arr[0].getTranslationX()) < 1.0f) {
                    anonymousClass5Arr[0].setTranslationX(0.0f);
                    anonymousClass5Arr[1].setTranslationX(anonymousClass5Arr[0].getMeasuredWidth() * (dialogOrContactPickerActivity.animatingForward ? 1 : -1));
                    animatorSet = dialogOrContactPickerActivity.tabsAnimation;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        dialogOrContactPickerActivity.tabsAnimation = null;
                    }
                    dialogOrContactPickerActivity.tabsAnimationInProgress = false;
                }
            } else if (Math.abs(anonymousClass5Arr[1].getTranslationX()) < 1.0f) {
                AnonymousClass5 anonymousClass5 = anonymousClass5Arr[0];
                anonymousClass5.setTranslationX(anonymousClass5.getMeasuredWidth() * (dialogOrContactPickerActivity.animatingForward ? -1 : 1));
                anonymousClass5Arr[1].setTranslationX(0.0f);
                animatorSet = dialogOrContactPickerActivity.tabsAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    dialogOrContactPickerActivity.tabsAnimation = null;
                }
                dialogOrContactPickerActivity.tabsAnimationInProgress = false;
            }
            return dialogOrContactPickerActivity.tabsAnimationInProgress;
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            if (((BaseFragment) dialogOrContactPickerActivity).parentLayout != null) {
                INavigationLayout iNavigationLayout = ((BaseFragment) dialogOrContactPickerActivity).parentLayout;
                int measuredHeight = ((BaseFragment) dialogOrContactPickerActivity).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) dialogOrContactPickerActivity).actionBar.getTranslationY());
                iNavigationLayout.getClass();
                ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, measuredHeight);
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            Paint paint = dialogOrContactPickerActivity.backgroundPaint;
            paint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
            canvas.drawRect(0.0f, ((BaseFragment) dialogOrContactPickerActivity).actionBar.getTranslationY() + ((BaseFragment) dialogOrContactPickerActivity).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), paint);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return checkTabsAnimationInProgress() || DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.animatingIndicator || onTouchEvent(motionEvent);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            AnonymousClass4 anonymousClass4 = this;
            anonymousClass4.measureChildWithMargins(((BaseFragment) dialogOrContactPickerActivity).actionBar, i, 0, i2, 0);
            int measuredHeight = ((BaseFragment) dialogOrContactPickerActivity).actionBar.getMeasuredHeight();
            anonymousClass4.globalIgnoreLayout = true;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                AnonymousClass5[] anonymousClass5Arr = dialogOrContactPickerActivity.viewPages;
                if (i4 >= anonymousClass5Arr.length) {
                    break;
                }
                AnonymousClass5 anonymousClass5 = anonymousClass5Arr[i4];
                if (anonymousClass5 != null) {
                    RecyclerListView recyclerListView = anonymousClass5.listView;
                    if (recyclerListView != null) {
                        recyclerListView.setPadding(0, measuredHeight, 0, 0);
                    }
                    ChatActivity.AnonymousClass34 anonymousClass34 = anonymousClass5Arr[i4].listView2;
                    if (anonymousClass34 != null) {
                        anonymousClass34.setPadding(0, measuredHeight, 0, 0);
                    }
                }
                i4++;
            }
            anonymousClass4.globalIgnoreLayout = false;
            int childCount = getChildCount();
            while (i3 < childCount) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) dialogOrContactPickerActivity).actionBar) {
                    anonymousClass4.measureChildWithMargins(childAt, i, 0, i2, 0);
                }
                i3++;
                anonymousClass4 = this;
            }
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            float xVelocity;
            float yVelocity;
            float measuredWidth;
            boolean z;
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            if (((ActionBarLayout) ((BaseFragment) dialogOrContactPickerActivity).parentLayout).checkTransitionAnimation() || checkTabsAnimationInProgress()) {
                return false;
            }
            if (motionEvent != null) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.addMovement(motionEvent);
            }
            if (motionEvent == null || motionEvent.getAction() != 0 || this.startedTracking || this.maybeStartTracking) {
                AnonymousClass5[] anonymousClass5Arr = dialogOrContactPickerActivity.viewPages;
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                    int x = (int) (motionEvent.getX() - this.startedTrackingX);
                    int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                    if (this.startedTracking && (((z = dialogOrContactPickerActivity.animatingForward) && x > 0) || (!z && x < 0))) {
                        if (!prepareForMoving(motionEvent, x < 0)) {
                            this.maybeStartTracking = true;
                            this.startedTracking = false;
                            anonymousClass5Arr[0].setTranslationX(0.0f);
                            anonymousClass5Arr[1].setTranslationX(dialogOrContactPickerActivity.animatingForward ? anonymousClass5Arr[0].getMeasuredWidth() : -anonymousClass5Arr[0].getMeasuredWidth());
                            dialogOrContactPickerActivity.scrollSlidingTextTabStrip.selectTabWithId$1(0.0f, anonymousClass5Arr[1].selectedType);
                        }
                    }
                    if (!this.maybeStartTracking || this.startedTracking) {
                        if (this.startedTracking) {
                            anonymousClass5Arr[0].setTranslationX(x);
                            if (dialogOrContactPickerActivity.animatingForward) {
                                anonymousClass5Arr[1].setTranslationX(anonymousClass5Arr[0].getMeasuredWidth() + x);
                            } else {
                                anonymousClass5Arr[1].setTranslationX(x - anonymousClass5Arr[0].getMeasuredWidth());
                            }
                            dialogOrContactPickerActivity.scrollSlidingTextTabStrip.selectTabWithId$1(Math.abs(x) / anonymousClass5Arr[0].getMeasuredWidth(), anonymousClass5Arr[1].selectedType);
                        }
                    } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                        prepareForMoving(motionEvent, x < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    this.velocityTracker.computeCurrentVelocity(1000, dialogOrContactPickerActivity.maximumVelocity);
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        xVelocity = 0.0f;
                        yVelocity = 0.0f;
                    } else {
                        xVelocity = this.velocityTracker.getXVelocity();
                        yVelocity = this.velocityTracker.getYVelocity();
                        if (!this.startedTracking && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            prepareForMoving(motionEvent, xVelocity < 0.0f);
                        }
                    }
                    if (this.startedTracking) {
                        float x2 = anonymousClass5Arr[0].getX();
                        dialogOrContactPickerActivity.tabsAnimation = new AnimatorSet();
                        boolean z2 = Math.abs(x2) < ((float) anonymousClass5Arr[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                        dialogOrContactPickerActivity.backAnimation = z2;
                        Property property = View.TRANSLATION_X;
                        if (z2) {
                            measuredWidth = Math.abs(x2);
                            if (dialogOrContactPickerActivity.animatingForward) {
                                AnimatorSet animatorSet = dialogOrContactPickerActivity.tabsAnimation;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(anonymousClass5Arr[0], (Property<AnonymousClass5, Float>) property, 0.0f);
                                AnonymousClass5 anonymousClass5 = anonymousClass5Arr[1];
                                animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(anonymousClass5, (Property<AnonymousClass5, Float>) property, anonymousClass5.getMeasuredWidth()));
                            } else {
                                AnimatorSet animatorSet2 = dialogOrContactPickerActivity.tabsAnimation;
                                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(anonymousClass5Arr[0], (Property<AnonymousClass5, Float>) property, 0.0f);
                                AnonymousClass5 anonymousClass6 = anonymousClass5Arr[1];
                                animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(anonymousClass6, (Property<AnonymousClass5, Float>) property, -anonymousClass6.getMeasuredWidth()));
                            }
                        } else {
                            measuredWidth = anonymousClass5Arr[0].getMeasuredWidth() - Math.abs(x2);
                            if (dialogOrContactPickerActivity.animatingForward) {
                                AnimatorSet animatorSet3 = dialogOrContactPickerActivity.tabsAnimation;
                                AnonymousClass5 anonymousClass7 = anonymousClass5Arr[0];
                                animatorSet3.playTogether(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass5, Float>) property, -anonymousClass7.getMeasuredWidth()), ObjectAnimator.ofFloat(anonymousClass5Arr[1], (Property<AnonymousClass5, Float>) property, 0.0f));
                            } else {
                                AnimatorSet animatorSet4 = dialogOrContactPickerActivity.tabsAnimation;
                                AnonymousClass5 anonymousClass8 = anonymousClass5Arr[0];
                                animatorSet4.playTogether(ObjectAnimator.ofFloat(anonymousClass8, (Property<AnonymousClass5, Float>) property, anonymousClass8.getMeasuredWidth()), ObjectAnimator.ofFloat(anonymousClass5Arr[1], (Property<AnonymousClass5, Float>) property, 0.0f));
                            }
                        }
                        dialogOrContactPickerActivity.tabsAnimation.setInterpolator(DialogOrContactPickerActivity.interpolator);
                        int measuredWidth2 = getMeasuredWidth();
                        float f = measuredWidth2 / 2;
                        float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
                        float fAbs = Math.abs(xVelocity);
                        dialogOrContactPickerActivity.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        dialogOrContactPickerActivity.tabsAnimation.addListener(new PhotoViewer$41$1(this, 7));
                        dialogOrContactPickerActivity.tabsAnimation.start();
                        dialogOrContactPickerActivity.tabsAnimationInProgress = true;
                        this.startedTracking = false;
                    } else {
                        this.maybeStartTracking = false;
                        ((BaseFragment) dialogOrContactPickerActivity).actionBar.setEnabled(true);
                        dialogOrContactPickerActivity.scrollSlidingTextTabStrip.setEnabled(true);
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

        public final boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = dialogOrContactPickerActivity.scrollSlidingTextTabStrip;
            int i = scrollSlidingTextTabStrip.positionToId.get(scrollSlidingTextTabStrip.currentPosition + (z ? 1 : -1), -1);
            if (i < 0) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            this.maybeStartTracking = false;
            this.startedTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            ((BaseFragment) dialogOrContactPickerActivity).actionBar.setEnabled(false);
            dialogOrContactPickerActivity.scrollSlidingTextTabStrip.setEnabled(false);
            AnonymousClass5[] anonymousClass5Arr = dialogOrContactPickerActivity.viewPages;
            AnonymousClass5 anonymousClass5 = anonymousClass5Arr[1];
            anonymousClass5.selectedType = i;
            anonymousClass5.setVisibility(0);
            dialogOrContactPickerActivity.animatingForward = z;
            dialogOrContactPickerActivity.switchToCurrentSelectedMode$2(true);
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
        public ChatActivity.AnonymousClass34 listView2;
        public BaseFragment parentFragment;
        public int selectedType;

        public AnonymousClass5(Context context) {
            super(context);
        }

        @Override
        public final void setTranslationX(float f) {
            AnonymousClass5[] anonymousClass5Arr;
            AnonymousClass5 anonymousClass5;
            super.setTranslationX(f);
            DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
            if (dialogOrContactPickerActivity.tabsAnimationInProgress && (anonymousClass5 = (anonymousClass5Arr = dialogOrContactPickerActivity.viewPages)[0]) == this) {
                dialogOrContactPickerActivity.scrollSlidingTextTabStrip.selectTabWithId$1(Math.abs(anonymousClass5.getTranslationX()) / anonymousClass5Arr[0].getMeasuredWidth(), anonymousClass5Arr[1].selectedType);
            }
        }
    }

    public DialogOrContactPickerActivity() {
        super(null);
        this.backgroundPaint = new Paint();
        this.viewPages = new AnonymousClass5[2];
        this.swipeBackEnabled = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putBoolean("resetDelegate", false);
        bundle.putInt("dialogsType", 9);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        this.dialogsActivity = dialogsActivity;
        dialogsActivity.delegate = new DialogOrContactPickerActivity$$ExternalSyntheticLambda0(this);
        dialogsActivity.onFragmentCreate();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("onlyUsers", true);
        bundle2.putBoolean("destroyAfterSelect", true);
        bundle2.putBoolean("returnAsResult", true);
        bundle2.putBoolean("disableSections", true);
        bundle2.putBoolean("needFinishFragment", false);
        bundle2.putBoolean("resetDelegate", false);
        bundle2.putBoolean("allowSelf", false);
        ContactsActivity contactsActivity = new ContactsActivity(bundle2);
        this.contactsActivity = contactsActivity;
        contactsActivity.delegate = new DialogOrContactPickerActivity$$ExternalSyntheticLambda0(this);
        contactsActivity.onFragmentCreate();
    }

    public static void access$3700(DialogOrContactPickerActivity dialogOrContactPickerActivity, float f) {
        dialogOrContactPickerActivity.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            AnonymousClass5[] anonymousClass5Arr = dialogOrContactPickerActivity.viewPages;
            if (i >= anonymousClass5Arr.length) {
                dialogOrContactPickerActivity.fragmentView.invalidate();
                return;
            }
            int i2 = (int) f;
            anonymousClass5Arr[i].listView.setPinnedSectionOffsetY(i2);
            ChatActivity.AnonymousClass34 anonymousClass34 = anonymousClass5Arr[i].listView2;
            if (anonymousClass34 != null) {
                anonymousClass34.setPinnedSectionOffsetY(i2);
            }
            i++;
        }
    }

    @Override
    public final View createView(Context context) {
        AnonymousClass5[] anonymousClass5Arr;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setTitle(LocaleController.getString(R.string.BlockUserMultiTitle));
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 14));
        this.hasOwnBackground = true;
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 10);
        this.searchItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context, null);
        this.scrollSlidingTextTabStrip = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 44, 83));
        this.scrollSlidingTextTabStrip.setDelegate(new PhotoViewer.AnonymousClass18(this, 19));
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
        this.fragmentView = anonymousClass4;
        anonymousClass4.setWillNotDraw(false);
        DialogsActivity dialogsActivity = this.dialogsActivity;
        dialogsActivity.setParentFragment(this);
        ContactsActivity contactsActivity = this.contactsActivity;
        contactsActivity.setParentFragment(this);
        int i = 0;
        while (true) {
            anonymousClass5Arr = this.viewPages;
            if (i >= anonymousClass5Arr.length) {
                break;
            }
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(context);
            anonymousClass5Arr[i] = anonymousClass5;
            anonymousClass4.addView(anonymousClass5, LayoutHelper.createFrame(-1.0f, -1));
            if (i == 0) {
                AnonymousClass5 anonymousClass6 = anonymousClass5Arr[i];
                anonymousClass6.parentFragment = dialogsActivity;
                anonymousClass6.listView = dialogsActivity.viewPages[0].listView;
                dialogsActivity.createSearchViewPager();
                DialogsActivity.AnonymousClass47 anonymousClass47 = dialogsActivity.searchViewPager;
                anonymousClass6.listView2 = anonymousClass47 != null ? anonymousClass47.searchListView : null;
            } else if (i == 1) {
                AnonymousClass5 anonymousClass7 = anonymousClass5Arr[i];
                anonymousClass7.parentFragment = contactsActivity;
                anonymousClass7.listView = contactsActivity.listView;
                anonymousClass7.setVisibility(8);
            }
            anonymousClass5Arr[i].listView.setScrollingTouchSlop(1);
            AnonymousClass5 anonymousClass8 = anonymousClass5Arr[i];
            anonymousClass8.fragmentView = (FrameLayout) anonymousClass8.parentFragment.getFragmentView();
            AnonymousClass5 anonymousClass9 = anonymousClass5Arr[i];
            anonymousClass9.actionBar = anonymousClass9.parentFragment.getActionBar();
            AnonymousClass5 anonymousClass10 = anonymousClass5Arr[i];
            anonymousClass10.addView(anonymousClass10.fragmentView, LayoutHelper.createFrame(-1.0f, -1));
            AndroidUtilities.removeFromParent(anonymousClass5Arr[i].actionBar);
            AnonymousClass5 anonymousClass11 = anonymousClass5Arr[i];
            anonymousClass11.addView(anonymousClass11.actionBar, LayoutHelper.createFrame(-2.0f, -1));
            anonymousClass5Arr[i].actionBar.setVisibility(8);
            int i2 = 0;
            while (i2 < 2) {
                RecyclerListView recyclerListView = i2 == 0 ? anonymousClass5Arr[i].listView : anonymousClass5Arr[i].listView2;
                if (recyclerListView != null) {
                    recyclerListView.setClipToPadding(false);
                    recyclerListView.setOnScrollListener(new ChatActivity.AnonymousClass35(5, this, recyclerListView.getOnScrollListener()));
                }
                i2++;
            }
            i++;
        }
        anonymousClass4.addView(this.actionBar, LayoutHelper.createFrame(-2.0f, -1));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStrip2 != null) {
            scrollSlidingTextTabStrip2.addTextTab(0, LocaleController.getString(R.string.BlockUserChatsTitle), null);
            this.scrollSlidingTextTabStrip.addTextTab(1, LocaleController.getString(R.string.BlockUserContactsTitle), null);
            this.scrollSlidingTextTabStrip.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
            if (currentTabId >= 0) {
                anonymousClass5Arr[0].selectedType = currentTabId;
            }
            this.scrollSlidingTextTabStrip.finishAddingTabs();
        }
        switchToCurrentSelectedMode$2(false);
        this.swipeBackEnabled = this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId();
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, 0, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_actionBarTabActiveText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_actionBarTabUnactiveText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, Theme.key_actionBarTabLine));
        arrayList.add(new ThemeDescription(null, 0, null, null, new Drawable[]{this.scrollSlidingTextTabStrip.getSelectorDrawable()}, null, Theme.key_actionBarTabSelector));
        arrayList.addAll(this.dialogsActivity.getThemeDescriptions());
        arrayList.addAll(this.contactsActivity.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    public final void lambda$showBlockAlert$3(TLRPC.User user) {
        if (MessagesController.isSupportUser(user)) {
            AlertsCreator.showSimpleToast(this, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(this.currentAccount).blockPeer(user.id);
            AlertsCreator.showSimpleToast(this, LocaleController.getString(R.string.UserBlocked));
        }
        finishFragment();
    }

    @Override
    public final void onFragmentDestroy() {
        DialogsActivity dialogsActivity = this.dialogsActivity;
        if (dialogsActivity != null) {
            dialogsActivity.onFragmentDestroy();
        }
        ContactsActivity contactsActivity = this.contactsActivity;
        if (contactsActivity != null) {
            contactsActivity.onFragmentDestroy();
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        DialogsActivity dialogsActivity = this.dialogsActivity;
        if (dialogsActivity != null) {
            dialogsActivity.onPause();
        }
        ContactsActivity contactsActivity = this.contactsActivity;
        if (contactsActivity != null) {
            contactsActivity.onPause();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        DialogsActivity dialogsActivity = this.dialogsActivity;
        if (dialogsActivity != null) {
            dialogsActivity.onResume();
        }
        ContactsActivity contactsActivity = this.contactsActivity;
        if (contactsActivity != null) {
            contactsActivity.onResume();
        }
    }

    public final void showBlockAlert(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.BlockUser);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, ContactsController.formatName(user.first_name, user.last_name)));
        builder.setPositiveButton(LocaleController.getString(R.string.BlockContact), new RateCallLayout$$ExternalSyntheticLambda1(28, this, user));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog);
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public final void switchToCurrentSelectedMode$2(boolean z) {
        AnonymousClass5[] anonymousClass5Arr;
        int i = 0;
        while (true) {
            anonymousClass5Arr = this.viewPages;
            if (i >= anonymousClass5Arr.length) {
                break;
            }
            anonymousClass5Arr[i].listView.stopScroll();
            ChatActivity.AnonymousClass34 anonymousClass34 = anonymousClass5Arr[i].listView2;
            if (anonymousClass34 != null) {
                anonymousClass34.stopScroll();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            RecyclerListView recyclerListView = i2 == 0 ? anonymousClass5Arr[z ? 1 : 0].listView : anonymousClass5Arr[z ? 1 : 0].listView2;
            if (recyclerListView != null) {
                recyclerListView.getAdapter();
                recyclerListView.setPinnedHeaderShadowDrawable(null);
                if (this.actionBar.getTranslationY() != 0.0f) {
                    ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(0, (int) this.actionBar.getTranslationY());
                }
            }
            i2++;
        }
    }
}
