package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class br implements Utilities.Callback {
    public final int f31358a = 1;
    public final int f31359b;
    public final long f31360c;
    public final Object d;
    public final Object e;
    public final Object f31361f;
    public final Object f31362g;
    public final Serializable h;

    public br(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f31359b = i10;
        this.d = arrayList;
        this.f31360c = j3;
        this.e = activity;
        this.f31361f = f6Var;
        this.f31362g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f31358a) {
            case 0:
                wr wrVar = (wr) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f31361f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f31362g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                long j3 = wrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = wrVar.E;
                long j10 = this.f31360c;
                er erVar = new er(wrVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                erVar.X0 = new fr(wrVar, intValue, j10, this.f31359b, z10, zArr);
                wrVar.presentFragment(erVar);
                return;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.e;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f31361f;
                final Utilities.Callback callback = (Utilities.Callback) this.f31362g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.f31359b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i10).getMainSettings().edit();
                    int i11 = 0;
                    for (int size = arrayList.size(); i11 < size; size = size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        Long l4 = (Long) obj2;
                        long longValue = l4.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
                        }
                        edit.putLong(org.telegram.ui.Cells.r6.h(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        xh.v5.y(i10, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j11 = this.f31360c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i10;
                        long j12 = xh.v5.y(i12, false).p().amount;
                        long j13 = j11;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j12 < j13) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new xh.o7(activity2, f6Var, j13, 13, DialogObject.getShortName(i12, longValue2), new c2(callback2, hashMap2, 0), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!xh.v5.y(i10, false).e) {
                    xh.v5 y3 = xh.v5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, runnable);
                    y3.e = true;
                    return;
                }
                runnable.run();
                return;
        }
    }

    public br(wr wrVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = wrVar;
        this.f31360c = j3;
        this.f31359b = i10;
        this.e = tLObject;
        this.f31361f = tL_chatAdminRights;
        this.f31362g = tL_chatBannedRights;
        this.h = str;
    }
}
