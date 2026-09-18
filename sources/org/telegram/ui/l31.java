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
public final class l31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f35233a;
    public org.telegram.ui.Components.wl0 f35234b;
    public h31 f35235c;
    public int d;
    public int e;
    public int f35236f;
    public int h;
    public j31 f35237n;

    public l31() {
        super(null);
        this.e = -1;
    }

    public static void U(l31 l31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !l31Var.getUserConfig().isPremium()) {
                l31Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) l31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(l31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            l31Var.f35234b.getAdapter().q(0, l31Var.f35234b.getAdapter().h());
        } else if (view instanceof k31) {
            k31 k31Var = (k31) view;
            if (l31Var.f35237n == null) {
                x61[] x61VarArr = new x61[1];
                org.telegram.ui.Components.o5 o5Var = k31Var.f34979a;
                if (o5Var != null) {
                    o5Var.f();
                    k31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(o5Var.getBounds());
                    i11 = (-(k31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                i31 i31Var = new i31(l31Var, l31Var, l31Var.getParentActivity(), Integer.valueOf(i10), k31Var, x61VarArr);
                String doubleTapReaction = l31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        i31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = l31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f49377f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                i31Var.setRecentReactions(arrayList);
                i31Var.setSaveState(3);
                i31Var.y(o5Var, k31Var);
                j31 j31Var = new j31(l31Var, i31Var);
                l31Var.f35237n = j31Var;
                x61VarArr[0] = j31Var;
                j31Var.showAsDropDown(k31Var, 0, i11, 53);
                x61VarArr[0].b();
            }
        }
    }

    public static int Y(l31 l31Var) {
        return l31Var.currentAccount;
    }

    public static int Z(l31 l31Var) {
        return l31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f35236f = i10;
            return;
        }
        this.f35236f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f35234b = wl0Var;
        wl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f35234b);
        ((s4.j) this.f35234b.getItemAnimator()).f42964m = false;
        this.f35234b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.wl0 wl0Var2 = this.f35234b;
        h31 h31Var = new h31(this, context);
        this.f35235c = h31Var;
        wl0Var2.setAdapter(h31Var);
        this.f35234b.setOnItemClickListener(new z21(this, 1));
        linearLayout.addView(this.f35234b, w7.y5.n(-1, -1));
        this.f35233a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19006a7, false));
        this.f35235c.l();
        c0();
        return this.f35233a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f35235c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f35235c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new wy0(4, this), org.telegram.ui.ActionBar.j6.f19062d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f19464z6, org.telegram.ui.ActionBar.j6.f19152i6, org.telegram.ui.ActionBar.j6.f19006a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f19283p7, org.telegram.ui.ActionBar.j6.f19098f6, org.telegram.ui.ActionBar.j6.f19116g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
        this.f35234b.setPadding(0, 0, 0, i13);
        this.f35234b.setClipToPadding(false);
    }
}
