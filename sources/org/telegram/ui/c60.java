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

public final class c60 extends xc {

    public qc f36972v0;

    public float f36973w0;

    public boolean f36974x0;

    public c60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(c60 c60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost == null || c60Var.getParentActivity() == null) {
            c60Var.f36974x0 = false;
            return;
        }
        b60 b60Var = new b60(c60Var, c60Var, c60Var.getParentActivity(), i10, c60Var.currentAccount, c60Var.resourceProvider);
        b60Var.G1(canApplyBoost);
        b60Var.F1(c60Var.f44384c, true);
        b60Var.H1(c60Var.f44380a);
        b60Var.show();
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f44380a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f44384c == null || this.f36974x0) {
            return;
        }
        this.f36974x0 = true;
        MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f44380a, this.f44384c, new lh.d4(this, i10, 1));
    }

    @Override
    public final void X0(boolean z10) {
        super.X0(z10);
        qc qcVar = this.f36972v0;
        if (qcVar != null) {
            TextView textView = qcVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f44384c;
            textView.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGroupBoostCount", tL_premium_boostsStatus != null ? tL_premium_boostsStatus.boosts : 0, new Object[0])));
        }
    }

    @Override
    public final void Z0(boolean z10) {
        super.Z0(z10);
        this.actionBar.setBackgroundColor(0);
        org.telegram.ui.Components.dq dqVar = new org.telegram.ui.Components.dq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, this.resourceProvider)), org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7), 0, 0);
        dqVar.f27828w = true;
        this.K.setBackground(dqVar);
        qc qcVar = this.f36972v0;
        if (qcVar == null || z10) {
            return;
        }
        qcVar.f41628a.b(this.currentAccount, this.f44404s, false);
        this.f36972v0.f41629b.b(this.f44404s, false);
        this.f36972v0.d();
    }

    @Override
    public final void c1() {
        jc jcVar;
        jc jcVar2;
        this.V = 0;
        int i10 = 1 + 1;
        this.W = 1;
        this.X = i10;
        int i11 = i10 + 2;
        this.N = i11;
        this.Y = i10 + 1;
        if (this.f44408w != 0 || this.f44404s >= 0) {
            boolean z10 = this.f44381a0 >= 0;
            this.N = i10 + 3;
            this.f44381a0 = i11;
            if (!z10 && (jcVar = this.J) != null) {
                jcVar.o(i11);
                this.J.m(this.Y);
                this.I.u0(0);
            }
        } else {
            int i12 = this.f44381a0;
            this.f44381a0 = -1;
            if (i12 >= 0 && (jcVar2 = this.J) != null) {
                jcVar2.u(i12);
                this.J.m(this.Y);
            }
        }
        int i13 = this.N;
        this.Z = i13;
        this.f44386d0 = i13 + 1;
        this.f44388e0 = i13 + 2;
        this.f44383b0 = i13 + 3;
        this.N = i13 + 5;
        this.f44385c0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f44380a);
        if (chatFull == null || !chatFull.can_set_stickers) {
            this.f44390f0 = -1;
            this.f44391g0 = -1;
        } else {
            int i14 = this.N;
            this.f44390f0 = i14;
            this.N = i14 + 2;
            this.f44391g0 = i14 + 1;
        }
        int i15 = this.N;
        this.O = i15;
        this.S = i15 + 1;
        this.T = i15 + 2;
        this.N = i15 + 4;
        this.U = i15 + 3;
    }

    @Override
    public final View createView(Context context) {
        View viewCreateView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) viewCreateView).addView(this.actionBar);
        viewCreateView.getViewTreeObserver().addOnGlobalLayoutListener(new z50(this, (FrameLayout) viewCreateView));
        return viewCreateView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f22381id == (-this.f44380a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qc qcVar = this.f36972v0;
        if (qcVar != null) {
            qcVar.a();
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
        a60 a60Var = new a60(this, getParentActivity(), this.resourceProvider, 0);
        this.I = a60Var;
        a60Var.setOnScrollListener(new m3(this, 12));
        this.I.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
