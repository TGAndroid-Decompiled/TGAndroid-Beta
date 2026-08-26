package org.telegram.ui.Stars;

import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.TopicsTabsView;

public final class StarGiftSheet$$ExternalSyntheticLambda157 implements MessagesController.IsInChatCheckedCallback, AlertDialog.OnButtonClickListener {
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final TLObject f$3;
    public final long f$4;
    public final Object f$5;

    public StarGiftSheet$$ExternalSyntheticLambda157(TopicsTabsView topicsTabsView, ActionBarMenuSubItem actionBarMenuSubItem, ItemOptions itemOptions, long j, TLRPC.User user, TLRPC.Chat chat) {
        this.f$0 = topicsTabsView;
        this.f$1 = actionBarMenuSubItem;
        this.f$2 = itemOptions;
        this.f$4 = j;
        this.f$3 = user;
        this.f$5 = chat;
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        ((StarGiftSheet) this.f$0).lambda$showDeleteDescriptionAlert$70((TL_stars.TL_starGiftUnique) this.f$1, (TLRPC.PaymentForm) this.f$2, (TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails) this.f$3, this.f$4, (CharSequence) this.f$5, alertDialog);
    }

    @Override
    public void run(boolean z, TLRPC.TL_chatAdminRights tL_chatAdminRights, String str) {
        ((TopicsTabsView) this.f$0).lambda$onTabLongClick$10((ActionBarMenuSubItem) this.f$1, (ItemOptions) this.f$2, this.f$4, (TLRPC.User) this.f$3, (TLRPC.Chat) this.f$5, z, tL_chatAdminRights, str);
    }

    public StarGiftSheet$$ExternalSyntheticLambda157(StarGiftSheet starGiftSheet, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j, CharSequence charSequence) {
        this.f$0 = starGiftSheet;
        this.f$1 = tL_starGiftUnique;
        this.f$2 = paymentForm;
        this.f$3 = tL_inputInvoiceStarGiftDropOriginalDetails;
        this.f$4 = j;
        this.f$5 = charSequence;
    }
}
