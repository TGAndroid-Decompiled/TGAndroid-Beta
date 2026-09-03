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
    public final int f36545a;
    public final Object f36546b;
    public final Object f36547c;

    public no(int i10, Object obj, Object obj2) {
        this.f36545a = i10;
        this.f36546b = obj;
        this.f36547c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36545a;
        Object obj = this.f36547c;
        Object obj2 = this.f36546b;
        switch (i10) {
            case 0:
                ro roVar = (ro) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = roVar.B0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    roVar.getMessagesStorage().updateUserInfo(roVar.B0, false);
                }
                AndroidUtilities.runOnUIThread(new lo(roVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new hc(28, (sp) obj2, (org.telegram.ui.ActionBar.d2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kh((Object) ((lq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 3));
                return;
            case 3:
                org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) obj2;
                NotificationCenter.getInstance(h5Var.e).doOnIdle(new org.telegram.ui.Components.g5(h5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new lh.p6((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, 24));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new np(19, (org.telegram.ui.Components.li) obj2, (org.telegram.ui.Components.ei) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new np(20, (org.telegram.ui.Components.li) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gp((org.telegram.ui.Components.hp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.em(21, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new kh((Object) ((org.telegram.ui.Components.d10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 13));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new kh((Object) ((org.telegram.ui.Components.u30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new kh((org.telegram.ui.Components.x80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gp((Object) ((org.telegram.ui.Components.wg0) obj2), (Object) ((org.telegram.ui.Components.vg0) obj), tLObject, 13));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.z80((org.telegram.ui.Components.lq0) obj2, tLObject, (Context) obj, 16));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new kh((Object) ((org.telegram.ui.Components.xx0) obj2), (Object) tL_error, tLObject, (Object) ((MediaDataController) obj), 23));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new kh((Object) ((cs0) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) obj), 24));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new kh((org.telegram.ui.Components.j01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new kh((Object) ((org.telegram.ui.Components.v31) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) obj), 27));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new tq((dz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(24, (yz) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(28, (c10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new tq((v00) obj2, tL_error, (u00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new w10(0, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new c30((Object) ((m50) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 1));
                return;
            case 24:
                k70 k70Var = (k70) obj2;
                if (Objects.equals(k70Var.f35437a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new w10(8, k70Var, tLObject));
                    return;
                }
                return;
            case 25:
                w70 w70Var = (w70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new tq(w70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new tq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.f31586y1;
                AndroidUtilities.runOnUIThread(new c30((Object) ((org.telegram.ui.ActionBar.d2) obj2), tLObject, (Object) ((i) obj), (Object) tL_error, 5));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new tq((yb0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new tq((vb0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
