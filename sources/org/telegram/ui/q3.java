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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class q3 extends FrameLayout {
    public boolean A;
    public String B;
    public String C;
    public boolean D;
    public float E;
    public d3 F;
    public final m4 G;
    public int f41512a;
    public final nh.v f41513b;
    public final k4 f41514c;
    public final f2.j0 d;
    public final n3 f41515e;
    public final o3 f41516f;
    public boolean h;
    public boolean f41517n;
    public h3 f41518r;
    public boolean f41519s;
    public boolean v;
    public int f41520w;
    public int f41521x;
    public org.telegram.ui.web.d2 f41522y;

    public q3(m4 m4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.G = m4Var;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.f41520w = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.f41521x = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.A = false;
        this.E = -1.0f;
        new Matrix();
        nh.v vVar = new nh.v(this, activity);
        this.f41513b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) vVar.getItemAnimator()).C = false;
        if (m4Var.G != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k4 k4Var = new k4(m4Var, activity, z10);
        this.f41514c = k4Var;
        vVar.setAdapter(k4Var);
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        vVar.setLayoutManager(j0Var);
        vVar.setOnScrollListener(new m3(this, 0));
        addView(vVar, i7.f6.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext());
        this.f41515e = n3Var;
        n3Var.setShouldWaitWebViewScroll(true);
        n3Var.setFullSize(true);
        n3Var.setAllowFullSizeSwipe(true);
        o3 o3Var = new o3(this, getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false));
        this.f41516f = o3Var;
        o3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final q3 f39739b;

            {
                this.f39739b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m4 m4Var2 = this.f39739b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == m4Var2) {
                                                    z11 = P.h(i11, l3Var, true);
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
                            m4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39739b.f41516f.n(true, false);
                        return;
                    default:
                        q3 q3Var = this.f39739b;
                        n3 n3Var2 = q3Var.f41515e;
                        q3Var.f41516f.n(false, false);
                        h3 h3Var = q3Var.f41518r;
                        if (h3Var != null) {
                            h3Var.f38748a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        return;
                }
            }
        });
        o3Var.setWebViewProgressListener(new l3(this, 0));
        o3Var.setDelegate(new p3(this));
        o3Var.setWebViewScrollListener(new h(this, 2));
        n3Var.addView(o3Var, i7.f6.c(-1.0f, -1));
        n3Var.setScrollEndListener(new Runnable(this) {
            public final q3 f39739b;

            {
                this.f39739b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m4 m4Var2 = this.f39739b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == m4Var2) {
                                                    z11 = P.h(i11, l3Var, true);
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
                            m4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39739b.f41516f.n(true, false);
                        return;
                    default:
                        q3 q3Var = this.f39739b;
                        n3 n3Var2 = q3Var.f41515e;
                        q3Var.f41516f.n(false, false);
                        h3 h3Var = q3Var.f41518r;
                        if (h3Var != null) {
                            h3Var.f38748a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        return;
                }
            }
        });
        n3Var.setDelegate(new c1(this, 1));
        n3Var.setScrollListener(new Runnable(this) {
            public final q3 f39739b;

            {
                this.f39739b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        m4 m4Var2 = this.f39739b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == m4Var2) {
                                                    z11 = P.h(i11, l3Var, true);
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
                            m4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39739b.f41516f.n(true, false);
                        return;
                    default:
                        q3 q3Var = this.f39739b;
                        n3 n3Var2 = q3Var.f41515e;
                        q3Var.f41516f.n(false, false);
                        h3 h3Var = q3Var.f41518r;
                        if (h3Var != null) {
                            h3Var.f38748a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        return;
                }
            }
        });
        n3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(n3Var, i7.f6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(q3 q3Var, boolean z10, int i10) {
        m4 m4Var = q3Var.G;
        z3 z3Var = m4Var.G;
        if (z10) {
            int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false), i10);
            q3Var.f41520w = v;
            if (q3Var == m4Var.f40404q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    m4Var.f40392d0.d(v, true);
                }
                if (z3Var != null) {
                    z3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.g6.v(-1, i10);
            q3Var.f41521x = v10;
            if (q3Var == m4Var.f40404q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    m4Var.f40392d0.setMenuColors(v10);
                }
                if (z3Var != null) {
                    z3Var.i();
                }
            }
        }
        m4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f41519s = false;
        this.v = false;
        setWeb(null);
        o3 o3Var = this.f41516f;
        o3Var.h();
        o3Var.f44260a = null;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.f41520w = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.f41521x = w02;
        h3 h3Var = this.f41518r;
        if (h3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            h3Var.b(z10, true);
            this.f41518r.setBackgroundColor(this.f41521x);
            h3 h3Var2 = this.f41518r;
            this.f41517n = false;
            AndroidUtilities.updateViewVisibilityAnimated(h3Var2, false, 1.0f, false);
        }
        k4 k4Var = this.f41514c;
        k4Var.A = null;
        k4Var.f39741e.clear();
        k4Var.f39742f.clear();
        k4Var.f39745s.clear();
        k4Var.v.clear();
        k4Var.h.clear();
        k4Var.f39744r.clear();
        k4Var.f39743n.clear();
        k4Var.f39747x.clear();
        k4Var.f39746w.clear();
        k4Var.B = null;
        k4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f41512a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        k4 k4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (k4Var = this.f41514c) != null && (webPage = k4Var.A) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.w0 webView;
        String s10;
        if (!f() || (webView = getWebView()) == null || (s10 = org.telegram.ui.web.z0.s(webView.getUrl())) == null || !org.telegram.ui.web.z0.o(Uri.parse(s10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f41512a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            z3 z3Var = this.G.G;
            int i11 = 0;
            if (z3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (z3Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            n3 n3Var = this.f41515e;
            n3Var.setSwipeOffsetY(n3Var.getTopActionBarOffsetY() + (-n3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f41520w;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.G.getClass();
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public k4 getAdapter() {
        return this.f41514c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f41517n) {
                return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            return this.f41521x;
        }
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            nh.v vVar = this.f41513b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f6436f;
                }
                if (i10 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f41515e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.jl0 getListView() {
        return this.f41513b;
    }

    public float getProgress() {
        org.telegram.ui.web.w0 webView;
        k4 k4Var;
        int i10;
        int B;
        View m10;
        float min;
        z3 z3Var = this.G.G;
        if (c()) {
            float f9 = this.E;
            if (f9 >= 0.0f) {
                return f9;
            }
            f2.j0 j0Var = this.d;
            int L0 = j0Var.L0();
            View m11 = j0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f41514c.E;
                nh.v vVar = this.f41513b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = j0Var.N0();
                    if (z3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = j0Var.B() - 2;
                    if (N0 >= B2) {
                        m10 = j0Var.m(B2);
                    } else {
                        m10 = j0Var.m(L0);
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
                    int i12 = L0 - 1;
                    if (i12 >= 0 && i12 < iArr.length) {
                        i10 = iArr[i12];
                    } else {
                        i10 = 0;
                    }
                    if (L0 != 0 || z3Var == null) {
                        i11 = -m11.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, k4Var.F - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f41516f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.w0 webView;
        String uri;
        String[] split;
        o0 o0Var;
        if (!f() || (webView = this.f41516f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.B, webView.getUrl())) {
            return this.C;
        }
        try {
            String url = webView.getUrl();
            this.B = url;
            Uri parse = Uri.parse(org.telegram.ui.web.z0.s(url));
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
                        String a2 = ye.d.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (o0Var = this.G.f40392d0) != null && nh.t3.g(a2, o0Var.A) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = ye.d.v(parse, null, "", a2, null);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e11) {
                FileLog.e(e11);
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
            this.C = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.w0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f41514c.A;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f41516f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.z0 getWebContainer() {
        return this.f41516f;
    }

    public org.telegram.ui.web.w0 getWebView() {
        o3 o3Var = this.f41516f;
        if (o3Var != null) {
            return o3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        h3 h3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f41517n && (h3Var = this.f41518r) != null) {
            int i10 = org.telegram.ui.ActionBar.g6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            h3Var.b(z10, false);
            this.f41518r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            this.f41516f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f9) {
        super.setTranslationX(f9);
        m4 m4Var = this.G;
        m4Var.f0();
        if (m4Var.f40390b0.f24041f) {
            m4Var.f40391c0.invalidate();
        }
        if (m4Var.f40390b0.f24040e) {
            m4Var.f40391c0.invalidate();
            m4Var.X((int) (((AndroidUtilities.dp(56.0f) - m4Var.f40390b0.h) * (f9 / getMeasuredWidth())) + m4Var.f40390b0.h));
        }
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f41512a != i10) {
            b();
        }
        this.f41512a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f41513b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.f41515e.setVisibility(i12);
    }

    public void setWeb(d3 d3Var) {
        d3 d3Var2 = this.F;
        if (d3Var2 != d3Var) {
            if (d3Var2 != null) {
                d3Var2.c(this);
            }
            this.F = d3Var;
            if (d3Var != null) {
                org.telegram.ui.web.w0 w0Var = d3Var.f23642b;
                o3 o3Var = this.f41516f;
                if (w0Var != null) {
                    w0Var.onResume();
                    int i10 = UserConfig.selectedAccount;
                    org.telegram.ui.web.w0 w0Var2 = d3Var.f23642b;
                    Object obj = d3Var.d;
                    o3Var.I = i10;
                    o3Var.Q(w0Var2, obj);
                    if (o3Var.f44275k0) {
                        o3Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, d3Var.f23653o);
                    a(this, false, d3Var.f23654p);
                } else {
                    String str = d3Var.v;
                    if (str != null) {
                        o3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.d2 d2Var = this.f41522y;
            if (d2Var != null) {
                d2Var.a();
                org.telegram.ui.web.d2 d2Var2 = this.f41522y;
                TLRPC.TL_webPage tL_webPage = d2Var2.f44012j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.f2.o(tL_webPage);
                    d2Var2.f44012j = null;
                }
                this.f41522y = null;
            }
        }
    }
}
