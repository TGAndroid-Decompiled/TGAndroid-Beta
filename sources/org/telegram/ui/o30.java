package org.telegram.ui;

import android.os.Build;
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
public final class o30 implements View.OnClickListener {
    public final y5 f36129a = new y5(this, 5);
    public final g60 f36130b;

    public o30(g60 g60Var) {
        this.f36130b = g60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.l40 l40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        g60 g60Var = this.f36130b;
        m30 m30Var = g60Var.f33820x;
        ArrayList arrayList = g60Var.f33789q0;
        org.telegram.ui.Components.voip.w2 w2Var = g60Var.f33815w;
        org.telegram.ui.Components.kj0 kj0Var = g60Var.K0;
        AccountInstance accountInstance = g60Var.d;
        if (g60Var.f33726a1 != null && g60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (g60Var.r1() && !g60Var.f33726a1.isScheduled()) {
                y30 y30Var = g60Var.a2;
                if (y30Var != null && y30Var.f29404b && (AndroidUtilities.isTablet() || g60.F3 == g60Var.q1())) {
                    g60Var.e1(null);
                    if (g60.F3) {
                        AndroidUtilities.runOnUIThread(new f10(this, 5), 200L);
                    }
                    g60Var.f33759i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        g60Var.e1(videoParticipant);
                        return;
                    }
                    if (g60.F3 == g60Var.q1()) {
                        g60Var.e1(videoParticipant);
                    }
                    if (g60Var.q1()) {
                        g60Var.f33759i0.setRequestedOrientation(6);
                        return;
                    } else {
                        g60Var.f33759i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = g60Var.F1;
            if (i13 == 5) {
                if (!g60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = g60Var.f33726a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final o30 f35805b;

                        {
                            this.f35805b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    o30 o30Var = this.f35805b;
                                    if (tLObject != null) {
                                        o30Var.f36130b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o30Var.getClass();
                                        return;
                                    }
                                default:
                                    o30 o30Var2 = this.f35805b;
                                    if (tLObject != null) {
                                        o30Var2.f36130b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = g60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = g60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = g60Var.f33759i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.ne0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
                                    return;
                                }
                                g60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                w2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            g60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            w2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!g60Var.o1() && !g60Var.L0) {
                        g60Var.L0 = true;
                        AndroidUtilities.shakeView(w2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.random.nextInt(100);
                        int i15 = 120;
                        if (nextInt >= 32) {
                            i12 = 240;
                            if (nextInt < 64) {
                                i15 = 240;
                                i12 = 120;
                            } else {
                                i15 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt == 98) {
                                        i15 = 540;
                                        i12 = 420;
                                    } else {
                                        i15 = 720;
                                    }
                                }
                            }
                        }
                        kj0Var.P(i15);
                        kj0Var.S(i15 - 1, this.f36129a);
                        m30Var.setAnimation(kj0Var);
                        kj0Var.M(i12);
                        m30Var.d();
                        if (g60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) g60Var.f33726a1.participants.f(MessageObject.getPeerId(g60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            g60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (l40Var = g60Var.f33777n0) != null) {
                    l40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = g60Var.f33726a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = g60Var.f33726a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final o30 f35805b;

                    {
                        this.f35805b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                o30 o30Var = this.f35805b;
                                if (tLObject != null) {
                                    o30Var.f36130b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o30Var.getClass();
                                    return;
                                }
                            default:
                                o30 o30Var2 = this.f35805b;
                                if (tLObject != null) {
                                    o30Var2.f36130b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (g60Var.f33726a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                g60Var.J1(i11, true);
            }
        }
    }
}
