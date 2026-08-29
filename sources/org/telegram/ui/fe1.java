package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class fe1 implements Utilities.Callback {
    public final int f38134a = 1;
    public final int f38135b;
    public final long f38136c;
    public final Object d;
    public final Object f38137e;
    public final Object f38138f;
    public final Object f38139g;

    public fe1(int i10, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref, org.telegram.ui.ActionBar.f3 f3Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f38135b = i10;
        this.d = connectedbotstarref;
        this.f38137e = f3Var;
        this.f38138f = context;
        this.f38136c = j10;
        this.f38139g = c6Var;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        SpannableStringBuilder replaceTags;
        int i11 = this.f38134a;
        Object obj2 = this.f38139g;
        Object obj3 = this.f38138f;
        Object obj4 = this.f38137e;
        Object obj5 = this.d;
        switch (i11) {
            case 0:
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = (TLRPC.TL_messages_invitedUsers) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2 = (TLRPC.TL_messages_invitedUsers) obj;
                ze1 ze1Var = ((ie1) obj5).f39228b;
                if (tL_messages_invitedUsers2 != null) {
                    tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
                }
                int i12 = iArr[0] + 1;
                iArr[0] = i12;
                if (i12 == this.f38135b) {
                    boolean isEmpty = tL_messages_invitedUsers.missing_invitees.isEmpty();
                    long j10 = this.f38136c;
                    if (isEmpty) {
                        org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(ze1Var);
                        TLRPC.Chat chat = ze1Var.getMessagesController().getChat(Long.valueOf(j10));
                        a02.getClass();
                        if (arrayList.size() == 0) {
                            replaceTags = null;
                        } else if (arrayList.size() == 1) {
                            if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToChannel", R.string.HasBeenAddedToChannel, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                            } else {
                                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("HasBeenAddedToGroup", R.string.HasBeenAddedToGroup, "**" + UserObject.getFirstName((TLRPC.User) arrayList.get(0)) + "**"));
                            }
                        } else if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedMembersToChannel", arrayList.size(), new Object[0]));
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("AddedSubscribersToChannel", arrayList.size(), new Object[0]));
                        }
                        a02.V(arrayList, replaceTags, null, null).j();
                        return;
                    }
                    TLRPC.Chat chat2 = ze1Var.getMessagesController().getChat(Long.valueOf(j10));
                    i10 = ((org.telegram.ui.ActionBar.o2) ze1Var).currentAccount;
                    org.telegram.ui.Components.c5.f(i10, chat2, tL_messages_invitedUsers);
                    return;
                }
                return;
            default:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj5;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj2;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj;
                int i13 = this.f38135b;
                long j11 = this.f38136c;
                if (connectedbotstarref2 == null) {
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(connectedbotstarref.bot_id));
                    if (user != null) {
                        MessagesController.getInstance(i13).loadFullUser(user, 0, true, new ph.s2(f3Var, context, i13, j11, c6Var, 1));
                        return;
                    }
                    return;
                }
                f3Var.dismiss();
                ph.d3.H0(context, i13, connectedbotstarref2, j11, c6Var);
                return;
        }
    }

    public fe1(ie1 ie1Var, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i10, ArrayList arrayList, long j10) {
        this.d = ie1Var;
        this.f38137e = tL_messages_invitedUsers;
        this.f38138f = iArr;
        this.f38135b = i10;
        this.f38139g = arrayList;
        this.f38136c = j10;
    }
}
