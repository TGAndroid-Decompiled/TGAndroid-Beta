package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.location.Location;
import android.os.SystemClock;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import java.util.ArrayList;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Business.ChatbotsActivity;
import org.telegram.ui.Business.OpeningHoursActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.ChannelRecommendationsCell;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.QRCodeBottomSheet;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.UItem;

public final class ArticleViewer$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        String str;
        TLRPC.Message message;
        CacheChatsExceptionsFragment cacheChatsExceptionsFragment;
        CacheByChatsController.KeepMediaException keepMediaException;
        int i;
        int i2 = 3;
        int i3 = 2;
        TL_account.connectedBots connectedbots = 0;
        ArrayList arrayList = null;
        sQLitePreparedStatementExecuteFast = null;
        SQLitePreparedStatement sQLitePreparedStatementExecuteFast = null;
        switch (this.$r8$classId) {
            case 0:
                ((ArticleViewer) this.f$0).notificationsLocker.lock();
                ((AnimatorSet) this.f$1).start();
                return;
            case 1:
                BaseLocationAdapter baseLocationAdapter = (BaseLocationAdapter) this.f$0;
                baseLocationAdapter.getClass();
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) ((TLObject) this.f$1);
                int i4 = baseLocationAdapter.currentAccount;
                MessagesController.getInstance(i4).putUsers(tL_contacts_resolvedPeer.users, false);
                MessagesController.getInstance(i4).putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(i4).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                Location location = baseLocationAdapter.lastSearchLocation;
                baseLocationAdapter.lastSearchLocation = null;
                baseLocationAdapter.searchPlacesWithQuery(baseLocationAdapter.lastSearchQuery, location, false);
                return;
            case 2:
                SearchViewPager.AnonymousClass1 anonymousClass1 = (SearchViewPager.AnonymousClass1) this.f$0;
                anonymousClass1.sponsoredReqId = 0;
                TLObject tLObject = (TLObject) this.f$1;
                boolean z = tLObject instanceof TLRPC.TL_contacts_sponsoredPeersEmpty;
                ArrayList arrayList2 = anonymousClass1.sponsoredPeers;
                if (z) {
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    arrayList2.clear();
                    anonymousClass1.notifyDataSetChanged();
                    return;
                }
                if (tLObject instanceof TLRPC.TL_contacts_sponsoredPeers) {
                    TLRPC.TL_contacts_sponsoredPeers tL_contacts_sponsoredPeers = (TLRPC.TL_contacts_sponsoredPeers) tLObject;
                    int i5 = anonymousClass1.currentAccount;
                    MessagesController.getInstance(i5).putUsers(tL_contacts_sponsoredPeers.users, true);
                    MessagesController.getInstance(i5).putChats(tL_contacts_sponsoredPeers.chats, true);
                    arrayList2.addAll(tL_contacts_sponsoredPeers.peers);
                    anonymousClass1.notifyDataSetChanged();
                    return;
                }
                return;
            case 3:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) this.f$0;
                dialogsSearchAdapter.showMoreAnimation = false;
                dialogsSearchAdapter.showMoreHeader = null;
                View view = (View) this.f$1;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 4:
                StringBuilder sb = (StringBuilder) this.f$1;
                SearchViewPager.AnonymousClass1 anonymousClass2 = (SearchViewPager.AnonymousClass1) this.f$0;
                anonymousClass2.getClass();
                try {
                    sb.insert(0, "DELETE FROM search_recent WHERE ");
                    MessagesStorage.getInstance(anonymousClass2.currentAccount).getDatabase().executeFast(sb.toString()).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                SearchAdapter searchAdapter = (SearchAdapter) this.f$0;
                String str2 = (String) this.f$1;
                searchAdapter.lastQuery = str2;
                if (searchAdapter.allowUsernameSearch) {
                    str = str2;
                    searchAdapter.searchAdapterHelper.queryServerSearch(str, true, false, searchAdapter.allowBots, searchAdapter.allowSelf, false, searchAdapter.channelId, searchAdapter.allowPhoneNumbers, -1, 1, 0L, null);
                } else {
                    str = str2;
                }
                int i6 = UserConfig.selectedAccount;
                ArrayList arrayList3 = new ArrayList(ContactsController.getInstance(i6).contacts);
                searchAdapter.searchInProgress = true;
                int i7 = searchAdapter.searchPointer;
                searchAdapter.searchPointer = i7 + 1;
                searchAdapter.searchReqId = i7;
                searchAdapter.mObservable.notifyChanged();
                Utilities.searchQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda171(searchAdapter, str, i7, arrayList3, i6, 2));
                return;
            case 6:
                ArrayList arrayList4 = (ArrayList) this.f$1;
                int i8 = ((SearchAdapterHelper) this.f$0).currentAccount;
                try {
                    MessagesStorage.getInstance(i8).getDatabase().beginTransaction();
                    SQLitePreparedStatement sQLitePreparedStatementExecuteFast2 = MessagesStorage.getInstance(i8).getDatabase().executeFast("REPLACE INTO hashtag_recent_v2 VALUES(?, ?)");
                    for (int i9 = 0; i9 < arrayList4.size() && i9 != 100; i9++) {
                        SearchAdapterHelper.HashtagObject hashtagObject = (SearchAdapterHelper.HashtagObject) arrayList4.get(i9);
                        sQLitePreparedStatementExecuteFast2.requery();
                        sQLitePreparedStatementExecuteFast2.bindString(1, hashtagObject.hashtag);
                        sQLitePreparedStatementExecuteFast2.bindInteger(2, hashtagObject.date);
                        sQLitePreparedStatementExecuteFast2.step();
                    }
                    sQLitePreparedStatementExecuteFast2.dispose();
                    if (arrayList4.size() > 100) {
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast3 = MessagesStorage.getInstance(i8).getDatabase().executeFast("DELETE FROM hashtag_recent_v2 WHERE id = ?");
                        for (int i10 = 100; i10 < arrayList4.size(); i10++) {
                            sQLitePreparedStatementExecuteFast3.requery();
                            sQLitePreparedStatementExecuteFast3.bindString(1, ((SearchAdapterHelper.HashtagObject) arrayList4.get(i10)).hashtag);
                            sQLitePreparedStatementExecuteFast3.step();
                        }
                        sQLitePreparedStatementExecuteFast3.dispose();
                    }
                    MessagesStorage.getInstance(i8).getDatabase().commitTransaction();
                    return;
                } catch (Exception e2) {
                    FileLog.e(e2);
                    return;
                }
            case 7:
                ((ArchivedStickersActivity) this.f$0).processResponse((TLRPC.TL_messages_archivedStickers) this.f$1);
                return;
            case 8:
                ArticleViewer articleViewer = (ArticleViewer) this.f$0;
                ArticleViewer.Sheet sheet = articleViewer.sheet;
                if (sheet != null) {
                    sheet.dismiss(true);
                }
                if (articleViewer.loadingProgress == ((ArticleViewer.AnonymousClass13) this.f$1)) {
                    articleViewer.loadingProgress = null;
                    return;
                }
                return;
            case 9:
                AutoDeleteMessagesActivity.AnonymousClass2 anonymousClass3 = (AutoDeleteMessagesActivity.AnonymousClass2) this.f$0;
                ArrayList arrayList5 = (ArrayList) this.f$1;
                if (arrayList5.isEmpty()) {
                    return;
                }
                int i11 = 0;
                while (true) {
                    int size = arrayList5.size();
                    AutoDeleteMessagesActivity autoDeleteMessagesActivity = AutoDeleteMessagesActivity.this;
                    if (i11 >= size) {
                        if (autoDeleteMessagesActivity.getSelectedTime() > 0) {
                            BulletinFactory.of(autoDeleteMessagesActivity).createSimpleBulletinWithIconSize(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(autoDeleteMessagesActivity.getSelectedTime() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).show();
                            return;
                        } else {
                            BulletinFactory.of(autoDeleteMessagesActivity).createSimpleBulletinWithIconSize(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).show();
                            return;
                        }
                    }
                    autoDeleteMessagesActivity.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i11)).longValue(), autoDeleteMessagesActivity.getSelectedTime() * 60);
                    i11++;
                }
                break;
            case 10:
                BoostsActivity boostsActivity = (BoostsActivity) this.f$0;
                boostsActivity.boostsStatus = (TL_stories.TL_premium_boostsStatus) this.f$1;
                boostsActivity.loadCanApplyBoosts();
                boostsActivity.progressLayout.animate().cancel();
                boostsActivity.progressLayout.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new ArticleViewer.AnonymousClass25(boostsActivity, 7));
                boostsActivity.resetHeader(true);
                boostsActivity.updateRows(true);
                boostsActivity.loadUsers(null);
                return;
            case 11:
                BusinessChatbotController businessChatbotController = (BusinessChatbotController) this.f$0;
                businessChatbotController.loading = false;
                TLObject tLObject2 = (TLObject) this.f$1;
                connectedbots = tLObject2 instanceof TL_account.connectedBots ? (TL_account.connectedBots) tLObject2 : 0;
                businessChatbotController.value = connectedbots;
                int i12 = businessChatbotController.currentAccount;
                if (connectedbots != 0) {
                    MessagesController.getInstance(i12).putUsers(businessChatbotController.value.users, false);
                }
                businessChatbotController.lastTime = System.currentTimeMillis();
                businessChatbotController.loaded = true;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList6 = businessChatbotController.callbacks;
                    if (i13 >= arrayList6.size()) {
                        arrayList6.clear();
                        NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updatedChatbot, new Object[0]);
                        return;
                    } else {
                        if (arrayList6.get(i13) != null) {
                            ((Utilities.Callback) arrayList6.get(i13)).run(businessChatbotController.value);
                        }
                        i13++;
                    }
                }
                break;
            case 12:
                ((ChatbotSheet) this.f$0).lambda$new$2((OAuthSheet$$ExternalSyntheticLambda17) this.f$1);
                return;
            case 13:
                ((ChatbotsActivity) this.f$0).lambda$processDone$18((TLObject) this.f$1);
                return;
            case 14:
                OpeningHoursActivity openingHoursActivity = (OpeningHoursActivity) this.f$0;
                openingHoursActivity.getClass();
                openingHoursActivity.adaptPrevDay(((UItem) this.f$1).id);
                return;
            case 15:
                MessagesStorage messagesStorage = (MessagesStorage) this.f$0;
                QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$1;
                try {
                    try {
                        sQLitePreparedStatementExecuteFast = messagesStorage.getDatabase().executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatementExecuteFast.requery();
                        sQLitePreparedStatementExecuteFast.bindInteger(1, quickReply.id);
                        sQLitePreparedStatementExecuteFast.bindString(2, quickReply.name);
                        sQLitePreparedStatementExecuteFast.bindInteger(3, quickReply.order);
                        sQLitePreparedStatementExecuteFast.bindInteger(4, quickReply.messagesCount);
                        sQLitePreparedStatementExecuteFast.step();
                        sQLitePreparedStatementExecuteFast.dispose();
                    } catch (Throwable th) {
                        if (sQLitePreparedStatementExecuteFast != null) {
                            sQLitePreparedStatementExecuteFast.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e3) {
                    FileLog.e(e3);
                    if (sQLitePreparedStatementExecuteFast != null) {
                        sQLitePreparedStatementExecuteFast.dispose();
                    }
                }
                return;
            case 16:
                MessagesStorage messagesStorage2 = (MessagesStorage) this.f$1;
                QuickRepliesController quickRepliesController = (QuickRepliesController) this.f$0;
                quickRepliesController.getClass();
                try {
                    try {
                        SQLiteDatabase database = messagesStorage2.getDatabase();
                        database.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        SQLitePreparedStatement sQLitePreparedStatementExecuteFast4 = database.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        int i14 = 0;
                        while (true) {
                            ArrayList arrayList7 = quickRepliesController.replies;
                            if (i14 >= arrayList7.size()) {
                                if (sQLitePreparedStatementExecuteFast4 != null) {
                                    sQLitePreparedStatementExecuteFast4.dispose();
                                    return;
                                }
                                return;
                            }
                            QuickRepliesController.QuickReply quickReply2 = (QuickRepliesController.QuickReply) arrayList7.get(i14);
                            sQLitePreparedStatementExecuteFast4.requery();
                            sQLitePreparedStatementExecuteFast4.bindInteger(1, quickReply2.id);
                            sQLitePreparedStatementExecuteFast4.bindString(2, quickReply2.name);
                            sQLitePreparedStatementExecuteFast4.bindInteger(3, quickReply2.order);
                            sQLitePreparedStatementExecuteFast4.bindInteger(4, quickReply2.messagesCount);
                            sQLitePreparedStatementExecuteFast4.step();
                            i14++;
                        }
                    } catch (Exception e4) {
                        FileLog.e(e4);
                        if (0 != 0) {
                            connectedbots.dispose();
                            return;
                        }
                        return;
                    }
                } catch (Throwable th2) {
                    if (0 != 0) {
                        connectedbots.dispose();
                    }
                    throw th2;
                }
                break;
            case 17:
                QuickRepliesController quickRepliesController2 = (QuickRepliesController) this.f$0;
                quickRepliesController2.getClass();
                TLObject tLObject3 = (TLObject) this.f$1;
                boolean z2 = tLObject3 instanceof TLRPC.TL_messages_quickReplies;
                int i15 = quickRepliesController2.currentAccount;
                if (z2) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject3;
                    MessagesController.getInstance(i15).putUsers(tL_messages_quickReplies.users, false);
                    MessagesController.getInstance(i15).putChats(tL_messages_quickReplies.chats, false);
                    MessagesStorage.getInstance(i15).putUsersAndChats(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList8 = new ArrayList();
                    for (int i16 = 0; i16 < tL_messages_quickReplies.quick_replies.size(); i16++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i16);
                        QuickRepliesController.QuickReply quickReply3 = new QuickRepliesController.QuickReply();
                        quickReply3.id = tL_quickReply.shortcut_id;
                        quickReply3.name = tL_quickReply.shortcut;
                        quickReply3.messagesCount = tL_quickReply.count;
                        quickReply3.topMessageId = tL_quickReply.top_message;
                        quickReply3.order = i16;
                        int i17 = 0;
                        while (true) {
                            if (i17 < tL_messages_quickReplies.messages.size()) {
                                TLRPC.Message message2 = tL_messages_quickReplies.messages.get(i17);
                                if (message2.id == tL_quickReply.top_message) {
                                    message = message2;
                                } else {
                                    i17++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            MessageObject messageObject = new MessageObject(i15, message, false, true);
                            quickReply3.topMessage = messageObject;
                            messageObject.generateThumbs(false);
                            quickReply3.topMessage.applyQuickReply(tL_quickReply.shortcut, tL_quickReply.shortcut_id);
                        }
                        arrayList8.add(quickReply3);
                    }
                    arrayList = arrayList8;
                } else {
                    boolean z3 = tLObject3 instanceof TLRPC.TL_messages_quickRepliesNotModified;
                }
                quickRepliesController2.loading = false;
                if (arrayList != null) {
                    ArrayList arrayList9 = quickRepliesController2.replies;
                    arrayList9.clear();
                    arrayList9.addAll(arrayList);
                }
                quickRepliesController2.loaded = true;
                quickRepliesController2.saveToCache();
                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
            case 18:
                int i18 = 0;
                while (true) {
                    cacheChatsExceptionsFragment = (CacheChatsExceptionsFragment) this.f$0;
                    ArrayList arrayList10 = cacheChatsExceptionsFragment.items;
                    int size2 = arrayList10.size();
                    keepMediaException = (CacheByChatsController.KeepMediaException) this.f$1;
                    if (i18 >= size2) {
                        i18 = 0;
                    } else if (((CacheChatsExceptionsFragment.Item) arrayList10.get(i18)).exception == null || ((CacheChatsExceptionsFragment.Item) arrayList10.get(i18)).exception.dialogId != keepMediaException.dialogId) {
                        i18++;
                    }
                }
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = cacheChatsExceptionsFragment.recyclerListView.findViewHolderForAdapterPosition(i18);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    KeepMediaPopupView keepMediaPopupView = new KeepMediaPopupView(cacheChatsExceptionsFragment.getParentActivity(), cacheChatsExceptionsFragment);
                    keepMediaPopupView.currentType = -1;
                    keepMediaPopupView.gap.setVisibility(0);
                    keepMediaPopupView.delete.setVisibility(8);
                    keepMediaPopupView.description.setVisibility(0);
                    keepMediaPopupView.exceptionsView.setVisibility(8);
                    View view2 = viewHolderFindViewHolderForAdapterPosition.itemView;
                    keepMediaPopupView.setParentWindow(AlertsCreator.createSimplePopup(cacheChatsExceptionsFragment, keepMediaPopupView, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    keepMediaPopupView.setCallback(new CacheChatsExceptionsFragment$$ExternalSyntheticLambda3(cacheChatsExceptionsFragment, keepMediaException, 1));
                    return;
                }
                return;
            case 19:
                ((CacheControlActivity) this.f$0).lambda$cleanupDialogFiles$22((AlertDialog) this.f$1);
                return;
            case 20:
                QRCodeBottomSheet qRCodeBottomSheet = new QRCodeBottomSheet((Context) this.f$0, LocaleController.getString(R.string.InviteByQRCode), ((String[]) this.f$1)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                qRCodeBottomSheet.setCenterAnimation(R.raw.qr_code_logo);
                qRCodeBottomSheet.show();
                return;
            case 21:
                CallLogActivity.AnonymousClass3 anonymousClass4 = (CallLogActivity.AnonymousClass3) this.f$0;
                anonymousClass4.getClass();
                CallLogActivity.this.getCalls(((TLRPC.Message) zziq.m(1, ((CallLogActivity.CallLogRow) this.f$1).calls)).id, 100);
                return;
            case 22:
                CameraScanActivity cameraScanActivity = (CameraScanActivity) this.f$0;
                CameraScanActivity.CameraScanActivityDelegate cameraScanActivityDelegate = cameraScanActivity.delegate;
                if (cameraScanActivityDelegate != null) {
                    cameraScanActivityDelegate.didFindQr((String) this.f$1);
                }
                if (cameraScanActivity.currentType != 3) {
                    cameraScanActivity.finishFragment();
                    return;
                }
                return;
            case 23:
                CameraScanActivity cameraScanActivity2 = (CameraScanActivity) this.f$0;
                TextView textView = cameraScanActivity2.recognizedMrzView;
                MrzRecognizer.Result result = (MrzRecognizer.Result) this.f$1;
                textView.setText(result.rawMRZ);
                cameraScanActivity2.recognizedMrzView.animate().setDuration(200L).alpha(1.0f).setInterpolator(CubicBezierInterpolator.DEFAULT).start();
                CameraScanActivity.CameraScanActivityDelegate cameraScanActivityDelegate2 = cameraScanActivity2.delegate;
                if (cameraScanActivityDelegate2 != null) {
                    cameraScanActivityDelegate2.didFindMrzInfo(result);
                }
                AndroidUtilities.runOnUIThread(new CameraScanActivity$$ExternalSyntheticLambda0(cameraScanActivity2, i2), 1200L);
                return;
            case 24:
                CameraScanActivity cameraScanActivity3 = (CameraScanActivity) this.f$0;
                cameraScanActivity3.getClass();
                ChatActivity.AnonymousClass117 anonymousClass117 = (ChatActivity.AnonymousClass117) this.f$1;
                RectF rectF = (RectF) anonymousClass117.val$finalReactionsLayout;
                PointF[] pointFArr = (PointF[]) anonymousClass117.this$0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = cameraScanActivity3.lastBoundsUpdate;
                RectF rectF2 = cameraScanActivity3.fromBounds;
                RectF rectF3 = cameraScanActivity3.bounds;
                PointF[] pointFArr2 = cameraScanActivity3.fromPoints;
                PointF[] pointFArr3 = cameraScanActivity3.points;
                if (j == 0) {
                    cameraScanActivity3.lastBoundsUpdate = jElapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        CameraScanActivity.setPointsFromBounds(rectF, pointFArr2);
                        CameraScanActivity.setPointsFromBounds(rectF, pointFArr3);
                    } else {
                        for (int i19 = 0; i19 < 4; i19++) {
                            PointF pointF = pointFArr2[i19];
                            PointF pointF2 = pointFArr[i19];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i19];
                            PointF pointF4 = pointFArr[i19];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j2 = jElapsedRealtime - j;
                        if (j2 < 75) {
                            float fMin = Math.min(1.0f, Math.max(0.0f, j2 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, fMin, rectF2);
                            for (int i20 = 0; i20 < 4; i20++) {
                                PointF pointF5 = pointFArr2[i20];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i20].x, fMin), AndroidUtilities.lerp(pointFArr2[i20].y, pointFArr3[i20].y, fMin));
                            }
                        } else {
                            rectF2.set(rectF3);
                            for (i = 0; i < 4; i++) {
                                PointF pointF6 = pointFArr2[i];
                                PointF pointF7 = pointFArr3[i];
                                pointF6.set(pointF7.x, pointF7.y);
                            }
                        }
                    } else {
                        rectF2.set(rectF3);
                        while (i < 4) {
                            PointF pointF8 = pointFArr2[i];
                            PointF pointF9 = pointFArr3[i];
                            pointF8.set(pointF9.x, pointF9.y);
                        }
                    }
                    rectF3.set(rectF);
                    if (pointFArr == null) {
                        CameraScanActivity.setPointsFromBounds(rectF3, pointFArr3);
                    } else {
                        for (int i21 = 0; i21 < 4; i21++) {
                            PointF pointF10 = pointFArr3[i21];
                            PointF pointF11 = pointFArr[i21];
                            pointF10.set(pointF11.x, pointF11.y);
                        }
                    }
                    cameraScanActivity3.lastBoundsUpdate = jElapsedRealtime;
                }
                cameraScanActivity3.fragmentView.invalidate();
                return;
            case 25:
                ChannelRecommendationsCell channelRecommendationsCell = (ChannelRecommendationsCell) this.f$0;
                ChannelRecommendationsCell.ChannelBlock channelBlock = channelRecommendationsCell.longPressedBlock;
                if (((ChannelRecommendationsCell.ChannelBlock) this.f$1) == channelBlock) {
                    channelBlock.bounce.setPressed(false);
                    ChannelRecommendationsCell.ChannelBlock channelBlock2 = channelRecommendationsCell.longPressedBlock;
                    boolean z4 = channelBlock2.isLock;
                    ChatMessageCell chatMessageCell = channelRecommendationsCell.cell;
                    if (z4) {
                        if (chatMessageCell.getDelegate() != null) {
                            chatMessageCell.getDelegate().didPressMoreChannelRecommendations();
                        }
                    } else if (chatMessageCell.getDelegate() != null) {
                        chatMessageCell.getDelegate().didPressChannelRecommendation(chatMessageCell, channelBlock2.chat, true);
                    }
                }
                channelRecommendationsCell.longPressedBlock = null;
                channelRecommendationsCell.longPressRunnable = null;
                channelRecommendationsCell.scrolling = false;
                channelRecommendationsCell.maybeScrolling = false;
                channelRecommendationsCell.closeBounce.setPressed(false);
                VelocityTracker velocityTracker = channelRecommendationsCell.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    channelRecommendationsCell.velocityTracker = null;
                    return;
                }
                return;
            case 26:
                ChatActionCell chatActionCell = (ChatActionCell) this.f$0;
                TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
                tL_resolveStarGiftOffer.offer_msg_id = chatActionCell.getMessageObject().getId();
                tL_resolveStarGiftOffer.decline = true;
                ConnectionsManager.getInstance(chatActionCell.currentAccount).sendRequestTyped(tL_resolveStarGiftOffer, new OAuthSheet$$ExternalSyntheticLambda18(i3, chatActionCell, (BaseFragment) this.f$1));
                return;
            case 27:
                BulletinFactory.of((BaseFragment) this.f$0).showForError(false, (TLRPC.TL_error) this.f$1);
                return;
            case 28:
                ChatActionCell chatActionCell2 = (ChatActionCell) this.f$0;
                chatActionCell2.delegate.didOpenPremiumGiftChannel(chatActionCell2, ((TLRPC.TL_messageActionGiftCode) this.f$1).slug);
                return;
            default:
                ((ChatMessageCell) this.f$0).radialProgress.draw((Canvas) this.f$1);
                return;
        }
    }
}
