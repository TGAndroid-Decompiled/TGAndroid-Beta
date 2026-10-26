package org.telegram.ui;

import android.animation.Animator;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
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
public final class pg0 extends ug1 implements NotificationCenter.NotificationCenterDelegate, oe.d {
    public rg0 E;
    public eh.d F;
    public View G;
    public Integer H;
    public cy I;
    public qh.b[] J;
    public int K;
    public int L;
    public int M;
    public NotificationCenter.ObserversGroup N;
    public fi.v3 O;
    public boolean P;
    public final hh.c Q;
    public final hh.d R;
    public IUpdateLayout f42498w;
    public fg1 f42499x;
    public FrameLayout f42500y;
    public final oe.b v = new oe.b(0, this, org.telegram.ui.Components.ds.h, 380, true);
    public final RectF S = new RectF();

    public pg0() {
        if (Build.VERSION.SDK_INT >= 31) {
            hh.d dVar = new hh.d(null);
            this.R = dVar;
            mg0 mg0Var = new mg0(this);
            if (dVar.f12840c == null) {
                dVar.f12840c = new ch.h(dVar.f12839b, mg0Var);
            }
        } else {
            this.R = null;
        }
        this.Q = new hh.c();
        d9 d9Var = new d9(this, 5);
        setBulletinDelegate(d9Var);
        org.telegram.ui.Components.qc.a(this.f44134b, d9Var);
    }

    public static boolean Y(org.telegram.ui.pg0 r19, android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.pg0.Y(org.telegram.ui.pg0, android.view.View):boolean");
    }

