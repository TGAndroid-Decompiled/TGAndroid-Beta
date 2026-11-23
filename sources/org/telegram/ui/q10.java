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
public final class q10 implements View.OnClickListener {
    public final m4 f51220a = new m4(this, 6);
    public final e40 f51221b;

    public q10(e40 e40Var) {
        this.f51221b = e40Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.j30 j30Var;
        int i7;
        TLObject O0;
        e40 e40Var = this.f51221b;
        o10 o10Var = e40Var.f47419x1;
        ArrayList arrayList = e40Var.f47363l2;
        org.telegram.ui.Components.voip.r2 r2Var = e40Var.f47414w1;
        org.telegram.ui.Components.nh0 nh0Var = e40Var.F2;
        org.telegram.messenger.c cVar = e40Var.f47376o1;
        if (e40Var.V2 != null && e40Var.E3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (e40Var.v1() && !e40Var.V2.j()) {
                a20 a20Var = e40Var.Z3;
                if (a20Var != null && a20Var.f41003b && (org.telegram.messenger.g0.Q1() || e40.E5 == e40Var.u1())) {
                    e40Var.i1(null);
                    if (e40.E5) {
                        org.telegram.messenger.g0.h3(new kz(this, 5), 200L);
                    }
                    e40Var.d2.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.u3 u3Var = (org.telegram.messenger.u3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        e40Var.i1(u3Var);
                        return;
                    }
                    if (e40.E5 == e40Var.u1()) {
                        e40Var.i1(u3Var);
                    }
                    if (e40Var.u1()) {
                        e40Var.d2.setRequestedOrientation(6);
                        return;
                    } else {
                        e40Var.d2.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = e40Var.E3;
            if (i12 == 5) {
                if (!e40Var.G3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e40Var.G3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.t3 t3Var = e40Var.V2;
                    startscheduledgroupcall.call = t3Var.g(t3Var.f27033a);
                    ConnectionsManager.getInstance(cVar.f23343a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final q10 f50802b;

                        {
                            this.f50802b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    q10 q10Var = this.f50802b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.mp.u1(q10Var.f51221b.f47376o1.f23343a).V3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        q10Var.getClass();
                                        return;
                                    }
                                default:
                                    q10 q10Var2 = this.f50802b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.mp.u1(q10Var2.f51221b.f47376o1.f23343a).V3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        q10Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i12 != 7 && i12 != 6) {
                if (VoIPService.getSharedInstance() != null && (i7 = e40Var.S3) != 1 && i7 != 2 && i7 != 6 && i7 != 5) {
                    int i13 = e40Var.E3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = e40Var.d2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    c8.oa.c(2131624121, 2131743033, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new fi.e(18));
                                    return;
                                }
                                e40Var.R1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                r2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            e40Var.R1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            r2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!e40Var.s1() && !e40Var.G2) {
                        e40Var.G2 = true;
                        org.telegram.messenger.g0.D3(r2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f22875b.nextInt(100);
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
                        nh0Var.P(i14);
                        nh0Var.S(i14 - 1, this.f51220a);
                        o10Var.setAnimation(nh0Var);
                        nh0Var.M(i11);
                        o10Var.d();
                        if (e40Var.E3 == 2) {
                            long B1 = org.telegram.messenger.fj.B1(((TLRPC.GroupCallParticipant) e40Var.V2.d.f(org.telegram.messenger.fj.B1(e40Var.f47410v2))).peer);
                            if (org.telegram.messenger.n5.E(B1)) {
                                O0 = org.telegram.messenger.mp.u1(cVar.f23343a).c2(Long.valueOf(B1));
                            } else {
                                O0 = org.telegram.messenger.mp.u1(cVar.f23343a).O0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(O0, null, null, null, Boolean.TRUE, null);
                            e40Var.R1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (j30Var = e40Var.f47352i2) != null) {
                    j30Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.t3 t3Var2 = e40Var.V2;
                togglegroupcallstartsubscription.call = t3Var2.g(t3Var2.f27033a);
                TLRPC.GroupCall groupCall = e40Var.V2.f27034b;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                ConnectionsManager.getInstance(cVar.f23343a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final q10 f50802b;

                    {
                        this.f50802b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                q10 q10Var = this.f50802b;
                                if (tLObject != null) {
                                    org.telegram.messenger.mp.u1(q10Var.f51221b.f47376o1.f23343a).V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q10Var.getClass();
                                    return;
                                }
                            default:
                                q10 q10Var2 = this.f50802b;
                                if (tLObject != null) {
                                    org.telegram.messenger.mp.u1(q10Var2.f51221b.f47376o1.f23343a).V3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (e40Var.V2.f27034b.schedule_start_subscribed) {
                    i10 = 7;
                }
                e40Var.R1(i10, true);
            }
        }
    }
}
