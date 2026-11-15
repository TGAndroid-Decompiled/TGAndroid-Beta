package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class bt implements et, h2.j, hj0 {
    public final int f33366a;
    public final int f33367b;
    public final Object f33368c;
    public final Object d;

    public bt(ft ftVar, int i7, int i10, Runnable runnable) {
        this.f33368c = ftVar;
        this.f33366a = i7;
        this.f33367b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        ft ftVar = (ft) this.f33368c;
        Runnable runnable = (Runnable) this.d;
        Editable text = ftVar.getText();
        int i7 = this.f33366a;
        int i10 = this.f33367b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof p5) && !(characterStyle instanceof wg0)) {
                    int spanStart = text.getSpanStart(characterStyle);
                    int spanEnd = text.getSpanEnd(characterStyle);
                    text.removeSpan(characterStyle);
                    if (spanStart < i7) {
                        text.setSpan(characterStyle, spanStart, i7, 33);
                    }
                    if (spanEnd > i10) {
                        text.setSpan(characterStyle, i10, spanEnd, 33);
                    }
                }
            }
        }
        try {
            text.setSpan(ftVar.B(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        dt dtVar = ftVar.T1;
        if (dtVar != null) {
            dtVar.E();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        p4.c1 c1Var = (p4.c1) this.f33368c;
        Surface surface = (Surface) this.d;
        p4.g1 g1Var = (p4.g1) obj;
        ((p4.d0) c1Var.f54600a.get()).getClass();
        if (surface == null) {
            g1Var.S(null);
            c1Var.f54605i = null;
            return;
        }
        p4.b1 b1Var = new p4.b1(surface, this.f33366a, this.f33367b);
        c1Var.f54605i = b1Var;
        g1Var.S(b1Var);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        boolean z10;
        boolean z11;
        float f12;
        wg.v0 v0Var;
        wg.c1 c1Var = (wg.c1) this.f33368c;
        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
        ah.a aVar = c1Var.Z1;
        org.telegram.ui.ng0 ng0Var = c1Var.V1;
        ArrayList arrayList = c1Var.f59146c2;
        HashSet hashSet = c1Var.d2;
        boolean z12 = view instanceof org.telegram.ui.Cells.l8;
        int i10 = this.f33366a;
        xg.h hVar = null;
        if (z12) {
            if (i10 == 4) {
                org.telegram.ui.s00 s00Var = c1Var.f59165w2;
                if (s00Var != null) {
                    s00Var.run();
                    c1Var.dismiss();
                    return;
                }
                return;
            }
            ((org.telegram.ui.ActionBar.u2) t4.l(c1Var.getContext(), org.telegram.messenger.hd.M0(2131751238, null), org.telegram.messenger.hd.M0(2131751243, null), null, new wg.w0(c1Var, 2), new wg.v0(c1Var, 9), false, false, c1Var.J0).f25804b).show();
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            boolean z13 = true;
            if (user == null && chat == null && i10 == 3) {
                int i11 = i7 - 1;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    hVar = (xg.h) arrayList.get(i11);
                }
                org.telegram.messenger.z10 z10Var = c1Var.f59166x2;
                if (z10Var != null && hVar != null) {
                    int i12 = hVar.f59926i;
                    if (i12 == 4) {
                        z10Var.a(-98L);
                    } else if (i12 == 5) {
                        z10Var.a(-97L);
                    } else {
                        z10Var.a(-99L);
                    }
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f28200id;
                } else {
                    j3 = -chat.f28051id;
                }
                if (i10 == 3) {
                    org.telegram.messenger.z10 z10Var2 = c1Var.f59166x2;
                    if (z10Var2 != null) {
                        z10Var2.a(Long.valueOf(j3));
                    }
                } else if (i10 == 1) {
                    if (ng0Var != null) {
                        org.telegram.messenger.g0.v1(ng0Var.getEditText());
                    }
                    di.xa xaVar = new di.xa(c1Var.getContext(), e6Var, user, new wg.v0(c1Var, 11));
                    if (!org.telegram.messenger.g0.Q1()) {
                        xaVar.a0(c1Var.f29703j1);
                    }
                    xaVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    int i13 = 4;
                    if (i10 == 4) {
                        if (hashSet.isEmpty()) {
                            hashSet.add(Long.valueOf(j3));
                            org.telegram.messenger.s10 s10Var = c1Var.f59168z2;
                            if (s10Var != null) {
                                fp fpVar = c1Var.Y1;
                                if (fpVar == null || !fpVar.f34663a.f32441q) {
                                    z13 = false;
                                }
                                s10Var.a(Boolean.valueOf(z13), hashSet);
                                c1Var.f59168z2 = null;
                            }
                            c1Var.dismiss();
                            return;
                        }
                        i13 = 4;
                    }
                    if (i10 == i13 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        c1Var.f59152j2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == c1Var.h1() + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        c1Var.m1();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (z10 != z11) {
                        aVar.setVisibility(0);
                        ViewPropertyAnimator animate = aVar.animate();
                        float f13 = 0.0f;
                        if (z11) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f12);
                        if (!z11) {
                            f13 = org.telegram.messenger.g0.L(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f13).setInterpolator(er.h).setDuration(320L);
                        if (!z11) {
                            v0Var = new wg.v0(c1Var, 1);
                        } else {
                            v0Var = null;
                        }
                        duration.withEndAction(v0Var).start();
                        xg.i iVar = c1Var.f59154l2;
                        boolean z14 = !z11;
                        if (iVar.E != z14) {
                            iVar.E = z14;
                            org.telegram.messenger.g0.d0(iVar.f59937f, new xg.g(z14));
                        }
                    }
                    c1Var.e1();
                    ng0Var.b(true, hashSet, new wg.v0(c1Var, 2), null);
                    c1Var.p1(true, true);
                    c1Var.f1();
                } else if (org.telegram.messenger.q10.b(org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24934t0).b2(j3))) {
                    org.telegram.messenger.i20.t(org.telegram.messenger.hd.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), new cc(c1Var.f29685c, e6Var), 2131624012, 36);
                } else {
                    bi.s2 s2Var = new bi.s2(c1Var.getContext(), this.f33367b, j3, wg.q.c(wg.q.b(1, c1Var.f59156n2)), new wg.w0(c1Var, 1));
                    org.telegram.messenger.t1 t1Var = c1Var.f59160r2;
                    if (t1Var == null || !t1Var.a(j3)) {
                        z13 = false;
                    }
                    s2Var.e1(z13);
                    s2Var.show();
                }
            }
        }
    }

    public bt(p4.c1 c1Var, Surface surface, int i7, int i10) {
        this.f33368c = c1Var;
        this.d = surface;
        this.f33366a = i7;
        this.f33367b = i10;
    }

    public bt(wg.c1 c1Var, int i7, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        this.f33368c = c1Var;
        this.f33366a = i7;
        this.d = e6Var;
        this.f33367b = i10;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
