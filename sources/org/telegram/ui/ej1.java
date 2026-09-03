package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class ej1 extends org.telegram.ui.ActionBar.p2 {
    public WebView f36512a;
    public org.telegram.ui.ActionBar.w0 f36513b;
    public org.telegram.ui.Components.tq f36514c;
    public final String d;
    public final String f36515e;
    public final String f36516f;
    public final String h;
    public final MessageObject f36517n;
    public final String f36518r;
    public z5 f36519s;

    public ej1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        String k10;
        this.f36519s = new z5(this, 15);
        this.d = str;
        this.f36515e = str2;
        this.f36516f = str3;
        this.f36517n = messageObject;
        this.f36518r = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        sb.append(str2);
        if (TextUtils.isEmpty(str4)) {
            k10 = "";
        } else {
            k10 = yh.k("?game=", str4);
        }
        sb.append(k10);
        this.h = sb.toString();
    }

    public static int U(ej1 ej1Var) {
        return ej1Var.currentAccount;
    }

    public static void V(String str, MessageObject messageObject, Activity activity, String str2, String str3) {
        String str4;
        String str5;
        String str6 = "";
        try {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + messageObject.getId(), null);
            if (string == null) {
                str4 = "";
            } else {
                str4 = string;
            }
            StringBuilder sb = new StringBuilder(str4);
            StringBuilder sb2 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb.append(charArray[Utilities.random.nextInt(charArray.length)]);
                }
            }
            sb2.append((CharSequence) sb);
            int indexOf = str.indexOf(35);
            if (indexOf < 0) {
                str5 = str + "#" + ((Object) sb2);
            } else {
                String substring = str.substring(indexOf + 1);
                if (substring.indexOf(61) < 0 && substring.indexOf(63) < 0) {
                    if (substring.length() > 0) {
                        str5 = str + "?" + ((Object) sb2);
                    } else {
                        str5 = str + ((Object) sb2);
                    }
                }
                str5 = str + "&" + ((Object) sb2);
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(((Object) sb) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            edit.putString(((Object) sb) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str7 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb3.append("/");
            sb3.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb3.append(str6);
            edit.putString(str7, sb3.toString());
            edit.commit();
            af.g.o(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cj1(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        this.f36513b = n10.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        n10.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f36516f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.f36515e);
        org.telegram.ui.Components.tq tqVar = new org.telegram.ui.Components.tq(context, 1);
        this.f36514c = tqVar;
        this.f36513b.addView(tqVar, k7.c6.c(-1.0f, -1));
        this.f36514c.setAlpha(0.0f);
        this.f36514c.setScaleX(0.1f);
        this.f36514c.setScaleY(0.1f);
        this.f36514c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f36512a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f36512a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f36512a.setLayerType(2, null);
        this.f36512a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f36512a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f36512a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f36512a, true);
        this.f36512a.addJavascriptInterface(new dj1(this), "TelegramWebviewProxy");
        this.f36512a.setWebViewClient(new org.telegram.ui.Components.tf0(this, 1));
        frameLayout.addView(this.f36512a, k7.c6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36514c, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36514c, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.E7));
        return arrayList;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        AndroidUtilities.cancelRunOnUIThread(this.f36519s);
        this.f36512a.setLayerType(0, null);
        this.f36519s = null;
        try {
            ViewParent parent = this.f36512a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f36512a);
            }
            this.f36512a.stopLoading();
            this.f36512a.loadUrl("about:blank");
            this.f36512a.destroy();
            this.f36512a = null;
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f36519s);
        this.f36519s.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        WebView webView;
        if (z4 && !z10 && (webView = this.f36512a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
