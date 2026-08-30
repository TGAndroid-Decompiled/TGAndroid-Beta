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
public abstract class q91 extends FrameLayout {
    public final Window f37679a;
    public final vf.g f37680b;
    public final vf.g f37681c;
    public final xf.c d;
    public final RadialProgressView e;
    public final TextView f37682f;
    public final a51 h;
    public final ArrayList f37683n;
    public s91 f37684r;
    public final int f37685s;

    public q91(Context context, int i10, vf.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f37683n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f37679a = ((Activity) context).getWindow();
        } else {
            this.f37679a = null;
        }
        this.f37685s = i10;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        this.h = new a51(context, 2);
        xf.c cVar = new xf.c(getContext(), f6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final q91 f36243b;

            {
                this.f36243b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36243b.h(true);
                        return;
                    case 1:
                        this.f36243b.c();
                        return;
                    default:
                        this.f36243b.f37681c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f37680b = new vf.g(getContext(), null);
                            vf.g gVar = new vf.g(getContext(), null);
                            this.f37681c = gVar;
                            gVar.f45731q0.f46948y = true;
                        } else {
                            this.f37680b = new vf.g(getContext(), null);
                            vf.g gVar2 = new vf.g(getContext(), null);
                            this.f37681c = gVar2;
                            gVar2.f45731q0.f46948y = true;
                        }
                    } else {
                        vf.q qVar = new vf.q(getContext());
                        this.f37680b = qVar;
                        qVar.f45731q0.B = true;
                        ?? qVar2 = new vf.q(getContext());
                        qVar2.J1 = -1;
                        qVar2.K1 = new RectF();
                        qVar2.M1 = AndroidUtilities.dp(9.0f);
                        qVar2.N1 = AndroidUtilities.dp(13.0f);
                        qVar2.O1 = new String[101];
                        qVar2.Q1 = 1.0f;
                        qVar2.R1 = 0;
                        qVar2.S1 = -1;
                        qVar2.T1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            qVar2.O1[i11] = android.support.v4.media.a.l(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.L1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f45716e1 = true;
                        this.f37681c = qVar2;
                    }
                } else {
                    vf.g gVar3 = new vf.g(getContext(), null);
                    gVar3.f45736t0 = true;
                    gVar3.f45737u0 = true;
                    this.f37680b = gVar3;
                    vf.g gVar4 = new vf.g(getContext(), null);
                    this.f37681c = gVar4;
                    gVar4.f45731q0.f46948y = true;
                }
            } else {
                this.f37680b = new vf.p(getContext(), f6Var);
                vf.p pVar = new vf.p(getContext(), f6Var);
                this.f37681c = pVar;
                pVar.f45731q0.f46948y = true;
            }
        } else {
            this.f37680b = new vf.g(getContext(), f6Var);
            vf.g gVar5 = new vf.g(getContext(), f6Var);
            this.f37681c = gVar5;
            gVar5.f45731q0.f46948y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37680b.f45704a = fVar;
        this.f37681c.f45704a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f37680b);
        frameLayout.addView(this.f37680b.f45731q0, -2, -2);
        frameLayout.addView(this.f37681c);
        frameLayout.addView(this.f37681c.f45731q0, -2, -2);
        frameLayout.addView(radialProgressView, k7.b6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f37682f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20174s5, f6Var));
        this.f37680b.setDateSelectionListener(new il0(this, 19));
        this.f37680b.f45731q0.d(false, false);
        this.f37680b.f45731q0.setOnTouchListener(new Object());
        this.f37680b.f45731q0.setOnClickListener(new View.OnClickListener(this) {
            public final q91 f36243b;

            {
                this.f36243b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36243b.h(true);
                        return;
                    case 1:
                        this.f36243b.c();
                        return;
                    default:
                        this.f36243b.f37681c.c(false);
                        return;
                }
            }
        });
        this.f37681c.f45731q0.setOnClickListener(new View.OnClickListener(this) {
            public final q91 f36243b;

            {
                this.f36243b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f36243b.h(true);
                        return;
                    case 1:
                        this.f36243b.c();
                        return;
                    default:
                        this.f36243b.f37681c.c(false);
                        return;
                }
            }
        });
        this.f37680b.setVisibility(0);
        this.f37681c.setVisibility(4);
        this.f37680b.setHeader(this.d);
        f10.addView(this.d, k7.b6.c(52.0f, -1));
        f10.addView(frameLayout, k7.b6.c(-2.0f, -1));
        f10.addView(this.h, k7.b6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f37685s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z4) {
        float f10;
        Window window = this.f37679a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        vf.g gVar = this.f37680b;
        gVar.G = false;
        vf.g gVar2 = this.f37681c;
        gVar2.G = false;
        gVar.f45738v0 = 2;
        gVar2.f45738v0 = 1;
        final ?? obj = new Object();
        vf.j jVar = gVar.f45713d0;
        obj.f46966b = jVar.f45759l;
        obj.f46965a = jVar.f45758k;
        int binarySearch = Arrays.binarySearch(this.f37684r.d.f46537a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f37684r.d.f46537a.length - 1;
        }
        obj.f46967c = this.f37684r.d.f46538b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f45740w0 = obj;
        gVar.f45740w0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f37684r.d.d.size(); i10++) {
            if (((wf.a) this.f37684r.d.d.get(i10)).f46531a[binarySearch] > j11) {
                j11 = ((wf.a) this.f37684r.d.d.get(i10)).f46531a[binarySearch];
            }
            if (((wf.a) this.f37684r.d.d.get(i10)).f46531a[binarySearch] < j12) {
                j12 = ((wf.a) this.f37684r.d.d.get(i10)).f46531a[binarySearch];
            }
        }
        float f11 = ((float) j12) + ((float) (j11 - j12));
        float f12 = gVar.f45739w;
        final float f13 = (f11 - f12) / (gVar.v - f12);
        gVar.q(obj);
        gVar2.q(obj);
        float f14 = 1.0f;
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z4) {
            f14 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f14);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q91 q91Var = q91.this;
                vf.g gVar3 = q91Var.f37680b;
                float f15 = gVar3.C0;
                vf.j jVar2 = gVar3.f45713d0;
                float f16 = jVar2.f45759l;
                float f17 = jVar2.f45758k;
                float f18 = ((f15 / (f16 - f17)) * f17) - vf.g.f45686h1;
                RectF rectF = gVar3.E0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                xf.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.D0 * jVar3.f46967c) - f18;
                jVar3.f46968f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vf.g gVar4 = q91Var.f37681c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(s91 s91Var);

    public abstract void c();

    public final void d() {
        wf.b bVar;
        ArrayList arrayList;
        int i10;
        vf.g gVar = this.f37680b;
        gVar.G();
        gVar.invalidate();
        vf.g gVar2 = this.f37681c;
        gVar2.G();
        gVar2.invalidate();
        xf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        s91 s91Var = this.f37684r;
        if (s91Var != null && (bVar = s91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f37684r.d.d.size(); i11++) {
                if (((wf.a) this.f37684r.d.d.get(i11)).f46535g >= 0 && org.telegram.ui.ActionBar.j6.c1(((wf.a) this.f37684r.d.d.get(i11)).f46535g)) {
                    i10 = org.telegram.ui.ActionBar.j6.w0(null, ((wf.a) this.f37684r.d.d.get(i11)).f46535g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false)) < 0.5d) {
                    i10 = ((wf.a) this.f37684r.d.d.get(i11)).f46536i;
                } else {
                    i10 = ((wf.a) this.f37684r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f37683n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.s00 s00Var = ((p91) arrayList2.get(i11)).f37248a;
                    s00Var.getClass();
                    s00Var.f28578r = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false);
                    s00Var.v = -1;
                    s00Var.f28579s = i10;
                    s00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19978h6, false));
        this.f37682f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20174s5, false));
    }

    public final void e(s91 s91Var, boolean z4) {
        boolean z10;
        boolean z11;
        if (s91Var != null) {
            String str = s91Var.f38235j;
            xf.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            vf.g gVar = this.f37680b;
            gVar.setLandscape(z10);
            ArrayList arrayList = gVar.d;
            vf.j jVar = gVar.f45713d0;
            vf.g gVar2 = this.f37681c;
            gVar2.setLandscape(z10);
            this.f37684r = s91Var;
            boolean z12 = s91Var.f38237l;
            ArrayList arrayList2 = this.f37683n;
            a51 a51Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f37682f;
            if (!z12 && !s91Var.f38229a) {
                textView.setVisibility(8);
                xf.e eVar = gVar.f45731q0;
                boolean z13 = s91Var.f38239n;
                eVar.f46939a = z13;
                cVar.c(!z13);
                if (s91Var.d == null && s91Var.f38232f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(s91Var);
                    gVar.D(null);
                    return;
                }
                if (!z4) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(s91Var.d) && s91Var.h) {
                    jVar.f45758k = 0.0f;
                    jVar.f45759l = 1.0f;
                    jVar.f45751a.A(true, false, false);
                }
                cVar.setUseWeekInterval(s91Var.f38240o);
                gVar.f45731q0.setUseWeek(s91Var.f38240o);
                xf.e eVar2 = gVar.f45731q0;
                if (this.f37684r.f38233g == null && this.f37685s != 4) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                eVar2.C = z11;
                gVar2.f45731q0.C = false;
                eVar2.setEnabled(eVar2.C);
                xf.e eVar3 = gVar2.f45731q0;
                eVar3.setEnabled(eVar3.C);
                int size = arrayList.size();
                a51Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        xf.f fVar = (xf.f) arrayList.get(i10);
                        p91 p91Var = new p91(this, i10);
                        p91Var.f37249b = fVar;
                        String str2 = fVar.f46949a.d;
                        org.telegram.ui.Components.s00 s00Var = p91Var.f37248a;
                        s00Var.setText(str2);
                        s00Var.a(fVar.f46959n, false);
                        s00Var.setOnTouchListener(new Object());
                        s00Var.setOnClickListener(new gb0(22, p91Var, fVar));
                        s00Var.setOnLongClickListener(new nh.f2(6, p91Var, fVar));
                    }
                }
                long j10 = this.f37684r.f38231c;
                if (j10 > 0) {
                    gVar.f45730p0 = Arrays.binarySearch(gVar.f45715e0.f46537a, j10);
                    gVar.f45733r0 = true;
                    gVar.f45731q0.setVisibility(0);
                    gVar.f45735s0 = 1.0f;
                    gVar.x((gVar.D0 * jVar.f45758k) - vf.g.f45686h1);
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
                if (z4) {
                    gVar.f45738v0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f45740w0 = obj;
                    obj.f46968f = 0.0f;
                    ofFloat.addUpdateListener(new h11(this, 12));
                    ofFloat.addListener(new o91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = s91Var.f38230b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            a51Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z4) {
        ArrayList arrayList;
        boolean z10;
        float f10;
        vf.g gVar = this.f37680b;
        long selectedDate = gVar.getSelectedDate();
        wf.b bVar = this.f37684r.e;
        vf.g gVar2 = this.f37681c;
        if (!z4 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f37684r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f37684r.d.d.size();
                arrayList = this.f37683n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((wf.a) bVar.d.get(i12)).f46533c.equals(((wf.a) this.f37684r.d.d.get(i10)).f46533c)) {
                            boolean z11 = ((p91) arrayList.get(i10)).f37248a.f28574b;
                            ((xf.f) arrayList2.get(i12)).f46959n = z11;
                            xf.f fVar = (xf.f) arrayList2.get(i12);
                            if (z11) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f46960o = f10;
                            ((p91) arrayList.get(i10)).f37248a.f28575c = true;
                            ((p91) arrayList.get(i10)).f37248a.animate().alpha(1.0f).start();
                            if (z11) {
                                i11++;
                            }
                            z10 = true;
                        } else {
                            i12++;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
                if (!z10) {
                    ((p91) arrayList.get(i10)).f37248a.f28575c = false;
                    ((p91) arrayList.get(i10)).f37248a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f37684r.d.d.size(); i13++) {
                    ((p91) arrayList.get(i13)).f37248a.f28575c = true;
                    ((p91) arrayList.get(i13)).f37248a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f37684r.f38231c = selectedDate;
        gVar.f45731q0.setAlpha(0.0f);
        gVar.f45735s0 = 0.0f;
        gVar.f45733r0 = false;
        gVar.f45719f1 = false;
        gVar2.G();
        xf.c cVar = this.d;
        if (!z4) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z4) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f45738v0 = 0;
            gVar2.f45738v0 = 0;
            gVar.G = false;
            gVar2.G = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new o91(this, 0));
        a2.start();
    }

    public final void h(boolean z4) {
        wf.b bVar;
        s91 s91Var = this.f37684r;
        if (s91Var != null && (bVar = s91Var.d) != null && bVar.f46537a != null) {
            xf.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f46928a;
            vf.g gVar = this.f37680b;
            cVar.b(gVar.getStartDate(), gVar.getEndDate());
            if (z4) {
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
            gVar.f45731q0.f46942f.setAlpha(1.0f);
            vf.g gVar2 = this.f37681c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f37684r.f38231c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f37683n;
            if (!z4) {
                gVar2.setVisibility(4);
                gVar.G = true;
                gVar2.G = false;
                gVar.invalidate();
                Window window = this.f37679a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p91 p91Var = (p91) obj;
                    p91Var.f37248a.setAlpha(1.0f);
                    p91Var.f37248a.f28575c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new o91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                p91 p91Var2 = (p91) obj2;
                p91Var2.f37248a.animate().alpha(1.0f).start();
                p91Var2.f37248a.f28575c = true;
            }
            a2.start();
        }
    }
}
