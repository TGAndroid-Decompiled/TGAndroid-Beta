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
public final class i21 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f39110a;
    public org.telegram.ui.Components.jl0 f39111b;
    public e21 f39112c;
    public int d;
    public int f39113e;
    public int f39114f;
    public int h;
    public g21 f39115n;

    public i21() {
        super(null);
        this.f39113e = -1;
    }

    public static void U(i21 i21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !i21Var.getUserConfig().isPremium()) {
                i21Var.showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) i21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(i21Var.currentAccount).setDoubleTapReaction(yVar.f25977e.reaction);
            i21Var.f39111b.getAdapter().q(0, i21Var.f39111b.getAdapter().h());
        } else if (view instanceof h21) {
            h21 h21Var = (h21) view;
            if (i21Var.f39115n == null) {
                u51[] u51VarArr = new u51[1];
                org.telegram.ui.Components.n5 n5Var = h21Var.f38746a;
                if (n5Var != null) {
                    n5Var.f();
                    h21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(n5Var.getBounds());
                    i11 = (-(h21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                f21 f21Var = new f21(i21Var, i21Var, i21Var.getParentActivity(), Integer.valueOf(i10), h21Var, u51VarArr);
                String doubleTapReaction = i21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        f21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = i21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f13825f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                f21Var.setRecentReactions(arrayList);
                f21Var.setSaveState(3);
                f21Var.y(n5Var, h21Var);
                g21 g21Var = new g21(i21Var, f21Var);
                i21Var.f39115n = g21Var;
                u51VarArr[0] = g21Var;
                g21Var.showAsDropDown(h21Var, 0, i11, 53);
                u51VarArr[0].b();
            }
        }
    }

    public static int Y(i21 i21Var) {
        return i21Var.currentAccount;
    }

    public static int Z(i21 i21Var) {
        return i21Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.f39113e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f39114f = i10;
            return;
        }
        this.f39114f = -1;
        this.f39113e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new al0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.jl0 jl0Var = new org.telegram.ui.Components.jl0(context, null);
        this.f39111b = jl0Var;
        jl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.f39111b);
        ((f2.l) this.f39111b.getItemAnimator()).f6463m = false;
        this.f39111b.setLayoutManager(new f2.j0());
        org.telegram.ui.Components.jl0 jl0Var2 = this.f39111b;
        e21 e21Var = new e21(this, context);
        this.f39112c = e21Var;
        jl0Var2.setAdapter(e21Var);
        this.f39111b.setOnItemClickListener(new d21(this, 0));
        linearLayout.addView(this.f39111b, i7.f6.n(-1, -1));
        this.f39110a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23009a7, false));
        this.f39112c.l();
        c0();
        return this.f39110a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f39112c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f39112c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return i7.i6.a(new rx0(4, this), org.telegram.ui.ActionBar.g6.f23062d6, org.telegram.ui.ActionBar.g6.G6, org.telegram.ui.ActionBar.g6.f23450z6, org.telegram.ui.ActionBar.g6.f23152i6, org.telegram.ui.ActionBar.g6.f23009a7, org.telegram.ui.ActionBar.g6.B6, org.telegram.ui.ActionBar.g6.f23279p7, org.telegram.ui.ActionBar.g6.f23099f6, org.telegram.ui.ActionBar.g6.f23117g6, org.telegram.ui.ActionBar.g6.O6, org.telegram.ui.ActionBar.g6.P6, org.telegram.ui.ActionBar.g6.Q6, org.telegram.ui.ActionBar.g6.R6);
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
        this.f39111b.setPadding(0, 0, 0, i13);
        this.f39111b.setClipToPadding(false);
    }
}
