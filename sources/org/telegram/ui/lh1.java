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
public final class lh1 extends org.telegram.ui.Components.bl0 {
    public final Context f35769c;
    public final tf.j1 f35770f;
    public Runnable h;
    public boolean f35771n;
    public final int f35773s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f35772r = new ArrayList();

    public lh1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z4;
        boolean z10;
        this.v = usersSelectActivity;
        this.f35769c = context;
        if (usersSelectActivity.C) {
            this.f35773s = 0;
        } else {
            int i10 = usersSelectActivity.f32369x;
            if (i10 == 2) {
                this.f35773s = (!usersSelectActivity.E ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.F) {
                    this.f35773s = 7;
                } else {
                    this.f35773s = 5;
                }
            } else {
                this.f35773s = 0;
            }
        }
        int i11 = usersSelectActivity.f32369x;
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
            if (!DialogObject.isEncryptedDialog(dialog.f19163id)) {
                if (DialogObject.isUserDialog(dialog.f19163id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f19163id));
                    if (user != null && ((usersSelectActivity.D || !UserObject.isUserSelf(user)) && (!user.bot || z4))) {
                        this.f35772r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z11 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f19163id));
                    if (z10 && chat != null) {
                        this.f35772r.add(chat);
                    }
                }
            }
        }
        if (!z11 && usersSelectActivity.D) {
            this.f35772r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        tf.j1 j1Var = new tf.j1(false);
        this.f35770f = j1Var;
        j1Var.f44831p = false;
        j1Var.f44819a = new kl0(this, 25);
    }

    @Override
    public final void A(f2.l1 l1Var) {
        View view = l1Var.f5774a;
        if (view instanceof org.telegram.ui.Cells.f4) {
            ((org.telegram.ui.Cells.f4) view).f21019a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        if (l1Var.f5777f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.rl0 rl0Var, float f10, int[] iArr) {
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
        int i10 = this.v.f32369x;
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
            this.f35770f.f(null, null);
            this.f35770f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        kh1 kh1Var = new kh1(this, str, z10, z4, 0);
        this.h = kh1Var;
        dispatchQueue.postRunnable(kh1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f35771n) {
            int size = this.d.size();
            tf.j1 j1Var = this.f35770f;
            return j1Var.e.size() + j1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.C) {
            int i11 = usersSelectActivity.f32369x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.E ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.F ? 7 : 5;
            }
        }
        return this.f35772r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f35771n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.C ? !((i11 = usersSelectActivity.f32369x) != 2 ? i11 != 0 || (!usersSelectActivity.F ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.E ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.l1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.lh1.v(f2.l1, int):void");
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View f4Var;
        Context context = this.f35769c;
        if (i10 != 1) {
            f4Var = new org.telegram.ui.Cells.t3(context, null);
        } else {
            f4Var = new org.telegram.ui.Cells.f4(context, 1, 0, true);
        }
        return new f2.l1(f4Var);
    }
}
