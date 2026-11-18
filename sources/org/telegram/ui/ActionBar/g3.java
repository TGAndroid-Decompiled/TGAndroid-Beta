package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.ox;
import org.telegram.ui.rj;
public final class g3 extends FrameLayout {
    public static final HashMap L = new HashMap();
    public static final HashMap M = new HashMap();
    public static TextPaint N;
    public boolean E;
    public final RectF F;
    public ValueAnimator G;
    public float H;
    public int I;
    public final HashSet J;
    public final HashSet K;
    public final Paint f28961a;
    public boolean f28962b;
    public boolean f28963c;
    public final ActionBarLayout d;
    public final e3 f28964e;
    public int f28965f;
    public final org.telegram.ui.Components.f5 h;
    public int f28966n;
    public final org.telegram.ui.Components.f5 f28967r;
    public boolean f28968s;
    public final org.telegram.ui.Components.c6 f28969w;
    public int f28970x;
    public boolean f28971y;

    public g3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f28961a = new Paint(1);
        this.f28962b = true;
        this.f28963c = false;
        lr lrVar = lr.h;
        this.h = new org.telegram.ui.Components.f5(this, 200L, lrVar, 0);
        this.f28967r = new org.telegram.ui.Components.f5(this, 200L, lrVar, 0);
        this.f28969w = new org.telegram.ui.Components.c6(this, 0L, 200L, lrVar);
        this.f28970x = j10.f24770t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(n6.x0(null, n6.f29337a7, false));
        e3 e3Var = new e3(this, this);
        this.f28964e = e3Var;
        r0.i0.j(this, e3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (N == null) {
            TextPaint textPaint = new TextPaint(1);
            N = textPaint;
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            N.setTextSize(org.telegram.messenger.g0.L(17.0f));
        }
        return N;
    }

    public static String p(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        if (indexOf >= 0) {
            return str.substring(0, indexOf + 1);
        }
        return str;
    }

    public final void b() {
        n3 n3Var;
        ValueAnimator valueAnimator;
        ArrayList<f3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        f3 f3Var = (f3) i5.c.h(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            n3Var = null;
        } else {
            n3Var = launchActivity.f43110x0;
        }
        if (n3Var != null && (valueAnimator = n3Var.d) != null) {
            valueAnimator.cancel();
            n3Var.d = null;
        }
        if (size != 1 && n3Var != null) {
            n3Var.f();
        } else {
            e(f3Var);
        }
    }

