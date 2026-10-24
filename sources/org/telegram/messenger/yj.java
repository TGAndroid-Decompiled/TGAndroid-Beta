package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class yj implements Runnable {
    public final int f20244a;
    public final Object f20245b;
    public final Object f20246c;
    public final Object d;
    public final Object e;
    public final Object f20247f;
    public final Object h;
    public final Object f20248n;
    public final boolean f20249r;
    public final Object f20250s;

    public yj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f20244a = i10;
        this.f20245b = obj;
        this.f20246c = obj2;
        this.d = e1Var;
        this.e = e1Var2;
        this.f20247f = e1Var3;
        this.h = e1Var4;
        this.f20249r = z10;
        this.f20248n = e1Var5;
        this.f20250s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20244a) {
            case 0:
                ((SendMessagesHelper) this.f20245b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20246c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20247f, (String) this.h, (HashMap) this.f20248n, this.f20249r, (TLRPC.TL_messages_addPollAnswer) this.f20250s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20245b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20246c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20247f, (String) this.h, (HashMap) this.f20248n, this.f20249r, (TLRPC.TL_messages_editMessage) this.f20250s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20245b).lambda$performSendMessageRequest$103(this.f20249r, (TLRPC.TL_error) this.f20246c, (TLRPC.Message) this.d, (TLObject) this.e, (MessageObject) this.f20247f, (HashMap) this.f20248n, (String) this.h, (TLObject) this.f20250s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f20245b;
                ai.y9 y9Var = (ai.y9) this.f20246c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f20247f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f20248n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f20250s;
                if (e1Var != null) {
                    if (y9Var.e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (y9Var.e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.j(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(y9Var.f2507g, 1));
                e1Var3.setChecked(TLObject.hasFlag(y9Var.f2507g, 2));
                e1Var4.setChecked(TLObject.hasFlag(y9Var.f2507g, 4));
                e1Var5.setChecked(TLObject.hasFlag(y9Var.f2507g, 8));
                if (this.f20249r) {
                    e1Var6.setChecked(TLObject.hasFlag(y9Var.f2507g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(y9Var.f2507g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f20246c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f20247f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f20248n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f20250s;
                ai.y9 y9Var2 = ((yh.h4) this.f20245b).f50747c.Y;
                if (y9Var2.e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (y9Var2.e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.j(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(y9Var2.f2507g, 1));
                e1Var10.setChecked(TLObject.hasFlag(y9Var2.f2507g, 2));
                e1Var11.setChecked(TLObject.hasFlag(y9Var2.f2507g, 4));
                e1Var12.setChecked(TLObject.hasFlag(y9Var2.f2507g, 8));
                if (this.f20249r) {
                    e1Var13.setChecked(TLObject.hasFlag(y9Var2.f2507g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(y9Var2.f2507g, 512));
                    return;
                }
                return;
        }
    }

    public yj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20244a = i10;
        this.f20245b = sendMessagesHelper;
        this.f20246c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f20247f = messageObject;
        this.h = str;
        this.f20248n = hashMap;
        this.f20249r = z10;
        this.f20250s = tLMethod;
    }

    public yj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20244a = 2;
        this.f20245b = sendMessagesHelper;
        this.f20249r = z10;
        this.f20246c = tL_error;
        this.d = message;
        this.e = tLObject;
        this.f20247f = messageObject;
        this.f20248n = hashMap;
        this.h = str;
        this.f20250s = tLObject2;
    }
}
