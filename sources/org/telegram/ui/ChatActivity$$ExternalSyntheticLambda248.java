package org.telegram.ui;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.Bundler;
import androidx.car.app.utils.RemoteUtils;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.messaging.Store;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.commonmark.parser.Parser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.tlutils.AmountUtils$Amount;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Cells.BotHelpCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.PollEditTextCell;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatAttachAlertPollLayout;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.ReactedUsersListView;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Storage.CacheModel;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;

public final class ChatActivity$$ExternalSyntheticLambda248 implements RemoteUtils.RemoteCall, SynchronizationGuard.CriticalSection, SQLiteEventStore.Function, SuccessContinuation, AlertDialog.OnButtonClickListener, RecyclerListView.OnItemLongClickListenerExtended, ReactedUsersListView.OnHeightChangedListener, AlertsCreator.ScheduleDatePickerDelegate, LanguageDetector.StringCallback, AvatarPreviewer.Callback, MessagesStorage.LongCallback, NumberPicker.OnValueChangeListener, ActionBarMenuItem.ActionBarMenuItemDelegate, DialogsActivity.DialogsActivityDelegate, PaymentFormActivity.PaymentFormCallback {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public ChatActivity$$ExternalSyntheticLambda248(Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
    }

    @Override
    public Object apply(Object obj) throws Throwable {
        long jInsert;
        Cursor cursor;
        LogEventDropped.Reason reason;
        LogEventDropped.Reason reason2;
        int i = 5;
        int i2 = 4;
        int i3 = 3;
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        int i4 = 2;
        Object obj2 = this.f$2;
        int i5 = 0;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        int i6 = 1;
        switch (this.$r8$classId) {
            case 4:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj4;
                long jSimpleQueryForLong = sQLiteEventStore.getDb().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore.getDb().compileStatement("PRAGMA page_count").simpleQueryForLong();
                AutoValue_EventStoreConfig autoValue_EventStoreConfig = sQLiteEventStore.config;
                long j = autoValue_EventStoreConfig.maxStorageSizeInBytes;
                AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) obj3;
                String str = autoValue_EventInternal.transportName;
                if (jSimpleQueryForLong >= j) {
                    sQLiteEventStore.recordLogEventDropped(1L, reason3, str);
                    return -1L;
                }
                AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) obj2;
                Long transportContextId = SQLiteEventStore.getTransportContextId(sQLiteDatabase, autoValue_TransportContext);
                if (transportContextId != null) {
                    jInsert = transportContextId.longValue();
                } else {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("backend_name", autoValue_TransportContext.backendName);
                    contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(autoValue_TransportContext.priority)));
                    contentValues.put("next_request_ms", (Integer) 0);
                    byte[] bArr = autoValue_TransportContext.extras;
                    if (bArr != null) {
                        contentValues.put("extras", Base64.encodeToString(bArr, 0));
                    }
                    jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                EncodedPayload encodedPayload = autoValue_EventInternal.encodedPayload;
                byte[] bArr2 = encodedPayload.bytes;
                int length = bArr2.length;
                int i7 = autoValue_EventStoreConfig.maxBlobByteSizePerRow;
                boolean z = length <= i7;
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("context_id", Long.valueOf(jInsert));
                contentValues2.put("transport_name", str);
                contentValues2.put("timestamp_ms", Long.valueOf(autoValue_EventInternal.eventMillis));
                contentValues2.put("uptime_ms", Long.valueOf(autoValue_EventInternal.uptimeMillis));
                contentValues2.put("payload_encoding", encodedPayload.encoding.name);
                contentValues2.put("code", autoValue_EventInternal.code);
                contentValues2.put("num_attempts", (Integer) 0);
                contentValues2.put("inline", Boolean.valueOf(z));
                contentValues2.put("payload", z ? bArr2 : new byte[0]);
                long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
                if (!z) {
                    int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i7));
                    for (int i8 = 1; i8 <= iCeil; i8++) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i8 - 1) * i7, Math.min(i8 * i7, bArr2.length));
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put("event_id", Long.valueOf(jInsert2));
                        contentValues3.put("sequence_num", Integer.valueOf(i8));
                        contentValues3.put("bytes", bArrCopyOfRange);
                        sQLiteDatabase.insert("event_payloads", null, contentValues3);
                    }
                }
                for (Map.Entry entry : DesugarCollections.unmodifiableMap(autoValue_EventInternal.autoMetadata).entrySet()) {
                    ContentValues contentValues4 = new ContentValues();
                    contentValues4.put("event_id", Long.valueOf(jInsert2));
                    contentValues4.put("name", (String) entry.getKey());
                    contentValues4.put("value", (String) entry.getValue());
                    sQLiteDatabase.insert("event_metadata", null, contentValues4);
                }
                return Long.valueOf(jInsert2);
            case 5:
                Cursor cursor2 = (Cursor) obj;
                SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) obj4;
                sQLiteEventStore2.getClass();
                while (cursor2.moveToNext()) {
                    long j2 = cursor2.getLong(0);
                    boolean z2 = cursor2.getInt(7) != 0;
                    GmsRpc gmsRpc = new GmsRpc();
                    gmsRpc.firebaseInstallations = new HashMap();
                    String string = cursor2.getString(i6);
                    if (string == null) {
                        throw new NullPointerException("Null transportName");
                    }
                    gmsRpc.app = string;
                    gmsRpc.userAgentPublisher = Long.valueOf(cursor2.getLong(i4));
                    gmsRpc.heartbeatInfo = Long.valueOf(cursor2.getLong(3));
                    if (z2) {
                        String string2 = cursor2.getString(4);
                        gmsRpc.rpc = new EncodedPayload(string2 == null ? SQLiteEventStore.PROTOBUF_ENCODING : new Encoding(string2), cursor2.getBlob(5));
                    } else {
                        String string3 = cursor2.getString(4);
                        Encoding encoding = string3 == null ? SQLiteEventStore.PROTOBUF_ENCODING : new Encoding(string3);
                        Cursor cursorQuery = sQLiteEventStore2.getDb().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j2)}, null, null, "sequence_num");
                        try {
                            ArrayList arrayList = new ArrayList();
                            int length2 = 0;
                            while (cursorQuery.moveToNext()) {
                                byte[] blob = cursorQuery.getBlob(0);
                                arrayList.add(blob);
                                length2 += blob.length;
                            }
                            byte[] bArr3 = new byte[length2];
                            int i9 = 0;
                            int length3 = 0;
                            while (i9 < arrayList.size()) {
                                byte[] bArr4 = (byte[]) arrayList.get(i9);
                                cursor = cursorQuery;
                                try {
                                    ArrayList arrayList2 = arrayList;
                                    System.arraycopy(bArr4, 0, bArr3, length3, bArr4.length);
                                    length3 += bArr4.length;
                                    i9++;
                                    cursorQuery = cursor;
                                    arrayList = arrayList2;
                                } catch (Throwable th) {
                                    th = th;
                                    cursor.close();
                                    throw th;
                                }
                            }
                            cursorQuery.close();
                            gmsRpc.rpc = new EncodedPayload(encoding, bArr3);
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursorQuery;
                        }
                    }
                    if (!cursor2.isNull(6)) {
                        gmsRpc.metadata = Integer.valueOf(cursor2.getInt(6));
                    }
                    ((ArrayList) obj3).add(new AutoValue_PersistedEvent(j2, (AutoValue_TransportContext) obj2, gmsRpc.build()));
                    i4 = 2;
                    i6 = 1;
                }
                return null;
            default:
                Cursor cursor3 = (Cursor) obj;
                SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) obj4;
                sQLiteEventStore3.getClass();
                while (true) {
                    HashMap map = (HashMap) obj3;
                    if (cursor3.moveToNext()) {
                        String string4 = cursor3.getString(i5);
                        int i10 = cursor3.getInt(1);
                        LogEventDropped.Reason reason4 = LogEventDropped.Reason.REASON_UNKNOWN;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                reason4 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                            } else if (i10 == 2) {
                                reason = reason3;
                                reason2 = reason;
                            } else if (i10 == i3) {
                                reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                            } else if (i10 == i2) {
                                reason4 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            } else if (i10 == i) {
                                reason4 = LogEventDropped.Reason.INVALID_PAYLOD;
                            } else if (i10 == 6) {
                                reason4 = LogEventDropped.Reason.SERVER_ERROR;
                            } else {
                                Logging.d(Integer.valueOf(i10), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                            }
                            reason2 = reason3;
                            reason = reason4;
                        } else {
                            reason2 = reason3;
                            reason = reason4;
                        }
                        long j3 = cursor3.getLong(2);
                        if (!map.containsKey(string4)) {
                            map.put(string4, new ArrayList());
                        }
                        ((List) map.get(string4)).add(new LogEventDropped(j3, reason));
                        reason3 = reason2;
                        i = 5;
                        i2 = 4;
                        i3 = 3;
                        i5 = 0;
                    } else {
                        Iterator it = map.entrySet().iterator();
                        while (true) {
                            Parser parser = (Parser) obj2;
                            if (!it.hasNext()) {
                                long time = sQLiteEventStore3.wallClock.getTime();
                                SQLiteDatabase db = sQLiteEventStore3.getDb();
                                db.beginTransaction();
                                try {
                                    Cursor cursorRawQuery = db.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                    try {
                                        cursorRawQuery.moveToNext();
                                        TimeWindow timeWindow = new TimeWindow(cursorRawQuery.getLong(0), time);
                                        cursorRawQuery.close();
                                        db.setTransactionSuccessful();
                                        db.endTransaction();
                                        parser.delimiterProcessors = timeWindow;
                                        parser.postProcessors = new GlobalMetrics(new StorageMetrics(sQLiteEventStore3.getDb().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore3.getDb().compileStatement("PRAGMA page_count").simpleQueryForLong(), AutoValue_EventStoreConfig.DEFAULT.maxStorageSizeInBytes));
                                        parser.inlineParserFactory = (String) sQLiteEventStore3.packageName.get();
                                        return new ClientMetrics((TimeWindow) parser.delimiterProcessors, DesugarCollections.unmodifiableList((ArrayList) parser.blockParserFactories), (GlobalMetrics) parser.postProcessors, (String) parser.inlineParserFactory);
                                    } catch (Throwable th3) {
                                        cursorRawQuery.close();
                                        throw th3;
                                    }
                                } catch (Throwable th4) {
                                    db.endTransaction();
                                    throw th4;
                                }
                            }
                            Map.Entry entry2 = (Map.Entry) it.next();
                            int i11 = LogSourceMetrics.$r8$clinit;
                            new ArrayList();
                            ((ArrayList) parser.blockParserFactories).add(new LogSourceMetrics((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
                        }
                    }
                }
                break;
        }
    }

    @Override
    public Object call() {
        Bundleable bundleable;
        switch (this.$r8$classId) {
            case 1:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f$0;
                Object obj = this.f$1;
                if (obj == null) {
                    bundleable = null;
                } else {
                    try {
                        bundleable = new Bundleable(obj);
                    } catch (Bundler.TracedBundlerException e) {
                        RemoteUtils.sendFailureResponseToHost(iOnDoneCallback, (String) this.f$2, e);
                        return null;
                    }
                }
                iOnDoneCallback.onSuccess(bundleable);
                break;
            default:
                try {
                    ((IOnDoneCallback) this.f$0).onFailure(new Bundleable(new FailureResponse((Exception) this.f$1)));
                } catch (Bundler.TracedBundlerException e2) {
                    Log.e("CarApp.Dispatch", "Serialization failure in ".concat((String) this.f$2), e2);
                    return null;
                }
                break;
        }
        return null;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        switch (this.$r8$classId) {
            case 10:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                chatActivity.sendBotInlineResult((TLRPC.BotInlineResult) this.f$1, z, i, ((Long) this.f$2).longValue());
                break;
            case 11:
                ((ChatActivity) this.f$0).lambda$processSelectedOption$352((MessageObject.GroupedMessages) this.f$1, (MessageObject) this.f$2, i, i2);
                break;
            case 13:
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                chatActivity2.getClass();
                if (z) {
                    TLRPC.SuggestedPost suggestedPost = (TLRPC.SuggestedPost) this.f$1;
                    TLRPC.SuggestedPost tl = MessageSuggestionParams.of(AmountUtils$Amount.of(suggestedPost != null ? suggestedPost.price : null), i).toTl();
                    MessageObject messageObject = (MessageObject) this.f$2;
                    if (messageObject != null && messageObject.messageOwner != null && tl != null) {
                        chatActivity2.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
                        break;
                    }
                }
                break;
            case 27:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = (ChatAttachAlertLocationLayout) this.f$0;
                chatAttachAlertLocationLayout.delegate.didSelectLocation((TLRPC.TL_messageMediaGeo) this.f$1, chatAttachAlertLocationLayout.locationType, z, i, ((Long) this.f$2).longValue());
                chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                break;
            default:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.delegate.sendPoll((TLRPC.TL_messageMediaToDo) this.f$1, null, null, null, z, i, ((Long) this.f$2).longValue());
                chatAttachAlertPollLayout.parentAlert.dismiss(true);
                break;
        }
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
        chatActivityEnterView.getClass();
        TLRPC.Message message = ((MessageObject) this.f$1).messageOwner;
        long j = message.from_id.user_id;
        long j2 = message.via_bot_id;
        if (j2 != 0) {
            j = j2;
        }
        TLRPC.User user = chatActivityEnterView.accountInstance.getMessagesController().getUser(Long.valueOf(j));
        if (user == null) {
            dialogsActivity.finishFragment();
            return true;
        }
        long j3 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        MediaDataController.getInstance(chatActivityEnterView.currentAccount).saveDraft(j3, 0, "@" + UserObject.getPublicUsername(user) + " " + ((TL_keyboard.TL_inlineButtonTypeSwitchInline) this.f$2).query, null, null, true, 0L);
        if (j3 == chatActivityEnterView.dialog_id) {
            dialogsActivity.finishFragment();
            return true;
        }
        if (DialogObject.isEncryptedDialog(j3)) {
            dialogsActivity.finishFragment();
            return true;
        }
        Bundle bundle = new Bundle();
        if (DialogObject.isUserDialog(j3)) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        if (chatActivityEnterView.accountInstance.getMessagesController().checkCanOpenChat(bundle, dialogsActivity)) {
            ChatActivity chatActivity = new ChatActivity(bundle);
            ChatActivity chatActivity2 = chatActivityEnterView.parentFragment;
            if (!chatActivity2.presentFragment(chatActivity, true)) {
                dialogsActivity.finishFragment();
                return true;
            }
            if (!AndroidUtilities.isTablet()) {
                chatActivity2.removeSelfFromStack();
            }
        }
        return true;
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public Object execute() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.f$0;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) defaultScheduler.eventStore;
        sQLiteEventStore.getClass();
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
        AutoValue_EventInternal autoValue_EventInternal = (AutoValue_EventInternal) this.f$2;
        String tag = Logging.getTag("SQLiteEventStore");
        if (Log.isLoggable(tag, 3)) {
            Log.d(tag, "Storing event with priority=" + autoValue_TransportContext.priority + ", name=" + autoValue_EventInternal.transportName + " for destination " + autoValue_TransportContext.backendName);
        }
        ((Long) sQLiteEventStore.inTransaction(new ChatActivity$$ExternalSyntheticLambda248(sQLiteEventStore, autoValue_EventInternal, autoValue_TransportContext, 4))).getClass();
        defaultScheduler.workScheduler.schedule(autoValue_TransportContext, 1, false);
        return null;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 8:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                ((boolean[]) this.f$1)[0] = true;
                TLRPC.User user = (TLRPC.User) this.f$2;
                if (user != null) {
                    MessagesController.getNotificationsSettings(mentionsAdapter.currentAccount).edit().putBoolean("inlinegeo_" + user.id, true).commit();
                    mentionsAdapter.checkLocationPermissionsOrStart();
                }
                break;
            case 16:
                ChatEditTypeActivity.UsernamesListView.AnonymousClass1 anonymousClass1 = (ChatEditTypeActivity.UsernamesListView.AnonymousClass1) this.f$0;
                anonymousClass1.getClass();
                TLRPC.TL_username tL_username = (TLRPC.TL_username) this.f$1;
                boolean z = tL_username.editable;
                ChatEditTypeActivity.UsernamesListView usernamesListView = ChatEditTypeActivity.UsernamesListView.this;
                if (z) {
                    ChatEditTypeActivity chatEditTypeActivity = ChatEditTypeActivity.this;
                    if (chatEditTypeActivity.editableUsernameWasActive == null) {
                        chatEditTypeActivity.editableUsernameWasActive = Boolean.valueOf(tL_username.active);
                    }
                    tL_username.active = !tL_username.active;
                } else {
                    TLRPC.TL_channels_toggleUsername tL_channels_toggleUsername = new TLRPC.TL_channels_toggleUsername();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    ChatEditTypeActivity chatEditTypeActivity2 = ChatEditTypeActivity.this;
                    TLRPC.Chat chat = chatEditTypeActivity2.currentChat;
                    tL_inputChannel.channel_id = chat.id;
                    tL_inputChannel.access_hash = chat.access_hash;
                    tL_channels_toggleUsername.channel = tL_inputChannel;
                    tL_channels_toggleUsername.username = tL_username.username;
                    boolean z2 = tL_username.active;
                    tL_channels_toggleUsername.active = !z2;
                    chatEditTypeActivity2.getConnectionsManager().sendRequest(tL_channels_toggleUsername, new ChatActivity$$ExternalSyntheticLambda471(anonymousClass1, tL_channels_toggleUsername, tL_username, z2, 2));
                    ChatEditTypeActivity.this.loadingUsernames.add(tL_username.username);
                    ((ChangeUsernameActivity.UsernameCell) ((View) this.f$2)).setLoading(true);
                }
                ChatEditTypeActivity.this.checkDoneButton();
                break;
            case 17:
                ChatLinkActivity chatLinkActivity = (ChatLinkActivity) this.f$0;
                chatLinkActivity.getClass();
                boolean z3 = ((TLRPC.ChatFull) this.f$1).hidden_prehistory;
                TLRPC.Chat chat2 = (TLRPC.Chat) this.f$2;
                if (z3) {
                    chatLinkActivity.getMessagesController().toggleChannelInvitesHistory(chat2.id, false);
                }
                chatLinkActivity.linkChat(chat2, null);
                break;
            case 23:
                int i2 = Build.VERSION.SDK_INT;
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.f$0;
                MessageObject messageObject = (MessageObject) this.f$1;
                TL_keyboard.KeyboardButtonProto keyboardButtonProto = (TL_keyboard.KeyboardButtonProto) this.f$2;
                if (i2 >= 23) {
                    Activity activity = chatActivityEnterView.parentActivity;
                    if (activity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                        activity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
                        chatActivityEnterView.pendingMessageObject = messageObject;
                        chatActivityEnterView.pendingLocationButton = keyboardButtonProto;
                    }
                }
                SendMessagesHelper.getInstance(chatActivityEnterView.currentAccount).sendCurrentLocation(messageObject, keyboardButtonProto);
                break;
            case 25:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
                int i3 = chatAttachAlert.currentAccount;
                TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) this.f$1;
                TLRPC.User user2 = (TLRPC.User) this.f$2;
                if (tL_attachMenuBot == null) {
                    MediaDataController.getInstance(i3).removeInline(user2.id);
                } else {
                    TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                    tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i3).getInputUser(user2);
                    tL_messages_toggleBotInAttachMenu.enabled = false;
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_toggleBotInAttachMenu, new ChatActivity$$ExternalSyntheticLambda208(26, chatAttachAlert, tL_attachMenuBot), 66);
                }
                break;
            default:
                ChatAttachAlertPollLayout chatAttachAlertPollLayout = (ChatAttachAlertPollLayout) this.f$0;
                chatAttachAlertPollLayout.getClass();
                View view = (View) this.f$1;
                view.setTag(null);
                chatAttachAlertPollLayout.deletePollAnswerView(view, (PollEditTextCell) this.f$2, false);
                break;
        }
    }

    @Override
    public void onHeightChanged(ReactedUsersListView reactedUsersListView, int i) {
        int measuredHeight;
        FrameLayout frameLayout = (FrameLayout) this.f$0;
        if (frameLayout != null) {
            int measuredWidth = frameLayout.getMeasuredWidth();
            int measuredHeight2 = frameLayout.getMeasuredHeight();
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(reactedUsersListView.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight = frameLayout.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        } else {
            measuredHeight = 0;
        }
        ((ActionBarPopupWindow.ActionBarPopupWindowLayout) this.f$1).getSwipeBack().setNewForegroundHeight(((int[]) this.f$2)[0], RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(measuredHeight, 52.0f, i), true);
    }

    @Override
    public void onInvoiceStatusChanged(int i) {
        String str;
        if (i != 3) {
            ((OverlayActionBarLayoutDialog) this.f$0).dismiss();
        }
        BotWebViewContainer webViewContainer = ((ChatAttachAlertBotWebViewLayout) this.f$1).getWebViewContainer();
        if (i == 1) {
            str = "PAID";
        } else if (i == 2) {
            str = "CANCELLED";
        } else if (i == 3) {
            str = "PENDING";
        } else {
            if (i != 4) {
                throw null;
            }
            str = "FAILED";
        }
        webViewContainer.onInvoiceStatusUpdate((String) this.f$2, str.toLowerCase(Locale.ROOT), false);
    }

    @Override
    public void onItemClick(int i) {
        if (i == 1) {
            ((AlertsCreator.ScheduleDatePickerDelegate) this.f$0).didSelectDate(2147483646, 0, ((boolean[]) this.f$1)[0]);
            ((BottomSheet.Builder) this.f$2).bottomSheet.dismissRunnable.run();
        }
    }

    @Override
    public void onLongClickRelease() {
    }

    @Override
    public void onMenuClick(AvatarPreviewer.MenuItem menuItem) {
        switch (this.$r8$classId) {
            case 14:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate.getClass();
                int iOrdinal = menuItem.ordinal();
                TLRPC.User user = (TLRPC.User) this.f$2;
                if (iOrdinal == 0) {
                    chatMessageCellDelegate.openProfile(user, false);
                    break;
                } else {
                    ChatActivity chatActivity = ChatActivity.this;
                    if (iOrdinal == 3) {
                        if (user != null) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("user_id", user.id);
                            if (chatActivity.getMessagesController().checkCanOpenChat(bundle, chatActivity, ((ChatMessageCell) this.f$1).getMessageObject())) {
                                chatActivity.presentFragment(new ChatActivity(bundle));
                            }
                        }
                        break;
                    } else if (iOrdinal == 4) {
                        chatMessageCellDelegate.appendMention(user);
                        break;
                    } else if (iOrdinal == 5) {
                        chatActivity.openSearchWithUser(user);
                        break;
                    }
                }
                break;
            default:
                ChatActivity.ChatMessageCellDelegate chatMessageCellDelegate2 = (ChatActivity.ChatMessageCellDelegate) this.f$0;
                chatMessageCellDelegate2.getClass();
                int iOrdinal2 = menuItem.ordinal();
                ChatActivity chatActivity2 = ChatActivity.this;
                TLRPC.Chat chat = (TLRPC.Chat) this.f$1;
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1 || iOrdinal2 == 2) {
                        chatMessageCellDelegate2.openChat((ChatMessageCell) this.f$2, chat, 0, false);
                        break;
                    } else if (iOrdinal2 == 4) {
                        chatMessageCellDelegate2.appendMention(chat);
                        break;
                    } else if (iOrdinal2 == 5) {
                        chatActivity2.openSearchWithChat(chat);
                        break;
                    }
                } else {
                    if (chat != null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("chat_id", chat.id);
                        bundle2.putBoolean("expandPhoto", false);
                        chatActivity2.presentFragment(new ProfileActivity(bundle2, null));
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public void onMove(float f) {
    }

    @Override
    public void onValueChange(NumberPicker numberPicker, int i) {
        switch (this.$r8$classId) {
            case 19:
                AlertsCreator.checkScheduleDate(null, null, 0L, 0L, 0, (NumberPicker) this.f$0, (AlertsCreator.AnonymousClass41) this.f$1, (AlertsCreator.AnonymousClass42) this.f$2);
                break;
            default:
                AlertsCreator.checkScheduleDate(null, null, 0L, 0L, 0, (NumberPicker) this.f$0, (AlertsCreator.AnonymousClass29) this.f$1, (AlertsCreator.AnonymousClass30) this.f$2);
                break;
        }
    }

    @Override
    public void run(long j) {
        ((ChatRightsEditActivity) this.f$0).lambda$initTransfer$13((TLRPC.TL_inputCheckPasswordSRP) this.f$1, (TwoStepVerificationActivity) this.f$2, j);
    }

    @Override
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f$0;
        String str = (String) this.f$1;
        Store.Token token = (Store.Token) this.f$2;
        String str2 = (String) obj;
        Store store = FirebaseMessaging.getStore(firebaseMessaging.context);
        FirebaseApp firebaseApp = firebaseMessaging.firebaseApp;
        firebaseApp.checkNotDeleted();
        String persistenceKey = "[DEFAULT]".equals(firebaseApp.name) ? "" : firebaseApp.getPersistenceKey();
        String appVersionCode = firebaseMessaging.metadata.getAppVersionCode();
        synchronized (store) {
            String strEncode = Store.Token.encode(System.currentTimeMillis(), str2, appVersionCode);
            if (strEncode != null) {
                SharedPreferences.Editor editorEdit = store.store.edit();
                editorEdit.putString(persistenceKey + "|T|" + str + "|*", strEncode);
                editorEdit.commit();
            }
        }
        if (token == null || !str2.equals(token.token)) {
            FirebaseApp firebaseApp2 = firebaseMessaging.firebaseApp;
            firebaseApp2.checkNotDeleted();
            if ("[DEFAULT]".equals(firebaseApp2.name)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    StringBuilder sb = new StringBuilder("Invoking onNewToken for app: ");
                    firebaseApp2.checkNotDeleted();
                    sb.append(firebaseApp2.name);
                    Log.d("FirebaseMessaging", sb.toString());
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", str2);
                new RequestDeduplicator(firebaseMessaging.context).process(intent);
            }
        }
        return Tasks.forResult(str2);
    }

    @Override
    public void run(String str) {
        ChatActivity chatActivity = (ChatActivity) this.f$0;
        String language = LocaleController.getInstance().getCurrentLocale().getLanguage();
        BotHelpCell botHelpCell = (BotHelpCell) this.f$1;
        if (str == null || ((str.equals(language) && !str.equals("und")) || RestrictedLanguagesSelectActivity.getRestrictedLanguages().contains(str))) {
            botHelpCell.setClickable(false);
        } else {
            botHelpCell.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(chatActivity, str, language, (CharSequence) this.f$2, botHelpCell, 3));
        }
    }

    @Override
    public boolean mo1082onItemClick(final View view, int i, float f, float f2) {
        final CachedMediaLayout.AnonymousClass1 anonymousClass1 = (CachedMediaLayout.AnonymousClass1) this.f$0;
        anonymousClass1.getClass();
        RecyclerListView recyclerListView = (RecyclerListView) this.f$1;
        CachedMediaLayout.BaseAdapter baseAdapter = (CachedMediaLayout.BaseAdapter) recyclerListView.getAdapter();
        final CachedMediaLayout.ItemInner itemInner = (CachedMediaLayout.ItemInner) baseAdapter.itemInners.get(i);
        boolean z = view instanceof CachedMediaLayout.MusicAdapter.AnonymousClass1;
        CachedMediaLayout cachedMediaLayout = CachedMediaLayout.this;
        if (!z && !(view instanceof SharedPhotoVideoCell2)) {
            CachedMediaLayout.Delegate delegate = cachedMediaLayout.delegate;
            if (delegate != null) {
                delegate.onItemSelected(itemInner.entities, itemInner.file, true);
            }
            return true;
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(cachedMediaLayout.getContext());
        if (view instanceof SharedPhotoVideoCell2) {
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda6(anonymousClass1, itemInner, baseAdapter, recyclerListView, view, 1));
        } else if (((CachedMediaLayout.MusicAdapter.AnonymousClass1) view).container.getChildAt(0) instanceof SharedAudioCell) {
            final int i2 = 0;
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_played, LocaleController.getString(R.string.PlayFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i2) {
                        case 0:
                            CachedMediaLayout.AnonymousClass1 anonymousClass2 = anonymousClass1;
                            anonymousClass2.getClass();
                            CachedMediaLayout.access$700(CachedMediaLayout.this, itemInner.file, (CachedMediaLayout.MusicAdapter.AnonymousClass1) view);
                            ActionBarPopupWindow actionBarPopupWindow = anonymousClass2.popupWindow;
                            if (actionBarPopupWindow != null) {
                                actionBarPopupWindow.dismiss(true);
                            }
                            break;
                        default:
                            CachedMediaLayout.AnonymousClass1 anonymousClass3 = anonymousClass1;
                            anonymousClass3.getClass();
                            CachedMediaLayout.access$700(CachedMediaLayout.this, itemInner.file, (CachedMediaLayout.MusicAdapter.AnonymousClass1) view);
                            ActionBarPopupWindow actionBarPopupWindow2 = anonymousClass3.popupWindow;
                            if (actionBarPopupWindow2 != null) {
                                actionBarPopupWindow2.dismiss(true);
                            }
                            break;
                    }
                }
            });
        } else {
            final int i3 = 1;
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_view_file, LocaleController.getString(R.string.CacheOpenFile), false, null).setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    switch (i3) {
                        case 0:
                            CachedMediaLayout.AnonymousClass1 anonymousClass2 = anonymousClass1;
                            anonymousClass2.getClass();
                            CachedMediaLayout.access$700(CachedMediaLayout.this, itemInner.file, (CachedMediaLayout.MusicAdapter.AnonymousClass1) view);
                            ActionBarPopupWindow actionBarPopupWindow = anonymousClass2.popupWindow;
                            if (actionBarPopupWindow != null) {
                                actionBarPopupWindow.dismiss(true);
                            }
                            break;
                        default:
                            CachedMediaLayout.AnonymousClass1 anonymousClass3 = anonymousClass1;
                            anonymousClass3.getClass();
                            CachedMediaLayout.access$700(CachedMediaLayout.this, itemInner.file, (CachedMediaLayout.MusicAdapter.AnonymousClass1) view);
                            ActionBarPopupWindow actionBarPopupWindow2 = anonymousClass3.popupWindow;
                            if (actionBarPopupWindow2 != null) {
                                actionBarPopupWindow2.dismiss(true);
                            }
                            break;
                    }
                }
            });
        }
        CacheModel.FileInfo fileInfo = itemInner.file;
        long j = fileInfo.dialogId;
        BaseFragment baseFragment = (BaseFragment) this.f$2;
        if (j != 0 && fileInfo.messageId != 0) {
            ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_viewintopic, LocaleController.getString(R.string.ViewInChat), false, null).setOnClickListener(new ChatActivity$$ExternalSyntheticLambda62(anonymousClass1, itemInner, baseFragment, 4));
        }
        ActionBarMenuItem.addItem(false, false, actionBarPopupWindowLayout, R.drawable.msg_select, LocaleController.getString(!cachedMediaLayout.cacheModel.selectedFiles.contains(itemInner.file) ? R.string.Select : R.string.Deselect), false, null).setOnClickListener(new ChatActivity$$ExternalSyntheticLambda77(15, anonymousClass1, itemInner));
        anonymousClass1.popupWindow = AlertsCreator.createSimplePopup(baseFragment, actionBarPopupWindowLayout, view, (int) f, (int) f2);
        cachedMediaLayout.getRootView().dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        return true;
    }
}
