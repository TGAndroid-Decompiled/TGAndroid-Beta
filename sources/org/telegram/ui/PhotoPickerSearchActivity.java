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
import android.util.Property;
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

public class PhotoPickerSearchActivity extends BaseFragment {
    private static final Interpolator interpolator = new DataUsageActivity$$ExternalSyntheticLambda1(3);
    private static final int search_button = 0;
    private boolean animatingForward;
    private boolean backAnimation;
    private Paint backgroundPaint;
    private ChatActivity chatActivity;
    private EditTextEmoji commentTextView;
    private PhotoPickerActivity gifsSearch;
    private PhotoPickerActivity imagesSearch;
    private int maximumVelocity;
    private ScrollSlidingTextTabStrip scrollSlidingTextTabStrip;
    private ActionBarMenuItem searchItem;
    private int selectPhotoType;
    private boolean sendPressed;
    private boolean swipeBackEnabled;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private ViewPage[] viewPages;

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

    public PhotoPickerSearchActivity(HashMap<Object, Object> map, ArrayList<Object> arrayList, int i, boolean z, ChatActivity chatActivity) {
        super(null);
        this.swipeBackEnabled = true;
        this.backgroundPaint = new Paint();
        this.viewPages = new ViewPage[2];
        this.imagesSearch = new PhotoPickerActivity(0, null, map, arrayList, i, z, chatActivity, false);
        this.gifsSearch = new PhotoPickerActivity(1, null, map, arrayList, i, z, chatActivity, false);
    }

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void searchText(String str) {
        this.searchItem.getSearchField().setText(str);
        this.searchItem.getSearchField().setSelection(str.length());
        this.actionBar.onSearchPressed();
    }

    public void setScrollY(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                this.fragmentView.invalidate();
                return;
            } else {
                viewPageArr[i].listView.setPinnedSectionOffsetY((int) f);
                i++;
            }
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
        this.viewPages[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(null);
        if (this.actionBar.getTranslationY() != 0.0f) {
            ((LinearLayoutManager) this.viewPages[z ? 1 : 0].listView.getLayoutManager()).scrollToPositionWithOffset(0, (int) this.actionBar.getTranslationY());
        }
    }

