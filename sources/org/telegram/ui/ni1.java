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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
public final class ni1 extends org.telegram.ui.ActionBar.r2 {
    public WebView f41938a;
    public org.telegram.ui.ActionBar.w0 f41939b;
    public org.telegram.ui.Components.er f41940c;
    public final String d;
    public final String e;
    public final String f41941f;
    public final String h;
    public final MessageObject f41942n;
    public final String f41943r;
    public y5 f41944s;

    public ni1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        String j10;
        this.f41944s = new y5(this, 16);
        this.d = str;
        this.e = str2;
        this.f41941f = str3;
        this.f41942n = messageObject;
        this.f41943r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            j10 = "";
        } else {
            j10 = org.telegram.ui.Components.b10.j("?game=", str4);
        }
        sb2.append(j10);
        this.h = sb2.toString();
    }

    public static int V(ni1 ni1Var) {
        return ni1Var.currentAccount;
    }

    public static void W(String str, MessageObject messageObject, Activity activity, String str2, String str3) {
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
            qf.d.n(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.I7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.H7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.E7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.D7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23636s8));
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new li1(this));
        org.telegram.ui.ActionBar.z l4 = this.actionBar.l();
        this.f41939b = l4.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        l4.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f41941f);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        kVar.setSubtitle("@" + this.e);
        org.telegram.ui.Components.er erVar = new org.telegram.ui.Components.er(context, 1);
        this.f41940c = erVar;
        this.f41939b.addView(erVar, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.f41940c.setAlpha(0.0f);
        this.f41940c.setScaleX(0.1f);
        this.f41940c.setScaleY(0.1f);
        this.f41940c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f41938a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f41938a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f41938a.setLayerType(2, null);
        this.f41938a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f41938a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f41938a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f41938a, true);
        this.f41938a.addJavascriptInterface(new mi1(this), "TelegramWebviewProxy");
        this.f41938a.setWebViewClient(new org.telegram.ui.Components.ig0(this, 1));
        frameLayout.addView(this.f41938a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.F8));
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
        AndroidUtilities.cancelRunOnUIThread(this.f41944s);
        this.f41938a.setLayerType(0, null);
        this.f41944s = null;
        try {
            ViewParent parent = this.f41938a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f41938a);
            }
            this.f41938a.stopLoading();
            this.f41938a.loadUrl("about:blank");
            this.f41938a.destroy();
            this.f41938a = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f41944s);
        this.f41944s.run();
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            if (kVar != null) {
                kVar.A(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false), false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f41938a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
