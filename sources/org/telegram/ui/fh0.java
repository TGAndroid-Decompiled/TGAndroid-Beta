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
public final class fh0 extends gi1 implements NotificationCenter.NotificationCenterDelegate, le.d {
    public FrameLayout E;
    public hh0 F;
    public bh.d G;
    public View H;
    public Integer I;
    public wy J;
    public nh.b[] K;
    public int L;
    public int M;
    public int N;
    public NotificationCenter.ObserversGroup O;
    public NotificationCenter.ObserversGroup P;
    public bi.x4 Q;
    public boolean R;
    public final eh.c S;
    public final eh.d T;
    public IUpdateLayout f32833w;
    public boolean f32834x;
    public oh1 f32835y;
    public final le.b v = new le.b(0, this, org.telegram.ui.Components.wr.h, 380, true);
    public final RectF U = new RectF();

    public fh0() {
        if (Build.VERSION.SDK_INT >= 31) {
            eh.d dVar = new eh.d(null);
            this.T = dVar;
            dVar.j(new ch0(this));
        } else {
            this.T = null;
        }
        this.S = new eh.c();
        z8 z8Var = new z8(this, 5);
        setBulletinDelegate(z8Var);
        org.telegram.ui.Components.pc.a(this.f33116b, z8Var);
    }

