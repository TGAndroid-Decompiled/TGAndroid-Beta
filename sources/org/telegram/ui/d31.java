package org.telegram.ui;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
public final class d31 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate {
    public org.telegram.ui.Components.zl0 f35629a;
    public z21 f35630b;
    public int f35631c;
    public int d;
    public int f35632e;
    public int f35633f;
    public NotificationCenter.ObserversGroup h;
    public b31 f35634n;

    public d31() {
        super(null);
        this.d = -1;
    }

    public static void S(d31 d31Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.y) {
            org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) view;
            if (yVar.h && !d31Var.getUserConfig().isPremium()) {
                d31Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) d31Var, 4, true));
                return;
            }
            MediaDataController.getInstance(d31Var.currentAccount).setDoubleTapReaction(yVar.f23750e.reaction);
            d31Var.f35629a.getAdapter().q(0, d31Var.f35629a.getAdapter().h());
        } else if (view instanceof c31) {
            c31 c31Var = (c31) view;
            if (d31Var.f35634n == null) {
                r61[] r61VarArr = new r61[1];
                org.telegram.ui.Components.o5 o5Var = c31Var.f35299a;
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
                    obj.f53471f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                a31Var.setRecentReactions(arrayList);
                a31Var.setSaveState(3);
                a31Var.y(o5Var, c31Var);
                b31 b31Var = new b31(d31Var, a31Var);
                d31Var.f35634n = b31Var;
                r61VarArr[0] = b31Var;
                b31Var.showAsDropDown(c31Var, 0, i11, 53);
                r61VarArr[0].b();
            }
        }
    }

    public static int X(d31 d31Var) {
        return d31Var.currentAccount;
    }

    public static int Y(d31 d31Var) {
        return d31Var.currentAccount;
    }

    public final void c0() {
        this.f35633f = 2;
        this.f35631c = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.d = -1;
            int i10 = this.f35633f;
            this.f35633f = i10 + 1;
            this.f35632e = i10;
            return;
        }
        this.f35632e = -1;
        this.d = this.f35633f;
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.Reactions));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 24));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(context, null);
        this.f35629a = zl0Var;
        zl0Var.r1();
        this.f35629a.setSectionsDrawBackground(true);
        ((s4.j) this.f35629a.getItemAnimator()).f46577m = false;
        this.f35629a.setLayoutManager(new s4.c0());
        org.telegram.ui.Components.zl0 zl0Var2 = this.f35629a;
        z21 z21Var = new z21(this, context);
        this.f35630b = z21Var;
        zl0Var2.setAdapter(z21Var);
        this.f35629a.setOnItemClickListener(new t21(this, 1));
        frameLayout.addView(this.f35629a, w7.z5.c(-1.0f, -1));
        this.fragmentView = frameLayout;
        this.f35630b.l();
        c0();
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f35630b.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f35630b.l();
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.f35629a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new qy0(4, this), org.telegram.ui.ActionBar.i6.f20827d6, org.telegram.ui.ActionBar.i6.G6, org.telegram.ui.ActionBar.i6.f21233z6, org.telegram.ui.ActionBar.i6.f20918i6, org.telegram.ui.ActionBar.i6.f20771a7, org.telegram.ui.ActionBar.i6.B6, org.telegram.ui.ActionBar.i6.f21049p7, org.telegram.ui.ActionBar.i6.f20864f6, org.telegram.ui.ActionBar.i6.f20882g6, org.telegram.ui.ActionBar.i6.O6, org.telegram.ui.ActionBar.i6.P6, org.telegram.ui.ActionBar.i6.Q6, org.telegram.ui.ActionBar.i6.R6);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.ObserversGroup observersGroup = this.h;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.h = null;
        }
        this.h = getNotificationCenter().createObserversGroup(this).add(NotificationCenter.reactionsDidLoad).add(NotificationCenter.currentUserPremiumStatusChanged);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.h;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.h = null;
        }
    }
}
