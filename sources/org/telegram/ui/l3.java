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
    public int E;
    public org.telegram.ui.web.s1 F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public y2 L;
    public final i4 M;
    public int f47082a;
    public final gi.v f47083b;
    public final g4 f47084c;
    public final u4.b0 d;
    public final i3 f47085e;
    public final j3 f47086f;
    public boolean h;
    public boolean f47087n;
    public c3 f47088r;
    public boolean f47089s;
    public boolean f47090w;
    public int f47091x;
    public int f47092y;

    public l3(i4 i4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.M = i4Var;
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        this.f47091x = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        this.f47092y = x02;
        this.E = x02;
        this.G = false;
        this.K = -1.0f;
        new Matrix();
        gi.v vVar = new gi.v(this, activity);
        this.f47083b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, org.telegram.messenger.g0.L(56.0f), 0, 0);
        vVar.setTopGlowOffset(org.telegram.messenger.g0.L(56.0f));
        ((u4.k) vVar.getItemAnimator()).C = false;
        if (i4Var.L != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g4 g4Var = new g4(i4Var, activity, z10);
        this.f47084c = g4Var;
        vVar.setAdapter(g4Var);
        u4.b0 b0Var = new u4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new h3(this, 0));
        addView(vVar, b8.mf.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext());
        this.f47085e = i3Var;
        i3Var.setShouldWaitWebViewScroll(true);
        i3Var.setFullSize(true);
        i3Var.setAllowFullSizeSwipe(true);
        j3 j3Var = new j3(this, getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
        this.f47086f = j3Var;
        j3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final l3 f45131b;

            {
                this.f45131b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f45131b.M;
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.b3 O = launchActivity.O();
                            if (O != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                                                if (a3Var.J == i4Var2) {
                                                    z11 = O.h(i10, a3Var, true);
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
                            i4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f45131b.f47086f.n(true, false);
                        return;
                    default:
                        l3 l3Var = this.f45131b;
                        i3 i3Var2 = l3Var.f47085e;
                        l3Var.f47086f.n(false, false);
                        c3 c3Var = l3Var.f47088r;
                        if (c3Var != null) {
                            c3Var.f44205a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.M.d0();
                        return;
                }
            }
        });
        j3Var.setWebViewProgressListener(new g3(this, 0));
        j3Var.setDelegate(new k3(this));
        j3Var.setWebViewScrollListener(new f(this, 2));
        i3Var.addView(j3Var, b8.mf.c(-1.0f, -1));
        i3Var.setScrollEndListener(new Runnable(this) {
            public final l3 f45131b;

            {
                this.f45131b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f45131b.M;
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.b3 O = launchActivity.O();
                            if (O != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                                                if (a3Var.J == i4Var2) {
                                                    z11 = O.h(i10, a3Var, true);
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
                            i4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f45131b.f47086f.n(true, false);
                        return;
                    default:
                        l3 l3Var = this.f45131b;
                        i3 i3Var2 = l3Var.f47085e;
                        l3Var.f47086f.n(false, false);
                        c3 c3Var = l3Var.f47088r;
                        if (c3Var != null) {
                            c3Var.f44205a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.M.d0();
                        return;
                }
            }
        });
        i3Var.setDelegate(new x0(this, 1));
        i3Var.setScrollListener(new Runnable(this) {
            public final l3 f45131b;

            {
                this.f45131b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f45131b.M;
                        LaunchActivity launchActivity = LaunchActivity.K1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.b3 O = launchActivity.O();
                            if (O != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.b3.L;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) obj;
                                                if (a3Var.J == i4Var2) {
                                                    z11 = O.h(i10, a3Var, true);
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
                            i4Var2.m(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f45131b.f47086f.n(true, false);
                        return;
                    default:
                        l3 l3Var = this.f45131b;
                        i3 i3Var2 = l3Var.f47085e;
                        l3Var.f47086f.n(false, false);
                        c3 c3Var = l3Var.f47088r;
                        if (c3Var != null) {
                            c3Var.f44205a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.M.d0();
                        return;
                }
            }
        });
        i3Var.setTopActionBarOffsetY(org.telegram.messenger.g0.L(56.0f) + org.telegram.messenger.g0.f22602m);
        addView(i3Var, b8.mf.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(l3 l3Var, boolean z10, int i3) {
        i4 i4Var = l3Var.M;
        u3 u3Var = i4Var.L;
        if (z10) {
            int w10 = org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false), i3);
            l3Var.f47091x = w10;
            if (l3Var == i4Var.f46100v0[0]) {
                if (org.telegram.messenger.az.f21670v0) {
                    i4Var.f46088i0.d(w10, true);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        } else {
            int w11 = org.telegram.ui.ActionBar.k6.w(-1, i3);
            l3Var.f47092y = w11;
            if (l3Var == i4Var.f46100v0[0]) {
                if (org.telegram.messenger.az.f21670v0) {
                    i4Var.f46088i0.setMenuColors(w11);
                }
                if (u3Var != null) {
                    u3Var.u();
                }
            }
        }
        i4Var.d0();
    }

    public final void b() {
        boolean z10;
        this.f47089s = false;
        this.f47090w = false;
        setWeb(null);
        j3 j3Var = this.f47086f;
        j3Var.h();
        j3Var.f51060a = null;
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        this.f47091x = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i3, false);
        this.f47092y = x02;
        this.E = x02;
        c3 c3Var = this.f47088r;
        if (c3Var != null) {
            if (org.telegram.messenger.g0.B(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3Var.b(z10, true);
            this.f47088r.setBackgroundColor(this.f47092y);
            c3 c3Var2 = this.f47088r;
            this.f47087n = false;
            org.telegram.messenger.g0.Z3(c3Var2, false, 1.0f, true, false);
        }
        g4 g4Var = this.f47084c;
        g4Var.F = null;
        g4Var.f45516e.clear();
        g4Var.f45517f.clear();
        g4Var.f45520s.clear();
        g4Var.f45521w.clear();
        g4Var.h.clear();
        g4Var.f45519r.clear();
        g4Var.f45518n.clear();
        g4Var.f45523y.clear();
        g4Var.f45522x.clear();
        g4Var.G = null;
        g4Var.f();
        invalidate();
    }

    public final boolean c() {
        if (this.f47082a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        g4 g4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (g4Var = this.f47084c) != null && (webPage = g4Var.F) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.t0 webView;
        String u10;
        if (!f() || (webView = getWebView()) == null || (u10 = org.telegram.ui.web.w0.u(webView.getUrl())) == null || !org.telegram.ui.web.w0.p(Uri.parse(u10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f47082a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i3;
        if (c()) {
            u3 u3Var = this.M.L;
            int i10 = 0;
            if (u3Var != null) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (u3Var != null) {
                i10 = org.telegram.messenger.g0.L(32.0f);
            }
            this.d.h1(i3, i10);
        } else if (f()) {
            i3 i3Var = this.f47085e;
            i3Var.setSwipeOffsetY(i3Var.getTopActionBarOffsetY() + (-i3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && org.telegram.messenger.az.f21670v0) {
            return this.f47091x;
        }
        int i3 = org.telegram.ui.ActionBar.k6.Dl;
        this.M.getClass();
        return org.telegram.ui.ActionBar.k6.v0(i3);
    }

    public g4 getAdapter() {
        return this.f47084c;
    }

    public int getBackgroundColor() {
        if (f() && org.telegram.messenger.az.f21670v0) {
            if (this.f47087n) {
                return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
            }
            return this.f47092y;
        }
        return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Dl, false);
    }

    public float getListTop() {
        int i3;
        if (c()) {
            gi.v vVar = this.f47083b;
            float height = vVar.getHeight();
            for (int i10 = 0; i10 < vVar.getChildCount(); i10++) {
                View childAt = vVar.getChildAt(i10);
                if (vVar.getLayoutManager() == null) {
                    i3 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i3 = RecyclerView.U(childAt).f55544f;
                }
                if (i3 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f47085e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.tj0 getListView() {
        return this.f47083b;
    }

    public float getProgress() {
        org.telegram.ui.web.t0 webView;
        g4 g4Var;
        int i3;
        int B;
        View m10;
        float min;
        u3 u3Var = this.M.L;
        if (c()) {
            float f10 = this.K;
            if (f10 >= 0.0f) {
                return f10;
            }
            u4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            View m11 = b0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f47084c.K;
                gi.v vVar = this.f47083b;
                int i10 = 0;
                if (iArr == null) {
                    int N0 = b0Var.N0();
                    if (u3Var != null) {
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
                        i3 = iArr[i11];
                    } else {
                        i3 = 0;
                    }
                    if (L0 != 0 || u3Var == null) {
                        i10 = -m11.getTop();
                    }
                    return Utilities.l((i3 + i10) / Math.max(1, g4Var.L - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f47086f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.t0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f47086f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(org.telegram.ui.web.w0.u(url));
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
                        String a10 = sf.c.a(parse.getHost());
                        if (a10.split("\\.").length > 2 && (m0Var = this.M.f46088i0) != null && gi.l3.h(a10, m0Var.F) > org.telegram.messenger.g0.f22608q.x - org.telegram.messenger.g0.L(162.0f)) {
                            a10 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = sf.c.w(parse, null, "", a10, null);
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
        org.telegram.ui.web.t0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f47084c.F;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f47086f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.w0 getWebContainer() {
        return this.f47086f;
    }

    public org.telegram.ui.web.t0 getWebView() {
        j3 j3Var = this.f47086f;
        if (j3Var != null) {
            return j3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        c3 c3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f47087n && (c3Var = this.f47088r) != null) {
            int i3 = org.telegram.ui.ActionBar.k6.Dl;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.x0(null, i3, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3Var.b(z10, false);
            org.telegram.ui.ActionBar.r6.i(i3, this.f47088r, null);
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            this.f47086f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        i4 i4Var = this.M;
        i4Var.d0();
        if (i4Var.f46086g0.f28900f) {
            i4Var.f46087h0.invalidate();
        }
        if (i4Var.f46086g0.f28899e) {
            i4Var.f46087h0.invalidate();
            i4Var.V((int) (((org.telegram.messenger.g0.L(56.0f) - i4Var.f46086g0.h) * (f10 / getMeasuredWidth())) + i4Var.f46086g0.h));
        }
        u3 u3Var = i4Var.L;
        if (u3Var != null) {
            u3Var.A();
        }
    }

    public void setType(int i3) {
        int i10;
        if (this.f47082a != i3) {
            b();
        }
        this.f47082a = i3;
        int i11 = 8;
        if (c()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f47083b.setVisibility(i10);
        if (f()) {
            i11 = 0;
        }
        this.f47085e.setVisibility(i11);
    }

    public void setWeb(y2 y2Var) {
        y2 y2Var2 = this.L;
        if (y2Var2 != y2Var) {
            if (y2Var2 != null) {
                y2Var2.c(this);
            }
            this.L = y2Var;
            if (y2Var != null) {
                org.telegram.ui.web.t0 t0Var = y2Var.f27352b;
                j3 j3Var = this.f47086f;
                if (t0Var != null) {
                    t0Var.onResume();
                    j3Var.N(org.telegram.messenger.h10.f22829t0, y2Var.f27352b, y2Var.d, y2Var.f27371x, false);
                    a(this, true, y2Var.f27365q);
                    a(this, false, y2Var.f27366r);
                } else {
                    String str = y2Var.f27371x;
                    if (str != null) {
                        j3Var.t(org.telegram.messenger.h10.f22829t0, str, false);
                    }
                }
            }
            org.telegram.ui.web.s1 s1Var = this.F;
            if (s1Var != null) {
                s1Var.a();
                org.telegram.ui.web.s1 s1Var2 = this.F;
                TLRPC.TL_webPage tL_webPage = s1Var2.f51014j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.u1.o(tL_webPage);
                    s1Var2.f51014j = null;
                }
                this.F = null;
            }
        }
    }
}
