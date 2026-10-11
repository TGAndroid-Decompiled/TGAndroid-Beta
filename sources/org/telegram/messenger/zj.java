package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f20017a;
    public final Object f20018b;
    public final Object f20019c;
    public final Object d;
    public final Object f20020e;
    public final Object f20021f;
    public final Object h;
    public final Object f20022n;
    public final boolean f20023r;
    public final Object f20024s;

    public zj(Object obj, Object obj2, org.telegram.ui.ActionBar.e1 e1Var, org.telegram.ui.ActionBar.e1 e1Var2, org.telegram.ui.ActionBar.e1 e1Var3, org.telegram.ui.ActionBar.e1 e1Var4, boolean z10, org.telegram.ui.ActionBar.e1 e1Var5, org.telegram.ui.ActionBar.e1 e1Var6, int i10) {
        this.f20017a = i10;
        this.f20018b = obj;
        this.f20019c = obj2;
        this.d = e1Var;
        this.f20020e = e1Var2;
        this.f20021f = e1Var3;
        this.h = e1Var4;
        this.f20023r = z10;
        this.f20022n = e1Var5;
        this.f20024s = e1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20017a) {
            case 0:
                ((SendMessagesHelper) this.f20018b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20019c, (TLRPC.Message) this.d, (TLObject) this.f20020e, (MessageObject) this.f20021f, (String) this.h, (HashMap) this.f20022n, this.f20023r, (TLRPC.TL_messages_addPollAnswer) this.f20024s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20018b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20019c, (TLRPC.Message) this.d, (TLObject) this.f20020e, (MessageObject) this.f20021f, (String) this.h, (HashMap) this.f20022n, this.f20023r, (TLRPC.TL_messages_editMessage) this.f20024s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20018b).lambda$performSendMessageRequest$103(this.f20023r, (TLRPC.TL_error) this.f20019c, (TLRPC.Message) this.d, (TLObject) this.f20020e, (MessageObject) this.f20021f, (HashMap) this.f20022n, (String) this.h, (TLObject) this.f20024s);
                return;
            case 3:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.f20018b;
                yh.f5 f5Var = (yh.f5) this.f20019c;
                org.telegram.ui.ActionBar.e1 e1Var2 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var3 = (org.telegram.ui.ActionBar.e1) this.f20020e;
                org.telegram.ui.ActionBar.e1 e1Var4 = (org.telegram.ui.ActionBar.e1) this.f20021f;
                org.telegram.ui.ActionBar.e1 e1Var5 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var6 = (org.telegram.ui.ActionBar.e1) this.f20022n;
                org.telegram.ui.ActionBar.e1 e1Var7 = (org.telegram.ui.ActionBar.e1) this.f20024s;
                if (e1Var != null) {
                    if (f5Var.f52600e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (f5Var.f52600e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    e1Var.g(string, i11, null);
                }
                e1Var2.setChecked(TLObject.hasFlag(f5Var.f52602g, 1));
                e1Var3.setChecked(TLObject.hasFlag(f5Var.f52602g, 2));
                e1Var4.setChecked(TLObject.hasFlag(f5Var.f52602g, 4));
                e1Var5.setChecked(TLObject.hasFlag(f5Var.f52602g, 8));
                if (this.f20023r) {
                    e1Var6.setChecked(TLObject.hasFlag(f5Var.f52602g, 256));
                    e1Var7.setChecked(TLObject.hasFlag(f5Var.f52602g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e1 e1Var8 = (org.telegram.ui.ActionBar.e1) this.f20019c;
                org.telegram.ui.ActionBar.e1 e1Var9 = (org.telegram.ui.ActionBar.e1) this.d;
                org.telegram.ui.ActionBar.e1 e1Var10 = (org.telegram.ui.ActionBar.e1) this.f20020e;
                org.telegram.ui.ActionBar.e1 e1Var11 = (org.telegram.ui.ActionBar.e1) this.f20021f;
                org.telegram.ui.ActionBar.e1 e1Var12 = (org.telegram.ui.ActionBar.e1) this.h;
                org.telegram.ui.ActionBar.e1 e1Var13 = (org.telegram.ui.ActionBar.e1) this.f20022n;
                org.telegram.ui.ActionBar.e1 e1Var14 = (org.telegram.ui.ActionBar.e1) this.f20024s;
                yh.f5 f5Var2 = ((xh.j4) this.f20018b).f51408c.Y;
                if (f5Var2.f52600e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (f5Var2.f52600e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                e1Var8.g(string2, i13, null);
                e1Var9.setChecked(TLObject.hasFlag(f5Var2.f52602g, 1));
                e1Var10.setChecked(TLObject.hasFlag(f5Var2.f52602g, 2));
                e1Var11.setChecked(TLObject.hasFlag(f5Var2.f52602g, 4));
                e1Var12.setChecked(TLObject.hasFlag(f5Var2.f52602g, 8));
                if (this.f20023r) {
                    e1Var13.setChecked(TLObject.hasFlag(f5Var2.f52602g, 256));
                    e1Var14.setChecked(TLObject.hasFlag(f5Var2.f52602g, 512));
                    return;
                }
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20017a = i10;
        this.f20018b = sendMessagesHelper;
        this.f20019c = tL_error;
        this.d = message;
        this.f20020e = tLObject;
        this.f20021f = messageObject;
        this.h = str;
        this.f20022n = hashMap;
        this.f20023r = z10;
        this.f20024s = tLMethod;
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20017a = 2;
        this.f20018b = sendMessagesHelper;
        this.f20023r = z10;
        this.f20019c = tL_error;
        this.d = message;
        this.f20020e = tLObject;
        this.f20021f = messageObject;
        this.f20022n = hashMap;
        this.h = str;
        this.f20024s = tLObject2;
    }
}
