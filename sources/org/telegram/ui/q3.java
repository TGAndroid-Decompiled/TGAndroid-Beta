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

    public int f41495a;

    public final lh.w f41496b;

    public final k4 f41497c;
    public final f2.k0 d;

    public final n3 f41498e;

    public final o3 f41499f;
    public boolean h;

    public boolean f41500n;

    public h3 f41501r;

    public boolean f41502s;
    public boolean v;

    public int f41503w;

    public int f41504x;

    public org.telegram.ui.web.c2 f41505y;

    public q3(m4 m4Var, Activity activity) {
        super(activity);
        this.G = m4Var;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.f41503w = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.f41504x = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.A = false;
        this.E = -1.0f;
        new Matrix();
        lh.w wVar = new lh.w(this, activity);
        this.f41496b = wVar;
        wVar.setClipToPadding(false);
        wVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        wVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) wVar.getItemAnimator()).C = false;
        k4 k4Var = new k4(m4Var, activity, m4Var.G != null);
        this.f41497c = k4Var;
        wVar.setAdapter(k4Var);
        f2.k0 k0Var = new f2.k0(1, false);
        this.d = k0Var;
        wVar.setLayoutManager(k0Var);
        wVar.setOnScrollListener(new m3(this, 0));
        addView(wVar, h7.z5.c(-1.0f, -1));
        n3 n3Var = new n3(this, getContext());
        this.f41498e = n3Var;
        n3Var.setShouldWaitWebViewScroll(true);
        n3Var.setFullSize(true);
        n3Var.setAllowFullSizeSwipe(true);
        o3 o3Var = new o3(this, getContext(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false));
        this.f41499f = o3Var;
        final int i11 = 0;
        o3Var.setOnCloseRequestedListener(new Runnable(this) {

            public final q3 f39587b;

            {
                this.f39587b = this;
            }

            @Override
            public final void run() {
                switch (i11) {
                    case 0:
                        m4 m4Var2 = this.f39587b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 m3VarP = launchActivity.P();
                            if (m3VarP != null) {
                                boolean zH = false;
                                int i12 = 0;
                                while (true) {
                                    HashMap map = org.telegram.ui.ActionBar.m3.G;
                                    if (i12 < map.size()) {
                                        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i12));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < size) {
                                                    Object obj = arrayList.get(i13);
                                                    i13++;
                                                    org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                    if (l3Var.H == m4Var2) {
                                                        zH = m3VarP.h(i12, l3Var, true);
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        i12++;
                                    }
                                }
                                if (zH) {
                                }
                            }
                            m4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.f39587b.f41499f.n(true, false);
                        break;
                    default:
                        q3 q3Var = this.f39587b;
                        n3 n3Var2 = q3Var.f41498e;
                        q3Var.f41499f.n(false, false);
                        h3 h3Var = q3Var.f41501r;
                        if (h3Var != null) {
                            h3Var.f38667a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        break;
                }
            }
        });
        o3Var.setWebViewProgressListener(new l3(this, i11));
        o3Var.setDelegate(new p3(this));
        o3Var.setWebViewScrollListener(new g(this, 2));
        n3Var.addView(o3Var, h7.z5.c(-1.0f, -1));
        final int i12 = 1;
        n3Var.setScrollEndListener(new Runnable(this) {

            public final q3 f39587b;

            {
                this.f39587b = this;
            }

            @Override
            public final void run() {
                switch (i12) {
                    case 0:
                        m4 m4Var2 = this.f39587b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 m3VarP = launchActivity.P();
                            if (m3VarP != null) {
                                boolean zH = false;
                                int i13 = 0;
                                while (true) {
                                    HashMap map = org.telegram.ui.ActionBar.m3.G;
                                    if (i13 < map.size()) {
                                        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i13));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i14 = 0;
                                            while (true) {
                                                if (i14 < size) {
                                                    Object obj = arrayList.get(i14);
                                                    i14++;
                                                    org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                    if (l3Var.H == m4Var2) {
                                                        zH = m3VarP.h(i13, l3Var, true);
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        i13++;
                                    }
                                }
                                if (zH) {
                                }
                            }
                            m4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.f39587b.f41499f.n(true, false);
                        break;
                    default:
                        q3 q3Var = this.f39587b;
                        n3 n3Var2 = q3Var.f41498e;
                        q3Var.f41499f.n(false, false);
                        h3 h3Var = q3Var.f41501r;
                        if (h3Var != null) {
                            h3Var.f38667a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        break;
                }
            }
        });
        n3Var.setDelegate(new c1(this, i12));
        final int i13 = 2;
        n3Var.setScrollListener(new Runnable(this) {

            public final q3 f39587b;

            {
                this.f39587b = this;
            }

            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        m4 m4Var2 = this.f39587b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 m3VarP = launchActivity.P();
                            if (m3VarP != null) {
                                boolean zH = false;
                                int i14 = 0;
                                while (true) {
                                    HashMap map = org.telegram.ui.ActionBar.m3.G;
                                    if (i14 < map.size()) {
                                        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(i14));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i15 = 0;
                                            while (true) {
                                                if (i15 < size) {
                                                    Object obj = arrayList.get(i15);
                                                    i15++;
                                                    org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                    if (l3Var.H == m4Var2) {
                                                        zH = m3VarP.h(i14, l3Var, true);
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                        i14++;
                                    }
                                }
                                if (zH) {
                                }
                            }
                            m4Var2.o(true, true);
                            break;
                        }
                        break;
                    case 1:
                        this.f39587b.f41499f.n(true, false);
                        break;
                    default:
                        q3 q3Var = this.f39587b;
                        n3 n3Var2 = q3Var.f41498e;
                        q3Var.f41499f.n(false, false);
                        h3 h3Var = q3Var.f41501r;
                        if (h3Var != null) {
                            h3Var.f38667a.setTranslationY(((n3Var2.getTopActionBarOffsetY() + (-n3Var2.getOffsetY())) - n3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        q3Var.G.f0();
                        break;
                }
            }
        });
        n3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(n3Var, h7.z5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(q3 q3Var, boolean z10, int i10) {
        m4 m4Var = q3Var.G;
        z3 z3Var = m4Var.G;
        if (z10) {
            int iV = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false), i10);
            q3Var.f41503w = iV;
            if (q3Var == m4Var.f40347q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    m4Var.f40335d0.d(iV, true);
                }
                if (z3Var != null) {
                    z3Var.i();
                }
            }
        } else {
            int iV2 = org.telegram.ui.ActionBar.g6.v(-1, i10);
            q3Var.f41504x = iV2;
            if (q3Var == m4Var.f40347q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    m4Var.f40335d0.setMenuColors(iV2);
                }
                if (z3Var != null) {
                    z3Var.i();
                }
            }
        }
        m4Var.f0();
    }

    public final void b() {
        this.f41502s = false;
        this.v = false;
        setWeb(null);
        o3 o3Var = this.f41499f;
        o3Var.h();
        o3Var.f44057a = null;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.f41503w = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        this.f41504x = iW0;
        h3 h3Var = this.f41501r;
        if (h3Var != null) {
            h3Var.b(AndroidUtilities.computePerceivedBrightness(iW0) <= 0.721f, true);
            this.f41501r.setBackgroundColor(this.f41504x);
            h3 h3Var2 = this.f41501r;
            this.f41500n = false;
            AndroidUtilities.updateViewVisibilityAnimated(h3Var2, false, 1.0f, false);
        }
        k4 k4Var = this.f41497c;
        k4Var.A = null;
        k4Var.f39590e.clear();
        k4Var.f39591f.clear();
        k4Var.f39594s.clear();
        k4Var.v.clear();
        k4Var.h.clear();
        k4Var.f39593r.clear();
        k4Var.f39592n.clear();
        k4Var.f39596x.clear();
        k4Var.f39595w.clear();
        k4Var.B = null;
        k4Var.l();
        invalidate();
    }

    public final boolean c() {
        return this.f41495a == 0;
    }

    public final boolean d() {
        k4 k4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        return (f() || (k4Var = this.f41497c) == null || (webPage = k4Var.A) == null || (page = webPage.cached_page) == null || page.local == null) ? false : true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.w0 webView;
        String strS;
        return f() && (webView = getWebView()) != null && (strS = org.telegram.ui.web.z0.s(webView.getUrl())) != null && org.telegram.ui.web.z0.o(Uri.parse(strS));
    }

    public final boolean f() {
        return this.f41495a == 1;
    }

    public final void g() {
        if (c()) {
            z3 z3Var = this.G.G;
            this.d.h1(z3Var != null ? 1 : 0, z3Var != null ? AndroidUtilities.dp(32.0f) : 0);
        } else if (f()) {
            n3 n3Var = this.f41498e;
            n3Var.setSwipeOffsetY(n3Var.getTopActionBarOffsetY() + (-n3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f41503w;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.G.getClass();
        return org.telegram.ui.ActionBar.g6.w0(null, i10, false);
    }

    public k4 getAdapter() {
        return this.f41497c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f41500n ? org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false) : this.f41504x;
        }
        return org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (!c()) {
            if (f()) {
                return this.f41498e.getTranslationY();
            }
            return 0.0f;
        }
        lh.w wVar = this.f41496b;
        float height = wVar.getHeight();
        for (int i11 = 0; i11 < wVar.getChildCount(); i11++) {
            View childAt = wVar.getChildAt(i11);
            if (wVar.getLayoutManager() == null) {
                i10 = 0;
            } else {
                wVar.getLayoutManager().getClass();
                i10 = RecyclerView.U(childAt).f5793f;
            }
            height = i10 == 2147483646 ? Math.min(height, childAt.getBottom()) : Math.min(height, childAt.getTop());
        }
        return height;
    }

    public org.telegram.ui.Components.zk0 getListView() {
        return this.f41496b;
    }

    public float getProgress() {
        org.telegram.ui.web.w0 webView;
        z3 z3Var = this.G.G;
        if (c()) {
            float f10 = this.E;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.k0 k0Var = this.d;
            int iL0 = k0Var.L0();
            View viewM = k0Var.m(iL0);
            if (viewM != null) {
                k4 k4Var = this.f41497c;
                int[] iArr = k4Var.E;
                lh.w wVar = this.f41496b;
                if (iArr != null) {
                    int i10 = iL0 - 1;
                    return Utilities.clamp01((((i10 < 0 || i10 >= iArr.length) ? 0 : iArr[i10]) + ((iL0 != 0 || z3Var == null) ? -viewM.getTop() : 0)) / Math.max(1, k4Var.F - wVar.getHeight()));
                }
                int iN0 = k0Var.N0();
                if (z3Var != null) {
                    if (iL0 < 1) {
                        iL0 = 1;
                    }
                    if (iN0 < 1) {
                        iN0 = 1;
                    }
                }
                int iB = k0Var.B();
                int i11 = iB - 2;
                View viewM2 = iN0 >= i11 ? k0Var.m(i11) : k0Var.m(iL0);
                if (viewM2 != null) {
                    float width = getWidth() / (iB - 1);
                    float measuredHeight = viewM2.getMeasuredHeight();
                    return ((iL0 * width) + (iN0 >= i11 ? (((i11 - iL0) * width) * (wVar.getMeasuredHeight() - viewM2.getTop())) / measuredHeight : (1.0f - ((Math.min(0, viewM2.getTop() - wVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width)) / getWidth();
                }
            }
        } else if (f() && (webView = this.f41499f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.w0 webView;
        o0 o0Var;
        if (!f() || (webView = this.f41499f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.B, webView.getUrl())) {
            return this.C;
        }
        try {
            String url = webView.getUrl();
            this.B = url;
            Uri uri = Uri.parse(org.telegram.ui.web.z0.s(url));
            String string = (uri.getScheme() == null || !(uri.getScheme().equalsIgnoreCase("http") || uri.getScheme().equalsIgnoreCase("https"))) ? uri.toString() : uri.getSchemeSpecificPart();
            try {
                if (!e()) {
                    try {
                        Uri uri2 = Uri.parse(string);
                        if (uri2.getHost() != null) {
                            uri = uri2;
                        }
                        String strA = we.e.a(uri.getHost());
                        String[] strArrSplit = strA.split("\\.");
                        if (strArrSplit.length > 2 && (o0Var = this.G.f40335d0) != null && lh.w3.g(strA, o0Var.A) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            strA = strArrSplit[strArrSplit.length - 2] + '.' + strArrSplit[strArrSplit.length - 1];
                        }
                        string = we.e.v(uri, null, "", strA, null);
                    } catch (Exception e9) {
                        FileLog.e((Throwable) e9, false);
                    }
                    string = URLDecoder.decode(string.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            if (string.startsWith("//")) {
                string = string.substring(2);
            }
            if (string.startsWith("www.")) {
                string = string.substring(4);
            }
            if (string.endsWith("/")) {
                string = string.substring(0, string.length() - 1);
            }
            int iIndexOf = string.indexOf("#");
            if (iIndexOf >= 0) {
                string = string.substring(0, iIndexOf);
            }
            this.C = string;
            return string;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.w0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f41497c.A;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        return (!f() || (webView = this.f41499f.getWebView()) == null) ? "" : webView.getTitle();
    }

    public org.telegram.ui.web.z0 getWebContainer() {
        return this.f41499f;
    }

    public org.telegram.ui.web.w0 getWebView() {
        o3 o3Var = this.f41499f;
        if (o3Var != null) {
            return o3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        h3 h3Var;
        super.onAttachedToWindow();
        if (!this.f41500n || (h3Var = this.f41501r) == null) {
            return;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        h3Var.b(AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(null, i10, false)) <= 0.721f, false);
        this.f41501r.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
    }

    public void setLastVisible(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            this.f41499f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        m4 m4Var = this.G;
        m4Var.f0();
        if (m4Var.f40333b0.f24028f) {
            m4Var.f40334c0.invalidate();
        }
        if (m4Var.f40333b0.f24027e) {
            m4Var.f40334c0.invalidate();
            m4Var.X((int) (((AndroidUtilities.dp(56.0f) - m4Var.f40333b0.h) * (f10 / getMeasuredWidth())) + m4Var.f40333b0.h));
        }
        z3 z3Var = m4Var.G;
        if (z3Var != null) {
            z3Var.n();
        }
    }

    public void setType(int i10) {
        if (this.f41495a != i10) {
            b();
        }
        this.f41495a = i10;
        this.f41496b.setVisibility(c() ? 0 : 8);
        this.f41498e.setVisibility(f() ? 0 : 8);
    }

    public void setWeb(d3 d3Var) {
        d3 d3Var2 = this.F;
        if (d3Var2 != d3Var) {
            if (d3Var2 != null) {
                d3Var2.c(this);
            }
            this.F = d3Var;
            if (d3Var != null) {
                org.telegram.ui.web.w0 w0Var = d3Var.f23624b;
                o3 o3Var = this.f41499f;
                if (w0Var != null) {
                    w0Var.onResume();
                    int i10 = UserConfig.selectedAccount;
                    org.telegram.ui.web.w0 w0Var2 = d3Var.f23624b;
                    Object obj = d3Var.d;
                    o3Var.I = i10;
                    o3Var.Q(w0Var2, obj);
                    if (o3Var.f44072k0) {
                        o3Var.v("visibility_changed", org.telegram.ui.web.z0.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, d3Var.f23635o);
                    a(this, false, d3Var.f23636p);
                } else {
                    String str = d3Var.v;
                    if (str != null) {
                        o3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.c2 c2Var = this.f41505y;
            if (c2Var != null) {
                c2Var.a();
                org.telegram.ui.web.c2 c2Var2 = this.f41505y;
                TLRPC.TL_webPage tL_webPage = c2Var2.f43801j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.e2.o(tL_webPage);
                    c2Var2.f43801j = null;
                }
                this.f41505y = null;
            }
        }
    }
}
