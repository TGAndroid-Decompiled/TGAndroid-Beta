package org.telegram.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Business.QuickRepliesActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;

public final class LaunchActivity$$ExternalSyntheticLambda58 implements AlertDialog.OnButtonClickListener, DialogsActivity.DialogsActivityDelegate {
    public final KeyEvent.Callback f$0;
    public final int f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final Object f$5;

    public LaunchActivity$$ExternalSyntheticLambda58(QuickRepliesActivity.AnonymousClass3 anonymousClass3, GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23, int i, QuickRepliesController.QuickReply quickReply, TextView textView, Utilities.Callback callback) {
        this.f$0 = anonymousClass3;
        this.f$2 = giftSheet$$ExternalSyntheticLambda23;
        this.f$1 = i;
        this.f$3 = quickReply;
        this.f$4 = textView;
        this.f$5 = callback;
    }

    @Override
    public boolean canSelectStories() {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
    }

    @Override
    public boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        DialogsActivity dialogsActivity2 = (DialogsActivity) this.f$5;
        return ((LaunchActivity) this.f$0).lambda$runLinkRequest$77(this.f$1, (TLRPC.User) this.f$2, (String) this.f$3, (String) this.f$4, dialogsActivity2, dialogsActivity, arrayList, charSequence, z, z2, i, i2, topicsFragment);
    }

    @Override
    public boolean didSelectStories(DialogsActivity dialogsActivity) {
        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        QuickRepliesActivity.AnonymousClass3 anonymousClass3 = (QuickRepliesActivity.AnonymousClass3) this.f$0;
        String string = anonymousClass3.getText().toString();
        int length = string.length();
        GiftSheet$$ExternalSyntheticLambda23 giftSheet$$ExternalSyntheticLambda23 = (GiftSheet$$ExternalSyntheticLambda23) this.f$2;
        if (length <= 0 || string.length() > 32) {
            AndroidUtilities.shakeView(anonymousClass3);
            giftSheet$$ExternalSyntheticLambda23.run(Boolean.FALSE);
            return;
        }
        QuickRepliesController quickRepliesController = QuickRepliesController.getInstance(this.f$1);
        QuickRepliesController.QuickReply quickReply = (QuickRepliesController.QuickReply) this.f$3;
        int i2 = quickReply == null ? -1 : quickReply.id;
        QuickRepliesController.QuickReply quickReplyFindReply = quickRepliesController.findReply(string);
        if (quickReplyFindReply == null || quickReplyFindReply.id == i2) {
            ((Utilities.Callback) this.f$5).run(string);
            alertDialog.dismiss();
        } else {
            AndroidUtilities.shakeView(anonymousClass3);
            ((TextView) this.f$4).setText(LocaleController.getString(R.string.BusinessRepliesNameBusy));
            giftSheet$$ExternalSyntheticLambda23.run(Boolean.TRUE);
        }
    }

    public LaunchActivity$$ExternalSyntheticLambda58(LaunchActivity launchActivity, int i, TLRPC.User user, String str, String str2, DialogsActivity dialogsActivity) {
        this.f$0 = launchActivity;
        this.f$1 = i;
        this.f$2 = user;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$5 = dialogsActivity;
    }
}
