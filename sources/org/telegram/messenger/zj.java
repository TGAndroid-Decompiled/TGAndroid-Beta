package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f20053a;
    public final Object f20054b;
    public final Object f20055c;
    public final Object d;
    public final Object f20056e;
    public final Object f20057f;
    public final Object h;
    public final Object f20058n;
    public final boolean f20059r;
    public final Object f20060s;

    public zj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f20053a = i10;
        this.f20054b = obj;
        this.f20055c = obj2;
        this.d = e1Var;
        this.f20056e = e1Var2;
        this.f20057f = e1Var3;
        this.h = e1Var4;
        this.f20059r = z10;
        this.f20058n = e1Var5;
        this.f20060s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20053a) {
            case 0:
                ((SendMessagesHelper) this.f20054b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20055c, (TLRPC.Message) this.d, (TLObject) this.f20056e, (MessageObject) this.f20057f, (String) this.h, (HashMap) this.f20058n, this.f20059r, (TLRPC.TL_messages_addPollAnswer) this.f20060s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20054b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20055c, (TLRPC.Message) this.d, (TLObject) this.f20056e, (MessageObject) this.f20057f, (String) this.h, (HashMap) this.f20058n, this.f20059r, (TLRPC.TL_messages_editMessage) this.f20060s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20054b).lambda$performSendMessageRequest$103(this.f20059r, (TLRPC.TL_error) this.f20055c, (TLRPC.Message) this.d, (TLObject) this.f20056e, (MessageObject) this.f20057f, (HashMap) this.f20058n, (String) this.h, (TLObject) this.f20060s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f20054b;
                yh.f5 f5Var = (yh.f5) this.f20055c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.f20056e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f20057f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f20058n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f20060s;
                if (e1Var != null) {
                    if (f5Var.f52634e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (f5Var.f52634e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(f5Var.f52636g, 1));
                e1Var3.setChecked(TLObject.hasFlag(f5Var.f52636g, 2));
                e1Var4.setChecked(TLObject.hasFlag(f5Var.f52636g, 4));
                e1Var5.setChecked(TLObject.hasFlag(f5Var.f52636g, 8));
                if (this.f20059r) {
                    e1Var6.setChecked(TLObject.hasFlag(f5Var.f52636g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(f5Var.f52636g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f20055c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.f20056e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f20057f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f20058n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f20060s;
                yh.f5 f5Var2 = ((xh.j4) this.f20054b).f51442c.Y;
                if (f5Var2.f52634e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (f5Var2.f52634e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(f5Var2.f52636g, 1));
                e1Var10.setChecked(TLObject.hasFlag(f5Var2.f52636g, 2));
                e1Var11.setChecked(TLObject.hasFlag(f5Var2.f52636g, 4));
                e1Var12.setChecked(TLObject.hasFlag(f5Var2.f52636g, 8));
                if (this.f20059r) {
                    e1Var13.setChecked(TLObject.hasFlag(f5Var2.f52636g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(f5Var2.f52636g, 512));
                    return;
                }
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20053a = i10;
        this.f20054b = sendMessagesHelper;
        this.f20055c = tL_error;
        this.d = message;
        this.f20056e = tLObject;
        this.f20057f = messageObject;
        this.h = str;
        this.f20058n = hashMap;
        this.f20059r = z10;
        this.f20060s = tLMethod;
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20053a = 2;
        this.f20054b = sendMessagesHelper;
        this.f20059r = z10;
        this.f20055c = tL_error;
        this.d = message;
        this.f20056e = tLObject;
        this.f20057f = messageObject;
        this.f20058n = hashMap;
        this.h = str;
        this.f20060s = tLObject2;
    }
}
