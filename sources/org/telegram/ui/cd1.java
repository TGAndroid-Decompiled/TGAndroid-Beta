package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class cd1 extends org.telegram.ui.ActionBar.h2 {
    public WebView f46489a;
    public org.telegram.ui.ActionBar.r0 f46490b;
    public org.telegram.ui.Components.oq f46491c;
    public final String d;
    public final String f46492e;
    public final String f46493f;
    public final String h;
    public final org.telegram.messenger.fj f46494n;
    public final String f46495r;
    public m4 f46496s;

    public cd1(String str, String str2, String str3, String str4, org.telegram.messenger.fj fjVar) {
        super(null);
        String k10;
        this.f46496s = new m4(this, 17);
        this.d = str;
        this.f46492e = str2;
        this.f46493f = str3;
        this.f46494n = fjVar;
        this.f46495r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.mp.u1(this.currentAccount).X2);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            k10 = "";
        } else {
            k10 = p5.c.k("?game=", str4);
        }
        sb2.append(k10);
        this.h = sb2.toString();
    }

    public static void a0(String str, org.telegram.messenger.fj fjVar, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f26913b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + fjVar.e1(), null);
            if (string == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            StringBuilder sb2 = new StringBuilder(str4);
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i7 = 0; i7 < 20; i7++) {
                    sb2.append(charArray[Utilities.f22777b.nextInt(charArray.length)]);
                }
            }
            sb3.append((CharSequence) sb2);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str5 = str + "#" + ((Object) sb3);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    if (substring.length() > 0) {
                        str5 = str + "?" + ((Object) sb3);
                    } else {
                        str5 = str + ((Object) sb3);
                    }
                }
                str5 = str + "&" + ((Object) sb3);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb2) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(fjVar.f23965k.getObjectSize());
            fjVar.f23965k.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(org.telegram.messenger.mp.u1(fjVar.K1).X2);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb4.append(str6);
            edit.putString(str7, sb4.toString());
            edit.commit();
            vf.c.p(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29692t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29674s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ad1(this));
        org.telegram.ui.ActionBar.z t6 = this.actionBar.t();
        this.f46490b = t6.g(1, 2131232728, org.telegram.messenger.g0.L(54.0f));
        t6.a(0, 2131231244).e(2, 2131232267, org.telegram.messenger.gd.M0(2131747603, null));
        this.actionBar.setTitle(this.f46493f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.f46492e);
        org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(context, 1);
        this.f46491c = oqVar;
        this.f46490b.addView(oqVar, c8.ma.c(-1.0f, -1));
        this.f46491c.setAlpha(0.0f);
        this.f46491c.setScaleX(0.1f);
        this.f46491c.setScaleY(0.1f);
        this.f46491c.setVisibility(4);
        org.telegram.messenger.g0.u(context, true);
        WebView webView = new WebView(context);
        this.f46489a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f46489a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f46489a.setLayerType(2, null);
        this.f46489a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f46489a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f46489a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f46489a, true);
        this.f46489a.addJavascriptInterface(new bd1(this), "TelegramWebviewProxy");
        this.f46489a.setWebViewClient(new n1(this, 3));
        frameLayout.addView(this.f46489a, c8.ma.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.F8));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.g0.u(getParentActivity(), false);
        org.telegram.messenger.g0.r(this.f46496s);
        this.f46489a.setLayerType(0, null);
        this.f46496s = null;
        try {
            ViewParent parent = this.f46489a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f46489a);
            }
            this.f46489a.stopLoading();
            this.f46489a.loadUrl("about:blank");
            this.f46489a.destroy();
            this.f46489a = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.r(this.f46496s);
        this.f46496s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.J(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.G8, false), false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f46489a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
