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
public final class ng0 extends vg1 implements NotificationCenter.NotificationCenterDelegate, vd.b {
    public FrameLayout A;
    public pg0 B;
    public ng.d C;
    public View D;
    public Integer E;
    public fy F;
    public zg.b[] G;
    public int H;
    public int I;
    public int J;
    public NotificationCenter.ObserversGroup K;
    public NotificationCenter.ObserversGroup L;
    public nh.t3 M;
    public boolean N;
    public final qg.c O;
    public final qg.d P;
    public IUpdateLayout f40797w;
    public boolean f40798x;
    public eg1 f40799y;
    public final vd.a v = new vd.a(0, this, org.telegram.ui.Components.jr.h, 380, true);
    public final RectF Q = new RectF();

    public ng0() {
        if (Build.VERSION.SDK_INT >= 31) {
            qg.d dVar = new qg.d(null);
            this.P = dVar;
            dVar.i(new kg0(this));
        } else {
            this.P = null;
        }
        this.O = new qg.c();
        w8 w8Var = new w8(this, 5);
        setBulletinDelegate(w8Var);
        org.telegram.ui.Components.mc.a(this.f43593b, w8Var);
    }

    public static void Y(ng0 ng0Var, int i10, org.telegram.ui.Components.j70 j70Var) {
        if (ng0Var.currentAccount != i10) {
            j70Var.u();
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
            }
        }
    }

    public static boolean Z(org.telegram.ui.ng0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ng0.Z(org.telegram.ui.ng0, android.view.View):boolean");
    }

    public static void a0(ng0 ng0Var) {
        ng0Var.getUserConfig().setShowCallsTab(true);
        ng0Var.g0(true, true);
        NotificationCenter.getInstance(ng0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    public static void b0(ng0 ng0Var) {
        ng0Var.getClass();
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
            ng0Var.presentFragment(new fg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            ng0Var.showDialog(new cg.v0(7, ng0Var.currentAccount, ng0Var.getParentActivity(), ng0Var, null));
        }
    }

    public static void c0(ng0 ng0Var) {
        ng0Var.getUserConfig().setShowCallsTab(false);
        ng0Var.g0(false, true);
        NotificationCenter.getInstance(ng0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
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
                return new h9(bundle2);
            }
            return new b81(a4.w.i("hasMainTabs", true));
        } else if (i10 == 0) {
            fy fyVar = new fy(a4.w.i("hasMainTabs", true));
            this.F = fyVar;
            fyVar.E3 = new kg0(this);
            return fyVar;
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
        pg0 pg0Var = new pg0(context, this.resourceProvider);
        this.B = pg0Var;
        pg0Var.setClipChildren(false);
        this.B.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.B.setMaxWidth(AndroidUtilities.dp(344.0f));
        zg.b[] bVarArr = new zg.b[5];
        this.G = bVarArr;
        bVarArr[0] = zg.b.b(context, this.resourceProvider, zg.a.CHATS, R.string.MainTabsChats);
        this.G[1] = zg.b.b(context, this.resourceProvider, zg.a.CONTACTS, R.string.MainTabsContacts);
        this.G[2] = zg.b.b(context, this.resourceProvider, zg.a.SETTINGS, R.string.Settings);
        this.G[3] = zg.b.b(context, this.resourceProvider, zg.a.CALLS, R.string.MainTabsCalls);
        zg.b[] bVarArr2 = this.G;
        org.telegram.ui.ActionBar.c6 c6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        zg.b bVar = new zg.b(context);
        bVar.f50859a.setText(LocaleController.getString(i12));
        bVar.f50860b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9(0, user);
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        t9Var.e(user, e9Var);
        t9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f50861c = t9Var;
        bVar.addView(t9Var, i7.f6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f50867w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, c6Var);
        bVar.f50866s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, c6Var);
        bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, c6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.G[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39260b;

            {
                this.f39260b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Z(this.f39260b, view);
                    case 1:
                        ng0 ng0Var = this.f39260b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f29602u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29582i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39260b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H2 = org.telegram.ui.Components.j70.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f29602u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39260b.k0(view);
                        return true;
                }
            }
        });
        this.G[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39260b;

            {
                this.f39260b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Z(this.f39260b, view);
                    case 1:
                        ng0 ng0Var = this.f39260b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f29602u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29582i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39260b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H2 = org.telegram.ui.Components.j70.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f29602u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39260b.k0(view);
                        return true;
                }
            }
        });
        this.G[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39260b;

            {
                this.f39260b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Z(this.f39260b, view);
                    case 1:
                        ng0 ng0Var = this.f39260b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f29602u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29582i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39260b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H2 = org.telegram.ui.Components.j70.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f29602u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39260b.k0(view);
                        return true;
                }
            }
        });
        this.G[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final ng0 f39260b;

            {
                this.f39260b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return ng0.Z(this.f39260b, view);
                    case 1:
                        ng0 ng0Var = this.f39260b;
                        if (ng0Var.getParentActivity() == null || ng0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(ng0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new jg0(ng0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new jg0(ng0Var, 6), false);
                        H.f29602u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29582i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        ng0 ng0Var2 = this.f39260b;
                        if (ng0Var2.getParentActivity() == null || ng0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.j70 H2 = org.telegram.ui.Components.j70.H(ng0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new jg0(ng0Var2, 1), false);
                        if (ng0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new jg0(ng0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new jg0(ng0Var2, 3), false);
                        }
                        H2.f29602u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), ng0Var2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f39260b.k0(view);
                        return true;
                }
            }
        });
        this.B.L.add(this.G[0]);
        this.B.L.add(this.G[1]);
        this.B.L.add(this.G[4]);
        this.B.L.add(this.G[3]);
        int i13 = 0;
        while (true) {
            zg.b[] bVarArr3 = this.G;
            if (i13 >= bVarArr3.length) {
                break;
            }
            zg.b bVar2 = bVarArr3[i13];
            if (i13 > 2) {
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            bVar2.setOnClickListener(new jh.y0(this, i10, 18));
            this.B.addView(this.G[i13]);
            this.B.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f43594c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6);
        qg.c cVar = this.O;
        cVar.a(themedColor);
        sg.i iVar = new sg.i(this.f43593b);
        qg.a aVar = this.P;
        if (aVar == null) {
            aVar = cVar;
        }
        n0 n0Var = this.f43593b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        pg0 pg0Var2 = this.B;
        og.d f9 = pg.a.f(this.resourceProvider);
        ng.d v = aVar.v();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (v instanceof ng.e)) {
            ng.e eVar = (ng.e) v;
            eVar.N = new lg.f(eVar.I);
        }
        v.n(f9);
        if (n0Var != null && pg0Var2 != null) {
            iVar.d(pg0Var2, n0Var, new kg.w(1, v, pg0Var2), false);
        }
        this.C = v;
        v.p(AndroidUtilities.dp(28.0f));
        this.C.o(AndroidUtilities.dp(7.666f));
        this.B.setBackground(this.C);
        n0 n0Var2 = this.f43593b;
        this.D = new View(context);
        View view = this.D;
        ng.f fVar = new ng.f(cVar);
        fVar.n(null);
        if (n0Var2 != null && view != null) {
            iVar.d(view, n0Var2, new kg.w(1, fVar, view), false);
        }
        lg.b bVar3 = new lg.b(fVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.D.setBackground(bVar3);
        this.f43593b.addView(this.D, i7.f6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.A = frameLayout;
        frameLayout.setOnClickListener(new bg.n(24));
        this.A.addView(this.B, i7.f6.e(-1, 72, 81));
        this.A.setClipToPadding(false);
        this.f43593b.addView(this.A, i7.f6.e(-1, -2, 80));
        eg1 eg1Var = new eg1(context);
        this.f40799y = eg1Var;
        this.f43593b.addView(eg1Var, i7.f6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f40799y);
        this.f40797w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f43593b;
    }

    public final void d0() {
        qg.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.P) != null && (view = this.fragmentView) != null) {
            dVar.h(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.j();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zg.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f40797w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f40797w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f40797w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f40797w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f40797w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f40797w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.C1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.Z.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f43594c.getCurrentPosition();
                SparseArray sparseArray = this.f43592a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    tg1 tg1Var = (tg1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && tg1Var != null) {
                        tg1Var.f42707a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                ug1 ug1Var = this.f43594c;
                if (ug1Var != null && ug1Var.getCurrentPosition() == 2) {
                    this.f43594c.D(0);
                    m0(0, true);
                    this.f40798x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                zg.b[] bVarArr = this.G;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f50861c.e(user, new org.telegram.ui.Components.e9(0, user));
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
        float f9;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23009a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6);
        ug1 ug1Var = this.f43594c;
        if (ug1Var != null) {
            f9 = ug1Var.r(0);
        } else {
            f9 = 1.0f;
        }
        this.O.a(i0.a.d(f9, themedColor, themedColor2));
        View view = this.D;
        if (view != null) {
            view.invalidate();
        }
        ng.d dVar = this.C;
        if (dVar != null) {
            dVar.u();
        }
        d0();
        View view2 = this.D;
        if (view2 != null) {
            view2.invalidate();
        }
        pg0 pg0Var = this.B;
        if (pg0Var != null) {
            pg0Var.invalidate();
        }
        zg.b[] bVarArr = this.G;
        if (bVarArr != null) {
            for (zg.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f50867w = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.cl, bVar.d);
                bVar.f50866s = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.al, bVar.d);
                bVar.v = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.bl, bVar.d);
                bVar.f();
                bVar.invalidate();
            }
        }
    }

    public final void f0() {
        boolean z10;
        if (this.B != null && this.G[1] != null) {
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
                this.G[1].d("!", true, true);
            } else {
                this.G[1].d(null, true, true);
            }
        }
    }

    public final void g0(boolean z10, boolean z11) {
        pg0 pg0Var = this.B;
        if (pg0Var != null) {
            pg0Var.i(this.G[2], !z10, z11);
            this.B.i(this.G[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f9) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f9);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23984c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        f fVar = new f(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23062d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23133h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        ug1 ug1Var = this.f43594c;
        if (ug1Var != null && this.D != null) {
            float a2 = 1.0f - i7.w.a(Math.abs(3.0f - ug1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.H)) * a2)) * this.v.f49505e;
            this.D.setAlpha(navigationBarThirdButtonsFactor);
            this.D.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
            View view = this.D;
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
        View view = this.f40799y.f37822b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f9 = this.v.f49505e;
        AndroidUtilities.lerp(0.85f, 1.0f, f9);
        this.A.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f9));
        pg0 pg0Var = this.B;
        boolean z11 = true;
        int i13 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        pg0Var.setClickable(z10);
        pg0 pg0Var2 = this.B;
        if (i13 <= 0) {
            z11 = false;
        }
        pg0Var2.setEnabled(z11);
        this.B.setAlpha(f9);
        pg0 pg0Var3 = this.B;
        if (f9 <= 0.0f) {
            i11 = 8;
        }
        pg0Var3.setVisibility(i11);
    }

    public final void j0(boolean z10) {
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

    public final void k0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.wp0(7));
        org.telegram.ui.Components.j70 H = org.telegram.ui.Components.j70.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new jg0(this, 0), false);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.e9 e9Var = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                e9Var.r(currentUser);
                cg.y yVar = new cg.y(this, getParentActivity(), z10);
                linearLayout.addView(yVar, i7.f6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getParentActivity());
                if (z10) {
                    t9Var.setScaleX(0.833f);
                    t9Var.setScaleY(0.833f);
                }
                t9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                t9Var.getImageReceiver().setCurrentAccount(intValue);
                t9Var.e(currentUser, e9Var);
                yVar.addView(t9Var, i7.f6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23169j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, i7.f6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bg.p2(this, intValue, H, 16));
                H.r(linearLayout, i7.f6.n(230, 48));
            }
        }
        H.f29602u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.g6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.h40.f29056r.a();
    }

    public final fy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        fy fyVar = new fy(bundle);
        this.F = fyVar;
        fyVar.E3 = new kg0(this);
        this.f43592a.put(0, new tg1(fyVar));
        return this.F;
    }

    public final void m0(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            zg.b[] bVarArr = this.G;
            if (i12 < bVarArr.length) {
                zg.b bVar = bVarArr[i12];
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

    public final void n0(float f9, boolean z10) {
        for (int i10 = 0; i10 < this.G.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs((i10 > 2 ? i10 - 1 : i10) - f9));
            zg.b bVar = this.G[i10];
            bVar.F = max;
            bVar.E = z10;
            bVar.invalidate();
        }
        this.B.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f43594c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f43594c.D(0);
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
        this.K = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.callTabsVisibleToggled).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck);
        this.L = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.appUpdateAvailable).add(NotificationCenter.appUpdateLoading).add(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.mc.h(this.f43593b);
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
        nh.t3 t3Var = this.M;
        if (t3Var != null) {
            t3Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        e0();
        f0();
        j0(true);
        if (this.N) {
            return;
        }
        if (this.M == null && org.telegram.ui.Components.h40.f29056r.c()) {
            AndroidUtilities.runOnUIThread(new jg0(this, 7), 1500L);
        }
        this.N = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f9) {
        org.telegram.ui.ActionBar.o2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f9);
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
    public final void z(float f9, int i10) {
    }
}
