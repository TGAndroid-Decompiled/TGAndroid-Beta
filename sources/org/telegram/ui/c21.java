package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class c21 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f36197a;
    public org.telegram.ui.Components.lm0 f36198b;
    public y11 f36199c;
    public int d;
    public int e;
    public int f36200f;
    public int h;
    public a21 f36201n;

    public c21() {
        super(null);
        this.e = -1;
    }

    public static void U(c21 c21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.f23940n && !c21Var.getUserConfig().isPremium()) {
                c21Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) c21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(c21Var.currentAccount).setDoubleTapReaction(xVar.f23939f.reaction);
            c21Var.f36198b.getAdapter().q(0, c21Var.f36198b.getAdapter().h());
        } else if (view instanceof b21) {
            b21 b21Var = (b21) view;
            if (c21Var.f36201n == null) {
                r51[] r51VarArr = new r51[1];
                org.telegram.ui.Components.n5 n5Var = b21Var.f35902a;
                if (n5Var != null) {
                    n5Var.f();
                    b21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(n5Var.getBounds());
                    i11 = (-(b21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                z11 z11Var = new z11(c21Var, c21Var, c21Var.getParentActivity(), Integer.valueOf(i10), b21Var, r51VarArr);
                String doubleTapReaction = c21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        z11Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = c21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f784f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                z11Var.setRecentReactions(arrayList);
                z11Var.setSaveState(3);
                z11Var.y(n5Var, b21Var);
                a21 a21Var = new a21(c21Var, z11Var);
                c21Var.f36201n = a21Var;
                r51VarArr[0] = a21Var;
                a21Var.showAsDropDown(b21Var, 0, i11, 53);
                r51VarArr[0].b();
            }
        }
    }

    public static int Y(c21 c21Var) {
        return c21Var.currentAccount;
    }

    public static int Z(c21 c21Var) {
        return c21Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f36200f = i10;
            return;
        }
        this.f36200f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s60(this, 28));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.lm0 lm0Var = new org.telegram.ui.Components.lm0(context, null);
        this.f36198b = lm0Var;
        lm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f36198b);
        ((s4.k) this.f36198b.getItemAnimator()).f46376m = false;
        this.f36198b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.lm0 lm0Var2 = this.f36198b;
        y11 y11Var = new y11(this, context);
        this.f36199c = y11Var;
        lm0Var2.setAdapter(y11Var);
        this.f36198b.setOnItemClickListener(new i11(this, 1));
        linearLayout.addView(this.f36198b, w7.z5.n(-1, -1));
        this.f36197a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false));
        this.f36199c.l();
        c0();
        return this.f36197a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f36199c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f36199c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(21, this), org.telegram.ui.ActionBar.k6.f21184d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f21589z6, org.telegram.ui.ActionBar.k6.f21273i6, org.telegram.ui.ActionBar.k6.f21126a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21405p7, org.telegram.ui.ActionBar.k6.f21220f6, org.telegram.ui.ActionBar.k6.f21237g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
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
        this.f36198b.setPadding(0, 0, 0, i13);
        this.f36198b.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            LinearLayout linearLayout = this.f36197a;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21126a7, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
