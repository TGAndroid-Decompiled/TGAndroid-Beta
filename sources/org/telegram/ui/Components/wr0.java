package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class wr0 implements Runnable {
    public final int f34568a;
    public final bw0 f34569b;

    public wr0(bw0 bw0Var, int i10) {
        this.f34568a = i10;
        this.f34569b = bw0Var;
    }

    @Override
    public final void run() {
        switch (this.f34568a) {
            case 0:
                bw0 bw0Var = this.f34569b;
                bw0Var.f26963m2 = (int) bw0Var.R0.c(AndroidUtilities.dp(14.0f));
                if (bw0Var.f26925a0 != null) {
                    bw0Var.B1();
                }
                uu0[] uu0VarArr = bw0Var.m0;
                if (uu0VarArr != null) {
                    for (uu0 uu0Var : uu0VarArr) {
                        if (uu0Var != null) {
                            int paddingTop = uu0Var.h.getPaddingTop();
                            et0 et0Var = uu0Var.h;
                            int paddingLeft = et0Var.getPaddingLeft();
                            int g02 = bw0Var.g0(uu0Var.E);
                            int paddingRight = uu0Var.h.getPaddingRight();
                            et0 et0Var2 = uu0Var.h;
                            int f02 = bw0Var.f0(bw0Var.D0());
                            et0Var2.f33153i3 = f02;
                            et0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                            AndroidUtilities.doOnLayout(uu0Var.h, new fs0(uu0Var, paddingTop - uu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                bw0 bw0Var2 = this.f34569b;
                g5.R(bw0Var2.getContext(), bw0Var2.f26992x1, bw0Var2.H1, new xr0(bw0Var2));
                return;
            case 2:
                bw0 bw0Var3 = this.f34569b;
                bw0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -bw0Var3.f26943f1.f22029id);
                ua0 ua0Var = new ua0(bundle, null);
                ua0Var.f33325c = bw0Var3.f26943f1;
                bw0Var3.f26992x1.presentFragment(ua0Var);
                return;
            case 3:
                bw0 bw0Var4 = this.f34569b;
                org.telegram.ui.ActionBar.r2 r2Var = bw0Var4.f26992x1;
                fi.sb D = fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount());
                long j10 = bw0Var4.l1;
                String currentLang = bw0Var4.W.getCurrentLang();
                D.f11671v0 = j10;
                D.f11675w0 = currentLang;
                D.Q(null);
                D.f11671v0 = j10;
                D.f11675w0 = currentLang;
                return;
            case 4:
                this.f34569b.W.f();
                return;
            case 5:
                vs0 vs0Var = this.f34569b.W;
                if (vs0Var.d()) {
                    vs0Var.h();
                    return;
                } else {
                    vs0Var.f();
                    return;
                }
            case 6:
                vs0 vs0Var2 = this.f34569b.W;
                vs0Var2.b(vs0Var2.getCurrentLang());
                return;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f34569b.f26992x1;
                r2Var2.getMessagesController().setSavedViewAs(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", r2Var2.getUserConfig().getClientUserId());
                r2Var2.presentFragment(new org.telegram.ui.wn(bundle2), true);
                return;
            case 8:
                org.telegram.ui.ActionBar.r2 r2Var3 = this.f34569b.f26992x1;
                try {
                    r2Var3.getMediaDataController().installShortcut(r2Var3.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                bw0 bw0Var5 = this.f34569b;
                org.telegram.ui.ActionBar.r2 r2Var4 = bw0Var5.f26992x1;
                TLRPC.User currentUser = r2Var4.getUserConfig().getCurrentUser();
                g5.r(r2Var4, false, null, currentUser, false, true, false, true, new p1(25, bw0Var5, currentUser));
                return;
            case 10:
                ws0 ws0Var = this.f34569b.f26925a0;
                ws0Var.getClass();
                ws0Var.h(null, new zh.t1(ws0Var, 1));
                return;
            case 11:
                this.f34569b.f26925a0.setReordering(true);
                return;
            case 12:
                bw0 bw0Var6 = this.f34569b;
                bw0Var6.k1(false);
                org.telegram.ui.ActionBar.r5 r5Var = bw0Var6.H;
                if (r5Var != null) {
                    r5Var.f(true);
                } else {
                    bw0Var6.G.g(true);
                }
                bw0Var6.f26933c1 = 0;
                return;
            default:
                this.f34569b.t0();
                return;
        }
    }
}
