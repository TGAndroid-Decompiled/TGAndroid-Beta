package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class m extends FrameLayout {
    public int E;
    public bvc F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public zw L;
    public final o M;
    public int a;
    public final hx b;
    public final ey c;
    public final u46 d;
    public final ix e;
    public final l f;
    public boolean h;
    public boolean n;
    public cx r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public m(o oVar, Activity activity) {
        super(activity);
        boolean z;
        this.M = oVar;
        int i = cmb.Fl;
        this.x = cmb.w0(null, i, false);
        int w0 = cmb.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        this.G = false;
        this.K = -1.0f;
        hx hxVar = new hx(this, activity);
        this.b = hxVar;
        hxVar.setClipToPadding(false);
        hxVar.setPadding(0, gm.L(56.0f), 0, 0);
        hxVar.setTopGlowOffset(gm.L(56.0f));
        ((sc3) hxVar.getItemAnimator()).C = false;
        if (oVar.L != null) {
            z = true;
        } else {
            z = false;
        }
        ey eyVar = new ey(oVar, activity, z);
        this.c = eyVar;
        hxVar.setAdapter(eyVar);
        u46 u46Var = new u46(1, false);
        this.d = u46Var;
        hxVar.setLayoutManager(u46Var);
        hxVar.setOnScrollListener(new defpackage.y(this, (byte) 5));
        addView(hxVar, qoe.c(-1.0f, -1));
        ?? d32Var = new d32(getContext());
        this.e = d32Var;
        d32Var.setShouldWaitWebViewScroll(true);
        d32Var.setFullSize(true);
        d32Var.setAllowFullSizeSwipe(true);
        l lVar = new l(this, getContext(), cmb.w0(null, cmb.c6, false));
        this.f = lVar;
        lVar.setOnCloseRequestedListener(new Runnable(this) {
            public final m b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                boolean z2 = false;
                m mVar = this.b;
                switch (b) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            xy0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = xy0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                wy0 wy0Var = (wy0) obj;
                                                if (wy0Var.J == oVar2) {
                                                    z2 = O.h(i2, wy0Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            }
                            oVar2.l(true, true);
                            return;
                        }
                        return;
                    case 1:
                        mVar.f.l(true, false);
                        return;
                    default:
                        ix ixVar = mVar.e;
                        mVar.f.l(false, false);
                        cx cxVar = mVar.r;
                        if (cxVar != null) {
                            cxVar.a.setTranslationY(((ixVar.getTopActionBarOffsetY() + (-ixVar.getOffsetY())) - ixVar.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        return;
                }
            }
        });
        lVar.setWebViewProgressListener(new gx(this, (byte) 0));
        lVar.setDelegate(new jx(this));
        lVar.setWebViewScrollListener(new nl9(this, (byte) 6));
        d32Var.addView(lVar, qoe.c(-1.0f, -1));
        d32Var.setScrollEndListener(new Runnable(this) {
            public final m b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                boolean z2 = false;
                m mVar = this.b;
                switch (b) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            xy0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = xy0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                wy0 wy0Var = (wy0) obj;
                                                if (wy0Var.J == oVar2) {
                                                    z2 = O.h(i2, wy0Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            }
                            oVar2.l(true, true);
                            return;
                        }
                        return;
                    case 1:
                        mVar.f.l(true, false);
                        return;
                    default:
                        ix ixVar = mVar.e;
                        mVar.f.l(false, false);
                        cx cxVar = mVar.r;
                        if (cxVar != null) {
                            cxVar.a.setTranslationY(((ixVar.getTopActionBarOffsetY() + (-ixVar.getOffsetY())) - ixVar.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        return;
                }
            }
        });
        d32Var.setDelegate(new l0(this, (byte) 22));
        d32Var.setScrollListener(new Runnable(this) {
            public final m b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                boolean z2 = false;
                m mVar = this.b;
                switch (b) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            xy0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = xy0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                wy0 wy0Var = (wy0) obj;
                                                if (wy0Var.J == oVar2) {
                                                    z2 = O.h(i2, wy0Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            }
                            oVar2.l(true, true);
                            return;
                        }
                        return;
                    case 1:
                        mVar.f.l(true, false);
                        return;
                    default:
                        ix ixVar = mVar.e;
                        mVar.f.l(false, false);
                        cx cxVar = mVar.r;
                        if (cxVar != null) {
                            cxVar.a.setTranslationY(((ixVar.getTopActionBarOffsetY() + (-ixVar.getOffsetY())) - ixVar.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        return;
                }
            }
        });
        d32Var.setTopActionBarOffsetY(gm.L(56.0f) + gm.m);
        addView((View) d32Var, qoe.c(-1.0f, -1));
        a();
        setType(0);
    }

    public final void a() {
        boolean z;
        this.s = false;
        this.w = false;
        setWeb(null);
        l lVar = this.f;
        lVar.f();
        lVar.a = null;
        int i = cmb.Fl;
        this.x = cmb.w0(null, i, false);
        int w0 = cmb.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        cx cxVar = this.r;
        if (cxVar != null) {
            if (gm.B(w0) <= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            cxVar.b(z, true);
            this.r.setBackgroundColor(this.y);
            cx cxVar2 = this.r;
            this.n = false;
            gm.T3(cxVar2, false, 1.0f, true, false);
        }
        ey eyVar = this.c;
        eyVar.F = null;
        eyVar.e.clear();
        eyVar.f.clear();
        eyVar.s.clear();
        eyVar.w.clear();
        eyVar.h.clear();
        eyVar.r.clear();
        eyVar.n.clear();
        eyVar.y.clear();
        eyVar.x.clear();
        eyVar.G = null;
        eyVar.f();
        invalidate();
    }

    public final boolean b() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        ey eyVar;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!e() && (eyVar = this.c) != null && (webPage = eyVar.F) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        mw0 webView;
        String r;
        if (!e() || (webView = getWebView()) == null || (r = qw0.r(webView.getUrl())) == null || !qw0.n(Uri.parse(r))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i;
        if (b()) {
            sx sxVar = this.M.L;
            int i2 = 0;
            if (sxVar != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (sxVar != null) {
                i2 = gm.L(32.0f);
            }
            this.d.g1(i, i2);
        } else if (e()) {
            ix ixVar = this.e;
            ixVar.setSwipeOffsetY(ixVar.getTopActionBarOffsetY() + (-ixVar.getOffsetY()));
        }
    }

    public final void g(int i, boolean z) {
        o oVar = this.M;
        sx sxVar = oVar.L;
        if (z) {
            int v = cmb.v(cmb.w0(null, cmb.Fl, false), i);
            this.x = v;
            if (this == oVar.v0[0]) {
                if (gda.s0) {
                    oVar.i0.d(v, true);
                }
                if (sxVar != null) {
                    sxVar.u();
                }
            }
        } else {
            int v2 = cmb.v(-1, i);
            this.y = v2;
            if (this == oVar.v0[0]) {
                if (gda.s0) {
                    oVar.i0.setMenuColors(v2);
                }
                if (sxVar != null) {
                    sxVar.u();
                }
            }
        }
        oVar.d0();
    }

    public int getActionBarColor() {
        if (e() && gda.s0) {
            return this.x;
        }
        return cmb.w0(null, cmb.Fl, false);
    }

    public ey getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        if (e() && gda.s0) {
            if (this.n) {
                return cmb.w0(null, cmb.Fl, false);
            }
            return this.y;
        }
        return cmb.w0(null, cmb.Fl, false);
    }

    public float getListTop() {
        int i;
        if (b()) {
            hx hxVar = this.b;
            float height = hxVar.getHeight();
            for (int i2 = 0; i2 < hxVar.getChildCount(); i2++) {
                View childAt = hxVar.getChildAt(i2);
                if (hxVar.getLayoutManager() == null) {
                    i = 0;
                } else {
                    hxVar.getLayoutManager().getClass();
                    i = RecyclerView.U(childAt).f;
                }
                if (i == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (e()) {
            return this.e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public r59 getListView() {
        return this.b;
    }

    public float getProgress() {
        mw0 webView;
        ey eyVar;
        int i;
        int A;
        View m;
        float min;
        sx sxVar = this.M.L;
        if (b()) {
            float f = this.K;
            if (f >= 0.0f) {
                return f;
            }
            u46 u46Var = this.d;
            int K0 = u46Var.K0();
            View m2 = u46Var.m(K0);
            if (m2 != null) {
                int[] iArr = this.c.K;
                hx hxVar = this.b;
                int i2 = 0;
                if (iArr == null) {
                    int M0 = u46Var.M0();
                    if (sxVar != null) {
                        if (K0 < 1) {
                            K0 = 1;
                        }
                        if (M0 < 1) {
                            M0 = 1;
                        }
                    }
                    int A2 = u46Var.A() - 2;
                    if (M0 >= A2) {
                        m = u46Var.m(A2);
                    } else {
                        m = u46Var.m(K0);
                    }
                    if (m != null) {
                        float width = getWidth() / (A - 1);
                        float measuredHeight = m.getMeasuredHeight();
                        if (M0 >= A2) {
                            min = (((A2 - K0) * width) * (hxVar.getMeasuredHeight() - m.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m.getTop() - hxVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
                        }
                        return ((K0 * width) + min) / getWidth();
                    }
                } else {
                    int i3 = K0 - 1;
                    if (i3 >= 0 && i3 < iArr.length) {
                        i = iArr[i3];
                    } else {
                        i = 0;
                    }
                    if (K0 != 0 || sxVar == null) {
                        i2 = -m2.getTop();
                    }
                    return Utilities.l((i + i2) / Math.max(1, eyVar.L - hxVar.getHeight()));
                }
            }
        } else if (e() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        mw0 webView;
        String uri;
        String[] split;
        wu wuVar;
        if (!e() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(qw0.r(url));
            if (parse.getScheme() != null && (parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) {
                uri = parse.getSchemeSpecificPart();
            } else {
                uri = parse.toString();
            }
            try {
                if (!d()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a = l11.a(parse.getHost());
                        if (a.split("\\.").length > 2 && (wuVar = this.M.i0) != null && hg5.h(a, wuVar.F) > gm.q.x - gm.L(162.0f)) {
                            a = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = l11.x(parse, null, "", a, null);
                    } catch (Exception e) {
                        fc4.g(e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e2) {
                fc4.g(e2, true);
            }
            if (uri.startsWith("//")) {
                uri = uri.substring(2);
            }
            if (uri.startsWith("www.")) {
                uri = uri.substring(4);
            }
            if (uri.endsWith("/")) {
                uri = uri.substring(0, uri.length() - 1);
            }
            int indexOf = uri.indexOf("#");
            if (indexOf >= 0) {
                uri = uri.substring(0, indexOf);
            }
            this.I = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        mw0 webView;
        TLRPC.WebPage webPage;
        if (b() && (webPage = this.c.F) != null) {
            String str = webPage.site_name;
            if (str != null) {
                return str;
            }
            String str2 = webPage.title;
            if (str2 != null) {
                return str2;
            }
        }
        if (e() && (webView = this.f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public qw0 getWebContainer() {
        return this.f;
    }

    public mw0 getWebView() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        cx cxVar;
        boolean z;
        super.onAttachedToWindow();
        if (this.n && (cxVar = this.r) != null) {
            int i = cmb.Fl;
            if (gm.B(cmb.w0(null, i, false)) <= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            cxVar.b(z, false);
            anb.h(i, null, this.r);
        }
    }

    public void setLastVisible(boolean z) {
        if (this.J != z) {
            this.J = z;
            this.f.setKeyboardFocusable(z);
        }
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        o oVar = this.M;
        oVar.d0();
        if (oVar.g0.f) {
            oVar.h0.invalidate();
        }
        if (oVar.g0.e) {
            oVar.h0.invalidate();
            oVar.V((int) (((gm.L(56.0f) - oVar.g0.h) * (f / getMeasuredWidth())) + oVar.g0.h));
        }
        sx sxVar = oVar.L;
        if (sxVar != null) {
            sxVar.A();
        }
    }

    public void setType(int i) {
        int i2;
        if (this.a != i) {
            a();
        }
        this.a = i;
        int i3 = 8;
        if (b()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.b.setVisibility(i2);
        if (e()) {
            i3 = 0;
        }
        this.e.setVisibility(i3);
    }

    public void setWeb(zw zwVar) {
        zw zwVar2 = this.L;
        if (zwVar2 != zwVar) {
            if (zwVar2 != null) {
                zwVar2.c(this);
            }
            this.L = zwVar;
            if (zwVar != null) {
                mw0 mw0Var = zwVar.b;
                l lVar = this.f;
                if (mw0Var != null) {
                    mw0Var.onResume();
                    lVar.L(z8c.t0, zwVar.b, zwVar.d, zwVar.x, false);
                    g(zwVar.q, true);
                    g(zwVar.r, false);
                } else {
                    String str = zwVar.x;
                    if (str != null) {
                        lVar.q(z8c.t0, str, false);
                    }
                }
            }
            bvc bvcVar = this.F;
            if (bvcVar != null) {
                bvcVar.a();
                bvc bvcVar2 = this.F;
                TLRPC.TL_webPage tL_webPage = bvcVar2.j;
                if (tL_webPage != null) {
                    dvc.o(tL_webPage);
                    bvcVar2.j = null;
                }
                this.F = null;
            }
        }
    }
}
