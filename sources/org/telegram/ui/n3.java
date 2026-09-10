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
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public a3 J;
    public final j4 K;
    public int f35101a;
    public final bi.z f35102b;
    public final h4 f35103c;
    public final s4.c0 d;
    public final k3 e;
    public final l3 f35104f;
    public boolean h;
    public boolean f35105n;
    public e3 f35106r;
    public boolean f35107s;
    public boolean v;
    public int f35108w;
    public int f35109x;
    public org.telegram.ui.web.i2 f35110y;

    public n3(j4 j4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = j4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f35108w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f35109x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        bi.z zVar = new bi.z(this, activity);
        this.f35102b = zVar;
        zVar.setClipToPadding(false);
        zVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        zVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.j) zVar.getItemAnimator()).C = false;
        if (j4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4 h4Var = new h4(j4Var, activity, z10);
        this.f35103c = h4Var;
        zVar.setAdapter(h4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        zVar.setLayoutManager(c0Var);
        zVar.setOnScrollListener(new j3(this, 0));
        addView(zVar, w7.a6.c(-1.0f, -1));
        k3 k3Var = new k3(this, getContext());
        this.e = k3Var;
        k3Var.setShouldWaitWebViewScroll(true);
        k3Var.setFullSize(true);
        k3Var.setAllowFullSizeSwipe(true);
        l3 l3Var = new l3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
        this.f35104f = l3Var;
        l3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final n3 f33257b;

            {
                this.f33257b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f33257b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
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
                                                if (p3Var.J == j4Var2) {
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f33257b.f35104f.o(true, false);
                        return;
                    default:
                        n3 n3Var = this.f33257b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f35104f.o(false, false);
                        e3 e3Var = n3Var.f35106r;
                        if (e3Var != null) {
                            e3Var.f32039a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.K.f0();
                        return;
                }
            }
        });
        l3Var.setWebViewProgressListener(new i3(this, 0));
        l3Var.setDelegate(new m3(this));
        l3Var.setWebViewScrollListener(new g(this, 2));
        k3Var.addView(l3Var, w7.a6.c(-1.0f, -1));
        k3Var.setScrollEndListener(new Runnable(this) {
            public final n3 f33257b;

            {
                this.f33257b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f33257b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
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
                                                if (p3Var.J == j4Var2) {
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f33257b.f35104f.o(true, false);
                        return;
                    default:
                        n3 n3Var = this.f33257b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f35104f.o(false, false);
                        e3 e3Var = n3Var.f35106r;
                        if (e3Var != null) {
                            e3Var.f32039a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.K.f0();
                        return;
                }
            }
        });
        k3Var.setDelegate(new a1(this, 1));
        k3Var.setScrollListener(new Runnable(this) {
            public final n3 f33257b;

            {
                this.f33257b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f33257b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
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
                                                if (p3Var.J == j4Var2) {
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f33257b.f35104f.o(true, false);
                        return;
                    default:
                        n3 n3Var = this.f33257b;
                        k3 k3Var2 = n3Var.e;
                        n3Var.f35104f.o(false, false);
                        e3 e3Var = n3Var.f35106r;
                        if (e3Var != null) {
                            e3Var.f32039a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var.K.f0();
                        return;
                }
            }
        });
        k3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(k3Var, w7.a6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(n3 n3Var, boolean z10, int i10) {
        j4 j4Var = n3Var.K;
        w3 w3Var = j4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            n3Var.f35108w = v;
            if (n3Var == j4Var.f33920u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.f33908h0.d(v, true);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            n3Var.f35109x = v9;
            if (n3Var == j4Var.f33920u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.f33908h0.setMenuColors(v9);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        }
        j4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f35107s = false;
        this.v = false;
        setWeb(null);
        l3 l3Var = this.f35104f;
        l3Var.i();
        l3Var.f37876a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f35108w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f35109x = w02;
        e3 e3Var = this.f35106r;
        if (e3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3Var.b(z10, true);
            this.f35106r.setBackgroundColor(this.f35109x);
            e3 e3Var2 = this.f35106r;
            this.f35105n = false;
            AndroidUtilities.updateViewVisibilityAnimated(e3Var2, false, 1.0f, false);
        }
        h4 h4Var = this.f35103c;
        h4Var.E = null;
        h4Var.e.clear();
        h4Var.f33261f.clear();
        h4Var.f33264s.clear();
        h4Var.v.clear();
        h4Var.h.clear();
        h4Var.f33263r.clear();
        h4Var.f33262n.clear();
        h4Var.f33266x.clear();
        h4Var.f33265w.clear();
        h4Var.F = null;
        h4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f35101a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        h4 h4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (h4Var = this.f35103c) != null && (webPage = h4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        String v;
        if (!f() || (webView = getWebView()) == null || (v = org.telegram.ui.web.c1.v(webView.getUrl())) == null || !org.telegram.ui.web.c1.q(Uri.parse(v))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f35101a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            w3 w3Var = this.K.K;
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
            return this.f35108w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public h4 getAdapter() {
        return this.f35103c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f35105n) {
                return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            return this.f35109x;
        }
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            bi.z zVar = this.f35102b;
            float height = zVar.getHeight();
            for (int i11 = 0; i11 < zVar.getChildCount(); i11++) {
                View childAt = zVar.getChildAt(i11);
                if (zVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    zVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f41613f;
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

    public org.telegram.ui.Components.vl0 getListView() {
        return this.f35102b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
        h4 h4Var;
        int i10;
        int B;
        View m10;
        float min;
        w3 w3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            View m11 = c0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f35103c.I;
                bi.z zVar = this.f35102b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = c0Var.N0();
                    if (w3Var != null) {
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
                            min = (((B2 - L0) * width) * (zVar.getMeasuredHeight() - m10.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m10.getTop() - zVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
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
                    return Utilities.clamp01((i10 + i11) / Math.max(1, h4Var.J - zVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f35104f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        String uri;
        String[] split;
        l0 l0Var;
        if (!f() || (webView = this.f35104f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.c1.v(url));
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
                        String a2 = nf.f.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (l0Var = this.K.f33908h0) != null && bi.x4.g(a2, l0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = nf.f.v(parse, null, "", a2, null);
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
        org.telegram.ui.web.y0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f35103c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f35104f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.c1 getWebContainer() {
        return this.f35104f;
    }

    public org.telegram.ui.web.y0 getWebView() {
        l3 l3Var = this.f35104f;
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
        if (this.f35105n && (e3Var = this.f35106r) != null) {
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3Var.b(z10, false);
            this.f35106r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f35104f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        j4 j4Var = this.K;
        j4Var.f0();
        if (j4Var.f33906f0.f18842f) {
            j4Var.f33907g0.invalidate();
        }
        if (j4Var.f33906f0.e) {
            j4Var.f33907g0.invalidate();
            j4Var.X((int) (((AndroidUtilities.dp(56.0f) - j4Var.f33906f0.h) * (f7 / getMeasuredWidth())) + j4Var.f33906f0.h));
        }
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f35101a != i10) {
            b();
        }
        this.f35101a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f35102b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(a3 a3Var) {
        a3 a3Var2 = this.J;
        if (a3Var2 != a3Var) {
            if (a3Var2 != null) {
                a3Var2.c(this);
            }
            this.J = a3Var;
            if (a3Var != null) {
                org.telegram.ui.web.y0 y0Var = a3Var.f18541b;
                l3 l3Var = this.f35104f;
                if (y0Var != null) {
                    y0Var.onResume();
                    l3Var.O(UserConfig.selectedAccount, a3Var.f18541b, a3Var.d, a3Var.f18559x, false);
                    a(this, true, a3Var.f18553q);
                    a(this, false, a3Var.f18554r);
                } else {
                    String str = a3Var.f18559x;
                    if (str != null) {
                        l3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.i2 i2Var = this.f35110y;
            if (i2Var != null) {
                i2Var.a();
                org.telegram.ui.web.i2 i2Var2 = this.f35110y;
                TLRPC.TL_webPage tL_webPage = i2Var2.f37968j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.k2.o(tL_webPage);
                    i2Var2.f37968j = null;
                }
                this.f35110y = null;
            }
        }
    }
}
