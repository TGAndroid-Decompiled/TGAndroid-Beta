package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class gk implements Utilities.Callback {
    public final int f23367a;
    public final boolean f23368b;
    public final int f23369c;
    public final Object d;
    public final Object e;

    public gk(int i10, int i11, Object obj, Object obj2, boolean z10) {
        this.f23367a = i11;
        this.d = obj;
        this.e = obj2;
        this.f23368b = z10;
        this.f23369c = i10;
    }

    @Override
    public final void run(Object obj) {
        long j3;
        String str;
        AccountInstance accountInstance;
        boolean z10;
        switch (this.f23367a) {
            case 0:
                ((tk) this.d).Q.l(((Long) obj).longValue(), (ArrayList) this.e, this.f23368b, this.f23369c);
                return;
            default:
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.e;
                Long l4 = (Long) obj;
                zh.a3 a3Var = ((zh.w1) this.d).f48999a;
                TLRPC.User user = a3Var.f48166d3.getAdapter().f8129w0;
                if (user != null) {
                    j3 = user.f17342id;
                } else {
                    j3 = 0;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("id", botInlineResult.f17193id);
                hashMap.put("query_id", "" + botInlineResult.query_id);
                hashMap.put("bot", "" + j3);
                TLRPC.User user2 = a3Var.f48166d3.getAdapter().f8129w0;
                if (user2 == null) {
                    str = "";
                } else {
                    str = user2.username;
                }
                hashMap.put("bot_name", str);
                org.telegram.ui.ActionBar.p2 p2Var = a3Var.J0.f48931f;
                long j10 = j3;
                accountInstance = a3Var.getAccountInstance();
                SendMessagesHelper.prepareSendingBotContextResult(p2Var, accountInstance, botInlineResult, hashMap, a3Var.B1, null, null, a3Var.O1.f49129a, null, this.f23368b, this.f23369c, 0, null, 0L, l4.longValue());
                a3Var.f48157b2.setFieldText("");
                if (l4.longValue() <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a3Var.k0(z10);
                MediaDataController.getInstance(a3Var.C2).increaseInlineRating(j10);
                return;
        }
    }
}
