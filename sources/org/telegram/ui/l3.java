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
public final class l3 extends FrameLayout {
    public boolean E;
    public String F;
    public String G;
    public boolean H;
    public float I;
    public y2 J;
    public final h4 K;
    public int f35434a;
    public final ci.v f35435b;
    public final f4 f35436c;
    public final s4.c0 d;
    public final i3 e;
    public final j3 f35437f;
    public boolean h;
    public boolean f35438n;
    public c3 f35439r;
    public boolean f35440s;
    public boolean v;
    public int f35441w;
    public int f35442x;
    public org.telegram.ui.web.g2 f35443y;

    public l3(h4 h4Var, Activity activity) {
        super(activity);
        boolean z10;
        this.K = h4Var;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f35441w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f35442x = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.E = false;
        this.I = -1.0f;
        new Matrix();
        ci.v vVar = new ci.v(this, activity);
        this.f35435b = vVar;
        vVar.setClipToPadding(false);
        vVar.setPadding(0, AndroidUtilities.dp(56.0f), 0, 0);
        vVar.setTopGlowOffset(AndroidUtilities.dp(56.0f));
        ((s4.j) vVar.getItemAnimator()).C = false;
        if (h4Var.K != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f4 f4Var = new f4(h4Var, activity, z10);
        this.f35436c = f4Var;
        vVar.setAdapter(f4Var);
        s4.c0 c0Var = new s4.c0(1, false);
        this.d = c0Var;
        vVar.setLayoutManager(c0Var);
        vVar.setOnScrollListener(new h3(this, 0));
        addView(vVar, w7.x5.c(-1.0f, -1));
        i3 i3Var = new i3(this, getContext());
        this.e = i3Var;
        i3Var.setShouldWaitWebViewScroll(true);
        i3Var.setFullSize(true);
        i3Var.setAllowFullSizeSwipe(true);
        j3 j3Var = new j3(this, getContext(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18863d6, false));
        this.f35437f = j3Var;
        j3Var.setOnCloseRequestedListener(new Runnable(this) {
            public final l3 f33528b;

            {
                this.f33528b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h4 h4Var2 = this.f33528b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.p3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.p3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) obj;
                                                if (o3Var.J == h4Var2) {
                                                    z11 = P.h(i11, o3Var, true);
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
                            h4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f33528b.f35437f.o(true, false);
                        return;
                    default:
                        l3 l3Var = this.f33528b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f35437f.o(false, false);
                        c3 c3Var = l3Var.f35439r;
                        if (c3Var != null) {
                            c3Var.f32655a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.K.f0();
                        return;
                }
            }
        });
        j3Var.setWebViewProgressListener(new g3(this, 0));
        j3Var.setDelegate(new k3(this));
        j3Var.setWebViewScrollListener(new g(this, 2));
        i3Var.addView(j3Var, w7.x5.c(-1.0f, -1));
        i3Var.setScrollEndListener(new Runnable(this) {
            public final l3 f33528b;

            {
                this.f33528b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h4 h4Var2 = this.f33528b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.p3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.p3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) obj;
                                                if (o3Var.J == h4Var2) {
                                                    z11 = P.h(i11, o3Var, true);
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
                            h4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f33528b.f35437f.o(true, false);
                        return;
                    default:
                        l3 l3Var = this.f33528b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f35437f.o(false, false);
                        c3 c3Var = l3Var.f35439r;
                        if (c3Var != null) {
                            c3Var.f32655a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.K.f0();
                        return;
                }
            }
        });
        i3Var.setDelegate(new y0(this, 1));
        i3Var.setScrollListener(new Runnable(this) {
            public final l3 f33528b;

            {
                this.f33528b = this;
            }

            @Override
            public final void run() {
                switch (r2) {
                    case 0:
                        h4 h4Var2 = this.f33528b.K;
                        LaunchActivity launchActivity = LaunchActivity.G1;
                        if (launchActivity != null) {
                            org.telegram.ui.ActionBar.p3 P = launchActivity.P();
                            if (P != null) {
                                boolean z11 = false;
                                int i11 = 0;
                                while (true) {
                                    HashMap hashMap = org.telegram.ui.ActionBar.p3.K;
                                    if (i11 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i11));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i12 = 0;
                                            while (i12 < size) {
                                                Object obj = arrayList.get(i12);
                                                i12++;
                                                org.telegram.ui.ActionBar.o3 o3Var = (org.telegram.ui.ActionBar.o3) obj;
                                                if (o3Var.J == h4Var2) {
                                                    z11 = P.h(i11, o3Var, true);
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
                            h4Var2.o(true, true);
                            return;
                        }
                        return;
                    case 1:
                        this.f33528b.f35437f.o(true, false);
                        return;
                    default:
                        l3 l3Var = this.f33528b;
                        i3 i3Var2 = l3Var.e;
                        l3Var.f35437f.o(false, false);
                        c3 c3Var = l3Var.f35439r;
                        if (c3Var != null) {
                            c3Var.f32655a.setTranslationY(((i3Var2.getTopActionBarOffsetY() + (-i3Var2.getOffsetY())) - i3Var2.getSwipeOffsetY()) / 2.0f);
                        }
                        l3Var.K.f0();
                        return;
                }
            }
        });
        i3Var.setTopActionBarOffsetY(AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight);
        addView(i3Var, w7.x5.c(-1.0f, -1));
        b();
        setType(0);
    }

    public static void a(l3 l3Var, boolean z10, int i10) {
        h4 h4Var = l3Var.K;
        u3 u3Var = h4Var.K;
        if (z10) {
            int v = org.telegram.ui.ActionBar.j6.v(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false), i10);
            l3Var.f35441w = v;
            if (l3Var == h4Var.f34173u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    h4Var.f34161h0.d(v, true);
                }
                if (u3Var != null) {
                    u3Var.i();
                }
            }
        } else {
            int v9 = org.telegram.ui.ActionBar.j6.v(-1, i10);
            l3Var.f35442x = v9;
            if (l3Var == h4Var.f34173u0[0]) {
                if (SharedConfig.adaptableColorInBrowser) {
                    h4Var.f34161h0.setMenuColors(v9);
                }
                if (u3Var != null) {
                    u3Var.i();
                }
            }
        }
        h4Var.f0();
    }

    public final void b() {
        boolean z10;
        this.f35440s = false;
        this.v = false;
        setWeb(null);
        j3 j3Var = this.f35437f;
        j3Var.i();
        j3Var.f38741a = null;
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.f35441w = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i10, false);
        this.f35442x = w02;
        c3 c3Var = this.f35439r;
        if (c3Var != null) {
            if (AndroidUtilities.computePerceivedBrightness(w02) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3Var.b(z10, true);
            this.f35439r.setBackgroundColor(this.f35442x);
            c3 c3Var2 = this.f35439r;
            this.f35438n = false;
            AndroidUtilities.updateViewVisibilityAnimated(c3Var2, false, 1.0f, false);
        }
        f4 f4Var = this.f35436c;
        f4Var.E = null;
        f4Var.e.clear();
        f4Var.f33542f.clear();
        f4Var.f33545s.clear();
        f4Var.v.clear();
        f4Var.h.clear();
        f4Var.f33544r.clear();
        f4Var.f33543n.clear();
        f4Var.f33547x.clear();
        f4Var.f33546w.clear();
        f4Var.F = null;
        f4Var.l();
        invalidate();
    }

    public final boolean c() {
        if (this.f35434a == 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        f4 f4Var;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!f() && (f4Var = this.f35436c) != null && (webPage = f4Var.E) != null && (page = webPage.cached_page) != null && page.local != null) {
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
        if (!f() || (webView = getWebView()) == null || (v = org.telegram.ui.web.d1.v(webView.getUrl())) == null || !org.telegram.ui.web.d1.q(Uri.parse(v))) {
            return false;
        }
        return true;
    }

    public final boolean f() {
        if (this.f35434a == 1) {
            return true;
        }
        return false;
    }

    public final void g() {
        int i10;
        if (c()) {
            u3 u3Var = this.K.K;
            int i11 = 0;
            if (u3Var != null) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (u3Var != null) {
                i11 = AndroidUtilities.dp(32.0f);
            }
            this.d.h1(i10, i11);
        } else if (f()) {
            i3 i3Var = this.e;
            i3Var.setSwipeOffsetY(i3Var.getTopActionBarOffsetY() + (-i3Var.getOffsetY()));
        }
    }

    public int getActionBarColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            return this.f35441w;
        }
        int i10 = org.telegram.ui.ActionBar.j6.Pk;
        this.K.getClass();
        return org.telegram.ui.ActionBar.j6.w0(null, i10, false);
    }

    public f4 getAdapter() {
        return this.f35436c;
    }

    public int getBackgroundColor() {
        if (f() && SharedConfig.adaptableColorInBrowser) {
            if (this.f35438n) {
                return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
            }
            return this.f35442x;
        }
        return org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Pk, false);
    }

