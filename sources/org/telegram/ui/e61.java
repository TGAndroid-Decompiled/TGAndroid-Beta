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
public abstract class e61 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final Window f36959a;
    public final bg.i f36960b;
    public final bg.i f36961c;
    public final dg.d d;
    public final RadialProgressView e;
    public final TextView f36962f;
    public final dg0 h;
    public final ArrayList f36963n;
    public g61 f36964r;
    public final int f36965s;

    public e61(Context context, int i10, bg.h hVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f36963n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f36959a = ((Activity) context).getWindow();
        } else {
            this.f36959a = null;
        }
        this.f36965s = i10;
        LinearLayout f7 = org.telegram.messenger.m5.f(context, 1);
        this.h = new dg0(context, 11);
        dg.d dVar = new dg.d(getContext(), p6Var);
        this.d = dVar;
        dVar.d.setOnTouchListener(new Object());
        dVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final e61 f35574b;

            {
                this.f35574b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35574b.h(true);
                        return;
                    case 1:
                        this.f35574b.c();
                        return;
                    default:
                        this.f35574b.f36961c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f36960b = new bg.i(getContext(), null);
                            bg.i iVar = new bg.i(getContext(), null);
                            this.f36961c = iVar;
                            iVar.f2739t0.D = true;
                        } else {
                            this.f36960b = new bg.i(getContext(), null);
                            bg.i iVar2 = new bg.i(getContext(), null);
                            this.f36961c = iVar2;
                            iVar2.f2739t0.D = true;
                        }
                    } else {
                        bg.v vVar = new bg.v(getContext());
                        this.f36960b = vVar;
                        vVar.f2739t0.E = true;
                        ?? vVar2 = new bg.v(getContext());
                        vVar2.M1 = -1;
                        vVar2.N1 = new RectF();
                        vVar2.P1 = org.telegram.messenger.i0.L(9.0f);
                        vVar2.Q1 = org.telegram.messenger.i0.L(13.0f);
                        vVar2.R1 = new String[101];
                        vVar2.T1 = 1.0f;
                        vVar2.U1 = 0;
                        vVar2.V1 = -1;
                        vVar2.W1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            vVar2.R1[i11] = a1.g.k(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        vVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        vVar2.f2723h1 = true;
                        this.f36961c = vVar2;
                    }
                } else {
                    bg.i iVar3 = new bg.i(getContext(), null);
                    iVar3.f2743w0 = true;
                    iVar3.f2745x0 = true;
                    this.f36960b = iVar3;
                    bg.i iVar4 = new bg.i(getContext(), null);
                    this.f36961c = iVar4;
                    iVar4.f2739t0.D = true;
                }
            } else {
                this.f36960b = new bg.u(getContext(), p6Var);
                bg.u uVar = new bg.u(getContext(), p6Var);
                this.f36961c = uVar;
                uVar.f2739t0.D = true;
            }
        } else {
            this.f36960b = new bg.i(getContext(), p6Var);
            bg.i iVar5 = new bg.i(getContext(), p6Var);
            this.f36961c = iVar5;
            iVar5.f2739t0.D = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36960b.f2704a = hVar;
        this.f36961c.f2704a = hVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f36960b);
        frameLayout.addView(this.f36960b.f2739t0, -2, -2);
        frameLayout.addView(this.f36961c);
        frameLayout.addView(this.f36961c.f2739t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f36962f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21203s5, p6Var);
        this.f36960b.setDateSelectionListener(new tj0(this, 18));
        this.f36960b.f2739t0.d(false, false);
        this.f36960b.f2739t0.setOnTouchListener(new Object());
        this.f36960b.f2739t0.setOnClickListener(new View.OnClickListener(this) {
            public final e61 f35574b;

            {
                this.f35574b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35574b.h(true);
                        return;
                    case 1:
                        this.f35574b.c();
                        return;
                    default:
                        this.f35574b.f36961c.c(false);
                        return;
                }
            }
        });
        this.f36961c.f2739t0.setOnClickListener(new View.OnClickListener(this) {
            public final e61 f35574b;

            {
                this.f35574b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35574b.h(true);
                        return;
                    case 1:
                        this.f35574b.c();
                        return;
                    default:
                        this.f35574b.f36961c.c(false);
                        return;
                }
            }
        });
        this.f36960b.setVisibility(0);
        this.f36961c.setVisibility(4);
        this.f36960b.setHeader(this.d);
        f7.addView(this.d, w7.b6.c(52.0f, -1));
        f7.addView(frameLayout, w7.b6.c(-2.0f, -1));
        f7.addView(this.h, w7.b6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f36965s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f7.setClipChildren(false);
            f7.setClipToPadding(false);
        }
        addView(f7);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f36959a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        bg.i iVar = this.f36960b;
        iVar.J = false;
        bg.i iVar2 = this.f36961c;
        iVar2.J = false;
        iVar.f2747y0 = 2;
        iVar2.f2747y0 = 1;
        final ?? obj = new Object();
        bg.n nVar = iVar.f2720g0;
        obj.f5926b = nVar.f2768l;
        obj.f5925a = nVar.f2767k;
        int binarySearch = Arrays.binarySearch(this.f36964r.d.f4164a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f36964r.d.f4164a.length - 1;
        }
        obj.f5927c = this.f36964r.d.f4165b[binarySearch];
        iVar2.setVisibility(0);
        iVar2.f2748z0 = obj;
        iVar.f2748z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f36964r.d.d.size(); i10++) {
            if (((cg.a) this.f36964r.d.d.get(i10)).f4158a[binarySearch] > j11) {
                j11 = ((cg.a) this.f36964r.d.d.get(i10)).f4158a[binarySearch];
            }
            if (((cg.a) this.f36964r.d.d.get(i10)).f4158a[binarySearch] < j12) {
                j12 = ((cg.a) this.f36964r.d.d.get(i10)).f4158a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = iVar.f2744x;
        final float f12 = (f10 - f11) / (iVar.f2742w - f11);
        iVar.q(obj);
        iVar2.q(obj);
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
                e61 e61Var = e61.this;
                bg.i iVar3 = e61Var.f36960b;
                float f14 = iVar3.F0;
                bg.n nVar2 = iVar3.f2720g0;
                float f15 = nVar2.f2768l;
                float f16 = nVar2.f2767k;
                float f17 = ((f14 / (f15 - f16)) * f16) - bg.i.f2689k1;
                RectF rectF = iVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                dg.k kVar = obj;
                kVar.e = height;
                kVar.d = (iVar3.G0 * kVar.f5927c) - f17;
                kVar.f5928f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bg.i iVar4 = e61Var.f36961c;
                iVar4.invalidate();
                iVar4.q(kVar);
                iVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(g61 g61Var);

    public abstract void c();

    public final void d() {
        cg.b bVar;
        ArrayList arrayList;
        int i10;
        bg.i iVar = this.f36960b;
        iVar.G();
        iVar.invalidate();
        bg.i iVar2 = this.f36961c;
        iVar2.G();
        iVar2.invalidate();
        dg.d dVar = this.d;
        dVar.a();
        dVar.invalidate();
        g61 g61Var = this.f36964r;
        if (g61Var != null && (bVar = g61Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f36964r.d.d.size(); i11++) {
                if (((cg.a) this.f36964r.d.d.get(i11)).f4162g >= 0 && org.telegram.ui.ActionBar.t6.f1(((cg.a) this.f36964r.d.d.get(i11)).f4162g)) {
                    i10 = org.telegram.ui.ActionBar.t6.x0(null, ((cg.a) this.f36964r.d.d.get(i11)).f4162g, false);
                } else if (i0.b.h(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)) < 0.5d) {
                    i10 = ((cg.a) this.f36964r.d.d.get(i11)).f4163i;
                } else {
                    i10 = ((cg.a) this.f36964r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f36963n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.yz yzVar = ((d61) arrayList2.get(i11)).f36627a;
                    yzVar.getClass();
                    yzVar.f32845r = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false);
                    yzVar.f32847w = -1;
                    yzVar.f32846s = i10;
                    yzVar.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21002h6, false));
        this.f36962f.setTextColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21203s5, false));
    }

    public final void e(g61 g61Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (g61Var != null) {
            String str = g61Var.f37439j;
            dg.d dVar = this.d;
            dVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            bg.i iVar = this.f36960b;
            iVar.setLandscape(z11);
            ArrayList arrayList = iVar.d;
            bg.n nVar = iVar.f2720g0;
            bg.i iVar2 = this.f36961c;
            iVar2.setLandscape(z11);
            this.f36964r = g61Var;
            boolean z13 = g61Var.f37441l;
            ArrayList arrayList2 = this.f36963n;
            dg0 dg0Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f36962f;
            if (!z13 && !g61Var.f37433a) {
                textView.setVisibility(8);
                dg.f fVar = iVar.f2739t0;
                boolean z14 = g61Var.f37443n;
                fVar.f5899a = z14;
                dVar.c(!z14);
                if (g61Var.d == null && g61Var.f37436f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(g61Var);
                    iVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (iVar.D(g61Var.d) && g61Var.h) {
                    nVar.f2767k = 0.0f;
                    nVar.f2768l = 1.0f;
                    nVar.f2760a.A(true, false, false);
                }
                dVar.setUseWeekInterval(g61Var.f37444o);
                iVar.f2739t0.setUseWeek(g61Var.f37444o);
                dg.f fVar2 = iVar.f2739t0;
                if (this.f36964r.f37437g == null && this.f36965s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                fVar2.F = z12;
                iVar2.f2739t0.F = false;
                fVar2.setEnabled(fVar2.F);
                dg.f fVar3 = iVar2.f2739t0;
                fVar3.setEnabled(fVar3.F);
                int size = arrayList.size();
                dg0Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        dg.g gVar = (dg.g) arrayList.get(i10);
                        d61 d61Var = new d61(this, i10);
                        d61Var.f36628b = gVar;
                        String str2 = gVar.f5909a.d;
                        org.telegram.ui.Components.yz yzVar = d61Var.f36627a;
                        yzVar.setText(str2);
                        yzVar.a(gVar.f5919n, false);
                        yzVar.setOnTouchListener(new Object());
                        yzVar.setOnClickListener(new rv0(7, d61Var, gVar));
                        yzVar.setOnLongClickListener(new org.telegram.ui.Components.b0(6, d61Var, gVar));
                    }
                }
                long j10 = this.f36964r.f37435c;
                if (j10 > 0) {
                    iVar.f2738s0 = Arrays.binarySearch(iVar.f2722h0.f4164a, j10);
                    iVar.f2740u0 = true;
                    iVar.f2739t0.setVisibility(0);
                    iVar.f2741v0 = 1.0f;
                    iVar.x((iVar.G0 * nVar.f2767k) - bg.i.f2689k1);
                    try {
                        iVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    iVar.invalidate();
                }
                d();
                if (z10) {
                    iVar.f2747y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    iVar.f2748z0 = obj;
                    obj.f5928f = 0.0f;
                    ofFloat.addUpdateListener(new u01(this, 8));
                    ofFloat.addListener(new c61(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = g61Var.f37434b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            dg0Var.removeAllViews();
            arrayList2.clear();
            iVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        bg.i iVar = this.f36960b;
        long selectedDate = iVar.getSelectedDate();
        cg.b bVar = this.f36964r.e;
        bg.i iVar2 = this.f36961c;
        if (!z10 || iVar2.getVisibility() != 0) {
            iVar2.J(bVar, selectedDate);
        }
        iVar2.D(bVar);
        ArrayList arrayList2 = iVar2.d;
        if (this.f36964r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f36964r.d.d.size();
                arrayList = this.f36963n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((cg.a) bVar.d.get(i12)).f4160c.equals(((cg.a) this.f36964r.d.d.get(i10)).f4160c)) {
                            boolean z12 = ((d61) arrayList.get(i10)).f36627a.f32841b;
                            ((dg.g) arrayList2.get(i12)).f5919n = z12;
                            dg.g gVar = (dg.g) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            gVar.f5920o = f7;
                            ((d61) arrayList.get(i10)).f36627a.f32842c = true;
                            ((d61) arrayList.get(i10)).f36627a.animate().alpha(1.0f).start();
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
                    ((d61) arrayList.get(i10)).f36627a.f32842c = false;
                    ((d61) arrayList.get(i10)).f36627a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f36964r.d.d.size(); i13++) {
                    ((d61) arrayList.get(i13)).f36627a.f32842c = true;
                    ((d61) arrayList.get(i13)).f36627a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f36964r.f37435c = selectedDate;
        iVar.f2739t0.setAlpha(0.0f);
        iVar.f2741v0 = 0.0f;
        iVar.f2740u0 = false;
        iVar.f2725i1 = false;
        iVar2.G();
        dg.d dVar = this.d;
        if (!z10) {
            iVar2.d();
            dVar.d(selectedDate, true);
        }
        iVar2.setHeader(dVar);
        iVar.setHeader(null);
        if (z10) {
            iVar.setVisibility(4);
            iVar2.setVisibility(0);
            iVar.f2747y0 = 0;
            iVar2.f2747y0 = 0;
            iVar.J = false;
            iVar2.J = true;
            dVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new c61(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        cg.b bVar;
        g61 g61Var = this.f36964r;
        if (g61Var != null && (bVar = g61Var.d) != null && bVar.f4164a != null) {
            dg.d dVar = this.d;
            TextView textView = dVar.d;
            TextView textView2 = dVar.f5888a;
            bg.i iVar = this.f36960b;
            dVar.b(iVar.getStartDate(), iVar.getEndDate());
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
                textView.setPivotY(org.telegram.messenger.i0.L(40.0f));
                textView.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(200L).start();
            } else {
                textView2.setAlpha(1.0f);
                textView2.setScaleX(1.0f);
                textView2.setScaleY(1.0f);
                textView.setAlpha(0.0f);
            }
            iVar.f2739t0.f5902f.setAlpha(1.0f);
            bg.i iVar2 = this.f36961c;
            iVar2.setHeader(null);
            long selectedDate = iVar.getSelectedDate();
            this.f36964r.f37435c = 0L;
            int i10 = 0;
            iVar.setVisibility(0);
            iVar2.d();
            iVar2.setHeader(null);
            iVar.setHeader(dVar);
            ArrayList arrayList = this.f36963n;
            if (!z10) {
                iVar2.setVisibility(4);
                iVar.J = true;
                iVar2.J = false;
                iVar.invalidate();
                Window window = this.f36959a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    d61 d61Var = (d61) obj;
                    d61Var.f36627a.setAlpha(1.0f);
                    d61Var.f36627a.f32842c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new c61(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                d61 d61Var2 = (d61) obj2;
                d61Var2.f36627a.animate().alpha(1.0f).start();
                d61Var2.f36627a.f32842c = true;
            }
            a2.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f36960b != null && this.f36961c != null && this.d != null && this.e != null && this.f36962f != null) {
                d();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
