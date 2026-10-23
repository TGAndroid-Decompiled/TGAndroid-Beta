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
public final class d21 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate {
    public LinearLayout f36487a;
    public org.telegram.ui.Components.mm0 f36488b;
    public z11 f36489c;
    public int d;
    public int e;
    public int f36490f;
    public int h;
    public b21 f36491n;

    public d21() {
        super(null);
        this.e = -1;
    }

    public static void U(d21 d21Var, View view) {
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.x) {
            org.telegram.ui.Cells.x xVar = (org.telegram.ui.Cells.x) view;
            if (xVar.f23939n && !d21Var.getUserConfig().isPremium()) {
                d21Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) d21Var, 4, true));
                return;
            }
            MediaDataController.getInstance(d21Var.currentAccount).setDoubleTapReaction(xVar.f23938f.reaction);
            d21Var.f36488b.getAdapter().q(0, d21Var.f36488b.getAdapter().h());
        } else if (view instanceof c21) {
            c21 c21Var = (c21) view;
            if (d21Var.f36491n == null) {
                s51[] s51VarArr = new s51[1];
                org.telegram.ui.Components.p5 p5Var = c21Var.f36225a;
                if (p5Var != null) {
                    p5Var.f();
                    c21Var.b();
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set(p5Var.getBounds());
                    i11 = (-(c21Var.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                    i10 = rect.centerX() - ((AndroidUtilities.displaySize.x - AndroidUtilities.dp(12.0f)) - ((int) Math.min(AndroidUtilities.dp(324.0f), AndroidUtilities.displaySize.x * 0.95f)));
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                a21 a21Var = new a21(d21Var, d21Var, d21Var.getParentActivity(), Integer.valueOf(i10), c21Var, s51VarArr);
                String doubleTapReaction = d21Var.getMediaDataController().getDoubleTapReaction();
                if (doubleTapReaction != null && doubleTapReaction.startsWith("animated_")) {
                    try {
                        a21Var.setSelected(Long.valueOf(Long.parseLong(doubleTapReaction.substring(9))));
                    } catch (Exception unused) {
                    }
                }
                List<TLRPC.TL_availableReaction> reactionsList = d21Var.getMediaDataController().getReactionsList();
                ArrayList arrayList = new ArrayList(20);
                for (int i12 = 0; i12 < reactionsList.size(); i12++) {
                    ?? obj = new Object();
                    obj.f784f = reactionsList.get(i12).reaction;
                    arrayList.add(obj);
                }
                a21Var.setRecentReactions(arrayList);
                a21Var.setSaveState(3);
                a21Var.y(p5Var, c21Var);
                b21 b21Var = new b21(d21Var, a21Var);
                d21Var.f36491n = b21Var;
                s51VarArr[0] = b21Var;
                b21Var.showAsDropDown(c21Var, 0, i11, 53);
                s51VarArr[0].b();
            }
        }
    }

    public static int Y(d21 d21Var) {
        return d21Var.currentAccount;
    }

    public static int Z(d21 d21Var) {
        return d21Var.currentAccount;
    }

    public final void c0() {
        this.h = 2;
        this.d = 1;
        if (UserConfig.getInstance(this.currentAccount).isPremium()) {
            this.e = -1;
            int i10 = this.h;
            this.h = i10 + 1;
            this.f36490f = i10;
            return;
        }
        this.f36490f = -1;
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
        org.telegram.ui.Components.mm0 mm0Var = new org.telegram.ui.Components.mm0(context, null);
        this.f36488b = mm0Var;
        mm0Var.t1();
        this.actionBar.setAdaptiveBackground(this.f36488b);
        ((s4.k) this.f36488b.getItemAnimator()).f46377m = false;
        this.f36488b.setLayoutManager(new s4.b0());
        org.telegram.ui.Components.mm0 mm0Var2 = this.f36488b;
        z11 z11Var = new z11(this, context);
        this.f36489c = z11Var;
        mm0Var2.setAdapter(z11Var);
        this.f36488b.setOnItemClickListener(new j11(this, 1));
        linearLayout.addView(this.f36488b, w7.z5.n(-1, -1));
        this.f36487a = linearLayout;
        this.fragmentView = linearLayout;
        linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
        this.f36489c.l();
        c0();
        return this.f36487a;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i11 == this.currentAccount) {
            if (i10 == NotificationCenter.reactionsDidLoad) {
                this.f36489c.l();
            } else if (i10 == NotificationCenter.currentUserPremiumStatusChanged) {
                c0();
                this.f36489c.l();
            }
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        return w7.c6.a(new i6(21, this), org.telegram.ui.ActionBar.k6.f21183d6, org.telegram.ui.ActionBar.k6.G6, org.telegram.ui.ActionBar.k6.f21588z6, org.telegram.ui.ActionBar.k6.f21272i6, org.telegram.ui.ActionBar.k6.f21125a7, org.telegram.ui.ActionBar.k6.B6, org.telegram.ui.ActionBar.k6.f21404p7, org.telegram.ui.ActionBar.k6.f21219f6, org.telegram.ui.ActionBar.k6.f21236g6, org.telegram.ui.ActionBar.k6.O6, org.telegram.ui.ActionBar.k6.P6, org.telegram.ui.ActionBar.k6.Q6, org.telegram.ui.ActionBar.k6.R6);
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
        this.f36488b.setPadding(0, 0, 0, i13);
        this.f36488b.setClipToPadding(false);
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            LinearLayout linearLayout = this.f36487a;
            if (linearLayout != null) {
                linearLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21125a7, false));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
