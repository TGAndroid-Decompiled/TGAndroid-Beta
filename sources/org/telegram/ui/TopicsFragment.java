package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzkm;
import com.google.android.gms.internal.mlkit_vision_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline0;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.TextureRenderer$$ExternalSyntheticOutline0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Business.TimezoneSelector;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityInterface;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogsActivityTopPanelLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchDownloadsContainer;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UniversalFragment;
import org.telegram.ui.Components.UnreadCounterTextView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.SelfStoryViewsPage;
import org.telegram.ui.Stories.SelfStoryViewsView;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class TopicsFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ChatActivityInterface, MainTabsActivity.TabFragmentDelegate {
    public static final HashSet settingsPreloaded = new HashSet();
    public final Adapter adapter;
    public ActionBarMenuSubItem addMemberSubMenu;
    public int additionFloatingButtonOffset;
    public int additionNavigationBarHeight;
    public boolean animateSearchWithScale;
    public boolean animatedUpdateEnabled;
    public ChatAvatarContainer avatarContainer;
    public AnonymousClass18 blurredView;
    public ActionBarMenuSubItem boostGroupSubmenu;
    public TL_stories.TL_premium_boostsStatus boostsStatus;
    public int bottomButtonType;
    public UnreadCounterTextView bottomOverlayChatText;
    public AnonymousClass14 bottomOverlayContainer;
    public RadialProgressView bottomOverlayProgress;
    public boolean bottomPannelVisible;
    public boolean canShowCreateTopic;
    public boolean canShowHiddenArchive;
    public final boolean canShowProgress;
    public TLRPC.ChatFull chatFull;
    public final long chatId;
    public ImageView closeReportSpam;
    public ActionBarMenuSubItem closeTopic;
    public AnonymousClass1 contentView;
    public ActionBarMenuSubItem createTopicSubmenu;
    public ActionBarMenuSubItem deleteChatSubmenu;
    public ActionBarMenuItem deleteItem;
    public DialogsActivity dialogsActivity;
    public Adapter.AnonymousClass1 emptyView;
    public EmptyViewContainer emptyViewContainer;
    public HashSet excludeTopics;
    public boolean finishDialogRightSlidingPreviewOnTransitionEnd;
    public FragmentFloatingButton floatingButton;
    public final ArrayList forumTopics;
    public AnonymousClass17 fragmentContextView;
    public FrameLayout fragmentContextViewWrapper;
    public LoginActivity.AnonymousClass4 fullscreenView;
    public TopicDialogCell generalTopicViewMoving;
    public ChatObject.Call groupCall;
    public int hiddenCount;
    public boolean hiddenShown;
    public ActionBarMenuItem hideItem;
    public ViewGroupPartRenderer iBlur3Capture;
    public final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    public final RectF iBlur3PositionActionBar;
    public final RectF iBlur3PositionMainTabs;
    public final ArrayList iBlur3Positions;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    public final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    public boolean isSlideBackTransition;
    public AnonymousClass7 itemAnimator;
    public AnonymousClass12 itemTouchHelper;
    public TouchHelperCallback itemTouchHelperCallback;
    public RecyclerItemsEnterAnimator itemsEnterAnimator;
    public int lastItemsCount;
    public AnonymousClass10 layoutManager;
    public boolean loadingTopics;
    public boolean mute;
    public ActionBarMenuItem muteItem;
    public int navigationBarHeight;
    public final AnimationNotificationsLocker notificationsLocker;
    public TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda0 onTopicSelectedListener;
    public boolean openVideoChat;
    public final boolean openedForBotShare;
    public final boolean openedForForward;
    public final boolean openedForQuote;
    public final boolean openedForReply;
    public final boolean openedForSelect;
    public ActionBarMenuItem other;
    public ActionBarMenuItem otherItem;
    public DialogsActivity parentDialogsActivity;
    public ChatActivityMemberRequestsDelegate pendingRequestsDelegate;
    public ActionBarMenuItem pinItem;
    public AnonymousClass6 pullForegroundDrawable;
    public int pullViewState;
    public ActionBarMenuSubItem readItem;
    public AnonymousClass5 recyclerListView;
    public boolean removeFragmentOnTransitionEnd;
    public boolean reordering;
    public ActionBarMenuSubItem reportSubmenu;
    public ActionBarMenuSubItem restartTopic;
    public boolean scrollToTop;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public float searchAnimationProgress;
    public ValueAnimator searchAnimator;
    public MessagesSearchContainer searchContainer;
    public ActionBarMenuItem searchItem;
    public ViewPagerFixed.AnonymousClass3 searchTabsView;
    public boolean searching;
    public NumberTextView selectedDialogsCountTextView;
    public long selectedTopicForTablet;
    public final HashSet selectedTopics;
    public ActionBarMenuItem showItem;
    public float slideFragmentProgress;
    public long startArchivePullingTime;
    public DialogsActivityTopPanelLayout topPanelLayout;
    public final TopicsController topicsController;
    public AnonymousClass13 topicsEmptyView;
    public float transitionPadding;
    public ActionBarMenuItem unpinItem;
    public boolean updateAnimated;
    public String voiceChatHash;

    public final class AnonymousClass1 extends SizeNotifierFrameLayout {
        public final Paint actionBarPaint;
        public boolean ignoreLayout;

        public AnonymousClass1(Context context) {
            super(context, null);
            setWillNotDraw(false);
            this.actionBarPaint = new Paint();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            Canvas canvas2;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
            int i = Build.VERSION.SDK_INT;
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (i >= 31 && (downscaleScrollableNoiseSuppressor = topicsFragment.scrollableViewNoiseSuppressor) != null) {
                topicsFragment.blur3_InvalidateBlur$11();
                DialogsActivity dialogsActivity = topicsFragment.parentDialogsActivity;
                int measuredWidth = dialogsActivity != null ? dialogsActivity.fragmentView.getMeasuredWidth() : getMeasuredWidth();
                DialogsActivity dialogsActivity2 = topicsFragment.parentDialogsActivity;
                int measuredHeight = dialogsActivity2 != null ? dialogsActivity2.fragmentView.getMeasuredHeight() : getMeasuredHeight();
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = topicsFragment.iBlur3SourceGlassFrosted;
                if (blurredBackgroundSourceRenderNode != null && !blurredBackgroundSourceRenderNode.inRecording && blurredBackgroundSourceRenderNode.needUpdateDisplayList(measuredWidth, measuredHeight)) {
                    downscaleScrollableNoiseSuppressor.draw(blurredBackgroundSourceRenderNode.beginRecording(measuredWidth, measuredHeight), -3);
                    blurredBackgroundSourceRenderNode.endRecording();
                }
                BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = topicsFragment.iBlur3SourceGlass;
                if (blurredBackgroundSourceRenderNode2 != null && !blurredBackgroundSourceRenderNode2.inRecording && blurredBackgroundSourceRenderNode2.needUpdateDisplayList(measuredWidth, measuredHeight)) {
                    downscaleScrollableNoiseSuppressor.draw(blurredBackgroundSourceRenderNode2.beginRecording(measuredWidth, measuredHeight), -2);
                    blurredBackgroundSourceRenderNode2.endRecording();
                }
            }
            super.dispatchDraw(canvas);
            if (topicsFragment.isInPreviewMode()) {
                Paint paint = this.actionBarPaint;
                paint.setColor(topicsFragment.getThemedColor(Theme.key_windowBackgroundWhite));
                paint.setAlpha((int) (topicsFragment.searchAnimationProgress * 255.0f));
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, paint);
                canvas2.drawLine(0.0f, 0.0f, 0.0f, getHeight(), Theme.dividerPaint);
            } else {
                canvas2 = canvas;
            }
            if (topicsFragment.parentDialogsActivity == null) {
                AndroidUtilities.drawNavigationBarProtection(canvas2, this, topicsFragment.getThemedColor(Theme.key_windowBackgroundWhite), topicsFragment.navigationBarHeight);
            }
        }

        @Override
        public final void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
            if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled()) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (topicsFragment.iBlur3SourceGlassFrosted != null) {
                    canvas.save();
                    canvas.translate(0.0f, -f);
                    topicsFragment.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                    canvas.restore();
                    int alpha = paint.getAlpha();
                    paint.setAlpha(178);
                    canvas.drawRect(rect, paint);
                    paint.setAlpha(alpha);
                    return;
                }
            }
            canvas.drawRect(rect, paint);
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (view == ((BaseFragment) topicsFragment).actionBar && !topicsFragment.isInPreviewMode()) {
                float y = ((BaseFragment) topicsFragment).actionBar.getY();
                float height = ((BaseFragment) topicsFragment).actionBar.getHeight();
                ViewPagerFixed.AnonymousClass3 anonymousClass3 = topicsFragment.searchTabsView;
                int measuredHeight = (int) (y + ((int) ((((anonymousClass3 == null || anonymousClass3.getVisibility() == 8) ? 0.0f : topicsFragment.searchTabsView.getMeasuredHeight()) * topicsFragment.searchAnimationProgress) + height)));
                ((ActionBarLayout) topicsFragment.getParentLayout()).drawHeaderShadow(canvas, (int) ((1.0f - topicsFragment.searchAnimationProgress) * 255.0f), measuredHeight);
                float f = topicsFragment.searchAnimationProgress;
                if (f > 0.0f) {
                    if (f < 1.0f) {
                        int alpha = Theme.dividerPaint.getAlpha();
                        Theme.dividerPaint.setAlpha((int) (alpha * topicsFragment.searchAnimationProgress));
                        float f2 = measuredHeight;
                        canvas.drawLine(0.0f, f2, getMeasuredWidth(), f2, Theme.dividerPaint);
                        Theme.dividerPaint.setAlpha(alpha);
                    } else {
                        float f3 = measuredHeight;
                        canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, Theme.dividerPaint);
                    }
                }
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void drawList(Canvas canvas, ArrayList arrayList) {
            int i = 0;
            while (true) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (i >= topicsFragment.recyclerListView.getChildCount()) {
                    return;
                }
                View childAt = topicsFragment.recyclerListView.getChildAt(i);
                if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                    int iSave = canvas.save();
                    canvas.translate(childAt.getX() + topicsFragment.recyclerListView.getX(), childAt.getY() + topicsFragment.recyclerListView.getY() + getY());
                    if (arrayList != null && (childAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback)) {
                        arrayList.add((SizeNotifierFrameLayout.IViewWithInvalidateCallback) childAt);
                    }
                    childAt.draw(canvas);
                    canvas.restoreToCount(iSave);
                }
                i++;
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int measuredHeight;
            TopicsFragment topicsFragment;
            int childCount = getChildCount();
            int paddingLeft = getPaddingLeft();
            int paddingRight = (i3 - i) - getPaddingRight();
            int paddingTop = getPaddingTop();
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight2 = childAt.getMeasuredHeight();
                    int i11 = layoutParams.gravity;
                    if (i11 == -1) {
                        i11 = 0;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i11, getLayoutDirection());
                    int i12 = i11 & 112;
                    int i13 = absoluteGravity & 7;
                    if (i13 != 1) {
                        if (i13 != 5) {
                            i7 = layoutParams.leftMargin + paddingLeft;
                        } else {
                            i5 = paddingRight - measuredWidth;
                            i6 = layoutParams.rightMargin;
                        }
                        if (i12 != 16) {
                            if (i12 != 80) {
                                measuredHeight = layoutParams.topMargin + paddingTop;
                                if (!(childAt instanceof ActionBar)) {
                                    topicsFragment = TopicsFragment.this;
                                    if (!topicsFragment.isInPreviewMode()) {
                                        measuredHeight += ((BaseFragment) topicsFragment).actionBar.getMeasuredHeight() + ((BaseFragment) topicsFragment).actionBar.getTop();
                                    }
                                }
                            } else {
                                i8 = paddingBottom - measuredHeight2;
                                i9 = layoutParams.bottomMargin;
                            }
                            childAt.layout(i7, measuredHeight, measuredWidth + i7, measuredHeight2 + measuredHeight);
                        } else {
                            i8 = (((paddingBottom - paddingTop) - measuredHeight2) / 2) + paddingTop + layoutParams.topMargin;
                            i9 = layoutParams.bottomMargin;
                        }
                        measuredHeight = i8 - i9;
                        childAt.layout(i7, measuredHeight, measuredWidth + i7, measuredHeight2 + measuredHeight);
                    } else {
                        i5 = (((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft + layoutParams.leftMargin;
                        i6 = layoutParams.rightMargin;
                    }
                    i7 = i5 - i6;
                    if (i12 != 16) {
                        if (i12 != 80) {
                            measuredHeight = layoutParams.topMargin + paddingTop;
                            if (!(childAt instanceof ActionBar)) {
                                topicsFragment = TopicsFragment.this;
                                if (!topicsFragment.isInPreviewMode()) {
                                    measuredHeight += ((BaseFragment) topicsFragment).actionBar.getMeasuredHeight() + ((BaseFragment) topicsFragment).actionBar.getTop();
                                }
                            }
                        } else {
                            i8 = paddingBottom - measuredHeight2;
                            i9 = layoutParams.bottomMargin;
                        }
                        childAt.layout(i7, measuredHeight, measuredWidth + i7, measuredHeight2 + measuredHeight);
                    } else {
                        i8 = (((paddingBottom - paddingTop) - measuredHeight2) / 2) + paddingTop + layoutParams.topMargin;
                        i9 = layoutParams.bottomMargin;
                    }
                    measuredHeight = i8 - i9;
                    childAt.layout(i7, measuredHeight, measuredWidth + i7, measuredHeight2 + measuredHeight);
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3;
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            TopicsFragment topicsFragment = TopicsFragment.this;
            AnonymousClass14 anonymousClass14 = topicsFragment.bottomOverlayContainer;
            if (anonymousClass14 != null) {
                this.ignoreLayout = true;
                ViewGroup.LayoutParams layoutParams = anonymousClass14.getLayoutParams();
                int iDp = AndroidUtilities.dp(51.0f);
                int i4 = topicsFragment.navigationBarHeight;
                layoutParams.height = iDp + i4;
                topicsFragment.bottomOverlayContainer.setPadding(0, 0, 0, i4);
                this.ignoreLayout = false;
            }
            int measuredHeight = 0;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                if (childAt instanceof ActionBar) {
                    childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                    measuredHeight = childAt.getMeasuredHeight();
                }
            }
            int i6 = 0;
            while (i6 < getChildCount()) {
                View childAt2 = getChildAt(i6);
                if (childAt2 instanceof ActionBar) {
                    i3 = measuredHeight;
                } else if (childAt2.getFitsSystemWindows()) {
                    measureChildWithMargins(childAt2, i, 0, i2, 0);
                    i3 = measuredHeight;
                } else {
                    i3 = measuredHeight;
                    measureChildWithMargins(childAt2, i, 0, i2, i3);
                }
                i6++;
                measuredHeight = i3;
            }
            setMeasuredDimension(size, size2);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final class AnonymousClass10 extends LinearLayoutManager {
        public boolean fixOffset;

        public AnonymousClass10() {
            super(1, false);
        }

        @Override
        public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                try {
                    super.onLayoutChildren(recycler, state);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new RuntimeException("Inconsistency detected. ");
                }
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new VoIPFragment$12$$ExternalSyntheticLambda0(this, 26));
            }
        }

        @Override
        public final void prepareForDrop(View view, View view2, int i, int i2) {
            this.fixOffset = true;
            super.prepareForDrop(view, view2, i, i2);
            this.fixOffset = false;
        }

        @Override
        public final void scrollToPositionWithOffset(int i, int i2) {
            if (this.fixOffset) {
                i2 -= TopicsFragment.this.recyclerListView.getPaddingTop();
            }
            scrollToPositionWithOffset(i, i2, this.mShouldReverseLayout);
        }

        @Override
        public final int scrollVerticallyBy(int i, RecyclerView.Recycler recycler, RecyclerView.State state) {
            int i2;
            AnonymousClass6 anonymousClass6;
            int i3;
            TopicsFragment topicsFragment = TopicsFragment.this;
            AnonymousClass5 anonymousClass5 = topicsFragment.recyclerListView;
            if (anonymousClass5.fastScrollAnimationRunning) {
                return 0;
            }
            boolean z = anonymousClass5.getScrollState() == 1;
            int paddingTop = topicsFragment.recyclerListView.getPaddingTop();
            if (i >= 0 || topicsFragment.hiddenCount <= 0 || topicsFragment.pullViewState != 2) {
                i2 = i;
            } else {
                topicsFragment.recyclerListView.setOverScrollMode(0);
                int iFindFirstVisibleItemPosition = topicsFragment.layoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition == 0) {
                    View viewFindViewByPosition = topicsFragment.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null) {
                        viewFindViewByPosition.setTranslationX(0.0f);
                    }
                    if (viewFindViewByPosition != null && viewFindViewByPosition.getBottom() - paddingTop <= AndroidUtilities.dp(1.0f)) {
                        iFindFirstVisibleItemPosition = 1;
                    }
                }
                if (!z) {
                    View viewFindViewByPosition2 = topicsFragment.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition2 == null) {
                        i2 = i;
                    } else {
                        int iM = zzkv.m(iFindFirstVisibleItemPosition, 1, AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) + 1, -(viewFindViewByPosition2.getTop() - paddingTop));
                        if (iM < Math.abs(i)) {
                            i2 = -iM;
                        } else {
                            i2 = i;
                        }
                    }
                } else if (iFindFirstVisibleItemPosition == 0) {
                    View viewFindViewByPosition3 = topicsFragment.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    float top = ((viewFindViewByPosition3.getTop() - paddingTop) / viewFindViewByPosition3.getMeasuredHeight()) + 1.0f;
                    if (top > 1.0f) {
                        top = 1.0f;
                    }
                    topicsFragment.recyclerListView.setOverScrollMode(2);
                    i2 = (int) ((0.45f - (top * 0.25f)) * i);
                    if (i2 > -1) {
                        i2 = -1;
                    }
                } else {
                    i2 = i;
                }
            }
            AnonymousClass5 anonymousClass7 = topicsFragment.recyclerListView;
            float f = anonymousClass7.viewOffset;
            if (f != 0.0f && i > 0 && z) {
                float f2 = ((int) f) - i;
                if (f2 < 0.0f) {
                    i3 = (int) f2;
                    f2 = 0.0f;
                } else {
                    i3 = 0;
                }
                anonymousClass7.setViewsOffset(f2);
                i2 = i3;
            }
            if (topicsFragment.pullViewState == 0 || topicsFragment.hiddenCount <= 0) {
                return super.scrollVerticallyBy(i2, recycler, state);
            }
            int iScrollVerticallyBy = super.scrollVerticallyBy(i2, recycler, state);
            AnonymousClass6 anonymousClass8 = topicsFragment.pullForegroundDrawable;
            if (anonymousClass8 != null) {
                anonymousClass8.scrollDy = iScrollVerticallyBy;
            }
            int iFindFirstVisibleItemPosition2 = topicsFragment.layoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition4 = iFindFirstVisibleItemPosition2 == 0 ? topicsFragment.layoutManager.findViewByPosition(iFindFirstVisibleItemPosition2) : null;
            if (viewFindViewByPosition4 != null) {
                viewFindViewByPosition4.setTranslationX(0.0f);
            }
            int i4 = i2;
            if (iFindFirstVisibleItemPosition2 != 0 || viewFindViewByPosition4 == null || viewFindViewByPosition4.getBottom() - paddingTop < AndroidUtilities.dp(4.0f)) {
                topicsFragment.startArchivePullingTime = 0L;
                topicsFragment.canShowHiddenArchive = false;
                topicsFragment.pullViewState = 2;
                AnonymousClass6 anonymousClass9 = topicsFragment.pullForegroundDrawable;
                if (anonymousClass9 != null) {
                    ValueAnimator valueAnimator = anonymousClass9.textIntAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    DialogCell dialogCell = anonymousClass9.cell;
                    if (dialogCell != null) {
                        dialogCell.removeCallbacks(anonymousClass9.textInRunnable);
                    }
                    anonymousClass9.textInProgress = 0.0f;
                    anonymousClass9.animateToTextIn = false;
                    anonymousClass9.wasSendCallback = false;
                    AnonymousClass6 anonymousClass10 = topicsFragment.pullForegroundDrawable;
                    if (anonymousClass10.pullProgress != 0.0f) {
                        anonymousClass10.pullProgress = 0.0f;
                        DialogCell dialogCell2 = anonymousClass10.cell;
                        if (dialogCell2 != null) {
                            dialogCell2.invalidate();
                        }
                    }
                    topicsFragment.pullForegroundDrawable.listView = topicsFragment.recyclerListView;
                }
            } else {
                if (topicsFragment.startArchivePullingTime == 0) {
                    topicsFragment.startArchivePullingTime = System.currentTimeMillis();
                }
                if (topicsFragment.pullViewState == 2 && (anonymousClass6 = topicsFragment.pullForegroundDrawable) != null) {
                    anonymousClass6.showHidden();
                }
                float top2 = ((viewFindViewByPosition4.getTop() - paddingTop) / viewFindViewByPosition4.getMeasuredHeight()) + 1.0f;
                if (top2 > 1.0f) {
                    top2 = 1.0f;
                }
                boolean z2 = top2 > 0.85f && System.currentTimeMillis() - topicsFragment.startArchivePullingTime > 220;
                if (topicsFragment.canShowHiddenArchive != z2) {
                    topicsFragment.canShowHiddenArchive = z2;
                    if (topicsFragment.pullViewState == 2) {
                        try {
                            topicsFragment.recyclerListView.performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        AnonymousClass6 anonymousClass11 = topicsFragment.pullForegroundDrawable;
                        if (anonymousClass11 != null) {
                            anonymousClass11.colorize(z2);
                        }
                    }
                }
                if (topicsFragment.pullViewState == 2 && i4 - iScrollVerticallyBy != 0 && i < 0 && z) {
                    float fDp = 1.0f - (topicsFragment.recyclerListView.viewOffset / AndroidUtilities.dp(72.0f));
                    AnonymousClass5 anonymousClass12 = topicsFragment.recyclerListView;
                    anonymousClass12.setViewsOffset(anonymousClass12.viewOffset - ((i * 0.2f) * fDp));
                }
                AnonymousClass6 anonymousClass13 = topicsFragment.pullForegroundDrawable;
                if (anonymousClass13 != null) {
                    if (anonymousClass13.pullProgress != top2) {
                        anonymousClass13.pullProgress = top2;
                        DialogCell dialogCell3 = anonymousClass13.cell;
                        if (dialogCell3 != null) {
                            dialogCell3.invalidate();
                        }
                    }
                    topicsFragment.pullForegroundDrawable.listView = topicsFragment.recyclerListView;
                }
            }
            if (viewFindViewByPosition4 != null) {
                viewFindViewByPosition4.invalidate();
            }
            return iScrollVerticallyBy;
        }

        @Override
        public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            if (TopicsFragment.this.hiddenCount > 0 && i == 1) {
                super.smoothScrollToPosition(recyclerView, state, i);
                return;
            }
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
            linearSmoothScrollerCustom.mTargetPosition = i;
            startSmoothScroll(linearSmoothScrollerCustom);
        }
    }

    public final class AnonymousClass13 extends StickerEmptyView {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass13(int i, Context context, DarkThemeResourceProvider darkThemeResourceProvider, SelfStoryViewsPage.ListAdapter listAdapter) {
            super(i, darkThemeResourceProvider, context, null);
            this.this$0 = listAdapter;
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    SelfStoryViewsPage.ListAdapter listAdapter = (SelfStoryViewsPage.ListAdapter) this.this$0;
                    SelfStoryViewsView.AnonymousClass4.AnonymousClass1 anonymousClass1 = listAdapter.this$0;
                    super.onMeasure(i, OKLCH.m(anonymousClass1.measuerdHeight - anonymousClass1.recyclerListView.getPaddingTop(), listAdapter.this$0.TOP_PADDING, 1073741824));
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public void showProgress(boolean z, boolean z2) {
            switch (this.$r8$classId) {
                case 0:
                    super.showProgress(z, z2);
                    TopicsFragment topicsFragment = (TopicsFragment) this.this$0;
                    if (!z2) {
                        topicsFragment.emptyViewContainer.textView.animate().cancel();
                        topicsFragment.emptyViewContainer.textView.setAlpha(z ? 0.0f : 1.0f);
                    } else {
                        topicsFragment.emptyViewContainer.textView.animate().alpha(z ? 0.0f : 1.0f).start();
                    }
                    break;
                default:
                    super.showProgress(z, z2);
                    break;
            }
        }

        public AnonymousClass13(TopicsFragment topicsFragment, Context context, FlickerLoadingView flickerLoadingView) {
            super(0, null, context, flickerLoadingView);
            this.this$0 = topicsFragment;
        }
    }

    public final class AnonymousClass14 extends FrameLayout {
        public final int $r8$classId;

        public AnonymousClass14(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), Theme.chat_composeShadowDrawable.getIntrinsicHeight());
                    Theme.chat_composeShadowDrawable.draw(canvas);
                    super.dispatchDraw(canvas);
                    break;
                default:
                    super.dispatchDraw(canvas);
                    break;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 9:
                    super.onDraw(canvas);
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, Theme.dividerPaint);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 4:
                    int childCount = getChildCount();
                    int measuredWidth = 0;
                    int measuredHeight = 0;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        if (getChildAt(i5).getMeasuredWidth() + measuredWidth > getMeasuredWidth()) {
                            measuredHeight += getChildAt(i5).getMeasuredHeight();
                            measuredWidth = 0;
                        }
                        getChildAt(i5).layout(measuredWidth, measuredHeight, getChildAt(i5).getMeasuredWidth() + measuredWidth, getChildAt(i5).getMeasuredHeight() + measuredHeight);
                        measuredWidth += getChildAt(i5).getMeasuredWidth();
                    }
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    super.onMeasure(i, zzkm.m(36.0f, View.MeasureSpec.getSize(i2)));
                    break;
                case 3:
                    super.onMeasure(i, i2);
                    break;
                case 4:
                    int size = View.MeasureSpec.getSize(i);
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
                    int childCount = getChildCount();
                    int measuredHeight = childCount > 0 ? getChildAt(0).getMeasuredHeight() : 0;
                    int measuredWidth = 0;
                    int measuredHeight2 = 0;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        if (getChildAt(i3).getMeasuredWidth() + measuredWidth > size) {
                            measuredHeight2 += getChildAt(i3).getMeasuredHeight();
                            measuredWidth = 0;
                        }
                        measuredWidth += getChildAt(i3).getMeasuredWidth();
                    }
                    setMeasuredDimension(getMeasuredWidth(), getChildCount() != 0 ? AndroidUtilities.dp(16.0f) + measuredHeight + measuredHeight2 : 0);
                    break;
                case 5:
                case 6:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 7:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    break;
                case 8:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                    break;
            }
        }

        public AnonymousClass14(SearchAdsInfoBottomSheet searchAdsInfoBottomSheet, Activity activity, int i, String str, CharSequence charSequence) {
            super(activity);
            this.$r8$classId = 1;
            boolean z = LocaleController.isRTL;
            ImageView imageView = new ImageView(getContext());
            Drawable drawableMutate = getContext().getResources().getDrawable(i).mutate();
            int i2 = Theme.key_windowBackgroundWhiteBlackText;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, ((BottomSheet) searchAdsInfoBottomSheet).resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setImageDrawable(drawableMutate);
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, z ? 5 : 3, z ? 0.0f : 27.0f, 6.0f, z ? 27.0f : 0.0f, 0.0f));
            TextView textView = new TextView(getContext());
            textView.setText(str);
            textView.setTextColor(Theme.getColor(i2, ((BottomSheet) searchAdsInfoBottomSheet).resourcesProvider));
            zzkk.m(14.0f, 1, textView);
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 27.0f : 68.0f, 0.0f, z ? 68.0f : 27.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(getContext(), null);
            linksTextView.setText(charSequence);
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setTextColor(Theme.getColor(Theme.key_player_actionBarSubtitle, ((BottomSheet) searchAdsInfoBottomSheet).resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn, ((BottomSheet) searchAdsInfoBottomSheet).resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linksTextView.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            addView(linksTextView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, (z ? 27 : 68) - 4, 18.0f, (z ? 68 : 27) - 4, 0.0f));
        }
    }

    public final class AnonymousClass15 implements View.OnClickListener {
        public AnonymousClass15() {
        }

        @Override
        public final void onClick(View view) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (topicsFragment.bottomButtonType == 1) {
                long j = topicsFragment.chatId;
                AlertsCreator.showBlockReportSpamAlert(topicsFragment, -j, null, topicsFragment.getMessagesController().getChat(Long.valueOf(j)), null, false, topicsFragment.chatFull, new PhotoViewer$$ExternalSyntheticLambda156(this, 9), topicsFragment.getResourceProvider());
                return;
            }
            topicsFragment.getMessagesController().addUserToChat(topicsFragment.chatId, topicsFragment.getUserConfig().getCurrentUser(), 0, null, topicsFragment, false, new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment, 4), new TopicsFragment$$ExternalSyntheticLambda5(topicsFragment));
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
            topicsFragment.updateChatInfo(false);
        }
    }

    public final class AnonymousClass18 extends View {
        public AnonymousClass18(Context context) {
            super(context);
        }

        @Override
        public final void setAlpha(float f) {
            super.setAlpha(f);
            View view = TopicsFragment.this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public final class AnonymousClass19 implements ChatNotificationsPopupWrapper.Callback {
        public final TLRPC.TL_forumTopic val$topic;

        public AnonymousClass19(TLRPC.TL_forumTopic tL_forumTopic) {
            this.val$topic = tL_forumTopic;
        }

        @Override
        public final void dismiss() {
            TopicsFragment.this.finishPreviewFragment();
        }

        @Override
        public final void muteFor(int i) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.finishPreviewFragment();
            long j = topicsFragment.chatId;
            TLRPC.TL_forumTopic tL_forumTopic = this.val$topic;
            if (i != 0) {
                topicsFragment.getNotificationsController().muteUntil(-j, tL_forumTopic.id, i);
                if (BulletinFactory.canShowBulletin(topicsFragment)) {
                    BulletinFactory.createMuteBulletin(topicsFragment, 5, i, topicsFragment.getResourceProvider()).show();
                    return;
                }
                return;
            }
            if (topicsFragment.getMessagesController().isDialogMuted(-j, tL_forumTopic.id)) {
                topicsFragment.getNotificationsController().muteDialog(-j, tL_forumTopic.id, false);
            }
            if (BulletinFactory.canShowBulletin(topicsFragment)) {
                BulletinFactory.createMuteBulletin(topicsFragment, 4, i, topicsFragment.getResourceProvider()).show();
            }
        }

        @Override
        public final void openExceptions() {
        }

        @Override
        public final void showCustomize() {
            TopicsFragment.this.finishPreviewFragment();
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(14, this, this.val$topic), 500L);
        }

        @Override
        public final void toggleMute() {
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.finishPreviewFragment();
            MessagesController messagesController = topicsFragment.getMessagesController();
            long j = topicsFragment.chatId;
            TLRPC.TL_forumTopic tL_forumTopic = this.val$topic;
            boolean zIsDialogMuted = messagesController.isDialogMuted(-j, tL_forumTopic.id);
            topicsFragment.getNotificationsController().muteDialog(-j, tL_forumTopic.id, !zIsDialogMuted);
            if (BulletinFactory.canShowBulletin(topicsFragment)) {
                BulletinFactory.createMuteBulletin(topicsFragment, !zIsDialogMuted ? 3 : 4, !zIsDialogMuted ? Integer.MAX_VALUE : 0, topicsFragment.getResourceProvider()).show();
            }
        }

        @Override
        public final void toggleSound() {
            TopicsFragment topicsFragment = TopicsFragment.this;
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) topicsFragment).currentAccount);
            StringBuilder sb = new StringBuilder("sound_enabled_");
            long j = topicsFragment.chatId;
            TLRPC.TL_forumTopic tL_forumTopic = this.val$topic;
            boolean z = notificationsSettings.getBoolean(MessagesController$$ExternalSyntheticOutline1.m(-j, tL_forumTopic.id, sb), true);
            notificationsSettings.edit().putBoolean(MessagesController$$ExternalSyntheticOutline1.m(-j, tL_forumTopic.id, new StringBuilder("sound_enabled_")), !z).apply();
            topicsFragment.finishPreviewFragment();
            if (BulletinFactory.canShowBulletin(topicsFragment)) {
                BulletinFactory.createSoundEnabledBulletin(z ? 1 : 0, topicsFragment, topicsFragment.getResourceProvider()).show();
            }
        }
    }

    public final class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        public final Context val$context;

        public AnonymousClass2(Context context) {
            this.val$context = context;
        }

        @Override
        public final void onItemClick(int i) {
            TLRPC.ChatParticipants chatParticipants;
            TopicDialogCell topicDialogCell;
            TLRPC.TL_forumTopic tL_forumTopic;
            int i2 = 0;
            int i3 = 1;
            TopicsFragment topicsFragment = TopicsFragment.this;
            HashSet hashSet = topicsFragment.selectedTopics;
            if (i == -1) {
                if (hashSet.size() <= 0) {
                    topicsFragment.finishFragment();
                    return;
                }
                topicsFragment.clearSelectedTopics();
            }
            TopicsController topicsController = topicsFragment.topicsController;
            long j = topicsFragment.chatId;
            TLRPC.TL_forumTopic tL_forumTopic2 = null;
            switch (i) {
                case 1:
                    topicsFragment.getMessagesController().getTopicsController().toggleViewForumAsMessages(j, true);
                    topicsFragment.finishDialogRightSlidingPreviewOnTransitionEnd = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j);
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    chatActivity.switchFromTopics = true;
                    topicsFragment.presentFragment(chatActivity);
                    break;
                case 2:
                    TLRPC.ChatFull chatFull = topicsFragment.getMessagesController().getChatFull(j);
                    TLRPC.ChatFull chatFull2 = topicsFragment.chatFull;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        chatFull.participants = chatParticipants;
                    }
                    if (chatFull != null) {
                        LongSparseArray longSparseArray = new LongSparseArray();
                        if (chatFull.participants != null) {
                            while (i2 < chatFull.participants.participants.size()) {
                                longSparseArray.put(null, chatFull.participants.participants.get(i2).user_id);
                                i2++;
                            }
                        }
                        final long j2 = chatFull.id;
                        InviteMembersBottomSheet inviteMembersBottomSheet = new InviteMembersBottomSheet(this.val$context, ((BaseFragment) topicsFragment).currentAccount, longSparseArray, chatFull.id, topicsFragment) {
                            @Override
                            public final boolean canGenerateLink() {
                                TLRPC.Chat chat = TopicsFragment.this.getMessagesController().getChat(Long.valueOf(j2));
                                return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
                            }
                        };
                        inviteMembersBottomSheet.delegate = new LaunchActivity$$ExternalSyntheticLambda112(this, j2, 11);
                        inviteMembersBottomSheet.show();
                    }
                    break;
                case 3:
                    TopicCreateFragment topicCreateFragmentCreate = TopicCreateFragment.create(j, 0L);
                    topicsFragment.presentFragment(topicCreateFragmentCreate);
                    AndroidUtilities.runOnUIThread(new TopicsFragment$2$$ExternalSyntheticLambda2(topicCreateFragmentCreate, i2), 200L);
                    break;
                case 4:
                case 5:
                    if (hashSet.size() > 0) {
                        topicsFragment.scrollToTop = true;
                        topicsFragment.updateAnimated = true;
                        topicsFragment.topicsController.pinTopic(topicsFragment.chatId, ((Integer) hashSet.iterator().next()).intValue(), i == 4, topicsFragment);
                        topicsFragment = topicsFragment;
                    }
                    topicsFragment.clearSelectedTopics();
                    break;
                case 6:
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        topicsFragment.getNotificationsController().muteDialog(-j, ((Integer) it.next()).intValue(), topicsFragment.mute);
                    }
                    topicsFragment.clearSelectedTopics();
                    break;
                case 7:
                    topicsFragment.deleteTopics$1(hashSet, new VoIPFragment$12$$ExternalSyntheticLambda0(this, 27));
                    break;
                case 8:
                    ArrayList arrayList = new ArrayList(hashSet);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j, ((Integer) arrayList.get(i4)).intValue());
                        if (tL_forumTopicFindTopic != null) {
                            topicsFragment.getMessagesController().markMentionsAsRead(-j, tL_forumTopicFindTopic.id);
                            MessagesController messagesController = topicsFragment.getMessagesController();
                            long j3 = -j;
                            int i5 = tL_forumTopicFindTopic.top_message;
                            TLRPC.Message message = tL_forumTopicFindTopic.topMessage;
                            messagesController.markDialogAsRead(j3, i5, 0, message != null ? message.date : 0, false, tL_forumTopicFindTopic.id, 0, true, 0);
                            topicsFragment.getMessagesStorage().updateRepliesMaxReadId(topicsFragment.chatId, tL_forumTopicFindTopic.id, tL_forumTopicFindTopic.top_message, 0, true);
                        }
                    }
                    topicsFragment.clearSelectedTopics();
                    break;
                case 9:
                case 10:
                    topicsFragment.updateAnimated = true;
                    ArrayList arrayList2 = new ArrayList(hashSet);
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        topicsController.toggleCloseTopic(j, ((Integer) arrayList2.get(i6)).intValue(), i == 9);
                    }
                    topicsFragment.clearSelectedTopics();
                    break;
                case 11:
                    TLRPC.Chat chat = topicsFragment.getMessagesController().getChat(Long.valueOf(j));
                    AlertsCreator.createClearOrDeleteDialogAlert(topicsFragment, false, chat, null, false, true, false, false, new TodoItemMenu$$ExternalSyntheticLambda19(i3, this, chat));
                    break;
                case 12:
                case 13:
                    int i7 = 0;
                    while (true) {
                        if (i7 < topicsFragment.recyclerListView.getChildCount()) {
                            View childAt = topicsFragment.recyclerListView.getChildAt(i7);
                            if ((childAt instanceof TopicDialogCell) && (tL_forumTopic = (topicDialogCell = (TopicDialogCell) childAt).forumTopic) != null && tL_forumTopic.id == 1) {
                                tL_forumTopic2 = tL_forumTopic;
                            } else {
                                i7++;
                            }
                        } else {
                            topicDialogCell = null;
                        }
                    }
                    if (tL_forumTopic2 == null) {
                        while (true) {
                            ArrayList arrayList3 = topicsFragment.forumTopics;
                            if (i2 < arrayList3.size()) {
                                if (arrayList3.get(i2) == null || ((Item) arrayList3.get(i2)).topic == null || ((Item) arrayList3.get(i2)).topic.id != 1) {
                                    i2++;
                                } else {
                                    tL_forumTopic2 = ((Item) arrayList3.get(i2)).topic;
                                }
                            }
                        }
                    }
                    if (tL_forumTopic2 != null) {
                        if (topicsFragment.hiddenCount <= 0) {
                            topicsFragment.hiddenShown = true;
                            topicsFragment.pullViewState = 2;
                        }
                        topicsFragment.getMessagesController().getTopicsController().toggleShowTopic(j, 1, tL_forumTopic2.hidden);
                        if (topicDialogCell != null) {
                            topicsFragment.generalTopicViewMoving = topicDialogCell;
                        }
                        topicsFragment.recyclerListView.setArchiveHidden(!tL_forumTopic2.hidden, topicDialogCell);
                        topicsFragment.updateTopicsList(true, true);
                        if (topicDialogCell != null) {
                            topicDialogCell.setTopicIcon(topicDialogCell.currentTopic);
                        }
                    }
                    topicsFragment.clearSelectedTopics();
                    break;
                case 14:
                    if (ChatObject.hasAdminRights(topicsFragment.getMessagesController().getChat(Long.valueOf(j)))) {
                        BoostsActivity boostsActivity = new BoostsActivity(-j);
                        boostsActivity.boostsStatus = topicsFragment.boostsStatus;
                        boostsActivity.loadCanApplyBoosts();
                        topicsFragment.presentFragment(boostsActivity);
                    } else {
                        topicsFragment.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-j));
                    }
                    break;
                case 15:
                    ReportBottomSheet.openChat(-j, topicsFragment);
                    break;
            }
        }
    }

    public final class AnonymousClass20 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final TopicsFragment this$0;
        public final boolean val$showSearch;

        public AnonymousClass20(TopicsFragment topicsFragment, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = topicsFragment;
            this.val$showSearch = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    super.onAnimationEnd(animator);
                    boolean z = this.val$showSearch;
                    float f = z ? 1.0f : 0.0f;
                    TopicsFragment topicsFragment = this.this$0;
                    topicsFragment.updateSearchProgress(f);
                    if (!z) {
                        AndroidUtilities.setAdjustResizeToNothing(topicsFragment.getParentActivity(), ((BaseFragment) topicsFragment).classGuid);
                        topicsFragment.searchContainer.setVisibility(8);
                        topicsFragment.updateCreateTopicButton(true);
                    } else {
                        topicsFragment.other.setVisibility(8);
                    }
                    break;
                default:
                    if (!this.val$showSearch) {
                        this.this$0.bottomOverlayContainer.setVisibility(8);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass5 extends TopicsRecyclerView {
        public AnonymousClass5(Context context) {
            super(context);
        }

        @Override
        public final boolean emptyViewIsVisible() {
            ArrayList arrayList;
            return (getAdapter() == null || this.fastScrollAnimationRunning || ((arrayList = TopicsFragment.this.forumTopics) == null || arrayList.size() != 1 || arrayList.get(0) == null || ((Item) arrayList.get(0)).topic == null || ((Item) arrayList.get(0)).topic.id != 1 ? getAdapter().getItemCount() > 1 : getAdapter().getItemCount() > 2)) ? false : true;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            TopicsFragment.this.checkForLoadMore();
        }
    }

    public final class AnonymousClass6 extends PullForegroundDrawable {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass6(String str, String str2, DialogsActivity.ViewPage viewPage) {
            super(str, str2);
            this.this$0 = viewPage;
        }

        @Override
        public final float getViewOffset() {
            switch (this.$r8$classId) {
                case 0:
                    return ((TopicsFragment) this.this$0).recyclerListView.viewOffset;
                default:
                    return ((DialogsActivity.ViewPage) this.this$0).listView.getViewOffset();
            }
        }

        public AnonymousClass6(TopicsFragment topicsFragment, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
            super(spannableStringBuilder, spannableStringBuilder2);
            this.this$0 = topicsFragment;
        }
    }

    public final class AnonymousClass7 extends DefaultItemAnimator {
        public Runnable finishRunnable;
        public int scrollAnimationIndex;

        public AnonymousClass7() {
        }

        @Override
        public final void afterAnimateMoveImpl(RecyclerView.ViewHolder viewHolder) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            TopicDialogCell topicDialogCell = topicsFragment.generalTopicViewMoving;
            if (topicDialogCell == viewHolder.itemView) {
                topicDialogCell.setTranslationX(0.0f);
                AnonymousClass12 anonymousClass12 = topicsFragment.itemTouchHelper;
                if (anonymousClass12 != null) {
                    anonymousClass12.mRecoverAnimations.clear();
                }
                TopicDialogCell topicDialogCell2 = topicsFragment.generalTopicViewMoving;
                if (SurfaceContainer$$ExternalSyntheticOutline0.m6m((Object) topicDialogCell2)) {
                    topicDialogCell2.setTopicIcon(topicDialogCell2.currentTopic);
                }
                topicsFragment.generalTopicViewMoving = null;
            }
        }

        @Override
        public final void checkIsRunning() {
            if (this.scrollAnimationIndex == -1) {
                this.scrollAnimationIndex = TopicsFragment.this.getNotificationCenter().setAnimationInProgress(this.scrollAnimationIndex, null, false);
                Runnable runnable = this.finishRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.finishRunnable = null;
                }
            }
        }

        @Override
        public final void endAnimations() {
            super.endAnimations();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            TopicsFragment$7$$ExternalSyntheticLambda0 topicsFragment$7$$ExternalSyntheticLambda0 = new TopicsFragment$7$$ExternalSyntheticLambda0(this, 1);
            this.finishRunnable = topicsFragment$7$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(topicsFragment$7$$ExternalSyntheticLambda0);
        }

        @Override
        public final void onAllAnimationsDone() {
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            TopicsFragment$7$$ExternalSyntheticLambda0 topicsFragment$7$$ExternalSyntheticLambda0 = new TopicsFragment$7$$ExternalSyntheticLambda0(this, 0);
            this.finishRunnable = topicsFragment$7$$ExternalSyntheticLambda0;
            AndroidUtilities.runOnUIThread(topicsFragment$7$$ExternalSyntheticLambda0);
        }
    }

    public final class Adapter extends AdapterWithDiffUtils {
        public Adapter() {
        }

        public final ArrayList getArray() {
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.getClass();
            return topicsFragment.forumTopics;
        }

        @Override
        public final int getItemCount() {
            return getArray().size() + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == getArray().size()) {
                return 2;
            }
            return ((Item) TopicsFragment.this.forumTopics.get(i)).viewType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            return i == 0 || i == 3;
        }

        @Override
        public final void notifyDataSetChanged() {
            TopicsFragment.this.lastItemsCount = getArray().size() + 1;
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            boolean z2;
            int i2 = viewHolder.mItemViewType;
            TopicsFragment topicsFragment = TopicsFragment.this;
            ArrayList arrayList = topicsFragment.forumTopics;
            long j = topicsFragment.chatId;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 == 3) {
                    TopicDialogCell topicDialogCell = (TopicDialogCell) view;
                    topicDialogCell.setCurrentDialogId(-j);
                    topicDialogCell.drawDivider = i != arrayList.size() - 1 || topicsFragment.recyclerListView.emptyViewIsVisible();
                    topicDialogCell.position = i;
                    return;
                }
                return;
            }
            TLRPC.TL_forumTopic tL_forumTopic = ((Item) getArray().get(i)).topic;
            int i3 = i + 1;
            TLRPC.TL_forumTopic tL_forumTopic2 = i3 < getArray().size() ? ((Item) getArray().get(i3)).topic : null;
            TopicDialogCell topicDialogCell2 = (TopicDialogCell) view;
            TLRPC.Message message = tL_forumTopic.topMessage;
            TLRPC.TL_forumTopic tL_forumTopic3 = topicDialogCell2.forumTopic;
            int i4 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
            int i5 = tL_forumTopic.id;
            boolean z3 = i4 == i5 && topicDialogCell2.position == i && topicsFragment.animatedUpdateEnabled;
            if (message != null) {
                MessageObject messageObject = new MessageObject(((BaseFragment) topicsFragment).currentAccount, message, false, false);
                if (topicsFragment.getMessagesController().isMonoForum(-j)) {
                    topicDialogCell2.isMonoForumTopicDialog = true;
                    topicDialogCell2.drawAvatar = true;
                    topicDialogCell2.forumTopic = tL_forumTopic;
                    topicDialogCell2.messagePaddingStart = 72;
                    topicDialogCell2.chekBoxPaddingTop = 42.0f;
                    topicDialogCell2.heightDefault = 72;
                    topicDialogCell2.heightThreeLines = 78;
                    topicDialogCell2.setDialog(DialogObject.getPeerDialogId(tL_forumTopic.from_id), messageObject, message.date, false, false);
                    topicDialogCell2.isSavedDialogCell = true;
                    topicDialogCell2.useSeparator = i3 < getArray().size() + 1;
                } else {
                    TLRPC.TL_forumTopic tL_forumTopic4 = tL_forumTopic2;
                    topicDialogCell2 = topicDialogCell2;
                    i5 = i5;
                    boolean z4 = z3;
                    topicDialogCell2.setForumTopic(tL_forumTopic, -j, messageObject, topicsFragment.isInPreviewMode(), z4);
                    z = z4;
                    topicDialogCell2.drawDivider = i != arrayList.size() - 1 || topicsFragment.recyclerListView.emptyViewIsVisible();
                    boolean z5 = tL_forumTopic.pinned;
                    topicDialogCell2.fullSeparator = z5 && (tL_forumTopic4 == null || !tL_forumTopic4.pinned);
                    topicDialogCell2.setPinForced(z5 && !tL_forumTopic.hidden);
                    topicDialogCell2.position = i;
                }
                if (!topicsFragment.getMessagesController().isMonoForum(-j)) {
                    topicDialogCell2.setTopicIcon(tL_forumTopic);
                }
                topicDialogCell2.setChecked(topicsFragment.selectedTopics.contains(Integer.valueOf(i5)), z);
                if (topicsFragment.selectedTopicForTablet == i5) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                topicDialogCell2.setDialogSelected(z2);
                topicDialogCell2.onReorderStateChanged(topicsFragment.reordering, true);
            }
            z = z3;
            if (!topicsFragment.getMessagesController().isMonoForum(-j)) {
                topicDialogCell2.setTopicIcon(tL_forumTopic);
            }
            topicDialogCell2.setChecked(topicsFragment.selectedTopics.contains(Integer.valueOf(i5)), z);
            if (topicsFragment.selectedTopicForTablet == i5) {
                z2 = true;
            } else {
                z2 = false;
            }
            topicDialogCell2.setDialogSelected(z2);
            topicDialogCell2.onReorderStateChanged(topicsFragment.reordering, true);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (i == 0 || i == 3) {
                TopicDialogCell topicDialogCell = topicsFragment.new TopicDialogCell(viewGroup.getContext(), false);
                if (i == 3) {
                    boolean zIsBotForumWithEditableTopics = UserObject.isBotForumWithEditableTopics(((BaseFragment) topicsFragment).currentAccount, -topicsFragment.chatId);
                    topicDialogCell.setForumIcon(ForumUtilities.createTopicDrawable(ForumBubbleDrawable.serverSupportedColor[0], ""));
                    topicDialogCell.setTitleOverride(LocaleController.getString(!zIsBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatTitle : R.string.BotForumAskForStartNewChatTitle));
                    topicDialogCell.setCustomMessage(LocaleController.getString(!zIsBotForumWithEditableTopics ? R.string.BotForumAskForStartOffNewChatForward : R.string.BotForumAskForStartNewChatForward));
                }
                topicDialogCell.inPreviewMode = ((BaseFragment) topicsFragment).inPreviewMode;
                topicDialogCell.setArchivedPullAnimation(topicsFragment.pullForegroundDrawable);
                return new RecyclerListView.Holder(topicDialogCell);
            }
            if (i == 2) {
                ?? r8 = new View(topicsFragment.getParentActivity()) {
                    public final HashMap precalcEllipsized = new HashMap();

                    @Override
                    public final void onMeasure(int i2, int i3) {
                        Adapter adapter;
                        float f;
                        int i4;
                        int iDp;
                        int size = View.MeasureSpec.getSize(i2);
                        int iDp2 = AndroidUtilities.dp(64.0f);
                        int i5 = 0;
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            adapter = Adapter.this;
                            if (i5 >= adapter.getArray().size()) {
                                break;
                            }
                            if (adapter.getArray().get(i5) != null && ((Item) adapter.getArray().get(i5)).topic != null) {
                                String str = ((Item) adapter.getArray().get(i5)).topic.title;
                                HashMap map = this.precalcEllipsized;
                                Boolean boolValueOf = (Boolean) map.get(str);
                                if (boolValueOf == null) {
                                    if (LocaleController.isRTL) {
                                        f = 18.0f;
                                    } else {
                                        f = (TopicsFragment.this.isInPreviewMode() ? 11 : 50) + 4;
                                    }
                                    int iDp3 = AndroidUtilities.dp(f);
                                    if (LocaleController.isRTL) {
                                        i4 = size - iDp3;
                                        iDp = AndroidUtilities.dp((TopicsFragment.this.isInPreviewMode() ? 11 : 50) + 13);
                                    } else {
                                        i4 = size - iDp3;
                                        iDp = AndroidUtilities.dp(22.0f);
                                    }
                                    boolValueOf = Boolean.valueOf(Theme.dialogs_namePaint[0].measureText(str) <= ((float) ((i4 - iDp) - ((int) Math.ceil((double) Theme.dialogs_timePaint.measureText("00:00"))))));
                                    map.put(str, boolValueOf);
                                }
                                int iDp4 = AndroidUtilities.dp((!boolValueOf.booleanValue() ? 20 : 0) + 64);
                                if (((Item) adapter.getArray().get(i5)).topic.id == 1) {
                                    iDp2 = iDp4;
                                }
                                if (((Item) adapter.getArray().get(i5)).topic.hidden) {
                                    i6++;
                                }
                                i7 += iDp4;
                            }
                            i5++;
                        }
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(0, i6 > 0 ? (((TopicsFragment.this.recyclerListView.getMeasuredHeight() - TopicsFragment.this.recyclerListView.getPaddingTop()) - TopicsFragment.this.recyclerListView.getPaddingBottom()) - i7) + iDp2 : 0), 1073741824));
                    }
                };
                topicsFragment.emptyView = r8;
                return new RecyclerListView.Holder(r8);
            }
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(viewGroup.getContext(), null);
            flickerLoadingView.setViewType(24);
            flickerLoadingView.setIsSingleCell(true);
            flickerLoadingView.showDate = true;
            return new RecyclerListView.Holder(flickerLoadingView);
        }
    }

    public final class EmptyViewContainer extends FrameLayout {
        public boolean increment;
        public float progress;
        public final TextView textView;

        public EmptyViewContainer(TopicsFragment topicsFragment, Context context) {
            SpannableStringBuilder spannableStringBuilder;
            super(context);
            TextView textView = new TextView(context);
            this.textView = textView;
            if (LocaleController.isRTL) {
                spannableStringBuilder = new SpannableStringBuilder("  ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.attach_arrow_left), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.arrow_newchat), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            }
            textView.setText(spannableStringBuilder);
            textView.setTextSize(1, 14.0f);
            textView.setLayerType(2, null);
            textView.setTextColor(topicsFragment.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, z ? 72.0f : 32.0f, 0.0f, z ? 32.0f : 72.0f, 32.0f));
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.increment) {
                float f = this.progress + 0.013333334f;
                this.progress = f;
                if (f > 1.0f) {
                    this.increment = false;
                    this.progress = 1.0f;
                }
            } else {
                float f2 = this.progress - 0.013333334f;
                this.progress = f2;
                if (f2 < 0.0f) {
                    this.increment = true;
                    this.progress = 0.0f;
                }
            }
            this.textView.setTranslationX(CubicBezierInterpolator.DEFAULT.getInterpolation(this.progress) * AndroidUtilities.dp(8.0f) * (LocaleController.isRTL ? -1 : 1));
            invalidate();
        }
    }

    public final class Item extends AdapterWithDiffUtils.Item {
        public final TLRPC.TL_forumTopic topic;

        public Item(int i, TLRPC.TL_forumTopic tL_forumTopic) {
            super(i, true);
            this.topic = tL_forumTopic;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Item.class == obj.getClass()) {
                Item item = (Item) obj;
                int i = this.viewType;
                if (i == item.viewType && i == 0 && this.topic.id == item.topic.id) {
                    return true;
                }
            }
            return false;
        }
    }

    public final class MessagesSearchContainer extends ViewPagerFixed implements FilteredSearchView.UiCallback {
        public boolean canLoadMore;
        public final RichEditor.AnonymousClass3 chatPreviewDelegate;
        public final StickerEmptyView emptyView;
        public boolean isLoading;
        public final RecyclerItemsEnterAnimator itemsEnterAnimator;
        public final LinearLayoutManager layoutManager;
        public int messagesEndRow;
        public int messagesHeaderRow;
        public boolean messagesIsLoading;
        public int messagesStartRow;
        public final RecyclerListView recyclerView;
        public int rowCount;
        public final SearchAdapter searchAdapter;
        public final FrameLayout searchContainer;
        public final ArrayList searchResultMessages;
        public final ArrayList searchResultTopics;
        public TodoItemMenu$$ExternalSyntheticLambda9 searchRunnable;
        public String searchString;
        public final ArrayList selectedItems;
        public int topicsEndRow;
        public int topicsHeaderRow;
        public int topicsStartRow;
        public final ViewPagerAdapter viewPagerAdapter;

        public final class Item {
            public int filterIndex;
            public final int type;

            public Item(int i) {
                this.type = i;
            }
        }

        public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
            public SearchAdapter() {
            }

            @Override
            public final int getItemCount() {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                if (messagesSearchContainer.isLoading) {
                    return 0;
                }
                return messagesSearchContainer.rowCount;
            }

            @Override
            public final int getItemViewType(int i) {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                if (i == messagesSearchContainer.messagesHeaderRow || i == messagesSearchContainer.topicsHeaderRow) {
                    return 1;
                }
                if (i < messagesSearchContainer.topicsStartRow || i >= messagesSearchContainer.topicsEndRow) {
                    return (i < messagesSearchContainer.messagesStartRow || i >= messagesSearchContainer.messagesEndRow) ? 0 : 3;
                }
                return 2;
            }

            @Override
            public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                int i = viewHolder.mItemViewType;
                return i == 3 || i == 2;
            }

            @Override
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                int itemViewType = getItemViewType(i);
                View view = viewHolder.itemView;
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                if (itemViewType == 1) {
                    GraySectionCell graySectionCell = (GraySectionCell) view;
                    if (i == messagesSearchContainer.topicsHeaderRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.Topics));
                    }
                    if (i == messagesSearchContainer.messagesHeaderRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.SearchMessages));
                    }
                }
                if (getItemViewType(i) == 2) {
                    TopicSearchCell topicSearchCell = (TopicSearchCell) view;
                    topicSearchCell.setTopic((TLRPC.TL_forumTopic) messagesSearchContainer.searchResultTopics.get(i - messagesSearchContainer.topicsStartRow));
                    topicSearchCell.drawDivider = i != messagesSearchContainer.topicsEndRow - 1;
                }
                if (getItemViewType(i) == 3) {
                    MessageObject messageObject = (MessageObject) messagesSearchContainer.searchResultMessages.get(i - messagesSearchContainer.messagesStartRow);
                    TopicDialogCell topicDialogCell = (TopicDialogCell) view;
                    topicDialogCell.drawDivider = i != messagesSearchContainer.messagesEndRow - 1;
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    long topicId = MessageObject.getTopicId(((BaseFragment) topicsFragment).currentAccount, messageObject.messageOwner, true);
                    if (topicId == 0) {
                        topicId = 1;
                    }
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsFragment.topicsController.findTopic(topicsFragment.chatId, topicId);
                    if (tL_forumTopicFindTopic != null) {
                        topicDialogCell.setForumTopic(tL_forumTopicFindTopic, messageObject.getDialogId(), messageObject, false, false);
                        topicDialogCell.setTopicIcon(tL_forumTopicFindTopic);
                    } else {
                        FileLog.d("cant find topic " + topicId);
                    }
                }
            }

            @Override
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View graySectionCell;
                if (i == 1) {
                    graySectionCell = new GraySectionCell(viewGroup.getContext(), 16, null);
                } else if (i == 2) {
                    graySectionCell = new TopicSearchCell(viewGroup.getContext());
                } else {
                    if (i != 3) {
                        throw new RuntimeException("unsupported view type");
                    }
                    MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                    TopicDialogCell topicDialogCell = TopicsFragment.this.new TopicDialogCell(viewGroup.getContext(), true);
                    topicDialogCell.inPreviewMode = ((BaseFragment) TopicsFragment.this).inPreviewMode;
                    graySectionCell = topicDialogCell;
                }
                graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(graySectionCell);
            }
        }

        public final class ViewPagerAdapter extends ViewPagerFixed.Adapter {
            public final ArrayList items;

            public ViewPagerAdapter() {
                ArrayList arrayList = new ArrayList();
                this.items = arrayList;
                arrayList.add(new Item(0));
                Item item = new Item(2);
                item.filterIndex = 0;
                arrayList.add(item);
                Item item2 = new Item(2);
                item2.filterIndex = 1;
                arrayList.add(item2);
                Item item3 = new Item(2);
                item3.filterIndex = 2;
                arrayList.add(item3);
                Item item4 = new Item(2);
                item4.filterIndex = 3;
                arrayList.add(item4);
                Item item5 = new Item(2);
                item5.filterIndex = 4;
                arrayList.add(item5);
            }

            @Override
            public final void bindView(View view, int i, int i2) {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                messagesSearchContainer.search$1(view, i, messagesSearchContainer.searchString, true);
            }

            @Override
            public final View createView(int i) {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                if (i == 1) {
                    return messagesSearchContainer.searchContainer;
                }
                if (i == 2) {
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    SearchDownloadsContainer searchDownloadsContainer = new SearchDownloadsContainer(((BaseFragment) topicsFragment).currentAccount, topicsFragment);
                    final int i2 = 0;
                    searchDownloadsContainer.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                        @Override
                        public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                            int i5 = i2;
                        }

                        private final void onScrolled$org$telegram$ui$TopicsFragment$MessagesSearchContainer$ViewPagerAdapter$1(RecyclerView recyclerView, int i3, int i4) {
                        }

                        private final void onScrolled$org$telegram$ui$TopicsFragment$MessagesSearchContainer$ViewPagerAdapter$2(RecyclerView recyclerView, int i3, int i4) {
                        }
                    });
                    searchDownloadsContainer.setUiCallback(messagesSearchContainer);
                    return searchDownloadsContainer;
                }
                FilteredSearchView filteredSearchView = new FilteredSearchView(TopicsFragment.this);
                filteredSearchView.setChatPreviewDelegate(messagesSearchContainer.chatPreviewDelegate);
                filteredSearchView.setUiCallback(messagesSearchContainer);
                final int i3 = 1;
                filteredSearchView.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                        int i6 = i3;
                    }

                    private final void onScrolled$org$telegram$ui$TopicsFragment$MessagesSearchContainer$ViewPagerAdapter$1(RecyclerView recyclerView, int i4, int i5) {
                    }

                    private final void onScrolled$org$telegram$ui$TopicsFragment$MessagesSearchContainer$ViewPagerAdapter$2(RecyclerView recyclerView, int i4, int i5) {
                    }
                });
                return filteredSearchView;
            }

            @Override
            public final int getItemCount() {
                return this.items.size();
            }

            @Override
            public final CharSequence getItemTitle(int i) {
                ArrayList arrayList = this.items;
                if (((Item) arrayList.get(i)).type == 0) {
                    return LocaleController.getString(R.string.SearchMessages);
                }
                if (((Item) arrayList.get(i)).type == 1) {
                    return LocaleController.getString(R.string.DownloadsTabs);
                }
                FiltersView.MediaFilterData mediaFilterData = FiltersView.filters[((Item) arrayList.get(i)).filterIndex];
                String str = mediaFilterData.title;
                return str != null ? str : LocaleController.getString(mediaFilterData.titleResId);
            }

            @Override
            public final int getItemViewType(int i) {
                ArrayList arrayList = this.items;
                if (((Item) arrayList.get(i)).type == 0) {
                    return 1;
                }
                if (((Item) arrayList.get(i)).type == 1) {
                    return 2;
                }
                return ((Item) arrayList.get(i)).type + i;
            }
        }

        public MessagesSearchContainer(Context context) {
            super(context, null);
            this.searchString = "empty";
            this.searchResultTopics = new ArrayList();
            this.searchResultMessages = new ArrayList();
            this.selectedItems = new ArrayList();
            FrameLayout frameLayout = new FrameLayout(context);
            this.searchContainer = frameLayout;
            this.chatPreviewDelegate = new RichEditor.AnonymousClass3(this, 1);
            RecyclerListView recyclerListView = new RecyclerListView(context, null);
            this.recyclerView = recyclerListView;
            SearchAdapter searchAdapter = new SearchAdapter();
            this.searchAdapter = searchAdapter;
            recyclerListView.setAdapter(searchAdapter);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
            this.layoutManager = linearLayoutManager;
            recyclerListView.setLayoutManager(linearLayoutManager);
            recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, 23));
            recyclerListView.setOnScrollListener(new SettingsActivity.AnonymousClass5(this, 18));
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
            flickerLoadingView.setViewType(7);
            flickerLoadingView.showDate = false;
            flickerLoadingView.setUseHeaderOffset(true);
            StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, flickerLoadingView);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
            stickerEmptyView.subtitle.setVisibility(8);
            stickerEmptyView.setVisibility(8);
            stickerEmptyView.addView(flickerLoadingView, 0);
            stickerEmptyView.setAnimateLayoutChange(true);
            recyclerListView.setEmptyView(stickerEmptyView);
            recyclerListView.animateEmptyView = true;
            recyclerListView.emptyViewAnimationType = 0;
            frameLayout.addView(stickerEmptyView);
            frameLayout.addView(recyclerListView);
            updateRows$20();
            RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(recyclerListView, true);
            this.itemsEnterAnimator = recyclerItemsEnterAnimator;
            recyclerListView.setItemsEnterAnimator(recyclerItemsEnterAnimator);
            ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter();
            this.viewPagerAdapter = viewPagerAdapter;
            setAdapter(viewPagerAdapter);
        }

        @Override
        public final boolean actionModeShowing() {
            return ((BaseFragment) TopicsFragment.this).actionBar.isActionModeShowed();
        }

        @Override
        public final void goToMessage(MessageObject messageObject) {
            Bundle bundle = new Bundle();
            long dialogId = messageObject.getDialogId();
            boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (zIsEncryptedDialog) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle.putLong("user_id", dialogId);
            } else {
                TLRPC.Chat chat = AccountInstance.getInstance(((BaseFragment) topicsFragment).currentAccount).getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat != null && chat.migrated_to != null) {
                    bundle.putLong("migrated_to", dialogId);
                    dialogId = -chat.migrated_to.channel_id;
                }
                bundle.putLong("chat_id", -dialogId);
            }
            bundle.putInt("message_id", messageObject.getId());
            topicsFragment.presentFragment(new ChatActivity(bundle));
        }

        @Override
        public final boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
            if (messageHashId == null) {
                return false;
            }
            int i = 0;
            while (true) {
                ArrayList arrayList = this.selectedItems;
                if (i >= arrayList.size()) {
                    return false;
                }
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                if (messageObject != null && messageObject.getId() == messageHashId.messageId && messageObject.getDialogId() == messageHashId.dialogId) {
                    return true;
                }
                i++;
            }
        }

        public final void loadMessages(String str) {
            if (this.messagesIsLoading) {
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            TopicsFragment topicsFragment = TopicsFragment.this;
            tL_messages_search.peer = topicsFragment.getMessagesController().getInputPeer(-topicsFragment.chatId);
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 20;
            tL_messages_search.q = str;
            ArrayList arrayList = this.searchResultMessages;
            if (!arrayList.isEmpty()) {
                tL_messages_search.offset_id = ((MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).getId();
            }
            this.messagesIsLoading = true;
            ConnectionsManager.getInstance(((BaseFragment) topicsFragment).currentAccount).sendRequest(tL_messages_search, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(6, this, str));
        }

        public final void search$1(View view, int i, String str, boolean z) {
            this.searchString = str;
            FrameLayout frameLayout = this.searchContainer;
            TopicsFragment topicsFragment = TopicsFragment.this;
            int i2 = 0;
            if (view != frameLayout) {
                if (view instanceof FilteredSearchView) {
                    FilteredSearchView filteredSearchView = (FilteredSearchView) view;
                    filteredSearchView.emptyView.setKeyboardHeight(0, false);
                    filteredSearchView.search(-topicsFragment.chatId, 0L, 0L, 0L, FiltersView.filters[((Item) this.viewPagerAdapter.items.get(i)).filterIndex], false, str, z);
                    return;
                }
                if (view instanceof SearchDownloadsContainer) {
                    SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) view;
                    searchDownloadsContainer.emptyView.setKeyboardHeight(0, false);
                    searchDownloadsContainer.searchQuery = str;
                    searchDownloadsContainer.update(false);
                    return;
                }
                return;
            }
            TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda9 = this.searchRunnable;
            if (todoItemMenu$$ExternalSyntheticLambda9 != null) {
                AndroidUtilities.cancelRunOnUIThread(todoItemMenu$$ExternalSyntheticLambda9);
                this.searchRunnable = null;
            }
            this.messagesIsLoading = false;
            this.canLoadMore = false;
            ArrayList arrayList = this.searchResultTopics;
            arrayList.clear();
            this.searchResultMessages.clear();
            updateRows$20();
            if (!TextUtils.isEmpty(str)) {
                updateRows$20();
                this.isLoading = true;
                this.emptyView.showProgress(true, true);
                TodoItemMenu$$ExternalSyntheticLambda9 todoItemMenu$$ExternalSyntheticLambda10 = new TodoItemMenu$$ExternalSyntheticLambda9(15, this, str);
                this.searchRunnable = todoItemMenu$$ExternalSyntheticLambda10;
                AndroidUtilities.runOnUIThread(todoItemMenu$$ExternalSyntheticLambda10, 200L);
                return;
            }
            this.isLoading = false;
            arrayList.clear();
            while (true) {
                ArrayList arrayList2 = topicsFragment.forumTopics;
                if (i2 >= arrayList2.size()) {
                    updateRows$20();
                    return;
                }
                if (((Item) arrayList2.get(i2)).topic != null) {
                    arrayList.add(((Item) arrayList2.get(i2)).topic);
                    ((Item) arrayList2.get(i2)).topic.searchQuery = null;
                }
                i2++;
            }
        }

        @Override
        public final void showActionMode() {
            ((BaseFragment) TopicsFragment.this).actionBar.showActionMode(null, null);
        }

        @Override
        public final void toggleItemSelection(MessageObject messageObject, View view, int i) {
            ArrayList arrayList = this.selectedItems;
            if (!arrayList.remove(messageObject)) {
                arrayList.add(messageObject);
            }
            if (arrayList.isEmpty()) {
                ((BaseFragment) TopicsFragment.this).actionBar.hideActionMode$1();
            }
        }

        public final void updateRows$20() {
            this.topicsHeaderRow = -1;
            this.topicsStartRow = -1;
            this.topicsEndRow = -1;
            this.messagesHeaderRow = -1;
            this.messagesStartRow = -1;
            this.messagesEndRow = -1;
            this.rowCount = 0;
            ArrayList arrayList = this.searchResultTopics;
            if (!arrayList.isEmpty()) {
                int i = this.rowCount;
                int i2 = i + 1;
                this.rowCount = i2;
                this.topicsHeaderRow = i;
                this.topicsStartRow = i2;
                int size = arrayList.size() + i2;
                this.rowCount = size;
                this.topicsEndRow = size;
            }
            ArrayList arrayList2 = this.searchResultMessages;
            if (!arrayList2.isEmpty()) {
                int i3 = this.rowCount;
                int i4 = i3 + 1;
                this.rowCount = i4;
                this.messagesHeaderRow = i3;
                this.messagesStartRow = i4;
                int size2 = arrayList2.size() + i4;
                this.rowCount = size2;
                this.messagesEndRow = size2;
            }
            this.searchAdapter.notifyDataSetChanged();
        }
    }

    public final class TopicDialogCell extends DialogCell {
        public AnimatedEmojiDrawable animatedEmojiDrawable;
        public boolean attached;
        public boolean closed;
        public TLRPC.TL_forumTopic currentTopic;
        public boolean drawDivider;
        public Drawable forumIcon;
        public Boolean hidden;
        public ValueAnimator hiddenAnimator;
        public float hiddenT;
        public boolean isGeneral;
        public int position;

        public TopicDialogCell(Context context, boolean z) {
            super(null, context, z, UserConfig.selectedAccount, null);
            this.position = -1;
            this.drawAvatar = false;
            this.messagePaddingStart = TopicsFragment.this.isInPreviewMode() ? 11 : 50;
            this.chekBoxPaddingTop = 24.0f;
            this.heightDefault = 64;
            this.heightThreeLines = 76;
            this.forbidVerified = true;
        }

        @Override
        public final void buildLayout$1() {
            super.buildLayout$1();
            setHiddenT();
        }

        @Override
        public final boolean drawLock2() {
            return this.closed;
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
        }

        @Override
        public final void onDraw(Canvas canvas) {
            PullForegroundDrawable pullForegroundDrawable;
            DialogCell.AnonymousClass3 anonymousClass3;
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (topicsFragment.getMessagesController().isMonoForum(-topicsFragment.chatId)) {
                super.onDraw(canvas);
                return;
            }
            this.xOffset = (!this.inPreviewMode || (anonymousClass3 = this.checkBox) == null) ? 0.0f : anonymousClass3.getProgress() * AndroidUtilities.dp(30.0f);
            canvas.save();
            float f = this.xOffset;
            int i = -AndroidUtilities.dp(4.0f);
            this.translateY = i;
            canvas.translate(f, i);
            canvas.drawColor(topicsFragment.getThemedColor(Theme.key_windowBackgroundWhite));
            super.onDraw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(this.translationX, 0.0f);
            if (this.drawDivider) {
                int iDp = this.fullSeparator ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f - this.translationX, getMeasuredHeight() - 1, getMeasuredWidth() - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
                } else {
                    canvas.drawLine(iDp - this.translationX, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            }
            if ((!this.isGeneral || (pullForegroundDrawable = this.archivedChatsDrawable) == null || pullForegroundDrawable.outProgress != 0.0f) && (this.animatedEmojiDrawable != null || this.forumIcon != null)) {
                int iDp2 = AndroidUtilities.dp(10.0f);
                int iDp3 = AndroidUtilities.dp(10.0f);
                int iDp4 = AndroidUtilities.dp(28.0f);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable != null) {
                    if (LocaleController.isRTL) {
                        animatedEmojiDrawable.setBounds((getWidth() - iDp2) - iDp4, iDp3, getWidth() - iDp2, iDp4 + iDp3);
                    } else {
                        animatedEmojiDrawable.setBounds(iDp2, iDp3, iDp2 + iDp4, iDp4 + iDp3);
                    }
                    this.animatedEmojiDrawable.draw(canvas);
                } else {
                    if (LocaleController.isRTL) {
                        this.forumIcon.setBounds((getWidth() - iDp2) - iDp4, iDp3, getWidth() - iDp2, iDp4 + iDp3);
                    } else {
                        this.forumIcon.setBounds(iDp2, iDp3, iDp2 + iDp4, iDp4 + iDp3);
                    }
                    this.forumIcon.draw(canvas);
                }
            }
            canvas.restore();
        }

        public void setAnimatedEmojiDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable2 == animatedEmojiDrawable) {
                return;
            }
            if (animatedEmojiDrawable2 != null && this.attached) {
                animatedEmojiDrawable2.removeView(this);
            }
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
            }
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            if (animatedEmojiDrawable == null || !this.attached) {
                return;
            }
            animatedEmojiDrawable.addView(this);
        }

        public void setForumIcon(Drawable drawable) {
            this.forumIcon = drawable;
        }

        public final void setHiddenT() {
            Drawable drawable = this.forumIcon;
            boolean z = drawable instanceof ForumUtilities.GeneralTopicDrawable;
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (z) {
                ((ForumUtilities.GeneralTopicDrawable) drawable).setColor(ColorUtils.blendARGB(this.hiddenT, topicsFragment.getThemedColor(Theme.key_chats_archivePullDownBackground), topicsFragment.getThemedColor(Theme.key_avatar_background2Saved)));
            }
            Drawable[] drawableArr = this.topicIconInName;
            if (drawableArr != null) {
                Drawable drawable2 = drawableArr[0];
                if (drawable2 instanceof ForumUtilities.GeneralTopicDrawable) {
                    ((ForumUtilities.GeneralTopicDrawable) drawable2).setColor(ColorUtils.blendARGB(this.hiddenT, topicsFragment.getThemedColor(Theme.key_chats_archivePullDownBackground), topicsFragment.getThemedColor(Theme.key_avatar_background2Saved)));
                }
            }
            invalidate();
        }

        public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
            this.currentTopic = tL_forumTopic;
            boolean z = false;
            this.closed = tL_forumTopic != null && tL_forumTopic.closed;
            if (this.inPreviewMode) {
                updateHidden(tL_forumTopic != null && tL_forumTopic.hidden);
            }
            this.isGeneral = tL_forumTopic != null && tL_forumTopic.id == 1;
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (tL_forumTopic != null && this != topicsFragment.generalTopicViewMoving) {
                if (tL_forumTopic.hidden) {
                    this.overrideSwipeAction = true;
                    this.overrideSwipeActionBackgroundColorKey = Theme.key_chats_archivePinBackground;
                    this.overrideSwipeActionRevealBackgroundColorKey = Theme.key_chats_archiveBackground;
                    this.overrideSwipeActionStringKey = "Unhide";
                    this.overrideSwipeActionStringId = R.string.Unhide;
                    this.overrideSwipeActionDrawable = Theme.dialogs_unpinArchiveDrawable;
                } else {
                    this.overrideSwipeAction = true;
                    this.overrideSwipeActionBackgroundColorKey = Theme.key_chats_archiveBackground;
                    this.overrideSwipeActionRevealBackgroundColorKey = Theme.key_chats_archivePinBackground;
                    this.overrideSwipeActionStringKey = "Hide";
                    this.overrideSwipeActionStringId = R.string.Hide;
                    this.overrideSwipeActionDrawable = Theme.dialogs_pinArchiveDrawable;
                }
                invalidate();
            }
            if (this.inPreviewMode) {
                return;
            }
            if (tL_forumTopic != null && tL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ForumUtilities.createGeneralTopicDrawable(getContext(), 1.0f, topicsFragment.getThemedColor(Theme.key_chat_inMenu), false));
            } else if (tL_forumTopic == null || tL_forumTopic.icon_emoji_id == 0) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ForumUtilities.createTopicDrawable(tL_forumTopic));
            } else {
                setForumIcon(null);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable == null || animatedEmojiDrawable.getDocumentId() != tL_forumTopic.icon_emoji_id) {
                    setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(topicsFragment.openedForForward ? 13 : 10, ((BaseFragment) topicsFragment).currentAccount, tL_forumTopic.icon_emoji_id));
                }
            }
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z = true;
            }
            updateHidden(z);
            super.buildLayout$1();
            setHiddenT();
        }

        public final void updateHidden(boolean z) {
            boolean z2 = this.hidden != null;
            ValueAnimator valueAnimator = this.hiddenAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.hiddenAnimator = null;
            }
            this.hidden = Boolean.valueOf(z);
            if (!z2) {
                this.hiddenT = z ? 1.0f : 0.0f;
                setHiddenT();
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.hiddenT, z ? 1.0f : 0.0f);
            this.hiddenAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 22));
            this.hiddenAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.hiddenAnimator.start();
        }
    }

    public abstract class TopicsRecyclerView extends BlurredRecyclerView {
        public static final int $r8$clinit = 0;
        public boolean firstLayout;
        public boolean ignoreLayout;
        public float viewOffset;

        public TopicsRecyclerView(Context context) {
            super(context, null);
            this.firstLayout = true;
            new Paint();
            new RectF();
            this.useLayoutPositionOnClick = true;
            this.additionalClipBottom = AndroidUtilities.dp(200.0f);
        }

        @Override
        public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            view.setTranslationY(this.viewOffset);
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }

        @Override
        public final boolean allowSelectChildAtPosition(View view) {
            return !(view instanceof HeaderCell) || view.isClickable();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (topicsFragment.generalTopicViewMoving != null) {
                canvas.save();
                canvas.translate(topicsFragment.generalTopicViewMoving.getLeft(), topicsFragment.generalTopicViewMoving.getY());
                topicsFragment.generalTopicViewMoving.draw(canvas);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            if (getItemAnimator() == null || !getItemAnimator().isRunning()) {
                return;
            }
            HashSet hashSet = TopicsFragment.settingsPreloaded;
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (getItemAnimator() != null && getItemAnimator().isRunning()) {
                HashSet hashSet = TopicsFragment.settingsPreloaded;
            }
            if (TopicsFragment.this.generalTopicViewMoving == view) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            if (topicsFragment.pullForegroundDrawable != null && this.viewOffset != 0.0f) {
                int paddingTop = getPaddingTop();
                if (paddingTop != 0) {
                    canvas.save();
                    canvas.translate(0.0f, paddingTop);
                }
                topicsFragment.pullForegroundDrawable.draw(canvas, true);
                if (paddingTop != 0) {
                    canvas.restore();
                }
            }
            super.onDraw(canvas);
        }

        @Override
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.fastScrollAnimationRunning) {
                HashSet hashSet = TopicsFragment.settingsPreloaded;
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (topicsFragment.getParentLayout() == null || !((ActionBarLayout) topicsFragment.getParentLayout()).isInPreviewMode()) {
                    if (motionEvent.getAction() == 0) {
                        ((BaseFragment) topicsFragment).actionBar.getClass();
                        RecyclerView.Adapter adapter = getAdapter();
                        if (topicsFragment.lastItemsCount != adapter.getItemCount()) {
                            this.ignoreLayout = true;
                            adapter.notifyDataSetChanged();
                            this.ignoreLayout = false;
                        }
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
            }
            return false;
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            HashSet hashSet = TopicsFragment.settingsPreloaded;
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.getClass();
            topicsFragment.getClass();
            topicsFragment.getClass();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            if (this.firstLayout) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (topicsFragment.getMessagesController().dialogsLoaded) {
                    if (topicsFragment.hiddenCount > 0) {
                        this.ignoreLayout = true;
                        ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(1, (int) ((BaseFragment) topicsFragment).actionBar.getTranslationY());
                        this.ignoreLayout = false;
                    }
                    this.firstLayout = false;
                }
            }
            super.onMeasure(i, i2);
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            LinearLayoutManager linearLayoutManager;
            int iFindFirstVisibleItemPosition;
            if (!this.fastScrollAnimationRunning) {
                HashSet hashSet = TopicsFragment.settingsPreloaded;
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (topicsFragment.getParentLayout() == null || !((ActionBarLayout) topicsFragment.getParentLayout()).isInPreviewMode()) {
                    int action = motionEvent.getAction();
                    if (action == 0) {
                        setOverScrollMode(0);
                    }
                    if (action == 1 || action == 3) {
                        AnonymousClass12 anonymousClass12 = topicsFragment.itemTouchHelper;
                        if (anonymousClass12.mActionState != 0 && topicsFragment.itemTouchHelperCallback.swipingFolder && anonymousClass12.checkHorizontalSwipe(4) != 0) {
                            topicsFragment.itemTouchHelperCallback.getClass();
                        }
                    }
                    boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
                    if ((action == 1 || action == 3) && topicsFragment.pullViewState == 2 && topicsFragment.hiddenCount > 0 && (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition()) == 0) {
                        int paddingTop = getPaddingTop();
                        View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                        int iDp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                        int measuredHeight = viewFindViewByPosition.getMeasuredHeight() + (viewFindViewByPosition.getTop() - paddingTop);
                        long jCurrentTimeMillis = System.currentTimeMillis() - topicsFragment.startArchivePullingTime;
                        if (measuredHeight < iDp || jCurrentTimeMillis < 200) {
                            smoothScrollBy(0, measuredHeight, CubicBezierInterpolator.EASE_OUT_QUINT);
                            topicsFragment.pullViewState = 2;
                        } else if (topicsFragment.pullViewState != 1) {
                            if (this.viewOffset == 0.0f) {
                                smoothScrollBy(0, viewFindViewByPosition.getTop() - paddingTop, CubicBezierInterpolator.EASE_OUT_QUINT);
                            }
                            if (!topicsFragment.canShowHiddenArchive) {
                                topicsFragment.canShowHiddenArchive = true;
                                try {
                                    performHapticFeedback(3, 2);
                                } catch (Exception unused) {
                                }
                                AnonymousClass6 anonymousClass6 = topicsFragment.pullForegroundDrawable;
                                if (anonymousClass6 != null) {
                                    anonymousClass6.colorize(true);
                                }
                            }
                            ((DialogCell) viewFindViewByPosition).startOutAnimation();
                            topicsFragment.pullViewState = 1;
                        }
                        float f = this.viewOffset;
                        if (f != 0.0f) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                            valueAnimatorOfFloat.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 23));
                            valueAnimatorOfFloat.setDuration(Math.max(100L, (long) TextureRenderer$$ExternalSyntheticOutline0.m(this.viewOffset, AndroidUtilities.dp(72.0f), 120.0f, 350.0f)));
                            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                            setScrollEnabled(false);
                            valueAnimatorOfFloat.addListener(new WebviewActivity.AnonymousClass3.AnonymousClass1(this, 9));
                            valueAnimatorOfFloat.start();
                        }
                    }
                    return zOnTouchEvent;
                }
            }
            return false;
        }

        @Override
        public final void removeView(View view) {
            super.removeView(view);
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }

        @Override
        public final void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        @Override
        public final void setAdapter(RecyclerView.Adapter adapter) {
            super.setAdapter(adapter);
            this.firstLayout = true;
        }

        public final void setArchiveHidden(boolean z, DialogCell dialogCell) {
            int i;
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.hiddenShown = z;
            if (z) {
                topicsFragment.layoutManager.scrollToPositionWithOffset(0, 0);
                i = topicsFragment.hiddenShown ? 0 : 2;
                topicsFragment.pullViewState = i;
                AnonymousClass6 anonymousClass6 = topicsFragment.pullForegroundDrawable;
                if (anonymousClass6 != null) {
                    anonymousClass6.willDraw = i != 0;
                }
                if (dialogCell != null) {
                    dialogCell.resetPinnedArchiveState();
                    dialogCell.invalidate();
                }
            } else if (dialogCell != null) {
                topicsFragment.layoutManager.scrollToPositionWithOffset(1, 0);
                i = topicsFragment.hiddenShown ? 0 : 2;
                topicsFragment.pullViewState = i;
                AnonymousClass6 anonymousClass7 = topicsFragment.pullForegroundDrawable;
                if (anonymousClass7 != null) {
                    anonymousClass7.willDraw = i != 0;
                }
            }
            Adapter.AnonymousClass1 anonymousClass1 = topicsFragment.emptyView;
            if (anonymousClass1 != null) {
                anonymousClass1.forceLayout();
            }
        }

        public final void setViewsOffset(float f) {
            View viewFindViewByPosition;
            this.viewOffset = f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setTranslationY(f);
            }
            if (this.selectorPosition != -1 && (viewFindViewByPosition = getLayoutManager().findViewByPosition(this.selectorPosition)) != null) {
                int left = viewFindViewByPosition.getLeft();
                int top = (int) (viewFindViewByPosition.getTop() + f);
                int right = viewFindViewByPosition.getRight();
                int bottom = (int) (viewFindViewByPosition.getBottom() + f);
                Rect rect = this.selectorRect;
                rect.set(left, top, right, bottom);
                this.selectorDrawable.setBounds(rect);
            }
            invalidate();
        }
    }

    public final class TouchHelperCallback extends ItemTouchHelper.Callback {
        public boolean swipingFolder;

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
            viewHolder.itemView.setPressed(false);
        }

        @Override
        public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            int iMakeMovementFlags = ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            if (adapterPosition >= 0) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (adapterPosition < topicsFragment.forumTopics.size() && ((Item) topicsFragment.forumTopics.get(adapterPosition)).topic != null && ChatObject.canManageTopics(topicsFragment.getMessagesController().getChat(Long.valueOf(topicsFragment.chatId)))) {
                    TLRPC.TL_forumTopic tL_forumTopic = ((Item) topicsFragment.forumTopics.get(adapterPosition)).topic;
                    if (topicsFragment.selectedTopics.isEmpty()) {
                        View view = viewHolder.itemView;
                        if ((view instanceof TopicDialogCell) && tL_forumTopic.id == 1) {
                            this.swipingFolder = true;
                            ((TopicDialogCell) view).setSliding(true);
                            return ItemTouchHelper.Callback.makeMovementFlags(0, 4);
                        }
                    }
                    return !tL_forumTopic.pinned ? iMakeMovementFlags : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                }
            }
            return iMakeMovementFlags;
        }

        @Override
        public final boolean isLongPressDragEnabled() {
            return !TopicsFragment.this.selectedTopics.isEmpty();
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
            int adapterPosition;
            if (viewHolder.mItemViewType != viewHolder2.mItemViewType || (adapterPosition = viewHolder2.getAdapterPosition()) < 0) {
                return false;
            }
            TopicsFragment topicsFragment = TopicsFragment.this;
            ArrayList arrayList = topicsFragment.forumTopics;
            if (adapterPosition >= arrayList.size() || ((Item) arrayList.get(adapterPosition)).topic == null || !((Item) arrayList.get(adapterPosition)).topic.pinned) {
                return false;
            }
            int adapterPosition2 = viewHolder.getAdapterPosition();
            int adapterPosition3 = viewHolder2.getAdapterPosition();
            Adapter adapter = topicsFragment.adapter;
            ArrayList arrayList2 = TopicsFragment.this.forumTopics;
            arrayList2.add(adapterPosition3, (Item) arrayList2.remove(adapterPosition2));
            TopicsFragment topicsFragment2 = TopicsFragment.this;
            RecyclerView.ItemAnimator itemAnimator = topicsFragment2.recyclerListView.getItemAnimator();
            AnonymousClass7 anonymousClass7 = topicsFragment2.itemAnimator;
            if (itemAnimator != anonymousClass7) {
                topicsFragment2.recyclerListView.setItemAnimator(anonymousClass7);
            }
            adapter.mObservable.notifyItemMoved(adapterPosition2, adapterPosition3);
            return true;
        }

        @Override
        public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            TopicsFragment topicsFragment = TopicsFragment.this;
            int i2 = 0;
            if (i != 0) {
                topicsFragment.recyclerListView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
                return;
            }
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (true) {
                ArrayList arrayList2 = topicsFragment.forumTopics;
                if (i2 >= arrayList2.size()) {
                    topicsFragment.getMessagesController().getTopicsController().reorderPinnedTopics(topicsFragment.chatId, arrayList);
                    return;
                }
                TLRPC.TL_forumTopic tL_forumTopic = ((Item) arrayList2.get(i2)).topic;
                if (tL_forumTopic != null && tL_forumTopic.pinned) {
                    arrayList.add(Integer.valueOf(tL_forumTopic.id));
                }
                i2++;
            }
        }

        @Override
        public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
            if (viewHolder != null) {
                TopicDialogCell topicDialogCell = (TopicDialogCell) viewHolder.itemView;
                TLRPC.TL_forumTopic tL_forumTopic = topicDialogCell.forumTopic;
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (tL_forumTopic != null) {
                    TopicsController topicsController = topicsFragment.getMessagesController().getTopicsController();
                    TLRPC.TL_forumTopic tL_forumTopic2 = topicDialogCell.forumTopic;
                    topicsController.toggleShowTopic(topicsFragment.chatId, tL_forumTopic2.id, tL_forumTopic2.hidden);
                }
                topicsFragment.generalTopicViewMoving = topicDialogCell;
                AnonymousClass5 anonymousClass5 = topicsFragment.recyclerListView;
                boolean z = !topicDialogCell.forumTopic.hidden;
                int i = TopicsRecyclerView.$r8$clinit;
                anonymousClass5.setArchiveHidden(z, topicDialogCell);
                topicsFragment.updateTopicsList(true, true);
                TLRPC.TL_forumTopic tL_forumTopic3 = topicDialogCell.currentTopic;
                if (tL_forumTopic3 != null) {
                    topicDialogCell.setTopicIcon(tL_forumTopic3);
                }
            }
        }
    }

    public TopicsFragment(Bundle bundle) {
        super(bundle);
        this.forumTopics = new ArrayList();
        new ArrayList();
        this.adapter = new Adapter();
        this.hiddenCount = 0;
        this.hiddenShown = true;
        this.animatedUpdateEnabled = true;
        this.bottomPannelVisible = true;
        this.searchAnimationProgress = 0.0f;
        this.selectedTopics = new HashSet();
        this.mute = false;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.slideFragmentProgress = 1.0f;
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        long j = this.arguments.getLong("chat_id", 0L);
        this.chatId = j;
        this.openedForSelect = this.arguments.getBoolean("for_select", false);
        this.openedForForward = this.arguments.getBoolean("forward_to", false);
        this.openedForBotShare = this.arguments.getBoolean("bot_share_to", false);
        this.openedForQuote = this.arguments.getBoolean("quote", false);
        this.openedForReply = this.arguments.getBoolean("reply_to", false);
        this.voiceChatHash = this.arguments.getString("voicechat", null);
        this.openVideoChat = this.arguments.getBoolean("videochat", false);
        this.topicsController = getMessagesController().getTopicsController();
        this.canShowProgress = true ^ NotificationsController$$ExternalSyntheticOutline0.m("topics_end_reached_", j, getUserConfig().getPreferences(), false);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT < 31) {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            return;
        }
        this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
        this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
        this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
        blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
    }

    public static BaseFragment getTopicsOrChat(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new ChatActivity(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new ChatActivity(bundle);
            }
        }
        return new TopicsFragment(bundle);
    }

    public static void prepareToSwitchAnimation(ChatActivity chatActivity) {
        if (chatActivity.getParentLayout() == null) {
            return;
        }
        if (((ActionBarLayout) chatActivity.getParentLayout()).getFragmentStack().size() <= 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -chatActivity.getDialogId());
            TopicsFragment topicsFragment = new TopicsFragment(bundle);
            ((ActionBarLayout) chatActivity.getParentLayout()).addFragmentToStack(ArticleViewer.IBlock.CC.m((ActionBarLayout) chatActivity.getParentLayout(), 1), topicsFragment);
        } else {
            BaseFragment baseFragment = (BaseFragment) ArticleViewer.IBlock.CC.m((ActionBarLayout) chatActivity.getParentLayout(), 2, ((ActionBarLayout) chatActivity.getParentLayout()).getFragmentStack());
            if (!(baseFragment instanceof TopicsFragment) || ((TopicsFragment) baseFragment).chatId != (-chatActivity.getDialogId())) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("chat_id", -chatActivity.getDialogId());
                TopicsFragment topicsFragment2 = new TopicsFragment(bundle2);
                ((ActionBarLayout) chatActivity.getParentLayout()).addFragmentToStack(ArticleViewer.IBlock.CC.m((ActionBarLayout) chatActivity.getParentLayout(), 1), topicsFragment2);
            }
        }
        chatActivity.switchFromTopics = true;
        chatActivity.finishFragment();
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    public final void animateToSearchView(boolean z) {
        DialogsActivity.AnonymousClass27 anonymousClass27;
        int i = 0;
        this.searching = z;
        ValueAnimator valueAnimator = this.searchAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.searchAnimator.cancel();
        }
        if (this.searchTabsView == null) {
            ViewPagerFixed.AnonymousClass3 anonymousClass3CreateTabsView = this.searchContainer.createTabsView(8, false);
            this.searchTabsView = anonymousClass3CreateTabsView;
            if (this.parentDialogsActivity != null) {
                anonymousClass3CreateTabsView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            }
            this.fullscreenView.addView(this.searchTabsView, LayoutHelper.createFrame(44.0f, -1));
        }
        this.searchAnimator = ValueAnimator.ofFloat(this.searchAnimationProgress, z ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchContainer, false, 1.0f, true);
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity != null && (anonymousClass27 = dialogsActivity.rightSlidingDialogContainer) != null) {
            anonymousClass27.enabled = !z;
        }
        this.animateSearchWithScale = !z && this.searchContainer.getVisibility() == 0 && this.searchContainer.getAlpha() == 1.0f;
        this.searchAnimator.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 21));
        this.searchContainer.setVisibility(0);
        if (z) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            updateCreateTopicButton(false);
        } else {
            this.other.setVisibility(0);
        }
        this.searchAnimator.addListener(new AnonymousClass20(this, z, i));
        this.searchAnimator.setDuration(200L);
        this.searchAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.searchAnimator.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public final void blur3_InvalidateBlur$11() {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f)));
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        View view = dialogsActivity != null ? dialogsActivity.fragmentView : this.fragmentView;
        ActionBar actionBar = dialogsActivity != null ? dialogsActivity.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + iDp + iDp2);
        RectF rectF = this.iBlur3PositionMainTabs;
        rectF.set(0.0f, iDp3, view.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        downscaleScrollableNoiseSuppressor.setupRenderNodes(this.parentDialogsActivity != null ? 2 : 1, this.iBlur3Positions);
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override
    public final boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return false;
    }

    @Override
    public final void checkAndUpdateAvatar() {
    }

    public final void checkForLoadMore() {
        AnonymousClass10 anonymousClass10;
        TopicsController topicsController = this.topicsController;
        long j = this.chatId;
        if (topicsController.endIsReached(j) || (anonymousClass10 = this.layoutManager) == null) {
            return;
        }
        int iFindLastVisibleItemPosition = anonymousClass10.findLastVisibleItemPosition();
        if (this.forumTopics.isEmpty() || iFindLastVisibleItemPosition >= this.adapter.getArray().size() - 4) {
            topicsController.loadTopics(j);
        }
        checkLoading();
    }

    public final void checkGroupCallJoin$1(boolean z) {
        String str;
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j);
        ChatObject.Call call = this.groupCall;
        if (call != null && ((str = this.voiceChatHash) != null || this.openVideoChat)) {
            VoIPHelper.startCall(chat, str, false, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.voiceChatHash = null;
            this.openVideoChat = false;
        } else {
            if (this.voiceChatHash == null || !z || chatFull == null || chatFull.call != null || this.fragmentView == null || getParentActivity() == null) {
                return;
            }
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.LinkHashExpired, BulletinFactory.of(this), R.raw.linkbroken, 36);
            this.voiceChatHash = null;
        }
    }

    public final void checkLoading() {
        this.loadingTopics = this.topicsController.isLoading(this.chatId);
        if (this.topicsEmptyView != null) {
            ArrayList arrayList = this.forumTopics;
            if (arrayList.size() == 0 || (arrayList.size() == 1 && ((Item) arrayList.get(0)).topic != null && ((Item) arrayList.get(0)).topic.id == 1)) {
                this.topicsEmptyView.showProgress(this.loadingTopics, this.fragmentBeginToShow);
            }
        }
        AnonymousClass5 anonymousClass5 = this.recyclerListView;
        if (anonymousClass5 != null) {
            anonymousClass5.checkIfEmpty(anonymousClass5.mIsAttached);
        }
        updateCreateTopicButton(true);
    }

    public final void checkUi_listViewPadding$5() {
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        float animatedHeightWithPadding = 0.0f;
        if (dialogsActivity != null) {
            int iDp = AndroidUtilities.dp(14.0f);
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = dialogsActivity.topPanelLayout;
            float animatedHeightWithPadding2 = (dialogsActivityTopPanelLayout != null ? dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(iDp) : 0.0f) + 0.0f;
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout2 = this.topPanelLayout;
            if (dialogsActivityTopPanelLayout2 != null) {
                float fDp = AndroidUtilities.dp(7.0f);
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout3 = this.parentDialogsActivity.topPanelLayout;
                dialogsActivityTopPanelLayout2.setTranslationY(animatedHeightWithPadding2 - ((dialogsActivityTopPanelLayout3 != null ? dialogsActivityTopPanelLayout3.getMetadata().totalVisibility.now : 0.0f) * fDp));
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout4 = this.topPanelLayout;
                int iDp2 = AndroidUtilities.dp(14.0f);
                int iDp3 = AndroidUtilities.dp(7.0f);
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout5 = this.parentDialogsActivity.topPanelLayout;
                animatedHeightWithPadding = dialogsActivityTopPanelLayout4.getAnimatedHeightWithPadding(AndroidUtilities.lerp(iDp2, iDp3, dialogsActivityTopPanelLayout5 != null ? dialogsActivityTopPanelLayout5.getMetadata().totalVisibility.now : 0.0f)) + animatedHeightWithPadding2;
            } else {
                animatedHeightWithPadding = animatedHeightWithPadding2;
            }
        } else {
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout6 = this.topPanelLayout;
            if (dialogsActivityTopPanelLayout6 != null) {
                animatedHeightWithPadding = 0.0f + dialogsActivityTopPanelLayout6.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f));
            }
        }
        this.recyclerListView.setPadding(0, (int) animatedHeightWithPadding, 0, this.navigationBarHeight + this.additionNavigationBarHeight + (this.bottomPannelVisible ? AndroidUtilities.dp(51.0f) : 0));
    }

    public final void clearSelectedTopics() {
        this.selectedTopics.clear();
        this.actionBar.hideActionMode$1();
        AndroidUtilities.updateVisibleRows(this.recyclerListView);
        updateReordering();
    }

    @Override
    public final View createView(Context context) {
        boolean z;
        final int i = 4;
        final int i2 = 2;
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        final int i3 = 0;
        this.additionNavigationBarHeight = (dialogsActivity == null || !dialogsActivity.hasMainTabs) ? 0 : AndroidUtilities.dp(72.0f);
        DialogsActivity dialogsActivity2 = this.parentDialogsActivity;
        this.additionFloatingButtonOffset = (dialogsActivity2 == null || !dialogsActivity2.hasMainTabs) ? 0 : AndroidUtilities.dp(64.0f);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.contentView = anonymousClass1;
        this.fragmentView = anonymousClass1;
        anonymousClass1.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        zzkt.m(this.actionBar);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2(context));
        this.actionBar.setOnClickListener(new View.OnClickListener(this) {
            public final TopicsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ActionBarMenuItem actionBarMenuItem;
                switch (i3) {
                    case 0:
                        TopicsFragment topicsFragment = this.f$0;
                        if (!topicsFragment.searching) {
                            topicsFragment.openProfile$1(false);
                        }
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.f$0;
                        topicsFragment2.presentFragment(TopicCreateFragment.create(topicsFragment2.chatId, 0L));
                        break;
                    case 2:
                        TopicsFragment topicsFragment3 = this.f$0;
                        MessagesController messagesController = topicsFragment3.getMessagesController();
                        long j = topicsFragment3.chatId;
                        messagesController.hidePeerSettingsBar(-j, null, topicsFragment3.getMessagesController().getChat(Long.valueOf(j)));
                        topicsFragment3.updateChatInfo(false);
                        break;
                    case 3:
                        this.f$0.lambda$createView$9$5(view);
                        break;
                    default:
                        DialogsActivity dialogsActivity3 = this.f$0.parentDialogsActivity;
                        if (dialogsActivity3 != null && (actionBarMenuItem = dialogsActivity3.searchItem) != null) {
                            actionBarMenuItem.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.parentDialogsActivity != null) {
            ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
            this.searchItem = actionBarMenuItemAddItem;
            actionBarMenuItemAddItem.setOnClickListener(new View.OnClickListener(this) {
                public final TopicsFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    ActionBarMenuItem actionBarMenuItem;
                    switch (i) {
                        case 0:
                            TopicsFragment topicsFragment = this.f$0;
                            if (!topicsFragment.searching) {
                                topicsFragment.openProfile$1(false);
                            }
                            break;
                        case 1:
                            TopicsFragment topicsFragment2 = this.f$0;
                            topicsFragment2.presentFragment(TopicCreateFragment.create(topicsFragment2.chatId, 0L));
                            break;
                        case 2:
                            TopicsFragment topicsFragment3 = this.f$0;
                            MessagesController messagesController = topicsFragment3.getMessagesController();
                            long j = topicsFragment3.chatId;
                            messagesController.hidePeerSettingsBar(-j, null, topicsFragment3.getMessagesController().getChat(Long.valueOf(j)));
                            topicsFragment3.updateChatInfo(false);
                            break;
                        case 3:
                            this.f$0.lambda$createView$9$5(view);
                            break;
                        default:
                            DialogsActivity dialogsActivity3 = this.f$0.parentDialogsActivity;
                            if (dialogsActivity3 != null && (actionBarMenuItem = dialogsActivity3.searchItem) != null) {
                                actionBarMenuItem.performClick();
                                break;
                            }
                            break;
                    }
                }
            });
        } else {
            ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
            this.searchItem = actionBarMenuItemAddItem2;
            actionBarMenuItemAddItem2.setIsSearchField$1();
            actionBarMenuItemAddItem2.listener = new AnonymousClass3(this, i3);
            this.searchItem.setSearchPaddingStart(56);
            this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.searchItem.getSearchField();
            searchField.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
            searchField.setCursorColor(getThemedColor(Theme.key_chat_messagePanelCursor));
        }
        ActionBarMenuItem actionBarMenuItemAddItem3 = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other, null);
        this.other = actionBarMenuItemAddItem3;
        actionBarMenuItemAddItem3.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.other.addSubItem(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.addMemberSubMenu = this.other.addSubItem(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        ActionBarMenuItem actionBarMenuItem = this.other;
        int i4 = R.raw.boosts;
        this.boostGroupSubmenu = actionBarMenuItem.addSubItem(14, 0, new RLottieDrawable(i4, SurfaceContainer$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), true, null), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false, actionBarMenuItem.resourcesProvider);
        ActionBarMenuItem actionBarMenuItem2 = this.other;
        int i5 = R.drawable.msg_topic_create;
        int i6 = R.string.CreateTopic;
        this.createTopicSubmenu = actionBarMenuItem2.addSubItem(3, i5, LocaleController.getString(i6));
        this.reportSubmenu = this.other.addSubItem(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.deleteChatSubmenu = this.other.addSubItem(11, R.drawable.msg_leave, null, LocaleController.getString(R.string.LeaveMegaMenu), true, false, null);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, this, false, this.resourceProvider);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.avatarContainer.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
        long j = this.chatId;
        long j2 = -j;
        chatAvatarContainer2.allowDrawStories = j2 < 0;
        chatAvatarContainer2.setClipChildren(false);
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.openedForSelect) {
            this.avatarContainer.getAvatarImageView().setOnClickListener(new ChatActivity.AnonymousClass109(this, 9));
        }
        this.recyclerListView = new AnonymousClass5(context);
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.contentView);
        ViewGroup viewGroup = this.contentView;
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = this.iBlur3FactoryLiquidGlass;
        blurredBackgroundDrawableViewFactory.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory.parent = viewGroup;
        AnonymousClass5 anonymousClass5 = this.recyclerListView;
        DialogsActivity dialogsActivity3 = this.parentDialogsActivity;
        if (dialogsActivity3 != null) {
            viewGroup = (ViewGroup) dialogsActivity3.getFragmentView();
        }
        AnonymousClass5 anonymousClass6 = this.recyclerListView;
        Objects.requireNonNull(anonymousClass6);
        this.iBlur3Capture = new ViewGroupPartRenderer(anonymousClass5, viewGroup, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass6, 0));
        this.recyclerListView.addEdgeEffectListener(new TopicsFragment$$ExternalSyntheticLambda8(this, i3));
        SpannableString spannableString = new SpannableString("#");
        ForumUtilities.GeneralTopicDrawable generalTopicDrawableCreateGeneralTopicDrawable = ForumUtilities.createGeneralTopicDrawable(getParentActivity(), 0.85f, -1, false);
        generalTopicDrawableCreateGeneralTopicDrawable.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(generalTopicDrawableCreateGeneralTopicDrawable, 2), 0, 1, 33);
        AnonymousClass6 anonymousClass7 = new AnonymousClass6(this, AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString));
        this.pullForegroundDrawable = anonymousClass7;
        anonymousClass7.doNotShow();
        int i7 = this.hiddenShown ? 2 : 0;
        this.pullViewState = i7;
        this.pullForegroundDrawable.willDraw = i7 != 0;
        AnonymousClass7 anonymousClass8 = new AnonymousClass7();
        this.recyclerListView.setHideIfEmpty(false);
        anonymousClass8.mSupportsChangeAnimations = false;
        anonymousClass8.delayAnimations = false;
        AnonymousClass5 anonymousClass9 = this.recyclerListView;
        this.itemAnimator = anonymousClass8;
        anonymousClass9.setItemAnimator(anonymousClass8);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final TopicsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                boolean z2;
                TopicsFragment topicsFragment;
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                switch (i3) {
                    case 0:
                        this.this$0.checkForLoadMore();
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.this$0;
                        int iFindFirstVisibleItemPosition = topicsFragment2.layoutManager.findFirstVisibleItemPosition();
                        if (iFindFirstVisibleItemPosition != -1) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            int top = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : 0;
                            if (iFindFirstVisibleItemPosition == 0) {
                                int i10 = 0 - top;
                                z2 = top < 0;
                                Math.abs(i10);
                            } else {
                                z2 = iFindFirstVisibleItemPosition > 0;
                            }
                            topicsFragment2.hideFloatingButton(z2 || !topicsFragment2.canShowCreateTopic, true);
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (topicsFragment = this.this$0).scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i8, i9);
                            topicsFragment.blur3_InvalidateBlur$11();
                            break;
                        }
                        break;
                }
            }
        });
        AnonymousClass5 anonymousClass10 = this.recyclerListView;
        anonymousClass10.animateEmptyView = true;
        anonymousClass10.emptyViewAnimationType = 0;
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(anonymousClass10, true);
        this.itemsEnterAnimator = recyclerItemsEnterAnimator;
        this.recyclerListView.setItemsEnterAnimator(recyclerItemsEnterAnimator);
        this.recyclerListView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda9(this, i3));
        this.recyclerListView.setOnItemLongClickListener(new TopicsFragment$$ExternalSyntheticLambda5(this));
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final TopicsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                boolean z2;
                TopicsFragment topicsFragment;
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                switch (i2) {
                    case 0:
                        this.this$0.checkForLoadMore();
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.this$0;
                        int iFindFirstVisibleItemPosition = topicsFragment2.layoutManager.findFirstVisibleItemPosition();
                        if (iFindFirstVisibleItemPosition != -1) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            int top = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : 0;
                            if (iFindFirstVisibleItemPosition == 0) {
                                int i10 = 0 - top;
                                z2 = top < 0;
                                Math.abs(i10);
                            } else {
                                z2 = iFindFirstVisibleItemPosition > 0;
                            }
                            topicsFragment2.hideFloatingButton(z2 || !topicsFragment2.canShowCreateTopic, true);
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (topicsFragment = this.this$0).scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i8, i9);
                            topicsFragment.blur3_InvalidateBlur$11();
                            break;
                        }
                        break;
                }
            }
        });
        AnonymousClass5 anonymousClass11 = this.recyclerListView;
        AnonymousClass10 anonymousClass12 = new AnonymousClass10();
        this.layoutManager = anonymousClass12;
        anonymousClass11.setLayoutManager(anonymousClass12);
        new SparseArray();
        new HashMap();
        this.recyclerListView.setAdapter(this.adapter);
        this.recyclerListView.setClipToPadding(false);
        final int i8 = 1;
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
            public final TopicsFragment this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i9, int i10) {
                boolean z2;
                TopicsFragment topicsFragment;
                DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
                switch (i8) {
                    case 0:
                        this.this$0.checkForLoadMore();
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.this$0;
                        int iFindFirstVisibleItemPosition = topicsFragment2.layoutManager.findFirstVisibleItemPosition();
                        if (iFindFirstVisibleItemPosition != -1) {
                            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                            int top = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : 0;
                            if (iFindFirstVisibleItemPosition == 0) {
                                int i11 = 0 - top;
                                z2 = top < 0;
                                Math.abs(i11);
                            } else {
                                z2 = iFindFirstVisibleItemPosition > 0;
                            }
                            topicsFragment2.hideFloatingButton(z2 || !topicsFragment2.canShowCreateTopic, true);
                        }
                        break;
                    default:
                        if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = (topicsFragment = this.this$0).scrollableViewNoiseSuppressor) != null) {
                            downscaleScrollableNoiseSuppressor.onScrolled(i9, i10);
                            topicsFragment.blur3_InvalidateBlur$11();
                            break;
                        }
                        break;
                }
            }
        });
        TouchHelperCallback touchHelperCallback = new TouchHelperCallback();
        this.itemTouchHelperCallback = touchHelperCallback;
        ?? r2 = new ItemTouchHelper(touchHelperCallback) {
            @Override
            public final boolean shouldSwipeBack() {
                return TopicsFragment.this.hiddenCount > 0;
            }
        };
        this.itemTouchHelper = r2;
        r2.attachToRecyclerView(this.recyclerListView);
        this.contentView.addView(this.recyclerListView, LayoutHelper.createFrame(-1.0f, -1));
        ((ViewGroup.MarginLayoutParams) this.recyclerListView.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(getParentActivity(), this.resourceProvider, false);
        this.floatingButton = fragmentFloatingButton;
        this.contentView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        final int i9 = 1;
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final TopicsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ActionBarMenuItem actionBarMenuItem3;
                switch (i9) {
                    case 0:
                        TopicsFragment topicsFragment = this.f$0;
                        if (!topicsFragment.searching) {
                            topicsFragment.openProfile$1(false);
                        }
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.f$0;
                        topicsFragment2.presentFragment(TopicCreateFragment.create(topicsFragment2.chatId, 0L));
                        break;
                    case 2:
                        TopicsFragment topicsFragment3 = this.f$0;
                        MessagesController messagesController = topicsFragment3.getMessagesController();
                        long j3 = topicsFragment3.chatId;
                        messagesController.hidePeerSettingsBar(-j3, null, topicsFragment3.getMessagesController().getChat(Long.valueOf(j3)));
                        topicsFragment3.updateChatInfo(false);
                        break;
                    case 3:
                        this.f$0.lambda$createView$9$5(view);
                        break;
                    default:
                        DialogsActivity dialogsActivity4 = this.f$0.parentDialogsActivity;
                        if (dialogsActivity4 != null && (actionBarMenuItem3 = dialogsActivity4.searchItem) != null) {
                            actionBarMenuItem3.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.floatingButton.imageView.setImageResource(R.drawable.ic_chatlist_add_2);
        this.floatingButton.imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.floatingButton.imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.floatingButton.setContentDescription(LocaleController.getString(i6));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        flickerLoadingView.setViewType(24);
        flickerLoadingView.setVisibility(8);
        flickerLoadingView.showDate = true;
        EmptyViewContainer emptyViewContainer = new EmptyViewContainer(this, context);
        this.emptyViewContainer = emptyViewContainer;
        emptyViewContainer.textView.setAlpha(0.0f);
        AnonymousClass13 anonymousClass13 = new AnonymousClass13(this, context, flickerLoadingView);
        this.topicsEmptyView = anonymousClass13;
        try {
            anonymousClass13.stickerView.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.topicsEmptyView.showProgress(this.loadingTopics, this.fragmentBeginToShow);
        this.topicsEmptyView.title.setText(LocaleController.getString(R.string.NoTopics));
        updateTopicsEmptyViewText();
        this.emptyViewContainer.addView(flickerLoadingView);
        this.emptyViewContainer.addView(this.topicsEmptyView);
        this.contentView.addView(this.emptyViewContainer);
        this.recyclerListView.setEmptyView(this.emptyViewContainer);
        this.bottomOverlayContainer = new AnonymousClass14(context, i3);
        UnreadCounterTextView unreadCounterTextView = new UnreadCounterTextView(context);
        this.bottomOverlayChatText = unreadCounterTextView;
        this.bottomOverlayContainer.addView(unreadCounterTextView);
        this.contentView.addView(this.bottomOverlayContainer, LayoutHelper.createFrame(-1, 51, 80));
        this.bottomOverlayChatText.setOnClickListener(new AnonymousClass15());
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.bottomOverlayProgress = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.bottomOverlayProgress.setVisibility(4);
        this.bottomOverlayContainer.addView(this.bottomOverlayProgress, LayoutHelper.createFrame(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.closeReportSpam = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.closeReportSpam.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.closeReportSpam;
        int i10 = Theme.key_chat_topPanelClose;
        imageView2.setBackground(new BaseCell.RippleDrawableSafe(new ColorStateList(new int[][]{StateSet.WILD_CARD}, new int[]{Theme.AdaptiveRipple.calcRippleColor(getThemedColor(i10))}), null, new Theme.AdaptiveRipple.CircleDrawable()));
        this.closeReportSpam.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
        this.closeReportSpam.setScaleType(ImageView.ScaleType.CENTER);
        this.bottomOverlayContainer.addView(this.closeReportSpam, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.closeReportSpam.setOnClickListener(new View.OnClickListener(this) {
            public final TopicsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ActionBarMenuItem actionBarMenuItem3;
                switch (i2) {
                    case 0:
                        TopicsFragment topicsFragment = this.f$0;
                        if (!topicsFragment.searching) {
                            topicsFragment.openProfile$1(false);
                        }
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.f$0;
                        topicsFragment2.presentFragment(TopicCreateFragment.create(topicsFragment2.chatId, 0L));
                        break;
                    case 2:
                        TopicsFragment topicsFragment3 = this.f$0;
                        MessagesController messagesController = topicsFragment3.getMessagesController();
                        long j3 = topicsFragment3.chatId;
                        messagesController.hidePeerSettingsBar(-j3, null, topicsFragment3.getMessagesController().getChat(Long.valueOf(j3)));
                        topicsFragment3.updateChatInfo(false);
                        break;
                    case 3:
                        this.f$0.lambda$createView$9$5(view);
                        break;
                    default:
                        DialogsActivity dialogsActivity4 = this.f$0.parentDialogsActivity;
                        if (dialogsActivity4 != null && (actionBarMenuItem3 = dialogsActivity4.searchItem) != null) {
                            actionBarMenuItem3.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.closeReportSpam.setVisibility(8);
        updateChatInfo(false);
        LoginActivity.AnonymousClass4 anonymousClass4 = new LoginActivity.AnonymousClass4(this, context, 25);
        this.fullscreenView = anonymousClass4;
        if (this.parentDialogsActivity == null) {
            this.contentView.addView(anonymousClass4, LayoutHelper.createFrame(-1, -1, 119));
        }
        MessagesSearchContainer messagesSearchContainer = new MessagesSearchContainer(context);
        this.searchContainer = messagesSearchContainer;
        messagesSearchContainer.setVisibility(8);
        this.fullscreenView.addView(this.searchContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        MessagesSearchContainer messagesSearchContainer2 = this.searchContainer;
        int i11 = Theme.key_windowBackgroundWhite;
        messagesSearchContainer2.setBackgroundColor(getThemedColor(i11));
        this.actionBar.setDrawBlurBackground(this.contentView);
        getMessagesStorage().loadChatInfo(this.chatId, true, null, true, false, 0);
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(this.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(this.resourceProvider), false);
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        this.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        this.topPanelLayout.setOnAnimatedHeightChangedListener(new TopicsFragment$$ExternalSyntheticLambda8(this, i2));
        this.contentView.addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        if (chat != null) {
            ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = new ChatActivityMemberRequestsDelegate(chat, this);
            this.pendingRequestsDelegate = chatActivityMemberRequestsDelegate;
            this.topPanelLayout.addView(chatActivityMemberRequestsDelegate.getView(), LayoutHelper.createLinear(-1, 40));
            this.topPanelLayout.setPriority(3, this.pendingRequestsDelegate.getView());
            ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate2 = this.pendingRequestsDelegate;
            chatActivityMemberRequestsDelegate2.delegate = new TopicsFragment$$ExternalSyntheticLambda5(this);
            TLRPC.ChatFull chatFull = this.chatFull;
            chatActivityMemberRequestsDelegate2.chatInfo = chatFull;
            if (chatFull != null) {
                chatActivityMemberRequestsDelegate2.setPendingRequests(chatFull.requests_pending, chatFull.recent_requesters, false);
            }
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout = new FrameLayout(context);
            this.fragmentContextViewWrapper = frameLayout;
            this.topPanelLayout.addView(frameLayout);
            this.topPanelLayout.setPriority(4, this.fragmentContextViewWrapper);
            this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
            ?? r3 = new FragmentContextView(context, this) {
                @Override
                public final void setVisibility(int i12) {
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    topicsFragment.topPanelLayout.setViewVisible(topicsFragment.fragmentContextViewWrapper, i12 == 0, true);
                }
            };
            this.fragmentContextView = r3;
            this.fragmentContextViewWrapper.addView(r3);
            this.topPanelLayout.setCallFragmentContextView(this.fragmentContextView);
        }
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-2.0f, -1);
        if (this.inPreviewMode) {
            layoutParamsCreateFrame.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.contentView.addView(this.actionBar, layoutParamsCreateFrame);
        }
        checkForLoadMore();
        AnonymousClass18 anonymousClass18 = new AnonymousClass18(context);
        this.blurredView = anonymousClass18;
        if (Build.VERSION.SDK_INT >= 23) {
            anonymousClass18.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i11), 100)));
        }
        this.blurredView.setFocusable(false);
        this.blurredView.setImportantForAccessibility(2);
        final int i12 = 3;
        this.blurredView.setOnClickListener(new View.OnClickListener(this) {
            public final TopicsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ActionBarMenuItem actionBarMenuItem3;
                switch (i12) {
                    case 0:
                        TopicsFragment topicsFragment = this.f$0;
                        if (!topicsFragment.searching) {
                            topicsFragment.openProfile$1(false);
                        }
                        break;
                    case 1:
                        TopicsFragment topicsFragment2 = this.f$0;
                        topicsFragment2.presentFragment(TopicCreateFragment.create(topicsFragment2.chatId, 0L));
                        break;
                    case 2:
                        TopicsFragment topicsFragment3 = this.f$0;
                        MessagesController messagesController = topicsFragment3.getMessagesController();
                        long j3 = topicsFragment3.chatId;
                        messagesController.hidePeerSettingsBar(-j3, null, topicsFragment3.getMessagesController().getChat(Long.valueOf(j3)));
                        topicsFragment3.updateChatInfo(false);
                        break;
                    case 3:
                        this.f$0.lambda$createView$9$5(view);
                        break;
                    default:
                        DialogsActivity dialogsActivity4 = this.f$0.parentDialogsActivity;
                        if (dialogsActivity4 != null && (actionBarMenuItem3 = dialogsActivity4.searchItem) != null) {
                            actionBarMenuItem3.performClick();
                            break;
                        }
                        break;
                }
            }
        });
        this.blurredView.setFitsSystemWindows(true);
        this.bottomPannelVisible = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            for (BaseFragment baseFragment : ((ActionBarLayout) getParentLayout()).getFragmentStack()) {
                if (baseFragment instanceof DialogsActivity) {
                    DialogsActivity dialogsActivity4 = (DialogsActivity) baseFragment;
                    if (dialogsActivity4.isMainDialogList()) {
                        MessagesStorage.TopicKey topicKey = dialogsActivity4.openedDialogId;
                        if (topicKey.dialogId == j2) {
                            this.selectedTopicForTablet = topicKey.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            z = false;
            updateTopicsList(false, false);
        } else {
            z = false;
        }
        updateChatInfo(z);
        RadialProgressView radialProgressView2 = this.bottomOverlayProgress;
        if (radialProgressView2 != null) {
            radialProgressView2.setProgressColor(getThemedColor(Theme.key_chat_fieldOverlayText));
            this.floatingButton.updateColors$1();
            AnonymousClass14 anonymousClass14 = this.bottomOverlayContainer;
            int i13 = Theme.key_windowBackgroundWhite;
            anonymousClass14.setBackgroundColor(getThemedColor(i13));
            this.actionBar.setActionModeColor(getThemedColor(i13));
            if (!this.inPreviewMode) {
                this.actionBar.setBackgroundColor(getThemedColor(Theme.key_actionBarDefault));
            }
            this.searchContainer.setBackgroundColor(getThemedColor(i13));
        }
        if (ChatObject.isBoostSupported(getMessagesController().getChat(Long.valueOf(j)))) {
            getMessagesController().getBoostsController().getBoostsStats(j2, new QrActivity$5$$ExternalSyntheticLambda0(this, 14));
        }
        View view = this.fragmentView;
        TopicsFragment$$ExternalSyntheticLambda5 topicsFragment$$ExternalSyntheticLambda5 = new TopicsFragment$$ExternalSyntheticLambda5(this);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(view, topicsFragment$$ExternalSyntheticLambda5);
        return this.fragmentView;
    }

    public final void deleteTopics$1(HashSet hashSet, Runnable runnable) {
        int i = 0;
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String pluralString = LocaleController.getPluralString("DeleteTopics", hashSet.size());
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = pluralString;
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            alertDialog.message = LocaleController.formatString(R.string.DeleteSelectedTopic, this.topicsController.findTopic(this.chatId, ((Integer) arrayList.get(0)).intValue()).title);
        } else {
            alertDialog.message = LocaleController.getString(R.string.DeleteSelectedTopics);
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new ArticleViewer$$ExternalSyntheticLambda54(this, hashSet, arrayList, runnable, 20));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new TopicsFragment$$ExternalSyntheticLambda25(i));
        alertDialog.show();
        TextView textView = (TextView) alertDialog.getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        int i3 = NotificationCenter.chatInfoDidLoad;
        long j = this.chatId;
        if (i == i3) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.chatFull) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == j) {
                updateChatInfo(false);
                ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = this.pendingRequestsDelegate;
                if (chatActivityMemberRequestsDelegate != null) {
                    chatActivityMemberRequestsDelegate.chatInfo = chatFull2;
                    chatActivityMemberRequestsDelegate.setPendingRequests(chatFull2.requests_pending, chatFull2.recent_requesters, true);
                }
                checkGroupCallJoin$1(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == NotificationCenter.storiesUpdated) {
            updateChatInfo(false);
        } else if (i == NotificationCenter.chatWasBoostedByUser) {
            if (j == (-((Long) objArr[2]).longValue())) {
                this.boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == NotificationCenter.topicsDidLoaded) {
            if (j == ((Long) objArr[0]).longValue()) {
                updateTopicsList(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    checkForLoadMore();
                }
                checkLoading();
            }
        } else if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if (iIntValue == MessagesController.UPDATE_MASK_CHAT) {
                updateChatInfo(false);
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(j, false);
                boolean zCanScrollVertically = this.recyclerListView.canScrollVertically(-1);
                updateTopicsList(true, false);
                if (!zCanScrollVertically) {
                    this.layoutManager.scrollToPosition(0);
                }
            }
        } else if (i == NotificationCenter.dialogsNeedReload) {
            updateTopicsList(false, false);
        } else if (i == NotificationCenter.groupCallUpdated) {
            Long l = (Long) objArr[0];
            if (j == l.longValue()) {
                this.groupCall = getMessagesController().getGroupCall(l.longValue(), false);
                AnonymousClass17 anonymousClass17 = this.fragmentContextView;
                if (anonymousClass17 != null) {
                    anonymousClass17.checkCall(!this.fragmentBeginToShow);
                }
                checkGroupCallJoin$1(false);
            }
        } else if (i == NotificationCenter.notificationsSettingsUpdated) {
            updateTopicsList(false, false);
            updateChatInfo(true);
        } else if (i != NotificationCenter.chatSwitchedForum && i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            long jLongValue = ((Long) objArr[0]).longValue();
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (jLongValue != (-j) || zBooleanValue) {
                if (this.selectedTopicForTablet != 0) {
                    this.selectedTopicForTablet = 0L;
                    updateTopicsList(false, false);
                    return;
                }
                return;
            }
            if (this.selectedTopicForTablet != jLongValue2) {
                this.selectedTopicForTablet = jLongValue2;
                updateTopicsList(false, false);
            }
        }
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final ChatAvatarContainer getAvatarContainer() {
        return this.avatarContainer;
    }

    @Override
    public final SizeNotifierFrameLayout getContentView() {
        return this.contentView;
    }

    @Override
    public final TLRPC.Chat getCurrentChat() {
        return getMessagesController().getChat(Long.valueOf(this.chatId));
    }

    @Override
    public final TLRPC.User getCurrentUser() {
        return null;
    }

    @Override
    public final long getDialogId() {
        return -this.chatId;
    }

    @Override
    public final BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.groupCall;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override
    public final long getMergeDialogId() {
        return 0L;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        RecyclerListView recyclerListView;
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(21, this);
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        MessagesSearchContainer messagesSearchContainer = this.searchContainer;
        if (messagesSearchContainer != null && (recyclerListView = messagesSearchContainer.recyclerView) != null) {
            GraySectionCell.createThemeDescriptions(arrayList, recyclerListView);
        }
        return arrayList;
    }

    @Override
    public final long getTopicId() {
        return 0L;
    }

    public final void hideFloatingButton(boolean z, boolean z2) {
        this.floatingButton.animatorButtonVisible.setValue(!z, this.fragmentBeginToShow && z2);
    }

    @Override
    public final boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.searching ? Theme.key_windowBackgroundWhite : Theme.key_actionBarDefault);
        if (this.actionBar.isActionModeShowed()) {
            themedColor = getThemedColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(themedColor) > 0.699999988079071d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$3$1(View view) {
        if (getParentLayout() != null && !((ActionBarLayout) getParentLayout()).isInPreviewMode() && (view instanceof TopicDialogCell)) {
            TLRPC.TL_forumTopic tL_forumTopic = ((TopicDialogCell) view).forumTopic;
            MessagesController messagesController = getMessagesController();
            long j = this.chatId;
            long j2 = -j;
            long peerDialogId = tL_forumTopic == null ? 0L : messagesController.isMonoForum(j2) ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
            if (!this.openedForSelect) {
                if (this.selectedTopics.size() > 0) {
                    toggleSelection(view);
                    return;
                }
                if (this.inPreviewMode && AndroidUtilities.isTablet()) {
                    for (BaseFragment baseFragment : ((ActionBarLayout) getParentLayout()).getFragmentStack()) {
                        if (baseFragment instanceof DialogsActivity) {
                            DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                            if (dialogsActivity.isMainDialogList()) {
                                MessagesStorage.TopicKey topicKey = dialogsActivity.openedDialogId;
                                if (topicKey.dialogId == j2 && topicKey.topicId == peerDialogId) {
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    this.selectedTopicForTablet = peerDialogId;
                    updateTopicsList(false, false);
                }
                ForumUtilities.openTopic(this, j, tL_forumTopic, 0);
                return;
            }
            TopicsNotifySettingsFragments$2$$ExternalSyntheticLambda0 topicsNotifySettingsFragments$2$$ExternalSyntheticLambda0 = this.onTopicSelectedListener;
            if (topicsNotifySettingsFragments$2$$ExternalSyntheticLambda0 != null) {
                TopicsNotifySettingsFragments.AnonymousClass2 anonymousClass2 = topicsNotifySettingsFragments$2$$ExternalSyntheticLambda0.f$0;
                anonymousClass2.getClass();
                Bundle bundle = new Bundle();
                TopicsNotifySettingsFragments topicsNotifySettingsFragments = TopicsNotifySettingsFragments.this;
                bundle.putLong("dialog_id", topicsNotifySettingsFragments.dialogId);
                bundle.putLong("topic_id", tL_forumTopic.id);
                bundle.putBoolean("exception", true);
                ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle, null);
                profileNotificationsActivity.delegate = new TodoItemMenu$$ExternalSyntheticLambda19(2, anonymousClass2, tL_forumTopic);
                topicsNotifySettingsFragments.presentFragment(profileNotificationsActivity);
            }
            DialogsActivity dialogsActivity2 = this.dialogsActivity;
            if (dialogsActivity2 != null) {
                dialogsActivity2.didSelectResult(j2, peerDialogId, true, this);
            }
        }
    }

    public final boolean lambda$createView$4(View view, float f) {
        if (this.openedForSelect || getParentLayout() == null || ((ActionBarLayout) getParentLayout()).isInPreviewMode()) {
            return false;
        }
        if (!this.actionBar.isActionModeShowed() && !AndroidUtilities.isTablet() && (view instanceof TopicDialogCell)) {
            TopicDialogCell topicDialogCell = (TopicDialogCell) view;
            if (topicDialogCell.isPointInsideAvatar(f)) {
                showChatPreview$1(topicDialogCell);
                this.recyclerListView.cancelClickRunnables(true);
                this.recyclerListView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        toggleSelection(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    public final void lambda$getThemeDescriptions$24$1() {
        ViewGroup viewGroup;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                viewGroup = this.recyclerListView;
            } else {
                MessagesSearchContainer messagesSearchContainer = this.searchContainer;
                viewGroup = messagesSearchContainer != null ? messagesSearchContainer.recyclerView : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ProfileSearchCell) {
                        ((ProfileSearchCell) childAt).update(0);
                    } else if (childAt instanceof DialogCell) {
                        ((DialogCell) childAt).update(0, true);
                    } else if (childAt instanceof UserCell) {
                        ((UserCell) childAt).update(0);
                    }
                }
            }
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setPopupBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground), true);
            this.actionBar.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false, true);
            this.actionBar.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true, true);
            ActionBar actionBar2 = this.actionBar;
            int themedColor = getThemedColor(Theme.key_dialogButtonSelector);
            ActionBar.AnonymousClass1 anonymousClass1 = actionBar2.actionMode;
            if (anonymousClass1 != null) {
                anonymousClass1.setPopupItemsSelectorColor(themedColor);
            }
        }
        AnonymousClass18 anonymousClass18 = this.blurredView;
        if (anonymousClass18 != null && Build.VERSION.SDK_INT >= 23) {
            anonymousClass18.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundWhite), 100)));
        }
        RadialProgressView radialProgressView = this.bottomOverlayProgress;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(Theme.key_chat_fieldOverlayText));
        this.floatingButton.updateColors$1();
        AnonymousClass14 anonymousClass14 = this.bottomOverlayContainer;
        int i3 = Theme.key_windowBackgroundWhite;
        anonymousClass14.setBackgroundColor(getThemedColor(i3));
        this.actionBar.setActionModeColor(getThemedColor(i3));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(Theme.key_actionBarDefault));
        }
        this.searchContainer.setBackgroundColor(getThemedColor(i3));
    }

    public final boolean lambda$joinToGroup$22(TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        StringBuilder sb = new StringBuilder("dialog_join_requested_time_");
        long j = this.chatId;
        sb.append(-j);
        editorEdit.putLong(sb.toString(), System.currentTimeMillis()).commit();
        Activity parentActivity = getParentActivity();
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(getMessagesController().getChat(Long.valueOf(j)));
        int i = JoinGroupAlert.$r8$clinit;
        JoinGroupAlert.showBulletin(parentActivity, this, BulletinFactory.of(this), zIsChannelAndNotMegaGroup);
        updateChatInfo(true);
        return false;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (this.selectedTopics.isEmpty()) {
            if (!this.searching) {
                return super.onBackPressed(z);
            }
            if (z) {
                this.actionBar.onSearchFieldVisibilityChanged(this.searchItem.toggleSearch(false));
            }
        } else if (z) {
            clearSelectedTopics();
            return false;
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.closeSearchField(true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        messagesController.loadFullChat(j, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        updateTopicsList(false, false);
        SelectAnimatedEmojiDialog.preload$1(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        HashSet hashSet = settingsPreloaded;
        if (!hashSet.contains(Long.valueOf(j))) {
            hashSet.add(Long.valueOf(j));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-j);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        this.notificationsLocker.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity == null || dialogsActivity.rightSlidingDialogContainer == null) {
            return;
        }
        dialogsActivity.getActionBar().setSearchAvatarImageView(null);
        this.parentDialogsActivity.rightSlidingDialogContainer.enabled = true;
    }

    @Override
    public final void onParentScrollToTop() {
        this.recyclerListView.smoothScrollToPosition(0);
    }

    @Override
    public final void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.chatId);
        setBulletinDelegate(null);
    }

    @Override
    public final void onResume() {
        super.onResume();
        TopicsController topicsController = getMessagesController().getTopicsController();
        long j = this.chatId;
        topicsController.onTopicFragmentResume(j);
        this.animatedUpdateEnabled = false;
        AndroidUtilities.updateVisibleRows(this.recyclerListView);
        this.animatedUpdateEnabled = true;
        setBulletinDelegate(new ChatActivity.AnonymousClass103(this, 20));
        if (!this.inPreviewMode || getMessagesController().isForum(-j)) {
            return;
        }
        finishFragment();
    }

    @Override
    public final void onSlideProgress(boolean z, float f) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.isSlideBackTransition) {
            setSlideTransitionProgress$1(f);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        DialogsActivity.AnonymousClass27 anonymousClass27;
        AnonymousClass18 anonymousClass18;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (anonymousClass18 = this.blurredView) != null) {
            if (anonymousClass18.getParent() != null) {
                ((ViewGroup) this.blurredView.getParent()).removeView(this.blurredView);
            }
            this.blurredView.setBackground(null);
        }
        if (z) {
            checkGroupCallJoin$1(false);
        }
        this.notificationsLocker.unlock();
        if (z) {
            return;
        }
        if (this.openedForSelect && this.removeFragmentOnTransitionEnd) {
            removeSelfFromStack();
            DialogsActivity dialogsActivity = this.dialogsActivity;
            if (dialogsActivity != null) {
                dialogsActivity.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.finishDialogRightSlidingPreviewOnTransitionEnd) {
            removeSelfFromStack();
            DialogsActivity dialogsActivity2 = this.parentDialogsActivity;
            if (dialogsActivity2 == null || (anonymousClass27 = dialogsActivity2.rightSlidingDialogContainer) == null || !anonymousClass27.hasFragment()) {
                return;
            }
            this.parentDialogsActivity.rightSlidingDialogContainer.finishPreview();
        }
    }

    @Override
    public final void onTransitionAnimationProgress(boolean z, float f) {
        AnonymousClass18 anonymousClass18 = this.blurredView;
        if (anonymousClass18 == null || anonymousClass18.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.blurredView.setAlpha(1.0f - f);
        } else {
            this.blurredView.setAlpha(f);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        this.notificationsLocker.lock();
    }

    public final void openProfile$1(boolean z) {
        TLRPC.Chat chat;
        TLRPC.ChatPhoto chatPhoto;
        long j = this.chatId;
        if (z && (chat = getMessagesController().getChat(Long.valueOf(j))) != null && ((chatPhoto = chat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.avatarContainer.getSharedMediaPreloader());
        profileActivity.setChatInfo(this.chatFull);
        profileActivity.setPlayProfileAnimation((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.avatarContainer.getAvatarImageView().getImageReceiver().hasImageLoaded() && z) ? 2 : 1);
        presentFragment(profileActivity);
    }

    @Override
    public final boolean openedWithLivestream() {
        return false;
    }

    @Override
    public final void prepareFragmentToSlide(boolean z, boolean z2) {
        if (z || !z2) {
            this.isSlideBackTransition = false;
            if (SharedConfig.getDevicePerformanceClass() != 0) {
                AnonymousClass1 anonymousClass1 = this.contentView;
                if (anonymousClass1 != null) {
                    anonymousClass1.setLayerType(0, null);
                    anonymousClass1.setClipChildren(true);
                    anonymousClass1.setClipToPadding(true);
                }
                this.contentView.requestLayout();
                this.actionBar.requestLayout();
            }
            setSlideTransitionProgress$1(1.0f);
            return;
        }
        this.isSlideBackTransition = true;
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        AnonymousClass1 anonymousClass2 = this.contentView;
        if (anonymousClass2 != null) {
            anonymousClass2.setLayerType(2, null);
            anonymousClass2.setClipChildren(false);
            anonymousClass2.setClipToPadding(false);
        }
        this.contentView.requestLayout();
        this.actionBar.requestLayout();
    }

    @Override
    public final void scrollToMessageId(int i, int i2, boolean z, int i3, boolean z2, int i4) {
    }

    public final void setButtonType(int i) {
        if (this.bottomButtonType != i) {
            this.bottomButtonType = i;
            this.bottomOverlayChatText.setTextColorKey(i == 0 ? Theme.key_chat_fieldOverlayText : Theme.key_text_RedBold);
            this.closeReportSpam.setVisibility(i == 1 ? 0 : 8);
            updateChatInfo(false);
        }
    }

    @Override
    public final void setPreviewOpenedProgress(float f) {
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        if (chatAvatarContainer != null) {
            chatAvatarContainer.setAlpha(f);
            this.other.setAlpha(f);
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setAlpha(f);
            }
            this.actionBar.getBackButton().setAlpha(f);
        }
    }

    @Override
    public final void setPreviewReplaceProgress(float f) {
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        if (chatAvatarContainer != null) {
            chatAvatarContainer.setAlpha(f);
            this.avatarContainer.setTranslationX((1.0f - f) * AndroidUtilities.dp(40.0f));
        }
    }

    public final void setSlideTransitionProgress$1(float f) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.slideFragmentProgress = f;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        AnonymousClass5 anonymousClass5 = this.recyclerListView;
        if (anonymousClass5 != null) {
            float fM = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, this.slideFragmentProgress, 0.05f, 1.0f);
            anonymousClass5.setPivotX(0.0f);
            anonymousClass5.setPivotY(0.0f);
            anonymousClass5.setScaleX(fM);
            anonymousClass5.setScaleY(fM);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(fM);
            this.actionBar.setScaleY(fM);
        }
    }

    @Override
    public final boolean shouldShowImport() {
        return false;
    }

    public final void showChatPreview$1(DialogCell dialogCell) {
        final int i = 1;
        final int i2 = 0;
        try {
            dialogCell.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        ?? r3 = {new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 1, getParentActivity(), getResourceProvider())};
        final TLRPC.TL_forumTopic tL_forumTopic = dialogCell.forumTopic;
        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(getParentActivity(), this.currentAccount, r3[0].getSwipeBack(), false, new AnonymousClass19(tL_forumTopic), getResourceProvider());
        int iAddViewToSwipeBack = r3[0].addViewToSwipeBack(chatNotificationsPopupWrapper.windowLayout);
        chatNotificationsPopupWrapper.type = 1;
        long j = this.chatId;
        long j2 = -j;
        chatNotificationsPopupWrapper.update(j2, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(getMessagesController().getChat(Long.valueOf(j)))) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, getParentActivity(), null, true, false);
            if (tL_forumTopic.pinned) {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin, null);
            } else {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin, null);
            }
            actionBarMenuSubItem.setMinimumWidth(160);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener(this) {
                public final TopicsFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            TopicsFragment topicsFragment = this.f$0;
                            topicsFragment.scrollToTop = true;
                            topicsFragment.updateAnimated = true;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsFragment.topicsController.pinTopic(topicsFragment.chatId, tL_forumTopic2.id, !tL_forumTopic2.pinned, topicsFragment);
                            topicsFragment.finishPreviewFragment();
                            break;
                        case 1:
                            TopicsFragment topicsFragment2 = this.f$0;
                            topicsFragment2.updateAnimated = true;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsFragment2.topicsController.toggleCloseTopic(topicsFragment2.chatId, tL_forumTopic3.id, true ^ tL_forumTopic3.closed);
                            topicsFragment2.finishPreviewFragment();
                            break;
                        default:
                            TopicsFragment topicsFragment3 = this.f$0;
                            topicsFragment3.getClass();
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            topicsFragment3.deleteTopics$1(hashSet, new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment3, 5));
                            break;
                    }
                }
            });
            r3[0].linearLayout.addView(actionBarMenuSubItem);
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, getParentActivity(), null, false, false);
        if (getMessagesController().isDialogMuted(j2, tL_forumTopic.id)) {
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute, null);
        } else {
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute, null);
        }
        actionBarMenuSubItem2.setMinimumWidth(160);
        actionBarMenuSubItem2.setOnClickListener(new TopicsFragment$$ExternalSyntheticLambda17(this, tL_forumTopic, (Serializable) r3, iAddViewToSwipeBack, 0));
        r3[0].linearLayout.addView(actionBarMenuSubItem2);
        if (ChatObject.canManageTopic(this.currentAccount, getMessagesController().getChat(Long.valueOf(j)), tL_forumTopic)) {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(0, getParentActivity(), null, false, false);
            if (tL_forumTopic.closed) {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart, null);
            } else {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close, null);
            }
            actionBarMenuSubItem3.setMinimumWidth(160);
            actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener(this) {
                public final TopicsFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            TopicsFragment topicsFragment = this.f$0;
                            topicsFragment.scrollToTop = true;
                            topicsFragment.updateAnimated = true;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsFragment.topicsController.pinTopic(topicsFragment.chatId, tL_forumTopic2.id, !tL_forumTopic2.pinned, topicsFragment);
                            topicsFragment.finishPreviewFragment();
                            break;
                        case 1:
                            TopicsFragment topicsFragment2 = this.f$0;
                            topicsFragment2.updateAnimated = true;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsFragment2.topicsController.toggleCloseTopic(topicsFragment2.chatId, tL_forumTopic3.id, true ^ tL_forumTopic3.closed);
                            topicsFragment2.finishPreviewFragment();
                            break;
                        default:
                            TopicsFragment topicsFragment3 = this.f$0;
                            topicsFragment3.getClass();
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            topicsFragment3.deleteTopics$1(hashSet, new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment3, 5));
                            break;
                    }
                }
            });
            r3[0].linearLayout.addView(actionBarMenuSubItem3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, getMessagesController().getChat(Long.valueOf(j)), tL_forumTopic)) {
            ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(0, getParentActivity(), null, false, true);
            actionBarMenuSubItem4.setTextAndIcon(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete, null);
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_text_RedRegular));
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_text_RedBold));
            actionBarMenuSubItem4.setMinimumWidth(160);
            final int i3 = 2;
            actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener(this) {
                public final TopicsFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            TopicsFragment topicsFragment = this.f$0;
                            topicsFragment.scrollToTop = true;
                            topicsFragment.updateAnimated = true;
                            TLRPC.TL_forumTopic tL_forumTopic2 = tL_forumTopic;
                            topicsFragment.topicsController.pinTopic(topicsFragment.chatId, tL_forumTopic2.id, !tL_forumTopic2.pinned, topicsFragment);
                            topicsFragment.finishPreviewFragment();
                            break;
                        case 1:
                            TopicsFragment topicsFragment2 = this.f$0;
                            topicsFragment2.updateAnimated = true;
                            TLRPC.TL_forumTopic tL_forumTopic3 = tL_forumTopic;
                            topicsFragment2.topicsController.toggleCloseTopic(topicsFragment2.chatId, tL_forumTopic3.id, true ^ tL_forumTopic3.closed);
                            topicsFragment2.finishPreviewFragment();
                            break;
                        default:
                            TopicsFragment topicsFragment3 = this.f$0;
                            topicsFragment3.getClass();
                            HashSet hashSet = new HashSet();
                            hashSet.add(Integer.valueOf(tL_forumTopic.id));
                            topicsFragment3.deleteTopics$1(hashSet, new TopicsFragment$$ExternalSyntheticLambda8(topicsFragment3, 5));
                            break;
                    }
                }
            });
            r3[0].linearLayout.addView(actionBarMenuSubItem4);
        }
        boolean zIsMonoForum = getMessagesController().isMonoForum(j2);
        if (this.blurredView != null && this.parentLayout != null) {
            int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
            int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.scale(0.16666667f, 0.16666667f);
            ((ActionBarLayout) this.parentLayout).getView().draw(canvas);
            Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
            this.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
            this.blurredView.setAlpha(0.0f);
            if (this.blurredView.getParent() != null) {
                ((ViewGroup) this.blurredView.getParent()).removeView(this.blurredView);
            }
            ((ActionBarLayout) this.parentLayout).getOverlayContainerView().addView(this.blurredView, LayoutHelper.createFrame(-1.0f, -1));
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", j);
        ChatActivity chatActivity = new ChatActivity(bundle);
        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(j2, zIsMonoForum ? DialogObject.getPeerDialogId(dialogCell.forumTopic.from_id) : dialogCell.forumTopic.id));
        presentFragmentAsPreviewWithMenu(chatActivity, r3[0]);
    }

    public final void toggleSelection(View view) {
        TopicDialogCell topicDialogCell;
        TLRPC.TL_forumTopic tL_forumTopic;
        TopicsController topicsController;
        boolean z;
        if (!(view instanceof TopicDialogCell) || (tL_forumTopic = (topicDialogCell = (TopicDialogCell) view).forumTopic) == null) {
            return;
        }
        int i = tL_forumTopic.id;
        HashSet hashSet = this.selectedTopics;
        if (!hashSet.remove(Integer.valueOf(i))) {
            hashSet.add(Integer.valueOf(i));
        }
        topicDialogCell.setChecked(hashSet.contains(Integer.valueOf(i)), true);
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j));
        if (hashSet.isEmpty()) {
            this.actionBar.hideActionMode$1();
            return;
        }
        if (!this.actionBar.actionModeIsExist(null)) {
            ActionBar.AnonymousClass1 anonymousClass1CreateActionMode = this.actionBar.createActionMode(null);
            if (this.inPreviewMode) {
                anonymousClass1CreateActionMode.setBackgroundColor(0);
                anonymousClass1CreateActionMode.drawBlur = false;
            }
            NumberTextView numberTextView = new NumberTextView(anonymousClass1CreateActionMode.getContext());
            this.selectedDialogsCountTextView = numberTextView;
            numberTextView.setTextSize(18);
            this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
            this.selectedDialogsCountTextView.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
            anonymousClass1CreateActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(1.0f, 0, -1, 72, 0, 0));
            this.selectedDialogsCountTextView.setOnTouchListener(new TopicsFragment$$ExternalSyntheticLambda21(0));
            this.pinItem = anonymousClass1CreateActionMode.addItemWithWidth(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
            this.unpinItem = anonymousClass1CreateActionMode.addItemWithWidth(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
            this.muteItem = anonymousClass1CreateActionMode.addItemWithWidth(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
            this.deleteItem = anonymousClass1CreateActionMode.addItemWithWidth(7, R.drawable.msg_delete, LocaleController.getString(R.string.Delete), AndroidUtilities.dp(54.0f));
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth = anonymousClass1CreateActionMode.addItemWithWidth(12, R.drawable.msg_archive_hide, LocaleController.getString(R.string.Hide), AndroidUtilities.dp(54.0f));
            this.hideItem = actionBarMenuItemAddItemWithWidth;
            actionBarMenuItemAddItemWithWidth.setVisibility(8);
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth2 = anonymousClass1CreateActionMode.addItemWithWidth(13, R.drawable.msg_archive_show, LocaleController.getString(R.string.Show), AndroidUtilities.dp(54.0f));
            this.showItem = actionBarMenuItemAddItemWithWidth2;
            actionBarMenuItemAddItemWithWidth2.setVisibility(8);
            ActionBarMenuItem actionBarMenuItemAddItemWithWidth3 = anonymousClass1CreateActionMode.addItemWithWidth(0, R.drawable.ic_ab_other, LocaleController.getString(R.string.AccDescrMoreOptions), AndroidUtilities.dp(54.0f));
            this.otherItem = actionBarMenuItemAddItemWithWidth3;
            this.readItem = actionBarMenuItemAddItemWithWidth3.addSubItem(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
            this.closeTopic = this.otherItem.addSubItem(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
            this.restartTopic = this.otherItem.addSubItem(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
        }
        if (this.inPreviewMode) {
            ((View) this.fragmentView.getParent()).invalidate();
        }
        this.actionBar.showActionMode(null, null);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
        Iterator it = hashSet.iterator();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            topicsController = this.topicsController;
            if (!zHasNext) {
                break;
            }
            long jIntValue = ((Integer) it.next()).intValue();
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(j, jIntValue);
            if (tL_forumTopicFindTopic != null) {
                if (tL_forumTopicFindTopic.unread_count != 0) {
                    i2++;
                }
                if (ChatObject.canManageTopics(chat) && !tL_forumTopicFindTopic.hidden) {
                    if (tL_forumTopicFindTopic.pinned) {
                        i5++;
                    } else {
                        i4++;
                    }
                }
            }
            int i6 = i2;
            if (getMessagesController().isDialogMuted(-j, jIntValue)) {
                i3++;
            }
            i2 = i6;
        }
        if (i2 > 0) {
            z = false;
            this.readItem.setVisibility(0);
            this.readItem.setTextAndIcon(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread, null);
        } else {
            z = false;
            this.readItem.setVisibility(8);
        }
        if (i3 != 0) {
            this.mute = z;
            this.muteItem.setIcon(R.drawable.msg_unmute);
            this.muteItem.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
        } else {
            this.mute = true;
            this.muteItem.setIcon(R.drawable.msg_mute);
            this.muteItem.setContentDescription(LocaleController.getString(R.string.ChatsMute));
        }
        this.pinItem.setVisibility((i4 == 1 && i5 == 0) ? 0 : 8);
        this.unpinItem.setVisibility((i5 == 1 && i4 == 0) ? 0 : 8);
        this.selectedDialogsCountTextView.setNumber(hashSet.size(), true);
        Iterator it2 = hashSet.iterator();
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (it2.hasNext()) {
            TLRPC.TL_forumTopic tL_forumTopicFindTopic2 = topicsController.findTopic(j, ((Integer) it2.next()).intValue());
            if (tL_forumTopicFindTopic2 != null) {
                if (ChatObject.canDeleteTopic(this.currentAccount, chat, tL_forumTopicFindTopic2)) {
                    i9++;
                }
                if (ChatObject.canManageTopic(this.currentAccount, chat, tL_forumTopicFindTopic2)) {
                    if (tL_forumTopicFindTopic2.id == 1) {
                        if (tL_forumTopicFindTopic2.hidden) {
                            i11++;
                        } else {
                            i10++;
                        }
                    }
                    if (!tL_forumTopicFindTopic2.hidden) {
                        if (tL_forumTopicFindTopic2.closed) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                }
            }
        }
        this.closeTopic.setVisibility((i7 != 0 || i8 <= 0) ? 8 : 0);
        this.closeTopic.setText(LocaleController.getString(i8 > 1 ? R.string.CloseTopics : R.string.CloseTopic));
        this.restartTopic.setVisibility((i8 != 0 || i7 <= 0) ? 8 : 0);
        this.restartTopic.setText(LocaleController.getString(i7 > 1 ? R.string.RestartTopics : R.string.RestartTopic));
        this.deleteItem.setVisibility(i9 == hashSet.size() ? 0 : 8);
        this.hideItem.setVisibility((i10 == 1 && hashSet.size() == 1) ? 0 : 8);
        this.showItem.setVisibility((i11 == 1 && hashSet.size() == 1) ? 0 : 8);
        this.otherItem.checkHideMenuItem();
        updateReordering();
    }

    public final void updateChatInfo(boolean z) {
        long j;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String string;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        if (this.fragmentView == null || this.avatarContainer == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j2 = this.chatId;
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(j2));
        long j3 = -j2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        if (UserObject.isBotForum(user)) {
            this.avatarContainer.setUserAvatar(user);
        } else if (ChatObject.isMonoForum(chat)) {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
            if (chat2 != null) {
                this.avatarContainer.setChatAvatar(chat2);
            }
        } else {
            this.avatarContainer.setChatAvatar(chat);
        }
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.currentAccount);
        StringBuilder sb = new StringBuilder("dialog_bar_vis3");
        sb.append(j3);
        boolean z4 = notificationsSettings.getInt(sb.toString(), 0) == 2;
        boolean z5 = notificationsSettings.getBoolean("dialog_bar_report" + j3, false);
        boolean z6 = notificationsSettings.getBoolean("dialog_bar_block" + j3, false);
        boolean z7 = this.openedForSelect;
        if (z7) {
            j = 0;
            if (this.openedForReply) {
                this.avatarContainer.setTitle(LocaleController.getString(R.string.ReplyToDialog));
            } else if (this.openedForQuote) {
                this.avatarContainer.setTitle(LocaleController.getString(R.string.QuoteTo));
            } else if (this.openedForBotShare) {
                this.avatarContainer.setTitle(LocaleController.getString(R.string.BotShareToTopic));
            } else if (this.openedForForward) {
                this.avatarContainer.setTitle(LocaleController.getString(R.string.ForwardTo));
            } else {
                this.avatarContainer.setTitle(LocaleController.getString(R.string.SelectTopic));
            }
            this.searchItem.setVisibility(8);
            ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
            if (chatAvatarContainer != null && chatAvatarContainer.getLayoutParams() != null) {
                ((ViewGroup.MarginLayoutParams) this.avatarContainer.getLayoutParams()).rightMargin = AndroidUtilities.dp(this.searchItem.getVisibility() == 0 ? 86.0f : 40.0f);
            }
            this.avatarContainer.updateSubtitle(false);
            this.avatarContainer.getSubtitleTextView().setVisibility(8);
        } else {
            if (chat != null) {
                this.avatarContainer.setTitle(chat.title);
                Drawable themedDrawable = getMessagesController().isDialogMuted(j3, 0L) ? getThemedDrawable("drawableMuteIcon") : null;
                ChatAvatarContainer chatAvatarContainer2 = this.avatarContainer;
                j = 0;
                chatAvatarContainer2.titleTextView.setLeftDrawable((Drawable) null);
                if (!chatAvatarContainer2.rightDrawableIsScamOrVerified && !chatAvatarContainer2.rightDrawableIsScam) {
                    if (themedDrawable != null) {
                        chatAvatarContainer2.rightDrawable2ContentDescription = LocaleController.getString(R.string.NotificationsMuted);
                    } else {
                        chatAvatarContainer2.rightDrawable2ContentDescription = null;
                    }
                    chatAvatarContainer2.titleTextView.setRightDrawable2(themedDrawable);
                }
                ActionBar actionBar = chatAvatarContainer2.actionBar;
                if (actionBar != null) {
                    actionBar.checkAvatarContainerWidth(true);
                }
            } else {
                j = 0;
            }
            TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j2);
            if (chatFull2 != null && (chatFull = this.chatFull) != null && (chatParticipants = chatFull.participants) != null) {
                chatFull2.participants = chatParticipants;
            }
            this.chatFull = chatFull2;
            if (chatFull2 != null) {
                int i7 = chatFull2.participants_count;
                if (i7 <= 0) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j2));
                    if (chat3 == null) {
                        string = LocaleController.getString(R.string.Loading);
                    } else {
                        string = ChatObject.isPublic(chat3) ? LocaleController.getString(R.string.MegaPublic).toLowerCase() : LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                    }
                } else {
                    string = LocaleController.formatPluralString("Members", i7, new Object[0]);
                }
            } else {
                string = LocaleController.getString(R.string.Loading);
            }
            this.avatarContainer.setSubtitle(string);
        }
        boolean z8 = this.fragmentBeginToShow || z;
        long j4 = MessagesController.getNotificationsSettings(this.currentAccount).getLong("dialog_join_requested_time_" + j3, -1L);
        if (chat != null && ChatObject.isNotInChat(chat) && j4 > j && System.currentTimeMillis() - j4 < 120000) {
            this.bottomOverlayChatText.setText(LocaleController.getString(R.string.ChannelJoinRequestSent), z8);
            this.bottomOverlayChatText.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(this.bottomOverlayProgress, false, 0.5f, z8);
            AndroidUtilities.updateViewVisibilityAnimated(this.bottomOverlayChatText, true, 0.5f, z8);
            setButtonType(0);
        } else {
            if (chat == null || z7 || !(ChatObject.isNotInChat(chat) || getMessagesController().isJoiningChannel(chat.id))) {
                if (z4 && (z6 || z5)) {
                    this.bottomOverlayChatText.setText(LocaleController.getString(R.string.ReportSpamAndLeaveNoCaps));
                    this.bottomOverlayChatText.setClickable(true);
                    this.bottomOverlayChatText.setEnabled(true);
                    AndroidUtilities.updateViewVisibilityAnimated(this.bottomOverlayProgress, false, 0.5f, false);
                    AndroidUtilities.updateViewVisibilityAnimated(this.bottomOverlayChatText, true, 0.5f, false);
                    setButtonType(1);
                } else {
                    z2 = false;
                }
                if (this.bottomPannelVisible != z2) {
                    this.bottomPannelVisible = z2;
                    this.bottomOverlayContainer.animate().setListener(null).cancel();
                    if (z8) {
                        this.bottomOverlayContainer.animate().translationY(z2 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new AnonymousClass20(this, z2, 1));
                    } else {
                        AnonymousClass14 anonymousClass14 = this.bottomOverlayContainer;
                        if (z2) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        anonymousClass14.setVisibility(i6);
                        this.bottomOverlayContainer.setTranslationY(z2 ? 0.0f : AndroidUtilities.dp(53.0f));
                    }
                }
                checkUi_listViewPadding$5();
                ActionBarMenuItem actionBarMenuItem = this.other;
                if (z7) {
                    i = 8;
                } else {
                    i = 0;
                }
                actionBarMenuItem.setVisibility(i);
                ActionBarMenuSubItem actionBarMenuSubItem = this.addMemberSubMenu;
                if (ChatObject.canAddUsers(chat)) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                actionBarMenuSubItem.setVisibility(i2);
                ActionBarMenuSubItem actionBarMenuSubItem2 = this.boostGroupSubmenu;
                if (ChatObject.isBoostSupported(chat) || !(getUserConfig().isPremium() || ChatObject.isBoosted(this.chatFull) || ChatObject.hasAdminRights(chat))) {
                    i3 = 8;
                } else {
                    i3 = 0;
                }
                actionBarMenuSubItem2.setVisibility(i3);
                ActionBarMenuSubItem actionBarMenuSubItem3 = this.deleteChatSubmenu;
                if (chat != null || chat.creator || ChatObject.isNotInChat(chat)) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                actionBarMenuSubItem3.setVisibility(i4);
                ActionBarMenuSubItem actionBarMenuSubItem4 = this.reportSubmenu;
                if (chat != null || chat.creator || ChatObject.hasAdminRights(chat)) {
                    i5 = 8;
                } else {
                    i5 = 0;
                }
                actionBarMenuSubItem4.setVisibility(i5);
                updateCreateTopicButton(true);
                this.groupCall = getMessagesController().getGroupCall(j2, true);
                checkGroupCallJoin$1(false);
            }
            if (getMessagesController().isJoiningChannel(chat.id)) {
                z3 = true;
            } else {
                if (chat.join_request) {
                    this.bottomOverlayChatText.setText(LocaleController.getString(R.string.ChannelJoinRequest));
                } else {
                    this.bottomOverlayChatText.setText(LocaleController.getString(R.string.ChannelJoin));
                }
                this.bottomOverlayChatText.setClickable(true);
                this.bottomOverlayChatText.setEnabled(true);
                z3 = false;
            }
            AndroidUtilities.updateViewVisibilityAnimated(this.bottomOverlayProgress, z3, 0.5f, z8);
            AndroidUtilities.updateViewVisibilityAnimated(this.bottomOverlayChatText, !z3, 0.5f, z8);
            setButtonType(0);
        }
        z2 = true;
        if (this.bottomPannelVisible != z2) {
            this.bottomPannelVisible = z2;
            this.bottomOverlayContainer.animate().setListener(null).cancel();
            if (z8) {
                AnonymousClass14 anonymousClass15 = this.bottomOverlayContainer;
                if (z2) {
                    i6 = 0;
                } else {
                    i6 = 8;
                }
                anonymousClass15.setVisibility(i6);
                this.bottomOverlayContainer.setTranslationY(z2 ? 0.0f : AndroidUtilities.dp(53.0f));
            } else {
                this.bottomOverlayContainer.animate().translationY(z2 ? 0.0f : AndroidUtilities.dp(53.0f)).setListener(new AnonymousClass20(this, z2, 1));
            }
        }
        checkUi_listViewPadding$5();
        ActionBarMenuItem actionBarMenuItem2 = this.other;
        if (z7) {
            i = 8;
        } else {
            i = 0;
        }
        actionBarMenuItem2.setVisibility(i);
        ActionBarMenuSubItem actionBarMenuSubItem5 = this.addMemberSubMenu;
        if (ChatObject.canAddUsers(chat)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        actionBarMenuSubItem5.setVisibility(i2);
        ActionBarMenuSubItem actionBarMenuSubItem6 = this.boostGroupSubmenu;
        if (ChatObject.isBoostSupported(chat)) {
            i3 = 8;
        } else {
            i3 = 8;
        }
        actionBarMenuSubItem6.setVisibility(i3);
        ActionBarMenuSubItem actionBarMenuSubItem7 = this.deleteChatSubmenu;
        if (chat != null) {
            i4 = 8;
        } else {
            i4 = 8;
        }
        actionBarMenuSubItem7.setVisibility(i4);
        ActionBarMenuSubItem actionBarMenuSubItem8 = this.reportSubmenu;
        if (chat != null) {
            i5 = 8;
        } else {
            i5 = 8;
        }
        actionBarMenuSubItem8.setVisibility(i5);
        updateCreateTopicButton(true);
        this.groupCall = getMessagesController().getGroupCall(j2, true);
        checkGroupCallJoin$1(false);
    }

    public final void updateCreateTopicButton(boolean z) {
        if (this.createTopicSubmenu == null) {
            return;
        }
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        boolean z2 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(j))) || !ChatObject.canCreateTopic(messagesController.getChat(Long.valueOf(j))) || this.searching || this.openedForSelect || this.loadingTopics) ? false : true;
        this.canShowCreateTopic = z2;
        this.createTopicSubmenu.setVisibility(z2 ? 0 : 8);
        hideFloatingButton(!this.canShowCreateTopic, z);
    }

    public final void updateReordering() {
        boolean z = ChatObject.canManageTopics(getMessagesController().getChat(Long.valueOf(this.chatId))) && !this.selectedTopics.isEmpty();
        if (this.reordering != z) {
            this.reordering = z;
            Adapter adapter = this.adapter;
            adapter.mObservable.notifyItemRangeChanged(0, adapter.getArray().size() + 1, null);
        }
    }

    public final void updateSearchProgress(float f) {
        this.searchAnimationProgress = f;
        int themedColor = getThemedColor(Theme.key_actionBarDefaultIcon);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarActionModeDefaultIcon;
        actionBar.setItemsColor(ColorUtils.blendARGB(this.searchAnimationProgress, themedColor, getThemedColor(i)), false);
        this.actionBar.setItemsColor(ColorUtils.blendARGB(this.searchAnimationProgress, getThemedColor(i), getThemedColor(i)), true);
        this.actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(this.searchAnimationProgress, getThemedColor(Theme.key_actionBarDefaultSelector), getThemedColor(Theme.key_actionBarActionModeDefaultSelector)), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(ColorUtils.blendARGB(this.searchAnimationProgress, getThemedColor(Theme.key_actionBarDefault), getThemedColor(Theme.key_windowBackgroundWhite)));
        }
        float f2 = 1.0f - f;
        this.avatarContainer.getTitleTextView().setAlpha(f2);
        this.avatarContainer.getSubtitleTextView().setAlpha(f2);
        ViewPagerFixed.AnonymousClass3 anonymousClass3 = this.searchTabsView;
        if (anonymousClass3 != null) {
            anonymousClass3.setTranslationY((-AndroidUtilities.dp(16.0f)) * f2);
            this.searchTabsView.setAlpha(f);
        }
        this.searchContainer.setTranslationY((-AndroidUtilities.dp(16.0f)) * f2);
        this.searchContainer.setAlpha(f);
        if (isInPreviewMode()) {
            this.fullscreenView.invalidate();
        }
        this.contentView.invalidate();
        this.recyclerListView.setAlpha(f2);
        if (this.animateSearchWithScale) {
            float fM = DiffUtil.m(1.0f, this.searchAnimationProgress, 0.02f, 0.98f);
            this.recyclerListView.setScaleX(fM);
            this.recyclerListView.setScaleY(fM);
        }
    }

    public final void updateTopicsEmptyViewText() {
        AnonymousClass13 anonymousClass13 = this.topicsEmptyView;
        if (anonymousClass13 == null || anonymousClass13.subtitle == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.ic_ab_other);
        coloredImageSpan.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        MessagesController messagesController = getMessagesController();
        long j = this.chatId;
        if (ChatObject.canUserDoAdminAction(messagesController.getChat(Long.valueOf(j)), 15)) {
            this.topicsEmptyView.subtitle.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(j, 1L);
        if (tL_forumTopicFindTopic != null) {
            string = tL_forumTopicFindTopic.title;
        }
        this.topicsEmptyView.subtitle.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    public final void updateTopicsList(boolean z, boolean z2) {
        AnonymousClass10 anonymousClass10;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.updateAnimated) {
            z = true;
        }
        this.updateAnimated = false;
        TopicsController topicsController = this.topicsController;
        long j = this.chatId;
        ArrayList<TLRPC.TL_forumTopic> topics = topicsController.getTopics(j);
        if (topics != null) {
            ArrayList arrayList = this.forumTopics;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList.clear();
            if (UserObject.isBotForum(this.currentAccount, -j) && this.openedForForward) {
                arrayList.add(new Item(3, null));
            }
            for (int i = 0; i < topics.size(); i++) {
                HashSet hashSet = this.excludeTopics;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i).id))) {
                    arrayList.add(new Item(0, topics.get(i)));
                }
            }
            if (!arrayList.isEmpty() && !topicsController.endIsReached(j) && this.canShowProgress) {
                arrayList.add(new Item(1, null));
            }
            int size2 = arrayList.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.itemsEnterAnimator.showItemsAnimated(size + 4);
                z = false;
            }
            this.hiddenCount = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                Item item = (Item) arrayList.get(i2);
                if (item != null && (tL_forumTopic = item.topic) != null && tL_forumTopic.hidden) {
                    this.hiddenCount++;
                }
            }
            AnonymousClass5 anonymousClass5 = this.recyclerListView;
            if (anonymousClass5 != null) {
                if (anonymousClass5.getItemAnimator() != (z ? this.itemAnimator : null)) {
                    this.recyclerListView.setItemAnimator(z ? this.itemAnimator : null);
                }
            }
            Adapter adapter = this.adapter;
            if (adapter != null) {
                adapter.setItems(arrayList2, arrayList);
            }
            if ((this.scrollToTop || size == 0) && (anonymousClass10 = this.layoutManager) != null) {
                anonymousClass10.scrollToPositionWithOffset(0, 0);
                this.scrollToTop = false;
            }
        }
        checkLoading();
        updateTopicsEmptyViewText();
    }

    public final class AnonymousClass3 extends OKLCH {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public boolean canCollapseSearch() {
            switch (this.$r8$classId) {
                case 15:
                    ((PhotoPickerSearchActivity) this.this$0).finishFragment();
                    return false;
                default:
                    return super.canCollapseSearch();
            }
        }

        @Override
        public Animator getCustomToggleTransition() {
            switch (this.$r8$classId) {
                case 16:
                    ProfileActivity profileActivity = (ProfileActivity) this.this$0;
                    boolean z = profileActivity.searchMode;
                    profileActivity.searchMode = !z;
                    if (z) {
                        ActionBarMenuItem actionBarMenuItem = profileActivity.searchItem;
                        actionBarMenuItem.searchField.clearFocus();
                        AndroidUtilities.hideKeyboard(actionBarMenuItem.searchField);
                    }
                    if (profileActivity.searchMode) {
                        profileActivity.searchItem.getSearchField().setText("");
                    }
                    return profileActivity.searchExpandTransition(profileActivity.searchMode);
                default:
                    return super.getCustomToggleTransition();
            }
        }

        @Override
        public void onSearchCollapse() {
            switch (this.$r8$classId) {
                case 0:
                    ((TopicsFragment) this.this$0).animateToSearchView(false);
                    break;
                case 1:
                    TimezoneSelector timezoneSelector = (TimezoneSelector) this.this$0;
                    timezoneSelector.searching = false;
                    timezoneSelector.query = null;
                    timezoneSelector.listView.adapter.update(true);
                    timezoneSelector.listView.scrollToPosition(0);
                    break;
                case 2:
                    ChannelAdminLogActivity channelAdminLogActivity = (ChannelAdminLogActivity) this.this$0;
                    channelAdminLogActivity.searchQuery = "";
                    channelAdminLogActivity.avatarContainer.setVisibility(0);
                    if (channelAdminLogActivity.searchWas) {
                        channelAdminLogActivity.searchWas = false;
                        channelAdminLogActivity.loadMessages(true);
                    }
                    break;
                case 3:
                    ChatLinkActivity chatLinkActivity = (ChatLinkActivity) this.this$0;
                    chatLinkActivity.searchAdapter.searchDialogs(null);
                    chatLinkActivity.searching = false;
                    chatLinkActivity.listView.setAdapter(chatLinkActivity.listViewAdapter);
                    chatLinkActivity.listViewAdapter.mObservable.notifyChanged();
                    chatLinkActivity.listView.setFastScrollVisible(true);
                    chatLinkActivity.listView.setVerticalScrollBarEnabled(false);
                    chatLinkActivity.emptyView.setShowAtCenter(false);
                    View view = chatLinkActivity.fragmentView;
                    int i = Theme.key_windowBackgroundGray;
                    view.setBackgroundColor(Theme.getColor(null, i, false));
                    chatLinkActivity.fragmentView.setTag(Integer.valueOf(i));
                    chatLinkActivity.emptyView.showProgress();
                    break;
                case 4:
                    ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.this$0;
                    chatUsersActivity.searchListViewAdapter.searchUsers(null);
                    chatUsersActivity.searching = false;
                    ChatActivity.AnonymousClass34 anonymousClass34 = chatUsersActivity.listView;
                    anonymousClass34.animateEmptyView = false;
                    anonymousClass34.emptyViewAnimationType = 0;
                    anonymousClass34.setAdapter(chatUsersActivity.listViewAdapter);
                    chatUsersActivity.listViewAdapter.mObservable.notifyChanged();
                    chatUsersActivity.listView.setFastScrollVisible(true);
                    chatUsersActivity.listView.setVerticalScrollBarEnabled(false);
                    ActionBarMenuItem actionBarMenuItem = chatUsersActivity.doneItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility(0);
                    }
                    break;
                case 5:
                    AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.this$0;
                    if (audioPlayerAlert.searching) {
                        audioPlayerAlert.searchWas = false;
                        audioPlayerAlert.searching = false;
                        audioPlayerAlert.setAllowNestedScroll(true);
                        audioPlayerAlert.listAdapter.search(null);
                        ActionBarMenuItem actionBarMenuItem2 = audioPlayerAlert.addItem;
                        if (actionBarMenuItem2 != null) {
                            actionBarMenuItem2.setVisibility(0);
                        }
                    }
                    break;
                case 6:
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) this.this$0;
                    chatAttachAlertDocumentLayout.searching = false;
                    chatAttachAlertDocumentLayout.sortItem.setVisibility(0);
                    RecyclerView.Adapter adapter = chatAttachAlertDocumentLayout.listView.getAdapter();
                    ChatAttachAlertDocumentLayout.ListAdapter listAdapter = chatAttachAlertDocumentLayout.listAdapter;
                    if (adapter != listAdapter) {
                        chatAttachAlertDocumentLayout.listView.setAdapter(listAdapter);
                    }
                    chatAttachAlertDocumentLayout.listAdapter.notifyDataSetChanged();
                    chatAttachAlertDocumentLayout.searchAdapter.search(null, true);
                    break;
                case 7:
                    ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.this$0;
                    chatAttachAlertLocationLayout.searching = false;
                    chatAttachAlertLocationLayout.searchWas = false;
                    chatAttachAlertLocationLayout.searchAdapter.searchDelayed(null, null);
                    chatAttachAlertLocationLayout.updateEmptyView$3();
                    chatAttachAlertLocationLayout.getClass();
                    chatAttachAlertLocationLayout.listView.setVisibility(0);
                    chatAttachAlertLocationLayout.mapViewClip.setVisibility(0);
                    chatAttachAlertLocationLayout.searchListView.setVisibility(8);
                    chatAttachAlertLocationLayout.emptyView.setVisibility(8);
                    break;
                case 8:
                    ContactsActivity contactsActivity = (ContactsActivity) this.this$0;
                    contactsActivity.searchListViewAdapter.searchDialogs(null);
                    contactsActivity.searching = false;
                    contactsActivity.searchWas = false;
                    contactsActivity.listView.setAdapter(contactsActivity.listViewAdapter);
                    contactsActivity.listView.setSectionsType(1);
                    contactsActivity.listViewAdapter.notifyDataSetChanged();
                    contactsActivity.listView.setFastScrollVisible(true);
                    contactsActivity.listView.setVerticalScrollBarEnabled(false);
                    contactsActivity.listView.getFastScroll().topOffset = AndroidUtilities.dp(90.0f);
                    ContactsActivity.access$900(contactsActivity);
                    break;
                case 9:
                    CountrySelectActivity countrySelectActivity = (CountrySelectActivity) this.this$0;
                    CountrySelectActivity.CountrySearchAdapter countrySearchAdapter = countrySelectActivity.searchListViewAdapter;
                    countrySearchAdapter.getClass();
                    countrySearchAdapter.searchResult = null;
                    countrySelectActivity.searching = false;
                    countrySelectActivity.searchWas = false;
                    countrySelectActivity.listView.setAdapter(countrySelectActivity.listViewAdapter);
                    countrySelectActivity.listView.setFastScrollVisible(true);
                    break;
                case 10:
                    DialogOrContactPickerActivity dialogOrContactPickerActivity = (DialogOrContactPickerActivity) this.this$0;
                    dialogOrContactPickerActivity.dialogsActivity.getActionBar().closeSearchField(false);
                    dialogOrContactPickerActivity.contactsActivity.getActionBar().closeSearchField(false);
                    break;
                case 11:
                    GroupStickersActivity groupStickersActivity = (GroupStickersActivity) this.this$0;
                    if (groupStickersActivity.searching) {
                        groupStickersActivity.searchAdapter.onSearchStickers(null);
                        groupStickersActivity.searching = false;
                        groupStickersActivity.listView.setAdapter(groupStickersActivity.listAdapter);
                    }
                    break;
                case 12:
                    LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.this$0;
                    languageSelectActivity.searchResult = null;
                    if (languageSelectActivity.listView != null) {
                        languageSelectActivity.emptyView.setVisibility(8);
                        languageSelectActivity.listView.setAdapter(languageSelectActivity.listAdapter);
                    }
                    if (languageSelectActivity.listView != null) {
                        languageSelectActivity.emptyView.setVisibility(8);
                        languageSelectActivity.listView.setAdapter(languageSelectActivity.listAdapter);
                    }
                    break;
                case 13:
                    LocationActivity locationActivity = (LocationActivity) this.this$0;
                    locationActivity.searching = false;
                    locationActivity.searchWas = false;
                    locationActivity.searchAdapter.searchDelayed(null, null);
                    locationActivity.updateEmptyView$5();
                    if (locationActivity.locationType == 8) {
                        ActionBarMenuItem actionBarMenuItem3 = locationActivity.otherItem;
                        if (actionBarMenuItem3 != null) {
                            actionBarMenuItem3.setVisibility(0);
                        }
                        locationActivity.listView.setVisibility(0);
                        locationActivity.mapViewClip.setVisibility(0);
                        locationActivity.searchListView.setAdapter(null);
                        locationActivity.searchListView.setVisibility(8);
                    }
                    break;
                case 14:
                    MemberRequestsActivity.AnonymousClass1 anonymousClass1 = ((MemberRequestsActivity) this.this$0).delegate;
                    anonymousClass1.isSearchExpanded = false;
                    anonymousClass1.setQuery(null);
                    break;
                case 17:
                    RestrictedLanguagesSelectActivity restrictedLanguagesSelectActivity = (RestrictedLanguagesSelectActivity) this.this$0;
                    restrictedLanguagesSelectActivity.searchResult = null;
                    if (restrictedLanguagesSelectActivity.listView != null) {
                        restrictedLanguagesSelectActivity.emptyView.setVisibility(8);
                        restrictedLanguagesSelectActivity.listView.setAdapter(restrictedLanguagesSelectActivity.listAdapter);
                    }
                    break;
                case 18:
                    SettingsActivity settingsActivity = (SettingsActivity) this.this$0;
                    settingsActivity.animatorSearchPageVisible.setValue(false, true);
                    settingsActivity.updateActionBarVisible(false, true);
                    settingsActivity.listView.adapter.update(false);
                    break;
                case 19:
                    UserInfoActivity.ChooseChannelFragment chooseChannelFragment = (UserInfoActivity.ChooseChannelFragment) this.this$0;
                    chooseChannelFragment.query = null;
                    UniversalFragment.AnonymousClass3 anonymousClass3 = chooseChannelFragment.listView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.adapter.update(true);
                    }
                    break;
            }
        }

        @Override
        public void onSearchExpand() {
            switch (this.$r8$classId) {
                case 0:
                    TopicsFragment topicsFragment = (TopicsFragment) this.this$0;
                    topicsFragment.animateToSearchView(true);
                    MessagesSearchContainer messagesSearchContainer = topicsFragment.searchContainer;
                    if (!messagesSearchContainer.searchString.equals("")) {
                        messagesSearchContainer.search$1(messagesSearchContainer.viewPages[0], messagesSearchContainer.getCurrentPosition(), "", false);
                    }
                    topicsFragment.searchContainer.setAlpha(0.0f);
                    topicsFragment.searchContainer.emptyView.showProgress(true, false);
                    break;
                case 1:
                    TimezoneSelector timezoneSelector = (TimezoneSelector) this.this$0;
                    timezoneSelector.searching = true;
                    timezoneSelector.listView.adapter.update(true);
                    timezoneSelector.listView.scrollToPosition(0);
                    break;
                case 2:
                    ChannelAdminLogActivity channelAdminLogActivity = (ChannelAdminLogActivity) this.this$0;
                    channelAdminLogActivity.avatarContainer.setVisibility(8);
                    channelAdminLogActivity.getClass();
                    break;
                case 3:
                    ChatLinkActivity chatLinkActivity = (ChatLinkActivity) this.this$0;
                    chatLinkActivity.searching = true;
                    chatLinkActivity.emptyView.setShowAtCenter(true);
                    break;
                case 4:
                    ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.this$0;
                    chatUsersActivity.searching = true;
                    ActionBarMenuItem actionBarMenuItem = chatUsersActivity.doneItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility(8);
                    }
                    break;
                case 5:
                    AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.this$0;
                    audioPlayerAlert.searchOpenPosition = audioPlayerAlert.layoutManager.findLastVisibleItemPosition();
                    View viewFindViewByPosition = audioPlayerAlert.layoutManager.findViewByPosition(audioPlayerAlert.searchOpenPosition);
                    audioPlayerAlert.searchOpenOffset = viewFindViewByPosition == null ? 0 : viewFindViewByPosition.getTop();
                    audioPlayerAlert.searching = true;
                    audioPlayerAlert.setAllowNestedScroll(false);
                    audioPlayerAlert.listAdapter.notifyDataSetChanged();
                    ActionBarMenuItem actionBarMenuItem2 = audioPlayerAlert.addItem;
                    if (actionBarMenuItem2 != null) {
                        actionBarMenuItem2.setVisibility(8);
                    }
                    break;
                case 6:
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) this.this$0;
                    chatAttachAlertDocumentLayout.searching = true;
                    chatAttachAlertDocumentLayout.sortItem.setVisibility(8);
                    chatAttachAlertDocumentLayout.parentAlert.makeFocusable(chatAttachAlertDocumentLayout.searchItem.getSearchField(), true);
                    break;
                case 7:
                    ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.this$0;
                    chatAttachAlertLocationLayout.searching = true;
                    chatAttachAlertLocationLayout.parentAlert.makeFocusable(chatAttachAlertLocationLayout.searchItem.getSearchField(), true);
                    break;
                case 8:
                    ContactsActivity contactsActivity = (ContactsActivity) this.this$0;
                    contactsActivity.searching = true;
                    ContactsActivity.access$900(contactsActivity);
                    break;
                case 9:
                    ((CountrySelectActivity) this.this$0).searching = true;
                    break;
                case 10:
                    DialogOrContactPickerActivity dialogOrContactPickerActivity = (DialogOrContactPickerActivity) this.this$0;
                    dialogOrContactPickerActivity.dialogsActivity.getActionBar().openSearchField("");
                    dialogOrContactPickerActivity.contactsActivity.getActionBar().openSearchField("");
                    dialogOrContactPickerActivity.searchItem.getSearchField().requestFocus();
                    break;
                case 12:
                    ((LanguageSelectActivity) this.this$0).getClass();
                    break;
                case 13:
                    ((LocationActivity) this.this$0).searching = true;
                    break;
                case 14:
                    ((MemberRequestsActivity) this.this$0).delegate.isSearchExpanded = true;
                    break;
                case 15:
                    PhotoPickerSearchActivity photoPickerSearchActivity = (PhotoPickerSearchActivity) this.this$0;
                    photoPickerSearchActivity.imagesSearch.getActionBar().openSearchField("");
                    photoPickerSearchActivity.gifsSearch.getActionBar().openSearchField("");
                    photoPickerSearchActivity.searchItem.getSearchField().requestFocus();
                    break;
                case 18:
                    SettingsActivity settingsActivity = (SettingsActivity) this.this$0;
                    settingsActivity.animatorSearchPageVisible.setValue(true, true);
                    settingsActivity.search.search("");
                    settingsActivity.updateActionBarVisible(false, true);
                    settingsActivity.listView.adapter.update(false);
                    break;
            }
        }

        @Override
        public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
            switch (this.$r8$classId) {
                case 0:
                    break;
                case 6:
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = (ChatAttachAlertDocumentLayout) this.this$0;
                    chatAttachAlertDocumentLayout.searchAdapter.currentSearchFilters.remove(mediaFilterData);
                    chatAttachAlertDocumentLayout.searchAdapter.search(chatAttachAlertDocumentLayout.searchItem.getSearchField().getText().toString(), false);
                    chatAttachAlertDocumentLayout.searchAdapter.updateFiltersView(null, null, true);
                    break;
            }
        }

        @Override
        public void onSearchPressed(EditTextBoldCursor editTextBoldCursor) {
            switch (this.$r8$classId) {
                case 2:
                    ChannelAdminLogActivity channelAdminLogActivity = (ChannelAdminLogActivity) this.this$0;
                    channelAdminLogActivity.searchWas = true;
                    channelAdminLogActivity.searchQuery = editTextBoldCursor.getText().toString();
                    channelAdminLogActivity.loadMessages(true);
                    break;
                case 15:
                    PhotoPickerSearchActivity photoPickerSearchActivity = (PhotoPickerSearchActivity) this.this$0;
                    photoPickerSearchActivity.imagesSearch.getActionBar().onSearchPressed();
                    photoPickerSearchActivity.gifsSearch.getActionBar().onSearchPressed();
                    break;
            }
        }

        @Override
        public void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
            RecyclerListView recyclerListView;
            ChatActivity.AnonymousClass34 anonymousClass34;
            switch (this.$r8$classId) {
                case 0:
                    String string = editTextBoldCursor.getText().toString();
                    MessagesSearchContainer messagesSearchContainer = ((TopicsFragment) this.this$0).searchContainer;
                    if (!messagesSearchContainer.searchString.equals(string)) {
                        messagesSearchContainer.search$1(messagesSearchContainer.viewPages[0], messagesSearchContainer.getCurrentPosition(), string, false);
                        break;
                    }
                    break;
                case 1:
                    String string2 = editTextBoldCursor.getText().toString();
                    TimezoneSelector timezoneSelector = (TimezoneSelector) this.this$0;
                    timezoneSelector.query = string2;
                    timezoneSelector.listView.adapter.update(true);
                    timezoneSelector.listView.scrollToPosition(0);
                    break;
                case 3:
                    ChatLinkActivity chatLinkActivity = (ChatLinkActivity) this.this$0;
                    if (chatLinkActivity.searchAdapter != null) {
                        String string3 = editTextBoldCursor.getText().toString();
                        if (string3.length() != 0 && (recyclerListView = chatLinkActivity.listView) != null) {
                            RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                            ChatLinkActivity.SearchAdapter searchAdapter = chatLinkActivity.searchAdapter;
                            if (adapter != searchAdapter) {
                                chatLinkActivity.listView.setAdapter(searchAdapter);
                                View view = chatLinkActivity.fragmentView;
                                int i = Theme.key_windowBackgroundWhite;
                                view.setBackgroundColor(Theme.getColor(null, i, false));
                                chatLinkActivity.fragmentView.setTag(Integer.valueOf(i));
                                chatLinkActivity.searchAdapter.mObservable.notifyChanged();
                                chatLinkActivity.listView.setFastScrollVisible(false);
                                chatLinkActivity.listView.setVerticalScrollBarEnabled(true);
                                chatLinkActivity.emptyView.showProgress();
                            }
                        }
                        chatLinkActivity.searchAdapter.searchDialogs(string3);
                        break;
                    }
                    break;
                case 4:
                    ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.this$0;
                    if (chatUsersActivity.searchListViewAdapter != null) {
                        String string4 = editTextBoldCursor.getText().toString();
                        int itemCount = chatUsersActivity.listView.getAdapter() == null ? 0 : chatUsersActivity.listView.getAdapter().getItemCount();
                        chatUsersActivity.searchListViewAdapter.searchUsers(string4);
                        if (TextUtils.isEmpty(string4) && (anonymousClass34 = chatUsersActivity.listView) != null) {
                            RecyclerView.Adapter adapter2 = anonymousClass34.getAdapter();
                            ChatUsersActivity.ListAdapter listAdapter = chatUsersActivity.listViewAdapter;
                            if (adapter2 != listAdapter) {
                                ChatActivity.AnonymousClass34 anonymousClass35 = chatUsersActivity.listView;
                                anonymousClass35.animateEmptyView = false;
                                anonymousClass35.emptyViewAnimationType = 0;
                                anonymousClass35.setAdapter(listAdapter);
                                if (itemCount == 0) {
                                    chatUsersActivity.showItemsAnimated(0);
                                }
                            }
                        }
                        chatUsersActivity.progressBar.setVisibility(8);
                        chatUsersActivity.flickerLoadingView.setVisibility(0);
                        break;
                    }
                    break;
                case 5:
                    int length = editTextBoldCursor.length();
                    AudioPlayerAlert audioPlayerAlert = (AudioPlayerAlert) this.this$0;
                    if (length > 0) {
                        audioPlayerAlert.listAdapter.search(editTextBoldCursor.getText().toString());
                    } else {
                        audioPlayerAlert.searchWas = false;
                        audioPlayerAlert.listAdapter.search(null);
                    }
                    break;
                case 6:
                    ((ChatAttachAlertDocumentLayout) this.this$0).searchAdapter.search(editTextBoldCursor.getText().toString(), false);
                    break;
                case 7:
                    ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.this$0;
                    if (chatAttachAlertLocationLayout.searchAdapter != null) {
                        String string5 = editTextBoldCursor.getText().toString();
                        boolean z = false;
                        if (string5.length() != 0) {
                            chatAttachAlertLocationLayout.searchWas = true;
                            chatAttachAlertLocationLayout.searchItem.setShowSearchProgress(true);
                            chatAttachAlertLocationLayout.getClass();
                            chatAttachAlertLocationLayout.listView.setVisibility(8);
                            chatAttachAlertLocationLayout.mapViewClip.setVisibility(8);
                            RecyclerView.Adapter adapter3 = chatAttachAlertLocationLayout.searchListView.getAdapter();
                            ChatAttachAlertLocationLayout.AnonymousClass6 anonymousClass6 = chatAttachAlertLocationLayout.searchAdapter;
                            if (adapter3 != anonymousClass6) {
                                chatAttachAlertLocationLayout.searchListView.setAdapter(anonymousClass6);
                            }
                            chatAttachAlertLocationLayout.searchListView.setVisibility(0);
                            ChatAttachAlertLocationLayout.AnonymousClass6 anonymousClass7 = chatAttachAlertLocationLayout.searchAdapter;
                            if (anonymousClass7.places.size() == 0 && anonymousClass7.locations.size() == 0) {
                                z = true;
                            }
                            chatAttachAlertLocationLayout.searchInProgress = z;
                            chatAttachAlertLocationLayout.updateEmptyView$3();
                        } else {
                            chatAttachAlertLocationLayout.getClass();
                            chatAttachAlertLocationLayout.listView.setVisibility(0);
                            chatAttachAlertLocationLayout.mapViewClip.setVisibility(0);
                            chatAttachAlertLocationLayout.searchListView.setAdapter(null);
                            chatAttachAlertLocationLayout.searchListView.setVisibility(8);
                            chatAttachAlertLocationLayout.emptyView.setVisibility(8);
                        }
                        chatAttachAlertLocationLayout.searchAdapter.searchDelayed(string5, chatAttachAlertLocationLayout.userLocation);
                        break;
                    }
                    break;
                case 8:
                    ContactsActivity contactsActivity = (ContactsActivity) this.this$0;
                    if (contactsActivity.searchListViewAdapter != null) {
                        String string6 = editTextBoldCursor.getText().toString();
                        contactsActivity.animatorSearchHasQuery.setValue(!string6.isEmpty(), true);
                        contactsActivity.searchQuery = string6;
                        if (string6.isEmpty()) {
                            RecyclerListView recyclerListView2 = contactsActivity.listView;
                            if (recyclerListView2 != null) {
                                recyclerListView2.setAdapter(contactsActivity.listViewAdapter);
                                contactsActivity.listView.setSectionsType(1);
                            }
                        } else {
                            contactsActivity.searchWas = true;
                            RecyclerListView recyclerListView3 = contactsActivity.listView;
                            if (recyclerListView3 != null) {
                                recyclerListView3.setAdapter(contactsActivity.searchListViewAdapter);
                                contactsActivity.listView.setSectionsType(0);
                                contactsActivity.searchListViewAdapter.mObservable.notifyChanged();
                                contactsActivity.listView.setFastScrollVisible(false);
                                contactsActivity.listView.setVerticalScrollBarEnabled(true);
                            }
                            contactsActivity.emptyView.showProgress(true, true);
                            contactsActivity.searchListViewAdapter.searchDialogs(string6);
                        }
                        break;
                    }
                    break;
                case 9:
                    String string7 = editTextBoldCursor.getText().toString();
                    boolean zIsEmpty = TextUtils.isEmpty(string7);
                    CountrySelectActivity countrySelectActivity = (CountrySelectActivity) this.this$0;
                    if (zIsEmpty) {
                        CountrySelectActivity.CountrySearchAdapter countrySearchAdapter = countrySelectActivity.searchListViewAdapter;
                        countrySearchAdapter.getClass();
                        countrySearchAdapter.searchResult = null;
                        countrySelectActivity.searchWas = false;
                        countrySelectActivity.listView.setAdapter(countrySelectActivity.listViewAdapter);
                        countrySelectActivity.listView.setFastScrollVisible(true);
                    } else {
                        CountrySelectActivity.CountrySearchAdapter countrySearchAdapter2 = countrySelectActivity.searchListViewAdapter;
                        countrySearchAdapter2.getClass();
                        if (string7 == null) {
                            countrySearchAdapter2.searchResult = null;
                        } else {
                            try {
                                Timer timer = countrySearchAdapter2.searchTimer;
                                if (timer != null) {
                                    timer.cancel();
                                }
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            Timer timer2 = new Timer();
                            countrySearchAdapter2.searchTimer = timer2;
                            timer2.schedule(new SearchAdapter.AnonymousClass2(countrySearchAdapter2, string7, 1), 100L, 300L);
                        }
                        if (string7.length() != 0) {
                            countrySelectActivity.searchWas = true;
                        }
                    }
                    break;
                case 10:
                    DialogOrContactPickerActivity dialogOrContactPickerActivity = (DialogOrContactPickerActivity) this.this$0;
                    dialogOrContactPickerActivity.dialogsActivity.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                    dialogOrContactPickerActivity.contactsActivity.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                    break;
                case 11:
                    String string8 = editTextBoldCursor.getText().toString();
                    GroupStickersActivity groupStickersActivity = (GroupStickersActivity) this.this$0;
                    groupStickersActivity.searchAdapter.onSearchStickers(string8);
                    boolean zIsEmpty2 = TextUtils.isEmpty(string8);
                    boolean z2 = !zIsEmpty2;
                    if (z2 != groupStickersActivity.searching) {
                        groupStickersActivity.searching = z2;
                        RecyclerListView recyclerListView4 = groupStickersActivity.listView;
                        if (recyclerListView4 != null) {
                            recyclerListView4.setAdapter(!zIsEmpty2 ? groupStickersActivity.searchAdapter : groupStickersActivity.listAdapter);
                        }
                    }
                    break;
                case 12:
                    String string9 = editTextBoldCursor.getText().toString();
                    LanguageSelectActivity languageSelectActivity = (LanguageSelectActivity) this.this$0;
                    if (string9 == null) {
                        languageSelectActivity.searchResult = null;
                        if (languageSelectActivity.listView != null) {
                            languageSelectActivity.emptyView.setVisibility(8);
                            languageSelectActivity.listView.setAdapter(languageSelectActivity.listAdapter);
                        }
                    } else {
                        Utilities.searchQueue.postRunnable(new LaunchActivity$$ExternalSyntheticLambda13(21, languageSelectActivity, string9));
                    }
                    if (string9.length() != 0) {
                        LanguageSelectActivity languageSelectActivity2 = (LanguageSelectActivity) this.this$0;
                        RecyclerListView recyclerListView5 = languageSelectActivity2.listView;
                        if (recyclerListView5 != null) {
                            recyclerListView5.setAdapter(languageSelectActivity2.searchListViewAdapter);
                        }
                    } else {
                        LanguageSelectActivity languageSelectActivity3 = (LanguageSelectActivity) this.this$0;
                        if (languageSelectActivity3.listView != null) {
                            languageSelectActivity3.emptyView.setVisibility(8);
                            LanguageSelectActivity languageSelectActivity4 = (LanguageSelectActivity) this.this$0;
                            languageSelectActivity4.listView.setAdapter(languageSelectActivity4.listAdapter);
                        }
                    }
                    break;
                case 13:
                    LocationActivity locationActivity = (LocationActivity) this.this$0;
                    if (locationActivity.searchAdapter != null) {
                        String string10 = editTextBoldCursor.getText().toString();
                        if (string10.length() != 0) {
                            locationActivity.searchWas = true;
                            locationActivity.searchItem.setShowSearchProgress(true);
                            ActionBarMenuItem actionBarMenuItem = locationActivity.otherItem;
                            if (actionBarMenuItem != null) {
                                actionBarMenuItem.setVisibility(8);
                            }
                            locationActivity.listView.setVisibility(8);
                            locationActivity.mapViewClip.setVisibility(8);
                            RecyclerView.Adapter adapter4 = locationActivity.searchListView.getAdapter();
                            LocationActivity.AnonymousClass9 anonymousClass9 = locationActivity.searchAdapter;
                            if (adapter4 != anonymousClass9) {
                                locationActivity.searchListView.setAdapter(anonymousClass9);
                            }
                            locationActivity.searchListView.setVisibility(0);
                            locationActivity.searchInProgress = locationActivity.searchAdapter.getItemCount() == 0;
                        } else {
                            ActionBarMenuItem actionBarMenuItem2 = locationActivity.otherItem;
                            if (actionBarMenuItem2 != null) {
                                actionBarMenuItem2.setVisibility(0);
                            }
                            locationActivity.listView.setVisibility(0);
                            locationActivity.mapViewClip.setVisibility(0);
                            locationActivity.searchListView.setAdapter(null);
                            locationActivity.searchListView.setVisibility(8);
                        }
                        locationActivity.updateEmptyView$5();
                        locationActivity.searchAdapter.searchDelayed(string10, locationActivity.userLocation);
                        break;
                    }
                    break;
                case 14:
                    ((MemberRequestsActivity) this.this$0).delegate.setQuery(editTextBoldCursor.getText().toString());
                    break;
                case 15:
                    PhotoPickerSearchActivity photoPickerSearchActivity = (PhotoPickerSearchActivity) this.this$0;
                    photoPickerSearchActivity.imagesSearch.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                    photoPickerSearchActivity.gifsSearch.getActionBar().setSearchFieldText(editTextBoldCursor.getText().toString());
                    break;
                case 16:
                    ((ProfileActivity) this.this$0).searchAdapter.search(editTextBoldCursor.getText().toString().toLowerCase());
                    break;
                case 17:
                    String string11 = editTextBoldCursor.getText().toString();
                    RestrictedLanguagesSelectActivity restrictedLanguagesSelectActivity = (RestrictedLanguagesSelectActivity) this.this$0;
                    if (string11 == null) {
                        restrictedLanguagesSelectActivity.searchResult = null;
                    } else {
                        String lowerCase = string11.trim().toLowerCase();
                        ArrayList arrayList = restrictedLanguagesSelectActivity.searchResult;
                        if (arrayList == null) {
                            restrictedLanguagesSelectActivity.searchResult = new ArrayList();
                        } else {
                            arrayList.clear();
                        }
                        for (int i2 = 0; i2 < restrictedLanguagesSelectActivity.allLanguages.size(); i2++) {
                            TranslateController.Language language = (TranslateController.Language) restrictedLanguagesSelectActivity.allLanguages.get(i2);
                            if (language.q.startsWith(lowerCase)) {
                                restrictedLanguagesSelectActivity.searchResult.add(0, language);
                            } else if (language.q.contains(lowerCase)) {
                                restrictedLanguagesSelectActivity.searchResult.add(language);
                            }
                        }
                        restrictedLanguagesSelectActivity.searchListViewAdapter.mObservable.notifyChanged();
                    }
                    if (string11.length() != 0) {
                        RecyclerListView recyclerListView6 = restrictedLanguagesSelectActivity.listView;
                        if (recyclerListView6 != null) {
                            recyclerListView6.setAdapter(restrictedLanguagesSelectActivity.searchListViewAdapter);
                        }
                    } else if (restrictedLanguagesSelectActivity.listView != null) {
                        restrictedLanguagesSelectActivity.emptyView.setVisibility(8);
                        restrictedLanguagesSelectActivity.listView.setAdapter(restrictedLanguagesSelectActivity.listAdapter);
                    }
                    break;
                case 18:
                    ((SettingsActivity) this.this$0).search.search(editTextBoldCursor.getText().toString());
                    break;
                case 19:
                    String string12 = editTextBoldCursor.getText().toString();
                    UserInfoActivity.ChooseChannelFragment chooseChannelFragment = (UserInfoActivity.ChooseChannelFragment) this.this$0;
                    chooseChannelFragment.query = string12;
                    UniversalFragment.AnonymousClass3 anonymousClass3 = chooseChannelFragment.listView;
                    if (anonymousClass3 != null) {
                        anonymousClass3.adapter.update(true);
                    }
                    break;
            }
        }

        private final void onSearchExpand$org$telegram$ui$GroupStickersActivity$2() {
        }

        private final void onSearchExpand$org$telegram$ui$RestrictedLanguagesSelectActivity$2() {
        }

        private final void onSearchExpand$org$telegram$ui$UserInfoActivity$ChooseChannelFragment$1() {
        }

        private final void onSearchFilterCleared$org$telegram$ui$TopicsFragment$3(FiltersView.MediaFilterData mediaFilterData) {
        }
    }
}
