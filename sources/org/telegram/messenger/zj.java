package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class zj implements Runnable {
    public final int f20027a;
    public final Object f20028b;
    public final Object f20029c;
    public final Object d;
    public final Object f20030e;
    public final Object f20031f;
    public final Object h;
    public final Object f20032n;
    public final boolean f20033r;
    public final Object f20034s;

    public zj(Object obj, Object obj2, org.telegram.ui.ActionBar.f1 f1Var, org.telegram.ui.ActionBar.f1 f1Var2, org.telegram.ui.ActionBar.f1 f1Var3, org.telegram.ui.ActionBar.f1 f1Var4, boolean z10, org.telegram.ui.ActionBar.f1 f1Var5, org.telegram.ui.ActionBar.f1 f1Var6, int i10) {
        this.f20027a = i10;
        this.f20028b = obj;
        this.f20029c = obj2;
        this.d = f1Var;
        this.f20030e = f1Var2;
        this.f20031f = f1Var3;
        this.h = f1Var4;
        this.f20033r = z10;
        this.f20032n = f1Var5;
        this.f20034s = f1Var6;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f20027a) {
            case 0:
                ((SendMessagesHelper) this.f20028b).lambda$performSendMessageRequest$89((TLRPC.TL_error) this.f20029c, (TLRPC.Message) this.d, (TLObject) this.f20030e, (MessageObject) this.f20031f, (String) this.h, (HashMap) this.f20032n, this.f20033r, (TLRPC.TL_messages_addPollAnswer) this.f20034s);
                return;
            case 1:
                ((SendMessagesHelper) this.f20028b).lambda$performSendMessageRequest$92((TLRPC.TL_error) this.f20029c, (TLRPC.Message) this.d, (TLObject) this.f20030e, (MessageObject) this.f20031f, (String) this.h, (HashMap) this.f20032n, this.f20033r, (TLRPC.TL_messages_editMessage) this.f20034s);
                return;
            case 2:
                ((SendMessagesHelper) this.f20028b).lambda$performSendMessageRequest$103(this.f20033r, (TLRPC.TL_error) this.f20029c, (TLRPC.Message) this.d, (TLObject) this.f20030e, (MessageObject) this.f20031f, (HashMap) this.f20032n, (String) this.h, (TLObject) this.f20034s);
                return;
            case 3:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f20028b;
                yh.e5 e5Var = (yh.e5) this.f20029c;
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var3 = (org.telegram.ui.ActionBar.f1) this.f20030e;
                org.telegram.ui.ActionBar.f1 f1Var4 = (org.telegram.ui.ActionBar.f1) this.f20031f;
                org.telegram.ui.ActionBar.f1 f1Var5 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var6 = (org.telegram.ui.ActionBar.f1) this.f20032n;
                org.telegram.ui.ActionBar.f1 f1Var7 = (org.telegram.ui.ActionBar.f1) this.f20034s;
                if (f1Var != null) {
                    if (e5Var.f52480e) {
                        i10 = R.string.Gift2FilterSortByValue;
                    } else {
                        i10 = R.string.Gift2FilterSortByDate;
                    }
                    String string = LocaleController.getString(i10);
                    if (e5Var.f52480e) {
                        i11 = R.drawable.menu_sort_value;
                    } else {
                        i11 = R.drawable.menu_sort_date;
                    }
                    f1Var.g(string, i11, null);
                }
                f1Var2.setChecked(TLObject.hasFlag(e5Var.f52482g, 1));
                f1Var3.setChecked(TLObject.hasFlag(e5Var.f52482g, 2));
                f1Var4.setChecked(TLObject.hasFlag(e5Var.f52482g, 4));
                f1Var5.setChecked(TLObject.hasFlag(e5Var.f52482g, 8));
                if (this.f20033r) {
                    f1Var6.setChecked(TLObject.hasFlag(e5Var.f52482g, 256));
                    f1Var7.setChecked(TLObject.hasFlag(e5Var.f52482g, 512));
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.f1 f1Var8 = (org.telegram.ui.ActionBar.f1) this.f20029c;
                org.telegram.ui.ActionBar.f1 f1Var9 = (org.telegram.ui.ActionBar.f1) this.d;
                org.telegram.ui.ActionBar.f1 f1Var10 = (org.telegram.ui.ActionBar.f1) this.f20030e;
                org.telegram.ui.ActionBar.f1 f1Var11 = (org.telegram.ui.ActionBar.f1) this.f20031f;
                org.telegram.ui.ActionBar.f1 f1Var12 = (org.telegram.ui.ActionBar.f1) this.h;
                org.telegram.ui.ActionBar.f1 f1Var13 = (org.telegram.ui.ActionBar.f1) this.f20032n;
                org.telegram.ui.ActionBar.f1 f1Var14 = (org.telegram.ui.ActionBar.f1) this.f20034s;
                yh.e5 e5Var2 = ((xh.j4) this.f20028b).f51365c.Y;
                if (e5Var2.f52480e) {
                    i12 = R.string.Gift2FilterSortByValue;
                } else {
                    i12 = R.string.Gift2FilterSortByDate;
                }
                String string2 = LocaleController.getString(i12);
                if (e5Var2.f52480e) {
                    i13 = R.drawable.menu_sort_value;
                } else {
                    i13 = R.drawable.menu_sort_date;
                }
                f1Var8.g(string2, i13, null);
                f1Var9.setChecked(TLObject.hasFlag(e5Var2.f52482g, 1));
                f1Var10.setChecked(TLObject.hasFlag(e5Var2.f52482g, 2));
                f1Var11.setChecked(TLObject.hasFlag(e5Var2.f52482g, 4));
                f1Var12.setChecked(TLObject.hasFlag(e5Var2.f52482g, 8));
                if (this.f20033r) {
                    f1Var13.setChecked(TLObject.hasFlag(e5Var2.f52482g, 256));
                    f1Var14.setChecked(TLObject.hasFlag(e5Var2.f52482g, 512));
                    return;
                }
                return;
        }
    }

    public zj(SendMessagesHelper sendMessagesHelper, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, String str, HashMap hashMap, boolean z10, TLMethod tLMethod, int i10) {
        this.f20027a = i10;
        this.f20028b = sendMessagesHelper;
        this.f20029c = tL_error;
        this.d = message;
        this.f20030e = tLObject;
        this.f20031f = messageObject;
        this.h = str;
        this.f20032n = hashMap;
        this.f20033r = z10;
        this.f20034s = tLMethod;
    }

    public zj(SendMessagesHelper sendMessagesHelper, boolean z10, TLRPC.TL_error tL_error, TLRPC.Message message, TLObject tLObject, MessageObject messageObject, HashMap hashMap, String str, TLObject tLObject2) {
        this.f20027a = 2;
        this.f20028b = sendMessagesHelper;
        this.f20033r = z10;
        this.f20029c = tL_error;
        this.d = message;
        this.f20030e = tLObject;
        this.f20031f = messageObject;
        this.f20032n = hashMap;
        this.h = str;
        this.f20034s = tLObject2;
    }
}
