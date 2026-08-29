package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class ns extends k51 {
    public final int J;
    public final int K;
    public final ArrayList L;
    public final ArrayList M;
    public final ArrayList N;
    public final ArrayList O;
    public boolean P;
    public boolean Q;
    public final ArrayList R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public String X;
    public final rp Y;

    public ns(jl0 jl0Var, Context context, int i10, int i11) {
        super(jl0Var, context, i10, 0, false, null, null);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.R = new ArrayList();
        on0 on0Var = (on0) this;
        this.Y = new rp(on0Var, 6);
        this.f29940s = new d(on0Var, 9);
        this.J = i10;
        this.K = i11;
        N(false);
    }

    public final void V(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ns.V(boolean):void");
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.J;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        int size = allDialogs.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            i11++;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22396id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.R;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
