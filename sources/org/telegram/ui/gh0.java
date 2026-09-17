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
public final class gh0 extends ai1 implements NotificationCenter.NotificationCenterDelegate, le.d {
    public FrameLayout E;
    public ih0 F;
    public ch.d G;
    public View H;
    public Integer I;
    public wy J;
    public oh.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public NotificationCenter.ObserversGroup P;
    public ci.f4 Q;
    public boolean R;
    public final fh.c S;
    public final fh.d T;
    public IUpdateLayout f33976w;
    public boolean f33977x;
    public kh1 f33978y;
    public final le.b v = new le.b(0, this, org.telegram.ui.Components.qr.h, 380, true);
    public final RectF U = new RectF();

    public gh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            fh.d dVar = new fh.d(null);
            this.T = dVar;
            dVar.j(new dh0(this));
        } else {
            this.T = null;
        }
        this.S = new fh.c();
        b9 b9Var = new b9(this, 5);
        setBulletinDelegate(b9Var);
        org.telegram.ui.Components.oc.a(this.f31899b, b9Var);
    }

    public static boolean Y(org.telegram.ui.gh0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gh0.Y(org.telegram.ui.gh0, android.view.View):boolean");
    }

    public static void Z(gh0 gh0Var) {
        gh0Var.getUserConfig().setShowCallsTab(true);
        gh0Var.g0(true, true);
        NotificationCenter.getInstance(gh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void a0(gh0 gh0Var) {
        gh0Var.getClass();
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
            gh0Var.presentFragment(new yg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            gh0Var.showDialog(new rg.j0(7, gh0Var.currentAccount, gh0Var.getParentActivity(), gh0Var, null));
        }
    }

    public static void b0(gh0 gh0Var, int i10, org.telegram.ui.Components.n70 n70Var) {
        if (gh0Var.currentAccount != i10) {
            n70Var.u();
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static void c0(gh0 gh0Var) {
        gh0Var.getUserConfig().setShowCallsTab(false);
        gh0Var.g0(false, true);
        NotificationCenter.getInstance(gh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void D(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.o2 V(int i10) {
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
                return new m9(bundle2);
            }
            return new g91(a4.a.i("hasMainTabs", true));
        } else if (i10 == 0) {
            wy wyVar = new wy(a4.a.i("hasMainTabs", true));
            this.J = wyVar;
            wyVar.I3 = new dh0(this);
            return wyVar;
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
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null && X.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        int i10;
        super.createView(context);
        ih0 ih0Var = new ih0(context, this.resourceProvider);
        this.F = ih0Var;
        ih0Var.setClipChildren(false);
        this.F.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.F.setMaxWidth(AndroidUtilities.dp(344.0f));
        oh.b[] bVarArr = new oh.b[5];
        this.K = bVarArr;
        bVarArr[0] = oh.b.b(context, this.resourceProvider, oh.a.CHATS, R.string.MainTabsChats);
        this.K[1] = oh.b.b(context, this.resourceProvider, oh.a.CONTACTS, R.string.MainTabsContacts);
        this.K[2] = oh.b.b(context, this.resourceProvider, oh.a.SETTINGS, R.string.Settings);
        this.K[3] = oh.b.b(context, this.resourceProvider, oh.a.CALLS, R.string.MainTabsCalls);
        oh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        oh.b bVar = new oh.b(context);
        bVar.f15556a.setText(LocaleController.getString(i12));
        bVar.f15557b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9(0, user);
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
        u9Var.e(user, f9Var);
        u9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f15558c = u9Var;
        bVar.addView(u9Var, w7.x5.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f15563w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f15562s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final gh0 f32180b;

            {
                this.f32180b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return gh0.Y(this.f32180b, view);
                    case 1:
                        gh0 gh0Var = this.f32180b;
                        if (gh0Var.getParentActivity() == null || gh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(gh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ch0(gh0Var, 4), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ch0(gh0Var, 5), false);
                        H.f26386u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26366i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        gh0 gh0Var2 = this.f32180b;
                        if (gh0Var2.getParentActivity() == null || gh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(gh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ch0(gh0Var2, 1), false);
                        if (gh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ch0(gh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ch0(gh0Var2, 3), false);
                        }
                        H2.f26386u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f32180b.k0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final gh0 f32180b;

            {
                this.f32180b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return gh0.Y(this.f32180b, view);
                    case 1:
                        gh0 gh0Var = this.f32180b;
                        if (gh0Var.getParentActivity() == null || gh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(gh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ch0(gh0Var, 4), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ch0(gh0Var, 5), false);
                        H.f26386u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26366i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        gh0 gh0Var2 = this.f32180b;
                        if (gh0Var2.getParentActivity() == null || gh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(gh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ch0(gh0Var2, 1), false);
                        if (gh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ch0(gh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ch0(gh0Var2, 3), false);
                        }
                        H2.f26386u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f32180b.k0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final gh0 f32180b;

            {
                this.f32180b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return gh0.Y(this.f32180b, view);
                    case 1:
                        gh0 gh0Var = this.f32180b;
                        if (gh0Var.getParentActivity() == null || gh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(gh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ch0(gh0Var, 4), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ch0(gh0Var, 5), false);
                        H.f26386u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26366i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        gh0 gh0Var2 = this.f32180b;
                        if (gh0Var2.getParentActivity() == null || gh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(gh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ch0(gh0Var2, 1), false);
                        if (gh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ch0(gh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ch0(gh0Var2, 3), false);
                        }
                        H2.f26386u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f32180b.k0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final gh0 f32180b;

            {
                this.f32180b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return gh0.Y(this.f32180b, view);
                    case 1:
                        gh0 gh0Var = this.f32180b;
                        if (gh0Var.getParentActivity() == null || gh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(gh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new ch0(gh0Var, 4), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new ch0(gh0Var, 5), false);
                        H.f26386u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f26366i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        gh0 gh0Var2 = this.f32180b;
                        if (gh0Var2.getParentActivity() == null || gh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.n70 H2 = org.telegram.ui.Components.n70.H(gh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new ch0(gh0Var2, 1), false);
                        if (gh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new ch0(gh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new ch0(gh0Var2, 3), false);
                        }
                        H2.f26386u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), gh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f32180b.k0(view);
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
            bVar2.setOnClickListener(new ci.o4(this, i10, 19));
            this.F.addView(this.K[i13]);
            this.F.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f31900c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6);
        fh.c cVar = this.S;
        cVar.a(themedColor);
        hh.k kVar = new hh.k(this.f31899b);
        fh.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        ah.c cVar2 = new ah.c(aVar);
        j0 j0Var = this.f31899b;
        cVar2.f425f = kVar;
        cVar2.f426g = j0Var;
        cVar2.f427i = LiteMode.isEnabled(262144);
        ch.d c10 = cVar2.c(this.F, eh.b.f(this.resourceProvider), false);
        this.G = c10;
        c10.q(AndroidUtilities.dp(28.0f));
        this.G.p(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        ah.c cVar3 = new ah.c(cVar);
        j0 j0Var2 = this.f31899b;
        cVar3.f425f = kVar;
        cVar3.f426g = j0Var2;
        this.H = new View(context);
        ah.e eVar = new ah.e(cVar3.c(this.H, null, false));
        eVar.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(eVar);
        this.f31899b.addView(this.H, w7.x5.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new ai.e2(20));
        this.E.addView(this.F, w7.x5.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f31899b.addView(this.E, w7.x5.e(-1, -2, 80));
        kh1 kh1Var = new kh1(context);
        this.f33978y = kh1Var;
        this.f31899b.addView(kh1Var, w7.x5.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f33978y);
        this.f33976w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f31899b;
    }

    public final void d0() {
        fh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.T) != null && (view = this.fragmentView) != null) {
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
                IUpdateLayout iUpdateLayout3 = this.f33976w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f33976w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f33976w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f33976w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f33976w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f33976w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f30834d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f31900c.getCurrentPosition();
                SparseArray sparseArray = this.f31898a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    yh1 yh1Var = (yh1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && yh1Var != null) {
                        yh1Var.f39918a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                zh1 zh1Var = this.f31900c;
                if (zh1Var != null && zh1Var.getCurrentPosition() == 2) {
                    this.f31900c.E(0);
                    m0(0, true);
                    this.f33977x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                oh.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f15558c.e(user, new org.telegram.ui.Components.f9(0, user));
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18806a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6);
        zh1 zh1Var = this.f31900c;
        if (zh1Var != null) {
            f7 = zh1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.S.a(i0.a.d(f7, themedColor, themedColor2));
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
        ih0 ih0Var = this.F;
        if (ih0Var != null) {
            ih0Var.invalidate();
        }
        oh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (oh.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f15563w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, bVar.d);
                bVar.f15562s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, bVar.d);
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
        ih0 ih0Var = this.F;
        if (ih0Var != null) {
            ih0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.b4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.b4.f18473c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18862d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f18933h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        zh1 zh1Var = this.f31900c;
        if (zh1Var != null && this.H != null) {
            float a2 = 1.0f - w7.p.a(Math.abs(3.0f - zh1Var.getPositionAnimated()), 0.0f, 1.0f);
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
        View view = this.f33978y.f35284b;
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
        ih0 ih0Var = this.F;
        boolean z11 = true;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ih0Var.setClickable(z10);
        ih0 ih0Var2 = this.F;
        if (i13 <= 0) {
            z11 = false;
        }
        ih0Var2.setEnabled(z11);
        this.F.setAlpha(f7);
        ih0 ih0Var3 = this.F;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        ih0Var3.setVisibility(i11);
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
        Collections.sort(arrayList, new ff(23));
        org.telegram.ui.Components.n70 H = org.telegram.ui.Components.n70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new ch0(this, 0), false);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.f18952i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
                f9Var.r(currentUser);
                org.telegram.ui.Components.jg0 jg0Var = new org.telegram.ui.Components.jg0(this, getParentActivity(), z10);
                linearLayout.addView(jg0Var, w7.x5.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(getParentActivity());
                if (z10) {
                    u9Var.setScaleX(0.833f);
                    u9Var.setScaleY(0.833f);
                }
                u9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                u9Var.getImageReceiver().setCurrentAccount(intValue);
                u9Var.e(currentUser, f9Var);
                jg0Var.addView(u9Var, w7.x5.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18969j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.x5.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.va(this, intValue, H, 12));
                H.r(linearLayout, w7.x5.n(230, 48));
            }
        }
        H.f26386u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.j40.f25104r.a();
    }

    public final wy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        wy wyVar = new wy(bundle);
        this.J = wyVar;
        wyVar.I3 = new dh0(this);
        this.f31898a.put(0, new yh1(wyVar));
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
        if (onBackPressed && this.f31900c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f31900c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.o2 X = X();
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
        org.telegram.ui.Components.oc.h(this.f31899b);
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
        ci.f4 f4Var = this.Q;
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
        if (this.Q == null && org.telegram.ui.Components.j40.f25104r.c()) {
            AndroidUtilities.runOnUIThread(new ch0(this, 6), 1500L);
        }
        this.R = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
