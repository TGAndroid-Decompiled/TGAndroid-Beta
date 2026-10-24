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
public final class a30 implements View.OnClickListener {
    public final z5 f35559a = new z5(this, 5);
    public final u50 f35560b;

    public a30(u50 u50Var) {
        this.f35560b = u50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.p40 p40Var;
        int i10;
        TLObject chat;
        u50 u50Var = this.f35560b;
        y20 y20Var = u50Var.f42312x;
        ArrayList arrayList = u50Var.f42281q0;
        org.telegram.ui.Components.voip.t2 t2Var = u50Var.f42307w;
        org.telegram.ui.Components.xj0 xj0Var = u50Var.K0;
        AccountInstance accountInstance = u50Var.d;
        if (u50Var.f42217a1 != null && u50Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (u50Var.r1() && !u50Var.f42217a1.isScheduled()) {
                k30 k30Var = u50Var.a2;
                if (k30Var != null && k30Var.f31670b && (AndroidUtilities.isTablet() || u50.F3 == u50Var.q1())) {
                    u50Var.e1(null);
                    if (u50.F3) {
                        AndroidUtilities.runOnUIThread(new fz(this, 6), 200L);
                    }
                    u50Var.f42250i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        u50Var.e1(videoParticipant);
                        return;
                    }
                    if (u50.F3 == u50Var.q1()) {
                        u50Var.e1(videoParticipant);
                    }
                    if (u50Var.q1()) {
                        u50Var.f42250i0.setRequestedOrientation(6);
                        return;
                    } else {
                        u50Var.f42250i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = u50Var.F1;
            if (i13 == 5) {
                if (!u50Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    u50Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = u50Var.f42217a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final a30 f44007b;

                        {
                            this.f44007b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    a30 a30Var = this.f44007b;
                                    if (tLObject != null) {
                                        a30Var.f35560b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        a30Var.getClass();
                                        return;
                                    }
                                default:
                                    a30 a30Var2 = this.f44007b;
                                    if (tLObject != null) {
                                        a30Var2.f35560b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        a30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = u50Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = u50Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = u50Var.f42250i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.ze0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ci.e(16));
                                    return;
                                }
                                u50Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                t2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            u50Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            t2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!u50Var.o1() && !u50Var.L0) {
                        u50Var.L0 = true;
                        AndroidUtilities.shakeView(t2Var.getTextView());
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
                        xj0Var.P(i15);
                        xj0Var.S(i15 - 1, this.f35559a);
                        y20Var.setAnimation(xj0Var);
                        xj0Var.M(i12);
                        y20Var.d();
                        if (u50Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) u50Var.f42217a1.participants.f(MessageObject.getPeerId(u50Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            u50Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (p40Var = u50Var.f42269n0) != null) {
                    p40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = u50Var.f42217a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = u50Var.f42217a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final a30 f44007b;

                    {
                        this.f44007b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                a30 a30Var = this.f44007b;
                                if (tLObject != null) {
                                    a30Var.f35560b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    a30Var.getClass();
                                    return;
                                }
                            default:
                                a30 a30Var2 = this.f44007b;
                                if (tLObject != null) {
                                    a30Var2.f35560b.d.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    a30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (u50Var.f42217a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                u50Var.K1(i11, true);
            }
        }
    }
}
