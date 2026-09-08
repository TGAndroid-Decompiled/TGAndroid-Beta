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
public final class ar implements Utilities.Callback {
    public final int f34564a = 1;
    public final int f34565b;
    public final long f34566c;
    public final Object d;
    public final Object f34567e;
    public final Object f34568f;
    public final Object f34569g;
    public final Serializable h;

    public ar(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f34565b = i10;
        this.d = arrayList;
        this.f34566c = j3;
        this.f34567e = activity;
        this.f34568f = f6Var;
        this.f34569g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f34564a) {
            case 0:
                vr vrVar = (vr) this.d;
                TLObject tLObject = (TLObject) this.f34567e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f34568f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f34569g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                long j3 = vrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = vrVar.E;
                long j10 = this.f34566c;
                dr drVar = new dr(vrVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                drVar.X0 = new er(vrVar, intValue, j10, this.f34565b, z10, zArr);
                vrVar.presentFragment(drVar);
                return;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.f34567e;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.f34568f;
                final Utilities.Callback callback = (Utilities.Callback) this.f34569g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.f34565b;
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
                        edit.putLong(org.telegram.ui.Cells.p6.h(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        zh.s5.y(i10, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j11 = this.f34566c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i10;
                        long j12 = zh.s5.y(i12, false).p().amount;
                        long j13 = j11;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j12 < j13) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new zh.k7(activity2, f6Var, j13, 13, DialogObject.getShortName(i12, longValue2), new b2(callback2, hashMap2, 0), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!zh.s5.y(i10, false).f52600e) {
                    zh.s5 y3 = zh.s5.y(i10, false);
                    y3.f52600e = false;
                    y3.q(false, true, runnable);
                    y3.f52600e = true;
                    return;
                }
                runnable.run();
                return;
        }
    }

    public ar(vr vrVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = vrVar;
        this.f34566c = j3;
        this.f34565b = i10;
        this.f34567e = tLObject;
        this.f34568f = tL_chatAdminRights;
        this.f34569g = tL_chatBannedRights;
        this.h = str;
    }
}
