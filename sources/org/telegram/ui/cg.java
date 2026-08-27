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

public final class cg implements Utilities.Callback2 {

    public final int f37081a = 0;

    public final rn f37082b;

    public final org.telegram.ui.Cells.s1 f37083c;
    public final we.d d;

    public final Serializable f37084e;

    public final Object f37085f;

    public cg(rn rnVar, pi piVar, org.telegram.ui.Cells.s1 s1Var, String str, CharacterStyle characterStyle) {
        this.f37082b = rnVar;
        this.d = piVar;
        this.f37083c = s1Var;
        this.f37084e = str;
        this.f37085f = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean zIsChannelAndNotMegaGroup;
        boolean z10;
        long j10;
        boolean z11;
        int i10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f37081a) {
            case 0:
                String str = (String) this.f37084e;
                CharacterStyle characterStyle = (CharacterStyle) this.f37085f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22527id;
                    zIsChannelAndNotMegaGroup = false;
                    z10 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    long j11 = -chat.f22380id;
                    zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = j11;
                    z10 = false;
                } else {
                    zIsChannelAndNotMegaGroup = false;
                    z10 = false;
                    j10 = 0;
                }
                rn rnVar = this.f37082b;
                org.telegram.ui.Cells.s1 s1Var2 = this.f37083c;
                org.telegram.ui.Components.b70 b70VarI = org.telegram.ui.Components.b70.I(rnVar, s1Var2);
                org.telegram.ui.Components.ol0 ol0Var = new org.telegram.ui.Components.ol0(rnVar.getParentActivity(), rnVar.f41983aa);
                b70VarI.f26987p = new ke(ol0Var, 0);
                if (j10 != 0) {
                    z11 = false;
                    b70VarI.c(zIsChannelAndNotMegaGroup ? R.drawable.msg_channel : R.drawable.msg_discussion, LocaleController.getString(zIsChannelAndNotMegaGroup ? R.string.ViewChannel : R.string.SendMessage), new cg.a1(rnVar, j10, 5), false);
                } else {
                    z11 = false;
                }
                boolean z12 = zIsChannelAndNotMegaGroup;
                b70VarI.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new qe(rnVar, ol0Var, str, 1), z11);
                if (bool.booleanValue()) {
                    b70VarI.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new le(rnVar, str, 11), z11);
                }
                b70VarI.k();
                if (j10 != 0) {
                    if (z10) {
                        i10 = R.string.ViewProfile;
                    } else {
                        i10 = z12 ? R.string.ViewChannelProfile : R.string.ViewGroupProfile;
                    }
                    b70VarI.n(tLObject, LocaleController.getString(i10), new cg.a1(rnVar, j10, 6));
                } else {
                    b70VarI.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                ol0Var.e(b70VarI);
                ol0Var.f(s1Var2, characterStyle, null, false);
                rnVar.showDialog(ol0Var);
                break;
            default:
                qi qiVar = (qi) this.d;
                int[] iArr = (int[]) this.f37084e;
                MessageObject messageObject = (MessageObject) this.f37085f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                rn rnVar2 = this.f37082b;
                if (rnVar2.wb == qiVar) {
                    iArr[0] = 0;
                    qiVar.c(false);
                    if (messages_messages != null) {
                        rnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        rnVar2.getMessagesController().putChats(messages_messages.chats, false);
                        int i11 = 0;
                        while (true) {
                            if (i11 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i11);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i11++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            dn dnVar = rnVar2.f42125lc;
                            if (dnVar != null && (s1Var = this.f37083c) != null) {
                                dnVar.i(s1Var, true, false, true);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }

    public cg(rn rnVar, qi qiVar, int[] iArr, org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        this.f37082b = rnVar;
        this.d = qiVar;
        this.f37084e = iArr;
        this.f37083c = s1Var;
        this.f37085f = messageObject;
    }
}
