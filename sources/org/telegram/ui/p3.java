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
public final class p3 extends FrameLayout {
    public boolean A;
    public String B;
    public String C;
    public boolean D;
    public float E;
    public c3 F;
    public final l4 G;
    public int f41319a;
    public final kh.w f41320b;
    public final j4 f41321c;
    public final f2.m0 d;
    public final m3 f41322e;
    public final n3 f41323f;
    public boolean h;
    public boolean f41324n;
    public g3 f41325r;
    public boolean f41326s;
    public boolean v;
    public int f41327w;
    public int f41328x;
    public org.telegram.ui.web.b2 f41329y;

    public p3(l4 l4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.G = l4Var;
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        this.f41327w = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        this.f41328x = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        this.A = false;
        this.E = -1.0f;
        new Matrix();
        kh.w wVar = new kh.w(this, activity);
        this.f41320b = wVar;
        wVar.setClipToPadding(false);
        wVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        wVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.n) wVar.getItemAnimator()).C = false;
        if (l4Var.G != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4 j4Var = new j4(l4Var, activity, z10);
        this.f41321c = j4Var;
        wVar.setAdapter(j4Var);
        f2.m0 m0Var = new f2.m0(1, false);
        this.d = m0Var;
        wVar.setLayoutManager(m0Var);
        wVar.setOnScrollListener(new l3(this, 0));
        addView(wVar, g7.e6.c(-1.0f, -1));
        m3 m3Var = new m3(this, getContext());
        this.f41322e = m3Var;
        m3Var.setShouldWaitWebViewScroll(true);
        m3Var.setFullSize(true);
        m3Var.setAllowFullSizeSwipe(true);
        n3 n3Var = new n3(this, getContext(), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
        this.f41323f = n3Var;
        n3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final p3 f39351b;

            {
                this.f39351b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f39351b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == l4Var2) {
                                                    z11 = P.h(i10, l3Var, true);
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
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39351b.f41323f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f39351b;
                        m3 m3Var2 = p3Var.f41322e;
                        p3Var.f41323f.n(false, false);
                        g3 g3Var = p3Var.f41325r;
                        if (g3Var != null) {
                            g3Var.f38416a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.G.f0();
                        return;
                }
            }
        });
        n3Var.setWebViewProgressListener(new k3(this, 0));
        n3Var.setDelegate(new o3(this));
        n3Var.setWebViewScrollListener(new g(this, 2));
        m3Var.addView(n3Var, g7.e6.c(-1.0f, -1));
        m3Var.setScrollEndListener(new Runnable(this) {
            public final p3 f39351b;

            {
                this.f39351b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f39351b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == l4Var2) {
                                                    z11 = P.h(i10, l3Var, true);
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
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39351b.f41323f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f39351b;
                        m3 m3Var2 = p3Var.f41322e;
                        p3Var.f41323f.n(false, false);
                        g3 g3Var = p3Var.f41325r;
                        if (g3Var != null) {
                            g3Var.f38416a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.G.f0();
                        return;
                }
            }
        });
        m3Var.setDelegate(new b1(this, 1));
        m3Var.setScrollListener(new Runnable(this) {
            public final p3 f39351b;

            {
                this.f39351b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f39351b.G;
                        LaunchActivity launchActivity = LaunchActivity.C1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i10 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.G;
                                    if (i10 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i10));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList.get(i11);
                                                i11++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.H == l4Var2) {
                                                    z11 = P.h(i10, l3Var, true);
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
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39351b.f41323f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f39351b;
                        m3 m3Var2 = p3Var.f41322e;
                        p3Var.f41323f.n(false, false);
                        g3 g3Var = p3Var.f41325r;
                        if (g3Var != null) {
                            g3Var.f38416a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.G.f0();
                        return;
                }
            }
        });
        m3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(m3Var, g7.e6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(p3 p3Var, boolean z10, int i9) {
        l4 l4Var = p3Var.G;
        y3 y3Var = l4Var.G;
        if (z10) {
            int v = org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false), i9);
            p3Var.f41327w = v;
            if (p3Var == l4Var.f40026q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f40014d0.d(v, true);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        } else {
            int v4 = org.telegram.ui.ActionBar.f6.v(-1, i9);
            p3Var.f41328x = v4;
            if (p3Var == l4Var.f40026q0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f40014d0.setMenuColors(v4);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        }
        l4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f41326s = false;
        this.v = false;
        setWeb(null);
        n3 n3Var = this.f41323f;
        n3Var.h();
        n3Var.f44070a = null;
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        this.f41327w = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i9, false);
        this.f41328x = w02;
        g3 g3Var = this.f41325r;
        if (g3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            g3Var.b(z10, true);
            this.f41325r.setBackgroundColor(this.f41328x);
            g3 g3Var2 = this.f41325r;
            this.f41324n = false;
            AndroidUtilities.updateViewVisibilityAnimated(g3Var2, false, 1.0f, false);
        }
        j4 j4Var = this.f41321c;
        j4Var.A = null;
        j4Var.f39360e.clear();
        j4Var.f39361f.clear();
        j4Var.f39364s.clear();
        j4Var.v.clear();
        j4Var.h.clear();
        j4Var.f39363r.clear();
        j4Var.f39362n.clear();
        j4Var.f39366x.clear();
        j4Var.f39365w.clear();
        j4Var.B = null;
        j4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f41319a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        j4 j4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (j4Var = this.f41321c) != null && (webPage = j4Var.A) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        String s10;
        if (!f() || (webView = getWebView()) == null || (s10 = org.telegram.ui.web.y0.s(webView.getUrl())) == null || !org.telegram.ui.web.y0.o(Uri.parse(s10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f41319a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i9;
        if (c()) {
            y3 y3Var = this.G.G;
            int i10 = 0;
            if (y3Var != null) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            if (y3Var != null) {
                i10 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i9, i10);
        } else if (f()) {
            m3 m3Var = this.f41322e;
            m3Var.setSwipeOffsetY(m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f41327w;
        }
        int i9 = org.telegram.ui.ActionBar.f6.Pk;
        this.G.getClass();
        return org.telegram.ui.ActionBar.f6.w0(null, i9, false);
    }

    public j4 getAdapter() {
        return this.f41321c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f41324n) {
                return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
            }
            return this.f41328x;
        }
        return org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Pk, false);
    }

    public float getListTop() {
        int i9;
        if (c()) {
            kh.w wVar = this.f41320b;
            float height = wVar.getHeight();
            for (int i10 = 0; i10 < wVar.getChildCount(); i10++) {
                View childAt = wVar.getChildAt(i10);
                if (wVar.getLayoutManager() == null) {
                    i9 = 0;
                } else {
                    wVar.getLayoutManager().getClass();
                    i9 = RecyclerView.U(childAt).f5505f;
                }
                if (i9 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f41322e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.wk0 getListView() {
        return this.f41320b;
    }

    public float getProgress() {
        org.telegram.ui.web.v0 webView;
        j4 j4Var;
        int i9;
        int B;
        View m10;
        float min;
        y3 y3Var = this.G.G;
        if (c()) {
            float f10 = this.E;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.m0 m0Var = this.d;
            int L0 = m0Var.L0();
            View m11 = m0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f41321c.E;
                kh.w wVar = this.f41320b;
                int i10 = 0;
                if (iArr == null) {
                    int N0 = m0Var.N0();
                    if (y3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = m0Var.B() - 2;
                    if (N0 >= B2) {
                        m10 = m0Var.m(B2);
                    } else {
                        m10 = m0Var.m(L0);
                    }
                    if (m10 != null) {
                        float width = getWidth() / (B - 1);
                        float measuredHeight = m10.getMeasuredHeight();
                        if (N0 >= B2) {
                            min = (((B2 - L0) * width) * (wVar.getMeasuredHeight() - m10.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m10.getTop() - wVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
                        }
                        return ((L0 * width) + min) / getWidth();
                    }
                } else {
                    int i11 = L0 - 1;
                    if (i11 >= 0 && i11 < iArr.length) {
                        i9 = iArr[i11];
                    } else {
                        i9 = 0;
                    }
                    if (L0 != 0 || y3Var == null) {
                        i10 = -m11.getTop();
                    }
                    return Utilities.clamp01((i9 + i10) / Math.max(1, j4Var.F - wVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f41323f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.v0 webView;
        String uri;
        String[] split;
        n0 n0Var;
        if (!f() || (webView = this.f41323f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.B, webView.getUrl())) {
            return this.C;
        }
        try {
            String url = webView.getUrl();
            this.B = url;
            Uri parse = Uri.parse(org.telegram.ui.web.y0.s(url));
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
                        String a2 = ve.e.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (n0Var = this.G.f40014d0) != null && kh.x3.g(a2, n0Var.A) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = ve.e.v(parse, null, "", a2, null);
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
        org.telegram.ui.web.v0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f41321c.A;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f41323f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.y0 getWebContainer() {
        return this.f41323f;
    }

    public org.telegram.ui.web.v0 getWebView() {
        n3 n3Var = this.f41323f;
        if (n3Var != null) {
            return n3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        g3 g3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f41324n && (g3Var = this.f41325r) != null) {
            int i9 = org.telegram.ui.ActionBar.f6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.w0(null, i9, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            g3Var.b(z10, false);
            this.f41325r.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.D != z10) {
            this.D = z10;
            this.f41323f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        l4 l4Var = this.G;
        l4Var.f0();
        if (l4Var.f40012b0.f24021f) {
            l4Var.f40013c0.invalidate();
        }
        if (l4Var.f40012b0.f24020e) {
            l4Var.f40013c0.invalidate();
            l4Var.X((int) (((AndroidUtilities.dp(56.0f) - l4Var.f40012b0.h) * (f10 / getMeasuredWidth())) + l4Var.f40012b0.h));
        }
        y3 y3Var = l4Var.G;
        if (y3Var != null) {
            y3Var.n();
        }
    }

    public void setType(int i9) {
        int i10;
        if (this.f41319a != i9) {
            b();
        }
        this.f41319a = i9;
        int i11 = 8;
        if (c()) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f41320b.setVisibility(i10);
        if (f()) {
            i11 = 0;
        }
        this.f41322e.setVisibility(i11);
    }

    public void setWeb(c3 c3Var) {
        c3 c3Var2 = this.F;
        if (c3Var2 != c3Var) {
            if (c3Var2 != null) {
                c3Var2.c(this);
            }
            this.F = c3Var;
            if (c3Var != null) {
                org.telegram.ui.web.v0 v0Var = c3Var.f23620b;
                n3 n3Var = this.f41323f;
                if (v0Var != null) {
                    v0Var.onResume();
                    int i9 = UserConfig.selectedAccount;
                    org.telegram.ui.web.v0 v0Var2 = c3Var.f23620b;
                    Object obj = c3Var.d;
                    n3Var.I = i9;
                    n3Var.Q(v0Var2, obj);
                    if (n3Var.f44085k0) {
                        n3Var.v("visibility_changed", org.telegram.ui.web.y0.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, c3Var.f23631o);
                    a(this, false, c3Var.f23632p);
                } else {
                    String str = c3Var.v;
                    if (str != null) {
                        n3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.b2 b2Var = this.f41329y;
            if (b2Var != null) {
                b2Var.a();
                org.telegram.ui.web.b2 b2Var2 = this.f41329y;
                TLRPC.TL_webPage tL_webPage = b2Var2.f43814j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.d2.o(tL_webPage);
                    b2Var2.f43814j = null;
                }
                this.f41329y = null;
            }
        }
    }
}
