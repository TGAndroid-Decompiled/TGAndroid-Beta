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
public abstract class j41 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Window f48200a;
    public final lg.g f48201b;
    public final lg.g f48202c;
    public final ng.c d;
    public final RadialProgressView f48203e;
    public final TextView f48204f;
    public final eh0 h;
    public final ArrayList f48205n;
    public l41 f48206r;
    public final int f48207s;

    public j41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f48205n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f48200a = ((Activity) context).getWindow();
        } else {
            this.f48200a = null;
        }
        this.f48207s = i7;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new eh0(context, 10);
        ng.c cVar = new ng.c(getContext(), e6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final j41 f46982b;

            {
                this.f46982b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46982b.h(true);
                        return;
                    case 1:
                        this.f46982b.c();
                        return;
                    default:
                        this.f46982b.f48202c.c(false);
                        return;
                }
            }
        });
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            this.f48201b = new lg.g(getContext(), null);
                            lg.g gVar = new lg.g(getContext(), null);
                            this.f48202c = gVar;
                            gVar.f19456u0.E = true;
                        } else {
                            this.f48201b = new lg.g(getContext(), null);
                            lg.g gVar2 = new lg.g(getContext(), null);
                            this.f48202c = gVar2;
                            gVar2.f19456u0.E = true;
                        }
                    } else {
                        lg.q qVar = new lg.q(getContext());
                        this.f48201b = qVar;
                        qVar.f19456u0.F = true;
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
                        qVar2.f19440i1 = true;
                        this.f48202c = qVar2;
                    }
                } else {
                    lg.g gVar3 = new lg.g(getContext(), null);
                    gVar3.f19461x0 = true;
                    gVar3.f19463y0 = true;
                    this.f48201b = gVar3;
                    lg.g gVar4 = new lg.g(getContext(), null);
                    this.f48202c = gVar4;
                    gVar4.f19456u0.E = true;
                }
            } else {
                this.f48201b = new lg.p(getContext(), e6Var);
                lg.p pVar = new lg.p(getContext(), e6Var);
                this.f48202c = pVar;
                pVar.f19456u0.E = true;
            }
        } else {
            this.f48201b = new lg.g(getContext(), e6Var);
            lg.g gVar5 = new lg.g(getContext(), e6Var);
            this.f48202c = gVar5;
            gVar5.f19456u0.E = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48201b.f19418a = fVar;
        this.f48202c.f19418a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f48203e = radialProgressView;
        frameLayout.addView(this.f48201b);
        frameLayout.addView(this.f48201b.f19456u0, -2, -2);
        frameLayout.addView(this.f48202c);
        frameLayout.addView(this.f48202c.f19456u0, -2, -2);
        frameLayout.addView(radialProgressView, c8.ja.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f48204f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.ja.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.s5, e6Var);
        this.f48201b.setDateSelectionListener(new ni0(this, 17));
        this.f48201b.f19456u0.d(false, false);
        this.f48201b.f19456u0.setOnTouchListener(new Object());
        this.f48201b.f19456u0.setOnClickListener(new View.OnClickListener(this) {
            public final j41 f46982b;

            {
                this.f46982b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46982b.h(true);
                        return;
                    case 1:
                        this.f46982b.c();
                        return;
                    default:
                        this.f46982b.f48202c.c(false);
                        return;
                }
            }
        });
        this.f48202c.f19456u0.setOnClickListener(new View.OnClickListener(this) {
            public final j41 f46982b;

            {
                this.f46982b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46982b.h(true);
                        return;
                    case 1:
                        this.f46982b.c();
                        return;
                    default:
                        this.f46982b.f48202c.c(false);
                        return;
                }
            }
        });
        this.f48201b.setVisibility(0);
        this.f48202c.setVisibility(4);
        this.f48201b.setHeader(this.d);
        f10.addView(this.d, c8.ja.c(52.0f, -1));
        f10.addView(frameLayout, c8.ja.c(-2.0f, -1));
        f10.addView(this.h, c8.ja.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f48207s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f10;
        Window window = this.f48200a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.f48201b;
        gVar.K = false;
        lg.g gVar2 = this.f48202c;
        gVar2.K = false;
        gVar.f19464z0 = 2;
        gVar2.f19464z0 = 1;
        final ?? obj = new Object();
        lg.j jVar = gVar.f19437h0;
        obj.f21156b = jVar.f19480l;
        obj.f21155a = jVar.f19479k;
        int binarySearch = Arrays.binarySearch(this.f48206r.d.f20620a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f48206r.d.f20620a.length - 1;
        }
        obj.f21157c = this.f48206r.d.f20621b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.A0 = obj;
        gVar.A0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i7 = 0; i7 < this.f48206r.d.d.size(); i7++) {
            if (((mg.a) this.f48206r.d.d.get(i7)).f20613a[binarySearch] > j10) {
                j10 = ((mg.a) this.f48206r.d.d.get(i7)).f20613a[binarySearch];
            }
            if (((mg.a) this.f48206r.d.d.get(i7)).f20613a[binarySearch] < j11) {
                j11 = ((mg.a) this.f48206r.d.d.get(i7)).f20613a[binarySearch];
            }
        }
        float f11 = ((float) j11) + ((float) (j10 - j11));
        float f12 = gVar.f19460x;
        final float f13 = (f11 - f12) / (gVar.f19458w - f12);
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
                j41 j41Var = j41.this;
                lg.g gVar3 = j41Var.f48201b;
                float f15 = gVar3.G0;
                lg.j jVar2 = gVar3.f19437h0;
                float f16 = jVar2.f19480l;
                float f17 = jVar2.f19479k;
                float f18 = ((f15 / (f16 - f17)) * f17) - lg.g.l1;
                RectF rectF = gVar3.I0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                ng.j jVar3 = obj;
                jVar3.f21158e = height;
                jVar3.d = (gVar3.H0 * jVar3.f21157c) - f18;
                jVar3.f21159f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = j41Var.f48202c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x1.a());
        return ofFloat;
    }

    public abstract void b(l41 l41Var);

    public abstract void c();

    public final void d() {
        mg.b bVar;
        ArrayList arrayList;
        int i7;
        lg.g gVar = this.f48201b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.f48202c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        l41 l41Var = this.f48206r;
        if (l41Var != null && (bVar = l41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f48206r.d.d.size(); i10++) {
                if (((mg.a) this.f48206r.d.d.get(i10)).f20618g >= 0 && org.telegram.ui.ActionBar.j6.f1(((mg.a) this.f48206r.d.d.get(i10)).f20618g)) {
                    i7 = org.telegram.ui.ActionBar.j6.x0(null, ((mg.a) this.f48206r.d.d.get(i10)).f20618g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false)) < 0.5d) {
                    i7 = ((mg.a) this.f48206r.d.d.get(i10)).f20619i;
                } else {
                    i7 = ((mg.a) this.f48206r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f48205n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.oz ozVar = ((i41) arrayList2.get(i10)).f47889a;
                    ozVar.getClass();
                    ozVar.f38125r = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28849d6, false);
                    ozVar.f38127w = -1;
                    ozVar.f38126s = i7;
                    ozVar.invalidate();
                }
            }
        }
        this.f48203e.setProgressColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28923h6, false));
        this.f48204f.setTextColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.s5, false));
    }

    public final void e(l41 l41Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (l41Var != null) {
            String str = l41Var.f48833j;
            ng.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            lg.g gVar = this.f48201b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            lg.j jVar = gVar.f19437h0;
            lg.g gVar2 = this.f48202c;
            gVar2.setLandscape(z11);
            this.f48206r = l41Var;
            boolean z13 = l41Var.f48835l;
            ArrayList arrayList2 = this.f48205n;
            eh0 eh0Var = this.h;
            RadialProgressView radialProgressView = this.f48203e;
            TextView textView = this.f48204f;
            if (!z13 && !l41Var.f48826a) {
                textView.setVisibility(8);
                ng.e eVar = gVar.f19456u0;
                boolean z14 = l41Var.f48837n;
                eVar.f21127a = z14;
                cVar.c(!z14);
                if (l41Var.d == null && l41Var.f48830f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(l41Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(l41Var.d) && l41Var.h) {
                    jVar.f19479k = 0.0f;
                    jVar.f19480l = 1.0f;
                    jVar.f19471a.A(true, false, false);
                }
                cVar.setUseWeekInterval(l41Var.f48838o);
                gVar.f19456u0.setUseWeek(l41Var.f48838o);
                ng.e eVar2 = gVar.f19456u0;
                if (this.f48206r.f48831g == null && this.f48207s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.G = z12;
                gVar2.f19456u0.G = false;
                eVar2.setEnabled(eVar2.G);
                ng.e eVar3 = gVar2.f19456u0;
                eVar3.setEnabled(eVar3.G);
                int size = arrayList.size();
                eh0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i7 = 0; i7 < size; i7++) {
                        ng.f fVar = (ng.f) arrayList.get(i7);
                        i41 i41Var = new i41(this, i7);
                        i41Var.f47890b = fVar;
                        String str2 = fVar.f21138a.d;
                        org.telegram.ui.Components.oz ozVar = i41Var.f47889a;
                        ozVar.setText(str2);
                        ozVar.a(fVar.f21149n, false);
                        ozVar.setOnTouchListener(new Object());
                        ozVar.setOnClickListener(new a90(21, i41Var, fVar));
                        ozVar.setOnLongClickListener(new fi.b2(7, i41Var, fVar));
                    }
                }
                long j3 = this.f48206r.f48828c;
                if (j3 > 0) {
                    gVar.f19455t0 = Arrays.binarySearch(gVar.f19439i0.f20620a, j3);
                    gVar.f19457v0 = true;
                    gVar.f19456u0.setVisibility(0);
                    gVar.f19459w0 = 1.0f;
                    gVar.x((gVar.H0 * jVar.f19479k) - lg.g.l1);
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
                    gVar.f19464z0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.A0 = obj;
                    obj.f21159f = 0.0f;
                    ofFloat.addUpdateListener(new ez0(this, 8));
                    ofFloat.addListener(new h41(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = l41Var.f48827b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            eh0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f10;
        lg.g gVar = this.f48201b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.f48206r.f48829e;
        lg.g gVar2 = this.f48202c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f48206r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f48206r.d.d.size();
                arrayList = this.f48205n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((mg.a) bVar.d.get(i11)).f20615c.equals(((mg.a) this.f48206r.d.d.get(i7)).f20615c)) {
                            boolean z12 = ((i41) arrayList.get(i7)).f47889a.f38120b;
                            ((ng.f) arrayList2.get(i11)).f21149n = z12;
                            ng.f fVar = (ng.f) arrayList2.get(i11);
                            if (z12) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f21150o = f10;
                            ((i41) arrayList.get(i7)).f47889a.f38121c = true;
                            ((i41) arrayList.get(i7)).f47889a.animate().alpha(1.0f).start();
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
                    ((i41) arrayList.get(i7)).f47889a.f38121c = false;
                    ((i41) arrayList.get(i7)).f47889a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f48206r.d.d.size(); i12++) {
                    ((i41) arrayList.get(i12)).f47889a.f38121c = true;
                    ((i41) arrayList.get(i12)).f47889a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f48206r.f48828c = selectedDate;
        gVar.f19456u0.setAlpha(0.0f);
        gVar.f19459w0 = 0.0f;
        gVar.f19457v0 = false;
        gVar.f19442j1 = false;
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
            gVar.f19464z0 = 0;
            gVar2.f19464z0 = 0;
            gVar.K = false;
            gVar2.K = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new h41(this, 0));
        a10.start();
    }

    public final void h(boolean z10) {
        mg.b bVar;
        l41 l41Var = this.f48206r;
        if (l41Var != null && (bVar = l41Var.d) != null && bVar.f20620a != null) {
            ng.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f21114a;
            lg.g gVar = this.f48201b;
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
            gVar.f19456u0.f21131f.setAlpha(1.0f);
            lg.g gVar2 = this.f48202c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f48206r.f48828c = 0L;
            int i7 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f48205n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.K = true;
                gVar2.K = false;
                gVar.invalidate();
                Window window = this.f48200a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    i41 i41Var = (i41) obj;
                    i41Var.f47889a.setAlpha(1.0f);
                    i41Var.f47889a.f38121c = true;
                }
                return;
            }
            ValueAnimator a10 = a(selectedDate, false);
            a10.addListener(new h41(this, 1));
            int size2 = arrayList.size();
            while (i7 < size2) {
                Object obj2 = arrayList.get(i7);
                i7++;
                i41 i41Var2 = (i41) obj2;
                i41Var2.f47889a.animate().alpha(1.0f).start();
                i41Var2.f47889a.f38121c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f48201b != null && this.f48202c != null && this.d != null && this.f48203e != null && this.f48204f != null) {
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
