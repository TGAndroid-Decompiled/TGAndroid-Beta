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
    public int f35794a;
    public final ci.v f35795b;
    public final h4 f35796c;
    public final s4.c0 d;
    public final k3 e;
    public final l3 f35797f;
    public boolean h;
    public boolean f35798n;
    public e3 f35799r;
    public boolean f35800s;
    public boolean v;
    public int f35801w;
    public int f35802x;
    public org.telegram.ui.web.h2 f35803y;

    public n3(j4 j4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = j4Var;
        int i10 = org.telegram.ui.ActionBar.i6.Pk;
        this.f35801w = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        this.f35802x = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        ci.v vVar = new ci.v(this, activity);
        this.f35795b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.j) vVar.getItemAnimator()).C = false;
        if (j4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        h4 h4Var = new h4(j4Var, activity, z10);
        this.f35796c = h4Var;
        vVar.setAdapter(h4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        vVar.setLayoutManager(c0Var);
        vVar.setOnScrollListener(new j3(this, 0));
        addView(vVar, w7.y5.c(-1.0f, -1));
        k3 k3Var = new k3(this, getContext());
        this.e = k3Var;
        k3Var.setShouldWaitWebViewScroll(true);
        k3Var.setFullSize(true);
        k3Var.setAllowFullSizeSwipe(true);
        l3 l3Var = new l3(this, getContext(), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false));
        this.f35797f = l3Var;
        l3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final n3 f34118b;

            {
                this.f34118b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f34118b.K;
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
                                                if (n3Var.J == j4Var2) {
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f34118b.f35797f.o(true, false);
                        return;
                    default:
                        n3 n3Var2 = this.f34118b;
                        k3 k3Var2 = n3Var2.e;
                        n3Var2.f35797f.o(false, false);
                        e3 e3Var = n3Var2.f35799r;
                        if (e3Var != null) {
                            e3Var.f33111a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var2.K.f0();
                        return;
                }
            }
        });
        l3Var.setWebViewProgressListener(new i3(this, 0));
        l3Var.setDelegate(new m3(this));
        l3Var.setWebViewScrollListener(new g(this, 2));
        k3Var.addView(l3Var, w7.y5.c(-1.0f, -1));
        k3Var.setScrollEndListener(new Runnable(this) {
            public final n3 f34118b;

            {
                this.f34118b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f34118b.K;
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
                                                if (n3Var.J == j4Var2) {
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f34118b.f35797f.o(true, false);
                        return;
                    default:
                        n3 n3Var2 = this.f34118b;
                        k3 k3Var2 = n3Var2.e;
                        n3Var2.f35797f.o(false, false);
                        e3 e3Var = n3Var2.f35799r;
                        if (e3Var != null) {
                            e3Var.f33111a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var2.K.f0();
                        return;
                }
            }
        });
        k3Var.setDelegate(new a1(this, 1));
        k3Var.setScrollListener(new Runnable(this) {
            public final n3 f34118b;

            {
                this.f34118b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        j4 j4Var2 = this.f34118b.K;
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
                                                if (n3Var.J == j4Var2) {
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
                            j4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f34118b.f35797f.o(true, false);
                        return;
                    default:
                        n3 n3Var2 = this.f34118b;
                        k3 k3Var2 = n3Var2.e;
                        n3Var2.f35797f.o(false, false);
                        e3 e3Var = n3Var2.f35799r;
                        if (e3Var != null) {
                            e3Var.f33111a.setTranslationY(((k3Var2.getTopActionBarOffsetY() + (-k3Var2.getOffsetY())) - k3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        n3Var2.K.f0();
                        return;
                }
            }
        });
        k3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(k3Var, w7.y5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(n3 n3Var, boolean z10, int i10) {
        j4 j4Var = n3Var.K;
        w3 w3Var = j4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.i6.v(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false), i10);
            n3Var.f35801w = v;
            if (n3Var == j4Var.f34627u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.f34615h0.d(v, true);
                }
                if (w3Var != null) {
                    w3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.i6.v(-1, i10);
            n3Var.f35802x = v9;
            if (n3Var == j4Var.f34627u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    j4Var.f34615h0.setMenuColors(v9);
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
        this.f35800s = false;
        this.v = false;
        setWeb(null);
        l3 l3Var = this.f35797f;
        l3Var.i();
        l3Var.f38958a = null;
        int i10 = org.telegram.ui.ActionBar.i6.Pk;
        this.f35801w = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i10, false);
        this.f35802x = w02;
        e3 e3Var = this.f35799r;
        if (e3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3Var.b(z10, true);
            this.f35799r.setBackgroundColor(this.f35802x);
            e3 e3Var2 = this.f35799r;
            this.f35798n = false;
            AndroidUtilities.updateViewVisibilityAnimated(e3Var2, false, 1.0f, false);
        }
        h4 h4Var = this.f35796c;
        h4Var.E = null;
        h4Var.e.clear();
        h4Var.f34124f.clear();
        h4Var.f34127s.clear();
        h4Var.v.clear();
        h4Var.h.clear();
        h4Var.f34126r.clear();
        h4Var.f34125n.clear();
        h4Var.f34129x.clear();
        h4Var.f34128w.clear();
        h4Var.F = null;
        h4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f35794a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        h4 h4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (h4Var = this.f35796c) != null && (webPage = h4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        if (!f() || (webView = getWebView()) == null || (v = org.telegram.ui.web.c1.v(webView.getUrl())) == null || !org.telegram.ui.web.c1.q(Uri.parse(v))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f35794a == 1) {
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
            return this.f35801w;
        }
        int i10 = org.telegram.ui.ActionBar.i6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.i6.w0(null, i10, false);
    }

    public h4 getAdapter() {
        return this.f35796c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f35798n) {
                return org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
            }
            return this.f35802x;
        }
        return org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            ci.v vVar = this.f35795b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.V(childAt).f43008f;
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

    public org.telegram.ui.Components.yl0 getListView() {
        return this.f35795b;
    }

    public float getProgress() {
        org.telegram.ui.web.z0 webView;
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
                int[] iArr = this.f35796c.I;
                ci.v vVar = this.f35795b;
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
                    return Utilities.clamp01((i10 + i11) / Math.max(1, h4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f35797f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.z0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f35797f.getWebView()) == null) {
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
                        if (a2.split("\\.").length > 2 && (m0Var = this.K.f34615h0) != null && ci.e4.g(a2, m0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
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
        org.telegram.ui.web.z0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f35796c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f35797f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.c1 getWebContainer() {
        return this.f35797f;
    }

    public org.telegram.ui.web.z0 getWebView() {
        l3 l3Var = this.f35797f;
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
        if (this.f35798n && (e3Var = this.f35799r) != null) {
            int i10 = org.telegram.ui.ActionBar.i6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            e3Var.b(z10, false);
            this.f35799r.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f35797f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        j4 j4Var = this.K;
        j4Var.f0();
        if (j4Var.f34613f0.f19981f) {
            j4Var.f34614g0.invalidate();
        }
        if (j4Var.f34613f0.e) {
            j4Var.f34614g0.invalidate();
            j4Var.X((int) (((AndroidUtilities.dp(56.0f) - j4Var.f34613f0.h) * (f7 / getMeasuredWidth())) + j4Var.f34613f0.h));
        }
        w3 w3Var = j4Var.K;
        if (w3Var != null) {
            w3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f35794a != i10) {
            b();
        }
        this.f35794a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f35795b.setVisibility(i11);
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
                org.telegram.ui.web.z0 z0Var = a3Var.f19650b;
                l3 l3Var = this.f35797f;
                if (z0Var != null) {
                    z0Var.onResume();
                    l3Var.O(UserConfig.selectedAccount, a3Var.f19650b, a3Var.d, a3Var.f19668x, false);
                    a(this, true, a3Var.f19662q);
                    a(this, false, a3Var.f19663r);
                } else {
                    String str = a3Var.f19668x;
                    if (str != null) {
                        l3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.h2 h2Var = this.f35803y;
            if (h2Var != null) {
                h2Var.a();
                org.telegram.ui.web.h2 h2Var2 = this.f35803y;
                TLRPC.TL_webPage tL_webPage = h2Var2.f39041j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.j2.o(tL_webPage);
                    h2Var2.f39041j = null;
                }
                this.f35803y = null;
            }
        }
    }
}
