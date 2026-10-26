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
public final class c30 implements View.OnClickListener {
    public final y5 f38241a = new y5(this, 5);
    public final v50 f38242b;

    public c30(v50 v50Var) {
        this.f38242b = v50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.t40 t40Var;
        int i10;
        TLObject chat;
        v50 v50Var = this.f38242b;
        a30 a30Var = v50Var.f44705x;
        ArrayList arrayList = v50Var.f44674q0;
        org.telegram.ui.Components.voip.w2 w2Var = v50Var.f44700w;
        org.telegram.ui.Components.xj0 xj0Var = v50Var.K0;
        AccountInstance accountInstance = v50Var.d;
        if (v50Var.f44610a1 != null && v50Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (v50Var.r1() && !v50Var.f44610a1.isScheduled()) {
                m30 m30Var = v50Var.a2;
                if (m30Var != null && m30Var.f33903b && (AndroidUtilities.isTablet() || v50.F3 == v50Var.q1())) {
                    v50Var.e1(null);
                    if (v50.F3) {
                        AndroidUtilities.runOnUIThread(new p00(this, 5), 200L);
                    }
                    v50Var.f44643i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        v50Var.e1(videoParticipant);
                        return;
                    }
                    if (v50.F3 == v50Var.q1()) {
                        v50Var.e1(videoParticipant);
                    }
                    if (v50Var.q1()) {
                        v50Var.f44643i0.setRequestedOrientation(6);
                        return;
                    } else {
                        v50Var.f44643i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = v50Var.F1;
            if (i13 == 5) {
                if (!v50Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    v50Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = v50Var.f44610a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final c30 f37968b;

                        {
                            this.f37968b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    c30 c30Var = this.f37968b;
                                    if (tLObject != null) {
                                        c30Var.f38242b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        c30Var.getClass();
                                        return;
                                    }
                                default:
                                    c30 c30Var2 = this.f37968b;
                                    if (tLObject != null) {
                                        c30Var2.f38242b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        c30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = v50Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = v50Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = v50Var.f44643i0;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.xe0.c(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(16));
                                    return;
                                }
                                v50Var.K1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                w2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            v50Var.K1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            w2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!v50Var.o1() && !v50Var.L0) {
                        v50Var.L0 = true;
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
                        xj0Var.P(i15);
                        xj0Var.S(i15 - 1, this.f38241a);
                        a30Var.setAnimation(xj0Var);
                        xj0Var.M(i12);
                        a30Var.d();
                        if (v50Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) v50Var.f44610a1.participants.f(MessageObject.getPeerId(v50Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            v50Var.K1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (t40Var = v50Var.f44662n0) != null) {
                    t40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = v50Var.f44610a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = v50Var.f44610a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final c30 f37968b;

                    {
                        this.f37968b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                c30 c30Var = this.f37968b;
                                if (tLObject != null) {
                                    c30Var.f38242b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    c30Var.getClass();
                                    return;
                                }
                            default:
                                c30 c30Var2 = this.f37968b;
                                if (tLObject != null) {
                                    c30Var2.f38242b.d.getMessagesController().lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    c30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (v50Var.f44610a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                v50Var.K1(i11, true);
            }
        }
    }
}
