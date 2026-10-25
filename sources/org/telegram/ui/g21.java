package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class g21 extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.mm0 f39523a;
    public c21 f39524b;
    public int f39525c;
    public int d;
    public int e;
    public int f39526f;
    public NotificationCenter.ObserversGroup h;
    public e21 f39527n;

    public g21() {
        super(null);
        this.d = -1;
    }

    public static void V(g21 g21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.f25678n && !g21Var.getUserConfig().isPremium()) {
                g21Var.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) g21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(g21Var.currentAccount).setDoubleTapReaction(xVar.f25677f.reaction);
            g21Var.f39523a.getAdapter().q(0, g21Var.f39523a.getAdapter().h());
        } else if (view instanceof f21) {
            f21 f21Var = (f21) view;
            if (g21Var.f39527n == null) {
                t51[] t51VarArr = new t51[1];
                org.telegram.ui.Components.r5 r5Var = f21Var.f39242a;
                if (r5Var != null) {
                    r5Var.f();
                    f21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(r5Var.getBounds());
                    i11 = (-(f21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                d21 d21Var = new d21(g21Var, g21Var, g21Var.getParentActivity(), Integer.valueOf(i10), f21Var, t51VarArr);
                String doubleTapReaction = g21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        d21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = g21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f4208f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                d21Var.setRecentReactions(arrayList);
                d21Var.setSaveState(3);
                d21Var.y(r5Var, f21Var);
                e21 e21Var = new e21(g21Var, d21Var);
                g21Var.f39527n = e21Var;
                t51VarArr[0] = e21Var;
                e21Var.showAsDropDown(f21Var, 0, i11, 53);
                t51VarArr[0].b();
            }
        }
    }

    public static int Z(g21 g21Var) {
        return g21Var.currentAccount;
    }

    public static int a0(g21 g21Var) {
        return g21Var.currentAccount;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setActionBarMenuOnItemClick(new p11(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f39523a = mm0Var;
        mm0Var.u1();
        this.f39523a.setSectionsDrawBackground(true);
        ((s4.l) this.f39523a.getItemAnimator()).f47760m = false;
        this.f39523a.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f39523a;
        c21 c21Var = new c21(this, context);
        this.f39524b = c21Var;
        mm0Var2.setAdapter(c21Var);
        this.f39523a.setOnItemClickListener(new m11(this, 1));
        frameLayout.addView(this.f39523a, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f39524b.l();
        d0();
        return frameLayout;
    }

    public final void d0() {
        this.f39526f = 2;
        this.f39525c = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.d = -1;
            int i10 = this.f39526f;
            this.f39526f = i10 + 1;
            this.e = i10;
            return;
        }
        this.e = -1;
        this.d = this.f39526f;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f39524b.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                d0();
                this.f39524b.l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.f39523a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return org.telegram.ui.Components.gb1.C(new j6(21, this), org.telegram.ui.ActionBar.y6.f23354d6, org.telegram.ui.ActionBar.y6.G6, org.telegram.ui.ActionBar.y6.f23765z6, org.telegram.ui.ActionBar.y6.f23446i6, org.telegram.ui.ActionBar.y6.f23297a7, org.telegram.ui.ActionBar.y6.B6, org.telegram.ui.ActionBar.y6.f23579p7, org.telegram.ui.ActionBar.y6.f23391f6, org.telegram.ui.ActionBar.y6.f23410g6, org.telegram.ui.ActionBar.y6.O6, org.telegram.ui.ActionBar.y6.P6, org.telegram.ui.ActionBar.y6.Q6, org.telegram.ui.ActionBar.y6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.h;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.h = null;
        }
        this.h = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.reactionsDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.h;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.h = null;
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
