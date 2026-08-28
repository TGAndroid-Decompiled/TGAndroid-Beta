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
public final class lq implements Utilities.Callback {
    public final int f40209a = 1;
    public final int f40210b;
    public final long f40211c;
    public final Object d;
    public final Object f40212e;
    public final Object f40213f;
    public final Object f40214g;
    public final Serializable h;

    public lq(int i9, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f40210b = i9;
        this.d = arrayList;
        this.f40211c = j10;
        this.f40212e = activity;
        this.f40213f = b6Var;
        this.f40214g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f40209a) {
            case 0:
                jr jrVar = (jr) this.d;
                TLObject tLObject = (TLObject) this.f40212e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40213f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f40214g;
                String str = (String) this.h;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if (!(tLObject instanceof TLRPC.TL_channelParticipantAdmin) && !(tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                long j10 = jrVar.J;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = jrVar.A;
                long j11 = this.f40211c;
                oq oqVar = new oq(jrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                oqVar.T0 = new pq(jrVar, intValue, j11, this.f40210b, z10, zArr);
                jrVar.presentFragment(oqVar);
                return;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.f40212e;
                final org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.f40213f;
                final Utilities.Callback callback = (Utilities.Callback) this.f40214g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i9 = this.f40210b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i9).getMainSettings().edit();
                    int i10 = 0;
                    for (int size = arrayList.size(); i10 < size; size = size) {
                        Object obj2 = arrayList.get(i10);
                        i10++;
                        Long l10 = (Long) obj2;
                        long longValue = l10.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i9).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i9).isUserContactBlocked(longValue));
                        }
                        edit.putLong(aa.d.n(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        gh.v7.y(i9, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j12 = this.f40211c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i11 = i9;
                        long j13 = gh.v7.y(i11, false).p().amount;
                        long j14 = j12;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j13 < j14) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new gh.ea(activity2, b6Var, j14, 13, DialogObject.getShortName(i11, longValue2), new bg.e0(callback2, hashMap2, 1), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!gh.v7.y(i9, false).f9048e) {
                    gh.v7 y10 = gh.v7.y(i9, false);
                    y10.f9048e = false;
                    y10.q(false, true, runnable);
                    y10.f9048e = true;
                    return;
                }
                runnable.run();
                return;
        }
    }

    public lq(jr jrVar, long j10, int i9, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = jrVar;
        this.f40211c = j10;
        this.f40210b = i9;
        this.f40212e = tLObject;
        this.f40213f = tL_chatAdminRights;
        this.f40214g = tL_chatBannedRights;
        this.h = str;
    }
}
