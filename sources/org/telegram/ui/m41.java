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
public abstract class m41 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Window f49727a;
    public final lg.g f49728b;
    public final lg.g f49729c;
    public final ng.c d;
    public final RadialProgressView f49730e;
    public final TextView f49731f;
    public final ih0 h;
    public final ArrayList f49732n;
    public o41 f49733r;
    public final int f49734s;

    public m41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f49732n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f49727a = ((Activity) context).getWindow();
        } else {
            this.f49727a = null;
        }
        this.f49734s = i7;
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        this.h = new ih0(context, 10);
        ng.c cVar = new ng.c(getContext(), h6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final m41 f48550b;

            {
                this.f48550b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48550b.h(true);
                        return;
                    case 1:
                        this.f48550b.c();
                        return;
                    default:
                        this.f48550b.f49729c.c(false);
                        return;
                }
            }
        });
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            this.f49728b = new lg.g(getContext(), null);
                            lg.g gVar = new lg.g(getContext(), null);
                            this.f49729c = gVar;
                            gVar.f19817u0.E = true;
                        } else {
                            this.f49728b = new lg.g(getContext(), null);
                            lg.g gVar2 = new lg.g(getContext(), null);
                            this.f49729c = gVar2;
                            gVar2.f19817u0.E = true;
                        }
                    } else {
                        lg.q qVar = new lg.q(getContext());
                        this.f49728b = qVar;
                        qVar.f19817u0.F = true;
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
                        qVar2.f19801i1 = true;
                        this.f49729c = qVar2;
                    }
                } else {
                    lg.g gVar3 = new lg.g(getContext(), null);
                    gVar3.f19822x0 = true;
                    gVar3.f19824y0 = true;
                    this.f49728b = gVar3;
                    lg.g gVar4 = new lg.g(getContext(), null);
                    this.f49729c = gVar4;
                    gVar4.f19817u0.E = true;
                }
            } else {
                this.f49728b = new lg.p(getContext(), h6Var);
                lg.p pVar = new lg.p(getContext(), h6Var);
                this.f49729c = pVar;
                pVar.f19817u0.E = true;
            }
        } else {
            this.f49728b = new lg.g(getContext(), h6Var);
            lg.g gVar5 = new lg.g(getContext(), h6Var);
            this.f49729c = gVar5;
            gVar5.f19817u0.E = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f49728b.f19779a = fVar;
        this.f49729c.f19779a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f49730e = radialProgressView;
        frameLayout.addView(this.f49728b);
        frameLayout.addView(this.f49728b.f19817u0, -2, -2);
        frameLayout.addView(this.f49729c);
        frameLayout.addView(this.f49729c.f19817u0, -2, -2);
        frameLayout.addView(radialProgressView, c8.na.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f49731f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.s5, h6Var);
        this.f49728b.setDateSelectionListener(new qi0(this, 17));
        this.f49728b.f19817u0.d(false, false);
        this.f49728b.f19817u0.setOnTouchListener(new Object());
        this.f49728b.f19817u0.setOnClickListener(new View.OnClickListener(this) {
            public final m41 f48550b;

            {
                this.f48550b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48550b.h(true);
                        return;
                    case 1:
                        this.f48550b.c();
                        return;
                    default:
                        this.f48550b.f49729c.c(false);
                        return;
                }
            }
        });
        this.f49729c.f19817u0.setOnClickListener(new View.OnClickListener(this) {
            public final m41 f48550b;

            {
                this.f48550b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f48550b.h(true);
                        return;
                    case 1:
                        this.f48550b.c();
                        return;
                    default:
                        this.f48550b.f49729c.c(false);
                        return;
                }
            }
        });
        this.f49728b.setVisibility(0);
        this.f49729c.setVisibility(4);
        this.f49728b.setHeader(this.d);
        g10.addView(this.d, c8.na.c(52.0f, -1));
        g10.addView(frameLayout, c8.na.c(-2.0f, -1));
        g10.addView(this.h, c8.na.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f49734s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
        }
        addView(g10);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f10;
        Window window = this.f49727a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.f49728b;
        gVar.K = false;
        lg.g gVar2 = this.f49729c;
        gVar2.K = false;
        gVar.f19825z0 = 2;
        gVar2.f19825z0 = 1;
        final ?? obj = new Object();
        lg.j jVar = gVar.f19798h0;
        obj.f21514b = jVar.f19841l;
        obj.f21513a = jVar.f19840k;
        int binarySearch = Arrays.binarySearch(this.f49733r.d.f20978a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f49733r.d.f20978a.length - 1;
        }
        obj.f21515c = this.f49733r.d.f20979b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.A0 = obj;
        gVar.A0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i7 = 0; i7 < this.f49733r.d.d.size(); i7++) {
            if (((mg.a) this.f49733r.d.d.get(i7)).f20971a[binarySearch] > j10) {
                j10 = ((mg.a) this.f49733r.d.d.get(i7)).f20971a[binarySearch];
            }
            if (((mg.a) this.f49733r.d.d.get(i7)).f20971a[binarySearch] < j11) {
                j11 = ((mg.a) this.f49733r.d.d.get(i7)).f20971a[binarySearch];
            }
        }
        float f11 = ((float) j11) + ((float) (j10 - j11));
        float f12 = gVar.f19821x;
        final float f13 = (f11 - f12) / (gVar.f19819w - f12);
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
                m41 m41Var = m41.this;
                lg.g gVar3 = m41Var.f49728b;
                float f15 = gVar3.G0;
                lg.j jVar2 = gVar3.f19798h0;
                float f16 = jVar2.f19841l;
                float f17 = jVar2.f19840k;
                float f18 = ((f15 / (f16 - f17)) * f17) - lg.g.l1;
                RectF rectF = gVar3.I0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                ng.j jVar3 = obj;
                jVar3.f21516e = height;
                jVar3.d = (gVar3.H0 * jVar3.f21515c) - f18;
                jVar3.f21517f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = m41Var.f49729c;
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
        lg.g gVar = this.f49728b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.f49729c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        o41 o41Var = this.f49733r;
        if (o41Var != null && (bVar = o41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f49733r.d.d.size(); i10++) {
                if (((mg.a) this.f49733r.d.d.get(i10)).f20976g >= 0 && org.telegram.ui.ActionBar.m6.f1(((mg.a) this.f49733r.d.d.get(i10)).f20976g)) {
                    i7 = org.telegram.ui.ActionBar.m6.x0(null, ((mg.a) this.f49733r.d.d.get(i10)).f20976g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false)) < 0.5d) {
                    i7 = ((mg.a) this.f49733r.d.d.get(i10)).f20977i;
                } else {
                    i7 = ((mg.a) this.f49733r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f49732n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.xz xzVar = ((l41) arrayList2.get(i10)).f49453a;
                    xzVar.getClass();
                    xzVar.f42246r = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false);
                    xzVar.f42248w = -1;
                    xzVar.f42247s = i7;
                    xzVar.invalidate();
                }
            }
        }
        this.f49730e.setProgressColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29421h6, false));
        this.f49731f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.s5, false));
    }

    public final void e(o41 o41Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (o41Var != null) {
            String str = o41Var.f50468j;
            ng.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            lg.g gVar = this.f49728b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            lg.j jVar = gVar.f19798h0;
            lg.g gVar2 = this.f49729c;
            gVar2.setLandscape(z11);
            this.f49733r = o41Var;
            boolean z13 = o41Var.f50470l;
            ArrayList arrayList2 = this.f49732n;
            ih0 ih0Var = this.h;
            RadialProgressView radialProgressView = this.f49730e;
            TextView textView = this.f49731f;
            if (!z13 && !o41Var.f50461a) {
                textView.setVisibility(8);
                ng.e eVar = gVar.f19817u0;
                boolean z14 = o41Var.f50472n;
                eVar.f21485a = z14;
                cVar.c(!z14);
                if (o41Var.d == null && o41Var.f50465f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(o41Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(o41Var.d) && o41Var.h) {
                    jVar.f19840k = 0.0f;
                    jVar.f19841l = 1.0f;
                    jVar.f19832a.A(true, false, false);
                }
                cVar.setUseWeekInterval(o41Var.f50473o);
                gVar.f19817u0.setUseWeek(o41Var.f50473o);
                ng.e eVar2 = gVar.f19817u0;
                if (this.f49733r.f50466g == null && this.f49734s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.G = z12;
                gVar2.f19817u0.G = false;
                eVar2.setEnabled(eVar2.G);
                ng.e eVar3 = gVar2.f19817u0;
                eVar3.setEnabled(eVar3.G);
                int size = arrayList.size();
                ih0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i7 = 0; i7 < size; i7++) {
                        ng.f fVar = (ng.f) arrayList.get(i7);
                        l41 l41Var = new l41(this, i7);
                        l41Var.f49454b = fVar;
                        String str2 = fVar.f21496a.d;
                        org.telegram.ui.Components.xz xzVar = l41Var.f49453a;
                        xzVar.setText(str2);
                        xzVar.a(fVar.f21507n, false);
                        xzVar.setOnTouchListener(new Object());
                        xzVar.setOnClickListener(new jg0(15, l41Var, fVar));
                        xzVar.setOnLongClickListener(new fi.z1(7, l41Var, fVar));
                    }
                }
                long j3 = this.f49733r.f50463c;
                if (j3 > 0) {
                    gVar.f19816t0 = Arrays.binarySearch(gVar.f19800i0.f20978a, j3);
                    gVar.f19818v0 = true;
                    gVar.f19817u0.setVisibility(0);
                    gVar.f19820w0 = 1.0f;
                    gVar.x((gVar.H0 * jVar.f19840k) - lg.g.l1);
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
                    gVar.f19825z0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.A0 = obj;
                    obj.f21517f = 0.0f;
                    ofFloat.addUpdateListener(new iz0(this, 8));
                    ofFloat.addListener(new k41(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = o41Var.f50462b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            ih0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f10;
        lg.g gVar = this.f49728b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.f49733r.f50464e;
        lg.g gVar2 = this.f49729c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f49733r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f49733r.d.d.size();
                arrayList = this.f49732n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((mg.a) bVar.d.get(i11)).f20973c.equals(((mg.a) this.f49733r.d.d.get(i7)).f20973c)) {
                            boolean z12 = ((l41) arrayList.get(i7)).f49453a.f42241b;
                            ((ng.f) arrayList2.get(i11)).f21507n = z12;
                            ng.f fVar = (ng.f) arrayList2.get(i11);
                            if (z12) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f21508o = f10;
                            ((l41) arrayList.get(i7)).f49453a.f42242c = true;
                            ((l41) arrayList.get(i7)).f49453a.animate().alpha(1.0f).start();
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
                    ((l41) arrayList.get(i7)).f49453a.f42242c = false;
                    ((l41) arrayList.get(i7)).f49453a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f49733r.d.d.size(); i12++) {
                    ((l41) arrayList.get(i12)).f49453a.f42242c = true;
                    ((l41) arrayList.get(i12)).f49453a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f49733r.f50463c = selectedDate;
        gVar.f19817u0.setAlpha(0.0f);
        gVar.f19820w0 = 0.0f;
        gVar.f19818v0 = false;
        gVar.f19803j1 = false;
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
            gVar.f19825z0 = 0;
            gVar2.f19825z0 = 0;
            gVar.K = false;
            gVar2.K = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new k41(this, 0));
        a10.start();
    }

    public final void h(boolean z10) {
        mg.b bVar;
        o41 o41Var = this.f49733r;
        if (o41Var != null && (bVar = o41Var.d) != null && bVar.f20978a != null) {
            ng.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f21472a;
            lg.g gVar = this.f49728b;
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
            gVar.f19817u0.f21489f.setAlpha(1.0f);
            lg.g gVar2 = this.f49729c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f49733r.f50463c = 0L;
            int i7 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f49732n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.K = true;
                gVar2.K = false;
                gVar.invalidate();
                Window window = this.f49727a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    l41 l41Var = (l41) obj;
                    l41Var.f49453a.setAlpha(1.0f);
                    l41Var.f49453a.f42242c = true;
                }
                return;
            }
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new k41(this, 1));
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                l41 l41Var2 = (l41) obj2;
                l41Var2.f49453a.animate().alpha(1.0f).start();
                l41Var2.f49453a.f42242c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f49728b != null && this.f49729c != null && this.d != null && this.f49730e != null && this.f49731f != null) {
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
