package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.PhotoPickerActivity;

public class PhotoPickerSearchActivity extends BaseFragment {
    private static final Interpolator interpolator = PhotoPickerSearchActivity$$ExternalSyntheticLambda0.INSTANCE;
    private boolean animatingForward;
    private boolean backAnimation;
    private EditTextEmoji commentTextView;
    private PhotoPickerActivity gifsSearch;
    private PhotoPickerActivity imagesSearch;
    private int maximumVelocity;
    private ScrollSlidingTextTabStrip scrollSlidingTextTabStrip;
    private ActionBarMenuItem searchItem;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private boolean swipeBackEnabled = true;
    private Paint backgroundPaint = new Paint();
    private ViewPage[] viewPages = new ViewPage[2];

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public static class ViewPage extends FrameLayout {
        private ActionBar actionBar;
        private FrameLayout fragmentView;
        private RecyclerListView listView;
        private BaseFragment parentFragment;
        private int selectedType;

        public ViewPage(Context context) {
            super(context);
        }
    }

    public PhotoPickerSearchActivity(HashMap<Object, Object> hashMap, ArrayList<Object> arrayList, int i, boolean z, ChatActivity chatActivity) {
        this.imagesSearch = new PhotoPickerActivity(0, null, hashMap, arrayList, i, z, chatActivity, false);
        this.gifsSearch = new PhotoPickerActivity(1, null, hashMap, arrayList, i, z, chatActivity, false);
    }

