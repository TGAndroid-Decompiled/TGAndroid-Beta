package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class ei1 extends org.telegram.ui.Components.ul0 {
    public final Context f35309c;
    public final hg.a2 f35310f;
    public Runnable h;
    public boolean f35311n;
    public final int f35313s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f35312r = new ArrayList();

    public ei1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f35309c = context;
        if (usersSelectActivity.F) {
            this.f35313s = 0;
        } else {
            int i10 = usersSelectActivity.f32609x;
            if (i10 == 2) {
                this.f35313s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f35313s = 7;
                } else {
                    this.f35313s = 5;
                }
            } else {
                this.f35313s = 0;
            }
        }
        int i11 = usersSelectActivity.f32609x;
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i11 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        int i12 = 0;
        boolean z12 = false;
        while (i12 < size) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.f18920id)) {
                if (DialogObject.isUserDialog(dialog.f18920id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f18920id));
                    if (user != null && ((usersSelectActivity.G || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f35312r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f18920id));
                    if (z11 && chat != null) {
                        this.f35312r.add(chat);
                    }
                }
            }
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.f35312r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        hg.a2 a2Var = new hg.a2(false);
        this.f35310f = a2Var;
        a2Var.f10500p = false;
        a2Var.f10488a = new lq0(this, 24);
    }

    @Override
    public final void A(s4.b1 b1Var) {
        View view = b1Var.f44838a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f20912a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = (int) (h() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.f32609x;
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i10 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            this.f35310f.f(null, null);
            this.f35310f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        di1 di1Var = new di1(this, str, z11, z10, 0);
        this.h = di1Var;
        dispatchQueue.postRunnable(di1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f35311n) {
            int size = this.d.size();
            hg.a2 a2Var = this.f35310f;
            return a2Var.e.size() + a2Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f32609x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f35312r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f35311n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f32609x) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(s4.b1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ei1.v(s4.b1, int):void");
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        Context context = this.f35309c;
        if (i10 != 1) {
            g4Var = new org.telegram.ui.Cells.v3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(1, 0, context, true);
        }
        return new s4.b1(g4Var);
    }
}
