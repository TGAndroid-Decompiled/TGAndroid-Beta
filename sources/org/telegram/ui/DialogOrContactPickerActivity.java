package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
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
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
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

public class DialogOrContactPickerActivity extends BaseFragment {
    private static final Interpolator interpolator = new DataUsageActivity$$ExternalSyntheticLambda1(1);
    private static final int search_button = 0;
    private boolean animatingForward;
    private boolean backAnimation;
    private Paint backgroundPaint;
    private ContactsActivity contactsActivity;
    private DialogsActivity dialogsActivity;
    private int maximumVelocity;
    private ScrollSlidingTextTabStrip scrollSlidingTextTabStrip;
    private ActionBarMenuItem searchItem;
    private boolean swipeBackEnabled;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private ViewPage[] viewPages;

    public static class ViewPage extends FrameLayout {
        private ActionBar actionBar;
        private FrameLayout fragmentView;
        private RecyclerListView listView;
        private RecyclerListView listView2;
        private BaseFragment parentFragment;
        private int selectedType;

        public ViewPage(Context context) {
            super(context);
        }
    }

    public DialogOrContactPickerActivity() {
        super(null);
        this.backgroundPaint = new Paint();
        this.viewPages = new ViewPage[2];
        this.swipeBackEnabled = true;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("checkCanWrite", false);
        bundle.putBoolean("resetDelegate", false);
        bundle.putInt("dialogsType", 9);
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        this.dialogsActivity = dialogsActivity;
        dialogsActivity.setDelegate(new PhotoViewer$$ExternalSyntheticLambda96(this, 4));
        this.dialogsActivity.onFragmentCreate();
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
        contactsActivity.setDelegate(new BoostsActivity$$ExternalSyntheticLambda4(this, 17));
        this.contactsActivity.onFragmentCreate();
    }

    public boolean lambda$new$1(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        if (arrayList.isEmpty()) {
            return true;
        }
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (!DialogObject.isUserDialog(j)) {
            return true;
        }
        showBlockAlert(getMessagesController().getUser(Long.valueOf(j)));
        return true;
    }

    public void lambda$new$2(TLRPC.User user, String str, ContactsActivity contactsActivity) {
        showBlockAlert(user);
    }

