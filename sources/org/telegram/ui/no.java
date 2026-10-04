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
public final class no implements RequestDelegate {
    public final int f39019a;
    public final Object f39020b;
    public final Object f39021c;

    public no(int i10, Object obj, Object obj2) {
        this.f39019a = i10;
        this.f39020b = obj;
        this.f39021c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f39019a;
        Object obj = this.f39021c;
        Object obj2 = this.f39020b;
        switch (i10) {
            case 0:
                to toVar = (to) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = toVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    toVar.getMessagesStorage().updateUserInfo(toVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new lo(toVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new oh(15, (tp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((mq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.f28531e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.j8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, 10));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.be(6, (org.telegram.ui.Components.xi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.be(7, (org.telegram.ui.Components.xi) obj2, (org.telegram.ui.Components.qi) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.np) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 16));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yw(8, (org.telegram.ui.Components.f10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((org.telegram.ui.Components.f10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((org.telegram.ui.Components.v30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.j90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.ch0) obj2, (org.telegram.ui.Components.bh0) obj, tLObject, 29));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.uo0((org.telegram.ui.Components.zq0) obj2, tLObject, (Context) obj, 3));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.Components.qy0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((ms0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.Components.d11) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.Components.t41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new uq((gz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new cu(10, (a00) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new cu(14, (f10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new uq((y00) obj2, tL_error, (x00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new cu(16, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((p50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                o70 o70Var = (o70) obj2;
                if (Objects.equals(o70Var.f39116a.f39359e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new cu(24, o70Var, tLObject));
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
                            AndroidUtilities.runOnUIThread(new uq(c80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new uq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.h6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bo0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new uq((dc0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new uq((ac0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
