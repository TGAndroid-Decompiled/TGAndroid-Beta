package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class m extends FrameLayout {
    public int E;
    public pxc F;
    public boolean G;
    public String H;
    public String I;
    public boolean J;
    public float K;
    public aw L;
    public final o M;
    public int a;
    public final iw b;
    public final ex c;
    public final x46 d;
    public final jw e;
    public final l f;
    public boolean h;
    public boolean n;
    public dw r;
    public boolean s;
    public boolean w;
    public int x;
    public int y;

    public m(o oVar, Activity activity) {
        super(activity);
        boolean z;
        this.M = oVar;
        int i = aob.Gl;
        this.x = aob.w0(null, i, false);
        int w0 = aob.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        this.G = false;
        this.K = -1.0f;
        iw iwVar = new iw(this, activity);
        this.b = iwVar;
        iwVar.setClipToPadding(false);
        iwVar.setPadding(0, hl.L(56.0f), 0, 0);
        iwVar.setTopGlowOffset(hl.L(56.0f));
        ((zb3) iwVar.getItemAnimator()).C = false;
        if (oVar.L != null) {
            z = true;
        } else {
            z = false;
        }
        ex exVar = new ex(oVar, activity, z);
        this.c = exVar;
        iwVar.setAdapter(exVar);
        x46 x46Var = new x46(1, false);
        this.d = x46Var;
        iwVar.setLayoutManager(x46Var);
        iwVar.setOnScrollListener(new defpackage.y(this, (byte) 4));
        addView(iwVar, tre.c(-1.0f, -1));
        ?? i22Var = new i22(getContext());
        this.e = i22Var;
        i22Var.setShouldWaitWebViewScroll(true);
        i22Var.setFullSize(true);
        i22Var.setAllowFullSizeSwipe(true);
        l lVar = new l(this, getContext(), aob.w0(null, aob.d6, false));
        this.f = lVar;
        lVar.setOnCloseRequestedListener(new Runnable(this) {
            public final m b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                boolean z2 = false;
                m mVar = this.b;
                switch (b) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            yx0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = yx0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                xx0 xx0Var = (xx0) obj;
                                                if (xx0Var.J == oVar2) {
                                                    z2 = O.h(i2, xx0Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            }
                            oVar2.l(true, true);
                            return;
                        }
                        return;
                    case 1:
                        mVar.f.l(true, false);
                        return;
                    default:
                        jw jwVar = mVar.e;
                        mVar.f.l(false, false);
                        dw dwVar = mVar.r;
                        if (dwVar != null) {
                            dwVar.a.setTranslationY(((jwVar.getTopActionBarOffsetY() + (-jwVar.getOffsetY())) - jwVar.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        return;
                }
            }
        });
        lVar.setWebViewProgressListener(new hw(this, (byte) 0));
        lVar.setDelegate(new kw(this));
        lVar.setWebViewScrollListener(new zm9(this, (byte) 6));
        i22Var.addView(lVar, tre.c(-1.0f, -1));
        i22Var.setScrollEndListener(new Runnable(this) {
            public final m b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                boolean z2 = false;
                m mVar = this.b;
                switch (b) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            yx0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = yx0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                xx0 xx0Var = (xx0) obj;
                                                if (xx0Var.J == oVar2) {
                                                    z2 = O.h(i2, xx0Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            }
                            oVar2.l(true, true);
                            return;
                        }
                        return;
                    case 1:
                        mVar.f.l(true, false);
                        return;
                    default:
                        jw jwVar = mVar.e;
                        mVar.f.l(false, false);
                        dw dwVar = mVar.r;
                        if (dwVar != null) {
                            dwVar.a.setTranslationY(((jwVar.getTopActionBarOffsetY() + (-jwVar.getOffsetY())) - jwVar.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        return;
                }
            }
        });
        i22Var.setDelegate(new m0(this, (byte) 20));
        i22Var.setScrollListener(new Runnable(this) {
            public final m b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                boolean z2 = false;
                m mVar = this.b;
                switch (b) {
                    case 0:
                        o oVar2 = mVar.M;
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            yx0 O = launchActivity.O();
                            if (O != null) {
                                int i2 = 0;
                                while (true) {
                                    HashMap hashMap = yx0.L;
                                    if (i2 < hashMap.size()) {
                                        ArrayList arrayList = (ArrayList) hashMap.get(Integer.valueOf(i2));
                                        if (arrayList != null) {
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList.get(i3);
                                                i3++;
                                                xx0 xx0Var = (xx0) obj;
                                                if (xx0Var.J == oVar2) {
                                                    z2 = O.h(i2, xx0Var, true);
                                                }
                                            }
                                            continue;
                                        }
                                        i2++;
                                    }
                                }
                                if (z2) {
                                    return;
                                }
                            }
                            oVar2.l(true, true);
                            return;
                        }
                        return;
                    case 1:
                        mVar.f.l(true, false);
                        return;
                    default:
                        jw jwVar = mVar.e;
                        mVar.f.l(false, false);
                        dw dwVar = mVar.r;
                        if (dwVar != null) {
                            dwVar.a.setTranslationY(((jwVar.getTopActionBarOffsetY() + (-jwVar.getOffsetY())) - jwVar.getSwipeOffsetY()) / 2.0f);
                        }
                        mVar.M.d0();
                        return;
                }
            }
        });
        i22Var.setTopActionBarOffsetY(hl.L(56.0f) + hl.m);
        addView((View) i22Var, tre.c(-1.0f, -1));
        a();
        setType(0);
    }

    public final void a() {
        boolean z;
        this.s = false;
        this.w = false;
        setWeb(null);
        l lVar = this.f;
        lVar.f();
        lVar.a = null;
        int i = aob.Gl;
        this.x = aob.w0(null, i, false);
        int w0 = aob.w0(null, i, false);
        this.y = w0;
        this.E = w0;
        dw dwVar = this.r;
        if (dwVar != null) {
            if (hl.B(w0) <= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            dwVar.b(z, true);
            this.r.setBackgroundColor(this.y);
            dw dwVar2 = this.r;
            this.n = false;
            hl.T3(dwVar2, false, 1.0f, true, false);
        }
        ex exVar = this.c;
        exVar.F = null;
        exVar.e.clear();
        exVar.f.clear();
        exVar.s.clear();
        exVar.w.clear();
        exVar.h.clear();
        exVar.r.clear();
        exVar.n.clear();
        exVar.y.clear();
        exVar.x.clear();
        exVar.G = null;
        exVar.f();
        invalidate();
    }

    public final boolean b() {
        if (this.a == 0) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        ex exVar;
        TLRPC.WebPage webPage;
        TL_iv.Page page;
        if (!e() && (exVar = this.c) != null && (webPage = exVar.F) != null && (page = webPage.cached_page) != null && page.local != null) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        nv0 webView;
        String r;
        if (!e() || (webView = getWebView()) == null || (r = rv0.r(webView.getUrl())) == null || !rv0.n(Uri.parse(r))) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public final boolean e() {
        if (this.a == 1) {
            return true;
        }
        return false;
    }

    public final void f() {
        int i;
        if (b()) {
            tw twVar = this.M.L;
            int i2 = 0;
            if (twVar != null) {
                i = 1;
            } else {
                i = 0;
            }
            if (twVar != null) {
                i2 = hl.L(32.0f);
            }
            this.d.g1(i, i2);
        } else if (e()) {
            jw jwVar = this.e;
            jwVar.setSwipeOffsetY(jwVar.getTopActionBarOffsetY() + (-jwVar.getOffsetY()));
        }
    }

    public final void g(int i, boolean z) {
        o oVar = this.M;
        tw twVar = oVar.L;
        if (z) {
            int v = aob.v(aob.w0(null, aob.Gl, false), i);
            this.x = v;
            if (this == oVar.v0[0]) {
                if (xea.s0) {
                    oVar.i0.d(v, true);
                }
                if (twVar != null) {
                    twVar.t();
                }
            }
        } else {
            int v2 = aob.v(-1, i);
            this.y = v2;
            if (this == oVar.v0[0]) {
                if (xea.s0) {
                    oVar.i0.setMenuColors(v2);
                }
                if (twVar != null) {
                    twVar.t();
                }
            }
        }
        oVar.d0();
    }

    public int getActionBarColor() {
        if (e() && xea.s0) {
            return this.x;
        }
        return aob.w0(null, aob.Gl, false);
    }

    public ex getAdapter() {
        return this.c;
    }

    public int getBackgroundColor() {
        if (e() && xea.s0) {
            if (this.n) {
                return aob.w0(null, aob.Gl, false);
            }
            return this.y;
        }
        return aob.w0(null, aob.Gl, false);
    }

    public float getListTop() {
        int i;
        if (b()) {
            iw iwVar = this.b;
            float height = iwVar.getHeight();
            for (int i2 = 0; i2 < iwVar.getChildCount(); i2++) {
                View childAt = iwVar.getChildAt(i2);
                if (iwVar.getLayoutManager() == null) {
                    i = 0;
                } else {
                    iwVar.getLayoutManager().getClass();
                    i = RecyclerView.V(childAt).f;
                }
                if (i == 2147483646) {
                    height = Math.min(height, childAt.getBottom());
                } else {
                    height = Math.min(height, childAt.getTop());
                }
            }
            return height;
        } else if (e()) {
            return this.e.getTranslationY();
        } else {
            return 0.0f;
        }
    }

    public d79 getListView() {
        return this.b;
    }

    public float getProgress() {
        nv0 webView;
        ex exVar;
        int i;
        int A;
        View m;
        float min;
        tw twVar = this.M.L;
        if (b()) {
            float f = this.K;
            if (f >= 0.0f) {
                return f;
            }
            x46 x46Var = this.d;
            int K0 = x46Var.K0();
            View m2 = x46Var.m(K0);
            if (m2 != null) {
                int[] iArr = this.c.K;
                iw iwVar = this.b;
                int i2 = 0;
                if (iArr == null) {
                    int M0 = x46Var.M0();
                    if (twVar != null) {
                        if (K0 < 1) {
                            K0 = 1;
                        }
                        if (M0 < 1) {
                            M0 = 1;
                        }
                    }
                    int A2 = x46Var.A() - 2;
                    if (M0 >= A2) {
                        m = x46Var.m(A2);
                    } else {
                        m = x46Var.m(K0);
                    }
                    if (m != null) {
                        float width = getWidth() / (A - 1);
                        float measuredHeight = m.getMeasuredHeight();
                        if (M0 >= A2) {
                            min = (((A2 - K0) * width) * (iwVar.getMeasuredHeight() - m.getTop())) / measuredHeight;
                        } else {
                            min = (1.0f - ((Math.min(0, m.getTop() - iwVar.getPaddingTop()) + measuredHeight) / measuredHeight)) * width;
                        }
                        return ((K0 * width) + min) / getWidth();
                    }
                } else {
                    int i3 = K0 - 1;
                    if (i3 >= 0 && i3 < iArr.length) {
                        i = iArr[i3];
                    } else {
                        i = 0;
                    }
                    if (K0 != 0 || twVar == null) {
                        i2 = -m2.getTop();
                    }
                    return Utilities.l((i + i2) / Math.max(1, exVar.L - iwVar.getHeight()));
                }
            }
        } else if (e() && (webView = this.f.getWebView()) != null) {
            return webView.getScrollProgress();
        }
        return 0.0f;
    }

    public String getSubtitle() {
        nv0 webView;
        String uri;
        String[] split;
        xt xtVar;
        if (!e() || (webView = this.f.getWebView()) == null) {
            return "";
        }
        if (TextUtils.equals(this.H, webView.getUrl())) {
            return this.I;
        }
        try {
            String url = webView.getUrl();
            this.H = url;
            Uri parse = Uri.parse(rv0.r(url));
            if (parse.getScheme() != null && (parse.getScheme().equalsIgnoreCase("http") || parse.getScheme().equalsIgnoreCase("https"))) {
                uri = parse.getSchemeSpecificPart();
            } else {
                uri = parse.toString();
            }
            try {
                if (!d()) {
                    try {
                        Uri parse2 = Uri.parse(uri);
                        if (parse2.getHost() != null) {
                            parse = parse2;
                        }
                        String a = m01.a(parse.getHost());
                        if (a.split("\\.").length > 2 && (xtVar = this.M.i0) != null && kg5.h(a, xtVar.F) > hl.q.x - hl.L(162.0f)) {
                            a = split[split.length - 2] + '.' + split[split.length - 1];
                        }
                        uri = m01.x(parse, null, "", a, null);
                    } catch (Exception e) {
                        cc4.g(e, false);
                    }
                    uri = URLDecoder.decode(uri.replaceAll("\\+", "%2b"), "UTF-8");
                }
            } catch (Exception e2) {
                cc4.g(e2, true);
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
            this.I = uri;
            return uri;
        } catch (Exception unused) {
            return webView.getUrl();
        }
    }

    public String getTitle() {
        nv0 webView;
        TLRPC.WebPage webPage;
        if (b() && (webPage = this.c.F) != null) {
            String str = webPage.site_name;
            if (str != null) {
                return str;
            }
            String str2 = webPage.title;
            if (str2 != null) {
                return str2;
            }
        }
        if (e() && (webView = this.f.getWebView()) != null) {
            return webView.getTitle();
        }
        return "";
    }

    public rv0 getWebContainer() {
        return this.f;
    }

    public nv0 getWebView() {
        l lVar = this.f;
        if (lVar != null) {
            return lVar.getWebView();
        }
        return null;
    }

    @Override
    public final void onAttachedToWindow() {
        dw dwVar;
        boolean z;
        super.onAttachedToWindow();
        if (this.n && (dwVar = this.r) != null) {
            int i = aob.Gl;
            if (hl.B(aob.w0(null, i, false)) <= 0.721f) {
                z = true;
            } else {
                z = false;
            }
            dwVar.b(z, false);
            yob.h(i, null, this.r);
        }
    }

    public void setLastVisible(boolean z) {
        if (this.J != z) {
            this.J = z;
            this.f.setKeyboardFocusable(z);
        }
    }

    @Override
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        o oVar = this.M;
        oVar.d0();
        if (oVar.g0.f) {
            oVar.h0.invalidate();
        }
        if (oVar.g0.e) {
            oVar.h0.invalidate();
            oVar.V((int) (((hl.L(56.0f) - oVar.g0.h) * (f / getMeasuredWidth())) + oVar.g0.h));
        }
        tw twVar = oVar.L;
        if (twVar != null) {
            twVar.A();
        }
    }

    public void setType(int i) {
        int i2;
        if (this.a != i) {
            a();
        }
        this.a = i;
        int i3 = 8;
        if (b()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.b.setVisibility(i2);
        if (e()) {
            i3 = 0;
        }
        this.e.setVisibility(i3);
    }

    public void setWeb(aw awVar) {
        aw awVar2 = this.L;
        if (awVar2 != awVar) {
            if (awVar2 != null) {
                awVar2.c(this);
            }
            this.L = awVar;
            if (awVar != null) {
                nv0 nv0Var = awVar.b;
                if (nv0Var != null) {
                    nv0Var.onResume();
                    this.f.L(yac.t0, awVar.b, awVar.d, awVar.x, false);
                    g(awVar.q, true);
                    g(awVar.r, false);
                } else {
                    String str = awVar.x;
                    if (str != null) {
                        this.f.q(yac.t0, str, false);
                    }
                }
            }
            pxc pxcVar = this.F;
            if (pxcVar != null) {
                pxcVar.a();
                pxc pxcVar2 = this.F;
                TLRPC.TL_webPage tL_webPage = pxcVar2.j;
                if (tL_webPage != null) {
                    rxc.o(tL_webPage);
                    pxcVar2.j = null;
                }
                this.F = null;
            }
        }
    }
}
