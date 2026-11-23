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
    public int E;
    public org.telegram.ui.web.t1 F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public x2 L;
    public final g4 M;
    public int f49135a;
    public final hi.v f49136b;
    public final e4 f49137c;
    public final v4.b0 d;
    public final h3 f49138e;
    public final i3 f49139f;
    public boolean h;
    public boolean f49140n;
    public b3 f49141r;
    public boolean f49142s;
    public boolean f49143w;
    public int f49144x;
    public int f49145y;

    public k3(g4 g4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.M = g4Var;
        int i7 = org.telegram.ui.ActionBar.m6.Gl;
        this.f49144x = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        this.f49145y = x02;
        this.E = x02;
        this.G = false;
        this.K = -1.0f;
        new Matrix();
        hi.v vVar = new hi.v(this, activity);
        this.f49136b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, org.telegram.messenger.g0.L(56.0f), 0, 0);
        vVar.setTopGlowOffset(org.telegram.messenger.g0.L(56.0f));
        ((v4.k) vVar.getItemAnimator()).C = false;
        if (g4Var.L != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        e4 e4Var = new e4(g4Var, activity, z10);
        this.f49137c = e4Var;
        vVar.setAdapter(e4Var);
        v4.b0 b0Var = new v4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new g3(this, 0));
        addView(vVar, c8.na.c(-1.0f, -1));
        h3 h3Var = new h3(this, getContext());
        this.f49138e = h3Var;
        h3Var.setShouldWaitWebViewScroll(true);
        h3Var.setFullSize(true);
        h3Var.setAllowFullSizeSwipe(true);
        i3 i3Var = new i3(this, getContext(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29347d6, false));
        this.f49139f = i3Var;
        i3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final k3 f47085b;

            {
                this.f47085b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g4 g4Var2 = this.f47085b.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.f3 N = launchActivity.N();
                            if (N != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                                                if (e3Var.J == g4Var2) {
                                                    z11 = N.h(i10, e3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i10++;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                            g4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f47085b.f49139f.n(true, false);
                        return;
                    default:
                        k3 k3Var = this.f47085b;
                        h3 h3Var2 = k3Var.f49138e;
                        k3Var.f49139f.n(false, false);
                        b3 b3Var = k3Var.f49141r;
                        if (b3Var != null) {
                            b3Var.f45712a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.M.d0();
                        return;
                }
            }
        });
        i3Var.setWebViewProgressListener(new f3(this, 0));
        i3Var.setDelegate(new j3(this));
        i3Var.setWebViewScrollListener(new f(this, 2));
        h3Var.addView(i3Var, c8.na.c(-1.0f, -1));
        h3Var.setScrollEndListener(new Runnable(this) {
            public final k3 f47085b;

            {
                this.f47085b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g4 g4Var2 = this.f47085b.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.f3 N = launchActivity.N();
                            if (N != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                                                if (e3Var.J == g4Var2) {
                                                    z11 = N.h(i10, e3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i10++;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                            g4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f47085b.f49139f.n(true, false);
                        return;
                    default:
                        k3 k3Var = this.f47085b;
                        h3 h3Var2 = k3Var.f49138e;
                        k3Var.f49139f.n(false, false);
                        b3 b3Var = k3Var.f49141r;
                        if (b3Var != null) {
                            b3Var.f45712a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.M.d0();
                        return;
                }
            }
        });
        h3Var.setDelegate(new w0(this, 1));
        h3Var.setScrollListener(new Runnable(this) {
            public final k3 f47085b;

            {
                this.f47085b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        g4 g4Var2 = this.f47085b.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.f3 N = launchActivity.N();
                            if (N != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.f3.L;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                                                if (e3Var.J == g4Var2) {
                                                    z11 = N.h(i10, e3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i10++;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                            g4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f47085b.f49139f.n(true, false);
                        return;
                    default:
                        k3 k3Var = this.f47085b;
                        h3 h3Var2 = k3Var.f49138e;
                        k3Var.f49139f.n(false, false);
                        b3 b3Var = k3Var.f49141r;
                        if (b3Var != null) {
                            b3Var.f45712a.setTranslationY(((h3Var2.getTopActionBarOffsetY() + (-h3Var2.getOffsetY())) - h3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        k3Var.M.d0();
                        return;
                }
            }
        });
        h3Var.setTopActionBarOffsetY(org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f24004m);
        addView(h3Var, c8.na.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(k3 k3Var, boolean z10, int i7) {
        g4 g4Var = k3Var.M;
        t3 t3Var = g4Var.L;
        if (z10) {
            int w10 = org.telegram.ui.ActionBar.m6.w(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false), i7);
            k3Var.f49144x = w10;
            if (k3Var == g4Var.f47920v0[0]) {
                if (org.telegram.messenger.cz.f23412v0) {
                    g4Var.f47908i0.d(w10, true);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        } else {
            int w11 = org.telegram.ui.ActionBar.m6.w(-1, i7);
            k3Var.f49145y = w11;
            if (k3Var == g4Var.f47920v0[0]) {
                if (org.telegram.messenger.cz.f23412v0) {
                    g4Var.f47908i0.setMenuColors(w11);
                }
                if (t3Var != null) {
                    t3Var.u();
                }
            }
        }
        g4Var.d0();
    }

    public final void b() {
        boolean z10;
        this.f49142s = false;
        this.f49143w = false;
        setWeb(null);
        i3 i3Var = this.f49139f;
        i3Var.h();
        i3Var.f53305a = null;
        int i7 = org.telegram.ui.ActionBar.m6.Gl;
        this.f49144x = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        int x02 = org.telegram.ui.ActionBar.m6.x0(null, i7, false);
        this.f49145y = x02;
        this.E = x02;
        b3 b3Var = this.f49141r;
        if (b3Var != null) {
            if (org.telegram.messenger.g0.B(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var.b(z10, true);
            this.f49141r.setBackgroundColor(this.f49145y);
            b3 b3Var2 = this.f49141r;
            this.f49140n = false;
            org.telegram.messenger.g0.X3(b3Var2, false, 1.0f, true, false);
        }
        e4 e4Var = this.f49137c;
        e4Var.F = null;
        e4Var.f47091e.clear();
        e4Var.f47092f.clear();
        e4Var.f47095s.clear();
        e4Var.f47096w.clear();
        e4Var.h.clear();
        e4Var.f47094r.clear();
        e4Var.f47093n.clear();
        e4Var.f47098y.clear();
        e4Var.f47097x.clear();
        e4Var.G = null;
        e4Var.f();
        invalidate();
    }

    public final boolean c() {
        if (this.f49135a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        e4 e4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (e4Var = this.f49137c) != null && (webPage = e4Var.F) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.s0 webView;
        String u10;
        if (!f() || (webView = getWebView()) == null || (u10 = org.telegram.ui.web.v0.u(webView.getUrl())) == null || !org.telegram.ui.web.v0.p(Uri.parse(u10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f49135a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i7;
        if (c()) {
            t3 t3Var = this.M.L;
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
            h3 h3Var = this.f49138e;
            h3Var.setSwipeOffsetY(h3Var.getTopActionBarOffsetY() + (-h3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.cz.f23412v0) {
            return this.f49144x;
        }
        int i7 = org.telegram.ui.ActionBar.m6.Gl;
        this.M.getClass();
        return org.telegram.ui.ActionBar.m6.v0(i7);
    }

    public e4 getAdapter() {
        return this.f49137c;
    }

    public int getBackgroundColor() {
        if (f() && org.telegram.messenger.cz.f23412v0) {
            if (this.f49140n) {
                return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
            }
            return this.f49145y;
        }
        return org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Gl, false);
    }

    public float getListTop() {
        int i7;
        if (c()) {
            hi.v vVar = this.f49136b;
            float height = vVar.getHeight();
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (vVar.getLayoutManager() == null) {
                    i7 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i7 = RecyclerView.U(childAt).f59115f;
                }
                if (i7 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f49138e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.ek0 getListView() {
        return this.f49136b;
    }

    public float getProgress() {
        org.telegram.ui.web.s0 webView;
        e4 e4Var;
        int i7;
        int B;
        View m10;
        float min;
        t3 t3Var = this.M.L;
        if (c()) {
            float f10 = this.K;
            if (f10 >= 0.0f) {
                return f10;
            }
            v4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            View m11 = b0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f49137c.K;
                hi.v vVar = this.f49136b;
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
                    return Utilities.l((i7 + i10) / Math.max(1, e4Var.L - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f49139f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.s0 webView;
        String uri;
        String[] split;
        l0 l0Var;
        if (!f() || (webView = this.f49139f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(org.telegram.ui.web.v0.u(url));
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
                        if (a10.split("\\.").length > 2 && (l0Var = this.M.f47908i0) != null && hi.l3.h(a10, l0Var.F) > org.telegram.messenger.g0.f24010q.x - org.telegram.messenger.g0.L(162.0f)) {
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
            this.I = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.s0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f49137c.F;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f49139f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.v0 getWebContainer() {
        return this.f49139f;
    }

    public org.telegram.ui.web.s0 getWebView() {
        i3 i3Var = this.f49139f;
        if (i3Var != null) {
            return i3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        b3 b3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f49140n && (b3Var = this.f49141r) != null) {
            int i7 = org.telegram.ui.ActionBar.m6.Gl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.x0(null, i7, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var.b(z10, false);
            org.telegram.ui.ActionBar.t6.h(i7, this.f49141r, null);
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            this.f49139f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        g4 g4Var = this.M;
        g4Var.d0();
        if (g4Var.f47906g0.f30328f) {
            g4Var.f47907h0.invalidate();
        }
        if (g4Var.f47906g0.f30327e) {
            g4Var.f47907h0.invalidate();
            g4Var.V((int) (((org.telegram.messenger.g0.L(56.0f) - g4Var.f47906g0.h) * (f10 / getMeasuredWidth())) + g4Var.f47906g0.h));
        }
        t3 t3Var = g4Var.L;
        if (t3Var != null) {
            t3Var.A();
        }
    }

    public void setType(int i7) {
        int i10;
        if (this.f49135a != i7) {
            b();
        }
        this.f49135a = i7;
        int i11 = 8;
        if (c()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f49136b.setVisibility(i10);
        if (f()) {
            i11 = 0;
        }
        this.f49138e.setVisibility(i11);
    }

    public void setWeb(x2 x2Var) {
        x2 x2Var2 = this.L;
        if (x2Var2 != x2Var) {
            if (x2Var2 != null) {
                x2Var2.c(this);
            }
            this.L = x2Var;
            if (x2Var != null) {
                org.telegram.ui.web.s0 s0Var = x2Var.f28876b;
                i3 i3Var = this.f49139f;
                if (s0Var != null) {
                    s0Var.onResume();
                    i3Var.O(org.telegram.messenger.k10.f24932t0, x2Var.f28876b, x2Var.d, x2Var.f28895x, false);
                    a(this, true, x2Var.f28889q);
                    a(this, false, x2Var.f28890r);
                } else {
                    String str = x2Var.f28895x;
                    if (str != null) {
                        i3Var.t(org.telegram.messenger.k10.f24932t0, str, false);
                    }
                }
            }
            org.telegram.ui.web.t1 t1Var = this.F;
            if (t1Var != null) {
                t1Var.a();
                org.telegram.ui.web.t1 t1Var2 = this.F;
                TLRPC.TL_webPage tL_webPage = t1Var2.f53288j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.v1.o(tL_webPage);
                    t1Var2.f53288j = null;
                }
                this.F = null;
            }
        }
    }
}
