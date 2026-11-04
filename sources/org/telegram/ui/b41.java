package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.ui.Components.RadialProgressView;
public abstract class b41 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Window f43917a;
    public final mg.g f43918b;
    public final mg.g f43919c;
    public final og.c d;
    public final RadialProgressView f43920e;
    public final TextView f43921f;
    public final yg0 h;
    public final ArrayList f43922n;
    public d41 f43923r;
    public final int f43924s;

    public b41(Context context, int i3, mg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f43922n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f43917a = ((Activity) context).getWindow();
        } else {
            this.f43917a = null;
        }
        this.f43924s = i3;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new yg0(context, 10);
        og.c cVar = new og.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final b41 f51827b;

            {
                this.f51827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51827b.h(true);
                        return;
                    case 1:
                        this.f51827b.c();
                        return;
                    default:
                        this.f51827b.f43919c.c(false);
                        return;
                }
            }
        });
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            this.f43918b = new mg.g(getContext(), null);
                            mg.g gVar = new mg.g(getContext(), null);
                            this.f43919c = gVar;
                            gVar.f19362u0.E = true;
                        } else {
                            this.f43918b = new mg.g(getContext(), null);
                            mg.g gVar2 = new mg.g(getContext(), null);
                            this.f43919c = gVar2;
                            gVar2.f19362u0.E = true;
                        }
                    } else {
                        mg.q qVar = new mg.q(getContext());
                        this.f43918b = qVar;
                        qVar.f19362u0.F = true;
                        ?? qVar2 = new mg.q(getContext());
                        qVar2.N1 = -1;
                        qVar2.O1 = new RectF();
                        qVar2.Q1 = org.telegram.messenger.g0.L(9.0f);
                        qVar2.R1 = org.telegram.messenger.g0.L(13.0f);
                        qVar2.S1 = new String[101];
                        qVar2.U1 = 1.0f;
                        qVar2.V1 = 0;
                        qVar2.W1 = -1;
                        qVar2.X1 = -1;
                        for (int i10 = 1; i10 <= 100; i10++) {
                            qVar2.S1[i10] = com.google.android.recaptcha.internal.a.h(i10, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.P1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f19347i1 = true;
                        this.f43919c = qVar2;
                    }
                } else {
                    mg.g gVar3 = new mg.g(getContext(), null);
                    gVar3.f19367x0 = true;
                    gVar3.f19369y0 = true;
                    this.f43918b = gVar3;
                    mg.g gVar4 = new mg.g(getContext(), null);
                    this.f43919c = gVar4;
                    gVar4.f19362u0.E = true;
                }
            } else {
                this.f43918b = new mg.p(getContext(), e6Var);
                mg.p pVar = new mg.p(getContext(), e6Var);
                this.f43919c = pVar;
                pVar.f19362u0.E = true;
            }
        } else {
            this.f43918b = new mg.g(getContext(), e6Var);
            mg.g gVar5 = new mg.g(getContext(), e6Var);
            this.f43919c = gVar5;
            gVar5.f19362u0.E = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f43918b.f19325a = fVar;
        this.f43919c.f19325a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f43920e = radialProgressView;
        frameLayout.addView(this.f43918b);
        frameLayout.addView(this.f43918b.f19362u0, -2, -2);
        frameLayout.addView(this.f43919c);
        frameLayout.addView(this.f43919c.f19362u0, -2, -2);
        frameLayout.addView(radialProgressView, b8.mf.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f43921f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28158s5, e6Var);
        this.f43918b.setDateSelectionListener(new ci0(this, 18));
        this.f43918b.f19362u0.d(false, false);
        this.f43918b.f19362u0.setOnTouchListener(new Object());
        this.f43918b.f19362u0.setOnClickListener(new View.OnClickListener(this) {
            public final b41 f51827b;

            {
                this.f51827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51827b.h(true);
                        return;
                    case 1:
                        this.f51827b.c();
                        return;
                    default:
                        this.f51827b.f43919c.c(false);
                        return;
                }
            }
        });
        this.f43919c.f19362u0.setOnClickListener(new View.OnClickListener(this) {
            public final b41 f51827b;

            {
                this.f51827b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f51827b.h(true);
                        return;
                    case 1:
                        this.f51827b.c();
                        return;
                    default:
                        this.f51827b.f43919c.c(false);
                        return;
                }
            }
        });
        this.f43918b.setVisibility(0);
        this.f43919c.setVisibility(4);
        this.f43918b.setHeader(this.d);
        f10.addView(this.d, b8.mf.c(52.0f, -1));
        f10.addView(frameLayout, b8.mf.c(-2.0f, -1));
        f10.addView(this.h, b8.mf.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f43924s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f10;
        Window window = this.f43917a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        mg.g gVar = this.f43918b;
        gVar.K = false;
        mg.g gVar2 = this.f43919c;
        gVar2.K = false;
        gVar.f19370z0 = 2;
        gVar2.f19370z0 = 1;
        final ?? obj = new Object();
        mg.j jVar = gVar.f19344h0;
        obj.f21103b = jVar.f19386l;
        obj.f21102a = jVar.f19385k;
        int binarySearch = Arrays.binarySearch(this.f43923r.d.f20373a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f43923r.d.f20373a.length - 1;
        }
        obj.f21104c = this.f43923r.d.f20374b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.A0 = obj;
        gVar.A0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i3 = 0; i3 < this.f43923r.d.d.size(); i3++) {
            if (((ng.a) this.f43923r.d.d.get(i3)).f20366a[binarySearch] > j11) {
                j11 = ((ng.a) this.f43923r.d.d.get(i3)).f20366a[binarySearch];
            }
            if (((ng.a) this.f43923r.d.d.get(i3)).f20366a[binarySearch] < j12) {
                j12 = ((ng.a) this.f43923r.d.d.get(i3)).f20366a[binarySearch];
            }
        }
        float f11 = ((float) j12) + ((float) (j11 - j12));
        float f12 = gVar.f19366x;
        final float f13 = (f11 - f12) / (gVar.f19364w - f12);
        gVar.q(obj);
        gVar2.q(obj);
        float f14 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f14 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f14);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                b41 b41Var = b41.this;
                mg.g gVar3 = b41Var.f43918b;
                float f15 = gVar3.G0;
                mg.j jVar2 = gVar3.f19344h0;
                float f16 = jVar2.f19386l;
                float f17 = jVar2.f19385k;
                float f18 = ((f15 / (f16 - f17)) * f17) - mg.g.f19311l1;
                RectF rectF = gVar3.I0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                og.j jVar3 = obj;
                jVar3.f21105e = height;
                jVar3.d = (gVar3.H0 * jVar3.f21104c) - f18;
                jVar3.f21106f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mg.g gVar4 = b41Var.f43919c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new w1.a());
        return ofFloat;
    }

    public abstract void b(d41 d41Var);

    public abstract void c();

    public final void d() {
        ng.b bVar;
        ArrayList arrayList;
        int i3;
        mg.g gVar = this.f43918b;
        gVar.G();
        gVar.invalidate();
        mg.g gVar2 = this.f43919c;
        gVar2.G();
        gVar2.invalidate();
        og.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        d41 d41Var = this.f43923r;
        if (d41Var != null && (bVar = d41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f43923r.d.d.size(); i10++) {
                if (((ng.a) this.f43923r.d.d.get(i10)).f20371g >= 0 && org.telegram.ui.ActionBar.k6.f1(((ng.a) this.f43923r.d.d.get(i10)).f20371g)) {
                    i3 = org.telegram.ui.ActionBar.k6.x0(null, ((ng.a) this.f43923r.d.d.get(i10)).f20371g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)) < 0.5d) {
                    i3 = ((ng.a) this.f43923r.d.d.get(i10)).f20372i;
                } else {
                    i3 = ((ng.a) this.f43923r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f43922n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.hz hzVar = ((a41) arrayList2.get(i10)).f43593a;
                    hzVar.getClass();
                    hzVar.f34545r = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false);
                    hzVar.f34547w = -1;
                    hzVar.f34546s = i3;
                    hzVar.invalidate();
                }
            }
        }
        this.f43920e.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27955h6, false));
        this.f43921f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28158s5, false));
    }

    public final void e(d41 d41Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (d41Var != null) {
            String str = d41Var.f44545j;
            og.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            mg.g gVar = this.f43918b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            mg.j jVar = gVar.f19344h0;
            mg.g gVar2 = this.f43919c;
            gVar2.setLandscape(z11);
            this.f43923r = d41Var;
            boolean z13 = d41Var.f44547l;
            ArrayList arrayList2 = this.f43922n;
            yg0 yg0Var = this.h;
            RadialProgressView radialProgressView = this.f43920e;
            TextView textView = this.f43921f;
            if (!z13 && !d41Var.f44538a) {
                textView.setVisibility(8);
                og.e eVar = gVar.f19362u0;
                boolean z14 = d41Var.f44549n;
                eVar.f21074a = z14;
                cVar.c(!z14);
                if (d41Var.d == null && d41Var.f44542f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(d41Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(d41Var.d) && d41Var.h) {
                    jVar.f19385k = 0.0f;
                    jVar.f19386l = 1.0f;
                    jVar.f19377a.A(true, false, false);
                }
                cVar.setUseWeekInterval(d41Var.f44550o);
                gVar.f19362u0.setUseWeek(d41Var.f44550o);
                og.e eVar2 = gVar.f19362u0;
                if (this.f43923r.f44543g == null && this.f43924s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.G = z12;
                gVar2.f19362u0.G = false;
                eVar2.setEnabled(eVar2.G);
                og.e eVar3 = gVar2.f19362u0;
                eVar3.setEnabled(eVar3.G);
                int size = arrayList.size();
                yg0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i3 = 0; i3 < size; i3++) {
                        og.f fVar = (og.f) arrayList.get(i3);
                        a41 a41Var = new a41(this, i3);
                        a41Var.f43594b = fVar;
                        String str2 = fVar.f21085a.d;
                        org.telegram.ui.Components.hz hzVar = a41Var.f43593a;
                        hzVar.setText(str2);
                        hzVar.a(fVar.f21096n, false);
                        hzVar.setOnTouchListener(new Object());
                        hzVar.setOnClickListener(new hb0(19, a41Var, fVar));
                        hzVar.setOnLongClickListener(new ei.j2(7, a41Var, fVar));
                    }
                }
                long j10 = this.f43923r.f44540c;
                if (j10 > 0) {
                    gVar.f19361t0 = Arrays.binarySearch(gVar.f19346i0.f20373a, j10);
                    gVar.f19363v0 = true;
                    gVar.f19362u0.setVisibility(0);
                    gVar.f19365w0 = 1.0f;
                    gVar.x((gVar.H0 * jVar.f19385k) - mg.g.f19311l1);
                    try {
                        gVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    gVar.invalidate();
                }
                d();
                if (z10) {
                    gVar.f19370z0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.A0 = obj;
                    obj.f21106f = 0.0f;
                    ofFloat.addUpdateListener(new xy0(this, 8));
                    ofFloat.addListener(new z31(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = d41Var.f44539b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            yg0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f10;
        mg.g gVar = this.f43918b;
        long selectedDate = gVar.getSelectedDate();
        ng.b bVar = this.f43923r.f44541e;
        mg.g gVar2 = this.f43919c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f43923r.d.d.size() > 1) {
            int i3 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f43923r.d.d.size();
                arrayList = this.f43922n;
                if (i3 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((ng.a) bVar.d.get(i11)).f20368c.equals(((ng.a) this.f43923r.d.d.get(i3)).f20368c)) {
                            boolean z12 = ((a41) arrayList.get(i3)).f43593a.f34540b;
                            ((og.f) arrayList2.get(i11)).f21096n = z12;
                            og.f fVar = (og.f) arrayList2.get(i11);
                            if (z12) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f21097o = f10;
                            ((a41) arrayList.get(i3)).f43593a.f34541c = true;
                            ((a41) arrayList.get(i3)).f43593a.animate().alpha(1.0f).start();
                            if (z12) {
                                i10++;
                            }
                            z11 = true;
                        } else {
                            i11++;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    ((a41) arrayList.get(i3)).f43593a.f34541c = false;
                    ((a41) arrayList.get(i3)).f43593a.animate().alpha(0.0f).start();
                }
                i3++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f43923r.d.d.size(); i12++) {
                    ((a41) arrayList.get(i12)).f43593a.f34541c = true;
                    ((a41) arrayList.get(i12)).f43593a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f43923r.f44540c = selectedDate;
        gVar.f19362u0.setAlpha(0.0f);
        gVar.f19365w0 = 0.0f;
        gVar.f19363v0 = false;
        gVar.f19349j1 = false;
        gVar2.G();
        og.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f19370z0 = 0;
            gVar2.f19370z0 = 0;
            gVar.K = false;
            gVar2.K = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new z31(this, 0));
        a10.start();
    }

    public final void h(boolean z10) {
        ng.b bVar;
        d41 d41Var = this.f43923r;
        if (d41Var != null && (bVar = d41Var.d) != null && bVar.f20373a != null) {
            og.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f21061a;
            mg.g gVar = this.f43918b;
            cVar.b(gVar.getStartDate(), gVar.getEndDate());
            if (z10) {
                textView2.setAlpha(0.0f);
                textView2.setScaleX(0.3f);
                textView2.setScaleY(0.3f);
                textView2.setPivotX(0.0f);
                textView2.setPivotY(0.0f);
                textView2.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(200L).start();
                textView.setAlpha(1.0f);
                textView.setTranslationX(0.0f);
                textView.setTranslationY(0.0f);
                textView.setScaleX(1.0f);
                textView.setScaleY(1.0f);
                textView.setPivotY(org.telegram.messenger.g0.L(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            gVar.f19362u0.f21078f.setAlpha(1.0f);
            mg.g gVar2 = this.f43919c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f43923r.f44540c = 0L;
            int i3 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f43922n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.K = true;
                gVar2.K = false;
                gVar.invalidate();
                Window window = this.f43917a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    a41 a41Var = (a41) obj;
                    a41Var.f43593a.setAlpha(1.0f);
                    a41Var.f43593a.f34541c = true;
                }
                return;
            }
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new z31(this, 1));
            int size2 = arrayList.size();
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                a41 a41Var2 = (a41) obj2;
                a41Var2.f43593a.animate().alpha(1.0f).start();
                a41Var2.f43593a.f34541c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f43918b != null && this.f43919c != null && this.d != null && this.f43920e != null && this.f43921f != null) {
                d();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
