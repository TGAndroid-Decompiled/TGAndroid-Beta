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
public final class dh1 extends org.telegram.ui.Components.cl0 {
    public final Context f33643c;
    public final tf.k1 f33644f;
    public Runnable h;
    public boolean f33645n;
    public final int f33647s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f33646r = new ArrayList();

    public dh1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z4;
        boolean z10;
        this.v = usersSelectActivity;
        this.f33643c = context;
        if (usersSelectActivity.C) {
            this.f33647s = 0;
        } else {
            int i10 = usersSelectActivity.f32395x;
            if (i10 == 2) {
                this.f33647s = (!usersSelectActivity.E ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.F) {
                    this.f33647s = 7;
                } else {
                    this.f33647s = 5;
                }
            } else {
                this.f33647s = 0;
            }
        }
        int i11 = usersSelectActivity.f32395x;
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
            if (!DialogObject.isEncryptedDialog(dialog.f19188id)) {
                if (DialogObject.isUserDialog(dialog.f19188id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f19188id));
                    if (user != null && ((usersSelectActivity.D || !UserObject.isUserSelf(user)) && (!user.bot || z4))) {
                        this.f33646r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z11 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f19188id));
                    if (z10 && chat != null) {
                        this.f33646r.add(chat);
                    }
                }
            }
        }
        if (!z11 && usersSelectActivity.D) {
            this.f33646r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        tf.k1 k1Var = new tf.k1(false);
        this.f33644f = k1Var;
        k1Var.f44781p = false;
        k1Var.f44769a = new il0(this, 25);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5785a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f21088a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5788f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.sl0 sl0Var, float f10, int[] iArr) {
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
        int i10 = this.v.f32395x;
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
            this.e.clear();
            this.f33644f.f(null, null);
            this.f33644f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        ch1 ch1Var = new ch1(this, str, z10, z4, 0);
        this.h = ch1Var;
        dispatchQueue.postRunnable(ch1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f33645n) {
            int size = this.d.size();
            tf.k1 k1Var = this.f33644f;
            return k1Var.e.size() + k1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.C) {
            int i11 = usersSelectActivity.f32395x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.E ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.F ? 7 : 5;
            }
        }
        return this.f33646r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f33645n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.C ? !((i11 = usersSelectActivity.f32395x) != 2 ? i11 != 0 || (!usersSelectActivity.F ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.E ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.dh1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        Context context = this.f33643c;
        if (i10 != 1) {
            g4Var = new org.telegram.ui.Cells.u3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(context, 1, 0, true);
        }
        return new f2.l1(g4Var);
    }
}
