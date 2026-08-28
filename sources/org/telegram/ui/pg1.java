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
public final class pg1 extends org.telegram.ui.Components.gk0 {
    public final Context f41516c;
    public final of.v1 f41518f;
    public Runnable h;
    public boolean f41519n;
    public final int f41521s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList f41517e = new ArrayList();
    public final ArrayList f41520r = new ArrayList();

    public pg1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f41516c = context;
        if (usersSelectActivity.B) {
            this.f41521s = 0;
        } else {
            int i9 = usersSelectActivity.f36294x;
            if (i9 == 2) {
                this.f41521s = (!usersSelectActivity.D ? 1 : 0) + 5;
            } else if (i9 == 0) {
                if (usersSelectActivity.E) {
                    this.f41521s = 7;
                } else {
                    this.f41521s = 5;
                }
            } else {
                this.f41521s = 0;
            }
        }
        int i10 = usersSelectActivity.f36294x;
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
        ArrayList<TLRPC.Dialog> allDialogs = usersSelectActivity.getMessagesController().getAllDialogs();
        int size = allDialogs.size();
        boolean z12 = false;
        for (int i11 = 0; i11 < size; i11++) {
            TLRPC.Dialog dialog = allDialogs.get(i11);
            if (!DialogObject.isEncryptedDialog(dialog.f22384id)) {
                if (DialogObject.isUserDialog(dialog.f22384id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f22384id));
                    if (user != null && ((usersSelectActivity.C || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f41520r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f22384id));
                    if (z11 && chat != null) {
                        this.f41520r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.C) {
            this.f41520r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        of.v1 v1Var = new of.v1(false);
        this.f41518f = v1Var;
        v1Var.f19537p = false;
        v1Var.f19524a = new dl0(this, 25);
    }

    @Override
    public final void A(f2.q1 q1Var) {
        View view = q1Var.f5501a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f24381a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (q1Var.f5505f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i9) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = (int) (h() * f10);
        iArr[1] = 0;
    }

    public final void L(String str) {
        boolean z10;
        boolean z11;
        if (this.h != null) {
            Utilities.searchQueue.cancelRunnable(this.h);
            this.h = null;
        }
        int i9 = this.v.f36294x;
        if (i9 != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (i9 != 2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (str == null) {
            this.d.clear();
            this.f41517e.clear();
            this.f41518f.f(null, null);
            this.f41518f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        og1 og1Var = new og1(this, str, z11, z10, 0);
        this.h = og1Var;
        dispatchQueue.postRunnable(og1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f41519n) {
            int size = this.d.size();
            of.v1 v1Var = this.f41518f;
            return v1Var.f19527e.size() + v1Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i9 = 0;
        if (!usersSelectActivity.B) {
            int i10 = usersSelectActivity.f36294x;
            if (i10 == 2) {
                i9 = (!usersSelectActivity.D ? 1 : 0) + 3;
            } else if (i10 == 0) {
                i9 = usersSelectActivity.E ? 7 : 5;
            }
        }
        return this.f41520r.size() + i9;
    }

    @Override
    public final int j(int i9) {
        int i10;
        if (!this.f41519n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.B ? !((i10 = usersSelectActivity.f36294x) != 2 ? i10 != 0 || (!usersSelectActivity.E ? !(i9 == 0 || i9 == 4) : !(i9 == 0 || i9 == 6)) : i9 != 0 && i9 != (!usersSelectActivity.D ? 1 : 0) + 4) : i9 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(f2.q1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pg1.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        View g4Var;
        Context context = this.f41516c;
        if (i9 != 1) {
            g4Var = new org.telegram.ui.Cells.v3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(context, 1, 0, true);
        }
        return new f2.q1(g4Var);
    }
}
