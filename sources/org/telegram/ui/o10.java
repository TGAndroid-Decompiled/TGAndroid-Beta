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
public final class o10 implements View.OnClickListener {
    public final m4 f48208a = new m4(this, 6);
    public final c40 f48209b;

    public o10(c40 c40Var) {
        this.f48209b = c40Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.y20 y20Var;
        int i7;
        TLObject M0;
        c40 c40Var = this.f48209b;
        m10 m10Var = c40Var.f44627t1;
        ArrayList arrayList = c40Var.f44573h2;
        org.telegram.ui.Components.voip.n2 n2Var = c40Var.f44623s1;
        org.telegram.ui.Components.zg0 zg0Var = c40Var.B2;
        org.telegram.messenger.c cVar = c40Var.f44586k1;
        if (c40Var.R2 != null && c40Var.f44642w3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (c40Var.u1() && !c40Var.R2.j()) {
                z10 z10Var = c40Var.R3;
                if (z10Var != null && z10Var.f39237b && (org.telegram.messenger.g0.Q1() || c40.f44542w5 == c40Var.t1())) {
                    c40Var.h1(null);
                    if (c40.f44542w5) {
                        org.telegram.messenger.g0.i3(new hz(this, 5), 200L);
                    }
                    c40Var.Z1.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        c40Var.h1(s3Var);
                        return;
                    }
                    if (c40.f44542w5 == c40Var.t1()) {
                        c40Var.h1(s3Var);
                    }
                    if (c40Var.t1()) {
                        c40Var.Z1.setRequestedOrientation(6);
                        return;
                    } else {
                        c40Var.Z1.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = c40Var.f44642w3;
            if (i12 == 5) {
                if (!c40Var.f44650y3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c40Var.f44650y3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.r3 r3Var = c40Var.R2;
                    startscheduledgroupcall.call = r3Var.g(r3Var.f25200a);
                    ConnectionsManager.getInstance(cVar.f21723a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final o10 f47938b;

                        {
                            this.f47938b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    o10 o10Var = this.f47938b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.qp.s1(o10Var.f48209b.f44586k1.f21723a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o10Var.getClass();
                                        return;
                                    }
                                default:
                                    o10 o10Var2 = this.f47938b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.qp.s1(o10Var2.f48209b.f44586k1.f21723a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o10Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i12 != 7 && i12 != 6) {
                if (VoIPService.getSharedInstance() != null && (i7 = c40Var.K3) != 1 && i7 != 2 && i7 != 6 && i7 != 5) {
                    int i13 = c40Var.f44642w3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = c40Var.Z1;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    c8.ia.c(2131624120, 2131743284, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(18));
                                    return;
                                }
                                c40Var.P1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                n2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            c40Var.P1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            n2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!c40Var.r1() && !c40Var.C2) {
                        c40Var.C2 = true;
                        org.telegram.messenger.g0.F3(n2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f21331b.nextInt(100);
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
                        zg0Var.P(i14);
                        zg0Var.S(i14 - 1, this.f48208a);
                        m10Var.setAnimation(zg0Var);
                        zg0Var.M(i11);
                        m10Var.d();
                        if (c40Var.f44642w3 == 2) {
                            long C1 = org.telegram.messenger.ij.C1(((TLRPC.GroupCallParticipant) c40Var.R2.d.f(org.telegram.messenger.ij.C1(c40Var.f44619r2))).peer);
                            if (org.telegram.messenger.m5.E(C1)) {
                                M0 = org.telegram.messenger.qp.s1(cVar.f21723a).a2(Long.valueOf(C1));
                            } else {
                                M0 = org.telegram.messenger.qp.s1(cVar.f21723a).M0(Long.valueOf(-C1));
                            }
                            VoIPService.getSharedInstance().editCallMember(M0, null, null, null, Boolean.TRUE, null);
                            c40Var.P1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (y20Var = c40Var.f44561e2) != null) {
                    y20Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.r3 r3Var2 = c40Var.R2;
                togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.f25200a);
                TLRPC.GroupCall groupCall = c40Var.R2.f25201b;
                boolean z9 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z9;
                togglegroupcallstartsubscription.subscribed = z9;
                ConnectionsManager.getInstance(cVar.f21723a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final o10 f47938b;

                    {
                        this.f47938b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                o10 o10Var = this.f47938b;
                                if (tLObject != null) {
                                    org.telegram.messenger.qp.s1(o10Var.f48209b.f44586k1.f21723a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o10Var.getClass();
                                    return;
                                }
                            default:
                                o10 o10Var2 = this.f47938b;
                                if (tLObject != null) {
                                    org.telegram.messenger.qp.s1(o10Var2.f48209b.f44586k1.f21723a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (c40Var.R2.f25201b.schedule_start_subscribed) {
                    i10 = 7;
                }
                c40Var.P1(i10, true);
            }
        }
    }
}
