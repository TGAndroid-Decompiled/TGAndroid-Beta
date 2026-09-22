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
public final class kg implements Utilities.Callback2 {
    public final int f35196a = 1;
    public final zn f35197b;
    public final org.telegram.ui.Cells.u1 f35198c;
    public final nf.e d;
    public final Serializable e;
    public final Object f35199f;

    public kg(zn znVar, zi ziVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.f35197b = znVar;
        this.d = ziVar;
        this.f35198c = u1Var;
        this.e = str;
        this.f35199f = characterStyle;
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
        switch (this.f35196a) {
            case 0:
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f35199f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f18490id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f18343id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                zn znVar = this.f35197b;
                org.telegram.ui.Cells.u1 u1Var2 = this.f35198c;
                org.telegram.ui.Components.y70 I = org.telegram.ui.Components.y70.I(znVar, u1Var2);
                org.telegram.ui.Components.om0 om0Var = new org.telegram.ui.Components.om0(znVar.getParentActivity(), znVar.f40324ea);
                I.f30563p = new re(om0Var, 0);
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
                    I.c(i11, LocaleController.getString(i12), new le(znVar, j3, 3), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ye(znVar, om0Var, str, 2), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new te(znVar, str, 11), z12);
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
                    I.n(tLObject, LocaleController.getString(i10), new le(znVar, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                om0Var.e(I);
                om0Var.f(u1Var2, characterStyle, null, false);
                znVar.showDialog(om0Var);
                return;
            default:
                aj ajVar = (aj) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f35199f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                zn znVar2 = this.f35197b;
                if (znVar2.f40587zb == ajVar) {
                    iArr[0] = 0;
                    ajVar.c(false);
                    if (messages_messages != null) {
                        znVar2.getMessagesController().putUsers(messages_messages.users, false);
                        znVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            ln lnVar = znVar2.f40447oc;
                            if (lnVar != null && (u1Var = this.f35198c) != null) {
                                lnVar.l(u1Var, true, false, true);
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

    public kg(zn znVar, aj ajVar, int[] iArr, org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        this.f35197b = znVar;
        this.d = ajVar;
        this.e = iArr;
        this.f35198c = u1Var;
        this.f35199f = messageObject;
    }
}
