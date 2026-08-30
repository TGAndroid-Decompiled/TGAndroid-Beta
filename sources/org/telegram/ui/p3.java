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
    public int f37158a;
    public final k3 f37159b;
    public final j4 f37160c;
    public final f2.i0 d;
    public final m3 e;
    public final n3 f37161f;
    public boolean h;
    public boolean f37162n;
    public f3 f37163r;
    public boolean f37164s;
    public boolean v;
    public int f37165w;
    public int f37166x;
    public org.telegram.ui.web.e2 f37167y;

    public p3(l4 l4Var, Activity activity) {
        super(activity);
        boolean z4;
        this.H = l4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f37165w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f37166x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.B = false;
        this.F = -1.0f;
        new Matrix();
        k3 k3Var = new k3(this, activity);
        this.f37159b = k3Var;
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
        this.f37160c = j4Var;
        k3Var.setAdapter(j4Var);
        f2.i0 i0Var = new f2.i0(1, false);
        this.d = i0Var;
        k3Var.setLayoutManager(i0Var);
        k3Var.setOnScrollListener(new l3(this, 0));
        addView(k3Var, k7.b6.c(-1.0f, -1));
        m3 m3Var = new m3(this, getContext());
        this.e = m3Var;
        m3Var.setShouldWaitWebViewScroll(true);
        m3Var.setFullSize(true);
        m3Var.setAllowFullSizeSwipe(true);
        n3 n3Var = new n3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        this.f37161f = n3Var;
        n3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final p3 f35003b;

            {
                this.f35003b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f35003b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.H == l4Var2) {
                                                    z10 = P.h(i11, m3Var2, true);
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
                        this.f35003b.f37161f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f35003b;
                        m3 m3Var3 = p3Var.e;
                        p3Var.f37161f.n(false, false);
                        f3 f3Var = p3Var.f37163r;
                        if (f3Var != null) {
                            f3Var.f34146a.setTranslationY(((m3Var3.getTopActionBarOffsetY() + (-m3Var3.getOffsetY())) - m3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        return;
                }
            }
        });
        n3Var.setWebViewProgressListener(new j3(this, 0));
        n3Var.setDelegate(new o3(this));
        n3Var.setWebViewScrollListener(new h(this, 2));
        m3Var.addView(n3Var, k7.b6.c(-1.0f, -1));
        m3Var.setScrollEndListener(new Runnable(this) {
            public final p3 f35003b;

            {
                this.f35003b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f35003b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.H == l4Var2) {
                                                    z10 = P.h(i11, m3Var2, true);
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
                        this.f35003b.f37161f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f35003b;
                        m3 m3Var3 = p3Var.e;
                        p3Var.f37161f.n(false, false);
                        f3 f3Var = p3Var.f37163r;
                        if (f3Var != null) {
                            f3Var.f34146a.setTranslationY(((m3Var3.getTopActionBarOffsetY() + (-m3Var3.getOffsetY())) - m3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        return;
                }
            }
        });
        m3Var.setDelegate(new a1(this, 1));
        m3Var.setScrollListener(new Runnable(this) {
            public final p3 f35003b;

            {
                this.f35003b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        l4 l4Var2 = this.f35003b.H;
                        LaunchActivity launchActivity = LaunchActivity.D1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.n3 P = launchActivity.P();
                            if (P != null) {
                                boolean z10 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.n3.H;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.m3 m3Var2 = (org.telegram.ui.ActionBar.m3) obj;
                                                if (m3Var2.H == l4Var2) {
                                                    z10 = P.h(i11, m3Var2, true);
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
                        this.f35003b.f37161f.n(true, false);
                        return;
                    default:
                        p3 p3Var = this.f35003b;
                        m3 m3Var3 = p3Var.e;
                        p3Var.f37161f.n(false, false);
                        f3 f3Var = p3Var.f37163r;
                        if (f3Var != null) {
                            f3Var.f34146a.setTranslationY(((m3Var3.getTopActionBarOffsetY() + (-m3Var3.getOffsetY())) - m3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        p3Var.H.f0();
                        return;
                }
            }
        });
        m3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(m3Var, k7.b6.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(p3 p3Var, boolean z4, int i10) {
        l4 l4Var = p3Var.H;
        y3 y3Var = l4Var.H;
        if (z4) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            p3Var.f37165w = v;
            if (p3Var == l4Var.f35945r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f35933e0.d(v, true);
                }
                if (y3Var != null) {
                    y3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            p3Var.f37166x = v10;
            if (p3Var == l4Var.f35945r0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    l4Var.f35933e0.setMenuColors(v10);
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
        this.f37164s = false;
        this.v = false;
        setWeb(null);
        n3 n3Var = this.f37161f;
        n3Var.h();
        n3Var.f39420a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f37165w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f37166x = w02;
        f3 f3Var = this.f37163r;
        if (f3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z4 = true;
            } else {
                z4 = false;
            }
            f3Var.b(z4, true);
            this.f37163r.setBackgroundColor(this.f37166x);
            f3 f3Var2 = this.f37163r;
            this.f37162n = false;
            AndroidUtilities.updateViewVisibilityAnimated(f3Var2, false, 1.0f, false);
        }
        j4 j4Var = this.f37160c;
        j4Var.B = null;
        j4Var.e.clear();
        j4Var.f35224f.clear();
        j4Var.f35227s.clear();
        j4Var.v.clear();
        j4Var.h.clear();
        j4Var.f35226r.clear();
        j4Var.f35225n.clear();
        j4Var.f35229x.clear();
        j4Var.f35228w.clear();
        j4Var.C = null;
        j4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f37158a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        j4 j4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (j4Var = this.f37160c) != null && (webPage = j4Var.B) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        org.telegram.ui.web.w0 webView;
        String s6;
        if (!f() || (webView = getWebView()) == null || (s6 = org.telegram.ui.web.a1.s(webView.getUrl())) == null || !org.telegram.ui.web.a1.o(Uri.parse(s6))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f37158a == 1) {
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
            m3 m3Var = this.e;
            m3Var.setSwipeOffsetY(m3Var.getTopActionBarOffsetY() + (-m3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f37165w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.H.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public j4 getAdapter() {
        return this.f37160c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f37162n) {
                return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            return this.f37166x;
        }
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            k3 k3Var = this.f37159b;
            float height = k3Var.getHeight();
            for (int i11 = 0; i11 < k3Var.getChildCount(); i11++) {
                View childAt = k3Var.getChildAt(i11);
                if (k3Var.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    k3Var.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f5788f;
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

    public org.telegram.ui.Components.sl0 getListView() {
        return this.f37159b;
    }

    public float getProgress() {
        org.telegram.ui.web.w0 webView;
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
            f2.i0 i0Var = this.d;
            int L0 = i0Var.L0();
            View m10 = i0Var.m(L0);
            if (m10 != null) {
                int[] iArr = this.f37160c.F;
                k3 k3Var = this.f37159b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = i0Var.N0();
                    if (y3Var != null) {
                        if (L0 < 1) {
                            L0 = 1;
                        }
                        if (N0 < 1) {
                            N0 = 1;
                        }
                    }
                    int B2 = i0Var.B() - 2;
                    if (N0 >= B2) {
                        m9 = i0Var.m(B2);
                    } else {
                        m9 = i0Var.m(L0);
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
        } else if (f() && (webView = this.f37161f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.w0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f37161f.getWebView()) == null) {
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
                        if (a2.split("\\.").length > 2 && (m0Var = this.H.f35933e0) != null && ph.f3.g(a2, m0Var.B) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = af.g.v(parse, null, "", a2, null);
                    } catch (Exception e) {
                        FileLog.e((Throwable) e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e6) {
                FileLog.e(e6);
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
        org.telegram.ui.web.w0 webView;
        String str;
        String str2;
        if (c()) {
            TLRPC.WebPage webPage = this.f37160c.B;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f37161f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.a1 getWebContainer() {
        return this.f37161f;
    }

    public org.telegram.ui.web.w0 getWebView() {
        n3 n3Var = this.f37161f;
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
        if (this.f37162n && (f3Var = this.f37163r) != null) {
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f) {
                z4 = true;
            } else {
                z4 = false;
            }
            f3Var.b(z4, false);
            this.f37163r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z4) {
        if (this.E != z4) {
            this.E = z4;
            this.f37161f.setKeyboardFocusable(z4);
        }
    }

    @Override
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        l4 l4Var = this.H;
        l4Var.f0();
        if (l4Var.f35931c0.f20792f) {
            l4Var.f35932d0.invalidate();
        }
        if (l4Var.f35931c0.e) {
            l4Var.f35932d0.invalidate();
            l4Var.X((int) (((AndroidUtilities.dp(56.0f) - l4Var.f35931c0.h) * (f10 / getMeasuredWidth())) + l4Var.f35931c0.h));
        }
        y3 y3Var = l4Var.H;
        if (y3Var != null) {
            y3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f37158a != i10) {
            b();
        }
        this.f37158a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f37159b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(b3 b3Var) {
        b3 b3Var2 = this.G;
        if (b3Var2 != b3Var) {
            if (b3Var2 != null) {
                b3Var2.c(this);
            }
            this.G = b3Var;
            if (b3Var != null) {
                org.telegram.ui.web.w0 w0Var = b3Var.f20449b;
                n3 n3Var = this.f37161f;
                if (w0Var != null) {
                    w0Var.onResume();
                    int i10 = UserConfig.selectedAccount;
                    org.telegram.ui.web.w0 w0Var2 = b3Var.f20449b;
                    Object obj = b3Var.d;
                    n3Var.J = i10;
                    n3Var.Q(w0Var2, obj);
                    if (n3Var.f39435l0) {
                        n3Var.v("visibility_changed", org.telegram.ui.web.a1.x(Boolean.TRUE, "is_visible"));
                    }
                    a(this, true, b3Var.f20459o);
                    a(this, false, b3Var.f20460p);
                } else {
                    String str = b3Var.v;
                    if (str != null) {
                        n3Var.r(UserConfig.selectedAccount, str);
                    }
                }
            }
            org.telegram.ui.web.e2 e2Var = this.f37167y;
            if (e2Var != null) {
                e2Var.a();
                org.telegram.ui.web.e2 e2Var2 = this.f37167y;
                TLRPC.TL_webPage tL_webPage = e2Var2.f39487j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.g2.o(tL_webPage);
                    e2Var2.f39487j = null;
                }
                this.f37167y = null;
            }
        }
    }
}
