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
public final class nq implements Utilities.Callback {
    public final int f40875a = 1;
    public final int f40876b;
    public final long f40877c;
    public final Object d;
    public final Object f40878e;
    public final Object f40879f;
    public final Object f40880g;
    public final Serializable h;

    public nq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40876b = i10;
        this.d = arrayList;
        this.f40877c = j10;
        this.f40878e = activity;
        this.f40879f = c6Var;
        this.f40880g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        switch (this.f40875a) {
            case 0:
                jr jrVar = (jr) this.d;
                TLObject tLObject = (TLObject) this.f40878e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40879f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f40880g;
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
                long j11 = this.f40877c;
                qq qqVar = new qq(jrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                qqVar.T0 = new rq(jrVar, intValue, j11, this.f40876b, z10, zArr);
                jrVar.presentFragment(qqVar);
                return;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.f40878e;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f40879f;
                final Utilities.Callback callback = (Utilities.Callback) this.f40880g;
                final HashMap hashMap = (HashMap) this.h;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.f40876b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i10).getMainSettings().edit();
                    int i11 = 0;
                    for (int size = arrayList.size(); i11 < size; size = size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj2;
                        long longValue = l10.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(longValue));
                        }
                        edit.putLong(com.google.android.recaptcha.internal.a.l(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        jh.s7.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                final long j12 = this.f40877c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i10;
                        long j13 = jh.s7.y(i12, false).p().amount;
                        long j14 = j12;
                        Utilities.Callback callback2 = callback;
                        HashMap hashMap2 = hashMap;
                        if (j13 < j14) {
                            Activity activity2 = activity;
                            if (activity2 == null) {
                                return;
                            }
                            long longValue2 = ((Long) arrayList.get(0)).longValue();
                            new jh.y9(activity2, c6Var, j14, 13, DialogObject.getShortName(i12, longValue2), new eg.c0(callback2, hashMap2, 1), longValue2).show();
                            return;
                        }
                        callback2.run(hashMap2);
                    }
                };
                if (!jh.s7.y(i10, false).f12790e) {
                    jh.s7 y8 = jh.s7.y(i10, false);
                    y8.f12790e = false;
                    y8.q(false, true, runnable);
                    y8.f12790e = true;
                    return;
                }
                runnable.run();
                return;
        }
    }

    public nq(jr jrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = jrVar;
        this.f40877c = j10;
        this.f40876b = i10;
        this.f40878e = tLObject;
        this.f40879f = tL_chatAdminRights;
        this.f40880g = tL_chatBannedRights;
        this.h = str;
    }
}
