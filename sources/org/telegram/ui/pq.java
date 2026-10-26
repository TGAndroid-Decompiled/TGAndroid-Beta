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
public final class pq implements Utilities.Callback {
    public final int f42639a = 1;
    public final int f42640b;
    public final long f42641c;
    public final Object d;
    public final Object e;
    public final Object f42642f;
    public final Object f42643g;
    public final Serializable h;

    public pq(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f42640b = i10;
        this.d = arrayList;
        this.f42641c = j10;
        this.e = activity;
        this.f42642f = u6Var;
        this.f42643g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f42639a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f42643g;
        Object obj3 = this.f42642f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                kr krVar = (kr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j10 = krVar.M;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = krVar.f41059y;
                long j11 = this.f42641c;
                sq sqVar = new sq(krVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                sqVar.X0 = new tq(krVar, intValue, j11, this.f42640b, z10, zArr);
                krVar.presentFragment(sqVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f42640b;
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
                        edit.putLong(org.telegram.ui.Components.b10.i(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        bi.ca.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.ui.Components.k1 k1Var = new org.telegram.ui.Components.k1(i11, this.f42641c, activity, arrayList, hashMap, callback, u6Var);
                if (!bi.ca.y(i11, false).e) {
                    bi.ca y3 = bi.ca.y(i11, false);
                    y3.e = false;
                    y3.q(false, true, k1Var);
                    y3.e = true;
                    return;
                }
                k1Var.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f42640b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f42641c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.li((LaunchActivity) obj5, i13, (cy) obj4, (org.telegram.ui.ActionBar.r2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public pq(kr krVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = krVar;
        this.f42641c = j10;
        this.f42640b = i10;
        this.e = tLObject;
        this.f42642f = tL_chatAdminRights;
        this.f42643g = tL_chatBannedRights;
        this.h = str;
    }

    public pq(LaunchActivity launchActivity, int i10, long j10, cy cyVar, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f42640b = i10;
        this.f42641c = j10;
        this.e = cyVar;
        this.f42642f = r2Var;
        this.f42643g = user;
        this.h = str;
    }
}
