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
    public final Window f35407a;
    public final ig.g f35408b;
    public final ig.g f35409c;
    public final kg.c d;
    public final RadialProgressView e;
    public final TextView f35410f;
    public final u41 h;
    public final ArrayList f35411n;
    public na1 f35412r;
    public final int f35413s;

    public la1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35411n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f35407a = ((Activity) context).getWindow();
        } else {
            this.f35407a = null;
        }
        this.f35413s = i10;
        LinearLayout f7 = org.telegram.messenger.rk.f(context, 1);
        this.h = new u41(context, 3);
        kg.c cVar = new kg.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f34174b;

            {
                this.f34174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34174b.h(true);
                        return;
                    case 1:
                        this.f34174b.c();
                        return;
                    default:
                        this.f34174b.f35409c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f35408b = new ig.g(getContext(), null);
                            ig.g gVar = new ig.g(getContext(), null);
                            this.f35409c = gVar;
                            gVar.f11166t0.f13617y = true;
                        } else {
                            this.f35408b = new ig.g(getContext(), null);
                            ig.g gVar2 = new ig.g(getContext(), null);
                            this.f35409c = gVar2;
                            gVar2.f11166t0.f13617y = true;
                        }
                    } else {
                        ig.q qVar = new ig.q(getContext());
                        this.f35408b = qVar;
                        qVar.f11166t0.E = true;
                        ?? qVar2 = new ig.q(getContext());
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
                        qVar2.f11150h1 = true;
                        this.f35409c = qVar2;
                    }
                } else {
                    ig.g gVar3 = new ig.g(getContext(), null);
                    gVar3.f11170w0 = true;
                    gVar3.f11172x0 = true;
                    this.f35408b = gVar3;
                    ig.g gVar4 = new ig.g(getContext(), null);
                    this.f35409c = gVar4;
                    gVar4.f11166t0.f13617y = true;
                }
            } else {
                this.f35408b = new ig.p(getContext(), f6Var);
                ig.p pVar = new ig.p(getContext(), f6Var);
                this.f35409c = pVar;
                pVar.f11166t0.f13617y = true;
            }
        } else {
            this.f35408b = new ig.g(getContext(), f6Var);
            ig.g gVar5 = new ig.g(getContext(), f6Var);
            this.f35409c = gVar5;
            gVar5.f11166t0.f13617y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35408b.f11131a = fVar;
        this.f35409c.f11131a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f35408b);
        frameLayout.addView(this.f35408b.f11166t0, -2, -2);
        frameLayout.addView(this.f35409c);
        frameLayout.addView(this.f35409c.f11166t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.y5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f35410f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19384s5, f6Var));
        this.f35408b.setDateSelectionListener(new ol0(this, 20));
        this.f35408b.f11166t0.d(false, false);
        this.f35408b.f11166t0.setOnTouchListener(new Object());
        this.f35408b.f11166t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f34174b;

            {
                this.f34174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34174b.h(true);
                        return;
                    case 1:
                        this.f34174b.c();
                        return;
                    default:
                        this.f34174b.f35409c.c(false);
                        return;
                }
            }
        });
        this.f35409c.f11166t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f34174b;

            {
                this.f34174b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34174b.h(true);
                        return;
                    case 1:
                        this.f34174b.c();
                        return;
                    default:
                        this.f34174b.f35409c.c(false);
                        return;
                }
            }
        });
        this.f35408b.setVisibility(0);
        this.f35409c.setVisibility(4);
        this.f35408b.setHeader(this.d);
        f7.addView(this.d, w7.y5.c(52.0f, -1));
        f7.addView(frameLayout, w7.y5.c(-2.0f, -1));
        f7.addView(this.h, w7.y5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f35413s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f35407a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ig.g gVar = this.f35408b;
        gVar.J = false;
        ig.g gVar2 = this.f35409c;
        gVar2.J = false;
        gVar.f11174y0 = 2;
        gVar2.f11174y0 = 1;
        final ?? obj = new Object();
        ig.j jVar = gVar.f11147g0;
        obj.f13635b = jVar.f11189l;
        obj.f13634a = jVar.f11188k;
        int binarySearch = Arrays.binarySearch(this.f35412r.d.f13002a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f35412r.d.f13002a.length - 1;
        }
        obj.f13636c = this.f35412r.d.f13003b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f11175z0 = obj;
        gVar.f11175z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f35412r.d.d.size(); i10++) {
            if (((jg.a) this.f35412r.d.d.get(i10)).f12996a[binarySearch] > j10) {
                j10 = ((jg.a) this.f35412r.d.d.get(i10)).f12996a[binarySearch];
            }
            if (((jg.a) this.f35412r.d.d.get(i10)).f12996a[binarySearch] < j11) {
                j11 = ((jg.a) this.f35412r.d.d.get(i10)).f12996a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f11169w;
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
                ig.g gVar3 = la1Var.f35408b;
                float f14 = gVar3.F0;
                ig.j jVar2 = gVar3.f11147g0;
                float f15 = jVar2.f11189l;
                float f16 = jVar2.f11188k;
                float f17 = ((f14 / (f15 - f16)) * f16) - ig.g.f11116k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                kg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f13636c) - f17;
                jVar3.f13637f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = la1Var.f35409c;
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
        jg.b bVar;
        ArrayList arrayList;
        int i10;
        ig.g gVar = this.f35408b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.f35409c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        na1 na1Var = this.f35412r;
        if (na1Var != null && (bVar = na1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f35412r.d.d.size(); i11++) {
                if (((jg.a) this.f35412r.d.d.get(i11)).f13000g >= 0 && org.telegram.ui.ActionBar.j6.c1(((jg.a) this.f35412r.d.d.get(i11)).f13000g)) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, ((jg.a) this.f35412r.d.d.get(i11)).f13000g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false)) < 0.5d) {
                    i10 = ((jg.a) this.f35412r.d.d.get(i11)).f13001i;
                } else {
                    i10 = ((jg.a) this.f35412r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f35411n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.s00 s00Var = ((ka1) arrayList2.get(i11)).f35097a;
                    s00Var.getClass();
                    s00Var.f28087r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false);
                    s00Var.v = -1;
                    s00Var.f28088s = i10;
                    s00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19181h6, false));
        this.f35410f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19384s5, false));
    }

    public final void e(na1 na1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (na1Var != null) {
            String str = na1Var.f35975j;
            kg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ig.g gVar = this.f35408b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            ig.j jVar = gVar.f11147g0;
            ig.g gVar2 = this.f35409c;
            gVar2.setLandscape(z11);
            this.f35412r = na1Var;
            boolean z13 = na1Var.f35977l;
            ArrayList arrayList2 = this.f35411n;
            u41 u41Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f35410f;
            if (!z13 && !na1Var.f35969a) {
                textView.setVisibility(8);
                kg.e eVar = gVar.f11166t0;
                boolean z14 = na1Var.f35979n;
                eVar.f13608a = z14;
                cVar.c(!z14);
                if (na1Var.d == null && na1Var.f35972f != null) {
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
                    jVar.f11188k = 0.0f;
                    jVar.f11189l = 1.0f;
                    jVar.f11181a.A(true, false, false);
                }
                cVar.setUseWeekInterval(na1Var.f35980o);
                gVar.f11166t0.setUseWeek(na1Var.f35980o);
                kg.e eVar2 = gVar.f11166t0;
                if (this.f35412r.f35973g == null && this.f35413s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f11166t0.F = false;
                eVar2.setEnabled(eVar2.F);
                kg.e eVar3 = gVar2.f11166t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                u41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        kg.f fVar = (kg.f) arrayList.get(i10);
                        ka1 ka1Var = new ka1(this, i10);
                        ka1Var.f35098b = fVar;
                        String str2 = fVar.f13618a.d;
                        org.telegram.ui.Components.s00 s00Var = ka1Var.f35097a;
                        s00Var.setText(str2);
                        s00Var.a(fVar.f13628n, false);
                        s00Var.setOnTouchListener(new Object());
                        s00Var.setOnClickListener(new vy0(7, ka1Var, fVar));
                        s00Var.setOnLongClickListener(new ai.q3(6, ka1Var, fVar));
                    }
                }
                long j3 = this.f35412r.f35971c;
                if (j3 > 0) {
                    gVar.f11165s0 = Arrays.binarySearch(gVar.f11149h0.f13002a, j3);
                    gVar.f11167u0 = true;
                    gVar.f11166t0.setVisibility(0);
                    gVar.f11168v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f11188k) - ig.g.f11116k1);
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
                    gVar.f11174y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f11175z0 = obj;
                    obj.f13637f = 0.0f;
                    ofFloat.addUpdateListener(new i21(this, 11));
                    ofFloat.addListener(new ja1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = na1Var.f35970b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            u41Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        ig.g gVar = this.f35408b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.f35412r.e;
        ig.g gVar2 = this.f35409c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f35412r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f35412r.d.d.size();
                arrayList = this.f35411n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((jg.a) bVar.d.get(i12)).f12998c.equals(((jg.a) this.f35412r.d.d.get(i10)).f12998c)) {
                            boolean z12 = ((ka1) arrayList.get(i10)).f35097a.f28083b;
                            ((kg.f) arrayList2.get(i12)).f13628n = z12;
                            kg.f fVar = (kg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f13629o = f7;
                            ((ka1) arrayList.get(i10)).f35097a.f28084c = true;
                            ((ka1) arrayList.get(i10)).f35097a.animate().alpha(1.0f).start();
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
                    ((ka1) arrayList.get(i10)).f35097a.f28084c = false;
                    ((ka1) arrayList.get(i10)).f35097a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f35412r.d.d.size(); i13++) {
                    ((ka1) arrayList.get(i13)).f35097a.f28084c = true;
                    ((ka1) arrayList.get(i13)).f35097a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f35412r.f35971c = selectedDate;
        gVar.f11166t0.setAlpha(0.0f);
        gVar.f11168v0 = 0.0f;
        gVar.f11167u0 = false;
        gVar.f11152i1 = false;
        gVar2.G();
        kg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f11174y0 = 0;
            gVar2.f11174y0 = 0;
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
        jg.b bVar;
        na1 na1Var = this.f35412r;
        if (na1Var != null && (bVar = na1Var.d) != null && bVar.f13002a != null) {
            kg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f13597a;
            ig.g gVar = this.f35408b;
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
            gVar.f11166t0.f13611f.setAlpha(1.0f);
            ig.g gVar2 = this.f35409c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f35412r.f35971c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f35411n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f35407a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ka1 ka1Var = (ka1) obj;
                    ka1Var.f35097a.setAlpha(1.0f);
                    ka1Var.f35097a.f28084c = true;
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
                ka1Var2.f35097a.animate().alpha(1.0f).start();
                ka1Var2.f35097a.f28084c = true;
            }
            a2.start();
        }
    }
}