    public static void Y(fh0 fh0Var, int i10, org.telegram.ui.Components.w70 w70Var) {
        if (fh0Var.currentAccount != i10) {
            w70Var.u();
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
            fh0Var.presentFragment(new xg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            fh0Var.showDialog(new qg.k0(7, fh0Var.currentAccount, fh0Var.getParentActivity(), fh0Var, null));
        }
    }

    public static void c0(fh0 fh0Var) {
        fh0Var.getUserConfig().setShowCallsTab(false);
        fh0Var.g0(false, true);
        NotificationCenter.getInstance(fh0Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.callTabsVisibleToggled, new Object[0]);
    }

    @Override
    public final void G(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            i0();
            h0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.p2 V(int i10) {
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
            return new k91(a4.a.i("hasMainTabs", true));
        } else if (i10 == 0) {
            wy wyVar = new wy(a4.a.i("hasMainTabs", true));
            this.J = wyVar;
            wyVar.I3 = new ch0(this);
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
        org.telegram.ui.ActionBar.p2 X = X();
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
        nh.b[] bVarArr = new nh.b[5];
        this.K = bVarArr;
        bVarArr[0] = nh.b.b(context, this.resourceProvider, nh.a.CHATS, R.string.MainTabsChats);
        this.K[1] = nh.b.b(context, this.resourceProvider, nh.a.CONTACTS, R.string.MainTabsContacts);
        this.K[2] = nh.b.b(context, this.resourceProvider, nh.a.SETTINGS, R.string.Settings);
        this.K[3] = nh.b.b(context, this.resourceProvider, nh.a.CALLS, R.string.MainTabsCalls);
        nh.b[] bVarArr2 = this.K;
        org.telegram.ui.ActionBar.f6 f6Var = this.resourceProvider;
        int i11 = this.currentAccount;
        int i12 = R.string.MainTabsProfile;
        nh.b bVar = new nh.b(context);
        bVar.f14059a.setText(LocaleController.getString(i12));
        bVar.f14060b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i11).getUser(Long.valueOf(UserConfig.getInstance(i11).getClientUserId()));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(0, user);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.e(user, g9Var);
        w9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f14061c = w9Var;
        bVar.addView(w9Var, w7.a6.d(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f14066w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f14065s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        bVarArr2[4] = bVar;
        this.K[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f31008b;

            {
                this.f31008b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f31008b, view);
                    case 1:
                        fh0 fh0Var = this.f31008b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f28703u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28683i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f31008b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f28703u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f31008b.k0(view);
                        return true;
                }
            }
        });
        this.K[1].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f31008b;

            {
                this.f31008b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f31008b, view);
                    case 1:
                        fh0 fh0Var = this.f31008b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f28703u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28683i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f31008b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f28703u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f31008b.k0(view);
                        return true;
                }
            }
        });
        this.K[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f31008b;

            {
                this.f31008b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f31008b, view);
                    case 1:
                        fh0 fh0Var = this.f31008b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f28703u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28683i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f31008b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f28703u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f31008b.k0(view);
                        return true;
                }
            }
        });
        this.K[4].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final fh0 f31008b;

            {
                this.f31008b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        return fh0.Z(this.f31008b, view);
                    case 1:
                        fh0 fh0Var = this.f31008b;
                        if (fh0Var.getParentActivity() == null || fh0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(fh0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new bh0(fh0Var, 5), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new bh0(fh0Var, 6), false);
                        H.f28703u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f28683i = 3;
                        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H.W(b02);
                        H.Z();
                        return true;
                    case 2:
                        fh0 fh0Var2 = this.f31008b;
                        if (fh0Var2.getParentActivity() == null || fh0Var2.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.w70 H2 = org.telegram.ui.Components.w70.H(fh0Var2, view);
                        H2.c(R.drawable.menu_call_create, LocaleController.getString(R.string.GroupCallCreate2), new bh0(fh0Var2, 1), false);
                        if (fh0Var2.getUserConfig().showCallsTab) {
                            H2.c(R.drawable.msg_archive_hide, LocaleController.getString(R.string.HideCallTab), new bh0(fh0Var2, 2), false);
                        } else {
                            H2.c(R.drawable.menu_add_tab_24, LocaleController.getString(R.string.GroupCallShowInMainTabs), new bh0(fh0Var2, 3), false);
                        }
                        H2.f28703u = true;
                        H2.v = true;
                        H2.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        ShapeDrawable b03 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), fh0Var2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
                        b03.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
                        H2.W(b03);
                        H2.Z();
                        return true;
                    default:
                        this.f31008b.k0(view);
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
            nh.b[] bVarArr3 = this.K;
            if (i13 >= bVarArr3.length) {
                break;
            }
            nh.b bVar2 = bVarArr3[i13];
            if (i13 > 2) {
                i10 = i13 - 1;
            } else {
                i10 = i13;
            }
            bVar2.setOnClickListener(new bi.j5(this, i10, 19));
            this.F.addView(this.K[i13]);
            this.F.i(bVar2, true, false);
            i13++;
        }
        g0(getUserConfig().showCallsTab, false);
        m0(this.f33117c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6);
        eh.c cVar = this.S;
        cVar.a(themedColor);
        gh.k kVar = new gh.k(this.f33116b);
        eh.a aVar = this.T;
        if (aVar == null) {
            aVar = cVar;
        }
        k0 k0Var = this.f33116b;
        boolean isEnabled = LiteMode.isEnabled(262144);
        hh0 hh0Var2 = this.F;
        ch.e f7 = dh.c.f(this.resourceProvider);
        bh.d k10 = aVar.k();
        if (isEnabled && Build.VERSION.SDK_INT >= 33 && (k10 instanceof bh.e)) {
            bh.e eVar = (bh.e) k10;
            eVar.N = new zg.f(eVar.I);
        }
        k10.n(f7);
        if (k0Var != null && hh0Var2 != null) {
            kVar.d(hh0Var2, k0Var, new sg.f0(14, k10, hh0Var2), false);
        }
        this.G = k10;
        k10.p(AndroidUtilities.dp(28.0f));
        this.G.o(AndroidUtilities.dp(7.666f));
        this.F.setBackground(this.G);
        k0 k0Var2 = this.f33116b;
        this.H = new View(context);
        View view = this.H;
        bh.f fVar = new bh.f(cVar);
        fVar.n(null);
        if (k0Var2 != null && view != null) {
            kVar.d(view, k0Var2, new sg.f0(14, fVar, view), false);
        }
        zg.b bVar3 = new zg.b(fVar);
        bVar3.b(AndroidUtilities.dp(60.0f), true);
        this.H.setBackground(bVar3);
        this.f33116b.addView(this.H, w7.a6.e(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.E = frameLayout;
        frameLayout.setOnClickListener(new bi.d5(19));
        this.E.addView(this.F, w7.a6.e(-1, 72, 81));
        this.E.setClipToPadding(false);
        this.f33116b.addView(this.E, w7.a6.e(-1, -2, 80));
        oh1 oh1Var = new oh1(context);
        this.f32835y = oh1Var;
        this.f33116b.addView(oh1Var, w7.a6.e(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f32835y);
        this.f32833w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        j0(false);
        return this.f33116b;
    }

    public final void d0() {
        eh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.T) != null && (view = this.fragmentView) != null) {
            dVar.i(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nh.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f32833w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f32833w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f32833w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f32833w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f32833w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f32833w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.G1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f29933d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f33117c.getCurrentPosition();
                SparseArray sparseArray = this.f33115a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ei1 ei1Var = (ei1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && ei1Var != null) {
                        ei1Var.f32218a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.callTabsVisibleToggled) {
                g0(getUserConfig().showCallsTab, true);
                fi1 fi1Var = this.f33117c;
                if (fi1Var != null && fi1Var.getCurrentPosition() == 2) {
                    this.f33117c.D(0);
                    m0(0, true);
                    this.f32834x = true;
                    return;
                }
                W(2);
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                nh.b[] bVarArr = this.K;
                if (bVarArr != null && (bVar = bVarArr[4]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f14061c.e(user, new org.telegram.ui.Components.g9(0, user));
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
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6);
        fi1 fi1Var = this.f33117c;
        if (fi1Var != null) {
            f7 = fi1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.S.a(i0.a.d(f7, themedColor, themedColor2));
        View view = this.H;
        if (view != null) {
            view.invalidate();
        }
        bh.d dVar = this.G;
        if (dVar != null) {
            dVar.u();
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
        nh.b[] bVarArr = this.K;
        if (bVarArr != null) {
            for (nh.b bVar : bVarArr) {
                bVar.getClass();
                bVar.f14066w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, bVar.d);
                bVar.f14065s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, bVar.d);
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
        hh0 hh0Var = this.F;
        if (hh0Var != null) {
            hh0Var.i(this.K[2], !z10, z11);
            this.F.i(this.K[3], z10, z11);
        }
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.f17574c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList themeDescriptions = super.getThemeDescriptions();
        e eVar = new e(this, 23);
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f17928d6));
        themeDescriptions.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.f17998h5));
        return themeDescriptions;
    }

    public final void h0() {
        int i10;
        fi1 fi1Var = this.f33117c;
        if (fi1Var != null && this.H != null) {
            float a2 = 1.0f - w7.q.a(Math.abs(3.0f - fi1Var.getPositionAnimated()), 0.0f, 1.0f);
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
        View view = this.f32835y.f35500b;
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
        hh0 hh0Var = this.F;
        boolean z11 = true;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
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
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(16));
        org.telegram.ui.Components.w70 H = org.telegram.ui.Components.w70.H(this, view);
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
                linearLayout.setBackground(org.telegram.ui.ActionBar.j6.Y(getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), 0, 0));
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9((org.telegram.ui.ActionBar.f6) null);
                g9Var.r(currentUser);
                org.telegram.ui.Components.sg0 sg0Var = new org.telegram.ui.Components.sg0(this, getParentActivity(), z10);
                linearLayout.addView(sg0Var, w7.a6.t(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(getParentActivity());
                if (z10) {
                    w9Var.setScaleX(0.833f);
                    w9Var.setScaleY(0.833f);
                }
                w9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                w9Var.getImageReceiver().setCurrentAccount(intValue);
                w9Var.e(currentUser, g9Var);
                sg0Var.addView(w9Var, w7.a6.t(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, w7.a6.p(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new org.telegram.ui.Cells.wa(this, intValue, H, 12));
                H.r(linearLayout, w7.a6.n(230, 48));
            }
        }
        H.f28703u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable b02 = org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        b02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.j6.l1(0.15f, -16777216));
        H.W(b02);
        H.Z();
        org.telegram.ui.Components.t40.f27309r.a();
    }

    public final wy l0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        wy wyVar = new wy(bundle);
        this.J = wyVar;
        wyVar.I3 = new ch0(this);
        this.f33115a.put(0, new ei1(wyVar));
        return this.J;
    }

    public final void m0(int i10, boolean z10) {
        int i11;
        boolean z11;
        int i12 = 0;
        while (true) {
            nh.b[] bVarArr = this.K;
            if (i12 < bVarArr.length) {
                nh.b bVar = bVarArr[i12];
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
            nh.b bVar = this.K[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.F.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f33117c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f33117c.D(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.p2 X = X();
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
        org.telegram.ui.Components.pc.h(this.f33116b);
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
        bi.x4 x4Var = this.Q;
        if (x4Var != null) {
            x4Var.e(true);
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
        if (this.Q == null && org.telegram.ui.Components.t40.f27309r.c()) {
            AndroidUtilities.runOnUIThread(new bh0(this, 7), 1500L);
        }
        this.R = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.p2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
