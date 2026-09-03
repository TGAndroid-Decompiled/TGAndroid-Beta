package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class qs extends w51 {
    public final int K;
    public final int L;
    public final ArrayList M;
    public final ArrayList N;
    public final ArrayList O;
    public final ArrayList P;
    public boolean Q;
    public boolean R;
    public final ArrayList S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public int X;
    public String Y;
    public final up Z;

    public qs(rl0 rl0Var, Context context, int i10, int i11) {
        super(rl0Var, context, i10, 0, false, null, null);
        this.M = new ArrayList();
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.S = new ArrayList();
        xn0 xn0Var = (xn0) this;
        this.Z = new up(xn0Var, 6);
        this.f30149s = new d(xn0Var, 9);
        this.K = i10;
        this.L = i11;
        N(false);
    }

    public final void V(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qs.V(boolean):void");
    }

    public final void W() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.K;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        int size = allDialogs.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            i11++;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f19163id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.S;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
