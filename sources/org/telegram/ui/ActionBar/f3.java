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
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
import org.telegram.ui.nx;
import org.telegram.ui.rj;
public final class f3 extends FrameLayout {
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
    public final Paint f29004a;
    public boolean f29005b;
    public boolean f29006c;
    public final ActionBarLayout d;
    public final d3 f29007e;
    public int f29008f;
    public final org.telegram.ui.Components.f5 h;
    public int f29009n;
    public final org.telegram.ui.Components.f5 f29010r;
    public boolean f29011s;
    public final org.telegram.ui.Components.c6 f29012w;
    public int f29013x;
    public boolean f29014y;

    public f3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f29004a = new Paint(1);
        this.f29005b = true;
        this.f29006c = false;
        kr krVar = kr.h;
        this.h = new org.telegram.ui.Components.f5(this, 200L, krVar, 0);
        this.f29010r = new org.telegram.ui.Components.f5(this, 200L, krVar, 0);
        this.f29012w = new org.telegram.ui.Components.c6(this, 0L, 200L, krVar);
        this.f29013x = i10.f24637t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(n6.x0(null, n6.f29394a7, false));
        d3 d3Var = new d3(this, this);
        this.f29007e = d3Var;
        r0.i0.j(this, d3Var);
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
        m3 m3Var;
        ValueAnimator valueAnimator;
        ArrayList<e3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        e3 e3Var = (e3) i5.c.h(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity == null) {
            m3Var = null;
        } else {
            m3Var = launchActivity.f43230x0;
        }
        if (m3Var != null && (valueAnimator = m3Var.d) != null) {
            valueAnimator.cancel();
            m3Var.d = null;
        }
        if (size != 1 && m3Var != null) {
            m3Var.f();
        } else {
            e(e3Var);
        }
    }

    public final c3 c(e3 e3Var) {
        ArrayList<c3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).f28883a == e3Var) {
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
        ArrayList<c3> tabDrawables = getTabDrawables();
        if (this.H > 0.0f) {
            this.f29004a.setColor(this.h.a(this.f29008f, false));
            super.dispatchDraw(canvas);
            int a10 = this.f29010r.a(this.f29009n, false);
            float d = this.f29012w.d(this.f29011s);
            if (this.f29005b) {
                int i7 = 0;
                while (i7 < tabDrawables.size()) {
                    c3 c3Var = tabDrawables.get(i7);
                    float c10 = c3Var.c();
                    float b10 = c3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.F;
                        d(rectF, c10);
                        c3Var.f28902w = 0.0f;
                        if (d > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        c3Var.f28893m = a10;
                        c3Var.f28895o = z10;
                        canvas2 = canvas;
                        c3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
                    }
                    i7++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        d3 d3Var;
        if (this.f29005b && !getTabs().isEmpty() && (d3Var = this.f29007e) != null && d3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(e3 e3Var) {
        bn bnVar;
        rj rjVar;
        g2 Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z10 = Q instanceof bn;
            if (z10 && (rjVar = (bnVar = (bn) Q).f46118a0) != null) {
                rjVar.U();
                bnVar.f46118a0.K0();
            }
            if (e3Var.J != null) {
                nx sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.g4 g4Var = e3Var.J;
                org.telegram.ui.t3 t3Var = g4Var.L;
                a3.b(t3Var);
                sheetFragment.addSheet(t3Var);
                org.telegram.ui.s3 s3Var = t3Var.f52222c;
                t3Var.h = false;
                t3Var.f52225n = false;
                ValueAnimator valueAnimator = t3Var.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = t3Var.F;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t3Var.f52230y = 0.0f;
                t3Var.f52229x = 0.0f;
                t3Var.r();
                t3Var.A();
                s3Var.invalidate();
                s3Var.requestLayout();
                g4Var.W(sheetFragment.getParentActivity(), sheetFragment);
                t3Var.q(sheetFragment);
                t3Var.o();
                h(this.f29013x, e3Var, false);
                return;
            }
            new b3(0, this, e3Var).a(Q);
            if (e3Var.C) {
                if (!z10 || ((bn) Q).a() != e3Var.f28952a.f18769c) {
                    this.f29006c = true;
                    org.telegram.messenger.g0.h3(new kg.x(this, Q, bn.ua(e3Var.f28952a.f18769c), 25), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<e3> tabs = getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
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

    public final void g(e3 e3Var, w10 w10Var) {
        String str;
        if (e3Var == null) {
            w10Var.a(Boolean.TRUE);
        } else if (!e3Var.f28973y) {
            h(this.f29013x, e3Var, true);
            w10Var.a(Boolean.TRUE);
        } else {
            TLRPC.User c22 = mp.u1(e3Var.f28952a.f18767a).c2(Long.valueOf(e3Var.f28952a.f18769c));
            if (c22 != null) {
                str = org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name);
            } else {
                ki.f4 f4Var = e3Var.f28952a;
                if (f4Var.f18772g == 6) {
                    str = f4Var.f18770e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            t1 t1Var = alertDialog$Builder.f28835a;
            t1Var.S = str;
            t1Var.U = gd.N0(2131752905, null);
            alertDialog$Builder.k(gd.N0(2131752904, null), new di.l6(this, zArr, e3Var, w10Var, r9));
            alertDialog$Builder.h(gd.N0(2131752577, null), new a3.h(zArr, w10Var, r9, 18));
            t1[] t1VarArr = {t1Var};
            t1Var.setOnDismissListener(new y1(2, zArr, w10Var));
            t1VarArr[0].show();
            u6.U((TextView) t1VarArr[0].d(-1), n6.f29692q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f29004a;
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

    public ArrayList<c3> getTabDrawables() {
        int i7 = this.f29013x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = M;
        ArrayList<c3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<c3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<e3> getTabs() {
        int i7 = this.f29013x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<e3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<e3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i7, e3 e3Var, boolean z10) {
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
        arrayList.remove(e3Var);
        if (z10) {
            e3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            c3 c3Var = (c3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(c3Var.f28883a);
            c3Var.d = indexOf;
            if (indexOf >= 0) {
                c3Var.f28885c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.h3(new kg.x(this, arrayList3, e3Var, 26), 320L);
        o(true);
        invalidate();
        d3 d3Var = this.f29007e;
        if (d3Var != null) {
            d3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i7, boolean z10) {
        boolean z11;
        float f10;
        if (i7 != this.f29008f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.R || actionBarLayout.U) {
                z10 = false;
            }
            this.f29008f = i7;
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
            this.f29009n = w10;
            if (org.telegram.messenger.g0.B(w10) < 0.721f) {
                z12 = true;
            }
            this.f29011s = z12;
            if (!z10) {
                this.h.a(this.f29008f, true);
                this.f29010r.a(this.f29009n, true);
                this.f29012w.f(this.f29011s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i7) {
        e3 e3Var;
        boolean z10;
        ArrayList<e3> tabs = getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
        if (this.f29005b) {
            if (tabs.isEmpty()) {
                e3Var = null;
            } else {
                e3Var = tabs.get(0);
            }
            c3 c10 = c(e3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f28892l;
                float c11 = c10.c();
                RectF rectF = this.F;
                d(rectF, c11);
                if (i7 != 0 && i7 != 2) {
                    if (i7 == 1 || i7 == 3) {
                        if (this.E && i7 == 1) {
                            b();
                        } else if (this.f29014y && i7 == 1) {
                            g(e3Var, new fi.e(6));
                        }
                        this.f29014y = false;
                        this.E = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f29014y = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.E = z10;
                    yVar.setState(this.f29014y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).f28892l.setState(new int[0]);
                    }
                }
            } else {
                this.E = false;
                this.f29014y = false;
            }
        } else {
            this.E = false;
            this.f29014y = false;
        }
        if (this.E || this.f29014y) {
            return true;
        }
        return false;
    }

    public final e3 k(ki.f4 f4Var) {
        Integer valueOf = Integer.valueOf(this.f29013x);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f29013x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            e3 e3Var = (e3) arrayList.get(i7);
            if (f4Var.equals(e3Var.f28952a)) {
                e(e3Var);
                return e3Var;
            }
        }
        return null;
    }

    public final e3 l(fj fjVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (fjVar == null || (message = fjVar.f24073k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final e3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<e3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            e3 e3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = e3Var.J;
            if (g4Var != null && !g4Var.f48068e0.isEmpty()) {
                Object h = i5.c.h(1, e3Var.J.f48068e0);
                if ((h instanceof TLRPC.WebPage) && ((TLRPC.WebPage) h).f28647id == webPage.f28647id) {
                    e(e3Var);
                    return e3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<e3> tabs = getTabs();
        ArrayList<c3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            c3 c3Var = tabDrawables.get(i7);
            if (tabs.size() > 1 && c3Var.f28885c == 0) {
                m10 = org.telegram.messenger.j6.m(gd.G(tabs.size() - 1, "BotMoreTabs", c3Var.f28883a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    c3Var.v = null;
                } else {
                    c3Var.v = new wy0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            } else {
                m10 = org.telegram.messenger.j6.m(c3Var.f28883a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                c3Var.v = null;
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(gd.a0(null, null, 2131754748, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(gd.a0(null, null, 2131754748, charSequence));
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
                ofFloat.addUpdateListener(new hi.s3(this, 14));
                this.G.addListener(new ki.n3(this, 11));
                this.G.setDuration(250L);
                this.G.setInterpolator(i1.f29066w);
                this.G.start();
            } else {
                this.H = this.I;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f56367a;
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
        if (this.f29013x != i7) {
            this.f29013x = i7;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i7) {
        i(i7, true);
    }

    public void setupTab(c3 c3Var) {
        boolean z10 = false;
        int a10 = this.f29010r.a(this.f29009n, false);
        float d = this.f29012w.d(this.f29011s);
        c3Var.f28902w = 0.0f;
        if (d > 0.5f) {
            z10 = true;
        }
        c3Var.f28893m = a10;
        c3Var.f28895o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
