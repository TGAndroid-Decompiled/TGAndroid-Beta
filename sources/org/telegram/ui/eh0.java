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
public final class eh0 extends bi1 implements NotificationCenter.NotificationCenterDelegate, le.d {
    public FrameLayout E;
    public gh0 F;
    public dh.d G;
    public View H;
    public Integer I;
    public uy J;
    public ph.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public NotificationCenter.ObserversGroup P;
    public di.f4 Q;
    public boolean R;
    public final gh.c S;
    public final gh.d T;
    public IUpdateLayout f36080w;
    public boolean f36081x;
    public jh1 f36082y;
    public final le.b v = new le.b(0, this, org.telegram.ui.Components.pr.h, 380, true);
    public final RectF U = new RectF();

    public eh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            gh.d dVar = new gh.d(null);
            this.T = dVar;
            dVar.j(new bh0(this));
        } else {
            this.T = null;
        }
        this.S = new gh.c();
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.qc.a(this.f34815b, z8Var);
    }

    public static void Y(eh0 eh0Var, int i10, org.telegram.ui.Components.n70 n70Var) {
        if (eh0Var.currentAccount != i10) {
            n70Var.u();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static boolean Z(org.telegram.ui.eh0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.eh0.Z(org.telegram.ui.eh0, android.view.View):boolean");
    }

    public static void a0(eh0 eh0Var) {
        eh0Var.getUserConfig().setShowCallsTab(true);
        eh0Var.g0(true, true);
        NotificationCenter.getInstance(eh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(eh0 eh0Var) {
        eh0Var.getClass();
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
            eh0Var.presentFragment(new wg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            eh0Var.showDialog(new sg.k0(7, eh0Var.currentAccount, eh0Var.getParentActivity(), eh0Var, null));
        }
    }

    public static void c0(eh0 eh0Var) {
        eh0Var.getUserConfig().setShowCallsTab(false);
        eh0Var.g0(false, true);
        NotificationCenter.getInstance(eh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void E(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
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
                return new k9(bundle2);
            }
            return new i91(a4.a.i("hasMainTabs", true));
        } else if (i10 == 0) {
            uy uyVar = new uy(a4.a.i("hasMainTabs", true));
            this.J = uyVar;
            uyVar.I3 = new bh0(this);
            return uyVar;
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
        gh0 gh0Var = new gh0(context, this.resourceProvider);
        this.F = gh0Var;
        gh0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        ph.b[] bVarArr = new ph.b[5];
        this.K = bVarArr;
        bVarArr[0] = ph.b.b(context, this.resourceProvider, ph.a.CHATS, R.string.MainTabsChats);
        this.K[1] = ph.b.b(context, this.resourceProvider, ph.a.CONTACTS, R.string.MainTabsContacts);
        this.K[2] = ph.b.b(context, this.resourceProvider, ph.a.SETTINGS, R.string.Settings);
        this.K[3] = ph.b.b(context, this.resourceProvider, ph.a.CALLS, R.string.MainTabsCalls);
        ph.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        ph.b bVar = new ph.b(context);
        bVar.f44085a.setText(LocaleController.getString(i12));
        bVar.f44086b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(0, user);
        org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
        x9Var.e(user, i9Var);
        x9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f44087c = x9Var;
        bVar.addView(x9Var, w7.x5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f44093w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f44092s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final eh0 f43430b;

            {
                this.f43430b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return eh0.Z(this.f43430b, view);
                    case 1:
                        eh0 eh0Var = this.f43430b;
                        if (eh0Var.getParentActivity() == null || eh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                        H.f28662u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28642i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        eh0 eh0Var2 = this.f43430b;
                        if (eh0Var2.getParentActivity() == null || eh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                        if (eh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                        }
                        H2.f28662u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f43430b.k0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final eh0 f43430b;

            {
                this.f43430b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return eh0.Z(this.f43430b, view);
                    case 1:
                        eh0 eh0Var = this.f43430b;
                        if (eh0Var.getParentActivity() == null || eh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                        H.f28662u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28642i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        eh0 eh0Var2 = this.f43430b;
                        if (eh0Var2.getParentActivity() == null || eh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                        if (eh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                        }
                        H2.f28662u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f43430b.k0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final eh0 f43430b;

            {
                this.f43430b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return eh0.Z(this.f43430b, view);
                    case 1:
                        eh0 eh0Var = this.f43430b;
                        if (eh0Var.getParentActivity() == null || eh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                        H.f28662u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28642i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        eh0 eh0Var2 = this.f43430b;
                        if (eh0Var2.getParentActivity() == null || eh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                        if (eh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                        }
                        H2.f28662u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f43430b.k0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final eh0 f43430b;

            {
                this.f43430b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return eh0.Z(this.f43430b, view);
                    case 1:
                        eh0 eh0Var = this.f43430b;
                        if (eh0Var.getParentActivity() == null || eh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(eh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ah0(eh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ah0(eh0Var, 6), false);
                        H.f28662u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28642i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        eh0 eh0Var2 = this.f43430b;
                        if (eh0Var2.getParentActivity() == null || eh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(eh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ah0(eh0Var2, 1), false);
                        if (eh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ah0(eh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ah0(eh0Var2, 3), false);
                        }
                        H2.f28662u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), eh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f43430b.k0(view);
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
            bVar2.setOnClickListener(new di.o4(this, i10, 19));
            this.F.addView(this.K[i13]);
            this.F.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f34816c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6);
        gh.c cVar = this.S;
        cVar.a(themedColor);
        ih.k kVar = new ih.k(this.f34815b);
        gh.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        j0 j0Var = this.f34815b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        gh0 gh0Var2 = this.F;
        eh.e f7 = fh.b.f(this.resourceProvider);
        dh.d k10 = aVar.k();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (k10 instanceof dh.e)) {
            dh.e eVar = (dh.e) k10;
            eVar.N = new bh.g(eVar.I);
        }
        k10.n(f7);
        if (j0Var != null && gh0Var2 != null) {
            kVar.d(gh0Var2, j0Var, new ah.i0(1, k10, gh0Var2), false);
        }
        this.G = k10;
        k10.p(AndroidUtilities.dp(28.0f));
        this.G.o(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        j0 j0Var2 = this.f34815b;
        this.H = new View(context);
        View view = this.H;
        dh.f fVar = new dh.f(cVar);
        fVar.n(null);
        if (j0Var2 != null && view != null) {
            kVar.d(view, j0Var2, new ah.i0(1, fVar, view), false);
        }
        bh.c cVar2 = new bh.c(fVar);
        cVar2.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(cVar2);
        this.f34815b.addView(this.H, w7.x5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ah.f(21));
        this.E.addView(this.F, w7.x5.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f34815b.addView(this.E, w7.x5.e(-1, -2, 80));
        jh1 jh1Var = new jh1(context);
        this.f36082y = jh1Var;
        this.f34815b.addView(jh1Var, w7.x5.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f36082y);
        this.f36080w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f34815b;
    }

    public final void d0() {
        gh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.T) != null && (view = this.fragmentView) != null) {
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
                IUpdateLayout iUpdateLayout3 = this.f36080w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f36080w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f36080w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f36080w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f36080w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f36080w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f33429d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f34816c.getCurrentPosition();
                SparseArray sparseArray = this.f34814a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    zh1 zh1Var = (zh1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && zh1Var != null) {
                        zh1Var.f43438a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                ai1 ai1Var = this.f34816c;
                if (ai1Var != null && ai1Var.getCurrentPosition() == 2) {
                    this.f34816c.D(0);
                    m0(0, true);
                    this.f36081x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                ph.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f44087c.e(user, new org.telegram.ui.Components.i9(0, user));
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20607a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6);
        ai1 ai1Var = this.f34816c;
        if (ai1Var != null) {
            f7 = ai1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.S.a(i0.a.d(f7, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        dh.d dVar = this.G;
        if (dVar != null) {
            dVar.u();
        }
        d0();
        View view2 = this.H;
        if (view2 != null) {
            view2.invalidate();
        }
        gh0 gh0Var = this.F;
        if (gh0Var != null) {
            gh0Var.invalidate();
        }
        ph.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (ph.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f44093w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, bVar.d);
                bVar.f44092s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        boolean z10;
        if (this.F != null && this.K[1] != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && ContactsController.hasContactsPermission()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (i10 >= 23 && UserConfig.getInstance(this.currentAccount).syncContacts && !z10 && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
                this.K[1].d("!", true, true);
            } else {
                this.K[1].d(null, true, true);
            }
        }
    }

    public final void g0(boolean z10, boolean z11) {
        gh0 gh0Var = this.F;
        if (gh0Var != null) {
            gh0Var.i(this.K[2], !z10, z11);
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
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f20207c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20663d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f20734h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        ai1 ai1Var = this.f34816c;
        if (ai1Var != null && this.H != null) {
            float a2 = 1.0f - w7.p.a(Math.abs(3.0f - ai1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.L)) * a2)) * this.v.f15368e;
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
        View view = this.f36082y.f37778b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f7 = this.v.f15368e;
        AndroidUtilities.lerp(0.85f, 1.0f, f7);
        this.E.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f7));
        gh0 gh0Var = this.F;
        boolean z11 = true;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        gh0Var.setClickable(z10);
        gh0 gh0Var2 = this.F;
        if (i13 <= 0) {
            z11 = false;
        }
        gh0Var2.setEnabled(z11);
        this.F.setAlpha(f7);
        gh0 gh0Var3 = this.F;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        gh0Var3.setVisibility(i11);
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
        Collections.sort(arrayList, new f6(25));
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new ah0(this, 0), false);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.f20753i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
                i9Var.r(currentUser);
                org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(this, getParentActivity(), z10);
                linearLayout.addView(ig0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(getParentActivity());
                if (z10) {
                    x9Var.setScaleX(0.833f);
                    x9Var.setScaleY(0.833f);
                }
                x9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                x9Var.getImageReceiver().setCurrentAccount(intValue);
                x9Var.e(currentUser, i9Var);
                ig0Var.addView(x9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20770j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.ua(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        H.f28662u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f20663d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.j40.f27337r.a();
    }

    public final uy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        uy uyVar = new uy(bundle);
        this.J = uyVar;
        uyVar.I3 = new bh0(this);
        this.f34814a.put(0, new zh1(uyVar));
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
        if (onBackPressed && this.f34816c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f34816c.D(0);
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
        this.O = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.P = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.qc.h(this.f34815b);
        NotificationCenter.ObserversGroup observersGroup = this.O;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.O = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.P;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.P = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        di.f4 f4Var = this.Q;
        if (f4Var != null) {
            f4Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.R) {
            return;
        }
        if (this.Q == null && org.telegram.ui.Components.j40.f27337r.c()) {
            AndroidUtilities.runOnUIThread(new ah0(this, 7), 1500L);
        }
        this.R = true;
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
    public final void z(float f7, int i10) {
    }
}
