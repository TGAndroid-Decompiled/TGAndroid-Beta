package org.telegram.ui.iv;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.webkit.JsPromptResult;
import androidx.car.app.FailureResponse;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.serialization.Bundleable;
import androidx.car.app.serialization.Bundler;
import androidx.car.app.utils.RemoteUtils;
import androidx.emoji2.text.MetadataRepo;
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
import com.google.firebase.messaging.Store$Token;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.flow.SafeFlow;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Cells.SharedPhotoVideoCell2;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda140;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesViewPager;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22;

public final class RichEditor$$ExternalSyntheticLambda60 implements RemoteUtils.RemoteCall, SynchronizationGuard.CriticalSection, SQLiteEventStore.Function, SuccessContinuation, AlertDialog.OnButtonClickListener, MessagesStorage.BooleanCallback, DialogsActivity.DialogsActivityDelegate, MessagesStorage.StringCallback, StoryViewer.HolderDrawAbove, PaymentFormActivity.PaymentFormCallback, ChatAttachAlertLocationLayout.LocationActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;

    public RichEditor$$ExternalSyntheticLambda60(Object obj, Object obj2, Object obj3, int i) {
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
                            MetadataRepo metadataRepo = (MetadataRepo) obj2;
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
                                        metadataRepo.mMetadataList = timeWindow;
                                        metadataRepo.mRootNode = new GlobalMetrics(new StorageMetrics(sQLiteEventStore3.getDb().compileStatement("PRAGMA page_size").simpleQueryForLong() * sQLiteEventStore3.getDb().compileStatement("PRAGMA page_count").simpleQueryForLong(), AutoValue_EventStoreConfig.DEFAULT.maxStorageSizeInBytes));
                                        metadataRepo.mTypeface = (String) sQLiteEventStore3.packageName.get();
                                        return new ClientMetrics((TimeWindow) metadataRepo.mMetadataList, DesugarCollections.unmodifiableList((ArrayList) metadataRepo.mEmojiCharArray), (GlobalMetrics) metadataRepo.mRootNode, (String) metadataRepo.mTypeface);
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
                            ((ArrayList) metadataRepo.mEmojiCharArray).add(new LogSourceMetrics((String) entry2.getKey(), DesugarCollections.unmodifiableList((List) entry2.getValue())));
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
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        return ((StarGiftSheet) this.f$0).lambda$openSetAsTheme$17((TL_stars.TL_starGiftUnique) this.f$1, (DialogsActivity) this.f$2, arrayList);
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        switch (this.$r8$classId) {
            case 0:
                RichEditor richEditor = (RichEditor) this.f$0;
                if (messageMedia != null && messageMedia.geo != null) {
                    RichEditorHistory richEditorHistory = richEditor.listView.history;
                    if (richEditorHistory != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory.commitRunnable);
                        richEditorHistory.commit();
                    }
                    BlockRow blockRow = (BlockRow) this.f$1;
                    TL_iv.pageBlockMap pageblockmap = (TL_iv.pageBlockMap) blockRow.block;
                    pageblockmap.geo = messageMedia.geo;
                    pageblockmap.zoom = 15;
                    if (pageblockmap.w <= 0 || pageblockmap.h <= 0) {
                        pageblockmap.w = 600;
                        pageblockmap.h = 400;
                    }
                    RichEditorHistory richEditorHistory2 = richEditor.listView.history;
                    if (richEditorHistory2 != null) {
                        richEditorHistory2.record();
                    }
                    ((ChatAttachAlert) this.f$2).dismiss(true);
                    richEditor.listView.post(new RichEditor$$ExternalSyntheticLambda31(richEditor, blockRow, 9));
                    break;
                }
                break;
            default:
                ChatAttachAlertRichLayout chatAttachAlertRichLayout = (ChatAttachAlertRichLayout) this.f$0;
                chatAttachAlertRichLayout.getClass();
                if (messageMedia != null && messageMedia.geo != null) {
                    RichEditorListView richEditorListView = chatAttachAlertRichLayout.listView;
                    RichEditorHistory richEditorHistory3 = richEditorListView.history;
                    if (richEditorHistory3 != null) {
                        AndroidUtilities.cancelRunOnUIThread(richEditorHistory3.commitRunnable);
                        richEditorHistory3.commit();
                    }
                    BlockRow blockRow2 = (BlockRow) this.f$1;
                    TL_iv.pageBlockMap pageblockmap2 = (TL_iv.pageBlockMap) blockRow2.block;
                    pageblockmap2.geo = messageMedia.geo;
                    pageblockmap2.zoom = 15;
                    if (pageblockmap2.w <= 0 || pageblockmap2.h <= 0) {
                        pageblockmap2.w = 600;
                        pageblockmap2.h = 400;
                    }
                    RichEditorHistory richEditorHistory4 = richEditorListView.history;
                    if (richEditorHistory4 != null) {
                        richEditorHistory4.record();
                    }
                    chatAttachAlertRichLayout.updateAttachButtons(true);
                    ((ChatAttachAlert) this.f$2).dismiss(true);
                    richEditorListView.post(new ChatAttachAlertRichLayout$$ExternalSyntheticLambda25(chatAttachAlertRichLayout, blockRow2, 9));
                    break;
                }
                break;
        }
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void draw(Canvas canvas, RectF rectF, float f, boolean z) {
        SharedPhotoVideoCell2 sharedPhotoVideoCell2 = (SharedPhotoVideoCell2) this.f$0;
        sharedPhotoVideoCell2.drawDuration(canvas, rectF, f);
        sharedPhotoVideoCell2.drawViews(canvas, rectF, f);
        if (sharedPhotoVideoCell2.isSearchingHashtag) {
            sharedPhotoVideoCell2.drawAuthor(canvas, rectF, f);
        } else {
            sharedPhotoVideoCell2.drawPrivacy(canvas, rectF, f);
        }
        RecyclerListView.FastScroll fastScroll = (RecyclerListView.FastScroll) this.f$1;
        if (fastScroll != null && fastScroll.isVisible && fastScroll.getVisibility() == 0) {
            canvas.saveLayerAlpha(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), (int) (f * 255.0f), 31);
            int[] iArr = (int[]) this.f$2;
            canvas.translate(iArr[0], iArr[1]);
            fastScroll.draw(canvas);
            canvas.restore();
        }
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
        ((Long) sQLiteEventStore.inTransaction(new RichEditor$$ExternalSyntheticLambda60(sQLiteEventStore, autoValue_EventInternal, autoValue_TransportContext, 4))).getClass();
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
            case 9:
                ((LimitReachedBottomSheet) this.f$0).lambda$leaveFromSelectedGroups$21((ArrayList) this.f$1, (TLRPC.User) this.f$2, alertDialog, i);
                break;
            case 14:
                Activity activity = (Activity) this.f$0;
                boolean[] zArr = (boolean[]) this.f$1;
                BotWebViewContainer$$ExternalSyntheticLambda22 botWebViewContainer$$ExternalSyntheticLambda22 = (BotWebViewContainer$$ExternalSyntheticLambda22) this.f$2;
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    activity.startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                }
                zArr[0] = true;
                Boolean bool = Boolean.FALSE;
                botWebViewContainer$$ExternalSyntheticLambda22.run(bool, bool);
                break;
            case 17:
                String strTrim = ((EditTextBoldCursor) this.f$0).getText().toString().trim();
                String strTrim2 = ((EditTextBoldCursor) this.f$1).getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim) && !TextUtils.isEmpty(strTrim2)) {
                    RichInlineButtonEditor$$ExternalSyntheticLambda10 richInlineButtonEditor$$ExternalSyntheticLambda10 = (RichInlineButtonEditor$$ExternalSyntheticLambda10) this.f$2;
                    switch (richInlineButtonEditor$$ExternalSyntheticLambda10.$r8$classId) {
                        case 0:
                            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = new TL_keyboard.TL_inlineButtonTypeUrl();
                            tL_inlineButtonTypeUrl.url = strTrim2;
                            richInlineButtonEditor$$ExternalSyntheticLambda10.f$0.apply(strTrim, tL_inlineButtonTypeUrl);
                            break;
                        default:
                            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = new TL_keyboard.TL_inlineButtonTypeCopy();
                            tL_inlineButtonTypeCopy.copy_text = strTrim2;
                            richInlineButtonEditor$$ExternalSyntheticLambda10.f$0.apply(strTrim, tL_inlineButtonTypeCopy);
                            break;
                    }
                }
                break;
            default:
                boolean[] zArr2 = (boolean[]) this.f$0;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((JsPromptResult) this.f$1).confirm(((EditTextCaption) this.f$2).getText().toString());
                }
                break;
        }
    }

    @Override
    public void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
        BotWebViewSheet.AnonymousClass3 anonymousClass3 = (BotWebViewSheet.AnonymousClass3) this.f$0;
        anonymousClass3.getClass();
        if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
            ((OverlayActionBarLayoutDialog) this.f$1).dismiss();
        }
        BotWebViewSheet.this.webViewContainer.onInvoiceStatusUpdate((String) this.f$2, invoiceStatus.name().toLowerCase(Locale.ROOT));
    }

    @Override
    public void run(String str) {
        PeerStoriesView.AnonymousClass8 anonymousClass8 = (PeerStoriesView.AnonymousClass8) this.f$0;
        StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = anonymousClass8.this$0;
        StoriesController storiesController = anonymousClass1.getStoriesController();
        long j = anonymousClass1.dialogId;
        storiesController.getStoryAlbumsList(j, true).createCollection(str, new StarGiftSheet$$ExternalSyntheticLambda140(anonymousClass8, (TL_stories.StoryItem) this.f$1, (DarkThemeResourceProvider) this.f$2, 6));
    }

    @Override
    public Task then(Object obj) {
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f$0;
        String str = (String) this.f$1;
        Store$Token store$Token = (Store$Token) this.f$2;
        String str2 = (String) obj;
        SafeFlow store = FirebaseMessaging.getStore(firebaseMessaging.context);
        FirebaseApp firebaseApp = firebaseMessaging.firebaseApp;
        firebaseApp.checkNotDeleted();
        String persistenceKey = "[DEFAULT]".equals(firebaseApp.name) ? "" : firebaseApp.getPersistenceKey();
        String appVersionCode = firebaseMessaging.metadata.getAppVersionCode();
        synchronized (store) {
            String strEncode = Store$Token.encode(System.currentTimeMillis(), str2, appVersionCode);
            if (strEncode != null) {
                SharedPreferences.Editor editorEdit = ((SharedPreferences) store.block).edit();
                editorEdit.putString(persistenceKey + "|T|" + str + "|*", strEncode);
                editorEdit.commit();
            }
        }
        if (store$Token == null || !str2.equals(store$Token.token)) {
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
    public void run(boolean z) {
        BaseFragment baseFragment = (BaseFragment) this.f$1;
        VoIPHelper.startCall((TLRPC.Chat) this.f$0, null, true, null, baseFragment.getParentActivity(), baseFragment, (AccountInstance) this.f$2);
    }
}
