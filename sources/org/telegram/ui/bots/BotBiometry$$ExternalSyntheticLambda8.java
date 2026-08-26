package org.telegram.ui.bots;

import android.os.Build;
import android.text.TextUtils;
import androidx.biometric.BiometricPrompt$AuthenticationResult;
import androidx.biometric.BiometricPrompt$CryptoObject;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.Paint.Views.RoundView;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda3;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.PeerStoriesView;
import org.telegram.ui.Stories.StoryViewer$5$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.recorder.CaptionStory;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.Stories.recorder.TimelineView;

public final class BotBiometry$$ExternalSyntheticLambda8 implements Utilities.Callback3 {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public BotBiometry$$ExternalSyntheticLambda8(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        String str;
        StoryRecorder.AnonymousClass24 anonymousClass24;
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                BiometricPrompt$AuthenticationResult biometricPrompt$AuthenticationResult = (BiometricPrompt$AuthenticationResult) obj2;
                BiometricPrompt$CryptoObject biometricPrompt$CryptoObjectMakeCryptoObject = (BiometricPrompt$CryptoObject) obj3;
                BotBiometry botBiometry = (BotBiometry) this.f$0;
                botBiometry.getClass();
                String str2 = null;
                if (biometricPrompt$AuthenticationResult != null) {
                    try {
                        int i = Build.VERSION.SDK_INT;
                        if (i < 23) {
                            str = botBiometry.encrypted_token;
                        } else {
                            if (i >= 30) {
                                biometricPrompt$CryptoObjectMakeCryptoObject = botBiometry.makeCryptoObject(true);
                            }
                            if (biometricPrompt$CryptoObjectMakeCryptoObject != null) {
                                str = !TextUtils.isEmpty(botBiometry.encrypted_token) ? new String(biometricPrompt$CryptoObjectMakeCryptoObject.mCipher.doFinal(Utilities.hexToBytes(botBiometry.encrypted_token)), StandardCharsets.UTF_8) : botBiometry.encrypted_token;
                            } else if (!TextUtils.isEmpty(botBiometry.encrypted_token)) {
                                throw new RuntimeException("No cryptoObject found");
                            }
                        }
                        str2 = str;
                    } catch (Exception e) {
                        FileLog.e(e);
                        bool = Boolean.FALSE;
                    }
                }
                ((Utilities.Callback2) this.f$1).run(bool, str2);
                return;
            case 1:
                Boolean bool2 = (Boolean) obj;
                Boolean bool3 = (Boolean) obj3;
                PeerStoriesView.AnonymousClass10 anonymousClass10 = (PeerStoriesView.AnonymousClass10) this.f$0;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                LiveCommentsView.Message message = (LiveCommentsView.Message) this.f$1;
                int i2 = anonymousClass10.currentAccount;
                if (zBooleanValue) {
                    TL_phone.deleteGroupCallParticipantMessages deletegroupcallparticipantmessages = new TL_phone.deleteGroupCallParticipantMessages();
                    deletegroupcallparticipantmessages.call = anonymousClass10.inputCall;
                    deletegroupcallparticipantmessages.participant = MessagesController.getInstance(i2).getInputPeer(message.dialogId);
                    deletegroupcallparticipantmessages.report_spam = bool2.booleanValue();
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallparticipantmessages, null);
                    long j = message.dialogId;
                    int i3 = 0;
                    boolean z = false;
                    while (true) {
                        ArrayList arrayList = anonymousClass10.messages;
                        int size = arrayList.size();
                        ArrayList arrayList2 = anonymousClass10.topMessages;
                        if (i3 < size) {
                            if (((LiveCommentsView.Message) arrayList.get(i3)).dialogId == j) {
                                LiveCommentsView.Message message2 = (LiveCommentsView.Message) arrayList.get(i3);
                                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                                    if (((LiveCommentsView.TopSender) arrayList2.get(i4)).messages.contains(message2)) {
                                        ((LiveCommentsView.TopSender) arrayList2.get(i4)).messages.remove(message2);
                                        if (((LiveCommentsView.TopSender) arrayList2.get(i4)).messages.isEmpty()) {
                                            arrayList2.remove(i4);
                                            z = true;
                                        } else {
                                            anonymousClass10.scheduleRemovingTopSenders();
                                        }
                                        arrayList.remove(i3);
                                        anonymousClass10.adapter.update(true);
                                        i3--;
                                    }
                                }
                                arrayList.remove(i3);
                                anonymousClass10.adapter.update(true);
                                i3--;
                            }
                            i3++;
                        } else if (z) {
                            ConnectionsManager.getInstance(i2).getCurrentTime();
                            Collections.sort(arrayList2, new OAuthSheet$$ExternalSyntheticLambda3(anonymousClass10, 13));
                            anonymousClass10.topAdapter.update(true);
                            anonymousClass10.updateMessagesPlaces();
                        }
                    }
                } else {
                    TL_phone.deleteGroupCallMessages deletegroupcallmessages = new TL_phone.deleteGroupCallMessages();
                    deletegroupcallmessages.call = anonymousClass10.inputCall;
                    deletegroupcallmessages.messages.add(Integer.valueOf(message.id));
                    ConnectionsManager.getInstance(i2).sendRequest(deletegroupcallmessages, null);
                    anonymousClass10.delete(message.id);
                }
                if (bool3.booleanValue()) {
                    if (anonymousClass10.dialogId >= 0) {
                        MessagesController.getInstance(i2).blockPeer(anonymousClass10.dialogId);
                        return;
                    } else {
                        MessagesController.getInstance(i2).deleteParticipantFromChat(-anonymousClass10.dialogId, MessagesController.getInstance(i2).getInputPeer(message.dialogId), false, true);
                        return;
                    }
                }
                return;
            default:
                File file = (File) obj;
                String str3 = (String) obj2;
                Long l = (Long) obj3;
                StoryRecorder.AnonymousClass8 anonymousClass8 = (StoryRecorder.AnonymousClass8) this.f$0;
                StoryRecorder storyRecorder = StoryRecorder.this;
                StoryRecorder.AnonymousClass7 anonymousClass7 = storyRecorder.previewView;
                if (anonymousClass7 != null) {
                    anonymousClass7.isMuted = false;
                    anonymousClass7.checkVolumes();
                    StoryRecorder.AnonymousClass7 anonymousClass9 = storyRecorder.previewView;
                    anonymousClass9.seekTo(0L);
                    TimelineView timelineView = anonymousClass9.timelineView;
                    if (timelineView != null) {
                        timelineView.setProgress(0L);
                    }
                }
                StoryEntry storyEntry = storyRecorder.outputEntry;
                if (storyEntry != null) {
                    storyEntry.round = file;
                    storyEntry.roundThumb = str3;
                    storyEntry.roundDuration = l.longValue();
                    StoryEntry storyEntry2 = storyRecorder.outputEntry;
                    storyEntry2.roundLeft = 0.0f;
                    storyEntry2.roundRight = 1.0f;
                    storyEntry2.roundOffset = 0L;
                    storyEntry2.roundVolume = 1.0f;
                    storyRecorder.createPhotoPaintView();
                    StoryRecorder.AnonymousClass7 anonymousClass11 = storyRecorder.previewView;
                    CaptionStory.AnonymousClass1 anonymousClass1 = (CaptionStory.AnonymousClass1) this.f$1;
                    if (anonymousClass11 == null || (anonymousClass24 = storyRecorder.paintView) == null) {
                        anonymousClass1.destroy(false);
                        return;
                    }
                    RoundView roundViewCreateRound = anonymousClass24.createRound(storyRecorder.outputEntry.roundThumb, true);
                    anonymousClass8.setHasRoundVideo(true);
                    storyRecorder.previewView.setupRound(storyRecorder.outputEntry, roundViewCreateRound, true);
                    AndroidUtilities.cancelRunOnUIThread(anonymousClass1.stopRunnable);
                    anonymousClass1.cameraView.destroy(true, null);
                    roundViewCreateRound.setDraw(false);
                    anonymousClass1.post(new StoryViewer$5$$ExternalSyntheticLambda0(25, anonymousClass1, roundViewCreateRound));
                    return;
                }
                return;
        }
    }
}
