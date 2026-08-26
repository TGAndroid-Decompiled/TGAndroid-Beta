package org.telegram.ui.Stars;

import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.cast.zzw;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.FileUploadOperation;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Stories.LiveCommentsView;

public final class StarGiftSheet$$ExternalSyntheticLambda199 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final long f$2;
    public final Object f$3;

    public StarGiftSheet$$ExternalSyntheticLambda199(Object obj, long j, long j2, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = j2;
        this.f$3 = obj2;
    }

    @Override
    public final void run() {
        Object obj = this.f$3;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((StarGiftSheet) obj2).lambda$doTransfer$164(this.f$1, this.f$2, (Utilities.Callback) obj);
                break;
            case 1:
                AudioRendererEventListener.EventDispatcher eventDispatcher = (AudioRendererEventListener.EventDispatcher) obj2;
                eventDispatcher.getClass();
                int i = Util.SDK_INT;
                DefaultAnalyticsCollector defaultAnalyticsCollector = ExoPlayerImpl.this.analyticsCollector;
                final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = defaultAnalyticsCollector.generateReadingMediaPeriodEventTime();
                final long j = this.f$2;
                final long j2 = this.f$1;
                final String str = (String) obj;
                final int i2 = 1;
                defaultAnalyticsCollector.sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 1008, new ListenerSet.Event() {
                    @Override
                    public final void invoke(Object obj3) {
                        switch (i2) {
                            case 0:
                                AnalyticsListener analyticsListener = (AnalyticsListener) obj3;
                                AnalyticsListener.EventTime eventTime = eventTimeGenerateReadingMediaPeriodEventTime;
                                String str2 = str;
                                long j3 = j;
                                analyticsListener.onVideoDecoderInitialized(eventTime, str2, j3);
                                analyticsListener.onVideoDecoderInitialized(eventTime, str2, j2, j3);
                                analyticsListener.onDecoderInitialized(eventTime, 2, str2, j3);
                                break;
                            default:
                                AnalyticsListener analyticsListener2 = (AnalyticsListener) obj3;
                                AnalyticsListener.EventTime eventTime2 = eventTimeGenerateReadingMediaPeriodEventTime;
                                String str3 = str;
                                long j4 = j;
                                analyticsListener2.onAudioDecoderInitialized(eventTime2, str3, j4);
                                analyticsListener2.onAudioDecoderInitialized(eventTime2, str3, j2, j4);
                                analyticsListener2.onDecoderInitialized(eventTime2, 1, str3, j4);
                                break;
                        }
                    }
                });
                break;
            case 2:
                zzw zzwVar = (zzw) obj2;
                zzwVar.getClass();
                int i3 = Util.SDK_INT;
                DefaultAnalyticsCollector defaultAnalyticsCollector2 = ExoPlayerImpl.this.analyticsCollector;
                final AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime2 = defaultAnalyticsCollector2.generateReadingMediaPeriodEventTime();
                final long j3 = this.f$2;
                final long j4 = this.f$1;
                final String str2 = (String) obj;
                final int i4 = 0;
                defaultAnalyticsCollector2.sendEvent(eventTimeGenerateReadingMediaPeriodEventTime2, 1016, new ListenerSet.Event() {
                    @Override
                    public final void invoke(Object obj3) {
                        switch (i4) {
                            case 0:
                                AnalyticsListener analyticsListener = (AnalyticsListener) obj3;
                                AnalyticsListener.EventTime eventTime = eventTimeGenerateReadingMediaPeriodEventTime2;
                                String str3 = str2;
                                long j5 = j3;
                                analyticsListener.onVideoDecoderInitialized(eventTime, str3, j5);
                                analyticsListener.onVideoDecoderInitialized(eventTime, str3, j4, j5);
                                analyticsListener.onDecoderInitialized(eventTime, 2, str3, j5);
                                break;
                            default:
                                AnalyticsListener analyticsListener2 = (AnalyticsListener) obj3;
                                AnalyticsListener.EventTime eventTime2 = eventTimeGenerateReadingMediaPeriodEventTime2;
                                String str4 = str2;
                                long j6 = j3;
                                analyticsListener2.onAudioDecoderInitialized(eventTime2, str4, j6);
                                analyticsListener2.onAudioDecoderInitialized(eventTime2, str4, j4, j6);
                                analyticsListener2.onDecoderInitialized(eventTime2, 1, str4, j6);
                                break;
                        }
                    }
                });
                break;
            case 3:
                ((FileUploadOperation) obj2).lambda$checkNewDataAvailable$4((Float) obj, this.f$1, this.f$2);
                break;
            case 4:
                ((MediaDataController) obj2).lambda$loadPinnedMessages$163(this.f$1, this.f$2, (ArrayList) obj);
                break;
            case 5:
                ((MediaDataController) obj2).lambda$saveDraftReplyMessage$192(this.f$1, this.f$2, (TLRPC.Message) obj);
                break;
            case 6:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$21(this.f$1, (TLRPC.InputPeer) obj, this.f$2);
                break;
            case 7:
                ((MessagesStorage) obj2).lambda$loadPendingTasks$29(this.f$1, this.f$2, (TLRPC.TL_messages_deleteScheduledMessages) obj);
                break;
            case 8:
                ((MessagesStorage) obj2).lambda$getUnreadMention$156(this.f$1, this.f$2, (MessagesStorage.IntCallback) obj);
                break;
            case 9:
                ((NotificationsSettingsFacade) obj2).lambda$applyDialogNotificationsSettings$1(this.f$1, this.f$2, (TLRPC.PeerNotifySettings) obj);
                break;
            case 10:
                ((GroupCallMessagesController) obj2).lambda$processUpdate$3(this.f$1, this.f$2, (byte[]) obj);
                break;
            case 11:
                ((ChatNotificationsPopupWrapper) obj2).lambda$update$11(this.f$1, this.f$2, (HashSet) obj);
                break;
            default:
                ((LiveCommentsView) obj2).send(this.f$1, (TLRPC.TL_textWithEntities) obj, this.f$2);
                break;
        }
    }

    public StarGiftSheet$$ExternalSyntheticLambda199(Object obj, long j, TLObject tLObject, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$3 = tLObject;
        this.f$2 = j2;
    }

    public StarGiftSheet$$ExternalSyntheticLambda199(Object obj, Object obj2, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = obj2;
        this.f$1 = j;
        this.f$2 = j2;
    }
}
