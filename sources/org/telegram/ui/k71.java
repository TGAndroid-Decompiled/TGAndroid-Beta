package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k71 extends org.telegram.ui.ActionBar.j {
    public final v71 f47135a;

    public k71(v71 v71Var) {
        this.f47135a = v71Var;
    }

    @Override
    public final void b(int i7) {
        File file;
        String str;
        String b10;
        int i10;
        String str2;
        v71 v71Var = this.f47135a;
        org.telegram.ui.ActionBar.h6 h6Var = v71Var.f50579w;
        if (i7 == -1) {
            if (v71Var.U0(true)) {
                v71Var.S0(false);
            }
        } else if (i7 >= 1 && i7 <= 3) {
            v71Var.d1(i7, true);
        } else if (i7 == 4) {
            if (v71Var.f50582x) {
                org.telegram.ui.ActionBar.k6.v1(false);
            }
            File e10 = h6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = v71Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            h6Var.f27531o = str2;
            h6Var.f27532p = v71Var.f50558m1;
            h6Var.f27533q = v71Var.F1;
            if (((int) h6Var.f27526j) == 0) {
                h6Var.f27526j = 4294967296L;
            }
            if (((int) h6Var.f27527k) == 0) {
                h6Var.f27527k = 4294967296L;
            }
            if (((int) h6Var.f27528l) == 0) {
                h6Var.f27528l = 4294967296L;
            }
            if (((int) h6Var.f27529m) == 0) {
                h6Var.f27529m = 4294967296L;
            }
            v71Var.b1();
            org.telegram.messenger.qs.e().n(v71Var, org.telegram.messenger.qs.f24994e4);
            org.telegram.ui.ActionBar.k6.z1(v71Var.f50539f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.p();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25081t4, v71Var.f50539f0, Boolean.valueOf(v71Var.f50542g0), null, -1);
            v71Var.finishFragment();
        } else if (i7 == 5) {
            if (v71Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (v71Var.G1) {
                    sb2.append("blur");
                }
                if (v71Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = v71Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.f2) v71Var).currentAccount;
                    sb3.append(org.telegram.messenger.qp.s1(i10).U2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = rf.b.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof pc1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = v71Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    pc1 pc1Var = new pc1(str, v71Var.f50522a1, v71Var.f50530c1, v71Var.f50533d1, v71Var.f50536e1, v71Var.f50549i1, v71Var.f50558m1, v71Var.F1, null);
                    pc1Var.f48798g = tL_wallPaper2;
                    b10 = pc1Var.b();
                } else {
                    boolean z9 = org.telegram.messenger.r2.f25212a;
                    return;
                }
                v71Var.showDialog(new i71(this, v71Var.getParentActivity(), b10, b10));
            }
        } else if (i7 == 6) {
            if (org.telegram.messenger.iz.S <= 3) {
                org.telegram.messenger.iz.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.qp.e1().edit();
                int i11 = org.telegram.messenger.iz.S + 1;
                org.telegram.messenger.iz.S = i11;
                edit.putInt("dayNightWallpaperSwitchHint", i11);
                edit.apply();
            }
            boolean a10 = v71Var.f50566q1.a();
            n71 n71Var = v71Var.f50566q1;
            if (n71Var != null) {
                if (!n71Var.a1()) {
                    v71Var.l1();
                    return;
                }
                v71Var.f50566q1.t1(true);
                org.telegram.ui.Components.zg0 zg0Var = v71Var.O1;
                zg0Var.h = true;
                if (a10) {
                    zg0Var.P(0);
                } else {
                    zg0Var.P(36);
                }
                v71Var.O1.start();
                if (v71Var.N1) {
                    n71 n71Var2 = v71Var.f50566q1;
                    float f10 = 0.0f;
                    if (n71Var2 != null && n71Var2.a()) {
                        v71Var.S1.setVisibility(0);
                        v71Var.S1.a(v71Var.f50562o1);
                    } else {
                        v71Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = v71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        v71Var.Q1.cancel();
                    }
                    float f11 = v71Var.f50564p1;
                    if (v71Var.f50566q1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    v71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new gz0(this, 10));
                    v71Var.Q1.addListener(new d30(this, 29));
                    v71Var.Q1.setDuration(250L);
                    v71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f40366f);
                    v71Var.Q1.start();
                }
            }
        } else if (i7 == 7) {
            Object obj2 = v71Var.C1;
            if ((obj2 instanceof qc1) && (file = ((qc1) obj2).f49203e) != null) {
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, file.getAbsolutePath(), 0, false, 0, 0);
                gfVar.f26845b = false;
                gfVar.f26846c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gfVar);
                PhotoViewer.p1().H2(v71Var.getParentActivity(), null, null);
                PhotoViewer.p1().e2(arrayList, 0, 3, false, new j71(this, gfVar), null);
            }
        }
    }
}
