package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public abstract class et extends k71 {
    public final int P;
    public final int Q;
    public final ArrayList R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public boolean V;
    public boolean W;
    public final ArrayList X;
    public boolean Y;
    public boolean Z;
    public boolean f27922a0;
    public int f27923b0;
    public int f27924c0;
    public String f27925d0;
    public final cp f27926e0;

    public et(nm0 nm0Var, Context context, int i10, int i11) {
        super(nm0Var, context, i10, 0, false, null, null);
        this.R = new ArrayList();
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.X = new ArrayList();
        zo0 zo0Var = (zo0) this;
        this.f27926e0 = new cp(zo0Var, 8);
        this.v = new d(zo0Var, 9);
        this.P = i10;
        this.Q = i11;
        O(false);
    }

    public final void W(boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.et.W(boolean):void");
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i10 = this.P;
        ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i10).getAllDialogs();
        int size = allDialogs.size();
        int i11 = 0;
        while (i11 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            i11++;
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-dialog.f22032id));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat) && ChatObject.isPublic(chat) && !ChatObject.isNotInChat(chat)) {
                arrayList.add(chat);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.X;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
    }
}