    public final d3 c(f3 f3Var) {
        ArrayList<d3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).f28834a == f3Var) {
                return tabDrawables.get(i7);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f10) {
        rectF.set(org.telegram.messenger.g0.L(4.0f), (getHeight() - org.telegram.messenger.g0.L(4.0f)) - org.telegram.messenger.g0.L(50.0f), getWidth() - org.telegram.messenger.g0.L(4.0f), getHeight() - org.telegram.messenger.g0.L(4.0f));
        rectF.offset(0.0f, (-org.telegram.messenger.g0.L(8.0f)) * f10);
        float T1 = org.telegram.messenger.g0.T1(1.0f, 0.95f, Math.abs(f10));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f11 = (width / 2.0f) * T1;
        rectF.left = centerX - f11;
        rectF.right = centerX + f11;
        float f12 = (height / 2.0f) * T1;
        rectF.top = centerY - f12;
        rectF.bottom = centerY + f12;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        getTabs();
        ArrayList<d3> tabDrawables = getTabDrawables();
        if (this.H > 0.0f) {
            this.f28961a.setColor(this.h.a(this.f28965f, false));
            super.dispatchDraw(canvas);
            int a10 = this.f28967r.a(this.f28966n, false);
            float d = this.f28969w.d(this.f28968s);
            if (this.f28962b) {
                int i7 = 0;
                while (i7 < tabDrawables.size()) {
                    d3 d3Var = tabDrawables.get(i7);
                    float c10 = d3Var.c();
                    float b10 = d3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.F;
                        d(rectF, c10);
                        d3Var.f28853w = 0.0f;
                        if (d > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        d3Var.f28844m = a10;
                        d3Var.f28846o = z10;
                        canvas2 = canvas;
                        d3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
                    }
                    i7++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        e3 e3Var;
        if (this.f28962b && !getTabs().isEmpty() && (e3Var = this.f28964e) != null && e3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(f3 f3Var) {
        bn bnVar;
        rj rjVar;
        h2 Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z10 = Q instanceof bn;
            if (z10 && (rjVar = (bnVar = (bn) Q).f45923a0) != null) {
                rjVar.U();
                bnVar.f45923a0.H0(true, false, true);
            }
            if (f3Var.J != null) {
                ox sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.g4 g4Var = f3Var.J;
                org.telegram.ui.t3 t3Var = g4Var.L;
                b3.b(t3Var);
                sheetFragment.addSheet(t3Var);
                org.telegram.ui.s3 s3Var = t3Var.f52140c;
                t3Var.h = false;
                t3Var.f52143n = false;
                ValueAnimator valueAnimator = t3Var.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = t3Var.F;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t3Var.f52148y = 0.0f;
                t3Var.f52147x = 0.0f;
                t3Var.r();
                t3Var.A();
                s3Var.invalidate();
                s3Var.requestLayout();
                g4Var.W(sheetFragment.getParentActivity(), sheetFragment);
                t3Var.q(sheetFragment);
                t3Var.o();
                h(this.f28970x, f3Var, false);
                return;
            }
            new c3(0, this, f3Var).a(Q);
            if (f3Var.C) {
                if (!z10 || ((bn) Q).a() != f3Var.f28925a.f18665c) {
                    this.f28963c = true;
                    org.telegram.messenger.g0.h3(new kg.i0(this, Q, bn.ua(f3Var.f28925a.f18665c), 23), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<f3> tabs = getTabs();
        ArrayList<d3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            tabs.get(i7).a();
        }
        tabs.clear();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            tabDrawables.get(i10).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(f3 f3Var, x10 x10Var) {
        String str;
        if (f3Var == null) {
            x10Var.a(Boolean.TRUE);
        } else if (!f3Var.f28946y) {
            h(this.f28970x, f3Var, true);
            x10Var.a(Boolean.TRUE);
        } else {
            TLRPC.User c22 = mp.u1(f3Var.f28925a.f18663a).c2(Long.valueOf(f3Var.f28925a.f18665c));
            if (c22 != null) {
                str = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
            } else {
                ki.f4 f4Var = f3Var.f28925a;
                if (f4Var.f18668g == 6) {
                    str = f4Var.f18666e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            u1 u1Var = alertDialog$Builder.f28744a;
            u1Var.S = str;
            u1Var.U = gd.M0(2131752906, null);
            alertDialog$Builder.k(gd.M0(2131752905, null), new di.l6(this, zArr, f3Var, x10Var, r9));
            alertDialog$Builder.h(gd.M0(2131752578, null), new a3.h(zArr, x10Var, r9, 18));
            u1[] u1VarArr = {u1Var};
            u1Var.setOnDismissListener(new z1(2, zArr, x10Var));
            u1VarArr[0].show();
            u6.U((TextView) u1VarArr[0].d(-1), n6.f29635q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f28961a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return org.telegram.messenger.g0.L(60.0f);
        }
        return org.telegram.messenger.g0.L(68.0f);
    }

    public ArrayList<d3> getTabDrawables() {
        int i7 = this.f28970x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = M;
        ArrayList<d3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<d3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<f3> getTabs() {
        int i7 = this.f28970x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<f3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<f3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i7, f3 f3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i7);
        HashMap hashMap2 = M;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i7);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(f3Var);
        if (z10) {
            f3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            d3 d3Var = (d3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(d3Var.f28834a);
            d3Var.d = indexOf;
            if (indexOf >= 0) {
                d3Var.f28836c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.h3(new kg.i0(this, arrayList3, f3Var, 24), 320L);
        o(true);
        invalidate();
        e3 e3Var = this.f28964e;
        if (e3Var != null) {
            e3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i7, boolean z10) {
        boolean z11;
        float f10;
        if (i7 != this.f28965f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.R || actionBarLayout.U) {
                z10 = false;
            }
            this.f28965f = i7;
            if (org.telegram.messenger.g0.B(i7) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f10 = 0.08f;
            } else {
                f10 = 0.75f;
            }
            int w10 = n6.w(i7, n6.r1(f10, -1));
            this.f28966n = w10;
            if (org.telegram.messenger.g0.B(w10) < 0.721f) {
                z12 = true;
            }
            this.f28968s = z12;
            if (!z10) {
                this.h.a(this.f28965f, true);
                this.f28967r.a(this.f28966n, true);
                this.f28969w.f(this.f28968s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i7) {
        f3 f3Var;
        boolean z10;
        ArrayList<f3> tabs = getTabs();
        ArrayList<d3> tabDrawables = getTabDrawables();
        if (this.f28962b) {
            if (tabs.isEmpty()) {
                f3Var = null;
            } else {
                f3Var = tabs.get(0);
            }
            d3 c10 = c(f3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f28843l;
                float c11 = c10.c();
                RectF rectF = this.F;
                d(rectF, c11);
                if (i7 != 0 && i7 != 2) {
                    if (i7 == 1 || i7 == 3) {
                        if (this.E && i7 == 1) {
                            b();
                        } else if (this.f28971y && i7 == 1) {
                            g(f3Var, new fi.e(6));
                        }
                        this.f28971y = false;
                        this.E = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f28971y = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.E = z10;
                    yVar.setState(this.f28971y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).f28843l.setState(new int[0]);
                    }
                }
            } else {
                this.E = false;
                this.f28971y = false;
            }
        } else {
            this.E = false;
            this.f28971y = false;
        }
        if (this.E || this.f28971y) {
            return true;
        }
        return false;
    }

    public final f3 k(ki.f4 f4Var) {
        Integer valueOf = Integer.valueOf(this.f28970x);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f28970x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            f3 f3Var = (f3) arrayList.get(i7);
            if (f4Var.equals(f3Var.f28925a)) {
                e(f3Var);
                return f3Var;
            }
        }
        return null;
    }

    public final f3 l(fj fjVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (fjVar == null || (message = fjVar.f23965k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final f3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<f3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            f3 f3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = f3Var.J;
            if (g4Var != null && !g4Var.f47883e0.isEmpty()) {
                Object h = i5.c.h(1, f3Var.J.f47883e0);
                if ((h instanceof TLRPC.WebPage) && ((TLRPC.WebPage) h).f28558id == webPage.f28558id) {
                    e(f3Var);
                    return f3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<f3> tabs = getTabs();
        ArrayList<d3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            d3 d3Var = tabDrawables.get(i7);
            if (tabs.size() > 1 && d3Var.f28836c == 0) {
                m10 = org.telegram.messenger.j6.m(gd.G(tabs.size() - 1, "BotMoreTabs", d3Var.f28834a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    d3Var.v = null;
                } else {
                    d3Var.v = new vy0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            } else {
                m10 = org.telegram.messenger.j6.m(d3Var.f28834a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                d3Var.v = null;
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(gd.a0(null, null, 2131754749, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(gd.a0(null, null, 2131754749, charSequence));
    }

    public final void o(boolean z10) {
        if (this.I != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                this.G = null;
                valueAnimator.cancel();
            }
            this.I = getExpandedHeight();
            Iterator it = this.K.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.H, this.I);
                this.G = ofFloat;
                ofFloat.addUpdateListener(new hi.k3(this, 14));
                this.G.addListener(new ki.n3(this, 11));
                this.G.setDuration(250L);
                this.G.setInterpolator(j1.f29017w);
                this.G.start();
            } else {
                this.H = this.I;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f56244a;
                r0.y.c((View) parent);
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!j(motionEvent.getX(), motionEvent.getY(), motionEvent.getAction()) && !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public void setCurrentAccount(int i7) {
        if (this.f28970x != i7) {
            this.f28970x = i7;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i7) {
        i(i7, true);
    }

    public void setupTab(d3 d3Var) {
        boolean z10 = false;
        int a10 = this.f28967r.a(this.f28966n, false);
        float d = this.f28969w.d(this.f28968s);
        d3Var.f28853w = 0.0f;
        if (d > 0.5f) {
            z10 = true;
        }
        d3Var.f28844m = a10;
        d3Var.f28846o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
