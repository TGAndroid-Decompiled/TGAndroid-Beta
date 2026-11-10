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
public abstract class n41 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final Window f48113a;
    public final lg.g f48114b;
    public final lg.g f48115c;
    public final ng.c d;
    public final RadialProgressView f48116e;
    public final TextView f48117f;
    public final vq0 h;
    public final ArrayList f48118n;
    public q41 f48119r;
    public final int f48120s;

    public n41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f48118n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f48113a = ((Activity) context).getWindow();
        } else {
            this.f48113a = null;
        }
        this.f48120s = i7;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new vq0(context, 8);
        ng.c cVar = new ng.c(getContext(), h6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final n41 f46817b;

            {
                this.f46817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46817b.h(true);
                        return;
                    case 1:
                        this.f46817b.c();
                        return;
                    default:
                        this.f46817b.f48115c.c(false);
                        return;
                }
            }
        });
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            this.f48114b = new lg.g(getContext(), null);
                            lg.g gVar = new lg.g(getContext(), null);
                            this.f48115c = gVar;
                            gVar.f18325t0.D = true;
                        } else {
                            this.f48114b = new lg.g(getContext(), null);
                            lg.g gVar2 = new lg.g(getContext(), null);
                            this.f48115c = gVar2;
                            gVar2.f18325t0.D = true;
                        }
                    } else {
                        lg.q qVar = new lg.q(getContext());
                        this.f48114b = qVar;
                        qVar.f18325t0.E = true;
                        ?? qVar2 = new lg.q(getContext());
                        qVar2.M1 = -1;
                        qVar2.N1 = new RectF();
                        qVar2.P1 = org.telegram.messenger.g0.L(9.0f);
                        qVar2.Q1 = org.telegram.messenger.g0.L(13.0f);
                        qVar2.R1 = new String[101];
                        qVar2.T1 = 1.0f;
                        qVar2.U1 = 0;
                        qVar2.V1 = -1;
                        qVar2.W1 = -1;
                        for (int i10 = 1; i10 <= 100; i10++) {
                            qVar2.R1[i10] = com.google.android.recaptcha.internal.a.i(i10, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f18309h1 = true;
                        this.f48115c = qVar2;
                    }
                } else {
                    lg.g gVar3 = new lg.g(getContext(), null);
                    gVar3.f18329w0 = true;
                    gVar3.f18331x0 = true;
                    this.f48114b = gVar3;
                    lg.g gVar4 = new lg.g(getContext(), null);
                    this.f48115c = gVar4;
                    gVar4.f18325t0.D = true;
                }
            } else {
                this.f48114b = new lg.p(getContext(), h6Var);
                lg.p pVar = new lg.p(getContext(), h6Var);
                this.f48115c = pVar;
                pVar.f18325t0.D = true;
            }
        } else {
            this.f48114b = new lg.g(getContext(), h6Var);
            lg.g gVar5 = new lg.g(getContext(), h6Var);
            this.f48115c = gVar5;
            gVar5.f18325t0.D = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48114b.f18289a = fVar;
        this.f48115c.f18289a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48116e = radialProgressView;
        frameLayout.addView(this.f48114b);
        frameLayout.addView(this.f48114b.f18325t0, -2, -2);
        frameLayout.addView(this.f48115c);
        frameLayout.addView(this.f48115c.f18325t0, -2, -2);
        frameLayout.addView(radialProgressView, c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f48117f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.s5, h6Var);
        this.f48114b.setDateSelectionListener(new oi0(this, 17));
        this.f48114b.f18325t0.d(false, false);
        this.f48114b.f18325t0.setOnTouchListener(new Object());
        this.f48114b.f18325t0.setOnClickListener(new View.OnClickListener(this) {
            public final n41 f46817b;

            {
                this.f46817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46817b.h(true);
                        return;
                    case 1:
                        this.f46817b.c();
                        return;
                    default:
                        this.f46817b.f48115c.c(false);
                        return;
                }
            }
        });
        this.f48115c.f18325t0.setOnClickListener(new View.OnClickListener(this) {
            public final n41 f46817b;

            {
                this.f46817b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46817b.h(true);
                        return;
                    case 1:
                        this.f46817b.c();
                        return;
                    default:
                        this.f46817b.f48115c.c(false);
                        return;
                }
            }
        });
        this.f48114b.setVisibility(0);
        this.f48115c.setVisibility(4);
        this.f48114b.setHeader(this.d);
        f10.addView(this.d, c8.ha.c(52.0f, -1));
        f10.addView(frameLayout, c8.ha.c(-2.0f, -1));
        f10.addView(this.h, c8.ha.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f48120s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j3, boolean z9) {
        float f10;
        Window window = this.f48113a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.f48114b;
        gVar.J = false;
        lg.g gVar2 = this.f48115c;
        gVar2.J = false;
        gVar.f18333y0 = 2;
        gVar2.f18333y0 = 1;
        final ?? obj = new Object();
        lg.j jVar = gVar.f18306g0;
        obj.f20591b = jVar.f18350l;
        obj.f20590a = jVar.f18349k;
        int binarySearch = Arrays.binarySearch(this.f48119r.d.f20028a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f48119r.d.f20028a.length - 1;
        }
        obj.f20592c = this.f48119r.d.f20029b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f18334z0 = obj;
        gVar.f18334z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i7 = 0; i7 < this.f48119r.d.d.size(); i7++) {
            if (((mg.a) this.f48119r.d.d.get(i7)).f20021a[binarySearch] > j10) {
                j10 = ((mg.a) this.f48119r.d.d.get(i7)).f20021a[binarySearch];
            }
            if (((mg.a) this.f48119r.d.d.get(i7)).f20021a[binarySearch] < j11) {
                j11 = ((mg.a) this.f48119r.d.d.get(i7)).f20021a[binarySearch];
            }
        }
        float f11 = ((float) j11) + ((float) (j10 - j11));
        float f12 = gVar.f18330x;
        final float f13 = (f11 - f12) / (gVar.f18328w - f12);
        gVar.q(obj);
        gVar2.q(obj);
        float f14 = 1.0f;
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z9) {
            f14 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f14);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                n41 n41Var = n41.this;
                lg.g gVar3 = n41Var.f48114b;
                float f15 = gVar3.F0;
                lg.j jVar2 = gVar3.f18306g0;
                float f16 = jVar2.f18350l;
                float f17 = jVar2.f18349k;
                float f18 = ((f15 / (f16 - f17)) * f17) - lg.g.f18275k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                ng.j jVar3 = obj;
                jVar3.f20593e = height;
                jVar3.d = (gVar3.G0 * jVar3.f20592c) - f18;
                jVar3.f20594f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = n41Var.f48115c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x1.a());
        return ofFloat;
    }

    public abstract void b(q41 q41Var);

    public abstract void c();

    public final void d() {
        mg.b bVar;
        ArrayList arrayList;
        int i7;
        lg.g gVar = this.f48114b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.f48115c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        q41 q41Var = this.f48119r;
        if (q41Var != null && (bVar = q41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f48119r.d.d.size(); i10++) {
                if (((mg.a) this.f48119r.d.d.get(i10)).f20026g >= 0 && org.telegram.ui.ActionBar.m6.f1(((mg.a) this.f48119r.d.d.get(i10)).f20026g)) {
                    i7 = org.telegram.ui.ActionBar.m6.x0(null, ((mg.a) this.f48119r.d.d.get(i10)).f20026g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)) < 0.5d) {
                    i7 = ((mg.a) this.f48119r.d.d.get(i10)).f20027i;
                } else {
                    i7 = ((mg.a) this.f48119r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f48118n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.kz kzVar = ((m41) arrayList2.get(i10)).f47789a;
                    kzVar.getClass();
                    kzVar.f35469r = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false);
                    kzVar.f35471w = -1;
                    kzVar.f35470s = i7;
                    kzVar.invalidate();
                }
            }
        }
        this.f48116e.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27964h6, false));
        this.f48117f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.s5, false));
    }

    public final void e(q41 q41Var, boolean z9) {
        boolean z10;
        boolean z11;
        if (q41Var != null) {
            String str = q41Var.f48955j;
            ng.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = this.f48114b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            lg.j jVar = gVar.f18306g0;
            lg.g gVar2 = this.f48115c;
            gVar2.setLandscape(z10);
            this.f48119r = q41Var;
            boolean z12 = q41Var.f48957l;
            ArrayList arrayList2 = this.f48118n;
            vq0 vq0Var = this.h;
            RadialProgressView radialProgressView = this.f48116e;
            TextView textView = this.f48117f;
            if (!z12 && !q41Var.f48948a) {
                textView.setVisibility(8);
                ng.e eVar = gVar.f18325t0;
                boolean z13 = q41Var.f48959n;
                eVar.f20562a = z13;
                cVar.c(!z13);
                if (q41Var.d == null && q41Var.f48952f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(q41Var);
                    gVar.D(null);
                    return;
                }
                if (!z9) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(q41Var.d) && q41Var.h) {
                    jVar.f18349k = 0.0f;
                    jVar.f18350l = 1.0f;
                    jVar.f18341a.A(true, false, false);
                }
                cVar.setUseWeekInterval(q41Var.f48960o);
                gVar.f18325t0.setUseWeek(q41Var.f48960o);
                ng.e eVar2 = gVar.f18325t0;
                if (this.f48119r.f48953g == null && this.f48120s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.F = z11;
                gVar2.f18325t0.F = false;
                eVar2.setEnabled(eVar2.F);
                ng.e eVar3 = gVar2.f18325t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                vq0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i7 = 0; i7 < size; i7++) {
                        ng.f fVar = (ng.f) arrayList.get(i7);
                        m41 m41Var = new m41(this, i7);
                        m41Var.f47790b = fVar;
                        String str2 = fVar.f20573a.d;
                        org.telegram.ui.Components.kz kzVar = m41Var.f47789a;
                        kzVar.setText(str2);
                        kzVar.a(fVar.f20584n, false);
                        kzVar.setOnTouchListener(new Object());
                        kzVar.setOnClickListener(new ik0(13, m41Var, fVar));
                        kzVar.setOnLongClickListener(new di.f2(7, m41Var, fVar));
                    }
                }
                long j3 = this.f48119r.f48950c;
                if (j3 > 0) {
                    gVar.f18324s0 = Arrays.binarySearch(gVar.f18308h0.f20028a, j3);
                    gVar.f18326u0 = true;
                    gVar.f18325t0.setVisibility(0);
                    gVar.f18327v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f18349k) - lg.g.f18275k1);
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
                if (z9) {
                    gVar.f18333y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f18334z0 = obj;
                    obj.f20594f = 0.0f;
                    ofFloat.addUpdateListener(new kz0(this, 8));
                    ofFloat.addListener(new l41(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = q41Var.f48949b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            vq0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z9) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        lg.g gVar = this.f48114b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.f48119r.f48951e;
        lg.g gVar2 = this.f48115c;
        if (!z9 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f48119r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f48119r.d.d.size();
                arrayList = this.f48118n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((mg.a) bVar.d.get(i11)).f20023c.equals(((mg.a) this.f48119r.d.d.get(i7)).f20023c)) {
                            boolean z11 = ((m41) arrayList.get(i7)).f47789a.f35464b;
                            ((ng.f) arrayList2.get(i11)).f20584n = z11;
                            ng.f fVar = (ng.f) arrayList2.get(i11);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f20585o = f10;
                            ((m41) arrayList.get(i7)).f47789a.f35465c = true;
                            ((m41) arrayList.get(i7)).f47789a.animate().alpha(1.0f).start();
                            if (z11) {
                                i10++;
                            }
                            z10 = true;
                        } else {
                            i11++;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    ((m41) arrayList.get(i7)).f47789a.f35465c = false;
                    ((m41) arrayList.get(i7)).f47789a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f48119r.d.d.size(); i12++) {
                    ((m41) arrayList.get(i12)).f47789a.f35465c = true;
                    ((m41) arrayList.get(i12)).f47789a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f48119r.f48950c = selectedDate;
        gVar.f18325t0.setAlpha(0.0f);
        gVar.f18327v0 = 0.0f;
        gVar.f18326u0 = false;
        gVar.f18311i1 = false;
        gVar2.G();
        ng.c cVar = this.d;
        if (!z9) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z9) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f18333y0 = 0;
            gVar2.f18333y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new l41(this, 0));
        a10.start();
    }

    public final void h(boolean z9) {
        mg.b bVar;
        q41 q41Var = this.f48119r;
        if (q41Var != null && (bVar = q41Var.d) != null && bVar.f20028a != null) {
            ng.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f20549a;
            lg.g gVar = this.f48114b;
            cVar.b(gVar.getStartDate(), gVar.getEndDate());
            if (z9) {
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
            gVar.f18325t0.f20566f.setAlpha(1.0f);
            lg.g gVar2 = this.f48115c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f48119r.f48950c = 0L;
            int i7 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f48118n;
            if (!z9) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f48113a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    m41 m41Var = (m41) obj;
                    m41Var.f47789a.setAlpha(1.0f);
                    m41Var.f47789a.f35465c = true;
                }
                return;
            }
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new l41(this, 1));
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                m41 m41Var2 = (m41) obj2;
                m41Var2.f47789a.animate().alpha(1.0f).start();
                m41Var2.f47789a.f35465c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f48114b != null && this.f48115c != null && this.d != null && this.f48116e != null && this.f48117f != null) {
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
