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
public abstract class l41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final Window f47382a;
    public final lg.g f47383b;
    public final lg.g f47384c;
    public final ng.c d;
    public final RadialProgressView f47385e;
    public final TextView f47386f;
    public final rq0 h;
    public final ArrayList f47387n;
    public o41 f47388r;
    public final int f47389s;

    public l41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47387n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f47382a = ((Activity) context).getWindow();
        } else {
            this.f47382a = null;
        }
        this.f47389s = i7;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new rq0(context, 8);
        ng.c cVar = new ng.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final l41 f46197b;

            {
                this.f46197b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46197b.h(true);
                        return;
                    case 1:
                        this.f46197b.c();
                        return;
                    default:
                        this.f46197b.f47384c.c(false);
                        return;
                }
            }
        });
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            this.f47383b = new lg.g(getContext(), null);
                            lg.g gVar = new lg.g(getContext(), null);
                            this.f47384c = gVar;
                            gVar.f18319t0.D = true;
                        } else {
                            this.f47383b = new lg.g(getContext(), null);
                            lg.g gVar2 = new lg.g(getContext(), null);
                            this.f47384c = gVar2;
                            gVar2.f18319t0.D = true;
                        }
                    } else {
                        lg.q qVar = new lg.q(getContext());
                        this.f47383b = qVar;
                        qVar.f18319t0.E = true;
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
                        qVar2.f18303h1 = true;
                        this.f47384c = qVar2;
                    }
                } else {
                    lg.g gVar3 = new lg.g(getContext(), null);
                    gVar3.f18323w0 = true;
                    gVar3.f18325x0 = true;
                    this.f47383b = gVar3;
                    lg.g gVar4 = new lg.g(getContext(), null);
                    this.f47384c = gVar4;
                    gVar4.f18319t0.D = true;
                }
            } else {
                this.f47383b = new lg.p(getContext(), f6Var);
                lg.p pVar = new lg.p(getContext(), f6Var);
                this.f47384c = pVar;
                pVar.f18319t0.D = true;
            }
        } else {
            this.f47383b = new lg.g(getContext(), f6Var);
            lg.g gVar5 = new lg.g(getContext(), f6Var);
            this.f47384c = gVar5;
            gVar5.f18319t0.D = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47383b.f18283a = fVar;
        this.f47384c.f18283a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f47385e = radialProgressView;
        frameLayout.addView(this.f47383b);
        frameLayout.addView(this.f47383b.f18319t0, -2, -2);
        frameLayout.addView(this.f47384c);
        frameLayout.addView(this.f47384c.f18319t0, -2, -2);
        frameLayout.addView(radialProgressView, c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f47386f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.s5, f6Var);
        this.f47383b.setDateSelectionListener(new li0(this, 17));
        this.f47383b.f18319t0.d(false, false);
        this.f47383b.f18319t0.setOnTouchListener(new Object());
        this.f47383b.f18319t0.setOnClickListener(new View.OnClickListener(this) {
            public final l41 f46197b;

            {
                this.f46197b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46197b.h(true);
                        return;
                    case 1:
                        this.f46197b.c();
                        return;
                    default:
                        this.f46197b.f47384c.c(false);
                        return;
                }
            }
        });
        this.f47384c.f18319t0.setOnClickListener(new View.OnClickListener(this) {
            public final l41 f46197b;

            {
                this.f46197b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46197b.h(true);
                        return;
                    case 1:
                        this.f46197b.c();
                        return;
                    default:
                        this.f46197b.f47384c.c(false);
                        return;
                }
            }
        });
        this.f47383b.setVisibility(0);
        this.f47384c.setVisibility(4);
        this.f47383b.setHeader(this.d);
        f10.addView(this.d, c8.ha.c(52.0f, -1));
        f10.addView(frameLayout, c8.ha.c(-2.0f, -1));
        f10.addView(this.h, c8.ha.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f47389s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j3, boolean z9) {
        float f10;
        Window window = this.f47382a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.f47383b;
        gVar.J = false;
        lg.g gVar2 = this.f47384c;
        gVar2.J = false;
        gVar.f18327y0 = 2;
        gVar2.f18327y0 = 1;
        final ?? obj = new Object();
        lg.j jVar = gVar.f18300g0;
        obj.f20583b = jVar.f18344l;
        obj.f20582a = jVar.f18343k;
        int binarySearch = Arrays.binarySearch(this.f47388r.d.f20020a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f47388r.d.f20020a.length - 1;
        }
        obj.f20584c = this.f47388r.d.f20021b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f18328z0 = obj;
        gVar.f18328z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i7 = 0; i7 < this.f47388r.d.d.size(); i7++) {
            if (((mg.a) this.f47388r.d.d.get(i7)).f20013a[binarySearch] > j10) {
                j10 = ((mg.a) this.f47388r.d.d.get(i7)).f20013a[binarySearch];
            }
            if (((mg.a) this.f47388r.d.d.get(i7)).f20013a[binarySearch] < j11) {
                j11 = ((mg.a) this.f47388r.d.d.get(i7)).f20013a[binarySearch];
            }
        }
        float f11 = ((float) j11) + ((float) (j10 - j11));
        float f12 = gVar.f18324x;
        final float f13 = (f11 - f12) / (gVar.f18322w - f12);
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
                l41 l41Var = l41.this;
                lg.g gVar3 = l41Var.f47383b;
                float f15 = gVar3.F0;
                lg.j jVar2 = gVar3.f18300g0;
                float f16 = jVar2.f18344l;
                float f17 = jVar2.f18343k;
                float f18 = ((f15 / (f16 - f17)) * f17) - lg.g.f18269k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                ng.j jVar3 = obj;
                jVar3.f20585e = height;
                jVar3.d = (gVar3.G0 * jVar3.f20584c) - f18;
                jVar3.f20586f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = l41Var.f47384c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x1.a());
        return ofFloat;
    }

    public abstract void b(o41 o41Var);

    public abstract void c();

    public final void d() {
        mg.b bVar;
        ArrayList arrayList;
        int i7;
        lg.g gVar = this.f47383b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.f47384c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        o41 o41Var = this.f47388r;
        if (o41Var != null && (bVar = o41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f47388r.d.d.size(); i10++) {
                if (((mg.a) this.f47388r.d.d.get(i10)).f20018g >= 0 && org.telegram.ui.ActionBar.k6.f1(((mg.a) this.f47388r.d.d.get(i10)).f20018g)) {
                    i7 = org.telegram.ui.ActionBar.k6.x0(null, ((mg.a) this.f47388r.d.d.get(i10)).f20018g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false)) < 0.5d) {
                    i7 = ((mg.a) this.f47388r.d.d.get(i10)).f20019i;
                } else {
                    i7 = ((mg.a) this.f47388r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f47387n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.kz kzVar = ((k41) arrayList2.get(i10)).f47081a;
                    kzVar.getClass();
                    kzVar.f35447r = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27848d6, false);
                    kzVar.f35449w = -1;
                    kzVar.f35448s = i7;
                    kzVar.invalidate();
                }
            }
        }
        this.f47385e.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27922h6, false));
        this.f47386f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s5, false));
    }

    public final void e(o41 o41Var, boolean z9) {
        boolean z10;
        boolean z11;
        if (o41Var != null) {
            String str = o41Var.f48232j;
            ng.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = this.f47383b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            lg.j jVar = gVar.f18300g0;
            lg.g gVar2 = this.f47384c;
            gVar2.setLandscape(z10);
            this.f47388r = o41Var;
            boolean z12 = o41Var.f48234l;
            ArrayList arrayList2 = this.f47387n;
            rq0 rq0Var = this.h;
            RadialProgressView radialProgressView = this.f47385e;
            TextView textView = this.f47386f;
            if (!z12 && !o41Var.f48225a) {
                textView.setVisibility(8);
                ng.e eVar = gVar.f18319t0;
                boolean z13 = o41Var.f48236n;
                eVar.f20554a = z13;
                cVar.c(!z13);
                if (o41Var.d == null && o41Var.f48229f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(o41Var);
                    gVar.D(null);
                    return;
                }
                if (!z9) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(o41Var.d) && o41Var.h) {
                    jVar.f18343k = 0.0f;
                    jVar.f18344l = 1.0f;
                    jVar.f18335a.A(true, false, false);
                }
                cVar.setUseWeekInterval(o41Var.f48237o);
                gVar.f18319t0.setUseWeek(o41Var.f48237o);
                ng.e eVar2 = gVar.f18319t0;
                if (this.f47388r.f48230g == null && this.f47389s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.F = z11;
                gVar2.f18319t0.F = false;
                eVar2.setEnabled(eVar2.F);
                ng.e eVar3 = gVar2.f18319t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                rq0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i7 = 0; i7 < size; i7++) {
                        ng.f fVar = (ng.f) arrayList.get(i7);
                        k41 k41Var = new k41(this, i7);
                        k41Var.f47082b = fVar;
                        String str2 = fVar.f20565a.d;
                        org.telegram.ui.Components.kz kzVar = k41Var.f47081a;
                        kzVar.setText(str2);
                        kzVar.a(fVar.f20576n, false);
                        kzVar.setOnTouchListener(new Object());
                        kzVar.setOnClickListener(new fk0(13, k41Var, fVar));
                        kzVar.setOnLongClickListener(new di.f2(7, k41Var, fVar));
                    }
                }
                long j3 = this.f47388r.f48227c;
                if (j3 > 0) {
                    gVar.f18318s0 = Arrays.binarySearch(gVar.f18302h0.f20020a, j3);
                    gVar.f18320u0 = true;
                    gVar.f18319t0.setVisibility(0);
                    gVar.f18321v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f18343k) - lg.g.f18269k1);
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
                    gVar.f18327y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f18328z0 = obj;
                    obj.f20586f = 0.0f;
                    ofFloat.addUpdateListener(new gz0(this, 8));
                    ofFloat.addListener(new j41(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = o41Var.f48226b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            rq0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z9) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        lg.g gVar = this.f47383b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.f47388r.f48228e;
        lg.g gVar2 = this.f47384c;
        if (!z9 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f47388r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f47388r.d.d.size();
                arrayList = this.f47387n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((mg.a) bVar.d.get(i11)).f20015c.equals(((mg.a) this.f47388r.d.d.get(i7)).f20015c)) {
                            boolean z11 = ((k41) arrayList.get(i7)).f47081a.f35442b;
                            ((ng.f) arrayList2.get(i11)).f20576n = z11;
                            ng.f fVar = (ng.f) arrayList2.get(i11);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f20577o = f10;
                            ((k41) arrayList.get(i7)).f47081a.f35443c = true;
                            ((k41) arrayList.get(i7)).f47081a.animate().alpha(1.0f).start();
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
                    ((k41) arrayList.get(i7)).f47081a.f35443c = false;
                    ((k41) arrayList.get(i7)).f47081a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f47388r.d.d.size(); i12++) {
                    ((k41) arrayList.get(i12)).f47081a.f35443c = true;
                    ((k41) arrayList.get(i12)).f47081a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f47388r.f48227c = selectedDate;
        gVar.f18319t0.setAlpha(0.0f);
        gVar.f18321v0 = 0.0f;
        gVar.f18320u0 = false;
        gVar.f18305i1 = false;
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
            gVar.f18327y0 = 0;
            gVar2.f18327y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new j41(this, 0));
        a10.start();
    }

    public final void h(boolean z9) {
        mg.b bVar;
        o41 o41Var = this.f47388r;
        if (o41Var != null && (bVar = o41Var.d) != null && bVar.f20020a != null) {
            ng.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f20541a;
            lg.g gVar = this.f47383b;
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
            gVar.f18319t0.f20558f.setAlpha(1.0f);
            lg.g gVar2 = this.f47384c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f47388r.f48227c = 0L;
            int i7 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f47387n;
            if (!z9) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f47382a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    k41 k41Var = (k41) obj;
                    k41Var.f47081a.setAlpha(1.0f);
                    k41Var.f47081a.f35443c = true;
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
                k41Var2.f47081a.animate().alpha(1.0f).start();
                k41Var2.f47081a.f35443c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f47383b != null && this.f47384c != null && this.d != null && this.f47385e != null && this.f47386f != null) {
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
