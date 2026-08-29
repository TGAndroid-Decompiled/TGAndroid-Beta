package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l20 implements RequestDelegate {
    public final int f40070a = 3;
    public final int f40071b;
    public final Object f40072c;
    public final long d;
    public final Object f40073e;
    public final Object f40074f;
    public final Object f40075g;
    public final Object h;

    public l20(int i10, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.web.u uVar, bh.v vVar) {
        this.f40071b = i10;
        this.f40073e = c2Var;
        this.f40074f = context;
        this.d = j10;
        this.f40075g = c6Var;
        this.h = uVar;
        this.f40072c = vVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f40070a;
        Object obj = this.f40072c;
        Object obj2 = this.h;
        Object obj3 = this.f40075g;
        Object obj4 = this.f40074f;
        Object obj5 = this.f40073e;
        switch (i10) {
            case 0:
                String str = (String) obj;
                r50.v((r50) obj5, this.d, (HashSet) obj4, (AtomicInteger) obj3, this.f40071b, (ChatObject.Call) obj2, str, tLObject, tL_error);
                return;
            case 1:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new e90((LaunchActivity) obj5, tLObject, this.f40071b, (String) obj, (String) obj4, (TLRPC.User) obj3, (String) obj2, this.d));
                return;
            case 2:
                Activity activity = (Activity) obj5;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj4;
                byte[] bArr = (byte[]) obj3;
                tn tnVar = (tn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new jf.g0(tLObject, activity, c6Var, this.d, bArr, tnVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new j21(tnVar, activity, c6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new ph(tnVar, this.f40071b, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new j21(tnVar, activity, c6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new e90(tLObject, this.f40071b, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj4, this.d, (org.telegram.ui.ActionBar.c6) obj3, (org.telegram.ui.web.u) obj2, (bh.v) obj));
                return;
        }
    }

    public l20(Activity activity, org.telegram.ui.ActionBar.c6 c6Var, long j10, byte[] bArr, tn tnVar, MessageObject messageObject, int i10) {
        this.f40073e = activity;
        this.f40074f = c6Var;
        this.d = j10;
        this.f40075g = bArr;
        this.h = tnVar;
        this.f40072c = messageObject;
        this.f40071b = i10;
    }

    public l20(r50 r50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.f40073e = r50Var;
        this.d = j10;
        this.f40074f = hashSet;
        this.f40075g = atomicInteger;
        this.f40071b = i10;
        this.h = call;
        this.f40072c = str;
    }

    public l20(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.f40073e = launchActivity;
        this.f40071b = i10;
        this.f40072c = str;
        this.f40074f = str2;
        this.f40075g = user;
        this.h = str3;
        this.d = j10;
    }
}
