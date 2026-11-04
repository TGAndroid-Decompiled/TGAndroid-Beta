package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
public final class k10 implements View.OnClickListener {
    public final o4 f46741a = new o4(this, 6);
    public final x30 f46742b;

    public k10(x30 x30Var) {
        this.f46742b = x30Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.u20 u20Var;
        int i3;
        TLObject M0;
        x30 x30Var = this.f46742b;
        i10 i10Var = x30Var.f51801u1;
        ArrayList arrayList = x30Var.f51747i2;
        org.telegram.ui.Components.voip.c2 c2Var = x30Var.f51796t1;
        org.telegram.ui.Components.ch0 ch0Var = x30Var.C2;
        org.telegram.messenger.c cVar = x30Var.f51759l1;
        if (x30Var.S2 != null && x30Var.f51816x3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (x30Var.t1() && !x30Var.S2.j()) {
                u10 u10Var = x30Var.S3;
                if (u10Var != null && u10Var.f39670b && (org.telegram.messenger.g0.Q1() || x30.f51713x5 == x30Var.s1())) {
                    x30Var.g1(null);
                    if (x30.f51713x5) {
                        org.telegram.messenger.g0.i3(new fz(this, 5), 200L);
                    }
                    x30Var.f51716a2.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        x30Var.g1(s3Var);
                        return;
                    }
                    if (x30.f51713x5 == x30Var.s1()) {
                        x30Var.g1(s3Var);
                    }
                    if (x30Var.s1()) {
                        x30Var.f51716a2.setRequestedOrientation(6);
                        return;
                    } else {
                        x30Var.f51716a2.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = x30Var.f51816x3;
            if (i12 == 5) {
                if (!x30Var.f51824z3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    x30Var.f51824z3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.r3 r3Var = x30Var.S2;
                    startscheduledgroupcall.call = r3Var.g(r3Var.f25048a);
                    ConnectionsManager.getInstance(cVar.f21919a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final k10 f46481b;

                        {
                            this.f46481b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    k10 k10Var = this.f46481b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.hp.s1(k10Var.f46742b.f51759l1.f21919a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        k10Var.getClass();
                                        return;
                                    }
                                default:
                                    k10 k10Var2 = this.f46481b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.hp.s1(k10Var2.f46742b.f51759l1.f21919a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        k10Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i12 != 7 && i12 != 6) {
                if (VoIPService.getSharedInstance() != null && (i3 = x30Var.L3) != 1 && i3 != 2 && i3 != 6 && i3 != 5) {
                    int i13 = x30Var.f51816x3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = x30Var.f51716a2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    b8.nf.c(2131624120, 2131743293, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ei.e(16));
                                    return;
                                }
                                x30Var.M1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                c2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            x30Var.M1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            c2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!x30Var.q1() && !x30Var.D2) {
                        x30Var.D2 = true;
                        org.telegram.messenger.g0.F3(c2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f21385b.nextInt(100);
                        int i14 = 120;
                        if (nextInt >= 32) {
                            i11 = 240;
                            if (nextInt >= 64) {
                                i14 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i14 = 720;
                                    }
                                }
                            }
                            int i15 = i11;
                            i11 = i14;
                            i14 = i15;
                        }
                        ch0Var.P(i14);
                        ch0Var.S(i14 - 1, this.f46741a);
                        i10Var.setAnimation(ch0Var);
                        ch0Var.M(i11);
                        i10Var.d();
                        if (x30Var.f51816x3 == 2) {
                            long C1 = org.telegram.messenger.zi.C1(((TLRPC.GroupCallParticipant) x30Var.S2.d.f(org.telegram.messenger.zi.C1(x30Var.f51792s2))).peer);
                            if (org.telegram.messenger.m5.E(C1)) {
                                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).a2(Long.valueOf(C1));
                            } else {
                                M0 = org.telegram.messenger.hp.s1(cVar.f21919a).M0(Long.valueOf(-C1));
                            }
                            VoIPService.getSharedInstance().editCallMember(M0, null, null, null, Boolean.TRUE, null);
                            x30Var.M1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (u20Var = x30Var.f51735f2) != null) {
                    u20Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.r3 r3Var2 = x30Var.S2;
                togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.f25048a);
                TLRPC.GroupCall groupCall = x30Var.S2.f25049b;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                ConnectionsManager.getInstance(cVar.f21919a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final k10 f46481b;

                    {
                        this.f46481b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                k10 k10Var = this.f46481b;
                                if (tLObject != null) {
                                    org.telegram.messenger.hp.s1(k10Var.f46742b.f51759l1.f21919a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    k10Var.getClass();
                                    return;
                                }
                            default:
                                k10 k10Var2 = this.f46481b;
                                if (tLObject != null) {
                                    org.telegram.messenger.hp.s1(k10Var2.f46742b.f51759l1.f21919a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    k10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (x30Var.S2.f25049b.schedule_start_subscribed) {
                    i10 = 7;
                }
                x30Var.M1(i10, true);
            }
        }
    }
}
