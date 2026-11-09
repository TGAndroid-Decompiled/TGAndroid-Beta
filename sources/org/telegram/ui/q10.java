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
    public final m4 f48864a = new m4(this, 6);
    public final e40 f48865b;

    public q10(e40 e40Var) {
        this.f48865b = e40Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.z20 z20Var;
        int i7;
        TLObject M0;
        e40 e40Var = this.f48865b;
        o10 o10Var = e40Var.f45269t1;
        ArrayList arrayList = e40Var.f45215h2;
        org.telegram.ui.Components.voip.n2 n2Var = e40Var.f45265s1;
        org.telegram.ui.Components.ah0 ah0Var = e40Var.B2;
        org.telegram.messenger.c cVar = e40Var.f45228k1;
        if (e40Var.R2 != null && e40Var.f45284w3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (e40Var.u1() && !e40Var.R2.j()) {
                b20 b20Var = e40Var.R3;
                if (b20Var != null && b20Var.f39382b && (org.telegram.messenger.g0.Q1() || e40.f45184w5 == e40Var.t1())) {
                    e40Var.h1(null);
                    if (e40.f45184w5) {
                        org.telegram.messenger.g0.i3(new jz(this, 5), 200L);
                    }
                    e40Var.Z1.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        e40Var.h1(s3Var);
                        return;
                    }
                    if (e40.f45184w5 == e40Var.t1()) {
                        e40Var.h1(s3Var);
                    }
                    if (e40Var.t1()) {
                        e40Var.Z1.setRequestedOrientation(6);
                        return;
                    } else {
                        e40Var.Z1.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = e40Var.f45284w3;
            if (i12 == 5) {
                if (!e40Var.f45292y3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    e40Var.f45292y3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.r3 r3Var = e40Var.R2;
                    startscheduledgroupcall.call = r3Var.g(r3Var.f25221a);
                    ConnectionsManager.getInstance(cVar.f21765a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final q10 f48588b;

                        {
                            this.f48588b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    q10 q10Var = this.f48588b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.qp.s1(q10Var.f48865b.f45228k1.f21765a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        q10Var.getClass();
                                        return;
                                    }
                                default:
                                    q10 q10Var2 = this.f48588b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.qp.s1(q10Var2.f48865b.f45228k1.f21765a).O3((TLRPC.Updates) tLObject, false);
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
                if (VoIPService.getSharedInstance() != null && (i7 = e40Var.K3) != 1 && i7 != 2 && i7 != 6 && i7 != 5) {
                    int i13 = e40Var.f45284w3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = e40Var.Z1;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    c8.ia.c(2131624120, 2131743283, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new di.e(17));
                                    return;
                                }
                                e40Var.P1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                n2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            e40Var.P1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            n2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!e40Var.r1() && !e40Var.C2) {
                        e40Var.C2 = true;
                        org.telegram.messenger.g0.F3(n2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f21334b.nextInt(100);
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
                        ah0Var.P(i14);
                        ah0Var.S(i14 - 1, this.f48864a);
                        o10Var.setAnimation(ah0Var);
                        ah0Var.M(i11);
                        o10Var.d();
                        if (e40Var.f45284w3 == 2) {
                            long B1 = org.telegram.messenger.ij.B1(((TLRPC.GroupCallParticipant) e40Var.R2.d.f(org.telegram.messenger.ij.B1(e40Var.f45261r2))).peer);
                            if (org.telegram.messenger.m5.E(B1)) {
                                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).a2(Long.valueOf(B1));
                            } else {
                                M0 = org.telegram.messenger.qp.s1(cVar.f21765a).M0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(M0, null, null, null, Boolean.TRUE, null);
                            e40Var.P1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (z20Var = e40Var.f45203e2) != null) {
                    z20Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.r3 r3Var2 = e40Var.R2;
                togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.f25221a);
                TLRPC.GroupCall groupCall = e40Var.R2.f25222b;
                boolean z9 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z9;
                togglegroupcallstartsubscription.subscribed = z9;
                ConnectionsManager.getInstance(cVar.f21765a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final q10 f48588b;

                    {
                        this.f48588b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                q10 q10Var = this.f48588b;
                                if (tLObject != null) {
                                    org.telegram.messenger.qp.s1(q10Var.f48865b.f45228k1.f21765a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q10Var.getClass();
                                    return;
                                }
                            default:
                                q10 q10Var2 = this.f48588b;
                                if (tLObject != null) {
                                    org.telegram.messenger.qp.s1(q10Var2.f48865b.f45228k1.f21765a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    q10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (e40Var.R2.f25222b.schedule_start_subscribed) {
                    i10 = 7;
                }
                e40Var.P1(i10, true);
            }
        }
    }
}
