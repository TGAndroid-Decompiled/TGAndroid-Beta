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
public final class m3 extends FrameLayout {
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public z2 J;
    public final i4 K;
    public int f38577a;
    public final di.v f38578b;
    public final g4 f38579c;
    public final s4.c0 d;
    public final j3 f38580e;
    public final k3 f38581f;
    public boolean h;
    public boolean f38582n;
    public d3 f38583r;
    public boolean f38584s;
    public boolean v;
    public int f38585w;
    public int f38586x;
    public org.telegram.ui.web.h2 f38587y;

    public m3(i4 i4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = i4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f38585w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f38586x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        di.v vVar = new di.v(this, activity);
        this.f38578b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.j) vVar.getItemAnimator()).C = false;
        if (i4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g4 g4Var = new g4(i4Var, activity, z10);
        this.f38579c = g4Var;
        vVar.setAdapter(g4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        vVar.setLayoutManager(c0Var);
        vVar.setOnScrollListener(new i3(this, 0));
        addView(vVar, w7.x5.c(-1.0f, -1));
        j3 j3Var = new j3(this, getContext());
        this.f38580e = j3Var;
        j3Var.setShouldWaitWebViewScroll(true);
        j3Var.setFullSize(true);
        j3Var.setAllowFullSizeSwipe(true);
        k3 k3Var = new k3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
        this.f38581f = k3Var;
        k3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final m3 f36563b;

            {
                this.f36563b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f36563b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var.J == i4Var2) {
                                                    z11 = P.h(i11, n3Var, true);
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
                            i4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f36563b.f38581f.o(true, false);
                        return;
                    default:
                        m3 m3Var = this.f36563b;
                        j3 j3Var2 = m3Var.f38580e;
                        m3Var.f38581f.o(false, false);
                        d3 d3Var = m3Var.f38583r;
                        if (d3Var != null) {
                            d3Var.f35659a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        return;
                }
            }
        });
        k3Var.setWebViewProgressListener(new h3(this, 0));
        k3Var.setDelegate(new l3(this));
        k3Var.setWebViewScrollListener(new g(this, 2));
        j3Var.addView(k3Var, w7.x5.c(-1.0f, -1));
        j3Var.setScrollEndListener(new Runnable(this) {
            public final m3 f36563b;

            {
                this.f36563b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f36563b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var.J == i4Var2) {
                                                    z11 = P.h(i11, n3Var, true);
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
                            i4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f36563b.f38581f.o(true, false);
                        return;
                    default:
                        m3 m3Var = this.f36563b;
                        j3 j3Var2 = m3Var.f38580e;
                        m3Var.f38581f.o(false, false);
                        d3 d3Var = m3Var.f38583r;
                        if (d3Var != null) {
                            d3Var.f35659a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        return;
                }
            }
        });
        j3Var.setDelegate(new z0(this, 1));
        j3Var.setScrollListener(new Runnable(this) {
            public final m3 f36563b;

            {
                this.f36563b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f36563b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var.J == i4Var2) {
                                                    z11 = P.h(i11, n3Var, true);
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
                            i4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f36563b.f38581f.o(true, false);
                        return;
                    default:
                        m3 m3Var = this.f36563b;
                        j3 j3Var2 = m3Var.f38580e;
                        m3Var.f38581f.o(false, false);
                        d3 d3Var = m3Var.f38583r;
                        if (d3Var != null) {
                            d3Var.f35659a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        return;
                }
            }
        });
        j3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(j3Var, w7.x5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(m3 m3Var, boolean z10, int i10) {
        i4 i4Var = m3Var.K;
        v3 v3Var = i4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            m3Var.f38585w = v;
            if (m3Var == i4Var.f37259u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    i4Var.f37247h0.d(v, true);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            m3Var.f38586x = v9;
            if (m3Var == i4Var.f37259u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    i4Var.f37247h0.setMenuColors(v9);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        }
        i4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f38584s = false;
        this.v = false;
        setWeb(null);
        k3 k3Var = this.f38581f;
        k3Var.i();
        k3Var.f42062a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f38585w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f38586x = w02;
        d3 d3Var = this.f38583r;
        if (d3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            d3Var.b(z10, true);
            this.f38583r.setBackgroundColor(this.f38586x);
            d3 d3Var2 = this.f38583r;
            this.f38582n = false;
            AndroidUtilities.updateViewVisibilityAnimated(d3Var2, false, 1.0f, false);
        }
        g4 g4Var = this.f38579c;
        g4Var.E = null;
        g4Var.f36577e.clear();
        g4Var.f36578f.clear();
        g4Var.f36581s.clear();
        g4Var.v.clear();
        g4Var.h.clear();
        g4Var.f36580r.clear();
        g4Var.f36579n.clear();
        g4Var.f36583x.clear();
        g4Var.f36582w.clear();
        g4Var.F = null;
        g4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f38577a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        g4 g4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (g4Var = this.f38579c) != null && (webPage = g4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.z0 webView;
        String v;
        if (!f() || (webView = getWebView()) == null || (v = org.telegram.ui.web.d1.v(webView.getUrl())) == null || !org.telegram.ui.web.d1.q(Uri.parse(v))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f38577a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            v3 v3Var = this.K.K;
            int i11 = 0;
            if (v3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (v3Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            j3 j3Var = this.f38580e;
            j3Var.setSwipeOffsetY(j3Var.getTopActionBarOffsetY() + (-j3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f38585w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public g4 getAdapter() {
        return this.f38579c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f38582n) {
                return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            return this.f38586x;
        }
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            di.v vVar = this.f38578b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f45770f;
                }
                if (i10 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f38580e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.ll0 getListView() {
        return this.f38578b;
    }

    public float getProgress() {
        org.telegram.ui.web.z0 webView;
        g4 g4Var;
        int i10;
        int B;
        View m10;
        float min;
        v3 v3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            View m11 = c0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f38579c.I;
                di.v vVar = this.f38578b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = c0Var.N0();
                    if (v3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = c0Var.B() - 2;
                    if (N0 >= B2) {
                        m10 = c0Var.m(B2);
                    } else {
                        m10 = c0Var.m(L0);
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
                    if (L0 != 0 || v3Var == null) {
                        i11 = -m11.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, g4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f38581f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.z0 webView;
        String uri;
        String[] split;
        k0 k0Var;
        if (!f() || (webView = this.f38581f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.d1.v(url));
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
                        String a2 = of.f.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (k0Var = this.K.f37247h0) != null && di.f4.g(a2, k0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = of.f.v(parse, null, "", a2, null);
                    } catch (Exception e7) {
                        FileLog.e((Throwable) e7, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e10) {
                FileLog.e(e10);
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
            this.G = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.z0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f38579c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f38581f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.d1 getWebContainer() {
        return this.f38581f;
    }

    public org.telegram.ui.web.z0 getWebView() {
        k3 k3Var = this.f38581f;
        if (k3Var != null) {
            return k3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        d3 d3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f38582n && (d3Var = this.f38583r) != null) {
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            d3Var.b(z10, false);
            this.f38583r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f38581f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        i4 i4Var = this.K;
        i4Var.f0();
        if (i4Var.f37245f0.f21596f) {
            i4Var.f37246g0.invalidate();
        }
        if (i4Var.f37245f0.f21595e) {
            i4Var.f37246g0.invalidate();
            i4Var.X((int) (((AndroidUtilities.dp(56.0f) - i4Var.f37245f0.h) * (f7 / getMeasuredWidth())) + i4Var.f37245f0.h));
        }
        v3 v3Var = i4Var.K;
        if (v3Var != null) {
            v3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f38577a != i10) {
            b();
        }
        this.f38577a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f38578b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.f38580e.setVisibility(i12);
    }

    public void setWeb(z2 z2Var) {
        z2 z2Var2 = this.J;
        if (z2Var2 != z2Var) {
            if (z2Var2 != null) {
                z2Var2.c(this);
            }
            this.J = z2Var;
            if (z2Var != null) {
                org.telegram.ui.web.z0 z0Var = z2Var.f21244b;
                k3 k3Var = this.f38581f;
                if (z0Var != null) {
                    z0Var.onResume();
                    k3Var.O(UserConfig.selectedAccount, z2Var.f21244b, z2Var.d, z2Var.f21263x, false);
                    a(this, true, z2Var.f21257q);
                    a(this, false, z2Var.f21258r);
                } else {
                    String str = z2Var.f21263x;
                    if (str != null) {
                        k3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.h2 h2Var = this.f38587y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = this.f38587y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f42136j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f42136j = null;
                }
                this.f38587y = null;
            }
        }
    }
}
