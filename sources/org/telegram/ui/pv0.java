package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
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
public final class pv0 extends org.telegram.ui.ActionBar.o2 {
    public final long f41472a;
    public org.telegram.ui.Cells.v7 f41473b;
    public org.telegram.ui.Components.r80 f41474c;
    public org.telegram.ui.Components.u51 d;
    public org.telegram.ui.Components.ir f41475e;
    public org.telegram.ui.ActionBar.w0 f41476f;
    public final boolean h;
    public final long f41477n;
    public boolean f41478r;
    public long f41479s;
    public eo v;
    public boolean f41480w;

    public pv0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f41480w = true;
        this.f41472a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f41477n = clamp;
        this.f41478r = z10;
        this.f41479s = clamp;
    }

    public static void U(pv0 pv0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            pv0Var.f41475e.a(0.0f);
            org.telegram.ui.Components.tc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        pv0Var.getMessagesController().putChats(updates.chats, false);
        pv0Var.getMessagesController().processUpdates(updates, false);
        if (!pv0Var.isFinished && !pv0Var.finishing) {
            eo eoVar = pv0Var.v;
            if (eoVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                eoVar.run(j10);
            }
            pv0Var.finishFragment();
        }
    }

    public final void V(boolean z10) {
        boolean X;
        float f9;
        float f10;
        float f11;
        float f12;
        if (this.f41476f == null || this.f41480w == (X = X())) {
            return;
        }
        this.f41480w = X;
        this.f41476f.setEnabled(X);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f41476f.animate();
            if (X) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (X) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (X) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f41476f;
        if (X) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        w0Var.setAlpha(f9);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f41476f;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f41476f;
        if (X) {
            f13 = 1.0f;
        }
        w0Var3.setScaleY(f13);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, ph.j.G0(i10), String.valueOf(((int) (((((float) this.f41479s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.f41479s == this.f41477n && this.f41478r == this.h) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j10;
        long j11;
        if (this.f41475e.f29455c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.f41475e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f41472a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z10 = this.f41478r;
            if (z10) {
                j10 = this.f41479s;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new u80(15, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f41478r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f41478r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f41479s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            eo eoVar = this.v;
            if (eoVar != null) {
                if (this.f41478r) {
                    j11 = this.f41479s;
                } else {
                    j11 = -1;
                }
                eoVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 5));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.g6.f23385v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f41475e = new org.telegram.ui.Components.ir(mutate, new org.telegram.ui.Components.np(org.telegram.ui.ActionBar.g6.w0(null, i10, false)));
        this.f41476f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f41475e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.v7 v7Var = new org.telegram.ui.Cells.v7(context, this.resourceProvider);
        this.f41473b = v7Var;
        int i11 = org.telegram.ui.ActionBar.g6.f23062d6;
        v7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(context, this, null, true, true);
        this.f41474c = r80Var;
        r80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f41474c.setBackgroundColor(getThemedColor(i11));
        this.f41474c.b(true);
        this.f41474c.d(0, null, false);
        org.telegram.ui.Components.u51 u51Var = new org.telegram.ui.Components.u51(context, this.currentAccount, this.classGuid, false, new b5(this, 16), new ov0(this, 2), null, this.resourceProvider);
        this.d = u51Var;
        u51Var.p1();
        frameLayout2.addView(this.d, i7.f6.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (X()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ov0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new ov0(this, 1));
                showDialog(alertDialog$Builder.f22714a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.k51 k51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.u51 u51Var = this.d;
        if (u51Var != null && (k51Var = u51Var.U2) != null) {
            k51Var.N(false);
            return true;
        }
        return true;
    }
}
