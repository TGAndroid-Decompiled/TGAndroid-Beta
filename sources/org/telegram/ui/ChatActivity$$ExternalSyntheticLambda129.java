package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Cells.ChatMessageCell;

public final class ChatActivity$$ExternalSyntheticLambda129 implements Utilities.Callback {
    public final int $r8$classId;
    public final BaseFragment f$0;
    public final Object f$1;
    public final Serializable f$2;
    public final Object f$3;
    public final Object f$4;

    public ChatActivity$$ExternalSyntheticLambda129(BaseFragment baseFragment, Object obj, Serializable serializable, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = baseFragment;
        this.f$1 = obj;
        this.f$2 = serializable;
        this.f$3 = obj2;
        this.f$4 = obj3;
    }

    @Override
    public final void run(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                String str = (String) this.f$2;
                TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) this.f$3;
                chatActivity.lambda$didPressPhoneNumber$455((ChatMessageCell) this.f$1, str, tL_contact, (CharacterStyle) this.f$4, (TLRPC.User) obj);
                break;
            case 1:
                ((ChannelAdminLogActivity) this.f$0).lambda$createMenu$16((ArrayList) this.f$1, (ArrayList) this.f$2, (ArrayList) this.f$3, (ChannelAdminLogActivity$$ExternalSyntheticLambda9) this.f$4, (TLRPC.ChannelParticipant) obj);
                break;
            case 2:
                ChatActivity chatActivity2 = (ChatActivity) this.f$0;
                String str2 = (String) this.f$2;
                Object obj2 = this.f$3;
                chatActivity2.lambda$createView$37((TLRPC.TL_document) this.f$1, str2, obj2, (MessageObject.SendAnimationData) this.f$4, (Long) obj);
                break;
            default:
                DialogsActivity dialogsActivity = (DialogsActivity) this.f$0;
                Long l = (Long) this.f$2;
                ChannelCreateActivity channelCreateActivity = (ChannelCreateActivity) this.f$3;
                dialogsActivity.lambda$createGroupForThis$74((AlertDialog) this.f$1, l, channelCreateActivity, (BaseFragment) this.f$4, (Runnable) obj);
                break;
        }
    }
}
