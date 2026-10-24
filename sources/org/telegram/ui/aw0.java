package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class aw0 extends org.telegram.ui.ActionBar.o2 {
    public final long f35852a;
    public org.telegram.ui.Cells.y7 f35853b;
    public org.telegram.ui.Components.p90 f35854c;
    public org.telegram.ui.Components.i71 d;
    public org.telegram.ui.Components.yr e;
    public org.telegram.ui.Components.cq f35855f;
    public org.telegram.ui.ActionBar.u0 h;
    public final boolean f35856n;
    public final long f35857r;
    public boolean f35858s;
    public long v;
    public co f35859w;
    public boolean f35860x;

    public aw0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z10 = true;
        this.f35860x = true;
        this.f35852a = j10;
        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
        if (chat2 != null && chat2.linked_monoforum_id != 0) {
            chat = getMessagesController().getChat(Long.valueOf(chat2.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        z10 = (chat2 == null || !chat2.broadcast_messages_allowed) ? false : false;
        this.f35856n = z10;
        long clamp = Utilities.clamp(z10 ? j11 : getMessagesController().config.starsPaidMessagesChannelAmountDefault.get(), getMessagesController().starsPaidMessageAmountMax, 0L);
        this.f35857r = clamp;
        this.f35858s = z10;
        this.v = clamp;
    }

    public static void U(aw0 aw0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j10;
        if (tL_error != null) {
            aw0Var.e.a(0.0f);
            org.telegram.ui.Components.vc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        aw0Var.getMessagesController().putChats(updates.chats, false);
        aw0Var.getMessagesController().lambda$processUpdates$377(updates, false);
        if (!aw0Var.isFinished && !aw0Var.finishing) {
            co coVar = aw0Var.f35859w;
            if (coVar != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j10 = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j10 = -1;
                }
                coVar.run(j10);
            }
            aw0Var.finishFragment();
        }
    }

    public final void V(boolean z10) {
        boolean X;
        float f7;
        float f10;
        float f11;
        float f12;
        if (this.h == null || this.f35860x == (X = X())) {
            return;
        }
        this.f35860x = X;
        this.h.setEnabled(X);
        float f13 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = this.h.animate();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.h;
        if (X) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        u0Var.setAlpha(f7);
        org.telegram.ui.ActionBar.u0 u0Var2 = this.h;
        if (X) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        u0Var2.setScaleX(f10);
        org.telegram.ui.ActionBar.u0 u0Var3 = this.h;
        if (X) {
            f13 = 1.0f;
        }
        u0Var3.setScaleY(f13);
    }

    public final String W() {
        int i10 = getMessagesController().starsPaidMessageCommissionPermille;
        return LocaleController.formatString(R.string.PostSuggestionsPriceInfo2, gi.l.H0(i10), String.valueOf(((int) (((((float) this.v) * (i10 / 1000.0f)) / 1000.0d) * getMessagesController().starsUsdWithdrawRate1000)) / 100.0d));
    }

    public final boolean X() {
        if (this.v == this.f35857r && this.f35858s == this.f35856n) {
            return false;
        }
        return true;
    }

    public final void Y() {
        long j10;
        long j11;
        if (this.e.f33027c <= 0.0f) {
            if (!X()) {
                finishFragment();
                return;
            }
            this.e.a(1.0f);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            MessagesController messagesController = getMessagesController();
            long j12 = this.f35852a;
            updatepaidmessagesprice.channel = messagesController.getInputChannel(j12);
            boolean z10 = this.f35858s;
            if (z10) {
                j10 = this.v;
            } else {
                j10 = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j10;
            updatepaidmessagesprice.suggestions_allowed = z10;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new a50(19, this, updatepaidmessagesprice));
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j12));
            if (chat != null) {
                if (this.f35858s) {
                    chat.flags2 |= 65536;
                    chat.broadcast_messages_allowed = true;
                } else {
                    chat.flags2 &= -65537;
                    chat.broadcast_messages_allowed = false;
                }
                getMessagesController().putChat(chat, true);
                TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(chat.linked_monoforum_id));
                if (chat2 != null) {
                    if (this.f35858s) {
                        chat2.flags2 |= 16384;
                        chat2.send_paid_messages_stars = this.v;
                    } else {
                        chat2.flags2 &= -16385;
                        chat2.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().putChat(chat2, true);
                }
            }
            co coVar = this.f35859w;
            if (coVar != null) {
                if (this.f35858s) {
                    j11 = this.v;
                } else {
                    j11 = -1;
                }
                coVar.run(j11);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PostSuggestions));
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 21));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21519v8;
        org.telegram.ui.ActionBar.r6.z(kVar, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
        org.telegram.ui.Components.cq cqVar = new org.telegram.ui.Components.cq(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.f35855f = cqVar;
        this.e = new org.telegram.ui.Components.yr(mutate, cqVar);
        this.h = this.actionBar.m().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.e);
        V(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f21126a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.y7 y7Var = new org.telegram.ui.Cells.y7(context, this.resourceProvider);
        this.f35853b = y7Var;
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.r6.i(i11, y7Var, getResourceProvider());
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(context, this, null, true, true);
        this.f35854c = p90Var;
        p90Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), 0);
        org.telegram.ui.ActionBar.r6.i(i11, this.f35854c, getResourceProvider());
        this.f35854c.b(true);
        this.f35854c.d(0, null, false);
        org.telegram.ui.Components.i71 i71Var = new org.telegram.ui.Components.i71(context, this.currentAccount, this.classGuid, false, new f5(this, 16), new zv0(this, 2), null, this.resourceProvider);
        this.d = i71Var;
        i71Var.t1();
        frameLayout2.addView(this.d, w7.z5.e(-1, -1, 51));
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
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnsavedChanges);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.MessageSuggestionsUnsavedChanges);
                alertDialog$Builder.k(LocaleController.getString(R.string.ApplyTheme), new zv0(this, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Discard), new zv0(this, 1));
                showDialog(alertDialog$Builder.f20679a);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.a71 a71Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.i71 i71Var = this.d;
        if (i71Var != null && (a71Var = i71Var.Z2) != null) {
            a71Var.N(false);
            return true;
        }
        return true;
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            org.telegram.ui.Components.cq cqVar = this.f35855f;
            if (cqVar != null) {
                cqVar.b(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21519v8, false));
                org.telegram.ui.Components.yr yrVar = this.e;
                if (yrVar != null) {
                    yrVar.invalidateSelf();
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
