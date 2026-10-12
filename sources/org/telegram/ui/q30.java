package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class q30 implements View.OnClickListener {
    public final z5 f41186a = new z5(this, 5);
    public final i60 f41187b;

    public q30(i60 i60Var) {
        this.f41187b = i60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.c50 c50Var;
        int i10;
        TLObject chat;
        i60 i60Var = this.f41187b;
        o30 o30Var = i60Var.f38776x;
        ArrayList arrayList = i60Var.f38745q0;
        org.telegram.ui.Components.voip.w2 w2Var = i60Var.f38771w;
        org.telegram.ui.Components.fk0 fk0Var = i60Var.K0;
        AccountInstance accountInstance = i60Var.d;
        if (i60Var.f38681a1 != null && i60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (i60Var.s1() && !i60Var.f38681a1.isScheduled()) {
                a40 a40Var = i60Var.a2;
                if (a40Var != null && a40Var.f31799b && (AndroidUtilities.isTablet() || i60.F3 == i60Var.r1())) {
                    i60Var.f1(null);
                    if (i60.F3) {
                        AndroidUtilities.runOnUIThread(new wz(this, 6), 200L);
                    }
                    i60Var.f38715i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        i60Var.f1(videoParticipant);
                        return;
                    }
                    if (i60.F3 == i60Var.r1()) {
                        i60Var.f1(videoParticipant);
                    }
                    if (i60Var.r1()) {
                        i60Var.f38715i0.setRequestedOrientation(6);
                        return;
                    } else {
                        i60Var.f38715i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = i60Var.F1;
            if (i13 == 5) {
                if (!i60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    i60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = i60Var.f38681a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final q30 f40839b;

                        {
                            this.f40839b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    q30 q30Var = this.f40839b;
                                    if (tLObject != null) {
                                        q30Var.f41187b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        q30Var.getClass();
                                        return;
                                    }
                                default:
                                    q30 q30Var2 = this.f40839b;
                                    if (tLObject != null) {
                                        q30Var2.f41187b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        q30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = i60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = i60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = i60Var.f38715i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.if0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
                                    return;
                                }
                                i60Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                w2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            i60Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            w2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!i60Var.p1() && !i60Var.L0) {
                        i60Var.L0 = true;
                        AndroidUtilities.shakeView(w2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (nextInt >= 32) {
                            i12 = 240;
                            if (nextInt >= 64) {
                                i15 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i15 = 720;
                                    }
                                }
                            }
                            int i16 = i12;
                            i12 = i15;
                            i15 = i16;
                        }
                        fk0Var.P(i15);
                        fk0Var.S(i15 - 1, this.f41186a);
                        o30Var.setAnimation(fk0Var);
                        fk0Var.M(i12);
                        o30Var.d();
                        if (i60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) i60Var.f38681a1.participants.f(MessageObject.getPeerId(i60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            i60Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (c50Var = i60Var.f38733n0) != null) {
                    c50Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = i60Var.f38681a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = i60Var.f38681a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final q30 f40839b;

                    {
                        this.f40839b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                q30 q30Var = this.f40839b;
                                if (tLObject != null) {
                                    q30Var.f41187b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q30Var.getClass();
                                    return;
                                }
                            default:
                                q30 q30Var2 = this.f40839b;
                                if (tLObject != null) {
                                    q30Var2.f41187b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (i60Var.f38681a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                i60Var.K1(i11, true);
            }
        }
    }
}
