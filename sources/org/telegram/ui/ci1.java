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
public final class ci1 extends org.telegram.ui.Components.dl0 {
    public final Context f31675c;
    public final fg.d2 f31676f;
    public Runnable h;
    public boolean f31677n;
    public final int f31679s;
    public final UsersSelectActivity v;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList f31678r = new ArrayList();

    public ci1(UsersSelectActivity usersSelectActivity, Context context) {
        boolean z10;
        boolean z11;
        this.v = usersSelectActivity;
        this.f31675c = context;
        if (usersSelectActivity.F) {
            this.f31679s = 0;
        } else {
            int i10 = usersSelectActivity.f30728x;
            if (i10 == 2) {
                this.f31679s = (!usersSelectActivity.H ? 1 : 0) + 5;
            } else if (i10 == 0) {
                if (usersSelectActivity.I) {
                    this.f31679s = 7;
                } else {
                    this.f31679s = 5;
                }
            } else {
                this.f31679s = 0;
            }
        }
        int i11 = usersSelectActivity.f30728x;
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
            if (!DialogObject.isEncryptedDialog(dialog.f17199id)) {
                if (DialogObject.isUserDialog(dialog.f17199id)) {
                    TLRPC.User user = usersSelectActivity.getMessagesController().getUser(Long.valueOf(dialog.f17199id));
                    if (user != null && ((usersSelectActivity.G || !UserObject.isUserSelf(user)) && (!user.bot || z10))) {
                        this.f31678r.add(user);
                        if (UserObject.isUserSelf(user)) {
                            z12 = true;
                        }
                    }
                } else {
                    TLRPC.Chat chat = usersSelectActivity.getMessagesController().getChat(Long.valueOf(-dialog.f17199id));
                    if (z11 && chat != null) {
                        this.f31678r.add(chat);
                    }
                }
            }
        }
        if (!z12 && usersSelectActivity.G) {
            this.f31678r.add(0, usersSelectActivity.getMessagesController().getUser(Long.valueOf(usersSelectActivity.getUserConfig().clientUserId)));
        }
        fg.d2 d2Var = new fg.d2(false);
        this.f31676f = d2Var;
        d2Var.f7991p = false;
        d2Var.f7979a = new ul0(this, 25);
    }

    @Override
    public final void A(s4.c1 c1Var) {
        View view = c1Var.f41610a;
        if (view instanceof org.telegram.ui.Cells.g4) {
            ((org.telegram.ui.Cells.g4) view).f19186a.getImageReceiver().cancelLoadImage();
        }
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f41613f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final String F(int i10) {
        return null;
    }

    @Override
    public final void G(org.telegram.ui.Components.vl0 vl0Var, float f7, int[] iArr) {
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
        int i10 = this.v.f30728x;
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
            this.f31676f.f(null, null);
            this.f31676f.g(null, true, false, false, false, 0L, false, 0, 0);
            l();
            return;
        }
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        bi1 bi1Var = new bi1(this, str, z11, z10, 0);
        this.h = bi1Var;
        dispatchQueue.postRunnable(bi1Var, 300L);
    }

    @Override
    public final int h() {
        if (this.f31677n) {
            int size = this.d.size();
            fg.d2 d2Var = this.f31676f;
            return d2Var.e.size() + d2Var.d.size() + size;
        }
        UsersSelectActivity usersSelectActivity = this.v;
        int i10 = 0;
        if (!usersSelectActivity.F) {
            int i11 = usersSelectActivity.f30728x;
            if (i11 == 2) {
                i10 = (!usersSelectActivity.H ? 1 : 0) + 3;
            } else if (i11 == 0) {
                i10 = usersSelectActivity.I ? 7 : 5;
            }
        }
        return this.f31678r.size() + i10;
    }

    @Override
    public final int j(int i10) {
        int i11;
        if (!this.f31677n) {
            UsersSelectActivity usersSelectActivity = this.v;
            if (!usersSelectActivity.F ? !((i11 = usersSelectActivity.f30728x) != 2 ? i11 != 0 || (!usersSelectActivity.I ? !(i10 == 0 || i10 == 4) : !(i10 == 0 || i10 == 6)) : i10 != 0 && i10 != (!usersSelectActivity.H ? 1 : 0) + 4) : i10 == 0) {
                return 2;
            }
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ci1.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View g4Var;
        Context context = this.f31675c;
        if (i10 != 1) {
            g4Var = new org.telegram.ui.Cells.u3(context, null);
        } else {
            g4Var = new org.telegram.ui.Cells.g4(context, 1, 0, true);
        }
        return new s4.c1(g4Var);
    }
}
