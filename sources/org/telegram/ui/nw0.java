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
public final class nw0 extends org.telegram.ui.ActionBar.n2 {
    public final long f39054a;
    public org.telegram.ui.Cells.z7 f39055b;
    public org.telegram.ui.Components.j90 f39056c;
    public org.telegram.ui.Components.e71 d;
    public org.telegram.ui.Components.sr f39057e;
    public org.telegram.ui.ActionBar.v0 f39058f;
    public final boolean h;
    public final long f39059n;
    public boolean f39060r;
    public long f39061s;
    public ko v;
    public boolean f39062w;

    public nw0(long j3) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f39062w = true;
        this.f39054a = j3;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j10 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.h = z10;
        long clamp = Utilities.clamp(z10 ? j10 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f39059n = clamp;
        this.f39060r = z10;
        this.f39061s = clamp;
    }

    public static void S(nw0 nw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j3;
        if (tL_error != null) {
            nw0Var.f39057e.a(0.0f);
            org.telegram.ui.Components.yc.b0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        nw0Var.getMessagesController().putChats(updates.chats, false);
        nw0Var.getMessagesController().processUpdates(updates, false);
        if (!nw0Var.isFinished && !nw0Var.finishing) {
            ko koVar = nw0Var.v;
            if (koVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j3 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j3 = -1;
                }
                koVar.run(j3);
            }
            nw0Var.finishFragment();
        }
    }

    public final void T(boolean z10) {
        boolean W;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.f39058f == null || this.f39062w == (W = W())) {
            return;
        }
        this.f39062w = W;
        this.f39058f.setEnabled(W);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.f39058f.animate();
            if (W) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator alpha = animate.alpha(f11);
            if (W) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator scaleX = alpha.scaleX(f12);
            if (W) {
                f13 = 1.0f;
            }
            scaleX.scaleY(f13).setDuration(180L).start();
            return;
        }
        org.telegram.ui.ActionBar.v0 v0Var = this.f39058f;
        if (W) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        v0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f39058f;
        if (W) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        v0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.v0 v0Var3 = this.f39058f;
        if (W) {
            f13 = 1.0f;
        }
        v0Var3.setScaleY(f13);
    }

    public final String U() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, ei.m.L0(i10), String.valueOf(((int) (((((float) this.f39061s) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean W() {
        if (this.f39061s == this.f39059n && this.f39060r == this.h) {
            return false;
        }
        return true;
    }

    public final void X() {
        long j3;
        long j10;
        if (this.f39057e.f30935c <= 0.0f) {
            if (!W()) {
                finishFragment();
                return;
            }
            this.f39057e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j11 = this.f39054a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j11);
            boolean z10 = this.f39060r;
            if (z10) {
                j3 = this.f39061s;
            } else {
                j3 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j3;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new zb0(12, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j11));
            if (chat != null) {
                if (this.f39060r) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f39060r) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.f39061s;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            ko koVar = this.v;
            if (koVar != null) {
                if (this.f39060r) {
                    j10 = this.f39061s;
                } else {
                    j10 = -1;
                }
                koVar.run(j10);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 18));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = org.telegram.ui.ActionBar.i6.f21164v8;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.f39057e = new org.telegram.ui.Components.sr(mutate, new org.telegram.ui.Components.wp(org.telegram.ui.ActionBar.i6.w0(null, i10, false)));
        this.f39058f = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.f39057e);
        T(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20771a7, false));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.z7 z7Var = new org.telegram.ui.Cells.z7(context, this.resourceProvider);
        this.f39055b = z7Var;
        int i11 = org.telegram.ui.ActionBar.i6.f20827d6;
        z7Var.setBackgroundColor(getThemedColor(i11));
        org.telegram.ui.Components.j90 j90Var = new org.telegram.ui.Components.j90(context, this, null, true, true);
        this.f39056c = j90Var;
        j90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        this.f39056c.setBackgroundColor(getThemedColor(i11));
        this.f39056c.b(true);
        this.f39056c.d(0, null, false);
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(context, this.currentAccount, this.classGuid, false, new c5(this, 16), new mw0(this, 2), null, this.resourceProvider);
        this.d = e71Var;
        e71Var.r1();
        frameLayout2.addView(this.d, w7.z5.e(-1, -1, 51));
        return this.fragmentView;
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
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
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new mw0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new mw0(this, 1));
                showDialog(alertDialog$Builder.f20377a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.w61 w61Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.e71 e71Var = this.d;
        if (e71Var != null && (w61Var = e71Var.f26034f3) != null) {
            w61Var.N(false);
            return true;
        }
        return true;
    }
}
