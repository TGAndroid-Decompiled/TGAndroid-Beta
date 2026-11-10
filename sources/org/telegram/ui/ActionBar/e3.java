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
import bi.q7;
import bi.q8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cn;
import org.telegram.ui.mx;
import org.telegram.ui.sj;
public final class e3 extends FrameLayout {
    public static final HashMap K = new HashMap();
    public static final HashMap L = new HashMap();
    public static TextPaint M;
    public boolean D;
    public final RectF E;
    public ValueAnimator F;
    public float G;
    public int H;
    public final HashSet I;
    public final HashSet J;
    public final Paint f27432a;
    public boolean f27433b;
    public boolean f27434c;
    public final ActionBarLayout d;
    public final c3 f27435e;
    public int f27436f;
    public final org.telegram.ui.Components.y4 h;
    public int f27437n;
    public final org.telegram.ui.Components.y4 f27438r;
    public boolean f27439s;
    public final org.telegram.ui.Components.v5 f27440w;
    public int f27441x;
    public boolean f27442y;

    public e3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f27432a = new Paint(1);
        this.f27433b = true;
        this.f27434c = false;
        wq wqVar = wq.h;
        this.h = new org.telegram.ui.Components.y4(this, 200L, wqVar, 0);
        this.f27438r = new org.telegram.ui.Components.y4(this, 200L, wqVar, 0);
        this.f27440w = new org.telegram.ui.Components.v5(this, 0L, 200L, wqVar);
        this.f27441x = p10.f24474s0;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(m6.x0(null, m6.f27834a7, false));
        c3 c3Var = new c3(this, this);
        this.f27435e = c3Var;
        r0.i0.j(this, c3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (M == null) {
            TextPaint textPaint = new TextPaint(1);
            M = textPaint;
            textPaint.setTypeface(org.telegram.messenger.g0.o());
            M.setTextSize(org.telegram.messenger.g0.L(17.0f));
        }
        return M;
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
        l3 l3Var;
        ValueAnimator valueAnimator;
        ArrayList<d3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        d3 d3Var = (d3) jg.g.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            l3Var = null;
        } else {
            l3Var = launchActivity.f41293w0;
        }
        if (l3Var != null && (valueAnimator = l3Var.d) != null) {
            valueAnimator.cancel();
            l3Var.d = null;
        }
        if (size != 1 && l3Var != null) {
            l3Var.f();
        } else {
            e(d3Var);
        }
    }

    public final b3 c(d3 d3Var) {
        ArrayList<b3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).f27327a == d3Var) {
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
        boolean z9;
        Canvas canvas2;
        getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f27432a.setColor(this.h.a(this.f27436f, false));
            super.dispatchDraw(canvas);
            int a10 = this.f27438r.a(this.f27437n, false);
            float d = this.f27440w.d(this.f27439s);
            if (this.f27433b) {
                int i7 = 0;
                while (i7 < tabDrawables.size()) {
                    b3 b3Var = tabDrawables.get(i7);
                    float c10 = b3Var.c();
                    float b10 = b3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        b3Var.f27346w = 0.0f;
                        if (d > 0.5f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        b3Var.f27337m = a10;
                        b3Var.f27339o = z9;
                        canvas2 = canvas;
                        b3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
                    }
                    i7++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        c3 c3Var;
        if (this.f27433b && !getTabs().isEmpty() && (c3Var = this.f27435e) != null && c3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(d3 d3Var) {
        cn cnVar;
        sj sjVar;
        f2 Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z9 = Q instanceof cn;
            if (z9 && (sjVar = (cnVar = (cn) Q).Z) != null) {
                sjVar.L();
                cnVar.Z.j0();
            }
            if (d3Var.J != null) {
                mx sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.g4 g4Var = d3Var.J;
                org.telegram.ui.t3 t3Var = g4Var.K;
                a3.b(t3Var);
                sheetFragment.addSheet(t3Var);
                org.telegram.ui.s3 s3Var = t3Var.f50090c;
                t3Var.h = false;
                t3Var.f50093n = false;
                ValueAnimator valueAnimator = t3Var.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = t3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t3Var.f50098y = 0.0f;
                t3Var.f50097x = 0.0f;
                t3Var.r();
                t3Var.A();
                s3Var.invalidate();
                s3Var.requestLayout();
                g4Var.W(sheetFragment.getParentActivity(), sheetFragment);
                t3Var.q(sheetFragment);
                t3Var.o();
                h(this.f27441x, d3Var, false);
                return;
            }
            new org.telegram.messenger.voip.k(1, this, d3Var).a(Q);
            if (d3Var.C) {
                if (!z9 || ((cn) Q).a() != d3Var.f27392a.f14893c) {
                    this.f27434c = true;
                    org.telegram.messenger.g0.i3(new l2.z0(this, Q, cn.ta(d3Var.f27392a.f14893c), 19), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<d3> tabs = getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
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

    public final void g(d3 d3Var, c20 c20Var) {
        String str;
        if (d3Var == null) {
            c20Var.a(Boolean.TRUE);
        } else if (!d3Var.f27413y) {
            h(this.f27441x, d3Var, true);
            c20Var.a(Boolean.TRUE);
        } else {
            TLRPC.User a22 = qp.s1(d3Var.f27392a.f14891a).a2(Long.valueOf(d3Var.f27392a.f14893c));
            if (a22 != null) {
                str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            } else {
                hi.q4 q4Var = d3Var.f27392a;
                if (q4Var.f14896g == 6) {
                    str = q4Var.f14894e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            u1 u1Var = alertDialog$Builder.f27300a;
            u1Var.R = str;
            u1Var.T = id.M0(2131752917, null);
            alertDialog$Builder.k(id.M0(2131752916, null), new q7(this, zArr, d3Var, c20Var, r9));
            alertDialog$Builder.h(id.M0(2131752589, null), new a3.h(zArr, c20Var, r9, 17));
            u1[] u1VarArr = {u1Var};
            u1Var.setOnDismissListener(new q8(zArr, c20Var));
            u1VarArr[0].show();
            t6.U((TextView) u1VarArr[0].d(-1), m6.f28131q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f27432a;
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

    public ArrayList<b3> getTabDrawables() {
        int i7 = this.f27441x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<b3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<b3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<d3> getTabs() {
        int i7 = this.f27441x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = K;
        ArrayList<d3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<d3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i7, d3 d3Var, boolean z9) {
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i7);
        HashMap hashMap2 = L;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i7);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(d3Var);
        if (z9) {
            d3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            b3 b3Var = (b3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(b3Var.f27327a);
            b3Var.d = indexOf;
            if (indexOf >= 0) {
                b3Var.f27329c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.i3(new l2.z0(this, arrayList3, d3Var, 20), 320L);
        o(true);
        invalidate();
        c3 c3Var = this.f27435e;
        if (c3Var != null) {
            c3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i7, boolean z9) {
        boolean z10;
        float f10;
        if (i7 != this.f27436f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z11 = false;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z9 = false;
            }
            this.f27436f = i7;
            if (org.telegram.messenger.g0.B(i7) < 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                f10 = 0.08f;
            } else {
                f10 = 0.75f;
            }
            int w10 = m6.w(i7, m6.r1(f10, -1));
            this.f27437n = w10;
            if (org.telegram.messenger.g0.B(w10) < 0.721f) {
                z11 = true;
            }
            this.f27439s = z11;
            if (!z9) {
                this.h.a(this.f27436f, true);
                this.f27438r.a(this.f27437n, true);
                this.f27440w.f(this.f27439s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i7) {
        d3 d3Var;
        boolean z9;
        ArrayList<d3> tabs = getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
        if (this.f27433b) {
            if (tabs.isEmpty()) {
                d3Var = null;
            } else {
                d3Var = tabs.get(0);
            }
            b3 c10 = c(d3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f27336l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i7 != 0 && i7 != 2) {
                    if (i7 == 1 || i7 == 3) {
                        if (this.D && i7 == 1) {
                            b();
                        } else if (this.f27442y && i7 == 1) {
                            g(d3Var, new di.e(6));
                        }
                        this.f27442y = false;
                        this.D = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f27442y = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.D = z9;
                    yVar.setState(this.f27442y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).f27336l.setState(new int[0]);
                    }
                }
            } else {
                this.D = false;
                this.f27442y = false;
            }
        } else {
            this.D = false;
            this.f27442y = false;
        }
        if (this.D || this.f27442y) {
            return true;
        }
        return false;
    }

    public final d3 k(hi.q4 q4Var) {
        Integer valueOf = Integer.valueOf(this.f27441x);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f27441x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            d3 d3Var = (d3) arrayList.get(i7);
            if (q4Var.equals(d3Var.f27392a)) {
                e(d3Var);
                return d3Var;
            }
        }
        return null;
    }

    public final d3 l(ij ijVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (ijVar == null || (message = ijVar.f23266k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final d3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<d3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            d3 d3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = d3Var.J;
            if (g4Var != null && !g4Var.f45955d0.isEmpty()) {
                Object i10 = jg.g.i(1, d3Var.J.f45955d0);
                if ((i10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i10).f27115id == webPage.f27115id) {
                    e(d3Var);
                    return d3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<d3> tabs = getTabs();
        ArrayList<b3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            b3 b3Var = tabDrawables.get(i7);
            if (tabs.size() > 1 && b3Var.f27329c == 0) {
                m10 = org.telegram.messenger.i6.m(id.G(tabs.size() - 1, "BotMoreTabs", b3Var.f27327a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    b3Var.v = null;
                } else {
                    b3Var.v = new my0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            } else {
                m10 = org.telegram.messenger.i6.m(b3Var.f27327a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                b3Var.v = null;
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(id.a0(null, null, 2131754749, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(id.a0(null, null, 2131754749, charSequence));
    }

    public final void o(boolean z9) {
        if (this.H != getExpandedHeight()) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                this.F = null;
                valueAnimator.cancel();
            }
            this.H = getExpandedHeight();
            Iterator it = this.J.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, this.H);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new fi.v3(this, 14));
                this.F.addListener(new m.a(this, 10));
                this.F.setDuration(250L);
                this.F.setInterpolator(i1.f27527w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f54202a;
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
        if (this.f27441x != i7) {
            this.f27441x = i7;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i7) {
        i(i7, true);
    }

    public void setupTab(b3 b3Var) {
        boolean z9 = false;
        int a10 = this.f27438r.a(this.f27437n, false);
        float d = this.f27440w.d(this.f27439s);
        b3Var.f27346w = 0.0f;
        if (d > 0.5f) {
            z9 = true;
        }
        b3Var.f27337m = a10;
        b3Var.f27339o = z9;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
