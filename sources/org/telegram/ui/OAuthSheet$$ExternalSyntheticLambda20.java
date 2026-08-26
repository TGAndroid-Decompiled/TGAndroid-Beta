package org.telegram.ui;

import android.app.Dialog;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Stars.StarGiftSheet;

public final class OAuthSheet$$ExternalSyntheticLambda20 implements Utilities.Callback2 {
    public final int $r8$classId;
    public final Dialog f$0;
    public final Object f$1;
    public final Serializable f$2;
    public final Object f$3;

    public OAuthSheet$$ExternalSyntheticLambda20(Dialog dialog, Object obj, Serializable serializable, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = dialog;
        this.f$1 = obj;
        this.f$2 = serializable;
        this.f$3 = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        Object obj3 = this.f$1;
        Dialog dialog = this.f$0;
        Object obj4 = this.f$3;
        Serializable serializable = this.f$2;
        switch (this.$r8$classId) {
            case 0:
                ((AlertDialog) dialog).dismiss();
                if (!(((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue)) {
                    BottomSheet bottomSheet = OAuthSheet.showing;
                    if (bottomSheet != null) {
                        bottomSheet.lambda$showGiftOfferSheet$15();
                        OAuthSheet.showing = null;
                    }
                    String str = (String) serializable;
                    OAuthSheet.getBulletinFactory().createSimpleBulletin(LocaleController.getString(R.string.BotAuthLoggedInFailTitle), TextUtils.isEmpty(str) ? LocaleController.getString(R.string.BotAuthLoggedInFailNoDomain) : AndroidUtilities.replaceSingleLinkBold(LocaleController.formatString(R.string.BotAuthLoggedInFail, str), Theme.getColor(Theme.key_undo_cancelColor, (Theme.ResourcesProvider) obj4)), R.raw.error).show();
                } else {
                    BottomSheet bottomSheet2 = (BottomSheet) obj3;
                    OAuthSheet.showing = bottomSheet2;
                    bottomSheet2.show();
                }
                break;
            default:
                ((StarGiftSheet) dialog).lambda$openCrafting$4((Utilities.Callback2) obj3, (ArrayList) serializable, (Runnable) obj4, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
        }
    }
}
