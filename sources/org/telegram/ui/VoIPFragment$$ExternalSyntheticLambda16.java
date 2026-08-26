package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.webkit.JsPromptResult;
import android.widget.EditText;
import androidx.core.util.Consumer;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.MentionsAdapter;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.NumberPicker;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.Gifts.SendGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.web.BotWebViewContainer;

public final class VoIPFragment$$ExternalSyntheticLambda16 implements DialogInterface.OnDismissListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public VoIPFragment$$ExternalSyntheticLambda16(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onDismiss(DialogInterface dialogInterface) {
        Runnable runnable;
        switch (this.$r8$classId) {
            case 0:
                VoIPFragment voIPFragment = (VoIPFragment) this.f$0;
                voIPFragment.getClass();
                if (!((boolean[]) this.f$1)[0]) {
                    voIPFragment.windowView.finish(330L);
                }
                break;
            case 1:
                ((BaseFragment) this.f$0).lambda$showDialog$0((DialogInterface.OnDismissListener) this.f$1, dialogInterface);
                break;
            case 2:
                BaseFragment baseFragment = (BaseFragment) this.f$0;
                baseFragment.onPause();
                baseFragment.onFragmentDestroy();
                BaseFragment.BottomSheetParams bottomSheetParams = (BaseFragment.BottomSheetParams) this.f$1;
                if (bottomSheetParams != null && (runnable = bottomSheetParams.onDismiss) != null) {
                    runnable.run();
                    break;
                }
                break;
            case 3:
                MentionsAdapter mentionsAdapter = (MentionsAdapter) this.f$0;
                mentionsAdapter.getClass();
                if (!((boolean[]) this.f$1)[0]) {
                    mentionsAdapter.onLocationUnavailable();
                }
                break;
            case 4:
                if (!((AtomicBoolean) this.f$0).get()) {
                    ((Consumer) this.f$1).accept(Boolean.FALSE);
                }
                break;
            case 5:
                AndroidUtilities.hideKeyboard((EditText) this.f$0);
                AndroidUtilities.hideKeyboard((EditText) this.f$1);
                break;
            case 6:
                ((PollItemMenu$$ExternalSyntheticLambda14) this.f$0).run(Integer.valueOf(((NumberPicker) this.f$1).getValue()));
                break;
            case 7:
                if (!((AtomicBoolean) this.f$0).get()) {
                    ((LinkManager$3$$ExternalSyntheticLambda0) this.f$1).run();
                }
                break;
            case 8:
                ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.f$0;
                externalActionActivity.getClass();
                externalActionActivity.setResult(1, new Intent().putExtra("error", ((TLRPC.TL_error) this.f$1).text));
                externalActionActivity.finish();
                break;
            case 9:
                AlertDialog alertDialog = (AlertDialog) this.f$1;
                LaunchActivity launchActivity = (LaunchActivity) this.f$0;
                if (alertDialog == launchActivity.localeDialog) {
                    ActionBarLayout actionBarLayout = launchActivity.actionBarLayout;
                    BaseFragment lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                    try {
                        String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                        if (lastFragment != null) {
                            Bulletin bulletinCreateSimpleBulletinWithIconSize = BulletinFactory.of(lastFragment).createSimpleBulletinWithIconSize(R.raw.msg_translate, 36, LaunchActivity.getStringForLanguageAlert(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.englishLocaleStrings : launchActivity.systemLocaleStrings));
                            bulletinCreateSimpleBulletinWithIconSize.duration = 5000;
                            bulletinCreateSimpleBulletinWithIconSize.show();
                        } else {
                            Bulletin bulletinCreateSimpleBulletinWithIconSize2 = new BulletinFactory(new Bulletin.BulletinWindow(launchActivity, null).container, null).createSimpleBulletinWithIconSize(R.raw.msg_translate, 36, LaunchActivity.getStringForLanguageAlert(R.string.ChangeLanguageLater, "ChangeLanguageLater", str.equals("en") ? launchActivity.englishLocaleStrings : launchActivity.systemLocaleStrings));
                            bulletinCreateSimpleBulletinWithIconSize2.duration = 5000;
                            bulletinCreateSimpleBulletinWithIconSize2.show();
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    launchActivity.localeDialog = null;
                } else if (alertDialog == launchActivity.proxyErrorDialog) {
                    MessagesController.getGlobalMainSettings();
                    SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                    editorEdit.putBoolean("proxy_enabled", false);
                    editorEdit.putBoolean("proxy_enabled_calls", false);
                    editorEdit.commit();
                    ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                    launchActivity.proxyErrorDialog = null;
                }
                launchActivity.visibleDialogs.remove(alertDialog);
                break;
            case 10:
                if (!((boolean[]) this.f$1)[0]) {
                    ((OAuthSheet$$ExternalSyntheticLambda13) this.f$0).run(Boolean.FALSE);
                    break;
                }
                break;
            case 11:
                SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1 anonymousClass1 = (SelectAnimatedEmojiDialog.AnonymousClass17.AnonymousClass1) this.f$0;
                if (!((boolean[]) this.f$1)[0]) {
                    anonymousClass1.animateMenuShow(true);
                }
                anonymousClass1.dateBottomSheet = null;
                break;
            case 12:
                SendGiftSheet$$ExternalSyntheticLambda0 sendGiftSheet$$ExternalSyntheticLambda0 = (SendGiftSheet$$ExternalSyntheticLambda0) this.f$0;
                if (!((boolean[]) this.f$1)[0]) {
                    sendGiftSheet$$ExternalSyntheticLambda0.run(Boolean.FALSE, null);
                }
                break;
            case 13:
                boolean[] zArr = (boolean[]) this.f$1;
                if (!zArr[0]) {
                    ((ArticleViewer$$ExternalSyntheticLambda33) this.f$0).run(Boolean.FALSE);
                    zArr[0] = true;
                }
                break;
            case 14:
                boolean[] zArr2 = (boolean[]) this.f$1;
                if (!zArr2[0]) {
                    GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = (GiftSheet$$ExternalSyntheticLambda23) this.f$0;
                    zArr2[0] = true;
                    giftSheet$$ExternalSyntheticLambda23.run(null);
                }
                break;
            case 15:
                BotWebViewContainer botWebViewContainer = (BotWebViewContainer) this.f$0;
                botWebViewContainer.getClass();
                if (!((AtomicBoolean) this.f$1).get()) {
                    botWebViewContainer.notifyEvent("popup_closed", new JSONObject());
                }
                botWebViewContainer.currentDialog = null;
                botWebViewContainer.lastDialogClosed = System.currentTimeMillis();
                break;
            case 16:
                BotWebViewContainer botWebViewContainer2 = (BotWebViewContainer) this.f$0;
                Runnable runnable2 = (Runnable) this.f$1;
                if (runnable2 != null) {
                    botWebViewContainer2.getClass();
                    runnable2.run();
                }
                botWebViewContainer2.currentDialog = null;
                break;
            default:
                boolean[] zArr3 = (boolean[]) this.f$1;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((JsPromptResult) this.f$0).cancel();
                }
                break;
        }
    }

    public VoIPFragment$$ExternalSyntheticLambda16(boolean[] zArr, Object obj, int i) {
        this.$r8$classId = i;
        this.f$1 = zArr;
        this.f$0 = obj;
    }
}
