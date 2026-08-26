package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.cast.zzbe;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
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
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticLambda7;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda80;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda24;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda71;
import org.telegram.ui.CalendarActivity;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.ChatMessageCell$$ExternalSyntheticLambda5;
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
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda124;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda326;
import org.telegram.ui.ChatActivityContainer;
import org.telegram.ui.ChatUsersActivity$8$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.chat.ChatActivityDraftMessageMeasureController;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.ContactsActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.DialogsActivity$$ExternalSyntheticLambda79;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.ProfileGiftsContainer;
import org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda10;
import org.telegram.ui.Gifts.ProfileGiftsContainer$$ExternalSyntheticLambda5;
import org.telegram.ui.GroupCallSheet$$ExternalSyntheticLambda5;
import org.telegram.ui.IntroActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda3;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.PassportActivity$$ExternalSyntheticLambda1;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda133;
import org.telegram.ui.PinchToZoomHelper;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda17;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ProfileActivity$ListAdapter$$ExternalSyntheticLambda4;
import org.telegram.ui.ProfileStoriesCollectionTabs;
import org.telegram.ui.SelectStoriesBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.Stories.PeerStoriesView$$ExternalSyntheticLambda51;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.ViewsForPeerStoriesRequester;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.PaintView$$ExternalSyntheticLambda35;
import org.telegram.ui.Stories.recorder.PreviewView;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda42;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda6;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.iv.RichEditor;

public abstract class SharedMediaLayout extends FrameLayout implements NotificationCenter.NotificationCenterDelegate, DialogCell.DialogCellDelegate {
    public final ActionBar actionBar;
    public AnimatorSet actionModeAnimation;
    public final BlurredLinearLayout actionModeLayout;
    public final ArrayList actionModeViews;
    public SpannableStringBuilder addPostButton;
    public float additionalFloatingTranslation;
    public boolean allowStoriesSingleColumn;
    public int animateToColumnsCount;
    public boolean animatingForward;
    public boolean animatingToOptions;
    public final StoriesAdapter animationSupportingArchivedStoriesAdapter;
    public final SharedPhotoVideoAdapter animationSupportingPhotoVideoAdapter;
    public final StoriesAdapter animationSupportingStoriesAdapter;
    public final AnonymousClass11 archivedStoriesAdapter;
    public final SharedDocumentsAdapter audioAdapter;
    public final ArrayList audioCache;
    public final ArrayList audioCellCache;
    public final MediaSearchAdapter audioSearchAdapter;
    public boolean backAnimation;
    public final BackDrawable backDrawable;
    public final Paint backgroundPaint;
    public final AnonymousClass12 botPreviewsContainer;
    public final ArrayList cache;
    public int cantDeleteMessagesCount;
    public final ArrayList cellCache;
    public int changeColumnsTab;
    public boolean changeTypeAnimation;
    public final ChannelRecommendationsAdapter channelRecommendationsAdapter;
    public final ChatUsersAdapter chatUsersAdapter;
    public final ImageView closeButton;
    public final CommonGroupsAdapter commonGroupsAdapter;
    public final Delegate delegate;
    public final ActionBarMenuItem deleteItem;
    public final long dialog_id;
    public boolean disableScrolling;
    public final SharedDocumentsAdapter documentsAdapter;
    public final MediaSearchAdapter documentsSearchAdapter;
    public int firstTab;
    public AnimatorSet floatingDateAnimation;
    public final ChatActionCell floatingDateView;
    public final ActionBarMenuItem forwardItem;
    public final AnonymousClass30 fragmentContextView;
    public final FrameLayout fragmentContextViewWrapper;
    public HintView fwdRestrictedHint;
    public final GifAdapter gifAdapter;
    public final AnonymousClass13 giftsContainer;
    public long giftsLastHash;
    public final FlickerLoadingView globalGradientView;
    public final ActionBarMenuItem gotoItem;
    public final GroupUsersSearchAdapter groupUsersSearchAdapter;
    public final int[] hasMedia;
    public final SharedMediaLayout$$ExternalSyntheticLambda9 hideFloatingDateRunnable;
    public final EmojiView$$ExternalSyntheticLambda18 iBlur3Capture;
    public boolean ignoreSearchCollapse;
    public TLRPC.ChatFull info;
    public final int initialTab;
    public boolean isActionModeShowed;
    public boolean isInPinchToZoomTouchMode;
    public boolean isPinnedToTop;
    public PollItemMenu$$ExternalSyntheticLambda17 jumpToRunnable;
    public int lastVisibleHeight;
    public final SharedLinksAdapter linksAdapter;
    public final MediaSearchAdapter linksSearchAdapter;
    public final int maximumVelocity;
    public boolean maybePinchToZoomTouchMode;
    public boolean maybePinchToZoomTouchMode2;
    public boolean maybeStartTracking;
    public final int[] mediaColumnsCount;
    public final MediaPage[] mediaPages;
    public long mergeDialogId;
    public final SparseArray messageAlphaEnter;
    public final AnimationNotificationsLocker notificationsLocker;
    public final NotificationCenter.ObserversGroup observersGroup;
    public float optionsAlpha;
    public final RLottieImageView optionsSearchImageView;
    public int pagesPaddingBottom;
    public final AnonymousClass6 photoVideoAdapter;
    public boolean photoVideoChangeColumnsAnimation;
    public float photoVideoChangeColumnsProgress;
    public final ImageView photoVideoOptionsItem;
    public final ActionBarMenuItem pinItem;
    public int pinchCenterOffset;
    public int pinchCenterPosition;
    public int pinchCenterX;
    public float pinchScale;
    public boolean pinchScaleUp;
    public float pinchStartDistance;
    public final Drawable pinnedHeaderShadowDrawable;
    public int pointerId1;
    public int pointerId2;
    public final PollAdapter pollAdapter;
    public final BaseFragment profileActivity;
    public final AnonymousClass1 provider;
    public final Rect rect;
    public final Theme.ResourcesProvider resourcesProvider;
    public final TextView saveItem;
    public final SavedDialogsAdapter savedDialogsAdapter;
    public final AnonymousClass7 savedMessagesContainer;
    public final SavedMessagesSearchAdapter savedMessagesSearchAdapter;
    public final AnonymousClass39 scrollSlidingTextTabStrip;
    public boolean scrolling;
    public float searchAlpha;
    public final ActionBarMenuItem searchItem;
    public final ActionBarMenuItem searchItemIcon;
    public int searchItemState;
    public StoriesController.SearchStoriesList searchStoriesList;
    public final AnonymousClass31 searchTagsList;
    public boolean searchWas;
    public boolean searching;
    public ReactionsLayoutInBubble.VisibleReaction searchingReaction;
    public final SparseArray[] selectedFiles;
    public final NumberTextView selectedMessagesCountTextView;
    public final AnonymousClass49 sharedLinkCellDelegate;
    public final SharedMediaData[] sharedMediaData;
    public final SharedMediaPreloader sharedMediaPreloader;
    public float shiftDp;
    public boolean startedTracking;
    public int startedTrackingPointerId;
    public int startedTrackingX;
    public int startedTrackingY;
    public final AnonymousClass9 storiesAdapter;
    public boolean storiesColumnsCountSet;
    public final AnonymousClass15 storiesContainer;
    public final ItemTouchHelper storiesReorder;
    public final HashMap storyAlbumsById;
    public final HashMap storyAlbumsByTabType;
    public float subTabsVisibilityFactor;
    public int tabIndexCounter;
    public AnimatorSet tabsAnimation;
    public boolean tabsAnimationInProgress;
    public int topLayoutPadding;
    public int topPadding;
    public final DialogsActivityTopPanelLayout topPanelLayout;
    public final long topicId;
    public final ActionBarMenuItem unpinItem;
    public TLRPC.UserFull userInfo;
    public VelocityTracker velocityTracker;
    public final int viewType;
    public final SharedDocumentsAdapter voiceAdapter;
    public boolean wasReordering;
    public static final int[] supportedFastScrollTypes = {0, 1, 2, 4};
    public static final DialogsActivity$$ExternalSyntheticLambda79 interpolator = new DialogsActivity$$ExternalSyntheticLambda79(1);

    public final class AnonymousClass12 extends BotPreviewsEditContainer {
        public AnonymousClass12(Context context, BaseFragment baseFragment, long j) {
            super(context, baseFragment, j);
        }

        @Override
        public final int getStartedTrackingX() {
            return SharedMediaLayout.this.startedTrackingX;
        }

        @Override
        public final boolean isSelected(MessageObject messageObject) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            return sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > sharedMediaLayout.dialog_id ? 1 : (messageObject.getDialogId() == sharedMediaLayout.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0;
        }

        @Override
        public final boolean select(MessageObject messageObject) {
            if (messageObject != null) {
                long dialogId = messageObject.getDialogId();
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                char c = dialogId == sharedMediaLayout.dialog_id ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = sharedMediaLayout.selectedFiles;
                if (sparseArrayArr[c].indexOfKey(messageObject.getId()) < 0) {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                        sparseArrayArr[c].put(messageObject.getId(), messageObject);
                        if (!messageObject.canDeleteMessage(false, null)) {
                            sharedMediaLayout.cantDeleteMessagesCount++;
                        }
                        boolean z = sharedMediaLayout.isActionModeShowed;
                        NumberTextView numberTextView = sharedMediaLayout.selectedMessagesCountTextView;
                        if (z) {
                            numberTextView.setNumber(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                        } else {
                            AndroidUtilities.hideKeyboard(sharedMediaLayout.profileActivity.getParentActivity().getCurrentFocus());
                            int i = 8;
                            sharedMediaLayout.deleteItem.setVisibility(sharedMediaLayout.cantDeleteMessagesCount == 0 ? 0 : 8);
                            ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.gotoItem;
                            if (actionBarMenuItem != null) {
                                actionBarMenuItem.setVisibility((sharedMediaLayout.getClosestTab() == 8 || sharedMediaLayout.getClosestTab() == 13) ? 8 : 0);
                            }
                            ActionBarMenuItem actionBarMenuItem2 = sharedMediaLayout.pinItem;
                            if (actionBarMenuItem2 != null) {
                                actionBarMenuItem2.setVisibility(8);
                            }
                            ActionBarMenuItem actionBarMenuItem3 = sharedMediaLayout.unpinItem;
                            if (actionBarMenuItem3 != null) {
                                actionBarMenuItem3.setVisibility(8);
                            }
                            ActionBarMenuItem actionBarMenuItem4 = sharedMediaLayout.forwardItem;
                            if (actionBarMenuItem4 != null) {
                                if (sharedMediaLayout.getClosestTab() != 8 && sharedMediaLayout.getClosestTab() != 13) {
                                    i = 0;
                                }
                                actionBarMenuItem4.setVisibility(i);
                            }
                            numberTextView.setNumber(sparseArrayArr[1].size() + sparseArrayArr[0].size(), false);
                            AnimatorSet animatorSet = new AnimatorSet();
                            ArrayList arrayList = new ArrayList();
                            int i2 = 0;
                            while (true) {
                                ArrayList arrayList2 = sharedMediaLayout.actionModeViews;
                                if (i2 >= arrayList2.size()) {
                                    break;
                                }
                                View view = (View) arrayList2.get(i2);
                                AndroidUtilities.clearDrawableAnimation(view);
                                arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                                i2++;
                            }
                            animatorSet.playTogether(arrayList);
                            animatorSet.setDuration(250L);
                            animatorSet.start();
                            sharedMediaLayout.scrolling = false;
                            sharedMediaLayout.showActionMode$1(true);
                        }
                        updateSelection();
                        return true;
                    }
                }
            }
            return false;
        }

        @Override
        public final boolean unselect(MessageObject messageObject) {
            if (messageObject != null) {
                long dialogId = messageObject.getDialogId();
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                char c = dialogId == sharedMediaLayout.dialog_id ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = sharedMediaLayout.selectedFiles;
                if (sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        sharedMediaLayout.cantDeleteMessagesCount--;
                    }
                    if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                        AndroidUtilities.hideKeyboard(sharedMediaLayout.profileActivity.getParentActivity().getCurrentFocus());
                        sparseArrayArr[0].clear();
                        sparseArrayArr[1].clear();
                        int i = 8;
                        sharedMediaLayout.deleteItem.setVisibility(sharedMediaLayout.cantDeleteMessagesCount == 0 ? 0 : 8);
                        ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.gotoItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setVisibility((sharedMediaLayout.getClosestTab() == 8 || sharedMediaLayout.getClosestTab() == 13) ? 8 : 0);
                        }
                        ActionBarMenuItem actionBarMenuItem2 = sharedMediaLayout.pinItem;
                        if (actionBarMenuItem2 != null) {
                            actionBarMenuItem2.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem3 = sharedMediaLayout.unpinItem;
                        if (actionBarMenuItem3 != null) {
                            actionBarMenuItem3.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem4 = sharedMediaLayout.forwardItem;
                        if (actionBarMenuItem4 != null) {
                            if (sharedMediaLayout.getClosestTab() != 8 && sharedMediaLayout.getClosestTab() != 13) {
                                i = 0;
                            }
                            actionBarMenuItem4.setVisibility(i);
                        }
                        AnimatorSet animatorSet = new AnimatorSet();
                        ArrayList arrayList = new ArrayList();
                        int i2 = 0;
                        while (true) {
                            ArrayList arrayList2 = sharedMediaLayout.actionModeViews;
                            if (i2 >= arrayList2.size()) {
                                break;
                            }
                            View view = (View) arrayList2.get(i2);
                            AndroidUtilities.clearDrawableAnimation(view);
                            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.1f));
                            i2++;
                        }
                        animatorSet.playTogether(arrayList);
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        sharedMediaLayout.scrolling = false;
                        AndroidUtilities.runOnUIThread(new SeekBarView$$ExternalSyntheticLambda1(this, 16), 20L);
                    } else {
                        sharedMediaLayout.selectedMessagesCountTextView.setNumber(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    }
                    updateSelection();
                    return true;
                }
            }
            return false;
        }
    }

    public final class AnonymousClass13 extends ProfileGiftsContainer {
        public final SharedMediaLayout this$0;

        public AnonymousClass13(int i, long j, Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider, SharedMediaLayout sharedMediaLayout) {
            super(i, j, context, baseFragment, resourcesProvider);
            this.this$0 = sharedMediaLayout;
        }

        @Override
        public final void updatedReordering(boolean z) {
            SharedMediaLayout sharedMediaLayout = this.this$0;
            TextView textView = sharedMediaLayout.saveItem;
            textView.setVisibility(0);
            textView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.4f).scaleY(z ? 1.0f : 0.4f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(23, this, z)).start();
            sharedMediaLayout.updateOptionsSearch(true);
        }
    }

    public final class AnonymousClass14 {
        public final Context val$context;
        public final BaseFragment val$parent;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass14(Context context, BaseFragment baseFragment, Theme.ResourcesProvider resourcesProvider) {
            this.val$context = context;
            this.val$parent = baseFragment;
            this.val$resourcesProvider = resourcesProvider;
        }
    }

    public final class AnonymousClass15 extends ProfileStoriesCollectionTabs {
        public AnonymousClass15(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, StoriesController.StoriesCollections storiesCollections, AnonymousClass14 anonymousClass14) {
            super(context, sizeNotifierFrameLayout, storiesCollections, anonymousClass14);
        }

        @Override
        public final void onVisibilityChange() {
            AnonymousClass19 anonymousClass19;
            int measuredWidth = getMeasuredWidth();
            int visualHeight = (int) getVisualHeight();
            Rect rect = this.clipRect;
            rect.set(0, 0, measuredWidth, visualHeight);
            setClipBounds(rect);
            invalidate();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
            if (mediaPageArr != null) {
                for (MediaPage mediaPage : mediaPageArr) {
                    if (mediaPage != null && (anonymousClass19 = mediaPage.listView) != null) {
                        int paddingLeft = anonymousClass19.getPaddingLeft();
                        int pagePaddingTop = sharedMediaLayout.getPagePaddingTop(mediaPage.selectedType);
                        int paddingRight = mediaPage.listView.getPaddingRight();
                        AnonymousClass19 anonymousClass110 = mediaPage.listView;
                        int pagePaddingBottom = sharedMediaLayout.getPagePaddingBottom(sharedMediaLayout.isStoriesView());
                        anonymousClass110.hintPaddingBottom = pagePaddingBottom;
                        anonymousClass19.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
                    }
                }
            }
            sharedMediaLayout.checkUi_topPanelLayoutY();
        }
    }

    public final class AnonymousClass19 extends SharedMediaListView {
        public float lastY;
        public float startY;
        public final AnonymousClass17 val$layoutManager;
        public final AnonymousClass16 val$mediaPage;

        public AnonymousClass19(Context context, AnonymousClass16 anonymousClass16, AnonymousClass17 anonymousClass17) {
            super(context);
            this.val$mediaPage = anonymousClass16;
            this.val$layoutManager = anonymousClass17;
        }

        @Override
        public final void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
            float f;
            int messageId = sharedPhotoVideoCell2.getMessageId();
            AnonymousClass16 anonymousClass16 = this.val$mediaPage;
            if (messageId != anonymousClass16.highlightMessageId || !sharedPhotoVideoCell2.imageReceiver.hasBitmapImage()) {
                sharedPhotoVideoCell2.setHighlightProgress(0.0f);
                return;
            }
            if (!anonymousClass16.highlightAnimation) {
                anonymousClass16.highlightProgress = 0.0f;
                anonymousClass16.highlightAnimation = true;
            }
            float f2 = anonymousClass16.highlightProgress;
            if (f2 < 0.3f) {
                f = f2 / 0.3f;
            } else {
                f = f2 > 0.7f ? (1.0f - f2) / 0.3f : 1.0f;
            }
            sharedPhotoVideoCell2.setHighlightProgress(f);
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            View childAt;
            View childAt2;
            RecyclerView.Adapter adapter = getAdapter();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            AnonymousClass16 anonymousClass16 = this.val$mediaPage;
            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
            AnonymousClass9 anonymousClass9 = sharedMediaLayout.storiesAdapter;
            if ((adapter == sharedMediaLayout.archivedStoriesAdapter || getAdapter() == anonymousClass9) && getChildCount() > 0 && (childAt = getChildAt(0)) != null && RecyclerView.getChildAdapterPosition(childAt) == 0) {
                int top = childAt.getTop();
                if (sharedMediaLayout.photoVideoChangeColumnsAnimation) {
                    if (sharedMediaLayout.changeColumnsTab == (getAdapter() == anonymousClass9 ? 8 : 9) && anonymousClass16.animationSupportingListView.getChildCount() > 0 && (childAt2 = anonymousClass16.animationSupportingListView.getChildAt(0)) != null) {
                        anonymousClass16.animationSupportingListView.getClass();
                        if (RecyclerView.getChildAdapterPosition(childAt2) == 0) {
                            top = AndroidUtilities.lerp(top, childAt2.getTop(), sharedMediaLayout.photoVideoChangeColumnsProgress);
                        }
                    }
                }
                if (getAdapter() != anonymousClass9) {
                    if (this.archivedHintPaint == null) {
                        TextPaint textPaint = new TextPaint(1);
                        this.archivedHintPaint = textPaint;
                        textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                        this.archivedHintPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, this.resourcesProvider));
                    }
                    int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(60.0f);
                    StaticLayout staticLayout = this.archivedHintLayout;
                    if (staticLayout == null || staticLayout.getWidth() != measuredWidth) {
                        this.archivedHintLayout = new StaticLayout(LocaleController.getString(sharedMediaLayout.isArchivedOnlyStoriesView() ? baseFragment != null && ChatObject.isChannelAndNotMegaGroup(baseFragment.getMessagesController().getChat(Long.valueOf(-sharedMediaLayout.dialog_id))) ? R.string.ProfileStoriesArchiveChannelHint : R.string.ProfileStoriesArchiveGroupHint : R.string.ProfileStoriesArchiveHint), this.archivedHintPaint, measuredWidth, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                        this.archivedHintLayoutWidth = 0.0f;
                        this.archivedHintLayoutLeft = measuredWidth;
                        for (int i = 0; i < this.archivedHintLayout.getLineCount(); i++) {
                            this.archivedHintLayoutWidth = Math.max(this.archivedHintLayoutWidth, this.archivedHintLayout.getLineWidth(i));
                            this.archivedHintLayoutLeft = Math.min(this.archivedHintLayoutLeft, this.archivedHintLayout.getLineLeft(i));
                        }
                    }
                    canvas.save();
                    canvas.translate(((getWidth() - this.archivedHintLayoutWidth) / 2.0f) - this.archivedHintLayoutLeft, top - ((this.archivedHintLayout.getHeight() + AndroidUtilities.dp(64.0f)) / 2.0f));
                    this.archivedHintLayout.draw(canvas);
                    canvas.restore();
                }
            }
            super.dispatchDraw(canvas);
            if (anonymousClass16.highlightAnimation) {
                float f = anonymousClass16.highlightProgress + 0.010666667f;
                anonymousClass16.highlightProgress = f;
                if (f >= 1.0f) {
                    anonymousClass16.highlightProgress = 0.0f;
                    anonymousClass16.highlightAnimation = false;
                    anonymousClass16.highlightMessageId = 0;
                }
                invalidate();
            }
            if (this.poller == null) {
                int currentAccount = baseFragment.getCurrentAccount();
                UserListPoller[] userListPollerArr = UserListPoller.istances;
                if (userListPollerArr[currentAccount] == null) {
                    userListPollerArr[currentAccount] = new UserListPoller(currentAccount);
                }
                this.poller = userListPollerArr[currentAccount];
            }
            this.poller.checkList(this);
            if (sharedMediaLayout.photoVideoChangeColumnsAnimation) {
                return;
            }
            sharedMediaLayout.changeColumnsTab = -1;
        }

        @Override
        public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
            if (baseFragment == null || !baseFragment.isInPreviewMode()) {
                return super.dispatchTouchEvent(motionEvent);
            }
            this.lastY = motionEvent.getY();
            if (motionEvent.getAction() == 1) {
                sharedMediaLayout.profileActivity.finishPreviewFragment();
            } else if (motionEvent.getAction() == 2) {
                float f = this.startY - this.lastY;
                sharedMediaLayout.profileActivity.movePreviewFragment(f);
                if (f < 0.0f) {
                    this.startY = this.lastY;
                }
            }
            return true;
        }

        public final View findOuterScrollingAncestor() {
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
        public final int getAnimateToColumnsCount() {
            return SharedMediaLayout.this.animateToColumnsCount;
        }

        @Override
        public final float getChangeColumnsProgress() {
            return SharedMediaLayout.this.photoVideoChangeColumnsProgress;
        }

        @Override
        public final int getColumnsCount() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            return SharedMediaLayout.isAnyStoryPageType(sharedMediaLayout.changeColumnsTab) ? sharedMediaLayout.mediaColumnsCount[1] : sharedMediaLayout.mediaColumnsCount[0];
        }

        @Override
        public final SparseArray getMessageAlphaEnter() {
            return SharedMediaLayout.this.messageAlphaEnter;
        }

        @Override
        public final RecyclerListView.FastScrollAdapter getMovingAdapter() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            return SharedMediaLayout.isAnyStoryPageType(sharedMediaLayout.changeColumnsTab) ? sharedMediaLayout.storyAlbums_getStoriesAdapterByTabType(sharedMediaLayout.changeColumnsTab) : sharedMediaLayout.photoVideoAdapter;
        }

        @Override
        public final Integer getSelectorColor(int i) {
            RecyclerView.Adapter adapter = getAdapter();
            ChannelRecommendationsAdapter channelRecommendationsAdapter = SharedMediaLayout.this.channelRecommendationsAdapter;
            if (adapter == channelRecommendationsAdapter && channelRecommendationsAdapter.more > 0 && i == channelRecommendationsAdapter.chats.size() - 1) {
                return 0;
            }
            return super.getSelectorColor(i);
        }

        @Override
        public final RecyclerListView.FastScrollAdapter getSupportingAdapter() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            return SharedMediaLayout.isAnyStoryPageType(sharedMediaLayout.changeColumnsTab) ? sharedMediaLayout.storyAlbums_getStoriesSupportingAdapterByTabType(sharedMediaLayout.changeColumnsTab) : sharedMediaLayout.animationSupportingPhotoVideoAdapter;
        }

        @Override
        public final InternalListView getSupportingListView() {
            return this.val$mediaPage.animationSupportingListView;
        }

        @Override
        public final boolean isChangeColumnsAnimation() {
            return SharedMediaLayout.this.photoVideoChangeColumnsAnimation;
        }

        @Override
        public final boolean isStories() {
            return SharedMediaLayout.isAnyStoryPageType(SharedMediaLayout.this.changeColumnsTab);
        }

        @Override
        public final boolean isThisListView() {
            return this == this.val$mediaPage.listView;
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AnonymousClass16 anonymousClass16 = this.val$mediaPage;
            SharedMediaLayout.this.checkLoadMoreScroll(anonymousClass16, anonymousClass16.listView, this.val$layoutManager);
            if (anonymousClass16.selectedType == 0) {
                PhotoViewer.getInstance().checkCurrentImageVisibility();
            }
        }

        @Override
        public final void onScrolled(int i, int i2) {
            BaseFragment baseFragment;
            boolean z = this.scrollingByUser;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (z && sharedMediaLayout.getSelectedTab() == 11 && (baseFragment = sharedMediaLayout.profileActivity) != null) {
                AndroidUtilities.hideKeyboard(baseFragment.getParentActivity().getCurrentFocus());
            }
            sharedMediaLayout.checkStoriesTabsPosition();
            RecyclerView.Adapter adapter = getAdapter();
            PollAdapter pollAdapter = sharedMediaLayout.pollAdapter;
            if (adapter != pollAdapter) {
                return;
            }
            pollAdapter.pollsToCheck.clear();
            int i3 = 0;
            while (true) {
                int childCount = getChildCount();
                ArrayList<MessageObject> arrayList = pollAdapter.pollsToCheck;
                if (i3 >= childCount) {
                    MessagesController.getInstance(pollAdapter.currentAccount).addToPollsQueue(SharedMediaLayout.this.dialog_id, arrayList);
                    return;
                }
                View childAt = getChildAt(i3);
                if (childAt instanceof ChatMessageCell) {
                    arrayList.add(((ChatMessageCell) childAt).getMessageObject());
                }
                i3++;
            }
        }

        @Override
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            View viewFindOuterScrollingAncestor;
            try {
                if (i != 4096) {
                    if (i == 8192) {
                        if (!canScrollVertically(-1) && (viewFindOuterScrollingAncestor = findOuterScrollingAncestor()) != null && viewFindOuterScrollingAncestor.canScrollVertically(-1) && viewFindOuterScrollingAncestor.performAccessibilityAction(i, bundle)) {
                            return true;
                        }
                    }
                    return super.performAccessibilityAction(i, bundle);
                }
                View viewFindOuterScrollingAncestor2 = findOuterScrollingAncestor();
                if (viewFindOuterScrollingAncestor2 != null && viewFindOuterScrollingAncestor2.canScrollVertically(1) && viewFindOuterScrollingAncestor2.performAccessibilityAction(i, bundle)) {
                    return true;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            return super.performAccessibilityAction(i, bundle);
        }
    }

    public final class AnonymousClass34 extends BaseMenuWrapper {
        public final int $r8$classId;
        public final ViewGroup this$0;
        public final Object val$finalMediaPage;

        public AnonymousClass34(ViewGroup viewGroup, Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = viewGroup;
            this.val$finalMediaPage = obj;
        }

        @Override
        public final int getSpanSize(int i) {
            int i2;
            switch (this.$r8$classId) {
                case 0:
                    MediaPage mediaPage = (MediaPage) this.val$finalMediaPage;
                    RecyclerView.Adapter adapter = mediaPage.animationSupportingListView.getAdapter();
                    SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) this.this$0;
                    SharedPhotoVideoAdapter sharedPhotoVideoAdapter = sharedMediaLayout.animationSupportingPhotoVideoAdapter;
                    if (adapter == sharedPhotoVideoAdapter) {
                        if (sharedPhotoVideoAdapter.getItemViewType(i) == 2) {
                            return mediaPage.animationSupportingLayoutManager.mSpanCount;
                        }
                        return 1;
                    }
                    if (SharedMediaLayout.access$9900(sharedMediaLayout, adapter) == -1) {
                        return 1;
                    }
                    ((StoriesAdapter) adapter).getClass();
                    return 1;
                default:
                    UniversalAdapter universalAdapter = ((UniversalRecyclerView) this.this$0).adapter;
                    UniversalRecyclerView.AnonymousClass6 anonymousClass6 = (UniversalRecyclerView.AnonymousClass6) this.val$finalMediaPage;
                    if (universalAdapter == null) {
                        return anonymousClass6.mSpanCount;
                    }
                    UItem item = universalAdapter.getItem(i);
                    return (item == null || (i2 = item.spanCount) == -1) ? anonymousClass6.mSpanCount : i2;
            }
        }
    }

    public final class AnonymousClass35 implements ValueAnimator.AnimatorUpdateListener {
        public final int $r8$classId;
        public final SharedMediaLayout this$0;
        public final MediaPage val$finalMediaPage;

        public AnonymousClass35(SharedMediaLayout sharedMediaLayout, MediaPage mediaPage, int i) {
            this.$r8$classId = i;
            this.this$0 = sharedMediaLayout;
            this.val$finalMediaPage = mediaPage;
        }

        @Override
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.val$finalMediaPage.listView.invalidate();
                    break;
                default:
                    this.this$0.photoVideoChangeColumnsProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    this.val$finalMediaPage.listView.invalidate();
                    break;
            }
        }
    }

    public final class AnonymousClass4 extends OKLCH {
        public AnonymousClass4() {
        }

        @Override
        public final void onLayout() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.searchItem.setTranslationX(((View) sharedMediaLayout.searchItem.getParent()).getMeasuredWidth() - sharedMediaLayout.searchItem.getRight());
        }

        @Override
        public final void onSearchCollapse() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.searching = false;
            sharedMediaLayout.searchingReaction = null;
            ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            ImageView imageView = sharedMediaLayout.photoVideoOptionsItem;
            if (imageView != null && sharedMediaLayout.getPhotoVideoOptionsAlpha(0.0f) > 0.5f) {
                imageView.setVisibility(0);
            }
            AnonymousClass31 anonymousClass31 = sharedMediaLayout.searchTagsList;
            if (anonymousClass31 != null) {
                anonymousClass31.listView.forAllChild(new ChatUsersActivity$8$$ExternalSyntheticLambda1(2));
                anonymousClass31.chosen = 0L;
                anonymousClass31.show(false);
            }
            AnonymousClass7 anonymousClass7 = sharedMediaLayout.savedMessagesContainer;
            if (anonymousClass7 != null) {
                ChatActivityContainer.AnonymousClass1 anonymousClass1 = anonymousClass7.chatActivity;
                ChatActivity.SearchItemListener searchItemListener = anonymousClass1.searchItemListener;
                if (searchItemListener != null) {
                    searchItemListener.onSearchCollapse();
                }
                anonymousClass1.searching = false;
                anonymousClass1.searchItemVisible = false;
                anonymousClass1.updateBottomOverlay(false);
                anonymousClass1.updateSearchUpDownButtonVisibility();
            }
            sharedMediaLayout.searchWas = false;
            sharedMediaLayout.searchItem.setVisibility(0);
            sharedMediaLayout.documentsSearchAdapter.search(null, true);
            sharedMediaLayout.linksSearchAdapter.search(null, true);
            sharedMediaLayout.audioSearchAdapter.search(null, true);
            sharedMediaLayout.groupUsersSearchAdapter.search(null, true);
            SavedMessagesSearchAdapter savedMessagesSearchAdapter = sharedMediaLayout.savedMessagesSearchAdapter;
            if (savedMessagesSearchAdapter != null) {
                savedMessagesSearchAdapter.search(null, null);
            }
            sharedMediaLayout.onSearchStateChanged(false);
            RLottieImageView rLottieImageView = sharedMediaLayout.optionsSearchImageView;
            if (rLottieImageView != null) {
                rLottieImageView.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            if (sharedMediaLayout.ignoreSearchCollapse) {
                sharedMediaLayout.ignoreSearchCollapse = false;
            } else {
                sharedMediaLayout.switchToCurrentSelectedMode(false);
            }
        }

        @Override
        public final void onSearchExpand() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.searching = true;
            AnonymousClass31 anonymousClass31 = sharedMediaLayout.searchTagsList;
            if (anonymousClass31 != null) {
                anonymousClass31.show((sharedMediaLayout.getSelectedTab() == 11 || sharedMediaLayout.getSelectedTab() == 12) && anonymousClass31.hasFilters());
            }
            ImageView imageView = sharedMediaLayout.photoVideoOptionsItem;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.searchItemIcon;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
            }
            sharedMediaLayout.searchItem.setVisibility(8);
            sharedMediaLayout.onSearchStateChanged(true);
            RLottieImageView rLottieImageView = sharedMediaLayout.optionsSearchImageView;
            if (rLottieImageView != null) {
                rLottieImageView.animate().scaleX(0.6f).scaleY(0.6f).alpha(0.0f).setDuration(320L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
        }

        @Override
        public final void onSearchPressed(EditTextBoldCursor editTextBoldCursor) {
            AnonymousClass7 anonymousClass7 = SharedMediaLayout.this.savedMessagesContainer;
            if (anonymousClass7 != null) {
                anonymousClass7.chatActivity.hitSearch();
            }
        }

        @Override
        public final void onTextChanged(EditTextBoldCursor editTextBoldCursor) {
            SavedMessagesSearchAdapter savedMessagesSearchAdapter;
            String string = editTextBoldCursor.getText().toString();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            AnonymousClass7 anonymousClass7 = sharedMediaLayout.savedMessagesContainer;
            if (anonymousClass7 != null) {
                ChatActivityContainer.AnonymousClass1 anonymousClass1 = anonymousClass7.chatActivity;
                ActionBarMenuItem actionBarMenuItem = anonymousClass1.searchItem;
                if (actionBarMenuItem != null) {
                    anonymousClass1.searchingQuery = string;
                    actionBarMenuItem.setSearchFieldText(string, false);
                }
                if (TextUtils.isEmpty(string) && sharedMediaLayout.searchingReaction == null) {
                    ChatActivityContainer.AnonymousClass1 anonymousClass2 = anonymousClass7.chatActivity;
                    ChatActivity.SearchItemListener searchItemListener = anonymousClass2.searchItemListener;
                    if (searchItemListener != null) {
                        searchItemListener.onSearchCollapse();
                    }
                    anonymousClass2.searching = false;
                    anonymousClass2.searchItemVisible = false;
                    anonymousClass2.updateBottomOverlay(false);
                    anonymousClass2.updateSearchUpDownButtonVisibility();
                }
            }
            sharedMediaLayout.searchItem.setVisibility(8);
            sharedMediaLayout.searchWas = (string.length() == 0 && sharedMediaLayout.searchingReaction == null) ? false : true;
            sharedMediaLayout.post(new SeekBarView$$ExternalSyntheticLambda1(this, 17));
            int i = sharedMediaLayout.mediaPages[0].selectedType;
            if (i == 1) {
                MediaSearchAdapter mediaSearchAdapter = sharedMediaLayout.documentsSearchAdapter;
                if (mediaSearchAdapter == null) {
                    return;
                }
                mediaSearchAdapter.search(string, true);
                return;
            }
            if (i == 3) {
                MediaSearchAdapter mediaSearchAdapter2 = sharedMediaLayout.linksSearchAdapter;
                if (mediaSearchAdapter2 == null) {
                    return;
                }
                mediaSearchAdapter2.search(string, true);
                return;
            }
            if (i == 4) {
                MediaSearchAdapter mediaSearchAdapter3 = sharedMediaLayout.audioSearchAdapter;
                if (mediaSearchAdapter3 == null) {
                    return;
                }
                mediaSearchAdapter3.search(string, true);
                return;
            }
            if (i == 7) {
                GroupUsersSearchAdapter groupUsersSearchAdapter = sharedMediaLayout.groupUsersSearchAdapter;
                if (groupUsersSearchAdapter == null) {
                    return;
                }
                groupUsersSearchAdapter.search(string, true);
                return;
            }
            if (i != 11 || (savedMessagesSearchAdapter = sharedMediaLayout.savedMessagesSearchAdapter) == null) {
                return;
            }
            savedMessagesSearchAdapter.search(sharedMediaLayout.searchingReaction, string);
        }
    }

    public final class AnonymousClass40 implements ScrollSlidingTextTabStrip.ScrollSlidingTabStripDelegate {
        public AnonymousClass40() {
        }

        @Override
        public final void onPageScrolled(float f) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (f != 1.0f || sharedMediaLayout.mediaPages[1].getVisibility() == 0) {
                boolean z = sharedMediaLayout.animatingForward;
                MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                if (z) {
                    MediaPage mediaPage = mediaPageArr[0];
                    mediaPage.setTranslationX((-f) * mediaPage.getMeasuredWidth());
                    mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth() - (mediaPageArr[0].getMeasuredWidth() * f));
                } else {
                    MediaPage mediaPage2 = mediaPageArr[0];
                    mediaPage2.setTranslationX(mediaPage2.getMeasuredWidth() * f);
                    mediaPageArr[1].setTranslationX((mediaPageArr[0].getMeasuredWidth() * f) - mediaPageArr[0].getMeasuredWidth());
                }
                sharedMediaLayout.onTabProgress(sharedMediaLayout.getTabProgress());
                float photoVideoOptionsAlpha = sharedMediaLayout.getPhotoVideoOptionsAlpha(f);
                sharedMediaLayout.optionsAlpha = photoVideoOptionsAlpha;
                sharedMediaLayout.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !sharedMediaLayout.canShowSearchItem() || sharedMediaLayout.isArchivedOnlyStoriesView()) ? 4 : 0);
                ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.searchItem;
                if (actionBarMenuItem == null || sharedMediaLayout.canShowSearchItem()) {
                    sharedMediaLayout.searchAlpha = sharedMediaLayout.getSearchAlpha(f);
                    sharedMediaLayout.updateSearchItemIconAnimated();
                } else {
                    actionBarMenuItem.setVisibility(sharedMediaLayout.isStoriesView() ? 8 : 4);
                    sharedMediaLayout.searchAlpha = 0.0f;
                }
                sharedMediaLayout.updateOptionsSearch(false);
                if (f == 1.0f) {
                    MediaPage mediaPage3 = mediaPageArr[0];
                    mediaPageArr[0] = mediaPageArr[1];
                    mediaPageArr[1] = mediaPage3;
                    mediaPage3.setVisibility(8);
                    if (actionBarMenuItem != null && sharedMediaLayout.searchItemState == 2) {
                        actionBarMenuItem.setVisibility(sharedMediaLayout.isStoriesView() ? 8 : 4);
                    }
                    sharedMediaLayout.searchItemState = 0;
                    sharedMediaLayout.startStopVisibleGifs();
                }
            }
        }

        @Override
        public final void onPageSelected(int i, boolean z) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.mediaPages[0].selectedType == i) {
                return;
            }
            AnonymousClass15 anonymousClass15 = sharedMediaLayout.storiesContainer;
            if (anonymousClass15 != null && i == 8) {
                anonymousClass15.tabsView.selectTabWithId(1.0f, 0);
            }
            MediaPage mediaPage = sharedMediaLayout.mediaPages[1];
            mediaPage.selectedType = i;
            mediaPage.setVisibility(0);
            sharedMediaLayout.hideFloatingDateView$2();
            sharedMediaLayout.switchToCurrentSelectedMode(true);
            sharedMediaLayout.animatingForward = z;
            sharedMediaLayout.onSelectedTabChanged();
            sharedMediaLayout.animateSearchToOptions(!sharedMediaLayout.isSearchItemVisible(i), true);
            sharedMediaLayout.updateOptionsSearch(true);
        }

        @Override
        public final void onSamePageSelected() {
            int itemSize;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            int i = sharedMediaLayout.mediaPages[0].selectedType;
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
            MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
            MediaPage mediaPage = mediaPageArr[0];
            if ((mediaPage.selectedType == 0 ? (mediaPage.layoutManager.findFirstVisibleItemPosition() / sharedMediaLayout.mediaColumnsCount[0]) * itemSize : mediaPage.layoutManager.findFirstVisibleItemPosition() * itemSize) < mediaPageArr[0].listView.getMeasuredHeight() * 1.2f) {
                mediaPageArr[0].listView.smoothScrollToPosition(0);
                return;
            }
            RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = mediaPageArr[0].scrollHelper;
            recyclerAnimationScrollHelper.scrollDirection = 1;
            recyclerAnimationScrollHelper.scrollToPosition(0, 0, false, false);
        }

        @Override
        public final boolean showOptions(int i, View view) {
            TLRPC.UserFull userFull;
            TLRPC.ProfileTab profileTab;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.profileActivity != null && SharedMediaLayout.getTab(i, sharedMediaLayout.info instanceof TLRPC.TL_channelFull) != null) {
                boolean z = sharedMediaLayout.info instanceof TLRPC.TL_channelFull;
                BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                if (z) {
                    if (ChatObject.canUserDoAction(baseFragment.getMessagesController().getChat(Long.valueOf(sharedMediaLayout.info.id)), 5)) {
                        profileTab = sharedMediaLayout.info.main_tab;
                        if (profileTab != null || (i != SharedMediaLayout.getTabId(profileTab) && sharedMediaLayout.firstTab != i)) {
                            ItemOptions itemOptions = new ItemOptions(baseFragment, view, false, true);
                            itemOptions.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(null, Theme.key_windowBackgroundWhite, false)));
                            itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new OAuthSheet$$ExternalSyntheticLambda17(this, i, 6), false);
                            itemOptions.show();
                            return true;
                        }
                    }
                } else if (sharedMediaLayout.dialog_id == baseFragment.getUserConfig().getClientUserId() && (userFull = sharedMediaLayout.userInfo) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    ItemOptions itemOptions2 = new ItemOptions(baseFragment, view, false, true);
                    itemOptions2.setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), Theme.getColor(null, Theme.key_windowBackgroundWhite, false)));
                    itemOptions2.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new OAuthSheet$$ExternalSyntheticLambda17(this, i, 6), false);
                    itemOptions2.show();
                    return true;
                }
            }
            return false;
        }
    }

    public final class AnonymousClass41 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final SharedMediaLayout this$0;

        public AnonymousClass41(SharedMediaLayout sharedMediaLayout, int i) {
            this.$r8$classId = i;
            this.this$0 = sharedMediaLayout;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    this.this$0.floatingDateAnimation = null;
                    break;
                default:
                    SharedMediaLayout sharedMediaLayout = this.this$0;
                    sharedMediaLayout.tabsAnimation = null;
                    boolean z = sharedMediaLayout.backAnimation;
                    ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.searchItem;
                    MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                    if (z) {
                        mediaPageArr[1].setVisibility(8);
                        if (actionBarMenuItem == null || sharedMediaLayout.canShowSearchItem()) {
                            sharedMediaLayout.searchAlpha = sharedMediaLayout.getSearchAlpha(0.0f);
                            sharedMediaLayout.updateSearchItemIcon(0.0f);
                        } else {
                            actionBarMenuItem.setVisibility(sharedMediaLayout.isStoriesView() ? 8 : 4);
                            sharedMediaLayout.searchAlpha = 0.0f;
                        }
                        sharedMediaLayout.updateOptionsSearch(false);
                        sharedMediaLayout.searchItemState = 0;
                    } else {
                        MediaPage mediaPage = mediaPageArr[0];
                        mediaPageArr[0] = mediaPageArr[1];
                        mediaPageArr[1] = mediaPage;
                        mediaPage.setVisibility(8);
                        if (actionBarMenuItem != null && sharedMediaLayout.searchItemState == 2) {
                            actionBarMenuItem.setVisibility(sharedMediaLayout.isStoriesView() ? 8 : 4);
                        }
                        sharedMediaLayout.searchItemState = 0;
                        sharedMediaLayout.selectTabWithId(1.0f, mediaPageArr[0].selectedType);
                        sharedMediaLayout.onSelectedTabChanged();
                        sharedMediaLayout.startStopVisibleGifs();
                    }
                    sharedMediaLayout.tabsAnimationInProgress = false;
                    sharedMediaLayout.maybeStartTracking = false;
                    sharedMediaLayout.startedTracking = false;
                    sharedMediaLayout.onTabScroll(false);
                    sharedMediaLayout.actionBar.setEnabled(true);
                    sharedMediaLayout.scrollSlidingTextTabStrip.setEnabled(true);
                    break;
            }
        }
    }

    public final class AnonymousClass45 implements ViewTreeObserver.OnPreDrawListener {
        public final SparseBooleanArray val$addedMesages;
        public final AnonymousClass19 val$finalListView;
        public final FlickerLoadingView val$finalProgressView;
        public final int val$oldItemCount;

        public AnonymousClass45(AnonymousClass19 anonymousClass19, SparseBooleanArray sparseBooleanArray, FlickerLoadingView flickerLoadingView, int i) {
            this.val$finalListView = anonymousClass19;
            this.val$addedMesages = sparseBooleanArray;
            this.val$finalProgressView = flickerLoadingView;
            this.val$oldItemCount = i;
        }

        @Override
        public final boolean onPreDraw() {
            final int i = 2;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            sharedMediaLayout.getViewTreeObserver().removeOnPreDrawListener(this);
            final AnonymousClass19 anonymousClass19 = this.val$finalListView;
            RecyclerView.Adapter adapter = anonymousClass19.getAdapter();
            final int i2 = 1;
            final int i3 = 0;
            if (adapter == sharedMediaLayout.photoVideoAdapter || adapter == sharedMediaLayout.documentsAdapter || adapter == sharedMediaLayout.audioAdapter || adapter == sharedMediaLayout.voiceAdapter) {
                SparseBooleanArray sparseBooleanArray = this.val$addedMesages;
                if (sparseBooleanArray != null) {
                    int childCount = anonymousClass19.getChildCount();
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = anonymousClass19.getChildAt(i4);
                        int iAccess$12400 = SharedMediaLayout.access$12400(childAt);
                        if (iAccess$12400 != 0 && sparseBooleanArray.get(iAccess$12400, false)) {
                            sharedMediaLayout.messageAlphaEnter.put(iAccess$12400, Float.valueOf(0.0f));
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            valueAnimatorOfFloat.addUpdateListener(new PaintView$$ExternalSyntheticLambda35(this, iAccess$12400, anonymousClass19));
                            valueAnimatorOfFloat.addListener(new ArticleViewer.AnonymousClass3(this, iAccess$12400, 8));
                            valueAnimatorOfFloat.setStartDelay((int) ((Math.min(anonymousClass19.getMeasuredHeight(), Math.max(0, childAt.getTop())) / anonymousClass19.getMeasuredHeight()) * 100.0f));
                            valueAnimatorOfFloat.setDuration(250L);
                            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                @Override
                                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                    switch (i) {
                                        case 0:
                                            SharedMediaLayout.AnonymousClass19 anonymousClass110 = anonymousClass19;
                                            if (anonymousClass110.hasSections()) {
                                                anonymousClass110.invalidate();
                                            }
                                            break;
                                        case 1:
                                            SharedMediaLayout.AnonymousClass19 anonymousClass111 = anonymousClass19;
                                            if (anonymousClass111.hasSections()) {
                                                anonymousClass111.invalidate();
                                            }
                                            break;
                                        default:
                                            SharedMediaLayout.AnonymousClass19 anonymousClass112 = anonymousClass19;
                                            if (anonymousClass112.hasSections()) {
                                                anonymousClass112.invalidate();
                                            }
                                            break;
                                    }
                                }
                            });
                            valueAnimatorOfFloat.start();
                        }
                        anonymousClass19.invalidate();
                    }
                }
                return true;
            }
            int childCount2 = anonymousClass19.getChildCount();
            AnimatorSet animatorSet = new AnimatorSet();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = anonymousClass19.getChildAt(i5);
                FlickerLoadingView flickerLoadingView = this.val$finalProgressView;
                if (childAt2 != flickerLoadingView && RecyclerView.getChildAdapterPosition(childAt2) >= this.val$oldItemCount - 1) {
                    childAt2.setAlpha(0.0f);
                    int iMin = (int) ((Math.min(anonymousClass19.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / anonymousClass19.getMeasuredHeight()) * 100.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat.setStartDelay(iMin);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            switch (i3) {
                                case 0:
                                    SharedMediaLayout.AnonymousClass19 anonymousClass110 = anonymousClass19;
                                    if (anonymousClass110.hasSections()) {
                                        anonymousClass110.invalidate();
                                    }
                                    break;
                                case 1:
                                    SharedMediaLayout.AnonymousClass19 anonymousClass111 = anonymousClass19;
                                    if (anonymousClass111.hasSections()) {
                                        anonymousClass111.invalidate();
                                    }
                                    break;
                                default:
                                    SharedMediaLayout.AnonymousClass19 anonymousClass112 = anonymousClass19;
                                    if (anonymousClass112.hasSections()) {
                                        anonymousClass112.invalidate();
                                    }
                                    break;
                            }
                        }
                    });
                    animatorSet.playTogether(objectAnimatorOfFloat);
                }
                if (flickerLoadingView != null && flickerLoadingView.getParent() == null) {
                    anonymousClass19.addView(flickerLoadingView);
                    RecyclerView.LayoutManager layoutManager = anonymousClass19.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.ignoreView(flickerLoadingView);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(flickerLoadingView, (Property<FlickerLoadingView, Float>) View.ALPHA, flickerLoadingView.getAlpha(), 0.0f);
                        objectAnimatorOfFloat2.addListener(new Tooltip.AnonymousClass1(this, 5));
                        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                switch (i2) {
                                    case 0:
                                        SharedMediaLayout.AnonymousClass19 anonymousClass110 = anonymousClass19;
                                        if (anonymousClass110.hasSections()) {
                                            anonymousClass110.invalidate();
                                        }
                                        break;
                                    case 1:
                                        SharedMediaLayout.AnonymousClass19 anonymousClass111 = anonymousClass19;
                                        if (anonymousClass111.hasSections()) {
                                            anonymousClass111.invalidate();
                                        }
                                        break;
                                    default:
                                        SharedMediaLayout.AnonymousClass19 anonymousClass112 = anonymousClass19;
                                        if (anonymousClass112.hasSections()) {
                                            anonymousClass112.invalidate();
                                        }
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

    public final class AnonymousClass49 implements SharedLinkCell.SharedLinkCellDelegate {
        public AnonymousClass49() {
        }

        @Override
        public final boolean canPerformActions() {
            return !SharedMediaLayout.this.isActionModeShowed;
        }

        @Override
        public final void needOpenWebView(TLRPC.WebPage webPage, MessageObject messageObject) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            EmbedBottomSheet.show(sharedMediaLayout.profileActivity, messageObject, sharedMediaLayout.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
        }

        @Override
        public final void onLinkPress(String str, boolean z) {
            BaseFragment baseFragment = SharedMediaLayout.this.profileActivity;
            if (!z) {
                if (AndroidUtilities.shouldShowUrlInAlert(str)) {
                    AlertsCreator.showOpenUrlAlert(baseFragment, str, true, true);
                    return;
                } else {
                    Browser.openUrl(baseFragment.getParentActivity(), str);
                    return;
                }
            }
            BottomSheet bottomSheet = new BottomSheet(baseFragment.getParentActivity(), null, false, false);
            bottomSheet.fixNavigationBar();
            bottomSheet.title = str;
            bottomSheet.bigTitle = false;
            CharSequence[] charSequenceArr = {LocaleController.getString("Open", R.string.Open), LocaleController.getString("Copy", R.string.Copy)};
            ArticleViewer$$ExternalSyntheticLambda24 articleViewer$$ExternalSyntheticLambda24 = new ArticleViewer$$ExternalSyntheticLambda24(7, this, str);
            bottomSheet.items = charSequenceArr;
            bottomSheet.onClickListener = articleViewer$$ExternalSyntheticLambda24;
            baseFragment.showDialog(bottomSheet);
        }
    }

    public final class AnonymousClass5 implements View.OnClickListener {
        public final Context val$context;
        public final long val$did;
        public final Theme.ResourcesProvider val$resourcesProvider;

        public AnonymousClass5(long j, Theme.ResourcesProvider resourcesProvider, Context context) {
            this.val$did = j;
            this.val$resourcesProvider = resourcesProvider;
            this.val$context = context;
        }

        @Override
        public final void onClick(View view) {
            char c;
            boolean z;
            StoriesController.StoriesList storiesList;
            TLRPC.Chat chat;
            TLRPC.TL_chatAdminRights tL_chatAdminRights;
            AnonymousClass12 anonymousClass12;
            boolean zCanUserDoAction;
            boolean z2;
            ActionBarMenuSubItem actionBarMenuSubItem;
            ActionBarMenuSubItem actionBarMenuSubItem2;
            ActionBarMenuSubItem actionBarMenuSubItem3;
            final int i = 5;
            final int i2 = 2;
            final SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            int closestTab = sharedMediaLayout.getClosestTab();
            boolean zIsAnyStoryPageType = SharedMediaLayout.isAnyStoryPageType(closestTab);
            final BaseFragment baseFragment = sharedMediaLayout.profileActivity;
            MessagesController messagesController = MessagesController.getInstance(baseFragment.getCurrentAccount());
            long j = sharedMediaLayout.dialog_id;
            TLRPC.User user = messagesController.getUser(Long.valueOf(j));
            StoriesController storiesController = sharedMediaLayout.getStoriesController();
            final int i3 = 1;
            final int i4 = 0;
            boolean z3 = UserConfig.getInstance(storiesController.currentAccount).getClientUserId() == j || storiesController.canEditStories(j);
            boolean zIsStoryAlbumPageType = SharedMediaLayout.isStoryAlbumPageType(closestTab);
            ImageView imageView = sharedMediaLayout.photoVideoOptionsItem;
            if (zIsStoryAlbumPageType && z3) {
                Integer num = (Integer) sharedMediaLayout.storyAlbumsByTabType.get(Integer.valueOf(closestTab));
                StoryAlbumData storyAlbumData = num == null ? null : (StoryAlbumData) sharedMediaLayout.storyAlbumsById.get(num);
                if (storyAlbumData != null) {
                    final ItemOptions itemOptions = new ItemOptions(baseFragment, imageView, false, true);
                    int i5 = R.drawable.menu_add_stories;
                    String string = LocaleController.getString(R.string.StoriesAlbumMenuAddStories);
                    final long j2 = this.val$did;
                    final int i6 = storyAlbumData.albumId;
                    final int i7 = 0;
                    itemOptions.add(i5, string, new Runnable() {
                        @Override
                        public final void run() {
                            switch (i7) {
                                case 0:
                                    sharedMediaLayout.openAddStoriesToAlbumSheet(baseFragment, j2, i6);
                                    itemOptions.dismiss();
                                    break;
                                default:
                                    sharedMediaLayout.openDeleteStoriesAlbumAlert(baseFragment, j2, i6);
                                    itemOptions.dismiss();
                                    break;
                            }
                        }
                    }, false);
                    sharedMediaLayout.addStoryAlbumShareItemOptions(baseFragment, j2, i6, itemOptions);
                    itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new PollItemMenu$$ExternalSyntheticLambda17(sharedMediaLayout, i6, itemOptions, i2), false);
                    final int i8 = 1;
                    itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.StoriesAlbumMenuDeleteAlbum), new Runnable() {
                        @Override
                        public final void run() {
                            switch (i8) {
                                case 0:
                                    sharedMediaLayout.openAddStoriesToAlbumSheet(baseFragment, j2, i6);
                                    itemOptions.dismiss();
                                    break;
                                default:
                                    sharedMediaLayout.openDeleteStoriesAlbumAlert(baseFragment, j2, i6);
                                    itemOptions.dismiss();
                                    break;
                            }
                        }
                    }, true);
                    itemOptions.addGap();
                    sharedMediaLayout.addZoomInZoomOutItemOptions(itemOptions);
                    itemOptions.dismissWithButtons = false;
                    itemOptions.onTopOfScrim = true;
                    itemOptions.dimAlpha = 0;
                    itemOptions.show();
                    return;
                }
            }
            if (closestTab == 14) {
                AnonymousClass13 anonymousClass13 = sharedMediaLayout.giftsContainer;
                ProfileGiftsContainer.Page currentPage = anonymousClass13.getCurrentPage();
                StarsController.GiftsList giftsList = currentPage.list;
                if (giftsList == null) {
                    return;
                }
                long j3 = anonymousClass13.dialogId;
                int i9 = anonymousClass13.currentAccount;
                if (j3 == UserConfig.getInstance(i9).getClientUserId()) {
                    zCanUserDoAction = true;
                } else {
                    long j4 = anonymousClass13.dialogId;
                    zCanUserDoAction = j4 >= 0 ? false : ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j4)), 5);
                }
                final ItemOptions itemOptions2 = new ItemOptions(baseFragment, imageView, false, true);
                if (giftsList.isCollection) {
                    z2 = false;
                    actionBarMenuSubItem = null;
                } else {
                    ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(0, itemOptions2.context, itemOptions2.resourcesProvider, false, false);
                    itemOptions2.add(actionBarMenuSubItem4);
                    actionBarMenuSubItem = actionBarMenuSubItem4;
                    z2 = true;
                }
                if (anonymousClass13.canAdd()) {
                    itemOptions2.add(R.drawable.menu_folder_add, LocaleController.getString(R.string.Gift2NewCollection), new Runnable(this) {
                        public final SharedMediaLayout.AnonymousClass5 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i4) {
                                case 0:
                                    SharedMediaLayout.AnonymousClass13 anonymousClass14 = SharedMediaLayout.this.giftsContainer;
                                    anonymousClass14.getClass();
                                    anonymousClass14.openEnterNameAlert(null, new ProfileGiftsContainer$$ExternalSyntheticLambda10(anonymousClass14, 0));
                                    itemOptions2.dismiss();
                                    break;
                                case 1:
                                    SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                    anonymousClass5.getClass();
                                    Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(2, "type");
                                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                    bundleM.putLong("dialog_id", -sharedMediaLayout2.info.id);
                                    MediaActivity mediaActivity = new MediaActivity(bundleM, null);
                                    mediaActivity.currentChatInfo = sharedMediaLayout2.info;
                                    sharedMediaLayout2.profileActivity.presentFragment(mediaActivity);
                                    itemOptions2.dismiss();
                                    break;
                                default:
                                    SharedMediaLayout.this.giftsContainer.setReordering(true);
                                    itemOptions2.dismiss();
                                    break;
                            }
                        }
                    }, false);
                    z2 = true;
                }
                if (anonymousClass13.collections.isMine()) {
                    if (!giftsList.getPinned().isEmpty() || currentPage.isCollection) {
                        itemOptions2.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.Gift2Reorder), new Runnable(this) {
                            public final SharedMediaLayout.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        SharedMediaLayout.AnonymousClass13 anonymousClass14 = SharedMediaLayout.this.giftsContainer;
                                        anonymousClass14.getClass();
                                        anonymousClass14.openEnterNameAlert(null, new ProfileGiftsContainer$$ExternalSyntheticLambda10(anonymousClass14, 0));
                                        itemOptions2.dismiss();
                                        break;
                                    case 1:
                                        SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                        anonymousClass5.getClass();
                                        Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(2, "type");
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        bundleM.putLong("dialog_id", -sharedMediaLayout2.info.id);
                                        MediaActivity mediaActivity = new MediaActivity(bundleM, null);
                                        mediaActivity.currentChatInfo = sharedMediaLayout2.info;
                                        sharedMediaLayout2.profileActivity.presentFragment(mediaActivity);
                                        itemOptions2.dismiss();
                                        break;
                                    default:
                                        SharedMediaLayout.this.giftsContainer.setReordering(true);
                                        itemOptions2.dismiss();
                                        break;
                                }
                            }
                        }, false);
                    }
                    z2 = true;
                }
                if (z2) {
                    itemOptions2.addGap();
                }
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked = itemOptions2.addChecked();
                actionBarMenuSubItemAddChecked.setText(LocaleController.getString(R.string.Gift2FilterUnlimited));
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked2 = itemOptions2.addChecked();
                actionBarMenuSubItemAddChecked2.setText(LocaleController.getString(R.string.Gift2FilterLimited));
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked3 = itemOptions2.addChecked();
                actionBarMenuSubItemAddChecked3.setText(LocaleController.getString(R.string.Gift2FilterUpgradable));
                ActionBarMenuSubItem actionBarMenuSubItemAddChecked4 = itemOptions2.addChecked();
                actionBarMenuSubItemAddChecked4.setText(LocaleController.getString(R.string.Gift2FilterUnique));
                if (zCanUserDoAction) {
                    itemOptions2.addGap();
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked5 = itemOptions2.addChecked();
                    actionBarMenuSubItemAddChecked5.setText(LocaleController.getString(R.string.Gift2FilterDisplayed));
                    ActionBarMenuSubItem actionBarMenuSubItemAddChecked6 = itemOptions2.addChecked();
                    actionBarMenuSubItemAddChecked6.setText(LocaleController.getString(R.string.Gift2FilterHidden));
                    actionBarMenuSubItem2 = actionBarMenuSubItemAddChecked5;
                    actionBarMenuSubItem3 = actionBarMenuSubItemAddChecked6;
                } else {
                    actionBarMenuSubItem2 = null;
                    actionBarMenuSubItem3 = null;
                }
                SendMessagesHelper$$ExternalSyntheticLambda7 sendMessagesHelper$$ExternalSyntheticLambda7 = new SendMessagesHelper$$ExternalSyntheticLambda7(actionBarMenuSubItem, giftsList, actionBarMenuSubItemAddChecked, actionBarMenuSubItemAddChecked2, actionBarMenuSubItemAddChecked3, actionBarMenuSubItemAddChecked4, zCanUserDoAction, actionBarMenuSubItem2, actionBarMenuSubItem3, 3);
                ActionBarMenuSubItem actionBarMenuSubItem5 = actionBarMenuSubItem;
                ActionBarMenuSubItem actionBarMenuSubItem6 = actionBarMenuSubItem2;
                ActionBarMenuSubItem actionBarMenuSubItem7 = actionBarMenuSubItem3;
                sendMessagesHelper$$ExternalSyntheticLambda7.run();
                if (actionBarMenuSubItem5 != null) {
                    actionBarMenuSubItem5.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(16, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7));
                }
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 1);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked2, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 2);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked3, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 4);
                ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItemAddChecked4, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 8);
                if (zCanUserDoAction) {
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem6, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 256);
                    ProfileGiftsContainer.setGiftFilterOptionsClickListeners(actionBarMenuSubItem7, giftsList, sendMessagesHelper$$ExternalSyntheticLambda7, 512);
                }
                itemOptions2.onTopOfScrim = true;
                itemOptions2.dismissWithButtons = false;
                itemOptions2.dimAlpha = 0;
                itemOptions2.show();
                return;
            }
            if (closestTab == 13 && user != null && user.bot && user.bot_has_main_app && user.bot_can_edit && (anonymousClass12 = sharedMediaLayout.botPreviewsContainer) != null) {
                ItemOptions itemOptions3 = new ItemOptions(baseFragment, imageView, false, true);
                itemOptions3.addIf(R.drawable.msg_addbot, LocaleController.getString(R.string.ProfileBotAddPreview), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i3) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                }, anonymousClass12.getItemsCount() < baseFragment.getMessagesController().botPreviewMediasMax);
                itemOptions3.addIf(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileBotReorder), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i2) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                }, anonymousClass12.getItemsCount() > 1 && !anonymousClass12.isSelectedAll());
                final int i10 = 3;
                itemOptions3.addIf(R.drawable.msg_select, LocaleController.getString(anonymousClass12.isSelectedAll() ? R.string.ProfileBotUnSelect : R.string.ProfileBotSelect), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                }, anonymousClass12.getItemsCount() > 0);
                boolean zIsEmpty = TextUtils.isEmpty(anonymousClass12.getCurrentLang());
                int i11 = R.drawable.msg_delete;
                String string2 = LocaleController.formatString(R.string.ProfileBotRemoveLang, TranslateAlert2.languageName(anonymousClass12.getCurrentLang(), null, null));
                final int i12 = 4;
                Runnable runnable = new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i12) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                };
                if (!zIsEmpty) {
                    itemOptions3.add(i11, string2, runnable, true);
                }
                itemOptions3.translate(0.0f, -AndroidUtilities.dp(52.0f));
                itemOptions3.dimAlpha = 0;
                itemOptions3.show();
                return;
            }
            if (sharedMediaLayout.getSelectedTab() == 11) {
                final int i13 = 0;
                ItemOptions itemOptions4 = new ItemOptions(baseFragment, imageView, false, true);
                itemOptions4.add(R.drawable.msg_discussion, LocaleController.getString(R.string.SavedViewAsMessages), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                }, false);
                itemOptions4.addGap();
                final int i14 = 6;
                itemOptions4.add(R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i14) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                }, false);
                itemOptions4.add(R.drawable.msg_delete, LocaleController.getString(R.string.DeleteAll), new Runnable(this) {
                    public final SharedMediaLayout.AnonymousClass5 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i13) {
                            case 0:
                                SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                BaseFragment baseFragment2 = SharedMediaLayout.this.profileActivity;
                                TLRPC.User currentUser = baseFragment2.getUserConfig().getCurrentUser();
                                AlertsCreator.createClearOrDeleteDialogAlert(baseFragment2, false, null, currentUser, false, true, false, true, new RateCallLayout$$ExternalSyntheticLambda1(18, anonymousClass5, currentUser));
                                break;
                            case 1:
                                SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                StoryRecorder storyRecorder = StoryRecorder.getInstance(sharedMediaLayout2.profileActivity.getParentActivity(), sharedMediaLayout2.profileActivity.getCurrentAccount());
                                String currentLang = sharedMediaLayout2.botPreviewsContainer.getCurrentLang();
                                long j5 = sharedMediaLayout2.dialog_id;
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                storyRecorder.open(null);
                                storyRecorder.botId = j5;
                                storyRecorder.botLang = currentLang;
                                break;
                            case 2:
                                SharedMediaLayout.this.botPreviewsContainer.selectAll();
                                break;
                            case 3:
                                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                boolean zIsSelectedAll = sharedMediaLayout3.botPreviewsContainer.isSelectedAll();
                                SharedMediaLayout.AnonymousClass12 anonymousClass14 = sharedMediaLayout3.botPreviewsContainer;
                                if (!zIsSelectedAll) {
                                    anonymousClass14.selectAll();
                                } else {
                                    anonymousClass14.unselectAll();
                                }
                                break;
                            case 4:
                                SharedMediaLayout.AnonymousClass12 anonymousClass15 = SharedMediaLayout.this.botPreviewsContainer;
                                anonymousClass15.deleteLang(anonymousClass15.getCurrentLang());
                                break;
                            case 5:
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                sharedMediaLayout4.profileActivity.getMessagesController().setSavedViewAs(false);
                                Bundle bundle = new Bundle();
                                BaseFragment baseFragment3 = sharedMediaLayout4.profileActivity;
                                bundle.putLong("user_id", baseFragment3.getUserConfig().getClientUserId());
                                baseFragment3.presentFragment(new ChatActivity(bundle), true);
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout5 = SharedMediaLayout.this;
                                try {
                                    sharedMediaLayout5.profileActivity.getMediaDataController().installShortcut(sharedMediaLayout5.profileActivity.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                break;
                        }
                    }
                }, false);
                itemOptions4.translate(0.0f, -AndroidUtilities.dp(52.0f));
                itemOptions4.dimAlpha = 0;
                itemOptions4.show();
                return;
            }
            final ItemOptions itemOptions5 = new ItemOptions(baseFragment, imageView, false, true);
            if ((closestTab == 8 || SharedMediaLayout.isStoryAlbumPageType(closestTab)) && z3) {
                c = 0;
                itemOptions5.add(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddAlbum), new FilterGLThread$$ExternalSyntheticLambda1(this, this.val$resourcesProvider, itemOptions5, 28), false);
                itemOptions5.addGap();
            } else {
                c = 0;
            }
            sharedMediaLayout.addZoomInZoomOutItemOptions(itemOptions5);
            SharedMediaData[] sharedMediaDataArr = sharedMediaLayout.sharedMediaData;
            if (zIsAnyStoryPageType) {
                z = true;
            } else {
                SharedMediaData sharedMediaData = sharedMediaDataArr[c];
                if (sharedMediaData.hasPhotos && sharedMediaData.hasVideos) {
                    z = true;
                } else {
                    boolean[] zArr = sharedMediaData.endReached;
                    if (zArr[c] && zArr[1] && sharedMediaData.startReached) {
                        z = false;
                    } else {
                        z = true;
                    }
                }
            }
            if (!DialogObject.isEncryptedDialog(j) && (user == null || !user.bot)) {
                itemOptions5.add(R.drawable.msg_calendar2, LocaleController.getString(R.string.Calendar), new PollItemMenu$$ExternalSyntheticLambda17(this, closestTab, itemOptions5, 4), false);
                if (sharedMediaLayout.info != null && !sharedMediaLayout.isStoriesView() && (chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(sharedMediaLayout.info.id))) != null && (tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.edit_stories) {
                    itemOptions5.add(R.drawable.msg_archive, LocaleController.getString(R.string.OpenChannelArchiveStories), new Runnable(this) {
                        public final SharedMediaLayout.AnonymousClass5 f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    SharedMediaLayout.AnonymousClass13 anonymousClass14 = SharedMediaLayout.this.giftsContainer;
                                    anonymousClass14.getClass();
                                    anonymousClass14.openEnterNameAlert(null, new ProfileGiftsContainer$$ExternalSyntheticLambda10(anonymousClass14, 0));
                                    itemOptions5.dismiss();
                                    break;
                                case 1:
                                    SharedMediaLayout.AnonymousClass5 anonymousClass5 = this.f$0;
                                    anonymousClass5.getClass();
                                    Bundle bundleM = NotificationBadge$ZukHomeBadger$$ExternalSyntheticOutline0.m(2, "type");
                                    SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                    bundleM.putLong("dialog_id", -sharedMediaLayout2.info.id);
                                    MediaActivity mediaActivity = new MediaActivity(bundleM, null);
                                    mediaActivity.currentChatInfo = sharedMediaLayout2.info;
                                    sharedMediaLayout2.profileActivity.presentFragment(mediaActivity);
                                    itemOptions5.dismiss();
                                    break;
                                default:
                                    SharedMediaLayout.this.giftsContainer.setReordering(true);
                                    itemOptions5.dismiss();
                                    break;
                            }
                        }
                    }, false);
                }
                if (z) {
                    itemOptions5.addGap();
                    final ActionBarMenuSubItem actionBarMenuSubItem8 = new ActionBarMenuSubItem(1, this.val$context, this.val$resourcesProvider, false, false);
                    final ActionBarMenuSubItem actionBarMenuSubItem9 = new ActionBarMenuSubItem(1, this.val$context, this.val$resourcesProvider, false, true);
                    actionBarMenuSubItem8.setTextAndIcon(LocaleController.getString("MediaShowPhotos", R.string.MediaShowPhotos), 0, null);
                    itemOptions5.layout.addView(actionBarMenuSubItem8);
                    actionBarMenuSubItem9.setTextAndIcon(LocaleController.getString("MediaShowVideos", R.string.MediaShowVideos), 0, null);
                    itemOptions5.layout.addView(actionBarMenuSubItem9);
                    if (zIsAnyStoryPageType) {
                        final StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = sharedMediaLayout.storyAlbums_getStoriesAdapterByTabType(closestTab);
                        if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null && (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) != null) {
                            actionBarMenuSubItem8.setChecked(storiesList.showPhotos);
                            actionBarMenuSubItem9.setChecked(storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList.showVideos);
                        }
                        final int i15 = 0;
                        actionBarMenuSubItem8.setOnClickListener(new View.OnClickListener(this) {
                            public final SharedMediaLayout.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i15) {
                                    case 0:
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout2.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem10 = actionBarMenuSubItem9;
                                            boolean z4 = actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem11 = actionBarMenuSubItem8;
                                            if (!z4 && actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked) {
                                                float f = -sharedMediaLayout2.shiftDp;
                                                sharedMediaLayout2.shiftDp = f;
                                                AndroidUtilities.shakeViewSpring(view2, f);
                                                break;
                                            } else {
                                                actionBarMenuSubItem11.getCheckView().checkBoxBase.setChecked(-1, !actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked, true);
                                                StoriesController.StoriesList storiesList2 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                                                if (storiesList2 != null) {
                                                    boolean z5 = actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked;
                                                    boolean z6 = actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked;
                                                    storiesList2.showPhotos = z5;
                                                    storiesList2.showVideos = z6;
                                                    storiesList2.fill(true);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout3.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem12 = actionBarMenuSubItem9;
                                            boolean z7 = actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem13 = actionBarMenuSubItem8;
                                            if (!z7 && actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked) {
                                                float f2 = -sharedMediaLayout3.shiftDp;
                                                sharedMediaLayout3.shiftDp = f2;
                                                AndroidUtilities.shakeViewSpring(view2, f2);
                                                break;
                                            } else {
                                                actionBarMenuSubItem13.getCheckView().checkBoxBase.setChecked(-1, !actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked, true);
                                                StoriesController.StoriesList storiesList3 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                                                if (storiesList3 != null) {
                                                    boolean z8 = actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked;
                                                    boolean z9 = actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked;
                                                    storiesList3.showPhotos = z8;
                                                    storiesList3.showVideos = z9;
                                                    storiesList3.fill(true);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        final int i16 = 1;
                        actionBarMenuSubItem9.setOnClickListener(new View.OnClickListener(this) {
                            public final SharedMediaLayout.AnonymousClass5 f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i16) {
                                    case 0:
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout2.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem10 = actionBarMenuSubItem8;
                                            boolean z4 = actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem11 = actionBarMenuSubItem9;
                                            if (!z4 && actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked) {
                                                float f = -sharedMediaLayout2.shiftDp;
                                                sharedMediaLayout2.shiftDp = f;
                                                AndroidUtilities.shakeViewSpring(view2, f);
                                                break;
                                            } else {
                                                actionBarMenuSubItem11.getCheckView().checkBoxBase.setChecked(-1, !actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked, true);
                                                StoriesController.StoriesList storiesList2 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                                                if (storiesList2 != null) {
                                                    boolean z5 = actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked;
                                                    boolean z6 = actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked;
                                                    storiesList2.showPhotos = z5;
                                                    storiesList2.showVideos = z6;
                                                    storiesList2.fill(true);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    default:
                                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout3.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem12 = actionBarMenuSubItem8;
                                            boolean z7 = actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem13 = actionBarMenuSubItem9;
                                            if (!z7 && actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked) {
                                                float f2 = -sharedMediaLayout3.shiftDp;
                                                sharedMediaLayout3.shiftDp = f2;
                                                AndroidUtilities.shakeViewSpring(view2, f2);
                                                break;
                                            } else {
                                                actionBarMenuSubItem13.getCheckView().checkBoxBase.setChecked(-1, !actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked, true);
                                                StoriesController.StoriesList storiesList3 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                                                if (storiesList3 != null) {
                                                    boolean z8 = actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked;
                                                    boolean z9 = actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked;
                                                    storiesList3.showPhotos = z8;
                                                    storiesList3.showVideos = z9;
                                                    storiesList3.fill(true);
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                    } else {
                        final int i17 = 0;
                        int i18 = sharedMediaDataArr[0].filterType;
                        actionBarMenuSubItem8.setChecked(i18 == 0 || i18 == 1);
                        actionBarMenuSubItem8.setOnClickListener(new View.OnClickListener(this) {
                            public final AnonymousClass5 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i17) {
                                    case 0:
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout2.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem10 = actionBarMenuSubItem9;
                                            boolean z4 = actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem11 = actionBarMenuSubItem8;
                                            if (!z4 && actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked) {
                                                float f = -sharedMediaLayout2.shiftDp;
                                                sharedMediaLayout2.shiftDp = f;
                                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem11, f);
                                            } else {
                                                actionBarMenuSubItem11.setChecked(!actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked);
                                                if (actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked && actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked) {
                                                    sharedMediaLayout2.sharedMediaData[0].filterType = 0;
                                                } else {
                                                    sharedMediaLayout2.sharedMediaData[0].filterType = 2;
                                                }
                                                sharedMediaLayout2.changeMediaFilterType();
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout3.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem12 = actionBarMenuSubItem9;
                                            boolean z5 = actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem13 = actionBarMenuSubItem8;
                                            if (!z5 && actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked) {
                                                float f2 = -sharedMediaLayout3.shiftDp;
                                                sharedMediaLayout3.shiftDp = f2;
                                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem13, f2);
                                            } else {
                                                actionBarMenuSubItem13.setChecked(!actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked);
                                                if (actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked && actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked) {
                                                    sharedMediaLayout3.sharedMediaData[0].filterType = 0;
                                                } else {
                                                    sharedMediaLayout3.sharedMediaData[0].filterType = 1;
                                                }
                                                sharedMediaLayout3.changeMediaFilterType();
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        int i19 = sharedMediaDataArr[0].filterType;
                        actionBarMenuSubItem9.setChecked(i19 == 0 || i19 == 2);
                        actionBarMenuSubItem9.setOnClickListener(new View.OnClickListener(this) {
                            public final AnonymousClass5 this$1;

                            {
                                this.this$1 = this;
                            }

                            @Override
                            public final void onClick(View view2) {
                                switch (i3) {
                                    case 0:
                                        SharedMediaLayout sharedMediaLayout2 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout2.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem10 = actionBarMenuSubItem8;
                                            boolean z4 = actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem11 = actionBarMenuSubItem9;
                                            if (!z4 && actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked) {
                                                float f = -sharedMediaLayout2.shiftDp;
                                                sharedMediaLayout2.shiftDp = f;
                                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem11, f);
                                            } else {
                                                actionBarMenuSubItem11.setChecked(!actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked);
                                                if (actionBarMenuSubItem11.getCheckView().checkBoxBase.isChecked && actionBarMenuSubItem10.getCheckView().checkBoxBase.isChecked) {
                                                    sharedMediaLayout2.sharedMediaData[0].filterType = 0;
                                                } else {
                                                    sharedMediaLayout2.sharedMediaData[0].filterType = 2;
                                                }
                                                sharedMediaLayout2.changeMediaFilterType();
                                            }
                                            break;
                                        }
                                        break;
                                    default:
                                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                                        if (!sharedMediaLayout3.changeTypeAnimation) {
                                            ActionBarMenuSubItem actionBarMenuSubItem12 = actionBarMenuSubItem8;
                                            boolean z5 = actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked;
                                            ActionBarMenuSubItem actionBarMenuSubItem13 = actionBarMenuSubItem9;
                                            if (!z5 && actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked) {
                                                float f2 = -sharedMediaLayout3.shiftDp;
                                                sharedMediaLayout3.shiftDp = f2;
                                                AndroidUtilities.shakeViewSpring(actionBarMenuSubItem13, f2);
                                            } else {
                                                actionBarMenuSubItem13.setChecked(!actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked);
                                                if (actionBarMenuSubItem12.getCheckView().checkBoxBase.isChecked && actionBarMenuSubItem13.getCheckView().checkBoxBase.isChecked) {
                                                    sharedMediaLayout3.sharedMediaData[0].filterType = 0;
                                                } else {
                                                    sharedMediaLayout3.sharedMediaData[0].filterType = 1;
                                                }
                                                sharedMediaLayout3.changeMediaFilterType();
                                            }
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            }
            itemOptions5.dismissWithButtons = false;
            itemOptions5.onTopOfScrim = true;
            itemOptions5.dimAlpha = 0;
            itemOptions5.show();
        }
    }

    public final class AnonymousClass6 extends SharedPhotoVideoAdapter {
        public AnonymousClass6(Context context) {
            super(context);
        }

        @Override
        public final void notifyDataSetChanged() {
            this.mObservable.notifyChanged();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            MediaPage mediaPage = sharedMediaLayout.getMediaPage(0);
            if (mediaPage == null || mediaPage.animationSupportingListView.getVisibility() != 0) {
                return;
            }
            sharedMediaLayout.animationSupportingPhotoVideoAdapter.notifyDataSetChanged();
        }
    }

    public final class AnonymousClass8 extends ViewOutlineProvider {
        @Override
        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), AndroidUtilities.dp(24.0f) + view.getHeight(), AndroidUtilities.dp(24.0f));
        }
    }

    public final class AnonymousClass9 extends StoriesAdapter {
        public AnonymousClass9(Context context) {
            super(context, 0, false);
        }

        @Override
        public final void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            MediaPage mediaPage = sharedMediaLayout.getMediaPage(8);
            if (mediaPage != null && mediaPage.animationSupportingListView.getVisibility() == 0) {
                sharedMediaLayout.animationSupportingStoriesAdapter.notifyDataSetChanged();
            }
            if (mediaPage != null) {
                AnonymousClass29 anonymousClass29 = mediaPage.emptyView;
                StoriesController.StoriesList storiesList = this.storiesList;
                anonymousClass29.showProgress(storiesList != null && (storiesList.isLoading() || (sharedMediaLayout.profileActivity.getConnectionsManager().getConnectionState() == 3 && this.storiesList.getCount() > 0)), true);
            }
        }
    }

    public final class ChannelRecommendationsAdapter extends RecyclerListView.SelectionAdapter {
        public final ArrayList chats = new ArrayList();
        public final Context mContext;
        public int more;

        public ChannelRecommendationsAdapter(Context context) {
            this.mContext = context;
            update(false);
        }

        @Override
        public final int getItemCount() {
            return this.chats.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return (this.more <= 0 || i != this.chats.size() + (-1)) ? 17 : 18;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ProfileSearchCell profileSearchCell;
            int i2 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i2 == 17) {
                if (!(view instanceof ProfileSearchCell)) {
                    return;
                } else {
                    profileSearchCell = (ProfileSearchCell) view;
                }
            } else if (i2 != 18) {
                profileSearchCell = null;
            } else if (!(view instanceof MoreRecommendationsCell)) {
                return;
            } else {
                profileSearchCell = ((MoreRecommendationsCell) view).channelCell;
            }
            ProfileSearchCell profileSearchCell2 = profileSearchCell;
            if (profileSearchCell2 != null) {
                ArrayList arrayList = this.chats;
                profileSearchCell2.setData(arrayList.get(i), null, null, null, false, false);
                profileSearchCell2.useSeparator = i != arrayList.size() - 1;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View profileSearchCell;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (i == 18) {
                BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                profileSearchCell = new MoreRecommendationsCell(baseFragment == null ? UserConfig.selectedAccount : baseFragment.getCurrentAccount(), this.mContext, sharedMediaLayout.dialog_id > 0, sharedMediaLayout.resourcesProvider, new SeekBarView$$ExternalSyntheticLambda1(this, 18));
            } else {
                profileSearchCell = new ProfileSearchCell(this.mContext, sharedMediaLayout.resourcesProvider);
            }
            profileSearchCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(profileSearchCell);
        }

        public final void update(boolean z) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
            if (baseFragment == null) {
                return;
            }
            long j = sharedMediaLayout.dialog_id;
            if (DialogObject.isChatDialog(j)) {
                TLRPC.Chat chat = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j));
                if (chat == null || !ChatObject.isChannelAndNotMegaGroup(chat)) {
                    return;
                }
            } else if (MessagesController.getInstance(baseFragment.getCurrentAccount()).getUser(Long.valueOf(j)) == null) {
                return;
            }
            MessagesController.ChannelRecommendations channelRecommendations = MessagesController.getInstance(baseFragment.getCurrentAccount()).getChannelRecommendations(j);
            ArrayList arrayList = this.chats;
            arrayList.clear();
            int i = 0;
            if (channelRecommendations != null) {
                for (int i2 = 0; i2 < channelRecommendations.chats.size(); i2++) {
                    TLObject tLObject = channelRecommendations.chats.get(i2);
                    if ((tLObject instanceof TLRPC.Chat) && ChatObject.isNotInChat((TLRPC.Chat) tLObject)) {
                        arrayList.add(tLObject);
                    } else {
                        arrayList.add(tLObject);
                    }
                }
            }
            if (!arrayList.isEmpty() && !UserConfig.getInstance(baseFragment.getCurrentAccount()).isPremium()) {
                i = channelRecommendations.more;
            }
            this.more = i;
            if (z) {
                this.mObservable.notifyChanged();
            }
        }
    }

    public final class ChatUsersAdapter extends RecyclerListView.SelectionAdapter {
        public TLRPC.ChatFull chatInfo;
        public final Context mContext;
        public ArrayList sortedUsers;

        public ChatUsersAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
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
        public final int getItemViewType(int i) {
            TLRPC.ChatFull chatFull = this.chatInfo;
            return (chatFull == null || !chatFull.participants.participants.isEmpty()) ? 21 : 20;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String string;
            String str;
            boolean z;
            boolean z2;
            boolean z3;
            View view = viewHolder.itemView;
            if (view instanceof UserCell) {
                UserCell userCell = (UserCell) view;
                TLRPC.ChatParticipant chatParticipant = !this.sortedUsers.isEmpty() ? this.chatInfo.participants.participants.get(((Integer) this.sortedUsers.get(i)).intValue()) : this.chatInfo.participants.participants.get(i);
                if (chatParticipant != null) {
                    boolean z4 = chatParticipant instanceof TLRPC.TL_chatChannelParticipant;
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    BaseFragment baseFragment = sharedMediaLayout.profileActivity;
                    if (z4) {
                        TLRPC.ChannelParticipant channelParticipant = ((TLRPC.TL_chatChannelParticipant) chatParticipant).channelParticipant;
                        string = channelParticipant.rank;
                        if (channelParticipant instanceof TLRPC.TL_channelParticipantCreator) {
                            if (TextUtils.isEmpty(string)) {
                                string = LocaleController.getString("ChannelCreator", R.string.ChannelCreator);
                            }
                            baseFragment = baseFragment;
                            str = string;
                            z = true;
                            z2 = true;
                            z3 = false;
                        } else {
                            if (channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) {
                                if (TextUtils.isEmpty(string)) {
                                    string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                }
                                if (channelParticipant.promoted_by == baseFragment.getUserConfig().getClientUserId()) {
                                    baseFragment = baseFragment;
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
                            baseFragment = baseFragment;
                            str = string;
                            z = true;
                            z2 = true;
                            z3 = false;
                        } else {
                            if (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin) {
                                if (TextUtils.isEmpty(string)) {
                                    string = LocaleController.getString("ChannelAdmin", R.string.ChannelAdmin);
                                }
                                if (chatParticipant.inviter_id == baseFragment.getUserConfig().getClientUserId()) {
                                    baseFragment = baseFragment;
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
                    TLRPC.User user = baseFragment.getMessagesController().getUser(Long.valueOf(chatParticipant.user_id));
                    userCell.setAdminRole(str, z, z2, UserObject.isUserSelf(user) && ChatObject.canManageMyTag(baseFragment.getMessagesController().getChat(Long.valueOf(-sharedMediaLayout.dialog_id))), new ProfileActivity$ListAdapter$$ExternalSyntheticLambda4(this, user, str, z, z2, z3, 2));
                    userCell.setData(user, null, null, i != this.chatInfo.participants.participants.size() - 1);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (i != 20) {
                UserCell userCell = new UserCell(9, 0, this.mContext, sharedMediaLayout.resourcesProvider, true, false);
                userCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(userCell);
            }
            EmptyStubView emptyStubViewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(7, sharedMediaLayout.dialog_id, this.mContext, sharedMediaLayout.resourcesProvider);
            emptyStubViewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
            return new RecyclerListView.Holder(emptyStubViewCreateEmptyStubView);
        }
    }

    public final class CommonGroupsAdapter extends RecyclerListView.SelectionAdapter {
        public final ArrayList chats = new ArrayList();
        public boolean endReached;
        public boolean firstLoaded;
        public boolean loading;
        public final Context mContext;

        public CommonGroupsAdapter(Context context) {
            this.mContext = context;
        }

        public final void getChats(long j) {
            if (this.loading) {
                return;
            }
            TLRPC.TL_messages_getCommonChats tL_messages_getCommonChats = new TLRPC.TL_messages_getCommonChats();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            long j2 = sharedMediaLayout.dialog_id;
            boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j2);
            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
            if (zIsEncryptedDialog) {
                j2 = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(baseFragment.getMessagesController(), j2).user_id;
            }
            TLRPC.InputUser inputUser = baseFragment.getMessagesController().getInputUser(j2);
            tL_messages_getCommonChats.user_id = inputUser;
            if (inputUser instanceof TLRPC.TL_inputUserEmpty) {
                return;
            }
            tL_messages_getCommonChats.limit = 100;
            tL_messages_getCommonChats.max_id = j;
            this.loading = true;
            this.mObservable.notifyChanged();
            baseFragment.getConnectionsManager().bindRequestToGuid(baseFragment.getConnectionsManager().sendRequest(tL_messages_getCommonChats, new LinkManager$$ExternalSyntheticLambda3(this, 2)), baseFragment.getClassGuid());
        }

        @Override
        public final int getItemCount() {
            ArrayList arrayList = this.chats;
            if (arrayList.isEmpty() && !this.loading) {
                return 1;
            }
            int size = arrayList.size();
            return (arrayList.isEmpty() || this.endReached) ? size : size + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            ArrayList arrayList = this.chats;
            if (!arrayList.isEmpty() || this.loading) {
                return i < arrayList.size() ? 14 : 16;
            }
            return 15;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getAdapterPosition() != this.chats.size();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 14) {
                View view = viewHolder.itemView;
                if (view instanceof ProfileSearchCell) {
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    ArrayList arrayList = this.chats;
                    profileSearchCell.setData((TLRPC.Chat) arrayList.get(i), null, null, null, false, false);
                    boolean z = true;
                    if (i == arrayList.size() - 1 && this.endReached) {
                        z = false;
                    }
                    profileSearchCell.useSeparator = z;
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View profileSearchCell;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            Theme.ResourcesProvider resourcesProvider = sharedMediaLayout.resourcesProvider;
            Context context = this.mContext;
            if (i == 14) {
                profileSearchCell = new ProfileSearchCell(context, resourcesProvider);
            } else {
                if (i == 15) {
                    EmptyStubView emptyStubViewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(6, sharedMediaLayout.dialog_id, context, resourcesProvider);
                    emptyStubViewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(emptyStubViewCreateEmptyStubView);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate = false;
                flickerLoadingView.setViewType(1);
                profileSearchCell = flickerLoadingView;
            }
            return zzkl.m(profileSearchCell, profileSearchCell);
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

    public final class EmptyStubView extends LinearLayout {
        public final ImageView emptyImageView;
        public final TextView emptyTextView;
        public boolean ignoreRequestLayout;

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
        public final void onMeasure(int i, int i2) {
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
        public final void requestLayout() {
            if (this.ignoreRequestLayout) {
                return;
            }
            super.requestLayout();
        }
    }

    public final class GifAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public GifAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getItemCount() {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            if (sharedMediaDataArr[5].messages.size() != 0 || sharedMediaDataArr[5].loading) {
                return sharedMediaDataArr[5].messages.size();
            }
            return 1;
        }

        @Override
        public final long getItemId(int i) {
            return i;
        }

        @Override
        public final int getItemViewType(int i) {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            return (sharedMediaDataArr[5].messages.size() != 0 || sharedMediaDataArr[5].loading) ? 12 : 11;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            return sharedMediaDataArr[5].messages.size() != 0 || sharedMediaDataArr[5].loading;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.mItemViewType == 12) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                MessageObject messageObject = (MessageObject) sharedMediaLayout.sharedMediaData[5].messages.get(i);
                TLRPC.Document document = messageObject.getDocument();
                if (document != null) {
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
                        if (sharedMediaLayout.isActionModeShowed) {
                            contextLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > sharedMediaLayout.dialog_id ? 1 : (messageObject.getDialogId() == sharedMediaLayout.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !sharedMediaLayout.scrolling);
                        } else {
                            contextLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
                        }
                    }
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            Context context = this.mContext;
            if (i == 11) {
                EmptyStubView emptyStubViewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(5, sharedMediaLayout.dialog_id, context, sharedMediaLayout.resourcesProvider);
                emptyStubViewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(emptyStubViewCreateEmptyStubView);
            }
            ContextLinkCell contextLinkCell = new ContextLinkCell(context, sharedMediaLayout.resourcesProvider, true);
            contextLinkCell.setCanPreviewGif(true);
            return new RecyclerListView.Holder(contextLinkCell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
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

    public final class GroupUsersSearchAdapter extends RecyclerListView.SelectionAdapter {
        public final TLRPC.Chat currentChat;
        public final Context mContext;
        public final SearchAdapterHelper searchAdapterHelper;
        public SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda1 searchRunnable;
        public ArrayList searchResultNames = new ArrayList();
        public int totalCount = 0;
        public int searchCount = 0;

        public GroupUsersSearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.delegate = new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0(this);
            this.currentChat = SharedMediaLayout.this.delegate.getCurrentChat();
        }

        public final TLObject getItem(int i) {
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size = searchAdapterHelper.groupSearch.size();
            if (i < 0 || i >= size) {
                return null;
            }
            return (TLObject) searchAdapterHelper.groupSearch.get(i);
        }

        @Override
        public final int getItemCount() {
            return this.totalCount;
        }

        @Override
        public final int getItemViewType(int i) {
            return 22;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void notifyDataSetChanged() {
            int size = this.searchAdapterHelper.groupSearch.size();
            this.totalCount = size;
            if (size > 0) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.searching) {
                    MediaPage mediaPage = sharedMediaLayout.mediaPages[0];
                    if (mediaPage.selectedType == 7 && mediaPage.listView.getAdapter() != this) {
                        sharedMediaLayout.switchToCurrentSelectedMode(false);
                    }
                }
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.User user;
            SpannableStringBuilder spannableStringBuilder;
            TLObject item = getItem(i);
            boolean z = item instanceof TLRPC.ChannelParticipant;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            BaseFragment baseFragment = sharedMediaLayout.profileActivity;
            if (z) {
                user = baseFragment.getMessagesController().getUser(Long.valueOf(MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer)));
            } else if (!(item instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                user = baseFragment.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
            }
            UserObject.getPublicUsername(user);
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            searchAdapterHelper.groupSearch.size();
            String str = searchAdapterHelper.lastFoundChannel;
            if (str != null) {
                String userName = UserObject.getUserName(user);
                spannableStringBuilder = new SpannableStringBuilder(userName);
                int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(userName, str);
                if (iIndexOfIgnoreCase != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(sharedMediaLayout.getThemedColor$13(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOfIgnoreCase, str.length() + iIndexOfIgnoreCase, 33);
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
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 9, 5, true, sharedMediaLayout.resourcesProvider);
            manageChatUserCell.setBackgroundColor(sharedMediaLayout.getThemedColor$13(Theme.key_windowBackgroundWhite));
            manageChatUserCell.setDelegate(new SharedMediaLayout$GroupUsersSearchAdapter$$ExternalSyntheticLambda0(this));
            return new RecyclerListView.Holder(manageChatUserCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public final void search(String str, boolean z) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            this.searchAdapterHelper.queryServerSearch(null, true, false, true, false, false, ChatObject.isChannel(this.currentChat) ? this.currentChat.id : 0L, false, 2, 0, 0L, null);
            notifyDataSetChanged();
            int i = 0;
            while (true) {
                MediaPage[] mediaPageArr = SharedMediaLayout.this.mediaPages;
                if (i >= mediaPageArr.length) {
                    break;
                }
                if (mediaPageArr[i].selectedType == 7 && !TextUtils.isEmpty(str)) {
                    SharedMediaLayout.this.mediaPages[i].emptyView.showProgress(true, z);
                }
                i++;
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

    public class InternalListView extends BlurredRecyclerView implements StoriesListPlaceProvider.ClippedView {
        public int hintPaddingBottom;
        public int hintPaddingTop;

        public InternalListView(Context context) {
            super(context, null);
        }

        @Override
        public final void updateClip(int[] iArr) {
            iArr[0] = (getPaddingTop() - AndroidUtilities.dp(2.0f)) - this.hintPaddingTop;
            iArr[1] = (getMeasuredHeight() - getPaddingBottom()) - this.hintPaddingBottom;
        }
    }

    public abstract class MediaPage extends FrameLayout {
        public AnonymousClass26 animatingImageView;
        public AnonymousClass20 animationSupportingLayoutManager;
        public InternalListView animationSupportingListView;
        public AnonymousClass29 emptyView;
        public ObjectAnimator fastScrollAnimator;
        public boolean fastScrollEnabled;
        public ShareAlert$$ExternalSyntheticLambda29 fastScrollHideHintRunnable;
        public boolean fastScrollHinWasShown;
        public SharedMediaFastScrollTooltip fastScrollHintView;
        public boolean highlightAnimation;
        public int highlightMessageId;
        public float highlightProgress;
        public ViewGroupPartRenderer iBlur3Capture;
        public DefaultItemAnimator itemAnimator;
        public long lastCheckScrollTime;
        public AnonymousClass17 layoutManager;
        public AnonymousClass19 listView;
        public AnonymousClass27 progressView;
        public RecyclerAnimationScrollHelper scrollHelper;
        public RecyclerView.RecycledViewPool searchViewPool;
        public int selectedType;
        public RecyclerView.RecycledViewPool viewPool;

        @Override
        public final void dispatchDraw(Canvas canvas) {
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
        public final boolean drawChild(Canvas canvas, View view, long j) {
            if (view == this.animationSupportingListView) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }
    }

    public final class MediaSearchAdapter extends RecyclerListView.SelectionAdapter {
        public final int currentType;
        public int lastReqId;
        public final Context mContext;
        public ShareAlert$$ExternalSyntheticLambda29 searchRunnable;
        public int searchesInProgress;
        public ArrayList searchResult = new ArrayList();
        public ArrayList globalSearch = new ArrayList();
        public int reqId = 0;

        public final class AnonymousClass1 extends SharedAudioCell {
            public final int $r8$classId;
            public final RecyclerListView.SelectionAdapter this$1;

            public AnonymousClass1(RecyclerListView.SelectionAdapter selectionAdapter, Context context, Theme.ResourcesProvider resourcesProvider, int i) {
                super(context, 0, resourcesProvider);
                this.$r8$classId = i;
                this.this$1 = selectionAdapter;
            }

            @Override
            public final boolean needPlayMessage(MessageObject messageObject) {
                switch (this.$r8$classId) {
                    case 0:
                        boolean zIsVoice = messageObject.isVoice();
                        MediaSearchAdapter mediaSearchAdapter = (MediaSearchAdapter) this.this$1;
                        if (!zIsVoice && !messageObject.isRoundVideo()) {
                            if (messageObject.isMusic()) {
                                return MediaController.getInstance().setPlaylist(mediaSearchAdapter.searchResult, messageObject, SharedMediaLayout.this.mergeDialogId);
                            }
                            return false;
                        }
                        boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                        MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? mediaSearchAdapter.searchResult : null, false);
                        if (messageObject.isRoundVideo()) {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                        return zPlayMessage;
                    default:
                        boolean zIsVoice2 = messageObject.isVoice();
                        SharedDocumentsAdapter sharedDocumentsAdapter = (SharedDocumentsAdapter) this.this$1;
                        int i = sharedDocumentsAdapter.currentType;
                        SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                        if (zIsVoice2 || messageObject.isRoundVideo()) {
                            boolean zPlayMessage2 = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage2 ? sharedMediaLayout.sharedMediaData[i].messages : null, false);
                            return zPlayMessage2;
                        }
                        if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(sharedMediaLayout.sharedMediaData[i].messages, messageObject, sharedMediaLayout.mergeDialogId);
                        }
                        return false;
                }
            }
        }

        public MediaSearchAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public final int getItemCount() {
            int size = this.searchResult.size();
            int size2 = this.globalSearch.size();
            return size2 != 0 ? size + size2 : size;
        }

        @Override
        public final int getItemViewType(int i) {
            return 24;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return this.globalSearch.size() + this.searchResult.size() != 0;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            View view = viewHolder.itemView;
            SparseArray[] sparseArrayArr = sharedMediaLayout.selectedFiles;
            long j = sharedMediaLayout.dialog_id;
            int i2 = this.currentType;
            if (i2 == 1) {
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject messageObject = i < this.searchResult.size() ? (MessageObject) this.searchResult.get(i) : (MessageObject) this.globalSearch.get(i - this.searchResult.size());
                    sharedDocumentCell.setDocument(messageObject, i != getItemCount() - 1);
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sparseArrayArr[(messageObject.getDialogId() > j ? 1 : (messageObject.getDialogId() == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !sharedMediaLayout.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 != 3) {
                if (i2 == 4 && (view instanceof SharedAudioCell)) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
                    MessageObject messageObject2 = i < this.searchResult.size() ? (MessageObject) this.searchResult.get(i) : (MessageObject) this.globalSearch.get(i - this.searchResult.size());
                    sharedAudioCell.setMessageObject(messageObject2, i != getItemCount() - 1);
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedAudioCell.setChecked(sparseArrayArr[(messageObject2.getDialogId() > j ? 1 : (messageObject2.getDialogId() == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !sharedMediaLayout.scrolling);
                        return;
                    } else {
                        sharedAudioCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (view instanceof SharedLinkCell) {
                SharedLinkCell sharedLinkCell = (SharedLinkCell) view;
                MessageObject messageObject3 = i < this.searchResult.size() ? (MessageObject) this.searchResult.get(i) : (MessageObject) this.globalSearch.get(i - this.searchResult.size());
                sharedLinkCell.needDivider = i != getItemCount() - 1;
                sharedLinkCell.resetPressedLink();
                sharedLinkCell.message = messageObject3;
                sharedLinkCell.requestLayout();
                if (sharedMediaLayout.isActionModeShowed) {
                    sharedLinkCell.setChecked(sparseArrayArr[(messageObject3.getDialogId() > j ? 1 : (messageObject3.getDialogId() == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject3.getId()) >= 0, !sharedMediaLayout.scrolling);
                } else {
                    sharedLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View anonymousClass1;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            Context context = this.mContext;
            Theme.ResourcesProvider resourcesProvider = sharedMediaLayout.resourcesProvider;
            int i2 = this.currentType;
            if (i2 == 1) {
                anonymousClass1 = new SharedDocumentCell(context, 0, resourcesProvider);
            } else if (i2 == 4) {
                anonymousClass1 = new AnonymousClass1(this, context, resourcesProvider, 0);
            } else {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(context, 0, resourcesProvider);
                sharedLinkCell.setDelegate(sharedMediaLayout.sharedLinkCellDelegate);
                anonymousClass1 = sharedLinkCell;
            }
            anonymousClass1.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(anonymousClass1);
        }

        public final void queryServerSearch(final int i, final String str, long j, long j2) {
            if (DialogObject.isEncryptedDialog(j)) {
                return;
            }
            int i2 = this.reqId;
            BaseFragment baseFragment = SharedMediaLayout.this.profileActivity;
            if (i2 != 0) {
                baseFragment.getConnectionsManager().cancelRequest(this.reqId, true);
                this.reqId = 0;
                this.searchesInProgress--;
            }
            if (str == null || str.length() == 0) {
                this.globalSearch.clear();
                this.lastReqId = 0;
                this.mObservable.notifyChanged();
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.limit = 50;
            tL_messages_search.offset_id = i;
            int i3 = this.currentType;
            if (i3 == 1) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterDocument();
            } else if (i3 == 3) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterUrl();
            } else if (i3 == 4) {
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterMusic();
            }
            tL_messages_search.q = str;
            tL_messages_search.peer = baseFragment.getMessagesController().getInputPeer(j);
            if (j2 != 0) {
                if (j == baseFragment.getUserConfig().getClientUserId()) {
                    tL_messages_search.flags |= 4;
                    tL_messages_search.saved_peer_id = baseFragment.getMessagesController().getInputPeer(j2);
                } else {
                    tL_messages_search.flags |= 2;
                    tL_messages_search.top_msg_id = (int) j2;
                }
            }
            if (tL_messages_search.peer == null) {
                return;
            }
            final int i4 = this.lastReqId + 1;
            this.lastReqId = i4;
            this.searchesInProgress++;
            this.reqId = baseFragment.getConnectionsManager().sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SharedMediaLayout.MediaSearchAdapter mediaSearchAdapter = this.f$0;
                    mediaSearchAdapter.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (tL_error == null) {
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        for (int i5 = 0; i5 < messages_messages.messages.size(); i5++) {
                            TLRPC.Message message = messages_messages.messages.get(i5);
                            int i6 = i;
                            if (i6 == 0 || message.id <= i6) {
                                arrayList.add(new MessageObject(SharedMediaLayout.this.profileActivity.getCurrentAccount(), message, false, true));
                            }
                        }
                    }
                    AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda71(mediaSearchAdapter, i4, arrayList, str, 26));
                }
            }, 2);
            baseFragment.getConnectionsManager().bindRequestToGuid(this.reqId, baseFragment.getClassGuid());
        }

        public final void search(String str, boolean z) {
            ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29 = this.searchRunnable;
            if (shareAlert$$ExternalSyntheticLambda29 != null) {
                AndroidUtilities.cancelRunOnUIThread(shareAlert$$ExternalSyntheticLambda29);
                this.searchRunnable = null;
            }
            if (!this.searchResult.isEmpty() || !this.globalSearch.isEmpty()) {
                this.searchResult.clear();
                this.globalSearch.clear();
                this.mObservable.notifyChanged();
            }
            boolean zIsEmpty = TextUtils.isEmpty(str);
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            int i = 0;
            if (zIsEmpty) {
                if (this.searchResult.isEmpty() && this.globalSearch.isEmpty() && this.searchesInProgress == 0) {
                    return;
                }
                this.searchResult.clear();
                this.globalSearch.clear();
                if (this.reqId != 0) {
                    sharedMediaLayout.profileActivity.getConnectionsManager().cancelRequest(this.reqId, true);
                    this.reqId = 0;
                    this.searchesInProgress--;
                    return;
                }
                return;
            }
            while (true) {
                MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                if (i >= mediaPageArr.length) {
                    ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda210 = new ShareAlert$$ExternalSyntheticLambda29(20, this, str);
                    this.searchRunnable = shareAlert$$ExternalSyntheticLambda210;
                    AndroidUtilities.runOnUIThread(shareAlert$$ExternalSyntheticLambda210, 300L);
                    return;
                } else {
                    MediaPage mediaPage = mediaPageArr[i];
                    if (mediaPage.selectedType == this.currentType) {
                        mediaPage.emptyView.showProgress(true, z);
                    }
                    i++;
                }
            }
        }
    }

    public final class MoreRecommendationsCell extends FrameLayout {
        public final ProfileSearchCell channelCell;

        public MoreRecommendationsCell(int i, Context context, boolean z, Theme.ResourcesProvider resourcesProvider, SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1) {
            super(context);
            ProfileSearchCell profileSearchCell = new ProfileSearchCell(context, resourcesProvider);
            this.channelCell = profileSearchCell;
            profileSearchCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 2, -1));
            addView(profileSearchCell, LayoutHelper.createFrame(-2.0f, -1));
            View view = new View(context);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            int i2 = Theme.key_windowBackgroundWhite;
            view.setBackground(new GradientDrawable(orientation, new int[]{Theme.multAlpha(0.4f, Theme.getColor(i2, resourcesProvider)), Theme.getColor(i2, resourcesProvider)}));
            addView(view, LayoutHelper.createFrame(60.0f, -1));
            ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.getString(z ? R.string.MoreSimilarBotsButton : R.string.MoreSimilarButton));
            spannableStringBuilder.append((CharSequence) " ");
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(new ColoredImageSpan(R.drawable.msg_mini_lock2), 0, 1, 33);
            spannableStringBuilder.append((CharSequence) spannableString);
            buttonWithCounterView.setText(spannableStringBuilder, false, true);
            addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f, 48, 14.0f, 38.0f, 14.0f, 0.0f));
            buttonWithCounterView.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(seekBarView$$ExternalSyntheticLambda1, 1));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, resourcesProvider);
            linksTextView.setTextSize(1, 13.0f);
            linksTextView.setTextAlignment(4);
            linksTextView.setGravity(17);
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            linksTextView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText, resourcesProvider));
            linksTextView.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
            SpannableStringBuilder spannableStringBuilderPremiumText = AndroidUtilities.premiumText(LocaleController.getString(z ? R.string.MoreSimilarBotsText : R.string.MoreSimilarText), new SeekBarView$$ExternalSyntheticLambda1(seekBarView$$ExternalSyntheticLambda1, 19));
            SpannableString spannableString2 = new SpannableString("" + MessagesController.getInstance(i).recommendedChannelsLimitPremium);
            spannableString2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
            linksTextView.setText(AndroidUtilities.replaceCharSequence("%s", spannableStringBuilderPremiumText, spannableString2));
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 96.0f, 24.0f, 12.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(145.0f), 1073741824));
        }
    }

    public final class Period {
        public final int date;
        public final String formatedDate;
        public final int maxId;
        public int startOffset;

        public Period(TLRPC.TL_searchResultPosition tL_searchResultPosition) {
            int i = tL_searchResultPosition.date;
            this.date = i;
            this.maxId = tL_searchResultPosition.msg_id;
            this.startOffset = tL_searchResultPosition.offset;
            this.formatedDate = LocaleController.formatYearMont(i, true);
        }
    }

    public final class PollAdapter extends RecyclerListView.SelectionAdapter {
        public final int currentAccount;
        public AnonymousClass19 listView;
        public final Context mContext;
        public final AnonymousClass1 messageDelegate;
        public final Theme.ResourcesProvider resourcesProvider;
        public final ArrayList pollsToCheck = new ArrayList(10);
        public final ArrayList groupedByDay = new ArrayList();

        public final class AnonymousClass2 extends ChatMessageCell {
            @Override
            public final boolean isPressed() {
                return false;
            }
        }

        public PollAdapter(Context context, final int i, final Theme.ResourcesProvider resourcesProvider) {
            this.mContext = context;
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            this.messageDelegate = new ChatMessageCell.ChatMessageCellDelegate() {

                public final class C00091 extends LocationActivity {
                    @Override
                    public final boolean disablePermissionCheck() {
                        return true;
                    }
                }

                public final class AnonymousClass3 extends MessageObject {
                    @Override
                    public final boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                        return false;
                    }
                }

                public final class AnonymousClass4 extends MessageObject {
                    @Override
                    public final boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                        return false;
                    }
                }

                public final class AnonymousClass5 extends MessageObject {
                    @Override
                    public final boolean canDeleteMessage(boolean z, TLRPC.Chat chat) {
                        return false;
                    }
                }

                public static TLRPC.TL_message copy(TLRPC.Message message) {
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
                public final boolean allowAddPollOptions() {
                    return false;
                }

                @Override
                public final boolean canDrawOutboundsContent() {
                    return true;
                }

                @Override
                public final boolean canPerformActions() {
                    return true;
                }

                @Override
                public final boolean canPerformReply() {
                    return true;
                }

                @Override
                public final boolean canSaveRichDocument(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public final boolean canToggleRichMessageCheckbox(ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public final void didLongPress(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didLongPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public final boolean didLongPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat) {
                    return false;
                }

                @Override
                public final boolean didLongPressPollOption(ChatMessageCell chatMessageCell, TLRPC.PollAnswer pollAnswer) {
                    return false;
                }

                @Override
                public final boolean didLongPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem) {
                    return false;
                }

                @Override
                public final boolean didLongPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user) {
                    return false;
                }

                @Override
                public final void didPressAboutRevenueSharingAds() {
                }

                @Override
                public final void didPressAddPollOptionButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressAdmin(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final boolean didPressAnimatedEmoji(AnimatedEmojiSpan animatedEmojiSpan) {
                    return false;
                }

                @Override
                public final void didPressAppUpdateButton() {
                }

                @Override
                public final void didPressBoostCounter(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressBotButton(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
                }

                @Override
                public final void didPressCancelSendButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressChannelAvatar(ChatMessageCell chatMessageCell, TLRPC.Chat chat, int i2, float f, float f2, boolean z) {
                }

                @Override
                public final void didPressChannelRecommendation(ChatMessageCell chatMessageCell, TLObject tLObject, boolean z) {
                }

                @Override
                public final void didPressChannelRecommendationsClose(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressCodeCopy(MessageObject.TextLayoutBlock textLayoutBlock) {
                }

                @Override
                public final void didPressCommentButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressCustomBotButton(ChatMessageCell chatMessageCell, BotInlineKeyboard.ButtonCustom buttonCustom) {
                }

                @Override
                public final void didPressEffect(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressExtendedMediaPreview(ChatMessageCell chatMessageCell, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
                }

                @Override
                public final void didPressFactCheck(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressFactCheckWhat(ChatMessageCell chatMessageCell, int i2, int i3) {
                }

                @Override
                public final void didPressGiveawayChatButton(int i2, ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressGroupImage(ChatMessageCell chatMessageCell, TLRPC.MessageExtendedMedia messageExtendedMedia) {
                }

                @Override
                public final void didPressHiddenForward(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressHint(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressImage(ChatMessageCell chatMessageCell, float f, float f2, boolean z) {
                }

                @Override
                public final void didPressInstantButton(int i2, ChatMessageCell chatMessageCell) {
                    if (i2 == 80) {
                        BaseFragment baseFragment = SharedMediaLayout.this.profileActivity;
                        MessageObject messageObject = chatMessageCell.getMessageObject();
                        ChatActivity.AnonymousClass5 anonymousClass5 = PollVotesAlert.USER_CELL_PROPERTY;
                        if (baseFragment == null || baseFragment.getParentActivity() == null) {
                            return;
                        }
                        baseFragment.showDialog(new PollVotesAlert(baseFragment.getContext(), baseFragment.getCurrentAccount(), messageObject, baseFragment.getResourceProvider()));
                    }
                }

                @Override
                public final void didPressMoreChannelRecommendations() {
                }

                @Override
                public final void didPressOther(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didPressPollMedia(final ChatMessageCell chatMessageCell, final TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i2) throws Throwable {
                    int size;
                    int i3;
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
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    Theme.ResourcesProvider resourcesProvider2 = resourcesProvider;
                    int i4 = i;
                    PollAdapter pollAdapter = PollAdapter.this;
                    if (geoPoint != null) {
                        if (AndroidUtilities.isMapsInstalled(SharedMediaLayout.this.profileActivity)) {
                            C00091 c00091 = new C00091(3);
                            c00091.setResourceProvider(resourcesProvider2);
                            TLRPC.TL_message tL_message = new TLRPC.TL_message();
                            tL_message.local_id = -1;
                            MessagesController messagesController = MessagesController.getInstance(i4);
                            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                            tL_message.peer_id = messagesController.getPeer(sharedMediaLayout.dialog_id);
                            TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                            tL_messageMediaGeo.geo = messageMedia.geo;
                            String str = messageMedia.address;
                            if (str == null) {
                                str = (pollAnswer == null || (tL_textWithEntities = pollAnswer.text) == null) ? "" : tL_textWithEntities.text;
                            }
                            tL_messageMediaGeo.address = str;
                            tL_message.media = tL_messageMediaGeo;
                            c00091.isSharingAllowed = false;
                            MessageObject messageObject2 = new MessageObject(UserConfig.selectedAccount, tL_message, false, false);
                            c00091.messageObject = messageObject2;
                            c00091.dialogId = messageObject2.getDialogId();
                            sharedMediaLayout.profileActivity.presentFragment(c00091);
                            return;
                        }
                        return;
                    }
                    if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                        ContentPreviewViewer.getInstance().setParentActivity(SharedMediaLayout.this.profileActivity.getParentActivity());
                        ContentPreviewViewer contentPreviewViewer = ContentPreviewViewer.getInstance();
                        contentPreviewViewer.delegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
                            @Override
                            public final void addCaptionToGif(TLObject tLObject, Object obj) {
                            }

                            @Override
                            public final void addToFavoriteSelected(String str2) {
                            }

                            @Override
                            public final boolean can() {
                                return true;
                            }

                            @Override
                            public final boolean canAddCaption() {
                                return false;
                            }

                            @Override
                            public final boolean canDeleteSticker() {
                                return false;
                            }

                            @Override
                            public final boolean canEditSticker() {
                                return false;
                            }

                            @Override
                            public final boolean canSchedule() {
                                return false;
                            }

                            @Override
                            public final boolean canSendSticker() {
                                return true;
                            }

                            @Override
                            public final Boolean canSetAsStatus(TLRPC.Document document4) {
                                return null;
                            }

                            @Override
                            public final void copyEmoji(TLRPC.Document document4) {
                            }

                            @Override
                            public final void deleteSticker(TLRPC.Document document4) {
                            }

                            @Override
                            public final void editSticker(TLRPC.Document document4) {
                            }

                            @Override
                            public final ItemOptions getCustomItemOptions(IntroActivity.AnonymousClass1 anonymousClass1) {
                                return null;
                            }

                            @Override
                            public final long getDialogId() {
                                return SharedMediaLayout.this.dialog_id;
                            }

                            @Override
                            public final TLRPC.TL_messageMediaPoll getPoll() {
                                return tL_messageMediaPoll;
                            }

                            @Override
                            public final TLRPC.PollAnswer getPollAnswer() {
                                return pollAnswer;
                            }

                            @Override
                            public final MessageObject getPollMessageObject() {
                                return chatMessageCell.getMessageObject();
                            }

                            @Override
                            public final String getQuery(boolean z) {
                                return null;
                            }

                            @Override
                            public final void gifAddedOrDeleted() {
                            }

                            @Override
                            public final boolean isInScheduleMode() {
                                return false;
                            }

                            @Override
                            public final boolean isPhotoEditor() {
                                return false;
                            }

                            @Override
                            public final boolean isReplacedSticker() {
                                return false;
                            }

                            @Override
                            public final boolean isSettingIntroSticker() {
                                return false;
                            }

                            @Override
                            public final boolean isStickerEditor() {
                                return false;
                            }

                            @Override
                            public final boolean needCopy(TLRPC.Document document4) {
                                return false;
                            }

                            @Override
                            public final boolean needOpen() {
                                return true;
                            }

                            @Override
                            public final boolean needRemove() {
                                return false;
                            }

                            @Override
                            public final boolean needRemoveFromRecent(TLRPC.Document document4) {
                                return false;
                            }

                            @Override
                            public final boolean needSend(int i5) {
                                return false;
                            }

                            @Override
                            public final void newStickerPackSelected(CharSequence charSequence, String str2, OAuthSheet$$ExternalSyntheticLambda13 oAuthSheet$$ExternalSyntheticLambda13) {
                            }

                            @Override
                            public final void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z) {
                                if (inputStickerSet != null) {
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    if (SharedMediaLayout.this.getContext() == null) {
                                        return;
                                    }
                                    TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                                    tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                                    tL_inputStickerSetID.id = inputStickerSet.id;
                                    StickersAlert stickersAlert = new StickersAlert(SharedMediaLayout.this.getContext(), SharedMediaLayout.this.profileActivity, tL_inputStickerSetID, null, null, resourcesProvider);
                                    stickersAlert.setCalcMandatoryInsets(true);
                                    stickersAlert.clearsInputField = z;
                                    stickersAlert.show();
                                }
                            }

                            @Override
                            public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                            }

                            @Override
                            public final void removeFromRecent(TLRPC.Document document4) {
                            }

                            @Override
                            public final void resetTouch() {
                            }

                            @Override
                            public final void retractVote() {
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), null, null);
                            }

                            @Override
                            public final void sendEmoji(TLRPC.Document document4) {
                            }

                            @Override
                            public final void sendGif(int i5, int i6, Object obj, TLObject tLObject, boolean z) {
                            }

                            @Override
                            public final void sendSticker(String str2) {
                            }

                            @Override
                            public final void sendVote() {
                                ArrayList<TLRPC.PollAnswer> arrayList = new ArrayList<>(1);
                                arrayList.add(pollAnswer);
                                SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                            }

                            @Override
                            public final void setAsEmojiStatus(TLRPC.Document document4) {
                            }

                            @Override
                            public final void setIntroSticker(String str2) {
                            }

                            @Override
                            public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str2) {
                            }

                            @Override
                            public final void sendSticker(TLRPC.Document document4, String str2, Object obj, boolean z, int i5, int i6) {
                            }
                        };
                        contentPreviewViewer.isPhotoEditor = false;
                        contentPreviewViewer.isStickerEditor = false;
                        ContentPreviewViewer contentPreviewViewer2 = ContentPreviewViewer.getInstance();
                        TLRPC.Document document4 = messageMedia.document;
                        contentPreviewViewer2.open(document4, null, "", null, null, MessageObject.isAnimatedEmoji(document4) ? 2 : 0, false, chatMessageCell.getMessageObject(), resourcesProvider, 200);
                        return;
                    }
                    TLRPC.Message message = messageObject.messageOwner;
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    TLRPC.MessageMedia messageMedia3 = tL_messageMediaPoll.attached_media;
                    if (messageMedia3 != null && messageMedia3.geo == null && ((document3 = messageMedia3.document) == null || MessageObject.isVideoDocument(document3))) {
                        size = messageMedia3 == messageMedia ? arrayList2.size() : -1;
                        TLRPC.TL_message tL_messageCopy = copy(message);
                        tL_messageCopy.media = messageMedia3;
                        arrayList2.add(new AnonymousClass3(i4, tL_messageCopy, false, true));
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
                        arrayList2.add(new AnonymousClass4(i4, tL_messageCopy2, false, true));
                        arrayList.add(-3);
                    }
                    int i5 = i4;
                    TlUtils.calculateAnswerShuffleHash(tL_messageMediaPoll.poll, UserConfig.getInstance(i4).getClientUserId());
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    ArrayList<TLRPC.PollAnswer> arrayList3 = poll.shuffled_answers;
                    if (arrayList3 == null) {
                        arrayList3 = poll.answers;
                    }
                    int i6 = 0;
                    while (i6 < arrayList3.size()) {
                        TLRPC.PollAnswer pollAnswer2 = arrayList3.get(i6);
                        TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                        if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                            if (pollAnswer2.unshuffled_index == i2) {
                                size = arrayList2.size();
                            }
                            TLRPC.TL_message tL_messageCopy3 = copy(message);
                            tL_messageCopy3.media = messageMedia4;
                            TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                            tL_messageCopy3.message = tL_textWithEntities2.text;
                            tL_messageCopy3.entities = tL_textWithEntities2.entities;
                            i3 = i5;
                            arrayList2.add(new AnonymousClass5(i3, tL_messageCopy3, false, true));
                            arrayList.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                        } else {
                            i3 = i5;
                        }
                        i6++;
                        message = message;
                        i5 = i3;
                    }
                    if (size <= -1 || arrayList2.isEmpty()) {
                        return;
                    }
                    messageObject.pollMediaMapping = arrayList;
                    PhotoViewer.getInstance().setParentActivity(null, SharedMediaLayout.this.profileActivity, resourcesProvider2);
                    PhotoViewer.getInstance().openPhoto(arrayList2, size, SharedMediaLayout.this.dialog_id, 0L, 0L, new PhotoViewer.EmptyPhotoViewerProvider() {
                        @Override
                        public final boolean forceAllInGroup() {
                            return true;
                        }

                        @Override
                        public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject3, TLRPC.FileLocation fileLocation, int i7, boolean z, boolean z2) {
                            ImageReceiver photoImage;
                            ChatMessageCell chatMessageCell2;
                            MessageObject messageObject4;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            AnonymousClass19 anonymousClass19 = PollAdapter.this.listView;
                            if (anonymousClass19 != null) {
                                int childCount = anonymousClass19.getChildCount();
                                for (int i8 = 0; i8 < childCount; i8++) {
                                    PollAdapter pollAdapter2 = PollAdapter.this;
                                    View childAt = pollAdapter2.listView.getChildAt(i8);
                                    if (!(childAt instanceof ChatMessageCell) || messageObject3 == null || (messageObject4 = (chatMessageCell2 = (ChatMessageCell) childAt).getMessageObject()) == null || messageObject4.getId() != messageObject3.getId()) {
                                        photoImage = null;
                                    } else {
                                        ArrayList<Integer> arrayList4 = messageObject4.pollMediaMapping;
                                        photoImage = (arrayList4 == null || i7 < 0 || i7 >= arrayList4.size()) ? chatMessageCell2.getPhotoImage(i7) : chatMessageCell2.getPhotoImage(messageObject4.pollMediaMapping.get(i7).intValue());
                                    }
                                    if (photoImage != null) {
                                        int[] iArr = new int[2];
                                        childAt.getLocationInWindow(iArr);
                                        PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                        placeProviderObject.viewX = iArr[0];
                                        placeProviderObject.viewY = childAt.getPaddingTop() + iArr[1];
                                        placeProviderObject.parentView = pollAdapter2.listView;
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
                            }
                            return null;
                        }
                    });
                }

                @Override
                public final void didPressReaction(ChatMessageCell chatMessageCell, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
                }

                @Override
                public final void didPressReplyMessage(ChatMessageCell chatMessageCell, int i2, float f, float f2, boolean z) {
                }

                @Override
                public final void didPressRevealSensitiveContent(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressRichDocumentOptions(ChatMessageCell chatMessageCell, TLRPC.Document document) {
                }

                @Override
                public final void didPressShowMore(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressSideButton(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressSponsoredClose(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressSponsoredInfo(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didPressSummarize(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didPressTime() {
                }

                @Override
                public final boolean didPressToDoButton(ChatMessageCell chatMessageCell, TLRPC.TodoItem todoItem, boolean z) {
                    return false;
                }

                @Override
                public final void didPressUrl(ChatMessageCell chatMessageCell, CharacterStyle characterStyle, boolean z) {
                }

                @Override
                public final void didPressUserAvatar(ChatMessageCell chatMessageCell, TLRPC.User user, float f, float f2) {
                }

                @Override
                public final void didPressUserStatus(ChatMessageCell chatMessageCell, TLRPC.User user, TLRPC.Document document, String str) {
                }

                @Override
                public final void didPressViaBot(String str) {
                }

                @Override
                public final void didPressViaBotNotInline(ChatMessageCell chatMessageCell, long j) {
                }

                @Override
                public final void didPressVoteButtons(ChatMessageCell chatMessageCell, ArrayList arrayList, int i2, int i3, int i4) {
                    SendMessagesHelper.getInstance(i).sendVote(chatMessageCell.getMessageObject(), arrayList, null);
                }

                @Override
                public final void didPressWebPage(ChatMessageCell chatMessageCell, TLRPC.WebPage webPage, String str, boolean z) {
                    ArticleViewer.IBlock.CC.$default$didPressWebPage(chatMessageCell, str);
                }

                @Override
                public final void didQuickShareEnd(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didQuickShareMove(ChatMessageCell chatMessageCell, float f, float f2) {
                }

                @Override
                public final void didQuickShareStart(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didStartVideoStream(MessageObject messageObject) {
                }

                @Override
                public final void didTogglePollPreview(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void didToggleRichMessageCheckbox(ChatMessageCell chatMessageCell, FileLoader$$ExternalSyntheticLambda1 fileLoader$$ExternalSyntheticLambda1) {
                }

                @Override
                public final boolean doNotShowLoadingReply(MessageObject messageObject) {
                    return ArticleViewer.IBlock.CC.$default$doNotShowLoadingReply(messageObject);
                }

                @Override
                public final void drawPollMode(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void forceUpdate(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final void forceUpdateNoAnimation(ChatMessageCell chatMessageCell) {
                }

                @Override
                public final int getAddPollOptionInputFieldHeight(ChatMessageCell chatMessageCell) {
                    return 0;
                }

                @Override
                public final String getAdminRank(long j) {
                    return null;
                }

                @Override
                public final int getChatMode() {
                    return 0;
                }

                @Override
                public final ChatActivityDraftMessageMeasureController getDraftMessageMeasureController() {
                    return null;
                }

                @Override
                public final PinchToZoomHelper getPinchToZoomHelper() {
                    return null;
                }

                @Override
                public final String getProgressLoadingBotButtonUrl(ChatMessageCell chatMessageCell) {
                    return null;
                }

                @Override
                public final CharacterStyle getProgressLoadingLink(ChatMessageCell chatMessageCell) {
                    return null;
                }

                @Override
                public final TextSelectionHelper.ChatListTextSelectionHelper getTextSelectionHelper() {
                    return null;
                }

                @Override
                public final boolean hasSelectedMessages() {
                    return false;
                }

                @Override
                public final void invalidateBlur() {
                }

                @Override
                public final boolean isAdmin(long j) {
                    return false;
                }

                @Override
                public final boolean isLandscape() {
                    return false;
                }

                @Override
                public final boolean isOwner(long j) {
                    return false;
                }

                @Override
                public final boolean isProgressLoading(int i2, ChatMessageCell chatMessageCell) {
                    return false;
                }

                @Override
                public final boolean isReplyOrSelf() {
                    return false;
                }

                @Override
                public final boolean keyboardIsOpened() {
                    return false;
                }

                @Override
                public final void needOpenWebView(MessageObject messageObject, String str, String str2, String str3, String str4, int i2, int i3) {
                }

                @Override
                public final boolean needPlayMessage(ChatMessageCell chatMessageCell, MessageObject messageObject) {
                    return false;
                }

                @Override
                public final void needReloadPolls() {
                }

                @Override
                public final void needShowPremiumBulletin(int i2) {
                }

                @Override
                public final boolean onAccessibilityAction(int i2) {
                    return false;
                }

                @Override
                public final void onDiceFinished() {
                }

                @Override
                public final void openArticlePhoto(ChatMessageCell chatMessageCell, TL_iv.PageBlock pageBlock) {
                }

                @Override
                public final void setShouldNotRepeatSticker(MessageObject messageObject) {
                }

                @Override
                public final boolean shouldDrawThreadProgress(ChatMessageCell chatMessageCell, boolean z) {
                    return false;
                }

                @Override
                public final boolean shouldRepeatSticker(MessageObject messageObject) {
                    return true;
                }

                @Override
                public final void videoTimerReached() {
                }

                @Override
                public final void forceUpdate(ChatMessageCell chatMessageCell, boolean z) {
                }
            };
            regroup();
        }

        @Override
        public final int getItemCount() {
            return this.groupedByDay.size();
        }

        @Override
        public final int getItemViewType(int i) {
            if (i < 0) {
                return 0;
            }
            ArrayList arrayList = this.groupedByDay;
            if (i >= arrayList.size()) {
                return 0;
            }
            return ((MessageObject) arrayList.get(i)).contentType;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void notifyDataSetChanged() {
            regroup();
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i >= 0) {
                ArrayList arrayList = this.groupedByDay;
                if (i >= arrayList.size()) {
                    return;
                }
                MessageObject messageObject = (MessageObject) arrayList.get(i);
                int i2 = viewHolder.mItemViewType;
                View view = viewHolder.itemView;
                if (i2 == 0) {
                    ((ChatMessageCell) view).setMessageObject(messageObject, null, false, false, false, false);
                } else {
                    ((ChatActionCell) view).setMessageObject(messageObject);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i != 0) {
                return new RecyclerListView.Holder(new ChatActionCell(this.mContext, this.resourcesProvider, false));
            }
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.mContext, this.currentAccount, false, null, this.resourcesProvider);
            anonymousClass2.setDelegate(this.messageDelegate);
            return new RecyclerListView.Holder(anonymousClass2);
        }

        public final void regroup() {
            ArrayList arrayList = this.groupedByDay;
            arrayList.clear();
            ArrayList messages = SharedMediaLayout.this.sharedMediaData[8].getMessages();
            int i = 0;
            for (int i2 = 0; i2 < messages.size(); i2++) {
                MessageObject messageObject = (MessageObject) messages.get(i2);
                if (messageObject.dateKeyInt != i) {
                    int i3 = messageObject.messageOwner.date;
                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                    long j = i3;
                    tL_message.message = LocaleController.formatDateChat(j);
                    tL_message.id = 0;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(j * 1000);
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    calendar.set(14, 0);
                    tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
                    MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
                    messageObject2.type = 10;
                    messageObject2.contentType = 1;
                    messageObject2.isDateObject = true;
                    arrayList.add(messageObject2);
                    i = messageObject.dateKeyInt;
                }
                arrayList.add(messageObject);
            }
        }
    }

    public final class SavedDialogsAdapter extends RecyclerListView.SelectionAdapter {
        public AnonymousClass19 attachedToRecyclerView;
        public final SavedMessagesController controller;
        public final ArrayList dialogs;
        public final ItemTouchHelper itemTouchHelper;
        public final Context mContext;
        public final SeekBarView$$ExternalSyntheticLambda1 notifyOrderUpdate;
        public final ArrayList oldDialogs;
        public boolean orderChanged;
        public final HashSet selectedDialogs;
        public final RecyclerView.RecycledViewPool viewPool;

        public SavedDialogsAdapter(Context context) {
            ArrayList arrayList = new ArrayList();
            this.oldDialogs = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.dialogs = arrayList2;
            this.notifyOrderUpdate = new SeekBarView$$ExternalSyntheticLambda1(this, 20);
            this.viewPool = new RecyclerView.RecycledViewPool();
            this.itemTouchHelper = new ItemTouchHelper(new ItemTouchHelper.Callback() {
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

                public final SavedMessagesController.SavedDialog getDialog(RecyclerView.ViewHolder viewHolder) {
                    int adapterPosition;
                    if (viewHolder != null && (adapterPosition = viewHolder.getAdapterPosition()) >= 0) {
                        SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                        if (adapterPosition < savedDialogsAdapter.dialogs.size()) {
                            return (SavedMessagesController.SavedDialog) savedDialogsAdapter.dialogs.get(adapterPosition);
                        }
                    }
                    return null;
                }

                @Override
                public final int getMovementFlags(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder) {
                    SavedMessagesController.SavedDialog dialog;
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    return (!SharedMediaLayout.this.isActionModeShowed || recyclerListView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter || (dialog = getDialog(viewHolder)) == null || !dialog.pinned) ? ItemTouchHelper.Callback.makeMovementFlags(0, 0) : ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                }

                @Override
                public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    if (!SharedMediaLayout.this.isActionModeShowed || recyclerListView.getAdapter() == SharedMediaLayout.this.savedMessagesSearchAdapter) {
                        return false;
                    }
                    SavedMessagesController.SavedDialog dialog = getDialog(viewHolder);
                    SavedMessagesController.SavedDialog dialog2 = getDialog(viewHolder2);
                    if (dialog == null || dialog2 == null || !dialog.pinned || !dialog2.pinned) {
                        return false;
                    }
                    int adapterPosition = viewHolder.getAdapterPosition();
                    int adapterPosition2 = viewHolder2.getAdapterPosition();
                    ArrayList arrayList3 = savedDialogsAdapter.dialogs;
                    arrayList3.remove(adapterPosition);
                    arrayList3.add(adapterPosition2, dialog);
                    savedDialogsAdapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                    savedDialogsAdapter.orderChanged = true;
                    return true;
                }

                @Override
                public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
                    AnonymousClass19 anonymousClass19;
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    if (viewHolder != null && (anonymousClass19 = savedDialogsAdapter.attachedToRecyclerView) != null) {
                        anonymousClass19.hideSelector(false);
                    }
                    if (i == 0) {
                        AndroidUtilities.cancelRunOnUIThread(savedDialogsAdapter.notifyOrderUpdate);
                        AndroidUtilities.runOnUIThread(savedDialogsAdapter.notifyOrderUpdate, 300L);
                    }
                }

                @Override
                public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
                }
            });
            this.selectedDialogs = new HashSet();
            this.mContext = context;
            SavedMessagesController savedMessagesController = SharedMediaLayout.this.profileActivity.getMessagesController().getSavedMessagesController();
            this.controller = savedMessagesController;
            if (SharedMediaLayout.this.includeSavedDialogs()) {
                savedMessagesController.loadDialogs(false);
            }
            setHasStableIds(true);
            arrayList.clear();
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            arrayList2.addAll(savedMessagesController.allDialogs);
        }

        @Override
        public final int getItemCount() {
            return this.dialogs.size();
        }

        @Override
        public final long getItemId(int i) {
            if (i >= 0) {
                ArrayList arrayList = this.dialogs;
                if (i < arrayList.size()) {
                    return ((SavedMessagesController.SavedDialog) arrayList.get(i)).dialogId;
                }
            }
            return i;
        }

        @Override
        public final int getItemViewType(int i) {
            return 13;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                ArrayList arrayList = this.dialogs;
                SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i);
                dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                dialogCell.isSavedDialogCell = true;
                dialogCell.setChecked(this.selectedDialogs.contains(Long.valueOf(savedDialog.dialogId)), false);
                dialogCell.useSeparator = i + 1 < arrayList.size();
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            DialogCell dialogCell = new DialogCell(this.mContext) {
                {
                    int i2 = UserConfig.selectedAccount;
                }

                @Override
                public final boolean getIsPinned() {
                    SavedDialogsAdapter savedDialogsAdapter = SavedDialogsAdapter.this;
                    AnonymousClass19 anonymousClass19 = savedDialogsAdapter.attachedToRecyclerView;
                    if (anonymousClass19 == null || anonymousClass19.getAdapter() != savedDialogsAdapter) {
                        return false;
                    }
                    savedDialogsAdapter.attachedToRecyclerView.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(this);
                    if (childAdapterPosition < 0) {
                        return false;
                    }
                    ArrayList arrayList = savedDialogsAdapter.dialogs;
                    if (childAdapterPosition < arrayList.size()) {
                        return ((SavedMessagesController.SavedDialog) arrayList.get(childAdapterPosition)).pinned;
                    }
                    return false;
                }

                @Override
                public final boolean isForumCell() {
                    return false;
                }
            };
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            dialogCell.setDialogCellDelegate(sharedMediaLayout);
            dialogCell.isSavedDialog = true;
            dialogCell.setBackgroundColor(sharedMediaLayout.getThemedColor$13(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(dialogCell);
        }

        public final void select(View view) {
            ArrayList arrayList;
            SavedMessagesController.SavedDialog savedDialog;
            boolean z;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                long dialogId = dialogCell.getDialogId();
                int i = 0;
                while (true) {
                    arrayList = this.dialogs;
                    if (i >= arrayList.size()) {
                        savedDialog = null;
                        break;
                    } else {
                        if (((SavedMessagesController.SavedDialog) arrayList.get(i)).dialogId == dialogId) {
                            savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i);
                            break;
                        }
                        i++;
                    }
                }
                if (savedDialog == null) {
                    return;
                }
                HashSet hashSet = this.selectedDialogs;
                boolean zContains = hashSet.contains(Long.valueOf(savedDialog.dialogId));
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (zContains) {
                    hashSet.remove(Long.valueOf(savedDialog.dialogId));
                    if (hashSet.size() <= 0 && sharedMediaLayout.isActionModeShowed) {
                        sharedMediaLayout.showActionMode$1(false);
                    }
                } else {
                    hashSet.add(Long.valueOf(savedDialog.dialogId));
                    if (hashSet.size() > 0 && !sharedMediaLayout.isActionModeShowed) {
                        sharedMediaLayout.showActionMode$1(true);
                        ActionBarMenuItem actionBarMenuItem = sharedMediaLayout.gotoItem;
                        if (actionBarMenuItem != null) {
                            actionBarMenuItem.setVisibility(8);
                        }
                        ActionBarMenuItem actionBarMenuItem2 = sharedMediaLayout.forwardItem;
                        if (actionBarMenuItem2 != null) {
                            actionBarMenuItem2.setVisibility(8);
                        }
                    }
                }
                sharedMediaLayout.selectedMessagesCountTextView.setNumber(hashSet.size(), true);
                boolean z2 = hashSet.size() > 0;
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    int i2 = 0;
                    while (true) {
                        if (i2 < arrayList.size()) {
                            SavedMessagesController.SavedDialog savedDialog2 = (SavedMessagesController.SavedDialog) arrayList.get(i2);
                            z = z2;
                            if (savedDialog2.dialogId != jLongValue) {
                                i2++;
                                z2 = z;
                            } else if (!savedDialog2.pinned) {
                                z2 = false;
                                break;
                            }
                        } else {
                            z = z2;
                        }
                        z2 = z;
                        break;
                    }
                    if (!z2) {
                        break;
                    }
                }
                ActionBarMenuItem actionBarMenuItem3 = sharedMediaLayout.pinItem;
                if (actionBarMenuItem3 != null) {
                    actionBarMenuItem3.setVisibility(z2 ? 8 : 0);
                }
                ActionBarMenuItem actionBarMenuItem4 = sharedMediaLayout.unpinItem;
                if (actionBarMenuItem4 != null) {
                    actionBarMenuItem4.setVisibility(z2 ? 0 : 8);
                }
                if (view != null) {
                    dialogCell.setChecked(hashSet.contains(Long.valueOf(savedDialog.dialogId)), true);
                }
            }
        }
    }

    public final class SavedMessagesSearchAdapter extends RecyclerListView.SelectionAdapter {
        public final int currentAccount;
        public String lastQuery;
        public ReactionsLayoutInBubble.VisibleReaction lastReaction;
        public int lastSearchId;
        public boolean loading;
        public final Context mContext;
        public final ArrayList dialogs = new ArrayList();
        public final ArrayList messages = new ArrayList();
        public final ArrayList loadedMessages = new ArrayList();
        public final ArrayList cachedMessages = new ArrayList();
        public boolean endReached = false;
        public int count = 0;
        public int reqId = -1;
        public final SeekBarView$$ExternalSyntheticLambda1 searchRunnable = new SeekBarView$$ExternalSyntheticLambda1(this, 21);

        public SavedMessagesSearchAdapter(Context context) {
            this.mContext = context;
            this.currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            setHasStableIds(true);
        }

        @Override
        public final int getItemCount() {
            return this.messages.size() + this.dialogs.size();
        }

        @Override
        public final long getItemId(int i) {
            int iHash;
            if (i < 0) {
                return i;
            }
            ArrayList arrayList = this.dialogs;
            if (i < arrayList.size()) {
                iHash = Objects.hash(1, Long.valueOf(((SavedMessagesController.SavedDialog) arrayList.get(i)).dialogId));
            } else {
                int size = i - arrayList.size();
                ArrayList arrayList2 = this.messages;
                if (size >= arrayList2.size()) {
                    return size;
                }
                iHash = Objects.hash(2, Long.valueOf(((MessageObject) arrayList2.get(size)).getSavedDialogId()), Integer.valueOf(((MessageObject) arrayList2.get(size)).getId()));
            }
            return iHash;
        }

        @Override
        public final int getItemViewType(int i) {
            return 23;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0) {
                return;
            }
            View view = viewHolder.itemView;
            if (view instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) view;
                dialogCell.useSeparator = i + 1 < getItemCount();
                ArrayList arrayList = this.dialogs;
                if (i < arrayList.size()) {
                    SavedMessagesController.SavedDialog savedDialog = (SavedMessagesController.SavedDialog) arrayList.get(i);
                    dialogCell.setDialog(savedDialog.dialogId, savedDialog.message, savedDialog.getDate(), false, false);
                    return;
                }
                int size = i - arrayList.size();
                ArrayList arrayList2 = this.messages;
                if (size < arrayList2.size()) {
                    MessageObject messageObject = (MessageObject) arrayList2.get(size);
                    dialogCell.setDialog(messageObject.getSavedDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            int i2 = UserConfig.selectedAccount;
            DialogsSearchAdapter.AnonymousClass3 anonymousClass3 = new DialogsSearchAdapter.AnonymousClass3(null, this.mContext, true, i2, null, 1);
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            anonymousClass3.setDialogCellDelegate(sharedMediaLayout);
            anonymousClass3.isSavedDialog = true;
            anonymousClass3.setBackgroundColor(sharedMediaLayout.getThemedColor$13(Theme.key_windowBackgroundWhite));
            return new RecyclerListView.Holder(anonymousClass3);
        }

        public final void search(ReactionsLayoutInBubble.VisibleReaction visibleReaction, String str) {
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
            int i = this.reqId;
            int i2 = this.currentAccount;
            if (i >= 0) {
                ConnectionsManager.getInstance(i2).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            this.cachedMessages.clear();
            this.loadedMessages.clear();
            this.messages.clear();
            int i3 = 0;
            this.count = 0;
            this.endReached = false;
            this.loading = true;
            ArrayList arrayList = this.dialogs;
            arrayList.clear();
            if (this.lastReaction == null) {
                arrayList.addAll(MessagesController.getInstance(i2).getSavedMessagesController().searchDialogs(str));
            }
            while (true) {
                MediaPage[] mediaPageArr = SharedMediaLayout.this.mediaPages;
                if (i3 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage = mediaPageArr[i3];
                if (mediaPage.selectedType == 11) {
                    mediaPage.emptyView.showProgress(true, true);
                }
                i3++;
            }
            if (this.lastReaction == null) {
                this.mObservable.notifyChanged();
            }
            SeekBarView$$ExternalSyntheticLambda1 seekBarView$$ExternalSyntheticLambda1 = this.searchRunnable;
            AndroidUtilities.cancelRunOnUIThread(seekBarView$$ExternalSyntheticLambda1);
            AndroidUtilities.runOnUIThread(seekBarView$$ExternalSyntheticLambda1, this.lastReaction != null ? 60L : 600L);
        }

        public final void sendRequest() {
            if (TextUtils.isEmpty(this.lastQuery) && this.lastReaction == null) {
                this.loading = false;
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            int i = this.currentAccount;
            tL_messages_search.peer = MessagesController.getInstance(i).getInputPeer(UserConfig.getInstance(i).getClientUserId());
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.q = this.lastQuery;
            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
            if (visibleReaction != null) {
                tL_messages_search.flags |= 8;
                tL_messages_search.saved_reaction.add(visibleReaction.toTLReaction());
            }
            ArrayList arrayList = this.loadedMessages;
            if (arrayList.size() > 0) {
                tL_messages_search.offset_id = ((MessageObject) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).getId();
            }
            tL_messages_search.limit = 10;
            this.endReached = false;
            int i2 = this.lastSearchId + 1;
            this.lastSearchId = i2;
            PollItemMenu$$ExternalSyntheticLambda17 pollItemMenu$$ExternalSyntheticLambda17 = new PollItemMenu$$ExternalSyntheticLambda17(this, i2, tL_messages_search, 6);
            if (this.lastReaction != null) {
                MessagesStorage.getInstance(i).searchSavedByTag(this.lastReaction.toTLReaction(), 0L, this.lastQuery, 100, this.cachedMessages.size(), new PeerStoriesView$$ExternalSyntheticLambda51(1, this, pollItemMenu$$ExternalSyntheticLambda17), false);
            } else {
                pollItemMenu$$ExternalSyntheticLambda17.run();
            }
        }

        public final void updateMessages(boolean z) {
            ArrayList arrayList;
            CharSequence string;
            CharSequence charSequence;
            ArrayList arrayList2 = this.messages;
            arrayList2.clear();
            HashSet hashSet = new HashSet();
            int i = 0;
            while (true) {
                ArrayList arrayList3 = this.loadedMessages;
                if (i >= arrayList3.size()) {
                    break;
                }
                MessageObject messageObject = (MessageObject) arrayList3.get(i);
                if (messageObject != null && !hashSet.contains(Integer.valueOf(messageObject.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject.getId()));
                    arrayList2.add(messageObject);
                }
                i++;
            }
            int i2 = 0;
            while (true) {
                arrayList = this.cachedMessages;
                if (i2 >= arrayList.size()) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) arrayList.get(i2);
                if (messageObject2 != null && !hashSet.contains(Integer.valueOf(messageObject2.getId()))) {
                    hashSet.add(Integer.valueOf(messageObject2.getId()));
                    arrayList2.add(messageObject2);
                }
                i2++;
            }
            if (!z || !arrayList.isEmpty()) {
                int i3 = 0;
                while (true) {
                    MediaPage[] mediaPageArr = SharedMediaLayout.this.mediaPages;
                    if (i3 >= mediaPageArr.length) {
                        break;
                    }
                    if (mediaPageArr[i3].selectedType == 11 && arrayList2.isEmpty() && this.dialogs.isEmpty()) {
                        SpoilersTextView spoilersTextView = mediaPageArr[i3].emptyView.title;
                        if (this.lastReaction == null || !TextUtils.isEmpty(this.lastQuery)) {
                            string = LocaleController.formatString(R.string.NoResultFoundFor, this.lastQuery);
                        } else {
                            String string2 = LocaleController.getString(R.string.NoResultFoundForTag);
                            ReactionsLayoutInBubble.VisibleReaction visibleReaction = this.lastReaction;
                            Paint.FontMetricsInt fontMetricsInt = mediaPageArr[i3].emptyView.title.getPaint().getFontMetricsInt();
                            if (TextUtils.isEmpty(visibleReaction.emojicon)) {
                                SpannableString spannableString = new SpannableString("😀");
                                spannableString.setSpan(new AnimatedEmojiSpan(visibleReaction.documentId, 1.2f, fontMetricsInt), 0, spannableString.length(), 17);
                                charSequence = spannableString;
                            } else {
                                charSequence = visibleReaction.emojicon;
                            }
                            string = AndroidUtilities.replaceCharSequence("%s", string2, charSequence);
                        }
                        spoilersTextView.setText(string);
                        mediaPageArr[i3].emptyView.button.setVisibility(8);
                        mediaPageArr[i3].emptyView.showProgress(false, true);
                    }
                    i3++;
                }
            }
            this.mObservable.notifyChanged();
        }
    }

    public abstract class ScrollSlidingTextTabStripInner extends ScrollSlidingTextTabStrip {
        public int backgroundColor;
        public Paint backgroundPaint;
        public final Rect blurBounds;

        public ScrollSlidingTextTabStripInner(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.backgroundColor = 0;
            this.blurBounds = new Rect();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            if (this.backgroundColor != 0) {
                if (this.backgroundPaint == null) {
                    this.backgroundPaint = new Paint();
                }
                this.backgroundPaint.setColor(this.backgroundColor);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Rect rect = this.blurBounds;
                rect.set(0, 0, measuredWidth, measuredHeight);
                canvas.save();
                canvas.translate(getScrollX(), 0.0f);
                canvas.clipPath(this.clipPath);
                if (SharedConfig.chatBlurEnabled()) {
                    SharedMediaLayout.this.drawBackgroundWithBlur(canvas, getY(), rect, this.backgroundPaint);
                } else {
                    canvas.drawPaint(this.backgroundPaint);
                }
                canvas.translate(-getScrollX(), 0.0f);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
        }

        @Override
        public void setBackgroundColor(int i) {
            this.backgroundColor = i;
            invalidate();
        }
    }

    public final class SharedDocumentsAdapter extends RecyclerListView.FastScrollAdapter {
        public final int currentType;
        public boolean inFastScrollMode;
        public final Context mContext;

        public SharedDocumentsAdapter(Context context, int i) {
            this.mContext = context;
            this.currentType = i;
        }

        @Override
        public final int getItemCount() {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            int i = this.currentType;
            SharedMediaData sharedMediaData = sharedMediaDataArr[i];
            if (sharedMediaData.loadingAfterFastScroll) {
                return sharedMediaData.getTotalCount();
            }
            if (sharedMediaData.messages.size() == 0 && !sharedMediaDataArr[i].loading) {
                return 1;
            }
            if (sharedMediaDataArr[i].messages.size() == 0) {
                SharedMediaData sharedMediaData2 = sharedMediaDataArr[i];
                boolean[] zArr = sharedMediaData2.endReached;
                if ((!zArr[0] || !zArr[1]) && sharedMediaData2.startReached) {
                    return 0;
                }
            }
            if (sharedMediaDataArr[i].getTotalCount() != 0) {
                return Math.max(sharedMediaDataArr[i].getTotalCount(), sharedMediaDataArr[i].getMessages().size() + sharedMediaDataArr[i].getStartOffset());
            }
            int size = sharedMediaDataArr[i].getMessages().size() + sharedMediaDataArr[i].getStartOffset();
            if (size == 0) {
                return size;
            }
            SharedMediaData sharedMediaData3 = sharedMediaDataArr[i];
            boolean[] zArr2 = sharedMediaData3.endReached;
            if (zArr2[0] && zArr2[1]) {
                return size;
            }
            boolean z = sharedMediaData3.isFrozen;
            if ((z ? sharedMediaData3.frozenEndLoadingStubs : sharedMediaData3.endLoadingStubs) != 0) {
                return (z ? sharedMediaData3.frozenEndLoadingStubs : sharedMediaData3.endLoadingStubs) + size;
            }
            return size + 1;
        }

        @Override
        public final int getItemViewType(int i) {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            int i2 = this.currentType;
            if (sharedMediaDataArr[i2].sections.size() == 0 && !sharedMediaDataArr[i2].loading) {
                return 9;
            }
            SharedMediaData sharedMediaData = sharedMediaDataArr[i2];
            int i3 = sharedMediaData.startOffset;
            if (i < i3 || i >= sharedMediaData.messages.size() + i3) {
                return 8;
            }
            return (i2 == 2 || i2 == 4) ? 10 : 7;
        }

        @Override
        public final String getLetter(int i) {
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[this.currentType].fastScrollPeriods;
            if (arrayList == null || arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((Period) arrayList.get(i2)).startOffset) {
                    return ((Period) arrayList.get(i2)).formatedDate;
                }
            }
            return ((Period) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).formatedDate;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            float totalItemsCount = f * ((getTotalItemsCount() * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
            iArr[0] = (int) (totalItemsCount / measuredHeight);
            iArr[1] = ((int) totalItemsCount) % measuredHeight;
        }

        @Override
        public final int getTotalItemsCount() {
            return SharedMediaLayout.this.sharedMediaData[this.currentType].getTotalCount();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            SharedMediaData sharedMediaData = sharedMediaLayout.sharedMediaData[this.currentType];
            ArrayList arrayList = sharedMediaData.messages;
            int i2 = viewHolder.mItemViewType;
            SparseArray[] sparseArrayArr = sharedMediaLayout.selectedFiles;
            long j = sharedMediaLayout.dialog_id;
            View view = viewHolder.itemView;
            if (i2 == 7) {
                if (view instanceof SharedDocumentCell) {
                    SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) view;
                    MessageObject messageObject = (MessageObject) arrayList.get(i - sharedMediaData.startOffset);
                    sharedDocumentCell.setDocument(messageObject, i != arrayList.size() - 1);
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedDocumentCell.setChecked(sparseArrayArr[(messageObject.getDialogId() > j ? 1 : (messageObject.getDialogId() == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, !sharedMediaLayout.scrolling);
                        return;
                    } else {
                        sharedDocumentCell.setChecked(false, !sharedMediaLayout.scrolling);
                        return;
                    }
                }
                return;
            }
            if (i2 == 10 && (view instanceof SharedAudioCell)) {
                SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
                MessageObject messageObject2 = (MessageObject) arrayList.get(i - sharedMediaData.startOffset);
                sharedAudioCell.setMessageObject(messageObject2, i != arrayList.size() - 1);
                if (sharedMediaLayout.isActionModeShowed) {
                    sharedAudioCell.setChecked(sparseArrayArr[(messageObject2.getDialogId() > j ? 1 : (messageObject2.getDialogId() == j ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !sharedMediaLayout.scrolling);
                } else {
                    sharedAudioCell.setChecked(false, !sharedMediaLayout.scrolling);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            View anonymousClass1;
            View view2;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            Context context = this.mContext;
            FlickerLoadingView flickerLoadingView = sharedMediaLayout.globalGradientView;
            Theme.ResourcesProvider resourcesProvider = sharedMediaLayout.resourcesProvider;
            if (i != 7) {
                int i2 = this.currentType;
                if (i == 8) {
                    FlickerLoadingView flickerLoadingView2 = new FlickerLoadingView(context, resourcesProvider);
                    if (i2 == 2) {
                        flickerLoadingView2.setViewType(4);
                    } else {
                        flickerLoadingView2.setViewType(3);
                    }
                    flickerLoadingView2.showDate = false;
                    flickerLoadingView2.setIsSingleCell(true);
                    flickerLoadingView2.setGlobalGradientView(flickerLoadingView);
                    view = flickerLoadingView2;
                } else {
                    if (i == 9) {
                        EmptyStubView emptyStubViewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(i2, sharedMediaLayout.dialog_id, context, resourcesProvider);
                        emptyStubViewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                        return new RecyclerListView.Holder(emptyStubViewCreateEmptyStubView);
                    }
                    if (i2 == 4) {
                        ArrayList arrayList = sharedMediaLayout.audioCellCache;
                        if (arrayList.isEmpty()) {
                            anonymousClass1 = new MediaSearchAdapter.AnonymousClass1(this, context, resourcesProvider, 1);
                        } else {
                            view2 = (View) arrayList.get(0);
                            arrayList.remove(0);
                            ViewGroup viewGroup2 = (ViewGroup) view2.getParent();
                            if (viewGroup2 != null) {
                                anonymousClass1 = view2;
                                viewGroup2.removeView(view2);
                                anonymousClass1 = view2;
                            }
                        }
                    } else {
                        anonymousClass1 = new MediaSearchAdapter.AnonymousClass1(this, context, resourcesProvider, 1);
                    }
                    anonymousClass1 = view2;
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) anonymousClass1;
                    sharedAudioCell.setGlobalGradientView(flickerLoadingView);
                    view = anonymousClass1;
                    if (i2 == 4) {
                        sharedMediaLayout.audioCache.add(sharedAudioCell);
                        view = anonymousClass1;
                    }
                }
            } else {
                SharedDocumentCell sharedDocumentCell = new SharedDocumentCell(context, 0, resourcesProvider);
                sharedDocumentCell.setGlobalGradientView(flickerLoadingView);
                view = sharedDocumentCell;
            }
            return zzkl.m(view, view);
        }

        @Override
        public final void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
                int iAccess$12400 = 0;
                for (int i = 0; i < recyclerListView.getChildCount() && (iAccess$12400 = SharedMediaLayout.access$12400(recyclerListView.getChildAt(i))) == 0; i++) {
                }
                if (iAccess$12400 == 0) {
                    SharedMediaLayout.this.findPeriodAndJumpToDate(this.currentType, recyclerListView, true);
                }
            }
        }

        @Override
        public final void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(this.currentType);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }
    }

    public final class SharedLinksAdapter extends RecyclerListView.SectionsAdapter {
        public final Context mContext;

        public SharedLinksAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final int getCountForSection(int i) {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            if ((sharedMediaDataArr[3].sections.size() == 0 && !sharedMediaDataArr[3].loading) || i >= sharedMediaDataArr[3].sections.size()) {
                return 1;
            }
            SharedMediaData sharedMediaData = sharedMediaDataArr[3];
            return ((ArrayList) sharedMediaData.sectionArrays.get(sharedMediaData.sections.get(i))).size() + (i == 0 ? 0 : 1);
        }

        @Override
        public final Object getItem(int i, int i2) {
            return null;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            if (sharedMediaDataArr[3].sections.size() == 0 && !sharedMediaDataArr[3].loading) {
                return 5;
            }
            if (i < sharedMediaDataArr[3].sections.size()) {
                return (i == 0 || i2 != 0) ? 4 : 3;
            }
            return 6;
        }

        @Override
        public final String getLetter(int i) {
            return null;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = 0;
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            int i = 1;
            if (sharedMediaDataArr[3].sections.size() == 0 && !sharedMediaDataArr[3].loading) {
                return 1;
            }
            int size = sharedMediaDataArr[3].sections.size();
            if (sharedMediaDataArr[3].sections.isEmpty()) {
                i = 0;
            } else {
                boolean[] zArr = sharedMediaDataArr[3].endReached;
                if (zArr[0] && zArr[1]) {
                    i = 0;
                }
            }
            return size + i;
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (view == null) {
                view = new GraySectionCell(this.mContext, 28, sharedMediaLayout.resourcesProvider);
            }
            if (i == 0) {
                view.setAlpha(0.0f);
                return view;
            }
            if (i < sharedMediaLayout.sharedMediaData[3].sections.size()) {
                view.setAlpha(1.0f);
                ((GraySectionCell) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) sharedMediaLayout.sharedMediaData[3].sectionArrays.get((String) sharedMediaLayout.sharedMediaData[3].sections.get(i))).get(0)).messageOwner.date));
            }
            return view;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            SharedMediaData[] sharedMediaDataArr = SharedMediaLayout.this.sharedMediaData;
            if (sharedMediaDataArr[3].sections.size() != 0 || sharedMediaDataArr[3].loading) {
                return i == 0 || i2 != 0;
            }
            return false;
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            int i3 = viewHolder.mItemViewType;
            if (i3 == 6 || i3 == 5) {
                return;
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            SharedMediaData[] sharedMediaDataArr = sharedMediaLayout.sharedMediaData;
            ArrayList arrayList = (ArrayList) sharedMediaDataArr[3].sectionArrays.get((String) sharedMediaDataArr[3].sections.get(i));
            int i4 = viewHolder.mItemViewType;
            View view = viewHolder.itemView;
            if (i4 == 3) {
                MessageObject messageObject = (MessageObject) arrayList.get(0);
                if (view instanceof GraySectionCell) {
                    ((GraySectionCell) view).setText(LocaleController.formatSectionDate(messageObject.messageOwner.date));
                    return;
                }
                return;
            }
            if (i4 != 4) {
                return;
            }
            if (i != 0) {
                i2--;
            }
            if (!(view instanceof SharedLinkCell) || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            SharedLinkCell sharedLinkCell = (SharedLinkCell) view;
            MessageObject messageObject2 = (MessageObject) arrayList.get(i2);
            sharedLinkCell.needDivider = i2 != arrayList.size() - 1 || (i == sharedMediaDataArr[3].sections.size() - 1 && sharedMediaDataArr[3].loading);
            sharedLinkCell.resetPressedLink();
            sharedLinkCell.message = messageObject2;
            sharedLinkCell.requestLayout();
            if (sharedMediaLayout.isActionModeShowed) {
                sharedLinkCell.setChecked(sharedMediaLayout.selectedFiles[(messageObject2.getDialogId() > sharedMediaLayout.dialog_id ? 1 : (messageObject2.getDialogId() == sharedMediaLayout.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject2.getId()) >= 0, !sharedMediaLayout.scrolling);
            } else {
                sharedLinkCell.setChecked(false, !sharedMediaLayout.scrolling);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            Context context = this.mContext;
            Theme.ResourcesProvider resourcesProvider = sharedMediaLayout.resourcesProvider;
            if (i == 3) {
                graySectionCell = new GraySectionCell(context, 28, resourcesProvider);
            } else if (i == 4) {
                SharedLinkCell sharedLinkCell = new SharedLinkCell(context, 0, resourcesProvider);
                sharedLinkCell.setDelegate(sharedMediaLayout.sharedLinkCellDelegate);
                graySectionCell = sharedLinkCell;
            } else {
                if (i == 5) {
                    EmptyStubView emptyStubViewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(3, sharedMediaLayout.dialog_id, context, resourcesProvider);
                    emptyStubViewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                    return new RecyclerListView.Holder(emptyStubViewCreateEmptyStubView);
                }
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate = false;
                flickerLoadingView.setViewType(5);
                graySectionCell = flickerLoadingView;
            }
            return zzkl.m(graySectionCell, graySectionCell);
        }
    }

    public final class SharedMediaData {
        public int endLoadingStubs;
        public boolean fastScrollDataLoaded;
        public int frozenEndLoadingStubs;
        public int frozenStartOffset;
        public boolean hasPhotos;
        public boolean hasVideos;
        public boolean isFrozen;
        public boolean loading;
        public boolean loadingAfterFastScroll;
        public int min_id;
        public int requestIndex;
        public int startOffset;
        public final ArrayList messages = new ArrayList();
        public final SparseArray[] messagesDict = {new SparseArray(), new SparseArray()};
        public final ArrayList sections = new ArrayList();
        public final HashMap sectionArrays = new HashMap();
        public final ArrayList fastScrollPeriods = new ArrayList();
        public final int[] totalCount = {0, 0};
        public final boolean[] endReached = {false, true};
        public final int[] max_id = {0, 0};
        public boolean startReached = true;
        public int filterType = 0;
        public final ArrayList frozenMessages = new ArrayList();
        public RecyclerView.RecycledViewPool recycledViewPool = new RecyclerView.RecycledViewPool();

        public final boolean addMessage(MessageObject messageObject, int i, boolean z, boolean z2) {
            SparseArray[] sparseArrayArr = this.messagesDict;
            if (sparseArrayArr[i].indexOfKey(messageObject.getId()) >= 0) {
                return false;
            }
            HashMap map = this.sectionArrays;
            ArrayList arrayList = (ArrayList) map.get(messageObject.monthKey);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(messageObject.monthKey, arrayList);
                ArrayList arrayList2 = this.sections;
                if (z) {
                    arrayList2.add(0, messageObject.monthKey);
                } else {
                    arrayList2.add(messageObject.monthKey);
                }
            }
            ArrayList arrayList3 = this.messages;
            if (z) {
                arrayList.add(0, messageObject);
                arrayList3.add(0, messageObject);
            } else {
                arrayList.add(messageObject);
                arrayList3.add(messageObject);
            }
            sparseArrayArr[i].put(messageObject.getId(), messageObject);
            int[] iArr = this.max_id;
            if (z2) {
                iArr[i] = Math.max(messageObject.getId(), iArr[i]);
                this.min_id = Math.min(messageObject.getId(), this.min_id);
            } else if (messageObject.getId() > 0) {
                iArr[i] = Math.min(messageObject.getId(), iArr[i]);
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

        public final MessageObject deleteMessage(int i, int i2) {
            SparseArray[] sparseArrayArr = this.messagesDict;
            MessageObject messageObject = (MessageObject) sparseArrayArr[i2].get(i);
            if (messageObject == null) {
                return null;
            }
            HashMap map = this.sectionArrays;
            ArrayList arrayList = (ArrayList) map.get(messageObject.monthKey);
            if (arrayList == null) {
                return null;
            }
            arrayList.remove(messageObject);
            this.messages.remove(messageObject);
            sparseArrayArr[i2].remove(messageObject.getId());
            if (arrayList.isEmpty()) {
                map.remove(messageObject.monthKey);
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

        public final ArrayList getMessages() {
            return this.isFrozen ? this.frozenMessages : this.messages;
        }

        public final int getStartOffset() {
            return this.isFrozen ? this.frozenStartOffset : this.startOffset;
        }

        public final int getTotalCount() {
            int[] iArr = this.totalCount;
            return iArr[0] + iArr[1];
        }

        public final void setListFrozen(boolean z) {
            if (this.isFrozen == z) {
                return;
            }
            this.isFrozen = z;
            if (z) {
                this.frozenStartOffset = this.startOffset;
                this.frozenEndLoadingStubs = this.endLoadingStubs;
                ArrayList arrayList = this.frozenMessages;
                arrayList.clear();
                arrayList.addAll(this.messages);
            }
        }
    }

    public abstract class SharedMediaListView extends InternalListView {
        public final ArrayList animationSupportingSortedCells;
        public int animationSupportingSortedCellsOffset;
        public StaticLayout archivedHintLayout;
        public float archivedHintLayoutLeft;
        public float archivedHintLayoutWidth;
        public TextPaint archivedHintPaint;
        public final ArrayList drawingViews;
        public final ArrayList drawingViews2;
        public final ArrayList drawingViews3;
        public final HashSet excludeDrawViews;
        public UserListPoller poller;

        public SharedMediaListView(Context context) {
            super(context, null);
            this.excludeDrawViews = new HashSet();
            this.drawingViews = new ArrayList();
            this.drawingViews2 = new ArrayList();
            this.drawingViews3 = new ArrayList();
            this.animationSupportingSortedCells = new ArrayList();
        }

        public void checkHighlightCell(SharedPhotoVideoCell2 sharedPhotoVideoCell2) {
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            float fFloatValue;
            float y;
            int i;
            int i2;
            int i3;
            int pinchCenterPosition;
            float f;
            float fFloatValue2;
            boolean zIsChangeColumnsAnimation;
            boolean z;
            int viewAdapterPosition;
            int i4;
            int animateToColumnsCount;
            int i5;
            RecyclerListView.FastScrollAdapter movingAdapter = getMovingAdapter();
            RecyclerListView.FastScrollAdapter supportingAdapter = getSupportingAdapter();
            boolean zIsThisListView = isThisListView();
            Float fValueOf = Float.valueOf(1.0f);
            if (!zIsThisListView || getAdapter() != movingAdapter) {
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt = getChildAt(i6);
                    int iAccess$12400 = SharedMediaLayout.access$12400(childAt);
                    if (iAccess$12400 != 0 && getMessageAlphaEnter() != null) {
                        fFloatValue = getMessageAlphaEnter().get(iAccess$12400, null) != null ? getMessageAlphaEnter().get(iAccess$12400, fValueOf).floatValue() : 1.0f;
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
            boolean zIsChangeColumnsAnimation2 = isChangeColumnsAnimation();
            HashSet hashSet = this.excludeDrawViews;
            ArrayList arrayList = this.drawingViews2;
            ArrayList arrayList2 = this.drawingViews3;
            ArrayList arrayList3 = this.drawingViews;
            ArrayList arrayList4 = this.animationSupportingSortedCells;
            if (zIsChangeColumnsAnimation2) {
                int i7 = -1;
                int i8 = -1;
                int i9 = -1;
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(getChildAt(i10));
                    if (childAdapterPosition >= 0 && (childAdapterPosition > i8 || i8 == -1)) {
                        i8 = childAdapterPosition;
                    }
                    if (childAdapterPosition >= 0 && (childAdapterPosition < i9 || i9 == -1)) {
                        i9 = childAdapterPosition;
                    }
                }
                int i11 = 0;
                i2 = -1;
                while (true) {
                    y = measuredHeight;
                    if (i11 >= getSupportingListView().getChildCount()) {
                        break;
                    }
                    InternalListView supportingListView = getSupportingListView();
                    View childAt2 = getSupportingListView().getChildAt(i11);
                    supportingListView.getClass();
                    int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(childAt2);
                    int i12 = i8;
                    if (childAdapterPosition2 >= 0 && (childAdapterPosition2 > i7 || i7 == -1)) {
                        i7 = childAdapterPosition2;
                    }
                    if (childAdapterPosition2 >= 0 && (childAdapterPosition2 < i2 || i2 == -1)) {
                        i2 = childAdapterPosition2;
                    }
                    i11++;
                    i8 = i12;
                    measuredHeight = y;
                }
                int i13 = i8;
                if (i9 < 0 || i2 < 0 || getPinchCenterPosition() < 0) {
                    i4 = i9;
                    animateToColumnsCount = 0;
                    pinchCenterPosition = 0;
                } else {
                    i4 = i9;
                    int iCeil = (int) Math.ceil(movingAdapter.getItemCount() / getColumnsCount());
                    int iCeil2 = (int) Math.ceil(movingAdapter.getItemCount() / getAnimateToColumnsCount());
                    pinchCenterPosition = ((getPinchCenterPosition() / getAnimateToColumnsCount()) - (i2 / getAnimateToColumnsCount())) - ((getPinchCenterPosition() / getColumnsCount()) - (i4 / getColumnsCount()));
                    if ((i4 / getColumnsCount()) - pinchCenterPosition < 0) {
                        i5 = i7;
                        if (getAnimateToColumnsCount() < getColumnsCount()) {
                            pinchCenterPosition = 0;
                        }
                        if (((i5 / getColumnsCount()) + pinchCenterPosition < iCeil && getAnimateToColumnsCount() > getColumnsCount()) || ((i13 / getAnimateToColumnsCount()) - pinchCenterPosition >= iCeil2 && getAnimateToColumnsCount() < getColumnsCount())) {
                        }
                        animateToColumnsCount = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
                    } else {
                        i5 = i7;
                    }
                    if ((i2 / getAnimateToColumnsCount()) + pinchCenterPosition < 0 && getAnimateToColumnsCount() > getColumnsCount()) {
                        pinchCenterPosition = 0;
                    }
                    pinchCenterPosition = (i5 / getColumnsCount()) + pinchCenterPosition < iCeil ? 0 : 0;
                    animateToColumnsCount = (int) ((getAnimateToColumnsCount() - getColumnsCount()) * ((getPinchCenterPosition() % getColumnsCount()) / (getColumnsCount() - 1)));
                }
                arrayList4.clear();
                hashSet.clear();
                arrayList3.clear();
                arrayList.clear();
                arrayList2.clear();
                this.animationSupportingSortedCellsOffset = 0;
                int i14 = 0;
                while (i14 < getSupportingListView().getChildCount()) {
                    View childAt3 = getSupportingListView().getChildAt(i14);
                    int i15 = animateToColumnsCount;
                    if (childAt3.getTop() <= getMeasuredHeight() && childAt3.getBottom() >= 0) {
                        if (childAt3 instanceof SharedPhotoVideoCell2) {
                            arrayList4.add((SharedPhotoVideoCell2) childAt3);
                        } else if (childAt3 instanceof TextView) {
                            this.animationSupportingSortedCellsOffset++;
                        }
                    }
                    i14++;
                    animateToColumnsCount = i15;
                }
                i3 = animateToColumnsCount;
                arrayList3.addAll(arrayList4);
                RecyclerListView.FastScroll fastScroll = getFastScroll();
                if (fastScroll != null && fastScroll.getTag() != null) {
                    float scrollProgress = movingAdapter.getScrollProgress(this);
                    float scrollProgress2 = supportingAdapter.getScrollProgress(getSupportingListView());
                    float f2 = movingAdapter.fastScrollIsVisible(this) ? 1.0f : 0.0f;
                    float f3 = supportingAdapter.fastScrollIsVisible(getSupportingListView()) ? 1.0f : 0.0f;
                    fastScroll.setProgress((getChangeColumnsProgress() * scrollProgress2) + ((1.0f - getChangeColumnsProgress()) * scrollProgress));
                    fastScroll.setVisibilityAlpha((getChangeColumnsProgress() * f3) + ((1.0f - getChangeColumnsProgress()) * f2));
                }
                i = i4;
            } else {
                y = measuredHeight;
                i = 0;
                i2 = 0;
                i3 = 0;
                pinchCenterPosition = 0;
            }
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                View childAt4 = getChildAt(i16);
                if (childAt4.getTop() > getMeasuredHeight() || childAt4.getBottom() < 0) {
                    if (childAt4 instanceof SharedPhotoVideoCell2) {
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) getChildAt(i16);
                        sharedPhotoVideoCell2.crossfadeView = null;
                        sharedPhotoVideoCell2.crossfadeProgress = 0.0f;
                        sharedPhotoVideoCell2.crossfadeToColumnsCount = 0;
                        sharedPhotoVideoCell2.setTranslationX(0.0f);
                        sharedPhotoVideoCell2.setTranslationY(0.0f);
                        sharedPhotoVideoCell2.setImageScale(1.0f, !isChangeColumnsAnimation());
                    }
                } else if (childAt4 instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell3 = (SharedPhotoVideoCell2) getChildAt(i16);
                    checkHighlightCell(sharedPhotoVideoCell3);
                    MessageObject messageObject = sharedPhotoVideoCell3.getMessageObject();
                    if (messageObject == null || getMessageAlphaEnter() == null) {
                        f = 2.0f;
                    } else {
                        f = 2.0f;
                        fFloatValue2 = getMessageAlphaEnter().get(messageObject.getId(), null) != null ? getMessageAlphaEnter().get(messageObject.getId(), fValueOf).floatValue() : 1.0f;
                        zIsChangeColumnsAnimation = isChangeColumnsAnimation();
                        if (sharedPhotoVideoCell3.imageAlpha != fFloatValue2) {
                            sharedPhotoVideoCell3.imageAlpha = fFloatValue2;
                            if (!zIsChangeColumnsAnimation) {
                                sharedPhotoVideoCell3.invalidate();
                            }
                        }
                        if (isChangeColumnsAnimation()) {
                            viewAdapterPosition = (((GridLayoutManager.LayoutParams) sharedPhotoVideoCell3.getLayoutParams()).getViewAdapterPosition() % getColumnsCount()) + i3;
                            int animateToColumnsCount2 = (getAnimateToColumnsCount() * (((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell3.getLayoutParams()).getViewAdapterPosition() - i) / getColumnsCount()) + pinchCenterPosition)) + viewAdapterPosition + this.animationSupportingSortedCellsOffset;
                            if (viewAdapterPosition >= 0 || viewAdapterPosition >= getAnimateToColumnsCount() || animateToColumnsCount2 < 0 || animateToColumnsCount2 >= arrayList4.size()) {
                                z = false;
                            } else {
                                float fLerp = AndroidUtilities.lerp(1.0f, (((SharedPhotoVideoCell2) arrayList4.get(animateToColumnsCount2)).getMeasuredWidth() - AndroidUtilities.dpf2(f)) / (sharedPhotoVideoCell3.getMeasuredWidth() - AndroidUtilities.dpf2(f)), getChangeColumnsProgress());
                                float left = sharedPhotoVideoCell3.getLeft();
                                float top = sharedPhotoVideoCell3.getTop();
                                float left2 = ((SharedPhotoVideoCell2) arrayList4.get(animateToColumnsCount2)).getLeft();
                                float top2 = ((SharedPhotoVideoCell2) arrayList4.get(animateToColumnsCount2)).getTop();
                                sharedPhotoVideoCell3.setPivotX(0.0f);
                                sharedPhotoVideoCell3.setPivotY(0.0f);
                                sharedPhotoVideoCell3.setImageScale(fLerp, !isChangeColumnsAnimation());
                                sharedPhotoVideoCell3.setTranslationX(getChangeColumnsProgress() * (left2 - left));
                                sharedPhotoVideoCell3.setTranslationY(getChangeColumnsProgress() * (top2 - top));
                                SharedPhotoVideoCell2 sharedPhotoVideoCell4 = (SharedPhotoVideoCell2) arrayList4.get(animateToColumnsCount2);
                                float changeColumnsProgress = getChangeColumnsProgress();
                                int animateToColumnsCount3 = getAnimateToColumnsCount();
                                sharedPhotoVideoCell3.crossfadeView = sharedPhotoVideoCell4;
                                sharedPhotoVideoCell3.crossfadeProgress = changeColumnsProgress;
                                sharedPhotoVideoCell3.crossfadeToColumnsCount = animateToColumnsCount3;
                                hashSet.add((SharedPhotoVideoCell2) arrayList4.get(animateToColumnsCount2));
                                arrayList2.add(sharedPhotoVideoCell3);
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
                        if (z) {
                            if (isChangeColumnsAnimation()) {
                                arrayList.add(sharedPhotoVideoCell3);
                            }
                            sharedPhotoVideoCell3.crossfadeView = null;
                            sharedPhotoVideoCell3.crossfadeProgress = 0.0f;
                            sharedPhotoVideoCell3.crossfadeToColumnsCount = 0;
                            sharedPhotoVideoCell3.setTranslationX(0.0f);
                            sharedPhotoVideoCell3.setTranslationY(0.0f);
                            sharedPhotoVideoCell3.setImageScale(1.0f, !isChangeColumnsAnimation());
                        }
                    }
                    zIsChangeColumnsAnimation = isChangeColumnsAnimation();
                    if (sharedPhotoVideoCell3.imageAlpha != fFloatValue2) {
                        sharedPhotoVideoCell3.imageAlpha = fFloatValue2;
                        if (!zIsChangeColumnsAnimation) {
                            sharedPhotoVideoCell3.invalidate();
                        }
                    }
                    if (isChangeColumnsAnimation()) {
                        viewAdapterPosition = (((GridLayoutManager.LayoutParams) sharedPhotoVideoCell3.getLayoutParams()).getViewAdapterPosition() % getColumnsCount()) + i3;
                        int animateToColumnsCount4 = (getAnimateToColumnsCount() * (((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell3.getLayoutParams()).getViewAdapterPosition() - i) / getColumnsCount()) + pinchCenterPosition)) + viewAdapterPosition + this.animationSupportingSortedCellsOffset;
                        if (viewAdapterPosition >= 0) {
                            z = false;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (isChangeColumnsAnimation()) {
                            arrayList.add(sharedPhotoVideoCell3);
                        }
                        sharedPhotoVideoCell3.crossfadeView = null;
                        sharedPhotoVideoCell3.crossfadeProgress = 0.0f;
                        sharedPhotoVideoCell3.crossfadeToColumnsCount = 0;
                        sharedPhotoVideoCell3.setTranslationX(0.0f);
                        sharedPhotoVideoCell3.setTranslationY(0.0f);
                        sharedPhotoVideoCell3.setImageScale(1.0f, !isChangeColumnsAnimation());
                    }
                }
            }
            float f4 = 255.0f;
            if (isChangeColumnsAnimation() && !arrayList3.isEmpty()) {
                float changeColumnsProgress2 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (getAnimateToColumnsCount() / getColumnsCount()));
                float changeColumnsProgress3 = getChangeColumnsProgress() + ((1.0f - getChangeColumnsProgress()) * (((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
                float measuredWidth = getMeasuredWidth() / getColumnsCount();
                float measuredWidth2 = getMeasuredWidth() / getAnimateToColumnsCount();
                float fCeil = (float) (((Math.ceil(getMeasuredWidth() / getAnimateToColumnsCount()) - ((double) AndroidUtilities.dpf2(2.0f))) * ((double) changeColumnsProgress3)) + ((double) AndroidUtilities.dpf2(2.0f)));
                if (isStories()) {
                    fCeil *= 1.25f;
                }
                float f5 = fCeil;
                int i17 = 0;
                while (i17 < arrayList3.size()) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell5 = (SharedPhotoVideoCell2) arrayList3.get(i17);
                    if (hashSet.contains(sharedPhotoVideoCell5)) {
                        changeColumnsProgress3 = changeColumnsProgress3;
                        i17 = i17;
                    } else {
                        sharedPhotoVideoCell5.crossfadeView = null;
                        sharedPhotoVideoCell5.crossfadeProgress = 0.0f;
                        sharedPhotoVideoCell5.crossfadeToColumnsCount = 0;
                        int viewAdapterPosition2 = ((GridLayoutManager.LayoutParams) sharedPhotoVideoCell5.getLayoutParams()).getViewAdapterPosition() % getAnimateToColumnsCount();
                        int i18 = viewAdapterPosition2 - i3;
                        int viewAdapterPosition3 = ((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell5.getLayoutParams()).getViewAdapterPosition() - i2) / getAnimateToColumnsCount()) - pinchCenterPosition;
                        canvas.save();
                        canvas.translate((getChangeColumnsProgress() * viewAdapterPosition2 * measuredWidth2) + ((1.0f - getChangeColumnsProgress()) * i18 * measuredWidth), (viewAdapterPosition3 * f5) + y);
                        sharedPhotoVideoCell5.setImageScale(changeColumnsProgress3, !isChangeColumnsAnimation());
                        if (i18 < getColumnsCount()) {
                            canvas.saveLayerAlpha(0.0f, 0.0f, sharedPhotoVideoCell5.getMeasuredWidth() * changeColumnsProgress2, sharedPhotoVideoCell5.getMeasuredHeight() * changeColumnsProgress2, (int) (getChangeColumnsProgress() * 255.0f), 31);
                            sharedPhotoVideoCell5.draw(canvas);
                            canvas.restore();
                        } else {
                            sharedPhotoVideoCell5.draw(canvas);
                        }
                        canvas.restore();
                    }
                    i17++;
                    changeColumnsProgress3 = changeColumnsProgress3;
                }
            }
            super.dispatchDraw(canvas);
            if (isChangeColumnsAnimation()) {
                float changeColumnsProgress4 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (getColumnsCount() / getAnimateToColumnsCount()));
                float changeColumnsProgress5 = (1.0f - getChangeColumnsProgress()) + (getChangeColumnsProgress() * (((getMeasuredWidth() / getAnimateToColumnsCount()) - AndroidUtilities.dpf2(2.0f)) / ((getMeasuredWidth() / getColumnsCount()) - AndroidUtilities.dpf2(2.0f))));
                float fCeil2 = (float) (((Math.ceil(getMeasuredWidth() / getColumnsCount()) - ((double) AndroidUtilities.dpf2(2.0f))) * ((double) changeColumnsProgress5)) + ((double) AndroidUtilities.dpf2(2.0f)));
                if (isStories()) {
                    fCeil2 *= 1.25f;
                }
                float f6 = fCeil2;
                float measuredWidth3 = getMeasuredWidth() / getColumnsCount();
                float measuredWidth4 = getMeasuredWidth() / getAnimateToColumnsCount();
                int i19 = 0;
                while (i19 < arrayList.size()) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell6 = (SharedPhotoVideoCell2) arrayList.get(i19);
                    int viewAdapterPosition4 = ((GridLayoutManager.LayoutParams) sharedPhotoVideoCell6.getLayoutParams()).getViewAdapterPosition() % getColumnsCount();
                    int viewAdapterPosition5 = ((((GridLayoutManager.LayoutParams) sharedPhotoVideoCell6.getLayoutParams()).getViewAdapterPosition() - i) / getColumnsCount()) + pinchCenterPosition;
                    int i20 = viewAdapterPosition4 + i3;
                    canvas.save();
                    sharedPhotoVideoCell6.setImageScale(changeColumnsProgress5, !isChangeColumnsAnimation());
                    canvas.translate((getChangeColumnsProgress() * i20 * measuredWidth4) + ((1.0f - getChangeColumnsProgress()) * viewAdapterPosition4 * measuredWidth3), (viewAdapterPosition5 * f6) + y);
                    if (i20 < getAnimateToColumnsCount()) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, sharedPhotoVideoCell6.getMeasuredWidth() * changeColumnsProgress4, sharedPhotoVideoCell6.getMeasuredHeight() * changeColumnsProgress4, (int) ((1.0f - getChangeColumnsProgress()) * f4), 31);
                        sharedPhotoVideoCell6.draw(canvas);
                        canvas.restore();
                    } else {
                        sharedPhotoVideoCell6.draw(canvas);
                    }
                    canvas.restore();
                    i19++;
                    f4 = 255.0f;
                }
                if (arrayList2.isEmpty()) {
                    return;
                }
                canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (getChangeColumnsProgress() * 255.0f), 31);
                for (int i21 = 0; i21 < arrayList2.size(); i21++) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell7 = (SharedPhotoVideoCell2) arrayList2.get(i21);
                    if (sharedPhotoVideoCell7.crossfadeView != null) {
                        canvas.save();
                        canvas.translate(sharedPhotoVideoCell7.getX(), sharedPhotoVideoCell7.getY());
                        sharedPhotoVideoCell7.crossfadeView.setImageScale(((sharedPhotoVideoCell7.getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * sharedPhotoVideoCell7.imageScale) / (sharedPhotoVideoCell7.crossfadeView.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
                        sharedPhotoVideoCell7.crossfadeView.draw(canvas);
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
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

        public abstract boolean isChangeColumnsAnimation();

        public abstract boolean isStories();

        public boolean isThisListView() {
            return true;
        }
    }

    public final class SharedMediaPreloader implements NotificationCenter.NotificationCenterDelegate {
        public boolean checkedHasSavedMessages;
        public final long dialogId;
        public boolean hasSavedMessages;
        public boolean mediaWasLoaded;
        public long mergeDialogId;
        public final NotificationCenter.ObserversGroup observersGroup;
        public final BaseFragment parentFragment;
        public final SharedMediaData[] sharedMediaData;
        public final long topicId;
        public int[] mediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public int[] mediaMergeCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public final int[] lastMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public final int[] lastLoadMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public final int[] lastLoadMergeMediaCount = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public final ArrayList delegates = new ArrayList();

        public SharedMediaPreloader(BaseFragment baseFragment) {
            TLRPC.ChatFull chatFull;
            final int i = 0;
            final int i2 = 1;
            this.parentFragment = baseFragment;
            if (baseFragment instanceof ChatActivityInterface) {
                ChatActivityInterface chatActivityInterface = (ChatActivityInterface) baseFragment;
                long dialogId = chatActivityInterface.getDialogId();
                this.dialogId = dialogId;
                this.mergeDialogId = chatActivityInterface.getMergeDialogId();
                this.topicId = chatActivityInterface.getTopicId();
                if (dialogId != baseFragment.getUserConfig().getClientUserId()) {
                    baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(dialogId, new Utilities.Callback(this) {
                        public final SharedMediaLayout.SharedMediaPreloader f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run(Object obj) {
                            Boolean bool = (Boolean) obj;
                            switch (i) {
                                case 0:
                                    SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.f$0;
                                    sharedMediaPreloader.getClass();
                                    boolean zBooleanValue = bool.booleanValue();
                                    sharedMediaPreloader.hasSavedMessages = zBooleanValue;
                                    sharedMediaPreloader.checkedHasSavedMessages = true;
                                    if (zBooleanValue) {
                                        ArrayList arrayList = sharedMediaPreloader.delegates;
                                        int size = arrayList.size();
                                        for (int i3 = 0; i3 < size; i3++) {
                                            ((SharedMediaLayout.SharedMediaPreloaderDelegate) arrayList.get(i3)).mediaCountUpdated();
                                        }
                                    }
                                    break;
                                default:
                                    SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader2 = this.f$0;
                                    sharedMediaPreloader2.getClass();
                                    boolean zBooleanValue2 = bool.booleanValue();
                                    sharedMediaPreloader2.hasSavedMessages = zBooleanValue2;
                                    sharedMediaPreloader2.checkedHasSavedMessages = true;
                                    if (zBooleanValue2) {
                                        ArrayList arrayList2 = sharedMediaPreloader2.delegates;
                                        int size2 = arrayList2.size();
                                        for (int i4 = 0; i4 < size2; i4++) {
                                            ((SharedMediaLayout.SharedMediaPreloaderDelegate) arrayList2.get(i4)).mediaCountUpdated();
                                        }
                                    }
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
                    long dialogId2 = profileActivity.getDialogId();
                    this.dialogId = dialogId2;
                    long j = profileActivity.topicId;
                    this.topicId = j;
                    TLRPC.ChatFull chatFull2 = profileActivity.chatInfo;
                    if (chatFull2 != null && baseFragment != 0) {
                        long j2 = chatFull2.migrated_from_chat_id;
                        if (j2 != 0 && this.mergeDialogId == 0) {
                            this.mergeDialogId = -j2;
                            baseFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, j, baseFragment.getClassGuid());
                        }
                    }
                    if (dialogId2 != baseFragment.getUserConfig().getClientUserId()) {
                        baseFragment.getMessagesController().getSavedMessagesController().hasSavedMessages(dialogId2, new Utilities.Callback(this) {
                            public final SharedMediaLayout.SharedMediaPreloader f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run(Object obj) {
                                Boolean bool = (Boolean) obj;
                                switch (i2) {
                                    case 0:
                                        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader = this.f$0;
                                        sharedMediaPreloader.getClass();
                                        boolean zBooleanValue = bool.booleanValue();
                                        sharedMediaPreloader.hasSavedMessages = zBooleanValue;
                                        sharedMediaPreloader.checkedHasSavedMessages = true;
                                        if (zBooleanValue) {
                                            ArrayList arrayList = sharedMediaPreloader.delegates;
                                            int size = arrayList.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                ((SharedMediaLayout.SharedMediaPreloaderDelegate) arrayList.get(i3)).mediaCountUpdated();
                                            }
                                        }
                                        break;
                                    default:
                                        SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader2 = this.f$0;
                                        sharedMediaPreloader2.getClass();
                                        boolean zBooleanValue2 = bool.booleanValue();
                                        sharedMediaPreloader2.hasSavedMessages = zBooleanValue2;
                                        sharedMediaPreloader2.checkedHasSavedMessages = true;
                                        if (zBooleanValue2) {
                                            ArrayList arrayList2 = sharedMediaPreloader2.delegates;
                                            int size2 = arrayList2.size();
                                            for (int i4 = 0; i4 < size2; i4++) {
                                                ((SharedMediaLayout.SharedMediaPreloaderDelegate) arrayList2.get(i4)).mediaCountUpdated();
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                    }
                }
            } else if (baseFragment instanceof MediaActivity) {
                this.dialogId = ((MediaActivity) baseFragment).dialogId;
            } else if (baseFragment instanceof DialogsActivity) {
                this.dialogId = baseFragment.getUserConfig().getClientUserId();
            }
            if (this.mergeDialogId == 0 && DialogObject.isChatDialog(this.dialogId) && (chatFull = baseFragment.getMessagesController().getChatFull(-this.dialogId)) != null) {
                long j3 = chatFull.migrated_from_chat_id;
                if (j3 != 0) {
                    this.mergeDialogId = -j3;
                }
            }
            this.sharedMediaData = new SharedMediaData[9];
            int i3 = 0;
            while (true) {
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (i3 >= sharedMediaDataArr.length) {
                    break;
                }
                sharedMediaDataArr[i3] = new SharedMediaData();
                this.sharedMediaData[i3].max_id[0] = DialogObject.isEncryptedDialog(this.dialogId) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.sharedMediaData[i3].max_id[1] = Integer.MAX_VALUE;
                i3++;
            }
            loadMediaCounts();
            BaseFragment baseFragment2 = this.parentFragment;
            if (baseFragment2 == null) {
                this.observersGroup = null;
            } else {
                this.observersGroup = baseFragment2.getNotificationCenter().createObserversGroup(this).add(NotificationCenter.mediaCountsDidLoad).add(NotificationCenter.mediaCountDidLoad).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.replaceMessagesObjects).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.fileLoaded).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.savedMessagesDialogsUpdate);
            }
        }

        @Override
        public final void didReceivedNotification(int i, int i2, Object... objArr) {
            BaseFragment baseFragment;
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
                            ((SharedMediaPreloaderDelegate) this.delegates.get(i8)).mediaCountUpdated();
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
                        ((SharedMediaPreloaderDelegate) this.delegates.get(i8)).mediaCountUpdated();
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
                    BaseFragment baseFragment2 = this.parentFragment;
                    int currentAccount = baseFragment2 != null ? baseFragment2.getCurrentAccount() : -1;
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
                                        ((Period) this.sharedMediaData[mediaType].fastScrollPeriods.get(i16)).startOffset++;
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
                            this.sharedMediaData[iIntValue3].totalCount[i17] = ((Integer) objArr[1]).intValue();
                        }
                        this.sharedMediaData[iIntValue3].endReached[i17] = ((Boolean) objArr[5]).booleanValue();
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
                    BaseFragment baseFragment3 = this.parentFragment;
                    int currentAccount2 = baseFragment3 != null ? baseFragment3.getCurrentAccount() : -1;
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
                            ((SharedMediaPreloaderDelegate) this.delegates.get(i8)).mediaCountUpdated();
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
                        if (j4 >= 0 || chatFull.id != (-j4) || (baseFragment = this.parentFragment) == null) {
                            return;
                        }
                        long j5 = chatFull.migrated_from_chat_id;
                        if (j5 == 0 || this.mergeDialogId != 0) {
                            return;
                        }
                        this.mergeDialogId = -j5;
                        baseFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, this.parentFragment.getClassGuid());
                        return;
                    }
                    if (i == NotificationCenter.fileLoaded) {
                        ArrayList arrayList4 = new ArrayList();
                        int i25 = 0;
                        while (true) {
                            SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
                            if (i25 >= sharedMediaDataArr2.length) {
                                break;
                            }
                            arrayList4.addAll(sharedMediaDataArr2[i25].messages);
                            i25++;
                        }
                        String str = (String) objArr[0];
                        if (str != null) {
                            Utilities.globalQueue.postRunnable(new ActivityCompat.AnonymousClass1(i2, str, arrayList4));
                            return;
                        }
                        return;
                    }
                    if (i == NotificationCenter.savedMessagesDialogsUpdate) {
                        BaseFragment baseFragment4 = this.parentFragment;
                        boolean z3 = baseFragment4 != null && baseFragment4.getMessagesController().getSavedMessagesController().containsDialog(this.dialogId);
                        if (!this.checkedHasSavedMessages || this.hasSavedMessages == z3) {
                            return;
                        }
                        this.hasSavedMessages = z3;
                        int size5 = this.delegates.size();
                        for (int i26 = 0; i26 < size5; i26++) {
                            ((SharedMediaPreloaderDelegate) this.delegates.get(i26)).mediaCountUpdated();
                        }
                        return;
                    }
                    return;
                }
                long jLongValue8 = ((Long) objArr[0]).longValue();
                long j6 = this.dialogId;
                if (jLongValue8 == j6 || jLongValue8 == this.mergeDialogId) {
                    int i27 = jLongValue8 == j6 ? 0 : 1;
                    ArrayList arrayList5 = (ArrayList) objArr[1];
                    BaseFragment baseFragment5 = this.parentFragment;
                    int currentAccount3 = baseFragment5 != null ? baseFragment5.getCurrentAccount() : -1;
                    int size6 = arrayList5.size();
                    int i28 = 0;
                    while (i28 < size6) {
                        MessageObject messageObject2 = (MessageObject) arrayList5.get(i28);
                        int id = messageObject2.getId();
                        long topicId = MessageObject.getTopicId(currentAccount3, messageObject2.messageOwner, z);
                        int mediaType2 = MediaDataController.getMediaType(messageObject2.messageOwner);
                        long j7 = this.topicId;
                        if (j7 == 0 || topicId == j7) {
                            int i29 = 0;
                            while (true) {
                                SharedMediaData[] sharedMediaDataArr3 = this.sharedMediaData;
                                if (i29 >= sharedMediaDataArr3.length) {
                                    break;
                                }
                                MessageObject messageObject3 = (MessageObject) sharedMediaDataArr3[i29].messagesDict[i27].get(id);
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
            char c = l.longValue() == this.dialogId ? (char) 0 : (char) 1;
            while (true) {
                SharedMediaData[] sharedMediaDataArr4 = this.sharedMediaData;
                if (i8 >= sharedMediaDataArr4.length) {
                    return;
                }
                SharedMediaData sharedMediaData2 = sharedMediaDataArr4[i8];
                int iIntValue4 = num.intValue();
                int iIntValue5 = num2.intValue();
                MessageObject messageObject4 = (MessageObject) sharedMediaData2.messagesDict[c].get(iIntValue4);
                if (messageObject4 != null) {
                    sharedMediaData2.messagesDict[c].remove(iIntValue4);
                    sharedMediaData2.messagesDict[c].put(iIntValue5, messageObject4);
                    messageObject4.messageOwner.id = iIntValue5;
                    int[] iArr8 = sharedMediaData2.max_id;
                    iArr8[c] = Math.min(iIntValue5, iArr8[c]);
                }
                i8++;
            }
        }

        public final void loadMediaCounts() {
            BaseFragment baseFragment = this.parentFragment;
            if (baseFragment == null) {
                return;
            }
            baseFragment.getMediaDataController().getMediaCounts(this.dialogId, this.topicId, baseFragment.getClassGuid());
            if (this.mergeDialogId != 0) {
                baseFragment.getMediaDataController().getMediaCounts(this.mergeDialogId, this.topicId, baseFragment.getClassGuid());
            }
        }
    }

    public interface SharedMediaPreloaderDelegate {
        void mediaCountUpdated();
    }

    public class SharedPhotoVideoAdapter extends RecyclerListView.FastScrollAdapter {
        public boolean inFastScrollMode;
        public final Context mContext;
        public SharedPhotoVideoCell2.SharedResources sharedResources;

        public SharedPhotoVideoAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public final boolean fastScrollIsVisible(RecyclerListView recyclerListView) {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (sharedMediaLayout.isSearchingStories()) {
                return false;
            }
            return recyclerListView.getChildCount() != 0 && recyclerListView.getChildAt(0).getMeasuredHeight() * ((int) Math.ceil((double) (((float) getTotalItemsCount()) / ((float) ((this == sharedMediaLayout.photoVideoAdapter || SharedMediaLayout.access$7500(sharedMediaLayout, this) != -1) ? sharedMediaLayout.mediaColumnsCount[0] : sharedMediaLayout.animateToColumnsCount))))) > recyclerListView.getMeasuredHeight();
        }

        @Override
        public int getItemCount() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.SharedMediaLayout.SharedPhotoVideoAdapter.getItemCount():int");
        }

        @Override
        public int getItemViewType(int i) {
            boolean z = this.inFastScrollMode;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (!z && sharedMediaLayout.sharedMediaData[0].getMessages().size() == 0) {
                SharedMediaData sharedMediaData = sharedMediaLayout.sharedMediaData[0];
                if (!sharedMediaData.loading && sharedMediaData.startReached) {
                    return 2;
                }
            }
            sharedMediaLayout.sharedMediaData[0].getClass();
            SharedMediaData[] sharedMediaDataArr = sharedMediaLayout.sharedMediaData;
            sharedMediaDataArr[0].getMessages().size();
            sharedMediaDataArr[0].getClass();
            return 0;
        }

        @Override
        public String getLetter(int i) {
            ArrayList arrayList = SharedMediaLayout.this.sharedMediaData[0].fastScrollPeriods;
            if (arrayList == null || arrayList.isEmpty()) {
                return "";
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (i <= ((Period) arrayList.get(i2)).startOffset) {
                    return ((Period) arrayList.get(i2)).formatedDate;
                }
            }
            return ((Period) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).formatedDate;
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int i;
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (SharedMediaLayout.access$9900(sharedMediaLayout, this) != -1 || this == sharedMediaLayout.animationSupportingPhotoVideoAdapter) {
                i = sharedMediaLayout.animateToColumnsCount;
            } else {
                int iAccess$7500 = SharedMediaLayout.access$7500(sharedMediaLayout, this);
                int[] iArr2 = sharedMediaLayout.mediaColumnsCount;
                i = iAccess$7500 != -1 ? iArr2[1] : iArr2[0];
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
        public final float getScrollProgress(RecyclerListView recyclerListView) {
            int i;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (this == sharedMediaLayout.animationSupportingPhotoVideoAdapter || SharedMediaLayout.access$9900(sharedMediaLayout, this) != -1) {
                i = sharedMediaLayout.animateToColumnsCount;
            } else {
                i = SharedMediaLayout.access$7500(sharedMediaLayout, this) != -1 ? sharedMediaLayout.mediaColumnsCount[1] : sharedMediaLayout.mediaColumnsCount[0];
            }
            int iCeil = (int) Math.ceil(getTotalItemsCount() / i);
            if (recyclerListView.getChildCount() == 0) {
                return 0.0f;
            }
            int measuredHeight = recyclerListView.getChildAt(0).getMeasuredHeight();
            View childAt = recyclerListView.getChildAt(0);
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition < 0) {
                return 0.0f;
            }
            return (((childAdapterPosition / i) * measuredHeight) - (childAt.getTop() - recyclerListView.getPaddingTop())) / ((iCeil * measuredHeight) - (recyclerListView.getMeasuredHeight() - recyclerListView.getPaddingTop()));
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
            if (viewHolder.mItemViewType == 0) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                ArrayList messages = sharedMediaLayout.sharedMediaData[0].getMessages();
                int startOffset = i - sharedMediaLayout.sharedMediaData[0].getStartOffset();
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    int messageId = sharedPhotoVideoCell2.getMessageId();
                    int[] iArr = sharedMediaLayout.mediaColumnsCount;
                    if (this == sharedMediaLayout.photoVideoAdapter) {
                        i2 = iArr[0];
                    } else {
                        i2 = SharedMediaLayout.access$7500(sharedMediaLayout, this) != -1 ? iArr[1] : sharedMediaLayout.animateToColumnsCount;
                    }
                    if (startOffset < 0 || startOffset >= messages.size()) {
                        sharedPhotoVideoCell2.setMessageObject(null, i2, false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    MessageObject messageObject = (MessageObject) messages.get(startOffset);
                    boolean z = messageObject.getId() == messageId;
                    if (sharedMediaLayout.isActionModeShowed) {
                        sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > sharedMediaLayout.dialog_id ? 1 : (messageObject.getDialogId() == sharedMediaLayout.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, z);
                    } else {
                        sharedPhotoVideoCell2.setChecked(false, z);
                    }
                    sharedPhotoVideoCell2.setMessageObject(messageObject, i2, false);
                }
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            Context context = this.mContext;
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (i != 0 && i != 19) {
                EmptyStubView emptyStubViewCreateEmptyStubView = SharedMediaLayout.createEmptyStubView(0, sharedMediaLayout.dialog_id, context, sharedMediaLayout.resourcesProvider);
                emptyStubViewCreateEmptyStubView.setLayoutParams(new RecyclerView.LayoutParams(-1, -1));
                return new RecyclerListView.Holder(emptyStubViewCreateEmptyStubView);
            }
            if (this.sharedResources == null) {
                this.sharedResources = new SharedPhotoVideoCell2.SharedResources(viewGroup.getContext(), sharedMediaLayout.resourcesProvider);
            }
            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = new SharedPhotoVideoCell2(context, this.sharedResources, sharedMediaLayout.profileActivity.getCurrentAccount());
            if (i == 19) {
                sharedPhotoVideoCell2.check2 = true;
            }
            sharedPhotoVideoCell2.setGradientView(sharedMediaLayout.globalGradientView);
            if (SharedMediaLayout.access$7500(sharedMediaLayout, this) != -1) {
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
        public final void onFinishFastScroll(RecyclerListView recyclerListView) {
            if (this.inFastScrollMode) {
                this.inFastScrollMode = false;
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

        @Override
        public final void onStartFastScroll() {
            this.inFastScrollMode = true;
            MediaPage mediaPage = SharedMediaLayout.this.getMediaPage(0);
            if (mediaPage != null) {
                SharedMediaLayout.showFastScrollHint(mediaPage, null, false);
            }
        }
    }

    public class StoriesAdapter extends SharedPhotoVideoAdapter {
        public final int albumId;
        public boolean applyingReorder;
        public final int id;
        public boolean inAlbumStoriesReorder;
        public final boolean isArchive;
        public final ArrayList lastPinnedIds;
        public final AnonymousClass1 poller;
        public StoriesController.StoriesList storiesList;
        public final ArrayList uploadingStories;

        public final class AnonymousClass2 extends MessageObject {
            @Override
            public final float getProgress() {
                return this.uploadingStory.progress;
            }
        }

        public StoriesAdapter(SharedMediaLayout sharedMediaLayout, Context context, boolean z) {
            this(context, 0, z);
        }

        public final boolean canReorder(int i) {
            StoriesController.StoriesList storiesList;
            if (this.isArchive || (storiesList = this.storiesList) == null) {
                return false;
            }
            if (storiesList instanceof StoriesController.BotPreviewsList) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                TLRPC.User user = MessagesController.getInstance(sharedMediaLayout.profileActivity.getCurrentAccount()).getUser(Long.valueOf(sharedMediaLayout.dialog_id));
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

        public final void checkColumns() {
            MediaPage mediaPage;
            MediaPage mediaPage2;
            MediaPage mediaPage3;
            MediaPage mediaPage4;
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList == null || this.isArchive) {
                return;
            }
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if ((!sharedMediaLayout.storiesColumnsCountSet || (sharedMediaLayout.allowStoriesSingleColumn && storiesList.getCount() > 1)) && this.storiesList.getCount() > 0 && !sharedMediaLayout.isStoriesView()) {
                int count = this.storiesList.getCount();
                MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                int[] iArr = sharedMediaLayout.mediaColumnsCount;
                if (count < 5) {
                    iArr[1] = this.storiesList.getCount();
                    if (mediaPageArr != null && (mediaPage3 = mediaPageArr[0]) != null && (mediaPage4 = mediaPageArr[1]) != null && mediaPage3.listView != null && mediaPage4.listView != null) {
                        sharedMediaLayout.switchToCurrentSelectedMode(false);
                    }
                    sharedMediaLayout.allowStoriesSingleColumn = iArr[1] == 1;
                } else if (sharedMediaLayout.allowStoriesSingleColumn) {
                    sharedMediaLayout.allowStoriesSingleColumn = false;
                    iArr[1] = Math.max(2, SharedConfig.storiesColumnsCount);
                    if (mediaPageArr != null && (mediaPage = mediaPageArr[0]) != null && (mediaPage2 = mediaPageArr[1]) != null && mediaPage.listView != null && mediaPage2.listView != null) {
                        sharedMediaLayout.switchToCurrentSelectedMode(false);
                    }
                }
                sharedMediaLayout.storiesColumnsCountSet = true;
            }
        }

        public final int columnsCount() {
            SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
            if (this == sharedMediaLayout.photoVideoAdapter) {
                return sharedMediaLayout.mediaColumnsCount[0];
            }
            return SharedMediaLayout.access$7500(sharedMediaLayout, this) != -1 ? sharedMediaLayout.mediaColumnsCount[1] : sharedMediaLayout.animateToColumnsCount;
        }

        @Override
        public final int getItemCount() {
            if (this.storiesList == null) {
                return 0;
            }
            return this.uploadingStories.size() + ((this.storiesList.isOnlyCache() && SharedMediaLayout.this.profileActivity.getConnectionsManager().getConnectionState() == 3) ? 0 : this.storiesList.getCount());
        }

        @Override
        public final int getItemViewType(int i) {
            return 19;
        }

        @Override
        public final String getLetter(int i) {
            MessageObject messageObject;
            TL_stories.StoryItem storyItem;
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList == null || i < 0 || i >= storiesList.messageObjects.size() || (messageObject = (MessageObject) this.storiesList.messageObjects.get(i)) == null || (storyItem = messageObject.storyItem) == null) {
                return null;
            }
            return LocaleController.formatYearMont(storyItem.date, true);
        }

        @Override
        public final int getTotalItemsCount() {
            return getItemCount();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public void notifyDataSetChanged() {
            if (this.storiesList != null) {
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (sharedMediaLayout.isBot()) {
                    ArrayList arrayList = this.uploadingStories;
                    arrayList.clear();
                    StoriesController storiesController = MessagesController.getInstance(this.storiesList.currentAccount).getStoriesController();
                    ArrayList arrayList2 = (ArrayList) storiesController.uploadingStoriesByDialogId.get(sharedMediaLayout.dialog_id);
                    if (arrayList2 != null) {
                        arrayList.addAll(arrayList2);
                    }
                }
            }
            this.mObservable.notifyChanged();
            checkColumns();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (this.storiesList != null && viewHolder.mItemViewType == 19) {
                View view = viewHolder.itemView;
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.isStory = true;
                    ArrayList arrayList = this.uploadingStories;
                    if (i >= 0 && i < arrayList.size()) {
                        StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) arrayList.get(i);
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        if (uploadingStory.sharedMessageObject == null) {
                            TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                            long j = uploadingStory.random_id;
                            int i2 = (int) (j ^ (j >>> 32));
                            tL_storyItem.messageId = i2;
                            tL_storyItem.id = i2;
                            tL_storyItem.attachPath = uploadingStory.firstFramePath;
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.storiesList.currentAccount, tL_storyItem);
                            uploadingStory.sharedMessageObject = anonymousClass2;
                            anonymousClass2.uploadingStory = uploadingStory;
                        }
                        sharedPhotoVideoCell2.setMessageObject(uploadingStory.sharedMessageObject, columnsCount(), false);
                        sharedPhotoVideoCell2.isStory = true;
                        sharedPhotoVideoCell2.setReorder(false);
                        sharedPhotoVideoCell2.setChecked(false, false);
                        return;
                    }
                    int size = i - arrayList.size();
                    if (size < 0 || size >= this.storiesList.messageObjects.size()) {
                        sharedPhotoVideoCell2.isStoryPinned = false;
                        sharedPhotoVideoCell2.setMessageObject(null, columnsCount(), false);
                        sharedPhotoVideoCell2.isStory = true;
                        return;
                    }
                    MessageObject messageObject = (MessageObject) this.storiesList.messageObjects.get(size);
                    sharedPhotoVideoCell2.isStoryPinned = messageObject != null && this.storiesList.isPinned(messageObject.getId());
                    SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                    sharedPhotoVideoCell2.setReorder(sharedMediaLayout.isBot() || sharedPhotoVideoCell2.isStoryPinned);
                    sharedPhotoVideoCell2.isSearchingHashtag = sharedMediaLayout.isSearchingStories();
                    sharedPhotoVideoCell2.setMessageObject(messageObject, columnsCount(), false);
                    if (!sharedMediaLayout.isActionModeShowed || messageObject == null) {
                        sharedPhotoVideoCell2.setChecked(false, false);
                    } else {
                        sharedPhotoVideoCell2.setChecked(sharedMediaLayout.selectedFiles[(messageObject.getDialogId() > sharedMediaLayout.dialog_id ? 1 : (messageObject.getDialogId() == sharedMediaLayout.dialog_id ? 0 : -1)) == 0 ? (char) 0 : (char) 1].indexOfKey(messageObject.getId()) >= 0, true);
                    }
                    sharedPhotoVideoCell2.setReordering(this.inAlbumStoriesReorder, false);
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            RecyclerView.ViewHolder viewHolderOnCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            View view = viewHolderOnCreateViewHolder.itemView;
            if (view instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) view).isStory = true;
            }
            return viewHolderOnCreateViewHolder;
        }

        @Override
        public final void onFastScrollSingleTap() {
            SharedMediaLayout.this.showMediaCalendar(this.isArchive ? 9 : 8, true);
        }

        public StoriesAdapter(Context context, int i, boolean z) {
            TLRPC.User user;
            super(context);
            this.uploadingStories = new ArrayList();
            this.lastPinnedIds = new ArrayList();
            this.isArchive = z;
            this.albumId = i;
            int currentAccount = SharedMediaLayout.this.profileActivity.getCurrentAccount();
            boolean zIsEmpty = TextUtils.isEmpty(SharedMediaLayout.this.getStoriesHashtag());
            BaseFragment baseFragment = SharedMediaLayout.this.profileActivity;
            if (!zIsEmpty) {
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
                long j = SharedMediaLayout.this.dialog_id;
                boolean z2 = j > 0 && (user = MessagesController.getInstance(currentAccount).getUser(Long.valueOf(j))) != null && user.bot;
                if (i > 0) {
                    this.storiesList = baseFragment.getMessagesController().getStoriesController().getStoriesList(SharedMediaLayout.this.dialog_id, 0, i, true);
                } else {
                    this.storiesList = baseFragment.getMessagesController().getStoriesController().getStoriesList(SharedMediaLayout.this.dialog_id, z2 ? 4 : z ? 1 : 0, -1, true);
                }
            } else {
                this.storiesList = null;
            }
            StoriesController.StoriesList storiesList = this.storiesList;
            if (storiesList != null) {
                int i2 = storiesList.maxLinkId;
                storiesList.maxLinkId = i2 + 1;
                storiesList.links.add(Integer.valueOf(i2));
                StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18 = storiesList.destroyRunnable;
                if (stickersActivity$$ExternalSyntheticLambda18 != null) {
                    AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
                }
                this.id = i2;
                this.poller = new ViewsForPeerStoriesRequester(baseFragment.getMessagesController().getStoriesController(), SharedMediaLayout.this.dialog_id, this.storiesList.currentAccount) {
                    @Override
                    public final void getStoryIds(ArrayList arrayList) {
                        AnonymousClass19 anonymousClass19;
                        MessageObject messageObject;
                        int i3 = 0;
                        while (true) {
                            StoriesAdapter storiesAdapter = StoriesAdapter.this;
                            MediaPage[] mediaPageArr = SharedMediaLayout.this.mediaPages;
                            if (i3 >= mediaPageArr.length) {
                                anonymousClass19 = null;
                                break;
                            }
                            AnonymousClass19 anonymousClass110 = mediaPageArr[i3].listView;
                            if (anonymousClass110 != null && anonymousClass110.getAdapter() == storiesAdapter) {
                                anonymousClass19 = SharedMediaLayout.this.mediaPages[i3].listView;
                                break;
                            }
                            i3++;
                        }
                        if (anonymousClass19 != null) {
                            for (int i4 = 0; i4 < anonymousClass19.getChildCount(); i4++) {
                                View childAt = anonymousClass19.getChildAt(i4);
                                if ((childAt instanceof SharedPhotoVideoCell2) && (messageObject = ((SharedPhotoVideoCell2) childAt).getMessageObject()) != null && messageObject.isStory()) {
                                    arrayList.add(Integer.valueOf(messageObject.storyItem.id));
                                }
                            }
                        }
                    }

                    @Override
                    public final boolean updateStories(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
                        TL_stories.StoryItem storyItem;
                        StoriesController.StoriesList storiesList2 = StoriesAdapter.this.storiesList;
                        ArrayList<TL_stories.StoryViews> arrayList2 = tL_stories_storyViews.views;
                        storiesList2.getClass();
                        if (arrayList != null && arrayList2 != null) {
                            boolean z3 = false;
                            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                                Integer num = (Integer) arrayList.get(i3);
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
    }

    public final class StoryAlbumData {
        public final AnonymousClass1 adapter;
        public final StoriesAdapter adapterSupport;
        public final int albumId;
        public final int tabType;

        public final class AnonymousClass1 extends StoriesAdapter {
            public AnonymousClass1(Context context, int i) {
                super(context, i, false);
            }

            @Override
            public final void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                StoryAlbumData storyAlbumData = StoryAlbumData.this;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                int[] iArr = SharedMediaLayout.supportedFastScrollTypes;
                MediaPage mediaPage = sharedMediaLayout.getMediaPage(storyAlbumData.tabType);
                if (mediaPage != null && mediaPage.animationSupportingListView.getVisibility() == 0) {
                    storyAlbumData.adapterSupport.notifyDataSetChanged();
                }
                if (mediaPage != null) {
                    AnonymousClass29 anonymousClass29 = mediaPage.emptyView;
                    StoriesController.StoriesList storiesList = this.storiesList;
                    anonymousClass29.showProgress(storiesList != null && (storiesList.isLoading() || (SharedMediaLayout.this.profileActivity.getConnectionsManager().getConnectionState() == 3 && this.storiesList.getCount() > 0)), true);
                }
            }
        }

        public StoryAlbumData(Context context, int i) {
            this.albumId = i;
            int i2 = SharedMediaLayout.this.tabIndexCounter;
            SharedMediaLayout.this.tabIndexCounter = i2 + 1;
            this.tabType = (i2 & 65535) | 65536;
            this.adapter = new AnonymousClass1(context, i);
            this.adapterSupport = SharedMediaLayout.this.new StoriesAdapter(context, i, false);
        }
    }

    public SharedMediaLayout(Context context, long j, SharedMediaPreloader sharedMediaPreloader, int i, ArrayList arrayList, TLRPC.ChatFull chatFull, TLRPC.UserFull userFull, int i2, int i3, BaseFragment baseFragment, Delegate delegate, int i4, Theme.ResourcesProvider resourcesProvider, BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        Theme.ResourcesProvider resourcesProvider2;
        SharedMediaLayout sharedMediaLayout;
        int animatedHeightWithPadding;
        ?? r1;
        int top;
        int iFindFirstVisibleItemPosition;
        int i5;
        MediaPage[] mediaPageArr;
        AnonymousClass15 anonymousClass15;
        boolean zCustomTabs;
        ?? r2;
        AnonymousClass15 anonymousClass16;
        long j2;
        int i6;
        int i7;
        final ?? r3;
        final ?? r14;
        MediaPage mediaPage;
        AnonymousClass17 anonymousClass17;
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
        sharedMediaLayout2.cellCache = new ArrayList(10);
        sharedMediaLayout2.cache = new ArrayList(10);
        sharedMediaLayout2.audioCellCache = new ArrayList(10);
        sharedMediaLayout2.audioCache = new ArrayList(10);
        sharedMediaLayout2.hideFloatingDateRunnable = new SharedMediaLayout$$ExternalSyntheticLambda9(sharedMediaLayout2, 0);
        sharedMediaLayout2.actionModeViews = new ArrayList();
        sharedMediaLayout2.backgroundPaint = new Paint();
        sharedMediaLayout2.selectedFiles = new SparseArray[]{new SparseArray(), new SparseArray()};
        sharedMediaLayout2.allowStoriesSingleColumn = false;
        sharedMediaLayout2.storiesColumnsCountSet = false;
        sharedMediaLayout2.mediaColumnsCount = new int[]{3, 3};
        sharedMediaLayout2.provider = new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public final PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i13, boolean z, boolean z2) {
                SharedMediaLayout sharedMediaLayout3;
                MediaPage[] mediaPageArr2;
                MediaPage mediaPage2;
                int i14;
                ImageReceiver imageReceiver;
                SharedLinkCell sharedLinkCell;
                MessageObject message;
                ImageReceiver linkImageView;
                ImageReceiver imageReceiver2;
                PhotoViewer.PlaceProviderObject placeProviderObject;
                AnonymousClass30 anonymousClass30;
                View pinnedHeader;
                int iDp;
                boolean z3;
                int i15;
                int height;
                if (messageObject != null && ((i14 = (mediaPage2 = (mediaPageArr2 = (sharedMediaLayout3 = SharedMediaLayout.this).mediaPages)[0]).selectedType) == 0 || i14 == 1 || i14 == 3 || i14 == 5)) {
                    AnonymousClass19 anonymousClass19 = mediaPage2.listView;
                    int childCount = anonymousClass19.getChildCount();
                    int i16 = -1;
                    int i17 = -1;
                    for (int i18 = 0; i18 < childCount; i18++) {
                        View childAt = anonymousClass19.getChildAt(i18);
                        int measuredHeight = mediaPageArr2[0].listView.getMeasuredHeight();
                        View view = (View) sharedMediaLayout3.getParent();
                        if (view != null) {
                            imageReceiver = null;
                            if (sharedMediaLayout3.getY() + sharedMediaLayout3.getMeasuredHeight() > view.getMeasuredHeight()) {
                                measuredHeight -= sharedMediaLayout3.getBottom() - view.getMeasuredHeight();
                            }
                        } else {
                            imageReceiver = null;
                        }
                        if (childAt.getTop() < measuredHeight) {
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                            if (childAdapterPosition < i16 || i16 == -1) {
                                i16 = childAdapterPosition;
                            }
                            if (childAdapterPosition > i17 || i17 == -1) {
                                i17 = childAdapterPosition;
                            }
                            int[] iArr = new int[2];
                            if (childAt instanceof SharedPhotoVideoCell2) {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt;
                                MessageObject messageObject2 = sharedPhotoVideoCell2.getMessageObject();
                                if (messageObject2 != null) {
                                    if (messageObject2.getId() == messageObject.getId()) {
                                        sharedPhotoVideoCell2.getLocationInWindow(iArr);
                                        int i19 = iArr[0];
                                        imageReceiver2 = sharedPhotoVideoCell2.imageReceiver;
                                        iArr[0] = Math.round(imageReceiver2.getImageX()) + i19;
                                        iArr[1] = Math.round(imageReceiver2.getImageY()) + iArr[1];
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                    }
                                    if (imageReceiver2 != null) {
                                        placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                        placeProviderObject.viewX = iArr[0];
                                        placeProviderObject.viewY = iArr[1];
                                        placeProviderObject.parentView = anonymousClass19;
                                        MediaPage mediaPage3 = mediaPageArr2[0];
                                        placeProviderObject.animatingImageView = mediaPage3.animatingImageView;
                                        mediaPage3.listView.getLocationInWindow(iArr);
                                        placeProviderObject.animatingImageViewYOffset = -iArr[1];
                                        placeProviderObject.imageReceiver = imageReceiver2;
                                        placeProviderObject.allowTakeAnimation = true;
                                        placeProviderObject.radius = imageReceiver2.getRoundRadius(true);
                                        placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                                        placeProviderObject.parentView.getLocationInWindow(iArr);
                                        placeProviderObject.clipTopAddition = 0;
                                        placeProviderObject.starOffset = sharedMediaLayout3.sharedMediaData[0].startOffset;
                                        anonymousClass30 = sharedMediaLayout3.fragmentContextView;
                                        if (anonymousClass30 != null && anonymousClass30.getVisibility() == 0) {
                                            placeProviderObject.clipTopAddition = AndroidUtilities.dp(36.0f) + placeProviderObject.clipTopAddition;
                                        }
                                        if (PhotoViewer.isShowingImage(messageObject) && (pinnedHeader = anonymousClass19.getPinnedHeader()) != null) {
                                            if (anonymousClass30 == null && anonymousClass30.getVisibility() == 0) {
                                                iDp = anonymousClass30.getHeight() - AndroidUtilities.dp(2.5f);
                                            } else {
                                                iDp = 0;
                                            }
                                            z3 = childAt instanceof SharedDocumentCell;
                                            if (z3) {
                                                iDp += AndroidUtilities.dp(8.0f);
                                            }
                                            i15 = iDp - placeProviderObject.viewY;
                                            if (i15 > childAt.getHeight()) {
                                                anonymousClass19.scrollBy(0, -(pinnedHeader.getHeight() + i15));
                                                return placeProviderObject;
                                            }
                                            height = placeProviderObject.viewY - anonymousClass19.getHeight();
                                            if (z3) {
                                                height -= AndroidUtilities.dp(8.0f);
                                            }
                                            if (height >= 0) {
                                                anonymousClass19.scrollBy(0, childAt.getHeight() + height);
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
                                        imageReceiver2 = linkImageView;
                                    } else {
                                        imageReceiver2 = imageReceiver;
                                    }
                                } else if (childAt instanceof ContextLinkCell) {
                                    ContextLinkCell contextLinkCell = (ContextLinkCell) childAt;
                                    MessageObject messageObject3 = (MessageObject) contextLinkCell.getParentObject();
                                    if (messageObject3 == null || messageObject3.getId() != messageObject.getId()) {
                                        imageReceiver2 = imageReceiver;
                                    } else {
                                        linkImageView = contextLinkCell.getPhotoImage();
                                        contextLinkCell.getLocationInWindow(iArr);
                                        imageReceiver2 = linkImageView;
                                    }
                                } else if ((childAt instanceof SharedLinkCell) && (message = (sharedLinkCell = (SharedLinkCell) childAt).getMessage()) != null && message.getId() == messageObject.getId()) {
                                    linkImageView = sharedLinkCell.getLinkImageView();
                                    sharedLinkCell.getLocationInWindow(iArr);
                                    imageReceiver2 = linkImageView;
                                } else {
                                    imageReceiver2 = imageReceiver;
                                }
                                if (imageReceiver2 != null) {
                                    placeProviderObject = new PhotoViewer.PlaceProviderObject();
                                    placeProviderObject.viewX = iArr[0];
                                    placeProviderObject.viewY = iArr[1];
                                    placeProviderObject.parentView = anonymousClass19;
                                    MediaPage mediaPage4 = mediaPageArr2[0];
                                    placeProviderObject.animatingImageView = mediaPage4.animatingImageView;
                                    mediaPage4.listView.getLocationInWindow(iArr);
                                    placeProviderObject.animatingImageViewYOffset = -iArr[1];
                                    placeProviderObject.imageReceiver = imageReceiver2;
                                    placeProviderObject.allowTakeAnimation = true;
                                    placeProviderObject.radius = imageReceiver2.getRoundRadius(true);
                                    placeProviderObject.thumb = placeProviderObject.imageReceiver.getBitmapSafe();
                                    placeProviderObject.parentView.getLocationInWindow(iArr);
                                    placeProviderObject.clipTopAddition = 0;
                                    placeProviderObject.starOffset = sharedMediaLayout3.sharedMediaData[0].startOffset;
                                    anonymousClass30 = sharedMediaLayout3.fragmentContextView;
                                    if (anonymousClass30 != null) {
                                        placeProviderObject.clipTopAddition = AndroidUtilities.dp(36.0f) + placeProviderObject.clipTopAddition;
                                    }
                                    if (PhotoViewer.isShowingImage(messageObject)) {
                                        if (anonymousClass30 == null) {
                                            iDp = 0;
                                        } else {
                                            iDp = 0;
                                        }
                                        z3 = childAt instanceof SharedDocumentCell;
                                        if (z3) {
                                            iDp += AndroidUtilities.dp(8.0f);
                                        }
                                        i15 = iDp - placeProviderObject.viewY;
                                        if (i15 > childAt.getHeight()) {
                                            anonymousClass19.scrollBy(0, -(pinnedHeader.getHeight() + i15));
                                            return placeProviderObject;
                                        }
                                        height = placeProviderObject.viewY - anonymousClass19.getHeight();
                                        if (z3) {
                                            height -= AndroidUtilities.dp(8.0f);
                                        }
                                        if (height >= 0) {
                                            anonymousClass19.scrollBy(0, childAt.getHeight() + height);
                                        }
                                    }
                                    return placeProviderObject;
                                }
                            }
                        }
                    }
                    MediaPage mediaPage5 = mediaPageArr2[0];
                    if (mediaPage5.selectedType != 0 || i16 < 0 || i17 < 0) {
                        return null;
                    }
                    int i20 = SharedMediaLayout.this.sharedMediaData[0].startOffset + i13;
                    Delegate delegate2 = sharedMediaLayout3.delegate;
                    if (i20 <= i16) {
                        AnonymousClass17 anonymousClass18 = mediaPage5.layoutManager;
                        anonymousClass18.scrollToPositionWithOffset(i20, 0, anonymousClass18.mShouldReverseLayout);
                        delegate2.scrollToSharedMedia();
                        return null;
                    }
                    if (i20 < i17 || i17 < 0) {
                        return null;
                    }
                    mediaPage5.layoutManager.scrollToPositionWithOffset(i20, 0, true);
                    delegate2.scrollToSharedMedia();
                    return null;
                }
                return null;
            }
        };
        sharedMediaLayout2.shiftDp = -5.0f;
        sharedMediaLayout2.sharedMediaData = new SharedMediaData[9];
        sharedMediaLayout2.notificationsLocker = new AnimationNotificationsLocker();
        sharedMediaLayout2.messageAlphaEnter = new SparseArray();
        sharedMediaLayout2.firstTab = -1;
        sharedMediaLayout2.sharedLinkCellDelegate = sharedMediaLayout2.new AnonymousClass49();
        sharedMediaLayout2.subTabsVisibilityFactor = 0.0f;
        sharedMediaLayout2.storyAlbumsById = new HashMap();
        sharedMediaLayout2.storyAlbumsByTabType = new HashMap();
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(sharedMediaLayout2.getThemedColor$13(Theme.key_windowBackgroundWhite));
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = blurredBackgroundDrawableViewFactory == null ? new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor) : blurredBackgroundDrawableViewFactory;
        sharedMediaLayout2.viewType = i4;
        sharedMediaLayout2.resourcesProvider = resourcesProvider;
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        sharedMediaLayout2.globalGradientView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
        TLRPC.User user = baseFragment.getMessagesController().getUser(Long.valueOf(j));
        sharedMediaLayout2.sharedMediaPreloader = sharedMediaPreloader;
        sharedMediaLayout2.delegate = delegate;
        int[] iArr = sharedMediaPreloader.lastMediaCount;
        ?? r59 = blurredBackgroundDrawableViewFactory2;
        long j3 = sharedMediaPreloader.topicId;
        sharedMediaLayout2.topicId = j3;
        int[] iArr2 = {iArr[0], iArr[1], iArr[2], iArr[3], iArr[4], iArr[5], j3 == 0 ? i : 0, iArr[7], iArr[8]};
        sharedMediaLayout2.hasMedia = iArr2;
        TLRPC.ProfileTab profileTab = userFull != null ? userFull.main_tab : chatFull2 != null ? chatFull2.main_tab : null;
        if (i2 == 14 || i2 == 10 || i2 == 11 || i2 == 6) {
            sharedMediaLayout2.initialTab = i2;
        } else if (user != null && user.bot && user.bot_has_main_app && user.bot_can_edit) {
            sharedMediaLayout2.initialTab = 13;
        } else if (userFull != null && (botInfo = userFull.bot_info) != null && botInfo.has_preview_medias) {
            sharedMediaLayout2.initialTab = 8;
        } else if ((profileTab instanceof TLRPC.TL_profileTabPosts) && ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || sharedMediaLayout2.isStoriesView()))) {
            sharedMediaLayout2.initialTab = 8;
        } else if (!(profileTab instanceof TLRPC.TL_profileTabGifts) || ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0))) {
            if (profileTab instanceof TLRPC.TL_profileTabFiles) {
                int i13 = iArr2[1];
                i8 = -1;
                if (i13 == -1 || i13 > 0) {
                    sharedMediaLayout2.initialTab = 1;
                }
            } else {
                i8 = -1;
            }
            if ((profileTab instanceof TLRPC.TL_profileTabGifs) && ((i12 = iArr2[5]) == i8 || i12 > 0)) {
                sharedMediaLayout2.initialTab = 5;
            } else if ((profileTab instanceof TLRPC.TL_profileTabLinks) && ((i11 = iArr2[3]) == i8 || i11 > 0)) {
                sharedMediaLayout2.initialTab = 3;
            } else if ((profileTab instanceof TLRPC.TL_profileTabMusic) && ((i10 = iArr2[4]) == i8 || i10 > 0)) {
                sharedMediaLayout2.initialTab = 4;
            } else if ((profileTab instanceof TLRPC.TL_profileTabVoice) && ((i9 = iArr2[2]) == i8 || i9 > 0)) {
                sharedMediaLayout2.initialTab = 2;
            } else if ((userFull != null && userFull.stories_pinned_available) || ((chatFull2 != null && chatFull2.stories_pinned_available) || sharedMediaLayout2.isStoriesView())) {
                sharedMediaLayout2.initialTab = sharedMediaLayout2.getInitialTab();
            } else if ((userFull == null || userFull.stargifts_count <= 0) && (chatFull2 == null || chatFull2.stargifts_count <= 0)) {
                int i14 = -1;
                if (i2 == -1 || j3 != 0) {
                    int i15 = 0;
                    while (true) {
                        int[] iArr3 = sharedMediaLayout2.hasMedia;
                        if (i15 >= iArr3.length) {
                            break;
                        }
                        int i16 = iArr3[i15];
                        if (i16 == i14 || i16 > 0) {
                            sharedMediaLayout2.initialTab = i15;
                            break;
                        } else {
                            i15++;
                            i14 = -1;
                        }
                    }
                } else {
                    sharedMediaLayout2.initialTab = i2;
                }
            } else {
                sharedMediaLayout2.initialTab = 14;
            }
        } else {
            sharedMediaLayout2.initialTab = 14;
        }
        sharedMediaLayout2.onTabProgress(i2);
        sharedMediaLayout2.info = chatFull2;
        sharedMediaLayout2.userInfo = userFull;
        if (chatFull2 != null) {
            sharedMediaLayout2.mergeDialogId = -chatFull2.migrated_from_chat_id;
        }
        sharedMediaLayout2.dialog_id = j;
        int i17 = 0;
        while (true) {
            SharedMediaData[] sharedMediaDataArr = sharedMediaLayout2.sharedMediaData;
            if (i17 >= sharedMediaDataArr.length) {
                break;
            }
            sharedMediaDataArr[i17] = new SharedMediaData();
            sharedMediaLayout2.sharedMediaData[i17].max_id[0] = DialogObject.isEncryptedDialog(sharedMediaLayout2.dialog_id) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            sharedMediaLayout2.sharedMediaData[i17].max_id[1] = Integer.MAX_VALUE;
            sharedMediaLayout2.fillMediaData(i17);
            if (sharedMediaLayout2.mergeDialogId != 0 && sharedMediaLayout2.info != null && sharedMediaLayout2.sharedMediaData[i17].messagesDict[1].size() == 0) {
                SharedMediaData sharedMediaData = sharedMediaLayout2.sharedMediaData[i17];
                sharedMediaData.max_id[1] = sharedMediaLayout2.info.migrated_from_max_id;
                sharedMediaData.endReached[1] = false;
            }
            i17++;
        }
        sharedMediaLayout2.profileActivity = baseFragment;
        sharedMediaLayout2.actionBar = baseFragment.getActionBar();
        sharedMediaLayout2.mediaColumnsCount[0] = sharedMediaLayout2.overrideColumnsCount() <= 0 ? SharedConfig.mediaColumnsCount : sharedMediaLayout2.overrideColumnsCount();
        sharedMediaLayout2.mediaColumnsCount[1] = sharedMediaLayout2.overrideColumnsCount() <= 0 ? SharedConfig.storiesColumnsCount : sharedMediaLayout2.overrideColumnsCount();
        sharedMediaLayout2.observersGroup = baseFragment.getNotificationCenter().createObserversGroup(sharedMediaLayout2).add(NotificationCenter.mediaDidLoad).add(NotificationCenter.messagesDeleted).add(NotificationCenter.didReceiveNewMessages).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messagePlayingDidReset).add(NotificationCenter.messagePlayingPlayStateChanged).add(NotificationCenter.messagePlayingDidStart).add(NotificationCenter.storiesListUpdated).add(NotificationCenter.storiesUpdated).add(NotificationCenter.channelRecommendationsLoaded).add(NotificationCenter.savedMessagesDialogsUpdate).add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.starUserGiftsLoaded).add(NotificationCenter.updatedChatRanks).add(NotificationCenter.didUpdatePollResults);
        for (int i18 = 0; i18 < 10; i18++) {
            if (i2 == 4) {
                SharedAudioCell sharedAudioCell = new SharedAudioCell(context) {
                    @Override
                    public final boolean needPlayMessage(MessageObject messageObject) {
                        boolean zIsVoice = messageObject.isVoice();
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        if (zIsVoice || messageObject.isRoundVideo()) {
                            boolean zPlayMessage = MediaController.getInstance().playMessage(messageObject);
                            MediaController.getInstance().setVoiceMessagesPlaylist(zPlayMessage ? sharedMediaLayout3.sharedMediaData[4].messages : null, false);
                            return zPlayMessage;
                        }
                        if (messageObject.isMusic()) {
                            return MediaController.getInstance().setPlaylist(sharedMediaLayout3.sharedMediaData[4].messages, messageObject, sharedMediaLayout3.mergeDialogId);
                        }
                        return false;
                    }
                };
                sharedAudioCell.radialProgress.initMiniIcons();
                sharedMediaLayout2.audioCellCache.add(sharedAudioCell);
            }
        }
        sharedMediaLayout2.maximumVelocity = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        sharedMediaLayout2.searching = false;
        sharedMediaLayout2.searchingReaction = null;
        AnonymousClass31 anonymousClass31 = sharedMediaLayout2.searchTagsList;
        if (anonymousClass31 != null) {
            anonymousClass31.show(false);
        }
        sharedMediaLayout2.searchWas = false;
        Drawable drawable = context.getResources().getDrawable(R.drawable.photos_header_shadow);
        sharedMediaLayout2.pinnedHeaderShadowDrawable = drawable;
        drawable.setColorFilter(new PorterDuffColorFilter(sharedMediaLayout2.getThemedColor$13(Theme.key_windowBackgroundGrayShadow), PorterDuff.Mode.MULTIPLY));
        AnonymousClass39 anonymousClass39 = sharedMediaLayout2.scrollSlidingTextTabStrip;
        int currentTabId = anonymousClass39 != null ? anonymousClass39.getCurrentTabId() : i2;
        ?? r0 = new ScrollSlidingTextTabStripInner(context, sharedMediaLayout2.resourcesProvider) {
            @Override
            public final int processColor(int i19) {
                return SharedMediaLayout.this.processColor(i19);
            }
        };
        int i19 = sharedMediaLayout2.initialTab;
        if (i19 != -1) {
            r0.setInitialTabId(i19);
            sharedMediaLayout2.initialTab = -1;
        }
        r0.animationDuration = 320L;
        int i20 = Theme.key_profile_tabSelectedText;
        int i21 = Theme.key_profile_tabText;
        r0.activeTextColorKey = i20;
        r0.unactiveTextColorKey = i21;
        r0.updateColors$1();
        r0.setUseMinimalWidth(true);
        r0.setDelegate(sharedMediaLayout2.new AnonymousClass40());
        sharedMediaLayout2.scrollSlidingTextTabStrip = r0;
        for (int i22 = 1; i22 >= 0; i22--) {
            sharedMediaLayout2.selectedFiles[i22].clear();
        }
        sharedMediaLayout2.cantDeleteMessagesCount = 0;
        sharedMediaLayout2.actionModeViews.clear();
        SavedDialogsAdapter savedDialogsAdapter = sharedMediaLayout2.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.selectedDialogs.clear();
        }
        if (!(sharedMediaLayout2 instanceof HashtagActivity.AnonymousClass5)) {
            ActionBarMenu actionBarMenuCreateMenu = sharedMediaLayout2.actionBar.createMenu();
            actionBarMenuCreateMenu.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override
                public final void onLayoutChange(View view, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30) {
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    ActionBarMenuItem actionBarMenuItem = sharedMediaLayout3.searchItem;
                    if (actionBarMenuItem == null) {
                        return;
                    }
                    sharedMediaLayout3.searchItem.setTranslationX(((View) actionBarMenuItem.getParent()).getMeasuredWidth() - sharedMediaLayout3.searchItem.getRight());
                }
            });
            if (sharedMediaLayout2.dialog_id == sharedMediaLayout2.profileActivity.getUserConfig().getClientUserId() && (sharedMediaLayout2.profileActivity instanceof MediaActivity) && sharedMediaLayout2.canShowSearchItem()) {
                sharedMediaLayout2.searchItemIcon = actionBarMenuCreateMenu.addItem(11, R.drawable.outline_header_search);
            }
            ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, 0);
            actionBarMenuItemAddItem.setIsSearchField$1();
            actionBarMenuItemAddItem.listener = sharedMediaLayout2.new AnonymousClass4();
            sharedMediaLayout2.searchItem = actionBarMenuItemAddItem;
            actionBarMenuItemAddItem.setTranslationY(AndroidUtilities.dp(10.0f));
            AnonymousClass31 anonymousClass32 = sharedMediaLayout2.searchTagsList;
            actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString((anonymousClass32 != null && anonymousClass32.hasFilters() && sharedMediaLayout2.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
            actionBarMenuItemAddItem.setContentDescription(LocaleController.getString("Search", R.string.Search));
            actionBarMenuItemAddItem.setVisibility(sharedMediaLayout2.isStoriesView() ? 8 : 4);
        }
        ImageView imageView = new ImageView(context);
        sharedMediaLayout2.photoVideoOptionsItem = imageView;
        imageView.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        imageView.setTranslationY(AndroidUtilities.dp(10.0f));
        imageView.setVisibility(4);
        if (!sharedMediaLayout2.isArchivedOnlyStoriesView() && !sharedMediaLayout2.isSearchingStories()) {
            sharedMediaLayout2.actionBar.addView(imageView, LayoutHelper.createFrame(48, 56, 85));
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            sharedMediaLayout2.optionsSearchImageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            rLottieImageView.setAnimation(R.raw.options_to_search, 24, 24);
            rLottieImageView.getAnimatedDrawable().speedMultiply *= 2.0f;
            rLottieImageView.getAnimatedDrawable().playInDirectionOfCustomEndFrame = true;
            rLottieImageView.setColorFilter(new PorterDuffColorFilter(sharedMediaLayout2.getThemedColor$13(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.SRC_IN));
            rLottieImageView.setVisibility(8);
            sharedMediaLayout2.actionBar.addView(rLottieImageView, LayoutHelper.createFrame(48, 56, 85));
        }
        Context context2 = context;
        imageView.setOnClickListener(sharedMediaLayout2.new AnonymousClass5(j, resourcesProvider, context));
        ActionBarMenuItem actionBarMenuItem = sharedMediaLayout2.searchItem;
        if (actionBarMenuItem != null) {
            EditTextBoldCursor searchField = actionBarMenuItem.getSearchField();
            int i23 = Theme.key_windowBackgroundWhiteBlackText;
            searchField.setTextColor(sharedMediaLayout2.getThemedColor$13(i23));
            searchField.setHintTextColor(sharedMediaLayout2.getThemedColor$13(Theme.key_player_time));
            searchField.setCursorColor(sharedMediaLayout2.getThemedColor$13(i23));
        }
        sharedMediaLayout2.searchItemState = 0;
        BaseFragment baseFragment2 = sharedMediaLayout2.profileActivity;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = (baseFragment2 == null || !(baseFragment2.getFragmentView() instanceof SizeNotifierFrameLayout)) ? null : (SizeNotifierFrameLayout) sharedMediaLayout2.profileActivity.getFragmentView();
        ?? blurredLinearLayout = new BlurredLinearLayout(context2, sizeNotifierFrameLayout);
        sharedMediaLayout2.actionModeLayout = blurredLinearLayout;
        blurredLinearLayout.setBackgroundColor(sharedMediaLayout2.getThemedColor$13(Theme.key_windowBackgroundGray));
        blurredLinearLayout.setAlpha(0.0f);
        blurredLinearLayout.setClickable(true);
        blurredLinearLayout.setVisibility(4);
        ImageView imageView2 = new ImageView(context2);
        sharedMediaLayout2.closeButton = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        BackDrawable backDrawable = new BackDrawable(true);
        sharedMediaLayout2.backDrawable = backDrawable;
        imageView2.setImageDrawable(backDrawable);
        int i24 = Theme.key_actionBarActionModeDefaultIcon;
        backDrawable.color = sharedMediaLayout2.getThemedColor$13(i24);
        backDrawable.invalidateSelf();
        int i25 = Theme.key_actionBarActionModeDefaultSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(sharedMediaLayout2.getThemedColor$13(i25), 1));
        imageView2.setContentDescription(LocaleController.getString("Close", R.string.Close));
        blurredLinearLayout.addView(imageView2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        sharedMediaLayout2.actionModeViews.add(imageView2);
        imageView2.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 1));
        NumberTextView numberTextView = new NumberTextView(context2);
        sharedMediaLayout2.selectedMessagesCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        numberTextView.setTypeface(AndroidUtilities.bold());
        numberTextView.setTextColor(sharedMediaLayout2.getThemedColor$13(i24));
        blurredLinearLayout.addView(numberTextView, LayoutHelper.createLinear(1.0f, 0, -1, 18, 0, 0));
        sharedMediaLayout2.actionModeViews.add(numberTextView);
        if (!DialogObject.isEncryptedDialog(sharedMediaLayout2.dialog_id)) {
            if (!sharedMediaLayout2.isStoriesView()) {
                ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context2, sharedMediaLayout2.getThemedColor$13(i25), sharedMediaLayout2.getThemedColor$13(i24), false);
                sharedMediaLayout2.gotoItem = actionBarMenuItem2;
                actionBarMenuItem2.setIcon(R.drawable.msg_message);
                actionBarMenuItem2.setContentDescription(LocaleController.getString(R.string.AccDescrGoToMessage));
                actionBarMenuItem2.setDuplicateParentStateEnabled(false);
                blurredLinearLayout.addView(actionBarMenuItem2, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                sharedMediaLayout2.actionModeViews.add(actionBarMenuItem2);
                actionBarMenuItem2.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 2));
                ActionBarMenuItem actionBarMenuItem3 = new ActionBarMenuItem(context2, sharedMediaLayout2.getThemedColor$13(i25), sharedMediaLayout2.getThemedColor$13(i24), false);
                sharedMediaLayout2.forwardItem = actionBarMenuItem3;
                actionBarMenuItem3.setIcon(R.drawable.msg_forward);
                actionBarMenuItem3.setContentDescription(LocaleController.getString(R.string.Forward));
                actionBarMenuItem3.setDuplicateParentStateEnabled(false);
                blurredLinearLayout.addView(actionBarMenuItem3, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
                sharedMediaLayout2.actionModeViews.add(actionBarMenuItem3);
                actionBarMenuItem3.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 3));
            }
            ActionBarMenuItem actionBarMenuItem4 = new ActionBarMenuItem(context2, sharedMediaLayout2.getThemedColor$13(i25), sharedMediaLayout2.getThemedColor$13(i24), false);
            sharedMediaLayout2.pinItem = actionBarMenuItem4;
            actionBarMenuItem4.setIcon(R.drawable.msg_pin);
            actionBarMenuItem4.setContentDescription(LocaleController.getString(R.string.PinMessage));
            actionBarMenuItem4.setDuplicateParentStateEnabled(false);
            actionBarMenuItem4.setVisibility(8);
            blurredLinearLayout.addView(actionBarMenuItem4, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            sharedMediaLayout2.actionModeViews.add(actionBarMenuItem4);
            actionBarMenuItem4.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 4));
            ActionBarMenuItem actionBarMenuItem5 = new ActionBarMenuItem(context2, sharedMediaLayout2.getThemedColor$13(i25), sharedMediaLayout2.getThemedColor$13(i24), false);
            sharedMediaLayout2.unpinItem = actionBarMenuItem5;
            actionBarMenuItem5.setIcon(R.drawable.msg_unpin);
            actionBarMenuItem5.setContentDescription(LocaleController.getString(R.string.UnpinMessage));
            actionBarMenuItem5.setDuplicateParentStateEnabled(false);
            actionBarMenuItem5.setVisibility(8);
            blurredLinearLayout.addView(actionBarMenuItem5, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
            sharedMediaLayout2.actionModeViews.add(actionBarMenuItem5);
            actionBarMenuItem5.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 5));
            sharedMediaLayout2.updateForwardItem();
        }
        ActionBarMenuItem actionBarMenuItem6 = new ActionBarMenuItem(context2, sharedMediaLayout2.getThemedColor$13(i25), sharedMediaLayout2.getThemedColor$13(i24), false);
        sharedMediaLayout2.deleteItem = actionBarMenuItem6;
        actionBarMenuItem6.setIcon(R.drawable.msg_delete);
        actionBarMenuItem6.setContentDescription(LocaleController.getString("Delete", R.string.Delete));
        actionBarMenuItem6.setDuplicateParentStateEnabled(false);
        blurredLinearLayout.addView(actionBarMenuItem6, new LinearLayout.LayoutParams(AndroidUtilities.dp(54.0f), -1));
        sharedMediaLayout2.actionModeViews.add(actionBarMenuItem6);
        actionBarMenuItem6.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 6));
        sharedMediaLayout2.photoVideoAdapter = sharedMediaLayout2.new AnonymousClass6(context2);
        sharedMediaLayout2.animationSupportingPhotoVideoAdapter = sharedMediaLayout2.new SharedPhotoVideoAdapter(context2);
        sharedMediaLayout2.documentsAdapter = sharedMediaLayout2.new SharedDocumentsAdapter(context2, 1);
        sharedMediaLayout2.voiceAdapter = sharedMediaLayout2.new SharedDocumentsAdapter(context2, 2);
        sharedMediaLayout2.audioAdapter = sharedMediaLayout2.new SharedDocumentsAdapter(context2, 4);
        sharedMediaLayout2.pollAdapter = sharedMediaLayout2.new PollAdapter(context2, sharedMediaLayout2.profileActivity.getCurrentAccount(), sharedMediaLayout2.profileActivity.getResourceProvider());
        sharedMediaLayout2.gifAdapter = sharedMediaLayout2.new GifAdapter(context2);
        sharedMediaLayout2.documentsSearchAdapter = sharedMediaLayout2.new MediaSearchAdapter(context2, 1);
        sharedMediaLayout2.audioSearchAdapter = sharedMediaLayout2.new MediaSearchAdapter(context2, 4);
        sharedMediaLayout2.linksSearchAdapter = sharedMediaLayout2.new MediaSearchAdapter(context2, 3);
        sharedMediaLayout2.groupUsersSearchAdapter = sharedMediaLayout2.new GroupUsersSearchAdapter(context2);
        sharedMediaLayout2.commonGroupsAdapter = sharedMediaLayout2.new CommonGroupsAdapter(context2);
        sharedMediaLayout2.channelRecommendationsAdapter = sharedMediaLayout2.new ChannelRecommendationsAdapter(context2);
        sharedMediaLayout2.savedDialogsAdapter = sharedMediaLayout2.new SavedDialogsAdapter(context2);
        sharedMediaLayout2.savedMessagesSearchAdapter = sharedMediaLayout2.new SavedMessagesSearchAdapter(context2);
        if (!sharedMediaLayout2.isStoriesView() && !sharedMediaLayout2.includeSavedDialogs() && sharedMediaLayout2.topicId == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", sharedMediaLayout2.profileActivity.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 3);
            ?? r4 = new ChatActivityContainer(context2, sharedMediaLayout2.profileActivity.getParentLayout(), bundle) {
                @Override
                public final void onSearchLoadingUpdate(boolean z) {
                    ActionBarMenuItem actionBarMenuItem7 = SharedMediaLayout.this.searchItem;
                    if (actionBarMenuItem7 != null) {
                        actionBarMenuItem7.setShowSearchProgress(z);
                    }
                }
            };
            sharedMediaLayout2.savedMessagesContainer = r4;
            long j4 = sharedMediaLayout2.dialog_id;
            ChatActivityContainer.AnonymousClass1 anonymousClass1 = r4.chatActivity;
            anonymousClass1.threadMessageId = j4;
            anonymousClass1.reversed = true;
            r4.setClipToOutline(true);
            r4.setOutlineProvider(new AnonymousClass8());
        }
        ChatUsersAdapter chatUsersAdapter = sharedMediaLayout2.new ChatUsersAdapter(context2);
        sharedMediaLayout2.chatUsersAdapter = chatUsersAdapter;
        if (sharedMediaLayout2.topicId == 0) {
            chatUsersAdapter.sortedUsers = arrayList;
            chatUsersAdapter.chatInfo = currentTabId != 7 ? null : chatFull2;
        }
        sharedMediaLayout2.storiesAdapter = sharedMediaLayout2.new AnonymousClass9(context2);
        sharedMediaLayout2.storiesReorder = new ItemTouchHelper(new ItemTouchHelper.Callback() {
            public AnonymousClass19 listView;

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
                RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                StoriesAdapter storiesAdapter = adapter instanceof StoriesAdapter ? (StoriesAdapter) adapter : null;
                if (!isLongPressDragEnabled() || storiesAdapter == null || !storiesAdapter.canReorder(viewHolder.getAdapterPosition())) {
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
                }
                MediaPage mediaPage2 = SharedMediaLayout.this.mediaPages[0];
                AnonymousClass19 anonymousClass19 = mediaPage2 != null ? mediaPage2.listView : null;
                this.listView = anonymousClass19;
                if (anonymousClass19 != null) {
                    anonymousClass19.setItemAnimator(mediaPage2.itemAnimator);
                }
                return ItemTouchHelper.Callback.makeMovementFlags(15, 0);
            }

            @Override
            public final boolean isLongPressDragEnabled() {
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                if (sharedMediaLayout3.isActionModeShowed) {
                    return true;
                }
                AnonymousClass15 anonymousClass18 = sharedMediaLayout3.storiesContainer;
                return anonymousClass18 != null && anonymousClass18.reorderingCollections;
            }

            @Override
            public final boolean onMove(RecyclerListView recyclerListView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
                StoriesController.StoriesList storiesList;
                ArrayList arrayList2;
                RecyclerView.Adapter adapter = recyclerListView.getAdapter();
                StoriesAdapter storiesAdapter = adapter instanceof StoriesAdapter ? (StoriesAdapter) adapter : null;
                if (storiesAdapter == null || !storiesAdapter.canReorder(viewHolder.getAdapterPosition()) || !storiesAdapter.canReorder(viewHolder2.getAdapterPosition())) {
                    return false;
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                if (!storiesAdapter.isArchive && (storiesList = storiesAdapter.storiesList) != null && adapterPosition >= 0 && adapterPosition < storiesList.messageObjects.size() && adapterPosition2 >= 0 && adapterPosition2 < storiesAdapter.storiesList.messageObjects.size()) {
                    if ((storiesAdapter.storiesList instanceof StoriesController.BotPreviewsList) || storiesAdapter.albumId > 0) {
                        arrayList2 = new ArrayList();
                        for (int i26 = 0; i26 < storiesAdapter.storiesList.messageObjects.size(); i26++) {
                            arrayList2.add(Integer.valueOf(((MessageObject) storiesAdapter.storiesList.messageObjects.get(i26)).getId()));
                        }
                    } else {
                        arrayList2 = new ArrayList(storiesAdapter.storiesList.pinnedIds);
                    }
                    if (!storiesAdapter.applyingReorder) {
                        ArrayList arrayList3 = storiesAdapter.lastPinnedIds;
                        arrayList3.clear();
                        arrayList3.addAll(arrayList2);
                        storiesAdapter.applyingReorder = true;
                    }
                    MessageObject messageObject = (MessageObject) storiesAdapter.storiesList.messageObjects.get(adapterPosition);
                    arrayList2.remove(Integer.valueOf(messageObject.getId()));
                    arrayList2.add(Utilities.clamp(adapterPosition2, arrayList2.size(), 0), Integer.valueOf(messageObject.getId()));
                    storiesAdapter.storiesList.updatePinnedOrder(arrayList2, false);
                    storiesAdapter.mObservable.notifyItemMoved(adapterPosition, adapterPosition2);
                }
                return true;
            }

            @Override
            public final void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i26) {
                StoriesController.StoriesList storiesList;
                ArrayList arrayList2;
                AnonymousClass19 anonymousClass19 = this.listView;
                if (anonymousClass19 != null && viewHolder != null) {
                    anonymousClass19.hideSelector(false);
                }
                if (i26 != 0) {
                    AnonymousClass19 anonymousClass110 = this.listView;
                    if (anonymousClass110 != null) {
                        anonymousClass110.cancelClickRunnables(false);
                    }
                    if (viewHolder != null) {
                        viewHolder.itemView.setPressed(true);
                        return;
                    }
                    return;
                }
                AnonymousClass19 anonymousClass111 = this.listView;
                if (anonymousClass111 != null && (anonymousClass111.getAdapter() instanceof StoriesAdapter)) {
                    StoriesAdapter storiesAdapter = (StoriesAdapter) this.listView.getAdapter();
                    if (!storiesAdapter.isArchive && (storiesList = storiesAdapter.storiesList) != null && storiesAdapter.applyingReorder) {
                        if ((storiesList instanceof StoriesController.BotPreviewsList) || storiesAdapter.albumId > 0) {
                            arrayList2 = new ArrayList();
                            for (int i27 = 0; i27 < storiesAdapter.storiesList.messageObjects.size(); i27++) {
                                arrayList2.add(Integer.valueOf(((MessageObject) storiesAdapter.storiesList.messageObjects.get(i27)).getId()));
                            }
                        } else {
                            arrayList2 = storiesList.pinnedIds;
                        }
                        ArrayList arrayList3 = storiesAdapter.lastPinnedIds;
                        boolean z = arrayList3.size() != arrayList2.size();
                        if (!z) {
                            for (int i28 = 0; i28 < arrayList3.size(); i28++) {
                                if (arrayList3.get(i28) != arrayList2.get(i28)) {
                                    z = true;
                                    break;
                                }
                            }
                        }
                        if (z) {
                            storiesAdapter.storiesList.updatePinnedOrder(arrayList2, true);
                        }
                        storiesAdapter.applyingReorder = false;
                    }
                }
                AnonymousClass19 anonymousClass112 = this.listView;
                if (anonymousClass112 != null) {
                    anonymousClass112.setItemAnimator(null);
                }
            }

            @Override
            public final void onSwiped(RecyclerView.ViewHolder viewHolder) {
            }
        });
        sharedMediaLayout2.animationSupportingStoriesAdapter = new StoriesAdapter(sharedMediaLayout2, context2, false);
        sharedMediaLayout2.archivedStoriesAdapter = new StoriesAdapter(context2) {
            @Override
            public final void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                MediaPage mediaPage2 = sharedMediaLayout3.getMediaPage(9);
                if (mediaPage2 != null && mediaPage2.animationSupportingListView.getVisibility() == 0) {
                    sharedMediaLayout3.animationSupportingArchivedStoriesAdapter.notifyDataSetChanged();
                }
                if (mediaPage2 != null) {
                    AnonymousClass29 anonymousClass29 = mediaPage2.emptyView;
                    StoriesController.StoriesList storiesList = this.storiesList;
                    anonymousClass29.showProgress(storiesList != null && (storiesList.isLoading() || (sharedMediaLayout3.profileActivity.getConnectionsManager().getConnectionState() == 3 && this.storiesList.getCount() > 0)), true);
                }
            }
        };
        sharedMediaLayout2.animationSupportingArchivedStoriesAdapter = new StoriesAdapter(sharedMediaLayout2, context2, true);
        sharedMediaLayout2.linksAdapter = sharedMediaLayout2.new SharedLinksAdapter(context2);
        if (!sharedMediaLayout2.isBot()) {
            if (sharedMediaLayout2.profileActivity instanceof ProfileActivity) {
                TextView textView = new TextView(context2);
                sharedMediaLayout2.saveItem = textView;
                textView.setText(LocaleController.getString(R.string.Save).toUpperCase());
                textView.setTypeface(AndroidUtilities.bold());
                int i26 = Theme.key_featuredStickers_addButton;
                textView.setTextColor(sharedMediaLayout2.getThemedColor$13(i26));
                textView.setTextSize(1, 15.0f);
                textView.setGravity(17);
                textView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.15f, sharedMediaLayout2.getThemedColor$13(i26)), 3));
                textView.setPadding(AndroidUtilities.dp(19.0f), 0, AndroidUtilities.dp(19.0f), 0);
                sharedMediaLayout2.actionBar.addView(textView, LayoutHelper.createFrame(-2, 56, 85));
                textView.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(sharedMediaLayout2, 7));
                textView.setVisibility(8);
                textView.setAlpha(0.0f);
                textView.setScaleX(0.4f);
                textView.setScaleY(0.4f);
                BaseFragment baseFragment3 = sharedMediaLayout2.profileActivity;
                resourcesProvider2 = resourcesProvider;
                AnonymousClass13 anonymousClass13 = new AnonymousClass13(baseFragment3.getCurrentAccount(), ((ProfileActivity) sharedMediaLayout2.profileActivity).getDialogId(), context2, baseFragment3, resourcesProvider2, sharedMediaLayout2);
                sharedMediaLayout.giftsContainer = anonymousClass13;
                int iDp = AndroidUtilities.dp(48.0f);
                DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = sharedMediaLayout.topPanelLayout;
                if (dialogsActivityTopPanelLayout != null) {
                    context2 = context2;
                    sharedMediaLayout = sharedMediaLayout2;
                    animatedHeightWithPadding = (int) dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(0.0f);
                } else {
                    context2 = context2;
                    sharedMediaLayout = sharedMediaLayout2;
                    animatedHeightWithPadding = 0;
                }
                anonymousClass13.setPaddingTop(iDp + animatedHeightWithPadding);
                sharedMediaLayout.storiesContainer = sharedMediaLayout.new AnonymousClass15(context2, sizeNotifierFrameLayout, sharedMediaLayout.getStoriesController().getStoryAlbumsList(sharedMediaLayout.dialog_id, true), sharedMediaLayout.new AnonymousClass14(context2, baseFragment, resourcesProvider2));
                r1 = sharedMediaLayout;
            }
            r1.setWillNotDraw(false);
            top = 0;
            iFindFirstVisibleItemPosition = -1;
            i5 = 0;
            while (true) {
                mediaPageArr = r1.mediaPages;
                if (i5 < mediaPageArr.length) {
                    break;
                }
                if (i5 == 0 || (mediaPage = mediaPageArr[i5]) == null || (anonymousClass17 = mediaPage.layoutManager) == null) {
                    i6 = top;
                    i7 = iFindFirstVisibleItemPosition;
                } else {
                    iFindFirstVisibleItemPosition = anonymousClass17.findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition == r1.mediaPages[i5].layoutManager.getItemCount() - 1 || (holder = (RecyclerListView.Holder) r1.mediaPages[i5].listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                        i6 = top;
                        i7 = -1;
                    } else {
                        top = holder.itemView.getTop();
                        i6 = top;
                        i7 = iFindFirstVisibleItemPosition;
                    }
                }
                r3 = new MediaPage(context2) {
                    @Override
                    public final void setTranslationX(float f) {
                        MediaPage[] mediaPageArr2;
                        MediaPage mediaPage2;
                        super.setTranslationX(f);
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        if (sharedMediaLayout3.tabsAnimationInProgress && (mediaPage2 = (mediaPageArr2 = sharedMediaLayout3.mediaPages)[0]) == this) {
                            float fAbs = Math.abs(mediaPage2.getTranslationX()) / mediaPageArr2[0].getMeasuredWidth();
                            sharedMediaLayout3.selectTabWithId(fAbs, mediaPageArr2[1].selectedType);
                            if (sharedMediaLayout3.canShowSearchItem()) {
                                int i27 = sharedMediaLayout3.searchItemState;
                                if (i27 == 2) {
                                    sharedMediaLayout3.searchAlpha = 1.0f - fAbs;
                                } else if (i27 == 1) {
                                    sharedMediaLayout3.searchAlpha = fAbs;
                                }
                                sharedMediaLayout3.updateSearchItemIcon(fAbs);
                                float photoVideoOptionsAlpha = sharedMediaLayout3.getPhotoVideoOptionsAlpha(fAbs);
                                sharedMediaLayout3.optionsAlpha = photoVideoOptionsAlpha;
                                sharedMediaLayout3.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !sharedMediaLayout3.canShowSearchItem() || sharedMediaLayout3.isArchivedOnlyStoriesView()) ? 4 : 0);
                            } else {
                                sharedMediaLayout3.searchAlpha = 0.0f;
                            }
                            sharedMediaLayout3.updateOptionsSearch(false);
                        }
                        sharedMediaLayout3.checkStoriesTabsPosition();
                        sharedMediaLayout3.checkUi_topPanelLayoutY();
                        sharedMediaLayout3.invalidateBlur();
                    }
                };
                r1.addView(r3, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, r1.mediaPageTopMargin(), 0.0f, 0.0f));
                if (i5 == 1) {
                    r3.setTranslationX(AndroidUtilities.displaySize.x);
                }
                r1.mediaPages[i5] = r3;
                r14 = new ExtendedGridLayoutManager() {
                    public final Size size;

                    {
                        super(100, false);
                        this.size = new Size();
                    }

                    @Override
                    public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr4) {
                        super.calculateExtraLayoutSpace(state, iArr4);
                        AnonymousClass16 anonymousClass18 = r3;
                        int i27 = anonymousClass18.selectedType;
                        if (i27 == 0 || SharedMediaLayout.isAnyStoryPageType(i27)) {
                            iArr4[1] = Math.max(iArr4[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                        } else if (anonymousClass18.selectedType == 1) {
                            iArr4[1] = Math.max(iArr4[1], AndroidUtilities.dp(56.0f) * 2);
                        }
                    }

                    @Override
                    public final int getFlowItemCount() {
                        if (r3.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                            return 0;
                        }
                        return getItemCount();
                    }

                    @Override
                    public final Size getSizeForItem(int i27) {
                        int i28;
                        int i29;
                        RecyclerView.Adapter adapter = r3.listView.getAdapter();
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        TLRPC.Document document = (adapter != sharedMediaLayout3.gifAdapter || sharedMediaLayout3.sharedMediaData[5].messages.isEmpty()) ? null : ((MessageObject) sharedMediaLayout3.sharedMediaData[5].messages.get(i27)).getDocument();
                        Size size = this.size;
                        size.height = 100.0f;
                        size.width = 100.0f;
                        if (document != null) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                            if (closestPhotoSizeWithSize != null && (i28 = closestPhotoSizeWithSize.w) != 0 && (i29 = closestPhotoSizeWithSize.h) != 0) {
                                size.width = i28;
                                size.height = i29;
                            }
                            ArrayList<TLRPC.DocumentAttribute> arrayList2 = document.attributes;
                            for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                                TLRPC.DocumentAttribute documentAttribute = arrayList2.get(i30);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                    size.width = documentAttribute.w;
                                    size.height = documentAttribute.h;
                                    break;
                                }
                            }
                        }
                        return size;
                    }

                    @Override
                    public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                        super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                        AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
                        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                        zzbe zzbeVar = collectionItemInfo != null ? new zzbe(collectionItemInfo, 10) : null;
                        if (zzbeVar != null) {
                            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) zzbeVar.zza;
                            if (collectionItemInfo2.isHeading()) {
                                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                            }
                        }
                    }
                };
                r3.layoutManager = r14;
                r14.setSpanSizeLookup(new BaseMenuWrapper() {
                    @Override
                    public final int getSpanSize(int i27) {
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        int[] iArr4 = sharedMediaLayout3.mediaColumnsCount;
                        AnonymousClass16 anonymousClass18 = r3;
                        int i28 = iArr4[SharedMediaLayout.isAnyStoryPageType(anonymousClass18.selectedType) ? 1 : 0];
                        RecyclerView.Adapter adapter = anonymousClass18.listView.getAdapter();
                        AnonymousClass6 anonymousClass6 = sharedMediaLayout3.photoVideoAdapter;
                        if (adapter == anonymousClass6) {
                            if (anonymousClass6.getItemViewType(i27) != 2) {
                                i28 = 1;
                            }
                        } else if (SharedMediaLayout.access$7500(sharedMediaLayout3, anonymousClass18.listView.getAdapter()) != -1) {
                            if (anonymousClass18.listView.getAdapter().getItemViewType(i27) != 2) {
                                i28 = 1;
                            }
                        } else if (anonymousClass18.listView.getAdapter() != sharedMediaLayout3.gifAdapter) {
                            i28 = anonymousClass18.layoutManager.mSpanCount;
                        } else if (anonymousClass18.listView.getAdapter() == sharedMediaLayout3.gifAdapter && sharedMediaLayout3.sharedMediaData[5].messages.isEmpty()) {
                            i28 = anonymousClass18.layoutManager.mSpanCount;
                        } else {
                            AnonymousClass17 anonymousClass19 = anonymousClass18.layoutManager;
                            anonymousClass19.checkLayout();
                            i28 = anonymousClass19.itemSpans.get(i27);
                        }
                        return Math.min(i28, anonymousClass18.layoutManager.mSpanCount);
                    }
                });
                r1.mediaPages[i5].itemAnimator = new DefaultItemAnimator();
                r1.mediaPages[i5].itemAnimator.setDurations(280L);
                MediaPage mediaPage2 = r1.mediaPages[i5];
                DefaultItemAnimator defaultItemAnimator = mediaPage2.itemAnimator;
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
                defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
                defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
                defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
                defaultItemAnimator.mSupportsChangeAnimations = false;
                mediaPage2.listView = new AnonymousClass19(context2, r3, r14);
                r1.mediaPages[i5].listView.setFastScrollEnabled(1);
                r1.mediaPages[i5].listView.setScrollingTouchSlop(1);
                r1.mediaPages[i5].listView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
                r1.mediaPages[i5].listView.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
                r1.mediaPages[i5].listView.setItemAnimator(null);
                r1.mediaPages[i5].listView.setClipToPadding(false);
                r1.mediaPages[i5].listView.setSectionsType(2);
                r1.mediaPages[i5].listView.setLayoutManager(r14);
                MediaPage mediaPage3 = r1.mediaPages[i5];
                mediaPage3.addView(mediaPage3.listView, LayoutHelper.createFrame(-1.0f, -1));
                r1.mediaPages[i5].animationSupportingListView = new InternalListView(context2);
                MediaPage mediaPage4 = r1.mediaPages[i5];
                ?? r5 = mediaPage4.animationSupportingListView;
                ?? r6 = new GridLayoutManager() {
                    @Override
                    public final int scrollVerticallyBy(int i27, RecyclerView.Recycler recycler, RecyclerView.State state) {
                        if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                            i27 = 0;
                        }
                        return super.scrollVerticallyBy(i27, recycler, state);
                    }

                    @Override
                    public final boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                mediaPage4.animationSupportingLayoutManager = r6;
                r5.setLayoutManager(r6);
                MediaPage mediaPage5 = r1.mediaPages[i5];
                mediaPage5.addView(mediaPage5.animationSupportingListView, LayoutHelper.createFrame(-1.0f, -1));
                r1.mediaPages[i5].animationSupportingListView.setVisibility(8);
                r1.mediaPages[i5].animationSupportingListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                        if (!(view instanceof SharedPhotoVideoCell2)) {
                            rect.left = 0;
                            rect.top = 0;
                            rect.bottom = 0;
                            rect.right = 0;
                            return;
                        }
                        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                        AnonymousClass16 anonymousClass18 = r3;
                        anonymousClass18.animationSupportingListView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell2);
                        int i27 = anonymousClass18.animationSupportingLayoutManager.mSpanCount;
                        sharedPhotoVideoCell2.isTop = childAdapterPosition < i27;
                        int i28 = childAdapterPosition % i27;
                        sharedPhotoVideoCell2.isFirst = i28 == 0;
                        sharedPhotoVideoCell2.isLast = i28 == i27 - 1;
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                    }
                });
                r1.mediaPages[i5].listView.addItemDecoration(new RecyclerView.ItemDecoration() {
                    @Override
                    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                        AnonymousClass16 anonymousClass18 = r3;
                        if (anonymousClass18.listView.getAdapter() == SharedMediaLayout.this.gifAdapter) {
                            recyclerView.getClass();
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                            rect.left = 0;
                            rect.bottom = 0;
                            AnonymousClass17 anonymousClass19 = anonymousClass18.layoutManager;
                            anonymousClass19.checkLayout();
                            if (childAdapterPosition <= anonymousClass19.firstRowMax) {
                                rect.top = 0;
                            } else {
                                rect.top = AndroidUtilities.dp(2.0f);
                            }
                            AnonymousClass17 anonymousClass110 = anonymousClass18.layoutManager;
                            anonymousClass110.checkLayout();
                            rect.right = anonymousClass110.itemsToRow.get(childAdapterPosition, Integer.MAX_VALUE) == Integer.MAX_VALUE ? AndroidUtilities.dp(2.0f) : 0;
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
                        anonymousClass18.listView.getClass();
                        int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell2);
                        int i27 = anonymousClass18.layoutManager.mSpanCount;
                        sharedPhotoVideoCell2.isTop = childAdapterPosition2 < i27;
                        int i28 = childAdapterPosition2 % i27;
                        sharedPhotoVideoCell2.isFirst = i28 == 0;
                        sharedPhotoVideoCell2.isLast = i28 == i27 - 1;
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                    }
                });
                r1.mediaPages[i5].listView.setOnItemClickListener(new ChatActivity$$ExternalSyntheticLambda124(r1, r3, context2, j, resourcesProvider2, 1));
                r1.mediaPages[i5].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public final void onScrollStateChanged(RecyclerView recyclerView, int i27) {
                        SharedMediaLayout.this.scrolling = i27 != 0;
                    }

                    @Override
                    public final void onScrolled(RecyclerView recyclerView, int i27, int i28) {
                        int i29;
                        int i30;
                        AnonymousClass17 anonymousClass18 = r14;
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        AnonymousClass16 anonymousClass19 = r3;
                        sharedMediaLayout3.checkLoadMoreScroll(anonymousClass19, (RecyclerListView) recyclerView, anonymousClass18);
                        SharedMediaData[] sharedMediaDataArr2 = sharedMediaLayout3.sharedMediaData;
                        if (i28 != 0 && ((i30 = sharedMediaLayout3.mediaPages[0].selectedType) == 0 || i30 == 5)) {
                            sharedMediaDataArr2[0].messages.isEmpty();
                        }
                        if (i28 != 0 && ((i29 = anonymousClass19.selectedType) == 0 || SharedMediaLayout.isAnyStoryPageType(i29))) {
                            SharedMediaLayout.showFastScrollHint(anonymousClass19, sharedMediaDataArr2, true);
                        }
                        anonymousClass19.listView.checkSection(true);
                        if (anonymousClass19.fastScrollHintView != null) {
                            anonymousClass19.invalidate();
                        }
                        sharedMediaLayout3.invalidateBlur();
                    }
                });
                r1.mediaPages[i5].listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
                    @Override
                    public final boolean mo1082onItemClick(View view, int i27, float f, float f2) {
                        boolean z;
                        int iIntValue;
                        View view2 = view;
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        if (sharedMediaLayout3.photoVideoChangeColumnsAnimation) {
                            return false;
                        }
                        AnonymousClass16 anonymousClass18 = r3;
                        if (anonymousClass18.listView.getAdapter() == sharedMediaLayout3.savedMessagesSearchAdapter) {
                            return false;
                        }
                        if (!sharedMediaLayout3.isActionModeShowed || anonymousClass18.selectedType == 11) {
                            int i28 = anonymousClass18.selectedType;
                            if (i28 == 7 && (view2 instanceof UserCell)) {
                                ChatUsersAdapter chatUsersAdapter2 = sharedMediaLayout3.chatUsersAdapter;
                                if (chatUsersAdapter2.sortedUsers.isEmpty()) {
                                    iIntValue = i27;
                                } else {
                                    if (i27 >= chatUsersAdapter2.sortedUsers.size()) {
                                        return false;
                                    }
                                    iIntValue = ((Integer) chatUsersAdapter2.sortedUsers.get(i27)).intValue();
                                }
                                if (iIntValue < 0 || iIntValue >= chatUsersAdapter2.chatInfo.participants.participants.size()) {
                                    return false;
                                }
                                TLRPC.ChatParticipant chatParticipant = chatUsersAdapter2.chatInfo.participants.participants.get(iIntValue);
                                RecyclerListView recyclerListView = (RecyclerListView) view2.getParent();
                                for (int i29 = 0; i29 < recyclerListView.getChildCount(); i29++) {
                                    View childAt = recyclerListView.getChildAt(i29);
                                    if (RecyclerView.getChildAdapterPosition(childAt) == i27) {
                                        view2 = childAt;
                                        break;
                                    }
                                }
                                return sharedMediaLayout3.onMemberClick(chatParticipant, true, view2);
                            }
                            if (i28 == 1 && (view2 instanceof SharedDocumentCell)) {
                                return sharedMediaLayout3.onItemLongClick(((SharedDocumentCell) view2).getMessage(), view2, 0, true);
                            }
                            if (i28 == 3 && (view2 instanceof SharedLinkCell)) {
                                return sharedMediaLayout3.onItemLongClick(((SharedLinkCell) view2).getMessage(), view2, 0, true);
                            }
                            if ((i28 == 2 || i28 == 4) && (view2 instanceof SharedAudioCell)) {
                                return sharedMediaLayout3.onItemLongClick(((SharedAudioCell) view2).getMessage(), view2, 0, true);
                            }
                            if (i28 == 5 && (view2 instanceof ContextLinkCell)) {
                                return sharedMediaLayout3.onItemLongClick((MessageObject) ((ContextLinkCell) view2).getParentObject(), view2, 0, true);
                            }
                            if ((i28 == 0 || (SharedMediaLayout.isAnyStoryPageType(i28) && sharedMediaLayout3.canEditStories())) && (view2 instanceof SharedPhotoVideoCell2)) {
                                MessageObject messageObject = ((SharedPhotoVideoCell2) view2).getMessageObject();
                                if (messageObject != null) {
                                    return sharedMediaLayout3.onItemLongClick(messageObject, view2, anonymousClass18.selectedType, true);
                                }
                                return false;
                            }
                            int i30 = anonymousClass18.selectedType;
                            if (i30 != 10) {
                                if (i30 != 11) {
                                    return false;
                                }
                                sharedMediaLayout3.savedDialogsAdapter.select(view2);
                                return true;
                            }
                            ChannelRecommendationsAdapter channelRecommendationsAdapter = sharedMediaLayout3.channelRecommendationsAdapter;
                            if (i27 < 0) {
                                channelRecommendationsAdapter.getClass();
                                return true;
                            }
                            ArrayList arrayList2 = channelRecommendationsAdapter.chats;
                            if (i27 < arrayList2.size()) {
                                TLObject tLObject = (TLObject) arrayList2.get(i27);
                                Bundle bundle2 = new Bundle();
                                boolean z2 = tLObject instanceof TLRPC.Chat;
                                if (z2) {
                                    bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                                } else if (tLObject instanceof TLRPC.User) {
                                    bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                                }
                                ChatActivity chatActivity = new ChatActivity(bundle2);
                                SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                                BaseFragment baseFragment4 = sharedMediaLayout4.profileActivity;
                                if (baseFragment4 instanceof ProfileActivity) {
                                    ProfileActivity profileActivity = (ProfileActivity) baseFragment4;
                                    if (profileActivity.blurredView == null) {
                                        z = true;
                                    } else {
                                        int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                        z = true;
                                        int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                                        canvas.scale(0.16666667f, 0.16666667f);
                                        profileActivity.fragmentView.draw(canvas);
                                        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                                        profileActivity.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                                        profileActivity.blurredView.setAlpha(0.0f);
                                        profileActivity.blurredView.setVisibility(0);
                                    }
                                } else {
                                    z = true;
                                }
                                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, sharedMediaLayout4.getContext(), sharedMediaLayout4.resourcesProvider);
                                actionBarPopupWindowLayout.setBackgroundColor(sharedMediaLayout4.getThemedColor$13(Theme.key_actionBarDefaultSubmenuBackground));
                                if (!z2) {
                                    if (!(tLObject instanceof TLRPC.User)) {
                                        return z;
                                    }
                                    baseFragment4.presentFragmentAsPreview(chatActivity);
                                    return z;
                                }
                                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, sharedMediaLayout4.getContext(), null, false, false);
                                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                                actionBarMenuSubItem.setMinimumWidth(160);
                                actionBarMenuSubItem.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(channelRecommendationsAdapter, 29));
                                ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                                anonymousClass2.addView(actionBarMenuSubItem);
                                ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, sharedMediaLayout4.getContext(), null, false, false);
                                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                                actionBarMenuSubItem2.setMinimumWidth(160);
                                actionBarMenuSubItem2.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(channelRecommendationsAdapter, (TLRPC.Chat) tLObject, i27, 11));
                                anonymousClass2.addView(actionBarMenuSubItem2);
                                baseFragment4.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
                                return z;
                            }
                        } else {
                            AnonymousClass19 anonymousClass19 = anonymousClass18.listView;
                            RecyclerListView.OnItemClickListener onItemClickListener = anonymousClass19.onItemClickListener;
                            if (onItemClickListener != null) {
                                onItemClickListener.onItemClick(i27, view2);
                                return true;
                            }
                            RecyclerListView.OnItemClickListenerExtended onItemClickListenerExtended = anonymousClass19.onItemClickListenerExtended;
                            if (onItemClickListenerExtended != null) {
                                onItemClickListenerExtended.onItemClick(view2, i27, 0.0f, 0.0f);
                                return true;
                            }
                        }
                        return true;
                    }

                    @Override
                    public final void onLongClickRelease() {
                        BaseFragment baseFragment4 = SharedMediaLayout.this.profileActivity;
                        if (baseFragment4 != null) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                baseFragment4.finishPreviewFragment();
                            }
                        }
                    }

                    @Override
                    public final void onMove(float f) {
                        BaseFragment baseFragment4 = SharedMediaLayout.this.profileActivity;
                        if (baseFragment4 != null) {
                            Point point = AndroidUtilities.displaySize;
                            if (point.x > point.y) {
                                baseFragment4.movePreviewFragment(f);
                            }
                        }
                    }
                });
                if (i5 == 0 && i7 != -1) {
                    r14.scrollToPositionWithOffset(i7, i6);
                }
                final AnonymousClass19 anonymousClass19 = r1.mediaPages[i5].listView;
                r1.mediaPages[i5].animatingImageView = new ClippingImageView(context2) {
                    @Override
                    public final void invalidate() {
                        super.invalidate();
                        anonymousClass19.invalidate();
                    }
                };
                r1.mediaPages[i5].animatingImageView.setVisibility(8);
                r1.mediaPages[i5].listView.addOverlayView(r1.mediaPages[i5].animatingImageView, LayoutHelper.createFrame(-1.0f, -1));
                r1.mediaPages[i5].progressView = new FlickerLoadingView(context2) {
                    @Override
                    public final int getColumnsCount() {
                        return SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(r3.selectedType) ? 1 : 0];
                    }

                    @Override
                    public final int getViewType() {
                        setIsSingleCell(false);
                        int i27 = r3.selectedType;
                        if (i27 == 0 || i27 == 5) {
                            return 2;
                        }
                        if (i27 == 1) {
                            return 3;
                        }
                        if (i27 == 2 || i27 == 4) {
                            return 6;
                        }
                        if (i27 == 3) {
                            return 5;
                        }
                        if (i27 == 7) {
                            return 6;
                        }
                        if (i27 != 6) {
                            return SharedMediaLayout.isAnyStoryPageType(i27) ? 27 : 1;
                        }
                        if (getTabsCount() == 1) {
                            setIsSingleCell(true);
                        }
                        return 1;
                    }

                    @Override
                    public final void onDraw(Canvas canvas) {
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        sharedMediaLayout3.backgroundPaint.setColor(sharedMediaLayout3.getThemedColor$13(Theme.key_windowBackgroundWhite));
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), sharedMediaLayout3.backgroundPaint);
                        super.onDraw(canvas);
                    }
                };
                r1.mediaPages[i5].progressView.showDate();
                r1.mediaPages[i5].progressView.setClipToOutline(true);
                r1.mediaPages[i5].progressView.setOutlineProvider(new ViewOutlineProvider() {
                    @Override
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
                    }
                });
                if (i5 != 0) {
                    r1.mediaPages[i5].setVisibility(8);
                }
                MediaPage mediaPage6 = r1.mediaPages[i5];
                mediaPage6.emptyView = new StickerEmptyView(context2, mediaPage6.progressView) {
                    @Override
                    public final void onVisibilityChange() {
                        invalidate();
                        SharedMediaLayout.this.onBottomButtonVisibilityChange();
                    }
                };
                r1.mediaPages[i5].emptyView.setVisibility(8, false);
                r1.mediaPages[i5].emptyView.setAnimateLayoutChange(true);
                MediaPage mediaPage7 = r1.mediaPages[i5];
                mediaPage7.addView(mediaPage7.emptyView, LayoutHelper.createFrame(-1.0f, -1));
                r1.mediaPages[i5].emptyView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(22));
                r1.mediaPages[i5].emptyView.showProgress(true, false);
                r1.mediaPages[i5].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                r1.mediaPages[i5].emptyView.button.setVisibility(8);
                r1.mediaPages[i5].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                r1.mediaPages[i5].emptyView.button.setVisibility(8);
                r1.mediaPages[i5].emptyView.addView(r1.mediaPages[i5].progressView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
                r1.mediaPages[i5].listView.setEmptyView(r1.mediaPages[i5].emptyView);
                r1.mediaPages[i5].listView.setAnimateEmptyView(0, true);
                MediaPage mediaPage8 = r1.mediaPages[i5];
                mediaPage8.scrollHelper = new RecyclerAnimationScrollHelper(mediaPage8.listView, r1.mediaPages[i5].layoutManager);
                i5++;
                resourcesProvider2 = resourcesProvider;
                top = i6;
                iFindFirstVisibleItemPosition = i7;
            }
            anonymousClass15 = r1.storiesContainer;
            if (anonymousClass15 != null) {
                r1.addView(anonymousClass15, LayoutHelper.createFrame(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
            }
            ChatActionCell chatActionCell = new ChatActionCell(context2);
            r1.floatingDateView = chatActionCell;
            chatActionCell.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
            chatActionCell.setAlpha(0.0f);
            chatActionCell.setOverrideColor(Theme.key_chat_mediaTimeBackground, Theme.key_chat_mediaTimeText);
            chatActionCell.setTranslationY(-AndroidUtilities.dp(48.0f));
            r1.addView(chatActionCell, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
            zCustomTabs = r1.customTabs();
            r2 = r1;
            if (!zCustomTabs) {
                ?? dialogsActivityTopPanelLayout2 = new DialogsActivityTopPanelLayout(context2);
                r1.topPanelLayout = dialogsActivityTopPanelLayout2;
                dialogsActivityTopPanelLayout2.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = r59.create(dialogsActivityTopPanelLayout2, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
                blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
                dialogsActivityTopPanelLayout2.setBlurredBackground(blurredBackgroundDrawableCreate);
                ?? frameLayout = new FrameLayout(context2);
                r1.fragmentContextViewWrapper = frameLayout;
                dialogsActivityTopPanelLayout2.addView(frameLayout);
                dialogsActivityTopPanelLayout2.setViewVisible(frameLayout, true, false);
                dialogsActivityTopPanelLayout2.setOnAnimatedHeightChangedListener(new SharedMediaLayout$$ExternalSyntheticLambda9(r1, 1));
                ?? r7 = new FragmentContextView(context2, baseFragment, this, resourcesProvider) {
                    @Override
                    public final void setVisibility(int i27) {
                        SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                        sharedMediaLayout3.topPanelLayout.setViewVisible(sharedMediaLayout3.fragmentContextViewWrapper, i27 == 0, true);
                    }
                };
                r1.fragmentContextView = r7;
                frameLayout.addView(r7);
                dialogsActivityTopPanelLayout2.setCallFragmentContextView(r7);
                r1.addView(dialogsActivityTopPanelLayout2, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
                r7.setDelegate(new SharedMediaLayout$$ExternalSyntheticLambda11(r1));
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = r59.create(r1.scrollSlidingTextTabStrip, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(18.0f));
                blurredBackgroundDrawableCreate2.setPadding(AndroidUtilities.dp(6.666f));
                r1.scrollSlidingTextTabStrip.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
                r1.scrollSlidingTextTabStrip.setClipToPadding(false);
                r1.scrollSlidingTextTabStrip.setBackground(null);
                r1.scrollSlidingTextTabStrip.setBlurredBackground(blurredBackgroundDrawableCreate2);
                r1.scrollSlidingTextTabStrip.setOpen(false);
                r1.addView(r1.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
                Context context3 = r1.getContext();
                BaseFragment baseFragment4 = r1.profileActivity;
                int currentAccount = baseFragment4.getCurrentAccount();
                if (r1.includeSavedDialogs()) {
                    j2 = 0;
                } else {
                    j2 = r1.dialog_id;
                }
                final ?? r52 = r1;
                ?? r8 = new SearchTagsList(currentAccount, j2, context3, baseFragment4, resourcesProvider) {
                    @Override
                    public final void onShownUpdate(boolean z) {
                        SharedMediaLayout sharedMediaLayout3 = r52;
                        float f = 1.0f - this.shownT;
                        AnonymousClass39 anonymousClass310 = sharedMediaLayout3.scrollSlidingTextTabStrip;
                        anonymousClass310.setAlpha(f);
                        anonymousClass310.setPivotX(anonymousClass310.getWidth() / 2.0f);
                        anonymousClass310.setScaleX(((1.0f - this.shownT) * 0.2f) + 0.8f);
                        anonymousClass310.setPivotY(AndroidUtilities.dp(48.0f));
                        anonymousClass310.setScaleY(((1.0f - this.shownT) * 0.2f) + 0.8f);
                    }

                    @Override
                    public final boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                        AnonymousClass7 anonymousClass7;
                        SharedMediaLayout sharedMediaLayout3 = r52;
                        ActionBarMenuItem actionBarMenuItem7 = sharedMediaLayout3.searchItem;
                        if (actionBarMenuItem7 == null) {
                            return false;
                        }
                        sharedMediaLayout3.searchingReaction = visibleReaction;
                        String string = actionBarMenuItem7.getSearchField().getText().toString();
                        sharedMediaLayout3.searchWas = (string.length() == 0 && sharedMediaLayout3.searchingReaction == null) ? false : true;
                        sharedMediaLayout3.switchToCurrentSelectedMode(false);
                        int i27 = sharedMediaLayout3.mediaPages[0].selectedType;
                        if (i27 == 11) {
                            SavedMessagesSearchAdapter savedMessagesSearchAdapter = sharedMediaLayout3.savedMessagesSearchAdapter;
                            if (savedMessagesSearchAdapter != null) {
                                savedMessagesSearchAdapter.search(sharedMediaLayout3.searchingReaction, string);
                            }
                            AndroidUtilities.hideKeyboard(sharedMediaLayout3.searchItem.getSearchField());
                        } else if (i27 == 12 && (anonymousClass7 = sharedMediaLayout3.savedMessagesContainer) != null) {
                            ChatActivityContainer.AnonymousClass1 anonymousClass2 = anonymousClass7.chatActivity;
                            ChatActivity.AnonymousClass52 anonymousClass52 = anonymousClass2.actionBarSearchTags;
                            if (anonymousClass52 != null) {
                                anonymousClass52.setChosen(visibleReaction, true);
                            }
                            boolean z = (TextUtils.isEmpty(anonymousClass2.searchingQuery) && anonymousClass2.searchingReaction == null) ? false : true;
                            anonymousClass2.searching = z;
                            anonymousClass2.searchItemVisible = z;
                            anonymousClass2.updateBottomOverlay(false);
                            anonymousClass2.updateSearchUpDownButtonVisibility();
                        }
                        return true;
                    }

                    @Override
                    public final void updateTags(boolean z) {
                        super.updateTags(z);
                        SharedMediaLayout sharedMediaLayout3 = r52;
                        boolean z2 = sharedMediaLayout3.searching;
                        AnonymousClass31 anonymousClass33 = sharedMediaLayout3.searchTagsList;
                        show(z2 && (sharedMediaLayout3.getSelectedTab() == 11 || sharedMediaLayout3.getSelectedTab() == 12) && anonymousClass33.hasFilters());
                        ActionBarMenuItem actionBarMenuItem7 = sharedMediaLayout3.searchItemIcon;
                        if (actionBarMenuItem7 != null) {
                            int i27 = (hasFilters() && sharedMediaLayout3.profileActivity.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
                            RLottieImageView rLottieImageView2 = actionBarMenuItem7.iconView;
                            if (rLottieImageView2 != null && actionBarMenuItem7.iconViewResId != i27) {
                                if (z) {
                                    actionBarMenuItem7.iconViewResId = i27;
                                    AndroidUtilities.updateImageViewImageAnimated(rLottieImageView2, i27);
                                } else {
                                    actionBarMenuItem7.iconViewResId = i27;
                                    rLottieImageView2.setImageResource(i27);
                                }
                            }
                        }
                        ActionBarMenuItem actionBarMenuItem8 = sharedMediaLayout3.searchItem;
                        if (actionBarMenuItem8 != null) {
                            actionBarMenuItem8.setSearchFieldHint(LocaleController.getString((anonymousClass33 != null && anonymousClass33.hasFilters() && sharedMediaLayout3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                        }
                    }
                };
                ?? r9 = r52;
                r9.searchTagsList = r8;
                r8.setBlurredFactory(r59, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
                r8.setShown(0.0f);
                r9.addView(r8, LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
                r9.addView(r9.actionModeLayout, LayoutHelper.createFrame(-1, 48, 51));
                r2 = r9;
            }
            r2.updateTabs(false);
            r2.switchToCurrentSelectedMode(false);
            if (r2.hasMedia[0] >= 0) {
                r2.loadFastScrollData(false);
            }
            anonymousClass16 = r2.storiesContainer;
            if (anonymousClass16 != null && i3 > 0) {
                anonymousClass16.setInitialTabId(i3);
            }
            r2.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda18(r2, 3);
        }
        sharedMediaLayout2.botPreviewsContainer = sharedMediaLayout2.new AnonymousClass12(context2, sharedMediaLayout2.profileActivity, sharedMediaLayout2.dialog_id);
        resourcesProvider2 = resourcesProvider;
        r1 = sharedMediaLayout2;
        r1.setWillNotDraw(false);
        top = 0;
        iFindFirstVisibleItemPosition = -1;
        i5 = 0;
        while (true) {
            mediaPageArr = r1.mediaPages;
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
            r3 = new MediaPage(context2) {
                @Override
                public final void setTranslationX(float f) {
                    MediaPage[] mediaPageArr2;
                    MediaPage mediaPage9;
                    super.setTranslationX(f);
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    if (sharedMediaLayout3.tabsAnimationInProgress && (mediaPage9 = (mediaPageArr2 = sharedMediaLayout3.mediaPages)[0]) == this) {
                        float fAbs = Math.abs(mediaPage9.getTranslationX()) / mediaPageArr2[0].getMeasuredWidth();
                        sharedMediaLayout3.selectTabWithId(fAbs, mediaPageArr2[1].selectedType);
                        if (sharedMediaLayout3.canShowSearchItem()) {
                            int i27 = sharedMediaLayout3.searchItemState;
                            if (i27 == 2) {
                                sharedMediaLayout3.searchAlpha = 1.0f - fAbs;
                            } else if (i27 == 1) {
                                sharedMediaLayout3.searchAlpha = fAbs;
                            }
                            sharedMediaLayout3.updateSearchItemIcon(fAbs);
                            float photoVideoOptionsAlpha = sharedMediaLayout3.getPhotoVideoOptionsAlpha(fAbs);
                            sharedMediaLayout3.optionsAlpha = photoVideoOptionsAlpha;
                            sharedMediaLayout3.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !sharedMediaLayout3.canShowSearchItem() || sharedMediaLayout3.isArchivedOnlyStoriesView()) ? 4 : 0);
                        } else {
                            sharedMediaLayout3.searchAlpha = 0.0f;
                        }
                        sharedMediaLayout3.updateOptionsSearch(false);
                    }
                    sharedMediaLayout3.checkStoriesTabsPosition();
                    sharedMediaLayout3.checkUi_topPanelLayoutY();
                    sharedMediaLayout3.invalidateBlur();
                }
            };
            r1.addView(r3, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, r1.mediaPageTopMargin(), 0.0f, 0.0f));
            if (i5 == 1) {
                r3.setTranslationX(AndroidUtilities.displaySize.x);
            }
            r1.mediaPages[i5] = r3;
            r14 = new ExtendedGridLayoutManager() {
                public final Size size;

                {
                    super(100, false);
                    this.size = new Size();
                }

                @Override
                public final void calculateExtraLayoutSpace(RecyclerView.State state, int[] iArr4) {
                    super.calculateExtraLayoutSpace(state, iArr4);
                    AnonymousClass16 anonymousClass18 = r3;
                    int i27 = anonymousClass18.selectedType;
                    if (i27 == 0 || SharedMediaLayout.isAnyStoryPageType(i27)) {
                        iArr4[1] = Math.max(iArr4[1], SharedPhotoVideoCell.getItemSize(1) * 2);
                    } else if (anonymousClass18.selectedType == 1) {
                        iArr4[1] = Math.max(iArr4[1], AndroidUtilities.dp(56.0f) * 2);
                    }
                }

                @Override
                public final int getFlowItemCount() {
                    if (r3.listView.getAdapter() != SharedMediaLayout.this.gifAdapter) {
                        return 0;
                    }
                    return getItemCount();
                }

                @Override
                public final Size getSizeForItem(int i27) {
                    int i28;
                    int i29;
                    RecyclerView.Adapter adapter = r3.listView.getAdapter();
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    TLRPC.Document document = (adapter != sharedMediaLayout3.gifAdapter || sharedMediaLayout3.sharedMediaData[5].messages.isEmpty()) ? null : ((MessageObject) sharedMediaLayout3.sharedMediaData[5].messages.get(i27)).getDocument();
                    Size size = this.size;
                    size.height = 100.0f;
                    size.width = 100.0f;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                        if (closestPhotoSizeWithSize != null && (i28 = closestPhotoSizeWithSize.w) != 0 && (i29 = closestPhotoSizeWithSize.h) != 0) {
                            size.width = i28;
                            size.height = i29;
                        }
                        ArrayList<TLRPC.DocumentAttribute> arrayList2 = document.attributes;
                        for (int i30 = 0; i30 < arrayList2.size(); i30++) {
                            TLRPC.DocumentAttribute documentAttribute = arrayList2.get(i30);
                            if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                size.width = documentAttribute.w;
                                size.height = documentAttribute.h;
                                break;
                            }
                        }
                    }
                    return size;
                }

                @Override
                public final void onInitializeAccessibilityNodeInfoForItem(RecyclerView.Recycler recycler, RecyclerView.State state, View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                    super.onInitializeAccessibilityNodeInfoForItem(recycler, state, view, accessibilityNodeInfoCompat);
                    AccessibilityNodeInfo accessibilityNodeInfo = accessibilityNodeInfoCompat.mInfo;
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                    zzbe zzbeVar = collectionItemInfo != null ? new zzbe(collectionItemInfo, 10) : null;
                    if (zzbeVar != null) {
                        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) zzbeVar.zza;
                        if (collectionItemInfo2.isHeading()) {
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        }
                    }
                }
            };
            r3.layoutManager = r14;
            r14.setSpanSizeLookup(new BaseMenuWrapper() {
                @Override
                public final int getSpanSize(int i27) {
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    int[] iArr4 = sharedMediaLayout3.mediaColumnsCount;
                    AnonymousClass16 anonymousClass18 = r3;
                    int i28 = iArr4[SharedMediaLayout.isAnyStoryPageType(anonymousClass18.selectedType) ? 1 : 0];
                    RecyclerView.Adapter adapter = anonymousClass18.listView.getAdapter();
                    AnonymousClass6 anonymousClass6 = sharedMediaLayout3.photoVideoAdapter;
                    if (adapter == anonymousClass6) {
                        if (anonymousClass6.getItemViewType(i27) != 2) {
                            i28 = 1;
                        }
                    } else if (SharedMediaLayout.access$7500(sharedMediaLayout3, anonymousClass18.listView.getAdapter()) != -1) {
                        if (anonymousClass18.listView.getAdapter().getItemViewType(i27) != 2) {
                            i28 = 1;
                        }
                    } else if (anonymousClass18.listView.getAdapter() != sharedMediaLayout3.gifAdapter) {
                        i28 = anonymousClass18.layoutManager.mSpanCount;
                    } else if (anonymousClass18.listView.getAdapter() == sharedMediaLayout3.gifAdapter && sharedMediaLayout3.sharedMediaData[5].messages.isEmpty()) {
                        i28 = anonymousClass18.layoutManager.mSpanCount;
                    } else {
                        AnonymousClass17 anonymousClass110 = anonymousClass18.layoutManager;
                        anonymousClass110.checkLayout();
                        i28 = anonymousClass110.itemSpans.get(i27);
                    }
                    return Math.min(i28, anonymousClass18.layoutManager.mSpanCount);
                }
            });
            r1.mediaPages[i5].itemAnimator = new DefaultItemAnimator();
            r1.mediaPages[i5].itemAnimator.setDurations(280L);
            MediaPage mediaPage9 = r1.mediaPages[i5];
            DefaultItemAnimator defaultItemAnimator2 = mediaPage9.itemAnimator;
            CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator2.mAddInterpolator = cubicBezierInterpolator2;
            defaultItemAnimator2.mMoveInterpolator = cubicBezierInterpolator2;
            defaultItemAnimator2.mRemoveInterpolator = cubicBezierInterpolator2;
            defaultItemAnimator2.mChangeInterpolator = cubicBezierInterpolator2;
            defaultItemAnimator2.mSupportsChangeAnimations = false;
            mediaPage9.listView = new AnonymousClass19(context2, r3, r14);
            r1.mediaPages[i5].listView.setFastScrollEnabled(1);
            r1.mediaPages[i5].listView.setScrollingTouchSlop(1);
            r1.mediaPages[i5].listView.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
            r1.mediaPages[i5].listView.setPadding(0, AndroidUtilities.dp(54.0f), 0, 0);
            r1.mediaPages[i5].listView.setItemAnimator(null);
            r1.mediaPages[i5].listView.setClipToPadding(false);
            r1.mediaPages[i5].listView.setSectionsType(2);
            r1.mediaPages[i5].listView.setLayoutManager(r14);
            MediaPage mediaPage10 = r1.mediaPages[i5];
            mediaPage10.addView(mediaPage10.listView, LayoutHelper.createFrame(-1.0f, -1));
            r1.mediaPages[i5].animationSupportingListView = new InternalListView(context2);
            MediaPage mediaPage11 = r1.mediaPages[i5];
            ?? r10 = mediaPage11.animationSupportingListView;
            ?? r11 = new GridLayoutManager() {
                @Override
                public final int scrollVerticallyBy(int i27, RecyclerView.Recycler recycler, RecyclerView.State state) {
                    if (SharedMediaLayout.this.photoVideoChangeColumnsAnimation) {
                        i27 = 0;
                    }
                    return super.scrollVerticallyBy(i27, recycler, state);
                }

                @Override
                public final boolean supportsPredictiveItemAnimations() {
                    return false;
                }
            };
            mediaPage11.animationSupportingLayoutManager = r11;
            r10.setLayoutManager(r11);
            MediaPage mediaPage12 = r1.mediaPages[i5];
            mediaPage12.addView(mediaPage12.animationSupportingListView, LayoutHelper.createFrame(-1.0f, -1));
            r1.mediaPages[i5].animationSupportingListView.setVisibility(8);
            r1.mediaPages[i5].animationSupportingListView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    if (!(view instanceof SharedPhotoVideoCell2)) {
                        rect.left = 0;
                        rect.top = 0;
                        rect.bottom = 0;
                        rect.right = 0;
                        return;
                    }
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    AnonymousClass16 anonymousClass18 = r3;
                    anonymousClass18.animationSupportingListView.getClass();
                    int childAdapterPosition = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell2);
                    int i27 = anonymousClass18.animationSupportingLayoutManager.mSpanCount;
                    sharedPhotoVideoCell2.isTop = childAdapterPosition < i27;
                    int i28 = childAdapterPosition % i27;
                    sharedPhotoVideoCell2.isFirst = i28 == 0;
                    sharedPhotoVideoCell2.isLast = i28 == i27 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            r1.mediaPages[i5].listView.addItemDecoration(new RecyclerView.ItemDecoration() {
                @Override
                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                    AnonymousClass16 anonymousClass18 = r3;
                    if (anonymousClass18.listView.getAdapter() == SharedMediaLayout.this.gifAdapter) {
                        recyclerView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                        rect.left = 0;
                        rect.bottom = 0;
                        AnonymousClass17 anonymousClass110 = anonymousClass18.layoutManager;
                        anonymousClass110.checkLayout();
                        if (childAdapterPosition <= anonymousClass110.firstRowMax) {
                            rect.top = 0;
                        } else {
                            rect.top = AndroidUtilities.dp(2.0f);
                        }
                        AnonymousClass17 anonymousClass111 = anonymousClass18.layoutManager;
                        anonymousClass111.checkLayout();
                        rect.right = anonymousClass111.itemsToRow.get(childAdapterPosition, Integer.MAX_VALUE) == Integer.MAX_VALUE ? AndroidUtilities.dp(2.0f) : 0;
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
                    anonymousClass18.listView.getClass();
                    int childAdapterPosition2 = RecyclerView.getChildAdapterPosition(sharedPhotoVideoCell2);
                    int i27 = anonymousClass18.layoutManager.mSpanCount;
                    sharedPhotoVideoCell2.isTop = childAdapterPosition2 < i27;
                    int i28 = childAdapterPosition2 % i27;
                    sharedPhotoVideoCell2.isFirst = i28 == 0;
                    sharedPhotoVideoCell2.isLast = i28 == i27 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                }
            });
            r1.mediaPages[i5].listView.setOnItemClickListener(new ChatActivity$$ExternalSyntheticLambda124(r1, r3, context2, j, resourcesProvider2, 1));
            r1.mediaPages[i5].listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public final void onScrollStateChanged(RecyclerView recyclerView, int i27) {
                    SharedMediaLayout.this.scrolling = i27 != 0;
                }

                @Override
                public final void onScrolled(RecyclerView recyclerView, int i27, int i28) {
                    int i29;
                    int i30;
                    AnonymousClass17 anonymousClass18 = r14;
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    AnonymousClass16 anonymousClass110 = r3;
                    sharedMediaLayout3.checkLoadMoreScroll(anonymousClass110, (RecyclerListView) recyclerView, anonymousClass18);
                    SharedMediaData[] sharedMediaDataArr2 = sharedMediaLayout3.sharedMediaData;
                    if (i28 != 0 && ((i30 = sharedMediaLayout3.mediaPages[0].selectedType) == 0 || i30 == 5)) {
                        sharedMediaDataArr2[0].messages.isEmpty();
                    }
                    if (i28 != 0 && ((i29 = anonymousClass110.selectedType) == 0 || SharedMediaLayout.isAnyStoryPageType(i29))) {
                        SharedMediaLayout.showFastScrollHint(anonymousClass110, sharedMediaDataArr2, true);
                    }
                    anonymousClass110.listView.checkSection(true);
                    if (anonymousClass110.fastScrollHintView != null) {
                        anonymousClass110.invalidate();
                    }
                    sharedMediaLayout3.invalidateBlur();
                }
            });
            r1.mediaPages[i5].listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
                @Override
                public final boolean mo1082onItemClick(View view, int i27, float f, float f2) {
                    boolean z;
                    int iIntValue;
                    View view2 = view;
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    if (sharedMediaLayout3.photoVideoChangeColumnsAnimation) {
                        return false;
                    }
                    AnonymousClass16 anonymousClass18 = r3;
                    if (anonymousClass18.listView.getAdapter() == sharedMediaLayout3.savedMessagesSearchAdapter) {
                        return false;
                    }
                    if (!sharedMediaLayout3.isActionModeShowed || anonymousClass18.selectedType == 11) {
                        int i28 = anonymousClass18.selectedType;
                        if (i28 == 7 && (view2 instanceof UserCell)) {
                            ChatUsersAdapter chatUsersAdapter2 = sharedMediaLayout3.chatUsersAdapter;
                            if (chatUsersAdapter2.sortedUsers.isEmpty()) {
                                iIntValue = i27;
                            } else {
                                if (i27 >= chatUsersAdapter2.sortedUsers.size()) {
                                    return false;
                                }
                                iIntValue = ((Integer) chatUsersAdapter2.sortedUsers.get(i27)).intValue();
                            }
                            if (iIntValue < 0 || iIntValue >= chatUsersAdapter2.chatInfo.participants.participants.size()) {
                                return false;
                            }
                            TLRPC.ChatParticipant chatParticipant = chatUsersAdapter2.chatInfo.participants.participants.get(iIntValue);
                            RecyclerListView recyclerListView = (RecyclerListView) view2.getParent();
                            for (int i29 = 0; i29 < recyclerListView.getChildCount(); i29++) {
                                View childAt = recyclerListView.getChildAt(i29);
                                if (RecyclerView.getChildAdapterPosition(childAt) == i27) {
                                    view2 = childAt;
                                    break;
                                }
                            }
                            return sharedMediaLayout3.onMemberClick(chatParticipant, true, view2);
                        }
                        if (i28 == 1 && (view2 instanceof SharedDocumentCell)) {
                            return sharedMediaLayout3.onItemLongClick(((SharedDocumentCell) view2).getMessage(), view2, 0, true);
                        }
                        if (i28 == 3 && (view2 instanceof SharedLinkCell)) {
                            return sharedMediaLayout3.onItemLongClick(((SharedLinkCell) view2).getMessage(), view2, 0, true);
                        }
                        if ((i28 == 2 || i28 == 4) && (view2 instanceof SharedAudioCell)) {
                            return sharedMediaLayout3.onItemLongClick(((SharedAudioCell) view2).getMessage(), view2, 0, true);
                        }
                        if (i28 == 5 && (view2 instanceof ContextLinkCell)) {
                            return sharedMediaLayout3.onItemLongClick((MessageObject) ((ContextLinkCell) view2).getParentObject(), view2, 0, true);
                        }
                        if ((i28 == 0 || (SharedMediaLayout.isAnyStoryPageType(i28) && sharedMediaLayout3.canEditStories())) && (view2 instanceof SharedPhotoVideoCell2)) {
                            MessageObject messageObject = ((SharedPhotoVideoCell2) view2).getMessageObject();
                            if (messageObject != null) {
                                return sharedMediaLayout3.onItemLongClick(messageObject, view2, anonymousClass18.selectedType, true);
                            }
                            return false;
                        }
                        int i30 = anonymousClass18.selectedType;
                        if (i30 != 10) {
                            if (i30 != 11) {
                                return false;
                            }
                            sharedMediaLayout3.savedDialogsAdapter.select(view2);
                            return true;
                        }
                        ChannelRecommendationsAdapter channelRecommendationsAdapter = sharedMediaLayout3.channelRecommendationsAdapter;
                        if (i27 < 0) {
                            channelRecommendationsAdapter.getClass();
                            return true;
                        }
                        ArrayList arrayList2 = channelRecommendationsAdapter.chats;
                        if (i27 < arrayList2.size()) {
                            TLObject tLObject = (TLObject) arrayList2.get(i27);
                            Bundle bundle2 = new Bundle();
                            boolean z2 = tLObject instanceof TLRPC.Chat;
                            if (z2) {
                                bundle2.putLong("chat_id", ((TLRPC.Chat) tLObject).id);
                            } else if (tLObject instanceof TLRPC.User) {
                                bundle2.putLong("user_id", ((TLRPC.User) tLObject).id);
                            }
                            ChatActivity chatActivity = new ChatActivity(bundle2);
                            SharedMediaLayout sharedMediaLayout4 = SharedMediaLayout.this;
                            BaseFragment baseFragment5 = sharedMediaLayout4.profileActivity;
                            if (baseFragment5 instanceof ProfileActivity) {
                                ProfileActivity profileActivity = (ProfileActivity) baseFragment5;
                                if (profileActivity.blurredView == null) {
                                    z = true;
                                } else {
                                    int measuredWidth = (int) (profileActivity.fragmentView.getMeasuredWidth() / 6.0f);
                                    z = true;
                                    int measuredHeight = (int) (profileActivity.fragmentView.getMeasuredHeight() / 6.0f);
                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                                    canvas.scale(0.16666667f, 0.16666667f);
                                    profileActivity.fragmentView.draw(canvas);
                                    Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
                                    profileActivity.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
                                    profileActivity.blurredView.setAlpha(0.0f);
                                    profileActivity.blurredView.setVisibility(0);
                                }
                            } else {
                                z = true;
                            }
                            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert, 2, sharedMediaLayout4.getContext(), sharedMediaLayout4.resourcesProvider);
                            actionBarPopupWindowLayout.setBackgroundColor(sharedMediaLayout4.getThemedColor$13(Theme.key_actionBarDefaultSubmenuBackground));
                            if (!z2) {
                                if (!(tLObject instanceof TLRPC.User)) {
                                    return z;
                                }
                                baseFragment5.presentFragmentAsPreview(chatActivity);
                                return z;
                            }
                            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(0, sharedMediaLayout4.getContext(), null, false, false);
                            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                            actionBarMenuSubItem.setMinimumWidth(160);
                            actionBarMenuSubItem.setOnClickListener(new SearchField$$ExternalSyntheticLambda0(channelRecommendationsAdapter, 29));
                            ActionBarPopupWindow.ActionBarPopupWindowLayout.AnonymousClass2 anonymousClass2 = actionBarPopupWindowLayout.linearLayout;
                            anonymousClass2.addView(actionBarMenuSubItem);
                            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(0, sharedMediaLayout4.getContext(), null, false, false);
                            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                            actionBarMenuSubItem2.setMinimumWidth(160);
                            actionBarMenuSubItem2.setOnClickListener(new WearAuthSheet$$ExternalSyntheticLambda6(channelRecommendationsAdapter, (TLRPC.Chat) tLObject, i27, 11));
                            anonymousClass2.addView(actionBarMenuSubItem2);
                            baseFragment5.presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayout);
                            return z;
                        }
                    } else {
                        AnonymousClass19 anonymousClass110 = anonymousClass18.listView;
                        RecyclerListView.OnItemClickListener onItemClickListener = anonymousClass110.onItemClickListener;
                        if (onItemClickListener != null) {
                            onItemClickListener.onItemClick(i27, view2);
                            return true;
                        }
                        RecyclerListView.OnItemClickListenerExtended onItemClickListenerExtended = anonymousClass110.onItemClickListenerExtended;
                        if (onItemClickListenerExtended != null) {
                            onItemClickListenerExtended.onItemClick(view2, i27, 0.0f, 0.0f);
                            return true;
                        }
                    }
                    return true;
                }

                @Override
                public final void onLongClickRelease() {
                    BaseFragment baseFragment5 = SharedMediaLayout.this.profileActivity;
                    if (baseFragment5 != null) {
                        Point point = AndroidUtilities.displaySize;
                        if (point.x > point.y) {
                            baseFragment5.finishPreviewFragment();
                        }
                    }
                }

                @Override
                public final void onMove(float f) {
                    BaseFragment baseFragment5 = SharedMediaLayout.this.profileActivity;
                    if (baseFragment5 != null) {
                        Point point = AndroidUtilities.displaySize;
                        if (point.x > point.y) {
                            baseFragment5.movePreviewFragment(f);
                        }
                    }
                }
            });
            if (i5 == 0) {
                r14.scrollToPositionWithOffset(i7, i6);
            }
            final AnonymousClass19 anonymousClass110 = r1.mediaPages[i5].listView;
            r1.mediaPages[i5].animatingImageView = new ClippingImageView(context2) {
                @Override
                public final void invalidate() {
                    super.invalidate();
                    anonymousClass110.invalidate();
                }
            };
            r1.mediaPages[i5].animatingImageView.setVisibility(8);
            r1.mediaPages[i5].listView.addOverlayView(r1.mediaPages[i5].animatingImageView, LayoutHelper.createFrame(-1.0f, -1));
            r1.mediaPages[i5].progressView = new FlickerLoadingView(context2) {
                @Override
                public final int getColumnsCount() {
                    return SharedMediaLayout.this.mediaColumnsCount[SharedMediaLayout.isAnyStoryPageType(r3.selectedType) ? 1 : 0];
                }

                @Override
                public final int getViewType() {
                    setIsSingleCell(false);
                    int i27 = r3.selectedType;
                    if (i27 == 0 || i27 == 5) {
                        return 2;
                    }
                    if (i27 == 1) {
                        return 3;
                    }
                    if (i27 == 2 || i27 == 4) {
                        return 6;
                    }
                    if (i27 == 3) {
                        return 5;
                    }
                    if (i27 == 7) {
                        return 6;
                    }
                    if (i27 != 6) {
                        return SharedMediaLayout.isAnyStoryPageType(i27) ? 27 : 1;
                    }
                    if (getTabsCount() == 1) {
                        setIsSingleCell(true);
                    }
                    return 1;
                }

                @Override
                public final void onDraw(Canvas canvas) {
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    sharedMediaLayout3.backgroundPaint.setColor(sharedMediaLayout3.getThemedColor$13(Theme.key_windowBackgroundWhite));
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), sharedMediaLayout3.backgroundPaint);
                    super.onDraw(canvas);
                }
            };
            r1.mediaPages[i5].progressView.showDate();
            r1.mediaPages[i5].progressView.setClipToOutline(true);
            r1.mediaPages[i5].progressView.setOutlineProvider(new ViewOutlineProvider() {
                @Override
                public final void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), AndroidUtilities.dp(16.0f));
                }
            });
            if (i5 != 0) {
                r1.mediaPages[i5].setVisibility(8);
            }
            MediaPage mediaPage13 = r1.mediaPages[i5];
            mediaPage13.emptyView = new StickerEmptyView(context2, mediaPage13.progressView) {
                @Override
                public final void onVisibilityChange() {
                    invalidate();
                    SharedMediaLayout.this.onBottomButtonVisibilityChange();
                }
            };
            r1.mediaPages[i5].emptyView.setVisibility(8, false);
            r1.mediaPages[i5].emptyView.setAnimateLayoutChange(true);
            MediaPage mediaPage14 = r1.mediaPages[i5];
            mediaPage14.addView(mediaPage14.emptyView, LayoutHelper.createFrame(-1.0f, -1));
            r1.mediaPages[i5].emptyView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(22));
            r1.mediaPages[i5].emptyView.showProgress(true, false);
            r1.mediaPages[i5].emptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
            r1.mediaPages[i5].emptyView.button.setVisibility(8);
            r1.mediaPages[i5].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            r1.mediaPages[i5].emptyView.button.setVisibility(8);
            r1.mediaPages[i5].emptyView.addView(r1.mediaPages[i5].progressView, LayoutHelper.createFrame(-1, -1.0f, 119, 12.0f, 60.0f, 12.0f, 12.0f));
            r1.mediaPages[i5].listView.setEmptyView(r1.mediaPages[i5].emptyView);
            r1.mediaPages[i5].listView.setAnimateEmptyView(0, true);
            MediaPage mediaPage15 = r1.mediaPages[i5];
            mediaPage15.scrollHelper = new RecyclerAnimationScrollHelper(mediaPage15.listView, r1.mediaPages[i5].layoutManager);
            i5++;
            resourcesProvider2 = resourcesProvider;
            top = i6;
            iFindFirstVisibleItemPosition = i7;
        }
        anonymousClass15 = r1.storiesContainer;
        if (anonymousClass15 != null) {
            r1.addView(anonymousClass15, LayoutHelper.createFrame(-1, 42.0f, 48, 0.0f, 48.0f, 0.0f, 0.0f));
        }
        ChatActionCell chatActionCell2 = new ChatActionCell(context2);
        r1.floatingDateView = chatActionCell2;
        chatActionCell2.setCustomDate((int) (System.currentTimeMillis() / 1000), false, false);
        chatActionCell2.setAlpha(0.0f);
        chatActionCell2.setOverrideColor(Theme.key_chat_mediaTimeBackground, Theme.key_chat_mediaTimeText);
        chatActionCell2.setTranslationY(-AndroidUtilities.dp(48.0f));
        r1.addView(chatActionCell2, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 52.0f, 0.0f, 0.0f));
        zCustomTabs = r1.customTabs();
        r2 = r1;
        if (!zCustomTabs) {
            ?? dialogsActivityTopPanelLayout3 = new DialogsActivityTopPanelLayout(context2);
            r1.topPanelLayout = dialogsActivityTopPanelLayout3;
            dialogsActivityTopPanelLayout3.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate3 = r59.create(dialogsActivityTopPanelLayout3, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
            blurredBackgroundDrawableCreate3.setRadius(AndroidUtilities.dp(24.0f));
            blurredBackgroundDrawableCreate3.setPadding(AndroidUtilities.dp(7.0f));
            dialogsActivityTopPanelLayout3.setBlurredBackground(blurredBackgroundDrawableCreate3);
            ?? frameLayout2 = new FrameLayout(context2);
            r1.fragmentContextViewWrapper = frameLayout2;
            dialogsActivityTopPanelLayout3.addView(frameLayout2);
            dialogsActivityTopPanelLayout3.setViewVisible(frameLayout2, true, false);
            dialogsActivityTopPanelLayout3.setOnAnimatedHeightChangedListener(new SharedMediaLayout$$ExternalSyntheticLambda9(r1, 1));
            ?? r12 = new FragmentContextView(context2, baseFragment, this, resourcesProvider) {
                @Override
                public final void setVisibility(int i27) {
                    SharedMediaLayout sharedMediaLayout3 = SharedMediaLayout.this;
                    sharedMediaLayout3.topPanelLayout.setViewVisible(sharedMediaLayout3.fragmentContextViewWrapper, i27 == 0, true);
                }
            };
            r1.fragmentContextView = r12;
            frameLayout2.addView(r12);
            dialogsActivityTopPanelLayout3.setCallFragmentContextView(r12);
            r1.addView(dialogsActivityTopPanelLayout3, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, 34.0f, 0.0f, 0.0f));
            r12.setDelegate(new SharedMediaLayout$$ExternalSyntheticLambda11(r1));
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate4 = r59.create(r1.scrollSlidingTextTabStrip, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
            blurredBackgroundDrawableCreate4.setRadius(AndroidUtilities.dp(18.0f));
            blurredBackgroundDrawableCreate4.setPadding(AndroidUtilities.dp(6.666f));
            r1.scrollSlidingTextTabStrip.setPadding(0, AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f));
            r1.scrollSlidingTextTabStrip.setClipToPadding(false);
            r1.scrollSlidingTextTabStrip.setBackground(null);
            r1.scrollSlidingTextTabStrip.setBlurredBackground(blurredBackgroundDrawableCreate4);
            r1.scrollSlidingTextTabStrip.setOpen(false);
            r1.addView(r1.scrollSlidingTextTabStrip, LayoutHelper.createFrame(-2, 50.0f, 49, -2.0f, 0.0f, -2.0f, 0.0f));
            Context context4 = r1.getContext();
            BaseFragment baseFragment5 = r1.profileActivity;
            int currentAccount2 = baseFragment5.getCurrentAccount();
            if (r1.includeSavedDialogs()) {
                j2 = 0;
            } else {
                j2 = r1.dialog_id;
            }
            final SharedMediaLayout r53 = r1;
            ?? r13 = new SearchTagsList(currentAccount2, j2, context4, baseFragment5, resourcesProvider) {
                @Override
                public final void onShownUpdate(boolean z) {
                    SharedMediaLayout sharedMediaLayout3 = r53;
                    float f = 1.0f - this.shownT;
                    AnonymousClass39 anonymousClass310 = sharedMediaLayout3.scrollSlidingTextTabStrip;
                    anonymousClass310.setAlpha(f);
                    anonymousClass310.setPivotX(anonymousClass310.getWidth() / 2.0f);
                    anonymousClass310.setScaleX(((1.0f - this.shownT) * 0.2f) + 0.8f);
                    anonymousClass310.setPivotY(AndroidUtilities.dp(48.0f));
                    anonymousClass310.setScaleY(((1.0f - this.shownT) * 0.2f) + 0.8f);
                }

                @Override
                public final boolean setFilter(ReactionsLayoutInBubble.VisibleReaction visibleReaction) {
                    AnonymousClass7 anonymousClass7;
                    SharedMediaLayout sharedMediaLayout3 = r53;
                    ActionBarMenuItem actionBarMenuItem7 = sharedMediaLayout3.searchItem;
                    if (actionBarMenuItem7 == null) {
                        return false;
                    }
                    sharedMediaLayout3.searchingReaction = visibleReaction;
                    String string = actionBarMenuItem7.getSearchField().getText().toString();
                    sharedMediaLayout3.searchWas = (string.length() == 0 && sharedMediaLayout3.searchingReaction == null) ? false : true;
                    sharedMediaLayout3.switchToCurrentSelectedMode(false);
                    int i27 = sharedMediaLayout3.mediaPages[0].selectedType;
                    if (i27 == 11) {
                        SavedMessagesSearchAdapter savedMessagesSearchAdapter = sharedMediaLayout3.savedMessagesSearchAdapter;
                        if (savedMessagesSearchAdapter != null) {
                            savedMessagesSearchAdapter.search(sharedMediaLayout3.searchingReaction, string);
                        }
                        AndroidUtilities.hideKeyboard(sharedMediaLayout3.searchItem.getSearchField());
                    } else if (i27 == 12 && (anonymousClass7 = sharedMediaLayout3.savedMessagesContainer) != null) {
                        ChatActivityContainer.AnonymousClass1 anonymousClass2 = anonymousClass7.chatActivity;
                        ChatActivity.AnonymousClass52 anonymousClass52 = anonymousClass2.actionBarSearchTags;
                        if (anonymousClass52 != null) {
                            anonymousClass52.setChosen(visibleReaction, true);
                        }
                        boolean z = (TextUtils.isEmpty(anonymousClass2.searchingQuery) && anonymousClass2.searchingReaction == null) ? false : true;
                        anonymousClass2.searching = z;
                        anonymousClass2.searchItemVisible = z;
                        anonymousClass2.updateBottomOverlay(false);
                        anonymousClass2.updateSearchUpDownButtonVisibility();
                    }
                    return true;
                }

                @Override
                public final void updateTags(boolean z) {
                    super.updateTags(z);
                    SharedMediaLayout sharedMediaLayout3 = r53;
                    boolean z2 = sharedMediaLayout3.searching;
                    AnonymousClass31 anonymousClass33 = sharedMediaLayout3.searchTagsList;
                    show(z2 && (sharedMediaLayout3.getSelectedTab() == 11 || sharedMediaLayout3.getSelectedTab() == 12) && anonymousClass33.hasFilters());
                    ActionBarMenuItem actionBarMenuItem7 = sharedMediaLayout3.searchItemIcon;
                    if (actionBarMenuItem7 != null) {
                        int i27 = (hasFilters() && sharedMediaLayout3.profileActivity.getUserConfig().isPremium()) ? R.drawable.navbar_search_tag : R.drawable.outline_header_search;
                        RLottieImageView rLottieImageView2 = actionBarMenuItem7.iconView;
                        if (rLottieImageView2 != null && actionBarMenuItem7.iconViewResId != i27) {
                            if (z) {
                                actionBarMenuItem7.iconViewResId = i27;
                                AndroidUtilities.updateImageViewImageAnimated(rLottieImageView2, i27);
                            } else {
                                actionBarMenuItem7.iconViewResId = i27;
                                rLottieImageView2.setImageResource(i27);
                            }
                        }
                    }
                    ActionBarMenuItem actionBarMenuItem8 = sharedMediaLayout3.searchItem;
                    if (actionBarMenuItem8 != null) {
                        actionBarMenuItem8.setSearchFieldHint(LocaleController.getString((anonymousClass33 != null && anonymousClass33.hasFilters() && sharedMediaLayout3.getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
                    }
                }
            };
            ?? r15 = r53;
            r15.searchTagsList = r13;
            r13.setBlurredFactory(r59, BlurredBackgroundProviderImpl.topPanel(resourcesProvider));
            r13.setShown(0.0f);
            r15.addView(r13, LayoutHelper.createFrame(-1, 38.0f, 51, 0.0f, 4.0f, 0.0f, 0.0f));
            r15.addView(r15.actionModeLayout, LayoutHelper.createFrame(-1, 48, 51));
            r2 = r15;
        }
        r2.updateTabs(false);
        r2.switchToCurrentSelectedMode(false);
        if (r2.hasMedia[0] >= 0) {
            r2.loadFastScrollData(false);
        }
        anonymousClass16 = r2.storiesContainer;
        if (anonymousClass16 != null) {
            anonymousClass16.setInitialTabId(i3);
        }
        r2.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda18(r2, 3);
    }

    public static int access$12400(View view) {
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

    public static int access$7500(SharedMediaLayout sharedMediaLayout, RecyclerView.Adapter adapter) {
        if (adapter == sharedMediaLayout.storiesAdapter) {
            return 8;
        }
        if (adapter == sharedMediaLayout.archivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : sharedMediaLayout.storyAlbumsById.values()) {
            if (storyAlbumData.adapter == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    public static int access$9900(SharedMediaLayout sharedMediaLayout, RecyclerView.Adapter adapter) {
        if (adapter == sharedMediaLayout.animationSupportingStoriesAdapter) {
            return 8;
        }
        if (adapter == sharedMediaLayout.animationSupportingArchivedStoriesAdapter) {
            return 9;
        }
        for (StoryAlbumData storyAlbumData : sharedMediaLayout.storyAlbumsById.values()) {
            if (storyAlbumData.adapterSupport == adapter) {
                return storyAlbumData.tabType;
            }
        }
        return -1;
    }

    public static EmptyStubView createEmptyStubView(int i, long j, Context context, Theme.ResourcesProvider resourcesProvider) {
        EmptyStubView emptyStubView = new EmptyStubView(context, resourcesProvider);
        TextView textView = emptyStubView.emptyTextView;
        if (i == 0) {
            if (DialogObject.isEncryptedDialog(j)) {
                textView.setText(LocaleController.getString(R.string.NoMediaSecret));
                return emptyStubView;
            }
            textView.setText(LocaleController.getString(R.string.NoMedia));
            return emptyStubView;
        }
        if (i == 1) {
            if (DialogObject.isEncryptedDialog(j)) {
                textView.setText(LocaleController.getString(R.string.NoSharedFilesSecret));
                return emptyStubView;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedFiles));
            return emptyStubView;
        }
        if (i == 2) {
            if (DialogObject.isEncryptedDialog(j)) {
                textView.setText(LocaleController.getString(R.string.NoSharedVoiceSecret));
                return emptyStubView;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedVoice));
            return emptyStubView;
        }
        if (i == 3) {
            if (DialogObject.isEncryptedDialog(j)) {
                textView.setText(LocaleController.getString(R.string.NoSharedLinksSecret));
                return emptyStubView;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedLinks));
            return emptyStubView;
        }
        if (i == 4) {
            if (DialogObject.isEncryptedDialog(j)) {
                textView.setText(LocaleController.getString(R.string.NoSharedAudioSecret));
                return emptyStubView;
            }
            textView.setText(LocaleController.getString(R.string.NoSharedAudio));
            return emptyStubView;
        }
        if (i == 5) {
            if (DialogObject.isEncryptedDialog(j)) {
                textView.setText(LocaleController.getString(R.string.NoSharedGifSecret));
                return emptyStubView;
            }
            textView.setText(LocaleController.getString(R.string.NoGIFs));
            return emptyStubView;
        }
        ImageView imageView = emptyStubView.emptyImageView;
        if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(LocaleController.getString(R.string.NoGroupsInCommon));
            return emptyStubView;
        }
        if (i == 7) {
            imageView.setImageDrawable(null);
            textView.setText("");
        }
        return emptyStubView;
    }

    public StoriesController getStoriesController() {
        return MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getStoriesController();
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

    public static boolean isAnyStoryPageType(int i) {
        return i == 8 || i == 9 || isStoryAlbumPageType(i);
    }

    public static boolean isStoryAlbumPageType(int i) {
        return (i & (-65536)) == 65536;
    }

    public static void showFastScrollHint(MediaPage mediaPage, SharedMediaData[] sharedMediaDataArr, boolean z) {
        ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda29;
        if (!z) {
            if (mediaPage.fastScrollHintView == null || (shareAlert$$ExternalSyntheticLambda29 = mediaPage.fastScrollHideHintRunnable) == null) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(shareAlert$$ExternalSyntheticLambda29);
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
        Context context = mediaPage.getContext();
        SharedMediaFastScrollTooltip sharedMediaFastScrollTooltip = new SharedMediaFastScrollTooltip(context);
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.SharedMediaFastScrollHint));
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTextColor(Theme.getColor(null, Theme.key_chat_gifSaveHintText, false));
        sharedMediaFastScrollTooltip.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(null, Theme.key_chat_gifSaveHintBackground, false)));
        sharedMediaFastScrollTooltip.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
        sharedMediaFastScrollTooltip.addView(new SharedMediaFastScrollTooltip.TooltipDrawableView(context), LayoutHelper.createFrame(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
        mediaPage.fastScrollHintView = sharedMediaFastScrollTooltip;
        mediaPage.addView(sharedMediaFastScrollTooltip, LayoutHelper.createFrame(-2.0f, -2));
        mediaPage.fastScrollHintView.setAlpha(0.0f);
        mediaPage.fastScrollHintView.setScaleX(0.8f);
        mediaPage.fastScrollHintView.setScaleY(0.8f);
        mediaPage.fastScrollHintView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
        mediaPage.invalidate();
        ShareAlert$$ExternalSyntheticLambda29 shareAlert$$ExternalSyntheticLambda210 = new ShareAlert$$ExternalSyntheticLambda29(17, mediaPage, sharedMediaFastScrollTooltip);
        mediaPage.fastScrollHideHintRunnable = shareAlert$$ExternalSyntheticLambda210;
        AndroidUtilities.runOnUIThread(shareAlert$$ExternalSyntheticLambda210, 4000L);
    }

    public final SpannableStringBuilder addPostText() {
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

    public final void addStoryAlbumShareItemOptions(BaseFragment baseFragment, long j, int i, ItemOptions itemOptions) {
        String publicUsername = j > 0 ? UserObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getUser(Long.valueOf(j))) : ChatObject.getPublicUsername(MessagesController.getInstance(baseFragment.getCurrentAccount()).getChat(Long.valueOf(-j)));
        if (publicUsername == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        SurfaceContainer$$ExternalSyntheticOutline0.m(sb, MessagesController.getInstance(baseFragment.getCurrentAccount()).linkPrefix, "/", publicUsername, "/a/");
        sb.append(i);
        itemOptions.add(R.drawable.media_share, LocaleController.getString(R.string.StoriesAlbumMenuShareLink), new FilterGLThread$$ExternalSyntheticLambda1(this, sb.toString(), baseFragment, 27), false);
    }

    public final void addZoomInZoomOutItemOptions(ItemOptions itemOptions) {
        MediaPage mediaPage;
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
                        SharedMediaLayout sharedMediaLayout = this.f$0;
                        sharedMediaLayout.getClass();
                        View[] viewArr = viewArr;
                        sharedMediaLayout.zoomIn(viewArr[0], viewArr[1]);
                        break;
                    default:
                        SharedMediaLayout sharedMediaLayout2 = this.f$0;
                        sharedMediaLayout2.getClass();
                        View[] viewArr2 = viewArr;
                        sharedMediaLayout2.zoomOut(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
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
                        SharedMediaLayout sharedMediaLayout = this.f$0;
                        sharedMediaLayout.getClass();
                        View[] viewArr = viewArr;
                        sharedMediaLayout.zoomIn(viewArr[0], viewArr[1]);
                        break;
                    default:
                        SharedMediaLayout sharedMediaLayout2 = this.f$0;
                        sharedMediaLayout2.getClass();
                        View[] viewArr2 = viewArr;
                        sharedMediaLayout2.zoomOut(viewArr2[0], viewArr2[1]);
                        break;
                }
            }
        }, false);
        final View[] viewArr = {itemOptions.getItemAt(itemsCount), itemOptions.getItemAt(itemsCount + 1)};
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
            viewArr[0].setEnabled(false);
            viewArr[0].setAlpha(0.5f);
        } else {
            boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
            int i3 = this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
            if (i3 == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i3, true)) {
                viewArr[0].setEnabled(false);
                viewArr[0].setAlpha(0.5f);
            }
        }
        if (canZoomOut()) {
            return;
        }
        viewArr[1].setEnabled(false);
        viewArr[1].setAlpha(0.5f);
    }

    public final void animateItemsEnter(AnonymousClass19 anonymousClass19, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = anonymousClass19.getChildCount();
        View view = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = anonymousClass19.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            anonymousClass19.removeView(view);
        }
        getViewTreeObserver().addOnPreDrawListener(new AnonymousClass45(anonymousClass19, sparseBooleanArray, (FlickerLoadingView) view, i));
    }

    public final void animateSearchToOptions(boolean z, boolean z2) {
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null || this.animatingToOptions == z) {
            return;
        }
        this.animatingToOptions = z;
        if (z || rLottieImageView.getAnimatedDrawable().currentFrame >= 20) {
            rLottieImageView.getAnimatedDrawable().setCustomEndFrame(this.animatingToOptions ? 50 : 100);
        } else {
            rLottieImageView.getAnimatedDrawable().setCustomEndFrame(0);
        }
        if (z2) {
            rLottieImageView.getAnimatedDrawable().start();
        } else {
            rLottieImageView.getAnimatedDrawable().setCurrentFrame(rLottieImageView.getAnimatedDrawable().customEndFrame, true, false);
        }
    }

    public final void animateToMediaColumnsCount(int i) {
        int i2;
        int i3 = 2;
        int i4 = 1;
        MediaPage mediaPage = getMediaPage(this.changeColumnsTab);
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
            int paddingLeft = internalListView.getPaddingLeft();
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
            int i5 = 0;
            while (true) {
                MediaPage[] mediaPageArr = this.mediaPages;
                if (i5 >= mediaPageArr.length) {
                    break;
                }
                MediaPage mediaPage2 = mediaPageArr[i5];
                if (mediaPage2 != null && ((i2 = mediaPage2.selectedType) == 0 || isAnyStoryPageType(i2))) {
                    AndroidUtilities.updateVisibleRows(mediaPageArr[i5].listView);
                }
                i5++;
            }
            this.photoVideoChangeColumnsAnimation = true;
            if (this.changeColumnsTab == 0) {
                this.sharedMediaData[0].setListFrozen(true);
            }
            this.photoVideoChangeColumnsProgress = 0.0f;
            saveScrollPosition();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.notificationsLocker.lock();
            valueAnimatorOfFloat.addUpdateListener(new AnonymousClass35(this, mediaPage, i4));
            valueAnimatorOfFloat.addListener(new BotWebViewSheet.AnonymousClass16(this, isAnyStoryPageType(mediaPage.selectedType) ? 1 : 0, i, i3));
            valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            valueAnimatorOfFloat.setStartDelay(100L);
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.start();
        }
    }

    @Override
    public final boolean canClickButtonInside() {
        return false;
    }

    public final boolean canEditStories() {
        boolean zIsBot = isBot();
        long j = this.dialog_id;
        BaseFragment baseFragment = this.profileActivity;
        if (!zIsBot) {
            return isStoriesView() || (baseFragment != null && baseFragment.getMessagesController().getStoriesController().canEditStories(j));
        }
        TLRPC.User user = MessagesController.getInstance(baseFragment.getCurrentAccount()).getUser(Long.valueOf(j));
        return user != null && user.bot && user.bot_can_edit;
    }

    public boolean canShowSearchItem() {
        return !(this instanceof HashtagActivity.AnonymousClass5);
    }

    public final boolean canZoomOut() {
        MediaPage mediaPage;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null) {
            return false;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return false;
        }
        boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPageArr[0].selectedType);
        int i = this.mediaColumnsCount[zIsAnyStoryPageType ? 1 : 0];
        return i != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, i, false);
    }

    public final void changeMediaFilterType() {
        SharedMediaLayout sharedMediaLayout;
        Bitmap bitmapCreateBitmap;
        MediaPage mediaPage = getMediaPage(0);
        if (mediaPage == null || mediaPage.getMeasuredHeight() <= 0 || mediaPage.getMeasuredWidth() <= 0) {
            sharedMediaLayout = this;
        } else {
            try {
                bitmapCreateBitmap = Bitmap.createBitmap(mediaPage.getMeasuredWidth(), mediaPage.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
            } catch (Exception e) {
                FileLog.e(e);
                bitmapCreateBitmap = null;
            }
            Bitmap bitmap = bitmapCreateBitmap;
            if (bitmap != null) {
                this.changeTypeAnimation = true;
                mediaPage.listView.draw(new Canvas(bitmap));
                View view = new View(mediaPage.getContext());
                view.setBackground(new BitmapDrawable(bitmap));
                mediaPage.addView(view);
                sharedMediaLayout = this;
                view.animate().alpha(0.0f).setDuration(200L).setListener(new ProfileActivity.AnonymousClass47(sharedMediaLayout, view, mediaPage, bitmap, 3)).start();
                mediaPage.listView.setAlpha(0.0f);
                mediaPage.listView.animate().alpha(1.0f).setUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(mediaPage, 19)).setDuration(200L).start();
            } else {
                sharedMediaLayout = this;
            }
        }
        SharedMediaPreloader sharedMediaPreloader = sharedMediaLayout.sharedMediaPreloader;
        int[] iArr = sharedMediaPreloader.lastMediaCount;
        ArrayList arrayList = sharedMediaPreloader.sharedMediaData[0].messages;
        SharedMediaData[] sharedMediaDataArr = sharedMediaLayout.sharedMediaData;
        SharedMediaData sharedMediaData = sharedMediaDataArr[0];
        int[] iArr2 = sharedMediaData.totalCount;
        iArr2[1] = 0;
        int i = sharedMediaData.filterType;
        if (i == 0) {
            iArr2[0] = iArr[0];
        } else if (i == 1) {
            iArr2[0] = iArr[6];
        } else {
            iArr2[0] = iArr[7];
        }
        sharedMediaData.fastScrollDataLoaded = false;
        long j = sharedMediaLayout.dialog_id;
        jumpToDate(0, DialogObject.isEncryptedDialog(j) ? Integer.MIN_VALUE : Integer.MAX_VALUE, 0, true);
        loadFastScrollData(false);
        sharedMediaLayout.delegate.updateSelectedMediaTabText();
        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MessageObject messageObject = (MessageObject) arrayList.get(i2);
            SharedMediaData sharedMediaData2 = sharedMediaDataArr[0];
            int i3 = sharedMediaData2.filterType;
            if (i3 == 0) {
                sharedMediaData2.addMessage(messageObject, 0, false, zIsEncryptedDialog);
            } else if (i3 == 1) {
                if (messageObject.isPhoto()) {
                    sharedMediaDataArr[0].addMessage(messageObject, 0, false, zIsEncryptedDialog);
                }
            } else if (!messageObject.isPhoto()) {
                sharedMediaDataArr[0].addMessage(messageObject, 0, false, zIsEncryptedDialog);
            }
        }
    }

    public final void checkCurrentTabValid() {
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        if (anonymousClass39.hasTab(anonymousClass39.getCurrentTabId())) {
            return;
        }
        int firstTabId = anonymousClass39.getFirstTabId();
        anonymousClass39.setInitialTabId(firstTabId);
        this.mediaPages[0].selectedType = firstTabId;
        switchToCurrentSelectedMode(false);
    }

    public final void checkLoadMoreScroll(MediaPage mediaPage, RecyclerListView recyclerListView, LinearLayoutManager linearLayoutManager) {
        int i;
        int i2;
        SharedMediaData[] sharedMediaDataArr;
        ?? r5;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        StoriesController.StoriesList storiesList;
        if (this.photoVideoChangeColumnsAnimation || this.jumpToRunnable != null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (recyclerListView.getFastScroll() == null || !recyclerListView.getFastScroll().pressed || jCurrentTimeMillis - mediaPage.lastCheckScrollTime >= 300) {
            mediaPage.lastCheckScrollTime = jCurrentTimeMillis;
            if ((this.searching && this.searchWas && mediaPage.selectedType != 11) || mediaPage.selectedType == 7) {
                return;
            }
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iAbs = iFindFirstVisibleItemPosition == -1 ? 0 : Math.abs(linearLayoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition) + 1;
            int itemCount = recyclerListView.getAdapter() == null ? 0 : recyclerListView.getAdapter().getItemCount();
            int i3 = mediaPage.selectedType;
            int[] iArr = this.mediaColumnsCount;
            SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
            if (i3 == 0 || i3 == 1 || i3 == 2 || i3 == 4) {
                itemCount = sharedMediaDataArr2[i3].getStartOffset() + sharedMediaDataArr2[i3].messages.size();
                SharedMediaData sharedMediaData = sharedMediaDataArr2[i3];
                if (sharedMediaData.fastScrollDataLoaded && sharedMediaData.fastScrollPeriods.size() > 2 && mediaPage.selectedType == 0 && sharedMediaDataArr2[i3].messages.size() != 0) {
                    float f = i3 == 0 ? iArr[0] : 1;
                    int measuredHeight = (int) ((recyclerListView.getMeasuredHeight() / (recyclerListView.getMeasuredWidth() / f)) * f * 1.5f);
                    if (measuredHeight < 100) {
                        measuredHeight = 100;
                    }
                    if (measuredHeight < ((Period) sharedMediaDataArr2[i3].fastScrollPeriods.get(1)).startOffset) {
                        measuredHeight = ((Period) sharedMediaDataArr2[i3].fastScrollPeriods.get(1)).startOffset;
                    }
                    if ((iFindFirstVisibleItemPosition > itemCount && iFindFirstVisibleItemPosition - itemCount > measuredHeight) || ((i = iFindFirstVisibleItemPosition + iAbs) < sharedMediaDataArr2[i3].startOffset && sharedMediaDataArr2[0].startOffset - i > measuredHeight)) {
                        PollItemMenu$$ExternalSyntheticLambda17 pollItemMenu$$ExternalSyntheticLambda17 = new PollItemMenu$$ExternalSyntheticLambda17(this, i3, recyclerListView, 3);
                        this.jumpToRunnable = pollItemMenu$$ExternalSyntheticLambda17;
                        AndroidUtilities.runOnUIThread(pollItemMenu$$ExternalSyntheticLambda17);
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
                if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType == null || (storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList) == null || iFindFirstVisibleItemPosition + iAbs <= storiesList.getLoadedCount() - iArr[1] || storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList == null) {
                    return;
                }
                int iColumnsCount = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.columnsCount();
                int iMin = Math.min(100, Math.max(1, iColumnsCount / 2) * iColumnsCount * iColumnsCount);
                StoriesController.StoriesList storiesList2 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                storiesList2.getClass();
                storiesList2.load(iMin, Collections.EMPTY_LIST, false);
                return;
            }
            int i5 = mediaPage.selectedType;
            if (i5 == 6) {
                if (iAbs > 0) {
                    CommonGroupsAdapter commonGroupsAdapter = this.commonGroupsAdapter;
                    if (commonGroupsAdapter.endReached || commonGroupsAdapter.loading) {
                        return;
                    }
                    ArrayList arrayList = commonGroupsAdapter.chats;
                    if (arrayList.isEmpty() || iFindFirstVisibleItemPosition + iAbs < itemCount - 5) {
                        return;
                    }
                    commonGroupsAdapter.getChats(((TLRPC.Chat) zziq.m(1, arrayList)).id);
                    return;
                }
                return;
            }
            BaseFragment baseFragment = this.profileActivity;
            if (i5 == 11) {
                int iMax = -1;
                for (int i6 = 0; i6 < mediaPage.listView.getChildCount(); i6++) {
                    View childAt = mediaPage.listView.getChildAt(i6);
                    mediaPage.listView.getClass();
                    iMax = Math.max(RecyclerView.getChildAdapterPosition(childAt), iMax);
                }
                RecyclerView.Adapter adapter = mediaPage.listView.getAdapter();
                SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
                if (adapter != savedMessagesSearchAdapter) {
                    if (iMax + 1 >= baseFragment.getMessagesController().getSavedMessagesController().getLoadedCount()) {
                        baseFragment.getMessagesController().getSavedMessagesController().loadDialogs(false);
                        return;
                    }
                    return;
                } else {
                    if (iMax + 1 < savedMessagesSearchAdapter.loadedMessages.size() + savedMessagesSearchAdapter.dialogs.size() || savedMessagesSearchAdapter.endReached || savedMessagesSearchAdapter.loading) {
                        return;
                    }
                    savedMessagesSearchAdapter.loading = true;
                    savedMessagesSearchAdapter.sendRequest();
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
            if (iAbs + iFindFirstVisibleItemPosition > itemCount - i7 || sharedMediaDataArr2[i8].loadingAfterFastScroll) {
                SharedMediaData sharedMediaData2 = sharedMediaDataArr2[i8];
                if (sharedMediaData2.loading) {
                    sharedMediaDataArr = sharedMediaDataArr2;
                    r5 = 0;
                } else {
                    if (i5 == 0) {
                        int i9 = sharedMediaDataArr2[0].filterType;
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
                    if (zArr[0]) {
                        sharedMediaDataArr = sharedMediaDataArr2;
                        r5 = 0;
                        r5 = 0;
                        r5 = 0;
                        if (this.mergeDialogId != 0 && !zArr[1]) {
                            sharedMediaData2.loading = true;
                            baseFragment.getMediaDataController().loadMedia(this.mergeDialogId, 50, sharedMediaDataArr[i8].max_id[1], 0, i2, this.topicId, 1, baseFragment.getClassGuid(), sharedMediaDataArr[i8].requestIndex, null, null);
                        }
                    } else {
                        sharedMediaData2.loading = true;
                        sharedMediaDataArr = sharedMediaDataArr2;
                        r5 = 0;
                        baseFragment.getMediaDataController().loadMedia(this.dialog_id, 50, sharedMediaDataArr2[i8].max_id[0], 0, i2, this.topicId, 1, baseFragment.getClassGuid(), sharedMediaDataArr2[i8].requestIndex, null, null);
                    }
                }
            } else {
                sharedMediaDataArr = sharedMediaDataArr2;
                r5 = 0;
            }
            SharedMediaData sharedMediaData3 = sharedMediaDataArr[i8];
            int i10 = sharedMediaData3.startOffset;
            if (i8 == 0) {
                i10 = SharedMediaLayout.this.sharedMediaData[r5].startOffset;
            }
            if (iFindFirstVisibleItemPosition - i10 < i7 + 1 && !sharedMediaData3.loading && !sharedMediaData3.startReached && !sharedMediaData3.loadingAfterFastScroll) {
                loadFromStart(mediaPage.selectedType);
            }
            MediaPage mediaPage2 = this.mediaPages[r5];
            if (mediaPage2.listView == recyclerListView) {
                int i11 = mediaPage2.selectedType;
                if ((i11 != 0 && i11 != 5) || iFindFirstVisibleItemPosition == -1 || (viewHolderFindViewHolderForAdapterPosition = recyclerListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition)) == null) {
                    return;
                }
                int i12 = viewHolderFindViewHolderForAdapterPosition.mItemViewType;
                if (i12 == 0 || i12 == 12) {
                    View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                    boolean z = view instanceof SharedPhotoVideoCell;
                    ChatActionCell chatActionCell = this.floatingDateView;
                    if (!z) {
                        if (view instanceof ContextLinkCell) {
                            chatActionCell.setCustomDate(((ContextLinkCell) view).getDate(), r5, true);
                        }
                    } else {
                        SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) view;
                        MessageObject messageObject = sharedPhotoVideoCell.itemsCount <= 0 ? null : sharedPhotoVideoCell.messageObjects[r5];
                        if (messageObject != null) {
                            chatActionCell.setCustomDate(messageObject.messageOwner.date, r5, true);
                        }
                    }
                }
            }
        }
    }

    public final boolean checkPinchToZoom$1(MotionEvent motionEvent) {
        AnonymousClass12 anonymousClass12;
        MediaPage[] mediaPageArr = this.mediaPages;
        int i = mediaPageArr[0].selectedType;
        if (i == 13 && (anonymousClass12 = this.botPreviewsContainer) != null) {
            View currentView = anonymousClass12.viewPager.getCurrentView();
            if (currentView instanceof BotPreviewsEditContainer.BotPreviewsEditLangContainer) {
                BotPreviewsEditContainer.BotPreviewsEditLangContainer botPreviewsEditLangContainer = (BotPreviewsEditContainer.BotPreviewsEditLangContainer) currentView;
                if (botPreviewsEditLangContainer.list != null && botPreviewsEditLangContainer.getParent() != null) {
                    if (!botPreviewsEditLangContainer.columnsAnimation || botPreviewsEditLangContainer.isInPinchToZoomTouchMode) {
                        int actionMasked = motionEvent.getActionMasked();
                        BotPreviewsEditContainer.BotPreviewsEditLangContainer.AnonymousClass3 anonymousClass3 = botPreviewsEditLangContainer.listView;
                        if (actionMasked == 0 || motionEvent.getActionMasked() == 5) {
                            if (botPreviewsEditLangContainer.maybePinchToZoomTouchMode && !botPreviewsEditLangContainer.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                                botPreviewsEditLangContainer.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                botPreviewsEditLangContainer.pinchScale = 1.0f;
                                botPreviewsEditLangContainer.pointerId1 = motionEvent.getPointerId(0);
                                botPreviewsEditLangContainer.pointerId2 = motionEvent.getPointerId(1);
                                anonymousClass3.cancelClickRunnables(false);
                                anonymousClass3.cancelLongPress();
                                anonymousClass3.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                                View view = (View) botPreviewsEditLangContainer.getParent();
                                botPreviewsEditLangContainer.pinchCenterX = (int) ((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view.getX()) - botPreviewsEditLangContainer.getX());
                                int y = (int) ((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view.getY()) - botPreviewsEditLangContainer.getY());
                                int i2 = botPreviewsEditLangContainer.pinchCenterX;
                                botPreviewsEditLangContainer.pinchCenterPosition = -1;
                                int i3 = y + anonymousClass3.blurTopPadding;
                                for (int i4 = 0; i4 < anonymousClass3.getChildCount(); i4++) {
                                    View childAt = anonymousClass3.getChildAt(i4);
                                    Rect rect = botPreviewsEditLangContainer.rect;
                                    childAt.getHitRect(rect);
                                    if (rect.contains(i2, i3)) {
                                        botPreviewsEditLangContainer.pinchCenterPosition = RecyclerView.getChildLayoutPosition(childAt);
                                        botPreviewsEditLangContainer.pinchCenterOffset = childAt.getTop();
                                    }
                                }
                                botPreviewsEditLangContainer.maybePinchToZoomTouchMode2 = true;
                            }
                            if (motionEvent.getActionMasked() == 0) {
                                if ((motionEvent.getY() - ((View) botPreviewsEditLangContainer.getParent()).getY()) - botPreviewsEditLangContainer.getY() > 0.0f) {
                                    botPreviewsEditLangContainer.maybePinchToZoomTouchMode = true;
                                }
                            }
                        } else if (motionEvent.getActionMasked() == 2 && (botPreviewsEditLangContainer.isInPinchToZoomTouchMode || botPreviewsEditLangContainer.maybePinchToZoomTouchMode2)) {
                            int i5 = -1;
                            int i6 = -1;
                            for (int i7 = 0; i7 < motionEvent.getPointerCount(); i7++) {
                                if (botPreviewsEditLangContainer.pointerId1 == motionEvent.getPointerId(i7)) {
                                    i5 = i7;
                                }
                                if (botPreviewsEditLangContainer.pointerId2 == motionEvent.getPointerId(i7)) {
                                    i6 = i7;
                                }
                            }
                            if (i5 == -1 || i6 == -1) {
                                botPreviewsEditLangContainer.maybePinchToZoomTouchMode = false;
                                botPreviewsEditLangContainer.maybePinchToZoomTouchMode2 = false;
                                botPreviewsEditLangContainer.isInPinchToZoomTouchMode = false;
                                botPreviewsEditLangContainer.finishPinchToMediaColumnsCount();
                                return false;
                            }
                            float fHypot = ((float) Math.hypot(motionEvent.getX(i6) - motionEvent.getX(i5), motionEvent.getY(i6) - motionEvent.getY(i5))) / botPreviewsEditLangContainer.pinchStartDistance;
                            botPreviewsEditLangContainer.pinchScale = fHypot;
                            if (!botPreviewsEditLangContainer.isInPinchToZoomTouchMode && (fHypot > 1.01f || fHypot < 0.99f)) {
                                botPreviewsEditLangContainer.isInPinchToZoomTouchMode = true;
                                boolean z = fHypot > 1.0f;
                                botPreviewsEditLangContainer.pinchScaleUp = z;
                                botPreviewsEditLangContainer.startPinchToMediaColumnsCount(z);
                            }
                            if (botPreviewsEditLangContainer.isInPinchToZoomTouchMode) {
                                boolean z2 = botPreviewsEditLangContainer.pinchScaleUp;
                                if ((!z2 || botPreviewsEditLangContainer.pinchScale >= 1.0f) && (z2 || botPreviewsEditLangContainer.pinchScale <= 1.0f)) {
                                    botPreviewsEditLangContainer.columnsAnimationProgress = Math.max(0.0f, Math.min(1.0f, z2 ? ImageReceiver$$ExternalSyntheticOutline1.m(2.0f, botPreviewsEditLangContainer.pinchScale, 1.0f, 1.0f) : (1.0f - botPreviewsEditLangContainer.pinchScale) / 0.5f));
                                } else {
                                    botPreviewsEditLangContainer.columnsAnimationProgress = 0.0f;
                                }
                                float f = botPreviewsEditLangContainer.columnsAnimationProgress;
                                if (f == 1.0f || f == 0.0f) {
                                    if (f == 1.0f) {
                                        int iCeil = (int) Math.ceil(botPreviewsEditLangContainer.pinchCenterPosition / botPreviewsEditLangContainer.animateToColumnsCount);
                                        float measuredWidth = SharedMediaLayout.this.startedTrackingX / (anonymousClass3.getMeasuredWidth() - ((int) (anonymousClass3.getMeasuredWidth() / botPreviewsEditLangContainer.animateToColumnsCount)));
                                        int i8 = botPreviewsEditLangContainer.animateToColumnsCount;
                                        int itemCount = (iCeil * i8) + ((int) (measuredWidth * (i8 - 1)));
                                        BotPreviewsEditContainer.BotPreviewsEditLangContainer.AnonymousClass7 anonymousClass7 = botPreviewsEditLangContainer.adapter;
                                        if (itemCount >= anonymousClass7.getItemCount()) {
                                            itemCount = anonymousClass7.getItemCount() - 1;
                                        }
                                        botPreviewsEditLangContainer.pinchCenterPosition = itemCount;
                                    }
                                    botPreviewsEditLangContainer.finishPinchToMediaColumnsCount();
                                    if (botPreviewsEditLangContainer.columnsAnimationProgress == 0.0f) {
                                        botPreviewsEditLangContainer.pinchScaleUp = !botPreviewsEditLangContainer.pinchScaleUp;
                                    }
                                    botPreviewsEditLangContainer.startPinchToMediaColumnsCount(botPreviewsEditLangContainer.pinchScaleUp);
                                    botPreviewsEditLangContainer.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                                }
                                anonymousClass3.invalidate();
                            }
                        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((botPreviewsEditLangContainer.pointerId1 == motionEvent.getPointerId(0) && botPreviewsEditLangContainer.pointerId2 == motionEvent.getPointerId(1)) || (botPreviewsEditLangContainer.pointerId1 == motionEvent.getPointerId(1) && botPreviewsEditLangContainer.pointerId2 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && botPreviewsEditLangContainer.isInPinchToZoomTouchMode) {
                            botPreviewsEditLangContainer.maybePinchToZoomTouchMode2 = false;
                            botPreviewsEditLangContainer.maybePinchToZoomTouchMode = false;
                            botPreviewsEditLangContainer.isInPinchToZoomTouchMode = false;
                            botPreviewsEditLangContainer.finishPinchToMediaColumnsCount();
                        }
                        return botPreviewsEditLangContainer.isInPinchToZoomTouchMode;
                    }
                    return true;
                }
            }
            return false;
        }
        if ((i == 0 || isAnyStoryPageType(i)) && getParent() != null) {
            if (!this.photoVideoChangeColumnsAnimation || this.isInPinchToZoomTouchMode) {
                if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
                    if (this.maybePinchToZoomTouchMode && !this.isInPinchToZoomTouchMode && motionEvent.getPointerCount() == 2) {
                        this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        this.pinchScale = 1.0f;
                        this.pointerId1 = motionEvent.getPointerId(0);
                        this.pointerId2 = motionEvent.getPointerId(1);
                        mediaPageArr[0].listView.cancelClickRunnables(false);
                        mediaPageArr[0].listView.cancelLongPress();
                        mediaPageArr[0].listView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                        View view2 = (View) getParent();
                        this.pinchCenterX = (int) (((((int) ((motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f)) - view2.getX()) - getX()) - mediaPageArr[0].getX());
                        int y2 = (int) (((((int) ((motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f)) - view2.getY()) - getY()) - mediaPageArr[0].getY());
                        int i9 = this.pinchCenterX;
                        this.pinchCenterPosition = -1;
                        int i10 = y2 + mediaPageArr[0].listView.blurTopPadding;
                        if (getY() != 0.0f && this.viewType == 1) {
                            i10 = 0;
                        }
                        for (int i11 = 0; i11 < mediaPageArr[0].listView.getChildCount(); i11++) {
                            View childAt2 = mediaPageArr[0].listView.getChildAt(i11);
                            Rect rect2 = this.rect;
                            childAt2.getHitRect(rect2);
                            if (rect2.contains(i9, i10)) {
                                mediaPageArr[0].listView.getClass();
                                this.pinchCenterPosition = RecyclerView.getChildLayoutPosition(childAt2);
                                this.pinchCenterOffset = childAt2.getTop();
                            }
                        }
                        if (this.delegate.canSearchMembers() && this.pinchCenterPosition == -1) {
                            this.pinchCenterPosition = (int) (((this.mediaColumnsCount[isAnyStoryPageType(mediaPageArr[0].selectedType) ? 1 : 0] - 1) * Math.min(1.0f, Math.max(i9 / mediaPageArr[0].listView.getMeasuredWidth(), 0.0f))) + mediaPageArr[0].layoutManager.findFirstVisibleItemPosition());
                            this.pinchCenterOffset = 0;
                        }
                        this.maybePinchToZoomTouchMode2 = true;
                    }
                    if (motionEvent.getActionMasked() == 0) {
                        if (((motionEvent.getY() - ((View) getParent()).getY()) - getY()) - mediaPageArr[0].getY() > 0.0f) {
                            this.maybePinchToZoomTouchMode = true;
                        }
                    }
                } else if (motionEvent.getActionMasked() == 2 && (this.isInPinchToZoomTouchMode || this.maybePinchToZoomTouchMode2)) {
                    int i12 = -1;
                    int i13 = -1;
                    for (int i14 = 0; i14 < motionEvent.getPointerCount(); i14++) {
                        if (this.pointerId1 == motionEvent.getPointerId(i14)) {
                            i12 = i14;
                        }
                        if (this.pointerId2 == motionEvent.getPointerId(i14)) {
                            i13 = i14;
                        }
                    }
                    if (i12 == -1 || i13 == -1) {
                        this.maybePinchToZoomTouchMode = false;
                        this.maybePinchToZoomTouchMode2 = false;
                        this.isInPinchToZoomTouchMode = false;
                        finishPinchToMediaColumnsCount();
                        return false;
                    }
                    float fHypot2 = ((float) Math.hypot(motionEvent.getX(i13) - motionEvent.getX(i12), motionEvent.getY(i13) - motionEvent.getY(i12))) / this.pinchStartDistance;
                    this.pinchScale = fHypot2;
                    if (!this.isInPinchToZoomTouchMode && (fHypot2 > 1.01f || fHypot2 < 0.99f)) {
                        this.isInPinchToZoomTouchMode = true;
                        boolean z3 = fHypot2 > 1.0f;
                        this.pinchScaleUp = z3;
                        startPinchToMediaColumnsCount(z3);
                    }
                    if (this.isInPinchToZoomTouchMode) {
                        boolean z4 = this.pinchScaleUp;
                        if ((!z4 || this.pinchScale >= 1.0f) && (z4 || this.pinchScale <= 1.0f)) {
                            this.photoVideoChangeColumnsProgress = Math.max(0.0f, Math.min(1.0f, z4 ? ImageReceiver$$ExternalSyntheticOutline1.m(2.0f, this.pinchScale, 1.0f, 1.0f) : (1.0f - this.pinchScale) / 0.5f));
                        } else {
                            this.photoVideoChangeColumnsProgress = 0.0f;
                        }
                        float f2 = this.photoVideoChangeColumnsProgress;
                        if (f2 == 1.0f || f2 == 0.0f) {
                            RecyclerView.Adapter adapterStoryAlbums_getStoriesAdapterByTabType = isAnyStoryPageType(this.changeColumnsTab) ? storyAlbums_getStoriesAdapterByTabType(this.changeColumnsTab) : this.photoVideoAdapter;
                            if (this.photoVideoChangeColumnsProgress == 1.0f) {
                                int iCeil2 = (int) Math.ceil(this.pinchCenterPosition / this.animateToColumnsCount);
                                float measuredWidth2 = this.startedTrackingX / (mediaPageArr[0].listView.getMeasuredWidth() - ((int) (mediaPageArr[0].listView.getMeasuredWidth() / this.animateToColumnsCount)));
                                int i15 = this.animateToColumnsCount;
                                int itemCount2 = (iCeil2 * i15) + ((int) (measuredWidth2 * (i15 - 1)));
                                if (itemCount2 >= adapterStoryAlbums_getStoriesAdapterByTabType.getItemCount()) {
                                    itemCount2 = adapterStoryAlbums_getStoriesAdapterByTabType.getItemCount() - 1;
                                }
                                this.pinchCenterPosition = itemCount2;
                            }
                            finishPinchToMediaColumnsCount();
                            if (this.photoVideoChangeColumnsProgress == 0.0f) {
                                this.pinchScaleUp = !this.pinchScaleUp;
                            }
                            startPinchToMediaColumnsCount(this.pinchScaleUp);
                            this.pinchStartDistance = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                        }
                        mediaPageArr[0].listView.invalidate();
                        MediaPage mediaPage = mediaPageArr[0];
                        if (mediaPage.fastScrollHintView != null) {
                            mediaPage.invalidate();
                        }
                    }
                } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.pointerId1 == motionEvent.getPointerId(0) && this.pointerId2 == motionEvent.getPointerId(1)) || (this.pointerId1 == motionEvent.getPointerId(1) && this.pointerId2 == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.isInPinchToZoomTouchMode) {
                    this.maybePinchToZoomTouchMode2 = false;
                    this.maybePinchToZoomTouchMode = false;
                    this.isInPinchToZoomTouchMode = false;
                    finishPinchToMediaColumnsCount();
                }
                return this.isInPinchToZoomTouchMode;
            }
            return true;
        }
        return false;
    }

    public final void checkStoriesTabsPosition() {
        float fAbs;
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[0];
        if (mediaPage == null || mediaPageArr[1] == null) {
            return;
        }
        float f = 0.0f;
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (anonymousClass15 != null) {
            char c = (!isAnyStoryPageType(mediaPage.selectedType) || mediaPageArr[0].selectedType == 9) ? (char) 0 : (char) 1;
            if (c == (mediaPageArr[1].getVisibility() == 0 ? (!isAnyStoryPageType(mediaPageArr[1].selectedType) || mediaPageArr[1].selectedType == 9) ? (char) 0 : (char) 1 : c)) {
                fAbs = c != 0 ? 1.0f : 0.0f;
                anonymousClass15.setTranslationX(c != 0 ? 0.0f : mediaPageArr[0].getMeasuredWidth());
            } else {
                anonymousClass15.setTranslationX(mediaPageArr[c ^ 1].getTranslationX());
                fAbs = 1.0f - (Math.abs(anonymousClass15.getTranslationX()) / anonymousClass15.getMeasuredWidth());
            }
            float fClamp01 = 0.0f;
            for (int i = 0; i < mediaPageArr.length; i++) {
                if (mediaPageArr[i].getVisibility() == 0) {
                    AnonymousClass19 anonymousClass19 = mediaPageArr[i].listView;
                    View childAt = anonymousClass19.getChildCount() == 0 ? null : anonymousClass19.getChildAt(0);
                    fClamp01 += Utilities.clamp01(1.0f - (mediaPageArr[i].getTranslationX() / mediaPageArr[i].getMeasuredWidth())) * ((childAt == null ? -1 : RecyclerView.getChildAdapterPosition(childAt)) == 0 ? childAt.getY() - anonymousClass19.getPaddingTop() : anonymousClass19.getChildCount() == 0 ? 0.0f : -AndroidUtilities.dp(48.0f));
                }
            }
            float fClamp02 = Utilities.clamp01(1.0f - ((-fClamp01) / AndroidUtilities.dpf2(48.0f)));
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp02);
            anonymousClass15.setAlpha(fClamp02);
            anonymousClass15.setScaleX(fLerp);
            anonymousClass15.setScaleY(fLerp);
            anonymousClass15.setTranslationY(this.topPadding + fClamp01);
            f = fAbs;
        }
        checkUi_topPanelLayoutY();
        if (this.subTabsVisibilityFactor != f) {
            this.subTabsVisibilityFactor = f;
            invalidateBlur();
            invalidate();
        }
    }

    public final boolean checkTabsAnimationInProgress() {
        AnimatorSet animatorSet;
        if (!this.tabsAnimationInProgress) {
            return false;
        }
        boolean z = this.backAnimation;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (z) {
            if (Math.abs(mediaPageArr[0].getTranslationX()) < 1.0f) {
                mediaPageArr[0].setTranslationX(0.0f);
                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth() * (this.animatingForward ? 1 : -1));
                animatorSet = this.tabsAnimation;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.tabsAnimation = null;
                }
                this.tabsAnimationInProgress = false;
            }
        } else if (Math.abs(mediaPageArr[1].getTranslationX()) < 1.0f) {
            MediaPage mediaPage = mediaPageArr[0];
            mediaPage.setTranslationX(mediaPage.getMeasuredWidth() * (this.animatingForward ? -1 : 1));
            mediaPageArr[1].setTranslationX(0.0f);
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

    public final void checkUi_topPanelLayoutY() {
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        if (dialogsActivityTopPanelLayout != null) {
            AnonymousClass15 anonymousClass15 = this.storiesContainer;
            float visibilityFactor = 0.0f;
            if (anonymousClass15 != null) {
                visibilityFactor = 0.0f + (anonymousClass15.getVisibilityFactor() * AndroidUtilities.dp(38.0f) * (1.0f - Math.abs(anonymousClass15.getTranslationX() / anonymousClass15.getMeasuredWidth())));
            }
            dialogsActivityTopPanelLayout.setTranslationY(this.topPadding + visibilityFactor);
        }
    }

    public final boolean closeActionMode(boolean z) {
        SparseArray[] sparseArrayArr;
        if (!this.isActionModeShowed) {
            return false;
        }
        int i = 1;
        while (true) {
            sparseArrayArr = this.selectedFiles;
            if (i < 0) {
                break;
            }
            sparseArrayArr[i].clear();
            i--;
        }
        this.cantDeleteMessagesCount = 0;
        onActionModeSelectedUpdate(sparseArrayArr[0]);
        AnonymousClass12 anonymousClass12 = this.botPreviewsContainer;
        if (anonymousClass12 != null) {
            anonymousClass12.unselectAll();
            anonymousClass12.updateSelection();
        }
        showActionMode$1(false);
        updateRowsSelection(z);
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (savedDialogsAdapter != null) {
            savedDialogsAdapter.selectedDialogs.clear();
        }
        return true;
    }

    public boolean customTabs() {
        return this instanceof HashtagActivity.AnonymousClass5;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        AnonymousClass19 anonymousClass19;
        MessageObject messageObject;
        TL_stories.StoryItem storyItem;
        TL_stories.StoryViews storyViews;
        int i3;
        RecyclerView.Adapter adapter;
        int i4;
        AnonymousClass6 anonymousClass6;
        boolean z;
        PollAdapter pollAdapter;
        int i5;
        ArrayList arrayList;
        int size;
        int i6;
        int i7;
        boolean z2;
        int i8;
        AnonymousClass19 anonymousClass110;
        int i9;
        int itemCount;
        AnonymousClass19 anonymousClass111;
        int i10 = NotificationCenter.mediaDidLoad;
        BaseFragment baseFragment = this.profileActivity;
        RecyclerView.Adapter adapter2 = this.gifAdapter;
        SharedDocumentsAdapter sharedDocumentsAdapter = this.audioAdapter;
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        SharedDocumentsAdapter sharedDocumentsAdapter2 = this.voiceAdapter;
        SharedDocumentsAdapter sharedDocumentsAdapter3 = this.documentsAdapter;
        PollAdapter pollAdapter2 = this.pollAdapter;
        AnonymousClass6 anonymousClass7 = this.photoVideoAdapter;
        long j = this.dialog_id;
        MediaPage[] mediaPageArr = this.mediaPages;
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
        if (i == i10) {
            long jLongValue = ((Long) objArr[0]).longValue();
            int iIntValue = ((Integer) objArr[3]).intValue();
            int iIntValue2 = ((Integer) objArr[7]).intValue();
            int iIntValue3 = ((Integer) objArr[4]).intValue();
            boolean zBooleanValue = ((Boolean) objArr[6]).booleanValue();
            if (iIntValue3 == 6 || iIntValue3 == 7) {
                iIntValue3 = 0;
            }
            if (iIntValue != baseFragment.getClassGuid() || iIntValue2 != sharedMediaDataArr[iIntValue3].requestIndex) {
                if (this.sharedMediaPreloader == null || !sharedMediaDataArr[iIntValue3].messages.isEmpty() || sharedMediaDataArr[iIntValue3].loadingAfterFastScroll || !fillMediaData(iIntValue3)) {
                    return;
                }
                if (iIntValue3 == 0) {
                    adapter2 = anonymousClass7;
                } else if (iIntValue3 == 1) {
                    adapter2 = sharedDocumentsAdapter3;
                } else if (iIntValue3 == 2) {
                    adapter2 = sharedDocumentsAdapter2;
                } else if (iIntValue3 == 3) {
                    adapter2 = sharedLinksAdapter;
                } else if (iIntValue3 == 4) {
                    adapter2 = sharedDocumentsAdapter;
                } else if (iIntValue3 != 5) {
                    adapter2 = iIntValue3 == 15 ? pollAdapter2 : null;
                }
                if (adapter2 != null) {
                    for (int i11 = 0; i11 < mediaPageArr.length; i11++) {
                        MediaPage mediaPage = mediaPageArr[i11];
                        if (mediaPage != null && (anonymousClass110 = mediaPage.listView) != null && anonymousClass110.getAdapter() == adapter2) {
                            mediaPageArr[i11].listView.stopScroll();
                        }
                    }
                    adapter2.notifyDataSetChanged();
                }
                this.scrolling = true;
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[2];
            boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(j);
            int i12 = jLongValue == j ? 0 : 1;
            if (iIntValue3 != 0 && iIntValue3 != 1 && iIntValue3 != 2 && iIntValue3 != 4) {
                sharedMediaDataArr[iIntValue3].totalCount[i12] = ((Integer) objArr[1]).intValue();
            }
            if (iIntValue3 == 0) {
                i9 = iIntValue3;
                adapter2 = anonymousClass7;
            } else if (iIntValue3 == 1) {
                i9 = iIntValue3;
                adapter2 = sharedDocumentsAdapter3;
            } else if (iIntValue3 == 2) {
                i9 = iIntValue3;
                adapter2 = sharedDocumentsAdapter2;
            } else if (iIntValue3 == 3) {
                i9 = iIntValue3;
                adapter2 = sharedLinksAdapter;
            } else if (iIntValue3 == 4) {
                i9 = iIntValue3;
                adapter2 = sharedDocumentsAdapter;
            } else if (iIntValue3 == 5) {
                i9 = iIntValue3;
            } else if (iIntValue3 == 15) {
                adapter2 = pollAdapter2;
                i9 = 8;
            } else {
                i9 = iIntValue3;
                adapter2 = null;
            }
            int size2 = sharedMediaDataArr[i9].messages.size();
            if (adapter2 != null) {
                itemCount = adapter2.getItemCount();
                if (adapter2 instanceof RecyclerListView.SectionsAdapter) {
                    ((RecyclerListView.SectionsAdapter) adapter2).cleanupCache();
                }
            } else {
                itemCount = 0;
            }
            sharedMediaDataArr[i9].loading = false;
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            if (zBooleanValue) {
                ?? r14 = 1;
                int size3 = arrayList2.size() - 1;
                while (size3 >= 0) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(size3);
                    if (sharedMediaDataArr[i9].addMessage(messageObject2, i12, r14, zIsEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject2.getId(), r14);
                        SharedMediaData sharedMediaData = sharedMediaDataArr[i9];
                        int i13 = sharedMediaData.startOffset - r14;
                        sharedMediaData.startOffset = i13;
                        if (i13 < 0) {
                            sharedMediaData.startOffset = 0;
                        }
                    }
                    size3--;
                    r14 = 1;
                }
                sharedMediaDataArr[i9].startReached = ((Boolean) objArr[5]).booleanValue();
                SharedMediaData sharedMediaData2 = sharedMediaDataArr[i9];
                if (sharedMediaData2.startReached) {
                    sharedMediaData2.startOffset = 0;
                }
            } else {
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    MessageObject messageObject3 = (MessageObject) arrayList2.get(i14);
                    if (sharedMediaDataArr[i9].addMessage(messageObject3, i12, false, zIsEncryptedDialog)) {
                        sparseBooleanArray.put(messageObject3.getId(), true);
                        SharedMediaData sharedMediaData3 = sharedMediaDataArr[i9];
                        int i15 = sharedMediaData3.endLoadingStubs - 1;
                        sharedMediaData3.endLoadingStubs = i15;
                        if (i15 < 0) {
                            sharedMediaData3.endLoadingStubs = 0;
                        }
                    }
                }
                SharedMediaData sharedMediaData4 = sharedMediaDataArr[i9];
                if (sharedMediaData4.loadingAfterFastScroll && sharedMediaData4.messages.size() > 0) {
                    SharedMediaData sharedMediaData5 = sharedMediaDataArr[i9];
                    sharedMediaData5.min_id = ((MessageObject) sharedMediaData5.messages.get(0)).getId();
                }
                sharedMediaDataArr[i9].endReached[i12] = ((Boolean) objArr[5]).booleanValue();
                SharedMediaData sharedMediaData6 = sharedMediaDataArr[i9];
                if (sharedMediaData6.endReached[i12]) {
                    int size4 = sharedMediaData6.messagesDict[i12].size();
                    if (i12 == 0) {
                        size4 += sharedMediaDataArr[i9].startOffset;
                    }
                    sharedMediaDataArr[i9].totalCount[i12] = size4;
                }
            }
            if (!zBooleanValue && i12 == 0) {
                SharedMediaData sharedMediaData7 = sharedMediaDataArr[i9];
                if (sharedMediaData7.endReached[i12] && this.mergeDialogId != 0) {
                    sharedMediaData7.loading = true;
                    baseFragment.getMediaDataController().loadMedia(this.mergeDialogId, 50, sharedMediaDataArr[i9].max_id[1], 0, i9, this.topicId, 1, baseFragment.getClassGuid(), sharedMediaDataArr[i9].requestIndex, null, null);
                }
            }
            int i16 = i9;
            if (adapter2 != null) {
                AnonymousClass19 anonymousClass112 = null;
                for (int i17 = 0; i17 < mediaPageArr.length; i17++) {
                    MediaPage mediaPage2 = mediaPageArr[i17];
                    if (mediaPage2 != null && (anonymousClass111 = mediaPage2.listView) != null && anonymousClass111.getAdapter() == adapter2) {
                        AnonymousClass19 anonymousClass113 = mediaPageArr[i17].listView;
                        anonymousClass113.stopScroll();
                        anonymousClass112 = anonymousClass113;
                    }
                }
                int itemCount2 = adapter2.getItemCount();
                if (adapter2 != anonymousClass7) {
                    try {
                        adapter2.notifyDataSetChanged();
                    } catch (Throwable unused) {
                    }
                } else if (anonymousClass7.getItemCount() == itemCount) {
                    AndroidUtilities.updateVisibleRows(anonymousClass112);
                } else {
                    anonymousClass7.notifyDataSetChanged();
                }
                if (!sharedMediaDataArr[i16].messages.isEmpty() || sharedMediaDataArr[i16].loading) {
                    if (anonymousClass112 != null && (adapter2 == anonymousClass7 || itemCount2 >= itemCount)) {
                        animateItemsEnter(anonymousClass112, itemCount, sparseBooleanArray);
                    }
                } else if (anonymousClass112 != null) {
                    animateItemsEnter(anonymousClass112, itemCount, sparseBooleanArray);
                }
                if (anonymousClass112 != null && !sharedMediaDataArr[i16].loadingAfterFastScroll) {
                    if (size2 == 0) {
                        for (int i18 = 0; i18 < 2; i18++) {
                            if (mediaPageArr[i18].selectedType == 0) {
                                ((LinearLayoutManager) anonymousClass112.getLayoutManager()).scrollToPositionWithOffset(SharedMediaLayout.this.sharedMediaData[0].startOffset, 0);
                            }
                        }
                    } else {
                        saveScrollPosition();
                    }
                }
            }
            SharedMediaData sharedMediaData8 = sharedMediaDataArr[i16];
            if (sharedMediaData8.loadingAfterFastScroll) {
                if (sharedMediaData8.messages.size() == 0) {
                    loadFromStart(i16);
                } else {
                    sharedMediaDataArr[i16].loadingAfterFastScroll = false;
                }
            }
            this.scrolling = true;
            return;
        }
        if (i == NotificationCenter.messagesDeleted) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            TLRPC.Chat chat = DialogObject.isChatDialog(j) ? baseFragment.getMessagesController().getChat(Long.valueOf(-j)) : null;
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (ChatObject.isChannel(chat)) {
                if (jLongValue2 == 0) {
                    pollAdapter = pollAdapter2;
                    i5 = this.mergeDialogId != 0 ? 1 : 0;
                    arrayList = (ArrayList) objArr[0];
                    size = arrayList.size();
                    i6 = -1;
                    i7 = 0;
                    z2 = false;
                    while (i7 < size) {
                        int i19 = size;
                        i8 = 0;
                        while (i8 < sharedMediaDataArr.length) {
                            ArrayList arrayList3 = arrayList;
                            if (sharedMediaDataArr[i8].deleteMessage(((Integer) arrayList.get(i7)).intValue(), i5) != null) {
                                i6 = i8;
                                z2 = true;
                            }
                            i8++;
                            arrayList = arrayList3;
                        }
                        i7++;
                        size = i19;
                    }
                    if (z2) {
                        this.scrolling = true;
                        if (anonymousClass7 != null) {
                            anonymousClass7.notifyDataSetChanged();
                        }
                        if (sharedDocumentsAdapter3 != null) {
                            sharedDocumentsAdapter3.mObservable.notifyChanged();
                        }
                        if (sharedDocumentsAdapter2 != null) {
                            sharedDocumentsAdapter2.mObservable.notifyChanged();
                        }
                        if (sharedLinksAdapter != null) {
                            sharedLinksAdapter.update(false);
                        }
                        if (sharedDocumentsAdapter != null) {
                            sharedDocumentsAdapter.mObservable.notifyChanged();
                        }
                        if (pollAdapter != null) {
                            pollAdapter.regroup();
                            pollAdapter.mObservable.notifyChanged();
                        }
                        if (adapter2 != null) {
                            adapter2.mObservable.notifyChanged();
                        }
                        if (i6 != 0 || i6 == 1 || i6 == 2 || i6 == 4) {
                            loadFastScrollData(true);
                        }
                    }
                    getMediaPage(i6);
                    return;
                }
                pollAdapter = pollAdapter2;
                if (jLongValue2 != chat.id) {
                    return;
                }
            } else {
                pollAdapter = pollAdapter2;
                if (jLongValue2 != 0) {
                    return;
                }
            }
            arrayList = (ArrayList) objArr[0];
            size = arrayList.size();
            i6 = -1;
            i7 = 0;
            z2 = false;
            while (i7 < size) {
                int i110 = size;
                i8 = 0;
                while (i8 < sharedMediaDataArr.length) {
                    ArrayList arrayList4 = arrayList;
                    if (sharedMediaDataArr[i8].deleteMessage(((Integer) arrayList.get(i7)).intValue(), i5) != null) {
                        i6 = i8;
                        z2 = true;
                    }
                    i8++;
                    arrayList = arrayList4;
                }
                i7++;
                size = i110;
            }
            if (z2) {
                this.scrolling = true;
                if (anonymousClass7 != null) {
                    anonymousClass7.notifyDataSetChanged();
                }
                if (sharedDocumentsAdapter3 != null) {
                    sharedDocumentsAdapter3.mObservable.notifyChanged();
                }
                if (sharedDocumentsAdapter2 != null) {
                    sharedDocumentsAdapter2.mObservable.notifyChanged();
                }
                if (sharedLinksAdapter != null) {
                    sharedLinksAdapter.update(false);
                }
                if (sharedDocumentsAdapter != null) {
                    sharedDocumentsAdapter.mObservable.notifyChanged();
                }
                if (pollAdapter != null) {
                    pollAdapter.regroup();
                    pollAdapter.mObservable.notifyChanged();
                }
                if (adapter2 != null) {
                    adapter2.mObservable.notifyChanged();
                }
                if (i6 != 0) {
                    loadFastScrollData(true);
                } else {
                    loadFastScrollData(true);
                }
            }
            getMediaPage(i6);
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == j) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                boolean zIsEncryptedDialog2 = DialogObject.isEncryptedDialog(j);
                boolean z3 = false;
                int i20 = 0;
                while (i20 < arrayList5.size()) {
                    MessageObject messageObject4 = (MessageObject) arrayList5.get(i20);
                    ArrayList arrayList6 = arrayList5;
                    if (MessageObject.getMedia(messageObject4.messageOwner) == null || messageObject4.needDrawBluredPreview()) {
                        i4 = i20;
                    } else {
                        int mediaType = MediaDataController.getMediaType(messageObject4.messageOwner);
                        i4 = i20;
                        if (mediaType == -1) {
                            return;
                        }
                        SharedMediaData sharedMediaData9 = sharedMediaDataArr[mediaType];
                        if (sharedMediaData9.startReached) {
                            anonymousClass6 = anonymousClass7;
                            if (sharedMediaData9.addMessage(messageObject4, messageObject4.getDialogId() == j ? 0 : 1, true, zIsEncryptedDialog2)) {
                                this.hasMedia[mediaType] = 1;
                                z = true;
                            }
                            i20 = i4 + 1;
                            z3 = z;
                            anonymousClass7 = anonymousClass6;
                            arrayList5 = arrayList6;
                        }
                        z = z3;
                        i20 = i4 + 1;
                        z3 = z;
                        anonymousClass7 = anonymousClass6;
                        arrayList5 = arrayList6;
                    }
                    anonymousClass6 = anonymousClass7;
                    z = z3;
                    i20 = i4 + 1;
                    z3 = z;
                    anonymousClass7 = anonymousClass6;
                    arrayList5 = arrayList6;
                }
                AnonymousClass6 anonymousClass8 = anonymousClass7;
                int i21 = 1;
                if (z3) {
                    this.scrolling = true;
                    int i22 = 0;
                    while (i22 < mediaPageArr.length) {
                        int i23 = mediaPageArr[i22].selectedType;
                        if (i23 == 0) {
                            adapter = anonymousClass8;
                        } else if (i23 == i21) {
                            adapter = sharedDocumentsAdapter3;
                        } else if (i23 == 2) {
                            adapter = sharedDocumentsAdapter2;
                        } else {
                            if (i23 == 3) {
                                adapter = sharedLinksAdapter;
                            } else if (i23 == 4) {
                                adapter = sharedDocumentsAdapter;
                            } else if (i23 == 5) {
                                adapter = adapter2;
                            } else {
                                adapter = i23 == 15 ? pollAdapter2 : null;
                            }
                            if (adapter != null) {
                                adapter.getItemCount();
                                anonymousClass8.notifyDataSetChanged();
                                sharedDocumentsAdapter3.mObservable.notifyChanged();
                                sharedDocumentsAdapter2.mObservable.notifyChanged();
                                sharedLinksAdapter.update(false);
                                sharedDocumentsAdapter.mObservable.notifyChanged();
                                pollAdapter2.regroup();
                                pollAdapter2.mObservable.notifyChanged();
                                adapter2.mObservable.notifyChanged();
                            }
                            i22++;
                            i21 = 1;
                        }
                        if (adapter != null) {
                            adapter.getItemCount();
                            anonymousClass8.notifyDataSetChanged();
                            sharedDocumentsAdapter3.mObservable.notifyChanged();
                            sharedDocumentsAdapter2.mObservable.notifyChanged();
                            sharedLinksAdapter.update(false);
                            sharedDocumentsAdapter.mObservable.notifyChanged();
                            pollAdapter2.regroup();
                            pollAdapter2.mObservable.notifyChanged();
                            adapter2.mObservable.notifyChanged();
                        }
                        i22++;
                        i21 = 1;
                    }
                    updateTabs(true);
                    return;
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messageReceivedByServer) {
            if (((Boolean) objArr[6]).booleanValue()) {
                return;
            }
            Integer num = (Integer) objArr[0];
            Integer num2 = (Integer) objArr[1];
            Long l = (Long) objArr[3];
            if (l.longValue() == j || l.longValue() == this.mergeDialogId) {
                char c = l.longValue() == j ? (char) 0 : (char) 1;
                for (SharedMediaData sharedMediaData10 : sharedMediaDataArr) {
                    int iIntValue4 = num.intValue();
                    int iIntValue5 = num2.intValue();
                    MessageObject messageObject5 = (MessageObject) sharedMediaData10.messagesDict[c].get(iIntValue4);
                    if (messageObject5 != null) {
                        SparseArray[] sparseArrayArr = sharedMediaData10.messagesDict;
                        sparseArrayArr[c].remove(iIntValue4);
                        sparseArrayArr[c].put(iIntValue5, messageObject5);
                        messageObject5.messageOwner.id = iIntValue5;
                        int[] iArr = sharedMediaData10.max_id;
                        iArr[c] = Math.min(iIntValue5, iArr[c]);
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged || i == NotificationCenter.messagePlayingDidReset) {
            if (i != NotificationCenter.messagePlayingDidReset && i != NotificationCenter.messagePlayingPlayStateChanged) {
                if (((MessageObject) objArr[0]).eventId != 0) {
                    return;
                }
                for (int i24 = 0; i24 < mediaPageArr.length; i24++) {
                    int childCount = mediaPageArr[i24].listView.getChildCount();
                    for (int i25 = 0; i25 < childCount; i25++) {
                        View childAt = mediaPageArr[i24].listView.getChildAt(i25);
                        if (childAt instanceof SharedAudioCell) {
                            SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                            if (sharedAudioCell.getMessage() != null) {
                                sharedAudioCell.updateButtonState(false, true);
                            }
                        }
                    }
                }
                return;
            }
            for (int i26 = 0; i26 < mediaPageArr.length; i26++) {
                MediaPage mediaPage3 = mediaPageArr[i26];
                if (mediaPage3 != null && (anonymousClass19 = mediaPage3.listView) != null) {
                    int childCount2 = anonymousClass19.getChildCount();
                    for (int i27 = 0; i27 < childCount2; i27++) {
                        View childAt2 = mediaPageArr[i26].listView.getChildAt(i27);
                        if (childAt2 instanceof SharedAudioCell) {
                            SharedAudioCell sharedAudioCell2 = (SharedAudioCell) childAt2;
                            if (sharedAudioCell2.getMessage() != null) {
                                sharedAudioCell2.updateButtonState(false, true);
                            }
                        }
                    }
                }
            }
            return;
        }
        if (i == NotificationCenter.storiesListUpdated) {
            StoriesController.StoriesList storiesList = (StoriesController.StoriesList) objArr[0];
            AnonymousClass9 anonymousClass9 = this.storiesAdapter;
            if (anonymousClass9 == null || storiesList != anonymousClass9.storiesList) {
                AnonymousClass11 anonymousClass11 = this.archivedStoriesAdapter;
                if (anonymousClass11 == null || storiesList != anonymousClass11.storiesList) {
                    Iterator it = this.storyAlbumsById.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        StoryAlbumData storyAlbumData = (StoryAlbumData) it.next();
                        if (storyAlbumData.adapter.storiesList == storiesList) {
                            i3 = storyAlbumData.tabType;
                            break;
                        }
                    }
                } else {
                    i3 = 9;
                }
            } else {
                i3 = 8;
            }
            MediaPage mediaPage4 = getMediaPage(i3);
            if (mediaPage4 != null) {
                if (mediaPage4.fastScrollEnabled != (storiesList.getCount() > 0)) {
                    mediaPage4.fastScrollEnabled = storiesList.getCount() > 0;
                    updateFastScrollVisibility(mediaPage4, true);
                }
            }
            if (mediaPage4 != null) {
                AndroidUtilities.notifyDataSetChanged(mediaPage4.listView);
                if (mediaPage4.listView.getLayoutManager() instanceof LinearLayoutManager) {
                    RecyclerListView recyclerListView = mediaPage4.listView;
                    checkLoadMoreScroll(mediaPage4, recyclerListView, (LinearLayoutManager) recyclerListView.getLayoutManager());
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
            for (MediaPage mediaPage5 : mediaPageArr) {
                if (mediaPage5 != null && mediaPage5.listView != null && isAnyStoryPageType(mediaPage5.selectedType)) {
                    if (!isBot() || mediaPage5.listView.getAdapter() == null) {
                        for (int i28 = 0; i28 < mediaPage5.listView.getChildCount(); i28++) {
                            View childAt3 = mediaPage5.listView.getChildAt(i28);
                            if (childAt3 instanceof SharedPhotoVideoCell2) {
                                SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) childAt3;
                                boolean z4 = sharedPhotoVideoCell2.isStory;
                                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = sharedPhotoVideoCell2.viewsText;
                                if (!z4 || (messageObject = sharedPhotoVideoCell2.currentMessageObject) == null || (storyItem = messageObject.storyItem) == null || (storyViews = storyItem.views) == null) {
                                    sharedPhotoVideoCell2.drawViews = false;
                                    animatedTextDrawable.setText("", false, true);
                                } else {
                                    int i29 = storyViews.views_count;
                                    sharedPhotoVideoCell2.drawViews = i29 > 0;
                                    animatedTextDrawable.setText(AndroidUtilities.formatWholeNumber(i29, 0), true, true);
                                }
                            }
                        }
                    } else {
                        AndroidUtilities.notifyDataSetChanged(mediaPage5.listView);
                    }
                }
            }
            return;
        }
        if (i == NotificationCenter.channelRecommendationsLoaded) {
            if (((Long) objArr[0]).longValue() == j) {
                this.channelRecommendationsAdapter.update(true);
                updateTabs(true);
                checkCurrentTabValid();
                return;
            }
            return;
        }
        int i30 = NotificationCenter.savedMessagesDialogsUpdate;
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        if (i == i30) {
            if (j == 0 || j == baseFragment.getUserConfig().getClientUserId()) {
                savedDialogsAdapter.oldDialogs.clear();
                ArrayList arrayList7 = savedDialogsAdapter.oldDialogs;
                ArrayList arrayList8 = savedDialogsAdapter.dialogs;
                arrayList7.addAll(arrayList8);
                arrayList8.clear();
                arrayList8.addAll(savedDialogsAdapter.controller.allDialogs);
                savedDialogsAdapter.mObservable.notifyChanged();
                updateTabs(true);
                checkCurrentTabValid();
                onSelectedTabChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.dialogsNeedReload) {
            savedDialogsAdapter.oldDialogs.clear();
            ArrayList arrayList9 = savedDialogsAdapter.oldDialogs;
            ArrayList arrayList10 = savedDialogsAdapter.dialogs;
            arrayList9.addAll(arrayList10);
            arrayList10.clear();
            arrayList10.addAll(savedDialogsAdapter.controller.allDialogs);
            savedDialogsAdapter.mObservable.notifyChanged();
            return;
        }
        if (i == NotificationCenter.starUserGiftsLoaded) {
            if (((Long) objArr[0]).longValue() == j) {
                updateTabs(true);
                return;
            }
            return;
        }
        if (i == NotificationCenter.updatedChatRanks) {
            long jLongValue3 = ((Long) objArr[0]).longValue();
            long jLongValue4 = ((Long) objArr[1]).longValue();
            if (j != (-jLongValue3)) {
                return;
            }
            String str = (String) objArr[2];
            ChatUsersAdapter chatUsersAdapter = this.chatUsersAdapter;
            if (chatUsersAdapter != null) {
                TLRPC.ChatFull chatFull = chatUsersAdapter.chatInfo;
                if (chatFull != null && chatFull.participants != null) {
                    for (int i31 = 0; i31 < chatUsersAdapter.chatInfo.participants.participants.size(); i31++) {
                        chatUsersAdapter.chatInfo.participants.participants.get(i31).setRank(jLongValue4, str);
                    }
                }
                for (MediaPage mediaPage6 : mediaPageArr) {
                    if (mediaPage6.selectedType == 7) {
                        AndroidUtilities.updateVisibleRows(mediaPage6.listView);
                    }
                }
                return;
            }
            return;
        }
        if (i == NotificationCenter.didUpdatePollResults) {
            long jLongValue5 = ((Long) objArr[0]).longValue();
            TLRPC.TL_poll tL_poll = (TLRPC.TL_poll) objArr[1];
            TLRPC.PollResults pollResults = (TLRPC.PollResults) objArr[2];
            for (int i32 = 0; i32 < mediaPageArr.length; i32++) {
                if (mediaPageArr[i32].listView.getAdapter() == pollAdapter2) {
                    AnonymousClass19 anonymousClass114 = mediaPageArr[i32].listView;
                    for (int i33 = 0; i33 < pollAdapter2.groupedByDay.size(); i33++) {
                        MessageObject messageObject6 = (MessageObject) pollAdapter2.groupedByDay.get(i33);
                        if (messageObject6 != null && messageObject6.getPollId() == jLongValue5) {
                            TLRPC.MessageMedia messageMedia = messageObject6.messageOwner.media;
                            if (messageMedia instanceof TLRPC.TL_messageMediaPoll) {
                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                                if (tL_poll != null) {
                                    tL_messageMediaPoll.poll = tL_poll;
                                }
                                MessageObject.updatePollResults(tL_messageMediaPoll, pollResults);
                                pollAdapter2.notifyItemChanged(i33);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        if (anonymousClass39 != null) {
            canvas.save();
            canvas.translate(anonymousClass39.getX(), anonymousClass39.getY());
            anonymousClass39.getClass();
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        AnonymousClass30 anonymousClass30 = this.fragmentContextView;
        if (anonymousClass30 != null) {
            int i = anonymousClass30.currentStyle;
            if ((i == 3 || i == 1) && this.topPanelLayout == null) {
                canvas.save();
                canvas.translate(anonymousClass30.getX(), anonymousClass30.getY());
                anonymousClass30.setDrawOverlay(true);
                anonymousClass30.draw(canvas);
                anonymousClass30.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    public final boolean dispatchFastScrollEvent(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        MediaPage[] mediaPageArr = this.mediaPages;
        motionEvent.offsetLocation(x - mediaPageArr[0].listView.getFastScroll().getX(), (((-view.getY()) - getY()) - mediaPageArr[0].getY()) - mediaPageArr[0].listView.getFastScroll().getY());
        return mediaPageArr[0].listView.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public void drawBackgroundWithBlur(Canvas canvas, float f, Rect rect, Paint paint) {
        canvas.drawRect(rect, paint);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (view != this.fragmentContextView || this.topPanelLayout != null) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        MediaPage[] mediaPageArr = this.mediaPages;
        float top = mediaPageArr[0].getTop();
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (anonymousClass15 != null && ((i = mediaPageArr[0].selectedType) == 8 || isStoryAlbumPageType(i))) {
            top -= anonymousClass15.getVisualHeight();
        }
        canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + AndroidUtilities.dp(12.0f));
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public final void drawListForBlur(Canvas canvas, ArrayList arrayList) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            MediaPage mediaPage = mediaPageArr[i];
            if (mediaPage != null && mediaPage.getVisibility() == 0) {
                for (int i2 = 0; i2 < mediaPageArr[i].listView.getChildCount(); i2++) {
                    View childAt = mediaPageArr[i].listView.getChildAt(i2);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) + mediaPageArr[i].listView.blurTopPadding) {
                        int iSave = canvas.save();
                        canvas.translate(childAt.getX() + mediaPageArr[i].getX(), childAt.getY() + mediaPageArr[i].listView.getY() + mediaPageArr[i].getY() + getY());
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

    public final boolean fillMediaData(int i) {
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaPreloader.sharedMediaData;
        if (sharedMediaDataArr == null) {
            return false;
        }
        SharedMediaData[] sharedMediaDataArr2 = this.sharedMediaData;
        if (i == 0) {
            SharedMediaData sharedMediaData = sharedMediaDataArr2[i];
            if (!sharedMediaData.fastScrollDataLoaded) {
                int[] iArr = sharedMediaDataArr[i].totalCount;
                int i2 = iArr[0];
                int[] iArr2 = sharedMediaData.totalCount;
                iArr2[0] = i2;
                iArr2[1] = iArr[1];
            }
        } else {
            int[] iArr3 = sharedMediaDataArr2[i].totalCount;
            int[] iArr4 = sharedMediaDataArr[i].totalCount;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        sharedMediaDataArr2[i].messages.addAll(sharedMediaDataArr[i].messages);
        sharedMediaDataArr2[i].sections.addAll(sharedMediaDataArr[i].sections);
        for (Map.Entry entry : sharedMediaDataArr[i].sectionArrays.entrySet()) {
            sharedMediaDataArr2[i].sectionArrays.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i3 = 0; i3 < 2; i3++) {
            sharedMediaDataArr2[i].messagesDict[i3] = sharedMediaDataArr[i].messagesDict[i3].clone();
            SharedMediaData sharedMediaData2 = sharedMediaDataArr2[i];
            int[] iArr5 = sharedMediaData2.max_id;
            SharedMediaData sharedMediaData3 = sharedMediaDataArr[i];
            iArr5[i3] = sharedMediaData3.max_id[i3];
            sharedMediaData2.endReached[i3] = sharedMediaData3.endReached[i3];
        }
        sharedMediaDataArr2[i].fastScrollPeriods.addAll(sharedMediaDataArr[i].fastScrollPeriods);
        return !sharedMediaDataArr[i].messages.isEmpty();
    }

    public final void findPeriodAndJumpToDate(int i, RecyclerListView recyclerListView, boolean z) {
        ArrayList arrayList = this.sharedMediaData[i].fastScrollPeriods;
        int iFindFirstVisibleItemPosition = ((LinearLayoutManager) recyclerListView.getLayoutManager()).findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition >= 0) {
            Period period = null;
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (iFindFirstVisibleItemPosition <= ((Period) arrayList.get(i2)).startOffset) {
                        period = (Period) arrayList.get(i2);
                        break;
                    }
                }
                if (period == null) {
                    period = (Period) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
                }
            }
            if (period != null) {
                jumpToDate(i, period.maxId, period.startOffset + 1, z);
            }
        }
    }

    public final void finishPinchToMediaColumnsCount() {
        MediaPage[] mediaPageArr;
        MediaPage mediaPage;
        int i;
        RecyclerView.Adapter adapter;
        int i2 = 0;
        if (this.photoVideoChangeColumnsAnimation) {
            int i3 = 0;
            while (true) {
                mediaPageArr = this.mediaPages;
                if (i3 >= mediaPageArr.length) {
                    mediaPage = null;
                    break;
                }
                mediaPage = mediaPageArr[i3];
                if (mediaPage.selectedType == this.changeColumnsTab) {
                    break;
                } else {
                    i3++;
                }
            }
            if (mediaPage != null) {
                boolean zIsAnyStoryPageType = isAnyStoryPageType(mediaPage.selectedType);
                float f = this.photoVideoChangeColumnsProgress;
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (f != 1.0f) {
                    if (f == 0.0f) {
                        this.photoVideoChangeColumnsAnimation = false;
                        if (this.changeColumnsTab == 0) {
                            sharedMediaDataArr[0].setListFrozen(false);
                        }
                        mediaPage.animationSupportingListView.setVisibility(8);
                        mediaPage.listView.invalidate();
                        return;
                    }
                    boolean z = f > 0.2f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new AnonymousClass35(this, mediaPage, i2));
                    valueAnimatorOfFloat.addListener(new ChatActivity.AnonymousClass134(this, z, zIsAnyStoryPageType ? 1 : 0, mediaPage));
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                    valueAnimatorOfFloat.setDuration(200L);
                    valueAnimatorOfFloat.start();
                    return;
                }
                this.photoVideoChangeColumnsAnimation = false;
                int i4 = this.animateToColumnsCount;
                int[] iArr = this.mediaColumnsCount;
                iArr[zIsAnyStoryPageType ? 1 : 0] = i4;
                if (!zIsAnyStoryPageType) {
                    SharedConfig.setMediaColumnsCount(i4);
                } else if (getStoriesCount(mediaPage.selectedType) >= 5) {
                    SharedConfig.setStoriesColumnsCount(this.animateToColumnsCount);
                }
                for (int i5 = 0; i5 < mediaPageArr.length; i5++) {
                    MediaPage mediaPage2 = mediaPageArr[i5];
                    if (mediaPage2 != null && mediaPage2.listView != null && (((i = mediaPage2.selectedType) == 0 || isAnyStoryPageType(i)) && (adapter = mediaPageArr[i5].listView.getAdapter()) != null)) {
                        int itemCount = adapter.getItemCount();
                        if (i5 == 0) {
                            sharedMediaDataArr[0].setListFrozen(false);
                        }
                        mediaPageArr[i5].animationSupportingListView.setVisibility(8);
                        mediaPageArr[i5].layoutManager.setSpanCount(iArr[zIsAnyStoryPageType ? 1 : 0]);
                        mediaPageArr[i5].listView.invalidateItemDecorations();
                        mediaPageArr[i5].listView.invalidate();
                        if (adapter.getItemCount() == itemCount) {
                            AndroidUtilities.updateVisibleRows(mediaPageArr[i5].listView);
                        } else {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
                if (this.pinchCenterPosition < 0) {
                    saveScrollPosition();
                    return;
                }
                while (i2 < mediaPageArr.length) {
                    MediaPage mediaPage3 = mediaPageArr[i2];
                    if (mediaPage3.selectedType == this.changeColumnsTab) {
                        View viewFindViewByPosition = mediaPage3.animationSupportingLayoutManager.findViewByPosition(this.pinchCenterPosition);
                        if (viewFindViewByPosition != null) {
                            this.pinchCenterOffset = viewFindViewByPosition.getTop();
                        }
                        MediaPage mediaPage4 = mediaPageArr[i2];
                        AnonymousClass17 anonymousClass17 = mediaPage4.layoutManager;
                        anonymousClass17.scrollToPositionWithOffset(this.pinchCenterPosition, (-mediaPage4.listView.getPaddingTop()) + this.pinchCenterOffset, anonymousClass17.mShouldReverseLayout);
                    }
                    i2++;
                }
            }
        }
    }

    public final void fixLayoutInternal(int i) {
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

    public SparseArray<MessageObject> getActionModeSelected() {
        return this.selectedFiles[0];
    }

    public final String getBotPreviewsSubtitle(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        AnonymousClass12 anonymousClass12;
        if (!isBot()) {
            return LocaleController.getString(R.string.BotPreviewEmpty);
        }
        if (z && (anonymousClass12 = this.botPreviewsContainer) != null) {
            return anonymousClass12.getBotPreviewsSubtitle();
        }
        AnonymousClass9 anonymousClass9 = this.storiesAdapter;
        if (anonymousClass9 == null || anonymousClass9.storiesList == null) {
            i = 0;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < anonymousClass9.storiesList.messageObjects.size(); i3++) {
                MessageObject messageObject = (MessageObject) anonymousClass9.storiesList.messageObjects.get(i3);
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
        MediaPage mediaPage2;
        StoriesController.StoriesList storiesList;
        StoriesController.StoriesList storiesList2;
        float f = 1.0f;
        MediaPage[] mediaPageArr = this.mediaPages;
        if (mediaPageArr == null || (mediaPage = mediaPageArr[0]) == null || (mediaPage2 = mediaPageArr[1]) == null || mediaPage.emptyView == null || mediaPage2.emptyView == null) {
            return 1.0f;
        }
        int i = mediaPage.selectedType;
        int i2 = mediaPage2.selectedType;
        boolean z = isStoryAlbumPageType(i) || i == 8;
        boolean z2 = isStoryAlbumPageType(i2) || i2 == 8;
        if (!z && !z2) {
            return 1.0f;
        }
        float visibilityFactor = 1.0f - mediaPageArr[0].emptyView.getVisibilityFactor();
        float visibilityFactor2 = 1.0f - mediaPageArr[1].emptyView.getVisibilityFactor();
        StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(mediaPageArr[0].selectedType);
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
        return AndroidUtilities.lerp(visibilityFactor, f, Math.abs(mediaPageArr[0].getTranslationX() / mediaPageArr[0].getMeasuredWidth()));
    }

    public int getClosestTab() {
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[1];
        if (mediaPage != null && mediaPage.getVisibility() == 0) {
            if (this.tabsAnimationInProgress && !this.backAnimation) {
                return mediaPageArr[1].selectedType;
            }
            if (Math.abs(mediaPageArr[1].getTranslationX()) < mediaPageArr[1].getMeasuredWidth() / 2.0f) {
                return mediaPageArr[1].selectedType;
            }
        }
        return getSelectedTab();
    }

    public RecyclerListView getCurrentListView() {
        AnonymousClass7 anonymousClass7;
        MediaPage mediaPage = this.mediaPages[0];
        int i = mediaPage.selectedType;
        if (i == 13) {
            return this.botPreviewsContainer.getCurrentListView();
        }
        if (i == 14) {
            return this.giftsContainer.getCurrentListView();
        }
        return (i != 12 || (anonymousClass7 = this.savedMessagesContainer) == null) ? mediaPage.listView : anonymousClass7.chatActivity.chatListView;
    }

    public int getInitialTab() {
        return 0;
    }

    public final MediaPage getMediaPage(int i) {
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

    public final int getNextMediaColumnsCount(int i, int i2, boolean z) {
        int i3 = i2 + (!z ? 1 : -1);
        if (i3 > 6) {
            i3 = !z ? 9 : 6;
        }
        return Utilities.clamp(i3, 9, (this.allowStoriesSingleColumn && i == 1) ? 1 : 2);
    }

    public final int getPagePaddingBottom(boolean z) {
        return this.pagesPaddingBottom + (z ? AndroidUtilities.dp(52.0f) : 0);
    }

    public final int getPagePaddingTop(int i) {
        int iDp = AndroidUtilities.dp(54.0f) + this.topLayoutPadding;
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        return iDp + ((int) ((anonymousClass15 == null || !(isStoryAlbumPageType(i) || i == 8)) ? 0.0f : anonymousClass15.getVisibilityFactor() * AndroidUtilities.dp(40.0f))) + (i == 9 ? AndroidUtilities.dp(64.0f) : 0);
    }

    public final float getPhotoVideoOptionsAlpha(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[1];
        AnonymousClass13 anonymousClass13 = this.giftsContainer;
        if (mediaPage != null && ((i3 = mediaPage.selectedType) == 0 || (((i3 == 8 || isStoryAlbumPageType(i3)) && TextUtils.isEmpty(getStoriesHashtag())) || (i4 = mediaPageArr[1].selectedType) == 9 || i4 == 11 || i4 == 13 || (i4 == 14 && anonymousClass13 != null)))) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = mediaPageArr[0];
        return (mediaPage2 == null || !((i = mediaPage2.selectedType) == 0 || (((i == 8 || isStoryAlbumPageType(i)) && TextUtils.isEmpty(getStoriesHashtag())) || (i2 = mediaPageArr[0].selectedType) == 9 || i2 == 11 || i2 == 13 || (i2 == 14 && anonymousClass13 != null)))) ? f2 : (1.0f - f) + f2;
    }

    public int getPhotosVideosTypeFilter() {
        return this.sharedMediaData[0].filterType;
    }

    public TextView getSaveItem() {
        return this.saveItem;
    }

    public final float getSearchAlpha(float f) {
        float f2 = 0.0f;
        if (isArchivedOnlyStoriesView()) {
            return 0.0f;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[1];
        if (mediaPage != null && isSearchItemVisible(mediaPage.selectedType) && mediaPageArr[1].selectedType != 11) {
            f2 = 0.0f + f;
        }
        MediaPage mediaPage2 = mediaPageArr[0];
        return (mediaPage2 == null || !isSearchItemVisible(mediaPage2.selectedType) || mediaPageArr[0].selectedType == 11) ? f2 : (1.0f - f) + f2;
    }

    public ActionBarMenuItem getSearchItem() {
        return this.searchItem;
    }

    public RLottieImageView getSearchOptionsItem() {
        return this.optionsSearchImageView;
    }

    public int getSelectedTab() {
        int currentTabId = getCurrentTabId();
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (anonymousClass15 == null || currentTabId != 8) {
            return currentTabId;
        }
        int currentAlbumId = anonymousClass15.getCurrentAlbumId();
        if (currentAlbumId == 0) {
            return 8;
        }
        return currentAlbumId > 0 ? storyAlbums_getByAlbumId(currentAlbumId).tabType : currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public final int getStoriesCount(int i) {
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

    public final float getTabTranslationX(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                break;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null) {
                int i4 = mediaPage.selectedType;
                if ((z && i == 8 && isStoryAlbumPageType(i4)) || i4 == i) {
                    i3++;
                    width = mediaPageArr[i2].getTranslationX();
                }
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final float getTabVisibility(int i, boolean z) {
        float fAbs = 0.0f;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return fAbs;
            }
            MediaPage mediaPage = mediaPageArr[i2];
            if (mediaPage != null) {
                int i3 = mediaPage.selectedType;
                if ((z && i == 8 && isStoryAlbumPageType(i3)) || i3 == i) {
                    fAbs = (1.0f - Math.abs(mediaPageArr[i2].getTranslationX() / getWidth())) + fAbs;
                }
            }
            i2++;
        }
    }

    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.selectedMessagesCountTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        ActionBarMenuItem actionBarMenuItem = this.deleteItem;
        RLottieImageView iconView = actionBarMenuItem.getIconView();
        int i = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(iconView, 8, null, null, null, null, i));
        int i2 = Theme.key_actionBarActionModeDefaultSelector;
        arrayList.add(new ThemeDescription(actionBarMenuItem, 32, null, null, null, null, i2));
        ActionBarMenuItem actionBarMenuItem2 = this.gotoItem;
        if (actionBarMenuItem2 != null) {
            arrayList.add(new ThemeDescription(actionBarMenuItem2.getIconView(), 8, null, null, null, null, i));
            arrayList.add(new ThemeDescription(actionBarMenuItem2, 32, null, null, null, null, i2));
        }
        ActionBarMenuItem actionBarMenuItem3 = this.forwardItem;
        if (actionBarMenuItem3 != null) {
            arrayList.add(new ThemeDescription(actionBarMenuItem3.getIconView(), 8, null, null, null, null, i));
            arrayList.add(new ThemeDescription(actionBarMenuItem3, 32, null, null, null, null, i2));
        }
        ImageView imageView = this.closeButton;
        arrayList.add(new ThemeDescription(imageView, 8, null, null, new Drawable[]{this.backDrawable}, null, i));
        arrayList.add(new ThemeDescription(imageView, 32, null, null, null, null, i2));
        int i3 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.actionModeLayout, 1, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 1, null, null, null, null, i3));
        ChatActionCell chatActionCell = this.floatingDateView;
        arrayList.add(new ThemeDescription(chatActionCell, 0, null, null, null, null, Theme.key_chat_mediaTimeBackground));
        arrayList.add(new ThemeDescription(chatActionCell, 0, null, null, null, null, Theme.key_chat_mediaTimeText));
        arrayList.add(new ThemeDescription(this.scrollSlidingTextTabStrip, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, null, null, -1, null, Theme.key_profile_tabSelectedLine));
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        arrayList.add(new ThemeDescription(anonymousClass39.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelectedText));
        arrayList.add(new ThemeDescription(anonymousClass39.getTabsContainer(), 262148, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabText));
        arrayList.add(new ThemeDescription(anonymousClass39.getTabsContainer(), 65568, new Class[]{TextView.class}, null, null, null, Theme.key_profile_tabSelector));
        AnonymousClass30 anonymousClass30 = this.fragmentContextView;
        if (anonymousClass30 != null) {
            arrayList.add(new ThemeDescription(anonymousClass30, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_inappPlayerBackground));
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
                    SharedMediaLayout.MediaPage[] mediaPageArr2 = this.f$0.mediaPages;
                    int i5 = i4;
                    SharedMediaLayout.AnonymousClass19 anonymousClass19 = mediaPageArr2[i5].listView;
                    if (anonymousClass19 != null) {
                        int childCount = anonymousClass19.getChildCount();
                        for (int i6 = 0; i6 < childCount; i6++) {
                            View childAt = mediaPageArr2[i5].listView.getChildAt(i6);
                            if (childAt instanceof SharedPhotoVideoCell) {
                                SharedPhotoVideoCell sharedPhotoVideoCell = (SharedPhotoVideoCell) childAt;
                                for (int i7 = 0; i7 < 6; i7++) {
                                    sharedPhotoVideoCell.photoVideoViews[i7].checkBox.invalidate();
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

                @Override
                public final void onAnimationProgress(float f) {
                }
            };
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
            AnonymousClass27 anonymousClass27 = mediaPageArr[i4].progressView;
            int i5 = Theme.key_windowBackgroundWhite;
            arrayList.add(new ThemeDescription(anonymousClass27, 0, null, null, null, null, i5));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4096, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 524288, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 524304, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
            int i6 = Theme.key_progressCircle;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, i6));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{UserCell.class}, new String[]{"adminTextView"}, null, null, -1, null, Theme.key_profile_creatorIcon));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
            int i7 = Theme.key_windowBackgroundWhiteBlackText;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i7));
            int i8 = Theme.key_windowBackgroundWhiteGrayText;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, null, null, -1, themeDescriptionDelegate, i8));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
            Drawable[] drawableArr = Theme.avatarDrawables;
            int i9 = Theme.key_avatar_text;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{UserCell.class}, null, drawableArr, null, i9));
            TextPaint[] textPaintArr = Theme.dialogs_namePaint;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{ProfileSearchCell.class}, null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, null, -1, null, Theme.key_chats_name));
            TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{ProfileSearchCell.class}, null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, null, -1, null, Theme.key_chats_secretName));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{ProfileSearchCell.class}, null, drawableArr, null, i9));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
            arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
            int i10 = Theme.key_windowBackgroundWhiteGrayText2;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{EmptyStubView.class}, new String[]{"emptyTextView"}, null, null, -1, null, i10));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i7));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"dateTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText3));
            int i11 = Theme.key_sharedMedia_startStopLoadIcon;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 2048, new Class[]{SharedDocumentCell.class}, new String[]{"progressView"}, null, null, -1, null, i11));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"statusImageView"}, null, null, -1, null, i11));
            int i12 = Theme.key_checkbox;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8192, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
            int i13 = Theme.key_checkboxCheck;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 16384, new Class[]{SharedDocumentCell.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8, new Class[]{SharedDocumentCell.class}, new String[]{"thumbImageView"}, null, null, -1, null, Theme.key_files_folderIcon));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{SharedDocumentCell.class}, new String[]{"extTextView"}, null, null, -1, null, Theme.key_files_iconText));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, i6));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8192, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 16384, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, i7));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, i10));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8192, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, null, null, -1, null, i12));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 16384, new Class[]{SharedLinkCell.class}, new String[]{"checkBox"}, null, null, -1, null, i13));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"titleTextPaint"}, null, null, -1, null, i7));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{SharedLinkCell.class}, null, null, null, Theme.key_windowBackgroundWhiteLinkText));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{SharedLinkCell.class}, Theme.linkSelectionPaint, null, null, Theme.key_windowBackgroundWhiteLinkSelection));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, null, null, -1, null, Theme.key_sharedMedia_linkPlaceholderText));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 32, new Class[]{SharedLinkCell.class}, new String[]{"letterDrawable"}, null, null, -1, null, Theme.key_sharedMedia_linkPlaceholder));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 524304, new Class[]{SharedMediaSectionCell.class}, null, null, null, i5));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 524288, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i7));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{SharedMediaSectionCell.class}, new String[]{"textView"}, null, null, -1, null, i7));
            int i14 = Theme.key_sharedMedia_photoPlaceholder;
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{SharedPhotoVideoCell.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i14));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8192, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i12));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 16384, new Class[]{SharedPhotoVideoCell.class}, null, null, themeDescriptionDelegate, i13));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, new Class[]{ContextLinkCell.class}, new String[]{"backgroundPaint"}, null, null, -1, null, i14));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 8192, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i12));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 16384, new Class[]{ContextLinkCell.class}, null, null, themeDescriptionDelegate, i13));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].listView, 0, null, null, new Drawable[]{this.pinnedHeaderShadowDrawable}, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].emptyView.title, 4, null, null, null, null, i7));
            arrayList.add(new ThemeDescription(mediaPageArr[i4].emptyView.subtitle, 4, null, null, null, null, i8));
            i4++;
        }
    }

    public final int getThemedColor$13(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        return resourcesProvider != null ? resourcesProvider.getColor(i) : Theme.getColor(null, i, false);
    }

    public final boolean hasNoforwardsMessage() {
        SparseArray[] sparseArrayArr;
        MessageObject messageObject;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                sparseArrayArr = this.selectedFiles;
                if (i2 >= sparseArrayArr[i].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i].keyAt(i2)));
                i2++;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (messageObject = (MessageObject) sparseArrayArr[i].get(num.intValue())) != null && (message = messageObject.messageOwner) != null && message.noforwards) {
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

    public final void hideFloatingDateView$2() {
        int i = 0;
        AndroidUtilities.cancelRunOnUIThread(this.hideFloatingDateRunnable);
        ChatActionCell chatActionCell = this.floatingDateView;
        if (chatActionCell.getTag() == null) {
            return;
        }
        chatActionCell.setTag(null);
        AnimatorSet animatorSet = this.floatingDateAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.floatingDateAnimation = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.floatingDateAnimation = animatorSet2;
        animatorSet2.setDuration(180L);
        this.floatingDateAnimation.playTogether(ObjectAnimator.ofFloat(chatActionCell, (Property<ChatActionCell, Float>) View.ALPHA, 0.0f), ObjectAnimator.ofFloat(chatActionCell, (Property<ChatActionCell, Float>) View.TRANSLATION_Y, (-AndroidUtilities.dp(48.0f)) + this.additionalFloatingTranslation));
        this.floatingDateAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.floatingDateAnimation.addListener(new AnonymousClass41(this, i));
        this.floatingDateAnimation.start();
    }

    public boolean includeSavedDialogs() {
        return false;
    }

    public boolean includeStories() {
        return !(this instanceof HashtagActivity.AnonymousClass5);
    }

    public final void initBlurCapture(ViewGroup viewGroup) {
        for (MediaPage mediaPage : this.mediaPages) {
            AnonymousClass19 anonymousClass19 = mediaPage.listView;
            Objects.requireNonNull(anonymousClass19);
            mediaPage.iBlur3Capture = new ViewGroupPartRenderer(anonymousClass19, viewGroup, new TopicsFragment$$ExternalSyntheticLambda7(anonymousClass19, 6));
        }
        AnonymousClass13 anonymousClass13 = this.giftsContainer;
        if (anonymousClass13 != null) {
            anonymousClass13.iBlur3CaptureParent = viewGroup;
            anonymousClass13.iBlur3Capture = new EmojiView$$ExternalSyntheticLambda18(anonymousClass13, 4);
        }
    }

    public void invalidateBlur() {
    }

    public boolean isArchivedOnlyStoriesView() {
        return false;
    }

    public final boolean isBot() {
        TLRPC.User user;
        long j = this.dialog_id;
        return j > 0 && (user = MessagesController.getInstance(this.profileActivity.getCurrentAccount()).getUser(Long.valueOf(j))) != null && user.bot;
    }

    public final boolean isSearchItemVisible(int i) {
        if (i == 7) {
            return this.delegate.canSearchMembers();
        }
        return (isSearchingStories() || i == 0 || isAnyStoryPageType(i) || i == 2 || i == 5 || i == 6 || i == 11 || i == 10 || i == 13 || i == 14) ? false : true;
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

    public final boolean isSwipeBackEnabled() {
        if (canEditStories() && ((getClosestTab() == 8 || getClosestTab() == 13 || isStoryAlbumPageType(getClosestTab())) && this.isActionModeShowed)) {
            return false;
        }
        AnonymousClass13 anonymousClass13 = this.giftsContainer;
        if (anonymousClass13 != null && anonymousClass13.isReordering()) {
            return false;
        }
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        return ((anonymousClass15 != null && anonymousClass15.reorderingCollections) || this.photoVideoChangeColumnsAnimation || this.tabsAnimationInProgress) ? false : true;
    }

    public final void jumpToDate(int i, int i2, int i3, boolean z) {
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
        sharedMediaDataArr[i].messages.clear();
        sharedMediaDataArr[i].messagesDict[0].clear();
        sharedMediaDataArr[i].messagesDict[1].clear();
        SharedMediaData sharedMediaData = sharedMediaDataArr[i];
        sharedMediaData.max_id[0] = i2;
        sharedMediaData.endReached[0] = false;
        sharedMediaData.startReached = false;
        sharedMediaData.startOffset = i3;
        sharedMediaData.endLoadingStubs = (sharedMediaData.getTotalCount() - i3) - 1;
        SharedMediaData sharedMediaData2 = sharedMediaDataArr[i];
        if (sharedMediaData2.endLoadingStubs < 0) {
            sharedMediaData2.endLoadingStubs = 0;
        }
        sharedMediaData2.min_id = i2;
        sharedMediaData2.loadingAfterFastScroll = true;
        sharedMediaData2.loading = false;
        sharedMediaData2.requestIndex++;
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
                AnonymousClass17 anonymousClass17 = mediaPage2.layoutManager;
                anonymousClass17.scrollToPositionWithOffset(Math.min(sharedMediaDataArr[i].getTotalCount() - 1, sharedMediaDataArr[i].startOffset), 0, anonymousClass17.mShouldReverseLayout);
            }
            i4++;
        }
    }

    public final void lambda$onItemLongClick$52(TL_stories.StoryItem storyItem, StoriesController.StoryAlbum storyAlbum) {
        StoriesController storiesController = getStoriesController();
        int i = storyAlbum.album_id;
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.addStoriesToAlbum(i, this.dialog_id, arrayList);
        AndroidUtilities.runOnUIThread(new ShareAlert$$ExternalSyntheticLambda29(18, this, storyAlbum), 100L);
    }

    public final void lambda$onItemLongClick$53(TL_stories.StoryItem storyItem, String str) {
        StoriesController storiesController = getStoriesController();
        storiesController.getStoryAlbumsList(this.dialog_id, true).createCollection(str, new OAuthSheet$$ExternalSyntheticLambda13(4, this, storyItem));
    }

    public final void lambda$onItemLongClick$55(HashSet hashSet, TL_stories.StoryItem storyItem, ItemOptions itemOptions, StoriesController.StoryAlbum storyAlbum) {
        String string;
        boolean zContains = hashSet.contains(Integer.valueOf(storyAlbum.album_id));
        long j = this.dialog_id;
        if (zContains) {
            StoriesController storiesController = getStoriesController();
            int i = storyAlbum.album_id;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.addStoriesToAlbum(i, j, arrayList);
            string = LocaleController.formatString(R.string.StoryAddedToAlbumX, storyAlbum.title);
        } else {
            StoriesController storiesController2 = getStoriesController();
            int i2 = storyAlbum.album_id;
            storiesController2.getClass();
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(storyItem);
            storiesController2.removeStoriesFromAlbum(i2, j, arrayList2);
            string = LocaleController.formatString(R.string.StoryRemovedFromAlbumX, storyAlbum.title);
        }
        BulletinFactory.of(this.profileActivity).createSimpleBulletinWithIconSize(R.raw.contact_check, 36, AndroidUtilities.replaceTags(string)).show();
        itemOptions.dismiss();
    }

    public final void lambda$onItemLongClick$59(int i, TL_stories.StoryItem storyItem) {
        StoriesController storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.addStoriesToAlbum(i, this.dialog_id, arrayList);
    }

    public final void lambda$onItemLongClick$60(int i, TL_stories.StoryItem storyItem, String str) {
        PollItemMenu$$ExternalSyntheticLambda17 pollItemMenu$$ExternalSyntheticLambda17 = new PollItemMenu$$ExternalSyntheticLambda17(this, i, storyItem, 1);
        StoriesController storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.removeStoriesFromAlbum(i, this.dialog_id, arrayList);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoryRemovedFromAlbumTitle", 1, str)), pollItemMenu$$ExternalSyntheticLambda17, LocaleController.getString(R.string.UndoNoCaps)).show();
    }

    public final void lambda$onItemLongClick$63(TL_stories.StoryItem storyItem) {
        getStoriesController().updateStoriesPinned(this.dialog_id, new ArrayList(Collections.singletonList(storyItem)), false, null);
        BulletinFactory.of(this.profileActivity).createSimpleBulletin(R.raw.chats_archived, 5000, LocaleController.formatPluralString("StoryArchived", 1, new Object[0])).show();
    }

    public final void lambda$openAddStoriesToAlbumSheet$72(int i, long j, ArrayList arrayList) {
        getStoriesController().addStoriesToAlbum(i, j, arrayList);
    }

    public final void lambda$openDeleteStoriesAlbumAlert$71(int i, long j) {
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

    public final void lambda$openRenameStoriesAlbumAlert$70(int i, String str, long j) {
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

    public final void loadFastScrollData(boolean z) {
        long j = this.topicId;
        if (j != 0 || isSearchingStories()) {
            return;
        }
        int i = 0;
        while (true) {
            int[] iArr = supportedFastScrollTypes;
            if (i >= 4) {
                return;
            }
            final int i2 = iArr[i];
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (sharedMediaDataArr[i2].fastScrollDataLoaded && !z) {
                return;
            }
            long j2 = this.dialog_id;
            if (DialogObject.isEncryptedDialog(j2)) {
                return;
            }
            sharedMediaDataArr[i2].fastScrollDataLoaded = false;
            TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
            if (i2 == 0) {
                int i3 = sharedMediaDataArr[i2].filterType;
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
            BaseFragment baseFragment = this.profileActivity;
            tL_messages_getSearchResultsPositions.peer = baseFragment.getMessagesController().getInputPeer(j2);
            if (j != 0 && baseFragment.getUserConfig().getClientUserId() == j2) {
                tL_messages_getSearchResultsPositions.flags = 4 | tL_messages_getSearchResultsPositions.flags;
                tL_messages_getSearchResultsPositions.saved_peer_id = baseFragment.getMessagesController().getInputPeer(j);
            }
            final int i4 = sharedMediaDataArr[i2].requestIndex;
            ConnectionsManager.getInstance(baseFragment.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(baseFragment.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    SharedMediaLayout sharedMediaLayout = this.f$0;
                    sharedMediaLayout.getClass();
                    AndroidUtilities.runOnUIThread(new SharedMediaLayout$$ExternalSyntheticLambda37(sharedMediaLayout, tL_error, i4, i2, tLObject, 0));
                }
            }), baseFragment.getClassGuid());
            i++;
        }
    }

    public final void loadFromStart(int i) {
        int i2;
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
        if (i == 0) {
            int i3 = sharedMediaDataArr[0].filterType;
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
        sharedMediaDataArr[i].loading = true;
        BaseFragment baseFragment = this.profileActivity;
        baseFragment.getMediaDataController().loadMedia(this.dialog_id, 50, 0, sharedMediaDataArr[i].min_id, i2, this.topicId, 1, baseFragment.getClassGuid(), sharedMediaDataArr[i].requestIndex, null, null);
    }

    public int mediaPageTopMargin() {
        return 0;
    }

    public final void onActionBarItemClick(int i, View view) {
        AnonymousClass12 anonymousClass12;
        TLRPC.Chat chat;
        TLRPC.EncryptedChat encryptedChatM;
        boolean z;
        TLRPC.User user;
        int i2 = 2;
        BaseFragment baseFragment = this.profileActivity;
        SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
        SparseArray[] sparseArrayArr = this.selectedFiles;
        boolean z2 = true;
        final int i3 = 0;
        if (i != 101) {
            if (i == 100) {
                if (this.userInfo != null && baseFragment.getMessagesController().isUserNoForwards(this.userInfo)) {
                    HintView hintView = this.fwdRestrictedHint;
                    if (hintView != null) {
                        hintView.setText(LocaleController.getString(R.string.ForwardsRestrictedInfoUser));
                        this.fwdRestrictedHint.showForView(view, true);
                        return;
                    }
                    return;
                }
                if (this.info != null) {
                    TLRPC.Chat chat2 = baseFragment.getMessagesController().getChat(Long.valueOf(this.info.id));
                    if (baseFragment.getMessagesController().isChatNoForwards(chat2)) {
                        HintView hintView2 = this.fwdRestrictedHint;
                        if (hintView2 != null) {
                            hintView2.setText((!ChatObject.isChannel(chat2) || chat2.megagroup) ? LocaleController.getString(R.string.ForwardsRestrictedInfoGroup) : LocaleController.getString(R.string.ForwardsRestrictedInfoChannel));
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
                dialogsActivity.delegate = new SharedMediaLayout$$ExternalSyntheticLambda11(this);
                baseFragment.presentFragment(dialogsActivity);
                return;
            }
            if (i == 102) {
                if (sparseArrayArr[1].size() + sparseArrayArr[0].size() != 1) {
                    return;
                }
                MessageObject messageObject = (MessageObject) sparseArrayArr[sparseArrayArr[0].size() == 1 ? (char) 0 : (char) 1].valueAt(0);
                Bundle bundle2 = new Bundle();
                long dialogId = messageObject.getDialogId();
                if (DialogObject.isEncryptedDialog(dialogId)) {
                    bundle2.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
                } else if (DialogObject.isUserDialog(dialogId)) {
                    bundle2.putLong("user_id", dialogId);
                } else {
                    TLRPC.Chat chat3 = baseFragment.getMessagesController().getChat(Long.valueOf(-dialogId));
                    if (chat3 != null && chat3.migrated_to != null) {
                        bundle2.putLong("migrated_to", dialogId);
                        dialogId = -chat3.migrated_to.channel_id;
                    }
                    bundle2.putLong("chat_id", -dialogId);
                }
                bundle2.putInt("message_id", messageObject.getId());
                bundle2.putBoolean("need_remove_previous_same_chat_activity", false);
                ChatActivity chatActivity = new ChatActivity(bundle2);
                chatActivity.highlightMessageId = messageObject.getId();
                long j = this.topicId;
                if (j != 0) {
                    ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(dialogId, j));
                    bundle2.putInt("message_id", messageObject.getId());
                }
                baseFragment.presentFragment(chatActivity, false);
                return;
            }
            if (i == 103 || i == 104) {
                if (getClosestTab() == 8) {
                    AnonymousClass9 anonymousClass9 = this.storiesAdapter;
                    if (anonymousClass9 == null || anonymousClass9.storiesList == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < sparseArrayArr[0].size(); i4++) {
                        arrayList.add(Integer.valueOf(((MessageObject) sparseArrayArr[0].valueAt(i4)).getId()));
                    }
                    pinOnUnpinStories(arrayList, i == 103);
                    closeActionMode(false);
                    return;
                }
                SavedMessagesController savedMessagesController = baseFragment.getMessagesController().getSavedMessagesController();
                ArrayList<Long> arrayList2 = new ArrayList<>();
                for (int i5 = 0; i5 < savedMessagesController.allDialogs.size(); i5++) {
                    long j2 = savedMessagesController.allDialogs.get(i5).dialogId;
                    if (savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j2))) {
                        arrayList2.add(Long.valueOf(j2));
                    }
                }
                if (savedMessagesController.updatePinned(arrayList2, i == 103, true)) {
                    int i6 = 0;
                    while (true) {
                        MediaPage[] mediaPageArr = this.mediaPages;
                        if (i6 >= mediaPageArr.length) {
                            break;
                        }
                        MediaPage mediaPage = mediaPageArr[i6];
                        if (mediaPage.selectedType == 11) {
                            AnonymousClass17 anonymousClass17 = mediaPage.layoutManager;
                            anonymousClass17.scrollToPositionWithOffset(0, 0, anonymousClass17.mShouldReverseLayout);
                            break;
                        }
                        i6++;
                    }
                } else {
                    baseFragment.showDialog(new LimitReachedBottomSheet(33, baseFragment.getCurrentAccount(), getContext(), baseFragment, null));
                }
                closeActionMode(true);
                return;
            }
            return;
        }
        boolean zIsAnyStoryPageType = isAnyStoryPageType(getSelectedTab());
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (zIsAnyStoryPageType || getSelectedTab() == 13) {
            if (sparseArrayArr[0] != null) {
                if (isBot() && (anonymousClass12 = this.botPreviewsContainer) != null && anonymousClass12.getCurrentList() != null) {
                    StoriesController.BotPreviewsList currentList = anonymousClass12.getCurrentList();
                    ArrayList arrayList3 = new ArrayList();
                    for (int i7 = 0; i7 < sparseArrayArr[0].size(); i7++) {
                        TL_stories.StoryItem storyItem = ((MessageObject) sparseArrayArr[0].valueAt(i7)).storyItem;
                        if (storyItem != null) {
                            arrayList3.add(storyItem.media);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        return;
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, resourcesProvider);
                    String string = LocaleController.getString(arrayList3.size() > 1 ? R.string.DeleteBotPreviewsTitle : R.string.DeleteBotPreviewTitle);
                    AlertDialog alertDialog = builder.alertDialog;
                    alertDialog.title = string;
                    alertDialog.message = LocaleController.formatPluralString("DeleteBotPreviewsSubtitle", arrayList3.size(), new Object[0]);
                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new VoIPFragment$$ExternalSyntheticLambda42(this, currentList, arrayList3, 5));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(z2 ? 1 : 0));
                    alertDialog.show();
                    alertDialog.redPositive();
                    return;
                }
                final ArrayList arrayList4 = new ArrayList();
                for (int i8 = 0; i8 < sparseArrayArr[0].size(); i8++) {
                    TL_stories.StoryItem storyItem2 = ((MessageObject) sparseArrayArr[0].valueAt(i8)).storyItem;
                    if (storyItem2 != null) {
                        arrayList4.add(storyItem2);
                    }
                }
                if (arrayList4.isEmpty()) {
                    return;
                }
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), 0, resourcesProvider);
                String string2 = LocaleController.getString(arrayList4.size() > 1 ? R.string.DeleteStoriesTitle : R.string.DeleteStoryTitle);
                AlertDialog alertDialog2 = builder2.alertDialog;
                alertDialog2.title = string2;
                alertDialog2.message = LocaleController.formatPluralString("DeleteStoriesSubtitle", arrayList4.size(), new Object[0]);
                String string3 = LocaleController.getString(R.string.Delete);
                final int i9 = z2 ? 1 : 0;
                builder2.setPositiveButton(string3, new AlertDialog.OnButtonClickListener(this) {
                    public final SharedMediaLayout f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(AlertDialog alertDialog3, int i10) {
                        switch (i9) {
                            case 0:
                                SharedMediaLayout sharedMediaLayout = this.f$0;
                                sharedMediaLayout.getClass();
                                int i11 = 0;
                                while (true) {
                                    ArrayList arrayList5 = arrayList4;
                                    if (i11 >= arrayList5.size()) {
                                        sharedMediaLayout.closeActionMode(true);
                                    } else {
                                        sharedMediaLayout.profileActivity.getMessagesController().deleteSavedDialog(((Long) arrayList5.get(i11)).longValue());
                                        i11++;
                                    }
                                    break;
                                }
                                break;
                            default:
                                SharedMediaLayout sharedMediaLayout2 = this.f$0;
                                BaseFragment baseFragment2 = sharedMediaLayout2.profileActivity;
                                StoriesController storiesController = baseFragment2.getMessagesController().getStoriesController();
                                ArrayList arrayList6 = arrayList4;
                                storiesController.deleteStories(sharedMediaLayout2.dialog_id, arrayList6);
                                BulletinFactory.of(baseFragment2).createSimpleBulletinWithIconSize(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList6.size(), new Object[0])).show();
                                sharedMediaLayout2.closeActionMode(false);
                                break;
                        }
                    }
                });
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(i2));
                alertDialog2.show();
                alertDialog2.redPositive();
                return;
            }
            return;
        }
        TLRPC.User user2 = null;
        if (getSelectedTab() != 11) {
            long j3 = this.dialog_id;
            if (DialogObject.isEncryptedDialog(j3)) {
                encryptedChatM = MessagesController$DialogFilter$$ExternalSyntheticOutline0.m(baseFragment.getMessagesController(), j3);
                chat = null;
            } else if (DialogObject.isUserDialog(j3)) {
                chat = null;
                encryptedChatM = null;
                user2 = baseFragment.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                chat = baseFragment.getMessagesController().getChat(Long.valueOf(-j3));
                encryptedChatM = null;
            }
            AlertsCreator.createDeleteMessagesAlert(baseFragment, user2, chat, encryptedChatM, null, this.mergeDialogId, null, this.selectedFiles, null, 0, 0, null, new SharedMediaLayout$$ExternalSyntheticLambda9(this, i2), null, this.resourcesProvider);
            return;
        }
        SavedMessagesController savedMessagesController2 = baseFragment.getMessagesController().getSavedMessagesController();
        final ArrayList arrayList5 = new ArrayList();
        for (int i10 = 0; i10 < savedMessagesController2.allDialogs.size(); i10++) {
            long j4 = savedMessagesController2.allDialogs.get(i10).dialogId;
            if (savedDialogsAdapter.selectedDialogs.contains(Long.valueOf(j4))) {
                arrayList5.add(Long.valueOf(j4));
            }
        }
        String string4 = "";
        if (arrayList5.isEmpty()) {
            z = false;
        } else {
            Long l = (Long) arrayList5.get(0);
            long jLongValue = l.longValue();
            z = jLongValue == baseFragment.getUserConfig().getClientUserId();
            if (jLongValue < 0) {
                TLRPC.Chat chat4 = baseFragment.getMessagesController().getChat(Long.valueOf(-jLongValue));
                if (chat4 != null) {
                    string4 = chat4.title;
                }
            } else if (jLongValue >= 0 && (user = baseFragment.getMessagesController().getUser(l)) != null) {
                string4 = UserObject.isAnonymous(user) ? LocaleController.getString(R.string.AnonymousForward) : UserObject.getUserName(user);
            }
        }
        AlertDialog.Builder builder3 = new AlertDialog.Builder(getContext(), 0, resourcesProvider);
        String string5 = arrayList5.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesTitle : R.string.ClearHistoryTitleSingle2, string4) : LocaleController.formatPluralString("ClearHistoryTitleMultiple", arrayList5.size(), new Object[0]);
        AlertDialog alertDialog3 = builder3.alertDialog;
        alertDialog3.title = string5;
        alertDialog3.message = arrayList5.size() == 1 ? LocaleController.formatString(z ? R.string.ClearHistoryMyNotesMessage : R.string.ClearHistoryMessageSingle, string4) : LocaleController.formatPluralString("ClearHistoryMessageMultiple", arrayList5.size(), new Object[0]);
        builder3.setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener(this) {
            public final SharedMediaLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(AlertDialog alertDialog4, int i11) {
                switch (i3) {
                    case 0:
                        SharedMediaLayout sharedMediaLayout = this.f$0;
                        sharedMediaLayout.getClass();
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList6 = arrayList5;
                            if (i12 >= arrayList6.size()) {
                                sharedMediaLayout.closeActionMode(true);
                            } else {
                                sharedMediaLayout.profileActivity.getMessagesController().deleteSavedDialog(((Long) arrayList6.get(i12)).longValue());
                                i12++;
                            }
                            break;
                        }
                        break;
                    default:
                        SharedMediaLayout sharedMediaLayout2 = this.f$0;
                        BaseFragment baseFragment2 = sharedMediaLayout2.profileActivity;
                        StoriesController storiesController = baseFragment2.getMessagesController().getStoriesController();
                        ArrayList arrayList7 = arrayList5;
                        storiesController.deleteStories(sharedMediaLayout2.dialog_id, arrayList7);
                        BulletinFactory.of(baseFragment2).createSimpleBulletinWithIconSize(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", arrayList7.size(), new Object[0])).show();
                        sharedMediaLayout2.closeActionMode(false);
                        break;
                }
            }
        });
        builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        baseFragment.showDialog(alertDialog3);
        TextView textView = (TextView) alertDialog3.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void onActionModeSelectedUpdate(SparseArray sparseArray) {
    }

    public void onBottomButtonVisibilityChange() {
    }

    @Override
    public final void onButtonClicked(DialogCell dialogCell) {
    }

    @Override
    public final void onButtonLongPress(DialogCell dialogCell) {
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            AnonymousClass19 anonymousClass19 = mediaPageArr[i].listView;
            if (anonymousClass19 != null) {
                anonymousClass19.getViewTreeObserver().addOnPreDrawListener(new UsersAlertBase.AnonymousClass5(this, i, 1));
            }
            i++;
        }
    }

    public final void onDestroy() {
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda18;
        StoriesController.StoriesList storiesList;
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda19;
        StoriesController.StoriesList storiesList2;
        StickersActivity$$ExternalSyntheticLambda18 stickersActivity$$ExternalSyntheticLambda110;
        this.observersGroup.removeAllObservers();
        AnonymousClass9 anonymousClass9 = this.storiesAdapter;
        if (anonymousClass9 != null && (storiesList2 = anonymousClass9.storiesList) != null) {
            ArrayList arrayList = storiesList2.links;
            arrayList.remove(Integer.valueOf(anonymousClass9.id));
            if (arrayList.isEmpty() && (stickersActivity$$ExternalSyntheticLambda110 = storiesList2.destroyRunnable) != null) {
                AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda110);
                AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda110, 300000L);
            }
        }
        AnonymousClass11 anonymousClass11 = this.archivedStoriesAdapter;
        if (anonymousClass11 != null && (storiesList = anonymousClass11.storiesList) != null) {
            ArrayList arrayList2 = storiesList.links;
            arrayList2.remove(Integer.valueOf(anonymousClass11.id));
            if (arrayList2.isEmpty() && (stickersActivity$$ExternalSyntheticLambda19 = storiesList.destroyRunnable) != null) {
                AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda19);
                AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda19, 300000L);
            }
        }
        Iterator it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            StoryAlbumData.AnonymousClass1 anonymousClass1 = ((StoryAlbumData) it.next()).adapter;
            StoriesController.StoriesList storiesList3 = anonymousClass1.storiesList;
            if (storiesList3 != null) {
                ArrayList arrayList3 = storiesList3.links;
                arrayList3.remove(Integer.valueOf(anonymousClass1.id));
                if (arrayList3.isEmpty() && (stickersActivity$$ExternalSyntheticLambda18 = storiesList3.destroyRunnable) != null) {
                    AndroidUtilities.cancelRunOnUIThread(stickersActivity$$ExternalSyntheticLambda18);
                    AndroidUtilities.runOnUIThread(stickersActivity$$ExternalSyntheticLambda18, 300000L);
                }
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return checkTabsAnimationInProgress() || this.scrollSlidingTextTabStrip.animatingIndicator || onTouchEvent(motionEvent);
    }

    public final void onItemClick(int i, FrameLayout frameLayout, MessageObject messageObject, int i2) throws Throwable {
        String str;
        if (messageObject == null || this.photoVideoChangeColumnsAnimation) {
            return;
        }
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (anonymousClass15 == null || !anonymousClass15.reorderingCollections) {
            String string = null;
            int iDp = 0;
            iDp = 0;
            if (this.isActionModeShowed) {
                int i3 = 8;
                if (i2 == 8 && !canEditStories()) {
                    return;
                }
                char c = messageObject.getDialogId() == this.dialog_id ? (char) 0 : (char) 1;
                SparseArray[] sparseArrayArr = this.selectedFiles;
                if (sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0) {
                    sparseArrayArr[c].remove(messageObject.getId());
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount--;
                    }
                } else {
                    if (sparseArrayArr[1].size() + sparseArrayArr[0].size() >= 100) {
                        return;
                    }
                    sparseArrayArr[c].put(messageObject.getId(), messageObject);
                    if (!messageObject.canDeleteMessage(false, null)) {
                        this.cantDeleteMessagesCount++;
                    }
                }
                onActionModeSelectedUpdate(sparseArrayArr[0]);
                if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                    showActionMode$1(false);
                } else {
                    this.selectedMessagesCountTextView.setNumber(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                    this.deleteItem.setVisibility(this.cantDeleteMessagesCount == 0 ? 0 : 8);
                    ActionBarMenuItem actionBarMenuItem = this.gotoItem;
                    if (actionBarMenuItem != null) {
                        actionBarMenuItem.setVisibility((getClosestTab() == 8 || getClosestTab() == 13 || getClosestTab() == 14 || sparseArrayArr[0].size() != 1) ? 8 : 0);
                    }
                    ActionBarMenuItem actionBarMenuItem2 = this.forwardItem;
                    if (actionBarMenuItem2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i3 = 0;
                        }
                        actionBarMenuItem2.setVisibility(i3);
                    }
                    updateStoriesPinButton();
                }
                this.scrolling = false;
                if (frameLayout instanceof SharedDocumentCell) {
                    ((SharedDocumentCell) frameLayout).setChecked(sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (frameLayout instanceof SharedPhotoVideoCell) {
                    ((SharedPhotoVideoCell) frameLayout).photoVideoViews[0].setChecked(sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0);
                } else if (frameLayout instanceof SharedLinkCell) {
                    ((SharedLinkCell) frameLayout).setChecked(sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (frameLayout instanceof SharedAudioCell) {
                    ((SharedAudioCell) frameLayout).setChecked(sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (frameLayout instanceof ContextLinkCell) {
                    ((ContextLinkCell) frameLayout).setChecked(sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0, true);
                } else if (frameLayout instanceof SharedPhotoVideoCell2) {
                    ((SharedPhotoVideoCell2) frameLayout).setChecked(sparseArrayArr[c].indexOfKey(messageObject.getId()) >= 0, true);
                }
            } else {
                BaseFragment baseFragment = this.profileActivity;
                SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                if (i2 == 0) {
                    SharedMediaData sharedMediaData = sharedMediaDataArr[i2];
                    int i4 = i - sharedMediaData.startOffset;
                    if (i4 >= 0 && i4 < sharedMediaData.messages.size()) {
                        PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                        PhotoViewer.getInstance().openPhoto(sharedMediaDataArr[i2].messages, i4, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                    }
                } else if (i2 == 2 || i2 == 4) {
                    if (frameLayout instanceof SharedAudioCell) {
                        ((SharedAudioCell) frameLayout).didPressedButton();
                    }
                } else if (i2 == 5) {
                    PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                    int iIndexOf = sharedMediaDataArr[i2].messages.indexOf(messageObject);
                    if (iIndexOf < 0) {
                        PhotoViewer.getInstance().openPhoto(MediaController$$ExternalSyntheticOutline1.m(messageObject), 0, 0L, 0L, 0L, this.provider);
                    } else {
                        PhotoViewer.getInstance().openPhoto(sharedMediaDataArr[i2].messages, iIndexOf, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                    }
                } else if (i2 == 1) {
                    if (frameLayout instanceof SharedDocumentCell) {
                        SharedDocumentCell sharedDocumentCell = (SharedDocumentCell) frameLayout;
                        TLRPC.Document document = messageObject.getDocument();
                        if (sharedDocumentCell.loaded) {
                            if (messageObject.canPreviewDocument()) {
                                PhotoViewer.getInstance().setParentActivity(null, baseFragment, null);
                                int iIndexOf2 = sharedMediaDataArr[i2].messages.indexOf(messageObject);
                                if (iIndexOf2 < 0) {
                                    PhotoViewer.getInstance().openPhoto(MediaController$$ExternalSyntheticOutline1.m(messageObject), 0, 0L, 0L, 0L, this.provider);
                                    return;
                                } else {
                                    PhotoViewer.getInstance().openPhoto(sharedMediaDataArr[i2].messages, iIndexOf2, this.dialog_id, this.mergeDialogId, this.topicId, this.provider);
                                    return;
                                }
                            }
                            AndroidUtilities.openDocument(messageObject, baseFragment.getParentActivity(), baseFragment);
                        } else if (sharedDocumentCell.loading) {
                            baseFragment.getFileLoader().cancelLoadFile(document);
                            sharedDocumentCell.updateFileExistIcon(true);
                        } else {
                            MessageObject message = sharedDocumentCell.getMessage();
                            message.putInDownloadsStore = true;
                            baseFragment.getFileLoader().loadFile(document, message, 0, 0);
                            sharedDocumentCell.updateFileExistIcon(true);
                        }
                    }
                } else if (i2 == 3) {
                    try {
                        TLRPC.WebPage webPage = MessageObject.getMedia(messageObject.messageOwner) != null ? MessageObject.getMedia(messageObject.messageOwner).webpage : null;
                        if (webPage == null || (webPage instanceof TLRPC.TL_webPageEmpty)) {
                            str = null;
                        } else {
                            if (webPage.cached_page != null) {
                                LaunchActivity launchActivity = LaunchActivity.instance;
                                if (launchActivity == null || launchActivity.getBottomSheetTabs() == null || LaunchActivity.instance.getBottomSheetTabs().tryReopenTab(messageObject) == null) {
                                    baseFragment.createArticleViewer(false).open(messageObject, null, null, null);
                                    return;
                                }
                                return;
                            }
                            String str2 = webPage.embed_url;
                            if (str2 != null && str2.length() != 0) {
                                EmbedBottomSheet.show(baseFragment, messageObject, this.provider, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                return;
                            }
                            str = webPage.url;
                        }
                        if (str == null) {
                            SharedLinkCell sharedLinkCell = (SharedLinkCell) frameLayout;
                            if (sharedLinkCell.links.size() > 0) {
                                string = ((CharSequence) sharedLinkCell.links.get(0)).toString();
                            }
                        } else {
                            string = str;
                        }
                        if (string != null) {
                            if (AndroidUtilities.shouldShowUrlInAlert(string)) {
                                AlertsCreator.showOpenUrlAlert(baseFragment, string, true, true);
                            } else {
                                Browser.openUrl(baseFragment.getParentActivity(), string);
                            }
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (isAnyStoryPageType(i2)) {
                    StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(i2);
                    StoriesController.StoriesList storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null ? storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList : null;
                    if (storiesList == null) {
                        return;
                    }
                    StoryViewer orCreateStoryViewer = baseFragment.getOrCreateStoryViewer();
                    Context context = getContext();
                    int id = messageObject.getId();
                    StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(this.mediaPages[0].listView, false);
                    storiesListPlaceProvider.loadNextInterface = new ProfileGooeyView$$ExternalSyntheticLambda0(storiesList, 23);
                    if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).myProfile) {
                        iDp = AndroidUtilities.dp(68.0f);
                    }
                    storiesListPlaceProvider.addBottomClip += iDp;
                    orCreateStoryViewer.open(context, id, storiesList, storiesListPlaceProvider);
                }
            }
            updateForwardItem();
        }
    }

    public final boolean onItemLongClick(MessageObject messageObject, View view, int i, boolean z) {
        AnonymousClass15 anonymousClass15;
        final TL_stories.StoryItem storyItem;
        final int i2;
        AnonymousClass9 anonymousClass9;
        StoriesController.StoriesList storiesList;
        StoriesController.StoryAlbum storyAlbumFindById;
        final int i3 = 2;
        int i4 = 4;
        final int i5 = 1;
        final int i6 = 0;
        if (!this.isActionModeShowed) {
            BaseFragment baseFragment = this.profileActivity;
            if (baseFragment.getParentActivity() != null && messageObject != null && ((anonymousClass15 = this.storiesContainer) == null || !anonymousClass15.reorderingCollections)) {
                AndroidUtilities.hideKeyboard(baseFragment.getParentActivity().getCurrentFocus());
                long j = this.dialog_id;
                if (!z || (!(isStoryAlbumPageType(getClosestTab()) || getClosestTab() == 8) || this.isActionModeShowed)) {
                    char c = messageObject.getDialogId() == j ? (char) 0 : (char) 1;
                    SparseArray[] sparseArrayArr = this.selectedFiles;
                    sparseArrayArr[c].put(messageObject.getId(), messageObject);
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
                    int i7 = 0;
                    while (true) {
                        ArrayList arrayList2 = this.actionModeViews;
                        if (i7 >= arrayList2.size()) {
                            break;
                        }
                        View view2 = (View) arrayList2.get(i7);
                        AndroidUtilities.clearDrawableAnimation(view2);
                        arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                        i7++;
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
                        showActionMode$1(true);
                    }
                    onActionModeSelectedUpdate(sparseArrayArr[0]);
                    updateForwardItem();
                    return true;
                }
                if (view instanceof SharedPhotoVideoCell2) {
                    SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) view;
                    sharedPhotoVideoCell2.setMessageObject(sharedPhotoVideoCell2.currentMessageObject, sharedPhotoVideoCell2.currentParentColumnsCount, true);
                }
                TL_stories.StoryItem storyItem2 = messageObject.storyItem;
                if (storyItem2 != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList<Integer> arrayList3 = storyItem2.albums;
                    if (arrayList3 != null) {
                        hashSet.addAll(arrayList3);
                    }
                    boolean zIsStoryAlbumPageType = isStoryAlbumPageType(getClosestTab());
                    ItemOptions itemOptions = new ItemOptions(baseFragment, view, true, true);
                    ItemOptions itemOptionsMakeSwipeback = itemOptions.makeSwipeback();
                    itemOptionsMakeSwipeback.add(R.drawable.ic_ab_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda326(i6, itemOptions), false);
                    itemOptionsMakeSwipeback.addGap();
                    ItemOptions.addAlbumsItemOptions(itemOptionsMakeSwipeback, getStoriesController().getStoryAlbumsList(j, true), hashSet, true, new FilterGLThread$$ExternalSyntheticLambda1(this, storyItem2, itemOptions, 26), new GiftSheet$$ExternalSyntheticLambda23(this, hashSet, storyItem2, itemOptions, 10));
                    itemOptions.add(R.drawable.menu_album_add, LocaleController.getString(R.string.StoriesAlbumAddToAlbum), new PhotoViewer$$ExternalSyntheticLambda133(itemOptions, itemOptionsMakeSwipeback, 7), false);
                    itemOptions.addGap();
                    itemOptions.add(R.drawable.msg_select, LocaleController.getString(R.string.StoriesAlbumMenuSelect), new ArticleViewer$$ExternalSyntheticLambda71(this, messageObject, view, i, 23), false);
                    if (zIsStoryAlbumPageType) {
                        int iStoryAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(getClosestTab());
                        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, false);
                        String str = (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(iStoryAlbums_getAlbumIdByTabType)) == null) ? null : storyAlbumFindById.title;
                        itemOptions.add(R.drawable.tabs_reorder, LocaleController.getString(R.string.StoriesAlbumMenuReorder), new OAuthSheet$$ExternalSyntheticLambda17(this, iStoryAlbums_getAlbumIdByTabType, i4), false);
                        storyItem = storyItem2;
                        itemOptions.add(R.drawable.msg_removefolder, LocaleController.getString(R.string.StoriesAlbumMenuRemoveFromAlbum), new ArticleViewer$$ExternalSyntheticLambda71(this, iStoryAlbums_getAlbumIdByTabType, storyItem, str, 24), false);
                        i2 = 3;
                    } else {
                        if (getClosestTab() == 8 && (anonymousClass9 = this.storiesAdapter) != null && (storiesList = anonymousClass9.storiesList) != null) {
                            if (storiesList.isPinned(storyItem.id)) {
                                storyItem = storyItem2;
                                itemOptions.add(R.drawable.chats_unpin, LocaleController.getString(R.string.StoriesAlbumMenuUnpin), new Runnable(this) {
                                    public final SharedMediaLayout f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                SharedMediaLayout sharedMediaLayout = this.f$0;
                                                AlertDialog.Builder builder = new AlertDialog.Builder(sharedMediaLayout.getContext(), 0, sharedMediaLayout.resourcesProvider);
                                                String string = LocaleController.getString(R.string.DeleteStoryTitle);
                                                AlertDialog alertDialog = builder.alertDialog;
                                                alertDialog.title = string;
                                                alertDialog.message = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new SharedMediaLayout$$ExternalSyntheticLambda47(sharedMediaLayout, storyItem));
                                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(3));
                                                alertDialog.show();
                                                alertDialog.redPositive();
                                                break;
                                            case 1:
                                                SharedMediaLayout sharedMediaLayout2 = this.f$0;
                                                sharedMediaLayout2.getClass();
                                                sharedMediaLayout2.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                SharedMediaLayout sharedMediaLayout3 = this.f$0;
                                                sharedMediaLayout3.getClass();
                                                sharedMediaLayout3.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                this.f$0.lambda$onItemLongClick$63(storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            } else {
                                storyItem = storyItem2;
                                itemOptions.add(R.drawable.chats_pin, LocaleController.getString(R.string.StoriesAlbumMenuPin), new Runnable(this) {
                                    public final SharedMediaLayout f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final void run() {
                                        switch (i3) {
                                            case 0:
                                                SharedMediaLayout sharedMediaLayout = this.f$0;
                                                AlertDialog.Builder builder = new AlertDialog.Builder(sharedMediaLayout.getContext(), 0, sharedMediaLayout.resourcesProvider);
                                                String string = LocaleController.getString(R.string.DeleteStoryTitle);
                                                AlertDialog alertDialog = builder.alertDialog;
                                                alertDialog.title = string;
                                                alertDialog.message = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                                builder.setPositiveButton(LocaleController.getString(R.string.Delete), new SharedMediaLayout$$ExternalSyntheticLambda47(sharedMediaLayout, storyItem));
                                                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(3));
                                                alertDialog.show();
                                                alertDialog.redPositive();
                                                break;
                                            case 1:
                                                SharedMediaLayout sharedMediaLayout2 = this.f$0;
                                                sharedMediaLayout2.getClass();
                                                sharedMediaLayout2.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                                break;
                                            case 2:
                                                SharedMediaLayout sharedMediaLayout3 = this.f$0;
                                                sharedMediaLayout3.getClass();
                                                sharedMediaLayout3.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                                break;
                                            default:
                                                this.f$0.lambda$onItemLongClick$63(storyItem);
                                                break;
                                        }
                                    }
                                }, false);
                            }
                        }
                        storyItem = storyItem2;
                        storyItem = storyItem2;
                        storyItem = storyItem2;
                        i2 = 3;
                        itemOptions.add(R.drawable.msg_archive, LocaleController.getString(R.string.StoriesAlbumMenuArchive), new Runnable(this) {
                            public final SharedMediaLayout f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        SharedMediaLayout sharedMediaLayout = this.f$0;
                                        AlertDialog.Builder builder = new AlertDialog.Builder(sharedMediaLayout.getContext(), 0, sharedMediaLayout.resourcesProvider);
                                        String string = LocaleController.getString(R.string.DeleteStoryTitle);
                                        AlertDialog alertDialog = builder.alertDialog;
                                        alertDialog.title = string;
                                        alertDialog.message = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new SharedMediaLayout$$ExternalSyntheticLambda47(sharedMediaLayout, storyItem));
                                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(3));
                                        alertDialog.show();
                                        alertDialog.redPositive();
                                        break;
                                    case 1:
                                        SharedMediaLayout sharedMediaLayout2 = this.f$0;
                                        sharedMediaLayout2.getClass();
                                        sharedMediaLayout2.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                        break;
                                    case 2:
                                        SharedMediaLayout sharedMediaLayout3 = this.f$0;
                                        sharedMediaLayout3.getClass();
                                        sharedMediaLayout3.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                        break;
                                    default:
                                        this.f$0.lambda$onItemLongClick$63(storyItem);
                                        break;
                                }
                            }
                        }, false);
                    }
                    itemOptions.add(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable(this) {
                        public final SharedMediaLayout f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i6) {
                                case 0:
                                    SharedMediaLayout sharedMediaLayout = this.f$0;
                                    AlertDialog.Builder builder = new AlertDialog.Builder(sharedMediaLayout.getContext(), 0, sharedMediaLayout.resourcesProvider);
                                    String string = LocaleController.getString(R.string.DeleteStoryTitle);
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.title = string;
                                    alertDialog.message = LocaleController.formatPluralString("DeleteStoriesSubtitle", 1, new Object[0]);
                                    builder.setPositiveButton(LocaleController.getString(R.string.Delete), new SharedMediaLayout$$ExternalSyntheticLambda47(sharedMediaLayout, storyItem));
                                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new ContactsActivity$$ExternalSyntheticLambda18(3));
                                    alertDialog.show();
                                    alertDialog.redPositive();
                                    break;
                                case 1:
                                    SharedMediaLayout sharedMediaLayout2 = this.f$0;
                                    sharedMediaLayout2.getClass();
                                    sharedMediaLayout2.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), false);
                                    break;
                                case 2:
                                    SharedMediaLayout sharedMediaLayout3 = this.f$0;
                                    sharedMediaLayout3.getClass();
                                    sharedMediaLayout3.pinOnUnpinStories(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem.id))), true);
                                    break;
                                default:
                                    this.f$0.lambda$onItemLongClick$63(storyItem);
                                    break;
                            }
                        }
                    }, true);
                    itemOptions.gravity = i2;
                    itemOptions.blur = true;
                    itemOptions.blurForMenu = true;
                    itemOptions.allowMoveScrim = true;
                    itemOptions.allowMoveScrimGravity = i2;
                    Point point = AndroidUtilities.displaySize;
                    int iMin = (int) (Math.min(point.x, point.y) * 0.6777f);
                    Point point2 = AndroidUtilities.displaySize;
                    int iMin2 = Math.min(iMin, (int) (((Math.max(point2.x, point2.y) * 0.4333f) * 3.0f) / 4.0f));
                    itemOptions.animateToWidth = iMin2;
                    itemOptions.animateToHeight = (iMin2 * 4) / 3;
                    itemOptions.drawScrim = true;
                    itemOptions.hideScrimUnder = true;
                    itemOptions.forceBottom = true;
                    itemOptions.show();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = View.MeasureSpec.getSize(i);
        Delegate delegate = this.delegate;
        int height = delegate.getListView() != null ? delegate.getListView().getHeight() : 0;
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
                    AnonymousClass19 anonymousClass19 = ((MediaPage) childAt).listView;
                    anonymousClass19.setPadding(0, anonymousClass19.topPadding, 0, anonymousClass19.bottomPadding);
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

    public final void onPageMediaProgress(float f) {
        MediaPage[] mediaPageArr = this.mediaPages;
        if (f != 1.0f || mediaPageArr[1].getVisibility() == 0) {
            if (this.animatingForward) {
                MediaPage mediaPage = mediaPageArr[0];
                mediaPage.setTranslationX((-f) * mediaPage.getMeasuredWidth());
                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth() - (mediaPageArr[0].getMeasuredWidth() * f));
            } else {
                MediaPage mediaPage2 = mediaPageArr[0];
                mediaPage2.setTranslationX(mediaPage2.getMeasuredWidth() * f);
                mediaPageArr[1].setTranslationX((mediaPageArr[0].getMeasuredWidth() * f) - mediaPageArr[0].getMeasuredWidth());
            }
            onTabProgress(getTabProgress());
            float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(f);
            this.optionsAlpha = photoVideoOptionsAlpha;
            this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem == null || canShowSearchItem()) {
                this.searchAlpha = getSearchAlpha(f);
                updateSearchItemIconAnimated();
            } else {
                actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                this.searchAlpha = 0.0f;
            }
            updateOptionsSearch(false);
            if (f == 1.0f) {
                MediaPage mediaPage3 = mediaPageArr[0];
                mediaPageArr[0] = mediaPageArr[1];
                mediaPageArr[1] = mediaPage3;
                mediaPage3.setVisibility(8);
                if (actionBarMenuItem != null && this.searchItemState == 2) {
                    actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                }
                this.searchItemState = 0;
                startStopVisibleGifs();
            }
        }
    }

    public void onSearchStateChanged(boolean z) {
    }

    public void onSelectedTabChanged() {
        boolean z = isStoriesView() || isArchivedOnlyStoriesView();
        StoriesAdapter.AnonymousClass1 anonymousClass1 = this.archivedStoriesAdapter.poller;
        if (anonymousClass1 != null) {
            anonymousClass1.start(z && getClosestTab() == 9);
        }
        StoriesAdapter.AnonymousClass1 anonymousClass2 = this.storiesAdapter.poller;
        if (anonymousClass2 != null) {
            anonymousClass2.start(z && getClosestTab() == 8);
        }
        for (StoryAlbumData storyAlbumData : this.storyAlbumsById.values()) {
            StoryAlbumData.AnonymousClass1 anonymousClass3 = storyAlbumData.adapter;
            if (anonymousClass3.storiesList != null) {
                anonymousClass3.poller.start(z && getClosestTab() == storyAlbumData.tabType);
            }
        }
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            AnonymousClass31 anonymousClass31 = this.searchTagsList;
            actionBarMenuItem.setSearchFieldHint(LocaleController.getString((anonymousClass31 != null && anonymousClass31.hasFilters() && getSelectedTab() == 11) ? R.string.SavedTagSearchHint : R.string.Search));
        }
        checkStoriesTabsPosition();
    }

    public void onTabProgress(float f) {
        onBottomButtonVisibilityChange();
    }

    public void onTabScroll(boolean z) {
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!this.disableScrolling) {
            BaseFragment baseFragment = this.profileActivity;
            if (baseFragment.getParentLayout() != null && !((ActionBarLayout) baseFragment.getParentLayout()).checkTransitionAnimation() && !checkTabsAnimationInProgress() && !this.isInPinchToZoomTouchMode) {
                if (motionEvent != null) {
                    if (this.velocityTracker == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    HintView hintView = this.fwdRestrictedHint;
                    if (hintView != null) {
                        hintView.hide(true);
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
                    boolean z2 = this.startedTracking;
                    MediaPage[] mediaPageArr = this.mediaPages;
                    if (z2 && (((z = this.animatingForward) && x > 0) || (!z && x < 0))) {
                        if (!prepareForMoving(motionEvent, x < 0)) {
                            this.maybeStartTracking = true;
                            this.startedTracking = false;
                            onTabScroll(false);
                            mediaPageArr[0].setTranslationX(0.0f);
                            mediaPageArr[1].setTranslationX(this.animatingForward ? mediaPageArr[0].getMeasuredWidth() : -mediaPageArr[0].getMeasuredWidth());
                            selectTabWithId(0.0f, mediaPageArr[1].selectedType);
                            onTabProgress(getTabProgress());
                        }
                    }
                    if (!this.maybeStartTracking || this.startedTracking) {
                        if (this.startedTracking) {
                            mediaPageArr[0].setTranslationX(x);
                            if (this.animatingForward) {
                                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth() + x);
                            } else {
                                mediaPageArr[1].setTranslationX(x - mediaPageArr[0].getMeasuredWidth());
                            }
                            float fAbs = Math.abs(x) / mediaPageArr[0].getMeasuredWidth();
                            if (canShowSearchItem()) {
                                this.searchAlpha = getSearchAlpha(fAbs);
                                updateSearchItemIcon(fAbs);
                                float photoVideoOptionsAlpha = getPhotoVideoOptionsAlpha(fAbs);
                                this.optionsAlpha = photoVideoOptionsAlpha;
                                this.photoVideoOptionsItem.setVisibility((photoVideoOptionsAlpha == 0.0f || !canShowSearchItem() || isArchivedOnlyStoriesView()) ? 4 : 0);
                            } else {
                                this.searchAlpha = 0.0f;
                            }
                            updateOptionsSearch(false);
                            selectTabWithId(fAbs, mediaPageArr[1].selectedType);
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
        }
        return false;
    }

    public final void openAddStoriesToAlbumSheet(BaseFragment baseFragment, long j, int i) {
        new SelectStoriesBottomSheet(baseFragment, j, this.mediaColumnsCount[1], new BulletinFactory$$ExternalSyntheticLambda4(this, j, i)).show();
    }

    public final void openDeleteStoriesAlbumAlert(BaseFragment baseFragment, long j, int i) {
        StoriesController.StoryAlbum storyAlbumFindById;
        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, false);
        String str = (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(i)) == null) ? null : storyAlbumFindById.title;
        int i2 = R.string.Delete;
        AlertsCreator.showSimpleConfirmAlert(baseFragment, LocaleController.getString(i2), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoriesAlbumMenuDeleteAlbumAsk, str)), LocaleController.getString(i2), true, new ChatMessageCell$$ExternalSyntheticLambda5(this, j, i, 6));
    }

    @Override
    public final void openHiddenStories() {
    }

    public final void openRenameStoriesAlbumAlert(BaseFragment baseFragment, long j, int i) {
        StoriesController.StoryAlbum storyAlbumFindById;
        StoriesController.StoriesCollections storyAlbumsList = getStoriesController().getStoryAlbumsList(j, false);
        String str = (storyAlbumsList == null || (storyAlbumFindById = storyAlbumsList.findById(i)) == null) ? null : storyAlbumFindById.title;
        Context context = baseFragment.getContext();
        Theme.ResourcesProvider resourceProvider = baseFragment.getResourceProvider();
        VoIPService$$ExternalSyntheticLambda80 voIPService$$ExternalSyntheticLambda80 = new VoIPService$$ExternalSyntheticLambda80(this, j, i);
        Pattern pattern = AlertsCreator.URL_PATTERN;
        AlertsCreator.createSimpleTextInputAlert(context, baseFragment, LocaleController.getString(R.string.StoriesAlbumRename), LocaleController.getString(R.string.StoriesAlbumRenameHint), LocaleController.getString(R.string.StoriesAlbumTitleInputHint), str, 12, LocaleController.getString(R.string.Rename), resourceProvider, voIPService$$ExternalSyntheticLambda80);
    }

    @Override
    public final void openStory(DialogCell dialogCell) {
        BaseFragment baseFragment = this.profileActivity;
        if (baseFragment != null && baseFragment.getMessagesController().getStoriesController().hasStories(dialogCell.getDialogId())) {
            baseFragment.getOrCreateStoryViewer().getClass();
            StoryViewer orCreateStoryViewer = baseFragment.getOrCreateStoryViewer();
            Context context = baseFragment.getContext();
            long dialogId = dialogCell.getDialogId();
            int iDp = 0;
            StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider((RecyclerListView) dialogCell.getParent(), false);
            if ((baseFragment instanceof ProfileActivity) && ((ProfileActivity) baseFragment).myProfile) {
                iDp = AndroidUtilities.dp(68.0f);
            }
            storiesListPlaceProvider.addBottomClip += iDp;
            orCreateStoryViewer.open(context, dialogId, storiesListPlaceProvider);
        }
    }

    public int overrideColumnsCount() {
        return -1;
    }

    public final void pinOnUnpinStories(ArrayList arrayList, boolean z) {
        AnonymousClass9 anonymousClass9 = this.storiesAdapter;
        if (anonymousClass9 == null || anonymousClass9.storiesList == null) {
            return;
        }
        BaseFragment baseFragment = this.profileActivity;
        if (z && arrayList.size() > baseFragment.getMessagesController().storiesPinnedToTopCountMax) {
            BulletinFactory.of(baseFragment).createSimpleBulletinWithIconSize(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", baseFragment.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
            return;
        }
        StoriesController.StoriesList storiesList = anonymousClass9.storiesList;
        storiesList.getClass();
        ArrayList arrayList2 = storiesList.pinnedIds;
        ArrayList arrayList3 = new ArrayList(arrayList2);
        boolean z2 = true;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Integer num = (Integer) arrayList.get(size);
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
                ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new PassportActivity$$ExternalSyntheticLambda1(19));
            }
            z2 = z3;
        }
        if (z2) {
            BulletinFactory.of(baseFragment).createSimpleBulletinWithIconSize(R.raw.chats_infotip, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinLimit", baseFragment.getMessagesController().storiesPinnedToTopCountMax, new Object[0]))).show();
        } else if (z) {
            BulletinFactory.of(baseFragment).createSimpleBulletin(AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesPinned", arrayList.size(), new Object[0])), LocaleController.formatPluralString("StoriesPinnedText", arrayList.size(), new Object[0]), R.raw.ic_pin).show();
        } else {
            BulletinFactory.of(baseFragment).createSimpleBulletinWithIconSize(R.raw.ic_unpin, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("StoriesUnpinned", arrayList.size(), new Object[0]))).show();
        }
    }

    public final boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
        MediaPage mediaPage;
        MediaPage mediaPage2;
        AnonymousClass12 anonymousClass12;
        int closestTab = getClosestTab();
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        int currentAlbumId = -1;
        int i = anonymousClass39.positionToId.get(anonymousClass39.currentPosition + (z ? 1 : -1), -1);
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (anonymousClass15 != null) {
            if (isStoryAlbumPageType(closestTab) || closestTab == 8) {
                ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass15.tabsView;
                currentAlbumId = anonymousClass3.positionToId.get(anonymousClass3.currentPosition + (z ? 1 : -1), -1);
            } else if (isStoryAlbumPageType(i) || i == 8) {
                currentAlbumId = anonymousClass15.getCurrentAlbumId();
            }
            if (currentAlbumId == 0) {
                i = 8;
            } else if (currentAlbumId > 0) {
                i = storyAlbums_getByAlbumId(currentAlbumId).tabType;
            }
        }
        if (i >= 0) {
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem == null || canShowSearchItem()) {
                this.searchAlpha = getSearchAlpha(0.0f);
                updateSearchItemIcon(0.0f);
            } else {
                actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                this.searchAlpha = 0.0f;
            }
            if ((!this.searching || getSelectedTab() != 11) && (!canEditStories() || !this.isActionModeShowed || (getClosestTab() != 8 && !isStoryAlbumPageType(getClosestTab())))) {
                MediaPage[] mediaPageArr = this.mediaPages;
                MediaPage mediaPage3 = mediaPageArr[0];
                if (mediaPage3 == null || mediaPage3.selectedType != 13 || (anonymousClass12 = this.botPreviewsContainer) == null) {
                    mediaPage = mediaPageArr[0];
                    AnonymousClass13 anonymousClass13 = this.giftsContainer;
                    if (mediaPage == null && mediaPage.selectedType == 14 && anonymousClass13 != null) {
                        ProfileGiftsContainer.AnonymousClass1 anonymousClass1 = anonymousClass13.viewPager;
                        if (!z ? anonymousClass1.getCurrentPosition() <= 0 : anonymousClass1.getCurrentPosition() >= anonymousClass13.collections.getCollections().size()) {
                            if (this.isActionModeShowed) {
                                updateOptionsSearch(false);
                                getParent().requestDisallowInterceptTouchEvent(true);
                                hideFloatingDateView$2();
                                this.maybeStartTracking = false;
                                this.startedTracking = true;
                                onTabScroll(true);
                                this.startedTrackingX = (int) motionEvent.getX();
                                this.actionBar.setEnabled(false);
                                anonymousClass39.setEnabled(false);
                                MediaPage mediaPage4 = mediaPageArr[1];
                                mediaPage4.selectedType = i;
                                mediaPage4.setVisibility(0);
                                this.animatingForward = z;
                                switchToCurrentSelectedMode(true);
                                if (z) {
                                    mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                                } else {
                                    mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                                }
                                onTabProgress(getTabProgress());
                                return true;
                            }
                            updateOptionsSearch(false);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            hideFloatingDateView$2();
                            this.maybeStartTracking = false;
                            this.startedTracking = true;
                            onTabScroll(true);
                            this.startedTrackingX = (int) motionEvent.getX();
                            this.actionBar.setEnabled(false);
                            anonymousClass39.setEnabled(false);
                            MediaPage mediaPage5 = mediaPageArr[1];
                            mediaPage5.selectedType = i;
                            mediaPage5.setVisibility(0);
                            this.animatingForward = z;
                            switchToCurrentSelectedMode(true);
                            if (z) {
                                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                            } else {
                                mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                            }
                            onTabProgress(getTabProgress());
                            return true;
                        }
                    } else if ((this.isActionModeShowed || (mediaPage2 = mediaPageArr[0]) == null || mediaPage2.selectedType != 13) && ((anonymousClass13 == null || !anonymousClass13.isReordering()) && (anonymousClass15 == null || !anonymousClass15.reorderingCollections))) {
                        updateOptionsSearch(false);
                        getParent().requestDisallowInterceptTouchEvent(true);
                        hideFloatingDateView$2();
                        this.maybeStartTracking = false;
                        this.startedTracking = true;
                        onTabScroll(true);
                        this.startedTrackingX = (int) motionEvent.getX();
                        this.actionBar.setEnabled(false);
                        anonymousClass39.setEnabled(false);
                        MediaPage mediaPage6 = mediaPageArr[1];
                        mediaPage6.selectedType = i;
                        mediaPage6.setVisibility(0);
                        this.animatingForward = z;
                        switchToCurrentSelectedMode(true);
                        if (z) {
                            mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                        } else {
                            mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                        }
                        onTabProgress(getTabProgress());
                        return true;
                    }
                } else {
                    ProfileStoriesCollectionTabs.AnonymousClass1 anonymousClass2 = anonymousClass12.viewPager;
                    if (!z ? anonymousClass2.getCurrentPosition() == 0 : anonymousClass2.getCurrentPosition() == anonymousClass12.langLists.size()) {
                        mediaPage = mediaPageArr[0];
                        AnonymousClass13 anonymousClass14 = this.giftsContainer;
                        if (mediaPage == null) {
                            if (this.isActionModeShowed) {
                                updateOptionsSearch(false);
                                getParent().requestDisallowInterceptTouchEvent(true);
                                hideFloatingDateView$2();
                                this.maybeStartTracking = false;
                                this.startedTracking = true;
                                onTabScroll(true);
                                this.startedTrackingX = (int) motionEvent.getX();
                                this.actionBar.setEnabled(false);
                                anonymousClass39.setEnabled(false);
                                MediaPage mediaPage7 = mediaPageArr[1];
                                mediaPage7.selectedType = i;
                                mediaPage7.setVisibility(0);
                                this.animatingForward = z;
                                switchToCurrentSelectedMode(true);
                                if (z) {
                                    mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                                } else {
                                    mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                                }
                                onTabProgress(getTabProgress());
                                return true;
                            }
                            updateOptionsSearch(false);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            hideFloatingDateView$2();
                            this.maybeStartTracking = false;
                            this.startedTracking = true;
                            onTabScroll(true);
                            this.startedTrackingX = (int) motionEvent.getX();
                            this.actionBar.setEnabled(false);
                            anonymousClass39.setEnabled(false);
                            MediaPage mediaPage8 = mediaPageArr[1];
                            mediaPage8.selectedType = i;
                            mediaPage8.setVisibility(0);
                            this.animatingForward = z;
                            switchToCurrentSelectedMode(true);
                            if (z) {
                                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                            } else {
                                mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                            }
                            onTabProgress(getTabProgress());
                            return true;
                        }
                        if (this.isActionModeShowed) {
                            updateOptionsSearch(false);
                            getParent().requestDisallowInterceptTouchEvent(true);
                            hideFloatingDateView$2();
                            this.maybeStartTracking = false;
                            this.startedTracking = true;
                            onTabScroll(true);
                            this.startedTrackingX = (int) motionEvent.getX();
                            this.actionBar.setEnabled(false);
                            anonymousClass39.setEnabled(false);
                            MediaPage mediaPage9 = mediaPageArr[1];
                            mediaPage9.selectedType = i;
                            mediaPage9.setVisibility(0);
                            this.animatingForward = z;
                            switchToCurrentSelectedMode(true);
                            if (z) {
                                mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                            } else {
                                mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                            }
                            onTabProgress(getTabProgress());
                            return true;
                        }
                        updateOptionsSearch(false);
                        getParent().requestDisallowInterceptTouchEvent(true);
                        hideFloatingDateView$2();
                        this.maybeStartTracking = false;
                        this.startedTracking = true;
                        onTabScroll(true);
                        this.startedTrackingX = (int) motionEvent.getX();
                        this.actionBar.setEnabled(false);
                        anonymousClass39.setEnabled(false);
                        MediaPage mediaPage10 = mediaPageArr[1];
                        mediaPage10.selectedType = i;
                        mediaPage10.setVisibility(0);
                        this.animatingForward = z;
                        switchToCurrentSelectedMode(true);
                        if (z) {
                            mediaPageArr[1].setTranslationX(mediaPageArr[0].getMeasuredWidth());
                        } else {
                            mediaPageArr[1].setTranslationX(-mediaPageArr[0].getMeasuredWidth());
                        }
                        onTabProgress(getTabProgress());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int processColor(int i) {
        return i;
    }

    public final void recycleAdapter(RecyclerView.Adapter adapter) {
        if (adapter instanceof SharedPhotoVideoAdapter) {
            ArrayList arrayList = this.cellCache;
            ArrayList arrayList2 = this.cache;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
            return;
        }
        if (adapter == this.audioAdapter) {
            ArrayList arrayList3 = this.audioCellCache;
            ArrayList arrayList4 = this.audioCache;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
            return;
        }
        PollAdapter pollAdapter = this.pollAdapter;
        if (adapter == pollAdapter) {
            pollAdapter.listView = null;
        }
    }

    public final void saveScrollPosition() {
        int i;
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                return;
            }
            AnonymousClass19 anonymousClass19 = mediaPageArr[i2].listView;
            if (anonymousClass19 != null) {
                int id = 0;
                int top = 0;
                for (int i3 = 0; i3 < anonymousClass19.getChildCount(); i3++) {
                    View childAt = anonymousClass19.getChildAt(i3);
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
                    int i4 = mediaPageArr[i2].selectedType;
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
                    } else if (i4 >= 0) {
                        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
                        if (i4 < sharedMediaDataArr.length) {
                            for (int i7 = 0; i7 < sharedMediaDataArr[i4].messages.size(); i7++) {
                                if (id == ((MessageObject) sharedMediaDataArr[i4].messages.get(i7)).getId()) {
                                    i5 = i7;
                                    break;
                                }
                            }
                            i = sharedMediaDataArr[i4].startOffset + i5;
                        }
                    }
                    if (i5 >= 0) {
                        ((LinearLayoutManager) anonymousClass19.getLayoutManager()).scrollToPositionWithOffset(i, (-mediaPageArr[i2].listView.getPaddingTop()) + top);
                        if (this.photoVideoChangeColumnsAnimation) {
                            MediaPage mediaPage = mediaPageArr[i2];
                            AnonymousClass20 anonymousClass20 = mediaPage.animationSupportingLayoutManager;
                            anonymousClass20.scrollToPositionWithOffset(i, (-mediaPage.listView.getPaddingTop()) + top, anonymousClass20.mShouldReverseLayout);
                        }
                    }
                }
            }
            i2++;
        }
    }

    public final void scrollToPage(int i) {
        AnonymousClass39 anonymousClass39;
        if (this.disableScrolling || (anonymousClass39 = this.scrollSlidingTextTabStrip) == null) {
            return;
        }
        anonymousClass39.scrollTo(null, i, anonymousClass39.idToPosition.get(i));
    }

    public final void selectTabWithId(float f, int i) {
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        if (anonymousClass39 != null) {
            anonymousClass39.selectTabWithId$1(f, isStoryAlbumPageType(i) ? 8 : i);
        }
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (anonymousClass15 != null) {
            boolean zIsStoryAlbumPageType = isStoryAlbumPageType(i);
            ViewPagerFixed.AnonymousClass3 anonymousClass3 = anonymousClass15.tabsView;
            if (zIsStoryAlbumPageType) {
                anonymousClass3.selectTabWithId(f, storyAlbums_getAlbumIdByTabType(i));
            } else if (i == 8) {
                anonymousClass3.selectTabWithId(f, 0);
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
                        SharedMediaData sharedMediaData = sharedMediaDataArr[i];
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
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        if (anonymousClass39 != null) {
            anonymousClass39.setInitialTabId(isArchivedOnlyStoriesView() ? 9 : 8);
        }
        updateTabs(true);
        switchToCurrentSelectedMode(false);
    }

    public final void setChatUsers(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                if (this.topicId == 0) {
                    ChatUsersAdapter chatUsersAdapter = this.chatUsersAdapter;
                    chatUsersAdapter.chatInfo = chatFull;
                    chatUsersAdapter.sortedUsers = arrayList;
                }
                updateTabs(true);
                for (int i2 = 0; i2 < mediaPageArr.length; i2++) {
                    MediaPage mediaPage = mediaPageArr[i2];
                    if (mediaPage.selectedType == 7 && mediaPage.listView.getAdapter() != null) {
                        AndroidUtilities.notifyDataSetChanged(mediaPageArr[i2].listView);
                    }
                }
                return;
            }
            MediaPage mediaPage2 = mediaPageArr[i];
            if (mediaPage2.selectedType == 7 && mediaPage2.listView.getAdapter() != null && mediaPageArr[i].listView.getAdapter().getItemCount() != 0 && this.profileActivity.getMessagesController().getStoriesController().loadingDialogsStories.size() > 0) {
                return;
            } else {
                i++;
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
        int[] iArr2;
        int i = 0;
        while (true) {
            iArr2 = this.hasMedia;
            if (i > 6 || iArr2[i] >= 0) {
                break;
            } else {
                i++;
            }
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        updateTabs(true);
        checkCurrentTabValid();
        if (iArr2[0] >= 0) {
            loadFastScrollData(false);
        }
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.topPadding = i2;
        int i5 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i5 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i5].setTranslationY(this.topPadding);
            i5++;
        }
        if (this.topPanelLayout != null) {
            checkUi_topPanelLayoutY();
        } else {
            AnonymousClass30 anonymousClass30 = this.fragmentContextView;
            if (anonymousClass30 != null) {
                anonymousClass30.setTranslationY(AndroidUtilities.dp(48.0f) + i2);
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
                        AnonymousClass19 anonymousClass19 = mediaPage.listView;
                        int paddingLeft = anonymousClass19.getPaddingLeft();
                        AnonymousClass19 anonymousClass110 = mediaPage.listView;
                        int i2 = anonymousClass110.topPadding;
                        int paddingRight = anonymousClass110.getPaddingRight();
                        AnonymousClass19 anonymousClass111 = mediaPage.listView;
                        int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
                        anonymousClass111.hintPaddingBottom = pagePaddingBottom;
                        anonymousClass19.setPadding(paddingLeft, i2, paddingRight, pagePaddingBottom);
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
        int i2 = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i2 >= mediaPageArr.length) {
                break;
            }
            float f = (-(getMeasuredHeight() - Math.max(i, AndroidUtilities.dp(mediaPageArr[i2].selectedType == 8 ? 280.0f : 120.0f)))) / 2.0f;
            mediaPageArr[i2].emptyView.setTranslationY(f);
            mediaPageArr[i2].progressView.setTranslationY(-f);
            i2++;
        }
        AnonymousClass12 anonymousClass12 = this.botPreviewsContainer;
        if (anonymousClass12 != null) {
            anonymousClass12.setVisibleHeight(i);
        }
        AnonymousClass13 anonymousClass13 = this.giftsContainer;
        if (anonymousClass13 != null) {
            anonymousClass13.setVisibleHeight(i);
        }
    }

    public void showActionMode$1(boolean z) {
        if (this.isActionModeShowed == z) {
            return;
        }
        this.isActionModeShowed = z;
        AnimatorSet animatorSet = this.actionModeAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        BlurredLinearLayout blurredLinearLayout = this.actionModeLayout;
        if (z) {
            blurredLinearLayout.setVisibility(0);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.actionModeAnimation = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(blurredLinearLayout, (Property<BlurredLinearLayout, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.actionModeAnimation.setDuration(180L);
        this.actionModeAnimation.addListener(new LoginActivity.AnonymousClass9(8, this, z));
        this.actionModeAnimation.start();
        if (z) {
            updateStoriesPinButton();
        }
    }

    @Override
    public final void showChatPreview(DialogCell dialogCell) {
    }

    public final void showMediaCalendar(int i, boolean z) {
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
        SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
        if (!z || (mediaPage = getMediaPage(0)) == null) {
            i2 = 0;
        } else {
            ArrayList arrayList = sharedMediaDataArr[0].fastScrollPeriods;
            int iFindFirstVisibleItemPosition = mediaPage.layoutManager.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition >= 0) {
                Period period = null;
                if (arrayList != null) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        if (iFindFirstVisibleItemPosition <= ((Period) arrayList.get(i3)).startOffset) {
                            period = (Period) arrayList.get(i3);
                            break;
                        }
                    }
                    if (period == null) {
                        period = (Period) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList);
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
        CalendarActivity calendarActivity = new CalendarActivity(sharedMediaDataArr[0].filterType, i2, bundle);
        calendarActivity.callback = new PhotoViewer.AnonymousClass18(this, 18);
        this.profileActivity.presentFragment(calendarActivity);
    }

    public final void startAlbumsReorder(int i) {
        int iStoryAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(getClosestTab());
        AnonymousClass15 anonymousClass15 = this.storiesContainer;
        if (iStoryAlbums_getAlbumIdByTabType != i) {
            if (anonymousClass15 != null) {
                anonymousClass15.tabsView.scrollToTab(i, anonymousClass15.adapter.getItemPosition(i));
                return;
            }
            return;
        }
        anonymousClass15.setReorderingAlbums(true);
        StoryAlbumData storyAlbumDataStoryAlbums_getByAlbumId = storyAlbums_getByAlbumId(i);
        MediaPage mediaPage = getMediaPage(storyAlbumDataStoryAlbums_getByAlbumId.tabType);
        if (mediaPage == null) {
            return;
        }
        AnonymousClass19 anonymousClass19 = mediaPage.listView;
        for (int i2 = 0; i2 < anonymousClass19.getChildCount(); i2++) {
            View childAt = anonymousClass19.getChildAt(i2);
            if (childAt instanceof SharedPhotoVideoCell2) {
                ((SharedPhotoVideoCell2) childAt).setReordering(true, true);
            }
        }
        StoryAlbumData.AnonymousClass1 anonymousClass1 = storyAlbumDataStoryAlbums_getByAlbumId.adapter;
        if (anonymousClass1 != null && !anonymousClass1.inAlbumStoriesReorder) {
            anonymousClass1.inAlbumStoriesReorder = true;
        }
        updateOptionsSearch(true);
    }

    public final void startPinchToMediaColumnsCount(boolean z) {
        MediaPage[] mediaPageArr;
        MediaPage mediaPage;
        if (this.photoVideoChangeColumnsAnimation) {
            return;
        }
        int i = 0;
        while (true) {
            mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                mediaPage = null;
                break;
            }
            int i2 = mediaPageArr[i].selectedType;
            if (i2 == 0 || isAnyStoryPageType(i2)) {
                mediaPage = mediaPageArr[i];
                break;
            }
            i++;
        }
        if (mediaPage != null) {
            int i3 = mediaPage.selectedType;
            this.changeColumnsTab = i3;
            boolean zIsAnyStoryPageType = isAnyStoryPageType(i3);
            int[] iArr = this.mediaColumnsCount;
            int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, iArr[zIsAnyStoryPageType ? 1 : 0], z);
            this.animateToColumnsCount = nextMediaColumnsCount;
            if (nextMediaColumnsCount != iArr[zIsAnyStoryPageType ? 1 : 0]) {
                if (this.allowStoriesSingleColumn && isAnyStoryPageType(this.changeColumnsTab)) {
                    return;
                }
                mediaPage.animationSupportingListView.setVisibility(0);
                if (isAnyStoryPageType(this.changeColumnsTab)) {
                    mediaPage.animationSupportingListView.setAdapter(storyAlbums_getStoriesSupportingAdapterByTabType(this.changeColumnsTab));
                } else {
                    mediaPage.animationSupportingListView.setAdapter(this.animationSupportingPhotoVideoAdapter);
                }
                InternalListView internalListView = mediaPage.animationSupportingListView;
                internalListView.setPadding(internalListView.getPaddingLeft(), getPagePaddingTop(this.changeColumnsTab), mediaPage.animationSupportingListView.getPaddingRight(), getPagePaddingBottom(isStoriesView()));
                mediaPage.animationSupportingLayoutManager.setSpanCount(nextMediaColumnsCount);
                mediaPage.animationSupportingListView.invalidateItemDecorations();
                mediaPage.animationSupportingLayoutManager.mSpanSizeLookup = new AnonymousClass34(this, mediaPage, 0);
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
                for (MediaPage mediaPage2 : mediaPageArr) {
                    if (mediaPage2.selectedType == this.changeColumnsTab) {
                        AnonymousClass20 anonymousClass20 = mediaPage2.animationSupportingLayoutManager;
                        anonymousClass20.scrollToPositionWithOffset(this.pinchCenterPosition, this.pinchCenterOffset - mediaPage2.animationSupportingListView.getPaddingTop(), anonymousClass20.mShouldReverseLayout);
                    }
                }
            }
        }
    }

    public final void startStopVisibleGifs() {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = mediaPageArr[i].listView.getChildAt(i2);
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

    public final void stopScroll(MotionEvent motionEvent) {
        float xVelocity;
        float yVelocity;
        float measuredWidth;
        int i = 1;
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
            MediaPage[] mediaPageArr = this.mediaPages;
            float x = mediaPageArr[0].getX();
            this.tabsAnimation = new AnimatorSet();
            this.backAnimation = Math.abs(x) < ((float) mediaPageArr[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ScrimOptions$$ExternalSyntheticLambda2(this, 18));
            boolean z = this.backAnimation;
            Property property = View.TRANSLATION_X;
            if (z) {
                measuredWidth = Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet = this.tabsAnimation;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(mediaPageArr[0], (Property<MediaPage, Float>) property, 0.0f);
                    MediaPage mediaPage = mediaPageArr[1];
                    animatorSet.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(mediaPage, (Property<MediaPage, Float>) property, mediaPage.getMeasuredWidth()), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet2 = this.tabsAnimation;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(mediaPageArr[0], (Property<MediaPage, Float>) property, 0.0f);
                    MediaPage mediaPage2 = mediaPageArr[1];
                    animatorSet2.playTogether(objectAnimatorOfFloat2, ObjectAnimator.ofFloat(mediaPage2, (Property<MediaPage, Float>) property, -mediaPage2.getMeasuredWidth()), valueAnimatorOfFloat);
                }
            } else {
                measuredWidth = mediaPageArr[0].getMeasuredWidth() - Math.abs(x);
                if (this.animatingForward) {
                    AnimatorSet animatorSet3 = this.tabsAnimation;
                    MediaPage mediaPage3 = mediaPageArr[0];
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(mediaPage3, (Property<MediaPage, Float>) property, -mediaPage3.getMeasuredWidth()), ObjectAnimator.ofFloat(mediaPageArr[1], (Property<MediaPage, Float>) property, 0.0f), valueAnimatorOfFloat);
                } else {
                    AnimatorSet animatorSet4 = this.tabsAnimation;
                    MediaPage mediaPage4 = mediaPageArr[0];
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(mediaPage4, (Property<MediaPage, Float>) property, mediaPage4.getMeasuredWidth()), ObjectAnimator.ofFloat(mediaPageArr[1], (Property<MediaPage, Float>) property, 0.0f), valueAnimatorOfFloat);
                }
            }
            this.tabsAnimation.setInterpolator(interpolator);
            int measuredWidth2 = getMeasuredWidth();
            float f = measuredWidth2 / 2;
            float fDistanceInfluenceForSnapDuration = (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth2)) * f) + f;
            float fAbs = Math.abs(xVelocity);
            this.tabsAnimation.setDuration(Math.max(150, Math.min(fAbs > 0.0f ? Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs) * 1000.0f) * 4 : (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f), 600)));
            this.tabsAnimation.addListener(new AnonymousClass41(this, i));
            this.tabsAnimation.start();
            this.tabsAnimationInProgress = true;
            this.startedTracking = false;
            onSelectedTabChanged();
        } else {
            this.maybeStartTracking = false;
            this.actionBar.setEnabled(true);
            setEnabled(true);
        }
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    public final int storyAlbums_getAlbumIdByTabType(int i) {
        Integer num = (Integer) this.storyAlbumsByTabType.get(Integer.valueOf(i));
        StoryAlbumData storyAlbumData = num == null ? null : (StoryAlbumData) this.storyAlbumsById.get(num);
        if (storyAlbumData == null) {
            return -1;
        }
        return storyAlbumData.albumId;
    }

    public final StoryAlbumData storyAlbums_getByAlbumId(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.storyAlbumsById;
        StoryAlbumData storyAlbumData = (StoryAlbumData) map.get(numValueOf);
        if (storyAlbumData != null) {
            return storyAlbumData;
        }
        StoryAlbumData storyAlbumData2 = new StoryAlbumData(getContext(), i);
        map.put(Integer.valueOf(i), storyAlbumData2);
        this.storyAlbumsByTabType.put(Integer.valueOf(storyAlbumData2.tabType), Integer.valueOf(i));
        return storyAlbumData2;
    }

    public final StoriesAdapter storyAlbums_getStoriesAdapterByTabType(int i) {
        if (i == 8) {
            return this.storiesAdapter;
        }
        if (i == 9) {
            return this.archivedStoriesAdapter;
        }
        if (isStoryAlbumPageType(i)) {
            Integer num = (Integer) this.storyAlbumsByTabType.get(Integer.valueOf(i));
            StoryAlbumData storyAlbumData = num == null ? null : (StoryAlbumData) this.storyAlbumsById.get(num);
            if (storyAlbumData != null) {
                return storyAlbumData.adapter;
            }
        }
        return null;
    }

    public final StoriesAdapter storyAlbums_getStoriesSupportingAdapterByTabType(int i) {
        if (i == 8) {
            return this.animationSupportingStoriesAdapter;
        }
        if (i == 9) {
            return this.animationSupportingArchivedStoriesAdapter;
        }
        if (isStoryAlbumPageType(i)) {
            Integer num = (Integer) this.storyAlbumsByTabType.get(Integer.valueOf(i));
            StoryAlbumData storyAlbumData = num == null ? null : (StoryAlbumData) this.storyAlbumsById.get(num);
            if (storyAlbumData != null) {
                return storyAlbumData.adapterSupport;
            }
        }
        return null;
    }

    public final void switchToCurrentSelectedMode(boolean z) {
        MediaPage[] mediaPageArr;
        MediaPage[] mediaPageArr2;
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
        RecyclerView.RecycledViewPool recycledViewPool2;
        int i5;
        int i6;
        boolean z8;
        AnonymousClass13 anonymousClass13 = this.giftsContainer;
        if (anonymousClass13 != null) {
            ProfileGiftsContainer.Page currentPage = anonymousClass13.getCurrentPage();
            if (currentPage != null) {
                currentPage.resetReordering();
            }
            anonymousClass13.setReorderingCollections(false);
        }
        int i7 = 0;
        while (true) {
            mediaPageArr = this.mediaPages;
            if (i7 >= mediaPageArr.length) {
                break;
            }
            mediaPageArr[i7].listView.stopScroll();
            i7++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mediaPageArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = AndroidUtilities.dp(mediaPageTopMargin());
        RecyclerView.Adapter adapter = mediaPageArr[z ? 1 : 0].listView.getAdapter();
        ItemTouchHelper itemTouchHelper = this.storiesReorder;
        if (adapter == this.storiesAdapter) {
            itemTouchHelper.attachToRecyclerView(null);
        }
        boolean z9 = this.searching;
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        Delegate delegate = this.delegate;
        PollAdapter pollAdapter = this.pollAdapter;
        if (z9 && this.searchWas) {
            MediaPage mediaPage = mediaPageArr[z ? 1 : 0];
            if (mediaPage.searchViewPool == null) {
                mediaPage.searchViewPool = new RecyclerView.RecycledViewPool();
            }
            MediaPage mediaPage2 = mediaPageArr[z ? 1 : 0];
            RecyclerView.RecycledViewPool recycledViewPool3 = mediaPage2.searchViewPool;
            SavedMessagesSearchAdapter savedMessagesSearchAdapter = this.savedMessagesSearchAdapter;
            GroupUsersSearchAdapter groupUsersSearchAdapter = this.groupUsersSearchAdapter;
            MediaSearchAdapter mediaSearchAdapter = this.audioSearchAdapter;
            MediaSearchAdapter mediaSearchAdapter2 = this.linksSearchAdapter;
            MediaSearchAdapter mediaSearchAdapter3 = this.documentsSearchAdapter;
            if (z) {
                int i8 = mediaPage2.selectedType;
                if (i8 == 0 || i8 == 2 || i8 == 5 || i8 == 6 || (i8 == 7 && !delegate.canSearchMembers())) {
                    this.searching = false;
                    AnonymousClass31 anonymousClass31 = this.searchTagsList;
                    if (anonymousClass31 != null) {
                        anonymousClass31.show(false);
                    }
                    this.searchWas = false;
                    switchToCurrentSelectedMode(true);
                    return;
                }
                String string = actionBarMenuItem != null ? actionBarMenuItem.getSearchField().getText().toString() : "";
                int i9 = mediaPageArr[z ? 1 : 0].selectedType;
                if (i9 == 1) {
                    if (mediaSearchAdapter3 != null) {
                        mediaSearchAdapter3.search(string, false);
                        if (adapter != mediaSearchAdapter3) {
                            recycleAdapter(adapter);
                            mediaPageArr[z ? 1 : 0].listView.setAdapter(mediaSearchAdapter3);
                        }
                    }
                } else if (i9 == 3) {
                    if (mediaSearchAdapter2 != null) {
                        mediaSearchAdapter2.search(string, false);
                        if (adapter != mediaSearchAdapter2) {
                            recycleAdapter(adapter);
                            mediaPageArr[z ? 1 : 0].listView.setAdapter(mediaSearchAdapter2);
                        }
                    }
                } else if (i9 == 4) {
                    if (mediaSearchAdapter != null) {
                        mediaSearchAdapter.search(string, false);
                        if (adapter != mediaSearchAdapter) {
                            recycleAdapter(adapter);
                            mediaPageArr[z ? 1 : 0].listView.setAdapter(mediaSearchAdapter);
                        }
                    }
                } else if (i9 == 7) {
                    if (groupUsersSearchAdapter != null) {
                        groupUsersSearchAdapter.search(string, false);
                        if (adapter != groupUsersSearchAdapter) {
                            recycleAdapter(adapter);
                            mediaPageArr[z ? 1 : 0].listView.setAdapter(groupUsersSearchAdapter);
                        }
                    }
                } else if (i9 == 11) {
                    if (savedMessagesSearchAdapter != null) {
                        savedMessagesSearchAdapter.search(this.searchingReaction, string);
                        if (adapter != savedMessagesSearchAdapter) {
                            recycleAdapter(adapter);
                            mediaPageArr[z ? 1 : 0].listView.setAdapter(savedMessagesSearchAdapter);
                        }
                    }
                } else if (i9 == 15 && pollAdapter != null && adapter != pollAdapter) {
                    recycleAdapter(adapter);
                    AnonymousClass19 anonymousClass19 = mediaPageArr[z ? 1 : 0].listView;
                    pollAdapter.listView = anonymousClass19;
                    anonymousClass19.setAdapter(pollAdapter);
                }
            } else if (mediaPage2.listView != null) {
                int i10 = mediaPage2.selectedType;
                if (i10 == 1) {
                    if (adapter != mediaSearchAdapter3) {
                        recycleAdapter(adapter);
                        mediaPageArr[z ? 1 : 0].listView.setAdapter(mediaSearchAdapter3);
                    }
                    mediaSearchAdapter3.mObservable.notifyChanged();
                } else if (i10 == 3) {
                    if (adapter != mediaSearchAdapter2) {
                        recycleAdapter(adapter);
                        mediaPageArr[z ? 1 : 0].listView.setAdapter(mediaSearchAdapter2);
                    }
                    mediaSearchAdapter2.mObservable.notifyChanged();
                } else if (i10 == 4) {
                    if (adapter != mediaSearchAdapter) {
                        recycleAdapter(adapter);
                        mediaPageArr[z ? 1 : 0].listView.setAdapter(mediaSearchAdapter);
                    }
                    mediaSearchAdapter.mObservable.notifyChanged();
                } else if (i10 == 7) {
                    if (adapter != groupUsersSearchAdapter) {
                        recycleAdapter(adapter);
                        mediaPageArr[z ? 1 : 0].listView.setAdapter(groupUsersSearchAdapter);
                    }
                    groupUsersSearchAdapter.notifyDataSetChanged();
                } else if (i10 == 11) {
                    if (adapter != savedMessagesSearchAdapter) {
                        recycleAdapter(adapter);
                        mediaPageArr[z ? 1 : 0].listView.setAdapter(savedMessagesSearchAdapter);
                    }
                    savedMessagesSearchAdapter.mObservable.notifyChanged();
                }
            }
            recycledViewPool2 = recycledViewPool3;
            mediaPageArr2 = mediaPageArr;
            i4 = 100;
            z3 = false;
            z7 = false;
        } else {
            MediaPage mediaPage3 = mediaPageArr[z ? 1 : 0];
            if (mediaPage3.viewPool == null) {
                mediaPage3.viewPool = new RecyclerView.RecycledViewPool();
            }
            MediaPage mediaPage4 = mediaPageArr[z ? 1 : 0];
            RecyclerView.RecycledViewPool recycledViewPool4 = mediaPage4.viewPool;
            mediaPage4.listView.setPinnedHeaderShadowDrawable(null);
            int i11 = mediaPageArr[z ? 1 : 0].selectedType;
            if (i11 == 8 || isStoryAlbumPageType(i11)) {
                layoutParams.topMargin = AndroidUtilities.dp(mediaPageTopMargin());
            }
            AnonymousClass19 anonymousClass110 = mediaPageArr[z ? 1 : 0].listView;
            int paddingLeft = anonymousClass110.getPaddingLeft();
            MediaPage mediaPage5 = mediaPageArr[z ? 1 : 0];
            AnonymousClass19 anonymousClass111 = mediaPage5.listView;
            int pagePaddingTop = getPagePaddingTop(mediaPage5.selectedType);
            anonymousClass111.hintPaddingTop = pagePaddingTop;
            int paddingRight = mediaPageArr[z ? 1 : 0].listView.getPaddingRight();
            mediaPageArr2 = mediaPageArr;
            AnonymousClass19 anonymousClass112 = mediaPageArr2[z ? 1 : 0].listView;
            int pagePaddingBottom = getPagePaddingBottom(isStoriesView());
            anonymousClass112.hintPaddingBottom = pagePaddingBottom;
            anonymousClass110.setPadding(paddingLeft, pagePaddingTop, paddingRight, pagePaddingBottom);
            int i12 = mediaPageArr2[z ? 1 : 0].selectedType;
            int[] iArr = this.mediaColumnsCount;
            RecyclerView.Adapter adapter2 = this.documentsAdapter;
            CommonGroupsAdapter commonGroupsAdapter = this.commonGroupsAdapter;
            View view = this.botPreviewsContainer;
            SavedDialogsAdapter savedDialogsAdapter = this.savedDialogsAdapter;
            AnonymousClass7 anonymousClass7 = this.savedMessagesContainer;
            SharedMediaData[] sharedMediaDataArr = this.sharedMediaData;
            if (i12 == 0) {
                RecyclerView.Adapter adapter3 = this.photoVideoAdapter;
                if (adapter != adapter3) {
                    recycleAdapter(adapter);
                    mediaPageArr2[z ? 1 : 0].listView.setAdapter(adapter3);
                }
                int i13 = -AndroidUtilities.dp(1.0f);
                layoutParams.rightMargin = i13;
                layoutParams.leftMargin = i13;
                SharedMediaData sharedMediaData = sharedMediaDataArr[0];
                boolean z10 = sharedMediaData.fastScrollDataLoaded && !sharedMediaData.fastScrollPeriods.isEmpty();
                int i14 = iArr[0];
                mediaPageArr2[z ? 1 : 0].listView.setPinnedHeaderShadowDrawable(this.pinnedHeaderShadowDrawable);
                SharedMediaData sharedMediaData2 = sharedMediaDataArr[0];
                if (sharedMediaData2.recycledViewPool == null) {
                    sharedMediaData2.recycledViewPool = new RecyclerView.RecycledViewPool();
                }
                z3 = z10;
                i = i14;
                recycledViewPool = sharedMediaDataArr[0].recycledViewPool;
                z2 = false;
            } else {
                if (i12 == 1) {
                    SharedMediaData sharedMediaData3 = sharedMediaDataArr[1];
                    z5 = sharedMediaData3.fastScrollDataLoaded && !sharedMediaData3.fastScrollPeriods.isEmpty();
                    if (adapter != adapter2) {
                        recycleAdapter(adapter);
                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(adapter2);
                    }
                } else if (i12 == 2) {
                    SharedMediaData sharedMediaData4 = sharedMediaDataArr[2];
                    z5 = sharedMediaData4.fastScrollDataLoaded && !sharedMediaData4.fastScrollPeriods.isEmpty();
                    if (adapter != this.voiceAdapter) {
                        recycleAdapter(adapter);
                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(this.voiceAdapter);
                    }
                } else {
                    if (i12 == 3) {
                        if (adapter != this.linksAdapter) {
                            recycleAdapter(adapter);
                            mediaPageArr2[z ? 1 : 0].listView.setAdapter(this.linksAdapter);
                        }
                    } else if (i12 == 4) {
                        SharedMediaData sharedMediaData5 = sharedMediaDataArr[4];
                        z5 = sharedMediaData5.fastScrollDataLoaded && !sharedMediaData5.fastScrollPeriods.isEmpty();
                        if (adapter != this.audioAdapter) {
                            recycleAdapter(adapter);
                            mediaPageArr2[z ? 1 : 0].listView.setAdapter(this.audioAdapter);
                        }
                    } else {
                        if (i12 == 5) {
                            if (adapter != this.gifAdapter) {
                                recycleAdapter(adapter);
                                mediaPageArr2[z ? 1 : 0].listView.setAdapter(this.gifAdapter);
                            }
                        } else if (i12 == 15) {
                            if (adapter != pollAdapter) {
                                recycleAdapter(adapter);
                                AnonymousClass19 anonymousClass113 = mediaPageArr2[z ? 1 : 0].listView;
                                pollAdapter.listView = anonymousClass113;
                                anonymousClass113.setAdapter(pollAdapter);
                            }
                        } else if (i12 == 6) {
                            if (adapter != commonGroupsAdapter) {
                                recycleAdapter(adapter);
                                mediaPageArr2[z ? 1 : 0].listView.setAdapter(commonGroupsAdapter);
                            }
                        } else if (i12 != 7) {
                            if (isAnyStoryPageType(i12)) {
                                RecyclerView.Adapter adapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(mediaPageArr2[z ? 1 : 0].selectedType);
                                if (adapter != adapterStoryAlbums_getStoriesAdapterByTabType) {
                                    recycleAdapter(adapter);
                                    mediaPageArr2[z ? 1 : 0].listView.setAdapter(adapterStoryAlbums_getStoriesAdapterByTabType);
                                    mediaPageArr2[z ? 1 : 0].listView.getClass();
                                }
                                MediaPage mediaPage6 = mediaPageArr2[z ? 1 : 0];
                                if (mediaPage6.selectedType != 9) {
                                    itemTouchHelper.attachToRecyclerView(mediaPage6.listView);
                                }
                                i = iArr[1];
                                recycledViewPool = recycledViewPool4;
                                z2 = false;
                            } else {
                                int i15 = mediaPageArr2[z ? 1 : 0].selectedType;
                                if (i15 == 10) {
                                    if (adapter != this.channelRecommendationsAdapter) {
                                        recycleAdapter(adapter);
                                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(this.channelRecommendationsAdapter);
                                    }
                                } else if (i15 == 11) {
                                    if (adapter != savedDialogsAdapter) {
                                        recycleAdapter(adapter);
                                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(savedDialogsAdapter);
                                        ItemTouchHelper itemTouchHelper2 = savedDialogsAdapter.itemTouchHelper;
                                        AnonymousClass19 anonymousClass114 = mediaPageArr2[z ? 1 : 0].listView;
                                        savedDialogsAdapter.attachedToRecyclerView = anonymousClass114;
                                        itemTouchHelper2.attachToRecyclerView(anonymousClass114);
                                    }
                                    recycledViewPool = savedDialogsAdapter.viewPool;
                                    i = 100;
                                    z2 = true;
                                } else if (i15 == 12) {
                                    if (adapter != null) {
                                        recycleAdapter(adapter);
                                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(null);
                                    }
                                    if (anonymousClass7.getParent() != mediaPageArr2[z ? 1 : 0]) {
                                        AndroidUtilities.removeFromParent(anonymousClass7);
                                        mediaPageArr2[z ? 1 : 0].addView(anonymousClass7, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    }
                                } else if (i15 == 13) {
                                    if (adapter != null) {
                                        recycleAdapter(adapter);
                                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(null);
                                    }
                                    if (view != null && view.getParent() != mediaPageArr2[z ? 1 : 0]) {
                                        AndroidUtilities.removeFromParent(view);
                                        mediaPageArr2[z ? 1 : 0].addView(view);
                                    }
                                } else if (i15 == 14) {
                                    if (adapter != null) {
                                        recycleAdapter(adapter);
                                        mediaPageArr2[z ? 1 : 0].listView.setAdapter(null);
                                    }
                                    if (anonymousClass13 != null && anonymousClass13.getParent() != mediaPageArr2[z ? 1 : 0]) {
                                        AndroidUtilities.removeFromParent(anonymousClass13);
                                        mediaPageArr2[z ? 1 : 0].addView(anonymousClass13);
                                        mediaPageArr2[z ? 1 : 0].emptyView.setVisibility(4);
                                    }
                                }
                            }
                            z3 = false;
                        } else if (adapter != this.chatUsersAdapter) {
                            recycleAdapter(adapter);
                            mediaPageArr2[z ? 1 : 0].listView.setAdapter(this.chatUsersAdapter);
                        }
                        z4 = false;
                        z6 = false;
                        z2 = z4;
                        z3 = z6;
                        recycledViewPool = recycledViewPool4;
                        i = 100;
                    }
                    z4 = true;
                    z6 = false;
                    z2 = z4;
                    z3 = z6;
                    recycledViewPool = recycledViewPool4;
                    i = 100;
                }
                z6 = z5;
                z4 = true;
                z2 = z4;
                z3 = z6;
                recycledViewPool = recycledViewPool4;
                i = 100;
            }
            int i16 = mediaPageArr2[z ? 1 : 0].selectedType;
            boolean z11 = i16 == 0 || isAnyStoryPageType(i16);
            int i17 = i;
            RecyclerView.RecycledViewPool recycledViewPool5 = recycledViewPool;
            mediaPageArr2[z ? 1 : 0].progressView.setLayoutParams(LayoutHelper.createFrame(-1, -1.0f, 119, z11 ? 0.0f : 12.0f, (z11 ? 8 : 12) + 48, z11 ? 0.0f : 12.0f, z11 ? 0.0f : 12.0f));
            if (z2) {
                mediaPageArr2[z ? 1 : 0].listView.setSections(false);
            } else {
                AnonymousClass19 anonymousClass115 = mediaPageArr2[z ? 1 : 0].listView;
                anonymousClass115.getClass();
                anonymousClass115.setSelectorDrawableColor(Theme.getColor(Theme.key_listSelector, anonymousClass115.resourcesProvider));
                anonymousClass115.isViewTypeSection = null;
                anonymousClass115.sectionRadius = 0.0f;
                anonymousClass115.sectionRadiusTop = null;
                anonymousClass115.sectionRadiusBottom = null;
                anonymousClass115.drawSectionBackground = null;
                RecyclerListView.ListSectionsDecoration listSectionsDecoration = anonymousClass115.sectionsItemDecoration;
                if (listSectionsDecoration != null) {
                    anonymousClass115.removeItemDecoration(listSectionsDecoration);
                    anonymousClass115.sectionsItemDecoration = null;
                }
            }
            MediaPage mediaPage7 = mediaPageArr2[z ? 1 : 0];
            int i18 = mediaPage7.selectedType;
            BaseFragment baseFragment = this.profileActivity;
            if (i18 == 15) {
                mediaPage7.setBackground(PreviewView.getBackgroundDrawable(mediaPage7.getBackground(), baseFragment.getCurrentAccount(), this.dialog_id, Theme.currentTheme.isDark()));
                mediaPageArr2[z ? 1 : 0].setOutlineProvider(new RichEditor.AnonymousClass5(12));
                mediaPageArr2[z ? 1 : 0].setClipToOutline(true);
            } else {
                mediaPage7.setClipToOutline(false);
                mediaPageArr2[z ? 1 : 0].setBackground(null);
            }
            MediaPage mediaPage8 = mediaPageArr2[z ? 1 : 0];
            if (mediaPage8.selectedType == 11) {
                mediaPage8.listView.setItemAnimator(mediaPage8.itemAnimator);
            } else {
                mediaPage8.listView.setItemAnimator(null);
                if (savedDialogsAdapter != null && mediaPageArr2[z ? 1 : 0].listView == savedDialogsAdapter.attachedToRecyclerView) {
                    ItemTouchHelper itemTouchHelper3 = savedDialogsAdapter.itemTouchHelper;
                    savedDialogsAdapter.attachedToRecyclerView = null;
                    itemTouchHelper3.attachToRecyclerView(null);
                }
            }
            if (anonymousClass7 != null && mediaPageArr2[z ? 1 : 0].selectedType != 12 && anonymousClass7.getParent() == mediaPageArr2[z ? 1 : 0]) {
                anonymousClass7.chatActivity.onRemoveFromParent();
                mediaPageArr2[z ? 1 : 0].removeView(anonymousClass7);
            }
            if (view != null && mediaPageArr2[z ? 1 : 0].selectedType != 13) {
                ViewParent parent = view.getParent();
                MediaPage mediaPage9 = mediaPageArr2[z ? 1 : 0];
                if (parent == mediaPage9) {
                    mediaPage9.removeView(view);
                }
            }
            if (anonymousClass13 != null && mediaPageArr2[z ? 1 : 0].selectedType != 14) {
                ViewParent parent2 = anonymousClass13.getParent();
                MediaPage mediaPage10 = mediaPageArr2[z ? 1 : 0];
                if (parent2 == mediaPage10) {
                    mediaPage10.removeView(anonymousClass13);
                }
            }
            int i19 = mediaPageArr2[z ? 1 : 0].selectedType;
            if (i19 != 0 && i19 != 11 && !isAnyStoryPageType(i19) && (i5 = mediaPageArr2[z ? 1 : 0].selectedType) != 2 && i5 != 5 && i5 != 6 && ((i5 != 7 || delegate.canSearchMembers()) && (i6 = mediaPageArr2[z ? 1 : 0].selectedType) != 10 && i6 != 13 && i6 != 14)) {
                if (!z) {
                    z8 = false;
                    if (actionBarMenuItem != null) {
                        if (actionBarMenuItem.getVisibility() == 4) {
                            if (canShowSearchItem()) {
                                this.searchItemState = 0;
                                this.searchAlpha = 1.0f;
                                actionBarMenuItem.setVisibility(0);
                            } else {
                                actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                                this.searchAlpha = 0.0f;
                            }
                        }
                    }
                } else if (actionBarMenuItem == null || actionBarMenuItem.getVisibility() != 4 || this.actionBar.isSearchFieldVisible) {
                    z8 = false;
                    this.searchItemState = 0;
                    this.searchAlpha = 1.0f;
                } else {
                    if (canShowSearchItem()) {
                        this.searchItemState = 1;
                        actionBarMenuItem.setVisibility(0);
                    } else {
                        actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                    }
                    float f = z ? 1.0f : 0.0f;
                    this.searchAlpha = getSearchAlpha(f);
                    updateSearchItemIcon(1.0f - f);
                    z8 = false;
                }
                updateOptionsSearch(z8);
            } else if (z) {
                this.searchItemState = 2;
            } else {
                this.searchItemState = 0;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility((isStoriesView() || this.searching) ? 8 : 4);
                }
            }
            int i20 = mediaPageArr2[z ? 1 : 0].selectedType;
            if (i20 == 6) {
                if (!commonGroupsAdapter.loading && !commonGroupsAdapter.endReached && commonGroupsAdapter.chats.isEmpty()) {
                    commonGroupsAdapter.getChats(0L);
                }
            } else if (i20 != 7) {
                if (isAnyStoryPageType(i20)) {
                    StoriesAdapter storiesAdapterStoryAlbums_getStoriesAdapterByTabType = storyAlbums_getStoriesAdapterByTabType(mediaPageArr2[z ? 1 : 0].selectedType);
                    if (storiesAdapterStoryAlbums_getStoriesAdapterByTabType != null) {
                        StoriesController.StoriesList storiesList = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                        if (storiesList != null) {
                            int iColumnsCount = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.columnsCount();
                            int iMin = Math.min(100, Math.max(1, iColumnsCount / 2) * iColumnsCount * iColumnsCount);
                            StoriesController.StoriesList storiesList2 = storiesAdapterStoryAlbums_getStoriesAdapterByTabType.storiesList;
                            storiesList2.getClass();
                            storiesList2.load(iMin, Collections.EMPTY_LIST, false);
                        }
                        mediaPageArr2[z ? 1 : 0].emptyView.showProgress(storiesList != null && (storiesList.isLoading() || (baseFragment.getConnectionsManager().getConnectionState() == 3 && storiesList.getCount() > 0)), z);
                        z3 = (storiesList == null || storiesList.getCount() <= 0 || isSearchingStories()) ? false : true;
                    }
                } else {
                    int i21 = mediaPageArr2[z ? 1 : 0].selectedType;
                    if (i21 != 10 && i21 != 11 && i21 != 12 && i21 != 13 && i21 != 14) {
                        if (i21 == 15) {
                            i21 = 8;
                        }
                        SharedMediaData sharedMediaData6 = sharedMediaDataArr[i21];
                        if (!sharedMediaData6.loading && !sharedMediaData6.endReached[0] && sharedMediaData6.messages.isEmpty()) {
                            sharedMediaDataArr[i21].loading = true;
                            adapter2.notifyDataSetChanged();
                            if (i21 != 0) {
                                i2 = i21;
                            } else {
                                int i22 = sharedMediaDataArr[0].filterType;
                                if (i22 == 1) {
                                    i2 = 6;
                                } else if (i22 == 2) {
                                    i2 = 7;
                                } else {
                                    i2 = i21;
                                }
                            }
                            baseFragment.getMediaDataController().loadMedia(this.dialog_id, 50, 0, 0, i2, this.topicId, 1, baseFragment.getClassGuid(), sharedMediaDataArr[i2].requestIndex, null, null);
                        }
                    }
                }
            }
            int i23 = mediaPageArr2[z ? 1 : 0].selectedType;
            if (i23 == 8 || isStoryAlbumPageType(i23)) {
                MediaPage mediaPage11 = mediaPageArr2[z ? 1 : 0];
                AnonymousClass29 anonymousClass29 = mediaPage11.emptyView;
                boolean zIsStoryAlbumPageType = isStoryAlbumPageType(mediaPage11.selectedType);
                int iStoryAlbums_getAlbumIdByTabType = storyAlbums_getAlbumIdByTabType(mediaPageArr2[z ? 1 : 0].selectedType);
                anonymousClass29.stickerView.setVisibility((zIsStoryAlbumPageType || isSelf() || isBot()) ? 8 : 0);
                ButtonWithCounterView buttonWithCounterView = anonymousClass29.button;
                if (zIsStoryAlbumPageType) {
                    buttonWithCounterView.setVisibility(0);
                    buttonWithCounterView.setText$1(LocaleController.getString(R.string.StoriesAlbumAddToAlbum));
                } else if (isSelf()) {
                    buttonWithCounterView.setVisibility(8);
                } else {
                    anonymousClass29.setStickerType(11);
                    buttonWithCounterView.setVisibility(!isSearchingStories() ? 0 : 8);
                    buttonWithCounterView.setText$1(addPostText());
                }
                if (zIsStoryAlbumPageType) {
                    anonymousClass29.title.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeTitle));
                    anonymousClass29.subtitle.setText(LocaleController.getString(R.string.StoriesAlbumOrganizeDescription));
                } else {
                    SpoilersTextView spoilersTextView = anonymousClass29.title;
                    if (isSearchingStories()) {
                        i3 = R.string.NoHashtagStoriesTitle;
                    } else {
                        i3 = isStoriesView() ? R.string.NoPublicStoriesTitle2 : R.string.NoStoriesTitle;
                    }
                    spoilersTextView.setText(LocaleController.getString(i3));
                    anonymousClass29.subtitle.setText(isStoriesView() ? LocaleController.getString(R.string.NoStoriesSubtitle2) : "");
                }
                buttonWithCounterView.setOnClickListener(new ProfileGiftsContainer$$ExternalSyntheticLambda5(this, zIsStoryAlbumPageType, iStoryAlbums_getAlbumIdByTabType, 1));
            } else {
                MediaPage mediaPage12 = mediaPageArr2[z ? 1 : 0];
                if (mediaPage12.selectedType == 9) {
                    if (isSelf()) {
                        mediaPageArr2[z ? 1 : 0].emptyView.stickerView.setVisibility(8);
                        mediaPageArr2[z ? 1 : 0].emptyView.button.setVisibility(8);
                    } else {
                        mediaPageArr2[z ? 1 : 0].emptyView.stickerView.setVisibility(0);
                        mediaPageArr2[z ? 1 : 0].emptyView.setStickerType(11);
                        mediaPageArr2[z ? 1 : 0].emptyView.button.setVisibility(0);
                        mediaPageArr2[z ? 1 : 0].emptyView.button.setText$1(addPostText());
                    }
                    mediaPageArr2[z ? 1 : 0].emptyView.title.setText(LocaleController.getString(R.string.NoArchivedStoriesTitle));
                    mediaPageArr2[z ? 1 : 0].emptyView.subtitle.setText(isStoriesView() ? LocaleController.getString(R.string.NoArchivedStoriesSubtitle) : "");
                    mediaPageArr2[z ? 1 : 0].emptyView.button.setOnClickListener(new SharedMediaLayout$$ExternalSyntheticLambda2(this, 0));
                } else {
                    mediaPage12.emptyView.stickerView.setVisibility(0);
                    mediaPageArr2[z ? 1 : 0].emptyView.setStickerType(1);
                    mediaPageArr2[z ? 1 : 0].emptyView.title.setText(LocaleController.getString(R.string.NoResult));
                    mediaPageArr2[z ? 1 : 0].emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
                    mediaPageArr2[z ? 1 : 0].emptyView.button.setVisibility(8);
                }
            }
            z7 = false;
            mediaPageArr2[z ? 1 : 0].listView.setVisibility(0);
            i4 = i17;
            recycledViewPool2 = recycledViewPool5;
        }
        MediaPage mediaPage13 = mediaPageArr2[z ? 1 : 0];
        mediaPage13.fastScrollEnabled = z3;
        updateFastScrollVisibility(mediaPage13, z7);
        mediaPageArr2[z ? 1 : 0].layoutManager.setSpanCount(i4);
        mediaPageArr2[z ? 1 : 0].listView.invalidateItemDecorations();
        if (recycledViewPool2 != null) {
            mediaPageArr2[z ? 1 : 0].listView.setRecycledViewPool(recycledViewPool2);
            mediaPageArr2[z ? 1 : 0].animationSupportingListView.setRecycledViewPool(recycledViewPool2);
        }
        if (this.searchItemState == 2) {
            ActionBar actionBar = this.actionBar;
            if (actionBar.isSearchFieldVisible) {
                this.ignoreSearchCollapse = true;
                actionBar.closeSearchField(true);
                this.searchItemState = 0;
                this.searchAlpha = 0.0f;
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(isStoriesView() ? 8 : 4);
                }
                updateOptionsSearch(false);
            }
        }
    }

    public final void updateAdapters() {
        AnonymousClass6 anonymousClass6 = this.photoVideoAdapter;
        if (anonymousClass6 != null) {
            anonymousClass6.notifyDataSetChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter = this.documentsAdapter;
        if (sharedDocumentsAdapter != null) {
            sharedDocumentsAdapter.mObservable.notifyChanged();
        }
        SharedDocumentsAdapter sharedDocumentsAdapter2 = this.voiceAdapter;
        if (sharedDocumentsAdapter2 != null) {
            sharedDocumentsAdapter2.mObservable.notifyChanged();
        }
        SharedLinksAdapter sharedLinksAdapter = this.linksAdapter;
        if (sharedLinksAdapter != null) {
            sharedLinksAdapter.update(false);
        }
        SharedDocumentsAdapter sharedDocumentsAdapter3 = this.audioAdapter;
        if (sharedDocumentsAdapter3 != null) {
            sharedDocumentsAdapter3.mObservable.notifyChanged();
        }
        PollAdapter pollAdapter = this.pollAdapter;
        if (pollAdapter != null) {
            pollAdapter.regroup();
            pollAdapter.mObservable.notifyChanged();
        }
        GifAdapter gifAdapter = this.gifAdapter;
        if (gifAdapter != null) {
            gifAdapter.mObservable.notifyChanged();
        }
        AnonymousClass9 anonymousClass9 = this.storiesAdapter;
        if (anonymousClass9 != null) {
            anonymousClass9.notifyDataSetChanged();
        }
        Iterator it = this.storyAlbumsById.values().iterator();
        while (it.hasNext()) {
            ((StoryAlbumData) it.next()).adapter.notifyDataSetChanged();
        }
    }

    public final void updateFastScrollVisibility(MediaPage mediaPage, boolean z) {
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
        objectAnimatorOfFloat2.addListener(new ChatActivity.AnonymousClass77(fastScroll));
        mediaPage.fastScrollAnimator = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.setDuration(150L).start();
        fastScroll.animate().setListener(null).cancel();
        fastScroll.setTag(null);
    }

    public final void updateForwardItem() {
        ActionBarMenuItem actionBarMenuItem = this.forwardItem;
        if (actionBarMenuItem == null) {
            return;
        }
        boolean z = this.profileActivity.getMessagesController().isPeerNoForwards(this.dialog_id) || hasNoforwardsMessage();
        actionBarMenuItem.setAlpha(z ? 0.5f : 1.0f);
        if (z && actionBarMenuItem.getBackground() != null) {
            actionBarMenuItem.setBackground(null);
        } else {
            if (z || actionBarMenuItem.getBackground() != null) {
                return;
            }
            actionBarMenuItem.setBackground(Theme.createSelectorDrawable(getThemedColor$13(Theme.key_actionBarActionModeDefaultSelector), 5, -1));
        }
    }

    public final void updateOptionsSearch(boolean z) {
        AnonymousClass13 anonymousClass13;
        AnonymousClass15 anonymousClass15;
        RLottieImageView rLottieImageView = this.optionsSearchImageView;
        if (rLottieImageView == null) {
            return;
        }
        float fClamp = 0.0f;
        if (!this.searching && (((anonymousClass13 = this.giftsContainer) == null || !anonymousClass13.isReordering()) && ((anonymousClass15 = this.storiesContainer) == null || !anonymousClass15.reorderingCollections))) {
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

    public final void updateRowsSelection(boolean z) {
        int i = 0;
        while (true) {
            MediaPage[] mediaPageArr = this.mediaPages;
            if (i >= mediaPageArr.length) {
                return;
            }
            int childCount = mediaPageArr[i].listView.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = mediaPageArr[i].listView.getChildAt(i2);
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

    public final void updateSearchItemIcon(float f) {
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
        actionBarMenuItem.setScaleX(f3);
        actionBarMenuItem.setScaleY(f3);
        actionBarMenuItem.setVisibility(f2 <= 0.01f ? 8 : 0);
    }

    public final void updateSearchItemIconAnimated() {
        ActionBarMenuItem actionBarMenuItem = this.searchItemIcon;
        if (actionBarMenuItem == null) {
            return;
        }
        MediaPage mediaPage = this.mediaPages[1];
        boolean z = mediaPage != null && mediaPage.selectedType == 11;
        if (z) {
            actionBarMenuItem.setVisibility(0);
        }
        actionBarMenuItem.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.85f).scaleY(z ? 1.0f : 0.85f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(22, this, z)).setDuration(420L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
    }

    public final void updateStoriesPinButton() {
        boolean z;
        StoriesController.StoriesList storiesList;
        boolean zIsBot = isBot();
        ActionBarMenuItem actionBarMenuItem = this.unpinItem;
        ActionBarMenuItem actionBarMenuItem2 = this.pinItem;
        if (zIsBot) {
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setVisibility(8);
            }
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() == 9) {
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setVisibility(8);
            }
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(8);
                return;
            }
            return;
        }
        if (getClosestTab() != 8) {
            if (isStoryAlbumPageType(getClosestTab())) {
                if (actionBarMenuItem2 != null) {
                    actionBarMenuItem2.setVisibility(8);
                }
                if (actionBarMenuItem != null) {
                    actionBarMenuItem.setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            SparseArray[] sparseArrayArr = this.selectedFiles;
            if (i >= sparseArrayArr[0].size()) {
                z = false;
                break;
            }
            MessageObject messageObject = (MessageObject) sparseArrayArr[0].valueAt(i);
            AnonymousClass9 anonymousClass9 = this.storiesAdapter;
            if (anonymousClass9 != null && (storiesList = anonymousClass9.storiesList) != null && !storiesList.isPinned(messageObject.getId())) {
                z = true;
                break;
            }
            i++;
        }
        if (actionBarMenuItem2 != null) {
            actionBarMenuItem2.setVisibility(z ? 0 : 8);
        }
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setVisibility(z ? 8 : 0);
        }
    }

    public void updateTabs(boolean z) {
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ProfileTab profileTab;
        boolean z2;
        int i;
        boolean zIsStoriesView;
        ChatUsersAdapter chatUsersAdapter;
        int[] iArr;
        boolean z3;
        boolean z4;
        boolean z5;
        int selectedTab;
        SparseArray sparseArrayRemoveTabs;
        ArrayList arrayList;
        TLRPC.UserFull userFull2;
        TLRPC.ChatFull chatFull2;
        boolean z6;
        boolean z7;
        long j;
        int i2;
        int[] iArr2;
        String str;
        int i3;
        int size;
        int i4;
        Pair pair;
        int tabId;
        int i5;
        boolean z8;
        int i6;
        Integer numValueOf;
        int i7;
        int i8;
        Boolean bool;
        String string;
        String str2;
        int i9;
        CharSequence string2;
        Pair pair2;
        CharSequence charSequence;
        StarsController.GiftsList giftsList;
        HashSet hashSet;
        ArrayList arrayList2;
        int i10;
        AnonymousClass13 anonymousClass13;
        SpannableStringBuilder spannableStringBuilder;
        int i11;
        char c;
        char c2;
        int i12;
        ArrayList arrayList3;
        TLRPC.Document document;
        StarsController.GiftsList giftsList2;
        int i13;
        Object obj;
        Object obj2;
        boolean z9;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17;
        boolean z11;
        int i18;
        int i19;
        int i20;
        boolean z12;
        int i21;
        boolean z13;
        int i22;
        int i23;
        boolean z14;
        int i24;
        int i25;
        boolean z15;
        int i26;
        int i27;
        boolean z16;
        int i28;
        boolean z17;
        int i29;
        int i30;
        boolean z18;
        int i31;
        int i32;
        boolean z19;
        TLRPC.UserFull userFull3;
        TLRPC.ChatFull chatFull3;
        TLRPC.UserFull userFull4;
        TL_bots.BotInfo botInfo;
        SharedMediaPreloader sharedMediaPreloader;
        AnonymousClass39 anonymousClass39 = this.scrollSlidingTextTabStrip;
        if (anonymousClass39 == null) {
            return;
        }
        boolean z20 = !this.delegate.isFragmentOpened() ? false : z;
        boolean z21 = (this.savedMessagesContainer == null || (sharedMediaPreloader = this.sharedMediaPreloader) == null || !sharedMediaPreloader.hasSavedMessages) ? false : true;
        BaseFragment baseFragment = this.profileActivity;
        long j2 = this.dialog_id;
        int i33 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        TLRPC.User user = (i33 <= 0 || baseFragment == null) ? null : baseFragment.getMessagesController().getUser(Long.valueOf(j2));
        boolean z22 = user != null && user.bot && user.bot_has_main_app && user.bot_can_edit;
        boolean z23 = (user == null || !user.bot || user.bot_can_edit || (userFull4 = this.userInfo) == null || (botInfo = userFull4.bot_info) == null || !botInfo.has_preview_medias || z22) ? false : true;
        boolean z24 = (DialogObject.isUserDialog(j2) || DialogObject.isChatDialog(j2)) && !DialogObject.isEncryptedDialog(j2) && (((userFull = this.userInfo) != null && userFull.stories_pinned_available) || (((chatFull = this.info) != null && chatFull.stories_pinned_available) || isStoriesView())) && includeStories();
        AnonymousClass13 anonymousClass14 = this.giftsContainer;
        boolean z25 = anonymousClass14 != null && (((userFull3 = this.userInfo) != null && userFull3.stargifts_count > 0) || ((chatFull3 = this.info) != null && chatFull3.stargifts_count > 0));
        TLRPC.ChatFull chatFull4 = this.info;
        if (chatFull4 != null) {
            profileTab = chatFull4.main_tab;
        } else {
            TLRPC.UserFull userFull5 = this.userInfo;
            profileTab = userFull5 != null ? userFull5.main_tab : null;
        }
        int i34 = this.wasReordering != anonymousClass39.reordering ? 1 : 0;
        TLRPC.ProfileTab profileTab2 = profileTab;
        if ((z24 || z23) != anonymousClass39.hasTab(8)) {
            i34++;
        }
        if (z22 != anonymousClass39.hasTab(13)) {
            i34++;
        }
        if (isSearchingStories() != anonymousClass39.hasTab(8)) {
            i34++;
        }
        if (z25 == anonymousClass39.hasTab(14)) {
            if (anonymousClass14 == null || !z25) {
                z2 = z25;
                i = 14;
            } else {
                z2 = z25;
                i = 14;
                if (this.giftsLastHash != anonymousClass14.getLastEmojisHash()) {
                }
            }
            zIsStoriesView = isStoriesView();
            chatUsersAdapter = this.chatUsersAdapter;
            iArr = this.hasMedia;
            if (zIsStoriesView) {
                z3 = z2;
                z4 = false;
                z5 = false;
            } else {
                if (chatUsersAdapter.chatInfo == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                i14 = i34;
                z3 = z2;
                if (z9 == anonymousClass39.hasTab(7)) {
                    i15 = i14 + 1;
                } else {
                    i15 = i14;
                }
                if (iArr[0] <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i16 = i15;
                if (z10 == anonymousClass39.hasTab(0)) {
                    i17 = i16 + 1;
                } else {
                    i17 = i16;
                }
                if (iArr[1] <= 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i18 = i17;
                if (z11 == anonymousClass39.hasTab(1)) {
                    i19 = i18 + 1;
                } else {
                    i19 = i18;
                }
                if (DialogObject.isEncryptedDialog(j2)) {
                    i20 = i19;
                    if (iArr[4] <= 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12 == anonymousClass39.hasTab(4)) {
                        i21 = i20 + 1;
                    } else {
                        i21 = i20;
                    }
                } else {
                    if (iArr[3] <= 0) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    i29 = i19;
                    if (z17 == anonymousClass39.hasTab(3)) {
                        i30 = i29 + 1;
                    } else {
                        i30 = i29;
                    }
                    if (iArr[4] <= 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    i31 = i30;
                    if (z18 == anonymousClass39.hasTab(4)) {
                        i32 = i31 + 1;
                    } else {
                        i32 = i31;
                    }
                    if (iArr[8] <= 0) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    i20 = i32;
                    if (z19 == anonymousClass39.hasTab(15)) {
                        i21 = i20 + 1;
                    } else {
                        i21 = i20;
                    }
                }
                if (iArr[2] <= 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                i22 = i21;
                if (z13 == anonymousClass39.hasTab(2)) {
                    i23 = i22 + 1;
                } else {
                    i23 = i22;
                }
                if (iArr[5] <= 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                i24 = i23;
                if (z14 == anonymousClass39.hasTab(5)) {
                    i25 = i24 + 1;
                } else {
                    i25 = i24;
                }
                if (iArr[6] <= 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                i26 = i25;
                if (z15 == anonymousClass39.hasTab(6)) {
                    i27 = i26 + 1;
                } else {
                    i27 = i26;
                }
                z16 = !this.channelRecommendationsAdapter.chats.isEmpty();
                i28 = i27;
                if (z16 != anonymousClass39.hasTab(10)) {
                    i34 = i28 + 1;
                } else {
                    i34 = i28;
                }
                if (includeSavedDialogs() || baseFragment.getMessagesController().getSavedMessagesController().unsupported || !baseFragment.getMessagesController().getSavedMessagesController().hasDialogs()) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                z5 = z16;
                if (z4 != anonymousClass39.hasTab(11)) {
                    i34++;
                }
                if (z21 != anonymousClass39.hasTab(12)) {
                    i34++;
                }
            }
            if (i34 > 0) {
                if (z20) {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.setOrdering(0);
                    transitionSet.addTransition(new VoIPFragment.AnonymousClass23(4));
                    transitionSet.setDuration(200L);
                    TransitionManager.beginDelayedTransition(anonymousClass39.getTabsContainer(), transitionSet);
                    anonymousClass39.animateFromIndicaxtorX = anonymousClass39.indicatorX;
                    anonymousClass39.animateFromIndicatorWidth = anonymousClass39.indicatorWidth;
                }
                sparseArrayRemoveTabs = anonymousClass39.removeTabs();
                if (i34 > 3) {
                    sparseArrayRemoveTabs = null;
                }
                arrayList = new ArrayList();
                if (isSearchingStories()) {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    anonymousClass39.animationDuration = 420L;
                }
                if (z23) {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                } else if ((DialogObject.isUserDialog(j2) || DialogObject.isChatDialog(j2)) && !DialogObject.isEncryptedDialog(j2) && ((((userFull2 = this.userInfo) != null && userFull2.stories_pinned_available) || (((chatFull2 = this.info) != null && chatFull2.stories_pinned_available) || isStoriesView())) && includeStories())) {
                    if (isArchivedOnlyStoriesView()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        anonymousClass39.animationDuration = 420L;
                    } else {
                        arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                        if (isStoriesView()) {
                            arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                        }
                    }
                }
                if (z3) {
                    Integer numValueOf2 = Integer.valueOf(i);
                    string2 = LocaleController.getString(R.string.ProfileGifts);
                    if (anonymousClass14.list == null) {
                        charSequence = string2;
                        z6 = z21;
                        z7 = z22;
                        anonymousClass13 = anonymousClass14;
                        j = j2;
                    } else {
                        charSequence = string2;
                        j = j2;
                        pair2 = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(anonymousClass14.dialogId));
                        giftsList = anonymousClass14.list;
                        if (!giftsList.gifts.isEmpty()) {
                            hashSet = new HashSet();
                            arrayList2 = new ArrayList();
                            z6 = z21;
                            z7 = z22;
                            i10 = 0;
                            while (true) {
                                anonymousClass13 = anonymousClass14;
                                if (arrayList2.size() < 3) {
                                    break;
                                }
                                arrayList3 = giftsList.gifts;
                                if (i10 < arrayList3.size()) {
                                    break;
                                }
                                document = ((TL_stars.SavedStarGift) arrayList3.get(i10)).gift.getDocument();
                                if (document == null) {
                                    giftsList2 = giftsList;
                                    i13 = i10;
                                } else {
                                    giftsList2 = giftsList;
                                    i13 = i10;
                                    if (!hashSet.contains(Long.valueOf(document.id))) {
                                        hashSet.add(Long.valueOf(document.id));
                                        arrayList2.add(document);
                                    }
                                }
                                i10 = i13 + 1;
                                giftsList = giftsList2;
                                anonymousClass14 = anonymousClass13;
                            }
                            if (arrayList2.isEmpty()) {
                                spannableStringBuilder = new SpannableStringBuilder(" ");
                                i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    TLRPC.Document document2 = (TLRPC.Document) arrayList2.get(i11);
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(MessageObject.getEmoji(document2));
                                    AnimatedEmojiSpan animatedEmojiSpan = new AnimatedEmojiSpan(document2.id, 0.9f, null);
                                    animatedEmojiSpan.document = document2;
                                    spannableStringBuilder2.setSpan(animatedEmojiSpan, 0, spannableStringBuilder2.length(), 33);
                                    spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                                    i11++;
                                    i33 = i33;
                                    arrayList2 = arrayList2;
                                    iArr = iArr;
                                }
                                i2 = i33;
                                iArr2 = iArr;
                                c = 0;
                                str = null;
                                c2 = 1;
                                ProfileGiftsContainer.cachedLastEmojis.put(pair2, spannableStringBuilder);
                                i12 = 2;
                                obj2 = spannableStringBuilder;
                            }
                        } else if (giftsList.loading || (obj = (CharSequence) ProfileGiftsContainer.cachedLastEmojis.get(pair2)) == null) {
                            z6 = z21;
                            z7 = z22;
                            anonymousClass13 = anonymousClass14;
                        } else {
                            z6 = z21;
                            z7 = z22;
                            anonymousClass13 = anonymousClass14;
                            i2 = i33;
                            iArr2 = iArr;
                            i12 = 2;
                            c = 0;
                            str = null;
                            c2 = 1;
                            obj2 = obj;
                        }
                        CharSequence[] charSequenceArr = new CharSequence[i12];
                        charSequenceArr[c] = charSequence;
                        charSequenceArr[c2] = obj2;
                        arrayList.add(new Pair(numValueOf2, TextUtils.concat(charSequenceArr)));
                        this.giftsLastHash = anonymousClass13.getLastEmojisHash();
                    }
                    iArr2 = iArr;
                    obj2 = "";
                    i12 = 2;
                    c = 0;
                    str = null;
                    c2 = 1;
                    i2 = i33;
                    CharSequence[] charSequenceArr2 = new CharSequence[i12];
                    charSequenceArr2[c] = charSequence;
                    charSequenceArr2[c2] = obj2;
                    arrayList.add(new Pair(numValueOf2, TextUtils.concat(charSequenceArr2)));
                    this.giftsLastHash = anonymousClass13.getLastEmojisHash();
                } else {
                    z6 = z21;
                    z7 = z22;
                    j = j2;
                    i2 = i33;
                    iArr2 = iArr;
                    str = null;
                }
                if (z7) {
                    arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
                }
                if (!isStoriesView()) {
                    if (z4) {
                        arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                    }
                    if (chatUsersAdapter.chatInfo != null) {
                        arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                    }
                    if (iArr2[0] > 0) {
                        if (iArr2[1] != 0 && iArr2[2] == 0 && iArr2[3] == 0 && iArr2[4] == 0 && iArr2[5] == 0 && iArr2[6] == 0 && chatUsersAdapter.chatInfo == null) {
                            arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTabFull2)));
                        } else {
                            arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                        }
                    }
                    if (z6) {
                        arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                        MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                    }
                    if (iArr2[1] > 0) {
                        arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                    }
                    if (!DialogObject.isEncryptedDialog(j)) {
                        if (iArr2[3] > 0) {
                            arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                        }
                        if (iArr2[4] > 0) {
                            arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                        }
                        if (iArr2[8] > 0) {
                            arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                        }
                    } else if (iArr2[4] > 0) {
                        arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (iArr2[2] > 0) {
                        arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                    }
                    if (iArr2[5] > 0) {
                        arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                    }
                    if (iArr2[6] > 0) {
                        arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                    }
                    if (z5) {
                        if (i2 > 0) {
                            i9 = R.string.SimilarBotsTab;
                        } else {
                            i9 = R.string.SimilarChannelsTab;
                        }
                        arrayList.add(new Pair(10, LocaleController.getString(i9)));
                    }
                }
                if (anonymousClass39.reordering) {
                    z8 = this.info instanceof TLRPC.TL_channelFull;
                    for (i6 = 0; i6 < 15; i6++) {
                        if (getTab(i6, z8) != null) {
                            numValueOf = Integer.valueOf(i6);
                            i7 = 0;
                            while (true) {
                                if (i7 < arrayList.size()) {
                                    i8 = 1;
                                    bool = Boolean.FALSE;
                                    break;
                                } else {
                                    if (((Pair) arrayList.get(i7)).first == numValueOf) {
                                        bool = Boolean.TRUE;
                                        i8 = 1;
                                        break;
                                    }
                                    i7++;
                                }
                            }
                            if (!bool.booleanValue()) {
                                Integer numValueOf3 = Integer.valueOf(i6);
                                if (i6 != 8) {
                                    string = LocaleController.getString(R.string.ProfileStories);
                                } else if (i6 != 14) {
                                    string = LocaleController.getString(R.string.ProfileGifts);
                                } else if (i6 != 0) {
                                    string = LocaleController.getString(R.string.SharedMediaTabFull2);
                                } else if (i6 != i8) {
                                    string = LocaleController.getString(R.string.SharedFilesTab2);
                                } else if (i6 != 2) {
                                    string = LocaleController.getString(R.string.SharedVoiceTab2);
                                } else if (i6 != 3) {
                                    string = LocaleController.getString(R.string.SharedLinksTab2);
                                } else if (i6 != 4) {
                                    if (i6 != 5) {
                                        str2 = str;
                                    } else {
                                        string = LocaleController.getString(R.string.SharedGIFsTab2);
                                    }
                                    arrayList.add(new Pair(numValueOf3, str2));
                                } else {
                                    string = LocaleController.getString(R.string.SharedMusicTab2);
                                }
                                str2 = string;
                                arrayList.add(new Pair(numValueOf3, str2));
                            }
                        }
                    }
                }
                if (profileTab2 != null) {
                    tabId = getTabId(profileTab2);
                    i5 = 0;
                    while (true) {
                        if (i5 < arrayList.size()) {
                            i5 = -1;
                            break;
                        } else if (((Integer) ((Pair) arrayList.get(i5)).first).intValue() == tabId) {
                            break;
                        } else {
                            i5++;
                        }
                    }
                    if (i5 >= 0) {
                        Pair pair3 = (Pair) arrayList.remove(i5);
                        i3 = 0;
                        arrayList.add(0, pair3);
                    } else {
                        i3 = 0;
                    }
                } else {
                    i3 = 0;
                }
                if (!arrayList.isEmpty()) {
                    this.firstTab = ((Integer) ((Pair) arrayList.get(i3)).first).intValue();
                }
                size = arrayList.size();
                i4 = 0;
                while (i4 < size) {
                    Object obj3 = arrayList.get(i4);
                    i4++;
                    pair = (Pair) obj3;
                    if (!anonymousClass39.hasTab(((Integer) pair.first).intValue())) {
                        anonymousClass39.addTextTab(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayRemoveTabs);
                    }
                }
            }
            selectedTab = getSelectedTab();
            if (selectedTab >= 0) {
                this.mediaPages[0].selectedType = selectedTab;
            }
            this.wasReordering = anonymousClass39.reordering;
            anonymousClass39.finishAddingTabs();
            onSelectedTabChanged();
            checkStoriesTabsPosition();
        }
        z2 = z25;
        i = 14;
        i34++;
        zIsStoriesView = isStoriesView();
        chatUsersAdapter = this.chatUsersAdapter;
        iArr = this.hasMedia;
        if (zIsStoriesView) {
            if (chatUsersAdapter.chatInfo == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            i14 = i34;
            z3 = z2;
            if (z9 == anonymousClass39.hasTab(7)) {
                i15 = i14 + 1;
            } else {
                i15 = i14;
            }
            if (iArr[0] <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            i16 = i15;
            if (z10 == anonymousClass39.hasTab(0)) {
                i17 = i16 + 1;
            } else {
                i17 = i16;
            }
            if (iArr[1] <= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i18 = i17;
            if (z11 == anonymousClass39.hasTab(1)) {
                i19 = i18 + 1;
            } else {
                i19 = i18;
            }
            if (DialogObject.isEncryptedDialog(j2)) {
                if (iArr[3] <= 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                i29 = i19;
                if (z17 == anonymousClass39.hasTab(3)) {
                    i30 = i29 + 1;
                } else {
                    i30 = i29;
                }
                if (iArr[4] <= 0) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                i31 = i30;
                if (z18 == anonymousClass39.hasTab(4)) {
                    i32 = i31 + 1;
                } else {
                    i32 = i31;
                }
                if (iArr[8] <= 0) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                i20 = i32;
                if (z19 == anonymousClass39.hasTab(15)) {
                    i21 = i20 + 1;
                } else {
                    i21 = i20;
                }
            } else {
                i20 = i19;
                if (iArr[4] <= 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12 == anonymousClass39.hasTab(4)) {
                    i21 = i20 + 1;
                } else {
                    i21 = i20;
                }
            }
            if (iArr[2] <= 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            i22 = i21;
            if (z13 == anonymousClass39.hasTab(2)) {
                i23 = i22 + 1;
            } else {
                i23 = i22;
            }
            if (iArr[5] <= 0) {
                z14 = true;
            } else {
                z14 = false;
            }
            i24 = i23;
            if (z14 == anonymousClass39.hasTab(5)) {
                i25 = i24 + 1;
            } else {
                i25 = i24;
            }
            if (iArr[6] <= 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            i26 = i25;
            if (z15 == anonymousClass39.hasTab(6)) {
                i27 = i26 + 1;
            } else {
                i27 = i26;
            }
            z16 = !this.channelRecommendationsAdapter.chats.isEmpty();
            i28 = i27;
            if (z16 != anonymousClass39.hasTab(10)) {
                i34 = i28 + 1;
            } else {
                i34 = i28;
            }
            if (includeSavedDialogs()) {
                z4 = false;
            } else {
                z4 = false;
            }
            z5 = z16;
            if (z4 != anonymousClass39.hasTab(11)) {
                i34++;
            }
            if (z21 != anonymousClass39.hasTab(12)) {
                i34++;
            }
        } else {
            z3 = z2;
            z4 = false;
            z5 = false;
        }
        if (i34 > 0) {
            if (z20) {
                TransitionSet transitionSet2 = new TransitionSet();
                transitionSet2.setOrdering(0);
                transitionSet2.addTransition(new VoIPFragment.AnonymousClass23(4));
                transitionSet2.setDuration(200L);
                TransitionManager.beginDelayedTransition(anonymousClass39.getTabsContainer(), transitionSet2);
                anonymousClass39.animateFromIndicaxtorX = anonymousClass39.indicatorX;
                anonymousClass39.animateFromIndicatorWidth = anonymousClass39.indicatorWidth;
            }
            sparseArrayRemoveTabs = anonymousClass39.removeTabs();
            if (i34 > 3) {
                sparseArrayRemoveTabs = null;
            }
            arrayList = new ArrayList();
            if (isSearchingStories()) {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                anonymousClass39.animationDuration = 420L;
            }
            if (z23) {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileBotPreviewTab)));
            } else if (DialogObject.isUserDialog(j2)) {
                if (isArchivedOnlyStoriesView()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    anonymousClass39.animationDuration = 420L;
                } else {
                    arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                    if (isStoriesView()) {
                        arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                    }
                }
            } else if (isArchivedOnlyStoriesView()) {
                arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                anonymousClass39.animationDuration = 420L;
            } else {
                arrayList.add(new Pair(8, LocaleController.getString(R.string.ProfileStories)));
                if (isStoriesView()) {
                    arrayList.add(new Pair(9, LocaleController.getString(R.string.ProfileArchivedStories)));
                }
            }
            if (z3) {
                Integer numValueOf4 = Integer.valueOf(i);
                string2 = LocaleController.getString(R.string.ProfileGifts);
                if (anonymousClass14.list == null) {
                    charSequence = string2;
                    z6 = z21;
                    z7 = z22;
                    anonymousClass13 = anonymousClass14;
                    j = j2;
                } else {
                    charSequence = string2;
                    j = j2;
                    pair2 = new Pair(Integer.valueOf(UserConfig.selectedAccount), Long.valueOf(anonymousClass14.dialogId));
                    giftsList = anonymousClass14.list;
                    if (!giftsList.gifts.isEmpty()) {
                        if (giftsList.loading) {
                        }
                        z6 = z21;
                        z7 = z22;
                        anonymousClass13 = anonymousClass14;
                    } else {
                        hashSet = new HashSet();
                        arrayList2 = new ArrayList();
                        z6 = z21;
                        z7 = z22;
                        i10 = 0;
                        while (true) {
                            anonymousClass13 = anonymousClass14;
                            if (arrayList2.size() < 3) {
                                break;
                                break;
                            }
                            arrayList3 = giftsList.gifts;
                            if (i10 < arrayList3.size()) {
                                break;
                                break;
                            }
                            document = ((TL_stars.SavedStarGift) arrayList3.get(i10)).gift.getDocument();
                            if (document == null) {
                                giftsList2 = giftsList;
                                i13 = i10;
                            } else {
                                giftsList2 = giftsList;
                                i13 = i10;
                                if (!hashSet.contains(Long.valueOf(document.id))) {
                                    hashSet.add(Long.valueOf(document.id));
                                    arrayList2.add(document);
                                }
                            }
                            i10 = i13 + 1;
                            giftsList = giftsList2;
                            anonymousClass14 = anonymousClass13;
                        }
                        if (arrayList2.isEmpty()) {
                            spannableStringBuilder = new SpannableStringBuilder(" ");
                            i11 = 0;
                            while (i11 < arrayList2.size()) {
                                TLRPC.Document document3 = (TLRPC.Document) arrayList2.get(i11);
                                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(MessageObject.getEmoji(document3));
                                AnimatedEmojiSpan animatedEmojiSpan2 = new AnimatedEmojiSpan(document3.id, 0.9f, null);
                                animatedEmojiSpan2.document = document3;
                                spannableStringBuilder3.setSpan(animatedEmojiSpan2, 0, spannableStringBuilder3.length(), 33);
                                spannableStringBuilder.append((CharSequence) spannableStringBuilder3);
                                i11++;
                                i33 = i33;
                                arrayList2 = arrayList2;
                                iArr = iArr;
                            }
                            i2 = i33;
                            iArr2 = iArr;
                            c = 0;
                            str = null;
                            c2 = 1;
                            ProfileGiftsContainer.cachedLastEmojis.put(pair2, spannableStringBuilder);
                            i12 = 2;
                            obj2 = spannableStringBuilder;
                        }
                    }
                    CharSequence[] charSequenceArr3 = new CharSequence[i12];
                    charSequenceArr3[c] = charSequence;
                    charSequenceArr3[c2] = obj2;
                    arrayList.add(new Pair(numValueOf4, TextUtils.concat(charSequenceArr3)));
                    this.giftsLastHash = anonymousClass13.getLastEmojisHash();
                }
                iArr2 = iArr;
                obj2 = "";
                i12 = 2;
                c = 0;
                str = null;
                c2 = 1;
                i2 = i33;
                CharSequence[] charSequenceArr4 = new CharSequence[i12];
                charSequenceArr4[c] = charSequence;
                charSequenceArr4[c2] = obj2;
                arrayList.add(new Pair(numValueOf4, TextUtils.concat(charSequenceArr4)));
                this.giftsLastHash = anonymousClass13.getLastEmojisHash();
            } else {
                z6 = z21;
                z7 = z22;
                j = j2;
                i2 = i33;
                iArr2 = iArr;
                str = null;
            }
            if (z7) {
                arrayList.add(new Pair(13, LocaleController.getString(R.string.ProfileBotPreviewTab)));
            }
            if (!isStoriesView()) {
                if (z4) {
                    arrayList.add(new Pair(11, LocaleController.getString(R.string.SavedDialogsTab)));
                }
                if (chatUsersAdapter.chatInfo != null) {
                    arrayList.add(new Pair(7, LocaleController.getString(R.string.GroupMembers)));
                }
                if (iArr2[0] > 0) {
                    if (iArr2[1] != 0) {
                        arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                    } else {
                        arrayList.add(new Pair(0, LocaleController.getString(R.string.SharedMediaTab2)));
                    }
                }
                if (z6) {
                    arrayList.add(new Pair(12, LocaleController.getString(R.string.SavedMessagesTab2)));
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", 3).apply();
                }
                if (iArr2[1] > 0) {
                    arrayList.add(new Pair(1, LocaleController.getString(R.string.SharedFilesTab2)));
                }
                if (!DialogObject.isEncryptedDialog(j)) {
                    if (iArr2[3] > 0) {
                        arrayList.add(new Pair(3, LocaleController.getString(R.string.SharedLinksTab2)));
                    }
                    if (iArr2[4] > 0) {
                        arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                    }
                    if (iArr2[8] > 0) {
                        arrayList.add(new Pair(15, LocaleController.getString(R.string.SharedPollTab)));
                    }
                } else if (iArr2[4] > 0) {
                    arrayList.add(new Pair(4, LocaleController.getString(R.string.SharedMusicTab2)));
                }
                if (iArr2[2] > 0) {
                    arrayList.add(new Pair(2, LocaleController.getString(R.string.SharedVoiceTab2)));
                }
                if (iArr2[5] > 0) {
                    arrayList.add(new Pair(5, LocaleController.getString(R.string.SharedGIFsTab2)));
                }
                if (iArr2[6] > 0) {
                    arrayList.add(new Pair(6, LocaleController.getString(R.string.SharedGroupsTab2)));
                }
                if (z5) {
                    if (i2 > 0) {
                        i9 = R.string.SimilarBotsTab;
                    } else {
                        i9 = R.string.SimilarChannelsTab;
                    }
                    arrayList.add(new Pair(10, LocaleController.getString(i9)));
                }
            }
            if (anonymousClass39.reordering) {
                z8 = this.info instanceof TLRPC.TL_channelFull;
                while (i6 < 15) {
                    if (getTab(i6, z8) != null) {
                        numValueOf = Integer.valueOf(i6);
                        i7 = 0;
                        while (true) {
                            if (i7 < arrayList.size()) {
                                i8 = 1;
                                bool = Boolean.FALSE;
                                break;
                            } else {
                                if (((Pair) arrayList.get(i7)).first == numValueOf) {
                                    bool = Boolean.TRUE;
                                    i8 = 1;
                                    break;
                                }
                                i7++;
                            }
                        }
                        if (!bool.booleanValue()) {
                            Integer numValueOf5 = Integer.valueOf(i6);
                            if (i6 != 8) {
                                string = LocaleController.getString(R.string.ProfileStories);
                            } else if (i6 != 14) {
                                string = LocaleController.getString(R.string.ProfileGifts);
                            } else if (i6 != 0) {
                                string = LocaleController.getString(R.string.SharedMediaTabFull2);
                            } else if (i6 != i8) {
                                string = LocaleController.getString(R.string.SharedFilesTab2);
                            } else if (i6 != 2) {
                                string = LocaleController.getString(R.string.SharedVoiceTab2);
                            } else if (i6 != 3) {
                                string = LocaleController.getString(R.string.SharedLinksTab2);
                            } else if (i6 != 4) {
                                if (i6 != 5) {
                                    str2 = str;
                                } else {
                                    string = LocaleController.getString(R.string.SharedGIFsTab2);
                                }
                                arrayList.add(new Pair(numValueOf5, str2));
                            } else {
                                string = LocaleController.getString(R.string.SharedMusicTab2);
                            }
                            str2 = string;
                            arrayList.add(new Pair(numValueOf5, str2));
                        }
                    }
                }
            }
            if (profileTab2 != null) {
                tabId = getTabId(profileTab2);
                i5 = 0;
                while (true) {
                    if (i5 < arrayList.size()) {
                        i5 = -1;
                        break;
                    } else {
                        if (((Integer) ((Pair) arrayList.get(i5)).first).intValue() == tabId) {
                            break;
                            break;
                        }
                        i5++;
                    }
                }
                if (i5 >= 0) {
                    Pair pair4 = (Pair) arrayList.remove(i5);
                    i3 = 0;
                    arrayList.add(0, pair4);
                } else {
                    i3 = 0;
                }
            } else {
                i3 = 0;
            }
            if (!arrayList.isEmpty()) {
                this.firstTab = ((Integer) ((Pair) arrayList.get(i3)).first).intValue();
            }
            size = arrayList.size();
            i4 = 0;
            while (i4 < size) {
                Object obj4 = arrayList.get(i4);
                i4++;
                pair = (Pair) obj4;
                if (!anonymousClass39.hasTab(((Integer) pair.first).intValue())) {
                    anonymousClass39.addTextTab(((Integer) pair.first).intValue(), (CharSequence) pair.second, sparseArrayRemoveTabs);
                }
            }
        }
        selectedTab = getSelectedTab();
        if (selectedTab >= 0) {
            this.mediaPages[0].selectedType = selectedTab;
        }
        this.wasReordering = anonymousClass39.reordering;
        anonymousClass39.finishAddingTabs();
        onSelectedTabChanged();
        checkStoriesTabsPosition();
    }

    public final Boolean zoomIn(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[0];
        if (mediaPage == null) {
            return null;
        }
        int i = mediaPage.selectedType;
        this.changeColumnsTab = i;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i);
        int[] iArr = this.mediaColumnsCount;
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, iArr[zIsAnyStoryPageType ? 1 : 0], true);
        if (view != null && nextMediaColumnsCount == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true)) {
            view.setEnabled(false);
            view.animate().alpha(0.5f).start();
        }
        if (iArr[zIsAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view2 != null && !view2.isEnabled()) {
                view2.setEnabled(true);
                view2.animate().alpha(1.0f).start();
            }
            if (!zIsAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(mediaPageArr[0].selectedType) >= 5 || isStoryAlbumPageType(mediaPageArr[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, true));
    }

    public final Boolean zoomOut(View view, View view2) {
        if (this.photoVideoChangeColumnsAnimation) {
            return null;
        }
        MediaPage[] mediaPageArr = this.mediaPages;
        MediaPage mediaPage = mediaPageArr[0];
        if (mediaPage == null) {
            return null;
        }
        if (this.allowStoriesSingleColumn && isAnyStoryPageType(mediaPage.selectedType)) {
            return null;
        }
        int i = mediaPageArr[0].selectedType;
        this.changeColumnsTab = i;
        boolean zIsAnyStoryPageType = isAnyStoryPageType(i);
        int[] iArr = this.mediaColumnsCount;
        int nextMediaColumnsCount = getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, iArr[zIsAnyStoryPageType ? 1 : 0], false);
        if (view2 != null && nextMediaColumnsCount == getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false)) {
            view2.setEnabled(false);
            view2.animate().alpha(0.5f).start();
        }
        if (iArr[zIsAnyStoryPageType ? 1 : 0] != nextMediaColumnsCount) {
            if (view != null && !view.isEnabled()) {
                view.setEnabled(true);
                view.animate().alpha(1.0f).start();
            }
            if (!zIsAnyStoryPageType) {
                SharedConfig.setMediaColumnsCount(nextMediaColumnsCount);
            } else if (getStoriesCount(mediaPageArr[0].selectedType) >= 5 || isStoryAlbumPageType(mediaPageArr[0].selectedType)) {
                SharedConfig.setStoriesColumnsCount(nextMediaColumnsCount);
            }
            animateToMediaColumnsCount(nextMediaColumnsCount);
        }
        return Boolean.valueOf(nextMediaColumnsCount != getNextMediaColumnsCount(zIsAnyStoryPageType ? 1 : 0, nextMediaColumnsCount, false));
    }
}
