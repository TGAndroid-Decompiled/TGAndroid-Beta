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
public final class m31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f35588a;
    public org.telegram.ui.Components.vl0 f35589b;
    public i31 f35590c;
    public int d;
    public int e;
    public int f35591f;
    public int h;
    public k31 f35592n;

    public m31() {
        super(null);
        this.e = -1;
    }

    public static void U(m31 m31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !m31Var.getUserConfig().isPremium()) {
                m31Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) m31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(m31Var.currentAccount).setDoubleTapReaction(yVar.e.reaction);
            m31Var.f35589b.getAdapter().q(0, m31Var.f35589b.getAdapter().h());
        } else if (view instanceof l31) {
            l31 l31Var = (l31) view;
            if (m31Var.f35592n == null) {
                a71[] a71VarArr = new a71[1];
                org.telegram.ui.Components.n5 n5Var = l31Var.f35296a;
                if (n5Var != null) {
                    n5Var.f();
                    l31Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(n5Var.getBounds());
                    i11 = (-(l31Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                j31 j31Var = new j31(m31Var, m31Var, m31Var.getParentActivity(), Integer.valueOf(i10), l31Var, a71VarArr);
                String doubleTapReaction = m31Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        j31Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = m31Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f49423f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                j31Var.setRecentReactions(arrayList);
                j31Var.setSaveState(3);
                j31Var.y(n5Var, l31Var);
                k31 k31Var = new k31(m31Var, j31Var);
                m31Var.f35592n = k31Var;
                a71VarArr[0] = k31Var;
                k31Var.showAsDropDown(l31Var, 0, i11, 53);
                a71VarArr[0].b();
            }
        }
    }

    public static int Y(m31 m31Var) {
        return m31Var.currentAccount;
    }

    public static int Z(m31 m31Var) {
        return m31Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f35591f = i10;
            return;
        }
        this.f35591f = -1;
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
        org.telegram.ui.Components.vl0 vl0Var = new org.telegram.ui.Components.vl0(context, null);
        this.f35589b = vl0Var;
        vl0Var.q1();
        this.actionBar.setAdaptiveBackground(this.f35589b);
        ((s4.j) this.f35589b.getItemAnimator()).f43009m = false;
        this.f35589b.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.vl0 vl0Var2 = this.f35589b;
        i31 i31Var = new i31(this, context);
        this.f35590c = i31Var;
        vl0Var2.setAdapter(i31Var);
        this.f35589b.setOnItemClickListener(new a31(this, 1));
        linearLayout.addView(this.f35589b, w7.y5.n(-1, -1));
        this.f35588a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19038a7, false));
        this.f35590c.l();
        c0();
        return this.f35588a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f35590c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f35590c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new wy0(4, this), org.telegram.ui.ActionBar.j6.f19094d6, org.telegram.ui.ActionBar.j6.G6, org.telegram.ui.ActionBar.j6.f19496z6, org.telegram.ui.ActionBar.j6.f19184i6, org.telegram.ui.ActionBar.j6.f19038a7, org.telegram.ui.ActionBar.j6.B6, org.telegram.ui.ActionBar.j6.f19315p7, org.telegram.ui.ActionBar.j6.f19130f6, org.telegram.ui.ActionBar.j6.f19148g6, org.telegram.ui.ActionBar.j6.O6, org.telegram.ui.ActionBar.j6.P6, org.telegram.ui.ActionBar.j6.Q6, org.telegram.ui.ActionBar.j6.R6);
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
        this.f35589b.setPadding(0, 0, 0, i13);
        this.f35589b.setClipToPadding(false);
    }
}
