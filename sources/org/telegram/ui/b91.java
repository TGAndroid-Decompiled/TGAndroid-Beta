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
public abstract class b91 extends FrameLayout {
    public final Window f35627a;
    public final jg.g f35628b;
    public final jg.g f35629c;
    public final lg.c d;
    public final RadialProgressView e;
    public final TextView f35630f;
    public final l41 h;
    public final ArrayList f35631n;
    public d91 f35632r;
    public final int f35633s;

    public b91(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f35631n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f35627a = ((Activity) context).getWindow();
        } else {
            this.f35627a = null;
        }
        this.f35633s = i10;
        LinearLayout e = org.telegram.messenger.kk.e(context, 1);
        this.h = new l41(context, 2);
        lg.c cVar = new lg.c(getContext(), d6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final b91 f43050b;

            {
                this.f43050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43050b.h(true);
                        return;
                    case 1:
                        this.f43050b.c();
                        return;
                    default:
                        this.f43050b.f35629c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f35628b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f35629c = gVar;
                            gVar.f14482t0.f16053y = true;
                        } else {
                            this.f35628b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f35629c = gVar2;
                            gVar2.f14482t0.f16053y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f35628b = qVar;
                        qVar.f14482t0.E = true;
                        ?? qVar2 = new jg.q(getContext());
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
                            qVar2.R1[i11] = a1.g.m(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f14466h1 = true;
                        this.f35629c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f14486w0 = true;
                    gVar3.f14488x0 = true;
                    this.f35628b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f35629c = gVar4;
                    gVar4.f14482t0.f16053y = true;
                }
            } else {
                this.f35628b = new jg.p(getContext(), d6Var);
                jg.p pVar = new jg.p(getContext(), d6Var);
                this.f35629c = pVar;
                pVar.f14482t0.f16053y = true;
            }
        } else {
            this.f35628b = new jg.g(getContext(), d6Var);
            jg.g gVar5 = new jg.g(getContext(), d6Var);
            this.f35629c = gVar5;
            gVar5.f14482t0.f16053y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35628b.f14447a = fVar;
        this.f35629c.f14447a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f35628b);
        frameLayout.addView(this.f35628b.f14482t0, -2, -2);
        frameLayout.addView(this.f35629c);
        frameLayout.addView(this.f35629c.f14482t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.z5.a(44.0f, 0.0f, 0.0f, 0.0f, 60.0f, 44, 17));
        TextView textView = new TextView(context);
        this.f35630f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 30.0f, -2, 17));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21269s5, d6Var));
        this.f35628b.setDateSelectionListener(new rp0(this, 18));
        this.f35628b.f14482t0.d(false, false);
        this.f35628b.f14482t0.setOnTouchListener(new Object());
        this.f35628b.f14482t0.setOnClickListener(new View.OnClickListener(this) {
            public final b91 f43050b;

            {
                this.f43050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43050b.h(true);
                        return;
                    case 1:
                        this.f43050b.c();
                        return;
                    default:
                        this.f43050b.f35629c.c(false);
                        return;
                }
            }
        });
        this.f35629c.f14482t0.setOnClickListener(new View.OnClickListener(this) {
            public final b91 f43050b;

            {
                this.f43050b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f43050b.h(true);
                        return;
                    case 1:
                        this.f43050b.c();
                        return;
                    default:
                        this.f43050b.f35629c.c(false);
                        return;
                }
            }
        });
        this.f35628b.setVisibility(0);
        this.f35629c.setVisibility(4);
        this.f35628b.setHeader(this.d);
        e.addView(this.d, w7.z5.d(52.0f, -1));
        e.addView(frameLayout, w7.z5.d(-2.0f, -1));
        e.addView(this.h, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -1, 7));
        if (this.f35633s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e.setClipChildren(false);
            e.setClipToPadding(false);
        }
        addView(e);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f35627a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f35628b;
        gVar.J = false;
        jg.g gVar2 = this.f35629c;
        gVar2.J = false;
        gVar.f14490y0 = 2;
        gVar2.f14490y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f14463g0;
        obj.f16071b = jVar.f14505l;
        obj.f16070a = jVar.f14504k;
        int binarySearch = Arrays.binarySearch(this.f35632r.d.f15053a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f35632r.d.f15053a.length - 1;
        }
        obj.f16072c = this.f35632r.d.f15054b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f14491z0 = obj;
        gVar.f14491z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f35632r.d.d.size(); i10++) {
            if (((kg.a) this.f35632r.d.d.get(i10)).f15047a[binarySearch] > j11) {
                j11 = ((kg.a) this.f35632r.d.d.get(i10)).f15047a[binarySearch];
            }
            if (((kg.a) this.f35632r.d.d.get(i10)).f15047a[binarySearch] < j12) {
                j12 = ((kg.a) this.f35632r.d.d.get(i10)).f15047a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = gVar.f14485w;
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
                b91 b91Var = b91.this;
                jg.g gVar3 = b91Var.f35628b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f14463g0;
                float f15 = jVar2.f14505l;
                float f16 = jVar2.f14504k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f14432k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f16072c) - f17;
                jVar3.f16073f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = b91Var.f35629c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(d91 d91Var);

    public abstract void c();

    public final void d() {
        kg.b bVar;
        ArrayList arrayList;
        int i10;
        jg.g gVar = this.f35628b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f35629c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        d91 d91Var = this.f35632r;
        if (d91Var != null && (bVar = d91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f35632r.d.d.size(); i11++) {
                if (((kg.a) this.f35632r.d.d.get(i11)).f15051g >= 0 && org.telegram.ui.ActionBar.h6.d1(((kg.a) this.f35632r.d.d.get(i11)).f15051g)) {
                    i10 = org.telegram.ui.ActionBar.h6.x0(null, ((kg.a) this.f35632r.d.d.get(i11)).f15051g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f35632r.d.d.get(i11)).f15052i;
                } else {
                    i10 = ((kg.a) this.f35632r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f35631n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.a10 a10Var = ((a91) arrayList2.get(i11)).f35363a;
                    a10Var.getClass();
                    a10Var.f24458r = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20993d6, false);
                    a10Var.v = -1;
                    a10Var.f24459s = i10;
                    a10Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065h6, false));
        this.f35630f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21269s5, false));
    }

    public final void e(d91 d91Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (d91Var != null) {
            String str = d91Var.f36132j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f35628b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f14463g0;
            jg.g gVar2 = this.f35629c;
            gVar2.setLandscape(z11);
            this.f35632r = d91Var;
            boolean z13 = d91Var.f36134l;
            ArrayList arrayList2 = this.f35631n;
            l41 l41Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f35630f;
            if (!z13 && !d91Var.f36126a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f14482t0;
                boolean z14 = d91Var.f36136n;
                eVar.f16044a = z14;
                cVar.c(!z14);
                if (d91Var.d == null && d91Var.f36129f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(d91Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(d91Var.d) && d91Var.h) {
                    jVar.f14504k = 0.0f;
                    jVar.f14505l = 1.0f;
                    jVar.f14497a.A(true, false, false);
                }
                cVar.setUseWeekInterval(d91Var.f36137o);
                gVar.f14482t0.setUseWeek(d91Var.f36137o);
                lg.e eVar2 = gVar.f14482t0;
                if (this.f35632r.f36130g == null && this.f35633s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f14482t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f14482t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                l41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        a91 a91Var = new a91(this, i10);
                        a91Var.f35364b = fVar;
                        String str2 = fVar.f16054a.d;
                        org.telegram.ui.Components.a10 a10Var = a91Var.f35363a;
                        a10Var.setText(str2);
                        a10Var.a(fVar.f16064n, false);
                        a10Var.setOnTouchListener(new Object());
                        a10Var.setOnClickListener(new ef0(17, a91Var, fVar));
                        a10Var.setOnLongClickListener(new ci.m2(6, a91Var, fVar));
                    }
                }
                long j10 = this.f35632r.f36128c;
                if (j10 > 0) {
                    gVar.f14481s0 = Arrays.binarySearch(gVar.f14465h0.f15053a, j10);
                    gVar.f14483u0 = true;
                    gVar.f14482t0.setVisibility(0);
                    gVar.f14484v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f14504k) - jg.g.f14432k1);
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
                    gVar.f14490y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f14491z0 = obj;
                    obj.f16073f = 0.0f;
                    ofFloat.addUpdateListener(new e11(this, 10));
                    ofFloat.addListener(new z81(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = d91Var.f36127b;
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
        jg.g gVar = this.f35628b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f35632r.e;
        jg.g gVar2 = this.f35629c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f35632r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f35632r.d.d.size();
                arrayList = this.f35631n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f15049c.equals(((kg.a) this.f35632r.d.d.get(i10)).f15049c)) {
                            boolean z12 = ((a91) arrayList.get(i10)).f35363a.f24454b;
                            ((lg.f) arrayList2.get(i12)).f16064n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f16065o = f7;
                            ((a91) arrayList.get(i10)).f35363a.f24455c = true;
                            ((a91) arrayList.get(i10)).f35363a.animate().alpha(1.0f).start();
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
                    ((a91) arrayList.get(i10)).f35363a.f24455c = false;
                    ((a91) arrayList.get(i10)).f35363a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f35632r.d.d.size(); i13++) {
                    ((a91) arrayList.get(i13)).f35363a.f24455c = true;
                    ((a91) arrayList.get(i13)).f35363a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f35632r.f36128c = selectedDate;
        gVar.f14482t0.setAlpha(0.0f);
        gVar.f14484v0 = 0.0f;
        gVar.f14483u0 = false;
        gVar.f14468i1 = false;
        gVar2.G();
        lg.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f14490y0 = 0;
            gVar2.f14490y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new z81(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        kg.b bVar;
        d91 d91Var = this.f35632r;
        if (d91Var != null && (bVar = d91Var.d) != null && bVar.f15053a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f16033a;
            jg.g gVar = this.f35628b;
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
            gVar.f14482t0.f16047f.setAlpha(1.0f);
            jg.g gVar2 = this.f35629c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f35632r.f36128c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f35631n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f35627a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    a91 a91Var = (a91) obj;
                    a91Var.f35363a.setAlpha(1.0f);
                    a91Var.f35363a.f24455c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new z81(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                a91 a91Var2 = (a91) obj2;
                a91Var2.f35363a.animate().alpha(1.0f).start();
                a91Var2.f35363a.f24455c = true;
            }
            a2.start();
        }
    }
}
