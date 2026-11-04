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
import ci.r7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gx;
import org.telegram.ui.mj;
import org.telegram.ui.wm;
public final class b3 extends FrameLayout {
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
    public final Paint f27399a;
    public boolean f27400b;
    public boolean f27401c;
    public final ActionBarLayout d;
    public final z2 f27402e;
    public int f27403f;
    public final org.telegram.ui.Components.x4 h;
    public int f27404n;
    public final org.telegram.ui.Components.x4 f27405r;
    public boolean f27406s;
    public final org.telegram.ui.Components.u5 f27407w;
    public int f27408x;
    public boolean f27409y;

    public b3(Context context, ActionBarLayout actionBarLayout) {
        super(context);
        this.f27399a = new Paint(1);
        this.f27400b = true;
        this.f27401c = false;
        xq xqVar = xq.h;
        this.h = new org.telegram.ui.Components.x4(this, 200L, xqVar, 0);
        this.f27405r = new org.telegram.ui.Components.x4(this, 200L, xqVar, 0);
        this.f27407w = new org.telegram.ui.Components.u5(this, 0L, 200L, xqVar);
        this.f27408x = h10.f22829t0;
        this.F = new RectF();
        this.J = new HashSet();
        this.K = new HashSet();
        this.d = actionBarLayout;
        setNavigationBarColor(k6.x0(null, k6.f27824a7, false));
        z2 z2Var = new z2(this, this);
        this.f27402e = z2Var;
        r0.i0.j(this, z2Var);
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
        j3 j3Var;
        ValueAnimator valueAnimator;
        ArrayList<a3> tabs = getTabs();
        int size = tabs.size();
        if (size == 0) {
            return;
        }
        a3 a3Var = (a3) k2.p1.h(1, tabs);
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity == null) {
            j3Var = null;
        } else {
            j3Var = launchActivity.f41330z0;
        }
        if (j3Var != null && (valueAnimator = j3Var.d) != null) {
            valueAnimator.cancel();
            j3Var.d = null;
        }
        if (size != 1 && j3Var != null) {
            j3Var.f();
        } else {
            e(a3Var);
        }
    }

    public final y2 c(a3 a3Var) {
        ArrayList<y2> tabDrawables = getTabDrawables();
        for (int i3 = 0; i3 < tabDrawables.size(); i3++) {
            if (tabDrawables.get(i3).f28825a == a3Var) {
                return tabDrawables.get(i3);
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
        ArrayList<y2> tabDrawables = getTabDrawables();
        if (this.H > 0.0f) {
            this.f27399a.setColor(this.h.a(this.f27403f, false));
            super.dispatchDraw(canvas);
            int a10 = this.f27405r.a(this.f27404n, false);
            float d = this.f27407w.d(this.f27406s);
            if (this.f27400b) {
                int i3 = 0;
                while (i3 < tabDrawables.size()) {
                    y2 y2Var = tabDrawables.get(i3);
                    float c2 = y2Var.c();
                    float b10 = y2Var.b();
                    if (b10 <= 0.0f || c2 > 1.99f) {
                        canvas2 = canvas;
                    } else {
                        RectF rectF = this.F;
                        d(rectF, c2);
                        y2Var.f28844w = 0.0f;
                        if (d > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        y2Var.f28835m = a10;
                        y2Var.f28837o = z10;
                        canvas2 = canvas;
                        y2Var.a(canvas2, rectF, org.telegram.messenger.g0.L(18.0f), b10, 1.0f);
                    }
                    i3++;
                    canvas = canvas2;
                }
            }
        }
    }

    @Override
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        z2 z2Var;
        if (this.f27400b && !getTabs().isEmpty() && (z2Var = this.f27402e) != null && z2Var.f(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public final void e(a3 a3Var) {
        wm wmVar;
        mj mjVar;
        d2 Q = LaunchActivity.Q();
        if (Q != null && Q.getParentActivity() != null) {
            boolean z10 = Q instanceof wm;
            if (z10 && (mjVar = (wmVar = (wm) Q).f51237a0) != null) {
                mjVar.L();
                wmVar.f51237a0.k0(true, false, true);
            }
            if (a3Var.J != null) {
                gx sheetFragment = this.d.getSheetFragment();
                org.telegram.ui.i4 i4Var = a3Var.J;
                org.telegram.ui.u3 u3Var = i4Var.L;
                x2.b(u3Var);
                sheetFragment.addSheet(u3Var);
                org.telegram.ui.t3 t3Var = u3Var.f49951c;
                u3Var.h = false;
                u3Var.f49954n = false;
                ValueAnimator valueAnimator = u3Var.E;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = u3Var.F;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                u3Var.f49959y = 0.0f;
                u3Var.f49958x = 0.0f;
                u3Var.r();
                u3Var.A();
                t3Var.invalidate();
                t3Var.requestLayout();
                i4Var.W(sheetFragment.getParentActivity(), sheetFragment);
                u3Var.q(sheetFragment);
                u3Var.o();
                h(this.f27408x, a3Var, false);
                return;
            }
            new mi.f(5, this, a3Var).a(Q);
            if (a3Var.C) {
                if (!z10 || ((wm) Q).a() != a3Var.f27351a.f15166c) {
                    this.f27401c = true;
                    org.telegram.messenger.g0.i3(new lg.y(this, Q, wm.ra(a3Var.f27351a.f15166c), 23), 220L);
                }
            }
        }
    }

    public final void f() {
        ArrayList<a3> tabs = getTabs();
        ArrayList<y2> tabDrawables = getTabDrawables();
        for (int i3 = 0; i3 < tabs.size(); i3++) {
            tabs.get(i3).a();
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

    public final void g(a3 a3Var, u10 u10Var) {
        String str;
        if (a3Var == null) {
            u10Var.a(Boolean.TRUE);
        } else if (!a3Var.f27372y) {
            h(this.f27408x, a3Var, true);
            u10Var.a(Boolean.TRUE);
        } else {
            TLRPC.User a22 = hp.s1(a3Var.f27351a.f15164a).a2(Long.valueOf(a3Var.f27351a.f15166c));
            if (a22 != null) {
                str = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            } else {
                ii.q4 q4Var = a3Var.f27351a;
                if (q4Var.f15169g == 6) {
                    str = q4Var.f15167e;
                } else {
                    str = null;
                }
            }
            boolean[] zArr = {false};
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = str;
            s1Var.U = bd.M0(2131752917, null);
            alertDialog$Builder.k(bd.M0(2131752916, null), new ci.r6(this, zArr, a3Var, u10Var, r9));
            alertDialog$Builder.h(bd.M0(2131752589, null), new aa.a(zArr, u10Var, r9, 17));
            s1[] s1VarArr = {s1Var};
            s1Var.setOnDismissListener(new r7(zArr, u10Var));
            s1VarArr[0].show();
            r6.V((TextView) s1VarArr[0].d(-1), k6.f28122q7, null);
        }
    }

    public Paint getBackgroundPaint() {
        return this.f27399a;
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

    public ArrayList<y2> getTabDrawables() {
        int i3 = this.f27408x;
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = M;
        ArrayList<y2> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i3);
            ArrayList<y2> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public ArrayList<a3> getTabs() {
        int i3 = this.f27408x;
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = L;
        ArrayList<a3> arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i3);
            ArrayList<a3> arrayList2 = new ArrayList<>();
            hashMap.put(valueOf2, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public final boolean h(int i3, a3 a3Var, boolean z10) {
        Integer valueOf = Integer.valueOf(i3);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(i3);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        Integer valueOf3 = Integer.valueOf(i3);
        HashMap hashMap2 = M;
        ArrayList arrayList3 = (ArrayList) hashMap2.get(valueOf3);
        if (arrayList3 == null) {
            Integer valueOf4 = Integer.valueOf(i3);
            arrayList3 = new ArrayList();
            hashMap2.put(valueOf4, arrayList3);
        }
        arrayList.remove(a3Var);
        if (z10) {
            a3Var.a();
        }
        for (int i10 = 0; i10 < arrayList3.size(); i10++) {
            y2 y2Var = (y2) arrayList3.get(i10);
            int indexOf = arrayList.indexOf(y2Var.f28825a);
            y2Var.d = indexOf;
            if (indexOf >= 0) {
                y2Var.f28827c = indexOf;
            }
        }
        n();
        org.telegram.messenger.g0.i3(new lg.y(this, arrayList3, a3Var, 24), 320L);
        o(true);
        invalidate();
        z2 z2Var = this.f27402e;
        if (z2Var != null) {
            z2Var.i();
        }
        return arrayList.isEmpty();
    }

    public final void i(int i3, boolean z10) {
        boolean z11;
        float f10;
        if (i3 != this.f27403f) {
            ActionBarLayout actionBarLayout = this.d;
            boolean z12 = false;
            if (!actionBarLayout.R || actionBarLayout.U) {
                z10 = false;
            }
            this.f27403f = i3;
            if (org.telegram.messenger.g0.B(i3) < 0.721f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                f10 = 0.08f;
            } else {
                f10 = 0.75f;
            }
            int w10 = k6.w(i3, k6.r1(f10, -1));
            this.f27404n = w10;
            if (org.telegram.messenger.g0.B(w10) < 0.721f) {
                z12 = true;
            }
            this.f27406s = z12;
            if (!z10) {
                this.h.a(this.f27403f, true);
                this.f27405r.a(this.f27404n, true);
                this.f27407w.f(this.f27406s, true);
            }
            invalidate();
        }
    }

    public final boolean j(float f10, float f11, int i3) {
        a3 a3Var;
        boolean z10;
        ArrayList<a3> tabs = getTabs();
        ArrayList<y2> tabDrawables = getTabDrawables();
        if (this.f27400b) {
            if (tabs.isEmpty()) {
                a3Var = null;
            } else {
                a3Var = tabs.get(0);
            }
            y2 c2 = c(a3Var);
            if (c2 != null) {
                org.telegram.ui.Cells.y yVar = c2.f28834l;
                float c10 = c2.c();
                RectF rectF = this.F;
                d(rectF, c10);
                if (i3 != 0 && i3 != 2) {
                    if (i3 == 1 || i3 == 3) {
                        if (this.E && i3 == 1) {
                            b();
                        } else if (this.f27409y && i3 == 1) {
                            g(a3Var, new ei.e(6));
                        }
                        this.f27409y = false;
                        this.E = false;
                        yVar.setState(new int[0]);
                    }
                } else {
                    boolean contains = yVar.getBounds().contains((int) (f10 - rectF.left), (int) (f11 - rectF.centerY()));
                    this.f27409y = contains;
                    if (!contains && rectF.contains(f10, f11)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.E = z10;
                    yVar.setState(this.f27409y ? new int[]{16842919, 16842910} : new int[0]);
                }
                for (int i10 = 0; i10 < tabDrawables.size(); i10++) {
                    if (tabDrawables.get(i10) != c2) {
                        tabDrawables.get(i10).f28834l.setState(new int[0]);
                    }
                }
            } else {
                this.E = false;
                this.f27409y = false;
            }
        } else {
            this.E = false;
            this.f27409y = false;
        }
        if (this.E || this.f27409y) {
            return true;
        }
        return false;
    }

    public final a3 k(ii.q4 q4Var) {
        Integer valueOf = Integer.valueOf(this.f27408x);
        HashMap hashMap = L;
        ArrayList arrayList = (ArrayList) hashMap.get(valueOf);
        if (arrayList == null) {
            Integer valueOf2 = Integer.valueOf(this.f27408x);
            ArrayList arrayList2 = new ArrayList();
            hashMap.put(valueOf2, arrayList2);
            arrayList = arrayList2;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            a3 a3Var = (a3) arrayList.get(i3);
            if (q4Var.equals(a3Var.f27351a)) {
                e(a3Var);
                return a3Var;
            }
        }
        return null;
    }

    public final a3 l(zi ziVar) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        if (ziVar == null || (message = ziVar.f26868k) == null || (messageMedia = message.media) == null || (webPage = messageMedia.webpage) == null) {
            return null;
        }
        return m(webPage);
    }

    public final a3 m(TLRPC.WebPage webPage) {
        if (webPage == null) {
            return null;
        }
        ArrayList<a3> tabs = getTabs();
        for (int i3 = 0; i3 < tabs.size(); i3++) {
            a3 a3Var = tabs.get(i3);
            org.telegram.ui.i4 i4Var = a3Var.J;
            if (i4Var != null && !i4Var.f46084e0.isEmpty()) {
                Object h = k2.p1.h(1, a3Var.J.f46084e0);
                if ((h instanceof TLRPC.WebPage) && ((TLRPC.WebPage) h).f27156id == webPage.f27156id) {
                    e(a3Var);
                    return a3Var;
                }
            }
        }
        return null;
    }

    public final void n() {
        CharSequence m10;
        ArrayList<a3> tabs = getTabs();
        ArrayList<y2> tabDrawables = getTabDrawables();
        CharSequence charSequence = null;
        for (int i3 = 0; i3 < tabDrawables.size(); i3++) {
            y2 y2Var = tabDrawables.get(i3);
            if (tabs.size() > 1 && y2Var.f28827c == 0) {
                m10 = org.telegram.messenger.i6.m(bd.G(tabs.size() - 1, "BotMoreTabs", y2Var.f28825a.b()), getTextPaint().getFontMetricsInt(), false, null, 0);
                if (m10 == null) {
                    y2Var.v = null;
                } else {
                    y2Var.v = new ly0(m10, 17.0f, org.telegram.messenger.g0.o());
                }
            } else {
                m10 = org.telegram.messenger.i6.m(y2Var.f28825a.b(), getTextPaint().getFontMetricsInt(), false, null, 0);
                y2Var.v = null;
            }
            charSequence = m10;
        }
        if (tabs.isEmpty()) {
            setImportantForAccessibility(2);
            setContentDescription(bd.a0(null, null, 2131754749, ""));
            return;
        }
        setImportantForAccessibility(1);
        if (charSequence == null) {
            charSequence = "";
        }
        setContentDescription(bd.a0(null, null, 2131754749, charSequence));
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
                ofFloat.addUpdateListener(new gi.j3(this, 15));
                this.G.addListener(new ii.v3(this, 11));
                this.G.setDuration(250L);
                this.G.setInterpolator(h1.f27551w);
                this.G.start();
            } else {
                this.H = this.I;
                invalidate();
            }
            ViewParent parent = getParent();
            if (parent instanceof View) {
                WeakHashMap weakHashMap = r0.i0.f54015a;
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

    public void setCurrentAccount(int i3) {
        if (this.f27408x != i3) {
            this.f27408x = i3;
            o(false);
            invalidate();
        }
    }

    public void setNavigationBarColor(int i3) {
        i(i3, true);
    }

    public void setupTab(y2 y2Var) {
        boolean z10 = false;
        int a10 = this.f27405r.a(this.f27404n, false);
        float d = this.f27407w.d(this.f27406s);
        y2Var.f28844w = 0.0f;
        if (d > 0.5f) {
            z10 = true;
        }
        y2Var.f28835m = a10;
        y2Var.f28837o = z10;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        return true;
    }
}