    private void updateTabs() {
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStrip == null) {
            return;
        }
        scrollSlidingTextTabStrip.addTextTab(0, LocaleController.getString(R.string.ImagesTab2));
        this.scrollSlidingTextTabStrip.addTextTab(1, LocaleController.getString(R.string.GifsTab2));
        this.scrollSlidingTextTabStrip.setVisibility(0);
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
        if (currentTabId >= 0) {
            this.viewPages[0].selectedType = currentTabId;
        }
        this.scrollSlidingTextTabStrip.finishAddingTabs();
    }

    @Override
    public View createView(Context context) {
        View view;
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_dialogBackground, false));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_dialogTextBlack;
        actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_dialogButtonSelector;
        actionBar2.setItemsBackgroundColor(Theme.getColor(null, i2, false), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setExtraHeight(AndroidUtilities.dp(44.0f));
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    PhotoPickerSearchActivity.this.finishFragment();
                }
            }
        });
        this.hasOwnBackground = true;
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public boolean canCollapseSearch() {
                PhotoPickerSearchActivity.this.finishFragment();
                return false;
            }

            @Override
            public void onSearchExpand() {
                PhotoPickerSearchActivity.this.imagesSearch.getActionBar().openSearchField("", false);
                PhotoPickerSearchActivity.this.gifsSearch.getActionBar().openSearchField("", false);
                PhotoPickerSearchActivity.this.searchItem.getSearchField().requestFocus();
            }

            @Override
            public void onSearchPressed(EditText editText) {
                PhotoPickerSearchActivity.this.imagesSearch.getActionBar().onSearchPressed();
                PhotoPickerSearchActivity.this.gifsSearch.getActionBar().onSearchPressed();
            }

            @Override
            public void onTextChanged(EditText editText) {
                PhotoPickerSearchActivity.this.imagesSearch.getActionBar().setSearchFieldText(editText.getText().toString());
                PhotoPickerSearchActivity.this.gifsSearch.getActionBar().setSearchFieldText(editText.getText().toString());
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(Theme.getColor(null, i, false));
        searchField.setCursorColor(Theme.getColor(null, i, false));
        searchField.setHintTextColor(Theme.getColor(null, Theme.key_chat_messagePanelHint, false));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context);
        this.scrollSlidingTextTabStrip = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip2 = this.scrollSlidingTextTabStrip;
        int i3 = Theme.key_chat_attachActiveTab;
        scrollSlidingTextTabStrip2.setColors(i3, i3, Theme.key_chat_attachUnactiveTab, i2);
        this.actionBar.addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 44, 83));
        this.scrollSlidingTextTabStrip.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public final boolean canReorder(int i4) {
                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$canReorder(this, i4);
            }

            @Override
            public void onPageScrolled(float f) {
                if (f != 1.0f || PhotoPickerSearchActivity.this.viewPages[1].getVisibility() == 0) {
                    if (PhotoPickerSearchActivity.this.animatingForward) {
                        PhotoPickerSearchActivity.this.viewPages[0].setTranslationX((-f) * PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                        PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() - (f * PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()));
                    } else {
                        PhotoPickerSearchActivity.this.viewPages[0].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() * f);
                        PhotoPickerSearchActivity.this.viewPages[1].setTranslationX((f * PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()) - PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        ViewPage viewPage = PhotoPickerSearchActivity.this.viewPages[0];
                        PhotoPickerSearchActivity.this.viewPages[0] = PhotoPickerSearchActivity.this.viewPages[1];
                        PhotoPickerSearchActivity.this.viewPages[1] = viewPage;
                        PhotoPickerSearchActivity.this.viewPages[1].setVisibility(8);
                    }
                }
            }

            @Override
            public void onPageSelected(int i4, boolean z) {
                if (PhotoPickerSearchActivity.this.viewPages[0].selectedType == i4) {
                    return;
                }
                PhotoPickerSearchActivity photoPickerSearchActivity = PhotoPickerSearchActivity.this;
                photoPickerSearchActivity.swipeBackEnabled = i4 == photoPickerSearchActivity.scrollSlidingTextTabStrip.getFirstTabId();
                PhotoPickerSearchActivity.this.viewPages[1].selectedType = i4;
                PhotoPickerSearchActivity.this.viewPages[1].setVisibility(0);
                PhotoPickerSearchActivity.this.switchToCurrentSelectedMode(true);
                PhotoPickerSearchActivity.this.animatingForward = z;
                if (i4 == 0) {
                    PhotoPickerSearchActivity.this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
                } else {
                    PhotoPickerSearchActivity.this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.SearchGifsTitle));
                }
            }

            @Override
            public final void onSamePageSelected() {
                ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$onSamePageSelected(this);
            }

            @Override
            public final boolean showOptions(int i4, View view2) {
                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$showOptions(this, i4, view2);
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

            private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
                int nextPageId = PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.getNextPageId(z);
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
                PhotoPickerSearchActivity.this.animatingForward = z;
                PhotoPickerSearchActivity.this.switchToCurrentSelectedMode(true);
                if (z) {
                    PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                } else {
                    PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(-PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                }
                return true;
            }

            public boolean checkTabsAnimationInProgress() {
                if (!PhotoPickerSearchActivity.this.tabsAnimationInProgress) {
                    return false;
                }
                if (PhotoPickerSearchActivity.this.backAnimation) {
                    if (Math.abs(PhotoPickerSearchActivity.this.viewPages[0].getTranslationX()) < 1.0f) {
                        PhotoPickerSearchActivity.this.viewPages[0].setTranslationX(0.0f);
                        PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() * (PhotoPickerSearchActivity.this.animatingForward ? 1 : -1));
                        if (PhotoPickerSearchActivity.this.tabsAnimation != null) {
                            PhotoPickerSearchActivity.this.tabsAnimation.cancel();
                            PhotoPickerSearchActivity.this.tabsAnimation = null;
                        }
                        PhotoPickerSearchActivity.this.tabsAnimationInProgress = false;
                    }
                } else if (Math.abs(PhotoPickerSearchActivity.this.viewPages[1].getTranslationX()) < 1.0f) {
                    PhotoPickerSearchActivity.this.viewPages[0].setTranslationX(PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() * (PhotoPickerSearchActivity.this.animatingForward ? -1 : 1));
                    PhotoPickerSearchActivity.this.viewPages[1].setTranslationX(0.0f);
                    if (PhotoPickerSearchActivity.this.tabsAnimation != null) {
                        PhotoPickerSearchActivity.this.tabsAnimation.cancel();
                        PhotoPickerSearchActivity.this.tabsAnimation = null;
                    }
                    PhotoPickerSearchActivity.this.tabsAnimationInProgress = false;
                }
                return PhotoPickerSearchActivity.this.tabsAnimationInProgress;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                float measuredHeight = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY());
                canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, Theme.dividerPaint);
            }

            @Override
            public void forceHasOverlappingRendering(boolean z) {
                super.forceHasOverlappingRendering(z);
            }

            @Override
            public void onDraw(Canvas canvas) {
                PhotoPickerSearchActivity.this.backgroundPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
                canvas.drawRect(0.0f, ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY() + ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), PhotoPickerSearchActivity.this.backgroundPaint);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return checkTabsAnimationInProgress() || PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                int i8;
                int paddingRight;
                int paddingLeft;
                int i9;
                int i10;
                int paddingTop;
                int measuredHeight;
                int measuredHeight2;
                int childCount = getChildCount();
                int emojiPadding = (AndroidUtilities.dp(20.0f) < 0 || AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) ? 0 : PhotoPickerSearchActivity.this.commentTextView.getEmojiPadding();
                setBottomClip(emojiPadding);
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() != 8) {
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                        int measuredWidth = childAt.getMeasuredWidth();
                        int measuredHeight3 = childAt.getMeasuredHeight();
                        int i12 = layoutParams.gravity;
                        if (i12 == -1) {
                            i12 = 51;
                        }
                        int i13 = i12 & 112;
                        int i14 = i12 & 7;
                        if (i14 != 1) {
                            if (i14 != 5) {
                                paddingLeft = getPaddingLeft() + layoutParams.leftMargin;
                            } else {
                                i8 = ((i6 - i4) - measuredWidth) - layoutParams.rightMargin;
                                paddingRight = getPaddingRight();
                            }
                            if (i13 != 16) {
                                if (i13 != 48) {
                                    paddingTop = layoutParams.topMargin + getPaddingTop();
                                } else if (i13 != 80) {
                                    paddingTop = layoutParams.topMargin;
                                } else {
                                    i9 = ((i7 - emojiPadding) - i5) - measuredHeight3;
                                    i10 = layoutParams.bottomMargin;
                                }
                                if (PhotoPickerSearchActivity.this.commentTextView != null && PhotoPickerSearchActivity.this.commentTextView.isPopupView(childAt)) {
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
                                i9 = ((((i7 - emojiPadding) - i5) - measuredHeight3) / 2) + layoutParams.topMargin;
                                i10 = layoutParams.bottomMargin;
                            }
                            paddingTop = i9 - i10;
                            if (PhotoPickerSearchActivity.this.commentTextView != null) {
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
                            i8 = (((i6 - i4) - measuredWidth) / 2) + layoutParams.leftMargin;
                            paddingRight = layoutParams.rightMargin;
                        }
                        paddingLeft = i8 - paddingRight;
                        if (i13 != 16) {
                            if (i13 != 48) {
                                paddingTop = layoutParams.topMargin + getPaddingTop();
                            } else if (i13 != 80) {
                                paddingTop = layoutParams.topMargin;
                            } else {
                                i9 = ((i7 - emojiPadding) - i5) - measuredHeight3;
                                i10 = layoutParams.bottomMargin;
                            }
                            if (PhotoPickerSearchActivity.this.commentTextView != null) {
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
                            i9 = ((((i7 - emojiPadding) - i5) - measuredHeight3) / 2) + layoutParams.topMargin;
                            i10 = layoutParams.bottomMargin;
                        }
                        paddingTop = i9 - i10;
                        if (PhotoPickerSearchActivity.this.commentTextView != null) {
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
            public void onMeasure(int i4, int i5) {
                int iMakeMeasureSpec;
                int measuredHeight;
                int i6;
                int childCount;
                int i7;
                View childAt;
                int size = View.MeasureSpec.getSize(i4);
                int size2 = View.MeasureSpec.getSize(i5);
                setMeasuredDimension(size, size2);
                measureChildWithMargins(((BaseFragment) PhotoPickerSearchActivity.this).actionBar, i4, 0, i5, 0);
                if (AndroidUtilities.dp(20.0f) >= 0) {
                    if (!AndroidUtilities.isInMultiwindow) {
                        size2 -= PhotoPickerSearchActivity.this.commentTextView.getEmojiPadding();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size2, 1073741824);
                    }
                    measuredHeight = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight();
                    this.globalIgnoreLayout = true;
                    for (i6 = 0; i6 < PhotoPickerSearchActivity.this.viewPages.length; i6++) {
                        if (PhotoPickerSearchActivity.this.viewPages[i6] != null && PhotoPickerSearchActivity.this.viewPages[i6].listView != null) {
                            PhotoPickerSearchActivity.this.viewPages[i6].listView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                        }
                    }
                    this.globalIgnoreLayout = false;
                    childCount = getChildCount();
                    for (i7 = 0; i7 < childCount; i7++) {
                        childAt = getChildAt(i7);
                        if (childAt == null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) PhotoPickerSearchActivity.this).actionBar) {
                            if (PhotoPickerSearchActivity.this.commentTextView == null || !PhotoPickerSearchActivity.this.commentTextView.isPopupView(childAt)) {
                                measureChildWithMargins(childAt, i4, 0, iMakeMeasureSpec, 0);
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
                PhotoPickerSearchActivity.this.commentTextView.hideEmojiView();
                this.globalIgnoreLayout = false;
                iMakeMeasureSpec = i5;
                measuredHeight = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getMeasuredHeight();
                this.globalIgnoreLayout = true;
                while (i6 < PhotoPickerSearchActivity.this.viewPages.length) {
                    if (PhotoPickerSearchActivity.this.viewPages[i6] != null) {
                        PhotoPickerSearchActivity.this.viewPages[i6].listView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f) + measuredHeight, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                    }
                }
                this.globalIgnoreLayout = false;
                childCount = getChildCount();
                while (i7 < childCount) {
                    childAt = getChildAt(i7);
                    if (childAt == null) {
                    }
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                float xVelocity;
                float yVelocity;
                float measuredWidth;
                if (((ActionBarLayout) ((BaseFragment) PhotoPickerSearchActivity.this).parentLayout).checkTransitionAnimation() || checkTabsAnimationInProgress()) {
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
                    int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
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
                    } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                        prepareForMoving(motionEvent, x < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    this.velocityTracker.computeCurrentVelocity(1000, PhotoPickerSearchActivity.this.maximumVelocity);
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
                        float x2 = PhotoPickerSearchActivity.this.viewPages[0].getX();
                        PhotoPickerSearchActivity.this.tabsAnimation = new AnimatorSet();
                        PhotoPickerSearchActivity.this.backAnimation = Math.abs(x2) < ((float) PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                        boolean z = PhotoPickerSearchActivity.this.backAnimation;
                        Property property = View.TRANSLATION_X;
                        if (z) {
                            measuredWidth = Math.abs(x2);
                            if (PhotoPickerSearchActivity.this.animatingForward) {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], (Property<ViewPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], (Property<ViewPage, Float>) property, PhotoPickerSearchActivity.this.viewPages[1].getMeasuredWidth()));
                            } else {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], (Property<ViewPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], (Property<ViewPage, Float>) property, -PhotoPickerSearchActivity.this.viewPages[1].getMeasuredWidth()));
                            }
                        } else {
                            measuredWidth = PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x2);
                            if (PhotoPickerSearchActivity.this.animatingForward) {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], (Property<ViewPage, Float>) property, -PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                            } else {
                                PhotoPickerSearchActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[0], (Property<ViewPage, Float>) property, PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(PhotoPickerSearchActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                            }
                        }
                        PhotoPickerSearchActivity.this.tabsAnimation.setInterpolator(PhotoPickerSearchActivity.interpolator);
                        int measuredWidth2 = getMeasuredWidth();
                        float f = measuredWidth2 / 2;
                        float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
                        float fAbs = Math.abs(xVelocity);
                        PhotoPickerSearchActivity.this.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
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

            @Override
            public void requestLayout() {
                if (this.globalIgnoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        this.imagesSearch.setParentFragment(this);
        EditTextEmoji editTextEmoji = this.imagesSearch.commentTextView;
        this.commentTextView = editTextEmoji;
        editTextEmoji.setSizeNotifierLayout(sizeNotifierFrameLayout);
        int i4 = 0;
        while (i4 < 4) {
            if (i4 == 0) {
                view = this.imagesSearch.frameLayout2;
            } else if (i4 != 1) {
                view = i4 != 2 ? this.imagesSearch.shadow : this.imagesSearch.selectedCountView;
            } else {
                view = this.imagesSearch.writeButtonContainer;
            }
            ((ViewGroup) view.getParent()).removeView(view);
            i4++;
        }
        PhotoPickerActivity photoPickerActivity = this.gifsSearch;
        PhotoPickerActivity photoPickerActivity2 = this.imagesSearch;
        photoPickerActivity.setLayoutViews(photoPickerActivity2.frameLayout2, photoPickerActivity2.writeButtonContainer, photoPickerActivity2.selectedCountView, photoPickerActivity2.shadow, photoPickerActivity2.commentTextView);
        this.gifsSearch.setParentFragment(this);
        int i5 = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i5 >= viewPageArr.length) {
                break;
            }
            viewPageArr[i5] = new ViewPage(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (PhotoPickerSearchActivity.this.tabsAnimationInProgress && PhotoPickerSearchActivity.this.viewPages[0] == this) {
                        PhotoPickerSearchActivity.this.scrollSlidingTextTabStrip.selectTabWithId(PhotoPickerSearchActivity.this.viewPages[1].selectedType, Math.abs(PhotoPickerSearchActivity.this.viewPages[0].getTranslationX()) / PhotoPickerSearchActivity.this.viewPages[0].getMeasuredWidth());
                    }
                }
            };
            sizeNotifierFrameLayout.addView(this.viewPages[i5], LayoutHelper.createFrame(-1, -1.0f));
            if (i5 == 0) {
                this.viewPages[i5].parentFragment = this.imagesSearch;
                this.viewPages[i5].listView = this.imagesSearch.getListView();
            } else if (i5 == 1) {
                this.viewPages[i5].parentFragment = this.gifsSearch;
                this.viewPages[i5].listView = this.gifsSearch.getListView();
                this.viewPages[i5].setVisibility(8);
            }
            this.viewPages[i5].listView.setScrollingTouchSlop(1);
            ViewPage viewPage = this.viewPages[i5];
            viewPage.fragmentView = (FrameLayout) viewPage.parentFragment.getFragmentView();
            this.viewPages[i5].listView.setClipToPadding(false);
            ViewPage viewPage2 = this.viewPages[i5];
            viewPage2.actionBar = viewPage2.parentFragment.getActionBar();
            ViewPage viewPage3 = this.viewPages[i5];
            viewPage3.addView(viewPage3.fragmentView, LayoutHelper.createFrame(-1, -1.0f));
            ViewPage viewPage4 = this.viewPages[i5];
            viewPage4.addView(viewPage4.actionBar, LayoutHelper.createFrame(-1, -2.0f));
            this.viewPages[i5].actionBar.setVisibility(8);
            final RecyclerView.OnScrollListener onScrollListener = this.viewPages[i5].listView.getOnScrollListener();
            this.viewPages[i5].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i6) {
                    onScrollListener.onScrollStateChanged(recyclerView, i6);
                    if (i6 != 1) {
                        int i7 = (int) (-((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY());
                        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                        if (i7 == 0 || i7 == currentActionBarHeight) {
                            return;
                        }
                        if (i7 < currentActionBarHeight / 2) {
                            PhotoPickerSearchActivity.this.viewPages[0].listView.smoothScrollBy(0, -i7);
                        } else {
                            PhotoPickerSearchActivity.this.viewPages[0].listView.smoothScrollBy(0, currentActionBarHeight - i7);
                        }
                    }
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                    onScrollListener.onScrolled(recyclerView, i6, i7);
                    if (recyclerView == PhotoPickerSearchActivity.this.viewPages[0].listView) {
                        float translationY = ((BaseFragment) PhotoPickerSearchActivity.this).actionBar.getTranslationY();
                        float f = translationY - i7;
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
            i5++;
        }
        sizeNotifierFrameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        sizeNotifierFrameLayout.addView(this.imagesSearch.frameLayout2, LayoutHelper.createFrame(-1, 48, 83));
        sizeNotifierFrameLayout.addView(this.imagesSearch.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 12.0f, 10.0f));
        sizeNotifierFrameLayout.addView(this.imagesSearch.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -2.0f, 9.0f));
        updateTabs();
        switchToCurrentSelectedMode(false);
        this.swipeBackEnabled = this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId();
        int color = Theme.getColor(null, Theme.key_dialogBackground, false);
        if (Build.VERSION.SDK_INT >= 23 && AndroidUtilities.computePerceivedBrightness(color) >= 0.721f) {
            View view2 = this.fragmentView;
            view2.setSystemUiVisibility(view2.getSystemUiVisibility() | 8192);
        }
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
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
    public void onResume() {
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

    public void setCaption(CharSequence charSequence) {
        PhotoPickerActivity photoPickerActivity = this.imagesSearch;
        if (photoPickerActivity != null) {
            photoPickerActivity.setCaption(charSequence);
        }
    }

    public void setDelegate(PhotoPickerActivity.PhotoPickerActivityDelegate photoPickerActivityDelegate) {
        this.imagesSearch.setDelegate(photoPickerActivityDelegate);
        this.gifsSearch.setDelegate(photoPickerActivityDelegate);
        this.imagesSearch.setSearchDelegate(new PhotoPickerActivity.PhotoPickerActivitySearchDelegate() {
            @Override
            public void shouldClearRecentSearch() {
                PhotoPickerSearchActivity.this.imagesSearch.clearRecentSearch();
                PhotoPickerSearchActivity.this.gifsSearch.clearRecentSearch();
            }

            @Override
            public void shouldSearchText(String str) {
                PhotoPickerSearchActivity.this.searchText(str);
            }
        });
        this.gifsSearch.setSearchDelegate(new PhotoPickerActivity.PhotoPickerActivitySearchDelegate() {
            @Override
            public void shouldClearRecentSearch() {
                PhotoPickerSearchActivity.this.imagesSearch.clearRecentSearch();
                PhotoPickerSearchActivity.this.gifsSearch.clearRecentSearch();
            }

            @Override
            public void shouldSearchText(String str) {
                PhotoPickerSearchActivity.this.searchText(str);
            }
        });
    }

    public void setMaxSelectedPhotos(int i, boolean z) {
        this.imagesSearch.setMaxSelectedPhotos(i, z);
        this.gifsSearch.setMaxSelectedPhotos(i, z);
    }
}
