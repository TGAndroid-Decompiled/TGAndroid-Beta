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
public final class lq implements Utilities.Callback {
    public final int f38975a = 1;
    public final int f38976b;
    public final long f38977c;
    public final Object d;
    public final Object e;
    public final Object f38978f;
    public final Object f38979g;
    public final Serializable h;

    public lq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f38976b = i10;
        this.d = arrayList;
        this.f38977c = j10;
        this.e = activity;
        this.f38978f = d6Var;
        this.f38979g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f38975a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f38979g;
        Object obj3 = this.f38978f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                hr hrVar = (hr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j10 = hrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = hrVar.E;
                long j11 = this.f38977c;
                pq pqVar = new pq(hrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                pqVar.X0 = new qq(hrVar, intValue, j11, this.f38976b, z10, zArr);
                hrVar.presentFragment(pqVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f38976b;
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
                        edit.putLong(r4.c.g(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        ai.ga.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.ui.Components.m1 m1Var = new org.telegram.ui.Components.m1(i11, this.f38977c, activity, arrayList, hashMap, callback, d6Var);
                if (!ai.ga.y(i11, false).e) {
                    ai.ga y3 = ai.ga.y(i11, false);
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
                int i13 = this.f38976b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f38977c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.fi((LaunchActivity) obj5, i13, (cy) obj4, (org.telegram.ui.ActionBar.n2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public lq(hr hrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = hrVar;
        this.f38977c = j10;
        this.f38976b = i10;
        this.e = tLObject;
        this.f38978f = tL_chatAdminRights;
        this.f38979g = tL_chatBannedRights;
        this.h = str;
    }

    public lq(LaunchActivity launchActivity, int i10, long j10, cy cyVar, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f38976b = i10;
        this.f38977c = j10;
        this.e = cyVar;
        this.f38978f = n2Var;
        this.f38979g = user;
        this.h = str;
    }
}
