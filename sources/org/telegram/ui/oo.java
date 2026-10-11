package org.telegram.ui;

import android.content.Context;
import android.util.Pair;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_bots;
public final class oo implements RequestDelegate {
    public final int f40587a;
    public final Object f40588b;
    public final Object f40589c;

    public oo(int i10, Object obj, Object obj2) {
        this.f40587a = i10;
        this.f40588b = obj;
        this.f40589c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40587a;
        Object obj = this.f40589c;
        Object obj2 = this.f40588b;
        switch (i10) {
            case 0:
                uo uoVar = (uo) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = uoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    uoVar.getMessagesStorage().updateUserInfo(uoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new mo(uoVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ug(18, (up) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((nq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) obj2;
                NotificationCenter.getInstance(o5Var.f29257e).doOnIdle(new org.telegram.ui.Components.n5(o5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.l8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 12));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wc(10, (org.telegram.ui.Components.yi) obj2, (org.telegram.ui.Components.ri) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wc(11, (org.telegram.ui.Components.yi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.Components.aq) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bs(15, (org.telegram.ui.Components.t10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.Components.t10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((Object) ((org.telegram.ui.Components.j40) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.y90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cf0((org.telegram.ui.Components.uh0) obj2, (org.telegram.ui.Components.th0) obj, tLObject, 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fi0((org.telegram.ui.Components.or0) obj2, tLObject, (Context) obj, 10));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0((org.telegram.ui.Components.zy0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0((qs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0((org.telegram.ui.Components.m11) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0((org.telegram.ui.Components.d51) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new vq((ez) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(17, (zz) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(21, (e10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new vq((x00) obj2, tL_error, (w00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.voip.i(23, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0((n50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                o70 o70Var = (o70) obj2;
                if (Objects.equals(o70Var.f40435a.f40775e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new n70(1, o70Var, tLObject));
                    return;
                }
                return;
            case 25:
                c80 c80Var = (c80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new vq(c80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new vq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qo0((org.telegram.ui.ActionBar.a2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new vq((dc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vq((ac0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
