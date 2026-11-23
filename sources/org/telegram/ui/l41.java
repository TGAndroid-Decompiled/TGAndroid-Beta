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
public abstract class l41 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Window f49584a;
    public final lg.g f49585b;
    public final lg.g f49586c;
    public final ng.c d;
    public final RadialProgressView f49587e;
    public final TextView f49588f;
    public final gh0 h;
    public final ArrayList f49589n;
    public n41 f49590r;
    public final int f49591s;

    public l41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f49589n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f49584a = ((Activity) context).getWindow();
        } else {
            this.f49584a = null;
        }
        this.f49591s = i7;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        this.h = new gh0(context, 10);
        ng.c cVar = new ng.c(getContext(), i6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final l41 f48427b;

            {
                this.f48427b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48427b.h(true);
                        return;
                    case 1:
                        this.f48427b.c();
                        return;
                    default:
                        this.f48427b.f49586c.c(false);
                        return;
                }
            }
        });
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            this.f49585b = new lg.g(getContext(), null);
                            lg.g gVar = new lg.g(getContext(), null);
                            this.f49586c = gVar;
                            gVar.f19917u0.E = true;
                        } else {
                            this.f49585b = new lg.g(getContext(), null);
                            lg.g gVar2 = new lg.g(getContext(), null);
                            this.f49586c = gVar2;
                            gVar2.f19917u0.E = true;
                        }
                    } else {
                        lg.q qVar = new lg.q(getContext());
                        this.f49585b = qVar;
                        qVar.f19917u0.F = true;
                        ?? qVar2 = new lg.q(getContext());
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
                            qVar2.S1[i10] = com.google.android.gms.internal.vision.e2.i(i10, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.P1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f19901i1 = true;
                        this.f49586c = qVar2;
                    }
                } else {
                    lg.g gVar3 = new lg.g(getContext(), null);
                    gVar3.f19922x0 = true;
                    gVar3.f19924y0 = true;
                    this.f49585b = gVar3;
                    lg.g gVar4 = new lg.g(getContext(), null);
                    this.f49586c = gVar4;
                    gVar4.f19917u0.E = true;
                }
            } else {
                this.f49585b = new lg.p(getContext(), i6Var);
                lg.p pVar = new lg.p(getContext(), i6Var);
                this.f49586c = pVar;
                pVar.f19917u0.E = true;
            }
        } else {
            this.f49585b = new lg.g(getContext(), i6Var);
            lg.g gVar5 = new lg.g(getContext(), i6Var);
            this.f49586c = gVar5;
            gVar5.f19917u0.E = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49585b.f19879a = fVar;
        this.f49586c.f19879a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f49587e = radialProgressView;
        frameLayout.addView(this.f49585b);
        frameLayout.addView(this.f49585b.f19917u0, -2, -2);
        frameLayout.addView(this.f49586c);
        frameLayout.addView(this.f49586c.f19917u0, -2, -2);
        frameLayout.addView(radialProgressView, c8.na.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f49588f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.s5, i6Var);
        this.f49585b.setDateSelectionListener(new oi0(this, 17));
        this.f49585b.f19917u0.d(false, false);
        this.f49585b.f19917u0.setOnTouchListener(new Object());
        this.f49585b.f19917u0.setOnClickListener(new View.OnClickListener(this) {
            public final l41 f48427b;

            {
                this.f48427b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48427b.h(true);
                        return;
                    case 1:
                        this.f48427b.c();
                        return;
                    default:
                        this.f48427b.f49586c.c(false);
                        return;
                }
            }
        });
        this.f49586c.f19917u0.setOnClickListener(new View.OnClickListener(this) {
            public final l41 f48427b;

            {
                this.f48427b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48427b.h(true);
                        return;
                    case 1:
                        this.f48427b.c();
                        return;
                    default:
                        this.f48427b.f49586c.c(false);
                        return;
                }
            }
        });
        this.f49585b.setVisibility(0);
        this.f49586c.setVisibility(4);
        this.f49585b.setHeader(this.d);
        g10.addView(this.d, c8.na.c(52.0f, -1));
        g10.addView(frameLayout, c8.na.c(-2.0f, -1));
        g10.addView(this.h, c8.na.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f49591s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
        }
        addView(g10);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f10;
        Window window = this.f49584a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.f49585b;
        gVar.K = false;
        lg.g gVar2 = this.f49586c;
        gVar2.K = false;
        gVar.f19925z0 = 2;
        gVar2.f19925z0 = 1;
        final ?? obj = new Object();
        lg.j jVar = gVar.f19898h0;
        obj.f21613b = jVar.f19941l;
        obj.f21612a = jVar.f19940k;
        int binarySearch = Arrays.binarySearch(this.f49590r.d.f21074a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f49590r.d.f21074a.length - 1;
        }
        obj.f21614c = this.f49590r.d.f21075b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.A0 = obj;
        gVar.A0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i7 = 0; i7 < this.f49590r.d.d.size(); i7++) {
            if (((mg.a) this.f49590r.d.d.get(i7)).f21067a[binarySearch] > j10) {
                j10 = ((mg.a) this.f49590r.d.d.get(i7)).f21067a[binarySearch];
            }
            if (((mg.a) this.f49590r.d.d.get(i7)).f21067a[binarySearch] < j11) {
                j11 = ((mg.a) this.f49590r.d.d.get(i7)).f21067a[binarySearch];
            }
        }
        float f11 = ((float) j11) + ((float) (j10 - j11));
        float f12 = gVar.f19921x;
        final float f13 = (f11 - f12) / (gVar.f19919w - f12);
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
                l41 l41Var = l41.this;
                lg.g gVar3 = l41Var.f49585b;
                float f15 = gVar3.G0;
                lg.j jVar2 = gVar3.f19898h0;
                float f16 = jVar2.f19941l;
                float f17 = jVar2.f19940k;
                float f18 = ((f15 / (f16 - f17)) * f17) - lg.g.l1;
                RectF rectF = gVar3.I0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                ng.j jVar3 = obj;
                jVar3.f21615e = height;
                jVar3.d = (gVar3.H0 * jVar3.f21614c) - f18;
                jVar3.f21616f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = l41Var.f49586c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x1.a());
        return ofFloat;
    }

    public abstract void b(n41 n41Var);

    public abstract void c();

    public final void d() {
        mg.b bVar;
        ArrayList arrayList;
        int i7;
        lg.g gVar = this.f49585b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.f49586c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        n41 n41Var = this.f49590r;
        if (n41Var != null && (bVar = n41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f49590r.d.d.size(); i10++) {
                if (((mg.a) this.f49590r.d.d.get(i10)).f21072g >= 0 && org.telegram.ui.ActionBar.n6.f1(((mg.a) this.f49590r.d.d.get(i10)).f21072g)) {
                    i7 = org.telegram.ui.ActionBar.n6.x0(null, ((mg.a) this.f49590r.d.d.get(i10)).f21072g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false)) < 0.5d) {
                    i7 = ((mg.a) this.f49590r.d.d.get(i10)).f21073i;
                } else {
                    i7 = ((mg.a) this.f49590r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f49589n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.uz uzVar = ((k41) arrayList2.get(i10)).f49314a;
                    uzVar.getClass();
                    uzVar.f40510r = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false);
                    uzVar.f40512w = -1;
                    uzVar.f40511s = i7;
                    uzVar.invalidate();
                }
            }
        }
        this.f49587e.setProgressColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29525h6, false));
        this.f49588f.setTextColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s5, false));
    }

    public final void e(n41 n41Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (n41Var != null) {
            String str = n41Var.f50215j;
            ng.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            lg.g gVar = this.f49585b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            lg.j jVar = gVar.f19898h0;
            lg.g gVar2 = this.f49586c;
            gVar2.setLandscape(z11);
            this.f49590r = n41Var;
            boolean z13 = n41Var.f50217l;
            ArrayList arrayList2 = this.f49589n;
            gh0 gh0Var = this.h;
            RadialProgressView radialProgressView = this.f49587e;
            TextView textView = this.f49588f;
            if (!z13 && !n41Var.f50208a) {
                textView.setVisibility(8);
                ng.e eVar = gVar.f19917u0;
                boolean z14 = n41Var.f50219n;
                eVar.f21584a = z14;
                cVar.c(!z14);
                if (n41Var.d == null && n41Var.f50212f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(n41Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(n41Var.d) && n41Var.h) {
                    jVar.f19940k = 0.0f;
                    jVar.f19941l = 1.0f;
                    jVar.f19932a.A(true, false, false);
                }
                cVar.setUseWeekInterval(n41Var.f50220o);
                gVar.f19917u0.setUseWeek(n41Var.f50220o);
                ng.e eVar2 = gVar.f19917u0;
                if (this.f49590r.f50213g == null && this.f49591s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.G = z12;
                gVar2.f19917u0.G = false;
                eVar2.setEnabled(eVar2.G);
                ng.e eVar3 = gVar2.f19917u0;
                eVar3.setEnabled(eVar3.G);
                int size = arrayList.size();
                gh0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i7 = 0; i7 < size; i7++) {
                        ng.f fVar = (ng.f) arrayList.get(i7);
                        k41 k41Var = new k41(this, i7);
                        k41Var.f49315b = fVar;
                        String str2 = fVar.f21595a.d;
                        org.telegram.ui.Components.uz uzVar = k41Var.f49314a;
                        uzVar.setText(str2);
                        uzVar.a(fVar.f21606n, false);
                        uzVar.setOnTouchListener(new Object());
                        uzVar.setOnClickListener(new ig0(15, k41Var, fVar));
                        uzVar.setOnLongClickListener(new fi.z1(7, k41Var, fVar));
                    }
                }
                long j3 = this.f49590r.f50210c;
                if (j3 > 0) {
                    gVar.f19916t0 = Arrays.binarySearch(gVar.f19900i0.f21074a, j3);
                    gVar.f19918v0 = true;
                    gVar.f19917u0.setVisibility(0);
                    gVar.f19920w0 = 1.0f;
                    gVar.x((gVar.H0 * jVar.f19940k) - lg.g.l1);
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
                    gVar.f19925z0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.A0 = obj;
                    obj.f21616f = 0.0f;
                    ofFloat.addUpdateListener(new hz0(this, 8));
                    ofFloat.addListener(new j41(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = n41Var.f50209b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            gh0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f10;
        lg.g gVar = this.f49585b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.f49590r.f50211e;
        lg.g gVar2 = this.f49586c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f49590r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f49590r.d.d.size();
                arrayList = this.f49589n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((mg.a) bVar.d.get(i11)).f21069c.equals(((mg.a) this.f49590r.d.d.get(i7)).f21069c)) {
                            boolean z12 = ((k41) arrayList.get(i7)).f49314a.f40505b;
                            ((ng.f) arrayList2.get(i11)).f21606n = z12;
                            ng.f fVar = (ng.f) arrayList2.get(i11);
                            if (z12) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f21607o = f10;
                            ((k41) arrayList.get(i7)).f49314a.f40506c = true;
                            ((k41) arrayList.get(i7)).f49314a.animate().alpha(1.0f).start();
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
                    ((k41) arrayList.get(i7)).f49314a.f40506c = false;
                    ((k41) arrayList.get(i7)).f49314a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f49590r.d.d.size(); i12++) {
                    ((k41) arrayList.get(i12)).f49314a.f40506c = true;
                    ((k41) arrayList.get(i12)).f49314a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f49590r.f50210c = selectedDate;
        gVar.f19917u0.setAlpha(0.0f);
        gVar.f19920w0 = 0.0f;
        gVar.f19918v0 = false;
        gVar.f19903j1 = false;
        gVar2.G();
        ng.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f19925z0 = 0;
            gVar2.f19925z0 = 0;
            gVar.K = false;
            gVar2.K = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new j41(this, 0));
        a10.start();
    }

    public final void h(boolean z10) {
        mg.b bVar;
        n41 n41Var = this.f49590r;
        if (n41Var != null && (bVar = n41Var.d) != null && bVar.f21074a != null) {
            ng.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f21571a;
            lg.g gVar = this.f49585b;
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
            gVar.f19917u0.f21588f.setAlpha(1.0f);
            lg.g gVar2 = this.f49586c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f49590r.f50210c = 0L;
            int i7 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f49589n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.K = true;
                gVar2.K = false;
                gVar.invalidate();
                Window window = this.f49584a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    k41 k41Var = (k41) obj;
                    k41Var.f49314a.setAlpha(1.0f);
                    k41Var.f49314a.f40506c = true;
                }
                return;
            }
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new j41(this, 1));
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                k41 k41Var2 = (k41) obj2;
                k41Var2.f49314a.animate().alpha(1.0f).start();
                k41Var2.f49314a.f40506c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f49585b != null && this.f49586c != null && this.d != null && this.f49587e != null && this.f49588f != null) {
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
