package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatActivityEnterView;

public final class ChatUsersActivity$$ExternalSyntheticLambda26 implements AlertDialog.OnButtonClickListener, AlertsCreator.ScheduleDatePickerDelegate {
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final Object f$4;
    public final String f$5;
    public final boolean f$6;

    public ChatUsersActivity$$ExternalSyntheticLambda26(ChatUsersActivity chatUsersActivity, TLRPC.User user, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z) {
        this.f$0 = chatUsersActivity;
        this.f$1 = user;
        this.f$2 = tLObject;
        this.f$3 = tL_chatAdminRights;
        this.f$4 = tL_chatBannedRights;
        this.f$5 = str;
        this.f$6 = z;
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        ((ChatActivityEnterView.AnonymousClass79) this.f$0).onGifSelected((View) this.f$1, this.f$2, this.f$5, this.f$3, (MediaController.PhotoEntry) this.f$4, z, this.f$6, i, i2);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ChatUsersActivity chatUsersActivity = (ChatUsersActivity) this.f$0;
        chatUsersActivity.getClass();
        chatUsersActivity.openRightsEdit(((TLRPC.User) this.f$1).id, (TLObject) this.f$2, (TLRPC.TL_chatAdminRights) this.f$3, (TLRPC.TL_chatBannedRights) this.f$4, this.f$5, this.f$6, chatUsersActivity.selectType == 1 ? 0 : 1, false);
    }

    public ChatUsersActivity$$ExternalSyntheticLambda26(ChatActivityEnterView.AnonymousClass79 anonymousClass79, View view, Object obj, String str, Object obj2, MediaController.PhotoEntry photoEntry, boolean z) {
        this.f$0 = anonymousClass79;
        this.f$1 = view;
        this.f$2 = obj;
        this.f$5 = str;
        this.f$3 = obj2;
        this.f$4 = photoEntry;
        this.f$6 = z;
    }
}
