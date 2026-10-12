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
public final class ar implements Utilities.Callback {
    public final int f35952a = 1;
    public final int f35953b;
    public final long f35954c;
    public final Object d;
    public final Object f35955e;
    public final Object f35956f;
    public final Object f35957g;
    public final Serializable h;

    public ar(int i10, long j3, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f35953b = i10;
        this.d = arrayList;
        this.f35954c = j3;
        this.f35955e = activity;
        this.f35956f = c6Var;
        this.f35957g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35952a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f35957g;
        Object obj3 = this.f35956f;
        Object obj4 = this.f35955e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                wr wrVar = (wr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j3 = wrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = wrVar.E;
                long j10 = this.f35954c;
                dr drVar = new dr(wrVar, j10, j3, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j10);
                drVar.X0 = new er(wrVar, intValue, j10, this.f35953b, z10, zArr);
                wrVar.presentFragment(drVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f35953b;
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
                        edit.putLong(org.telegram.ui.Cells.c1.h(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        yh.n5.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.ui.Components.m1 m1Var = new org.telegram.ui.Components.m1(i11, this.f35954c, activity, arrayList, hashMap, callback, c6Var);
                if (!yh.n5.y(i11, false).f53149e) {
                    yh.n5 y3 = yh.n5.y(i11, false);
                    y3.f53149e = false;
                    y3.q(false, true, m1Var);
                    y3.f53149e = true;
                    return;
                }
                m1Var.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f35953b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f35954c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.pi((LaunchActivity) obj5, i13, (vy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public ar(wr wrVar, long j3, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = wrVar;
        this.f35954c = j3;
        this.f35953b = i10;
        this.f35955e = tLObject;
        this.f35956f = tL_chatAdminRights;
        this.f35957g = tL_chatBannedRights;
        this.h = str;
    }

    public ar(LaunchActivity launchActivity, int i10, long j3, vy vyVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f35953b = i10;
        this.f35954c = j3;
        this.f35955e = vyVar;
        this.f35956f = m2Var;
        this.f35957g = user;
        this.h = str;
    }
}
