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
public final class n30 implements View.OnClickListener {
    public final x5 f35427a = new x5(this, 5);
    public final f60 f35428b;

    public n30(f60 f60Var) {
        this.f35428b = f60Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.j40 j40Var;
        int i10;
        TLObject chat;
        LaunchActivity launchActivity;
        f60 f60Var = this.f35428b;
        l30 l30Var = f60Var.f33193x;
        ArrayList arrayList = f60Var.f33162q0;
        org.telegram.ui.Components.voip.v2 v2Var = f60Var.f33188w;
        org.telegram.ui.Components.yi0 yi0Var = f60Var.K0;
        AccountInstance accountInstance = f60Var.d;
        if (f60Var.f33099a1 != null && f60Var.F1 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (f60Var.r1() && !f60Var.f33099a1.isScheduled()) {
                x30 x30Var = f60Var.a2;
                if (x30Var != null && x30Var.f29029b && (AndroidUtilities.isTablet() || f60.F3 == f60Var.q1())) {
                    f60Var.e1(null);
                    if (f60.F3) {
                        AndroidUtilities.runOnUIThread(new d10(this, 5), 200L);
                    }
                    f60Var.f33132i0.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    ChatObject.VideoParticipant videoParticipant = (ChatObject.VideoParticipant) arrayList.get(0);
                    if (AndroidUtilities.isTablet()) {
                        f60Var.e1(videoParticipant);
                        return;
                    }
                    if (f60.F3 == f60Var.q1()) {
                        f60Var.e1(videoParticipant);
                    }
                    if (f60Var.q1()) {
                        f60Var.f33132i0.setRequestedOrientation(6);
                        return;
                    } else {
                        f60Var.f33132i0.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = f60Var.F1;
            if (i13 == 5) {
                if (!f60Var.H1) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    f60Var.H1 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    startscheduledgroupcall.call = f60Var.f33099a1.getInputGroupCall();
                    accountInstance.getConnectionsManager().sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final n30 f35140b;

                        {
                            this.f35140b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    n30 n30Var = this.f35140b;
                                    if (tLObject != null) {
                                        n30Var.f35428b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        n30Var.getClass();
                                        return;
                                    }
                                default:
                                    n30 n30Var2 = this.f35140b;
                                    if (tLObject != null) {
                                        n30Var2.f35428b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        n30Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = f60Var.T1) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = f60Var.F1;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                if (Build.VERSION.SDK_INT >= 23 && (launchActivity = f60Var.f33132i0) != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    org.telegram.ui.Components.de0.e(R.raw.permission_request_microphone, R.string.VoipNeedMicPermissionWithHint, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ai.i(16));
                                    return;
                                }
                                f60Var.J1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                v2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            f60Var.J1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            v2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!f60Var.o1() && !f60Var.L0) {
                        f60Var.L0 = true;
                        AndroidUtilities.shakeView(v2Var.getTextView());
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
                        yi0Var.P(i15);
                        yi0Var.S(i15 - 1, this.f35427a);
                        l30Var.setAnimation(yi0Var);
                        yi0Var.M(i12);
                        l30Var.d();
                        if (f60Var.F1 == 2) {
                            long peerId = MessageObject.getPeerId(((TLRPC.GroupCallParticipant) f60Var.f33099a1.participants.f(MessageObject.getPeerId(f60Var.A0))).peer);
                            if (DialogObject.isUserDialog(peerId)) {
                                chat = accountInstance.getMessagesController().getUser(Long.valueOf(peerId));
                            } else {
                                chat = accountInstance.getMessagesController().getChat(Long.valueOf(-peerId));
                            }
                            VoIPService.getSharedInstance().editCallMember(chat, null, null, null, Boolean.TRUE, null);
                            f60Var.J1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (j40Var = f60Var.f33150n0) != null) {
                    j40Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                togglegroupcallstartsubscription.call = f60Var.f33099a1.getInputGroupCall();
                TLRPC.GroupCall groupCall = f60Var.f33099a1.call;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                accountInstance.getConnectionsManager().sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final n30 f35140b;

                    {
                        this.f35140b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                n30 n30Var = this.f35140b;
                                if (tLObject != null) {
                                    n30Var.f35428b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    n30Var.getClass();
                                    return;
                                }
                            default:
                                n30 n30Var2 = this.f35140b;
                                if (tLObject != null) {
                                    n30Var2.f35428b.d.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    n30Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (f60Var.f33099a1.call.schedule_start_subscribed) {
                    i11 = 7;
                }
                f60Var.J1(i11, true);
            }
        }
    }
}
