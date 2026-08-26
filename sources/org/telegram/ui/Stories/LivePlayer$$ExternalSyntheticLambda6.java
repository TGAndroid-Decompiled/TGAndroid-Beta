package org.telegram.ui.Stories;

import com.google.android.gms.internal.mlkit_language_id_common.zzjj;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService$1$$ExternalSyntheticLambda0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ProfileActivity$$ExternalSyntheticLambda65;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;

public final class LivePlayer$$ExternalSyntheticLambda6 implements RequestDelegate {
    public final int $r8$classId;
    public final LivePlayer f$0;

    public LivePlayer$$ExternalSyntheticLambda6(LivePlayer livePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = livePlayer;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        ArrayList arrayListFindUpdates;
        int size;
        TLRPC.TL_dataJSON tL_dataJSON;
        int i;
        TLRPC.InputGroupCall inputGroupCall;
        ArrayList arrayList;
        TLRPC.GroupCallParticipant groupCallParticipant;
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.$r8$classId) {
            case 0:
                LivePlayer livePlayer = this.f$0;
                livePlayer.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(livePlayer.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 1:
                LivePlayer livePlayer2 = this.f$0;
                livePlayer2.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i2 = livePlayer2.currentAccount;
                    MessagesController.getInstance(i2).putUsers(updates.users, false);
                    MessagesController.getInstance(i2).putChats(updates.chats, false);
                    ArrayList arrayListFindUpdates2 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCall.class);
                    int size2 = arrayListFindUpdates2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj = arrayListFindUpdates2.get(i3);
                        i3++;
                        livePlayer2.call = ((TL_update.TL_updateGroupCall) obj).call;
                    }
                    AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(18, livePlayer2, MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCallMessage.class)));
                    MessagesController.getInstance(i2).processUpdates(updates, false);
                    TLRPC.GroupCall groupCall = livePlayer2.call;
                    boolean z = groupCall != null && groupCall.rtmp_stream;
                    ArrayList arrayListFindUpdates3 = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallParticipants.class);
                    int size3 = arrayListFindUpdates3.size();
                    int i4 = 0;
                    while (i4 < size3) {
                        Object obj2 = arrayListFindUpdates3.get(i4);
                        i4++;
                        TL_update.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TL_update.TL_updateGroupCallParticipants) obj2;
                        if (tL_updateGroupCallParticipants.call.id != livePlayer2.getCallId() || z) {
                            arrayList = arrayListFindUpdates3;
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 < tL_updateGroupCallParticipants.participants.size()) {
                                    arrayList = arrayListFindUpdates3;
                                    if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i5).peer) == livePlayer2.dialogId) {
                                        livePlayer2.participant = tL_updateGroupCallParticipants.participants.get(i5);
                                    } else {
                                        i5++;
                                        arrayListFindUpdates3 = arrayList;
                                    }
                                } else {
                                    arrayList = arrayListFindUpdates3;
                                }
                            }
                            if (livePlayer2.participant != null) {
                                arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                                size = arrayListFindUpdates.size();
                                tL_dataJSON = null;
                                i = 0;
                                while (i < size) {
                                    Object obj3 = arrayListFindUpdates.get(i);
                                    i++;
                                    tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj3).params;
                                }
                                StringBuilder sb = new StringBuilder("[LivePlayer] joined call ");
                                inputGroupCall = livePlayer2.inputCall;
                                zzjj.m(sb, inputGroupCall.id);
                                livePlayer2.joined = true;
                                if (!livePlayer2.destroyed || livePlayer2.instance == null) {
                                    TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                                    leavegroupcall.call = inputGroupCall;
                                    ConnectionsManager.getInstance(i2).sendRequest(leavegroupcall, new ProfileActivity$$ExternalSyntheticLambda65(26, livePlayer2, (TLRPC.Updates) tLObject));
                                } else {
                                    if (tL_dataJSON == null || tL_dataJSON.data.startsWith("{\"stream\":true")) {
                                        livePlayer2.instance.prepareForStream(z);
                                    } else {
                                        livePlayer2.instance.setJoinResponsePayload(tL_dataJSON.data);
                                    }
                                    if (livePlayer2.outgoing) {
                                        livePlayer2.instance.setMuteMicrophone(livePlayer2.isMuted);
                                        livePlayer2.instance.activateVideoCapturer(livePlayer2.recordingVideoCapturer);
                                        livePlayer2.instance.setupOutgoingVideoCreated(livePlayer2.recordingVideoCapturer);
                                    } else {
                                        TLRPC.GroupCallParticipant groupCallParticipant2 = livePlayer2.participant;
                                        if (groupCallParticipant2 != null) {
                                            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo2 = groupCallParticipant2.video;
                                            if (tL_groupCallParticipantVideo2 != null) {
                                                NativeInstance nativeInstance = livePlayer2.instance;
                                                String str = tL_groupCallParticipantVideo2.endpoint;
                                                NativeInstance.SsrcGroup[] ssrcGroupArrCreateSsrcGroups$1 = LivePlayer.createSsrcGroups$1(tL_groupCallParticipantVideo2);
                                                livePlayer2.pushSources(ssrcGroupArrCreateSsrcGroups$1);
                                                nativeInstance.addIncomingVideoOutput(2, str, ssrcGroupArrCreateSsrcGroups$1, livePlayer2.instanceSink, DialogObject.getPeerDialogId(livePlayer2.participant.peer));
                                            } else {
                                                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer2, 2));
                                            }
                                        } else if (z) {
                                            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                                            getgroupcallstreamchannels.call = inputGroupCall;
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i2);
                                            LivePlayer$$ExternalSyntheticLambda0 livePlayer$$ExternalSyntheticLambda0 = new LivePlayer$$ExternalSyntheticLambda0(livePlayer2, 1);
                                            TLRPC.GroupCall groupCall2 = livePlayer2.call;
                                            connectionsManager.sendRequest(getgroupcallstreamchannels, livePlayer$$ExternalSyntheticLambda0, 65536, 2, (groupCall2 == null || (groupCall2.flags & 16) == 0) ? Integer.MAX_VALUE : groupCall2.stream_dc_id);
                                        } else {
                                            TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                                            getgroupcall.call = inputGroupCall;
                                            getgroupcall.limit = 10;
                                            ConnectionsManager.getInstance(i2).sendRequest(getgroupcall, new LivePlayer$$ExternalSyntheticLambda6(livePlayer2, 3));
                                        }
                                    }
                                    AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer2, 3));
                                }
                                break;
                            }
                        }
                        arrayListFindUpdates3 = arrayList;
                    }
                    arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateGroupCallConnection.class);
                    size = arrayListFindUpdates.size();
                    tL_dataJSON = null;
                    i = 0;
                    while (i < size) {
                        Object obj4 = arrayListFindUpdates.get(i);
                        i++;
                        tL_dataJSON = ((TL_update.TL_updateGroupCallConnection) obj4).params;
                    }
                    StringBuilder sb2 = new StringBuilder("[LivePlayer] joined call ");
                    inputGroupCall = livePlayer2.inputCall;
                    zzjj.m(sb2, inputGroupCall.id);
                    livePlayer2.joined = true;
                    if (!livePlayer2.destroyed) {
                    }
                    TL_phone.leaveGroupCall leavegroupcall2 = new TL_phone.leaveGroupCall();
                    leavegroupcall2.call = inputGroupCall;
                    ConnectionsManager.getInstance(i2).sendRequest(leavegroupcall2, new ProfileActivity$$ExternalSyntheticLambda65(26, livePlayer2, (TLRPC.Updates) tLObject));
                    break;
                } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer2, 4));
                    break;
                }
                break;
            case 2:
                final LivePlayer livePlayer3 = this.f$0;
                livePlayer3.getClass();
                final int i6 = 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i6) {
                            case 0:
                                LivePlayer livePlayer4 = livePlayer3;
                                if (!livePlayer4.destroyed) {
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        int i7 = livePlayer4.currentAccount;
                                        MessagesController.getInstance(i7).putUsers(groupcall.users, false);
                                        MessagesController.getInstance(i7).putChats(groupcall.chats, false);
                                        livePlayer4.call = groupcall.call;
                                        NotificationCenter.getInstance(i7).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer4.call.id));
                                    } else {
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer4, 4));
                                        }
                                    }
                                    if (livePlayer4.polling) {
                                        Runnable runnable = livePlayer4.poll2Runnable;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        LivePlayer$$ExternalSyntheticLambda13 livePlayer$$ExternalSyntheticLambda13 = new LivePlayer$$ExternalSyntheticLambda13(livePlayer4, 11);
                                        livePlayer4.poll2Runnable = livePlayer$$ExternalSyntheticLambda13;
                                        AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda13, livePlayer4.isAdmin() ? 5000 : 20000);
                                    }
                                    break;
                                }
                                break;
                            default:
                                LivePlayer livePlayer5 = livePlayer3;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!livePlayer5.destroyed) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(livePlayer5.mySource))) {
                                            if (livePlayer5.instance != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance2 = livePlayer5.instance;
                                                Objects.requireNonNull(nativeInstance2);
                                                dispatchQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance2, 4));
                                                livePlayer5.srcs.clear();
                                                livePlayer5.instance = null;
                                            }
                                            livePlayer5.init$4();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(livePlayer5.currentAccount).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(livePlayer5.currentAccount).putChats(groupcall2.chats, false);
                                        livePlayer5.call = groupcall2.call;
                                        NotificationCenter.getInstance(livePlayer5.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer5.call.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer5, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer5, 4));
                                        }
                                    }
                                    if (livePlayer5.polling) {
                                        Runnable runnable2 = livePlayer5.pollRunnable;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        LivePlayer$$ExternalSyntheticLambda13 livePlayer$$ExternalSyntheticLambda14 = new LivePlayer$$ExternalSyntheticLambda13(livePlayer5, 10);
                                        livePlayer5.pollRunnable = livePlayer$$ExternalSyntheticLambda14;
                                        AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda14, 4000L);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 3:
                LivePlayer livePlayer4 = this.f$0;
                livePlayer4.getClass();
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i7 = livePlayer4.currentAccount;
                    MessagesController.getInstance(i7).putUsers(groupcall.users, false);
                    MessagesController.getInstance(i7).putChats(groupcall.chats, false);
                    if (livePlayer4.instance != null && !livePlayer4.destroyed) {
                        for (int i8 = 0; i8 < groupcall.participants.size(); i8++) {
                            if (DialogObject.getPeerDialogId(groupcall.participants.get(i8).peer) == livePlayer4.dialogId) {
                                livePlayer4.participant = groupcall.participants.get(i8);
                                groupCallParticipant = livePlayer4.participant;
                                if (groupCallParticipant != null || (tL_groupCallParticipantVideo = groupCallParticipant.video) == null) {
                                    AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer4, 7));
                                } else {
                                    NativeInstance nativeInstance2 = livePlayer4.instance;
                                    String str2 = tL_groupCallParticipantVideo.endpoint;
                                    NativeInstance.SsrcGroup[] ssrcGroupArrCreateSsrcGroups$2 = LivePlayer.createSsrcGroups$1(tL_groupCallParticipantVideo);
                                    livePlayer4.pushSources(ssrcGroupArrCreateSsrcGroups$2);
                                    nativeInstance2.addIncomingVideoOutput(2, str2, ssrcGroupArrCreateSsrcGroups$2, livePlayer4.instanceSink, DialogObject.getPeerDialogId(livePlayer4.participant.peer));
                                }
                            }
                            break;
                        }
                        groupCallParticipant = livePlayer4.participant;
                        if (groupCallParticipant != null) {
                        }
                        AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer4, 7));
                        break;
                    }
                }
                break;
            case 4:
                final LivePlayer livePlayer5 = this.f$0;
                livePlayer5.getClass();
                final int i9 = 1;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i9) {
                            case 0:
                                LivePlayer livePlayer6 = livePlayer5;
                                if (!livePlayer6.destroyed) {
                                    TLObject tLObject2 = tLObject;
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        int i10 = livePlayer6.currentAccount;
                                        MessagesController.getInstance(i10).putUsers(groupcall2.users, false);
                                        MessagesController.getInstance(i10).putChats(groupcall2.chats, false);
                                        livePlayer6.call = groupcall2.call;
                                        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer6.call.id));
                                    } else {
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer6, 4));
                                        }
                                    }
                                    if (livePlayer6.polling) {
                                        Runnable runnable = livePlayer6.poll2Runnable;
                                        if (runnable != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable);
                                        }
                                        LivePlayer$$ExternalSyntheticLambda13 livePlayer$$ExternalSyntheticLambda13 = new LivePlayer$$ExternalSyntheticLambda13(livePlayer6, 11);
                                        livePlayer6.poll2Runnable = livePlayer$$ExternalSyntheticLambda13;
                                        AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda13, livePlayer6.isAdmin() ? 5000 : 20000);
                                    }
                                    break;
                                }
                                break;
                            default:
                                LivePlayer livePlayer7 = livePlayer5;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!livePlayer7.destroyed) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(livePlayer7.mySource))) {
                                            if (livePlayer7.instance != null) {
                                                DispatchQueue dispatchQueue = Utilities.globalQueue;
                                                NativeInstance nativeInstance3 = livePlayer7.instance;
                                                Objects.requireNonNull(nativeInstance3);
                                                dispatchQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance3, 4));
                                                livePlayer7.srcs.clear();
                                                livePlayer7.instance = null;
                                            }
                                            livePlayer7.init$4();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall3 = (TL_phone.groupCall) tLObject3;
                                        MessagesController.getInstance(livePlayer7.currentAccount).putUsers(groupcall3.users, false);
                                        MessagesController.getInstance(livePlayer7.currentAccount).putChats(groupcall3.chats, false);
                                        livePlayer7.call = groupcall3.call;
                                        NotificationCenter.getInstance(livePlayer7.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(livePlayer7.call.id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer7, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer7, 4));
                                        }
                                    }
                                    if (livePlayer7.polling) {
                                        Runnable runnable2 = livePlayer7.pollRunnable;
                                        if (runnable2 != null) {
                                            AndroidUtilities.cancelRunOnUIThread(runnable2);
                                        }
                                        LivePlayer$$ExternalSyntheticLambda13 livePlayer$$ExternalSyntheticLambda14 = new LivePlayer$$ExternalSyntheticLambda13(livePlayer7, 10);
                                        livePlayer7.pollRunnable = livePlayer$$ExternalSyntheticLambda14;
                                        AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda14, 4000L);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                LivePlayer livePlayer6 = this.f$0;
                livePlayer6.getClass();
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates2 = (TLRPC.Updates) tLObject;
                    int i10 = livePlayer6.currentAccount;
                    MessagesController.getInstance(i10).putUsers(updates2.users, false);
                    MessagesController.getInstance(i10).putChats(updates2.chats, false);
                    MessagesController.getInstance(i10).processUpdates(updates2, false);
                    break;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer6, 4));
                    break;
                }
                break;
        }
    }
}
