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
    public LinearLayout f35320a;
    public org.telegram.ui.Components.ll0 f35321b;
    public h31 f35322c;
    public int d;
    public int e;
    public int f35323f;
    public int h;
    public j31 f35324n;

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
            l31Var.f35321b.getAdapter().q(0, l31Var.f35321b.getAdapter().h());
        } else if (view instanceof k31) {
            k31 k31Var = (k31) view;
            if (l31Var.f35324n == null) {
                x61[] x61VarArr = new x61[1];
                org.telegram.ui.Components.m5 m5Var = k31Var.f35017a;
                if (m5Var != null) {
                    m5Var.f();
                    k31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(m5Var.getBounds());
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
                    obj.f49127f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                i31Var.setRecentReactions(arrayList);
                i31Var.setSaveState(3);
                i31Var.y(m5Var, k31Var);
                j31 j31Var = new j31(l31Var, i31Var);
                l31Var.f35324n = j31Var;
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
            this.f35323f = i10;
            return;
        }
        this.f35323f = -1;
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
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f35321b = ll0Var;
        ll0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f35321b);
        ((s4.j) this.f35321b.getItemAnimator()).f42710m = false;
        this.f35321b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.f35321b;
        h31 h31Var = new h31(this, context);
        this.f35322c = h31Var;
        ll0Var2.setAdapter(h31Var);
        this.f35321b.setOnItemClickListener(new z21(this, 1));
        linearLayout.addView(this.f35321b, w7.x5.n(-1, -1));
        this.f35320a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18780a7, false));
        this.f35322c.l();
        c0();
        return this.f35320a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f35322c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f35322c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new wy0(4, this), org.telegram.ui.ActionBar.i6.f18836d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f19237z6, org.telegram.ui.ActionBar.i6.f18926i6, org.telegram.ui.ActionBar.i6.f18780a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f19056p7, org.telegram.ui.ActionBar.i6.f18872f6, org.telegram.ui.ActionBar.i6.f18890g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
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
        this.f35321b.setPadding(0, 0, 0, i13);
        this.f35321b.setClipToPadding(false);
    }
}
