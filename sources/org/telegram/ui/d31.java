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
public final class d31 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f32906a;
    public org.telegram.ui.Components.wl0 f32907b;
    public z21 f32908c;
    public int d;
    public int e;
    public int f32909f;
    public int h;
    public b31 f32910n;

    public d31() {
        super(null);
        this.e = -1;
    }

    public static void U(d31 d31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !d31Var.getUserConfig().isPremium()) {
                d31Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) d31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(d31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            d31Var.f32907b.getAdapter().q(0, d31Var.f32907b.getAdapter().h());
        } else if (view instanceof c31) {
            c31 c31Var = (c31) view;
            if (d31Var.f32910n == null) {
                r61[] r61VarArr = new r61[1];
                org.telegram.ui.Components.o5 o5Var = c31Var.f32554a;
                if (o5Var != null) {
                    o5Var.f();
                    c31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(o5Var.getBounds());
                    i11 = (-(c31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                a31 a31Var = new a31(d31Var, d31Var, d31Var.getParentActivity(), Integer.valueOf(i10), c31Var, r61VarArr);
                String doubleTapReaction = d31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        a31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = d31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f49397f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                a31Var.setRecentReactions(arrayList);
                a31Var.setSaveState(3);
                a31Var.y(o5Var, c31Var);
                b31 b31Var = new b31(d31Var, a31Var);
                d31Var.f32910n = b31Var;
                r61VarArr[0] = b31Var;
                b31Var.showAsDropDown(c31Var, 0, i11, 53);
                r61VarArr[0].b();
            }
        }
    }

    public static int Y(d31 d31Var) {
        return d31Var.currentAccount;
    }

    public static int Z(d31 d31Var) {
        return d31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f32909f = i10;
            return;
        }
        this.f32909f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 25));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.f32907b = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f32907b);
        ((s4.j) this.f32907b.getItemAnimator()).f42996m = false;
        this.f32907b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.wl0 wl0Var2 = this.f32907b;
        z21 z21Var = new z21(this, context);
        this.f32908c = z21Var;
        wl0Var2.setAdapter(z21Var);
        this.f32907b.setOnItemClickListener(new r21(this, 1));
        linearLayout.addView(this.f32907b, w7.y5.n(-1, -1));
        this.f32906a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19004a7, false));
        this.f32908c.l();
        c0();
        return this.f32906a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f32908c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f32908c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.b6.a(new oy0(4, this), org.telegram.ui.ActionBar.h6.f19060d6, org.telegram.ui.ActionBar.h6.G6, org.telegram.ui.ActionBar.h6.f19462z6, org.telegram.ui.ActionBar.h6.f19149i6, org.telegram.ui.ActionBar.h6.f19004a7, org.telegram.ui.ActionBar.h6.B6, org.telegram.ui.ActionBar.h6.f19280p7, org.telegram.ui.ActionBar.h6.f19096f6, org.telegram.ui.ActionBar.h6.f19114g6, org.telegram.ui.ActionBar.h6.O6, org.telegram.ui.ActionBar.h6.P6, org.telegram.ui.ActionBar.h6.Q6, org.telegram.ui.ActionBar.h6.R6);
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
        this.f32907b.setPadding(0, 0, 0, i13);
        this.f32907b.setClipToPadding(false);
    }
}
