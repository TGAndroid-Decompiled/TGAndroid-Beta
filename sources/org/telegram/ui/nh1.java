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
public final class nh1 extends org.telegram.ui.Components.gl0 {
    public final Context f38978c;
    public final gg.c2 f38980f;
    public Runnable h;
    public boolean f38981n;
    public final int f38983s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList f38979e = new ArrayList();
    public final ArrayList f38982r = new ArrayList();

    public nh1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f38978c = context;
        if (usersSelectActivity.F) {
            this.f38983s = 0;
        } else {
            int i10 = usersSelectActivity.f34611x;
            if (i10 == 2) {
                this.f38983s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f38983s = 7;
                } else {
                    this.f38983s = 5;
                }
            } else {
                this.f38983s = 0;
            }
        }
        int i11 = usersSelectActivity.f34611x;
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
        boolean z12 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.f20051id)) {
                if (DialogObject.isUserDialog(dialog.f20051id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f20051id));
                    if (user != null && ((usersSelectActivity.G || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f38982r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f20051id));
                    if (z11 && chat != null) {
                        this.f38982r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.G) {
            this.f38982r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        gg.c2 c2Var = new gg.c2(false);
        this.f38980f = c2Var;
        c2Var.f10545p = false;
        c2Var.f10532a = new jl0(this, 25);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f46538a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f22144a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46542f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.zl0 zl0Var, float f7, int[] iArr) {
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
        int i10 = this.v.f34611x;
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
            this.f38979e.clear();
            this.f38980f.f(null, null);
            this.f38980f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        mh1 mh1Var = new mh1(this, str, z11, z10, 0);
        this.h = mh1Var;
        dispatchQueue.postRunnable(mh1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f38981n) {
            int size = this.d.size();
            gg.c2 c2Var = this.f38980f;
            return c2Var.f10535e.size() + c2Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f34611x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f38982r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f38981n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f34611x) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nh1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        Context context = this.f38978c;
        if (i10 != 1) {
            g4Var = new org.telegram.ui.Cells.v3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(context, 1, 0, true);
        }
        return new s4.c1(g4Var);
    }
}
