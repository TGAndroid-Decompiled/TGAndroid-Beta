package org.telegram.ui;

import android.app.Activity;
import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class nq implements Utilities.Callback {
    public final int f39514a = 1;
    public final int f39515b;
    public final long f39516c;
    public final Object d;
    public final Object e;
    public final Object f39517f;
    public final Object f39518g;
    public final Serializable h;

    public nq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f39515b = i10;
        this.d = arrayList;
        this.f39516c = j10;
        this.e = activity;
        this.f39517f = d6Var;
        this.f39518g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f39514a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f39518g;
        Object obj3 = this.f39517f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                jr jrVar = (jr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j10 = jrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = jrVar.E;
                long j11 = this.f39516c;
                rq rqVar = new rq(jrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                rqVar.X0 = new sq(jrVar, intValue, j11, this.f39515b, z10, zArr);
                jrVar.presentFragment(rqVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f39515b;
                if (booleanValue) {
                    SharedPreferences.Editor edit = MessagesController.getInstance(i11).getMainSettings().edit();
                    int size = arrayList.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj6 = arrayList.get(i12);
                        i12++;
                        Long l4 = (Long) obj6;
                        long longValue = l4.longValue();
                        long sendPaidMessagesStars = MessagesController.getInstance(i11).getSendPaidMessagesStars(longValue);
                        if (sendPaidMessagesStars <= 0 && longValue > 0) {
                            sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(i11).isUserContactBlocked(longValue));
                        }
                        edit.putLong(r.c.f(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        ai.fa.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.ui.Components.m1 m1Var = new org.telegram.ui.Components.m1(i11, this.f39516c, activity, arrayList, hashMap, callback, d6Var);
                if (!ai.fa.y(i11, false).e) {
                    ai.fa y3 = ai.fa.y(i11, false);
                    y3.e = false;
                    y3.q(false, true, m1Var);
                    y3.e = true;
                    return;
                }
                m1Var.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.C1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f39515b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f39516c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.gi((LaunchActivity) obj5, i13, (ey) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public nq(jr jrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = jrVar;
        this.f39516c = j10;
        this.f39515b = i10;
        this.e = tLObject;
        this.f39517f = tL_chatAdminRights;
        this.f39518g = tL_chatBannedRights;
        this.h = str;
    }

    public nq(LaunchActivity launchActivity, int i10, long j10, ey eyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f39515b = i10;
        this.f39516c = j10;
        this.e = eyVar;
        this.f39517f = n2Var;
        this.f39518g = user;
        this.h = str;
    }
}
