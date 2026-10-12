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
public final class dr implements Utilities.Callback {
    public final int f35374a = 1;
    public final int f35375b;
    public final long f35376c;
    public final Object d;
    public final Object e;
    public final Object f35377f;
    public final Object f35378g;
    public final Serializable h;

    public dr(int i10, long j10, Activity activity, ArrayList arrayList, HashMap hashMap, Utilities.Callback callback, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f35375b = i10;
        this.d = arrayList;
        this.f35376c = j10;
        this.e = activity;
        this.f35377f = c6Var;
        this.f35378g = callback;
        this.h = hashMap;
    }

    @Override
    public final void run(Object obj) {
        int i10 = this.f35374a;
        boolean z10 = false;
        Serializable serializable = this.h;
        Object obj2 = this.f35378g;
        Object obj3 = this.f35377f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                yr yrVar = (yr) obj5;
                TLObject tLObject = (TLObject) obj4;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) obj3;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) obj2;
                String str = (String) serializable;
                int intValue = ((Integer) obj).intValue();
                boolean[] zArr = new boolean[1];
                if ((tLObject instanceof TLRPC.TL_channelParticipantAdmin) || (tLObject instanceof TLRPC.TL_chatParticipantAdmin)) {
                    z10 = true;
                }
                long j10 = yrVar.N;
                TLRPC.TL_chatBannedRights tL_chatBannedRights2 = yrVar.E;
                long j11 = this.f35376c;
                gr grVar = new gr(yrVar, j11, j10, tL_chatAdminRights, tL_chatBannedRights2, tL_chatBannedRights, str, intValue, zArr, j11);
                grVar.X0 = new hr(yrVar, intValue, j11, this.f35375b, z10, zArr);
                yrVar.presentFragment(grVar);
                return;
            case 1:
                ArrayList arrayList = (ArrayList) obj5;
                Activity activity = (Activity) obj4;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) obj3;
                Utilities.Callback callback = (Utilities.Callback) obj2;
                HashMap hashMap = (HashMap) serializable;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                int i11 = this.f35375b;
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
                        edit.putLong(org.telegram.ui.Cells.d0.i(longValue, "ask_paid_message_", "_price"), sendPaidMessagesStars);
                        zh.n5.y(i11, false).O.put(l4, Long.valueOf(System.currentTimeMillis()));
                    }
                    edit.apply();
                }
                org.telegram.ui.Components.m1 m1Var = new org.telegram.ui.Components.m1(i11, this.f35376c, activity, arrayList, hashMap, callback, c6Var);
                if (!zh.n5.y(i11, false).e) {
                    zh.n5 y3 = zh.n5.y(i11, false);
                    y3.e = false;
                    y3.q(false, true, m1Var);
                    y3.e = true;
                    return;
                }
                m1Var.run();
                return;
            default:
                Boolean bool = (Boolean) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
                int i13 = this.f35375b;
                tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i13).getInputUser(this.f35376c);
                tL_messages_toggleBotInAttachMenu.enabled = true;
                tL_messages_toggleBotInAttachMenu.write_allowed = true;
                ConnectionsManager.getInstance(i13).sendRequest(tL_messages_toggleBotInAttachMenu, new org.telegram.messenger.ni((LaunchActivity) obj5, i13, (yy) obj4, (org.telegram.ui.ActionBar.m2) obj3, (TLRPC.User) obj2, (String) serializable), 66);
                return;
        }
    }

    public dr(yr yrVar, long j10, int i10, TLObject tLObject, TLRPC.TL_chatAdminRights tL_chatAdminRights, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str, boolean z10) {
        this.d = yrVar;
        this.f35376c = j10;
        this.f35375b = i10;
        this.e = tLObject;
        this.f35377f = tL_chatAdminRights;
        this.f35378g = tL_chatBannedRights;
        this.h = str;
    }

    public dr(LaunchActivity launchActivity, int i10, long j10, yy yyVar, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        this.d = launchActivity;
        this.f35375b = i10;
        this.f35376c = j10;
        this.e = yyVar;
        this.f35377f = m2Var;
        this.f35378g = user;
        this.h = str;
    }
}
