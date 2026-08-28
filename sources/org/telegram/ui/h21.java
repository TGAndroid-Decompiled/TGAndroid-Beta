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
public final class h21 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f38655a;
    public org.telegram.ui.Components.wk0 f38656b;
    public d21 f38657c;
    public int d;
    public int f38658e;
    public int f38659f;
    public int h;
    public f21 f38660n;

    public h21() {
        super(null);
        this.f38658e = -1;
    }

    public static void T(h21 h21Var, View view) {
        int i9;
        int i10;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !h21Var.getUserConfig().isPremium()) {
                h21Var.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) h21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(h21Var.currentAccount).setDoubleTapReaction(yVar.f25974e.reaction);
            h21Var.f38656b.getAdapter().q(0, h21Var.f38656b.getAdapter().h());
        } else if (view instanceof g21) {
            g21 g21Var = (g21) view;
            if (h21Var.f38660n == null) {
                s51[] s51VarArr = new s51[1];
                org.telegram.ui.Components.i5 i5Var = g21Var.f38414a;
                if (i5Var != null) {
                    i5Var.f();
                    g21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(i5Var.getBounds());
                    i10 = (-(g21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i9 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                e21 e21Var = new e21(h21Var, h21Var, h21Var.getParentActivity(), Integer.valueOf(i9), g21Var, s51VarArr);
                String doubleTapReaction = h21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        e21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = h21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i11 = 0; i11 < reactionsList.size(); i11++) {
                    ?? obj = new Object();
                    obj.f10717f = reactionsList.get(i11).reaction;
                    arrayList.add(obj);
                }
                e21Var.setRecentReactions(arrayList);
                e21Var.setSaveState(3);
                e21Var.y(i5Var, g21Var);
                f21 f21Var = new f21(h21Var, e21Var);
                h21Var.f38660n = f21Var;
                s51VarArr[0] = f21Var;
                f21Var.showAsDropDown(g21Var, 0, i10, 53);
                s51VarArr[0].b();
            }
        }
    }

    public static int X(h21 h21Var) {
        return h21Var.currentAccount;
    }

    public static int Y(h21 h21Var) {
        return h21Var.currentAccount;
    }

    public final void b0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f38658e = -1;
            int i9 = this.h;
            this.h = i9 + 1;
            this.f38659f = i9;
            return;
        }
        this.f38659f = -1;
        this.f38658e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 20));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.wk0 wk0Var = new org.telegram.ui.Components.wk0(context, null);
        this.f38656b = wk0Var;
        wk0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f38656b);
        ((f2.n) this.f38656b.getItemAnimator()).f5532m = false;
        this.f38656b.setLayoutManager(new f2.m0());
        org.telegram.ui.Components.wk0 wk0Var2 = this.f38656b;
        d21 d21Var = new d21(this, context);
        this.f38657c = d21Var;
        wk0Var2.setAdapter(d21Var);
        this.f38656b.setOnItemClickListener(new c21(this, 0));
        linearLayout.addView(this.f38656b, g7.e6.n(-1, -1));
        this.f38655a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f22947a7, false));
        this.f38657c.l();
        b0();
        return this.f38655a;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i10 == this.currentAccount) {
            if (i9 == NotificationCenter.reactionsDidLoad) {
                this.f38657c.l();
            } else if (i9 == NotificationCenter.currentUserPremiumStatusChanged) {
                b0();
                this.f38657c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return g7.h6.a(new sx0(4, this), org.telegram.ui.ActionBar.f6.f23001d6, org.telegram.ui.ActionBar.f6.G6, org.telegram.ui.ActionBar.f6.f23386z6, org.telegram.ui.ActionBar.f6.f23092i6, org.telegram.ui.ActionBar.f6.f22947a7, org.telegram.ui.ActionBar.f6.B6, org.telegram.ui.ActionBar.f6.f23212p7, org.telegram.ui.ActionBar.f6.f23037f6, org.telegram.ui.ActionBar.f6.f23055g6, org.telegram.ui.ActionBar.f6.O6, org.telegram.ui.ActionBar.f6.P6, org.telegram.ui.ActionBar.f6.Q6, org.telegram.ui.ActionBar.f6.R6);
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
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.f38656b.setPadding(0, 0, 0, i12);
        this.f38656b.setClipToPadding(false);
    }
}
