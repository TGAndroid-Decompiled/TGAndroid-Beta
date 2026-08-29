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
public final class ji1 extends org.telegram.ui.ActionBar.o2 {
    public WebView f39561a;
    public org.telegram.ui.ActionBar.w0 f39562b;
    public org.telegram.ui.Components.nq f39563c;
    public final String d;
    public final String f39564e;
    public final String f39565f;
    public final String h;
    public final MessageObject f39566n;
    public final String f39567r;
    public w5 f39568s;

    public ji1(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        String e10;
        this.f39568s = new w5(this, 15);
        this.d = str;
        this.f39564e = str2;
        this.f39565f = str3;
        this.f39566n = messageObject;
        this.f39567r = str4;
        StringBuilder sb2 = new StringBuilder("https://");
        sb2.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb2.append("/");
        sb2.append(str2);
        if (TextUtils.isEmpty(str4)) {
            e10 = "";
        } else {
            e10 = u3.c.e("?game=", str4);
        }
        sb2.append(e10);
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
            ye.d.o(activity, str5, false);
            serializedData.cleanup();
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new hi1(this));
        org.telegram.ui.ActionBar.a0 n10 = this.actionBar.n();
        this.f39562b = n10.g(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        n10.a(0, R.drawable.ic_ab_other).e(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.f39565f);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        lVar.setSubtitle("@" + this.f39564e);
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(context, 1);
        this.f39563c = nqVar;
        this.f39562b.addView(nqVar, i7.f6.c(-1.0f, -1));
        this.f39563c.setAlpha(0.0f);
        this.f39563c.setScaleX(0.1f);
        this.f39563c.setScaleY(0.1f);
        this.f39563c.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.f39561a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f39561a.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.f39561a.setLayerType(2, null);
        this.f39561a.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.f39561a.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.f39561a.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.f39561a, true);
        this.f39561a.addJavascriptInterface(new ii1(this), "TelegramWebviewProxy");
        this.f39561a.setWebViewClient(new org.telegram.ui.Components.if0(this, 1));
        frameLayout.addView(this.f39561a, i7.f6.c(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, null, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, null, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, null, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39563c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.D7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f39563c, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.E7));
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
        AndroidUtilities.cancelRunOnUIThread(this.f39568s);
        this.f39561a.setLayerType(0, null);
        this.f39568s = null;
        try {
            ViewParent parent = this.f39561a.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.f39561a);
            }
            this.f39561a.stopLoading();
            this.f39561a.loadUrl("about:blank");
            this.f39561a.destroy();
            this.f39561a = null;
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.f39568s);
        this.f39568s.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        WebView webView;
        if (z10 && !z11 && (webView = this.f39561a) != null) {
            webView.loadUrl(this.d);
        }
    }
}
