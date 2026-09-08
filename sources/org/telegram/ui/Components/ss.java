package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class ss extends v51 {
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
    public int f30432a0;
    public String f30433b0;
    public final wp f30434c0;

    public ss(ll0 ll0Var, Context context, int i10, int i11) {
        super(ll0Var, context, i10, 0, false, null, null);
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.V = new ArrayList();
        tn0 tn0Var = (tn0) this;
        this.f30434c0 = new wp(tn0Var, 6);
        this.f31163s = new d(tn0Var, 9);
        this.N = i10;
        this.O = i11;
        N(false);
    }

    public final void V(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ss.V(boolean):void");
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
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f19900id));
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
