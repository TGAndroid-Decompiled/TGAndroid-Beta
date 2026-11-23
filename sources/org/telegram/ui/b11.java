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
public final class b11 extends org.telegram.ui.Components.dk0 {
    public int f45878c;
    public int d;
    public int h;
    public final q11 f45883s;
    public int f45879e = -1;
    public int f45880f = -1;
    public int f45881n = 1;
    public final ArrayList f45882r = new ArrayList();

    public b11(q11 q11Var) {
        this.f45883s = q11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59249f;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        q11 q11Var = this.f45883s;
        int i7 = q11Var.f51226a0;
        boolean z11 = q11Var.J;
        ArrayList arrayList = this.f45882r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f45878c = -1;
        boolean z12 = false;
        this.f45881n = 0;
        arrayList.clear();
        ArrayList arrayList2 = q11Var.C1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f45881n;
                this.f45881n = i10 + 1;
                this.f45879e = i10;
                arrayList.add(1);
            }
            this.d = this.f45881n;
            for (int i11 = 0; i11 < q11Var.C1.size(); i11++) {
                this.f45881n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, q11Var.C1.get(i11))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = q11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f45881n;
                this.f45881n = i12 + 1;
                this.f45880f = i12;
                arrayList.add(2);
                this.f45878c = this.f45881n;
                for (int i13 = 0; i13 < q11Var.D1.size(); i13++) {
                    this.f45881n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q11Var.D1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = q11Var.E1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f45881n;
                    this.f45881n = i14 + 1;
                    this.f45880f = i14;
                    arrayList.add(2);
                }
                this.f45878c = this.f45881n;
                for (int i15 = 0; i15 < q11Var.E1.size(); i15++) {
                    this.f45881n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, q11Var.E1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = q11Var.F1;
        if (arrayList5 != null) {
            int i16 = this.f45881n;
            this.h = i16;
            this.f45881n = arrayList5.size() + i16;
        }
        f();
        if (q11Var.A1 && this.f45881n == 0) {
            z12 = true;
        }
        if (q11Var.I1 != z12) {
            q11Var.I1 = z12;
            ValueAnimator valueAnimator = q11Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            q11Var.J1 = ofFloat;
            ofFloat.addUpdateListener(new xz0(q11Var, z12, 1));
            q11Var.J1.addListener(new k01(q11Var, z12, 1));
            q11Var.J1.setInterpolator(org.telegram.ui.Components.kr.h);
            q11Var.J1.setDuration(100L);
            q11Var.J1.start();
            if (z12) {
                q11.D(q11Var.W, q11Var.m0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f45881n;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (i7 == this.f45879e || i7 == this.f45880f) {
            return 6;
        }
        q11 q11Var = this.f45883s;
        if (q11Var.f51226a0 == 14) {
            ArrayList arrayList = q11Var.D1;
            if (arrayList != null && i7 >= (i10 = this.f45878c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f45878c;
            if (i7 > i11 && (i7 - i11) - 1 < q11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = q11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i7 > i12 && (i7 - i12) - 1 < arrayList2.size() && (q11Var.f51226a0 == 13 || ((ch.p0) q11Var.C1.get((i7 - this.d) - 1)).f5471g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i7 - i13 < 0 || i7 - i13 >= q11Var.F1.size()) {
            return 4;
        }
        if (q11Var.F1.get(i7 - this.h) instanceof n11) {
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
        q11 q11Var = this.f45883s;
        HashSet hashSet = q11Var.L;
        int i13 = q11Var.f51226a0;
        int i14 = q11Var.W;
        e01 e01Var = q11Var.f51249j0;
        int i15 = f1Var.f59249f;
        View view = f1Var.f59245a;
        if (i15 == 6) {
            w01 w01Var = (w01) view;
            ArrayList arrayList = q11Var.F1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) q11Var.F1.get(i7 - this.h);
                if (document2 instanceof n11) {
                    CharSequence charSequence = ((n11) document2).f50174a;
                    String str = q11Var.B1;
                    w01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mf, w01Var.f53071f.f51227a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    w01Var.f53067a.setText(charSequence);
                    w01Var.b(false);
                }
            } else if (i7 == this.f45879e) {
                w01Var.a(org.telegram.messenger.gd.N0(2131751184, null), false);
            } else if (i13 == 14) {
                w01Var.a(org.telegram.messenger.gd.N0(2131744635, null), false);
            } else {
                w01Var.a(org.telegram.messenger.gd.N0(2131754755, null), false);
            }
            w01Var.f53069c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) q11Var.E1.get((i7 - this.f45878c) - 1);
            a11 a11Var = (a11) view;
            a11Var.a(e01Var);
            a11Var.h.s0(org.telegram.messenger.fc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.u5.f(document3, org.telegram.ui.ActionBar.n6.f29616m6, 0.2f, null), 0L, "tgs", document3, 0);
            a11Var.R = true;
            a11Var.d = document3;
            a11Var.f45549e = null;
        } else if (i15 == 4) {
            a11 a11Var2 = (a11) view;
            a11Var2.f45548c = i7;
            ImageReceiver imageReceiver = a11Var2.f45551n;
            ArrayList arrayList2 = q11Var.C1;
            if (arrayList2 != null && i7 >= 0 && i7 < arrayList2.size()) {
                p0Var = (ch.p0) q11Var.C1.get(i7);
            } else {
                ArrayList arrayList3 = q11Var.D1;
                if (arrayList3 != null && i7 >= (i11 = this.f45878c) && i7 - i11 < arrayList3.size()) {
                    p0Var = (ch.p0) q11Var.D1.get(i7 - this.f45878c);
                } else {
                    return;
                }
            }
            if (a11Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(a11Var2);
                a11Var2.h = imageReceiver2;
                imageReceiver2.F0(7);
                a11Var2.h.Q();
            }
            a11Var2.h.I0(e01Var);
            a11Var2.f45556y = p0Var;
            a11Var2.E = false;
            a11Var2.d(q11Var.K.contains(p0Var), false);
            a11Var2.f45547b = false;
            a11Var2.invalidate();
            if (i13 == 13) {
                a11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f5470f));
            } else if (!p0Var.f5467b && p0Var.f5470f != null) {
                a11Var2.f45553s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i14).f26734r.get(p0Var.f5470f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.kz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.n6.f29616m6, 0.2f, null);
                    if (!org.telegram.messenger.pc.e(8200)) {
                        a11Var2.h.s0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    } else {
                        ch.p0 p0Var2 = p0Var;
                        a11Var2.h.v0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    org.telegram.messenger.ri.d0(i14);
                    org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    a11Var2.h.f();
                    imageReceiver.f();
                }
                a11Var2.f45549e = null;
                a11Var2.d = null;
                a11Var2.setDrawable(null);
                z01 z01Var = a11Var2.K;
                if (z01Var != null) {
                    z01Var.setVisibility(8);
                    a11Var2.K.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f5467b) {
                    a11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f5470f));
                }
            } else {
                a11Var2.f45553s = false;
                a11Var2.f45549e = new org.telegram.ui.Components.x5(p0Var.f5471g, (Paint.FontMetricsInt) null);
                a11Var2.d = null;
                a11Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) e01Var.f52203l3.get(a11Var2.f45549e.getDocumentId());
                if (o5Var == null) {
                    cacheType2 = q11Var.getCacheType();
                    o5Var = org.telegram.ui.Components.o5.m(i14, a11Var2.f45549e.getDocumentId(), null, cacheType2);
                    e01Var.f52203l3.put(a11Var2.f45549e.getDocumentId(), o5Var);
                }
                a11Var2.setDrawable(o5Var);
            }
            if (!org.telegram.messenger.i10.i(i14).q() && i13 == 14 && p0Var.f5467b && p0Var.d) {
                a11Var2.b();
                a11Var2.K.setVisibility(0);
                a11Var2.setEmojicon(null);
                return;
            }
            if (p0Var.f5469e) {
                a11Var2.setEmojicon(p0Var.f5470f);
            } else {
                a11Var2.setEmojicon(null);
            }
            z01 z01Var2 = a11Var2.K;
            if (z01Var2 != null) {
                z01Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            a11 a11Var3 = (a11) view;
            a11Var3.f45546a = false;
            a11Var3.f45548c = i7;
            a11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            a11Var3.setDrawable(null);
            ArrayList arrayList4 = q11Var.C1;
            if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                ch.p0 p0Var3 = (ch.p0) q11Var.C1.get(i7);
                a11Var3.f45556y = p0Var3;
                long j3 = p0Var3.f5471g;
                if (j3 == 0) {
                    boolean contains2 = q11Var.K.contains(p0Var3);
                    a11Var3.E = true;
                    a11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var3.f5470f));
                    a11Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j3);
                if (i13 == 14 && !org.telegram.messenger.i10.i(i14).q() && p0Var3.f5467b && p0Var3.d) {
                    a11Var3.b();
                    a11Var3.K.setVisibility(0);
                } else {
                    z01 z01Var3 = a11Var3.K;
                    if (z01Var3 != null) {
                        z01Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = q11Var.F1;
                if (arrayList5 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) q11Var.F1.get(i7 - this.h);
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
                    a11Var3.f45549e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                    a11Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f28498id));
                } else {
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l10.longValue(), (Paint.FontMetricsInt) null);
                    a11Var3.f45549e = x5Var;
                    a11Var3.d = x5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) e01Var.f52203l3.get(a11Var3.f45549e.getDocumentId());
                if (o5Var2 == null) {
                    cacheType = q11Var.getCacheType();
                    o5Var2 = org.telegram.ui.Components.o5.m(i14, a11Var3.f45549e.getDocumentId(), null, cacheType);
                    e01Var.f52203l3.put(a11Var3.f45549e.getDocumentId(), o5Var2);
                }
                a11Var3.setDrawable(o5Var2);
            }
            a11Var3.d(contains, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View a11Var;
        boolean z10;
        q11 q11Var = this.f45883s;
        if (i7 == 6) {
            Context context = q11Var.getContext();
            if (q11Var.f51226a0 == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            a11Var = new w01(q11Var, context, z10);
        } else if (i7 == 7) {
            a11Var = new org.telegram.ui.Components.in(q11Var.getContext(), 24);
            a11Var.setTag("searchbox");
        } else {
            a11Var = new a11(q11Var, q11Var.getContext());
        }
        if (q11.c(q11Var)) {
            a11Var.setScaleX(0.0f);
            a11Var.setScaleY(0.0f);
        }
        return new v4.f1(a11Var);
    }
}
