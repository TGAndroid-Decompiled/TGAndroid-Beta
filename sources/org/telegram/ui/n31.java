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
public final class n31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f38820a;
    public org.telegram.ui.Components.ll0 f38821b;
    public j31 f38822c;
    public int d;
    public int f38823e;
    public int f38824f;
    public int h;
    public l31 f38825n;

    public n31() {
        super(null);
        this.f38823e = -1;
    }

    public static void U(n31 n31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !n31Var.getUserConfig().isPremium()) {
                n31Var.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) n31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(n31Var.currentAccount).setDoubleTapReaction(yVar.f23552e.reaction);
            n31Var.f38821b.getAdapter().q(0, n31Var.f38821b.getAdapter().h());
        } else if (view instanceof m31) {
            m31 m31Var = (m31) view;
            if (n31Var.f38825n == null) {
                a71[] a71VarArr = new a71[1];
                org.telegram.ui.Components.o5 o5Var = m31Var.f38562a;
                if (o5Var != null) {
                    o5Var.f();
                    m31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(o5Var.getBounds());
                    i11 = (-(m31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                k31 k31Var = new k31(n31Var, n31Var, n31Var.getParentActivity(), Integer.valueOf(i10), m31Var, a71VarArr);
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
                    obj.f597f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                k31Var.setRecentReactions(arrayList);
                k31Var.setSaveState(3);
                k31Var.y(o5Var, m31Var);
                l31 l31Var = new l31(n31Var, k31Var);
                n31Var.f38825n = l31Var;
                a71VarArr[0] = l31Var;
                l31Var.showAsDropDown(m31Var, 0, i11, 53);
                a71VarArr[0].b();
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
            this.f38823e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f38824f = i10;
            return;
        }
        this.f38824f = -1;
        this.f38823e = this.h;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new o70(this, 26));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(context, null);
        this.f38821b = ll0Var;
        ll0Var.o1();
        this.actionBar.setAdaptiveBackground(this.f38821b);
        ((s4.j) this.f38821b.getItemAnimator()).f45777m = false;
        this.f38821b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.ll0 ll0Var2 = this.f38821b;
        j31 j31Var = new j31(this, context);
        this.f38822c = j31Var;
        ll0Var2.setAdapter(j31Var);
        this.f38821b.setOnItemClickListener(new b31(this, 1));
        linearLayout.addView(this.f38821b, w7.x5.n(-1, -1));
        this.f38820a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20607a7, false));
        this.f38822c.l();
        c0();
        return this.f38820a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f38822c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f38822c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.a6.a(new xy0(4, this), org.telegram.ui.ActionBar.j6.f20663d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f21061z6, org.telegram.ui.ActionBar.j6.f20753i6, org.telegram.ui.ActionBar.j6.f20607a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f20880p7, org.telegram.ui.ActionBar.j6.f20700f6, org.telegram.ui.ActionBar.j6.f20718g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
        this.f38821b.setPadding(0, 0, 0, i13);
        this.f38821b.setClipToPadding(false);
    }
}
