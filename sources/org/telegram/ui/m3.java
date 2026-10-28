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
    public org.telegram.ui.web.f2 E;
    public boolean F;
    public String G;
    public String H;
    public boolean I;
    public float J;
    public y2 K;
    public final j4 L;
    public int f41311a;
    public final fi.v f41312b;
    public final h4 f41313c;
    public final s4.c0 d;
    public final j3 e;
    public final k3 f41314f;
    public boolean h;
    public boolean f41315n;
    public c3 f41316r;
    public boolean f41317s;
    public boolean v;
    public int f41318w;
    public int f41319x;
    public int f41320y;

    public m3(j4 j4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.L = j4Var;
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        this.f41318w = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        this.f41319x = x02;
        this.f41320y = x02;
        this.F = false;
        this.J = -1.0f;
        new Matrix();
        fi.v vVar = new fi.v(this, activity);
        this.f41312b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.l) vVar.getItemAnimator()).C = false;
        if (j4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4 h4Var = new h4(j4Var, activity, z10);
        this.f41313c = h4Var;
        vVar.setAdapter(h4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        vVar.setLayoutManager(c0Var);
        vVar.setOnScrollListener(new i3(this, 0));
        addView(vVar, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        j3 j3Var = new j3(this, getContext());
        this.e = j3Var;
        j3Var.setShouldWaitWebViewScroll(true);
        j3Var.setFullSize(true);
        j3Var.setAllowFullSizeSwipe(true);
        k3 k3Var = new k3(this, getContext(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
        this.f41314f = k3Var;
        k3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final m3 f39483b;

            {
                this.f39483b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f39483b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.s3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                                                if (r3Var.J == j4Var2) {
                                                    z11 = P.h(i11, r3Var, true);
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39483b.f41314f.n(true, false);
                        return;
                    default:
                        m3 m3Var = this.f39483b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f41314f.n(false, false);
                        c3 c3Var = m3Var.f41316r;
                        if (c3Var != null) {
                            c3Var.f38159a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.L.f0();
                        return;
                }
            }
        });
        k3Var.setWebViewProgressListener(new h3(this, 0));
        k3Var.setDelegate(new l3(this));
        k3Var.setWebViewScrollListener(new f(this, 2));
        j3Var.addView(k3Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        j3Var.setScrollEndListener(new Runnable(this) {
            public final m3 f39483b;

            {
                this.f39483b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f39483b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.s3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                                                if (r3Var.J == j4Var2) {
                                                    z11 = P.h(i11, r3Var, true);
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39483b.f41314f.n(true, false);
                        return;
                    default:
                        m3 m3Var = this.f39483b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f41314f.n(false, false);
                        c3 c3Var = m3Var.f41316r;
                        if (c3Var != null) {
                            c3Var.f38159a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.L.f0();
                        return;
                }
            }
        });
        j3Var.setDelegate(new y0(this, 1));
        j3Var.setScrollListener(new Runnable(this) {
            public final m3 f39483b;

            {
                this.f39483b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f39483b.L;
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.s3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.s3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.r3 r3Var = (org.telegram.ui.ActionBar.r3) obj;
                                                if (r3Var.J == j4Var2) {
                                                    z11 = P.h(i11, r3Var, true);
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f39483b.f41314f.n(true, false);
                        return;
                    default:
                        m3 m3Var = this.f39483b;
                        j3 j3Var2 = m3Var.e;
                        m3Var.f41314f.n(false, false);
                        c3 c3Var = m3Var.f41316r;
                        if (c3Var != null) {
                            c3Var.f38159a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.L.f0();
                        return;
                }
            }
        });
        j3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(j3Var, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(m3 m3Var, boolean z10, int i10) {
        j4 j4Var = m3Var.L;
        v3 v3Var = j4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false), i10);
            m3Var.f41318w = v;
            if (m3Var == j4Var.f40414u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.f40402h0.d(v, true);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.y6.v(-1, i10);
            m3Var.f41319x = v10;
            if (m3Var == j4Var.f40414u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.f40402h0.setMenuColors(v10);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        }
        j4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f41317s = false;
        this.v = false;
        setWeb(null);
        k3 k3Var = this.f41314f;
        k3Var.h();
        k3Var.f44665a = null;
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        this.f41318w = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
        this.f41319x = x02;
        this.f41320y = x02;
        c3 c3Var = this.f41316r;
        if (c3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3Var.b(z10, true);
            this.f41316r.setBackgroundColor(this.f41319x);
            c3 c3Var2 = this.f41316r;
            this.f41315n = false;
            AndroidUtilities.updateViewVisibilityAnimated(c3Var2, false, 1.0f, false);
        }
        h4 h4Var = this.f41313c;
        h4Var.E = null;
        h4Var.e.clear();
        h4Var.f39765f.clear();
        h4Var.f39768s.clear();
        h4Var.v.clear();
        h4Var.h.clear();
        h4Var.f39767r.clear();
        h4Var.f39766n.clear();
        h4Var.f39770x.clear();
        h4Var.f39769w.clear();
        h4Var.F = null;
        h4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f41311a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        h4 h4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (h4Var = this.f41313c) != null && (webPage = h4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        if (this.f41311a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            v3 v3Var = this.L.K;
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
            j3 j3Var = this.e;
            j3Var.setSwipeOffsetY(j3Var.getTopActionBarOffsetY() + (-j3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f41318w;
        }
        int i10 = org.telegram.ui.ActionBar.y6.Pk;
        this.L.getClass();
        return org.telegram.ui.ActionBar.y6.x0(null, i10, false);
    }

    public h4 getAdapter() {
        return this.f41313c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f41315n) {
                return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
            }
            return this.f41319x;
        }
        return org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            fi.v vVar = this.f41312b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f47776f;
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

    public org.telegram.ui.Components.nm0 getListView() {
        return this.f41312b;
    }

    public float getProgress() {
        org.telegram.ui.web.x0 webView;
        h4 h4Var;
        int i10;
        int B;
        View m10;
        float min;
        v3 v3Var = this.L.K;
        if (c()) {
            float f7 = this.J;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            View m11 = c0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f41313c.I;
                fi.v vVar = this.f41312b;
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
                    return Utilities.clamp01((i10 + i11) / Math.max(1, h4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f41314f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.x0 webView;
        String uri;
        String[] split;
        l0 l0Var;
        if (!f() || (webView = this.f41314f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.G, webView.getUrl())) {
            return this.H;
        }
        try {
            String url = webView.getUrl();
            this.G = url;
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
                        String a2 = qf.d.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (l0Var = this.L.f40402h0) != null && fi.v3.g(a2, l0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = qf.d.u(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
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
            this.H = uri;
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
            TLRPC.WebPage webPage = this.f41313c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f41314f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.a1 getWebContainer() {
        return this.f41314f;
    }

    public org.telegram.ui.web.x0 getWebView() {
        k3 k3Var = this.f41314f;
        if (k3Var != null) {
            return k3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        c3 c3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f41315n && (c3Var = this.f41316r) != null) {
            int i10 = org.telegram.ui.ActionBar.y6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.x0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3Var.b(z10, false);
            org.telegram.ui.ActionBar.f7.i(i10, this.f41316r, null);
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            this.f41314f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        j4 j4Var = this.L;
        j4Var.f0();
        if (j4Var.f40400f0.f23816f) {
            j4Var.f40401g0.invalidate();
        }
        if (j4Var.f40400f0.e) {
            j4Var.f40401g0.invalidate();
            j4Var.X((int) (((AndroidUtilities.dp(56.0f) - j4Var.f40400f0.h) * (f7 / getMeasuredWidth())) + j4Var.f40400f0.h));
        }
        v3 v3Var = j4Var.K;
        if (v3Var != null) {
            v3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f41311a != i10) {
            b();
        }
        this.f41311a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f41312b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(y2 y2Var) {
        y2 y2Var2 = this.K;
        if (y2Var2 != y2Var) {
            if (y2Var2 != null) {
                y2Var2.c(this);
            }
            this.K = y2Var;
            if (y2Var != null) {
                org.telegram.ui.web.x0 x0Var = y2Var.f23006b;
                if (x0Var != null) {
                    x0Var.onResume();
                    this.f41314f.N(UserConfig.selectedAccount, y2Var.f23006b, y2Var.d, y2Var.f23024x, false);
                    a(this, true, y2Var.f23018q);
                    a(this, false, y2Var.f23019r);
                } else {
                    String str = y2Var.f23024x;
                    if (str != null) {
                        this.f41314f.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.E;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.E;
                TLRPC.TL_webPage tL_webPage = f2Var2.f44753j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f44753j = null;
                }
                this.E = null;
            }
        }
    }
}
