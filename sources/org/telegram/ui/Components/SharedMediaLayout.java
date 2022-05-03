package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$ChannelParticipant;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipant;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$DocumentAttribute;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$InputUser;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_channelParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_channelParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_chatChannelParticipant;
import org.telegram.tgnet.TLRPC$TL_chatParticipantAdmin;
import org.telegram.tgnet.TLRPC$TL_chatParticipantCreator;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeImageSize;
import org.telegram.tgnet.TLRPC$TL_documentAttributeVideo;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterDocument;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterMusic;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotoVideo;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterPhotos;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterRoundVoice;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterUrl;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterVideo;
import org.telegram.tgnet.TLRPC$TL_inputUserEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_getCommonChats;
import org.telegram.tgnet.TLRPC$TL_messages_getSearchResultsPositions;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_messages_searchResultsPositions;
import org.telegram.tgnet.TLRPC$TL_searchResultPosition;
import org.telegram.tgnet.TLRPC$TL_webPageEmpty;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$WebPage;
import org.telegram.tgnet.TLRPC$messages_Chats;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedDocumentCell;
import org.telegram.ui.Cells.SharedLinkCell;
import org.telegram.ui.Cells.SharedMediaSectionCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;

public class SharedMediaLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private Paint RED;
    private ActionBar actionBar;
    private AnimatorSet actionModeAnimation;
    private LinearLayout actionModeLayout;
    private float additionalFloatingTranslation;
    private int animateToColumnsCount;
    private boolean animatingForward;
    int animationIndex;
    private SharedPhotoVideoAdapter animationSupportingPhotoVideoAdapter;
    private SharedDocumentsAdapter audioAdapter;
    private MediaSearchAdapter audioSearchAdapter;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private int cantDeleteMessagesCount;
    private boolean changeTypeAnimation;
    private ChatUsersAdapter chatUsersAdapter;
    private ImageView closeButton;
    private CommonGroupsAdapter commonGroupsAdapter;
    final Delegate delegate;
    private ActionBarMenuItem deleteItem;
    private long dialog_id;
    private SharedDocumentsAdapter documentsAdapter;
    private MediaSearchAdapter documentsSearchAdapter;
    private AnimatorSet floatingDateAnimation;
    private ChatActionCell floatingDateView;
    private ActionBarMenuItem forwardItem;
    private FragmentContextView fragmentContextView;
    private HintView fwdRestrictedHint;
    private GifAdapter gifAdapter;
    FlickerLoadingView globalGradientView;
    private ActionBarMenuItem gotoItem;
    private GroupUsersSearchAdapter groupUsersSearchAdapter;
    private int[] hasMedia;
    private boolean ignoreSearchCollapse;
    private TLRPC$ChatFull info;
    private int initialTab;
    private boolean isActionModeShowed;
    boolean isInPinchToZoomTouchMode;
    boolean isPinnedToTop;
    Runnable jumpToRunnable;
    int lastMeasuredTopPadding;
    private SharedLinksAdapter linksAdapter;
    private MediaSearchAdapter linksSearchAdapter;
    private int maximumVelocity;
    boolean maybePinchToZoomTouchMode;
    boolean maybePinchToZoomTouchMode2;
    private boolean maybeStartTracking;
    private int mediaColumnsCount;
    private long mergeDialogId;
    ActionBarPopupWindow optionsWindow;
    private SharedPhotoVideoAdapter photoVideoAdapter;
    private boolean photoVideoChangeColumnsAnimation;
    private float photoVideoChangeColumnsProgress;
    public ImageView photoVideoOptionsItem;
    int pinchCenterOffset;
    int pinchCenterPosition;
    int pinchCenterX;
    int pinchCenterY;
    float pinchScale;
    boolean pinchScaleUp;
    float pinchStartDistance;
    private Drawable pinnedHeaderShadowDrawable;
    private int pointerId1;
    private int pointerId2;
    private BaseFragment profileActivity;
    private ScrollSlidingTextTabStripInner scrollSlidingTextTabStrip;
    private boolean scrolling;
    public boolean scrollingByUser;
    private ActionBarMenuItem searchItem;
    private int searchItemState;
    private boolean searchWas;
    private boolean searching;
    private NumberTextView selectedMessagesCountTextView;
    private View shadowLine;
    private SharedMediaPreloader sharedMediaPreloader;
    private boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    int topPadding;
    private VelocityTracker velocityTracker;
    private final int viewType;
    private SharedDocumentsAdapter voiceAdapter;
    private static final int[] supportedFastScrollTypes = {0, 1, 2, 4};
    private static final Interpolator interpolator = SharedMediaLayout$$ExternalSyntheticLambda5.INSTANCE;
    Rect rect = new Rect();
    private MediaPage[] mediaPages = new MediaPage[2];
    private ArrayList<SharedPhotoVideoCell> cellCache = new ArrayList<>(10);
    private ArrayList<SharedPhotoVideoCell> cache = new ArrayList<>(10);
    private ArrayList<SharedAudioCell> audioCellCache = new ArrayList<>(10);
    private ArrayList<SharedAudioCell> audioCache = new ArrayList<>(10);
    private Runnable hideFloatingDateRunnable = new Runnable() {
        @Override
        public final void run() {
            SharedMediaLayout.this.lambda$new$0();
        }
    };
    private ArrayList<View> actionModeViews = new ArrayList<>();
    private Paint backgroundPaint = new Paint();
    private SparseArray<MessageObject>[] selectedFiles = {new SparseArray<>(), new SparseArray<>()};
    private ArrayList<SharedPhotoVideoCell2> animationSupportingSortedCells = new ArrayList<>();
    private PhotoViewer.PhotoViewerProvider provider = new PhotoViewer.EmptyPhotoViewerProvider() {
        @Override
        public org.telegram.ui.PhotoViewer.PlaceProviderObject getPlaceForPhoto(org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC$FileLocation r18, int r19, boolean r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.AnonymousClass1.getPlaceForPhoto(org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean):org.telegram.ui.PhotoViewer$PlaceProviderObject");
        }
    };
    private SharedMediaData[] sharedMediaData = new SharedMediaData[6];
    SparseArray<Float> messageAlphaEnter = new SparseArray<>();
    SharedLinkCell.SharedLinkCellDelegate sharedLinkCellDelegate = new AnonymousClass30();

    public interface Delegate {
        boolean canSearchMembers();

        TLRPC$Chat getCurrentChat();

        RecyclerListView getListView();

        boolean isFragmentOpened();

        boolean onMemberClick(TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z, boolean z2);

        void scrollToSharedMedia();

        void updateSelectedMediaTabText();
    }

    public interface SharedMediaPreloaderDelegate {
        void mediaCountUpdated();
    }

    public static boolean lambda$new$8(View view, MotionEvent motionEvent) {
        return true;
    }

    public static float lambda$static$1(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void showFloatingDateView() {
    }

    protected boolean canShowSearchItem() {
        return true;
    }

    public int getNextMediaColumnsCount(int i, boolean z) {
        if (!z) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                return 9;
                            }
                            return i;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 3;
        }
        if (i != 9) {
            if (i != 6) {
                if (i != 5) {
                    if (i != 4) {
                        if (i == 3) {
                            return 2;
                        }
                        return i;
                    }
                    return 3;
                }
                return 4;
            }
            return 5;
        }
        return 6;
    }

    protected void invalidateBlur() {
    }

    protected boolean onMemberClick(TLRPC$ChatParticipant tLRPC$ChatParticipant, boolean z) {
        return false;
    }

    protected void onSearchStateChanged(boolean z) {
    }

    protected void onSelectedTabChanged() {
    }

    public boolean isInFastScroll() {
        MediaPage[] mediaPageArr = this.mediaPages;
        return (mediaPageArr[0] == null || mediaPageArr[0].listView.getFastScroll() == null || !this.mediaPages[0].listView.getFastScroll().isPressed()) ? false : true;
    }

    public boolean dispatchFastScrollEvent(MotionEvent motionEvent) {
        View view = (View) getParent();
        motionEvent.offsetLocation(((-view.getX()) - getX()) - this.mediaPages[0].listView.getFastScroll().getX(), (((-view.getY()) - getY()) - this.mediaPages[0].getY()) - this.mediaPages[0].listView.getFastScroll().getY());
        return this.mediaPages[0].listView.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent) {
        if (this.mediaPages[0].selectedType != 0 || getParent() == null) {
            return false;
        }
        if (this.photoVideoChangeColumnsAnimation && !this.isInPinchToZoomTouchMode) {
            return true;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (this.maybePinchToZoomTouchMode && !this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                this.pinchScale = 1.0f;
                this.pointerId1 = motionEvent.getPointerId(0);
                this.pointerId2 = motionEvent.getPointerId(1);
                this.mediaPages[0].listView.cancelClickRunnables(false);
                this.mediaPages[0].listView.cancelLongPress();
                this.mediaPages[0].listView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                View view = (View) getParent();
                this.pinchCenterX = (int) (((((int) ((motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f)) - view.getX()) - getX()) - this.mediaPages[0].getX());
                int y = (int) (((((int) ((motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f)) - view.getY()) - getY()) - this.mediaPages[0].getY());
                this.pinchCenterY = y;
                selectPinchPosition(this.pinchCenterX, y);
                this.maybePinchToZoomTouchMode2 = true;
            }
            if (motionEvent.getActionMasked() == 0 && ((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - this.mediaPages[0].getY() > 0.0f) {
                this.maybePinchToZoomTouchMode = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && (this.isInPinchToZoomTouchMode || this.maybePinchToZoomTouchMode2)) {
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
                if (this.pointerId1 == motionEvent.getPointerId(i3)) {
                    i = i3;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i3)) {
                    i2 = i3;
                }
            }
            if (i == -1 || i2 == -1) {
                this.maybePinchToZoomTouchMode = false;
                this.maybePinchToZoomTouchMode2 = false;
                this.isInPinchToZoomTouchMode = false;
                finishPinchToMediaColumnsCount();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i2) - motionEvent.getX(i), motionEvent.getY(i2) - motionEvent.getY(i))) / this.pinchStartDistance;
            this.pinchScale = hypot;
            if (!this.isInPinchToZoomTouchMode && (hypot > 1.01f || hypot < 0.99f)) {
                this.isInPinchToZoomTouchMode = true;
                boolean z = hypot > 1.0f;
                this.pinchScaleUp = z;
                startPinchToMediaColumnsCount(z);
            }
            if (this.isInPinchToZoomTouchMode) {
                boolean z2 = this.pinchScaleUp;
                if ((!z2 || this.pinchScale >= 1.0f) && (z2 || this.pinchScale <= 1.0f)) {
                    this.photoVideoChangeColumnsProgress = Math.max(0.0f, Math.min(1.0f, z2 ? 1.0f - ((2.0f - this.pinchScale) / 1.0f) : (1.0f - this.pinchScale) / 0.5f));
                } else {
                    this.photoVideoChangeColumnsProgress = 0.0f;
                }
                float f = this.photoVideoChangeColumnsProgress;
                if (f == 1.0f || f == 0.0f) {
                    if (f == 1.0f) {
                        int ceil = (int) Math.ceil(this.pinchCenterPosition / this.animateToColumnsCount);
                        float measuredWidth = this.startedTrackingX / (this.mediaPages[0].listView.getMeasuredWidth() - ((int) (this.mediaPages[0].listView.getMeasuredWidth() / this.animateToColumnsCount)));
                        int i4 = this.animateToColumnsCount;
                        int i5 = (ceil * i4) + ((int) (measuredWidth * (i4 - 1)));
                        if (i5 >= this.photoVideoAdapter.getItemCount()) {
                            i5 = this.photoVideoAdapter.getItemCount() - 1;
                        }
                        this.pinchCenterPosition = i5;
                    }
                    finishPinchToMediaColumnsCount();
                    if (this.photoVideoChangeColumnsProgress == 0.0f) {
                        this.pinchScaleUp = !this.pinchScaleUp;
                    }
                    startPinchToMediaColumnsCount(this.pinchScaleUp);
                    this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                }
                this.mediaPages[0].listView.invalidate();
                MediaPage[] mediaPageArr = this.mediaPages;
                if (mediaPageArr[0].fastScrollHintView != null) {
                    mediaPageArr[0].invalidate();
                }
            }
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && checkPointerIds(motionEvent)) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
            this.maybePinchToZoomTouchMode2 = false;
            this.maybePinchToZoomTouchMode = false;
            this.isInPinchToZoomTouchMode = false;
            finishPinchToMediaColumnsCount();
        }
        return this.isInPinchToZoomTouchMode;
    }

    private void selectPinchPosition(int i, int i2) {
        this.pinchCenterPosition = -1;
        int i3 = i2 + this.mediaPages[0].listView.blurTopPadding;
        if (getY() != 0.0f && this.viewType == 1) {
            i3 = 0;
        }
        for (int i4 = 0; i4 < this.mediaPages[0].listView.getChildCount(); i4++) {
            View childAt = this.mediaPages[0].listView.getChildAt(i4);
            childAt.getHitRect(this.rect);
            if (this.rect.contains(i, i3)) {
                this.pinchCenterPosition = this.mediaPages[0].listView.getChildLayoutPosition(childAt);
                this.pinchCenterOffset = childAt.getTop();
            }
        }
        if (this.delegate.canSearchMembers() && this.pinchCenterPosition == -1) {
            this.pinchCenterPosition = (int) (this.mediaPages[0].layoutManager.findFirstVisibleItemPosition() + ((this.mediaColumnsCount - 1) * Math.min(1.0f, Math.max(i / this.mediaPages[0].listView.getMeasuredWidth(), 0.0f))));
            this.pinchCenterOffset = 0;
        }
    }

    private boolean checkPointerIds(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() < 2) {
            return false;
        }
        if (this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) {
            return true;
        }
        return this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0);
    }

    public boolean isSwipeBackEnabled() {
        return !this.photoVideoChangeColumnsAnimation && !this.tabsAnimationInProgress;
    }

    public int getPhotosVideosTypeFilter() {
        return this.sharedMediaData[0].filterType;
    }

    public boolean isPinnedToTop() {
        return this.isPinnedToTop;
    }

    public void setPinnedToTop(boolean z) {
        if (this.isPinnedToTop != z) {
            this.isPinnedToTop = z;
            int i = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i < mediaPageArr.length) {
                    updateFastScrollVisibility(mediaPageArr[i], true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void drawListForBlur(Canvas canvas) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i < mediaPageArr.length) {
                if (mediaPageArr[i] != null && mediaPageArr[i].getVisibility() == 0) {
                    for (int i2 = 0; i2 < this.mediaPages[i].listView.getChildCount(); i2++) {
                        View childAt = this.mediaPages[i].listView.getChildAt(i2);
                        if (childAt.getY() < this.mediaPages[i].listView.blurTopPadding + AndroidUtilities.dp(100.0f)) {
                            int save = canvas.save();
                            canvas.translate(this.mediaPages[i].getX() + childAt.getX(), getY() + this.mediaPages[i].getY() + this.mediaPages[i].listView.getY() + childAt.getY());
                            childAt.draw(canvas);
                            canvas.restoreToCount(save);
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static class MediaPage extends FrameLayout {
        private ClippingImageView animatingImageView;
        private GridLayoutManager animationSupportingLayoutManager;
        private BlurredRecyclerView animationSupportingListView;
        private StickerEmptyView emptyView;
        public ObjectAnimator fastScrollAnimator;
        public boolean fastScrollEnabled;
        public Runnable fastScrollHideHintRunnable;
        public boolean fastScrollHinWasShown;
        public SharedMediaFastScrollTooltip fastScrollHintView;
        public boolean highlightAnimation;
        public int highlightMessageId;
        public float highlightProgress;
        public long lastCheckScrollTime;
        private ExtendedGridLayoutManager layoutManager;
        private BlurredRecyclerView listView;
        private FlickerLoadingView progressView;
        private RecyclerAnimationScrollHelper scrollHelper;
        private int selectedType;

        public MediaPage(Context context) {
            super(context);
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.animationSupportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = this.fastScrollHintView;
            if (sharedMediaFastScrollTooltip != null && sharedMediaFastScrollTooltip.getVisibility() == 0) {
                RecyclerListView.FastScroll fastScroll = this.listView.getFastScroll();
                if (fastScroll != null) {
                    SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip2 = this.fastScrollHintView;
                    sharedMediaFastScrollTooltip2.setPivotX(sharedMediaFastScrollTooltip2.getMeasuredWidth());
                    this.fastScrollHintView.setPivotY(0.0f);
                    this.fastScrollHintView.setTranslationX((getMeasuredWidth() - this.fastScrollHintView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f));
                    this.fastScrollHintView.setTranslationY(fastScroll.getScrollBarY() + AndroidUtilities.dp(36.0f));
                }
                if (fastScroll.getProgress() > 0.85f) {
                    SharedMediaLayout.showFastScrollHint(this, null, false);
                }
            }
        }
    }

    public void updateFastScrollVisibility(MediaPage mediaPage, boolean z) {
        Integer num = 1;
        int i = 0;
        boolean z2 = mediaPage.fastScrollEnabled && this.isPinnedToTop;
        RecyclerListView.FastScroll fastScroll = mediaPage.listView.getFastScroll();
        ObjectAnimator objectAnimator = mediaPage.fastScrollAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            mediaPage.fastScrollAnimator.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            if (!z2) {
                i = 8;
            }
            fastScroll.setVisibility(i);
            if (!z2) {
                num = null;
            }
            fastScroll.setTag(num);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
        } else if (z2 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, View.ALPHA, fastScroll.getAlpha(), 1.0f);
            mediaPage.fastScrollAnimator = ofFloat;
            ofFloat.setDuration(150L).start();
            fastScroll.setTag(num);
        } else if (!z2 && fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, View.ALPHA, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new HideViewAfterAnimation(fastScroll));
            mediaPage.fastScrollAnimator = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public void lambda$new$0() {
        hideFloatingDateView(true);
    }

    public static class SharedMediaPreloader implements NotificationCenter.NotificationCenterDelegate {
        private long dialogId;
        private boolean mediaWasLoaded;
        private long mergeDialogId;
        private BaseFragment parentFragment;
        private SharedMediaData[] sharedMediaData;
        private int[] mediaCount = {-1, -1, -1, -1, -1, -1, -1, -1};
        private int[] mediaMergeCount = {-1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1};
        private ArrayList<SharedMediaPreloaderDelegate> delegates = new ArrayList<>();

        public SharedMediaPreloader(BaseFragment baseFragment) {
            this.parentFragment = baseFragment;
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                this.dialogId = chatActivity.getDialogId();
                this.mergeDialogId = chatActivity.getMergeDialogId();
            } else if (baseFragment instanceof ProfileActivity) {
                this.dialogId = ((ProfileActivity) baseFragment).getDialogId();
            } else if (baseFragment instanceof MediaActivity) {
                this.dialogId = ((MediaActivity) baseFragment).getDialogId();
            }
            this.sharedMediaData = new SharedMediaData[6];
            int i = 0;
            while (true) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (i < sharedMediaDataArr.length) {
                    sharedMediaDataArr[i] = new SharedMediaData();
                    this.sharedMediaData[i].setMaxId(0, DialogObject.isEncryptedDialog(this.dialogId) ? Integer.MIN_VALUE : ConnectionsManager.DEFAULT_DATACENTER_ID);
                    i++;
                } else {
                    loadMediaCounts();
                    NotificationCenter notificationCenter = this.parentFragment.getNotificationCenter();
                    notificationCenter.addObserver(this, NotificationCenter.mediaCountsDidLoad);
                    notificationCenter.addObserver(this, NotificationCenter.mediaCountDidLoad);
                    notificationCenter.addObserver(this, NotificationCenter.didReceiveNewMessages);
                    notificationCenter.addObserver(this, NotificationCenter.messageReceivedByServer);
                    notificationCenter.addObserver(this, NotificationCenter.mediaDidLoad);
                    notificationCenter.addObserver(this, NotificationCenter.messagesDeleted);
                    notificationCenter.addObserver(this, NotificationCenter.replaceMessagesObjects);
                    notificationCenter.addObserver(this, NotificationCenter.chatInfoDidLoad);
                    return;
                }
            }
        }

        public void addDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.add(sharedMediaPreloaderDelegate);
        }

        public void removeDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.remove(sharedMediaPreloaderDelegate);
        }

        public void onDestroy(BaseFragment baseFragment) {
            if (baseFragment == this.parentFragment) {
                this.delegates.clear();
                NotificationCenter notificationCenter = this.parentFragment.getNotificationCenter();
                notificationCenter.removeObserver(this, NotificationCenter.mediaCountsDidLoad);
                notificationCenter.removeObserver(this, NotificationCenter.mediaCountDidLoad);
                notificationCenter.removeObserver(this, NotificationCenter.didReceiveNewMessages);
                notificationCenter.removeObserver(this, NotificationCenter.messageReceivedByServer);
                notificationCenter.removeObserver(this, NotificationCenter.mediaDidLoad);
                notificationCenter.removeObserver(this, NotificationCenter.messagesDeleted);
                notificationCenter.removeObserver(this, NotificationCenter.replaceMessagesObjects);
                notificationCenter.removeObserver(this, NotificationCenter.chatInfoDidLoad);
            }
        }

        public int[] getLastMediaCount() {
            return this.lastMediaCount;
        }

        public SharedMediaData[] getSharedMediaData() {
            return this.sharedMediaData;
        }

        @Override
        public void didReceivedNotification(int r24, int r25, java.lang.Object... r26) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.SharedMediaPreloader.didReceivedNotification(int, int, java.lang.Object[]):void");
        }

        private void loadMediaCounts() {
            this.parentFragment.getMediaDataController().getMediaCounts(this.dialogId, this.parentFragment.getClassGuid());
            if (this.mergeDialogId != 0) {
                this.parentFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.parentFragment.getClassGuid());
            }
        }

        private void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
            if (tLRPC$ChatFull != null) {
                long j = tLRPC$ChatFull.migrated_from_chat_id;
                if (j != 0 && this.mergeDialogId == 0) {
                    this.mergeDialogId = -j;
                    this.parentFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.parentFragment.getClassGuid());
                }
            }
        }

        public boolean isMediaWasLoaded() {
            return this.mediaWasLoaded;
        }
    }

    public static class SharedMediaData {
        private int endLoadingStubs;
        public boolean fastScrollDataLoaded;
        public int frozenEndLoadingStubs;
        public int frozenStartOffset;
        private boolean hasPhotos;
        private boolean hasVideos;
        public boolean isFrozen;
        public boolean loading;
        public boolean loadingAfterFastScroll;
        public int min_id;
        public int requestIndex;
        private int startOffset;
        public int totalCount;
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public SparseArray<MessageObject>[] messagesDict = {new SparseArray<>(), new SparseArray<>()};
        public ArrayList<String> sections = new ArrayList<>();
        public HashMap<String, ArrayList<MessageObject>> sectionArrays = new HashMap<>();
        public ArrayList<Period> fastScrollPeriods = new ArrayList<>();
        public boolean[] endReached = {false, true};
        public int[] max_id = {0, 0};
        public boolean startReached = true;
        public int filterType = 0;
        public ArrayList<MessageObject> frozenMessages = new ArrayList<>();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

        static int access$6910(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.endLoadingStubs;
            sharedMediaData.endLoadingStubs = i - 1;
            return i;
        }

        static int access$710(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.startOffset;
            sharedMediaData.startOffset = i - 1;
            return i;
        }

        public void setTotalCount(int i) {
            this.totalCount = i;
        }

        public void setMaxId(int i, int i2) {
            this.max_id[i] = i2;
        }

        public void setEndReached(int i, boolean z) {
            this.endReached[i] = z;
        }

        public boolean addMessage(MessageObject messageObject, int i, boolean z, boolean z2) {
            if (this.messagesDict[i].indexOfKey(messageObject.getId()) >= 0) {
                return false;
            }
            ArrayList<MessageObject> arrayList = this.sectionArrays.get(messageObject.monthKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.sectionArrays.put(messageObject.monthKey, arrayList);
                if (z) {
                    this.sections.add(0, messageObject.monthKey);
                } else {
                    this.sections.add(messageObject.monthKey);
                }
            }
            if (z) {
                arrayList.add(0, messageObject);
                this.messages.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
                this.messages.add(messageObject);
            }
            this.messagesDict[i].put(messageObject.getId(), messageObject);
            if (z2) {
                this.max_id[i] = Math.max(messageObject.getId(), this.max_id[i]);
                this.min_id = Math.min(messageObject.getId(), this.min_id);
            } else if (messageObject.getId() > 0) {
                this.max_id[i] = Math.min(messageObject.getId(), this.max_id[i]);
                this.min_id = Math.max(messageObject.getId(), this.min_id);
            }
            if (!this.hasVideos && messageObject.isVideo()) {
                this.hasVideos = true;
            }
            if (!this.hasPhotos && messageObject.isPhoto()) {
                this.hasPhotos = true;
            }
            return true;
        }

        public MessageObject deleteMessage(int i, int i2) {
            ArrayList<MessageObject> arrayList;
            MessageObject messageObject = this.messagesDict[i2].get(i);
            if (messageObject == null || (arrayList = this.sectionArrays.get(messageObject.monthKey)) == null) {
                return null;
            }
            arrayList.remove(messageObject);
            this.messages.remove(messageObject);
            this.messagesDict[i2].remove(messageObject.getId());
            if (arrayList.isEmpty()) {
                this.sectionArrays.remove(messageObject.monthKey);
                this.sections.remove(messageObject.monthKey);
            }
            this.totalCount--;
            return messageObject;
        }

        public void replaceMid(int i, int i2) {
            MessageObject messageObject = this.messagesDict[0].get(i);
            if (messageObject != null) {
                this.messagesDict[0].remove(i);
                this.messagesDict[0].put(i2, messageObject);
                messageObject.messageOwner.id = i2;
                int[] iArr = this.max_id;
                iArr[0] = Math.min(i2, iArr[0]);
            }
        }

        public ArrayList<MessageObject> getMessages() {
            return this.isFrozen ? this.frozenMessages : this.messages;
        }

        public int getStartOffset() {
            return this.isFrozen ? this.frozenStartOffset : this.startOffset;
        }

        public void setListFrozen(boolean z) {
            if (this.isFrozen != z) {
                this.isFrozen = z;
                if (z) {
                    this.frozenStartOffset = this.startOffset;
                    this.frozenEndLoadingStubs = this.endLoadingStubs;
                    this.frozenMessages.clear();
                    this.frozenMessages.addAll(this.messages);
                }
            }
        }

        public int getEndLoadingStubs() {
            return this.isFrozen ? this.frozenEndLoadingStubs : this.endLoadingStubs;
        }
    }

    public static class Period {
        int date;
        public String formatedDate;
        int maxId;
        public int startOffset;

        public Period(TLRPC$TL_searchResultPosition tLRPC$TL_searchResultPosition) {
            int i = tLRPC$TL_searchResultPosition.date;
            this.date = i;
            this.maxId = tLRPC$TL_searchResultPosition.msg_id;
            this.startOffset = tLRPC$TL_searchResultPosition.offset;
            this.formatedDate = LocaleController.formatYearMont(i, true);
        }
    }

    public SharedMediaLayout(Context context, long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList<Integer> arrayList, TLRPC$ChatFull tLRPC$ChatFull, boolean z, BaseFragment baseFragment, Delegate delegate, int i2) {
        super(context);
        RecyclerListView.Holder holder;
        TLRPC$ChatFull tLRPC$ChatFull2;
        TLRPC$ChatFull tLRPC$ChatFull3 = tLRPC$ChatFull;
        int i3 = 2;
        this.mediaColumnsCount = 3;
        Paint paint = new Paint();
        this.RED = paint;
        paint.setColor(-65536);
        this.viewType = i2;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
        this.sharedMediaPreloader = sharedMediaPreloader;
        this.delegate = delegate;
        int[] lastMediaCount = sharedMediaPreloader.getLastMediaCount();
        this.hasMedia = new int[]{lastMediaCount[0], lastMediaCount[1], lastMediaCount[2], lastMediaCount[3], lastMediaCount[4], lastMediaCount[5], i};
        if (z) {
            this.initialTab = 7;
        } else {
            int i4 = 0;
            while (true) {
                int[] iArr = this.hasMedia;
                if (i4 >= iArr.length) {
                    break;
                } else if (iArr[i4] == -1 || iArr[i4] > 0) {
                    break;
                } else {
                    i4++;
                }
            }
            this.initialTab = i4;
        }
        this.info = tLRPC$ChatFull3;
        if (tLRPC$ChatFull3 != null) {
            this.mergeDialogId = -tLRPC$ChatFull3.migrated_from_chat_id;
        }
        this.dialog_id = j;
        int i5 = 0;
        while (true) {
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (i5 >= sharedMediaDataArr.length) {
                break;
            }
            sharedMediaDataArr[i5] = new SharedMediaData();
            this.sharedMediaData[i5].max_id[0] = DialogObject.isEncryptedDialog(this.dialog_id) ? Integer.MIN_VALUE : ConnectionsManager.DEFAULT_DATACENTER_ID;
            fillMediaData(i5);
            if (!(this.mergeDialogId == 0 || (tLRPC$ChatFull2 = this.info) == null)) {
                SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                sharedMediaDataArr2[i5].max_id[1] = tLRPC$ChatFull2.migrated_from_max_id;
                sharedMediaDataArr2[i5].endReached[1] = false;
            }
            i5++;
        }
        this.profileActivity = baseFragment;
        this.actionBar = baseFragment.getActionBar();
        this.mediaColumnsCount = SharedConfig.mediaColumnsCount;
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.mediaDidLoad);
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.messageReceivedByServer);
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.messagePlayingDidReset);
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        this.profileActivity.getNotificationCenter().addObserver(this, NotificationCenter.messagePlayingDidStart);
        for (int i6 = 0; i6 < 10; i6++) {
            if (this.initialTab == 4) {
                SharedAudioCell sharedAudioCell = new SharedAudioCell(context) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? SharedMediaLayout.this.sharedMediaData[4].messages : null, false);
                            return playMessage;
                        } else if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[4].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                        } else {
                            return false;
                        }
                    }
                };
                sharedAudioCell.initStreamingIcons();
                this.audioCellCache.add(sharedAudioCell);
            }
        }
        this.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.searching = false;
        this.searchWas = false;
        Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        this.pinnedHeaderShadowDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundGrayShadow"), PorterDuff.Mode.MULTIPLY));
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStripInner != null) {
            this.initialTab = scrollSlidingTextTabStripInner.getCurrentTabId();
        }
        this.scrollSlidingTextTabStrip = createScrollingTextTabStrip(context);
        for (int i7 = 1; i7 >= 0; i7--) {
            this.selectedFiles[i7].clear();
        }
        this.cantDeleteMessagesCount = 0;
        this.actionModeViews.clear();
        ActionBarMenu createMenu = this.actionBar.createMenu();
        createMenu.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            @Override
            public void onLayoutChange(View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
                if (SharedMediaLayout.this.searchItem != null) {
                    SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
                }
            }
        });
        ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                SharedMediaLayout.this.searching = true;
                SharedMediaLayout.this.onSearchStateChanged(true);
            }

            @Override
            public void onSearchCollapse() {
                SharedMediaLayout.this.searching = false;
                SharedMediaLayout.this.searchWas = false;
                SharedMediaLayout.this.documentsSearchAdapter.search(null, true);
                SharedMediaLayout.this.linksSearchAdapter.search(null, true);
                SharedMediaLayout.this.audioSearchAdapter.search(null, true);
                SharedMediaLayout.this.groupUsersSearchAdapter.search(null, true);
                SharedMediaLayout.this.onSearchStateChanged(false);
                if (SharedMediaLayout.this.ignoreSearchCollapse) {
                    SharedMediaLayout.this.ignoreSearchCollapse = false;
                } else {
                    SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                String obj = editText.getText().toString();
                if (obj.length() != 0) {
                    SharedMediaLayout.this.searchWas = true;
                } else {
                    SharedMediaLayout.this.searchWas = false;
                }
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                if (SharedMediaLayout.this.mediaPages[0].selectedType == 1) {
                    if (SharedMediaLayout.this.documentsSearchAdapter != null) {
                        SharedMediaLayout.this.documentsSearchAdapter.search(obj, true);
                    }
                } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 3) {
                    if (SharedMediaLayout.this.linksSearchAdapter != null) {
                        SharedMediaLayout.this.linksSearchAdapter.search(obj, true);
                    }
                } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 4) {
                    if (SharedMediaLayout.this.audioSearchAdapter != null) {
                        SharedMediaLayout.this.audioSearchAdapter.search(obj, true);
                    }
                } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 7 && SharedMediaLayout.this.groupUsersSearchAdapter != null) {
                    SharedMediaLayout.this.groupUsersSearchAdapter.search(obj, true);
                }
            }

            @Override
            public void onLayout(int i8, int i9, int i10, int i11) {
                SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setTranslationY(AndroidUtilities.dp(10.0f));
        this.searchItem.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        this.searchItem.setContentDescription(LocaleController.getString("Search", R.string.Search));
        this.searchItem.setVisibility(4);
        ImageView imageView = new ImageView(context);
        this.photoVideoOptionsItem = imageView;
        imageView.setTranslationY(AndroidUtilities.dp(10.0f));
        this.photoVideoOptionsItem.setVisibility(4);
        Drawable mutate = ContextCompat.getDrawable(context, R.drawable.ic_ab_other).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("windowBackgroundWhiteGrayText2"), PorterDuff.Mode.MULTIPLY));
        this.photoVideoOptionsItem.setImageDrawable(mutate);
        this.photoVideoOptionsItem.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.actionBar.addView(this.photoVideoOptionsItem, LayoutHelper.createFrame(48, 56, 85));
        this.photoVideoOptionsItem.setOnClickListener(new AnonymousClass5(context));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        searchField.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        searchField.setHintTextColor(Theme.getColor("player_time"));
        searchField.setCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.searchItemState = 0;
        BaseFragment baseFragment2 = this.profileActivity;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = null;
        if (baseFragment2 != null && (baseFragment2.getFragmentView() instanceof SizeNotifierFrameLayout)) {
            sizeNotifierFrameLayout = (SizeNotifierFrameLayout) this.profileActivity.getFragmentView();
        }
        BlurredLinearLayout blurredLinearLayout = new BlurredLinearLayout(context, sizeNotifierFrameLayout);
        this.actionModeLayout = blurredLinearLayout;
        blurredLinearLayout.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.actionModeLayout.setAlpha(0.0f);
        this.actionModeLayout.setClickable(true);
        this.actionModeLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context);
        this.closeButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView3 = this.closeButton;
        BackDrawable backDrawable = new BackDrawable(true);
        this.backDrawable = backDrawable;
        imageView3.setImageDrawable(backDrawable);
        this.backDrawable.setColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
        this.closeButton.setBackground(Theme.createSelectorDrawable(Theme.getColor("actionBarActionModeDefaultSelector"), 1));
        this.closeButton.setContentDescription(LocaleController.getString("Close", R.string.Close));
        this.actionModeLayout.addView(this.closeButton, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.actionModeViews.add(this.closeButton);
        this.closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SharedMediaLayout.this.lambda$new$2(view);
            }
        });
        NumberTextView numberTextView = new NumberTextView(context);
        this.selectedMessagesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedMessagesCountTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.selectedMessagesCountTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
        this.actionModeLayout.addView(this.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 18, 0, 0, 0));
        this.actionModeViews.add(this.selectedMessagesCountTextView);
        if (!DialogObject.isEncryptedDialog(this.dialog_id)) {
            ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, Theme.getColor("actionBarActionModeDefaultSelector"), Theme.getColor("windowBackgroundWhiteGrayText2"), false);
            this.gotoItem = actionBarMenuItem;
            actionBarMenuItem.setIcon(R.drawable.msg_message);
            this.gotoItem.setContentDescription(LocaleController.getString("AccDescrGoToMessage", R.string.AccDescrGoToMessage));
            this.gotoItem.setDuplicateParentStateEnabled(false);
            this.actionModeLayout.addView(this.gotoItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.actionModeViews.add(this.gotoItem);
            this.gotoItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SharedMediaLayout.this.lambda$new$3(view);
                }
            });
            ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context, (ActionBarMenu) null, Theme.getColor("actionBarActionModeDefaultSelector"), Theme.getColor("windowBackgroundWhiteGrayText2"), false);
            this.forwardItem = actionBarMenuItem2;
            actionBarMenuItem2.setIcon(R.drawable.msg_forward);
            this.forwardItem.setContentDescription(LocaleController.getString("Forward", R.string.Forward));
            this.forwardItem.setDuplicateParentStateEnabled(false);
            this.actionModeLayout.addView(this.forwardItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            this.actionModeViews.add(this.forwardItem);
            this.forwardItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SharedMediaLayout.this.lambda$new$4(view);
                }
            });
            updateForwardItem();
        }
        ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, (ActionBarMenu) null, Theme.getColor("actionBarActionModeDefaultSelector"), Theme.getColor("windowBackgroundWhiteGrayText2"), false);
        this.deleteItem = actionBarMenuItem3;
        actionBarMenuItem3.setIcon(R.drawable.msg_delete);
        this.deleteItem.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        this.deleteItem.setDuplicateParentStateEnabled(false);
        this.actionModeLayout.addView(this.deleteItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        this.actionModeViews.add(this.deleteItem);
        this.deleteItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                SharedMediaLayout.this.lambda$new$5(view);
            }
        });
        this.photoVideoAdapter = new SharedPhotoVideoAdapter(context) {
            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(0);
                if (mediaPage != null && mediaPage.animationSupportingListView.getVisibility() == 0) {
                    SharedMediaLayout.this.animationSupportingPhotoVideoAdapter.notifyDataSetChanged();
                }
            }
        };
        this.animationSupportingPhotoVideoAdapter = new SharedPhotoVideoAdapter(context);
        this.documentsAdapter = new SharedDocumentsAdapter(context, 1);
        this.voiceAdapter = new SharedDocumentsAdapter(context, 2);
        this.audioAdapter = new SharedDocumentsAdapter(context, 4);
        this.gifAdapter = new GifAdapter(context);
        this.documentsSearchAdapter = new MediaSearchAdapter(context, 1);
        this.audioSearchAdapter = new MediaSearchAdapter(context, 4);
        this.linksSearchAdapter = new MediaSearchAdapter(context, 3);
        this.groupUsersSearchAdapter = new GroupUsersSearchAdapter(context);
        this.commonGroupsAdapter = new CommonGroupsAdapter(context);
        ChatUsersAdapter chatUsersAdapter = new ChatUsersAdapter(context);
        this.chatUsersAdapter = chatUsersAdapter;
        chatUsersAdapter.sortedUsers = arrayList;
        this.chatUsersAdapter.chatInfo = !z ? null : tLRPC$ChatFull3;
        this.linksAdapter = new SharedLinksAdapter(context);
        setWillNotDraw(false);
        int i8 = 0;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i8 >= mediaPageArr.length) {
                break;
            }
            if (!(i8 != 0 || mediaPageArr[i8] == null || mediaPageArr[i8].layoutManager == null)) {
                i9 = this.mediaPages[i8].layoutManager.findFirstVisibleItemPosition();
                if (i9 == this.mediaPages[i8].layoutManager.getItemCount() - 1 || (holder = (RecyclerListView.Holder) this.mediaPages[i8].listView.findViewHolderForAdapterPosition(i9)) == null) {
                    i9 = -1;
                } else {
                    i10 = holder.itemView.getTop();
                }
            }
            final MediaPage mediaPage = new MediaPage(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (SharedMediaLayout.this.tabsAnimationInProgress) {
                        int i11 = 0;
                        if (SharedMediaLayout.this.mediaPages[0] == this) {
                            float abs = Math.abs(SharedMediaLayout.this.mediaPages[0].getTranslationX()) / SharedMediaLayout.this.mediaPages[0].getMeasuredWidth();
                            SharedMediaLayout.this.scrollSlidingTextTabStrip.selectTabWithId(SharedMediaLayout.this.mediaPages[1].selectedType, abs);
                            if (SharedMediaLayout.this.canShowSearchItem()) {
                                if (SharedMediaLayout.this.searchItemState == 2) {
                                    SharedMediaLayout.this.searchItem.setAlpha(1.0f - abs);
                                } else if (SharedMediaLayout.this.searchItemState == 1) {
                                    SharedMediaLayout.this.searchItem.setAlpha(abs);
                                }
                                float f2 = (SharedMediaLayout.this.mediaPages[1] == null || SharedMediaLayout.this.mediaPages[1].selectedType != 0) ? 0.0f : abs;
                                if (SharedMediaLayout.this.mediaPages[0].selectedType == 0) {
                                    f2 = 1.0f - abs;
                                }
                                SharedMediaLayout.this.photoVideoOptionsItem.setAlpha(f2);
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                ImageView imageView4 = sharedMediaLayout.photoVideoOptionsItem;
                                if (f2 == 0.0f || !sharedMediaLayout.canShowSearchItem()) {
                                    i11 = 4;
                                }
                                imageView4.setVisibility(i11);
                            } else {
                                SharedMediaLayout.this.searchItem.setAlpha(0.0f);
                            }
                        }
                    }
                    SharedMediaLayout.this.invalidateBlur();
                }
            };
            addView(mediaPage, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
            MediaPage[] mediaPageArr2 = this.mediaPages;
            mediaPageArr2[i8] = mediaPage;
            final ExtendedGridLayoutManager extendedGridLayoutManager = mediaPageArr2[i8].layoutManager = new ExtendedGridLayoutManager(context, 100) {
                private Size size = new Size();

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }

                @Override
                public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr2) {
                    super.calculateExtraLayoutSpace(state, iArr2);
                    if (mediaPage.selectedType == 0) {
                        iArr2[1] = Math.max(iArr2[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                    } else if (mediaPage.selectedType == 1) {
                        iArr2[1] = Math.max(iArr2[1], AndroidUtilities.dp(56.0f) * 2);
                    }
                }

                @Override
                protected Size getSizeForItem(int i11) {
                    int i12;
                    int i13;
                    TLRPC$Document document = (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter || SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? null : SharedMediaLayout.this.sharedMediaData[5].messages.get(i11).getDocument();
                    Size size = this.size;
                    size.height = 100.0f;
                    size.width = 100.0f;
                    if (document != null) {
                        TLRPC$PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (!(closestPhotoSizeWithSize == null || (i12 = closestPhotoSizeWithSize.w) == 0 || (i13 = closestPhotoSizeWithSize.h) == 0)) {
                            Size size2 = this.size;
                            size2.width = i12;
                            size2.height = i13;
                        }
                        ArrayList<TLRPC$DocumentAttribute> arrayList2 = document.attributes;
                        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                            TLRPC$DocumentAttribute tLRPC$DocumentAttribute = arrayList2.get(i14);
                            if ((tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeImageSize) || (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeVideo)) {
                                Size size3 = this.size;
                                size3.width = tLRPC$DocumentAttribute.w;
                                size3.height = tLRPC$DocumentAttribute.h;
                                break;
                            }
                        }
                    }
                    return this.size;
                }

                @Override
                public int getFlowItemCount() {
                    if (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                        return 0;
                    }
                    return getItemCount();
                }

                @Override
                public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfo = accessibilityNodeInfoCompat.getCollectionItemInfo();
                    if (collectionItemInfo != null && collectionItemInfo.isHeading()) {
                        accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(collectionItemInfo.getRowIndex(), collectionItemInfo.getRowSpan(), collectionItemInfo.getColumnIndex(), collectionItemInfo.getColumnSpan(), false));
                    }
                }
            };
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i11) {
                    if (mediaPage.listView.getAdapter() == SharedMediaLayout.this.photoVideoAdapter) {
                        if (SharedMediaLayout.this.photoVideoAdapter.getItemViewType(i11) == 2) {
                            return SharedMediaLayout.this.mediaColumnsCount;
                        }
                        return 1;
                    } else if (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                        return mediaPage.layoutManager.getSpanCount();
                    } else {
                        return (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter || !SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? mediaPage.layoutManager.getSpanSizeForItem(i11) : mediaPage.layoutManager.getSpanCount();
                    }
                }
            });
            this.mediaPages[i8].listView = new BlurredRecyclerView(context) {
                HashSet<SharedPhotoVideoCell2> excludeDrawViews = new HashSet<>();
                ArrayList<SharedPhotoVideoCell2> drawingViews = new ArrayList<>();
                ArrayList<SharedPhotoVideoCell2> drawingViews2 = new ArrayList<>();
                ArrayList<SharedPhotoVideoCell2> drawingViews3 = new ArrayList<>();

                @Override
                public void onLayout(boolean z2, int i11, int i12, int i13, int i14) {
                    super.onLayout(z2, i11, i12, i13, i14);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    MediaPage mediaPage2 = mediaPage;
                    sharedMediaLayout.checkLoadMoreScroll(mediaPage2, mediaPage2.listView, extendedGridLayoutManager);
                    if (mediaPage.selectedType == 0) {
                        PhotoViewer.getInstance().checkCurrentImageVisibility();
                    }
                }

                @Override
                public void dispatchDraw(android.graphics.Canvas r26) {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.AnonymousClass10.dispatchDraw(android.graphics.Canvas):void");
                }

                @Override
                public boolean drawChild(Canvas canvas, View view, long j2) {
                    if (getAdapter() != SharedMediaLayout.this.photoVideoAdapter || !SharedMediaLayout.this.photoVideoChangeColumnsAnimation || !(view instanceof SharedPhotoVideoCell2)) {
                        return super.drawChild(canvas, view, j2);
                    }
                    return true;
                }
            };
            this.mediaPages[i8].listView.setFastScrollEnabled(1);
            this.mediaPages[i8].listView.setScrollingTouchSlop(1);
            this.mediaPages[i8].listView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
            this.mediaPages[i8].listView.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
            this.mediaPages[i8].listView.setItemAnimator(null);
            this.mediaPages[i8].listView.setClipToPadding(false);
            this.mediaPages[i8].listView.setSectionsType(i3);
            this.mediaPages[i8].listView.setLayoutManager(extendedGridLayoutManager);
            MediaPage[] mediaPageArr3 = this.mediaPages;
            mediaPageArr3[i8].addView(mediaPageArr3[i8].listView, LayoutHelper.createFrame(-1, -1.0f));
            this.mediaPages[i8].animationSupportingListView = new BlurredRecyclerView(context);
            this.mediaPages[i8].animationSupportingListView.setLayoutManager(this.mediaPages[i8].animationSupportingLayoutManager = new GridLayoutManager(context, 3) {
                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }

                @Override
                public int scrollVerticallyBy(int i11, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                        i11 = 0;
                    }
                    return super.scrollVerticallyBy(i11, recycler, state);
                }
            });
            MediaPage[] mediaPageArr4 = this.mediaPages;
            mediaPageArr4[i8].addView(mediaPageArr4[i8].animationSupportingListView, LayoutHelper.createFrame(-1, -1.0f));
            this.mediaPages[i8].animationSupportingListView.setVisibility(8);
            this.mediaPages[i8].listView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    int i11 = 0;
                    if (mediaPage.listView.getAdapter() == SharedMediaLayout.this.gifAdapter) {
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        rect.left = 0;
                        rect.bottom = 0;
                        if (!mediaPage.layoutManager.isFirstRow(childAdapterPosition)) {
                            rect.top = AndroidUtilities.dp(2.0f);
                        } else {
                            rect.top = 0;
                        }
                        if (!mediaPage.layoutManager.isLastInRow(childAdapterPosition)) {
                            i11 = AndroidUtilities.dp(2.0f);
                        }
                        rect.right = i11;
                        return;
                    }
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            this.mediaPages[i8].listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i11) {
                    SharedMediaLayout.this.lambda$new$6(mediaPage, view, i11);
                }
            });
            this.mediaPages[i8].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                    SharedMediaLayout.this.scrolling = i11 != 0;
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                    SharedMediaLayout.this.checkLoadMoreScroll(mediaPage, (RecyclerListView) recyclerView, extendedGridLayoutManager);
                    if (i12 != 0 && ((SharedMediaLayout.this.mediaPages[0].selectedType == 0 || SharedMediaLayout.this.mediaPages[0].selectedType == 5) && !SharedMediaLayout.this.sharedMediaData[0].messages.isEmpty())) {
                        SharedMediaLayout.this.showFloatingDateView();
                    }
                    if (i12 != 0 && mediaPage.selectedType == 0) {
                        SharedMediaLayout.showFastScrollHint(mediaPage, SharedMediaLayout.this.sharedMediaData, true);
                    }
                    mediaPage.listView.checkSection(true);
                    MediaPage mediaPage2 = mediaPage;
                    if (mediaPage2.fastScrollHintView != null) {
                        mediaPage2.invalidate();
                    }
                    SharedMediaLayout.this.invalidateBlur();
                }
            });
            this.mediaPages[i8].listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
                @Override
                public final boolean onItemClick(View view, int i11) {
                    boolean lambda$new$7;
                    lambda$new$7 = SharedMediaLayout.this.lambda$new$7(mediaPage, view, i11);
                    return lambda$new$7;
                }
            });
            if (i8 == 0 && i9 != -1) {
                extendedGridLayoutManager.scrollToPositionWithOffset(i9, i10);
            }
            final BlurredRecyclerView blurredRecyclerView = this.mediaPages[i8].listView;
            this.mediaPages[i8].animatingImageView = new ClippingImageView(this, context) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    blurredRecyclerView.invalidate();
                }
            };
            this.mediaPages[i8].animatingImageView.setVisibility(8);
            this.mediaPages[i8].listView.addOverlayView(this.mediaPages[i8].animatingImageView, LayoutHelper.createFrame(-1, -1.0f));
            this.mediaPages[i8].progressView = new FlickerLoadingView(context) {
                @Override
                public int getColumnsCount() {
                    return SharedMediaLayout.this.mediaColumnsCount;
                }

                @Override
                public int getViewType() {
                    setIsSingleCell(false);
                    if (mediaPage.selectedType == 0 || mediaPage.selectedType == 5) {
                        return 2;
                    }
                    if (mediaPage.selectedType == 1) {
                        return 3;
                    }
                    if (mediaPage.selectedType == 2 || mediaPage.selectedType == 4) {
                        return 4;
                    }
                    if (mediaPage.selectedType == 3) {
                        return 5;
                    }
                    if (mediaPage.selectedType == 7) {
                        return 6;
                    }
                    if (mediaPage.selectedType == 6 && SharedMediaLayout.this.scrollSlidingTextTabStrip.getTabsCount() == 1) {
                        setIsSingleCell(true);
                    }
                    return 1;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    SharedMediaLayout.this.backgroundPaint.setColor(Theme.getColor("windowBackgroundWhite"));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), SharedMediaLayout.this.backgroundPaint);
                    super.onDraw(canvas);
                }
            };
            this.mediaPages[i8].progressView.showDate(false);
            if (i8 != 0) {
                this.mediaPages[i8].setVisibility(8);
            }
            MediaPage[] mediaPageArr5 = this.mediaPages;
            mediaPageArr5[i8].emptyView = new StickerEmptyView(context, mediaPageArr5[i8].progressView, 1);
            this.mediaPages[i8].emptyView.setVisibility(8);
            this.mediaPages[i8].emptyView.setAnimateLayoutChange(true);
            MediaPage[] mediaPageArr6 = this.mediaPages;
            mediaPageArr6[i8].addView(mediaPageArr6[i8].emptyView, LayoutHelper.createFrame(-1, -1.0f));
            this.mediaPages[i8].emptyView.setOnTouchListener(SharedMediaLayout$$ExternalSyntheticLambda4.INSTANCE);
            this.mediaPages[i8].emptyView.showProgress(true, false);
            this.mediaPages[i8].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
            this.mediaPages[i8].emptyView.subtitle.setText(LocaleController.getString("SearchEmptyViewFilteredSubtitle2", R.string.SearchEmptyViewFilteredSubtitle2));
            this.mediaPages[i8].emptyView.addView(this.mediaPages[i8].progressView, LayoutHelper.createFrame(-1, -1.0f));
            this.mediaPages[i8].listView.setEmptyView(this.mediaPages[i8].emptyView);
            this.mediaPages[i8].listView.setAnimateEmptyView(true, 0);
            MediaPage[] mediaPageArr7 = this.mediaPages;
            mediaPageArr7[i8].scrollHelper = new RecyclerAnimationScrollHelper(mediaPageArr7[i8].listView, this.mediaPages[i8].layoutManager);
            i8++;
            i3 = 2;
        }
        ChatActionCell chatActionCell = new ChatActionCell(context);
        this.floatingDateView = chatActionCell;
        chatActionCell.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
        this.floatingDateView.setAlpha(0.0f);
        this.floatingDateView.setOverrideColor("chat_mediaTimeBackground", "chat_mediaTimeText");
        this.floatingDateView.setTranslationY(-AndroidUtilities.dp(48.0f));
        addView(this.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        FragmentContextView fragmentContextView = new FragmentContextView(context, baseFragment, this, false, null);
        this.fragmentContextView = fragmentContextView;
        addView(fragmentContextView, LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, 48.0f, 0.0f, 0.0f));
        this.fragmentContextView.setDelegate(new FragmentContextView.FragmentContextViewDelegate() {
            @Override
            public final void onAnimation(boolean z2, boolean z3) {
                SharedMediaLayout.this.lambda$new$9(z2, z3);
            }
        });
        addView(this.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-1, 48, 51));
        addView(this.actionModeLayout, LayoutHelper.createFrame(-1, 48, 51));
        View view = new View(context);
        this.shadowLine = view;
        view.setBackgroundColor(Theme.getColor("divider"));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, 1);
        layoutParams.topMargin = AndroidUtilities.dp(48.0f) - 1;
        addView(this.shadowLine, layoutParams);
        updateTabs(false);
        switchToCurrentSelectedMode(false);
        if (this.hasMedia[0] >= 0) {
            loadFastScrollData(false);
        }
    }

    public class AnonymousClass5 implements View.OnClickListener {
        final Context val$context;

        AnonymousClass5(Context context) {
            this.val$context = context;
        }

        @Override
        public void onClick(View view) {
            final DividerCell dividerCell = new DividerCell(this.val$context);
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this, this.val$context) {
                @Override
                public void onMeasure(int i, int i2) {
                    if (dividerCell.getParent() != null) {
                        dividerCell.setVisibility(8);
                        super.onMeasure(i, i2);
                        dividerCell.getLayoutParams().width = getMeasuredWidth() - AndroidUtilities.dp(16.0f);
                        dividerCell.setVisibility(0);
                        super.onMeasure(i, i2);
                        return;
                    }
                    super.onMeasure(i, i2);
                }
            };
            boolean z = true;
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(this.val$context, true, false);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(this.val$context, false, false);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("MediaZoomIn", R.string.MediaZoomIn), R.drawable.msg_zoomin);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    SharedMediaLayout.AnonymousClass5.this.lambda$onClick$0(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("MediaZoomOut", R.string.MediaZoomOut), R.drawable.msg_zoomout);
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view2) {
                    if (!SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        int nextMediaColumnsCount = sharedMediaLayout.getNextMediaColumnsCount(sharedMediaLayout.mediaColumnsCount, false);
                        if (nextMediaColumnsCount == SharedMediaLayout.this.getNextMediaColumnsCount(nextMediaColumnsCount, false)) {
                            actionBarMenuSubItem2.setEnabled(false);
                            actionBarMenuSubItem2.animate().alpha(0.5f).start();
                        }
                        if (SharedMediaLayout.this.mediaColumnsCount != nextMediaColumnsCount) {
                            if (!actionBarMenuSubItem.isEnabled()) {
                                actionBarMenuSubItem.setEnabled(true);
                                actionBarMenuSubItem.animate().alpha(1.0f).start();
                            }
                            SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
                            SharedMediaLayout.this.animateToMediaColumnsCount(nextMediaColumnsCount);
                        }
                    }
                }
            });
            if (SharedMediaLayout.this.mediaColumnsCount == 2) {
                actionBarMenuSubItem.setEnabled(false);
                actionBarMenuSubItem.setAlpha(0.5f);
            } else if (SharedMediaLayout.this.mediaColumnsCount == 9) {
                actionBarMenuSubItem2.setEnabled(false);
                actionBarMenuSubItem2.setAlpha(0.5f);
            }
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem2);
            boolean z2 = (SharedMediaLayout.this.sharedMediaData[0].hasPhotos && SharedMediaLayout.this.sharedMediaData[0].hasVideos) || !SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1] || !SharedMediaLayout.this.sharedMediaData[0].startReached;
            if (!DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(this.val$context, false, false);
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("Calendar", R.string.Calendar), R.drawable.msg_calendar2);
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem3);
                actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view2) {
                        SharedMediaLayout.this.showMediaCalendar(false);
                        ActionBarPopupWindow actionBarPopupWindow = SharedMediaLayout.this.optionsWindow;
                        if (actionBarPopupWindow != null) {
                            actionBarPopupWindow.dismiss();
                        }
                    }
                });
                if (z2) {
                    actionBarPopupWindowLayout.addView(dividerCell);
                    final ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(this.val$context, true, false, false);
                    final ActionBarMenuSubItem actionBarMenuSubItem5 = new ActionBarMenuSubItem(this.val$context, true, false, true);
                    actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0);
                    actionBarMenuSubItem4.setChecked(SharedMediaLayout.this.sharedMediaData[0].filterType == 0 || SharedMediaLayout.this.sharedMediaData[0].filterType == 1);
                    actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view2) {
                            if (!SharedMediaLayout.this.changeTypeAnimation) {
                                if (actionBarMenuSubItem5.getCheckView().isChecked() || !actionBarMenuSubItem4.getCheckView().isChecked()) {
                                    ActionBarMenuSubItem actionBarMenuSubItem6 = actionBarMenuSubItem4;
                                    actionBarMenuSubItem6.setChecked(!actionBarMenuSubItem6.getCheckView().isChecked());
                                    if (!actionBarMenuSubItem4.getCheckView().isChecked() || !actionBarMenuSubItem5.getCheckView().isChecked()) {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 2;
                                    } else {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                    }
                                    SharedMediaLayout.this.changeMediaFilterType();
                                }
                            }
                        }
                    });
                    actionBarPopupWindowLayout.addView(actionBarMenuSubItem4);
                    actionBarMenuSubItem5.setTextAndIcon(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0);
                    if (!(SharedMediaLayout.this.sharedMediaData[0].filterType == 0 || SharedMediaLayout.this.sharedMediaData[0].filterType == 2)) {
                        z = false;
                    }
                    actionBarMenuSubItem5.setChecked(z);
                    actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view2) {
                            if (!SharedMediaLayout.this.changeTypeAnimation) {
                                if (actionBarMenuSubItem4.getCheckView().isChecked() || !actionBarMenuSubItem5.getCheckView().isChecked()) {
                                    ActionBarMenuSubItem actionBarMenuSubItem6 = actionBarMenuSubItem5;
                                    actionBarMenuSubItem6.setChecked(!actionBarMenuSubItem6.getCheckView().isChecked());
                                    if (!actionBarMenuSubItem4.getCheckView().isChecked() || !actionBarMenuSubItem5.getCheckView().isChecked()) {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 1;
                                    } else {
                                        SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                    }
                                    SharedMediaLayout.this.changeMediaFilterType();
                                }
                            }
                        }
                    });
                    actionBarPopupWindowLayout.addView(actionBarMenuSubItem5);
                }
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.optionsWindow = AlertsCreator.showPopupMenu(actionBarPopupWindowLayout, sharedMediaLayout.photoVideoOptionsItem, 0, -AndroidUtilities.dp(56.0f));
        }

        public void lambda$onClick$0(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
            if (!SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                int nextMediaColumnsCount = sharedMediaLayout.getNextMediaColumnsCount(sharedMediaLayout.mediaColumnsCount, true);
                if (nextMediaColumnsCount == SharedMediaLayout.this.getNextMediaColumnsCount(nextMediaColumnsCount, true)) {
                    actionBarMenuSubItem.setEnabled(false);
                    actionBarMenuSubItem.animate().alpha(0.5f).start();
                }
                if (SharedMediaLayout.this.mediaColumnsCount != nextMediaColumnsCount) {
                    if (!actionBarMenuSubItem2.isEnabled()) {
                        actionBarMenuSubItem2.setEnabled(true);
                        actionBarMenuSubItem2.animate().alpha(1.0f).start();
                    }
                    SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
                    SharedMediaLayout.this.animateToMediaColumnsCount(nextMediaColumnsCount);
                }
            }
        }
    }

    public void lambda$new$2(View view) {
        closeActionMode();
    }

    public void lambda$new$3(View view) {
        onActionBarItemClick(view, 102);
    }

    public void lambda$new$4(View view) {
        onActionBarItemClick(view, 100);
    }

    public void lambda$new$5(View view) {
        onActionBarItemClick(view, FileLoader.MEDIA_DIR_VIDEO_PUBLIC);
    }

    public void lambda$new$6(MediaPage mediaPage, View view, int i) {
        MessageObject messageObject;
        long j;
        if (mediaPage.selectedType == 7) {
            if (view instanceof UserCell) {
                onMemberClick(!this.chatUsersAdapter.sortedUsers.isEmpty() ? this.chatUsersAdapter.chatInfo.participants.participants.get(((Integer) this.chatUsersAdapter.sortedUsers.get(i)).intValue()) : this.chatUsersAdapter.chatInfo.participants.participants.get(i), false);
                return;
            }
            RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
            GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
            if (adapter == groupUsersSearchAdapter) {
                TLObject item = groupUsersSearchAdapter.getItem(i);
                if (item instanceof TLRPC$ChannelParticipant) {
                    j = MessageObject.getPeerId(((TLRPC$ChannelParticipant) item).peer);
                } else if (item instanceof TLRPC$ChatParticipant) {
                    j = ((TLRPC$ChatParticipant) item).user_id;
                } else {
                    return;
                }
                if (j != 0 && j != this.profileActivity.getUserConfig().getClientUserId()) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", j);
                    this.profileActivity.presentFragment(new ProfileActivity(bundle));
                }
            }
        } else if (mediaPage.selectedType == 6 && (view instanceof ProfileSearchCell)) {
            TLRPC$Chat chat = ((ProfileSearchCell) view).getChat();
            Bundle bundle2 = new Bundle();
            bundle2.putLong("chat_id", chat.id);
            if (this.profileActivity.getMessagesController().checkCanOpenChat(bundle2, this.profileActivity)) {
                this.profileActivity.presentFragment(new ChatActivity(bundle2));
            }
        } else if (mediaPage.selectedType == 1 && (view instanceof SharedDocumentCell)) {
            onItemClick(i, view, ((SharedDocumentCell) view).getMessage(), 0, mediaPage.selectedType);
        } else if (mediaPage.selectedType == 3 && (view instanceof SharedLinkCell)) {
            onItemClick(i, view, ((SharedLinkCell) view).getMessage(), 0, mediaPage.selectedType);
        } else if ((mediaPage.selectedType == 2 || mediaPage.selectedType == 4) && (view instanceof SharedAudioCell)) {
            onItemClick(i, view, ((SharedAudioCell) view).getMessage(), 0, mediaPage.selectedType);
        } else if (mediaPage.selectedType == 5 && (view instanceof ContextLinkCell)) {
            onItemClick(i, view, (MessageObject) ((ContextLinkCell) view).getParentObject(), 0, mediaPage.selectedType);
        } else if (mediaPage.selectedType == 0 && (view instanceof SharedPhotoVideoCell2) && (messageObject = ((SharedPhotoVideoCell2) view).getMessageObject()) != null) {
            onItemClick(i, view, messageObject, 0, mediaPage.selectedType);
        }
    }

    public boolean lambda$new$7(MediaPage mediaPage, View view, int i) {
        MessageObject messageObject;
        if (this.photoVideoChangeColumnsAnimation) {
            return false;
        }
        if (this.isActionModeShowed) {
            mediaPage.listView.getOnItemClickListener().onItemClick(view, i);
            return true;
        } else if (mediaPage.selectedType == 7 && (view instanceof UserCell)) {
            return onMemberClick(!this.chatUsersAdapter.sortedUsers.isEmpty() ? this.chatUsersAdapter.chatInfo.participants.participants.get(((Integer) this.chatUsersAdapter.sortedUsers.get(i)).intValue()) : this.chatUsersAdapter.chatInfo.participants.participants.get(i), true);
        } else if (mediaPage.selectedType == 1 && (view instanceof SharedDocumentCell)) {
            return onItemLongClick(((SharedDocumentCell) view).getMessage(), view, 0);
        } else {
            if (mediaPage.selectedType == 3 && (view instanceof SharedLinkCell)) {
                return onItemLongClick(((SharedLinkCell) view).getMessage(), view, 0);
            }
            if ((mediaPage.selectedType == 2 || mediaPage.selectedType == 4) && (view instanceof SharedAudioCell)) {
                return onItemLongClick(((SharedAudioCell) view).getMessage(), view, 0);
            }
            if (mediaPage.selectedType == 5 && (view instanceof ContextLinkCell)) {
                return onItemLongClick((MessageObject) ((ContextLinkCell) view).getParentObject(), view, 0);
            }
            if (mediaPage.selectedType != 0 || !(view instanceof SharedPhotoVideoCell2) || (messageObject = ((SharedPhotoVideoCell2) view).getMessageObject()) == null) {
                return false;
            }
            return onItemLongClick(messageObject, view, 0);
        }
    }

    public void lambda$new$9(boolean z, boolean z2) {
        if (!z) {
            requestLayout();
        }
    }

    public void setForwardRestrictedHint(HintView hintView) {
        this.fwdRestrictedHint = hintView;
    }

    public int getMessageId(View view) {
        if (view instanceof SharedPhotoVideoCell2) {
            return ((SharedPhotoVideoCell2) view).getMessageId();
        }
        if (view instanceof SharedDocumentCell) {
            return ((SharedDocumentCell) view).getMessage().getId();
        }
        if (view instanceof SharedAudioCell) {
            return ((SharedAudioCell) view).getMessage().getId();
        }
        return 0;
    }

    private void updateForwardItem() {
        if (this.forwardItem != null) {
            boolean z = this.profileActivity.getMessagesController().isChatNoForwards(-this.dialog_id) || hasNoforwardsMessage();
            this.forwardItem.setAlpha(z ? 0.5f : 1.0f);
            if (z && this.forwardItem.getBackground() != null) {
                this.forwardItem.setBackground(null);
            } else if (!z && this.forwardItem.getBackground() == null) {
                this.forwardItem.setBackground(Theme.createSelectorDrawable(Theme.getColor("actionBarActionModeDefaultSelector"), 5));
            }
        }
    }

    private boolean hasNoforwardsMessage() {
        MessageObject messageObject;
        TLRPC$Message tLRPC$Message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.selectedFiles[i].size(); i2++) {
                arrayList.add(Integer.valueOf(this.selectedFiles[i].keyAt(i2)));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                if (num.intValue() > 0 && (messageObject = this.selectedFiles[i].get(num.intValue())) != null && (tLRPC$Message = messageObject.messageOwner) != null && tLRPC$Message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                break;
            }
        }
        return z;
    }

    public void changeMediaFilterType() {
        final MediaPage mediaPage = getMediaPage(0);
        if (mediaPage != null && mediaPage.getMeasuredHeight() > 0 && mediaPage.getMeasuredWidth() > 0) {
            final Bitmap bitmap = null;
            try {
                bitmap = Bitmap.createBitmap(mediaPage.getMeasuredWidth(), mediaPage.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (bitmap != null) {
                this.changeTypeAnimation = true;
                mediaPage.listView.draw(new Canvas(bitmap));
                final View view = new View(mediaPage.getContext());
                view.setBackground(new BitmapDrawable(bitmap));
                mediaPage.addView(view);
                view.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SharedMediaLayout.this.changeTypeAnimation = false;
                        if (view.getParent() != null) {
                            mediaPage.removeView(view);
                            bitmap.recycle();
                        }
                    }
                }).start();
                mediaPage.listView.setAlpha(0.0f);
                mediaPage.listView.animate().alpha(1.0f).setDuration(200L).start();
            }
        }
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        ArrayList<MessageObject> arrayList = this.sharedMediaPreloader.getSharedMediaData()[0].messages;
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
        if (sharedMediaDataArr[0].filterType == 0) {
            sharedMediaDataArr[0].setTotalCount(lastMediaCount[0]);
        } else if (sharedMediaDataArr[0].filterType == 1) {
            sharedMediaDataArr[0].setTotalCount(lastMediaCount[6]);
        } else {
            sharedMediaDataArr[0].setTotalCount(lastMediaCount[7]);
        }
        this.sharedMediaData[0].fastScrollDataLoaded = false;
        jumpToDate(0, DialogObject.isEncryptedDialog(this.dialog_id) ? Integer.MIN_VALUE : ConnectionsManager.DEFAULT_DATACENTER_ID, 0, true);
        loadFastScrollData(false);
        this.delegate.updateSelectedMediaTabText();
        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(this.dialog_id);
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = arrayList.get(i);
            SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
            if (sharedMediaDataArr2[0].filterType == 0) {
                sharedMediaDataArr2[0].addMessage(messageObject, 0, false, isEncryptedDialog);
            } else if (sharedMediaDataArr2[0].filterType == 1) {
                if (messageObject.isPhoto()) {
                    this.sharedMediaData[0].addMessage(messageObject, 0, false, isEncryptedDialog);
                }
            } else if (!messageObject.isPhoto()) {
                this.sharedMediaData[0].addMessage(messageObject, 0, false, isEncryptedDialog);
            }
        }
    }

    public MediaPage getMediaPage(int i) {
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return null;
            }
            if (mediaPageArr[i2].selectedType == 0) {
                return this.mediaPages[i2];
            }
            i2++;
        }
    }

    public void showMediaCalendar(boolean z) {
        int i;
        MediaPage mediaPage;
        if (!z || getY() == 0.0f || this.viewType != 1) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", this.dialog_id);
            if (z && (mediaPage = getMediaPage(0)) != null) {
                ArrayList<Period> arrayList = this.sharedMediaData[0].fastScrollPeriods;
                Period period = null;
                int findFirstVisibleItemPosition = mediaPage.layoutManager.findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition >= 0) {
                    if (arrayList != null) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= arrayList.size()) {
                                break;
                            } else if (findFirstVisibleItemPosition <= arrayList.get(i2).startOffset) {
                                period = arrayList.get(i2);
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (period == null) {
                            period = arrayList.get(arrayList.size() - 1);
                        }
                    }
                    if (period != null) {
                        i = period.date;
                        bundle.putInt("type", 1);
                        CalendarActivity calendarActivity = new CalendarActivity(bundle, this.sharedMediaData[0].filterType, i);
                        calendarActivity.setCallback(new CalendarActivity.Callback() {
                            @Override
                            public void onDateSelected(int i3, int i4) {
                                int i5 = -1;
                                for (int i6 = 0; i6 < SharedMediaLayout.this.sharedMediaData[0].messages.size(); i6++) {
                                    if (SharedMediaLayout.this.sharedMediaData[0].messages.get(i6).getId() == i3) {
                                        i5 = i6;
                                    }
                                }
                                MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(0);
                                if (i5 < 0 || mediaPage2 == null) {
                                    SharedMediaLayout.this.jumpToDate(0, i3, i4, true);
                                } else {
                                    mediaPage2.layoutManager.scrollToPositionWithOffset(i5, 0);
                                }
                                if (mediaPage2 != null) {
                                    mediaPage2.highlightMessageId = i3;
                                    mediaPage2.highlightAnimation = false;
                                }
                            }
                        });
                        this.profileActivity.presentFragment(calendarActivity);
                    }
                }
            }
            i = 0;
            bundle.putInt("type", 1);
            CalendarActivity calendarActivity2 = new CalendarActivity(bundle, this.sharedMediaData[0].filterType, i);
            calendarActivity2.setCallback(new CalendarActivity.Callback() {
                @Override
                public void onDateSelected(int i3, int i4) {
                    int i5 = -1;
                    for (int i6 = 0; i6 < SharedMediaLayout.this.sharedMediaData[0].messages.size(); i6++) {
                        if (SharedMediaLayout.this.sharedMediaData[0].messages.get(i6).getId() == i3) {
                            i5 = i6;
                        }
                    }
                    MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(0);
                    if (i5 < 0 || mediaPage2 == null) {
                        SharedMediaLayout.this.jumpToDate(0, i3, i4, true);
                    } else {
                        mediaPage2.layoutManager.scrollToPositionWithOffset(i5, 0);
                    }
                    if (mediaPage2 != null) {
                        mediaPage2.highlightMessageId = i3;
                        mediaPage2.highlightAnimation = false;
                    }
                }
            });
            this.profileActivity.presentFragment(calendarActivity2);
        }
    }

    private void startPinchToMediaColumnsCount(boolean z) {
        if (!this.photoVideoChangeColumnsAnimation) {
            MediaPage mediaPage = null;
            int i = 0;
            int i2 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i2 >= mediaPageArr.length) {
                    break;
                } else if (mediaPageArr[i2].selectedType == 0) {
                    mediaPage = this.mediaPages[i2];
                    break;
                } else {
                    i2++;
                }
            }
            if (mediaPage != null) {
                int nextMediaColumnsCount = getNextMediaColumnsCount(this.mediaColumnsCount, z);
                this.animateToColumnsCount = nextMediaColumnsCount;
                if (nextMediaColumnsCount != this.mediaColumnsCount) {
                    mediaPage.animationSupportingListView.setVisibility(0);
                    mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
                    mediaPage.animationSupportingLayoutManager.setSpanCount(nextMediaColumnsCount);
                    AndroidUtilities.updateVisibleRows(mediaPage.listView);
                    this.photoVideoChangeColumnsAnimation = true;
                    this.sharedMediaData[0].setListFrozen(true);
                    this.photoVideoChangeColumnsProgress = 0.0f;
                    if (this.pinchCenterPosition >= 0) {
                        while (true) {
                            MediaPage[] mediaPageArr2 = this.mediaPages;
                            if (i < mediaPageArr2.length) {
                                if (mediaPageArr2[i].selectedType == 0) {
                                    this.mediaPages[i].animationSupportingLayoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, this.pinchCenterOffset - this.mediaPages[i].animationSupportingListView.getPaddingTop());
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    } else {
                        saveScrollPosition();
                    }
                }
            }
        }
    }

    private void finishPinchToMediaColumnsCount() {
        if (this.photoVideoChangeColumnsAnimation) {
            final MediaPage mediaPage = null;
            int i = 0;
            int i2 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i2 >= mediaPageArr.length) {
                    break;
                } else if (mediaPageArr[i2].selectedType == 0) {
                    mediaPage = this.mediaPages[i2];
                    break;
                } else {
                    i2++;
                }
            }
            if (mediaPage != null) {
                float f = this.photoVideoChangeColumnsProgress;
                float f2 = 1.0f;
                if (f == 1.0f) {
                    int itemCount = this.photoVideoAdapter.getItemCount();
                    this.photoVideoChangeColumnsAnimation = false;
                    this.sharedMediaData[0].setListFrozen(false);
                    mediaPage.animationSupportingListView.setVisibility(8);
                    int i3 = this.animateToColumnsCount;
                    this.mediaColumnsCount = i3;
                    SharedConfig.setMediaColumnsCount(i3);
                    mediaPage.layoutManager.setSpanCount(this.mediaColumnsCount);
                    mediaPage.listView.invalidate();
                    if (this.photoVideoAdapter.getItemCount() == itemCount) {
                        AndroidUtilities.updateVisibleRows(mediaPage.listView);
                    } else {
                        this.photoVideoAdapter.notifyDataSetChanged();
                    }
                    if (this.pinchCenterPosition >= 0) {
                        while (true) {
                            MediaPage[] mediaPageArr2 = this.mediaPages;
                            if (i < mediaPageArr2.length) {
                                if (mediaPageArr2[i].selectedType == 0) {
                                    View findViewByPosition = this.mediaPages[i].animationSupportingLayoutManager.findViewByPosition(this.pinchCenterPosition);
                                    if (findViewByPosition != null) {
                                        this.pinchCenterOffset = findViewByPosition.getTop();
                                    }
                                    this.mediaPages[i].layoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, (-this.mediaPages[i].listView.getPaddingTop()) + this.pinchCenterOffset);
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    } else {
                        saveScrollPosition();
                    }
                } else if (f == 0.0f) {
                    this.photoVideoChangeColumnsAnimation = false;
                    this.sharedMediaData[0].setListFrozen(false);
                    mediaPage.animationSupportingListView.setVisibility(8);
                    mediaPage.listView.invalidate();
                } else {
                    final boolean z = f > 0.2f;
                    float[] fArr = new float[2];
                    fArr[0] = f;
                    if (!z) {
                        f2 = 0.0f;
                    }
                    fArr[1] = f2;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            mediaPage.listView.invalidate();
                        }
                    });
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            View findViewByPosition2;
                            int itemCount2 = SharedMediaLayout.this.photoVideoAdapter.getItemCount();
                            SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                            SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                            if (z) {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.mediaColumnsCount = sharedMediaLayout.animateToColumnsCount;
                                SharedConfig.setMediaColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                                mediaPage.layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount);
                            }
                            if (z) {
                                if (SharedMediaLayout.this.photoVideoAdapter.getItemCount() == itemCount2) {
                                    AndroidUtilities.updateVisibleRows(mediaPage.listView);
                                } else {
                                    SharedMediaLayout.this.photoVideoAdapter.notifyDataSetChanged();
                                }
                            }
                            mediaPage.animationSupportingListView.setVisibility(8);
                            SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                            if (sharedMediaLayout2.pinchCenterPosition >= 0) {
                                for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                                    if (SharedMediaLayout.this.mediaPages[i4].selectedType == 0) {
                                        if (z && (findViewByPosition2 = SharedMediaLayout.this.mediaPages[i4].animationSupportingLayoutManager.findViewByPosition(SharedMediaLayout.this.pinchCenterPosition)) != null) {
                                            SharedMediaLayout.this.pinchCenterOffset = findViewByPosition2.getTop();
                                        }
                                        ExtendedGridLayoutManager extendedGridLayoutManager = SharedMediaLayout.this.mediaPages[i4].layoutManager;
                                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                        extendedGridLayoutManager.scrollToPositionWithOffset(sharedMediaLayout3.pinchCenterPosition, (-sharedMediaLayout3.mediaPages[i4].listView.getPaddingTop()) + SharedMediaLayout.this.pinchCenterOffset);
                                    }
                                }
                            } else {
                                sharedMediaLayout2.saveScrollPosition();
                            }
                            super.onAnimationEnd(animator);
                        }
                    });
                    ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public void animateToMediaColumnsCount(final int i) {
        final MediaPage mediaPage = getMediaPage(0);
        this.pinchCenterPosition = -1;
        if (mediaPage != null) {
            mediaPage.listView.stopScroll();
            this.animateToColumnsCount = i;
            mediaPage.animationSupportingListView.setVisibility(0);
            mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
            mediaPage.animationSupportingLayoutManager.setSpanCount(i);
            AndroidUtilities.updateVisibleRows(mediaPage.listView);
            this.photoVideoChangeColumnsAnimation = true;
            this.sharedMediaData[0].setListFrozen(true);
            this.photoVideoChangeColumnsProgress = 0.0f;
            saveScrollPosition();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.animationIndex = NotificationCenter.getInstance(this.profileActivity.getCurrentAccount()).setAnimationInProgress(this.animationIndex, null);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            ofFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    NotificationCenter.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).onAnimationFinish(SharedMediaLayout.this.animationIndex);
                    int itemCount = SharedMediaLayout.this.photoVideoAdapter.getItemCount();
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                    SharedMediaLayout.this.mediaColumnsCount = i;
                    mediaPage.layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount);
                    if (SharedMediaLayout.this.photoVideoAdapter.getItemCount() == itemCount) {
                        AndroidUtilities.updateVisibleRows(mediaPage.listView);
                    } else {
                        SharedMediaLayout.this.photoVideoAdapter.notifyDataSetChanged();
                    }
                    mediaPage.animationSupportingListView.setVisibility(8);
                    SharedMediaLayout.this.saveScrollPosition();
                }
            });
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        if (this.scrollSlidingTextTabStrip != null) {
            canvas.save();
            canvas.translate(this.scrollSlidingTextTabStrip.getX(), this.scrollSlidingTextTabStrip.getY());
            this.scrollSlidingTextTabStrip.drawBackground(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null && fragmentContextView.isCallStyle()) {
            canvas.save();
            canvas.translate(this.fragmentContextView.getX(), this.fragmentContextView.getY());
            this.fragmentContextView.setDrawOverlay(true);
            this.fragmentContextView.draw(canvas);
            this.fragmentContextView.setDrawOverlay(false);
            canvas.restore();
        }
    }

    private ScrollSlidingTextTabStripInner createScrollingTextTabStrip(Context context) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = new ScrollSlidingTextTabStripInner(context);
        int i = this.initialTab;
        if (i != -1) {
            scrollSlidingTextTabStripInner.setInitialTabId(i);
            this.initialTab = -1;
        }
        scrollSlidingTextTabStripInner.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        scrollSlidingTextTabStripInner.setColors("profile_tabSelectedLine", "profile_tabSelectedText", "profile_tabText", "profile_tabSelector");
        scrollSlidingTextTabStripInner.setDelegate(new ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate() {
            @Override
            public void onPageSelected(int i2, boolean z) {
                if (SharedMediaLayout.this.mediaPages[0].selectedType != i2) {
                    SharedMediaLayout.this.mediaPages[1].selectedType = i2;
                    SharedMediaLayout.this.mediaPages[1].setVisibility(0);
                    SharedMediaLayout.this.hideFloatingDateView(true);
                    SharedMediaLayout.this.switchToCurrentSelectedMode(true);
                    SharedMediaLayout.this.animatingForward = z;
                    SharedMediaLayout.this.onSelectedTabChanged();
                }
            }

            @Override
            public void onSamePageSelected() {
                SharedMediaLayout.this.scrollToTop();
            }

            @Override
            public void onPageScrolled(float f) {
                if (f != 1.0f || SharedMediaLayout.this.mediaPages[1].getVisibility() == 0) {
                    if (SharedMediaLayout.this.animatingForward) {
                        SharedMediaLayout.this.mediaPages[0].setTranslationX((-f) * SharedMediaLayout.this.mediaPages[0].getMeasuredWidth());
                        SharedMediaLayout.this.mediaPages[1].setTranslationX(SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() - (SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f));
                    } else {
                        SharedMediaLayout.this.mediaPages[0].setTranslationX(SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f);
                        SharedMediaLayout.this.mediaPages[1].setTranslationX((SharedMediaLayout.this.mediaPages[0].getMeasuredWidth() * f) - SharedMediaLayout.this.mediaPages[0].getMeasuredWidth());
                    }
                    float f2 = SharedMediaLayout.this.mediaPages[0].selectedType == 0 ? 1.0f - f : 0.0f;
                    if (SharedMediaLayout.this.mediaPages[1].selectedType == 0) {
                        f2 = f;
                    }
                    SharedMediaLayout.this.photoVideoOptionsItem.setAlpha(f2);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    sharedMediaLayout.photoVideoOptionsItem.setVisibility((f2 == 0.0f || !sharedMediaLayout.canShowSearchItem()) ? 4 : 0);
                    if (!SharedMediaLayout.this.canShowSearchItem()) {
                        SharedMediaLayout.this.searchItem.setVisibility(4);
                        SharedMediaLayout.this.searchItem.setAlpha(0.0f);
                    } else if (SharedMediaLayout.this.searchItemState == 1) {
                        SharedMediaLayout.this.searchItem.setAlpha(f);
                    } else if (SharedMediaLayout.this.searchItemState == 2) {
                        SharedMediaLayout.this.searchItem.setAlpha(1.0f - f);
                    }
                    if (f == 1.0f) {
                        MediaPage mediaPage = SharedMediaLayout.this.mediaPages[0];
                        SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                        SharedMediaLayout.this.mediaPages[1] = mediaPage;
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItemState == 2) {
                            SharedMediaLayout.this.searchItem.setVisibility(4);
                        }
                        SharedMediaLayout.this.searchItemState = 0;
                        SharedMediaLayout.this.startStopVisibleGifs();
                    }
                }
            }
        });
        return scrollSlidingTextTabStripInner;
    }

    protected void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    private boolean fillMediaData(int i) {
        SharedMediaData[] sharedMediaData = this.sharedMediaPreloader.getSharedMediaData();
        if (sharedMediaData == null) {
            return false;
        }
        if (i == 0) {
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (!sharedMediaDataArr[i].fastScrollDataLoaded) {
                sharedMediaDataArr[i].totalCount = sharedMediaData[i].totalCount;
            }
        } else {
            this.sharedMediaData[i].totalCount = sharedMediaData[i].totalCount;
        }
        this.sharedMediaData[i].messages.addAll(sharedMediaData[i].messages);
        this.sharedMediaData[i].sections.addAll(sharedMediaData[i].sections);
        for (Map.Entry<String, ArrayList<MessageObject>> entry : sharedMediaData[i].sectionArrays.entrySet()) {
            this.sharedMediaData[i].sectionArrays.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.sharedMediaData[i].messagesDict[i2] = sharedMediaData[i].messagesDict[i2].clone();
            SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
            sharedMediaDataArr2[i].max_id[i2] = sharedMediaData[i].max_id[i2];
            sharedMediaDataArr2[i].endReached[i2] = sharedMediaData[i].endReached[i2];
        }
        this.sharedMediaData[i].fastScrollPeriods.addAll(sharedMediaData[i].fastScrollPeriods);
        return !sharedMediaData[i].messages.isEmpty();
    }

    public void hideFloatingDateView(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        if (this.floatingDateView.getTag() != null) {
            this.floatingDateView.setTag(null);
            AnimatorSet animatorSet = this.floatingDateAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.floatingDateAnimation = null;
            }
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.floatingDateAnimation = animatorSet2;
                animatorSet2.setDuration(180L);
                this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingDateView, View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.additionalFloatingTranslation));
                this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SharedMediaLayout.this.floatingDateAnimation = null;
                    }
                });
                this.floatingDateAnimation.start();
                return;
            }
            this.floatingDateView.setAlpha(0.0f);
        }
    }

    public void scrollToTop() {
        int i;
        int i2 = this.mediaPages[0].selectedType;
        if (i2 != 0) {
            if (!(i2 == 1 || i2 == 2)) {
                if (i2 == 3) {
                    i = AndroidUtilities.dp(100.0f);
                } else if (i2 != 4) {
                    if (i2 != 5) {
                        i = AndroidUtilities.dp(58.0f);
                    } else {
                        i = AndroidUtilities.dp(60.0f);
                    }
                }
            }
            i = AndroidUtilities.dp(56.0f);
        } else {
            i = SharedPhotoVideoCell.getItemSize(1);
        }
        if ((this.mediaPages[0].selectedType == 0 ? this.mediaPages[0].layoutManager.findFirstVisibleItemPosition() / this.mediaColumnsCount : this.mediaPages[0].layoutManager.findFirstVisibleItemPosition()) * i >= this.mediaPages[0].listView.getMeasuredHeight() * 1.2f) {
            this.mediaPages[0].scrollHelper.setScrollDirection(1);
            this.mediaPages[0].scrollHelper.scrollToPosition(0, 0, false, true);
            return;
        }
        this.mediaPages[0].listView.smoothScrollToPosition(0);
    }

    public void checkLoadMoreScroll(MediaPage mediaPage, final RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        int i;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        int i2;
        int i3;
        if (!this.photoVideoChangeColumnsAnimation && this.jumpToRunnable == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (recyclerListView.getFastScroll() == null || !recyclerListView.getFastScroll().isPressed() || currentTimeMillis - mediaPage.lastCheckScrollTime >= 300) {
                mediaPage.lastCheckScrollTime = currentTimeMillis;
                if ((!this.searching || !this.searchWas) && mediaPage.selectedType != 7) {
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int abs = findFirstVisibleItemPosition == -1 ? 0 : Math.abs(linearLayoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
                    int itemCount = recyclerListView.getAdapter().getItemCount();
                    if (mediaPage.selectedType == 0 || mediaPage.selectedType == 1 || mediaPage.selectedType == 2 || mediaPage.selectedType == 4) {
                        final int i4 = mediaPage.selectedType;
                        int startOffset = this.sharedMediaData[i4].getStartOffset() + this.sharedMediaData[i4].messages.size();
                        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                        if (sharedMediaDataArr[i4].fastScrollDataLoaded && sharedMediaDataArr[i4].fastScrollPeriods.size() > 2 && mediaPage.selectedType == 0 && this.sharedMediaData[i4].messages.size() != 0) {
                            float f = i4 == 0 ? this.mediaColumnsCount : 1;
                            int measuredHeight = (int) ((recyclerListView.getMeasuredHeight() / (recyclerListView.getMeasuredWidth() / f)) * f * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < this.sharedMediaData[i4].fastScrollPeriods.get(1).startOffset) {
                                measuredHeight = this.sharedMediaData[i4].fastScrollPeriods.get(1).startOffset;
                            }
                            if ((findFirstVisibleItemPosition > startOffset && findFirstVisibleItemPosition - startOffset > measuredHeight) || ((i3 = findFirstVisibleItemPosition + abs) < this.sharedMediaData[i4].startOffset && this.sharedMediaData[0].startOffset - i3 > measuredHeight)) {
                                Runnable sharedMediaLayout$$ExternalSyntheticLambda9 = new Runnable() {
                                    @Override
                                    public final void run() {
                                        SharedMediaLayout.this.lambda$checkLoadMoreScroll$10(i4, recyclerListView);
                                    }
                                };
                                this.jumpToRunnable = sharedMediaLayout$$ExternalSyntheticLambda9;
                                AndroidUtilities.runOnUIThread(sharedMediaLayout$$ExternalSyntheticLambda9);
                                return;
                            }
                        }
                        itemCount = startOffset;
                    }
                    if (mediaPage.selectedType != 7) {
                        if (mediaPage.selectedType != 6) {
                            if (mediaPage.selectedType == 0) {
                                i = 3;
                            } else {
                                i = mediaPage.selectedType == 5 ? 10 : 6;
                            }
                            if ((abs + findFirstVisibleItemPosition > itemCount - i || this.sharedMediaData[mediaPage.selectedType].loadingAfterFastScroll) && !this.sharedMediaData[mediaPage.selectedType].loading) {
                                if (mediaPage.selectedType == 0) {
                                    SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                                    if (sharedMediaDataArr2[0].filterType == 1) {
                                        i2 = 6;
                                    } else {
                                        i2 = sharedMediaDataArr2[0].filterType == 2 ? 7 : 0;
                                    }
                                } else if (mediaPage.selectedType == 1) {
                                    i2 = 1;
                                } else if (mediaPage.selectedType == 2) {
                                    i2 = 2;
                                } else if (mediaPage.selectedType == 4) {
                                    i2 = 4;
                                } else {
                                    i2 = mediaPage.selectedType == 5 ? 5 : 3;
                                }
                                if (!this.sharedMediaData[mediaPage.selectedType].endReached[0]) {
                                    this.sharedMediaData[mediaPage.selectedType].loading = true;
                                    this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, this.sharedMediaData[mediaPage.selectedType].max_id[0], 0, i2, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[mediaPage.selectedType].requestIndex);
                                } else if (this.mergeDialogId != 0 && !this.sharedMediaData[mediaPage.selectedType].endReached[1]) {
                                    this.sharedMediaData[mediaPage.selectedType].loading = true;
                                    this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[mediaPage.selectedType].max_id[1], 0, i2, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[mediaPage.selectedType].requestIndex);
                                }
                            }
                            int i5 = this.sharedMediaData[mediaPage.selectedType].startOffset;
                            if (mediaPage.selectedType == 0) {
                                i5 = this.photoVideoAdapter.getPositionForIndex(0);
                            }
                            if (findFirstVisibleItemPosition - i5 < i + 1 && !this.sharedMediaData[mediaPage.selectedType].loading && !this.sharedMediaData[mediaPage.selectedType].startReached && !this.sharedMediaData[mediaPage.selectedType].loadingAfterFastScroll) {
                                loadFromStart(mediaPage.selectedType);
                            }
                            if (this.mediaPages[0].listView != recyclerListView) {
                                return;
                            }
                            if ((this.mediaPages[0].selectedType == 0 || this.mediaPages[0].selectedType == 5) && findFirstVisibleItemPosition != -1 && (findViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null && findViewHolderForAdapterPosition.getItemViewType() == 0) {
                                View view = findViewHolderForAdapterPosition.itemView;
                                if (view instanceof SharedPhotoVideoCell) {
                                    MessageObject messageObject = ((SharedPhotoVideoCell) view).getMessageObject(0);
                                    if (messageObject != null) {
                                        this.floatingDateView.setCustomDate(messageObject.messageOwner.date, false, true);
                                    }
                                } else if (view instanceof ContextLinkCell) {
                                    this.floatingDateView.setCustomDate(((ContextLinkCell) view).getDate(), false, true);
                                }
                            }
                        } else if (abs > 0 && !this.commonGroupsAdapter.endReached && !this.commonGroupsAdapter.loading && !this.commonGroupsAdapter.chats.isEmpty() && findFirstVisibleItemPosition + abs >= itemCount - 5) {
                            CommonGroupsAdapter commonGroupsAdapter = this.commonGroupsAdapter;
                            commonGroupsAdapter.getChats(((TLRPC$Chat) commonGroupsAdapter.chats.get(this.commonGroupsAdapter.chats.size() - 1)).id, 100);
                        }
                    }
                }
            }
        }
    }

    public void lambda$checkLoadMoreScroll$10(int i, RecyclerListView recyclerListView) {
        findPeriodAndJumpToDate(i, recyclerListView, false);
        this.jumpToRunnable = null;
    }

    private void loadFromStart(int i) {
        int i2;
        if (i == 0) {
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (sharedMediaDataArr[0].filterType == 1) {
                i2 = 6;
            } else {
                i2 = sharedMediaDataArr[0].filterType == 2 ? 7 : 0;
            }
        } else {
            i2 = i == 1 ? 1 : i == 2 ? 2 : i == 4 ? 4 : i == 5 ? 5 : 3;
        }
        this.sharedMediaData[i].loading = true;
        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, this.sharedMediaData[i].min_id, i2, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i].requestIndex);
    }

    public ActionBarMenuItem getSearchItem() {
        return this.searchItem;
    }

    public boolean isSearchItemVisible() {
        if (this.mediaPages[0].selectedType == 7) {
            return this.delegate.canSearchMembers();
        }
        return (this.mediaPages[0].selectedType == 0 || this.mediaPages[0].selectedType == 2 || this.mediaPages[0].selectedType == 5 || this.mediaPages[0].selectedType == 6) ? false : true;
    }

    public boolean isCalendarItemVisible() {
        return this.mediaPages[0].selectedType == 0;
    }

    public int getSelectedTab() {
        return this.scrollSlidingTextTabStrip.getCurrentTabId();
    }

    public int getClosestTab() {
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr[1] == null || mediaPageArr[1].getVisibility() != 0 || ((!this.tabsAnimationInProgress || this.backAnimation) && Math.abs(this.mediaPages[1].getTranslationX()) >= this.mediaPages[1].getMeasuredWidth() / 2.0f)) {
            return this.scrollSlidingTextTabStrip.getCurrentTabId();
        }
        return this.mediaPages[1].selectedType;
    }

    public void onDestroy() {
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.mediaDidLoad);
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.messageReceivedByServer);
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.messagePlayingDidReset);
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        this.profileActivity.getNotificationCenter().removeObserver(this, NotificationCenter.messagePlayingDidStart);
    }

    private void checkCurrentTabValid() {
        if (!this.scrollSlidingTextTabStrip.hasTab(this.scrollSlidingTextTabStrip.getCurrentTabId())) {
            int firstTabId = this.scrollSlidingTextTabStrip.getFirstTabId();
            this.scrollSlidingTextTabStrip.setInitialTabId(firstTabId);
            this.mediaPages[0].selectedType = firstTabId;
            switchToCurrentSelectedMode(false);
        }
    }

    public void setNewMediaCounts(int[] iArr) {
        boolean z;
        int i = 0;
        while (true) {
            if (i >= 6) {
                z = false;
                break;
            } else if (this.hasMedia[i] >= 0) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        System.arraycopy(iArr, 0, this.hasMedia, 0, 6);
        updateTabs(true);
        if (!z && this.scrollSlidingTextTabStrip.getCurrentTabId() == 6) {
            this.scrollSlidingTextTabStrip.resetTab();
        }
        checkCurrentTabValid();
        if (this.hasMedia[0] >= 0) {
            loadFastScrollData(false);
        }
    }

    private void loadFastScrollData(boolean z) {
        int i = 0;
        while (true) {
            int[] iArr = supportedFastScrollTypes;
            if (i < iArr.length) {
                final int i2 = iArr[i];
                if ((!this.sharedMediaData[i2].fastScrollDataLoaded || z) && !DialogObject.isEncryptedDialog(this.dialog_id)) {
                    this.sharedMediaData[i2].fastScrollDataLoaded = false;
                    TLRPC$TL_messages_getSearchResultsPositions tLRPC$TL_messages_getSearchResultsPositions = new TLRPC$TL_messages_getSearchResultsPositions();
                    if (i2 == 0) {
                        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                        if (sharedMediaDataArr[i2].filterType == 1) {
                            tLRPC$TL_messages_getSearchResultsPositions.filter = new TLRPC$TL_inputMessagesFilterPhotos();
                        } else if (sharedMediaDataArr[i2].filterType == 2) {
                            tLRPC$TL_messages_getSearchResultsPositions.filter = new TLRPC$TL_inputMessagesFilterVideo();
                        } else {
                            tLRPC$TL_messages_getSearchResultsPositions.filter = new TLRPC$TL_inputMessagesFilterPhotoVideo();
                        }
                    } else if (i2 == 1) {
                        tLRPC$TL_messages_getSearchResultsPositions.filter = new TLRPC$TL_inputMessagesFilterDocument();
                    } else if (i2 == 2) {
                        tLRPC$TL_messages_getSearchResultsPositions.filter = new TLRPC$TL_inputMessagesFilterRoundVoice();
                    } else {
                        tLRPC$TL_messages_getSearchResultsPositions.filter = new TLRPC$TL_inputMessagesFilterMusic();
                    }
                    tLRPC$TL_messages_getSearchResultsPositions.limit = 100;
                    tLRPC$TL_messages_getSearchResultsPositions.peer = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getInputPeer(this.dialog_id);
                    final int i3 = this.sharedMediaData[i2].requestIndex;
                    ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).sendRequest(tLRPC$TL_messages_getSearchResultsPositions, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            SharedMediaLayout.this.lambda$loadFastScrollData$13(i3, i2, tLObject, tLRPC$TL_error);
                        }
                    }), this.profileActivity.getClassGuid());
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void lambda$loadFastScrollData$13(final int i, final int i2, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SharedMediaLayout.this.lambda$loadFastScrollData$12(tLRPC$TL_error, i, i2, tLObject);
            }
        });
    }

    public void lambda$loadFastScrollData$12(TLRPC$TL_error tLRPC$TL_error, int i, int i2, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (i == sharedMediaDataArr[i2].requestIndex) {
                TLRPC$TL_messages_searchResultsPositions tLRPC$TL_messages_searchResultsPositions = (TLRPC$TL_messages_searchResultsPositions) tLObject;
                sharedMediaDataArr[i2].fastScrollPeriods.clear();
                int size = tLRPC$TL_messages_searchResultsPositions.positions.size();
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC$TL_searchResultPosition tLRPC$TL_searchResultPosition = tLRPC$TL_messages_searchResultsPositions.positions.get(i4);
                    if (tLRPC$TL_searchResultPosition.date != 0) {
                        this.sharedMediaData[i2].fastScrollPeriods.add(new Period(tLRPC$TL_searchResultPosition));
                    }
                }
                Collections.sort(this.sharedMediaData[i2].fastScrollPeriods, SharedMediaLayout$$ExternalSyntheticLambda11.INSTANCE);
                this.sharedMediaData[i2].setTotalCount(tLRPC$TL_messages_searchResultsPositions.count);
                SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                sharedMediaDataArr2[i2].fastScrollDataLoaded = true;
                if (!sharedMediaDataArr2[i2].fastScrollPeriods.isEmpty()) {
                    while (true) {
                        MediaPage[] mediaPageArr = this.mediaPages;
                        if (i3 >= mediaPageArr.length) {
                            break;
                        }
                        if (mediaPageArr[i3].selectedType == i2) {
                            MediaPage[] mediaPageArr2 = this.mediaPages;
                            mediaPageArr2[i3].fastScrollEnabled = true;
                            updateFastScrollVisibility(mediaPageArr2[i3], true);
                        }
                        i3++;
                    }
                }
                this.photoVideoAdapter.notifyDataSetChanged();
            }
        }
    }

    public static int lambda$loadFastScrollData$11(Period period, Period period2) {
        return period2.date - period.date;
    }

    public static void showFastScrollHint(final MediaPage mediaPage, SharedMediaData[] sharedMediaDataArr, boolean z) {
        Runnable runnable;
        if (z) {
            if (SharedConfig.fastScrollHintCount > 0 && mediaPage.fastScrollHintView == null && !mediaPage.fastScrollHinWasShown && mediaPage.listView.getFastScroll() != null && mediaPage.listView.getFastScroll().isVisible && mediaPage.listView.getFastScroll().getVisibility() == 0 && sharedMediaDataArr[0].totalCount >= 50) {
                SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
                mediaPage.fastScrollHinWasShown = true;
                final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = new SharedMediaFastScrollTooltip(mediaPage.getContext());
                mediaPage.fastScrollHintView = sharedMediaFastScrollTooltip;
                mediaPage.addView(sharedMediaFastScrollTooltip, LayoutHelper.createFrame(-2, -2.0f));
                mediaPage.fastScrollHintView.setAlpha(0.0f);
                mediaPage.fastScrollHintView.setScaleX(0.8f);
                mediaPage.fastScrollHintView.setScaleY(0.8f);
                mediaPage.fastScrollHintView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                mediaPage.invalidate();
                Runnable sharedMediaLayout$$ExternalSyntheticLambda6 = new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.lambda$showFastScrollHint$14(SharedMediaLayout.MediaPage.this, sharedMediaFastScrollTooltip);
                    }
                };
                mediaPage.fastScrollHideHintRunnable = sharedMediaLayout$$ExternalSyntheticLambda6;
                AndroidUtilities.runOnUIThread(sharedMediaLayout$$ExternalSyntheticLambda6, 4000L);
            }
        } else if (mediaPage.fastScrollHintView != null && (runnable = mediaPage.fastScrollHideHintRunnable) != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            mediaPage.fastScrollHideHintRunnable.run();
            mediaPage.fastScrollHideHintRunnable = null;
            mediaPage.fastScrollHintView = null;
        }
    }

    public static void lambda$showFastScrollHint$14(MediaPage mediaPage, final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip) {
        mediaPage.fastScrollHintView = null;
        mediaPage.fastScrollHideHintRunnable = null;
        sharedMediaFastScrollTooltip.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (SharedMediaFastScrollTooltip.this.getParent() != null) {
                    ((ViewGroup) SharedMediaFastScrollTooltip.this.getParent()).removeView(SharedMediaFastScrollTooltip.this);
                }
            }
        }).start();
    }

    public void setCommonGroupsCount(int i) {
        this.hasMedia[6] = i;
        updateTabs(true);
        checkCurrentTabValid();
    }

    public void onActionBarItemClick(View view, int i) {
        TLRPC$EncryptedChat tLRPC$EncryptedChat;
        TLRPC$Chat tLRPC$Chat;
        TLRPC$User tLRPC$User;
        if (i == 101) {
            if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                tLRPC$EncryptedChat = this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(this.dialog_id)));
                tLRPC$User = null;
                tLRPC$Chat = null;
            } else if (DialogObject.isUserDialog(this.dialog_id)) {
                tLRPC$User = this.profileActivity.getMessagesController().getUser(Long.valueOf(this.dialog_id));
                tLRPC$Chat = null;
                tLRPC$EncryptedChat = null;
            } else {
                tLRPC$Chat = this.profileActivity.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                tLRPC$User = null;
                tLRPC$EncryptedChat = null;
            }
            AlertsCreator.createDeleteMessagesAlert(this.profileActivity, tLRPC$User, tLRPC$Chat, tLRPC$EncryptedChat, null, this.mergeDialogId, null, this.selectedFiles, null, false, 1, new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.this.lambda$onActionBarItemClick$15();
                }
            }, null, null);
            return;
        }
        char c = 1;
        if (i == 100) {
            if (this.info != null) {
                TLRPC$Chat chat = this.profileActivity.getMessagesController().getChat(Long.valueOf(this.info.id));
                if (this.profileActivity.getMessagesController().isChatNoForwards(chat)) {
                    HintView hintView = this.fwdRestrictedHint;
                    if (hintView != null) {
                        hintView.setText((!ChatObject.isChannel(chat) || chat.megagroup) ? LocaleController.getString("ForwardsRestrictedInfoGroup", R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString("ForwardsRestrictedInfoChannel", R.string.ForwardsRestrictedInfoChannel));
                        this.fwdRestrictedHint.showForView(view, true);
                        return;
                    }
                    return;
                }
            }
            if (hasNoforwardsMessage()) {
                HintView hintView2 = this.fwdRestrictedHint;
                if (hintView2 != null) {
                    hintView2.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putInt("dialogsType", 3);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public final void didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z) {
                    SharedMediaLayout.this.lambda$onActionBarItemClick$16(dialogsActivity2, arrayList, charSequence, z);
                }
            });
            this.profileActivity.presentFragment(dialogsActivity);
        } else if (i == 102 && this.selectedFiles[0].size() + this.selectedFiles[1].size() == 1) {
            SparseArray<MessageObject>[] sparseArrayArr = this.selectedFiles;
            if (sparseArrayArr[0].size() == 1) {
                c = 0;
            }
            MessageObject valueAt = sparseArrayArr[c].valueAt(0);
            Bundle bundle2 = new Bundle();
            long dialogId = valueAt.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle2.putLong("user_id", dialogId);
            } else {
                TLRPC$Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (!(chat2 == null || chat2.migrated_to == null)) {
                    bundle2.putLong("migrated_to", dialogId);
                    dialogId = -chat2.migrated_to.channel_id;
                }
                bundle2.putLong("chat_id", -dialogId);
            }
            bundle2.putInt("message_id", valueAt.getId());
            bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
            this.profileActivity.presentFragment(new ChatActivity(bundle2), false);
        }
    }

    public void lambda$onActionBarItemClick$15() {
        showActionMode(false);
        this.actionBar.closeSearchField();
        this.cantDeleteMessagesCount = 0;
    }

    public void lambda$onActionBarItemClick$16(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z) {
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        int i = 1;
        while (true) {
            if (i < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < this.selectedFiles[i].size(); i2++) {
                arrayList3.add(Integer.valueOf(this.selectedFiles[i].keyAt(i2)));
            }
            Collections.sort(arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                if (num.intValue() > 0) {
                    arrayList2.add(this.selectedFiles[i].get(num.intValue()));
                }
            }
            this.selectedFiles[i].clear();
            i--;
        }
        this.cantDeleteMessagesCount = 0;
        showActionMode(false);
        if (arrayList.size() > 1 || ((Long) arrayList.get(0)).longValue() == this.profileActivity.getUserConfig().getClientUserId() || charSequence != null) {
            updateRowsSelection();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                long longValue = ((Long) arrayList.get(i3)).longValue();
                if (charSequence != null) {
                    this.profileActivity.getSendMessagesHelper().sendMessage(charSequence.toString(), longValue, null, null, null, true, null, null, null, true, 0, null);
                }
                this.profileActivity.getSendMessagesHelper().sendMessage(arrayList2, longValue, false, false, true, 0);
            }
            dialogsActivity.finishFragment();
            return;
        }
        long longValue2 = ((Long) arrayList.get(0)).longValue();
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(longValue2)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(longValue2));
        } else {
            if (DialogObject.isUserDialog(longValue2)) {
                bundle.putLong("user_id", longValue2);
            } else {
                bundle.putLong("chat_id", -longValue2);
            }
            if (!this.profileActivity.getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
                return;
            }
        }
        this.profileActivity.getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
        ChatActivity chatActivity = new ChatActivity(bundle);
        dialogsActivity.presentFragment(chatActivity, true);
        chatActivity.showFieldPanelForForward(true, arrayList2);
    }

    private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
        int nextPageId = this.scrollSlidingTextTabStrip.getNextPageId(z);
        if (nextPageId < 0) {
            return false;
        }
        if (canShowSearchItem()) {
            int i = this.searchItemState;
            if (i != 0) {
                if (i == 2) {
                    this.searchItem.setAlpha(1.0f);
                } else if (i == 1) {
                    this.searchItem.setAlpha(0.0f);
                    this.searchItem.setVisibility(4);
                }
                this.searchItemState = 0;
            }
        } else {
            this.searchItem.setVisibility(4);
            this.searchItem.setAlpha(0.0f);
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        hideFloatingDateView(true);
        this.maybeStartTracking = false;
        this.startedTracking = true;
        this.startedTrackingX = (int) motionEvent.getX();
        this.actionBar.setEnabled(false);
        this.scrollSlidingTextTabStrip.setEnabled(false);
        this.mediaPages[1].selectedType = nextPageId;
        this.mediaPages[1].setVisibility(0);
        this.animatingForward = z;
        switchToCurrentSelectedMode(true);
        if (z) {
            MediaPage[] mediaPageArr = this.mediaPages;
            mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
        } else {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            mediaPageArr2[1].setTranslationX(-mediaPageArr2[0].getMeasuredWidth());
        }
        return true;
    }

    @Override
    public void forceHasOverlappingRendering(boolean z) {
        super.forceHasOverlappingRendering(z);
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i6 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i6].setTranslationY(this.topPadding - this.lastMeasuredTopPadding);
            i6++;
        }
        this.fragmentContextView.setTranslationY(AndroidUtilities.dp(48.0f) + i2);
        this.additionalFloatingTranslation = i2;
        ChatActionCell chatActionCell = this.floatingDateView;
        if (chatActionCell.getTag() == null) {
            i5 = -AndroidUtilities.dp(48.0f);
        }
        chatActionCell.setTranslationY(i5 + this.additionalFloatingTranslation);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int height = this.delegate.getListView() != null ? this.delegate.getListView().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                if (childAt instanceof MediaPage) {
                    measureChildWithMargins(childAt, i, 0, View.MeasureSpec.makeMeasureSpec(height, 1073741824), 0);
                    ((MediaPage) childAt).listView.setPadding(0, 0, 0, this.topPadding);
                } else {
                    measureChildWithMargins(childAt, i, 0, i2, 0);
                }
            }
        }
    }

    public boolean checkTabsAnimationInProgress() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.checkTabsAnimationInProgress():boolean");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkTabsAnimationInProgress() || this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
    }

    public boolean isCurrentTabFirst() {
        return this.scrollSlidingTextTabStrip.getCurrentTabId() == this.scrollSlidingTextTabStrip.getFirstTabId();
    }

    public RecyclerListView getCurrentListView() {
        return this.mediaPages[0].listView;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        float f3;
        int i;
        MediaPage[] mediaPageArr;
        MediaPage[] mediaPageArr2;
        MediaPage[] mediaPageArr3;
        MediaPage[] mediaPageArr4;
        MediaPage[] mediaPageArr5;
        MediaPage[] mediaPageArr6;
        boolean z;
        MediaPage[] mediaPageArr7;
        int i2 = 0;
        boolean z2 = false;
        if (this.profileActivity.getParentLayout() == null || this.profileActivity.getParentLayout().checkTransitionAnimation() || checkTabsAnimationInProgress() || this.isInPinchToZoomTouchMode) {
            return false;
        }
        if (motionEvent != null) {
            if (this.velocityTracker == null) {
                this.velocityTracker = VelocityTracker.obtain();
            }
            this.velocityTracker.addMovement(motionEvent);
            HintView hintView = this.fwdRestrictedHint;
            if (hintView != null) {
                hintView.hide();
            }
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking && motionEvent.getY() >= AndroidUtilities.dp(48.0f)) {
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            this.maybeStartTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            this.startedTrackingY = (int) motionEvent.getY();
            this.velocityTracker.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
            int x = (int) (motionEvent.getX() - this.startedTrackingX);
            int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
            if (this.startedTracking && (((z = this.animatingForward) && x > 0) || (!z && x < 0))) {
                if (!prepareForMoving(motionEvent, x < 0)) {
                    this.maybeStartTracking = true;
                    this.startedTracking = false;
                    this.mediaPages[0].setTranslationX(0.0f);
                    this.mediaPages[1].setTranslationX(this.animatingForward ? mediaPageArr7[0].getMeasuredWidth() : -mediaPageArr7[0].getMeasuredWidth());
                    this.scrollSlidingTextTabStrip.selectTabWithId(this.mediaPages[1].selectedType, 0.0f);
                }
            }
            if (!this.maybeStartTracking || this.startedTracking) {
                if (this.startedTracking) {
                    this.mediaPages[0].setTranslationX(x);
                    if (this.animatingForward) {
                        this.mediaPages[1].setTranslationX(mediaPageArr6[0].getMeasuredWidth() + x);
                    } else {
                        this.mediaPages[1].setTranslationX(x - mediaPageArr5[0].getMeasuredWidth());
                    }
                    float abs2 = Math.abs(x) / this.mediaPages[0].getMeasuredWidth();
                    if (canShowSearchItem()) {
                        int i3 = this.searchItemState;
                        if (i3 == 2) {
                            this.searchItem.setAlpha(1.0f - abs2);
                        } else if (i3 == 1) {
                            this.searchItem.setAlpha(abs2);
                        }
                        MediaPage[] mediaPageArr8 = this.mediaPages;
                        float f4 = (mediaPageArr8[1] == null || mediaPageArr8[1].selectedType != 0) ? 0.0f : abs2;
                        if (this.mediaPages[0].selectedType == 0) {
                            f4 = 1.0f - abs2;
                        }
                        this.photoVideoOptionsItem.setAlpha(f4);
                        ImageView imageView = this.photoVideoOptionsItem;
                        if (f4 == 0.0f || !canShowSearchItem()) {
                            i2 = 4;
                        }
                        imageView.setVisibility(i2);
                    } else {
                        this.searchItem.setAlpha(0.0f);
                    }
                    this.scrollSlidingTextTabStrip.selectTabWithId(this.mediaPages[1].selectedType, abs2);
                    onSelectedTabChanged();
                }
            } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > abs) {
                if (x < 0) {
                    z2 = true;
                }
                prepareForMoving(motionEvent, z2);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            this.velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
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
                float x2 = this.mediaPages[0].getX();
                this.tabsAnimation = new AnimatorSet();
                boolean z3 = Math.abs(x2) < ((float) this.mediaPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(f2) < 3500.0f || Math.abs(f2) < Math.abs(f));
                this.backAnimation = z3;
                if (z3) {
                    f3 = Math.abs(x2);
                    if (this.animatingForward) {
                        this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(this.mediaPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.mediaPages[1], View.TRANSLATION_X, mediaPageArr4[1].getMeasuredWidth()));
                    } else {
                        this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(this.mediaPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(this.mediaPages[1], View.TRANSLATION_X, -mediaPageArr3[1].getMeasuredWidth()));
                    }
                } else {
                    f3 = this.mediaPages[0].getMeasuredWidth() - Math.abs(x2);
                    if (this.animatingForward) {
                        this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(this.mediaPages[0], View.TRANSLATION_X, -mediaPageArr2[0].getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], View.TRANSLATION_X, 0.0f));
                    } else {
                        this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(this.mediaPages[0], View.TRANSLATION_X, mediaPageArr[0].getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], View.TRANSLATION_X, 0.0f));
                    }
                }
                this.tabsAnimation.setInterpolator(interpolator);
                int measuredWidth = getMeasuredWidth();
                float f5 = measuredWidth / 2;
                float distanceInfluenceForSnapDuration = f5 + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (f3 * 1.0f) / measuredWidth)) * f5);
                float abs3 = Math.abs(f2);
                if (abs3 > 0.0f) {
                    i = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs3) * 1000.0f) * 4;
                } else {
                    i = (int) (((f3 / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.tabsAnimation.setDuration(Math.max((int) ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(i, 600)));
                this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SharedMediaLayout.this.tabsAnimation = null;
                        if (SharedMediaLayout.this.backAnimation) {
                            SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                            if (!SharedMediaLayout.this.canShowSearchItem()) {
                                SharedMediaLayout.this.searchItem.setVisibility(4);
                                SharedMediaLayout.this.searchItem.setAlpha(0.0f);
                            } else if (SharedMediaLayout.this.searchItemState == 2) {
                                SharedMediaLayout.this.searchItem.setAlpha(1.0f);
                            } else if (SharedMediaLayout.this.searchItemState == 1) {
                                SharedMediaLayout.this.searchItem.setAlpha(0.0f);
                                SharedMediaLayout.this.searchItem.setVisibility(4);
                            }
                            SharedMediaLayout.this.searchItemState = 0;
                        } else {
                            MediaPage mediaPage = SharedMediaLayout.this.mediaPages[0];
                            SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                            SharedMediaLayout.this.mediaPages[1] = mediaPage;
                            SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                            if (SharedMediaLayout.this.searchItemState == 2) {
                                SharedMediaLayout.this.searchItem.setVisibility(4);
                            }
                            SharedMediaLayout.this.searchItemState = 0;
                            SharedMediaLayout.this.scrollSlidingTextTabStrip.selectTabWithId(SharedMediaLayout.this.mediaPages[0].selectedType, 1.0f);
                            SharedMediaLayout.this.onSelectedTabChanged();
                            SharedMediaLayout.this.startStopVisibleGifs();
                        }
                        SharedMediaLayout.this.tabsAnimationInProgress = false;
                        SharedMediaLayout.this.maybeStartTracking = false;
                        SharedMediaLayout.this.startedTracking = false;
                        SharedMediaLayout.this.actionBar.setEnabled(true);
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setEnabled(true);
                    }
                });
                this.tabsAnimation.start();
                this.tabsAnimationInProgress = true;
                this.startedTracking = false;
                onSelectedTabChanged();
            } else {
                this.maybeStartTracking = false;
                this.actionBar.setEnabled(true);
                this.scrollSlidingTextTabStrip.setEnabled(true);
            }
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.velocityTracker = null;
            }
        }
        return this.startedTracking;
    }

    public boolean closeActionMode() {
        if (!this.isActionModeShowed) {
            return false;
        }
        for (int i = 1; i >= 0; i--) {
            this.selectedFiles[i].clear();
        }
        this.cantDeleteMessagesCount = 0;
        showActionMode(false);
        updateRowsSelection();
        return true;
    }

    public void setVisibleHeight(int i) {
        int max = Math.max(i, AndroidUtilities.dp(120.0f));
        for (int i2 = 0; i2 < this.mediaPages.length; i2++) {
            float f = (-(getMeasuredHeight() - max)) / 2.0f;
            this.mediaPages[i2].emptyView.setTranslationY(f);
            this.mediaPages[i2].progressView.setTranslationY(-f);
        }
    }

    private void showActionMode(final boolean z) {
        if (this.isActionModeShowed != z) {
            this.isActionModeShowed = z;
            AnimatorSet animatorSet = this.actionModeAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            if (z) {
                this.actionModeLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.actionModeAnimation = animatorSet2;
            Animator[] animatorArr = new Animator[1];
            LinearLayout linearLayout = this.actionModeLayout;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(linearLayout, property, fArr);
            animatorSet2.playTogether(animatorArr);
            this.actionModeAnimation.setDuration(180L);
            this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationCancel(Animator animator) {
                    SharedMediaLayout.this.actionModeAnimation = null;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (SharedMediaLayout.this.actionModeAnimation != null) {
                        SharedMediaLayout.this.actionModeAnimation = null;
                        if (!z) {
                            SharedMediaLayout.this.actionModeLayout.setVisibility(4);
                        }
                    }
                }
            });
            this.actionModeAnimation.start();
        }
    }

    @Override
    public void didReceivedNotification(int r28, int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void saveScrollPosition() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i < mediaPageArr.length) {
                BlurredRecyclerView blurredRecyclerView = mediaPageArr[i].listView;
                if (blurredRecyclerView != null) {
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < blurredRecyclerView.getChildCount(); i4++) {
                        View childAt = blurredRecyclerView.getChildAt(i4);
                        if (childAt instanceof SharedPhotoVideoCell2) {
                            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                            int messageId = sharedPhotoVideoCell2.getMessageId();
                            i3 = sharedPhotoVideoCell2.getTop();
                            i2 = messageId;
                        }
                        if (childAt instanceof SharedDocumentCell) {
                            SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                            i2 = sharedDocumentCell.getMessage().getId();
                            i3 = sharedDocumentCell.getTop();
                        }
                        if (childAt instanceof SharedAudioCell) {
                            SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                            i2 = sharedAudioCell.getMessage().getId();
                            i3 = sharedAudioCell.getTop();
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                    if (i2 != 0) {
                        int i5 = -1;
                        if (this.mediaPages[i].selectedType >= 0 && this.mediaPages[i].selectedType < this.sharedMediaData.length) {
                            int i6 = 0;
                            while (true) {
                                if (i6 >= this.sharedMediaData[this.mediaPages[i].selectedType].messages.size()) {
                                    break;
                                } else if (i2 == this.sharedMediaData[this.mediaPages[i].selectedType].messages.get(i6).getId()) {
                                    i5 = i6;
                                    break;
                                } else {
                                    i6++;
                                }
                            }
                            int i7 = this.sharedMediaData[this.mediaPages[i].selectedType].startOffset + i5;
                            if (i5 >= 0) {
                                ((LinearLayoutManager) blurredRecyclerView.getLayoutManager()).scrollToPositionWithOffset(i7, (-this.mediaPages[i].listView.getPaddingTop()) + i3);
                                if (this.photoVideoChangeColumnsAnimation) {
                                    this.mediaPages[i].animationSupportingLayoutManager.scrollToPositionWithOffset(i7, (-this.mediaPages[i].listView.getPaddingTop()) + i3);
                                }
                            }
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void animateItemsEnter(RecyclerListView recyclerListView, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = recyclerListView.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerListView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            recyclerListView.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass27(recyclerListView, sparseBooleanArray, view, i));
    }

    public class AnonymousClass27 implements ViewTreeObserver.OnPreDrawListener {
        final SparseBooleanArray val$addedMesages;
        final RecyclerListView val$finalListView;
        final View val$finalProgressView;
        final int val$oldItemCount;

        AnonymousClass27(RecyclerListView recyclerListView, SparseBooleanArray sparseBooleanArray, View view, int i) {
            this.val$finalListView = recyclerListView;
            this.val$addedMesages = sparseBooleanArray;
            this.val$finalProgressView = view;
            this.val$oldItemCount = i;
        }

        @Override
        public boolean onPreDraw() {
            SharedMediaLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView.Adapter adapter = this.val$finalListView.getAdapter();
            if (adapter != SharedMediaLayout.this.photoVideoAdapter && adapter != SharedMediaLayout.this.documentsAdapter && adapter != SharedMediaLayout.this.audioAdapter && adapter != SharedMediaLayout.this.voiceAdapter) {
                int childCount = this.val$finalListView.getChildCount();
                AnimatorSet animatorSet = new AnimatorSet();
                for (int i = 0; i < childCount; i++) {
                    View childAt = this.val$finalListView.getChildAt(i);
                    if (childAt != this.val$finalProgressView && this.val$finalListView.getChildAdapterPosition(childAt) >= this.val$oldItemCount - 1) {
                        childAt.setAlpha(0.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay((int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f));
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                    View view = this.val$finalProgressView;
                    if (view != null && view.getParent() == null) {
                        this.val$finalListView.addView(this.val$finalProgressView);
                        final RecyclerView.LayoutManager layoutManager = this.val$finalListView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.ignoreView(this.val$finalProgressView);
                            View view2 = this.val$finalProgressView;
                            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, view2.getAlpha(), 0.0f);
                            ofFloat2.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    AnonymousClass27.this.val$finalProgressView.setAlpha(1.0f);
                                    layoutManager.stopIgnoringView(AnonymousClass27.this.val$finalProgressView);
                                    AnonymousClass27 r2 = AnonymousClass27.this;
                                    r2.val$finalListView.removeView(r2.val$finalProgressView);
                                }
                            });
                            ofFloat2.start();
                        }
                    }
                }
                animatorSet.start();
            } else if (this.val$addedMesages != null) {
                int childCount2 = this.val$finalListView.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = this.val$finalListView.getChildAt(i2);
                    final int messageId = SharedMediaLayout.this.getMessageId(childAt2);
                    if (messageId != 0 && this.val$addedMesages.get(messageId, false)) {
                        SharedMediaLayout.this.messageAlphaEnter.put(messageId, Float.valueOf(0.0f));
                        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
                        final RecyclerListView recyclerListView = this.val$finalListView;
                        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                SharedMediaLayout.AnonymousClass27.this.lambda$onPreDraw$0(messageId, recyclerListView, valueAnimator);
                            }
                        });
                        ofFloat3.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                SharedMediaLayout.this.messageAlphaEnter.remove(messageId);
                                AnonymousClass27.this.val$finalListView.invalidate();
                            }
                        });
                        ofFloat3.setStartDelay((int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f));
                        ofFloat3.setDuration(250L);
                        ofFloat3.start();
                    }
                    this.val$finalListView.invalidate();
                }
            }
            return true;
        }

        public void lambda$onPreDraw$0(int i, RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            SharedMediaLayout.this.messageAlphaEnter.put(i, (Float) valueAnimator.getAnimatedValue());
            recyclerListView.invalidate();
        }
    }

    public void onResume() {
        this.scrolling = true;
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
        if (sharedPhotoVideoAdapter != null) {
            sharedPhotoVideoAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.notifyDataSetChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.notifyDataSetChanged();
        }
        for (int i = 0; i < this.mediaPages.length; i++) {
            fixLayoutInternal(i);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i < mediaPageArr.length) {
                if (mediaPageArr[i].listView != null) {
                    this.mediaPages[i].listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                        @Override
                        public boolean onPreDraw() {
                            SharedMediaLayout.this.mediaPages[i].getViewTreeObserver().removeOnPreDrawListener(this);
                            SharedMediaLayout.this.fixLayoutInternal(i);
                            return true;
                        }
                    });
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setChatInfo(TLRPC$ChatFull tLRPC$ChatFull) {
        this.info = tLRPC$ChatFull;
        if (tLRPC$ChatFull != null) {
            long j = tLRPC$ChatFull.migrated_from_chat_id;
            if (j != 0 && this.mergeDialogId == 0) {
                this.mergeDialogId = -j;
                int i = 0;
                while (true) {
                    SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                    if (i < sharedMediaDataArr.length) {
                        sharedMediaDataArr[i].max_id[1] = this.info.migrated_from_max_id;
                        sharedMediaDataArr[i].endReached[1] = false;
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setChatUsers(ArrayList<Integer> arrayList, TLRPC$ChatFull tLRPC$ChatFull) {
        this.chatUsersAdapter.chatInfo = tLRPC$ChatFull;
        this.chatUsersAdapter.sortedUsers = arrayList;
        updateTabs(true);
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i < mediaPageArr.length) {
                if (mediaPageArr[i].selectedType == 7) {
                    this.mediaPages[i].listView.getAdapter().notifyDataSetChanged();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void updateRowsSelection() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i < mediaPageArr.length) {
                int childCount = mediaPageArr[i].listView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.mediaPages[i].listView.getChildAt(i2);
                    if (childAt instanceof SharedDocumentCell) {
                        ((SharedDocumentCell) childAt).setChecked(false, true);
                    } else if (childAt instanceof SharedPhotoVideoCell2) {
                        ((SharedPhotoVideoCell2) childAt).setChecked(false, true);
                    } else if (childAt instanceof SharedLinkCell) {
                        ((SharedLinkCell) childAt).setChecked(false, true);
                    } else if (childAt instanceof SharedAudioCell) {
                        ((SharedAudioCell) childAt).setChecked(false, true);
                    } else if (childAt instanceof ContextLinkCell) {
                        ((ContextLinkCell) childAt).setChecked(false, true);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setMergeDialogId(long j) {
        this.mergeDialogId = j;
    }

    private void updateTabs(boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.updateTabs(boolean):void");
    }

    public void startStopVisibleGifs() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i < mediaPageArr.length) {
                int childCount = mediaPageArr[i].listView.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = this.mediaPages[i].listView.getChildAt(i2);
                    if (childAt instanceof ContextLinkCell) {
                        ImageReceiver photoImage = ((ContextLinkCell) childAt).getPhotoImage();
                        if (i == 0) {
                            photoImage.setAllowStartAnimation(true);
                            photoImage.startAnimation();
                        } else {
                            photoImage.setAllowStartAnimation(false);
                            photoImage.stopAnimation();
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void switchToCurrentSelectedMode(boolean z) {
        MediaPage[] mediaPageArr;
        boolean z2;
        int i;
        int i2;
        GroupUsersSearchAdapter groupUsersSearchAdapter;
        int i3 = 0;
        while (true) {
            mediaPageArr = this.mediaPages;
            if (i3 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i3].listView.stopScroll();
            i3++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mediaPageArr[z ? 1 : 0].getLayoutParams();
        RecyclerView.Adapter adapter = this.mediaPages[z].listView.getAdapter();
        RecyclerView.RecycledViewPool recycledViewPool = null;
        int i4 = 100;
        if (!this.searching || !this.searchWas) {
            this.mediaPages[z].listView.setPinnedHeaderShadowDrawable(null);
            if (this.mediaPages[z].selectedType == 0) {
                if (adapter != this.photoVideoAdapter) {
                    recycleAdapter(adapter);
                    this.mediaPages[z].listView.setAdapter(this.photoVideoAdapter);
                }
                int i5 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i5;
                layoutParams.leftMargin = i5;
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                z2 = sharedMediaDataArr[0].fastScrollDataLoaded && !sharedMediaDataArr[0].fastScrollPeriods.isEmpty();
                i = this.mediaColumnsCount;
                this.mediaPages[z].listView.setPinnedHeaderShadowDrawable(this.pinnedHeaderShadowDrawable);
                SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                if (sharedMediaDataArr2[0].recycledViewPool == null) {
                    sharedMediaDataArr2[0].recycledViewPool = new RecyclerView.RecycledViewPool();
                }
                recycledViewPool = this.sharedMediaData[0].recycledViewPool;
            } else {
                if (this.mediaPages[z].selectedType == 1) {
                    SharedMediaData[] sharedMediaDataArr3 = this.sharedMediaData;
                    z2 = sharedMediaDataArr3[1].fastScrollDataLoaded && !sharedMediaDataArr3[1].fastScrollPeriods.isEmpty();
                    if (adapter != this.documentsAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.documentsAdapter);
                    }
                } else if (this.mediaPages[z].selectedType == 2) {
                    SharedMediaData[] sharedMediaDataArr4 = this.sharedMediaData;
                    z2 = sharedMediaDataArr4[2].fastScrollDataLoaded && !sharedMediaDataArr4[2].fastScrollPeriods.isEmpty();
                    if (adapter != this.voiceAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.voiceAdapter);
                    }
                } else {
                    if (this.mediaPages[z].selectedType == 3) {
                        if (adapter != this.linksAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.linksAdapter);
                        }
                    } else if (this.mediaPages[z].selectedType == 4) {
                        SharedMediaData[] sharedMediaDataArr5 = this.sharedMediaData;
                        z2 = sharedMediaDataArr5[4].fastScrollDataLoaded && !sharedMediaDataArr5[4].fastScrollPeriods.isEmpty();
                        if (adapter != this.audioAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.audioAdapter);
                        }
                    } else if (this.mediaPages[z].selectedType == 5) {
                        if (adapter != this.gifAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.gifAdapter);
                        }
                    } else if (this.mediaPages[z].selectedType == 6) {
                        if (adapter != this.commonGroupsAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.commonGroupsAdapter);
                        }
                    } else if (this.mediaPages[z].selectedType == 7 && adapter != this.chatUsersAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.chatUsersAdapter);
                    }
                    z2 = false;
                }
                i = 100;
            }
            if (this.mediaPages[z].selectedType == 0 || this.mediaPages[z].selectedType == 2 || this.mediaPages[z].selectedType == 5 || this.mediaPages[z].selectedType == 6 || (this.mediaPages[z].selectedType == 7 && !this.delegate.canSearchMembers())) {
                if (z != 0) {
                    this.searchItemState = 2;
                } else {
                    this.searchItemState = 0;
                    this.searchItem.setVisibility(4);
                }
            } else if (z != 0) {
                if (this.searchItem.getVisibility() != 4 || this.actionBar.isSearchFieldVisible()) {
                    this.searchItemState = 0;
                } else {
                    if (canShowSearchItem()) {
                        this.searchItemState = 1;
                        this.searchItem.setVisibility(0);
                    } else {
                        this.searchItem.setVisibility(4);
                    }
                    this.searchItem.setAlpha(0.0f);
                }
            } else if (this.searchItem.getVisibility() == 4) {
                if (canShowSearchItem()) {
                    this.searchItemState = 0;
                    this.searchItem.setAlpha(1.0f);
                    this.searchItem.setVisibility(0);
                } else {
                    this.searchItem.setVisibility(4);
                    this.searchItem.setAlpha(0.0f);
                }
            }
            if (this.mediaPages[z].selectedType == 6) {
                if (!this.commonGroupsAdapter.loading && !this.commonGroupsAdapter.endReached && this.commonGroupsAdapter.chats.isEmpty()) {
                    this.commonGroupsAdapter.getChats(0L, 100);
                }
            } else if (this.mediaPages[z].selectedType != 7 && !this.sharedMediaData[this.mediaPages[z].selectedType].loading && !this.sharedMediaData[this.mediaPages[z].selectedType].endReached[0] && this.sharedMediaData[this.mediaPages[z].selectedType].messages.isEmpty()) {
                this.sharedMediaData[this.mediaPages[z].selectedType].loading = true;
                this.documentsAdapter.notifyDataSetChanged();
                int i6 = this.mediaPages[z].selectedType;
                if (i6 == 0) {
                    SharedMediaData[] sharedMediaDataArr6 = this.sharedMediaData;
                    if (sharedMediaDataArr6[0].filterType == 1) {
                        i2 = 6;
                    } else if (sharedMediaDataArr6[0].filterType == 2) {
                        i2 = 7;
                    }
                    this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, 0, i2, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[this.mediaPages[z].selectedType].requestIndex);
                }
                i2 = i6;
                this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, 0, i2, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[this.mediaPages[z].selectedType].requestIndex);
            }
            this.mediaPages[z].listView.setVisibility(0);
            i4 = i;
        } else {
            if (z != 0) {
                if (this.mediaPages[z].selectedType == 0 || this.mediaPages[z].selectedType == 2 || this.mediaPages[z].selectedType == 5 || this.mediaPages[z].selectedType == 6 || (this.mediaPages[z].selectedType == 7 && !this.delegate.canSearchMembers())) {
                    this.searching = false;
                    this.searchWas = false;
                    switchToCurrentSelectedMode(true);
                    return;
                }
                String obj = this.searchItem.getSearchField().getText().toString();
                if (this.mediaPages[z].selectedType == 1) {
                    MediaSearchAdapter mediaSearchAdapter = this.documentsSearchAdapter;
                    if (mediaSearchAdapter != null) {
                        mediaSearchAdapter.search(obj, false);
                        if (adapter != this.documentsSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.documentsSearchAdapter);
                        }
                    }
                } else if (this.mediaPages[z].selectedType == 3) {
                    MediaSearchAdapter mediaSearchAdapter2 = this.linksSearchAdapter;
                    if (mediaSearchAdapter2 != null) {
                        mediaSearchAdapter2.search(obj, false);
                        if (adapter != this.linksSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.linksSearchAdapter);
                        }
                    }
                } else if (this.mediaPages[z].selectedType == 4) {
                    MediaSearchAdapter mediaSearchAdapter3 = this.audioSearchAdapter;
                    if (mediaSearchAdapter3 != null) {
                        mediaSearchAdapter3.search(obj, false);
                        if (adapter != this.audioSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z].listView.setAdapter(this.audioSearchAdapter);
                        }
                    }
                } else if (this.mediaPages[z].selectedType == 7 && (groupUsersSearchAdapter = this.groupUsersSearchAdapter) != null) {
                    groupUsersSearchAdapter.search(obj, false);
                    if (adapter != this.groupUsersSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.groupUsersSearchAdapter);
                    }
                }
            } else if (this.mediaPages[z].listView != null) {
                if (this.mediaPages[z].selectedType == 1) {
                    if (adapter != this.documentsSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.documentsSearchAdapter);
                    }
                    this.documentsSearchAdapter.notifyDataSetChanged();
                } else if (this.mediaPages[z].selectedType == 3) {
                    if (adapter != this.linksSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.linksSearchAdapter);
                    }
                    this.linksSearchAdapter.notifyDataSetChanged();
                } else if (this.mediaPages[z].selectedType == 4) {
                    if (adapter != this.audioSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.audioSearchAdapter);
                    }
                    this.audioSearchAdapter.notifyDataSetChanged();
                } else if (this.mediaPages[z].selectedType == 7) {
                    if (adapter != this.groupUsersSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z].listView.setAdapter(this.groupUsersSearchAdapter);
                    }
                    this.groupUsersSearchAdapter.notifyDataSetChanged();
                }
            }
            z2 = false;
        }
        MediaPage[] mediaPageArr2 = this.mediaPages;
        mediaPageArr2[z].fastScrollEnabled = z2;
        updateFastScrollVisibility(mediaPageArr2[z], false);
        this.mediaPages[z].layoutManager.setSpanCount(i4);
        this.mediaPages[z].listView.setRecycledViewPool(recycledViewPool);
        this.mediaPages[z].animationSupportingListView.setRecycledViewPool(recycledViewPool);
        if (this.searchItemState == 2 && this.actionBar.isSearchFieldVisible()) {
            this.ignoreSearchCollapse = true;
            this.actionBar.closeSearchField();
            this.searchItemState = 0;
            this.searchItem.setAlpha(0.0f);
            this.searchItem.setVisibility(4);
        }
    }

    private boolean onItemLongClick(MessageObject messageObject, View view, int i) {
        if (this.isActionModeShowed || this.profileActivity.getParentActivity() == null || messageObject == null) {
            return false;
        }
        AndroidUtilities.hideKeyboard(this.profileActivity.getParentActivity().getCurrentFocus());
        this.selectedFiles[messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
        if (!messageObject.canDeleteMessage(false, null)) {
            this.cantDeleteMessagesCount++;
        }
        this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
        ActionBarMenuItem actionBarMenuItem = this.gotoItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(0);
        }
        this.selectedMessagesCountTextView.setNumber(1, false);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.actionModeViews.size(); i2++) {
            View view2 = this.actionModeViews.get(i2);
            AndroidUtilities.clearDrawableAnimation(view2);
            arrayList.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(250L);
        animatorSet.start();
        this.scrolling = false;
        if (view instanceof SharedDocumentCell) {
            ((SharedDocumentCell) view).setChecked(true, true);
        } else if (view instanceof SharedPhotoVideoCell) {
            ((SharedPhotoVideoCell) view).setChecked(i, true, true);
        } else if (view instanceof SharedLinkCell) {
            ((SharedLinkCell) view).setChecked(true, true);
        } else if (view instanceof SharedAudioCell) {
            ((SharedAudioCell) view).setChecked(true, true);
        } else if (view instanceof ContextLinkCell) {
            ((ContextLinkCell) view).setChecked(true, true);
        } else if (view instanceof SharedPhotoVideoCell2) {
            ((SharedPhotoVideoCell2) view).setChecked(true, true);
        }
        if (!this.isActionModeShowed) {
            showActionMode(true);
        }
        updateForwardItem();
        return true;
    }

    private void onItemClick(int i, View view, MessageObject messageObject, int i2, int i3) {
        int i4;
        if (messageObject != null && !this.photoVideoChangeColumnsAnimation) {
            String str = null;
            boolean z = false;
            if (this.isActionModeShowed) {
                char c = messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1;
                if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                    this.selectedFiles[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount--;
                    }
                } else if (this.selectedFiles[0].size() + this.selectedFiles[1].size() < 100) {
                    this.selectedFiles[c].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount++;
                    }
                } else {
                    return;
                }
                if (this.selectedFiles[0].size() == 0 && this.selectedFiles[1].size() == 0) {
                    showActionMode(false);
                } else {
                    this.selectedMessagesCountTextView.setNumber(this.selectedFiles[0].size() + this.selectedFiles[1].size(), true);
                    int i5 = 8;
                    this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
                    ActionBarMenuItem actionBarMenuItem = this.gotoItem;
                    if (actionBarMenuItem != null) {
                        if (this.selectedFiles[0].size() == 1) {
                            i5 = 0;
                        }
                        actionBarMenuItem.setVisibility(i5);
                    }
                }
                this.scrolling = false;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    sharedDocumentCell.setChecked(z, true);
                } else if (view instanceof SharedPhotoVideoCell) {
                    SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) view;
                    if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                        i4 = i2;
                        z = true;
                    } else {
                        i4 = i2;
                    }
                    sharedPhotoVideoCell.setChecked(i4, z, true);
                } else if (view instanceof SharedLinkCell) {
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) view;
                    if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    sharedLinkCell.setChecked(z, true);
                } else if (view instanceof SharedAudioCell) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
                    if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    sharedAudioCell.setChecked(z, true);
                } else if (view instanceof ContextLinkCell) {
                    ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                    if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    contextLinkCell.setChecked(z, true);
                } else if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    sharedPhotoVideoCell2.setChecked(z, true);
                }
            } else if (i3 == 0) {
                int i6 = i - this.sharedMediaData[i3].startOffset;
                if (i6 >= 0 && i6 < this.sharedMediaData[i3].messages.size()) {
                    PhotoViewer.getInstance().setParentActivity(this.profileActivity.getParentActivity());
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, i6, this.dialog_id, this.mergeDialogId, this.provider);
                }
            } else if (i3 == 2 || i3 == 4) {
                if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).didPressedButton();
                }
            } else if (i3 == 5) {
                PhotoViewer.getInstance().setParentActivity(this.profileActivity.getParentActivity());
                int indexOf = this.sharedMediaData[i3].messages.indexOf(messageObject);
                if (indexOf < 0) {
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    arrayList.add(messageObject);
                    PhotoViewer.getInstance().openPhoto(arrayList, 0, 0L, 0L, this.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, indexOf, this.dialog_id, this.mergeDialogId, this.provider);
                }
            } else if (i3 == 1) {
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell2 = (SharedDocumentCell) view;
                    TLRPC$Document document = messageObject.getDocument();
                    if (sharedDocumentCell2.isLoaded()) {
                        if (messageObject.canPreviewDocument()) {
                            PhotoViewer.getInstance().setParentActivity(this.profileActivity.getParentActivity());
                            int indexOf2 = this.sharedMediaData[i3].messages.indexOf(messageObject);
                            if (indexOf2 < 0) {
                                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                                arrayList2.add(messageObject);
                                PhotoViewer.getInstance().openPhoto(arrayList2, 0, 0L, 0L, this.provider);
                                return;
                            }
                            PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, indexOf2, this.dialog_id, this.mergeDialogId, this.provider);
                            return;
                        }
                        AndroidUtilities.openDocument(messageObject, this.profileActivity.getParentActivity(), this.profileActivity);
                    } else if (!sharedDocumentCell2.isLoading()) {
                        MessageObject message = sharedDocumentCell2.getMessage();
                        message.putInDownloadsStore = true;
                        this.profileActivity.getFileLoader().loadFile(document, message, 0, 0);
                        sharedDocumentCell2.updateFileExistIcon(true);
                    } else {
                        this.profileActivity.getFileLoader().cancelLoadFile(document);
                        sharedDocumentCell2.updateFileExistIcon(true);
                    }
                }
            } else if (i3 == 3) {
                try {
                    TLRPC$MessageMedia tLRPC$MessageMedia = messageObject.messageOwner.media;
                    TLRPC$WebPage tLRPC$WebPage = tLRPC$MessageMedia != null ? tLRPC$MessageMedia.webpage : null;
                    if (tLRPC$WebPage != null && !(tLRPC$WebPage instanceof TLRPC$TL_webPageEmpty)) {
                        if (tLRPC$WebPage.cached_page != null) {
                            ArticleViewer.getInstance().setParentActivity(this.profileActivity.getParentActivity(), this.profileActivity);
                            ArticleViewer.getInstance().open(messageObject);
                            return;
                        }
                        String str2 = tLRPC$WebPage.embed_url;
                        if (str2 == null || str2.length() == 0) {
                            str = tLRPC$WebPage.url;
                        } else {
                            openWebView(tLRPC$WebPage, messageObject);
                            return;
                        }
                    }
                    if (str == null) {
                        str = ((SharedLinkCell) view).getLink(0);
                    }
                    if (str != null) {
                        openUrl(str);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            updateForwardItem();
        }
    }

    public void openUrl(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            AlertsCreator.showOpenUrlAlert(this.profileActivity, str, true, true);
        } else {
            Browser.openUrl(this.profileActivity.getParentActivity(), str);
        }
    }

    public void openWebView(TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject) {
        EmbedBottomSheet.show(this.profileActivity.getParentActivity(), messageObject, this.provider, tLRPC$WebPage.site_name, tLRPC$WebPage.description, tLRPC$WebPage.url, tLRPC$WebPage.embed_url, tLRPC$WebPage.embed_width, tLRPC$WebPage.embed_height, false);
    }

    private void recycleAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof SharedPhotoVideoAdapter) {
            this.cellCache.addAll(this.cache);
            this.cache.clear();
        } else if (adapter == this.audioAdapter) {
            this.audioCellCache.addAll(this.audioCache);
            this.audioCache.clear();
        }
    }

    public void fixLayoutInternal(int i) {
        ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (AndroidUtilities.isTablet() || ApplicationLoader.applicationContext.getResources().getConfiguration().orientation != 2) {
                this.selectedMessagesCountTextView.setTextSize(20);
            } else {
                this.selectedMessagesCountTextView.setTextSize(18);
            }
        }
        if (i == 0) {
            this.photoVideoAdapter.notifyDataSetChanged();
        }
    }

    public class AnonymousClass30 implements SharedLinkCell.SharedLinkCellDelegate {
        AnonymousClass30() {
        }

        @Override
        public void needOpenWebView(TLRPC$WebPage tLRPC$WebPage, MessageObject messageObject) {
            SharedMediaLayout.this.openWebView(tLRPC$WebPage, messageObject);
        }

        @Override
        public boolean canPerformActions() {
            return !SharedMediaLayout.this.isActionModeShowed;
        }

        @Override
        public void onLinkPress(final String str, boolean z) {
            if (z) {
                BottomSheet.Builder builder = new BottomSheet.Builder(SharedMediaLayout.this.profileActivity.getParentActivity());
                builder.setTitle(str);
                builder.setItems(new CharSequence[]{LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)}, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        SharedMediaLayout.AnonymousClass30.this.lambda$onLinkPress$0(str, dialogInterface, i);
                    }
                });
                SharedMediaLayout.this.profileActivity.showDialog(builder.create());
                return;
            }
            SharedMediaLayout.this.openUrl(str);
        }

        public void lambda$onLinkPress$0(String str, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                SharedMediaLayout.this.openUrl(str);
            } else if (i == 1) {
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
            }
        }
    }

    public class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) {
                return i == 0 || i2 != 0;
            }
            return false;
        }

        @Override
        public int getSectionCount() {
            int i = 1;
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 1;
            }
            int size = SharedMediaLayout.this.sharedMediaData[3].sections.size();
            if (SharedMediaLayout.this.sharedMediaData[3].sections.isEmpty() || (SharedMediaLayout.this.sharedMediaData[3].endReached[0] && SharedMediaLayout.this.sharedMediaData[3].endReached[1])) {
                i = 0;
            }
            return size + i;
        }

        @Override
        public int getCountForSection(int i) {
            int i2 = 1;
            if ((SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) || i >= SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return 1;
            }
            int size = SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i)).size();
            if (i == 0) {
                i2 = 0;
            }
            return size + i2;
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("graySection") & (-218103809));
            }
            if (i == 0) {
                view.setAlpha(0.0f);
            } else if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i)).get(0).messageOwner.date));
            }
            return view;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraySectionCell graySectionCell;
            if (i == 0) {
                graySectionCell = new GraySectionCell(this.mContext);
            } else if (i == 1) {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            } else if (i != 3) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(5);
                graySectionCell = flickerLoadingView;
            } else {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 3, SharedMediaLayout.this.dialog_id);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() != 2 && viewHolder.getItemViewType() != 3) {
                ArrayList<MessageObject> arrayList = SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i));
                int itemViewType = viewHolder.getItemViewType();
                boolean z = false;
                if (itemViewType == 0) {
                    ((GraySectionCell) viewHolder.itemView).setText(LocaleController.formatSectionDate(arrayList.get(0).messageOwner.date));
                } else if (itemViewType == 1) {
                    if (i != 0) {
                        i2--;
                    }
                    SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
                    MessageObject messageObject = arrayList.get(i2);
                    sharedLinkCell.setLink(messageObject, i2 != arrayList.size() - 1 || (i == SharedMediaLayout.this.sharedMediaData[3].sections.size() - 1 && SharedMediaLayout.this.sharedMediaData[3].loading));
                    if (SharedMediaLayout.this.isActionModeShowed) {
                        if (SharedMediaLayout.this.selectedFiles[messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0) {
                            z = true;
                        }
                        sharedLinkCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                        return;
                    }
                    sharedLinkCell.setChecked(false, !SharedMediaLayout.this.scrolling);
                }
            }
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 3;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return (i == 0 || i2 != 0) ? 1 : 0;
            }
            return 2;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }
    }

    public class SharedDocumentsAdapter extends RecyclerListView.FastScrollAdapter {
        private int currentType;
        private boolean inFastScrollMode;
        private Context mContext;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[this.currentType].totalCount;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] || !SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) && SharedMediaLayout.this.sharedMediaData[this.currentType].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].totalCount != 0) {
                return SharedMediaLayout.this.sharedMediaData[this.currentType].totalCount;
            }
            int startOffset = SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset() + SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size();
            return startOffset != 0 ? (!SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] || !SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) ? SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() != 0 ? startOffset + SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() : startOffset + 1 : startOffset : startOffset;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SharedAudioCell sharedAudioCell;
            SharedAudioCell sharedAudioCell2;
            if (i == 1) {
                SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(this.mContext);
                sharedDocumentCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                sharedAudioCell = sharedDocumentCell;
            } else if (i == 2) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                if (this.currentType == 2) {
                    flickerLoadingView.setViewType(4);
                } else {
                    flickerLoadingView.setViewType(3);
                }
                flickerLoadingView.showDate(false);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                sharedAudioCell = flickerLoadingView;
            } else if (i != 4) {
                if (this.currentType != 4 || SharedMediaLayout.this.audioCellCache.isEmpty()) {
                    sharedAudioCell2 = new SharedAudioCell(this.mContext) {
                        @Override
                        public boolean needPlayMessage(MessageObject messageObject) {
                            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                                boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                                MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages : null, false);
                                return playMessage;
                            } else if (messageObject.isMusic()) {
                                return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                            } else {
                                return false;
                            }
                        }
                    };
                } else {
                    View view = (View) SharedMediaLayout.this.audioCellCache.get(0);
                    SharedMediaLayout.this.audioCellCache.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view.getParent();
                    sharedAudioCell2 = view;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(view);
                        sharedAudioCell2 = view;
                    }
                }
                SharedAudioCell sharedAudioCell3 = sharedAudioCell2;
                sharedAudioCell3.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                sharedAudioCell = sharedAudioCell2;
                if (this.currentType == 4) {
                    SharedMediaLayout.this.audioCache.add(sharedAudioCell3);
                    sharedAudioCell = sharedAudioCell2;
                }
            } else {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, this.currentType, SharedMediaLayout.this.dialog_id);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            sharedAudioCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedAudioCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList<MessageObject> arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].messages;
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType == 1) {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                MessageObject messageObject = arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                sharedDocumentCell.setDocument(messageObject, i != arrayList.size() - 1);
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    sharedDocumentCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                    return;
                }
                sharedDocumentCell.setChecked(false, !SharedMediaLayout.this.scrolling);
            } else if (itemViewType == 3) {
                SharedAudioCell sharedAudioCell = (SharedAudioCell) viewHolder.itemView;
                MessageObject messageObject2 = arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                sharedAudioCell.setMessageObject(messageObject2, i != arrayList.size() - 1);
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0) {
                        z = true;
                    }
                    sharedAudioCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                    return;
                }
                sharedAudioCell.setChecked(false, !SharedMediaLayout.this.scrolling);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 4;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset || i >= SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset + SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size()) {
                return 2;
            }
            int i2 = this.currentType;
            return (i2 == 2 || i2 == 4) ? 3 : 1;
        }

        @Override
        public String getLetter(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods == null) {
                return "";
            }
            ArrayList<Period> arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods;
            if (arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= arrayList.get(i2).startOffset) {
                    return arrayList.get(i2).formatedDate;
                }
            }
            return arrayList.get(arrayList.size() - 1).formatedDate;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float totalItemsCount = f * ((getTotalItemsCount() * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
            iArr[0] = (int) (totalItemsCount / measuredHeight);
            iArr[1] = ((int) totalItemsCount) % measuredHeight;
        }

        @Override
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(this.currentType);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int i = 0;
                    for (int i2 = 0; i2 < recyclerListView.getChildCount(); i2++) {
                        i = SharedMediaLayout.this.getMessageId(recyclerListView.getChildAt(i2));
                        if (i != 0) {
                            break;
                        }
                    }
                    if (i == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(this.currentType, recyclerListView, true);
                    }
                }
            }
        }

        @Override
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[this.currentType].totalCount;
        }
    }

    public static View createEmptyStubView(Context context, int i, long j) {
        EmptyStubView emptyStubView = new EmptyStubView(context);
        if (i == 0) {
            emptyStubView.emptyImageView.setImageResource(R.drawable.tip1);
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoMediaSecret", R.string.NoMediaSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoMedia", R.string.NoMedia));
            }
        } else if (i == 1) {
            emptyStubView.emptyImageView.setImageResource(R.drawable.tip2);
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedFilesSecret", R.string.NoSharedFilesSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedFiles", R.string.NoSharedFiles));
            }
        } else if (i == 2) {
            emptyStubView.emptyImageView.setImageResource(R.drawable.tip5);
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedVoiceSecret", R.string.NoSharedVoiceSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedVoice", R.string.NoSharedVoice));
            }
        } else if (i == 3) {
            emptyStubView.emptyImageView.setImageResource(R.drawable.tip3);
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedLinksSecret", R.string.NoSharedLinksSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedLinks", R.string.NoSharedLinks));
            }
        } else if (i == 4) {
            emptyStubView.emptyImageView.setImageResource(R.drawable.tip4);
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedAudioSecret", R.string.NoSharedAudioSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedAudio", R.string.NoSharedAudio));
            }
        } else if (i == 5) {
            emptyStubView.emptyImageView.setImageResource(R.drawable.tip1);
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoSharedGifSecret", R.string.NoSharedGifSecret));
            } else {
                emptyStubView.emptyTextView.setText(LocaleController.getString("NoGIFs", R.string.NoGIFs));
            }
        } else if (i == 6) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText(LocaleController.getString("NoGroupsInCommon", R.string.NoGroupsInCommon));
        } else if (i == 7) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText("");
        }
        return emptyStubView;
    }

    public static class EmptyStubView extends LinearLayout {
        final ImageView emptyImageView;
        final TextView emptyTextView;
        boolean ignoreRequestLayout;

        public EmptyStubView(Context context) {
            super(context);
            TextView textView = new TextView(context);
            this.emptyTextView = textView;
            ImageView imageView = new ImageView(context);
            this.emptyImageView = imageView;
            setOrientation(1);
            setGravity(17);
            addView(imageView, LayoutHelper.createLinear(-2, -2));
            textView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
            textView.setGravity(17);
            textView.setTextSize(1, 17.0f);
            textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            addView(textView, LayoutHelper.createLinear(-2, -2, 17, 0, 24, 0, 0));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int rotation = ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
            this.ignoreRequestLayout = true;
            if (AndroidUtilities.isTablet()) {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            } else if (rotation == 3 || rotation == 1) {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
            } else {
                this.emptyTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            }
            this.ignoreRequestLayout = false;
            super.onMeasure(i, i2);
        }

        @Override
        public void requestLayout() {
            if (!this.ignoreRequestLayout) {
                super.requestLayout();
            }
        }
    }

    public class SharedPhotoVideoAdapter extends RecyclerListView.FastScrollAdapter {
        private boolean inFastScrollMode;
        private Context mContext;
        SharedPhotoVideoCell2.SharedResources sharedResources;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        public int getPositionForIndex(int i) {
            return SharedMediaLayout.this.sharedMediaData[0].startOffset + i;
        }

        @Override
        public int getItemCount() {
            if (DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                    return 1;
                }
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && (!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1])) {
                    return 0;
                }
                int startOffset = SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
                return startOffset != 0 ? (!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? startOffset + 1 : startOffset : startOffset;
            } else if (SharedMediaLayout.this.sharedMediaData[0].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[0].totalCount;
            } else {
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                    return 1;
                }
                if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1]) && SharedMediaLayout.this.sharedMediaData[0].startReached)) {
                    return 0;
                }
                if (SharedMediaLayout.this.sharedMediaData[0].totalCount != 0) {
                    return SharedMediaLayout.this.sharedMediaData[0].totalCount;
                }
                int startOffset2 = SharedMediaLayout.this.sharedMediaData[0].getStartOffset() + SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
                return startOffset2 != 0 ? (!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() != 0 ? startOffset2 + SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() : startOffset2 + 1 : startOffset2 : startOffset2;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 0, SharedMediaLayout.this.dialog_id);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext());
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.mContext, this.sharedResources, SharedMediaLayout.this.profileActivity.getCurrentAccount());
            sharedPhotoVideoCell2.setGradientView(SharedMediaLayout.this.globalGradientView);
            sharedPhotoVideoCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedPhotoVideoCell2);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                boolean z = false;
                ArrayList<MessageObject> messages = SharedMediaLayout.this.sharedMediaData[0].getMessages();
                int startOffset = i - SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) viewHolder.itemView;
                int messageId = sharedPhotoVideoCell2.getMessageId();
                int i2 = this == SharedMediaLayout.this.photoVideoAdapter ? SharedMediaLayout.this.mediaColumnsCount : SharedMediaLayout.this.animateToColumnsCount;
                if (startOffset < 0 || startOffset >= messages.size()) {
                    sharedPhotoVideoCell2.setMessageObject(null, i2);
                    sharedPhotoVideoCell2.setChecked(false, false);
                    return;
                }
                MessageObject messageObject = messages.get(startOffset);
                boolean z2 = messageObject.getId() == messageId;
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    sharedPhotoVideoCell2.setChecked(z, z2);
                } else {
                    sharedPhotoVideoCell2.setChecked(false, z2);
                }
                sharedPhotoVideoCell2.setMessageObject(messageObject, i2);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (!this.inFastScrollMode && SharedMediaLayout.this.sharedMediaData[0].getMessages().size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading && SharedMediaLayout.this.sharedMediaData[0].startReached) {
                return 2;
            }
            SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            SharedMediaLayout.this.sharedMediaData[0].getMessages().size();
            SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            return 0;
        }

        @Override
        public String getLetter(int i) {
            if (SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods == null) {
                return "";
            }
            ArrayList<Period> arrayList = SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods;
            if (arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= arrayList.get(i2).startOffset) {
                    return arrayList.get(i2).formatedDate;
                }
            }
            return arrayList.get(arrayList.size() - 1).formatedDate;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            double d;
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            double ceil = Math.ceil(getTotalItemsCount() / SharedMediaLayout.this.mediaColumnsCount);
            Double.isNaN(measuredHeight);
            float measuredHeight2 = f * (((int) (ceil * d)) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
            iArr[0] = ((int) (measuredHeight2 / measuredHeight)) * SharedMediaLayout.this.mediaColumnsCount;
            iArr[1] = ((int) measuredHeight2) % measuredHeight;
        }

        @Override
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(0);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int i = 0;
                    for (int i2 = 0; i2 < recyclerListView.getChildCount(); i2++) {
                        View childAt = recyclerListView.getChildAt(i2);
                        if (childAt instanceof SharedPhotoVideoCell2) {
                            i = ((SharedPhotoVideoCell2) childAt).getMessageId();
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    if (i == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(0, recyclerListView, true);
                    }
                }
            }
        }

        @Override
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[0].totalCount;
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            int i = this == SharedMediaLayout.this.photoVideoAdapter ? SharedMediaLayout.this.mediaColumnsCount : SharedMediaLayout.this.animateToColumnsCount;
            int ceil = (int) Math.ceil(getTotalItemsCount() / i);
            if (recyclerListView.getChildCount() == 0) {
                return 0.0f;
            }
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            View childAt = recyclerListView.getChildAt(0);
            int childAdapterPosition = recyclerListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition < 0) {
                return 0.0f;
            }
            return (((childAdapterPosition / i) * measuredHeight) - (childAt.getTop() - recyclerListView.getPaddingTop())) / ((ceil * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
        }

        @Override
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return recyclerListView.getChildCount() != 0 && ((int) Math.ceil((double) (((float) getTotalItemsCount()) / ((float) (this == SharedMediaLayout.this.photoVideoAdapter ? SharedMediaLayout.this.mediaColumnsCount : SharedMediaLayout.this.animateToColumnsCount))))) * recyclerListView.getChildAt(0).getMeasuredHeight() > recyclerListView.getMeasuredHeight();
        }

        @Override
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(true);
        }
    }

    public void findPeriodAndJumpToDate(int i, RecyclerListView recyclerListView, boolean z) {
        ArrayList<Period> arrayList = this.sharedMediaData[i].fastScrollPeriods;
        int findFirstVisibleItemPosition = ((LinearLayoutManager) recyclerListView.getLayoutManager()).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition >= 0) {
            Period period = null;
            if (arrayList != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        break;
                    } else if (findFirstVisibleItemPosition <= arrayList.get(i2).startOffset) {
                        period = arrayList.get(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                if (period == null) {
                    period = arrayList.get(arrayList.size() - 1);
                }
            }
            if (period != null) {
                jumpToDate(i, period.maxId, period.startOffset + 1, z);
            }
        }
    }

    public void jumpToDate(int i, int i2, int i3, boolean z) {
        this.sharedMediaData[i].messages.clear();
        this.sharedMediaData[i].messagesDict[0].clear();
        this.sharedMediaData[i].messagesDict[1].clear();
        this.sharedMediaData[i].setMaxId(0, i2);
        this.sharedMediaData[i].setEndReached(0, false);
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
        sharedMediaDataArr[i].startReached = false;
        sharedMediaDataArr[i].startOffset = i3;
        SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
        sharedMediaDataArr2[i].endLoadingStubs = (sharedMediaDataArr2[i].totalCount - i3) - 1;
        if (this.sharedMediaData[i].endLoadingStubs < 0) {
            this.sharedMediaData[i].endLoadingStubs = 0;
        }
        SharedMediaData[] sharedMediaDataArr3 = this.sharedMediaData;
        sharedMediaDataArr3[i].min_id = i2;
        sharedMediaDataArr3[i].loadingAfterFastScroll = true;
        sharedMediaDataArr3[i].loading = false;
        sharedMediaDataArr3[i].requestIndex++;
        MediaPage mediaPage = getMediaPage(i);
        if (!(mediaPage == null || mediaPage.listView.getAdapter() == null)) {
            mediaPage.listView.getAdapter().notifyDataSetChanged();
        }
        if (z) {
            int i4 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i4 < mediaPageArr.length) {
                    if (mediaPageArr[i4].selectedType == i) {
                        ExtendedGridLayoutManager extendedGridLayoutManager = this.mediaPages[i4].layoutManager;
                        SharedMediaData[] sharedMediaDataArr4 = this.sharedMediaData;
                        extendedGridLayoutManager.scrollToPositionWithOffset(Math.min(sharedMediaDataArr4[i].totalCount - 1, sharedMediaDataArr4[i].startOffset), 0);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public class MediaSearchAdapter extends RecyclerListView.SelectionAdapter {
        private int currentType;
        private int lastReqId;
        private Context mContext;
        private Runnable searchRunnable;
        private int searchesInProgress;
        private ArrayList<MessageObject> searchResult = new ArrayList<>();
        protected ArrayList<MessageObject> globalSearch = new ArrayList<>();
        private int reqId = 0;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        public MediaSearchAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        public void queryServerSearch(String str, final int i, long j) {
            if (!DialogObject.isEncryptedDialog(j)) {
                if (this.reqId != 0) {
                    SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                    this.reqId = 0;
                    this.searchesInProgress--;
                }
                if (str == null || str.length() == 0) {
                    this.globalSearch.clear();
                    this.lastReqId = 0;
                    notifyDataSetChanged();
                    return;
                }
                TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
                tLRPC$TL_messages_search.limit = 50;
                tLRPC$TL_messages_search.offset_id = i;
                int i2 = this.currentType;
                if (i2 == 1) {
                    tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterDocument();
                } else if (i2 == 3) {
                    tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterUrl();
                } else if (i2 == 4) {
                    tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterMusic();
                }
                tLRPC$TL_messages_search.q = str;
                TLRPC$InputPeer inputPeer = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j);
                tLRPC$TL_messages_search.peer = inputPeer;
                if (inputPeer != null) {
                    final int i3 = this.lastReqId + 1;
                    this.lastReqId = i3;
                    this.searchesInProgress++;
                    this.reqId = SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            SharedMediaLayout.MediaSearchAdapter.this.lambda$queryServerSearch$1(i, i3, tLObject, tLRPC$TL_error);
                        }
                    }, 2);
                    SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(this.reqId, SharedMediaLayout.this.profileActivity.getClassGuid());
                }
            }
        }

        public void lambda$queryServerSearch$1(int i, final int i2, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            final ArrayList arrayList = new ArrayList();
            if (tLRPC$TL_error == null) {
                TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                for (int i3 = 0; i3 < tLRPC$messages_Messages.messages.size(); i3++) {
                    TLRPC$Message tLRPC$Message = tLRPC$messages_Messages.messages.get(i3);
                    if (i == 0 || tLRPC$Message.id <= i) {
                        arrayList.add(new MessageObject(SharedMediaLayout.this.profileActivity.getCurrentAccount(), tLRPC$Message, false, true));
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.MediaSearchAdapter.this.lambda$queryServerSearch$0(i2, arrayList);
                }
            });
        }

        public void lambda$queryServerSearch$0(int i, ArrayList arrayList) {
            if (this.reqId != 0) {
                if (i == this.lastReqId) {
                    int itemCount = getItemCount();
                    this.globalSearch = arrayList;
                    this.searchesInProgress--;
                    int itemCount2 = getItemCount();
                    if (this.searchesInProgress == 0 || itemCount2 != 0) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                    for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                        if (SharedMediaLayout.this.mediaPages[i2].selectedType == this.currentType) {
                            if (this.searchesInProgress == 0 && itemCount2 == 0) {
                                SharedMediaLayout.this.mediaPages[i2].emptyView.showProgress(false, true);
                            } else if (itemCount == 0) {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i2].listView, 0, null);
                            }
                        }
                    }
                    notifyDataSetChanged();
                }
                this.reqId = 0;
            }
        }

        public void search(final String str, boolean z) {
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            if (!this.searchResult.isEmpty() || !this.globalSearch.isEmpty()) {
                this.searchResult.clear();
                this.globalSearch.clear();
                notifyDataSetChanged();
            }
            if (!TextUtils.isEmpty(str)) {
                for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                    if (SharedMediaLayout.this.mediaPages[i].selectedType == this.currentType) {
                        SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                    }
                }
                Runnable sharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda1 = new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.MediaSearchAdapter.this.lambda$search$3(str);
                    }
                };
                this.searchRunnable = sharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda1;
                AndroidUtilities.runOnUIThread(sharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda1, 300L);
            } else if (!this.searchResult.isEmpty() || !this.globalSearch.isEmpty() || this.searchesInProgress != 0) {
                this.searchResult.clear();
                this.globalSearch.clear();
                if (this.reqId != 0) {
                    SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                    this.reqId = 0;
                    this.searchesInProgress--;
                }
            }
        }

        public void lambda$search$3(final String str) {
            int i;
            if (!SharedMediaLayout.this.sharedMediaData[this.currentType].messages.isEmpty() && ((i = this.currentType) == 1 || i == 4)) {
                MessageObject messageObject = SharedMediaLayout.this.sharedMediaData[this.currentType].messages.get(SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() - 1);
                queryServerSearch(str, messageObject.getId(), messageObject.getDialogId());
            } else if (this.currentType == 3) {
                queryServerSearch(str, 0, SharedMediaLayout.this.dialog_id);
            }
            int i2 = this.currentType;
            if (i2 == 1 || i2 == 4) {
                final ArrayList arrayList = new ArrayList(SharedMediaLayout.this.sharedMediaData[this.currentType].messages);
                this.searchesInProgress++;
                Utilities.searchQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.MediaSearchAdapter.this.lambda$search$2(str, arrayList);
                    }
                });
            }
        }

        public void lambda$search$2(String str, ArrayList arrayList) {
            TLRPC$Document tLRPC$Document;
            boolean z;
            String str2;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>());
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString) || translitString.length() == 0) {
                translitString = null;
            }
            int i = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<MessageObject> arrayList2 = new ArrayList<>();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i2);
                int i3 = 0;
                while (true) {
                    if (i3 < i) {
                        String str3 = strArr[i3];
                        String documentName = messageObject.getDocumentName();
                        if (!(documentName == null || documentName.length() == 0)) {
                            if (!documentName.toLowerCase().contains(str3)) {
                                if (this.currentType == 4) {
                                    if (messageObject.type == 0) {
                                        tLRPC$Document = messageObject.messageOwner.media.webpage.document;
                                    } else {
                                        tLRPC$Document = messageObject.messageOwner.media.document;
                                    }
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= tLRPC$Document.attributes.size()) {
                                            z = false;
                                            break;
                                        }
                                        TLRPC$DocumentAttribute tLRPC$DocumentAttribute = tLRPC$Document.attributes.get(i4);
                                        if (tLRPC$DocumentAttribute instanceof TLRPC$TL_documentAttributeAudio) {
                                            String str4 = tLRPC$DocumentAttribute.performer;
                                            z = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                            if (!z && (str2 = tLRPC$DocumentAttribute.title) != null) {
                                                z = str2.toLowerCase().contains(str3);
                                            }
                                        } else {
                                            i4++;
                                        }
                                    }
                                    if (z) {
                                        arrayList2.add(messageObject);
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                arrayList2.add(messageObject);
                                break;
                            }
                        }
                        i3++;
                    }
                }
            }
            updateSearchResults(arrayList2);
        }

        private void updateSearchResults(final ArrayList<MessageObject> arrayList) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.MediaSearchAdapter.this.lambda$updateSearchResults$4(arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList) {
            if (SharedMediaLayout.this.searching) {
                this.searchesInProgress--;
                int itemCount = getItemCount();
                this.searchResult = arrayList;
                int itemCount2 = getItemCount();
                if (this.searchesInProgress == 0 || itemCount2 != 0) {
                    SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                }
                for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                    if (SharedMediaLayout.this.mediaPages[i].selectedType == this.currentType) {
                        if (this.searchesInProgress == 0 && itemCount2 == 0) {
                            SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(false, true);
                        } else if (itemCount == 0) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i].listView, 0, null);
                        }
                    }
                }
                notifyDataSetChanged();
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != this.searchResult.size() + this.globalSearch.size();
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.globalSearch.size();
            return size2 != 0 ? size + size2 : size;
        }

        public MessageObject getItem(int i) {
            if (i < this.searchResult.size()) {
                return this.searchResult.get(i);
            }
            return this.globalSearch.get(i - this.searchResult.size());
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SharedDocumentCell sharedDocumentCell;
            int i2 = this.currentType;
            if (i2 == 1) {
                sharedDocumentCell = new SharedDocumentCell(this.mContext);
            } else if (i2 == 4) {
                sharedDocumentCell = new SharedAudioCell(this.mContext) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                            boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(playMessage ? MediaSearchAdapter.this.searchResult : null, false);
                            if (messageObject.isRoundVideo()) {
                                MediaController.getInstance().setCurrentVideoVisible(false);
                            }
                            return playMessage;
                        } else if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(MediaSearchAdapter.this.searchResult, messageObject, SharedMediaLayout.this.mergeDialogId);
                        } else {
                            return false;
                        }
                    }
                };
            } else {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                sharedDocumentCell = sharedLinkCell;
            }
            sharedDocumentCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedDocumentCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = this.currentType;
            boolean z = false;
            if (i2 == 1) {
                SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) viewHolder.itemView;
                MessageObject item = getItem(i);
                sharedDocumentCell.setDocument(item, i != getItemCount() - 1);
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[item.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(item.getId()) >= 0) {
                        z = true;
                    }
                    sharedDocumentCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                    return;
                }
                sharedDocumentCell.setChecked(false, !SharedMediaLayout.this.scrolling);
            } else if (i2 == 3) {
                SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
                MessageObject item2 = getItem(i);
                sharedLinkCell.setLink(item2, i != getItemCount() - 1);
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[item2.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(item2.getId()) >= 0) {
                        z = true;
                    }
                    sharedLinkCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                    return;
                }
                sharedLinkCell.setChecked(false, !SharedMediaLayout.this.scrolling);
            } else if (i2 == 4) {
                SharedAudioCell sharedAudioCell = (SharedAudioCell) viewHolder.itemView;
                MessageObject item3 = getItem(i);
                sharedAudioCell.setMessageObject(item3, i != getItemCount() - 1);
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[item3.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(item3.getId()) >= 0) {
                        z = true;
                    }
                    sharedAudioCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                    return;
                }
                sharedAudioCell.setChecked(false, !SharedMediaLayout.this.scrolling);
            }
        }
    }

    public class GifAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public long getItemId(int i) {
            return i;
        }

        public GifAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading;
        }

        @Override
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) {
                return SharedMediaLayout.this.sharedMediaData[5].messages.size();
            }
            return 1;
        }

        @Override
        public int getItemViewType(int i) {
            return (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) ? 0 : 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 5, SharedMediaLayout.this.dialog_id);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            ContextLinkCell contextLinkCell = new ContextLinkCell(this.mContext, true);
            contextLinkCell.setCanPreviewGif(true);
            return new RecyclerListView.Holder(contextLinkCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            TLRPC$Document document;
            if (viewHolder.getItemViewType() != 1 && (document = (messageObject = SharedMediaLayout.this.sharedMediaData[5].messages.get(i)).getDocument()) != null) {
                ContextLinkCell contextLinkCell = (ContextLinkCell) viewHolder.itemView;
                boolean z = false;
                contextLinkCell.setGif(document, messageObject, messageObject.messageOwner.date, false);
                if (SharedMediaLayout.this.isActionModeShowed) {
                    if (SharedMediaLayout.this.selectedFiles[messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0) {
                        z = true;
                    }
                    contextLinkCell.setChecked(z, !SharedMediaLayout.this.scrolling);
                    return;
                }
                contextLinkCell.setChecked(false, !SharedMediaLayout.this.scrolling);
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ImageReceiver photoImage = ((ContextLinkCell) view).getPhotoImage();
                if (SharedMediaLayout.this.mediaPages[0].selectedType == 5) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                    return;
                }
                photoImage.setAllowStartAnimation(false);
                photoImage.stopAnimation();
            }
        }
    }

    public class CommonGroupsAdapter extends RecyclerListView.SelectionAdapter {
        private ArrayList<TLRPC$Chat> chats = new ArrayList<>();
        private boolean endReached;
        private boolean firstLoaded;
        private boolean loading;
        private Context mContext;

        public CommonGroupsAdapter(Context context) {
            this.mContext = context;
        }

        public void getChats(long j, final int i) {
            long j2;
            if (!this.loading) {
                TLRPC$TL_messages_getCommonChats tLRPC$TL_messages_getCommonChats = new TLRPC$TL_messages_getCommonChats();
                if (DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id)) {
                    j2 = SharedMediaLayout.this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(SharedMediaLayout.this.dialog_id))).user_id;
                } else {
                    j2 = SharedMediaLayout.this.dialog_id;
                }
                TLRPC$InputUser inputUser = SharedMediaLayout.this.profileActivity.getMessagesController().getInputUser(j2);
                tLRPC$TL_messages_getCommonChats.user_id = inputUser;
                if (!(inputUser instanceof TLRPC$TL_inputUserEmpty)) {
                    tLRPC$TL_messages_getCommonChats.limit = i;
                    tLRPC$TL_messages_getCommonChats.max_id = j;
                    this.loading = true;
                    notifyDataSetChanged();
                    SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tLRPC$TL_messages_getCommonChats, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                            SharedMediaLayout.CommonGroupsAdapter.this.lambda$getChats$1(i, tLObject, tLRPC$TL_error);
                        }
                    }), SharedMediaLayout.this.profileActivity.getClassGuid());
                }
            }
        }

        public void lambda$getChats$1(final int i, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.CommonGroupsAdapter.this.lambda$getChats$0(tLRPC$TL_error, tLObject, i);
                }
            });
        }

        public void lambda$getChats$0(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, int i) {
            int itemCount = getItemCount();
            if (tLRPC$TL_error == null) {
                TLRPC$messages_Chats tLRPC$messages_Chats = (TLRPC$messages_Chats) tLObject;
                SharedMediaLayout.this.profileActivity.getMessagesController().putChats(tLRPC$messages_Chats.chats, false);
                this.endReached = tLRPC$messages_Chats.chats.isEmpty() || tLRPC$messages_Chats.chats.size() != i;
                this.chats.addAll(tLRPC$messages_Chats.chats);
            } else {
                this.endReached = true;
            }
            for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                if (SharedMediaLayout.this.mediaPages[i2].selectedType == 6 && SharedMediaLayout.this.mediaPages[i2].listView != null) {
                    BlurredRecyclerView blurredRecyclerView = SharedMediaLayout.this.mediaPages[i2].listView;
                    if (this.firstLoaded || itemCount == 0) {
                        SharedMediaLayout.this.animateItemsEnter(blurredRecyclerView, 0, null);
                    }
                }
            }
            this.loading = false;
            this.firstLoaded = true;
            notifyDataSetChanged();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() != this.chats.size();
        }

        @Override
        public int getItemCount() {
            if (this.chats.isEmpty() && !this.loading) {
                return 1;
            }
            int size = this.chats.size();
            return (this.chats.isEmpty() || this.endReached) ? size : size + 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ProfileSearchCell profileSearchCell;
            if (i == 0) {
                profileSearchCell = new ProfileSearchCell(this.mContext);
            } else if (i != 2) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(1);
                profileSearchCell = flickerLoadingView;
            } else {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 6, SharedMediaLayout.this.dialog_id);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ProfileSearchCell profileSearchCell = (ProfileSearchCell) viewHolder.itemView;
                profileSearchCell.setData(this.chats.get(i), null, null, null, false, false);
                boolean z = true;
                if (i == this.chats.size() - 1 && this.endReached) {
                    z = false;
                }
                profileSearchCell.useSeparator = z;
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (!this.chats.isEmpty() || this.loading) {
                return i < this.chats.size() ? 0 : 1;
            }
            return 2;
        }
    }

    public class ChatUsersAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$ChatFull chatInfo;
        private Context mContext;
        private ArrayList<Integer> sortedUsers;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public ChatUsersAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
            if (tLRPC$ChatFull != null && tLRPC$ChatFull.participants.participants.isEmpty()) {
                return 1;
            }
            TLRPC$ChatFull tLRPC$ChatFull2 = this.chatInfo;
            if (tLRPC$ChatFull2 != null) {
                return tLRPC$ChatFull2.participants.participants.size();
            }
            return 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                View createEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 7, SharedMediaLayout.this.dialog_id);
                createEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(createEmptyStubView);
            }
            UserCell userCell = new UserCell(this.mContext, 9, 0, true);
            userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC$ChatParticipant tLRPC$ChatParticipant;
            String string;
            UserCell userCell = (UserCell) viewHolder.itemView;
            if (!this.sortedUsers.isEmpty()) {
                tLRPC$ChatParticipant = this.chatInfo.participants.participants.get(this.sortedUsers.get(i).intValue());
            } else {
                tLRPC$ChatParticipant = this.chatInfo.participants.participants.get(i);
            }
            if (tLRPC$ChatParticipant != null) {
                String str = null;
                if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatChannelParticipant) {
                    TLRPC$ChannelParticipant tLRPC$ChannelParticipant = ((TLRPC$TL_chatChannelParticipant) tLRPC$ChatParticipant).channelParticipant;
                    if (!TextUtils.isEmpty(tLRPC$ChannelParticipant.rank)) {
                        string = tLRPC$ChannelParticipant.rank;
                    } else if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantCreator) {
                        string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                    } else if (tLRPC$ChannelParticipant instanceof TLRPC$TL_channelParticipantAdmin) {
                        string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                    }
                    str = string;
                } else if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantCreator) {
                    str = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                } else if (tLRPC$ChatParticipant instanceof TLRPC$TL_chatParticipantAdmin) {
                    str = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                }
                userCell.setAdminRole(str);
                TLRPC$User user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(tLRPC$ChatParticipant.user_id));
                boolean z = true;
                if (i == this.chatInfo.participants.participants.size() - 1) {
                    z = false;
                }
                userCell.setData(user, null, null, 0, z);
            }
        }

        @Override
        public int getItemViewType(int i) {
            TLRPC$ChatFull tLRPC$ChatFull = this.chatInfo;
            return (tLRPC$ChatFull == null || !tLRPC$ChatFull.participants.participants.isEmpty()) ? 0 : 1;
        }
    }

    public class GroupUsersSearchAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC$Chat currentChat;
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private int totalCount = 0;
        int searchCount = 0;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        public GroupUsersSearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i);
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i) {
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$new$0(i);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, hashMap);
                }
            });
            this.currentChat = SharedMediaLayout.this.delegate.getCurrentChat();
        }

        public void lambda$new$0(int i) {
            notifyDataSetChanged();
            if (i == 1) {
                int i2 = this.searchCount - 1;
                this.searchCount = i2;
                if (i2 == 0) {
                    for (int i3 = 0; i3 < SharedMediaLayout.this.mediaPages.length; i3++) {
                        if (SharedMediaLayout.this.mediaPages[i3].selectedType == 7) {
                            if (getItemCount() == 0) {
                                SharedMediaLayout.this.mediaPages[i3].emptyView.showProgress(false, true);
                            } else {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i3].listView, 0, null);
                            }
                        }
                    }
                }
            }
        }

        private boolean createMenuForParticipant(TLObject tLObject, boolean z) {
            if (tLObject instanceof TLRPC$ChannelParticipant) {
                TLRPC$ChannelParticipant tLRPC$ChannelParticipant = (TLRPC$ChannelParticipant) tLObject;
                TLRPC$TL_chatChannelParticipant tLRPC$TL_chatChannelParticipant = new TLRPC$TL_chatChannelParticipant();
                tLRPC$TL_chatChannelParticipant.channelParticipant = tLRPC$ChannelParticipant;
                tLRPC$TL_chatChannelParticipant.user_id = MessageObject.getPeerId(tLRPC$ChannelParticipant.peer);
                tLRPC$TL_chatChannelParticipant.inviter_id = tLRPC$ChannelParticipant.inviter_id;
                tLRPC$TL_chatChannelParticipant.date = tLRPC$ChannelParticipant.date;
                tLObject = tLRPC$TL_chatChannelParticipant;
            }
            return SharedMediaLayout.this.delegate.onMemberClick((TLRPC$ChatParticipant) tLObject, true, z);
        }

        public void search(final String str, boolean z) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 0);
            notifyDataSetChanged();
            for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                if (SharedMediaLayout.this.mediaPages[i].selectedType == 7 && !TextUtils.isEmpty(str)) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                }
            }
            if (!TextUtils.isEmpty(str)) {
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                Runnable sharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0 = new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$search$1(str);
                    }
                };
                this.searchRunnable = sharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0;
                dispatchQueue.postRunnable(sharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0, 300L);
            }
        }

        public void lambda$search$1(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$processSearch$3(str);
                }
            });
        }

        public void lambda$processSearch$3(final String str) {
            final ArrayList arrayList = null;
            this.searchRunnable = null;
            if (!ChatObject.isChannel(this.currentChat) && SharedMediaLayout.this.info != null) {
                arrayList = new ArrayList(SharedMediaLayout.this.info.participants.participants);
            }
            this.searchCount = 2;
            if (arrayList != null) {
                Utilities.searchQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$processSearch$2(str, arrayList);
                    }
                });
            } else {
                this.searchCount = 2 - 1;
            }
            this.searchAdapterHelper.queryServerSearch(str, false, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 1);
        }

        public void lambda$processSearch$2(java.lang.String r19, java.util.ArrayList r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.GroupUsersSearchAdapter.lambda$processSearch$2(java.lang.String, java.util.ArrayList):void");
        }

        private void updateSearchResults(final ArrayList<CharSequence> arrayList, final ArrayList<TLObject> arrayList2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$updateSearchResults$4(arrayList, arrayList2);
                }
            });
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList, ArrayList arrayList2) {
            if (SharedMediaLayout.this.searching) {
                this.searchResultNames = arrayList;
                this.searchCount--;
                if (!ChatObject.isChannel(this.currentChat)) {
                    ArrayList<TLObject> groupSearch = this.searchAdapterHelper.getGroupSearch();
                    groupSearch.clear();
                    groupSearch.addAll(arrayList2);
                }
                if (this.searchCount == 0) {
                    for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                        if (SharedMediaLayout.this.mediaPages[i].selectedType == 7) {
                            if (getItemCount() == 0) {
                                SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(false, true);
                            } else {
                                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                                sharedMediaLayout.animateItemsEnter(sharedMediaLayout.mediaPages[i].listView, 0, null);
                            }
                        }
                    }
                }
                notifyDataSetChanged();
            }
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public int getItemCount() {
            return this.totalCount;
        }

        @Override
        public void notifyDataSetChanged() {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            this.totalCount = size;
            if (size > 0 && SharedMediaLayout.this.searching && SharedMediaLayout.this.mediaPages[0].selectedType == 7 && SharedMediaLayout.this.mediaPages[0].listView.getAdapter() != this) {
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
            }
            super.notifyDataSetChanged();
        }

        public TLObject getItem(int i) {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (i < 0 || i >= size) {
                return null;
            }
            return this.searchAdapterHelper.getGroupSearch().get(i);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 9, 5, true);
            manageChatUserCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            manageChatUserCell.setDelegate(new ManageChatUserCell.ManageChatUserCellDelegate() {
                @Override
                public final boolean onOptionsButtonCheck(ManageChatUserCell manageChatUserCell2, boolean z) {
                    boolean lambda$onCreateViewHolder$5;
                    lambda$onCreateViewHolder$5 = SharedMediaLayout.GroupUsersSearchAdapter.this.lambda$onCreateViewHolder$5(manageChatUserCell2, z);
                    return lambda$onCreateViewHolder$5;
                }
            });
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        public boolean lambda$onCreateViewHolder$5(ManageChatUserCell manageChatUserCell, boolean z) {
            TLObject item = getItem(((Integer) manageChatUserCell.getTag()).intValue());
            if (item instanceof TLRPC$ChannelParticipant) {
                return createMenuForParticipant((TLRPC$ChannelParticipant) item, !z);
            }
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC$User tLRPC$User;
            SpannableStringBuilder spannableStringBuilder;
            TLObject item = getItem(i);
            if (item instanceof TLRPC$ChannelParticipant) {
                tLRPC$User = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC$ChannelParticipant) item).peer)));
            } else if (item instanceof TLRPC$ChatParticipant) {
                tLRPC$User = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(((TLRPC$ChatParticipant) item).user_id));
            } else {
                return;
            }
            String str = tLRPC$User.username;
            this.searchAdapterHelper.getGroupSearch().size();
            String lastFoundChannel = this.searchAdapterHelper.getLastFoundChannel();
            if (lastFoundChannel != null) {
                String userName = UserObject.getUserName(tLRPC$User);
                spannableStringBuilder = new SpannableStringBuilder(userName);
                int indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, lastFoundChannel);
                if (indexOfIgnoreCase != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor("windowBackgroundWhiteBlueText4")), indexOfIgnoreCase, lastFoundChannel.length() + indexOfIgnoreCase, 33);
                }
            } else {
                spannableStringBuilder = null;
            }
            ManageChatUserCell manageChatUserCell = (ManageChatUserCell) viewHolder.itemView;
            manageChatUserCell.setTag(Integer.valueOf(i));
            manageChatUserCell.setData(tLRPC$User, spannableStringBuilder, null, false);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).recycle();
            }
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.selectedMessagesCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.shadowLine, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.deleteItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.deleteItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "actionBarActionModeDefaultSelector"));
        if (this.gotoItem != null) {
            arrayList.add(new ThemeDescription(this.gotoItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
            arrayList.add(new ThemeDescription(this.gotoItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "actionBarActionModeDefaultSelector"));
        }
        if (this.forwardItem != null) {
            arrayList.add(new ThemeDescription(this.forwardItem.getIconView(), ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
            arrayList.add(new ThemeDescription(this.forwardItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "actionBarActionModeDefaultSelector"));
        }
        arrayList.add(new ThemeDescription(this.closeButton, ThemeDescription.FLAG_IMAGECOLOR, null, null, new Drawable[]{this.backDrawable}, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.closeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "actionBarActionModeDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionModeLayout, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, "chat_mediaTimeBackground"));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, "chat_mediaTimeText"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "profile_tabSelectedLine"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, "profile_tabSelectedText"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextView.class}, null, null, null, "profile_tabText"));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{TextView.class}, null, null, null, "profile_tabSelector"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerBackground"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerPlayPause"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerTitle"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_FASTSCROLL, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerPerformer"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "inappPlayerClose"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "returnToCallBackground"));
        arrayList.add(new ThemeDescription(this.fragmentContextView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "returnToCallText"));
        for (final int i = 0; i < this.mediaPages.length; i++) {
            ThemeDescription.ThemeDescriptionDelegate sharedMediaLayout$$ExternalSyntheticLambda13 = new ThemeDescription.ThemeDescriptionDelegate() {
                @Override
                public final void didSetColor() {
                    SharedMediaLayout.this.lambda$getThemeDescriptions$17(i);
                }

                @Override
                public void onAnimationProgress(float f) {
                    ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
                }
            };
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].progressView, 0, null, null, null, null, "windowBackgroundWhite"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "emptyListPlaceholder"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "key_graySectionText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{GraySectionCell.class}, null, null, null, "graySection"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "progressCircle"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{UserCell.class}, new String[]{"adminTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "profile_creatorIcon"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayIcon"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, sharedMediaLayout$$ExternalSyntheticLambda13, "windowBackgroundWhiteGrayText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, sharedMediaLayout$$ExternalSyntheticLambda13, "windowBackgroundWhiteBlueText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, "avatar_text"));
            TextPaint[] textPaintArr = Theme.dialogs_namePaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_name"));
            TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "chats_secretName"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{ProfileSearchCell.class}, null, Theme.avatarDrawables, null, "avatar_text"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundRed"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundOrange"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundViolet"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundGreen"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundCyan"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundBlue"));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "avatar_backgroundPink"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EmptyStubView.class}, new String[]{"emptyTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText2"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_PROGRESSBAR, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_startStopLoadIcon"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_startStopLoadIcon"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_folderIcon"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "files_iconText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "progressCircle"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, "windowBackgroundWhiteGrayText2"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkbox"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "checkboxCheck"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{SharedLinkCell.class}, null, null, null, "windowBackgroundWhiteLinkText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, "windowBackgroundWhiteLinkSelection"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_linkPlaceholderText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_linkPlaceholder"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR | ThemeDescription.FLAG_SECTIONS, new Class[]{SharedMediaSectionCell.class}, null, null, null, "windowBackgroundWhite"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_SECTIONS, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{SharedPhotoVideoCell.class}, new String[]{"backgroundPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_photoPlaceholder"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedPhotoVideoCell.class}, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "checkbox"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedPhotoVideoCell.class}, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "checkboxCheck"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, new Class[]{ContextLinkCell.class}, new String[]{"backgroundPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "sharedMedia_photoPlaceholder"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{ContextLinkCell.class}, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "checkbox"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{ContextLinkCell.class}, null, null, sharedMediaLayout$$ExternalSyntheticLambda13, "checkboxCheck"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].listView, 0, null, null, new Drawable[]{this.pinnedHeaderShadowDrawable}, null, "windowBackgroundGrayShadow"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].emptyView.title, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
            arrayList.add(new ThemeDescription(this.mediaPages[i].emptyView.subtitle, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText"));
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$17(int i) {
        if (this.mediaPages[i].listView != null) {
            int childCount = this.mediaPages[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) childAt).updateCheckboxColor();
                } else if (childAt instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) childAt).update(0);
                } else if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view != this.fragmentContextView) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, this.mediaPages[0].getTop(), view.getMeasuredWidth(), this.mediaPages[0].getTop() + view.getMeasuredHeight() + AndroidUtilities.dp(12.0f));
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public class ScrollSlidingTextTabStripInner extends ScrollSlidingTextTabStrip {
        public int backgroundColor = 0;
        protected Paint backgroundPaint;

        public ScrollSlidingTextTabStripInner(Context context) {
            super(context);
        }

        protected void drawBackground(Canvas canvas) {
            if (SharedConfig.chatBlurEnabled() && this.backgroundColor != 0) {
                if (this.backgroundPaint == null) {
                    this.backgroundPaint = new Paint();
                }
                this.backgroundPaint.setColor(this.backgroundColor);
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                SharedMediaLayout.this.drawBackgroundWithBlur(canvas, getY(), rect, this.backgroundPaint);
            }
        }

        @Override
        public void setBackgroundColor(int i) {
            this.backgroundColor = i;
            invalidate();
        }
    }
}
