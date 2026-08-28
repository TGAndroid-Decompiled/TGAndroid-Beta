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
    public final long f41597a;
    public org.telegram.ui.Cells.x7 f41598b;
    public org.telegram.ui.Components.e80 f41599c;
    public org.telegram.ui.Components.i51 d;
    public org.telegram.ui.Components.fr f41600e;
    public org.telegram.ui.ActionBar.w0 f41601f;
    public final boolean h;
    public final long f41602n;
    public boolean f41603r;
    public long f41604s;
    public ao v;
    public boolean f41605w;

    public pv0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f41605w = true;
        this.f41597a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f41602n = clamp;
        this.f41603r = z10;
        this.f41604s = clamp;
    }

    public static void T(pv0 pv0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            pv0Var.f41600e.a(0.0f);
            org.telegram.ui.Components.oc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        pv0Var.getMessagesController().putChats(updates.chats, false);
        pv0Var.getMessagesController().processUpdates(updates, false);
        if (!pv0Var.isFinished && !pv0Var.finishing) {
            ao aoVar = pv0Var.v;
            if (aoVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                aoVar.run(j10);
            }
            pv0Var.finishFragment();
        }
    }

    public final void U(boolean z10) {
        boolean W;
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f41601f == null || this.f41605w == (W = W())) {
            return;
        }
        this.f41605w = W;
        this.f41601f.setEnabled(W);
        float f14 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f41601f.animate();
            if (W) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (W) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (W) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f41601f;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f41601f;
        if (W) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f41601f;
        if (W) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final String V() {
        int i9 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, mh.l.F0(i9), String.valueOf(((int) (((((float) this.f41604s) * (i9 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean W() {
        if (this.f41604s == this.f41602n && this.f41603r == this.h) {
            return false;
        }
        return true;
    }

    public final void X() {
        long j10;
        long j11;
        if (this.f41600e.f28558c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            this.f41600e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f41597a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z10 = this.f41603r;
            if (z10) {
                j10 = this.f41604s;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new v40(19, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f41603r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f41603r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f41604s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            ao aoVar = this.v;
            if (aoVar != null) {
                if (this.f41603r) {
                    j11 = this.f41604s;
                } else {
                    j11 = -1;
                }
                aoVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 13));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = org.telegram.ui.ActionBar.f6.f23321v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.f41600e = new org.telegram.ui.Components.fr(mutate, new org.telegram.ui.Components.jp(org.telegram.ui.ActionBar.f6.w0(null, i9, false)));
        this.f41601f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f41600e);
        U(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.f41598b = x7Var;
        int i10 = org.telegram.ui.ActionBar.f6.f23001d6;
        x7Var.setBackgroundColor(getThemedColor(i10));
        org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(context, this, null, true, true);
        this.f41599c = e80Var;
        e80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f41599c.setBackgroundColor(getThemedColor(i10));
        this.f41599c.b(true);
        this.f41599c.d(0, null, false);
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(context, this.currentAccount, this.classGuid, false, new a5(this, 16), new ov0(this, 2), null, this.resourceProvider);
        this.d = i51Var;
        i51Var.p1();
        frameLayout2.addView(this.d, g7.e6.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !W();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (W()) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new ov0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new ov0(this, 1));
                showDialog(alertDialog$Builder.f22702a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.z41 z41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.i51 i51Var = this.d;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(false);
            return true;
        }
        return true;
    }
}
