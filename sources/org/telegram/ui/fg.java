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
public final class fg implements Utilities.Callback2 {
    public final int f36873a = 0;
    public final xn f36874b;
    public final org.telegram.ui.Cells.t1 f36875c;
    public final af.f d;
    public final Serializable f36876e;
    public final Object f36877f;

    public fg(xn xnVar, vi viVar, org.telegram.ui.Cells.t1 t1Var, String str, CharacterStyle characterStyle) {
        this.f36874b = xnVar;
        this.d = viVar;
        this.f36875c = t1Var;
        this.f36876e = str;
        this.f36877f = characterStyle;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z4;
        boolean z10;
        long j10;
        Boolean bool;
        boolean z11;
        int i10;
        int i11;
        int i12;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        org.telegram.ui.Cells.t1 t1Var;
        switch (this.f36873a) {
            case 0:
                String str = (String) this.f36876e;
                CharacterStyle characterStyle = (CharacterStyle) this.f36877f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f20990id;
                    z4 = false;
                    z10 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z4 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f20843id;
                    z10 = false;
                } else {
                    z4 = false;
                    z10 = false;
                    j10 = 0;
                }
                xn xnVar = this.f36874b;
                org.telegram.ui.Cells.t1 t1Var2 = this.f36875c;
                org.telegram.ui.Components.q70 I = org.telegram.ui.Components.q70.I(xnVar, t1Var2);
                org.telegram.ui.Components.jm0 jm0Var = new org.telegram.ui.Components.jm0(xnVar.getParentActivity(), xnVar.f43136ba);
                I.f30324p = new pe(jm0Var, 0);
                int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i13 != 0) {
                    if (z4) {
                        i11 = R.drawable.msg_channel;
                    } else {
                        i11 = R.drawable.msg_discussion;
                    }
                    if (z4) {
                        i12 = R.string.ViewChannel;
                    } else {
                        i12 = R.string.SendMessage;
                    }
                    bool = bool2;
                    z11 = false;
                    I.c(i11, LocaleController.getString(i12), new hg.y0(xnVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z11 = false;
                }
                boolean z12 = z4;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new ve(xnVar, jm0Var, str, 1), z11);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new qe(xnVar, str, 11), z11);
                }
                I.k();
                if (i13 != 0) {
                    if (z10) {
                        i10 = R.string.ViewProfile;
                    } else if (z12) {
                        i10 = R.string.ViewChannelProfile;
                    } else {
                        i10 = R.string.ViewGroupProfile;
                    }
                    I.n(tLObject, LocaleController.getString(i10), new hg.y0(xnVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                jm0Var.e(I);
                jm0Var.f(t1Var2, characterStyle, null, false);
                xnVar.showDialog(jm0Var);
                return;
            default:
                wi wiVar = (wi) this.d;
                int[] iArr = (int[]) this.f36876e;
                MessageObject messageObject = (MessageObject) this.f36877f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                xn xnVar2 = this.f36874b;
                if (xnVar2.f43414xb == wiVar) {
                    iArr[0] = 0;
                    wiVar.c(false);
                    if (messages_messages != null) {
                        xnVar2.getMessagesController().putUsers(messages_messages.users, false);
                        xnVar2.getMessagesController().putChats(messages_messages.chats, false);
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
                            jn jnVar = xnVar2.f43275mc;
                            if (jnVar != null && (t1Var = this.f36875c) != null) {
                                jnVar.k(t1Var, true, false, true);
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

    public fg(xn xnVar, wi wiVar, int[] iArr, org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        this.f36874b = xnVar;
        this.d = wiVar;
        this.f36876e = iArr;
        this.f36875c = t1Var;
        this.f36877f = messageObject;
    }
}
