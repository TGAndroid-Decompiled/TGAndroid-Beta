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
public final class n3 extends FrameLayout {
    public org.telegram.ui.web.g2 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public a3 K;
    public final k4 L;
    public int f39701a;
    public final ei.v f39702b;
    public final i4 f39703c;
    public final s4.b0 d;
    public final k3 e;
    public final l3 f39704f;
    public boolean h;
    public boolean f39705n;
    public e3 f39706r;
    public boolean f39707s;
    public boolean v;
    public int f39708w;
    public int f39709x;
    public int f39710y;

    public n3(k4 k4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.L = k4Var;
        int i10 = org.telegram.ui.ActionBar.k6.Pk;
        this.f39708w = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        this.f39709x = x02;
        this.f39710y = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        ei.v vVar = new ei.v(this, activity);
        this.f39702b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.k) vVar.getItemAnimator()).C = false;
        if (k4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        i4 i4Var = new i4(k4Var, activity, z10);
        this.f39703c = i4Var;
        vVar.setAdapter(i4Var);
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new j3(this, 0));
        addView(vVar, w7.z5.c(-1.0f, -1));
        k3 k3Var = new k3(this, getContext());
        this.e = k3Var;
        k3Var.setShouldWaitWebViewScroll(true);
        k3Var.setFullSize(true);
        k3Var.setAllowFullSizeSwipe(true);
        l3 l3Var = new l3(this, getContext(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
        this.f39704f = l3Var;
        l3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final n3 f37734b;

            {
                this.f37734b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k4 k4Var2 = this.f37734b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.q3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.q3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
                                                if (p3Var.J == k4Var2) {
                                                    z11 = P.h(i11, p3Var, true);
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
                            k4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37734b.f39704f.n(true, false);
                        return;
                    default:
                        n3 n3Var = this.f37734b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f39704f.n(false, false);
                        e3 e3Var = n3Var.f39706r;
                        if (e3Var != null) {
                            e3Var.f36792a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.L.f0();
                        return;
                }
            }
        });
        l3Var.setWebViewProgressListener(new i3(this, 0));
        l3Var.setDelegate(new m3(this));
        l3Var.setWebViewScrollListener(new f(this, 2));
        k3Var.addView(l3Var, w7.z5.c(-1.0f, -1));
        k3Var.setScrollEndListener(new Runnable(this) {
            public final n3 f37734b;

            {
                this.f37734b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k4 k4Var2 = this.f37734b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.q3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.q3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
                                                if (p3Var.J == k4Var2) {
                                                    z11 = P.h(i11, p3Var, true);
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
                            k4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37734b.f39704f.n(true, false);
                        return;
                    default:
                        n3 n3Var = this.f37734b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f39704f.n(false, false);
                        e3 e3Var = n3Var.f39706r;
                        if (e3Var != null) {
                            e3Var.f36792a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.L.f0();
                        return;
                }
            }
        });
        k3Var.setDelegate(new a1(this, 1));
        k3Var.setScrollListener(new Runnable(this) {
            public final n3 f37734b;

            {
                this.f37734b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k4 k4Var2 = this.f37734b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.q3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.q3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.p3 p3Var = (org.telegram.ui.ActionBar.p3) obj;
                                                if (p3Var.J == k4Var2) {
                                                    z11 = P.h(i11, p3Var, true);
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
                            k4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37734b.f39704f.n(true, false);
                        return;
                    default:
                        n3 n3Var = this.f37734b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f39704f.n(false, false);
                        e3 e3Var = n3Var.f39706r;
                        if (e3Var != null) {
                            e3Var.f36792a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.L.f0();
                        return;
                }
            }
        });
        k3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(k3Var, w7.z5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(n3 n3Var, boolean z10, int i10) {
        k4 k4Var = n3Var.L;
        w3 w3Var = k4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false), i10);
            n3Var.f39708w = v;
            if (n3Var == k4Var.f38774u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    k4Var.f38762h0.d(v, true);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.k6.v(-1, i10);
            n3Var.f39709x = v10;
            if (n3Var == k4Var.f38774u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    k4Var.f38762h0.setMenuColors(v10);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        }
        k4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f39707s = false;
        this.v = false;
        setWeb(null);
        l3 l3Var = this.f39704f;
        l3Var.h();
        l3Var.f43032a = null;
        int i10 = org.telegram.ui.ActionBar.k6.Pk;
        this.f39708w = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i10, false);
        this.f39709x = x02;
        this.f39710y = x02;
        e3 e3Var = this.f39706r;
        if (e3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3Var.b(z10, true);
            this.f39706r.setBackgroundColor(this.f39709x);
            e3 e3Var2 = this.f39706r;
            this.f39705n = false;
            AndroidUtilities.updateViewVisibilityAnimated(e3Var2, false, 1.0f, false);
        }
        i4 i4Var = this.f39703c;
        i4Var.E = null;
        i4Var.e.clear();
        i4Var.f38138f.clear();
        i4Var.f38141s.clear();
        i4Var.v.clear();
        i4Var.h.clear();
        i4Var.f38140r.clear();
        i4Var.f38139n.clear();
        i4Var.f38143x.clear();
        i4Var.f38142w.clear();
        i4Var.F = null;
        i4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f39701a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        i4 i4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (i4Var = this.f39703c) != null && (webPage = i4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.y0 webView;
        String u10;
        if (!f() || (webView = getWebView()) == null || (u10 = org.telegram.ui.web.b1.u(webView.getUrl())) == null || !org.telegram.ui.web.b1.p(Uri.parse(u10))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f39701a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            w3 w3Var = this.L.K;
            int i11 = 0;
            if (w3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (w3Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            k3 k3Var = this.e;
            k3Var.setSwipeOffsetY(k3Var.getTopActionBarOffsetY() + (-k3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f39708w;
        }
        int i10 = org.telegram.ui.ActionBar.k6.Pk;
        this.L.getClass();
        return org.telegram.ui.ActionBar.k6.x0(null, i10, false);
    }

    public i4 getAdapter() {
        return this.f39703c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f39705n) {
                return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
            }
            return this.f39709x;
        }
        return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            ei.v vVar = this.f39702b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f46345f;
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

    public org.telegram.ui.Components.lm0 getListView() {
        return this.f39702b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
        i4 i4Var;
        int i10;
        int B;
        View m10;
        float min;
        w3 w3Var = this.L.K;
        if (c()) {
            float f7 = this.J;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.b0 b0Var = this.d;
            int L0 = b0Var.L0();
            View m11 = b0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f39703c.I;
                ei.v vVar = this.f39702b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = b0Var.N0();
                    if (w3Var != null) {
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
                    if (L0 != 0 || w3Var == null) {
                        i11 = -m11.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, i4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f39704f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f39704f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.G, webView.getUrl())) {
            return this.H;
        }
        try {
            String url = webView.getUrl();
            this.G = url;
            Uri parse = Uri.parse(org.telegram.ui.web.b1.u(url));
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
                        if (a2.split("\\.").length > 2 && (m0Var = this.L.f38762h0) != null && ei.x3.g(a2, m0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
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
            this.H = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        org.telegram.ui.web.y0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f39703c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f39704f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.b1 getWebContainer() {
        return this.f39704f;
    }

    public org.telegram.ui.web.y0 getWebView() {
        l3 l3Var = this.f39704f;
        if (l3Var != null) {
            return l3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        e3 e3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f39705n && (e3Var = this.f39706r) != null) {
            int i10 = org.telegram.ui.ActionBar.k6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.x0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3Var.b(z10, false);
            org.telegram.ui.ActionBar.r6.i(i10, this.f39706r, null);
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            this.f39704f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        k4 k4Var = this.L;
        k4Var.f0();
        if (k4Var.f38760f0.f22050f) {
            k4Var.f38761g0.invalidate();
        }
        if (k4Var.f38760f0.e) {
            k4Var.f38761g0.invalidate();
            k4Var.X((int) (((AndroidUtilities.dp(56.0f) - k4Var.f38760f0.h) * (f7 / getMeasuredWidth())) + k4Var.f38760f0.h));
        }
        w3 w3Var = k4Var.K;
        if (w3Var != null) {
            w3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f39701a != i10) {
            b();
        }
        this.f39701a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39702b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(a3 a3Var) {
        a3 a3Var2 = this.K;
        if (a3Var2 != a3Var) {
            if (a3Var2 != null) {
                a3Var2.c(this);
            }
            this.K = a3Var;
            if (a3Var != null) {
                org.telegram.ui.web.y0 y0Var = a3Var.f21756b;
                l3 l3Var = this.f39704f;
                if (y0Var != null) {
                    y0Var.onResume();
                    l3Var.N(UserConfig.selectedAccount, a3Var.f21756b, a3Var.d, a3Var.f21774x, false);
                    a(this, true, a3Var.f21768q);
                    a(this, false, a3Var.f21769r);
                } else {
                    String str = a3Var.f21774x;
                    if (str != null) {
                        l3Var.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.g2 g2Var = this.E;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = g2Var2.f43116j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f43116j = null;
                }
                this.E = null;
            }
        }
    }
}
