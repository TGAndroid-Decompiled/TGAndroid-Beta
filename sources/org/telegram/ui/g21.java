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

public final class g21 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {

    public LinearLayout f38288a;

    public org.telegram.ui.Components.zk0 f38289b;

    public c21 f38290c;
    public int d;

    public int f38291e;

    public int f38292f;
    public int h;

    public e21 f38293n;

    public g21() {
        super(null);
        this.f38291e = -1;
    }

    public static void U(g21 g21Var, View view) {
        int iCenterX;
        int iDp;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !g21Var.getUserConfig().isPremium()) {
                g21Var.showDialog(new ag.g2((org.telegram.ui.ActionBar.n2) g21Var, 4, true));
                return;
            } else {
                MediaDataController.getInstance(g21Var.currentAccount).setDoubleTapReaction(yVar.f25970e.reaction);
                g21Var.f38289b.getAdapter().q(0, g21Var.f38289b.getAdapter().h());
                return;
            }
        }
        if (view instanceof f21) {
            f21 f21Var = (f21) view;
            if (g21Var.f38293n != null) {
                return;
            }
            r51[] r51VarArr = new r51[1];
            org.telegram.ui.Components.i5 i5Var = f21Var.f37914a;
            if (i5Var != null) {
                i5Var.f();
                f21Var.b();
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(i5Var.getBounds());
                iDp = (-(f21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                iCenterX = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
            } else {
                iCenterX = 0;
                iDp = 0;
            }
            d21 d21Var = new d21(g21Var, g21Var, g21Var.getParentActivity(), Integer.valueOf(iCenterX), f21Var, r51VarArr);
            String doubleTapReaction = g21Var.getMediaDataController().getDoubleTapReaction();
            if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                try {
                    d21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                } catch (Exception unused) {
                }
            }
            List<TLRPC.TL_availableReaction> reactionsList = g21Var.getMediaDataController().getReactionsList();
            ArrayList arrayList = new ArrayList(20);
            for (int i10 = 0; i10 < reactionsList.size(); i10++) {
                ig.q0 q0Var = new ig.q0();
                q0Var.f11412f = reactionsList.get(i10).reaction;
                arrayList.add(q0Var);
            }
            d21Var.setRecentReactions(arrayList);
            d21Var.setSaveState(3);
            d21Var.y(i5Var, f21Var);
            e21 e21Var = new e21(g21Var, d21Var);
            g21Var.f38293n = e21Var;
            r51VarArr[0] = e21Var;
            e21Var.showAsDropDown(f21Var, 0, iDp, 53);
            r51VarArr[0].b();
        }
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f38292f = -1;
            this.f38291e = this.h;
        } else {
            this.f38291e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f38292f = i10;
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new pb0(this, 21));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.zk0 zk0Var = new org.telegram.ui.Components.zk0(context, null);
        this.f38289b = zk0Var;
        zk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38289b);
        ((f2.l) this.f38289b.getItemAnimator()).f5819m = false;
        this.f38289b.setLayoutManager(new f2.k0());
        org.telegram.ui.Components.zk0 zk0Var2 = this.f38289b;
        c21 c21Var = new c21(this, context);
        this.f38290c = c21Var;
        zk0Var2.setAdapter(c21Var);
        this.f38289b.setOnItemClickListener(new b21(this, 0));
        linearLayout.addView(this.f38289b, h7.z5.n(-1, -1));
        this.f38288a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f22999a7, false));
        this.f38290c.l();
        c0();
        return this.f38288a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 != this.currentAccount) {
            return;
        }
        if (i10 == NotificationCenter.reactionsDidLoad) {
            this.f38290c.l();
        } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
            c0();
            this.f38290c.l();
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return h7.c6.a(new sx0(4, this), org.telegram.ui.ActionBar.g6.f23053d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f23441z6, org.telegram.ui.ActionBar.g6.f23144i6, org.telegram.ui.ActionBar.g6.f22999a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f23269p7, org.telegram.ui.ActionBar.g6.f23090f6, org.telegram.ui.ActionBar.g6.f23108g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
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
        this.f38289b.setPadding(0, 0, 0, i13);
        this.f38289b.setClipToPadding(false);
    }
}
