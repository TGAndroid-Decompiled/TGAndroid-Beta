package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.HashMap;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.FiltersSetupActivity;
import org.telegram.ui.LaunchActivity;
public final class th implements RequestDelegate {
    public final int f27409a;
    public final Object f27410b;
    public final Object f27411c;

    public th(int i10, Object obj, Object obj2) {
        this.f27409a = i10;
        this.f27410b = obj;
        this.f27411c = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f27409a;
        Object obj = this.f27411c;
        Object obj2 = this.f27410b;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new ee(5, (yi) obj2, (ri) obj));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new ee(6, (yi) obj2, (TLRPC.TL_attachMenuBot) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new gf((qp) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 5));
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new hy(7, (k10) obj2, (Pair) obj));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((k10) obj2, tL_error, tLObject, (Utilities.Callback) obj, false, 18));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((b40) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, false, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((f90) obj2, (TLRPC.TL_chatInviteExported) obj, tL_error, tLObject, 22));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new gf((zg0) obj2, (yg0) obj, tLObject, 18));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yo0((sq0) obj2, tLObject, (Context) obj, 2));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((hy0) obj2, tL_error, tLObject, (MediaDataController) obj, false, 28));
                return;
            case 10:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((org.telegram.ui.qs0) obj2, tL_error, tLObject, (TLRPC.TL_messages_getAttachedStickers) obj, false, 29));
                return;
            case 11:
                AndroidUtilities.runOnUIThread(new q01((s01) obj2, (org.telegram.ui.ActionBar.d2) obj, tLObject, tL_error, 0));
                return;
            case 12:
                AndroidUtilities.runOnUIThread(new q01((Object) ((i41) obj2), tL_error, tLObject, (Object) ((TLRPC.TL_textWithEntities) obj), 2));
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.iz) obj2, tLObject, (MessageObject) obj, 4));
                return;
            case 14:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(10, (org.telegram.ui.c00) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 15:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(14, (org.telegram.ui.h10) obj2, (org.telegram.ui.ActionBar.d2) obj));
                return;
            case 16:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.a10) obj2, tL_error, (org.telegram.ui.z00) obj, 8));
                return;
            case 17:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(16, (FiltersSetupActivity) obj2, (TLRPC.TL_messages_toggleDialogFilterTags) obj));
                return;
            case 18:
                AndroidUtilities.runOnUIThread(new q01((Object) ((org.telegram.ui.q50) obj2), tL_error, tLObject, (Object) ((String) obj), 6));
                return;
            case 19:
                org.telegram.ui.o70 o70Var = (org.telegram.ui.o70) obj2;
                if (Objects.equals(o70Var.f35409a.e, (String) obj)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.uv(24, o70Var, tLObject));
                    return;
                }
                return;
            case 20:
                org.telegram.ui.c80 c80Var = (org.telegram.ui.c80) obj2;
                String str = (String) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(0);
                        if (langPackString instanceof TLRPC.TL_langPackString) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.zq(c80Var, (TLRPC.TL_langPackString) langPackString, str, 11));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 21:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((LaunchActivity) obj2, tLObject, (org.telegram.ui.ActionBar.i6) obj, 17));
                return;
            case 22:
                Pattern pattern2 = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new q01((org.telegram.ui.ActionBar.d2) obj2, tLObject, (org.telegram.ui.h) obj, tL_error));
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.fc0) obj2, tLObject, (String) obj, 19));
                return;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.cc0) obj2, tLObject, (TLRPC.User) obj, 20));
                return;
            case 25:
                AndroidUtilities.runOnUIThread(new q01((Object) ((org.telegram.ui.cc0) obj2), tLObject, (Object) ((HashSet) obj), (TLObject) tL_error, 12));
                return;
            case 26:
                org.telegram.ui.xg0 xg0Var = (org.telegram.ui.xg0) obj2;
                Bundle bundle = (Bundle) obj;
                if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.zq(xg0Var, bundle, tLObject, 24));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.kd0(xg0Var, 2));
                    return;
                }
            case 27:
                AndroidUtilities.runOnUIThread(new q01((Object) ((org.telegram.ui.af0) obj2), tLObject, (Object) ((String) obj), (TLObject) tL_error, 15));
                return;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.zq((org.telegram.ui.zf0) obj2, tL_error, (TL_account.confirmPhone) obj, 29));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.pf0((KeyEvent.Callback) ((org.telegram.ui.wg0) obj2), tLObject, (Object) ((HashMap) obj), 4));
                return;
        }
    }
}
