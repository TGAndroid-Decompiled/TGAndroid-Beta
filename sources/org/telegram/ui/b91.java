package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.SharedPreferences;
import java.io.File;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class b91 extends org.telegram.ui.ActionBar.k {
    public final m91 f36142a;

    public b91(m91 m91Var) {
        this.f36142a = m91Var;
    }

    @Override
    public final void b(int i10) {
        File file;
        String str;
        String b10;
        int i11;
        String str2;
        m91 m91Var = this.f36142a;
        org.telegram.ui.ActionBar.r6 r6Var = m91Var.f39596w;
        if (i10 == -1) {
            if (m91Var.T0(true)) {
                m91Var.R0(false);
            }
        } else if (i10 >= 1 && i10 <= 3) {
            m91Var.c1(i10, true);
        } else if (i10 == 4) {
            if (m91Var.f39599x) {
                org.telegram.ui.ActionBar.t6.v1(false);
            }
            File e = r6Var.e();
            if (e != null) {
                e.delete();
            }
            TLRPC.TL_wallPaper tL_wallPaper = m91Var.X0;
            if (tL_wallPaper != null) {
                str2 = tL_wallPaper.slug;
            } else {
                str2 = "";
            }
            r6Var.f20741o = str2;
            r6Var.f20742p = m91Var.f39574m1;
            r6Var.f20743q = m91Var.F1;
            if (((int) r6Var.f20736j) == 0) {
                r6Var.f20736j = 4294967296L;
            }
            if (((int) r6Var.f20737k) == 0) {
                r6Var.f20737k = 4294967296L;
            }
            if (((int) r6Var.f20738l) == 0) {
                r6Var.f20738l = 4294967296L;
            }
            if (((int) r6Var.f20739m) == 0) {
                r6Var.f20739m = 4294967296L;
            }
            m91Var.a1();
            org.telegram.messenger.zs.e().n(m91Var, org.telegram.messenger.zs.f19606e4);
            org.telegram.ui.ActionBar.t6.z1(m91Var.f39555f0, true, false, false, true, false);
            org.telegram.ui.ActionBar.t6.p();
            org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19695t4, m91Var.f39555f0, Boolean.valueOf(m91Var.f39558g0), null, -1);
            m91Var.finishFragment();
        } else if (i10 == 5) {
            if (m91Var.getParentActivity() != null) {
                StringBuilder sb2 = new StringBuilder();
                if (m91Var.G1) {
                    sb2.append("blur");
                }
                if (m91Var.F1) {
                    if (sb2.length() > 0) {
                        sb2.append("+");
                    }
                    sb2.append("motion");
                }
                Object obj = m91Var.C1;
                if (obj instanceof TLRPC.TL_wallPaper) {
                    StringBuilder sb3 = new StringBuilder("https://");
                    i11 = ((org.telegram.ui.ActionBar.k2) m91Var).currentAccount;
                    sb3.append(org.telegram.messenger.vp.r1(i11).U2);
                    sb3.append("/bg/");
                    sb3.append(((TLRPC.TL_wallPaper) obj).slug);
                    b10 = sb3.toString();
                    if (sb2.length() > 0) {
                        StringBuilder i12 = sc.e.i(b10, "?mode=");
                        i12.append(sb2.toString());
                        b10 = i12.toString();
                    }
                } else if (obj instanceof me1) {
                    TLRPC.TL_wallPaper tL_wallPaper2 = m91Var.X0;
                    if (tL_wallPaper2 != null) {
                        str = tL_wallPaper2.slug;
                    } else {
                        str = "c";
                    }
                    me1 me1Var = new me1(str, m91Var.f39539a1, m91Var.f39546c1, m91Var.f39549d1, m91Var.f39552e1, m91Var.f39565i1, m91Var.f39574m1, m91Var.F1, null);
                    me1Var.f39690g = tL_wallPaper2;
                    b10 = me1Var.b();
                } else {
                    boolean z10 = org.telegram.messenger.v2.f18448a;
                    return;
                }
                m91Var.showDialog(new z81(this, m91Var.getParentActivity(), b10, b10));
            }
        } else if (i10 == 6) {
            if (org.telegram.messenger.tz.S <= 3) {
                org.telegram.messenger.tz.S = 10;
                SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                int i13 = org.telegram.messenger.tz.S + 1;
                org.telegram.messenger.tz.S = i13;
                edit.putInt("dayNightWallpaperSwitchHint", i13);
                edit.apply();
            }
            boolean a2 = m91Var.f39583q1.a();
            e91 e91Var = m91Var.f39583q1;
            if (e91Var != null) {
                if (!e91Var.b1()) {
                    m91Var.k1();
                    return;
                }
                m91Var.f39583q1.M1(true);
                org.telegram.ui.Components.bi0 bi0Var = m91Var.O1;
                bi0Var.h = true;
                if (a2) {
                    bi0Var.P(0);
                } else {
                    bi0Var.P(36);
                }
                m91Var.O1.start();
                if (m91Var.N1) {
                    e91 e91Var2 = m91Var.f39583q1;
                    float f7 = 0.0f;
                    if (e91Var2 != null && e91Var2.a()) {
                        m91Var.S1.setVisibility(0);
                        m91Var.S1.a(m91Var.f39579o1);
                    } else {
                        m91Var.S1.a(0.0f);
                    }
                    ValueAnimator valueAnimator = m91Var.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        m91Var.Q1.cancel();
                    }
                    float f10 = m91Var.f39581p1;
                    if (m91Var.f39583q1.a()) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
                    m91Var.Q1 = ofFloat;
                    ofFloat.addUpdateListener(new u01(this, 10));
                    m91Var.Q1.addListener(new ns0(this, 10));
                    m91Var.Q1.setDuration(250L);
                    m91Var.Q1.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                    m91Var.Q1.start();
                }
            }
        } else if (i10 == 7) {
            Object obj2 = m91Var.C1;
            if ((obj2 instanceof ne1) && (file = ((ne1) obj2).e) != null) {
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, file.getAbsolutePath(), 0, false, 0, 0);
                efVar.f19507b = false;
                efVar.f19508c = null;
                ArrayList arrayList = new ArrayList();
                arrayList.add(efVar);
                PhotoViewer.v1().N2(m91Var.getParentActivity(), null, null);
                PhotoViewer.v1().j2(arrayList, 0, 3, false, new a91(this, efVar), null);
            }
        }
    }
}
