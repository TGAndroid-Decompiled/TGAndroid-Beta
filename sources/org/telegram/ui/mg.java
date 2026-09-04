package org.telegram.ui;

import android.text.style.CharacterStyle;
import java.io.Serializable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class mg implements Utilities.Callback2 {
    public final int f38699a = 1;
    public final co f38700b;
    public final org.telegram.ui.Cells.t1 f38701c;
    public final of.e d;
    public final Serializable f38702e;
    public final Object f38703f;

    public mg(co coVar, zi ziVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.f38700b = coVar;
        this.d = ziVar;
        this.f38701c = t1Var;
        this.f38702e = str;
        this.f38703f = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j3;
        Boolean bool;
        boolean z12;
        int i10;
        int i11;
        int i12;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f38699a) {
            case 0:
                String str = (String) this.f38702e;
                CharacterStyle characterStyle = (CharacterStyle) this.f38703f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f20016id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f19869id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                co coVar = this.f38700b;
                org.telegram.ui.Cells.t1 t1Var2 = this.f38701c;
                org.telegram.ui.Components.n70 I = org.telegram.ui.Components.n70.I(coVar, t1Var2);
                org.telegram.ui.Components.am0 am0Var = new org.telegram.ui.Components.am0(coVar.getParentActivity(), coVar.f35247ea);
                I.f28655p = new qe(am0Var, 0);
                int i13 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i13 != 0) {
                    if (z10) {
                        i11 = R.drawable.msg_channel;
                    } else {
                        i11 = R.drawable.msg_discussion;
                    }
                    if (z10) {
                        i12 = R.string.ViewChannel;
                    } else {
                        i12 = R.string.SendMessage;
                    }
                    bool = bool2;
                    z12 = false;
                    I.c(i11, LocaleController.getString(i12), new le(coVar, j3, 3), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ye(coVar, am0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new se(coVar, str, 11), z12);
                }
                I.k();
                if (i13 != 0) {
                    if (z11) {
                        i10 = R.string.ViewProfile;
                    } else if (z13) {
                        i10 = R.string.ViewChannelProfile;
                    } else {
                        i10 = R.string.ViewGroupProfile;
                    }
                    I.n(tLObject, LocaleController.getString(i10), new le(coVar, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                am0Var.e(I);
                am0Var.f(t1Var2, characterStyle, null, false);
                coVar.showDialog(am0Var);
                return;
            default:
                aj ajVar = (aj) this.d;
                int[] iArr = (int[]) this.f38702e;
                MessageObject messageObject = (MessageObject) this.f38703f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                co coVar2 = this.f38700b;
                if (coVar2.Ab == ajVar) {
                    iArr[0] = 0;
                    ajVar.c(false);
                    if (messages_messages != null) {
                        coVar2.getMessagesController().putUsers(messages_messages.users, false);
                        coVar2.getMessagesController().putChats(messages_messages.chats, false);
                        int i14 = 0;
                        while (true) {
                            if (i14 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i14);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i14++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            on onVar = coVar2.f35381pc;
                            if (onVar != null && (t1Var = this.f38701c) != null) {
                                onVar.k(t1Var, true, false, true);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public mg(co coVar, aj ajVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.f38700b = coVar;
        this.d = ajVar;
        this.f38702e = iArr;
        this.f38701c = t1Var;
        this.f38703f = messageObject;
    }
}
