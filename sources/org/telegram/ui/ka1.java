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
public abstract class ka1 extends FrameLayout {
    public final Window f39282a;
    public final ig.g f39283b;
    public final ig.g f39284c;
    public final kg.c d;
    public final RadialProgressView f39285e;
    public final TextView f39286f;
    public final v51 h;
    public final ArrayList f39287n;
    public ma1 f39288r;
    public final int f39289s;

    public ka1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f39287n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f39282a = ((Activity) context).getWindow();
        } else {
            this.f39282a = null;
        }
        this.f39289s = i10;
        LinearLayout e7 = org.telegram.messenger.ai.e(context, 1);
        this.h = new v51(context, 2);
        kg.c cVar = new kg.c(getContext(), d6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final ka1 f38036b;

            {
                this.f38036b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38036b.h(true);
                        return;
                    case 1:
                        this.f38036b.c();
                        return;
                    default:
                        this.f38036b.f39284c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f39283b = new ig.g(getContext(), null);
                            ig.g gVar = new ig.g(getContext(), null);
                            this.f39284c = gVar;
                            gVar.f12191t0.f14839y = true;
                        } else {
                            this.f39283b = new ig.g(getContext(), null);
                            ig.g gVar2 = new ig.g(getContext(), null);
                            this.f39284c = gVar2;
                            gVar2.f12191t0.f14839y = true;
                        }
                    } else {
                        ig.q qVar = new ig.q(getContext());
                        this.f39283b = qVar;
                        qVar.f12191t0.E = true;
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
                        qVar2.f12175h1 = true;
                        this.f39284c = qVar2;
                    }
                } else {
                    ig.g gVar3 = new ig.g(getContext(), null);
                    gVar3.f12195w0 = true;
                    gVar3.f12197x0 = true;
                    this.f39283b = gVar3;
                    ig.g gVar4 = new ig.g(getContext(), null);
                    this.f39284c = gVar4;
                    gVar4.f12191t0.f14839y = true;
                }
            } else {
                this.f39283b = new ig.p(getContext(), d6Var);
                ig.p pVar = new ig.p(getContext(), d6Var);
                this.f39284c = pVar;
                pVar.f12191t0.f14839y = true;
            }
        } else {
            this.f39283b = new ig.g(getContext(), d6Var);
            ig.g gVar5 = new ig.g(getContext(), d6Var);
            this.f39284c = gVar5;
            gVar5.f12191t0.f14839y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f39283b.f12155a = fVar;
        this.f39284c.f12155a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f39285e = radialProgressView;
        frameLayout.addView(this.f39283b);
        frameLayout.addView(this.f39283b.f12191t0, -2, -2);
        frameLayout.addView(this.f39284c);
        frameLayout.addView(this.f39284c.f12191t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.x5.a(44.0f, 0.0f, 0.0f, 0.0f, 60.0f, 44, 17));
        TextView textView = new TextView(context);
        this.f39286f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, -2, 17));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21098s5, d6Var));
        this.f39283b.setDateSelectionListener(new gq0(this, 18));
        this.f39283b.f12191t0.d(false, false);
        this.f39283b.f12191t0.setOnTouchListener(new Object());
        this.f39283b.f12191t0.setOnClickListener(new View.OnClickListener(this) {
            public final ka1 f38036b;

            {
                this.f38036b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38036b.h(true);
                        return;
                    case 1:
                        this.f38036b.c();
                        return;
                    default:
                        this.f38036b.f39284c.c(false);
                        return;
                }
            }
        });
        this.f39284c.f12191t0.setOnClickListener(new View.OnClickListener(this) {
            public final ka1 f38036b;

            {
                this.f38036b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38036b.h(true);
                        return;
                    case 1:
                        this.f38036b.c();
                        return;
                    default:
                        this.f38036b.f39284c.c(false);
                        return;
                }
            }
        });
        this.f39283b.setVisibility(0);
        this.f39284c.setVisibility(4);
        this.f39283b.setHeader(this.d);
        e7.addView(this.d, w7.x5.d(52.0f, -1));
        e7.addView(frameLayout, w7.x5.d(-2.0f, -1));
        e7.addView(this.h, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 7));
        if (this.f39289s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e7.setClipChildren(false);
            e7.setClipToPadding(false);
        }
        addView(e7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f39282a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ig.g gVar = this.f39283b;
        gVar.J = false;
        ig.g gVar2 = this.f39284c;
        gVar2.J = false;
        gVar.f12199y0 = 2;
        gVar2.f12199y0 = 1;
        final ?? obj = new Object();
        ig.j jVar = gVar.f12172g0;
        obj.f14858b = jVar.f12216l;
        obj.f14857a = jVar.f12215k;
        int binarySearch = Arrays.binarySearch(this.f39288r.d.f14157a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f39288r.d.f14157a.length - 1;
        }
        obj.f14859c = this.f39288r.d.f14158b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f12200z0 = obj;
        gVar.f12200z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f39288r.d.d.size(); i10++) {
            if (((jg.a) this.f39288r.d.d.get(i10)).f14150a[binarySearch] > j10) {
                j10 = ((jg.a) this.f39288r.d.d.get(i10)).f14150a[binarySearch];
            }
            if (((jg.a) this.f39288r.d.d.get(i10)).f14150a[binarySearch] < j11) {
                j11 = ((jg.a) this.f39288r.d.d.get(i10)).f14150a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f12194w;
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
                ka1 ka1Var = ka1.this;
                ig.g gVar3 = ka1Var.f39283b;
                float f14 = gVar3.F0;
                ig.j jVar2 = gVar3.f12172g0;
                float f15 = jVar2.f12216l;
                float f16 = jVar2.f12215k;
                float f17 = ((f14 / (f15 - f16)) * f16) - ig.g.f12140k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                kg.j jVar3 = obj;
                jVar3.f14860e = height;
                jVar3.d = (gVar3.G0 * jVar3.f14859c) - f17;
                jVar3.f14861f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = ka1Var.f39284c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(ma1 ma1Var);

    public abstract void c();

    public final void d() {
        jg.b bVar;
        ArrayList arrayList;
        int i10;
        ig.g gVar = this.f39283b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.f39284c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        ma1 ma1Var = this.f39288r;
        if (ma1Var != null && (bVar = ma1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f39288r.d.d.size(); i11++) {
                if (((jg.a) this.f39288r.d.d.get(i11)).f14155g >= 0 && org.telegram.ui.ActionBar.h6.d1(((jg.a) this.f39288r.d.d.get(i11)).f14155g)) {
                    i10 = org.telegram.ui.ActionBar.h6.x0(null, ((jg.a) this.f39288r.d.d.get(i11)).f14155g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false)) < 0.5d) {
                    i10 = ((jg.a) this.f39288r.d.d.get(i11)).f14156i;
                } else {
                    i10 = ((jg.a) this.f39288r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f39287n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.j10 j10Var = ((ja1) arrayList2.get(i11)).f38996a;
                    j10Var.getClass();
                    j10Var.f27560r = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false);
                    j10Var.v = -1;
                    j10Var.f27561s = i10;
                    j10Var.invalidate();
                }
            }
        }
        this.f39285e.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20894h6, false));
        this.f39286f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21098s5, false));
    }

    public final void e(ma1 ma1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (ma1Var != null) {
            String str = ma1Var.f39922j;
            kg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ig.g gVar = this.f39283b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            ig.j jVar = gVar.f12172g0;
            ig.g gVar2 = this.f39284c;
            gVar2.setLandscape(z11);
            this.f39288r = ma1Var;
            boolean z13 = ma1Var.f39924l;
            ArrayList arrayList2 = this.f39287n;
            v51 v51Var = this.h;
            RadialProgressView radialProgressView = this.f39285e;
            TextView textView = this.f39286f;
            if (!z13 && !ma1Var.f39915a) {
                textView.setVisibility(8);
                kg.e eVar = gVar.f12191t0;
                boolean z14 = ma1Var.f39926n;
                eVar.f14829a = z14;
                cVar.c(!z14);
                if (ma1Var.d == null && ma1Var.f39919f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(ma1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(ma1Var.d) && ma1Var.h) {
                    jVar.f12215k = 0.0f;
                    jVar.f12216l = 1.0f;
                    jVar.f12207a.A(true, false, false);
                }
                cVar.setUseWeekInterval(ma1Var.f39927o);
                gVar.f12191t0.setUseWeek(ma1Var.f39927o);
                kg.e eVar2 = gVar.f12191t0;
                if (this.f39288r.f39920g == null && this.f39289s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f12191t0.F = false;
                eVar2.setEnabled(eVar2.F);
                kg.e eVar3 = gVar2.f12191t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                v51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        kg.f fVar = (kg.f) arrayList.get(i10);
                        ja1 ja1Var = new ja1(this, i10);
                        ja1Var.f38997b = fVar;
                        String str2 = fVar.f14840a.d;
                        org.telegram.ui.Components.j10 j10Var = ja1Var.f38996a;
                        j10Var.setText(str2);
                        j10Var.a(fVar.f14851n, false);
                        j10Var.setOnTouchListener(new Object());
                        j10Var.setOnClickListener(new uy0(7, ja1Var, fVar));
                        j10Var.setOnLongClickListener(new ai.r3(6, ja1Var, fVar));
                    }
                }
                long j3 = this.f39288r.f39917c;
                if (j3 > 0) {
                    gVar.f12190s0 = Arrays.binarySearch(gVar.f12174h0.f14157a, j3);
                    gVar.f12192u0 = true;
                    gVar.f12191t0.setVisibility(0);
                    gVar.f12193v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f12215k) - ig.g.f12140k1);
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
                    gVar.f12199y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f12200z0 = obj;
                    obj.f14861f = 0.0f;
                    ofFloat.addUpdateListener(new x11(this, 12));
                    ofFloat.addListener(new ia1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = ma1Var.f39916b;
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
        ig.g gVar = this.f39283b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.f39288r.f39918e;
        ig.g gVar2 = this.f39284c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f39288r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f39288r.d.d.size();
                arrayList = this.f39287n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((jg.a) bVar.d.get(i12)).f14152c.equals(((jg.a) this.f39288r.d.d.get(i10)).f14152c)) {
                            boolean z12 = ((ja1) arrayList.get(i10)).f38996a.f27555b;
                            ((kg.f) arrayList2.get(i12)).f14851n = z12;
                            kg.f fVar = (kg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f14852o = f7;
                            ((ja1) arrayList.get(i10)).f38996a.f27556c = true;
                            ((ja1) arrayList.get(i10)).f38996a.animate().alpha(1.0f).start();
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
                    ((ja1) arrayList.get(i10)).f38996a.f27556c = false;
                    ((ja1) arrayList.get(i10)).f38996a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f39288r.d.d.size(); i13++) {
                    ((ja1) arrayList.get(i13)).f38996a.f27556c = true;
                    ((ja1) arrayList.get(i13)).f38996a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f39288r.f39917c = selectedDate;
        gVar.f12191t0.setAlpha(0.0f);
        gVar.f12193v0 = 0.0f;
        gVar.f12192u0 = false;
        gVar.f12177i1 = false;
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
            gVar.f12199y0 = 0;
            gVar2.f12199y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new ia1(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        jg.b bVar;
        ma1 ma1Var = this.f39288r;
        if (ma1Var != null && (bVar = ma1Var.d) != null && bVar.f14157a != null) {
            kg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f14816a;
            ig.g gVar = this.f39283b;
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
            gVar.f12191t0.f14833f.setAlpha(1.0f);
            ig.g gVar2 = this.f39284c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f39288r.f39917c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f39287n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f39282a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ja1 ja1Var = (ja1) obj;
                    ja1Var.f38996a.setAlpha(1.0f);
                    ja1Var.f38996a.f27556c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new ia1(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ja1 ja1Var2 = (ja1) obj2;
                ja1Var2.f38996a.animate().alpha(1.0f).start();
                ja1Var2.f38996a.f27556c = true;
            }
            a2.start();
        }
    }
}
