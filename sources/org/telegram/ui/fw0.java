package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class fw0 extends org.telegram.ui.ActionBar.r2 {
    public final long f39484a;
    public org.telegram.ui.Cells.c8 f39485b;
    public org.telegram.ui.Components.r90 f39486c;
    public org.telegram.ui.Components.r71 d;
    public org.telegram.ui.ActionBar.u5 e;
    public final boolean f39487f;
    public final long h;
    public boolean f39488n;
    public long f39489r;
    public fo f39490s;
    public boolean v;

    public fw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.v = true;
        this.f39484a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.f39487f = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.h = clamp;
        this.f39488n = z10;
        this.f39489r = clamp;
    }

    public static void V(fw0 fw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            fw0Var.e.b(false);
            org.telegram.ui.Components.wc.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        fw0Var.getMessagesController().putChats(updates.chats, false);
        fw0Var.getMessagesController().lambda$processUpdates$379(updates, false);
        if (!fw0Var.isFinished && !fw0Var.finishing) {
            fo foVar = fw0Var.f39490s;
            if (foVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                foVar.run(j10);
            }
            fw0Var.finishFragment();
        }
    }

    public final void W(boolean z10) {
        boolean Y;
        if (this.e == null || this.v == (Y = Y())) {
            return;
        }
        this.v = Y;
        this.e.a(Y, z10);
    }

    public final String X() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, hi.k.F0(i10), String.valueOf(((int) (((((float) this.f39489r) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean Y() {
        if (this.f39489r == this.h && this.f39488n == this.f39487f) {
            return false;
        }
        return true;
    }

    public final void Z() {
        long j10;
        long j11;
        if (!this.e.f23139x.f19327f) {
            if (!Y()) {
                finishFragment();
                return;
            }
            this.e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f39484a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z10 = this.f39488n;
            if (z10) {
                j10 = this.f39489r;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new j10(21, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f39488n) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f39488n) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f39489r;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            fo foVar = this.f39490s;
            if (foVar != null) {
                if (this.f39488n) {
                    j11 = this.f39489r;
                } else {
                    j11 = -1;
                }
                foVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.simpleActionBar.setActionBarMenuOnItemClick(new a20(this, 24));
        this.e = this.simpleActionBar.i(LocaleController.getString(R.string.Save));
        W(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23299a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.c8 c8Var = new org.telegram.ui.Cells.c8(context, this.resourceProvider);
        this.f39485b = c8Var;
        int i10 = org.telegram.ui.ActionBar.y6.f23356d6;
        org.telegram.ui.ActionBar.f7.i(i10, c8Var, getResourceProvider());
        org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(context, this, null, true, true);
        this.f39486c = r90Var;
        r90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        org.telegram.ui.ActionBar.f7.i(i10, this.f39486c, getResourceProvider());
        this.f39486c.b(true);
        this.f39486c.d(0, null, false);
        org.telegram.ui.Components.r71 r71Var = new org.telegram.ui.Components.r71(context, this.currentAccount, this.classGuid, false, new e5(this, 16), new ew0(this, 2), null, this.resourceProvider);
        this.d = r71Var;
        r71Var.u1();
        frameLayout2.addView(this.d, org.telegram.ui.Components.gb1.i(-1, -1, 51));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !Y();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (Y()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22368a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22368a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ew0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new ew0(this, 1));
                showDialog(alertDialog$Builder.f22368a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.j71 j71Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.r71 r71Var = this.d;
        if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
            j71Var.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
