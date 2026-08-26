package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.web.BotWebViewContainer;

public final class OAuthSheet$$ExternalSyntheticLambda8 implements Runnable {
    public final ButtonWithCounterView f$0;
    public final ButtonWithCounterView f$1;
    public final Theme.ResourcesProvider f$10;
    public final boolean f$11;
    public final String f$12;
    public final TLRPC.TL_urlAuthResultRequest f$13;
    public final BotWebViewContainer f$14;
    public final TLRPC.TL_messages_requestUrlAuth f$2;
    public final String[] f$3;
    public final TextCheckCell f$4;
    public final boolean[] f$5;
    public final int[] f$6;
    public final boolean[] f$7;
    public final BottomSheet f$8;
    public final String f$9;

    public OAuthSheet$$ExternalSyntheticLambda8(ButtonWithCounterView buttonWithCounterView, ButtonWithCounterView buttonWithCounterView2, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String[] strArr, TextCheckCell textCheckCell, boolean[] zArr, int[] iArr, boolean[] zArr2, BottomSheet bottomSheet, String str, Theme.ResourcesProvider resourcesProvider, boolean z, String str2, TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest, BotWebViewContainer botWebViewContainer) {
        this.f$0 = buttonWithCounterView;
        this.f$1 = buttonWithCounterView2;
        this.f$2 = tL_messages_requestUrlAuth;
        this.f$3 = strArr;
        this.f$4 = textCheckCell;
        this.f$5 = zArr;
        this.f$6 = iArr;
        this.f$7 = zArr2;
        this.f$8 = bottomSheet;
        this.f$9 = str;
        this.f$10 = resourcesProvider;
        this.f$11 = z;
        this.f$12 = str2;
        this.f$13 = tL_urlAuthResultRequest;
        this.f$14 = botWebViewContainer;
    }

    @Override
    public final void run() {
        ButtonWithCounterView buttonWithCounterView = this.f$0;
        if (buttonWithCounterView.loading || this.f$1.loading) {
            return;
        }
        buttonWithCounterView.setLoading(true);
        final TLRPC.TL_messages_acceptUrlAuth tL_messages_acceptUrlAuth = new TLRPC.TL_messages_acceptUrlAuth();
        final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = this.f$2;
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 2)) {
            tL_messages_acceptUrlAuth.flags |= 2;
            tL_messages_acceptUrlAuth.peer = tL_messages_requestUrlAuth.peer;
            tL_messages_acceptUrlAuth.msg_id = tL_messages_requestUrlAuth.msg_id;
            tL_messages_acceptUrlAuth.button_id = tL_messages_requestUrlAuth.button_id;
        }
        if (TLObject.hasFlag(tL_messages_requestUrlAuth.flags, 4)) {
            tL_messages_acceptUrlAuth.flags |= 4;
            tL_messages_acceptUrlAuth.url = tL_messages_requestUrlAuth.url;
        }
        String str = this.f$3[0];
        if (str != null) {
            tL_messages_acceptUrlAuth.match_code = str;
        }
        TextCheckCell textCheckCell = this.f$4;
        tL_messages_acceptUrlAuth.write_allowed = textCheckCell != null && textCheckCell.checkBox.isChecked;
        tL_messages_acceptUrlAuth.share_phone_number = this.f$5[0];
        final int[] iArr = this.f$6;
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(iArr[0]);
        AiTonesController$$ExternalSyntheticLambda0 aiTonesController$$ExternalSyntheticLambda0 = new AiTonesController$$ExternalSyntheticLambda0();
        final boolean[] zArr = this.f$7;
        final BottomSheet bottomSheet = this.f$8;
        final TLRPC.TL_urlAuthResultRequest tL_urlAuthResultRequest = this.f$13;
        final BotWebViewContainer botWebViewContainer = this.f$14;
        final String str2 = this.f$9;
        final Theme.ResourcesProvider resourcesProvider = this.f$10;
        final boolean z = this.f$11;
        final String str3 = this.f$12;
        connectionsManager.sendRequestTyped(tL_messages_acceptUrlAuth, aiTonesController$$ExternalSyntheticLambda0, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                TLRPC.UrlAuthResult urlAuthResult = (TLRPC.UrlAuthResult) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                zArr[0] = true;
                bottomSheet.lambda$showGiftOfferSheet$15();
                if (tL_error == null) {
                    OAuthSheet.handle(z, iArr[0], tL_messages_requestUrlAuth, urlAuthResult, str3, tL_urlAuthResultRequest, null, tL_messages_acceptUrlAuth.share_phone_number, botWebViewContainer);
                    return;
                }
                if (!"URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    OAuthSheet.getBulletinFactory().showForError(false, tL_error);
                    return;
                }
                BulletinFactory bulletinFactory = OAuthSheet.getBulletinFactory();
                int i = R.raw.error;
                String string = LocaleController.getString(R.string.BotAuthLoggedInFailTitle);
                String str4 = str2;
                bulletinFactory.createSimpleBulletin(string, TextUtils.isEmpty(str4) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str4), Theme.getColor(Theme.key_undo_cancelColor, resourcesProvider)), i).show();
            }
        });
    }
}
