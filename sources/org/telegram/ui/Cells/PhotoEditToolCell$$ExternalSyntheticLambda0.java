package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Build;
import android.os.CancellationSignal;
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
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_PersistedEvent;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.BasePlayer;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
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
import com.google.mlkit.common.MlKitException;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Business.BusinessIntroActivity;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Components.Paint.Views.PhotoView;
import org.telegram.ui.Components.PhotoEditorSeekBar;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.web.MHTML;

public final class PhotoEditToolCell$$ExternalSyntheticLambda0 implements RemoteUtils.RemoteCall, OnFailureListener, SynchronizationGuard.CriticalSection, SQLiteEventStore.Function, ListenerSet.IterationFinishedEvent, ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory, Deferred$DeferredHandler, OnCompleteListener, Continuation, ComponentFactory, AlertDialog.OnButtonClickListener, Utilities.Callback3Return, LocationActivity.LocationActivityDelegate, PhotoEditorSeekBar.PhotoEditorSeekBarDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PhotoEditToolCell$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
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
            case 18:
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
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        org.telegram.ui.Business.LocationActivity locationActivity = (org.telegram.ui.Business.LocationActivity) this.f$0;
        locationActivity.geo = messageMedia.geo;
        boolean zIsEmpty = TextUtils.isEmpty(locationActivity.address);
        LocationActivity locationActivity2 = (LocationActivity) this.f$1;
        if ((zIsEmpty && !TextUtils.isEmpty(locationActivity2.getAddressName())) || locationActivity.mapAddress) {
            locationActivity.mapAddress = true;
            String addressName = locationActivity2.getAddressName();
            locationActivity.address = addressName;
            if (addressName == null) {
                locationActivity.address = "";
            }
            org.telegram.ui.Business.LocationActivity.AnonymousClass2 anonymousClass2 = locationActivity.editText;
            if (anonymousClass2 != null) {
                locationActivity.ignoreEditText = true;
                anonymousClass2.setText(locationActivity.address);
                org.telegram.ui.Business.LocationActivity.AnonymousClass2 anonymousClass3 = locationActivity.editText;
                anonymousClass3.setSelection(anonymousClass3.getText().length());
                locationActivity.ignoreEditText = false;
            }
        }
        locationActivity.updateMapPreview();
        locationActivity.listView.adapter.update(true);
        locationActivity.checkDone$2(true);
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
    public void invoke(Object obj) {
        switch (this.$r8$classId) {
            case 8:
                ((AnalyticsListener) obj).onMediaMetadataChanged((AnalyticsListener.EventTime) this.f$0, (MediaMetadata) this.f$1);
                break;
            case 9:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.f$0, (PlaybackParameters) this.f$1);
                break;
            case 10:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f$0, (CueGroup) this.f$1);
                break;
            case 11:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.f$0, (Player.Commands) this.f$1);
                break;
            case 12:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f$0, (ImmutableList) this.f$1);
                break;
            case 13:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.f$0, (Tracks) this.f$1);
                break;
            case 14:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.f$0, (Metadata) this.f$1);
                break;
            case 15:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.f$0, (DeviceInfo) this.f$1);
                break;
            case 16:
                AnalyticsListener analyticsListener = (AnalyticsListener) obj;
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f$0;
                VideoSize videoSize = (VideoSize) this.f$1;
                analyticsListener.onVideoSizeChanged(eventTime, videoSize);
                analyticsListener.onVideoSizeChanged(eventTime, videoSize.width, videoSize.height, videoSize.unappliedRotationDegrees, videoSize.pixelWidthHeightRatio);
                break;
            default:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.f$0, (AudioAttributes) this.f$1);
                break;
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 25:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                ((boolean[]) this.f$1)[0] = true;
                mentionsAdapter.onLocationUnavailable();
                break;
            default:
                ((BusinessLinksActivity) this.f$0).lambda$onLongClick$11((TL_account.TL_businessChatLink) this.f$1);
                break;
        }
    }

    @Override
    public void onComplete(Task task) {
        ((EnhancedIntentService) this.f$0).finishTask((Intent) this.f$1);
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
            case 3:
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
            default:
                PhotoView photoView = (PhotoView) this.f$0;
                photoView.segmentingLoading = false;
                FileLog.e(e);
                if (Build.VERSION.SDK_INT >= 24 && (e instanceof MlKitException) && e.getMessage() != null && e.getMessage().contains("segmentation optional module to be downloaded") && photoView.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(new ChatActionCell$$ExternalSyntheticLambda8(24, photoView, (Bitmap) this.f$1), 2000L);
                    return;
                } else {
                    photoView.segmentingLoaded = true;
                    return;
                }
        }
    }

    @Override
    public void onProgressChanged(int i, int i2) {
        final PhotoEditToolCell photoEditToolCell = (PhotoEditToolCell) this.f$0;
        ((PhotoEditorSeekBar.PhotoEditorSeekBarDelegate) this.f$1).onProgressChanged(i, i2);
        TextView textView = photoEditToolCell.valueTextView;
        if (i2 > 0) {
            textView.setText("+" + i2);
        } else {
            textView.setText("" + i2);
        }
        if (textView.getTag() != null) {
            SendLocationCell.AnonymousClass1 anonymousClass1 = photoEditToolCell.hideValueRunnable;
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
        photoEditToolCell.valueAnimation.addListener(
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.PhotoEditToolCell$$ExternalSyntheticLambda0.onProgressChanged(int, int):void");
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

    @Override
    public Object then(Task task) {
        RequestDeduplicator requestDeduplicator = (RequestDeduplicator) this.f$0;
        String str = (String) this.f$1;
        synchronized (requestDeduplicator) {
            ((ArrayMap) requestDeduplicator.getTokenRequests).remove(str);
        }
        return task;
    }

    @Override
    public void invoke(Object obj, FlagSet flagSet) {
        ((AnalyticsListener) obj).onEvents((BasePlayer) this.f$1, new AnalyticsListener.Events(flagSet, ((DefaultAnalyticsCollector) this.f$0).eventTimes));
    }

    @Override
    public Object create(MHTML mhtml) {
        String strValueOf;
        switch (this.$r8$classId) {
            case 23:
                Context context = (Context) mhtml.get(Context.class);
                switch (((BundledChunkExtractor$$ExternalSyntheticLambda0) this.f$1).$r8$classId) {
                    case 9:
                        ApplicationInfo applicationInfo = context.getApplicationInfo();
                        if (applicationInfo != null) {
                            strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                        } else {
                            strValueOf = "";
                        }
                        break;
                    case 10:
                        ApplicationInfo applicationInfo2 = context.getApplicationInfo();
                        if (applicationInfo2 != null && Build.VERSION.SDK_INT >= 24) {
                            strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                        } else {
                            strValueOf = "";
                        }
                        break;
                    case 11:
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
