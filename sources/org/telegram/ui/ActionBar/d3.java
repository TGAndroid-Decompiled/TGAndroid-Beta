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
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
import org.telegram.ui.jx;
import org.telegram.ui.qj;
public final class d3 extends FrameLayout {
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
    public final Paint f27424a;
    public boolean f27425b;
    public boolean f27426c;
    public final ActionBarLayout d;
    public final b3 f27427e;
    public int f27428f;
    public final org.telegram.ui.Components.z4 h;
    public int f27429n;
    public final org.telegram.ui.Components.z4 f27430r;
    public boolean f27431s;
    public final org.telegram.ui.Components.w5 f27432w;
    public int f27433x;
    public boolean f27434y;

    public d3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f27424a = new Paint(1);
        this.f27425b = true;
        this.f27426c = false;
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.z4(this, 200L, xqVar, 0);
        this.f27430r = new org.telegram.ui.Components.z4(this, 200L, xqVar, 0);
        this.f27432w = new org.telegram.ui.Components.w5(this, 0L, 200L, xqVar);
        this.f27433x = p10.f24459s0;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(k6.x0(null, k6.f27792a7, false));
        b3 b3Var = new b3(this, this);
        this.f27427e = b3Var;
        r0.i0.j(this, b3Var);
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
        k3 k3Var;
        ValueAnimator valueAnimator;
        ArrayList<c3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        c3 c3Var = (c3) jg.g.i(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity == null) {
            k3Var = null;
        } else {
            k3Var = launchActivity.f41267w0;
        }
        if (k3Var != null && (valueAnimator = k3Var.d) != null) {
            valueAnimator.cancel();
            k3Var.d = null;
        }
        if (size != 1 && k3Var != null) {
            k3Var.f();
        } else {
            e(c3Var);
        }
    }

    public final a3 c(c3 c3Var) {
        ArrayList<a3> tabDrawables = getTabDrawables();
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            if (tabDrawables.get(i7).f27302a == c3Var) {
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
        ArrayList<a3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f27424a.setColor(this.h.a(this.f27428f, false));
            super.dispatchDraw(canvas);
            int a10 = this.f27430r.a(this.f27429n, false);
            float d = this.f27432w.d(this.f27431s);
            if (this.f27425b) {
                int i7 = 0;
                while (i7 < tabDrawables.size()) {
                    a3 a3Var = tabDrawables.get(i7);
                    float c10 = a3Var.c();
                    float b10 = a3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        a3Var.f27321w = 0.0f;
                        if (d > 0.5f) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        a3Var.f27312m = a10;
                        a3Var.f27314o = z9;
                        canvas2 = canvas;
                        a3Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
                    }
                    i7++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        b3 b3Var;
        if (this.f27425b && !getTabs().isEmpty() && (b3Var = this.f27427e) != null && b3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(c3 c3Var) {
        an anVar;
        qj qjVar;
        f2 Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z9 = Q instanceof an;
            if (z9 && (qjVar = (anVar = (an) Q).Z) != null) {
                qjVar.L();
                anVar.Z.j0();
            }
            if (c3Var.J != null) {
                jx sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.g4 g4Var = c3Var.J;
                org.telegram.ui.t3 t3Var = g4Var.K;
                z2.b(t3Var);
                sheetFragment.addSheet(t3Var);
                org.telegram.ui.s3 s3Var = t3Var.f49876c;
                t3Var.h = false;
                t3Var.f49879n = false;
                ValueAnimator valueAnimator = t3Var.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = t3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                t3Var.f49884y = 0.0f;
                t3Var.f49883x = 0.0f;
                t3Var.r();
                t3Var.A();
                s3Var.invalidate();
                s3Var.requestLayout();
                g4Var.W(sheetFragment.getParentActivity(), sheetFragment);
                t3Var.q(sheetFragment);
                t3Var.o();
                h(this.f27433x, c3Var, false);
                return;
            }
            new org.telegram.messenger.voip.k(1, this, c3Var).a(Q);
            if (c3Var.C) {
                if (!z9 || ((an) Q).a() != c3Var.f27370a.f14888c) {
                    this.f27426c = true;
                    org.telegram.messenger.g0.i3(new l2.z0(this, Q, an.ra(c3Var.f27370a.f14888c), 19), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<c3> tabs = getTabs();
        ArrayList<a3> tabDrawables = getTabDrawables();
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

    public final void g(c3 c3Var, c20 c20Var) {
        String str;
        if (c3Var == null) {
            c20Var.a(Boolean.TRUE);
        } else if (!c3Var.f27391y) {
            h(this.f27433x, c3Var, true);
            c20Var.a(Boolean.TRUE);
        } else {
            TLRPC.User a22 = qp.s1(c3Var.f27370a.f14886a).a2(Long.valueOf(c3Var.f27370a.f14888c));
            if (a22 != null) {
                str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            } else {
                hi.q4 q4Var = c3Var.f27370a;
                if (q4Var.f14891g == 6) {
                    str = q4Var.f14889e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            u1 u1Var = alertDialog$Builder.f27292a;
            u1Var.R = str;
            u1Var.T = hd.M0(2131752917, null);
            alertDialog$Builder.k(hd.M0(2131752916, null), new q7(this, zArr, c3Var, c20Var, r9));
            alertDialog$Builder.h(hd.M0(2131752589, null), new a3.h(zArr, c20Var, r9, 17));
            u1[] u1VarArr = {u1Var};
            u1Var.setOnDismissListener(new q8(zArr, c20Var));
            u1VarArr[0].show();
            r6.V((TextView) u1VarArr[0].d(-1), k6.f28089q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f27424a;
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

    public ArrayList<a3> getTabDrawables() {
        int i7 = this.f27433x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = L;
        ArrayList<a3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<a3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<c3> getTabs() {
        int i7 = this.f27433x;
        Integer valueOf = Integer.valueOf(i7);
        HashMap hashMap = K;
        ArrayList<c3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i7);
            ArrayList<c3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i7, c3 c3Var, boolean z9) {
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
        arrayList.remove(c3Var);
        if (z9) {
            c3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            a3 a3Var = (a3) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(a3Var.f27302a);
            a3Var.d = indexOf;
            if (indexOf >= 0) {
                a3Var.f27304c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.i3(new l2.z0(this, arrayList3, c3Var, 20), 320L);
        o(true);
        invalidate();
        b3 b3Var = this.f27427e;
        if (b3Var != null) {
            b3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i7, boolean z9) {
        boolean z10;
        float f10;
        if (i7 != this.f27428f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z11 = false;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z9 = false;
            }
            this.f27428f = i7;
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
            int w10 = k6.w(i7, k6.r1(f10, -1));
            this.f27429n = w10;
            if (org.telegram.messenger.g0.B(w10) < 0.721f) {
                z11 = true;
            }
            this.f27431s = z11;
            if (!z9) {
                this.h.a(this.f27428f, true);
                this.f27430r.a(this.f27429n, true);
                this.f27432w.f(this.f27431s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i7) {
        c3 c3Var;
        boolean z9;
        ArrayList<c3> tabs = getTabs();
        ArrayList<a3> tabDrawables = getTabDrawables();
        if (this.f27425b) {
            if (tabs.isEmpty()) {
                c3Var = null;
            } else {
                c3Var = tabs.get(0);
            }
            a3 c10 = c(c3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f27311l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i7 != 0 && i7 != 2) {
                    if (i7 == 1 || i7 == 3) {
                        if (this.D && i7 == 1) {
                            b();
                        } else if (this.f27434y && i7 == 1) {
                            g(c3Var, new di.e(6));
                        }
                        this.f27434y = false;
                        this.D = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f27434y = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    this.D = z9;
                    yVar.setState(this.f27434y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c10) {
                        tabDrawables.get(i10).f27311l.setState(new int[0]);
                    }
                }
            } else {
                this.D = false;
                this.f27434y = false;
            }
        } else {
            this.D = false;
            this.f27434y = false;
        }
        if (this.D || this.f27434y) {
            return true;
        }
        return false;
    }

    public final c3 k(hi.q4 q4Var) {
        Integer valueOf = Integer.valueOf(this.f27433x);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f27433x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c3 c3Var = (c3) arrayList.get(i7);
            if (q4Var.equals(c3Var.f27370a)) {
                e(c3Var);
                return c3Var;
            }
        }
        return null;
    }

    public final c3 l(ij ijVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (ijVar == null || (message = ijVar.f23237k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final c3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<c3> tabs = getTabs();
        for (int i7 = 0; i7 < tabs.size(); i7++) {
            c3 c3Var = tabs.get(i7);
            org.telegram.ui.g4 g4Var = c3Var.J;
            if (g4Var != null && !g4Var.f45800d0.isEmpty()) {
                Object i10 = jg.g.i(1, c3Var.J.f45800d0);
                if ((i10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) i10).f27107id == webPage.f27107id) {
                    e(c3Var);
                    return c3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<c3> tabs = getTabs();
        ArrayList<a3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i7 = 0; i7 < tabDrawables.size(); i7++) {
            a3 a3Var = tabDrawables.get(i7);
            if (tabs.size() > 1 && a3Var.f27304c == 0) {
                m10 = org.telegram.messenger.i6.m(hd.G(tabs.size() - 1, "BotMoreTabs", a3Var.f27302a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    a3Var.v = null;
                } else {
                    a3Var.v = new ly0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            } else {
                m10 = org.telegram.messenger.i6.m(a3Var.f27302a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                a3Var.v = null;
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(hd.a0(null, null, 2131754749, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(hd.a0(null, null, 2131754749, charSequence));
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
                this.F.setInterpolator(i1.f27540w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f54073a;
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
        if (this.f27433x != i7) {
            this.f27433x = i7;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i7) {
        i(i7, true);
    }

    public void setupTab(a3 a3Var) {
        boolean z9 = false;
        int a10 = this.f27430r.a(this.f27429n, false);
        float d = this.f27432w.d(this.f27431s);
        a3Var.f27321w = 0.0f;
        if (d > 0.5f) {
            z9 = true;
        }
        a3Var.f27312m = a10;
        a3Var.f27314o = z9;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
