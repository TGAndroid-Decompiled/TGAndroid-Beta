package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class b11 extends org.telegram.ui.Components.oj0 {
    public int f44157c;
    public int d;
    public int h;
    public final q11 f44162s;
    public int f44158e = -1;
    public int f44159f = -1;
    public int f44160n = 1;
    public final ArrayList f44161r = new ArrayList();

    public b11(q11 q11Var) {
        this.f44162s = q11Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57047f;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z9) {
        q11 q11Var = this.f44162s;
        int i7 = q11Var.W;
        boolean z10 = q11Var.I;
        ArrayList arrayList = this.f44161r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f44157c = -1;
        boolean z11 = false;
        this.f44160n = 0;
        arrayList.clear();
        ArrayList arrayList2 = q11Var.B1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f44160n;
                this.f44160n = i10 + 1;
                this.f44158e = i10;
                arrayList.add(1);
            }
            this.d = this.f44160n;
            for (int i11 = 0; i11 < q11Var.B1.size(); i11++) {
                this.f44160n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, q11Var.B1.get(i11))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = q11Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f44160n;
                this.f44160n = i12 + 1;
                this.f44159f = i12;
                arrayList.add(2);
                this.f44157c = this.f44160n;
                for (int i13 = 0; i13 < q11Var.C1.size(); i13++) {
                    this.f44160n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q11Var.C1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = q11Var.D1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f44160n;
                    this.f44160n = i14 + 1;
                    this.f44159f = i14;
                    arrayList.add(2);
                }
                this.f44157c = this.f44160n;
                for (int i15 = 0; i15 < q11Var.D1.size(); i15++) {
                    this.f44160n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q11Var.D1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = q11Var.E1;
        if (arrayList5 != null) {
            int i16 = this.f44160n;
            this.h = i16;
            this.f44160n = arrayList5.size() + i16;
        }
        f();
        if (q11Var.f49077z1 && this.f44160n == 0) {
            z11 = true;
        }
        if (q11Var.H1 != z11) {
            q11Var.H1 = z11;
            ValueAnimator valueAnimator = q11Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q11Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new wz0(q11Var, z11, 1));
            q11Var.I1.addListener(new k01(q11Var, z11, 1));
            q11Var.I1.setInterpolator(org.telegram.ui.Components.xq.h);
            q11Var.I1.setDuration(100L);
            q11Var.I1.start();
            if (z11) {
                q11.D(q11Var.V, q11Var.f49045l0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f44160n;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (i7 == this.f44158e || i7 == this.f44159f) {
            return 6;
        }
        q11 q11Var = this.f44162s;
        if (q11Var.W == 14) {
            ArrayList arrayList = q11Var.C1;
            if (arrayList != null && i7 >= (i10 = this.f44157c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f44157c;
            if (i7 > i11 && (i7 - i11) - 1 < q11Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = q11Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i7 > i12 && (i7 - i12) - 1 < arrayList2.size() && (q11Var.W == 13 || ((ch.o0) q11Var.B1.get((i7 - this.d) - 1)).f6357g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i7 - i13 < 0 || i7 - i13 >= q11Var.E1.size()) {
            return 4;
        }
        if (q11Var.E1.get(i7 - this.h) instanceof n11) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        ch.o0 o0Var;
        int cacheType2;
        int i12;
        int indexOf;
        q11 q11Var = this.f44162s;
        HashSet hashSet = q11Var.K;
        int i13 = q11Var.W;
        int i14 = q11Var.V;
        e01 e01Var = q11Var.f49039i0;
        int i15 = d1Var.f57047f;
        View view = d1Var.f57043a;
        if (i15 == 6) {
            w01 w01Var = (w01) view;
            ArrayList arrayList = q11Var.E1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) q11Var.E1.get(i7 - this.h);
                if (document2 instanceof n11) {
                    CharSequence charSequence = ((n11) document2).f47938a;
                    String str = q11Var.A1;
                    w01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Jf, w01Var.f50821f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w01Var.f50817a.setText(charSequence);
                    w01Var.b(false);
                }
            } else if (i7 == this.f44158e) {
                w01Var.a(org.telegram.messenger.id.M0(2131751197, null), false);
            } else if (i13 == 14) {
                w01Var.a(org.telegram.messenger.id.M0(2131744879, null), false);
            } else {
                w01Var.a(org.telegram.messenger.id.M0(2131754756, null), false);
            }
            w01Var.f50819c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) q11Var.D1.get((i7 - this.f44157c) - 1);
            a11 a11Var = (a11) view;
            a11Var.a(e01Var);
            a11Var.h.r0(org.telegram.messenger.hc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.k6.f28017m6, 0.2f, null), 0L, "tgs", document3, 0);
            a11Var.Q = true;
            a11Var.d = document3;
            a11Var.f43535e = null;
        } else if (i15 == 4) {
            a11 a11Var2 = (a11) view;
            a11Var2.f43534c = i7;
            ImageReceiver imageReceiver = a11Var2.f43537n;
            ArrayList arrayList2 = q11Var.B1;
            if (arrayList2 != null && i7 >= 0 && i7 < arrayList2.size()) {
                o0Var = (ch.o0) q11Var.B1.get(i7);
            } else {
                ArrayList arrayList3 = q11Var.C1;
                if (arrayList3 != null && i7 >= (i11 = this.f44157c) && i7 - i11 < arrayList3.size()) {
                    o0Var = (ch.o0) q11Var.C1.get(i7 - this.f44157c);
                } else {
                    return;
                }
            }
            if (a11Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(a11Var2);
                a11Var2.h = imageReceiver2;
                imageReceiver2.E0(7);
                a11Var2.h.P();
            }
            a11Var2.h.H0(e01Var);
            a11Var2.f43542y = o0Var;
            a11Var2.D = false;
            a11Var2.d(q11Var.J.contains(o0Var), false);
            a11Var2.f43533b = false;
            a11Var2.invalidate();
            if (i13 == 13) {
                a11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f6356f));
            } else if (!o0Var.f6353b && o0Var.f6356f != null) {
                a11Var2.f43539s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i14).f25836r.get(o0Var.f6356f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.k6.f28017m6, 0.2f, null);
                    if (!org.telegram.messenger.sc.e(8200)) {
                        a11Var2.h.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", o0Var, 0);
                    } else {
                        ch.o0 o0Var2 = o0Var;
                        a11Var2.h.u0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    }
                    org.telegram.messenger.ui.b0(i14);
                    org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
                } else {
                    a11Var2.h.f();
                    imageReceiver.f();
                }
                a11Var2.f43535e = null;
                a11Var2.d = null;
                a11Var2.setDrawable(null);
                z01 z01Var = a11Var2.J;
                if (z01Var != null) {
                    z01Var.setVisibility(8);
                    a11Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && o0Var.f6353b) {
                    a11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f6356f));
                }
            } else {
                a11Var2.f43539s = false;
                a11Var2.f43535e = new org.telegram.ui.Components.r5(o0Var.f6357g, (Paint.FontMetricsInt) null);
                a11Var2.d = null;
                a11Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) e01Var.f49873k3.get(a11Var2.f43535e.getDocumentId());
                if (i5Var == null) {
                    cacheType2 = q11Var.getCacheType();
                    i5Var = org.telegram.ui.Components.i5.m(i14, a11Var2.f43535e.getDocumentId(), null, cacheType2);
                    e01Var.f49873k3.put(a11Var2.f43535e.getDocumentId(), i5Var);
                }
                a11Var2.setDrawable(i5Var);
            }
            if (!org.telegram.messenger.p10.i(i14).q() && i13 == 14 && o0Var.f6353b && o0Var.d) {
                a11Var2.b();
                a11Var2.J.setVisibility(0);
                a11Var2.setEmojicon(null);
                return;
            }
            if (o0Var.f6355e) {
                a11Var2.setEmojicon(o0Var.f6356f);
            } else {
                a11Var2.setEmojicon(null);
            }
            z01 z01Var2 = a11Var2.J;
            if (z01Var2 != null) {
                z01Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            a11 a11Var3 = (a11) view;
            a11Var3.f43532a = false;
            a11Var3.f43534c = i7;
            a11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            a11Var3.setDrawable(null);
            ArrayList arrayList4 = q11Var.B1;
            if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                ch.o0 o0Var3 = (ch.o0) q11Var.B1.get(i7);
                a11Var3.f43542y = o0Var3;
                long j3 = o0Var3.f6357g;
                if (j3 == 0) {
                    boolean contains2 = q11Var.J.contains(o0Var3);
                    a11Var3.D = true;
                    a11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var3.f6356f));
                    a11Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j3);
                if (i13 == 14 && !org.telegram.messenger.p10.i(i14).q() && o0Var3.f6353b && o0Var3.d) {
                    a11Var3.b();
                    a11Var3.J.setVisibility(0);
                } else {
                    z01 z01Var3 = a11Var3.J;
                    if (z01Var3 != null) {
                        z01Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = q11Var.E1;
                if (arrayList5 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) q11Var.E1.get(i7 - this.h);
                    if (!(document instanceof n11)) {
                        l10 = null;
                    }
                }
                document = null;
                l10 = null;
            }
            if (l10 == null && document == null) {
                contains = false;
            } else {
                if (document != null) {
                    a11Var3.f43535e = new org.telegram.ui.Components.r5(document, (Paint.FontMetricsInt) null);
                    a11Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f26962id));
                } else {
                    org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(l10.longValue(), (Paint.FontMetricsInt) null);
                    a11Var3.f43535e = r5Var;
                    a11Var3.d = r5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.i5 i5Var2 = (org.telegram.ui.Components.i5) e01Var.f49873k3.get(a11Var3.f43535e.getDocumentId());
                if (i5Var2 == null) {
                    cacheType = q11Var.getCacheType();
                    i5Var2 = org.telegram.ui.Components.i5.m(i14, a11Var3.f43535e.getDocumentId(), null, cacheType);
                    e01Var.f49873k3.put(a11Var3.f43535e.getDocumentId(), i5Var2);
                }
                a11Var3.setDrawable(i5Var2);
            }
            a11Var3.d(contains, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View a11Var;
        boolean z9;
        q11 q11Var = this.f44162s;
        if (i7 == 6) {
            Context context = q11Var.getContext();
            if (q11Var.W == 6) {
                z9 = true;
            } else {
                z9 = false;
            }
            a11Var = new w01(q11Var, context, z9);
        } else if (i7 == 7) {
            a11Var = new org.telegram.ui.Components.tm(q11Var.getContext(), 24);
            a11Var.setTag("searchbox");
        } else {
            a11Var = new a11(q11Var, q11Var.getContext());
        }
        if (q11.c(q11Var)) {
            a11Var.setScaleX(0.0f);
            a11Var.setScaleY(0.0f);
        }
        return new v4.d1(a11Var);
    }
}
