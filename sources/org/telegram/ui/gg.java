package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;

public final class gg implements RequestDelegate {

    public final int f38407a;

    public final Object f38408b;

    public final Object f38409c;

    public gg(int i10, Object obj, Object obj2) {
        this.f38407a = i10;
        this.f38408b = obj;
        this.f38409c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f38407a) {
            case 0:
                AndroidUtilities.runOnUIThread(new u1((rn) this.f38408b, tLObject, (TLRPC.User) this.f38409c, 20));
                break;
            case 1:
                rn rnVar = (rn) this.f38408b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.f38409c;
                if (tL_error == null) {
                    rnVar.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new rd(10, rnVar, tL_messages_sendScheduledMessages));
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new rd(11, rnVar, tL_error));
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new yf((rn) this.f38408b, tLObject, tL_error, (MessagesStorage) this.f38409c, 4));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new u1((tl) this.f38408b, tLObject, (MessageObject) this.f38409c, 23));
                break;
            case 4:
                jo joVar = (jo) this.f38408b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.f38409c;
                TLRPC.UserFull userFull = joVar.A0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    joVar.getMessagesStorage().updateUserInfo(joVar.A0, false);
                }
                AndroidUtilities.runOnUIThread(new co(joVar, 2));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new rd(23, (jp) this.f38408b, (org.telegram.ui.ActionBar.b2[]) this.f38409c));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new yf((dq) this.f38408b, tL_error, tLObject, (TwoStepVerificationActivity) this.f38409c, 7));
                break;
            case 7:
                org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) this.f38408b;
                NotificationCenter.getInstance(g5Var.f28534e).doOnIdle(new org.telegram.ui.Components.f5(g5Var, (ArrayList) this.f38409c, tLObject, 0));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((org.telegram.ui.Components.b8) this.f38408b, (org.telegram.ui.ActionBar.b2) this.f38409c, tLObject, 6));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new yq(14, (org.telegram.ui.Components.gi) this.f38408b, (org.telegram.ui.Components.zh) this.f38409c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new yq(15, (org.telegram.ui.Components.gi) this.f38408b, (TLRPC.TL_attachMenuBot) this.f38409c));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((org.telegram.ui.Components.yo) this.f38408b, tLObject, (org.telegram.ui.ActionBar.f6) this.f38409c, 12));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.xq(16, (org.telegram.ui.Components.q00) this.f38408b, (Pair) this.f38409c));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.q00) this.f38408b, tL_error, tLObject, (Utilities.Callback) this.f38409c, 17));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.g30) this.f38408b, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f38409c, 19));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.i80) this.f38408b, (TLRPC.TL_chatInviteExported) this.f38409c, tL_error, tLObject, 21));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.i3((org.telegram.ui.Components.cg0) this.f38408b, (org.telegram.ui.Components.bg0) this.f38409c, tLObject, 25));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.lg0((org.telegram.ui.Components.sp0) this.f38408b, tLObject, (Context) this.f38409c, 11));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.ex0) this.f38408b, tL_error, tLObject, (MediaDataController) this.f38409c, 27));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new yf((pr0) this.f38408b, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) this.f38409c, 28));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new yf((org.telegram.ui.Components.oz0) this.f38408b, (org.telegram.ui.ActionBar.b2) this.f38409c, tLObject, tL_error, 29));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((org.telegram.ui.Components.b31) this.f38408b, tL_error, tLObject, (TLRPC.TL_textWithEntities) this.f38409c, 1));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new lq((sy) this.f38408b, tLObject, (MessageObject) this.f38409c, 4));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(19, (mz) this.f38408b, (org.telegram.ui.ActionBar.b2) this.f38409c));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(23, (q00) this.f38408b, (org.telegram.ui.ActionBar.b2) this.f38409c));
                break;
            case 25:
                AndroidUtilities.runOnUIThread(new lq((j00) this.f38408b, tL_error, (i00) this.f38409c, 8));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.r61(25, (FiltersSetupActivity) this.f38408b, (TLRPC.TL_messages_toggleDialogFilterTags) this.f38409c));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l11((z40) this.f38408b, tL_error, tLObject, (String) this.f38409c, 5));
                break;
            case 28:
                y60 y60Var = (y60) this.f38408b;
                if (Objects.equals(y60Var.f44713a.f45057e, (String) this.f38409c)) {
                    AndroidUtilities.runOnUIThread(new a30(3, y60Var, tLObject));
                    break;
                }
                break;
            default:
                l70 l70Var = (l70) this.f38408b;
                String str = (String) this.f38409c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new lq(l70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                        }
                        break;
                    }
                }
                break;
        }
    }
}
