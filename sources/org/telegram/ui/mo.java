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
public final class mo implements RequestDelegate {
    public final int f35364a;
    public final Object f35365b;
    public final Object f35366c;

    public mo(int i10, Object obj, Object obj2) {
        this.f35364a = i10;
        this.f35365b = obj;
        this.f35366c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35364a;
        Object obj = this.f35366c;
        Object obj2 = this.f35365b;
        switch (i10) {
            case 0:
                so soVar = (so) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = soVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    soVar.getMessagesStorage().updateUserInfo(soVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new ko(soVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new rh(11, (sp) obj2, (org.telegram.ui.ActionBar.b2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((lq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 12));
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.j8) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, 7));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ph(2, (org.telegram.ui.Components.wi) obj2, (org.telegram.ui.Components.pi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ph(3, (org.telegram.ui.Components.wi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.lp) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 13));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oy(4, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((org.telegram.ui.Components.d10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 22));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((Object) ((org.telegram.ui.Components.s30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 24));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5((org.telegram.ui.Components.w80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.Components.qg0) obj2, (org.telegram.ui.Components.pg0) obj, tLObject, 26));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.oy((org.telegram.ui.Components.hq0) obj2, tLObject, (Context) obj));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.ux0) obj2, tL_error, tLObject, (MediaDataController) obj, 2));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((ks0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 3));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.e01) obj2, (org.telegram.ui.ActionBar.b2) obj, tLObject, tL_error, 4));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.Components.u31) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 6));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new tq((dz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new hw(7, (xz) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new hw(11, (c10) obj2, (org.telegram.ui.ActionBar.b2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new tq((v00) obj2, tL_error, (u00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new hw(13, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((m50) obj2, tL_error, tLObject, (String) obj, 10));
                return;
            case 24:
                m70 m70Var = (m70) obj2;
                if (Objects.equals(m70Var.f35166a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new hw(21, m70Var, tLObject));
                    return;
                }
                return;
            case 25:
                a80 a80Var = (a80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new tq(a80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new tq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jn0((org.telegram.ui.ActionBar.b2) obj2, tLObject, (h) obj, tL_error, 14));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new tq((ac0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tq((xb0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
