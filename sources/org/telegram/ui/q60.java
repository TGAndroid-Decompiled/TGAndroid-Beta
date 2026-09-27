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
public final class q60 extends cd {
    public float A0;
    public boolean B0;
    public vc f36619z0;

    public q60(long j3) {
        super(j3);
        this.d = true;
    }

    public static void e1(q60 q60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && q60Var.getParentActivity() != null) {
            p60 p60Var = new p60(q60Var, q60Var, q60Var.getParentActivity(), i10, q60Var.currentAccount, q60Var.resourceProvider);
            p60Var.G1(canApplyBoost);
            p60Var.F1(q60Var.f32665c, true);
            p60Var.H1(q60Var.f32661a);
            p60Var.show();
            return;
        }
        q60Var.B0 = false;
    }

    public static org.telegram.ui.ActionBar.l g1(q60 q60Var) {
        return q60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.l h1(q60 q60Var) {
        return q60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f32661a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f32665c != null && !this.B0) {
            this.B0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f32661a, this.f32665c, new ci.l4(this, i10, 5));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        vc vcVar = this.f36619z0;
        if (vcVar != null) {
            TextView textView = vcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f32665c;
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
        org.telegram.ui.Components.rq rqVar = new org.telegram.ui.Components.rq(new ColorDrawable(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, this.resourceProvider)), org.telegram.ui.ActionBar.i6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f19021b7), 0, 0);
        rqVar.f28069w = true;
        this.O.setBackground(rqVar);
        vc vcVar = this.f36619z0;
        if (vcVar != null && !z10) {
            vcVar.f38544a.b(this.currentAccount, this.f32684s, false);
            this.f36619z0.f38545b.b(this.f32684s, false);
            this.f36619z0.e();
        }
    }

    @Override
    public final void c1() {
        oc ocVar;
        oc ocVar2;
        this.Z = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.f32662a0 = 1;
        this.f32664b0 = i10;
        int i11 = i10 + 2;
        this.R = i11;
        this.f32666c0 = i10 + 1;
        if (this.f32689w == 0 && this.f32684s < 0) {
            int i12 = this.f32668e0;
            this.f32668e0 = -1;
            if (i12 >= 0 && (ocVar2 = this.N) != null) {
                ocVar2.u(i12);
                this.N.m(this.f32666c0);
            }
        } else {
            if (this.f32668e0 < 0) {
                z10 = false;
            }
            this.R = i10 + 3;
            this.f32668e0 = i11;
            if (!z10 && (ocVar = this.N) != null) {
                ocVar.o(i11);
                this.N.m(this.f32666c0);
                this.M.v0(0);
            }
        }
        int i13 = this.R;
        this.f32667d0 = i13;
        this.f32672h0 = i13 + 1;
        this.f32673i0 = i13 + 2;
        this.f32670f0 = i13 + 3;
        this.R = i13 + 5;
        this.f32671g0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f32661a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.R;
            this.f32674j0 = i14;
            this.R = i14 + 2;
            this.f32675k0 = i14 + 1;
        } else {
            this.f32674j0 = -1;
            this.f32675k0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new n60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f18330id == (-this.f32661a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        vc vcVar = this.f36619z0;
        if (vcVar != null) {
            vcVar.a();
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
        o60 o60Var = new o60(this, getParentActivity(), this.resourceProvider, 0);
        this.M = o60Var;
        o60Var.setOnScrollListener(new j3(this, 12));
        this.M.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
