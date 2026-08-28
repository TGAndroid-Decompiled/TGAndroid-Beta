package org.telegram.messenger;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a60;
import org.telegram.ui.dy;
import org.telegram.ui.hw0;
import org.telegram.ui.jh0;
import org.telegram.ui.k21;
public final class zh implements RequestDelegate {
    public final int f22344a;
    public final int f22345b;
    public final Object f22346c;
    public final Object d;
    public final Object f22347e;
    public final Object f22348f;
    public final Object f22349g;

    public zh(int i9, boolean[] zArr, File file, TL_phone.setCallRating setcallrating, ArrayList arrayList, Context context) {
        this.f22344a = 3;
        this.f22345b = i9;
        this.d = zArr;
        this.f22347e = file;
        this.f22348f = setcallrating;
        this.f22349g = arrayList;
        this.f22346c = context;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f22344a;
        int i10 = this.f22345b;
        Object obj = this.f22346c;
        Object obj2 = this.f22349g;
        Object obj3 = this.f22348f;
        Object obj4 = this.f22347e;
        Object obj5 = this.d;
        switch (i9) {
            case 0:
                ((SendMessagesHelper) obj5).lambda$performSendDelayedMessage$54((TLRPC.InputFile) obj4, (TLRPC.InputMedia) obj3, (SendMessagesHelper.DelayedMessage) obj2, this.f22345b, (String) obj, tLObject, tL_error);
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new fh.u2((org.telegram.ui.l4) obj5, this.f22345b, (ve.d) obj4, tLObject, (String) obj, (org.telegram.ui.h0) obj3, (TLRPC.TL_messages_getWebPage) obj2));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fh.u2(tLObject, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.f22345b, (TL_phone.exportGroupCallInvite) obj3, (org.telegram.ui.ActionBar.b6) obj2, (a60) obj));
                return;
            case 3:
                boolean[] zArr = (boolean[]) obj5;
                File file = (File) obj4;
                TL_phone.setCallRating setcallrating = (TL_phone.setCallRating) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                Context context = (Context) obj;
                if (tLObject instanceof TLRPC.TL_updates) {
                    MessagesController.getInstance(i10).processUpdates((TLRPC.TL_updates) tLObject, false);
                }
                if (zArr[0] && file.exists() && setcallrating.rating < 4) {
                    SendMessagesHelper.prepareSendingDocument(AccountInstance.getInstance(UserConfig.selectedAccount), file.getAbsolutePath(), file.getAbsolutePath(), null, TextUtils.join(" ", arrayList), "text/plain", 4244000L, null, null, null, null, null, true, 0, null, null, false);
                    Toast.makeText(context, LocaleController.getString(R.string.CallReportSent), 1).show();
                    return;
                }
                return;
            case 4:
                String str = (String) obj;
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new fh.u2((LaunchActivity) obj5, tLObject, this.f22345b, (dy) obj4, (org.telegram.ui.ActionBar.o2) obj3, (TLRPC.User) obj2, str));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new x5(tLObject, (org.telegram.ui.ActionBar.o2) obj5, (TLRPC.TL_inputStorePaymentPremiumSubscription) obj4, (hw0) obj3, (n2.e) obj2, this.f22345b, tL_error, (TLRPC.TL_payments_canPurchaseStore) obj));
                return;
            default:
                Context context2 = (Context) obj5;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj4;
                byte[] bArr = (byte[]) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                jg0 jg0Var = (jg0) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new fh.k1(tLObject, (Object) context2, (Object) b6Var, (Object) bArr, (Object) o2Var, (Object) jg0Var, 19));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new k21(o2Var, context2, b6Var, jg0Var, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new jh0(o2Var, i10, jg0Var, 8), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new k21(o2Var, context2, b6Var, jg0Var, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public zh(Context context, org.telegram.ui.ActionBar.b6 b6Var, byte[] bArr, org.telegram.ui.ActionBar.o2 o2Var, jg0 jg0Var, int i9) {
        this.f22344a = 6;
        this.d = context;
        this.f22347e = b6Var;
        this.f22348f = bArr;
        this.f22349g = o2Var;
        this.f22346c = jg0Var;
        this.f22345b = i9;
    }

    public zh(Object obj, TLObject tLObject, Object obj2, Object obj3, int i9, Object obj4, int i10) {
        this.f22344a = i10;
        this.d = obj;
        this.f22347e = tLObject;
        this.f22348f = obj2;
        this.f22349g = obj3;
        this.f22345b = i9;
        this.f22346c = obj4;
    }

    public zh(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i9, TL_phone.exportGroupCallInvite exportgroupcallinvite, org.telegram.ui.ActionBar.b6 b6Var, a60 a60Var) {
        this.f22344a = 2;
        this.d = c2Var;
        this.f22347e = context;
        this.f22345b = i9;
        this.f22348f = exportgroupcallinvite;
        this.f22349g = b6Var;
        this.f22346c = a60Var;
    }

    public zh(org.telegram.ui.l4 l4Var, int i9, ve.d dVar, String str, org.telegram.ui.h0 h0Var, TLRPC.TL_messages_getWebPage tL_messages_getWebPage) {
        this.f22344a = 1;
        this.d = l4Var;
        this.f22345b = i9;
        this.f22347e = dVar;
        this.f22346c = str;
        this.f22348f = h0Var;
        this.f22349g = tL_messages_getWebPage;
    }

    public zh(LaunchActivity launchActivity, int i9, dy dyVar, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        this.f22344a = 4;
        this.d = launchActivity;
        this.f22345b = i9;
        this.f22347e = dyVar;
        this.f22348f = o2Var;
        this.f22349g = user;
        this.f22346c = str;
    }
}
