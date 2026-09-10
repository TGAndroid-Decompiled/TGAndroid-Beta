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
public final class ng implements Utilities.Callback2 {
    public final int f35265a = 0;
    public final eo f35266b;
    public final org.telegram.ui.Cells.t1 f35267c;
    public final nf.e d;
    public final Serializable e;
    public final Object f35268f;

    public ng(eo eoVar, bj bjVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.f35266b = eoVar;
        this.d = bjVar;
        this.f35267c = t1Var;
        this.e = str;
        this.f35268f = characterStyle;
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
        switch (this.f35265a) {
            case 0:
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f35268f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f17342id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f17195id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                eo eoVar = this.f35266b;
                org.telegram.ui.Cells.t1 t1Var2 = this.f35267c;
                org.telegram.ui.Components.w70 I = org.telegram.ui.Components.w70.I(eoVar, t1Var2);
                org.telegram.ui.Components.km0 km0Var = new org.telegram.ui.Components.km0(eoVar.getParentActivity(), eoVar.f32316ea);
                I.f28696p = new se(km0Var, 0);
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
                    I.c(i11, LocaleController.getString(i12), new me(eoVar, j3, 3), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new af(eoVar, km0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new ue(eoVar, str, 11), z12);
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
                    I.n(tLObject, LocaleController.getString(i10), new me(eoVar, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                km0Var.e(I);
                km0Var.f(t1Var2, characterStyle, null, false);
                eoVar.showDialog(km0Var);
                return;
            default:
                cj cjVar = (cj) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f35268f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                eo eoVar2 = this.f35266b;
                if (eoVar2.Ab == cjVar) {
                    iArr[0] = 0;
                    cjVar.c(false);
                    if (messages_messages != null) {
                        eoVar2.getMessagesController().putUsers(messages_messages.users, false);
                        eoVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            pn pnVar = eoVar2.f32450pc;
                            if (pnVar != null && (t1Var = this.f35267c) != null) {
                                pnVar.k(t1Var, true, false, true);
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

    public ng(eo eoVar, cj cjVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.f35266b = eoVar;
        this.d = cjVar;
        this.e = iArr;
        this.f35267c = t1Var;
        this.f35268f = messageObject;
    }
}
