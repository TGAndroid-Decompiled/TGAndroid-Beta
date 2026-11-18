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
public final class c11 extends org.telegram.ui.Components.bk0 {
    public int f46354c;
    public int d;
    public int h;
    public final r11 f46359s;
    public int f46355e = -1;
    public int f46356f = -1;
    public int f46357n = 1;
    public final ArrayList f46358r = new ArrayList();

    public c11(r11 r11Var) {
        this.f46359s = r11Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 != 3 && i7 != 4) {
            return false;
        }
        return true;
    }

    public final void E(boolean z10) {
        r11 r11Var = this.f46359s;
        int i7 = r11Var.f51377a0;
        boolean z11 = r11Var.J;
        ArrayList arrayList = this.f46358r;
        new ArrayList(arrayList);
        this.h = -1;
        this.f46354c = -1;
        boolean z12 = false;
        this.f46357n = 0;
        arrayList.clear();
        ArrayList arrayList2 = r11Var.C1;
        if (arrayList2 != null) {
            if (i7 == 4 && !arrayList2.isEmpty()) {
                int i10 = this.f46357n;
                this.f46357n = i10 + 1;
                this.f46355e = i10;
                arrayList.add(1);
            }
            this.d = this.f46357n;
            for (int i11 = 0; i11 < r11Var.C1.size(); i11++) {
                this.f46357n++;
                arrayList.add(Integer.valueOf(Objects.hash(-4342, r11Var.C1.get(i11))));
            }
        }
        if (i7 == 14) {
            ArrayList arrayList3 = r11Var.D1;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int i12 = this.f46357n;
                this.f46357n = i12 + 1;
                this.f46356f = i12;
                arrayList.add(2);
                this.f46354c = this.f46357n;
                for (int i13 = 0; i13 < r11Var.D1.size(); i13++) {
                    this.f46357n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r11Var.D1.get(i13))));
                }
            }
        } else {
            ArrayList arrayList4 = r11Var.E1;
            if (arrayList4 != null) {
                if (i7 == 4 && !arrayList4.isEmpty()) {
                    int i14 = this.f46357n;
                    this.f46357n = i14 + 1;
                    this.f46356f = i14;
                    arrayList.add(2);
                }
                this.f46354c = this.f46357n;
                for (int i15 = 0; i15 < r11Var.E1.size(); i15++) {
                    this.f46357n++;
                    arrayList.add(Integer.valueOf(Objects.hash(-7453, r11Var.E1.get(i15))));
                }
            }
        }
        ArrayList arrayList5 = r11Var.F1;
        if (arrayList5 != null) {
            int i16 = this.f46357n;
            this.h = i16;
            this.f46357n = arrayList5.size() + i16;
        }
        f();
        if (r11Var.A1 && this.f46357n == 0) {
            z12 = true;
        }
        if (r11Var.I1 != z12) {
            r11Var.I1 = z12;
            ValueAnimator valueAnimator = r11Var.J1;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            r11Var.J1 = ofFloat;
            ofFloat.addUpdateListener(new yz0(r11Var, z12, 1));
            r11Var.J1.addListener(new l01(r11Var, z12, 1));
            r11Var.J1.setInterpolator(org.telegram.ui.Components.lr.h);
            r11Var.J1.setDuration(100L);
            r11Var.J1.start();
            if (z12) {
                r11.D(r11Var.W, r11Var.m0);
            }
        }
    }

    @Override
    public final int b() {
        return this.f46357n;
    }

    @Override
    public final int d(int i7) {
        int i10;
        if (i7 == this.f46355e || i7 == this.f46356f) {
            return 6;
        }
        r11 r11Var = this.f46359s;
        if (r11Var.f51377a0 == 14) {
            ArrayList arrayList = r11Var.D1;
            if (arrayList != null && i7 >= (i10 = this.f46354c) && i7 - i10 < arrayList.size()) {
                return 4;
            }
        } else {
            int i11 = this.f46354c;
            if (i7 > i11 && (i7 - i11) - 1 < r11Var.E1.size()) {
                return 5;
            }
        }
        ArrayList arrayList2 = r11Var.C1;
        if (arrayList2 == null) {
            return 3;
        }
        int i12 = this.d;
        if (i7 > i12 && (i7 - i12) - 1 < arrayList2.size() && (r11Var.f51377a0 == 13 || ((ch.p0) r11Var.C1.get((i7 - this.d) - 1)).f5476g != 0)) {
            return 3;
        }
        int i13 = this.h;
        if (i7 - i13 < 0 || i7 - i13 >= r11Var.F1.size()) {
            return 4;
        }
        if (r11Var.F1.get(i7 - this.h) instanceof o11) {
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
        r11 r11Var = this.f46359s;
        HashSet hashSet = r11Var.L;
        int i13 = r11Var.f51377a0;
        int i14 = r11Var.W;
        f01 f01Var = r11Var.f51400j0;
        int i15 = f1Var.f59127f;
        View view = f1Var.f59123a;
        if (i15 == 6) {
            x01 x01Var = (x01) view;
            ArrayList arrayList = r11Var.F1;
            if (arrayList != null && (i12 = i7 - this.h) >= 0 && i12 < arrayList.size()) {
                TLRPC.Document document2 = (TLRPC.Document) r11Var.F1.get(i7 - this.h);
                if (document2 instanceof o11) {
                    CharSequence charSequence = ((o11) document2).f50382a;
                    String str = r11Var.B1;
                    x01Var.getClass();
                    if (charSequence != null && str != null && (indexOf = charSequence.toString().toLowerCase().indexOf(str.toLowerCase())) >= 0) {
                        SpannableString spannableString = new SpannableString(charSequence);
                        spannableString.setSpan(new ForegroundColorSpan(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Mf, x01Var.f53534f.f51378a1)), indexOf, str.length() + indexOf, 33);
                        charSequence = spannableString;
                    }
                    x01Var.f53530a.setText(charSequence);
                    x01Var.b(false);
                }
            } else if (i7 == this.f46355e) {
                x01Var.a(org.telegram.messenger.gd.M0(2131751185, null), false);
            } else if (i13 == 14) {
                x01Var.a(org.telegram.messenger.gd.M0(2131744641, null), false);
            } else {
                x01Var.a(org.telegram.messenger.gd.M0(2131754756, null), false);
            }
            x01Var.f53532c.setVisibility(8);
        } else if (i15 == 5) {
            TLRPC.Document document3 = (TLRPC.Document) r11Var.E1.get((i7 - this.f46354c) - 1);
            b11 b11Var = (b11) view;
            b11Var.a(f01Var);
            b11Var.h.r0(org.telegram.messenger.fc.b(document3), "100_100_firstframe", null, null, org.telegram.messenger.u5.f(document3, org.telegram.ui.ActionBar.n6.f29559m6, 0.2f, null), 0L, "tgs", document3, 0);
            b11Var.R = true;
            b11Var.d = document3;
            b11Var.f45714e = null;
        } else if (i15 == 4) {
            b11 b11Var2 = (b11) view;
            b11Var2.f45713c = i7;
            ImageReceiver imageReceiver = b11Var2.f45716n;
            ArrayList arrayList2 = r11Var.C1;
            if (arrayList2 != null && i7 >= 0 && i7 < arrayList2.size()) {
                p0Var = (ch.p0) r11Var.C1.get(i7);
            } else {
                ArrayList arrayList3 = r11Var.D1;
                if (arrayList3 != null && i7 >= (i11 = this.f46354c) && i7 - i11 < arrayList3.size()) {
                    p0Var = (ch.p0) r11Var.D1.get(i7 - this.f46354c);
                } else {
                    return;
                }
            }
            if (b11Var2.h == null) {
                ImageReceiver imageReceiver2 = new ImageReceiver(b11Var2);
                b11Var2.h = imageReceiver2;
                imageReceiver2.E0(7);
                b11Var2.h.P();
            }
            b11Var2.h.H0(f01Var);
            b11Var2.f45721y = p0Var;
            b11Var2.E = false;
            b11Var2.d(r11Var.K.contains(p0Var), false);
            b11Var2.f45712b = false;
            b11Var2.invalidate();
            if (i13 == 13) {
                b11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f5475f));
            } else if (!p0Var.f5472b && p0Var.f5475f != null) {
                b11Var2.f45718s = true;
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ri.d0(i14).f26633r.get(p0Var.f5475f);
                if (tL_availableReaction != null) {
                    org.telegram.messenger.lz f10 = org.telegram.messenger.u5.f(tL_availableReaction.activate_animation, org.telegram.ui.ActionBar.n6.f29559m6, 0.2f, null);
                    if (!org.telegram.messenger.pc.e(8200)) {
                        b11Var2.h.r0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_firstframe", null, null, f10, 0L, "tgs", p0Var, 0);
                    } else {
                        ch.p0 p0Var2 = p0Var;
                        b11Var2.h.u0(org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "60_60_pcache", org.telegram.messenger.fc.b(tL_availableReaction.select_animation), "30_30_firstframe", null, null, f10, 0L, "tgs", p0Var2, 0);
                        p0Var = p0Var2;
                    }
                    org.telegram.messenger.ri.d0(i14);
                    org.telegram.messenger.ri.p1(imageReceiver, org.telegram.messenger.fc.b(tL_availableReaction.around_animation), ch.l0.a());
                } else {
                    b11Var2.h.f();
                    imageReceiver.f();
                }
                b11Var2.f45714e = null;
                b11Var2.d = null;
                b11Var2.setDrawable(null);
                a11 a11Var = b11Var2.K;
                if (a11Var != null) {
                    a11Var.setVisibility(8);
                    b11Var2.K.setImageReceiver(null);
                }
                if (tL_availableReaction == null && p0Var.f5472b) {
                    b11Var2.setDrawable(org.telegram.messenger.j6.g(p0Var.f5475f));
                }
            } else {
                b11Var2.f45718s = false;
                b11Var2.f45714e = new org.telegram.ui.Components.x5(p0Var.f5476g, (Paint.FontMetricsInt) null);
                b11Var2.d = null;
                b11Var2.h.f();
                imageReceiver.f();
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) f01Var.f52404l3.get(b11Var2.f45714e.getDocumentId());
                if (o5Var == null) {
                    cacheType2 = r11Var.getCacheType();
                    o5Var = org.telegram.ui.Components.o5.m(i14, b11Var2.f45714e.getDocumentId(), null, cacheType2);
                    f01Var.f52404l3.put(b11Var2.f45714e.getDocumentId(), o5Var);
                }
                b11Var2.setDrawable(o5Var);
            }
            if (!org.telegram.messenger.j10.i(i14).q() && i13 == 14 && p0Var.f5472b && p0Var.d) {
                b11Var2.b();
                b11Var2.K.setVisibility(0);
                b11Var2.setEmojicon(null);
                return;
            }
            if (p0Var.f5474e) {
                b11Var2.setEmojicon(p0Var.f5475f);
            } else {
                b11Var2.setEmojicon(null);
            }
            a11 a11Var2 = b11Var2.K;
            if (a11Var2 != null) {
                a11Var2.setVisibility(4);
            }
        } else if (i15 == 3) {
            b11 b11Var3 = (b11) view;
            b11Var3.f45711a = false;
            b11Var3.f45713c = i7;
            b11Var3.setPadding(org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f));
            b11Var3.setDrawable(null);
            ArrayList arrayList4 = r11Var.C1;
            if (arrayList4 != null && i7 >= 0 && i7 < arrayList4.size()) {
                ch.p0 p0Var3 = (ch.p0) r11Var.C1.get(i7);
                b11Var3.f45721y = p0Var3;
                long j3 = p0Var3.f5476g;
                if (j3 == 0) {
                    boolean contains2 = r11Var.K.contains(p0Var3);
                    b11Var3.E = true;
                    b11Var3.setDrawable(org.telegram.messenger.j6.g(p0Var3.f5475f));
                    b11Var3.d(contains2, false);
                    return;
                }
                l10 = Long.valueOf(j3);
                if (i13 == 14 && !org.telegram.messenger.j10.i(i14).q() && p0Var3.f5472b && p0Var3.d) {
                    b11Var3.b();
                    b11Var3.K.setVisibility(0);
                } else {
                    a11 a11Var3 = b11Var3.K;
                    if (a11Var3 != null) {
                        a11Var3.setVisibility(4);
                    }
                }
                document = null;
            } else {
                ArrayList arrayList5 = r11Var.F1;
                if (arrayList5 != null && (i10 = i7 - this.h) >= 0 && i10 < arrayList5.size()) {
                    document = (TLRPC.Document) r11Var.F1.get(i7 - this.h);
                    if (!(document instanceof o11)) {
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
                    b11Var3.f45714e = new org.telegram.ui.Components.x5(document, (Paint.FontMetricsInt) null);
                    b11Var3.d = document;
                    contains = hashSet.contains(Long.valueOf(document.f28409id));
                } else {
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(l10.longValue(), (Paint.FontMetricsInt) null);
                    b11Var3.f45714e = x5Var;
                    b11Var3.d = x5Var.document;
                    contains = hashSet.contains(l10);
                }
                org.telegram.ui.Components.o5 o5Var2 = (org.telegram.ui.Components.o5) f01Var.f52404l3.get(b11Var3.f45714e.getDocumentId());
                if (o5Var2 == null) {
                    cacheType = r11Var.getCacheType();
                    o5Var2 = org.telegram.ui.Components.o5.m(i14, b11Var3.f45714e.getDocumentId(), null, cacheType);
                    f01Var.f52404l3.put(b11Var3.f45714e.getDocumentId(), o5Var2);
                }
                b11Var3.setDrawable(o5Var2);
            }
            b11Var3.d(contains, false);
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View b11Var;
        boolean z10;
        r11 r11Var = this.f46359s;
        if (i7 == 6) {
            Context context = r11Var.getContext();
            if (r11Var.f51377a0 == 6) {
                z10 = true;
            } else {
                z10 = false;
            }
            b11Var = new x01(r11Var, context, z10);
        } else if (i7 == 7) {
            b11Var = new org.telegram.ui.Components.jn(r11Var.getContext(), 24);
            b11Var.setTag("searchbox");
        } else {
            b11Var = new b11(r11Var, r11Var.getContext());
        }
        if (r11.c(r11Var)) {
            b11Var.setScaleX(0.0f);
            b11Var.setScaleY(0.0f);
        }
        return new v4.f1(b11Var);
    }
}
