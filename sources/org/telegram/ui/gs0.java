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
public final class gs0 extends org.telegram.ui.ActionBar.f2 {
    public final long f46063a;
    public org.telegram.ui.Cells.t7 f46064b;
    public org.telegram.ui.Components.q70 f46065c;
    public org.telegram.ui.Components.k41 d;
    public org.telegram.ui.ActionBar.b5 f46066e;
    public final boolean f46067f;
    public final long h;
    public boolean f46068n;
    public long f46069r;
    public kn f46070s;
    public boolean f46071w;

    public gs0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z9 = true;
        this.f46071w = true;
        this.f46063a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z9 = (M0 == null || !M0.broadcast_messages_allowed) ? false : false;
        this.f46067f = z9;
        long k10 = Utilities.k(z9 ? j10 : ((org.telegram.messenger.j0) getMessagesController().f24927x7.f24420b.f13555b).f23432c, getMessagesController().I6, 0L);
        this.h = k10;
        this.f46068n = z9;
        this.f46069r = k10;
    }

    public static void Z(gs0 gs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            gs0Var.f46066e.b(false);
            org.telegram.ui.Components.hc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        gs0Var.getMessagesController().S3(updates.chats, false);
        gs0Var.getMessagesController().O3(updates, false);
        if (!gs0Var.isFinished && !gs0Var.finishing) {
            kn knVar = gs0Var.f46070s;
            if (knVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                knVar.run(j3);
            }
            gs0Var.finishFragment();
        }
    }

    public final void a0(boolean z9) {
        boolean c02;
        if (this.f46066e == null || this.f46071w == (c02 = c0())) {
            return;
        }
        this.f46071w = c02;
        this.f46066e.a(c02, z9);
    }

    public final String b0() {
        int i7 = getMessagesController().J6;
        return org.telegram.messenger.hd.a0(null, null, 2131747072, hi.j.J0(i7), String.valueOf(((int) (((((float) this.f46069r) * (i7 / 1000.0f)) / 1000.0d) * getMessagesController().f24740c6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f46069r == this.h && this.f46068n == this.f46067f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131747095, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 27));
        this.f46066e = this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27792a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.resourceProvider);
        this.f46064b = t7Var;
        int i7 = org.telegram.ui.ActionBar.k6.f27848d6;
        org.telegram.ui.ActionBar.r6.i(i7, t7Var, getResourceProvider());
        org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, this, null, true, true);
        this.f46065c = q70Var;
        q70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.r6.i(i7, this.f46065c, getResourceProvider());
        this.f46065c.b(true);
        this.f46065c.d(0, null, false);
        org.telegram.ui.Components.k41 k41Var = new org.telegram.ui.Components.k41(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new fs0(this, 2), null, this.resourceProvider);
        this.d = k41Var;
        k41Var.r1();
        frameLayout2.addView(this.d, c8.ha.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j3;
        long j10;
        if (!this.f46066e.f27354y.f55371f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f46066e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j11 = this.f46063a;
            updatepaidmessagesprice.channel = messagesController.h1(j11);
            boolean z9 = this.f46068n;
            if (z9) {
                j3 = this.f46069r;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z9;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new h50(18, this, updatepaidmessagesprice));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j11));
            if (M0 != null) {
                if (this.f46068n) {
                    M0.flags2 |= 65536;
                    M0.broadcast_messages_allowed = true;
                } else {
                    M0.flags2 &= -65537;
                    M0.broadcast_messages_allowed = false;
                }
                getMessagesController().Q3(M0, true);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
                if (M02 != null) {
                    if (this.f46068n) {
                        M02.flags2 |= 16384;
                        M02.send_paid_messages_stars = this.f46069r;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            kn knVar = this.f46070s;
            if (knVar != null) {
                if (this.f46068n) {
                    j10 = this.f46069r;
                } else {
                    j10 = -1;
                }
                knVar.run(j10);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
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
    public final boolean onBackPressed(boolean z9) {
        if (c0()) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131743836, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131748469, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new fs0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131751407, null), new fs0(this, 1));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.f41 f41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.k41 k41Var = this.d;
        if (k41Var != null && (f41Var = k41Var.f35167f3) != null) {
            f41Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
