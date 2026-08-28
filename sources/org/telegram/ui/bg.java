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
public final class bg implements Utilities.Callback2 {
    public final int f36850a = 0;
    public final qn f36851b;
    public final org.telegram.ui.Cells.t1 f36852c;
    public final ve.d d;
    public final Serializable f36853e;
    public final Object f36854f;

    public bg(qn qnVar, ni niVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.f36851b = qnVar;
        this.d = niVar;
        this.f36852c = t1Var;
        this.f36853e = str;
        this.f36854f = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        long j10;
        Boolean bool;
        boolean z12;
        int i9;
        int i10;
        int i11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f36850a) {
            case 0:
                String str = (String) this.f36853e;
                CharacterStyle characterStyle = (CharacterStyle) this.f36854f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f22527id;
                    z10 = false;
                    z11 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z10 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f22380id;
                    z11 = false;
                } else {
                    z10 = false;
                    z11 = false;
                    j10 = 0;
                }
                qn qnVar = this.f36851b;
                org.telegram.ui.Cells.t1 t1Var2 = this.f36852c;
                org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(qnVar, t1Var2);
                org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(qnVar.getParentActivity(), qnVar.f41848aa);
                I.f34575p = new ke(ll0Var, 0);
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i12 != 0) {
                    if (z10) {
                        i10 = R.drawable.msg_channel;
                    } else {
                        i10 = R.drawable.msg_discussion;
                    }
                    if (z10) {
                        i11 = R.string.ViewChannel;
                    } else {
                        i11 = R.string.SendMessage;
                    }
                    bool = bool2;
                    z12 = false;
                    I.c(i10, LocaleController.getString(i11), new bg.e1(qnVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z12 = false;
                }
                boolean z13 = z10;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new qe(qnVar, ll0Var, str, 1), z12);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new le(qnVar, str, 11), z12);
                }
                I.k();
                if (i12 != 0) {
                    if (z11) {
                        i9 = R.string.ViewProfile;
                    } else if (z13) {
                        i9 = R.string.ViewChannelProfile;
                    } else {
                        i9 = R.string.ViewGroupProfile;
                    }
                    I.n(tLObject, LocaleController.getString(i9), new bg.e1(qnVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                ll0Var.e(I);
                ll0Var.f(t1Var2, characterStyle, null, false);
                qnVar.showDialog(ll0Var);
                return;
            default:
                oi oiVar = (oi) this.d;
                int[] iArr = (int[]) this.f36853e;
                MessageObject messageObject = (MessageObject) this.f36854f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                qn qnVar2 = this.f36851b;
                if (qnVar2.f42124wb == oiVar) {
                    iArr[0] = 0;
                    oiVar.c(false);
                    if (messages_messages != null) {
                        qnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        qnVar2.getMessagesController().putChats(messages_messages.chats, false);
                        int i13 = 0;
                        while (true) {
                            if (i13 < messages_messages.messages.size()) {
                                TLRPC.Message message2 = messages_messages.messages.get(i13);
                                if (message2 == null || (richMessage = message2.rich_message) == null) {
                                    i13++;
                                }
                            } else {
                                richMessage = null;
                            }
                        }
                        if (richMessage != null && (message = messageObject.messageOwner) != null) {
                            message.rich_message = richMessage;
                            messageObject.richLayout = null;
                            cn cnVar = qnVar2.f41989lc;
                            if (cnVar != null && (t1Var = this.f36852c) != null) {
                                cnVar.g(t1Var, true, false, true);
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

    public bg(qn qnVar, oi oiVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.f36851b = qnVar;
        this.d = oiVar;
        this.f36853e = iArr;
        this.f36852c = t1Var;
        this.f36854f = messageObject;
    }
}
