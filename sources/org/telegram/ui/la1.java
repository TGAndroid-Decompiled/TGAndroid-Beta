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
    public final Window f38251a;
    public final jg.g f38252b;
    public final jg.g f38253c;
    public final lg.c d;
    public final RadialProgressView f38254e;
    public final TextView f38255f;
    public final v51 h;
    public final ArrayList f38256n;
    public na1 f38257r;
    public final int f38258s;

    public la1(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f38256n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f38251a = ((Activity) context).getWindow();
        } else {
            this.f38251a = null;
        }
        this.f38258s = i10;
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        this.h = new v51(context, 2);
        lg.c cVar = new lg.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f36943b;

            {
                this.f36943b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36943b.h(true);
                        return;
                    case 1:
                        this.f36943b.c();
                        return;
                    default:
                        this.f36943b.f38253c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f38252b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f38253c = gVar;
                            gVar.f13690t0.f15436y = true;
                        } else {
                            this.f38252b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f38253c = gVar2;
                            gVar2.f13690t0.f15436y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f38252b = qVar;
                        qVar.f13690t0.E = true;
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
                        qVar2.f13674h1 = true;
                        this.f38253c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f13694w0 = true;
                    gVar3.f13696x0 = true;
                    this.f38252b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f38253c = gVar4;
                    gVar4.f13690t0.f15436y = true;
                }
            } else {
                this.f38252b = new jg.p(getContext(), f6Var);
                jg.p pVar = new jg.p(getContext(), f6Var);
                this.f38253c = pVar;
                pVar.f13690t0.f15436y = true;
            }
        } else {
            this.f38252b = new jg.g(getContext(), f6Var);
            jg.g gVar5 = new jg.g(getContext(), f6Var);
            this.f38253c = gVar5;
            gVar5.f13690t0.f15436y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f38252b.f13654a = fVar;
        this.f38253c.f13654a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f38254e = radialProgressView;
        frameLayout.addView(this.f38252b);
        frameLayout.addView(this.f38252b.f13690t0, -2, -2);
        frameLayout.addView(this.f38253c);
        frameLayout.addView(this.f38253c.f13690t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.x5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f38255f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20934s5, f6Var));
        this.f38252b.setDateSelectionListener(new vl0(this, 19));
        this.f38252b.f13690t0.d(false, false);
        this.f38252b.f13690t0.setOnTouchListener(new Object());
        this.f38252b.f13690t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f36943b;

            {
                this.f36943b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36943b.h(true);
                        return;
                    case 1:
                        this.f36943b.c();
                        return;
                    default:
                        this.f36943b.f38253c.c(false);
                        return;
                }
            }
        });
        this.f38253c.f13690t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f36943b;

            {
                this.f36943b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36943b.h(true);
                        return;
                    case 1:
                        this.f36943b.c();
                        return;
                    default:
                        this.f36943b.f38253c.c(false);
                        return;
                }
            }
        });
        this.f38252b.setVisibility(0);
        this.f38253c.setVisibility(4);
        this.f38252b.setHeader(this.d);
        f7.addView(this.d, w7.x5.c(52.0f, -1));
        f7.addView(frameLayout, w7.x5.c(-2.0f, -1));
        f7.addView(this.h, w7.x5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f38258s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f38251a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f38252b;
        gVar.J = false;
        jg.g gVar2 = this.f38253c;
        gVar2.J = false;
        gVar.f13698y0 = 2;
        gVar2.f13698y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f13671g0;
        obj.f15455b = jVar.f13715l;
        obj.f15454a = jVar.f13714k;
        int binarySearch = Arrays.binarySearch(this.f38257r.d.f14925a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f38257r.d.f14925a.length - 1;
        }
        obj.f15456c = this.f38257r.d.f14926b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f13699z0 = obj;
        gVar.f13699z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f38257r.d.d.size(); i10++) {
            if (((kg.a) this.f38257r.d.d.get(i10)).f14918a[binarySearch] > j10) {
                j10 = ((kg.a) this.f38257r.d.d.get(i10)).f14918a[binarySearch];
            }
            if (((kg.a) this.f38257r.d.d.get(i10)).f14918a[binarySearch] < j11) {
                j11 = ((kg.a) this.f38257r.d.d.get(i10)).f14918a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f13693w;
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
                jg.g gVar3 = la1Var.f38252b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f13671g0;
                float f15 = jVar2.f13715l;
                float f16 = jVar2.f13714k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f13639k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.f15457e = height;
                jVar3.d = (gVar3.G0 * jVar3.f15456c) - f17;
                jVar3.f15458f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = la1Var.f38253c;
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
        jg.g gVar = this.f38252b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f38253c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        na1 na1Var = this.f38257r;
        if (na1Var != null && (bVar = na1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f38257r.d.d.size(); i11++) {
                if (((kg.a) this.f38257r.d.d.get(i11)).f14923g >= 0 && org.telegram.ui.ActionBar.j6.c1(((kg.a) this.f38257r.d.d.get(i11)).f14923g)) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, ((kg.a) this.f38257r.d.d.get(i11)).f14923g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f38257r.d.d.get(i11)).f14924i;
                } else {
                    i10 = ((kg.a) this.f38257r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f38256n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.s00 s00Var = ((ka1) arrayList2.get(i11)).f37989a;
                    s00Var.getClass();
                    s00Var.f30143r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20663d6, false);
                    s00Var.v = -1;
                    s00Var.f30144s = i10;
                    s00Var.invalidate();
                }
            }
        }
        this.f38254e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20735h6, false));
        this.f38255f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20934s5, false));
    }

    public final void e(na1 na1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (na1Var != null) {
            String str = na1Var.f38901j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f38252b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f13671g0;
            jg.g gVar2 = this.f38253c;
            gVar2.setLandscape(z11);
            this.f38257r = na1Var;
            boolean z13 = na1Var.f38903l;
            ArrayList arrayList2 = this.f38256n;
            v51 v51Var = this.h;
            RadialProgressView radialProgressView = this.f38254e;
            TextView textView = this.f38255f;
            if (!z13 && !na1Var.f38894a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f13690t0;
                boolean z14 = na1Var.f38905n;
                eVar.f15426a = z14;
                cVar.c(!z14);
                if (na1Var.d == null && na1Var.f38898f != null) {
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
                    jVar.f13714k = 0.0f;
                    jVar.f13715l = 1.0f;
                    jVar.f13706a.A(true, false, false);
                }
                cVar.setUseWeekInterval(na1Var.f38906o);
                gVar.f13690t0.setUseWeek(na1Var.f38906o);
                lg.e eVar2 = gVar.f13690t0;
                if (this.f38257r.f38899g == null && this.f38258s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f13690t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f13690t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                v51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        ka1 ka1Var = new ka1(this, i10);
                        ka1Var.f37990b = fVar;
                        String str2 = fVar.f15437a.d;
                        org.telegram.ui.Components.s00 s00Var = ka1Var.f37989a;
                        s00Var.setText(str2);
                        s00Var.a(fVar.f15448n, false);
                        s00Var.setOnTouchListener(new Object());
                        s00Var.setOnClickListener(new wy0(7, ka1Var, fVar));
                        s00Var.setOnLongClickListener(new bi.d3(6, ka1Var, fVar));
                    }
                }
                long j3 = this.f38257r.f38896c;
                if (j3 > 0) {
                    gVar.f13689s0 = Arrays.binarySearch(gVar.f13673h0.f14925a, j3);
                    gVar.f13691u0 = true;
                    gVar.f13690t0.setVisibility(0);
                    gVar.f13692v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f13714k) - jg.g.f13639k1);
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
                    gVar.f13698y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f13699z0 = obj;
                    obj.f15458f = 0.0f;
                    ofFloat.addUpdateListener(new b21(this, 12));
                    ofFloat.addListener(new ja1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = na1Var.f38895b;
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
        jg.g gVar = this.f38252b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f38257r.f38897e;
        jg.g gVar2 = this.f38253c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f38257r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f38257r.d.d.size();
                arrayList = this.f38256n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f14920c.equals(((kg.a) this.f38257r.d.d.get(i10)).f14920c)) {
                            boolean z12 = ((ka1) arrayList.get(i10)).f37989a.f30138b;
                            ((lg.f) arrayList2.get(i12)).f15448n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f15449o = f7;
                            ((ka1) arrayList.get(i10)).f37989a.f30139c = true;
                            ((ka1) arrayList.get(i10)).f37989a.animate().alpha(1.0f).start();
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
                    ((ka1) arrayList.get(i10)).f37989a.f30139c = false;
                    ((ka1) arrayList.get(i10)).f37989a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f38257r.d.d.size(); i13++) {
                    ((ka1) arrayList.get(i13)).f37989a.f30139c = true;
                    ((ka1) arrayList.get(i13)).f37989a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f38257r.f38896c = selectedDate;
        gVar.f13690t0.setAlpha(0.0f);
        gVar.f13692v0 = 0.0f;
        gVar.f13691u0 = false;
        gVar.f13676i1 = false;
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
            gVar.f13698y0 = 0;
            gVar2.f13698y0 = 0;
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
        na1 na1Var = this.f38257r;
        if (na1Var != null && (bVar = na1Var.d) != null && bVar.f14925a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f15413a;
            jg.g gVar = this.f38252b;
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
            gVar.f13690t0.f15430f.setAlpha(1.0f);
            jg.g gVar2 = this.f38253c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f38257r.f38896c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f38256n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f38251a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ka1 ka1Var = (ka1) obj;
                    ka1Var.f37989a.setAlpha(1.0f);
                    ka1Var.f37989a.f30139c = true;
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
                ka1Var2.f37989a.animate().alpha(1.0f).start();
                ka1Var2.f37989a.f30139c = true;
            }
            a2.start();
        }
    }
}
