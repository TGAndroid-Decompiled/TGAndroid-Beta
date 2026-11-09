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
public final class d11 extends org.telegram.ui.Components.pj0 {
    public int f44795c;
    public int d;
    public int h;
    public final s11 f44800s;
    public int f44796e = -1;
    public int f44797f = -1;
    public int f44798n = 1;
    public final ArrayList f44799r = new ArrayList();

    public d11(s11 s11Var) {
        this.f44800s = s11Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57060f;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z9) {
        s11 s11Var = this.f44800s;
        int i7 = s11Var.W;
        boolean z10 = s11Var.I;
        ArrayList arrayList = this.f44799r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f44795c = -1;
        boolean z11 = false;
        this.f44798n = 0;
        arrayList.clear();
        ArrayList arrayList2 = s11Var.B1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f44798n;
                this.f44798n = i10 + 1;
                this.f44796e = i10;
                arrayList.add(1);
            }
            this.d = this.f44798n;
            for (int i11 = 0; i11 < s11Var.B1.size(); i11++) {
                this.f44798n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, s11Var.B1.get(i11))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = s11Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f44798n;
                this.f44798n = i12 + 1;
                this.f44797f = i12;
                arrayList.add(2);
                this.f44795c = this.f44798n;
                for (int i13 = 0; i13 < s11Var.C1.size(); i13++) {
                    this.f44798n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, s11Var.C1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = s11Var.D1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f44798n;
                    this.f44798n = i14 + 1;
                    this.f44797f = i14;
                    arrayList.add(2);
                }
                this.f44795c = this.f44798n;
                for (int i15 = 0; i15 < s11Var.D1.size(); i15++) {
                    this.f44798n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, s11Var.D1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = s11Var.E1;
        if (arrayList5 != null) {
            int i16 = this.f44798n;
            this.h = i16;
            this.f44798n = arrayList5.size() + i16;
        }
        f();
        if (s11Var.f49720z1 && this.f44798n == 0) {
            z11 = true;
        }
        if (s11Var.H1 != z11) {
            s11Var.H1 = z11;
            ValueAnimator valueAnimator = s11Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            s11Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new zz0(s11Var, z11, 1));
            s11Var.I1.addListener(new m01(s11Var, z11, 1));
            s11Var.I1.setInterpolator(org.telegram.ui.Components.xq.h);
            s11Var.I1.setDuration(100L);
            s11Var.I1.start();
            if (z11) {
                s11.D(s11Var.V, s11Var.f49688l0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f44798n;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (i7 == this.f44796e || i7 == this.f44797f) {
            return 6;
        }
        s11 s11Var = this.f44800s;
        if (s11Var.W == 14) {
            ArrayList arrayList = s11Var.C1;
            if (arrayList != null && i7 >= (i10 = this.f44795c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f44795c;
            if (i7 > i11 && (i7 - i11) - 1 < s11Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = s11Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i7 > i12 && (i7 - i12) - 1 < arrayList2.size() && (s11Var.W == 13 || ((ch.o0) s11Var.B1.get((i7 - this.d) - 1)).f6355g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i7 - i13 < 0 || i7 - i13 >= s11Var.E1.size()) {
            return 4;
        }
        if (s11Var.E1.get(i7 - this.h) instanceof p11) {
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
        s11 s11Var = this.f44800s;
        HashSet hashSet = s11Var.K;
        int i13 = s11Var.W;
        int i14 = s11Var.V;
        g01 g01Var = s11Var.f49682i0;
        int i15 = d1Var.f57060f;
        View view = d1Var.f57056a;
        if (i15 == 6) {
            y01 y01Var = (y01) view;
            ArrayList arrayList = s11Var.E1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) s11Var.E1.get(i7 - this.h);
                if (document2 instanceof p11) {
                    CharSequence charSequence = ((p11) document2).f48589a;
                    String str = s11Var.A1;
                    y01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Jf, y01Var.f51811f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    y01Var.f51807a.setText(charSequence);
                    y01Var.b(false);
                }
            } else if (i7 == this.f44796e) {
                y01Var.a(org.telegram.messenger.id.M0(2131751196, null), false);
            } else if (i13 == 14) {
                y01Var.a(org.telegram.messenger.id.M0(2131744876, null), false);
            } else {
                y01Var.a(org.telegram.messenger.id.M0(2131754756, null), false);
            }
            y01Var.f51809c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) s11Var.D1.get((i7 - this.f44795c) - 1);
            c11 c11Var = (c11) view;
            c11Var.a(g01Var);
            c11Var.h.r0(org.telegram.messenger.hc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.l6.f28030m6, 0.2f, null), 0L, "tgs", document3, 0);
            c11Var.Q = true;
            c11Var.d = document3;
            c11Var.f44191e = null;
        } else if (i15 == 4) {
            c11 c11Var2 = (c11) view;
            c11Var2.f44190c = i7;
            ImageReceiver imageReceiver = c11Var2.f44193n;
            ArrayList arrayList2 = s11Var.B1;
            if (arrayList2 != null && i7 >= 0 && i7 < arrayList2.size()) {
                o0Var = (ch.o0) s11Var.B1.get(i7);
            } else {
                ArrayList arrayList3 = s11Var.C1;
                if (arrayList3 != null && i7 >= (i11 = this.f44795c) && i7 - i11 < arrayList3.size()) {
                    o0Var = (ch.o0) s11Var.C1.get(i7 - this.f44795c);
                } else {
                    return;
                }
            }
            if (c11Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(c11Var2);
                c11Var2.h = imageReceiver2;
                imageReceiver2.E0(7);
                c11Var2.h.P();
            }
            c11Var2.h.H0(g01Var);
            c11Var2.f44198y = o0Var;
            c11Var2.D = false;
            c11Var2.d(s11Var.J.contains(o0Var), false);
            c11Var2.f44189b = false;
            c11Var2.invalidate();
            if (i13 == 13) {
                c11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f6354f));
            } else if (!o0Var.f6351b && o0Var.f6354f != null) {
                c11Var2.f44195s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i14).f25836r.get(o0Var.f6354f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.l6.f28030m6, 0.2f, null);
                    if (!org.telegram.messenger.sc.e(8200)) {
                        c11Var2.h.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", o0Var, 0);
                    } else {
                        ch.o0 o0Var2 = o0Var;
                        c11Var2.h.u0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    }
                    org.telegram.messenger.ui.b0(i14);
                    org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
                } else {
                    c11Var2.h.f();
                    imageReceiver.f();
                }
                c11Var2.f44191e = null;
                c11Var2.d = null;
                c11Var2.setDrawable(null);
                b11 b11Var = c11Var2.J;
                if (b11Var != null) {
                    b11Var.setVisibility(8);
                    c11Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && o0Var.f6351b) {
                    c11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f6354f));
                }
            } else {
                c11Var2.f44195s = false;
                c11Var2.f44191e = new org.telegram.ui.Components.r5(o0Var.f6355g, (Paint.FontMetricsInt) null);
                c11Var2.d = null;
                c11Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) g01Var.f50529k3.get(c11Var2.f44191e.getDocumentId());
                if (i5Var == null) {
                    cacheType2 = s11Var.getCacheType();
                    i5Var = org.telegram.ui.Components.i5.m(i14, c11Var2.f44191e.getDocumentId(), null, cacheType2);
                    g01Var.f50529k3.put(c11Var2.f44191e.getDocumentId(), i5Var);
                }
                c11Var2.setDrawable(i5Var);
            }
            if (!org.telegram.messenger.p10.i(i14).q() && i13 == 14 && o0Var.f6351b && o0Var.d) {
                c11Var2.b();
                c11Var2.J.setVisibility(0);
                c11Var2.setEmojicon(null);
                return;
            }
            if (o0Var.f6353e) {
                c11Var2.setEmojicon(o0Var.f6354f);
            } else {
                c11Var2.setEmojicon(null);
            }
            b11 b11Var2 = c11Var2.J;
            if (b11Var2 != null) {
                b11Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            c11 c11Var3 = (c11) view;
            c11Var3.f44188a = false;
            c11Var3.f44190c = i7;
            c11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            c11Var3.setDrawable(null);
            ArrayList arrayList4 = s11Var.B1;
            if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                ch.o0 o0Var3 = (ch.o0) s11Var.B1.get(i7);
                c11Var3.f44198y = o0Var3;
                long j3 = o0Var3.f6355g;
                if (j3 == 0) {
                    boolean contains2 = s11Var.J.contains(o0Var3);
                    c11Var3.D = true;
                    c11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var3.f6354f));
                    c11Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j3);
                if (i13 == 14 && !org.telegram.messenger.p10.i(i14).q() && o0Var3.f6351b && o0Var3.d) {
                    c11Var3.b();
                    c11Var3.J.setVisibility(0);
                } else {
                    b11 b11Var3 = c11Var3.J;
                    if (b11Var3 != null) {
                        b11Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = s11Var.E1;
                if (arrayList5 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) s11Var.E1.get(i7 - this.h);
                    if (!(document instanceof p11)) {
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
                    c11Var3.f44191e = new org.telegram.ui.Components.r5(document, (Paint.FontMetricsInt) null);
                    c11Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f26962id));
                } else {
                    org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(l10.longValue(), (Paint.FontMetricsInt) null);
                    c11Var3.f44191e = r5Var;
                    c11Var3.d = r5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.i5 i5Var2 = (org.telegram.ui.Components.i5) g01Var.f50529k3.get(c11Var3.f44191e.getDocumentId());
                if (i5Var2 == null) {
                    cacheType = s11Var.getCacheType();
                    i5Var2 = org.telegram.ui.Components.i5.m(i14, c11Var3.f44191e.getDocumentId(), null, cacheType);
                    g01Var.f50529k3.put(c11Var3.f44191e.getDocumentId(), i5Var2);
                }
                c11Var3.setDrawable(i5Var2);
            }
            c11Var3.d(contains, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View c11Var;
        boolean z9;
        s11 s11Var = this.f44800s;
        if (i7 == 6) {
            Context context = s11Var.getContext();
            if (s11Var.W == 6) {
                z9 = true;
            } else {
                z9 = false;
            }
            c11Var = new y01(s11Var, context, z9);
        } else if (i7 == 7) {
            c11Var = new org.telegram.ui.Components.tm(s11Var.getContext(), 24);
            c11Var.setTag("searchbox");
        } else {
            c11Var = new c11(s11Var, s11Var.getContext());
        }
        if (s11.c(s11Var)) {
            c11Var.setScaleX(0.0f);
            c11Var.setScaleY(0.0f);
        }
        return new v4.d1(c11Var);
    }
}
