package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.mlkit_language_id_common.zzil;
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
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.SerializedData;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.FilterGLThread$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.PaintView;
import org.telegram.ui.Stories.recorder.PreviewButtons;
import org.telegram.ui.Stories.recorder.RoundVideoRecorder;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.bots.BotCommandsMenuContainer;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;

public final class WebviewActivity extends BaseFragment {
    public final String currentBot;
    public final String currentGame;
    public final MessageObject currentMessageObject;
    public final String currentUrl;
    public final String linkToCopy;
    public ActionBarMenuItem progressItem;
    public ContextProgressView progressView;
    public final String short_param;
    public LaunchActivity.AnonymousClass18 typingRunnable;
    public WebView webView;

    public final class AnonymousClass3 extends WebViewClient {
        public final int $r8$classId;
        public final Object this$0;

        public final class AnonymousClass1 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final Object this$1;

            public AnonymousClass1(Object obj, int i) {
                this.$r8$classId = i;
                this.this$1 = obj;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        AnonymousClass3 anonymousClass3 = (AnonymousClass3) this.this$1;
                        ((WebviewActivity) anonymousClass3.this$0).getClass();
                        ((WebviewActivity) anonymousClass3.this$0).progressView.setVisibility(4);
                        break;
                    case 1:
                        HintView2 hintView2 = (HintView2) this.this$1;
                        hintView2.bounceT = 1.0f;
                        hintView2.invalidate();
                        break;
                    case 2:
                        super.onAnimationEnd(animator);
                        PaintView.PopupButton popupButton = (PaintView.PopupButton) this.this$1;
                        ImageView imageView = popupButton.imageView;
                        popupButton.imageView = popupButton.image2View;
                        popupButton.image2View = imageView;
                        imageView.bringToFront();
                        popupButton.image2View.setVisibility(8);
                        popupButton.imageSwitchAnimator = null;
                        break;
                    case 3:
                        super.onAnimationEnd(animator);
                        ((PreviewButtons.ShareButtonView) this.this$1).backAnimator = null;
                        break;
                    case 4:
                        RoundVideoRecorder roundVideoRecorder = (RoundVideoRecorder) this.this$1;
                        if (roundVideoRecorder.getParent() instanceof ViewGroup) {
                            ((ViewGroup) roundVideoRecorder.getParent()).removeView(roundVideoRecorder);
                        }
                        break;
                    case 5:
                        ((StoryPrivacyBottomSheet.Page) this.this$1).searchTranslationAnimating = false;
                        break;
                    case 6:
                        StoryPrivacyBottomSheet.Page.ButtonContainer buttonContainer = (StoryPrivacyBottomSheet.Page.ButtonContainer) this.this$1;
                        buttonContainer.setTranslationY(0.0f);
                        buttonContainer.animator = null;
                        break;
                    case 7:
                        ThemePreviewActivity.AnonymousClass8 anonymousClass8 = (ThemePreviewActivity.AnonymousClass8) this.this$1;
                        if (!ThemePreviewActivity.this.onSwitchDayNightDelegate.isDark()) {
                            ThemePreviewActivity.this.dimmingSlider.setVisibility(8);
                        }
                        break;
                    case 8:
                        super.onAnimationEnd(animator);
                        ((TopicCreateFragment.AnonymousClass4) this.this$1).backAnimator = null;
                        break;
                    case 9:
                        super.onAnimationEnd(animator);
                        ((TopicsFragment.TopicsRecyclerView) this.this$1).setScrollEnabled(true);
                        break;
                    case 10:
                        TwoStepVerificationSetupActivity.AnonymousClass6 anonymousClass6 = (TwoStepVerificationSetupActivity.AnonymousClass6) this.this$1;
                        if (animator.equals(TwoStepVerificationSetupActivity.this.actionBarAnimator)) {
                            TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                        }
                        break;
                    case 11:
                        UsersSelectActivity.SpansContainer spansContainer = (UsersSelectActivity.SpansContainer) this.this$1;
                        spansContainer.addingSpan = null;
                        spansContainer.currentAnimation = null;
                        spansContainer.animationStarted = false;
                        UsersSelectActivity.this.editText.setAllowDrawCursor(true);
                        break;
                    case 12:
                        BotCommandsMenuContainer botCommandsMenuContainer = (BotCommandsMenuContainer) this.this$1;
                        botCommandsMenuContainer.setVisibility(8);
                        botCommandsMenuContainer.currentAnimation = null;
                        break;
                    case 13:
                        ((BotWebViewSheet) this.this$1).progressView.setVisibility(8);
                        break;
                    case 14:
                        ((ChatAttachAlertBotWebViewLayout) this.this$1).progressView.setVisibility(8);
                        break;
                    default:
                        ((BotWebViewContainer) this.this$1).flickerView.setVisibility(8);
                        break;
                }
            }
        }

        public AnonymousClass3(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        public boolean isInternalUrl(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri uri = Uri.parse(str);
            if (!"tg".equals(uri.getScheme())) {
                return false;
            }
            ((WebviewActivity) this.this$0).getClass();
            ((WebviewActivity) this.this$0).finishFragment(false);
            try {
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                intent.setComponent(new ComponentName(ApplicationLoader.applicationContext.getPackageName(), LaunchActivity.class.getName()));
                intent.putExtra("com.android.browser.application_id", ApplicationLoader.applicationContext.getPackageName());
                ApplicationLoader.applicationContext.startActivity(intent);
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return true;
            }
        }

        @Override
        public void onLoadResource(WebView webView, String str) {
            switch (this.$r8$classId) {
                case 0:
                    if (!isInternalUrl(str)) {
                        super.onLoadResource(webView, str);
                        break;
                    }
                    break;
                default:
                    super.onLoadResource(webView, str);
                    break;
            }
        }

        @Override
        public final void onPageFinished(WebView webView, String str) {
            Object obj = this.this$0;
            int i = 0;
            switch (this.$r8$classId) {
                case 0:
                    super.onPageFinished(webView, str);
                    WebviewActivity webviewActivity = (WebviewActivity) obj;
                    ContextProgressView contextProgressView = webviewActivity.progressView;
                    if (contextProgressView != null && contextProgressView.getVisibility() == 0) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        webviewActivity.progressItem.getContentView().setVisibility(0);
                        webviewActivity.progressItem.setEnabled(true);
                        animatorSet.playTogether(ObjectAnimator.ofFloat(webviewActivity.progressView, "scaleX", 1.0f, 0.1f), ObjectAnimator.ofFloat(webviewActivity.progressView, "scaleY", 1.0f, 0.1f), ObjectAnimator.ofFloat(webviewActivity.progressView, "alpha", 1.0f, 0.0f), ObjectAnimator.ofFloat(webviewActivity.progressItem.getContentView(), "scaleX", 0.0f, 1.0f), ObjectAnimator.ofFloat(webviewActivity.progressItem.getContentView(), "scaleY", 0.0f, 1.0f), ObjectAnimator.ofFloat(webviewActivity.progressItem.getContentView(), "alpha", 0.0f, 1.0f));
                        animatorSet.addListener(new AnonymousClass1(this, i));
                        animatorSet.setDuration(150L);
                        animatorSet.start();
                        break;
                    }
                    break;
                default:
                    super.onPageFinished(webView, str);
                    PhotoViewer.AnonymousClass79 anonymousClass79 = (PhotoViewer.AnonymousClass79) obj;
                    if (!anonymousClass79.isYouTube) {
                        anonymousClass79.progressBar.setVisibility(4);
                        anonymousClass79.progressBarBlackBackground.setVisibility(4);
                        ActionBarMenuSubItem actionBarMenuSubItem = anonymousClass79.pipItem;
                        actionBarMenuSubItem.setEnabled(true);
                        actionBarMenuSubItem.setAlpha(1.0f);
                        break;
                    }
                    break;
            }
        }

        @Override
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            switch (this.$r8$classId) {
                case 1:
                    String string = webResourceRequest.getUrl().toString();
                    if (!((PhotoViewer.AnonymousClass79) this.this$0).isYouTube || !string.startsWith("https://www.youtube.com/youtubei/v1/player?key=")) {
                        return null;
                    }
                    Utilities.externalNetworkQueue.postRunnable(new FilterGLThread$$ExternalSyntheticLambda1(this, string, webResourceRequest, 18));
                    return null;
                default:
                    return super.shouldInterceptRequest(webView, webResourceRequest);
            }
        }

        @Override
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            switch (this.$r8$classId) {
                case 0:
                    return isInternalUrl(str) || super.shouldOverrideUrlLoading(webView, str);
                default:
                    if (!((PhotoViewer.AnonymousClass79) this.this$0).isYouTube) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Browser.openUrl(webView.getContext(), str);
                    return true;
            }
        }
    }

    public final class TelegramWebviewProxy {
        public TelegramWebviewProxy() {
        }

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda9(28, this, str));
        }
    }

    public WebviewActivity(String str, String str2, String str3, String str4, MessageObject messageObject) {
        super(null);
        this.typingRunnable = new LaunchActivity.AnonymousClass18(this, 23);
        this.currentUrl = str;
        this.currentBot = str2;
        this.currentGame = str3;
        this.currentMessageObject = messageObject;
        this.short_param = str4;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(MessagesController.getInstance(this.currentAccount).linkPrefix);
        sb.append("/");
        sb.append(str2);
        sb.append(TextUtils.isEmpty(str4) ? "" : zzil.m("?game=", str4));
        this.linkToCopy = sb.toString();
    }

    public static void openGameInBrowser(String str, MessageObject messageObject, Activity activity, String str2, String str3) {
        String str4;
        String str5 = "";
        try {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("botshare", 0);
            String string = sharedPreferences.getString("" + messageObject.getId(), null);
            StringBuilder sb = new StringBuilder(string != null ? string : "");
            StringBuilder sb2 = new StringBuilder("tgShareScoreUrl=" + URLEncoder.encode("tgb://share_game_score?hash=", "UTF-8"));
            if (string == null) {
                char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
                for (int i = 0; i < 20; i++) {
                    sb.append(charArray[Utilities.random.nextInt(charArray.length)]);
                }
            }
            sb2.append((CharSequence) sb);
            int iIndexOf = str.indexOf(35);
            if (iIndexOf < 0) {
                str4 = str + "#" + ((Object) sb2);
            } else {
                String strSubstring = str.substring(iIndexOf + 1);
                if (strSubstring.indexOf(61) >= 0 || strSubstring.indexOf(63) >= 0) {
                    str4 = str + "&" + ((Object) sb2);
                } else if (strSubstring.length() > 0) {
                    str4 = str + "?" + ((Object) sb2);
                } else {
                    str4 = str + ((Object) sb2);
                }
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(((Object) sb) + "_date", (int) (System.currentTimeMillis() / 1000));
            SerializedData serializedData = new SerializedData(messageObject.messageOwner.getObjectSize());
            messageObject.messageOwner.serializeToStream(serializedData);
            editorEdit.putString(((Object) sb) + "_m", Utilities.bytesToHex(serializedData.toByteArray()));
            String str6 = ((Object) sb) + "_link";
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            sb3.append(MessagesController.getInstance(messageObject.currentAccount).linkPrefix);
            sb3.append("/");
            sb3.append(str3);
            if (!TextUtils.isEmpty(str2)) {
                str5 = "?game=" + str2;
            }
            sb3.append(str5);
            editorEdit.putString(str6, sb3.toString());
            editorEdit.commit();
            if (activity != null && str4 != null) {
                Browser.openUrl(activity, Uri.parse(str4), false, true);
            }
            serializedData.cleanup();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i) {
                WebviewActivity webviewActivity = WebviewActivity.this;
                if (i == -1) {
                    webviewActivity.finishFragment();
                    return;
                }
                if (i == 1) {
                    MessageObject messageObject = webviewActivity.currentMessageObject;
                    if (messageObject != null) {
                        messageObject.messageOwner.with_my_score = false;
                        webviewActivity.showDialog(ShareAlert.createShareAlert(webviewActivity.getParentActivity(), webviewActivity.currentMessageObject, null, false, webviewActivity.linkToCopy));
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    WebviewActivity.openGameInBrowser(webviewActivity.currentUrl, webviewActivity.currentMessageObject, webviewActivity.getParentActivity(), webviewActivity.short_param, webviewActivity.currentBot);
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        this.progressItem = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.share, AndroidUtilities.dp(54.0f));
        actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other).addSubItem(2, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
        this.actionBar.setTitle(this.currentGame);
        this.actionBar.setSubtitle("@" + this.currentBot);
        ContextProgressView contextProgressView = new ContextProgressView(context, 1);
        this.progressView = contextProgressView;
        this.progressItem.addView(contextProgressView, LayoutHelper.createFrame(-1.0f, -1));
        this.progressView.setAlpha(0.0f);
        this.progressView.setScaleX(0.1f);
        this.progressView.setScaleY(0.1f);
        this.progressView.setVisibility(4);
        AndroidUtilities.checkAndroidTheme(context, true);
        WebView webView = new WebView(context);
        this.webView = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setDomStorageEnabled(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.webView.setLayerType(2, null);
        this.webView.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.TEXT_AUTOSIZING);
        this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        this.webView.getSettings().setMixedContentMode(0);
        CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
        this.webView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
        this.webView.setWebViewClient(new AnonymousClass3(this, 0));
        frameLayout.addView(this.webView, LayoutHelper.createFrame(-1.0f, -1));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, null, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, null, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, null, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.progressView, 0, null, null, null, null, Theme.key_contextProgressInner2));
        arrayList.add(new ThemeDescription(this.progressView, 0, null, null, null, null, Theme.key_contextProgressOuter2));
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
        AndroidUtilities.cancelRunOnUIThread(this.typingRunnable);
        this.webView.setLayerType(0, null);
        this.typingRunnable = null;
        try {
            ViewParent parent = this.webView.getParent();
            if (parent != null) {
                ((FrameLayout) parent).removeView(this.webView);
            }
            this.webView.stopLoading();
            this.webView.loadUrl("about:blank");
            this.webView.destroy();
            this.webView = null;
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        AndroidUtilities.cancelRunOnUIThread(this.typingRunnable);
        this.typingRunnable.run();
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        WebView webView;
        if (!z || z2 || (webView = this.webView) == null) {
            return;
        }
        webView.loadUrl(this.currentUrl);
    }
}
