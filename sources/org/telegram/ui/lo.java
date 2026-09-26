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
public final class lo implements RequestDelegate {
    public final int f35391a;
    public final Object f35392b;
    public final Object f35393c;

    public lo(int i10, Object obj, Object obj2) {
        this.f35391a = i10;
        this.f35392b = obj;
        this.f35393c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f35391a;
        Object obj = this.f35393c;
        Object obj2 = this.f35392b;
        switch (i10) {
            case 0:
                ro roVar = (ro) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = roVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    roVar.getMessagesStorage().updateUserInfo(roVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new jo(roVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fh(16, (rp) obj2, (org.telegram.ui.ActionBar.a2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((kq) obj2, tL_error, tLObject, (TwoStepVerificationActivity) obj, 13));
                return;
            case 3:
                org.telegram.ui.Components.m5 m5Var = (org.telegram.ui.Components.m5) obj2;
                NotificationCenter.getInstance(m5Var.e).doOnIdle(new org.telegram.ui.Components.l5(m5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.j8) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, 10));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(7, (org.telegram.ui.Components.wi) obj2, (org.telegram.ui.Components.pi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kd(8, (org.telegram.ui.Components.wi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.lp) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 16));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vw(9, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.d10) obj2, tL_error, tLObject, (Utilities.Callback) obj));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.s30) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 25));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.Components.g90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 27));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.Components.ah0) obj2, (org.telegram.ui.Components.zg0) obj, tLObject, 29));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.wn0((org.telegram.ui.Components.uq0) obj2, tLObject, (Context) obj, 4));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.fy0) obj2, tL_error, tLObject, (MediaDataController) obj, 3));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((js0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, 4));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.s01) obj2, (org.telegram.ui.ActionBar.a2) obj, tLObject, tL_error, 5));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.Components.i41) obj2, tL_error, tLObject, (TLRPC.TL_textWithEntities) obj, 7));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new sq((cz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new tt(12, (wz) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new tt(16, (b10) obj2, (org.telegram.ui.ActionBar.a2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new sq((u00) obj2, tL_error, (t00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new tt(18, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((k50) obj2, tL_error, tLObject, (String) obj, 11));
                return;
            case 24:
                k70 k70Var = (k70) obj2;
                if (Objects.equals(k70Var.f34959a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new tt(26, k70Var, tLObject));
                    return;
                }
                return;
            case 25:
                y70 y70Var = (y70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new sq(y70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new sq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.g6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.vn0((org.telegram.ui.ActionBar.a2) obj2, tLObject, (h) obj, tL_error, 15));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new sq((zb0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sq((wb0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
