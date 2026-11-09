package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l71 extends org.telegram.ui.ActionBar.j {
    public final w71 f47493a;

    public l71(w71 w71Var) {
        this.f47493a = w71Var;
    }

    @Override
    public final void b(int i7) {
        File file;
        String str;
        String b10;
        int i10;
        String str2;
        w71 w71Var = this.f47493a;
        org.telegram.ui.ActionBar.i6 i6Var = w71Var.f50961w;
        if (i7 == -1) {
            if (w71Var.U0(true)) {
                w71Var.S0(false);
            }
        } else if (i7 >= 1 && i7 <= 3) {
            w71Var.d1(i7, true);
        } else if (i7 == 4) {
            if (w71Var.f50964x) {
                org.telegram.ui.ActionBar.l6.v1(false);
            }
            File e10 = i6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = w71Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            i6Var.f27583o = str2;
            i6Var.f27584p = w71Var.f50940m1;
            i6Var.f27585q = w71Var.F1;
            if (((int) i6Var.f27578j) == 0) {
                i6Var.f27578j = 4294967296L;
            }
            if (((int) i6Var.f27579k) == 0) {
                i6Var.f27579k = 4294967296L;
            }
            if (((int) i6Var.f27580l) == 0) {
                i6Var.f27580l = 4294967296L;
            }
            if (((int) i6Var.f27581m) == 0) {
                i6Var.f27581m = 4294967296L;
            }
            w71Var.b1();
            org.telegram.messenger.qs.e().n(w71Var, org.telegram.messenger.qs.f24994e4);
            org.telegram.ui.ActionBar.l6.z1(w71Var.f50921f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.l6.p();
            org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25081t4, w71Var.f50921f0, Boolean.valueOf(w71Var.f50924g0), null, -1);
            w71Var.finishFragment();
        } else if (i7 == 5) {
            if (w71Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (w71Var.G1) {
                    sb2.append("blur");
                }
                if (w71Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = w71Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.f2) w71Var).currentAccount;
                    sb3.append(org.telegram.messenger.qp.s1(i10).U2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder j3 = rf.b.j(b10, "?mode=");
                        j3.append(sb2.toString());
                        b10 = j3.toString();
                    }
                } else if (obj instanceof sc1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = w71Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    sc1 sc1Var = new sc1(str, w71Var.f50904a1, w71Var.f50912c1, w71Var.f50915d1, w71Var.f50918e1, w71Var.f50931i1, w71Var.f50940m1, w71Var.F1, null);
                    sc1Var.f49879g = tL_wallPaper2;
                    b10 = sc1Var.b();
                } else {
                    boolean z9 = org.telegram.messenger.r2.f25212a;
                    return;
                }
                w71Var.showDialog(new j71(this, w71Var.getParentActivity(), b10, b10));
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
            boolean a10 = w71Var.f50948q1.a();
            o71 o71Var = w71Var.f50948q1;
            if (o71Var != null) {
                if (!o71Var.a1()) {
                    w71Var.l1();
                    return;
                }
                w71Var.f50948q1.t1(true);
                org.telegram.ui.Components.ah0 ah0Var = w71Var.O1;
                ah0Var.h = true;
                if (a10) {
                    ah0Var.P(0);
                } else {
                    ah0Var.P(36);
                }
                w71Var.O1.start();
                if (w71Var.N1) {
                    o71 o71Var2 = w71Var.f50948q1;
                    float f10 = 0.0f;
                    if (o71Var2 != null && o71Var2.a()) {
                        w71Var.S1.setVisibility(0);
                        w71Var.S1.a(w71Var.f50944o1);
                    } else {
                        w71Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = w71Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        w71Var.Q1.cancel();
                    }
                    float f11 = w71Var.f50946p1;
                    if (w71Var.f50948q1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    w71Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new jz0(this, 10));
                    w71Var.Q1.addListener(new f30(this, 29));
                    w71Var.Q1.setDuration(250L);
                    w71Var.Q1.setInterpolator(org.telegram.ui.Components.xq.f40458f);
                    w71Var.Q1.start();
                }
            }
        } else if (i7 == 7) {
            Object obj2 = w71Var.C1;
            if ((obj2 instanceof tc1) && (file = ((tc1) obj2).f50161e) != null) {
                org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, file.getAbsolutePath(), 0, false, 0, 0);
                gfVar.f26845b = false;
                gfVar.f26846c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(gfVar);
                PhotoViewer.p1().H2(w71Var.getParentActivity(), null, null);
                PhotoViewer.p1().e2(arrayList, 0, 3, false, new k71(this, gfVar), null);
            }
        }
    }
}
