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
public final class m60 extends bd {
    public uc f36199w0;
    public float f36200x0;
    public boolean f36201y0;

    public m60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(m60 m60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && m60Var.getParentActivity() != null) {
            l60 l60Var = new l60(m60Var, m60Var, m60Var.getParentActivity(), i10, m60Var.currentAccount, m60Var.resourceProvider);
            l60Var.G1(canApplyBoost);
            l60Var.F1(m60Var.f32914c, true);
            l60Var.H1(m60Var.f32910a);
            l60Var.show();
            return;
        }
        m60Var.f36201y0 = false;
    }

    public static org.telegram.ui.ActionBar.k g1(m60 m60Var) {
        return m60Var.actionBar;
    }

    public static org.telegram.ui.ActionBar.k h1(m60 m60Var) {
        return m60Var.actionBar;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f32910a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f32914c != null && !this.f36201y0) {
            this.f36201y0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f32910a, this.f32914c, new j60(this, i10, 0));
        }
    }

    @Override
    public final void X0(boolean z4) {
        int i10;
        super.X0(z4);
        uc ucVar = this.f36199w0;
        if (ucVar != null) {
            TextView textView = ucVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f32914c;
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
        org.telegram.ui.Components.nq nqVar = new org.telegram.ui.Components.nq(new ColorDrawable(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, this.resourceProvider)), org.telegram.ui.ActionBar.j6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19871b7), 0, 0);
        nqVar.f27342w = true;
        this.L.setBackground(nqVar);
        uc ucVar = this.f36199w0;
        if (ucVar != null && !z4) {
            ucVar.f38902a.b(this.currentAccount, this.f32933s, false);
            this.f36199w0.f38903b.b(this.f32933s, false);
            this.f36199w0.e();
        }
    }

    @Override
    public final void c1() {
        nc ncVar;
        nc ncVar2;
        this.W = 0;
        boolean z4 = true;
        int i10 = 1 + 1;
        this.X = 1;
        this.Y = i10;
        int i11 = i10 + 2;
        this.O = i11;
        this.Z = i10 + 1;
        if (this.f32938w == 0 && this.f32933s < 0) {
            int i12 = this.f32913b0;
            this.f32913b0 = -1;
            if (i12 >= 0 && (ncVar2 = this.K) != null) {
                ncVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f32913b0 < 0) {
                z4 = false;
            }
            this.O = i10 + 3;
            this.f32913b0 = i11;
            if (!z4 && (ncVar = this.K) != null) {
                ncVar.o(i11);
                this.K.m(this.Z);
                this.J.u0(0);
            }
        }
        int i13 = this.O;
        this.f32911a0 = i13;
        this.f32917e0 = i13 + 1;
        this.f32919f0 = i13 + 2;
        this.f32915c0 = i13 + 3;
        this.O = i13 + 5;
        this.f32916d0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f32910a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.O;
            this.f32920g0 = i14;
            this.O = i14 + 2;
            this.f32921h0 = i14 + 1;
        } else {
            this.f32920g0 = -1;
            this.f32921h0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new k60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f19185id == (-this.f32910a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uc ucVar = this.f36199w0;
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
    public final void x0() {
        lh.e1 e1Var = new lh.e1(this, getParentActivity(), this.resourceProvider, 28);
        this.J = e1Var;
        e1Var.setOnScrollListener(new l3(this, 12));
        this.J.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
