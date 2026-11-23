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
public final class js0 extends org.telegram.ui.ActionBar.g2 {
    public final long f49053a;
    public org.telegram.ui.Cells.u7 f49054b;
    public org.telegram.ui.Components.g80 f49055c;
    public org.telegram.ui.Components.h51 d;
    public org.telegram.ui.ActionBar.c5 f49056e;
    public final boolean f49057f;
    public final long h;
    public boolean f49058n;
    public long f49059r;
    public ln f49060s;
    public boolean f49061w;

    public js0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f49061w = true;
        this.f49053a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (O0 != null && O0.linked_monoforum_id != 0) {
            chat = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (O0 == null || !O0.broadcast_messages_allowed) ? false : false;
        this.f49057f = z10;
        long k10 = Utilities.k(z10 ? j10 : ((org.telegram.messenger.j0) getMessagesController().A7.f26177b.f15495b).f24776c, getMessagesController().L6, 0L);
        this.h = k10;
        this.f49058n = z10;
        this.f49059r = k10;
    }

    public static void Z(js0 js0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            js0Var.f49056e.b(false);
            org.telegram.ui.Components.lc.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        js0Var.getMessagesController().Z3(updates.chats, false);
        js0Var.getMessagesController().V3(updates, false);
        if (!js0Var.isFinished && !js0Var.finishing) {
            ln lnVar = js0Var.f49060s;
            if (lnVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                lnVar.run(j3);
            }
            js0Var.finishFragment();
        }
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.f49056e == null || this.f49061w == (c02 = c0())) {
            return;
        }
        this.f49061w = c02;
        this.f49056e.a(c02, z10);
    }

    public final String b0() {
        int i7 = getMessagesController().M6;
        return org.telegram.messenger.hd.a0(null, null, 2131746879, ki.j.J0(i7), String.valueOf(((int) (((((float) this.f49059r) * (i7 / 1000.0f)) / 1000.0d) * getMessagesController().f25811f6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f49059r == this.h && this.f49058n == this.f49057f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.N0(2131746902, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new is0(this, 0));
        this.f49056e = this.simpleActionBar.s(org.telegram.messenger.hd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f29290a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context, this.resourceProvider);
        this.f49054b = u7Var;
        int i7 = org.telegram.ui.ActionBar.m6.f29347d6;
        org.telegram.ui.ActionBar.t6.h(i7, u7Var, getResourceProvider());
        org.telegram.ui.Components.g80 g80Var = new org.telegram.ui.Components.g80(context, this, null, true, true);
        this.f49055c = g80Var;
        g80Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.t6.h(i7, this.f49055c, getResourceProvider());
        this.f49055c.b(true);
        this.f49055c.d(0, null, false);
        org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new hs0(this, 2), null, this.resourceProvider);
        this.d = h51Var;
        h51Var.r1();
        frameLayout2.addView(this.d, c8.na.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j3;
        long j10;
        if (!this.f49056e.f28825y.f57666f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f49056e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.np messagesController = getMessagesController();
            long j11 = this.f49053a;
            updatepaidmessagesprice.channel = messagesController.j1(j11);
            boolean z10 = this.f49058n;
            if (z10) {
                j3 = this.f49059r;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new e00(20, this, updatepaidmessagesprice));
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j11));
            if (O0 != null) {
                if (this.f49058n) {
                    O0.flags2 |= 65536;
                    O0.broadcast_messages_allowed = true;
                } else {
                    O0.flags2 &= -65537;
                    O0.broadcast_messages_allowed = false;
                }
                getMessagesController().X3(O0, true);
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
                if (O02 != null) {
                    if (this.f49058n) {
                        O02.flags2 |= 16384;
                        O02.send_paid_messages_stars = this.f49059r;
                    } else {
                        O02.flags2 &= -16385;
                        O02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().X3(O02, true);
                }
            }
            ln lnVar = this.f49060s;
            if (lnVar != null) {
                if (this.f49058n) {
                    j10 = this.f49059r;
                } else {
                    j10 = -1;
                }
                lnVar.run(j10);
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
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
                String N0 = org.telegram.messenger.hd.N0(2131743592, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.hd.N0(2131748277, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131754213, null), new hs0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131751394, null), new hs0(this, 1));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.c51 c51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.h51 h51Var = this.d;
        if (h51Var != null && (c51Var = h51Var.f35742g3) != null) {
            c51Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
