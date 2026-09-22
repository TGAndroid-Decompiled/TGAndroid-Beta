package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class ts extends m61 {
    public final int N;
    public final int O;
    public final ArrayList P;
    public final ArrayList Q;
    public final ArrayList R;
    public final ArrayList S;
    public boolean T;
    public boolean U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;
    public int f28528a0;
    public String f28529b0;
    public final xp f28530c0;

    public ts(yl0 yl0Var, Context context, int i10, int i11) {
        super(yl0Var, context, i10, 0, false, null, null);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.V = new ArrayList();
        io0 io0Var = (io0) this;
        this.f28530c0 = new xp(io0Var, 6);
        this.f26343s = new d(io0Var, 9);
        this.N = i10;
        this.O = i11;
        N(false);
    }

    public final void V(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ts.V(boolean):void");
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.N;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        int size = allDialogs.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            i11++;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f18347id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.V;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
