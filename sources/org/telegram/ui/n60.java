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
public final class n60 extends bd {
    public uc f39315w0;
    public float f39316x0;
    public boolean f39317y0;

    public n60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(n60 n60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && n60Var.getParentActivity() != null) {
            m60 m60Var = new m60(n60Var, n60Var, n60Var.getParentActivity(), i10, n60Var.currentAccount, n60Var.resourceProvider);
            m60Var.G1(canApplyBoost);
            m60Var.F1(n60Var.f35424c, true);
            m60Var.H1(n60Var.f35420a);
            m60Var.show();
            return;
        }
        n60Var.f39317y0 = false;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f35420a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f35424c != null && !this.f39317y0) {
            this.f39317y0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f35420a, this.f35424c, new k60(this, i10, 0));
        }
    }

    @Override
    public final void X0(boolean z4) {
        int i10;
        super.X0(z4);
        uc ucVar = this.f39315w0;
        if (ucVar != null) {
            TextView textView = ucVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f35424c;
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
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7), 0, 0);
        pqVar.f30173w = true;
        this.L.setBackground(pqVar);
        uc ucVar = this.f39315w0;
        if (ucVar != null && !z4) {
            ucVar.f41880a.b(this.currentAccount, this.f35444s, false);
            this.f39315w0.f41881b.b(this.f35444s, false);
            this.f39315w0.e();
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
        if (this.f35449w == 0 && this.f35444s < 0) {
            int i12 = this.f35423b0;
            this.f35423b0 = -1;
            if (i12 >= 0 && (ncVar2 = this.K) != null) {
                ncVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f35423b0 < 0) {
                z4 = false;
            }
            this.O = i10 + 3;
            this.f35423b0 = i11;
            if (!z4 && (ncVar = this.K) != null) {
                ncVar.o(i11);
                this.K.m(this.Z);
                this.J.u0(0);
            }
        }
        int i13 = this.O;
        this.f35421a0 = i13;
        this.f35428e0 = i13 + 1;
        this.f35430f0 = i13 + 2;
        this.f35425c0 = i13 + 3;
        this.O = i13 + 5;
        this.f35426d0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f35420a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.O;
            this.f35431g0 = i14;
            this.O = i14 + 2;
            this.f35432h0 = i14 + 1;
        } else {
            this.f35431g0 = -1;
            this.f35432h0 = -1;
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
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new l60(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f20844id == (-this.f35420a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uc ucVar = this.f39315w0;
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
        mh.d1 d1Var = new mh.d1(this, getParentActivity(), this.resourceProvider, 28);
        this.J = d1Var;
        d1Var.setOnScrollListener(new l3(this, 12));
        this.J.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
