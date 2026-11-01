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
public final class n20 implements View.OnClickListener {
    public final m4 f39677a = new m4(this, 6);
    public final a50 f39678b;

    public n20(a50 a50Var) {
        this.f39678b = a50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q30 q30Var;
        int i10;
        TLObject L0;
        a50 a50Var = this.f39678b;
        l20 l20Var = a50Var.f35662t1;
        ArrayList arrayList = a50Var.f35606h2;
        org.telegram.ui.Components.voip.c2 c2Var = a50Var.f35657s1;
        org.telegram.ui.Components.ci0 ci0Var = a50Var.B2;
        org.telegram.messenger.c cVar = a50Var.f35620k1;
        if (a50Var.R2 != null && a50Var.f35677w3 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (a50Var.t1() && !a50Var.R2.j()) {
                x20 x20Var = a50Var.R3;
                if (x20Var != null && x20Var.f31792b && (org.telegram.messenger.i0.Q1() || a50.f35575w5 == a50Var.s1())) {
                    a50Var.g1(null);
                    if (a50.f35575w5) {
                        org.telegram.messenger.i0.h3(new yy(this, 6), 200L);
                    }
                    a50Var.Z1.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList.get(0);
                    if (org.telegram.messenger.i0.Q1()) {
                        a50Var.g1(v3Var);
                        return;
                    }
                    if (a50.f35575w5 == a50Var.s1()) {
                        a50Var.g1(v3Var);
                    }
                    if (a50Var.s1()) {
                        a50Var.Z1.setRequestedOrientation(6);
                        return;
                    } else {
                        a50Var.Z1.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = a50Var.f35677w3;
            if (i13 == 5) {
                if (!a50Var.y3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    a50Var.y3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.u3 u3Var = a50Var.R2;
                    startscheduledgroupcall.call = u3Var.g(u3Var.f18360a);
                    ConnectionsManager.getInstance(cVar.f15043a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final n20 f39416b;

                        {
                            this.f39416b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    n20 n20Var = this.f39416b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.wp.r1(n20Var.f39678b.f35620k1.f15043a).L3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        n20Var.getClass();
                                        return;
                                    }
                                default:
                                    n20 n20Var2 = this.f39416b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.wp.r1(n20Var2.f39678b.f35620k1.f15043a).L3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        n20Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = a50Var.K3) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = a50Var.f35677w3;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = a50Var.Z1;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    w7.c6.c(2131624118, 2131743309, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ag.z0(15));
                                    return;
                                }
                                a50Var.M1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                c2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            a50Var.M1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            c2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!a50Var.q1() && !a50Var.C2) {
                        a50Var.C2 = true;
                        org.telegram.messenger.i0.E3(c2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f14520b.nextInt(100);
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
                        ci0Var.P(i15);
                        ci0Var.S(i15 - 1, this.f39677a);
                        l20Var.setAnimation(ci0Var);
                        ci0Var.M(i12);
                        l20Var.d();
                        if (a50Var.f35677w3 == 2) {
                            long C1 = org.telegram.messenger.kj.C1(((TLRPC.GroupCallParticipant) a50Var.R2.d.f(org.telegram.messenger.kj.C1(a50Var.f35653r2))).peer);
                            if (org.telegram.messenger.o5.E(C1)) {
                                L0 = org.telegram.messenger.wp.r1(cVar.f15043a).Z1(Long.valueOf(C1));
                            } else {
                                L0 = org.telegram.messenger.wp.r1(cVar.f15043a).L0(Long.valueOf(-C1));
                            }
                            VoIPService.getSharedInstance().editCallMember(L0, null, null, null, Boolean.TRUE, null);
                            a50Var.M1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (q30Var = a50Var.f35594e2) != null) {
                    q30Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.u3 u3Var2 = a50Var.R2;
                togglegroupcallstartsubscription.call = u3Var2.g(u3Var2.f18360a);
                TLRPC.GroupCall groupCall = a50Var.R2.f18361b;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                ConnectionsManager.getInstance(cVar.f15043a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final n20 f39416b;

                    {
                        this.f39416b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                n20 n20Var = this.f39416b;
                                if (tLObject != null) {
                                    org.telegram.messenger.wp.r1(n20Var.f39678b.f35620k1.f15043a).L3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    n20Var.getClass();
                                    return;
                                }
                            default:
                                n20 n20Var2 = this.f39416b;
                                if (tLObject != null) {
                                    org.telegram.messenger.wp.r1(n20Var2.f39678b.f35620k1.f15043a).L3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    n20Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (a50Var.R2.f18361b.schedule_start_subscribed) {
                    i11 = 7;
                }
                a50Var.M1(i11, true);
            }
        }
    }
}
