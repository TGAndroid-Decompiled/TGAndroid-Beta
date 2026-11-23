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
public final class hs0 extends org.telegram.ui.ActionBar.g2 {
    public final long f48619a;
    public org.telegram.ui.Cells.t7 f48620b;
    public org.telegram.ui.Components.d80 f48621c;
    public org.telegram.ui.Components.g51 d;
    public org.telegram.ui.ActionBar.c5 f48622e;
    public final boolean f48623f;
    public final long h;
    public boolean f48624n;
    public long f48625r;
    public ln f48626s;
    public boolean f48627w;

    public hs0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f48627w = true;
        this.f48619a = j3;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j3));
        if (O0 != null && O0.linked_monoforum_id != 0) {
            chat = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (O0 == null || !O0.broadcast_messages_allowed) ? false : false;
        this.f48623f = z10;
        long k10 = Utilities.k(z10 ? j10 : ((org.telegram.messenger.j0) getMessagesController().A7.f26228b.f15482b).f24899c, getMessagesController().L6, 0L);
        this.h = k10;
        this.f48624n = z10;
        this.f48625r = k10;
    }

    public static void Z(hs0 hs0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            hs0Var.f48622e.b(false);
            org.telegram.ui.Components.kc.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        hs0Var.getMessagesController().Z3(updates.chats, false);
        hs0Var.getMessagesController().V3(updates, false);
        if (!hs0Var.isFinished && !hs0Var.finishing) {
            ln lnVar = hs0Var.f48626s;
            if (lnVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                lnVar.run(j3);
            }
            hs0Var.finishFragment();
        }
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.f48622e == null || this.f48627w == (c02 = c0())) {
            return;
        }
        this.f48627w = c02;
        this.f48622e.a(c02, z10);
    }

    public final String b0() {
        int i7 = getMessagesController().M6;
        return org.telegram.messenger.gd.a0(null, null, 2131746879, ki.j.J0(i7), String.valueOf(((int) (((((float) this.f48625r) * (i7 / 1000.0f)) / 1000.0d) * getMessagesController().f25743f6)) / 100.0d));
    }

    public final boolean c0() {
        if (this.f48625r == this.h && this.f48624n == this.f48623f) {
            return false;
        }
        return true;
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746902, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 0));
        this.f48622e = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29394a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context, this.resourceProvider);
        this.f48620b = t7Var;
        int i7 = org.telegram.ui.ActionBar.n6.f29451d6;
        org.telegram.ui.ActionBar.u6.h(i7, t7Var, getResourceProvider());
        org.telegram.ui.Components.d80 d80Var = new org.telegram.ui.Components.d80(context, this, null, true, true);
        this.f48621c = d80Var;
        d80Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.u6.h(i7, this.f48621c, getResourceProvider());
        this.f48621c.b(true);
        this.f48621c.d(0, null, false);
        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(context, this.currentAccount, this.classGuid, false, new a5(this, 17), new fs0(this, 2), null, this.resourceProvider);
        this.d = g51Var;
        g51Var.r1();
        frameLayout2.addView(this.d, c8.na.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        long j3;
        long j10;
        if (!this.f48622e.f28920y.f57780f) {
            if (!c0()) {
                finishFragment();
                return;
            }
            this.f48622e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            org.telegram.messenger.mp messagesController = getMessagesController();
            long j11 = this.f48619a;
            updatepaidmessagesprice.channel = messagesController.j1(j11);
            boolean z10 = this.f48624n;
            if (z10) {
                j3 = this.f48625r;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new d00(20, this, updatepaidmessagesprice));
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(j11));
            if (O0 != null) {
                if (this.f48624n) {
                    O0.flags2 |= 65536;
                    O0.broadcast_messages_allowed = true;
                } else {
                    O0.flags2 &= -65537;
                    O0.broadcast_messages_allowed = false;
                }
                getMessagesController().X3(O0, true);
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(O0.linked_monoforum_id));
                if (O02 != null) {
                    if (this.f48624n) {
                        O02.flags2 |= 16384;
                        O02.send_paid_messages_stars = this.f48625r;
                    } else {
                        O02.flags2 &= -16385;
                        O02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().X3(O02, true);
                }
            }
            ln lnVar = this.f48626s;
            if (lnVar != null) {
                if (this.f48624n) {
                    j10 = this.f48625r;
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
                String N0 = org.telegram.messenger.gd.N0(2131743588, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131748277, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new fs0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131751394, null), new fs0(this, 1));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.b51 b51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.g51 g51Var = this.d;
        if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
            b51Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
