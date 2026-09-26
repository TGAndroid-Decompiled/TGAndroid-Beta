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
public final class l30 implements View.OnClickListener {
    public final w5 f35210a = new w5(this, 5);
    public final d60 f35211b;

    public l30(d60 d60Var) {
        this.f35211b = d60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.k40 k40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        d60 d60Var = this.f35211b;
        j30 j30Var = d60Var.f33028x;
        ArrayList arrayList = d60Var.f32997q0;
        org.telegram.ui.Components.voip.w2 w2Var = d60Var.f33023w;
        org.telegram.ui.Components.jj0 jj0Var = d60Var.K0;
        AccountInstance accountInstance = d60Var.d;
        if (d60Var.f32934a1 != null && d60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (d60Var.r1() && !d60Var.f32934a1.isScheduled()) {
                v30 v30Var = d60Var.a2;
                if (v30Var != null && v30Var.f29378b && (AndroidUtilities.isTablet() || d60.F3 == d60Var.q1())) {
                    d60Var.e1(null);
                    if (d60.F3) {
                        AndroidUtilities.runOnUIThread(new c10(this, 5), 200L);
                    }
                    d60Var.f32967i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        d60Var.e1(videoParticipant);
                        return;
                    }
                    if (d60.F3 == d60Var.q1()) {
                        d60Var.e1(videoParticipant);
                    }
                    if (d60Var.q1()) {
                        d60Var.f32967i0.setRequestedOrientation(6);
                        return;
                    } else {
                        d60Var.f32967i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = d60Var.F1;
            if (i13 == 5) {
                if (!d60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    d60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = d60Var.f32934a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final l30 f34919b;

                        {
                            this.f34919b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    l30 l30Var = this.f34919b;
                                    if (tLObject != null) {
                                        l30Var.f35211b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        l30Var.getClass();
                                        return;
                                    }
                                default:
                                    l30 l30Var2 = this.f34919b;
                                    if (tLObject != null) {
                                        l30Var2.f35211b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        l30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = d60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = d60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = d60Var.f32967i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.oe0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
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
                    } else if (!d60Var.o1() && !d60Var.L0) {
                        d60Var.L0 = true;
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
                        jj0Var.P(i15);
                        jj0Var.S(i15 - 1, this.f35210a);
                        j30Var.setAnimation(jj0Var);
                        jj0Var.M(i12);
                        j30Var.d();
                        if (d60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) d60Var.f32934a1.participants.f(MessageObject.getPeerId(d60Var.A0))).peer);
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
                if (i13 == 6 && (k40Var = d60Var.f32985n0) != null) {
                    k40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = d60Var.f32934a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = d60Var.f32934a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final l30 f34919b;

                    {
                        this.f34919b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                l30 l30Var = this.f34919b;
                                if (tLObject != null) {
                                    l30Var.f35211b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    l30Var.getClass();
                                    return;
                                }
                            default:
                                l30 l30Var2 = this.f34919b;
                                if (tLObject != null) {
                                    l30Var2.f35211b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    l30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (d60Var.f32934a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                d60Var.J1(i11, true);
            }
        }
    }
}
