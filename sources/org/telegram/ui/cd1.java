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
public final class cd1 extends org.telegram.ui.ActionBar.f2 {
    public WebView f44284a;
    public org.telegram.ui.ActionBar.r0 f44285b;
    public org.telegram.ui.Components.zp f44286c;
    public final String d;
    public final String f44287e;
    public final String f44288f;
    public final String h;
    public final org.telegram.messenger.ij f44289n;
    public final String f44290r;
    public m4 f44291s;

    public cd1(String str, String str2, String str3, String str4, org.telegram.messenger.ij ijVar) {
        super(null);
        String i7;
        this.f44291s = new m4(this, 17);
        this.d = str;
        this.f44287e = str2;
        this.f44288f = str3;
        this.f44289n = ijVar;
        this.f44290r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(org.telegram.messenger.qp.s1(this.currentAccount).U2);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            i7 = "";
        } else {
            i7 = rf.b.i("?game=", str4);
        }
        sb2.append(i7);
        this.h = sb2.toString();
    }

    public static void a0(String str, org.telegram.messenger.ij ijVar, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = org.telegram.messenger.t0.f25566b.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + ijVar.e1(), null);
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
                    sb2.append(charArray[Utilities.f21334b.nextInt(charArray.length)]);
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
            SerializedData serializedData = new SerializedData(ijVar.f23262k.getObjectSize());
            ijVar.f23262k.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.f(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(org.telegram.messenger.qp.s1(ijVar.I1).U2);
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27865d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28163t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28202v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(2131231240);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ad1(this));
        org.telegram.ui.ActionBar.y r10 = this.actionBar.r();
        this.f44285b = r10.g(1, 2131232726, org.telegram.messenger.g0.L(54.0f));
        r10.a(0, 2131231244).e(2, 2131232265, org.telegram.messenger.id.M0(2131747796, null));
        this.actionBar.setTitle(this.f44288f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.f44287e);
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 1);
        this.f44286c = zpVar;
        this.f44285b.addView(zpVar, c8.ha.c(-1.0f, -1));
        this.f44286c.setAlpha(0.0f);
        this.f44286c.setScaleX(0.1f);
        this.f44286c.setScaleY(0.1f);
        this.f44286c.setVisibility(4);
        org.telegram.messenger.g0.u(context, true);
        WebView webView = new WebView(context);
        this.f44284a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f44284a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f44284a.setLayerType(2, null);
        this.f44284a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f44284a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f44284a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f44284a, true);
        this.f44284a.addJavascriptInterface(new bd1(this), "TelegramWebviewProxy");
        this.f44284a.setWebViewClient(new n1(this, 3));
        frameLayout.addView(this.f44284a, c8.ha.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.u6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.t6) null, org.telegram.ui.ActionBar.l6.F8));
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
        org.telegram.messenger.g0.r(this.f44291s);
        this.f44284a.setLayerType(0, null);
        this.f44291s = null;
        try {
            ViewParent parent = this.f44284a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f44284a);
            }
            this.f44284a.stopLoading();
            this.f44284a.loadUrl("about:blank");
            this.f44284a.destroy();
            this.f44284a = null;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.r(this.f44291s);
        this.f44291s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.G(org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.G8, false), false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        WebView webView;
        if (z9 && !z10 && (webView = this.f44284a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
