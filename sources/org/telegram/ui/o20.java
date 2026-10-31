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
public final class o20 implements View.OnClickListener {
    public final m4 f40117a = new m4(this, 6);
    public final b50 f40118b;

    public o20(b50 b50Var) {
        this.f40118b = b50Var;
    }

    @Override
    public final void onClick(View view) {
        org.telegram.ui.Components.q30 q30Var;
        int i10;
        TLObject L0;
        b50 b50Var = this.f40118b;
        m20 m20Var = b50Var.f36078t1;
        ArrayList arrayList = b50Var.f36022h2;
        org.telegram.ui.Components.voip.b2 b2Var = b50Var.f36073s1;
        org.telegram.ui.Components.bi0 bi0Var = b50Var.B2;
        org.telegram.messenger.c cVar = b50Var.f36036k1;
        if (b50Var.R2 != null && b50Var.f36093w3 != 3) {
            int i11 = 6;
            int i12 = 0;
            if (b50Var.t1() && !b50Var.R2.j()) {
                y20 y20Var = b50Var.R3;
                if (y20Var != null && y20Var.f31712b && (org.telegram.messenger.i0.Q1() || b50.f35991w5 == b50Var.s1())) {
                    b50Var.g1(null);
                    if (b50.f35991w5) {
                        org.telegram.messenger.i0.h3(new zy(this, 6), 200L);
                    }
                    b50Var.Z1.setRequestedOrientation(-1);
                    return;
                } else if (!arrayList.isEmpty()) {
                    org.telegram.messenger.v3 v3Var = (org.telegram.messenger.v3) arrayList.get(0);
                    if (org.telegram.messenger.i0.Q1()) {
                        b50Var.g1(v3Var);
                        return;
                    }
                    if (b50.f35991w5 == b50Var.s1()) {
                        b50Var.g1(v3Var);
                    }
                    if (b50Var.s1()) {
                        b50Var.Z1.setRequestedOrientation(6);
                        return;
                    } else {
                        b50Var.Z1.setRequestedOrientation(1);
                        return;
                    }
                } else {
                    return;
                }
            }
            int i13 = b50Var.f36093w3;
            if (i13 == 5) {
                if (!b50Var.y3) {
                    try {
                        view.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    b50Var.y3 = true;
                    TL_phone.startScheduledGroupCall startscheduledgroupcall = new TL_phone.startScheduledGroupCall();
                    org.telegram.messenger.u3 u3Var = b50Var.R2;
                    startscheduledgroupcall.call = u3Var.g(u3Var.f18227a);
                    ConnectionsManager.getInstance(cVar.f14863a).sendRequest(startscheduledgroupcall, new RequestDelegate(this) {
                        public final o20 f39816b;

                        {
                            this.f39816b = this;
                        }

                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            switch (r2) {
                                case 0:
                                    o20 o20Var = this.f39816b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.vp.r1(o20Var.f40118b.f36036k1.f14863a).L3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o20Var.getClass();
                                        return;
                                    }
                                default:
                                    o20 o20Var2 = this.f39816b;
                                    if (tLObject != null) {
                                        org.telegram.messenger.vp.r1(o20Var2.f40118b.f36036k1.f14863a).L3((TLRPC.Updates) tLObject, false);
                                        return;
                                    } else {
                                        o20Var2.getClass();
                                        return;
                                    }
                            }
                        }
                    });
                }
            } else if (i13 != 7 && i13 != 6) {
                if (VoIPService.getSharedInstance() != null && (i10 = b50Var.K3) != 1 && i10 != 2 && i10 != 6 && i10 != 5) {
                    int i14 = b50Var.f36093w3;
                    if (i14 != 2 && i14 != 4) {
                        try {
                            if (i14 == 0) {
                                LaunchActivity launchActivity = b50Var.Z1;
                                if (launchActivity != null && launchActivity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                    w7.c6.c(2131624118, 2131743309, new String[]{"android.permission.RECORD_AUDIO"}, new String[]{"android.permission.RECORD_AUDIO"}, new ag.z0(15));
                                    return;
                                }
                                b50Var.M1(1, true);
                                VoIPService.getSharedInstance().setMicMute(false, false, true);
                                b2Var.performHapticFeedback(3, 2);
                                return;
                            }
                            b50Var.M1(0, true);
                            VoIPService.getSharedInstance().setMicMute(true, false, true);
                            b2Var.performHapticFeedback(3, 2);
                        } catch (Exception unused2) {
                        }
                    } else if (!b50Var.q1() && !b50Var.C2) {
                        b50Var.C2 = true;
                        org.telegram.messenger.i0.E3(b2Var.getTextView());
                        try {
                            view.performHapticFeedback(3, 2);
                        } catch (Exception unused3) {
                        }
                        int nextInt = Utilities.f14519b.nextInt(100);
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
                        bi0Var.P(i15);
                        bi0Var.S(i15 - 1, this.f40117a);
                        m20Var.setAnimation(bi0Var);
                        bi0Var.M(i12);
                        m20Var.d();
                        if (b50Var.f36093w3 == 2) {
                            long C1 = org.telegram.messenger.jj.C1(((TLRPC.GroupCallParticipant) b50Var.R2.d.f(org.telegram.messenger.jj.C1(b50Var.f36069r2))).peer);
                            if (org.telegram.messenger.o5.E(C1)) {
                                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).Z1(Long.valueOf(C1));
                            } else {
                                L0 = org.telegram.messenger.vp.r1(cVar.f14863a).L0(Long.valueOf(-C1));
                            }
                            VoIPService.getSharedInstance().editCallMember(L0, null, null, null, Boolean.TRUE, null);
                            b50Var.M1(4, true);
                        }
                    }
                }
            } else {
                if (i13 == 6 && (q30Var = b50Var.f36010e2) != null) {
                    q30Var.b(true);
                }
                TL_phone.toggleGroupCallStartSubscription togglegroupcallstartsubscription = new TL_phone.toggleGroupCallStartSubscription();
                org.telegram.messenger.u3 u3Var2 = b50Var.R2;
                togglegroupcallstartsubscription.call = u3Var2.g(u3Var2.f18227a);
                TLRPC.GroupCall groupCall = b50Var.R2.f18228b;
                boolean z10 = !groupCall.schedule_start_subscribed;
                groupCall.schedule_start_subscribed = z10;
                togglegroupcallstartsubscription.subscribed = z10;
                ConnectionsManager.getInstance(cVar.f14863a).sendRequest(togglegroupcallstartsubscription, new RequestDelegate(this) {
                    public final o20 f39816b;

                    {
                        this.f39816b = this;
                    }

                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        switch (r2) {
                            case 0:
                                o20 o20Var = this.f39816b;
                                if (tLObject != null) {
                                    org.telegram.messenger.vp.r1(o20Var.f40118b.f36036k1.f14863a).L3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o20Var.getClass();
                                    return;
                                }
                            default:
                                o20 o20Var2 = this.f39816b;
                                if (tLObject != null) {
                                    org.telegram.messenger.vp.r1(o20Var2.f40118b.f36036k1.f14863a).L3((TLRPC.Updates) tLObject, false);
                                    return;
                                } else {
                                    o20Var2.getClass();
                                    return;
                                }
                        }
                    }
                });
                if (b50Var.R2.f18228b.schedule_start_subscribed) {
                    i11 = 7;
                }
                b50Var.M1(i11, true);
            }
        }
    }
}
