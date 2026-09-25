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
public final class hg implements Utilities.Callback2 {
    public final int f34215a = 0;
    public final wn f34216b;
    public final org.telegram.ui.Cells.u1 f34217c;
    public final nf.e d;
    public final Serializable e;
    public final Object f34218f;

    public hg(wn wnVar, wi wiVar, org.telegram.ui.Cells.u1 u1Var, String str, CharacterStyle characterStyle) {
        this.f34216b = wnVar;
        this.d = wiVar;
        this.f34217c = u1Var;
        this.e = str;
        this.f34218f = characterStyle;
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
        switch (this.f34215a) {
            case 0:
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f34218f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j3 = ((TLRPC.User) tLObject).f18483id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j3 = -chat.f18336id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j3 = 0;
                }
                wn wnVar = this.f34216b;
                org.telegram.ui.Cells.u1 u1Var2 = this.f34217c;
                org.telegram.ui.Components.y70 I = org.telegram.ui.Components.y70.I(wnVar, u1Var2);
                org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(wnVar.getParentActivity(), wnVar.f39470ea);
                I.f30550p = new qe(mm0Var, 0);
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
                    I.c(i11, LocaleController.getString(i12), new ke(wnVar, j3, 3), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new xe(wnVar, mm0Var, str, 2), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new se(wnVar, str, 11), z12);
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
                    I.n(tLObject, LocaleController.getString(i10), new ke(wnVar, j3, 4));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                mm0Var.e(I);
                mm0Var.f(u1Var2, characterStyle, null, false);
                wnVar.showDialog(mm0Var);
                return;
            default:
                xi xiVar = (xi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f34218f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                wn wnVar2 = this.f34216b;
                if (wnVar2.f39732zb == xiVar) {
                    iArr[0] = 0;
                    xiVar.c(false);
                    if (messages_messages != null) {
                        wnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        wnVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            in inVar = wnVar2.f39592oc;
                            if (inVar != null && (u1Var = this.f34217c) != null) {
                                inVar.l(u1Var, true, false, true);
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

    public hg(wn wnVar, xi xiVar, int[] iArr, org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        this.f34216b = wnVar;
        this.d = xiVar;
        this.e = iArr;
        this.f34217c = u1Var;
        this.f34218f = messageObject;
    }
}
