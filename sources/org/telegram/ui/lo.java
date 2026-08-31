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
    public final int f38790a;
    public final Object f38791b;
    public final Object f38792c;

    public lo(int i10, Object obj, Object obj2) {
        this.f38790a = i10;
        this.f38791b = obj;
        this.f38792c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f38790a;
        Object obj = this.f38792c;
        Object obj2 = this.f38791b;
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
                AndroidUtilities.runOnUIThread(new fc(28, (rp) obj2, (org.telegram.ui.ActionBar.d2[]) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ih((Object) ((kq) obj2), (Object) tL_error, tLObject, (Object) ((TwoStepVerificationActivity) obj), 3));
                return;
            case 3:
                org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) obj2;
                NotificationCenter.getInstance(h5Var.f27388e).doOnIdle(new org.telegram.ui.Components.g5(h5Var, (ArrayList) obj, tLObject, 0));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new mh.p6((org.telegram.ui.Components.c8) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, 24));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new mp(19, (org.telegram.ui.Components.mi) obj2, (org.telegram.ui.Components.fi) obj));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new mp(20, (org.telegram.ui.Components.mi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jp((org.telegram.ui.Components.kp) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 0));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gm(21, (org.telegram.ui.Components.d10) obj2, (Pair) obj));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.d10) obj2), (Object) tL_error, tLObject, (Object) ((Utilities.Callback) obj), 13));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.v30) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_channels_getParticipants) obj), 15));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new ih((org.telegram.ui.Components.y80) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.jp((Object) ((org.telegram.ui.Components.xg0) obj2), (Object) ((org.telegram.ui.Components.wg0) obj), tLObject, 13));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a90((org.telegram.ui.Components.mq0) obj2, tLObject, (Context) obj, 16));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.yx0) obj2), (Object) tL_error, tLObject, (Object) ((MediaDataController) obj), 23));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new ih((Object) ((xr0) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_messages_getAttachedStickers) obj), 24));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new ih((org.telegram.ui.Components.k01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new ih((Object) ((org.telegram.ui.Components.w31) obj2), (Object) tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) obj), 27));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new sq((cz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l41(24, (xz) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 20:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.l41(28, (b10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 21:
                AndroidUtilities.runOnUIThread(new sq((u00) obj2, tL_error, (t00) obj, 8));
                return;
            case 22:
                AndroidUtilities.runOnUIThread(new v10(0, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new b30((Object) ((l50) obj2), (Object) tL_error, tLObject, (Object) ((String) obj), 1));
                return;
            case 24:
                j70 j70Var = (j70) obj2;
                if (Objects.equals(j70Var.f38030a.f38293e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new v10(8, j70Var, tLObject));
                    return;
                }
                return;
            case 25:
                v70 v70Var = (v70) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new sq(v70Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 26:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new sq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.j6) obj, 17));
                return;
            case 27:
                Pattern pattern2 = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new b30((Object) ((org.telegram.ui.ActionBar.d2) obj2), tLObject, (Object) ((i) obj), (Object) tL_error, 5));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new sq((xb0) obj2, tLObject, (String) obj, 19));
                return;
            default:
                AndroidUtilities.runOnUIThread(new sq((ub0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
        }
    }
}
