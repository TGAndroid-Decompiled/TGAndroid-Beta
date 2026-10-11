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
public final class k31 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f39180a;
    public org.telegram.ui.Components.sm0 f39181b;
    public g31 f39182c;
    public int d;
    public int f39183e;
    public int f39184f;
    public int h;
    public i31 f39185n;

    public k31() {
        super(null);
        this.f39183e = -1;
    }

    public static void U(k31 k31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.f23744n && !k31Var.getUserConfig().isPremium()) {
                k31Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) k31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(k31Var.currentAccount).setDoubleTapReaction(yVar.f23743f.reaction);
            k31Var.f39181b.getAdapter().q(0, k31Var.f39181b.getAdapter().h());
        } else if (view instanceof j31) {
            j31 j31Var = (j31) view;
            if (k31Var.f39185n == null) {
                a71[] a71VarArr = new a71[1];
                org.telegram.ui.Components.q5 q5Var = j31Var.f38828a;
                if (q5Var != null) {
                    q5Var.f();
                    j31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(q5Var.getBounds());
                    i11 = (-(j31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                h31 h31Var = new h31(k31Var, k31Var, k31Var.getParentActivity(), Integer.valueOf(i10), j31Var, a71VarArr);
                String doubleTapReaction = k31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        h31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = k31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f54704f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                h31Var.setRecentReactions(arrayList);
                h31Var.setSaveState(3);
                h31Var.y(q5Var, j31Var);
                i31 i31Var = new i31(k31Var, h31Var);
                k31Var.f39185n = i31Var;
                a71VarArr[0] = i31Var;
                i31Var.showAsDropDown(j31Var, 0, i11, 53);
                a71VarArr[0].b();
            }
        }
    }

    public static int Y(k31 k31Var) {
        return k31Var.currentAccount;
    }

    public static int Z(k31 k31Var) {
        return k31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f39183e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f39184f = i10;
            return;
        }
        this.f39184f = -1;
        this.f39183e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(context, null);
        this.f39181b = sm0Var;
        sm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39181b);
        ((s4.j) this.f39181b.getItemAnimator()).f47788m = false;
        this.f39181b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.sm0 sm0Var2 = this.f39181b;
        g31 g31Var = new g31(this, context);
        this.f39182c = g31Var;
        sm0Var2.setAdapter(g31Var);
        this.f39181b.setOnItemClickListener(new y21(this, 1));
        linearLayout.addView(this.f39181b, w7.x5.n(-1, -1));
        this.f39180a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20730a7, false));
        this.f39182c.l();
        c0();
        return this.f39180a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f39182c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f39182c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new vy0(4, this), org.telegram.ui.ActionBar.h6.f20786d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f21189z6, org.telegram.ui.ActionBar.h6.f20877i6, org.telegram.ui.ActionBar.h6.f20730a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f21007p7, org.telegram.ui.ActionBar.h6.f20823f6, org.telegram.ui.ActionBar.h6.f20842g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
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
        this.f39181b.setPadding(0, 0, 0, i13);
        this.f39181b.setClipToPadding(false);
    }
}
