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
public final class m30 implements View.OnClickListener {
    public final z5 f38953a = new z5(this, 5);
    public final d60 f38954b;

    public m30(d60 d60Var) {
        this.f38954b = d60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.m40 m40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        d60 d60Var = this.f38954b;
        k30 k30Var = d60Var.f36107x;
        ArrayList arrayList = d60Var.f36064n0;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.f36102w;
        org.telegram.ui.Components.ij0 ij0Var = d60Var.H0;
        AccountInstance accountInstance = d60Var.d;
        if (d60Var.X0 != null && d60Var.C1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (d60Var.r1() && !d60Var.X0.isScheduled()) {
                w30 w30Var = d60Var.X1;
                if (w30Var != null && w30Var.f32140b && (AndroidUtilities.isTablet() || d60.C3 == d60Var.q1())) {
                    d60Var.e1(null);
                    if (d60.C3) {
                        AndroidUtilities.runOnUIThread(new c10(this, 5), 200L);
                    }
                    d60Var.f36033f0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        d60Var.e1(videoParticipant);
                        return;
                    }
                    if (d60.C3 == d60Var.q1()) {
                        d60Var.e1(videoParticipant);
                    }
                    if (d60Var.q1()) {
                        d60Var.f36033f0.setRequestedOrientation(6);
                        return;
                    } else {
                        d60Var.f36033f0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = d60Var.C1;
            if (i13 == 5) {
                if (!d60Var.E1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    d60Var.E1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = d60Var.X0.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final m30 f38570b;

                        {
                            this.f38570b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    m30 m30Var = this.f38570b;
                                    if (tLObject != null) {
                                        m30Var.f38954b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        m30Var.getClass();
                                        return;
                                    }
                                default:
                                    m30 m30Var2 = this.f38570b;
                                    if (tLObject != null) {
                                        m30Var2.f38954b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        m30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = d60Var.Q1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = d60Var.C1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = d60Var.f36033f0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.ie0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new hg.h(4));
                                    return;
                                }
                                d60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                w2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            d60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            w2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!d60Var.o1() && !d60Var.I0) {
                        d60Var.I0 = true;
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
                        ij0Var.N(i15);
                        ij0Var.P(i15 - 1, this.f38953a);
                        k30Var.setAnimation(ij0Var);
                        ij0Var.K(i12);
                        k30Var.d();
                        if (d60Var.C1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) d60Var.X0.participants.f(MessageObject.getPeerId(d60Var.f36108x0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            d60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (m40Var = d60Var.f36053k0) != null) {
                    m40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = d60Var.X0.getInputGroupCall();
                TLRPC.GroupCall groupCall = d60Var.X0.call;
                boolean z4 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z4;
                togglegroupcallstartsubscription.subscribed = z4;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final m30 f38570b;

                    {
                        this.f38570b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                m30 m30Var = this.f38570b;
                                if (tLObject != null) {
                                    m30Var.f38954b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    m30Var.getClass();
                                    return;
                                }
                            default:
                                m30 m30Var2 = this.f38570b;
                                if (tLObject != null) {
                                    m30Var2.f38954b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    m30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (d60Var.X0.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                d60Var.J1(i11, true);
            }
        }
    }
}
