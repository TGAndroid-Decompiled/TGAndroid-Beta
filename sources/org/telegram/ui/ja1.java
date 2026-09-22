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
public abstract class ja1 extends FrameLayout {
    public final Window f34829a;
    public final ig.g f34830b;
    public final ig.g f34831c;
    public final kg.c d;
    public final RadialProgressView e;
    public final TextView f34832f;
    public final t51 h;
    public final ArrayList f34833n;
    public la1 f34834r;
    public final int f34835s;

    public ja1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f34833n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f34829a = ((Activity) context).getWindow();
        } else {
            this.f34829a = null;
        }
        this.f34835s = i10;
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        this.h = new t51(context, 2);
        kg.c cVar = new kg.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final ja1 f33558b;

            {
                this.f33558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33558b.h(true);
                        return;
                    case 1:
                        this.f33558b.c();
                        return;
                    default:
                        this.f33558b.f34831c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f34830b = new ig.g(getContext(), null);
                            ig.g gVar = new ig.g(getContext(), null);
                            this.f34831c = gVar;
                            gVar.f11164t0.f13619y = true;
                        } else {
                            this.f34830b = new ig.g(getContext(), null);
                            ig.g gVar2 = new ig.g(getContext(), null);
                            this.f34831c = gVar2;
                            gVar2.f11164t0.f13619y = true;
                        }
                    } else {
                        ig.q qVar = new ig.q(getContext());
                        this.f34830b = qVar;
                        qVar.f11164t0.E = true;
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
                            qVar2.R1[i11] = a4.a.n(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f11148h1 = true;
                        this.f34831c = qVar2;
                    }
                } else {
                    ig.g gVar3 = new ig.g(getContext(), null);
                    gVar3.f11168w0 = true;
                    gVar3.f11170x0 = true;
                    this.f34830b = gVar3;
                    ig.g gVar4 = new ig.g(getContext(), null);
                    this.f34831c = gVar4;
                    gVar4.f11164t0.f13619y = true;
                }
            } else {
                this.f34830b = new ig.p(getContext(), e6Var);
                ig.p pVar = new ig.p(getContext(), e6Var);
                this.f34831c = pVar;
                pVar.f11164t0.f13619y = true;
            }
        } else {
            this.f34830b = new ig.g(getContext(), e6Var);
            ig.g gVar5 = new ig.g(getContext(), e6Var);
            this.f34831c = gVar5;
            gVar5.f11164t0.f13619y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34830b.f11129a = fVar;
        this.f34831c.f11129a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f34830b);
        frameLayout.addView(this.f34830b.f11164t0, -2, -2);
        frameLayout.addView(this.f34831c);
        frameLayout.addView(this.f34831c.f11164t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.x5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f34832f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19107s5, e6Var));
        this.f34830b.setDateSelectionListener(new tl0(this, 19));
        this.f34830b.f11164t0.d(false, false);
        this.f34830b.f11164t0.setOnTouchListener(new Object());
        this.f34830b.f11164t0.setOnClickListener(new View.OnClickListener(this) {
            public final ja1 f33558b;

            {
                this.f33558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33558b.h(true);
                        return;
                    case 1:
                        this.f33558b.c();
                        return;
                    default:
                        this.f33558b.f34831c.c(false);
                        return;
                }
            }
        });
        this.f34831c.f11164t0.setOnClickListener(new View.OnClickListener(this) {
            public final ja1 f33558b;

            {
                this.f33558b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f33558b.h(true);
                        return;
                    case 1:
                        this.f33558b.c();
                        return;
                    default:
                        this.f33558b.f34831c.c(false);
                        return;
                }
            }
        });
        this.f34830b.setVisibility(0);
        this.f34831c.setVisibility(4);
        this.f34830b.setHeader(this.d);
        f7.addView(this.d, w7.x5.c(52.0f, -1));
        f7.addView(frameLayout, w7.x5.c(-2.0f, -1));
        f7.addView(this.h, w7.x5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f34835s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f34829a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ig.g gVar = this.f34830b;
        gVar.J = false;
        ig.g gVar2 = this.f34831c;
        gVar2.J = false;
        gVar.f11172y0 = 2;
        gVar2.f11172y0 = 1;
        final ?? obj = new Object();
        ig.j jVar = gVar.f11145g0;
        obj.f13637b = jVar.f11187l;
        obj.f13636a = jVar.f11186k;
        int binarySearch = Arrays.binarySearch(this.f34834r.d.f13000a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f34834r.d.f13000a.length - 1;
        }
        obj.f13638c = this.f34834r.d.f13001b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f11173z0 = obj;
        gVar.f11173z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f34834r.d.d.size(); i10++) {
            if (((jg.a) this.f34834r.d.d.get(i10)).f12994a[binarySearch] > j10) {
                j10 = ((jg.a) this.f34834r.d.d.get(i10)).f12994a[binarySearch];
            }
            if (((jg.a) this.f34834r.d.d.get(i10)).f12994a[binarySearch] < j11) {
                j11 = ((jg.a) this.f34834r.d.d.get(i10)).f12994a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f11167w;
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
                ja1 ja1Var = ja1.this;
                ig.g gVar3 = ja1Var.f34830b;
                float f14 = gVar3.F0;
                ig.j jVar2 = gVar3.f11145g0;
                float f15 = jVar2.f11187l;
                float f16 = jVar2.f11186k;
                float f17 = ((f14 / (f15 - f16)) * f16) - ig.g.f11114k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                kg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f13638c) - f17;
                jVar3.f13639f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = ja1Var.f34831c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(la1 la1Var);

    public abstract void c();

    public final void d() {
        jg.b bVar;
        ArrayList arrayList;
        int i10;
        ig.g gVar = this.f34830b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.f34831c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        la1 la1Var = this.f34834r;
        if (la1Var != null && (bVar = la1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f34834r.d.d.size(); i11++) {
                if (((jg.a) this.f34834r.d.d.get(i11)).f12998g >= 0 && org.telegram.ui.ActionBar.i6.c1(((jg.a) this.f34834r.d.d.get(i11)).f12998g)) {
                    i10 = org.telegram.ui.ActionBar.i6.w0(null, ((jg.a) this.f34834r.d.d.get(i11)).f12998g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false)) < 0.5d) {
                    i10 = ((jg.a) this.f34834r.d.d.get(i11)).f12999i;
                } else {
                    i10 = ((jg.a) this.f34834r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f34833n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.s00 s00Var = ((ia1) arrayList2.get(i11)).f34587a;
                    s00Var.getClass();
                    s00Var.f27726r = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18834d6, false);
                    s00Var.v = -1;
                    s00Var.f27727s = i10;
                    s00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18905h6, false));
        this.f34832f.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19107s5, false));
    }

    public final void e(la1 la1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (la1Var != null) {
            String str = la1Var.f35373j;
            kg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ig.g gVar = this.f34830b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            ig.j jVar = gVar.f11145g0;
            ig.g gVar2 = this.f34831c;
            gVar2.setLandscape(z11);
            this.f34834r = la1Var;
            boolean z13 = la1Var.f35375l;
            ArrayList arrayList2 = this.f34833n;
            t51 t51Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f34832f;
            if (!z13 && !la1Var.f35367a) {
                textView.setVisibility(8);
                kg.e eVar = gVar.f11164t0;
                boolean z14 = la1Var.f35377n;
                eVar.f13610a = z14;
                cVar.c(!z14);
                if (la1Var.d == null && la1Var.f35370f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(la1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(la1Var.d) && la1Var.h) {
                    jVar.f11186k = 0.0f;
                    jVar.f11187l = 1.0f;
                    jVar.f11179a.A(true, false, false);
                }
                cVar.setUseWeekInterval(la1Var.f35378o);
                gVar.f11164t0.setUseWeek(la1Var.f35378o);
                kg.e eVar2 = gVar.f11164t0;
                if (this.f34834r.f35371g == null && this.f34835s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f11164t0.F = false;
                eVar2.setEnabled(eVar2.F);
                kg.e eVar3 = gVar2.f11164t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                t51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        kg.f fVar = (kg.f) arrayList.get(i10);
                        ia1 ia1Var = new ia1(this, i10);
                        ia1Var.f34588b = fVar;
                        String str2 = fVar.f13620a.d;
                        org.telegram.ui.Components.s00 s00Var = ia1Var.f34587a;
                        s00Var.setText(str2);
                        s00Var.a(fVar.f13630n, false);
                        s00Var.setOnTouchListener(new Object());
                        s00Var.setOnClickListener(new wy0(7, ia1Var, fVar));
                        s00Var.setOnLongClickListener(new ai.q3(6, ia1Var, fVar));
                    }
                }
                long j3 = this.f34834r.f35369c;
                if (j3 > 0) {
                    gVar.f11163s0 = Arrays.binarySearch(gVar.f11147h0.f13000a, j3);
                    gVar.f11165u0 = true;
                    gVar.f11164t0.setVisibility(0);
                    gVar.f11166v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f11186k) - ig.g.f11114k1);
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
                    gVar.f11172y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f11173z0 = obj;
                    obj.f13639f = 0.0f;
                    ofFloat.addUpdateListener(new a21(this, 12));
                    ofFloat.addListener(new ha1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = la1Var.f35368b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            t51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        ig.g gVar = this.f34830b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.f34834r.e;
        ig.g gVar2 = this.f34831c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f34834r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f34834r.d.d.size();
                arrayList = this.f34833n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((jg.a) bVar.d.get(i12)).f12996c.equals(((jg.a) this.f34834r.d.d.get(i10)).f12996c)) {
                            boolean z12 = ((ia1) arrayList.get(i10)).f34587a.f27722b;
                            ((kg.f) arrayList2.get(i12)).f13630n = z12;
                            kg.f fVar = (kg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f13631o = f7;
                            ((ia1) arrayList.get(i10)).f34587a.f27723c = true;
                            ((ia1) arrayList.get(i10)).f34587a.animate().alpha(1.0f).start();
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
                    ((ia1) arrayList.get(i10)).f34587a.f27723c = false;
                    ((ia1) arrayList.get(i10)).f34587a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f34834r.d.d.size(); i13++) {
                    ((ia1) arrayList.get(i13)).f34587a.f27723c = true;
                    ((ia1) arrayList.get(i13)).f34587a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f34834r.f35369c = selectedDate;
        gVar.f11164t0.setAlpha(0.0f);
        gVar.f11166v0 = 0.0f;
        gVar.f11165u0 = false;
        gVar.f11150i1 = false;
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
            gVar.f11172y0 = 0;
            gVar2.f11172y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new ha1(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        jg.b bVar;
        la1 la1Var = this.f34834r;
        if (la1Var != null && (bVar = la1Var.d) != null && bVar.f13000a != null) {
            kg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f13599a;
            ig.g gVar = this.f34830b;
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
            gVar.f11164t0.f13613f.setAlpha(1.0f);
            ig.g gVar2 = this.f34831c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f34834r.f35369c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f34833n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f34829a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ia1 ia1Var = (ia1) obj;
                    ia1Var.f34587a.setAlpha(1.0f);
                    ia1Var.f34587a.f27723c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new ha1(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ia1 ia1Var2 = (ia1) obj2;
                ia1Var2.f34587a.animate().alpha(1.0f).start();
                ia1Var2.f34587a.f27723c = true;
            }
            a2.start();
        }
    }
}
