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

public abstract class a91 extends FrameLayout {

    public final Window f36463a;

    public final rf.g f36464b;

    public final rf.g f36465c;
    public final tf.c d;

    public final RadialProgressView f36466e;

    public final TextView f36467f;
    public final z71 h;

    public final ArrayList f36468n;

    public c91 f36469r;

    public final int f36470s;

    public a91(Context context, int i10, rf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f36468n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f36463a = ((Activity) context).getWindow();
        } else {
            this.f36463a = null;
        }
        this.f36470s = i10;
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        this.h = new z71(context, 1);
        tf.c cVar = new tf.c(getContext(), c6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new org.telegram.ui.Components.kk0());
        final int i11 = 0;
        cVar.d.setOnClickListener(new View.OnClickListener(this) {

            public final a91 f43671b;

            {
                this.f43671b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.f43671b.h(true);
                        break;
                    case 1:
                        this.f43671b.c();
                        break;
                    default:
                        this.f43671b.f36465c.c(false);
                        break;
                }
            }
        });
        if (i10 == 1) {
            this.f36464b = new rf.k(getContext(), c6Var);
            rf.k kVar = new rf.k(getContext(), c6Var);
            this.f36465c = kVar;
            kVar.f46978p0.f48194y = true;
        } else if (i10 == 2) {
            this.f36464b = new rf.p(getContext(), c6Var);
            rf.p pVar = new rf.p(getContext(), c6Var);
            this.f36465c = pVar;
            pVar.f46978p0.f48194y = true;
        } else if (i10 == 3) {
            rf.a aVar = new rf.a(getContext(), null);
            aVar.f46983s0 = true;
            aVar.f46984t0 = true;
            this.f36464b = aVar;
            rf.m mVar = new rf.m(getContext(), null);
            this.f36465c = mVar;
            mVar.f46978p0.f48194y = true;
        } else if (i10 == 4) {
            rf.q qVar = new rf.q(getContext());
            this.f36464b = qVar;
            qVar.f46978p0.A = true;
            rf.n nVar = new rf.n(getContext());
            nVar.I1 = -1;
            nVar.J1 = new RectF();
            nVar.L1 = AndroidUtilities.dp(9.0f);
            nVar.M1 = AndroidUtilities.dp(13.0f);
            nVar.N1 = new String[101];
            nVar.P1 = 1.0f;
            nVar.Q1 = 0;
            nVar.R1 = -1;
            nVar.S1 = -1;
            for (int i12 = 1; i12 <= 100; i12++) {
                nVar.N1[i12] = s3.c.d(i12, "%");
            }
            TextPaint textPaint = new TextPaint(1);
            nVar.K1 = textPaint;
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(-1);
            textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
            nVar.f46962d1 = true;
            this.f36465c = nVar;
        } else if (i10 != 5) {
            this.f36464b = new rf.m(getContext(), null);
            rf.m mVar2 = new rf.m(getContext(), null);
            this.f36465c = mVar2;
            mVar2.f46978p0.f48194y = true;
        } else {
            this.f36464b = new rf.l(getContext(), null);
            rf.l lVar = new rf.l(getContext(), null);
            this.f36465c = lVar;
            lVar.f46978p0.f48194y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36464b.f46952a = fVar;
        this.f36465c.f46952a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f36466e = radialProgressView;
        frameLayout.addView(this.f36464b);
        frameLayout.addView(this.f36464b.f46978p0, -2, -2);
        frameLayout.addView(this.f36465c);
        frameLayout.addView(this.f36465c.f46978p0, -2, -2);
        frameLayout.addView(radialProgressView, h7.z5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f36467f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23319s5, c6Var));
        this.f36464b.setDateSelectionListener(new dl0(this, 19));
        this.f36464b.f46978p0.d(false, false);
        this.f36464b.f46978p0.setOnTouchListener(new org.telegram.ui.Components.kk0());
        final int i13 = 1;
        this.f36464b.f46978p0.setOnClickListener(new View.OnClickListener(this) {

            public final a91 f43671b;

            {
                this.f43671b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.f43671b.h(true);
                        break;
                    case 1:
                        this.f43671b.c();
                        break;
                    default:
                        this.f43671b.f36465c.c(false);
                        break;
                }
            }
        });
        final int i14 = 2;
        this.f36465c.f46978p0.setOnClickListener(new View.OnClickListener(this) {

            public final a91 f43671b;

            {
                this.f43671b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        this.f43671b.h(true);
                        break;
                    case 1:
                        this.f43671b.c();
                        break;
                    default:
                        this.f43671b.f36465c.c(false);
                        break;
                }
            }
        });
        this.f36464b.setVisibility(0);
        this.f36465c.setVisibility(4);
        this.f36464b.setHeader(this.d);
        linearLayoutG.addView(this.d, h7.z5.c(52.0f, -1));
        linearLayoutG.addView(frameLayout, h7.z5.c(-2.0f, -1));
        linearLayoutG.addView(this.h, h7.z5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f36470s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            linearLayoutG.setClipChildren(false);
            linearLayoutG.setClipToPadding(false);
        }
        addView(linearLayoutG);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        Window window = this.f36463a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        rf.g gVar = this.f36464b;
        gVar.F = false;
        rf.g gVar2 = this.f36465c;
        gVar2.F = false;
        gVar.f46985u0 = 2;
        gVar2.f46985u0 = 1;
        final tf.j jVar = new tf.j();
        rf.j jVar2 = gVar.f46959c0;
        jVar.f48213b = jVar2.f47009l;
        jVar.f48212a = jVar2.f47008k;
        int iBinarySearch = Arrays.binarySearch(this.f36469r.d.f47881a, j10);
        if (iBinarySearch < 0) {
            iBinarySearch = this.f36469r.d.f47881a.length - 1;
        }
        jVar.f48214c = this.f36469r.d.f47882b[iBinarySearch];
        gVar2.setVisibility(0);
        gVar2.f46986v0 = jVar;
        gVar.f46986v0 = jVar;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f36469r.d.d.size(); i10++) {
            if (((sf.a) this.f36469r.d.d.get(i10)).f47874a[iBinarySearch] > j11) {
                j11 = ((sf.a) this.f36469r.d.d.get(i10)).f47874a[iBinarySearch];
            }
            if (((sf.a) this.f36469r.d.d.get(i10)).f47874a[iBinarySearch] < j12) {
                j12 = ((sf.a) this.f36469r.d.d.get(i10)).f47874a[iBinarySearch];
            }
        }
        float f10 = j12 + (j11 - j12);
        float f11 = gVar.f46987w;
        final float f12 = (f10 - f11) / (gVar.v - f11);
        gVar.q(jVar);
        gVar2.q(jVar);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                a91 a91Var = this.f44326a;
                rf.g gVar3 = a91Var.f36464b;
                float f13 = gVar3.B0;
                rf.j jVar3 = gVar3.f46959c0;
                float f14 = jVar3.f47009l;
                float f15 = jVar3.f47008k;
                float f16 = ((f13 / (f14 - f15)) * f15) - rf.g.f46934g1;
                RectF rectF = gVar3.D0;
                float fHeight = (rectF.height() * (1.0f - f12)) + rectF.top;
                tf.j jVar4 = jVar;
                jVar4.f48215e = fHeight;
                jVar4.d = (gVar3.C0 * jVar4.f48214c) - f16;
                jVar4.f48216f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf.g gVar4 = a91Var.f36465c;
                gVar4.invalidate();
                gVar4.q(jVar4);
                gVar3.invalidate();
            }
        });
        valueAnimatorOfFloat.setDuration(400L);
        valueAnimatorOfFloat.setInterpolator(new u1.a());
        return valueAnimatorOfFloat;
    }

    public abstract void b(c91 c91Var);

    public abstract void c();

    public final void d() {
        sf.b bVar;
        ArrayList arrayList;
        rf.g gVar = this.f36464b;
        gVar.G();
        gVar.invalidate();
        rf.g gVar2 = this.f36465c;
        gVar2.G();
        gVar2.invalidate();
        tf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        c91 c91Var = this.f36469r;
        if (c91Var != null && (bVar = c91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f36469r.d.d.size(); i10++) {
                int iW0 = (((sf.a) this.f36469r.d.d.get(i10)).f47879g < 0 || !org.telegram.ui.ActionBar.g6.c1(((sf.a) this.f36469r.d.d.get(i10)).f47879g)) ? i0.b.f(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false)) < 0.5d ? ((sf.a) this.f36469r.d.d.get(i10)).f47880i : ((sf.a) this.f36469r.d.d.get(i10)).h : org.telegram.ui.ActionBar.g6.w0(null, ((sf.a) this.f36469r.d.d.get(i10)).f47879g, false);
                ArrayList arrayList2 = this.f36468n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.g00 g00Var = ((z81) arrayList2.get(i10)).f45104a;
                    g00Var.getClass();
                    g00Var.f28486r = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false);
                    g00Var.v = -1;
                    g00Var.f28487s = iW0;
                    g00Var.invalidate();
                }
            }
        }
        this.f36466e.setProgressColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23125h6, false));
        this.f36467f.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23319s5, false));
    }

    public final void e(c91 c91Var, boolean z10) {
        if (c91Var == null) {
            return;
        }
        String str = c91Var.f37028j;
        tf.c cVar = this.d;
        cVar.setTitle(str);
        boolean z11 = getContext().getResources().getConfiguration().orientation == 2;
        rf.g gVar = this.f36464b;
        gVar.setLandscape(z11);
        ArrayList arrayList = gVar.d;
        rf.j jVar = gVar.f46959c0;
        rf.g gVar2 = this.f36465c;
        gVar2.setLandscape(z11);
        this.f36469r = c91Var;
        boolean z12 = c91Var.f37030l;
        ArrayList arrayList2 = this.f36468n;
        z71 z71Var = this.h;
        RadialProgressView radialProgressView = this.f36466e;
        TextView textView = this.f36467f;
        if (z12 || c91Var.f37021a) {
            radialProgressView.setVisibility(8);
            String str2 = c91Var.f37022b;
            if (str2 != null) {
                textView.setText(str2);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            z71Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
            return;
        }
        textView.setVisibility(8);
        tf.e eVar = gVar.f46978p0;
        boolean z13 = c91Var.f37032n;
        eVar.f48184a = z13;
        cVar.c(!z13);
        if (c91Var.d == null && c91Var.f37025f != null) {
            radialProgressView.setAlpha(1.0f);
            radialProgressView.setVisibility(0);
            b(c91Var);
            gVar.D(null);
            return;
        }
        if (!z10) {
            radialProgressView.setVisibility(8);
        }
        if (gVar.D(c91Var.d) && c91Var.h) {
            jVar.f47008k = 0.0f;
            jVar.f47009l = 1.0f;
            jVar.f47000a.A(true, false, false);
        }
        cVar.setUseWeekInterval(c91Var.f37033o);
        gVar.f46978p0.setUseWeek(c91Var.f37033o);
        tf.e eVar2 = gVar.f46978p0;
        eVar2.B = this.f36469r.f37026g != null || this.f36470s == 4;
        gVar2.f46978p0.B = false;
        eVar2.setEnabled(eVar2.B);
        tf.e eVar3 = gVar2.f46978p0;
        eVar3.setEnabled(eVar3.B);
        int size = arrayList.size();
        z71Var.removeAllViews();
        arrayList2.clear();
        if (size > 1) {
            for (int i10 = 0; i10 < size; i10++) {
                tf.f fVar = (tf.f) arrayList.get(i10);
                z81 z81Var = new z81(this, i10);
                z81Var.f45105b = fVar;
                String str3 = fVar.f48195a.d;
                org.telegram.ui.Components.g00 g00Var = z81Var.f45104a;
                g00Var.setText(str3);
                g00Var.a(fVar.f48206n, false);
                g00Var.setOnTouchListener(new org.telegram.ui.Components.kk0());
                g00Var.setOnClickListener(new u70(25, z81Var, fVar));
                g00Var.setOnLongClickListener(new jh.f2(6, z81Var, fVar));
            }
        }
        long j10 = this.f36469r.f37023c;
        if (j10 > 0) {
            gVar.f46977o0 = Arrays.binarySearch(gVar.f46961d0.f47881a, j10);
            gVar.f46979q0 = true;
            gVar.f46978p0.setVisibility(0);
            gVar.f46981r0 = 1.0f;
            gVar.x((gVar.C0 * jVar.f47008k) - rf.g.f46934g1);
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
            gVar.f46985u0 = 3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            tf.j jVar2 = new tf.j();
            gVar.f46986v0 = jVar2;
            jVar2.f48216f = 0.0f;
            valueAnimatorOfFloat.addUpdateListener(new w01(this, 12));
            valueAnimatorOfFloat.addListener(new y81(this, 2));
            valueAnimatorOfFloat.start();
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        rf.g gVar = this.f36464b;
        long selectedDate = gVar.getSelectedDate();
        sf.b bVar = this.f36469r.f37024e;
        rf.g gVar2 = this.f36465c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f36469r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f36469r.d.d.size();
                arrayList = this.f36468n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 >= bVar.d.size()) {
                        z11 = false;
                        break;
                    }
                    if (((sf.a) bVar.d.get(i12)).f47876c.equals(((sf.a) this.f36469r.d.d.get(i10)).f47876c)) {
                        boolean z12 = ((z81) arrayList.get(i10)).f45104a.f28481b;
                        ((tf.f) arrayList2.get(i12)).f48206n = z12;
                        ((tf.f) arrayList2.get(i12)).f48207o = z12 ? 1.0f : 0.0f;
                        ((z81) arrayList.get(i10)).f45104a.f28482c = true;
                        ((z81) arrayList.get(i10)).f45104a.animate().alpha(1.0f).start();
                        if (z12) {
                            i11++;
                        }
                        z11 = true;
                        break;
                    }
                    i12++;
                }
                if (!z11) {
                    ((z81) arrayList.get(i10)).f45104a.f28482c = false;
                    ((z81) arrayList.get(i10)).f45104a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f36469r.d.d.size(); i13++) {
                    ((z81) arrayList.get(i13)).f45104a.f28482c = true;
                    ((z81) arrayList.get(i13)).f45104a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f36469r.f37023c = selectedDate;
        gVar.f46978p0.setAlpha(0.0f);
        gVar.f46981r0 = 0.0f;
        gVar.f46979q0 = false;
        gVar.f46965e1 = false;
        gVar2.G();
        tf.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (!z10) {
            ValueAnimator valueAnimatorA = a(selectedDate, true);
            valueAnimatorA.addListener(new y81(this, 0));
            valueAnimatorA.start();
            return;
        }
        gVar.setVisibility(4);
        gVar2.setVisibility(0);
        gVar.f46985u0 = 0;
        gVar2.f46985u0 = 0;
        gVar.F = false;
        gVar2.F = true;
        cVar.d(selectedDate, false);
    }

    public final void h(boolean z10) {
        sf.b bVar;
        c91 c91Var = this.f36469r;
        if (c91Var == null || (bVar = c91Var.d) == null || bVar.f47881a == null) {
            return;
        }
        tf.c cVar = this.d;
        TextView textView = cVar.d;
        TextView textView2 = cVar.f48171a;
        rf.g gVar = this.f36464b;
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
        gVar.f46978p0.f48188f.setAlpha(1.0f);
        rf.g gVar2 = this.f36465c;
        gVar2.setHeader(null);
        long selectedDate = gVar.getSelectedDate();
        this.f36469r.f37023c = 0L;
        int i10 = 0;
        gVar.setVisibility(0);
        gVar2.d();
        gVar2.setHeader(null);
        gVar.setHeader(cVar);
        ArrayList arrayList = this.f36468n;
        if (z10) {
            ValueAnimator valueAnimatorA = a(selectedDate, false);
            valueAnimatorA.addListener(new y81(this, 1));
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z81 z81Var = (z81) obj;
                z81Var.f45104a.animate().alpha(1.0f).start();
                z81Var.f45104a.f28482c = true;
            }
            valueAnimatorA.start();
            return;
        }
        gVar2.setVisibility(4);
        gVar.F = true;
        gVar2.F = false;
        gVar.invalidate();
        Window window = this.f36463a;
        if (window != null) {
            window.clearFlags(16);
        }
        int size2 = arrayList.size();
        while (i10 < size2) {
            Object obj2 = arrayList.get(i10);
            i10++;
            z81 z81Var2 = (z81) obj2;
            z81Var2.f45104a.setAlpha(1.0f);
            z81Var2.f45104a.f28482c = true;
        }
    }
}
