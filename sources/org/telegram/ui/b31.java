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
public final class b31 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f32723a;
    public org.telegram.ui.Components.rl0 f32724b;
    public x21 f32725c;
    public int d;
    public int e;
    public int f32726f;
    public int h;
    public z21 f32727n;

    public b31() {
        super(null);
        this.e = -1;
    }

    public static void U(b31 b31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !b31Var.getUserConfig().isPremium()) {
                b31Var.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) b31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(b31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            b31Var.f32724b.getAdapter().q(0, b31Var.f32724b.getAdapter().h());
        } else if (view instanceof a31) {
            a31 a31Var = (a31) view;
            if (b31Var.f32727n == null) {
                n61[] n61VarArr = new n61[1];
                org.telegram.ui.Components.j5 j5Var = a31Var.f32438a;
                if (j5Var != null) {
                    j5Var.f();
                    a31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(j5Var.getBounds());
                    i11 = (-(a31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                y21 y21Var = new y21(b31Var, b31Var, b31Var.getParentActivity(), Integer.valueOf(i10), a31Var, n61VarArr);
                String doubleTapReaction = b31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        y21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = b31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f14095f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                y21Var.setRecentReactions(arrayList);
                y21Var.setSaveState(3);
                y21Var.y(j5Var, a31Var);
                z21 z21Var = new z21(b31Var, y21Var);
                b31Var.f32727n = z21Var;
                n61VarArr[0] = z21Var;
                z21Var.showAsDropDown(a31Var, 0, i11, 53);
                n61VarArr[0].b();
            }
        }
    }

    public static int Y(b31 b31Var) {
        return b31Var.currentAccount;
    }

    public static int Z(b31 b31Var) {
        return b31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f32726f = i10;
            return;
        }
        this.f32726f = -1;
        this.e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ll0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(context, null);
        this.f32724b = rl0Var;
        rl0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f32724b);
        ((f2.l) this.f32724b.getItemAnimator()).f5807m = false;
        this.f32724b.setLayoutManager(new f2.i0());
        org.telegram.ui.Components.rl0 rl0Var2 = this.f32724b;
        x21 x21Var = new x21(this, context);
        this.f32725c = x21Var;
        rl0Var2.setAdapter(x21Var);
        this.f32724b.setOnItemClickListener(new p21(this, 1));
        linearLayout.addView(this.f32724b, k7.b6.n(-1, -1));
        this.f32723a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19827a7, false));
        this.f32725c.l();
        c0();
        return this.f32723a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f32725c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f32725c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return k7.e6.a(new jy0(4, this), org.telegram.ui.ActionBar.j6.f19881d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f20273z6, org.telegram.ui.ActionBar.j6.f19971i6, org.telegram.ui.ActionBar.j6.f19827a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20097p7, org.telegram.ui.ActionBar.j6.f19917f6, org.telegram.ui.ActionBar.j6.f19935g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
        this.f32724b.setPadding(0, 0, 0, i13);
        this.f32724b.setClipToPadding(false);
    }
}
