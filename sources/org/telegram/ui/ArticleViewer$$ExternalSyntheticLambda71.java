package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.util.SparseIntArray;
import android.view.View;
import androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import com.google.zxing.BinaryBitmap;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MessageDrawable;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlertContactsLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.GroupVoipInviteAlert;
import org.telegram.ui.Components.HashtagsSearchAdapter;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SuggestEmojiView;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.voip.VoIPHelper;

public final class ArticleViewer$$ExternalSyntheticLambda71 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;

    public ArticleViewer$$ExternalSyntheticLambda71(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    private final void run$org$telegram$ui$Components$SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda4() {
        SharedMediaLayout.MediaSearchAdapter mediaSearchAdapter = (SharedMediaLayout.MediaSearchAdapter) this.f$0;
        if (mediaSearchAdapter.reqId != 0) {
            if (this.f$1 == mediaSearchAdapter.lastReqId) {
                int itemCount = mediaSearchAdapter.getItemCount();
                mediaSearchAdapter.globalSearch = (ArrayList) this.f$2;
                mediaSearchAdapter.searchesInProgress--;
                int itemCount2 = mediaSearchAdapter.getItemCount();
                int i = mediaSearchAdapter.searchesInProgress;
                SharedMediaLayout sharedMediaLayout = SharedMediaLayout.this;
                if (i == 0 || itemCount2 != 0) {
                    sharedMediaLayout.switchToCurrentSelectedMode(false);
                }
                int i2 = 0;
                while (true) {
                    SharedMediaLayout.MediaPage[] mediaPageArr = sharedMediaLayout.mediaPages;
                    if (i2 >= mediaPageArr.length) {
                        break;
                    }
                    SharedMediaLayout.MediaPage mediaPage = mediaPageArr[i2];
                    if (mediaPage.selectedType == mediaSearchAdapter.currentType) {
                        if (mediaSearchAdapter.searchesInProgress == 0 && itemCount2 == 0) {
                            mediaPage.emptyView.title.setText(LocaleController.formatString("NoResultFoundFor", R.string.NoResultFoundFor, (String) this.f$3));
                            mediaPageArr[i2].emptyView.button.setVisibility(8);
                            mediaPageArr[i2].emptyView.showProgress(false, true);
                        } else if (itemCount == 0) {
                            sharedMediaLayout.animateItemsEnter(mediaPage.listView, 0, null);
                        }
                    }
                    i2++;
                }
                mediaSearchAdapter.mObservable.notifyChanged();
            }
            mediaSearchAdapter.reqId = 0;
        }
    }

    @Override
    public final void run() {
        BaseFragment lastFragment;
        int i;
        Runnable runnable;
        TLRPC.UserFull userFull;
        ChatActivity.AnonymousClass39 anonymousClass39;
        FolderBottomSheet folderBottomSheet;
        long peerId;
        TLRPC.WebPage webPage;
        int i2;
        int i3 = 6;
        int i4 = 21;
        int i5 = 5;
        int i6 = this.f$1;
        Object obj = this.f$3;
        Object obj2 = this.f$2;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer.BlockChannelCell) obj3).setState(0, false);
                AlertsCreator.processError(i6, (TLRPC.TL_error) obj2, null, (TLRPC.TL_channels_joinChannel) obj, Boolean.TRUE);
                return;
            case 1:
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) obj2;
                Runnable runnable2 = (Runnable) obj;
                Uploader uploader = (Uploader) obj3;
                SynchronizationGuard synchronizationGuard = uploader.guard;
                try {
                    try {
                        EventStore eventStore = uploader.eventStore;
                        Objects.requireNonNull(eventStore);
                        ((SQLiteEventStore) synchronizationGuard).runCriticalSection(new RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0(eventStore, 9));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.context.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((SQLiteEventStore) synchronizationGuard).runCriticalSection(new PassportActivity$$ExternalSyntheticLambda52(uploader, autoValue_TransportContext, i6, 1));
                        } else {
                            uploader.logAndUpdateState(autoValue_TransportContext, i6);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        uploader.workScheduler.schedule(autoValue_TransportContext, i6 + 1, false);
                        break;
                    }
                    return;
                } finally {
                    runnable2.run();
                }
            case 2:
                ((CameraView) obj3).lambda$createCamera$11(i6, (CameraSession) obj2, (CameraView.CameraGLThread) obj);
                return;
            case 3:
                boolean z = false;
                int i7 = 0;
                while (true) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) obj3;
                    ArrayList arrayList = actionBarLayout.animateEndColors;
                    INavigationLayout.ThemeAnimationSettings themeAnimationSettings = (INavigationLayout.ThemeAnimationSettings) obj2;
                    if (i7 >= i6) {
                        Runnable runnable3 = (Runnable) obj;
                        if (z) {
                            if (!themeAnimationSettings.onlyTopFragment) {
                                int size = actionBarLayout.fragmentsStack.size() - ((actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) ? 2 : 1);
                                for (int i8 = 0; i8 < size; i8++) {
                                    BaseFragment baseFragment = (BaseFragment) actionBarLayout.fragmentsStack.get(i8);
                                    baseFragment.clearViews();
                                    baseFragment.setParentLayout(actionBarLayout);
                                }
                            }
                            if (themeAnimationSettings.instant) {
                                actionBarLayout.setThemeAnimationValue(1.0f);
                                actionBarLayout.themeAnimatorDescriptions.clear();
                                actionBarLayout.animateStartColors.clear();
                                arrayList.clear();
                                actionBarLayout.themeAnimatorDelegate.clear();
                                actionBarLayout.presentingFragmentDescriptions = null;
                                actionBarLayout.animationProgressListener = null;
                                ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 chatActivity$ThemeDelegate$$ExternalSyntheticLambda2 = themeAnimationSettings.afterAnimationRunnable;
                                if (chatActivity$ThemeDelegate$$ExternalSyntheticLambda2 != null) {
                                    chatActivity$ThemeDelegate$$ExternalSyntheticLambda2.run();
                                }
                                if (runnable3 != null) {
                                    runnable3.run();
                                    return;
                                }
                                return;
                            }
                            int i9 = Theme.default_shadow_color;
                            Theme.animatingColors = new SparseIntArray();
                            actionBarLayout.setThemeAnimationValue(0.0f);
                            ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 chatActivity$ThemeDelegate$$ExternalSyntheticLambda3 = themeAnimationSettings.beforeAnimationRunnable;
                            if (chatActivity$ThemeDelegate$$ExternalSyntheticLambda3 != null) {
                                chatActivity$ThemeDelegate$$ExternalSyntheticLambda3.run();
                            }
                            ChatActivity.ThemeDelegate.AnonymousClass1 anonymousClass1 = themeAnimationSettings.animationProgress;
                            actionBarLayout.animationProgressListener = anonymousClass1;
                            if (anonymousClass1 != null) {
                                ChatActivity.ThemeDelegate themeDelegate = ChatActivity.ThemeDelegate.this;
                                ChatActivity.this.chatListView.invalidate();
                                themeDelegate.animatingMessageDrawable.crossfadeProgress = 0.0f;
                                themeDelegate.animatingMessageMediaDrawable.crossfadeProgress = 0.0f;
                                themeDelegate.updateServiceMessageColor(0.0f);
                            }
                            actionBarLayout.notificationsLocker.lock();
                            AnimatorSet animatorSet = new AnimatorSet();
                            actionBarLayout.themeAnimatorSet = animatorSet;
                            animatorSet.addListener(new ChatActivity.AnonymousClass74(actionBarLayout, themeAnimationSettings, false, 3));
                            actionBarLayout.themeAnimatorSet.playTogether(ObjectAnimator.ofFloat(actionBarLayout, "themeAnimationValue", 0.0f, 1.0f));
                            actionBarLayout.themeAnimatorSet.setDuration(themeAnimationSettings.duration);
                            actionBarLayout.themeAnimatorSet.start();
                        }
                        if (runnable3 != null) {
                            runnable3.run();
                            return;
                        }
                        return;
                    }
                    if (i7 == 0) {
                        lastFragment = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) && actionBarLayout.fragmentsStack.size() > 1) {
                            lastFragment = (BaseFragment) zzir.m(2, actionBarLayout.fragmentsStack);
                        } else {
                            i = i7;
                        }
                        i7 = i + 1;
                    }
                    if (lastFragment != null) {
                        if (themeAnimationSettings.resourcesProvider != null) {
                            MessageDrawable messageDrawable = actionBarLayout.messageDrawableOutStart;
                            BinaryBitmap binaryBitmap = actionBarLayout.startColorsProvider;
                            if (messageDrawable == null) {
                                MessageDrawable messageDrawable2 = new MessageDrawable(0, true, false, binaryBitmap);
                                actionBarLayout.messageDrawableOutStart = messageDrawable2;
                                messageDrawable2.isCrossfadeBackground = true;
                                MessageDrawable messageDrawable3 = new MessageDrawable(1, true, false, binaryBitmap);
                                actionBarLayout.messageDrawableOutMediaStart = messageDrawable3;
                                messageDrawable3.isCrossfadeBackground = true;
                            }
                            Theme.ResourcesProvider resourcesProvider = themeAnimationSettings.resourcesProvider;
                            ((SparseIntArray) binaryBitmap.binarizer).clear();
                            int[] iArr = (int[]) binaryBitmap.matrix;
                            int length = iArr.length;
                            int i10 = 0;
                            while (i10 < length) {
                                int i11 = iArr[i10];
                                ((SparseIntArray) binaryBitmap.binarizer).put(i11, resourcesProvider.getCurrentColor(i11));
                                i10++;
                                i7 = i7;
                            }
                        }
                        i = i7;
                        ArrayList<ThemeDescription> themeDescriptions = lastFragment.getThemeDescriptions();
                        actionBarLayout.addStartDescriptions(themeDescriptions);
                        Dialog dialog = lastFragment.visibleDialog;
                        if (dialog instanceof BottomSheet) {
                            actionBarLayout.addStartDescriptions(((BottomSheet) dialog).getThemeDescriptions());
                        } else if (dialog instanceof AlertDialog) {
                            ((AlertDialog) dialog).getClass();
                        }
                        if (i == 0 && (runnable = themeAnimationSettings.afterStartDescriptionsAddedRunnable) != null) {
                            runnable.run();
                        }
                        if (themeDescriptions != null) {
                            int[] iArr2 = new int[themeDescriptions.size()];
                            arrayList.add(iArr2);
                            int size2 = themeDescriptions.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                iArr2[i12] = themeDescriptions.get(i12).getSetColor();
                            }
                        }
                        Dialog dialog2 = lastFragment.visibleDialog;
                        if (dialog2 instanceof BottomSheet) {
                            ArrayList<ThemeDescription> themeDescriptions2 = ((BottomSheet) dialog2).getThemeDescriptions();
                            if (themeDescriptions2 != null) {
                                int[] iArr3 = new int[themeDescriptions2.size()];
                                arrayList.add(iArr3);
                                int size3 = themeDescriptions2.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    iArr3[i13] = themeDescriptions2.get(i13).getSetColor();
                                }
                            }
                        } else if (dialog2 instanceof AlertDialog) {
                            ((AlertDialog) dialog2).getClass();
                        }
                        z = true;
                    } else {
                        i = i7;
                    }
                    i7 = i + 1;
                }
                break;
            case 4:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) obj3;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (jElapsedRealtime - dialogsSearchAdapter.lastShowMoreUpdate < 300) {
                    return;
                }
                dialogsSearchAdapter.lastShowMoreUpdate = jElapsedRealtime;
                ArrayList arrayList2 = dialogsSearchAdapter.sponsoredPeers;
                int size4 = arrayList2.size();
                ArrayList arrayList3 = (ArrayList) obj2;
                int size5 = arrayList3.size();
                int i14 = (arrayList3.isEmpty() && arrayList2.isEmpty()) ? 0 : size5 + size4;
                int iMin = Math.min(3, size5) + size4;
                int itemCount = dialogsSearchAdapter.getItemCount();
                boolean z2 = dialogsSearchAdapter.globalSearchCollapsed;
                boolean z3 = itemCount > ((z2 ? iMin : i14) + i6) + 1;
                DefaultItemAnimator defaultItemAnimator = dialogsSearchAdapter.itemAnimator;
                if (defaultItemAnimator != null) {
                    defaultItemAnimator.mAddDuration = z3 ? 45L : 200L;
                    defaultItemAnimator.mRemoveDuration = z3 ? 80L : 200L;
                    defaultItemAnimator.mRemoveDelay = z3 ? 270L : 0L;
                }
                dialogsSearchAdapter.globalSearchCollapsed = !z2;
                GraySectionCell graySectionCell = (GraySectionCell) obj;
                graySectionCell.setRightTextMargin(16);
                String string = LocaleController.getString(dialogsSearchAdapter.globalSearchCollapsed ? R.string.ShowMore : R.string.ShowLess);
                boolean z4 = dialogsSearchAdapter.globalSearchCollapsed;
                GraySectionCell.AnonymousClass1 anonymousClass2 = graySectionCell.rightTextView;
                anonymousClass2.setText(string, true, z4);
                anonymousClass2.setVisibility(0);
                dialogsSearchAdapter.showMoreHeader = null;
                View view = (View) graySectionCell.getParent();
                if (view instanceof RecyclerView) {
                    RecyclerView recyclerView = (RecyclerView) view;
                    int i15 = (!dialogsSearchAdapter.globalSearchCollapsed ? i6 + iMin : i14 + i6) + 1;
                    for (int i16 = 0; i16 < recyclerView.getChildCount(); i16++) {
                        View childAt = recyclerView.getChildAt(i16);
                        if (RecyclerView.getChildAdapterPosition(childAt) == i15) {
                            dialogsSearchAdapter.showMoreHeader = childAt;
                        }
                    }
                }
                int i17 = i6 + iMin;
                int i18 = i17 + 1;
                int iMax = Math.max(0, size5 - 3);
                boolean z5 = dialogsSearchAdapter.globalSearchCollapsed;
                RecyclerView.AdapterDataObservable adapterDataObservable = dialogsSearchAdapter.mObservable;
                if (z5) {
                    adapterDataObservable.notifyItemRangeRemoved(i18, iMax);
                    if (z3) {
                        AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda74(dialogsSearchAdapter, i17, i5), 350L);
                    } else {
                        dialogsSearchAdapter.notifyItemChanged(i17);
                    }
                } else {
                    dialogsSearchAdapter.notifyItemChanged(i17);
                    adapterDataObservable.notifyItemRangeInserted(i18, iMax);
                }
                ArticleViewer$$ExternalSyntheticLambda8 articleViewer$$ExternalSyntheticLambda8 = dialogsSearchAdapter.cancelShowMoreAnimation;
                if (articleViewer$$ExternalSyntheticLambda8 != null) {
                    AndroidUtilities.cancelRunOnUIThread(articleViewer$$ExternalSyntheticLambda8);
                }
                if (!z3) {
                    dialogsSearchAdapter.showMoreAnimation = false;
                    return;
                }
                dialogsSearchAdapter.showMoreAnimation = true;
                ArticleViewer$$ExternalSyntheticLambda8 articleViewer$$ExternalSyntheticLambda9 = new ArticleViewer$$ExternalSyntheticLambda8(3, dialogsSearchAdapter, view);
                dialogsSearchAdapter.cancelShowMoreAnimation = articleViewer$$ExternalSyntheticLambda9;
                AndroidUtilities.runOnUIThread(articleViewer$$ExternalSyntheticLambda9, 400L);
                return;
            case 5:
                SearchViewPager.AnonymousClass1 anonymousClass3 = (SearchViewPager.AnonymousClass1) obj3;
                if (i6 != anonymousClass3.lastSearchId) {
                    return;
                }
                TLObject tLObject = (TLObject) obj2;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    anonymousClass3.publicPostsTotalCount = messages_messages instanceof TLRPC.TL_messages_messages ? ((TLRPC.TL_messages_messages) messages_messages).messages.size() : messages_messages instanceof TLRPC.TL_messages_messagesSlice ? ((TLRPC.TL_messages_messagesSlice) messages_messages).count : 0;
                    anonymousClass3.publicPostsLastRate = messages_messages.next_rate;
                    anonymousClass3.publicPostsHashtag = (String) obj;
                    int i19 = anonymousClass3.currentAccount;
                    boolean z6 = false;
                    MessagesController.getInstance(i19).putUsers(messages_messages.users, false);
                    MessagesController.getInstance(i19).putChats(messages_messages.chats, false);
                    int i20 = 0;
                    while (i20 < messages_messages.messages.size()) {
                        anonymousClass3.publicPosts.add(new MessageObject(i19, messages_messages.messages.get(i20), z6, true));
                        i20++;
                        z6 = false;
                    }
                    DialogsActivity.AnonymousClass48 anonymousClass48 = anonymousClass3.delegate;
                    if (anonymousClass48 != null) {
                        anonymousClass48.searchStateChanged(anonymousClass3.waitingResponseCount > 0, true);
                    }
                    anonymousClass3.notifyDataSetChanged();
                    return;
                }
                return;
            case 6:
                ArticleViewer articleViewer = (ArticleViewer) obj3;
                if (i6 == articleViewer.lastSearchIndex) {
                    articleViewer.showSearchPanel(true);
                    articleViewer.searchResults = (ArrayList) obj2;
                    articleViewer.searchText = (String) obj;
                    articleViewer.pages[0].adapter.searchTextOffset.clear();
                    articleViewer.pages[0].listView.invalidateViews();
                    articleViewer.scrollToSearchIndex(0);
                    return;
                }
                return;
            case 7:
                QuickRepliesController quickRepliesController = (QuickRepliesController) obj3;
                quickRepliesController.getClass();
                TLRPC.Message message = (TLRPC.Message) obj2;
                int i21 = message.flags & 1073741824;
                String str = (String) obj;
                int i22 = quickRepliesController.currentAccount;
                if (i21 != 0) {
                    QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(message.quick_reply_shortcut_id);
                    if (quickReplyFindReply == null) {
                        QuickRepliesController.QuickReply quickReply = new QuickRepliesController.QuickReply();
                        quickReply.id = message.quick_reply_shortcut_id;
                        quickReply.topMessageId = message.id;
                        MessageObject messageObject = new MessageObject(i22, message, false, true);
                        quickReply.topMessage = messageObject;
                        messageObject.generateThumbs(false);
                        if (str != null) {
                            quickReply.name = str;
                            quickRepliesController.deleteLocalReply(str);
                        }
                        quickReply.topMessage.applyQuickReply(str, i6);
                        quickReply.messagesCount = 1;
                        ArrayList arrayList4 = quickRepliesController.replies;
                        arrayList4.add(quickReply);
                        for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                            ((QuickRepliesController.QuickReply) arrayList4.get(i23)).order = i23;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i22);
                        messagesStorage.getStorageQueue().postRunnable(new ArticleViewer$$ExternalSyntheticLambda8(15, messagesStorage, quickReply));
                        NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i24 = quickReplyFindReply.topMessageId;
                        int i25 = message.id;
                        if (i24 == i25) {
                            quickReplyFindReply.topMessageId = i25;
                            MessageObject messageObject2 = new MessageObject(i22, message, false, true);
                            quickReplyFindReply.topMessage = messageObject2;
                            messageObject2.generateThumbs(false);
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            quickReplyFindReply.messagesCount++;
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str == null && i6 == 0) {
                    ArrayList<TLRPC.Message> arrayList5 = new ArrayList<>();
                    arrayList5.add(message);
                    MessagesStorage.getInstance(i22).putMessages(arrayList5, true, true, false, DownloadController.getInstance(i22).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i22).getClientUserId();
                    ArrayList<MessageObject> arrayList6 = new ArrayList<>();
                    arrayList6.add(new MessageObject(i22, message, true, true));
                    MessagesController.getInstance(i22).updateInterfaceWithMessages(clientUserId, arrayList6, 5);
                    return;
                }
                return;
            case 8:
                CallLogActivity.AnonymousClass9 anonymousClass9 = (CallLogActivity.AnonymousClass9) obj3;
                anonymousClass9.getClass();
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 instanceof TLRPC.TL_users_userFull) {
                    TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject2;
                    MessagesController.getInstance(i6).putUsers(tL_users_userFull.users, false);
                    MessagesController.getInstance(i6).putChats(tL_users_userFull.chats, false);
                    userFull = tL_users_userFull.full_user;
                } else {
                    userFull = null;
                }
                VoIPHelper.startCall((TLRPC.User) obj, false, userFull != null && userFull.video_calls_available, anonymousClass9.getParentActivity(), userFull, AccountInstance.getInstance(i6));
                return;
            case 9:
                ChatActivity chatActivity = (ChatActivity) obj3;
                chatActivity.getClass();
                chatActivity.currentEncryptedChat = ((MessagesStorage) obj2).getEncryptedChat(i6);
                ((CountDownLatch) obj).countDown();
                return;
            case 10:
                ChatActivity chatActivity2 = (ChatActivity) obj3;
                chatActivity2.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(chatActivity2.dialog_id), (ArrayList) obj2, Boolean.TRUE, (ArrayList) obj, null, 0, Integer.valueOf(i6), Boolean.valueOf(chatActivity2.pinnedEndReached));
                chatActivity2.pinBulletin = null;
                return;
            case 11:
                ChatActivity chatActivity3 = (ChatActivity) obj3;
                chatActivity3.getClass();
                boolean[] zArr = (boolean[]) obj2;
                if (zArr[0] || i6 != chatActivity3.commentLoadingMessageId || !chatActivity3.isFullyVisible || chatActivity3.isFinishing()) {
                    return;
                }
                zArr[0] = true;
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(chatActivity3, 20), 200L);
                ChatActivity chatActivity4 = (ChatActivity) obj;
                chatActivity3.presentFragment(chatActivity4);
                if (!chatActivity3.isKeyboardVisible() || chatActivity4.hideKeyboardOnShow() || (anonymousClass39 = chatActivity4.chatActivityEnterView) == null || anonymousClass39.getEditField() == null) {
                    return;
                }
                chatActivity4.chatActivityEnterView.getEditField().requestFocus();
                return;
            case 12:
                ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter = (ChatAttachAlertContactsLayout.ShareSearchAdapter) obj3;
                if (i6 != shareSearchAdapter.lastSearchId) {
                    return;
                }
                if (i6 != -1) {
                    ChatAttachAlertContactsLayout chatAttachAlertContactsLayout = ChatAttachAlertContactsLayout.this;
                    RecyclerView.Adapter adapter = chatAttachAlertContactsLayout.listView.getAdapter();
                    ChatAttachAlertContactsLayout.ShareSearchAdapter shareSearchAdapter2 = chatAttachAlertContactsLayout.searchAdapter;
                    if (adapter != shareSearchAdapter2) {
                        chatAttachAlertContactsLayout.listView.setAdapter(shareSearchAdapter2);
                    }
                }
                shareSearchAdapter.searchResult = (ArrayList) obj2;
                shareSearchAdapter.searchResultNames = (ArrayList) obj;
                shareSearchAdapter.notifyDataSetChanged();
                return;
            case 13:
                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) obj3;
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = ChatAttachAlertPhotoLayoutPreview.this;
                ValueAnimator valueAnimator = chatAttachAlertPhotoLayoutPreview.draggingAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                chatAttachAlertPhotoLayoutPreview.draggingCell = null;
                previewGroupsView.draggingT = 0.0f;
                previewGroupsView.pushToGroup((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell) obj2, (MediaController.PhotoEntry) obj, i6);
                previewGroupsView.updateGroups();
                previewGroupsView.toPhotoLayout(chatAttachAlertPhotoLayoutPreview.photoLayout, false);
                return;
            case 14:
                AlertsCreator.createMuteForPickerDialog(((ItemOptions) obj3).context, (Theme.ResourcesProvider) obj2, new LaunchActivity$$ExternalSyntheticLambda9(i6, (ChatNotificationsPopupWrapper$$ExternalSyntheticLambda12) obj, i3));
                return;
            case 15:
                BaseFragment baseFragment2 = (BaseFragment) obj3;
                if (baseFragment2.getParentActivity() == null) {
                    return;
                }
                TLObject tLObject3 = (TLObject) obj2;
                if (tLObject3 instanceof Vector) {
                    Vector vector = (Vector) tLObject3;
                    ArrayList arrayList7 = new ArrayList();
                    for (int i26 = 0; i26 < vector.objects.size(); i26++) {
                        try {
                            arrayList7.add(Long.valueOf(DialogObject.getPeerDialogId((TLRPC.Peer) vector.objects.get(i26))));
                        } catch (Exception unused2) {
                        }
                    }
                    folderBottomSheet = new FolderBottomSheet(baseFragment2, i6, arrayList7);
                } else {
                    folderBottomSheet = new FolderBottomSheet(baseFragment2, i6, (ArrayList) null);
                }
                folderBottomSheet.onDone = (Utilities.Callback) obj;
                baseFragment2.showDialog(folderBottomSheet);
                return;
            case 16:
                GroupVoipInviteAlert.SearchAdapter searchAdapter = (GroupVoipInviteAlert.SearchAdapter) obj3;
                searchAdapter.getClass();
                String lowerCase = ((String) obj2).trim().toLowerCase();
                if (lowerCase.length() == 0) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(searchAdapter, i6, new ArrayList(), i4));
                    return;
                }
                String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
                if (lowerCase.equals(translitString) || translitString.length() == 0) {
                    translitString = null;
                }
                int i27 = (translitString != null ? 1 : 0) + 1;
                String[] strArr = new String[i27];
                strArr[0] = lowerCase;
                if (translitString != null) {
                    strArr[1] = translitString;
                }
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = (ArrayList) obj;
                int size6 = arrayList9.size();
                for (int i28 = 0; i28 < size6; i28++) {
                    TLObject tLObject4 = (TLObject) arrayList9.get(i28);
                    if (tLObject4 instanceof TLRPC.ChatParticipant) {
                        peerId = ((TLRPC.ChatParticipant) tLObject4).user_id;
                    } else {
                        if (tLObject4 instanceof TLRPC.ChannelParticipant) {
                            peerId = MessageObject.getPeerId(((TLRPC.ChannelParticipant) tLObject4).peer);
                        }
                    }
                    TLRPC.User user = MessagesController.getInstance(((BottomSheet) GroupVoipInviteAlert.this).currentAccount).getUser(Long.valueOf(peerId));
                    if (!UserObject.isUserSelf(user)) {
                        String lowerCase2 = UserObject.getUserName(user).toLowerCase();
                        String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase2);
                        if (lowerCase2.equals(translitString2)) {
                            translitString2 = null;
                        }
                        char c = 0;
                        for (int i29 = 0; i29 < i27; i29++) {
                            String str2 = strArr[i29];
                            if (lowerCase2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, lowerCase2) || (translitString2 != null && (translitString2.startsWith(str2) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", str2, translitString2)))) {
                                c = 1;
                            } else {
                                String publicUsername = UserObject.getPublicUsername(user);
                                if (publicUsername != null && publicUsername.startsWith(str2)) {
                                    c = 2;
                                }
                            }
                            if (c != 0) {
                                arrayList8.add(tLObject4);
                            }
                            break;
                        }
                    }
                }
                AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda17(searchAdapter, i6, arrayList8, 21));
                return;
            case 17:
                HashtagsSearchAdapter hashtagsSearchAdapter = (HashtagsSearchAdapter) obj3;
                if (i6 != hashtagsSearchAdapter.searchId) {
                    return;
                }
                ArrayList arrayList10 = hashtagsSearchAdapter.messages;
                boolean zIsEmpty = arrayList10.isEmpty();
                hashtagsSearchAdapter.loading = false;
                TLObject tLObject5 = (TLObject) obj2;
                if (tLObject5 instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject5;
                    if (messages_messages2 instanceof TLRPC.TL_messages_messages) {
                        hashtagsSearchAdapter.totalCount = ((TLRPC.TL_messages_messages) messages_messages2).messages.size();
                    } else if (messages_messages2 instanceof TLRPC.TL_messages_messagesSlice) {
                        hashtagsSearchAdapter.totalCount = ((TLRPC.TL_messages_messagesSlice) messages_messages2).count;
                    }
                    hashtagsSearchAdapter.lastRate = messages_messages2.next_rate;
                    int i30 = hashtagsSearchAdapter.currentAccount;
                    MessagesController.getInstance(i30).putUsers(messages_messages2.users, false);
                    MessagesController.getInstance(i30).putChats(messages_messages2.chats, false);
                    for (int i31 = 0; i31 < messages_messages2.messages.size(); i31++) {
                        MessageObject messageObject3 = new MessageObject(i30, messages_messages2.messages.get(i31), false, true);
                        messageObject3.setQuery((String) obj);
                        arrayList10.add(messageObject3);
                    }
                    hashtagsSearchAdapter.endReached = arrayList10.size() >= hashtagsSearchAdapter.totalCount;
                    hashtagsSearchAdapter.checkBottom();
                } else {
                    hashtagsSearchAdapter.endReached = true;
                    hashtagsSearchAdapter.totalCount = arrayList10.size();
                }
                hashtagsSearchAdapter.update(true);
                if (zIsEmpty) {
                    LinearLayoutManager linearLayoutManager = ((SearchViewPager.AnonymousClass16) hashtagsSearchAdapter).this$0.hashtagSearchLayoutManager;
                    linearLayoutManager.scrollToPositionWithOffset(0, 0, linearLayoutManager.mShouldReverseLayout);
                    return;
                }
                return;
            case 18:
                ShapeDetector shapeDetector = (ShapeDetector) obj3;
                shapeDetector.getClass();
                Shape shape = (Shape) obj2;
                boolean z7 = shape != null;
                shapeDetector.shapeDetected = z7;
                if (!z7 || i6 < 0) {
                    shapeDetector.toSave = (ArrayList) obj;
                } else {
                    ArrayList arrayList11 = shapeDetector.templates;
                    if (i6 < arrayList11.size()) {
                        shapeDetector.templatesUsageScore++;
                        ((ShapeDetector.Template) arrayList11.get(i6)).score++;
                        shapeDetector.preferences.edit().putInt(DiffUtil.m(i6, "score"), ((ShapeDetector.Template) arrayList11.get(i6)).score).putInt("scoreall", shapeDetector.templatesUsageScore).apply();
                        shapeDetector.toSave = null;
                    } else {
                        shapeDetector.toSave = (ArrayList) obj;
                    }
                }
                shapeDetector.onShapeDetected.run(shape);
                return;
            case 19:
                StickerMakerView stickerMakerView = (StickerMakerView) obj3;
                stickerMakerView.segmentImage((Bitmap) obj2, this.f$1, stickerMakerView.containerWidth, stickerMakerView.containerHeight, (PhotoViewer$$ExternalSyntheticLambda26) obj);
                return;
            case 20:
                ((LimitReachedBottomSheet) obj3).lambda$loadInactiveChannels$26((ArrayList) obj2, i6, (TLRPC.TL_messages_inactiveChats) obj);
                return;
            case 21:
                SearchTagsList.openRenameTagAlert(((SearchTagsList) obj3).getContext(), i6, ((SearchTagsList.Item) obj2).reaction.toTLReaction(), (Theme.ResourcesProvider) obj);
                return;
            case 22:
                ShareTopView shareTopView = (ShareTopView) obj3;
                if (i6 != shareTopView.linkRequestSerial) {
                    return;
                }
                shareTopView.linkRequestId = 0;
                TLObject tLObject6 = (TLObject) obj2;
                if (tLObject6 instanceof TL_account.webPagePreview) {
                    TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject6;
                    MessagesController.getInstance(shareTopView.currentAccount).putUsers(webpagepreview.users, false);
                    MessagesController.getInstance(shareTopView.currentAccount).putChats(webpagepreview.chats, false);
                    TLRPC.MessageMedia messageMedia = webpagepreview.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                        webPage = ((TLRPC.TL_messageMediaWebPage) messageMedia).webpage;
                    } else {
                        webPage = null;
                    }
                } else {
                    webPage = null;
                }
                if (webPage instanceof TLRPC.TL_webPage) {
                    HashMap map = shareTopView.linkPreviewCache;
                    if (map.size() > 5) {
                        Iterator it = map.keySet().iterator();
                        while (it.hasNext() && map.size() > 5) {
                            it.next();
                            it.remove();
                        }
                    }
                    String str3 = (String) obj;
                    map.put(str3, webPage);
                    shareTopView.loadedWebPage = webPage;
                    ShareTopView.bindLinkLoaded(shareTopView.layouts[0], webPage, str3);
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPagePending) {
                    shareTopView.loadedWebPage = webPage;
                    return;
                }
                if (webPage instanceof TLRPC.TL_webPageEmpty) {
                    shareTopView.loadedWebPage = null;
                    if (shareTopView.currentMode != 0) {
                        shareTopView.currentMode = 0;
                        ShareTopView.OnModeChangeListener onModeChangeListener = shareTopView.modeChangeListener;
                        if (onModeChangeListener != null) {
                            ((DialogsActivity$$ExternalSyntheticLambda10) onModeChangeListener).onModeChanged(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 23:
                ((SharedMediaLayout) obj3).onItemLongClick((MessageObject) obj2, (View) obj, i6, false);
                return;
            case 24:
                ((SharedMediaLayout) obj3).lambda$onItemLongClick$60(i6, (TL_stories.StoryItem) obj2, (String) obj);
                return;
            case 25:
                AlertsCreator.processError(i6, (TLRPC.TL_error) obj2, ((SharedMediaLayout) obj3).profileActivity, (TLRPC.TL_messages_editMessage) obj, new Object[0]);
                return;
            case 26:
                run$org$telegram$ui$Components$SharedMediaLayout$MediaSearchAdapter$$ExternalSyntheticLambda4();
                return;
            case 27:
                SuggestEmojiView suggestEmojiView = (SuggestEmojiView) obj3;
                suggestEmojiView.getClass();
                HashSet hashSet = new HashSet();
                ArrayList arrayList12 = new ArrayList();
                int i32 = suggestEmojiView.currentAccount;
                String str4 = (String) obj;
                MediaDataController.getInstance(i32).getEmojiSuggestions((String[]) obj2, str4, true, new PassportActivity$$ExternalSyntheticLambda66(suggestEmojiView, this.f$1, str4, hashSet, arrayList12), SharedConfig.suggestAnimatedEmoji && UserConfig.getInstance(i32).isPremium());
                return;
            case 28:
                SuggestEmojiView suggestEmojiView2 = (SuggestEmojiView) obj3;
                if (i6 == suggestEmojiView2.lastQueryId) {
                    suggestEmojiView2.lastQuery = (String) obj2;
                    suggestEmojiView2.lastQueryType = 2;
                    ArrayList arrayList13 = (ArrayList) obj;
                    arrayList13.remove(arrayList13.size() - 1);
                    if (arrayList13.isEmpty()) {
                        suggestEmojiView2.clear = true;
                        suggestEmojiView2.forceClose();
                        return;
                    }
                    suggestEmojiView2.clear = false;
                    suggestEmojiView2.forceClose = false;
                    suggestEmojiView2.createListView$1();
                    SuggestEmojiView.AnonymousClass2 anonymousClass4 = suggestEmojiView2.containerView;
                    if (anonymousClass4 != null) {
                        anonymousClass4.setVisibility(0);
                        suggestEmojiView2.containerView.invalidate();
                    }
                    suggestEmojiView2.keywordResults = arrayList13;
                    SuggestEmojiView.Adapter adapter2 = suggestEmojiView2.adapter;
                    if (adapter2 != null) {
                        adapter2.mObservable.notifyChanged();
                        return;
                    }
                    return;
                }
                return;
            default:
                ThemeEditorView.EditorAlert.SearchAdapter searchAdapter2 = (ThemeEditorView.EditorAlert.SearchAdapter) obj3;
                if (i6 != searchAdapter2.lastSearchId) {
                    return;
                }
                ThemeEditorView.EditorAlert editorAlert = ThemeEditorView.EditorAlert.this;
                RecyclerView.Adapter adapter3 = editorAlert.listView.getAdapter();
                ThemeEditorView.EditorAlert.SearchAdapter searchAdapter3 = editorAlert.searchAdapter;
                if (adapter3 != searchAdapter3) {
                    editorAlert.topBeforeSwitch = ThemeEditorView.EditorAlert.access$600(editorAlert);
                    editorAlert.listView.setAdapter(searchAdapter3);
                    searchAdapter3.mObservable.notifyChanged();
                }
                ArrayList arrayList14 = (ArrayList) obj2;
                boolean z8 = !searchAdapter2.searchResult.isEmpty() && arrayList14.isEmpty();
                boolean z9 = searchAdapter2.searchResult.isEmpty() && arrayList14.isEmpty();
                if (z8) {
                    editorAlert.topBeforeSwitch = ThemeEditorView.EditorAlert.access$600(editorAlert);
                }
                searchAdapter2.searchResult = arrayList14;
                searchAdapter2.searchNames = (ArrayList) obj;
                searchAdapter2.mObservable.notifyChanged();
                if (!z9 && !z8 && (i2 = editorAlert.topBeforeSwitch) > 0) {
                    LinearLayoutManager linearLayoutManager2 = editorAlert.layoutManager;
                    linearLayoutManager2.scrollToPositionWithOffset(0, -i2, linearLayoutManager2.mShouldReverseLayout);
                    editorAlert.topBeforeSwitch = -1000;
                }
                editorAlert.searchEmptyView.showTextView();
                return;
        }
    }

    public ArticleViewer$$ExternalSyntheticLambda71(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = i;
        this.f$3 = obj3;
    }

    public ArticleViewer$$ExternalSyntheticLambda71(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = i;
    }
}
