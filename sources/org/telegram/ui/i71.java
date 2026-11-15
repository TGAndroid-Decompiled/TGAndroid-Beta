package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class i71 extends org.telegram.ui.ActionBar.j {
    public final t71 f47937a;

    public i71(t71 t71Var) {
        this.f47937a = t71Var;
    }

    @Override
    public final void b(int i7) {
        File file;
        String str;
        String b10;
        int i10;
        String str2;
        t71 t71Var = this.f47937a;
        org.telegram.ui.ActionBar.g6 g6Var = t71Var.f51468w;
        if (i7 == -1) {
            if (t71Var.U0(true)) {
                t71Var.S0(false);
            }
        } else if (i7 >= 1 && i7 <= 3) {
            t71Var.d1(i7, true);
        } else if (i7 == 4) {
            if (t71Var.f51471x) {
                org.telegram.ui.ActionBar.j6.v1(false);
            }
            File e10 = g6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = t71Var.Y0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            g6Var.f28614o = str2;
            g6Var.f28615p = t71Var.n1;
            g6Var.f28616q = t71Var.G1;
            if (((int) g6Var.f28609j) == 0) {
                g6Var.f28609j = 4294967296L;
            }
            if (((int) g6Var.f28610k) == 0) {
                g6Var.f28610k = 4294967296L;
            }
            if (((int) g6Var.f28611l) == 0) {
                g6Var.f28611l = 4294967296L;
            }
            if (((int) g6Var.f28612m) == 0) {
                g6Var.f28612m = 4294967296L;
            }
            t71Var.b1();
            org.telegram.messenger.ns.e().n(t71Var, org.telegram.messenger.ns.f25490e4);
            org.telegram.ui.ActionBar.j6.z1(t71Var.f51430g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.j6.p();
            org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25577t4, t71Var.f51430g0, Boolean.valueOf(t71Var.f51433h0), null, -1);
            t71Var.finishFragment();
        } else if (i7 == 5) {
            if (t71Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (t71Var.H1) {
                    sb2.append("blur");
                }
                if (t71Var.G1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = t71Var.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.e2) t71Var).currentAccount;
                    sb3.append(org.telegram.messenger.np.s1(i10).V2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder m10 = r.b.m(b10, "?mode=");
                        m10.append(sb2.toString());
                        b10 = m10.toString();
                    }
                } else if (obj instanceof oc1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = t71Var.Y0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    oc1 oc1Var = new oc1(str, t71Var.f51414b1, t71Var.f51421d1, t71Var.f51424e1, t71Var.f51428f1, t71Var.f51440j1, t71Var.n1, t71Var.G1, null);
                    oc1Var.f49932g = tL_wallPaper2;
                    b10 = oc1Var.b();
                } else {
                    boolean z10 = org.telegram.messenger.r2.f26198a;
                    return;
                }
                t71Var.showDialog(new f71(this, t71Var.getParentActivity(), b10, b10));
            }
        } else if (i7 == 6) {
            if (org.telegram.messenger.gz.S <= 3) {
                org.telegram.messenger.gz.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.np.e1().edit();
                int i11 = org.telegram.messenger.gz.S + 1;
                org.telegram.messenger.gz.S = i11;
                edit.putInt("dayNightWallpaperSwitchHint", i11);
                edit.apply();
            }
            boolean a10 = t71Var.f51458r1.a();
            l71 l71Var = t71Var.f51458r1;
            if (l71Var != null) {
                if (!l71Var.Y0()) {
                    t71Var.l1();
                    return;
                }
                t71Var.f51458r1.m1(true);
                org.telegram.ui.Components.ch0 ch0Var = t71Var.P1;
                ch0Var.h = true;
                if (a10) {
                    ch0Var.P(0);
                } else {
                    ch0Var.P(36);
                }
                t71Var.P1.start();
                if (t71Var.O1) {
                    l71 l71Var2 = t71Var.f51458r1;
                    float f10 = 0.0f;
                    if (l71Var2 != null && l71Var2.a()) {
                        t71Var.T1.setVisibility(0);
                        t71Var.T1.a(t71Var.f51453p1);
                    } else {
                        t71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = t71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        t71Var.R1.cancel();
                    }
                    float f11 = t71Var.f51455q1;
                    if (t71Var.f51458r1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    t71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new ez0(this, 10));
                    t71Var.R1.addListener(new g71(this, 0));
                    t71Var.R1.setDuration(250L);
                    t71Var.R1.setInterpolator(org.telegram.ui.Components.er.f34420f);
                    t71Var.R1.start();
                }
            }
        } else if (i7 == 7) {
            Object obj2 = t71Var.D1;
            if ((obj2 instanceof pc1) && (file = ((pc1) obj2).f50255e) != null) {
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
                ffVar.f27708b = false;
                ffVar.f27709c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ffVar);
                PhotoViewer.p1().I2(t71Var.getParentActivity(), null, null);
                PhotoViewer.p1().f2(arrayList, 0, 3, false, new h71(this, ffVar), null);
            }
        }
    }
}
