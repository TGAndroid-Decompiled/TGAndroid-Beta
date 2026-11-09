package org.telegram.ui.Components;

import android.text.Editable;
import android.text.style.CharacterStyle;
import android.view.Surface;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class us implements ys, h2.j, dj0 {
    public final int f38798a;
    public final int f38799b;
    public final Object f38800c;
    public final Object d;

    public us(zs zsVar, int i7, int i10, Runnable runnable) {
        this.f38800c = zsVar;
        this.f38798a = i7;
        this.f38799b = i10;
        this.d = runnable;
    }

    @Override
    public void a(String str) {
        zs zsVar = (zs) this.f38800c;
        Runnable runnable = (Runnable) this.d;
        Editable text = zsVar.getText();
        int i7 = this.f38798a;
        int i10 = this.f38799b;
        CharacterStyle[] characterStyleArr = (CharacterStyle[]) text.getSpans(i7, i10, CharacterStyle.class);
        if (characterStyleArr != null && characterStyleArr.length > 0) {
            for (CharacterStyle characterStyle : characterStyleArr) {
                if (!(characterStyle instanceof r5) && !(characterStyle instanceof ug0)) {
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
            text.setSpan(zsVar.A(str), i7, i10, 33);
        } catch (Exception unused) {
        }
        xs xsVar = zsVar.N1;
        if (xsVar != null) {
            xsVar.m();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void accept(Object obj) {
        p4.c1 c1Var = (p4.c1) this.f38800c;
        Surface surface = (Surface) this.d;
        p4.g1 g1Var = (p4.g1) obj;
        ((p4.d0) c1Var.f53195a.get()).getClass();
        if (surface == null) {
            g1Var.S(null);
            c1Var.f53200i = null;
            return;
        }
        p4.b1 b1Var = new p4.b1(surface, this.f38798a, this.f38799b);
        c1Var.f53200i = b1Var;
        g1Var.S(b1Var);
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        long j3;
        boolean z9;
        boolean z10;
        float f12;
        wg.x0 x0Var;
        wg.f1 f1Var = (wg.f1) this.f38800c;
        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
        ah.a aVar = f1Var.V1;
        org.telegram.ui.pg0 pg0Var = f1Var.R1;
        ArrayList arrayList = f1Var.Y1;
        HashSet hashSet = f1Var.Z1;
        boolean z11 = view instanceof org.telegram.ui.Cells.m8;
        int i10 = this.f38798a;
        xg.h hVar = null;
        if (z11) {
            if (i10 == 4) {
                org.telegram.ui.u00 u00Var = f1Var.f57743s2;
                if (u00Var != null) {
                    u00Var.run();
                    f1Var.dismiss();
                    return;
                }
                return;
            }
            ((org.telegram.ui.ActionBar.v2) v4.l(f1Var.getContext(), org.telegram.messenger.id.M0(2131751238, null), org.telegram.messenger.id.M0(2131751243, null), null, new wg.y0(f1Var, 2), new wg.x0(f1Var, 9), false, false, f1Var.I0).f14323b).show();
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
                org.telegram.messenger.c20 c20Var = f1Var.f57744t2;
                if (c20Var != null && hVar != null) {
                    int i12 = hVar.f58744i;
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
                    j3 = user.f27105id;
                } else {
                    j3 = -chat.f26956id;
                }
                if (i10 == 3) {
                    org.telegram.messenger.c20 c20Var2 = f1Var.f57744t2;
                    if (c20Var2 != null) {
                        c20Var2.a(Long.valueOf(j3));
                    }
                } else if (i10 == 1) {
                    if (pg0Var != null) {
                        org.telegram.messenger.g0.v1(pg0Var.getEditText());
                    }
                    bi.oc ocVar = new bi.oc(f1Var.getContext(), g6Var, user, new wg.x0(f1Var, 11));
                    if (!org.telegram.messenger.g0.Q1()) {
                        ocVar.a0(f1Var.f28637f1);
                    }
                    ocVar.show();
                } else if (i10 != 0 && i10 != 2) {
                    int i13 = 4;
                    if (i10 == 4) {
                        if (hashSet.isEmpty()) {
                            hashSet.add(Long.valueOf(j3));
                            org.telegram.messenger.v10 v10Var = f1Var.f57746v2;
                            if (v10Var != null) {
                                wo woVar = f1Var.U1;
                                if (woVar == null || !woVar.f40108a.f31268q) {
                                    z12 = false;
                                }
                                v10Var.a(Boolean.valueOf(z12), hashSet);
                                f1Var.f57746v2 = null;
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
                        f1Var.f57730f2.put(Long.valueOf(j3), user);
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
                        ViewPropertyAnimator duration = alpha.translationY(f13).setInterpolator(xq.h).setDuration(320L);
                        if (!z10) {
                            x0Var = new wg.x0(f1Var, 1);
                        } else {
                            x0Var = null;
                        }
                        duration.withEndAction(x0Var).start();
                        xg.i iVar = f1Var.f57732h2;
                        boolean z13 = !z10;
                        if (iVar.D != z13) {
                            iVar.D = z13;
                            org.telegram.messenger.g0.d0(iVar.f58755f, new xg.g(z13));
                        }
                    }
                    f1Var.e1();
                    pg0Var.b(true, hashSet, new wg.x0(f1Var, 2), null);
                    f1Var.p1(true, true);
                    f1Var.f1();
                } else if (org.telegram.messenger.t10.b(org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).b2(j3))) {
                    org.telegram.messenger.camera.q.s(org.telegram.messenger.id.a0(null, null, 2131743742, org.telegram.messenger.m5.t(j3)), new hc(f1Var.f28627c, g6Var), 2131624011, 36);
                } else {
                    zh.g1 g1Var = new zh.g1(f1Var.getContext(), this.f38799b, j3, wg.r.c(wg.r.b(1, f1Var.f57734j2)), new wg.y0(f1Var, 1));
                    org.telegram.messenger.t1 t1Var = f1Var.f57738n2;
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

    public us(p4.c1 c1Var, Surface surface, int i7, int i10) {
        this.f38800c = c1Var;
        this.d = surface;
        this.f38798a = i7;
        this.f38799b = i10;
    }

    public us(wg.f1 f1Var, int i7, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        this.f38800c = f1Var;
        this.f38798a = i7;
        this.d = g6Var;
        this.f38799b = i10;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
