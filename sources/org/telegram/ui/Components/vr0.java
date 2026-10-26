package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements Runnable {
    public final int f34252a;
    public final aw0 f34253b;

    public vr0(aw0 aw0Var, int i10) {
        this.f34252a = i10;
        this.f34253b = aw0Var;
    }

    @Override
    public final void run() {
        switch (this.f34252a) {
            case 0:
                aw0 aw0Var = this.f34253b;
                aw0Var.f26675m2 = (int) aw0Var.R0.c(AndroidUtilities.dp(14.0f));
                if (aw0Var.f26637a0 != null) {
                    aw0Var.B1();
                }
                tu0[] tu0VarArr = aw0Var.m0;
                if (tu0VarArr != null) {
                    for (tu0 tu0Var : tu0VarArr) {
                        if (tu0Var != null) {
                            int paddingTop = tu0Var.h.getPaddingTop();
                            dt0 dt0Var = tu0Var.h;
                            int paddingLeft = dt0Var.getPaddingLeft();
                            int g02 = aw0Var.g0(tu0Var.E);
                            int paddingRight = tu0Var.h.getPaddingRight();
                            dt0 dt0Var2 = tu0Var.h;
                            int f02 = aw0Var.f0(aw0Var.D0());
                            dt0Var2.f32685i3 = f02;
                            dt0Var.setPadding(paddingLeft, g02, paddingRight, f02);
                            AndroidUtilities.doOnLayout(tu0Var.h, new es0(tu0Var, paddingTop - tu0Var.h.getPaddingTop(), 0));
                        }
                    }
                    return;
                }
                return;
            case 1:
                aw0 aw0Var2 = this.f34253b;
                g5.R(aw0Var2.getContext(), aw0Var2.f26704x1, aw0Var2.H1, new wr0(aw0Var2));
                return;
            case 2:
                aw0 aw0Var3 = this.f34253b;
                aw0Var3.getClass();
                Bundle bundle = new Bundle();
                bundle.putInt("type", 2);
                bundle.putLong("dialog_id", -aw0Var3.f26655f1.f22028id);
                ta0 ta0Var = new ta0(bundle, null);
                ta0Var.f32952c = aw0Var3.f26655f1;
                aw0Var3.f26704x1.presentFragment(ta0Var);
                return;
            case 3:
                aw0 aw0Var4 = this.f34253b;
                org.telegram.ui.ActionBar.r2 r2Var = aw0Var4.f26704x1;
                fi.sb D = fi.sb.D(r2Var.getParentActivity(), r2Var.getCurrentAccount());
                long j10 = aw0Var4.l1;
                String currentLang = aw0Var4.W.getCurrentLang();
                D.f11672v0 = j10;
                D.f11676w0 = currentLang;
                D.Q(null);
                D.f11672v0 = j10;
                D.f11676w0 = currentLang;
                return;
            case 4:
                this.f34253b.W.f();
                return;
            case 5:
                us0 us0Var = this.f34253b.W;
                if (us0Var.d()) {
                    us0Var.h();
                    return;
                } else {
                    us0Var.f();
                    return;
                }
            case 6:
                us0 us0Var2 = this.f34253b.W;
                us0Var2.b(us0Var2.getCurrentLang());
                return;
            case 7:
                org.telegram.ui.ActionBar.r2 r2Var2 = this.f34253b.f26704x1;
                r2Var2.getMessagesController().setSavedViewAs(false);
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", r2Var2.getUserConfig().getClientUserId());
                r2Var2.presentFragment(new org.telegram.ui.un(bundle2), true);
                return;
            case 8:
                org.telegram.ui.ActionBar.r2 r2Var3 = this.f34253b.f26704x1;
                try {
                    r2Var3.getMediaDataController().installShortcut(r2Var3.getUserConfig().getClientUserId(), MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 9:
                aw0 aw0Var5 = this.f34253b;
                org.telegram.ui.ActionBar.r2 r2Var4 = aw0Var5.f26704x1;
                TLRPC.User currentUser = r2Var4.getUserConfig().getCurrentUser();
                g5.r(r2Var4, false, null, currentUser, false, true, false, true, new p1(25, aw0Var5, currentUser));
                return;
            case 10:
                vs0 vs0Var = this.f34253b.f26637a0;
                vs0Var.getClass();
                vs0Var.h(null, new zh.t1(vs0Var, 1));
                return;
            case 11:
                this.f34253b.f26637a0.setReordering(true);
                return;
            case 12:
                aw0 aw0Var6 = this.f34253b;
                aw0Var6.k1(false);
                org.telegram.ui.ActionBar.r5 r5Var = aw0Var6.H;
                if (r5Var != null) {
                    r5Var.f(true);
                } else {
                    aw0Var6.G.g(true);
                }
                aw0Var6.f26645c1 = 0;
                return;
            default:
                this.f34253b.t0();
                return;
        }
    }
}
