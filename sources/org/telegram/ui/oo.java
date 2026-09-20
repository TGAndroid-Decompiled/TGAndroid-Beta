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
    public final int f36345a;
    public final Object f36346b;
    public final Object f36347c;

    public oo(int i10, Object obj, Object obj2) {
        this.f36345a = i10;
        this.f36346b = obj;
        this.f36347c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36345a;
        Object obj = this.f36347c;
        Object obj2 = this.f36346b;
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
                AndroidUtilities.runOnUIThread(new gh(17, (up) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((nq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) obj2;
                NotificationCenter.getInstance(l5Var.e).doOnIdle(new org.telegram.ui.Components.k5(l5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.i8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, 10));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tc(8, (org.telegram.ui.Components.vi) obj2, (org.telegram.ui.Components.oi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tc(9, (org.telegram.ui.Components.vi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 16));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bv(10, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.Components.c10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((Object) ((org.telegram.ui.Components.r30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.Components.d90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.zg0) obj2, (org.telegram.ui.Components.yg0) obj, tLObject, 29));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wn0((org.telegram.ui.Components.uq0) obj2, tLObject, (Context) obj, 5));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.gy0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((rs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.t01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.j41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new vq((gz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new yt(13, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new yt(17, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new vq((y00) obj2, tL_error, (x00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new yt(19, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                p70 p70Var = (p70) obj2;
                if (Objects.equals(p70Var.f36484a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new yt(27, p70Var, tLObject));
                    return;
                }
                return;
            case 25:
                d80 d80Var = (d80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new vq(d80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new vq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new vq((hc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new vq((ec0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
