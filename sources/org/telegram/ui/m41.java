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
    public final Window f47743a;
    public final lg.g f47744b;
    public final lg.g f47745c;
    public final ng.c d;
    public final RadialProgressView f47746e;
    public final TextView f47747f;
    public final uq0 h;
    public final ArrayList f47748n;
    public p41 f47749r;
    public final int f47750s;

    public m41(Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f47748n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f47743a = ((Activity) context).getWindow();
        } else {
            this.f47743a = null;
        }
        this.f47750s = i7;
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        this.h = new uq0(context, 8);
        ng.c cVar = new ng.c(getContext(), g6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final m41 f46465b;

            {
                this.f46465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46465b.h(true);
                        return;
                    case 1:
                        this.f46465b.c();
                        return;
                    default:
                        this.f46465b.f47745c.c(false);
                        return;
                }
            }
        });
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            this.f47744b = new lg.g(getContext(), null);
                            lg.g gVar = new lg.g(getContext(), null);
                            this.f47745c = gVar;
                            gVar.f18322t0.D = true;
                        } else {
                            this.f47744b = new lg.g(getContext(), null);
                            lg.g gVar2 = new lg.g(getContext(), null);
                            this.f47745c = gVar2;
                            gVar2.f18322t0.D = true;
                        }
                    } else {
                        lg.q qVar = new lg.q(getContext());
                        this.f47744b = qVar;
                        qVar.f18322t0.E = true;
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
                        qVar2.f18306h1 = true;
                        this.f47745c = qVar2;
                    }
                } else {
                    lg.g gVar3 = new lg.g(getContext(), null);
                    gVar3.f18326w0 = true;
                    gVar3.f18328x0 = true;
                    this.f47744b = gVar3;
                    lg.g gVar4 = new lg.g(getContext(), null);
                    this.f47745c = gVar4;
                    gVar4.f18322t0.D = true;
                }
            } else {
                this.f47744b = new lg.p(getContext(), g6Var);
                lg.p pVar = new lg.p(getContext(), g6Var);
                this.f47745c = pVar;
                pVar.f18322t0.D = true;
            }
        } else {
            this.f47744b = new lg.g(getContext(), g6Var);
            lg.g gVar5 = new lg.g(getContext(), g6Var);
            this.f47745c = gVar5;
            gVar5.f18322t0.D = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f47744b.f18286a = fVar;
        this.f47745c.f18286a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f47746e = radialProgressView;
        frameLayout.addView(this.f47744b);
        frameLayout.addView(this.f47744b.f18322t0, -2, -2);
        frameLayout.addView(this.f47745c);
        frameLayout.addView(this.f47745c.f18322t0, -2, -2);
        frameLayout.addView(radialProgressView, c8.ha.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f47747f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.s5, g6Var);
        this.f47744b.setDateSelectionListener(new ni0(this, 17));
        this.f47744b.f18322t0.d(false, false);
        this.f47744b.f18322t0.setOnTouchListener(new Object());
        this.f47744b.f18322t0.setOnClickListener(new View.OnClickListener(this) {
            public final m41 f46465b;

            {
                this.f46465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46465b.h(true);
                        return;
                    case 1:
                        this.f46465b.c();
                        return;
                    default:
                        this.f46465b.f47745c.c(false);
                        return;
                }
            }
        });
        this.f47745c.f18322t0.setOnClickListener(new View.OnClickListener(this) {
            public final m41 f46465b;

            {
                this.f46465b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f46465b.h(true);
                        return;
                    case 1:
                        this.f46465b.c();
                        return;
                    default:
                        this.f46465b.f47745c.c(false);
                        return;
                }
            }
        });
        this.f47744b.setVisibility(0);
        this.f47745c.setVisibility(4);
        this.f47744b.setHeader(this.d);
        f10.addView(this.d, c8.ha.c(52.0f, -1));
        f10.addView(frameLayout, c8.ha.c(-2.0f, -1));
        f10.addView(this.h, c8.ha.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f47750s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j3, boolean z9) {
        float f10;
        Window window = this.f47743a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        lg.g gVar = this.f47744b;
        gVar.J = false;
        lg.g gVar2 = this.f47745c;
        gVar2.J = false;
        gVar.f18330y0 = 2;
        gVar2.f18330y0 = 1;
        final ?? obj = new Object();
        lg.j jVar = gVar.f18303g0;
        obj.f20586b = jVar.f18347l;
        obj.f20585a = jVar.f18346k;
        int binarySearch = Arrays.binarySearch(this.f47749r.d.f20023a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f47749r.d.f20023a.length - 1;
        }
        obj.f20587c = this.f47749r.d.f20024b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f18331z0 = obj;
        gVar.f18331z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i7 = 0; i7 < this.f47749r.d.d.size(); i7++) {
            if (((mg.a) this.f47749r.d.d.get(i7)).f20016a[binarySearch] > j10) {
                j10 = ((mg.a) this.f47749r.d.d.get(i7)).f20016a[binarySearch];
            }
            if (((mg.a) this.f47749r.d.d.get(i7)).f20016a[binarySearch] < j11) {
                j11 = ((mg.a) this.f47749r.d.d.get(i7)).f20016a[binarySearch];
            }
        }
        float f11 = ((float) j11) + ((float) (j10 - j11));
        float f12 = gVar.f18327x;
        final float f13 = (f11 - f12) / (gVar.f18325w - f12);
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
                m41 m41Var = m41.this;
                lg.g gVar3 = m41Var.f47744b;
                float f15 = gVar3.F0;
                lg.j jVar2 = gVar3.f18303g0;
                float f16 = jVar2.f18347l;
                float f17 = jVar2.f18346k;
                float f18 = ((f15 / (f16 - f17)) * f17) - lg.g.f18272k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                ng.j jVar3 = obj;
                jVar3.f20588e = height;
                jVar3.d = (gVar3.G0 * jVar3.f20587c) - f18;
                jVar3.f20589f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lg.g gVar4 = m41Var.f47745c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new x1.a());
        return ofFloat;
    }

    public abstract void b(p41 p41Var);

    public abstract void c();

    public final void d() {
        mg.b bVar;
        ArrayList arrayList;
        int i7;
        lg.g gVar = this.f47744b;
        gVar.G();
        gVar.invalidate();
        lg.g gVar2 = this.f47745c;
        gVar2.G();
        gVar2.invalidate();
        ng.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        p41 p41Var = this.f47749r;
        if (p41Var != null && (bVar = p41Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f47749r.d.d.size(); i10++) {
                if (((mg.a) this.f47749r.d.d.get(i10)).f20021g >= 0 && org.telegram.ui.ActionBar.l6.f1(((mg.a) this.f47749r.d.d.get(i10)).f20021g)) {
                    i7 = org.telegram.ui.ActionBar.l6.x0(null, ((mg.a) this.f47749r.d.d.get(i10)).f20021g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)) < 0.5d) {
                    i7 = ((mg.a) this.f47749r.d.d.get(i10)).f20022i;
                } else {
                    i7 = ((mg.a) this.f47749r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f47748n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.lz lzVar = ((l41) arrayList2.get(i10)).f47460a;
                    lzVar.getClass();
                    lzVar.f35877r = org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false);
                    lzVar.f35879w = -1;
                    lzVar.f35878s = i7;
                    lzVar.invalidate();
                }
            }
        }
        this.f47746e.setProgressColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27939h6, false));
        this.f47747f.setTextColor(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.s5, false));
    }

    public final void e(p41 p41Var, boolean z9) {
        boolean z10;
        boolean z11;
        if (p41Var != null) {
            String str = p41Var.f48627j;
            ng.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            lg.g gVar = this.f47744b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            lg.j jVar = gVar.f18303g0;
            lg.g gVar2 = this.f47745c;
            gVar2.setLandscape(z10);
            this.f47749r = p41Var;
            boolean z12 = p41Var.f48629l;
            ArrayList arrayList2 = this.f47748n;
            uq0 uq0Var = this.h;
            RadialProgressView radialProgressView = this.f47746e;
            TextView textView = this.f47747f;
            if (!z12 && !p41Var.f48620a) {
                textView.setVisibility(8);
                ng.e eVar = gVar.f18322t0;
                boolean z13 = p41Var.f48631n;
                eVar.f20557a = z13;
                cVar.c(!z13);
                if (p41Var.d == null && p41Var.f48624f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(p41Var);
                    gVar.D(null);
                    return;
                }
                if (!z9) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(p41Var.d) && p41Var.h) {
                    jVar.f18346k = 0.0f;
                    jVar.f18347l = 1.0f;
                    jVar.f18338a.A(true, false, false);
                }
                cVar.setUseWeekInterval(p41Var.f48632o);
                gVar.f18322t0.setUseWeek(p41Var.f48632o);
                ng.e eVar2 = gVar.f18322t0;
                if (this.f47749r.f48625g == null && this.f47750s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.F = z11;
                gVar2.f18322t0.F = false;
                eVar2.setEnabled(eVar2.F);
                ng.e eVar3 = gVar2.f18322t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                uq0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i7 = 0; i7 < size; i7++) {
                        ng.f fVar = (ng.f) arrayList.get(i7);
                        l41 l41Var = new l41(this, i7);
                        l41Var.f47461b = fVar;
                        String str2 = fVar.f20568a.d;
                        org.telegram.ui.Components.lz lzVar = l41Var.f47460a;
                        lzVar.setText(str2);
                        lzVar.a(fVar.f20579n, false);
                        lzVar.setOnTouchListener(new Object());
                        lzVar.setOnClickListener(new hk0(13, l41Var, fVar));
                        lzVar.setOnLongClickListener(new di.f2(7, l41Var, fVar));
                    }
                }
                long j3 = this.f47749r.f48622c;
                if (j3 > 0) {
                    gVar.f18321s0 = Arrays.binarySearch(gVar.f18305h0.f20023a, j3);
                    gVar.f18323u0 = true;
                    gVar.f18322t0.setVisibility(0);
                    gVar.f18324v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f18346k) - lg.g.f18272k1);
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
                    gVar.f18330y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f18331z0 = obj;
                    obj.f20589f = 0.0f;
                    ofFloat.addUpdateListener(new jz0(this, 8));
                    ofFloat.addListener(new k41(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = p41Var.f48621b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            uq0Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z9) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        lg.g gVar = this.f47744b;
        long selectedDate = gVar.getSelectedDate();
        mg.b bVar = this.f47749r.f48623e;
        lg.g gVar2 = this.f47745c;
        if (!z9 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f47749r.d.d.size() > 1) {
            int i7 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f47749r.d.d.size();
                arrayList = this.f47748n;
                if (i7 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((mg.a) bVar.d.get(i11)).f20018c.equals(((mg.a) this.f47749r.d.d.get(i7)).f20018c)) {
                            boolean z11 = ((l41) arrayList.get(i7)).f47460a.f35872b;
                            ((ng.f) arrayList2.get(i11)).f20579n = z11;
                            ng.f fVar = (ng.f) arrayList2.get(i11);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f20580o = f10;
                            ((l41) arrayList.get(i7)).f47460a.f35873c = true;
                            ((l41) arrayList.get(i7)).f47460a.animate().alpha(1.0f).start();
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
                    ((l41) arrayList.get(i7)).f47460a.f35873c = false;
                    ((l41) arrayList.get(i7)).f47460a.animate().alpha(0.0f).start();
                }
                i7++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f47749r.d.d.size(); i12++) {
                    ((l41) arrayList.get(i12)).f47460a.f35873c = true;
                    ((l41) arrayList.get(i12)).f47460a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f47749r.f48622c = selectedDate;
        gVar.f18322t0.setAlpha(0.0f);
        gVar.f18324v0 = 0.0f;
        gVar.f18323u0 = false;
        gVar.f18308i1 = false;
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
            gVar.f18330y0 = 0;
            gVar2.f18330y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a10 = a(selectedDate, true);
        a10.addListener(new k41(this, 0));
        a10.start();
    }

    public final void h(boolean z9) {
        mg.b bVar;
        p41 p41Var = this.f47749r;
        if (p41Var != null && (bVar = p41Var.d) != null && bVar.f20023a != null) {
            ng.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f20544a;
            lg.g gVar = this.f47744b;
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
            gVar.f18322t0.f20561f.setAlpha(1.0f);
            lg.g gVar2 = this.f47745c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f47749r.f48622c = 0L;
            int i7 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f47748n;
            if (!z9) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f47743a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    l41 l41Var = (l41) obj;
                    l41Var.f47460a.setAlpha(1.0f);
                    l41Var.f47460a.f35873c = true;
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
                l41Var2.f47460a.animate().alpha(1.0f).start();
                l41Var2.f47460a.f35873c = true;
            }
            a10.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f47744b != null && this.f47745c != null && this.d != null && this.f47746e != null && this.f47747f != null) {
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
