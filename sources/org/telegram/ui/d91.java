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
public abstract class d91 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final Window f36539a;
    public final jg.g f36540b;
    public final jg.g f36541c;
    public final lg.c d;
    public final RadialProgressView e;
    public final TextView f36542f;
    public final m41 h;
    public final ArrayList f36543n;
    public f91 f36544r;
    public final int f36545s;

    public d91(Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f36543n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f36539a = ((Activity) context).getWindow();
        } else {
            this.f36539a = null;
        }
        this.f36545s = i10;
        LinearLayout e = org.telegram.messenger.tl.e(context, 1);
        this.h = new m41(context, 2);
        lg.c cVar = new lg.c(getContext(), g6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f44038b;

            {
                this.f44038b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44038b.h(true);
                        return;
                    case 1:
                        this.f44038b.c();
                        return;
                    default:
                        this.f44038b.f36541c.c(false);
                        return;
                }
            }
        });
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            this.f36540b = new jg.g(getContext(), null);
                            jg.g gVar = new jg.g(getContext(), null);
                            this.f36541c = gVar;
                            gVar.f14525t0.f16115y = true;
                        } else {
                            this.f36540b = new jg.g(getContext(), null);
                            jg.g gVar2 = new jg.g(getContext(), null);
                            this.f36541c = gVar2;
                            gVar2.f14525t0.f16115y = true;
                        }
                    } else {
                        jg.q qVar = new jg.q(getContext());
                        this.f36540b = qVar;
                        qVar.f14525t0.E = true;
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
                        qVar2.f14509h1 = true;
                        this.f36541c = qVar2;
                    }
                } else {
                    jg.g gVar3 = new jg.g(getContext(), null);
                    gVar3.f14529w0 = true;
                    gVar3.f14531x0 = true;
                    this.f36540b = gVar3;
                    jg.g gVar4 = new jg.g(getContext(), null);
                    this.f36541c = gVar4;
                    gVar4.f14525t0.f16115y = true;
                }
            } else {
                this.f36540b = new jg.p(getContext(), g6Var);
                jg.p pVar = new jg.p(getContext(), g6Var);
                this.f36541c = pVar;
                pVar.f14525t0.f16115y = true;
            }
        } else {
            this.f36540b = new jg.g(getContext(), g6Var);
            jg.g gVar5 = new jg.g(getContext(), g6Var);
            this.f36541c = gVar5;
            gVar5.f14525t0.f16115y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f36540b.f14490a = fVar;
        this.f36541c.f14490a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.e = radialProgressView;
        frameLayout.addView(this.f36540b);
        frameLayout.addView(this.f36540b.f14525t0, -2, -2);
        frameLayout.addView(this.f36541c);
        frameLayout.addView(this.f36541c.f14525t0, -2, -2);
        frameLayout.addView(radialProgressView, w7.z5.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f36542f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21460s5, g6Var);
        this.f36540b.setDateSelectionListener(new rp0(this, 18));
        this.f36540b.f14525t0.d(false, false);
        this.f36540b.f14525t0.setOnTouchListener(new Object());
        this.f36540b.f14525t0.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f44038b;

            {
                this.f44038b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44038b.h(true);
                        return;
                    case 1:
                        this.f44038b.c();
                        return;
                    default:
                        this.f44038b.f36541c.c(false);
                        return;
                }
            }
        });
        this.f36541c.f14525t0.setOnClickListener(new View.OnClickListener(this) {
            public final d91 f44038b;

            {
                this.f44038b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44038b.h(true);
                        return;
                    case 1:
                        this.f44038b.c();
                        return;
                    default:
                        this.f44038b.f36541c.c(false);
                        return;
                }
            }
        });
        this.f36540b.setVisibility(0);
        this.f36541c.setVisibility(4);
        this.f36540b.setHeader(this.d);
        e.addView(this.d, w7.z5.c(52.0f, -1));
        e.addView(frameLayout, w7.z5.c(-2.0f, -1));
        e.addView(this.h, w7.z5.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f36545s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            e.setClipChildren(false);
            e.setClipToPadding(false);
        }
        addView(e);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f7;
        Window window = this.f36539a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        jg.g gVar = this.f36540b;
        gVar.J = false;
        jg.g gVar2 = this.f36541c;
        gVar2.J = false;
        gVar.f14533y0 = 2;
        gVar2.f14533y0 = 1;
        final ?? obj = new Object();
        jg.j jVar = gVar.f14506g0;
        obj.f16133b = jVar.f14548l;
        obj.f16132a = jVar.f14547k;
        int binarySearch = Arrays.binarySearch(this.f36544r.d.f15098a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f36544r.d.f15098a.length - 1;
        }
        obj.f16134c = this.f36544r.d.f15099b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f14534z0 = obj;
        gVar.f14534z0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i10 = 0; i10 < this.f36544r.d.d.size(); i10++) {
            if (((kg.a) this.f36544r.d.d.get(i10)).f15092a[binarySearch] > j11) {
                j11 = ((kg.a) this.f36544r.d.d.get(i10)).f15092a[binarySearch];
            }
            if (((kg.a) this.f36544r.d.d.get(i10)).f15092a[binarySearch] < j12) {
                j12 = ((kg.a) this.f36544r.d.d.get(i10)).f15092a[binarySearch];
            }
        }
        float f10 = ((float) j12) + ((float) (j11 - j12));
        float f11 = gVar.f14528w;
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
                d91 d91Var = d91.this;
                jg.g gVar3 = d91Var.f36540b;
                float f14 = gVar3.F0;
                jg.j jVar2 = gVar3.f14506g0;
                float f15 = jVar2.f14548l;
                float f16 = jVar2.f14547k;
                float f17 = ((f14 / (f15 - f16)) * f16) - jg.g.f14475k1;
                RectF rectF = gVar3.H0;
                float height = (rectF.height() * (1.0f - f12)) + rectF.top;
                lg.j jVar3 = obj;
                jVar3.e = height;
                jVar3.d = (gVar3.G0 * jVar3.f16134c) - f17;
                jVar3.f16135f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jg.g gVar4 = d91Var.f36541c;
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
        kg.b bVar;
        ArrayList arrayList;
        int i10;
        jg.g gVar = this.f36540b;
        gVar.G();
        gVar.invalidate();
        jg.g gVar2 = this.f36541c;
        gVar2.G();
        gVar2.invalidate();
        lg.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        f91 f91Var = this.f36544r;
        if (f91Var != null && (bVar = f91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i11 = 0; i11 < this.f36544r.d.d.size(); i11++) {
                if (((kg.a) this.f36544r.d.d.get(i11)).f15096g >= 0 && org.telegram.ui.ActionBar.k6.e1(((kg.a) this.f36544r.d.d.get(i11)).f15096g)) {
                    i10 = org.telegram.ui.ActionBar.k6.x0(null, ((kg.a) this.f36544r.d.d.get(i11)).f15096g, false);
                } else if (i0.a.h(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)) < 0.5d) {
                    i10 = ((kg.a) this.f36544r.d.d.get(i11)).f15097i;
                } else {
                    i10 = ((kg.a) this.f36544r.d.d.get(i11)).h;
                }
                ArrayList arrayList2 = this.f36543n;
                if (i11 < arrayList2.size()) {
                    org.telegram.ui.Components.y00 y00Var = ((c91) arrayList2.get(i11)).f36275a;
                    y00Var.getClass();
                    y00Var.f32769r = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false);
                    y00Var.v = -1;
                    y00Var.f32770s = i10;
                    y00Var.invalidate();
                }
            }
        }
        this.e.setProgressColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21256h6, false));
        this.f36542f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21460s5, false));
    }

    public final void e(f91 f91Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (f91Var != null) {
            String str = f91Var.f37249j;
            lg.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            jg.g gVar = this.f36540b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            jg.j jVar = gVar.f14506g0;
            jg.g gVar2 = this.f36541c;
            gVar2.setLandscape(z11);
            this.f36544r = f91Var;
            boolean z13 = f91Var.f37251l;
            ArrayList arrayList2 = this.f36543n;
            m41 m41Var = this.h;
            RadialProgressView radialProgressView = this.e;
            TextView textView = this.f36542f;
            if (!z13 && !f91Var.f37243a) {
                textView.setVisibility(8);
                lg.e eVar = gVar.f14525t0;
                boolean z14 = f91Var.f37253n;
                eVar.f16106a = z14;
                cVar.c(!z14);
                if (f91Var.d == null && f91Var.f37246f != null) {
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
                    jVar.f14547k = 0.0f;
                    jVar.f14548l = 1.0f;
                    jVar.f14540a.A(true, false, false);
                }
                cVar.setUseWeekInterval(f91Var.f37254o);
                gVar.f14525t0.setUseWeek(f91Var.f37254o);
                lg.e eVar2 = gVar.f14525t0;
                if (this.f36544r.f37247g == null && this.f36545s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.F = z12;
                gVar2.f14525t0.F = false;
                eVar2.setEnabled(eVar2.F);
                lg.e eVar3 = gVar2.f14525t0;
                eVar3.setEnabled(eVar3.F);
                int size = arrayList.size();
                m41Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i10 = 0; i10 < size; i10++) {
                        lg.f fVar = (lg.f) arrayList.get(i10);
                        c91 c91Var = new c91(this, i10);
                        c91Var.f36276b = fVar;
                        String str2 = fVar.f16116a.d;
                        org.telegram.ui.Components.y00 y00Var = c91Var.f36275a;
                        y00Var.setText(str2);
                        y00Var.a(fVar.f16126n, false);
                        y00Var.setOnTouchListener(new Object());
                        y00Var.setOnClickListener(new zd0(18, c91Var, fVar));
                        y00Var.setOnLongClickListener(new ci.l2(6, c91Var, fVar));
                    }
                }
                long j10 = this.f36544r.f37245c;
                if (j10 > 0) {
                    gVar.f14524s0 = Arrays.binarySearch(gVar.f14508h0.f15098a, j10);
                    gVar.f14526u0 = true;
                    gVar.f14525t0.setVisibility(0);
                    gVar.f14527v0 = 1.0f;
                    gVar.x((gVar.G0 * jVar.f14547k) - jg.g.f14475k1);
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
                    gVar.f14533y0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f14534z0 = obj;
                    obj.f16135f = 0.0f;
                    ofFloat.addUpdateListener(new f11(this, 10));
                    ofFloat.addListener(new b91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = f91Var.f37244b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            m41Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f7;
        jg.g gVar = this.f36540b;
        long selectedDate = gVar.getSelectedDate();
        kg.b bVar = this.f36544r.e;
        jg.g gVar2 = this.f36541c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f36544r.d.d.size() > 1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int size = this.f36544r.d.d.size();
                arrayList = this.f36543n;
                if (i10 >= size) {
                    break;
                }
                int i12 = 0;
                while (true) {
                    if (i12 < bVar.d.size()) {
                        if (((kg.a) bVar.d.get(i12)).f15094c.equals(((kg.a) this.f36544r.d.d.get(i10)).f15094c)) {
                            boolean z12 = ((c91) arrayList.get(i10)).f36275a.f32765b;
                            ((lg.f) arrayList2.get(i12)).f16126n = z12;
                            lg.f fVar = (lg.f) arrayList2.get(i12);
                            if (z12) {
                                f7 = 1.0f;
                            } else {
                                f7 = 0.0f;
                            }
                            fVar.f16127o = f7;
                            ((c91) arrayList.get(i10)).f36275a.f32766c = true;
                            ((c91) arrayList.get(i10)).f36275a.animate().alpha(1.0f).start();
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
                    ((c91) arrayList.get(i10)).f36275a.f32766c = false;
                    ((c91) arrayList.get(i10)).f36275a.animate().alpha(0.0f).start();
                }
                i10++;
            }
            if (i11 == 0) {
                for (int i13 = 0; i13 < this.f36544r.d.d.size(); i13++) {
                    ((c91) arrayList.get(i13)).f36275a.f32766c = true;
                    ((c91) arrayList.get(i13)).f36275a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f36544r.f37245c = selectedDate;
        gVar.f14525t0.setAlpha(0.0f);
        gVar.f14527v0 = 0.0f;
        gVar.f14526u0 = false;
        gVar.f14511i1 = false;
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
            gVar.f14533y0 = 0;
            gVar2.f14533y0 = 0;
            gVar.J = false;
            gVar2.J = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new b91(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        kg.b bVar;
        f91 f91Var = this.f36544r;
        if (f91Var != null && (bVar = f91Var.d) != null && bVar.f15098a != null) {
            lg.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f16095a;
            jg.g gVar = this.f36540b;
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
            gVar.f14525t0.f16109f.setAlpha(1.0f);
            jg.g gVar2 = this.f36541c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f36544r.f37245c = 0L;
            int i10 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f36543n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.J = true;
                gVar2.J = false;
                gVar.invalidate();
                Window window = this.f36539a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    c91 c91Var = (c91) obj;
                    c91Var.f36275a.setAlpha(1.0f);
                    c91Var.f36275a.f32766c = true;
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
                c91Var2.f36275a.animate().alpha(1.0f).start();
                c91Var2.f36275a.f32766c = true;
            }
            a2.start();
        }
    }

    @Override
    public final void updateColors() {
        try {
            if (this.f36540b != null && this.f36541c != null && this.d != null && this.e != null && this.f36542f != null) {
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
