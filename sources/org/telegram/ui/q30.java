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
public final class q30 implements View.OnClickListener {
    public final x5 f39614a = new x5(this, 5);
    public final h60 f39615b;

    public q30(h60 h60Var) {
        this.f39615b = h60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m40 m40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        h60 h60Var = this.f39615b;
        o30 o30Var = h60Var.f36969x;
        ArrayList arrayList = h60Var.f36938q0;
        org.telegram.ui.Components.voip.w2 w2Var = h60Var.f36964w;
        org.telegram.ui.Components.kj0 kj0Var = h60Var.K0;
        AccountInstance accountInstance = h60Var.d;
        if (h60Var.f36874a1 != null && h60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (h60Var.r1() && !h60Var.f36874a1.isScheduled()) {
                a40 a40Var = h60Var.a2;
                if (a40Var != null && a40Var.f31976b && (AndroidUtilities.isTablet() || h60.F3 == h60Var.q1())) {
                    h60Var.e1(null);
                    if (h60.F3) {
                        AndroidUtilities.runOnUIThread(new g10(this, 5), 200L);
                    }
                    h60Var.f36908i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        h60Var.e1(videoParticipant);
                        return;
                    }
                    if (h60.F3 == h60Var.q1()) {
                        h60Var.e1(videoParticipant);
                    }
                    if (h60Var.q1()) {
                        h60Var.f36908i0.setRequestedOrientation(6);
                        return;
                    } else {
                        h60Var.f36908i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = h60Var.F1;
            if (i13 == 5) {
                if (!h60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    h60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = h60Var.f36874a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final q30 f39333b;

                        {
                            this.f39333b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    q30 q30Var = this.f39333b;
                                    if (tLObject != null) {
                                        q30Var.f39615b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        q30Var.getClass();
                                        return;
                                    }
                                default:
                                    q30 q30Var2 = this.f39333b;
                                    if (tLObject != null) {
                                        q30Var2.f39615b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
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
                if (VoIPService.getSharedInstance() != null && (i10 = h60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = h60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = h60Var.f36908i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.pe0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
                                    return;
                                }
                                h60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                w2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            h60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            w2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!h60Var.o1() && !h60Var.L0) {
                        h60Var.L0 = true;
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
                        kj0Var.S(i15 - 1, this.f39614a);
                        o30Var.setAnimation(kj0Var);
                        kj0Var.M(i12);
                        o30Var.d();
                        if (h60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) h60Var.f36874a1.participants.f(MessageObject.getPeerId(h60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            h60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (m40Var = h60Var.f36926n0) != null) {
                    m40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = h60Var.f36874a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = h60Var.f36874a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final q30 f39333b;

                    {
                        this.f39333b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                q30 q30Var = this.f39333b;
                                if (tLObject != null) {
                                    q30Var.f39615b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q30Var.getClass();
                                    return;
                                }
                            default:
                                q30 q30Var2 = this.f39333b;
                                if (tLObject != null) {
                                    q30Var2.f39615b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (h60Var.f36874a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                h60Var.J1(i11, true);
            }
        }
    }
}
