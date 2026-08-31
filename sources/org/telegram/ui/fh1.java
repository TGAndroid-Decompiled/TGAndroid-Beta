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
public final class fh1 extends org.telegram.ui.Components.dl0 {
    public final Context f36886c;
    public final uf.k1 f36888f;
    public Runnable h;
    public boolean f36889n;
    public final int f36891s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList f36887e = new ArrayList();
    public final ArrayList f36890r = new ArrayList();

    public fh1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z4;
        boolean z10;
        this.v = usersSelectActivity;
        this.f36886c = context;
        if (usersSelectActivity.C) {
            this.f36891s = 0;
        } else {
            int i10 = usersSelectActivity.f34939x;
            if (i10 == 2) {
                this.f36891s = (!usersSelectActivity.E ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.F) {
                    this.f36891s = 7;
                } else {
                    this.f36891s = 5;
                }
            } else {
                this.f36891s = 0;
            }
        }
        int i11 = usersSelectActivity.f34939x;
        if (i11 != 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i11 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            TLRPC.Dialog dialog = allDialogs.get(i12);
            if (!DialogObject.isEncryptedDialog(dialog.f20847id)) {
                if (DialogObject.isUserDialog(dialog.f20847id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f20847id));
                    if (user != null && ((usersSelectActivity.D || !UserObject.isUserSelf(user)) && (!user.bot || z4))) {
                        this.f36890r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z11 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f20847id));
                    if (z10 && chat != null) {
                        this.f36890r.add(chat);
                    }
                }
            }
        }
        if (!z11 && usersSelectActivity.D) {
            this.f36890r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        uf.k1 k1Var = new uf.k1(false);
        this.f36888f = k1Var;
        k1Var.f48631p = false;
        k1Var.f48618a = new kl0(this, 25);
    }

    @Override
    public final void A(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f22836a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.tl0 tl0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z4;
        boolean z10;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i10 = this.v.f34939x;
        if (i10 != 2) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i10 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (str == null) {
            this.d.clear();
            this.f36887e.clear();
            this.f36888f.f(null, null);
            this.f36888f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        eh1 eh1Var = new eh1(this, str, z10, z4, 0);
        this.h = eh1Var;
        dispatchQueue.postRunnable(eh1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f36889n) {
            int size = this.d.size();
            uf.k1 k1Var = this.f36888f;
            return k1Var.f48621e.size() + k1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.C) {
            int i11 = usersSelectActivity.f34939x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.E ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.F ? 7 : 5;
            }
        }
        return this.f36890r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f36889n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.C ? !((i11 = usersSelectActivity.f34939x) != 2 ? i11 != 0 || (!usersSelectActivity.F ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.E ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.m1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fh1.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        Context context = this.f36886c;
        if (i10 != 1) {
            g4Var = new org.telegram.ui.Cells.u3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(context, 1, 0, true);
        }
        return new f2.m1(g4Var);
    }
}
