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
public final class fh0 extends ci1 implements NotificationCenter.NotificationCenterDelegate, me.d {
    public FrameLayout E;
    public hh0 F;
    public ch.d G;
    public View H;
    public Integer I;
    public ty J;
    public oh.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public ci.d4 P;
    public boolean Q;
    public final fh.c R;
    public final fh.d S;
    public IUpdateLayout f37606w;
    public boolean f37607x;
    public kh1 f37608y;
    public final me.b v = new me.b(0, this, org.telegram.ui.Components.hs.h, 380, true);
    public final RectF T = new RectF();

    public fh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            fh.d dVar = new fh.d(null);
            this.S = dVar;
            dVar.j(new ch0(this));
        } else {
            this.S = null;
        }
        this.R = new fh.c();
        y8 y8Var = new y8(this, 5);
        setBulletinDelegate(y8Var);
        org.telegram.ui.Components.tc.a(this.f36684b, y8Var);
    }

    public static void Y(fh0 fh0Var, int i10, org.telegram.ui.Components.p80 p80Var) {
        if (fh0Var.currentAccount != i10) {
            p80Var.u();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static boolean Z(org.telegram.ui.fh0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.fh0.Z(org.telegram.ui.fh0, android.view.View):boolean");
    }

    public static void a0(fh0 fh0Var) {
        fh0Var.getUserConfig().setShowCallsTab(true);
        fh0Var.g0(true, true);
        NotificationCenter.getInstance(fh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(fh0 fh0Var) {
        fh0Var.getClass();
        int i10 = 0;
        Integer num = null;
        for (int i11 = 3; i11 >= 0; i11--) {
            if (!UserConfig.getInstance(i11).isClientActivated()) {
                i10++;
                if (num == null) {
                    num = Integer.valueOf(i11);
                }
            }
        }
        if (!UserConfig.hasPremiumOnAccounts()) {
            i10--;
        }
        if (i10 > 0 && num != null) {
            fh0Var.presentFragment(new wg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            fh0Var.showDialog(new rg.j0(7, fh0Var.currentAccount, fh0Var.getParentActivity(), fh0Var, null));
        }
    }

    public static void c0(fh0 fh0Var) {
        fh0Var.getUserConfig().setShowCallsTab(false);
        fh0Var.g0(false, true);
        NotificationCenter.getInstance(fh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final org.telegram.ui.ActionBar.n2 V(int i10) {
        if (i10 == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i10 == 2) {
            if (getUserConfig().showCallsTab) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("needFinishFragment", false);
                bundle2.putBoolean("hasMainTabs", true);
                return new j9(bundle2);
            }
            return new i91(a1.g.i("hasMainTabs", true));
        } else if (i10 == 0) {
            ty tyVar = new ty(a1.g.i("hasMainTabs", true));
            this.J = tyVar;
            tyVar.I3 = new ch0(this);
            return tyVar;
        } else if (i10 != 3) {
            return null;
        } else {
            Bundle bundle3 = new Bundle();
            bundle3.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
            bundle3.putBoolean("my_profile", true);
            bundle3.putBoolean("hasMainTabs", true);
            return new ProfileActivity(bundle3, null);
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null && X.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        super.createView(context);
        hh0 hh0Var = new hh0(context, this.resourceProvider);
        this.F = hh0Var;
        hh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        oh.b[] bVarArr = new oh.b[5];
        this.K = bVarArr;
        bVarArr[0] = oh.b.b(context, this.resourceProvider, oh.a.CHATS, R.string.MainTabsChats);
        this.K[1] = oh.b.b(context, this.resourceProvider, oh.a.CONTACTS, R.string.MainTabsContacts);
        this.K[2] = oh.b.b(context, this.resourceProvider, oh.a.SETTINGS, R.string.Settings);
        this.K[3] = oh.b.b(context, this.resourceProvider, oh.a.CALLS, R.string.MainTabsCalls);
        oh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.e6 e6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        oh.b bVar = new oh.b(context);
        bVar.f17139a.setText(LocaleController.getString(i12));
        bVar.f17140b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(0, user);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.e(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f17141c = y9Var;
        bVar.addView(y9Var, w7.x5.a(22.0f, 0.0f, 5.0f, 0.0f, 0.0f, 22, 49));
        bVar.f17147w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cl, e6Var);
        bVar.f17146s = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, e6Var);
        bVar.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bl, e6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f35930b;

            {
                this.f35930b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f35930b, view);
                    case 1:
                        fh0 fh0Var = this.f35930b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f29791u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29771i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f35930b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f29791u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35930b.k0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f35930b;

            {
                this.f35930b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f35930b, view);
                    case 1:
                        fh0 fh0Var = this.f35930b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f29791u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29771i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f35930b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f29791u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35930b.k0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f35930b;

            {
                this.f35930b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f35930b, view);
                    case 1:
                        fh0 fh0Var = this.f35930b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f29791u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29771i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f35930b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f29791u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35930b.k0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f35930b;

            {
                this.f35930b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f35930b, view);
                    case 1:
                        fh0 fh0Var = this.f35930b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f29791u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29771i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f35930b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.p80 H2 = org.telegram.ui.Components.p80.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f29791u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35930b.k0(view);
                        return true;
                }
            }
        });
        this.F.P.add(this.K[0]);
        this.F.P.add(this.K[1]);
        this.F.P.add(this.K[4]);
        this.F.P.add(this.K[3]);
        int i13 = 0;
        while (true) {
            oh.b[] bVarArr3 = this.K;
            if (i13 >= bVarArr3.length) {
                break;
            }
            oh.b bVar2 = bVarArr3[i13];
            if (i13 > 2) {
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            bVar2.setOnClickListener(new ci.m4(this, i10, 19));
            this.F.addView(this.K[i13]);
            this.F.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f36685c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6);
        fh.c cVar = this.R;
        cVar.a(themedColor);
        hh.j jVar = new hh.j(this.f36684b);
        fh.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        ah.c cVar2 = new ah.c(aVar);
        k0 k0Var = this.f36684b;
        cVar2.f545f = jVar;
        cVar2.f546g = k0Var;
        cVar2.f547i = LiteMode.isEnabled(262144);
        ch.d c10 = cVar2.c(this.F, eh.b.f(this.resourceProvider), false);
        this.G = c10;
        c10.q(AndroidUtilities.dp(28.0f));
        this.G.p(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        ah.c cVar3 = new ah.c(cVar);
        k0 k0Var2 = this.f36684b;
        cVar3.f545f = jVar;
        cVar3.f546g = k0Var2;
        this.H = new View(context);
        ah.d dVar = new ah.d(cVar3.c(this.H, null, false));
        dVar.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(dVar);
        this.f36684b.addView(this.H, w7.x5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ai.e2(20));
        this.E.addView(this.F, w7.x5.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f36684b.addView(this.E, w7.x5.e(-1, -2, 80));
        kh1 kh1Var = new kh1(context);
        this.f37608y = kh1Var;
        this.f36684b.addView(kh1Var, w7.x5.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f37608y);
        this.f37606w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f36684b;
    }

    public final void d0() {
        fh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.S) != null && (view = this.fragmentView) != null) {
            dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.k();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oh.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f37606w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f37606w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f37606w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f37606w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f37606w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f37606w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f33783d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f36685c.getCurrentPosition();
                SparseArray sparseArray = this.f36683a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ai1 ai1Var = (ai1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && ai1Var != null) {
                        ai1Var.f35936a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                bi1 bi1Var = this.f36685c;
                if (bi1Var != null && bi1Var.getCurrentPosition() == 2) {
                    this.f36685c.D(0);
                    m0(0, true);
                    this.f37607x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                oh.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f17141c.e(user, new org.telegram.ui.Components.j9(0, user));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.contactsPermissionBadgeCheck) {
                f0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z10 = true;
        }
        j0(z10);
    }

    public final void e0() {
        float f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f20741a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6);
        bi1 bi1Var = this.f36685c;
        if (bi1Var != null) {
            f7 = bi1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.R.a(i0.a.d(f7, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        ch.d dVar = this.G;
        if (dVar != null) {
            dVar.v();
        }
        d0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        hh0 hh0Var = this.F;
        if (hh0Var != null) {
            hh0Var.invalidate();
        }
        oh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (oh.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f17147w = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.cl, bVar.d);
                bVar.f17146s = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        if (this.F != null && this.K[1] != null) {
            boolean hasContactsPermission = ContactsController.hasContactsPermission();
            if (hasContactsPermission) {
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (UserConfig.getInstance(this.currentAccount).syncContacts && !hasContactsPermission && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
                this.K[1].d("!", true, true);
            } else {
                this.K[1].d(null, true, true);
            }
        }
    }

    public final void g0(boolean z10, boolean z11) {
        hh0 hh0Var = this.F;
        if (hh0Var != null) {
            hh0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21746c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20797d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20868h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        bi1 bi1Var = this.f36685c;
        if (bi1Var != null && this.H != null) {
            float a2 = 1.0f - w7.o.a(Math.abs(3.0f - bi1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.L)) * a2)) * this.v.f16337e;
            this.H.setAlpha(navigationBarThirdButtonsFactor);
            this.H.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
            View view = this.H;
            if (navigationBarThirdButtonsFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    public final void i0() {
        int i10;
        boolean z10;
        View view = this.f37608y.f39296b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f7 = this.v.f16337e;
        AndroidUtilities.lerp(0.85f, 1.0f, f7);
        this.E.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f7));
        hh0 hh0Var = this.F;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        hh0Var.setClickable(z10);
        hh0 hh0Var2 = this.F;
        if (i13 <= 0) {
            z11 = false;
        }
        hh0Var2.setEnabled(z11);
        this.F.setAlpha(f7);
        hh0 hh0Var3 = this.F;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        hh0Var3.setVisibility(i11);
    }

    public final void j0(boolean z10) {
        if (this.F == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount > 0) {
            this.K[0].d(LocaleController.formatNumber(mainUnreadCount, ','), false, z10);
            return;
        }
        this.K[0].d(null, false, z10);
    }

    public final void k0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new gf(23));
        org.telegram.ui.Components.p80 H = org.telegram.ui.Components.p80.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new bh0(this, 0), false);
        }
        if (arrayList.size() > 0) {
            if (H.x() > 0) {
                H.k();
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                int intValue = ((Integer) obj).intValue();
                if (this.currentAccount == intValue) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(0);
                linearLayout.setBackground(org.telegram.ui.ActionBar.i6.Z(getThemedColor(org.telegram.ui.ActionBar.i6.f20888i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.kh0 kh0Var = new org.telegram.ui.Components.kh0(this, getParentActivity(), z10);
                linearLayout.addView(kh0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.e(currentUser, j9Var);
                kh0Var.addView(y9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20905j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 13));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        H.f29791u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.i6.m1(0.15f, -16777216));
        H.W(c02);
        H.Z();
        org.telegram.ui.Components.a50.f24603r.a();
    }

    public final ty l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        ty tyVar = new ty(bundle);
        this.J = tyVar;
        tyVar.I3 = new ch0(this);
        this.f36683a.put(0, new ai1(tyVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            oh.b[] bVarArr = this.K;
            if (i12 < bVarArr.length) {
                oh.b bVar = bVarArr[i12];
                if (i12 > 2) {
                    i11 = i12 - 1;
                } else {
                    i11 = i12;
                }
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.e(z11, z10);
                i12++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.K.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f7));
            oh.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f36685c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f36685c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.O = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck).addGlobal(NotificationCenter.appUpdateAvailable).addGlobal(NotificationCenter.appUpdateLoading).addGlobal(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.tc.h(this.f36684b);
        NotificationCenter.ObserversGroup observersGroup = this.O;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        ci.d4 d4Var = this.P;
        if (d4Var != null) {
            d4Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.Q) {
            return;
        }
        if (this.P == null && org.telegram.ui.Components.a50.f24603r.c()) {
            AndroidUtilities.runOnUIThread(new bh0(this, 7), 1500L);
        }
        this.Q = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.n2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
