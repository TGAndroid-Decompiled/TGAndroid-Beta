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
    public tc f39201w0;
    public float f39202x0;
    public boolean f39203y0;

    public n60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(n60 n60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && n60Var.getParentActivity() != null) {
            m60 m60Var = new m60(n60Var, n60Var, n60Var.getParentActivity(), i10, n60Var.currentAccount, n60Var.resourceProvider);
            m60Var.G1(canApplyBoost);
            m60Var.F1(n60Var.f35440c, true);
            m60Var.H1(n60Var.f35436a);
            m60Var.show();
            return;
        }
        n60Var.f39203y0 = false;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f35436a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f35440c != null && !this.f39203y0) {
            this.f39203y0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f35436a, this.f35440c, new k60(this, i10, 0));
        }
    }

    @Override
    public final void X0(boolean z4) {
        int i10;
        super.X0(z4);
        tc tcVar = this.f39201w0;
        if (tcVar != null) {
            TextView textView = tcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f35440c;
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
        org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21661d6, this.resourceProvider)), org.telegram.ui.ActionBar.k6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21626b7), 0, 0);
        pqVar.f30166w = true;
        this.L.setBackground(pqVar);
        tc tcVar = this.f39201w0;
        if (tcVar != null && !z4) {
            tcVar.f41502a.b(this.currentAccount, this.f35460s, false);
            this.f39201w0.f41503b.b(this.f35460s, false);
            this.f39201w0.e();
        }
    }

    @Override
    public final void c1() {
        mc mcVar;
        mc mcVar2;
        this.W = 0;
        boolean z4 = true;
        int i10 = 1 + 1;
        this.X = 1;
        this.Y = i10;
        int i11 = i10 + 2;
        this.O = i11;
        this.Z = i10 + 1;
        if (this.f35465w == 0 && this.f35460s < 0) {
            int i12 = this.f35439b0;
            this.f35439b0 = -1;
            if (i12 >= 0 && (mcVar2 = this.K) != null) {
                mcVar2.u(i12);
                this.K.m(this.Z);
            }
        } else {
            if (this.f35439b0 < 0) {
                z4 = false;
            }
            this.O = i10 + 3;
            this.f35439b0 = i11;
            if (!z4 && (mcVar = this.K) != null) {
                mcVar.o(i11);
                this.K.m(this.Z);
                this.J.u0(0);
            }
        }
        int i13 = this.O;
        this.f35437a0 = i13;
        this.f35444e0 = i13 + 1;
        this.f35446f0 = i13 + 2;
        this.f35441c0 = i13 + 3;
        this.O = i13 + 5;
        this.f35442d0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f35436a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.O;
            this.f35447g0 = i14;
            this.O = i14 + 2;
            this.f35448h0 = i14 + 1;
        } else {
            this.f35447g0 = -1;
            this.f35448h0 = -1;
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
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f20846id == (-this.f35436a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tc tcVar = this.f39201w0;
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
