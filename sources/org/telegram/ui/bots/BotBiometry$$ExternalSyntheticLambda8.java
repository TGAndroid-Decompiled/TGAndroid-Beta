package org.telegram.ui.bots;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.SparseIntArray;
import androidx.mediarouter.media.RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.internal.mlkit_language_id_common.zzio;
import com.stripe.android.Stripe;
import j$.util.Objects;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.camera.CameraView;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda120;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
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
import org.telegram.ui.Cells.ChatActionCell$$ExternalSyntheticLambda8;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2;
import org.telegram.ui.Components.Paint.Shape;
import org.telegram.ui.Components.Paint.ShapeDetector;
import org.telegram.ui.Components.Paint.Views.StickerMakerView;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda65;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public final class BotBiometry$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final int f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;

    public BotBiometry$$ExternalSyntheticLambda8(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run() {
        BaseFragment lastFragment;
        int i;
        Runnable runnable;
        int i2 = 5;
        ?? r6 = 0;
        int i3 = this.f$0;
        Object obj = this.f$3;
        Object obj2 = this.f$1;
        Object obj3 = this.f$2;
        ?? r11 = 1;
        switch (this.$r8$classId) {
            case 0:
                AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(MessagesStorage.getInstance(i3).getUsers((ArrayList) obj2), (HashMap) obj3, (Utilities.Callback) obj, i2));
                return;
            case 1:
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) obj3;
                Runnable runnable2 = (Runnable) obj;
                Uploader uploader = (Uploader) obj2;
                SynchronizationGuard synchronizationGuard = uploader.guard;
                try {
                    try {
                        EventStore eventStore = uploader.eventStore;
                        Objects.requireNonNull(eventStore);
                        ((SQLiteEventStore) synchronizationGuard).runCriticalSection(new RegisteredMediaRouteProviderWatcher$$ExternalSyntheticLambda0(eventStore, 9));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) uploader.context.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((SQLiteEventStore) synchronizationGuard).runCriticalSection(new VoIPService$$ExternalSyntheticLambda120(uploader, autoValue_TransportContext, i3, 1));
                        } else {
                            uploader.logAndUpdateState(autoValue_TransportContext, i3);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        uploader.workScheduler.schedule(autoValue_TransportContext, i3 + 1, false);
                        break;
                    }
                    return;
                } finally {
                    runnable2.run();
                }
            case 2:
                ((CameraView) obj2).lambda$createCamera$11(i3, (CameraSession) obj3, (CameraView.CameraGLThread) obj);
                return;
            case 3:
                int i4 = 0;
                boolean z = false;
                while (true) {
                    ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                    ArrayList arrayList = actionBarLayout.animateEndColors;
                    INavigationLayout.ThemeAnimationSettings themeAnimationSettings = (INavigationLayout.ThemeAnimationSettings) obj3;
                    if (i4 >= i3) {
                        Runnable runnable3 = (Runnable) obj;
                        if (z) {
                            if (!themeAnimationSettings.onlyTopFragment) {
                                int size = actionBarLayout.fragmentsStack.size() - ((actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) ? 2 : 1);
                                for (int i5 = 0; i5 < size; i5++) {
                                    BaseFragment baseFragment = (BaseFragment) actionBarLayout.fragmentsStack.get(i5);
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
                            int i6 = Theme.default_shadow_color;
                            Theme.animatingColors = new SparseIntArray();
                            actionBarLayout.setThemeAnimationValue(0.0f);
                            ChatActivity$ThemeDelegate$$ExternalSyntheticLambda2 chatActivity$ThemeDelegate$$ExternalSyntheticLambda3 = themeAnimationSettings.beforeAnimationRunnable;
                            if (chatActivity$ThemeDelegate$$ExternalSyntheticLambda3 != null) {
                                chatActivity$ThemeDelegate$$ExternalSyntheticLambda3.run();
                            }
                            INavigationLayout.ThemeAnimationSettings.onAnimationProgress onanimationprogress = themeAnimationSettings.animationProgress;
                            actionBarLayout.animationProgressListener = onanimationprogress;
                            if (onanimationprogress != null) {
                                onanimationprogress.setProgress(0.0f);
                            }
                            actionBarLayout.notificationsLocker.lock();
                            AnimatorSet animatorSet = new AnimatorSet();
                            actionBarLayout.themeAnimatorSet = animatorSet;
                            animatorSet.addListener(new RichEditor.AnonymousClass1(3, actionBarLayout, themeAnimationSettings));
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
                    if (i4 == 0) {
                        lastFragment = actionBarLayout.getLastFragment();
                    } else {
                        if ((actionBarLayout.inPreviewMode || actionBarLayout.transitionAnimationPreviewMode) && actionBarLayout.fragmentsStack.size() > r11) {
                            lastFragment = (BaseFragment) zzio.m(2, actionBarLayout.fragmentsStack);
                        } else {
                            i = i4;
                        }
                        i4 = i + 1;
                        r6 = 0;
                        r11 = 1;
                    }
                    if (lastFragment != null) {
                        if (themeAnimationSettings.resourcesProvider != null) {
                            MessageDrawable messageDrawable = actionBarLayout.messageDrawableOutStart;
                            Stripe stripe = actionBarLayout.startColorsProvider;
                            if (messageDrawable == null) {
                                MessageDrawable messageDrawable2 = new MessageDrawable(r6, r11, r6, stripe);
                                actionBarLayout.messageDrawableOutStart = messageDrawable2;
                                messageDrawable2.isCrossfadeBackground = r11;
                                MessageDrawable messageDrawable3 = new MessageDrawable(r11, r11, r6, stripe);
                                actionBarLayout.messageDrawableOutMediaStart = messageDrawable3;
                                messageDrawable3.isCrossfadeBackground = r11;
                            }
                            Theme.ResourcesProvider resourcesProvider = themeAnimationSettings.resourcesProvider;
                            ((SparseIntArray) stripe.tokenCreator).clear();
                            int[] iArr = (int[]) stripe.defaultPublishableKey;
                            int length = iArr.length;
                            int i7 = 0;
                            while (i7 < length) {
                                int i8 = iArr[i7];
                                ((SparseIntArray) stripe.tokenCreator).put(i8, resourcesProvider.getCurrentColor(i8));
                                i7++;
                                i4 = i4;
                            }
                        }
                        i = i4;
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
                            for (int i9 = 0; i9 < size2; i9++) {
                                iArr2[i9] = themeDescriptions.get(i9).getSetColor();
                            }
                        }
                        Dialog dialog2 = lastFragment.visibleDialog;
                        if (dialog2 instanceof BottomSheet) {
                            ArrayList<ThemeDescription> themeDescriptions2 = ((BottomSheet) dialog2).getThemeDescriptions();
                            if (themeDescriptions2 != null) {
                                int[] iArr3 = new int[themeDescriptions2.size()];
                                arrayList.add(iArr3);
                                int size3 = themeDescriptions2.size();
                                for (int i10 = 0; i10 < size3; i10++) {
                                    iArr3[i10] = themeDescriptions2.get(i10).getSetColor();
                                }
                            }
                        } else if (dialog2 instanceof AlertDialog) {
                            ((AlertDialog) dialog2).getClass();
                        }
                        z = true;
                    } else {
                        i = i4;
                    }
                    i4 = i + 1;
                    r6 = 0;
                    r11 = 1;
                }
                break;
            case 4:
                ((DialogsSearchAdapter) obj2).lambda$searchDialogs$20(i3, (TLObject) obj3, (String) obj);
                return;
            case 5:
                ((DialogsSearchAdapter) obj3).lambda$onBindViewHolder$33((ArrayList) obj2, i3, (GraySectionCell) obj);
                return;
            case 6:
                QuickRepliesController quickRepliesController = (QuickRepliesController) obj2;
                quickRepliesController.getClass();
                TLRPC.Message message = (TLRPC.Message) obj3;
                int i11 = message.flags & 1073741824;
                String str = (String) obj;
                int i12 = quickRepliesController.currentAccount;
                if (i11 != 0) {
                    QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(message.quick_reply_shortcut_id);
                    if (quickReplyFindReply == null) {
                        QuickRepliesController.QuickReply quickReply = new QuickRepliesController.QuickReply();
                        quickReply.id = message.quick_reply_shortcut_id;
                        quickReply.topMessageId = message.id;
                        MessageObject messageObject = new MessageObject(i12, message, false, true);
                        quickReply.topMessage = messageObject;
                        messageObject.generateThumbs(false);
                        if (str != null) {
                            quickReply.name = str;
                            quickRepliesController.deleteLocalReply(str);
                        }
                        quickReply.topMessage.applyQuickReply(str, i3);
                        quickReply.messagesCount = 1;
                        ArrayList arrayList2 = quickRepliesController.replies;
                        arrayList2.add(quickReply);
                        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                            ((QuickRepliesController.QuickReply) arrayList2.get(i13)).order = i13;
                        }
                        MessagesStorage messagesStorage = MessagesStorage.getInstance(i12);
                        messagesStorage.getStorageQueue().postRunnable(new ChatActionCell$$ExternalSyntheticLambda8(10, messagesStorage, quickReply));
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                    } else {
                        int i14 = quickReplyFindReply.topMessageId;
                        int i15 = message.id;
                        if (i14 == i15) {
                            quickReplyFindReply.topMessageId = i15;
                            MessageObject messageObject2 = new MessageObject(i12, message, false, true);
                            quickReplyFindReply.topMessage = messageObject2;
                            messageObject2.generateThumbs(false);
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        } else if ((message.flags & 32768) == 0) {
                            quickReplyFindReply.messagesCount++;
                            quickRepliesController.saveToCache();
                            NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                        }
                    }
                }
                if (str == null && i3 == 0) {
                    ArrayList<TLRPC.Message> arrayList3 = new ArrayList<>();
                    arrayList3.add(message);
                    MessagesStorage.getInstance(i12).putMessages(arrayList3, true, true, false, DownloadController.getInstance(i12).getAutodownloadMask(), 5, message.quick_reply_shortcut_id);
                    long clientUserId = UserConfig.getInstance(i12).getClientUserId();
                    ArrayList<MessageObject> arrayList4 = new ArrayList<>();
                    arrayList4.add(new MessageObject(i12, message, true, true));
                    MessagesController.getInstance(i12).updateInterfaceWithMessages(clientUserId, arrayList4, 5);
                    return;
                }
                return;
            case 7:
                ShapeDetector shapeDetector = (ShapeDetector) obj3;
                shapeDetector.getClass();
                Shape shape = (Shape) obj;
                boolean z2 = shape != null;
                shapeDetector.shapeDetected = z2;
                if (!z2 || i3 < 0) {
                    shapeDetector.toSave = (ArrayList) obj2;
                } else {
                    ArrayList arrayList5 = shapeDetector.templates;
                    if (i3 < arrayList5.size()) {
                        shapeDetector.templatesUsageScore++;
                        ((ShapeDetector.Template) arrayList5.get(i3)).score++;
                        shapeDetector.preferences.edit().putInt(DiffUtil.m(i3, "score"), ((ShapeDetector.Template) arrayList5.get(i3)).score).putInt("scoreall", shapeDetector.templatesUsageScore).apply();
                        shapeDetector.toSave = null;
                    } else {
                        shapeDetector.toSave = (ArrayList) obj2;
                    }
                }
                shapeDetector.onShapeDetected.run(shape);
                return;
            case 8:
                StickerMakerView stickerMakerView = (StickerMakerView) obj2;
                stickerMakerView.segmentImage((Bitmap) obj3, this.f$0, stickerMakerView.containerWidth, stickerMakerView.containerHeight, (PhotoViewer$$ExternalSyntheticLambda65) obj);
                return;
            case 9:
                ((LimitReachedBottomSheet) obj3).lambda$loadInactiveChannels$26((ArrayList) obj2, i3, (TLRPC.TL_messages_inactiveChats) obj);
                return;
            case 10:
                int i16 = this.f$0;
                StarGiftSheet starGiftSheet = new StarGiftSheet(i16, (Context) obj2, (Theme.ResourcesProvider) obj3, UserConfig.getInstance(i16).getClientUserId(), null);
                starGiftSheet.set((TL_stars.SavedStarGift) obj, (StarsController.IGiftsList) null);
                starGiftSheet.show();
                return;
            case 11:
                StoriesController.StoriesList storiesList = (StoriesController.StoriesList) obj3;
                storiesList.reqId = -1;
                StringBuilder sb = new StringBuilder("StoriesList ");
                int i17 = storiesList.type;
                sb.append(i17);
                sb.append("{");
                long j = storiesList.dialogId;
                sb.append(j);
                sb.append("} loaded {");
                ArrayList arrayList6 = (ArrayList) obj2;
                sb.append(StoriesController.access$900(arrayList6));
                sb.append("}");
                FileLog.d(sb.toString());
                ArrayList arrayList7 = storiesList.pinnedIds;
                arrayList7.clear();
                TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) obj;
                arrayList7.addAll(tL_stories_stories.pinned_to_top);
                int i18 = storiesList.currentAccount;
                MessagesController.getInstance(i18).putUsers(tL_stories_stories.users, false);
                MessagesController.getInstance(i18).putChats(tL_stories_stories.chats, false);
                MessagesStorage.getInstance(i18).putUsersAndChats(tL_stories_stories.users, tL_stories_stories.chats, true, true);
                storiesList.loading = false;
                storiesList.totalCount = tL_stories_stories.count;
                for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                    storiesList.pushObject((MessageObject) arrayList6.get(i19), false);
                }
                AbstractSet abstractSet = storiesList.loadedObjects;
                boolean z3 = abstractSet.size() >= storiesList.totalCount;
                storiesList.done = z3;
                AbstractSet abstractSet2 = storiesList.cachedObjects;
                int i20 = storiesList.albumId;
                if (z3) {
                    Iterator it = abstractSet2.iterator();
                    while (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        int iIntValue = num.intValue();
                        if (!abstractSet.contains(num)) {
                            it.remove();
                            storiesList.removeObject(iIntValue, false);
                        }
                    }
                } else if (i20 <= 0) {
                    if (i3 == -1) {
                        if (abstractSet.isEmpty()) {
                            i3 = -1;
                        } else {
                            ArrayList arrayList8 = new ArrayList(abstractSet);
                            int i21 = 0;
                            while (true) {
                                if (i21 < arrayList8.size()) {
                                    Integer num2 = (Integer) arrayList8.get(i21);
                                    int iIntValue2 = num2.intValue();
                                    if (arrayList7.contains(num2)) {
                                        i21++;
                                    } else {
                                        i3 = iIntValue2;
                                    }
                                } else {
                                    i3 = -1;
                                }
                            }
                        }
                    }
                    int iLastLoadedId = storiesList.lastLoadedId();
                    Iterator it2 = abstractSet2.iterator();
                    while (it2.hasNext()) {
                        Integer num3 = (Integer) it2.next();
                        int iIntValue3 = num3.intValue();
                        if (!abstractSet.contains(num3) && iIntValue3 >= i3 && iIntValue3 <= iLastLoadedId) {
                            it2.remove();
                            storiesList.removeObject(iIntValue3, false);
                        }
                    }
                }
                storiesList.fill(true);
                if (storiesList.done) {
                    if (StoriesController.StoriesList.lastLoadTime == null) {
                        StoriesController.StoriesList.lastLoadTime = new HashMap();
                    }
                    StoriesController.StoriesList.lastLoadTime.put(Integer.valueOf(Objects.hash(Integer.valueOf(i18), Integer.valueOf(i17), Long.valueOf(j), Integer.valueOf(i20))), Long.valueOf(System.currentTimeMillis()));
                } else {
                    HashMap map = StoriesController.StoriesList.lastLoadTime;
                    if (map != null) {
                        map.remove(Integer.valueOf(Objects.hash(Integer.valueOf(i18), Integer.valueOf(i17), Long.valueOf(j), Integer.valueOf(i20))));
                    }
                }
                storiesList.saveCache();
                return;
            default:
                BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22 = (BotWebViewContainer$$ExternalSyntheticLambda22) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                if (userFull == null) {
                    botWebViewContainer$$ExternalSyntheticLambda22.run(Boolean.FALSE, "cancelled");
                    return;
                } else {
                    SetupEmojiStatusSheet.askPermission(botWebViewContainer$$ExternalSyntheticLambda22, i3, (TLRPC.User) obj, userFull);
                    return;
                }
        }
    }

    public BotBiometry$$ExternalSyntheticLambda8(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = i;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public BotBiometry$$ExternalSyntheticLambda8(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$0 = i;
        this.f$3 = obj3;
    }

    public BotBiometry$$ExternalSyntheticLambda8(Object obj, ArrayList arrayList, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$1 = arrayList;
        this.f$0 = i;
        this.f$3 = obj2;
    }

    public BotBiometry$$ExternalSyntheticLambda8(QuickRepliesController quickRepliesController, TLRPC.Message message, String str, int i) {
        this.$r8$classId = 6;
        this.f$1 = quickRepliesController;
        this.f$2 = message;
        this.f$3 = str;
        this.f$0 = i;
    }

    public BotBiometry$$ExternalSyntheticLambda8(ShapeDetector shapeDetector, Shape shape, int i, ArrayList arrayList) {
        this.$r8$classId = 7;
        this.f$2 = shapeDetector;
        this.f$3 = shape;
        this.f$0 = i;
        this.f$1 = arrayList;
    }

    public BotBiometry$$ExternalSyntheticLambda8(StoriesController.StoriesList storiesList, ArrayList arrayList, TL_stories.TL_stories_stories tL_stories_stories, int i) {
        this.$r8$classId = 11;
        this.f$2 = storiesList;
        this.f$1 = arrayList;
        this.f$3 = tL_stories_stories;
        this.f$0 = i;
    }
}