    public float getListTop() {
        int i10;
        if (c()) {
            ci.v vVar = this.f35435b;
            float height = vVar.getHeight();
            for (int i11 = 0; i11 < vVar.getChildCount(); i11++) {
                View childAt = vVar.getChildAt(i11);
                if (vVar.getLayoutManager() == null) {
                    i10 = 0;
                } else {
                    vVar.getLayoutManager().getClass();
                    i10 = RecyclerView.V(childAt).f42705f;
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

    public org.telegram.ui.Components.ml0 getListView() {
        return this.f35435b;
    }

    public float getProgress() {
        org.telegram.ui.web.z0 webView;
        f4 f4Var;
        int i10;
        int B;
        View m10;
        float min;
        u3 u3Var = this.K.K;
        if (c()) {
            float f7 = this.I;
            if (f7 >= 0.0f) {
                return f7;
            }
            s4.c0 c0Var = this.d;
            int L0 = c0Var.L0();
            View m11 = c0Var.m(L0);
            if (m11 != null) {
                int[] iArr = this.f35436c.I;
                ci.v vVar = this.f35435b;
                int i11 = 0;
                if (iArr == null) {
                    int N0 = c0Var.N0();
                    if (u3Var != null) {
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
                    if (L0 != 0 || u3Var == null) {
                        i11 = -m11.getTop();
                    }
                    return Utilities.clamp01((i10 + i11) / Math.max(1, f4Var.J - vVar.getHeight()));
                }
            }
        } else if (f() && (webView = this.f35437f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        org.telegram.ui.web.z0 webView;
        String uri;
        String[] split;
        k0 k0Var;
        if (!f() || (webView = this.f35437f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.F, webView.getUrl())) {
            return this.G;
        }
        try {
            String url = webView.getUrl();
            this.F = url;
            Uri parse = Uri.parse(org.telegram.ui.web.d1.v(url));
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
                        if (a2.split("\\.").length > 2 && (k0Var = this.K.f34161h0) != null && ci.f4.g(a2, k0Var.E) > AndroidUtilities.displaySize.x - AndroidUtilities.dp(162.0f)) {
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
            TLRPC.WebPage webPage = this.f35436c.E;
            if (webPage != null && (str2 = webPage.site_name) != null) {
                return str2;
            }
            if (webPage != null && (str = webPage.title) != null) {
                return str;
            }
        }
        if (f() && (webView = this.f35437f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public org.telegram.ui.web.d1 getWebContainer() {
        return this.f35437f;
    }

    public org.telegram.ui.web.z0 getWebView() {
        j3 j3Var = this.f35437f;
        if (j3Var != null) {
            return j3Var.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        c3 c3Var;
        boolean z10;
        super.onAttachedToWindow();
        if (this.f35438n && (c3Var = this.f35439r) != null) {
            int i10 = org.telegram.ui.ActionBar.j6.Pk;
            if (AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.w0(null, i10, false)) <= 0.721f) {
                z10 = true;
            } else {
                z10 = false;
            }
            c3Var.b(z10, false);
            this.f35439r.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        }
    }

    public void setLastVisible(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            this.f35437f.setKeyboardFocusable(z10);
        }
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        h4 h4Var = this.K;
        h4Var.f0();
        if (h4Var.f34159f0.f19767f) {
            h4Var.f34160g0.invalidate();
        }
        if (h4Var.f34159f0.e) {
            h4Var.f34160g0.invalidate();
            h4Var.X((int) (((AndroidUtilities.dp(56.0f) - h4Var.f34159f0.h) * (f7 / getMeasuredWidth())) + h4Var.f34159f0.h));
        }
        u3 u3Var = h4Var.K;
        if (u3Var != null) {
            u3Var.n();
        }
    }

    public void setType(int i10) {
        int i11;
        if (this.f35434a != i10) {
            b();
        }
        this.f35434a = i10;
        int i12 = 8;
        if (c()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f35435b.setVisibility(i11);
        if (f()) {
            i12 = 0;
        }
        this.e.setVisibility(i12);
    }

    public void setWeb(y2 y2Var) {
        y2 y2Var2 = this.J;
        if (y2Var2 != y2Var) {
            if (y2Var2 != null) {
                y2Var2.c(this);
            }
            this.J = y2Var;
            if (y2Var != null) {
                org.telegram.ui.web.z0 z0Var = y2Var.f19455b;
                j3 j3Var = this.f35437f;
                if (z0Var != null) {
                    z0Var.onResume();
                    j3Var.O(UserConfig.selectedAccount, y2Var.f19455b, y2Var.d, y2Var.f19473x, false);
                    a(this, true, y2Var.f19467q);
                    a(this, false, y2Var.f19468r);
                } else {
                    String str = y2Var.f19473x;
                    if (str != null) {
                        j3Var.u(UserConfig.selectedAccount, str, false);
                    }
                }
            }
            org.telegram.ui.web.g2 g2Var = this.f35443y;
            if (g2Var != null) {
                g2Var.a();
                org.telegram.ui.web.g2 g2Var2 = this.f35443y;
                TLRPC.TL_webPage tL_webPage = g2Var2.f38803j;
                if (tL_webPage != null) {
                    org.telegram.ui.web.i2.o(tL_webPage);
                    g2Var2.f38803j = null;
                }
                this.f35443y = null;
            }
        }
    }
}
