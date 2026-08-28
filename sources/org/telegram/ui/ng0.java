package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class ng0 extends tg1 implements NotificationCenter.NotificationCenterDelegate, td.b {
    public FrameLayout A;
    public pg0 B;
    public kg.d C;
    public View D;
    public Integer E;
    public dy F;
    public wg.b[] G;
    public int H;
    public int I;
    public int J;
    public NotificationCenter.ObserversGroup K;
    public NotificationCenter.ObserversGroup L;
    public kh.x3 M;
    public boolean N;
    public final ng.c O;
    public final ng.d P;
    public IUpdateLayout f40722w;
    public boolean f40723x;
    public cg1 f40724y;
    public final td.a v = new td.a(0, this, org.telegram.ui.Components.gr.h, 380, true);
    public final RectF Q = new RectF();

    public ng0() {
        if (Build.VERSION.SDK_INT >= 31) {
            ng.d dVar = new ng.d(null);
            this.P = dVar;
            dVar.i(new kg0(this));
        } else {
            this.P = null;
        }
        this.O = new ng.c();
        x8 x8Var = new x8(this, 5);
        setBulletinDelegate(x8Var);
        org.telegram.ui.Components.gc.a(this.f42998b, x8Var);
    }

    public static void X(ng0 ng0Var, int i9, org.telegram.ui.Components.x60 x60Var) {
        if (ng0Var.currentAccount != i9) {
            x60Var.u();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i9);
            }
        }
    }

    public static boolean Y(org.telegram.ui.ng0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ng0.Y(org.telegram.ui.ng0, android.view.View):boolean");
    }

    public static void Z(ng0 ng0Var) {
        ng0Var.getUserConfig().setShowCallsTab(true);
        ng0Var.f0(true, true);
        NotificationCenter.getInstance(ng0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void a0(ng0 ng0Var) {
        ng0Var.getClass();
        int i9 = 0;
        Integer num = null;
        for (int i10 = 3; i10 >= 0; i10--) {
            if (!UserConfig.getInstance(i10).isClientActivated()) {
                i9++;
                if (num == null) {
                    num = Integer.valueOf(i10);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i9--;
        }
        if (i9 > 0 && num != null) {
            ng0Var.presentFragment(new fg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            ng0Var.showDialog(new zf.j0(7, ng0Var.currentAccount, ng0Var.getParentActivity(), ng0Var, null));
        }
    }

    public static void b0(ng0 ng0Var) {
        ng0Var.getUserConfig().setShowCallsTab(false);
        ng0Var.f0(false, true);
        NotificationCenter.getInstance(ng0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            h0();
            g0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 U(int i9) {
        if (i9 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i9 == 2) {
            if (getUserConfig().showCallsTab) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new i9(bundle2);
            }
            return new z71(aa.d.i("hasMainTabs", true));
        } else if (i9 == 0) {
            dy dyVar = new dy(aa.d.i("hasMainTabs", true));
            this.F = dyVar;
            dyVar.E3 = new kg0(this);
            return dyVar;
        } else if (i9 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    public final void c0() {
        ng.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.P) != null && (view = this.fragmentView) != null) {
            dVar.h(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.j();
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null && W.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i9;
        super.createView(context);
        pg0 pg0Var = new pg0(context, this.resourceProvider);
        this.B = pg0Var;
        pg0Var.setClipChildren(false);
        this.B.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.B.setMaxWidth(AndroidUtilities.dp(344.0f));
        wg.b[] bVarArr = new wg.b[5];
        this.G = bVarArr;
        bVarArr[0] = wg.b.b(context, this.resourceProvider, wg.a.CHATS, R.string.MainTabsChats);
        this.G[1] = wg.b.b(context, this.resourceProvider, wg.a.CONTACTS, R.string.MainTabsContacts);
        this.G[2] = wg.b.b(context, this.resourceProvider, wg.a.SETTINGS, R.string.Settings);
        this.G[3] = wg.b.b(context, this.resourceProvider, wg.a.CALLS, R.string.MainTabsCalls);
        wg.b[] bVarArr2 = this.G;
        org.telegram.ui.ActionBar.b6 b6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        wg.b bVar = new wg.b(context);
        bVar.f48828a.setText(LocaleController.getString(i11));
        bVar.f48829b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8(0, user);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        o9Var.e(user, z8Var);
        o9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f48830c = o9Var;
        bVar.addView(o9Var, g7.e6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f48836w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cl, b6Var);
        bVar.f48835s = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, b6Var);
        bVar.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.bl, b6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.G[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39150b;

            {
                this.f39150b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Y(this.f39150b, view);
                    case 1:
                        ng0 ng0Var = this.f39150b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f34582u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f34562i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39150b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H2 = org.telegram.ui.Components.x60.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f34582u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39150b.j0(view);
                        return true;
                }
            }
        });
        this.G[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39150b;

            {
                this.f39150b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Y(this.f39150b, view);
                    case 1:
                        ng0 ng0Var = this.f39150b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f34582u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f34562i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39150b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H2 = org.telegram.ui.Components.x60.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f34582u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39150b.j0(view);
                        return true;
                }
            }
        });
        this.G[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39150b;

            {
                this.f39150b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Y(this.f39150b, view);
                    case 1:
                        ng0 ng0Var = this.f39150b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f34582u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f34562i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39150b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H2 = org.telegram.ui.Components.x60.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f34582u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39150b.j0(view);
                        return true;
                }
            }
        });
        this.G[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39150b;

            {
                this.f39150b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Y(this.f39150b, view);
                    case 1:
                        ng0 ng0Var = this.f39150b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f34582u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f34562i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39150b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.x60 H2 = org.telegram.ui.Components.x60.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f34582u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39150b.j0(view);
                        return true;
                }
            }
        });
        this.B.L.add(this.G[0]);
        this.B.L.add(this.G[1]);
        this.B.L.add(this.G[4]);
        this.B.L.add(this.G[3]);
        int i12 = 0;
        while (true) {
            wg.b[] bVarArr3 = this.G;
            if (i12 >= bVarArr3.length) {
                break;
            }
            wg.b bVar2 = bVarArr3[i12];
            if (i12 > 2) {
                i9 = i12 - 1;
            } else {
                i9 = i12;
            }
            bVar2.setOnClickListener(new gh.z0(this, i9, 18));
            this.B.addView(this.G[i12]);
            this.B.i(bVar2, true, false);
            i12++;
        }
        f0(getUserConfig().showCallsTab, false);
        l0(this.f42999c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6);
        ng.c cVar = this.O;
        cVar.a(themedColor);
        pg.i iVar = new pg.i(this.f42998b);
        ng.a aVar = this.P;
        if (aVar == null) {
            aVar = cVar;
        }
        m0 m0Var = this.f42998b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        pg0 pg0Var2 = this.B;
        lg.d f10 = mg.c.f(this.resourceProvider);
        kg.d y10 = aVar.y();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (y10 instanceof kg.e)) {
            kg.e eVar = (kg.e) y10;
            eVar.N = new ig.f(eVar.I);
        }
        y10.n(f10);
        if (m0Var != null && pg0Var2 != null) {
            iVar.d(pg0Var2, m0Var, new b5.d(28, y10, pg0Var2), false);
        }
        this.C = y10;
        y10.p(AndroidUtilities.dp(28.0f));
        this.C.o(AndroidUtilities.dp(7.666f));
        this.B.setBackground(this.C);
        m0 m0Var2 = this.f42998b;
        this.D = new View(context);
        View view = this.D;
        kg.f fVar = new kg.f(cVar);
        fVar.n(null);
        if (m0Var2 != null && view != null) {
            iVar.d(view, m0Var2, new b5.d(28, fVar, view), false);
        }
        ig.b bVar3 = new ig.b(fVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.D.setBackground(bVar3);
        this.f42998b.addView(this.D, g7.e6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.A = frameLayout;
        frameLayout.setOnClickListener(new fh.n(23));
        this.A.addView(this.B, g7.e6.e(-1, 72, 81));
        this.A.setClipToPadding(false);
        this.f42998b.addView(this.A, g7.e6.e(-1, -2, 80));
        cg1 cg1Var = new cg1(context);
        this.f40724y = cg1Var;
        this.f42998b.addView(cg1Var, g7.e6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f40724y);
        this.f40722w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        i0(false);
        return this.f42998b;
    }

    public final void d0() {
        float f10;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6);
        sg1 sg1Var = this.f42999c;
        if (sg1Var != null) {
            f10 = sg1Var.r(0);
        } else {
            f10 = 1.0f;
        }
        this.O.a(i0.a.d(f10, themedColor, themedColor2));
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
        kg.d dVar = this.C;
        if (dVar != null) {
            dVar.u();
        }
        c0();
        View view2 = this.D;
        if (view2 != null) {
            view2.invalidate();
        }
        pg0 pg0Var = this.B;
        if (pg0Var != null) {
            pg0Var.invalidate();
        }
        wg.b[] bVarArr = this.G;
        if (bVarArr != null) {
            for (wg.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f48836w = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.cl, bVar.d);
                bVar.f48835s = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        wg.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i9 != NotificationCenter.notificationsCountUpdated && i9 != NotificationCenter.updateInterfaces) {
            if (i9 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f40722w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f40722w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f40722w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f40722w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f40722w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f40722w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.C1) != null) {
                    int i11 = this.currentAccount;
                    if (launchActivity.Z.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i11, z11);
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f42999c.getCurrentPosition();
                SparseArray sparseArray = this.f42997a;
                int size = sparseArray.size();
                for (int i12 = 0; i12 < size; i12++) {
                    rg1 rg1Var = (rg1) sparseArray.valueAt(i12);
                    if (sparseArray.keyAt(i12) != currentPosition && rg1Var != null) {
                        rg1Var.f42421a.clearViews();
                    }
                }
                return;
            } else if (i9 == NotificationCenter.callTabsVisibleToggled) {
                f0(getUserConfig().showCallsTab, true);
                sg1 sg1Var = this.f42999c;
                if (sg1Var != null && sg1Var.getCurrentPosition() == 2) {
                    this.f42999c.D(0);
                    l0(0, true);
                    this.f40723x = true;
                    return;
                }
                V(2);
                return;
            } else if (i9 == NotificationCenter.mainUserInfoChanged) {
                wg.b[] bVarArr = this.G;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i13 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i13).getUser(Long.valueOf(UserConfig.getInstance(i13).getClientUserId()));
                    bVar.f48830c.e(user, new org.telegram.ui.Components.z8(0, user));
                    return;
                }
                return;
            } else if (i9 == NotificationCenter.contactsPermissionBadgeCheck) {
                e0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z10 = true;
        }
        i0(z10);
    }

    public final void e0() {
        boolean z10;
        if (this.B != null && this.G[1] != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 23 && ContactsController.hasContactsPermission()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (i9 >= 23 && UserConfig.getInstance(this.currentAccount).syncContacts && !z10 && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
                this.G[1].d("!", true, true);
            } else {
                this.G[1].d(null, true, true);
            }
        }
    }

    public final void f0(boolean z10, boolean z11) {
        pg0 pg0Var = this.B;
        if (pg0Var != null) {
            pg0Var.i(this.G[2], !z10, z11);
            this.B.i(this.G[3], z10, z11);
        }
    }

    public final void g0() {
        int i9;
        sg1 sg1Var = this.f42999c;
        if (sg1Var != null && this.D != null) {
            float a2 = 1.0f - g7.n.a(Math.abs(3.0f - sg1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.H)) * a2)) * this.v.f47775e;
            this.D.setAlpha(navigationBarThirdButtonsFactor);
            this.D.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
            View view = this.D;
            if (navigationBarThirdButtonsFactor > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            view.setVisibility(i9);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f10) {
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null) {
            return W.getCustomSlideTransition(z10, z11, f10);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23979c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23001d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23072h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i9;
        boolean z10;
        View view = this.f40724y.f37205b;
        int i10 = 0;
        if (view != null && view.getVisibility() == 0) {
            i9 = AndroidUtilities.dp(44.0f);
        } else {
            i9 = 0;
        }
        int i11 = -i9;
        float f10 = this.v.f47775e;
        AndroidUtilities.lerp(0.85f, 1.0f, f10);
        this.A.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i11, i11, f10));
        pg0 pg0Var = this.B;
        boolean z11 = true;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        pg0Var.setClickable(z10);
        pg0 pg0Var2 = this.B;
        if (i12 <= 0) {
            z11 = false;
        }
        pg0Var2.setEnabled(z11);
        this.B.setAlpha(f10);
        pg0 pg0Var3 = this.B;
        if (f10 <= 0.0f) {
            i10 = 8;
        }
        pg0Var3.setVisibility(i10);
    }

    public final void i0(boolean z10) {
        if (this.B == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount > 0) {
            this.G[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z10);
            return;
        }
        this.G[0].d(null, false, z10);
    }

    public final void j0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i9 = 0; i9 < 4; i9++) {
            if (UserConfig.getInstance(i9).isClientActivated()) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(9));
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new jg0(this, 0), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.z8 z8Var = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                z8Var.r(currentUser);
                org.telegram.ui.Components.tf0 tf0Var = new org.telegram.ui.Components.tf0(this, getParentActivity(), z10);
                linearLayout.addView(tf0Var, g7.e6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getParentActivity());
                if (z10) {
                    o9Var.setScaleX(0.833f);
                    o9Var.setScaleY(0.833f);
                }
                o9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                o9Var.getImageReceiver().setCurrentAccount(intValue);
                o9Var.e(currentUser, z8Var);
                tf0Var.addView(o9Var, g7.e6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, g7.e6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new fh.a3(this, intValue, H, 15));
                H.r(linearLayout, g7.e6.n(230, 48));
            }
        }
        H.f34582u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.f6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.t30.f32611r.a();
    }

    public final dy k0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        dy dyVar = new dy(bundle);
        this.F = dyVar;
        dyVar.E3 = new kg0(this);
        this.f42997a.put(0, new rg1(dyVar));
        return this.F;
    }

    public final void l0(int i9, boolean z10) {
        int i10;
        boolean z11;
        int i11 = 0;
        while (true) {
            wg.b[] bVarArr = this.G;
            if (i11 < bVarArr.length) {
                wg.b bVar = bVarArr[i11];
                if (i11 > 2) {
                    i10 = i11 - 1;
                } else {
                    i10 = i11;
                }
                if (i10 == i9) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void m0(float f10, boolean z10) {
        for (int i9 = 0; i9 < this.G.length; i9++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i9 > 2 ? i9 - 1 : i9) - f10));
            wg.b bVar = this.G[i9];
            bVar.F = max;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.B.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f42999c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f42999c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null) {
            W.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.K = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.L = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.gc.h(this.f42998b);
        NotificationCenter.ObserversGroup observersGroup = this.K;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.K = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.L;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.L = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        kh.x3 x3Var = this.M;
        if (x3Var != null) {
            x3Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        d0();
        e0();
        i0(true);
        if (this.N) {
            return;
        }
        if (this.M == null && org.telegram.ui.Components.t30.f32611r.c()) {
            AndroidUtilities.runOnUIThread(new jg0(this, 7), 1500L);
        }
        this.N = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f10) {
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null) {
            W.onSlideProgress(z10, f10);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.o2 W = W();
        if (W != null) {
            W.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void B(float f10, int i9) {
    }
}
