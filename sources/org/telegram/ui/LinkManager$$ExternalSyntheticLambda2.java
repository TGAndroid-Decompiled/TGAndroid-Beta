package org.telegram.ui;

import android.opengl.GLSurfaceView;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.Bulletin;

public final class LinkManager$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public LinkManager$$ExternalSyntheticLambda2(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((LinkManager) this.f$0).lambda$handleSettings$1((TLObject) this.f$1);
                break;
            case 1:
                ((DialogsActivity) this.f$0).lambda$updateDialogsHint$64((String) this.f$1);
                break;
            case 2:
                ((DialogsActivity) this.f$0).lambda$showItemOptions$172((TLRPC.TL_attachMenuBot) this.f$1);
                break;
            case 3:
                ((EmojiAnimationsOverlay) this.f$0).lambda$showStickerSetBulletin$3((MessageObject) this.f$1);
                break;
            case 4:
                ((FilterCreateActivity) this.f$0).lambda$save$24((Runnable) this.f$1);
                break;
            case 5:
                ((FilterCreateActivity) this.f$0).lambda$loadInvites$0((TLObject) this.f$1);
                break;
            case 6:
                ((FilterCreateActivity) this.f$0).lambda$onClickCreateLink$10((TL_chatlists.TL_chatlists_exportedChatlistInvite) this.f$1);
                break;
            case 7:
                ((FilterCreateActivity) this.f$0).lambda$deleteFolder$15((AlertDialog) this.f$1);
                break;
            case 8:
                ((FiltersSetupActivity) this.f$0).lambda$createView$2((TLRPC.TL_messages_toggleDialogFilterTags) this.f$1);
                break;
            case 9:
                ((GroupCallActivity) this.f$0).lambda$fullscreenFor$52((ArrayList) this.f$1);
                break;
            case 10:
                ((GroupCallActivity) this.f$0).lambda$new$43((TLRPC.TL_error) this.f$1);
                break;
            case 11:
                ((GroupStickersActivity) this.f$0).lambda$saveStickerSet$1((TLRPC.TL_error) this.f$1);
                break;
            case 12:
                ((LanguageSelectActivity) this.f$0).lambda$processSearch$10((String) this.f$1);
                break;
            case 13:
                ((LanguageSelectActivity) this.f$0).lambda$updateSearchResults$11((ArrayList) this.f$1);
                break;
            case 14:
                ((LaunchActivity) this.f$0).lambda$showPasscodeActivity$6((Runnable) this.f$1);
                break;
            case 15:
                LaunchActivity.lambda$handleIntent$23((ActionIntroActivity) this.f$0, (TLRPC.TL_error) this.f$1);
                break;
            case 16:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$100((ThemePreviewActivity) this.f$1);
                break;
            case 17:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$103((Browser.Progress) this.f$1);
                break;
            case 18:
                LaunchActivity.lambda$runLinkRequest$46((Browser.Progress) this.f$0, (AlertDialog) this.f$1);
                break;
            case 19:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$88((TLRPC.TL_chatInviteJoinResultWebView) this.f$1);
                break;
            case 20:
                ((LaunchActivity) this.f$0).lambda$didReceivedNotification$166((Bulletin) this.f$1);
                break;
            case 21:
                ((LaunchActivity) this.f$0).lambda$runLinkRequest$112((TLObject) this.f$1);
                break;
            case 22:
                ((LaunchActivity) this.f$0).lambda$handleIntent$19((TL_account.Password) this.f$1);
                break;
            case 23:
                LaunchActivity.lambda$checkAppUpdate$138((Browser.Progress) this.f$0, (TLRPC.TL_error) this.f$1);
                break;
            case 24:
                ((LaunchActivity) this.f$0).lambda$handleIntent$8((String) this.f$1);
                break;
            case 25:
                ((LinkManager) this.f$0).lambda$handleSettings$0((FiltersSetupActivity) this.f$1);
                break;
            case 26:
                ((LocationActivity) this.f$0).lambda$createView$7((LocationController.SharingLocationInfo) this.f$1);
                break;
            case 27:
                ((LocationActivity) this.f$0).lambda$onCheckGlScreenshot$49((GLSurfaceView) this.f$1);
                break;
            case 28:
                ((EditText) this.f$0).removeTextChangedListener((TextWatcher) this.f$1);
                break;
            default:
                ((LoginActivity.LoginActivityEmailCodeView) this.f$0).lambda$animateSuccess$25((Runnable) this.f$1);
                break;
        }
    }
}
