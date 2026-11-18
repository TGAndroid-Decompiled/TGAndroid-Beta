package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class is0 extends org.telegram.ui.ActionBar.h2 {
    public final long f48790a;
    public org.telegram.ui.Cells.t7 f48791b;
    public org.telegram.ui.Components.e80 f48792c;
    public org.telegram.ui.Components.e51 d;
    public org.telegram.ui.ActionBar.d5 f48793e;
    public final boolean f48794f;
    public final long h;
    public boolean f48795n;
    public long f48796r;
    public ln f48797s;
    public boolean f48798w;

    public is0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f48798w = true;
        this.f48790a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (O0 != null && O0.linked_monoforum_id != 0) {
            chat = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (O0 == null || !O0.broadcast_messages_allowed) ? false : false;
        this.f48794f = z10;
        long k10 = Utilities.k(z10 ? j10 : ((org.telegram.messenger.j0) getMessagesController().A7.f26135b.f15539b).f24767c, getMessagesController().L6, 0L);
        this.h = k10;
        this.f48795n = z10;
        this.f48796r = k10;
    }

    public static void Z(is0 is0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            is0Var.f48793e.b(false);
            org.telegram.ui.Components.lc.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        is0Var.getMessagesController().Z3(updates.chats, false);
        is0Var.getMessagesController().V3(updates, false);
        if (!is0Var.isFinished && !is0Var.finishing) {
            ln lnVar = is0Var.f48797s;
            if (lnVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                lnVar.run(j3);
            }
            is0Var.finishFragment();
        }
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.f48793e == null || this.f48798w == (c02 = c0())) {
            return;
        }
        this.f48798w = c02;
        this.f48793e.a(c02, z10);
    }

    public final String b0() {
        int i7 = getMessagesController().M6;
        return org.telegram.messenger.gd.a0(null, null, 2131746880, ki.k.J0(i7), String.valueOf(((int) (((((float) this.f48796r) * (i7 / 1000.0f)) / 1000.0d) * getMessagesController().f25650f6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f48796r == this.h && this.f48795n == this.f48794f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131746903, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 0));
        this.f48793e = this.simpleActionBar.s(org.telegram.messenger.gd.M0(2131745751, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29339a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.resourceProvider);
        this.f48791b = t7Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29396d6;
        org.telegram.ui.ActionBar.u6.h(i7, t7Var, getResourceProvider());
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, this, null, true, true);
        this.f48792c = e80Var;
        e80Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.u6.h(i7, this.f48792c, getResourceProvider());
        this.f48792c.b(true);
        this.f48792c.d(0, null, false);
        org.telegram.ui.Components.e51 e51Var = new org.telegram.ui.Components.e51(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new gs0(this, 2), null, this.resourceProvider);
        this.d = e51Var;
        e51Var.r1();
        frameLayout2.addView(this.d, c8.ma.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j3;
        long j10;
        if (!this.f48793e.f28873y.f57658f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f48793e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j11 = this.f48790a;
            updatepaidmessagesprice.channel = messagesController.j1(j11);
            boolean z10 = this.f48795n;
            if (z10) {
                j3 = this.f48796r;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new e00(20, this, updatepaidmessagesprice));
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j11));
            if (O0 != null) {
                if (this.f48795n) {
                    O0.flags2 |= 65536;
                    O0.broadcast_messages_allowed = true;
                } else {
                    O0.flags2 &= -65537;
                    O0.broadcast_messages_allowed = false;
                }
                getMessagesController().X3(O0, true);
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
                if (O02 != null) {
                    if (this.f48795n) {
                        O02.flags2 |= 16384;
                        O02.send_paid_messages_stars = this.f48796r;
                    } else {
                        O02.flags2 &= -16385;
                        O02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().X3(O02, true);
                }
            }
            ln lnVar = this.f48797s;
            if (lnVar != null) {
                if (this.f48795n) {
                    j10 = this.f48796r;
                } else {
                    j10 = -1;
                }
                lnVar.run(j10);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (c0()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.gd.M0(2131748278, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754214, null), new gs0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131751395, null), new gs0(this, 1));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.z41 z41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.e51 e51Var = this.d;
        if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
