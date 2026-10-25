package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class qg1 extends org.telegram.ui.Components.tl0 {
    public final Context f42832c;
    public final ig.a2 f42833f;
    public Runnable h;
    public boolean f42834n;
    public final int f42836s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f42835r = new ArrayList();

    public qg1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f42832c = context;
        if (usersSelectActivity.F) {
            this.f42836s = 0;
        } else {
            int i10 = usersSelectActivity.f36327x;
            if (i10 == 2) {
                this.f42836s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f42836s = 7;
                } else {
                    this.f42836s = 5;
                }
            } else {
                this.f42836s = 0;
            }
        }
        int i11 = usersSelectActivity.f36327x;
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
            if (!DialogObject.isEncryptedDialog(dialog.f22031id)) {
                if (DialogObject.isUserDialog(dialog.f22031id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f22031id));
                    if (user != null && ((usersSelectActivity.G || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f42835r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f22031id));
                    if (z11 && chat != null) {
                        this.f42835r.add(chat);
                    }
                }
            }
            i12++;
            z12 = z12;
        }
        if (!z12 && usersSelectActivity.G) {
            this.f42835r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        ig.a2 a2Var = new ig.a2(false);
        this.f42833f = a2Var;
        a2Var.f14000p = false;
        a2Var.f13988a = new hl0(this, 25);
    }

    @Override
    public final void A(s4.e1 e1Var) {
        View view = e1Var.f47735a;
        if (view instanceof org.telegram.ui.Cells.k4) {
            ((org.telegram.ui.Cells.k4) view).f24319a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47738f == 1) {
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
        int i10 = this.v.f36327x;
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
            this.f42833f.f(null, null);
            this.f42833f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
        pg1 pg1Var = new pg1(this, str, z11, z10, 0);
        this.h = pg1Var;
        dispatchQueue2.postRunnable(pg1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f42834n) {
            int size = this.d.size();
            ig.a2 a2Var = this.f42833f;
            return a2Var.e.size() + a2Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f36327x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f42835r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f42834n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f36327x) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(s4.e1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qg1.v(s4.e1, int):void");
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View k4Var;
        Context context = this.f42832c;
        if (i10 != 1) {
            k4Var = new org.telegram.ui.Cells.z3(context, null);
        } else {
            k4Var = new org.telegram.ui.Cells.k4(context, 1, 0, true);
        }
        return new s4.e1(k4Var);
    }
}
