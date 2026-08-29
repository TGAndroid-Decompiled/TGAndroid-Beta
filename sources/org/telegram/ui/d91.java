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
public abstract class d91 extends FrameLayout {
    public final Window f37424a;
    public final tf.g f37425b;
    public final tf.g f37426c;
    public final vf.c d;
    public final RadialProgressView f37427e;
    public final TextView f37428f;
    public final n31 h;
    public final ArrayList f37429n;
    public f91 f37430r;
    public final int f37431s;

    public d91(Context context, int i10, tf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f37429n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f37424a = ((Activity) context).getWindow();
        } else {
            this.f37424a = null;
        }
        this.f37431s = i10;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        this.h = new n31(context, 3);
        vf.c cVar = new vf.c(getContext(), c6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f45108b;

            {
                this.f45108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45108b.h(true);
                        return;
                    case 1:
                        this.f45108b.c();
                        return;
                    default:
                        this.f45108b.f37426c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f37425b = new tf.g(getContext(), null);
                            tf.g gVar = new tf.g(getContext(), null);
                            this.f37426c = gVar;
                            gVar.f48278p0.f49571y = true;
                        } else {
                            this.f37425b = new tf.g(getContext(), null);
                            tf.g gVar2 = new tf.g(getContext(), null);
                            this.f37426c = gVar2;
                            gVar2.f48278p0.f49571y = true;
                        }
                    } else {
                        tf.q qVar = new tf.q(getContext());
                        this.f37425b = qVar;
                        qVar.f48278p0.A = true;
                        ?? qVar2 = new tf.q(getContext());
                        qVar2.I1 = -1;
                        qVar2.J1 = new RectF();
                        qVar2.L1 = AndroidUtilities.dp(9.0f);
                        qVar2.M1 = AndroidUtilities.dp(13.0f);
                        qVar2.N1 = new String[101];
                        qVar2.P1 = 1.0f;
                        qVar2.Q1 = 0;
                        qVar2.R1 = -1;
                        qVar2.S1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            qVar2.N1[i11] = u3.c.d(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.K1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f48262d1 = true;
                        this.f37426c = qVar2;
                    }
                } else {
                    tf.g gVar3 = new tf.g(getContext(), null);
                    gVar3.f48283s0 = true;
                    gVar3.f48284t0 = true;
                    this.f37425b = gVar3;
                    tf.g gVar4 = new tf.g(getContext(), null);
                    this.f37426c = gVar4;
                    gVar4.f48278p0.f49571y = true;
                }
            } else {
                this.f37425b = new tf.p(getContext(), c6Var);
                tf.p pVar = new tf.p(getContext(), c6Var);
                this.f37426c = pVar;
                pVar.f48278p0.f49571y = true;
            }
        } else {
            this.f37425b = new tf.g(getContext(), c6Var);
            tf.g gVar5 = new tf.g(getContext(), c6Var);
            this.f37426c = gVar5;
            gVar5.f48278p0.f49571y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37425b.f48252a = fVar;
        this.f37426c.f48252a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37427e = radialProgressView;
        frameLayout.addView(this.f37425b);
        frameLayout.addView(this.f37425b.f48278p0, -2, -2);
        frameLayout.addView(this.f37426c);
        frameLayout.addView(this.f37426c.f48278p0, -2, -2);
        frameLayout.addView(radialProgressView, i7.f6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f37428f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23326s5, c6Var));
        this.f37425b.setDateSelectionListener(new zk0(this, 19));
        this.f37425b.f48278p0.d(false, false);
        this.f37425b.f48278p0.setOnTouchListener(new Object());
        this.f37425b.f48278p0.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f45108b;

            {
                this.f45108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45108b.h(true);
                        return;
                    case 1:
                        this.f45108b.c();
                        return;
                    default:
                        this.f45108b.f37426c.c(false);
                        return;
                }
            }
        });
        this.f37426c.f48278p0.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f45108b;

            {
                this.f45108b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f45108b.h(true);
                        return;
                    case 1:
                        this.f45108b.c();
                        return;
                    default:
                        this.f45108b.f37426c.c(false);
                        return;
                }
            }
        });
        this.f37425b.setVisibility(0);
        this.f37426c.setVisibility(4);
        this.f37425b.setHeader(this.d);
        g10.addView(this.d, i7.f6.c(52.0f, -1));
        g10.addView(frameLayout, i7.f6.c(-2.0f, -1));
        g10.addView(this.h, i7.f6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f37431s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            g10.setClipChildren(false);
            g10.setClipToPadding(false);
        }
        addView(g10);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f9;
        Window window = this.f37424a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        tf.g gVar = this.f37425b;
        gVar.F = false;
        tf.g gVar2 = this.f37426c;
        gVar2.F = false;
        gVar.f48285u0 = 2;
        gVar2.f48285u0 = 1;
        final ?? obj = new Object();
        tf.j jVar = gVar.f48259c0;
        obj.f49590b = jVar.f48309l;
        obj.f49589a = jVar.f48308k;
        int binarySearch = Arrays.binarySearch(this.f37430r.d.f49197a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f37430r.d.f49197a.length - 1;
        }
        obj.f49591c = this.f37430r.d.f49198b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f48286v0 = obj;
        gVar.f48286v0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f37430r.d.d.size(); i10++) {
            if (((uf.a) this.f37430r.d.d.get(i10)).f49190a[binarySearch] > j11) {
                j11 = ((uf.a) this.f37430r.d.d.get(i10)).f49190a[binarySearch];
            }
            if (((uf.a) this.f37430r.d.d.get(i10)).f49190a[binarySearch] < j12) {
                j12 = ((uf.a) this.f37430r.d.d.get(i10)).f49190a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = gVar.f48287w;
        final float f12 = (f10 - f11) / (gVar.v - f11);
        gVar.q(obj);
        gVar2.q(obj);
        float f13 = 1.0f;
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        if (!z10) {
            f13 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f13);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                d91 d91Var = d91.this;
                tf.g gVar3 = d91Var.f37425b;
                float f14 = gVar3.B0;
                tf.j jVar2 = gVar3.f48259c0;
                float f15 = jVar2.f48309l;
                float f16 = jVar2.f48308k;
                float f17 = ((f14 / (f15 - f16)) * f16) - tf.g.f48234g1;
                RectF rectF = gVar3.D0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                vf.j jVar3 = obj;
                jVar3.f49592e = height;
                jVar3.d = (gVar3.C0 * jVar3.f49591c) - f17;
                jVar3.f49593f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tf.g gVar4 = d91Var.f37426c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(f91 f91Var);

    public abstract void c();

    public final void d() {
        uf.b bVar;
        ArrayList arrayList;
        int i10;
        tf.g gVar = this.f37425b;
        gVar.G();
        gVar.invalidate();
        tf.g gVar2 = this.f37426c;
        gVar2.G();
        gVar2.invalidate();
        vf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        f91 f91Var = this.f37430r;
        if (f91Var != null && (bVar = f91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f37430r.d.d.size(); i11++) {
                if (((uf.a) this.f37430r.d.d.get(i11)).f49195g >= 0 && org.telegram.ui.ActionBar.g6.c1(((uf.a) this.f37430r.d.d.get(i11)).f49195g)) {
                    i10 = org.telegram.ui.ActionBar.g6.w0(null, ((uf.a) this.f37430r.d.d.get(i11)).f49195g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false)) < 0.5d) {
                    i10 = ((uf.a) this.f37430r.d.d.get(i11)).f49196i;
                } else {
                    i10 = ((uf.a) this.f37430r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f37429n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.o00 o00Var = ((c91) arrayList2.get(i11)).f37056a;
                    o00Var.getClass();
                    o00Var.f31211r = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false);
                    o00Var.v = -1;
                    o00Var.f31212s = i10;
                    o00Var.invalidate();
                }
            }
        }
        this.f37427e.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23134h6, false));
        this.f37428f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23326s5, false));
    }

    public final void e(f91 f91Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (f91Var != null) {
            String str = f91Var.f38076j;
            vf.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            tf.g gVar = this.f37425b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            tf.j jVar = gVar.f48259c0;
            tf.g gVar2 = this.f37426c;
            gVar2.setLandscape(z11);
            this.f37430r = f91Var;
            boolean z13 = f91Var.f38078l;
            ArrayList arrayList2 = this.f37429n;
            n31 n31Var = this.h;
            RadialProgressView radialProgressView = this.f37427e;
            TextView textView = this.f37428f;
            if (!z13 && !f91Var.f38069a) {
                textView.setVisibility(8);
                vf.e eVar = gVar.f48278p0;
                boolean z14 = f91Var.f38080n;
                eVar.f49561a = z14;
                cVar.c(!z14);
                if (f91Var.d == null && f91Var.f38073f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(f91Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(f91Var.d) && f91Var.h) {
                    jVar.f48308k = 0.0f;
                    jVar.f48309l = 1.0f;
                    jVar.f48300a.A(true, false, false);
                }
                cVar.setUseWeekInterval(f91Var.f38081o);
                gVar.f48278p0.setUseWeek(f91Var.f38081o);
                vf.e eVar2 = gVar.f48278p0;
                if (this.f37430r.f38074g == null && this.f37431s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.B = z12;
                gVar2.f48278p0.B = false;
                eVar2.setEnabled(eVar2.B);
                vf.e eVar3 = gVar2.f48278p0;
                eVar3.setEnabled(eVar3.B);
                int size = arrayList.size();
                n31Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        vf.f fVar = (vf.f) arrayList.get(i10);
                        c91 c91Var = new c91(this, i10);
                        c91Var.f37057b = fVar;
                        String str2 = fVar.f49572a.d;
                        org.telegram.ui.Components.o00 o00Var = c91Var.f37056a;
                        o00Var.setText(str2);
                        o00Var.a(fVar.f49583n, false);
                        o00Var.setOnTouchListener(new Object());
                        o00Var.setOnClickListener(new t70(25, c91Var, fVar));
                        o00Var.setOnLongClickListener(new lh.e2(6, c91Var, fVar));
                    }
                }
                long j10 = this.f37430r.f38071c;
                if (j10 > 0) {
                    gVar.f48277o0 = Arrays.binarySearch(gVar.f48261d0.f49197a, j10);
                    gVar.f48279q0 = true;
                    gVar.f48278p0.setVisibility(0);
                    gVar.f48281r0 = 1.0f;
                    gVar.x((gVar.C0 * jVar.f48308k) - tf.g.f48234g1);
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
                    gVar.f48285u0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f48286v0 = obj;
                    obj.f49593f = 0.0f;
                    ofFloat.addUpdateListener(new w01(this, 12));
                    ofFloat.addListener(new b91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = f91Var.f38070b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            n31Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f9;
        tf.g gVar = this.f37425b;
        long selectedDate = gVar.getSelectedDate();
        uf.b bVar = this.f37430r.f38072e;
        tf.g gVar2 = this.f37426c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f37430r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f37430r.d.d.size();
                arrayList = this.f37429n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((uf.a) bVar.d.get(i12)).f49192c.equals(((uf.a) this.f37430r.d.d.get(i10)).f49192c)) {
                            boolean z12 = ((c91) arrayList.get(i10)).f37056a.f31206b;
                            ((vf.f) arrayList2.get(i12)).f49583n = z12;
                            vf.f fVar = (vf.f) arrayList2.get(i12);
                            if (z12) {
                                f9 = 1.0f;
                            } else {
                                f9 = 0.0f;
                            }
                            fVar.f49584o = f9;
                            ((c91) arrayList.get(i10)).f37056a.f31207c = true;
                            ((c91) arrayList.get(i10)).f37056a.animate().alpha(1.0f).start();
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
                    ((c91) arrayList.get(i10)).f37056a.f31207c = false;
                    ((c91) arrayList.get(i10)).f37056a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f37430r.d.d.size(); i13++) {
                    ((c91) arrayList.get(i13)).f37056a.f31207c = true;
                    ((c91) arrayList.get(i13)).f37056a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f37430r.f38071c = selectedDate;
        gVar.f48278p0.setAlpha(0.0f);
        gVar.f48281r0 = 0.0f;
        gVar.f48279q0 = false;
        gVar.f48265e1 = false;
        gVar2.G();
        vf.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f48285u0 = 0;
            gVar2.f48285u0 = 0;
            gVar.F = false;
            gVar2.F = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new b91(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        uf.b bVar;
        f91 f91Var = this.f37430r;
        if (f91Var != null && (bVar = f91Var.d) != null && bVar.f49197a != null) {
            vf.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f49548a;
            tf.g gVar = this.f37425b;
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
            gVar.f48278p0.f49565f.setAlpha(1.0f);
            tf.g gVar2 = this.f37426c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f37430r.f38071c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f37429n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.F = true;
                gVar2.F = false;
                gVar.invalidate();
                Window window = this.f37424a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    c91 c91Var = (c91) obj;
                    c91Var.f37056a.setAlpha(1.0f);
                    c91Var.f37056a.f31207c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new b91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                c91 c91Var2 = (c91) obj2;
                c91Var2.f37056a.animate().alpha(1.0f).start();
                c91Var2.f37056a.f31207c = true;
            }
            a2.start();
        }
    }
}
