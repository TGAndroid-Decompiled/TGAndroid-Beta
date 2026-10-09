package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f20023a;
    public final Object f20024b;
    public final Object f20025c;
    public final Object d;
    public final Object f20026e;
    public final Object f20027f;
    public final Object h;
    public final Object f20028n;
    public final boolean f20029r;
    public final Object f20030s;

    public zj(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f20023a = i10;
        this.f20024b = obj;
        this.f20025c = obj2;
        this.d = f1Var;
        this.f20026e = f1Var2;
        this.f20027f = f1Var3;
        this.h = f1Var4;
        this.f20029r = z10;
        this.f20028n = f1Var5;
        this.f20030s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20023a) {
            case 0:
                ((SendMessagesHelper) this.f20024b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20025c, (TLRPC.Message) this.d, (TLObject) this.f20026e, (MessageObject) this.f20027f, (String) this.h, (HashMap) this.f20028n, this.f20029r, (TLRPC.TL_messages_addPollAnswer) this.f20030s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20024b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20025c, (TLRPC.Message) this.d, (TLObject) this.f20026e, (MessageObject) this.f20027f, (String) this.h, (HashMap) this.f20028n, this.f20029r, (TLRPC.TL_messages_editMessage) this.f20030s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20024b).lambda$performSendMessageRequest$103(this.f20029r, (TLRPC.TL_error) this.f20025c, (TLRPC.Message) this.d, (TLObject) this.f20026e, (MessageObject) this.f20027f, (HashMap) this.f20028n, (String) this.h, (TLObject) this.f20030s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f20024b;
                yh.e5 e5Var = (yh.e5) this.f20025c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f20026e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f20027f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f20028n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f20030s;
                if (f1Var != null) {
                    if (e5Var.f52434e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (e5Var.f52434e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(e5Var.f52436g, 1));
                f1Var3.setChecked(TLObject.hasFlag(e5Var.f52436g, 2));
                f1Var4.setChecked(TLObject.hasFlag(e5Var.f52436g, 4));
                f1Var5.setChecked(TLObject.hasFlag(e5Var.f52436g, 8));
                if (this.f20029r) {
                    f1Var6.setChecked(TLObject.hasFlag(e5Var.f52436g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(e5Var.f52436g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f20025c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f20026e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f20027f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f20028n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f20030s;
                yh.e5 e5Var2 = ((xh.j4) this.f20024b).f51319c.Y;
                if (e5Var2.f52434e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (e5Var2.f52434e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(e5Var2.f52436g, 1));
                f1Var10.setChecked(TLObject.hasFlag(e5Var2.f52436g, 2));
                f1Var11.setChecked(TLObject.hasFlag(e5Var2.f52436g, 4));
                f1Var12.setChecked(TLObject.hasFlag(e5Var2.f52436g, 8));
                if (this.f20029r) {
                    f1Var13.setChecked(TLObject.hasFlag(e5Var2.f52436g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(e5Var2.f52436g, 512));
                    return;
                }
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20023a = i10;
        this.f20024b = sendMessagesHelper;
        this.f20025c = tL_error;
        this.d = message;
        this.f20026e = tLObject;
        this.f20027f = messageObject;
        this.h = str;
        this.f20028n = hashMap;
        this.f20029r = z10;
        this.f20030s = tLMethod;
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20023a = 2;
        this.f20024b = sendMessagesHelper;
        this.f20029r = z10;
        this.f20025c = tL_error;
        this.d = message;
        this.f20026e = tLObject;
        this.f20027f = messageObject;
        this.f20028n = hashMap;
        this.h = str;
        this.f20030s = tLObject2;
    }
}
