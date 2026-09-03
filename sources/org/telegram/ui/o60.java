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
public final class o60 extends dd {
    public wc f36660w0;
    public float f36661x0;
    public boolean f36662y0;

    public o60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(o60 o60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && o60Var.getParentActivity() != null) {
            n60 n60Var = new n60(o60Var, o60Var, o60Var.getParentActivity(), i10, o60Var.currentAccount, o60Var.resourceProvider);
            n60Var.G1(canApplyBoost);
            n60Var.F1(o60Var.f33420c, true);
            n60Var.H1(o60Var.f33416a);
            n60Var.show();
            return;
        }
        o60Var.f36662y0 = false;
    }

    public static org.telegram.ui.ActionBar.k g1(o60 o60Var) {
        return o60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h1(o60 o60Var) {
        return o60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f33416a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f33420c != null && !this.f36662y0) {
            this.f36662y0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f33416a, this.f33420c, new l60(this, i10, 0));
        }
    }

    @Override
    public final void X0(boolean z4) {
        int i10;
        super.X0(z4);
        wc wcVar = this.f36660w0;
        if (wcVar != null) {
            TextView textView = wcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f33420c;
            if (tL_premium_boostsStatus != null) {
                i10 = tL_premium_boostsStatus.boosts;
            } else {
                i10 = 0;
            }
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", i10, new Object[0])));
        }
    }

    @Override
    public final void Z0(boolean z4) {
        super.Z0(z4);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19846b7), 0, 0);
        mqVar.f27116w = true;
        this.L.setBackground(mqVar);
        wc wcVar = this.f36660w0;
        if (wcVar != null && !z4) {
            wcVar.f39334a.b(this.currentAccount, this.f33439s, false);
            this.f36660w0.f39335b.b(this.f33439s, false);
            this.f36660w0.e();
        }
    }

    @Override
    public final void c1() {
        pc pcVar;
        pc pcVar2;
        this.W = 0;
        boolean z4 = true;
        int i10 = 1 + 1;
        this.X = 1;
        this.Y = i10;
        int i11 = i10 + 2;
        this.O = i11;
        this.Z = i10 + 1;
        if (this.f33444w == 0 && this.f33439s < 0) {
            int i12 = this.f33419b0;
            this.f33419b0 = -1;
            if (i12 >= 0 && (pcVar2 = this.K) != null) {
                pcVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f33419b0 < 0) {
                z4 = false;
            }
            this.O = i10 + 3;
            this.f33419b0 = i11;
            if (!z4 && (pcVar = this.K) != null) {
                pcVar.o(i11);
                this.K.m(this.Z);
                this.J.u0(0);
            }
        }
        int i13 = this.O;
        this.f33417a0 = i13;
        this.f33423e0 = i13 + 1;
        this.f33425f0 = i13 + 2;
        this.f33421c0 = i13 + 3;
        this.O = i13 + 5;
        this.f33422d0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f33416a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.O;
            this.f33426g0 = i14;
            this.O = i14 + 2;
            this.f33427h0 = i14 + 1;
        } else {
            this.f33426g0 = -1;
            this.f33427h0 = -1;
        }
        int i15 = this.O;
        this.P = i15;
        this.T = i15 + 1;
        this.U = i15 + 2;
        this.O = i15 + 4;
        this.V = i15 + 3;
    }

    @Override
    public final View createView(Context context) {
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new m60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f19160id == (-this.f33416a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wc wcVar = this.f36660w0;
        if (wcVar != null) {
            wcVar.a();
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
        lh.e1 e1Var = new lh.e1(this, getParentActivity(), this.resourceProvider, 28);
        this.J = e1Var;
        e1Var.setOnScrollListener(new n3(this, 12));
        this.J.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
