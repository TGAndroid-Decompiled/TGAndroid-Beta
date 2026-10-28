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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.RadialProgressView;
public abstract class i91 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final Window f40071a;
    public final kg.h f40072b;
    public final kg.h f40073c;
    public final mg.c d;
    public final RadialProgressView e;
    public final TextView f40074f;
    public final r41 h;
    public final ArrayList f40075n;
    public k91 f40076r;
    public final int f40077s;

    public i91(Context context, int i10, kg.g gVar, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f40075n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f40071a = ((Activity) context).getWindow();
        } else {
            this.f40071a = null;
        }
        this.f40077s = i10;
        LinearLayout d = org.telegram.messenger.wh.d(context, 1);
        this.h = new r41(context, 2);
        mg.c cVar = new mg.c(getContext(), u6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final i91 f38820b;

            {
                this.f38820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38820b.h(true);
                        return;
                    case 1:
                        this.f38820b.c();
                        return;
                    default:
                        this.f38820b.f40073c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f40072b = new kg.h(getContext(), null);
                            kg.h hVar = new kg.h(getContext(), null);
                            this.f40073c = hVar;
                            hVar.f16617t0.f18463y = true;
                        } else {
                            this.f40072b = new kg.h(getContext(), null);
                            kg.h hVar2 = new kg.h(getContext(), null);
                            this.f40073c = hVar2;
                            hVar2.f16617t0.f18463y = true;
                        }
                    } else {
                        kg.r rVar = new kg.r(getContext());
                        this.f40072b = rVar;
                        rVar.f16617t0.E = true;
                        ?? rVar2 = new kg.r(getContext());
                        rVar2.M1 = -1;
                        rVar2.N1 = new RectF();
                        rVar2.P1 = AndroidUtilities.dp(9.0f);
                        rVar2.Q1 = AndroidUtilities.dp(13.0f);
                        rVar2.R1 = new String[101];
                        rVar2.T1 = 1.0f;
                        rVar2.U1 = 0;
                        rVar2.V1 = -1;
                        rVar2.W1 = -1;
                        for (int i11 = 1; i11 <= 100; i11++) {
                            rVar2.R1[i11] = a1.g.m(i11, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        rVar2.O1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        rVar2.f16601h1 = true;
                        this.f40073c = rVar2;
                    }
                } else {
                    kg.h hVar3 = new kg.h(getContext(), null);
                    hVar3.f16621w0 = true;
                    hVar3.f16623x0 = true;
                    this.f40072b = hVar3;
                    kg.h hVar4 = new kg.h(getContext(), null);
                    this.f40073c = hVar4;
                    hVar4.f16617t0.f18463y = true;
                }
            } else {
                this.f40072b = new kg.q(getContext(), u6Var);
                kg.q qVar = new kg.q(getContext(), u6Var);
                this.f40073c = qVar;
                qVar.f16617t0.f18463y = true;
            }
        } else {
            this.f40072b = new kg.h(getContext(), u6Var);
            kg.h hVar5 = new kg.h(getContext(), u6Var);
            this.f40073c = hVar5;
            hVar5.f16617t0.f18463y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f40072b.f16582a = gVar;
        this.f40073c.f16582a = gVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f40072b);
        frameLayout.addView(this.f40072b.f16617t0, -2, -2);
        frameLayout.addView(this.f40073c);
        frameLayout.addView(this.f40073c.f16617t0, -2, -2);
        frameLayout.addView(radialProgressView, org.telegram.ui.Components.kb1.h(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f40074f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23634s5, u6Var);
        this.f40072b.setDateSelectionListener(new jl0(this, 19));
        this.f40072b.f16617t0.d(false, false);
        this.f40072b.f16617t0.setOnTouchListener(new Object());
        this.f40072b.f16617t0.setOnClickListener(new View.OnClickListener(this) {
            public final i91 f38820b;

            {
                this.f38820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38820b.h(true);
                        return;
                    case 1:
                        this.f38820b.c();
                        return;
                    default:
                        this.f38820b.f40073c.c(false);
                        return;
                }
            }
        });
        this.f40073c.f16617t0.setOnClickListener(new View.OnClickListener(this) {
            public final i91 f38820b;

            {
                this.f38820b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f38820b.h(true);
                        return;
                    case 1:
                        this.f38820b.c();
                        return;
                    default:
                        this.f38820b.f40073c.c(false);
                        return;
                }
            }
        });
        this.f40072b.setVisibility(0);
        this.f40073c.setVisibility(4);
        this.f40072b.setHeader(this.d);
        d.addView(this.d, org.telegram.ui.Components.kb1.g(52.0f, -1));
        d.addView(frameLayout, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        d.addView(this.h, org.telegram.ui.Components.kb1.h(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f40077s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            d.setClipChildren(false);
            d.setClipToPadding(false);
        }
        addView(d);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f40071a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        kg.h hVar = this.f40072b;
        hVar.J = false;
        kg.h hVar2 = this.f40073c;
        hVar2.J = false;
        hVar.f16625y0 = 2;
        hVar2.f16625y0 = 1;
        final ?? obj = new Object();
        kg.k kVar = hVar.f16598g0;
        obj.f18481b = kVar.f16640l;
        obj.f18480a = kVar.f16639k;
        int binarySearch = Arrays.binarySearch(this.f40076r.d.f17010a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f40076r.d.f17010a.length - 1;
        }
        obj.f18482c = this.f40076r.d.f17011b[binarySearch];
        hVar2.setVisibility(0);
        hVar2.f16626z0 = obj;
        hVar.f16626z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f40076r.d.d.size(); i10++) {
            if (((lg.a) this.f40076r.d.d.get(i10)).f17004a[binarySearch] > j11) {
                j11 = ((lg.a) this.f40076r.d.d.get(i10)).f17004a[binarySearch];
            }
            if (((lg.a) this.f40076r.d.d.get(i10)).f17004a[binarySearch] < j12) {
                j12 = ((lg.a) this.f40076r.d.d.get(i10)).f17004a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = hVar.f16620w;
        final float f12 = (f10 - f11) / (hVar.v - f11);
        hVar.q(obj);
        hVar2.q(obj);
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
                i91 i91Var = i91.this;
                kg.h hVar3 = i91Var.f40072b;
                float f14 = hVar3.F0;
                kg.k kVar2 = hVar3.f16598g0;
                float f15 = kVar2.f16640l;
                float f16 = kVar2.f16639k;
                float f17 = ((f14 / (f15 - f16)) * f16) - kg.h.f16567k1;
                RectF rectF = hVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                mg.j jVar = obj;
                jVar.e = height;
                jVar.d = (hVar3.G0 * jVar.f18482c) - f17;
                jVar.f18483f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kg.h hVar4 = i91Var.f40073c;
                hVar4.invalidate();
                hVar4.q(jVar);
                hVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(k91 k91Var);

    public abstract void c();

    public final void d() {
        lg.b bVar;
        ArrayList arrayList;
        int i10;
        kg.h hVar = this.f40072b;
        hVar.G();
        hVar.invalidate();
        kg.h hVar2 = this.f40073c;
        hVar2.G();
        hVar2.invalidate();
        mg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        k91 k91Var = this.f40076r;
        if (k91Var != null && (bVar = k91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f40076r.d.d.size(); i11++) {
                if (((lg.a) this.f40076r.d.d.get(i11)).f17008g >= 0 && org.telegram.ui.ActionBar.y6.e1(((lg.a) this.f40076r.d.d.get(i11)).f17008g)) {
                    i10 = org.telegram.ui.ActionBar.y6.x0(null, ((lg.a) this.f40076r.d.d.get(i11)).f17008g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false)) < 0.5d) {
                    i10 = ((lg.a) this.f40076r.d.d.get(i11)).f17009i;
                } else {
                    i10 = ((lg.a) this.f40076r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f40075n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.a10 a10Var = ((h91) arrayList2.get(i11)).f39831a;
                    a10Var.getClass();
                    a10Var.f26394r = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false);
                    a10Var.v = -1;
                    a10Var.f26395s = i10;
                    a10Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23429h6, false));
        this.f40074f.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23634s5, false));
    }

    public final void e(k91 k91Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (k91Var != null) {
            String str = k91Var.f40710j;
            mg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            kg.h hVar = this.f40072b;
            hVar.setLandscape(z11);
            ArrayList arrayList = hVar.d;
            kg.k kVar = hVar.f16598g0;
            kg.h hVar2 = this.f40073c;
            hVar2.setLandscape(z11);
            this.f40076r = k91Var;
            boolean z13 = k91Var.f40712l;
            ArrayList arrayList2 = this.f40075n;
            r41 r41Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f40074f;
            if (!z13 && !k91Var.f40704a) {
                textView.setVisibility(8);
                mg.e eVar = hVar.f16617t0;
                boolean z14 = k91Var.f40714n;
                eVar.f18454a = z14;
                cVar.c(!z14);
                if (k91Var.d == null && k91Var.f40707f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(k91Var);
                    hVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (hVar.D(k91Var.d) && k91Var.h) {
                    kVar.f16639k = 0.0f;
                    kVar.f16640l = 1.0f;
                    kVar.f16632a.A(true, false, false);
                }
                cVar.setUseWeekInterval(k91Var.f40715o);
                hVar.f16617t0.setUseWeek(k91Var.f40715o);
                mg.e eVar2 = hVar.f16617t0;
                if (this.f40076r.f40708g == null && this.f40077s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                hVar2.f16617t0.F = false;
                eVar2.setEnabled(eVar2.F);
                mg.e eVar3 = hVar2.f16617t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                r41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        mg.f fVar = (mg.f) arrayList.get(i10);
                        h91 h91Var = new h91(this, i10);
                        h91Var.f39832b = fVar;
                        String str2 = fVar.f18464a.d;
                        org.telegram.ui.Components.a10 a10Var = h91Var.f39831a;
                        a10Var.setText(str2);
                        a10Var.a(fVar.f18474n, false);
                        a10Var.setOnTouchListener(new Object());
                        a10Var.setOnClickListener(new zd0(18, h91Var, fVar));
                        a10Var.setOnLongClickListener(new di.l2(6, h91Var, fVar));
                    }
                }
                long j10 = this.f40076r.f40706c;
                if (j10 > 0) {
                    hVar.f16616s0 = Arrays.binarySearch(hVar.f16600h0.f17010a, j10);
                    hVar.f16618u0 = true;
                    hVar.f16617t0.setVisibility(0);
                    hVar.f16619v0 = 1.0f;
                    hVar.x((hVar.G0 * kVar.f16639k) - kg.h.f16567k1);
                    try {
                        hVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g(true);
                } else {
                    h(false);
                    hVar.invalidate();
                }
                d();
                if (z10) {
                    hVar.f16625y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    hVar.f16626z0 = obj;
                    obj.f18483f = 0.0f;
                    ofFloat.addUpdateListener(new x11(this, 9));
                    ofFloat.addListener(new g91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = k91Var.f40705b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            r41Var.removeAllViews();
            arrayList2.clear();
            hVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        kg.h hVar = this.f40072b;
        long selectedDate = hVar.getSelectedDate();
        lg.b bVar = this.f40076r.e;
        kg.h hVar2 = this.f40073c;
        if (!z10 || hVar2.getVisibility() != 0) {
            hVar2.J(bVar, selectedDate);
        }
        hVar2.D(bVar);
        ArrayList arrayList2 = hVar2.d;
        if (this.f40076r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f40076r.d.d.size();
                arrayList = this.f40075n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((lg.a) bVar.d.get(i12)).f17006c.equals(((lg.a) this.f40076r.d.d.get(i10)).f17006c)) {
                            boolean z12 = ((h91) arrayList.get(i10)).f39831a.f26390b;
                            ((mg.f) arrayList2.get(i12)).f18474n = z12;
                            mg.f fVar = (mg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f18475o = f7;
                            ((h91) arrayList.get(i10)).f39831a.f26391c = true;
                            ((h91) arrayList.get(i10)).f39831a.animate().alpha(1.0f).start();
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
                    ((h91) arrayList.get(i10)).f39831a.f26391c = false;
                    ((h91) arrayList.get(i10)).f39831a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f40076r.d.d.size(); i13++) {
                    ((h91) arrayList.get(i13)).f39831a.f26391c = true;
                    ((h91) arrayList.get(i13)).f39831a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f40076r.f40706c = selectedDate;
        hVar.f16617t0.setAlpha(0.0f);
        hVar.f16619v0 = 0.0f;
        hVar.f16618u0 = false;
        hVar.f16603i1 = false;
        hVar2.G();
        mg.c cVar = this.d;
        if (!z10) {
            hVar2.d();
            cVar.d(selectedDate, true);
        }
        hVar2.setHeader(cVar);
        hVar.setHeader(null);
        if (z10) {
            hVar.setVisibility(4);
            hVar2.setVisibility(0);
            hVar.f16625y0 = 0;
            hVar2.f16625y0 = 0;
            hVar.J = false;
            hVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new g91(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        lg.b bVar;
        k91 k91Var = this.f40076r;
        if (k91Var != null && (bVar = k91Var.d) != null && bVar.f17010a != null) {
            mg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f18443a;
            kg.h hVar = this.f40072b;
            cVar.b(hVar.getStartDate(), hVar.getEndDate());
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
            hVar.f16617t0.f18457f.setAlpha(1.0f);
            kg.h hVar2 = this.f40073c;
            hVar2.setHeader(null);
            long selectedDate = hVar.getSelectedDate();
            this.f40076r.f40706c = 0L;
            int i10 = 0;
            hVar.setVisibility(0);
            hVar2.d();
            hVar2.setHeader(null);
            hVar.setHeader(cVar);
            ArrayList arrayList = this.f40075n;
            if (!z10) {
                hVar2.setVisibility(4);
                hVar.J = true;
                hVar2.J = false;
                hVar.invalidate();
                Window window = this.f40071a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    h91 h91Var = (h91) obj;
                    h91Var.f39831a.setAlpha(1.0f);
                    h91Var.f39831a.f26391c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new g91(this, 1));
            int size2 = arrayList.size();
            while (i10 < size2) {
                Object obj2 = arrayList.get(i10);
                i10++;
                h91 h91Var2 = (h91) obj2;
                h91Var2.f39831a.animate().alpha(1.0f).start();
                h91Var2.f39831a.f26391c = true;
            }
            a2.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f40072b != null && this.f40073c != null && this.d != null && this.e != null && this.f40074f != null) {
                d();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
