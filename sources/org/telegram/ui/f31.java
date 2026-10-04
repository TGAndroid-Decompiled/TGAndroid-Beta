package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class f31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f36171a;
    public org.telegram.ui.Components.zl0 f36172b;
    public b31 f36173c;
    public int d;
    public int f36174e;
    public int f36175f;
    public int h;
    public d31 f36176n;

    public f31() {
        super(null);
        this.f36174e = -1;
    }

    public static void S(f31 f31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !f31Var.getUserConfig().isPremium()) {
                f31Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) f31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(f31Var.currentAccount).setDoubleTapReaction(yVar.f23743e.reaction);
            f31Var.f36172b.getAdapter().q(0, f31Var.f36172b.getAdapter().h());
        } else if (view instanceof e31) {
            e31 e31Var = (e31) view;
            if (f31Var.f36176n == null) {
                t61[] t61VarArr = new t61[1];
                org.telegram.ui.Components.o5 o5Var = e31Var.f35893a;
                if (o5Var != null) {
                    o5Var.f();
                    e31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(o5Var.getBounds());
                    i11 = (-(e31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                c31 c31Var = new c31(f31Var, f31Var, f31Var.getParentActivity(), Integer.valueOf(i10), e31Var, t61VarArr);
                String doubleTapReaction = f31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        c31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = f31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f53480f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                c31Var.setRecentReactions(arrayList);
                c31Var.setSaveState(3);
                c31Var.y(o5Var, e31Var);
                d31 d31Var = new d31(f31Var, c31Var);
                f31Var.f36176n = d31Var;
                t61VarArr[0] = d31Var;
                d31Var.showAsDropDown(e31Var, 0, i11, 53);
                t61VarArr[0].b();
            }
        }
    }

    public static int X(f31 f31Var) {
        return f31Var.currentAccount;
    }

    public static int Y(f31 f31Var) {
        return f31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f36174e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f36175f = i10;
            return;
        }
        this.f36175f = -1;
        this.f36174e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f36172b = zl0Var;
        zl0Var.s1();
        this.actionBar.setAdaptiveBackground(this.f36172b);
        ((s4.j) this.f36172b.getItemAnimator()).f46563m = false;
        this.f36172b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f36172b;
        b31 b31Var = new b31(this, context);
        this.f36173c = b31Var;
        zl0Var2.setAdapter(b31Var);
        this.f36172b.setOnItemClickListener(new t21(this, 1));
        linearLayout.addView(this.f36172b, w7.z5.n(-1, -1));
        this.f36171a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20762a7, false));
        this.f36173c.l();
        c0();
        return this.f36171a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f36173c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f36173c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new qy0(4, this), org.telegram.ui.ActionBar.i6.f20818d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f21224z6, org.telegram.ui.ActionBar.i6.f20909i6, org.telegram.ui.ActionBar.i6.f20762a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f21040p7, org.telegram.ui.ActionBar.i6.f20855f6, org.telegram.ui.ActionBar.i6.f20873g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.reactionsDidLoad);
        getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f36172b.setPadding(0, 0, 0, i13);
        this.f36172b.setClipToPadding(false);
    }
}
