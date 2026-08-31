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
public final class aw0 extends org.telegram.ui.ActionBar.p2 {
    public final long f35249a;
    public org.telegram.ui.Cells.x7 f35250b;
    public org.telegram.ui.Components.y80 f35251c;
    public org.telegram.ui.Components.i61 d;
    public org.telegram.ui.Components.or f35252e;
    public org.telegram.ui.ActionBar.w0 f35253f;
    public final boolean h;
    public final long f35254n;
    public boolean f35255r;
    public long f35256s;
    public io v;
    public boolean f35257w;

    public aw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z4 = true;
        this.f35257w = true;
        this.f35249a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z4 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z4;
        long clamp = Utilities.clamp(z4 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f35254n = clamp;
        this.f35255r = z4;
        this.f35256s = clamp;
    }

    public static void U(aw0 aw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            aw0Var.f35252e.a(0.0f);
            org.telegram.ui.Components.qc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        aw0Var.getMessagesController().putChats(updates.chats, false);
        aw0Var.getMessagesController().processUpdates(updates, false);
        if (!aw0Var.isFinished && !aw0Var.finishing) {
            io ioVar = aw0Var.v;
            if (ioVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                ioVar.run(j10);
            }
            aw0Var.finishFragment();
        }
    }

    public final void V(boolean z4) {
        boolean X;
        float f10;
        float f11;
        float f12;
        float f13;
        if (this.f35253f == null || this.f35257w == (X = X())) {
            return;
        }
        this.f35257w = X;
        this.f35253f.setEnabled(X);
        float f14 = 0.0f;
        if (z4) {
            ViewPropertyAnimator animate = this.f35253f.animate();
            if (X) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f12);
            if (X) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f13);
            if (X) {
                f14 = 1.0f;
            }
            scaleX.scaleY(f14).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f35253f;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        w0Var.setAlpha(f10);
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f35253f;
        if (X) {
            f11 = 1.0f;
        } else {
            f11 = 0.0f;
        }
        w0Var2.setScaleX(f11);
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f35253f;
        if (X) {
            f14 = 1.0f;
        }
        w0Var3.setScaleY(f14);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, sh.j.G0(i10), String.valueOf(((int) (((((float) this.f35256s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.f35256s == this.f35254n && this.f35255r == this.h) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j10;
        long j11;
        if (this.f35252e.f29840c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.f35252e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f35249a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z4 = this.f35255r;
            if (z4) {
                j10 = this.f35256s;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z4;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new tb0(12, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f35255r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f35255r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f35256s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            io ioVar = this.v;
            if (ioVar != null) {
                if (this.f35255r) {
                    j11 = this.f35256s;
                } else {
                    j11 = -1;
                }
                ioVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 5));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.k6.f21981v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f35252e = new org.telegram.ui.Components.or(mutate, new org.telegram.ui.Components.tp(org.telegram.ui.ActionBar.k6.w0(null, i10, false)));
        this.f35253f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f35252e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21605a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.f35250b = x7Var;
        int i11 = org.telegram.ui.ActionBar.k6.f21659d6;
        x7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(context, this, null, true, true);
        this.f35251c = y80Var;
        y80Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f35251c.setBackgroundColor(getThemedColor(i11));
        this.f35251c.b(true);
        this.f35251c.d(0, null, false);
        org.telegram.ui.Components.i61 i61Var = new org.telegram.ui.Components.i61(context, this.currentAccount, this.classGuid, false, new d5(this, 16), new zv0(this, 2), null, this.resourceProvider);
        this.d = i61Var;
        i61Var.p1();
        frameLayout2.addView(this.d, k7.c6.e(-1, -1, 51));
        this.actionBar.setAdaptiveBackground(this.d);
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !X();
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        if (X()) {
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                alertDialog$Builder.f21166a.O = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new zv0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new zv0(this, 1));
                showDialog(alertDialog$Builder.f21166a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.x51 x51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.i61 i61Var = this.d;
        if (i61Var != null && (x51Var = i61Var.V2) != null) {
            x51Var.N(false);
            return true;
        }
        return true;
    }
}
