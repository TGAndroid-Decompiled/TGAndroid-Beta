package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class ts extends l61 {
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
    public int f28477a0;
    public String f28478b0;
    public final xp f28479c0;

    public ts(wl0 wl0Var, Context context, int i10, int i11) {
        super(wl0Var, context, i10, 0, false, null, null);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.V = new ArrayList();
        go0 go0Var = (go0) this;
        this.f28479c0 = new xp(go0Var, 6);
        this.f26043s = new d(go0Var, 9);
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
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f18300id));
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
