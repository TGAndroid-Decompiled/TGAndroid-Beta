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
public final class d11 extends org.telegram.ui.Components.dk0 {
    public int f46852c;
    public int d;
    public int h;
    public final s11 f46857s;
    public int f46853e = -1;
    public int f46854f = -1;
    public int f46855n = 1;
    public final ArrayList f46856r = new ArrayList();

    public d11(s11 s11Var) {
        this.f46857s = s11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59165f;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        s11 s11Var = this.f46857s;
        int i7 = s11Var.f51819a0;
        boolean z11 = s11Var.J;
        ArrayList arrayList = this.f46856r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f46852c = -1;
        boolean z12 = false;
        this.f46855n = 0;
        arrayList.clear();
        ArrayList arrayList2 = s11Var.C1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f46855n;
                this.f46855n = i10 + 1;
                this.f46853e = i10;
                arrayList.add(1);
            }
            this.d = this.f46855n;
            for (int i11 = 0; i11 < s11Var.C1.size(); i11++) {
                this.f46855n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, s11Var.C1.get(i11))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = s11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f46855n;
                this.f46855n = i12 + 1;
                this.f46854f = i12;
                arrayList.add(2);
                this.f46852c = this.f46855n;
                for (int i13 = 0; i13 < s11Var.D1.size(); i13++) {
                    this.f46855n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, s11Var.D1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = s11Var.E1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f46855n;
                    this.f46855n = i14 + 1;
                    this.f46854f = i14;
                    arrayList.add(2);
                }
                this.f46852c = this.f46855n;
                for (int i15 = 0; i15 < s11Var.E1.size(); i15++) {
                    this.f46855n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, s11Var.E1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = s11Var.F1;
        if (arrayList5 != null) {
            int i16 = this.f46855n;
            this.h = i16;
            this.f46855n = arrayList5.size() + i16;
        }
        f();
        if (s11Var.A1 && this.f46855n == 0) {
            z12 = true;
        }
        if (s11Var.I1 != z12) {
            s11Var.I1 = z12;
            ValueAnimator valueAnimator = s11Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            s11Var.J1 = ofFloat;
            ofFloat.addUpdateListener(new zz0(s11Var, z12, 1));
            s11Var.J1.addListener(new m01(s11Var, z12, 1));
            s11Var.J1.setInterpolator(org.telegram.ui.Components.nr.h);
            s11Var.J1.setDuration(100L);
            s11Var.J1.start();
            if (z12) {
                s11.D(s11Var.W, s11Var.m0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f46855n;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (i7 == this.f46853e || i7 == this.f46854f) {
            return 6;
        }
        s11 s11Var = this.f46857s;
        if (s11Var.f51819a0 == 14) {
            ArrayList arrayList = s11Var.D1;
            if (arrayList != null && i7 >= (i10 = this.f46852c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f46852c;
            if (i7 > i11 && (i7 - i11) - 1 < s11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = s11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i7 > i12 && (i7 - i12) - 1 < arrayList2.size() && (s11Var.f51819a0 == 13 || ((ch.p0) s11Var.C1.get((i7 - this.d) - 1)).f5505g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i7 - i13 < 0 || i7 - i13 >= s11Var.F1.size()) {
            return 4;
        }
        if (s11Var.F1.get(i7 - this.h) instanceof p11) {
            return 6;
        }
        return 3;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        TLRPC.Document document;
        Long l10;
        int i10;
        boolean contains;
        int cacheType;
        int i11;
        ch.p0 p0Var;
        int cacheType2;
        int i12;
        int indexOf;
        s11 s11Var = this.f46857s;
        HashSet hashSet = s11Var.L;
        int i13 = s11Var.f51819a0;
        int i14 = s11Var.W;
        g01 g01Var = s11Var.f51842j0;
        int i15 = f1Var.f59165f;
        View view = f1Var.f59161a;
        if (i15 == 6) {
            y01 y01Var = (y01) view;
            ArrayList arrayList = s11Var.F1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) s11Var.F1.get(i7 - this.h);
                if (document2 instanceof p11) {
                    CharSequence charSequence = ((p11) document2).f50698a;
                    String str = s11Var.B1;
                    y01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Mf, y01Var.f54003f.f51820a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    y01Var.f53999a.setText(charSequence);
                    y01Var.b(false);
                }
            } else if (i7 == this.f46853e) {
                y01Var.a(org.telegram.messenger.gd.N0(2131751184, null), false);
            } else if (i13 == 14) {
                y01Var.a(org.telegram.messenger.gd.N0(2131744635, null), false);
            } else {
                y01Var.a(org.telegram.messenger.gd.N0(2131754755, null), false);
            }
            y01Var.f54001c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) s11Var.E1.get((i7 - this.f46852c) - 1);
            c11 c11Var = (c11) view;
            c11Var.a(g01Var);
            c11Var.h.r0(org.telegram.messenger.fc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.u5.f(document3, org.telegram.ui.ActionBar.m6.f29543m6, 0.2f, null), 0L, "tgs", document3, 0);
            c11Var.R = true;
            c11Var.d = document3;
            c11Var.f46381e = null;
        } else if (i15 == 4) {
            c11 c11Var2 = (c11) view;
            c11Var2.f46380c = i7;
            ImageReceiver imageReceiver = c11Var2.f46383n;
            ArrayList arrayList2 = s11Var.C1;
            if (arrayList2 != null && i7 >= 0 && i7 < arrayList2.size()) {
                p0Var = (ch.p0) s11Var.C1.get(i7);
            } else {
                ArrayList arrayList3 = s11Var.D1;
                if (arrayList3 != null && i7 >= (i11 = this.f46852c) && i7 - i11 < arrayList3.size()) {
                    p0Var = (ch.p0) s11Var.D1.get(i7 - this.f46852c);
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
            c11Var2.f46388y = p0Var;
            c11Var2.E = false;
            c11Var2.d(s11Var.K.contains(p0Var), false);
            c11Var2.f46379b = false;
            c11Var2.invalidate();
            if (i13 == 13) {
                c11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f5504f));
            } else if (!p0Var.f5501b && p0Var.f5504f != null) {
                c11Var2.f46385s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i14).f26661r.get(p0Var.f5504f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.m6.f29543m6, 0.2f, null);
                    if (!org.telegram.messenger.pc.e(8200)) {
                        c11Var2.h.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    } else {
                        ch.p0 p0Var2 = p0Var;
                        c11Var2.h.u0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    org.telegram.messenger.ri.d0(i14);
                    org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    c11Var2.h.f();
                    imageReceiver.f();
                }
                c11Var2.f46381e = null;
                c11Var2.d = null;
                c11Var2.setDrawable(null);
                b11 b11Var = c11Var2.K;
                if (b11Var != null) {
                    b11Var.setVisibility(8);
                    c11Var2.K.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f5501b) {
                    c11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f5504f));
                }
            } else {
                c11Var2.f46385s = false;
                c11Var2.f46381e = new org.telegram.ui.Components.y5(p0Var.f5505g, (Paint.FontMetricsInt) null);
                c11Var2.d = null;
                c11Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) g01Var.f52682l3.get(c11Var2.f46381e.getDocumentId());
                if (p5Var == null) {
                    cacheType2 = s11Var.getCacheType();
                    p5Var = org.telegram.ui.Components.p5.m(i14, c11Var2.f46381e.getDocumentId(), null, cacheType2);
                    g01Var.f52682l3.put(c11Var2.f46381e.getDocumentId(), p5Var);
                }
                c11Var2.setDrawable(p5Var);
            }
            if (!org.telegram.messenger.j10.i(i14).q() && i13 == 14 && p0Var.f5501b && p0Var.d) {
                c11Var2.b();
                c11Var2.K.setVisibility(0);
                c11Var2.setEmojicon(null);
                return;
            }
            if (p0Var.f5503e) {
                c11Var2.setEmojicon(p0Var.f5504f);
            } else {
                c11Var2.setEmojicon(null);
            }
            b11 b11Var2 = c11Var2.K;
            if (b11Var2 != null) {
                b11Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            c11 c11Var3 = (c11) view;
            c11Var3.f46378a = false;
            c11Var3.f46380c = i7;
            c11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            c11Var3.setDrawable(null);
            ArrayList arrayList4 = s11Var.C1;
            if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                ch.p0 p0Var3 = (ch.p0) s11Var.C1.get(i7);
                c11Var3.f46388y = p0Var3;
                long j3 = p0Var3.f5505g;
                if (j3 == 0) {
                    boolean contains2 = s11Var.K.contains(p0Var3);
                    c11Var3.E = true;
                    c11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var3.f5504f));
                    c11Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j3);
                if (i13 == 14 && !org.telegram.messenger.j10.i(i14).q() && p0Var3.f5501b && p0Var3.d) {
                    c11Var3.b();
                    c11Var3.K.setVisibility(0);
                } else {
                    b11 b11Var3 = c11Var3.K;
                    if (b11Var3 != null) {
                        b11Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = s11Var.F1;
                if (arrayList5 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) s11Var.F1.get(i7 - this.h);
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
                    c11Var3.f46381e = new org.telegram.ui.Components.y5(document, (Paint.FontMetricsInt) null);
                    c11Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f28437id));
                } else {
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(l10.longValue(), (Paint.FontMetricsInt) null);
                    c11Var3.f46381e = y5Var;
                    c11Var3.d = y5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.p5 p5Var2 = (org.telegram.ui.Components.p5) g01Var.f52682l3.get(c11Var3.f46381e.getDocumentId());
                if (p5Var2 == null) {
                    cacheType = s11Var.getCacheType();
                    p5Var2 = org.telegram.ui.Components.p5.m(i14, c11Var3.f46381e.getDocumentId(), null, cacheType);
                    g01Var.f52682l3.put(c11Var3.f46381e.getDocumentId(), p5Var2);
                }
                c11Var3.setDrawable(p5Var2);
            }
            c11Var3.d(contains, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View c11Var;
        boolean z10;
        s11 s11Var = this.f46857s;
        if (i7 == 6) {
            Context context = s11Var.getContext();
            if (s11Var.f51819a0 == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            c11Var = new y01(s11Var, context, z10);
        } else if (i7 == 7) {
            c11Var = new org.telegram.ui.Components.ln(s11Var.getContext(), 24);
            c11Var.setTag("searchbox");
        } else {
            c11Var = new c11(s11Var, s11Var.getContext());
        }
        if (s11.c(s11Var)) {
            c11Var.setScaleX(0.0f);
            c11Var.setScaleY(0.0f);
        }
        return new v4.f1(c11Var);
    }
}
