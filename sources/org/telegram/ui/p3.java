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
    public boolean B;
    public String C;
    public String D;
    public boolean E;
    public float F;
    public b3 G;
    public final l4 H;
    public int f39861a;
    public final k3 f39862b;
    public final j4 f39863c;
    public final f2.j0 d;
    public final m3 f39864e;
    public final n3 f39865f;
    public boolean h;
    public boolean f39866n;
    public f3 f39867r;
    public boolean f39868s;
    public boolean v;
    public int f39869w;
    public int f39870x;
    public org.telegram.ui.web.f2 f39871y;

    public p3(l4 l4Var, Activity activity) {
        super(activity);
        boolean z4;
        this.H = l4Var;
        int i10 = org.telegram.ui.ActionBar.k6.Pk;
        this.f39869w = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        this.f39870x = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        this.B = false;
        this.F = -1.0f;
        new Matrix();
        k3 k3Var = new k3(this, activity);
        this.f39862b = k3Var;
        k3Var.setClipToPadding(false);
        k3Var.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        k3Var.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((f2.l) k3Var.getItemAnimator()).C = false;
        if (l4Var.H != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        j4 j4Var = new j4(l4Var, activity, z4);
        this.f39863c = j4Var;
        k3Var.setAdapter(j4Var);
        f2.j0 j0Var = new f2.j0(1, false);
        this.d = j0Var;
        k3Var.setLayoutManager(j0Var);
        k3Var.setOnScrollListener(new l3(this, 0));
        addView(k3Var, k7.c6.c(-1.0f, -1));
        m3 m3Var = new m3(this, getContext());
        this.f39864e = m3Var;
        m3Var.setShouldWaitWebViewScroll(true);
        m3Var.setFullSize(true);
        m3Var.setAllowFullSizeSwipe(true);
        n3 n3Var = new n3(this, getContext(), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false));
        this.f39865f = n3Var;
        n3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final p3 f37534b;

            {
                this.f37534b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f37534b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.n3 n3Var2 = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var2.H == l4Var2) {
                                                    z10 = P.h(i11, n3Var2, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37534b.f39865f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f37534b;
                        m3 m3Var2 = p3Var.f39864e;
                        p3Var.f39865f.n(false, false);
                        f3 f3Var = p3Var.f39867r;
                        if (f3Var != null) {
                            f3Var.f36639a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        return;
                }
            }
        });
        n3Var.setWebViewProgressListener(new j3(this, 0));
        n3Var.setDelegate(new o3(this));
        n3Var.setWebViewScrollListener(new h(this, 2));
        m3Var.addView(n3Var, k7.c6.c(-1.0f, -1));
        m3Var.setScrollEndListener(new Runnable(this) {
            public final p3 f37534b;

            {
                this.f37534b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f37534b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.n3 n3Var2 = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var2.H == l4Var2) {
                                                    z10 = P.h(i11, n3Var2, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37534b.f39865f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f37534b;
                        m3 m3Var2 = p3Var.f39864e;
                        p3Var.f39865f.n(false, false);
                        f3 f3Var = p3Var.f39867r;
                        if (f3Var != null) {
                            f3Var.f36639a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        return;
                }
            }
        });
        m3Var.setDelegate(new a1(this, 1));
        m3Var.setScrollListener(new Runnable(this) {
            public final p3 f37534b;

            {
                this.f37534b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f37534b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.o3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.o3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.n3 n3Var2 = (org.telegram.ui.ActionBar.n3) obj;
                                                if (n3Var2.H == l4Var2) {
                                                    z10 = P.h(i11, n3Var2, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i11++;
                                    }
                                }
                                if (z10) {
                                    return;
                                }
                            }
                            l4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f37534b.f39865f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f37534b;
                        m3 m3Var2 = p3Var.f39864e;
                        p3Var.f39865f.n(false, false);
                        f3 f3Var = p3Var.f39867r;
                        if (f3Var != null) {
                            f3Var.f36639a.setTranslationY(((m3Var2.getTopActionBarOffsetY() + (-m3Var2.getOffsetY())) - m3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        return;
                }
            }
        });
        m3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(m3Var, k7.c6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(p3 p3Var, boolean z4, int i10) {
        l4 l4Var = p3Var.H;
        y3 y3Var = l4Var.H;
        if (z4) {
            int v = org.telegram.ui.ActionBar.k6.v(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false), i10);
            p3Var.f39869w = v;
            if (p3Var == l4Var.f38524r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f38512e0.d(v, true);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.k6.v(-1, i10);
            p3Var.f39870x = v10;
            if (p3Var == l4Var.f38524r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f38512e0.setMenuColors(v10);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        }
        l4Var.f0();
    }

    public final void b() {
        boolean z4;
        this.f39868s = false;
        this.v = false;
        setWeb(null);
        n3 n3Var = this.f39865f;
        n3Var.h();
        n3Var.f42429a = null;
        int i10 = org.telegram.ui.ActionBar.k6.Pk;
        this.f39869w = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.k6.w0(null, i10, false);
        this.f39870x = w02;
        f3 f3Var = this.f39867r;
        if (f3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z4 = true;
            } else {
                z4 = false;
            }
            f3Var.b(z4, true);
            this.f39867r.setBackgroundColor(this.f39870x);
            f3 f3Var2 = this.f39867r;
            this.f39866n = false;
            AndroidUtilities.updateViewVisibilityAnimated(f3Var2, false, 1.0f, false);
        }
        j4 j4Var = this.f39863c;
        j4Var.B = null;
        j4Var.f37836e.clear();
        j4Var.f37837f.clear();
        j4Var.f37840s.clear();
        j4Var.v.clear();
        j4Var.h.clear();
        j4Var.f37839r.clear();
        j4Var.f37838n.clear();
        j4Var.f37842x.clear();
        j4Var.f37841w.clear();
        j4Var.C = null;
        j4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f39861a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        j4 j4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (j4Var = this.f39863c) != null && (webPage = j4Var.B) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        String s6;
        if (!f() || (webView = getWebView()) == null || (s6 = org.telegram.ui.web.a1.s(webView.getUrl())) == null || !org.telegram.ui.web.a1.o(Uri.parse(s6))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f39861a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            y3 y3Var = this.H.H;
            int i11 = 0;
            if (y3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (y3Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            m3 m3Var = this.f39864e;
            m3Var.setSwipeOffsetY(m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f39869w;
        }
        int i10 = org.telegram.ui.ActionBar.k6.Pk;
        this.H.getClass();
        return org.telegram.ui.ActionBar.k6.w0(null, i10, false);
    }

    public j4 getAdapter() {
        return this.f39863c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f39866n) {
                return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false);
            }
            return this.f39870x;
        }
        return org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            k3 k3Var = this.f39862b;
            float height = k3Var.getHeight();
            for (int i11 = 0; i11 < k3Var.getChildCount(); i11++) {
                View childAt = k3Var.getChildAt(i11);
                if (k3Var.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    k3Var.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f5879f;
                }
                if (i10 == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (f()) {
            return this.f39864e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public org.telegram.ui.Components.sl0 getListView() {
        return this.f39862b;
    }

    public float getProgress() {
        org.telegram.ui.web.x0 webView;
        j4 j4Var;
        int i10;
        int B;
        View m9;
        float min;
        y3 y3Var = this.H.H;
        if (c()) {
            float f10 = this.F;
            if (f10 >= 0.0f) {
                return f10;
            }
            f2.j0 j0Var = this.d;
            int L0 = j0Var.L0();
            View m10 = j0Var.m(L0);
            if (m10 != null) {
                int[] iArr = this.f39863c.F;
                k3 k3Var = this.f39862b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = j0Var.N0();
                    if (y3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = j0Var.B() - 2;
                    if (N0 >= B2) {
                        m9 = j0Var.m(B2);
                    } else {
                        m9 = j0Var.m(L0);
                    }
                    if (m9 != null) {
                        float width = getWidth() / (B - 1);
                        float measuredHeight = m9.getMeasuredHeight();
                        if (N0 >= B2) {
                            min = (((B2 - L0) * width) * (k3Var.getMeasuredHeight() - m9.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m9.getTop() - k3Var.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
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
                    if (L0 != 0 || y3Var == null) {
                        i11 = -m10.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, j4Var.G - k3Var.getHeight()));
                }
            }
        } else if (f() && (webView = this.f39865f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.x0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f39865f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.C, webView.getUrl())) {
            return this.D;
        }
        try {
            String url = webView.getUrl();
            this.C = url;
            Uri parse = Uri.parse(org.telegram.ui.web.a1.s(url));
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
                        String a2 = af.g.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (m0Var = this.H.f38512e0) != null && qh.e3.g(a2, m0Var.B) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = af.g.v(parse, null, "", a2, null);
                    } catch (Exception e6) {
                        FileLog.e((Throwable) e6, false);
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
            this.D = uri;
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
            TLRPC.WebPage webPage = this.f39863c.B;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f39865f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.a1 getWebContainer() {
        return this.f39865f;
    }

    public org.telegram.ui.web.x0 getWebView() {
        n3 n3Var = this.f39865f;
        if (n3Var != null) {
            return n3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        f3 f3Var;
        boolean z4;
        super.onAttachedToWindow();
        if (this.f39866n && (f3Var = this.f39867r) != null) {
            int i10 = org.telegram.ui.ActionBar.k6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(null, i10, false)) <= 0.721f) {
                z4 = true;
            } else {
                z4 = false;
            }
            f3Var.b(z4, false);
            this.f39867r.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z4) {
        if (this.E != z4) {
            this.E = z4;
            this.f39865f.setKeyboardFocusable(z4);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        l4 l4Var = this.H;
        l4Var.f0();
        if (l4Var.f38510c0.f22513f) {
            l4Var.f38511d0.invalidate();
        }
        if (l4Var.f38510c0.f22512e) {
            l4Var.f38511d0.invalidate();
            l4Var.X((int) (((AndroidUtilities.dp(56.0f) - l4Var.f38510c0.h) * (f10 / getMeasuredWidth())) + l4Var.f38510c0.h));
        }
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            y3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f39861a != i10) {
            b();
        }
        this.f39861a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f39862b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.f39864e.setVisibility(i12);
    }

    public void setWeb(b3 b3Var) {
        b3 b3Var2 = this.G;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.c(this);
            }
            this.G = b3Var;
            if (b3Var != null) {
                org.telegram.ui.web.x0 x0Var = b3Var.f22163b;
                n3 n3Var = this.f39865f;
                if (x0Var != null) {
                    x0Var.onResume();
                    int i10 = UserConfig.selectedAccount;
                    org.telegram.ui.web.x0 x0Var2 = b3Var.f22163b;
                    Object obj = b3Var.d;
                    n3Var.J = i10;
                    n3Var.Q(x0Var2, obj);
                    if (n3Var.f42445l0) {
                        n3Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, b3Var.f22174o);
                    a(this, false, b3Var.f22175p);
                } else {
                    String str = b3Var.v;
                    if (str != null) {
                        n3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.f39871y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.f39871y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f42511j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f42511j = null;
                }
                this.f39871y = null;
            }
        }
    }
}
