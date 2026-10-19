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
public final class o3 extends FrameLayout {
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public b3 J;
    public final l4 K;
    public int f39747a;
    public final ei.v f39748b;
    public final j4 f39749c;
    public final s4.b0 d;
    public final l3 e;
    public final m3 f39750f;
    public boolean h;
    public boolean f39751n;
    public f3 f39752r;
    public boolean f39753s;
    public boolean v;
    public int f39754w;
    public int f39755x;
    public org.telegram.ui.web.f2 f39756y;

    public o3(l4 l4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = l4Var;
        int i10 = org.telegram.ui.ActionBar.h6.Pk;
        this.f39754w = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        this.f39755x = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        ei.v vVar = new ei.v(this, activity);
        this.f39748b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.k) vVar.getItemAnimator()).C = false;
        if (l4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j4 j4Var = new j4(l4Var, activity, z10);
        this.f39749c = j4Var;
        vVar.setAdapter(j4Var);
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new k3(this, 0));
        addView(vVar, w7.z5.c(-1.0f, -1));
        l3 l3Var = new l3(this, getContext());
        this.e = l3Var;
        l3Var.setShouldWaitWebViewScroll(true);
        l3Var.setFullSize(true);
        l3Var.setAllowFullSizeSwipe(true);
        m3 m3Var = new m3(this, getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
        this.f39750f = m3Var;
        m3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final o3 f37868b;

            {
                this.f37868b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f37868b.K;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == l4Var2) {
                                                    z11 = P.h(i11, m3Var2, true);
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
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37868b.f39750f.n(true, false);
                        return;
                    default:
                        o3 o3Var = this.f37868b;
                        l3 l3Var2 = o3Var.e;
                        o3Var.f39750f.n(false, false);
                        f3 f3Var = o3Var.f39752r;
                        if (f3Var != null) {
                            f3Var.f36880a.setTranslationY(((l3Var2.getTopActionBarOffsetY() + (-l3Var2.getOffsetY())) - l3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        return;
                }
            }
        });
        m3Var.setWebViewProgressListener(new j3(this, 0));
        m3Var.setDelegate(new n3(this));
        m3Var.setWebViewScrollListener(new g(this, 2));
        l3Var.addView(m3Var, w7.z5.c(-1.0f, -1));
        l3Var.setScrollEndListener(new Runnable(this) {
            public final o3 f37868b;

            {
                this.f37868b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f37868b.K;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == l4Var2) {
                                                    z11 = P.h(i11, m3Var2, true);
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
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37868b.f39750f.n(true, false);
                        return;
                    default:
                        o3 o3Var = this.f37868b;
                        l3 l3Var2 = o3Var.e;
                        o3Var.f39750f.n(false, false);
                        f3 f3Var = o3Var.f39752r;
                        if (f3Var != null) {
                            f3Var.f36880a.setTranslationY(((l3Var2.getTopActionBarOffsetY() + (-l3Var2.getOffsetY())) - l3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        return;
                }
            }
        });
        l3Var.setDelegate(new b1(this, 1));
        l3Var.setScrollListener(new Runnable(this) {
            public final o3 f37868b;

            {
                this.f37868b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f37868b.K;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.J == l4Var2) {
                                                    z11 = P.h(i11, m3Var2, true);
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
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37868b.f39750f.n(true, false);
                        return;
                    default:
                        o3 o3Var = this.f37868b;
                        l3 l3Var2 = o3Var.e;
                        o3Var.f39750f.n(false, false);
                        f3 f3Var = o3Var.f39752r;
                        if (f3Var != null) {
                            f3Var.f36880a.setTranslationY(((l3Var2.getTopActionBarOffsetY() + (-l3Var2.getOffsetY())) - l3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        return;
                }
            }
        });
        l3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(l3Var, w7.z5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(o3 o3Var, boolean z10, int i10) {
        l4 l4Var = o3Var.K;
        x3 x3Var = l4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false), i10);
            o3Var.f39754w = v;
            if (o3Var == l4Var.f38774u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f38762h0.d(v, true);
                }
                if (x3Var != null) {
                    x3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.h6.v(-1, i10);
            o3Var.f39755x = v10;
            if (o3Var == l4Var.f38774u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f38762h0.setMenuColors(v10);
                }
                if (x3Var != null) {
                    x3Var.i();
                }
            }
        }
        l4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f39753s = false;
        this.v = false;
        setWeb(null);
        m3 m3Var = this.f39750f;
        m3Var.h();
        m3Var.f42554a = null;
        int i10 = org.telegram.ui.ActionBar.h6.Pk;
        this.f39754w = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        this.f39755x = x02;
        f3 f3Var = this.f39752r;
        if (f3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            f3Var.b(z10, true);
            this.f39752r.setBackgroundColor(this.f39755x);
            f3 f3Var2 = this.f39752r;
            this.f39751n = false;
            AndroidUtilities.updateViewVisibilityAnimated(f3Var2, false, 1.0f, false);
        }
        j4 j4Var = this.f39749c;
        j4Var.E = null;
        j4Var.e.clear();
        j4Var.f38153f.clear();
        j4Var.f38156s.clear();
        j4Var.v.clear();
        j4Var.h.clear();
        j4Var.f38155r.clear();
        j4Var.f38154n.clear();
        j4Var.f38158x.clear();
        j4Var.f38157w.clear();
        j4Var.F = null;
        j4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f39747a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        j4 j4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (j4Var = this.f39749c) != null && (webPage = j4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.x0 webView;
        String u10;
        if (!f() || (webView = getWebView()) == null || (u10 = org.telegram.ui.web.a1.u(webView.getUrl())) == null || !org.telegram.ui.web.a1.p(Uri.parse(u10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f39747a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            x3 x3Var = this.K.K;
            int i11 = 0;
            if (x3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (x3Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            l3 l3Var = this.e;
            l3Var.setSwipeOffsetY(l3Var.getTopActionBarOffsetY() + (-l3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f39754w;
        }
        int i10 = org.telegram.ui.ActionBar.h6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public j4 getAdapter() {
        return this.f39749c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f39751n) {
                return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            }
            return this.f39755x;
        }
        return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            ei.v vVar = this.f39748b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f45913f;
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

    public org.telegram.ui.Components.im0 getListView() {
        return this.f39748b;
    }

    public float getProgress() {
        org.telegram.ui.web.x0 webView;
        j4 j4Var;
        int i10;
        int B;
        View m10;
        float min;
        x3 x3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            View m11 = b0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f39749c.I;
                ei.v vVar = this.f39748b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = b0Var.N0();
                    if (x3Var != null) {
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
                    int i12 = L0 - 1;
                    if (i12 >= 0 && i12 < iArr.length) {
                        i10 = iArr[i12];
                    } else {
                        i10 = 0;
                    }
                    if (L0 != 0 || x3Var == null) {
                        i11 = -m11.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, j4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f39750f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.x0 webView;
        String uri;
        String[] split;
        n0 n0Var;
        if (!f() || (webView = this.f39750f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.a1.u(url));
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
                        String a2 = pf.d.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (n0Var = this.K.f38762h0) != null && ei.x3.g(a2, n0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = pf.d.u(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e7) {
                FileLog.e(e7);
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
        org.telegram.ui.web.x0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f39749c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f39750f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.a1 getWebContainer() {
        return this.f39750f;
    }

    public org.telegram.ui.web.x0 getWebView() {
        m3 m3Var = this.f39750f;
        if (m3Var != null) {
            return m3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        f3 f3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f39751n && (f3Var = this.f39752r) != null) {
            int i10 = org.telegram.ui.ActionBar.h6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            f3Var.b(z10, false);
            this.f39752r.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f39750f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        l4 l4Var = this.K;
        l4Var.f0();
        if (l4Var.f38760f0.f21930f) {
            l4Var.f38761g0.invalidate();
        }
        if (l4Var.f38760f0.e) {
            l4Var.f38761g0.invalidate();
            l4Var.X((int) (((AndroidUtilities.dp(56.0f) - l4Var.f38760f0.h) * (f7 / getMeasuredWidth())) + l4Var.f38760f0.h));
        }
        x3 x3Var = l4Var.K;
        if (x3Var != null) {
            x3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f39747a != i10) {
            b();
        }
        this.f39747a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39748b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(b3 b3Var) {
        b3 b3Var2 = this.J;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.c(this);
            }
            this.J = b3Var;
            if (b3Var != null) {
                org.telegram.ui.web.x0 x0Var = b3Var.f21582b;
                m3 m3Var = this.f39750f;
                if (x0Var != null) {
                    x0Var.onResume();
                    m3Var.N(UserConfig.selectedAccount, b3Var.f21582b, b3Var.d, b3Var.f21600x, false);
                    a(this, true, b3Var.f21594q);
                    a(this, false, b3Var.f21595r);
                } else {
                    String str = b3Var.f21600x;
                    if (str != null) {
                        m3Var.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.f39756y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.f39756y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f42637j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f42637j = null;
                }
                this.f39756y = null;
            }
        }
    }
}