    public void lambda$showBlockAlert$3(TLRPC.User user, AlertDialog alertDialog, int i) {
        if (MessagesController.isSupportUser(user)) {
            AlertsCreator.showSimpleToast(this, LocaleController.getString(R.string.ErrorOccurred));
        } else {
            MessagesController.getInstance(this.currentAccount).blockPeer(user.id);
            AlertsCreator.showSimpleToast(this, LocaleController.getString(R.string.UserBlocked));
        }
        finishFragment();
    }

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void setScrollY(float f) {
        this.actionBar.setTranslationY(f);
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                this.fragmentView.invalidate();
                return;
            }
            int i2 = (int) f;
            viewPageArr[i].listView.setPinnedSectionOffsetY(i2);
            if (this.viewPages[i].listView2 != null) {
                this.viewPages[i].listView2.setPinnedSectionOffsetY(i2);
            }
            i++;
        }
    }

    private void showBlockAlert(TLRPC.User user) {
        if (user == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.BlockUser));
        SendMessagesHelper$$ExternalSyntheticOutline0.m("AreYouSureBlockContact2", R.string.AreYouSureBlockContact2, new Object[]{ContactsController.formatName(user.first_name, user.last_name)}, builder);
        builder.setPositiveButton(LocaleController.getString(R.string.BlockContact), new DialogsActivity$$ExternalSyntheticLambda6(7, this, user));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void switchToCurrentSelectedMode(boolean z) {
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                break;
            }
            viewPageArr[i].listView.stopScroll();
            if (this.viewPages[i].listView2 != null) {
                this.viewPages[i].listView2.stopScroll();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < 2) {
            RecyclerListView recyclerListView = i2 == 0 ? this.viewPages[z ? 1 : 0].listView : this.viewPages[z ? 1 : 0].listView2;
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

    private void updateTabs() {
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStrip == null) {
            return;
        }
        scrollSlidingTextTabStrip.addTextTab(0, LocaleController.getString(R.string.BlockUserChatsTitle));
        this.scrollSlidingTextTabStrip.addTextTab(1, LocaleController.getString(R.string.BlockUserContactsTitle));
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
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    DialogOrContactPickerActivity.this.finishFragment();
                }
            }
        });
        this.hasOwnBackground = true;
        ActionBarMenuItem actionBarMenuItemSearchListener = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                DialogOrContactPickerActivity.this.dialogsActivity.getActionBar().closeSearchField(false);
                DialogOrContactPickerActivity.this.contactsActivity.getActionBar().closeSearchField(false);
            }

            @Override
            public void onSearchExpand() {
                DialogOrContactPickerActivity.this.dialogsActivity.getActionBar().openSearchField("", false);
                DialogOrContactPickerActivity.this.contactsActivity.getActionBar().openSearchField("", false);
                DialogOrContactPickerActivity.this.searchItem.getSearchField().requestFocus();
            }

            @Override
            public void onTextChanged(EditText editText) {
                DialogOrContactPickerActivity.this.dialogsActivity.getActionBar().setSearchFieldText(editText.getText().toString());
                DialogOrContactPickerActivity.this.contactsActivity.getActionBar().setSearchFieldText(editText.getText().toString());
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.Search));
        ScrollSlidingTextTabStrip scrollSlidingTextTabStrip = new ScrollSlidingTextTabStrip(context);
        this.scrollSlidingTextTabStrip = scrollSlidingTextTabStrip;
        scrollSlidingTextTabStrip.setUseSameWidth(true);
        this.actionBar.addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 44, 83));
        this.scrollSlidingTextTabStrip.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public final boolean canReorder(int i) {
                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$canReorder(this, i);
            }

            @Override
            public void onPageScrolled(float f) {
                if (f != 1.0f || DialogOrContactPickerActivity.this.viewPages[1].getVisibility() == 0) {
                    if (DialogOrContactPickerActivity.this.animatingForward) {
                        DialogOrContactPickerActivity.this.viewPages[0].setTranslationX((-f) * DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                        DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() - (f * DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth()));
                    } else {
                        DialogOrContactPickerActivity.this.viewPages[0].setTranslationX(DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() * f);
                        DialogOrContactPickerActivity.this.viewPages[1].setTranslationX((f * DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth()) - DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                    }
                    if (f == 1.0f) {
                        ViewPage viewPage = DialogOrContactPickerActivity.this.viewPages[0];
                        DialogOrContactPickerActivity.this.viewPages[0] = DialogOrContactPickerActivity.this.viewPages[1];
                        DialogOrContactPickerActivity.this.viewPages[1] = viewPage;
                        DialogOrContactPickerActivity.this.viewPages[1].setVisibility(8);
                    }
                }
            }

            @Override
            public void onPageSelected(int i, boolean z) {
                if (DialogOrContactPickerActivity.this.viewPages[0].selectedType == i) {
                    return;
                }
                DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
                dialogOrContactPickerActivity.swipeBackEnabled = i == dialogOrContactPickerActivity.scrollSlidingTextTabStrip.getFirstTabId();
                DialogOrContactPickerActivity.this.viewPages[1].selectedType = i;
                DialogOrContactPickerActivity.this.viewPages[1].setVisibility(0);
                DialogOrContactPickerActivity.this.switchToCurrentSelectedMode(true);
                DialogOrContactPickerActivity.this.animatingForward = z;
            }

            @Override
            public final void onSamePageSelected() {
                ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$onSamePageSelected(this);
            }

            @Override
            public final boolean showOptions(int i, View view) {
                return ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate.CC.$default$showOptions(this, i, view);
            }
        });
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean globalIgnoreLayout;
            private boolean maybeStartTracking;
            private boolean startedTracking;
            private int startedTrackingPointerId;
            private int startedTrackingX;
            private int startedTrackingY;
            private VelocityTracker velocityTracker;

            private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
                int nextPageId = DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.getNextPageId(z);
                if (nextPageId < 0) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                this.maybeStartTracking = false;
                this.startedTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.setEnabled(false);
                DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.setEnabled(false);
                DialogOrContactPickerActivity.this.viewPages[1].selectedType = nextPageId;
                DialogOrContactPickerActivity.this.viewPages[1].setVisibility(0);
                DialogOrContactPickerActivity.this.animatingForward = z;
                DialogOrContactPickerActivity.this.switchToCurrentSelectedMode(true);
                if (z) {
                    DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                } else {
                    DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(-DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                }
                return true;
            }

            public boolean checkTabsAnimationInProgress() {
                if (!DialogOrContactPickerActivity.this.tabsAnimationInProgress) {
                    return false;
                }
                if (DialogOrContactPickerActivity.this.backAnimation) {
                    if (Math.abs(DialogOrContactPickerActivity.this.viewPages[0].getTranslationX()) < 1.0f) {
                        DialogOrContactPickerActivity.this.viewPages[0].setTranslationX(0.0f);
                        DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() * (DialogOrContactPickerActivity.this.animatingForward ? 1 : -1));
                        if (DialogOrContactPickerActivity.this.tabsAnimation != null) {
                            DialogOrContactPickerActivity.this.tabsAnimation.cancel();
                            DialogOrContactPickerActivity.this.tabsAnimation = null;
                        }
                        DialogOrContactPickerActivity.this.tabsAnimationInProgress = false;
                    }
                } else if (Math.abs(DialogOrContactPickerActivity.this.viewPages[1].getTranslationX()) < 1.0f) {
                    DialogOrContactPickerActivity.this.viewPages[0].setTranslationX(DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() * (DialogOrContactPickerActivity.this.animatingForward ? -1 : 1));
                    DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(0.0f);
                    if (DialogOrContactPickerActivity.this.tabsAnimation != null) {
                        DialogOrContactPickerActivity.this.tabsAnimation.cancel();
                        DialogOrContactPickerActivity.this.tabsAnimation = null;
                    }
                    DialogOrContactPickerActivity.this.tabsAnimationInProgress = false;
                }
                return DialogOrContactPickerActivity.this.tabsAnimationInProgress;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (((BaseFragment) DialogOrContactPickerActivity.this).parentLayout != null) {
                    INavigationLayout iNavigationLayout2 = ((BaseFragment) DialogOrContactPickerActivity.this).parentLayout;
                    int measuredHeight = ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getTranslationY());
                    iNavigationLayout2.getClass();
                    ((ActionBarLayout) iNavigationLayout2).drawHeaderShadow(canvas, 255, measuredHeight);
                }
            }

            @Override
            public void forceHasOverlappingRendering(boolean z) {
                super.forceHasOverlappingRendering(z);
            }

            @Override
            public void onDraw(Canvas canvas) {
                DialogOrContactPickerActivity.this.backgroundPaint.setColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                canvas.drawRect(0.0f, ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getTranslationY() + ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight(), DialogOrContactPickerActivity.this.backgroundPaint);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return checkTabsAnimationInProgress() || DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
            }

            @Override
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                AnonymousClass4 anonymousClass4 = this;
                anonymousClass4.measureChildWithMargins(((BaseFragment) DialogOrContactPickerActivity.this).actionBar, i, 0, i2, 0);
                int measuredHeight = ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getMeasuredHeight();
                anonymousClass4.globalIgnoreLayout = true;
                int i3 = 0;
                for (int i4 = 0; i4 < DialogOrContactPickerActivity.this.viewPages.length; i4++) {
                    if (DialogOrContactPickerActivity.this.viewPages[i4] != null) {
                        if (DialogOrContactPickerActivity.this.viewPages[i4].listView != null) {
                            DialogOrContactPickerActivity.this.viewPages[i4].listView.setPadding(0, measuredHeight, 0, 0);
                        }
                        if (DialogOrContactPickerActivity.this.viewPages[i4].listView2 != null) {
                            DialogOrContactPickerActivity.this.viewPages[i4].listView2.setPadding(0, measuredHeight, 0, 0);
                        }
                    }
                }
                anonymousClass4.globalIgnoreLayout = false;
                int childCount = getChildCount();
                while (i3 < childCount) {
                    View childAt = getChildAt(i3);
                    if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) DialogOrContactPickerActivity.this).actionBar) {
                        anonymousClass4.measureChildWithMargins(childAt, i, 0, i2, 0);
                    }
                    i3++;
                    anonymousClass4 = this;
                }
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                float xVelocity;
                float yVelocity;
                float measuredWidth;
                if (((ActionBarLayout) ((BaseFragment) DialogOrContactPickerActivity.this).parentLayout).checkTransitionAnimation() || checkTabsAnimationInProgress()) {
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
                    if (this.startedTracking && ((DialogOrContactPickerActivity.this.animatingForward && x > 0) || (!DialogOrContactPickerActivity.this.animatingForward && x < 0))) {
                        if (!prepareForMoving(motionEvent, x < 0)) {
                            this.maybeStartTracking = true;
                            this.startedTracking = false;
                            DialogOrContactPickerActivity.this.viewPages[0].setTranslationX(0.0f);
                            DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(DialogOrContactPickerActivity.this.animatingForward ? DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() : -DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                            DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DialogOrContactPickerActivity.this.viewPages[1].selectedType, 0.0f);
                        }
                    }
                    if (!this.maybeStartTracking || this.startedTracking) {
                        if (this.startedTracking) {
                            DialogOrContactPickerActivity.this.viewPages[0].setTranslationX(x);
                            if (DialogOrContactPickerActivity.this.animatingForward) {
                                DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() + x);
                            } else {
                                DialogOrContactPickerActivity.this.viewPages[1].setTranslationX(x - DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                            }
                            DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DialogOrContactPickerActivity.this.viewPages[1].selectedType, Math.abs(x) / DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                        }
                    } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                        prepareForMoving(motionEvent, x < 0);
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    this.velocityTracker.computeCurrentVelocity(1000, DialogOrContactPickerActivity.this.maximumVelocity);
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
                        float x2 = DialogOrContactPickerActivity.this.viewPages[0].getX();
                        DialogOrContactPickerActivity.this.tabsAnimation = new AnimatorSet();
                        DialogOrContactPickerActivity.this.backAnimation = Math.abs(x2) < ((float) DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                        boolean z = DialogOrContactPickerActivity.this.backAnimation;
                        Property property = View.TRANSLATION_X;
                        if (z) {
                            measuredWidth = Math.abs(x2);
                            if (DialogOrContactPickerActivity.this.animatingForward) {
                                DialogOrContactPickerActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[0], (Property<ViewPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[1], (Property<ViewPage, Float>) property, DialogOrContactPickerActivity.this.viewPages[1].getMeasuredWidth()));
                            } else {
                                DialogOrContactPickerActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[0], (Property<ViewPage, Float>) property, 0.0f), ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[1], (Property<ViewPage, Float>) property, -DialogOrContactPickerActivity.this.viewPages[1].getMeasuredWidth()));
                            }
                        } else {
                            measuredWidth = DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x2);
                            if (DialogOrContactPickerActivity.this.animatingForward) {
                                DialogOrContactPickerActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[0], (Property<ViewPage, Float>) property, -DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                            } else {
                                DialogOrContactPickerActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[0], (Property<ViewPage, Float>) property, DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogOrContactPickerActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                            }
                        }
                        DialogOrContactPickerActivity.this.tabsAnimation.setInterpolator(DialogOrContactPickerActivity.interpolator);
                        int measuredWidth2 = getMeasuredWidth();
                        float f = measuredWidth2 / 2;
                        float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
                        float fAbs = Math.abs(xVelocity);
                        DialogOrContactPickerActivity.this.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
                        DialogOrContactPickerActivity.this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                DialogOrContactPickerActivity.this.tabsAnimation = null;
                                if (DialogOrContactPickerActivity.this.backAnimation) {
                                    DialogOrContactPickerActivity.this.viewPages[1].setVisibility(8);
                                } else {
                                    ViewPage viewPage = DialogOrContactPickerActivity.this.viewPages[0];
                                    DialogOrContactPickerActivity.this.viewPages[0] = DialogOrContactPickerActivity.this.viewPages[1];
                                    DialogOrContactPickerActivity.this.viewPages[1] = viewPage;
                                    DialogOrContactPickerActivity.this.viewPages[1].setVisibility(8);
                                    DialogOrContactPickerActivity dialogOrContactPickerActivity = DialogOrContactPickerActivity.this;
                                    dialogOrContactPickerActivity.swipeBackEnabled = dialogOrContactPickerActivity.viewPages[0].selectedType == DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.getFirstTabId();
                                    DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DialogOrContactPickerActivity.this.viewPages[0].selectedType, 1.0f);
                                }
                                DialogOrContactPickerActivity.this.tabsAnimationInProgress = false;
                                AnonymousClass4.this.maybeStartTracking = false;
                                AnonymousClass4.this.startedTracking = false;
                                ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.setEnabled(true);
                                DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.setEnabled(true);
                            }
                        });
                        DialogOrContactPickerActivity.this.tabsAnimation.start();
                        DialogOrContactPickerActivity.this.tabsAnimationInProgress = true;
                        this.startedTracking = false;
                    } else {
                        this.maybeStartTracking = false;
                        ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.setEnabled(true);
                        DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.setEnabled(true);
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
        this.fragmentView = frameLayout;
        frameLayout.setWillNotDraw(false);
        this.dialogsActivity.setParentFragment(this);
        this.contactsActivity.setParentFragment(this);
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                break;
            }
            viewPageArr[i] = new ViewPage(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (DialogOrContactPickerActivity.this.tabsAnimationInProgress && DialogOrContactPickerActivity.this.viewPages[0] == this) {
                        DialogOrContactPickerActivity.this.scrollSlidingTextTabStrip.selectTabWithId(DialogOrContactPickerActivity.this.viewPages[1].selectedType, Math.abs(DialogOrContactPickerActivity.this.viewPages[0].getTranslationX()) / DialogOrContactPickerActivity.this.viewPages[0].getMeasuredWidth());
                    }
                }
            };
            frameLayout.addView(this.viewPages[i], LayoutHelper.createFrame(-1, -1.0f));
            if (i == 0) {
                this.viewPages[i].parentFragment = this.dialogsActivity;
                this.viewPages[i].listView = this.dialogsActivity.getListView();
                this.viewPages[i].listView2 = this.dialogsActivity.getSearchListView();
            } else if (i == 1) {
                this.viewPages[i].parentFragment = this.contactsActivity;
                this.viewPages[i].listView = this.contactsActivity.getListView();
                this.viewPages[i].setVisibility(8);
            }
            this.viewPages[i].listView.setScrollingTouchSlop(1);
            ViewPage viewPage = this.viewPages[i];
            viewPage.fragmentView = (FrameLayout) viewPage.parentFragment.getFragmentView();
            ViewPage viewPage2 = this.viewPages[i];
            viewPage2.actionBar = viewPage2.parentFragment.getActionBar();
            ViewPage viewPage3 = this.viewPages[i];
            viewPage3.addView(viewPage3.fragmentView, LayoutHelper.createFrame(-1, -1.0f));
            AndroidUtilities.removeFromParent(this.viewPages[i].actionBar);
            ViewPage viewPage4 = this.viewPages[i];
            viewPage4.addView(viewPage4.actionBar, LayoutHelper.createFrame(-1, -2.0f));
            this.viewPages[i].actionBar.setVisibility(8);
            int i2 = 0;
            while (i2 < 2) {
                RecyclerListView recyclerListView = i2 == 0 ? this.viewPages[i].listView : this.viewPages[i].listView2;
                if (recyclerListView != null) {
                    recyclerListView.setClipToPadding(false);
                    final RecyclerView.OnScrollListener onScrollListener = recyclerListView.getOnScrollListener();
                    recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                        @Override
                        public void onScrollStateChanged(RecyclerView recyclerView, int i3) {
                            onScrollListener.onScrollStateChanged(recyclerView, i3);
                            if (i3 != 1) {
                                int i4 = (int) (-((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getTranslationY());
                                int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
                                if (i4 == 0 || i4 == currentActionBarHeight) {
                                    return;
                                }
                                if (i4 < currentActionBarHeight / 2) {
                                    int i5 = -i4;
                                    DialogOrContactPickerActivity.this.viewPages[0].listView.smoothScrollBy(0, i5);
                                    if (DialogOrContactPickerActivity.this.viewPages[0].listView2 != null) {
                                        DialogOrContactPickerActivity.this.viewPages[0].listView2.smoothScrollBy(0, i5);
                                        return;
                                    }
                                    return;
                                }
                                int i6 = currentActionBarHeight - i4;
                                DialogOrContactPickerActivity.this.viewPages[0].listView.smoothScrollBy(0, i6);
                                if (DialogOrContactPickerActivity.this.viewPages[0].listView2 != null) {
                                    DialogOrContactPickerActivity.this.viewPages[0].listView2.smoothScrollBy(0, i6);
                                }
                            }
                        }

                        @Override
                        public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                            onScrollListener.onScrolled(recyclerView, i3, i4);
                            if (recyclerView == DialogOrContactPickerActivity.this.viewPages[0].listView || recyclerView == DialogOrContactPickerActivity.this.viewPages[0].listView2) {
                                float translationY = ((BaseFragment) DialogOrContactPickerActivity.this).actionBar.getTranslationY();
                                float f = translationY - i4;
                                if (f < (-ActionBar.getCurrentActionBarHeight())) {
                                    f = -ActionBar.getCurrentActionBarHeight();
                                } else if (f > 0.0f) {
                                    f = 0.0f;
                                }
                                if (f != translationY) {
                                    DialogOrContactPickerActivity.this.setScrollY(f);
                                }
                            }
                        }
                    });
                }
                i2++;
            }
            i++;
        }
        frameLayout.addView(this.actionBar, LayoutHelper.createFrame(-1, -2.0f));
        updateTabs();
        switchToCurrentSelectedMode(false);
        this.swipeBackEnabled = this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId();
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    @Override
    public void onFragmentDestroy() {
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
    public void onPause() {
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
    public void onResume() {
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
}
