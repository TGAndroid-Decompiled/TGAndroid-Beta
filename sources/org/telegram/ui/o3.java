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
    public final k4 K;
    public int f38846a;
    public final di.v f38847b;
    public final i4 f38848c;
    public final s4.b0 d;
    public final l3 e;
    public final m3 f38849f;
    public boolean h;
    public boolean f38850n;
    public f3 f38851r;
    public boolean f38852s;
    public boolean v;
    public int f38853w;
    public int f38854x;
    public org.telegram.ui.web.f2 f38855y;

    public o3(k4 k4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = k4Var;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.f38853w = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        this.f38854x = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        di.v vVar = new di.v(this, activity);
        this.f38847b = vVar;
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
        this.f38848c = i4Var;
        vVar.setAdapter(i4Var);
        s4.b0 b0Var = new s4.b0(1, false);
        this.d = b0Var;
        vVar.setLayoutManager(b0Var);
        vVar.setOnScrollListener(new k3(this, 0));
        addView(vVar, w7.a6.d(-1.0f, -1));
        l3 l3Var = new l3(this, getContext());
        this.e = l3Var;
        l3Var.setShouldWaitWebViewScroll(true);
        l3Var.setFullSize(true);
        l3Var.setAllowFullSizeSwipe(true);
        m3 m3Var = new m3(this, getContext(), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
        this.f38849f = m3Var;
        m3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final o3 f37017b;

            {
                this.f37017b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k4 k4Var2 = this.f37017b.K;
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
                                                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var2.J == k4Var2) {
                                                    z11 = P.h(i11, l3Var2, true);
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
                        this.f37017b.f38849f.n(true, false);
                        return;
                    default:
                        o3 o3Var = this.f37017b;
                        l3 l3Var3 = o3Var.e;
                        o3Var.f38849f.n(false, false);
                        f3 f3Var = o3Var.f38851r;
                        if (f3Var != null) {
                            f3Var.f35725a.setTranslationY(((l3Var3.getTopActionBarOffsetY() + (-l3Var3.getOffsetY())) - l3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        return;
                }
            }
        });
        m3Var.setWebViewProgressListener(new j3(this, 0));
        m3Var.setDelegate(new n3(this));
        m3Var.setWebViewScrollListener(new g(this, 2));
        l3Var.addView(m3Var, w7.a6.d(-1.0f, -1));
        l3Var.setScrollEndListener(new Runnable(this) {
            public final o3 f37017b;

            {
                this.f37017b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k4 k4Var2 = this.f37017b.K;
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
                                                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var2.J == k4Var2) {
                                                    z11 = P.h(i11, l3Var2, true);
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
                        this.f37017b.f38849f.n(true, false);
                        return;
                    default:
                        o3 o3Var = this.f37017b;
                        l3 l3Var3 = o3Var.e;
                        o3Var.f38849f.n(false, false);
                        f3 f3Var = o3Var.f38851r;
                        if (f3Var != null) {
                            f3Var.f35725a.setTranslationY(((l3Var3.getTopActionBarOffsetY() + (-l3Var3.getOffsetY())) - l3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        return;
                }
            }
        });
        l3Var.setDelegate(new b1(this, 1));
        l3Var.setScrollListener(new Runnable(this) {
            public final o3 f37017b;

            {
                this.f37017b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        k4 k4Var2 = this.f37017b.K;
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
                                                org.telegram.ui.ActionBar.l3 l3Var2 = (org.telegram.ui.ActionBar.l3) obj;
                                                if (l3Var2.J == k4Var2) {
                                                    z11 = P.h(i11, l3Var2, true);
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
                        this.f37017b.f38849f.n(true, false);
                        return;
                    default:
                        o3 o3Var = this.f37017b;
                        l3 l3Var3 = o3Var.e;
                        o3Var.f38849f.n(false, false);
                        f3 f3Var = o3Var.f38851r;
                        if (f3Var != null) {
                            f3Var.f35725a.setTranslationY(((l3Var3.getTopActionBarOffsetY() + (-l3Var3.getOffsetY())) - l3Var3.getSwipeOffsetY()) / 2.0f);
                        }
                        o3Var.K.f0();
                        return;
                }
            }
        });
        l3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(l3Var, w7.a6.d(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(o3 o3Var, boolean z10, int i10) {
        k4 k4Var = o3Var.K;
        x3 x3Var = k4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.g6.v(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false), i10);
            o3Var.f38853w = v;
            if (o3Var == k4Var.f37557u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    k4Var.f37545h0.d(v, true);
                }
                if (x3Var != null) {
                    x3Var.i();
                }
            }
        } else {
            int v10 = org.telegram.ui.ActionBar.g6.v(-1, i10);
            o3Var.f38854x = v10;
            if (o3Var == k4Var.f37557u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    k4Var.f37545h0.setMenuColors(v10);
                }
                if (x3Var != null) {
                    x3Var.i();
                }
            }
        }
        k4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f38852s = false;
        this.v = false;
        setWeb(null);
        m3 m3Var = this.f38849f;
        m3Var.h();
        m3Var.f41282a = null;
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.f38853w = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i10, false);
        this.f38854x = x02;
        f3 f3Var = this.f38851r;
        if (f3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(x02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            f3Var.b(z10, true);
            this.f38851r.setBackgroundColor(this.f38854x);
            f3 f3Var2 = this.f38851r;
            this.f38850n = false;
            AndroidUtilities.updateViewVisibilityAnimated(f3Var2, false, 1.0f, false);
        }
        i4 i4Var = this.f38848c;
        i4Var.E = null;
        i4Var.e.clear();
        i4Var.f37022f.clear();
        i4Var.f37025s.clear();
        i4Var.v.clear();
        i4Var.h.clear();
        i4Var.f37024r.clear();
        i4Var.f37023n.clear();
        i4Var.f37027x.clear();
        i4Var.f37026w.clear();
        i4Var.F = null;
        i4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f38846a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        i4 i4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (i4Var = this.f38848c) != null && (webPage = i4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        if (this.f38846a == 1) {
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
            return this.f38853w;
        }
        int i10 = org.telegram.ui.ActionBar.g6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.g6.x0(null, i10, false);
    }

    public i4 getAdapter() {
        return this.f38848c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f38850n) {
                return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
            }
            return this.f38854x;
        }
        return org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            di.v vVar = this.f38847b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.U(childAt).f44841f;
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

    public org.telegram.ui.Components.mm0 getListView() {
        return this.f38847b;
    }

    public float getProgress() {
        org.telegram.ui.web.y0 webView;
        i4 i4Var;
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
                int[] iArr = this.f38848c.I;
                di.v vVar = this.f38847b;
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
                    return Utilities.clamp01((i10 + i11) / Math.max(1, i4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f38849f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.y0 webView;
        String uri;
        String[] split;
        m0 m0Var;
        if (!f() || (webView = this.f38849f.getWebView()) == null) {
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
                        String a2 = pf.d.a(parse.getHost());
                        if (a2.split("\\.").length > 2 && (m0Var = this.K.f37545h0) != null && di.d4.g(a2, m0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
                            a2 = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = pf.d.v(parse, null, "", a2, null);
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
            TLRPC.WebPage webPage = this.f38848c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f38849f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.b1 getWebContainer() {
        return this.f38849f;
    }

    public org.telegram.ui.web.y0 getWebView() {
        m3 m3Var = this.f38849f;
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
        if (this.f38850n && (f3Var = this.f38851r) != null) {
            int i10 = org.telegram.ui.ActionBar.g6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.x0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            f3Var.b(z10, false);
            this.f38851r.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f38849f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        k4 k4Var = this.K;
        k4Var.f0();
        if (k4Var.f37543f0.f20868f) {
            k4Var.f37544g0.invalidate();
        }
        if (k4Var.f37543f0.e) {
            k4Var.f37544g0.invalidate();
            k4Var.X((int) (((AndroidUtilities.dp(56.0f) - k4Var.f37543f0.h) * (f7 / getMeasuredWidth())) + k4Var.f37543f0.h));
        }
        x3 x3Var = k4Var.K;
        if (x3Var != null) {
            x3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f38846a != i10) {
            b();
        }
        this.f38846a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f38847b.setVisibility(i11);
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
                org.telegram.ui.web.y0 y0Var = b3Var.f20486b;
                m3 m3Var = this.f38849f;
                if (y0Var != null) {
                    y0Var.onResume();
                    m3Var.N(UserConfig.selectedAccount, b3Var.f20486b, b3Var.d, b3Var.f20504x, false);
                    a(this, true, b3Var.f20498q);
                    a(this, false, b3Var.f20499r);
                } else {
                    String str = b3Var.f20504x;
                    if (str != null) {
                        m3Var.t(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.f2 f2Var = this.f38855y;
            if (f2Var != null) {
                f2Var.a();
                org.telegram.ui.web.f2 f2Var2 = this.f38855y;
                TLRPC.TL_webPage tL_webPage = f2Var2.f41352j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.h2.o(tL_webPage);
                    f2Var2.f41352j = null;
                }
                this.f38855y = null;
            }
        }
    }
}
