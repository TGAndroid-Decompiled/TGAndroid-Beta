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
public final class n31 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f40197a;
    public org.telegram.ui.Components.wm0 f40198b;
    public j31 f40199c;
    public int d;
    public int f40200e;
    public int f40201f;
    public int h;
    public l31 f40202n;

    public n31() {
        super(null);
        this.f40200e = -1;
    }

    public static void U(n31 n31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.f23518n && !n31Var.getUserConfig().isPremium()) {
                n31Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) n31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(n31Var.currentAccount).setDoubleTapReaction(yVar.f23517f.reaction);
            n31Var.f40198b.getAdapter().q(0, n31Var.f40198b.getAdapter().h());
        } else if (view instanceof m31) {
            m31 m31Var = (m31) view;
            if (n31Var.f40202n == null) {
                e71[] e71VarArr = new e71[1];
                org.telegram.ui.Components.q5 q5Var = m31Var.f39906a;
                if (q5Var != null) {
                    q5Var.f();
                    m31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(q5Var.getBounds());
                    i11 = (-(m31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                k31 k31Var = new k31(n31Var, n31Var, n31Var.getParentActivity(), Integer.valueOf(i10), m31Var, e71VarArr);
                String doubleTapReaction = n31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        k31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = n31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f54849f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                k31Var.setRecentReactions(arrayList);
                k31Var.setSaveState(3);
                k31Var.y(q5Var, m31Var);
                l31 l31Var = new l31(n31Var, k31Var);
                n31Var.f40202n = l31Var;
                e71VarArr[0] = l31Var;
                l31Var.showAsDropDown(m31Var, 0, i11, 53);
                e71VarArr[0].b();
            }
        }
    }

    public static int Y(n31 n31Var) {
        return n31Var.currentAccount;
    }

    public static int Z(n31 n31Var) {
        return n31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f40200e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f40201f = i10;
            return;
        }
        this.f40201f = -1;
        this.f40200e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 26));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.wm0 wm0Var = new org.telegram.ui.Components.wm0(context, null);
        this.f40198b = wm0Var;
        wm0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f40198b);
        ((s4.j) this.f40198b.getItemAnimator()).f47937m = false;
        this.f40198b.setLayoutManager(new s4.d0());
        org.telegram.ui.Components.wm0 wm0Var2 = this.f40198b;
        j31 j31Var = new j31(this, context);
        this.f40199c = j31Var;
        wm0Var2.setAdapter(j31Var);
        this.f40198b.setOnItemClickListener(new d21(this, 2));
        linearLayout.addView(this.f40198b, w7.w5.n(-1, -1));
        this.f40197a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20504a7, false));
        this.f40199c.l();
        c0();
        return this.f40197a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f40199c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f40199c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.z5.a(new yy0(4, this), org.telegram.ui.ActionBar.h6.f20560d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f20964z6, org.telegram.ui.ActionBar.h6.f20651i6, org.telegram.ui.ActionBar.h6.f20504a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f20781p7, org.telegram.ui.ActionBar.h6.f20597f6, org.telegram.ui.ActionBar.h6.f20616g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
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
        this.f40198b.setPadding(0, 0, 0, i13);
        this.f40198b.setClipToPadding(false);
    }
}
