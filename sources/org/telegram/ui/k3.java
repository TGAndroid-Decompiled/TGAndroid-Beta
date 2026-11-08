package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Matrix;
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
public final class k3 extends FrameLayout {
    public int D;
    public org.telegram.ui.web.u1 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public x2 K;
    public final g4 L;
    public int f47084a;
    public final fi.v f47085b;
    public final e4 f47086c;
    public final v4.b0 d;
    public final h3 f47087e;
    public final i3 f47088f;
    public boolean h;
    public boolean f47089n;
    public b3 f47090r;
    public boolean f47091s;
    public boolean f47092w;
    public int f47093x;
    public int f47094y;

    public k3(g4 g4Var, Activity activity) {
        super(activity);
        boolean z9;
        this.L = g4Var;
        int i7 = org.telegram.ui.ActionBar.k6.Dl;
        this.f47093x = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        this.f47094y = x02;
        this.D = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        fi.v vVar = new fi.v(this, activity);
        this.f47085b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, org.telegram.messenger.g0.L(56.0f), 0, 0);
        vVar.setTopGlowOffset(org.telegram.messenger.g0.L(56.0f));
        ((v4.k) vVar.getItemAnimator()).C = false;
        if (g4Var.K != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        e4 e4Var = new e4(g4Var, activity, z9);
        this.f47086c = e4Var;
        vVar.setAdapter(e4Var);
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new g3(this, 0));
        addView(vVar, c8.ha.c(-1.0f, -1));
        h3 h3Var = new h3(this, getContext());
        this.f47087e = h3Var;
        h3Var.setShouldWaitWebViewScroll(true);
        h3Var.setFullSize(true);
        h3Var.setAllowFullSizeSwipe(true);
        i3 i3Var = new i3(this, getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27852d6, false));
        this.f47088f = i3Var;
        i3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final k3 f45183b;

            {
                this.f45183b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g4 g4Var2 = this.f45183b.L;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.d3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                                                if (c3Var.J == g4Var2) {
                                                    z10 = O.h(i10, c3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            g4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f45183b.f47088f.n(true, false);
                        return;
                    default:
                        k3 k3Var = this.f45183b;
                        h3 h3Var2 = k3Var.f47087e;
                        k3Var.f47088f.n(false, false);
                        b3 b3Var = k3Var.f47090r;
                        if (b3Var != null) {
                            b3Var.f44167a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.L.d0();
                        return;
                }
            }
        });
        i3Var.setWebViewProgressListener(new f3(this, 0));
        i3Var.setDelegate(new j3(this));
        i3Var.setWebViewScrollListener(new f(this, 2));
        h3Var.addView(i3Var, c8.ha.c(-1.0f, -1));
        h3Var.setScrollEndListener(new Runnable(this) {
            public final k3 f45183b;

            {
                this.f45183b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g4 g4Var2 = this.f45183b.L;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.d3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                                                if (c3Var.J == g4Var2) {
                                                    z10 = O.h(i10, c3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            g4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f45183b.f47088f.n(true, false);
                        return;
                    default:
                        k3 k3Var = this.f45183b;
                        h3 h3Var2 = k3Var.f47087e;
                        k3Var.f47088f.n(false, false);
                        b3 b3Var = k3Var.f47090r;
                        if (b3Var != null) {
                            b3Var.f44167a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.L.d0();
                        return;
                }
            }
        });
        h3Var.setDelegate(new w0(this, 1));
        h3Var.setScrollListener(new Runnable(this) {
            public final k3 f45183b;

            {
                this.f45183b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g4 g4Var2 = this.f45183b.L;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.d3 O = launchActivity.O();
                            if (O != null) {
                                boolean z10 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.d3.K;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) obj;
                                                if (c3Var.J == g4Var2) {
                                                    z10 = O.h(i10, c3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i10++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            g4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f45183b.f47088f.n(true, false);
                        return;
                    default:
                        k3 k3Var = this.f45183b;
                        h3 h3Var2 = k3Var.f47087e;
                        k3Var.f47088f.n(false, false);
                        b3 b3Var = k3Var.f47090r;
                        if (b3Var != null) {
                            b3Var.f44167a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.L.d0();
                        return;
                }
            }
        });
        h3Var.setTopActionBarOffsetY(org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22557m);
        addView(h3Var, c8.ha.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(k3 k3Var, boolean z9, int i7) {
        g4 g4Var = k3Var.L;
        t3 t3Var = g4Var.K;
        if (z9) {
            int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false), i7);
            k3Var.f47093x = w10;
            if (k3Var == g4Var.f45819u0[0]) {
                if (org.telegram.messenger.iz.f23443v0) {
                    g4Var.f45807h0.d(w10, true);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        } else {
            int w11 = org.telegram.ui.ActionBar.k6.w(-1, i7);
            k3Var.f47094y = w11;
            if (k3Var == g4Var.f45819u0[0]) {
                if (org.telegram.messenger.iz.f23443v0) {
                    g4Var.f45807h0.setMenuColors(w11);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        }
        g4Var.d0();
    }

    public final void b() {
        boolean z9;
        this.f47091s = false;
        this.f47092w = false;
        setWeb(null);
        i3 i3Var = this.f47088f;
        i3Var.h();
        i3Var.f51360a = null;
        int i7 = org.telegram.ui.ActionBar.k6.Dl;
        this.f47093x = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i7, false);
        this.f47094y = x02;
        this.D = x02;
        b3 b3Var = this.f47090r;
        if (b3Var != null) {
            if (org.telegram.messenger.g0.B(x02) <= 0.721f) {
                z9 = true;
            } else {
                z9 = false;
            }
            b3Var.b(z9, true);
            this.f47090r.setBackgroundColor(this.f47094y);
            b3 b3Var2 = this.f47090r;
            this.f47089n = false;
            org.telegram.messenger.g0.Z3(b3Var2, false, 1.0f, true, false);
        }
        e4 e4Var = this.f47086c;
        e4Var.E = null;
        e4Var.f45186e.clear();
        e4Var.f45187f.clear();
        e4Var.f45190s.clear();
        e4Var.f45191w.clear();
        e4Var.h.clear();
        e4Var.f45189r.clear();
        e4Var.f45188n.clear();
        e4Var.f45193y.clear();
        e4Var.f45192x.clear();
        e4Var.F = null;
        e4Var.f();
        invalidate();
    }

    public final boolean c() {
        if (this.f47084a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        e4 e4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (e4Var = this.f47086c) != null && (webPage = e4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.u0 webView;
        String u10;
        if (!f() || (webView = getWebView()) == null || (u10 = org.telegram.ui.web.x0.u(webView.getUrl())) == null || !org.telegram.ui.web.x0.p(Uri.parse(u10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f47084a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i7;
        if (c()) {
            t3 t3Var = this.L.K;
            int i10 = 0;
            if (t3Var != null) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (t3Var != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            }
            this.d.h1(i7, i10);
        } else if (f()) {
            h3 h3Var = this.f47087e;
            h3Var.setSwipeOffsetY(h3Var.getTopActionBarOffsetY() + (-h3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.iz.f23443v0) {
            return this.f47093x;
        }
        int i7 = org.telegram.ui.ActionBar.k6.Dl;
        this.L.getClass();
        return org.telegram.ui.ActionBar.k6.v0(i7);
    }

    public e4 getAdapter() {
        return this.f47086c;
    }

    public int getBackgroundColor() {
        if (f() && org.telegram.messenger.iz.f23443v0) {
            if (this.f47089n) {
                return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            }
            return this.f47094y;
        }
        return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
    }

    public float getListTop() {
        int i7;
        if (c()) {
            fi.v vVar = this.f47085b;
            float height = vVar.getHeight();
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (vVar.getLayoutManager() == null) {
                    i7 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i7 = RecyclerView.U(childAt).f57048f;
                }
                if (i7 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f47087e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.pj0 getListView() {
        return this.f47085b;
    }

    public float getProgress() {
        org.telegram.ui.web.u0 webView;
        e4 e4Var;
        int i7;
        int B;
        View m10;
        float min;
        t3 t3Var = this.L.K;
        if (c()) {
            float f10 = this.J;
            if (f10 >= 0.0f) {
                return f10;
            }
            v4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            View m11 = b0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f47086c.J;
                fi.v vVar = this.f47085b;
                int i10 = 0;
                if (iArr == null) {
                    int N0 = b0Var.N0();
                    if (t3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = b0Var.B() - 2;
                    if (N0 >= B2) {
                        m10 = b0Var.m(B2);
                    } else {
                        m10 = b0Var.m(L0);
                    }
                    if (m10 != null) {
                        float width = getWidth() / (B - 1);
                        float measuredHeight = m10.getMeasuredHeight();
                        if (N0 >= B2) {
                            min = (((B2 - L0) * width) * (vVar.getMeasuredHeight() - m10.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m10.getTop() - vVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
                        }
                        return ((L0 * width) + min) / getWidth();
                    }
                } else {
                    int i11 = L0 - 1;
                    if (i11 >= 0 && i11 < iArr.length) {
                        i7 = iArr[i11];
                    } else {
                        i7 = 0;
                    }
                    if (L0 != 0 || t3Var == null) {
                        i10 = -m11.getTop();
                    }
                    return Utilities.l((i7 + i10) / Math.max(1, e4Var.K - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f47088f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.u0 webView;
        String uri;
        String[] split;
        l0 l0Var;
        if (!f() || (webView = this.f47088f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.G, webView.getUrl())) {
            return this.H;
        }
        try {
            String url = webView.getUrl();
            this.G = url;
            Uri parse = Uri.parse(org.telegram.ui.web.x0.u(url));
            if (parse.getScheme() != null && (parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) {
                uri = parse.getSchemeSpecificPart();
            } else {
                uri = parse.toString();
            }
            try {
                if (!e()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a10 = vf.c.a(parse.getHost());
                        if (a10.split("\\.").length > 2 && (l0Var = this.L.f45807h0) != null && fi.m3.h(a10, l0Var.E) > org.telegram.messenger.g0.f22563q.x - org.telegram.messenger.g0.L(162.0f)) {
                            a10 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = vf.c.w(parse, null, "", a10, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
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
            this.H = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.u0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f47086c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f47088f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.x0 getWebContainer() {
        return this.f47088f;
    }

    public org.telegram.ui.web.u0 getWebView() {
        i3 i3Var = this.f47088f;
        if (i3Var != null) {
            return i3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        b3 b3Var;
        boolean z9;
        super.onAttachedToWindow();
        if (this.f47089n && (b3Var = this.f47090r) != null) {
            int i7 = org.telegram.ui.ActionBar.k6.Dl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i7, false)) <= 0.721f) {
                z9 = true;
            } else {
                z9 = false;
            }
            b3Var.b(z9, false);
            org.telegram.ui.ActionBar.r6.i(i7, this.f47090r, null);
        }
    }

    public void setLastVisible(boolean z9) {
        if (this.I != z9) {
            this.I = z9;
            this.f47088f.setKeyboardFocusable(z9);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        g4 g4Var = this.L;
        g4Var.d0();
        if (g4Var.f45805f0.f28843f) {
            g4Var.f45806g0.invalidate();
        }
        if (g4Var.f45805f0.f28842e) {
            g4Var.f45806g0.invalidate();
            g4Var.V((int) (((org.telegram.messenger.g0.L(56.0f) - g4Var.f45805f0.h) * (f10 / getMeasuredWidth())) + g4Var.f45805f0.h));
        }
        t3 t3Var = g4Var.K;
        if (t3Var != null) {
            t3Var.A();
        }
    }

    public void setType(int i7) {
        int i10;
        if (this.f47084a != i7) {
            b();
        }
        this.f47084a = i7;
        int i11 = 8;
        if (c()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f47085b.setVisibility(i10);
        if (f()) {
            i11 = 0;
        }
        this.f47087e.setVisibility(i11);
    }

    public void setWeb(x2 x2Var) {
        x2 x2Var2 = this.K;
        if (x2Var2 != x2Var) {
            if (x2Var2 != null) {
                x2Var2.c(this);
            }
            this.K = x2Var;
            if (x2Var != null) {
                org.telegram.ui.web.u0 u0Var = x2Var.f27375b;
                i3 i3Var = this.f47088f;
                if (u0Var != null) {
                    u0Var.onResume();
                    i3Var.O(org.telegram.messenger.p10.f24470s0, x2Var.f27375b, x2Var.d, x2Var.f27394x, false);
                    a(this, true, x2Var.f27388q);
                    a(this, false, x2Var.f27389r);
                } else {
                    String str = x2Var.f27394x;
                    if (str != null) {
                        i3Var.t(org.telegram.messenger.p10.f24470s0, str, false);
                    }
                }
            }
            org.telegram.ui.web.u1 u1Var = this.E;
            if (u1Var != null) {
                u1Var.a();
                org.telegram.ui.web.u1 u1Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = u1Var2.f51333j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.w1.o(tL_webPage);
                    u1Var2.f51333j = null;
                }
                this.E = null;
            }
        }
    }
}
