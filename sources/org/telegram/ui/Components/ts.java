package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class ts implements xs, h2.j, cj0 {
    public final int f38392a;
    public final int f38393b;
    public final Object f38394c;
    public final Object d;

    public ts(ys ysVar, int i7, int i10, Runnable runnable) {
        this.f38394c = ysVar;
        this.f38392a = i7;
        this.f38393b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        ys ysVar = (ys) this.f38394c;
        Runnable runnable = (Runnable) this.d;
        Editable text = ysVar.getText();
        int i7 = this.f38392a;
        int i10 = this.f38393b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof q5) && !(characterStyle instanceof tg0)) {
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
            text.setSpan(ysVar.A(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        ws wsVar = ysVar.N1;
        if (wsVar != null) {
            wsVar.m();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        p4.c1 c1Var = (p4.c1) this.f38394c;
        Surface surface = (Surface) this.d;
        p4.g1 g1Var = (p4.g1) obj;
        ((p4.d0) c1Var.f53194a.get()).getClass();
        if (surface == null) {
            g1Var.S(null);
            c1Var.f53199i = null;
            return;
        }
        p4.b1 b1Var = new p4.b1(surface, this.f38392a, this.f38393b);
        c1Var.f53199i = b1Var;
        g1Var.S(b1Var);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        boolean z9;
        boolean z10;
        float f12;
        wg.x0 x0Var;
        wg.f1 f1Var = (wg.f1) this.f38394c;
        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) this.d;
        ah.a aVar = f1Var.Y1;
        org.telegram.ui.qg0 qg0Var = f1Var.U1;
        ArrayList arrayList = f1Var.f57726b2;
        HashSet hashSet = f1Var.f57727c2;
        boolean z11 = view instanceof org.telegram.ui.Cells.m8;
        int i10 = this.f38392a;
        xg.h hVar = null;
        if (z11) {
            if (i10 == 4) {
                org.telegram.ui.v00 v00Var = f1Var.f57745v2;
                if (v00Var != null) {
                    v00Var.run();
                    f1Var.dismiss();
                    return;
                }
                return;
            }
            ((org.telegram.ui.ActionBar.w2) u4.l(f1Var.getContext(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new wg.y0(f1Var, 2), new wg.x0(f1Var, 9), false, false, f1Var.I0).f14325b).show();
        } else if (view instanceof ah.r) {
            ah.r rVar = (ah.r) view;
            TLRPC.User user = rVar.getUser();
            TLRPC.Chat chat = rVar.getChat();
            boolean z12 = true;
            if (user == null && chat == null && i10 == 3) {
                int i11 = i7 - 1;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    hVar = (xg.h) arrayList.get(i11);
                }
                org.telegram.messenger.c20 c20Var = f1Var.f57746w2;
                if (c20Var != null && hVar != null) {
                    int i12 = hVar.f58742i;
                    if (i12 == 4) {
                        c20Var.a(-98L);
                    } else if (i12 == 5) {
                        c20Var.a(-97L);
                    } else {
                        c20Var.a(-99L);
                    }
                }
            } else if (user != null || chat != null) {
                if (user != null) {
                    j3 = user.f27109id;
                } else {
                    j3 = -chat.f26960id;
                }
                if (i10 == 3) {
                    org.telegram.messenger.c20 c20Var2 = f1Var.f57746w2;
                    if (c20Var2 != null) {
                        c20Var2.a(Long.valueOf(j3));
                    }
                } else if (i10 == 1) {
                    if (qg0Var != null) {
                        org.telegram.messenger.g0.v1(qg0Var.getEditText());
                    }
                    bi.oc ocVar = new bi.oc(f1Var.getContext(), h6Var, user, new wg.x0(f1Var, 11));
                    if (!org.telegram.messenger.g0.Q1()) {
                        ocVar.a0(f1Var.f28691i1);
                    }
                    ocVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    int i13 = 4;
                    if (i10 == 4) {
                        if (hashSet.isEmpty()) {
                            hashSet.add(Long.valueOf(j3));
                            org.telegram.messenger.v10 v10Var = f1Var.f57748y2;
                            if (v10Var != null) {
                                wo woVar = f1Var.X1;
                                if (woVar == null || !woVar.f40026a.f31279q) {
                                    z12 = false;
                                }
                                v10Var.a(Boolean.valueOf(z12), hashSet);
                                f1Var.f57748y2 = null;
                            }
                            f1Var.dismiss();
                            return;
                        }
                        i13 = 4;
                    }
                    if (i10 == i13 && hashSet.isEmpty()) {
                        z9 = false;
                    } else {
                        z9 = true;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                        f1Var.f57732i2.put(Long.valueOf(j3), user);
                    }
                    if (hashSet.size() == f1Var.h1() + 1) {
                        hashSet.remove(Long.valueOf(j3));
                        f1Var.m1();
                        return;
                    }
                    if (i10 == 4 && hashSet.isEmpty()) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    if (z9 != z10) {
                        aVar.setVisibility(0);
                        ViewPropertyAnimator animate = aVar.animate();
                        float f13 = 0.0f;
                        if (z10) {
                            f12 = 1.0f;
                        } else {
                            f12 = 0.0f;
                        }
                        ViewPropertyAnimator alpha = animate.alpha(f12);
                        if (!z10) {
                            f13 = org.telegram.messenger.g0.L(12.0f);
                        }
                        ViewPropertyAnimator duration = alpha.translationY(f13).setInterpolator(wq.h).setDuration(320L);
                        if (!z10) {
                            x0Var = new wg.x0(f1Var, 1);
                        } else {
                            x0Var = null;
                        }
                        duration.withEndAction(x0Var).start();
                        xg.i iVar = f1Var.f57734k2;
                        boolean z13 = !z10;
                        if (iVar.D != z13) {
                            iVar.D = z13;
                            org.telegram.messenger.g0.d0(iVar.f58753f, new xg.g(z13));
                        }
                    }
                    f1Var.e1();
                    qg0Var.b(true, hashSet, new wg.x0(f1Var, 2), null);
                    f1Var.p1(true, true);
                    f1Var.f1();
                } else if (org.telegram.messenger.t10.b(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).b2(j3))) {
                    org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), new gc(f1Var.f28675c, h6Var), 2131624011, 36);
                } else {
                    zh.g1 g1Var = new zh.g1(f1Var.getContext(), this.f38393b, j3, wg.r.c(wg.r.b(1, f1Var.f57736m2)), new wg.y0(f1Var, 1));
                    org.telegram.messenger.t1 t1Var = f1Var.f57740q2;
                    if (t1Var == null || !t1Var.a(j3)) {
                        z12 = false;
                    }
                    g1Var.e1(z12);
                    g1Var.show();
                }
            }
        }
    }

    @Override
    public boolean f1(View view) {
        return false;
    }

    public ts(p4.c1 c1Var, Surface surface, int i7, int i10) {
        this.f38394c = c1Var;
        this.d = surface;
        this.f38392a = i7;
        this.f38393b = i10;
    }

    public ts(wg.f1 f1Var, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        this.f38394c = f1Var;
        this.f38392a = i7;
        this.d = h6Var;
        this.f38393b = i10;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
