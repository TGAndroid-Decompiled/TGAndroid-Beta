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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ly;
import org.telegram.ui.mk;
import org.telegram.ui.un;
public final class i3 extends FrameLayout {
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
    public final Paint f20393a;
    public boolean f20394b;
    public boolean f20395c;
    public final ActionBarLayout d;
    public final g3 e;
    public int f20396f;
    public final org.telegram.ui.Components.w4 h;
    public int f20397n;
    public final org.telegram.ui.Components.w4 f20398r;
    public boolean f20399s;
    public final org.telegram.ui.Components.t5 f20400w;
    public int f20401x;
    public boolean f20402y;

    public i3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f20393a = new Paint(1);
        this.f20394b = true;
        this.f20395c = false;
        gr grVar = gr.h;
        this.h = new org.telegram.ui.Components.w4(this, 200L, grVar, 0);
        this.f20398r = new org.telegram.ui.Components.w4(this, 200L, grVar, 0);
        this.f20400w = new org.telegram.ui.Components.t5(this, 0L, 200L, grVar);
        this.f20401x = e20.f15506s0;
        this.E = new RectF();
        this.I = new HashSet();
        this.J = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(t6.x0(null, t6.f20873a7, false));
        g3 g3Var = new g3(this, this);
        this.e = g3Var;
        r0.h0.j(this, g3Var);
        n();
        o(false);
    }

    public static TextPaint getTextPaint() {
        if (M == null) {
            TextPaint textPaint = new TextPaint(1);
            M = textPaint;
            textPaint.setTypeface(org.telegram.messenger.i0.o());
            M.setTextSize(org.telegram.messenger.i0.L(17.0f));
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
        q3 q3Var;
        ValueAnimator valueAnimator;
        ArrayList<h3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        h3 h3Var = (h3) i0.a.g(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity == null) {
            q3Var = null;
        } else {
            q3Var = launchActivity.f33400y0;
        }
        if (q3Var != null && (valueAnimator = q3Var.d) != null) {
            valueAnimator.cancel();
            q3Var.d = null;
        }
        if (size != 1 && q3Var != null) {
            q3Var.f();
        } else {
            e(h3Var);
        }
    }

    public final f3 c(h3 h3Var) {
        ArrayList<f3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            if (tabDrawables.get(i10).f20299a == h3Var) {
                return tabDrawables.get(i10);
            }
        }
        return null;
    }

    public final void d(RectF rectF, float f7) {
        rectF.set(org.telegram.messenger.i0.L(4.0f), (getHeight() - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(50.0f), getWidth() - org.telegram.messenger.i0.L(4.0f), getHeight() - org.telegram.messenger.i0.L(4.0f));
        rectF.offset(0.0f, (-org.telegram.messenger.i0.L(8.0f)) * f7);
        float T1 = org.telegram.messenger.i0.T1(1.0f, 0.95f, Math.abs(f7));
        float centerX = rectF.centerX();
        float centerY = rectF.centerY();
        float width = rectF.width();
        float height = rectF.height();
        float f10 = (width / 2.0f) * T1;
        rectF.left = centerX - f10;
        rectF.right = centerX + f10;
        float f11 = (height / 2.0f) * T1;
        rectF.top = centerY - f11;
        rectF.bottom = centerY + f11;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        getTabs();
        ArrayList<f3> tabDrawables = getTabDrawables();
        if (this.G > 0.0f) {
            this.f20393a.setColor(this.h.a(this.f20396f, false));
            super.dispatchDraw(canvas);
            int a2 = this.f20398r.a(this.f20397n, false);
            float d = this.f20400w.d(this.f20399s);
            if (this.f20394b) {
                int i10 = 0;
                while (i10 < tabDrawables.size()) {
                    f3 f3Var = tabDrawables.get(i10);
                    float c10 = f3Var.c();
                    float b10 = f3Var.b();
                    if (b10 <= 0.0f || c10 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.E;
                        d(rectF, c10);
                        f3Var.f20317w = 0.0f;
                        if (d > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f3Var.f20308m = a2;
                        f3Var.f20310o = z10;
                        canvas2 = canvas;
                        f3Var.a(canvas2, rectF, org.telegram.messenger.i0.L(18.0f), b10, 1.0f);
                    }
                    i10++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        g3 g3Var;
        if (this.f20394b && !getTabs().isEmpty() && (g3Var = this.e) != null && g3Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(h3 h3Var) {
        un unVar;
        mk mkVar;
        k2 Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z10 = Q instanceof un;
            if (z10 && (mkVar = (unVar = (un) Q).Z) != null) {
                mkVar.K();
                unVar.Z.j0(true, false, true);
            }
            if (h3Var.J != null) {
                ly sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.h4 h4Var = h3Var.J;
                org.telegram.ui.u3 u3Var = h4Var.K;
                d3.b(u3Var);
                sheetFragment.addSheet(u3Var);
                org.telegram.ui.t3 t3Var = u3Var.f41775c;
                u3Var.h = false;
                u3Var.f41777n = false;
                ValueAnimator valueAnimator = u3Var.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = u3Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                u3Var.f41782y = 0.0f;
                u3Var.f41781x = 0.0f;
                u3Var.r();
                u3Var.A();
                t3Var.invalidate();
                t3Var.requestLayout();
                h4Var.W(sheetFragment.getParentActivity(), sheetFragment);
                u3Var.q(sheetFragment);
                u3Var.o();
                h(this.f20401x, h3Var, false);
                return;
            }
            new ag.e0(8, this, h3Var).a(Q);
            if (h3Var.C) {
                if (!z10 || ((un) Q).a() != h3Var.f20355a.f54072c) {
                    this.f20395c = true;
                    org.telegram.messenger.i0.h3(new li.s(this, Q, un.ma(h3Var.f20355a.f54072c), 19), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<h3> tabs = getTabs();
        ArrayList<f3> tabDrawables = getTabDrawables();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            tabs.get(i10).a();
        }
        tabs.clear();
        for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
            tabDrawables.get(i11).d = -1;
        }
        n();
        o(true);
        invalidate();
        tabs.isEmpty();
    }

    public final void g(h3 h3Var, r20 r20Var) {
        String str;
        if (h3Var == null) {
            r20Var.a(Boolean.TRUE);
        } else if (!h3Var.f20375y) {
            h(this.f20401x, h3Var, true);
            r20Var.a(Boolean.TRUE);
        } else {
            TLRPC.User Z1 = wp.r1(h3Var.f20355a.f54070a).Z1(Long.valueOf(h3Var.f20355a.f54072c));
            if (Z1 != null) {
                str = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
            } else {
                xh.t3 t3Var = h3Var.f20355a;
                if (t3Var.f54074g == 6) {
                    str = t3Var.e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            x1 x1Var = alertDialog$Builder.f20135a;
            x1Var.R = str;
            x1Var.T = dd.L0(2131752917, null);
            alertDialog$Builder.k(dd.L0(2131752916, null), new f1.a(this, zArr, h3Var, r20Var, r9));
            alertDialog$Builder.h(dd.L0(2131752589, null), new androidx.car.app.utils.a(zArr, r20Var, r9, 9));
            x1[] x1VarArr = {x1Var};
            x1Var.setOnDismissListener(new e3(zArr, r20Var));
            x1VarArr[0].show();
            a7.V((TextView) x1VarArr[0].d(-1), t6.f21171q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f20393a;
    }

    public int getExpandedHeight() {
        int size = getTabs().size();
        if (size == 0) {
            return 0;
        }
        if (size == 1) {
            return org.telegram.messenger.i0.L(60.0f);
        }
        return org.telegram.messenger.i0.L(68.0f);
    }

    public ArrayList<f3> getTabDrawables() {
        int i10 = this.f20401x;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = L;
        ArrayList<f3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<f3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<h3> getTabs() {
        int i10 = this.f20401x;
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList<h3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList<h3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i10, h3 h3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i10);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i10);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i10);
        HashMap hashMap2 = L;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i10);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(h3Var);
        if (z10) {
            h3Var.a();
        }
        for (int i11 = 0; i11 < arrayList3.size(); i11++) {
            f3 f3Var = (f3) arrayList3.get(i11);
            int indexOf = arrayList.indexOf(f3Var.f20299a);
            f3Var.d = indexOf;
            if (indexOf >= 0) {
                f3Var.f20301c = indexOf;
            }
        }
        n();
        org.telegram.messenger.i0.h3(new li.s(this, arrayList3, h3Var, 20), 320L);
        o(true);
        invalidate();
        g3 g3Var = this.e;
        if (g3Var != null) {
            g3Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i10, boolean z10) {
        boolean z11;
        float f7;
        if (i10 != this.f20396f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.Q || actionBarLayout.T) {
                z10 = false;
            }
            this.f20396f = i10;
            if (org.telegram.messenger.i0.B(i10) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f7 = 0.08f;
            } else {
                f7 = 0.75f;
            }
            int w9 = t6.w(i10, t6.r1(f7, -1));
            this.f20397n = w9;
            if (org.telegram.messenger.i0.B(w9) < 0.721f) {
                z12 = true;
            }
            this.f20399s = z12;
            if (!z10) {
                this.h.a(this.f20396f, true);
                this.f20398r.a(this.f20397n, true);
                this.f20400w.f(this.f20399s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f7, float f10, int i10) {
        h3 h3Var;
        boolean z10;
        ArrayList<h3> tabs = getTabs();
        ArrayList<f3> tabDrawables = getTabDrawables();
        if (this.f20394b) {
            if (tabs.isEmpty()) {
                h3Var = null;
            } else {
                h3Var = tabs.get(0);
            }
            f3 c10 = c(h3Var);
            if (c10 != null) {
                org.telegram.ui.Cells.y yVar = c10.f20307l;
                float c11 = c10.c();
                RectF rectF = this.E;
                d(rectF, c11);
                if (i10 != 0 && i10 != 2) {
                    if (i10 == 1 || i10 == 3) {
                        if (this.D && i10 == 1) {
                            b();
                        } else if (this.f20402y && i10 == 1) {
                            g(h3Var, new ag.z0(5));
                        }
                        this.f20402y = false;
                        this.D = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f7 - rectF.left), (int) (f10 - rectF.centerY()));
                    this.f20402y = contains;
                    if (!contains && rectF.contains(f7, f10)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.D = z10;
                    yVar.setState(this.f20402y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i11 = 0; i11 < tabDrawables.size(); i11++) {
                    if (tabDrawables.get(i11) != c10) {
                        tabDrawables.get(i11).f20307l.setState(new int[0]);
                    }
                }
            } else {
                this.D = false;
                this.f20402y = false;
            }
        } else {
            this.D = false;
            this.f20402y = false;
        }
        if (this.D || this.f20402y) {
            return true;
        }
        return false;
    }

    public final h3 k(kj kjVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (kjVar == null || (message = kjVar.f16690k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return l(webPage);
    }

    public final h3 l(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<h3> tabs = getTabs();
        for (int i10 = 0; i10 < tabs.size(); i10++) {
            h3 h3Var = tabs.get(i10);
            org.telegram.ui.h4 h4Var = h3Var.J;
            if (h4Var != null && !h4Var.f37675d0.isEmpty()) {
                Object g10 = i0.a.g(1, h3Var.J.f37675d0);
                if ((g10 instanceof TLRPC.WebPage) && ((TLRPC.WebPage) g10).f19949id == webPage.f19949id) {
                    e(h3Var);
                    return h3Var;
                }
            }
        }
        return null;
    }

    public final h3 m(xh.t3 t3Var) {
        Integer valueOf = Integer.valueOf(this.f20401x);
        HashMap hashMap = K;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f20401x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h3 h3Var = (h3) arrayList.get(i10);
            if (t3Var.equals(h3Var.f20355a)) {
                e(h3Var);
                return h3Var;
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<h3> tabs = getTabs();
        ArrayList<f3> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
            f3 f3Var = tabDrawables.get(i10);
            if (tabs.size() > 1 && f3Var.f20301c == 0) {
                m10 = org.telegram.messenger.k6.m(dd.G(tabs.size() - 1, "BotMoreTabs", f3Var.f20299a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    f3Var.v = null;
                } else {
                    f3Var.v = new rz0(m10, 17.0f, org.telegram.messenger.i0.o());
                }
            } else {
                m10 = org.telegram.messenger.k6.m(f3Var.f20299a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                f3Var.v = null;
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(dd.a0(null, null, 2131754749, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(dd.a0(null, null, 2131754749, charSequence));
    }

    public final void o(boolean z10) {
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
            if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.G, this.H);
                this.F = ofFloat;
                ofFloat.addUpdateListener(new bg.k(this, 18));
                this.F.addListener(new bg.e(this, 21));
                this.F.setDuration(250L);
                this.F.setInterpolator(m1.f20562w);
                this.F.start();
            } else {
                this.G = this.H;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.h0.f46134a;
                r0.x.c((View) parent);
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

    public void setCurrentAccount(int i10) {
        if (this.f20401x != i10) {
            this.f20401x = i10;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i10) {
        i(i10, true);
    }

    public void setupTab(f3 f3Var) {
        boolean z10 = false;
        int a2 = this.f20398r.a(this.f20397n, false);
        float d = this.f20400w.d(this.f20399s);
        f3Var.f20317w = 0.0f;
        if (d > 0.5f) {
            z10 = true;
        }
        f3Var.f20308m = a2;
        f3Var.f20310o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
