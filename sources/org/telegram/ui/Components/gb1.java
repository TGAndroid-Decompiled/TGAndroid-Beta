package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gb1 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public boolean E;
    public final String f28511a;
    public final int f28512b;
    public final long f28513c;
    public final int d;
    public final int e;
    public final int f28514f;
    public final byte[] f28515g;
    public final boolean h;
    public final boolean f28516i;
    public final boolean f28517j;
    public final boolean f28518k;
    public final long f28519l;
    public final String f28520m;
    public String f28521n;
    public String f28522o;
    public long f28523p;
    public TLRPC.TL_messageMediaWidget f28524q;
    public String f28525r;
    public nb1 f28526s;
    public bn0 f28527t;
    public bn0 v;
    public int f28529w;
    public long f28530x;
    public boolean f28531y;
    public boolean f28532z;
    public final ArrayList f28528u = new ArrayList();
    public final t51 F = new t51(this, 11);

    public gb1(String str, int i10, long j10, int i11, TLRPC.TL_messageMediaWidget tL_messageMediaWidget, boolean z10) {
        boolean z11;
        boolean z12;
        this.f28511a = str;
        this.f28512b = i10;
        this.f28513c = j10;
        this.d = i11;
        boolean z13 = false;
        this.e = Math.max(0, tL_messageMediaWidget.width);
        this.f28514f = Math.max(0, tL_messageMediaWidget.height);
        this.f28515g = tL_messageMediaWidget.payload;
        this.f28518k = z10;
        if (!z10 && tL_messageMediaWidget.is_copy) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.h = z11;
        if (!z10 && tL_messageMediaWidget.can_query) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f28516i = z12;
        if (!z10 && tL_messageMediaWidget.background_query) {
            z13 = true;
        }
        this.f28517j = z13;
        this.f28519l = tL_messageMediaWidget.widget_id;
        String str2 = null;
        if (!z10 && !z11) {
            if (DialogObject.isUserDialog(j10)) {
                str2 = "private";
            } else {
                TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                if (chat != null) {
                    str2 = !ChatObject.isChannel(chat) ? "group" : chat.megagroup ? "supergroup" : "channel";
                }
            }
        }
        this.f28520m = str2;
        this.f28524q = tL_messageMediaWidget;
        this.f28521n = jb1.w(tL_messageMediaWidget.chat_data);
        this.f28522o = jb1.w(tL_messageMediaWidget.public_data);
        this.f28523p = tL_messageMediaWidget.public_data_hash;
    }

    public final String a() {
        return this.f28512b + "/" + this.f28513c + "/" + this.d;
    }
}
