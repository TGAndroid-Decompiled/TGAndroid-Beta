package org.telegram.ui;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
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
public final class n60 extends ad {
    public float A0;
    public boolean B0;
    public tc f35753z0;

    public n60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(n60 n60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && n60Var.getParentActivity() != null) {
            m60 m60Var = new m60(n60Var, n60Var, n60Var.getParentActivity(), i10, n60Var.currentAccount, n60Var.resourceProvider);
            m60Var.G1(canApplyBoost);
            m60Var.F1(n60Var.f32103c, true);
            m60Var.H1(n60Var.f32099a);
            m60Var.show();
            return;
        }
        n60Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.k g1(n60 n60Var) {
        return n60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h1(n60 n60Var) {
        return n60Var.actionBar;
    }

    @Override
    public final int A0() {
        return R.string.GroupEmojiPackInfo;
    }

    @Override
    public final int B0() {
        return R.string.GroupEmojiPack;
    }

    @Override
    public final int E0() {
        return R.string.GroupEmojiStatusInfo;
    }

    @Override
    public final int F0() {
        return getMessagesController().groupEmojiStatusLevelMin;
    }

    @Override
    public final int G0() {
        return R.string.GroupEmojiStatus;
    }

    @Override
    public final int H0() {
        return getMessagesController().groupEmojiStickersLevelMin;
    }

    @Override
    public final int I0() {
        return 4;
    }

    @Override
    public final int J0() {
        return getMessagesController().groupProfileBgIconLevelMin;
    }

    @Override
    public final int K0() {
        return R.string.GroupProfileInfo;
    }

    @Override
    public final int L0() {
        return R.string.GroupStickerPackInfo;
    }

    @Override
    public final int M0() {
        return R.string.GroupStickerPack;
    }

    @Override
    public final int N0() {
        return R.string.GroupWallpaper2Info;
    }

    @Override
    public final int O0() {
        return getMessagesController().groupWallpaperLevelMin;
    }

    @Override
    public final int P0() {
        return R.string.GroupWallpaper;
    }

    @Override
    public final boolean R0() {
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f32099a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f32103c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f32099a, this.f32103c, new ci.l4(this, i10, 5));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        tc tcVar = this.f35753z0;
        if (tcVar != null) {
            TextView textView = tcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f32103c;
            if (tL_premium_boostsStatus != null) {
                i10 = tL_premium_boostsStatus.boosts;
            } else {
                i10 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i10, new Object[0])));
        }
    }

    @Override
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.qq qqVar = new org.telegram.ui.Components.qq(new ColorDrawable(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, this.resourceProvider)), org.telegram.ui.ActionBar.h6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7), 0, 0);
        qqVar.f27739w = true;
        this.O.setBackground(qqVar);
        tc tcVar = this.f35753z0;
        if (tcVar != null && !z10) {
            tcVar.f38043a.b(this.currentAccount, this.f32122s, false);
            this.f35753z0.f38044b.b(this.f32122s, false);
            this.f35753z0.e();
        }
    }

    @Override
    public final void c1() {
        mc mcVar;
        mc mcVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f32100a0 = 1;
        this.f32102b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f32104c0 = i10 + 1;
        if (this.f32127w == 0 && this.f32122s < 0) {
            int i12 = this.f32106e0;
            this.f32106e0 = -1;
            if (i12 >= 0 && (mcVar2 = this.N) != null) {
                mcVar2.u(i12);
                this.N.m(this.f32104c0);
            }
        } else {
            if (this.f32106e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f32106e0 = i11;
            if (!z10 && (mcVar = this.N) != null) {
                mcVar.o(i11);
                this.N.m(this.f32104c0);
                this.M.u0(0);
            }
        }
        int i13 = this.R;
        this.f32105d0 = i13;
        this.f32110h0 = i13 + 1;
        this.f32111i0 = i13 + 2;
        this.f32108f0 = i13 + 3;
        this.R = i13 + 5;
        this.f32109g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f32099a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f32112j0 = i14;
            this.R = i14 + 2;
            this.f32113k0 = i14 + 1;
        } else {
            this.f32112j0 = -1;
            this.f32113k0 = -1;
        }
        int i15 = this.R;
        this.S = i15;
        this.W = i15 + 1;
        this.X = i15 + 2;
        this.R = i15 + 4;
        this.Y = i15 + 3;
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new k60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f18336id == (-this.f32099a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tc tcVar = this.f35753z0;
        if (tcVar != null) {
            tcVar.a();
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
    public final void x0() {
        l60 l60Var = new l60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = l60Var;
        l60Var.setOnScrollListener(new i3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
