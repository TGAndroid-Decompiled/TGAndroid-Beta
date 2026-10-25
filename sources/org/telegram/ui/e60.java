package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class e60 extends bd {
    public float A0;
    public boolean B0;
    public uc f39005z0;

    public e60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void h1(e60 e60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && e60Var.getParentActivity() != null) {
            d60 d60Var = new d60(e60Var, e60Var, e60Var.getParentActivity(), i10, e60Var.currentAccount, e60Var.resourceProvider);
            d60Var.K1(canApplyBoost);
            d60Var.J1(e60Var.f38036c, true);
            d60Var.L1(e60Var.f38032a);
            d60Var.show();
            return;
        }
        e60Var.B0 = false;
    }

    @Override
    public final void A0() {
        k10 k10Var = new k10(this, getParentActivity(), this.resourceProvider, 1);
        this.M = k10Var;
        k10Var.setOnScrollListener(new i3(this, 13));
        this.M.setSections(true);
    }

    @Override
    public final int C0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }

    @Override
    public final int D0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override
    public final int E0() {
        return R.string.GroupEmojiPack;
    }

    @Override
    public final int H0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override
    public final int I0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override
    public final int J0() {
        return R.string.GroupEmojiStatus;
    }

    @Override
    public final int K0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override
    public final int L0() {
        return 4;
    }

    @Override
    public final int M0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override
    public final int N0() {
        return R.string.GroupProfileInfo;
    }

    @Override
    public final int O0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override
    public final int P0() {
        return R.string.GroupStickerPack;
    }

    @Override
    public final int Q0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override
    public final int R0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override
    public final int S0() {
        return R.string.GroupWallpaper;
    }

    @Override
    public final boolean U0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f38032a)));
    }

    @Override
    public final void W0(int i10) {
        if (this.f38036c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f38032a, this.f38036c, new fi.c4(this, i10, 5));
        }
    }

    @Override
    public final void a1(boolean z10) {
        int i10;
        super.a1(z10);
        uc ucVar = this.f39005z0;
        if (ucVar != null) {
            TextView textView = ucVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f38036c;
            if (tL_premium_boostsStatus != null) {
                i10 = tL_premium_boostsStatus.boosts;
            } else {
                i10 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i10, new Object[0])));
        }
    }

    @Override
    public final void c1(boolean z10) {
        super.c1(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(new ColorDrawable(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, this.resourceProvider)), org.telegram.ui.ActionBar.y6.X0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23316b7), 0, 0);
        arVar.f26597w = true;
        this.O.setBackground(arVar);
        this.M.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
        uc ucVar = this.f39005z0;
        if (ucVar != null && !z10) {
            ucVar.f44087a.b(this.currentAccount, this.f38055s, false);
            this.f39005z0.f44088b.b(this.f38055s, false);
            this.f39005z0.updateColors();
        }
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        c1(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new c60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f22028id == (-this.f38032a)) {
            e1();
        }
    }

    @Override
    public final void f1() {
        oc ocVar;
        oc ocVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f38033a0 = 1;
        this.f38035b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f38037c0 = i10 + 1;
        if (this.f38060w == 0 && this.f38055s < 0) {
            int i12 = this.f38039e0;
            this.f38039e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f38037c0);
            }
        } else {
            if (this.f38039e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f38039e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f38037c0);
                this.M.v0(0);
            }
        }
        int i13 = this.R;
        this.f38038d0 = i13;
        this.f38043h0 = i13 + 1;
        this.f38044i0 = i13 + 2;
        this.f38041f0 = i13 + 3;
        this.R = i13 + 5;
        this.f38042g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f38032a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f38045j0 = i14;
            this.R = i14 + 2;
            this.f38046k0 = i14 + 1;
        } else {
            this.f38045j0 = -1;
            this.f38046k0 = -1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uc ucVar = this.f39005z0;
        if (ucVar != null) {
            ucVar.a();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
    }

    @Override
    public final void y0() {
        x0();
        org.telegram.ui.Components.mm0 mm0Var = this.M;
        if (mm0Var != null) {
            mm0Var.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23297a7));
        }
        FrameLayout frameLayout = this.O;
        if (frameLayout != null && (frameLayout.getBackground() instanceof org.telegram.ui.Components.ar)) {
            Drawable drawable = ((org.telegram.ui.Components.ar) this.O.getBackground()).f26590a;
            if (drawable instanceof ColorDrawable) {
                ((ColorDrawable) drawable).setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23354d6, this.resourceProvider));
                this.O.invalidate();
            }
        }
    }
}
