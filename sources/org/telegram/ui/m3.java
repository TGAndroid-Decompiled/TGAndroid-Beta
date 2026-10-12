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
    public int f39891a;
    public final ci.v f39892b;
    public final g4 f39893c;
    public final s4.d0 d;
    public final j3 f39894e;
    public final k3 f39895f;
    public boolean h;
    public boolean f39896n;
    public d3 f39897r;
    public boolean f39898s;
    public boolean v;
    public int f39899w;
    public int f39900x;
    public org.telegram.ui.web.f2 f39901y;

    public m3(i4 i4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = i4Var;
        int i10 = org.telegram.ui.ActionBar.h6.Pk;
        this.f39899w = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        this.f39900x = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        ci.v vVar = new ci.v(this, activity);
        this.f39892b = vVar;
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
        this.f39893c = g4Var;
        vVar.setAdapter(g4Var);
        s4.d0 d0Var = new s4.d0(1, false);
        this.d = d0Var;
        vVar.setLayoutManager(d0Var);
        vVar.setOnScrollListener(new i3(this, 0));
        addView(vVar, w7.w5.d(-1.0f, -1));
        j3 j3Var = new j3(this, getContext());
        this.f39894e = j3Var;
        j3Var.setShouldWaitWebViewScroll(true);
        j3Var.setFullSize(true);
        j3Var.setAllowFullSizeSwipe(true);
        k3 k3Var = new k3(this, getContext(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20559d6, false));
        this.f39895f = k3Var;
        k3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final m3 f37904b;

            {
                this.f37904b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f37904b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.J == i4Var2) {
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
                            i4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37904b.f39895f.n(true, false);
                        return;
                    default:
                        m3 m3Var = this.f37904b;
                        j3 j3Var2 = m3Var.f39894e;
                        m3Var.f39895f.n(false, false);
                        d3 d3Var = m3Var.f39897r;
                        if (d3Var != null) {
                            d3Var.f36625a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        return;
                }
            }
        });
        k3Var.setWebViewProgressListener(new h3(this, 0));
        k3Var.setDelegate(new l3(this));
        k3Var.setWebViewScrollListener(new g(this, 2));
        j3Var.addView(k3Var, w7.w5.d(-1.0f, -1));
        j3Var.setScrollEndListener(new Runnable(this) {
            public final m3 f37904b;

            {
                this.f37904b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f37904b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.J == i4Var2) {
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
                            i4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37904b.f39895f.n(true, false);
                        return;
                    default:
                        m3 m3Var = this.f37904b;
                        j3 j3Var2 = m3Var.f39894e;
                        m3Var.f39895f.n(false, false);
                        d3 d3Var = m3Var.f39897r;
                        if (d3Var != null) {
                            d3Var.f36625a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        return;
                }
            }
        });
        j3Var.setDelegate(new z0(this, 1));
        j3Var.setScrollListener(new Runnable(this) {
            public final m3 f37904b;

            {
                this.f37904b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        i4 i4Var2 = this.f37904b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.m3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.m3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var.J == i4Var2) {
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
                            i4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37904b.f39895f.n(true, false);
                        return;
                    default:
                        m3 m3Var = this.f37904b;
                        j3 j3Var2 = m3Var.f39894e;
                        m3Var.f39895f.n(false, false);
                        d3 d3Var = m3Var.f39897r;
                        if (d3Var != null) {
                            d3Var.f36625a.setTranslationY(((j3Var2.getTopActionBarOffsetY() + (-j3Var2.getOffsetY())) - j3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        m3Var.K.f0();
                        return;
                }
            }
        });
        j3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(j3Var, w7.w5.d(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(m3 m3Var, boolean z10, int i10) {
        i4 i4Var = m3Var.K;
        v3 v3Var = i4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.h6.v(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false), i10);
            m3Var.f39899w = v;
            if (m3Var == i4Var.f38661u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    i4Var.f38649h0.d(v, true);
                }
                if (v3Var != null) {
                    v3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.h6.v(-1, i10);
            m3Var.f39900x = v9;
            if (m3Var == i4Var.f38661u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    i4Var.f38649h0.setMenuColors(v9);
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
        this.f39898s = false;
        this.v = false;
        setWeb(null);
        k3 k3Var = this.f39895f;
        k3Var.h();
        k3Var.f43179a = null;
        int i10 = org.telegram.ui.ActionBar.h6.Pk;
        this.f39899w = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i10, false);
        this.f39900x = x02;
        d3 d3Var = this.f39897r;
        if (d3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            d3Var.b(z10, true);
            this.f39897r.setBackgroundColor(this.f39900x);
            d3 d3Var2 = this.f39897r;
            this.f39896n = false;
            AndroidUtilities.updateViewVisibilityAnimated(d3Var2, false, 1.0f, false);
        }
        g4 g4Var = this.f39893c;
        g4Var.E = null;
        g4Var.f37918e.clear();
        g4Var.f37919f.clear();
        g4Var.f37922s.clear();
        g4Var.v.clear();
        g4Var.h.clear();
        g4Var.f37921r.clear();
        g4Var.f37920n.clear();
        g4Var.f37924x.clear();
        g4Var.f37923w.clear();
        g4Var.F = null;
        g4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f39891a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        g4 g4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (g4Var = this.f39893c) != null && (webPage = g4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        if (this.f39891a == 1) {
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
            j3 j3Var = this.f39894e;
            j3Var.setSwipeOffsetY(j3Var.getTopActionBarOffsetY() + (-j3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f39899w;
        }
        int i10 = org.telegram.ui.ActionBar.h6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.h6.x0(null, i10, false);
    }

    public g4 getAdapter() {
        return this.f39893c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f39896n) {
                return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
            }
            return this.f39900x;
        }
        return org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            ci.v vVar = this.f39892b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f47893f;
                }
                if (i10 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f39894e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.wm0 getListView() {
        return this.f39892b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
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
            s4.d0 d0Var = this.d;
            int L0 = d0Var.L0();
            View m11 = d0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f39893c.I;
                ci.v vVar = this.f39892b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = d0Var.N0();
                    if (v3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = d0Var.B() - 2;
                    if (N0 >= B2) {
                        m10 = d0Var.m(B2);
                    } else {
                        m10 = d0Var.m(L0);
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
        } else if (f() && (webView = this.f39895f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        String uri;
        String[] split;
        l0 l0Var;
        if (!f() || (webView = this.f39895f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
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
                        String a2 = of.f.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (l0Var = this.K.f38649h0) != null && ci.d4.g(a2, l0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
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
        org.telegram.ui.web.y0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f39893c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f39895f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.b1 getWebContainer() {
        return this.f39895f;
    }

    public org.telegram.ui.web.y0 getWebView() {
        k3 k3Var = this.f39895f;
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
        if (this.f39896n && (d3Var = this.f39897r) != null) {
            int i10 = org.telegram.ui.ActionBar.h6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.x0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            d3Var.b(z10, false);
            this.f39897r.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f39895f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        i4 i4Var = this.K;
        i4Var.f0();
        if (i4Var.f38647f0.f21518f) {
            i4Var.f38648g0.invalidate();
        }
        if (i4Var.f38647f0.f21517e) {
            i4Var.f38648g0.invalidate();
            i4Var.X((int) (((AndroidUtilities.dp(56.0f) - i4Var.f38647f0.h) * (f7 / getMeasuredWidth())) + i4Var.f38647f0.h));
        }
        v3 v3Var = i4Var.K;
        if (v3Var != null) {
            v3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f39891a != i10) {
            b();
        }
        this.f39891a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39892b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.f39894e.setVisibility(i12);
    }

    public void setWeb(z2 z2Var) {
        z2 z2Var2 = this.J;
        if (z2Var2 != z2Var) {
            if (z2Var2 != null) {
                z2Var2.c(this);
            }
            this.J = z2Var;
            if (z2Var != null) {
                org.telegram.ui.web.y0 y0Var = z2Var.f21105b;
                k3 k3Var = this.f39895f;
                if (y0Var != null) {
                    y0Var.onResume();
                    k3Var.N(UserConfig.selectedAccount, z2Var.f21105b, z2Var.d, z2Var.f21124x, false);
                    a(this, true, z2Var.f21118q);
                    a(this, false, z2Var.f21119r);
                } else {
                    String str = z2Var.f21124x;
                    if (str != null) {
                        k3Var.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.f39901y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.f39901y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f43250j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f43250j = null;
                }
                this.f39901y = null;
            }
        }
    }
}
