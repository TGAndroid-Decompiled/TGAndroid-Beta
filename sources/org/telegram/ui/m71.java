package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class m71 extends org.telegram.ui.ActionBar.j {
    public final x71 f49755a;

    public m71(x71 x71Var) {
        this.f49755a = x71Var;
    }

    @Override
    public final void b(int i7) {
        File file;
        String str;
        String b10;
        int i10;
        String str2;
        x71 x71Var = this.f49755a;
        org.telegram.ui.ActionBar.j6 j6Var = x71Var.f53697w;
        if (i7 == -1) {
            if (x71Var.U0(true)) {
                x71Var.S0(false);
            }
        } else if (i7 >= 1 && i7 <= 3) {
            x71Var.d1(i7, true);
        } else if (i7 == 4) {
            if (x71Var.f53700x) {
                org.telegram.ui.ActionBar.m6.v1(false);
            }
            File e10 = j6Var.e();
            if (e10 != null) {
                e10.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = x71Var.Y0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            j6Var.f29074o = str2;
            j6Var.f29075p = x71Var.n1;
            j6Var.f29076q = x71Var.G1;
            if (((int) j6Var.f29069j) == 0) {
                j6Var.f29069j = 4294967296L;
            }
            if (((int) j6Var.f29070k) == 0) {
                j6Var.f29070k = 4294967296L;
            }
            if (((int) j6Var.f29071l) == 0) {
                j6Var.f29071l = 4294967296L;
            }
            if (((int) j6Var.f29072m) == 0) {
                j6Var.f29072m = 4294967296L;
            }
            x71Var.b1();
            org.telegram.messenger.ls.e().n(x71Var, org.telegram.messenger.ls.f25284h4);
            org.telegram.ui.ActionBar.m6.z1(x71Var.f53659g0, true, false, false, true, false);
            org.telegram.ui.ActionBar.m6.p();
            org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.f25373w4, x71Var.f53659g0, Boolean.valueOf(x71Var.f53662h0), null, -1);
            x71Var.finishFragment();
        } else if (i7 == 5) {
            if (x71Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (x71Var.H1) {
                    sb2.append("blur");
                }
                if (x71Var.G1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = x71Var.D1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i10 = ((org.telegram.ui.ActionBar.g2) x71Var).currentAccount;
                    sb3.append(org.telegram.messenger.np.u1(i10).X2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder n10 = p5.c.n(b10, "?mode=");
                        n10.append(sb2.toString());
                        b10 = n10.toString();
                    }
                } else if (obj instanceof rc1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = x71Var.Y0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    rc1 rc1Var = new rc1(str, x71Var.f53643b1, x71Var.f53650d1, x71Var.f53653e1, x71Var.f53657f1, x71Var.f53669j1, x71Var.n1, x71Var.G1, null);
                    rc1Var.f51582g = tL_wallPaper2;
                    b10 = rc1Var.b();
                } else {
                    boolean z10 = org.telegram.messenger.s2.f26694a;
                    return;
                }
                x71Var.showDialog(new j71(this, x71Var.getParentActivity(), b10, b10));
            }
        } else if (i7 == 6) {
            if (org.telegram.messenger.cz.S <= 3) {
                org.telegram.messenger.cz.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.np.g1().edit();
                int i11 = org.telegram.messenger.cz.S + 1;
                org.telegram.messenger.cz.S = i11;
                edit.putInt("dayNightWallpaperSwitchHint", i11);
                edit.apply();
            }
            boolean d = x71Var.f53687r1.d();
            p71 p71Var = x71Var.f53687r1;
            if (p71Var != null) {
                if (!p71Var.Y0()) {
                    x71Var.l1();
                    return;
                }
                x71Var.f53687r1.l1(true);
                org.telegram.ui.Components.oh0 oh0Var = x71Var.P1;
                oh0Var.h = true;
                if (d) {
                    oh0Var.P(0);
                } else {
                    oh0Var.P(36);
                }
                x71Var.P1.start();
                if (x71Var.O1) {
                    p71 p71Var2 = x71Var.f53687r1;
                    float f10 = 0.0f;
                    if (p71Var2 != null && p71Var2.d()) {
                        x71Var.T1.setVisibility(0);
                        x71Var.T1.a(x71Var.f53682p1);
                    } else {
                        x71Var.T1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = x71Var.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        x71Var.R1.cancel();
                    }
                    float f11 = x71Var.f53684q1;
                    if (x71Var.f53687r1.d()) {
                        f10 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
                    x71Var.R1 = ofFloat;
                    ofFloat.addUpdateListener(new iz0(this, 10));
                    x71Var.R1.addListener(new k71(this, 0));
                    x71Var.R1.setDuration(250L);
                    x71Var.R1.setInterpolator(org.telegram.ui.Components.nr.f37917f);
                    x71Var.R1.start();
                }
            }
        } else if (i7 == 7) {
            Object obj2 = x71Var.D1;
            if ((obj2 instanceof sc1) && (file = ((sc1) obj2).f51992e) != null) {
                org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, file.getAbsolutePath(), 0, false, 0, 0);
                ffVar.f28023b = false;
                ffVar.f28024c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(ffVar);
                PhotoViewer.p1().I2(x71Var.getParentActivity(), null, null);
                PhotoViewer.p1().f2(arrayList, 0, 3, false, new l71(this, ffVar), null);
            }
        }
    }
}
