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
    public final Window f39532a;
    public final ig.g f39533b;
    public final ig.g f39534c;
    public final kg.c d;
    public final RadialProgressView f39535e;
    public final TextView f39536f;
    public final w51 h;
    public final ArrayList f39537n;
    public na1 f39538r;
    public final int f39539s;

    public la1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f39537n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f39532a = ((Activity) context).getWindow();
        } else {
            this.f39532a = null;
        }
        this.f39539s = i10;
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        this.h = new w51(context, 2);
        kg.c cVar = new kg.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f38288b;

            {
                this.f38288b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38288b.h(true);
                        return;
                    case 1:
                        this.f38288b.c();
                        return;
                    default:
                        this.f38288b.f39534c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f39533b = new ig.g(getContext(), null);
                            ig.g gVar = new ig.g(getContext(), null);
                            this.f39534c = gVar;
                            gVar.f12192t0.f14840y = true;
                        } else {
                            this.f39533b = new ig.g(getContext(), null);
                            ig.g gVar2 = new ig.g(getContext(), null);
                            this.f39534c = gVar2;
                            gVar2.f12192t0.f14840y = true;
                        }
                    } else {
                        ig.q qVar = new ig.q(getContext());
                        this.f39533b = qVar;
                        qVar.f12192t0.E = true;
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
                            qVar2.R1[i11] = a1.g.n(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f12176h1 = true;
                        this.f39534c = qVar2;
                    }
                } else {
                    ig.g gVar3 = new ig.g(getContext(), null);
                    gVar3.f12196w0 = true;
                    gVar3.f12198x0 = true;
                    this.f39533b = gVar3;
                    ig.g gVar4 = new ig.g(getContext(), null);
                    this.f39534c = gVar4;
                    gVar4.f12192t0.f14840y = true;
                }
            } else {
                this.f39533b = new ig.p(getContext(), e6Var);
                ig.p pVar = new ig.p(getContext(), e6Var);
                this.f39534c = pVar;
                pVar.f12192t0.f14840y = true;
            }
        } else {
            this.f39533b = new ig.g(getContext(), e6Var);
            ig.g gVar5 = new ig.g(getContext(), e6Var);
            this.f39534c = gVar5;
            gVar5.f12192t0.f14840y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39533b.f12156a = fVar;
        this.f39534c.f12156a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39535e = radialProgressView;
        frameLayout.addView(this.f39533b);
        frameLayout.addView(this.f39533b.f12192t0, -2, -2);
        frameLayout.addView(this.f39534c);
        frameLayout.addView(this.f39534c.f12192t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.x5.a(44.0f, 0.0f, 0.0f, 0.0f, 60.0f, 44, 17));
        TextView textView = new TextView(context);
        this.f39536f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, -2, 17));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21076s5, e6Var));
        this.f39533b.setDateSelectionListener(new hq0(this, 18));
        this.f39533b.f12192t0.d(false, false);
        this.f39533b.f12192t0.setOnTouchListener(new Object());
        this.f39533b.f12192t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f38288b;

            {
                this.f38288b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38288b.h(true);
                        return;
                    case 1:
                        this.f38288b.c();
                        return;
                    default:
                        this.f38288b.f39534c.c(false);
                        return;
                }
            }
        });
        this.f39534c.f12192t0.setOnClickListener(new View.OnClickListener(this) {
            public final la1 f38288b;

            {
                this.f38288b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38288b.h(true);
                        return;
                    case 1:
                        this.f38288b.c();
                        return;
                    default:
                        this.f38288b.f39534c.c(false);
                        return;
                }
            }
        });
        this.f39533b.setVisibility(0);
        this.f39534c.setVisibility(4);
        this.f39533b.setHeader(this.d);
        e7.addView(this.d, w7.x5.d(52.0f, -1));
        e7.addView(frameLayout, w7.x5.d(-2.0f, -1));
        e7.addView(this.h, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 7));
        if (this.f39539s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e7.setClipChildren(false);
            e7.setClipToPadding(false);
        }
        addView(e7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f39532a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ig.g gVar = this.f39533b;
        gVar.J = false;
        ig.g gVar2 = this.f39534c;
        gVar2.J = false;
        gVar.f12200y0 = 2;
        gVar2.f12200y0 = 1;
        final ?? obj = new Object();
        ig.j jVar = gVar.f12173g0;
        obj.f14859b = jVar.f12217l;
        obj.f14858a = jVar.f12216k;
        int binarySearch = Arrays.binarySearch(this.f39538r.d.f14158a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f39538r.d.f14158a.length - 1;
        }
        obj.f14860c = this.f39538r.d.f14159b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f12201z0 = obj;
        gVar.f12201z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f39538r.d.d.size(); i10++) {
            if (((jg.a) this.f39538r.d.d.get(i10)).f14151a[binarySearch] > j10) {
                j10 = ((jg.a) this.f39538r.d.d.get(i10)).f14151a[binarySearch];
            }
            if (((jg.a) this.f39538r.d.d.get(i10)).f14151a[binarySearch] < j11) {
                j11 = ((jg.a) this.f39538r.d.d.get(i10)).f14151a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f12195w;
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
                ig.g gVar3 = la1Var.f39533b;
                float f14 = gVar3.F0;
                ig.j jVar2 = gVar3.f12173g0;
                float f15 = jVar2.f12217l;
                float f16 = jVar2.f12216k;
                float f17 = ((f14 / (f15 - f16)) * f16) - ig.g.f12141k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                kg.j jVar3 = obj;
                jVar3.f14861e = height;
                jVar3.d = (gVar3.G0 * jVar3.f14860c) - f17;
                jVar3.f14862f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = la1Var.f39534c;
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
        ig.g gVar = this.f39533b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.f39534c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        na1 na1Var = this.f39538r;
        if (na1Var != null && (bVar = na1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f39538r.d.d.size(); i11++) {
                if (((jg.a) this.f39538r.d.d.get(i11)).f14156g >= 0 && org.telegram.ui.ActionBar.i6.d1(((jg.a) this.f39538r.d.d.get(i11)).f14156g)) {
                    i10 = org.telegram.ui.ActionBar.i6.x0(null, ((jg.a) this.f39538r.d.d.get(i11)).f14156g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false)) < 0.5d) {
                    i10 = ((jg.a) this.f39538r.d.d.get(i11)).f14157i;
                } else {
                    i10 = ((jg.a) this.f39538r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f39537n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.j10 j10Var = ((ka1) arrayList2.get(i11)).f39244a;
                    j10Var.getClass();
                    j10Var.f27503r = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20801d6, false);
                    j10Var.v = -1;
                    j10Var.f27504s = i10;
                    j10Var.invalidate();
                }
            }
        }
        this.f39535e.setProgressColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20873h6, false));
        this.f39536f.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f21076s5, false));
    }

    public final void e(na1 na1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (na1Var != null) {
            String str = na1Var.f40199j;
            kg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ig.g gVar = this.f39533b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            ig.j jVar = gVar.f12173g0;
            ig.g gVar2 = this.f39534c;
            gVar2.setLandscape(z11);
            this.f39538r = na1Var;
            boolean z13 = na1Var.f40201l;
            ArrayList arrayList2 = this.f39537n;
            w51 w51Var = this.h;
            RadialProgressView radialProgressView = this.f39535e;
            TextView textView = this.f39536f;
            if (!z13 && !na1Var.f40192a) {
                textView.setVisibility(8);
                kg.e eVar = gVar.f12192t0;
                boolean z14 = na1Var.f40203n;
                eVar.f14830a = z14;
                cVar.c(!z14);
                if (na1Var.d == null && na1Var.f40196f != null) {
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
                    jVar.f12216k = 0.0f;
                    jVar.f12217l = 1.0f;
                    jVar.f12208a.A(true, false, false);
                }
                cVar.setUseWeekInterval(na1Var.f40204o);
                gVar.f12192t0.setUseWeek(na1Var.f40204o);
                kg.e eVar2 = gVar.f12192t0;
                if (this.f39538r.f40197g == null && this.f39539s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f12192t0.F = false;
                eVar2.setEnabled(eVar2.F);
                kg.e eVar3 = gVar2.f12192t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                w51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        kg.f fVar = (kg.f) arrayList.get(i10);
                        ka1 ka1Var = new ka1(this, i10);
                        ka1Var.f39245b = fVar;
                        String str2 = fVar.f14841a.d;
                        org.telegram.ui.Components.j10 j10Var = ka1Var.f39244a;
                        j10Var.setText(str2);
                        j10Var.a(fVar.f14852n, false);
                        j10Var.setOnTouchListener(new Object());
                        j10Var.setOnClickListener(new vy0(7, ka1Var, fVar));
                        j10Var.setOnLongClickListener(new ai.r3(6, ka1Var, fVar));
                    }
                }
                long j3 = this.f39538r.f40194c;
                if (j3 > 0) {
                    gVar.f12191s0 = Arrays.binarySearch(gVar.f12175h0.f14158a, j3);
                    gVar.f12193u0 = true;
                    gVar.f12192t0.setVisibility(0);
                    gVar.f12194v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f12216k) - ig.g.f12141k1);
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
                    gVar.f12200y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f12201z0 = obj;
                    obj.f14862f = 0.0f;
                    ofFloat.addUpdateListener(new y11(this, 12));
                    ofFloat.addListener(new ja1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = na1Var.f40193b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            w51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        ig.g gVar = this.f39533b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.f39538r.f40195e;
        ig.g gVar2 = this.f39534c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f39538r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f39538r.d.d.size();
                arrayList = this.f39537n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((jg.a) bVar.d.get(i12)).f14153c.equals(((jg.a) this.f39538r.d.d.get(i10)).f14153c)) {
                            boolean z12 = ((ka1) arrayList.get(i10)).f39244a.f27498b;
                            ((kg.f) arrayList2.get(i12)).f14852n = z12;
                            kg.f fVar = (kg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f14853o = f7;
                            ((ka1) arrayList.get(i10)).f39244a.f27499c = true;
                            ((ka1) arrayList.get(i10)).f39244a.animate().alpha(1.0f).start();
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
                    ((ka1) arrayList.get(i10)).f39244a.f27499c = false;
                    ((ka1) arrayList.get(i10)).f39244a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f39538r.d.d.size(); i13++) {
                    ((ka1) arrayList.get(i13)).f39244a.f27499c = true;
                    ((ka1) arrayList.get(i13)).f39244a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f39538r.f40194c = selectedDate;
        gVar.f12192t0.setAlpha(0.0f);
        gVar.f12194v0 = 0.0f;
        gVar.f12193u0 = false;
        gVar.f12178i1 = false;
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
            gVar.f12200y0 = 0;
            gVar2.f12200y0 = 0;
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
        na1 na1Var = this.f39538r;
        if (na1Var != null && (bVar = na1Var.d) != null && bVar.f14158a != null) {
            kg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f14817a;
            ig.g gVar = this.f39533b;
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
            gVar.f12192t0.f14834f.setAlpha(1.0f);
            ig.g gVar2 = this.f39534c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f39538r.f40194c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f39537n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f39532a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ka1 ka1Var = (ka1) obj;
                    ka1Var.f39244a.setAlpha(1.0f);
                    ka1Var.f39244a.f27499c = true;
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
                ka1Var2.f39244a.animate().alpha(1.0f).start();
                ka1Var2.f39244a.f27499c = true;
            }
            a2.start();
        }
    }
}
