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
    public final int f36114a;
    public final Object f36115b;
    public final Object f36116c;

    public lo(int i10, Object obj, Object obj2) {
        this.f36114a = i10;
        this.f36115b = obj;
        this.f36116c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f36114a;
        Object obj = this.f36116c;
        Object obj2 = this.f36115b;
        switch (i10) {
            case 0:
                po poVar = (po) obj2;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) obj;
                TLRPC.UserFull userFull = poVar.B0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    poVar.getMessagesStorage().updateUserInfo(poVar.B0, false);
                }
                AndroidUtilities.runOnUIThread(new jo(poVar, 2));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new yb(29, (qp) obj2, (org.telegram.ui.ActionBar.d2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ih((Object) ((jq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 3));
                return;
            case 3:
                org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) obj2;
                NotificationCenter.getInstance(h5Var.e).doOnIdle(new org.telegram.ui.Components.g5(h5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new lh.p6((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, 24));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new hp(20, (org.telegram.ui.Components.li) obj2, (org.telegram.ui.Components.ei) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new hp(21, (org.telegram.ui.Components.li) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hp((org.telegram.ui.Components.ip) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.il(22, (org.telegram.ui.Components.c10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.c10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 13));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.t30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ih((org.telegram.ui.Components.x80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.hp((Object) ((org.telegram.ui.Components.vg0) obj2), (Object) ((org.telegram.ui.Components.ug0) obj), tLObject, 13));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.i80((org.telegram.ui.Components.lq0) obj2, tLObject, (Context) obj, 17));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.xx0) obj2), (Object) tL_error, tLObject, (Object) ((MediaDataController) obj), 23));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ih((Object) ((vr0) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) obj), 24));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ih((org.telegram.ui.Components.j01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.v31) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) obj), 27));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new rq((bz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(25, (wz) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.k41(29, (b10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new rq((u00) obj2, tL_error, (t00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new g00(1, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new a30((Object) ((k50) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 1));
                return;
            case 24:
                i70 i70Var = (i70) obj2;
                if (Objects.equals(i70Var.f35036a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new g00(9, i70Var, tLObject));
                    return;
                }
                return;
            case 25:
                u70 u70Var = (u70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new rq(u70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new rq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.f31612y1;
                AndroidUtilities.runOnUIThread(new a30((Object) ((org.telegram.ui.ActionBar.d2) obj2), tLObject, (Object) ((i) obj), (Object) tL_error, 5));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new rq((wb0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new rq((tb0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
