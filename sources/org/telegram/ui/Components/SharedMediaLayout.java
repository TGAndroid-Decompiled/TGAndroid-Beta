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
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcv;
import com.google.android.gms.internal.mlkit_language_id_common.zzin;
import com.google.android.gms.internal.mlkit_vision_common.zzkd;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaController$$ExternalSyntheticOutline1;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesController$DialogFilter$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda80;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticOutline0;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda7;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.ContextLinkCell;
import org.telegram.ui.Cells.DialogCell;
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
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda48;
import org.telegram.ui.ChatActivityContainer;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.IntroActivity$$ExternalSyntheticLambda5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity2;
import org.telegram.ui.ProfileStoriesCollectionTabs;
import org.telegram.ui.SelectStoriesBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StealthModeAlert$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TopicsFragment;

public class SharedMediaLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, DialogCell.DialogCellDelegate {
    public static final int FILTER_PHOTOS_AND_VIDEOS = 0;
    public static final int FILTER_PHOTOS_ONLY = 1;
    public static final int FILTER_VIDEOS_ONLY = 2;
    public static final int TAB_ARCHIVED_STORIES = 9;
    public static final int TAB_AUDIO = 4;
    public static final int TAB_BOT_PREVIEWS = 13;
    public static final int TAB_COMMON_GROUPS = 6;
    public static final int TAB_FILES = 1;
    public static final int TAB_GIF = 5;
    public static final int TAB_GIFTS = 14;
    public static final int TAB_GROUPUSERS = 7;
    public static final int TAB_LINKS = 3;
    public static final int TAB_PHOTOVIDEO = 0;
    public static final int TAB_POLL = 15;
    public static final int TAB_RECOMMENDED_CHANNELS = 10;
    public static final int TAB_SAVED_DIALOGS = 11;
    public static final int TAB_SAVED_MESSAGES = 12;
    public static final int TAB_STORIES = 8;
    private static final int TAB_STORIES_ALBUM_MASK = 65535;
    private static final int TAB_STORIES_ALBUM_PREFIX = 65536;
    public static final int TAB_VOICE = 2;
    public static final int VIEW_TYPE_AUDIO = 10;
    public static final int VIEW_TYPE_DOCUMENT = 7;
    public static final int VIEW_TYPE_DOCUMENT_EMPTY = 9;
    public static final int VIEW_TYPE_DOCUMENT_LOADING = 8;
    public static final int VIEW_TYPE_GIF = 12;
    public static final int VIEW_TYPE_GIF_LOADING = 11;
    public static final int VIEW_TYPE_GROUP = 14;
    public static final int VIEW_TYPE_GROUPUSER = 21;
    public static final int VIEW_TYPE_GROUPUSER_EMPTY = 20;
    public static final int VIEW_TYPE_GROUP_EMPTY = 15;
    public static final int VIEW_TYPE_GROUP_LOADING = 16;
    public static final int VIEW_TYPE_LINK = 4;
    public static final int VIEW_TYPE_LINK_DATE = 3;
    public static final int VIEW_TYPE_LINK_EMPTY = 5;
    public static final int VIEW_TYPE_LINK_LOADING = 6;
    public static final int VIEW_TYPE_MEDIA_ACTIVITY = 0;
    public static final int VIEW_TYPE_PHOTOVIDEO = 0;
    public static final int VIEW_TYPE_PHOTOVIDEO_LOADING = 2;
    public static final int VIEW_TYPE_PROFILE_ACTIVITY = 1;
    public static final int VIEW_TYPE_SAVED_DIALOG = 13;
    public static final int VIEW_TYPE_SEARCH_DOCUMENT = 24;
    public static final int VIEW_TYPE_SEARCH_GROUPUSER = 22;
    public static final int VIEW_TYPE_SEARCH_SAVED_DIALOG = 23;
    public static final int VIEW_TYPE_SIMILAR_CHANNEL = 17;
    public static final int VIEW_TYPE_SIMILAR_CHANNEL_BLOCK = 18;
    public static final int VIEW_TYPE_STORY = 19;
    private static final int delete = 101;
    private static final int forward = 100;
    private static final int gotochat = 102;
    private static final int pin = 103;
    private static final int unpin = 104;
    private ActionBar actionBar;
    private AnimatorSet actionModeAnimation;
    private LinearLayout actionModeLayout;
    private ArrayList<View> actionModeViews;
    private SpannableStringBuilder addPostButton;
    private float additionalFloatingTranslation;
    private boolean allowStoriesSingleColumn;
    private int animateToColumnsCount;
    private boolean animatingForward;
    private boolean animatingToOptions;
    private StoriesAdapter animationSupportingArchivedStoriesAdapter;
    private SharedPhotoVideoAdapter animationSupportingPhotoVideoAdapter;
    private StoriesAdapter animationSupportingStoriesAdapter;
    private Runnable applyBulletin;
    private StoriesAdapter archivedStoriesAdapter;
    private SharedDocumentsAdapter audioAdapter;
    private ArrayList<SharedAudioCell> audioCache;
    private ArrayList<SharedAudioCell> audioCellCache;
    private MediaSearchAdapter audioSearchAdapter;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private Paint backgroundPaint;
    private BotPreviewsEditContainer botPreviewsContainer;
    private ArrayList<SharedPhotoVideoCell> cache;
    private int cantDeleteMessagesCount;
    private ArrayList<SharedPhotoVideoCell> cellCache;
    private int changeColumnsTab;
    private boolean changeTypeAnimation;
    private ChannelRecommendationsAdapter channelRecommendationsAdapter;
    private ChatUsersAdapter chatUsersAdapter;
    private ImageView closeButton;
    private CommonGroupsAdapter commonGroupsAdapter;
    final Delegate delegate;
    private ActionBarMenuItem deleteItem;
    private long dialog_id;
    private boolean disableScrolling;
    private SharedDocumentsAdapter documentsAdapter;
    private MediaSearchAdapter documentsSearchAdapter;
    private int firstTab;
    private AnimatorSet floatingDateAnimation;
    private ChatActionCell floatingDateView;
    private ActionBarMenuItem forwardItem;
    private FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private HintView fwdRestrictedHint;
    private GifAdapter gifAdapter;
    public ProfileGiftsContainer giftsContainer;
    private long giftsLastHash;
    FlickerLoadingView globalGradientView;
    private ActionBarMenuItem gotoItem;
    private GroupUsersSearchAdapter groupUsersSearchAdapter;
    private int[] hasMedia;
    private Runnable hideFloatingDateRunnable;
    public final IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private boolean ignoreSearchCollapse;
    private TLRPC.ChatFull info;
    private int initialTab;
    protected boolean isActionModeShowed;
    boolean isInPinchToZoomTouchMode;
    boolean isPinnedToTop;
    Runnable jumpToRunnable;
    int lastMeasuredTopPadding;
    private int lastVisibleHeight;
    private SharedLinksAdapter linksAdapter;
    private MediaSearchAdapter linksSearchAdapter;
    private int maximumVelocity;
    boolean maybePinchToZoomTouchMode;
    boolean maybePinchToZoomTouchMode2;
    private boolean maybeStartTracking;
    private int[] mediaColumnsCount;
    private MediaPage[] mediaPages;
    private long mergeDialogId;
    SparseArray<Float> messageAlphaEnter;
    AnimationNotificationsLocker notificationsLocker;
    private final NotificationCenter.ObserversGroup observersGroup;
    private float optionsAlpha;
    private RLottieImageView optionsSearchImageView;
    private int pagesPaddingBottom;
    private SharedPhotoVideoAdapter photoVideoAdapter;
    private boolean photoVideoChangeColumnsAnimation;
    private float photoVideoChangeColumnsProgress;
    public ImageView photoVideoOptionsItem;
    private ActionBarMenuItem pinItem;
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
    private PollAdapter pollAdapter;
    private BaseFragment profileActivity;
    private PhotoViewer.PhotoViewerProvider provider;
    Rect rect;
    private Theme.ResourcesProvider resourcesProvider;
    public TextView saveItem;
    private SavedDialogsAdapter savedDialogsAdapter;
    private ChatActivityContainer savedMessagesContainer;
    private SavedMessagesSearchAdapter savedMessagesSearchAdapter;
    public ScrollSlidingTextTabStripInner scrollSlidingTextTabStrip;
    private boolean scrolling;
    public boolean scrollingByUser;
    private float searchAlpha;
    private ActionBarMenuItem searchItem;
    public ActionBarMenuItem searchItemIcon;
    private int searchItemState;
    public StoriesController.StoriesList searchStoriesList;
    public SearchTagsList searchTagsList;
    private boolean searchWas;
    private boolean searching;
    private ReactionsLayoutInBubble.VisibleReaction searchingReaction;
    private SparseArray<MessageObject>[] selectedFiles;
    private NumberTextView selectedMessagesCountTextView;
    SharedLinkCell.SharedLinkCellDelegate sharedLinkCellDelegate;
    private SharedMediaData[] sharedMediaData;
    private SharedMediaPreloader sharedMediaPreloader;
    private float shiftDp;
    private boolean startedTracking;
    private int startedTrackingPointerId;
    private int startedTrackingX;
    private int startedTrackingY;
    private StoriesAdapter storiesAdapter;
    private boolean storiesColumnsCountSet;
    public ProfileStoriesCollectionTabs storiesContainer;
    private ItemTouchHelper storiesReorder;
    private final HashMap<Integer, StoryAlbumData> storyAlbumsById;
    private final HashMap<Integer, Integer> storyAlbumsByTabType;
    private float subTabsVisibilityFactor;
    private int tabIndexCounter;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private int topLayoutPadding;
    int topPadding;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private long topicId;
    private UndoView undoView;
    private ActionBarMenuItem unpinItem;
    private TLRPC.UserFull userInfo;
    private VelocityTracker velocityTracker;
    private final int viewType;
    private SharedDocumentsAdapter voiceAdapter;
    private boolean wasReordering;
    private static final int[] supportedFastScrollTypes = {0, 1, 2, 4};
    private static final Interpolator interpolator = new ViewPagerFixed$$ExternalSyntheticLambda2(1);

    public class AnonymousClass12 extends BotPreviewsEditContainer {
        public AnonymousClass12(Context context, BaseFragment baseFragment, long j) {
            super(context, baseFragment, j);
        }

        public void lambda$unselect$0() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedMediaLayout.showActionMode(false);
            }
        }

        @Override
        public int getStartedTrackingX() {
            return SharedMediaLayout.this.startedTrackingX;
        }

        @Override
        public boolean isActionModeShowed() {
            return SharedMediaLayout.this.isActionModeShowed;
        }

        @Override
        public boolean isSelected(MessageObject messageObject) {
            return SharedMediaLayout.this.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
        }

        @Override
        public void onSelectedTabChanged() {
            SharedMediaLayout.this.onSelectedTabChanged();
        }

        @Override
        public boolean select(MessageObject messageObject) {
            if (messageObject == null) {
                return false;
            }
            char c = messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1;
            if (SharedMediaLayout.this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                return false;
            }
            if (SharedMediaLayout.this.selectedFiles[1].size() + SharedMediaLayout.this.selectedFiles[0].size() >= 100) {
                return false;
            }
            SharedMediaLayout.this.selectedFiles[c].put(messageObject.getId(), messageObject);
            if (!messageObject.canDeleteMessage(false, null)) {
                SharedMediaLayout.access$4908(SharedMediaLayout.this);
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedMediaLayout.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[1].size() + SharedMediaLayout.this.selectedFiles[0].size(), true);
            } else {
                AndroidUtilities.hideKeyboard(sharedMediaLayout.profileActivity.getParentActivity().getCurrentFocus());
                int i = 8;
                SharedMediaLayout.this.deleteItem.setVisibility(SharedMediaLayout.this.cantDeleteMessagesCount == 0 ? 0 : 8);
                if (SharedMediaLayout.this.gotoItem != null) {
                    SharedMediaLayout.this.gotoItem.setVisibility((SharedMediaLayout.this.getClosestTab() == 8 || SharedMediaLayout.this.getClosestTab() == 13) ? 8 : 0);
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(8);
                }
                if (SharedMediaLayout.this.forwardItem != null) {
                    ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.forwardItem;
                    if (SharedMediaLayout.this.getClosestTab() != 8 && SharedMediaLayout.this.getClosestTab() != 13) {
                        i = 0;
                    }
                    actionBarMenuItem.setVisibility(i);
                }
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[1].size() + SharedMediaLayout.this.selectedFiles[0].size(), false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < SharedMediaLayout.this.actionModeViews.size(); i2++) {
                    View view = (View) SharedMediaLayout.this.actionModeViews.get(i2);
                    AndroidUtilities.clearDrawableAnimation(view);
                    arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                SharedMediaLayout.this.scrolling = false;
                SharedMediaLayout.this.showActionMode(true);
            }
            updateSelection(true);
            return true;
        }

        @Override
        public boolean unselect(MessageObject messageObject) {
            int i = 1;
            if (messageObject != null) {
                char c = messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1;
                if (SharedMediaLayout.this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                    SharedMediaLayout.this.selectedFiles[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        SharedMediaLayout.access$4910(SharedMediaLayout.this);
                    }
                    if (SharedMediaLayout.this.selectedFiles[0].size() == 0 && SharedMediaLayout.this.selectedFiles[1].size() == 0) {
                        AndroidUtilities.hideKeyboard(SharedMediaLayout.this.profileActivity.getParentActivity().getCurrentFocus());
                        SharedMediaLayout.this.selectedFiles[0].clear();
                        SharedMediaLayout.this.selectedFiles[1].clear();
                        int i2 = 8;
                        SharedMediaLayout.this.deleteItem.setVisibility(SharedMediaLayout.this.cantDeleteMessagesCount == 0 ? 0 : 8);
                        if (SharedMediaLayout.this.gotoItem != null) {
                            SharedMediaLayout.this.gotoItem.setVisibility((SharedMediaLayout.this.getClosestTab() == 8 || SharedMediaLayout.this.getClosestTab() == 13) ? 8 : 0);
                        }
                        if (SharedMediaLayout.this.pinItem != null) {
                            SharedMediaLayout.this.pinItem.setVisibility(8);
                        }
                        if (SharedMediaLayout.this.unpinItem != null) {
                            SharedMediaLayout.this.unpinItem.setVisibility(8);
                        }
                        if (SharedMediaLayout.this.forwardItem != null) {
                            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.forwardItem;
                            if (SharedMediaLayout.this.getClosestTab() != 8 && SharedMediaLayout.this.getClosestTab() != 13) {
                                i2 = 0;
                            }
                            actionBarMenuItem.setVisibility(i2);
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < SharedMediaLayout.this.actionModeViews.size(); i3++) {
                            View view = (View) SharedMediaLayout.this.actionModeViews.get(i3);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        SharedMediaLayout.this.scrolling = false;
                        AndroidUtilities.runOnUIThread(new ShareAlert$23$$ExternalSyntheticLambda0(this, i), 20L);
                    } else {
                        SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(SharedMediaLayout.this.selectedFiles[1].size() + SharedMediaLayout.this.selectedFiles[0].size(), true);
                    }
                    updateSelection(true);
                    return true;
                }
            }
            return false;
        }
    }

    public class AnonymousClass13 extends ProfileGiftsContainer {
        public AnonymousClass13(BaseFragment baseFragment, Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
            super(context, i, j, baseFragment, resourcesProvider);
        }

        public void lambda$updatedReordering$0(boolean z) {
            if (z) {
                return;
            }
            SharedMediaLayout.this.saveItem.setVisibility(0);
        }

        @Override
        public int processColor(int i) {
            return SharedMediaLayout.this.processColor(i);
        }

        @Override
        public void updatedReordering(boolean z) {
            SharedMediaLayout.this.saveItem.setVisibility(0);
            SharedMediaLayout.this.saveItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new MediaActivity$$ExternalSyntheticLambda5(this, z, 2)).start();
            SharedMediaLayout.this.updateOptionsSearch(true);
        }
    }

    public class AnonymousClass14 implements ProfileStoriesCollectionTabs.Delegate {
        final Context val$context;
        final BaseFragment val$parent;
        final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass14(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
            this.val$context = context;
            this.val$parent = baseFragment;
            this.val$resourcesProvider = resourcesProvider;
        }

        public void lambda$onTabAlbumCreateCollection$1(String str) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            storiesController.getStoryAlbumsList(j, true).createCollection(str, new SharedMediaLayout$5$$ExternalSyntheticLambda1(SharedMediaLayout.this, 1));
        }

        public void lambda$onTabAlbumLongClick$2(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openAddStoriesToAlbumSheet(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        public void lambda$onTabAlbumLongClick$3(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openRenameStoriesAlbumAlert(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        public void lambda$onTabAlbumLongClick$4(int i) {
            SharedMediaLayout.this.lambda$onItemLongClick$58(i);
        }

        public void lambda$onTabAlbumLongClick$5(int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.openDeleteStoriesAlbumAlert(sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
        }

        @Override
        public void onTabAlbumAnimationUpdate(float f) {
            SharedMediaLayout.this.onPageMediaProgress(f);
        }

        @Override
        public void onTabAlbumCreateCollection() {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(this.val$context, this.val$parent, this.val$resourcesProvider, new EmojiView$$ExternalSyntheticLambda21(this, 14));
        }

        @Override
        public void onTabAlbumLongClick(View view, final int i) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            if (UserConfig.getInstance(storiesController.currentAccount).getClientUserId() == j || storiesController.canEditStories(j)) {
                ItemOptions scrimViewBackground = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view).setScrimViewBackground(new Drawable() {
                    private final Drawable bg;
                    private final Rect bgBounds = new Rect();

                    {
                        this.bg = Theme.createRoundRectDrawable(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Theme.blendOver(Theme.getColor(Theme.key_windowBackgroundWhite, AnonymousClass14.this.val$resourcesProvider), Theme.multAlpha(0.04f, Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, AnonymousClass14.this.val$resourcesProvider))));
                    }

                    @Override
                    public void draw(Canvas canvas) {
                        this.bgBounds.set(getBounds());
                        this.bgBounds.inset(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(8.0f));
                        this.bg.setBounds(this.bgBounds);
                        this.bg.draw(canvas);
                    }

                    @Override
                    public int getOpacity() {
                        return -2;
                    }

                    @Override
                    public void setAlpha(int i2) {
                        this.bg.setAlpha(i2);
                    }

                    @Override
                    public void setColorFilter(ColorFilter colorFilter) {
                    }
                });
                final int i2 = 0;
                scrimViewBackground.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass14 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$onTabAlbumLongClick$2(i);
                                break;
                            case 1:
                                this.f$0.lambda$onTabAlbumLongClick$3(i);
                                break;
                            case 2:
                                this.f$0.lambda$onTabAlbumLongClick$4(i);
                                break;
                            default:
                                this.f$0.lambda$onTabAlbumLongClick$5(i);
                                break;
                        }
                    }
                });
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.addStoryAlbumShareItemOptions(scrimViewBackground, sharedMediaLayout.profileActivity, SharedMediaLayout.this.dialog_id, i);
                final int i3 = 1;
                scrimViewBackground.add(R.drawable.msg_edit, LocaleController.getString(R.string.StoriesAlbumMenuEditName), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass14 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onTabAlbumLongClick$2(i);
                                break;
                            case 1:
                                this.f$0.lambda$onTabAlbumLongClick$3(i);
                                break;
                            case 2:
                                this.f$0.lambda$onTabAlbumLongClick$4(i);
                                break;
                            default:
                                this.f$0.lambda$onTabAlbumLongClick$5(i);
                                break;
                        }
                    }
                });
                final int i4 = 2;
                scrimViewBackground.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass14 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i4) {
                            case 0:
                                this.f$0.lambda$onTabAlbumLongClick$2(i);
                                break;
                            case 1:
                                this.f$0.lambda$onTabAlbumLongClick$3(i);
                                break;
                            case 2:
                                this.f$0.lambda$onTabAlbumLongClick$4(i);
                                break;
                            default:
                                this.f$0.lambda$onTabAlbumLongClick$5(i);
                                break;
                        }
                    }
                });
                final int i5 = 3;
                scrimViewBackground.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass14 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$onTabAlbumLongClick$2(i);
                                break;
                            case 1:
                                this.f$0.lambda$onTabAlbumLongClick$3(i);
                                break;
                            case 2:
                                this.f$0.lambda$onTabAlbumLongClick$4(i);
                                break;
                            default:
                                this.f$0.lambda$onTabAlbumLongClick$5(i);
                                break;
                        }
                    }
                });
                scrimViewBackground.show();
            }
        }

        @Override
        public void onTabAlbumScrollEnd(int i) {
            SharedMediaLayout.this.onPageMediaProgress(1.0f);
        }

        @Override
        public void onTabAlbumSelected(int i, boolean z) {
            if (i <= 0) {
                SharedMediaLayout.this.openStoryTabIdPage(8, z);
            } else {
                SharedMediaLayout.this.openStoryTabIdPage(SharedMediaLayout.this.storyAlbums_getByAlbumId(i).tabType, z);
            }
        }
    }

    public class AnonymousClass15 extends ProfileStoriesCollectionTabs {
        public AnonymousClass15(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, StoriesController.StoriesCollections storiesCollections, ProfileStoriesCollectionTabs.Delegate delegate) {
            super(context, sizeNotifierFrameLayout, storiesCollections, delegate);
        }

        public void lambda$updatedReordering$0(boolean z) {
            if (z) {
                return;
            }
            SharedMediaLayout.this.saveItem.setVisibility(0);
        }

        @Override
        public void onVisibilityChange(float f) {
            super.onVisibilityChange(f);
            if (SharedMediaLayout.this.mediaPages != null) {
                for (MediaPage mediaPage : SharedMediaLayout.this.mediaPages) {
                    if (mediaPage != null && mediaPage.listView != null) {
                        InternalListView internalListView = mediaPage.listView;
                        int paddingLeft = mediaPage.listView.getPaddingLeft();
                        int pagePaddingTop = SharedMediaLayout.this.getPagePaddingTop(mediaPage.selectedType);
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        InternalListView internalListView2 = mediaPage.listView;
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        int pagePaddingBottom = sharedMediaLayout.getPagePaddingBottom(sharedMediaLayout.isStoriesView());
                        internalListView2.hintPaddingBottom = pagePaddingBottom;
                        internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    }
                }
            }
            SharedMediaLayout.this.checkUi_topPanelLayoutY();
        }

        @Override
        public void updatedReordering(boolean z) {
            SharedMediaLayout.this.saveItem.setVisibility(0);
            SharedMediaLayout.this.saveItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new MediaActivity$$ExternalSyntheticLambda5(this, z, 3)).start();
            SharedMediaLayout.this.updateOptionsSearch(true);
        }
    }

    public class AnonymousClass4 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        public AnonymousClass4() {
        }

        public void lambda$onTextChanged$0() {
            SharedMediaLayout.this.switchToCurrentSelectedMode(false);
        }

        @Override
        public void onLayout(int i, int i2, int i3, int i4) {
            SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
        }

        @Override
        public void onSearchCollapse() {
            SharedMediaLayout.this.searching = false;
            SharedMediaLayout.this.searchingReaction = null;
            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.photoVideoOptionsItem != null && sharedMediaLayout.getPhotoVideoOptionsAlpha(0.0f) > 0.5f) {
                SharedMediaLayout.this.photoVideoOptionsItem.setVisibility(0);
            }
            SearchTagsList searchTagsList = SharedMediaLayout.this.searchTagsList;
            if (searchTagsList != null) {
                searchTagsList.clear();
                SharedMediaLayout.this.searchTagsList.show(false);
            }
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.clearSearch();
            }
            SharedMediaLayout.this.searchWas = false;
            SharedMediaLayout.this.searchItem.setVisibility(0);
            SharedMediaLayout.this.documentsSearchAdapter.search(null, true);
            SharedMediaLayout.this.linksSearchAdapter.search(null, true);
            SharedMediaLayout.this.audioSearchAdapter.search(null, true);
            SharedMediaLayout.this.groupUsersSearchAdapter.search(null, true);
            if (SharedMediaLayout.this.savedMessagesSearchAdapter != null) {
                SharedMediaLayout.this.savedMessagesSearchAdapter.search(null, null);
            }
            SharedMediaLayout.this.onSearchStateChanged(false);
            if (SharedMediaLayout.this.optionsSearchImageView != null) {
                SharedMediaLayout.this.optionsSearchImageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            if (SharedMediaLayout.this.ignoreSearchCollapse) {
                SharedMediaLayout.this.ignoreSearchCollapse = false;
            } else {
                SharedMediaLayout.this.switchToCurrentSelectedMode(false);
            }
        }

        @Override
        public void onSearchExpand() {
            SharedMediaLayout.this.searching = true;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            SearchTagsList searchTagsList = sharedMediaLayout.searchTagsList;
            if (searchTagsList != null) {
                searchTagsList.show((sharedMediaLayout.getSelectedTab() == 11 || SharedMediaLayout.this.getSelectedTab() == 12) && SharedMediaLayout.this.searchTagsList.hasFilters());
            }
            ImageView imageView = SharedMediaLayout.this.photoVideoOptionsItem;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem = SharedMediaLayout.this.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            SharedMediaLayout.this.searchItem.setVisibility(8);
            SharedMediaLayout.this.onSearchStateChanged(true);
            if (SharedMediaLayout.this.optionsSearchImageView != null) {
                SharedMediaLayout.this.optionsSearchImageView.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }

        @Override
        public void onSearchPressed(EditText editText) {
            super.onSearchPressed(editText);
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.hitSearch();
            }
        }

        @Override
        public void onTextChanged(EditText editText) {
            String string = editText.getText().toString();
            if (SharedMediaLayout.this.savedMessagesContainer != null) {
                SharedMediaLayout.this.savedMessagesContainer.chatActivity.setSearchQuery(string);
                if (TextUtils.isEmpty(string) && SharedMediaLayout.this.searchingReaction == null) {
                    SharedMediaLayout.this.savedMessagesContainer.chatActivity.clearSearch();
                }
            }
            SharedMediaLayout.this.searchItem.setVisibility(8);
            SharedMediaLayout.this.searchWas = (string.length() == 0 && SharedMediaLayout.this.searchingReaction == null) ? false : true;
            SharedMediaLayout.this.post(new ShareAlert$23$$ExternalSyntheticLambda0(this, 2));
            if (SharedMediaLayout.this.mediaPages[0].selectedType == 1) {
                if (SharedMediaLayout.this.documentsSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.documentsSearchAdapter.search(string, true);
                return;
            }
            if (SharedMediaLayout.this.mediaPages[0].selectedType == 3) {
                if (SharedMediaLayout.this.linksSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.linksSearchAdapter.search(string, true);
            } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 4) {
                if (SharedMediaLayout.this.audioSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.audioSearchAdapter.search(string, true);
            } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 7) {
                if (SharedMediaLayout.this.groupUsersSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.groupUsersSearchAdapter.search(string, true);
            } else {
                if (SharedMediaLayout.this.mediaPages[0].selectedType != 11 || SharedMediaLayout.this.savedMessagesSearchAdapter == null) {
                    return;
                }
                SharedMediaLayout.this.savedMessagesSearchAdapter.search(string, SharedMediaLayout.this.searchingReaction);
            }
        }
    }

    public class AnonymousClass40 implements ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate {
        public AnonymousClass40() {
        }

        public void lambda$showOptions$0(int i) {
            TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
            TLObject tLObject;
            if (SharedMediaLayout.this.profileActivity == null) {
                return;
            }
            if (SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) {
                TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                tL_channels_setMainProfileTab.tab = SharedMediaLayout.getTab(i, true);
                tL_channels_setMainProfileTab.channel = SharedMediaLayout.this.profileActivity.getMessagesController().getInputChannel(SharedMediaLayout.this.info.id);
                SharedMediaLayout.this.info.flags2 |= 4194304;
                SharedMediaLayout.this.info.main_tab = tL_channels_setMainProfileTab.tab;
                tLObject = tL_channels_setMainProfileTab;
            } else {
                tL_account_setMainProfileTab = new TLRPC.TL_account_setMainProfileTab();
                tL_account_setMainProfileTab.tab = SharedMediaLayout.getTab(i, true);
                if (SharedMediaLayout.this.userInfo != null) {
                    tLObject = tL_account_setMainProfileTab;
                    SharedMediaLayout.this.userInfo.flags2 |= 1048576;
                    SharedMediaLayout.this.userInfo.main_tab = tL_account_setMainProfileTab.tab;
                    SharedMediaLayout.this.profileActivity.getMessagesStorage().updateUserInfo(SharedMediaLayout.this.userInfo, true);
                    tLObject = tL_account_setMainProfileTab;
                }
            }
            tLObject = tL_account_setMainProfileTab;
            SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tLObject, null);
            SharedMediaLayout.this.updateTabs(true);
        }

        @Override
        public boolean canReorder(int i) {
            return false;
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
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.onTabProgress(sharedMediaLayout.getTabProgress());
                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                sharedMediaLayout2.optionsAlpha = sharedMediaLayout2.getPhotoVideoOptionsAlpha(f);
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                sharedMediaLayout3.photoVideoOptionsItem.setVisibility((sharedMediaLayout3.optionsAlpha == 0.0f || !SharedMediaLayout.this.canShowSearchItem() || SharedMediaLayout.this.isArchivedOnlyStoriesView()) ? 4 : 0);
                if (SharedMediaLayout.this.searchItem == null || SharedMediaLayout.this.canShowSearchItem()) {
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    sharedMediaLayout4.searchAlpha = sharedMediaLayout4.getSearchAlpha(f);
                    SharedMediaLayout.this.updateSearchItemIconAnimated();
                } else {
                    SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                    SharedMediaLayout.this.searchAlpha = 0.0f;
                }
                SharedMediaLayout.this.updateOptionsSearch();
                if (f == 1.0f) {
                    MediaPage mediaPage = SharedMediaLayout.this.mediaPages[0];
                    SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                    SharedMediaLayout.this.mediaPages[1] = mediaPage;
                    SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                    if (SharedMediaLayout.this.searchItem != null && SharedMediaLayout.this.searchItemState == 2) {
                        SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                    }
                    SharedMediaLayout.this.searchItemState = 0;
                    SharedMediaLayout.this.startStopVisibleGifs();
                }
            }
        }

        @Override
        public void onPageSelected(int i, boolean z) {
            if (SharedMediaLayout.this.mediaPages[0].selectedType == i) {
                return;
            }
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = SharedMediaLayout.this.storiesContainer;
            if (profileStoriesCollectionTabs != null && i == 8) {
                profileStoriesCollectionTabs.selectTabWithId(0, 1.0f);
            }
            SharedMediaLayout.this.mediaPages[1].selectedType = i;
            SharedMediaLayout.this.mediaPages[1].setVisibility(0);
            SharedMediaLayout.this.hideFloatingDateView(true);
            SharedMediaLayout.this.switchToCurrentSelectedMode(true);
            SharedMediaLayout.this.animatingForward = z;
            SharedMediaLayout.this.onSelectedTabChanged();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.animateSearchToOptions(!sharedMediaLayout.isSearchItemVisible(i), true);
            SharedMediaLayout.this.updateOptionsSearch(true);
        }

        @Override
        public void onSamePageSelected() {
            SharedMediaLayout.this.scrollToTop();
        }

        @Override
        public boolean showOptions(int i, View view) {
            TLRPC.ProfileTab profileTab;
            if (SharedMediaLayout.this.profileActivity != null && SharedMediaLayout.getTab(i, SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) != null) {
                if (SharedMediaLayout.this.info instanceof TLRPC.TL_channelFull) {
                    if (ChatObject.canUserDoAction(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(SharedMediaLayout.this.info.id)), 5)) {
                        profileTab = SharedMediaLayout.this.info.main_tab;
                        if (profileTab != null || (i != SharedMediaLayout.getTabId(profileTab) && SharedMediaLayout.this.firstTab != i)) {
                            ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view);
                            itemOptionsMakeOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(null, Theme.key_windowBackgroundWhite, false)));
                            itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new EmojiView$$ExternalSyntheticLambda9(this, i, 3));
                            itemOptionsMakeOptions.show();
                            return true;
                        }
                    }
                } else if (SharedMediaLayout.this.dialog_id == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId() && SharedMediaLayout.this.userInfo != null) {
                    profileTab = SharedMediaLayout.this.userInfo.main_tab;
                    if (profileTab != null) {
                    }
                    ItemOptions itemOptionsMakeOptions2 = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, view);
                    itemOptionsMakeOptions2.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(null, Theme.key_windowBackgroundWhite, false)));
                    itemOptionsMakeOptions2.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new EmojiView$$ExternalSyntheticLambda9(this, i, 3));
                    itemOptionsMakeOptions2.show();
                    return true;
                }
            }
            return false;
        }
    }

    public class AnonymousClass45 implements ViewTreeObserver.OnPreDrawListener {
        final SparseBooleanArray val$addedMesages;
        final RecyclerListView val$finalListView;
        final View val$finalProgressView;
        final int val$oldItemCount;

        public AnonymousClass45(RecyclerListView recyclerListView, SparseBooleanArray sparseBooleanArray, View view, int i) {
            this.val$finalListView = recyclerListView;
            this.val$addedMesages = sparseBooleanArray;
            this.val$finalProgressView = view;
            this.val$oldItemCount = i;
        }

        public void lambda$onPreDraw$0(int i, RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            SharedMediaLayout.this.messageAlphaEnter.put(i, (Float) valueAnimator.getAnimatedValue());
            recyclerListView.invalidate();
        }

        public static void lambda$onPreDraw$1(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        public static void lambda$onPreDraw$2(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        public static void lambda$onPreDraw$3(RecyclerListView recyclerListView, ValueAnimator valueAnimator) {
            if (recyclerListView.hasSections()) {
                recyclerListView.invalidate();
            }
        }

        @Override
        public boolean onPreDraw() {
            final int i = 2;
            SharedMediaLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
            RecyclerView.Adapter adapter = this.val$finalListView.getAdapter();
            final int i2 = 1;
            final int i3 = 0;
            if (adapter == SharedMediaLayout.this.photoVideoAdapter || adapter == SharedMediaLayout.this.documentsAdapter || adapter == SharedMediaLayout.this.audioAdapter || adapter == SharedMediaLayout.this.voiceAdapter) {
                if (this.val$addedMesages != null) {
                    int childCount = this.val$finalListView.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = this.val$finalListView.getChildAt(i4);
                        final int messageId = SharedMediaLayout.getMessageId(childAt);
                        if (messageId != 0 && this.val$addedMesages.get(messageId, false)) {
                            SharedMediaLayout.this.messageAlphaEnter.put(messageId, Float.valueOf(0.0f));
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            final RecyclerListView recyclerListView = this.val$finalListView;
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    this.f$0.lambda$onPreDraw$0(messageId, recyclerListView, valueAnimator);
                                }
                            });
                            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    SharedMediaLayout.this.messageAlphaEnter.remove(messageId);
                                    AnonymousClass45.this.val$finalListView.invalidate();
                                }
                            });
                            valueAnimatorOfFloat.setStartDelay((int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f));
                            valueAnimatorOfFloat.setDuration(250L);
                            final RecyclerListView recyclerListView2 = this.val$finalListView;
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i) {
                                        case 0:
                                            SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$2(recyclerListView2, valueAnimator);
                                            break;
                                        case 1:
                                            SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$3(recyclerListView2, valueAnimator);
                                            break;
                                        default:
                                            SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$1(recyclerListView2, valueAnimator);
                                            break;
                                    }
                                }
                            });
                            valueAnimatorOfFloat.start();
                        }
                        this.val$finalListView.invalidate();
                    }
                }
                return true;
            }
            int childCount2 = this.val$finalListView.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = this.val$finalListView.getChildAt(i5);
                if (childAt2 != this.val$finalProgressView && this.val$finalListView.getChildAdapterPosition(childAt2) >= this.val$oldItemCount - 1) {
                    childAt2.setAlpha(0.0f);
                    int iMin = (int) ((Math.min(this.val$finalListView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / this.val$finalListView.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat.setStartDelay(iMin);
                    objectAnimatorOfFloat.setDuration(200L);
                    final RecyclerListView recyclerListView3 = this.val$finalListView;
                    objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$2(recyclerListView3, valueAnimator);
                                    break;
                                case 1:
                                    SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$3(recyclerListView3, valueAnimator);
                                    break;
                                default:
                                    SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$1(recyclerListView3, valueAnimator);
                                    break;
                            }
                        }
                    });
                    animatorSet.playTogether(objectAnimatorOfFloat);
                }
                View view = this.val$finalProgressView;
                if (view != null && view.getParent() == null) {
                    this.val$finalListView.addView(this.val$finalProgressView);
                    final RecyclerView.LayoutManager layoutManager = this.val$finalListView.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.ignoreView(this.val$finalProgressView);
                        View view2 = this.val$finalProgressView;
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.ALPHA, view2.getAlpha(), 0.0f);
                        objectAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                AnonymousClass45.this.val$finalProgressView.setAlpha(1.0f);
                                layoutManager.stopIgnoringView(AnonymousClass45.this.val$finalProgressView);
                                AnonymousClass45 anonymousClass45 = AnonymousClass45.this;
                                anonymousClass45.val$finalListView.removeView(anonymousClass45.val$finalProgressView);
                            }
                        });
                        final RecyclerListView recyclerListView4 = this.val$finalListView;
                        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i2) {
                                    case 0:
                                        SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$2(recyclerListView4, valueAnimator);
                                        break;
                                    case 1:
                                        SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$3(recyclerListView4, valueAnimator);
                                        break;
                                    default:
                                        SharedMediaLayout.AnonymousClass45.lambda$onPreDraw$1(recyclerListView4, valueAnimator);
                                        break;
                                }
                            }
                        });
                        objectAnimatorOfFloat2.start();
                    }
                }
            }
            animatorSet.start();
            return true;
        }
    }

    public class AnonymousClass49 implements SharedLinkCell.SharedLinkCellDelegate {
        public AnonymousClass49() {
        }

        public void lambda$onLinkPress$0(String str, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                SharedMediaLayout.this.openUrl(str);
                return;
            }
            if (i == 1) {
                if (str.startsWith("mailto:")) {
                    str = str.substring(7);
                } else if (str.startsWith("tel:")) {
                    str = str.substring(4);
                }
                AndroidUtilities.addToClipboard(str);
            }
        }

        @Override
        public boolean canPerformActions() {
            return !SharedMediaLayout.this.isActionModeShowed;
        }

        @Override
        public void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
            SharedMediaLayout.this.openWebView(webPage, messageObject);
        }

        @Override
        public void onLinkPress(String str, boolean z) {
            int i = 1;
            if (!z) {
                SharedMediaLayout.this.openUrl(str);
                return;
            }
            BottomSheet bottomSheet = new BottomSheet(SharedMediaLayout.this.profileActivity.getParentActivity(), false, false, null);
            bottomSheet.fixNavigationBar();
            bottomSheet.title = str;
            bottomSheet.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            PhonebookShareAlert$$ExternalSyntheticLambda2 phonebookShareAlert$$ExternalSyntheticLambda2 = new PhonebookShareAlert$$ExternalSyntheticLambda2(i, this, str);
            bottomSheet.items = charSequenceArr;
            bottomSheet.onClickListener = phonebookShareAlert$$ExternalSyntheticLambda2;
            SharedMediaLayout.this.profileActivity.showDialog(bottomSheet);
        }
    }

    public class AnonymousClass5 implements View.OnClickListener {
        final Context val$context;
        final long val$did;
        final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass5(long j, Theme.ResourcesProvider resourcesProvider, Context context) {
            this.val$did = j;
            this.val$resourcesProvider = resourcesProvider;
            this.val$context = context;
        }

        public void lambda$onClick$0(ItemOptions itemOptions) {
            SharedMediaLayout.this.giftsContainer.createCollection();
            itemOptions.dismiss();
        }

        public void lambda$onClick$1(ItemOptions itemOptions) {
            SharedMediaLayout.this.giftsContainer.setReordering(true);
            itemOptions.dismiss();
        }

        public void lambda$onClick$10(TLRPC.User user, boolean z) {
            SharedMediaLayout.this.profileActivity.finishFragment();
            if (SharedMediaLayout.this.profileActivity instanceof NotificationCenter.NotificationCenterDelegate) {
                SharedMediaLayout.this.profileActivity.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) SharedMediaLayout.this.profileActivity, NotificationCenter.closeChats);
            }
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(SharedMediaLayout.this.dialog_id), user, null, Boolean.valueOf(z));
            SharedMediaLayout.this.profileActivity.getMessagesController().setSavedViewAs(false);
        }

        public void lambda$onClick$11() {
            TLRPC.User currentUser = SharedMediaLayout.this.profileActivity.getUserConfig().getCurrentUser();
            AlertsCreator.createClearOrDeleteDialogAlert(SharedMediaLayout.this.profileActivity, false, null, currentUser, false, true, false, true, new AIEditorAlert$$ExternalSyntheticLambda34(7, this, currentUser));
        }

        public void lambda$onClick$13(String str) {
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            storiesController.getStoryAlbumsList(j, true).createCollection(str, new SharedMediaLayout$5$$ExternalSyntheticLambda1(SharedMediaLayout.this, 0));
        }

        public void lambda$onClick$14(Theme.ResourcesProvider resourcesProvider, ItemOptions itemOptions) {
            AlertsCreator.createStoriesAlbumEnterNameForCreate(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, resourcesProvider, new EmojiView$$ExternalSyntheticLambda21(this, 15));
            itemOptions.dismiss();
        }

        public void lambda$onClick$15(int i, ItemOptions itemOptions) {
            SharedMediaLayout.this.showMediaCalendar(i, false);
            itemOptions.dismiss();
        }

        public void lambda$onClick$16(ItemOptions itemOptions) {
            Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(2, "type");
            bundleM.putLong("dialog_id", -SharedMediaLayout.this.info.id);
            MediaActivity mediaActivity = new MediaActivity(bundleM, null);
            mediaActivity.setChatInfo(SharedMediaLayout.this.info);
            SharedMediaLayout.this.profileActivity.presentFragment(mediaActivity);
            itemOptions.dismiss();
        }

        public void lambda$onClick$17(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, StoriesAdapter storiesAdapter, View view) {
            if (SharedMediaLayout.this.changeTypeAnimation) {
                return;
            }
            if (!actionBarMenuSubItem.getCheckView().isChecked() && actionBarMenuSubItem2.getCheckView().isChecked()) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                AndroidUtilities.shakeViewSpring(view, sharedMediaLayout.shiftDp = -sharedMediaLayout.shiftDp);
                return;
            }
            actionBarMenuSubItem2.getCheckView().setChecked(!actionBarMenuSubItem2.getCheckView().isChecked(), true);
            StoriesController.StoriesList storiesList = storiesAdapter.storiesList;
            if (storiesList == null) {
                return;
            }
            boolean zIsChecked = actionBarMenuSubItem2.getCheckView().isChecked();
            boolean zIsChecked2 = actionBarMenuSubItem.getCheckView().isChecked();
            storiesList.showPhotos = zIsChecked;
            storiesList.showVideos = zIsChecked2;
            storiesList.fill(true);
        }

        public void lambda$onClick$18(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, StoriesAdapter storiesAdapter, View view) {
            if (SharedMediaLayout.this.changeTypeAnimation) {
                return;
            }
            if (!actionBarMenuSubItem.getCheckView().isChecked() && actionBarMenuSubItem2.getCheckView().isChecked()) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                AndroidUtilities.shakeViewSpring(view, sharedMediaLayout.shiftDp = -sharedMediaLayout.shiftDp);
                return;
            }
            actionBarMenuSubItem2.getCheckView().setChecked(!actionBarMenuSubItem2.getCheckView().isChecked(), true);
            StoriesController.StoriesList storiesList = storiesAdapter.storiesList;
            if (storiesList == null) {
                return;
            }
            boolean zIsChecked = actionBarMenuSubItem.getCheckView().isChecked();
            boolean zIsChecked2 = actionBarMenuSubItem2.getCheckView().isChecked();
            storiesList.showPhotos = zIsChecked;
            storiesList.showVideos = zIsChecked2;
            storiesList.fill(true);
        }

        public static void lambda$onClick$2(ActionBarMenuSubItem actionBarMenuSubItem, StarsController.GiftsList giftsList, ActionBarMenuSubItem actionBarMenuSubItem2, ActionBarMenuSubItem actionBarMenuSubItem3, ActionBarMenuSubItem actionBarMenuSubItem4, ActionBarMenuSubItem actionBarMenuSubItem5, boolean z, ActionBarMenuSubItem actionBarMenuSubItem6, ActionBarMenuSubItem actionBarMenuSubItem7) {
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(giftsList.sort_by_date ? R.string.Gift2FilterSortByValue : R.string.Gift2FilterSortByDate), giftsList.sort_by_date ? R.drawable.menu_sort_value : R.drawable.menu_sort_date);
            }
            actionBarMenuSubItem2.setChecked(TLObject.hasFlag(giftsList.includeFlags, 1));
            actionBarMenuSubItem3.setChecked(TLObject.hasFlag(giftsList.includeFlags, 2));
            actionBarMenuSubItem4.setChecked(TLObject.hasFlag(giftsList.includeFlags, 4));
            actionBarMenuSubItem5.setChecked(TLObject.hasFlag(giftsList.includeFlags, 8));
            if (z) {
                actionBarMenuSubItem6.setChecked(TLObject.hasFlag(giftsList.includeFlags, 256));
                actionBarMenuSubItem7.setChecked(TLObject.hasFlag(giftsList.includeFlags, 512));
            }
        }

        public static void lambda$onClick$3(StarsController.GiftsList giftsList, Runnable runnable, View view) {
            giftsList.sort_by_date = !giftsList.sort_by_date;
            runnable.run();
            giftsList.invalidate(true);
        }

        public void lambda$onClick$4() {
            StoryRecorder storyRecorder = StoryRecorder.getInstance(SharedMediaLayout.this.profileActivity.getParentActivity(), SharedMediaLayout.this.profileActivity.getCurrentAccount());
            long j = SharedMediaLayout.this.dialog_id;
            String currentLang = SharedMediaLayout.this.botPreviewsContainer.getCurrentLang();
            storyRecorder.botId = j;
            storyRecorder.botLang = currentLang;
            storyRecorder.open(null);
            storyRecorder.botId = j;
            storyRecorder.botLang = currentLang;
        }

        public void lambda$onClick$5() {
            SharedMediaLayout.this.botPreviewsContainer.selectAll();
        }

        public void lambda$onClick$6() {
            if (SharedMediaLayout.this.botPreviewsContainer.isSelectedAll()) {
                SharedMediaLayout.this.botPreviewsContainer.unselectAll();
            } else {
                SharedMediaLayout.this.botPreviewsContainer.selectAll();
            }
        }

        public void lambda$onClick$7() {
            SharedMediaLayout.this.botPreviewsContainer.deleteLang(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang());
        }

        public void lambda$onClick$8() {
            SharedMediaLayout.this.profileActivity.getMessagesController().setSavedViewAs(false);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId());
            SharedMediaLayout.this.profileActivity.presentFragment(new ChatActivity(bundle), true);
        }

        public void lambda$onClick$9() {
            try {
                SharedMediaLayout.this.profileActivity.getMediaDataController().installShortcut(SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public void onClick(View view) {
            StoriesController.StoriesList storiesList;
            TLRPC.Chat chat;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            final ActionBarMenuSubItem actionBarMenuSubItemAdd;
            boolean z;
            final ActionBarMenuSubItem actionBarMenuSubItem;
            final ActionBarMenuSubItem actionBarMenuSubItem2;
            StoryAlbumData storyAlbumDataStoryAlbums_getByTabType;
            final int i = 4;
            final int i2 = 5;
            final int i3 = 2;
            int closestTab = SharedMediaLayout.this.getClosestTab();
            boolean zIsAnyStoryPageType = SharedMediaLayout.isAnyStoryPageType(closestTab);
            TLRPC.User user = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id));
            StoriesController storiesController = SharedMediaLayout.this.getStoriesController();
            long j = SharedMediaLayout.this.dialog_id;
            boolean z2 = true;
            z2 = true;
            final int i4 = 0;
            boolean z3 = UserConfig.getInstance(storiesController.currentAccount).getClientUserId() == j || storiesController.canEditStories(j);
            if (SharedMediaLayout.isStoryAlbumPageType(closestTab) && z3 && (storyAlbumDataStoryAlbums_getByTabType = SharedMediaLayout.this.storyAlbums_getByTabType(closestTab)) != null) {
                int i5 = storyAlbumDataStoryAlbums_getByTabType.albumId;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                sharedMediaLayout.buildItemOptionsForStoryAlbumActionBar(sharedMediaLayout.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem, this.val$did, i5).setOnTopOfScrim().setDimAlpha(0).show();
                return;
            }
            if (closestTab == 14) {
                ProfileGiftsContainer.Page currentPage = SharedMediaLayout.this.giftsContainer.getCurrentPage();
                final StarsController.GiftsList giftsList = currentPage.list;
                if (giftsList == null) {
                    return;
                }
                final boolean zCanFilterHidden = SharedMediaLayout.this.giftsContainer.canFilterHidden();
                final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
                if (giftsList.isCollection) {
                    actionBarMenuSubItemAdd = null;
                    z = false;
                } else {
                    actionBarMenuSubItemAdd = itemOptionsMakeOptions.add();
                    z = true;
                }
                if (SharedMediaLayout.this.giftsContainer.canAdd()) {
                    itemOptionsMakeOptions.add(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    this.lambda$onClick$0(itemOptionsMakeOptions);
                                    break;
                                case 1:
                                    this.lambda$onClick$16(itemOptionsMakeOptions);
                                    break;
                                default:
                                    this.lambda$onClick$1(itemOptionsMakeOptions);
                                    break;
                            }
                        }
                    });
                    z = true;
                }
                if (SharedMediaLayout.this.giftsContainer.collections.isMine()) {
                    if (!giftsList.getPinned().isEmpty() || currentPage.isCollection) {
                        itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable() {
                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        this.lambda$onClick$0(itemOptionsMakeOptions);
                                        break;
                                    case 1:
                                        this.lambda$onClick$16(itemOptionsMakeOptions);
                                        break;
                                    default:
                                        this.lambda$onClick$1(itemOptionsMakeOptions);
                                        break;
                                }
                            }
                        });
                    }
                    z = true;
                }
                if (z) {
                    itemOptionsMakeOptions.addGap();
                }
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked2 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked3 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
                final ActionBarMenuSubItem actionBarMenuSubItemAddChecked4 = itemOptionsMakeOptions.addChecked();
                actionBarMenuSubItemAddChecked4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (zCanFilterHidden) {
                    itemOptionsMakeOptions.addGap();
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked5 = itemOptionsMakeOptions.addChecked();
                    actionBarMenuSubItemAddChecked5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked6 = itemOptionsMakeOptions.addChecked();
                    actionBarMenuSubItemAddChecked6.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem = actionBarMenuSubItemAddChecked5;
                    actionBarMenuSubItem2 = actionBarMenuSubItemAddChecked6;
                } else {
                    actionBarMenuSubItem = null;
                    actionBarMenuSubItem2 = null;
                }
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        SharedMediaLayout.AnonymousClass5.lambda$onClick$2(actionBarMenuSubItemAdd, giftsList, actionBarMenuSubItemAddChecked, actionBarMenuSubItemAddChecked2, actionBarMenuSubItemAddChecked3, actionBarMenuSubItemAddChecked4, zCanFilterHidden, actionBarMenuSubItem, actionBarMenuSubItem2);
                    }
                };
                ActionBarMenuSubItem actionBarMenuSubItem3 = actionBarMenuSubItem;
                ActionBarMenuSubItem actionBarMenuSubItem4 = actionBarMenuSubItem2;
                runnable.run();
                if (actionBarMenuSubItemAdd != null) {
                    actionBarMenuSubItemAdd.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda16(i2, giftsList, runnable));
                }
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked, giftsList, runnable, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked2, giftsList, runnable, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked3, giftsList, runnable, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked4, giftsList, runnable, 8);
                if (zCanFilterHidden) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem3, giftsList, runnable, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem4, giftsList, runnable, 512);
                }
                itemOptionsMakeOptions.setOnTopOfScrim().setDismissWithButtons(false).setDimAlpha(0).show();
                return;
            }
            if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && SharedMediaLayout.this.botPreviewsContainer != null) {
                ItemOptions itemOptionsMakeOptions2 = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
                boolean z4 = SharedMediaLayout.this.botPreviewsContainer.getItemsCount() < SharedMediaLayout.this.profileActivity.getMessagesController().botPreviewMediasMax;
                int i6 = R.drawable.msg_addbot;
                String string = LocaleController.getString(R.string.ProfileBotAddPreview);
                final int i7 = z2 ? 1 : 0;
                final int i8 = 3;
                itemOptionsMakeOptions2.addIf(z4, i6, string, new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i7) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() > 1 && !SharedMediaLayout.this.botPreviewsContainer.isSelectedAll(), R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).addIf(SharedMediaLayout.this.botPreviewsContainer.getItemsCount() > 0, R.drawable.msg_select, LocaleController.getString(SharedMediaLayout.this.botPreviewsContainer.isSelectedAll() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i8) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).addIf(!TextUtils.isEmpty(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang()), R.drawable.msg_delete, (CharSequence) LocaleController.formatString(R.string.ProfileBotRemoveLang, TranslateAlert2.languageName(SharedMediaLayout.this.botPreviewsContainer.getCurrentLang())), true, new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).translate(0.0f, -AndroidUtilities.dp(52.0f)).setDimAlpha(0).show();
                return;
            }
            if (SharedMediaLayout.this.getSelectedTab() == 11) {
                final int i9 = 6;
                final int i10 = 0;
                ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem).add(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).addGap().add(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i9) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                this.f$0.lambda$onClick$11();
                                break;
                            case 1:
                                this.f$0.lambda$onClick$4();
                                break;
                            case 2:
                                this.f$0.lambda$onClick$5();
                                break;
                            case 3:
                                this.f$0.lambda$onClick$6();
                                break;
                            case 4:
                                this.f$0.lambda$onClick$7();
                                break;
                            case 5:
                                this.f$0.lambda$onClick$8();
                                break;
                            default:
                                this.f$0.lambda$onClick$9();
                                break;
                        }
                    }
                }).translate(0.0f, -AndroidUtilities.dp(52.0f)).setDimAlpha(0).show();
                return;
            }
            final ItemOptions itemOptionsMakeOptions3 = ItemOptions.makeOptions(SharedMediaLayout.this.profileActivity, SharedMediaLayout.this.photoVideoOptionsItem);
            if ((closestTab == 8 || SharedMediaLayout.isStoryAlbumPageType(closestTab)) && z3) {
                itemOptionsMakeOptions3.add(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new ImageUpdater$$ExternalSyntheticLambda1(this, this.val$resourcesProvider, itemOptionsMakeOptions3, 10));
                itemOptionsMakeOptions3.addGap();
            }
            SharedMediaLayout.this.addZoomInZoomOutItemOptions(itemOptionsMakeOptions3);
            boolean z5 = zIsAnyStoryPageType || !((!SharedMediaLayout.this.sharedMediaData[0].hasPhotos || !SharedMediaLayout.this.sharedMediaData[0].hasVideos) && SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1] && SharedMediaLayout.this.sharedMediaData[0].startReached);
            if (!DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id) && (user == null || !user.bot)) {
                itemOptionsMakeOptions3.add(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new SlotsDrawable$$ExternalSyntheticLambda9(this, closestTab, itemOptionsMakeOptions3, i2));
                if (SharedMediaLayout.this.info != null && !SharedMediaLayout.this.isStoriesView() && (chat = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChat(Long.valueOf(SharedMediaLayout.this.info.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                    int i11 = R.drawable.msg_archive;
                    String string2 = LocaleController.getString(R.string.OpenChannelArchiveStories);
                    final int i12 = z2 ? 1 : 0;
                    itemOptionsMakeOptions3.add(i11, string2, new Runnable() {
                        @Override
                        public final void run() {
                            switch (i12) {
                                case 0:
                                    this.lambda$onClick$0(itemOptionsMakeOptions3);
                                    break;
                                case 1:
                                    this.lambda$onClick$16(itemOptionsMakeOptions3);
                                    break;
                                default:
                                    this.lambda$onClick$1(itemOptionsMakeOptions3);
                                    break;
                            }
                        }
                    });
                }
                if (z5) {
                    itemOptionsMakeOptions3.addGap();
                    final ActionBarMenuSubItem actionBarMenuSubItem5 = new ActionBarMenuSubItem(1, this.val$context, this.val$resourcesProvider, false, false);
                    final ActionBarMenuSubItem actionBarMenuSubItem6 = new ActionBarMenuSubItem(1, this.val$context, this.val$resourcesProvider, false, true);
                    actionBarMenuSubItem5.setTextAndIcon(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0);
                    itemOptionsMakeOptions3.getLayout().addView(actionBarMenuSubItem5);
                    actionBarMenuSubItem6.setTextAndIcon(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0);
                    itemOptionsMakeOptions3.getLayout().addView(actionBarMenuSubItem6);
                    if (zIsAnyStoryPageType) {
                        final StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = SharedMediaLayout.this.storyAlbums_getStoriesAdapterByTabType(closestTab);
                        if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) != null) {
                            actionBarMenuSubItem5.setChecked(storiesList.showPhotos);
                            actionBarMenuSubItem6.setChecked(storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.showVideos);
                        }
                        final int i13 = 0;
                        actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener(this) {
                            public final SharedMediaLayout.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i13) {
                                    case 0:
                                        this.f$0.lambda$onClick$17(actionBarMenuSubItem6, actionBarMenuSubItem5, storiesAdapterStoryAlbums_getStoriesAdapterByTabType, view2);
                                        break;
                                    default:
                                        this.f$0.lambda$onClick$18(actionBarMenuSubItem6, actionBarMenuSubItem5, storiesAdapterStoryAlbums_getStoriesAdapterByTabType, view2);
                                        break;
                                }
                            }
                        });
                        final int i14 = 1;
                        actionBarMenuSubItem6.setOnClickListener(new View.OnClickListener(this) {
                            public final SharedMediaLayout.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i14) {
                                    case 0:
                                        this.f$0.lambda$onClick$17(actionBarMenuSubItem5, actionBarMenuSubItem6, storiesAdapterStoryAlbums_getStoriesAdapterByTabType, view2);
                                        break;
                                    default:
                                        this.f$0.lambda$onClick$18(actionBarMenuSubItem5, actionBarMenuSubItem6, storiesAdapterStoryAlbums_getStoriesAdapterByTabType, view2);
                                        break;
                                }
                            }
                        });
                    } else {
                        actionBarMenuSubItem5.setChecked(SharedMediaLayout.this.sharedMediaData[0].filterType == 0 || SharedMediaLayout.this.sharedMediaData[0].filterType == 1);
                        actionBarMenuSubItem5.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view2) {
                                if (SharedMediaLayout.this.changeTypeAnimation) {
                                    return;
                                }
                                if (!actionBarMenuSubItem6.getCheckView().isChecked() && actionBarMenuSubItem5.getCheckView().isChecked()) {
                                    ActionBarMenuSubItem actionBarMenuSubItem7 = actionBarMenuSubItem5;
                                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                    AndroidUtilities.shakeViewSpring(actionBarMenuSubItem7, sharedMediaLayout2.shiftDp = -sharedMediaLayout2.shiftDp);
                                    return;
                                }
                                ActionBarMenuSubItem actionBarMenuSubItem8 = actionBarMenuSubItem5;
                                actionBarMenuSubItem8.setChecked(!actionBarMenuSubItem8.getCheckView().isChecked());
                                if (actionBarMenuSubItem5.getCheckView().isChecked() && actionBarMenuSubItem6.getCheckView().isChecked()) {
                                    SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                } else {
                                    SharedMediaLayout.this.sharedMediaData[0].filterType = 2;
                                }
                                SharedMediaLayout.this.changeMediaFilterType();
                            }
                        });
                        if (SharedMediaLayout.this.sharedMediaData[0].filterType != 0 && SharedMediaLayout.this.sharedMediaData[0].filterType != 2) {
                            z2 = false;
                        }
                        actionBarMenuSubItem6.setChecked(z2);
                        actionBarMenuSubItem6.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view2) {
                                if (SharedMediaLayout.this.changeTypeAnimation) {
                                    return;
                                }
                                if (!actionBarMenuSubItem5.getCheckView().isChecked() && actionBarMenuSubItem6.getCheckView().isChecked()) {
                                    ActionBarMenuSubItem actionBarMenuSubItem7 = actionBarMenuSubItem6;
                                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                    AndroidUtilities.shakeViewSpring(actionBarMenuSubItem7, sharedMediaLayout2.shiftDp = -sharedMediaLayout2.shiftDp);
                                    return;
                                }
                                ActionBarMenuSubItem actionBarMenuSubItem8 = actionBarMenuSubItem6;
                                actionBarMenuSubItem8.setChecked(!actionBarMenuSubItem8.getCheckView().isChecked());
                                if (actionBarMenuSubItem5.getCheckView().isChecked() && actionBarMenuSubItem6.getCheckView().isChecked()) {
                                    SharedMediaLayout.this.sharedMediaData[0].filterType = 0;
                                } else {
                                    SharedMediaLayout.this.sharedMediaData[0].filterType = 1;
                                }
                                SharedMediaLayout.this.changeMediaFilterType();
                            }
                        });
                    }
                }
            }
            itemOptionsMakeOptions3.setDismissWithButtons(false).setOnTopOfScrim().setDimAlpha(0).show();
        }
    }

    public class AnonymousClass50 extends ShareAlert {
        final BaseFragment val$fragment;

        public AnonymousClass50(Context context, ArrayList arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider, BaseFragment baseFragment) {
            super(context, arrayList, str, z, str2, z2, resourcesProvider);
            this.val$fragment = baseFragment;
        }

        public static void lambda$onSend$0(BaseFragment baseFragment, LongSparseArray longSparseArray, int i) {
            UndoView undoView;
            if (baseFragment instanceof ChatActivity) {
                undoView = ((ChatActivity) baseFragment).getUndoView();
            } else {
                undoView = baseFragment instanceof ProfileActivity ? ((ProfileActivity) baseFragment).getUndoView() : null;
            }
            UndoView undoView2 = undoView;
            if (undoView2 != null) {
                if (longSparseArray.size() == 1) {
                    undoView2.showWithAction(((TLRPC.Dialog) longSparseArray.valueAt(0)).id, 53, Integer.valueOf(i));
                } else {
                    undoView2.showWithAction(0L, 53, Integer.valueOf(i), Integer.valueOf(longSparseArray.size()), (Runnable) null, (Runnable) null);
                }
            }
        }

        @Override
        public void onSend(LongSparseArray longSparseArray, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda9(this.val$fragment, longSparseArray, i, 6), 100L);
        }

        @Override
        public void setLastVisible(boolean z) {
        }
    }

    public class ChannelRecommendationsAdapter extends RecyclerListView.SelectionAdapter {
        private final ArrayList<TLObject> chats = new ArrayList<>();
        private final Context mContext;
        private int more;

        public ChannelRecommendationsAdapter(Context context) {
            this.mContext = context;
            update(false);
        }

        public void lambda$onCreateViewHolder$0() {
            if (SharedMediaLayout.this.profileActivity != null) {
                SharedMediaLayout.this.profileActivity.presentFragment(new PremiumPreviewFragment("similar_channels"));
            }
        }

        public void lambda$openPreview$1(View view) {
            if (SharedMediaLayout.this.profileActivity == null || SharedMediaLayout.this.profileActivity.getParentLayout() == null) {
                return;
            }
            ((ActionBarLayout) SharedMediaLayout.this.profileActivity.getParentLayout()).expandPreviewFragment();
        }

        public void lambda$openPreview$2(TLRPC.Chat chat) {
            BulletinFactory.of(SharedMediaLayout.this.profileActivity).createSimpleBulletin(R.raw.contact_check, LocaleController.formatString(R.string.YouJoinedChannel, chat == null ? "" : chat.title)).show(true);
        }

        public void lambda$openPreview$3(TLRPC.Chat chat, int i, View view) {
            SharedMediaLayout.this.profileActivity.finishPreviewFragment();
            chat.left = false;
            update(false);
            notifyItemRemoved(i);
            if (this.chats.isEmpty()) {
                SharedMediaLayout.this.updateTabs(true);
                SharedMediaLayout.this.checkCurrentTabValid();
            }
            SharedMediaLayout.this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelRecommendationsLoaded, Long.valueOf(-SharedMediaLayout.this.dialog_id));
            SharedMediaLayout.this.profileActivity.getMessagesController().addUserToChat(chat.id, SharedMediaLayout.this.profileActivity.getUserConfig().getCurrentUser(), 0, null, SharedMediaLayout.this.profileActivity, new EmojiView$2$$ExternalSyntheticLambda0(19, this, chat));
        }

        @Override
        public int getItemCount() {
            return this.chats.size();
        }

        @Override
        public int getItemViewType(int i) {
            return (this.more <= 0 || i != getItemCount() + (-1)) ? 17 : 18;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ProfileSearchCell profileSearchCell;
            if (viewHolder.getItemViewType() == 17) {
                View view = viewHolder.itemView;
                if (!(view instanceof ProfileSearchCell)) {
                    return;
                } else {
                    profileSearchCell = (ProfileSearchCell) view;
                }
            } else if (viewHolder.getItemViewType() == 18) {
                View view2 = viewHolder.itemView;
                if (!(view2 instanceof MoreRecommendationsCell)) {
                    return;
                } else {
                    profileSearchCell = ((MoreRecommendationsCell) view2).channelCell;
                }
            } else {
                profileSearchCell = null;
            }
            ProfileSearchCell profileSearchCell2 = profileSearchCell;
            if (profileSearchCell2 != null) {
                profileSearchCell2.setData(this.chats.get(i), null, null, null, false, false);
                profileSearchCell2.useSeparator = i != this.chats.size() - 1;
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View profileSearchCell;
            if (i == 18) {
                profileSearchCell = new MoreRecommendationsCell(SharedMediaLayout.this.profileActivity == null ? UserConfig.selectedAccount : SharedMediaLayout.this.profileActivity.getCurrentAccount(), this.mContext, SharedMediaLayout.this.dialog_id > 0, SharedMediaLayout.this.resourcesProvider, new ShareAlert$23$$ExternalSyntheticLambda0(this, 3));
            } else {
                profileSearchCell = new ProfileSearchCell(this.mContext, SharedMediaLayout.this.resourcesProvider);
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        public void openPreview(int i) {
            if (i < 0 || i >= this.chats.size()) {
                return;
            }
            TLObject tLObject = this.chats.get(i);
            Bundle bundle = new Bundle();
            boolean z = tLObject instanceof TLRPC.Chat;
            if (z) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
            } else if (!(tLObject instanceof TLRPC.User)) {
                return;
            } else {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).id);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            if (SharedMediaLayout.this.profileActivity instanceof ProfileActivity) {
                ((ProfileActivity) SharedMediaLayout.this.profileActivity).prepareBlurBitmap();
            }
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(SharedMediaLayout.this.getContext(), R.drawable.popup_fixed_alert, SharedMediaLayout.this.resourcesProvider, 2);
            actionBarPopupWindowLayout.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
            if (!z) {
                if (tLObject instanceof TLRPC.User) {
                    SharedMediaLayout.this.profileActivity.presentFragmentAsPreview(chatActivity);
                    return;
                }
                return;
            }
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, SharedMediaLayout.this.getContext(), null, false, false);
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel);
            actionBarMenuSubItem.setMinimumWidth(160);
            actionBarMenuSubItem.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 6));
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, SharedMediaLayout.this.getContext(), null, false, false);
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot);
            actionBarMenuSubItem2.setMinimumWidth(160);
            actionBarMenuSubItem2.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda134(this, (TLRPC.Chat) tLObject, i, 1));
            actionBarPopupWindowLayout.addView(actionBarMenuSubItem2);
            SharedMediaLayout.this.profileActivity.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
        }

        public void update(boolean z) {
            if (SharedMediaLayout.this.profileActivity == null) {
                return;
            }
            if (DialogObject.isChatDialog(SharedMediaLayout.this.dialog_id)) {
                TLRPC.Chat chat = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getChannelRecommendations(SharedMediaLayout.this.dialog_id);
            this.chats.clear();
            int i = 0;
            if (channelRecommendations != null) {
                for (int i2 = 0; i2 < channelRecommendations.chats.size(); i2++) {
                    TLObject tLObject = channelRecommendations.chats.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                        this.chats.add(tLObject);
                    } else {
                        this.chats.add(tLObject);
                    }
                }
            }
            if (!this.chats.isEmpty() && !UserConfig.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).isPremium()) {
                i = channelRecommendations.more;
            }
            this.more = i;
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    public class ChatUsersAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.ChatFull chatInfo;
        private Context mContext;
        private ArrayList<Integer> sortedUsers;

        public ChatUsersAdapter(Context context) {
            this.mContext = context;
        }

        public void lambda$onBindViewHolder$0(TLRPC.User user, String str, boolean z, boolean z2, boolean z3, View view) {
            TagEditCell.showInfoSheet(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity.getCurrentAccount(), SharedMediaLayout.this.dialog_id, user, str, z, z2, z3, SharedMediaLayout.this.resourcesProvider);
        }

        @Override
        public int getItemCount() {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull != null && chatFull.participants.participants.isEmpty()) {
                return 1;
            }
            TLRPC.ChatFull chatFull2 = this.chatInfo;
            if (chatFull2 != null) {
                return chatFull2.participants.participants.size();
            }
            return 0;
        }

        @Override
        public int getItemViewType(int i) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            View view = viewHolder.itemView;
            if (view instanceof UserCell) {
                UserCell userCell = (UserCell) view;
                TLRPC.ChatParticipant chatParticipant = !this.sortedUsers.isEmpty() ? this.chatInfo.participants.participants.get(this.sortedUsers.get(i).intValue()) : this.chatInfo.participants.participants.get(i);
                if (chatParticipant != null) {
                    if (chatParticipant instanceof TLRPC.TL_chatChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        string = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(string)) {
                                string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str = string;
                            z = true;
                            z2 = true;
                            z3 = false;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(string)) {
                                    string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                }
                                if (channelParticipant.promoted_by == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                                    str = string;
                                    z = true;
                                    z2 = false;
                                    z3 = true;
                                } else {
                                    str = string;
                                    z = true;
                                }
                            } else {
                                str = string;
                                z = false;
                            }
                            z2 = false;
                            z3 = false;
                        }
                    } else {
                        string = chatParticipant.rank;
                        if (chatParticipant instanceof TLRPC.TL_chatParticipantCreator) {
                            if (TextUtils.isEmpty(string)) {
                                string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            str = string;
                            z = true;
                            z2 = true;
                            z3 = false;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(string)) {
                                    string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                }
                                if (chatParticipant.inviter_id == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                                    str = string;
                                    z = true;
                                    z2 = false;
                                    z3 = true;
                                } else {
                                    str = string;
                                    z = true;
                                }
                            } else {
                                str = string;
                                z = false;
                            }
                            z2 = false;
                            z3 = false;
                        }
                    }
                    TLRPC.User user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    userCell.setAdminRole(str, z, z2, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id))), new InviteLinkBottomSheet$Adapter$$ExternalSyntheticLambda0(this, user, str, z, z2, z3, 1));
                    userCell.setData(user, null, null, 0, i != this.chatInfo.participants.participants.size() - 1);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 20) {
                View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 7, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                return zzkd.m(viewCreateEmptyStubView, viewCreateEmptyStubView, -1);
            }
            UserCell userCell = new UserCell(9, 0, this.mContext, SharedMediaLayout.this.resourcesProvider, true, false);
            userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(userCell);
        }

        public void updateRank(long j, String str) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            if (chatFull == null || chatFull.participants == null) {
                return;
            }
            for (int i = 0; i < this.chatInfo.participants.participants.size(); i++) {
                this.chatInfo.participants.participants.get(i).setRank(j, str);
            }
        }
    }

    public class CommonGroupsAdapter extends RecyclerListView.SelectionAdapter {
        private ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        private boolean endReached;
        private boolean firstLoaded;
        private boolean loading;
        private Context mContext;

        public CommonGroupsAdapter(Context context) {
            this.mContext = context;
        }

        public void getChats(long j, int i) {
            if (this.loading) {
                return;
            }
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            TLRPC.InputUser inputUser = SharedMediaLayout.this.profileActivity.getMessagesController().getInputUser(DialogObject.isEncryptedDialog(SharedMediaLayout.this.dialog_id) ? SharedMediaLayout.this.profileActivity.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(SharedMediaLayout.this.dialog_id))).user_id : SharedMediaLayout.this.dialog_id);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = i;
            tL_messages_getCommonChats.max_id = j;
            this.loading = true;
            notifyDataSetChanged();
            SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new SharedMediaLayout$CommonGroupsAdapter$$ExternalSyntheticLambda0(this, i, 0)), SharedMediaLayout.this.profileActivity.getClassGuid());
        }

        public void lambda$getChats$0(TLRPC.TL_error tL_error, TLObject tLObject, int i) {
            int itemCount = getItemCount();
            if (tL_error == null) {
                TLRPC.messages_Chats messages_chats = (TLRPC.messages_Chats) tLObject;
                SharedMediaLayout.this.profileActivity.getMessagesController().putChats(messages_chats.chats, false);
                this.endReached = messages_chats.chats.isEmpty() || messages_chats.chats.size() != i;
                this.chats.addAll(messages_chats.chats);
            } else {
                this.endReached = true;
            }
            for (int i2 = 0; i2 < SharedMediaLayout.this.mediaPages.length; i2++) {
                if (SharedMediaLayout.this.mediaPages[i2].selectedType == 6 && SharedMediaLayout.this.mediaPages[i2].listView != null) {
                    InternalListView internalListView = SharedMediaLayout.this.mediaPages[i2].listView;
                    if (this.firstLoaded || itemCount == 0) {
                        SharedMediaLayout.this.animateItemsEnter(internalListView, 0, null);
                    }
                }
            }
            this.loading = false;
            this.firstLoaded = true;
            notifyDataSetChanged();
        }

        public void lambda$getChats$1(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ShareTopView$$ExternalSyntheticLambda3(i, tLObject, tL_error, this));
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
        public int getItemViewType(int i) {
            if (!this.chats.isEmpty() || this.loading) {
                return i < this.chats.size() ? 14 : 16;
            }
            return 15;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() != this.chats.size();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 14) {
                View view = viewHolder.itemView;
                if (view instanceof ProfileSearchCell) {
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    profileSearchCell.setData(this.chats.get(i), null, null, null, false, false);
                    boolean z = true;
                    if (i == this.chats.size() - 1 && this.endReached) {
                        z = false;
                    }
                    profileSearchCell.useSeparator = z;
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View profileSearchCell;
            if (i == 14) {
                profileSearchCell = new ProfileSearchCell(this.mContext, SharedMediaLayout.this.resourcesProvider);
            } else {
                if (i == 15) {
                    View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 6, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    return zzkd.m(viewCreateEmptyStubView, viewCreateEmptyStubView, -1);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(1);
                profileSearchCell = flickerLoadingView;
            }
            return zzkd.m(profileSearchCell, profileSearchCell, -2);
        }
    }

    public interface Delegate {
        boolean canSearchMembers();

        TLRPC.Chat getCurrentChat();

        RecyclerListView getListView();

        boolean isFragmentOpened();

        boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view);

        void scrollToSharedMedia();

        void updateSelectedMediaTabText();
    }

    public static class EmptyStubView extends LinearLayout {
        final ImageView emptyImageView;
        final TextView emptyTextView;
        boolean ignoreRequestLayout;

        public EmptyStubView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            TextView textView = new TextView(context);
            this.emptyTextView = textView;
            ImageView imageView = new ImageView(context);
            this.emptyImageView = imageView;
            setOrientation(1);
            setGravity(17);
            addView(imageView, LayoutHelper.createLinear(-2, -2));
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider));
            textView.setGravity(17);
            textView.setTextSize(1, 17.0f);
            textView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(128.0f));
            addView(textView, LayoutHelper.createLinear(-2, -2, 17, 0, 24, 0, 0));
        }

        @Override
        public void onMeasure(int i, int i2) {
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
            if (this.ignoreRequestLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public class GifAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public GifAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) {
                return SharedMediaLayout.this.sharedMediaData[5].messages.size();
            }
            return 1;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public int getItemViewType(int i) {
            return (SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading) ? 12 : 11;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return SharedMediaLayout.this.sharedMediaData[5].messages.size() != 0 || SharedMediaLayout.this.sharedMediaData[5].loading;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            MessageObject messageObject;
            TLRPC.Document document;
            if (viewHolder.getItemViewType() != 12 || (document = (messageObject = SharedMediaLayout.this.sharedMediaData[5].messages.get(i)).getDocument()) == null) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ContextLinkCell contextLinkCell = (ContextLinkCell) view;
                int i2 = messageObject.messageOwner.date;
                contextLinkCell.needDivider = false;
                contextLinkCell.needShadow = false;
                contextLinkCell.currentDate = i2;
                contextLinkCell.inlineResult = null;
                contextLinkCell.parentObject = messageObject;
                contextLinkCell.documentAttach = document;
                contextLinkCell.photoAttach = null;
                contextLinkCell.mediaWebpage = true;
                contextLinkCell.isForceGif = true;
                contextLinkCell.setAttachType();
                contextLinkCell.documentAttachType = 2;
                contextLinkCell.requestLayout();
                contextLinkCell.fileName = null;
                contextLinkCell.fileExist = false;
                contextLinkCell.resolvingFileName = false;
                contextLinkCell.updateButtonState(false, false);
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.isActionModeShowed) {
                    contextLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    contextLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 11) {
                View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 5, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                return zzkd.m(viewCreateEmptyStubView, viewCreateEmptyStubView, -1);
            }
            ContextLinkCell contextLinkCell = new ContextLinkCell(this.mContext, true, SharedMediaLayout.this.resourcesProvider);
            contextLinkCell.setCanPreviewGif(true);
            return new RecyclerListView.Holder(contextLinkCell);
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ContextLinkCell) {
                ImageReceiver photoImage = ((ContextLinkCell) view).getPhotoImage();
                if (SharedMediaLayout.this.mediaPages[0].selectedType == 5) {
                    photoImage.setAllowStartAnimation(true);
                    photoImage.startAnimation();
                } else {
                    photoImage.setAllowStartAnimation(false);
                    photoImage.stopAnimation();
                }
            }
        }
    }

    public class GroupUsersSearchAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.Chat currentChat;
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private int totalCount = 0;
        int searchCount = 0;

        public GroupUsersSearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0(this));
            this.currentChat = SharedMediaLayout.this.delegate.getCurrentChat();
        }

        private boolean createMenuForParticipant(TLObject tLObject, boolean z, View view) {
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
                TLRPC.TL_chatChannelParticipant tL_chatChannelParticipant = new TLRPC.TL_chatChannelParticipant();
                tL_chatChannelParticipant.channelParticipant = channelParticipant;
                tL_chatChannelParticipant.user_id = MessageObject.getPeerId(channelParticipant.peer);
                tL_chatChannelParticipant.inviter_id = channelParticipant.inviter_id;
                tL_chatChannelParticipant.date = channelParticipant.date;
                tLObject = tL_chatChannelParticipant;
            }
            return SharedMediaLayout.this.delegate.onMemberClick((TLRPC.ChatParticipant) tLObject, true, z, view);
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

        public boolean lambda$onCreateViewHolder$5(ManageChatUserCell manageChatUserCell, boolean z) {
            TLObject item = getItem(((Integer) manageChatUserCell.getTag()).intValue());
            if (item instanceof TLRPC.ChannelParticipant) {
                return createMenuForParticipant((TLRPC.ChannelParticipant) item, !z, manageChatUserCell);
            }
            return false;
        }

        public void lambda$processSearch$2(String str, ArrayList arrayList) {
            long peerId;
            char c;
            Object obj;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), new ArrayList<>());
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
            ArrayList<CharSequence> arrayList2 = new ArrayList<>();
            ArrayList<TLObject> arrayList3 = new ArrayList<>();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLObject tLObject = (TLObject) arrayList.get(i2);
                if (tLObject instanceof TLRPC.ChatParticipant) {
                    peerId = ((TLRPC.ChatParticipant) tLObject).user_id;
                } else {
                    if (!(tLObject instanceof TLRPC.ChannelParticipant)) {
                        break;
                    } else {
                        peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject).peer);
                    }
                }
                TLRPC.User user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(peerId));
                if (user.id == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                    break;
                    break;
                }
                String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                if (lowerCase2.equals(translitString2)) {
                    translitString2 = null;
                }
                int i3 = 0;
                char c2 = 0;
                while (true) {
                    if (i3 >= i) {
                        break;
                        break;
                    }
                    String str2 = strArr[i3];
                    if (lowerCase2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) {
                        c = 1;
                    } else {
                        String publicUsername = UserObject.getPublicUsername(user);
                        c = (publicUsername == null || !publicUsername.startsWith(str2)) ? c2 : (char) 2;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            arrayList2.add(AndroidUtilities.generateSearchName(user.first_name, user.last_name, str2));
                            obj = null;
                        } else {
                            obj = null;
                            arrayList2.add(AndroidUtilities.generateSearchName("@" + UserObject.getPublicUsername(user), null, "@" + str2));
                        }
                        arrayList3.add(tLObject);
                        break;
                    }
                    i3++;
                    c2 = c;
                }
            }
            updateSearchResults(arrayList2, arrayList3);
        }

        public void lambda$processSearch$3(String str) {
            ArrayList arrayList = null;
            this.searchRunnable = null;
            if (!ChatObject.isChannel(this.currentChat) && SharedMediaLayout.this.info != null) {
                arrayList = new ArrayList(SharedMediaLayout.this.info.participants.participants);
            }
            this.searchCount = 2;
            if (arrayList != null) {
                Utilities.searchQueue.postRunnable(new ImageUpdater$$ExternalSyntheticLambda1(this, str, arrayList, 12));
            } else {
                this.searchCount = 1;
            }
            this.searchAdapterHelper.queryServerSearch(str, false, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 1);
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

        public void lambda$search$1(String str) {
            AndroidUtilities.runOnUIThread(new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1(this, str, 1));
        }

        private void updateSearchResults(ArrayList<CharSequence> arrayList, ArrayList<TLObject> arrayList2) {
            AndroidUtilities.runOnUIThread(new ImageUpdater$$ExternalSyntheticLambda1(this, arrayList, arrayList2, 11));
        }

        public TLObject getItem(int i) {
            int size = this.searchAdapterHelper.getGroupSearch().size();
            if (i < 0 || i >= size) {
                return null;
            }
            return this.searchAdapterHelper.getGroupSearch().get(i);
        }

        @Override
        public int getItemCount() {
            return this.totalCount;
        }

        @Override
        public int getItemViewType(int i) {
            return 22;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
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

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.User user;
            SpannableStringBuilder spannableStringBuilder;
            TLObject item = getItem(i);
            if (item instanceof TLRPC.ChannelParticipant) {
                user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer)));
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                user = SharedMediaLayout.this.profileActivity.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
            }
            UserObject.getPublicUsername(user);
            this.searchAdapterHelper.getGroupSearch().size();
            String lastFoundChannel = this.searchAdapterHelper.getLastFoundChannel();
            if (lastFoundChannel != null) {
                String userName = UserObject.getUserName(user);
                spannableStringBuilder = new SpannableStringBuilder(userName);
                int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, lastFoundChannel);
                if (iIndexOfIgnoreCase != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOfIgnoreCase, lastFoundChannel.length() + iIndexOfIgnoreCase, 33);
                }
            } else {
                spannableStringBuilder = null;
            }
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                manageChatUserCell.setTag(Integer.valueOf(i));
                manageChatUserCell.setData(user, spannableStringBuilder, null, false);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 9, 5, true, SharedMediaLayout.this.resourcesProvider);
            manageChatUserCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            manageChatUserCell.setDelegate(new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0(this));
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public void removeUserId(long j) {
            this.searchAdapterHelper.removeUserId(j);
            notifyDataSetChanged();
        }

        public void search(String str, boolean z) {
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
            if (TextUtils.isEmpty(str)) {
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1 sharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1 = new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1(this, str, 0);
            this.searchRunnable = sharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1;
            dispatchQueue.postRunnable(sharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1, 300L);
        }
    }

    public static class InternalListView extends BlurredRecyclerView implements StoriesListPlaceProvider.ClippedView {
        public int hintPaddingBottom;
        public int hintPaddingTop;

        public InternalListView(Context context) {
            super(context);
        }

        @Override
        public void updateClip(int[] iArr) {
            iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.hintPaddingTop;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.hintPaddingBottom;
        }
    }

    public static class MediaPage extends FrameLayout {
        private ClippingImageView animatingImageView;
        private GridLayoutManager animationSupportingLayoutManager;
        private InternalListView animationSupportingListView;
        private StickerEmptyView emptyView;
        public ObjectAnimator fastScrollAnimator;
        public boolean fastScrollEnabled;
        public Runnable fastScrollHideHintRunnable;
        public boolean fastScrollHinWasShown;
        public SharedMediaFastScrollTooltip fastScrollHintView;
        public boolean highlightAnimation;
        public int highlightMessageId;
        public float highlightProgress;
        private IBlur3Capture iBlur3Capture;
        private DefaultItemAnimator itemAnimator;
        public long lastCheckScrollTime;
        private ExtendedGridLayoutManager layoutManager;
        private InternalListView listView;
        private FlickerLoadingView progressView;
        private RecyclerAnimationScrollHelper scrollHelper;
        private RecyclerView.RecycledViewPool searchViewPool;
        public int selectedType;
        private RecyclerView.RecycledViewPool viewPool;

        public MediaPage(Context context) {
            super(context);
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = this.fastScrollHintView;
            if (sharedMediaFastScrollTooltip == null || sharedMediaFastScrollTooltip.getVisibility() != 0) {
                return;
            }
            RecyclerListView.FastScroll fastScroll = this.listView.getFastScroll();
            if (fastScroll != null) {
                float fDp = AndroidUtilities.dp(36.0f) + fastScroll.getScrollBarY();
                if (this.selectedType == 9) {
                    fDp += AndroidUtilities.dp(64.0f);
                }
                int i = this.selectedType;
                if (i == 8 || SharedMediaLayout.isStoryAlbumPageType(i)) {
                    fDp += AndroidUtilities.dp(42.0f);
                }
                float measuredWidth = (getMeasuredWidth() - this.fastScrollHintView.getMeasuredWidth()) - AndroidUtilities.dp(16.0f);
                SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip2 = this.fastScrollHintView;
                sharedMediaFastScrollTooltip2.setPivotX(sharedMediaFastScrollTooltip2.getMeasuredWidth());
                this.fastScrollHintView.setPivotY(0.0f);
                this.fastScrollHintView.setTranslationX(measuredWidth);
                this.fastScrollHintView.setTranslationY(fDp);
            }
            if (fastScroll.getProgress() > 0.85f) {
                SharedMediaLayout.showFastScrollHint(this, null, false);
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.animationSupportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
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

        public MediaSearchAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        public void lambda$queryServerSearch$0(int i, ArrayList arrayList, String str) {
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
                                SharedMediaLayout.this.mediaPages[i2].emptyView.title.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, str));
                                SharedMediaLayout.this.mediaPages[i2].emptyView.button.setVisibility(8);
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

        public void lambda$queryServerSearch$1(int i, int i2, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            ArrayList arrayList = new ArrayList();
            if (tL_error == null) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                    TLRPC.Message message = messages_messages.messages.get(i3);
                    if (i == 0 || message.id <= i) {
                        arrayList.add(new MessageObject(SharedMediaLayout.this.profileActivity.getCurrentAccount(), message, false, true));
                    }
                }
            }
            AndroidUtilities.runOnUIThread(new ShareTopView$$ExternalSyntheticLambda3(this, i2, arrayList, str, 12));
        }

        public void lambda$search$2(String str, ArrayList arrayList) {
            boolean zContains;
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
                for (int i3 = 0; i3 < i; i3++) {
                    String str3 = strArr[i3];
                    String documentName = messageObject.getDocumentName();
                    if (documentName != null && documentName.length() != 0) {
                        if (documentName.toLowerCase().contains(str3)) {
                            arrayList2.add(messageObject);
                            break;
                        }
                        if (this.currentType == 4) {
                            TLRPC.Document document = messageObject.type == 0 ? MessageObject.getMedia(messageObject.messageOwner).webpage.document : MessageObject.getMedia(messageObject.messageOwner).document;
                            int i4 = 0;
                            while (true) {
                                if (i4 >= document.attributes.size()) {
                                    zContains = false;
                                    break;
                                }
                                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i4);
                                if (documentAttribute instanceof TLRPC.TL_documentAttributeAudio) {
                                    String str4 = documentAttribute.performer;
                                    zContains = str4 != null ? str4.toLowerCase().contains(str3) : false;
                                    if (!zContains && (str2 = documentAttribute.title) != null) {
                                        zContains = str2.toLowerCase().contains(str3);
                                        break;
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                i4++;
                            }
                            if (zContains) {
                                arrayList2.add(messageObject);
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            updateSearchResults(arrayList2);
        }

        public void lambda$search$3(String str) {
            int i;
            if (!SharedMediaLayout.this.sharedMediaData[this.currentType].messages.isEmpty() && ((i = this.currentType) == 1 || i == 4)) {
                MessageObject messageObject = SharedMediaLayout.this.sharedMediaData[this.currentType].messages.get(SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() - 1);
                queryServerSearch(str, messageObject.getId(), messageObject.getDialogId(), SharedMediaLayout.this.dialog_id == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId() ? messageObject.getSavedDialogId() : 0L);
            } else if (this.currentType == 3) {
                queryServerSearch(str, 0, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.topicId);
            }
            int i2 = this.currentType;
            if (i2 == 1 || i2 == 4) {
                ArrayList arrayList = new ArrayList(SharedMediaLayout.this.sharedMediaData[this.currentType].messages);
                this.searchesInProgress++;
                Utilities.searchQueue.postRunnable(new ShareAlert$$ExternalSyntheticLambda12(this, str, arrayList, 3));
            }
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
                            SharedMediaLayout.this.mediaPages[i].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            SharedMediaLayout.this.mediaPages[i].emptyView.button.setVisibility(8);
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

        private void updateSearchResults(ArrayList<MessageObject> arrayList) {
            AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(16, this, arrayList));
        }

        public MessageObject getItem(int i) {
            return i < this.searchResult.size() ? this.searchResult.get(i) : this.globalSearch.get(i - this.searchResult.size());
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.globalSearch.size();
            return size2 != 0 ? size + size2 : size;
        }

        @Override
        public int getItemViewType(int i) {
            return 24;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return this.globalSearch.size() + this.searchResult.size() != 0;
        }

        public boolean isGlobalSearch(int i) {
            int size = this.searchResult.size();
            return (i < 0 || i >= size) && i > size && i <= this.globalSearch.size() + size;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2 = this.currentType;
            if (i2 == 1) {
                View view = viewHolder.itemView;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject item = getItem(i);
                    sharedDocumentCell.setDocument(item, i != getItemCount() - 1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sharedMediaLayout.selectedFiles[(item.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 != 3) {
                if (i2 == 4) {
                    View view2 = viewHolder.itemView;
                    if (view2 instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                        MessageObject item2 = getItem(i);
                        sharedAudioCell.setMessageObject(item2, i != getItemCount() - 1);
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        if (sharedMediaLayout2.isActionModeShowed) {
                            sharedAudioCell.setChecked(sharedMediaLayout2.selectedFiles[(item2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                            return;
                        } else {
                            sharedAudioCell.setChecked(false, !sharedMediaLayout2.scrolling);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            View view3 = viewHolder.itemView;
            if (view3 instanceof SharedLinkCell) {
                SharedLinkCell sharedLinkCell = (SharedLinkCell) view3;
                MessageObject item3 = getItem(i);
                sharedLinkCell.needDivider = i != getItemCount() - 1;
                sharedLinkCell.resetPressedLink();
                sharedLinkCell.message = item3;
                sharedLinkCell.requestLayout();
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                if (sharedMediaLayout3.isActionModeShowed) {
                    sharedLinkCell.setChecked(sharedMediaLayout3.selectedFiles[(item3.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (item3.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(item3.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    sharedLinkCell.setChecked(false, !sharedMediaLayout3.scrolling);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View sharedDocumentCell;
            int i2 = this.currentType;
            int i3 = 0;
            if (i2 == 1) {
                sharedDocumentCell = new SharedDocumentCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
            } else if (i2 == 4) {
                sharedDocumentCell = new SharedAudioCell(this.mContext, i3, SharedMediaLayout.this.resourcesProvider) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                            if (messageObject.isMusic()) {
                                return MediaController.getInstance().setPlaylist(MediaSearchAdapter.this.searchResult, messageObject, SharedMediaLayout.this.mergeDialogId);
                            }
                            return false;
                        }
                        boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                        MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? MediaSearchAdapter.this.searchResult : null, false);
                        if (messageObject.isRoundVideo()) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                        return zPlayMessage;
                    }
                };
            } else {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                sharedDocumentCell = sharedLinkCell;
            }
            sharedDocumentCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedDocumentCell);
        }

        public void queryServerSearch(final String str, final int i, long j, long j2) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
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
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = 50;
            tL_messages_search.offset_id = i;
            int i2 = this.currentType;
            if (i2 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i2 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_search.q = str;
            tL_messages_search.peer = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j);
            if (j2 != 0) {
                if (j == SharedMediaLayout.this.profileActivity.getUserConfig().getClientUserId()) {
                    tL_messages_search.flags |= 4;
                    tL_messages_search.saved_peer_id = SharedMediaLayout.this.profileActivity.getMessagesController().getInputPeer(j2);
                } else {
                    tL_messages_search.flags |= 2;
                    tL_messages_search.top_msg_id = (int) j2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            final int i3 = this.lastReqId + 1;
            this.lastReqId = i3;
            this.searchesInProgress++;
            this.reqId = SharedMediaLayout.this.profileActivity.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$queryServerSearch$1(i, i3, str, tLObject, tL_error);
                }
            }, 2);
            SharedMediaLayout.this.profileActivity.getConnectionsManager().bindRequestToGuid(this.reqId, SharedMediaLayout.this.profileActivity.getClassGuid());
        }

        public void search(String str, boolean z) {
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
                UndoView$$ExternalSyntheticLambda3 undoView$$ExternalSyntheticLambda3 = new UndoView$$ExternalSyntheticLambda3(17, this, str);
                this.searchRunnable = undoView$$ExternalSyntheticLambda3;
                AndroidUtilities.runOnUIThread(undoView$$ExternalSyntheticLambda3, 300L);
                return;
            }
            if (this.searchResult.isEmpty() && this.globalSearch.isEmpty() && this.searchesInProgress == 0) {
                return;
            }
            this.searchResult.clear();
            this.globalSearch.clear();
            if (this.reqId != 0) {
                SharedMediaLayout.this.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
                this.searchesInProgress--;
            }
        }
    }

    public static class MoreRecommendationsCell extends FrameLayout {
        private final ButtonWithCounterView button;
        public final ProfileSearchCell channelCell;
        private final int currentAccount;
        private final View gradientView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final LinkSpanDrawable.LinksTextView textView;

        public MoreRecommendationsCell(int i, Context context, boolean z, Theme.ResourcesProvider resourcesProvider, Runnable runnable) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, resourcesProvider);
            this.channelCell = profileSearchCell;
            profileSearchCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
            addView(profileSearchCell, LayoutHelper.createFrame(-1, -2.0f));
            View view = new View(context);
            this.gradientView = view;
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i2 = Theme.key_windowBackgroundWhite;
            view.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(0.4f, Theme.getColor(i2, resourcesProvider)), Theme.getColor(i2, resourcesProvider)}));
            addView(view, LayoutHelper.createFrame(-1, 60.0f));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
            this.button = buttonWithCounterView;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(z ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
            spannableStringBuilder.append((CharSequence) " ");
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            buttonWithCounterView.setText(spannableStringBuilder, false);
            addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
            buttonWithCounterView.setOnClickListener(new ArchiveHelp$$ExternalSyntheticLambda0(1, runnable));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            this.textView = linksTextView;
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextAlignment(4);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
            SpannableStringBuilder spannableStringBuilderPremiumText = AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new ChatAttachAlert$1$$ExternalSyntheticLambda6(1, runnable));
            SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i).recommendedChannelsLimitPremium);
            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
            linksTextView.setText(AndroidUtilities.replaceCharSequence("%s", spannableStringBuilderPremiumText, spannableString2));
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
        }

        public static void lambda$new$0(Runnable runnable, View view) {
            if (runnable != null) {
                runnable.run();
            }
        }

        public static void lambda$new$1(Runnable runnable) {
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
        }
    }

    public static class Period {
        int date;
        public String formatedDate;
        int maxId;
        public int startOffset;

        public Period(TLRPC.TL_searchResultPosition tL_searchResultPosition) {
            int i = tL_searchResultPosition.date;
            this.date = i;
            this.maxId = tL_searchResultPosition.msg_id;
            this.startOffset = tL_searchResultPosition.offset;
            this.formatedDate = LocaleController.formatYearMont(i, true);
        }
    }

    public class PollAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        public RecyclerListView listView;
        private final Context mContext;
        private final ChatMessageCell.ChatMessageCellDelegate messageDelegate;
        private final Theme.ResourcesProvider resourcesProvider;
        private final ArrayList<MessageObject> pollsToCheck = new ArrayList<>(10);
        private final ArrayList<MessageObject> groupedByDay = new ArrayList<>();

        public PollAdapter(Context context, final int i, final Theme.ResourcesProvider resourcesProvider) {
            this.mContext = context;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            this.messageDelegate = new ChatMessageCell.ChatMessageCellDelegate() {
                private TLRPC.TL_message copy(TLRPC.Message message) {
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    tL_message.id = message.id;
                    tL_message.from_id = message.from_id;
                    tL_message.from_boosts_applied = message.from_boosts_applied;
                    tL_message.peer_id = message.peer_id;
                    tL_message.saved_peer_id = message.saved_peer_id;
                    tL_message.date = message.date;
                    tL_message.expire_date = message.expire_date;
                    tL_message.action = message.action;
                    tL_message.message = message.message;
                    tL_message.flags = message.flags;
                    tL_message.flags2 = message.flags2;
                    tL_message.mentioned = message.mentioned;
                    tL_message.media_unread = message.media_unread;
                    tL_message.out = message.out;
                    tL_message.unread = message.unread;
                    tL_message.entities = message.entities;
                    tL_message.via_bot_name = message.via_bot_name;
                    tL_message.reply_markup = message.reply_markup;
                    tL_message.views = message.views;
                    tL_message.forwards = message.forwards;
                    tL_message.replies = message.replies;
                    tL_message.edit_date = message.edit_date;
                    tL_message.silent = message.silent;
                    tL_message.post = message.post;
                    tL_message.from_scheduled = message.from_scheduled;
                    tL_message.legacy = message.legacy;
                    tL_message.edit_hide = message.edit_hide;
                    tL_message.pinned = message.pinned;
                    tL_message.fwd_from = message.fwd_from;
                    tL_message.via_bot_id = message.via_bot_id;
                    tL_message.via_business_bot_id = message.via_business_bot_id;
                    tL_message.reply_to = message.reply_to;
                    tL_message.post_author = message.post_author;
                    tL_message.grouped_id = message.grouped_id;
                    tL_message.reactions = message.reactions;
                    tL_message.restriction_reason = message.restriction_reason;
                    tL_message.ttl_period = message.ttl_period;
                    tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
                    tL_message.effect = message.effect;
                    tL_message.noforwards = message.noforwards;
                    tL_message.invert_media = message.invert_media;
                    tL_message.offline = message.offline;
                    tL_message.factcheck = message.factcheck;
                    tL_message.send_state = message.send_state;
                    tL_message.fwd_msg_id = message.fwd_msg_id;
                    tL_message.params = message.params;
                    tL_message.random_id = message.random_id;
                    tL_message.local_id = message.local_id;
                    tL_message.dialog_id = message.dialog_id;
                    tL_message.ttl = message.ttl;
                    tL_message.destroyTime = message.destroyTime;
                    tL_message.destroyTimeMillis = message.destroyTimeMillis;
                    tL_message.layer = message.layer;
                    tL_message.seq_in = message.seq_in;
                    tL_message.seq_out = message.seq_out;
                    tL_message.with_my_score = message.with_my_score;
                    tL_message.replyMessage = message.replyMessage;
                    tL_message.reqId = message.reqId;
                    tL_message.realId = message.realId;
                    tL_message.stickerVerified = message.stickerVerified;
                    tL_message.isThreadMessage = message.isThreadMessage;
                    tL_message.voiceTranscription = message.voiceTranscription;
                    tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
                    tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
                    tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
                    tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
                    tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
                    tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
                    tL_message.originalLanguage = message.originalLanguage;
                    tL_message.translatedToLanguage = message.translatedToLanguage;
                    tL_message.translatedText = message.translatedText;
                    tL_message.replyStory = message.replyStory;
                    tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
                    return tL_message;
                }

                @Override
                public boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public boolean canPerformActions() {
                    return true;
                }

                @Override
                public boolean canPerformReply() {
                    return canPerformActions();
                }

                @Override
                public boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2) {
                    return false;
                }

                @Override
                public void didLongPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                    return false;
                }

                @Override
                public boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                    return false;
                }

                @Override
                public void didPressAboutRevenueSharingAds() {
                }

                @Override
                public void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressAdmin(ChatMessageCell chatMessageCell) {
                }

                @Override
                public boolean didPressAnimatedEmoji(ChatMessageCell chatMessageCell, AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public void didPressAppUpdateButton() {
                }

                @Override
                public void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                }

                @Override
                public void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
                }

                @Override
                public void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressCodeCopy(ChatMessageCell chatMessageCell, MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public void didPressCommentButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                public void didPressDialogButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressEffect(ChatMessageCell chatMessageCell) {
                }

                public void didPressEmojiStatus() {
                }

                @Override
                public void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public void didPressFactCheck(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i2, int i3) {
                }

                @Override
                public void didPressGiveawayChatButton(ChatMessageCell chatMessageCell, int i2) {
                }

                @Override
                public void didPressGroupImage(ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, TLRPC.MessageExtendedMedia messageExtendedMedia, float f, float f2) {
                }

                @Override
                public void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressHint(ChatMessageCell chatMessageCell, int i2) {
                }

                @Override
                public void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                }

                @Override
                public void didPressInstantButton(ChatMessageCell chatMessageCell, int i2) {
                    if (i2 == 80) {
                        PollVotesAlert.showForPoll(SharedMediaLayout.this.profileActivity, chatMessageCell.getMessageObject());
                    }
                }

                @Override
                public void didPressMoreChannelRecommendations(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public void didPressPollMedia(final ChatMessageCell chatMessageCell, ImageReceiver imageReceiver, final TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, float f, float f2, int i2) {
                    int size;
                    TLRPC.Document document;
                    TLRPC.PollResults pollResults;
                    TLRPC.MessageMedia messageMedia2;
                    TLRPC.Document document2;
                    TLRPC.Document document3;
                    TLRPC.TL_textWithEntities tL_textWithEntities;
                    MessageObject messageObject = chatMessageCell.getMessageObject();
                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
                    if (messageMedia == null || messageObject == null || !(media instanceof TLRPC.TL_messageMediaPoll)) {
                        return;
                    }
                    final TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
                    if (messageMedia.geo != null) {
                        if (AndroidUtilities.isMapsInstalled(SharedMediaLayout.this.profileActivity)) {
                            LocationActivity locationActivity = new LocationActivity(3) {
                                @Override
                                public boolean disablePermissionCheck() {
                                    return true;
                                }
                            };
                            locationActivity.setResourceProvider(resourcesProvider);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.local_id = -1;
                            tL_message.peer_id = MessagesController.getInstance(i).getPeer(SharedMediaLayout.this.dialog_id);
                            TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                            tL_messageMediaGeo.geo = messageMedia.geo;
                            String str = messageMedia.address;
                            if (str == null) {
                                str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                            }
                            tL_messageMediaGeo.address = str;
                            tL_message.media = tL_messageMediaGeo;
                            locationActivity.setSharingAllowed(false);
                            locationActivity.setMessageObject(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                            SharedMediaLayout.this.profileActivity.presentFragment(locationActivity);
                            return;
                        }
                        return;
                    }
                    if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                        ContentPreviewViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity.getParentActivity());
                        ContentPreviewViewer.getInstance().setDelegate(new ContentPreviewViewer.ContentPreviewViewerDelegate() {
                            @Override
                            public final void addCaptionToGif(Object obj, Object obj2, boolean z, int i3, int i4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj, obj2, z, i3, i4);
                            }

                            @Override
                            public final void addToFavoriteSelected(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str2);
                            }

                            @Override
                            public final boolean can() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
                            }

                            @Override
                            public final boolean canAddCaption(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document4);
                            }

                            @Override
                            public final boolean canDeleteSticker(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document4);
                            }

                            @Override
                            public final boolean canEditSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canEditSticker(this);
                            }

                            @Override
                            public boolean canSchedule() {
                                return false;
                            }

                            @Override
                            public final boolean canSendSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
                            }

                            @Override
                            public final Boolean canSetAsStatus(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document4);
                            }

                            @Override
                            public final void copyEmoji(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document4);
                            }

                            @Override
                            public final void deleteSticker(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, document4);
                            }

                            @Override
                            public final void editSticker(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, document4);
                            }

                            @Override
                            public final ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getCustomItemOptions(this, viewGroup, view);
                            }

                            @Override
                            public long getDialogId() {
                                return SharedMediaLayout.this.dialog_id;
                            }

                            @Override
                            public TLRPC.TL_messageMediaPoll getPoll() {
                                return tL_messageMediaPoll;
                            }

                            @Override
                            public TLRPC.PollAnswer getPollAnswer() {
                                return pollAnswer;
                            }

                            @Override
                            public MessageObject getPollMessageObject() {
                                return chatMessageCell.getMessageObject();
                            }

                            @Override
                            public final String getQuery(boolean z) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z);
                            }

                            @Override
                            public final void gifAddedOrDeleted() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
                            }

                            @Override
                            public boolean isInScheduleMode() {
                                return false;
                            }

                            @Override
                            public final boolean isPhotoEditor() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
                            }

                            @Override
                            public final boolean isReplacedSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
                            }

                            @Override
                            public final boolean isSettingIntroSticker() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
                            }

                            @Override
                            public final boolean isStickerEditor() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
                            }

                            @Override
                            public final boolean needCopy(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document4);
                            }

                            @Override
                            public final boolean needMenu() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needMenu(this);
                            }

                            @Override
                            public final boolean needOpen() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
                            }

                            @Override
                            public final boolean needRemove() {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
                            }

                            @Override
                            public final boolean needRemoveFromRecent(TLRPC.Document document4) {
                                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document4);
                            }

                            @Override
                            public boolean needSend(int i3) {
                                return false;
                            }

                            @Override
                            public final void newStickerPackSelected(CharSequence charSequence, String str2, Utilities.Callback callback) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str2, callback);
                            }

                            @Override
                            public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
                                if (inputStickerSet == null || SharedMediaLayout.this.getContext() == null) {
                                    return;
                                }
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                                tL_inputStickerSetID.id = inputStickerSet.id;
                                StickersAlert stickersAlert = new StickersAlert(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, tL_inputStickerSetID, null, null, resourcesProvider, false);
                                stickersAlert.setCalcMandatoryInsets(true);
                                stickersAlert.setClearsInputField(z);
                                stickersAlert.show();
                            }

                            @Override
                            public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
                            }

                            @Override
                            public final void removeFromRecent(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document4);
                            }

                            @Override
                            public final void resetTouch() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
                            }

                            @Override
                            public void retractVote() {
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), null, null);
                            }

                            @Override
                            public final void sendEmoji(TLRPC.Document document4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document4);
                            }

                            @Override
                            public final void sendGif(Object obj, Object obj2, boolean z, int i3, int i4) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z, i3, i4);
                            }

                            @Override
                            public final void sendIntroSticker() {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendIntroSticker(this);
                            }

                            @Override
                            public final void sendSticker(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str2);
                            }

                            @Override
                            public void sendVote() {
                                ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
                                arrayList.add(pollAnswer);
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                            }

                            @Override
                            public final void setAsEmojiStatus(TLRPC.Document document4, Integer num) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document4, num);
                            }

                            @Override
                            public final void setIntroSticker(String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str2);
                            }

                            @Override
                            public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str2) {
                                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str2);
                            }

                            @Override
                            public void sendSticker(TLRPC.Document document4, String str2, Object obj, boolean z, int i3, int i4) {
                            }
                        });
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                        TLRPC.Document document4 = messageMedia.document;
                        contentPreviewViewer.open(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, chatMessageCell.getMessageObject(), resourcesProvider, 200);
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                    TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                    if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                        size = messageMedia3 == messageMedia ? arrayList2.size() : -1;
                        TLRPC.TL_message tL_messageCopy = copy(message);
                        tL_messageCopy.media = messageMedia3;
                        arrayList2.add(new MessageObject(i, tL_messageCopy, false, true) {
                            @Override
                            public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                return false;
                            }
                        });
                        arrayList.add(-2);
                    } else {
                        size = -1;
                    }
                    if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                        if (messageMedia2 == messageMedia) {
                            size = arrayList2.size();
                        }
                        TLRPC.TL_message tL_messageCopy2 = copy(message);
                        tL_messageCopy2.media = messageMedia2;
                        TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                        tL_messageCopy2.message = pollResults2.solution;
                        tL_messageCopy2.entities = pollResults2.solution_entities;
                        arrayList2.add(new MessageObject(i, tL_messageCopy2, false, true) {
                            @Override
                            public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                return false;
                            }
                        });
                        arrayList.add(-3);
                    }
                    TlUtils.calculateAnswerShuffleHash(tL_messageMediaPoll.poll, UserConfig.getInstance(i).getClientUserId());
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                    if (arrayList3 == null) {
                        arrayList3 = poll.answers;
                    }
                    int size2 = size;
                    for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                        TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i3);
                        TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                        if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                            if (pollAnswer2.unshuffled_index == i2) {
                                size2 = arrayList2.size();
                            }
                            TLRPC.TL_message tL_messageCopy3 = copy(message);
                            tL_messageCopy3.media = messageMedia4;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                            tL_messageCopy3.message = tL_textWithEntities2.text;
                            tL_messageCopy3.entities = tL_textWithEntities2.entities;
                            arrayList2.add(new MessageObject(i, tL_messageCopy3, false, true) {
                                @Override
                                public boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                                    return false;
                                }
                            });
                            arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                        }
                    }
                    if (size2 <= -1 || arrayList2.isEmpty()) {
                        return;
                    }
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity, resourcesProvider);
                    PhotoViewer.getInstance().openPhoto(arrayList2, size2, SharedMediaLayout.this.dialog_id, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() {
                        @Override
                        public boolean forceAllInGroup() {
                            return true;
                        }

                        @Override
                        public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject2, TLRPC.FileLocation fileLocation, int i4, boolean z, boolean z2) {
                            ImageReceiver photoImage;
                            ChatMessageCell chatMessageCell2;
                            MessageObject messageObject3;
                            RecyclerListView recyclerListView = PollAdapter.this.listView;
                            if (recyclerListView == null) {
                                return null;
                            }
                            int childCount = recyclerListView.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                View childAt = PollAdapter.this.listView.getChildAt(i5);
                                if (!(childAt instanceof ChatMessageCell) || messageObject2 == null || (messageObject3 = (chatMessageCell2 = (ChatMessageCell) childAt).getMessageObject()) == null || messageObject3.getId() != messageObject2.getId()) {
                                    photoImage = null;
                                } else {
                                    ArrayList<Integer> arrayList4 = messageObject3.pollMediaMapping;
                                    photoImage = (arrayList4 == null || i4 < 0 || i4 >= arrayList4.size()) ? chatMessageCell2.getPhotoImage(i4) : chatMessageCell2.getPhotoImage(messageObject3.pollMediaMapping.get(i4).intValue());
                                }
                                if (photoImage != null) {
                                    int[] iArr = new int[2];
                                    childAt.getLocationInWindow(iArr);
                                    PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                    placeProviderObject.viewX = iArr[0];
                                    placeProviderObject.viewY = childAt.getPaddingTop() + iArr[1];
                                    placeProviderObject.parentView = PollAdapter.this.listView;
                                    placeProviderObject.animatingImageView = null;
                                    placeProviderObject.imageReceiver = photoImage;
                                    if (z) {
                                        placeProviderObject.thumb = photoImage.getBitmapSafe();
                                    }
                                    placeProviderObject.radius = photoImage.getRoundRadius(true);
                                    placeProviderObject.clipTopAddition = 0;
                                    placeProviderObject.clipBottomAddition = 0;
                                    return placeProviderObject;
                                }
                            }
                            return null;
                        }
                    });
                }

                @Override
                public void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                }

                @Override
                public void didPressReplyMessage(ChatMessageCell chatMessageCell, int i2, float f, float f2, boolean z) {
                }

                @Override
                public void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document, float f, float f2) {
                }

                @Override
                public void didPressShowMore(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressSideButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public void didPressSummarize(ChatMessageCell chatMessageCell, boolean z) {
                }

                @Override
                public void didPressTime(ChatMessageCell chatMessageCell) {
                }

                @Override
                public boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                    return false;
                }

                public void didPressTopicButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                }

                @Override
                public void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2, boolean z) {
                }

                @Override
                public void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                }

                @Override
                public void didPressViaBot(ChatMessageCell chatMessageCell, String str) {
                }

                @Override
                public void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                }

                @Override
                public void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList<TLRPC.PollAnswer> arrayList, int i2, int i3, int i4) {
                    SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                }

                @Override
                public void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                    Browser.openUrl(chatMessageCell.getContext(), str);
                }

                @Override
                public void didQuickShareEnd(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public void didQuickShareStart(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public void didStartVideoStream(MessageObject messageObject) {
                }

                @Override
                public void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                }

                @Override
                public void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, boolean z, Runnable runnable) {
                }

                @Override
                public boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return Theme.ResourcesProvider.CC.$default$doNotShowLoadingReply(messageObject);
                }

                @Override
                public void drawPollMode(Canvas canvas, ChatMessageCell chatMessageCell) {
                }

                public boolean drawingVideoPlayerContainer() {
                    return false;
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                }

                @Override
                public void forceUpdateNoAnimation(ChatMessageCell chatMessageCell, boolean z) {
                }

                @Override
                public int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                    return 0;
                }

                @Override
                public String getAdminRank(long j) {
                    return null;
                }

                @Override
                public int getChatMode() {
                    return 0;
                }

                @Override
                public ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                    return null;
                }

                @Override
                public CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                    return null;
                }

                @Override
                public TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public void invalidateBlur() {
                }

                @Override
                public boolean isAdmin(long j) {
                    return false;
                }

                @Override
                public boolean isLandscape() {
                    return false;
                }

                @Override
                public boolean isOwner(long j) {
                    return false;
                }

                @Override
                public boolean isProgressLoading(ChatMessageCell chatMessageCell, int i2) {
                    return false;
                }

                @Override
                public boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                }

                @Override
                public boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject, boolean z) {
                    return false;
                }

                @Override
                public void needReloadPolls() {
                }

                @Override
                public void needShowPremiumBulletin(int i2) {
                }

                public void needShowPremiumFeatures(String str) {
                }

                @Override
                public boolean onAccessibilityAction(int i2, Bundle bundle) {
                    return false;
                }

                @Override
                public void onDiceFinished() {
                }

                @Override
                public boolean openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                    return false;
                }

                @Override
                public void setShouldNotRepeatSticker(MessageObject messageObject) {
                }

                @Override
                public boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                    return false;
                }

                @Override
                public boolean shouldRepeatSticker(MessageObject messageObject) {
                    return true;
                }

                public boolean shouldShowDialogButton(ChatMessageCell chatMessageCell) {
                    return false;
                }

                public boolean shouldShowTopicButton(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public void videoTimerReached() {
                }

                @Override
                public void forceUpdate(ChatMessageCell chatMessageCell, boolean z, boolean z2) {
                    forceUpdate(chatMessageCell, z);
                }
            };
            regroup();
        }

        private MessageObject action(int i) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            long j = i;
            tL_message.message = LocaleController.formatDateChat(j);
            tL_message.id = 0;
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(j * 1000);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
            MessageObject messageObject = new MessageObject(this.currentAccount, tL_message, false, false);
            messageObject.type = 10;
            messageObject.contentType = 1;
            messageObject.isDateObject = true;
            return messageObject;
        }

        private void regroup() {
            this.groupedByDay.clear();
            ArrayList<MessageObject> messages = SharedMediaLayout.this.sharedMediaData[8].getMessages();
            int i = 0;
            for (int i2 = 0; i2 < messages.size(); i2++) {
                MessageObject messageObject = messages.get(i2);
                if (messageObject.dateKeyInt != i) {
                    this.groupedByDay.add(action(messageObject.messageOwner.date));
                    i = messageObject.dateKeyInt;
                }
                this.groupedByDay.add(messageObject);
            }
        }

        public void destroy() {
            this.pollsToCheck.clear();
            MessagesController.getInstance(this.currentAccount).addToPollsQueue(SharedMediaLayout.this.dialog_id, this.pollsToCheck);
        }

        @Override
        public int getItemCount() {
            return this.groupedByDay.size();
        }

        @Override
        public int getItemViewType(int i) {
            if (i < 0 || i >= this.groupedByDay.size()) {
                return 0;
            }
            return this.groupedByDay.get(i).contentType;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void notifyDataSetChanged() {
            regroup();
            super.notifyDataSetChanged();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= this.groupedByDay.size()) {
                return;
            }
            MessageObject messageObject = this.groupedByDay.get(i);
            if (viewHolder.getItemViewType() == 0) {
                ((ChatMessageCell) viewHolder.itemView).setMessageObject(messageObject, null, false, false, false);
            } else {
                ((ChatActionCell) viewHolder.itemView).setMessageObject(messageObject);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return new RecyclerListView.Holder(new ChatActionCell(this.mContext, false, this.resourcesProvider));
            }
            ChatMessageCell chatMessageCell = new ChatMessageCell(this.mContext, this.currentAccount, false, null, this.resourcesProvider) {
                @Override
                public boolean isPressed() {
                    return false;
                }

                @Override
                public void onFactorChangeFinished(int i2, float f, FactorAnimator factorAnimator) {
                }
            };
            chatMessageCell.setDelegate(this.messageDelegate);
            return new RecyclerListView.Holder(chatMessageCell);
        }

        public void onScrolled(RecyclerListView recyclerListView) {
            this.pollsToCheck.clear();
            for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                View childAt = recyclerListView.getChildAt(i);
                if (childAt instanceof ChatMessageCell) {
                    this.pollsToCheck.add(((ChatMessageCell) childAt).getMessageObject());
                }
            }
            MessagesController.getInstance(this.currentAccount).addToPollsQueue(SharedMediaLayout.this.dialog_id, this.pollsToCheck);
        }

        public void update(RecyclerListView recyclerListView, long j, TLRPC.TL_poll tL_poll, TLRPC.PollResults pollResults) {
            for (int i = 0; i < this.groupedByDay.size(); i++) {
                MessageObject messageObject = this.groupedByDay.get(i);
                if (messageObject != null && messageObject.getPollId() == j) {
                    TLRPC.MessageMedia messageMedia = messageObject.messageOwner.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                        if (tL_poll != null) {
                            tL_messageMediaPoll.poll = tL_poll;
                        }
                        MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                        lambda$onBindViewHolder$31(i);
                    }
                }
            }
        }
    }

    public class SavedDialogsAdapter extends RecyclerListView.SelectionAdapter {
        public RecyclerListView attachedToRecyclerView;
        private final SavedMessagesController controller;
        private final Context mContext;
        private boolean orderChanged;
        private final ArrayList<SavedMessagesController.SavedDialog> oldDialogs = new ArrayList<>();
        private final ArrayList<SavedMessagesController.SavedDialog> dialogs = new ArrayList<>();
        private Runnable notifyOrderUpdate = new ShareAlert$23$$ExternalSyntheticLambda0(this, 4);
        public final RecyclerView.RecycledViewPool viewPool = new RecyclerView.RecycledViewPool();
        public final ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
            private SavedMessagesController.SavedDialog getDialog(RecyclerView.ViewHolder viewHolder) {
                int adapterPosition;
                if (viewHolder != null && (adapterPosition = viewHolder.getAdapterPosition()) >= 0 && adapterPosition < SavedDialogsAdapter.this.dialogs.size()) {
                    return (SavedMessagesController.SavedDialog) SavedDialogsAdapter.this.dialogs.get(adapterPosition);
                }
                return null;
            }

            @Override
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }

            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                if (!SharedMediaLayout.this.isActionModeShowed || recyclerView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
                SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                return (dialog == null || !dialog.pinned) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
            }

            @Override
            public boolean isLongPressDragEnabled() {
                return true;
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                if (SharedMediaLayout.this.isActionModeShowed && recyclerView.getAdapter() != SharedMediaLayout.this.savedMessagesSearchAdapter) {
                    SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                    SavedMessagesController.SavedDialog dialog2 = getDialog(viewHolder2);
                    if (dialog != null && dialog2 != null && dialog.pinned && dialog2.pinned) {
                        int adapterPosition = viewHolder.getAdapterPosition();
                        int adapterPosition2 = viewHolder2.getAdapterPosition();
                        SavedDialogsAdapter.this.dialogs.remove(adapterPosition);
                        SavedDialogsAdapter.this.dialogs.add(adapterPosition2, dialog);
                        SavedDialogsAdapter.this.notifyItemMoved(adapterPosition, adapterPosition2);
                        SavedDialogsAdapter.this.orderChanged = true;
                        return true;
                    }
                }
                return false;
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                RecyclerListView recyclerListView;
                if (viewHolder != null && (recyclerListView = SavedDialogsAdapter.this.attachedToRecyclerView) != null) {
                    recyclerListView.hideSelector(false);
                }
                if (i == 0) {
                    AndroidUtilities.cancelRunOnUIThread(SavedDialogsAdapter.this.notifyOrderUpdate);
                    AndroidUtilities.runOnUIThread(SavedDialogsAdapter.this.notifyOrderUpdate, 300L);
                }
                super.onSelectedChanged(viewHolder, i);
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            }
        });
        public final HashSet<Long> selectedDialogs = new HashSet<>();

        public SavedDialogsAdapter(Context context) {
            this.mContext = context;
            SavedMessagesController savedMessagesController = SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController();
            this.controller = savedMessagesController;
            if (SharedMediaLayout.this.includeSavedDialogs()) {
                savedMessagesController.loadDialogs(false);
            }
            setHasStableIds(true);
            update(false);
        }

        public void lambda$new$0() {
            if (this.orderChanged) {
                this.orderChanged = false;
                ArrayList<Long> arrayList = new ArrayList<>();
                for (int i = 0; i < this.dialogs.size(); i++) {
                    if (this.dialogs.get(i).pinned) {
                        arrayList.add(Long.valueOf(this.dialogs.get(i).dialogId));
                    }
                }
                SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController().updatePinnedOrder(arrayList);
            }
        }

        @Override
        public int getItemCount() {
            return this.dialogs.size();
        }

        @Override
        public long getItemId(int i) {
            return (i < 0 || i >= this.dialogs.size()) ? i : this.dialogs.get(i).dialogId;
        }

        @Override
        public int getItemViewType(int i) {
            return 13;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                SavedMessagesController.SavedDialog savedDialog = this.dialogs.get(i);
                dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                dialogCell.isSavedDialogCell = true;
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), false);
                dialogCell.useSeparator = i + 1 < getItemCount();
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(null, this.mContext, false, true) {
                {
                    int i2 = UserConfig.selectedAccount;
                }

                @Override
                public boolean getIsPinned() {
                    int childAdapterPosition;
                    RecyclerListView recyclerListView = SavedDialogsAdapter.this.attachedToRecyclerView;
                    if (recyclerListView == null) {
                        return false;
                    }
                    RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    if (adapter != savedDialogsAdapter || (childAdapterPosition = savedDialogsAdapter.attachedToRecyclerView.getChildAdapterPosition(this)) < 0 || childAdapterPosition >= SavedDialogsAdapter.this.dialogs.size()) {
                        return false;
                    }
                    return ((SavedMessagesController.SavedDialog) SavedDialogsAdapter.this.dialogs.get(childAdapterPosition)).pinned;
                }

                @Override
                public boolean isForumCell() {
                    return false;
                }
            };
            dialogCell.setDialogCellDelegate(SharedMediaLayout.this);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        public void select(View view) {
            SavedMessagesController.SavedDialog savedDialog;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                long dialogId = dialogCell.getDialogId();
                int i = 0;
                while (true) {
                    if (i >= this.dialogs.size()) {
                        savedDialog = null;
                        break;
                    } else {
                        if (this.dialogs.get(i).dialogId == dialogId) {
                            savedDialog = this.dialogs.get(i);
                            break;
                        }
                        i++;
                    }
                }
                if (savedDialog == null) {
                    return;
                }
                if (this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId))) {
                    this.selectedDialogs.remove(Long.valueOf(savedDialog.dialogId));
                    if (this.selectedDialogs.size() <= 0) {
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (sharedMediaLayout.isActionModeShowed) {
                            sharedMediaLayout.showActionMode(false);
                        }
                    }
                } else {
                    this.selectedDialogs.add(Long.valueOf(savedDialog.dialogId));
                    if (this.selectedDialogs.size() > 0) {
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        if (!sharedMediaLayout2.isActionModeShowed) {
                            sharedMediaLayout2.showActionMode(true);
                            if (SharedMediaLayout.this.gotoItem != null) {
                                SharedMediaLayout.this.gotoItem.setVisibility(8);
                            }
                            if (SharedMediaLayout.this.forwardItem != null) {
                                SharedMediaLayout.this.forwardItem.setVisibility(8);
                            }
                        }
                    }
                }
                SharedMediaLayout.this.selectedMessagesCountTextView.setNumber(this.selectedDialogs.size(), true);
                boolean z = this.selectedDialogs.size() > 0;
                Iterator<Long> it = this.selectedDialogs.iterator();
                while (it.hasNext()) {
                    long jLongValue = it.next().longValue();
                    for (int i2 = 0; i2 < this.dialogs.size(); i2++) {
                        SavedMessagesController.SavedDialog savedDialog2 = this.dialogs.get(i2);
                        if (savedDialog2.dialogId == jLongValue) {
                            if (!savedDialog2.pinned) {
                                z = false;
                                break;
                            }
                            break;
                        }
                    }
                    if (!z) {
                        break;
                    }
                }
                if (SharedMediaLayout.this.pinItem != null) {
                    SharedMediaLayout.this.pinItem.setVisibility(z ? 8 : 0);
                }
                if (SharedMediaLayout.this.unpinItem != null) {
                    SharedMediaLayout.this.unpinItem.setVisibility(z ? 0 : 8);
                }
                if (view != null) {
                    dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), true);
                }
            }
        }

        public void unselectAll() {
            this.selectedDialogs.clear();
        }

        public void update(boolean z) {
            this.oldDialogs.clear();
            this.oldDialogs.addAll(this.dialogs);
            this.dialogs.clear();
            this.dialogs.addAll(this.controller.allDialogs);
            if (z) {
                notifyDataSetChanged();
            }
        }
    }

    public class SavedMessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
        private final int currentAccount;
        private String lastQuery;
        private ReactionsLayoutInBubble.VisibleReaction lastReaction;
        int lastSearchId;
        private boolean loading;
        private final Context mContext;
        public final ArrayList<SavedMessagesController.SavedDialog> dialogs = new ArrayList<>();
        public final ArrayList<MessageObject> messages = new ArrayList<>();
        public final ArrayList<MessageObject> loadedMessages = new ArrayList<>();
        public final ArrayList<MessageObject> cachedMessages = new ArrayList<>();
        private boolean endReached = false;
        private int oldItemCounts = 0;
        private int count = 0;
        private int reqId = -1;
        private Runnable searchRunnable = new ShareAlert$23$$ExternalSyntheticLambda0(this, 5);

        public SavedMessagesSearchAdapter(Context context) {
            this.mContext = context;
            this.currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            setHasStableIds(true);
        }

        public void lambda$sendRequest$0(TLObject tLObject, int i) {
            if ((tLObject instanceof TLRPC.messages_Messages) && i == this.lastSearchId) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
                MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
                MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    MessageObject messageObject = new MessageObject(this.currentAccount, messages_messages.messages.get(i2), false, true);
                    if (messageObject.hasValidGroupId()) {
                        messageObject.isPrimaryGroupMessage = true;
                    }
                    messageObject.setQuery(this.lastQuery);
                    this.loadedMessages.add(messageObject);
                }
                this.count = messages_messages.count;
                if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    this.endReached = this.loadedMessages.size() >= messages_messages.count;
                } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    this.endReached = true;
                }
                updateMessages(false);
                this.loading = false;
                this.reqId = -1;
            }
        }

        public void lambda$sendRequest$1(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new SlotsDrawable$$ExternalSyntheticLambda9(this, tLObject, i, 8));
        }

        public void lambda$sendRequest$2(int i, TLRPC.TL_messages_search tL_messages_search) {
            if (i != this.lastSearchId) {
                return;
            }
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_search, new SharedMediaLayout$CommonGroupsAdapter$$ExternalSyntheticLambda0(this, i, 1));
        }

        public void lambda$sendRequest$3(Runnable runnable, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            MessagesController.getInstance(this.currentAccount).putUsers(arrayList2, true);
            MessagesController.getInstance(this.currentAccount).putChats(arrayList3, true);
            AnimatedEmojiDrawable.getDocumentFetcher(this.currentAccount).processDocuments(arrayList4);
            for (int i = 0; i < arrayList.size(); i++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                if (messageObject.hasValidGroupId() && messageObject.messageOwner.reactions != null) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(this.lastQuery);
                this.cachedMessages.add(messageObject);
            }
            updateMessages(true);
            AndroidUtilities.runOnUIThread(runnable, 540L);
        }

        public void sendRequest() {
            if (TextUtils.isEmpty(this.lastQuery) && this.lastReaction == null) {
                this.loading = false;
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(UserConfig.getInstance(this.currentAccount).getClientUserId());
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.q = this.lastQuery;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
            if (visibleReaction != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
            }
            if (this.loadedMessages.size() > 0) {
                tL_messages_search.offset_id = ((MessageObject) zzin.m(1, this.loadedMessages)).getId();
            }
            tL_messages_search.limit = 10;
            this.endReached = false;
            int i = this.lastSearchId + 1;
            this.lastSearchId = i;
            final SlotsDrawable$$ExternalSyntheticLambda9 slotsDrawable$$ExternalSyntheticLambda9 = new SlotsDrawable$$ExternalSyntheticLambda9(this, i, tL_messages_search, 7);
            if (this.lastReaction != null) {
                MessagesStorage.getInstance(this.currentAccount).searchSavedByTag(this.lastReaction.toTLReaction(), 0L, this.lastQuery, 100, this.cachedMessages.size(), new Utilities.Callback4() {
                    @Override
                    public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                        this.f$0.lambda$sendRequest$3(slotsDrawable$$ExternalSyntheticLambda9, (ArrayList) obj, (ArrayList) obj2, (ArrayList) obj3, (ArrayList) obj4);
                    }
                }, false);
            } else {
                slotsDrawable$$ExternalSyntheticLambda9.run();
            }
        }

        private void updateMessages(boolean z) {
            CharSequence string;
            CharSequence charSequence;
            this.messages.clear();
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.loadedMessages.size(); i++) {
                MessageObject messageObject = this.loadedMessages.get(i);
                if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject.getId()));
                    this.messages.add(messageObject);
                }
            }
            for (int i2 = 0; i2 < this.cachedMessages.size(); i2++) {
                MessageObject messageObject2 = this.cachedMessages.get(i2);
                if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject2.getId()));
                    this.messages.add(messageObject2);
                }
            }
            if (!z || !this.cachedMessages.isEmpty()) {
                for (int i3 = 0; i3 < SharedMediaLayout.this.mediaPages.length; i3++) {
                    if (SharedMediaLayout.this.mediaPages[i3].selectedType == 11 && this.messages.isEmpty() && this.dialogs.isEmpty()) {
                        SpoilersTextView spoilersTextView = SharedMediaLayout.this.mediaPages[i3].emptyView.title;
                        if (this.lastReaction == null || !TextUtils.isEmpty(this.lastQuery)) {
                            string = LocaleController.formatString(R.string.NoResultFoundFor, this.lastQuery);
                        } else {
                            String string2 = LocaleController.getString(R.string.NoResultFoundForTag);
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
                            Paint.FontMetricsInt fontMetricsInt = SharedMediaLayout.this.mediaPages[i3].emptyView.title.getPaint().getFontMetricsInt();
                            if (TextUtils.isEmpty(visibleReaction.emojicon)) {
                                SpannableString spannableString = new SpannableString("😀");
                                spannableString.setSpan(new AnimatedEmojiSpan(visibleReaction.documentId, fontMetricsInt), 0, spannableString.length(), 17);
                                charSequence = spannableString;
                            } else {
                                charSequence = visibleReaction.emojicon;
                            }
                            string = AndroidUtilities.replaceCharSequence("%s", string2, charSequence);
                        }
                        spoilersTextView.setText(string);
                        SharedMediaLayout.this.mediaPages[i3].emptyView.button.setVisibility(8);
                        SharedMediaLayout.this.mediaPages[i3].emptyView.showProgress(false, true);
                    }
                }
            }
            this.oldItemCounts = this.count;
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            return this.messages.size() + this.dialogs.size();
        }

        @Override
        public long getItemId(int i) {
            int iHash;
            if (i < 0) {
                return i;
            }
            if (i < this.dialogs.size()) {
                iHash = Objects.hash(1, Long.valueOf(this.dialogs.get(i).dialogId));
            } else {
                int size = i - this.dialogs.size();
                if (size >= this.messages.size()) {
                    return size;
                }
                iHash = Objects.hash(2, Long.valueOf(this.messages.get(size).getSavedDialogId()), Integer.valueOf(this.messages.get(size).getId()));
            }
            return iHash;
        }

        @Override
        public int getItemViewType(int i) {
            return 23;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public void loadMore() {
            if (this.endReached || this.loading) {
                return;
            }
            this.loading = true;
            sendRequest();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.useSeparator = i + 1 < getItemCount();
                if (i < this.dialogs.size()) {
                    SavedMessagesController.SavedDialog savedDialog = this.dialogs.get(i);
                    dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i - this.dialogs.size();
                if (size < this.messages.size()) {
                    MessageObject messageObject = this.messages.get(size);
                    dialogCell.setDialog(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(null, this.mContext, false, true) {
                {
                    int i2 = UserConfig.selectedAccount;
                }

                @Override
                public boolean isForumCell() {
                    return false;
                }
            };
            dialogCell.setDialogCellDelegate(SharedMediaLayout.this);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        public void search(String str, ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
            if (TextUtils.equals(str, this.lastQuery)) {
                ReactionsLayoutInBubble.VisibleReaction visibleReaction2 = this.lastReaction;
                if (visibleReaction2 == null && visibleReaction == null) {
                    return;
                }
                if (visibleReaction2 != null && visibleReaction2.equals(visibleReaction)) {
                    return;
                }
            }
            this.lastQuery = str;
            this.lastReaction = visibleReaction;
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            this.cachedMessages.clear();
            this.loadedMessages.clear();
            this.messages.clear();
            this.count = 0;
            this.endReached = false;
            this.loading = true;
            this.dialogs.clear();
            if (this.lastReaction == null) {
                this.dialogs.addAll(MessagesController.getInstance(this.currentAccount).getSavedMessagesController().searchDialogs(str));
            }
            for (int i = 0; i < SharedMediaLayout.this.mediaPages.length; i++) {
                if (SharedMediaLayout.this.mediaPages[i].selectedType == 11) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, true);
                }
            }
            if (this.lastReaction == null) {
                notifyDataSetChanged();
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, this.lastReaction != null ? 60L : 600L);
        }
    }

    public class ScrollSlidingTextTabStripInner extends ScrollSlidingTextTabStrip {
        public int backgroundColor;
        protected Paint backgroundPaint;
        private Rect blurBounds;

        public ScrollSlidingTextTabStripInner(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.backgroundColor = 0;
            this.blurBounds = new Rect();
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            if (this.backgroundColor != 0) {
                if (this.backgroundPaint == null) {
                    this.backgroundPaint = new Paint();
                }
                this.backgroundPaint.setColor(this.backgroundColor);
                this.blurBounds.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
                canvas.save();
                canvas.translate(getScrollX(), 0.0f);
                canvas.clipPath(this.clipPath);
                if (SharedConfig.chatBlurEnabled()) {
                    SharedMediaLayout.this.drawBackgroundWithBlur(canvas, getY(), this.blurBounds, this.backgroundPaint);
                } else {
                    canvas.drawPaint(this.backgroundPaint);
                }
                canvas.translate(-getScrollX(), 0.0f);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }

        public void drawBackground(Canvas canvas) {
        }

        @Override
        public void setBackgroundColor(int i) {
            this.backgroundColor = i;
            invalidate();
        }
    }

    public class SharedDocumentsAdapter extends RecyclerListView.FastScrollAdapter {
        private int currentType;
        private boolean inFastScrollMode;
        private Context mContext;

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public int getItemCount() {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] || !SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) && SharedMediaLayout.this.sharedMediaData[this.currentType].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount() != 0) {
                return Math.max(SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount(), SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size() + SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset());
            }
            int size = SharedMediaLayout.this.sharedMediaData[this.currentType].getMessages().size() + SharedMediaLayout.this.sharedMediaData[this.currentType].getStartOffset();
            if (size == 0) {
                return size;
            }
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[0] && SharedMediaLayout.this.sharedMediaData[this.currentType].endReached[1]) {
                return size;
            }
            return SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() != 0 ? SharedMediaLayout.this.sharedMediaData[this.currentType].getEndLoadingStubs() + size : size + 1;
        }

        @Override
        public int getItemViewType(int i) {
            if (SharedMediaLayout.this.sharedMediaData[this.currentType].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[this.currentType].loading) {
                return 9;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset) {
                return 8;
            }
            if (i >= SharedMediaLayout.this.sharedMediaData[this.currentType].messages.size() + SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset) {
                return 8;
            }
            int i2 = this.currentType;
            return (i2 == 2 || i2 == 4) ? 10 : 7;
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
            return ((Period) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList)).formatedDate;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float totalItemsCount = f * ((getTotalItemsCount() * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
            iArr[0] = (int) (totalItemsCount / measuredHeight);
            iArr[1] = ((int) totalItemsCount) % measuredHeight;
        }

        @Override
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList<MessageObject> arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].messages;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 7) {
                View view = viewHolder.itemView;
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject messageObject = arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                    sharedDocumentCell.setDocument(messageObject, i != arrayList.size() - 1);
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (itemViewType != 10) {
                return;
            }
            View view2 = viewHolder.itemView;
            if (view2 instanceof SharedAudioCell) {
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                MessageObject messageObject2 = arrayList.get(i - SharedMediaLayout.this.sharedMediaData[this.currentType].startOffset);
                sharedAudioCell.setMessageObject(messageObject2, i != arrayList.size() - 1);
                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                if (sharedMediaLayout2.isActionModeShowed) {
                    sharedAudioCell.setChecked(sharedMediaLayout2.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
                } else {
                    sharedAudioCell.setChecked(false, !sharedMediaLayout2.scrolling);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View view2;
            View view3;
            int i2 = 0;
            if (i == 7) {
                SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedDocumentCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = sharedDocumentCell;
            } else if (i == 8) {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                if (this.currentType == 2) {
                    flickerLoadingView.setViewType(4);
                } else {
                    flickerLoadingView.setViewType(3);
                }
                flickerLoadingView.showDate(false);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = flickerLoadingView;
            } else {
                if (i == 9) {
                    View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, this.currentType, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    return zzkd.m(viewCreateEmptyStubView, viewCreateEmptyStubView, -1);
                }
                if (this.currentType != 4 || SharedMediaLayout.this.audioCellCache.isEmpty()) {
                    view2 = new SharedAudioCell(this.mContext, i2, SharedMediaLayout.this.resourcesProvider) {
                        @Override
                        public boolean needPlayMessage(MessageObject messageObject) {
                            if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                                boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                                MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages : null, false);
                                return zPlayMessage;
                            }
                            if (messageObject.isMusic()) {
                                return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[SharedDocumentsAdapter.this.currentType].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                            }
                            return false;
                        }
                    };
                } else {
                    view3 = (View) SharedMediaLayout.this.audioCellCache.get(0);
                    SharedMediaLayout.this.audioCellCache.remove(0);
                    ViewGroup viewGroup2 = (ViewGroup) view3.getParent();
                    if (viewGroup2 != null) {
                        view2 = view3;
                        viewGroup2.removeView(view3);
                        view2 = view3;
                    }
                }
                view2 = view3;
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view2;
                sharedAudioCell.setGlobalGradientView(SharedMediaLayout.this.globalGradientView);
                view = view2;
                if (this.currentType == 4) {
                    SharedMediaLayout.this.audioCache.add(sharedAudioCell);
                    view = view2;
                }
            }
            return zzkd.m(view, view, -2);
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int messageId = 0;
                    for (int i = 0; i < recyclerListView.getChildCount() && (messageId = SharedMediaLayout.getMessageId(recyclerListView.getChildAt(i))) == 0; i++) {
                    }
                    if (messageId == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(this.currentType, recyclerListView, true);
                    }
                }
            }
        }

        @Override
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(this.currentType);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }
    }

    public class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getCountForSection(int i) {
            if ((SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) && i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i)).size() + (i == 0 ? 0 : 1);
            }
            return 1;
        }

        @Override
        public Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public int getItemViewType(int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() == 0 && !SharedMediaLayout.this.sharedMediaData[3].loading) {
                return 5;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                return (i == 0 || i2 != 0) ? 4 : 3;
            }
            return 6;
        }

        @Override
        public String getLetter(int i) {
            return null;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
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
        public View getSectionHeaderView(int i, View view) {
            if (view == null) {
                view = new GraySectionCell(this.mContext, 28, SharedMediaLayout.this.resourcesProvider);
            }
            if (i == 0) {
                view.setAlpha(0.0f);
                return view;
            }
            if (i < SharedMediaLayout.this.sharedMediaData[3].sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i)).get(0).messageOwner.date));
            }
            return view;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            if (SharedMediaLayout.this.sharedMediaData[3].sections.size() != 0 || SharedMediaLayout.this.sharedMediaData[3].loading) {
                return i == 0 || i2 != 0;
            }
            return false;
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            if (viewHolder.getItemViewType() == 6 || viewHolder.getItemViewType() == 5) {
                return;
            }
            ArrayList<MessageObject> arrayList = SharedMediaLayout.this.sharedMediaData[3].sectionArrays.get(SharedMediaLayout.this.sharedMediaData[3].sections.get(i));
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 3) {
                MessageObject messageObject = arrayList.get(0);
                View view = viewHolder.itemView;
                if (view instanceof GraySectionCell) {
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
                    return;
                }
                return;
            }
            if (itemViewType != 4) {
                return;
            }
            if (i != 0) {
                i2--;
            }
            if (!(viewHolder.itemView instanceof SharedLinkCell) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            SharedLinkCell sharedLinkCell = (SharedLinkCell) viewHolder.itemView;
            MessageObject messageObject2 = arrayList.get(i2);
            sharedLinkCell.needDivider = i2 != arrayList.size() - 1 || (i == SharedMediaLayout.this.sharedMediaData[3].sections.size() - 1 && SharedMediaLayout.this.sharedMediaData[3].loading);
            sharedLinkCell.resetPressedLink();
            sharedLinkCell.message = messageObject2;
            sharedLinkCell.requestLayout();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isActionModeShowed) {
                sharedLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !SharedMediaLayout.this.scrolling);
            } else {
                sharedLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            if (i == 3) {
                graySectionCell = new GraySectionCell(this.mContext, 28, SharedMediaLayout.this.resourcesProvider);
            } else if (i == 4) {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(this.mContext, 0, SharedMediaLayout.this.resourcesProvider);
                sharedLinkCell.setDelegate(SharedMediaLayout.this.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            } else {
                if (i == 5) {
                    View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 3, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                    return zzkd.m(viewCreateEmptyStubView, viewCreateEmptyStubView, -1);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(this.mContext, SharedMediaLayout.this.resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(false);
                flickerLoadingView.setViewType(5);
                graySectionCell = flickerLoadingView;
            }
            return zzkd.m(graySectionCell, graySectionCell, -2);
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
        public ArrayList<MessageObject> messages = new ArrayList<>();
        public SparseArray<MessageObject>[] messagesDict = {new SparseArray<>(), new SparseArray<>()};
        public ArrayList<String> sections = new ArrayList<>();
        public HashMap<String, ArrayList<MessageObject>> sectionArrays = new HashMap<>();
        public ArrayList<Period> fastScrollPeriods = new ArrayList<>();
        public int[] totalCount = {0, 0};
        public boolean[] endReached = {false, true};
        public int[] max_id = {0, 0};
        public boolean startReached = true;
        public int filterType = 0;
        public ArrayList<MessageObject> frozenMessages = new ArrayList<>();
        RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

        public static int access$12010(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.endLoadingStubs;
            sharedMediaData.endLoadingStubs = i - 1;
            return i;
        }

        public static int access$610(SharedMediaData sharedMediaData) {
            int i = sharedMediaData.startOffset;
            sharedMediaData.startOffset = i - 1;
            return i;
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
            int[] iArr = this.totalCount;
            int i3 = iArr[i2] - 1;
            iArr[i2] = i3;
            if (i3 < 0) {
                iArr[i2] = 0;
            }
            return messageObject;
        }

        public int getEndLoadingStubs() {
            return this.isFrozen ? this.frozenEndLoadingStubs : this.endLoadingStubs;
        }

        public ArrayList<MessageObject> getMessages() {
            return this.isFrozen ? this.frozenMessages : this.messages;
        }

        public int getStartOffset() {
            return this.isFrozen ? this.frozenStartOffset : this.startOffset;
        }

        public int getTotalCount() {
            int[] iArr = this.totalCount;
            return iArr[0] + iArr[1];
        }

        public void replaceMid(int i, int i2, int i3) {
            MessageObject messageObject = this.messagesDict[i].get(i2);
            if (messageObject != null) {
                this.messagesDict[i].remove(i2);
                this.messagesDict[i].put(i3, messageObject);
                messageObject.messageOwner.id = i3;
                int[] iArr = this.max_id;
                iArr[i] = Math.min(i3, iArr[i]);
            }
        }

        public void setEndReached(int i, boolean z) {
            this.endReached[i] = z;
        }

        public void setListFrozen(boolean z) {
            if (this.isFrozen == z) {
                return;
            }
            this.isFrozen = z;
            if (z) {
                this.frozenStartOffset = this.startOffset;
                this.frozenEndLoadingStubs = this.endLoadingStubs;
                this.frozenMessages.clear();
                this.frozenMessages.addAll(this.messages);
            }
        }

        public void setMaxId(int i, int i2) {
            this.max_id[i] = i2;
        }

        public void setTotalCount(int i) {
            this.totalCount[0] = i;
        }

        public void setTotalCount(int i, int i2) {
            this.totalCount[i] = i2;
        }
    }

    public static class SharedMediaListView extends InternalListView {
        private final ArrayList<SharedPhotoVideoCell2> animationSupportingSortedCells;
        private int animationSupportingSortedCellsOffset;
        protected StaticLayout archivedHintLayout;
        protected float archivedHintLayoutLeft;
        protected float archivedHintLayoutWidth;
        protected TextPaint archivedHintPaint;
        final ArrayList<SharedPhotoVideoCell2> drawingViews;
        final ArrayList<SharedPhotoVideoCell2> drawingViews2;
        final ArrayList<SharedPhotoVideoCell2> drawingViews3;
        final HashSet<SharedPhotoVideoCell2> excludeDrawViews;
        UserListPoller poller;

        public SharedMediaListView(Context context) {
            super(context);
            this.excludeDrawViews = new HashSet<>();
            this.drawingViews = new ArrayList<>();
            this.drawingViews2 = new ArrayList<>();
            this.drawingViews3 = new ArrayList<>();
            this.animationSupportingSortedCells = new ArrayList<>();
        }

        public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float fFloatValue;
            int i;
            int i2;
            int i3;
            int i4;
            boolean z;
            int animateToColumnsCount;
            int pinchCenterPosition;
            RecyclerListView.FastScrollAdapter movingAdapter = getMovingAdapter();
            RecyclerListView.FastScrollAdapter supportingAdapter = getSupportingAdapter();
            boolean zIsThisListView = isThisListView();
            Float fValueOf = Float.valueOf(1.0f);
            if (!zIsThisListView || getAdapter() != movingAdapter) {
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    int messageId = SharedMediaLayout.getMessageId(childAt);
                    if (messageId != 0 && getMessageAlphaEnter() != null) {
                        fFloatValue = getMessageAlphaEnter().get(messageId, null) != null ? getMessageAlphaEnter().get(messageId, fValueOf).floatValue() : 1.0f;
                        if (childAt instanceof SharedDocumentCell) {
                            ((SharedDocumentCell) childAt).setEnterAnimationAlpha(fFloatValue);
                        } else if (childAt instanceof SharedAudioCell) {
                            ((SharedAudioCell) childAt).setEnterAnimationAlpha(fFloatValue);
                        }
                    }
                    if (childAt instanceof SharedDocumentCell) {
                        ((SharedDocumentCell) childAt).setEnterAnimationAlpha(fFloatValue);
                    } else if (childAt instanceof SharedAudioCell) {
                        ((SharedAudioCell) childAt).setEnterAnimationAlpha(fFloatValue);
                    }
                }
                super.dispatchDraw(canvas);
                return;
            }
            float measuredHeight = getMeasuredHeight();
            if (isChangeColumnsAnimation()) {
                int i6 = -1;
                i3 = -1;
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    int childAdapterPosition = getChildAdapterPosition(getChildAt(i7));
                    if (childAdapterPosition >= 0 && (childAdapterPosition > i6 || i6 == -1)) {
                        i6 = childAdapterPosition;
                    }
                    if (childAdapterPosition >= 0 && (childAdapterPosition < i3 || i3 == -1)) {
                        i3 = childAdapterPosition;
                    }
                }
                int i8 = -1;
                i4 = -1;
                for (int i9 = 0; i9 < getSupportingListView().getChildCount(); i9++) {
                    int childAdapterPosition2 = getSupportingListView().getChildAdapterPosition(getSupportingListView().getChildAt(i9));
                    if (childAdapterPosition2 >= 0 && (childAdapterPosition2 > i8 || i8 == -1)) {
                        i8 = childAdapterPosition2;
                    }
                    if (childAdapterPosition2 >= 0 && (childAdapterPosition2 < i4 || i4 == -1)) {
                        i4 = childAdapterPosition2;
                    }
                }
                if (i3 < 0 || i4 < 0 || getPinchCenterPosition() < 0) {
                    animateToColumnsCount = 0;
                    pinchCenterPosition = 0;
                } else {
                    int iCeil = (int) Math.ceil(movingAdapter.getItemCount() / getColumnsCount());
                    int iCeil2 = (int) Math.ceil(movingAdapter.getItemCount() / getAnimateToColumnsCount());
                    pinchCenterPosition = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i4 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i3 / getColumnsCount()));
                    if (((i3 / getColumnsCount()) - pinchCenterPosition < 0 && getAnimateToColumnsCount() < getColumnsCount()) || ((i4 / getAnimateToColumnsCount()) + pinchCenterPosition < 0 && getAnimateToColumnsCount() > getColumnsCount())) {
                        pinchCenterPosition = 0;
                    }
                    if (((i8 / getColumnsCount()) + pinchCenterPosition >= iCeil && getAnimateToColumnsCount() > getColumnsCount()) || ((i6 / getAnimateToColumnsCount()) - pinchCenterPosition >= iCeil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                        pinchCenterPosition = 0;
                    }
                    animateToColumnsCount = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
                }
                this.animationSupportingSortedCells.clear();
                this.excludeDrawViews.clear();
                this.drawingViews.clear();
                this.drawingViews2.clear();
                this.drawingViews3.clear();
                this.animationSupportingSortedCellsOffset = 0;
                for (int i10 = 0; i10 < getSupportingListView().getChildCount(); i10++) {
                    View childAt2 = getSupportingListView().getChildAt(i10);
                    if (childAt2.getTop() <= getMeasuredHeight() && childAt2.getBottom() >= 0) {
                        if (childAt2 instanceof SharedPhotoVideoCell2) {
                            this.animationSupportingSortedCells.add((SharedPhotoVideoCell2) childAt2);
                        } else if (childAt2 instanceof TextView) {
                            this.animationSupportingSortedCellsOffset++;
                        }
                    }
                }
                this.drawingViews.addAll(this.animationSupportingSortedCells);
                RecyclerListView.FastScroll fastScroll = getFastScroll();
                if (fastScroll != null && fastScroll.getTag() != null) {
                    float scrollProgress = movingAdapter.getScrollProgress(this);
                    float scrollProgress2 = supportingAdapter.getScrollProgress(getSupportingListView());
                    float f = movingAdapter.fastScrollIsVisible(this) ? 1.0f : 0.0f;
                    float f2 = supportingAdapter.fastScrollIsVisible(getSupportingListView()) ? 1.0f : 0.0f;
                    fastScroll.setProgress((getChangeColumnsProgress() * scrollProgress2) + ((1.0f - getChangeColumnsProgress()) * scrollProgress));
                    fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f2) + ((1.0f - getChangeColumnsProgress()) * f));
                }
                i2 = pinchCenterPosition;
                i = animateToColumnsCount;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            float y = measuredHeight;
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt3 = getChildAt(i11);
                if (childAt3.getTop() > getMeasuredHeight() || childAt3.getBottom() < 0) {
                    if (childAt3 instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) getChildAt(i11);
                        sharedPhotoVideoCell2.setCrossfadeView(null, 0.0f, 0);
                        sharedPhotoVideoCell2.setTranslationX(0.0f);
                        sharedPhotoVideoCell2.setTranslationY(0.0f);
                        sharedPhotoVideoCell2.setImageScale(1.0f, !isChangeColumnsAnimation());
                    }
                } else if (childAt3 instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell3 = (SharedPhotoVideoCell2) getChildAt(i11);
                    checkHighlightCell(sharedPhotoVideoCell3);
                    MessageObject messageObject = sharedPhotoVideoCell3.getMessageObject();
                    sharedPhotoVideoCell3.setImageAlpha((messageObject == null || getMessageAlphaEnter() == null || getMessageAlphaEnter().get(messageObject.getId(), null) == null) ? 1.0f : getMessageAlphaEnter().get(messageObject.getId(), fValueOf).floatValue(), !isChangeColumnsAnimation());
                    if (isChangeColumnsAnimation()) {
                        int viewAdapterPosition = (((GridLayoutManager.LayoutParams) sharedPhotoVideoCell3.getLayoutParams()).getViewAdapterPosition() % getColumnsCount()) + i;
                        int animateToColumnsCount2 = (getAnimateToColumnsCount() * (((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell3.getLayoutParams()).getViewAdapterPosition() - i3) / getColumnsCount()) + i2)) + viewAdapterPosition + this.animationSupportingSortedCellsOffset;
                        if (viewAdapterPosition < 0 || viewAdapterPosition >= getAnimateToColumnsCount() || animateToColumnsCount2 < 0 || animateToColumnsCount2 >= this.animationSupportingSortedCells.size()) {
                            z = false;
                        } else {
                            float fLerp = AndroidUtilities.lerp(1.0f, (this.animationSupportingSortedCells.get(animateToColumnsCount2).getMeasuredWidth() - AndroidUtilities.dpf2(2.0f)) / (sharedPhotoVideoCell3.getMeasuredWidth() - AndroidUtilities.dpf2(2.0f)), getChangeColumnsProgress());
                            float left = sharedPhotoVideoCell3.getLeft();
                            float top = sharedPhotoVideoCell3.getTop();
                            float left2 = this.animationSupportingSortedCells.get(animateToColumnsCount2).getLeft();
                            float top2 = this.animationSupportingSortedCells.get(animateToColumnsCount2).getTop();
                            sharedPhotoVideoCell3.setPivotX(0.0f);
                            sharedPhotoVideoCell3.setPivotY(0.0f);
                            sharedPhotoVideoCell3.setImageScale(fLerp, !isChangeColumnsAnimation());
                            sharedPhotoVideoCell3.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                            sharedPhotoVideoCell3.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                            sharedPhotoVideoCell3.setCrossfadeView(this.animationSupportingSortedCells.get(animateToColumnsCount2), getChangeColumnsProgress(), getAnimateToColumnsCount());
                            this.excludeDrawViews.add(this.animationSupportingSortedCells.get(animateToColumnsCount2));
                            this.drawingViews3.add(sharedPhotoVideoCell3);
                            canvas.save();
                            canvas.translate(sharedPhotoVideoCell3.getX(), sharedPhotoVideoCell3.getY());
                            sharedPhotoVideoCell3.draw(canvas);
                            canvas.restore();
                            if (sharedPhotoVideoCell3.getY() < y) {
                                y = sharedPhotoVideoCell3.getY();
                            }
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        if (isChangeColumnsAnimation()) {
                            this.drawingViews2.add(sharedPhotoVideoCell3);
                        }
                        sharedPhotoVideoCell3.setCrossfadeView(null, 0.0f, 0);
                        sharedPhotoVideoCell3.setTranslationX(0.0f);
                        sharedPhotoVideoCell3.setTranslationY(0.0f);
                        sharedPhotoVideoCell3.setImageScale(1.0f, !isChangeColumnsAnimation());
                    }
                }
            }
            float f3 = 255.0f;
            if (isChangeColumnsAnimation() && !this.drawingViews.isEmpty()) {
                float changeColumnsProgress = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
                float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
                float measuredWidth = getMeasuredWidth() / getColumnsCount();
                float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
                float fCeil = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - ((double) AndroidUtilities.dpf2(2.0f))) * ((double) changeColumnsProgress2)) + ((double) AndroidUtilities.dpf2(2.0f)));
                if (isStories()) {
                    fCeil *= 1.25f;
                }
                float f4 = fCeil;
                int i12 = 0;
                while (i12 < this.drawingViews.size()) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell4 = this.drawingViews.get(i12);
                    if (this.excludeDrawViews.contains(sharedPhotoVideoCell4)) {
                        changeColumnsProgress2 = changeColumnsProgress2;
                        i12 = i12;
                    } else {
                        sharedPhotoVideoCell4.setCrossfadeView(null, 0.0f, 0);
                        int viewAdapterPosition2 = ((GridLayoutManager.LayoutParams) sharedPhotoVideoCell4.getLayoutParams()).getViewAdapterPosition() % getAnimateToColumnsCount();
                        int i13 = viewAdapterPosition2 - i;
                        int viewAdapterPosition3 = ((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell4.getLayoutParams()).getViewAdapterPosition() - i4) / getAnimateToColumnsCount()) - i2;
                        canvas.save();
                        canvas.translate((getChangeColumnsProgress() * viewAdapterPosition2 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i13 * measuredWidth), (viewAdapterPosition3 * f4) + y);
                        sharedPhotoVideoCell4.setImageScale(changeColumnsProgress2, !isChangeColumnsAnimation());
                        if (i13 < getColumnsCount()) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, sharedPhotoVideoCell4.getMeasuredWidth() * changeColumnsProgress, sharedPhotoVideoCell4.getMeasuredHeight() * changeColumnsProgress, (int) (getChangeColumnsProgress() * 255.0f), 31);
                            sharedPhotoVideoCell4.draw(canvas);
                            canvas.restore();
                        } else {
                            sharedPhotoVideoCell4.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i12++;
                    changeColumnsProgress2 = changeColumnsProgress2;
                }
            }
            super.dispatchDraw(canvas);
            if (isChangeColumnsAnimation()) {
                float changeColumnsProgress3 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
                float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
                float fCeil2 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - ((double) AndroidUtilities.dpf2(2.0f))) * ((double) changeColumnsProgress4)) + ((double) AndroidUtilities.dpf2(2.0f)));
                if (isStories()) {
                    fCeil2 *= 1.25f;
                }
                float f5 = fCeil2;
                float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
                float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
                int i14 = 0;
                while (i14 < this.drawingViews2.size()) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell5 = this.drawingViews2.get(i14);
                    int viewAdapterPosition4 = ((GridLayoutManager.LayoutParams) sharedPhotoVideoCell5.getLayoutParams()).getViewAdapterPosition() % getColumnsCount();
                    int viewAdapterPosition5 = ((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell5.getLayoutParams()).getViewAdapterPosition() - i3) / getColumnsCount()) + i2;
                    int i15 = viewAdapterPosition4 + i;
                    canvas.save();
                    sharedPhotoVideoCell5.setImageScale(changeColumnsProgress4, !isChangeColumnsAnimation());
                    canvas.translate((getChangeColumnsProgress() * i15 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * viewAdapterPosition4 * measuredWidth3), (viewAdapterPosition5 * f5) + y);
                    if (i15 < getAnimateToColumnsCount()) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, sharedPhotoVideoCell5.getMeasuredWidth() * changeColumnsProgress3, sharedPhotoVideoCell5.getMeasuredHeight() * changeColumnsProgress3, (int) ((1.0f - getChangeColumnsProgress()) * f3), 31);
                        sharedPhotoVideoCell5.draw(canvas);
                        canvas.restore();
                    } else {
                        sharedPhotoVideoCell5.draw(canvas);
                    }
                    canvas.restore();
                    i14++;
                    f3 = 255.0f;
                }
                if (this.drawingViews3.isEmpty()) {
                    return;
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * 255.0f), 31);
                for (int i16 = 0; i16 < this.drawingViews3.size(); i16++) {
                    this.drawingViews3.get(i16).drawCrossafadeImage(canvas);
                }
                canvas.restore();
            }
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            RecyclerListView.FastScrollAdapter movingAdapter = getMovingAdapter();
            if (isThisListView() && getAdapter() == movingAdapter && isChangeColumnsAnimation() && (view instanceof SharedPhotoVideoCell2)) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        public int getAnimateToColumnsCount() {
            return 3;
        }

        public float getChangeColumnsProgress() {
            return 0.0f;
        }

        public int getColumnsCount() {
            return 3;
        }

        public SparseArray<Float> getMessageAlphaEnter() {
            return null;
        }

        public RecyclerListView.FastScrollAdapter getMovingAdapter() {
            return null;
        }

        public int getPinchCenterPosition() {
            return 0;
        }

        public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
            return null;
        }

        public InternalListView getSupportingListView() {
            return null;
        }

        public boolean isChangeColumnsAnimation() {
            return false;
        }

        public boolean isStories() {
            return false;
        }

        public boolean isThisListView() {
            return true;
        }
    }

    public static class SharedMediaPreloader implements NotificationCenter.NotificationCenterDelegate {
        private boolean checkedHasSavedMessages;
        private long dialogId;
        public boolean hasPreviews;
        public boolean hasSavedMessages;
        private boolean mediaWasLoaded;
        private long mergeDialogId;
        private final NotificationCenter.ObserversGroup observersGroup;
        private BaseFragment parentFragment;
        private SharedMediaData[] sharedMediaData;
        private long topicId;
        private int[] mediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] mediaMergeCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private int[] lastLoadMergeMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        private ArrayList<SharedMediaPreloaderDelegate> delegates = new ArrayList<>();

        public SharedMediaPreloader(BaseFragment baseFragment) {
            TLRPC.ChatFull chatFull;
            final int i = 0;
            final int i2 = 1;
            this.parentFragment = baseFragment;
            if (baseFragment instanceof ChatActivityInterface) {
                ChatActivityInterface chatActivityInterface = (ChatActivityInterface) baseFragment;
                this.dialogId = chatActivityInterface.getDialogId();
                this.mergeDialogId = chatActivityInterface.getMergeDialogId();
                this.topicId = chatActivityInterface.getTopicId();
                if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                    baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback(this) {
                        public final SharedMediaLayout.SharedMediaPreloader f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$new$0((Boolean) obj);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$1((Boolean) obj);
                                    break;
                                default:
                                    this.f$0.lambda$new$2((Boolean) obj);
                                    break;
                            }
                        }
                    });
                }
            } else if (baseFragment instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) baseFragment;
                if (profileActivity.saved) {
                    this.dialogId = profileActivity.getUserConfig().getClientUserId();
                    this.topicId = profileActivity.getDialogId();
                } else {
                    this.dialogId = profileActivity.getDialogId();
                    this.topicId = profileActivity.getTopicId();
                    TLRPC.ChatFull chatInfo = profileActivity.getChatInfo();
                    if (chatInfo != null) {
                        setChatInfo(chatInfo);
                    }
                    if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                        baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback(this) {
                            public final SharedMediaLayout.SharedMediaPreloader f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run(Object obj) {
                                switch (i2) {
                                    case 0:
                                        this.f$0.lambda$new$0((Boolean) obj);
                                        break;
                                    case 1:
                                        this.f$0.lambda$new$1((Boolean) obj);
                                        break;
                                    default:
                                        this.f$0.lambda$new$2((Boolean) obj);
                                        break;
                                }
                            }
                        });
                    }
                }
            } else if (baseFragment instanceof MediaActivity) {
                this.dialogId = ((MediaActivity) baseFragment).getDialogId();
            } else if (baseFragment instanceof DialogsActivity) {
                this.dialogId = baseFragment.getUserConfig().getClientUserId();
            } else if (baseFragment instanceof ProfileActivity2) {
                ProfileActivity2 profileActivity2 = (ProfileActivity2) baseFragment;
                this.dialogId = profileActivity2.getDialogId();
                this.topicId = profileActivity2.getTopicId();
                if (this.dialogId != baseFragment.getUserConfig().getClientUserId()) {
                    final int i3 = 2;
                    baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(this.dialogId, new Utilities.Callback(this) {
                        public final SharedMediaLayout.SharedMediaPreloader f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            switch (i3) {
                                case 0:
                                    this.f$0.lambda$new$0((Boolean) obj);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$1((Boolean) obj);
                                    break;
                                default:
                                    this.f$0.lambda$new$2((Boolean) obj);
                                    break;
                            }
                        }
                    });
                }
            }
            if (this.mergeDialogId == 0 && DialogObject.isChatDialog(this.dialogId) && (chatFull = baseFragment.getMessagesController().getChatFull(-this.dialogId)) != null) {
                long j = chatFull.migrated_from_chat_id;
                if (j != 0) {
                    this.mergeDialogId = -j;
                }
            }
            this.sharedMediaData = new SharedMediaData[9];
            int i4 = 0;
            while (true) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (i4 >= sharedMediaDataArr.length) {
                    break;
                }
                sharedMediaDataArr[i4] = new SharedMediaData();
                this.sharedMediaData[i4].setMaxId(0, DialogObject.isEncryptedDialog(this.dialogId) ? Integer.MIN_VALUE : Integer.MAX_VALUE);
                this.sharedMediaData[i4].setMaxId(1, Integer.MAX_VALUE);
                i4++;
            }
            loadMediaCounts();
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null) {
                this.observersGroup = null;
            } else {
                this.observersGroup = baseFragment2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
            }
        }

        public void lambda$new$0(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            this.hasSavedMessages = zBooleanValue;
            this.checkedHasSavedMessages = true;
            if (zBooleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    this.delegates.get(i).mediaCountUpdated();
                }
            }
        }

        public void lambda$new$1(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            this.hasSavedMessages = zBooleanValue;
            this.checkedHasSavedMessages = true;
            if (zBooleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    this.delegates.get(i).mediaCountUpdated();
                }
            }
        }

        public void lambda$new$2(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            this.hasSavedMessages = zBooleanValue;
            this.checkedHasSavedMessages = true;
            if (zBooleanValue) {
                int size = this.delegates.size();
                for (int i = 0; i < size; i++) {
                    this.delegates.get(i).mediaCountUpdated();
                }
            }
        }

        private void loadMediaCounts() {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            baseFragment.getMediaDataController().getMediaCounts(this.dialogId, this.topicId, this.parentFragment.getClassGuid());
            if (this.mergeDialogId != 0) {
                this.parentFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
            }
        }

        private void setChatInfo(TLRPC.ChatFull chatFull) {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null || chatFull == null) {
                return;
            }
            long j = chatFull.migrated_from_chat_id;
            if (j == 0 || this.mergeDialogId != 0) {
                return;
            }
            this.mergeDialogId = -j;
            baseFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
        }

        public void addDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.add(sharedMediaPreloaderDelegate);
        }

        @Override
        public void didReceivedNotification(int i, final int i2, Object... objArr) {
            int i3;
            int mediaType;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8 = 0;
            boolean z = true;
            if (i == NotificationCenter.mediaCountsDidLoad) {
                long jLongValue = ((Long) objArr[0]).longValue();
                long jLongValue2 = ((Long) objArr[1]).longValue();
                if (this.topicId == jLongValue2) {
                    long j = this.dialogId;
                    if (jLongValue == j || jLongValue == this.mergeDialogId) {
                        int[] iArr = (int[]) objArr[2];
                        if (jLongValue == j) {
                            this.mediaCount = iArr;
                        } else {
                            this.mediaMergeCount = iArr;
                        }
                        for (int i9 = 0; i9 < iArr.length; i9++) {
                            int i10 = this.mediaCount[i9];
                            if (i10 >= 0 && (i7 = this.mediaMergeCount[i9]) >= 0) {
                                this.lastMediaCount[i9] = i10 + i7;
                            } else if (i10 >= 0) {
                                this.lastMediaCount[i9] = i10;
                            } else {
                                this.lastMediaCount[i9] = Math.max(this.mediaMergeCount[i9], 0);
                            }
                            if (jLongValue == this.dialogId && this.lastMediaCount[i9] != 0 && this.lastLoadMediaCount[i9] != this.mediaCount[i9]) {
                                if (i9 != 0) {
                                    i6 = i9;
                                } else {
                                    int i11 = this.sharedMediaData[0].filterType;
                                    if (i11 == 1) {
                                        i6 = 6;
                                    } else if (i11 == 2) {
                                        i6 = 7;
                                    } else {
                                        i6 = i9;
                                    }
                                }
                                this.parentFragment.getMediaDataController().loadMedia(jLongValue, this.lastLoadMediaCount[i9] == -1 ? 30 : 20, 0, 0, i6, jLongValue2, 1, this.parentFragment.getClassGuid(), this.sharedMediaData[i9].requestIndex, null, null);
                                this.lastLoadMediaCount[i9] = this.mediaCount[i9];
                            } else if (jLongValue == this.mergeDialogId && this.lastMediaCount[i9] != 0 && this.lastLoadMergeMediaCount[i9] != this.mediaMergeCount[i9]) {
                                if (i9 != 0) {
                                    i5 = i9;
                                } else {
                                    int i12 = this.sharedMediaData[0].filterType;
                                    if (i12 == 1) {
                                        i5 = 6;
                                    } else if (i12 == 2) {
                                        i5 = 7;
                                    } else {
                                        i5 = i9;
                                    }
                                }
                                this.parentFragment.getMediaDataController().loadMedia(jLongValue, this.lastLoadMergeMediaCount[i9] == -1 ? 30 : 20, 0, 0, i5, jLongValue2, 1, this.parentFragment.getClassGuid(), this.sharedMediaData[i9].requestIndex, null, null);
                                this.lastLoadMergeMediaCount[i9] = this.mediaMergeCount[i9];
                            }
                        }
                        this.mediaWasLoaded = true;
                        int size = this.delegates.size();
                        while (i8 < size) {
                            this.delegates.get(i8).mediaCountUpdated();
                            i8++;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == NotificationCenter.mediaCountDidLoad) {
                long jLongValue3 = ((Long) objArr[0]).longValue();
                long jLongValue4 = ((Long) objArr[1]).longValue();
                if ((jLongValue3 == this.dialogId || jLongValue3 == this.mergeDialogId) && this.topicId == jLongValue4) {
                    int iIntValue = ((Integer) objArr[4]).intValue();
                    int iIntValue2 = ((Integer) objArr[2]).intValue();
                    if (jLongValue3 == this.dialogId) {
                        this.mediaCount[iIntValue] = iIntValue2;
                    } else {
                        this.mediaMergeCount[iIntValue] = iIntValue2;
                    }
                    int i13 = this.mediaCount[iIntValue];
                    if (i13 >= 0 && (i4 = this.mediaMergeCount[iIntValue]) >= 0) {
                        this.lastMediaCount[iIntValue] = i13 + i4;
                    } else if (i13 >= 0) {
                        this.lastMediaCount[iIntValue] = i13;
                    } else {
                        this.lastMediaCount[iIntValue] = Math.max(this.mediaMergeCount[iIntValue], 0);
                    }
                    int size2 = this.delegates.size();
                    while (i8 < size2) {
                        this.delegates.get(i8).mediaCountUpdated();
                        i8++;
                    }
                    return;
                }
                return;
            }
            if (i == NotificationCenter.didReceiveNewMessages) {
                if (((Boolean) objArr[2]).booleanValue()) {
                    return;
                }
                long jLongValue5 = ((Long) objArr[0]).longValue();
                long j2 = this.dialogId;
                if (jLongValue5 == j2 || jLongValue5 == this.mergeDialogId) {
                    int i14 = jLongValue5 == j2 ? 0 : 1;
                    boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(jLongValue5);
                    ArrayList arrayList = (ArrayList) objArr[1];
                    BaseFragment baseFragment = this.parentFragment;
                    int currentAccount = baseFragment != null ? baseFragment.getCurrentAccount() : -1;
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        MessageObject messageObject = (MessageObject) arrayList.get(i15);
                        if (!messageObject.isEphemeral()) {
                            long j3 = this.topicId;
                            if ((j3 == 0 || j3 == MessageObject.getTopicId(currentAccount, messageObject.messageOwner, true)) && MessageObject.getMedia(messageObject.messageOwner) != null && !messageObject.needDrawBluredPreview() && (mediaType = MediaDataController.getMediaType(messageObject.messageOwner)) != -1 && ((mediaType != 0 || this.sharedMediaData[0].filterType != 2 || messageObject.isVideo()) && (mediaType != 0 || this.sharedMediaData[0].filterType != 1 || !messageObject.isVideo()))) {
                                SharedMediaData sharedMediaData = this.sharedMediaData[mediaType];
                                if (sharedMediaData.startReached) {
                                    sharedMediaData.addMessage(messageObject, i14, true, zIsEncryptedDialog);
                                }
                                if (this.topicId == 0) {
                                    int[] iArr2 = this.sharedMediaData[mediaType].totalCount;
                                    iArr2[i14] = iArr2[i14] + 1;
                                }
                                if (i14 == 0) {
                                    for (int i16 = 0; i16 < this.sharedMediaData[mediaType].fastScrollPeriods.size(); i16++) {
                                        this.sharedMediaData[mediaType].fastScrollPeriods.get(i16).startOffset++;
                                    }
                                }
                            }
                        }
                    }
                    loadMediaCounts();
                    return;
                }
                return;
            }
            if (i != NotificationCenter.messageReceivedByServer) {
                if (i == NotificationCenter.mediaDidLoad) {
                    long jLongValue6 = ((Long) objArr[0]).longValue();
                    if (((Integer) objArr[3]).intValue() == this.parentFragment.getClassGuid()) {
                        int iIntValue3 = ((Integer) objArr[4]).intValue();
                        ArrayList arrayList2 = (ArrayList) objArr[2];
                        boolean zIsEncryptedDialog2 = DialogObject.isEncryptedDialog(jLongValue6);
                        int i17 = jLongValue6 == this.dialogId ? 0 : 1;
                        if (iIntValue3 == 0 || iIntValue3 == 6 || iIntValue3 == 7) {
                            if (iIntValue3 != this.sharedMediaData[0].filterType) {
                                return;
                            } else {
                                iIntValue3 = 0;
                            }
                        }
                        if (iIntValue3 != 0 && iIntValue3 != 1 && iIntValue3 != 2 && iIntValue3 != 4) {
                            this.sharedMediaData[iIntValue3].setTotalCount(i17, ((Integer) objArr[1]).intValue());
                        }
                        this.sharedMediaData[iIntValue3].setEndReached(i17, ((Boolean) objArr[5]).booleanValue());
                        for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                            this.sharedMediaData[iIntValue3].addMessage((MessageObject) arrayList2.get(i18), i17, false, zIsEncryptedDialog2);
                        }
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.messagesDeleted) {
                    if (((Boolean) objArr[2]).booleanValue()) {
                        return;
                    }
                    long jLongValue7 = ((Long) objArr[1]).longValue();
                    TLRPC.Chat chat = DialogObject.isChatDialog(this.dialogId) ? this.parentFragment.getMessagesController().getChat(Long.valueOf(-this.dialogId)) : null;
                    if (ChatObject.isChannel(chat)) {
                        if ((jLongValue7 != 0 || this.mergeDialogId == 0) && jLongValue7 != chat.id) {
                            return;
                        }
                    } else if (jLongValue7 != 0) {
                        return;
                    }
                    ArrayList arrayList3 = (ArrayList) objArr[0];
                    BaseFragment baseFragment2 = this.parentFragment;
                    int currentAccount2 = baseFragment2 != null ? baseFragment2.getCurrentAccount() : -1;
                    int size3 = arrayList3.size();
                    boolean z2 = false;
                    for (int i19 = 0; i19 < size3; i19++) {
                        int i20 = 0;
                        while (true) {
                            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                            if (i20 < sharedMediaDataArr.length) {
                                MessageObject messageObjectDeleteMessage = sharedMediaDataArr[i20].deleteMessage(((Integer) arrayList3.get(i19)).intValue(), 0);
                                if (messageObjectDeleteMessage != null) {
                                    if (messageObjectDeleteMessage.getDialogId() == this.dialogId && (this.topicId == 0 || MessageObject.getTopicId(currentAccount2, messageObjectDeleteMessage.messageOwner, true) == this.topicId)) {
                                        int[] iArr3 = this.mediaCount;
                                        int i21 = iArr3[i20];
                                        if (i21 > 0) {
                                            iArr3[i20] = i21 - 1;
                                        }
                                    } else {
                                        int[] iArr4 = this.mediaMergeCount;
                                        int i22 = iArr4[i20];
                                        if (i22 > 0) {
                                            iArr4[i20] = i22 - 1;
                                        }
                                    }
                                    z2 = true;
                                }
                                i20++;
                            }
                        }
                    }
                    if (z2) {
                        int i23 = 0;
                        while (true) {
                            int[] iArr5 = this.mediaCount;
                            if (i23 >= iArr5.length) {
                                break;
                            }
                            int i24 = iArr5[i23];
                            if (i24 >= 0 && (i3 = this.mediaMergeCount[i23]) >= 0) {
                                this.lastMediaCount[i23] = i24 + i3;
                            } else if (i24 >= 0) {
                                this.lastMediaCount[i23] = i24;
                            } else {
                                this.lastMediaCount[i23] = Math.max(this.mediaMergeCount[i23], 0);
                            }
                            i23++;
                        }
                        int size4 = this.delegates.size();
                        while (i8 < size4) {
                            this.delegates.get(i8).mediaCountUpdated();
                            i8++;
                        }
                    }
                    loadMediaCounts();
                    return;
                }
                if (i != NotificationCenter.replaceMessagesObjects) {
                    if (i == NotificationCenter.chatInfoDidLoad) {
                        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
                        long j4 = this.dialogId;
                        if (j4 >= 0 || chatFull.id != (-j4)) {
                            return;
                        }
                        setChatInfo(chatFull);
                        return;
                    }
                    if (i == NotificationCenter.fileLoaded) {
                        final ArrayList arrayList4 = new ArrayList();
                        int i25 = 0;
                        while (true) {
                            SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                            if (i25 >= sharedMediaDataArr2.length) {
                                break;
                            }
                            arrayList4.addAll(sharedMediaDataArr2[i25].messages);
                            i25++;
                        }
                        final String str = (String) objArr[0];
                        if (str != null) {
                            Utilities.globalQueue.postRunnable(new Runnable() {
                                @Override
                                public void run() {
                                    int i26 = 0;
                                    while (i26 < arrayList4.size()) {
                                        if (!str.equals(((MessageObject) arrayList4.get(i26)).getFileName())) {
                                            arrayList4.remove(i26);
                                            i26--;
                                        }
                                        i26++;
                                    }
                                    if (arrayList4.size() > 0) {
                                        FileLoader.getInstance(i2).checkMediaExistance(arrayList4);
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    if (i == NotificationCenter.savedMessagesDialogsUpdate) {
                        BaseFragment baseFragment3 = this.parentFragment;
                        boolean z3 = baseFragment3 != null && baseFragment3.getMessagesController().getSavedMessagesController().containsDialog(this.dialogId);
                        if (!this.checkedHasSavedMessages || this.hasSavedMessages == z3) {
                            return;
                        }
                        this.hasSavedMessages = z3;
                        int size5 = this.delegates.size();
                        for (int i26 = 0; i26 < size5; i26++) {
                            this.delegates.get(i26).mediaCountUpdated();
                        }
                        return;
                    }
                    return;
                }
                long jLongValue8 = ((Long) objArr[0]).longValue();
                long j5 = this.dialogId;
                if (jLongValue8 == j5 || jLongValue8 == this.mergeDialogId) {
                    int i27 = jLongValue8 == j5 ? 0 : 1;
                    ArrayList arrayList5 = (ArrayList) objArr[1];
                    BaseFragment baseFragment4 = this.parentFragment;
                    int currentAccount3 = baseFragment4 != null ? baseFragment4.getCurrentAccount() : -1;
                    int size6 = arrayList5.size();
                    int i28 = 0;
                    while (i28 < size6) {
                        MessageObject messageObject2 = (MessageObject) arrayList5.get(i28);
                        int id = messageObject2.getId();
                        long topicId = MessageObject.getTopicId(currentAccount3, messageObject2.messageOwner, z);
                        int mediaType2 = MediaDataController.getMediaType(messageObject2.messageOwner);
                        long j6 = this.topicId;
                        if (j6 == 0 || topicId == j6) {
                            int i29 = 0;
                            while (true) {
                                SharedMediaData[] sharedMediaDataArr3 = this.sharedMediaData;
                                if (i29 >= sharedMediaDataArr3.length) {
                                    break;
                                }
                                MessageObject messageObject3 = sharedMediaDataArr3[i29].messagesDict[i27].get(id);
                                if (messageObject3 != null) {
                                    int mediaType3 = MediaDataController.getMediaType(messageObject2.messageOwner);
                                    if (mediaType2 != -1 && mediaType3 == mediaType2) {
                                        int iIndexOf = this.sharedMediaData[i29].messages.indexOf(messageObject3);
                                        if (iIndexOf < 0) {
                                            break;
                                        }
                                        this.sharedMediaData[i29].messagesDict[i27].put(id, messageObject2);
                                        this.sharedMediaData[i29].messages.set(iIndexOf, messageObject2);
                                        break;
                                    }
                                    this.sharedMediaData[i29].deleteMessage(id, i27);
                                    if (i27 != 0) {
                                        int[] iArr6 = this.mediaMergeCount;
                                        int i30 = iArr6[i29];
                                        if (i30 <= 0) {
                                            break;
                                        }
                                        iArr6[i29] = i30 - 1;
                                        break;
                                    }
                                    int[] iArr7 = this.mediaCount;
                                    int i31 = iArr7[i29];
                                    if (i31 <= 0) {
                                        break;
                                    }
                                    iArr7[i29] = i31 - 1;
                                    break;
                                }
                                i29++;
                            }
                        }
                        i28++;
                        z = true;
                    }
                    return;
                }
                return;
            }
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() != this.dialogId && l.longValue() != this.mergeDialogId) {
                return;
            }
            int i32 = l.longValue() == this.dialogId ? 0 : 1;
            while (true) {
                SharedMediaData[] sharedMediaDataArr4 = this.sharedMediaData;
                if (i8 >= sharedMediaDataArr4.length) {
                    return;
                }
                sharedMediaDataArr4[i8].replaceMid(i32, num.intValue(), num2.intValue());
                i8++;
            }
        }

        public int[] getLastMediaCount() {
            return this.lastMediaCount;
        }

        public long getMergeDialogId() {
            return this.mergeDialogId;
        }

        public SharedMediaData[] getSharedMediaData() {
            return this.sharedMediaData;
        }

        public long getTopicId() {
            return this.topicId;
        }

        public boolean hasSharedMedia() {
            int[] lastMediaCount = getLastMediaCount();
            if (lastMediaCount == null) {
                return false;
            }
            for (int i : lastMediaCount) {
                if (i > 0) {
                    return true;
                }
            }
            if (this.hasSavedMessages) {
                return true;
            }
            BaseFragment baseFragment = this.parentFragment;
            return baseFragment != null && this.dialogId == baseFragment.getUserConfig().getClientUserId() && this.topicId == 0 && this.parentFragment.getMessagesController().getSavedMessagesController().hasDialogs();
        }

        public boolean isMediaWasLoaded() {
            return this.mediaWasLoaded;
        }

        public void onDestroy(BaseFragment baseFragment) {
            if (baseFragment != this.parentFragment) {
                return;
            }
            this.delegates.clear();
            NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
            }
        }

        public void removeDelegate(SharedMediaPreloaderDelegate sharedMediaPreloaderDelegate) {
            this.delegates.remove(sharedMediaPreloaderDelegate);
        }
    }

    public interface SharedMediaPreloaderDelegate {
        void mediaCountUpdated();
    }

    public class SharedPhotoVideoAdapter extends RecyclerListView.FastScrollAdapter {
        protected boolean inFastScrollMode;
        protected Context mContext;
        SharedPhotoVideoCell2.SharedResources sharedResources;

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            if (SharedMediaLayout.this.isSearchingStories()) {
                return false;
            }
            return recyclerListView.getChildCount() != 0 && recyclerListView.getChildAt(0).getMeasuredHeight() * ((int) Math.ceil((double) (((float) getTotalItemsCount()) / ((float) ((this == SharedMediaLayout.this.photoVideoAdapter || SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1) ? SharedMediaLayout.this.mediaColumnsCount[0] : SharedMediaLayout.this.animateToColumnsCount))))) > recyclerListView.getMeasuredHeight();
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
                int size = SharedMediaLayout.this.sharedMediaData[0].getMessages().size() + SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
                if (size != 0) {
                    return (SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1]) ? size : size + 1;
                }
                return size;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].loadingAfterFastScroll) {
                return SharedMediaLayout.this.sharedMediaData[0].getTotalCount();
            }
            if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && !SharedMediaLayout.this.sharedMediaData[0].loading) {
                return 1;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].messages.size() == 0 && ((!SharedMediaLayout.this.sharedMediaData[0].endReached[0] || !SharedMediaLayout.this.sharedMediaData[0].endReached[1]) && SharedMediaLayout.this.sharedMediaData[0].startReached)) {
                return 0;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].getTotalCount() != 0) {
                return Math.max(SharedMediaLayout.this.sharedMediaData[0].getTotalCount(), SharedMediaLayout.this.sharedMediaData[0].getMessages().size() + SharedMediaLayout.this.sharedMediaData[0].getStartOffset());
            }
            int size2 = SharedMediaLayout.this.sharedMediaData[0].getMessages().size() + SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
            if (size2 == 0) {
                return size2;
            }
            if (SharedMediaLayout.this.sharedMediaData[0].endReached[0] && SharedMediaLayout.this.sharedMediaData[0].endReached[1]) {
                return size2;
            }
            return SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() != 0 ? SharedMediaLayout.this.sharedMediaData[0].getEndLoadingStubs() + size2 : size2 + 1;
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
            return ((Period) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList)).formatedDate;
        }

        public int getPositionForIndex(int i) {
            return SharedMediaLayout.this.sharedMediaData[0].startOffset + i;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int i;
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(this) != -1 || this == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter) {
                i = SharedMediaLayout.this.animateToColumnsCount;
            } else {
                i = SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
            }
            int iCeil = (int) (Math.ceil(getTotalItemsCount() / i) * ((double) measuredHeight));
            int measuredHeight2 = recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop();
            if (measuredHeight == 0) {
                iArr[1] = 0;
                iArr[0] = 0;
            } else {
                float f2 = f * (iCeil - measuredHeight2);
                iArr[0] = ((int) (f2 / measuredHeight)) * i;
                iArr[1] = ((int) f2) % measuredHeight;
            }
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            int i;
            if (this == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter || SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(this) != -1) {
                i = SharedMediaLayout.this.animateToColumnsCount;
            } else {
                i = SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
            }
            int iCeil = (int) Math.ceil(getTotalItemsCount() / i);
            if (recyclerListView.getChildCount() == 0) {
                return 0.0f;
            }
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            View childAt = recyclerListView.getChildAt(0);
            int childAdapterPosition = recyclerListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition < 0) {
                return 0.0f;
            }
            return (((childAdapterPosition / i) * measuredHeight) - (childAt.getTop() - recyclerListView.getPaddingTop())) / ((iCeil * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
        }

        public int getTopOffset() {
            return 0;
        }

        @Override
        public int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[0].getTotalCount();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            if (viewHolder.getItemViewType() == 0) {
                ArrayList<MessageObject> messages = SharedMediaLayout.this.sharedMediaData[0].getMessages();
                int startOffset = i - SharedMediaLayout.this.sharedMediaData[0].getStartOffset();
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    int messageId = sharedPhotoVideoCell2.getMessageId();
                    if (this == SharedMediaLayout.this.photoVideoAdapter) {
                        i2 = SharedMediaLayout.this.mediaColumnsCount[0];
                    } else {
                        i2 = SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.animateToColumnsCount;
                    }
                    if (startOffset < 0 || startOffset >= messages.size()) {
                        sharedPhotoVideoCell2.setMessageObject(null, i2);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    MessageObject messageObject = messages.get(startOffset);
                    boolean z = messageObject.getId() == messageId;
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z);
                    } else {
                        sharedPhotoVideoCell2.setChecked(false, z);
                    }
                    sharedPhotoVideoCell2.setMessageObject(messageObject, i2);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0 && i != 19) {
                View viewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(this.mContext, 0, SharedMediaLayout.this.dialog_id, SharedMediaLayout.this.resourcesProvider);
                return zzkd.m(viewCreateEmptyStubView, viewCreateEmptyStubView, -1);
            }
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), SharedMediaLayout.this.resourcesProvider);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(this.mContext, this.sharedResources, SharedMediaLayout.this.profileActivity.getCurrentAccount());
            if (i == 19) {
                sharedPhotoVideoCell2.setCheck2();
            }
            sharedPhotoVideoCell2.setGradientView(SharedMediaLayout.this.globalGradientView);
            if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1) {
                sharedPhotoVideoCell2.isStory = true;
            }
            sharedPhotoVideoCell2.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(sharedPhotoVideoCell2);
        }

        @Override
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(0, true);
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                if (recyclerListView != null) {
                    int messageId = 0;
                    for (int i = 0; i < recyclerListView.getChildCount(); i++) {
                        View childAt = recyclerListView.getChildAt(i);
                        if (childAt instanceof SharedPhotoVideoCell2) {
                            messageId = ((SharedPhotoVideoCell2) childAt).getMessageId();
                        }
                        if (messageId != 0) {
                            break;
                        }
                    }
                    if (messageId == 0) {
                        SharedMediaLayout.this.findPeriodAndJumpToDate(0, recyclerListView, true);
                    }
                }
            }
        }

        @Override
        public void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(0);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }
    }

    public class StoriesAdapter extends SharedPhotoVideoAdapter {
        private final int albumId;
        public boolean applyingReorder;
        private int id;
        private boolean inAlbumStoriesReorder;
        private final boolean isArchive;
        public ArrayList<Integer> lastPinnedIds;
        private ViewsForPeerStoriesRequester poller;
        public StoriesController.StoriesList storiesList;
        private StoriesAdapter supportingAdapter;
        private final ArrayList<StoriesController.UploadingStory> uploadingStories;

        public StoriesAdapter(SharedMediaLayout sharedMediaLayout, Context context, boolean z) {
            this(context, 0, z);
        }

        private void checkColumns() {
            if (this.storiesList == null || this.isArchive) {
                return;
            }
            if ((!SharedMediaLayout.this.storiesColumnsCountSet || (SharedMediaLayout.this.allowStoriesSingleColumn && this.storiesList.getCount() > 1)) && this.storiesList.getCount() > 0 && !SharedMediaLayout.this.isStoriesView()) {
                if (this.storiesList.getCount() < 5) {
                    SharedMediaLayout.this.mediaColumnsCount[1] = this.storiesList.getCount();
                    if (SharedMediaLayout.this.mediaPages != null && SharedMediaLayout.this.mediaPages[0] != null && SharedMediaLayout.this.mediaPages[1] != null && SharedMediaLayout.this.mediaPages[0].listView != null && SharedMediaLayout.this.mediaPages[1].listView != null) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    sharedMediaLayout.allowStoriesSingleColumn = sharedMediaLayout.mediaColumnsCount[1] == 1;
                } else if (SharedMediaLayout.this.allowStoriesSingleColumn) {
                    SharedMediaLayout.this.allowStoriesSingleColumn = false;
                    SharedMediaLayout.this.mediaColumnsCount[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (SharedMediaLayout.this.mediaPages != null && SharedMediaLayout.this.mediaPages[0] != null && SharedMediaLayout.this.mediaPages[1] != null && SharedMediaLayout.this.mediaPages[0].listView != null && SharedMediaLayout.this.mediaPages[1].listView != null) {
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    }
                }
                SharedMediaLayout.this.storiesColumnsCountSet = true;
            }
        }

        public boolean canReorder(int i) {
            StoriesController.StoriesList storiesList;
            if (this.isArchive || (storiesList = this.storiesList) == null) {
                return false;
            }
            if (storiesList instanceof StoriesController.BotPreviewsList) {
                TLRPC.User user = MessagesController.getInstance(SharedMediaLayout.this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id));
                return user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
            }
            if (i < 0 || i >= storiesList.messageObjects.size()) {
                return false;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            StoriesController.StoriesList storiesList2 = this.storiesList;
            if (storiesList2.albumId > 0) {
                return true;
            }
            return storiesList2.isPinned(messageObject.getId());
        }

        public int columnsCount() {
            if (this == SharedMediaLayout.this.photoVideoAdapter) {
                return SharedMediaLayout.this.mediaColumnsCount[0];
            }
            return SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(this) != -1 ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.animateToColumnsCount;
        }

        public void destroy() {
            StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0;
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                int i = this.id;
                ArrayList arrayList = storiesList.links;
                arrayList.remove(Integer.valueOf(i));
                if (!arrayList.isEmpty() || (storyViewer$5$$ExternalSyntheticLambda0 = storiesList.destroyRunnable) == null) {
                    return;
                }
                AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda0);
                AndroidUtilities.runOnUIThread(storyViewer$5$$ExternalSyntheticLambda0, 300000L);
            }
        }

        @Override
        public boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            return super.fastScrollIsVisible(recyclerListView);
        }

        @Override
        public int getItemCount() {
            if (this.storiesList == null) {
                return 0;
            }
            return this.uploadingStories.size() + ((this.storiesList.isOnlyCache() && SharedMediaLayout.this.hasInternet()) ? 0 : this.storiesList.getCount());
        }

        @Override
        public int getItemViewType(int i) {
            return 19;
        }

        @Override
        public String getLetter(int i) {
            int topOffset;
            MessageObject messageObject;
            TL_stories.StoryItem storyItem;
            if (this.storiesList == null || (topOffset = i - getTopOffset()) < 0 || topOffset >= this.storiesList.messageObjects.size() || (messageObject = (MessageObject) this.storiesList.messageObjects.get(topOffset)) == null || (storyItem = messageObject.storyItem) == null) {
                return null;
            }
            return LocaleController.formatYearMont(storyItem.date, true);
        }

        @Override
        public int getPositionForIndex(int i) {
            return this.isArchive ? getTopOffset() + i : i;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            super.getPositionForScrollProgress(recyclerListView, f, iArr);
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            return super.getScrollProgress(recyclerListView);
        }

        @Override
        public int getTopOffset() {
            return 0;
        }

        @Override
        public int getTotalItemsCount() {
            return getItemCount();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        public boolean isSelectedAll() {
            if (this.storiesList == null) {
                return false;
            }
            int i = 0;
            while (true) {
                if (i >= this.storiesList.messageObjects.size()) {
                    return true;
                }
                MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
                SparseArray sparseArray = SharedMediaLayout.this.selectedFiles[messageObject.getDialogId() == SharedMediaLayout.this.dialog_id ? (char) 0 : (char) 1];
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    if (messageObject == ((MessageObject) sparseArray.get(sparseArray.keyAt(i2)))) {
                        i++;
                    }
                }
                return false;
            }
        }

        public void load(boolean z) {
            if (this.storiesList == null) {
                return;
            }
            int iColumnsCount = columnsCount();
            int iMin = Math.min(100, Math.max(1, iColumnsCount / 2) * iColumnsCount * iColumnsCount);
            StoriesController.StoriesList storiesList = this.storiesList;
            storiesList.getClass();
            storiesList.load(iMin, Collections.EMPTY_LIST, z);
        }

        public StoriesAdapter makeSupporting() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            StoriesAdapter storiesAdapter = sharedMediaLayout.new StoriesAdapter(sharedMediaLayout.getContext(), this.isArchive, this.storiesList);
            this.supportingAdapter = storiesAdapter;
            return storiesAdapter;
        }

        @Override
        public void notifyDataSetChanged() {
            if (this.storiesList != null && SharedMediaLayout.this.isBot()) {
                this.uploadingStories.clear();
                StoriesController storiesController = MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController();
                ArrayList arrayList = (ArrayList) storiesController.uploadingStoriesByDialogId.get(SharedMediaLayout.this.dialog_id);
                if (arrayList != null) {
                    this.uploadingStories.addAll(arrayList);
                }
            }
            super.notifyDataSetChanged();
            StoriesAdapter storiesAdapter = this.supportingAdapter;
            if (storiesAdapter != null) {
                storiesAdapter.notifyDataSetChanged();
            }
            checkColumns();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.storiesList != null && viewHolder.getItemViewType() == 19) {
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    if (i >= 0 && i < this.uploadingStories.size()) {
                        StoriesController.UploadingStory uploadingStory = this.uploadingStories.get(i);
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        if (uploadingStory.sharedMessageObject == null) {
                            TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                            long j = uploadingStory.random_id;
                            int i2 = (int) (j ^ (j >>> 32));
                            tL_storyItem.messageId = i2;
                            tL_storyItem.id = i2;
                            tL_storyItem.attachPath = uploadingStory.firstFramePath;
                            MessageObject messageObject = new MessageObject(this.storiesList.currentAccount, tL_storyItem) {
                                @Override
                                public float getProgress() {
                                    return this.uploadingStory.progress;
                                }
                            };
                            uploadingStory.sharedMessageObject = messageObject;
                            messageObject.uploadingStory = uploadingStory;
                        }
                        sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        sharedPhotoVideoCell2.setReorder(false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    int size = i - this.uploadingStories.size();
                    if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        sharedPhotoVideoCell2.setMessageObject(null, columnsCount());
                        sharedPhotoVideoCell2.isStory = true;
                        return;
                    }
                    MessageObject messageObject2 = (MessageObject) this.storiesList.messageObjects.get(size);
                    sharedPhotoVideoCell2.isStoryPinned = messageObject2 != null && this.storiesList.isPinned(messageObject2.getId());
                    sharedPhotoVideoCell2.setReorder(SharedMediaLayout.this.isBot() || sharedPhotoVideoCell2.isStoryPinned);
                    sharedPhotoVideoCell2.isSearchingHashtag = SharedMediaLayout.this.isSearchingStories();
                    sharedPhotoVideoCell2.setMessageObject(messageObject2, columnsCount());
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    if (!sharedMediaLayout.isActionModeShowed || messageObject2 == null) {
                        sharedPhotoVideoCell2.setChecked(false, false);
                    } else {
                        sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > SharedMediaLayout.this.dialog_id ? 1 : (messageObject2.getDialogId() == SharedMediaLayout.this.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, true);
                    }
                    sharedPhotoVideoCell2.setReordering(this.inAlbumStoriesReorder, false);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolderOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            View view = viewHolderOnCreateViewHolder.itemView;
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).isStory = true;
            }
            return viewHolderOnCreateViewHolder;
        }

        @Override
        public void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(this.isArchive ? 9 : 8, true);
        }

        @Override
        public void onFinishFastScroll(RecyclerListView recyclerListView) {
            super.onFinishFastScroll(recyclerListView);
        }

        @Override
        public void onStartFastScroll() {
            super.onStartFastScroll();
        }

        public void reorderDone() {
            StoriesController.StoriesList storiesList;
            ArrayList arrayList;
            if (this.isArchive || (storiesList = this.storiesList) == null || !this.applyingReorder) {
                return;
            }
            if ((storiesList instanceof StoriesController.BotPreviewsList) || this.albumId > 0) {
                arrayList = new ArrayList();
                for (int i = 0; i < this.storiesList.messageObjects.size(); i++) {
                    arrayList.add(Integer.valueOf(((MessageObject) this.storiesList.messageObjects.get(i)).getId()));
                }
            } else {
                arrayList = storiesList.pinnedIds;
            }
            boolean z = this.lastPinnedIds.size() != arrayList.size();
            if (!z) {
                for (int i2 = 0; i2 < this.lastPinnedIds.size(); i2++) {
                    if (this.lastPinnedIds.get(i2) != arrayList.get(i2)) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                this.storiesList.updatePinnedOrder(arrayList, true);
            }
            this.applyingReorder = false;
        }

        public void setInAlbumStoriesReorder(boolean z) {
            if (this.inAlbumStoriesReorder != z) {
                this.inAlbumStoriesReorder = z;
            }
        }

        public boolean swapElements(int i, int i2) {
            StoriesController.StoriesList storiesList;
            ArrayList arrayList;
            if (this.isArchive || (storiesList = this.storiesList) == null || i < 0 || i >= storiesList.messageObjects.size() || i2 < 0 || i2 >= this.storiesList.messageObjects.size()) {
                return false;
            }
            if ((this.storiesList instanceof StoriesController.BotPreviewsList) || this.albumId > 0) {
                arrayList = new ArrayList();
                for (int i3 = 0; i3 < this.storiesList.messageObjects.size(); i3++) {
                    arrayList.add(Integer.valueOf(((MessageObject) this.storiesList.messageObjects.get(i3)).getId()));
                }
            } else {
                arrayList = new ArrayList(this.storiesList.pinnedIds);
            }
            if (!this.applyingReorder) {
                this.lastPinnedIds.clear();
                this.lastPinnedIds.addAll(arrayList);
                this.applyingReorder = true;
            }
            MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(i);
            arrayList.remove(Integer.valueOf(messageObject.getId()));
            arrayList.add(Utilities.clamp(i2, arrayList.size(), 0), Integer.valueOf(messageObject.getId()));
            this.storiesList.updatePinnedOrder(arrayList, false);
            notifyItemMoved(i, i2);
            return true;
        }

        public StoriesAdapter(Context context, int i, boolean z) {
            TLRPC.User user;
            super(context);
            this.uploadingStories = new ArrayList<>();
            this.lastPinnedIds = new ArrayList<>();
            this.isArchive = z;
            this.albumId = i;
            int currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            if (!TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtag())) {
                if (SharedMediaLayout.this.searchStoriesList == null) {
                    SharedMediaLayout.this.searchStoriesList = new StoriesController.SearchStoriesList(currentAccount, TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtagUsername()) ? null : SharedMediaLayout.this.getStoriesHashtagUsername(), SharedMediaLayout.this.getStoriesHashtag());
                }
                this.storiesList = SharedMediaLayout.this.searchStoriesList;
            } else if (SharedMediaLayout.this.getStoriesArea() != null) {
                if (SharedMediaLayout.this.searchStoriesList == null) {
                    SharedMediaLayout.this.searchStoriesList = new StoriesController.SearchStoriesList(currentAccount, SharedMediaLayout.this.getStoriesArea());
                }
                this.storiesList = SharedMediaLayout.this.searchStoriesList;
            } else if ((!z || SharedMediaLayout.this.isStoriesView()) && (z || !SharedMediaLayout.this.isArchivedOnlyStoriesView())) {
                boolean z2 = SharedMediaLayout.this.dialog_id > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(SharedMediaLayout.this.dialog_id))) != null && user.bot;
                if (i > 0) {
                    this.storiesList = SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController().getStoriesList(SharedMediaLayout.this.dialog_id, 0, i, true);
                } else {
                    this.storiesList = SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController().getStoriesList(SharedMediaLayout.this.dialog_id, z2 ? 4 : z ? 1 : 0, -1, true);
                }
            } else {
                this.storiesList = null;
            }
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                int i2 = storiesList.maxLinkId;
                storiesList.maxLinkId = i2 + 1;
                storiesList.links.add(Integer.valueOf(i2));
                StoryViewer$5$$ExternalSyntheticLambda0 storyViewer$5$$ExternalSyntheticLambda0 = storiesList.destroyRunnable;
                if (storyViewer$5$$ExternalSyntheticLambda0 != null) {
                    AndroidUtilities.cancelRunOnUIThread(storyViewer$5$$ExternalSyntheticLambda0);
                }
                this.id = i2;
                this.poller = new ViewsForPeerStoriesRequester(SharedMediaLayout.this.profileActivity.getMessagesController().getStoriesController(), SharedMediaLayout.this.dialog_id, this.storiesList.currentAccount) {
                    @Override
                    public void getStoryIds(ArrayList<Integer> arrayList) {
                        InternalListView internalListView;
                        MessageObject messageObject;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= SharedMediaLayout.this.mediaPages.length) {
                                internalListView = null;
                                break;
                            }
                            if (SharedMediaLayout.this.mediaPages[i3].listView != null) {
                                RecyclerView.Adapter adapter = SharedMediaLayout.this.mediaPages[i3].listView.getAdapter();
                                StoriesAdapter storiesAdapter = StoriesAdapter.this;
                                if (adapter == storiesAdapter) {
                                    internalListView = SharedMediaLayout.this.mediaPages[i3].listView;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (internalListView != null) {
                            for (int i4 = 0; i4 < internalListView.getChildCount(); i4++) {
                                View childAt = internalListView.getChildAt(i4);
                                if ((childAt instanceof SharedPhotoVideoCell2) && (messageObject = ((SharedPhotoVideoCell2) childAt).getMessageObject()) != null && messageObject.isStory()) {
                                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                                }
                            }
                        }
                    }

                    @Override
                    public boolean updateStories(ArrayList<Integer> arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
                        TL_stories.StoryItem storyItem;
                        StoriesController.StoriesList storiesList2 = StoriesAdapter.this.storiesList;
                        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
                        storiesList2.getClass();
                        if (arrayList != null && arrayList2 != null) {
                            boolean z3 = false;
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                Integer num = arrayList.get(i3);
                                num.getClass();
                                if (i3 >= arrayList2.size()) {
                                    break;
                                }
                                TL_stories.StoryViews storyViews = arrayList2.get(i3);
                                MessageObject messageObject = (MessageObject) storiesList2.messageObjectsMap.get(num);
                                if (messageObject != null && (storyItem = messageObject.storyItem) != null) {
                                    storyItem.views = storyViews;
                                    z3 = true;
                                }
                            }
                            if (z3) {
                                storiesList2.saveCache();
                            }
                        }
                        return true;
                    }
                };
            }
            checkColumns();
        }

        private StoriesAdapter(Context context, boolean z, StoriesController.StoriesList storiesList) {
            super(context);
            this.uploadingStories = new ArrayList<>();
            this.lastPinnedIds = new ArrayList<>();
            this.isArchive = z;
            this.albumId = 0;
            this.storiesList = storiesList;
        }
    }

    public class StoryAlbumData {
        public final StoriesAdapter adapter;
        public final StoriesAdapter adapterSupport;
        public final int albumId;
        public final int tabType;

        private StoryAlbumData(Context context, int i) {
            this.albumId = i;
            this.tabType = SharedMediaLayout.getStoryAlbumType(SharedMediaLayout.access$14608(SharedMediaLayout.this));
            this.adapter = new StoriesAdapter(context, i, false) {
                {
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                }

                @Override
                public void notifyDataSetChanged() {
                    super.notifyDataSetChanged();
                    StoryAlbumData storyAlbumData = StoryAlbumData.this;
                    MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(storyAlbumData.tabType);
                    if (mediaPage != null && mediaPage.animationSupportingListView.getVisibility() == 0) {
                        StoryAlbumData.this.adapterSupport.notifyDataSetChanged();
                    }
                    if (mediaPage != null) {
                        StickerEmptyView stickerEmptyView = mediaPage.emptyView;
                        StoriesController.StoriesList storiesList = this.storiesList;
                        stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                    }
                }
            };
            this.adapterSupport = SharedMediaLayout.this.new StoriesAdapter(context, i, false);
        }
    }

    public SharedMediaLayout(Context context, long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList<Integer> arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, Delegate delegate, int i4, Theme.ResourcesProvider resourcesProvider) {
        this(context, j, sharedMediaPreloader, i, arrayList, chatFull, userFull, i2, i3, baseFragment, delegate, i4, resourcesProvider, null);
    }

    public static int access$14608(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.tabIndexCounter;
        sharedMediaLayout.tabIndexCounter = i + 1;
        return i;
    }

    public static void access$3800(SharedMediaLayout sharedMediaLayout, StoriesController.StoryAlbum storyAlbum) {
        sharedMediaLayout.onStoryAlbumCreate(storyAlbum);
    }

    public static int access$4908(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.cantDeleteMessagesCount;
        sharedMediaLayout.cantDeleteMessagesCount = i + 1;
        return i;
    }

    public static int access$4910(SharedMediaLayout sharedMediaLayout) {
        int i = sharedMediaLayout.cantDeleteMessagesCount;
        sharedMediaLayout.cantDeleteMessagesCount = i - 1;
        return i;
    }

    private CharSequence addPostText() {
        if (this.addPostButton == null) {
            this.addPostButton = new SpannableStringBuilder();
            if (isBot()) {
                this.addPostButton.append((CharSequence) LocaleController.getString(R.string.ProfileBotPreviewEmptyButton));
            } else {
                this.addPostButton.append((CharSequence) "c");
                this.addPostButton.setSpan(new ColoredImageSpan(R.drawable.filled_premium_camera), 0, 1, 33);
                this.addPostButton.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.StoriesAddPost));
            }
        }
        return this.addPostButton;
    }

    public void addStoryAlbumShareItemOptions(ItemOptions itemOptions, BaseFragment baseFragment, long j, int i) {
        String publicUsername = j > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getUser(Long.valueOf(j))) : ChatObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        Fragment$$ExternalSyntheticOutline0.m(sb, MessagesController.getInstance(baseFragment.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb.append(i);
        itemOptions.add(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new ShareAlert$$ExternalSyntheticLambda12(this, sb.toString(), baseFragment, 2));
    }

    public void addZoomInZoomOutItemOptions(ItemOptions itemOptions) {
        int itemsCount = itemOptions.getItemsCount();
        final int i = 0;
        itemOptions.add(R.drawable.msg_zoomin, LocaleController.getString(R.string.MediaZoomIn), new Runnable(this) {
            public final SharedMediaLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        this.f$0.lambda$addZoomInZoomOutItemOptions$77(viewArr);
                        break;
                    default:
                        this.f$0.lambda$addZoomInZoomOutItemOptions$78(viewArr);
                        break;
                }
            }
        });
        final int i2 = 1;
        itemOptions.add(R.drawable.msg_zoomout, LocaleController.getString(R.string.MediaZoomOut), new Runnable(this) {
            public final SharedMediaLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$addZoomInZoomOutItemOptions$77(viewArr);
                        break;
                    default:
                        this.f$0.lambda$addZoomInZoomOutItemOptions$78(viewArr);
                        break;
                }
            }
        });
        final View[] viewArr = {itemOptions.getItemAt(itemsCount), itemOptions.getItemAt(itemsCount + 1)};
        if (!canZoomIn()) {
            viewArr[0].setEnabled(false);
            viewArr[0].setAlpha(0.5f);
        }
        if (canZoomOut()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
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
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass45(recyclerListView, sparseBooleanArray, view, i));
    }

    private void animateToMediaColumnsCount(final int i) {
        final MediaPage mediaPage = getMediaPage(this.changeColumnsTab);
        this.pinchCenterPosition = -1;
        if (mediaPage != null) {
            mediaPage.listView.stopScroll();
            this.animateToColumnsCount = i;
            mediaPage.animationSupportingListView.setVisibility(0);
            if (isAnyStoryPageType(this.changeColumnsTab)) {
                mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
            } else {
                mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
            }
            InternalListView internalListView = mediaPage.animationSupportingListView;
            int paddingLeft = mediaPage.animationSupportingListView.getPaddingLeft();
            InternalListView internalListView2 = mediaPage.animationSupportingListView;
            int pagePaddingTop = getPagePaddingTop(mediaPage.selectedType);
            internalListView2.hintPaddingTop = pagePaddingTop;
            int paddingRight = mediaPage.animationSupportingListView.getPaddingRight();
            InternalListView internalListView3 = mediaPage.animationSupportingListView;
            int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
            internalListView3.hintPaddingBottom = pagePaddingBottom;
            internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
            mediaPage.animationSupportingLayoutManager.setSpanCount(i);
            mediaPage.animationSupportingListView.invalidateItemDecorations();
            int i2 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i2 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage2 = mediaPageArr[i2];
                if (mediaPage2 != null && isTabZoomable(mediaPage2.selectedType)) {
                    AndroidUtilities.updateVisibleRows(this.mediaPages[i2].listView);
                }
                i2++;
            }
            this.photoVideoChangeColumnsAnimation = true;
            if (this.changeColumnsTab == 0) {
                this.sharedMediaData[0].setListFrozen(true);
            }
            this.photoVideoChangeColumnsProgress = 0.0f;
            saveScrollPosition();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.notificationsLocker.lock();
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            final int i3 = isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    RecyclerView.Adapter adapter;
                    SharedMediaLayout.this.notificationsLocker.unlock();
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    SharedMediaLayout.this.mediaColumnsCount[i3] = i;
                    for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                        if (SharedMediaLayout.this.mediaPages[i4] != null && SharedMediaLayout.this.mediaPages[i4].listView != null) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            if (sharedMediaLayout.isTabZoomable(sharedMediaLayout.mediaPages[i4].selectedType) && (adapter = SharedMediaLayout.this.mediaPages[i4].listView.getAdapter()) != null) {
                                int itemCount = adapter.getItemCount();
                                if (i4 == 0) {
                                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                                }
                                SharedMediaLayout.this.mediaPages[i4].layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount[i3]);
                                SharedMediaLayout.this.mediaPages[i4].listView.invalidateItemDecorations();
                                if (adapter.getItemCount() == itemCount) {
                                    AndroidUtilities.updateVisibleRows(SharedMediaLayout.this.mediaPages[i4].listView);
                                } else {
                                    adapter.notifyDataSetChanged();
                                }
                                SharedMediaLayout.this.mediaPages[i4].animationSupportingListView.setVisibility(8);
                            }
                        }
                    }
                    SharedMediaLayout.this.saveScrollPosition();
                }
            });
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setStartDelay(100L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.start();
        }
    }

    public ItemOptions buildItemOptionsForStoryAlbumActionBar(final BaseFragment baseFragment, View view, final long j, final int i) {
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(baseFragment, view);
        final int i2 = 0;
        itemOptionsMakeOptions.add(R.drawable.menu_add_stories, LocaleController.getString(R.string.StoriesAlbumMenuAddStories), new Runnable(this) {
            public final SharedMediaLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$73(baseFragment, j, i, itemOptionsMakeOptions);
                        break;
                    default:
                        this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$75(baseFragment, j, i, itemOptionsMakeOptions);
                        break;
                }
            }
        });
        addStoryAlbumShareItemOptions(itemOptionsMakeOptions, baseFragment, j, i);
        itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new SlotsDrawable$$ExternalSyntheticLambda9(this, i, itemOptionsMakeOptions, 21));
        final int i3 = 1;
        itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), true, new Runnable(this) {
            public final SharedMediaLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$73(baseFragment, j, i, itemOptionsMakeOptions);
                        break;
                    default:
                        this.f$0.lambda$buildItemOptionsForStoryAlbumActionBar$75(baseFragment, j, i, itemOptionsMakeOptions);
                        break;
                }
            }
        });
        itemOptionsMakeOptions.addGap();
        addZoomInZoomOutItemOptions(itemOptionsMakeOptions);
        itemOptionsMakeOptions.setDismissWithButtons(false);
        return itemOptionsMakeOptions;
    }

    public void changeMediaFilterType() {
        final Bitmap bitmapCreateBitmap;
        final MediaPage mediaPage = getMediaPage(0);
        if (mediaPage != null && mediaPage.getMeasuredHeight() > 0 && mediaPage.getMeasuredWidth() > 0) {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(mediaPage.getMeasuredWidth(), mediaPage.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmapCreateBitmap = null;
            }
            if (bitmapCreateBitmap != null) {
                this.changeTypeAnimation = true;
                mediaPage.listView.draw(new Canvas(bitmapCreateBitmap));
                final View view = new View(mediaPage.getContext());
                view.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                mediaPage.addView(view);
                view.animate().alpha(0.0f).setDuration(200L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        SharedMediaLayout.this.changeTypeAnimation = false;
                        if (view.getParent() != null) {
                            mediaPage.removeView(view);
                            bitmapCreateBitmap.recycle();
                        }
                    }
                }).start();
                mediaPage.listView.setAlpha(0.0f);
                mediaPage.listView.animate().alpha(1.0f).setUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(mediaPage, 26)).setDuration(200L).start();
            }
        }
        int[] lastMediaCount = this.sharedMediaPreloader.getLastMediaCount();
        ArrayList<MessageObject> arrayList = this.sharedMediaPreloader.getSharedMediaData()[0].messages;
        this.sharedMediaData[0].setTotalCount(1, 0);
        SharedMediaData sharedMediaData = this.sharedMediaData[0];
        int i = sharedMediaData.filterType;
        if (i == 0) {
            sharedMediaData.setTotalCount(0, lastMediaCount[0]);
        } else if (i == 1) {
            sharedMediaData.setTotalCount(0, lastMediaCount[6]);
        } else {
            sharedMediaData.setTotalCount(0, lastMediaCount[7]);
        }
        this.sharedMediaData[0].fastScrollDataLoaded = false;
        jumpToDate(0, DialogObject.isEncryptedDialog(this.dialog_id) ? Integer.MIN_VALUE : Integer.MAX_VALUE, 0, true);
        loadFastScrollData(false);
        this.delegate.updateSelectedMediaTabText();
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(this.dialog_id);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject messageObject = arrayList.get(i2);
            SharedMediaData sharedMediaData2 = this.sharedMediaData[0];
            int i3 = sharedMediaData2.filterType;
            if (i3 == 0) {
                sharedMediaData2.addMessage(messageObject, 0, false, zIsEncryptedDialog);
            } else if (i3 == 1) {
                if (messageObject.isPhoto()) {
                    this.sharedMediaData[0].addMessage(messageObject, 0, false, zIsEncryptedDialog);
                }
            } else if (!messageObject.isPhoto()) {
                this.sharedMediaData[0].addMessage(messageObject, 0, false, zIsEncryptedDialog);
            }
        }
    }

    public void checkCurrentTabValid() {
        if (this.scrollSlidingTextTabStrip.hasTab(this.scrollSlidingTextTabStrip.getCurrentTabId())) {
            return;
        }
        int firstTabId = this.scrollSlidingTextTabStrip.getFirstTabId();
        this.scrollSlidingTextTabStrip.setInitialTabId(firstTabId);
        this.mediaPages[0].selectedType = firstTabId;
        switchToCurrentSelectedMode(false);
    }

    public void checkLoadMoreScroll(MediaPage mediaPage, RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        int i;
        int i2;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        StoriesController.StoriesList storiesList;
        if (this.photoVideoChangeColumnsAnimation || this.jumpToRunnable != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (recyclerListView.getFastScroll() == null || !recyclerListView.getFastScroll().isPressed() || jCurrentTimeMillis - mediaPage.lastCheckScrollTime >= 300) {
            mediaPage.lastCheckScrollTime = jCurrentTimeMillis;
            if ((this.searching && this.searchWas && mediaPage.selectedType != 11) || mediaPage.selectedType == 7) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(linearLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            int itemCount = recyclerListView.getAdapter() == null ? 0 : recyclerListView.getAdapter().getItemCount();
            int i3 = mediaPage.selectedType;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                itemCount = this.sharedMediaData[i3].getStartOffset() + this.sharedMediaData[i3].messages.size();
                SharedMediaData sharedMediaData = this.sharedMediaData[i3];
                if (sharedMediaData.fastScrollDataLoaded && sharedMediaData.fastScrollPeriods.size() > 2 && mediaPage.selectedType == 0 && this.sharedMediaData[i3].messages.size() != 0) {
                    float f = i3 == 0 ? this.mediaColumnsCount[0] : 1;
                    int measuredHeight = (int) ((recyclerListView.getMeasuredHeight() / (recyclerListView.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < this.sharedMediaData[i3].fastScrollPeriods.get(1).startOffset) {
                        measuredHeight = this.sharedMediaData[i3].fastScrollPeriods.get(1).startOffset;
                    }
                    if ((iFindFirstVisibleItemPosition > itemCount && iFindFirstVisibleItemPosition - itemCount > measuredHeight) || ((i = iFindFirstVisibleItemPosition + iAbs) < this.sharedMediaData[i3].startOffset && this.sharedMediaData[0].startOffset - i > measuredHeight)) {
                        SlotsDrawable$$ExternalSyntheticLambda9 slotsDrawable$$ExternalSyntheticLambda9 = new SlotsDrawable$$ExternalSyntheticLambda9(this, i3, recyclerListView, 19);
                        this.jumpToRunnable = slotsDrawable$$ExternalSyntheticLambda9;
                        AndroidUtilities.runOnUIThread(slotsDrawable$$ExternalSyntheticLambda9);
                        return;
                    }
                }
            }
            int i4 = mediaPage.selectedType;
            if (i4 == 7) {
                return;
            }
            if (isAnyStoryPageType(i4)) {
                StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(mediaPage.selectedType);
                if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) == null || iFindFirstVisibleItemPosition + iAbs <= storiesList.getLoadedCount() - this.mediaColumnsCount[1]) {
                    return;
                }
                storiesAdapterStoryAlbums_getStoriesAdapterByTabType.load(false);
                return;
            }
            int i5 = mediaPage.selectedType;
            if (i5 == 6) {
                if (iAbs <= 0 || this.commonGroupsAdapter.endReached || this.commonGroupsAdapter.loading || this.commonGroupsAdapter.chats.isEmpty() || iFindFirstVisibleItemPosition + iAbs < itemCount - 5) {
                    return;
                }
                CommonGroupsAdapter commonGroupsAdapter = this.commonGroupsAdapter;
                commonGroupsAdapter.getChats(((TLRPC.Chat) commonGroupsAdapter.chats.get(this.commonGroupsAdapter.chats.size() - 1)).id, 100);
                return;
            }
            if (i5 == 11) {
                int iMax = -1;
                for (int i6 = 0; i6 < mediaPage.listView.getChildCount(); i6++) {
                    iMax = Math.max(mediaPage.listView.getChildAdapterPosition(mediaPage.listView.getChildAt(i6)), iMax);
                }
                RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
                SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
                if (adapter == savedMessagesSearchAdapter) {
                    if (iMax + 1 >= this.savedMessagesSearchAdapter.loadedMessages.size() + savedMessagesSearchAdapter.dialogs.size()) {
                        this.savedMessagesSearchAdapter.loadMore();
                        return;
                    }
                    return;
                } else {
                    if (iMax + 1 >= this.profileActivity.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        this.profileActivity.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                }
            }
            int i7 = 10;
            if (i5 == 10 || i5 == 12 || i5 == 13 || i5 == 14) {
                return;
            }
            if (i5 == 0) {
                i7 = 3;
            } else if (i5 != 5) {
                i7 = 6;
            }
            int i8 = i5 == 15 ? 8 : i5;
            if (iAbs + iFindFirstVisibleItemPosition > itemCount - i7 || this.sharedMediaData[i8].loadingAfterFastScroll) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                SharedMediaData sharedMediaData2 = sharedMediaDataArr[i8];
                if (!sharedMediaData2.loading) {
                    if (i5 == 0) {
                        int i9 = sharedMediaDataArr[0].filterType;
                        i2 = i9 == 1 ? 6 : i9 == 2 ? 7 : 0;
                    } else if (i5 == 1) {
                        i2 = 1;
                    } else if (i5 == 2) {
                        i2 = 2;
                    } else if (i5 == 4) {
                        i2 = 4;
                    } else if (i5 == 5) {
                        i2 = 5;
                    } else {
                        i2 = i5 == 15 ? 8 : 3;
                    }
                    boolean[] zArr = sharedMediaData2.endReached;
                    if (!zArr[0]) {
                        sharedMediaData2.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, this.sharedMediaData[i8].max_id[0], 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i8].requestIndex, null, null);
                    } else if (this.mergeDialogId != 0 && !zArr[1]) {
                        sharedMediaData2.loading = true;
                        this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[i8].max_id[1], 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i8].requestIndex, null, null);
                    }
                }
            }
            int positionForIndex = this.sharedMediaData[i8].startOffset;
            if (i8 == 0) {
                positionForIndex = this.photoVideoAdapter.getPositionForIndex(0);
            }
            if (iFindFirstVisibleItemPosition - positionForIndex < i7 + 1) {
                SharedMediaData sharedMediaData3 = this.sharedMediaData[i8];
                if (!sharedMediaData3.loading && !sharedMediaData3.startReached && !sharedMediaData3.loadingAfterFastScroll) {
                    loadFromStart(mediaPage.selectedType);
                }
            }
            if (this.mediaPages[0].listView == recyclerListView) {
                int i10 = this.mediaPages[0].selectedType;
                if ((i10 != 0 && i10 != 5) || iFindFirstVisibleItemPosition == -1 || (viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                    return;
                }
                if (viewHolderFindViewHolderForAdapterPosition.getItemViewType() == 0 || viewHolderFindViewHolderForAdapterPosition.getItemViewType() == 12) {
                    View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                    if (!(view instanceof SharedPhotoVideoCell)) {
                        if (view instanceof ContextLinkCell) {
                            this.floatingDateView.setCustomDate(((ContextLinkCell) view).getDate(), false, true);
                        }
                    } else {
                        SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) view;
                        MessageObject messageObject = sharedPhotoVideoCell.itemsCount <= 0 ? null : sharedPhotoVideoCell.messageObjects[0];
                        if (messageObject != null) {
                            this.floatingDateView.setCustomDate(messageObject.messageOwner.date, false, true);
                        }
                    }
                }
            }
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

    public void checkStoriesTabsPosition() {
        char c;
        float fAbs;
        float y;
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[0];
        if (mediaPage == null || mediaPageArr[1] == null) {
            return;
        }
        float f = 0.0f;
        if (this.storiesContainer != null) {
            char c2 = (!isAnyStoryPageType(mediaPage.selectedType) || this.mediaPages[0].selectedType == 9) ? (char) 0 : (char) 1;
            if (this.mediaPages[1].getVisibility() == 0) {
                c = (!isAnyStoryPageType(this.mediaPages[1].selectedType) || this.mediaPages[1].selectedType == 9) ? (char) 0 : (char) 1;
            } else {
                c = c2;
            }
            if (c2 == c) {
                fAbs = c2 != 0 ? 1.0f : 0.0f;
                this.storiesContainer.setTranslationX(c2 != 0 ? 0.0f : this.mediaPages[0].getMeasuredWidth());
            } else {
                this.storiesContainer.setTranslationX(this.mediaPages[c2 ^ 1].getTranslationX());
                fAbs = 1.0f - (Math.abs(this.storiesContainer.getTranslationX()) / this.storiesContainer.getMeasuredWidth());
            }
            int i = 0;
            float fClamp01 = 0.0f;
            while (true) {
                MediaPage[] mediaPageArr2 = this.mediaPages;
                if (i >= mediaPageArr2.length) {
                    break;
                }
                if (mediaPageArr2[i].getVisibility() == 0) {
                    InternalListView internalListView = this.mediaPages[i].listView;
                    View childAt = internalListView.getChildCount() == 0 ? null : internalListView.getChildAt(0);
                    if ((childAt == null ? -1 : internalListView.getChildAdapterPosition(childAt)) == 0) {
                        y = childAt.getY() - internalListView.getPaddingTop();
                    } else {
                        y = internalListView.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f);
                    }
                    fClamp01 += Utilities.clamp01(1.0f - (this.mediaPages[i].getTranslationX() / this.mediaPages[i].getMeasuredWidth())) * y;
                }
                i++;
            }
            float fClamp02 = Utilities.clamp01(1.0f - ((-fClamp01) / AndroidUtilities.dpf2(48.0f)));
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp02);
            this.storiesContainer.setAlpha(fClamp02);
            this.storiesContainer.setScaleX(fLerp);
            this.storiesContainer.setScaleY(fLerp);
            this.storiesContainer.setTranslationY(this.topPadding + fClamp01);
            f = fAbs;
        }
        checkUi_topPanelLayoutY();
        if (this.subTabsVisibilityFactor != f) {
            this.subTabsVisibilityFactor = f;
            invalidateBlur();
            invalidate();
        }
    }

    public void checkUi_topPanelLayoutY() {
        if (this.topPanelLayout != null) {
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
            float visibilityFactor = 0.0f;
            if (profileStoriesCollectionTabs != null) {
                visibilityFactor = 0.0f + (this.storiesContainer.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(profileStoriesCollectionTabs.getTranslationX() / this.storiesContainer.getMeasuredWidth())));
            }
            this.topPanelLayout.setTranslationY(this.topPadding + visibilityFactor);
        }
    }

    public static View createEmptyStubView(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider) {
        EmptyStubView emptyStubView = new EmptyStubView(context, resourcesProvider);
        if (i == 0) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return emptyStubView;
            }
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoMedia));
            return emptyStubView;
        }
        if (i == 1) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return emptyStubView;
            }
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return emptyStubView;
        }
        if (i == 2) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return emptyStubView;
            }
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return emptyStubView;
        }
        if (i == 3) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return emptyStubView;
            }
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return emptyStubView;
        }
        if (i == 4) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return emptyStubView;
            }
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return emptyStubView;
        }
        if (i == 5) {
            if (DialogObject.isEncryptedDialog(j)) {
                emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return emptyStubView;
            }
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoGIFs));
            return emptyStubView;
        }
        if (i == 6) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return emptyStubView;
        }
        if (i == 7) {
            emptyStubView.emptyImageView.setImageDrawable(null);
            emptyStubView.emptyTextView.setText("");
        }
        return emptyStubView;
    }

    private ScrollSlidingTextTabStripInner createScrollingTextTabStrip(Context context) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = new ScrollSlidingTextTabStripInner(context, this.resourcesProvider) {
            @Override
            public int processColor(int i) {
                return SharedMediaLayout.this.processColor(i);
            }
        };
        int i = this.initialTab;
        if (i != -1) {
            scrollSlidingTextTabStripInner.setInitialTabId(i);
            this.initialTab = -1;
        }
        scrollSlidingTextTabStripInner.animationDuration = 320L;
        scrollSlidingTextTabStripInner.setColors(Theme.key_profile_tabSelectedLine, Theme.key_profile_tabSelectedText, Theme.key_profile_tabText, Theme.key_profile_tabSelector);
        scrollSlidingTextTabStripInner.setUseMinimalWidth(true);
        scrollSlidingTextTabStripInner.setDelegate(new AnonymousClass40());
        return scrollSlidingTextTabStripInner;
    }

    private boolean fillMediaData(int i) {
        SharedMediaData[] sharedMediaData = this.sharedMediaPreloader.getSharedMediaData();
        if (sharedMediaData == null) {
            return false;
        }
        if (i == 0) {
            SharedMediaData sharedMediaData2 = this.sharedMediaData[i];
            if (!sharedMediaData2.fastScrollDataLoaded) {
                int[] iArr = sharedMediaData2.totalCount;
                int[] iArr2 = sharedMediaData[i].totalCount;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = this.sharedMediaData[i].totalCount;
            int[] iArr4 = sharedMediaData[i].totalCount;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        this.sharedMediaData[i].messages.addAll(sharedMediaData[i].messages);
        this.sharedMediaData[i].sections.addAll(sharedMediaData[i].sections);
        for (Map.Entry<String, ArrayList<MessageObject>> entry : sharedMediaData[i].sectionArrays.entrySet()) {
            this.sharedMediaData[i].sectionArrays.put(entry.getKey(), new ArrayList<>(entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            this.sharedMediaData[i].messagesDict[i2] = sharedMediaData[i].messagesDict[i2].clone();
            SharedMediaData sharedMediaData3 = this.sharedMediaData[i];
            int[] iArr5 = sharedMediaData3.max_id;
            SharedMediaData sharedMediaData4 = sharedMediaData[i];
            iArr5[i2] = sharedMediaData4.max_id[i2];
            sharedMediaData3.endReached[i2] = sharedMediaData4.endReached[i2];
        }
        this.sharedMediaData[i].fastScrollPeriods.addAll(sharedMediaData[i].fastScrollPeriods);
        return !sharedMediaData[i].messages.isEmpty();
    }

    public void findPeriodAndJumpToDate(int i, RecyclerListView recyclerListView, boolean z) {
        ArrayList<Period> arrayList = this.sharedMediaData[i].fastScrollPeriods;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerListView.getLayoutManager()).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0) {
            Period period = null;
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (iFindFirstVisibleItemPosition <= arrayList.get(i2).startOffset) {
                        period = arrayList.get(i2);
                        break;
                    }
                }
                if (period == null) {
                    period = (Period) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList);
                }
            }
            if (period != null) {
                jumpToDate(i, period.maxId, period.startOffset + 1, z);
            }
        }
    }

    private void finishPinchToMediaColumnsCount() {
        final MediaPage mediaPage;
        RecyclerView.Adapter adapter;
        int i = 0;
        if (!this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            mediaPage = mediaPageArr[i2];
            if (mediaPage.selectedType == this.changeColumnsTab) {
                break;
            } else {
                i2++;
            }
        }
        if (mediaPage == null) {
            return;
        }
        boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
        float f = this.photoVideoChangeColumnsProgress;
        if (f != 1.0f) {
            if (f == 0.0f) {
                this.photoVideoChangeColumnsAnimation = false;
                if (this.changeColumnsTab == 0) {
                    this.sharedMediaData[0].setListFrozen(false);
                }
                mediaPage.animationSupportingListView.setVisibility(8);
                mediaPage.listView.invalidate();
                return;
            }
            final boolean z = f > 0.2f;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SharedMediaLayout.this.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mediaPage.listView.invalidate();
                }
            });
            final int i3 = zIsAnyStoryPageType ? 1 : 0;
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    View viewFindViewByPosition;
                    RecyclerView.Adapter adapter2;
                    SharedMediaLayout.this.photoVideoChangeColumnsAnimation = false;
                    if (z) {
                        SharedMediaLayout.this.mediaColumnsCount[i3] = SharedMediaLayout.this.animateToColumnsCount;
                        if (i3 == 0) {
                            SharedConfig.setMediaColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                        } else if (SharedMediaLayout.this.getStoriesCount(mediaPage.selectedType) >= 5) {
                            SharedConfig.setStoriesColumnsCount(SharedMediaLayout.this.animateToColumnsCount);
                        }
                    }
                    for (int i4 = 0; i4 < SharedMediaLayout.this.mediaPages.length; i4++) {
                        if (SharedMediaLayout.this.mediaPages[i4] != null && SharedMediaLayout.this.mediaPages[i4].listView != null) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            if (sharedMediaLayout.isTabZoomable(sharedMediaLayout.mediaPages[i4].selectedType) && (adapter2 = SharedMediaLayout.this.mediaPages[i4].listView.getAdapter()) != null) {
                                int itemCount = adapter2.getItemCount();
                                if (i4 == 0) {
                                    SharedMediaLayout.this.sharedMediaData[0].setListFrozen(false);
                                }
                                if (z) {
                                    SharedMediaLayout.this.mediaPages[i4].layoutManager.setSpanCount(SharedMediaLayout.this.mediaColumnsCount[i3]);
                                    SharedMediaLayout.this.mediaPages[i4].listView.invalidateItemDecorations();
                                    if (adapter2.getItemCount() == itemCount) {
                                        AndroidUtilities.updateVisibleRows(SharedMediaLayout.this.mediaPages[i4].listView);
                                    } else {
                                        adapter2.notifyDataSetChanged();
                                    }
                                }
                                SharedMediaLayout.this.mediaPages[i4].animationSupportingListView.setVisibility(8);
                            }
                        }
                    }
                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                    if (sharedMediaLayout2.pinchCenterPosition >= 0) {
                        for (int i5 = 0; i5 < SharedMediaLayout.this.mediaPages.length; i5++) {
                            if (SharedMediaLayout.this.mediaPages[i5].selectedType == SharedMediaLayout.this.changeColumnsTab) {
                                if (z && (viewFindViewByPosition = SharedMediaLayout.this.mediaPages[i5].animationSupportingLayoutManager.findViewByPosition(SharedMediaLayout.this.pinchCenterPosition)) != null) {
                                    SharedMediaLayout.this.pinchCenterOffset = viewFindViewByPosition.getTop();
                                }
                                ExtendedGridLayoutManager extendedGridLayoutManager = SharedMediaLayout.this.mediaPages[i5].layoutManager;
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                extendedGridLayoutManager.scrollToPositionWithOffset(sharedMediaLayout3.pinchCenterPosition, (-sharedMediaLayout3.mediaPages[i5].listView.getPaddingTop()) + SharedMediaLayout.this.pinchCenterOffset);
                            }
                        }
                    } else {
                        sharedMediaLayout2.saveScrollPosition();
                    }
                    super.onAnimationEnd(animator);
                }
            });
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setDuration(200L);
            valueAnimatorOfFloat.start();
            return;
        }
        this.photoVideoChangeColumnsAnimation = false;
        int[] iArr = this.mediaColumnsCount;
        int i4 = this.animateToColumnsCount;
        iArr[zIsAnyStoryPageType ? 1 : 0] = i4;
        if (!zIsAnyStoryPageType) {
            SharedConfig.setMediaColumnsCount(i4);
        } else if (getStoriesCount(mediaPage.selectedType) >= 5) {
            SharedConfig.setStoriesColumnsCount(this.animateToColumnsCount);
        }
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            if (i5 >= mediaPageArr2.length) {
                break;
            }
            MediaPage mediaPage2 = mediaPageArr2[i5];
            if (mediaPage2 != null && mediaPage2.listView != null && isTabZoomable(this.mediaPages[i5].selectedType) && (adapter = this.mediaPages[i5].listView.getAdapter()) != null) {
                int itemCount = adapter.getItemCount();
                if (i5 == 0) {
                    this.sharedMediaData[0].setListFrozen(false);
                }
                this.mediaPages[i5].animationSupportingListView.setVisibility(8);
                this.mediaPages[i5].layoutManager.setSpanCount(this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0]);
                this.mediaPages[i5].listView.invalidateItemDecorations();
                this.mediaPages[i5].listView.invalidate();
                if (adapter.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(this.mediaPages[i5].listView);
                } else {
                    adapter.notifyDataSetChanged();
                }
            }
            i5++;
        }
        if (this.pinchCenterPosition < 0) {
            saveScrollPosition();
            return;
        }
        while (true) {
            MediaPage[] mediaPageArr3 = this.mediaPages;
            if (i >= mediaPageArr3.length) {
                return;
            }
            MediaPage mediaPage3 = mediaPageArr3[i];
            if (mediaPage3.selectedType == this.changeColumnsTab) {
                View viewFindViewByPosition = mediaPage3.animationSupportingLayoutManager.findViewByPosition(this.pinchCenterPosition);
                if (viewFindViewByPosition != null) {
                    this.pinchCenterOffset = viewFindViewByPosition.getTop();
                }
                this.mediaPages[i].layoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, (-this.mediaPages[i].listView.getPaddingTop()) + this.pinchCenterOffset);
            }
            i++;
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

    public MediaPage getMediaPage(int i) {
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return null;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && mediaPage.selectedType == i) {
                return mediaPage;
            }
            i2++;
        }
    }

    public static int getMessageId(View view) {
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

    private int getNextPageId(boolean z) {
        int nextAlbumId;
        int closestTab = getClosestTab();
        int nextPageId = this.scrollSlidingTextTabStrip.getNextPageId(z);
        if (this.storiesContainer != null) {
            if (isStoryAlbumPageType(closestTab) || closestTab == 8) {
                nextAlbumId = this.storiesContainer.getNextAlbumId(z);
            } else {
                nextAlbumId = (isStoryAlbumPageType(nextPageId) || nextPageId == 8) ? this.storiesContainer.getCurrentAlbumId() : -1;
            }
            if (nextAlbumId == 0) {
                return 8;
            }
            if (nextAlbumId > 0) {
                return storyAlbums_getByAlbumId(nextAlbumId).tabType;
            }
        }
        return nextPageId;
    }

    public int getPagePaddingBottom(boolean z) {
        return this.pagesPaddingBottom + (z ? AndroidUtilities.dp(52.0f) : 0);
    }

    public int getPagePaddingTop(int i) {
        return AndroidUtilities.dp(54.0f) + this.topLayoutPadding + ((int) ((this.storiesContainer == null || !(isStoryAlbumPageType(i) || i == 8)) ? 0.0f : this.storiesContainer.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getStoriesController();
    }

    public static int getStoryAlbumType(int i) {
        return (i & 65535) | 65536;
    }

    public static TLRPC.ProfileTab getTab(int i, boolean z) {
        if (i != 8 && i != 14 && !z) {
            return null;
        }
        if (i == 8) {
            return new TLRPC.TL_profileTabPosts();
        }
        if (i == 14) {
            return new TLRPC.TL_profileTabGifts();
        }
        if (i == 0) {
            return new TLRPC.TL_profileTabMedia();
        }
        if (i == 1) {
            return new TLRPC.TL_profileTabFiles();
        }
        if (i == 2) {
            return new TLRPC.TL_profileTabVoice();
        }
        if (i == 3) {
            return new TLRPC.TL_profileTabLinks();
        }
        if (i == 4) {
            return new TLRPC.TL_profileTabMusic();
        }
        if (i != 5) {
            return null;
        }
        return new TLRPC.TL_profileTabGifs();
    }

    public static int getTabId(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        return profileTab instanceof TLRPC.TL_profileTabGifs ? 5 : -1;
    }

    public static String getTabName(int i) {
        if (i == 8) {
            return LocaleController.getString(R.string.ProfileStories);
        }
        if (i == 14) {
            return LocaleController.getString(R.string.ProfileGifts);
        }
        if (i == 0) {
            return LocaleController.getString(R.string.SharedMediaTabFull2);
        }
        if (i == 1) {
            return LocaleController.getString(R.string.SharedFilesTab2);
        }
        if (i == 2) {
            return LocaleController.getString(R.string.SharedVoiceTab2);
        }
        if (i == 3) {
            return LocaleController.getString(R.string.SharedLinksTab2);
        }
        if (i == 4) {
            return LocaleController.getString(R.string.SharedMusicTab2);
        }
        if (i != 5) {
            return null;
        }
        return LocaleController.getString(R.string.SharedGIFsTab2);
    }

    public int getThemedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    private boolean hasNoforwardsMessage() {
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < this.selectedFiles[i].size(); i2++) {
                arrayList.add(Integer.valueOf(this.selectedFiles[i].keyAt(i2)));
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = this.selectedFiles[i].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return z;
            }
        }
        return z;
    }

    public void hideFloatingDateView(boolean z) {
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        if (this.floatingDateView.getTag() == null) {
            return;
        }
        this.floatingDateView.setTag(null);
        AnimatorSet animatorSet = this.floatingDateAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.floatingDateAnimation = null;
        }
        if (!z) {
            this.floatingDateView.setAlpha(0.0f);
            return;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.floatingDateAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(this.floatingDateView, (Property<ChatActionCell, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingDateView, (Property<ChatActionCell, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.additionalFloatingTranslation));
        this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.floatingDateAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SharedMediaLayout.this.floatingDateAnimation = null;
            }
        });
        this.floatingDateAnimation.start();
    }

    public static boolean isAnyStoryPageType(int i) {
        return i == 8 || i == 9 || isStoryAlbumPageType(i);
    }

    public static boolean isStoryAlbumPageType(int i) {
        return (i & (-65536)) == 65536;
    }

    private boolean isTab(int i, int i2, boolean z) {
        return (z && i2 == 8 && isStoryAlbumPageType(i)) || i == i2;
    }

    public void jumpToDate(int i, int i2, int i3, boolean z) {
        this.sharedMediaData[i].messages.clear();
        this.sharedMediaData[i].messagesDict[0].clear();
        this.sharedMediaData[i].messagesDict[1].clear();
        this.sharedMediaData[i].setMaxId(0, i2);
        this.sharedMediaData[i].setEndReached(0, false);
        SharedMediaData sharedMediaData = this.sharedMediaData[i];
        sharedMediaData.startReached = false;
        sharedMediaData.startOffset = i3;
        SharedMediaData sharedMediaData2 = this.sharedMediaData[i];
        sharedMediaData2.endLoadingStubs = (sharedMediaData2.getTotalCount() - i3) - 1;
        if (this.sharedMediaData[i].endLoadingStubs < 0) {
            this.sharedMediaData[i].endLoadingStubs = 0;
        }
        SharedMediaData sharedMediaData3 = this.sharedMediaData[i];
        sharedMediaData3.min_id = i2;
        sharedMediaData3.loadingAfterFastScroll = true;
        sharedMediaData3.loading = false;
        sharedMediaData3.requestIndex++;
        MediaPage mediaPage = getMediaPage(i);
        if (mediaPage != null && mediaPage.listView.getAdapter() != null) {
            mediaPage.listView.getAdapter().notifyDataSetChanged();
        }
        if (!z) {
            return;
        }
        int i4 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i4 >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage2 = mediaPageArr[i4];
            if (mediaPage2.selectedType == i) {
                mediaPage2.layoutManager.scrollToPositionWithOffset(Math.min(this.sharedMediaData[i].getTotalCount() - 1, this.sharedMediaData[i].startOffset), 0);
            }
            i4++;
        }
    }

    public void lambda$addStoryAlbumShareItemOptions$76(String str, BaseFragment baseFragment) {
        AnonymousClass50 anonymousClass50 = new AnonymousClass50(getContext(), null, str, false, str, false, this.resourcesProvider, baseFragment);
        if (baseFragment != null) {
            baseFragment.showDialog(anonymousClass50);
        } else {
            anonymousClass50.show();
        }
    }

    public void lambda$addZoomInZoomOutItemOptions$77(View[] viewArr) {
        zoomIn(viewArr[0], viewArr[1]);
    }

    public void lambda$addZoomInZoomOutItemOptions$78(View[] viewArr) {
        zoomOut(viewArr[0], viewArr[1]);
    }

    public void lambda$buildItemOptionsForStoryAlbumActionBar$73(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        openAddStoriesToAlbumSheet(baseFragment, j, i);
        itemOptions.dismiss();
    }

    public void lambda$buildItemOptionsForStoryAlbumActionBar$74(int i, ItemOptions itemOptions) {
        lambda$onItemLongClick$58(i);
        itemOptions.dismiss();
    }

    public void lambda$buildItemOptionsForStoryAlbumActionBar$75(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        openDeleteStoriesAlbumAlert(baseFragment, j, i);
        itemOptions.dismiss();
    }

    public static void lambda$changeMediaFilterType$34(MediaPage mediaPage, ValueAnimator valueAnimator) {
        mediaPage.listView.invalidate();
    }

    public void lambda$checkLoadMoreScroll$35(int i, RecyclerListView recyclerListView) {
        findPeriodAndJumpToDate(i, recyclerListView, false);
        this.jumpToRunnable = null;
    }

    public void lambda$getThemeDescriptions$68(int i) {
        if (this.mediaPages[i].listView != null) {
            int childCount = this.mediaPages[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedPhotoVideoCell) {
                    SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) childAt;
                    for (int i3 = 0; i3 < 6; i3++) {
                        sharedPhotoVideoCell.photoVideoViews[i3].checkBox.invalidate();
                    }
                    sharedPhotoVideoCell.getClass();
                } else if (childAt instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) childAt).update(0);
                } else if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
    }

    public static int lambda$loadFastScrollData$36(Period period, Period period2) {
        return period2.date - period.date;
    }

    public void lambda$loadFastScrollData$37(TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject) {
        if (tL_error != null) {
            return;
        }
        SharedMediaData sharedMediaData = this.sharedMediaData[i2];
        if (i != sharedMediaData.requestIndex) {
            return;
        }
        TLRPC.TL_messages_searchResultsPositions tL_messages_searchResultsPositions = (TLRPC.TL_messages_searchResultsPositions) tLObject;
        sharedMediaData.fastScrollPeriods.clear();
        int size = tL_messages_searchResultsPositions.positions.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            TLRPC.TL_searchResultPosition tL_searchResultPosition = tL_messages_searchResultsPositions.positions.get(i4);
            if (tL_searchResultPosition.date != 0) {
                this.sharedMediaData[i2].fastScrollPeriods.add(new Period(tL_searchResultPosition));
            }
        }
        Collections.sort(this.sharedMediaData[i2].fastScrollPeriods, new SeekBar$$ExternalSyntheticLambda0(12));
        this.sharedMediaData[i2].setTotalCount(0, tL_messages_searchResultsPositions.count);
        SharedMediaData sharedMediaData2 = this.sharedMediaData[i2];
        sharedMediaData2.fastScrollDataLoaded = true;
        if (!sharedMediaData2.fastScrollPeriods.isEmpty()) {
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i3 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage = mediaPageArr[i3];
                if (mediaPage.selectedType == i2) {
                    mediaPage.fastScrollEnabled = true;
                    updateFastScrollVisibility(mediaPage, true);
                }
                i3++;
            }
        }
        this.photoVideoAdapter.notifyDataSetChanged();
    }

    public void lambda$loadFastScrollData$38(TLRPC.TL_error tL_error, int i, int i2, TLObject tLObject) {
        NotificationCenter.getInstance(this.profileActivity.getCurrentAccount()).doOnIdle(new SharedMediaLayout$$ExternalSyntheticLambda42(this, tL_error, i, i2, tLObject, 1));
    }

    public void lambda$loadFastScrollData$39(int i, int i2, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda42(this, tL_error, i, i2, tLObject, 0));
    }

    public void lambda$new$1() {
        hideFloatingDateView(true);
    }

    public static void lambda$new$10(boolean[] zArr, View view) {
        boolean z = !zArr[0];
        zArr[0] = z;
        ((CheckBoxCell) view).setChecked(z, true);
    }

    public static void lambda$new$12(BaseFragment baseFragment) {
        baseFragment.presentFragment(new ThemeActivity(0).highlightSensitiveRow());
    }

    public static void lambda$new$13(MessagesController messagesController, Utilities.Callback callback, Boolean bool) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (!bool.booleanValue()) {
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText)).show();
            }
        } else {
            messagesController.setContentSettings(true);
            if (safeLastFragment != null) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletinDetail(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new EmojiView$23$$ExternalSyntheticLambda2(safeLastFragment, 2)), true)).show(true);
            }
            callback.run(Boolean.TRUE);
        }
    }

    public static void lambda$new$14(final SharedPhotoVideoCell2 sharedPhotoVideoCell2, final float f, final float f2, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings, Context context, int i, MessagesController messagesController, AlertDialog alertDialog, int i2) {
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                sharedPhotoVideoCell2.startRevealMedia(f, f2);
            }
        };
        if (!zArr[0]) {
            callback.run(Boolean.FALSE);
            return;
        }
        if (!z && (contentsettings == null || !contentsettings.sensitive_can_change)) {
            callback.run(Boolean.TRUE);
        } else {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            ThemeActivity.verifyAge(context, i, new ScrimOptions$$ExternalSyntheticLambda8(12, messagesController, callback), safeLastFragment == null ? null : safeLastFragment.getResourceProvider());
        }
    }

    public void lambda$new$15(AlertDialog alertDialog, final MessagesController messagesController, final Context context, final SharedPhotoVideoCell2 sharedPhotoVideoCell2, final float f, final float f2, final int i, final TL_account.contentSettings contentsettings) {
        alertDialog.dismissUnless(200L);
        boolean z = messagesController.config.needAgeVideoVerification.get() && !TextUtils.isEmpty(messagesController.verifyAgeBotUsername);
        boolean z2 = (contentsettings == null || !contentsettings.sensitive_can_change) && z;
        final boolean[] zArr = new boolean[1];
        FrameLayout frameLayout = new FrameLayout(context);
        if (z) {
            zArr[0] = true;
        } else if (contentsettings != null && contentsettings.sensitive_can_change) {
            BaseFragment baseFragment = this.profileActivity;
            CheckBoxCell checkBoxCell = new CheckBoxCell(context, 1, 17, false, baseFragment == null ? null : baseFragment.getResourceProvider());
            checkBoxCell.setBackground(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.getString(R.string.MessageShowSensitiveContentAlways), "", zArr[0], false, false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new AlertsCreator$$ExternalSyntheticLambda21(zArr, 7));
        }
        BaseFragment baseFragment2 = this.profileActivity;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(context, 0, baseFragment2 == null ? null : baseFragment2.getResourceProvider()).setTitle(LocaleController.getString(R.string.MessageShowSensitiveContentMediaTitle)).setMessage(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosed : R.string.MessageShowSensitiveContentMediaText)).setView(frameLayout).setCustomViewOffset(9).setNegativeButton(LocaleController.getString(z2 ? R.string.MessageShowSensitiveContentMediaTextClosedButton : R.string.Cancel), null);
        if (!z2) {
            final boolean z3 = z;
            negativeButton.setPositiveButton(LocaleController.getString(R.string.MessageShowSensitiveContentButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    MessagesController messagesController2 = messagesController;
                    SharedMediaLayout.lambda$new$14(sharedPhotoVideoCell2, f, f2, zArr, z3, contentsettings, context, i, messagesController2, alertDialog2, i2);
                }
            });
        }
        BaseFragment baseFragment3 = this.profileActivity;
        if (baseFragment3 == null || baseFragment3.getContext() == null) {
            negativeButton.show();
        } else {
            this.profileActivity.showDialog(negativeButton.create());
        }
    }

    public void lambda$new$16(long j, MessageObject messageObject) {
        this.profileActivity.presentFragment(ChatActivity.of(j, messageObject.getId()));
    }

    public static void lambda$new$17(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
    }

    public static void lambda$new$18(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static void lambda$new$19(AlertDialog[] alertDialogArr, int i, int i2) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new SharedMediaLayout$$ExternalSyntheticLambda35(i, i2, 0));
        alertDialogArr[0].show();
    }

    public void lambda$new$20(Theme.ResourcesProvider resourcesProvider, int i, MessageObject messageObject) {
        int i2 = 0;
        AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, resourcesProvider)};
        int iSendVote = SendMessagesHelper.getInstance(i).sendVote(messageObject, null, new SharedMediaLayout$$ExternalSyntheticLambda1(alertDialogArr, 2));
        if (iSendVote != 0) {
            AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda8(alertDialogArr, i, iSendVote, i2), 500L);
        }
    }

    public static void lambda$new$21(AlertDialog[] alertDialogArr) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
    }

    public void lambda$new$22(int i, TLRPC.TL_error tL_error, TLRPC.TL_messages_editMessage tL_messages_editMessage) {
        AlertsCreator.processError(i, tL_error, this.profileActivity, tL_messages_editMessage, new Object[0]);
    }

    public void lambda$new$23(AlertDialog[] alertDialogArr, int i, TLRPC.TL_messages_editMessage tL_messages_editMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda1(alertDialogArr, 0));
        if (tL_error == null) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        } else {
            AndroidUtilities.runOnUIThread(new ShareTopView$$ExternalSyntheticLambda3(this, i, tL_error, tL_messages_editMessage, 11));
        }
    }

    public static void lambda$new$24(int i, int i2, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(i2, true);
    }

    public static void lambda$new$25(AlertDialog[] alertDialogArr, int i, int i2) {
        AlertDialog alertDialog = alertDialogArr[0];
        if (alertDialog == null) {
            return;
        }
        alertDialog.setOnCancelListener(new SharedMediaLayout$$ExternalSyntheticLambda35(i, i2, 1));
        alertDialogArr[0].show();
    }

    public void lambda$new$26(Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i, AlertDialog alertDialog, int i2) {
        AlertDialog[] alertDialogArr = {new AlertDialog(getContext(), 3, resourcesProvider)};
        TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
        TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageObject.messageOwner.media;
        TLRPC.TL_inputMediaPoll tL_inputMediaPoll = new TLRPC.TL_inputMediaPoll();
        TLRPC.TL_poll tL_poll = new TLRPC.TL_poll();
        tL_inputMediaPoll.poll = tL_poll;
        TLRPC.Poll poll = tL_messageMediaPoll.poll;
        tL_poll.id = poll.id;
        tL_poll.question = poll.question;
        tL_poll.answers = poll.answers;
        tL_poll.closed = true;
        tL_messages_editMessage.media = tL_inputMediaPoll;
        tL_messages_editMessage.peer = MessagesController.getInstance(i).getInputPeer(this.dialog_id);
        tL_messages_editMessage.id = messageObject.getId();
        tL_messages_editMessage.flags |= 16384;
        AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda8(alertDialogArr, i, ConnectionsManager.getInstance(i).sendRequest(tL_messages_editMessage, new AlertsCreator$$ExternalSyntheticLambda55(this, alertDialogArr, i, tL_messages_editMessage, 2)), 1), 500L);
    }

    public void lambda$new$27(Theme.ResourcesProvider resourcesProvider, MessageObject messageObject, int i) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, resourcesProvider);
        builder.setDimEnabled(false);
        if (messageObject.isQuiz()) {
            builder.setTitle(LocaleController.getString(R.string.StopQuizAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.StopQuizAlertText));
        } else {
            builder.setTitle(LocaleController.getString(R.string.StopPollAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.StopPollAlertText));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Stop), new SearchTagsList$$ExternalSyntheticLambda12(this, resourcesProvider, messageObject, i));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.show();
    }

    public void lambda$new$28(MediaPage mediaPage, final Context context, long j, Theme.ResourcesProvider resourcesProvider, View view, int i, final float f, final float f2) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        long peerId;
        int i2 = mediaPage.selectedType;
        if (i2 == 7) {
            if (view instanceof UserCell) {
                int iIntValue = !this.chatUsersAdapter.sortedUsers.isEmpty() ? ((Integer) this.chatUsersAdapter.sortedUsers.get(i)).intValue() : i;
                TLRPC.ChatParticipant chatParticipant = this.chatUsersAdapter.chatInfo.participants.participants.get(iIntValue);
                if (iIntValue < 0 || iIntValue >= this.chatUsersAdapter.chatInfo.participants.participants.size()) {
                    return;
                }
                onMemberClick(chatParticipant, false, view);
                return;
            }
            RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
            GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
            if (adapter == groupUsersSearchAdapter) {
                TLObject item = groupUsersSearchAdapter.getItem(i);
                if (item instanceof TLRPC.ChannelParticipant) {
                    peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                } else if (!(item instanceof TLRPC.ChatParticipant)) {
                    return;
                } else {
                    peerId = ((TLRPC.ChatParticipant) item).user_id;
                }
                if (peerId == 0 || peerId == this.profileActivity.getUserConfig().getClientUserId()) {
                    return;
                }
                this.profileActivity.presentFragment(new ProfileActivity(FBool.m(peerId, "user_id")));
                return;
            }
            return;
        }
        if (i2 == 6 && (view instanceof ProfileSearchCell)) {
            TLRPC.Chat chat = ((ProfileSearchCell) view).getChat();
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (this.profileActivity.getMessagesController().checkCanOpenChat(bundle, this.profileActivity)) {
                if (!chat.forum) {
                    this.profileActivity.presentFragment(new ChatActivity(bundle));
                    return;
                } else {
                    BaseFragment baseFragment = this.profileActivity;
                    baseFragment.presentFragment(TopicsFragment.getTopicsOrChat(baseFragment, bundle));
                    return;
                }
            }
            return;
        }
        if (i2 == 1 && (view instanceof SharedDocumentCell)) {
            onItemClick(i, view, ((SharedDocumentCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 3 && (view instanceof SharedLinkCell)) {
            onItemClick(i, view, ((SharedLinkCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if ((i2 == 2 || i2 == 4) && (view instanceof SharedAudioCell)) {
            onItemClick(i, view, ((SharedAudioCell) view).getMessage(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 5 && (view instanceof ContextLinkCell)) {
            onItemClick(i, view, (MessageObject) ((ContextLinkCell) view).getParentObject(), 0, mediaPage.selectedType);
            return;
        }
        if (i2 == 0 && (view instanceof SharedPhotoVideoCell2)) {
            final SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
            MessageObject messageObject = sharedPhotoVideoCell2.getMessageObject();
            if (messageObject == null || !messageObject.isSensitive()) {
                if (sharedPhotoVideoCell2.canRevealSpoiler()) {
                    sharedPhotoVideoCell2.startRevealMedia(f, f2);
                    return;
                } else {
                    if (messageObject != null) {
                        onItemClick(i, view, messageObject, 0, mediaPage.selectedType);
                        return;
                    }
                    return;
                }
            }
            BaseFragment baseFragment2 = this.profileActivity;
            if (baseFragment2 == null) {
                return;
            }
            final int currentAccount = baseFragment2.getCurrentAccount();
            final MessagesController messagesController = MessagesController.getInstance(currentAccount);
            final AlertDialog alertDialog = new AlertDialog(context, 3, null);
            AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
            AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 200L);
            messagesController.getContentSettings(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    SharedMediaLayout sharedMediaLayout = this.f$0;
                    AlertDialog alertDialog2 = alertDialog;
                    float f3 = f;
                    float f4 = f2;
                    sharedMediaLayout.lambda$new$15(alertDialog2, messagesController, context, sharedPhotoVideoCell2, f3, f4, currentAccount, (TL_account.contentSettings) obj);
                }
            });
            return;
        }
        if (isAnyStoryPageType(i2) && (view instanceof SharedPhotoVideoCell2)) {
            MessageObject messageObject2 = ((SharedPhotoVideoCell2) view).getMessageObject();
            if (messageObject2 != null) {
                onItemClick(i, view, messageObject2, 0, mediaPage.selectedType);
                return;
            }
            return;
        }
        int i3 = mediaPage.selectedType;
        if (i3 == 10) {
            if (((view instanceof ProfileSearchCell) || f2 < AndroidUtilities.dp(60.0f)) && i >= 0 && i < this.channelRecommendationsAdapter.chats.size()) {
                Bundle bundle2 = new Bundle();
                TLObject tLObject = (TLObject) this.channelRecommendationsAdapter.chats.get(i);
                if (tLObject instanceof TLRPC.Chat) {
                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                } else if (!(tLObject instanceof TLRPC.User)) {
                    return;
                } else {
                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                }
                this.profileActivity.presentFragment(new ChatActivity(bundle2));
                return;
            }
            return;
        }
        if (i3 != 11) {
            if (i3 == 15 && (view instanceof ChatMessageCell)) {
                ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                MessageObject messageObject3 = chatMessageCell.getMessageObject();
                mediaPage.listView.stopScroll();
                int currentAccount2 = this.profileActivity.getCurrentAccount();
                TLRPC.Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(j));
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(mediaPage, resourcesProvider, chatMessageCell);
                itemOptionsMakeOptions.offsetByContainer();
                itemOptionsMakeOptions.setGravity(messageObject3.isOutOwner() ? 5 : 3);
                itemOptionsMakeOptions.add(R.drawable.msg_message, LocaleController.getString(R.string.AccDescrGoToMessage), new BulletinFactory$$ExternalSyntheticLambda5(this, j, messageObject3, 5));
                if (!messageObject3.isPollClosed()) {
                    if (messageObject3.canUnvote()) {
                        itemOptionsMakeOptions.add(R.drawable.msg_unvote, LocaleController.getString(R.string.Unvote), new SharedMediaLayout$$ExternalSyntheticLambda40(this, resourcesProvider, currentAccount2, messageObject3));
                    }
                    if (!messageObject3.isForwarded() && ((messageObject3.isOut() && (!ChatObject.isChannel(chat2) || chat2.megagroup)) || (ChatObject.isChannel(chat2) && !chat2.megagroup && (chat2.creator || ((tL_chatAdminRights = chat2.admin_rights) != null && tL_chatAdminRights.edit_messages))))) {
                        itemOptionsMakeOptions.add(R.drawable.msg_pollstop, LocaleController.getString(messageObject3.isQuiz() ? R.string.StopQuiz : R.string.StopPoll), new SharedMediaLayout$$ExternalSyntheticLambda40(this, resourcesProvider, messageObject3, currentAccount2));
                    }
                }
                itemOptionsMakeOptions.show();
                return;
            }
            return;
        }
        RecyclerView.Adapter adapter2 = mediaPage.listView.getAdapter();
        SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
        if (adapter2 != savedMessagesSearchAdapter) {
            if (this.isActionModeShowed) {
                if (this.savedDialogsAdapter.itemTouchHelper.isIdle()) {
                    this.savedDialogsAdapter.select(view);
                    return;
                }
                return;
            }
            Bundle bundle3 = new Bundle();
            if (i < 0 || i >= this.savedDialogsAdapter.dialogs.size()) {
                return;
            }
            SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) this.savedDialogsAdapter.dialogs.get(i);
            bundle3.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
            bundle3.putInt("chatMode", 3);
            ChatActivity chatActivity = new ChatActivity(bundle3);
            chatActivity.setSavedDialog(savedDialog.dialogId);
            this.profileActivity.presentFragment(chatActivity);
            return;
        }
        if (i < 0) {
            return;
        }
        if (i < savedMessagesSearchAdapter.dialogs.size()) {
            SavedMessagesController.SavedDialog savedDialog2 = this.savedMessagesSearchAdapter.dialogs.get(i);
            Bundle bundle4 = new Bundle();
            bundle4.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
            bundle4.putInt("chatMode", 3);
            ChatActivity chatActivity2 = new ChatActivity(bundle4);
            chatActivity2.setSavedDialog(savedDialog2.dialogId);
            this.profileActivity.presentFragment(chatActivity2);
            return;
        }
        final int size = i - this.savedMessagesSearchAdapter.dialogs.size();
        if (size < this.savedMessagesSearchAdapter.messages.size()) {
            MessageObject messageObject4 = this.savedMessagesSearchAdapter.messages.get(size);
            Bundle bundle5 = new Bundle();
            bundle5.putLong("user_id", this.profileActivity.getUserConfig().getClientUserId());
            bundle5.putInt("message_id", messageObject4.getId());
            ChatActivity chatActivity3 = new ChatActivity(bundle5) {
                boolean firstCreateView = true;

                @Override
                public void onTransitionAnimationStart(boolean z, boolean z2) {
                    if (this.firstCreateView) {
                        if (this.searchItem != null) {
                            lambda$openSearchWithText$367("");
                            this.searchItem.setSearchFieldText(SharedMediaLayout.this.savedMessagesSearchAdapter.lastQuery, false);
                        }
                        SearchTagsList searchTagsList = this.actionBarSearchTags;
                        if (searchTagsList != null) {
                            searchTagsList.setChosen(SharedMediaLayout.this.savedMessagesSearchAdapter.lastReaction, false);
                        }
                        SharedMediaLayout.this.profileActivity.getMediaDataController().portSavedSearchResults(getClassGuid(), SharedMediaLayout.this.savedMessagesSearchAdapter.lastReaction, SharedMediaLayout.this.savedMessagesSearchAdapter.lastQuery, SharedMediaLayout.this.savedMessagesSearchAdapter.cachedMessages, SharedMediaLayout.this.savedMessagesSearchAdapter.loadedMessages, size, SharedMediaLayout.this.savedMessagesSearchAdapter.count, SharedMediaLayout.this.savedMessagesSearchAdapter.endReached);
                        this.firstCreateView = false;
                    }
                    super.onTransitionAnimationStart(z, z2);
                }
            };
            chatActivity3.setHighlightMessageId(messageObject4.getId());
            this.profileActivity.presentFragment(chatActivity3);
        }
    }

    public static boolean lambda$new$29(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$new$3(View view) {
        closeActionMode();
    }

    public static void lambda$new$30(MediaPage mediaPage, int i) {
        mediaPage.listView.scrollBy(0, i);
    }

    public void lambda$new$31() {
        this.topLayoutPadding = (int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f));
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.setPaddingTop(AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f))));
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr != null) {
            for (MediaPage mediaPage : mediaPageArr) {
                if (mediaPage != null) {
                    int paddingTop = mediaPage.listView.getPaddingTop();
                    InternalListView internalListView = mediaPage.listView;
                    int paddingLeft = mediaPage.listView.getPaddingLeft();
                    int pagePaddingTop = getPagePaddingTop(mediaPage.selectedType);
                    int paddingRight = mediaPage.listView.getPaddingRight();
                    InternalListView internalListView2 = mediaPage.listView;
                    int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                    internalListView2.hintPaddingBottom = pagePaddingBottom;
                    internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    AndroidUtilities.doOnLayout(mediaPage.listView, new EmojiView$$ExternalSyntheticLambda9(mediaPage, paddingTop - mediaPage.listView.getPaddingTop(), 14));
                }
            }
        }
    }

    public void lambda$new$32(boolean z, boolean z2) {
        if (!z) {
            requestLayout();
        }
        setVisibleHeight(this.lastVisibleHeight);
    }

    public void lambda$new$33(Canvas canvas, RectF rectF) {
        IBlur3Capture iBlur3Capture;
        for (MediaPage mediaPage : this.mediaPages) {
            if (mediaPage.iBlur3Capture != null) {
                mediaPage.iBlur3Capture.capture(canvas, rectF);
            }
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer == null || (iBlur3Capture = profileGiftsContainer.iBlur3Capture) == null) {
            return;
        }
        iBlur3Capture.capture(canvas, rectF);
    }

    public void lambda$new$4(View view) {
        onActionBarItemClick(view, 102);
    }

    public void lambda$new$5(View view) {
        onActionBarItemClick(view, 100);
    }

    public void lambda$new$6(View view) {
        onActionBarItemClick(view, 103);
    }

    public void lambda$new$7(View view) {
        onActionBarItemClick(view, 104);
    }

    public void lambda$new$8(View view) {
        onActionBarItemClick(view, 101);
    }

    public void lambda$new$9(View view) {
        if (this.saveItem.getAlpha() < 0.1f) {
            return;
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
            this.giftsContainer.resetReordering();
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || !profileStoriesCollectionTabs.isReordering()) {
            return;
        }
        saveAndStopAlbumsReorder();
    }

    public void lambda$onActionBarItemClick$41(StoriesController.BotPreviewsList botPreviewsList, ArrayList arrayList, AlertDialog alertDialog, int i) {
        botPreviewsList.delete(arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("BotPreviewsDeleted", arrayList.size(), new Object[0])).show();
        closeActionMode(false);
    }

    public void lambda$onActionBarItemClick$43(ArrayList arrayList, AlertDialog alertDialog, int i) {
        this.profileActivity.getMessagesController().getStoriesController().deleteStories(this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("StoriesDeleted", arrayList.size(), new Object[0])).show();
        closeActionMode(false);
    }

    public void lambda$onActionBarItemClick$45(ArrayList arrayList, AlertDialog alertDialog, int i) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            this.profileActivity.getMessagesController().deleteSavedDialog(((Long) arrayList.get(i2)).longValue());
        }
        closeActionMode();
    }

    public void lambda$onActionBarItemClick$46() {
        showActionMode(false);
        this.actionBar.closeSearchField();
        this.cantDeleteMessagesCount = 0;
    }

    public boolean lambda$onActionBarItemClick$47(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        long j;
        ArrayList<MessageObject> arrayList2 = new ArrayList<>();
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (i3 < 0) {
                break;
            }
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < this.selectedFiles[i3].size(); i5++) {
                arrayList3.add(Integer.valueOf(this.selectedFiles[i3].keyAt(i5)));
            }
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            while (i4 < size) {
                Object obj = arrayList3.get(i4);
                i4++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0) {
                    arrayList2.add(this.selectedFiles[i3].get(num.intValue()));
                }
            }
            this.selectedFiles[i3].clear();
            i3--;
        }
        this.cantDeleteMessagesCount = 0;
        showActionMode(false);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        if (arrayList.size() > 1 || ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId == this.profileActivity.getUserConfig().getClientUserId() || charSequence != null) {
            updateRowsSelection(true);
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                long j2 = ((MessagesStorage.TopicKey) arrayList.get(i6)).dialogId;
                if (charSequence != null) {
                    j = j2;
                    this.profileActivity.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequence.toString(), j, null, null, null, true, null, null, null, true, 0, 0, null, false));
                } else {
                    j = j2;
                }
                this.profileActivity.getSendMessagesHelper().sendMessage(arrayList2, j, false, false, true, 0, 0L);
            }
            dialogsActivity.finishFragment();
            BaseFragment baseFragment = this.profileActivity;
            UndoView undoView = baseFragment instanceof ProfileActivity ? ((ProfileActivity) baseFragment).getUndoView() : null;
            if (undoView != null) {
                if (arrayList.size() == 1) {
                    undoView.showWithAction(((MessagesStorage.TopicKey) arrayList.get(0)).dialogId, 53, Integer.valueOf(arrayList2.size()));
                } else {
                    undoView.showWithAction(0L, 53, Integer.valueOf(arrayList2.size()), Integer.valueOf(arrayList.size()), (Runnable) null, (Runnable) null);
                }
            }
        } else {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
            Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("scrollToTopOnResume", true);
            if (DialogObject.isEncryptedDialog(j3)) {
                bundleM.putInt("enc_id", DialogObject.getEncryptedChatId(j3));
            } else {
                if (DialogObject.isUserDialog(j3)) {
                    bundleM.putLong("user_id", j3);
                } else {
                    bundleM.putLong("chat_id", -j3);
                }
                if (!this.profileActivity.getMessagesController().checkCanOpenChat(bundleM, dialogsActivity)) {
                    return true;
                }
            }
            this.profileActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            ChatActivity chatActivity = new ChatActivity(bundleM);
            ForumUtilities.applyTopic(chatActivity, (MessagesStorage.TopicKey) arrayList.get(0));
            dialogsActivity.presentFragment(chatActivity, true);
            chatActivity.showFieldPanelForForward(true, arrayList2);
        }
        return true;
    }

    public static void lambda$onItemClick$67(StoriesController.StoriesList storiesList, boolean z) {
        if (z) {
            storiesList.getClass();
            storiesList.load(30, Collections.EMPTY_LIST, false);
        }
    }

    public void lambda$onItemLongClick$52(TL_stories.StoryItem storyItem, StoriesController.StoryAlbum storyAlbum) {
        StoriesController storiesController = getStoriesController();
        long j = this.dialog_id;
        int i = storyAlbum.album_id;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.addStoriesToAlbum(i, j, arrayList);
        onStoryAlbumCreate(storyAlbum);
    }

    public void lambda$onItemLongClick$53(TL_stories.StoryItem storyItem, String str) {
        StoriesController storiesController = getStoriesController();
        long j = this.dialog_id;
        storiesController.getStoryAlbumsList(j, true).createCollection(str, new ScrimOptions$$ExternalSyntheticLambda8(13, this, storyItem));
    }

    public void lambda$onItemLongClick$54(TL_stories.StoryItem storyItem, ItemOptions itemOptions) {
        AlertsCreator.createStoriesAlbumEnterNameForCreate(getContext(), null, this.resourcesProvider, new SharedMediaLayout$$ExternalSyntheticLambda4(this, storyItem));
        itemOptions.dismiss();
    }

    public void lambda$onItemLongClick$55(HashSet hashSet, TL_stories.StoryItem storyItem, ItemOptions itemOptions, StoriesController.StoryAlbum storyAlbum) {
        String string;
        if (hashSet.contains(Integer.valueOf(storyAlbum.album_id))) {
            StoriesController storiesController = getStoriesController();
            long j = this.dialog_id;
            int i = storyAlbum.album_id;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.addStoriesToAlbum(i, j, arrayList);
            string = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
        } else {
            StoriesController storiesController2 = getStoriesController();
            long j2 = this.dialog_id;
            int i2 = storyAlbum.album_id;
            storiesController2.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(storyItem);
            storiesController2.removeStoriesFromAlbum(i2, j2, arrayList2);
            string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
        }
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(string)).show();
        itemOptions.dismiss();
    }

    public void lambda$onItemLongClick$57(MessageObject messageObject, View view, int i) {
        onItemLongClick(messageObject, view, i, false);
    }

    public void lambda$onItemLongClick$59(int i, TL_stories.StoryItem storyItem) {
        StoriesController storiesController = getStoriesController();
        long j = this.dialog_id;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.addStoriesToAlbum(i, j, arrayList);
    }

    public void lambda$onItemLongClick$60(int i, TL_stories.StoryItem storyItem, String str) {
        SlotsDrawable$$ExternalSyntheticLambda9 slotsDrawable$$ExternalSyntheticLambda9 = new SlotsDrawable$$ExternalSyntheticLambda9(this, i, storyItem, 20);
        StoriesController storiesController = getStoriesController();
        long j = this.dialog_id;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.removeStoriesFromAlbum(i, j, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), LocaleController.getString(R.string.UndoNoCaps), slotsDrawable$$ExternalSyntheticLambda9).show();
    }

    public void lambda$onItemLongClick$61(TL_stories.StoryItem storyItem) {
        pinOnUnpinStories(new ArrayList<>(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
    }

    public void lambda$onItemLongClick$62(TL_stories.StoryItem storyItem) {
        pinOnUnpinStories(new ArrayList<>(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
    }

    public void lambda$onItemLongClick$63(TL_stories.StoryItem storyItem) {
        getStoriesController().updateStoriesPinned(this.dialog_id, new ArrayList(Collections.singletonList(storyItem)), false, null);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, LocaleController.formatPluralString("StoryArchived", 1, new Object[0]), 5000).show();
    }

    public void lambda$onItemLongClick$64(TL_stories.StoryItem storyItem, AlertDialog alertDialog, int i) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        this.profileActivity.getMessagesController().getStoriesController().deleteStories(this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_delete, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).show();
        closeActionMode(false);
    }

    public void lambda$onItemLongClick$66(TL_stories.StoryItem storyItem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
        builder.setTitle(LocaleController.getString(R.string.DeleteStoryTitle));
        builder.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]));
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new SharedMediaLayout$$ExternalSyntheticLambda4(this, storyItem));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda26(5));
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        alertDialogCreate.redPositive();
    }

    public void lambda$onStoryAlbumCreate$79(StoriesController.StoryAlbum storyAlbum) {
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null) {
            profileStoriesCollectionTabs.lambda$setInitialTabId$2(storyAlbum.album_id);
        }
    }

    public void lambda$openAddStoriesToAlbumSheet$72(long j, int i, ArrayList arrayList) {
        getStoriesController().addStoriesToAlbum(i, j, arrayList);
    }

    public void lambda$openDeleteStoriesAlbumAlert$71(long j, int i) {
        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, true);
        int iIndexOf = storyAlbumsList.indexOf(i);
        if (iIndexOf == -1) {
            return;
        }
        StoriesController.StoryAlbum storyAlbum = (StoriesController.StoryAlbum) storyAlbumsList.collections.remove(iIndexOf);
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        int i2 = storyAlbumsList.currentAccount;
        tL_deleteAlbum.peer = MessagesController.getInstance(i2).getInputPeer(storyAlbumsList.dialogId);
        tL_deleteAlbum.album_id = storyAlbum.album_id;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        storyAlbumsList.updateAlbumsListCache(true);
    }

    public void lambda$openRenameStoriesAlbumAlert$70(long j, int i, String str) {
        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, true);
        int iIndexOf = storyAlbumsList.indexOf(i);
        if (iIndexOf == -1) {
            return;
        }
        ((StoriesController.StoryAlbum) storyAlbumsList.collections.get(iIndexOf)).title = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        int i2 = storyAlbumsList.currentAccount;
        tL_updateAlbum.peer = MessagesController.getInstance(i2).getInputPeer(storyAlbumsList.dialogId);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        storyAlbumsList.updateAlbumsListCache(true);
    }

    public static void lambda$showFastScrollHint$40(MediaPage mediaPage, final SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip) {
        mediaPage.fastScrollHintView = null;
        mediaPage.fastScrollHideHintRunnable = null;
        sharedMediaFastScrollTooltip.animate().alpha(0.0f).scaleX(0.5f).scaleY(0.5f).setDuration(220L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (sharedMediaFastScrollTooltip.getParent() != null) {
                    ((ViewGroup) sharedMediaFastScrollTooltip.getParent()).removeView(sharedMediaFastScrollTooltip);
                }
            }
        }).start();
    }

    public void lambda$showPremiumFloodWaitBulletin$69(boolean z) {
        this.profileActivity.presentFragment(new PremiumPreviewFragment(z ? "upload_speed" : "download_speed"));
    }

    public static float lambda$static$2(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void lambda$stopScroll$48(ValueAnimator valueAnimator) {
        onTabProgress(getTabProgress());
    }

    public void lambda$switchToCurrentSelectedMode$50(boolean z, int i, View view) {
        if (z) {
            openAddStoriesToAlbumSheet(this.profileActivity, this.dialog_id, i);
        } else {
            this.profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
            StoryRecorder.getInstance(this.profileActivity.getParentActivity(), this.profileActivity.getCurrentAccount()).open(null);
        }
    }

    public void lambda$switchToCurrentSelectedMode$51(View view) {
        this.profileActivity.getMessagesController().getMainSettings().edit().putBoolean("story_keep", true).apply();
        StoryRecorder.getInstance(this.profileActivity.getParentActivity(), this.profileActivity.getCurrentAccount()).open(null);
    }

    public void lambda$updateSearchItemIconAnimated$0(boolean z) {
        if (z) {
            return;
        }
        this.searchItemIcon.setVisibility(8);
    }

    private static Boolean lambda$updateTabs$49(ArrayList arrayList, Integer num) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Pair) arrayList.get(i)).first == num) {
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }

    private void loadFastScrollData(boolean z) {
        if (this.topicId != 0 || isSearchingStories()) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = supportedFastScrollTypes;
            if (i >= iArr.length) {
                return;
            }
            final int i2 = iArr[i];
            if ((this.sharedMediaData[i2].fastScrollDataLoaded && !z) || DialogObject.isEncryptedDialog(this.dialog_id)) {
                return;
            }
            this.sharedMediaData[i2].fastScrollDataLoaded = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i2 == 0) {
                int i3 = this.sharedMediaData[i2].filterType;
                if (i3 == 1) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                } else if (i3 == 2) {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                } else {
                    tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                }
            } else if (i2 == 1) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i2 == 2) {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
            } else {
                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_getSearchResultsPositions.limit = 100;
            tL_messages_getSearchResultsPositions.peer = this.profileActivity.getMessagesController().getInputPeer(this.dialog_id);
            if (this.topicId != 0 && this.profileActivity.getUserConfig().getClientUserId() == this.dialog_id) {
                tL_messages_getSearchResultsPositions.flags |= 4;
                tL_messages_getSearchResultsPositions.saved_peer_id = this.profileActivity.getMessagesController().getInputPeer(this.topicId);
            }
            final int i4 = this.sharedMediaData[i2].requestIndex;
            ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(this.profileActivity.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadFastScrollData$39(i4, i2, tLObject, tL_error);
                }
            }), this.profileActivity.getClassGuid());
            i++;
        }
    }

    private void loadFromStart(int i) {
        int i2;
        if (i == 0) {
            int i3 = this.sharedMediaData[0].filterType;
            if (i3 == 1) {
                i2 = 6;
            } else {
                i2 = i3 == 2 ? 7 : 0;
            }
        } else if (i == 1) {
            i2 = 1;
        } else if (i == 2) {
            i2 = 2;
        } else if (i == 4) {
            i2 = 4;
        } else {
            i2 = i == 5 ? 5 : 3;
        }
        this.sharedMediaData[i].loading = true;
        this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, this.sharedMediaData[i].min_id, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i].requestIndex, null, null);
    }

    private void onItemClick(int i, View view, MessageObject messageObject, int i2, int i3) {
        String str;
        if (messageObject == null || this.photoVideoChangeColumnsAnimation) {
            return;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || !profileStoriesCollectionTabs.isReordering()) {
            String string = null;
            int iDp = 0;
            iDp = 0;
            if (this.isActionModeShowed) {
                int i4 = 8;
                if (i3 == 8 && !canEditStories()) {
                    return;
                }
                char c = messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1;
                if (this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0) {
                    this.selectedFiles[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount--;
                    }
                } else {
                    if (this.selectedFiles[1].size() + this.selectedFiles[0].size() >= 100) {
                        return;
                    }
                    this.selectedFiles[c].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount++;
                    }
                }
                onActionModeSelectedUpdate(this.selectedFiles[0]);
                if (this.selectedFiles[0].size() == 0 && this.selectedFiles[1].size() == 0) {
                    showActionMode(false);
                } else {
                    this.selectedMessagesCountTextView.setNumber(this.selectedFiles[1].size() + this.selectedFiles[0].size(), true);
                    this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
                    ActionBarMenuItem actionBarMenuItem = this.gotoItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || this.selectedFiles[0].size() != 1) ? 8 : 0);
                    }
                    ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
                    if (actionBarMenuItem2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i4 = 0;
                        }
                        actionBarMenuItem2.setVisibility(i4);
                    }
                    updateStoriesPinButton();
                }
                this.scrolling = false;
                if (view instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) view).photoVideoViews[i2].setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0);
                } else if (view instanceof SharedLinkCell) {
                    ((SharedLinkCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof ContextLinkCell) {
                    ((ContextLinkCell) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (view instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) view).setChecked(this.selectedFiles[c].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else if (i3 == 0) {
                int i5 = i - this.sharedMediaData[i3].startOffset;
                if (i5 >= 0 && i5 < this.sharedMediaData[i3].messages.size()) {
                    PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, i5, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                }
            } else if (i3 == 2 || i3 == 4) {
                if (view instanceof SharedAudioCell) {
                    ((SharedAudioCell) view).didPressedButton();
                }
            } else if (i3 == 5) {
                PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                int iIndexOf = this.sharedMediaData[i3].messages.indexOf(messageObject);
                if (iIndexOf < 0) {
                    PhotoViewer.getInstance().openPhoto(MediaController$$ExternalSyntheticOutline1.m(messageObject), 0, 0L, 0L, 0L, this.provider);
                } else {
                    PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, iIndexOf, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                }
            } else if (i3 == 1) {
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    TLRPC.Document document = messageObject.getDocument();
                    if (sharedDocumentCell.loaded) {
                        if (messageObject.canPreviewDocument()) {
                            PhotoViewer.getInstance().setParentActivity(this.profileActivity);
                            int iIndexOf2 = this.sharedMediaData[i3].messages.indexOf(messageObject);
                            if (iIndexOf2 < 0) {
                                PhotoViewer.getInstance().openPhoto(MediaController$$ExternalSyntheticOutline1.m(messageObject), 0, 0L, 0L, 0L, this.provider);
                                return;
                            } else {
                                PhotoViewer.getInstance().openPhoto(this.sharedMediaData[i3].messages, iIndexOf2, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                                return;
                            }
                        }
                        AndroidUtilities.openDocument(messageObject, this.profileActivity.getParentActivity(), this.profileActivity);
                    } else if (sharedDocumentCell.loading) {
                        this.profileActivity.getFileLoader().cancelLoadFile(document);
                        sharedDocumentCell.updateFileExistIcon(true);
                    } else {
                        MessageObject message = sharedDocumentCell.getMessage();
                        message.putInDownloadsStore = true;
                        this.profileActivity.getFileLoader().loadFile(document, message, 0, 0);
                        sharedDocumentCell.updateFileExistIcon(true);
                    }
                }
            } else if (i3 == 3) {
                try {
                    TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                    if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                        str = null;
                    } else {
                        if (webPage.cached_page != null) {
                            LaunchActivity launchActivity = LaunchActivity.instance;
                            if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                                this.profileActivity.createArticleViewer(false).open(messageObject);
                                return;
                            }
                            return;
                        }
                        String str2 = webPage.embed_url;
                        if (str2 != null && str2.length() != 0) {
                            openWebView(webPage, messageObject);
                            return;
                        }
                        str = webPage.url;
                    }
                    if (str == null) {
                        SharedLinkCell sharedLinkCell = (SharedLinkCell) view;
                        if (sharedLinkCell.links.size() > 0) {
                            string = ((CharSequence) sharedLinkCell.links.get(0)).toString();
                        }
                    } else {
                        string = str;
                    }
                    if (string != null) {
                        openUrl(string);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else if (isAnyStoryPageType(i3)) {
                StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i3);
                StoriesController.StoriesList storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null ? storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList : null;
                if (storiesList == null) {
                    return;
                }
                StoryViewer orCreateStoryViewer = this.profileActivity.getOrCreateStoryViewer();
                Context context = getContext();
                int id = messageObject.getId();
                StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(this.mediaPages[i2].listView, false);
                storiesListPlaceProvider.loadNextInterface = new ColorPicker$$ExternalSyntheticLambda5(storiesList, 16);
                BaseFragment baseFragment = this.profileActivity;
                if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).myProfile) {
                    iDp = AndroidUtilities.dp(68.0f);
                }
                storiesListPlaceProvider.addBottomClip += iDp;
                orCreateStoryViewer.open(context, id, storiesList, storiesListPlaceProvider);
            }
            updateForwardItem();
        }
    }

    public boolean onItemLongClick(MessageObject messageObject, View view, int i) {
        return onItemLongClick(messageObject, view, i, true);
    }

    public void onStoryAlbumCreate(StoriesController.StoryAlbum storyAlbum) {
        AndroidUtilities.runOnUIThread(new UndoView$$ExternalSyntheticLambda3(15, this, storyAlbum), 100L);
    }

    public void openStoryTabIdPage(int i, boolean z) {
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr[0].selectedType == i) {
            return;
        }
        MediaPage mediaPage = mediaPageArr[1];
        mediaPage.selectedType = i;
        mediaPage.setVisibility(0);
        hideFloatingDateView(true);
        switchToCurrentSelectedMode(true);
        this.animatingForward = z;
        onSelectedTabChanged();
        animateSearchToOptions(!isSearchItemVisible(i), true);
        updateOptionsSearch(true);
    }

    public void openUrl(String str) {
        if (AndroidUtilities.shouldShowUrlInAlert(str)) {
            AlertsCreator.showOpenUrlAlert(this.profileActivity, str, true, true);
        } else {
            Browser.openUrl(this.profileActivity.getParentActivity(), str);
        }
    }

    public void openWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
        EmbedBottomSheet.show(this.profileActivity, messageObject, this.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, false);
    }

    private void pinOnUnpinStories(ArrayList<Integer> arrayList, boolean z) {
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter == null || storiesAdapter.storiesList == null) {
            return;
        }
        if (z && arrayList.size() > this.profileActivity.getMessagesController().storiesPinnedToTopCountMax) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", this.profileActivity.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
            return;
        }
        StoriesController.StoriesList storiesList = this.storiesAdapter.storiesList;
        storiesList.getClass();
        ArrayList arrayList2 = storiesList.pinnedIds;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z2 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = arrayList.get(size);
            num.getClass();
            if (z && !arrayList3.contains(num)) {
                arrayList3.add(0, num);
            } else if (!z && arrayList3.contains(num)) {
                arrayList3.remove(num);
            }
        }
        int i = storiesList.currentAccount;
        boolean z3 = arrayList3.size() > MessagesController.getInstance(i).storiesPinnedToTopCountMax;
        if (!z3) {
            boolean z4 = arrayList2.size() != arrayList3.size();
            if (!z4) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (arrayList2.get(i2) != arrayList3.get(i2)) {
                        z4 = true;
                        break;
                    }
                }
            }
            if (z4) {
                arrayList2.clear();
                arrayList2.addAll(arrayList3);
                storiesList.fill(true);
                TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                tL_togglePinnedToTop.id.addAll(arrayList2);
                tL_togglePinnedToTop.peer = MessagesController.getInstance(i).getInputPeer(storiesList.dialogId);
                ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new StealthModeAlert$$ExternalSyntheticLambda3(7));
            }
            z2 = z3;
        }
        if (z2) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_infotip, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", this.profileActivity.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
        } else if (z) {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_pin, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0])).show();
        } else {
            BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.ic_unpin, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).show();
        }
    }

    private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
        MediaPage mediaPage;
        ProfileGiftsContainer profileGiftsContainer;
        BotPreviewsEditContainer botPreviewsEditContainer;
        int nextPageId = getNextPageId(z);
        if (nextPageId < 0) {
            return false;
        }
        if (this.searchItem == null || canShowSearchItem()) {
            this.searchAlpha = getSearchAlpha(0.0f);
            updateSearchItemIcon(0.0f);
        } else {
            this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
            this.searchAlpha = 0.0f;
        }
        if (this.searching && getSelectedTab() == 11) {
            return false;
        }
        if (canEditStories() && this.isActionModeShowed && (getClosestTab() == 8 || isStoryAlbumPageType(getClosestTab()))) {
            return false;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        if (mediaPage2 != null && mediaPage2.selectedType == 13 && (botPreviewsEditContainer = this.botPreviewsContainer) != null && !botPreviewsEditContainer.canScroll(z)) {
            return false;
        }
        MediaPage mediaPage3 = this.mediaPages[0];
        if (mediaPage3 != null && mediaPage3.selectedType == 14 && (profileGiftsContainer = this.giftsContainer) != null && !profileGiftsContainer.canScroll(z)) {
            return false;
        }
        if (this.isActionModeShowed && (mediaPage = this.mediaPages[0]) != null && mediaPage.selectedType == 13) {
            return false;
        }
        ProfileGiftsContainer profileGiftsContainer2 = this.giftsContainer;
        if (profileGiftsContainer2 != null && profileGiftsContainer2.isReordering()) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) {
            return false;
        }
        updateOptionsSearch();
        getParent().requestDisallowInterceptTouchEvent(true);
        hideFloatingDateView(true);
        this.maybeStartTracking = false;
        this.startedTracking = true;
        onTabScroll(true);
        this.startedTrackingX = (int) motionEvent.getX();
        this.actionBar.setEnabled(false);
        this.scrollSlidingTextTabStrip.setEnabled(false);
        MediaPage mediaPage4 = this.mediaPages[1];
        mediaPage4.selectedType = nextPageId;
        mediaPage4.setVisibility(0);
        this.animatingForward = z;
        switchToCurrentSelectedMode(true);
        if (z) {
            MediaPage[] mediaPageArr = this.mediaPages;
            mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
        } else {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            mediaPageArr2[1].setTranslationX(-mediaPageArr2[0].getMeasuredWidth());
        }
        onTabProgress(getTabProgress());
        return true;
    }

    private void recycleAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof SharedPhotoVideoAdapter) {
            this.cellCache.addAll(this.cache);
            this.cache.clear();
        } else if (adapter == this.audioAdapter) {
            this.audioCellCache.addAll(this.audioCache);
            this.audioCache.clear();
        } else {
            PollAdapter pollAdapter = this.pollAdapter;
            if (adapter == pollAdapter) {
                pollAdapter.listView = null;
            }
        }
    }

    public void saveScrollPosition() {
        int i;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return;
            }
            InternalListView internalListView = mediaPageArr[i2].listView;
            if (internalListView != null) {
                int id = 0;
                int top = 0;
                for (int i3 = 0; i3 < internalListView.getChildCount(); i3++) {
                    View childAt = internalListView.getChildAt(i3);
                    if (childAt instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                        int messageId = sharedPhotoVideoCell2.getMessageId();
                        top = sharedPhotoVideoCell2.getTop();
                        id = messageId;
                    }
                    if (childAt instanceof SharedDocumentCell) {
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                        int id2 = sharedDocumentCell.getMessage().getId();
                        top = sharedDocumentCell.getTop();
                        id = id2;
                    }
                    if (childAt instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                        id = sharedAudioCell.getMessage().getId();
                        top = sharedAudioCell.getTop();
                    }
                    if (id != 0) {
                        break;
                    }
                }
                if (id != 0) {
                    int i4 = this.mediaPages[i2].selectedType;
                    int i5 = -1;
                    if (isAnyStoryPageType(i4)) {
                        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i4);
                        if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList != null) {
                            for (int i6 = 0; i6 < storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.messageObjects.size(); i6++) {
                                if (id == ((MessageObject) storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.messageObjects.get(i6)).getId()) {
                                    i5 = i6;
                                    break;
                                }
                            }
                        }
                        i = i5;
                    } else if (i4 >= 0 && i4 < this.sharedMediaData.length) {
                        for (int i7 = 0; i7 < this.sharedMediaData[i4].messages.size(); i7++) {
                            if (id == this.sharedMediaData[i4].messages.get(i7).getId()) {
                                i5 = i7;
                                break;
                            }
                        }
                        i = this.sharedMediaData[i4].startOffset + i5;
                    }
                    if (i5 >= 0) {
                        ((LinearLayoutManager) internalListView.getLayoutManager()).scrollToPositionWithOffset(i, (-this.mediaPages[i2].listView.getPaddingTop()) + top);
                        if (this.photoVideoChangeColumnsAnimation) {
                            this.mediaPages[i2].animationSupportingLayoutManager.scrollToPositionWithOffset(i, (-this.mediaPages[i2].listView.getPaddingTop()) + top);
                        }
                    }
                }
            }
            i2++;
        }
    }

    public void scrollToTop() {
        int itemSize;
        int i = this.mediaPages[0].selectedType;
        if (i == 0) {
            itemSize = SharedPhotoVideoCell.getItemSize(1);
        } else if (i == 1 || i == 2) {
            itemSize = AndroidUtilities.dp(56.0f);
        } else if (i == 3) {
            itemSize = AndroidUtilities.dp(100.0f);
        } else if (i != 4) {
            itemSize = i != 5 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(60.0f);
        } else {
            itemSize = AndroidUtilities.dp(56.0f);
        }
        MediaPage mediaPage = this.mediaPages[0];
        if ((mediaPage.selectedType == 0 ? mediaPage.layoutManager.findFirstVisibleItemPosition() / this.mediaColumnsCount[0] : mediaPage.layoutManager.findFirstVisibleItemPosition()) * itemSize < this.mediaPages[0].listView.getMeasuredHeight() * 1.2f) {
            this.mediaPages[0].listView.smoothScrollToPosition(0);
        } else {
            this.mediaPages[0].scrollHelper.setScrollDirection(1);
            this.mediaPages[0].scrollHelper.scrollToPosition(0, 0, false, true);
        }
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
            this.pinchCenterPosition = (int) (((this.mediaColumnsCount[isAnyStoryPageType(this.mediaPages[0].selectedType) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i / this.mediaPages[0].listView.getMeasuredWidth(), 0.0f))) + this.mediaPages[0].layoutManager.findFirstVisibleItemPosition());
            this.pinchCenterOffset = 0;
        }
    }

    public void selectTabWithId(int i, float f) {
        if (this.scrollSlidingTextTabStrip != null) {
            this.scrollSlidingTextTabStrip.selectTabWithId(isStoryAlbumPageType(i) ? 8 : i, f);
        }
        if (this.storiesContainer != null) {
            if (isStoryAlbumPageType(i)) {
                this.storiesContainer.selectTabWithId(storyAlbums_getAlbumIdByTabType(i), f);
            } else if (i == 8) {
                this.storiesContainer.selectTabWithId(0, f);
            }
        }
    }

    public static void showFastScrollHint(MediaPage mediaPage, SharedMediaData[] sharedMediaDataArr, boolean z) {
        Runnable runnable;
        if (!z) {
            if (mediaPage.fastScrollHintView == null || (runnable = mediaPage.fastScrollHideHintRunnable) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(runnable);
            mediaPage.fastScrollHideHintRunnable.run();
            mediaPage.fastScrollHideHintRunnable = null;
            mediaPage.fastScrollHintView = null;
            return;
        }
        if (SharedConfig.fastScrollHintCount <= 0 || mediaPage.fastScrollHintView != null || mediaPage.fastScrollHinWasShown || mediaPage.listView.getFastScroll() == null || !mediaPage.listView.getFastScroll().isVisible || mediaPage.listView.getFastScroll().getVisibility() != 0 || sharedMediaDataArr[0].getTotalCount() < 50) {
            return;
        }
        SharedConfig.setFastScrollHintCount(SharedConfig.fastScrollHintCount - 1);
        mediaPage.fastScrollHinWasShown = true;
        SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = new SharedMediaFastScrollTooltip(mediaPage.getContext());
        mediaPage.fastScrollHintView = sharedMediaFastScrollTooltip;
        mediaPage.addView(sharedMediaFastScrollTooltip, LayoutHelper.createFrame(-2, -2.0f));
        mediaPage.fastScrollHintView.setAlpha(0.0f);
        mediaPage.fastScrollHintView.setScaleX(0.8f);
        mediaPage.fastScrollHintView.setScaleY(0.8f);
        mediaPage.fastScrollHintView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        mediaPage.invalidate();
        UndoView$$ExternalSyntheticLambda3 undoView$$ExternalSyntheticLambda3 = new UndoView$$ExternalSyntheticLambda3(14, mediaPage, sharedMediaFastScrollTooltip);
        mediaPage.fastScrollHideHintRunnable = undoView$$ExternalSyntheticLambda3;
        AndroidUtilities.runOnUIThread(undoView$$ExternalSyntheticLambda3, 4000L);
    }

    public void showFloatingDateView() {
    }

    private void startPinchToMediaColumnsCount(boolean z) {
        final MediaPage mediaPage;
        if (this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            int i3 = mediaPageArr[i2].selectedType;
            if (i3 == 0 || isAnyStoryPageType(i3)) {
                mediaPage = this.mediaPages[i2];
                break;
            }
            i2++;
        }
        if (mediaPage == null) {
            return;
        }
        int i4 = mediaPage.selectedType;
        this.changeColumnsTab = i4;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i4);
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0], z);
        this.animateToColumnsCount = nextMediaColumnsCount;
        if (nextMediaColumnsCount == this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0]) {
            return;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(this.changeColumnsTab)) {
            return;
        }
        mediaPage.animationSupportingListView.setVisibility(0);
        if (isAnyStoryPageType(this.changeColumnsTab)) {
            mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
        } else {
            mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
        }
        mediaPage.animationSupportingListView.setPadding(mediaPage.animationSupportingListView.getPaddingLeft(), getPagePaddingTop(this.changeColumnsTab), mediaPage.animationSupportingListView.getPaddingRight(), getPagePaddingBottom(isStoriesView()));
        mediaPage.animationSupportingLayoutManager.setSpanCount(nextMediaColumnsCount);
        mediaPage.animationSupportingListView.invalidateItemDecorations();
        mediaPage.animationSupportingLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i5) {
                RecyclerView.Adapter adapter = mediaPage.animationSupportingListView.getAdapter();
                if (adapter == SharedMediaLayout.this.animationSupportingPhotoVideoAdapter) {
                    if (SharedMediaLayout.this.animationSupportingPhotoVideoAdapter.getItemViewType(i5) == 2) {
                        return mediaPage.animationSupportingLayoutManager.getSpanCount();
                    }
                    return 1;
                }
                if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesSupportingAdapter(adapter) == -1 || ((StoriesAdapter) adapter).getItemViewType(i5) != 2) {
                    return 1;
                }
                return mediaPage.animationSupportingLayoutManager.getSpanCount();
            }
        });
        AndroidUtilities.updateVisibleRows(mediaPage.listView);
        this.photoVideoChangeColumnsAnimation = true;
        if (this.changeColumnsTab == 0) {
            this.sharedMediaData[0].setListFrozen(true);
        }
        this.photoVideoChangeColumnsProgress = 0.0f;
        if (this.pinchCenterPosition < 0) {
            saveScrollPosition();
            return;
        }
        while (true) {
            MediaPage[] mediaPageArr2 = this.mediaPages;
            if (i >= mediaPageArr2.length) {
                return;
            }
            MediaPage mediaPage2 = mediaPageArr2[i];
            if (mediaPage2.selectedType == this.changeColumnsTab) {
                mediaPage2.animationSupportingLayoutManager.scrollToPositionWithOffset(this.pinchCenterPosition, this.pinchCenterOffset - this.mediaPages[i].animationSupportingListView.getPaddingTop());
            }
            i++;
        }
    }

    public void startStopVisibleGifs() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
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
        }
    }

    private void stopScroll(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        float measuredWidth;
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker == null) {
            return;
        }
        velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
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
            float x = this.mediaPages[0].getX();
            this.tabsAnimation = new AnimatorSet();
            this.backAnimation = Math.abs(x) < ((float) this.mediaPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda6(this, 27));
            boolean z = this.backAnimation;
            Property property = View.TRANSLATION_X;
            if (z) {
                measuredWidth = Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet = this.tabsAnimation;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.mediaPages[0], (Property<MediaPage, Float>) property, 0.0f);
                    MediaPage mediaPage = this.mediaPages[1];
                    animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(mediaPage, (Property<MediaPage, Float>) property, mediaPage.getMeasuredWidth()), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet2 = this.tabsAnimation;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.mediaPages[0], (Property<MediaPage, Float>) property, 0.0f);
                    MediaPage mediaPage2 = this.mediaPages[1];
                    animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(mediaPage2, (Property<MediaPage, Float>) property, -mediaPage2.getMeasuredWidth()), valueAnimatorOfFloat);
                }
            } else {
                measuredWidth = this.mediaPages[0].getMeasuredWidth() - Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet3 = this.tabsAnimation;
                    MediaPage mediaPage3 = this.mediaPages[0];
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(mediaPage3, (Property<MediaPage, Float>) property, -mediaPage3.getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property, 0.0f), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet4 = this.tabsAnimation;
                    MediaPage mediaPage4 = this.mediaPages[0];
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(mediaPage4, (Property<MediaPage, Float>) property, mediaPage4.getMeasuredWidth()), ObjectAnimator.ofFloat(this.mediaPages[1], (Property<MediaPage, Float>) property, 0.0f), valueAnimatorOfFloat);
                }
            }
            this.tabsAnimation.setInterpolator(interpolator);
            int measuredWidth2 = getMeasuredWidth();
            float f = measuredWidth2 / 2;
            float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
            float fAbs = Math.abs(xVelocity);
            this.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    SharedMediaLayout.this.tabsAnimation = null;
                    if (SharedMediaLayout.this.backAnimation) {
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItem == null || SharedMediaLayout.this.canShowSearchItem()) {
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            sharedMediaLayout.searchAlpha = sharedMediaLayout.getSearchAlpha(0.0f);
                            SharedMediaLayout.this.updateSearchItemIcon(0.0f);
                        } else {
                            SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                            SharedMediaLayout.this.searchAlpha = 0.0f;
                        }
                        SharedMediaLayout.this.updateOptionsSearch();
                        SharedMediaLayout.this.searchItemState = 0;
                    } else {
                        MediaPage mediaPage5 = SharedMediaLayout.this.mediaPages[0];
                        SharedMediaLayout.this.mediaPages[0] = SharedMediaLayout.this.mediaPages[1];
                        SharedMediaLayout.this.mediaPages[1] = mediaPage5;
                        SharedMediaLayout.this.mediaPages[1].setVisibility(8);
                        if (SharedMediaLayout.this.searchItem != null && SharedMediaLayout.this.searchItemState == 2) {
                            SharedMediaLayout.this.searchItem.setVisibility(SharedMediaLayout.this.isStoriesView() ? 8 : 4);
                        }
                        SharedMediaLayout.this.searchItemState = 0;
                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                        sharedMediaLayout2.selectTabWithId(sharedMediaLayout2.mediaPages[0].selectedType, 1.0f);
                        SharedMediaLayout.this.onSelectedTabChanged();
                        SharedMediaLayout.this.startStopVisibleGifs();
                    }
                    SharedMediaLayout.this.tabsAnimationInProgress = false;
                    SharedMediaLayout.this.maybeStartTracking = false;
                    SharedMediaLayout.this.startedTracking = false;
                    SharedMediaLayout.this.onTabScroll(false);
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
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    public StoryAlbumData storyAlbums_getByAlbumId(int i) {
        StoryAlbumData storyAlbumData = this.storyAlbumsById.get(Integer.valueOf(i));
        if (storyAlbumData != null) {
            return storyAlbumData;
        }
        StoryAlbumData storyAlbumData2 = new StoryAlbumData(getContext(), i);
        this.storyAlbumsById.put(Integer.valueOf(i), storyAlbumData2);
        this.storyAlbumsByTabType.put(Integer.valueOf(storyAlbumData2.tabType), Integer.valueOf(storyAlbumData2.albumId));
        return storyAlbumData2;
    }

    public StoryAlbumData storyAlbums_getByTabType(int i) {
        Integer num = this.storyAlbumsByTabType.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return this.storyAlbumsById.get(num);
    }

    private StoriesAdapter storyAlbums_getStoriesAdapterByAlbumId(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(i);
        if (storyAlbumDataStoryAlbums_getByAlbumId != null) {
            return storyAlbumDataStoryAlbums_getByAlbumId.adapter;
        }
        return null;
    }

    public StoriesAdapter storyAlbums_getStoriesAdapterByTabType(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByTabType;
        if (i == 8) {
            return this.storiesAdapter;
        }
        if (i == 9) {
            return this.archivedStoriesAdapter;
        }
        if (!isStoryAlbumPageType(i) || (storyAlbumDataStoryAlbums_getByTabType = storyAlbums_getByTabType(i)) == null) {
            return null;
        }
        return storyAlbumDataStoryAlbums_getByTabType.adapter;
    }

    private StoriesAdapter storyAlbums_getStoriesSupportingAdapterByAlbumId(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(i);
        if (storyAlbumDataStoryAlbums_getByAlbumId != null) {
            return storyAlbumDataStoryAlbums_getByAlbumId.adapterSupport;
        }
        return null;
    }

    public StoriesAdapter storyAlbums_getStoriesSupportingAdapterByTabType(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByTabType;
        if (i == 8) {
            return this.animationSupportingStoriesAdapter;
        }
        if (i == 9) {
            return this.animationSupportingArchivedStoriesAdapter;
        }
        if (!isStoryAlbumPageType(i) || (storyAlbumDataStoryAlbums_getByTabType = storyAlbums_getByTabType(i)) == null) {
            return null;
        }
        return storyAlbumDataStoryAlbums_getByTabType.adapterSupport;
    }

    public int storyAlbums_getTabTypeByStoriesAdapter(RecyclerView.Adapter adapter) {
        if (adapter == this.storiesAdapter) {
            return 8;
        }
        if (adapter == this.archivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapter == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    private int storyAlbums_getTabTypeByStoriesList(StoriesController.StoriesList storiesList) {
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && storiesList == storiesAdapter.storiesList) {
            return 8;
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 != null && storiesList == storiesAdapter2.storiesList) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapter.storiesList == storiesList) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    public int storyAlbums_getTabTypeByStoriesSupportingAdapter(RecyclerView.Adapter adapter) {
        if (adapter == this.animationSupportingStoriesAdapter) {
            return 8;
        }
        if (adapter == this.animationSupportingArchivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            if (storyAlbumData.adapterSupport == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    public void switchToCurrentSelectedMode(boolean z) {
        MediaPage[] mediaPageArr;
        char c;
        RecyclerView.RecycledViewPool recycledViewPool;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i2;
        int i3;
        boolean z7;
        int i4;
        int i5;
        PollAdapter pollAdapter;
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.resetReordering();
        }
        int i6 = 0;
        while (true) {
            mediaPageArr = this.mediaPages;
            if (i6 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i6].listView.stopScroll();
            i6++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mediaPageArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(mediaPageTopMargin());
        RecyclerView.Adapter adapter = this.mediaPages[z ? 1 : 0].listView.getAdapter();
        if (adapter == this.storiesAdapter) {
            this.storiesReorder.attachToRecyclerView(null);
        }
        if (this.searching && this.searchWas) {
            if (this.mediaPages[z ? 1 : 0].searchViewPool == null) {
                this.mediaPages[z ? 1 : 0].searchViewPool = new RecyclerView.RecycledViewPool();
            }
            recycledViewPool = this.mediaPages[z ? 1 : 0].searchViewPool;
            if (z) {
                int i7 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i7 == 0 || i7 == 2 || i7 == 5 || i7 == 6 || (i7 == 7 && !this.delegate.canSearchMembers())) {
                    this.searching = false;
                    SearchTagsList searchTagsList = this.searchTagsList;
                    if (searchTagsList != null) {
                        searchTagsList.show(false);
                    }
                    this.searchWas = false;
                    switchToCurrentSelectedMode(true);
                    return;
                }
                ActionBarMenuItem actionBarMenuItem = this.searchItem;
                String string = actionBarMenuItem != null ? actionBarMenuItem.getSearchField().getText().toString() : "";
                int i8 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i8 == 1) {
                    MediaSearchAdapter mediaSearchAdapter = this.documentsSearchAdapter;
                    if (mediaSearchAdapter != null) {
                        mediaSearchAdapter.search(string, false);
                        if (adapter != this.documentsSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.documentsSearchAdapter);
                        }
                    }
                } else if (i8 == 3) {
                    MediaSearchAdapter mediaSearchAdapter2 = this.linksSearchAdapter;
                    if (mediaSearchAdapter2 != null) {
                        mediaSearchAdapter2.search(string, false);
                        if (adapter != this.linksSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.linksSearchAdapter);
                        }
                    }
                } else if (i8 == 4) {
                    MediaSearchAdapter mediaSearchAdapter3 = this.audioSearchAdapter;
                    if (mediaSearchAdapter3 != null) {
                        mediaSearchAdapter3.search(string, false);
                        if (adapter != this.audioSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.audioSearchAdapter);
                        }
                    }
                } else if (i8 == 7) {
                    GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
                    if (groupUsersSearchAdapter != null) {
                        groupUsersSearchAdapter.search(string, false);
                        if (adapter != this.groupUsersSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.groupUsersSearchAdapter);
                        }
                    }
                } else if (i8 == 11) {
                    SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
                    if (savedMessagesSearchAdapter != null) {
                        savedMessagesSearchAdapter.search(string, this.searchingReaction);
                        if (adapter != this.savedMessagesSearchAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.savedMessagesSearchAdapter);
                        }
                    }
                } else if (i8 == 15 && (pollAdapter = this.pollAdapter) != null && adapter != pollAdapter) {
                    recycleAdapter(adapter);
                    this.pollAdapter.listView = this.mediaPages[z ? 1 : 0].listView;
                    this.mediaPages[z ? 1 : 0].listView.setAdapter(this.pollAdapter);
                }
            } else if (this.mediaPages[z ? 1 : 0].listView != null) {
                int i9 = this.mediaPages[z ? 1 : 0].selectedType;
                if (i9 == 1) {
                    if (adapter != this.documentsSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.documentsSearchAdapter);
                    }
                    this.documentsSearchAdapter.notifyDataSetChanged();
                } else if (i9 == 3) {
                    if (adapter != this.linksSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.linksSearchAdapter);
                    }
                    this.linksSearchAdapter.notifyDataSetChanged();
                } else if (i9 == 4) {
                    if (adapter != this.audioSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.audioSearchAdapter);
                    }
                    this.audioSearchAdapter.notifyDataSetChanged();
                } else if (i9 == 7) {
                    if (adapter != this.groupUsersSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.groupUsersSearchAdapter);
                    }
                    this.groupUsersSearchAdapter.notifyDataSetChanged();
                } else if (i9 == 11) {
                    if (adapter != this.savedMessagesSearchAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.savedMessagesSearchAdapter);
                    }
                    this.savedMessagesSearchAdapter.notifyDataSetChanged();
                }
            }
            i = 100;
            z3 = false;
            z7 = false;
        } else {
            if (this.mediaPages[z ? 1 : 0].viewPool == null) {
                c = 0;
                this.mediaPages[z ? 1 : 0].viewPool = new RecyclerView.RecycledViewPool();
            } else {
                c = 0;
            }
            RecyclerView.RecycledViewPool recycledViewPool2 = this.mediaPages[z ? 1 : 0].viewPool;
            this.mediaPages[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(null);
            int i10 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i10 == 8 || isStoryAlbumPageType(i10)) {
                layoutParams.topMargin = AndroidUtilities.dp(mediaPageTopMargin());
            }
            InternalListView internalListView = this.mediaPages[z ? 1 : 0].listView;
            int paddingLeft = this.mediaPages[z ? 1 : 0].listView.getPaddingLeft();
            InternalListView internalListView2 = this.mediaPages[z ? 1 : 0].listView;
            int pagePaddingTop = getPagePaddingTop(this.mediaPages[z ? 1 : 0].selectedType);
            internalListView2.hintPaddingTop = pagePaddingTop;
            int paddingRight = this.mediaPages[z ? 1 : 0].listView.getPaddingRight();
            InternalListView internalListView3 = this.mediaPages[z ? 1 : 0].listView;
            int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
            internalListView3.hintPaddingBottom = pagePaddingBottom;
            internalListView.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
            int i11 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i11 == 0) {
                if (adapter != this.photoVideoAdapter) {
                    recycleAdapter(adapter);
                    this.mediaPages[z ? 1 : 0].listView.setAdapter(this.photoVideoAdapter);
                }
                int i12 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i12;
                layoutParams.leftMargin = i12;
                SharedMediaData sharedMediaData = this.sharedMediaData[c];
                boolean z8 = sharedMediaData.fastScrollDataLoaded && !sharedMediaData.fastScrollPeriods.isEmpty();
                int i13 = this.mediaColumnsCount[c];
                this.mediaPages[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(this.pinnedHeaderShadowDrawable);
                SharedMediaData sharedMediaData2 = this.sharedMediaData[c];
                if (sharedMediaData2.recycledViewPool == null) {
                    sharedMediaData2.recycledViewPool = new RecyclerView.RecycledViewPool();
                }
                z3 = z8;
                i = i13;
                recycledViewPool = this.sharedMediaData[c].recycledViewPool;
                z2 = false;
            } else {
                if (i11 == 1) {
                    SharedMediaData sharedMediaData3 = this.sharedMediaData[1];
                    z5 = sharedMediaData3.fastScrollDataLoaded && !sharedMediaData3.fastScrollPeriods.isEmpty();
                    if (adapter != this.documentsAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.documentsAdapter);
                    }
                } else if (i11 == 2) {
                    SharedMediaData sharedMediaData4 = this.sharedMediaData[2];
                    z5 = sharedMediaData4.fastScrollDataLoaded && !sharedMediaData4.fastScrollPeriods.isEmpty();
                    if (adapter != this.voiceAdapter) {
                        recycleAdapter(adapter);
                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.voiceAdapter);
                    }
                } else {
                    if (i11 == 3) {
                        if (adapter != this.linksAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.linksAdapter);
                        }
                    } else if (i11 == 4) {
                        SharedMediaData sharedMediaData5 = this.sharedMediaData[4];
                        z5 = sharedMediaData5.fastScrollDataLoaded && !sharedMediaData5.fastScrollPeriods.isEmpty();
                        if (adapter != this.audioAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.audioAdapter);
                        }
                    } else {
                        if (i11 == 5) {
                            if (adapter != this.gifAdapter) {
                                recycleAdapter(adapter);
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.gifAdapter);
                            }
                        } else if (i11 == 15) {
                            if (adapter != this.pollAdapter) {
                                recycleAdapter(adapter);
                                this.pollAdapter.listView = this.mediaPages[z ? 1 : 0].listView;
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.pollAdapter);
                            }
                        } else if (i11 == 6) {
                            if (adapter != this.commonGroupsAdapter) {
                                recycleAdapter(adapter);
                                this.mediaPages[z ? 1 : 0].listView.setAdapter(this.commonGroupsAdapter);
                            }
                        } else if (i11 != 7) {
                            if (isAnyStoryPageType(i11)) {
                                StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                                if (adapter != storiesAdapterStoryAlbums_getStoriesAdapterByTabType) {
                                    recycleAdapter(adapter);
                                    this.mediaPages[z ? 1 : 0].listView.setAdapter(storiesAdapterStoryAlbums_getStoriesAdapterByTabType);
                                    this.mediaPages[z ? 1 : 0].listView.updateEmptyViewAnimated();
                                }
                                MediaPage mediaPage = this.mediaPages[z ? 1 : 0];
                                if (mediaPage.selectedType != 9) {
                                    this.storiesReorder.attachToRecyclerView(mediaPage.listView);
                                }
                                recycledViewPool = recycledViewPool2;
                                i = this.mediaColumnsCount[1];
                                z2 = false;
                            } else {
                                int i14 = this.mediaPages[z ? 1 : 0].selectedType;
                                if (i14 == 10) {
                                    if (adapter != this.channelRecommendationsAdapter) {
                                        recycleAdapter(adapter);
                                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.channelRecommendationsAdapter);
                                    }
                                } else if (i14 == 11) {
                                    if (adapter != this.savedDialogsAdapter) {
                                        recycleAdapter(adapter);
                                        this.mediaPages[z ? 1 : 0].listView.setAdapter(this.savedDialogsAdapter);
                                        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
                                        ItemTouchHelper itemTouchHelper = savedDialogsAdapter.itemTouchHelper;
                                        InternalListView internalListView4 = this.mediaPages[z ? 1 : 0].listView;
                                        savedDialogsAdapter.attachedToRecyclerView = internalListView4;
                                        itemTouchHelper.attachToRecyclerView(internalListView4);
                                    }
                                    recycledViewPool = this.savedDialogsAdapter.viewPool;
                                    i = 100;
                                    z2 = true;
                                } else if (i14 == 12) {
                                    if (adapter != null) {
                                        recycleAdapter(adapter);
                                        this.mediaPages[z ? 1 : 0].listView.setAdapter(null);
                                    }
                                    if (this.savedMessagesContainer.getParent() != this.mediaPages[z ? 1 : 0]) {
                                        AndroidUtilities.removeFromParent(this.savedMessagesContainer);
                                        this.mediaPages[z ? 1 : 0].addView(this.savedMessagesContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    }
                                } else if (i14 == 13) {
                                    if (adapter != null) {
                                        recycleAdapter(adapter);
                                        this.mediaPages[z ? 1 : 0].listView.setAdapter(null);
                                    }
                                    BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
                                    if (botPreviewsEditContainer != null && botPreviewsEditContainer.getParent() != this.mediaPages[z ? 1 : 0]) {
                                        AndroidUtilities.removeFromParent(this.botPreviewsContainer);
                                        this.mediaPages[z ? 1 : 0].addView(this.botPreviewsContainer);
                                    }
                                } else if (i14 == 14) {
                                    if (adapter != null) {
                                        recycleAdapter(adapter);
                                        this.mediaPages[z ? 1 : 0].listView.setAdapter(null);
                                    }
                                    ProfileGiftsContainer profileGiftsContainer2 = this.giftsContainer;
                                    if (profileGiftsContainer2 != null && profileGiftsContainer2.getParent() != this.mediaPages[z ? 1 : 0]) {
                                        AndroidUtilities.removeFromParent(this.giftsContainer);
                                        this.mediaPages[z ? 1 : 0].addView(this.giftsContainer);
                                        this.mediaPages[z ? 1 : 0].emptyView.setVisibility(4);
                                    }
                                }
                            }
                            z3 = false;
                        } else if (adapter != this.chatUsersAdapter) {
                            recycleAdapter(adapter);
                            this.mediaPages[z ? 1 : 0].listView.setAdapter(this.chatUsersAdapter);
                        }
                        z4 = false;
                        z6 = false;
                        z3 = z6;
                        z2 = z4;
                        recycledViewPool = recycledViewPool2;
                        i = 100;
                    }
                    z4 = true;
                    z6 = false;
                    z3 = z6;
                    z2 = z4;
                    recycledViewPool = recycledViewPool2;
                    i = 100;
                }
                z6 = z5;
                z4 = true;
                z3 = z6;
                z2 = z4;
                recycledViewPool = recycledViewPool2;
                i = 100;
            }
            int i15 = this.mediaPages[z ? 1 : 0].selectedType;
            boolean z9 = i15 == 0 || isAnyStoryPageType(i15);
            this.mediaPages[z ? 1 : 0].progressView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 119, z9 ? 0.0f : 12.0f, (z9 ? 8 : 12) + 48, z9 ? 0.0f : 12.0f, z9 ? 0.0f : 12.0f));
            if (z2) {
                this.mediaPages[z ? 1 : 0].listView.setSections(false);
            } else {
                this.mediaPages[z ? 1 : 0].listView.disableSections();
            }
            MediaPage mediaPage2 = this.mediaPages[z ? 1 : 0];
            if (mediaPage2.selectedType == 15) {
                mediaPage2.setBackground(PreviewView.getBackgroundDrawable(mediaPage2.getBackground(), this.profileActivity.getCurrentAccount(), this.dialog_id, Theme.currentTheme.isDark()));
                this.mediaPages[z ? 1 : 0].setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, AndroidUtilities.dp(50.0f), view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
                    }
                });
                this.mediaPages[z ? 1 : 0].setClipToOutline(true);
            } else {
                mediaPage2.setClipToOutline(false);
                this.mediaPages[z ? 1 : 0].setBackground(null);
            }
            MediaPage mediaPage3 = this.mediaPages[z ? 1 : 0];
            if (mediaPage3.selectedType == 11) {
                mediaPage3.listView.lambda$onCellEnter$52(this.mediaPages[z ? 1 : 0].itemAnimator);
            } else {
                mediaPage3.listView.lambda$onCellEnter$52(null);
                if (this.savedDialogsAdapter != null) {
                    InternalListView internalListView5 = this.mediaPages[z ? 1 : 0].listView;
                    SavedDialogsAdapter savedDialogsAdapter2 = this.savedDialogsAdapter;
                    if (internalListView5 == savedDialogsAdapter2.attachedToRecyclerView) {
                        ItemTouchHelper itemTouchHelper2 = savedDialogsAdapter2.itemTouchHelper;
                        savedDialogsAdapter2.attachedToRecyclerView = null;
                        itemTouchHelper2.attachToRecyclerView(null);
                    }
                }
            }
            ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
            if (chatActivityContainer != null && this.mediaPages[z ? 1 : 0].selectedType != 12 && chatActivityContainer.getParent() == this.mediaPages[z ? 1 : 0]) {
                this.savedMessagesContainer.chatActivity.onRemoveFromParent();
                this.mediaPages[z ? 1 : 0].removeView(this.savedMessagesContainer);
            }
            BotPreviewsEditContainer botPreviewsEditContainer2 = this.botPreviewsContainer;
            if (botPreviewsEditContainer2 != null && this.mediaPages[z ? 1 : 0].selectedType != 13) {
                ViewParent parent = botPreviewsEditContainer2.getParent();
                MediaPage mediaPage4 = this.mediaPages[z ? 1 : 0];
                if (parent == mediaPage4) {
                    mediaPage4.removeView(this.botPreviewsContainer);
                }
            }
            ProfileGiftsContainer profileGiftsContainer3 = this.giftsContainer;
            if (profileGiftsContainer3 != null && this.mediaPages[z ? 1 : 0].selectedType != 14) {
                ViewParent parent2 = profileGiftsContainer3.getParent();
                MediaPage mediaPage5 = this.mediaPages[z ? 1 : 0];
                if (parent2 == mediaPage5) {
                    mediaPage5.removeView(this.giftsContainer);
                }
            }
            int i16 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i16 != 0 && i16 != 11 && !isAnyStoryPageType(i16) && (i4 = this.mediaPages[z ? 1 : 0].selectedType) != 2 && i4 != 5 && i4 != 6 && ((i4 != 7 || this.delegate.canSearchMembers()) && (i5 = this.mediaPages[z ? 1 : 0].selectedType) != 10 && i5 != 13 && i5 != 14)) {
                if (z) {
                    ActionBarMenuItem actionBarMenuItem2 = this.searchItem;
                    if (actionBarMenuItem2 == null || actionBarMenuItem2.getVisibility() != 4 || this.actionBar.isSearchFieldVisible()) {
                        this.searchItemState = 0;
                        this.searchAlpha = 1.0f;
                    } else {
                        if (canShowSearchItem()) {
                            this.searchItemState = 1;
                            this.searchItem.setVisibility(0);
                        } else {
                            this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                        }
                        float f = z ? 1.0f : 0.0f;
                        this.searchAlpha = getSearchAlpha(f);
                        updateSearchItemIcon(1.0f - f);
                    }
                } else {
                    ActionBarMenuItem actionBarMenuItem3 = this.searchItem;
                    if (actionBarMenuItem3 != null) {
                        if (actionBarMenuItem3.getVisibility() == 4) {
                            if (canShowSearchItem()) {
                                this.searchItemState = 0;
                                this.searchAlpha = 1.0f;
                                this.searchItem.setVisibility(0);
                            } else {
                                this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                                this.searchAlpha = 0.0f;
                            }
                        }
                    }
                    updateOptionsSearch();
                }
                updateOptionsSearch();
            } else if (z) {
                this.searchItemState = 2;
            } else {
                this.searchItemState = 0;
                ActionBarMenuItem actionBarMenuItem4 = this.searchItem;
                if (actionBarMenuItem4 != null) {
                    actionBarMenuItem4.setVisibility((isStoriesView() || this.searching) ? 8 : 4);
                }
            }
            int i17 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i17 == 6) {
                if (!this.commonGroupsAdapter.loading && !this.commonGroupsAdapter.endReached && this.commonGroupsAdapter.chats.isEmpty()) {
                    this.commonGroupsAdapter.getChats(0L, 100);
                }
            } else if (i17 != 7) {
                if (isAnyStoryPageType(i17)) {
                    StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType2 = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                    if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType2 != null) {
                        StoriesController.StoriesList storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType2.storiesList;
                        storiesAdapterStoryAlbums_getStoriesAdapterByTabType2.load(false);
                        this.mediaPages[z ? 1 : 0].emptyView.showProgress(storiesList != null && (storiesList.isLoading() || (hasInternet() && storiesList.getCount() > 0)), z);
                        z3 = (storiesList == null || storiesList.getCount() <= 0 || isSearchingStories()) ? false : true;
                    }
                } else {
                    int i18 = this.mediaPages[z ? 1 : 0].selectedType;
                    if (i18 != 10 && i18 != 11 && i18 != 12 && i18 != 13 && i18 != 14) {
                        if (i18 == 15) {
                            i18 = 8;
                        }
                        SharedMediaData sharedMediaData6 = this.sharedMediaData[i18];
                        if (!sharedMediaData6.loading && !sharedMediaData6.endReached[0] && sharedMediaData6.messages.isEmpty()) {
                            this.sharedMediaData[i18].loading = true;
                            this.documentsAdapter.notifyDataSetChanged();
                            if (i18 != 0) {
                                i2 = i18;
                            } else {
                                int i19 = this.sharedMediaData[0].filterType;
                                if (i19 == 1) {
                                    i2 = 6;
                                } else if (i19 == 2) {
                                    i2 = 7;
                                } else {
                                    i2 = i18;
                                }
                            }
                            this.profileActivity.getMediaDataController().loadMedia(this.dialog_id, 50, 0, 0, i2, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i2].requestIndex, null, null);
                        }
                    }
                }
            }
            int i20 = this.mediaPages[z ? 1 : 0].selectedType;
            if (i20 == 8 || isStoryAlbumPageType(i20)) {
                StickerEmptyView stickerEmptyView = this.mediaPages[z ? 1 : 0].emptyView;
                final boolean zIsStoryAlbumPageType = isStoryAlbumPageType(this.mediaPages[z ? 1 : 0].selectedType);
                final int iStoryAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(this.mediaPages[z ? 1 : 0].selectedType);
                stickerEmptyView.stickerView.setVisibility((zIsStoryAlbumPageType || isSelf() || isBot()) ? 8 : 0);
                if (zIsStoryAlbumPageType) {
                    stickerEmptyView.button.setVisibility(0);
                    stickerEmptyView.button.setText(LocaleController.getString(R.string.StoriesAlbumAddToAlbum), false);
                } else if (isSelf()) {
                    stickerEmptyView.button.setVisibility(8);
                } else {
                    stickerEmptyView.setStickerType(11);
                    stickerEmptyView.button.setVisibility(!isSearchingStories() ? 0 : 8);
                    stickerEmptyView.button.setText(addPostText(), false);
                }
                if (zIsStoryAlbumPageType) {
                    stickerEmptyView.title.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    stickerEmptyView.subtitle.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    SpoilersTextView spoilersTextView = stickerEmptyView.title;
                    if (isSearchingStories()) {
                        i3 = R.string.NoHashtagStoriesTitle;
                    } else {
                        i3 = isStoriesView() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle;
                    }
                    spoilersTextView.setText(LocaleController.getString(i3));
                    stickerEmptyView.subtitle.setText(isStoriesView() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : "");
                }
                stickerEmptyView.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$switchToCurrentSelectedMode$50(zIsStoryAlbumPageType, iStoryAlbums_getAlbumIdByTabType, view);
                    }
                });
            } else {
                MediaPage mediaPage6 = this.mediaPages[z ? 1 : 0];
                if (mediaPage6.selectedType == 9) {
                    if (isSelf()) {
                        this.mediaPages[z ? 1 : 0].emptyView.stickerView.setVisibility(8);
                        this.mediaPages[z ? 1 : 0].emptyView.button.setVisibility(8);
                    } else {
                        this.mediaPages[z ? 1 : 0].emptyView.stickerView.setVisibility(0);
                        this.mediaPages[z ? 1 : 0].emptyView.setStickerType(11);
                        this.mediaPages[z ? 1 : 0].emptyView.button.setVisibility(0);
                        this.mediaPages[z ? 1 : 0].emptyView.button.setText(addPostText(), false);
                    }
                    this.mediaPages[z ? 1 : 0].emptyView.title.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    this.mediaPages[z ? 1 : 0].emptyView.subtitle.setText(isStoriesView() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : "");
                    this.mediaPages[z ? 1 : 0].emptyView.button.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(this, 0));
                } else {
                    mediaPage6.emptyView.stickerView.setVisibility(0);
                    this.mediaPages[z ? 1 : 0].emptyView.setStickerType(1);
                    this.mediaPages[z ? 1 : 0].emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                    this.mediaPages[z ? 1 : 0].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    this.mediaPages[z ? 1 : 0].emptyView.button.setVisibility(8);
                }
            }
            z7 = false;
            this.mediaPages[z ? 1 : 0].listView.setVisibility(0);
        }
        MediaPage mediaPage7 = this.mediaPages[z ? 1 : 0];
        mediaPage7.fastScrollEnabled = z3;
        updateFastScrollVisibility(mediaPage7, z7);
        this.mediaPages[z ? 1 : 0].layoutManager.setSpanCount(i);
        this.mediaPages[z ? 1 : 0].listView.invalidateItemDecorations();
        if (recycledViewPool != null) {
            this.mediaPages[z ? 1 : 0].listView.setRecycledViewPool(recycledViewPool);
            this.mediaPages[z ? 1 : 0].animationSupportingListView.setRecycledViewPool(recycledViewPool);
        }
        if (this.searchItemState == 2 && this.actionBar.isSearchFieldVisible()) {
            this.ignoreSearchCollapse = true;
            this.actionBar.closeSearchField();
            this.searchItemState = 0;
            this.searchAlpha = 0.0f;
            ActionBarMenuItem actionBarMenuItem5 = this.searchItem;
            if (actionBarMenuItem5 != null) {
                actionBarMenuItem5.setVisibility(isStoriesView() ? 8 : 4);
            }
            updateOptionsSearch();
        }
    }

    private void updateForwardItem() {
        if (this.forwardItem == null) {
            return;
        }
        boolean z = this.profileActivity.getMessagesController().isPeerNoForwards(this.dialog_id) || hasNoforwardsMessage();
        this.forwardItem.setAlpha(z ? 0.5f : 1.0f);
        if (z && this.forwardItem.getBackground() != null) {
            this.forwardItem.setBackground(null);
        } else {
            if (z || this.forwardItem.getBackground() != null) {
                return;
            }
            this.forwardItem.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), 5, -1));
        }
    }

    public void updateOptionsSearch() {
        updateOptionsSearch(false);
    }

    private void updateRowsSelection(boolean z) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.mediaPages[i].listView.getChildAt(i2);
                if (childAt instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedLinkCell) {
                    ((SharedLinkCell) childAt).setChecked(false, z);
                } else if (childAt instanceof SharedAudioCell) {
                    ((SharedAudioCell) childAt).setChecked(false, z);
                } else if (childAt instanceof ContextLinkCell) {
                    ((ContextLinkCell) childAt).setChecked(false, z);
                } else if (childAt instanceof DialogCell) {
                    ((DialogCell) childAt).setChecked(false, z);
                }
            }
            i++;
        }
    }

    private void updateStoriesPinButton() {
        boolean z;
        StoriesController.StoriesList storiesList;
        if (isBot()) {
            ActionBarMenuItem actionBarMenuItem = this.pinItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem2 = this.unpinItem;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            ActionBarMenuItem actionBarMenuItem3 = this.pinItem;
            if (actionBarMenuItem3 != null) {
                actionBarMenuItem3.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem4 = this.unpinItem;
            if (actionBarMenuItem4 != null) {
                actionBarMenuItem4.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (isStoryAlbumPageType(getClosestTab())) {
                ActionBarMenuItem actionBarMenuItem5 = this.pinItem;
                if (actionBarMenuItem5 != null) {
                    actionBarMenuItem5.setVisibility(8);
                }
                ActionBarMenuItem actionBarMenuItem6 = this.unpinItem;
                if (actionBarMenuItem6 != null) {
                    actionBarMenuItem6.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            if (i >= this.selectedFiles[0].size()) {
                z = false;
                break;
            }
            MessageObject messageObjectValueAt = this.selectedFiles[0].valueAt(i);
            StoriesAdapter storiesAdapter = this.storiesAdapter;
            if (storiesAdapter != null && (storiesList = storiesAdapter.storiesList) != null && !storiesList.isPinned(messageObjectValueAt.getId())) {
                z = true;
                break;
            }
            i++;
        }
        ActionBarMenuItem actionBarMenuItem7 = this.pinItem;
        if (actionBarMenuItem7 != null) {
            actionBarMenuItem7.setVisibility(z ? 0 : 8);
        }
        ActionBarMenuItem actionBarMenuItem8 = this.unpinItem;
        if (actionBarMenuItem8 != null) {
            actionBarMenuItem8.setVisibility(z ? 8 : 0);
        }
    }

    public boolean addActionButtons() {
        return true;
    }

    public void animateSearchToOptions(boolean z, boolean z2) {
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null || this.animatingToOptions == z) {
            return;
        }
        this.animatingToOptions = z;
        if (z || rLottieImageView.getAnimatedDrawable().getCurrentFrame() >= 20) {
            this.optionsSearchImageView.getAnimatedDrawable().setCustomEndFrame(this.animatingToOptions ? 50 : 100);
        } else {
            this.optionsSearchImageView.getAnimatedDrawable().setCustomEndFrame(0);
        }
        if (z2) {
            this.optionsSearchImageView.getAnimatedDrawable().start();
        } else {
            this.optionsSearchImageView.getAnimatedDrawable().setCurrentFrame(this.optionsSearchImageView.getAnimatedDrawable().getCustomEndFrame());
        }
    }

    @Override
    public boolean canClickButtonInside() {
        return false;
    }

    public boolean canEditStories() {
        BaseFragment baseFragment;
        if (!isBot()) {
            return isStoriesView() || ((baseFragment = this.profileActivity) != null && baseFragment.getMessagesController().getStoriesController().canEditStories(this.dialog_id));
        }
        TLRPC.User user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(this.dialog_id));
        return user != null && user.bot && user.bot_can_edit;
    }

    public boolean canShowSearchItem() {
        return true;
    }

    public boolean canZoomIn() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr != null && (mediaPage = mediaPageArr[0]) != null) {
            boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
            int i = this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
            if (i != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean canZoomOut() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr != null && (mediaPage = mediaPageArr[0]) != null && (!this.allowStoriesSingleColumn || !isAnyStoryPageType(mediaPage.selectedType))) {
            boolean zIsAnyStoryPageType = isAnyStoryPageType(this.mediaPages[0].selectedType);
            int i = this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
            if (i != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPinchToZoom(MotionEvent motionEvent) {
        BotPreviewsEditContainer botPreviewsEditContainer;
        int i = this.mediaPages[0].selectedType;
        if (i == 13 && (botPreviewsEditContainer = this.botPreviewsContainer) != null) {
            return botPreviewsEditContainer.checkPinchToZoom(motionEvent);
        }
        if ((i != 0 && !isAnyStoryPageType(i)) || getParent() == null) {
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
                this.pinchCenterX = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - getX()) - this.mediaPages[0].getX());
                int y = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - getY()) - this.mediaPages[0].getY());
                this.pinchCenterY = y;
                selectPinchPosition(this.pinchCenterX, y);
                this.maybePinchToZoomTouchMode2 = true;
            }
            if (motionEvent.getActionMasked() == 0) {
                if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - this.mediaPages[0].getY() > 0.0f) {
                    this.maybePinchToZoomTouchMode = true;
                }
            }
        } else if (motionEvent.getActionMasked() == 2 && (this.isInPinchToZoomTouchMode || this.maybePinchToZoomTouchMode2)) {
            int i2 = -1;
            int i3 = -1;
            for (int i4 = 0; i4 < motionEvent.getPointerCount(); i4++) {
                if (this.pointerId1 == motionEvent.getPointerId(i4)) {
                    i2 = i4;
                }
                if (this.pointerId2 == motionEvent.getPointerId(i4)) {
                    i3 = i4;
                }
            }
            if (i2 == -1 || i3 == -1) {
                this.maybePinchToZoomTouchMode = false;
                this.maybePinchToZoomTouchMode2 = false;
                this.isInPinchToZoomTouchMode = false;
                finishPinchToMediaColumnsCount();
                return false;
            }
            float fHypot = ((float) Math.hypot(motionEvent.getX(i3) - motionEvent.getX(i2), motionEvent.getY(i3) - motionEvent.getY(i2))) / this.pinchStartDistance;
            this.pinchScale = fHypot;
            if (!this.isInPinchToZoomTouchMode && (fHypot > 1.01f || fHypot < 0.99f)) {
                this.isInPinchToZoomTouchMode = true;
                boolean z = fHypot > 1.0f;
                this.pinchScaleUp = z;
                startPinchToMediaColumnsCount(z);
            }
            if (this.isInPinchToZoomTouchMode) {
                boolean z2 = this.pinchScaleUp;
                if ((!z2 || this.pinchScale >= 1.0f) && (z2 || this.pinchScale <= 1.0f)) {
                    this.photoVideoChangeColumnsProgress = Math.max(0.0f, Math.min(1.0f, z2 ? ImageReceiver$$ExternalSyntheticOutline1.m(2.0f, this.pinchScale, 1.0f, 1.0f) : (1.0f - this.pinchScale) / 0.5f));
                } else {
                    this.photoVideoChangeColumnsProgress = 0.0f;
                }
                float f = this.photoVideoChangeColumnsProgress;
                if (f == 1.0f || f == 0.0f) {
                    RecyclerView.Adapter adapterStoryAlbums_getStoriesAdapterByTabType = isAnyStoryPageType(this.changeColumnsTab) ? storyAlbums_getStoriesAdapterByTabType(this.changeColumnsTab) : this.photoVideoAdapter;
                    if (this.photoVideoChangeColumnsProgress == 1.0f) {
                        int iCeil = (int) Math.ceil(this.pinchCenterPosition / this.animateToColumnsCount);
                        float measuredWidth = this.startedTrackingX / (this.mediaPages[0].listView.getMeasuredWidth() - ((int) (this.mediaPages[0].listView.getMeasuredWidth() / this.animateToColumnsCount)));
                        int i5 = this.animateToColumnsCount;
                        int itemCount = (iCeil * i5) + ((int) (measuredWidth * (i5 - 1)));
                        if (itemCount >= adapterStoryAlbums_getStoriesAdapterByTabType.getItemCount()) {
                            itemCount = adapterStoryAlbums_getStoriesAdapterByTabType.getItemCount() - 1;
                        }
                        this.pinchCenterPosition = itemCount;
                    }
                    finishPinchToMediaColumnsCount();
                    if (this.photoVideoChangeColumnsProgress == 0.0f) {
                        this.pinchScaleUp = !this.pinchScaleUp;
                    }
                    startPinchToMediaColumnsCount(this.pinchScaleUp);
                    this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                }
                this.mediaPages[0].listView.invalidate();
                MediaPage mediaPage = this.mediaPages[0];
                if (mediaPage.fastScrollHintView != null) {
                    mediaPage.invalidate();
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

    public boolean checkTabsAnimationInProgress() {
        AnimatorSet animatorSet;
        if (!this.tabsAnimationInProgress) {
            return false;
        }
        if (this.backAnimation) {
            if (Math.abs(this.mediaPages[0].getTranslationX()) < 1.0f) {
                this.mediaPages[0].setTranslationX(0.0f);
                MediaPage[] mediaPageArr = this.mediaPages;
                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth() * (this.animatingForward ? 1 : -1));
                animatorSet = this.tabsAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.tabsAnimation = null;
                }
                this.tabsAnimationInProgress = false;
            }
        } else if (Math.abs(this.mediaPages[1].getTranslationX()) < 1.0f) {
            MediaPage mediaPage = this.mediaPages[0];
            mediaPage.setTranslationX(mediaPage.getMeasuredWidth() * (this.animatingForward ? -1 : 1));
            this.mediaPages[1].setTranslationX(0.0f);
            animatorSet = this.tabsAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.tabsAnimation = null;
            }
            this.tabsAnimationInProgress = false;
        }
        onTabProgress(getTabProgress());
        return this.tabsAnimationInProgress;
    }

    public boolean closeActionMode() {
        return closeActionMode(true);
    }

    public boolean customTabs() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerView.Adapter adapter;
        int i3;
        ArrayList arrayList;
        int size;
        int i4;
        boolean z;
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter;
        SharedDocumentsAdapter sharedDocumentsAdapter;
        SharedDocumentsAdapter sharedDocumentsAdapter2;
        SharedLinksAdapter sharedLinksAdapter;
        SharedDocumentsAdapter sharedDocumentsAdapter3;
        PollAdapter pollAdapter;
        GifAdapter gifAdapter;
        int i5;
        SharedMediaData[] sharedMediaDataArr;
        RecyclerView.Adapter adapter2;
        int i6;
        RecyclerView.Adapter adapter3;
        int size2;
        int itemCount;
        SparseBooleanArray sparseBooleanArray;
        int i7;
        SharedMediaData sharedMediaData;
        SharedMediaData sharedMediaData2;
        int size3;
        MessageObject messageObject;
        int i8;
        SharedMediaData sharedMediaData3;
        InternalListView internalListView;
        int i9;
        MediaPage[] mediaPageArr;
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter2;
        int i10;
        MediaPage mediaPage;
        SharedMediaData sharedMediaData4;
        int size4;
        SharedMediaData sharedMediaData5;
        MessageObject messageObject2;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        if (i == NotificationCenter.mediaDidLoad) {
            long jLongValue = ((Long) objArr[0]).longValue();
            int iIntValue = ((Integer) objArr[3]).intValue();
            int iIntValue2 = ((Integer) objArr[7]).intValue();
            int iIntValue3 = ((Integer) objArr[4]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
            if (iIntValue3 == 6 || iIntValue3 == 7) {
                iIntValue3 = 0;
            }
            if (iIntValue != this.profileActivity.getClassGuid() || iIntValue2 != this.sharedMediaData[iIntValue3].requestIndex) {
                if (this.sharedMediaPreloader == null || !this.sharedMediaData[iIntValue3].messages.isEmpty() || this.sharedMediaData[iIntValue3].loadingAfterFastScroll || !fillMediaData(iIntValue3)) {
                    return;
                }
                if (iIntValue3 == 0) {
                    adapter2 = this.photoVideoAdapter;
                } else if (iIntValue3 == 1) {
                    adapter2 = this.documentsAdapter;
                } else if (iIntValue3 == 2) {
                    adapter2 = this.voiceAdapter;
                } else if (iIntValue3 == 3) {
                    adapter2 = this.linksAdapter;
                } else if (iIntValue3 == 4) {
                    adapter2 = this.audioAdapter;
                } else if (iIntValue3 == 5) {
                    adapter2 = this.gifAdapter;
                } else {
                    adapter2 = iIntValue3 == 15 ? this.pollAdapter : null;
                }
                if (adapter2 != null) {
                    while (true) {
                        MediaPage[] mediaPageArr2 = this.mediaPages;
                        if (i12 >= mediaPageArr2.length) {
                            break;
                        }
                        MediaPage mediaPage2 = mediaPageArr2[i12];
                        if (mediaPage2 != null && mediaPage2.listView != null && this.mediaPages[i12].listView.getAdapter() == adapter2) {
                            this.mediaPages[i12].listView.stopScroll();
                        }
                        i12++;
                    }
                    adapter2.notifyDataSetChanged();
                }
                this.scrolling = true;
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[2];
            boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(this.dialog_id);
            int i16 = jLongValue == this.dialog_id ? 0 : 1;
            if (iIntValue3 != 0 && iIntValue3 != 1 && iIntValue3 != 2 && iIntValue3 != 4) {
                this.sharedMediaData[iIntValue3].setTotalCount(i16, ((Integer) objArr[1]).intValue());
            }
            if (iIntValue3 == 0) {
                adapter3 = this.photoVideoAdapter;
            } else if (iIntValue3 == 1) {
                adapter3 = this.documentsAdapter;
            } else if (iIntValue3 == 2) {
                adapter3 = this.voiceAdapter;
            } else if (iIntValue3 == 3) {
                adapter3 = this.linksAdapter;
            } else {
                if (iIntValue3 != 4) {
                    if (iIntValue3 == 5) {
                        adapter3 = this.gifAdapter;
                    } else if (iIntValue3 == 15) {
                        adapter3 = this.pollAdapter;
                        i6 = 8;
                    } else {
                        i6 = iIntValue3;
                        adapter3 = null;
                    }
                    size2 = this.sharedMediaData[i6].messages.size();
                    if (adapter3 != null) {
                        itemCount = adapter3.getItemCount();
                        if (adapter3 instanceof RecyclerListView.SectionsAdapter) {
                            ((RecyclerListView.SectionsAdapter) adapter3).notifySectionsChanged();
                        }
                    } else {
                        itemCount = 0;
                    }
                    this.sharedMediaData[i6].loading = false;
                    sparseBooleanArray = new SparseBooleanArray();
                    if (zBooleanValue) {
                        size4 = arrayList2.size() - 1;
                        while (size4 >= 0) {
                            ArrayList arrayList3 = arrayList2;
                            messageObject2 = (MessageObject) arrayList3.get(size4);
                            if (this.sharedMediaData[i6].addMessage(messageObject2, i16, true, zIsEncryptedDialog)) {
                                sparseBooleanArray.put(messageObject2.getId(), true);
                                SharedMediaData.access$610(this.sharedMediaData[i6]);
                                if (this.sharedMediaData[i6].startOffset < 0) {
                                    this.sharedMediaData[i6].startOffset = 0;
                                }
                            }
                            size4--;
                            arrayList2 = arrayList3;
                        }
                        this.sharedMediaData[i6].startReached = ((Boolean) objArr[5]).booleanValue();
                        sharedMediaData5 = this.sharedMediaData[i6];
                        if (sharedMediaData5.startReached) {
                            sharedMediaData5.startOffset = 0;
                        }
                    } else {
                        for (i7 = 0; i7 < arrayList2.size(); i7++) {
                            messageObject = (MessageObject) arrayList2.get(i7);
                            if (this.sharedMediaData[i6].addMessage(messageObject, i16, false, zIsEncryptedDialog)) {
                                sparseBooleanArray.put(messageObject.getId(), true);
                                SharedMediaData.access$12010(this.sharedMediaData[i6]);
                                if (this.sharedMediaData[i6].endLoadingStubs < 0) {
                                    this.sharedMediaData[i6].endLoadingStubs = 0;
                                }
                            }
                        }
                        sharedMediaData = this.sharedMediaData[i6];
                        if (sharedMediaData.loadingAfterFastScroll && sharedMediaData.messages.size() > 0) {
                            SharedMediaData sharedMediaData6 = this.sharedMediaData[i6];
                            sharedMediaData6.min_id = sharedMediaData6.messages.get(0).getId();
                        }
                        this.sharedMediaData[i6].endReached[i16] = ((Boolean) objArr[5]).booleanValue();
                        sharedMediaData2 = this.sharedMediaData[i6];
                        if (sharedMediaData2.endReached[i16]) {
                            size3 = sharedMediaData2.messagesDict[i16].size();
                            if (i16 == 0) {
                                size3 += this.sharedMediaData[i6].startOffset;
                            }
                            this.sharedMediaData[i6].setTotalCount(i16, size3);
                        }
                    }
                    if (!zBooleanValue && i16 == 0) {
                        sharedMediaData4 = this.sharedMediaData[i6];
                        if (sharedMediaData4.endReached[i16] && this.mergeDialogId != 0) {
                            sharedMediaData4.loading = true;
                            this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[i6].max_id[1], 0, i6, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i6].requestIndex, null, null);
                        }
                    }
                    i8 = i6;
                    if (adapter3 != null) {
                        internalListView = null;
                        i9 = 0;
                        while (true) {
                            mediaPageArr = this.mediaPages;
                            if (i9 < mediaPageArr.length) {
                                break;
                            }
                            mediaPage = mediaPageArr[i9];
                            if (mediaPage == null && mediaPage.listView != null && this.mediaPages[i9].listView.getAdapter() == adapter3) {
                                internalListView = this.mediaPages[i9].listView;
                                this.mediaPages[i9].listView.stopScroll();
                            }
                            i9++;
                        }
                        int itemCount2 = adapter3.getItemCount();
                        sharedPhotoVideoAdapter2 = this.photoVideoAdapter;
                        if (adapter3 == sharedPhotoVideoAdapter2) {
                            try {
                                adapter3.notifyDataSetChanged();
                            } catch (Throwable unused) {
                            }
                        } else if (sharedPhotoVideoAdapter2.getItemCount() == itemCount) {
                            AndroidUtilities.updateVisibleRows(internalListView);
                        } else {
                            this.photoVideoAdapter.notifyDataSetChanged();
                        }
                        if (this.sharedMediaData[i8].messages.isEmpty() || this.sharedMediaData[i8].loading) {
                            if (internalListView != null && (adapter3 == this.photoVideoAdapter || itemCount2 >= itemCount)) {
                                animateItemsEnter(internalListView, itemCount, sparseBooleanArray);
                            }
                        } else if (internalListView != null) {
                            animateItemsEnter(internalListView, itemCount, sparseBooleanArray);
                        }
                        if (internalListView != null && !this.sharedMediaData[i8].loadingAfterFastScroll) {
                            if (size2 == 0) {
                                for (i10 = 0; i10 < 2; i10++) {
                                    if (this.mediaPages[i10].selectedType == 0) {
                                        ((LinearLayoutManager) internalListView.getLayoutManager()).scrollToPositionWithOffset(this.photoVideoAdapter.getPositionForIndex(0), 0);
                                    }
                                }
                            } else {
                                saveScrollPosition();
                            }
                        }
                    }
                    sharedMediaData3 = this.sharedMediaData[i8];
                    if (sharedMediaData3.loadingAfterFastScroll) {
                        if (sharedMediaData3.messages.size() == 0) {
                            loadFromStart(i8);
                        } else {
                            this.sharedMediaData[i8].loadingAfterFastScroll = false;
                        }
                    }
                    this.scrolling = true;
                    return;
                }
                adapter3 = this.audioAdapter;
            }
            i6 = iIntValue3;
            size2 = this.sharedMediaData[i6].messages.size();
            if (adapter3 != null) {
                itemCount = adapter3.getItemCount();
                if (adapter3 instanceof RecyclerListView.SectionsAdapter) {
                    ((RecyclerListView.SectionsAdapter) adapter3).notifySectionsChanged();
                }
            } else {
                itemCount = 0;
            }
            this.sharedMediaData[i6].loading = false;
            sparseBooleanArray = new SparseBooleanArray();
            if (zBooleanValue) {
                size4 = arrayList2.size() - 1;
                while (size4 >= 0) {
                    ArrayList arrayList4 = arrayList2;
                    messageObject2 = (MessageObject) arrayList4.get(size4);
                    if (this.sharedMediaData[i6].addMessage(messageObject2, i16, true, zIsEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), true);
                        SharedMediaData.access$610(this.sharedMediaData[i6]);
                        if (this.sharedMediaData[i6].startOffset < 0) {
                            this.sharedMediaData[i6].startOffset = 0;
                        }
                    }
                    size4--;
                    arrayList2 = arrayList4;
                }
                this.sharedMediaData[i6].startReached = ((Boolean) objArr[5]).booleanValue();
                sharedMediaData5 = this.sharedMediaData[i6];
                if (sharedMediaData5.startReached) {
                    sharedMediaData5.startOffset = 0;
                }
            } else {
                while (i7 < arrayList2.size()) {
                    messageObject = (MessageObject) arrayList2.get(i7);
                    if (this.sharedMediaData[i6].addMessage(messageObject, i16, false, zIsEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject.getId(), true);
                        SharedMediaData.access$12010(this.sharedMediaData[i6]);
                        if (this.sharedMediaData[i6].endLoadingStubs < 0) {
                            this.sharedMediaData[i6].endLoadingStubs = 0;
                        }
                    }
                }
                sharedMediaData = this.sharedMediaData[i6];
                if (sharedMediaData.loadingAfterFastScroll) {
                    SharedMediaData sharedMediaData7 = this.sharedMediaData[i6];
                    sharedMediaData7.min_id = sharedMediaData7.messages.get(0).getId();
                }
                this.sharedMediaData[i6].endReached[i16] = ((Boolean) objArr[5]).booleanValue();
                sharedMediaData2 = this.sharedMediaData[i6];
                if (sharedMediaData2.endReached[i16]) {
                    size3 = sharedMediaData2.messagesDict[i16].size();
                    if (i16 == 0) {
                        size3 += this.sharedMediaData[i6].startOffset;
                    }
                    this.sharedMediaData[i6].setTotalCount(i16, size3);
                }
            }
            if (!zBooleanValue) {
                sharedMediaData4 = this.sharedMediaData[i6];
                if (sharedMediaData4.endReached[i16]) {
                    sharedMediaData4.loading = true;
                    this.profileActivity.getMediaDataController().loadMedia(this.mergeDialogId, 50, this.sharedMediaData[i6].max_id[1], 0, i6, this.topicId, 1, this.profileActivity.getClassGuid(), this.sharedMediaData[i6].requestIndex, null, null);
                }
            }
            i8 = i6;
            if (adapter3 != null) {
                internalListView = null;
                i9 = 0;
                while (true) {
                    mediaPageArr = this.mediaPages;
                    if (i9 < mediaPageArr.length) {
                        break;
                        break;
                    } else {
                        mediaPage = mediaPageArr[i9];
                        if (mediaPage == null) {
                        }
                        i9++;
                    }
                }
                int itemCount3 = adapter3.getItemCount();
                sharedPhotoVideoAdapter2 = this.photoVideoAdapter;
                if (adapter3 == sharedPhotoVideoAdapter2) {
                    adapter3.notifyDataSetChanged();
                } else if (sharedPhotoVideoAdapter2.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(internalListView);
                } else {
                    this.photoVideoAdapter.notifyDataSetChanged();
                }
                if (this.sharedMediaData[i8].messages.isEmpty()) {
                    if (internalListView != null) {
                        animateItemsEnter(internalListView, itemCount, sparseBooleanArray);
                    }
                } else if (internalListView != null) {
                    animateItemsEnter(internalListView, itemCount, sparseBooleanArray);
                }
                if (internalListView != null) {
                    if (size2 == 0) {
                        while (i10 < 2) {
                            if (this.mediaPages[i10].selectedType == 0) {
                                ((LinearLayoutManager) internalListView.getLayoutManager()).scrollToPositionWithOffset(this.photoVideoAdapter.getPositionForIndex(0), 0);
                            }
                        }
                    } else {
                        saveScrollPosition();
                    }
                }
            }
            sharedMediaData3 = this.sharedMediaData[i8];
            if (sharedMediaData3.loadingAfterFastScroll) {
                if (sharedMediaData3.messages.size() == 0) {
                    loadFromStart(i8);
                } else {
                    this.sharedMediaData[i8].loadingAfterFastScroll = false;
                }
            }
            this.scrolling = true;
            return;
        }
        int i17 = -1;
        if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(this.dialog_id) ? this.profileActivity.getMessagesController().getChat(Long.valueOf(-this.dialog_id)) : null;
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (jLongValue2 == 0 && this.mergeDialogId != 0) {
                    i3 = 1;
                } else if (jLongValue2 != chat.id) {
                    return;
                }
                arrayList = (ArrayList) objArr[0];
                size = arrayList.size();
                z = false;
                for (i4 = 0; i4 < size; i4++) {
                    i5 = 0;
                    while (true) {
                        sharedMediaDataArr = this.sharedMediaData;
                        if (i5 < sharedMediaDataArr.length) {
                            if (sharedMediaDataArr[i5].deleteMessage(((Integer) arrayList.get(i4)).intValue(), i3) != null) {
                                i17 = i5;
                                z = true;
                            }
                            i5++;
                        }
                    }
                }
                if (z) {
                    this.scrolling = true;
                    sharedPhotoVideoAdapter = this.photoVideoAdapter;
                    if (sharedPhotoVideoAdapter != null) {
                        sharedPhotoVideoAdapter.notifyDataSetChanged();
                    }
                    sharedDocumentsAdapter = this.documentsAdapter;
                    if (sharedDocumentsAdapter != null) {
                        sharedDocumentsAdapter.notifyDataSetChanged();
                    }
                    sharedDocumentsAdapter2 = this.voiceAdapter;
                    if (sharedDocumentsAdapter2 != null) {
                        sharedDocumentsAdapter2.notifyDataSetChanged();
                    }
                    sharedLinksAdapter = this.linksAdapter;
                    if (sharedLinksAdapter != null) {
                        sharedLinksAdapter.notifyDataSetChanged();
                    }
                    sharedDocumentsAdapter3 = this.audioAdapter;
                    if (sharedDocumentsAdapter3 != null) {
                        sharedDocumentsAdapter3.notifyDataSetChanged();
                    }
                    pollAdapter = this.pollAdapter;
                    if (pollAdapter != null) {
                        pollAdapter.notifyDataSetChanged();
                    }
                    gifAdapter = this.gifAdapter;
                    if (gifAdapter != null) {
                        gifAdapter.notifyDataSetChanged();
                    }
                    if (i17 != 0 || i17 == 1 || i17 == 2 || i17 == 4) {
                        loadFastScrollData(true);
                    }
                }
                getMediaPage(i17);
                return;
            }
            if (jLongValue2 != 0) {
                return;
            }
            i3 = 0;
            arrayList = (ArrayList) objArr[0];
            size = arrayList.size();
            z = false;
            while (i4 < size) {
                i5 = 0;
                while (true) {
                    sharedMediaDataArr = this.sharedMediaData;
                    if (i5 < sharedMediaDataArr.length) {
                        if (sharedMediaDataArr[i5].deleteMessage(((Integer) arrayList.get(i4)).intValue(), i3) != null) {
                            i17 = i5;
                            z = true;
                        }
                        i5++;
                    }
                }
            }
            if (z) {
                this.scrolling = true;
                sharedPhotoVideoAdapter = this.photoVideoAdapter;
                if (sharedPhotoVideoAdapter != null) {
                    sharedPhotoVideoAdapter.notifyDataSetChanged();
                }
                sharedDocumentsAdapter = this.documentsAdapter;
                if (sharedDocumentsAdapter != null) {
                    sharedDocumentsAdapter.notifyDataSetChanged();
                }
                sharedDocumentsAdapter2 = this.voiceAdapter;
                if (sharedDocumentsAdapter2 != null) {
                    sharedDocumentsAdapter2.notifyDataSetChanged();
                }
                sharedLinksAdapter = this.linksAdapter;
                if (sharedLinksAdapter != null) {
                    sharedLinksAdapter.notifyDataSetChanged();
                }
                sharedDocumentsAdapter3 = this.audioAdapter;
                if (sharedDocumentsAdapter3 != null) {
                    sharedDocumentsAdapter3.notifyDataSetChanged();
                }
                pollAdapter = this.pollAdapter;
                if (pollAdapter != null) {
                    pollAdapter.notifyDataSetChanged();
                }
                gifAdapter = this.gifAdapter;
                if (gifAdapter != null) {
                    gifAdapter.notifyDataSetChanged();
                }
                if (i17 != 0) {
                    loadFastScrollData(true);
                } else {
                    loadFastScrollData(true);
                }
            }
            getMediaPage(i17);
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long jLongValue3 = ((Long) objArr[0]).longValue();
            long j = this.dialog_id;
            if (jLongValue3 != j) {
                return;
            }
            ArrayList arrayList5 = (ArrayList) objArr[1];
            boolean zIsEncryptedDialog2 = DialogObject.isEncryptedDialog(j);
            int i18 = 0;
            boolean z2 = false;
            while (i18 < arrayList5.size()) {
                MessageObject messageObject3 = (MessageObject) arrayList5.get(i18);
                if (MessageObject.getMedia(messageObject3.messageOwner) != null && !messageObject3.needDrawBluredPreview()) {
                    int mediaType = MediaDataController.getMediaType(messageObject3.messageOwner);
                    if (mediaType == i17) {
                        return;
                    }
                    SharedMediaData sharedMediaData8 = this.sharedMediaData[mediaType];
                    if (sharedMediaData8.startReached) {
                        if (sharedMediaData8.addMessage(messageObject3, messageObject3.getDialogId() == this.dialog_id ? 0 : 1, true, zIsEncryptedDialog2)) {
                            this.hasMedia[mediaType] = 1;
                            z2 = true;
                        }
                    }
                }
                i18++;
                i17 = -1;
            }
            if (!z2) {
                return;
            }
            this.scrolling = true;
            while (true) {
                MediaPage[] mediaPageArr3 = this.mediaPages;
                if (i13 >= mediaPageArr3.length) {
                    updateTabs(true);
                    return;
                }
                int i19 = mediaPageArr3[i13].selectedType;
                if (i19 == 0) {
                    adapter = this.photoVideoAdapter;
                } else if (i19 == 1) {
                    adapter = this.documentsAdapter;
                } else if (i19 == 2) {
                    adapter = this.voiceAdapter;
                } else if (i19 == 3) {
                    adapter = this.linksAdapter;
                } else {
                    if (i19 == 4) {
                        adapter = this.audioAdapter;
                    } else if (i19 == 5) {
                        adapter = this.gifAdapter;
                    } else {
                        adapter = i19 == 15 ? this.pollAdapter : null;
                    }
                    if (adapter != null) {
                        adapter.getItemCount();
                        this.photoVideoAdapter.notifyDataSetChanged();
                        this.documentsAdapter.notifyDataSetChanged();
                        this.voiceAdapter.notifyDataSetChanged();
                        this.linksAdapter.notifyDataSetChanged();
                        this.audioAdapter.notifyDataSetChanged();
                        this.pollAdapter.notifyDataSetChanged();
                        this.gifAdapter.notifyDataSetChanged();
                    }
                    i13++;
                }
                if (adapter != null) {
                    adapter.getItemCount();
                    this.photoVideoAdapter.notifyDataSetChanged();
                    this.documentsAdapter.notifyDataSetChanged();
                    this.voiceAdapter.notifyDataSetChanged();
                    this.linksAdapter.notifyDataSetChanged();
                    this.audioAdapter.notifyDataSetChanged();
                    this.pollAdapter.notifyDataSetChanged();
                    this.gifAdapter.notifyDataSetChanged();
                }
                i13++;
            }
        } else if (i == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() != this.dialog_id && l.longValue() != this.mergeDialogId) {
                return;
            }
            int i20 = l.longValue() == this.dialog_id ? 0 : 1;
            while (true) {
                SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                if (i14 >= sharedMediaDataArr2.length) {
                    return;
                }
                sharedMediaDataArr2[i14].replaceMid(i20, num.intValue(), num2.intValue());
                i14++;
            }
        } else if (i != NotificationCenter.messagePlayingDidStart && i != NotificationCenter.messagePlayingPlayStateChanged && i != NotificationCenter.messagePlayingDidReset) {
            if (i == NotificationCenter.storiesListUpdated) {
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) objArr[0];
                MediaPage mediaPage3 = getMediaPage(storyAlbums_getTabTypeByStoriesList(storiesList));
                if (mediaPage3 != null) {
                    if (mediaPage3.fastScrollEnabled != (storiesList.getCount() > 0)) {
                        mediaPage3.fastScrollEnabled = storiesList.getCount() > 0;
                        updateFastScrollVisibility(mediaPage3, true);
                    }
                }
                if (mediaPage3 != null) {
                    AndroidUtilities.notifyDataSetChanged(mediaPage3.listView);
                    if (mediaPage3.listView.getLayoutManager() instanceof LinearLayoutManager) {
                        checkLoadMoreScroll(mediaPage3, mediaPage3.listView, (LinearLayoutManager) mediaPage3.listView.getLayoutManager());
                    }
                }
                Delegate delegate = this.delegate;
                if (delegate != null) {
                    delegate.updateSelectedMediaTabText();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.storiesUpdated) {
                for (MediaPage mediaPage4 : this.mediaPages) {
                    if (mediaPage4 != null && mediaPage4.listView != null && isAnyStoryPageType(mediaPage4.selectedType)) {
                        if (!isBot() || mediaPage4.listView.getAdapter() == null) {
                            for (int i21 = 0; i21 < mediaPage4.listView.getChildCount(); i21++) {
                                View childAt = mediaPage4.listView.getChildAt(i21);
                                if (childAt instanceof SharedPhotoVideoCell2) {
                                    ((SharedPhotoVideoCell2) childAt).updateViews();
                                }
                            }
                        } else {
                            AndroidUtilities.notifyDataSetChanged(mediaPage4.listView);
                        }
                    }
                }
                return;
            }
            if (i == NotificationCenter.channelRecommendationsLoaded) {
                if (((Long) objArr[0]).longValue() == this.dialog_id) {
                    this.channelRecommendationsAdapter.update(true);
                    updateTabs(true);
                    checkCurrentTabValid();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.savedMessagesDialogsUpdate) {
                long j2 = this.dialog_id;
                if (j2 == 0 || j2 == this.profileActivity.getUserConfig().getClientUserId()) {
                    this.savedDialogsAdapter.update(true);
                    updateTabs(true);
                    checkCurrentTabValid();
                    onSelectedTabChanged();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.dialogsNeedReload) {
                this.savedDialogsAdapter.update(true);
                return;
            }
            if (i == NotificationCenter.starUserGiftsLoaded) {
                if (((Long) objArr[0]).longValue() == this.dialog_id) {
                    updateTabs(true);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.updatedChatRanks) {
                long jLongValue4 = ((Long) objArr[0]).longValue();
                long jLongValue5 = ((Long) objArr[1]).longValue();
                if (this.dialog_id != (-jLongValue4)) {
                    return;
                }
                String str = (String) objArr[2];
                ChatUsersAdapter chatUsersAdapter = this.chatUsersAdapter;
                if (chatUsersAdapter == null) {
                    return;
                }
                chatUsersAdapter.updateRank(jLongValue5, str);
                while (true) {
                    MediaPage[] mediaPageArr4 = this.mediaPages;
                    if (i15 >= mediaPageArr4.length) {
                        return;
                    }
                    MediaPage mediaPage5 = mediaPageArr4[i15];
                    if (mediaPage5.selectedType == 7) {
                        AndroidUtilities.updateVisibleRows(mediaPage5.listView);
                    }
                    i15++;
                }
            } else {
                if (i != NotificationCenter.didUpdatePollResults) {
                    return;
                }
                long jLongValue6 = ((Long) objArr[0]).longValue();
                TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
                TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
                while (true) {
                    MediaPage[] mediaPageArr5 = this.mediaPages;
                    if (i11 >= mediaPageArr5.length) {
                        return;
                    }
                    RecyclerView.Adapter adapter4 = mediaPageArr5[i11].listView.getAdapter();
                    PollAdapter pollAdapter2 = this.pollAdapter;
                    if (adapter4 == pollAdapter2) {
                        pollAdapter2.update(this.mediaPages[i11].listView, jLongValue6, tL_poll, pollResults);
                    }
                    i11++;
                }
            }
        } else if (i == NotificationCenter.messagePlayingDidReset || i == NotificationCenter.messagePlayingPlayStateChanged) {
            int i22 = 0;
            while (true) {
                MediaPage[] mediaPageArr6 = this.mediaPages;
                if (i22 >= mediaPageArr6.length) {
                    return;
                }
                MediaPage mediaPage6 = mediaPageArr6[i22];
                if (mediaPage6 != null && mediaPage6.listView != null) {
                    int childCount = this.mediaPages[i22].listView.getChildCount();
                    for (int i23 = 0; i23 < childCount; i23++) {
                        View childAt2 = this.mediaPages[i22].listView.getChildAt(i23);
                        if (childAt2 instanceof SharedAudioCell) {
                            SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt2;
                            if (sharedAudioCell.getMessage() != null) {
                                sharedAudioCell.updateButtonState(false, true);
                            }
                        }
                    }
                }
                i22++;
            }
        } else {
            if (((MessageObject) objArr[0]).eventId != 0) {
                return;
            }
            int i24 = 0;
            while (true) {
                MediaPage[] mediaPageArr7 = this.mediaPages;
                if (i24 >= mediaPageArr7.length) {
                    return;
                }
                int childCount2 = mediaPageArr7[i24].listView.getChildCount();
                for (int i25 = 0; i25 < childCount2; i25++) {
                    View childAt3 = this.mediaPages[i24].listView.getChildAt(i25);
                    if (childAt3 instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell2 = (SharedAudioCell) childAt3;
                        if (sharedAudioCell2.getMessage() != null) {
                            sharedAudioCell2.updateButtonState(false, true);
                        }
                    }
                }
                i24++;
            }
        }
    }

    public void disableScroll(boolean z) {
        if (z) {
            stopScroll(null);
        }
        this.disableScrolling = z;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        if (this.scrollSlidingTextTabStrip != null) {
            canvas.save();
            canvas.translate(this.scrollSlidingTextTabStrip.getX(), this.scrollSlidingTextTabStrip.getY());
            this.scrollSlidingTextTabStrip.drawBackground(canvas);
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null && fragmentContextView.isCallStyle() && this.topPanelLayout == null) {
            canvas.save();
            canvas.translate(this.fragmentContextView.getX(), this.fragmentContextView.getY());
            this.fragmentContextView.setDrawOverlay(true);
            this.fragmentContextView.draw(canvas);
            this.fragmentContextView.setDrawOverlay(false);
            canvas.restore();
        }
    }

    public boolean dispatchFastScrollEvent(MotionEvent motionEvent) {
        View view = (View) getParent();
        motionEvent.offsetLocation(((-view.getX()) - getX()) - this.mediaPages[0].listView.getFastScroll().getX(), (((-view.getY()) - getY()) - this.mediaPages[0].getY()) - this.mediaPages[0].listView.getFastScroll().getY());
        return this.mediaPages[0].listView.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (view != this.fragmentContextView || this.topPanelLayout != null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        float top = this.mediaPages[0].getTop();
        if (this.storiesContainer != null && ((i = this.mediaPages[0].selectedType) == 8 || isStoryAlbumPageType(i))) {
            top -= this.storiesContainer.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public void drawListForBlur(Canvas canvas, ArrayList<SizeNotifierFrameLayout.IViewWithInvalidateCallback> arrayList) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null && mediaPage.getVisibility() == 0) {
                for (int i2 = 0; i2 < this.mediaPages[i].listView.getChildCount(); i2++) {
                    View childAt = this.mediaPages[i].listView.getChildAt(i2);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + this.mediaPages[i].listView.blurTopPadding) {
                        int iSave = canvas.save();
                        canvas.translate(childAt.getX() + this.mediaPages[i].getX(), childAt.getY() + this.mediaPages[i].listView.getY() + this.mediaPages[i].getY() + getY());
                        childAt.draw(canvas);
                        if (arrayList != null && (childAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback)) {
                            arrayList.add((SizeNotifierFrameLayout.IViewWithInvalidateCallback) childAt);
                        }
                        canvas.restoreToCount(iSave);
                    }
                }
            }
            i++;
        }
    }

    @Override
    public void forceHasOverlappingRendering(boolean z) {
        super.forceHasOverlappingRendering(z);
    }

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.selectedFiles[0];
    }

    public String getBotPreviewsSubtitle(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        BotPreviewsEditContainer botPreviewsEditContainer;
        if (!isBot()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z && (botPreviewsEditContainer = this.botPreviewsContainer) != null) {
            return botPreviewsEditContainer.getBotPreviewsSubtitle();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter == null || storiesAdapter.storiesList == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < this.storiesAdapter.storiesList.messageObjects.size(); i3++) {
                MessageObject messageObject = (MessageObject) this.storiesAdapter.storiesList.messageObjects.get(i3);
                TL_stories.StoryItem storyItem = messageObject.storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (MessageObject.isVideoDocument(messageMedia.document)) {
                        i2++;
                    } else if (messageObject.storyItem.media.photo != null) {
                        i++;
                    }
                }
            }
        }
        if (i == 0 && i2 == 0) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(LocaleController.formatPluralString("Images", i, new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(LocaleController.formatPluralString("Videos", i2, new Object[0]));
        }
        return sb.toString();
    }

    public float getBottomButtonStoriesVisibility() {
        MediaPage mediaPage;
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        MediaPage[] mediaPageArr = this.mediaPages;
        float f = 1.0f;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null || mediaPageArr[1] == null || mediaPage.emptyView == null || this.mediaPages[1].emptyView == null) {
            return 1.0f;
        }
        MediaPage[] mediaPageArr2 = this.mediaPages;
        int i = mediaPageArr2[0].selectedType;
        int i2 = mediaPageArr2[1].selectedType;
        boolean z = isStoryAlbumPageType(i) || i == 8;
        boolean z2 = isStoryAlbumPageType(i2) || i2 == 8;
        if (!z && !z2) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - this.mediaPages[0].emptyView.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - this.mediaPages[1].emptyView.getVisibilityFactor();
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(this.mediaPages[0].selectedType);
        if (i == 8 || (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && (storiesList2 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) != null && storiesList2.getCount() > 0)) {
            visibilityFactor = 1.0f;
        }
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType2 = storyAlbums_getStoriesAdapterByTabType(i2);
        if (i2 != 8 && (storiesAdapterStoryAlbums_getStoriesAdapterByTabType2 == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType2.storiesList) == null || storiesList.getCount() <= 0)) {
            f = visibilityFactor2;
        }
        if (!z) {
            visibilityFactor = f;
        }
        if (!z2) {
            f = visibilityFactor;
        }
        return AndroidUtilities.lerp(visibilityFactor, f, Math.abs(this.mediaPages[0].getTranslationX() / this.mediaPages[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && mediaPage.getVisibility() == 0) {
            if (this.tabsAnimationInProgress && !this.backAnimation) {
                return this.mediaPages[1].selectedType;
            }
            if (Math.abs(this.mediaPages[1].getTranslationX()) < this.mediaPages[1].getMeasuredWidth() / 2.0f) {
                return this.mediaPages[1].selectedType;
            }
        }
        return getSelectedTab();
    }

    public RecyclerListView getCurrentListView() {
        ChatActivityContainer chatActivityContainer;
        MediaPage mediaPage = this.mediaPages[0];
        int i = mediaPage.selectedType;
        if (i == 13) {
            return this.botPreviewsContainer.getCurrentListView();
        }
        if (i == 14) {
            return this.giftsContainer.getCurrentListView();
        }
        return (i != 12 || (chatActivityContainer = this.savedMessagesContainer) == null) ? mediaPage.listView : chatActivityContainer.chatActivity.getChatListView();
    }

    public int getInitialTab() {
        return 0;
    }

    public int getNextMediaColumnsCount(int i, int i2, boolean z) {
        int i3 = i2 + (!z ? 1 : -1);
        if (i3 > 6) {
            i3 = !z ? 9 : 6;
        }
        return Utilities.clamp(i3, 9, (this.allowStoriesSingleColumn && i == 1) ? 1 : 2);
    }

    public float getPhotoVideoOptionsAlpha(float f) {
        int i;
        int i2;
        ProfileGiftsContainer profileGiftsContainer;
        int i3;
        int i4;
        ProfileGiftsContainer profileGiftsContainer2;
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && ((i3 = mediaPage.selectedType) == 0 || (((i3 == 8 || isStoryAlbumPageType(i3)) && TextUtils.isEmpty(getStoriesHashtag())) || (i4 = this.mediaPages[1].selectedType) == 9 || i4 == 11 || i4 == 13 || (i4 == 14 && (profileGiftsContainer2 = this.giftsContainer) != null && profileGiftsContainer2.canFilter())))) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        return (mediaPage2 == null || !((i = mediaPage2.selectedType) == 0 || (((i == 8 || isStoryAlbumPageType(i)) && TextUtils.isEmpty(getStoriesHashtag())) || (i2 = this.mediaPages[0].selectedType) == 9 || i2 == 11 || i2 == 13 || (i2 == 14 && (profileGiftsContainer = this.giftsContainer) != null && profileGiftsContainer.canFilter())))) ? f2 : (1.0f - f) + f2;
    }

    public int getPhotosVideosTypeFilter() {
        return this.sharedMediaData[0].filterType;
    }

    public TextView getSaveItem() {
        return this.saveItem;
    }

    public float getSearchAlpha(float f) {
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage mediaPage = this.mediaPages[1];
        if (mediaPage != null && isSearchItemVisible(mediaPage.selectedType) && this.mediaPages[1].selectedType != 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = this.mediaPages[0];
        return (mediaPage2 == null || !isSearchItemVisible(mediaPage2.selectedType) || this.mediaPages[0].selectedType == 11) ? f2 : (1.0f - f) + f2;
    }

    public ActionBarMenuItem getSearchItem() {
        return this.searchItem;
    }

    public RLottieImageView getSearchOptionsItem() {
        return this.optionsSearchImageView;
    }

    public int getSelectedTab() {
        int currentTabId = this.scrollSlidingTextTabStrip.getCurrentTabId();
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        if (profileStoriesCollectionTabs == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = profileStoriesCollectionTabs.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? storyAlbums_getByAlbumId(currentAlbumId).tabType : currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public int getStoriesCount(int i) {
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType;
        StoriesController.StoriesList storiesList;
        if (!isAnyStoryPageType(i) || (storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i)) == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) == null) {
            return 0;
        }
        return storiesList.getCount();
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float fAbs = 0.0f;
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return fAbs;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null) {
                fAbs = ((1.0f - Math.abs(mediaPage.getTranslationX() / getWidth())) * mediaPage.selectedType) + fAbs;
            }
            i++;
        }
    }

    public float getTabTranslationX(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                break;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && isTab(mediaPage.selectedType, i, z)) {
                i3++;
                width = this.mediaPages[i2].getTranslationX();
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public float getTabVisibility(int i, boolean z) {
        float fAbs = 0.0f;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return fAbs;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null && isTab(mediaPage.selectedType, i, z)) {
                fAbs = (1.0f - Math.abs(this.mediaPages[i2].getTranslationX() / getWidth())) + fAbs;
            }
            i2++;
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.selectedMessagesCountTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        RLottieImageView iconView = this.deleteItem.getIconView();
        int i = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(iconView, 8, null, null, null, null, i));
        ActionBarMenuItem actionBarMenuItem = this.deleteItem;
        int i2 = Theme.key_actionBarActionModeDefaultSelector;
        arrayList.add(new ThemeDescription(actionBarMenuItem, 32, null, null, null, null, i2));
        ActionBarMenuItem actionBarMenuItem2 = this.gotoItem;
        if (actionBarMenuItem2 != null) {
            arrayList.add(new ThemeDescription(actionBarMenuItem2.getIconView(), 8, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.gotoItem, 32, null, null, null, null, i2));
        }
        ActionBarMenuItem actionBarMenuItem3 = this.forwardItem;
        if (actionBarMenuItem3 != null) {
            arrayList.add(new ThemeDescription(actionBarMenuItem3.getIconView(), 8, null, null, null, null, i));
            arrayList.add(new ThemeDescription(this.forwardItem, 32, null, null, null, null, i2));
        }
        arrayList.add(new ThemeDescription(this.closeButton, 8, null, null, new Drawable[]{this.backDrawable}, null, i));
        arrayList.add(new ThemeDescription(this.closeButton, 32, null, null, null, null, i2));
        LinearLayout linearLayout = this.actionModeLayout;
        int i3 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(linearLayout, 1, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 1, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, Theme.key_chat_mediaTimeBackground));
        arrayList.add(new ThemeDescription(this.floatingDateView, 0, null, null, null, null, Theme.key_chat_mediaTimeText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, Theme.key_profile_tabSelectedLine));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelectedText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelector));
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null) {
            arrayList.add(new ThemeDescription(fragmentContextView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_inappPlayerBackground));
            arrayList.add(new ThemeDescription(this.fragmentContextView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, -1, null, Theme.key_inappPlayerPlayPause));
            arrayList.add(new ThemeDescription(this.fragmentContextView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_inappPlayerTitle));
            arrayList.add(new ThemeDescription(this.fragmentContextView, 33554436, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_inappPlayerPerformer));
            arrayList.add(new ThemeDescription(this.fragmentContextView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, -1, null, Theme.key_inappPlayerClose));
            arrayList.add(new ThemeDescription(this.fragmentContextView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_returnToCallBackground));
            arrayList.add(new ThemeDescription(this.fragmentContextView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_returnToCallText));
        }
        final int i4 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i4 >= mediaPageArr.length) {
                return arrayList;
            }
            ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
                @Override
                public final void didSetColor() {
                    this.f$0.lambda$getThemeDescriptions$68(i4);
                }

                @Override
                public final void onAnimationProgress(float f) {
                }
            };
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
            FlickerLoadingView flickerLoadingView = this.mediaPages[i4].progressView;
            int i5 = Theme.key_windowBackgroundWhite;
            arrayList.add(new ThemeDescription(flickerLoadingView, 0, null, null, null, null, i5));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4096, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 524288, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 524304, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
            int i6 = Theme.key_progressCircle;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, i6));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{UserCell.class}, new String[]{"adminTextView"}, null, null, -1, null, Theme.key_profile_creatorIcon));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i7));
            int i8 = Theme.key_windowBackgroundWhiteGrayText;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, null, null, -1, themeDescriptionDelegate, i8));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
            Drawable[] drawableArr = Theme.avatarDrawables;
            int i9 = Theme.key_avatar_text;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{UserCell.class}, null, drawableArr, null, i9));
            TextPaint[] textPaintArr = Theme.dialogs_namePaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{ProfileSearchCell.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, null, -1, null, Theme.key_chats_name));
            TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{ProfileSearchCell.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, null, -1, null, Theme.key_chats_secretName));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{ProfileSearchCell.class}, null, drawableArr, null, i9));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
            int i10 = Theme.key_windowBackgroundWhiteGrayText2;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{EmptyStubView.class}, new String[]{"emptyTextView"}, null, null, -1, null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i7));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
            int i11 = Theme.key_sharedMedia_startStopLoadIcon;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 2048, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, null, null, -1, null, i11));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, null, null, -1, null, i11));
            int i12 = Theme.key_checkbox;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8192, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
            int i13 = Theme.key_checkboxCheck;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 16384, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, null, null, -1, null, Theme.key_files_folderIcon));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, null, null, -1, null, Theme.key_files_iconText));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, i6));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8192, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 16384, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, i7));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, i10));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8192, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 16384, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i7));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{SharedLinkCell.class}, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, Theme.key_windowBackgroundWhiteLinkSelection));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, null, null, -1, null, Theme.key_sharedMedia_linkPlaceholderText));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 32, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, null, null, -1, null, Theme.key_sharedMedia_linkPlaceholder));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 524304, new Class[]{SharedMediaSectionCell.class}, null, null, null, i5));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 524288, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i7));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i7));
            int i14 = Theme.key_sharedMedia_photoPlaceholder;
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{SharedPhotoVideoCell.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i14));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8192, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i12));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 16384, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, new Class[]{ContextLinkCell.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i14));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 8192, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i12));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 16384, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i13));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].listView, 0, null, null, new Drawable[]{this.pinnedHeaderShadowDrawable}, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].emptyView.title, 4, null, null, null, null, i7));
            arrayList.add(new ThemeDescription(this.mediaPages[i4].emptyView.subtitle, 4, null, null, null, null, i8));
            i4++;
        }
    }

    public boolean hasInternet() {
        return this.profileActivity.getConnectionsManager().getConnectionState() == 3;
    }

    public boolean includeSavedDialogs() {
        return false;
    }

    public boolean includeStories() {
        return true;
    }

    public void initBlurCapture(ViewGroup viewGroup) {
        for (MediaPage mediaPage : this.mediaPages) {
            InternalListView internalListView = mediaPage.listView;
            InternalListView internalListView2 = mediaPage.listView;
            Objects.requireNonNull(internalListView2);
            mediaPage.iBlur3Capture = new ViewGroupPartRenderer(internalListView, viewGroup, new ColorPicker$$ExternalSyntheticLambda5(internalListView2, 15));
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.initBlurCapture(viewGroup);
        }
    }

    public void invalidateBlur() {
    }

    public boolean isActionModeShown() {
        return this.isActionModeShowed;
    }

    public boolean isAnimatingForward() {
        return this.animatingForward;
    }

    public boolean isArchivedOnlyStoriesView() {
        return false;
    }

    public boolean isBot() {
        TLRPC.User user;
        return this.dialog_id > 0 && (user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(this.dialog_id))) != null && user.bot;
    }

    public boolean isCalendarItemVisible() {
        int i = this.mediaPages[0].selectedType;
        return i == 0 || isAnyStoryPageType(i) || this.mediaPages[0].selectedType == 11;
    }

    public boolean isCurrentTabFirst() {
        return getSelectedTab() == this.scrollSlidingTextTabStrip.getFirstTabId();
    }

    public boolean isInFastScroll() {
        MediaPage mediaPage = this.mediaPages[0];
        return (mediaPage == null || mediaPage.listView.getFastScroll() == null || !this.mediaPages[0].listView.getFastScroll().isPressed()) ? false : true;
    }

    public boolean isOptionsItemVisible() {
        ProfileGiftsContainer profileGiftsContainer;
        int i = this.mediaPages[0].selectedType;
        if (i == 0 || isAnyStoryPageType(i) || i == 11 || i == 13) {
            return true;
        }
        return i == 14 && (profileGiftsContainer = this.giftsContainer) != null && profileGiftsContainer.canFilter();
    }

    public boolean isPinnedToTop() {
        return this.isPinnedToTop;
    }

    public boolean isSearchItemVisible() {
        return isSearchItemVisible(this.mediaPages[0].selectedType);
    }

    public boolean isSearchingStories() {
        return (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) ? false : true;
    }

    public boolean isSelf() {
        return false;
    }

    public boolean isStoriesView() {
        return false;
    }

    public boolean isSwipeBackEnabled() {
        if (canEditStories() && ((getClosestTab() == 8 || getClosestTab() == 13 || isStoryAlbumPageType(getClosestTab())) && isActionModeShown())) {
            return false;
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null && profileGiftsContainer.isReordering()) {
            return false;
        }
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
        return ((profileStoriesCollectionTabs != null && profileStoriesCollectionTabs.isReordering()) || this.photoVideoChangeColumnsAnimation || this.tabsAnimationInProgress) ? false : true;
    }

    public boolean isTabZoomable(int i) {
        return i == 0 || isAnyStoryPageType(i);
    }

    public int mediaPageTopMargin() {
        return 0;
    }

    public void onActionBarItemClick(View view, int i) {
        BotPreviewsEditContainer botPreviewsEditContainer;
        TLRPC.Chat chat;
        TLRPC.User user;
        TLRPC.EncryptedChat encryptedChatM;
        boolean z;
        TLRPC.User user2;
        int i2 = 6;
        int i3 = 13;
        boolean z2 = true;
        final int i4 = 0;
        if (i == 101) {
            if (isAnyStoryPageType(getSelectedTab()) || getSelectedTab() == 13) {
                if (this.selectedFiles[0] != null) {
                    if (isBot() && (botPreviewsEditContainer = this.botPreviewsContainer) != null && botPreviewsEditContainer.getCurrentList() != null) {
                        StoriesController.BotPreviewsList currentList = this.botPreviewsContainer.getCurrentList();
                        ArrayList arrayList = new ArrayList();
                        for (int i5 = 0; i5 < this.selectedFiles[0].size(); i5++) {
                            TL_stories.StoryItem storyItem = this.selectedFiles[0].valueAt(i5).storyItem;
                            if (storyItem != null) {
                                arrayList.add(storyItem.media);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
                        builder.setTitle(LocaleController.getString(arrayList.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle));
                        builder.setMessage(LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList.size(), new Object[0]));
                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertsCreator$$ExternalSyntheticLambda201(this, currentList, arrayList, i3));
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda26(i2));
                        AlertDialog alertDialogCreate = builder.create();
                        alertDialogCreate.show();
                        alertDialogCreate.redPositive();
                        return;
                    }
                    final ArrayList arrayList2 = new ArrayList();
                    for (int i6 = 0; i6 < this.selectedFiles[0].size(); i6++) {
                        TL_stories.StoryItem storyItem2 = this.selectedFiles[0].valueAt(i6).storyItem;
                        if (storyItem2 != null) {
                            arrayList2.add(storyItem2);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
                    builder2.setTitle(LocaleController.getString(arrayList2.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle));
                    builder2.setMessage(LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList2.size(), new Object[0]));
                    String string = LocaleController.getString(R.string.Delete);
                    final int i7 = z2 ? 1 : 0;
                    builder2.setPositiveButton(string, new AlertDialog.OnButtonClickListener(this) {
                        public final SharedMediaLayout f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(AlertDialog alertDialog, int i8) {
                            switch (i7) {
                                case 0:
                                    this.f$0.lambda$onActionBarItemClick$45(arrayList2, alertDialog, i8);
                                    break;
                                default:
                                    this.f$0.lambda$onActionBarItemClick$43(arrayList2, alertDialog, i8);
                                    break;
                            }
                        }
                    });
                    builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new ShareAlert$$ExternalSyntheticLambda26(7));
                    AlertDialog alertDialogCreate2 = builder2.create();
                    alertDialogCreate2.show();
                    alertDialogCreate2.redPositive();
                    return;
                }
                return;
            }
            if (getSelectedTab() != 11) {
                if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                    encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(this.profileActivity.getMessagesController(), this.dialog_id);
                    user = null;
                    chat = null;
                } else if (DialogObject.isUserDialog(this.dialog_id)) {
                    user = this.profileActivity.getMessagesController().getUser(Long.valueOf(this.dialog_id));
                    chat = null;
                    encryptedChatM = null;
                } else {
                    chat = this.profileActivity.getMessagesController().getChat(Long.valueOf(-this.dialog_id));
                    user = null;
                    encryptedChatM = null;
                }
                AlertsCreator.createDeleteMessagesAlert(this.profileActivity, user, chat, encryptedChatM, null, this.mergeDialogId, null, this.selectedFiles, null, 0, 0, null, new SharedMediaLayout$$ExternalSyntheticLambda55(this, 2), null, this.resourcesProvider);
                return;
            }
            SavedMessagesController savedMessagesController = this.profileActivity.getMessagesController().getSavedMessagesController();
            final ArrayList arrayList3 = new ArrayList();
            for (int i8 = 0; i8 < savedMessagesController.allDialogs.size(); i8++) {
                long j = savedMessagesController.allDialogs.get(i8).dialogId;
                if (this.savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j))) {
                    arrayList3.add(Long.valueOf(j));
                }
            }
            String string2 = "";
            if (arrayList3.isEmpty()) {
                z = false;
            } else {
                Long l = (Long) arrayList3.get(0);
                long jLongValue = l.longValue();
                z = jLongValue == this.profileActivity.getUserConfig().getClientUserId();
                if (jLongValue < 0) {
                    TLRPC.Chat chat2 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-jLongValue));
                    if (chat2 != null) {
                        string2 = chat2.title;
                    }
                } else if (jLongValue >= 0 && (user2 = this.profileActivity.getMessagesController().getUser(l)) != null) {
                    string2 = UserObject.isAnonymous(user2) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user2);
                }
            }
            AlertDialog alertDialogCreate3 = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setTitle(arrayList3.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, string2) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList3.size(), new Object[0])).setMessage(arrayList3.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, string2) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList3.size(), new Object[0])).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener(this) {
                public final SharedMediaLayout f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i9) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$onActionBarItemClick$45(arrayList3, alertDialog, i9);
                            break;
                        default:
                            this.f$0.lambda$onActionBarItemClick$43(arrayList3, alertDialog, i9);
                            break;
                    }
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            this.profileActivity.showDialog(alertDialogCreate3);
            TextView textView = (TextView) alertDialogCreate3.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                return;
            }
            return;
        }
        if (i == 100) {
            if (this.userInfo != null && this.profileActivity.getMessagesController().isUserNoForwards(this.userInfo)) {
                HintView hintView = this.fwdRestrictedHint;
                if (hintView != null) {
                    hintView.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            if (this.info != null) {
                TLRPC.Chat chat3 = this.profileActivity.getMessagesController().getChat(Long.valueOf(this.info.id));
                if (this.profileActivity.getMessagesController().isChatNoForwards(chat3)) {
                    HintView hintView2 = this.fwdRestrictedHint;
                    if (hintView2 != null) {
                        hintView2.setText((!ChatObject.isChannel(chat3) || chat3.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
                        this.fwdRestrictedHint.showForView(view, true);
                        return;
                    }
                    return;
                }
            }
            if (hasNoforwardsMessage()) {
                HintView hintView3 = this.fwdRestrictedHint;
                if (hintView3 != null) {
                    hintView3.setText(LocaleController.getString("ForwardsRestrictedInfoBot", R.string.ForwardsRestrictedInfoBot));
                    this.fwdRestrictedHint.showForView(view, true);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("canSelectTopics", true);
            bundle.putInt("dialogsType", 3);
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new EmojiView$$ExternalSyntheticLambda11(this, i2));
            this.profileActivity.presentFragment(dialogsActivity);
            return;
        }
        if (i == 102) {
            if (this.selectedFiles[1].size() + this.selectedFiles[0].size() != 1) {
                return;
            }
            SparseArray<MessageObject>[] sparseArrayArr = this.selectedFiles;
            MessageObject messageObjectValueAt = sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
            Bundle bundle2 = new Bundle();
            long dialogId = messageObjectValueAt.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (DialogObject.isUserDialog(dialogId)) {
                bundle2.putLong("user_id", dialogId);
            } else {
                TLRPC.Chat chat4 = this.profileActivity.getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat4 != null && chat4.migrated_to != null) {
                    bundle2.putLong("migrated_to", dialogId);
                    dialogId = -chat4.migrated_to.channel_id;
                }
                bundle2.putLong("chat_id", -dialogId);
            }
            bundle2.putInt("message_id", messageObjectValueAt.getId());
            bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
            ChatActivity chatActivity = new ChatActivity(bundle2);
            chatActivity.highlightMessageId = messageObjectValueAt.getId();
            long j2 = this.topicId;
            if (j2 != 0) {
                ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(dialogId, j2));
                bundle2.putInt("message_id", messageObjectValueAt.getId());
            }
            this.profileActivity.presentFragment(chatActivity, false);
            return;
        }
        if (i == 103 || i == 104) {
            if (getClosestTab() == 8) {
                StoriesAdapter storiesAdapter = this.storiesAdapter;
                if (storiesAdapter == null || storiesAdapter.storiesList == null) {
                    return;
                }
                ArrayList<Integer> arrayList4 = new ArrayList<>();
                for (int i9 = 0; i9 < this.selectedFiles[0].size(); i9++) {
                    arrayList4.add(Integer.valueOf(this.selectedFiles[0].valueAt(i9).getId()));
                }
                pinOnUnpinStories(arrayList4, i == 103);
                closeActionMode(false);
                return;
            }
            SavedMessagesController savedMessagesController2 = this.profileActivity.getMessagesController().getSavedMessagesController();
            ArrayList<Long> arrayList5 = new ArrayList<>();
            for (int i10 = 0; i10 < savedMessagesController2.allDialogs.size(); i10++) {
                long j3 = savedMessagesController2.allDialogs.get(i10).dialogId;
                if (this.savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j3))) {
                    arrayList5.add(Long.valueOf(j3));
                }
            }
            if (savedMessagesController2.updatePinned(arrayList5, i == 103, true)) {
                int i11 = 0;
                while (true) {
                    MediaPage[] mediaPageArr = this.mediaPages;
                    if (i11 >= mediaPageArr.length) {
                        break;
                    }
                    MediaPage mediaPage = mediaPageArr[i11];
                    if (mediaPage.selectedType == 11) {
                        mediaPage.layoutManager.scrollToPositionWithOffset(0, 0);
                        break;
                    }
                    i11++;
                }
            } else {
                this.profileActivity.showDialog(new LimitReachedBottomSheet(33, this.profileActivity, getContext(), this.profileActivity.getCurrentAccount(), null));
            }
            closeActionMode(true);
        }
    }

    public void onActionModeSelectedUpdate(SparseArray<MessageObject> sparseArray) {
    }

    public void onBottomButtonVisibilityChange() {
    }

    @Override
    public void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public void onButtonLongPress(DialogCell dialogCell) {
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        final int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
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
        }
    }

    public void onDestroy() {
        this.observersGroup.removeAllObservers();
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && storiesAdapter.storiesList != null) {
            storiesAdapter.destroy();
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 != null && storiesAdapter2.storiesList != null) {
            storiesAdapter2.destroy();
        }
        Iterator<StoryAlbumData> it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            StoriesAdapter storiesAdapter3 = it.next().adapter;
            if (storiesAdapter3.storiesList != null) {
                storiesAdapter3.destroy();
            }
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkTabsAnimationInProgress() || this.scrollSlidingTextTabStrip.isAnimatingIndicator() || onTouchEvent(motionEvent);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        int height = this.delegate.getListView() != null ? this.delegate.getListView().getHeight() : 0;
        if (height == 0) {
            height = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, height);
        int childCount = getChildCount();
        int i5 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt == null || childAt.getVisibility() == 8) {
                i3 = i;
            } else {
                if (childAt instanceof MediaPage) {
                    i3 = i;
                    measureChildWithMargins(childAt, i3, 0, View.MeasureSpec.makeMeasureSpec(height, 1073741824), 0);
                    MediaPage mediaPage = (MediaPage) childAt;
                    mediaPage.listView.setPadding(0, mediaPage.listView.topPadding, 0, mediaPage.listView.bottomPadding);
                } else {
                    i3 = i;
                    i4 = i2;
                    measureChildWithMargins(childAt, i3, 0, i4, 0);
                }
                i5++;
                i = i3;
                i2 = i4;
            }
            i4 = i2;
            i5++;
            i = i3;
            i2 = i4;
        }
    }

    public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    public void onPageMediaProgress(float f) {
        if (f != 1.0f || this.mediaPages[1].getVisibility() == 0) {
            if (this.animatingForward) {
                MediaPage mediaPage = this.mediaPages[0];
                mediaPage.setTranslationX((-f) * mediaPage.getMeasuredWidth());
                MediaPage[] mediaPageArr = this.mediaPages;
                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth() - (this.mediaPages[0].getMeasuredWidth() * f));
            } else {
                MediaPage mediaPage2 = this.mediaPages[0];
                mediaPage2.setTranslationX(mediaPage2.getMeasuredWidth() * f);
                MediaPage[] mediaPageArr2 = this.mediaPages;
                mediaPageArr2[1].setTranslationX((mediaPageArr2[0].getMeasuredWidth() * f) - this.mediaPages[0].getMeasuredWidth());
            }
            onTabProgress(getTabProgress());
            float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(f);
            this.optionsAlpha = photoVideoOptionsAlpha;
            this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
            if (this.searchItem == null || canShowSearchItem()) {
                this.searchAlpha = getSearchAlpha(f);
                updateSearchItemIconAnimated();
            } else {
                this.searchItem.setVisibility(isStoriesView() ? 8 : 4);
                this.searchAlpha = 0.0f;
            }
            updateOptionsSearch();
            if (f == 1.0f) {
                MediaPage[] mediaPageArr3 = this.mediaPages;
                MediaPage mediaPage3 = mediaPageArr3[0];
                mediaPageArr3[0] = mediaPageArr3[1];
                mediaPageArr3[1] = mediaPage3;
                mediaPage3.setVisibility(8);
                ActionBarMenuItem actionBarMenuItem = this.searchItem;
                if (actionBarMenuItem != null && this.searchItemState == 2) {
                    actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                }
                this.searchItemState = 0;
                startStopVisibleGifs();
            }
        }
    }

    public void onPause() {
        ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
        if (chatActivityContainer != null) {
            chatActivityContainer.onPause();
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
        ChatActivityContainer chatActivityContainer = this.savedMessagesContainer;
        if (chatActivityContainer != null) {
            chatActivityContainer.onResume();
        }
    }

    public void onSearchStateChanged(boolean z) {
    }

    public void onSelectedTabChanged() {
        boolean z = isStoriesView() || isArchivedOnlyStoriesView();
        if (this.archivedStoriesAdapter.poller != null) {
            this.archivedStoriesAdapter.poller.start(z && getClosestTab() == 9);
        }
        if (this.storiesAdapter.poller != null) {
            this.storiesAdapter.poller.start(z && getClosestTab() == 8);
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            StoriesAdapter storiesAdapter = storyAlbumData.adapter;
            if (storiesAdapter.storiesList != null) {
                storiesAdapter.poller.start(z && getClosestTab() == storyAlbumData.tabType);
            }
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            SearchTagsList searchTagsList = this.searchTagsList;
            actionBarMenuItem.setSearchFieldHint(LocaleController.getString((searchTagsList != null && searchTagsList.hasFilters() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        checkStoriesTabsPosition();
    }

    public void onTabProgress(float f) {
        onBottomButtonVisibilityChange();
    }

    public void onTabScroll(boolean z) {
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.disableScrolling || this.profileActivity.getParentLayout() == null || ((ActionBarLayout) this.profileActivity.getParentLayout()).checkTransitionAnimation() || checkTabsAnimationInProgress() || this.isInPinchToZoomTouchMode) {
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
        if (motionEvent != null && motionEvent.getAction() == 0 && !this.startedTracking && !this.maybeStartTracking && motionEvent.getY() >= AndroidUtilities.dp(90.0f)) {
            this.startedTrackingPointerId = motionEvent.getPointerId(0);
            this.maybeStartTracking = true;
            this.startedTrackingX = (int) motionEvent.getX();
            this.startedTrackingY = (int) motionEvent.getY();
            this.velocityTracker.clear();
        } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
            int x = (int) (motionEvent.getX() - this.startedTrackingX);
            int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
            if (this.startedTracking && (((z = this.animatingForward) && x > 0) || (!z && x < 0))) {
                if (!prepareForMoving(motionEvent, x < 0)) {
                    this.maybeStartTracking = true;
                    this.startedTracking = false;
                    onTabScroll(false);
                    this.mediaPages[0].setTranslationX(0.0f);
                    MediaPage[] mediaPageArr = this.mediaPages;
                    mediaPageArr[1].setTranslationX(this.animatingForward ? mediaPageArr[0].getMeasuredWidth() : -mediaPageArr[0].getMeasuredWidth());
                    selectTabWithId(this.mediaPages[1].selectedType, 0.0f);
                    onTabProgress(getTabProgress());
                }
            }
            if (!this.maybeStartTracking || this.startedTracking) {
                if (this.startedTracking) {
                    this.mediaPages[0].setTranslationX(x);
                    if (this.animatingForward) {
                        MediaPage[] mediaPageArr2 = this.mediaPages;
                        mediaPageArr2[1].setTranslationX(mediaPageArr2[0].getMeasuredWidth() + x);
                    } else {
                        MediaPage[] mediaPageArr3 = this.mediaPages;
                        mediaPageArr3[1].setTranslationX(x - mediaPageArr3[0].getMeasuredWidth());
                    }
                    float fAbs = Math.abs(x) / this.mediaPages[0].getMeasuredWidth();
                    if (canShowSearchItem()) {
                        this.searchAlpha = getSearchAlpha(fAbs);
                        updateSearchItemIcon(fAbs);
                        float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(fAbs);
                        this.optionsAlpha = photoVideoOptionsAlpha;
                        this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
                    } else {
                        this.searchAlpha = 0.0f;
                    }
                    updateOptionsSearch();
                    selectTabWithId(this.mediaPages[1].selectedType, fAbs);
                    onTabProgress(getTabProgress());
                    onSelectedTabChanged();
                }
            } else if (Math.abs(x) >= AndroidUtilities.getPixelsInCM(0.3f, true) && Math.abs(x) > iAbs) {
                prepareForMoving(motionEvent, x < 0);
            }
        } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
            stopScroll(motionEvent);
        }
        return this.startedTracking;
    }

    public void openAddStoriesToAlbumSheet(BaseFragment baseFragment, long j, int i) {
        new SelectStoriesBottomSheet(baseFragment, j, this.mediaColumnsCount[1], new BulletinFactory$$ExternalSyntheticLambda10(this, j, i)).show();
    }

    public void openDeleteStoriesAlbumAlert(BaseFragment baseFragment, long j, int i) {
        StoriesController.StoryAlbum storyAlbumFindById;
        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, false);
        String str = (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(i)) == null) ? null : storyAlbumFindById.title;
        int i2 = R.string.Delete;
        AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(i2), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, str)), LocaleController.getString(i2), true, new ChatMessageCell$$ExternalSyntheticLambda7(this, j, i, 6));
    }

    @Override
    public void openHiddenStories() {
    }

    public void openRenameStoriesAlbumAlert(BaseFragment baseFragment, long j, int i) {
        StoriesController.StoryAlbum storyAlbumFindById;
        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, false);
        AlertsCreator.createStoriesAlbumEnterNameForRename(baseFragment.getContext(), baseFragment, (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(i)) == null) ? null : storyAlbumFindById.title, baseFragment.getResourceProvider(), new VoIPService$$ExternalSyntheticLambda80(this, j, i));
    }

    @Override
    public void openStory(DialogCell dialogCell, Runnable runnable) {
        BaseFragment baseFragment = this.profileActivity;
        if (baseFragment != null && baseFragment.getMessagesController().getStoriesController().hasStories(dialogCell.getDialogId())) {
            StoryViewer orCreateStoryViewer = this.profileActivity.getOrCreateStoryViewer();
            if (runnable != null) {
                orCreateStoryViewer.doOnAnimationReadyRunnables.add(runnable);
            } else {
                orCreateStoryViewer.getClass();
            }
            StoryViewer orCreateStoryViewer2 = this.profileActivity.getOrCreateStoryViewer();
            Context context = this.profileActivity.getContext();
            long dialogId = dialogCell.getDialogId();
            int iDp = 0;
            StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider((RecyclerListView) dialogCell.getParent(), false);
            BaseFragment baseFragment2 = this.profileActivity;
            if ((baseFragment2 instanceof ProfileActivity) && ((ProfileActivity) baseFragment2).myProfile) {
                iDp = AndroidUtilities.dp(68.0f);
            }
            storiesListPlaceProvider.addBottomClip += iDp;
            orCreateStoryViewer2.open(context, dialogId, storiesListPlaceProvider);
        }
    }

    public void openStoryAlbumPage(int i, boolean z) {
        openStoryTabIdPage(storyAlbums_getByAlbumId(i).tabType, z);
    }

    public int overrideColumnsCount() {
        return -1;
    }

    public int processColor(int i) {
        return i;
    }

    public void saveAndStopAlbumsReorder() {
        MediaPage mediaPage;
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(storyAlbums_getAlbumIdByTabType(getClosestTab()));
        if (storyAlbumDataStoryAlbums_getByAlbumId == null || (mediaPage = getMediaPage(storyAlbumDataStoryAlbums_getByAlbumId.tabType)) == null) {
            return;
        }
        this.storiesContainer.resetReordering();
        InternalListView internalListView = mediaPage.listView;
        for (int i = 0; i < internalListView.getChildCount(); i++) {
            View childAt = internalListView.getChildAt(i);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(false, true);
            }
        }
        StoriesAdapter storiesAdapter = storyAlbumDataStoryAlbums_getByAlbumId.adapter;
        if (storiesAdapter != null) {
            storiesAdapter.setInAlbumStoriesReorder(false);
        }
    }

    public void scrollToPage(int i) {
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner;
        if (this.disableScrolling || (scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip) == null) {
            return;
        }
        scrollSlidingTextTabStripInner.scrollTo(i);
    }

    public void sendTabsOrder() {
        if (this.profileActivity == null || this.scrollSlidingTextTabStrip == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<Integer> tabIds = this.scrollSlidingTextTabStrip.getTabIds();
        int size = tabIds.size();
        int i = 0;
        while (i < size) {
            Integer num = tabIds.get(i);
            i++;
            TLRPC.ProfileTab tab = getTab(num.intValue(), this.info instanceof TLRPC.TL_channelFull);
            if (tab != null) {
                arrayList.add(tab);
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        TLRPC.ChatFull chatFull2 = this.info;
        boolean z = chatFull2 != null && chatFull2.stories_pinned_available;
        this.info = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.mergeDialogId == 0) {
                this.mergeDialogId = -j;
                int i = 0;
                while (true) {
                    SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                    if (i >= sharedMediaDataArr.length) {
                        break;
                    }
                    if (sharedMediaDataArr[i].messagesDict[1].size() == 0) {
                        SharedMediaData sharedMediaData = this.sharedMediaData[i];
                        sharedMediaData.max_id[1] = this.info.migrated_from_max_id;
                        sharedMediaData.endReached[1] = false;
                    }
                    i++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.info;
        if (chatFull3 == null || z == chatFull3.stories_pinned_available) {
            return;
        }
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = this.scrollSlidingTextTabStrip;
        if (scrollSlidingTextTabStripInner != null) {
            scrollSlidingTextTabStripInner.setInitialTabId(isArchivedOnlyStoriesView() ? 9 : 8);
        }
        updateTabs(true);
        switchToCurrentSelectedMode(false);
    }

    public void setChatUsers(ArrayList<Integer> arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 < mediaPageArr.length) {
                MediaPage mediaPage = mediaPageArr[i2];
                if (mediaPage.selectedType == 7 && mediaPage.listView.getAdapter() != null && this.mediaPages[i2].listView.getAdapter().getItemCount() != 0 && this.profileActivity.getMessagesController().getStoriesController().loadingDialogsStories.size() > 0) {
                    return;
                } else {
                    i2++;
                }
            } else {
                if (this.topicId == 0) {
                    this.chatUsersAdapter.chatInfo = chatFull;
                    this.chatUsersAdapter.sortedUsers = arrayList;
                }
                updateTabs(true);
                while (true) {
                    MediaPage[] mediaPageArr2 = this.mediaPages;
                    if (i >= mediaPageArr2.length) {
                        return;
                    }
                    MediaPage mediaPage2 = mediaPageArr2[i];
                    if (mediaPage2.selectedType == 7 && mediaPage2.listView.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(this.mediaPages[i].listView);
                    }
                    i++;
                }
            }
        }
    }

    public void setCommonGroupsCount(int i) {
        if (this.topicId == 0) {
            this.hasMedia[6] = i;
        }
        updateTabs(true);
        checkCurrentTabValid();
    }

    public void setForwardRestrictedHint(HintView hintView) {
        this.fwdRestrictedHint = hintView;
    }

    public void setMergeDialogId(long j) {
        this.mergeDialogId = j;
    }

    public void setNewMediaCounts(int[] iArr) {
        for (int i = 0; i <= 6 && this.hasMedia[i] < 0; i++) {
        }
        System.arraycopy(iArr, 0, this.hasMedia, 0, 6);
        updateTabs(true);
        checkCurrentTabValid();
        if (this.hasMedia[0] >= 0) {
            loadFastScrollData(false);
        }
    }

    @Override
    public void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i5 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i5].setTranslationY(this.topPadding - this.lastMeasuredTopPadding);
            i5++;
        }
        if (this.topPanelLayout != null) {
            checkUi_topPanelLayoutY();
        } else {
            FragmentContextView fragmentContextView = this.fragmentContextView;
            if (fragmentContextView != null) {
                fragmentContextView.setTranslationY(AndroidUtilities.dp(48.0f) + i2);
            }
        }
        this.additionalFloatingTranslation = i2;
        ChatActionCell chatActionCell = this.floatingDateView;
        chatActionCell.setTranslationY((chatActionCell.getTag() == null ? -AndroidUtilities.dp(48.0f) : 0) + this.additionalFloatingTranslation);
    }

    public void setPagesPaddingBottom(int i) {
        if (this.pagesPaddingBottom != i) {
            this.pagesPaddingBottom = i;
            MediaPage[] mediaPageArr = this.mediaPages;
            if (mediaPageArr != null) {
                for (MediaPage mediaPage : mediaPageArr) {
                    if (mediaPage != null) {
                        InternalListView internalListView = mediaPage.listView;
                        int paddingLeft = mediaPage.listView.getPaddingLeft();
                        int i2 = mediaPage.listView.topPadding;
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        InternalListView internalListView2 = mediaPage.listView;
                        int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                        internalListView2.hintPaddingBottom = pagePaddingBottom;
                        internalListView.setPadding(paddingLeft, i2, paddingRight, pagePaddingBottom);
                    }
                }
            }
        }
    }

    public void setPinnedToTop(boolean z) {
        if (this.isPinnedToTop == z) {
            return;
        }
        this.isPinnedToTop = z;
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            updateFastScrollVisibility(mediaPageArr[i], true);
            i++;
        }
    }

    public void setStoriesFilter(boolean z, boolean z2) {
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null && (storiesList2 = storiesAdapter.storiesList) != null) {
            storiesList2.showPhotos = z;
            storiesList2.showVideos = z2;
            storiesList2.fill(true);
        }
        StoriesAdapter storiesAdapter2 = this.archivedStoriesAdapter;
        if (storiesAdapter2 == null || (storiesList = storiesAdapter2.storiesList) == null) {
            return;
        }
        storiesList.showPhotos = z;
        storiesList.showVideos = z2;
        storiesList.fill(true);
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        TLRPC.UserFull userFull2 = this.userInfo;
        boolean z = userFull2 != null && userFull2.stories_pinned_available;
        this.userInfo = userFull;
        updateTabs(true);
        if (userFull == null || z == userFull.stories_pinned_available) {
            return;
        }
        scrollToPage(8);
    }

    public void setVisibleHeight(int i) {
        this.lastVisibleHeight = i;
        for (int i2 = 0; i2 < this.mediaPages.length; i2++) {
            float f = (-(getMeasuredHeight() - Math.max(i, AndroidUtilities.dp(this.mediaPages[i2].selectedType == 8 ? 280.0f : 120.0f)))) / 2.0f;
            this.mediaPages[i2].emptyView.setTranslationY(f);
            this.mediaPages[i2].progressView.setTranslationY(-f);
        }
        BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
        if (botPreviewsEditContainer != null) {
            botPreviewsEditContainer.setVisibleHeight(i);
        }
        ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
        if (profileGiftsContainer != null) {
            profileGiftsContainer.setVisibleHeight(i);
        }
    }

    public void showActionMode(final boolean z) {
        if (this.isActionModeShowed == z) {
            return;
        }
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
        animatorSet2.playTogether(ObjectAnimator.ofFloat(this.actionModeLayout, (Property<LinearLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.actionModeAnimation.setDuration(180L);
        this.actionModeAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                SharedMediaLayout.this.actionModeAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (SharedMediaLayout.this.actionModeAnimation == null) {
                    return;
                }
                SharedMediaLayout.this.actionModeAnimation = null;
                if (z) {
                    return;
                }
                SharedMediaLayout.this.actionModeLayout.setVisibility(4);
            }
        });
        this.actionModeAnimation.start();
        if (z) {
            updateStoriesPinButton();
        }
    }

    @Override
    public void showChatPreview(DialogCell dialogCell) {
    }

    public void showMediaCalendar(int i, boolean z) {
        int i2;
        MediaPage mediaPage;
        if (z && getY() != 0.0f && this.viewType == 1) {
            return;
        }
        if (z && isAnyStoryPageType(i) && getStoriesCount(i) <= 0) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.dialog_id);
        bundle.putLong("topic_id", this.topicId);
        if (!z || (mediaPage = getMediaPage(0)) == null) {
            i2 = 0;
        } else {
            ArrayList<Period> arrayList = this.sharedMediaData[0].fastScrollPeriods;
            int iFindFirstVisibleItemPosition = mediaPage.layoutManager.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition >= 0) {
                Period period = null;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (iFindFirstVisibleItemPosition <= arrayList.get(i3).startOffset) {
                            period = arrayList.get(i3);
                            break;
                        }
                    }
                    if (period == null) {
                        period = (Period) Fragment$$ExternalSyntheticOutline0.m(1, (ArrayList) arrayList);
                    }
                }
                if (period != null) {
                    i2 = period.date;
                } else {
                    i2 = 0;
                }
            } else {
                i2 = 0;
            }
        }
        if (i == 9) {
            bundle.putInt("type", 3);
        } else if (i == 8) {
            bundle.putInt("type", 2);
        } else {
            bundle.putInt("type", 1);
        }
        CalendarActivity calendarActivity = new CalendarActivity(bundle, this.sharedMediaData[0].filterType, i2);
        calendarActivity.setCallback(new CalendarActivity.Callback() {
            @Override
            public void onDateSelected(int i4, int i5) {
                int i6 = -1;
                for (int i7 = 0; i7 < SharedMediaLayout.this.sharedMediaData[0].messages.size(); i7++) {
                    if (SharedMediaLayout.this.sharedMediaData[0].messages.get(i7).getId() == i4) {
                        i6 = i7;
                    }
                }
                MediaPage mediaPage2 = SharedMediaLayout.this.getMediaPage(0);
                if (i6 < 0 || mediaPage2 == null) {
                    SharedMediaLayout.this.jumpToDate(0, i4, i5, true);
                } else {
                    mediaPage2.layoutManager.scrollToPositionWithOffset(i6, 0);
                }
                if (mediaPage2 != null) {
                    mediaPage2.highlightMessageId = i4;
                    mediaPage2.highlightAnimation = false;
                }
            }
        });
        this.profileActivity.presentFragment(calendarActivity);
    }

    public void showPremiumFloodWaitBulletin(boolean z) {
        BaseFragment baseFragment = this.profileActivity;
        if (baseFragment == null) {
            return;
        }
        int currentAccount = baseFragment.getCurrentAccount();
        SpannableString spannableString = new SpannableString(Double.toString(((double) Math.round((z ? MessagesController.getInstance(currentAccount).uploadPremiumSpeedupUpload : MessagesController.getInstance(currentAccount).uploadPremiumSpeedupDownload) * 10.0f)) / 10.0d).replaceAll("\\.0$", ""));
        spannableString.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString.length(), 33);
        if (this.profileActivity.hasStoryViewer()) {
            return;
        }
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.speed_limit, LocaleController.getString(z ? R.string.UploadSpeedLimited : R.string.DownloadSpeedLimited), AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.UploadSpeedLimitedMessage : R.string.DownloadSpeedLimitedMessage), new SharedMediaLayout$$ExternalSyntheticLambda33(this, 0, z)), spannableString)).setDuration(8000).show(true);
    }

    public void lambda$onItemLongClick$58(int i) {
        MediaPage mediaPage;
        if (storyAlbums_getAlbumIdByTabType(getClosestTab()) != i) {
            ProfileStoriesCollectionTabs profileStoriesCollectionTabs = this.storiesContainer;
            if (profileStoriesCollectionTabs != null) {
                profileStoriesCollectionTabs.lambda$setInitialTabId$2(i);
                return;
            }
            return;
        }
        this.storiesContainer.setReorderingAlbums(true);
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(i);
        if (storyAlbumDataStoryAlbums_getByAlbumId == null || (mediaPage = getMediaPage(storyAlbumDataStoryAlbums_getByAlbumId.tabType)) == null) {
            return;
        }
        InternalListView internalListView = mediaPage.listView;
        for (int i2 = 0; i2 < internalListView.getChildCount(); i2++) {
            View childAt = internalListView.getChildAt(i2);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(true, true);
            }
        }
        StoriesAdapter storiesAdapter = storyAlbumDataStoryAlbums_getByAlbumId.adapter;
        if (storiesAdapter != null) {
            storiesAdapter.setInAlbumStoriesReorder(true);
        }
        updateOptionsSearch(true);
    }

    public int storyAlbums_getAlbumIdByTabType(int i) {
        StoryAlbumData storyAlbumDataStoryAlbums_getByTabType = storyAlbums_getByTabType(i);
        if (storyAlbumDataStoryAlbums_getByTabType == null) {
            return -1;
        }
        return storyAlbumDataStoryAlbums_getByTabType.albumId;
    }

    public void updateAdapters() {
        SharedPhotoVideoAdapter sharedPhotoVideoAdapter = this.photoVideoAdapter;
        if (sharedPhotoVideoAdapter != null) {
            sharedPhotoVideoAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter2 = this.voiceAdapter;
        if (sharedDocumentsAdapter2 != null) {
            sharedDocumentsAdapter2.notifyDataSetChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter3 = this.audioAdapter;
        if (sharedDocumentsAdapter3 != null) {
            sharedDocumentsAdapter3.notifyDataSetChanged();
        }
        PollAdapter pollAdapter = this.pollAdapter;
        if (pollAdapter != null) {
            pollAdapter.notifyDataSetChanged();
        }
        GifAdapter gifAdapter = this.gifAdapter;
        if (gifAdapter != null) {
            gifAdapter.notifyDataSetChanged();
        }
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        if (storiesAdapter != null) {
            storiesAdapter.notifyDataSetChanged();
        }
        Iterator<StoryAlbumData> it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            it.next().adapter.notifyDataSetChanged();
        }
    }

    public void updateFastScrollVisibility(MediaPage mediaPage, boolean z) {
        Integer num = 1;
        boolean z2 = mediaPage.fastScrollEnabled && this.isPinnedToTop;
        RecyclerListView.FastScroll fastScroll = mediaPage.listView.getFastScroll();
        ObjectAnimator objectAnimator = mediaPage.fastScrollAnimator;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            mediaPage.fastScrollAnimator.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setVisibility(z2 ? 0 : 8);
            fastScroll.setTag(z2 ? 1 : null);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z2 && fastScroll.getTag() == null) {
            fastScroll.animate().setListener(null).cancel();
            if (fastScroll.getVisibility() != 0) {
                fastScroll.setVisibility(0);
                fastScroll.setAlpha(0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fastScroll, (Property<RecyclerListView.FastScroll, Float>) property, fastScroll.getAlpha(), 1.0f);
            mediaPage.fastScrollAnimator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L).start();
            fastScroll.setTag(num);
            return;
        }
        if (z2 || fastScroll.getTag() == null) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(fastScroll, (Property<RecyclerListView.FastScroll, Float>) property, fastScroll.getAlpha(), 0.0f);
        objectAnimatorOfFloat2.addListener(new HideViewAfterAnimation(fastScroll));
        mediaPage.fastScrollAnimator = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public void updateSearchItemIcon(float f) {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[1];
        float f2 = 0.0f;
        if (mediaPage != null && mediaPage.selectedType == 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = mediaPageArr[0];
        if (mediaPage2 != null && mediaPage2.selectedType == 11) {
            f2 += 1.0f - f;
        }
        actionBarMenuItem.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        this.searchItemIcon.setScaleX(f3);
        this.searchItemIcon.setScaleY(f3);
        this.searchItemIcon.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public void updateSearchItemIconAnimated() {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage mediaPage = this.mediaPages[1];
        boolean z = mediaPage != null && mediaPage.selectedType == 11;
        if (z) {
            actionBarMenuItem.setVisibility(0);
        }
        this.searchItemIcon.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new SharedMediaLayout$$ExternalSyntheticLambda33(this, 1, z)).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    public void updateStoriesList(StoriesController.StoriesList storiesList) {
        this.searchStoriesList = storiesList;
        StoriesAdapter storiesAdapter = this.storiesAdapter;
        storiesAdapter.storiesList = storiesList;
        storiesAdapter.notifyDataSetChanged();
        StoriesAdapter storiesAdapter2 = this.animationSupportingStoriesAdapter;
        storiesAdapter2.storiesList = storiesList;
        storiesAdapter2.notifyDataSetChanged();
    }

    public void updateTabs(boolean z) {
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        int i;
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        int selectedTab;
        SparseArray<View> sparseArrayRemoveTabs;
        ArrayList arrayList;
        int i4;
        int i5;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        int i6;
        int size;
        int i7;
        Pair pair;
        int tabId;
        int i8;
        boolean z5;
        int i9;
        int[] iArr;
        int i10;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        BaseFragment baseFragment;
        SharedMediaPreloader sharedMediaPreloader;
        if (this.scrollSlidingTextTabStrip == null) {
            return;
        }
        boolean z16 = !this.delegate.isFragmentOpened() ? false : z;
        boolean z17 = (this.savedMessagesContainer == null || (sharedMediaPreloader = this.sharedMediaPreloader) == null || !sharedMediaPreloader.hasSavedMessages) ? false : true;
        TLRPC.User user = (this.dialog_id <= 0 || (baseFragment = this.profileActivity) == null) ? null : baseFragment.getMessagesController().getUser(Long.valueOf(this.dialog_id));
        boolean z18 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z19 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.userInfo) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z18) ? false : true;
        boolean z20 = (DialogObject.isUserDialog(this.dialog_id) || DialogObject.isChatDialog(this.dialog_id)) && !DialogObject.isEncryptedDialog(this.dialog_id) && (((userFull = this.userInfo) != null && userFull.stories_pinned_available) || (((chatFull = this.info) != null && chatFull.stories_pinned_available) || isStoriesView())) && includeStories();
        boolean z21 = this.giftsContainer != null && (((userFull3 = this.userInfo) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.info) != null && chatFull3.stargifts_count > 0));
        TLRPC.ChatFull chatFull4 = this.info;
        if (chatFull4 != null) {
            profileTab = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.userInfo;
            profileTab = userFull5 != null ? userFull5.main_tab : null;
        }
        int i11 = this.wasReordering != this.scrollSlidingTextTabStrip.isReordering() ? 1 : 0;
        if ((z20 || z19) != this.scrollSlidingTextTabStrip.hasTab(8)) {
            i11++;
        }
        if (z18 != this.scrollSlidingTextTabStrip.hasTab(13)) {
            i11++;
        }
        if (isSearchingStories() != this.scrollSlidingTextTabStrip.hasTab(8)) {
            i11++;
        }
        if (z21 == this.scrollSlidingTextTabStrip.hasTab(14)) {
            ProfileGiftsContainer profileGiftsContainer = this.giftsContainer;
            if (profileGiftsContainer == null || !z21) {
                i = 8;
            } else {
                i = 8;
                if (this.giftsLastHash != profileGiftsContainer.getLastEmojisHash()) {
                }
            }
            if (isStoriesView()) {
                z2 = z16;
                i2 = 1;
                i3 = 7;
                z3 = false;
                z4 = false;
            } else {
                if (this.chatUsersAdapter.chatInfo == null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6 == this.scrollSlidingTextTabStrip.hasTab(7)) {
                    i11++;
                }
                if (this.hasMedia[0] <= 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7 == this.scrollSlidingTextTabStrip.hasTab(0)) {
                    i11++;
                }
                if (this.hasMedia[1] <= 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8 == this.scrollSlidingTextTabStrip.hasTab(1)) {
                    i11++;
                }
                z2 = z16;
                if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                    if (this.hasMedia[4] <= 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 == this.scrollSlidingTextTabStrip.hasTab(4)) {
                        i11++;
                    }
                } else {
                    if (this.hasMedia[3] <= 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13 == this.scrollSlidingTextTabStrip.hasTab(3)) {
                        i11++;
                    }
                    if (this.hasMedia[4] <= 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14 == this.scrollSlidingTextTabStrip.hasTab(4)) {
                        i11++;
                    }
                    if (this.hasMedia[i] <= 0) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (z15 == this.scrollSlidingTextTabStrip.hasTab(15)) {
                        i11++;
                    }
                }
                if (this.hasMedia[2] <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i2 = 1;
                if (z10 == this.scrollSlidingTextTabStrip.hasTab(2)) {
                    i11++;
                }
                if (this.hasMedia[5] <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 == this.scrollSlidingTextTabStrip.hasTab(5)) {
                    i11++;
                }
                if (this.hasMedia[6] <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 == this.scrollSlidingTextTabStrip.hasTab(6)) {
                    i11++;
                }
                z3 = !this.channelRecommendationsAdapter.chats.isEmpty();
                if (z3 != this.scrollSlidingTextTabStrip.hasTab(10)) {
                    i11++;
                }
                if (includeSavedDialogs() || this.profileActivity.getMessagesController().getSavedMessagesController().unsupported || !this.profileActivity.getMessagesController().getSavedMessagesController().hasDialogs()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                i3 = 7;
                if (z4 != this.scrollSlidingTextTabStrip.hasTab(11)) {
                    i11++;
                }
                if (z17 != this.scrollSlidingTextTabStrip.hasTab(12)) {
                    i11++;
                }
            }
            if (i11 > 0) {
                if (z2) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new Visibility() {
                        @Override
                        public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            return animatorSet;
                        }

                        @Override
                        public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                            animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                            return animatorSet;
                        }
                    });
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(this.scrollSlidingTextTabStrip.getTabsContainer(), transitionSet);
                    this.scrollSlidingTextTabStrip.recordIndicatorParams();
                }
                sparseArrayRemoveTabs = this.scrollSlidingTextTabStrip.removeTabs();
                if (i11 > 3) {
                    sparseArrayRemoveTabs = null;
                }
                arrayList = new ArrayList();
                if (isSearchingStories()) {
                    i4 = 15;
                    i5 = 4;
                    arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileStories)));
                    this.scrollSlidingTextTabStrip.animationDuration = 420L;
                } else {
                    i4 = 15;
                    i5 = 4;
                }
                if (z19) {
                    arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileBotPreviewTab)));
                } else if ((DialogObject.isUserDialog(this.dialog_id) || DialogObject.isChatDialog(this.dialog_id)) && !DialogObject.isEncryptedDialog(this.dialog_id) && ((((userFull2 = this.userInfo) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.info) != null && chatFull2.stories_pinned_available) || isStoriesView())) && includeStories())) {
                    if (isArchivedOnlyStoriesView()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        this.scrollSlidingTextTabStrip.animationDuration = 420L;
                    } else {
                        arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileStories)));
                        if (isStoriesView()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        }
                    }
                }
                if (z21) {
                    String string = LocaleController.getString(R.string.ProfileGifts);
                    CharSequence lastEmojis = this.giftsContainer.getLastEmojis(null);
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    charSequenceArr[0] = string;
                    charSequenceArr[i2] = lastEmojis;
                    arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr)));
                    this.giftsLastHash = this.giftsContainer.getLastEmojisHash();
                }
                if (z18) {
                    arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                }
                if (!isStoriesView()) {
                    if (z4) {
                        arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                    }
                    if (this.chatUsersAdapter.chatInfo != null) {
                        arrayList.add(new Pair(Integer.valueOf(i3), LocaleController.getString(R.string.GroupMembers)));
                    }
                    iArr = this.hasMedia;
                    if (iArr[0] > 0) {
                        if (iArr[i2] != 0 && iArr[2] == 0 && iArr[3] == 0 && iArr[i5] == 0 && iArr[5] == 0 && iArr[6] == 0 && this.chatUsersAdapter.chatInfo == null) {
                            arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTabFull2)));
                        } else {
                            arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                        }
                    }
                    if (z17) {
                        arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                        MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                    }
                    if (this.hasMedia[i2] > 0) {
                        arrayList.add(new Pair(Integer.valueOf(i2), LocaleController.getString(R.string.SharedFilesTab2)));
                    }
                    if (!DialogObject.isEncryptedDialog(this.dialog_id)) {
                        if (this.hasMedia[3] > 0) {
                            arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                        }
                        if (this.hasMedia[i5] > 0) {
                            arrayList.add(new Pair(Integer.valueOf(i5), LocaleController.getString(R.string.SharedMusicTab2)));
                        }
                        if (this.hasMedia[i] > 0) {
                            arrayList.add(new Pair(Integer.valueOf(i4), LocaleController.getString(R.string.SharedPollTab)));
                        }
                    } else if (this.hasMedia[i5] > 0) {
                        arrayList.add(new Pair(Integer.valueOf(i5), LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (this.hasMedia[2] > 0) {
                        arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                    }
                    if (this.hasMedia[5] > 0) {
                        arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                    }
                    if (this.hasMedia[6] > 0) {
                        arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                    }
                    if (z3) {
                        if (this.dialog_id > 0) {
                            i10 = R.string.SimilarBotsTab;
                        } else {
                            i10 = R.string.SimilarChannelsTab;
                        }
                        arrayList.add(new Pair(10, LocaleController.getString(i10)));
                    }
                }
                if (this.scrollSlidingTextTabStrip.isReordering()) {
                    z5 = this.info instanceof TLRPC.TL_channelFull;
                    for (i9 = 0; i9 < 15; i9++) {
                        if (getTab(i9, z5) == null && !lambda$updateTabs$49(arrayList, Integer.valueOf(i9)).booleanValue()) {
                            arrayList.add(new Pair(Integer.valueOf(i9), getTabName(i9)));
                        }
                    }
                }
                if (profileTab != null) {
                    tabId = getTabId(profileTab);
                    i8 = 0;
                    while (true) {
                        if (i8 < arrayList.size()) {
                            i8 = -1;
                            break;
                        } else if (((Integer) ((Pair) arrayList.get(i8)).first).intValue() == tabId) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    if (i8 >= 0) {
                        Pair pair2 = (Pair) arrayList.remove(i8);
                        i6 = 0;
                        arrayList.add(0, pair2);
                    } else {
                        i6 = 0;
                    }
                } else {
                    i6 = 0;
                }
                if (!arrayList.isEmpty()) {
                    this.firstTab = ((Integer) ((Pair) arrayList.get(i6)).first).intValue();
                }
                size = arrayList.size();
                i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    pair = (Pair) obj;
                    if (!this.scrollSlidingTextTabStrip.hasTab(((Integer) pair.first).intValue())) {
                        this.scrollSlidingTextTabStrip.addTextTab(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayRemoveTabs);
                    }
                }
            }
            selectedTab = getSelectedTab();
            if (selectedTab >= 0) {
                this.mediaPages[0].selectedType = selectedTab;
            }
            this.wasReordering = this.scrollSlidingTextTabStrip.isReordering();
            this.scrollSlidingTextTabStrip.finishAddingTabs();
            onSelectedTabChanged();
            checkStoriesTabsPosition();
        }
        i = 8;
        i11++;
        if (isStoriesView()) {
            if (this.chatUsersAdapter.chatInfo == null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6 == this.scrollSlidingTextTabStrip.hasTab(7)) {
                i11++;
            }
            if (this.hasMedia[0] <= 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7 == this.scrollSlidingTextTabStrip.hasTab(0)) {
                i11++;
            }
            if (this.hasMedia[1] <= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8 == this.scrollSlidingTextTabStrip.hasTab(1)) {
                i11++;
            }
            z2 = z16;
            if (DialogObject.isEncryptedDialog(this.dialog_id)) {
                if (this.hasMedia[3] <= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 == this.scrollSlidingTextTabStrip.hasTab(3)) {
                    i11++;
                }
                if (this.hasMedia[4] <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z14 == this.scrollSlidingTextTabStrip.hasTab(4)) {
                    i11++;
                }
                if (this.hasMedia[i] <= 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (z15 == this.scrollSlidingTextTabStrip.hasTab(15)) {
                    i11++;
                }
            } else {
                if (this.hasMedia[4] <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9 == this.scrollSlidingTextTabStrip.hasTab(4)) {
                    i11++;
                }
            }
            if (this.hasMedia[2] <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i2 = 1;
            if (z10 == this.scrollSlidingTextTabStrip.hasTab(2)) {
                i11++;
            }
            if (this.hasMedia[5] <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.scrollSlidingTextTabStrip.hasTab(5)) {
                i11++;
            }
            if (this.hasMedia[6] <= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 == this.scrollSlidingTextTabStrip.hasTab(6)) {
                i11++;
            }
            z3 = !this.channelRecommendationsAdapter.chats.isEmpty();
            if (z3 != this.scrollSlidingTextTabStrip.hasTab(10)) {
                i11++;
            }
            if (includeSavedDialogs()) {
                z4 = false;
            } else {
                z4 = false;
            }
            i3 = 7;
            if (z4 != this.scrollSlidingTextTabStrip.hasTab(11)) {
                i11++;
            }
            if (z17 != this.scrollSlidingTextTabStrip.hasTab(12)) {
                i11++;
            }
        } else {
            z2 = z16;
            i2 = 1;
            i3 = 7;
            z3 = false;
            z4 = false;
        }
        if (i11 > 0) {
            if (z2) {
                TransitionSet transitionSet2 = new TransitionSet();
                transitionSet2.setOrdering(0);
                transitionSet2.addTransition(new Visibility() {
                    @Override
                    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.5f, 1.0f));
                        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        return animatorSet;
                    }

                    @Override
                    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), 0.0f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_X, view.getScaleX(), 0.5f), ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, view.getScaleX(), 0.5f));
                        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
                        return animatorSet;
                    }
                });
                transitionSet2.setDuration(200L);
                TransitionManager.beginDelayedTransition(this.scrollSlidingTextTabStrip.getTabsContainer(), transitionSet2);
                this.scrollSlidingTextTabStrip.recordIndicatorParams();
            }
            sparseArrayRemoveTabs = this.scrollSlidingTextTabStrip.removeTabs();
            if (i11 > 3) {
                sparseArrayRemoveTabs = null;
            }
            arrayList = new ArrayList();
            if (isSearchingStories()) {
                i4 = 15;
                i5 = 4;
                arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileStories)));
                this.scrollSlidingTextTabStrip.animationDuration = 420L;
            } else {
                i4 = 15;
                i5 = 4;
            }
            if (z19) {
                arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileBotPreviewTab)));
            } else if (DialogObject.isUserDialog(this.dialog_id)) {
                if (isArchivedOnlyStoriesView()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    this.scrollSlidingTextTabStrip.animationDuration = 420L;
                } else {
                    arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileStories)));
                    if (isStoriesView()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    }
                }
            } else if (isArchivedOnlyStoriesView()) {
                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                this.scrollSlidingTextTabStrip.animationDuration = 420L;
            } else {
                arrayList.add(new Pair(Integer.valueOf(i), LocaleController.getString(R.string.ProfileStories)));
                if (isStoriesView()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                }
            }
            if (z21) {
                String string2 = LocaleController.getString(R.string.ProfileGifts);
                CharSequence lastEmojis2 = this.giftsContainer.getLastEmojis(null);
                CharSequence[] charSequenceArr2 = new CharSequence[2];
                charSequenceArr2[0] = string2;
                charSequenceArr2[i2] = lastEmojis2;
                arrayList.add(new Pair(14, TextUtils.concat(charSequenceArr2)));
                this.giftsLastHash = this.giftsContainer.getLastEmojisHash();
            }
            if (z18) {
                arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
            }
            if (!isStoriesView()) {
                if (z4) {
                    arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                }
                if (this.chatUsersAdapter.chatInfo != null) {
                    arrayList.add(new Pair(Integer.valueOf(i3), LocaleController.getString(R.string.GroupMembers)));
                }
                iArr = this.hasMedia;
                if (iArr[0] > 0) {
                    if (iArr[i2] != 0) {
                        arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                    } else {
                        arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                    }
                }
                if (z17) {
                    arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                }
                if (this.hasMedia[i2] > 0) {
                    arrayList.add(new Pair(Integer.valueOf(i2), LocaleController.getString(R.string.SharedFilesTab2)));
                }
                if (!DialogObject.isEncryptedDialog(this.dialog_id)) {
                    if (this.hasMedia[3] > 0) {
                        arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                    }
                    if (this.hasMedia[i5] > 0) {
                        arrayList.add(new Pair(Integer.valueOf(i5), LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (this.hasMedia[i] > 0) {
                        arrayList.add(new Pair(Integer.valueOf(i4), LocaleController.getString(R.string.SharedPollTab)));
                    }
                } else if (this.hasMedia[i5] > 0) {
                    arrayList.add(new Pair(Integer.valueOf(i5), LocaleController.getString(R.string.SharedMusicTab2)));
                }
                if (this.hasMedia[2] > 0) {
                    arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                }
                if (this.hasMedia[5] > 0) {
                    arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                }
                if (this.hasMedia[6] > 0) {
                    arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                }
                if (z3) {
                    if (this.dialog_id > 0) {
                        i10 = R.string.SimilarBotsTab;
                    } else {
                        i10 = R.string.SimilarChannelsTab;
                    }
                    arrayList.add(new Pair(10, LocaleController.getString(i10)));
                }
            }
            if (this.scrollSlidingTextTabStrip.isReordering()) {
                z5 = this.info instanceof TLRPC.TL_channelFull;
                while (i9 < 15) {
                    if (getTab(i9, z5) == null) {
                    }
                }
            }
            if (profileTab != null) {
                tabId = getTabId(profileTab);
                i8 = 0;
                while (true) {
                    if (i8 < arrayList.size()) {
                        i8 = -1;
                        break;
                    } else {
                        if (((Integer) ((Pair) arrayList.get(i8)).first).intValue() == tabId) {
                            break;
                            break;
                        }
                        i8++;
                    }
                }
                if (i8 >= 0) {
                    Pair pair3 = (Pair) arrayList.remove(i8);
                    i6 = 0;
                    arrayList.add(0, pair3);
                } else {
                    i6 = 0;
                }
            } else {
                i6 = 0;
            }
            if (!arrayList.isEmpty()) {
                this.firstTab = ((Integer) ((Pair) arrayList.get(i6)).first).intValue();
            }
            size = arrayList.size();
            i7 = 0;
            while (i7 < size) {
                Object obj2 = arrayList.get(i7);
                i7++;
                pair = (Pair) obj2;
                if (!this.scrollSlidingTextTabStrip.hasTab(((Integer) pair.first).intValue())) {
                    this.scrollSlidingTextTabStrip.addTextTab(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayRemoveTabs);
                }
            }
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
            this.mediaPages[0].selectedType = selectedTab;
        }
        this.wasReordering = this.scrollSlidingTextTabStrip.isReordering();
        this.scrollSlidingTextTabStrip.finishAddingTabs();
        onSelectedTabChanged();
        checkStoriesTabsPosition();
    }

    public Boolean zoomIn() {
        return zoomIn(null, null);
    }

    public Boolean zoomOut() {
        return zoomOut(null, null);
    }

    public SharedMediaLayout(Context context, long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList<Integer> arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, Delegate delegate, int i4, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        Theme.ResourcesProvider resourcesProvider2;
        int top;
        int iFindFirstVisibleItemPosition;
        int i5;
        MediaPage[] mediaPageArr;
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs;
        boolean zCustomTabs;
        SharedMediaLayout sharedMediaLayout;
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs2;
        long j2;
        int i6;
        int i7;
        final MediaPage mediaPage;
        final ExtendedGridLayoutManager extendedGridLayoutManager;
        MediaPage mediaPage2;
        RecyclerListView.Holder holder;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        TL_bots.BotInfo botInfo;
        super(context);
        SharedMediaLayout sharedMediaLayout2 = this;
        TLRPC.ChatFull chatFull2 = chatFull;
        sharedMediaLayout2.rect = new Rect();
        sharedMediaLayout2.mediaPages = new MediaPage[2];
        sharedMediaLayout2.cellCache = new ArrayList<>(10);
        sharedMediaLayout2.cache = new ArrayList<>(10);
        sharedMediaLayout2.audioCellCache = new ArrayList<>(10);
        sharedMediaLayout2.audioCache = new ArrayList<>(10);
        sharedMediaLayout2.hideFloatingDateRunnable = new SharedMediaLayout$$ExternalSyntheticLambda55(sharedMediaLayout2, 0);
        sharedMediaLayout2.actionModeViews = new ArrayList<>();
        sharedMediaLayout2.backgroundPaint = new Paint();
        sharedMediaLayout2.selectedFiles = new SparseArray[]{new SparseArray<>(), new SparseArray<>()};
        sharedMediaLayout2.allowStoriesSingleColumn = false;
        sharedMediaLayout2.storiesColumnsCountSet = false;
        sharedMediaLayout2.mediaColumnsCount = new int[]{3, 3};
        sharedMediaLayout2.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i13, boolean z, boolean z2) {
                SharedLinkCell sharedLinkCell;
                MessageObject message;
                ImageReceiver linkImageView;
                PhotoViewer.PlaceProviderObject placeProviderObject;
                View pinnedHeader;
                int iDp;
                boolean z3;
                int i14;
                int height;
                if (messageObject != null && (SharedMediaLayout.this.mediaPages[0].selectedType == 0 || SharedMediaLayout.this.mediaPages[0].selectedType == 1 || SharedMediaLayout.this.mediaPages[0].selectedType == 3 || SharedMediaLayout.this.mediaPages[0].selectedType == 5)) {
                    InternalListView internalListView = SharedMediaLayout.this.mediaPages[0].listView;
                    int childCount = internalListView.getChildCount();
                    int i15 = -1;
                    int i16 = -1;
                    for (int i17 = 0; i17 < childCount; i17++) {
                        View childAt = internalListView.getChildAt(i17);
                        int measuredHeight = SharedMediaLayout.this.mediaPages[0].listView.getMeasuredHeight();
                        View view = (View) SharedMediaLayout.this.getParent();
                        if (view != null && SharedMediaLayout.this.getY() + SharedMediaLayout.this.getMeasuredHeight() > view.getMeasuredHeight()) {
                            measuredHeight -= SharedMediaLayout.this.getBottom() - view.getMeasuredHeight();
                        }
                        if (childAt.getTop() < measuredHeight) {
                            int childAdapterPosition = internalListView.getChildAdapterPosition(childAt);
                            if (childAdapterPosition < i15 || i15 == -1) {
                                i15 = childAdapterPosition;
                            }
                            if (childAdapterPosition > i16 || i16 == -1) {
                                i16 = childAdapterPosition;
                            }
                            int[] iArr = new int[2];
                            if (childAt instanceof SharedPhotoVideoCell2) {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                                MessageObject messageObject2 = sharedPhotoVideoCell2.getMessageObject();
                                if (messageObject2 != null) {
                                    if (messageObject2.getId() == messageObject.getId()) {
                                        linkImageView = sharedPhotoVideoCell2.imageReceiver;
                                        sharedPhotoVideoCell2.getLocationInWindow(iArr);
                                        iArr[0] = Math.round(sharedPhotoVideoCell2.imageReceiver.getImageX()) + iArr[0];
                                        iArr[1] = Math.round(sharedPhotoVideoCell2.imageReceiver.getImageY()) + iArr[1];
                                    } else {
                                        linkImageView = null;
                                    }
                                    if (linkImageView != null) {
                                        placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                        placeProviderObject.viewX = iArr[0];
                                        placeProviderObject.viewY = iArr[1];
                                        placeProviderObject.parentView = internalListView;
                                        placeProviderObject.animatingImageView = SharedMediaLayout.this.mediaPages[0].animatingImageView;
                                        SharedMediaLayout.this.mediaPages[0].listView.getLocationInWindow(iArr);
                                        placeProviderObject.animatingImageViewYOffset = -iArr[1];
                                        placeProviderObject.imageReceiver = linkImageView;
                                        placeProviderObject.allowTakeAnimation = true;
                                        placeProviderObject.radius = linkImageView.getRoundRadius(true);
                                        placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                                        placeProviderObject.parentView.getLocationInWindow(iArr);
                                        placeProviderObject.clipTopAddition = 0;
                                        placeProviderObject.starOffset = SharedMediaLayout.this.sharedMediaData[0].startOffset;
                                        if (SharedMediaLayout.this.fragmentContextView != null && SharedMediaLayout.this.fragmentContextView.getVisibility() == 0) {
                                            placeProviderObject.clipTopAddition = AndroidUtilities.dp(36.0f) + placeProviderObject.clipTopAddition;
                                        }
                                        if (PhotoViewer.isShowingImage(messageObject) && (pinnedHeader = internalListView.getPinnedHeader()) != null) {
                                            if (SharedMediaLayout.this.fragmentContextView == null && SharedMediaLayout.this.fragmentContextView.getVisibility() == 0) {
                                                iDp = SharedMediaLayout.this.fragmentContextView.getHeight() - AndroidUtilities.dp(2.5f);
                                            } else {
                                                iDp = 0;
                                            }
                                            z3 = childAt instanceof SharedDocumentCell;
                                            if (z3) {
                                                iDp += AndroidUtilities.dp(8.0f);
                                            }
                                            i14 = iDp - placeProviderObject.viewY;
                                            if (i14 > childAt.getHeight()) {
                                                internalListView.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                                                return placeProviderObject;
                                            }
                                            height = placeProviderObject.viewY - internalListView.getHeight();
                                            if (z3) {
                                                height -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height >= 0) {
                                                internalListView.scrollBy(0, childAt.getHeight() + height);
                                            }
                                        }
                                        return placeProviderObject;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                if (childAt instanceof SharedDocumentCell) {
                                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) childAt;
                                    if (sharedDocumentCell.getMessage().getId() == messageObject.getId()) {
                                        BackupImageView imageView = sharedDocumentCell.getImageView();
                                        linkImageView = imageView.getImageReceiver();
                                        imageView.getLocationInWindow(iArr);
                                    } else {
                                        linkImageView = null;
                                    }
                                } else if (childAt instanceof ContextLinkCell) {
                                    ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                                    MessageObject messageObject3 = (MessageObject) contextLinkCell.getParentObject();
                                    if (messageObject3 == null || messageObject3.getId() != messageObject.getId()) {
                                        linkImageView = null;
                                    } else {
                                        linkImageView = contextLinkCell.getPhotoImage();
                                        contextLinkCell.getLocationInWindow(iArr);
                                    }
                                } else if ((childAt instanceof SharedLinkCell) && (message = (sharedLinkCell = (SharedLinkCell) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = sharedLinkCell.getLinkImageView();
                                    sharedLinkCell.getLocationInWindow(iArr);
                                } else {
                                    linkImageView = null;
                                }
                                if (linkImageView != null) {
                                    placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                    placeProviderObject.viewX = iArr[0];
                                    placeProviderObject.viewY = iArr[1];
                                    placeProviderObject.parentView = internalListView;
                                    placeProviderObject.animatingImageView = SharedMediaLayout.this.mediaPages[0].animatingImageView;
                                    SharedMediaLayout.this.mediaPages[0].listView.getLocationInWindow(iArr);
                                    placeProviderObject.animatingImageViewYOffset = -iArr[1];
                                    placeProviderObject.imageReceiver = linkImageView;
                                    placeProviderObject.allowTakeAnimation = true;
                                    placeProviderObject.radius = linkImageView.getRoundRadius(true);
                                    placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                                    placeProviderObject.parentView.getLocationInWindow(iArr);
                                    placeProviderObject.clipTopAddition = 0;
                                    placeProviderObject.starOffset = SharedMediaLayout.this.sharedMediaData[0].startOffset;
                                    if (SharedMediaLayout.this.fragmentContextView != null) {
                                        placeProviderObject.clipTopAddition = AndroidUtilities.dp(36.0f) + placeProviderObject.clipTopAddition;
                                    }
                                    if (PhotoViewer.isShowingImage(messageObject)) {
                                        if (SharedMediaLayout.this.fragmentContextView == null) {
                                            iDp = 0;
                                        } else {
                                            iDp = 0;
                                        }
                                        z3 = childAt instanceof SharedDocumentCell;
                                        if (z3) {
                                            iDp += AndroidUtilities.dp(8.0f);
                                        }
                                        i14 = iDp - placeProviderObject.viewY;
                                        if (i14 > childAt.getHeight()) {
                                            internalListView.scrollBy(0, -(pinnedHeader.getHeight() + i14));
                                            return placeProviderObject;
                                        }
                                        height = placeProviderObject.viewY - internalListView.getHeight();
                                        if (z3) {
                                            height -= AndroidUtilities.dp(8.0f);
                                        }
                                        if (height >= 0) {
                                            internalListView.scrollBy(0, childAt.getHeight() + height);
                                        }
                                    }
                                    return placeProviderObject;
                                }
                            }
                        }
                    }
                    if (SharedMediaLayout.this.mediaPages[0].selectedType == 0 && i15 >= 0 && i16 >= 0) {
                        int positionForIndex = SharedMediaLayout.this.photoVideoAdapter.getPositionForIndex(i13);
                        if (positionForIndex <= i15) {
                            SharedMediaLayout.this.mediaPages[0].layoutManager.scrollToPositionWithOffset(positionForIndex, 0);
                            SharedMediaLayout.this.delegate.scrollToSharedMedia();
                        } else if (positionForIndex >= i16 && i16 >= 0) {
                            SharedMediaLayout.this.mediaPages[0].layoutManager.scrollToPositionWithOffset(positionForIndex, 0, true);
                            SharedMediaLayout.this.delegate.scrollToSharedMedia();
                        }
                    }
                }
                return null;
            }
        };
        sharedMediaLayout2.shiftDp = -5.0f;
        sharedMediaLayout2.sharedMediaData = new SharedMediaData[9];
        sharedMediaLayout2.notificationsLocker = new AnimationNotificationsLocker();
        sharedMediaLayout2.messageAlphaEnter = new SparseArray<>();
        sharedMediaLayout2.firstTab = -1;
        sharedMediaLayout2.sharedLinkCellDelegate = sharedMediaLayout2.new AnonymousClass49();
        sharedMediaLayout2.subTabsVisibilityFactor = 0.0f;
        sharedMediaLayout2.storyAlbumsById = new HashMap<>();
        sharedMediaLayout2.storyAlbumsByTabType = new HashMap<>();
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        sharedMediaLayout2.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.paint.setColor(sharedMediaLayout2.getThemedColor(Theme.key_windowBackgroundWhite));
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = blurredBackgroundDrawableViewFactory == null ? new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor) : blurredBackgroundDrawableViewFactory;
        sharedMediaLayout2.viewType = i4;
        sharedMediaLayout2.resourcesProvider = resourcesProvider;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        sharedMediaLayout2.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
        TLRPC.User user = baseFragment.getMessagesController().getUser(Long.valueOf(j));
        sharedMediaLayout2.sharedMediaPreloader = sharedMediaPreloader;
        sharedMediaLayout2.delegate = delegate;
        int[] lastMediaCount = sharedMediaPreloader.getLastMediaCount();
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory3 = blurredBackgroundDrawableViewFactory2;
        long j3 = sharedMediaLayout2.sharedMediaPreloader.topicId;
        sharedMediaLayout2.topicId = j3;
        sharedMediaLayout2.hasMedia = new int[]{lastMediaCount[0], lastMediaCount[1], lastMediaCount[2], lastMediaCount[3], lastMediaCount[4], lastMediaCount[5], j3 == 0 ? i : 0, lastMediaCount[7], lastMediaCount[8]};
        TLRPC.ProfileTab profileTab = userFull != null ? userFull.main_tab : chatFull2 != null ? chatFull2.main_tab : null;
        if (i2 == 14 || i2 == 10 || i2 == 11 || i2 == 6) {
            sharedMediaLayout2.initialTab = i2;
        } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
            sharedMediaLayout2.initialTab = 13;
        } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
            sharedMediaLayout2.initialTab = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || sharedMediaLayout2.isStoriesView()))) {
            sharedMediaLayout2.initialTab = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabGifts) && ((userFull != null && userFull.stargifts_count > 0) || (chatFull2 != null && chatFull2.stargifts_count > 0))) {
            sharedMediaLayout2.initialTab = 14;
        } else if ((profileTab instanceof TLRPC.TL_profileTabFiles) && ((i12 = sharedMediaLayout2.hasMedia[1]) == -1 || i12 > 0)) {
            sharedMediaLayout2.initialTab = 1;
        } else if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i11 = sharedMediaLayout2.hasMedia[5]) == -1 || i11 > 0)) {
            sharedMediaLayout2.initialTab = 5;
        } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i10 = sharedMediaLayout2.hasMedia[3]) == -1 || i10 > 0)) {
            sharedMediaLayout2.initialTab = 3;
        } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i9 = sharedMediaLayout2.hasMedia[4]) == -1 || i9 > 0)) {
            sharedMediaLayout2.initialTab = 4;
        } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i8 = sharedMediaLayout2.hasMedia[2]) == -1 || i8 > 0)) {
            sharedMediaLayout2.initialTab = 2;
        } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || sharedMediaLayout2.isStoriesView())) {
            sharedMediaLayout2.initialTab = sharedMediaLayout2.getInitialTab();
        } else if ((userFull != null && userFull.stargifts_count > 0) || (chatFull2 != null && chatFull2.stargifts_count > 0)) {
            sharedMediaLayout2.initialTab = 14;
        } else if (i2 == -1 || sharedMediaLayout2.topicId != 0) {
            int i13 = 0;
            while (true) {
                int[] iArr = sharedMediaLayout2.hasMedia;
                if (i13 >= iArr.length) {
                    break;
                }
                int i14 = iArr[i13];
                if (i14 == -1 || i14 > 0) {
                    sharedMediaLayout2.initialTab = i13;
                    break;
                }
                i13++;
            }
        } else {
            sharedMediaLayout2.initialTab = i2;
        }
        sharedMediaLayout2.onTabProgress(i2);
        sharedMediaLayout2.info = chatFull2;
        sharedMediaLayout2.userInfo = userFull;
        if (chatFull2 != null) {
            sharedMediaLayout2.mergeDialogId = -chatFull2.migrated_from_chat_id;
        }
        sharedMediaLayout2.dialog_id = j;
        int i15 = 0;
        while (true) {
            SharedMediaData[] sharedMediaDataArr = sharedMediaLayout2.sharedMediaData;
            if (i15 >= sharedMediaDataArr.length) {
                break;
            }
            sharedMediaDataArr[i15] = new SharedMediaData();
            sharedMediaLayout2.sharedMediaData[i15].max_id[0] = DialogObject.isEncryptedDialog(sharedMediaLayout2.dialog_id) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            sharedMediaLayout2.sharedMediaData[i15].max_id[1] = Integer.MAX_VALUE;
            sharedMediaLayout2.fillMediaData(i15);
            if (sharedMediaLayout2.mergeDialogId != 0 && sharedMediaLayout2.info != null && sharedMediaLayout2.sharedMediaData[i15].messagesDict[1].size() == 0) {
                SharedMediaData sharedMediaData = sharedMediaLayout2.sharedMediaData[i15];
                sharedMediaData.max_id[1] = sharedMediaLayout2.info.migrated_from_max_id;
                sharedMediaData.endReached[1] = false;
            }
            i15++;
        }
        sharedMediaLayout2.profileActivity = baseFragment;
        sharedMediaLayout2.actionBar = baseFragment.getActionBar();
        sharedMediaLayout2.mediaColumnsCount[0] = sharedMediaLayout2.overrideColumnsCount() <= 0 ? SharedConfig.mediaColumnsCount : sharedMediaLayout2.overrideColumnsCount();
        sharedMediaLayout2.mediaColumnsCount[1] = sharedMediaLayout2.overrideColumnsCount() <= 0 ? SharedConfig.storiesColumnsCount : sharedMediaLayout2.overrideColumnsCount();
        sharedMediaLayout2.observersGroup = sharedMediaLayout2.profileActivity.getNotificationCenter().createObserversGroup(sharedMediaLayout2).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        for (int i16 = 0; i16 < 10; i16++) {
            if (i2 == 4) {
                SharedAudioCell sharedAudioCell = new SharedAudioCell(context) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        if (messageObject.isVoice() || messageObject.isRoundVideo()) {
                            boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? SharedMediaLayout.this.sharedMediaData[4].messages : null, false);
                            return zPlayMessage;
                        }
                        if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(SharedMediaLayout.this.sharedMediaData[4].messages, messageObject, SharedMediaLayout.this.mergeDialogId);
                        }
                        return false;
                    }
                };
                sharedAudioCell.initStreamingIcons();
                sharedMediaLayout2.audioCellCache.add(sharedAudioCell);
            }
        }
        sharedMediaLayout2.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        sharedMediaLayout2.searching = false;
        sharedMediaLayout2.searchingReaction = null;
        SearchTagsList searchTagsList = sharedMediaLayout2.searchTagsList;
        if (searchTagsList != null) {
            searchTagsList.show(false);
        }
        sharedMediaLayout2.searchWas = false;
        Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        sharedMediaLayout2.pinnedHeaderShadowDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(sharedMediaLayout2.getThemedColor(Theme.key_windowBackgroundGrayShadow), PorterDuff.Mode.MULTIPLY));
        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner = sharedMediaLayout2.scrollSlidingTextTabStrip;
        int currentTabId = scrollSlidingTextTabStripInner != null ? scrollSlidingTextTabStripInner.getCurrentTabId() : i2;
        sharedMediaLayout2.scrollSlidingTextTabStrip = createScrollingTextTabStrip(context);
        for (int i17 = 1; i17 >= 0; i17--) {
            sharedMediaLayout2.selectedFiles[i17].clear();
        }
        sharedMediaLayout2.cantDeleteMessagesCount = 0;
        sharedMediaLayout2.actionModeViews.clear();
        SavedDialogsAdapter savedDialogsAdapter = sharedMediaLayout2.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        if (sharedMediaLayout2.addActionButtons()) {
            ActionBarMenu actionBarMenuCreateMenu = sharedMediaLayout2.actionBar.createMenu();
            actionBarMenuCreateMenu.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public void onLayoutChange(View view, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25) {
                    if (SharedMediaLayout.this.searchItem == null) {
                        return;
                    }
                    SharedMediaLayout.this.searchItem.setTranslationX(((View) SharedMediaLayout.this.searchItem.getParent()).getMeasuredWidth() - SharedMediaLayout.this.searchItem.getRight());
                }
            });
            if (sharedMediaLayout2.dialog_id == sharedMediaLayout2.profileActivity.getUserConfig().getClientUserId() && (sharedMediaLayout2.profileActivity instanceof MediaActivity) && sharedMediaLayout2.canShowSearchItem()) {
                sharedMediaLayout2.searchItemIcon = actionBarMenuCreateMenu.addItem(11, R.drawable.outline_header_search);
            }
            ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, 0).setIsSearchField(true).setActionBarMenuItemSearchListener(sharedMediaLayout2.new AnonymousClass4());
            sharedMediaLayout2.searchItem = actionBarMenuItemSearchListener;
            actionBarMenuItemSearchListener.setTranslationY(AndroidUtilities.dp(10.0f));
            ActionBarMenuItem actionBarMenuItem = sharedMediaLayout2.searchItem;
            SearchTagsList searchTagsList2 = sharedMediaLayout2.searchTagsList;
            actionBarMenuItem.setSearchFieldHint(LocaleController.getString((searchTagsList2 != null && searchTagsList2.hasFilters() && sharedMediaLayout2.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
            sharedMediaLayout2.searchItem.setContentDescription(LocaleController.getString("Search", R.string.Search));
            sharedMediaLayout2.searchItem.setVisibility(sharedMediaLayout2.isStoriesView() ? 8 : 4);
        }
        ImageView imageView = new ImageView(context);
        sharedMediaLayout2.photoVideoOptionsItem = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        sharedMediaLayout2.photoVideoOptionsItem.setTranslationY(AndroidUtilities.dp(10.0f));
        sharedMediaLayout2.photoVideoOptionsItem.setVisibility(4);
        if (!sharedMediaLayout2.isArchivedOnlyStoriesView() && !sharedMediaLayout2.isSearchingStories()) {
            sharedMediaLayout2.actionBar.addView(sharedMediaLayout2.photoVideoOptionsItem, LayoutHelper.createFrame(48, 56, 85));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            sharedMediaLayout2.optionsSearchImageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            sharedMediaLayout2.optionsSearchImageView.setAnimation(R.raw.options_to_search, 24, 24);
            sharedMediaLayout2.optionsSearchImageView.getAnimatedDrawable().multiplySpeed(2.0f);
            sharedMediaLayout2.optionsSearchImageView.getAnimatedDrawable().setPlayInDirectionOfCustomEndFrame(true);
            sharedMediaLayout2.optionsSearchImageView.setColorFilter(new PorterDuffColorFilter(sharedMediaLayout2.getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.SRC_IN));
            sharedMediaLayout2.optionsSearchImageView.setVisibility(8);
            sharedMediaLayout2.actionBar.addView(sharedMediaLayout2.optionsSearchImageView, LayoutHelper.createFrame(48, 56, 85));
        }
        int i18 = 1;
        boolean z = true;
        boolean z2 = true;
        sharedMediaLayout2.photoVideoOptionsItem.setOnClickListener(sharedMediaLayout2.new AnonymousClass5(j, resourcesProvider, context));
        ActionBarMenuItem actionBarMenuItem2 = sharedMediaLayout2.searchItem;
        if (actionBarMenuItem2 != null) {
            EditTextBoldCursor searchField = actionBarMenuItem2.getSearchField();
            int i19 = Theme.key_windowBackgroundWhiteBlackText;
            searchField.setTextColor(sharedMediaLayout2.getThemedColor(i19));
            searchField.setHintTextColor(sharedMediaLayout2.getThemedColor(Theme.key_player_time));
            searchField.setCursorColor(sharedMediaLayout2.getThemedColor(i19));
        }
        sharedMediaLayout2.searchItemState = 0;
        BaseFragment baseFragment2 = sharedMediaLayout2.profileActivity;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = (baseFragment2 == null || !(baseFragment2.getFragmentView() instanceof SizeNotifierFrameLayout)) ? null : (SizeNotifierFrameLayout) sharedMediaLayout2.profileActivity.getFragmentView();
        BlurredLinearLayout blurredLinearLayout = new BlurredLinearLayout(context, sizeNotifierFrameLayout);
        sharedMediaLayout2.actionModeLayout = blurredLinearLayout;
        blurredLinearLayout.setBackgroundColor(sharedMediaLayout2.getThemedColor(Theme.key_windowBackgroundGray));
        sharedMediaLayout2.actionModeLayout.setAlpha(0.0f);
        sharedMediaLayout2.actionModeLayout.setClickable(true);
        sharedMediaLayout2.actionModeLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context);
        sharedMediaLayout2.closeButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView3 = sharedMediaLayout2.closeButton;
        BackDrawable backDrawable = new BackDrawable(true);
        sharedMediaLayout2.backDrawable = backDrawable;
        imageView3.setImageDrawable(backDrawable);
        BackDrawable backDrawable2 = sharedMediaLayout2.backDrawable;
        int i20 = Theme.key_actionBarActionModeDefaultIcon;
        backDrawable2.setColor(sharedMediaLayout2.getThemedColor(i20));
        ImageView imageView4 = sharedMediaLayout2.closeButton;
        int i21 = Theme.key_actionBarActionModeDefaultSelector;
        imageView4.setBackground(Theme.createSelectorDrawable(sharedMediaLayout2.getThemedColor(i21), 1));
        sharedMediaLayout2.closeButton.setContentDescription(LocaleController.getString("Close", R.string.Close));
        sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.closeButton, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.closeButton);
        sharedMediaLayout2.closeButton.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, z2 ? 1 : 0));
        NumberTextView numberTextView = new NumberTextView(context);
        sharedMediaLayout2.selectedMessagesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        sharedMediaLayout2.selectedMessagesCountTextView.setTypeface(AndroidUtilities.bold());
        sharedMediaLayout2.selectedMessagesCountTextView.setTextColor(sharedMediaLayout2.getThemedColor(i20));
        sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.selectedMessagesCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 18, 0, 0, 0));
        sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.selectedMessagesCountTextView);
        if (!DialogObject.isEncryptedDialog(sharedMediaLayout2.dialog_id)) {
            if (!sharedMediaLayout2.isStoriesView()) {
                ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context, sharedMediaLayout2.getThemedColor(i21), sharedMediaLayout2.getThemedColor(i20), false);
                sharedMediaLayout2.gotoItem = actionBarMenuItem3;
                actionBarMenuItem3.setIcon(R.drawable.msg_message);
                sharedMediaLayout2.gotoItem.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                sharedMediaLayout2.gotoItem.setDuplicateParentStateEnabled(false);
                sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.gotoItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.gotoItem);
                sharedMediaLayout2.gotoItem.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, 2));
                ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context, sharedMediaLayout2.getThemedColor(i21), sharedMediaLayout2.getThemedColor(i20), false);
                sharedMediaLayout2.forwardItem = actionBarMenuItem4;
                actionBarMenuItem4.setIcon(R.drawable.msg_forward);
                sharedMediaLayout2.forwardItem.setContentDescription(LocaleController.getString(R.string.Forward));
                sharedMediaLayout2.forwardItem.setDuplicateParentStateEnabled(false);
                sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.forwardItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.forwardItem);
                sharedMediaLayout2.forwardItem.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, 3));
            }
            ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context, sharedMediaLayout2.getThemedColor(i21), sharedMediaLayout2.getThemedColor(i20), false);
            sharedMediaLayout2.pinItem = actionBarMenuItem5;
            actionBarMenuItem5.setIcon(R.drawable.msg_pin);
            sharedMediaLayout2.pinItem.setContentDescription(LocaleController.getString(R.string.PinMessage));
            sharedMediaLayout2.pinItem.setDuplicateParentStateEnabled(false);
            sharedMediaLayout2.pinItem.setVisibility(8);
            sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.pinItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.pinItem);
            sharedMediaLayout2.pinItem.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, 4));
            ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context, sharedMediaLayout2.getThemedColor(i21), sharedMediaLayout2.getThemedColor(i20), false);
            sharedMediaLayout2.unpinItem = actionBarMenuItem6;
            actionBarMenuItem6.setIcon(R.drawable.msg_unpin);
            sharedMediaLayout2.unpinItem.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
            sharedMediaLayout2.unpinItem.setDuplicateParentStateEnabled(false);
            sharedMediaLayout2.unpinItem.setVisibility(8);
            sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.unpinItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.unpinItem);
            sharedMediaLayout2.unpinItem.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, 5));
            sharedMediaLayout2.updateForwardItem();
        }
        ActionBarMenuItem actionBarMenuItem7 = new ActionBarMenuItem(context, sharedMediaLayout2.getThemedColor(i21), sharedMediaLayout2.getThemedColor(i20), false);
        sharedMediaLayout2.deleteItem = actionBarMenuItem7;
        actionBarMenuItem7.setIcon(R.drawable.msg_delete);
        sharedMediaLayout2.deleteItem.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        sharedMediaLayout2.deleteItem.setDuplicateParentStateEnabled(false);
        sharedMediaLayout2.actionModeLayout.addView(sharedMediaLayout2.deleteItem, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        sharedMediaLayout2.actionModeViews.add(sharedMediaLayout2.deleteItem);
        sharedMediaLayout2.deleteItem.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, 6));
        sharedMediaLayout2.photoVideoAdapter = new SharedPhotoVideoAdapter(context) {
            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage3 = SharedMediaLayout.this.getMediaPage(0);
                if (mediaPage3 == null || mediaPage3.animationSupportingListView.getVisibility() != 0) {
                    return;
                }
                SharedMediaLayout.this.animationSupportingPhotoVideoAdapter.notifyDataSetChanged();
            }
        };
        sharedMediaLayout2.animationSupportingPhotoVideoAdapter = sharedMediaLayout2.new SharedPhotoVideoAdapter(context);
        sharedMediaLayout2.documentsAdapter = sharedMediaLayout2.new SharedDocumentsAdapter(context, 1);
        sharedMediaLayout2.voiceAdapter = sharedMediaLayout2.new SharedDocumentsAdapter(context, 2);
        sharedMediaLayout2.audioAdapter = sharedMediaLayout2.new SharedDocumentsAdapter(context, 4);
        sharedMediaLayout2.pollAdapter = sharedMediaLayout2.new PollAdapter(context, sharedMediaLayout2.profileActivity.getCurrentAccount(), sharedMediaLayout2.profileActivity.getResourceProvider());
        sharedMediaLayout2.gifAdapter = sharedMediaLayout2.new GifAdapter(context);
        sharedMediaLayout2.documentsSearchAdapter = sharedMediaLayout2.new MediaSearchAdapter(context, 1);
        sharedMediaLayout2.audioSearchAdapter = sharedMediaLayout2.new MediaSearchAdapter(context, 4);
        sharedMediaLayout2.linksSearchAdapter = sharedMediaLayout2.new MediaSearchAdapter(context, 3);
        sharedMediaLayout2.groupUsersSearchAdapter = sharedMediaLayout2.new GroupUsersSearchAdapter(context);
        sharedMediaLayout2.commonGroupsAdapter = sharedMediaLayout2.new CommonGroupsAdapter(context);
        sharedMediaLayout2.channelRecommendationsAdapter = sharedMediaLayout2.new ChannelRecommendationsAdapter(context);
        sharedMediaLayout2.savedDialogsAdapter = sharedMediaLayout2.new SavedDialogsAdapter(context);
        sharedMediaLayout2.savedMessagesSearchAdapter = sharedMediaLayout2.new SavedMessagesSearchAdapter(context);
        if (!sharedMediaLayout2.isStoriesView() && !sharedMediaLayout2.includeSavedDialogs() && sharedMediaLayout2.topicId == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", sharedMediaLayout2.profileActivity.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 3);
            ChatActivityContainer chatActivityContainer = new ChatActivityContainer(context, sharedMediaLayout2.profileActivity.getParentLayout(), bundle) {
                @Override
                public void onSearchLoadingUpdate(boolean z3) {
                    if (SharedMediaLayout.this.searchItem != null) {
                        SharedMediaLayout.this.searchItem.setShowSearchProgress(z3);
                    }
                }
            };
            sharedMediaLayout2.savedMessagesContainer = chatActivityContainer;
            chatActivityContainer.chatActivity.setSavedDialog(sharedMediaLayout2.dialog_id);
            ChatActivityContainer chatActivityContainer2 = sharedMediaLayout2.savedMessagesContainer;
            chatActivityContainer2.chatActivity.reversed = true;
            chatActivityContainer2.setClipToOutline(true);
            sharedMediaLayout2.savedMessagesContainer.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
                }
            });
        }
        ChatUsersAdapter chatUsersAdapter = sharedMediaLayout2.new ChatUsersAdapter(context);
        sharedMediaLayout2.chatUsersAdapter = chatUsersAdapter;
        if (sharedMediaLayout2.topicId == 0) {
            chatUsersAdapter.sortedUsers = arrayList;
            sharedMediaLayout2.chatUsersAdapter.chatInfo = currentTabId != 7 ? null : chatFull2;
        }
        sharedMediaLayout2.storiesAdapter = new StoriesAdapter(context, false) {
            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage3 = SharedMediaLayout.this.getMediaPage(8);
                if (mediaPage3 != null && mediaPage3.animationSupportingListView.getVisibility() == 0) {
                    SharedMediaLayout.this.animationSupportingStoriesAdapter.notifyDataSetChanged();
                }
                if (mediaPage3 != null) {
                    StickerEmptyView stickerEmptyView = mediaPage3.emptyView;
                    StoriesController.StoriesList storiesList = this.storiesList;
                    stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                }
            }
        };
        sharedMediaLayout2.storiesReorder = new ItemTouchHelper(new ItemTouchHelper.Callback() {
            private RecyclerListView listView;

            private StoriesAdapter getAdapter(RecyclerView recyclerView) {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter instanceof StoriesAdapter) {
                    return (StoriesAdapter) adapter;
                }
                return null;
            }

            @Override
            public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                super.clearView(recyclerView, viewHolder);
                viewHolder.itemView.setPressed(false);
            }

            @Override
            public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
                StoriesAdapter adapter = getAdapter(recyclerView);
                if (!isLongPressDragEnabled() || adapter == null || !adapter.canReorder(viewHolder.getAdapterPosition())) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
                InternalListView internalListView = SharedMediaLayout.this.mediaPages[0] == null ? null : SharedMediaLayout.this.mediaPages[0].listView;
                this.listView = internalListView;
                if (internalListView != null) {
                    internalListView.lambda$onCellEnter$52(SharedMediaLayout.this.mediaPages[0].itemAnimator);
                }
                return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
            }

            @Override
            public boolean isLongPressDragEnabled() {
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                if (sharedMediaLayout3.isActionModeShowed) {
                    return true;
                }
                ProfileStoriesCollectionTabs profileStoriesCollectionTabs3 = sharedMediaLayout3.storiesContainer;
                return profileStoriesCollectionTabs3 != null && profileStoriesCollectionTabs3.isReordering();
            }

            @Override
            public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                StoriesAdapter adapter = getAdapter(recyclerView);
                if (adapter == null || !adapter.canReorder(viewHolder.getAdapterPosition()) || !adapter.canReorder(viewHolder2.getAdapterPosition())) {
                    return false;
                }
                adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                return true;
            }

            @Override
            public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i22) {
                RecyclerListView recyclerListView = this.listView;
                if (recyclerListView != null && viewHolder != null) {
                    recyclerListView.hideSelector(false);
                }
                if (i22 == 0) {
                    RecyclerListView recyclerListView2 = this.listView;
                    if (recyclerListView2 != null && (recyclerListView2.getAdapter() instanceof StoriesAdapter)) {
                        ((StoriesAdapter) this.listView.getAdapter()).reorderDone();
                    }
                    RecyclerListView recyclerListView3 = this.listView;
                    if (recyclerListView3 != null) {
                        recyclerListView3.lambda$onCellEnter$52(null);
                    }
                } else {
                    RecyclerListView recyclerListView4 = this.listView;
                    if (recyclerListView4 != null) {
                        recyclerListView4.cancelClickRunnables(false);
                    }
                    if (viewHolder != null) {
                        viewHolder.itemView.setPressed(true);
                    }
                }
                super.onSelectedChanged(viewHolder, i22);
            }

            @Override
            public void onSwiped(RecyclerView.ViewHolder viewHolder, int i22) {
            }
        });
        sharedMediaLayout2.animationSupportingStoriesAdapter = new StoriesAdapter(sharedMediaLayout2, context, false);
        sharedMediaLayout2.archivedStoriesAdapter = new StoriesAdapter(context, z ? 1 : 0) {
            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                MediaPage mediaPage3 = SharedMediaLayout.this.getMediaPage(9);
                if (mediaPage3 != null && mediaPage3.animationSupportingListView.getVisibility() == 0) {
                    SharedMediaLayout.this.animationSupportingArchivedStoriesAdapter.notifyDataSetChanged();
                }
                if (mediaPage3 != null) {
                    StickerEmptyView stickerEmptyView = mediaPage3.emptyView;
                    StoriesController.StoriesList storiesList = this.storiesList;
                    stickerEmptyView.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.hasInternet() && this.storiesList.getCount() > 0)));
                }
            }
        };
        sharedMediaLayout2.animationSupportingArchivedStoriesAdapter = new StoriesAdapter(sharedMediaLayout2, context, true);
        sharedMediaLayout2.linksAdapter = sharedMediaLayout2.new SharedLinksAdapter(context);
        if (!sharedMediaLayout2.isBot()) {
            if (sharedMediaLayout2.profileActivity instanceof ProfileActivity) {
                TextView textView = new TextView(context);
                sharedMediaLayout2.saveItem = textView;
                ArticleViewer$$ExternalSyntheticOutline0.m(R.string.Save, textView);
                sharedMediaLayout2.saveItem.setTypeface(AndroidUtilities.bold());
                TextView textView2 = sharedMediaLayout2.saveItem;
                int i22 = Theme.key_featuredStickers_addButton;
                textView2.setTextColor(sharedMediaLayout2.getThemedColor(i22));
                sharedMediaLayout2.saveItem.setTextSize(1, 15.0f);
                sharedMediaLayout2.saveItem.setGravity(17);
                sharedMediaLayout2.saveItem.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.15f, sharedMediaLayout2.getThemedColor(i22)), 3));
                sharedMediaLayout2.saveItem.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                sharedMediaLayout2.actionBar.addView(sharedMediaLayout2.saveItem, LayoutHelper.createFrame(-2, 56, 85));
                sharedMediaLayout2.saveItem.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda10(sharedMediaLayout2, 7));
                sharedMediaLayout2.saveItem.setVisibility(8);
                sharedMediaLayout2.saveItem.setAlpha(0.0f);
                sharedMediaLayout2.saveItem.setScaleX(0.4f);
                sharedMediaLayout2.saveItem.setScaleY(0.4f);
                BaseFragment baseFragment3 = sharedMediaLayout2.profileActivity;
                AnonymousClass13 anonymousClass13 = sharedMediaLayout2.new AnonymousClass13(baseFragment3, context, baseFragment3.getCurrentAccount(), ((ProfileActivity) sharedMediaLayout2.profileActivity).getDialogId(), resourcesProvider);
                resourcesProvider2 = resourcesProvider;
                sharedMediaLayout2.giftsContainer = anonymousClass13;
                int iDp = AndroidUtilities.dp(48.0f);
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = sharedMediaLayout2.topPanelLayout;
                anonymousClass13.setPaddingTop(iDp + (dialogsActivityTopPanelLayout != null ? (int) dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(0.0f) : 0));
                sharedMediaLayout2.storiesContainer = sharedMediaLayout2.new AnonymousClass15(context, sizeNotifierFrameLayout, sharedMediaLayout2.getStoriesController().getStoryAlbumsList(sharedMediaLayout2.dialog_id, true), sharedMediaLayout2.new AnonymousClass14(context, baseFragment, resourcesProvider2));
            }
            sharedMediaLayout2.setWillNotDraw(false);
            top = 0;
            iFindFirstVisibleItemPosition = -1;
            i5 = 0;
            while (true) {
                mediaPageArr = sharedMediaLayout2.mediaPages;
                if (i5 < mediaPageArr.length) {
                    break;
                }
                if (i5 == 0 || (mediaPage2 = mediaPageArr[i5]) == null || mediaPage2.layoutManager == null) {
                    i6 = top;
                    i7 = iFindFirstVisibleItemPosition;
                } else {
                    iFindFirstVisibleItemPosition = sharedMediaLayout2.mediaPages[i5].layoutManager.findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition == sharedMediaLayout2.mediaPages[i5].layoutManager.getItemCount() - i18 || (holder = (RecyclerListView.Holder) sharedMediaLayout2.mediaPages[i5].listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                        i6 = top;
                        i7 = -1;
                    } else {
                        top = holder.itemView.getTop();
                        i6 = top;
                        i7 = iFindFirstVisibleItemPosition;
                    }
                }
                mediaPage = new MediaPage(context) {
                    @Override
                    public void setTranslationX(float f) {
                        super.setTranslationX(f);
                        if (SharedMediaLayout.this.tabsAnimationInProgress) {
                            if (SharedMediaLayout.this.mediaPages[0] == this) {
                                float fAbs = Math.abs(SharedMediaLayout.this.mediaPages[0].getTranslationX()) / SharedMediaLayout.this.mediaPages[0].getMeasuredWidth();
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                sharedMediaLayout3.selectTabWithId(sharedMediaLayout3.mediaPages[1].selectedType, fAbs);
                                if (SharedMediaLayout.this.canShowSearchItem()) {
                                    if (SharedMediaLayout.this.searchItemState == 2) {
                                        SharedMediaLayout.this.searchAlpha = 1.0f - fAbs;
                                    } else if (SharedMediaLayout.this.searchItemState == 1) {
                                        SharedMediaLayout.this.searchAlpha = fAbs;
                                    }
                                    SharedMediaLayout.this.updateSearchItemIcon(fAbs);
                                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                    sharedMediaLayout4.optionsAlpha = sharedMediaLayout4.getPhotoVideoOptionsAlpha(fAbs);
                                    SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                    sharedMediaLayout5.photoVideoOptionsItem.setVisibility((sharedMediaLayout5.optionsAlpha == 0.0f || !SharedMediaLayout.this.canShowSearchItem() || SharedMediaLayout.this.isArchivedOnlyStoriesView()) ? 4 : 0);
                                } else {
                                    SharedMediaLayout.this.searchAlpha = 0.0f;
                                }
                                SharedMediaLayout.this.updateOptionsSearch();
                            }
                        }
                        SharedMediaLayout.this.checkStoriesTabsPosition();
                        SharedMediaLayout.this.checkUi_topPanelLayoutY();
                        SharedMediaLayout.this.invalidateBlur();
                    }
                };
                sharedMediaLayout2.addView(mediaPage, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, sharedMediaLayout2.mediaPageTopMargin(), 0.0f, 0.0f));
                if (i5 == i18) {
                    mediaPage.setTranslationX(AndroidUtilities.displaySize.x);
                }
                sharedMediaLayout2.mediaPages[i5] = mediaPage;
                extendedGridLayoutManager = mediaPage.layoutManager = new ExtendedGridLayoutManager(context, 100) {
                    private Size size = new Size();

                    @Override
                    public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr2) {
                        super.calculateExtraLayoutSpace(state, iArr2);
                        int i23 = mediaPage.selectedType;
                        if (i23 == 0 || SharedMediaLayout.isAnyStoryPageType(i23)) {
                            iArr2[1] = Math.max(iArr2[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                        } else if (mediaPage.selectedType == 1) {
                            iArr2[1] = Math.max(iArr2[1], AndroidUtilities.dp(56.0f) * 2);
                        }
                    }

                    @Override
                    public int getFlowItemCount() {
                        if (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                            return 0;
                        }
                        return getItemCount();
                    }

                    @Override
                    public Size getSizeForItem(int i23) {
                        int i24;
                        int i25;
                        TLRPC.Document document = (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter || SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? null : SharedMediaLayout.this.sharedMediaData[5].messages.get(i23).getDocument();
                        Size size = this.size;
                        size.height = 100.0f;
                        size.width = 100.0f;
                        if (document != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                            if (closestPhotoSizeWithSize != null && (i24 = closestPhotoSizeWithSize.w) != 0 && (i25 = closestPhotoSizeWithSize.h) != 0) {
                                Size size2 = this.size;
                                size2.width = i24;
                                size2.height = i25;
                            }
                            ArrayList<TLRPC.DocumentAttribute> arrayList2 = document.attributes;
                            for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                                TLRPC.DocumentAttribute documentAttribute = arrayList2.get(i26);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                    Size size3 = this.size;
                                    size3.width = documentAttribute.w;
                                    size3.height = documentAttribute.h;
                                    break;
                                }
                            }
                        }
                        return this.size;
                    }

                    @Override
                    public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfoCompat.mInfo.getCollectionItemInfo();
                        zzcv zzcvVar = collectionItemInfo != null ? new zzcv(collectionItemInfo, 8) : null;
                        if (zzcvVar != null) {
                            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) zzcvVar.zza;
                            if (collectionItemInfo2.isHeading()) {
                                accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                            }
                        }
                    }

                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    private int getSpanSizeInternal(int i23) {
                        int i24 = SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0];
                        if (mediaPage.listView.getAdapter() == SharedMediaLayout.this.photoVideoAdapter) {
                            if (SharedMediaLayout.this.photoVideoAdapter.getItemViewType(i23) != 2) {
                                return 1;
                            }
                        } else {
                            if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(mediaPage.listView.getAdapter()) == -1) {
                                if (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                                    return mediaPage.layoutManager.getSpanCount();
                                }
                                return (mediaPage.listView.getAdapter() == SharedMediaLayout.this.gifAdapter && SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? mediaPage.layoutManager.getSpanCount() : mediaPage.layoutManager.getSpanSizeForItem(i23);
                            }
                            if (mediaPage.listView.getAdapter().getItemViewType(i23) != 2) {
                                return 1;
                            }
                        }
                        return i24;
                    }

                    @Override
                    public int getSpanSize(int i23) {
                        return Math.min(getSpanSizeInternal(i23), mediaPage.layoutManager.getSpanCount());
                    }
                });
                sharedMediaLayout2.mediaPages[i5].itemAnimator = new DefaultItemAnimator();
                sharedMediaLayout2.mediaPages[i5].itemAnimator.setDurations(280L);
                sharedMediaLayout2.mediaPages[i5].itemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                sharedMediaLayout2.mediaPages[i5].itemAnimator.setSupportsChangeAnimations(false);
                sharedMediaLayout2.mediaPages[i5].listView = new SharedMediaListView(context) {
                    float lastY;
                    float startY;

                    private View findOuterScrollingAncestor() {
                        try {
                            for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                                if (parent != this && (parent instanceof RecyclerView)) {
                                    return (View) parent;
                                }
                            }
                            return null;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return null;
                        }
                    }

                    @Override
                    public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
                        float f;
                        if (sharedPhotoVideoCell2.getMessageId() != mediaPage.highlightMessageId || !sharedPhotoVideoCell2.imageReceiver.hasBitmapImage()) {
                            sharedPhotoVideoCell2.setHighlightProgress(0.0f);
                            return;
                        }
                        MediaPage mediaPage3 = mediaPage;
                        if (!mediaPage3.highlightAnimation) {
                            mediaPage3.highlightProgress = 0.0f;
                            mediaPage3.highlightAnimation = true;
                        }
                        float f2 = mediaPage3.highlightProgress;
                        if (f2 < 0.3f) {
                            f = f2 / 0.3f;
                        } else {
                            f = f2 > 0.7f ? (1.0f - f2) / 0.3f : 1.0f;
                        }
                        sharedPhotoVideoCell2.setHighlightProgress(f);
                    }

                    @Override
                    public void dispatchDraw(Canvas canvas) {
                        View childAt;
                        View childAt2;
                        if ((getAdapter() == SharedMediaLayout.this.archivedStoriesAdapter || getAdapter() == SharedMediaLayout.this.storiesAdapter) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && getChildAdapterPosition(childAt) == 0) {
                            int top2 = childAt.getTop();
                            if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                                if (SharedMediaLayout.this.changeColumnsTab == (getAdapter() == SharedMediaLayout.this.storiesAdapter ? 8 : 9) && mediaPage.animationSupportingListView.getChildCount() > 0 && (childAt2 = mediaPage.animationSupportingListView.getChildAt(0)) != null && mediaPage.animationSupportingListView.getChildAdapterPosition(childAt2) == 0) {
                                    top2 = AndroidUtilities.lerp(top2, childAt2.getTop(), SharedMediaLayout.this.photoVideoChangeColumnsProgress);
                                }
                            }
                            if (getAdapter() != SharedMediaLayout.this.storiesAdapter) {
                                if (this.archivedHintPaint == null) {
                                    TextPaint textPaint = new TextPaint(1);
                                    this.archivedHintPaint = textPaint;
                                    textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                                    this.archivedHintPaint.setColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
                                }
                                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                                StaticLayout staticLayout = this.archivedHintLayout;
                                if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                                    this.archivedHintLayout = new StaticLayout(LocaleController.getString(SharedMediaLayout.this.isArchivedOnlyStoriesView() ? SharedMediaLayout.this.profileActivity != null && ChatObject.isChannelAndNotMegaGroup(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.archivedHintPaint, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                    this.archivedHintLayoutWidth = 0.0f;
                                    this.archivedHintLayoutLeft = measuredWidth;
                                    for (int i23 = 0; i23 < this.archivedHintLayout.getLineCount(); i23++) {
                                        this.archivedHintLayoutWidth = Math.max(this.archivedHintLayoutWidth, this.archivedHintLayout.getLineWidth(i23));
                                        this.archivedHintLayoutLeft = Math.min(this.archivedHintLayoutLeft, this.archivedHintLayout.getLineLeft(i23));
                                    }
                                }
                                canvas.save();
                                canvas.translate(((getWidth() - this.archivedHintLayoutWidth) / 2.0f) - this.archivedHintLayoutLeft, top2 - ((this.archivedHintLayout.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                                this.archivedHintLayout.draw(canvas);
                                canvas.restore();
                            }
                        }
                        super.dispatchDraw(canvas);
                        MediaPage mediaPage3 = mediaPage;
                        if (mediaPage3.highlightAnimation) {
                            float f = mediaPage3.highlightProgress + 0.010666667f;
                            mediaPage3.highlightProgress = f;
                            if (f >= 1.0f) {
                                mediaPage3.highlightProgress = 0.0f;
                                mediaPage3.highlightAnimation = false;
                                mediaPage3.highlightMessageId = 0;
                            }
                            invalidate();
                        }
                        if (this.poller == null) {
                            int currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
                            UserListPoller[] userListPollerArr = UserListPoller.istances;
                            if (userListPollerArr[currentAccount] == null) {
                                userListPollerArr[currentAccount] = new UserListPoller(currentAccount);
                            }
                            this.poller = userListPollerArr[currentAccount];
                        }
                        this.poller.checkList(this);
                        if (isChangeColumnsAnimation()) {
                            return;
                        }
                        SharedMediaLayout.this.changeColumnsTab = -1;
                    }

                    @Override
                    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                        if (SharedMediaLayout.this.profileActivity == null || !SharedMediaLayout.this.profileActivity.isInPreviewMode()) {
                            return super.dispatchTouchEvent(motionEvent);
                        }
                        this.lastY = motionEvent.getY();
                        if (motionEvent.getAction() == 1) {
                            SharedMediaLayout.this.profileActivity.finishPreviewFragment();
                        } else if (motionEvent.getAction() == 2) {
                            float f = this.startY - this.lastY;
                            SharedMediaLayout.this.profileActivity.movePreviewFragment(f);
                            if (f < 0.0f) {
                                this.startY = this.lastY;
                            }
                        }
                        return true;
                    }

                    @Override
                    public void emptyViewUpdated(boolean z3, boolean z4) {
                    }

                    @Override
                    public int getAnimateToColumnsCount() {
                        return SharedMediaLayout.this.animateToColumnsCount;
                    }

                    @Override
                    public float getChangeColumnsProgress() {
                        return SharedMediaLayout.this.photoVideoChangeColumnsProgress;
                    }

                    @Override
                    public int getColumnsCount() {
                        return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab) ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
                    }

                    @Override
                    public SparseArray<Float> getMessageAlphaEnter() {
                        return SharedMediaLayout.this.messageAlphaEnter;
                    }

                    @Override
                    public RecyclerListView.FastScrollAdapter getMovingAdapter() {
                        if (!SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab)) {
                            return SharedMediaLayout.this.photoVideoAdapter;
                        }
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        return sharedMediaLayout3.storyAlbums_getStoriesAdapterByTabType(sharedMediaLayout3.changeColumnsTab);
                    }

                    @Override
                    public Integer getSelectorColor(int i23) {
                        if (getAdapter() == SharedMediaLayout.this.channelRecommendationsAdapter && SharedMediaLayout.this.channelRecommendationsAdapter.more > 0 && i23 == SharedMediaLayout.this.channelRecommendationsAdapter.getItemCount() - 1) {
                            return 0;
                        }
                        return super.getSelectorColor(i23);
                    }

                    @Override
                    public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
                        if (!SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab)) {
                            return SharedMediaLayout.this.animationSupportingPhotoVideoAdapter;
                        }
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        return sharedMediaLayout3.storyAlbums_getStoriesSupportingAdapterByTabType(sharedMediaLayout3.changeColumnsTab);
                    }

                    @Override
                    public InternalListView getSupportingListView() {
                        return mediaPage.animationSupportingListView;
                    }

                    @Override
                    public boolean isChangeColumnsAnimation() {
                        return SharedMediaLayout.this.photoVideoChangeColumnsAnimation;
                    }

                    @Override
                    public boolean isStories() {
                        return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab);
                    }

                    @Override
                    public boolean isThisListView() {
                        return this == mediaPage.listView;
                    }

                    @Override
                    public void onLayout(boolean z3, int i23, int i24, int i25, int i26) {
                        super.onLayout(z3, i23, i24, i25, i26);
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        MediaPage mediaPage3 = mediaPage;
                        sharedMediaLayout3.checkLoadMoreScroll(mediaPage3, mediaPage3.listView, extendedGridLayoutManager);
                        if (mediaPage.selectedType == 0) {
                            PhotoViewer.getInstance().checkCurrentImageVisibility();
                        }
                    }

                    @Override
                    public void onScrolled(int i23, int i24) {
                        super.onScrolled(i23, i24);
                        if (this.scrollingByUser && SharedMediaLayout.this.getSelectedTab() == 11 && SharedMediaLayout.this.profileActivity != null) {
                            AndroidUtilities.hideKeyboard(SharedMediaLayout.this.profileActivity.getParentActivity().getCurrentFocus());
                        }
                        SharedMediaLayout.this.checkStoriesTabsPosition();
                        if (getAdapter() == SharedMediaLayout.this.pollAdapter) {
                            SharedMediaLayout.this.pollAdapter.onScrolled(this);
                        }
                    }

                    @Override
                    public boolean performAccessibilityAction(int i23, Bundle bundle2) {
                        View viewFindOuterScrollingAncestor;
                        try {
                            if (i23 != 4096) {
                                if (i23 == 8192) {
                                    if (!canScrollVertically(-1) && (viewFindOuterScrollingAncestor = findOuterScrollingAncestor()) != null && viewFindOuterScrollingAncestor.canScrollVertically(-1) && viewFindOuterScrollingAncestor.performAccessibilityAction(i23, bundle2)) {
                                        return true;
                                    }
                                }
                                return super.performAccessibilityAction(i23, bundle2);
                            }
                            View viewFindOuterScrollingAncestor2 = findOuterScrollingAncestor();
                            if (viewFindOuterScrollingAncestor2 != null && viewFindOuterScrollingAncestor2.canScrollVertically(1) && viewFindOuterScrollingAncestor2.performAccessibilityAction(i23, bundle2)) {
                                return true;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        return super.performAccessibilityAction(i23, bundle2);
                    }
                };
                sharedMediaLayout2.mediaPages[i5].listView.setFastScrollEnabled(i18);
                sharedMediaLayout2.mediaPages[i5].listView.setScrollingTouchSlop(i18);
                sharedMediaLayout2.mediaPages[i5].listView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                sharedMediaLayout2.mediaPages[i5].listView.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                sharedMediaLayout2.mediaPages[i5].listView.lambda$onCellEnter$52(null);
                sharedMediaLayout2.mediaPages[i5].listView.setClipToPadding(false);
                sharedMediaLayout2.mediaPages[i5].listView.setSectionsType(2);
                sharedMediaLayout2.mediaPages[i5].listView.setLayoutManager(extendedGridLayoutManager);
                MediaPage mediaPage3 = sharedMediaLayout2.mediaPages[i5];
                mediaPage3.addView(mediaPage3.listView, LayoutHelper.createFrame(-1, -1.0f));
                sharedMediaLayout2.mediaPages[i5].animationSupportingListView = new InternalListView(context);
                sharedMediaLayout2.mediaPages[i5].animationSupportingListView.setLayoutManager(sharedMediaLayout2.mediaPages[i5].animationSupportingLayoutManager = new GridLayoutManager(context, 3) {
                    {
                        super(i);
                    }

                    @Override
                    public int scrollVerticallyBy(int i23, RecyclerView.Recycler recycler, RecyclerView.State state) {
                        if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                            i23 = 0;
                        }
                        return super.scrollVerticallyBy(i23, recycler, state);
                    }

                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                });
                MediaPage mediaPage4 = sharedMediaLayout2.mediaPages[i5];
                mediaPage4.addView(mediaPage4.animationSupportingListView, LayoutHelper.createFrame(-1, -1.0f));
                sharedMediaLayout2.mediaPages[i5].animationSupportingListView.setVisibility(8);
                sharedMediaLayout2.mediaPages[i5].animationSupportingListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                        if (!(view instanceof SharedPhotoVideoCell2)) {
                            rect.left = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            rect.right = 0;
                            return;
                        }
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                        int childAdapterPosition = mediaPage.animationSupportingListView.getChildAdapterPosition(sharedPhotoVideoCell2);
                        int spanCount = mediaPage.animationSupportingLayoutManager.getSpanCount();
                        sharedPhotoVideoCell2.isTop = childAdapterPosition < spanCount;
                        int i23 = childAdapterPosition % spanCount;
                        sharedPhotoVideoCell2.isFirst = i23 == 0;
                        sharedPhotoVideoCell2.isLast = i23 == spanCount - 1;
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                    }
                });
                sharedMediaLayout2.mediaPages[i5].listView.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                        if (mediaPage.listView.getAdapter() == SharedMediaLayout.this.gifAdapter) {
                            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                            rect.left = 0;
                            rect.bottom = 0;
                            if (mediaPage.layoutManager.isFirstRow(childAdapterPosition)) {
                                rect.top = 0;
                            } else {
                                rect.top = AndroidUtilities.dp(2.0f);
                            }
                            rect.right = mediaPage.layoutManager.isLastInRow(childAdapterPosition) ? 0 : AndroidUtilities.dp(2.0f);
                            return;
                        }
                        if (!(view instanceof SharedPhotoVideoCell2)) {
                            rect.left = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            rect.right = 0;
                            return;
                        }
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                        int childAdapterPosition2 = mediaPage.listView.getChildAdapterPosition(sharedPhotoVideoCell2);
                        int spanCount = mediaPage.layoutManager.getSpanCount();
                        sharedPhotoVideoCell2.isTop = childAdapterPosition2 < spanCount;
                        int i23 = childAdapterPosition2 % spanCount;
                        sharedPhotoVideoCell2.isFirst = i23 == 0;
                        sharedPhotoVideoCell2.isLast = i23 == spanCount - 1;
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                    }
                });
                sharedMediaLayout2.mediaPages[i5].listView.setOnItemClickListener(new ChatActivity$$ExternalSyntheticLambda48(sharedMediaLayout2, mediaPage, context, j, resourcesProvider2, 1));
                sharedMediaLayout2.mediaPages[i5].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrollStateChanged(RecyclerView recyclerView, int i23) {
                        SharedMediaLayout.this.scrolling = i23 != 0;
                    }

                    @Override
                    public void onScrolled(RecyclerView recyclerView, int i23, int i24) {
                        int i25;
                        SharedMediaLayout.this.checkLoadMoreScroll(mediaPage, (RecyclerListView) recyclerView, extendedGridLayoutManager);
                        if (i24 != 0 && ((SharedMediaLayout.this.mediaPages[0].selectedType == 0 || SharedMediaLayout.this.mediaPages[0].selectedType == 5) && !SharedMediaLayout.this.sharedMediaData[0].messages.isEmpty())) {
                            SharedMediaLayout.this.showFloatingDateView();
                        }
                        if (i24 != 0 && ((i25 = mediaPage.selectedType) == 0 || SharedMediaLayout.isAnyStoryPageType(i25))) {
                            SharedMediaLayout.showFastScrollHint(mediaPage, SharedMediaLayout.this.sharedMediaData, true);
                        }
                        mediaPage.listView.checkSection(true);
                        MediaPage mediaPage5 = mediaPage;
                        if (mediaPage5.fastScrollHintView != null) {
                            mediaPage5.invalidate();
                        }
                        SharedMediaLayout.this.invalidateBlur();
                    }
                });
                sharedMediaLayout2.mediaPages[i5].listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
                    @Override
                    public boolean mo2353onItemClick(View view, int i23, float f, float f2) {
                        int iIntValue;
                        if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation || mediaPage.listView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                            return false;
                        }
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        if (sharedMediaLayout3.isActionModeShowed) {
                            MediaPage mediaPage5 = mediaPage;
                            if (mediaPage5.selectedType != 11) {
                                mediaPage5.listView.clickItem(view, i23);
                                return true;
                            }
                        }
                        int i24 = mediaPage.selectedType;
                        if (i24 == 7 && (view instanceof UserCell)) {
                            if (sharedMediaLayout3.chatUsersAdapter.sortedUsers.isEmpty()) {
                                iIntValue = i23;
                            } else {
                                if (i23 >= SharedMediaLayout.this.chatUsersAdapter.sortedUsers.size()) {
                                    return false;
                                }
                                iIntValue = ((Integer) SharedMediaLayout.this.chatUsersAdapter.sortedUsers.get(i23)).intValue();
                            }
                            if (iIntValue < 0 || iIntValue >= SharedMediaLayout.this.chatUsersAdapter.chatInfo.participants.participants.size()) {
                                return false;
                            }
                            TLRPC.ChatParticipant chatParticipant = SharedMediaLayout.this.chatUsersAdapter.chatInfo.participants.participants.get(iIntValue);
                            RecyclerListView recyclerListView = (RecyclerListView) view.getParent();
                            for (int i25 = 0; i25 < recyclerListView.getChildCount(); i25++) {
                                View childAt = recyclerListView.getChildAt(i25);
                                if (recyclerListView.getChildAdapterPosition(childAt) == i23) {
                                    view = childAt;
                                    break;
                                }
                            }
                            return SharedMediaLayout.this.onMemberClick(chatParticipant, true, view);
                        }
                        if (i24 == 1 && (view instanceof SharedDocumentCell)) {
                            return sharedMediaLayout3.onItemLongClick(((SharedDocumentCell) view).getMessage(), view, 0);
                        }
                        if (i24 == 3 && (view instanceof SharedLinkCell)) {
                            return sharedMediaLayout3.onItemLongClick(((SharedLinkCell) view).getMessage(), view, 0);
                        }
                        if ((i24 == 2 || i24 == 4) && (view instanceof SharedAudioCell)) {
                            return sharedMediaLayout3.onItemLongClick(((SharedAudioCell) view).getMessage(), view, 0);
                        }
                        if (i24 == 5 && (view instanceof ContextLinkCell)) {
                            return sharedMediaLayout3.onItemLongClick((MessageObject) ((ContextLinkCell) view).getParentObject(), view, 0);
                        }
                        if ((i24 == 0 || (SharedMediaLayout.isAnyStoryPageType(i24) && SharedMediaLayout.this.canEditStories())) && (view instanceof SharedPhotoVideoCell2)) {
                            MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
                            if (messageObject != null) {
                                return SharedMediaLayout.this.onItemLongClick(messageObject, view, mediaPage.selectedType);
                            }
                        } else {
                            int i26 = mediaPage.selectedType;
                            if (i26 == 10) {
                                SharedMediaLayout.this.channelRecommendationsAdapter.openPreview(i23);
                                return true;
                            }
                            if (i26 == 11) {
                                SharedMediaLayout.this.savedDialogsAdapter.select(view);
                                return true;
                            }
                        }
                        return false;
                    }

                    @Override
                    public void onLongClickRelease() {
                        if (SharedMediaLayout.this.profileActivity != null) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                SharedMediaLayout.this.profileActivity.finishPreviewFragment();
                            }
                        }
                    }

                    @Override
                    public void onMove(float f, float f2) {
                        if (SharedMediaLayout.this.profileActivity != null) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                SharedMediaLayout.this.profileActivity.movePreviewFragment(f2);
                            }
                        }
                    }
                });
                if (i5 == 0 && i7 != -1) {
                    extendedGridLayoutManager.scrollToPositionWithOffset(i7, i6);
                }
                final InternalListView internalListView = sharedMediaLayout2.mediaPages[i5].listView;
                sharedMediaLayout2.mediaPages[i5].animatingImageView = new ClippingImageView(context) {
                    @Override
                    public void invalidate() {
                        super.invalidate();
                        internalListView.invalidate();
                    }
                };
                sharedMediaLayout2.mediaPages[i5].animatingImageView.setVisibility(8);
                sharedMediaLayout2.mediaPages[i5].listView.addOverlayView(sharedMediaLayout2.mediaPages[i5].animatingImageView, LayoutHelper.createFrame(-1, -1.0f));
                sharedMediaLayout2.mediaPages[i5].progressView = new FlickerLoadingView(context) {
                    @Override
                    public int getColumnsCount() {
                        return SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0];
                    }

                    @Override
                    public int getViewType() {
                        setIsSingleCell(false);
                        int i23 = mediaPage.selectedType;
                        if (i23 == 0 || i23 == 5) {
                            return 2;
                        }
                        if (i23 == 1) {
                            return 3;
                        }
                        if (i23 == 2 || i23 == 4) {
                            return 6;
                        }
                        if (i23 == 3) {
                            return 5;
                        }
                        if (i23 == 7) {
                            return 6;
                        }
                        if (i23 != 6) {
                            return SharedMediaLayout.isAnyStoryPageType(i23) ? 27 : 1;
                        }
                        if (SharedMediaLayout.this.scrollSlidingTextTabStrip.getTabsCount() == 1) {
                            setIsSingleCell(true);
                        }
                        return 1;
                    }

                    @Override
                    public void onDraw(Canvas canvas) {
                        SharedMediaLayout.this.backgroundPaint.setColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), SharedMediaLayout.this.backgroundPaint);
                        super.onDraw(canvas);
                    }
                };
                sharedMediaLayout2.mediaPages[i5].progressView.showDate(false);
                sharedMediaLayout2.mediaPages[i5].progressView.setClipToOutline(true);
                sharedMediaLayout2.mediaPages[i5].progressView.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
                    }
                });
                if (i5 != 0) {
                    sharedMediaLayout2.mediaPages[i5].setVisibility(8);
                }
                MediaPage mediaPage5 = sharedMediaLayout2.mediaPages[i5];
                mediaPage5.emptyView = new StickerEmptyView(context, mediaPage5.progressView, 1) {
                    @Override
                    public void onVisibilityChange(float f) {
                        super.onVisibilityChange(f);
                        SharedMediaLayout.this.onBottomButtonVisibilityChange();
                    }
                };
                sharedMediaLayout2.mediaPages[i5].emptyView.setVisibility(8, false);
                sharedMediaLayout2.mediaPages[i5].emptyView.setAnimateLayoutChange(true);
                MediaPage mediaPage6 = sharedMediaLayout2.mediaPages[i5];
                mediaPage6.addView(mediaPage6.emptyView, LayoutHelper.createFrame(-1, -1.0f));
                sharedMediaLayout2.mediaPages[i5].emptyView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(28));
                sharedMediaLayout2.mediaPages[i5].emptyView.showProgress(true, false);
                sharedMediaLayout2.mediaPages[i5].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                sharedMediaLayout2.mediaPages[i5].emptyView.button.setVisibility(8);
                sharedMediaLayout2.mediaPages[i5].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                sharedMediaLayout2.mediaPages[i5].emptyView.button.setVisibility(8);
                sharedMediaLayout2.mediaPages[i5].emptyView.addView(sharedMediaLayout2.mediaPages[i5].progressView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                sharedMediaLayout2.mediaPages[i5].listView.setEmptyView(sharedMediaLayout2.mediaPages[i5].emptyView);
                sharedMediaLayout2.mediaPages[i5].listView.setAnimateEmptyView(true, 0);
                MediaPage mediaPage7 = sharedMediaLayout2.mediaPages[i5];
                mediaPage7.scrollHelper = new RecyclerAnimationScrollHelper(mediaPage7.listView, sharedMediaLayout2.mediaPages[i5].layoutManager);
                i5++;
                resourcesProvider2 = resourcesProvider;
                top = i6;
                iFindFirstVisibleItemPosition = i7;
                i18 = 1;
            }
            profileStoriesCollectionTabs = sharedMediaLayout2.storiesContainer;
            if (profileStoriesCollectionTabs != null) {
                sharedMediaLayout2.addView(profileStoriesCollectionTabs, LayoutHelper.createFrame(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
            }
            ChatActionCell chatActionCell = new ChatActionCell(context);
            sharedMediaLayout2.floatingDateView = chatActionCell;
            chatActionCell.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
            sharedMediaLayout2.floatingDateView.setAlpha(0.0f);
            sharedMediaLayout2.floatingDateView.setOverrideColor(Theme.key_chat_mediaTimeBackground, Theme.key_chat_mediaTimeText);
            sharedMediaLayout2.floatingDateView.setTranslationY(-AndroidUtilities.dp(48.0f));
            sharedMediaLayout2.addView(sharedMediaLayout2.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
            zCustomTabs = sharedMediaLayout2.customTabs();
            sharedMediaLayout = sharedMediaLayout2;
            if (!zCustomTabs) {
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout2 = new DialogsActivityTopPanelLayout(context);
                sharedMediaLayout2.topPanelLayout = dialogsActivityTopPanelLayout2;
                dialogsActivityTopPanelLayout2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory3.create(sharedMediaLayout2.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate, AndroidUtilities.dp(24.0f), 7.0f);
                sharedMediaLayout2.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
                FrameLayout frameLayout = new FrameLayout(context);
                sharedMediaLayout2.fragmentContextViewWrapper = frameLayout;
                sharedMediaLayout2.topPanelLayout.addView(frameLayout);
                sharedMediaLayout2.topPanelLayout.setViewVisible(sharedMediaLayout2.fragmentContextViewWrapper, true, false);
                sharedMediaLayout2.topPanelLayout.setOnAnimatedHeightChangedListener(new SharedMediaLayout$$ExternalSyntheticLambda55(sharedMediaLayout2, 1));
                FragmentContextView fragmentContextView = new FragmentContextView(context, baseFragment, this, false, resourcesProvider) {
                    @Override
                    public void setVisibility(int i23) {
                        SharedMediaLayout.this.topPanelLayout.setViewVisible(SharedMediaLayout.this.fragmentContextViewWrapper, i23 == 0);
                    }
                };
                sharedMediaLayout2.fragmentContextView = fragmentContextView;
                sharedMediaLayout2.fragmentContextViewWrapper.addView(fragmentContextView);
                sharedMediaLayout2.topPanelLayout.setCallFragmentContextView(sharedMediaLayout2.fragmentContextView);
                sharedMediaLayout2.addView(sharedMediaLayout2.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                sharedMediaLayout2.fragmentContextView.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(sharedMediaLayout2, 17));
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = blurredBackgroundDrawableViewFactory3.create(sharedMediaLayout2.scrollSlidingTextTabStrip, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate2, AndroidUtilities.dp(18.0f), 6.666f);
                sharedMediaLayout2.scrollSlidingTextTabStrip.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                sharedMediaLayout2.scrollSlidingTextTabStrip.setClipToPadding(false);
                sharedMediaLayout2.scrollSlidingTextTabStrip.setBackground(null);
                sharedMediaLayout2.scrollSlidingTextTabStrip.setBlurredBackground(blurredBackgroundDrawableCreate2);
                sharedMediaLayout2.scrollSlidingTextTabStrip.setOpen(false);
                sharedMediaLayout2.addView(sharedMediaLayout2.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                Context context2 = sharedMediaLayout2.getContext();
                BaseFragment baseFragment4 = sharedMediaLayout2.profileActivity;
                int currentAccount = baseFragment4.getCurrentAccount();
                if (sharedMediaLayout2.includeSavedDialogs()) {
                    j2 = 0;
                } else {
                    j2 = sharedMediaLayout2.dialog_id;
                }
                SearchTagsList searchTagsList3 = new SearchTagsList(context2, baseFragment4, currentAccount, j2, resourcesProvider) {
                    @Override
                    public void onShownUpdate(boolean z3) {
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setAlpha(1.0f - this.shownT);
                        ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner2 = SharedMediaLayout.this.scrollSlidingTextTabStrip;
                        scrollSlidingTextTabStripInner2.setPivotX(scrollSlidingTextTabStripInner2.getWidth() / 2.0f);
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setScaleX(((1.0f - this.shownT) * 0.2f) + 0.8f);
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setPivotY(AndroidUtilities.dp(48.0f));
                        SharedMediaLayout.this.scrollSlidingTextTabStrip.setScaleY(((1.0f - this.shownT) * 0.2f) + 0.8f);
                    }

                    @Override
                    public boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                        if (SharedMediaLayout.this.searchItem == null) {
                            return false;
                        }
                        SharedMediaLayout.this.searchingReaction = visibleReaction;
                        String string = SharedMediaLayout.this.searchItem.getSearchField().getText().toString();
                        SharedMediaLayout.this.searchWas = (string.length() == 0 && SharedMediaLayout.this.searchingReaction == null) ? false : true;
                        SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                        if (SharedMediaLayout.this.mediaPages[0].selectedType == 11) {
                            if (SharedMediaLayout.this.savedMessagesSearchAdapter != null) {
                                SharedMediaLayout.this.savedMessagesSearchAdapter.search(string, SharedMediaLayout.this.searchingReaction);
                            }
                            AndroidUtilities.hideKeyboard(SharedMediaLayout.this.searchItem.getSearchField());
                        } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 12 && SharedMediaLayout.this.savedMessagesContainer != null) {
                            SharedMediaLayout.this.savedMessagesContainer.chatActivity.setTagFilter(visibleReaction);
                        }
                        return true;
                    }

                    @Override
                    public void updateTags(boolean z3) {
                        super.updateTags(z3);
                        show(SharedMediaLayout.this.searching && (SharedMediaLayout.this.getSelectedTab() == 11 || SharedMediaLayout.this.getSelectedTab() == 12) && SharedMediaLayout.this.searchTagsList.hasFilters());
                        ActionBarMenuItem actionBarMenuItem8 = SharedMediaLayout.this.searchItemIcon;
                        if (actionBarMenuItem8 != null) {
                            actionBarMenuItem8.setIcon((hasFilters() && SharedMediaLayout.this.profileActivity.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search, z3);
                        }
                        if (SharedMediaLayout.this.searchItem != null) {
                            ActionBarMenuItem actionBarMenuItem9 = SharedMediaLayout.this.searchItem;
                            SearchTagsList searchTagsList4 = SharedMediaLayout.this.searchTagsList;
                            actionBarMenuItem9.setSearchFieldHint(LocaleController.getString((searchTagsList4 != null && searchTagsList4.hasFilters() && SharedMediaLayout.this.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                        }
                    }
                };
                SharedMediaLayout sharedMediaLayout3 = sharedMediaLayout2;
                sharedMediaLayout3.searchTagsList = searchTagsList3;
                searchTagsList3.setBlurredFactory(blurredBackgroundDrawableViewFactory3, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                sharedMediaLayout3.searchTagsList.setShown(0.0f);
                sharedMediaLayout3.addView(sharedMediaLayout3.searchTagsList, LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                sharedMediaLayout3.addView(sharedMediaLayout3.actionModeLayout, LayoutHelper.createFrame(-1, 48, 51));
                sharedMediaLayout = sharedMediaLayout3;
            }
            sharedMediaLayout.updateTabs(false);
            sharedMediaLayout.switchToCurrentSelectedMode(false);
            if (sharedMediaLayout.hasMedia[0] >= 0) {
                sharedMediaLayout.loadFastScrollData(false);
            }
            profileStoriesCollectionTabs2 = sharedMediaLayout.storiesContainer;
            if (profileStoriesCollectionTabs2 != null && i3 > 0) {
                profileStoriesCollectionTabs2.setInitialTabId(i3);
            }
            sharedMediaLayout.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda27(sharedMediaLayout, 2);
        }
        sharedMediaLayout2.botPreviewsContainer = sharedMediaLayout2.new AnonymousClass12(context, sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id);
        resourcesProvider2 = resourcesProvider;
        sharedMediaLayout2.setWillNotDraw(false);
        top = 0;
        iFindFirstVisibleItemPosition = -1;
        i5 = 0;
        while (true) {
            mediaPageArr = sharedMediaLayout2.mediaPages;
            if (i5 < mediaPageArr.length) {
                break;
                break;
            }
            if (i5 == 0) {
                i6 = top;
                i7 = iFindFirstVisibleItemPosition;
            } else {
                i6 = top;
                i7 = iFindFirstVisibleItemPosition;
            }
            mediaPage = new MediaPage(context) {
                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    if (SharedMediaLayout.this.tabsAnimationInProgress) {
                        if (SharedMediaLayout.this.mediaPages[0] == this) {
                            float fAbs = Math.abs(SharedMediaLayout.this.mediaPages[0].getTranslationX()) / SharedMediaLayout.this.mediaPages[0].getMeasuredWidth();
                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                            sharedMediaLayout4.selectTabWithId(sharedMediaLayout4.mediaPages[1].selectedType, fAbs);
                            if (SharedMediaLayout.this.canShowSearchItem()) {
                                if (SharedMediaLayout.this.searchItemState == 2) {
                                    SharedMediaLayout.this.searchAlpha = 1.0f - fAbs;
                                } else if (SharedMediaLayout.this.searchItemState == 1) {
                                    SharedMediaLayout.this.searchAlpha = fAbs;
                                }
                                SharedMediaLayout.this.updateSearchItemIcon(fAbs);
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                sharedMediaLayout5.optionsAlpha = sharedMediaLayout5.getPhotoVideoOptionsAlpha(fAbs);
                                SharedMediaLayout sharedMediaLayout6 = SharedMediaLayout.this;
                                sharedMediaLayout6.photoVideoOptionsItem.setVisibility((sharedMediaLayout6.optionsAlpha == 0.0f || !SharedMediaLayout.this.canShowSearchItem() || SharedMediaLayout.this.isArchivedOnlyStoriesView()) ? 4 : 0);
                            } else {
                                SharedMediaLayout.this.searchAlpha = 0.0f;
                            }
                            SharedMediaLayout.this.updateOptionsSearch();
                        }
                    }
                    SharedMediaLayout.this.checkStoriesTabsPosition();
                    SharedMediaLayout.this.checkUi_topPanelLayoutY();
                    SharedMediaLayout.this.invalidateBlur();
                }
            };
            sharedMediaLayout2.addView(mediaPage, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, sharedMediaLayout2.mediaPageTopMargin(), 0.0f, 0.0f));
            if (i5 == i18) {
                mediaPage.setTranslationX(AndroidUtilities.displaySize.x);
            }
            sharedMediaLayout2.mediaPages[i5] = mediaPage;
            extendedGridLayoutManager = mediaPage.layoutManager = new ExtendedGridLayoutManager(context, 100) {
                private Size size = new Size();

                @Override
                public void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr2) {
                    super.calculateExtraLayoutSpace(state, iArr2);
                    int i23 = mediaPage.selectedType;
                    if (i23 == 0 || SharedMediaLayout.isAnyStoryPageType(i23)) {
                        iArr2[1] = Math.max(iArr2[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                    } else if (mediaPage.selectedType == 1) {
                        iArr2[1] = Math.max(iArr2[1], AndroidUtilities.dp(56.0f) * 2);
                    }
                }

                @Override
                public int getFlowItemCount() {
                    if (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                        return 0;
                    }
                    return getItemCount();
                }

                @Override
                public Size getSizeForItem(int i23) {
                    int i24;
                    int i25;
                    TLRPC.Document document = (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter || SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? null : SharedMediaLayout.this.sharedMediaData[5].messages.get(i23).getDocument();
                    Size size = this.size;
                    size.height = 100.0f;
                    size.width = 100.0f;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (closestPhotoSizeWithSize != null && (i24 = closestPhotoSizeWithSize.w) != 0 && (i25 = closestPhotoSizeWithSize.h) != 0) {
                            Size size2 = this.size;
                            size2.width = i24;
                            size2.height = i25;
                        }
                        ArrayList<TLRPC.DocumentAttribute> arrayList2 = document.attributes;
                        for (int i26 = 0; i26 < arrayList2.size(); i26++) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList2.get(i26);
                            if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                Size size3 = this.size;
                                size3.width = documentAttribute.w;
                                size3.height = documentAttribute.h;
                                break;
                            }
                        }
                    }
                    return this.size;
                }

                @Override
                public void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfoCompat.mInfo.getCollectionItemInfo();
                    zzcv zzcvVar = collectionItemInfo != null ? new zzcv(collectionItemInfo, 8) : null;
                    if (zzcvVar != null) {
                        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) zzcvVar.zza;
                        if (collectionItemInfo2.isHeading()) {
                            accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        }
                    }
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            };
            extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                private int getSpanSizeInternal(int i23) {
                    int i24 = SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0];
                    if (mediaPage.listView.getAdapter() == SharedMediaLayout.this.photoVideoAdapter) {
                        if (SharedMediaLayout.this.photoVideoAdapter.getItemViewType(i23) != 2) {
                            return 1;
                        }
                    } else {
                        if (SharedMediaLayout.this.storyAlbums_getTabTypeByStoriesAdapter(mediaPage.listView.getAdapter()) == -1) {
                            if (mediaPage.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                                return mediaPage.layoutManager.getSpanCount();
                            }
                            return (mediaPage.listView.getAdapter() == SharedMediaLayout.this.gifAdapter && SharedMediaLayout.this.sharedMediaData[5].messages.isEmpty()) ? mediaPage.layoutManager.getSpanCount() : mediaPage.layoutManager.getSpanSizeForItem(i23);
                        }
                        if (mediaPage.listView.getAdapter().getItemViewType(i23) != 2) {
                            return 1;
                        }
                    }
                    return i24;
                }

                @Override
                public int getSpanSize(int i23) {
                    return Math.min(getSpanSizeInternal(i23), mediaPage.layoutManager.getSpanCount());
                }
            });
            sharedMediaLayout2.mediaPages[i5].itemAnimator = new DefaultItemAnimator();
            sharedMediaLayout2.mediaPages[i5].itemAnimator.setDurations(280L);
            sharedMediaLayout2.mediaPages[i5].itemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            sharedMediaLayout2.mediaPages[i5].itemAnimator.setSupportsChangeAnimations(false);
            sharedMediaLayout2.mediaPages[i5].listView = new SharedMediaListView(context) {
                float lastY;
                float startY;

                private View findOuterScrollingAncestor() {
                    try {
                        for (Object parent = getParent(); parent instanceof View; parent = ((View) parent).getParent()) {
                            if (parent != this && (parent instanceof RecyclerView)) {
                                return (View) parent;
                            }
                        }
                        return null;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return null;
                    }
                }

                @Override
                public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
                    float f;
                    if (sharedPhotoVideoCell2.getMessageId() != mediaPage.highlightMessageId || !sharedPhotoVideoCell2.imageReceiver.hasBitmapImage()) {
                        sharedPhotoVideoCell2.setHighlightProgress(0.0f);
                        return;
                    }
                    MediaPage mediaPage8 = mediaPage;
                    if (!mediaPage8.highlightAnimation) {
                        mediaPage8.highlightProgress = 0.0f;
                        mediaPage8.highlightAnimation = true;
                    }
                    float f2 = mediaPage8.highlightProgress;
                    if (f2 < 0.3f) {
                        f = f2 / 0.3f;
                    } else {
                        f = f2 > 0.7f ? (1.0f - f2) / 0.3f : 1.0f;
                    }
                    sharedPhotoVideoCell2.setHighlightProgress(f);
                }

                @Override
                public void dispatchDraw(Canvas canvas) {
                    View childAt;
                    View childAt2;
                    if ((getAdapter() == SharedMediaLayout.this.archivedStoriesAdapter || getAdapter() == SharedMediaLayout.this.storiesAdapter) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && getChildAdapterPosition(childAt) == 0) {
                        int top2 = childAt.getTop();
                        if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                            if (SharedMediaLayout.this.changeColumnsTab == (getAdapter() == SharedMediaLayout.this.storiesAdapter ? 8 : 9) && mediaPage.animationSupportingListView.getChildCount() > 0 && (childAt2 = mediaPage.animationSupportingListView.getChildAt(0)) != null && mediaPage.animationSupportingListView.getChildAdapterPosition(childAt2) == 0) {
                                top2 = AndroidUtilities.lerp(top2, childAt2.getTop(), SharedMediaLayout.this.photoVideoChangeColumnsProgress);
                            }
                        }
                        if (getAdapter() != SharedMediaLayout.this.storiesAdapter) {
                            if (this.archivedHintPaint == null) {
                                TextPaint textPaint = new TextPaint(1);
                                this.archivedHintPaint = textPaint;
                                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                                this.archivedHintPaint.setColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
                            }
                            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                            StaticLayout staticLayout = this.archivedHintLayout;
                            if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                                this.archivedHintLayout = new StaticLayout(LocaleController.getString(SharedMediaLayout.this.isArchivedOnlyStoriesView() ? SharedMediaLayout.this.profileActivity != null && ChatObject.isChannelAndNotMegaGroup(SharedMediaLayout.this.profileActivity.getMessagesController().getChat(Long.valueOf(-SharedMediaLayout.this.dialog_id))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.archivedHintPaint, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                                this.archivedHintLayoutWidth = 0.0f;
                                this.archivedHintLayoutLeft = measuredWidth;
                                for (int i23 = 0; i23 < this.archivedHintLayout.getLineCount(); i23++) {
                                    this.archivedHintLayoutWidth = Math.max(this.archivedHintLayoutWidth, this.archivedHintLayout.getLineWidth(i23));
                                    this.archivedHintLayoutLeft = Math.min(this.archivedHintLayoutLeft, this.archivedHintLayout.getLineLeft(i23));
                                }
                            }
                            canvas.save();
                            canvas.translate(((getWidth() - this.archivedHintLayoutWidth) / 2.0f) - this.archivedHintLayoutLeft, top2 - ((this.archivedHintLayout.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                            this.archivedHintLayout.draw(canvas);
                            canvas.restore();
                        }
                    }
                    super.dispatchDraw(canvas);
                    MediaPage mediaPage8 = mediaPage;
                    if (mediaPage8.highlightAnimation) {
                        float f = mediaPage8.highlightProgress + 0.010666667f;
                        mediaPage8.highlightProgress = f;
                        if (f >= 1.0f) {
                            mediaPage8.highlightProgress = 0.0f;
                            mediaPage8.highlightAnimation = false;
                            mediaPage8.highlightMessageId = 0;
                        }
                        invalidate();
                    }
                    if (this.poller == null) {
                        int currentAccount2 = SharedMediaLayout.this.profileActivity.getCurrentAccount();
                        UserListPoller[] userListPollerArr = UserListPoller.istances;
                        if (userListPollerArr[currentAccount2] == null) {
                            userListPollerArr[currentAccount2] = new UserListPoller(currentAccount2);
                        }
                        this.poller = userListPollerArr[currentAccount2];
                    }
                    this.poller.checkList(this);
                    if (isChangeColumnsAnimation()) {
                        return;
                    }
                    SharedMediaLayout.this.changeColumnsTab = -1;
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (SharedMediaLayout.this.profileActivity == null || !SharedMediaLayout.this.profileActivity.isInPreviewMode()) {
                        return super.dispatchTouchEvent(motionEvent);
                    }
                    this.lastY = motionEvent.getY();
                    if (motionEvent.getAction() == 1) {
                        SharedMediaLayout.this.profileActivity.finishPreviewFragment();
                    } else if (motionEvent.getAction() == 2) {
                        float f = this.startY - this.lastY;
                        SharedMediaLayout.this.profileActivity.movePreviewFragment(f);
                        if (f < 0.0f) {
                            this.startY = this.lastY;
                        }
                    }
                    return true;
                }

                @Override
                public void emptyViewUpdated(boolean z3, boolean z4) {
                }

                @Override
                public int getAnimateToColumnsCount() {
                    return SharedMediaLayout.this.animateToColumnsCount;
                }

                @Override
                public float getChangeColumnsProgress() {
                    return SharedMediaLayout.this.photoVideoChangeColumnsProgress;
                }

                @Override
                public int getColumnsCount() {
                    return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab) ? SharedMediaLayout.this.mediaColumnsCount[1] : SharedMediaLayout.this.mediaColumnsCount[0];
                }

                @Override
                public SparseArray<Float> getMessageAlphaEnter() {
                    return SharedMediaLayout.this.messageAlphaEnter;
                }

                @Override
                public RecyclerListView.FastScrollAdapter getMovingAdapter() {
                    if (!SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab)) {
                        return SharedMediaLayout.this.photoVideoAdapter;
                    }
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    return sharedMediaLayout4.storyAlbums_getStoriesAdapterByTabType(sharedMediaLayout4.changeColumnsTab);
                }

                @Override
                public Integer getSelectorColor(int i23) {
                    if (getAdapter() == SharedMediaLayout.this.channelRecommendationsAdapter && SharedMediaLayout.this.channelRecommendationsAdapter.more > 0 && i23 == SharedMediaLayout.this.channelRecommendationsAdapter.getItemCount() - 1) {
                        return 0;
                    }
                    return super.getSelectorColor(i23);
                }

                @Override
                public RecyclerListView.FastScrollAdapter getSupportingAdapter() {
                    if (!SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab)) {
                        return SharedMediaLayout.this.animationSupportingPhotoVideoAdapter;
                    }
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    return sharedMediaLayout4.storyAlbums_getStoriesSupportingAdapterByTabType(sharedMediaLayout4.changeColumnsTab);
                }

                @Override
                public InternalListView getSupportingListView() {
                    return mediaPage.animationSupportingListView;
                }

                @Override
                public boolean isChangeColumnsAnimation() {
                    return SharedMediaLayout.this.photoVideoChangeColumnsAnimation;
                }

                @Override
                public boolean isStories() {
                    return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab);
                }

                @Override
                public boolean isThisListView() {
                    return this == mediaPage.listView;
                }

                @Override
                public void onLayout(boolean z3, int i23, int i24, int i25, int i26) {
                    super.onLayout(z3, i23, i24, i25, i26);
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    MediaPage mediaPage8 = mediaPage;
                    sharedMediaLayout4.checkLoadMoreScroll(mediaPage8, mediaPage8.listView, extendedGridLayoutManager);
                    if (mediaPage.selectedType == 0) {
                        PhotoViewer.getInstance().checkCurrentImageVisibility();
                    }
                }

                @Override
                public void onScrolled(int i23, int i24) {
                    super.onScrolled(i23, i24);
                    if (this.scrollingByUser && SharedMediaLayout.this.getSelectedTab() == 11 && SharedMediaLayout.this.profileActivity != null) {
                        AndroidUtilities.hideKeyboard(SharedMediaLayout.this.profileActivity.getParentActivity().getCurrentFocus());
                    }
                    SharedMediaLayout.this.checkStoriesTabsPosition();
                    if (getAdapter() == SharedMediaLayout.this.pollAdapter) {
                        SharedMediaLayout.this.pollAdapter.onScrolled(this);
                    }
                }

                @Override
                public boolean performAccessibilityAction(int i23, Bundle bundle2) {
                    View viewFindOuterScrollingAncestor;
                    try {
                        if (i23 != 4096) {
                            if (i23 == 8192) {
                                if (!canScrollVertically(-1) && (viewFindOuterScrollingAncestor = findOuterScrollingAncestor()) != null && viewFindOuterScrollingAncestor.canScrollVertically(-1) && viewFindOuterScrollingAncestor.performAccessibilityAction(i23, bundle2)) {
                                    return true;
                                }
                            }
                            return super.performAccessibilityAction(i23, bundle2);
                        }
                        View viewFindOuterScrollingAncestor2 = findOuterScrollingAncestor();
                        if (viewFindOuterScrollingAncestor2 != null && viewFindOuterScrollingAncestor2.canScrollVertically(1) && viewFindOuterScrollingAncestor2.performAccessibilityAction(i23, bundle2)) {
                            return true;
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    return super.performAccessibilityAction(i23, bundle2);
                }
            };
            sharedMediaLayout2.mediaPages[i5].listView.setFastScrollEnabled(i18);
            sharedMediaLayout2.mediaPages[i5].listView.setScrollingTouchSlop(i18);
            sharedMediaLayout2.mediaPages[i5].listView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
            sharedMediaLayout2.mediaPages[i5].listView.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
            sharedMediaLayout2.mediaPages[i5].listView.lambda$onCellEnter$52(null);
            sharedMediaLayout2.mediaPages[i5].listView.setClipToPadding(false);
            sharedMediaLayout2.mediaPages[i5].listView.setSectionsType(2);
            sharedMediaLayout2.mediaPages[i5].listView.setLayoutManager(extendedGridLayoutManager);
            MediaPage mediaPage8 = sharedMediaLayout2.mediaPages[i5];
            mediaPage8.addView(mediaPage8.listView, LayoutHelper.createFrame(-1, -1.0f));
            sharedMediaLayout2.mediaPages[i5].animationSupportingListView = new InternalListView(context);
            sharedMediaLayout2.mediaPages[i5].animationSupportingListView.setLayoutManager(sharedMediaLayout2.mediaPages[i5].animationSupportingLayoutManager = new GridLayoutManager(context, 3) {
                {
                    super(i);
                }

                @Override
                public int scrollVerticallyBy(int i23, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                        i23 = 0;
                    }
                    return super.scrollVerticallyBy(i23, recycler, state);
                }

                @Override
                public boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            });
            MediaPage mediaPage9 = sharedMediaLayout2.mediaPages[i5];
            mediaPage9.addView(mediaPage9.animationSupportingListView, LayoutHelper.createFrame(-1, -1.0f));
            sharedMediaLayout2.mediaPages[i5].animationSupportingListView.setVisibility(8);
            sharedMediaLayout2.mediaPages[i5].animationSupportingListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    int childAdapterPosition = mediaPage.animationSupportingListView.getChildAdapterPosition(sharedPhotoVideoCell2);
                    int spanCount = mediaPage.animationSupportingLayoutManager.getSpanCount();
                    sharedPhotoVideoCell2.isTop = childAdapterPosition < spanCount;
                    int i23 = childAdapterPosition % spanCount;
                    sharedPhotoVideoCell2.isFirst = i23 == 0;
                    sharedPhotoVideoCell2.isLast = i23 == spanCount - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            sharedMediaLayout2.mediaPages[i5].listView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (mediaPage.listView.getAdapter() == SharedMediaLayout.this.gifAdapter) {
                        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                        rect.left = 0;
                        rect.bottom = 0;
                        if (mediaPage.layoutManager.isFirstRow(childAdapterPosition)) {
                            rect.top = 0;
                        } else {
                            rect.top = AndroidUtilities.dp(2.0f);
                        }
                        rect.right = mediaPage.layoutManager.isLastInRow(childAdapterPosition) ? 0 : AndroidUtilities.dp(2.0f);
                        return;
                    }
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    int childAdapterPosition2 = mediaPage.listView.getChildAdapterPosition(sharedPhotoVideoCell2);
                    int spanCount = mediaPage.layoutManager.getSpanCount();
                    sharedPhotoVideoCell2.isTop = childAdapterPosition2 < spanCount;
                    int i23 = childAdapterPosition2 % spanCount;
                    sharedPhotoVideoCell2.isFirst = i23 == 0;
                    sharedPhotoVideoCell2.isLast = i23 == spanCount - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            sharedMediaLayout2.mediaPages[i5].listView.setOnItemClickListener(new ChatActivity$$ExternalSyntheticLambda48(sharedMediaLayout2, mediaPage, context, j, resourcesProvider2, 1));
            sharedMediaLayout2.mediaPages[i5].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i23) {
                    SharedMediaLayout.this.scrolling = i23 != 0;
                }

                @Override
                public void onScrolled(RecyclerView recyclerView, int i23, int i24) {
                    int i25;
                    SharedMediaLayout.this.checkLoadMoreScroll(mediaPage, (RecyclerListView) recyclerView, extendedGridLayoutManager);
                    if (i24 != 0 && ((SharedMediaLayout.this.mediaPages[0].selectedType == 0 || SharedMediaLayout.this.mediaPages[0].selectedType == 5) && !SharedMediaLayout.this.sharedMediaData[0].messages.isEmpty())) {
                        SharedMediaLayout.this.showFloatingDateView();
                    }
                    if (i24 != 0 && ((i25 = mediaPage.selectedType) == 0 || SharedMediaLayout.isAnyStoryPageType(i25))) {
                        SharedMediaLayout.showFastScrollHint(mediaPage, SharedMediaLayout.this.sharedMediaData, true);
                    }
                    mediaPage.listView.checkSection(true);
                    MediaPage mediaPage10 = mediaPage;
                    if (mediaPage10.fastScrollHintView != null) {
                        mediaPage10.invalidate();
                    }
                    SharedMediaLayout.this.invalidateBlur();
                }
            });
            sharedMediaLayout2.mediaPages[i5].listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
                @Override
                public boolean mo2353onItemClick(View view, int i23, float f, float f2) {
                    int iIntValue;
                    if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation || mediaPage.listView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                        return false;
                    }
                    SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                    if (sharedMediaLayout4.isActionModeShowed) {
                        MediaPage mediaPage10 = mediaPage;
                        if (mediaPage10.selectedType != 11) {
                            mediaPage10.listView.clickItem(view, i23);
                            return true;
                        }
                    }
                    int i24 = mediaPage.selectedType;
                    if (i24 == 7 && (view instanceof UserCell)) {
                        if (sharedMediaLayout4.chatUsersAdapter.sortedUsers.isEmpty()) {
                            iIntValue = i23;
                        } else {
                            if (i23 >= SharedMediaLayout.this.chatUsersAdapter.sortedUsers.size()) {
                                return false;
                            }
                            iIntValue = ((Integer) SharedMediaLayout.this.chatUsersAdapter.sortedUsers.get(i23)).intValue();
                        }
                        if (iIntValue < 0 || iIntValue >= SharedMediaLayout.this.chatUsersAdapter.chatInfo.participants.participants.size()) {
                            return false;
                        }
                        TLRPC.ChatParticipant chatParticipant = SharedMediaLayout.this.chatUsersAdapter.chatInfo.participants.participants.get(iIntValue);
                        RecyclerListView recyclerListView = (RecyclerListView) view.getParent();
                        for (int i25 = 0; i25 < recyclerListView.getChildCount(); i25++) {
                            View childAt = recyclerListView.getChildAt(i25);
                            if (recyclerListView.getChildAdapterPosition(childAt) == i23) {
                                view = childAt;
                                break;
                            }
                        }
                        return SharedMediaLayout.this.onMemberClick(chatParticipant, true, view);
                    }
                    if (i24 == 1 && (view instanceof SharedDocumentCell)) {
                        return sharedMediaLayout4.onItemLongClick(((SharedDocumentCell) view).getMessage(), view, 0);
                    }
                    if (i24 == 3 && (view instanceof SharedLinkCell)) {
                        return sharedMediaLayout4.onItemLongClick(((SharedLinkCell) view).getMessage(), view, 0);
                    }
                    if ((i24 == 2 || i24 == 4) && (view instanceof SharedAudioCell)) {
                        return sharedMediaLayout4.onItemLongClick(((SharedAudioCell) view).getMessage(), view, 0);
                    }
                    if (i24 == 5 && (view instanceof ContextLinkCell)) {
                        return sharedMediaLayout4.onItemLongClick((MessageObject) ((ContextLinkCell) view).getParentObject(), view, 0);
                    }
                    if ((i24 == 0 || (SharedMediaLayout.isAnyStoryPageType(i24) && SharedMediaLayout.this.canEditStories())) && (view instanceof SharedPhotoVideoCell2)) {
                        MessageObject messageObject = ((SharedPhotoVideoCell2) view).getMessageObject();
                        if (messageObject != null) {
                            return SharedMediaLayout.this.onItemLongClick(messageObject, view, mediaPage.selectedType);
                        }
                    } else {
                        int i26 = mediaPage.selectedType;
                        if (i26 == 10) {
                            SharedMediaLayout.this.channelRecommendationsAdapter.openPreview(i23);
                            return true;
                        }
                        if (i26 == 11) {
                            SharedMediaLayout.this.savedDialogsAdapter.select(view);
                            return true;
                        }
                    }
                    return false;
                }

                @Override
                public void onLongClickRelease() {
                    if (SharedMediaLayout.this.profileActivity != null) {
                        Point point = AndroidUtilities.displaySize;
                        if (point.x > point.y) {
                            SharedMediaLayout.this.profileActivity.finishPreviewFragment();
                        }
                    }
                }

                @Override
                public void onMove(float f, float f2) {
                    if (SharedMediaLayout.this.profileActivity != null) {
                        Point point = AndroidUtilities.displaySize;
                        if (point.x > point.y) {
                            SharedMediaLayout.this.profileActivity.movePreviewFragment(f2);
                        }
                    }
                }
            });
            if (i5 == 0) {
                extendedGridLayoutManager.scrollToPositionWithOffset(i7, i6);
            }
            final RecyclerListView internalListView2 = sharedMediaLayout2.mediaPages[i5].listView;
            sharedMediaLayout2.mediaPages[i5].animatingImageView = new ClippingImageView(context) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    internalListView2.invalidate();
                }
            };
            sharedMediaLayout2.mediaPages[i5].animatingImageView.setVisibility(8);
            sharedMediaLayout2.mediaPages[i5].listView.addOverlayView(sharedMediaLayout2.mediaPages[i5].animatingImageView, LayoutHelper.createFrame(-1, -1.0f));
            sharedMediaLayout2.mediaPages[i5].progressView = new FlickerLoadingView(context) {
                @Override
                public int getColumnsCount() {
                    return SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0];
                }

                @Override
                public int getViewType() {
                    setIsSingleCell(false);
                    int i23 = mediaPage.selectedType;
                    if (i23 == 0 || i23 == 5) {
                        return 2;
                    }
                    if (i23 == 1) {
                        return 3;
                    }
                    if (i23 == 2 || i23 == 4) {
                        return 6;
                    }
                    if (i23 == 3) {
                        return 5;
                    }
                    if (i23 == 7) {
                        return 6;
                    }
                    if (i23 != 6) {
                        return SharedMediaLayout.isAnyStoryPageType(i23) ? 27 : 1;
                    }
                    if (SharedMediaLayout.this.scrollSlidingTextTabStrip.getTabsCount() == 1) {
                        setIsSingleCell(true);
                    }
                    return 1;
                }

                @Override
                public void onDraw(Canvas canvas) {
                    SharedMediaLayout.this.backgroundPaint.setColor(SharedMediaLayout.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), SharedMediaLayout.this.backgroundPaint);
                    super.onDraw(canvas);
                }
            };
            sharedMediaLayout2.mediaPages[i5].progressView.showDate(false);
            sharedMediaLayout2.mediaPages[i5].progressView.setClipToOutline(true);
            sharedMediaLayout2.mediaPages[i5].progressView.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
                }
            });
            if (i5 != 0) {
                sharedMediaLayout2.mediaPages[i5].setVisibility(8);
            }
            MediaPage mediaPage10 = sharedMediaLayout2.mediaPages[i5];
            mediaPage10.emptyView = new StickerEmptyView(context, mediaPage10.progressView, 1) {
                @Override
                public void onVisibilityChange(float f) {
                    super.onVisibilityChange(f);
                    SharedMediaLayout.this.onBottomButtonVisibilityChange();
                }
            };
            sharedMediaLayout2.mediaPages[i5].emptyView.setVisibility(8, false);
            sharedMediaLayout2.mediaPages[i5].emptyView.setAnimateLayoutChange(true);
            MediaPage mediaPage11 = sharedMediaLayout2.mediaPages[i5];
            mediaPage11.addView(mediaPage11.emptyView, LayoutHelper.createFrame(-1, -1.0f));
            sharedMediaLayout2.mediaPages[i5].emptyView.setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(28));
            sharedMediaLayout2.mediaPages[i5].emptyView.showProgress(true, false);
            sharedMediaLayout2.mediaPages[i5].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
            sharedMediaLayout2.mediaPages[i5].emptyView.button.setVisibility(8);
            sharedMediaLayout2.mediaPages[i5].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            sharedMediaLayout2.mediaPages[i5].emptyView.button.setVisibility(8);
            sharedMediaLayout2.mediaPages[i5].emptyView.addView(sharedMediaLayout2.mediaPages[i5].progressView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            sharedMediaLayout2.mediaPages[i5].listView.setEmptyView(sharedMediaLayout2.mediaPages[i5].emptyView);
            sharedMediaLayout2.mediaPages[i5].listView.setAnimateEmptyView(true, 0);
            MediaPage mediaPage12 = sharedMediaLayout2.mediaPages[i5];
            mediaPage12.scrollHelper = new RecyclerAnimationScrollHelper(mediaPage12.listView, sharedMediaLayout2.mediaPages[i5].layoutManager);
            i5++;
            resourcesProvider2 = resourcesProvider;
            top = i6;
            iFindFirstVisibleItemPosition = i7;
            i18 = 1;
        }
        profileStoriesCollectionTabs = sharedMediaLayout2.storiesContainer;
        if (profileStoriesCollectionTabs != null) {
            sharedMediaLayout2.addView(profileStoriesCollectionTabs, LayoutHelper.createFrame(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        ChatActionCell chatActionCell2 = new ChatActionCell(context);
        sharedMediaLayout2.floatingDateView = chatActionCell2;
        chatActionCell2.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
        sharedMediaLayout2.floatingDateView.setAlpha(0.0f);
        sharedMediaLayout2.floatingDateView.setOverrideColor(Theme.key_chat_mediaTimeBackground, Theme.key_chat_mediaTimeText);
        sharedMediaLayout2.floatingDateView.setTranslationY(-AndroidUtilities.dp(48.0f));
        sharedMediaLayout2.addView(sharedMediaLayout2.floatingDateView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        zCustomTabs = sharedMediaLayout2.customTabs();
        sharedMediaLayout = sharedMediaLayout2;
        if (!zCustomTabs) {
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout3 = new DialogsActivityTopPanelLayout(context);
            sharedMediaLayout2.topPanelLayout = dialogsActivityTopPanelLayout3;
            dialogsActivityTopPanelLayout3.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = blurredBackgroundDrawableViewFactory3.create(sharedMediaLayout2.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
            Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate3, AndroidUtilities.dp(24.0f), 7.0f);
            sharedMediaLayout2.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate3);
            FrameLayout frameLayout2 = new FrameLayout(context);
            sharedMediaLayout2.fragmentContextViewWrapper = frameLayout2;
            sharedMediaLayout2.topPanelLayout.addView(frameLayout2);
            sharedMediaLayout2.topPanelLayout.setViewVisible(sharedMediaLayout2.fragmentContextViewWrapper, true, false);
            sharedMediaLayout2.topPanelLayout.setOnAnimatedHeightChangedListener(new SharedMediaLayout$$ExternalSyntheticLambda55(sharedMediaLayout2, 1));
            FragmentContextView fragmentContextView2 = new FragmentContextView(context, baseFragment, this, false, resourcesProvider) {
                @Override
                public void setVisibility(int i23) {
                    SharedMediaLayout.this.topPanelLayout.setViewVisible(SharedMediaLayout.this.fragmentContextViewWrapper, i23 == 0);
                }
            };
            sharedMediaLayout2.fragmentContextView = fragmentContextView2;
            sharedMediaLayout2.fragmentContextViewWrapper.addView(fragmentContextView2);
            sharedMediaLayout2.topPanelLayout.setCallFragmentContextView(sharedMediaLayout2.fragmentContextView);
            sharedMediaLayout2.addView(sharedMediaLayout2.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
            sharedMediaLayout2.fragmentContextView.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(sharedMediaLayout2, 17));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = blurredBackgroundDrawableViewFactory3.create(sharedMediaLayout2.scrollSlidingTextTabStrip, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
            Theme.ResourcesProvider.CC.m(blurredBackgroundDrawableCreate4, AndroidUtilities.dp(18.0f), 6.666f);
            sharedMediaLayout2.scrollSlidingTextTabStrip.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
            sharedMediaLayout2.scrollSlidingTextTabStrip.setClipToPadding(false);
            sharedMediaLayout2.scrollSlidingTextTabStrip.setBackground(null);
            sharedMediaLayout2.scrollSlidingTextTabStrip.setBlurredBackground(blurredBackgroundDrawableCreate4);
            sharedMediaLayout2.scrollSlidingTextTabStrip.setOpen(false);
            sharedMediaLayout2.addView(sharedMediaLayout2.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
            Context context3 = sharedMediaLayout2.getContext();
            BaseFragment baseFragment5 = sharedMediaLayout2.profileActivity;
            int currentAccount2 = baseFragment5.getCurrentAccount();
            if (sharedMediaLayout2.includeSavedDialogs()) {
                j2 = 0;
            } else {
                j2 = sharedMediaLayout2.dialog_id;
            }
            SearchTagsList searchTagsList4 = new SearchTagsList(context3, baseFragment5, currentAccount2, j2, resourcesProvider) {
                @Override
                public void onShownUpdate(boolean z3) {
                    SharedMediaLayout.this.scrollSlidingTextTabStrip.setAlpha(1.0f - this.shownT);
                    ScrollSlidingTextTabStripInner scrollSlidingTextTabStripInner2 = SharedMediaLayout.this.scrollSlidingTextTabStrip;
                    scrollSlidingTextTabStripInner2.setPivotX(scrollSlidingTextTabStripInner2.getWidth() / 2.0f);
                    SharedMediaLayout.this.scrollSlidingTextTabStrip.setScaleX(((1.0f - this.shownT) * 0.2f) + 0.8f);
                    SharedMediaLayout.this.scrollSlidingTextTabStrip.setPivotY(AndroidUtilities.dp(48.0f));
                    SharedMediaLayout.this.scrollSlidingTextTabStrip.setScaleY(((1.0f - this.shownT) * 0.2f) + 0.8f);
                }

                @Override
                public boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                    if (SharedMediaLayout.this.searchItem == null) {
                        return false;
                    }
                    SharedMediaLayout.this.searchingReaction = visibleReaction;
                    String string = SharedMediaLayout.this.searchItem.getSearchField().getText().toString();
                    SharedMediaLayout.this.searchWas = (string.length() == 0 && SharedMediaLayout.this.searchingReaction == null) ? false : true;
                    SharedMediaLayout.this.switchToCurrentSelectedMode(false);
                    if (SharedMediaLayout.this.mediaPages[0].selectedType == 11) {
                        if (SharedMediaLayout.this.savedMessagesSearchAdapter != null) {
                            SharedMediaLayout.this.savedMessagesSearchAdapter.search(string, SharedMediaLayout.this.searchingReaction);
                        }
                        AndroidUtilities.hideKeyboard(SharedMediaLayout.this.searchItem.getSearchField());
                    } else if (SharedMediaLayout.this.mediaPages[0].selectedType == 12 && SharedMediaLayout.this.savedMessagesContainer != null) {
                        SharedMediaLayout.this.savedMessagesContainer.chatActivity.setTagFilter(visibleReaction);
                    }
                    return true;
                }

                @Override
                public void updateTags(boolean z3) {
                    super.updateTags(z3);
                    show(SharedMediaLayout.this.searching && (SharedMediaLayout.this.getSelectedTab() == 11 || SharedMediaLayout.this.getSelectedTab() == 12) && SharedMediaLayout.this.searchTagsList.hasFilters());
                    ActionBarMenuItem actionBarMenuItem8 = SharedMediaLayout.this.searchItemIcon;
                    if (actionBarMenuItem8 != null) {
                        actionBarMenuItem8.setIcon((hasFilters() && SharedMediaLayout.this.profileActivity.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search, z3);
                    }
                    if (SharedMediaLayout.this.searchItem != null) {
                        ActionBarMenuItem actionBarMenuItem9 = SharedMediaLayout.this.searchItem;
                        SearchTagsList searchTagsList5 = SharedMediaLayout.this.searchTagsList;
                        actionBarMenuItem9.setSearchFieldHint(LocaleController.getString((searchTagsList5 != null && searchTagsList5.hasFilters() && SharedMediaLayout.this.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    }
                }
            };
            SharedMediaLayout sharedMediaLayout4 = sharedMediaLayout2;
            sharedMediaLayout4.searchTagsList = searchTagsList4;
            searchTagsList4.setBlurredFactory(blurredBackgroundDrawableViewFactory3, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
            sharedMediaLayout4.searchTagsList.setShown(0.0f);
            sharedMediaLayout4.addView(sharedMediaLayout4.searchTagsList, LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            sharedMediaLayout4.addView(sharedMediaLayout4.actionModeLayout, LayoutHelper.createFrame(-1, 48, 51));
            sharedMediaLayout = sharedMediaLayout4;
        }
        sharedMediaLayout.updateTabs(false);
        sharedMediaLayout.switchToCurrentSelectedMode(false);
        if (sharedMediaLayout.hasMedia[0] >= 0) {
            sharedMediaLayout.loadFastScrollData(false);
        }
        profileStoriesCollectionTabs2 = sharedMediaLayout.storiesContainer;
        if (profileStoriesCollectionTabs2 != null) {
            profileStoriesCollectionTabs2.setInitialTabId(i3);
        }
        sharedMediaLayout.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda27(sharedMediaLayout, 2);
    }

    private boolean onItemLongClick(MessageObject messageObject, View view, int i, boolean z) {
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs;
        StoriesAdapter storiesAdapter;
        StoriesController.StoriesList storiesList;
        StoriesController.StoryAlbum storyAlbumFindById;
        int i2 = 13;
        final int i3 = 3;
        final int i4 = 1;
        final int i5 = 0;
        if (!this.isActionModeShowed && this.profileActivity.getParentActivity() != null && messageObject != null && ((profileStoriesCollectionTabs = this.storiesContainer) == null || !profileStoriesCollectionTabs.isReordering())) {
            AndroidUtilities.hideKeyboard(this.profileActivity.getParentActivity().getCurrentFocus());
            if (!z || (!(isStoryAlbumPageType(getClosestTab()) || getClosestTab() == 8) || isActionModeShown())) {
                this.selectedFiles[messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1].put(messageObject.getId(), messageObject);
                if (!messageObject.canDeleteMessage(false, null)) {
                    this.cantDeleteMessagesCount++;
                }
                this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
                ActionBarMenuItem actionBarMenuItem = this.gotoItem;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                }
                ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
                if (actionBarMenuItem2 != null) {
                    actionBarMenuItem2.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14) ? 8 : 0);
                }
                this.selectedMessagesCountTextView.setNumber(1, false);
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i6 = 0; i6 < this.actionModeViews.size(); i6++) {
                    View view2 = this.actionModeViews.get(i6);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(250L);
                animatorSet.start();
                this.scrolling = false;
                if (view instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) view).setChecked(true, true);
                } else if (view instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) view).photoVideoViews[i].setChecked(true);
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
                onActionModeSelectedUpdate(this.selectedFiles[0]);
                updateForwardItem();
                return true;
            }
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).initFullSizeReceiver();
            }
            final TL_stories.StoryItem storyItem = messageObject.storyItem;
            if (storyItem != null) {
                HashSet hashSet = new HashSet();
                ArrayList<Integer> arrayList2 = storyItem.albums;
                if (arrayList2 != null) {
                    hashSet.addAll(arrayList2);
                }
                boolean zIsStoryAlbumPageType = isStoryAlbumPageType(getClosestTab());
                ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.profileActivity, view, true);
                ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
                itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new IntroActivity$$ExternalSyntheticLambda5(itemOptionsMakeOptions, 5));
                itemOptionsMakeSwipeback.addGap();
                ItemOptions.addAlbumsItemOptions(itemOptionsMakeSwipeback, getStoriesController().getStoryAlbumsList(this.dialog_id, true), hashSet, true, new ShareAlert$$ExternalSyntheticLambda12(this, storyItem, itemOptionsMakeOptions, i4), new SharedMediaLayout$$ExternalSyntheticLambda15(0, this, hashSet, storyItem, itemOptionsMakeOptions));
                itemOptionsMakeOptions.add(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new SearchViewPager$1$$ExternalSyntheticLambda1(itemOptionsMakeOptions, itemOptionsMakeSwipeback, i3));
                itemOptionsMakeOptions.addGap();
                itemOptionsMakeOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ShareTopView$$ExternalSyntheticLambda3(this, messageObject, view, i, 9));
                if (zIsStoryAlbumPageType) {
                    int iStoryAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(getClosestTab());
                    StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(this.dialog_id, false);
                    String str = (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(iStoryAlbums_getAlbumIdByTabType)) == null) ? null : storyAlbumFindById.title;
                    itemOptionsMakeOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new EmojiView$$ExternalSyntheticLambda9(this, iStoryAlbums_getAlbumIdByTabType, i2));
                    itemOptionsMakeOptions.add(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ShareTopView$$ExternalSyntheticLambda3(this, iStoryAlbums_getAlbumIdByTabType, storyItem, str, 10));
                } else {
                    if (getClosestTab() == 8 && (storiesAdapter = this.storiesAdapter) != null && (storiesList = storiesAdapter.storiesList) != null) {
                        if (storiesList.isPinned(storyItem.id)) {
                            itemOptionsMakeOptions.add(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i4) {
                                        case 0:
                                            this.lambda$onItemLongClick$66(storyItem);
                                            break;
                                        case 1:
                                            this.lambda$onItemLongClick$61(storyItem);
                                            break;
                                        case 2:
                                            this.lambda$onItemLongClick$62(storyItem);
                                            break;
                                        default:
                                            this.lambda$onItemLongClick$63(storyItem);
                                            break;
                                    }
                                }
                            });
                        } else {
                            final int i7 = 2;
                            itemOptionsMakeOptions.add(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i7) {
                                        case 0:
                                            this.lambda$onItemLongClick$66(storyItem);
                                            break;
                                        case 1:
                                            this.lambda$onItemLongClick$61(storyItem);
                                            break;
                                        case 2:
                                            this.lambda$onItemLongClick$62(storyItem);
                                            break;
                                        default:
                                            this.lambda$onItemLongClick$63(storyItem);
                                            break;
                                    }
                                }
                            });
                        }
                    }
                    itemOptionsMakeOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    this.lambda$onItemLongClick$66(storyItem);
                                    break;
                                case 1:
                                    this.lambda$onItemLongClick$61(storyItem);
                                    break;
                                case 2:
                                    this.lambda$onItemLongClick$62(storyItem);
                                    break;
                                default:
                                    this.lambda$onItemLongClick$63(storyItem);
                                    break;
                            }
                        }
                    });
                }
                itemOptionsMakeOptions.add(R.drawable.msg_delete, (CharSequence) LocaleController.getString(R.string.Delete), true, new Runnable() {
                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.lambda$onItemLongClick$66(storyItem);
                                break;
                            case 1:
                                this.lambda$onItemLongClick$61(storyItem);
                                break;
                            case 2:
                                this.lambda$onItemLongClick$62(storyItem);
                                break;
                            default:
                                this.lambda$onItemLongClick$63(storyItem);
                                break;
                        }
                    }
                });
                itemOptionsMakeOptions.setGravity(3);
                itemOptionsMakeOptions.setBlur(true);
                itemOptionsMakeOptions.allowMoveScrim();
                itemOptionsMakeOptions.allowMoveScrimGravity(3);
                Point point = AndroidUtilities.displaySize;
                int iMin = (int) (Math.min(point.x, point.y) * 0.6777f);
                Point point2 = AndroidUtilities.displaySize;
                int iMin2 = Math.min(iMin, (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                itemOptionsMakeOptions.animateToSize(iMin2, (iMin2 * 4) / 3);
                itemOptionsMakeOptions.setDrawScrim(true);
                itemOptionsMakeOptions.hideScrimUnder();
                itemOptionsMakeOptions.forceBottom(true);
                itemOptionsMakeOptions.show();
                return true;
            }
        }
        return false;
    }

    public void updateOptionsSearch(boolean z) {
        ProfileGiftsContainer profileGiftsContainer;
        ProfileStoriesCollectionTabs profileStoriesCollectionTabs;
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null) {
            return;
        }
        float fClamp = 0.0f;
        if (!this.searching && (((profileGiftsContainer = this.giftsContainer) == null || !profileGiftsContainer.isReordering()) && ((profileStoriesCollectionTabs = this.storiesContainer) == null || !profileStoriesCollectionTabs.isReordering()))) {
            fClamp = Utilities.clamp(this.searchAlpha + this.optionsAlpha, 1.0f, 0.0f);
        }
        rLottieImageView.setAlpha(fClamp);
        if (z) {
            animateSearchToOptions(getPhotoVideoOptionsAlpha(1.0f) > 0.5f, true);
        } else if (this.searchItemState == 2) {
            animateSearchToOptions(this.optionsAlpha > 0.1f, true);
        } else {
            animateSearchToOptions(this.searchAlpha < 0.1f, true);
        }
    }

    public boolean closeActionMode(boolean z) {
        if (!this.isActionModeShowed) {
            return false;
        }
        for (int i = 1; i >= 0; i--) {
            this.selectedFiles[i].clear();
        }
        this.cantDeleteMessagesCount = 0;
        onActionModeSelectedUpdate(this.selectedFiles[0]);
        BotPreviewsEditContainer botPreviewsEditContainer = this.botPreviewsContainer;
        if (botPreviewsEditContainer != null) {
            botPreviewsEditContainer.unselectAll();
            this.botPreviewsContainer.updateSelection(true);
        }
        showActionMode(false);
        updateRowsSelection(z);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.unselectAll();
        }
        return true;
    }

    public boolean isSearchItemVisible(int i) {
        if (i == 7) {
            return this.delegate.canSearchMembers();
        }
        return (isSearchingStories() || i == 0 || isAnyStoryPageType(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14) ? false : true;
    }

    public Boolean zoomIn(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage mediaPage = this.mediaPages[0];
        if (mediaPage == null) {
            return null;
        }
        int i = mediaPage.selectedType;
        this.changeColumnsTab = i;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i);
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0], true);
        if (view != null && nextMediaColumnsCount == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!zIsAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(this.mediaPages[0].selectedType) >= 5 || isStoryAlbumPageType(this.mediaPages[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true));
    }

    public Boolean zoomOut(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage mediaPage = this.mediaPages[0];
        if (mediaPage == null) {
            return null;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return null;
        }
        int i = this.mediaPages[0].selectedType;
        this.changeColumnsTab = i;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i);
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0], false);
        if (view2 != null && nextMediaColumnsCount == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!zIsAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(this.mediaPages[0].selectedType) >= 5 || isStoryAlbumPageType(this.mediaPages[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false));
    }
}
