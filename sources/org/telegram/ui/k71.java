package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k71 extends org.telegram.ui.ActionBar.j {
    public final v71 f49361a;

    public k71(v71 v71Var) {
        this.f49361a = v71Var;
    }

    @Override
    public final void b(int i7) {
        File file;
        String str;
        String b10;
        int i10;
        String str2;
        v71 v71Var = this.f49361a;
        org.telegram.ui.ActionBar.k6 k6Var = v71Var.f52905w;
        if (i7 == -1) {
            if (v71Var.U0(true)) {
                v71Var.S0(false);
            }
        } else if (i7 >= 1 && i7 <= 3) {
            v71Var.d1(i7, true);
        } else if (i7 == 4) {
            if (v71Var.f52908x) {
                org.telegram.ui.ActionBar.n6.v1(false);
            }
            File e10 = k6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = v71Var.Y0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            k6Var.f29236o = str2;
            k6Var.f29237p = v71Var.n1;
            k6Var.f29238q = v71Var.G1;
            if (((int) k6Var.f29231j) == 0) {
                k6Var.f29231j = 4294967296L;
            }
            if (((int) k6Var.f29232k) == 0) {
                k6Var.f29232k = 4294967296L;
            }
            if (((int) k6Var.f29233l) == 0) {
                k6Var.f29233l = 4294967296L;
            }
            if (((int) k6Var.f29234m) == 0) {
                k6Var.f29234m = 4294967296L;
            }
            v71Var.b1();
            org.telegram.messenger.ks.e().n(v71Var, org.telegram.messenger.ks.f25225h4);
            org.telegram.ui.ActionBar.n6.z1(v71Var.f52867g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.n6.p();
            org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25314w4, v71Var.f52867g0, Boolean.valueOf(v71Var.f52870h0), null, -1);
            v71Var.finishFragment();
        } else if (i7 == 5) {
            if (v71Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (v71Var.H1) {
                    sb2.append("blur");
                }
                if (v71Var.G1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = v71Var.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.g2) v71Var).currentAccount;
                    sb3.append(org.telegram.messenger.mp.u1(i10).X2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder n10 = p5.c.n(b10, "?mode=");
                        n10.append(sb2.toString());
                        b10 = n10.toString();
                    }
                } else if (obj instanceof pc1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = v71Var.Y0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    pc1 pc1Var = new pc1(str, v71Var.f52851b1, v71Var.f52858d1, v71Var.f52861e1, v71Var.f52865f1, v71Var.f52877j1, v71Var.n1, v71Var.G1, null);
                    pc1Var.f50984g = tL_wallPaper2;
                    b10 = pc1Var.b();
                } else {
                    boolean z10 = org.telegram.messenger.s2.f26829a;
                    return;
                }
                v71Var.showDialog(new h71(this, v71Var.getParentActivity(), b10, b10));
            }
        } else if (i7 == 6) {
            if (org.telegram.messenger.bz.S <= 3) {
                org.telegram.messenger.bz.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                int i11 = org.telegram.messenger.bz.S + 1;
                org.telegram.messenger.bz.S = i11;
                edit.putInt("dayNightWallpaperSwitchHint", i11);
                edit.apply();
            }
            boolean b11 = v71Var.f52895r1.b();
            n71 n71Var = v71Var.f52895r1;
            if (n71Var != null) {
                if (!n71Var.O0()) {
                    v71Var.l1();
                    return;
                }
                v71Var.f52895r1.b1(true);
                org.telegram.ui.Components.nh0 nh0Var = v71Var.P1;
                nh0Var.h = true;
                if (b11) {
                    nh0Var.P(0);
                } else {
                    nh0Var.P(36);
                }
                v71Var.P1.start();
                if (v71Var.O1) {
                    n71 n71Var2 = v71Var.f52895r1;
                    float f10 = 0.0f;
                    if (n71Var2 != null && n71Var2.b()) {
                        v71Var.T1.setVisibility(0);
                        v71Var.T1.a(v71Var.f52890p1);
                    } else {
                        v71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = v71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v71Var.R1.cancel();
                    }
                    float f11 = v71Var.f52892q1;
                    if (v71Var.f52895r1.b()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    v71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new hz0(this, 10));
                    v71Var.R1.addListener(new i71(this, 0));
                    v71Var.R1.setDuration(250L);
                    v71Var.R1.setInterpolator(org.telegram.ui.Components.kr.f36858f);
                    v71Var.R1.start();
                }
            }
        } else if (i7 == 7) {
            Object obj2 = v71Var.D1;
            if ((obj2 instanceof qc1) && (file = ((qc1) obj2).f51442e) != null) {
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, file.getAbsolutePath(), 0, false, 0, 0);
                efVar.f27963b = false;
                efVar.f27964c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(efVar);
                PhotoViewer.p1().J2(v71Var.getParentActivity(), null, null);
                PhotoViewer.p1().g2(arrayList, 0, 3, false, new j71(this, efVar), null);
            }
        }
    }
}
