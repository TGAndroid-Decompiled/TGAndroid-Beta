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
public final class e11 extends org.telegram.ui.Components.oj0 {
    public int f45093c;
    public int d;
    public int h;
    public final t11 f45098s;
    public int f45094e = -1;
    public int f45095f = -1;
    public int f45096n = 1;
    public final ArrayList f45097r = new ArrayList();

    public e11(t11 t11Var) {
        this.f45098s = t11Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57056f;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z9) {
        t11 t11Var = this.f45098s;
        int i7 = t11Var.W;
        boolean z10 = t11Var.I;
        ArrayList arrayList = this.f45097r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f45093c = -1;
        boolean z11 = false;
        this.f45096n = 0;
        arrayList.clear();
        ArrayList arrayList2 = t11Var.B1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f45096n;
                this.f45096n = i10 + 1;
                this.f45094e = i10;
                arrayList.add(1);
            }
            this.d = this.f45096n;
            for (int i11 = 0; i11 < t11Var.B1.size(); i11++) {
                this.f45096n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, t11Var.B1.get(i11))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = t11Var.C1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f45096n;
                this.f45096n = i12 + 1;
                this.f45095f = i12;
                arrayList.add(2);
                this.f45093c = this.f45096n;
                for (int i13 = 0; i13 < t11Var.C1.size(); i13++) {
                    this.f45096n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, t11Var.C1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = t11Var.D1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f45096n;
                    this.f45096n = i14 + 1;
                    this.f45095f = i14;
                    arrayList.add(2);
                }
                this.f45093c = this.f45096n;
                for (int i15 = 0; i15 < t11Var.D1.size(); i15++) {
                    this.f45096n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, t11Var.D1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = t11Var.E1;
        if (arrayList5 != null) {
            int i16 = this.f45096n;
            this.h = i16;
            this.f45096n = arrayList5.size() + i16;
        }
        f();
        if (t11Var.f50076z1 && this.f45096n == 0) {
            z11 = true;
        }
        if (t11Var.H1 != z11) {
            t11Var.H1 = z11;
            ValueAnimator valueAnimator = t11Var.I1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            t11Var.I1 = ofFloat;
            ofFloat.addUpdateListener(new a01(t11Var, z11, 1));
            t11Var.I1.addListener(new n01(t11Var, z11, 1));
            t11Var.I1.setInterpolator(org.telegram.ui.Components.wq.h);
            t11Var.I1.setDuration(100L);
            t11Var.I1.start();
            if (z11) {
                t11.D(t11Var.V, t11Var.f50044l0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f45096n;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (i7 == this.f45094e || i7 == this.f45095f) {
            return 6;
        }
        t11 t11Var = this.f45098s;
        if (t11Var.W == 14) {
            ArrayList arrayList = t11Var.C1;
            if (arrayList != null && i7 >= (i10 = this.f45093c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f45093c;
            if (i7 > i11 && (i7 - i11) - 1 < t11Var.D1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = t11Var.B1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i7 > i12 && (i7 - i12) - 1 < arrayList2.size() && (t11Var.W == 13 || ((ch.o0) t11Var.B1.get((i7 - this.d) - 1)).f6360g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i7 - i13 < 0 || i7 - i13 >= t11Var.E1.size()) {
            return 4;
        }
        if (t11Var.E1.get(i7 - this.h) instanceof q11) {
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
        t11 t11Var = this.f45098s;
        HashSet hashSet = t11Var.K;
        int i13 = t11Var.W;
        int i14 = t11Var.V;
        h01 h01Var = t11Var.f50038i0;
        int i15 = d1Var.f57056f;
        View view = d1Var.f57052a;
        if (i15 == 6) {
            z01 z01Var = (z01) view;
            ArrayList arrayList = t11Var.E1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) t11Var.E1.get(i7 - this.h);
                if (document2 instanceof q11) {
                    CharSequence charSequence = ((q11) document2).f48914a;
                    String str = t11Var.A1;
                    z01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Jf, z01Var.f52169f.Z0)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    z01Var.f52165a.setText(charSequence);
                    z01Var.b(false);
                }
            } else if (i7 == this.f45094e) {
                z01Var.a(org.telegram.messenger.id.M0(2131751196, null), false);
            } else if (i13 == 14) {
                z01Var.a(org.telegram.messenger.id.M0(2131744876, null), false);
            } else {
                z01Var.a(org.telegram.messenger.id.M0(2131754756, null), false);
            }
            z01Var.f52167c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) t11Var.D1.get((i7 - this.f45093c) - 1);
            d11 d11Var = (d11) view;
            d11Var.a(h01Var);
            d11Var.h.r0(org.telegram.messenger.hc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.t5.f(document3, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, null), 0L, "tgs", document3, 0);
            d11Var.Q = true;
            d11Var.d = document3;
            d11Var.f44874e = null;
        } else if (i15 == 4) {
            d11 d11Var2 = (d11) view;
            d11Var2.f44873c = i7;
            ImageReceiver imageReceiver = d11Var2.f44876n;
            ArrayList arrayList2 = t11Var.B1;
            if (arrayList2 != null && i7 >= 0 && i7 < arrayList2.size()) {
                o0Var = (ch.o0) t11Var.B1.get(i7);
            } else {
                ArrayList arrayList3 = t11Var.C1;
                if (arrayList3 != null && i7 >= (i11 = this.f45093c) && i7 - i11 < arrayList3.size()) {
                    o0Var = (ch.o0) t11Var.C1.get(i7 - this.f45093c);
                } else {
                    return;
                }
            }
            if (d11Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(d11Var2);
                d11Var2.h = imageReceiver2;
                imageReceiver2.E0(7);
                d11Var2.h.P();
            }
            d11Var2.h.H0(h01Var);
            d11Var2.f44881y = o0Var;
            d11Var2.D = false;
            d11Var2.d(t11Var.J.contains(o0Var), false);
            d11Var2.f44872b = false;
            d11Var2.invalidate();
            if (i13 == 13) {
                d11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f6359f));
            } else if (!o0Var.f6356b && o0Var.f6359f != null) {
                d11Var2.f44878s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(i14).f25840r.get(o0Var.f6359f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.rz f10 = org.telegram.messenger.t5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, null);
                    if (!org.telegram.messenger.sc.e(8200)) {
                        d11Var2.h.r0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", o0Var, 0);
                    } else {
                        ch.o0 o0Var2 = o0Var;
                        d11Var2.h.u0(org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.hc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", o0Var2, 0);
                        o0Var = o0Var2;
                    }
                    org.telegram.messenger.ui.b0(i14);
                    org.telegram.messenger.ui.m1(imageReceiver, org.telegram.messenger.hc.b(tL_availableReaction.around_animation), ch.k0.a());
                } else {
                    d11Var2.h.f();
                    imageReceiver.f();
                }
                d11Var2.f44874e = null;
                d11Var2.d = null;
                d11Var2.setDrawable(null);
                c11 c11Var = d11Var2.J;
                if (c11Var != null) {
                    c11Var.setVisibility(8);
                    d11Var2.J.setImageReceiver(null);
                }
                if (tL_availableReaction == null && o0Var.f6356b) {
                    d11Var2.setDrawable(org.telegram.messenger.i6.g(o0Var.f6359f));
                }
            } else {
                d11Var2.f44878s = false;
                d11Var2.f44874e = new org.telegram.ui.Components.q5(o0Var.f6360g, (Paint.FontMetricsInt) null);
                d11Var2.d = null;
                d11Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) h01Var.f50861k3.get(d11Var2.f44874e.getDocumentId());
                if (h5Var == null) {
                    cacheType2 = t11Var.getCacheType();
                    h5Var = org.telegram.ui.Components.h5.m(i14, d11Var2.f44874e.getDocumentId(), null, cacheType2);
                    h01Var.f50861k3.put(d11Var2.f44874e.getDocumentId(), h5Var);
                }
                d11Var2.setDrawable(h5Var);
            }
            if (!org.telegram.messenger.p10.i(i14).q() && i13 == 14 && o0Var.f6356b && o0Var.d) {
                d11Var2.b();
                d11Var2.J.setVisibility(0);
                d11Var2.setEmojicon(null);
                return;
            }
            if (o0Var.f6358e) {
                d11Var2.setEmojicon(o0Var.f6359f);
            } else {
                d11Var2.setEmojicon(null);
            }
            c11 c11Var2 = d11Var2.J;
            if (c11Var2 != null) {
                c11Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            d11 d11Var3 = (d11) view;
            d11Var3.f44871a = false;
            d11Var3.f44873c = i7;
            d11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            d11Var3.setDrawable(null);
            ArrayList arrayList4 = t11Var.B1;
            if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                ch.o0 o0Var3 = (ch.o0) t11Var.B1.get(i7);
                d11Var3.f44881y = o0Var3;
                long j3 = o0Var3.f6360g;
                if (j3 == 0) {
                    boolean contains2 = t11Var.J.contains(o0Var3);
                    d11Var3.D = true;
                    d11Var3.setDrawable(org.telegram.messenger.i6.g(o0Var3.f6359f));
                    d11Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j3);
                if (i13 == 14 && !org.telegram.messenger.p10.i(i14).q() && o0Var3.f6356b && o0Var3.d) {
                    d11Var3.b();
                    d11Var3.J.setVisibility(0);
                } else {
                    c11 c11Var3 = d11Var3.J;
                    if (c11Var3 != null) {
                        c11Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = t11Var.E1;
                if (arrayList5 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) t11Var.E1.get(i7 - this.h);
                    if (!(document instanceof q11)) {
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
                    d11Var3.f44874e = new org.telegram.ui.Components.q5(document, (Paint.FontMetricsInt) null);
                    d11Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f26966id));
                } else {
                    org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(l10.longValue(), (Paint.FontMetricsInt) null);
                    d11Var3.f44874e = q5Var;
                    d11Var3.d = q5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.h5 h5Var2 = (org.telegram.ui.Components.h5) h01Var.f50861k3.get(d11Var3.f44874e.getDocumentId());
                if (h5Var2 == null) {
                    cacheType = t11Var.getCacheType();
                    h5Var2 = org.telegram.ui.Components.h5.m(i14, d11Var3.f44874e.getDocumentId(), null, cacheType);
                    h01Var.f50861k3.put(d11Var3.f44874e.getDocumentId(), h5Var2);
                }
                d11Var3.setDrawable(h5Var2);
            }
            d11Var3.d(contains, false);
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View d11Var;
        boolean z9;
        t11 t11Var = this.f45098s;
        if (i7 == 6) {
            Context context = t11Var.getContext();
            if (t11Var.W == 6) {
                z9 = true;
            } else {
                z9 = false;
            }
            d11Var = new z01(t11Var, context, z9);
        } else if (i7 == 7) {
            d11Var = new org.telegram.ui.Components.sm(t11Var.getContext(), 24);
            d11Var.setTag("searchbox");
        } else {
            d11Var = new d11(t11Var, t11Var.getContext());
        }
        if (t11.c(t11Var)) {
            d11Var.setScaleX(0.0f);
            d11Var.setScaleY(0.0f);
        }
        return new v4.d1(d11Var);
    }
}
