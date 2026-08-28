package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class js extends z41 {
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
    public final np Y;

    public js(wk0 wk0Var, Context context, int i9, int i10) {
        super(wk0Var, context, i9, 0, false, null, null);
        this.L = new ArrayList();
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.R = new ArrayList();
        cn0 cn0Var = (cn0) this;
        this.Y = new np(cn0Var, 6);
        this.f35189s = new d(cn0Var, 9);
        this.J = i9;
        this.K = i10;
        N(false);
    }

    public final void V(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.js.V(boolean):void");
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i9 = this.J;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i9).getAllDialogs();
        int size = allDialogs.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            i10++;
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-dialog.f22384id));
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
