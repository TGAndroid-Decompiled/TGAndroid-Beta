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
public final class e30 implements View.OnClickListener {
    public final y5 f38744a = new y5(this, 5);
    public final x50 f38745b;

    public e30(x50 x50Var) {
        this.f38745b = x50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.t40 t40Var;
        int i10;
        TLObject chat;
        x50 x50Var = this.f38745b;
        c30 c30Var = x50Var.f45586x;
        ArrayList arrayList = x50Var.f45555q0;
        org.telegram.ui.Components.voip.w2 w2Var = x50Var.f45581w;
        org.telegram.ui.Components.yj0 yj0Var = x50Var.K0;
        AccountInstance accountInstance = x50Var.d;
        if (x50Var.f45491a1 != null && x50Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (x50Var.r1() && !x50Var.f45491a1.isScheduled()) {
                o30 o30Var = x50Var.a2;
                if (o30Var != null && o30Var.f34008b && (AndroidUtilities.isTablet() || x50.F3 == x50Var.q1())) {
                    x50Var.e1(null);
                    if (x50.F3) {
                        AndroidUtilities.runOnUIThread(new r00(this, 5), 200L);
                    }
                    x50Var.f45524i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        x50Var.e1(videoParticipant);
                        return;
                    }
                    if (x50.F3 == x50Var.q1()) {
                        x50Var.e1(videoParticipant);
                    }
                    if (x50Var.q1()) {
                        x50Var.f45524i0.setRequestedOrientation(6);
                        return;
                    } else {
                        x50Var.f45524i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = x50Var.F1;
            if (i13 == 5) {
                if (!x50Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    x50Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = x50Var.f45491a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final e30 f38509b;

                        {
                            this.f38509b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    e30 e30Var = this.f38509b;
                                    if (tLObject != null) {
                                        e30Var.f38745b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        e30Var.getClass();
                                        return;
                                    }
                                default:
                                    e30 e30Var2 = this.f38509b;
                                    if (tLObject != null) {
                                        e30Var2.f38745b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        e30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = x50Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = x50Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = x50Var.f45524i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.ye0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(16));
                                    return;
                                }
                                x50Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                w2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            x50Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            w2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!x50Var.o1() && !x50Var.L0) {
                        x50Var.L0 = true;
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
                        yj0Var.P(i15);
                        yj0Var.S(i15 - 1, this.f38744a);
                        c30Var.setAnimation(yj0Var);
                        yj0Var.M(i12);
                        c30Var.d();
                        if (x50Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) x50Var.f45491a1.participants.f(MessageObject.getPeerId(x50Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            x50Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (t40Var = x50Var.f45543n0) != null) {
                    t40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = x50Var.f45491a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = x50Var.f45491a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final e30 f38509b;

                    {
                        this.f38509b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                e30 e30Var = this.f38509b;
                                if (tLObject != null) {
                                    e30Var.f38745b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    e30Var.getClass();
                                    return;
                                }
                            default:
                                e30 e30Var2 = this.f38509b;
                                if (tLObject != null) {
                                    e30Var2.f38745b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    e30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (x50Var.f45491a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                x50Var.K1(i11, true);
            }
        }
    }
}
