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
public final class a60 extends vc {
    public oc f36440v0;
    public float f36441w0;
    public boolean f36442x0;

    public a60(long j10) {
        super(j10);
        this.d = true;
    }

    public static void e1(a60 a60Var, int i10, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (canApplyBoost != null && a60Var.getParentActivity() != null) {
            z50 z50Var = new z50(a60Var, a60Var, a60Var.getParentActivity(), i10, a60Var.currentAccount, a60Var.resourceProvider);
            z50Var.G1(canApplyBoost);
            z50Var.F1(a60Var.f43506c, true);
            z50Var.H1(a60Var.f43502a);
            z50Var.show();
            return;
        }
        a60Var.f36442x0 = false;
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
        return ChatObject.isForum(getMessagesController().getChat(Long.valueOf(-this.f43502a)));
    }

    @Override
    public final void T0(int i10) {
        if (this.f43506c != null && !this.f36442x0) {
            this.f36442x0 = true;
            MessagesController.getInstance(this.currentAccount).getBoostsController().userCanBoostChannel(this.f43502a, this.f43506c, new nh.z3(this, i10, 1));
        }
    }

    @Override
    public final void X0(boolean z10) {
        int i10;
        super.X0(z10);
        oc ocVar = this.f36440v0;
        if (ocVar != null) {
            TextView textView = ocVar.d;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f43506c;
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
        org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(new ColorDrawable(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, this.resourceProvider)), org.telegram.ui.ActionBar.g6.V0(getParentActivity(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7), 0, 0);
        jqVar.f29792w = true;
        this.K.setBackground(jqVar);
        oc ocVar = this.f36440v0;
        if (ocVar != null && !z10) {
            ocVar.f41084a.b(this.currentAccount, this.f43526s, false);
            this.f36440v0.f41085b.b(this.f43526s, false);
            this.f36440v0.e();
        }
    }

    @Override
    public final void c1() {
        hc hcVar;
        hc hcVar2;
        this.V = 0;
        boolean z10 = true;
        int i10 = 1 + 1;
        this.W = 1;
        this.X = i10;
        int i11 = i10 + 2;
        this.N = i11;
        this.Y = i10 + 1;
        if (this.f43530w == 0 && this.f43526s < 0) {
            int i12 = this.f43503a0;
            this.f43503a0 = -1;
            if (i12 >= 0 && (hcVar2 = this.J) != null) {
                hcVar2.u(i12);
                this.J.m(this.Y);
            }
        } else {
            if (this.f43503a0 < 0) {
                z10 = false;
            }
            this.N = i10 + 3;
            this.f43503a0 = i11;
            if (!z10 && (hcVar = this.J) != null) {
                hcVar.o(i11);
                this.J.m(this.Y);
                this.I.u0(0);
            }
        }
        int i13 = this.N;
        this.Z = i13;
        this.f43508d0 = i13 + 1;
        this.f43510e0 = i13 + 2;
        this.f43505b0 = i13 + 3;
        this.N = i13 + 5;
        this.f43507c0 = i13 + 4;
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(-this.f43502a);
        if (chatFull != null && chatFull.can_set_stickers) {
            int i14 = this.N;
            this.f43512f0 = i14;
            this.N = i14 + 2;
            this.f43513g0 = i14 + 1;
        } else {
            this.f43512f0 = -1;
            this.f43513g0 = -1;
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
        View createView = super.createView(context);
        Z0(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setTitle("");
        ((ViewGroup) createView).addView(this.actionBar);
        createView.getViewTreeObserver().addOnGlobalLayoutListener(new y50(this, (FrameLayout) createView));
        return createView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        super.didReceivedNotification(i10, i11, objArr);
        if (i10 == NotificationCenter.chatInfoDidLoad && ((TLRPC.ChatFull) objArr[0]).f22393id == (-this.f43502a)) {
            b1();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oc ocVar = this.f36440v0;
        if (ocVar != null) {
            ocVar.a();
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
        jh.e1 e1Var = new jh.e1(this, getParentActivity(), this.resourceProvider, 29);
        this.I = e1Var;
        e1Var.setOnScrollListener(new m3(this, 12));
        this.I.setSections(true);
    }

    @Override
    public final int z0() {
        return getMessagesController().groupCustomWallpaperLevelMin;
    }
}
