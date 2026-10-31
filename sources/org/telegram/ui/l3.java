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
public final class l3 extends FrameLayout {
    public int D;
    public org.telegram.ui.web.w1 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public x2 K;
    public final h4 L;
    public int f39037a;
    public final g3 f39038b;
    public final f4 f39039c;
    public final s4.a0 d;
    public final i3 e;
    public final j3 f39040f;
    public boolean h;
    public boolean f39041n;
    public b3 f39042r;
    public boolean f39043s;
    public boolean f39044w;
    public int f39045x;
    public int f39046y;

    public l3(h4 h4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.L = h4Var;
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        this.f39045x = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        this.f39046y = x02;
        this.D = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        g3 g3Var = new g3(this, activity);
        this.f39038b = g3Var;
        g3Var.setClipToPadding(false);
        g3Var.setPadding(0, org.telegram.messenger.i0.L(56.0f), 0, 0);
        g3Var.setTopGlowOffset(org.telegram.messenger.i0.L(56.0f));
        ((s4.j) g3Var.getItemAnimator()).C = false;
        if (h4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4 f4Var = new f4(h4Var, activity, z10);
        this.f39039c = f4Var;
        g3Var.setAdapter(f4Var);
        s4.a0 a0Var = new s4.a0(1, false);
        this.d = a0Var;
        g3Var.setLayoutManager(a0Var);
        g3Var.setOnScrollListener(new h3(this, 0));
        addView(g3Var, w7.b6.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext());
        this.e = i3Var;
        i3Var.setShouldWaitWebViewScroll(true);
        i3Var.setFullSize(true);
        i3Var.setAllowFullSizeSwipe(true);
        j3 j3Var = new j3(this, getContext(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
        this.f39040f = j3Var;
        j3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final l3 f36901b;

            {
                this.f36901b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h4 h4Var2 = this.f36901b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.i3 O = launchActivity.O();
                            if (O != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                                                if (h3Var.J == h4Var2) {
                                                    z11 = O.h(i11, h3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                            h4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f36901b.f39040f.n(true, false);
                        return;
                    default:
                        l3 l3Var = this.f36901b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f39040f.n(false, false);
                        b3 b3Var = l3Var.f39042r;
                        if (b3Var != null) {
                            b3Var.f35965a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.L.d0();
                        return;
                }
            }
        });
        j3Var.setWebViewProgressListener(new f3(this, 0));
        j3Var.setDelegate(new k3(this));
        j3Var.setWebViewScrollListener(new e(this, 2));
        i3Var.addView(j3Var, w7.b6.c(-1.0f, -1));
        i3Var.setScrollEndListener(new Runnable(this) {
            public final l3 f36901b;

            {
                this.f36901b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h4 h4Var2 = this.f36901b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.i3 O = launchActivity.O();
                            if (O != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                                                if (h3Var.J == h4Var2) {
                                                    z11 = O.h(i11, h3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                            h4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f36901b.f39040f.n(true, false);
                        return;
                    default:
                        l3 l3Var = this.f36901b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f39040f.n(false, false);
                        b3 b3Var = l3Var.f39042r;
                        if (b3Var != null) {
                            b3Var.f35965a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.L.d0();
                        return;
                }
            }
        });
        i3Var.setDelegate(new y0(this, 1));
        i3Var.setScrollListener(new Runnable(this) {
            public final l3 f36901b;

            {
                this.f36901b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h4 h4Var2 = this.f36901b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.i3 O = launchActivity.O();
                            if (O != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.i3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj;
                                                if (h3Var.J == h4Var2) {
                                                    z11 = O.h(i11, h3Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z11) {
                                    return;
                                }
                            }
                            h4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f36901b.f39040f.n(true, false);
                        return;
                    default:
                        l3 l3Var = this.f36901b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f39040f.n(false, false);
                        b3 b3Var = l3Var.f39042r;
                        if (b3Var != null) {
                            b3Var.f35965a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.L.d0();
                        return;
                }
            }
        });
        i3Var.setTopActionBarOffsetY(org.telegram.messenger.i0.L(56.0f) + org.telegram.messenger.i0.f16020m);
        addView(i3Var, w7.b6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(l3 l3Var, boolean z10, int i10) {
        h4 h4Var = l3Var.L;
        u3 u3Var = h4Var.K;
        if (z10) {
            int w9 = org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false), i10);
            l3Var.f39045x = w9;
            if (l3Var == h4Var.f37746u0[0]) {
                if (org.telegram.messenger.tz.f18189v0) {
                    h4Var.f37734h0.d(w9, true);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        } else {
            int w10 = org.telegram.ui.ActionBar.t6.w(-1, i10);
            l3Var.f39046y = w10;
            if (l3Var == h4Var.f37746u0[0]) {
                if (org.telegram.messenger.tz.f18189v0) {
                    h4Var.f37734h0.setMenuColors(w10);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        }
        h4Var.d0();
    }

    public final void b() {
        boolean z10;
        this.f39043s = false;
        this.f39044w = false;
        setWeb(null);
        j3 j3Var = this.f39040f;
        j3Var.h();
        j3Var.f43257a = null;
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        this.f39045x = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.t6.x0(null, i10, false);
        this.f39046y = x02;
        this.D = x02;
        b3 b3Var = this.f39042r;
        if (b3Var != null) {
            if (org.telegram.messenger.i0.B(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var.b(z10, true);
            this.f39042r.setBackgroundColor(this.f39046y);
            b3 b3Var2 = this.f39042r;
            this.f39041n = false;
            org.telegram.messenger.i0.Y3(b3Var2, false, 1.0f, true, false);
        }
        f4 f4Var = this.f39039c;
        f4Var.E = null;
        f4Var.e.clear();
        f4Var.f37168f.clear();
        f4Var.f37171s.clear();
        f4Var.f37172w.clear();
        f4Var.h.clear();
        f4Var.f37170r.clear();
        f4Var.f37169n.clear();
        f4Var.f37174y.clear();
        f4Var.f37173x.clear();
        f4Var.F = null;
        f4Var.f();
        invalidate();
    }

    public final boolean c() {
        if (this.f39037a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        f4 f4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (f4Var = this.f39039c) != null && (webPage = f4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.v0 webView;
        String u10;
        if (!f() || (webView = getWebView()) == null || (u10 = org.telegram.ui.web.z0.u(webView.getUrl())) == null || !org.telegram.ui.web.z0.p(Uri.parse(u10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f39037a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            u3 u3Var = this.L.K;
            int i11 = 0;
            if (u3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (u3Var != null) {
                i11 = org.telegram.messenger.i0.L(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            i3 i3Var = this.e;
            i3Var.setSwipeOffsetY(i3Var.getTopActionBarOffsetY() + (-i3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.tz.f18189v0) {
            return this.f39045x;
        }
        int i10 = org.telegram.ui.ActionBar.t6.Dl;
        this.L.getClass();
        return org.telegram.ui.ActionBar.t6.v0(i10);
    }

    public f4 getAdapter() {
        return this.f39039c;
    }

    public int getBackgroundColor() {
        if (f() && org.telegram.messenger.tz.f18189v0) {
            if (this.f39041n) {
                return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
            }
            return this.f39046y;
        }
        return org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Dl, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            g3 g3Var = this.f39038b;
            float height = g3Var.getHeight();
            for (int i11 = 0; i11 < g3Var.getChildCount(); i11++) {
                View childAt = g3Var.getChildAt(i11);
                if (g3Var.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    g3Var.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f47901f;
                }
                if (i10 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.tk0 getListView() {
        return this.f39038b;
    }

    public float getProgress() {
        org.telegram.ui.web.v0 webView;
        f4 f4Var;
        int i10;
        int B;
        View m10;
        float min;
        u3 u3Var = this.L.K;
        if (c()) {
            float f7 = this.J;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.a0 a0Var = this.d;
            int L0 = a0Var.L0();
            View m11 = a0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f39039c.J;
                g3 g3Var = this.f39038b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = a0Var.N0();
                    if (u3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = a0Var.B() - 2;
                    if (N0 >= B2) {
                        m10 = a0Var.m(B2);
                    } else {
                        m10 = a0Var.m(L0);
                    }
                    if (m10 != null) {
                        float width = getWidth() / (B - 1);
                        float measuredHeight = m10.getMeasuredHeight();
                        if (N0 >= B2) {
                            min = (((B2 - L0) * width) * (g3Var.getMeasuredHeight() - m10.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m10.getTop() - g3Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
                        }
                        return ((L0 * width) + min) / getWidth();
                    }
                } else {
                    int i12 = L0 - 1;
                    if (i12 >= 0 && i12 < iArr.length) {
                        i10 = iArr[i12];
                    } else {
                        i10 = 0;
                    }
                    if (L0 != 0 || u3Var == null) {
                        i11 = -m11.getTop();
                    }
                    return Utilities.l((i10 + i11) / Math.max(1, f4Var.K - g3Var.getHeight()));
                }
            }
        } else if (f() && (webView = this.f39040f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.v0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f39040f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.G, webView.getUrl())) {
            return this.H;
        }
        try {
            String url = webView.getUrl();
            this.G = url;
            Uri parse = Uri.parse(org.telegram.ui.web.z0.u(url));
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
                        String a2 = gf.f.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (m0Var = this.L.f37734h0) != null && vh.p2.g(a2, m0Var.E) > org.telegram.messenger.i0.f16026q.x - org.telegram.messenger.i0.L(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = gf.f.u(parse, null, "", a2, null);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
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
        org.telegram.ui.web.v0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f39039c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f39040f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.z0 getWebContainer() {
        return this.f39040f;
    }

    public org.telegram.ui.web.v0 getWebView() {
        j3 j3Var = this.f39040f;
        if (j3Var != null) {
            return j3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        b3 b3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f39041n && (b3Var = this.f39042r) != null) {
            int i10 = org.telegram.ui.ActionBar.t6.Dl;
            if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.x0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            b3Var.b(z10, false);
            org.telegram.ui.ActionBar.a7.i(i10, this.f39042r, null);
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            this.f39040f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        h4 h4Var = this.L;
        h4Var.d0();
        if (h4Var.f37732f0.f21633f) {
            h4Var.f37733g0.invalidate();
        }
        if (h4Var.f37732f0.e) {
            h4Var.f37733g0.invalidate();
            h4Var.V((int) (((org.telegram.messenger.i0.L(56.0f) - h4Var.f37732f0.h) * (f7 / getMeasuredWidth())) + h4Var.f37732f0.h));
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.A();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f39037a != i10) {
            b();
        }
        this.f39037a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39038b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(x2 x2Var) {
        x2 x2Var2 = this.K;
        if (x2Var2 != x2Var) {
            if (x2Var2 != null) {
                x2Var2.c(this);
            }
            this.K = x2Var;
            if (x2Var != null) {
                org.telegram.ui.web.v0 v0Var = x2Var.f20355b;
                j3 j3Var = this.f39040f;
                if (v0Var != null) {
                    v0Var.onResume();
                    j3Var.N(org.telegram.messenger.d20.f15147s0, x2Var.f20355b, x2Var.d, x2Var.f20373x, false);
                    a(this, true, x2Var.f20367q);
                    a(this, false, x2Var.f20368r);
                } else {
                    String str = x2Var.f20373x;
                    if (str != null) {
                        j3Var.t(org.telegram.messenger.d20.f15147s0, str, false);
                    }
                }
            }
            org.telegram.ui.web.w1 w1Var = this.E;
            if (w1Var != null) {
                w1Var.a();
                org.telegram.ui.web.w1 w1Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = w1Var2.f43233j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.y1.o(tL_webPage);
                    w1Var2.f43233j = null;
                }
                this.E = null;
            }
        }
    }
}
