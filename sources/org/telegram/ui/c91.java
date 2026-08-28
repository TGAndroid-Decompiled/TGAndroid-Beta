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
public abstract class c91 extends FrameLayout {
    public final Window f37127a;
    public final qf.g f37128b;
    public final qf.g f37129c;
    public final sf.c d;
    public final RadialProgressView f37130e;
    public final TextView f37131f;
    public final b81 h;
    public final ArrayList f37132n;
    public e91 f37133r;
    public final int f37134s;

    public c91(Context context, int i9, qf.f fVar, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f37132n = new ArrayList();
        setWillNotDraw(false);
        if (context instanceof Activity) {
            this.f37127a = ((Activity) context).getWindow();
        } else {
            this.f37127a = null;
        }
        this.f37134s = i9;
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        this.h = new b81(context, 1);
        sf.c cVar = new sf.c(getContext(), b6Var);
        this.d = cVar;
        cVar.d.setOnTouchListener(new Object());
        cVar.d.setOnClickListener(new View.OnClickListener(this) {
            public final c91 f44795b;

            {
                this.f44795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44795b.h(true);
                        return;
                    case 1:
                        this.f44795b.c();
                        return;
                    default:
                        this.f44795b.f37129c.c(false);
                        return;
                }
            }
        });
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            this.f37128b = new qf.g(getContext(), null);
                            qf.g gVar = new qf.g(getContext(), null);
                            this.f37129c = gVar;
                            gVar.f46219p0.f47545y = true;
                        } else {
                            this.f37128b = new qf.g(getContext(), null);
                            qf.g gVar2 = new qf.g(getContext(), null);
                            this.f37129c = gVar2;
                            gVar2.f46219p0.f47545y = true;
                        }
                    } else {
                        qf.q qVar = new qf.q(getContext());
                        this.f37128b = qVar;
                        qVar.f46219p0.A = true;
                        ?? qVar2 = new qf.q(getContext());
                        qVar2.I1 = -1;
                        qVar2.J1 = new RectF();
                        qVar2.L1 = AndroidUtilities.dp(9.0f);
                        qVar2.M1 = AndroidUtilities.dp(13.0f);
                        qVar2.N1 = new String[101];
                        qVar2.P1 = 1.0f;
                        qVar2.Q1 = 0;
                        qVar2.R1 = -1;
                        qVar2.S1 = -1;
                        for (int i10 = 1; i10 <= 100; i10++) {
                            qVar2.N1[i10] = ta.b.c(i10, "%");
                        }
                        TextPaint textPaint = new TextPaint(1);
                        qVar2.K1 = textPaint;
                        textPaint.setTextAlign(Paint.Align.CENTER);
                        textPaint.setColor(-1);
                        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
                        qVar2.f46203d1 = true;
                        this.f37129c = qVar2;
                    }
                } else {
                    qf.g gVar3 = new qf.g(getContext(), null);
                    gVar3.f46224s0 = true;
                    gVar3.f46225t0 = true;
                    this.f37128b = gVar3;
                    qf.g gVar4 = new qf.g(getContext(), null);
                    this.f37129c = gVar4;
                    gVar4.f46219p0.f47545y = true;
                }
            } else {
                this.f37128b = new qf.p(getContext(), b6Var);
                qf.p pVar = new qf.p(getContext(), b6Var);
                this.f37129c = pVar;
                pVar.f46219p0.f47545y = true;
            }
        } else {
            this.f37128b = new qf.g(getContext(), b6Var);
            qf.g gVar5 = new qf.g(getContext(), b6Var);
            this.f37129c = gVar5;
            gVar5.f46219p0.f47545y = true;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37128b.f46193a = fVar;
        this.f37129c.f46193a = fVar;
        RadialProgressView radialProgressView = new RadialProgressView(context, null);
        this.f37130e = radialProgressView;
        frameLayout.addView(this.f37128b);
        frameLayout.addView(this.f37128b.f46219p0, -2, -2);
        frameLayout.addView(this.f37129c);
        frameLayout.addView(this.f37129c.f46219p0, -2, -2);
        frameLayout.addView(radialProgressView, g7.e6.d(44, 44.0f, 17, 0.0f, 0.0f, 0.0f, 60.0f));
        TextView textView = new TextView(context);
        this.f37131f = textView;
        textView.setTextSize(1, 15.0f);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 30.0f));
        radialProgressView.setVisibility(8);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23266s5, b6Var));
        this.f37128b.setDateSelectionListener(new dl0(this, 19));
        this.f37128b.f46219p0.d(false, false);
        this.f37128b.f46219p0.setOnTouchListener(new Object());
        this.f37128b.f46219p0.setOnClickListener(new View.OnClickListener(this) {
            public final c91 f44795b;

            {
                this.f44795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44795b.h(true);
                        return;
                    case 1:
                        this.f44795b.c();
                        return;
                    default:
                        this.f44795b.f37129c.c(false);
                        return;
                }
            }
        });
        this.f37129c.f46219p0.setOnClickListener(new View.OnClickListener(this) {
            public final c91 f44795b;

            {
                this.f44795b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f44795b.h(true);
                        return;
                    case 1:
                        this.f44795b.c();
                        return;
                    default:
                        this.f44795b.f37129c.c(false);
                        return;
                }
            }
        });
        this.f37128b.setVisibility(0);
        this.f37129c.setVisibility(4);
        this.f37128b.setHeader(this.d);
        f10.addView(this.d, g7.e6.c(52.0f, -1));
        f10.addView(frameLayout, g7.e6.c(-2.0f, -1));
        f10.addView(this.h, g7.e6.d(-1, -2.0f, 7, 10.0f, 0.0f, 10.0f, 0.0f));
        if (this.f37134s == 4) {
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            f10.setClipChildren(false);
            f10.setClipToPadding(false);
        }
        addView(f10);
    }

    public final ValueAnimator a(long j10, boolean z10) {
        float f10;
        Window window = this.f37127a;
        if (window != null) {
            window.setFlags(16, 16);
        }
        qf.g gVar = this.f37128b;
        gVar.F = false;
        qf.g gVar2 = this.f37129c;
        gVar2.F = false;
        gVar.f46226u0 = 2;
        gVar2.f46226u0 = 1;
        final ?? obj = new Object();
        qf.j jVar = gVar.f46200c0;
        obj.f47564b = jVar.f46250l;
        obj.f47563a = jVar.f46249k;
        int binarySearch = Arrays.binarySearch(this.f37133r.d.f47160a, j10);
        if (binarySearch < 0) {
            binarySearch = this.f37133r.d.f47160a.length - 1;
        }
        obj.f47565c = this.f37133r.d.f47161b[binarySearch];
        gVar2.setVisibility(0);
        gVar2.f46227v0 = obj;
        gVar.f46227v0 = obj;
        long j11 = 0;
        long j12 = 2147483647L;
        for (int i9 = 0; i9 < this.f37133r.d.d.size(); i9++) {
            if (((rf.a) this.f37133r.d.d.get(i9)).f47153a[binarySearch] > j11) {
                j11 = ((rf.a) this.f37133r.d.d.get(i9)).f47153a[binarySearch];
            }
            if (((rf.a) this.f37133r.d.d.get(i9)).f47153a[binarySearch] < j12) {
                j12 = ((rf.a) this.f37133r.d.d.get(i9)).f47153a[binarySearch];
            }
        }
        float f11 = ((float) j12) + ((float) (j11 - j12));
        float f12 = gVar.f46228w;
        final float f13 = (f11 - f12) / (gVar.v - f12);
        gVar.q(obj);
        gVar2.q(obj);
        float f14 = 1.0f;
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (!z10) {
            f14 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f14);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c91 c91Var = c91.this;
                qf.g gVar3 = c91Var.f37128b;
                float f15 = gVar3.B0;
                qf.j jVar2 = gVar3.f46200c0;
                float f16 = jVar2.f46250l;
                float f17 = jVar2.f46249k;
                float f18 = ((f15 / (f16 - f17)) * f17) - qf.g.f46175g1;
                RectF rectF = gVar3.D0;
                float height = (rectF.height() * (1.0f - f13)) + rectF.top;
                sf.j jVar3 = obj;
                jVar3.f47566e = height;
                jVar3.d = (gVar3.C0 * jVar3.f47565c) - f18;
                jVar3.f47567f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qf.g gVar4 = c91Var.f37129c;
                gVar4.invalidate();
                gVar4.q(jVar3);
                gVar3.invalidate();
            }
        });
        ofFloat.setDuration(400L);
        ofFloat.setInterpolator(new u1.a());
        return ofFloat;
    }

    public abstract void b(e91 e91Var);

    public abstract void c();

    public final void d() {
        rf.b bVar;
        ArrayList arrayList;
        int i9;
        qf.g gVar = this.f37128b;
        gVar.G();
        gVar.invalidate();
        qf.g gVar2 = this.f37129c;
        gVar2.G();
        gVar2.invalidate();
        sf.c cVar = this.d;
        cVar.a();
        cVar.invalidate();
        e91 e91Var = this.f37133r;
        if (e91Var != null && (bVar = e91Var.d) != null && (arrayList = bVar.d) != null && arrayList.size() > 1) {
            for (int i10 = 0; i10 < this.f37133r.d.d.size(); i10++) {
                if (((rf.a) this.f37133r.d.d.get(i10)).f47158g >= 0 && org.telegram.ui.ActionBar.f6.c1(((rf.a) this.f37133r.d.d.get(i10)).f47158g)) {
                    i9 = org.telegram.ui.ActionBar.f6.w0(null, ((rf.a) this.f37133r.d.d.get(i10)).f47158g, false);
                } else if (i0.a.f(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)) < 0.5d) {
                    i9 = ((rf.a) this.f37133r.d.d.get(i10)).f47159i;
                } else {
                    i9 = ((rf.a) this.f37133r.d.d.get(i10)).h;
                }
                ArrayList arrayList2 = this.f37132n;
                if (i10 < arrayList2.size()) {
                    org.telegram.ui.Components.d00 d00Var = ((b91) arrayList2.get(i10)).f36795a;
                    d00Var.getClass();
                    d00Var.f27614r = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false);
                    d00Var.v = -1;
                    d00Var.f27615s = i9;
                    d00Var.invalidate();
                }
            }
        }
        this.f37130e.setProgressColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23073h6, false));
        this.f37131f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23266s5, false));
    }

    public final void e(e91 e91Var, boolean z10) {
        boolean z11;
        boolean z12;
        if (e91Var != null) {
            String str = e91Var.f37876j;
            sf.c cVar = this.d;
            cVar.setTitle(str);
            if (getContext().getResources().getConfiguration().orientation == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            qf.g gVar = this.f37128b;
            gVar.setLandscape(z11);
            ArrayList arrayList = gVar.d;
            qf.j jVar = gVar.f46200c0;
            qf.g gVar2 = this.f37129c;
            gVar2.setLandscape(z11);
            this.f37133r = e91Var;
            boolean z13 = e91Var.f37878l;
            ArrayList arrayList2 = this.f37132n;
            b81 b81Var = this.h;
            RadialProgressView radialProgressView = this.f37130e;
            TextView textView = this.f37131f;
            if (!z13 && !e91Var.f37869a) {
                textView.setVisibility(8);
                sf.e eVar = gVar.f46219p0;
                boolean z14 = e91Var.f37880n;
                eVar.f47535a = z14;
                cVar.c(!z14);
                if (e91Var.d == null && e91Var.f37873f != null) {
                    radialProgressView.setAlpha(1.0f);
                    radialProgressView.setVisibility(0);
                    b(e91Var);
                    gVar.D(null);
                    return;
                }
                if (!z10) {
                    radialProgressView.setVisibility(8);
                }
                if (gVar.D(e91Var.d) && e91Var.h) {
                    jVar.f46249k = 0.0f;
                    jVar.f46250l = 1.0f;
                    jVar.f46241a.A(true, false, false);
                }
                cVar.setUseWeekInterval(e91Var.f37881o);
                gVar.f46219p0.setUseWeek(e91Var.f37881o);
                sf.e eVar2 = gVar.f46219p0;
                if (this.f37133r.f37874g == null && this.f37134s != 4) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                eVar2.B = z12;
                gVar2.f46219p0.B = false;
                eVar2.setEnabled(eVar2.B);
                sf.e eVar3 = gVar2.f46219p0;
                eVar3.setEnabled(eVar3.B);
                int size = arrayList.size();
                b81Var.removeAllViews();
                arrayList2.clear();
                if (size > 1) {
                    for (int i9 = 0; i9 < size; i9++) {
                        sf.f fVar = (sf.f) arrayList.get(i9);
                        b91 b91Var = new b91(this, i9);
                        b91Var.f36796b = fVar;
                        String str2 = fVar.f47546a.d;
                        org.telegram.ui.Components.d00 d00Var = b91Var.f36795a;
                        d00Var.setText(str2);
                        d00Var.a(fVar.f47557n, false);
                        d00Var.setOnTouchListener(new Object());
                        d00Var.setOnClickListener(new v80(24, b91Var, fVar));
                        d00Var.setOnLongClickListener(new ih.g2(6, b91Var, fVar));
                    }
                }
                long j10 = this.f37133r.f37871c;
                if (j10 > 0) {
                    gVar.f46218o0 = Arrays.binarySearch(gVar.f46202d0.f47160a, j10);
                    gVar.f46220q0 = true;
                    gVar.f46219p0.setVisibility(0);
                    gVar.f46222r0 = 1.0f;
                    gVar.x((gVar.C0 * jVar.f46249k) - qf.g.f46175g1);
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
                    gVar.f46226u0 = 3;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ?? obj = new Object();
                    gVar.f46227v0 = obj;
                    obj.f47567f = 0.0f;
                    ofFloat.addUpdateListener(new v01(this, 12));
                    ofFloat.addListener(new a91(this, 2));
                    ofFloat.start();
                    return;
                }
                return;
            }
            radialProgressView.setVisibility(8);
            String str3 = e91Var.f37870b;
            if (str3 != null) {
                textView.setText(str3);
                if (textView.getVisibility() == 8) {
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f);
                }
                textView.setVisibility(0);
            }
            b81Var.removeAllViews();
            arrayList2.clear();
            gVar.D(null);
        }
    }

    public abstract void f();

    public final void g(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        float f10;
        qf.g gVar = this.f37128b;
        long selectedDate = gVar.getSelectedDate();
        rf.b bVar = this.f37133r.f37872e;
        qf.g gVar2 = this.f37129c;
        if (!z10 || gVar2.getVisibility() != 0) {
            gVar2.J(bVar, selectedDate);
        }
        gVar2.D(bVar);
        ArrayList arrayList2 = gVar2.d;
        if (this.f37133r.d.d.size() > 1) {
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int size = this.f37133r.d.d.size();
                arrayList = this.f37132n;
                if (i9 >= size) {
                    break;
                }
                int i11 = 0;
                while (true) {
                    if (i11 < bVar.d.size()) {
                        if (((rf.a) bVar.d.get(i11)).f47155c.equals(((rf.a) this.f37133r.d.d.get(i9)).f47155c)) {
                            boolean z12 = ((b91) arrayList.get(i9)).f36795a.f27609b;
                            ((sf.f) arrayList2.get(i11)).f47557n = z12;
                            sf.f fVar = (sf.f) arrayList2.get(i11);
                            if (z12) {
                                f10 = 1.0f;
                            } else {
                                f10 = 0.0f;
                            }
                            fVar.f47558o = f10;
                            ((b91) arrayList.get(i9)).f36795a.f27610c = true;
                            ((b91) arrayList.get(i9)).f36795a.animate().alpha(1.0f).start();
                            if (z12) {
                                i10++;
                            }
                            z11 = true;
                        } else {
                            i11++;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                if (!z11) {
                    ((b91) arrayList.get(i9)).f36795a.f27610c = false;
                    ((b91) arrayList.get(i9)).f36795a.animate().alpha(0.0f).start();
                }
                i9++;
            }
            if (i10 == 0) {
                for (int i12 = 0; i12 < this.f37133r.d.d.size(); i12++) {
                    ((b91) arrayList.get(i12)).f36795a.f27610c = true;
                    ((b91) arrayList.get(i12)).f36795a.animate().alpha(1.0f).start();
                }
                return;
            }
        }
        this.f37133r.f37871c = selectedDate;
        gVar.f46219p0.setAlpha(0.0f);
        gVar.f46222r0 = 0.0f;
        gVar.f46220q0 = false;
        gVar.f46206e1 = false;
        gVar2.G();
        sf.c cVar = this.d;
        if (!z10) {
            gVar2.d();
            cVar.d(selectedDate, true);
        }
        gVar2.setHeader(cVar);
        gVar.setHeader(null);
        if (z10) {
            gVar.setVisibility(4);
            gVar2.setVisibility(0);
            gVar.f46226u0 = 0;
            gVar2.f46226u0 = 0;
            gVar.F = false;
            gVar2.F = true;
            cVar.d(selectedDate, false);
            return;
        }
        ValueAnimator a2 = a(selectedDate, true);
        a2.addListener(new a91(this, 0));
        a2.start();
    }

    public final void h(boolean z10) {
        rf.b bVar;
        e91 e91Var = this.f37133r;
        if (e91Var != null && (bVar = e91Var.d) != null && bVar.f47160a != null) {
            sf.c cVar = this.d;
            TextView textView = cVar.d;
            TextView textView2 = cVar.f47522a;
            qf.g gVar = this.f37128b;
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
            gVar.f46219p0.f47539f.setAlpha(1.0f);
            qf.g gVar2 = this.f37129c;
            gVar2.setHeader(null);
            long selectedDate = gVar.getSelectedDate();
            this.f37133r.f37871c = 0L;
            int i9 = 0;
            gVar.setVisibility(0);
            gVar2.d();
            gVar2.setHeader(null);
            gVar.setHeader(cVar);
            ArrayList arrayList = this.f37132n;
            if (!z10) {
                gVar2.setVisibility(4);
                gVar.F = true;
                gVar2.F = false;
                gVar.invalidate();
                Window window = this.f37127a;
                if (window != null) {
                    window.clearFlags(16);
                }
                int size = arrayList.size();
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    b91 b91Var = (b91) obj;
                    b91Var.f36795a.setAlpha(1.0f);
                    b91Var.f36795a.f27610c = true;
                }
                return;
            }
            ValueAnimator a2 = a(selectedDate, false);
            a2.addListener(new a91(this, 1));
            int size2 = arrayList.size();
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                b91 b91Var2 = (b91) obj2;
                b91Var2.f36795a.animate().alpha(1.0f).start();
                b91Var2.f36795a.f27610c = true;
            }
            a2.start();
        }
    }
}