    public static void Z(pg0 pg0Var) {
        pg0Var.getClass();
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
            pg0Var.presentFragment(new gg0(num.intValue()));
        } else if (!UserConfig.hasPremiumOnAccounts()) {
            pg0Var.showDialog(new tg.j0(7, pg0Var.currentAccount, pg0Var.getParentActivity(), pg0Var, null));
        }
    }

    public static void a0(pg0 pg0Var, int i10, org.telegram.ui.Components.k80 k80Var) {
        if (pg0Var.currentAccount != i10) {
            k80Var.u();
            LaunchActivity launchActivity = LaunchActivity.I1;
            if (launchActivity != null) {
                launchActivity.P0(i10);
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        if (i10 == 0) {
            f0();
            e0();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.r2 W(int i10) {
        if (i10 == 1) {
            if (BuildVars.SHOW_NEWS_TAB) {
                return new xj0();
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("needPhonebook", true);
            bundle.putBoolean("needFinishFragment", false);
            bundle.putBoolean("hasMainTabs", true);
            return new ContactsActivity(bundle);
        } else if (i10 == 2) {
            return new d81(a1.g.i("hasMainTabs", true));
        } else {
            if (i10 == 0) {
                cy cyVar = new cy(a1.g.i("hasMainTabs", true));
                this.I = cyVar;
                cyVar.J3 = new mg0(this);
                return cyVar;
            } else if (i10 != 3) {
                return null;
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
                bundle2.putBoolean("my_profile", true);
                bundle2.putBoolean("hasMainTabs", true);
                return new ProfileActivity(bundle2, null);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23427h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23356d6));
    }

    public final void b0() {
        hh.d dVar;
        View view;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.R) != null && (view = this.fragmentView) != null) {
            dVar.g(view.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
            dVar.f12840c.a();
        }
    }

    public final void c0() {
        float f7;
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23299a7);
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
        tg1 tg1Var = this.f44135c;
        if (tg1Var != null) {
            f7 = tg1Var.r(0);
        } else {
            f7 = 1.0f;
        }
        this.Q.a(i0.a.f(f7, themedColor, themedColor2));
        View view = this.G;
        if (view != null) {
            view.invalidate();
        }
        eh.d dVar = this.F;
        if (dVar != null) {
            dVar.updateColors();
        }
        b0();
        View view2 = this.G;
        if (view2 != null) {
            view2.invalidate();
        }
        rg0 rg0Var = this.E;
        if (rg0Var != null) {
            rg0Var.invalidate();
        }
        qh.b[] bVarArr = this.J;
        if (bVarArr != null) {
            for (qh.b bVar : bVarArr) {
                bVar.g();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null && X.canBeginSlide()) {
            return true;
        }
        return false;
    }

    @Override
    public final View createView(Context context) {
        super.createView(context);
        rg0 rg0Var = new rg0(context, this.resourceProvider);
        this.E = rg0Var;
        rg0Var.setClipChildren(false);
        this.E.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.E.setMaxWidth(AndroidUtilities.dp(344.0f));
        qh.b[] bVarArr = new qh.b[4];
        this.J = bVarArr;
        bVarArr[0] = qh.b.c(context, this.resourceProvider, qh.a.CHATS, R.string.MainTabsChats);
        if (BuildVars.SHOW_NEWS_TAB) {
            this.J[1] = qh.b.c(context, this.resourceProvider, qh.a.NEWS, R.string.NewsTitle);
        } else {
            this.J[1] = qh.b.c(context, this.resourceProvider, qh.a.CONTACTS, R.string.MainTabsContacts);
            this.J[1].setOnLongClickListener(new View.OnLongClickListener(this) {
                public final pg0 f40942b;

                {
                    this.f40942b = this;
                }

                @Override
                public final boolean onLongClick(View view) {
                    switch (r2) {
                        case 0:
                            pg0 pg0Var = this.f40942b;
                            if (pg0Var.getParentActivity() == null || pg0Var.getParentActivity() == null) {
                                return false;
                            }
                            org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(pg0Var, view);
                            H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new lg0(pg0Var, 0), false);
                            H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new lg0(pg0Var, 1), false);
                            H.f29870u = true;
                            H.v = true;
                            H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                            H.f29850i = 3;
                            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(28.0f), pg0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                            c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
                            H.W(c02);
                            H.Z();
                            return true;
                        case 1:
                            return pg0.Y(this.f40942b, view);
                        default:
                            this.f40942b.h0(view);
                            return true;
                    }
                }
            });
        }
        this.J[2] = qh.b.c(context, this.resourceProvider, qh.a.SETTINGS, R.string.Settings);
        qh.b[] bVarArr2 = this.J;
        org.telegram.ui.ActionBar.u6 u6Var = this.resourceProvider;
        int i10 = this.currentAccount;
        int i11 = R.string.MainTabsProfile;
        qh.b bVar = new qh.b(context);
        bVar.f47054a.setText(LocaleController.getString(i11));
        bVar.f47055b.setVisibility(8);
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9(0, user);
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        y9Var.f(user, j9Var);
        y9Var.setRoundRadius(AndroidUtilities.dp(11.0f));
        bVar.f47056c = y9Var;
        bVar.addView(y9Var, org.telegram.ui.Components.gb1.h(22, 22.0f, 49, 0.0f, 5.0f, 0.0f, 0.0f));
        bVar.f47061w = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.cl, u6Var);
        bVar.f47060s = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.al, u6Var);
        bVar.v = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.bl, u6Var);
        bVar.a();
        bVarArr2[3] = bVar;
        this.J[0].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final pg0 f40942b;

            {
                this.f40942b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        pg0 pg0Var = this.f40942b;
                        if (pg0Var.getParentActivity() == null || pg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(pg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new lg0(pg0Var, 0), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new lg0(pg0Var, 1), false);
                        H.f29870u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29850i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(28.0f), pg0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 1:
                        return pg0.Y(this.f40942b, view);
                    default:
                        this.f40942b.h0(view);
                        return true;
                }
            }
        });
        this.J[3].setOnLongClickListener(new View.OnLongClickListener(this) {
            public final pg0 f40942b;

            {
                this.f40942b = this;
            }

            @Override
            public final boolean onLongClick(View view) {
                switch (r2) {
                    case 0:
                        pg0 pg0Var = this.f40942b;
                        if (pg0Var.getParentActivity() == null || pg0Var.getParentActivity() == null) {
                            return false;
                        }
                        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(pg0Var, view);
                        H.c(R.drawable.msg_contact_add, LocaleController.getString(R.string.NewContact), new lg0(pg0Var, 0), false);
                        H.c(R.drawable.msg_calls, LocaleController.getString(R.string.VoipChatRecentCalls), new lg0(pg0Var, 1), false);
                        H.f29870u = true;
                        H.v = true;
                        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
                        H.f29850i = 3;
                        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(28.0f), pg0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
                        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
                        H.W(c02);
                        H.Z();
                        return true;
                    case 1:
                        return pg0.Y(this.f40942b, view);
                    default:
                        this.f40942b.h0(view);
                        return true;
                }
            }
        });
        this.E.P.add(this.J[0]);
        this.E.P.add(this.J[1]);
        this.E.P.add(this.J[3]);
        int i12 = 0;
        while (true) {
            qh.b[] bVarArr3 = this.J;
            if (i12 >= bVarArr3.length) {
                break;
            }
            qh.b bVar2 = bVarArr3[i12];
            bVar2.setOnClickListener(new ai.w(this, i12, 25));
            this.E.addView(this.J[i12]);
            this.E.i(bVar2, true, false);
            i12++;
        }
        j0(this.f44135c.getCurrentPosition(), false);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6);
        hh.c cVar = this.Q;
        cVar.a(themedColor);
        jh.k kVar = new jh.k(this.f44134b);
        hh.a aVar = this.R;
        if (aVar == null) {
            aVar = cVar;
        }
        ch.b bVar3 = new ch.b(aVar);
        k0 k0Var = this.f44134b;
        bVar3.f6301f = kVar;
        bVar3.f6302g = k0Var;
        bVar3.f6303i = LiteMode.isEnabled(262144);
        eh.d c10 = bVar3.c(this.E, gh.c.f(this.resourceProvider), false);
        this.F = c10;
        c10.x(AndroidUtilities.dp(28.0f));
        this.F.w(AndroidUtilities.dp(7.666f));
        this.E.setBackground(this.F);
        ch.b bVar4 = new ch.b(cVar);
        k0 k0Var2 = this.f44134b;
        bVar4.f6301f = kVar;
        bVar4.f6302g = k0Var2;
        this.G = new View(context);
        ch.c cVar2 = new ch.c(bVar4.c(this.G, null, false));
        cVar2.b(AndroidUtilities.dp(60.0f), true);
        this.G.setBackground(cVar2);
        this.f44134b.addView(this.G, org.telegram.ui.Components.gb1.i(-1, 0, 80));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f42500y = frameLayout;
        frameLayout.setOnClickListener(new bh.f(22));
        this.f42500y.addView(this.E, org.telegram.ui.Components.gb1.i(-1, 72, 81));
        this.f42500y.setClipToPadding(false);
        this.f44134b.addView(this.f42500y, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        fg1 fg1Var = new fg1(context);
        this.f42499x = fg1Var;
        this.f44134b.addView(fg1Var, org.telegram.ui.Components.gb1.i(-1, -2, 80));
        IUpdateLayout takeUpdateLayout = ApplicationLoader.applicationLoaderInstance.takeUpdateLayout(getParentActivity(), this.f42499x);
        this.f42498w = takeUpdateLayout;
        if (takeUpdateLayout != null) {
            takeUpdateLayout.updateAppUpdateViews(this.currentAccount, false);
        }
        g0(false);
        return this.f44134b;
    }

    public final void d0() {
        if (!BuildVars.SHOW_NEWS_TAB && this.E != null && this.J[1] != null) {
            boolean hasContactsPermission = ContactsController.hasContactsPermission();
            if (hasContactsPermission) {
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts2", true).apply();
            }
            if (UserConfig.getInstance(this.currentAccount).syncContacts && !hasContactsPermission && MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts2", true)) {
                this.J[1].e("!", true, true);
            } else {
                this.J[1].e(null, true, true);
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qh.b bVar;
        LaunchActivity launchActivity;
        IUpdateLayout iUpdateLayout;
        IUpdateLayout iUpdateLayout2;
        boolean z10 = false;
        boolean z11 = false;
        z10 = false;
        if (i10 != NotificationCenter.notificationsCountUpdated && i10 != NotificationCenter.updateInterfaces) {
            if (i10 == NotificationCenter.appUpdateLoading) {
                IUpdateLayout iUpdateLayout3 = this.f42498w;
                if (iUpdateLayout3 != null) {
                    iUpdateLayout3.updateFileProgress(null);
                    this.f42498w.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoaded) {
                String str = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str) && (iUpdateLayout2 = this.f42498w) != null) {
                    iUpdateLayout2.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadFailed) {
                String str2 = (String) objArr[0];
                if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str2) && (iUpdateLayout = this.f42498w) != null) {
                    iUpdateLayout.updateAppUpdateViews(this.currentAccount, true);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.fileLoadProgressChanged) {
                IUpdateLayout iUpdateLayout4 = this.f42498w;
                if (iUpdateLayout4 != null) {
                    iUpdateLayout4.updateFileProgress(objArr);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.appUpdateAvailable) {
                IUpdateLayout iUpdateLayout5 = this.f42498w;
                if (iUpdateLayout5 != null && (launchActivity = LaunchActivity.I1) != null) {
                    int i12 = this.currentAccount;
                    if (launchActivity.f35529d0.size() == 1) {
                        z11 = true;
                    }
                    iUpdateLayout5.updateAppUpdateViews(i12, z11);
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.needSetDayNightTheme) {
                int currentPosition = this.f44135c.getCurrentPosition();
                SparseArray sparseArray = this.f44133a;
                int size = sparseArray.size();
                for (int i13 = 0; i13 < size; i13++) {
                    sg1 sg1Var = (sg1) sparseArray.valueAt(i13);
                    if (sparseArray.keyAt(i13) != currentPosition && sg1Var != null) {
                        sg1Var.f43505a.clearViews();
                    }
                }
                return;
            } else if (i10 == NotificationCenter.mainUserInfoChanged) {
                qh.b[] bVarArr = this.J;
                if (bVarArr != null && (bVar = bVarArr[3]) != null) {
                    int i14 = this.currentAccount;
                    TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(UserConfig.getInstance(i14).getClientUserId()));
                    bVar.f47056c.f(user, new org.telegram.ui.Components.j9(0, user));
                    return;
                }
                return;
            } else if (i10 == NotificationCenter.contactsPermissionBadgeCheck) {
                d0();
                return;
            } else {
                return;
            }
        }
        View view = this.fragmentView;
        if (view != null && view.isAttachedToWindow()) {
            z10 = true;
        }
        g0(z10);
    }

    public final void e0() {
        int i10;
        tg1 tg1Var = this.f44135c;
        if (tg1Var != null && this.G != null) {
            float a2 = 1.0f - a8.ee.a(Math.abs(3.0f - tg1Var.getPositionAnimated()), 0.0f, 1.0f);
            float navigationBarThirdButtonsFactor = (1.0f - ((1.0f - AndroidUtilities.getNavigationBarThirdButtonsFactor(0.0f, 1.0f, this.K)) * a2)) * this.v.e;
            this.G.setAlpha(navigationBarThirdButtonsFactor);
            this.G.setTranslationY(a2 * AndroidUtilities.dp(48.0f));
            View view = this.G;
            if (navigationBarThirdButtonsFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            view.setVisibility(i10);
        }
    }

    public final void f0() {
        int i10;
        boolean z10;
        View view = this.f42499x.f39373b;
        int i11 = 0;
        if (view != null && view.getVisibility() == 0) {
            i10 = AndroidUtilities.dp(44.0f);
        } else {
            i10 = 0;
        }
        int i12 = -i10;
        float f7 = this.v.e;
        AndroidUtilities.lerp(0.85f, 1.0f, f7);
        this.f42500y.setTranslationY(AndroidUtilities.lerp(AndroidUtilities.dp(40.0f) + i12, i12, f7));
        rg0 rg0Var = this.E;
        int i13 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        boolean z11 = true;
        if (i13 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        rg0Var.setClickable(z10);
        rg0 rg0Var2 = this.E;
        if (i13 <= 0) {
            z11 = false;
        }
        rg0Var2.setEnabled(z11);
        this.E.setAlpha(f7);
        rg0 rg0Var3 = this.E;
        if (f7 <= 0.0f) {
            i11 = 8;
        }
        rg0Var3.setVisibility(i11);
    }

    public final void g0(boolean z10) {
        if (this.E == null) {
            return;
        }
        int mainUnreadCount = MessagesStorage.getInstance(this.currentAccount).getMainUnreadCount();
        if (mainUnreadCount > 0) {
            this.J[0].e(LocaleController.formatNumber(mainUnreadCount, ','), false, z10);
            return;
        }
        this.J[0].e(null, false, z10);
    }

    @Override
    public final Animator getCustomSlideTransition(boolean z10, boolean z11, float f7) {
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null) {
            return X.getCustomSlideTransition(z10, z11, f7);
        }
        return null;
    }

    @Override
    public final org.telegram.ui.ActionBar.e4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.e4.f22604c;
    }

    public final void h0(View view) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i10 = 0; i10 < 4; i10++) {
            if (UserConfig.getInstance(i10).isClientActivated()) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        Collections.sort(arrayList, new bv(2));
        org.telegram.ui.Components.k80 H = org.telegram.ui.Components.k80.H(this, view);
        if (UserConfig.getActivatedAccountsCount() < 4) {
            H.c(R.drawable.msg_addbot, LocaleController.getString(R.string.AddAccount), new lg0(this, 4), false);
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
                int i12 = org.telegram.ui.ActionBar.y6.f23448i6;
                Drawable Z = org.telegram.ui.ActionBar.y6.Z(getThemedColor(i12), 0, 0);
                org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
                org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
                linearLayout.setBackground(Z);
                org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N, resourceProvider);
                TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(currentUser);
                org.telegram.ui.Components.gh0 gh0Var = new org.telegram.ui.Components.gh0(this, getParentActivity(), z10);
                linearLayout.addView(gh0Var, org.telegram.ui.Components.gb1.x(34, 34, 16, 12, 0, 0, 0));
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(getParentActivity());
                if (z10) {
                    y9Var.setScaleX(0.833f);
                    y9Var.setScaleY(0.833f);
                }
                y9Var.setRoundRadius(AndroidUtilities.dp(16.0f));
                y9Var.getImageReceiver().setCurrentAccount(intValue);
                y9Var.f(currentUser, j9Var);
                gh0Var.addView(y9Var, org.telegram.ui.Components.gb1.x(32, 32, 17, 1, 1, 1, 1));
                TextView textView = new TextView(getParentActivity());
                textView.setTextSize(1, 16.0f);
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, getResourceProvider());
                textView.setText(UserObject.getUserName(currentUser));
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView, org.telegram.ui.Components.gb1.t(0, -2, 1.0f, 16, 13, 0, 14, 0));
                linearLayout.setOnClickListener(new bi.pa(this, intValue, H, 15));
                H.r(linearLayout, org.telegram.ui.Components.gb1.r(230, 48));
            }
        }
        H.f29870u = true;
        H.v = true;
        H.a0(0.0f, -AndroidUtilities.dp(4.0f));
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(28.0f), getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6));
        c02.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, -16777216));
        H.W(c02);
        H.Z();
        org.telegram.ui.Components.u40.f33245r.a();
    }

    public final cy i0(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putBoolean("hasMainTabs", true);
        cy cyVar = new cy(bundle);
        this.I = cyVar;
        cyVar.J3 = new mg0(this);
        this.f44133a.put(0, new sg1(cyVar));
        return this.I;
    }

    public final void j0(int i10, boolean z10) {
        boolean z11;
        int i11 = 0;
        while (true) {
            qh.b[] bVarArr = this.J;
            if (i11 < bVarArr.length) {
                qh.b bVar = bVarArr[i11];
                if (i11 == i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                bVar.f(z11, z10);
                i11++;
            } else {
                return;
            }
        }
    }

    public final void k0(float f7, boolean z10) {
        for (int i10 = 0; i10 < this.J.length; i10++) {
            float max = Math.max(0.0f, 1.0f - Math.abs(i10 - f7));
            qh.b bVar = this.J[i10];
            bVar.J = max;
            bVar.I = z10;
            bVar.invalidate();
        }
        this.E.invalidate();
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        boolean onBackPressed = super.onBackPressed(z10);
        if (onBackPressed && this.f44135c.getCurrentPosition() != 0) {
            onBackPressed = false;
            if (z10) {
                this.f44135c.E(0);
            }
        }
        return onBackPressed;
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null) {
            X.onBeginSlide();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        this.N = NotificationCenter.getInstance(this.currentAccount).createObserversGroup(this).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadProgressChanged).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.notificationsCountUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.contactsPermissionBadgeCheck).addGlobal(NotificationCenter.appUpdateAvailable).addGlobal(NotificationCenter.appUpdateLoading).addGlobal(NotificationCenter.needSetDayNightTheme);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        setBulletinDelegate(null);
        org.telegram.ui.Components.qc.h(this.f44134b);
        NotificationCenter.ObserversGroup observersGroup = this.N;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.N = null;
        }
        super.onFragmentDestroy();
    }

    @Override
    public final void onPause() {
        super.onPause();
        fi.v3 v3Var = this.O;
        if (v3Var != null) {
            v3Var.e(true);
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        c0();
        d0();
        g0(true);
        if (this.P) {
            return;
        }
        if (this.O == null && org.telegram.ui.Components.u40.f33245r.c()) {
            AndroidUtilities.runOnUIThread(new lg0(this, 2), 1500L);
        }
        this.P = true;
    }

    @Override
    public final void onSlideProgress(boolean z10, float f7) {
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null) {
            X.onSlideProgress(z10, f7);
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            c0();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void prepareFragmentToSlide(boolean z10, boolean z11) {
        org.telegram.ui.ActionBar.r2 X = X();
        if (X != null) {
            X.prepareFragmentToSlide(z10, z11);
        }
    }

    @Override
    public final void z(float f7, int i10) {
    }
}