    @Override
    public View createView(Context context) {
        View view;
        this.actionBar.setBackgroundColor(Theme.getColor("dialogBackground"));
        this.actionBar.setTitleColor(Theme.getColor("dialogTextBlack"));
        boolean z = false;
        this.actionBar.setItemsColor(Theme.getColor("dialogTextBlack"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("dialogButtonSelector"), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    PhotoPickerSearchActivity.this.finishFragment();
                }
            }
        });
        this.hasOwnBackground = true;
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                PhotoPickerSearchActivity.this.imagesSearch.getActionBar().openSearchField("", false);
                PhotoPickerSearchActivity.this.gifsSearch.getActionBar().openSearchField("", false);
                PhotoPickerSearchActivity.this.searchItem.getSearchField().requestFocus();
            }

            @Override
            public boolean canCollapseSearch() {
                PhotoPickerSearchActivity.this.finishFragment();
                return false;
            }

            @Override
            public void onTextChanged(EditText editText) {
                PhotoPickerSearchActivity.this.imagesSearch.getActionBar().setSearchFieldText(editText.getText().toString());
                PhotoPickerSearchActivity.this.gifsSearch.getActionBar().setSearchFieldText(editText.getText().toString());
            }

            @Override
            public void onSearchPressed(EditText editText) {
                PhotoPickerSearchActivity.this.imagesSearch.getActionBar().onSearchPressed();
                PhotoPickerSearchActivity.this.gifsSearch.getActionBar().onSearchPressed();
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("SearchImagesTitle", R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(Theme.getColor("dialogTextBlack"));
        searchField.setCursorColor(Theme.getColor("dialogTextBlack"));
        searchField.setHintTextColor(Theme.getColor("chat_messagePanelHint"));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context);
        this.scrollSlidingTextTabStrip = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.scrollSlidingTextTabStrip.setColors("chat_attachActiveTab", "chat_attachActiveTab", "chat_attachUnactiveTab", "dialogButtonSelector");
        this.actionBar.addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 44, 83));
        this.scrollSlidingTextTabStrip.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public void onSamePageSelected() {
                ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$onSamePageSelected(this);
            }

            @Override
            public void onPageSelected(int i, boolean z2) {
                if (PhotoPickerSearchActivity.this.viewPages[0].selectedType != i) {
                    PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
                    photoPickerSearchActivity.swipeBackEnabled = i == photoPickerSearchActivity.scrollSlidingTextTabStrip.getFirstTabId();
                    PhotoPickerSearchActivity.this.viewPages[1].selectedType = i;
                    PhotoPickerSearchActivity.this.viewPages[1].setVisibility(0);
                    PhotoPickerSearchActivity.this.switchToCurrentSelectedMode(true);
                    PhotoPickerSearchActivity.this.animatingForward = z2;
                    if (i == 0) {
                        PhotoPickerSearchActivity.this.searchItem.setSearchFieldHint(LocaleController.getString("SearchImagesTitle", R.string.SearchImagesTitle));
                    } else {
                        PhotoPickerSearchActivity.this.searchItem.setSearchFieldHint(LocaleController.getString("SearchGifsTitle", R.string.SearchGifsTitle));
                    }
                }
            }

            @Override
            public void onPageScrolled(float f) {
                if (f != 1.0f || PhotoPickerSearchActivity.this.viewPages[1].getVisibility() == 0) {
                    if (PhotoPickerSearchActivity.this.animatingForward) {
                        PhotoPickerSearchActivity.this.viewPages[0].setTranslationX((-f) * PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                        PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() - (PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() * f));
                    } else {
                        PhotoPickerSearchActivity.this.viewPages[0].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() * f);
                        PhotoPickerSearchActivity.this.viewPages[1].setTranslationX((PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() * f) - PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        ViewPage viewPage = PhotoPickerSearchActivity.this.viewPages[0];
                        PhotoPickerSearchActivity.this.viewPages[0] = PhotoPickerSearchActivity.this.viewPages[1];
                        PhotoPickerSearchActivity.this.viewPages[1] = viewPage;
                        PhotoPickerSearchActivity.this.viewPages[1].setVisibility(8);
                    }
                }
            }
        });
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private boolean globalIgnoreLayout;
            private boolean maybeStartTracking;
            private boolean startedTracking;
            private int startedTrackingPointerId;
            private int startedTrackingX;
            private int startedTrackingY;
            private VelocityTracker velocityTracker;

            private boolean prepareForMoving(MotionEvent motionEvent, boolean z2) {
                int nextPageId = PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.getNextPageId(z2);
                if (nextPageId < 0) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                this.maybeStartTracking = false;
                this.startedTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.setEnabled(false);
                PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.setEnabled(false);
                PhotoPickerSearchActivity.this.viewPages[1].selectedType = nextPageId;
                PhotoPickerSearchActivity.this.viewPages[1].setVisibility(0);
                PhotoPickerSearchActivity.this.animatingForward = z2;
                PhotoPickerSearchActivity.this.switchToCurrentSelectedMode(true);
                if (z2) {
                    PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                } else {
                    PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(-PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                }
                return true;
            }

            @Override
            public void forceHasOverlappingRendering(boolean z2) {
                super.forceHasOverlappingRendering(z2);
            }

            @Override
            protected void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                setMeasuredDimension(size, size2);
                measureChildWithMargins(((BaseFragment) PhotoPickerSearchActivity.this).actionBar, i, 0, i2, 0);
                if ((SharedConfig.smoothKeyboard ? 0 : measureKeyboardHeight()) > AndroidUtilities.dp(20.0f)) {
                    this.globalIgnoreLayout = true;
                    PhotoPickerSearchActivity.this.commentTextView.hideEmojiView();
                    this.globalIgnoreLayout = false;
                } else if (!AndroidUtilities.isInMultiwindow) {
                    size2 -= PhotoPickerSearchActivity.this.commentTextView.getEmojiPadding();
                    i2 = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                }
                int measuredHeight = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight();
                this.globalIgnoreLayout = true;
                for (int i3 = 0; i3 < PhotoPickerSearchActivity.this.viewPages.length; i3++) {
                    if (!(PhotoPickerSearchActivity.this.viewPages[i3] == null || PhotoPickerSearchActivity.this.viewPages[i3].listView == null)) {
                        PhotoPickerSearchActivity.this.viewPages[i3].listView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                    }
                }
                this.globalIgnoreLayout = false;
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (!(childAt == null || childAt.getVisibility() == 8 || childAt == ((BaseFragment) PhotoPickerSearchActivity.this).actionBar)) {
                        if (PhotoPickerSearchActivity.this.commentTextView == null || !PhotoPickerSearchActivity.this.commentTextView.isPopupView(childAt)) {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                        } else if (AndroidUtilities.isTablet()) {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                        }
                    }
                }
            }

            @Override
            public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoPickerSearchActivity.AnonymousClass4.onLayout(boolean, int, int, int, int):void");
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                float measuredHeight = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY());
                canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, Theme.dividerPaint);
            }

            @Override
            public void requestLayout() {
                if (!this.globalIgnoreLayout) {
                    super.requestLayout();
                }
            }

            public boolean checkTabsAnimationInProgress() {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PhotoPickerSearchActivity.AnonymousClass4.checkTabsAnimationInProgress():boolean");
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return checkTabsAnimationInProgress() || PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
            }

            @Override
            protected void onDraw(Canvas canvas) {
                PhotoPickerSearchActivity.this.backgroundPaint.setColor(Theme.getColor("windowBackgroundGray"));
                canvas.drawRect(0.0f, ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight() + ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY(), getMeasuredWidth(), getMeasuredHeight(), PhotoPickerSearchActivity.this.backgroundPaint);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                float f;
                float f2;
                float f3;
                int i;
                boolean z2 = false;
                if (((BaseFragment) PhotoPickerSearchActivity.this).parentLayout.checkTransitionAnimation() || checkTabsAnimationInProgress()) {
                    return false;
                }
                if (motionEvent != null) {
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking) {
                    this.startedTrackingPointerId = motionEvent.getPointerId(0);
                    this.maybeStartTracking = true;
                    this.startedTrackingX = (int) motionEvent.getX();
                    this.startedTrackingY = (int) motionEvent.getY();
                    this.velocityTracker.clear();
                } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                    int x = (int) (motionEvent.getX() - this.startedTrackingX);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                    if (this.startedTracking && ((PhotoPickerSearchActivity.this.animatingForward && x > 0) || (!PhotoPickerSearchActivity.this.animatingForward && x < 0))) {
                        if (!prepareForMoving(motionEvent, x < 0)) {
                            this.maybeStartTracking = true;
                            this.startedTracking = false;
                            PhotoPickerSearchActivity.this.viewPages[0].setTranslationX(0.0f);
                            PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.animatingForward ? PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() : -PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                            PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.selectTabWithId(PhotoPickerSearchActivity.this.viewPages[1].selectedType, 0.0f);
                        }
                    }
                    if (!this.maybeStartTracking || this.startedTracking) {
                        if (this.startedTracking) {
                            PhotoPickerSearchActivity.this.viewPages[0].setTranslationX(x);
                            if (PhotoPickerSearchActivity.this.animatingForward) {
                                PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() + x);
                            } else {
                                PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(x - PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                            }
                            PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.selectTabWithId(PhotoPickerSearchActivity.this.viewPages[1].selectedType, Math.abs(x) / PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                        }
                    } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > abs) {
                        if (x < 0) {
                            z2 = true;
                        }
                        prepareForMoving(motionEvent, z2);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    this.velocityTracker.computeCurrentVelocity(1000, PhotoPickerSearchActivity.this.maximumVelocity);
                    if (motionEvent == null || motionEvent.getAction() == 3) {
                        f2 = 0.0f;
                        f = 0.0f;
                    } else {
                        f2 = this.velocityTracker.getXVelocity();
                        f = this.velocityTracker.getYVelocity();
                        if (!this.startedTracking && Math.abs(f2) >= 3000.0f && Math.abs(f2) > Math.abs(f)) {
                            prepareForMoving(motionEvent, f2 < 0.0f);
                        }
                    }
                    if (this.startedTracking) {
                        float x2 = PhotoPickerSearchActivity.this.viewPages[0].getX();
                        PhotoPickerSearchActivity.this.tabsAnimation = new AnimatorSet();
                        PhotoPickerSearchActivity.this.backAnimation = Math.abs(x2) < ((float) PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(f2) < 3500.0f || Math.abs(f2) < Math.abs(f));
                        if (PhotoPickerSearchActivity.this.backAnimation) {
                            f3 = Math.abs(x2);
                            if (PhotoPickerSearchActivity.this.animatingForward) {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], View.TRANSLATION_X, PhotoPickerSearchActivity.this.viewPages[1].getMeasuredWidth()));
                            } else {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], View.TRANSLATION_X, -PhotoPickerSearchActivity.this.viewPages[1].getMeasuredWidth()));
                            }
                        } else {
                            f3 = PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x2);
                            if (PhotoPickerSearchActivity.this.animatingForward) {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], View.TRANSLATION_X, -PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], View.TRANSLATION_X, 0.0f));
                            } else {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], View.TRANSLATION_X, PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], View.TRANSLATION_X, 0.0f));
                            }
                        }
                        PhotoPickerSearchActivity.this.tabsAnimation.setInterpolator(PhotoPickerSearchActivity.interpolator);
                        int measuredWidth = getMeasuredWidth();
                        float f4 = measuredWidth / 2;
                        float distanceInfluenceForSnapDuration = f4 + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (f3 * 1.0f) / measuredWidth)) * f4);
                        float abs2 = Math.abs(f2);
                        if (abs2 > 0.0f) {
                            i = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
                        } else {
                            i = (int) (((f3 / getMeasuredWidth()) + 1.0f) * 100.0f);
                        }
                        PhotoPickerSearchActivity.this.tabsAnimation.setDuration(Math.max((int) ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(i, 600)));
                        PhotoPickerSearchActivity.this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                PhotoPickerSearchActivity.this.tabsAnimation = null;
                                if (PhotoPickerSearchActivity.this.backAnimation) {
                                    PhotoPickerSearchActivity.this.viewPages[1].setVisibility(8);
                                } else {
                                    ViewPage viewPage = PhotoPickerSearchActivity.this.viewPages[0];
                                    PhotoPickerSearchActivity.this.viewPages[0] = PhotoPickerSearchActivity.this.viewPages[1];
                                    PhotoPickerSearchActivity.this.viewPages[1] = viewPage;
                                    PhotoPickerSearchActivity.this.viewPages[1].setVisibility(8);
                                    PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
                                    photoPickerSearchActivity.swipeBackEnabled = photoPickerSearchActivity.viewPages[0].selectedType == PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.getFirstTabId();
                                    PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.selectTabWithId(PhotoPickerSearchActivity.this.viewPages[0].selectedType, 1.0f);
                                }
                                PhotoPickerSearchActivity.this.tabsAnimationInProgress = false;
                                AnonymousClass4.this.maybeStartTracking = false;
                                AnonymousClass4.this.startedTracking = false;
                                ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.setEnabled(true);
                                PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.setEnabled(true);
                            }
                        });
                        PhotoPickerSearchActivity.this.tabsAnimation.start();
                        PhotoPickerSearchActivity.this.tabsAnimationInProgress = true;
                        this.startedTracking = false;
                    } else {
                        this.maybeStartTracking = false;
                        ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.setEnabled(true);
                        PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.setEnabled(true);
                    }
                    VelocityTracker velocityTracker = this.velocityTracker;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.velocityTracker = null;
                    }
                }
                return this.startedTracking;
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        this.imagesSearch.setParentFragment(this);
        EditTextEmoji editTextEmoji = this.imagesSearch.commentTextView;
        this.commentTextView = editTextEmoji;
        editTextEmoji.setSizeNotifierLayout(sizeNotifierFrameLayout);
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                view = this.imagesSearch.frameLayout2;
            } else if (i == 1) {
                view = this.imagesSearch.writeButtonContainer;
            } else if (i != 2) {
                view = this.imagesSearch.shadow;
            } else {
                view = this.imagesSearch.selectedCountView;
            }
            ((ViewGroup) view.getParent()).removeView(view);
        }
        PhotoPickerActivity photoPickerActivity = this.gifsSearch;
        PhotoPickerActivity photoPickerActivity2 = this.imagesSearch;
        photoPickerActivity.setLayoutViews(photoPickerActivity2.frameLayout2, photoPickerActivity2.writeButtonContainer, photoPickerActivity2.selectedCountView, photoPickerActivity2.shadow, photoPickerActivity2.commentTextView);
        this.gifsSearch.setParentFragment(this);
        int i2 = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i2 >= viewPageArr.length) {
                break;
            }
            viewPageArr[i2] = new ViewPage(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (PhotoPickerSearchActivity.this.tabsAnimationInProgress && PhotoPickerSearchActivity.this.viewPages[0] == this) {
                        PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.selectTabWithId(PhotoPickerSearchActivity.this.viewPages[1].selectedType, Math.abs(PhotoPickerSearchActivity.this.viewPages[0].getTranslationX()) / PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                    }
                }
            };
            sizeNotifierFrameLayout.addView(this.viewPages[i2], LayoutHelper.createFrame(-1, -1.0f));
            if (i2 == 0) {
                this.viewPages[i2].parentFragment = this.imagesSearch;
                this.viewPages[i2].listView = this.imagesSearch.getListView();
            } else if (i2 == 1) {
                this.viewPages[i2].parentFragment = this.gifsSearch;
                this.viewPages[i2].listView = this.gifsSearch.getListView();
                this.viewPages[i2].setVisibility(8);
            }
            this.viewPages[i2].listView.setScrollingTouchSlop(1);
            ViewPage[] viewPageArr2 = this.viewPages;
            viewPageArr2[i2].fragmentView = (FrameLayout) viewPageArr2[i2].parentFragment.getFragmentView();
            this.viewPages[i2].listView.setClipToPadding(false);
            ViewPage[] viewPageArr3 = this.viewPages;
            viewPageArr3[i2].actionBar = viewPageArr3[i2].parentFragment.getActionBar();
            ViewPage[] viewPageArr4 = this.viewPages;
            viewPageArr4[i2].addView(viewPageArr4[i2].fragmentView, LayoutHelper.createFrame(-1, -1.0f));
            ViewPage[] viewPageArr5 = this.viewPages;
            viewPageArr5[i2].addView(viewPageArr5[i2].actionBar, LayoutHelper.createFrame(-1, -2.0f));
            this.viewPages[i2].actionBar.setVisibility(8);
            final RecyclerView.OnScrollListener onScrollListener = this.viewPages[i2].listView.getOnScrollListener();
            this.viewPages[i2].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                    onScrollListener.onScrollStateChanged(recyclerView, i3);
                    if (i3 != 1) {
                        int i4 = (int) (-((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY());
                        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                        if (i4 != 0 && i4 != currentActionBarHeight) {
                            if (i4 < currentActionBarHeight / 2) {
                                PhotoPickerSearchActivity.this.viewPages[0].listView.smoothScrollBy(0, -i4);
                            } else {
                                PhotoPickerSearchActivity.this.viewPages[0].listView.smoothScrollBy(0, currentActionBarHeight - i4);
                            }
                        }
                    }
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                    onScrollListener.onScrolled(recyclerView, i3, i4);
                    if (recyclerView == PhotoPickerSearchActivity.this.viewPages[0].listView) {
                        float translationY = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY();
                        float f = translationY - i4;
                        if (f < (-ActionBar.getCurrentActionBarHeight())) {
                            f = -ActionBar.getCurrentActionBarHeight();
                        } else if (f > 0.0f) {
                            f = 0.0f;
                        }
                        if (f != translationY) {
                            PhotoPickerSearchActivity.this.setScrollY(f);
                        }
                    }
                }
            });
            i2++;
        }
        sizeNotifierFrameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        sizeNotifierFrameLayout.addView(this.imagesSearch.frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        sizeNotifierFrameLayout.addView(this.imagesSearch.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        sizeNotifierFrameLayout.addView(this.imagesSearch.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        updateTabs();
        switchToCurrentSelectedMode(false);
        if (this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId()) {
            z = true;
        }
        this.swipeBackEnabled = z;
        int color = Theme.getColor("dialogBackground");
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(color) >= 0.721f) {
            View view2 = this.fragmentView;
            view2.setSystemUiVisibility(view2.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public void onResume() {
        super.onResume();
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.openSearch(true);
            getParentActivity().getWindow().setSoftInputMode(SharedConfig.smoothKeyboard ? 32 : 16);
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

    public void setCaption(CharSequence charSequence) {
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        if (photoPickerActivity != null) {
            photoPickerActivity.setCaption(charSequence);
        }
    }

    @Override
    public void onPause() {
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
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    @Override
    public void onFragmentDestroy() {
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
    public void onConfigurationChanged(Configuration configuration) {
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

    public void setScrollY(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i < viewPageArr.length) {
                viewPageArr[i].listView.setPinnedSectionOffsetY((int) f);
                i++;
            } else {
                this.fragmentView.invalidate();
                return;
            }
        }
    }

    public void searchText(String str) {
        this.searchItem.getSearchField().setText(str);
        this.searchItem.getSearchField().setSelection(str.length());
        this.actionBar.onSearchPressed();
    }

    public void setDelegate(PhotoPickerActivity.PhotoPickerActivityDelegate photoPickerActivityDelegate) {
        this.imagesSearch.setDelegate(photoPickerActivityDelegate);
        this.gifsSearch.setDelegate(photoPickerActivityDelegate);
        this.imagesSearch.setSearchDelegate(new PhotoPickerActivity.PhotoPickerActivitySearchDelegate() {
            @Override
            public void shouldSearchText(String str) {
                PhotoPickerSearchActivity.this.searchText(str);
            }

            @Override
            public void shouldClearRecentSearch() {
                PhotoPickerSearchActivity.this.imagesSearch.clearRecentSearch();
                PhotoPickerSearchActivity.this.gifsSearch.clearRecentSearch();
            }
        });
        this.gifsSearch.setSearchDelegate(new PhotoPickerActivity.PhotoPickerActivitySearchDelegate() {
            @Override
            public void shouldSearchText(String str) {
                PhotoPickerSearchActivity.this.searchText(str);
            }

            @Override
            public void shouldClearRecentSearch() {
                PhotoPickerSearchActivity.this.imagesSearch.clearRecentSearch();
                PhotoPickerSearchActivity.this.gifsSearch.clearRecentSearch();
            }
        });
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        this.imagesSearch.setMaxSelectedPhotos(i, z);
        this.gifsSearch.setMaxSelectedPhotos(i, z);
    }

    private void updateTabs() {
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStrip != null) {
            scrollSlidingTextTabStrip.addTextTab(0, LocaleController.getString("ImagesTab2", R.string.ImagesTab2));
            this.scrollSlidingTextTabStrip.addTextTab(1, LocaleController.getString("GifsTab2", R.string.GifsTab2));
            this.scrollSlidingTextTabStrip.setVisibility(0);
            this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
            int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
            if (currentTabId >= 0) {
                this.viewPages[0].selectedType = currentTabId;
            }
            this.scrollSlidingTextTabStrip.finishAddingTabs();
        }
    }

    public void switchToCurrentSelectedMode(boolean z) {
        ViewPage[] viewPageArr;
        int i = 0;
        while (true) {
            viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                break;
            }
            viewPageArr[i].listView.stopScroll();
            i++;
        }
        viewPageArr[z ? 1 : 0].listView.getAdapter();
        this.viewPages[z].listView.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((LinearLayoutManager) this.viewPages[z].listView.getLayoutManager()).scrollToPositionWithOffset(0, (int) this.actionBar.getTranslationY());
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "dialogButtonSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "chat_messagePanelHint"));
        arrayList.add(new ThemeDescription(this.searchItem.getSearchField(), ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_TEXTCOLOR, new Class[]{TextView.class}, null, null, null, "chat_attachActiveTab"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, "chat_attachUnactiveTab"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{TextView.class}, null, null, null, "dialogButtonSelector"));
        arrayList.add(new ThemeDescription(null, 0, null, null, new Drawable[]{this.scrollSlidingTextTabStrip.getSelectorDrawable()}, null, "chat_attachActiveTab"));
        arrayList.addAll(this.imagesSearch.getThemeDescriptions());
        arrayList.addAll(this.gifsSearch.getThemeDescriptions());
        return arrayList;
    }
}
