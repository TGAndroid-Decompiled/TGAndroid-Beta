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
public final class qj1 extends org.telegram.ui.ActionBar.n2 {
    public WebView f39888a;
    public org.telegram.ui.ActionBar.v0 f39889b;
    public org.telegram.ui.Components.sq f39890c;
    public final String d;
    public final String f39891e;
    public final String f39892f;
    public final String h;
    public final MessageObject f39893n;
    public final String f39894r;
    public w5 f39895s;

    public qj1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        String i10;
        this.f39895s = new w5(this, 15);
        this.d = str;
        this.f39891e = str2;
        this.f39892f = str3;
        this.f39893n = messageObject;
        this.f39894r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            i10 = "";
        } else {
            i10 = org.telegram.ui.Cells.p6.i("?game=", str4);
        }
        sb2.append(i10);
        this.h = sb2.toString();
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
            StringBuilder sb2 = new StringBuilder(str4);
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb2.append(charArray[Utilities.random.nextInt(charArray.length)]);
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
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            edit.putString(((Object) sb2) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str7 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str6 = "?game=" + str2;
            }
            sb4.append(str6);
            edit.putString(str7, sb4.toString());
            edit.commit();
            of.f.o(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new nj1(this));
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        this.f39889b = n10.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        n10.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f39892f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.f39891e);
        org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(context, 1);
        this.f39890c = sqVar;
        this.f39889b.addView(sqVar, w7.x5.c(-1.0f, -1));
        this.f39890c.setAlpha(0.0f);
        this.f39890c.setScaleX(0.1f);
        this.f39890c.setScaleY(0.1f);
        this.f39890c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f39888a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f39888a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f39888a.setLayerType(2, null);
        this.f39888a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f39888a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f39888a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f39888a, true);
        this.f39888a.addJavascriptInterface(new pj1(this), "TelegramWebviewProxy");
        this.f39888a.setWebViewClient(new fg.i(this, 2));
        frameLayout.addView(this.f39888a, w7.x5.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20664d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20938s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20993v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20957t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.j6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.j6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.j6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39890c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f39890c, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.E7));
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
        AndroidUtilities.cancelRunOnUIThread(this.f39895s);
        this.f39888a.setLayerType(0, null);
        this.f39895s = null;
        try {
            ViewParent parent = this.f39888a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f39888a);
            }
            this.f39888a.stopLoading();
            this.f39888a.loadUrl("about:blank");
            this.f39888a.destroy();
            this.f39888a = null;
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f39895s);
        this.f39895s.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f39888a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
