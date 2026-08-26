package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.car.app.IStartCarApp;
import androidx.car.app.notification.CarAppNotificationBroadcastReceiver;
import androidx.car.app.utils.RemoteUtils;
import androidx.collection.ArrayMap;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialCustomException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda9;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.zzcl;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.BasePlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.RegularImmutableList;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.inject.Deferred$DeferredHandler;
import com.google.firebase.inject.Provider;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.GmsRpc;
import com.google.firebase.messaging.RequestDeduplicator;
import com.google.firebase.platforminfo.AutoValue_LibraryVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Cells.ArchivedStickerSetCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.PhotoEditToolCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.PhotoEditorSeekBar;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.web.MHTML;

public final class ArticleViewer$$ExternalSyntheticLambda16 implements RemoteUtils.RemoteCall, OnFailureListener, SynchronizationGuard.CriticalSection, SQLiteEventStore.Function, ListenerSet.IterationFinishedEvent, ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory, Deferred$DeferredHandler, OnCompleteListener, Continuation, ComponentFactory, AlertDialog.OnButtonClickListener, ArchivedStickerSetCell.OnCheckedChangeListener, RecyclerListView.OnItemClickListenerExtended, Utilities.Callback3Return, LocationActivity.LocationActivityDelegate, DialogsActivity.DialogsActivityDelegate, PhotoEditorSeekBar.PhotoEditorSeekBarDelegate, AvatarPreviewer.Callback, AlertsCreator.ScheduleDatePickerDelegate, MessagesController.ErrorDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public ArticleViewer$$ExternalSyntheticLambda16(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.f$0;
        AutoValue_EventStoreConfig autoValue_EventStoreConfig = sQLiteEventStore.config;
        int i = autoValue_EventStoreConfig.loadBatchSize;
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$1;
        ArrayList arrayListLoadEvents = sQLiteEventStore.loadEvents(sQLiteDatabase, autoValue_TransportContext, i);
        for (Priority priority : Priority.values()) {
            if (priority != autoValue_TransportContext.priority) {
                int size = autoValue_EventStoreConfig.loadBatchSize - arrayListLoadEvents.size();
                if (size <= 0) {
                    break;
                }
                arrayListLoadEvents.addAll(sQLiteEventStore.loadEvents(sQLiteDatabase, autoValue_TransportContext.withPriority(priority), size));
            }
        }
        HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i2 = 0; i2 < arrayListLoadEvents.size(); i2++) {
            sb.append(((AutoValue_PersistedEvent) arrayListLoadEvents.get(i2)).id);
            if (i2 < arrayListLoadEvents.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        Cursor cursorQuery = sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                long j = cursorQuery.getLong(0);
                Set hashSet = (Set) map.get(Long.valueOf(j));
                if (hashSet == null) {
                    hashSet = new HashSet();
                    map.put(Long.valueOf(j), hashSet);
                }
                hashSet.add(new SQLiteEventStore.Metadata(cursorQuery.getString(1), cursorQuery.getString(2)));
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        cursorQuery.close();
        ListIterator listIterator = arrayListLoadEvents.listIterator();
        while (listIterator.hasNext()) {
            AutoValue_PersistedEvent autoValue_PersistedEvent = (AutoValue_PersistedEvent) listIterator.next();
            if (map.containsKey(Long.valueOf(autoValue_PersistedEvent.id))) {
                GmsRpc builder = autoValue_PersistedEvent.event.toBuilder();
                long j2 = autoValue_PersistedEvent.id;
                for (SQLiteEventStore.Metadata metadata : (Set) map.get(Long.valueOf(j2))) {
                    builder.addMetadata(metadata.key, metadata.value);
                }
                listIterator.set(new AutoValue_PersistedEvent(j2, autoValue_PersistedEvent.transportContext, builder.build()));
            }
        }
        return arrayListLoadEvents;
    }

    @Override
    public Object call() {
        int i = CarAppNotificationBroadcastReceiver.$r8$clinit;
        ((IStartCarApp) this.f$0).startCarApp((Intent) this.f$1);
        return null;
    }

    @Override
    public boolean canSelectStories() {
        return false;
    }

    @Override
    public RegularImmutableList create(int i, TrackGroup trackGroup, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Point point;
        int i10;
        TrackGroup trackGroup2 = trackGroup;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        int i11 = 4;
        boolean z = true;
        switch (this.$r8$classId) {
            case 10:
                int i12 = ((int[]) obj)[i];
                DefaultTrackSelector.Parameters parameters = (DefaultTrackSelector.Parameters) obj2;
                int i13 = parameters.viewportWidth;
                if (i13 == Integer.MAX_VALUE || (i4 = parameters.viewportHeight) == Integer.MAX_VALUE) {
                    i11 = 4;
                    i2 = Integer.MAX_VALUE;
                } else {
                    int i14 = 0;
                    i2 = Integer.MAX_VALUE;
                    while (i14 < trackGroup2.length) {
                        Format format = trackGroup2.formats[i14];
                        int i15 = format.width;
                        if (i15 > 0 && (i5 = format.height) > 0) {
                            if (parameters.viewportOrientationMayChange) {
                                boolean z2 = i15 > i5;
                                if (i13 <= i4) {
                                    z = false;
                                }
                                if (z2 != z) {
                                    i7 = i13;
                                    i6 = i4;
                                }
                                i8 = i15 * i7;
                                i9 = i5 * i6;
                                if (i8 >= i9) {
                                    int i16 = Util.SDK_INT;
                                    point = new Point(i6, ((i9 + i15) - 1) / i15);
                                } else {
                                    int i17 = Util.SDK_INT;
                                    point = new Point(((i8 + i5) - 1) / i5, i7);
                                }
                                i10 = format.width;
                                int i18 = i10 * i5;
                                if (i10 < ((int) (point.x * 0.98f)) && i5 >= ((int) (point.y * 0.98f)) && i18 < i2) {
                                    i2 = i18;
                                }
                            }
                            i6 = i13;
                            i7 = i4;
                            i8 = i15 * i7;
                            i9 = i5 * i6;
                            if (i8 >= i9) {
                                int i19 = Util.SDK_INT;
                                point = new Point(i6, ((i9 + i15) - 1) / i15);
                            } else {
                                int i110 = Util.SDK_INT;
                                point = new Point(((i8 + i5) - 1) / i5, i7);
                            }
                            i10 = format.width;
                            int i111 = i10 * i5;
                            if (i10 < ((int) (point.x * 0.98f))) {
                            }
                        }
                        i14++;
                        i11 = 4;
                        z = true;
                    }
                }
                Maps.checkNonnegative(i11, "initialCapacity");
                Object[] objArrCopyOf = new Object[i11];
                int i20 = 0;
                int i21 = 0;
                while (i20 < trackGroup2.length) {
                    Format format2 = trackGroup2.formats[i20];
                    int i22 = format2.width;
                    int i23 = (i22 == -1 || (i3 = format2.height) == -1) ? -1 : i22 * i3;
                    DefaultTrackSelector.VideoTrackInfo videoTrackInfo = new DefaultTrackSelector.VideoTrackInfo(i, trackGroup2, i20, parameters, iArr[i20], i12, i2 == Integer.MAX_VALUE || (i23 != -1 && i23 <= i2));
                    int i24 = i21 + 1;
                    if (objArrCopyOf.length < i24) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, ImmutableList.Builder.expandedCapacity(objArrCopyOf.length, i24));
                    }
                    objArrCopyOf[i21] = videoTrackInfo;
                    i20++;
                    trackGroup2 = trackGroup;
                    i21 = i24;
                }
                return ImmutableList.asImmutableList(i21, objArrCopyOf);
            default:
                ImmutableList.Itr itr = ImmutableList.EMPTY_ITR;
                Maps.checkNonnegative(4, "initialCapacity");
                Object[] objArrCopyOf2 = new Object[4];
                int i25 = 0;
                int i26 = 0;
                while (i25 < trackGroup2.length) {
                    DefaultTrackSelector.TextTrackInfo textTrackInfo = new DefaultTrackSelector.TextTrackInfo(i, trackGroup2, i25, (DefaultTrackSelector.Parameters) obj2, iArr[i25], (String) obj);
                    int i27 = i26 + 1;
                    if (objArrCopyOf2.length < i27) {
                        objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, ImmutableList.Builder.expandedCapacity(objArrCopyOf2.length, i27));
                    }
                    objArrCopyOf2[i26] = textTrackInfo;
                    i25++;
                    i26 = i27;
                }
                return ImmutableList.asImmutableList(i26, objArrCopyOf2);
        }
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        ChatActivity chatActivity = (ChatActivity) this.f$0;
        chatActivity.fillEditingMediaWithCaption(null, null);
        SendMessagesHelper.prepareSendingPhoto(chatActivity.getAccountInstance(), null, (Uri) this.f$1, chatActivity.dialog_id, chatActivity.replyingMessageObject, chatActivity.threadMessageObject, chatActivity.replyingQuote, null, null, null, null, 0, chatActivity.editingMessageObject, z, i, chatActivity.chatMode, chatActivity.getMessageChatSendParams());
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        CacheChatsExceptionsFragment cacheChatsExceptionsFragment = (CacheChatsExceptionsFragment) this.f$0;
        ((DialogsActivity) this.f$1).finishFragment();
        CacheByChatsController.KeepMediaException keepMediaException = null;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= arrayList.size()) {
                break;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= cacheChatsExceptionsFragment.exceptionsDialogs.size()) {
                    z3 = false;
                    break;
                }
                if (((CacheByChatsController.KeepMediaException) cacheChatsExceptionsFragment.exceptionsDialogs.get(i5)).dialogId == ((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId) {
                    keepMediaException = (CacheByChatsController.KeepMediaException) cacheChatsExceptionsFragment.exceptionsDialogs.get(i5);
                    break;
                }
                i5++;
            }
            if (!z3) {
                int i6 = CacheByChatsController.KEEP_MEDIA_FOREVER;
                if (cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().getKeepMedia(cacheChatsExceptionsFragment.currentType) == CacheByChatsController.KEEP_MEDIA_FOREVER) {
                    i6 = CacheByChatsController.KEEP_MEDIA_ONE_DAY;
                }
                ArrayList arrayList2 = cacheChatsExceptionsFragment.exceptionsDialogs;
                CacheByChatsController.KeepMediaException keepMediaException2 = new CacheByChatsController.KeepMediaException(((MessagesStorage.TopicKey) arrayList.get(i4)).dialogId, i6);
                arrayList2.add(keepMediaException2);
                keepMediaException = keepMediaException2;
            }
            i4++;
        }
        cacheChatsExceptionsFragment.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(cacheChatsExceptionsFragment.currentType, cacheChatsExceptionsFragment.exceptionsDialogs);
        cacheChatsExceptionsFragment.updateRows$24();
        if (keepMediaException != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList3 = cacheChatsExceptionsFragment.items;
                if (i7 < arrayList3.size()) {
                    if (((CacheChatsExceptionsFragment.Item) arrayList3.get(i7)).exception != null && ((CacheChatsExceptionsFragment.Item) arrayList3.get(i7)).exception.dialogId == keepMediaException.dialogId) {
                        i3 = i7;
                        break;
                    }
                    i7++;
                } else {
                    break;
                }
            }
            cacheChatsExceptionsFragment.recyclerListView.scrollToPosition(i3);
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda8(18, cacheChatsExceptionsFragment, keepMediaException), 150L);
        }
        return true;
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        String str;
        org.telegram.ui.Business.LocationActivity.AnonymousClass2 anonymousClass2;
        org.telegram.ui.Business.LocationActivity locationActivity = (org.telegram.ui.Business.LocationActivity) this.f$0;
        locationActivity.geo = messageMedia.geo;
        boolean zIsEmpty = TextUtils.isEmpty(locationActivity.address);
        LocationActivity locationActivity2 = (LocationActivity) this.f$1;
        if (zIsEmpty) {
            LocationActivity.AnonymousClass4 anonymousClass4 = locationActivity2.adapter;
            if (!TextUtils.isEmpty(anonymousClass4 != null ? anonymousClass4.addressName : null)) {
                locationActivity.mapAddress = true;
                LocationActivity.AnonymousClass4 anonymousClass5 = locationActivity2.adapter;
                if (anonymousClass5 != null) {
                }
                locationActivity.address = str;
                if (str == null) {
                    locationActivity.address = "";
                }
                anonymousClass2 = locationActivity.editText;
                if (anonymousClass2 != null) {
                    locationActivity.ignoreEditText = true;
                    anonymousClass2.setText(locationActivity.address);
                    org.telegram.ui.Business.LocationActivity.AnonymousClass2 anonymousClass3 = locationActivity.editText;
                    anonymousClass3.setSelection(anonymousClass3.getText().length());
                    locationActivity.ignoreEditText = false;
                }
            } else if (locationActivity.mapAddress) {
                locationActivity.mapAddress = true;
                LocationActivity.AnonymousClass4 anonymousClass6 = locationActivity2.adapter;
                if (anonymousClass6 != null) {
                }
                locationActivity.address = str;
                if (str == null) {
                    locationActivity.address = "";
                }
                anonymousClass2 = locationActivity.editText;
                if (anonymousClass2 != null) {
                    locationActivity.ignoreEditText = true;
                    anonymousClass2.setText(locationActivity.address);
                    org.telegram.ui.Business.LocationActivity.AnonymousClass2 anonymousClass7 = locationActivity.editText;
                    anonymousClass7.setSelection(anonymousClass7.getText().length());
                    locationActivity.ignoreEditText = false;
                }
            }
        } else if (locationActivity.mapAddress) {
            locationActivity.mapAddress = true;
            LocationActivity.AnonymousClass4 anonymousClass8 = locationActivity2.adapter;
            str = anonymousClass8 != null ? anonymousClass8.addressName : null;
            locationActivity.address = str;
            if (str == null) {
                locationActivity.address = "";
            }
            anonymousClass2 = locationActivity.editText;
            if (anonymousClass2 != null) {
                locationActivity.ignoreEditText = true;
                anonymousClass2.setText(locationActivity.address);
                org.telegram.ui.Business.LocationActivity.AnonymousClass2 anonymousClass9 = locationActivity.editText;
                anonymousClass9.setSelection(anonymousClass9.getText().length());
                locationActivity.ignoreEditText = false;
            }
        }
        locationActivity.updateMapPreview();
        locationActivity.listView.adapter.update(true);
        locationActivity.checkDone$2(true);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return false;
    }

    @Override
    public Object execute() {
        switch (this.$r8$classId) {
            case 4:
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) ((Uploader) this.f$0).eventStore;
                sQLiteEventStore.getClass();
                Iterable iterable = (Iterable) this.f$1;
                if (iterable.iterator().hasNext()) {
                    sQLiteEventStore.getDb().compileStatement("DELETE FROM events WHERE _id in " + SQLiteEventStore.toIdList(iterable)).execute();
                    break;
                }
                break;
            default:
                Uploader uploader = (Uploader) this.f$0;
                uploader.getClass();
                for (Map.Entry entry : ((HashMap) this.f$1).entrySet()) {
                    ((SQLiteEventStore) uploader.clientHealthMetricsStore).recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override
    public void handle(Provider provider) {
        ((Deferred$DeferredHandler) this.f$0).handle(provider);
        ((Deferred$DeferredHandler) this.f$1).handle(provider);
    }

    @Override
    public boolean hasDoubleTap(View view) {
        return false;
    }

    @Override
    public void invoke(Object obj) {
        AnalyticsListener analyticsListener = (AnalyticsListener) obj;
        switch (this.$r8$classId) {
            case 8:
                analyticsListener.onDownstreamFormatChanged((AnalyticsListener.EventTime) this.f$0, (MediaLoadData) this.f$1);
                break;
            default:
                analyticsListener.onRenderedFirstFrame((AnalyticsListener.EventTime) this.f$0);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        String str;
        switch (this.$r8$classId) {
            case 17:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                ((boolean[]) this.f$1)[0] = true;
                mentionsAdapter.onLocationUnavailable();
                break;
            case 19:
                AutoDeleteMessagesActivity autoDeleteMessagesActivity = (AutoDeleteMessagesActivity) this.f$0;
                autoDeleteMessagesActivity.getClass();
                alertDialog.dismiss();
                autoDeleteMessagesActivity.selectRadioButton((View) this.f$1, true);
                break;
            case 21:
                ((BusinessLinksActivity) this.f$0).lambda$onLongClick$11((TL_account.TL_businessChatLink) this.f$1);
                break;
            case 25:
                Activity parentActivity = ((ChannelAdminLogActivity) this.f$0).getParentActivity();
                if (parentActivity != null && (str = (String) this.f$1) != null) {
                    Browser.openUrl(parentActivity, Uri.parse(str), true, true);
                    break;
                }
                break;
            default:
                ((ChannelCreateActivity) this.f$0).lambda$loadAdminedChannels$18((TLRPC.Chat) this.f$1);
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.f$0).finishTask((Intent) this.f$1);
    }

    @Override
    public void onDoubleTap(View view, float f, float f2) {
    }

    @Override
    public void onFailure(Exception e) {
        GetCredentialException getCredentialCancellationException;
        CreateCredentialException createCredentialInterruptedException;
        switch (this.$r8$classId) {
            case 2:
                Intrinsics.checkNotNullParameter(e, "e");
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = (CredentialProviderBeginSignInController) this.f$0;
                credentialProviderBeginSignInController.getClass();
                String str = ((e instanceof ApiException) && CredentialProviderController.retryables.contains(Integer.valueOf(((ApiException) e).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
                String str2 = "During begin sign in, failure response from one tap: " + e.getMessage();
                int iHashCode = str.hashCode();
                if (iHashCode != -1567968963) {
                    if (iHashCode != -154594663) {
                        if (iHashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                            getCredentialCancellationException = new NoCredentialException(str2);
                        } else {
                            getCredentialCancellationException = new GetCredentialCustomException(str2, 2);
                        }
                    } else if (str.equals("GET_INTERRUPTED")) {
                        getCredentialCancellationException = new GetCredentialInterruptedException(str2);
                    } else {
                        getCredentialCancellationException = new GetCredentialCustomException(str2, 2);
                    }
                } else if (str.equals("GET_CANCELED_TAG")) {
                    getCredentialCancellationException = new GetCredentialCancellationException(str2);
                } else {
                    getCredentialCancellationException = new GetCredentialCustomException(str2, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release((CancellationSignal) this.f$1)) {
                    return;
                }
                credentialProviderBeginSignInController.getExecutor().execute(new CredentialProviderBeginSignInController$$ExternalSyntheticLambda6(credentialProviderBeginSignInController, getCredentialCancellationException, 1));
                return;
            default:
                Intrinsics.checkNotNullParameter(e, "e");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) this.f$0;
                credentialProviderCreatePublicKeyCredentialController.getClass();
                String str3 = ((e instanceof ApiException) && CredentialProviderController.retryables.contains(Integer.valueOf(((ApiException) e).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
                String str4 = "During create public key credential, fido registration failure: " + e.getMessage();
                if (str3.equals("CREATE_CANCELED")) {
                    createCredentialInterruptedException = new CreateCredentialCancellationException(str4);
                } else {
                    createCredentialInterruptedException = str3.equals("CREATE_INTERRUPTED") ? new CreateCredentialInterruptedException(str4) : new CreateCredentialCustomException(str4, 2);
                }
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release((CancellationSignal) this.f$1)) {
                    return;
                }
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor != null) {
                    executor.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda9(credentialProviderCreatePublicKeyCredentialController, createCredentialInterruptedException, 2));
                    return;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    throw null;
                }
        }
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ArticleViewer articleViewer = (ArticleViewer) this.f$0;
        if (articleViewer.sheet == null || (i = i - 1) >= 0) {
            TextSelectionHelper.ArticleTextSelectionHelper articleTextSelectionHelper = articleViewer.textSelectionHelper;
            if (articleTextSelectionHelper != null) {
                if (articleTextSelectionHelper.isInSelectionMode()) {
                    articleViewer.textSelectionHelper.clear(false);
                    return;
                }
                articleViewer.textSelectionHelper.clear(false);
            }
            ArticleViewer.WebpageAdapter adapter = ((ArticleViewer.PageLayout) this.f$1).getAdapter();
            if ((view instanceof ArticleViewer.ReportCell) && adapter.currentPage != null) {
                ArticleViewer.ReportCell reportCell = (ArticleViewer.ReportCell) view;
                if (articleViewer.previewsReqId == 0) {
                    if ((!reportCell.hasViews || f >= view.getMeasuredWidth() / 2) && !reportCell.web) {
                        TLObject userOrChat = MessagesController.getInstance(articleViewer.currentAccount).getUserOrChat("previews");
                        if (userOrChat instanceof TLRPC.TL_user) {
                            articleViewer.openPreviewsChat(adapter.currentPage.id, (TLRPC.User) userOrChat);
                            return;
                        }
                        int i2 = UserConfig.selectedAccount;
                        long j = adapter.currentPage.id;
                        articleViewer.showProgressView(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        articleViewer.previewsReqId = ConnectionsManager.getInstance(i2).sendRequest(tL_contacts_resolveUsername, new ArticleViewer$$ExternalSyntheticLambda39(articleViewer, i2, j));
                        return;
                    }
                    return;
                }
                return;
            }
            if (i < 0 || i >= adapter.localBlocks.size()) {
                return;
            }
            TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.localBlocks.get(i);
            TL_iv.PageBlock lastNonListPageBlock = ArticleViewer.getLastNonListPageBlock(pageBlock);
            if (lastNonListPageBlock instanceof ArticleViewer.TL_pageBlockDetailsChild) {
                lastNonListPageBlock = ((ArticleViewer.TL_pageBlockDetailsChild) lastNonListPageBlock).block;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockChannel) {
                MessagesController.getInstance(articleViewer.currentAccount).openByUserName(ChatObject.getPublicUsername(((TL_iv.pageBlockChannel) lastNonListPageBlock).channel), articleViewer.parentFragment, 2);
                articleViewer.close(false, true);
                return;
            }
            if (lastNonListPageBlock instanceof ArticleViewer.TL_pageBlockRelatedArticlesChild) {
                ArticleViewer.TL_pageBlockRelatedArticlesChild tL_pageBlockRelatedArticlesChild = (ArticleViewer.TL_pageBlockRelatedArticlesChild) lastNonListPageBlock;
                articleViewer.openWebpageUrl(tL_pageBlockRelatedArticlesChild.parent.articles.get(tL_pageBlockRelatedArticlesChild.num).url, null, null);
                return;
            }
            if (lastNonListPageBlock instanceof TL_iv.pageBlockDetails) {
                View lastNonListCell = ArticleViewer.getLastNonListCell(view);
                if (lastNonListCell instanceof ArticleViewer.BlockDetailsCell) {
                    articleViewer.pressedLinkOwnerLayout = null;
                    articleViewer.pressedLinkOwnerView = null;
                    if (adapter.blocks.indexOf(pageBlock) < 0) {
                        return;
                    }
                    TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) lastNonListPageBlock;
                    pageblockdetails.open = !pageblockdetails.open;
                    int itemCount = adapter.getItemCount();
                    adapter.updateRows$30();
                    int iAbs = Math.abs(adapter.getItemCount() - itemCount);
                    ArticleViewer.BlockDetailsCell blockDetailsCell = (ArticleViewer.BlockDetailsCell) lastNonListCell;
                    AnimatedArrowDrawable animatedArrowDrawable = blockDetailsCell.arrow;
                    float f3 = pageblockdetails.open ? 0.0f : 1.0f;
                    if (animatedArrowDrawable.animateToProgress != f3) {
                        animatedArrowDrawable.animateToProgress = f3;
                        animatedArrowDrawable.lastUpdateTime = SystemClock.elapsedRealtime();
                        animatedArrowDrawable.invalidateSelf();
                    }
                    blockDetailsCell.invalidate();
                    if (iAbs != 0) {
                        boolean z = pageblockdetails.open;
                        RecyclerView.AdapterDataObservable adapterDataObservable = adapter.mObservable;
                        if (z) {
                            adapter.updateRows$30();
                            adapterDataObservable.notifyItemRangeInserted(i + 1, iAbs);
                        } else {
                            adapter.updateRows$30();
                            adapterDataObservable.notifyItemRangeRemoved(i + 1, iAbs);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onMenuClick(AvatarPreviewer.MenuItem menuItem) {
        ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1 anonymousClass1 = (ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1) this.f$0;
        anonymousClass1.getClass();
        int iOrdinal = menuItem.ordinal();
        ChannelAdminLogActivity.ChatActivityAdapter chatActivityAdapter = ChannelAdminLogActivity.ChatActivityAdapter.this;
        TLRPC.User user = (TLRPC.User) this.f$1;
        ChannelAdminLogActivity channelAdminLogActivity = ChannelAdminLogActivity.this;
        if (iOrdinal == 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            ChannelAdminLogActivity.access$5300(channelAdminLogActivity, bundle, user.id);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            profileActivity.setPlayProfileAnimation(0);
            channelAdminLogActivity.presentFragment(profileActivity);
            return;
        }
        if (iOrdinal == 3 && user != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", user.id);
            if (channelAdminLogActivity.getMessagesController().checkCanOpenChat(bundle2, channelAdminLogActivity)) {
                channelAdminLogActivity.presentFragment(new ChatActivity(bundle2));
            }
        }
    }

    @Override
    public void onProgressChanged(int i, int i2) {
        PhotoEditToolCell photoEditToolCell = (PhotoEditToolCell) this.f$0;
        ((PhotoEditorSeekBar.PhotoEditorSeekBarDelegate) this.f$1).onProgressChanged(i, i2);
        TextView textView = photoEditToolCell.valueTextView;
        if (i2 > 0) {
            textView.setText("+" + i2);
        } else {
            textView.setText("" + i2);
        }
        if (textView.getTag() != null) {
            BubbleActivity.AnonymousClass1 anonymousClass1 = photoEditToolCell.hideValueRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            AndroidUtilities.runOnUIThread(anonymousClass1, 1000L);
            return;
        }
        AnimatorSet animatorSet = photoEditToolCell.valueAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        textView.setTag(1);
        AnimatorSet animatorSet2 = new AnimatorSet();
        photoEditToolCell.valueAnimation = animatorSet2;
        Property property = View.ALPHA;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(photoEditToolCell.nameTextView, (Property<TextView, Float>) property, 0.0f));
        photoEditToolCell.valueAnimation.setDuration(250L);
        photoEditToolCell.valueAnimation.setInterpolator(new DecelerateInterpolator());
        photoEditToolCell.valueAnimation.addListener(new ArticleViewer.AnonymousClass25(photoEditToolCell, 16));
        photoEditToolCell.valueAnimation.start();
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        ((ChatActivity) this.f$0).lambda$createView$76((Context) this.f$1, tL_error);
        return false;
    }

    @Override
    public Object then(Task task) {
        RequestDeduplicator requestDeduplicator = (RequestDeduplicator) this.f$0;
        String str = (String) this.f$1;
        synchronized (requestDeduplicator) {
            ((ArrayMap) requestDeduplicator.getTokenRequests).remove(str);
        }
        return task;
    }

    public ArticleViewer$$ExternalSyntheticLambda16(AnalyticsListener.EventTime eventTime, Object obj, long j) {
        this.$r8$classId = 9;
        this.f$0 = eventTime;
        this.f$1 = obj;
    }

    @Override
    public Object run(Object obj, Object obj2, Object obj3) {
        TLRPC.Document document = (TLRPC.Document) obj2;
        BusinessIntroActivity businessIntroActivity = (BusinessIntroActivity) this.f$0;
        businessIntroActivity.stickerRandom = false;
        AndroidUtilities.cancelRunOnUIThread(businessIntroActivity.updateRandomStickerRunnable);
        BusinessIntroActivity.AnonymousClass1 anonymousClass1 = businessIntroActivity.greetingsView;
        businessIntroActivity.sticker = document;
        anonymousClass1.setSticker(document);
        ((TextCell) ((View) this.f$1)).setValueSticker(document);
        businessIntroActivity.checkDone$1(true);
        return Boolean.TRUE;
    }

    public ArticleViewer$$ExternalSyntheticLambda16(ChannelAdminLogActivity.ChatActivityAdapter.AnonymousClass1 anonymousClass1, ChatMessageCell chatMessageCell, TLRPC.User user) {
        this.$r8$classId = 26;
        this.f$0 = anonymousClass1;
        this.f$1 = user;
    }

    @Override
    public void invoke(Object obj, FlagSet flagSet) {
        ((AnalyticsListener) obj).onEvents((BasePlayer) this.f$1, new zzcl(flagSet, ((DefaultAnalyticsCollector) this.f$0).eventTimes));
    }

    @Override
    public Object create(MHTML mhtml) {
        String strValueOf;
        switch (this.$r8$classId) {
            case 15:
                Context context = (Context) mhtml.get(Context.class);
                switch (((BundledChunkExtractor$$ExternalSyntheticLambda0) this.f$1).$r8$classId) {
                    case 21:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        } else {
                            strValueOf = "";
                        }
                        break;
                    case 22:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        } else {
                            strValueOf = "";
                        }
                        break;
                    case 23:
                        int i = Build.VERSION.SDK_INT;
                        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
                            strValueOf = "tv";
                        } else if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                            strValueOf = "watch";
                        } else if (i >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
                            strValueOf = "auto";
                        } else if (i >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                            strValueOf = "embedded";
                        } else {
                            strValueOf = "";
                        }
                        break;
                    default:
                        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                        strValueOf = installerPackageName == null ? "" : FirebaseCommonRegistrar.safeValue(installerPackageName);
                        break;
                }
                return new AutoValue_LibraryVersion((String) this.f$0, strValueOf);
            default:
                String str = (String) this.f$0;
                Component component = (Component) this.f$1;
                try {
                    Trace.beginSection(str);
                    return component.factory.create(mhtml);
                } finally {
                    Trace.endSection();
                }
        }
    }
}
