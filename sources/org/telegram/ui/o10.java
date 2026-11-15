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
    public final m4 f49746a = new m4(this, 6);
    public final c40 f49747b;

    public o10(c40 c40Var) {
        this.f49747b = c40Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.b30 b30Var;
        int i7;
        TLObject M0;
        c40 c40Var = this.f49747b;
        m10 m10Var = c40Var.f45983x1;
        ArrayList arrayList = c40Var.f45927l2;
        org.telegram.ui.Components.voip.r2 r2Var = c40Var.f45978w1;
        org.telegram.ui.Components.ch0 ch0Var = c40Var.F2;
        org.telegram.messenger.c cVar = c40Var.f45940o1;
        if (c40Var.V2 != null && c40Var.E3 != 3) {
            int i10 = 6;
            int i11 = 0;
            if (c40Var.u1() && !c40Var.V2.j()) {
                y10 y10Var = c40Var.Z3;
                if (y10Var != null && y10Var.f40727b && (org.telegram.messenger.g0.Q1() || c40.E5 == c40Var.t1())) {
                    c40Var.h1(null);
                    if (c40.E5) {
                        org.telegram.messenger.g0.i3(new iz(this, 5), 200L);
                    }
                    c40Var.d2.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.s3 s3Var = (org.telegram.messenger.s3) arrayList.get(0);
                    if (org.telegram.messenger.g0.Q1()) {
                        c40Var.h1(s3Var);
                        return;
                    }
                    if (c40.E5 == c40Var.t1()) {
                        c40Var.h1(s3Var);
                    }
                    if (c40Var.t1()) {
                        c40Var.d2.setRequestedOrientation(6);
                        return;
                    } else {
                        c40Var.d2.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i12 = c40Var.E3;
            if (i12 == 5) {
                if (!c40Var.G3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c40Var.G3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.r3 r3Var = c40Var.V2;
                    startscheduledgroupcall.call = r3Var.g(r3Var.f26215a);
                    ConnectionsManager.getInstance(cVar.f22782a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final o10 f49359b;

                        {
                            this.f49359b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    o10 o10Var = this.f49359b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.np.s1(o10Var.f49747b.f45940o1.f22782a).O3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o10Var.getClass();
                                        return;
                                    }
                                default:
                                    o10 o10Var2 = this.f49359b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.np.s1(o10Var2.f49747b.f45940o1.f22782a).O3((TLRPC.Updates) tLObject, false);
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
                if (VoIPService.getSharedInstance() != null && (i7 = c40Var.S3) != 1 && i7 != 2 && i7 != 6 && i7 != 5) {
                    int i13 = c40Var.E3;
                    if (i13 != 2 && i13 != 4) {
                        try {
                            if (i13 == 0) {
                                LaunchActivity launchActivity = c40Var.d2;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    c8.ka.c(2131624121, 2131743283, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new fi.e(17));
                                    return;
                                }
                                c40Var.R1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                r2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            c40Var.R1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            r2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!c40Var.r1() && !c40Var.G2) {
                        c40Var.G2 = true;
                        org.telegram.messenger.g0.E3(r2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f22414b.nextInt(100);
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
                        ch0Var.S(i14 - 1, this.f49746a);
                        m10Var.setAnimation(ch0Var);
                        ch0Var.M(i11);
                        m10Var.d();
                        if (c40Var.E3 == 2) {
                            long B1 = org.telegram.messenger.gj.B1(((TLRPC.GroupCallParticipant) c40Var.V2.d.f(org.telegram.messenger.gj.B1(c40Var.f45974v2))).peer);
                            if (org.telegram.messenger.m5.E(B1)) {
                                M0 = org.telegram.messenger.np.s1(cVar.f22782a).a2(Long.valueOf(B1));
                            } else {
                                M0 = org.telegram.messenger.np.s1(cVar.f22782a).M0(Long.valueOf(-B1));
                            }
                            VoIPService.getSharedInstance().editCallMember(M0, null, null, null, Boolean.TRUE, null);
                            c40Var.R1(4, true);
                        }
                    }
                }
            } else {
                if (i12 == 6 && (b30Var = c40Var.f45916i2) != null) {
                    b30Var.a();
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.r3 r3Var2 = c40Var.V2;
                togglegroupcallstartsubscription.call = r3Var2.g(r3Var2.f26215a);
                TLRPC.GroupCall groupCall = c40Var.V2.f26216b;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                ConnectionsManager.getInstance(cVar.f22782a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final o10 f49359b;

                    {
                        this.f49359b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                o10 o10Var = this.f49359b;
                                if (tLObject != null) {
                                    org.telegram.messenger.np.s1(o10Var.f49747b.f45940o1.f22782a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o10Var.getClass();
                                    return;
                                }
                            default:
                                o10 o10Var2 = this.f49359b;
                                if (tLObject != null) {
                                    org.telegram.messenger.np.s1(o10Var2.f49747b.f45940o1.f22782a).O3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o10Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (c40Var.V2.f26216b.schedule_start_subscribed) {
                    i10 = 7;
                }
                c40Var.R1(i10, true);
            }
        }
    }
}
