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
    public final int f34665a = 0;
    public final zn f34666b;
    public final org.telegram.ui.Cells.s1 f34667c;
    public final ze.c d;
    public final Serializable e;
    public final Object f34668f;

    public hg(zn znVar, xi xiVar, org.telegram.ui.Cells.s1 s1Var, String str, CharacterStyle characterStyle) {
        this.f34666b = znVar;
        this.d = xiVar;
        this.f34667c = s1Var;
        this.e = str;
        this.f34668f = characterStyle;
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
        org.telegram.ui.Cells.s1 s1Var;
        switch (this.f34665a) {
            case 0:
                String str = (String) this.e;
                CharacterStyle characterStyle = (CharacterStyle) this.f34668f;
                TLObject tLObject = (TLObject) obj;
                Boolean bool2 = (Boolean) obj2;
                this.d.b();
                if (tLObject instanceof TLRPC.User) {
                    j10 = ((TLRPC.User) tLObject).f19306id;
                    z4 = false;
                    z10 = true;
                } else if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    z4 = ChatObject.isChannelAndNotMegaGroup(chat);
                    j10 = -chat.f19159id;
                    z10 = false;
                } else {
                    z4 = false;
                    z10 = false;
                    j10 = 0;
                }
                zn znVar = this.f34666b;
                org.telegram.ui.Cells.s1 s1Var2 = this.f34667c;
                org.telegram.ui.Components.p70 I = org.telegram.ui.Components.p70.I(znVar, s1Var2);
                org.telegram.ui.Components.hm0 hm0Var = new org.telegram.ui.Components.hm0(znVar.getParentActivity(), znVar.f40534ba);
                I.f27772p = new re(hm0Var, 0);
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
                    I.c(i11, LocaleController.getString(i12), new gg.y0(znVar, j10, 5), false);
                } else {
                    bool = bool2;
                    z11 = false;
                }
                boolean z12 = z4;
                I.c(R.drawable.msg_copy, LocaleController.getString(R.string.ProfileCopyUsername), new xe(znVar, hm0Var, str, 1), z11);
                if (bool.booleanValue()) {
                    I.c(R.drawable.outline_gram_24, LocaleController.getString(R.string.BuyUsernameOnFragment), new se(znVar, str, 11), z11);
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
                    I.n(tLObject, LocaleController.getString(i10), new gg.y0(znVar, j10, 6));
                } else {
                    I.p(13, AndroidUtilities.dp(200.0f), LocaleController.getString(R.string.NoUsernameFound2));
                }
                hm0Var.e(I);
                hm0Var.f(s1Var2, characterStyle, null, false);
                znVar.showDialog(hm0Var);
                return;
            default:
                yi yiVar = (yi) this.d;
                int[] iArr = (int[]) this.e;
                MessageObject messageObject = (MessageObject) this.f34668f;
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                zn znVar2 = this.f34666b;
                if (znVar2.f40811xb == yiVar) {
                    iArr[0] = 0;
                    yiVar.c(false);
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
                            ln lnVar = znVar2.f40672mc;
                            if (lnVar != null && (s1Var = this.f34667c) != null) {
                                lnVar.k(s1Var, true, false, true);
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

    public hg(zn znVar, yi yiVar, int[] iArr, org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        this.f34666b = znVar;
        this.d = yiVar;
        this.e = iArr;
        this.f34667c = s1Var;
        this.f34668f = messageObject;
    }
}
