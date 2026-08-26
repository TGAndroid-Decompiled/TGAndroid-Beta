package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.internal.mlkit_vision_common.zzkw;
import com.google.android.gms.wearable.zzy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserNameResolver$$ExternalSyntheticOutline0;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ManageChatTextCell;
import org.telegram.ui.Cells.ManageChatUserCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextCheckCell2;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.ChatUsersActivity;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GigagroupConvertAlert;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SlideChooseView;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class ChatUsersActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public int addNew2Row;
    public int addNewRow;
    public int addNewSectionRow;
    public int addUsersRow;
    public int antiSpamInfoRow;
    public int antiSpamRow;
    public boolean antiSpamToggleLoading;
    public int blockedEmptyRow;
    public int botEndRow;
    public int botHeaderRow;
    public int botStartRow;
    public final ArrayList bots;
    public boolean botsEndReached;
    public final LongSparseArray botsMap;
    public int changeInfoRow;
    public long chatId;
    public final ArrayList contacts;
    public boolean contactsEndReached;
    public int contactsEndRow;
    public int contactsHeaderRow;
    public final LongSparseArray contactsMap;
    public int contactsStartRow;
    public TLRPC.Chat currentChat;
    public TLRPC.TL_chatBannedRights defaultBannedRights;
    public int delayResults;
    public ChatUsersActivityDelegate delegate;
    public ActionBarMenuItem doneItem;
    public int dontRestrictBoostersInfoRow;
    public int dontRestrictBoostersRow;
    public int dontRestrictBoostersSliderRow;
    public int editTagRow;
    public int embedLinksRow;
    public StickerEmptyView emptyView;
    public boolean enablePrice;
    public boolean firstLoaded;
    public FlickerLoadingView flickerLoadingView;
    public int gigaConvertRow;
    public int gigaHeaderRow;
    public int gigaInfoRow;
    public int hideMembersInfoRow;
    public int hideMembersRow;
    public boolean hideMembersToggleLoading;
    public TLRPC.ChatFull info;
    public final String initialBannedRights;
    public boolean initialEnablePrice;
    public final boolean initialProfiles;
    public final boolean initialSignatures;
    public int initialSlowmode;
    public long initialStarsPrice;
    public final boolean isChannel;
    public final boolean isCommunity;
    public boolean isEnabledNotRestrictBoosters;
    public final boolean isForum;
    public StickersActivity.AnonymousClass2 layoutManager;
    public ChatActivity.AnonymousClass34 listView;
    public ListAdapter listViewAdapter;
    public int loadingHeaderRow;
    public int loadingProgressRow;
    public int loadingUserCellRow;
    public boolean loadingUsers;
    public int manageLinkedPeersRow;
    public int manageTopicsRow;
    public int membersHeaderRow;
    public final boolean needOpenSearch;
    public int notRestrictBoosters;
    public boolean openTransitionStarted;
    public final ArrayList participants;
    public int participantsDivider2Row;
    public int participantsDividerRow;
    public int participantsEndRow;
    public int participantsInfoRow;
    public final LongSparseArray participantsMap;
    public int participantsStartRow;
    public int payInfoRow;
    public int payRow;
    public int permissionsSectionRow;
    public int pinMessagesRow;
    public int priceHeaderRow;
    public int priceInfoRow;
    public int priceRow;
    public boolean profiles;
    public RadialProgressView progressBar;
    public int recentActionsRow;
    public int removedUsersRow;
    public int restricted1SectionRow;
    public int rowCount;
    public ActionBarMenuItem searchItem;
    public SearchAdapter searchListViewAdapter;
    public boolean searching;
    public final int selectType;
    public int selectedSlowmode;
    public int sendMediaEmbededLinksRow;
    public boolean sendMediaExpanded;
    public int sendMediaFilesRow;
    public int sendMediaMusicRow;
    public int sendMediaPhotosRow;
    public int sendMediaRow;
    public int sendMediaStickerGifsRow;
    public int sendMediaVideoMessagesRow;
    public int sendMediaVideosRow;
    public int sendMediaVoiceMessagesRow;
    public int sendMessagesRow;
    public int sendPollsRow;
    public int sendReactionsRow;
    public int sendStickersRow;
    public int signMessagesInfoRow;
    public int signMessagesProfilesRow;
    public int signMessagesRow;
    public boolean signatures;
    public int slowmodeInfoRow;
    public int slowmodeRow;
    public int slowmodeSelectRow;
    public long starsPrice;
    public int tagsInfoRow;
    public int tagsRow;
    public final boolean transfer;
    public final int type;
    public UndoView undoView;

    public final class AnonymousClass12 implements ViewTreeObserver.OnPreDrawListener {
        public final int $r8$classId;
        public final Object this$0;
        public final int val$finalFrom;
        public final FlickerLoadingView val$finalProgressView;

        public AnonymousClass12(Object obj, FlickerLoadingView flickerLoadingView, int i, int i2) {
            this.$r8$classId = i2;
            this.this$0 = obj;
            this.val$finalProgressView = flickerLoadingView;
            this.val$finalFrom = i;
        }

        @Override
        public final boolean onPreDraw() {
            float f;
            int i = this.val$finalFrom;
            FlickerLoadingView flickerLoadingView = this.val$finalProgressView;
            float f2 = 0.0f;
            Object obj = this.this$0;
            int i2 = 2;
            int i3 = 0;
            final int i4 = 1;
            switch (this.$r8$classId) {
                case 0:
                    ChatUsersActivity chatUsersActivity = (ChatUsersActivity) obj;
                    chatUsersActivity.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    int childCount = chatUsersActivity.listView.getChildCount();
                    AnimatorSet animatorSet = new AnimatorSet();
                    for (int i5 = 0; i5 < childCount; i5++) {
                        View childAt = chatUsersActivity.listView.getChildAt(i5);
                        if (childAt != flickerLoadingView) {
                            chatUsersActivity.listView.getClass();
                            if (RecyclerView.getChildAdapterPosition(childAt) >= i) {
                                childAt.setAlpha(0.0f);
                                int iMin = (int) ((Math.min(chatUsersActivity.listView.getMeasuredHeight(), Math.max(0, childAt.getTop())) / chatUsersActivity.listView.getMeasuredHeight()) * 100.0f);
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                                objectAnimatorOfFloat.setStartDelay(iMin);
                                objectAnimatorOfFloat.setDuration(200L);
                                animatorSet.playTogether(objectAnimatorOfFloat);
                            }
                        }
                    }
                    if (flickerLoadingView != null && flickerLoadingView.getParent() == null) {
                        chatUsersActivity.listView.addView(flickerLoadingView);
                        RecyclerView.LayoutManager layoutManager = chatUsersActivity.listView.getLayoutManager();
                        if (layoutManager != null) {
                            layoutManager.ignoreView(flickerLoadingView);
                            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(flickerLoadingView, (Property<FlickerLoadingView, Float>) View.ALPHA, flickerLoadingView.getAlpha(), 0.0f);
                            objectAnimatorOfFloat2.addListener(new CheckBox.AnonymousClass1(this, 4));
                            objectAnimatorOfFloat2.start();
                        }
                    }
                    animatorSet.start();
                    return true;
                case 1:
                    ChatAttachAlertDocumentLayout.SearchAdapter searchAdapter = (ChatAttachAlertDocumentLayout.SearchAdapter) obj;
                    ChatAttachAlertDocumentLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                    ChatAttachAlertDocumentLayout chatAttachAlertDocumentLayout = ChatAttachAlertDocumentLayout.this;
                    int childCount2 = chatAttachAlertDocumentLayout.listView.getChildCount();
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    for (int i6 = 0; i6 < childCount2; i6++) {
                        View childAt2 = chatAttachAlertDocumentLayout.listView.getChildAt(i6);
                        if (flickerLoadingView != null) {
                            chatAttachAlertDocumentLayout.listView.getClass();
                            if (RecyclerView.getChildAdapterPosition(childAt2) >= i) {
                                childAt2.setAlpha(0.0f);
                                int iMin2 = (int) ((Math.min(chatAttachAlertDocumentLayout.listView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / chatAttachAlertDocumentLayout.listView.getMeasuredHeight()) * 100.0f);
                                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                                objectAnimatorOfFloat3.setStartDelay(iMin2);
                                objectAnimatorOfFloat3.setDuration(200L);
                                animatorSet2.playTogether(objectAnimatorOfFloat3);
                            }
                        } else {
                            childAt2.setAlpha(0.0f);
                            int iMin3 = (int) ((Math.min(chatAttachAlertDocumentLayout.listView.getMeasuredHeight(), Math.max(0, childAt2.getTop())) / chatAttachAlertDocumentLayout.listView.getMeasuredHeight()) * 100.0f);
                            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(childAt2, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                            objectAnimatorOfFloat4.setStartDelay(iMin3);
                            objectAnimatorOfFloat4.setDuration(200L);
                            animatorSet2.playTogether(objectAnimatorOfFloat4);
                        }
                    }
                    final int i7 = 0;
                    animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                        public final ChatUsersActivity.AnonymousClass12 this$2;

                        {
                            this.this$2 = this;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i7) {
                                case 0:
                                    ((ChatAttachAlertDocumentLayout.SearchAdapter) this.this$2.this$0).notificationsLocker.unlock();
                                    break;
                                default:
                                    ChatUsersActivity.AnonymousClass12 anonymousClass12 = this.this$2;
                                    anonymousClass12.val$finalProgressView.setAlpha(1.0f);
                                    RecyclerView.LayoutManager.stopIgnoringView(anonymousClass12.val$finalProgressView);
                                    ChatAttachAlertDocumentLayout.this.listView.removeView(anonymousClass12.val$finalProgressView);
                                    break;
                            }
                        }
                    });
                    searchAdapter.notificationsLocker.lock();
                    animatorSet2.start();
                    if (flickerLoadingView != null && flickerLoadingView.getParent() == null) {
                        chatAttachAlertDocumentLayout.listView.addView(flickerLoadingView);
                        RecyclerView.LayoutManager layoutManager2 = chatAttachAlertDocumentLayout.listView.getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.ignoreView(flickerLoadingView);
                            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(flickerLoadingView, (Property<FlickerLoadingView, Float>) View.ALPHA, flickerLoadingView.getAlpha(), 0.0f);
                            objectAnimatorOfFloat5.addListener(new AnimatorListenerAdapter(this) {
                                public final ChatUsersActivity.AnonymousClass12 this$2;

                                {
                                    this.this$2 = this;
                                }

                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (i4) {
                                        case 0:
                                            ((ChatAttachAlertDocumentLayout.SearchAdapter) this.this$2.this$0).notificationsLocker.unlock();
                                            break;
                                        default:
                                            ChatUsersActivity.AnonymousClass12 anonymousClass12 = this.this$2;
                                            anonymousClass12.val$finalProgressView.setAlpha(1.0f);
                                            RecyclerView.LayoutManager.stopIgnoringView(anonymousClass12.val$finalProgressView);
                                            ChatAttachAlertDocumentLayout.this.listView.removeView(anonymousClass12.val$finalProgressView);
                                            break;
                                    }
                                }
                            });
                            objectAnimatorOfFloat5.start();
                        }
                    }
                    return true;
                case 2:
                    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = (RecyclerItemsEnterAnimator) obj;
                    recyclerItemsEnterAnimator.listView.getViewTreeObserver().removeOnPreDrawListener(this);
                    recyclerItemsEnterAnimator.preDrawListeners.remove(this);
                    RecyclerListView recyclerListView = recyclerItemsEnterAnimator.listView;
                    int childCount3 = recyclerListView.getChildCount();
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    for (int i8 = 0; i8 < childCount3; i8++) {
                        View childAt3 = recyclerListView.getChildAt(i8);
                        recyclerListView.getClass();
                        int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt3);
                        if (childAt3 != flickerLoadingView && childAdapterPosition >= i - 1) {
                            SparseArray sparseArray = recyclerItemsEnterAnimator.listAlphaItems;
                            if (sparseArray.get(childAdapterPosition, null) == null) {
                                sparseArray.put(childAdapterPosition, Float.valueOf(0.0f));
                                recyclerItemsEnterAnimator.invalidateAlpha = true;
                                recyclerListView.invalidate();
                                int iMin4 = (int) ((Math.min(recyclerListView.getMeasuredHeight(), Math.max(0, childAt3.getTop())) / recyclerListView.getMeasuredHeight()) * 100.0f);
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                valueAnimatorOfFloat.addUpdateListener(new BottomSheet$$ExternalSyntheticLambda3(this, childAdapterPosition, 5));
                                valueAnimatorOfFloat.addListener(new ArticleViewer.AnonymousClass3(this, childAdapterPosition, 7));
                                valueAnimatorOfFloat.setStartDelay(iMin4);
                                valueAnimatorOfFloat.setDuration(200L);
                                animatorSet3.playTogether(valueAnimatorOfFloat);
                            }
                        }
                    }
                    recyclerItemsEnterAnimator.currentAnimations.add(animatorSet3);
                    animatorSet3.start();
                    animatorSet3.addListener(new ChatActivity.AnonymousClass74(this, animatorSet3, false, 28));
                    return false;
                default:
                    FilteredSearchView filteredSearchView = (FilteredSearchView) obj;
                    filteredSearchView.getViewTreeObserver().removeOnPreDrawListener(this);
                    ChatActivity.AnonymousClass34 anonymousClass34 = filteredSearchView.recyclerListView;
                    int childCount4 = anonymousClass34.getChildCount();
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    int i9 = 0;
                    while (i9 < childCount4) {
                        View childAt4 = anonymousClass34.getChildAt(i9);
                        if (flickerLoadingView != null) {
                            anonymousClass34.getClass();
                            f = 100.0f;
                            if (RecyclerView.getChildAdapterPosition(childAt4) < i) {
                            }
                            i9++;
                            f2 = 0.0f;
                            i2 = 2;
                            i3 = 0;
                        } else {
                            f = 100.0f;
                        }
                        childAt4.setAlpha(f2);
                        int iMin5 = (int) ((Math.min(anonymousClass34.getMeasuredHeight(), Math.max(i3, childAt4.getTop())) / anonymousClass34.getMeasuredHeight()) * f);
                        float[] fArr = new float[i2];
                        
                        fArr[0] = 0.0f;
                        fArr[1] = 1.0f;
                        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(childAt4, (Property<View, Float>) View.ALPHA, fArr);
                        objectAnimatorOfFloat6.setStartDelay(iMin5);
                        objectAnimatorOfFloat6.setDuration(200L);
                        animatorSet4.playTogether(objectAnimatorOfFloat6);
                        i9++;
                        f2 = 0.0f;
                        i2 = 2;
                        i3 = 0;
                    }
                    final int i10 = 0;
                    animatorSet4.addListener(new AnimatorListenerAdapter(this) {
                        public final ChatUsersActivity.AnonymousClass12 this$1;

                        {
                            this.this$1 = this;
                        }

                        @Override
                        public final void onAnimationEnd(Animator animator) {
                            switch (i10) {
                                case 0:
                                    ((FilteredSearchView) this.this$1.this$0).notificationsLocker.unlock();
                                    break;
                                default:
                                    ChatUsersActivity.AnonymousClass12 anonymousClass12 = this.this$1;
                                    anonymousClass12.val$finalProgressView.setAlpha(1.0f);
                                    RecyclerView.LayoutManager.stopIgnoringView(anonymousClass12.val$finalProgressView);
                                    ((FilteredSearchView) anonymousClass12.this$0).recyclerListView.removeView(anonymousClass12.val$finalProgressView);
                                    break;
                            }
                        }
                    });
                    filteredSearchView.notificationsLocker.lock();
                    animatorSet4.start();
                    if (flickerLoadingView != null && flickerLoadingView.getParent() == null) {
                        anonymousClass34.addView(flickerLoadingView);
                        RecyclerView.LayoutManager layoutManager3 = anonymousClass34.getLayoutManager();
                        if (layoutManager3 != null) {
                            layoutManager3.ignoreView(flickerLoadingView);
                            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(flickerLoadingView, (Property<FlickerLoadingView, Float>) View.ALPHA, flickerLoadingView.getAlpha(), 0.0f);
                            objectAnimatorOfFloat7.addListener(new AnimatorListenerAdapter(this) {
                                public final ChatUsersActivity.AnonymousClass12 this$1;

                                {
                                    this.this$1 = this;
                                }

                                @Override
                                public final void onAnimationEnd(Animator animator) {
                                    switch (i4) {
                                        case 0:
                                            ((FilteredSearchView) this.this$1.this$0).notificationsLocker.unlock();
                                            break;
                                        default:
                                            ChatUsersActivity.AnonymousClass12 anonymousClass12 = this.this$1;
                                            anonymousClass12.val$finalProgressView.setAlpha(1.0f);
                                            RecyclerView.LayoutManager.stopIgnoringView(anonymousClass12.val$finalProgressView);
                                            ((FilteredSearchView) anonymousClass12.this$0).recyclerListView.removeView(anonymousClass12.val$finalProgressView);
                                            break;
                                    }
                                }
                            });
                            objectAnimatorOfFloat7.start();
                        }
                    }
                    return true;
            }
        }
    }

    public final class AnonymousClass7 implements ChatUsersActivityDelegate {
        public AnonymousClass7() {
        }

        @Override
        public final void didAddParticipantToList(long j, TLObject tLObject) {
            if (tLObject != null) {
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                if (chatUsersActivity.participantsMap.get(j) == null) {
                    DiffCallback diffCallbackSaveState = chatUsersActivity.saveState();
                    ArrayList arrayList = chatUsersActivity.participants;
                    arrayList.add(tLObject);
                    chatUsersActivity.participantsMap.put(tLObject, j);
                    Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(8));
                    chatUsersActivity.updateListAnimated(diffCallbackSaveState);
                }
            }
        }

        @Override
        public final void didChangeOwner(TLRPC.User user) {
            ChatUsersActivity.this.onOwnerChaged(user);
        }

        @Override
        public final void didKickParticipant(long j) {
        }

        @Override
        public final void didSelectUser(long j) {
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            TLRPC.User user = chatUsersActivity.getMessagesController().getUser(Long.valueOf(j));
            if (user != null) {
                AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(13, this, user), 200L);
            }
            LongSparseArray longSparseArray = chatUsersActivity.participantsMap;
            if (longSparseArray.get(j) == null) {
                DiffCallback diffCallbackSaveState = chatUsersActivity.saveState();
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser;
                tL_peerUser.user_id = user.id;
                tL_channelParticipantAdmin.date = chatUsersActivity.getConnectionsManager().getCurrentTime();
                tL_channelParticipantAdmin.promoted_by = chatUsersActivity.getAccountInstance().getUserConfig().clientUserId;
                ArrayList arrayList = chatUsersActivity.participants;
                arrayList.add(tL_channelParticipantAdmin);
                longSparseArray.put(tL_channelParticipantAdmin, user.id);
                Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(8));
                chatUsersActivity.updateListAnimated(diffCallbackSaveState);
            }
        }
    }

    public final class AnonymousClass8 implements GroupCreateActivity.ContactsAddActivityDelegate {
        public final GroupCreateActivity val$fragment;

        public AnonymousClass8(GroupCreateActivity groupCreateActivity) {
            this.val$fragment = groupCreateActivity;
        }

        @Override
        public final void didSelectUsers(int i, ArrayList arrayList) {
            if (this.val$fragment.getParentActivity() == null) {
                return;
            }
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            chatUsersActivity.getMessagesController().addUsersToChat(chatUsersActivity.currentChat, chatUsersActivity, arrayList, i, new ChatActivity$$ExternalSyntheticLambda211(this, 3), new ChatUsersActivity$8$$ExternalSyntheticLambda1(0), null);
        }

        @Override
        public final void needAddBot(TLRPC.User user) {
            ChatUsersActivity.this.openRightsEdit(user.id, null, null, null, "", true, 0, false);
        }
    }

    public final class AnonymousClass9 extends GigagroupConvertAlert {
        public AnonymousClass9(Activity activity, ChatUsersActivity chatUsersActivity) {
            super(activity, chatUsersActivity);
        }

        @Override
        public final void onCancel() {
        }

        @Override
        public final void onCovert() {
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            chatUsersActivity.getMessagesController().convertToGigaGroup(chatUsersActivity.getParentActivity(), chatUsersActivity.currentChat, chatUsersActivity, new ChatActivity$$ExternalSyntheticLambda356(this, 20));
        }
    }

    public interface ChatUsersActivityDelegate {
        void didAddParticipantToList(long j, TLObject tLObject);

        void didChangeOwner(TLRPC.User user);

        void didKickParticipant(long j);

        void didSelectUser(long j);
    }

    public final class DiffCallback extends DiffUtil {
        public int oldBotEndRow;
        public int oldBotStartRow;
        public int oldContactsEndRow;
        public int oldContactsStartRow;
        public int oldParticipantsEndRow;
        public int oldParticipantsStartRow;
        public int oldRowCount;
        public final SparseIntArray oldPositionToItem = new SparseIntArray();
        public final SparseIntArray newPositionToItem = new SparseIntArray();
        public final ArrayList oldParticipants = new ArrayList();
        public final ArrayList oldBots = new ArrayList();
        public final ArrayList oldContacts = new ArrayList();

        public DiffCallback() {
        }

        @Override
        public final boolean areContentsTheSame(int i, int i2) {
            return areItemsTheSame(i, i2) && ChatUsersActivity.this.restricted1SectionRow != i2;
        }

        @Override
        public final boolean areItemsTheSame(int i, int i2) {
            int i3 = this.oldBotStartRow;
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            if (i >= i3 && i < this.oldBotEndRow && i2 >= chatUsersActivity.botStartRow && i2 < chatUsersActivity.botEndRow) {
                return ((TLObject) this.oldBots.get(i - i3)).equals(chatUsersActivity.bots.get(i2 - chatUsersActivity.botStartRow));
            }
            int i4 = this.oldContactsStartRow;
            if (i >= i4 && i < this.oldContactsEndRow && i2 >= chatUsersActivity.contactsStartRow && i2 < chatUsersActivity.contactsEndRow) {
                return ((TLObject) this.oldContacts.get(i - i4)).equals(chatUsersActivity.contacts.get(i2 - chatUsersActivity.contactsStartRow));
            }
            int i5 = this.oldParticipantsStartRow;
            if (i < i5 || i >= this.oldParticipantsEndRow || i2 < chatUsersActivity.participantsStartRow || i2 >= chatUsersActivity.participantsEndRow) {
                return this.oldPositionToItem.get(i) == this.newPositionToItem.get(i2);
            }
            return ((TLObject) this.oldParticipants.get(i - i5)).equals(chatUsersActivity.participants.get(i2 - chatUsersActivity.participantsStartRow));
        }

        public final void fillPositions(SparseIntArray sparseIntArray) {
            sparseIntArray.clear();
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            int i = chatUsersActivity.recentActionsRow;
            if (i >= 0) {
                sparseIntArray.put(i, 1);
            }
            int i2 = chatUsersActivity.addNewRow;
            if (i2 >= 0) {
                sparseIntArray.put(i2, 2);
            }
            int i3 = chatUsersActivity.addNew2Row;
            if (i3 >= 0) {
                sparseIntArray.put(i3, 3);
            }
            int i4 = chatUsersActivity.addNewSectionRow;
            if (i4 >= 0) {
                sparseIntArray.put(i4, 4);
            }
            int i5 = chatUsersActivity.restricted1SectionRow;
            if (i5 >= 0) {
                sparseIntArray.put(i5, 5);
            }
            int i6 = chatUsersActivity.participantsDividerRow;
            if (i6 >= 0) {
                sparseIntArray.put(i6, 6);
            }
            int i7 = chatUsersActivity.participantsDivider2Row;
            if (i7 >= 0) {
                sparseIntArray.put(i7, 7);
            }
            int i8 = chatUsersActivity.gigaHeaderRow;
            if (i8 >= 0) {
                sparseIntArray.put(i8, 8);
            }
            int i9 = chatUsersActivity.gigaConvertRow;
            if (i9 >= 0) {
                sparseIntArray.put(i9, 9);
            }
            int i10 = chatUsersActivity.gigaInfoRow;
            if (i10 >= 0) {
                sparseIntArray.put(i10, 10);
            }
            int i11 = chatUsersActivity.participantsInfoRow;
            if (i11 >= 0) {
                sparseIntArray.put(i11, 11);
            }
            int i12 = chatUsersActivity.blockedEmptyRow;
            if (i12 >= 0) {
                sparseIntArray.put(i12, 12);
            }
            int i13 = chatUsersActivity.permissionsSectionRow;
            if (i13 >= 0) {
                sparseIntArray.put(i13, 13);
            }
            int i14 = chatUsersActivity.sendMessagesRow;
            if (i14 >= 0) {
                sparseIntArray.put(i14, 14);
            }
            int i15 = chatUsersActivity.sendMediaRow;
            if (i15 >= 0) {
                sparseIntArray.put(i15, 15);
            }
            int i16 = chatUsersActivity.sendStickersRow;
            if (i16 >= 0) {
                sparseIntArray.put(i16, 16);
            }
            int i17 = chatUsersActivity.sendPollsRow;
            if (i17 >= 0) {
                sparseIntArray.put(i17, 17);
            }
            int i18 = chatUsersActivity.embedLinksRow;
            if (i18 >= 0) {
                sparseIntArray.put(i18, 18);
            }
            int i19 = chatUsersActivity.addUsersRow;
            if (i19 >= 0) {
                sparseIntArray.put(i19, 19);
            }
            int i20 = chatUsersActivity.manageLinkedPeersRow;
            if (i20 >= 0) {
                sparseIntArray.put(i20, 20);
            }
            int i21 = chatUsersActivity.pinMessagesRow;
            if (i21 >= 0) {
                sparseIntArray.put(i21, 21);
            }
            int i22 = chatUsersActivity.editTagRow;
            if (i22 >= 0) {
                sparseIntArray.put(i22, 22);
            }
            int i23 = chatUsersActivity.sendReactionsRow;
            int i24 = 23;
            if (i23 >= 0) {
                sparseIntArray.put(i23, 23);
            }
            if (chatUsersActivity.isForum) {
                int i25 = chatUsersActivity.manageTopicsRow;
                i24 = 24;
                if (i25 >= 0) {
                    sparseIntArray.put(i25, 24);
                }
            }
            int i26 = i24 + 1;
            int i27 = chatUsersActivity.changeInfoRow;
            if (i27 >= 0) {
                sparseIntArray.put(i27, i26);
            }
            int i28 = i24 + 2;
            int i29 = chatUsersActivity.removedUsersRow;
            if (i29 >= 0) {
                sparseIntArray.put(i29, i28);
            }
            int i30 = i24 + 3;
            int i31 = chatUsersActivity.contactsHeaderRow;
            if (i31 >= 0) {
                sparseIntArray.put(i31, i30);
            }
            int i32 = i24 + 4;
            int i33 = chatUsersActivity.botHeaderRow;
            if (i33 >= 0) {
                sparseIntArray.put(i33, i32);
            }
            int i34 = i24 + 5;
            int i35 = chatUsersActivity.membersHeaderRow;
            if (i35 >= 0) {
                sparseIntArray.put(i35, i34);
            }
            int i36 = i24 + 6;
            int i37 = chatUsersActivity.slowmodeRow;
            if (i37 >= 0) {
                sparseIntArray.put(i37, i36);
            }
            int i38 = i24 + 7;
            int i39 = chatUsersActivity.slowmodeSelectRow;
            if (i39 >= 0) {
                sparseIntArray.put(i39, i38);
            }
            int i40 = i24 + 8;
            int i41 = chatUsersActivity.slowmodeInfoRow;
            if (i41 >= 0) {
                sparseIntArray.put(i41, i40);
            }
            int i42 = i24 + 9;
            int i43 = chatUsersActivity.dontRestrictBoostersRow;
            if (i43 >= 0) {
                sparseIntArray.put(i43, i42);
            }
            int i44 = i24 + 10;
            int i45 = chatUsersActivity.dontRestrictBoostersSliderRow;
            if (i45 >= 0) {
                sparseIntArray.put(i45, i44);
            }
            int i46 = i24 + 11;
            int i47 = chatUsersActivity.dontRestrictBoostersInfoRow;
            if (i47 >= 0) {
                sparseIntArray.put(i47, i46);
            }
            int i48 = i24 + 12;
            int i49 = chatUsersActivity.loadingProgressRow;
            if (i49 >= 0) {
                sparseIntArray.put(i49, i48);
            }
            int i50 = i24 + 13;
            int i51 = chatUsersActivity.loadingUserCellRow;
            if (i51 >= 0) {
                sparseIntArray.put(i51, i50);
            }
            int i52 = i24 + 14;
            int i53 = chatUsersActivity.loadingHeaderRow;
            if (i53 >= 0) {
                sparseIntArray.put(i53, i52);
            }
            int i54 = i24 + 15;
            int i55 = chatUsersActivity.signMessagesRow;
            if (i55 >= 0) {
                sparseIntArray.put(i55, i54);
            }
            int i56 = i24 + 16;
            int i57 = chatUsersActivity.signMessagesProfilesRow;
            if (i57 >= 0) {
                sparseIntArray.put(i57, i56);
            }
            int i58 = i24 + 17;
            int i59 = chatUsersActivity.signMessagesInfoRow;
            if (i59 >= 0) {
                sparseIntArray.put(i59, i58);
            }
            int i60 = i24 + 18;
            int i61 = chatUsersActivity.payRow;
            if (i61 >= 0) {
                sparseIntArray.put(i61, i60);
            }
            int i62 = i24 + 19;
            int i63 = chatUsersActivity.payInfoRow;
            if (i63 >= 0) {
                sparseIntArray.put(i63, i62);
            }
            int i64 = i24 + 20;
            int i65 = chatUsersActivity.priceHeaderRow;
            if (i65 >= 0) {
                sparseIntArray.put(i65, i64);
            }
            int i66 = i24 + 21;
            int i67 = chatUsersActivity.priceRow;
            if (i67 >= 0) {
                sparseIntArray.put(i67, i66);
            }
            int i68 = i24 + 22;
            int i69 = chatUsersActivity.priceInfoRow;
            if (i69 >= 0) {
                sparseIntArray.put(i69, i68);
            }
        }

        @Override
        public final int getNewListSize() {
            return ChatUsersActivity.this.rowCount;
        }

        @Override
        public final int getOldListSize() {
            return this.oldRowCount;
        }
    }

    public final class ListAdapter extends RecyclerListView.SelectionAdapter {
        public final Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        public final TLObject getItem(int i) {
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            int i2 = chatUsersActivity.participantsStartRow;
            if (i >= i2 && i < chatUsersActivity.participantsEndRow) {
                return (TLObject) chatUsersActivity.participants.get(i - i2);
            }
            int i3 = chatUsersActivity.contactsStartRow;
            if (i >= i3 && i < chatUsersActivity.contactsEndRow) {
                return (TLObject) chatUsersActivity.contacts.get(i - i3);
            }
            int i4 = chatUsersActivity.botStartRow;
            if (i < i4 || i >= chatUsersActivity.botEndRow) {
                return null;
            }
            return (TLObject) chatUsersActivity.bots.get(i - i4);
        }

        @Override
        public final int getItemCount() {
            return ChatUsersActivity.this.rowCount;
        }

        @Override
        public final int getItemViewType(int i) {
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            if (i == chatUsersActivity.addNewRow || i == chatUsersActivity.addNew2Row || i == chatUsersActivity.recentActionsRow || i == chatUsersActivity.gigaConvertRow) {
                return 2;
            }
            if ((i >= chatUsersActivity.participantsStartRow && i < chatUsersActivity.participantsEndRow) || ((i >= chatUsersActivity.botStartRow && i < chatUsersActivity.botEndRow) || (i >= chatUsersActivity.contactsStartRow && i < chatUsersActivity.contactsEndRow))) {
                return 0;
            }
            if (i == chatUsersActivity.addNewSectionRow || i == chatUsersActivity.participantsDividerRow || i == chatUsersActivity.participantsDivider2Row) {
                return 3;
            }
            if (i == chatUsersActivity.restricted1SectionRow || i == chatUsersActivity.permissionsSectionRow || i == chatUsersActivity.slowmodeRow || i == chatUsersActivity.gigaHeaderRow || i == chatUsersActivity.priceHeaderRow) {
                return 5;
            }
            if (i == chatUsersActivity.participantsInfoRow || i == chatUsersActivity.slowmodeInfoRow || i == chatUsersActivity.dontRestrictBoostersInfoRow || i == chatUsersActivity.gigaInfoRow || i == chatUsersActivity.antiSpamInfoRow || i == chatUsersActivity.hideMembersInfoRow || i == chatUsersActivity.tagsInfoRow || i == chatUsersActivity.signMessagesInfoRow || i == chatUsersActivity.payInfoRow || i == chatUsersActivity.priceInfoRow) {
                return 1;
            }
            if (i == chatUsersActivity.blockedEmptyRow) {
                return 4;
            }
            if (i == chatUsersActivity.removedUsersRow) {
                return 6;
            }
            if (i == chatUsersActivity.changeInfoRow || i == chatUsersActivity.addUsersRow || i == chatUsersActivity.manageLinkedPeersRow || i == chatUsersActivity.pinMessagesRow || i == chatUsersActivity.editTagRow || i == chatUsersActivity.sendMessagesRow || i == chatUsersActivity.sendStickersRow || i == chatUsersActivity.embedLinksRow || i == chatUsersActivity.manageTopicsRow || i == chatUsersActivity.dontRestrictBoostersRow) {
                return 7;
            }
            if (i == chatUsersActivity.membersHeaderRow || i == chatUsersActivity.contactsHeaderRow || i == chatUsersActivity.botHeaderRow || i == chatUsersActivity.loadingHeaderRow) {
                return 8;
            }
            if (i == chatUsersActivity.slowmodeSelectRow) {
                return 9;
            }
            if (i == chatUsersActivity.loadingProgressRow) {
                return 10;
            }
            if (i == chatUsersActivity.loadingUserCellRow) {
                return 11;
            }
            if (i == chatUsersActivity.antiSpamRow || i == chatUsersActivity.hideMembersRow || i == chatUsersActivity.tagsRow) {
                return 12;
            }
            if (chatUsersActivity.isExpandableSendMediaRow$1(i)) {
                return 13;
            }
            if (i == chatUsersActivity.sendMediaRow) {
                return 14;
            }
            if (i == chatUsersActivity.dontRestrictBoostersSliderRow) {
                return 15;
            }
            if (i == chatUsersActivity.signMessagesRow || i == chatUsersActivity.signMessagesProfilesRow || i == chatUsersActivity.payRow) {
                return 16;
            }
            return i == chatUsersActivity.priceRow ? 17 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int i = viewHolder.mItemViewType;
            if (i != 16) {
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                if (i == 7 || i == 14) {
                    return ChatObject.canBlockUsers(chatUsersActivity.currentChat);
                }
                if (i == 0) {
                    Object currentObject = ((ManageChatUserCell) viewHolder.itemView).getCurrentObject();
                    if (chatUsersActivity.type != 1 && (currentObject instanceof TLRPC.User) && ((TLRPC.User) currentObject).self) {
                        return false;
                    }
                } else {
                    int adapterPosition = viewHolder.getAdapterPosition();
                    if (i != 0 && i != 2 && i != 6) {
                        if (i != 12) {
                            if (i == 13) {
                                return false;
                            }
                        } else {
                            if (adapterPosition == chatUsersActivity.antiSpamRow) {
                                return ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 13);
                            }
                            if (adapterPosition == chatUsersActivity.hideMembersRow) {
                                return ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 2);
                            }
                            if (adapterPosition != chatUsersActivity.tagsRow) {
                                if (i == 13) {
                                    return false;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int i2;
            boolean z;
            boolean z2;
            long peerId;
            boolean z3;
            int i3;
            boolean z4;
            long j;
            long j2;
            TLRPC.TL_chatBannedRights tL_chatBannedRights;
            boolean z5;
            TLObject chat;
            CharSequence joined;
            boolean z6;
            CharSequence string;
            TLRPC.User user;
            boolean z7;
            CharSequence string2;
            boolean z8;
            TLRPC.User user2;
            StringBuilder sb;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            boolean z24;
            boolean z25;
            TLRPC.TL_chatBannedRights tL_chatBannedRights2;
            TLRPC.ChatFull chatFull;
            TLRPC.ChatFull chatFull2;
            int i4 = 13;
            int i5 = viewHolder.mItemViewType;
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            CharSequence string3 = "";
            boolean z26 = false;
            z = true;
            z = true;
            boolean z27 = true;
            ArrayList arrayList = chatUsersActivity.participants;
            boolean z28 = chatUsersActivity.isCommunity;
            boolean z29 = chatUsersActivity.isChannel;
            int i6 = chatUsersActivity.type;
            View view = viewHolder.itemView;
            switch (i5) {
                case 0:
                    ManageChatUserCell manageChatUserCell = (ManageChatUserCell) view;
                    manageChatUserCell.setTag(Integer.valueOf(i));
                    TLObject item = getItem(i);
                    if (i < chatUsersActivity.participantsStartRow || i >= (i2 = chatUsersActivity.participantsEndRow)) {
                        if (i < chatUsersActivity.contactsStartRow || i >= (i2 = chatUsersActivity.contactsEndRow)) {
                            i2 = chatUsersActivity.botEndRow;
                        } else if (ChatObject.isChannel(chatUsersActivity.currentChat) && !chatUsersActivity.currentChat.megagroup) {
                            z = true;
                        }
                        z = false;
                    } else if (!ChatObject.isChannel(chatUsersActivity.currentChat) || chatUsersActivity.currentChat.megagroup) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!(item instanceof TLRPC.User)) {
                        z2 = z;
                        if (item instanceof TLRPC.ChannelParticipant) {
                            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
                            peerId = MessageObject.getPeerId(channelParticipant.peer);
                            j2 = channelParticipant.kicked_by;
                            j = channelParticipant.promoted_by;
                            tL_chatBannedRights = channelParticipant.banned_rights;
                            i3 = channelParticipant.date;
                            z5 = channelParticipant instanceof TLRPC.TL_channelParticipantBanned;
                            z4 = channelParticipant instanceof TLRPC.TL_channelParticipantCreator;
                            z3 = channelParticipant instanceof TLRPC.TL_channelParticipantAdmin;
                        } else if (item instanceof TLRPC.ChatParticipant) {
                            TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) item;
                            peerId = chatParticipant.user_id;
                            int i7 = chatParticipant.date;
                            boolean z30 = chatParticipant instanceof TLRPC.TL_chatParticipantCreator;
                            z3 = chatParticipant instanceof TLRPC.TL_chatParticipantAdmin;
                            i3 = i7;
                            z4 = z30;
                            j = 0;
                            j2 = 0;
                        }
                        if (peerId > 0) {
                            chat = chatUsersActivity.getMessagesController().getUser(Long.valueOf(peerId));
                        } else {
                            chat = chatUsersActivity.getMessagesController().getChat(Long.valueOf(-peerId));
                        }
                        if (chat != null) {
                            if (i6 == 3) {
                                if (tL_chatBannedRights == null) {
                                    sb = new StringBuilder();
                                    z9 = tL_chatBannedRights.view_messages;
                                    if (z9 && chatUsersActivity.defaultBannedRights.view_messages != z9) {
                                        sb.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                    }
                                    if (tL_chatBannedRights.send_messages && chatUsersActivity.defaultBannedRights.send_plain != tL_chatBannedRights.send_plain) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                    }
                                    z10 = tL_chatBannedRights.send_media;
                                    if (z10 || chatUsersActivity.defaultBannedRights.send_media == z10) {
                                        z11 = tL_chatBannedRights.send_photos;
                                        if (z11 && chatUsersActivity.defaultBannedRights.send_photos != z11) {
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                        }
                                        z12 = tL_chatBannedRights.send_videos;
                                        if (z12 && chatUsersActivity.defaultBannedRights.send_videos != z12) {
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                        }
                                        z13 = tL_chatBannedRights.send_audios;
                                        if (z13 && chatUsersActivity.defaultBannedRights.send_audios != z13) {
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                        }
                                        z14 = tL_chatBannedRights.send_docs;
                                        if (z14 && chatUsersActivity.defaultBannedRights.send_docs != z14) {
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                        }
                                        z15 = tL_chatBannedRights.send_voices;
                                        if (z15 && chatUsersActivity.defaultBannedRights.send_voices != z15) {
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                        }
                                        z16 = tL_chatBannedRights.send_roundvideos;
                                        if (z16 && chatUsersActivity.defaultBannedRights.send_roundvideos != z16) {
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                        }
                                    } else {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendMedia", R.string.UserRestrictionsNoSendMedia));
                                    }
                                    z17 = tL_chatBannedRights.send_stickers;
                                    if (z17 && chatUsersActivity.defaultBannedRights.send_stickers != z17) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                    }
                                    z18 = tL_chatBannedRights.send_polls;
                                    if (z18 && chatUsersActivity.defaultBannedRights.send_polls != z18) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                    }
                                    z19 = tL_chatBannedRights.embed_links;
                                    if (z19 && !tL_chatBannedRights.send_plain && chatUsersActivity.defaultBannedRights.embed_links != z19) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                    }
                                    z20 = tL_chatBannedRights.invite_users;
                                    if (z20 && chatUsersActivity.defaultBannedRights.invite_users != z20) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                    }
                                    z21 = tL_chatBannedRights.pin_messages;
                                    if (z21 && chatUsersActivity.defaultBannedRights.pin_messages != z21) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                    }
                                    z22 = tL_chatBannedRights.edit_rank;
                                    if (z22 && chatUsersActivity.defaultBannedRights.edit_rank != z22) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                    }
                                    z23 = tL_chatBannedRights.send_reactions;
                                    if (z23 && chatUsersActivity.defaultBannedRights.send_reactions != z23) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                    }
                                    z24 = tL_chatBannedRights.change_info;
                                    if (z24 && chatUsersActivity.defaultBannedRights.change_info != z24) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                                    }
                                    if (sb.length() != 0) {
                                        sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
                                        sb.append('.');
                                    }
                                    string3 = sb.toString();
                                }
                                if (i != i2 - 1) {
                                    z25 = true;
                                } else {
                                    z25 = false;
                                }
                                manageChatUserCell.setData(chat, null, string3, z25);
                            } else if (i6 == 0) {
                                if (z5 || (user2 = chatUsersActivity.getMessagesController().getUser(Long.valueOf(j2))) == null) {
                                    string2 = null;
                                } else {
                                    string2 = LocaleController.formatString(R.string.UserRemovedBy, UserObject.getUserName(user2));
                                }
                                if (i != i2 - 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                manageChatUserCell.setData(chat, null, string2, z8);
                            } else if (i6 == 1) {
                                if (z4) {
                                    if (z3 || (user = chatUsersActivity.getMessagesController().getUser(Long.valueOf(j))) == null) {
                                        string = null;
                                    } else if (user.id == peerId) {
                                        string = LocaleController.getString(R.string.ChannelAdministrator);
                                    } else {
                                        string = LocaleController.formatString(R.string.EditAdminPromotedBy, UserObject.getUserName(user));
                                    }
                                    if (i != i2 - 1) {
                                        z7 = true;
                                    } else {
                                        z7 = false;
                                    }
                                    manageChatUserCell.setData(chat, null, string, z7);
                                } else {
                                    string = LocaleController.getString(R.string.ChannelCreator);
                                }
                                if (i != i2 - 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                manageChatUserCell.setData(chat, null, string, z7);
                            } else if (i6 == 2) {
                                if (z2 || i3 == 0) {
                                    joined = null;
                                } else {
                                    joined = LocaleController.formatJoined(i3);
                                }
                                if (i != i2 - 1) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                manageChatUserCell.setData(chat, null, joined, z6);
                            }
                        }
                    } else {
                        z2 = z;
                        peerId = ((TLRPC.User) item).id;
                        j = 0;
                        j2 = 0;
                        z4 = false;
                        z3 = false;
                        i3 = 0;
                    }
                    tL_chatBannedRights = null;
                    z5 = false;
                    if (peerId > 0) {
                        chat = chatUsersActivity.getMessagesController().getUser(Long.valueOf(peerId));
                    } else {
                        chat = chatUsersActivity.getMessagesController().getChat(Long.valueOf(-peerId));
                    }
                    if (chat != null) {
                        if (i6 == 3) {
                            if (tL_chatBannedRights == null) {
                                sb = new StringBuilder();
                                z9 = tL_chatBannedRights.view_messages;
                                if (z9) {
                                    sb.append(LocaleController.getString("UserRestrictionsNoRead", R.string.UserRestrictionsNoRead));
                                }
                                if (tL_chatBannedRights.send_messages) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString("UserRestrictionsNoSendText", R.string.UserRestrictionsNoSendText));
                                }
                                z10 = tL_chatBannedRights.send_media;
                                if (z10) {
                                    z11 = tL_chatBannedRights.send_photos;
                                    if (z11) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    z12 = tL_chatBannedRights.send_videos;
                                    if (z12) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    z13 = tL_chatBannedRights.send_audios;
                                    if (z13) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    z14 = tL_chatBannedRights.send_docs;
                                    if (z14) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    z15 = tL_chatBannedRights.send_voices;
                                    if (z15) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    z16 = tL_chatBannedRights.send_roundvideos;
                                    if (z16) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                    }
                                } else {
                                    z11 = tL_chatBannedRights.send_photos;
                                    if (z11) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendPhotos", R.string.UserRestrictionsNoSendPhotos));
                                    }
                                    z12 = tL_chatBannedRights.send_videos;
                                    if (z12) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendVideos", R.string.UserRestrictionsNoSendVideos));
                                    }
                                    z13 = tL_chatBannedRights.send_audios;
                                    if (z13) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendMusic", R.string.UserRestrictionsNoSendMusic));
                                    }
                                    z14 = tL_chatBannedRights.send_docs;
                                    if (z14) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendDocs", R.string.UserRestrictionsNoSendDocs));
                                    }
                                    z15 = tL_chatBannedRights.send_voices;
                                    if (z15) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendVoice", R.string.UserRestrictionsNoSendVoice));
                                    }
                                    z16 = tL_chatBannedRights.send_roundvideos;
                                    if (z16) {
                                        if (sb.length() != 0) {
                                            sb.append(", ");
                                        }
                                        sb.append(LocaleController.getString("UserRestrictionsNoSendRound", R.string.UserRestrictionsNoSendRound));
                                    }
                                }
                                z17 = tL_chatBannedRights.send_stickers;
                                if (z17) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString("UserRestrictionsNoSendStickers", R.string.UserRestrictionsNoSendStickers));
                                }
                                z18 = tL_chatBannedRights.send_polls;
                                if (z18) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString("UserRestrictionsNoSendPolls", R.string.UserRestrictionsNoSendPolls));
                                }
                                z19 = tL_chatBannedRights.embed_links;
                                if (z19) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString("UserRestrictionsNoEmbedLinks", R.string.UserRestrictionsNoEmbedLinks));
                                }
                                z20 = tL_chatBannedRights.invite_users;
                                if (z20) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString("UserRestrictionsNoInviteUsers", R.string.UserRestrictionsNoInviteUsers));
                                }
                                z21 = tL_chatBannedRights.pin_messages;
                                if (z21) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString(R.string.UserRestrictionsNoPinMessages));
                                }
                                z22 = tL_chatBannedRights.edit_rank;
                                if (z22) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString(R.string.UserRestrictionsNoEditTags));
                                }
                                z23 = tL_chatBannedRights.send_reactions;
                                if (z23) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString(R.string.UserRestrictionsNoSendReactions));
                                }
                                z24 = tL_chatBannedRights.change_info;
                                if (z24) {
                                    if (sb.length() != 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(LocaleController.getString(R.string.UserRestrictionsNoChangeInfo));
                                }
                                if (sb.length() != 0) {
                                    sb.replace(0, 1, sb.substring(0, 1).toUpperCase());
                                    sb.append('.');
                                }
                                string3 = sb.toString();
                            }
                            if (i != i2 - 1) {
                                z25 = true;
                            } else {
                                z25 = false;
                            }
                            manageChatUserCell.setData(chat, null, string3, z25);
                        } else if (i6 == 0) {
                            if (z5) {
                                string2 = null;
                            } else {
                                string2 = null;
                            }
                            if (i != i2 - 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            manageChatUserCell.setData(chat, null, string2, z8);
                        } else if (i6 == 1) {
                            if (z4) {
                                if (z3) {
                                    string = null;
                                } else {
                                    string = null;
                                }
                                if (i != i2 - 1) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                manageChatUserCell.setData(chat, null, string, z7);
                            } else {
                                string = LocaleController.getString(R.string.ChannelCreator);
                            }
                            if (i != i2 - 1) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            manageChatUserCell.setData(chat, null, string, z7);
                        } else if (i6 == 2) {
                            if (z2) {
                                joined = null;
                            } else {
                                joined = null;
                            }
                            if (i != i2 - 1) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            manageChatUserCell.setData(chat, null, joined, z6);
                        }
                    }
                    break;
                case 1:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) view;
                    if (i == chatUsersActivity.antiSpamInfoRow) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ChannelAntiSpamInfo", R.string.ChannelAntiSpamInfo));
                    } else if (i != chatUsersActivity.participantsInfoRow) {
                        if (i == chatUsersActivity.slowmodeInfoRow) {
                            int secondsForIndex = ChatUsersActivity.getSecondsForIndex(chatUsersActivity.selectedSlowmode);
                            if (chatUsersActivity.info == null || secondsForIndex == 0) {
                                textInfoPrivacyCell.setText(LocaleController.getString(R.string.SlowmodeInfoOff));
                            } else {
                                textInfoPrivacyCell.setText(LocaleController.formatString(R.string.SlowmodeInfoSelected, secondsForIndex < 60 ? LocaleController.formatPluralString("Seconds", secondsForIndex, new Object[0]) : secondsForIndex < 3600 ? LocaleController.formatPluralString("Minutes", secondsForIndex / 60, new Object[0]) : LocaleController.formatPluralString("Hours", (secondsForIndex / 60) / 60, new Object[0])));
                            }
                        } else if (i == chatUsersActivity.payInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupMessagesChargePriceInfo));
                        } else if (i == chatUsersActivity.priceInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.formatString(R.string.GroupMessagesPriceInfo, AffiliateProgramFragment.percents(chatUsersActivity.getMessagesController().starsPaidMessageCommissionPermille), String.valueOf(((double) ((int) ((((double) (chatUsersActivity.starsPrice * (chatUsersActivity.getMessagesController().starsPaidMessageCommissionPermille / 1000.0f))) / 1000.0d) * ((double) chatUsersActivity.getMessagesController().starsUsdWithdrawRate1000)))) / 100.0d)));
                        } else if (i == chatUsersActivity.hideMembersInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelHideMembersInfo));
                        } else if (i == chatUsersActivity.tagsInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.ChannelMemberTagsInfo));
                        } else if (i == chatUsersActivity.gigaInfoRow) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.BroadcastGroupConvertInfo));
                        } else if (i != chatUsersActivity.dontRestrictBoostersInfoRow) {
                            if (i == chatUsersActivity.signMessagesInfoRow) {
                                textInfoPrivacyCell.setText(LocaleController.getString(chatUsersActivity.signatures ? R.string.ChannelSignProfilesInfo : R.string.ChannelSignInfo));
                            }
                        } else if (!chatUsersActivity.isEnabledNotRestrictBoosters) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo));
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.GroupNotRestrictBoostersInfo2));
                        }
                    } else if (i6 == 0 || i6 == 3) {
                        if (z29) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        } else if (!z28) {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        } else {
                            textInfoPrivacyCell.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        }
                    } else if (i6 != 1) {
                        if (i6 == 2) {
                            if (z29 && chatUsersActivity.selectType == 0) {
                                textInfoPrivacyCell.setText(LocaleController.getString("ChannelMembersInfo", R.string.ChannelMembersInfo));
                            } else {
                                textInfoPrivacyCell.setText("");
                            }
                        }
                    } else if (chatUsersActivity.addNewRow == -1) {
                        textInfoPrivacyCell.setText("");
                    } else if (!z29) {
                        textInfoPrivacyCell.setText(LocaleController.getString("MegaAdminsInfo", R.string.MegaAdminsInfo));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("ChannelAdminsInfo", R.string.ChannelAdminsInfo));
                    }
                    break;
                case 2:
                    ManageChatTextCell manageChatTextCell = (ManageChatTextCell) view;
                    manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteGrayIcon, Theme.key_windowBackgroundWhiteBlackText);
                    if (i != chatUsersActivity.addNewRow) {
                        if (i == chatUsersActivity.recentActionsRow) {
                            manageChatTextCell.setText(LocaleController.getString(R.string.EventLog), R.drawable.msg_log, 5, chatUsersActivity.antiSpamRow > chatUsersActivity.recentActionsRow);
                        } else if (i == chatUsersActivity.addNew2Row) {
                            manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            if ((!chatUsersActivity.loadingUsers || chatUsersActivity.firstLoaded) && chatUsersActivity.membersHeaderRow == -1 && !arrayList.isEmpty()) {
                                z26 = true;
                            }
                            manageChatTextCell.setText(LocaleController.getString("ChannelInviteViaLink", R.string.ChannelInviteViaLink), R.drawable.msg_link2, 5, z26);
                        } else if (i == chatUsersActivity.gigaConvertRow) {
                            manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                            manageChatTextCell.setText(LocaleController.getString("BroadcastGroupConvert", R.string.BroadcastGroupConvert), R.drawable.msg_channel, 5, false);
                        }
                    } else if (i6 == 3) {
                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        manageChatTextCell.setText(LocaleController.getString("ChannelAddException", R.string.ChannelAddException), R.drawable.msg_contact_add, 5, chatUsersActivity.participantsStartRow != -1);
                    } else if (i6 == 0) {
                        manageChatTextCell.setText(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser), R.drawable.msg_user_remove, 5, false);
                    } else if (i6 == 1) {
                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        manageChatTextCell.setText(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin), R.drawable.msg_admin_add, 5, !chatUsersActivity.loadingUsers || chatUsersActivity.firstLoaded);
                    } else if (i6 == 2) {
                        manageChatTextCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        if (chatUsersActivity.addNew2Row != -1 || ((!chatUsersActivity.loadingUsers || chatUsersActivity.firstLoaded) && chatUsersActivity.membersHeaderRow == -1 && !arrayList.isEmpty())) {
                            z26 = true;
                        }
                        if (!z29) {
                            manageChatTextCell.setText(LocaleController.getString(R.string.AddMember), R.drawable.msg_contact_add, 5, z26);
                        } else {
                            manageChatTextCell.setText(LocaleController.getString(R.string.AddSubscriber), R.drawable.msg_contact_add, 5, z26);
                        }
                    }
                    break;
                case 5:
                    HeaderCell headerCell = (HeaderCell) view;
                    if (i != chatUsersActivity.restricted1SectionRow) {
                        if (i == chatUsersActivity.permissionsSectionRow) {
                            headerCell.setText(LocaleController.getString(z28 ? R.string.CommunityPermissionsHeader : R.string.ChannelPermissionsHeader));
                        } else if (i == chatUsersActivity.slowmodeRow) {
                            headerCell.setText(LocaleController.getString(R.string.Slowmode));
                        } else if (i == chatUsersActivity.gigaHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.BroadcastGroup));
                        } else if (i == chatUsersActivity.priceHeaderRow) {
                            headerCell.setText(LocaleController.getString(R.string.GroupMessagesPriceHeader));
                        }
                    } else if (i6 != 0) {
                        headerCell.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    } else {
                        TLRPC.ChatFull chatFull3 = chatUsersActivity.info;
                        int size = chatFull3 != null ? chatFull3.kicked_count : arrayList.size();
                        if (size == 0) {
                            headerCell.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                        } else {
                            headerCell.setText(LocaleController.formatPluralString("RemovedUser", size, new Object[0]));
                        }
                    }
                    break;
                case 6:
                    TextSettingsCell textSettingsCell = (TextSettingsCell) view;
                    String string4 = LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist);
                    TLRPC.ChatFull chatFull4 = chatUsersActivity.info;
                    textSettingsCell.setTextAndValue(string4, String.format("%d", Integer.valueOf(chatFull4 != null ? chatFull4.kicked_count : 0)), false, false);
                    break;
                case 7:
                case 14:
                    TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                    textCheckCell2.getCheckBox().setDrawIconType(1);
                    Switch checkBox = textCheckCell2.getCheckBox();
                    int i8 = Theme.key_fill_RedNormal;
                    int i9 = Theme.key_switch2TrackChecked;
                    int i10 = Theme.key_windowBackgroundWhite;
                    checkBox.trackColorKey = i8;
                    checkBox.trackCheckedColorKey = i9;
                    checkBox.thumbColorKey = i10;
                    checkBox.thumbCheckedColorKey = i10;
                    boolean z31 = textCheckCell2.getTag() != null && ((Integer) textCheckCell2.getTag()).intValue() == i;
                    textCheckCell2.setTag(Integer.valueOf(i));
                    if (i == chatUsersActivity.changeInfoRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(z28 ? R.string.CommunityAdminRightEditCommunityName : R.string.UserRestrictionsChangeInfo), (chatUsersActivity.defaultBannedRights.change_info || ChatObject.isPublic(chatUsersActivity.currentChat)) ? false : true, chatUsersActivity.manageTopicsRow != -1, z31);
                    } else if (i == chatUsersActivity.manageLinkedPeersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.CommunityAdminRightEditGroupList), !chatUsersActivity.defaultBannedRights.manage_linked_peers, false, z31);
                    } else if (i == chatUsersActivity.addUsersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsInviteUsers", R.string.UserRestrictionsInviteUsers), !chatUsersActivity.defaultBannedRights.invite_users, true, z31);
                    } else if (i == chatUsersActivity.pinMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsPinMessages), (chatUsersActivity.defaultBannedRights.pin_messages || ChatObject.isPublic(chatUsersActivity.currentChat)) ? false : true, true, z31);
                    } else if (i == chatUsersActivity.editTagRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.UserRestrictionsEditTags), !chatUsersActivity.defaultBannedRights.edit_rank, true, z31);
                    } else if (i == chatUsersActivity.sendMessagesRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendText", R.string.UserRestrictionsSendText), !chatUsersActivity.defaultBannedRights.send_plain, true, z31);
                    } else if (i == chatUsersActivity.dontRestrictBoostersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString(R.string.GroupNotRestrictBoosters), chatUsersActivity.isEnabledNotRestrictBoosters, false, z31);
                        textCheckCell2.getCheckBox().setDrawIconType(0);
                        Switch checkBox2 = textCheckCell2.getCheckBox();
                        int i11 = Theme.key_switchTrack;
                        int i12 = Theme.key_switchTrackChecked;
                        checkBox2.trackColorKey = i11;
                        checkBox2.trackCheckedColorKey = i12;
                        checkBox2.thumbColorKey = i10;
                        checkBox2.thumbCheckedColorKey = i10;
                    } else if (i == chatUsersActivity.sendMediaRow) {
                        int sendMediaSelectedCount = ChatUsersActivity.getSendMediaSelectedCount(chatUsersActivity.defaultBannedRights);
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendMedia", R.string.UserRestrictionsSendMedia), sendMediaSelectedCount > 0, true, z31);
                        Locale locale = Locale.US;
                        textCheckCell2.setCollapseArrow(new zzy(11, this, textCheckCell2), RendererCapabilities.CC.m(sendMediaSelectedCount, "/10"), !chatUsersActivity.sendMediaExpanded);
                    } else if (i == chatUsersActivity.sendStickersRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendStickers", R.string.UserRestrictionsSendStickers), !chatUsersActivity.defaultBannedRights.send_stickers, true, z31);
                    } else if (i == chatUsersActivity.embedLinksRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsEmbedLinks", R.string.UserRestrictionsEmbedLinks), !chatUsersActivity.defaultBannedRights.embed_links, true, z31);
                    } else if (i == chatUsersActivity.sendPollsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("UserRestrictionsSendPollsShort", R.string.UserRestrictionsSendPollsShort), !chatUsersActivity.defaultBannedRights.send_polls, true, false);
                    } else if (i == chatUsersActivity.manageTopicsRow) {
                        textCheckCell2.setTextAndCheck(LocaleController.getString("CreateTopicsPermission", R.string.CreateTopicsPermission), !chatUsersActivity.defaultBannedRights.manage_topics, false, z31);
                    }
                    if ((i == chatUsersActivity.pinMessagesRow || i == chatUsersActivity.changeInfoRow) && ChatObject.isDiscussionGroup(((BaseFragment) chatUsersActivity).currentAccount, chatUsersActivity.chatId)) {
                        textCheckCell2.setIcon(R.drawable.permission_locked);
                    } else if (!ChatObject.canBlockUsers(chatUsersActivity.currentChat)) {
                        textCheckCell2.setIcon(0);
                    } else if ((i == chatUsersActivity.addUsersRow && !ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 3)) || ((i == chatUsersActivity.pinMessagesRow && !ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 0)) || ((i == chatUsersActivity.changeInfoRow && !ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 1)) || ((i == chatUsersActivity.manageTopicsRow && !ChatObject.canManageTopics(chatUsersActivity.currentChat)) || (ChatObject.isPublic(chatUsersActivity.currentChat) && (i == chatUsersActivity.pinMessagesRow || i == chatUsersActivity.changeInfoRow)))))) {
                        textCheckCell2.setIcon(R.drawable.permission_locked);
                    } else {
                        textCheckCell2.setIcon(0);
                    }
                    break;
                case 8:
                    GraySectionCell graySectionCell = (GraySectionCell) view;
                    if (i != chatUsersActivity.membersHeaderRow) {
                        if (i == chatUsersActivity.botHeaderRow) {
                            graySectionCell.setText(LocaleController.getString("ChannelBots", R.string.ChannelBots));
                        } else if (i != chatUsersActivity.contactsHeaderRow) {
                            if (i == chatUsersActivity.loadingHeaderRow) {
                                graySectionCell.setText("");
                            }
                        } else if (ChatObject.isChannel(chatUsersActivity.currentChat) && !chatUsersActivity.currentChat.megagroup) {
                            graySectionCell.setText(LocaleController.getString("ChannelContacts", R.string.ChannelContacts));
                        } else {
                            graySectionCell.setText(LocaleController.getString("GroupContacts", R.string.GroupContacts));
                        }
                    } else if (ChatObject.isChannel(chatUsersActivity.currentChat) && !chatUsersActivity.currentChat.megagroup) {
                        graySectionCell.setText(LocaleController.getString("ChannelOtherSubscribers", R.string.ChannelOtherSubscribers));
                    } else {
                        graySectionCell.setText(LocaleController.getString("ChannelOtherMembers", R.string.ChannelOtherMembers));
                    }
                    break;
                case 11:
                    FlickerLoadingView flickerLoadingView = (FlickerLoadingView) view;
                    if (i6 != 0) {
                        flickerLoadingView.setItemsCount(1);
                    } else {
                        TLRPC.ChatFull chatFull5 = chatUsersActivity.info;
                        flickerLoadingView.setItemsCount(chatFull5 != null ? chatFull5.kicked_count : 1);
                    }
                    break;
                case 12:
                    TextCell textCell = (TextCell) view;
                    if (i == chatUsersActivity.antiSpamRow) {
                        textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 13) && ((chatFull2 = chatUsersActivity.info) == null || chatFull2.antispam || chatUsersActivity.getParticipantsCount() >= chatUsersActivity.getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string5 = LocaleController.getString("ChannelAntiSpam", R.string.ChannelAntiSpam);
                        TLRPC.ChatFull chatFull6 = chatUsersActivity.info;
                        if (chatFull6 != null && chatFull6.antispam) {
                            z26 = true;
                        }
                        textCell.setTextAndCheckAndIcon(R.drawable.msg_policy, string5, z26);
                    } else if (i == chatUsersActivity.hideMembersRow) {
                        textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(chatUsersActivity.currentChat, 2) && ((chatFull = chatUsersActivity.info) == null || chatFull.participants_hidden || chatUsersActivity.getParticipantsCount() >= chatUsersActivity.getMessagesController().hiddenMembersGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                        String string6 = LocaleController.getString(R.string.ChannelHideMembers);
                        TLRPC.ChatFull chatFull7 = chatUsersActivity.info;
                        textCell.setTextAndCheck(string6, chatFull7 != null && chatFull7.participants_hidden, false);
                    } else if (i == chatUsersActivity.tagsRow) {
                        textCell.getCheckBox().setIcon(0);
                        String string7 = LocaleController.getString(R.string.ChannelMemberTags);
                        TLRPC.Chat chat2 = chatUsersActivity.currentChat;
                        if (chat2 != null && (tL_chatBannedRights2 = chat2.default_banned_rights) != null && tL_chatBannedRights2.edit_rank) {
                            z27 = false;
                        }
                        textCell.setTextAndCheck(string7, z27, false);
                    }
                    break;
                case 13:
                    CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                    boolean z32 = checkBoxCell.getTag() != null && ((Integer) checkBoxCell.getTag()).intValue() == i;
                    checkBoxCell.setTag(Integer.valueOf(i));
                    if (i == chatUsersActivity.sendMediaPhotosRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionPhotos", R.string.SendMediaPermissionPhotos), "", !chatUsersActivity.defaultBannedRights.send_photos, true, z32);
                    } else if (i == chatUsersActivity.sendMediaVideosRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionVideos", R.string.SendMediaPermissionVideos), "", !chatUsersActivity.defaultBannedRights.send_videos, true, z32);
                    } else if (i == chatUsersActivity.sendMediaStickerGifsRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionStickersGifs", R.string.SendMediaPermissionStickersGifs), "", !chatUsersActivity.defaultBannedRights.send_stickers, true, z32);
                    } else if (i == chatUsersActivity.sendMediaMusicRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionMusic", R.string.SendMediaPermissionMusic), "", !chatUsersActivity.defaultBannedRights.send_audios, true, z32);
                    } else if (i == chatUsersActivity.sendMediaFilesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionFiles", R.string.SendMediaPermissionFiles), "", !chatUsersActivity.defaultBannedRights.send_docs, true, z32);
                    } else if (i == chatUsersActivity.sendMediaVoiceMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionVoice", R.string.SendMediaPermissionVoice), "", !chatUsersActivity.defaultBannedRights.send_voices, true, z32);
                    } else if (i == chatUsersActivity.sendMediaVideoMessagesRow) {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPermissionRound", R.string.SendMediaPermissionRound), "", !chatUsersActivity.defaultBannedRights.send_roundvideos, true, z32);
                    } else if (i == chatUsersActivity.sendMediaEmbededLinksRow) {
                        String string8 = LocaleController.getString("SendMediaEmbededLinks", R.string.SendMediaEmbededLinks);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights3 = chatUsersActivity.defaultBannedRights;
                        checkBoxCell.setText(string8, "", (tL_chatBannedRights3.embed_links || tL_chatBannedRights3.send_plain) ? false : true, true, z32);
                    } else if (i == chatUsersActivity.sendReactionsRow) {
                        checkBoxCell.setText(LocaleController.getString(R.string.UserRestrictionsSendReactions), "", !chatUsersActivity.defaultBannedRights.send_reactions, false, z32);
                    } else if (i != chatUsersActivity.sendPollsRow) {
                        checkBoxCell.setPad(1);
                    } else {
                        checkBoxCell.setText(LocaleController.getString("SendMediaPolls", R.string.SendMediaPolls), "", !chatUsersActivity.defaultBannedRights.send_polls, true, z32);
                    }
                    break;
                case 16:
                    TextCheckCell textCheckCell = (TextCheckCell) view;
                    if (i == chatUsersActivity.signMessagesRow) {
                        String string9 = LocaleController.getString(R.string.ChannelSignMessages);
                        boolean z33 = chatUsersActivity.signatures;
                        textCheckCell.setTextAndCheck(string9, z33, z33);
                    } else if (i == chatUsersActivity.signMessagesProfilesRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.ChannelSignMessagesWithProfile), chatUsersActivity.profiles, false);
                    } else if (i == chatUsersActivity.payRow) {
                        textCheckCell.setTextAndCheck(LocaleController.getString(R.string.GroupMessagesChargePrice), chatUsersActivity.enablePrice, false);
                    }
                    break;
                case 17:
                    SlideIntChooseView slideIntChooseView = (SlideIntChooseView) view;
                    if (i == chatUsersActivity.priceRow) {
                        int[] iArrCut = SlideIntChooseView.cut((int) chatUsersActivity.getMessagesController().starsPaidMessageAmountMax, new int[]{1, 10, 50, 100, 200, 250, 400, 500, 1000, 2500, 5000, 7500, 9000, 10000});
                        int iClamp = (int) Utilities.clamp(chatUsersActivity.starsPrice, chatUsersActivity.getMessagesController().starsPaidMessageAmountMax, 1L);
                        ChatActivity$$ExternalSyntheticLambda131 chatActivity$$ExternalSyntheticLambda131 = new ChatActivity$$ExternalSyntheticLambda131(7);
                        SlideIntChooseView.Options options = new SlideIntChooseView.Options();
                        options.steps = iArrCut;
                        options.betweenSteps = 20;
                        options.toString = chatActivity$$ExternalSyntheticLambda131;
                        slideIntChooseView.set(iClamp, options, new DialogCell$$ExternalSyntheticLambda6(this, i4));
                    }
                    break;
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textInfoPrivacyCell;
            int i2 = 2;
            int i3 = 1;
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            int i4 = 0;
            Context context = this.mContext;
            switch (i) {
                case 0:
                    int i5 = chatUsersActivity.type;
                    ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, (i5 == 0 || i5 == 3) ? 7 : 6, (i5 == 0 || i5 == 3) ? 6 : 2, chatUsersActivity.selectType == 0, null);
                    manageChatUserCell.setDelegate(new ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2(this, i2));
                    textInfoPrivacyCell = manageChatUserCell;
                    break;
                case 1:
                    textInfoPrivacyCell = new TextInfoPrivacyCell(context, 24, null);
                    break;
                case 2:
                    textInfoPrivacyCell = new ManageChatTextCell(context);
                    break;
                case 3:
                    textInfoPrivacyCell = new ShadowSectionCell(context, (Object) null);
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context, 24, null);
                    if (chatUsersActivity.isChannel) {
                        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.NoBlockedChannel2));
                        textInfoPrivacyCell = textInfoPrivacyCell2;
                    } else if (!chatUsersActivity.isCommunity) {
                        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.NoBlockedGroup2));
                        textInfoPrivacyCell = textInfoPrivacyCell2;
                    } else {
                        textInfoPrivacyCell2.setText(LocaleController.getString(R.string.NoBlockedCommunity2));
                        textInfoPrivacyCell = textInfoPrivacyCell2;
                    }
                    break;
                case 5:
                    HeaderCell headerCell = new HeaderCell(this.mContext, Theme.key_windowBackgroundWhiteBlueHeader, 21, 11, false);
                    headerCell.setHeight(43);
                    textInfoPrivacyCell = headerCell;
                    break;
                case 6:
                    textInfoPrivacyCell = new TextSettingsCell(context, 0, null);
                    break;
                case 7:
                case 14:
                    textInfoPrivacyCell = new TextCheckCell2(context);
                    break;
                case 8:
                    GraySectionCell graySectionCell = new GraySectionCell(context, 26, ((BaseFragment) chatUsersActivity).resourceProvider);
                    graySectionCell.setBackground(null);
                    textInfoPrivacyCell = graySectionCell;
                    break;
                case 9:
                default:
                    SlideChooseView slideChooseView = new SlideChooseView(context, null);
                    int i6 = chatUsersActivity.selectedSlowmode;
                    String string = LocaleController.getString("SlowmodeOff", R.string.SlowmodeOff);
                    int i7 = R.string.SlowmodeSeconds;
                    String string2 = LocaleController.formatString(i7, 5);
                    String string3 = LocaleController.formatString(i7, 10);
                    String string4 = LocaleController.formatString(i7, 30);
                    int i8 = R.string.SlowmodeMinutes;
                    slideChooseView.setOptions(i6, null, string, string2, string3, string4, LocaleController.formatString(i8, 1), LocaleController.formatString(i8, 5), LocaleController.formatString(i8, 15), LocaleController.formatString(R.string.SlowmodeHours, 1));
                    slideChooseView.setCallback(new ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2(this, i4));
                    textInfoPrivacyCell = slideChooseView;
                    break;
                case 10:
                    textInfoPrivacyCell = new LoadingCell(context, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(120.0f));
                    break;
                case 11:
                    FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
                    flickerLoadingView.setIsSingleCell(true);
                    flickerLoadingView.setViewType(6);
                    flickerLoadingView.showDate = false;
                    flickerLoadingView.setUseHeaderOffset(false);
                    flickerLoadingView.setPaddingLeft(AndroidUtilities.dp(5.0f));
                    RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, -1);
                    int iDp = AndroidUtilities.dp(12.0f);
                    ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = iDp;
                    ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = iDp;
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = AndroidUtilities.dp(30.0f);
                    flickerLoadingView.setLayoutParams(layoutParams);
                    textInfoPrivacyCell = flickerLoadingView;
                    break;
                case 12:
                    TextCell textCell = new TextCell(23, this.mContext, chatUsersActivity.getResourceProvider(), false, true);
                    textCell.heightDp = 50;
                    textInfoPrivacyCell = textCell;
                    break;
                case 13:
                    CheckBoxCell checkBoxCell = new CheckBoxCell(this.mContext, 4, 21, false, chatUsersActivity.getResourceProvider());
                    checkBoxCell.getCheckBoxRound().setDrawBackgroundAsArc(14);
                    checkBoxCell.getCheckBoxRound().checkBoxBase.setColor(Theme.key_switch2TrackChecked, Theme.key_radioBackground, Theme.key_checkboxCheck);
                    checkBoxCell.setEnabled(true);
                    textInfoPrivacyCell = checkBoxCell;
                    break;
                case 15:
                    SlideChooseView slideChooseView2 = new SlideChooseView(context, null);
                    Drawable drawable = chatUsersActivity.getParentActivity().getDrawable(R.drawable.mini_boost_profile_badge);
                    Activity parentActivity = chatUsersActivity.getParentActivity();
                    int i9 = R.drawable.mini_boost_profile_badge2;
                    Drawable[] drawableArr = {drawable, parentActivity.getDrawable(i9), chatUsersActivity.getParentActivity().getDrawable(i9), chatUsersActivity.getParentActivity().getDrawable(i9), chatUsersActivity.getParentActivity().getDrawable(i9)};
                    int i10 = chatUsersActivity.notRestrictBoosters;
                    slideChooseView2.setOptions(i10 > 0 ? i10 - 1 : 0, drawableArr, "1", "2", "3", "4", "5");
                    slideChooseView2.setCallback(new ChatUsersActivity$ListAdapter$$ExternalSyntheticLambda2(this, i3));
                    textInfoPrivacyCell = slideChooseView2;
                    break;
                case 16:
                    textInfoPrivacyCell = new TextCheckCell(21, context, chatUsersActivity.getResourceProvider(), false);
                    break;
                case 17:
                    textInfoPrivacyCell = new SlideIntChooseView(context, chatUsersActivity.getResourceProvider());
                    break;
            }
            return new RecyclerListView.Holder(textInfoPrivacyCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }
    }

    public final class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public int contactsStartRow;
        public int globalStartRow;
        public int groupStartRow;
        public final Context mContext;
        public final SearchAdapterHelper searchAdapterHelper;
        public boolean searchInProgress;
        public ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0 searchRunnable;
        public ArrayList searchResult = new ArrayList();
        public LongSparseArray searchResultMap = new LongSparseArray();
        public ArrayList searchResultNames = new ArrayList();
        public int totalCount = 0;

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.delegate = new ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda1(this);
        }

        public final TLObject getItem(int i) {
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size = searchAdapterHelper.groupSearch.size();
            if (size != 0) {
                int i2 = size + 1;
                if (i2 > i) {
                    if (i == 0) {
                        return null;
                    }
                    return (TLObject) searchAdapterHelper.groupSearch.get(i - 1);
                }
                i -= i2;
            }
            int size2 = this.searchResult.size();
            if (size2 != 0) {
                int i3 = size2 + 1;
                if (i3 > i) {
                    if (i == 0) {
                        return null;
                    }
                    return (TLObject) this.searchResult.get(i - 1);
                }
                i -= i3;
            }
            int size3 = searchAdapterHelper.globalSearch.size();
            if (size3 == 0 || size3 + 1 <= i || i == 0) {
                return null;
            }
            return (TLObject) searchAdapterHelper.globalSearch.get(i - 1);
        }

        @Override
        public final int getItemCount() {
            return this.totalCount;
        }

        @Override
        public final int getItemViewType(int i) {
            return (i == this.globalStartRow || i == this.groupStartRow || i == this.contactsStartRow) ? 1 : 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.mItemViewType != 1;
        }

        @Override
        public final void notifyDataSetChanged() {
            ChatActivity.AnonymousClass34 anonymousClass34;
            this.totalCount = 0;
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size = searchAdapterHelper.groupSearch.size();
            if (size != 0) {
                this.groupStartRow = 0;
                this.totalCount = size + 1 + this.totalCount;
            } else {
                this.groupStartRow = -1;
            }
            int size2 = this.searchResult.size();
            if (size2 != 0) {
                int i = this.totalCount;
                this.contactsStartRow = i;
                this.totalCount = size2 + 1 + i;
            } else {
                this.contactsStartRow = -1;
            }
            int size3 = searchAdapterHelper.globalSearch.size();
            if (size3 != 0) {
                int i2 = this.totalCount;
                this.globalStartRow = i2;
                this.totalCount = size3 + 1 + i2;
            } else {
                this.globalStartRow = -1;
            }
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            if (chatUsersActivity.searching && (anonymousClass34 = chatUsersActivity.listView) != null) {
                RecyclerView.Adapter adapter = anonymousClass34.getAdapter();
                SearchAdapter searchAdapter = chatUsersActivity.searchListViewAdapter;
                if (adapter != searchAdapter) {
                    ChatActivity.AnonymousClass34 anonymousClass35 = chatUsersActivity.listView;
                    anonymousClass35.animateEmptyView = true;
                    anonymousClass35.emptyViewAnimationType = 0;
                    anonymousClass35.setAdapter(searchAdapter);
                    chatUsersActivity.listView.setFastScrollVisible(false);
                    chatUsersActivity.listView.setVerticalScrollBarEnabled(true);
                }
            }
            this.mObservable.notifyChanged();
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLRPC.Chat chat;
            String publicUsername;
            TLRPC.User user;
            TLObject tLObject;
            String str;
            boolean z;
            CharSequence charSequence;
            ?? spannableStringBuilder;
            int size;
            int size2;
            CharSequence charSequence2;
            CharSequence charSequence3;
            TLObject user2;
            int i2 = viewHolder.mItemViewType;
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            View view = viewHolder.itemView;
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                GraySectionCell graySectionCell = (GraySectionCell) view;
                if (i != this.groupStartRow) {
                    if (i == this.globalStartRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.GlobalSearch));
                        return;
                    } else {
                        if (i == this.contactsStartRow) {
                            graySectionCell.setText(LocaleController.getString(R.string.Contacts));
                            return;
                        }
                        return;
                    }
                }
                int i3 = chatUsersActivity.type;
                if (i3 == 0) {
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelBlockedUsers));
                    return;
                }
                if (i3 == 3) {
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelRestrictedUsers));
                    return;
                } else if (chatUsersActivity.isChannel) {
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelSubscribers));
                    return;
                } else {
                    graySectionCell.setText(LocaleController.getString(R.string.ChannelMembers));
                    return;
                }
            }
            TLObject item = getItem(i);
            if (item instanceof TLRPC.User) {
                user2 = item;
                user2 = chat;
                user2 = item;
                user2 = user;
                user2 = item;
                publicUsername = null;
                tLObject = user2;
            } else {
                if (item instanceof TLRPC.ChannelParticipant) {
                    long peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) item).peer);
                    if (peerId >= 0) {
                        user = chatUsersActivity.getMessagesController().getUser(Long.valueOf(peerId));
                        if (user != null) {
                            user2 = item;
                            user2 = user;
                            publicUsername = UserObject.getPublicUsername(user);
                            tLObject = user;
                        }
                    } else {
                        chat = chatUsersActivity.getMessagesController().getChat(Long.valueOf(-peerId));
                        if (chat != null) {
                            user2 = item;
                            user2 = chat;
                            publicUsername = ChatObject.getPublicUsername(chat);
                            tLObject = chat;
                        }
                    }
                } else if (!(item instanceof TLRPC.ChatParticipant)) {
                    user2 = item;
                    return;
                } else {
                    user2 = item;
                    user2 = chatUsersActivity.getMessagesController().getUser(Long.valueOf(((TLRPC.ChatParticipant) item).user_id));
                }
                user2 = item;
                user2 = chat;
                user2 = item;
                user2 = user;
                user2 = item;
                publicUsername = null;
                tLObject = user2;
            }
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            int size3 = searchAdapterHelper.groupSearch.size();
            if (size3 == 0) {
                str = null;
                z = false;
            } else {
                int i4 = size3 + 1;
                if (i4 > i) {
                    str = searchAdapterHelper.lastFoundChannel;
                    z = true;
                } else {
                    i -= i4;
                    str = null;
                    z = false;
                }
            }
            if (z || (size2 = this.searchResult.size()) == 0) {
                charSequence = null;
                spannableStringBuilder = 0;
            } else {
                int i5 = size2 + 1;
                if (i5 > i) {
                    CharSequence charSequence4 = (CharSequence) this.searchResultNames.get(i - 1);
                    if (charSequence4 == null || TextUtils.isEmpty(publicUsername)) {
                        charSequence2 = null;
                        charSequence3 = charSequence4;
                    } else {
                        if (charSequence4.toString().startsWith("@" + publicUsername)) {
                            charSequence3 = null;
                            charSequence2 = charSequence4;
                        } else {
                            charSequence2 = null;
                            charSequence3 = charSequence4;
                        }
                    }
                    z = true;
                    charSequence = charSequence2;
                    spannableStringBuilder = charSequence3;
                } else {
                    i -= i5;
                    charSequence = null;
                    spannableStringBuilder = 0;
                }
            }
            CharSequence charSequence5 = charSequence;
            charSequence5 = charSequence;
            if (!z && publicUsername != null && (size = searchAdapterHelper.globalSearch.size()) != 0 && size + 1 > i) {
                String strSubstring = searchAdapterHelper.lastFoundUsername;
                if (strSubstring.startsWith("@")) {
                    charSequence5 = charSequence;
                    charSequence5 = charSequence;
                    strSubstring = strSubstring.substring(1);
                }
                try {
                    charSequence5 = charSequence;
                    charSequence5 = charSequence;
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) "@");
                    spannableStringBuilder2.append((CharSequence) publicUsername);
                    int iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(publicUsername, strSubstring);
                    charSequence5 = spannableStringBuilder2;
                    if (iIndexOfIgnoreCase != -1) {
                        int length = strSubstring.length();
                        if (iIndexOfIgnoreCase == 0) {
                            length++;
                        } else {
                            iIndexOfIgnoreCase++;
                        }
                        spannableStringBuilder2.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)), iIndexOfIgnoreCase, length + iIndexOfIgnoreCase, 33);
                        charSequence5 = spannableStringBuilder2;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    charSequence5 = publicUsername;
                }
            }
            if (str != null && publicUsername != null) {
                spannableStringBuilder = new SpannableStringBuilder(publicUsername);
                int iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(publicUsername, str);
                if (iIndexOfIgnoreCase2 != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false)), iIndexOfIgnoreCase2, str.length() + iIndexOfIgnoreCase2, 33);
                }
            }
            ?? r14 = (ManageChatUserCell) view;
            r14.setTag(Integer.valueOf(i));
            r14.setData(tLObject, spannableStringBuilder, charSequence5, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View graySectionCell;
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            if (i != 0) {
                graySectionCell = new GraySectionCell(this.mContext, 26, ((BaseFragment) chatUsersActivity).resourceProvider);
                graySectionCell.setBackground(null);
            } else {
                ManageChatUserCell manageChatUserCell = new ManageChatUserCell(this.mContext, 2, 2, chatUsersActivity.selectType == 0, null);
                manageChatUserCell.subtitleUsername = true;
                manageChatUserCell.setDelegate(new ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda1(this));
                graySectionCell = manageChatUserCell;
            }
            return new RecyclerListView.Holder(graySectionCell);
        }

        @Override
        public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ManageChatUserCell) {
                ((ManageChatUserCell) view).avatarImageView.getImageReceiver().cancelLoadImage();
            }
        }

        public final void searchUsers(String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            this.searchResult.clear();
            this.searchResultMap.clear();
            this.searchResultNames.clear();
            this.searchAdapterHelper.mergeResults(null, null);
            SearchAdapterHelper searchAdapterHelper = this.searchAdapterHelper;
            ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
            searchAdapterHelper.queryServerSearch(null, chatUsersActivity.type != 0, false, true, false, false, ChatObject.isChannel(chatUsersActivity.currentChat) ? ChatUsersActivity.this.chatId : 0L, false, ChatUsersActivity.this.type, 0, 0L, null);
            notifyDataSetChanged();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.searchInProgress = true;
            ChatUsersActivity.this.emptyView.showProgress(true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0 chatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0 = new ChatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0(this, str, 0);
            this.searchRunnable = chatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0;
            dispatchQueue.postRunnable(chatUsersActivity$SearchAdapter$$ExternalSyntheticLambda0, 300L);
        }
    }

    public ChatUsersActivity(Bundle bundle) {
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        super(bundle);
        this.defaultBannedRights = new TLRPC.TL_chatBannedRights();
        this.participants = new ArrayList();
        this.bots = new ArrayList();
        this.contacts = new ArrayList();
        this.participantsMap = new LongSparseArray();
        this.botsMap = new LongSparseArray();
        this.contactsMap = new LongSparseArray();
        this.initialStarsPrice = 10L;
        this.starsPrice = 10L;
        this.chatId = this.arguments.getLong("chat_id");
        this.type = this.arguments.getInt("type");
        this.transfer = this.arguments.getBoolean("transfer");
        this.needOpenSearch = this.arguments.getBoolean("open_search");
        this.selectType = this.arguments.getInt("selectType");
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat;
        boolean z = false;
        if (chat != null && (tL_chatBannedRights = chat.default_banned_rights) != null) {
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
            tL_chatBannedRights2.view_messages = tL_chatBannedRights.view_messages;
            tL_chatBannedRights2.send_stickers = tL_chatBannedRights.send_stickers;
            boolean z2 = tL_chatBannedRights.send_media;
            tL_chatBannedRights2.send_media = z2;
            tL_chatBannedRights2.embed_links = tL_chatBannedRights.embed_links;
            tL_chatBannedRights2.send_messages = tL_chatBannedRights.send_messages;
            tL_chatBannedRights2.send_games = tL_chatBannedRights.send_games;
            tL_chatBannedRights2.send_inline = tL_chatBannedRights.send_inline;
            tL_chatBannedRights2.send_gifs = tL_chatBannedRights.send_gifs;
            tL_chatBannedRights2.pin_messages = tL_chatBannedRights.pin_messages;
            tL_chatBannedRights2.edit_rank = tL_chatBannedRights.edit_rank;
            tL_chatBannedRights2.send_reactions = tL_chatBannedRights.send_reactions;
            tL_chatBannedRights2.send_polls = tL_chatBannedRights.send_polls;
            tL_chatBannedRights2.invite_users = tL_chatBannedRights.invite_users;
            tL_chatBannedRights2.manage_topics = tL_chatBannedRights.manage_topics;
            tL_chatBannedRights2.change_info = tL_chatBannedRights.change_info;
            tL_chatBannedRights2.manage_linked_peers = tL_chatBannedRights.manage_linked_peers;
            boolean z3 = tL_chatBannedRights.send_photos;
            tL_chatBannedRights2.send_photos = z3;
            boolean z4 = tL_chatBannedRights.send_videos;
            tL_chatBannedRights2.send_videos = z4;
            boolean z5 = tL_chatBannedRights.send_roundvideos;
            tL_chatBannedRights2.send_roundvideos = z5;
            boolean z6 = tL_chatBannedRights.send_audios;
            tL_chatBannedRights2.send_audios = z6;
            boolean z7 = tL_chatBannedRights.send_voices;
            tL_chatBannedRights2.send_voices = z7;
            boolean z8 = tL_chatBannedRights.send_docs;
            tL_chatBannedRights2.send_docs = z8;
            tL_chatBannedRights2.send_plain = tL_chatBannedRights.send_plain;
            if (!z2 && z8 && z7 && z6 && z5 && z4 && z3) {
                tL_chatBannedRights2.send_photos = false;
                tL_chatBannedRights2.send_videos = false;
                tL_chatBannedRights2.send_roundvideos = false;
                tL_chatBannedRights2.send_audios = false;
                tL_chatBannedRights2.send_voices = false;
                tL_chatBannedRights2.send_docs = false;
            }
        }
        this.initialBannedRights = ChatObject.getBannedRightsString(this.defaultBannedRights);
        boolean zIsCommunity = ChatObject.isCommunity(this.currentChat);
        this.isCommunity = zIsCommunity;
        if (ChatObject.isChannel(this.currentChat) && !this.currentChat.megagroup && !zIsCommunity) {
            z = true;
        }
        this.isChannel = z;
        this.isForum = ChatObject.isForum(this.currentChat);
        TLRPC.Chat chat2 = this.currentChat;
        if (chat2 != null) {
            boolean z9 = chat2.signatures;
            this.signatures = z9;
            this.initialSignatures = z9;
            boolean z10 = chat2.signature_profiles;
            this.profiles = z10;
            this.initialProfiles = z10;
        }
    }

    public static void access$12100(ChatUsersActivity chatUsersActivity, TLRPC.ChannelParticipant channelParticipant, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        LongSparseArray longSparseArray;
        int i = 0;
        while (i < 3) {
            if (i == 0) {
                longSparseArray = chatUsersActivity.contactsMap;
            } else {
                longSparseArray = i == 1 ? chatUsersActivity.botsMap : chatUsersActivity.participantsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(MessageObject.getPeerId(channelParticipant.peer));
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                channelParticipant2.admin_rights = tL_chatAdminRights;
                channelParticipant2.banned_rights = tL_chatBannedRights;
                channelParticipant = channelParticipant2;
            }
            i++;
        }
    }

    public static int getChannelAdminParticipantType(TLObject tLObject) {
        if ((tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_channelParticipantSelf)) {
            return 0;
        }
        return ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_channelParticipant)) ? 1 : 2;
    }

    public static int getSecondsForIndex(int i) {
        if (i == 1) {
            return 5;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 30;
        }
        if (i == 4) {
            return 60;
        }
        if (i == 5) {
            return 300;
        }
        if (i == 6) {
            return 900;
        }
        return i == 7 ? 3600 : 0;
    }

    public static int getSendMediaSelectedCount(TLRPC.TL_chatBannedRights tL_chatBannedRights) {
        int i = !tL_chatBannedRights.send_photos ? 1 : 0;
        if (!tL_chatBannedRights.send_videos) {
            i++;
        }
        if (!tL_chatBannedRights.send_stickers) {
            i++;
        }
        if (!tL_chatBannedRights.send_audios) {
            i++;
        }
        if (!tL_chatBannedRights.send_docs) {
            i++;
        }
        if (!tL_chatBannedRights.send_voices) {
            i++;
        }
        if (!tL_chatBannedRights.send_roundvideos) {
            i++;
        }
        if (!tL_chatBannedRights.embed_links && !tL_chatBannedRights.send_plain) {
            i++;
        }
        if (!tL_chatBannedRights.send_polls) {
            i++;
        }
        return !tL_chatBannedRights.send_reactions ? i + 1 : i;
    }

    @Override
    public final boolean canBeginSlide() {
        return checkDiscard$2(true);
    }

    public final boolean checkDiscard$2(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ChatUsersActivity.checkDiscard$2(boolean):boolean");
    }

    public final boolean createMenuForParticipant(TLObject tLObject, boolean z, View view) {
        int i;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        final long peerId;
        String str;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean zCanAddAdmins;
        int i2;
        final long j;
        long j2;
        int i3;
        int i4;
        String str2;
        boolean z2;
        if (tLObject == null || (i = this.selectType) != 0) {
            return false;
        }
        if (tLObject instanceof TLRPC.ChannelParticipant) {
            TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject;
            peerId = MessageObject.getPeerId(channelParticipant.peer);
            boolean z3 = channelParticipant.can_edit;
            tL_chatBannedRights = channelParticipant.banned_rights;
            tL_chatAdminRights = channelParticipant.admin_rights;
            i2 = channelParticipant.date;
            str = channelParticipant.rank;
            zCanAddAdmins = z3;
        } else {
            tL_chatBannedRights = null;
            if (tLObject instanceof TLRPC.ChatParticipant) {
                TLRPC.ChatParticipant chatParticipant = (TLRPC.ChatParticipant) tLObject;
                peerId = chatParticipant.user_id;
                i2 = chatParticipant.date;
                str = "";
                zCanAddAdmins = ChatObject.canAddAdmins(this.currentChat);
                tL_chatAdminRights = null;
            } else {
                peerId = 0;
                str = null;
                tL_chatAdminRights = null;
                zCanAddAdmins = false;
                i2 = 0;
            }
        }
        if (peerId == 0 || peerId == getUserConfig().getClientUserId()) {
            return false;
        }
        boolean z4 = this.isChannel;
        int i5 = this.type;
        if (i5 != 2) {
            TLRPC.TL_chatAdminRights tL_chatAdminRights2 = tL_chatAdminRights;
            TLRPC.TL_chatBannedRights tL_chatBannedRights2 = tL_chatBannedRights;
            ItemOptions itemOptions = new ItemOptions(this, view, false, true);
            if (i5 == 3 && ChatObject.canBlockUsers(this.currentChat)) {
                final long j3 = peerId;
                itemOptions.add(R.drawable.msg_permissions, LocaleController.getString(R.string.ChannelEditPermissions), new PhotoViewer$$ExternalSyntheticLambda177(this, j3, tL_chatBannedRights2, str, tLObject, 2), false);
                final int i6 = 0;
                itemOptions.add(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(this) {
                    public final ChatUsersActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                this.f$0.deletePeer(j3);
                                break;
                            case 1:
                                ChatUsersActivity chatUsersActivity = this.f$0;
                                long j4 = j3;
                                chatUsersActivity.deletePeer(j4);
                                chatUsersActivity.getMessagesController().addUserToChat(chatUsersActivity.chatId, chatUsersActivity.getMessagesController().getUser(Long.valueOf(j4)), 0, null, chatUsersActivity, null);
                                break;
                            case 2:
                                this.f$0.deletePeer(j3);
                                break;
                            default:
                                ChatUsersActivity chatUsersActivity2 = this.f$0;
                                MessagesController messagesController = chatUsersActivity2.getMessagesController();
                                long j5 = chatUsersActivity2.chatId;
                                MessagesController messagesController2 = chatUsersActivity2.getMessagesController();
                                long j6 = j3;
                                messagesController.setUserAdminRole(j5, messagesController2.getUser(Long.valueOf(j6)), new TLRPC.TL_chatAdminRights(), "", !chatUsersActivity2.isChannel, chatUsersActivity2, false, false, null, null);
                                chatUsersActivity2.removeParticipants(j6);
                                break;
                        }
                    }
                }, true);
            } else {
                String str3 = str;
                if (i5 == 0 && ChatObject.canBlockUsers(this.currentChat)) {
                    if (ChatObject.canAddUsers(this.currentChat) && peerId > 0 && !ChatObject.isCommunity(this.currentChat)) {
                        int i7 = R.drawable.msg_contact_add;
                        int i8 = z4 ? R.string.ChannelAddToChannel : R.string.ChannelAddToGroup;
                        final int i9 = 1;
                        itemOptions.add(i7, LocaleController.getString(i8), new Runnable(this) {
                            public final ChatUsersActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final void run() {
                                switch (i9) {
                                    case 0:
                                        this.f$0.deletePeer(peerId);
                                        break;
                                    case 1:
                                        ChatUsersActivity chatUsersActivity = this.f$0;
                                        long j4 = peerId;
                                        chatUsersActivity.deletePeer(j4);
                                        chatUsersActivity.getMessagesController().addUserToChat(chatUsersActivity.chatId, chatUsersActivity.getMessagesController().getUser(Long.valueOf(j4)), 0, null, chatUsersActivity, null);
                                        break;
                                    case 2:
                                        this.f$0.deletePeer(peerId);
                                        break;
                                    default:
                                        ChatUsersActivity chatUsersActivity2 = this.f$0;
                                        MessagesController messagesController = chatUsersActivity2.getMessagesController();
                                        long j5 = chatUsersActivity2.chatId;
                                        MessagesController messagesController2 = chatUsersActivity2.getMessagesController();
                                        long j6 = peerId;
                                        messagesController.setUserAdminRole(j5, messagesController2.getUser(Long.valueOf(j6)), new TLRPC.TL_chatAdminRights(), "", !chatUsersActivity2.isChannel, chatUsersActivity2, false, false, null, null);
                                        chatUsersActivity2.removeParticipants(j6);
                                        break;
                                }
                            }
                        }, false);
                    }
                    final int i10 = 2;
                    itemOptions.add(R.drawable.msg_delete, LocaleController.getString("ChannelDeleteFromList", R.string.ChannelDeleteFromList), new Runnable(this) {
                        public final ChatUsersActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i10) {
                                case 0:
                                    this.f$0.deletePeer(peerId);
                                    break;
                                case 1:
                                    ChatUsersActivity chatUsersActivity = this.f$0;
                                    long j4 = peerId;
                                    chatUsersActivity.deletePeer(j4);
                                    chatUsersActivity.getMessagesController().addUserToChat(chatUsersActivity.chatId, chatUsersActivity.getMessagesController().getUser(Long.valueOf(j4)), 0, null, chatUsersActivity, null);
                                    break;
                                case 2:
                                    this.f$0.deletePeer(peerId);
                                    break;
                                default:
                                    ChatUsersActivity chatUsersActivity2 = this.f$0;
                                    MessagesController messagesController = chatUsersActivity2.getMessagesController();
                                    long j5 = chatUsersActivity2.chatId;
                                    MessagesController messagesController2 = chatUsersActivity2.getMessagesController();
                                    long j6 = peerId;
                                    messagesController.setUserAdminRole(j5, messagesController2.getUser(Long.valueOf(j6)), new TLRPC.TL_chatAdminRights(), "", !chatUsersActivity2.isChannel, chatUsersActivity2, false, false, null, null);
                                    chatUsersActivity2.removeParticipants(j6);
                                    break;
                            }
                        }
                    }, true);
                } else if (i5 == 1 && ChatObject.canAddAdmins(this.currentChat) && zCanAddAdmins) {
                    if (this.currentChat.creator || !(tLObject instanceof TLRPC.TL_channelParticipantCreator)) {
                        j = peerId;
                        itemOptions.add(R.drawable.msg_admins, LocaleController.getString("EditAdminRights", R.string.EditAdminRights), new PhotoViewer$$ExternalSyntheticLambda177(this, j, tL_chatAdminRights2, str3, tLObject, 3), false);
                    } else {
                        j = peerId;
                    }
                    final int i11 = 3;
                    itemOptions.add(R.drawable.msg_remove, LocaleController.getString("ChannelRemoveUserAdmin", R.string.ChannelRemoveUserAdmin), new Runnable(this) {
                        public final ChatUsersActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run() {
                            switch (i11) {
                                case 0:
                                    this.f$0.deletePeer(j);
                                    break;
                                case 1:
                                    ChatUsersActivity chatUsersActivity = this.f$0;
                                    long j4 = j;
                                    chatUsersActivity.deletePeer(j4);
                                    chatUsersActivity.getMessagesController().addUserToChat(chatUsersActivity.chatId, chatUsersActivity.getMessagesController().getUser(Long.valueOf(j4)), 0, null, chatUsersActivity, null);
                                    break;
                                case 2:
                                    this.f$0.deletePeer(j);
                                    break;
                                default:
                                    ChatUsersActivity chatUsersActivity2 = this.f$0;
                                    MessagesController messagesController = chatUsersActivity2.getMessagesController();
                                    long j5 = chatUsersActivity2.chatId;
                                    MessagesController messagesController2 = chatUsersActivity2.getMessagesController();
                                    long j6 = j;
                                    messagesController.setUserAdminRole(j5, messagesController2.getUser(Long.valueOf(j6)), new TLRPC.TL_chatAdminRights(), "", !chatUsersActivity2.isChannel, chatUsersActivity2, false, false, null, null);
                                    chatUsersActivity2.removeParticipants(j6);
                                    break;
                            }
                        }
                    }, true);
                }
            }
            itemOptions.setScrimViewBackground(this.listView.getClipBackground(view, false));
            itemOptions.minWidthDp = 190;
            boolean z5 = itemOptions.getItemsCount() > 0;
            if (z || !z5) {
                return z5;
            }
            itemOptions.show();
            return true;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(peerId));
        boolean z6 = ChatObject.canAddAdmins(this.currentChat) && ((tLObject instanceof TLRPC.TL_channelParticipant) || (tLObject instanceof TLRPC.TL_channelParticipantBanned) || (tLObject instanceof TLRPC.TL_chatParticipant) || zCanAddAdmins);
        boolean z7 = tLObject instanceof TLRPC.TL_channelParticipantAdmin;
        boolean z8 = !(z7 || (tLObject instanceof TLRPC.TL_channelParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantCreator) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) || zCanAddAdmins;
        boolean z9 = z7 || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
        boolean z10 = ChatObject.canBlockUsers(this.currentChat) && z8 && !z4 && ChatObject.isChannel(this.currentChat) && !this.currentChat.gigagroup;
        if (i == 0) {
            z6 = (!UserObject.isDeleted(user)) & z6;
        }
        boolean z11 = z6 || (ChatObject.canBlockUsers(this.currentChat) && z8);
        if (z || !z11) {
            return z11;
        }
        int i12 = i2;
        boolean z12 = z10;
        ChatUsersActivity$$ExternalSyntheticLambda11 chatUsersActivity$$ExternalSyntheticLambda11 = new ChatUsersActivity$$ExternalSyntheticLambda11(this, peerId, i12, tLObject, tL_chatAdminRights, tL_chatBannedRights, str, z8);
        ItemOptions itemOptions2 = new ItemOptions(this, view, false, true);
        itemOptions2.setScrimViewBackground(this.listView.getClipBackground(view, false));
        int i13 = R.drawable.msg_admins;
        if (z9) {
            j2 = peerId;
            i3 = R.string.EditAdminRights;
        } else {
            j2 = peerId;
            i3 = R.string.SetAsAdmin;
        }
        itemOptions2.addIf(i13, LocaleController.getString(i3), new ChatActivity$$ExternalSyntheticLambda174(chatUsersActivity$$ExternalSyntheticLambda11, 23), z6);
        itemOptions2.addIf(R.drawable.msg_permissions, LocaleController.getString("ChangePermissions", R.string.ChangePermissions), new ChatUsersActivity$$ExternalSyntheticLambda13((Object) this, (Object) tLObject, (Object) user, (Object) chatUsersActivity$$ExternalSyntheticLambda11, 0), z12);
        boolean z13 = ChatObject.canBlockUsers(this.currentChat) && z8;
        int i14 = R.drawable.msg_remove;
        if (z4) {
            i4 = R.string.ChannelRemoveUser;
            str2 = "ChannelRemoveUser";
        } else {
            i4 = R.string.KickFromGroup;
            str2 = "KickFromGroup";
        }
        String string = LocaleController.getString(str2, i4);
        PollItemMenu$$ExternalSyntheticLambda12 pollItemMenu$$ExternalSyntheticLambda12 = new PollItemMenu$$ExternalSyntheticLambda12(this, user, j2, 8);
        if (z13) {
            z2 = true;
            itemOptions2.add(i14, string, pollItemMenu$$ExternalSyntheticLambda12, true);
        } else {
            z2 = true;
        }
        itemOptions2.minWidthDp = 190;
        itemOptions2.show();
        return z2;
    }

    @Override
    public final View createView(Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        int i = this.selectType;
        int i2 = this.type;
        if (i2 == 3) {
            this.actionBar.setTitle(LocaleController.getString("ChannelPermissions", R.string.ChannelPermissions));
        } else if (i2 == 0) {
            this.actionBar.setTitle(LocaleController.getString("ChannelBlacklist", R.string.ChannelBlacklist));
        } else if (i2 == 1) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChannelAdministrators));
        } else if (i2 == 2) {
            if (i == 0) {
                if (this.isChannel) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChannelSubscribers));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("ChannelMembers", R.string.ChannelMembers));
                }
            } else if (i == 1) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddAdmin", R.string.ChannelAddAdmin));
            } else if (i == 2) {
                this.actionBar.setTitle(LocaleController.getString("ChannelBlockUser", R.string.ChannelBlockUser));
            } else if (i == 3) {
                this.actionBar.setTitle(LocaleController.getString("ChannelAddException", R.string.ChannelAddException));
            }
        }
        this.actionBar.setActionBarMenuOnItemClick(new CallLogActivity.AnonymousClass1(this, 26));
        if (i != 0 || i2 == 2 || i2 == 0 || i2 == 3) {
            this.searchListViewAdapter = new SearchAdapter(context);
            ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
            ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
            actionBarMenuItemAddItem.setIsSearchField$1();
            actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 4);
            this.searchItem = actionBarMenuItemAddItem;
            if (i2 == 0 && !this.firstLoaded) {
                actionBarMenuItemAddItem.setVisibility(8);
            }
            if (i2 == 3) {
                this.searchItem.setSearchFieldHint(LocaleController.getString("ChannelSearchException", R.string.ChannelSearchException));
            } else {
                this.searchItem.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            }
            if (!ChatObject.isChannel(this.currentChat) && !this.currentChat.creator) {
                this.searchItem.setVisibility(8);
            }
            if (i2 == 3) {
                this.doneItem = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
            }
        } else if (i2 == 1 && ChatObject.isChannelAndNotMegaGroup(this.currentChat) && ChatObject.hasAdminRights(this.currentChat)) {
            this.doneItem = this.actionBar.createMenu().addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString("Done", R.string.Done), AndroidUtilities.dp(56.0f));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        FrameLayout frameLayout3 = new FrameLayout(context);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, null);
        this.flickerLoadingView = flickerLoadingView;
        flickerLoadingView.setViewType(6);
        FlickerLoadingView flickerLoadingView2 = this.flickerLoadingView;
        flickerLoadingView2.showDate = false;
        flickerLoadingView2.setUseHeaderOffset(false);
        FlickerLoadingView flickerLoadingView3 = this.flickerLoadingView;
        int i3 = Theme.key_actionBarDefaultSubmenuBackground;
        int i4 = Theme.key_listSelector;
        flickerLoadingView3.colorKey1 = i3;
        flickerLoadingView3.colorKey2 = i4;
        flickerLoadingView3.colorKey3 = i4;
        flickerLoadingView3.invalidate();
        frameLayout3.addView(this.flickerLoadingView, LayoutHelper.createFrame(-1, -1.0f, 0, 12.0f, 30.0f, 12.0f, 0.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.progressBar = radialProgressView;
        frameLayout3.addView(radialProgressView, LayoutHelper.createFrame(-2, -2, 17));
        this.flickerLoadingView.setVisibility(8);
        this.progressBar.setVisibility(8);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(1, null, context, frameLayout3);
        this.emptyView = stickerEmptyView;
        stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
        this.emptyView.subtitle.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
        this.emptyView.setVisibility(8);
        this.emptyView.setAnimateLayoutChange(true);
        this.emptyView.showProgress(true, false);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        this.emptyView.addView(frameLayout3, 0);
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, 6);
        this.listView = anonymousClass34;
        anonymousClass34.setSections();
        ChatActivity.AnonymousClass34 anonymousClass35 = this.listView;
        StickersActivity.AnonymousClass2 anonymousClass2 = new StickersActivity.AnonymousClass2(this, 3);
        this.layoutManager = anonymousClass2;
        anonymousClass35.setLayoutManager(anonymousClass2);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            public final AnimationNotificationsLocker notificationsLocker = new AnimationNotificationsLocker();

            @Override
            public final void onAllAnimationsDone() {
                this.notificationsLocker.unlock();
            }

            @Override
            public final void onChangeAnimationUpdate() {
                ChatUsersActivity.this.listView.invalidate();
            }

            @Override
            public final void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                ChatUsersActivity.this.listView.invalidate();
            }

            @Override
            public final void runPendingAnimations() {
                boolean zIsEmpty = this.mPendingRemovals.isEmpty();
                boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
                boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
                boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
                if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                    this.notificationsLocker.lock();
                }
                super.runPendingAnimations();
            }
        };
        defaultItemAnimator.setDurations(420L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        this.listView.setItemAnimator(defaultItemAnimator);
        ChatActivity.AnonymousClass34 anonymousClass36 = this.listView;
        anonymousClass36.animateEmptyView = true;
        anonymousClass36.emptyViewAnimationType = 0;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listViewAdapter = listAdapter;
        anonymousClass36.setAdapter(listAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setOnItemClickListener(new ChatUsersActivity$$ExternalSyntheticLambda2(this, 2));
        this.listView.setOnItemLongClickListener(new ChatUsersActivity$$ExternalSyntheticLambda2(this, 3));
        if (this.searchItem != null) {
            this.listView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 11));
        }
        UndoView undoView = new UndoView(context, null, false, null);
        this.undoView = undoView;
        frameLayout2.addView(undoView, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        updateRows$4();
        this.listView.setEmptyView(this.emptyView);
        ChatActivity.AnonymousClass34 anonymousClass37 = this.listView;
        anonymousClass37.animateEmptyView = false;
        anonymousClass37.emptyViewAnimationType = 0;
        if (this.needOpenSearch) {
            this.searchItem.openSearch(false);
        }
        return this.fragmentView;
    }

    public final void deletePeer(long j) {
        if (this.isCommunity) {
            TL_communities.TL_communities_toggleParticipantBanned tL_communities_toggleParticipantBanned = new TL_communities.TL_communities_toggleParticipantBanned();
            tL_communities_toggleParticipantBanned.participant = getMessagesController().getInputPeer(j);
            tL_communities_toggleParticipantBanned.community = getMessagesController().getInputChannel(this.chatId);
            tL_communities_toggleParticipantBanned.unban = true;
            getConnectionsManager().sendRequestTyped(tL_communities_toggleParticipantBanned, new AiTonesController$$ExternalSyntheticLambda0(), new CallLogActivity$$ExternalSyntheticLambda3(this, 15));
            return;
        }
        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
        tL_channels_editBanned.participant = getMessagesController().getInputPeer(j);
        tL_channels_editBanned.channel = getMessagesController().getInputChannel(this.chatId);
        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
        getConnectionsManager().sendRequest(tL_channels_editBanned, new CallLogActivity$$ExternalSyntheticLambda1(this, 15));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.chatInfoDidLoad) {
            if (i == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.chatId)) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getLastFragment() != this) {
                    removeSelfFromStack();
                    return;
                } else {
                    finishFragment();
                    return;
                }
            }
            return;
        }
        TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        if (chatFull.id == this.chatId) {
            if (zBooleanValue && ChatObject.isChannel(this.currentChat)) {
                return;
            }
            boolean z = this.info != null;
            this.info = chatFull;
            if (!z) {
                int currentSlowmode = getCurrentSlowmode();
                this.initialSlowmode = currentSlowmode;
                this.selectedSlowmode = currentSlowmode;
                int i3 = this.info.boosts_unrestrict;
                this.isEnabledNotRestrictBoosters = i3 > 0;
                this.notRestrictBoosters = i3;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                long j = chat == null ? 0L : chat.send_paid_messages_stars;
                boolean z2 = j > 0;
                this.enablePrice = z2;
                this.initialEnablePrice = z2;
                if (j <= 0) {
                    j = 10;
                }
                long jClamp = Utilities.clamp(j, getMessagesController().starsPaidMessageAmountMax, 1L);
                this.starsPrice = jClamp;
                this.initialStarsPrice = jClamp;
            }
            AndroidUtilities.runOnUIThread(new ChatUsersActivity$$ExternalSyntheticLambda0(this, 0));
        }
    }

    public final int getCurrentSlowmode() {
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.slowmode_seconds;
        if (i == 5) {
            return 1;
        }
        if (i == 10) {
            return 2;
        }
        if (i == 30) {
            return 3;
        }
        if (i == 60) {
            return 4;
        }
        if (i == 300) {
            return 5;
        }
        if (i == 900) {
            return 6;
        }
        return i == 3600 ? 7 : 0;
    }

    public final int getParticipantsCount() {
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull == null) {
            return 0;
        }
        int i = chatFull.participants_count;
        TLRPC.ChatParticipants chatParticipants = chatFull.participants;
        return (chatParticipants == null || (arrayList = chatParticipants.participants) == null) ? i : Math.max(i, arrayList.size());
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 11);
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{HeaderCell.class, ManageChatUserCell.class, ManageChatTextCell.class, TextCheckCell2.class, TextSettingsCell.class, SlideChooseView.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_windowBackgroundGrayShadow;
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_graySectionText));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switch2Track));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell2.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switch2TrackChecked));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        int i3 = Theme.key_windowBackgroundWhiteGrayText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, new String[]{"statusOnlineColor"}, null, null, -1, chatActivity$$ExternalSyntheticLambda94, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.undoView, 32, null, null, null, null, Theme.key_undo_background));
        int i4 = Theme.key_undo_cancelColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i4));
        int i5 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.undoView, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{ManageChatTextCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerEmptyView.class}, new String[]{"title"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{StickerEmptyView.class}, new String[]{"subtitle"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.title, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.emptyView.subtitle, 4, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{ManageChatUserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        return arrayList;
    }

    public final boolean hasNotRestrictBoostersChanges() {
        boolean z = this.isEnabledNotRestrictBoosters && isNotRestrictBoostersVisible();
        TLRPC.ChatFull chatFull = this.info;
        if (chatFull != null) {
            int i = chatFull.boosts_unrestrict;
            int i2 = this.notRestrictBoosters;
            if (i != i2 || ((z && i2 == 0) || (!z && i2 != 0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean isExpandableSendMediaRow$1(int i) {
        return i == this.sendMediaPhotosRow || i == this.sendMediaVideosRow || i == this.sendMediaStickerGifsRow || i == this.sendMediaMusicRow || i == this.sendMediaFilesRow || i == this.sendMediaVoiceMessagesRow || i == this.sendReactionsRow || i == this.sendMediaVideoMessagesRow || i == this.sendMediaEmbededLinksRow || i == this.sendPollsRow;
    }

    public final boolean isNotRestrictBoostersVisible() {
        TLRPC.Chat chat = this.currentChat;
        if (!chat.megagroup || chat.gigagroup || !ChatObject.canUserDoAdminAction(chat, 13)) {
            return false;
        }
        if (this.selectedSlowmode > 0) {
            return true;
        }
        TLRPC.TL_chatBannedRights tL_chatBannedRights = this.defaultBannedRights;
        return tL_chatBannedRights.send_plain || tL_chatBannedRights.send_media || tL_chatBannedRights.send_photos || tL_chatBannedRights.send_videos || tL_chatBannedRights.send_stickers || tL_chatBannedRights.send_audios || tL_chatBannedRights.send_docs || tL_chatBannedRights.send_voices || tL_chatBannedRights.send_roundvideos || tL_chatBannedRights.embed_links || tL_chatBannedRights.send_polls || tL_chatBannedRights.send_reactions;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$6(int i, View view) {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        View viewFindViewByPosition;
        TLObject tLObject;
        long j;
        long j2;
        boolean z;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        String str;
        final TLObject tLObject2;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        LongSparseArray longSparseArray;
        boolean zCanBlockUsers;
        final int i2 = 0;
        final int i3 = 1;
        boolean z2 = this.listView.getAdapter() == this.listViewAdapter;
        int i4 = this.signMessagesRow;
        LongSparseArray longSparseArray2 = this.participantsMap;
        LongSparseArray longSparseArray3 = this.contactsMap;
        boolean z3 = this.isChannel;
        int i5 = this.type;
        if (i == i4) {
            boolean z4 = !this.signatures;
            this.signatures = z4;
            ((TextCheckCell) view).setChecked(z4);
            AndroidUtilities.updateVisibleRows(this.listView);
            DiffCallback diffCallbackSaveState = saveState();
            updateRows$4();
            updateListAnimated(diffCallbackSaveState);
            this.listViewAdapter.notifyItemChanged(this.signMessagesInfoRow);
        } else if (i == this.signMessagesProfilesRow) {
            boolean z5 = !this.profiles;
            this.profiles = z5;
            ((TextCheckCell) view).setChecked(z5);
            AndroidUtilities.updateVisibleRows(this.listView);
            DiffCallback diffCallbackSaveState2 = saveState();
            updateRows$4();
            updateListAnimated(diffCallbackSaveState2);
            this.listViewAdapter.notifyItemChanged(this.signMessagesInfoRow);
        } else if (i == this.payRow) {
            boolean z6 = !this.enablePrice;
            this.enablePrice = z6;
            ((TextCheckCell) view).setChecked(z6);
            AndroidUtilities.updateVisibleRows(this.listView);
            DiffCallback diffCallbackSaveState3 = saveState();
            updateRows$4();
            updateListAnimated(diffCallbackSaveState3);
            this.listViewAdapter.notifyItemChanged(this.payRow);
        } else if (z2) {
            if (isExpandableSendMediaRow$1(i)) {
                CheckBoxCell checkBoxCell = (CheckBoxCell) view;
                if (i == this.sendMediaPhotosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights2 = this.defaultBannedRights;
                    tL_chatBannedRights2.send_photos = !tL_chatBannedRights2.send_photos;
                } else if (i == this.sendMediaVideosRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights3 = this.defaultBannedRights;
                    tL_chatBannedRights3.send_videos = !tL_chatBannedRights3.send_videos;
                } else if (i == this.sendMediaStickerGifsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights4 = this.defaultBannedRights;
                    boolean z7 = !tL_chatBannedRights4.send_stickers;
                    tL_chatBannedRights4.send_inline = z7;
                    tL_chatBannedRights4.send_gifs = z7;
                    tL_chatBannedRights4.send_games = z7;
                    tL_chatBannedRights4.send_stickers = z7;
                } else if (i == this.sendMediaMusicRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights5 = this.defaultBannedRights;
                    tL_chatBannedRights5.send_audios = !tL_chatBannedRights5.send_audios;
                } else if (i == this.sendMediaFilesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights6 = this.defaultBannedRights;
                    tL_chatBannedRights6.send_docs = !tL_chatBannedRights6.send_docs;
                } else if (i == this.sendMediaVoiceMessagesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights7 = this.defaultBannedRights;
                    tL_chatBannedRights7.send_voices = !tL_chatBannedRights7.send_voices;
                } else if (i == this.sendMediaVideoMessagesRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights8 = this.defaultBannedRights;
                    tL_chatBannedRights8.send_roundvideos = !tL_chatBannedRights8.send_roundvideos;
                } else if (i == this.sendMediaEmbededLinksRow) {
                    if (this.defaultBannedRights.send_plain && (viewFindViewByPosition = this.layoutManager.findViewByPosition(this.sendMessagesRow)) != null) {
                        AndroidUtilities.shakeViewSpring(viewFindViewByPosition);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                        return;
                    } else {
                        TLRPC.TL_chatBannedRights tL_chatBannedRights9 = this.defaultBannedRights;
                        tL_chatBannedRights9.embed_links = !tL_chatBannedRights9.embed_links;
                    }
                } else if (i == this.sendPollsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights10 = this.defaultBannedRights;
                    tL_chatBannedRights10.send_polls = !tL_chatBannedRights10.send_polls;
                } else if (i == this.sendReactionsRow) {
                    TLRPC.TL_chatBannedRights tL_chatBannedRights11 = this.defaultBannedRights;
                    tL_chatBannedRights11.send_reactions = !tL_chatBannedRights11.send_reactions;
                }
                checkBoxCell.setChecked(!checkBoxCell.isChecked(), true);
                AndroidUtilities.updateVisibleRows(this.listView);
                DiffCallback diffCallbackSaveState4 = saveState();
                updateRows$4();
                updateListAnimated(diffCallbackSaveState4);
            } else if (i == this.dontRestrictBoostersRow) {
                TextCheckCell2 textCheckCell2 = (TextCheckCell2) view;
                boolean z8 = !textCheckCell2.checkBox.isChecked;
                this.isEnabledNotRestrictBoosters = z8;
                textCheckCell2.setChecked(z8);
                AndroidUtilities.updateVisibleRows(this.listView);
                DiffCallback diffCallbackSaveState5 = saveState();
                updateRows$4();
                updateListAnimated(diffCallbackSaveState5);
            } else {
                if (i == this.addNewRow) {
                    if (i5 == 0 || i5 == 3) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", this.chatId);
                        bundle.putInt("type", 2);
                        bundle.putInt("selectType", i5 == 0 ? 2 : 3);
                        ChatUsersActivity chatUsersActivity = new ChatUsersActivity(bundle);
                        chatUsersActivity.setInfo(this.info);
                        TLRPC.TL_chatBannedRights tL_chatBannedRights12 = this.defaultBannedRights;
                        if (tL_chatBannedRights12 != null) {
                            chatUsersActivity.defaultBannedRights = tL_chatBannedRights12;
                        }
                        chatUsersActivity.delegate = new ChatUsersActivityDelegate() {
                            @Override
                            public final void didAddParticipantToList(long j3, TLObject tLObject3) {
                                ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                                if (chatUsersActivity2.participantsMap.get(j3) == null) {
                                    DiffCallback diffCallbackSaveState6 = chatUsersActivity2.saveState();
                                    ArrayList arrayList = chatUsersActivity2.participants;
                                    arrayList.add(tLObject3);
                                    chatUsersActivity2.participantsMap.put(tLObject3, j3);
                                    Collections.sort(arrayList, new ChatUsersActivity$$ExternalSyntheticLambda10(chatUsersActivity2, chatUsersActivity2.getConnectionsManager().getCurrentTime(), 0));
                                    chatUsersActivity2.updateListAnimated(diffCallbackSaveState6);
                                }
                            }

                            @Override
                            public final void didChangeOwner(TLRPC.User user) {
                            }

                            @Override
                            public final void didKickParticipant(long j3) {
                                ChatUsersActivity chatUsersActivity2 = ChatUsersActivity.this;
                                if (chatUsersActivity2.participantsMap.get(j3) == null) {
                                    DiffCallback diffCallbackSaveState6 = chatUsersActivity2.saveState();
                                    TLRPC.TL_channelParticipantBanned tL_channelParticipantBanned = new TLRPC.TL_channelParticipantBanned();
                                    if (j3 > 0) {
                                        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                        tL_channelParticipantBanned.peer = tL_peerUser;
                                        tL_peerUser.user_id = j3;
                                    } else {
                                        TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                                        tL_channelParticipantBanned.peer = tL_peerChannel;
                                        tL_peerChannel.channel_id = -j3;
                                    }
                                    tL_channelParticipantBanned.date = chatUsersActivity2.getConnectionsManager().getCurrentTime();
                                    tL_channelParticipantBanned.kicked_by = chatUsersActivity2.getAccountInstance().getUserConfig().clientUserId;
                                    chatUsersActivity2.info.kicked_count++;
                                    ArrayList arrayList = chatUsersActivity2.participants;
                                    arrayList.add(tL_channelParticipantBanned);
                                    chatUsersActivity2.participantsMap.put(tL_channelParticipantBanned, j3);
                                    Collections.sort(arrayList, new ChatUsersActivity$$ExternalSyntheticLambda10(chatUsersActivity2, chatUsersActivity2.getConnectionsManager().getCurrentTime(), 0));
                                    chatUsersActivity2.updateListAnimated(diffCallbackSaveState6);
                                }
                            }

                            @Override
                            public final void didSelectUser(long j3) {
                            }
                        };
                        presentFragment(chatUsersActivity);
                        return;
                    }
                    if (i5 == 1) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", this.chatId);
                        bundle2.putInt("type", 2);
                        bundle2.putInt("selectType", 1);
                        ChatUsersActivity chatUsersActivity2 = new ChatUsersActivity(bundle2);
                        chatUsersActivity2.delegate = new AnonymousClass7();
                        chatUsersActivity2.setInfo(this.info);
                        presentFragment(chatUsersActivity2);
                        return;
                    }
                    if (i5 == 2) {
                        Bundle bundleM = zzkw.m("addToGroup", true);
                        bundleM.putLong(z3 ? "channelId" : "chatId", this.currentChat.id);
                        GroupCreateActivity groupCreateActivity = new GroupCreateActivity(bundleM);
                        groupCreateActivity.info = this.info;
                        if (longSparseArray3 != null && longSparseArray3.size() != 0) {
                            longSparseArray2 = longSparseArray3;
                        }
                        groupCreateActivity.ignoreUsers = longSparseArray2;
                        groupCreateActivity.delegate2 = new AnonymousClass8(groupCreateActivity);
                        presentFragment(groupCreateActivity);
                        return;
                    }
                    return;
                }
                if (i == this.recentActionsRow) {
                    presentFragment(new ChannelAdminLogActivity(this.currentChat));
                    return;
                }
                if (i == this.antiSpamRow) {
                    final TextCell textCell = (TextCell) view;
                    TLRPC.ChatFull chatFull3 = this.info;
                    if (chatFull3 != null && !chatFull3.antispam && getParticipantsCount() < getMessagesController().telegramAntispamGroupSizeMin) {
                        BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.msg_antispam, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelAntiSpamForbidden", getMessagesController().telegramAntispamGroupSizeMin, new Object[0]))).show();
                        return;
                    }
                    if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 13) || this.antiSpamToggleLoading) {
                        return;
                    }
                    this.antiSpamToggleLoading = true;
                    final boolean z9 = this.info.antispam;
                    TLRPC.TL_channels_toggleAntiSpam tL_channels_toggleAntiSpam = new TLRPC.TL_channels_toggleAntiSpam();
                    tL_channels_toggleAntiSpam.channel = getMessagesController().getInputChannel(this.chatId);
                    TLRPC.ChatFull chatFull4 = this.info;
                    boolean z10 = true ^ chatFull4.antispam;
                    chatFull4.antispam = z10;
                    tL_channels_toggleAntiSpam.enabled = z10;
                    textCell.setChecked(z10);
                    textCell.getCheckBox().setIcon((ChatObject.canUserDoAdminAction(this.currentChat, 13) && ((chatFull2 = this.info) == null || chatFull2.antispam || getParticipantsCount() >= getMessagesController().telegramAntispamGroupSizeMin)) ? 0 : R.drawable.permission_locked);
                    getConnectionsManager().sendRequest(tL_channels_toggleAntiSpam, new RequestDelegate(this) {
                        public final ChatUsersActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i2) {
                                case 0:
                                    final ChatUsersActivity chatUsersActivity3 = this.f$0;
                                    if (tLObject3 != null) {
                                        chatUsersActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        chatUsersActivity3.getMessagesController().putChatFull(chatUsersActivity3.info);
                                    }
                                    if (tL_error != null) {
                                        chatUsersActivity3.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            final TextCell textCell2 = textCell;
                                            final boolean z11 = z9;
                                            final int i6 = 0;
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull5;
                                                    TLRPC.ChatFull chatFull6;
                                                    switch (i6) {
                                                        case 0:
                                                            ChatUsersActivity chatUsersActivity4 = chatUsersActivity3;
                                                            if (chatUsersActivity4.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull7 = chatUsersActivity4.info;
                                                                boolean z12 = z11;
                                                                chatFull7.antispam = z12;
                                                                TextCell textCell3 = textCell2;
                                                                textCell3.setChecked(z12);
                                                                textCell3.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity4.currentChat, 13) || ((chatFull5 = chatUsersActivity4.info) != null && chatFull5.antispam && chatUsersActivity4.getParticipantsCount() < chatUsersActivity4.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity4).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            ChatUsersActivity chatUsersActivity5 = chatUsersActivity3;
                                                            if (chatUsersActivity5.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull8 = chatUsersActivity5.info;
                                                                boolean z13 = z11;
                                                                chatFull8.participants_hidden = z13;
                                                                TextCell textCell4 = textCell2;
                                                                textCell4.setChecked(z13);
                                                                textCell4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity5.currentChat, 2) || ((chatFull6 = chatUsersActivity5.info) != null && chatFull6.participants_hidden && chatUsersActivity5.getParticipantsCount() < chatUsersActivity5.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity5).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    chatUsersActivity3.antiSpamToggleLoading = false;
                                    break;
                                default:
                                    final ChatUsersActivity chatUsersActivity4 = this.f$0;
                                    if (tLObject3 != null) {
                                        chatUsersActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        chatUsersActivity4.getMessagesController().putChatFull(chatUsersActivity4.info);
                                    }
                                    if (tL_error != null) {
                                        chatUsersActivity4.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            final TextCell textCell3 = textCell;
                                            final boolean z12 = z9;
                                            final int i7 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull5;
                                                    TLRPC.ChatFull chatFull6;
                                                    switch (i7) {
                                                        case 0:
                                                            ChatUsersActivity chatUsersActivity5 = chatUsersActivity4;
                                                            if (chatUsersActivity5.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull7 = chatUsersActivity5.info;
                                                                boolean z13 = z12;
                                                                chatFull7.antispam = z13;
                                                                TextCell textCell4 = textCell3;
                                                                textCell4.setChecked(z13);
                                                                textCell4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity5.currentChat, 13) || ((chatFull5 = chatUsersActivity5.info) != null && chatFull5.antispam && chatUsersActivity5.getParticipantsCount() < chatUsersActivity5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity5).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            ChatUsersActivity chatUsersActivity6 = chatUsersActivity4;
                                                            if (chatUsersActivity6.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull8 = chatUsersActivity6.info;
                                                                boolean z14 = z12;
                                                                chatFull8.participants_hidden = z14;
                                                                TextCell textCell5 = textCell3;
                                                                textCell5.setChecked(z14);
                                                                textCell5.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity6.currentChat, 2) || ((chatFull6 = chatUsersActivity6.info) != null && chatFull6.participants_hidden && chatUsersActivity6.getParticipantsCount() < chatUsersActivity6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity6).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    chatUsersActivity4.hideMembersToggleLoading = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i == this.hideMembersRow) {
                    final TextCell textCell2 = (TextCell) view;
                    if (getParticipantsCount() < getMessagesController().hiddenMembersGroupSizeMin) {
                        BulletinFactory.of(this).createSimpleBulletinWithIconSize(R.raw.contacts_sync_off, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("ChannelHiddenMembersForbidden", getMessagesController().hiddenMembersGroupSizeMin, new Object[0]))).show();
                        return;
                    }
                    if (this.info == null || !ChatObject.canUserDoAdminAction(this.currentChat, 2) || this.hideMembersToggleLoading) {
                        return;
                    }
                    this.hideMembersToggleLoading = true;
                    final boolean z11 = this.info.participants_hidden;
                    TLRPC.TL_channels_toggleParticipantsHidden tL_channels_toggleParticipantsHidden = new TLRPC.TL_channels_toggleParticipantsHidden();
                    tL_channels_toggleParticipantsHidden.channel = getMessagesController().getInputChannel(this.chatId);
                    TLRPC.ChatFull chatFull5 = this.info;
                    boolean z12 = !chatFull5.participants_hidden;
                    chatFull5.participants_hidden = z12;
                    tL_channels_toggleParticipantsHidden.enabled = z12;
                    textCell2.setChecked(z12);
                    Switch checkBox = textCell2.getCheckBox();
                    if (!ChatObject.canUserDoAdminAction(this.currentChat, 2) || ((chatFull = this.info) != null && !chatFull.participants_hidden && getParticipantsCount() < getMessagesController().hiddenMembersGroupSizeMin)) {
                        i2 = R.drawable.permission_locked;
                    }
                    checkBox.setIcon(i2);
                    getConnectionsManager().sendRequest(tL_channels_toggleParticipantsHidden, new RequestDelegate(this) {
                        public final ChatUsersActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                            switch (i3) {
                                case 0:
                                    final ChatUsersActivity chatUsersActivity3 = this.f$0;
                                    if (tLObject3 != null) {
                                        chatUsersActivity3.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        chatUsersActivity3.getMessagesController().putChatFull(chatUsersActivity3.info);
                                    }
                                    if (tL_error != null) {
                                        chatUsersActivity3.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            final TextCell textCell3 = textCell2;
                                            final boolean z13 = z11;
                                            final int i6 = 0;
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull6;
                                                    TLRPC.ChatFull chatFull7;
                                                    switch (i6) {
                                                        case 0:
                                                            ChatUsersActivity chatUsersActivity5 = chatUsersActivity3;
                                                            if (chatUsersActivity5.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull8 = chatUsersActivity5.info;
                                                                boolean z14 = z13;
                                                                chatFull8.antispam = z14;
                                                                TextCell textCell4 = textCell3;
                                                                textCell4.setChecked(z14);
                                                                textCell4.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity5.currentChat, 13) || ((chatFull6 = chatUsersActivity5.info) != null && chatFull6.antispam && chatUsersActivity5.getParticipantsCount() < chatUsersActivity5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity5).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            ChatUsersActivity chatUsersActivity6 = chatUsersActivity3;
                                                            if (chatUsersActivity6.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull9 = chatUsersActivity6.info;
                                                                boolean z15 = z13;
                                                                chatFull9.participants_hidden = z15;
                                                                TextCell textCell5 = textCell3;
                                                                textCell5.setChecked(z15);
                                                                textCell5.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity6.currentChat, 2) || ((chatFull7 = chatUsersActivity6.info) != null && chatFull7.participants_hidden && chatUsersActivity6.getParticipantsCount() < chatUsersActivity6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity6).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    chatUsersActivity3.antiSpamToggleLoading = false;
                                    break;
                                default:
                                    final ChatUsersActivity chatUsersActivity4 = this.f$0;
                                    if (tLObject3 != null) {
                                        chatUsersActivity4.getMessagesController().processUpdates((TLRPC.Updates) tLObject3, false);
                                        chatUsersActivity4.getMessagesController().putChatFull(chatUsersActivity4.info);
                                    }
                                    if (tL_error != null) {
                                        chatUsersActivity4.getClass();
                                        if (!"CHAT_NOT_MODIFIED".equals(tL_error.text)) {
                                            final TextCell textCell4 = textCell2;
                                            final boolean z14 = z11;
                                            final int i7 = 1;
                                            AndroidUtilities.runOnUIThread(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    TLRPC.ChatFull chatFull6;
                                                    TLRPC.ChatFull chatFull7;
                                                    switch (i7) {
                                                        case 0:
                                                            ChatUsersActivity chatUsersActivity5 = chatUsersActivity4;
                                                            if (chatUsersActivity5.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull8 = chatUsersActivity5.info;
                                                                boolean z15 = z14;
                                                                chatFull8.antispam = z15;
                                                                TextCell textCell5 = textCell4;
                                                                textCell5.setChecked(z15);
                                                                textCell5.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity5.currentChat, 13) || ((chatFull6 = chatUsersActivity5.info) != null && chatFull6.antispam && chatUsersActivity5.getParticipantsCount() < chatUsersActivity5.getMessagesController().telegramAntispamGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity5).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            ChatUsersActivity chatUsersActivity6 = chatUsersActivity4;
                                                            if (chatUsersActivity6.getParentActivity() != null) {
                                                                TLRPC.ChatFull chatFull9 = chatUsersActivity6.info;
                                                                boolean z16 = z14;
                                                                chatFull9.participants_hidden = z16;
                                                                TextCell textCell6 = textCell4;
                                                                textCell6.setChecked(z16);
                                                                textCell6.getCheckBox().setIcon((!ChatObject.canUserDoAdminAction(chatUsersActivity6.currentChat, 2) || ((chatFull7 = chatUsersActivity6.info) != null && chatFull7.participants_hidden && chatUsersActivity6.getParticipantsCount() < chatUsersActivity6.getMessagesController().hiddenMembersGroupSizeMin)) ? R.drawable.permission_locked : 0);
                                                                BulletinFactory.of(chatUsersActivity6).createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.getString("UnknownError", R.string.UnknownError)).show();
                                                                break;
                                                            }
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                    }
                                    chatUsersActivity4.hideMembersToggleLoading = false;
                                    break;
                            }
                        }
                    });
                    return;
                }
                if (i == this.tagsRow) {
                    if (this.currentChat == null) {
                        return;
                    }
                    final TextCell textCell3 = (TextCell) view;
                    final boolean zIsChecked = textCell3.isChecked();
                    textCell3.setChecked(!textCell3.isChecked());
                    TLRPC.TL_messages_editChatDefaultBannedRights tL_messages_editChatDefaultBannedRights = new TLRPC.TL_messages_editChatDefaultBannedRights();
                    tL_messages_editChatDefaultBannedRights.peer = MessagesController.getInputPeer(this.currentChat);
                    TLRPC.Chat chat = this.currentChat;
                    if (chat.default_banned_rights == null) {
                        chat.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    TLRPC.TL_chatBannedRights tL_chatBannedRights13 = this.currentChat.default_banned_rights;
                    tL_messages_editChatDefaultBannedRights.banned_rights = tL_chatBannedRights13;
                    tL_chatBannedRights13.edit_rank = !textCell3.isChecked();
                    getConnectionsManager().sendRequestTyped(tL_messages_editChatDefaultBannedRights, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                        @Override
                        public final void run(Object obj, Object obj2) {
                            TLRPC.Updates updates = (TLRPC.Updates) obj;
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                            ChatUsersActivity chatUsersActivity3 = this.f$0;
                            if (updates != null) {
                                chatUsersActivity3.getMessagesController().processUpdates(updates, false);
                                return;
                            }
                            chatUsersActivity3.getClass();
                            if (tL_error != null) {
                                textCell3.setChecked(zIsChecked);
                                BulletinFactory.of(chatUsersActivity3).showForError(false, tL_error);
                            }
                        }
                    });
                } else {
                    if (i == this.removedUsersRow) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("chat_id", this.chatId);
                        bundle3.putInt("type", 0);
                        ChatUsersActivity chatUsersActivity3 = new ChatUsersActivity(bundle3);
                        chatUsersActivity3.setInfo(this.info);
                        presentFragment(chatUsersActivity3);
                        return;
                    }
                    if (i == this.gigaConvertRow) {
                        showDialog(new AnonymousClass9(getParentActivity(), this));
                    } else {
                        if (i == this.addNew2Row) {
                            if (this.info != null) {
                                ManageLinksActivity manageLinksActivity = new ManageLinksActivity(this.chatId, 0L, 0);
                                TLRPC.ChatFull chatFull6 = this.info;
                                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull6.exported_invite;
                                manageLinksActivity.info = chatFull6;
                                manageLinksActivity.invite = tL_chatInviteExported;
                                manageLinksActivity.isPublic = ChatObject.isPublic(manageLinksActivity.currentChat);
                                manageLinksActivity.loadLinks(true);
                                presentFragment(manageLinksActivity);
                                return;
                            }
                            return;
                        }
                        if ((i > this.permissionsSectionRow && i <= Math.max(this.manageTopicsRow, this.changeInfoRow)) || i == this.manageLinkedPeersRow) {
                            TextCheckCell2 textCheckCell3 = (TextCheckCell2) view;
                            if (textCheckCell3.isEnabled()) {
                                Switch r3 = textCheckCell3.checkBox;
                                if (r3.iconDrawable != null) {
                                    if (ChatObject.isPublic(this.currentChat) && (i == this.pinMessagesRow || i == this.changeInfoRow)) {
                                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.EditCantEditPermissionsPublic, BulletinFactory.of(this), null);
                                        return;
                                    } else if (ChatObject.isDiscussionGroup(this.currentAccount, this.chatId) && (i == this.pinMessagesRow || i == this.changeInfoRow)) {
                                        UserNameResolver$$ExternalSyntheticOutline0.m(R.string.EditCantEditPermissionsDiscussion, BulletinFactory.of(this), null);
                                        return;
                                    } else {
                                        BulletinFactory.of(this).createErrorBulletin(LocaleController.getString("EditCantEditPermissions", R.string.EditCantEditPermissions), null).show();
                                        return;
                                    }
                                }
                                if (i == this.sendMediaRow) {
                                    DiffCallback diffCallbackSaveState6 = saveState();
                                    this.sendMediaExpanded = !this.sendMediaExpanded;
                                    AndroidUtilities.updateVisibleRows(this.listView);
                                    updateListAnimated(diffCallbackSaveState6);
                                    return;
                                }
                                textCheckCell3.setChecked(!r3.isChecked);
                                if (i == this.changeInfoRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights14 = this.defaultBannedRights;
                                    tL_chatBannedRights14.change_info = !tL_chatBannedRights14.change_info;
                                    return;
                                }
                                if (i == this.manageLinkedPeersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights15 = this.defaultBannedRights;
                                    tL_chatBannedRights15.manage_linked_peers = !tL_chatBannedRights15.manage_linked_peers;
                                    return;
                                }
                                if (i == this.addUsersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights16 = this.defaultBannedRights;
                                    tL_chatBannedRights16.invite_users = !tL_chatBannedRights16.invite_users;
                                    return;
                                }
                                if (i == this.manageTopicsRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights17 = this.defaultBannedRights;
                                    tL_chatBannedRights17.manage_topics = !tL_chatBannedRights17.manage_topics;
                                    return;
                                }
                                if (i == this.pinMessagesRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights18 = this.defaultBannedRights;
                                    tL_chatBannedRights18.pin_messages = !tL_chatBannedRights18.pin_messages;
                                    return;
                                }
                                if (i == this.editTagRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights19 = this.defaultBannedRights;
                                    tL_chatBannedRights19.edit_rank = !tL_chatBannedRights19.edit_rank;
                                    return;
                                }
                                if (i == this.sendMessagesRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights20 = this.defaultBannedRights;
                                    tL_chatBannedRights20.send_plain = !tL_chatBannedRights20.send_plain;
                                    int i6 = this.sendMediaEmbededLinksRow;
                                    if (i6 >= 0) {
                                        this.listViewAdapter.notifyItemChanged(i6);
                                    }
                                    int i7 = this.sendMediaRow;
                                    if (i7 >= 0) {
                                        this.listViewAdapter.notifyItemChanged(i7);
                                    }
                                    DiffCallback diffCallbackSaveState7 = saveState();
                                    updateRows$4();
                                    updateListAnimated(diffCallbackSaveState7);
                                    return;
                                }
                                if (i == this.sendMediaRow) {
                                    DiffCallback diffCallbackSaveState8 = saveState();
                                    this.sendMediaExpanded = !this.sendMediaExpanded;
                                    AndroidUtilities.updateVisibleRows(this.listView);
                                    updateListAnimated(diffCallbackSaveState8);
                                    return;
                                }
                                if (i == this.sendStickersRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights21 = this.defaultBannedRights;
                                    boolean z13 = !tL_chatBannedRights21.send_stickers;
                                    tL_chatBannedRights21.send_inline = z13;
                                    tL_chatBannedRights21.send_gifs = z13;
                                    tL_chatBannedRights21.send_games = z13;
                                    tL_chatBannedRights21.send_stickers = z13;
                                    return;
                                }
                                if (i == this.embedLinksRow) {
                                    TLRPC.TL_chatBannedRights tL_chatBannedRights22 = this.defaultBannedRights;
                                    tL_chatBannedRights22.embed_links = !tL_chatBannedRights22.embed_links;
                                    return;
                                } else {
                                    if (i == this.sendPollsRow) {
                                        TLRPC.TL_chatBannedRights tL_chatBannedRights23 = this.defaultBannedRights;
                                        tL_chatBannedRights23.send_polls = !tL_chatBannedRights23.send_polls;
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        }
                    }
                }
            }
        }
        if (z2) {
            TLObject item = this.listViewAdapter.getItem(i);
            if (item instanceof TLRPC.User) {
                tLObject2 = item;
                j2 = ((TLRPC.User) item).id;
                str = "";
                z = true;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else if (item instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) item;
                long peerId = MessageObject.getPeerId(channelParticipant.peer);
                TLRPC.TL_chatBannedRights tL_chatBannedRights24 = channelParticipant.banned_rights;
                TLRPC.TL_chatAdminRights tL_chatAdminRights2 = channelParticipant.admin_rights;
                String str2 = channelParticipant.rank;
                boolean z14 = !((channelParticipant instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant.can_edit;
                if ((item instanceof TLRPC.TL_channelParticipantCreator) && (tL_chatAdminRights2 = ((TLRPC.TL_channelParticipantCreator) item).admin_rights) == null) {
                    tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
                    tL_chatAdminRights2.manage_ranks = true;
                    tL_chatAdminRights2.add_admins = true;
                    tL_chatAdminRights2.pin_messages = true;
                    tL_chatAdminRights2.manage_topics = true;
                    tL_chatAdminRights2.invite_users = true;
                    tL_chatAdminRights2.ban_users = true;
                    tL_chatAdminRights2.delete_messages = true;
                    tL_chatAdminRights2.edit_messages = true;
                    tL_chatAdminRights2.post_messages = true;
                    tL_chatAdminRights2.change_info = true;
                    if (!z3) {
                        tL_chatAdminRights2.manage_call = true;
                    }
                }
                tL_chatAdminRights = tL_chatAdminRights2;
                tL_chatBannedRights = tL_chatBannedRights24;
                tLObject2 = item;
                z = z14;
                j2 = peerId;
                str = str2;
            } else if (item instanceof TLRPC.ChatParticipant) {
                long j3 = ((TLRPC.ChatParticipant) item).user_id;
                boolean z15 = this.currentChat.creator;
                if (item instanceof TLRPC.TL_chatParticipantCreator) {
                    TLRPC.TL_chatAdminRights tL_chatAdminRights3 = new TLRPC.TL_chatAdminRights();
                    tL_chatAdminRights3.manage_ranks = true;
                    tL_chatAdminRights3.add_admins = true;
                    tL_chatAdminRights3.pin_messages = true;
                    tL_chatAdminRights3.manage_topics = true;
                    tL_chatAdminRights3.invite_users = true;
                    tL_chatAdminRights3.ban_users = true;
                    tL_chatAdminRights3.delete_messages = true;
                    tL_chatAdminRights3.edit_messages = true;
                    tL_chatAdminRights3.post_messages = true;
                    tL_chatAdminRights3.change_info = true;
                    if (!z3) {
                        tL_chatAdminRights3.manage_call = true;
                    }
                    tL_chatAdminRights = tL_chatAdminRights3;
                    tL_chatBannedRights = null;
                } else {
                    tL_chatBannedRights = null;
                    tL_chatAdminRights = null;
                }
                tLObject2 = item;
                z = z15;
                str = "";
                j2 = j3;
            } else {
                str = "";
                z = false;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
                tLObject2 = item;
                j2 = 0;
            }
        } else {
            TLObject item2 = this.searchListViewAdapter.getItem(i);
            if (item2 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) item2;
                getMessagesController().putUser(user, false);
                long j4 = user.id;
                int i8 = 0;
                while (true) {
                    if (i8 >= 3) {
                        tLObject = null;
                        break;
                    }
                    if (i8 == 0) {
                        longSparseArray = longSparseArray3;
                    } else {
                        longSparseArray = i8 == 1 ? this.botsMap : longSparseArray2;
                    }
                    tLObject = (TLObject) longSparseArray.get(j4);
                    if (tLObject != null) {
                        break;
                    } else {
                        i8++;
                    }
                }
                j = j4;
            } else if ((item2 instanceof TLRPC.ChannelParticipant) || (item2 instanceof TLRPC.ChatParticipant)) {
                tLObject = item2;
                j = 0;
            } else {
                j = 0;
                tLObject = null;
            }
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.ChannelParticipant channelParticipant2 = (TLRPC.ChannelParticipant) tLObject;
                long peerId2 = MessageObject.getPeerId(channelParticipant2.peer);
                boolean z16 = !((channelParticipant2 instanceof TLRPC.TL_channelParticipantAdmin) || (channelParticipant2 instanceof TLRPC.TL_channelParticipantCreator)) || channelParticipant2.can_edit;
                TLObject tLObject3 = tLObject;
                tL_chatBannedRights = channelParticipant2.banned_rights;
                tLObject2 = tLObject3;
                tL_chatAdminRights = channelParticipant2.admin_rights;
                str = channelParticipant2.rank;
                z = z16;
                j2 = peerId2;
            } else if (tLObject instanceof TLRPC.ChatParticipant) {
                long j5 = ((TLRPC.ChatParticipant) tLObject).user_id;
                z = this.currentChat.creator;
                j2 = j5;
                str = "";
                tLObject2 = tLObject;
                tL_chatBannedRights = null;
                tL_chatAdminRights = null;
            } else {
                j2 = j;
                z = tLObject == null;
                tL_chatAdminRights = null;
                str = "";
                tLObject2 = tLObject;
                tL_chatBannedRights = null;
            }
        }
        if (j2 != 0) {
            int i9 = this.selectType;
            if (i9 != 0) {
                if (i9 != 3 && i9 != 1) {
                    if (ChatObject.isChannel(this.currentChat)) {
                        getMessagesController().deleteParticipantFromChat(this.chatId, getMessagesController().getUser(Long.valueOf(j2)));
                        ChatUsersActivityDelegate chatUsersActivityDelegate = this.delegate;
                        if (chatUsersActivityDelegate != null) {
                            chatUsersActivityDelegate.didKickParticipant(j2);
                        }
                        finishFragment();
                        return;
                    }
                    return;
                }
                if (i9 == 1 || !z || (!(tLObject2 instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject2 instanceof TLRPC.TL_chatParticipantAdmin))) {
                    openRightsEdit(j2, tLObject2, tL_chatAdminRights, tL_chatBannedRights, str, z, i9 == 1 ? 0 : 1, i9 == 1 || i9 == 3);
                    return;
                }
                TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(j2));
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
                String string = LocaleController.getString("AppName", R.string.AppName);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = string;
                alertDialog.message = LocaleController.formatString("AdminWillBeRemoved", R.string.AdminWillBeRemoved, UserObject.getUserName(user2));
                builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), new ChatUsersActivity$$ExternalSyntheticLambda26(this, user2, tLObject2, tL_chatAdminRights, tL_chatBannedRights, str, z));
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                showDialog(alertDialog);
                return;
            }
            if (i5 == 1) {
                if (j2 == getUserConfig().getClientUserId() || !(this.currentChat.creator || z)) {
                    zCanBlockUsers = false;
                } else {
                    zCanBlockUsers = true;
                }
            } else if (i5 == 0 || i5 == 3) {
                zCanBlockUsers = ChatObject.canBlockUsers(this.currentChat);
            } else {
                zCanBlockUsers = false;
            }
            if (i5 == 0 || ((i5 != 1 && z3) || (i5 == 2 && i9 == 0))) {
                if (j2 == getUserConfig().getClientUserId()) {
                    return;
                }
                Bundle bundle4 = new Bundle();
                if (j2 > 0) {
                    bundle4.putLong("user_id", j2);
                } else {
                    bundle4.putLong("chat_id", -j2);
                }
                presentFragment(new ProfileActivity(bundle4, null));
                return;
            }
            if (tL_chatBannedRights == null) {
                tL_chatBannedRights = new TLRPC.TL_chatBannedRights();
                tL_chatBannedRights.view_messages = true;
                tL_chatBannedRights.send_stickers = true;
                tL_chatBannedRights.send_media = true;
                tL_chatBannedRights.send_photos = true;
                tL_chatBannedRights.send_videos = true;
                tL_chatBannedRights.send_roundvideos = true;
                tL_chatBannedRights.send_audios = true;
                tL_chatBannedRights.send_voices = true;
                tL_chatBannedRights.send_docs = true;
                tL_chatBannedRights.embed_links = true;
                tL_chatBannedRights.send_plain = true;
                tL_chatBannedRights.send_messages = true;
                tL_chatBannedRights.send_games = true;
                tL_chatBannedRights.send_inline = true;
                tL_chatBannedRights.send_gifs = true;
                tL_chatBannedRights.pin_messages = true;
                tL_chatBannedRights.edit_rank = true;
                tL_chatBannedRights.send_reactions = true;
                tL_chatBannedRights.send_polls = true;
                tL_chatBannedRights.invite_users = true;
                tL_chatBannedRights.manage_topics = true;
                tL_chatBannedRights.change_info = true;
            }
            ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j2, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights, str, i5 == 1 ? 0 : 1, zCanBlockUsers, tLObject2 == null, null);
            chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
                @Override
                public final void didChangeOwner(TLRPC.User user3) {
                    ChatUsersActivity.this.onOwnerChaged(user3);
                }

                @Override
                public final void didSetRights(int i10, TLRPC.TL_chatAdminRights tL_chatAdminRights4, TLRPC.TL_chatBannedRights tL_chatBannedRights25, String str3) {
                    TLObject tLObject4 = tLObject2;
                    if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                        TLRPC.ChannelParticipant channelParticipant3 = (TLRPC.ChannelParticipant) tLObject4;
                        channelParticipant3.admin_rights = tL_chatAdminRights4;
                        channelParticipant3.banned_rights = tL_chatBannedRights25;
                        channelParticipant3.rank = str3;
                        ChatUsersActivity.access$12100(ChatUsersActivity.this, channelParticipant3, tL_chatAdminRights4, tL_chatBannedRights25);
                    }
                }
            };
            presentFragment(chatRightsEditActivity);
        }
    }

    public final void lambda$processDone$28(long j) {
        if (j != 0) {
            this.chatId = j;
            this.currentChat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j));
            processDone$7();
        }
    }

    public final void loadChatParticipants$1() {
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList arrayList = this.bots;
        ArrayList arrayList2 = this.contacts;
        ArrayList arrayList3 = this.participants;
        boolean z = this.isCommunity;
        int i = this.type;
        LongSparseArray longSparseArray = this.botsMap;
        LongSparseArray longSparseArray2 = this.contactsMap;
        LongSparseArray longSparseArray3 = this.participantsMap;
        int i2 = 0;
        if (z && i == 2) {
            this.loadingUsers = false;
            arrayList3.clear();
            arrayList.clear();
            arrayList2.clear();
            longSparseArray3.clear();
            longSparseArray2.clear();
            longSparseArray.clear();
            HashMap<String, ArrayList<TLRPC.TL_contact>> map = ContactsController.getInstance(this.currentAccount).usersSectionsDict;
            ArrayList<String> arrayList4 = ContactsController.getInstance(this.currentAccount).sortedUsersSectionsArray;
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                String str = arrayList4.get(i3);
                i3++;
                ArrayList<TLRPC.TL_contact> arrayList5 = map.get(str);
                int size2 = arrayList5.size();
                int i4 = 0;
                while (i4 < size2) {
                    TLRPC.TL_contact tL_contact = arrayList5.get(i4);
                    i4++;
                    arrayList3.add(getMessagesController().getUser(Long.valueOf(tL_contact.user_id)));
                }
            }
            updateRows$4();
            ListAdapter listAdapter = this.listViewAdapter;
            if (listAdapter != null) {
                listAdapter.mObservable.notifyChanged();
                return;
            }
            return;
        }
        if (ChatObject.isChannel(this.currentChat)) {
            this.loadingUsers = true;
            StickerEmptyView stickerEmptyView = this.emptyView;
            if (stickerEmptyView != null) {
                stickerEmptyView.showProgress(true, false);
            }
            ListAdapter listAdapter2 = this.listViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.mObservable.notifyChanged();
            }
            ArrayList arrayListLoadChatParticipantsRequests = loadChatParticipantsRequests();
            ArrayList arrayList6 = new ArrayList();
            ChatActivity$$ExternalSyntheticLambda102 chatActivity$$ExternalSyntheticLambda102 = new ChatActivity$$ExternalSyntheticLambda102(this, arrayListLoadChatParticipantsRequests, arrayList6, 28);
            AtomicInteger atomicInteger = new AtomicInteger(0);
            for (int i5 = 0; i5 < arrayListLoadChatParticipantsRequests.size(); i5++) {
                arrayList6.add(null);
                getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest((TLObject) arrayListLoadChatParticipantsRequests.get(i5), new GroupCallSheet$$ExternalSyntheticLambda0(arrayList6, i5, atomicInteger, arrayListLoadChatParticipantsRequests, chatActivity$$ExternalSyntheticLambda102, 5)), this.classGuid);
            }
            return;
        }
        this.loadingUsers = false;
        arrayList3.clear();
        arrayList.clear();
        arrayList2.clear();
        longSparseArray3.clear();
        longSparseArray2.clear();
        longSparseArray.clear();
        if (i == 1) {
            TLRPC.ChatFull chatFull2 = this.info;
            if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                int size3 = chatParticipants.participants.size();
                while (i2 < size3) {
                    TLRPC.ChatParticipant chatParticipant = this.info.participants.participants.get(i2);
                    if ((chatParticipant instanceof TLRPC.TL_chatParticipantCreator) || (chatParticipant instanceof TLRPC.TL_chatParticipantAdmin)) {
                        arrayList3.add(chatParticipant);
                    }
                    longSparseArray3.put(chatParticipant, chatParticipant.user_id);
                    i2++;
                }
            }
        } else if (i == 2 && (chatFull = this.info) != null && chatFull.participants != null) {
            long j = getUserConfig().clientUserId;
            int size4 = this.info.participants.participants.size();
            while (i2 < size4) {
                TLRPC.ChatParticipant chatParticipant2 = this.info.participants.participants.get(i2);
                int i6 = this.selectType;
                if (i6 == 0 || chatParticipant2.user_id != j) {
                    if (i6 == 1) {
                        if (getContactsController().isContact(chatParticipant2.user_id)) {
                            arrayList2.add(chatParticipant2);
                            longSparseArray2.put(chatParticipant2, chatParticipant2.user_id);
                        } else if (!UserObject.isDeleted(getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id)))) {
                            arrayList3.add(chatParticipant2);
                            longSparseArray3.put(chatParticipant2, chatParticipant2.user_id);
                        }
                    } else if (getContactsController().isContact(chatParticipant2.user_id)) {
                        arrayList2.add(chatParticipant2);
                        longSparseArray2.put(chatParticipant2, chatParticipant2.user_id);
                    } else {
                        TLRPC.User user = getMessagesController().getUser(Long.valueOf(chatParticipant2.user_id));
                        if (user == null || !user.bot) {
                            arrayList3.add(chatParticipant2);
                            longSparseArray3.put(chatParticipant2, chatParticipant2.user_id);
                        } else {
                            arrayList.add(chatParticipant2);
                            longSparseArray.put(chatParticipant2, chatParticipant2.user_id);
                        }
                    }
                }
                i2++;
            }
        }
        ListAdapter listAdapter3 = this.listViewAdapter;
        if (listAdapter3 != null) {
            listAdapter3.mObservable.notifyChanged();
        }
        updateRows$4();
        ListAdapter listAdapter4 = this.listViewAdapter;
        if (listAdapter4 != null) {
            listAdapter4.mObservable.notifyChanged();
        }
    }

    public final ArrayList loadChatParticipantsRequests() {
        TLRPC.Chat chat;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_channels_getParticipants);
        tL_channels_getParticipants.channel = getMessagesController().getInputChannel(this.chatId);
        int i = this.type;
        if (i == 0) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsKicked();
        } else if (i == 1) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsAdmins();
        } else if (i == 2) {
            TLRPC.ChatFull chatFull = this.info;
            if (chatFull != null && chatFull.participants_count <= 200 && (chat = this.currentChat) != null && chat.megagroup) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else if (this.selectType == 1) {
                if (this.contactsEndReached) {
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
                } else {
                    this.delayResults = 2;
                    tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                    this.contactsEndReached = true;
                    arrayList.addAll(loadChatParticipantsRequests());
                }
            } else if (!this.contactsEndReached) {
                this.delayResults = 3;
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsContacts();
                this.contactsEndReached = true;
                arrayList.addAll(loadChatParticipantsRequests());
            } else if (this.botsEndReached) {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsRecent();
            } else {
                tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBots();
                this.botsEndReached = true;
                arrayList.addAll(loadChatParticipantsRequests());
            }
        } else if (i == 3) {
            tL_channels_getParticipants.filter = new TLRPC.TL_channelParticipantsBanned();
        }
        tL_channels_getParticipants.filter.q = "";
        tL_channels_getParticipants.offset = 0;
        tL_channels_getParticipants.limit = 200;
        return arrayList;
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return checkDiscard$2(z);
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, true);
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        if (this.loadingUsers) {
            return true;
        }
        this.contactsEndReached = false;
        this.botsEndReached = false;
        loadChatParticipants$1();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.chatInfoDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
        this.undoView.setTranslationY(-i4);
    }

    public final void onOwnerChaged(TLRPC.User user) {
        ArrayList arrayList;
        LongSparseArray longSparseArray;
        boolean z;
        UndoView undoView = this.undoView;
        long j = -this.chatId;
        boolean z2 = this.isChannel;
        undoView.showWithAction(j, z2 ? 9 : 10, user, (Object) null, (Runnable) null, (Runnable) null);
        this.currentChat.creator = false;
        int i = 0;
        boolean z3 = false;
        while (true) {
            arrayList = this.participants;
            longSparseArray = this.participantsMap;
            if (i >= 3) {
                break;
            }
            boolean z4 = true;
            if (i == 0) {
                arrayList = this.contacts;
                longSparseArray = this.contactsMap;
            } else if (i == 1) {
                arrayList = this.bots;
                longSparseArray = this.botsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(user.id);
            if (tLObject instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator = new TLRPC.TL_channelParticipantCreator();
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_channelParticipantCreator.peer = tL_peerUser;
                long j2 = user.id;
                tL_peerUser.user_id = j2;
                longSparseArray.put(tL_channelParticipantCreator, j2);
                int iIndexOf = arrayList.indexOf(tLObject);
                if (iIndexOf >= 0) {
                    arrayList.set(iIndexOf, tL_channelParticipantCreator);
                }
                z3 = true;
                z = true;
            } else {
                z = false;
            }
            long clientUserId = getUserConfig().getClientUserId();
            TLObject tLObject2 = (TLObject) longSparseArray.get(clientUserId);
            if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                TLRPC.TL_channelParticipantAdmin tL_channelParticipantAdmin = new TLRPC.TL_channelParticipantAdmin();
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_channelParticipantAdmin.peer = tL_peerUser2;
                tL_peerUser2.user_id = clientUserId;
                tL_channelParticipantAdmin.self = true;
                tL_channelParticipantAdmin.inviter_id = clientUserId;
                tL_channelParticipantAdmin.promoted_by = clientUserId;
                tL_channelParticipantAdmin.date = (int) (System.currentTimeMillis() / 1000);
                TLRPC.TL_chatAdminRights tL_chatAdminRights = new TLRPC.TL_chatAdminRights();
                tL_channelParticipantAdmin.admin_rights = tL_chatAdminRights;
                tL_chatAdminRights.add_admins = true;
                tL_chatAdminRights.manage_ranks = true;
                tL_chatAdminRights.pin_messages = true;
                tL_chatAdminRights.manage_topics = true;
                tL_chatAdminRights.invite_users = true;
                tL_chatAdminRights.ban_users = true;
                tL_chatAdminRights.delete_messages = true;
                tL_chatAdminRights.edit_messages = true;
                tL_chatAdminRights.post_messages = true;
                tL_chatAdminRights.change_info = true;
                if (!z2) {
                    tL_chatAdminRights.manage_call = true;
                }
                longSparseArray.put(tL_channelParticipantAdmin, clientUserId);
                int iIndexOf2 = arrayList.indexOf(tLObject2);
                if (iIndexOf2 >= 0) {
                    arrayList.set(iIndexOf2, tL_channelParticipantAdmin);
                }
            } else {
                z4 = z;
            }
            if (z4) {
                Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(9));
            }
            i++;
        }
        if (!z3) {
            TLRPC.TL_channelParticipantCreator tL_channelParticipantCreator2 = new TLRPC.TL_channelParticipantCreator();
            TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
            tL_channelParticipantCreator2.peer = tL_peerUser3;
            long j3 = user.id;
            tL_peerUser3.user_id = j3;
            longSparseArray.put(tL_channelParticipantCreator2, j3);
            arrayList.add(tL_channelParticipantCreator2);
            Collections.sort(arrayList, new ChatActivity$$ExternalSyntheticLambda18(8));
            updateRows$4();
        }
        this.listViewAdapter.mObservable.notifyChanged();
        ChatUsersActivityDelegate chatUsersActivityDelegate = this.delegate;
        if (chatUsersActivityDelegate != null) {
            chatUsersActivityDelegate.didChangeOwner(user);
        }
    }

    @Override
    public final void onPause() {
        super.onPause();
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(0, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        ListAdapter listAdapter = this.listViewAdapter;
        if (listAdapter != null) {
            listAdapter.mObservable.notifyChanged();
        }
        StickerEmptyView stickerEmptyView = this.emptyView;
        if (stickerEmptyView != null) {
            stickerEmptyView.requestLayout();
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            this.openTransitionStarted = true;
        }
        if (z && !z2 && this.needOpenSearch) {
            this.searchItem.getSearchField().requestFocus();
            AndroidUtilities.showKeyboard(this.searchItem.getSearchField());
            this.searchItem.setVisibility(8);
        }
    }

    public final void openRightsEdit(final long j, final TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z, int i, final boolean z2) {
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(j, this.chatId, tL_chatAdminRights, this.defaultBannedRights, tL_chatBannedRights, str, i, z, tLObject == null, null);
        chatRightsEditActivity.delegate = new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public final void didChangeOwner(TLRPC.User user) {
                ChatUsersActivity.this.onOwnerChaged(user);
            }

            @Override
            public final void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights2, TLRPC.TL_chatBannedRights tL_chatBannedRights2, String str2) {
                TLObject tLObject2 = tLObject;
                if (tLObject2 instanceof TLRPC.ChannelParticipant) {
                    TLRPC.ChannelParticipant channelParticipant = (TLRPC.ChannelParticipant) tLObject2;
                    channelParticipant.admin_rights = tL_chatAdminRights2;
                    channelParticipant.banned_rights = tL_chatBannedRights2;
                    channelParticipant.rank = str2;
                }
                ChatUsersActivity chatUsersActivity = ChatUsersActivity.this;
                ChatUsersActivityDelegate chatUsersActivityDelegate = chatUsersActivity.delegate;
                long j2 = j;
                if (chatUsersActivityDelegate != null && i2 == 1) {
                    chatUsersActivityDelegate.didSelectUser(j2);
                } else if (chatUsersActivityDelegate != null) {
                    chatUsersActivityDelegate.didAddParticipantToList(j2, tLObject2);
                }
                if (z2) {
                    chatUsersActivity.removeSelfFromStack();
                }
            }
        };
        presentFragment(chatRightsEditActivity, z2);
    }

    public final void processDone$7() {
        boolean z;
        TLRPC.ChatFull chatFull;
        boolean z2 = false;
        int i = this.type;
        if (i == 3) {
            TLRPC.Chat chat = this.currentChat;
            if (chat.creator && !ChatObject.isChannel(chat) && ((this.selectedSlowmode != this.initialSlowmode || this.enablePrice) && this.info != null)) {
                MessagesController.getInstance(this.currentAccount).convertToMegaGroup(getParentActivity(), this.chatId, this, new ChatUsersActivity$$ExternalSyntheticLambda2(this, 4));
                return;
            }
            if (!ChatObject.getBannedRightsString(this.defaultBannedRights).equals(this.initialBannedRights)) {
                getMessagesController().setDefaultBannedRole(this.chatId, this.defaultBannedRights, ChatObject.isChannel(this.currentChat), this);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat2 != null) {
                    chat2.default_banned_rights = this.defaultBannedRights;
                }
            }
            int i2 = this.selectedSlowmode;
            if (i2 != this.initialSlowmode && (chatFull = this.info) != null) {
                chatFull.slowmode_seconds = getSecondsForIndex(i2);
                this.info.flags |= 131072;
                getMessagesController().setChannelSlowMode(this.chatId, this.info.slowmode_seconds);
            }
            boolean z3 = this.enablePrice;
            if (z3 != this.initialEnablePrice || (z3 && this.initialStarsPrice != this.starsPrice)) {
                TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
                updatepaidmessagesprice.channel = getMessagesController().getInputChannel(this.chatId);
                updatepaidmessagesprice.send_paid_messages_stars = this.enablePrice ? this.starsPrice : 0L;
                getConnectionsManager().sendRequest(updatepaidmessagesprice, new PassportActivity$$ExternalSyntheticLambda1(7));
                TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat3 != null) {
                    if (this.enablePrice) {
                        chat3.flags2 |= 16384;
                        chat3.send_paid_messages_stars = this.starsPrice;
                    } else {
                        chat3.flags2 &= -16385;
                        chat3.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat3, true);
                }
            }
            if (hasNotRestrictBoostersChanges()) {
                boolean z4 = this.isEnabledNotRestrictBoosters && isNotRestrictBoostersVisible();
                if (z4 && this.notRestrictBoosters == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, 1);
                } else if (z4 || this.notRestrictBoosters == 0) {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, this.notRestrictBoosters);
                } else {
                    getMessagesController().setBoostsToUnblockRestrictions(this.chatId, 0);
                }
            }
        } else if (i == 1) {
            boolean z5 = this.signatures;
            if (z5 != this.initialSignatures) {
                MessagesController messagesController = getMessagesController();
                long j = this.chatId;
                z = this.signatures;
                if (z && this.profiles) {
                    z2 = true;
                }
                messagesController.toggleChannelSignatures(j, z, z2);
            } else {
                if ((z5 && this.profiles) != this.initialProfiles) {
                    MessagesController messagesController2 = getMessagesController();
                    long j2 = this.chatId;
                    z = this.signatures;
                    if (z) {
                        z2 = true;
                    }
                    messagesController2.toggleChannelSignatures(j2, z, z2);
                }
            }
        }
        finishFragment();
    }

    public final void removeParticipants(long j) {
        ArrayList arrayList;
        LongSparseArray longSparseArray;
        TLRPC.ChatFull chatFull;
        DiffCallback diffCallbackSaveState = saveState();
        boolean z = false;
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                arrayList = this.contacts;
                longSparseArray = this.contactsMap;
            } else if (i == 1) {
                arrayList = this.bots;
                longSparseArray = this.botsMap;
            } else {
                arrayList = this.participants;
                longSparseArray = this.participantsMap;
            }
            TLObject tLObject = (TLObject) longSparseArray.get(j);
            if (tLObject != null) {
                longSparseArray.remove(j);
                arrayList.remove(tLObject);
                if (this.type == 0 && (chatFull = this.info) != null) {
                    chatFull.kicked_count--;
                }
                z = true;
            }
        }
        if (z) {
            updateListAnimated(diffCallbackSaveState);
        }
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchListViewAdapter;
        if (adapter == searchAdapter) {
            SearchAdapterHelper searchAdapterHelper = searchAdapter.searchAdapterHelper;
            Object obj = searchAdapterHelper.globalSearchMap.get(j);
            if (obj != null) {
                searchAdapterHelper.globalSearch.remove(obj);
            }
            Object obj2 = searchAdapterHelper.groupSearchMap.get(j);
            if (obj2 != null) {
                searchAdapterHelper.groupSearch.remove(obj2);
            }
            Object obj3 = searchAdapter.searchResultMap.get(j);
            if (obj3 != null) {
                searchAdapter.searchResult.remove(obj3);
            }
            searchAdapter.notifyDataSetChanged();
        }
    }

    public final DiffCallback saveState() {
        DiffCallback diffCallback = new DiffCallback();
        diffCallback.oldRowCount = this.rowCount;
        diffCallback.oldBotStartRow = this.botStartRow;
        diffCallback.oldBotEndRow = this.botEndRow;
        ArrayList arrayList = diffCallback.oldBots;
        arrayList.clear();
        arrayList.addAll(this.bots);
        diffCallback.oldContactsEndRow = this.contactsEndRow;
        diffCallback.oldContactsStartRow = this.contactsStartRow;
        ArrayList arrayList2 = diffCallback.oldContacts;
        arrayList2.clear();
        arrayList2.addAll(this.contacts);
        diffCallback.oldParticipantsStartRow = this.participantsStartRow;
        diffCallback.oldParticipantsEndRow = this.participantsEndRow;
        ArrayList arrayList3 = diffCallback.oldParticipants;
        arrayList3.clear();
        arrayList3.addAll(this.participants);
        diffCallback.fillPositions(diffCallback.oldPositionToItem);
        return diffCallback;
    }

    public final void setInfo(TLRPC.ChatFull chatFull) {
        this.info = chatFull;
        if (chatFull != null) {
            int currentSlowmode = getCurrentSlowmode();
            this.initialSlowmode = currentSlowmode;
            this.selectedSlowmode = currentSlowmode;
            int i = this.info.boosts_unrestrict;
            this.isEnabledNotRestrictBoosters = i > 0;
            this.notRestrictBoosters = i;
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
            long j = chat == null ? 0L : chat.send_paid_messages_stars;
            boolean z = j > 0;
            this.enablePrice = z;
            this.initialEnablePrice = z;
            if (j <= 0) {
                j = 10;
            }
            long jClamp = Utilities.clamp(j, getMessagesController().starsPaidMessageAmountMax, 1L);
            this.starsPrice = jClamp;
            this.initialStarsPrice = jClamp;
        }
    }

    public final void showItemsAnimated(int i) {
        if (this.isPaused || !this.openTransitionStarted) {
            return;
        }
        if (this.listView.getAdapter() == this.listViewAdapter && this.firstLoaded) {
            return;
        }
        View view = null;
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            View childAt = this.listView.getChildAt(i2);
            if (childAt instanceof FlickerLoadingView) {
                view = childAt;
            }
        }
        if (view != null) {
            this.listView.removeView(view);
            i--;
        }
        this.listView.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass12(this, (FlickerLoadingView) view, i, 0));
    }

    public final void updateListAnimated(DiffCallback diffCallback) {
        View childAt;
        if (this.listViewAdapter == null) {
            updateRows$4();
            return;
        }
        updateRows$4();
        diffCallback.fillPositions(diffCallback.newPositionToItem);
        DiffUtil.calculateDiff(diffCallback, true).dispatchUpdatesTo(new GroupCallActivity.UpdateCallback(this.listViewAdapter, 1));
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34 == null || this.layoutManager == null || anonymousClass34.getChildCount() <= 0) {
            return;
        }
        int i = 0;
        int childAdapterPosition = -1;
        while (true) {
            if (i >= this.listView.getChildCount()) {
                childAt = null;
                break;
            }
            childAdapterPosition = RecyclerView.getChildAdapterPosition(this.listView.getChildAt(i));
            if (childAdapterPosition != -1) {
                childAt = this.listView.getChildAt(i);
                break;
            }
            i++;
        }
        if (childAt != null) {
            StickersActivity.AnonymousClass2 anonymousClass2 = this.layoutManager;
            anonymousClass2.scrollToPositionWithOffset(childAdapterPosition, childAt.getTop() - this.listView.getPaddingTop(), anonymousClass2.mShouldReverseLayout);
        }
    }

    public final void updateRows$4() {
        boolean z;
        boolean z2;
        TLRPC.ChatFull chatFull;
        boolean z3;
        TLRPC.ChatFull chatFull2;
        boolean z4;
        TLRPC.ChatFull chatFull3;
        TLRPC.Chat chat;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(this.chatId));
        this.currentChat = chat2;
        if (chat2 == null) {
            return;
        }
        this.recentActionsRow = -1;
        this.antiSpamRow = -1;
        this.antiSpamInfoRow = -1;
        this.addNewRow = -1;
        this.addNew2Row = -1;
        this.hideMembersRow = -1;
        this.hideMembersInfoRow = -1;
        this.tagsRow = -1;
        this.tagsInfoRow = -1;
        this.addNewSectionRow = -1;
        this.restricted1SectionRow = -1;
        this.participantsStartRow = -1;
        this.participantsDividerRow = -1;
        this.participantsDivider2Row = -1;
        this.gigaInfoRow = -1;
        this.gigaConvertRow = -1;
        this.gigaHeaderRow = -1;
        this.participantsEndRow = -1;
        this.participantsInfoRow = -1;
        this.signMessagesRow = -1;
        this.signMessagesProfilesRow = -1;
        this.signMessagesInfoRow = -1;
        this.blockedEmptyRow = -1;
        this.permissionsSectionRow = -1;
        this.sendMessagesRow = -1;
        this.sendMediaRow = -1;
        this.sendStickersRow = -1;
        this.sendPollsRow = -1;
        this.embedLinksRow = -1;
        this.addUsersRow = -1;
        this.manageLinkedPeersRow = -1;
        this.manageTopicsRow = -1;
        this.pinMessagesRow = -1;
        this.editTagRow = -1;
        this.sendReactionsRow = -1;
        this.changeInfoRow = -1;
        this.removedUsersRow = -1;
        this.contactsHeaderRow = -1;
        this.contactsStartRow = -1;
        this.contactsEndRow = -1;
        this.botHeaderRow = -1;
        this.botStartRow = -1;
        this.botEndRow = -1;
        this.membersHeaderRow = -1;
        this.slowmodeRow = -1;
        this.slowmodeSelectRow = -1;
        this.slowmodeInfoRow = -1;
        this.dontRestrictBoostersRow = -1;
        this.dontRestrictBoostersInfoRow = -1;
        this.dontRestrictBoostersSliderRow = -1;
        this.loadingProgressRow = -1;
        this.loadingUserCellRow = -1;
        this.loadingHeaderRow = -1;
        this.sendMediaPhotosRow = -1;
        this.sendMediaVideosRow = -1;
        this.sendMediaStickerGifsRow = -1;
        this.sendMediaMusicRow = -1;
        this.sendMediaFilesRow = -1;
        this.sendMediaVoiceMessagesRow = -1;
        this.sendMediaVideoMessagesRow = -1;
        this.sendMediaEmbededLinksRow = -1;
        this.payRow = -1;
        this.payInfoRow = -1;
        this.priceHeaderRow = -1;
        this.priceRow = -1;
        this.priceInfoRow = -1;
        int i = 0;
        this.rowCount = 0;
        ArrayList arrayList = this.participants;
        int i2 = 1;
        boolean z5 = this.isCommunity;
        int i3 = this.type;
        if (i3 == 3) {
            int i4 = this.rowCount;
            int i5 = i4 + 1;
            this.rowCount = i5;
            this.permissionsSectionRow = i4;
            if (!z5) {
                this.sendMessagesRow = i5;
                int i6 = i4 + 3;
                this.rowCount = i6;
                this.sendMediaRow = i4 + 2;
                if (this.sendMediaExpanded) {
                    this.sendMediaPhotosRow = i6;
                    this.sendMediaVideosRow = i4 + 4;
                    this.sendMediaStickerGifsRow = i4 + 5;
                    this.sendMediaMusicRow = i4 + 6;
                    this.sendMediaFilesRow = i4 + 7;
                    this.sendMediaVoiceMessagesRow = i4 + 8;
                    this.sendMediaVideoMessagesRow = i4 + 9;
                    this.sendMediaEmbededLinksRow = i4 + 10;
                    this.sendPollsRow = i4 + 11;
                    this.rowCount = i4 + 13;
                    this.sendReactionsRow = i4 + 12;
                }
                int i7 = this.rowCount;
                this.addUsersRow = i7;
                this.pinMessagesRow = i7 + 1;
                this.rowCount = i7 + 3;
                this.editTagRow = i7 + 2;
            }
            int i8 = this.rowCount;
            int i9 = i8 + 1;
            this.rowCount = i9;
            this.changeInfoRow = i8;
            if (z5) {
                this.rowCount = i8 + 2;
                this.manageLinkedPeersRow = i9;
            } else if (this.isForum) {
                this.rowCount = i8 + 2;
                this.manageTopicsRow = i9;
            }
            if (ChatObject.isChannel(this.currentChat)) {
                TLRPC.Chat chat3 = this.currentChat;
                if (chat3.creator && chat3.megagroup && !chat3.gigagroup && !z5) {
                    int i10 = chat3.participants_count;
                    TLRPC.ChatFull chatFull4 = this.info;
                    if (Math.max(i10, chatFull4 != null ? chatFull4.participants_count : 0) >= getMessagesController().maxMegagroupCount - 1000) {
                        int i11 = this.rowCount;
                        this.participantsDivider2Row = i11;
                        this.gigaHeaderRow = i11 + 1;
                        this.gigaConvertRow = i11 + 2;
                        this.rowCount = i11 + 4;
                        this.gigaInfoRow = i11 + 3;
                    }
                }
            }
            TLRPC.ChatFull chatFull5 = this.info;
            if (chatFull5 != null && chatFull5.paid_messages_available && !z5 && ChatObject.canUserDoAction(this.currentChat, 2) && (ChatObject.isChannel(this.currentChat) || ((chat = this.currentChat) != null && chat.creator))) {
                if (this.participantsDivider2Row == -1) {
                    int i12 = this.rowCount;
                    this.rowCount = i12 + 1;
                    this.participantsDivider2Row = i12;
                }
                int i13 = this.rowCount;
                this.payRow = i13;
                int i14 = i13 + 2;
                this.rowCount = i14;
                this.payInfoRow = i13 + 1;
                if (this.enablePrice) {
                    this.priceHeaderRow = i14;
                    this.priceRow = i13 + 3;
                    this.rowCount = i13 + 5;
                    this.priceInfoRow = i13 + 4;
                }
            }
            if (!z5) {
                if (ChatObject.isChannel(this.currentChat) || !this.currentChat.creator) {
                    TLRPC.Chat chat4 = this.currentChat;
                    if (chat4.megagroup && !chat4.gigagroup && ChatObject.canBlockUsers(chat4)) {
                        if (this.participantsDivider2Row == -1) {
                            int i15 = this.rowCount;
                            this.rowCount = i15 + 1;
                            this.participantsDivider2Row = i15;
                        }
                        int i16 = this.rowCount;
                        this.slowmodeRow = i16;
                        this.slowmodeSelectRow = i16 + 1;
                        this.rowCount = i16 + 3;
                        this.slowmodeInfoRow = i16 + 2;
                    }
                } else {
                    if (this.participantsDivider2Row == -1) {
                        int i17 = this.rowCount;
                        this.rowCount = i17 + 1;
                        this.participantsDivider2Row = i17;
                    }
                    int i18 = this.rowCount;
                    this.slowmodeRow = i18;
                    this.slowmodeSelectRow = i18 + 1;
                    this.rowCount = i18 + 3;
                    this.slowmodeInfoRow = i18 + 2;
                }
            }
            if (isNotRestrictBoostersVisible() && !z5) {
                if (this.participantsDivider2Row == -1) {
                    int i19 = this.rowCount;
                    this.rowCount = i19 + 1;
                    this.participantsDivider2Row = i19;
                }
                int i20 = this.rowCount;
                int i21 = i20 + 1;
                this.rowCount = i21;
                this.dontRestrictBoostersRow = i20;
                if (this.isEnabledNotRestrictBoosters) {
                    this.rowCount = i20 + 2;
                    this.dontRestrictBoostersSliderRow = i21;
                }
                int i22 = this.rowCount;
                this.rowCount = i22 + 1;
                this.dontRestrictBoostersInfoRow = i22;
            }
            if (ChatObject.isChannel(this.currentChat) && !z5) {
                if (this.participantsDivider2Row == -1) {
                    int i23 = this.rowCount;
                    this.rowCount = i23 + 1;
                    this.participantsDivider2Row = i23;
                }
                int i24 = this.rowCount;
                this.rowCount = i24 + 1;
                this.removedUsersRow = i24;
            }
            if ((this.slowmodeInfoRow == -1 && this.gigaHeaderRow == -1) || this.removedUsersRow != -1) {
                int i25 = this.rowCount;
                this.rowCount = i25 + 1;
                this.participantsDividerRow = i25;
            }
            if (ChatObject.canBlockUsers(this.currentChat) && !z5 && getParticipantsCount() > 1 && (ChatObject.isChannel(this.currentChat) || this.currentChat.creator)) {
                int i26 = this.rowCount;
                this.rowCount = i26 + 1;
                this.addNewRow = i26;
            }
            if (this.loadingUsers && !(z4 = this.firstLoaded)) {
                if (z4 || (chatFull3 = this.info) == null || chatFull3.banned_count <= 0) {
                    return;
                }
                int i27 = this.rowCount;
                this.rowCount = i27 + 1;
                this.loadingUserCellRow = i27;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i28 = this.rowCount;
                this.participantsStartRow = i28;
                int size = arrayList.size() + i28;
                this.rowCount = size;
                this.participantsEndRow = size;
            }
            if (this.addNewRow == -1 && this.participantsStartRow == -1) {
                return;
            }
            int i29 = this.rowCount;
            this.rowCount = i29 + 1;
            this.addNewSectionRow = i29;
            return;
        }
        if (i3 == 0) {
            if (ChatObject.canBlockUsers(this.currentChat)) {
                int i30 = this.rowCount;
                this.rowCount = i30 + 1;
                this.addNewRow = i30;
                if (!arrayList.isEmpty() || (this.loadingUsers && !this.firstLoaded && (chatFull2 = this.info) != null && chatFull2.kicked_count > 0)) {
                    int i31 = this.rowCount;
                    this.rowCount = i31 + 1;
                    this.participantsInfoRow = i31;
                }
            }
            if (this.loadingUsers && !(z3 = this.firstLoaded)) {
                if (z3) {
                    return;
                }
                int i32 = this.rowCount;
                this.restricted1SectionRow = i32;
                this.rowCount = i32 + 2;
                this.loadingUserCellRow = i32 + 1;
                return;
            }
            if (!arrayList.isEmpty()) {
                int i33 = this.rowCount;
                int i34 = i33 + 1;
                this.rowCount = i34;
                this.restricted1SectionRow = i33;
                this.participantsStartRow = i34;
                int size2 = arrayList.size() + i34;
                this.rowCount = size2;
                this.participantsEndRow = size2;
            }
            if (this.participantsStartRow == -1) {
                int i35 = this.rowCount;
                this.rowCount = i35 + 1;
                this.blockedEmptyRow = i35;
                return;
            } else if (this.participantsInfoRow == -1) {
                int i36 = this.rowCount;
                this.rowCount = i36 + 1;
                this.participantsInfoRow = i36;
                return;
            } else {
                int i37 = this.rowCount;
                this.rowCount = i37 + 1;
                this.addNewSectionRow = i37;
                return;
            }
        }
        if (i3 == 1) {
            boolean z6 = this.transfer;
            if (!z6 && ChatObject.isChannel(this.currentChat)) {
                TLRPC.Chat chat5 = this.currentChat;
                if (chat5.megagroup && !chat5.gigagroup && ((chatFull = this.info) == null || chatFull.participants_count <= 200 || (!this.isChannel && chatFull.can_set_stickers))) {
                    if (ChatObject.hasAdminRights(chat5)) {
                        int i38 = this.rowCount;
                        this.antiSpamRow = i38;
                        this.rowCount = i38 + 2;
                        this.antiSpamInfoRow = i38 + 1;
                    } else {
                        int i39 = this.rowCount;
                        this.rowCount = i39 + 1;
                        this.addNewSectionRow = i39;
                    }
                }
            }
            if (ChatObject.canAddAdmins(this.currentChat)) {
                int i40 = this.rowCount;
                this.rowCount = i40 + 1;
                this.addNewRow = i40;
            }
            if (!this.loadingUsers || (z2 = this.firstLoaded)) {
                if (!arrayList.isEmpty()) {
                    int i41 = this.rowCount;
                    this.participantsStartRow = i41;
                    int size3 = arrayList.size() + i41;
                    this.rowCount = size3;
                    this.participantsEndRow = size3;
                }
                if (!z5) {
                    int i42 = this.rowCount;
                    this.rowCount = i42 + 1;
                    this.participantsInfoRow = i42;
                }
            } else if (!z2) {
                int i43 = this.rowCount;
                this.rowCount = i43 + 1;
                this.loadingUserCellRow = i43;
            }
            if (z6 || !ChatObject.isChannelAndNotMegaGroup(this.currentChat) || !ChatObject.hasAdminRights(this.currentChat) || z5) {
                return;
            }
            int i44 = this.rowCount;
            int i45 = i44 + 1;
            this.rowCount = i45;
            this.signMessagesRow = i44;
            if (!this.signatures) {
                this.rowCount = i44 + 2;
                this.signMessagesInfoRow = i45;
                return;
            } else {
                this.signMessagesProfilesRow = i45;
                this.rowCount = i44 + 3;
                this.signMessagesInfoRow = i44 + 2;
                return;
            }
        }
        if (i3 == 2) {
            if (ChatObject.isChannel(this.currentChat) && !ChatObject.isChannelAndNotMegaGroup(this.currentChat) && !this.needOpenSearch) {
                int i46 = this.rowCount;
                this.hideMembersRow = i46;
                this.rowCount = i46 + 2;
                this.hideMembersInfoRow = i46 + 1;
            }
            int i47 = this.selectType;
            if (i47 == 0 && ChatObject.canAddUsers(this.currentChat)) {
                int i48 = this.rowCount;
                this.rowCount = i48 + 1;
                this.addNewRow = i48;
            }
            if (i47 == 0 && ChatObject.canUserDoAdminAction(this.currentChat, 3)) {
                int i49 = this.rowCount;
                this.rowCount = i49 + 1;
                this.addNew2Row = i49;
            }
            if (this.loadingUsers && !(z = this.firstLoaded)) {
                if (z) {
                    return;
                }
                if (i47 == 0) {
                    int i50 = this.rowCount;
                    this.rowCount = i50 + 1;
                    this.loadingHeaderRow = i50;
                }
                int i51 = this.rowCount;
                this.rowCount = i51 + 1;
                this.loadingUserCellRow = i51;
                return;
            }
            ArrayList arrayList2 = this.contacts;
            if (!arrayList2.isEmpty()) {
                int i52 = this.rowCount;
                int i53 = i52 + 1;
                this.rowCount = i53;
                this.contactsHeaderRow = i52;
                this.contactsStartRow = i53;
                int size4 = arrayList2.size() + i53;
                this.rowCount = size4;
                this.contactsEndRow = size4;
                i = 1;
            }
            ArrayList arrayList3 = this.bots;
            if (arrayList3.isEmpty()) {
                i2 = i;
            } else {
                int i54 = this.rowCount;
                int i55 = i54 + 1;
                this.rowCount = i55;
                this.botHeaderRow = i54;
                this.botStartRow = i55;
                int size5 = arrayList3.size() + i55;
                this.rowCount = size5;
                this.botEndRow = size5;
            }
            if (!arrayList.isEmpty()) {
                if (i2 != 0) {
                    int i56 = this.rowCount;
                    this.rowCount = i56 + 1;
                    this.membersHeaderRow = i56;
                }
                int i57 = this.rowCount;
                this.participantsStartRow = i57;
                int size6 = arrayList.size() + i57;
                this.rowCount = size6;
                this.participantsEndRow = size6;
            }
            int i58 = this.rowCount;
            if (i58 != 0) {
                this.rowCount = i58 + 1;
                this.participantsInfoRow = i58;
            }
        }
    }
}
