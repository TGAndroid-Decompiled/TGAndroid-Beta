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

public final class hi1 extends org.telegram.ui.ActionBar.n2 {

    public WebView f38841a;

    public org.telegram.ui.ActionBar.v0 f38842b;

    public org.telegram.ui.Components.hq f38843c;
    public final String d;

    public final String f38844e;

    public final String f38845f;
    public final String h;

    public final MessageObject f38846n;

    public final String f38847r;

    public w5 f38848s;

    public hi1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        this.f38848s = new w5(this, 15);
        this.d = str;
        this.f38844e = str2;
        this.f38845f = str3;
        this.f38846n = messageObject;
        this.f38847r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        sb2.append(str2);
        sb2.append(TextUtils.isEmpty(str4) ? "" : s3.c.e("?game=", str4));
        this.h = sb2.toString();
    }

    public static void V(String str, MessageObject messageObject, Activity activity, String str2, String str3) {
        String str4;
        String str5 = "";
        try {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + messageObject.getId(), null);
            StringBuilder sb2 = new StringBuilder(string != null ? string : "");
            StringBuilder sb3 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i10 = 0; i10 < 20; i10++) {
                    sb2.append(charArray[Utilities.random.nextInt(charArray.length)]);
                }
            }
            sb3.append((CharSequence) sb2);
            int iIndexOf = str.indexOf(35);
            if (iIndexOf < 0) {
                str4 = str + "#" + ((Object) sb3);
            } else {
                String strSubstring = str.substring(iIndexOf + 1);
                if (strSubstring.indexOf(61) >= 0 || strSubstring.indexOf(63) >= 0) {
                    str4 = str + "&" + ((Object) sb3);
                } else if (strSubstring.length() > 0) {
                    str4 = str + "?" + ((Object) sb3);
                } else {
                    str4 = str + ((Object) sb3);
                }
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(((Object) sb2) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            editorEdit.putString(((Object) sb2) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str6 = ((Object) sb2) + "_link";
            StringBuilder sb4 = new StringBuilder();
            sb4.append("https://");
            sb4.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb4.append("/");
            sb4.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str5 = "?game=" + str2;
            }
            sb4.append(str5);
            editorEdit.putString(str6, sb4.toString());
            editorEdit.commit();
            we.e.o(activity, str4, false);
            serializedData.cleanup();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new fi1(this));
        org.telegram.ui.ActionBar.z zVarN = this.actionBar.n();
        this.f38842b = zVarN.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        zVarN.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f38845f);
        this.actionBar.setSubtitle("@" + this.f38844e);
        org.telegram.ui.Components.hq hqVar = new org.telegram.ui.Components.hq(context, 1);
        this.f38843c = hqVar;
        this.f38842b.addView(hqVar, h7.z5.c(-1.0f, -1));
        this.f38843c.setAlpha(0.0f);
        this.f38843c.setScaleX(0.1f);
        this.f38843c.setScaleY(0.1f);
        this.f38843c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f38841a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f38841a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f38841a.setLayerType(2, null);
        this.f38841a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f38841a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f38841a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f38841a, true);
        this.f38841a.addJavascriptInterface(new gi1(this), "TelegramWebviewProxy");
        this.f38841a.setWebViewClient(new org.telegram.ui.Components.ze0(this, 1));
        frameLayout.addView(this.f38841a, h7.z5.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23053d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23322s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23375v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23341t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38843c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38843c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E7));
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
        AndroidUtilities.cancelRunOnUIThread(this.f38848s);
        this.f38841a.setLayerType(0, null);
        this.f38848s = null;
        try {
            ViewParent parent = this.f38841a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f38841a);
            }
            this.f38841a.stopLoading();
            this.f38841a.loadUrl("about:blank");
            this.f38841a.destroy();
            this.f38841a = null;
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f38848s);
        this.f38848s.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (!z10 || z11 || (webView = this.f38841a) == null) {
            return;
        }
        webView.loadUrl(this.d);
    }
}
