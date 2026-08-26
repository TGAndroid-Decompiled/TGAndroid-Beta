package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Stars.StarGiftSheet;

public final class DialogsActivity$$ExternalSyntheticLambda132 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final AlertDialog f$1;
    public final Object f$2;
    public final TLObject f$3;
    public final long f$4;
    public final Object f$6;

    public DialogsActivity$$ExternalSyntheticLambda132(DialogsActivity dialogsActivity, AlertDialog alertDialog, TLRPC.User user, TLRPC.Chat chat, long j, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f$0 = dialogsActivity;
        this.f$1 = alertDialog;
        this.f$2 = user;
        this.f$3 = chat;
        this.f$4 = j;
        this.f$6 = tL_messages_checkHistoryImportPeer;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                dialogsActivity.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda175(dialogsActivity, this.f$1, tLObject, (TLRPC.User) this.f$2, (TLRPC.Chat) this.f$3, this.f$4, tL_error, (TLRPC.TL_messages_checkHistoryImportPeer) this.f$6));
                break;
            default:
                StarGiftSheet starGiftSheet = (StarGiftSheet) this.f$0;
                starGiftSheet.getClass();
                AndroidUtilities.runOnUIThread(new DialogsActivity$$ExternalSyntheticLambda175(starGiftSheet, (Browser.Progress) this.f$2, this.f$1, tLObject, (TL_stars.TL_starGiftUnique) this.f$3, tL_error, this.f$4, (CharSequence) this.f$6));
                break;
        }
    }

    public DialogsActivity$$ExternalSyntheticLambda132(StarGiftSheet starGiftSheet, Browser.Progress progress, AlertDialog alertDialog, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, CharSequence charSequence) {
        this.f$0 = starGiftSheet;
        this.f$2 = progress;
        this.f$1 = alertDialog;
        this.f$3 = tL_starGiftUnique;
        this.f$4 = j;
        this.f$6 = charSequence;
    }
}
