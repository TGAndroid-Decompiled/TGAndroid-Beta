package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class a71 extends org.telegram.ui.ActionBar.j {
    public final l71 f43680a;

    public a71(l71 l71Var) {
        this.f43680a = l71Var;
    }

    @Override
    public final void b(int i3) {
        File file;
        String str;
        String b10;
        int i10;
        String str2;
        l71 l71Var = this.f43680a;
        org.telegram.ui.ActionBar.g6 g6Var = l71Var.f47201w;
        if (i3 == -1) {
            if (l71Var.U0(true)) {
                l71Var.S0(false);
            }
        } else if (i3 >= 1 && i3 <= 3) {
            l71Var.d1(i3, true);
        } else if (i3 == 4) {
            if (l71Var.f47204x) {
                org.telegram.ui.ActionBar.k6.v1(false);
            }
            File e10 = g6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = l71Var.Y0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            g6Var.f27537o = str2;
            g6Var.f27538p = l71Var.f47182n1;
            g6Var.f27539q = l71Var.G1;
            if (((int) g6Var.f27532j) == 0) {
                g6Var.f27532j = 4294967296L;
            }
            if (((int) g6Var.f27533k) == 0) {
                g6Var.f27533k = 4294967296L;
            }
            if (((int) g6Var.f27534l) == 0) {
                g6Var.f27534l = 4294967296L;
            }
            if (((int) g6Var.f27535m) == 0) {
                g6Var.f27535m = 4294967296L;
            }
            l71Var.b1();
            org.telegram.messenger.hs.e().n(l71Var, org.telegram.messenger.hs.f23223e4);
            org.telegram.ui.ActionBar.k6.z1(l71Var.f47163g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.k6.p();
            org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23310t4, l71Var.f47163g0, Boolean.valueOf(l71Var.f47166h0), null, -1);
            l71Var.finishFragment();
        } else if (i3 == 5) {
            if (l71Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (l71Var.H1) {
                    sb2.append("blur");
                }
                if (l71Var.G1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = l71Var.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.d2) l71Var).currentAccount;
                    sb3.append(org.telegram.messenger.hp.s1(i10).V2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder h = t4.c.h(b10, "?mode=");
                        h.append(sb2.toString());
                        b10 = h.toString();
                    }
                } else if (obj instanceof kc1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = l71Var.Y0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    kc1 kc1Var = new kc1(str, l71Var.f47147b1, l71Var.f47153d1, l71Var.f47157e1, l71Var.f47161f1, l71Var.f47173j1, l71Var.f47182n1, l71Var.G1, null);
                    kc1Var.f46902g = tL_wallPaper2;
                    b10 = kc1Var.b();
                } else {
                    boolean z10 = org.telegram.messenger.r2.f25040a;
                    return;
                }
                l71Var.showDialog(new y61(this, l71Var.getParentActivity(), b10, b10));
            }
        } else if (i3 == 6) {
            if (org.telegram.messenger.az.S <= 3) {
                org.telegram.messenger.az.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                int i11 = org.telegram.messenger.az.S + 1;
                org.telegram.messenger.az.S = i11;
                edit.putInt("dayNightWallpaperSwitchHint", i11);
                edit.apply();
            }
            boolean a10 = l71Var.f47191r1.a();
            d71 d71Var = l71Var.f47191r1;
            if (d71Var != null) {
                if (!d71Var.Y0()) {
                    l71Var.l1();
                    return;
                }
                l71Var.f47191r1.l1(true);
                org.telegram.ui.Components.ch0 ch0Var = l71Var.P1;
                ch0Var.h = true;
                if (a10) {
                    ch0Var.P(0);
                } else {
                    ch0Var.P(36);
                }
                l71Var.P1.start();
                if (l71Var.O1) {
                    d71 d71Var2 = l71Var.f47191r1;
                    float f10 = 0.0f;
                    if (d71Var2 != null && d71Var2.a()) {
                        l71Var.T1.setVisibility(0);
                        l71Var.T1.a(l71Var.f47186p1);
                    } else {
                        l71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = l71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        l71Var.R1.cancel();
                    }
                    float f11 = l71Var.f47188q1;
                    if (l71Var.f47191r1.a()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    l71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new xy0(this, 10));
                    l71Var.R1.addListener(new y20(this, 29));
                    l71Var.R1.setDuration(250L);
                    l71Var.R1.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    l71Var.R1.start();
                }
            }
        } else if (i3 == 7) {
            Object obj2 = l71Var.D1;
            if ((obj2 instanceof lc1) && (file = ((lc1) obj2).f47304e) != null) {
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, file.getAbsolutePath(), 0, false, 0, 0);
                yeVar.f25310b = false;
                yeVar.f25311c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(yeVar);
                PhotoViewer.v1().N2(l71Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new z61(this, yeVar), null);
            }
        }
    }
}
