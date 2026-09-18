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
public final class n31 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f35933a;
    public org.telegram.ui.Components.ml0 f35934b;
    public j31 f35935c;
    public int d;
    public int e;
    public int f35936f;
    public int h;
    public l31 f35937n;

    public n31() {
        super(null);
        this.e = -1;
    }

    public static void U(n31 n31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !n31Var.getUserConfig().isPremium()) {
                n31Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) n31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(n31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            n31Var.f35934b.getAdapter().q(0, n31Var.f35934b.getAdapter().h());
        } else if (view instanceof m31) {
            m31 m31Var = (m31) view;
            if (n31Var.f35937n == null) {
                z61[] z61VarArr = new z61[1];
                org.telegram.ui.Components.m5 m5Var = m31Var.f35680a;
                if (m5Var != null) {
                    m5Var.f();
                    m31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(m5Var.getBounds());
                    i11 = (-(m31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                k31 k31Var = new k31(n31Var, n31Var, n31Var.getParentActivity(), Integer.valueOf(i10), m31Var, z61VarArr);
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
                    obj.f49155f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                k31Var.setRecentReactions(arrayList);
                k31Var.setSaveState(3);
                k31Var.y(m5Var, m31Var);
                l31 l31Var = new l31(n31Var, k31Var);
                n31Var.f35937n = l31Var;
                z61VarArr[0] = l31Var;
                l31Var.showAsDropDown(m31Var, 0, i11, 53);
                z61VarArr[0].b();
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
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f35936f = i10;
            return;
        }
        this.f35936f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new x70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(context, null);
        this.f35934b = ml0Var;
        ml0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f35934b);
        ((s4.j) this.f35934b.getItemAnimator()).f42737m = false;
        this.f35934b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ml0 ml0Var2 = this.f35934b;
        j31 j31Var = new j31(this, context);
        this.f35935c = j31Var;
        ml0Var2.setAdapter(j31Var);
        this.f35934b.setOnItemClickListener(new b31(this, 1));
        linearLayout.addView(this.f35934b, w7.x5.n(-1, -1));
        this.f35933a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18807a7, false));
        this.f35935c.l();
        c0();
        return this.f35933a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f35935c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f35935c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new yy0(4, this), org.telegram.ui.ActionBar.j6.f18863d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f19264z6, org.telegram.ui.ActionBar.j6.f18953i6, org.telegram.ui.ActionBar.j6.f18807a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f19083p7, org.telegram.ui.ActionBar.j6.f18899f6, org.telegram.ui.ActionBar.j6.f18917g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
        this.f35934b.setPadding(0, 0, 0, i13);
        this.f35934b.setClipToPadding(false);
    }
}
