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
public abstract class da1 extends FrameLayout {
    public final Window f35732a;
    public final ig.g f35733b;
    public final ig.g f35734c;
    public final kg.c d;
    public final RadialProgressView f35735e;
    public final TextView f35736f;
    public final l41 h;
    public final ArrayList f35737n;
    public fa1 f35738r;
    public final int f35739s;

    public da1(Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35737n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f35732a = ((Activity) context).getWindow();
        } else {
            this.f35732a = null;
        }
        this.f35739s = i10;
        LinearLayout e7 = org.telegram.messenger.bi.e(context, 1);
        this.h = new l41(context, 3);
        kg.c cVar = new kg.c(getContext(), d6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final da1 f43728b;

            {
                this.f43728b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43728b.h(true);
                        return;
                    case 1:
                        this.f43728b.c();
                        return;
                    default:
                        this.f43728b.f35734c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f35733b = new ig.g(getContext(), null);
                            ig.g gVar = new ig.g(getContext(), null);
                            this.f35734c = gVar;
                            gVar.f12145t0.f14793y = true;
                        } else {
                            this.f35733b = new ig.g(getContext(), null);
                            ig.g gVar2 = new ig.g(getContext(), null);
                            this.f35734c = gVar2;
                            gVar2.f12145t0.f14793y = true;
                        }
                    } else {
                        ig.q qVar = new ig.q(getContext());
                        this.f35733b = qVar;
                        qVar.f12145t0.E = true;
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
                        qVar2.f12129h1 = true;
                        this.f35734c = qVar2;
                    }
                } else {
                    ig.g gVar3 = new ig.g(getContext(), null);
                    gVar3.f12149w0 = true;
                    gVar3.f12151x0 = true;
                    this.f35733b = gVar3;
                    ig.g gVar4 = new ig.g(getContext(), null);
                    this.f35734c = gVar4;
                    gVar4.f12145t0.f14793y = true;
                }
            } else {
                this.f35733b = new ig.p(getContext(), d6Var);
                ig.p pVar = new ig.p(getContext(), d6Var);
                this.f35734c = pVar;
                pVar.f12145t0.f14793y = true;
            }
        } else {
            this.f35733b = new ig.g(getContext(), d6Var);
            ig.g gVar5 = new ig.g(getContext(), d6Var);
            this.f35734c = gVar5;
            gVar5.f12145t0.f14793y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35733b.f12109a = fVar;
        this.f35734c.f12109a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f35735e = radialProgressView;
        frameLayout.addView(this.f35733b);
        frameLayout.addView(this.f35733b.f12145t0, -2, -2);
        frameLayout.addView(this.f35734c);
        frameLayout.addView(this.f35734c.f12145t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.z5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f35736f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21106s5, d6Var));
        this.f35733b.setDateSelectionListener(new jl0(this, 19));
        this.f35733b.f12145t0.d(false, false);
        this.f35733b.f12145t0.setOnTouchListener(new Object());
        this.f35733b.f12145t0.setOnClickListener(new View.OnClickListener(this) {
            public final da1 f43728b;

            {
                this.f43728b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43728b.h(true);
                        return;
                    case 1:
                        this.f43728b.c();
                        return;
                    default:
                        this.f43728b.f35734c.c(false);
                        return;
                }
            }
        });
        this.f35734c.f12145t0.setOnClickListener(new View.OnClickListener(this) {
            public final da1 f43728b;

            {
                this.f43728b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43728b.h(true);
                        return;
                    case 1:
                        this.f43728b.c();
                        return;
                    default:
                        this.f43728b.f35734c.c(false);
                        return;
                }
            }
        });
        this.f35733b.setVisibility(0);
        this.f35734c.setVisibility(4);
        this.f35733b.setHeader(this.d);
        e7.addView(this.d, w7.z5.c(52.0f, -1));
        e7.addView(frameLayout, w7.z5.c(-2.0f, -1));
        e7.addView(this.h, w7.z5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f35739s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e7.setClipChildren(false);
            e7.setClipToPadding(false);
        }
        addView(e7);
    }

    public final ValueAnimator a(long j3, boolean z10) {
        float f7;
        Window window = this.f35732a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        ig.g gVar = this.f35733b;
        gVar.J = false;
        ig.g gVar2 = this.f35734c;
        gVar2.J = false;
        gVar.f12153y0 = 2;
        gVar2.f12153y0 = 1;
        final ?? obj = new Object();
        ig.j jVar = gVar.f12126g0;
        obj.f14812b = jVar.f12170l;
        obj.f14811a = jVar.f12169k;
        int binarySearch = Arrays.binarySearch(this.f35738r.d.f14122a, j3);
        if (binarySearch < 0) {
            binarySearch = this.f35738r.d.f14122a.length - 1;
        }
        obj.f14813c = this.f35738r.d.f14123b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f12154z0 = obj;
        gVar.f12154z0 = obj;
        long j10 = 0;
        long j11 = 2147483647L;
        for (int i10 = 0; i10 < this.f35738r.d.d.size(); i10++) {
            if (((jg.a) this.f35738r.d.d.get(i10)).f14115a[binarySearch] > j10) {
                j10 = ((jg.a) this.f35738r.d.d.get(i10)).f14115a[binarySearch];
            }
            if (((jg.a) this.f35738r.d.d.get(i10)).f14115a[binarySearch] < j11) {
                j11 = ((jg.a) this.f35738r.d.d.get(i10)).f14115a[binarySearch];
            }
        }
        float f10 = ((float) j11) + ((float) (j10 - j11));
        float f11 = gVar.f12148w;
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
                da1 da1Var = da1.this;
                ig.g gVar3 = da1Var.f35733b;
                float f14 = gVar3.F0;
                ig.j jVar2 = gVar3.f12126g0;
                float f15 = jVar2.f12170l;
                float f16 = jVar2.f12169k;
                float f17 = ((f14 / (f15 - f16)) * f16) - ig.g.f12094k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                kg.j jVar3 = obj;
                jVar3.f14814e = height;
                jVar3.d = (gVar3.G0 * jVar3.f14813c) - f17;
                jVar3.f14815f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ig.g gVar4 = da1Var.f35734c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(fa1 fa1Var);

    public abstract void c();

    public final void d() {
        jg.b bVar;
        ArrayList arrayList;
        int i10;
        ig.g gVar = this.f35733b;
        gVar.G();
        gVar.invalidate();
        ig.g gVar2 = this.f35734c;
        gVar2.G();
        gVar2.invalidate();
        kg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        fa1 fa1Var = this.f35738r;
        if (fa1Var != null && (bVar = fa1Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f35738r.d.d.size(); i11++) {
                if (((jg.a) this.f35738r.d.d.get(i11)).f14120g >= 0 && org.telegram.ui.ActionBar.i6.c1(((jg.a) this.f35738r.d.d.get(i11)).f14120g)) {
                    i10 = org.telegram.ui.ActionBar.i6.w0(null, ((jg.a) this.f35738r.d.d.get(i11)).f14120g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)) < 0.5d) {
                    i10 = ((jg.a) this.f35738r.d.d.get(i11)).f14121i;
                } else {
                    i10 = ((jg.a) this.f35738r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f35737n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.v00 v00Var = ((ca1) arrayList2.get(i11)).f35381a;
                    v00Var.getClass();
                    v00Var.f31585r = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false);
                    v00Var.v = -1;
                    v00Var.f31586s = i10;
                    v00Var.invalidate();
                }
            }
        }
        this.f35735e.setProgressColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20900h6, false));
        this.f35736f.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21106s5, false));
    }

    public final void e(fa1 fa1Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (fa1Var != null) {
            String str = fa1Var.f36251j;
            kg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            ig.g gVar = this.f35733b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            ig.j jVar = gVar.f12126g0;
            ig.g gVar2 = this.f35734c;
            gVar2.setLandscape(z11);
            this.f35738r = fa1Var;
            boolean z13 = fa1Var.f36253l;
            ArrayList arrayList2 = this.f35737n;
            l41 l41Var = this.h;
            RadialProgressView radialProgressView = this.f35735e;
            TextView textView = this.f35736f;
            if (!z13 && !fa1Var.f36244a) {
                textView.setVisibility(8);
                kg.e eVar = gVar.f12145t0;
                boolean z14 = fa1Var.f36255n;
                eVar.f14783a = z14;
                cVar.c(!z14);
                if (fa1Var.d == null && fa1Var.f36248f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(fa1Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(fa1Var.d) && fa1Var.h) {
                    jVar.f12169k = 0.0f;
                    jVar.f12170l = 1.0f;
                    jVar.f12161a.A(true, false, false);
                }
                cVar.setUseWeekInterval(fa1Var.f36256o);
                gVar.f12145t0.setUseWeek(fa1Var.f36256o);
                kg.e eVar2 = gVar.f12145t0;
                if (this.f35738r.f36249g == null && this.f35739s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f12145t0.F = false;
                eVar2.setEnabled(eVar2.F);
                kg.e eVar3 = gVar2.f12145t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                l41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        kg.f fVar = (kg.f) arrayList.get(i10);
                        ca1 ca1Var = new ca1(this, i10);
                        ca1Var.f35382b = fVar;
                        String str2 = fVar.f14794a.d;
                        org.telegram.ui.Components.v00 v00Var = ca1Var.f35381a;
                        v00Var.setText(str2);
                        v00Var.a(fVar.f14805n, false);
                        v00Var.setOnTouchListener(new Object());
                        v00Var.setOnClickListener(new py0(7, ca1Var, fVar));
                        v00Var.setOnLongClickListener(new ai.q3(6, ca1Var, fVar));
                    }
                }
                long j3 = this.f35738r.f36246c;
                if (j3 > 0) {
                    gVar.f12144s0 = Arrays.binarySearch(gVar.f12128h0.f14122a, j3);
                    gVar.f12146u0 = true;
                    gVar.f12145t0.setVisibility(0);
                    gVar.f12147v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f12169k) - ig.g.f12094k1);
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
                    gVar.f12153y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f12154z0 = obj;
                    obj.f14815f = 0.0f;
                    ofFloat.addUpdateListener(new b21(this, 11));
                    ofFloat.addListener(new ba1(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = fa1Var.f36245b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            l41Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        ig.g gVar = this.f35733b;
        long selectedDate = gVar.getSelectedDate();
        jg.b bVar = this.f35738r.f36247e;
        ig.g gVar2 = this.f35734c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f35738r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f35738r.d.d.size();
                arrayList = this.f35737n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((jg.a) bVar.d.get(i12)).f14117c.equals(((jg.a) this.f35738r.d.d.get(i10)).f14117c)) {
                            boolean z12 = ((ca1) arrayList.get(i10)).f35381a.f31580b;
                            ((kg.f) arrayList2.get(i12)).f14805n = z12;
                            kg.f fVar = (kg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f14806o = f7;
                            ((ca1) arrayList.get(i10)).f35381a.f31581c = true;
                            ((ca1) arrayList.get(i10)).f35381a.animate().alpha(1.0f).start();
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
                    ((ca1) arrayList.get(i10)).f35381a.f31581c = false;
                    ((ca1) arrayList.get(i10)).f35381a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f35738r.d.d.size(); i13++) {
                    ((ca1) arrayList.get(i13)).f35381a.f31581c = true;
                    ((ca1) arrayList.get(i13)).f35381a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f35738r.f36246c = selectedDate;
        gVar.f12145t0.setAlpha(0.0f);
        gVar.f12147v0 = 0.0f;
        gVar.f12146u0 = false;
        gVar.f12131i1 = false;
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
            gVar.f12153y0 = 0;
            gVar2.f12153y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new ba1(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        jg.b bVar;
        fa1 fa1Var = this.f35738r;
        if (fa1Var != null && (bVar = fa1Var.d) != null && bVar.f14122a != null) {
            kg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f14770a;
            ig.g gVar = this.f35733b;
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
            gVar.f12145t0.f14787f.setAlpha(1.0f);
            ig.g gVar2 = this.f35734c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f35738r.f36246c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f35737n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f35732a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ca1 ca1Var = (ca1) obj;
                    ca1Var.f35381a.setAlpha(1.0f);
                    ca1Var.f35381a.f31581c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new ba1(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ca1 ca1Var2 = (ca1) obj2;
                ca1Var2.f35381a.animate().alpha(1.0f).start();
                ca1Var2.f35381a.f31581c = true;
            }
            a2.start();
        }
    }
}
