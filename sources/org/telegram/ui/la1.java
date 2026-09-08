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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.RadialProgressView;
public abstract class la1 extends FrameLayout {
    public final Window f38278a;
    public final jg.g f38279b;
    public final jg.g f38280c;
    public final lg.c d;
    public final RadialProgressView f38281e;
    public final TextView f38282f;
    public final v51 h;
    public final ArrayList f38283n;
    public na1 f38284r;
    public final int f38285s;

    public la1(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38283n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f38278a = ((Activity) context).getWindow();
        } else {
            this.f38278a = null;
        }
        this.f38285s = i10;
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        this.h = new v51(context, 2);
        lg.c cVar = new lg.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f36970b;

            {
                this.f36970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36970b.h(true);
                        return;
                    case 1:
                        this.f36970b.c();
                        return;
                    default:
                        this.f36970b.f38280c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f38279b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f38280c = gVar;
                            gVar.f13716t0.f15463y = true;
                        } else {
                            this.f38279b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f38280c = gVar2;
                            gVar2.f13716t0.f15463y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f38279b = qVar;
                        qVar.f13716t0.E = true;
                        ?? qVar2 = new jg.q(getContext());
                        qVar2.M1 = -1;
                        qVar2.N1 = new RectF();
                        qVar2.P1 = AndroidUtilities.dp(9.0f);
                        qVar2.Q1 = AndroidUtilities.dp(13.0f);
                        qVar2.R1 = new String[101];
                        qVar2.T1 = 1.0f;
                        qVar2.U1 = 0;
                        qVar2.V1 = -1;
                        qVar2.W1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            qVar2.R1[i11] = a4.a.m(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f13700h1 = true;
                        this.f38280c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f13720w0 = true;
                    gVar3.f13722x0 = true;
                    this.f38279b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f38280c = gVar4;
                    gVar4.f13716t0.f15463y = true;
                }
            } else {
                this.f38279b = new jg.p(getContext(), f6Var);
                jg.p pVar = new jg.p(getContext(), f6Var);
                this.f38280c = pVar;
                pVar.f13716t0.f15463y = true;
            }
        } else {
            this.f38279b = new jg.g(getContext(), f6Var);
            jg.g gVar5 = new jg.g(getContext(), f6Var);
            this.f38280c = gVar5;
            gVar5.f13716t0.f15463y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38279b.f13680a = fVar;
        this.f38280c.f13680a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38281e = radialProgressView;
        frameLayout.addView(this.f38279b);
        frameLayout.addView(this.f38279b.f13716t0, -2, -2);
        frameLayout.addView(this.f38280c);
        frameLayout.addView(this.f38280c.f13716t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.x5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f38282f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20961s5, f6Var));
        this.f38279b.setDateSelectionListener(new vl0(this, 19));
        this.f38279b.f13716t0.d(false, false);
        this.f38279b.f13716t0.setOnTouchListener(new Object());
        this.f38279b.f13716t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f36970b;

            {
                this.f36970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36970b.h(true);
                        return;
                    case 1:
                        this.f36970b.c();
                        return;
                    default:
                        this.f36970b.f38280c.c(false);
                        return;
                }
            }
        });
        this.f38280c.f13716t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f36970b;

            {
                this.f36970b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36970b.h(true);
                        return;
                    case 1:
                        this.f36970b.c();
                        return;
                    default:
                        this.f36970b.f38280c.c(false);
                        return;
                }
            }
        });
        this.f38279b.setVisibility(0);
        this.f38280c.setVisibility(4);
        this.f38279b.setHeader(this.d);
        f7.addView(this.d, w7.x5.c(52.0f, -1));
        f7.addView(frameLayout, w7.x5.c(-2.0f, -1));
        f7.addView(this.h, w7.x5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f38285s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f38278a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f38279b;
        gVar.J = false;
        jg.g gVar2 = this.f38280c;
        gVar2.J = false;
        gVar.f13724y0 = 2;
        gVar2.f13724y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f13697g0;
        obj.f15482b = jVar.f13741l;
        obj.f15481a = jVar.f13740k;
        int binarySearch = Arrays.binarySearch(this.f38284r.d.f14951a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f38284r.d.f14951a.length - 1;
        }
        obj.f15483c = this.f38284r.d.f14952b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f13725z0 = obj;
        gVar.f13725z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f38284r.d.d.size(); i10++) {
            if (((kg.a) this.f38284r.d.d.get(i10)).f14944a[binarySearch] > j10) {
                j10 = ((kg.a) this.f38284r.d.d.get(i10)).f14944a[binarySearch];
            }
            if (((kg.a) this.f38284r.d.d.get(i10)).f14944a[binarySearch] < j11) {
                j11 = ((kg.a) this.f38284r.d.d.get(i10)).f14944a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f13719w;
        final float f12 = (f10 - f11) / (gVar.v - f11);
        gVar.q(obj);
        gVar2.q(obj);
        float f13 = 1.0f;
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (!z10) {
            f13 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f13);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                la1 la1Var = la1.this;
                jg.g gVar3 = la1Var.f38279b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f13697g0;
                float f15 = jVar2.f13741l;
                float f16 = jVar2.f13740k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f13665k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.f15484e = height;
                jVar3.d = (gVar3.G0 * jVar3.f15483c) - f17;
                jVar3.f15485f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = la1Var.f38280c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(na1 na1Var);

    public abstract void c();

    public final void d() {
        kg.b bVar;
        ArrayList arrayList;
        int i10;
        jg.g gVar = this.f38279b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f38280c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        na1 na1Var = this.f38284r;
        if (na1Var != null && (bVar = na1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f38284r.d.d.size(); i11++) {
                if (((kg.a) this.f38284r.d.d.get(i11)).f14949g >= 0 && org.telegram.ui.ActionBar.j6.c1(((kg.a) this.f38284r.d.d.get(i11)).f14949g)) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, ((kg.a) this.f38284r.d.d.get(i11)).f14949g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f38284r.d.d.get(i11)).f14950i;
                } else {
                    i10 = ((kg.a) this.f38284r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f38283n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.s00 s00Var = ((ka1) arrayList2.get(i11)).f38016a;
                    s00Var.getClass();
                    s00Var.f30170r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false);
                    s00Var.v = -1;
                    s00Var.f30171s = i10;
                    s00Var.invalidate();
                }
            }
        }
        this.f38281e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20762h6, false));
        this.f38282f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20961s5, false));
    }

    public final void e(na1 na1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (na1Var != null) {
            String str = na1Var.f38928j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f38279b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f13697g0;
            jg.g gVar2 = this.f38280c;
            gVar2.setLandscape(z11);
            this.f38284r = na1Var;
            boolean z13 = na1Var.f38930l;
            ArrayList arrayList2 = this.f38283n;
            v51 v51Var = this.h;
            RadialProgressView radialProgressView = this.f38281e;
            TextView textView = this.f38282f;
            if (!z13 && !na1Var.f38921a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f13716t0;
                boolean z14 = na1Var.f38932n;
                eVar.f15453a = z14;
                cVar.c(!z14);
                if (na1Var.d == null && na1Var.f38925f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(na1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(na1Var.d) && na1Var.h) {
                    jVar.f13740k = 0.0f;
                    jVar.f13741l = 1.0f;
                    jVar.f13732a.A(true, false, false);
                }
                cVar.setUseWeekInterval(na1Var.f38933o);
                gVar.f13716t0.setUseWeek(na1Var.f38933o);
                lg.e eVar2 = gVar.f13716t0;
                if (this.f38284r.f38926g == null && this.f38285s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f13716t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f13716t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                v51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        ka1 ka1Var = new ka1(this, i10);
                        ka1Var.f38017b = fVar;
                        String str2 = fVar.f15464a.d;
                        org.telegram.ui.Components.s00 s00Var = ka1Var.f38016a;
                        s00Var.setText(str2);
                        s00Var.a(fVar.f15475n, false);
                        s00Var.setOnTouchListener(new Object());
                        s00Var.setOnClickListener(new wy0(7, ka1Var, fVar));
                        s00Var.setOnLongClickListener(new bi.d3(6, ka1Var, fVar));
                    }
                }
                long j3 = this.f38284r.f38923c;
                if (j3 > 0) {
                    gVar.f13715s0 = Arrays.binarySearch(gVar.f13699h0.f14951a, j3);
                    gVar.f13717u0 = true;
                    gVar.f13716t0.setVisibility(0);
                    gVar.f13718v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f13740k) - jg.g.f13665k1);
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
                    gVar.f13724y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f13725z0 = obj;
                    obj.f15485f = 0.0f;
                    ofFloat.addUpdateListener(new b21(this, 12));
                    ofFloat.addListener(new ja1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = na1Var.f38922b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            v51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        jg.g gVar = this.f38279b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f38284r.f38924e;
        jg.g gVar2 = this.f38280c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f38284r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f38284r.d.d.size();
                arrayList = this.f38283n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f14946c.equals(((kg.a) this.f38284r.d.d.get(i10)).f14946c)) {
                            boolean z12 = ((ka1) arrayList.get(i10)).f38016a.f30165b;
                            ((lg.f) arrayList2.get(i12)).f15475n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f15476o = f7;
                            ((ka1) arrayList.get(i10)).f38016a.f30166c = true;
                            ((ka1) arrayList.get(i10)).f38016a.animate().alpha(1.0f).start();
                            if (z12) {
                                i11++;
                            }
                            z11 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    ((ka1) arrayList.get(i10)).f38016a.f30166c = false;
                    ((ka1) arrayList.get(i10)).f38016a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f38284r.d.d.size(); i13++) {
                    ((ka1) arrayList.get(i13)).f38016a.f30166c = true;
                    ((ka1) arrayList.get(i13)).f38016a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f38284r.f38923c = selectedDate;
        gVar.f13716t0.setAlpha(0.0f);
        gVar.f13718v0 = 0.0f;
        gVar.f13717u0 = false;
        gVar.f13702i1 = false;
        gVar2.G();
        lg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f13724y0 = 0;
            gVar2.f13724y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new ja1(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        kg.b bVar;
        na1 na1Var = this.f38284r;
        if (na1Var != null && (bVar = na1Var.d) != null && bVar.f14951a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f15440a;
            jg.g gVar = this.f38279b;
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
                textView.setPivotY(AndroidUtilities.dp(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            gVar.f13716t0.f15457f.setAlpha(1.0f);
            jg.g gVar2 = this.f38280c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f38284r.f38923c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f38283n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f38278a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ka1 ka1Var = (ka1) obj;
                    ka1Var.f38016a.setAlpha(1.0f);
                    ka1Var.f38016a.f30166c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new ja1(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ka1 ka1Var2 = (ka1) obj2;
                ka1Var2.f38016a.animate().alpha(1.0f).start();
                ka1Var2.f38016a.f30166c = true;
            }
            a2.start();
        }
    }
}
