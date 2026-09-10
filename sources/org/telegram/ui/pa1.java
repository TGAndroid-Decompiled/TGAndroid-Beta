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
public abstract class pa1 extends FrameLayout {
    public final Window f35752a;
    public final hg.g f35753b;
    public final hg.g f35754c;
    public final jg.c d;
    public final RadialProgressView e;
    public final TextView f35755f;
    public final m91 h;
    public final ArrayList f35756n;
    public ra1 f35757r;
    public final int f35758s;

    public pa1(Context context, int i10, hg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f35756n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f35752a = ((Activity) context).getWindow();
        } else {
            this.f35752a = null;
        }
        this.f35758s = i10;
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        this.h = new m91(context, 1);
        jg.c cVar = new jg.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final pa1 f34632b;

            {
                this.f34632b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34632b.h(true);
                        return;
                    case 1:
                        this.f34632b.c();
                        return;
                    default:
                        this.f34632b.f35754c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f35753b = new hg.g(getContext(), null);
                            hg.g gVar = new hg.g(getContext(), null);
                            this.f35754c = gVar;
                            gVar.f9382t0.f11913y = true;
                        } else {
                            this.f35753b = new hg.g(getContext(), null);
                            hg.g gVar2 = new hg.g(getContext(), null);
                            this.f35754c = gVar2;
                            gVar2.f9382t0.f11913y = true;
                        }
                    } else {
                        hg.q qVar = new hg.q(getContext());
                        this.f35753b = qVar;
                        qVar.f9382t0.E = true;
                        ?? qVar2 = new hg.q(getContext());
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
                        qVar2.f9366h1 = true;
                        this.f35754c = qVar2;
                    }
                } else {
                    hg.g gVar3 = new hg.g(getContext(), null);
                    gVar3.f9386w0 = true;
                    gVar3.f9388x0 = true;
                    this.f35753b = gVar3;
                    hg.g gVar4 = new hg.g(getContext(), null);
                    this.f35754c = gVar4;
                    gVar4.f9382t0.f11913y = true;
                }
            } else {
                this.f35753b = new hg.p(getContext(), f6Var);
                hg.p pVar = new hg.p(getContext(), f6Var);
                this.f35754c = pVar;
                pVar.f9382t0.f11913y = true;
            }
        } else {
            this.f35753b = new hg.g(getContext(), f6Var);
            hg.g gVar5 = new hg.g(getContext(), f6Var);
            this.f35754c = gVar5;
            gVar5.f9382t0.f11913y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35753b.f9347a = fVar;
        this.f35754c.f9347a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f35753b);
        frameLayout.addView(this.f35753b.f9382t0, -2, -2);
        frameLayout.addView(this.f35754c);
        frameLayout.addView(this.f35754c.f9382t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.a6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f35755f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.a6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18198s5, f6Var));
        this.f35753b.setDateSelectionListener(new ul0(this, 19));
        this.f35753b.f9382t0.d(false, false);
        this.f35753b.f9382t0.setOnTouchListener(new Object());
        this.f35753b.f9382t0.setOnClickListener(new View.OnClickListener(this) {
            public final pa1 f34632b;

            {
                this.f34632b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34632b.h(true);
                        return;
                    case 1:
                        this.f34632b.c();
                        return;
                    default:
                        this.f34632b.f35754c.c(false);
                        return;
                }
            }
        });
        this.f35754c.f9382t0.setOnClickListener(new View.OnClickListener(this) {
            public final pa1 f34632b;

            {
                this.f34632b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34632b.h(true);
                        return;
                    case 1:
                        this.f34632b.c();
                        return;
                    default:
                        this.f34632b.f35754c.c(false);
                        return;
                }
            }
        });
        this.f35753b.setVisibility(0);
        this.f35754c.setVisibility(4);
        this.f35753b.setHeader(this.d);
        f7.addView(this.d, w7.a6.c(52.0f, -1));
        f7.addView(frameLayout, w7.a6.c(-2.0f, -1));
        f7.addView(this.h, w7.a6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f35758s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f35752a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        hg.g gVar = this.f35753b;
        gVar.J = false;
        hg.g gVar2 = this.f35754c;
        gVar2.J = false;
        gVar.f9390y0 = 2;
        gVar2.f9390y0 = 1;
        final ?? obj = new Object();
        hg.j jVar = gVar.f9363g0;
        obj.f11931b = jVar.f9405l;
        obj.f11930a = jVar.f9404k;
        int binarySearch = Arrays.binarySearch(this.f35757r.d.f10590a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f35757r.d.f10590a.length - 1;
        }
        obj.f11932c = this.f35757r.d.f10591b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f9391z0 = obj;
        gVar.f9391z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f35757r.d.d.size(); i10++) {
            if (((ig.a) this.f35757r.d.d.get(i10)).f10584a[binarySearch] > j10) {
                j10 = ((ig.a) this.f35757r.d.d.get(i10)).f10584a[binarySearch];
            }
            if (((ig.a) this.f35757r.d.d.get(i10)).f10584a[binarySearch] < j11) {
                j11 = ((ig.a) this.f35757r.d.d.get(i10)).f10584a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f9385w;
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
                pa1 pa1Var = pa1.this;
                hg.g gVar3 = pa1Var.f35753b;
                float f14 = gVar3.F0;
                hg.j jVar2 = gVar3.f9363g0;
                float f15 = jVar2.f9405l;
                float f16 = jVar2.f9404k;
                float f17 = ((f14 / (f15 - f16)) * f16) - hg.g.f9332k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                jg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f11932c) - f17;
                jVar3.f11933f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg.g gVar4 = pa1Var.f35754c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(ra1 ra1Var);

    public abstract void c();

    public final void d() {
        ig.b bVar;
        ArrayList arrayList;
        int i10;
        hg.g gVar = this.f35753b;
        gVar.G();
        gVar.invalidate();
        hg.g gVar2 = this.f35754c;
        gVar2.G();
        gVar2.invalidate();
        jg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        ra1 ra1Var = this.f35757r;
        if (ra1Var != null && (bVar = ra1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f35757r.d.d.size(); i11++) {
                if (((ig.a) this.f35757r.d.d.get(i11)).f10588g >= 0 && org.telegram.ui.ActionBar.j6.c1(((ig.a) this.f35757r.d.d.get(i11)).f10588g)) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, ((ig.a) this.f35757r.d.d.get(i11)).f10588g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false)) < 0.5d) {
                    i10 = ((ig.a) this.f35757r.d.d.get(i11)).f10589i;
                } else {
                    i10 = ((ig.a) this.f35757r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f35756n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.z00 z00Var = ((oa1) arrayList2.get(i11)).f35448a;
                    z00Var.getClass();
                    z00Var.f29556r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false);
                    z00Var.v = -1;
                    z00Var.f29557s = i10;
                    z00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17999h6, false));
        this.f35755f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18198s5, false));
    }

    public final void e(ra1 ra1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (ra1Var != null) {
            String str = ra1Var.f36318j;
            jg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            hg.g gVar = this.f35753b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            hg.j jVar = gVar.f9363g0;
            hg.g gVar2 = this.f35754c;
            gVar2.setLandscape(z11);
            this.f35757r = ra1Var;
            boolean z13 = ra1Var.f36320l;
            ArrayList arrayList2 = this.f35756n;
            m91 m91Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f35755f;
            if (!z13 && !ra1Var.f36312a) {
                textView.setVisibility(8);
                jg.e eVar = gVar.f9382t0;
                boolean z14 = ra1Var.f36322n;
                eVar.f11904a = z14;
                cVar.c(!z14);
                if (ra1Var.d == null && ra1Var.f36315f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(ra1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(ra1Var.d) && ra1Var.h) {
                    jVar.f9404k = 0.0f;
                    jVar.f9405l = 1.0f;
                    jVar.f9397a.A(true, false, false);
                }
                cVar.setUseWeekInterval(ra1Var.f36323o);
                gVar.f9382t0.setUseWeek(ra1Var.f36323o);
                jg.e eVar2 = gVar.f9382t0;
                if (this.f35757r.f36316g == null && this.f35758s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f9382t0.F = false;
                eVar2.setEnabled(eVar2.F);
                jg.e eVar3 = gVar2.f9382t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                m91Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        jg.f fVar = (jg.f) arrayList.get(i10);
                        oa1 oa1Var = new oa1(this, i10);
                        oa1Var.f35449b = fVar;
                        String str2 = fVar.f11914a.d;
                        org.telegram.ui.Components.z00 z00Var = oa1Var.f35448a;
                        z00Var.setText(str2);
                        z00Var.a(fVar.f11924n, false);
                        z00Var.setOnTouchListener(new Object());
                        z00Var.setOnClickListener(new w71(4, oa1Var, fVar));
                        z00Var.setOnLongClickListener(new org.telegram.ui.Components.b0(5, oa1Var, fVar));
                    }
                }
                long j3 = this.f35757r.f36314c;
                if (j3 > 0) {
                    gVar.f9381s0 = Arrays.binarySearch(gVar.f9365h0.f10590a, j3);
                    gVar.f9383u0 = true;
                    gVar.f9382t0.setVisibility(0);
                    gVar.f9384v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f9404k) - hg.g.f9332k1);
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
                    gVar.f9390y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f9391z0 = obj;
                    obj.f11933f = 0.0f;
                    ofFloat.addUpdateListener(new f21(this, 12));
                    ofFloat.addListener(new na1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = ra1Var.f36313b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            m91Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        hg.g gVar = this.f35753b;
        long selectedDate = gVar.getSelectedDate();
        ig.b bVar = this.f35757r.e;
        hg.g gVar2 = this.f35754c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f35757r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f35757r.d.d.size();
                arrayList = this.f35756n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((ig.a) bVar.d.get(i12)).f10586c.equals(((ig.a) this.f35757r.d.d.get(i10)).f10586c)) {
                            boolean z12 = ((oa1) arrayList.get(i10)).f35448a.f29552b;
                            ((jg.f) arrayList2.get(i12)).f11924n = z12;
                            jg.f fVar = (jg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f11925o = f7;
                            ((oa1) arrayList.get(i10)).f35448a.f29553c = true;
                            ((oa1) arrayList.get(i10)).f35448a.animate().alpha(1.0f).start();
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
                    ((oa1) arrayList.get(i10)).f35448a.f29553c = false;
                    ((oa1) arrayList.get(i10)).f35448a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f35757r.d.d.size(); i13++) {
                    ((oa1) arrayList.get(i13)).f35448a.f29553c = true;
                    ((oa1) arrayList.get(i13)).f35448a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f35757r.f36314c = selectedDate;
        gVar.f9382t0.setAlpha(0.0f);
        gVar.f9384v0 = 0.0f;
        gVar.f9383u0 = false;
        gVar.f9368i1 = false;
        gVar2.G();
        jg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f9390y0 = 0;
            gVar2.f9390y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new na1(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        ig.b bVar;
        ra1 ra1Var = this.f35757r;
        if (ra1Var != null && (bVar = ra1Var.d) != null && bVar.f10590a != null) {
            jg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f11893a;
            hg.g gVar = this.f35753b;
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
            gVar.f9382t0.f11907f.setAlpha(1.0f);
            hg.g gVar2 = this.f35754c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f35757r.f36314c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f35756n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f35752a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    oa1 oa1Var = (oa1) obj;
                    oa1Var.f35448a.setAlpha(1.0f);
                    oa1Var.f35448a.f29553c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new na1(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                oa1 oa1Var2 = (oa1) obj2;
                oa1Var2.f35448a.animate().alpha(1.0f).start();
                oa1Var2.f35448a.f29553c = true;
            }
            a2.start();
        }
    }
}
