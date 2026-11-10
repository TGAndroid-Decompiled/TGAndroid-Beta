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
public final class ks0 extends org.telegram.ui.ActionBar.f2 {
    public final long f47404a;
    public org.telegram.ui.Cells.t7 f47405b;
    public org.telegram.ui.Components.q70 f47406c;
    public org.telegram.ui.Components.r41 d;
    public org.telegram.ui.ActionBar.c5 f47407e;
    public final boolean f47408f;
    public final long h;
    public boolean f47409n;
    public long f47410r;
    public mn f47411s;
    public boolean f47412w;

    public ks0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z9 = true;
        this.f47412w = true;
        this.f47404a = j3;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z9 = (M0 == null || !M0.broadcast_messages_allowed) ? false : false;
        this.f47408f = z9;
        long k10 = Utilities.k(z9 ? j10 : ((org.telegram.messenger.j0) getMessagesController().f24946x7.f24435b.f13557b).f23464c, getMessagesController().I6, 0L);
        this.h = k10;
        this.f47409n = z9;
        this.f47410r = k10;
    }

    public static void Z(ks0 ks0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            ks0Var.f47407e.b(false);
            org.telegram.ui.Components.gc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        ks0Var.getMessagesController().S3(updates.chats, false);
        ks0Var.getMessagesController().O3(updates, false);
        if (!ks0Var.isFinished && !ks0Var.finishing) {
            mn mnVar = ks0Var.f47411s;
            if (mnVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                mnVar.run(j3);
            }
            ks0Var.finishFragment();
        }
    }

    public final void a0(boolean z9) {
        boolean c02;
        if (this.f47407e == null || this.f47412w == (c02 = c0())) {
            return;
        }
        this.f47412w = c02;
        this.f47407e.a(c02, z9);
    }

    public final String b0() {
        int i7 = getMessagesController().J6;
        return org.telegram.messenger.id.a0(null, null, 2131747073, hi.j.J0(i7), String.valueOf(((int) (((((float) this.f47410r) * (i7 / 1000.0f)) / 1000.0d) * getMessagesController().f24759c6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f47410r == this.h && this.f47409n == this.f47408f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.id.M0(2131747096, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new xx(this, 27));
        this.f47407e = this.simpleActionBar.p(org.telegram.messenger.id.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27834a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.resourceProvider);
        this.f47405b = t7Var;
        int i7 = org.telegram.ui.ActionBar.m6.f27890d6;
        org.telegram.ui.ActionBar.t6.h(i7, t7Var, getResourceProvider());
        org.telegram.ui.Components.q70 q70Var = new org.telegram.ui.Components.q70(context, this, null, true, true);
        this.f47406c = q70Var;
        q70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.t6.h(i7, this.f47406c, getResourceProvider());
        this.f47406c.b(true);
        this.f47406c.d(0, null, false);
        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new js0(this, 2), null, this.resourceProvider);
        this.d = r41Var;
        r41Var.r1();
        frameLayout2.addView(this.d, c8.ha.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j3;
        long j10;
        if (!this.f47407e.f27380y.f55499f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f47407e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.qp messagesController = getMessagesController();
            long j11 = this.f47404a;
            updatepaidmessagesprice.channel = messagesController.h1(j11);
            boolean z9 = this.f47409n;
            if (z9) {
                j3 = this.f47410r;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z9;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new k50(18, this, updatepaidmessagesprice));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j11));
            if (M0 != null) {
                if (this.f47409n) {
                    M0.flags2 |= 65536;
                    M0.broadcast_messages_allowed = true;
                } else {
                    M0.flags2 &= -65537;
                    M0.broadcast_messages_allowed = false;
                }
                getMessagesController().Q3(M0, true);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
                if (M02 != null) {
                    if (this.f47409n) {
                        M02.flags2 |= 16384;
                        M02.send_paid_messages_stars = this.f47410r;
                    } else {
                        M02.flags2 &= -16385;
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().Q3(M02, true);
                }
            }
            mn mnVar = this.f47411s;
            if (mnVar != null) {
                if (this.f47409n) {
                    j10 = this.f47410r;
                } else {
                    j10 = -1;
                }
                mnVar.run(j10);
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
                String M0 = org.telegram.messenger.id.M0(2131743835, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131748470, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754216, null), new js0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131751406, null), new js0(this, 1));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.m41 m41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.r41 r41Var = this.d;
        if (r41Var != null && (m41Var = r41Var.f37496f3) != null) {
            m41Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
