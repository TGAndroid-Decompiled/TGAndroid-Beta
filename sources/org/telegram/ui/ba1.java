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
public abstract class ba1 extends FrameLayout {
    public final Window f32301a;
    public final ig.g f32302b;
    public final ig.g f32303c;
    public final kg.c d;
    public final RadialProgressView e;
    public final TextView f32304f;
    public final n41 h;
    public final ArrayList f32305n;
    public da1 f32306r;
    public final int f32307s;

    public ba1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f32305n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f32301a = ((Activity) context).getWindow();
        } else {
            this.f32301a = null;
        }
        this.f32307s = i10;
        LinearLayout f7 = org.telegram.messenger.qk.f(context, 1);
        this.h = new n41(context, 3);
        kg.c cVar = new kg.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final ba1 f39587b;

            {
                this.f39587b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39587b.h(true);
                        return;
                    case 1:
                        this.f39587b.c();
                        return;
                    default:
                        this.f39587b.f32303c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f32302b = new ig.g(getContext(), null);
                            ig.g gVar = new ig.g(getContext(), null);
                            this.f32303c = gVar;
                            gVar.f11155t0.f13607y = true;
                        } else {
                            this.f32302b = new ig.g(getContext(), null);
                            ig.g gVar2 = new ig.g(getContext(), null);
                            this.f32303c = gVar2;
                            gVar2.f11155t0.f13607y = true;
                        }
                    } else {
                        ig.q qVar = new ig.q(getContext());
                        this.f32302b = qVar;
                        qVar.f11155t0.E = true;
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
                        qVar2.f11139h1 = true;
                        this.f32303c = qVar2;
                    }
                } else {
                    ig.g gVar3 = new ig.g(getContext(), null);
                    gVar3.f11159w0 = true;
                    gVar3.f11161x0 = true;
                    this.f32302b = gVar3;
                    ig.g gVar4 = new ig.g(getContext(), null);
                    this.f32303c = gVar4;
                    gVar4.f11155t0.f13607y = true;
                }
            } else {
                this.f32302b = new ig.p(getContext(), e6Var);
                ig.p pVar = new ig.p(getContext(), e6Var);
                this.f32303c = pVar;
                pVar.f11155t0.f13607y = true;
            }
        } else {
            this.f32302b = new ig.g(getContext(), e6Var);
            ig.g gVar5 = new ig.g(getContext(), e6Var);
            this.f32303c = gVar5;
            gVar5.f11155t0.f13607y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f32302b.f11120a = fVar;
        this.f32303c.f11120a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f32302b);
        frameLayout.addView(this.f32302b.f11155t0, -2, -2);
        frameLayout.addView(this.f32303c);
        frameLayout.addView(this.f32303c.f11155t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.y5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f32304f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.y5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19334s5, e6Var));
        this.f32302b.setDateSelectionListener(new qk0(this, 22));
        this.f32302b.f11155t0.d(false, false);
        this.f32302b.f11155t0.setOnTouchListener(new Object());
        this.f32302b.f11155t0.setOnClickListener(new View.OnClickListener(this) {
            public final ba1 f39587b;

            {
                this.f39587b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39587b.h(true);
                        return;
                    case 1:
                        this.f39587b.c();
                        return;
                    default:
                        this.f39587b.f32303c.c(false);
                        return;
                }
            }
        });
        this.f32303c.f11155t0.setOnClickListener(new View.OnClickListener(this) {
            public final ba1 f39587b;

            {
                this.f39587b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f39587b.h(true);
                        return;
                    case 1:
                        this.f39587b.c();
                        return;
                    default:
                        this.f39587b.f32303c.c(false);
                        return;
                }
            }
        });
        this.f32302b.setVisibility(0);
        this.f32303c.setVisibility(4);
        this.f32302b.setHeader(this.d);
        f7.addView(this.d, w7.y5.c(52.0f, -1));
        f7.addView(frameLayout, w7.y5.c(-2.0f, -1));
        f7.addView(this.h, w7.y5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f32307s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f32301a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ig.g gVar = this.f32302b;
        gVar.J = false;
        ig.g gVar2 = this.f32303c;
        gVar2.J = false;
        gVar.f11163y0 = 2;
        gVar2.f11163y0 = 1;
        final ?? obj = new Object();
        ig.j jVar = gVar.f11136g0;
        obj.f13625b = jVar.f11178l;
        obj.f13624a = jVar.f11177k;
        int binarySearch = Arrays.binarySearch(this.f32306r.d.f12993a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f32306r.d.f12993a.length - 1;
        }
        obj.f13626c = this.f32306r.d.f12994b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f11164z0 = obj;
        gVar.f11164z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f32306r.d.d.size(); i10++) {
            if (((jg.a) this.f32306r.d.d.get(i10)).f12987a[binarySearch] > j10) {
                j10 = ((jg.a) this.f32306r.d.d.get(i10)).f12987a[binarySearch];
            }
            if (((jg.a) this.f32306r.d.d.get(i10)).f12987a[binarySearch] < j11) {
                j11 = ((jg.a) this.f32306r.d.d.get(i10)).f12987a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f11158w;
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
                ba1 ba1Var = ba1.this;
                ig.g gVar3 = ba1Var.f32302b;
                float f14 = gVar3.F0;
                ig.j jVar2 = gVar3.f11136g0;
                float f15 = jVar2.f11178l;
                float f16 = jVar2.f11177k;
                float f17 = ((f14 / (f15 - f16)) * f16) - ig.g.f11105k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                kg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f13626c) - f17;
                jVar3.f13627f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = ba1Var.f32303c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(da1 da1Var);

    public abstract void c();

    public final void d() {
        jg.b bVar;
        ArrayList arrayList;
        int i10;
        ig.g gVar = this.f32302b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.f32303c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        da1 da1Var = this.f32306r;
        if (da1Var != null && (bVar = da1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f32306r.d.d.size(); i11++) {
                if (((jg.a) this.f32306r.d.d.get(i11)).f12991g >= 0 && org.telegram.ui.ActionBar.i6.c1(((jg.a) this.f32306r.d.d.get(i11)).f12991g)) {
                    i10 = org.telegram.ui.ActionBar.i6.w0(null, ((jg.a) this.f32306r.d.d.get(i11)).f12991g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false)) < 0.5d) {
                    i10 = ((jg.a) this.f32306r.d.d.get(i11)).f12992i;
                } else {
                    i10 = ((jg.a) this.f32306r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f32305n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.u00 u00Var = ((aa1) arrayList2.get(i11)).f32034a;
                    u00Var.getClass();
                    u00Var.f28731r = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false);
                    u00Var.v = -1;
                    u00Var.f28732s = i10;
                    u00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19129h6, false));
        this.f32304f.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19334s5, false));
    }

    public final void e(da1 da1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (da1Var != null) {
            String str = da1Var.f32912j;
            kg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ig.g gVar = this.f32302b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            ig.j jVar = gVar.f11136g0;
            ig.g gVar2 = this.f32303c;
            gVar2.setLandscape(z11);
            this.f32306r = da1Var;
            boolean z13 = da1Var.f32914l;
            ArrayList arrayList2 = this.f32305n;
            n41 n41Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f32304f;
            if (!z13 && !da1Var.f32906a) {
                textView.setVisibility(8);
                kg.e eVar = gVar.f11155t0;
                boolean z14 = da1Var.f32916n;
                eVar.f13598a = z14;
                cVar.c(!z14);
                if (da1Var.d == null && da1Var.f32909f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(da1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(da1Var.d) && da1Var.h) {
                    jVar.f11177k = 0.0f;
                    jVar.f11178l = 1.0f;
                    jVar.f11170a.A(true, false, false);
                }
                cVar.setUseWeekInterval(da1Var.f32917o);
                gVar.f11155t0.setUseWeek(da1Var.f32917o);
                kg.e eVar2 = gVar.f11155t0;
                if (this.f32306r.f32910g == null && this.f32307s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f11155t0.F = false;
                eVar2.setEnabled(eVar2.F);
                kg.e eVar3 = gVar2.f11155t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                n41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        kg.f fVar = (kg.f) arrayList.get(i10);
                        aa1 aa1Var = new aa1(this, i10);
                        aa1Var.f32035b = fVar;
                        String str2 = fVar.f13608a.d;
                        org.telegram.ui.Components.u00 u00Var = aa1Var.f32034a;
                        u00Var.setText(str2);
                        u00Var.a(fVar.f13618n, false);
                        u00Var.setOnTouchListener(new Object());
                        u00Var.setOnClickListener(new py0(7, aa1Var, fVar));
                        u00Var.setOnLongClickListener(new ai.q3(6, aa1Var, fVar));
                    }
                }
                long j3 = this.f32306r.f32908c;
                if (j3 > 0) {
                    gVar.f11154s0 = Arrays.binarySearch(gVar.f11138h0.f12993a, j3);
                    gVar.f11156u0 = true;
                    gVar.f11155t0.setVisibility(0);
                    gVar.f11157v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f11177k) - ig.g.f11105k1);
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
                    gVar.f11163y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f11164z0 = obj;
                    obj.f13627f = 0.0f;
                    ofFloat.addUpdateListener(new b21(this, 11));
                    ofFloat.addListener(new z91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = da1Var.f32907b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            n41Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        ig.g gVar = this.f32302b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.f32306r.e;
        ig.g gVar2 = this.f32303c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f32306r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f32306r.d.d.size();
                arrayList = this.f32305n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((jg.a) bVar.d.get(i12)).f12989c.equals(((jg.a) this.f32306r.d.d.get(i10)).f12989c)) {
                            boolean z12 = ((aa1) arrayList.get(i10)).f32034a.f28727b;
                            ((kg.f) arrayList2.get(i12)).f13618n = z12;
                            kg.f fVar = (kg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f13619o = f7;
                            ((aa1) arrayList.get(i10)).f32034a.f28728c = true;
                            ((aa1) arrayList.get(i10)).f32034a.animate().alpha(1.0f).start();
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
                    ((aa1) arrayList.get(i10)).f32034a.f28728c = false;
                    ((aa1) arrayList.get(i10)).f32034a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f32306r.d.d.size(); i13++) {
                    ((aa1) arrayList.get(i13)).f32034a.f28728c = true;
                    ((aa1) arrayList.get(i13)).f32034a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f32306r.f32908c = selectedDate;
        gVar.f11155t0.setAlpha(0.0f);
        gVar.f11157v0 = 0.0f;
        gVar.f11156u0 = false;
        gVar.f11141i1 = false;
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
            gVar.f11163y0 = 0;
            gVar2.f11163y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new z91(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        jg.b bVar;
        da1 da1Var = this.f32306r;
        if (da1Var != null && (bVar = da1Var.d) != null && bVar.f12993a != null) {
            kg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f13587a;
            ig.g gVar = this.f32302b;
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
            gVar.f11155t0.f13601f.setAlpha(1.0f);
            ig.g gVar2 = this.f32303c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f32306r.f32908c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f32305n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f32301a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    aa1 aa1Var = (aa1) obj;
                    aa1Var.f32034a.setAlpha(1.0f);
                    aa1Var.f32034a.f28728c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new z91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                aa1 aa1Var2 = (aa1) obj2;
                aa1Var2.f32034a.animate().alpha(1.0f).start();
                aa1Var2.f32034a.f28728c = true;
            }
            a2.start();
        }
    }
}
