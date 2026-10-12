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
public final class kh0 extends ji1 implements NotificationCenter.NotificationCenterDelegate, ne.d {
    public FrameLayout E;
    public mh0 F;
    public dh.d G;
    public View H;
    public Integer I;
    public yy J;
    public ph.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public di.d4 P;
    public boolean Q;
    public final gh.c R;
    public final gh.d S;
    public IUpdateLayout f37656w;
    public boolean f37657x;
    public qh1 f37658y;
    public final ne.b v = new ne.b(0, this, org.telegram.ui.Components.es.h, 380, true);
    public final RectF T = new RectF();

    public kh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.S = dVar;
            dVar.j(new hh0(this));
        } else {
            this.S = null;
        }
        this.R = new gh.c();
        c9 c9Var = new c9(this, 5);
        setBulletinDelegate(c9Var);
        org.telegram.ui.Components.sc.a(this.f37391b, c9Var);
    }

    public static void Y(kh0 kh0Var, int i10, org.telegram.ui.Components.m80 m80Var) {
        if (kh0Var.currentAccount != i10) {
            m80Var.u();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static boolean Z(org.telegram.ui.kh0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kh0.Z(org.telegram.ui.kh0, android.view.View):boolean");
    }

    public static void a0(kh0 kh0Var) {
        kh0Var.getUserConfig().setShowCallsTab(true);
        kh0Var.g0(true, true);
        NotificationCenter.getInstance(kh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(kh0 kh0Var) {
        kh0Var.getClass();
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
            kh0Var.presentFragment(new bh0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            kh0Var.showDialog(new sg.j0(7, kh0Var.currentAccount, kh0Var.getParentActivity(), kh0Var, null));
        }
    }

    public static void c0(kh0 kh0Var) {
        kh0Var.getUserConfig().setShowCallsTab(false);
        kh0Var.g0(false, true);
        NotificationCenter.getInstance(kh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final org.telegram.ui.ActionBar.m2 V(int i10) {
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
                return new n9(bundle2);
            }
            return new o91(a1.g.h("hasMainTabs", true));
        } else if (i10 == 0) {
            yy yyVar = new yy(a1.g.h("hasMainTabs", true));
            this.J = yyVar;
            yyVar.I3 = new hh0(this);
            return yyVar;
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
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null && X.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        super.createView(context);
        mh0 mh0Var = new mh0(context, this.resourceProvider);
        this.F = mh0Var;
        mh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        ph.b[] bVarArr = new ph.b[5];
        this.K = bVarArr;
        bVarArr[0] = ph.b.b(context, this.resourceProvider, ph.a.CHATS, R.string.MainTabsChats);
        this.K[1] = ph.b.b(context, this.resourceProvider, ph.a.CONTACTS, R.string.MainTabsContacts);
        this.K[2] = ph.b.b(context, this.resourceProvider, ph.a.SETTINGS, R.string.Settings);
        this.K[3] = ph.b.b(context, this.resourceProvider, ph.a.CALLS, R.string.MainTabsCalls);
        ph.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        ph.b bVar = new ph.b(context);
        bVar.f43216a.setText(LocaleController.getString(i12));
        bVar.f43217b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(0, user);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        z9Var.e(user, k9Var);
        z9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f43218c = z9Var;
        bVar.addView(z9Var, w7.a6.a(22.0f, 0.0f, 5.0f, 0.0f, 0.0f, 22, 49));
        bVar.f43223w = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f43222s = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final kh0 f35836b;

            {
                this.f35836b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return kh0.Z(this.f35836b, view);
                    case 1:
                        kh0 kh0Var = this.f35836b;
                        if (kh0Var.getParentActivity() == null || kh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(kh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new gh0(kh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new gh0(kh0Var, 6), false);
                        H.f27300u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f27280i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        kh0 kh0Var2 = this.f35836b;
                        if (kh0Var2.getParentActivity() == null || kh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H2 = org.telegram.ui.Components.m80.H(kh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new gh0(kh0Var2, 1), false);
                        if (kh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new gh0(kh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new gh0(kh0Var2, 3), false);
                        }
                        H2.f27300u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35836b.k0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final kh0 f35836b;

            {
                this.f35836b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return kh0.Z(this.f35836b, view);
                    case 1:
                        kh0 kh0Var = this.f35836b;
                        if (kh0Var.getParentActivity() == null || kh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(kh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new gh0(kh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new gh0(kh0Var, 6), false);
                        H.f27300u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f27280i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        kh0 kh0Var2 = this.f35836b;
                        if (kh0Var2.getParentActivity() == null || kh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H2 = org.telegram.ui.Components.m80.H(kh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new gh0(kh0Var2, 1), false);
                        if (kh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new gh0(kh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new gh0(kh0Var2, 3), false);
                        }
                        H2.f27300u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35836b.k0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final kh0 f35836b;

            {
                this.f35836b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return kh0.Z(this.f35836b, view);
                    case 1:
                        kh0 kh0Var = this.f35836b;
                        if (kh0Var.getParentActivity() == null || kh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(kh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new gh0(kh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new gh0(kh0Var, 6), false);
                        H.f27300u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f27280i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        kh0 kh0Var2 = this.f35836b;
                        if (kh0Var2.getParentActivity() == null || kh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H2 = org.telegram.ui.Components.m80.H(kh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new gh0(kh0Var2, 1), false);
                        if (kh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new gh0(kh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new gh0(kh0Var2, 3), false);
                        }
                        H2.f27300u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35836b.k0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final kh0 f35836b;

            {
                this.f35836b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return kh0.Z(this.f35836b, view);
                    case 1:
                        kh0 kh0Var = this.f35836b;
                        if (kh0Var.getParentActivity() == null || kh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(kh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new gh0(kh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new gh0(kh0Var, 6), false);
                        H.f27300u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f27280i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 2:
                        kh0 kh0Var2 = this.f35836b;
                        if (kh0Var2.getParentActivity() == null || kh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.m80 H2 = org.telegram.ui.Components.m80.H(kh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new gh0(kh0Var2, 1), false);
                        if (kh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new gh0(kh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new gh0(kh0Var2, 3), false);
                        }
                        H2.f27300u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable c03 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), kh0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
                        c03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
                        H2.W(c03);
                        H2.Z();
                        return true;
                    default:
                        this.f35836b.k0(view);
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
            ph.b[] bVarArr3 = this.K;
            if (i13 >= bVarArr3.length) {
                break;
            }
            ph.b bVar2 = bVarArr3[i13];
            if (i13 > 2) {
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            bVar2.setOnClickListener(new di.m4(this, i10, 19));
            this.F.addView(this.K[i13]);
            this.F.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f37392c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6);
        gh.c cVar = this.R;
        cVar.a(themedColor);
        ih.j jVar = new ih.j(this.f37391b);
        gh.a aVar = this.S;
        if (aVar == null) {
            aVar = cVar;
        }
        bh.b bVar3 = new bh.b(aVar);
        l0 l0Var = this.f37391b;
        bVar3.f2745f = jVar;
        bVar3.f2746g = l0Var;
        bVar3.f2747i = LiteMode.isEnabled(262144);
        dh.d c10 = bVar3.c(this.F, fh.b.f(this.resourceProvider), false);
        this.G = c10;
        c10.q(AndroidUtilities.dp(28.0f));
        this.G.p(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        bh.b bVar4 = new bh.b(cVar);
        l0 l0Var2 = this.f37391b;
        bVar4.f2745f = jVar;
        bVar4.f2746g = l0Var2;
        this.H = new View(context);
        bh.c cVar2 = new bh.c(bVar4.c(this.H, null, false));
        cVar2.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(cVar2);
        this.f37391b.addView(this.H, w7.a6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ah.f(21));
        this.E.addView(this.F, w7.a6.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f37391b.addView(this.E, w7.a6.e(-1, -2, 80));
        qh1 qh1Var = new qh1(context);
        this.f37658y = qh1Var;
        this.f37391b.addView(qh1Var, w7.a6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f37658y);
        this.f37656w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f37391b;
    }

    public final void d0() {
        gh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.S) != null && (view = this.fragmentView) != null) {
            dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        ph.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f37656w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f37656w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f37656w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f37656w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f37656w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f37656w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f32109d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f37392c.getCurrentPosition();
                SparseArray sparseArray = this.f37390a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    hi1 hi1Var = (hi1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && hi1Var != null) {
                        hi1Var.f36828a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                ii1 ii1Var = this.f37392c;
                if (ii1Var != null && ii1Var.getCurrentPosition() == 2) {
                    this.f37392c.D(0);
                    m0(0, true);
                    this.f37657x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                ph.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f43218c.e(user, new org.telegram.ui.Components.k9(0, user));
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6);
        ii1 ii1Var = this.f37392c;
        if (ii1Var != null) {
            f7 = ii1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.R.a(i0.a.d(f7, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        dh.d dVar = this.G;
        if (dVar != null) {
            dVar.v();
        }
        d0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        mh0 mh0Var = this.F;
        if (mh0Var != null) {
            mh0Var.invalidate();
        }
        ph.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (ph.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f43223w = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.cl, bVar.d);
                bVar.f43222s = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.bl, bVar.d);
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
        mh0 mh0Var = this.F;
        if (mh0Var != null) {
            mh0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f20828c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f19901d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.f19972h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        ii1 ii1Var = this.f37392c;
        if (ii1Var != null && this.H != null) {
            float a2 = 1.0f - w7.s.a(Math.abs(3.0f - ii1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.L)) * a2)) * this.v.e;
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
        View view = this.f37658y.f39452b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f7 = this.v.e;
        AndroidUtilities.lerp(0.85f, 1.0f, f7);
        this.E.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f7));
        mh0 mh0Var = this.F;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        mh0Var.setClickable(z10);
        mh0 mh0Var2 = this.F;
        if (i13 <= 0) {
            z11 = false;
        }
        mh0Var2.setEnabled(z11);
        this.F.setAlpha(f7);
        mh0 mh0Var3 = this.F;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        mh0Var3.setVisibility(i11);
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
        Collections.sort(arrayList, new org.telegram.ui.ActionBar.l5(27));
        org.telegram.ui.Components.m80 H = org.telegram.ui.Components.m80.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new gh0(this, 0), false);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Z(getThemedColor(org.telegram.ui.ActionBar.g6.f19990i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
                k9Var.r(currentUser);
                org.telegram.ui.Components.jh0 jh0Var = new org.telegram.ui.Components.jh0(this, getParentActivity(), z10);
                linearLayout.addView(jh0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(getParentActivity());
                if (z10) {
                    z9Var.setScaleX(0.833f);
                    z9Var.setScaleY(0.833f);
                }
                z9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                z9Var.getImageReceiver().setCurrentAccount(intValue);
                z9Var.e(currentUser, k9Var);
                jh0Var.addView(z9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.sa(this, intValue, H, 13));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        H.f27300u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.m1(0.15f, -16777216));
        H.W(c02);
        H.Z();
        org.telegram.ui.Components.w40.f30790r.a();
    }

    public final yy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        yy yyVar = new yy(bundle);
        this.J = yyVar;
        yyVar.I3 = new hh0(this);
        this.f37390a.put(0, new hi1(yyVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            ph.b[] bVarArr = this.K;
            if (i12 < bVarArr.length) {
                ph.b bVar = bVarArr[i12];
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

    public final void n0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.K.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f7));
            ph.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f37392c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f37392c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.m2 X = X();
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
        org.telegram.ui.Components.sc.h(this.f37391b);
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
        di.d4 d4Var = this.P;
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
        if (this.P == null && org.telegram.ui.Components.w40.f30790r.c()) {
            AndroidUtilities.runOnUIThread(new gh0(this, 7), 1500L);
        }
        this.Q = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void p(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.m2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
