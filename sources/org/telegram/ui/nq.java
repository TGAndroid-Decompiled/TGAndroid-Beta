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

    public final int f40896a = 1;

    public final int f40897b;

    public final long f40898c;
    public final Object d;

    public final Object f40899e;

    public final Object f40900f;

    public final Object f40901g;
    public final Serializable h;

    public nq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap map, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f40897b = i10;
        this.d = arrayList;
        this.f40898c = j10;
        this.f40899e = activity;
        this.f40900f = c6Var;
        this.f40901g = callback;
        this.h = map;
    }

    @Override
    public final void run(Object obj) {
        switch (this.f40896a) {
            case 0:
                lr lrVar = (lr) this.d;
                TLObject tLObject = (TLObject) this.f40899e;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.f40900f;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.f40901g;
                String str = (String) this.h;
                int iIntValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                boolean z10 = (tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin);
                long j10 = lrVar.J;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = lrVar.A;
                long j11 = this.f40898c;
                qq qqVar = new qq(lrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, iIntValue, zArr, j11);
                qqVar.T0 = new rq(lrVar, iIntValue, j11, this.f40897b, z10, zArr);
                lrVar.presentFragment(qqVar);
                break;
            default:
                final ArrayList arrayList = (ArrayList) this.d;
                final Activity activity = (Activity) this.f40899e;
                final org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f40900f;
                final Utilities.Callback callback = (Utilities.Callback) this.f40901g;
                final HashMap map = (HashMap) this.h;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final int i10 = this.f40897b;
                if (zBooleanValue) {
                    SharedPreferences.Editor editorEdit = MessagesController.getInstance(i10).getMainSettings().edit();
                    int i11 = 0;
                    for (int size = arrayList.size(); i11 < size; size = size) {
                        Object obj2 = arrayList.get(i11);
                        i11++;
                        Long l10 = (Long) obj2;
                        long jLongValue = l10.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i10).getSendPaidMessagesStars(jLongValue);
                        if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i10).isUserContactBlocked(jLongValue));
                        }
                        editorEdit.putLong(com.google.android.recaptcha.internal.a.m(jLongValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        hh.u7.y(i10, false).O.put(l10, Long.valueOf(System.currentTimeMillis()));
                    }
                    editorEdit.apply();
                }
                final long j12 = this.f40898c;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        int i12 = i10;
                        long j13 = hh.u7.y(i12, false).p().amount;
                        long j14 = j12;
                        Utilities.Callback callback2 = callback;
                        HashMap map2 = map;
                        if (j13 >= j14) {
                            callback2.run(map2);
                            return;
                        }
                        Activity activity2 = activity;
                        if (activity2 == null) {
                            return;
                        }
                        long jLongValue2 = ((Long) arrayList.get(0)).longValue();
                        new hh.ea(activity2, c6Var, j14, 13, DialogObject.getShortName(i12, jLongValue2), new cg.b0(callback2, map2, 1), jLongValue2).show();
                    }
                };
                if (hh.u7.y(i10, false).f10154e) {
                    runnable.run();
                } else {
                    hh.u7 u7VarY = hh.u7.y(i10, false);
                    u7VarY.f10154e = false;
                    u7VarY.q(false, true, runnable);
                    u7VarY.f10154e = true;
                }
                break;
        }
    }

    public nq(lr lrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = lrVar;
        this.f40898c = j10;
        this.f40897b = i10;
        this.f40899e = tLObject;
        this.f40900f = tL_chatAdminRights;
        this.f40901g = tL_chatBannedRights;
        this.h = str;
    }
}
