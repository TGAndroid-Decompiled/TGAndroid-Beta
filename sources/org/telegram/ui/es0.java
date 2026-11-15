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
public final class es0 extends org.telegram.ui.ActionBar.e2 {
    public final long f46892a;
    public org.telegram.ui.Cells.s7 f46893b;
    public org.telegram.ui.Components.t70 f46894c;
    public org.telegram.ui.Components.u41 d;
    public org.telegram.ui.ActionBar.z4 f46895e;
    public final boolean f46896f;
    public final long h;
    public boolean f46897n;
    public long f46898r;
    public kn f46899s;
    public boolean f46900w;

    public es0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f46900w = true;
        this.f46892a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (M0 == null || !M0.broadcast_messages_allowed) ? false : false;
        this.f46896f = z10;
        long k10 = Utilities.k(z10 ? j10 : ((org.telegram.messenger.j0) getMessagesController().f25451y7.f25839b.f15881b).f24498c, getMessagesController().J6, 0L);
        this.h = k10;
        this.f46897n = z10;
        this.f46898r = k10;
    }

    public static void Z(es0 es0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            es0Var.f46895e.b(false);
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        es0Var.getMessagesController().S3(updates.chats, false);
        es0Var.getMessagesController().O3(updates, false);
        if (!es0Var.isFinished && !es0Var.finishing) {
            kn knVar = es0Var.f46899s;
            if (knVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                knVar.run(j3);
            }
            es0Var.finishFragment();
        }
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.f46895e == null || this.f46900w == (c02 = c0())) {
            return;
        }
        this.f46900w = c02;
        this.f46895e.a(c02, z10);
    }

    public final String b0() {
        int i7 = getMessagesController().K6;
        return org.telegram.messenger.hd.a0(null, null, 2131747073, ki.k.J0(i7), String.valueOf(((int) (((((float) this.f46898r) * (i7 / 1000.0f)) / 1000.0d) * getMessagesController().f25262d6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f46898r == this.h && this.f46897n == this.f46896f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747096, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new lx(this, 28));
        this.f46895e = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.q6.h(org.telegram.ui.ActionBar.j6.f28792a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.resourceProvider);
        this.f46893b = s7Var;
        int i7 = org.telegram.ui.ActionBar.j6.f28849d6;
        org.telegram.ui.ActionBar.q6.h(i7, s7Var, getResourceProvider());
        org.telegram.ui.Components.t70 t70Var = new org.telegram.ui.Components.t70(context, this, null, true, true);
        this.f46894c = t70Var;
        t70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.q6.h(i7, this.f46894c, getResourceProvider());
        this.f46894c.b(true);
        this.f46894c.d(0, null, false);
        org.telegram.ui.Components.u41 u41Var = new org.telegram.ui.Components.u41(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new ds0(this, 2), null, this.resourceProvider);
        this.d = u41Var;
        u41Var.r1();
        frameLayout2.addView(this.d, c8.ja.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j3;
        long j10;
        if (!this.f46895e.f29950y.f57086f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f46895e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.np messagesController = getMessagesController();
            long j11 = this.f46892a;
            updatepaidmessagesprice.channel = messagesController.h1(j11);
            boolean z10 = this.f46897n;
            if (z10) {
                j3 = this.f46898r;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new b00(20, this, updatepaidmessagesprice));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j11));
            if (M0 != null) {
                if (this.f46897n) {
                    M0.flags2 |= 65536;
                    M0.broadcast_messages_allowed = true;
                } else {
                    M0.flags2 &= -65537;
                    M0.broadcast_messages_allowed = false;
                }
                getMessagesController().Q3(M0, true);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
                if (M02 != null) {
                    if (this.f46897n) {
                        M02.flags2 |= 16384;
                        M02.send_paid_messages_stars = this.f46898r;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            kn knVar = this.f46899s;
            if (knVar != null) {
                if (this.f46897n) {
                    j10 = this.f46898r;
                } else {
                    j10 = -1;
                }
                knVar.run(j10);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
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
                String M0 = org.telegram.messenger.hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131748470, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ds0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751406, null), new ds0(this, 1));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.p41 p41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.u41 u41Var = this.d;
        if (u41Var != null && (p41Var = u41Var.f39892g3) != null) {
            p41Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
