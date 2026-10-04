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
public final class lg implements Utilities.Callback2 {
    public final int f38264a = 0;
    public final yn f38265b;
    public final org.telegram.ui.Cells.u1 f38266c;
    public final nf.e d;
    public final Serializable f38267e;
    public final Object f38268f;

    public lg(yn ynVar, xi xiVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.f38265b = ynVar;
        this.d = xiVar;
        this.f38266c = u1Var;
        this.f38267e = str;
        this.f38268f = characterStyle;
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
        org.telegram.ui.Cells.u1 u1Var;
        switch (this.f38264a) {
            case 0:
                String str = (String) this.f38267e;
                CharacterStyle characterStyle = (CharacterStyle) this.f38268f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f20189id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f20042id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                yn ynVar = this.f38265b;
                org.telegram.ui.Cells.u1 u1Var2 = this.f38266c;
                org.telegram.ui.Components.b80 I = org.telegram.ui.Components.b80.I(ynVar, u1Var2);
                org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(ynVar.getParentActivity(), ynVar.f43307ca);
                I.f24844p = new se(sm0Var, 0);
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
                    I.c(i11, LocaleController.getString(i12), new gg(ynVar, j3, 2), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new af(ynVar, sm0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new ue(ynVar, str, 11), z12);
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
                    I.n(tLObject, LocaleController.getString(i10), new gg(ynVar, j3, 3));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                sm0Var.e(I);
                sm0Var.f(u1Var2, characterStyle, null, false);
                ynVar.showDialog(sm0Var);
                return;
            default:
                yi yiVar = (yi) this.d;
                int[] iArr = (int[]) this.f38267e;
                MessageObject messageObject = (MessageObject) this.f38268f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                yn ynVar2 = this.f38265b;
                if (ynVar2.f43570xb == yiVar) {
                    iArr[0] = 0;
                    yiVar.c(false);
                    if (messages_messages != null) {
                        ynVar2.getMessagesController().putUsers(messages_messages.users, false);
                        ynVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            kn knVar = ynVar2.f43431mc;
                            if (knVar != null && (u1Var = this.f38266c) != null) {
                                knVar.i(u1Var, true, false, true);
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

    public lg(yn ynVar, yi yiVar, int[] iArr, org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        this.f38265b = ynVar;
        this.d = yiVar;
        this.f38267e = iArr;
        this.f38266c = u1Var;
        this.f38268f = messageObject;
    }
}
