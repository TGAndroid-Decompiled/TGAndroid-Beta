package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.tc1;
public final class yp extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f35088l0 = 0;
    public final xj0 E;
    public final sp F;
    public final tp G;
    public final View H;
    public final s6 I;
    public final s6 J;
    public final TextView K;
    public xp L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public b31 Q;
    public float R;
    public ValueAnimator S;
    public t40 T;
    public boolean U;
    public org.telegram.ui.ActionBar.h4 V;
    public org.telegram.ui.ActionBar.r2 W;
    public ti X;
    public bh.p Y;
    public s6 Z;
    public boolean f35089a0;
    public final ImageView f35090b;
    public zq f35091b0;
    public final org.telegram.ui.ActionBar.j2 f35092c;
    public boolean f35093c0;
    public final TextView d;
    public boolean f35094d0;
    public final TextView e;
    public TL_stories.TL_premium_boostsStatus f35095e0;
    public TLRPC.WallPaper f35096f;
    public float f35097f0;
    public ValueAnimator f35098g0;
    public final wp h;
    public boolean f35099h0;
    public boolean f35100i0;
    public int f35101j0;
    public int f35102k0;
    public final org.telegram.ui.sn f35103n;
    public final org.telegram.ui.ActionBar.h4 f35104r;
    public final boolean f35105s;
    public final org.telegram.ui.un v;
    public final mm0 f35106w;
    public final s4.c0 f35107x;
    public final c10 f35108y;

    public yp(org.telegram.ui.un unVar, org.telegram.ui.sn snVar) {
        super(1, (Context) unVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) snVar, true);
        String str;
        boolean z10;
        this.P = -1;
        this.f35093c0 = false;
        this.f35094d0 = false;
        this.f35097f0 = 0.0f;
        this.v = unVar;
        this.f35103n = snVar;
        this.f35104r = snVar.f43542f;
        this.f35096f = snVar.f43543g;
        this.f35105s = org.telegram.ui.ActionBar.y6.I.q();
        wp wpVar = new wp(this.currentAccount, unVar.a(), snVar, 0);
        this.h = wpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.y6.f23445i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23445i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23462j5, this.resourcesProvider, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f35090b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.f35092c = j2Var;
        imageView.setImageDrawable(j2Var);
        imageView.setOnClickListener(new hp(this, 1));
        frameLayout.addView(imageView, gb1.h(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, gb1.h(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        xj0 xj0Var = new xj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.E = xj0Var;
        this.M = !org.telegram.ui.ActionBar.y6.I.q();
        G(org.telegram.ui.ActionBar.y6.I.q(), false);
        xj0Var.J(true);
        xj0Var.h = true;
        this.f35101j0 = themedColor;
        xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        sp spVar = new sp(this, getContext());
        this.F = spVar;
        spVar.setAnimation(xj0Var);
        spVar.setScaleType(ImageView.ScaleType.CENTER);
        spVar.setOnClickListener(new hp(this, 2));
        frameLayout.addView(spVar, gb1.h(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.G = new s4.d0(getContext());
        mm0 mm0Var = new mm0(getContext(), null);
        this.f35106w = mm0Var;
        mm0Var.setAdapter(wpVar);
        mm0Var.setDrawSelection(false);
        mm0Var.setClipChildren(false);
        mm0Var.setClipToPadding(false);
        mm0Var.setHasFixedSize(true);
        mm0Var.setItemAnimator(null);
        mm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.f35107x = c0Var;
        mm0Var.setLayoutManager(c0Var);
        mm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        mm0Var.setOnItemClickListener(new j(this, 3));
        mm0Var.setOnScrollListener(new ml(this, 3));
        c10 c10Var = new c10(getContext(), this.resourcesProvider);
        this.f35108y = c10Var;
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        frameLayout.addView(c10Var, gb1.h(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(mm0Var, gb1.h(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.H = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.y6.Qh;
        int themedColor3 = getThemedColor(i12);
        Drawable j02 = org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        view.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(view, j02, N, N2, u6Var);
        view.setOnClickListener(new hp(this, 3));
        frameLayout.addView(view, gb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.K = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f35096f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, gb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        s6 s6Var = new s6(getContext(), true, true, true);
        this.I = s6Var;
        s6Var.getDrawable().q(true);
        s6Var.f32442n = false;
        s6Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i13, this.resourcesProvider);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(s6Var, gb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        s6 s6Var2 = new s6(getContext(), true, true, true);
        this.J = s6Var2;
        s6Var2.getDrawable().q(true);
        s6Var2.f32442n = false;
        s6Var2.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, this.resourcesProvider);
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var2.setAlpha(0.0f);
        s6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(s6Var2, gb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f35096f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new ga(7, this, unVar));
            frameLayout.addView(textView3, gb1.h(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (unVar.i() != null) {
                str = UserObject.getFirstName(unVar.i());
            } else {
                TLRPC.Chat chat = unVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, gb1.h(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        K();
        L(false);
    }

    public static void I(b31 b31Var) {
        if (b31Var == null) {
            return;
        }
        float width = b31Var.getWidth() / 2.0f;
        float max = Math.max(width, b31Var.getWidth() - width);
        float max2 = Math.max(0.0f, b31Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(b31Var, b31.f26738w, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ut.e);
        ofFloat.addListener(new org.telegram.ui.qp(b31Var, 18));
        ofFloat.start();
    }

    public static void m(yp ypVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (ypVar.getContext() == null) {
            return;
        }
        org.telegram.ui.un unVar = ypVar.v;
        tg.j0 j0Var = new tg.j0(22, ypVar.currentAccount, ypVar.getContext(), unVar, ypVar.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(ypVar.f35095e0, true);
        j0Var.L1(ypVar.v.a());
        j0Var.Q0 = new gp(ypVar, 2);
        j0Var.show();
    }

    public static void n(yp ypVar, org.telegram.ui.un unVar) {
        if (ypVar.f35096f != null) {
            ypVar.f35096f = null;
            ypVar.dismiss();
            ChatThemeController.getInstance(ypVar.currentAccount).clearWallpaper(unVar.a(), true);
            return;
        }
        ypVar.dismiss();
    }

    public static void o(yp ypVar, View view, int i10) {
        mp0 mp0Var;
        mm0 mm0Var = ypVar.f35106w;
        wp wpVar = ypVar.h;
        if (wpVar.d.get(i10) != ypVar.L && ypVar.Q == null) {
            ypVar.L = (xp) wpVar.d.get(i10);
            ypVar.D();
            wpVar.E(i10);
            ypVar.containerView.postDelayed(new hf(ypVar, i10, 1), 100L);
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                d31 d31Var = (d31) mm0Var.getChildAt(i11);
                if (d31Var != view && (mp0Var = d31Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(mp0Var);
                    d31Var.J.run();
                }
            }
            if (!((xp) wpVar.d.get(i10)).f34790a.f22680a) {
                ((d31) view).d();
            }
            ypVar.L(true);
        }
    }

    public static void q(yp ypVar, tc1 tc1Var) {
        ?? obj = new Object();
        obj.f22926a = true;
        org.telegram.ui.un unVar = ypVar.v;
        tc1Var.f43733a.f43452a = unVar.getResourceProvider();
        tc1Var.f43779q1 = new rp(ypVar);
        obj.f22928c = new k5(10);
        obj.d = new gp(ypVar, 5);
        obj.f22927b = new gp(ypVar, 6);
        obj.e = true;
        ypVar.W = tc1Var;
        unVar.showAsSheet(tc1Var, obj);
    }

    public static void r(yp ypVar) {
        org.telegram.ui.un unVar = ypVar.v;
        ti tiVar = new ti(unVar.getParentActivity(), unVar, false, false, false, unVar.getResourceProvider());
        ypVar.X = tiVar;
        tiVar.drawNavigationBar = true;
        tiVar.S1(LocaleController.getString(R.string.ChooseBackground));
        ti tiVar2 = ypVar.X;
        tiVar2.f33010c2 = new qp(ypVar);
        tiVar2.Q1(1, false);
        ypVar.X.v1();
        ypVar.X.f33030j0.f0();
        ypVar.X.show();
        ypVar.Y = new bh.p(ypVar, ypVar.getContext());
        s6 s6Var = new s6(ypVar.getContext(), true, true, true);
        ypVar.Z = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        ypVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
        ypVar.Z.setGravity(17);
        s6 s6Var2 = ypVar.Z;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i10, ypVar.resourcesProvider);
        ypVar.Y.addView(ypVar.Z, gb1.i(-1, -2, 17));
        bh.p pVar = ypVar.Y;
        int dp = AndroidUtilities.dp(0.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23354d6;
        int themedColor = ypVar.getThemedColor(i11);
        int o10 = i0.a.o(ypVar.getThemedColor(i10), 76);
        org.telegram.ui.ActionBar.f7.R(pVar, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor, o10, o10), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.h(i10, 76), ypVar.resourcesProvider);
        ypVar.Y.setOnClickListener(new hp(ypVar, 0));
        ypVar.X.f33065u1.addView(ypVar.Y, gb1.i(-1, -2, 80));
    }

    public static org.telegram.ui.ActionBar.x6 t(boolean z10) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string) != null && !org.telegram.ui.ActionBar.y6.P0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.y6.P0(string2) != null && org.telegram.ui.ActionBar.y6.P0(string2).q()) {
            str2 = string2;
        }
        if (z10) {
            return org.telegram.ui.ActionBar.y6.P0(str2);
        }
        return org.telegram.ui.ActionBar.y6.P0(str);
    }

    public final boolean A() {
        hg.b bVar;
        if (this.L == null) {
            return false;
        }
        org.telegram.ui.ActionBar.h4 h4Var = this.V;
        hg.b bVar2 = null;
        if (h4Var != null) {
            bVar = h4Var.f22682c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = hg.b.d("❌");
        }
        org.telegram.ui.ActionBar.h4 h4Var2 = this.L.f34790a;
        if (h4Var2 != null) {
            bVar2 = h4Var2.f22682c;
        }
        if (bVar2 == null) {
            bVar2 = hg.b.d("❌");
        }
        return !hg.b.a(bVar, bVar2);
    }

    public final void B() {
        if (!this.f35089a0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f35089a0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new up(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new vp(this, chatThemeController));
            }
        }
    }

    public final void C(List list) {
        hg.b bVar;
        if (list != null && !list.isEmpty()) {
            xp xpVar = new xp((org.telegram.ui.ActionBar.h4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.U) {
                org.telegram.ui.ActionBar.h4 h4Var = this.f35103n.f43542f;
                this.V = h4Var;
                if (h4Var != null) {
                    h4Var.k();
                }
            }
            arrayList.add(0, xpVar);
            if (!this.U) {
                this.L = xpVar;
            }
            org.telegram.ui.ActionBar.h4 h4Var2 = this.V;
            if (h4Var2 != null) {
                bVar = h4Var2.f22682c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.h4 h4Var3 = (org.telegram.ui.ActionBar.h4) list.get(i10);
                xp xpVar2 = new xp(h4Var3);
                h4Var3.m(this.currentAccount);
                xpVar2.f34792c = this.M ? 1 : 0;
                if (hg.b.a(h4Var3.f22682c, bVar)) {
                    arrayList.add(1, xpVar2);
                    z10 = true;
                } else {
                    arrayList.add(xpVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.h4 h4Var4 = this.V;
            if (h4Var4 != null && !z10) {
                xp xpVar3 = new xp(h4Var4);
                h4Var4.m(this.currentAccount);
                xpVar3.f34792c = this.M ? 1 : 0;
                arrayList.add(1, xpVar3);
            }
            wp wpVar = this.h;
            wpVar.d = arrayList;
            wpVar.l();
            this.F.setVisibility(0);
            if (!this.U) {
                F(false);
                this.f35106w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.U = true;
            L(true);
        }
    }

    public final void D() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.N) {
            this.O = false;
            this.v.getClass();
            if (A()) {
                wallPaper = null;
            } else {
                wallPaper = this.f35096f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = this.L.f34790a;
            if (h4Var.f22680a) {
                this.f35103n.q(null, wallPaper2, true, Boolean.valueOf(this.M), false);
                return;
            }
            this.f35103n.q(h4Var, wallPaper2, true, Boolean.valueOf(this.M), false);
        }
    }

    public final void F(boolean z10) {
        wp wpVar = this.h;
        ArrayList arrayList = wpVar.d;
        org.telegram.ui.ActionBar.h4 h4Var = this.V;
        s4.c0 c0Var = this.f35107x;
        mm0 mm0Var = this.f35106w;
        if (h4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (hg.b.a(((xp) arrayList.get(i10)).f34790a.f22682c, this.V.f22682c)) {
                        this.L = (xp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                this.P = i10;
                wpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, wpVar.d.size() - 1);
                if (z10) {
                    mm0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.L = (xp) arrayList.get(0);
            wpVar.E(0);
            if (z10) {
                mm0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        D();
    }

    public final void G(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            sp spVar = this.F;
            xj0 xj0Var = this.E;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = xj0Var.e[0];
                }
                xj0Var.P(i11);
                if (spVar != null) {
                    spVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = xj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            xj0Var.N(i10, false, true);
            xj0Var.P(i10);
            if (spVar != null) {
                spVar.invalidate();
            }
        }
    }

    public final void H(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yp.H(boolean):void");
    }

    public final void J(org.telegram.ui.ActionBar.x6 x6Var) {
        if (x6Var != null && x6Var != org.telegram.ui.ActionBar.y6.I) {
            this.f35099h0 = true;
            try {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, x6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f35099h0 = false;
            }
        }
    }

    public final void K() {
        TextView textView = this.e;
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23577p5, this.resourcesProvider);
            int dp = AndroidUtilities.dp(6.0f);
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            int o10 = i0.a.o(getThemedColor(i10), 76);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10);
            org.telegram.ui.ActionBar.b7 h = org.telegram.ui.ActionBar.f7.h(i10, 76);
            org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
            textView.setBackground(j02);
            org.telegram.ui.ActionBar.f7.k(textView, j02, null, h, u6Var);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i11 = org.telegram.ui.ActionBar.y6.f23579p7;
            org.telegram.ui.ActionBar.f7.V(textView2, i11, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i11), 76);
            org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
            org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i11, 76);
            org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
            textView2.setBackground(j03);
            org.telegram.ui.ActionBar.f7.k(textView2, j03, null, h10, u6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1);
        org.telegram.ui.ActionBar.b7 h11 = org.telegram.ui.ActionBar.f7.h(i12, 30);
        org.telegram.ui.ActionBar.u6 u6Var3 = this.resourcesProvider;
        ImageView imageView = this.f35090b;
        org.telegram.ui.ActionBar.f7.R(imageView, g02, null, h11, u6Var3);
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.j2 j2Var = this.f35092c;
        j2Var.a(themedColor);
        j2Var.b(getThemedColor(i12));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.R(this.F, org.telegram.ui.ActionBar.y6.g0(i0.a.o(getThemedColor(i13), 30), 1, -1), null, org.telegram.ui.ActionBar.f7.h(i13, 30), this.resourcesProvider);
        int i14 = org.telegram.ui.ActionBar.y6.f23517m5;
        org.telegram.ui.ActionBar.u6 u6Var4 = this.resourcesProvider;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.f7.V(textView3, i14, u6Var4);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i13), 76);
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o12, o12), null, org.telegram.ui.ActionBar.f7.h(i13, 76), this.resourcesProvider);
    }

    public final void L(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yp.L(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23445i5));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new gp(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        b31 b31Var;
        org.telegram.ui.ActionBar.x6 t10;
        boolean z10;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        boolean z11 = this.N;
        boolean z12 = this.f35105s;
        if (!z11 && this.M != z12) {
            b31Var = v();
        } else {
            b31Var = null;
        }
        if (!this.N) {
            org.telegram.ui.sn snVar = this.f35103n;
            TLRPC.WallPaper wallPaper = snVar.f43543g;
            if (wallPaper == null) {
                wallPaper = this.f35096f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (b31Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            snVar.q(this.f35104r, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.M != z12) {
            if (org.telegram.ui.ActionBar.y6.I.q() == z12) {
                t10 = org.telegram.ui.ActionBar.y6.I;
            } else {
                t10 = t(z12);
            }
            if (this.f35100i0) {
                J(t10);
            } else {
                org.telegram.ui.ActionBar.y6.t(t10, false, z12);
            }
        }
        this.f35100i0 = false;
        I(b31Var);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        kp kpVar = new kp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f44383q7) {
            org.telegram.ui.ActionBar.r2 r2Var = this.W;
            if (r2Var instanceof tc1) {
                arrayList.addAll(((tc1) r2Var).T0());
                return arrayList;
            }
        }
        ti tiVar = this.X;
        if (tiVar != null) {
            arrayList.addAll(tiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, kpVar, org.telegram.ui.ActionBar.y6.f23425h5));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        View view = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.h7) obj).f22698n = this.f35103n;
        }
        return arrayList;
    }

    @Override
    public final void onBackPressed() {
        w();
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && A()) {
            int x9 = (int) motionEvent.getX();
            if (((int) motionEvent.getY()) < this.containerView.getTop() || x9 < this.containerView.getLeft() || x9 > this.containerView.getRight()) {
                this.v.getFragmentView().dispatchTouchEvent(motionEvent);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        t40 t40Var = this.T;
        if (t40Var != null) {
            t40Var.b(true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        this.N = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            C(chatThemeController.getEmojiThemes(7));
        } else {
            B();
        }
        org.telegram.ui.un unVar = this.v;
        if (unVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !unVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            t40 t40Var = new t40(9, getContext(), unVar.getResourceProvider(), false);
            this.T = t40Var;
            t40Var.setVisibility(4);
            this.T.setShowingDuration(5000L);
            this.T.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.M) {
                this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new gp(this, 7), 1500L);
            this.container.addView(this.T, gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        x();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.navBarColorKey == -1 && this.navBarColor != (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23445i5))) {
                this.navBarColor = themedColor;
                boolean z10 = false;
                AndroidUtilities.setNavigationBarColor((Dialog) this, themedColor, false);
                if (AndroidUtilities.computePerceivedBrightness(themedColor) > 0.721d) {
                    z10 = true;
                }
                AndroidUtilities.setLightNavigationBar(this, z10);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void u(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yp.u(boolean):void");
    }

    public final org.telegram.ui.Components.b31 v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yp.v():org.telegram.ui.Components.b31");
    }

    public final void w() {
        if (A()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.b2(this) {
                public final yp f29686b;

                {
                    this.f29686b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29686b.u(false);
                            return;
                        default:
                            this.f29686b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.b2(this) {
                public final yp f29686b;

                {
                    this.f29686b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29686b.u(false);
                            return;
                        default:
                            this.f29686b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
            return;
        }
        dismiss();
    }

    public final void x() {
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.Oh);
            xj0 xj0Var = this.E;
            if (xj0Var != null && themedColor != this.f35101j0) {
                this.f35101j0 = themedColor;
                xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.f35092c;
            if (j2Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.f23462j5;
                j2Var.a(getThemedColor(i10));
                j2Var.b(getThemedColor(i10));
                ImageView imageView = this.f35090b;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5);
            if (themedColor2 != this.f35102k0) {
                this.f35102k0 = themedColor2;
                setBackgroundColor(themedColor2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void y() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.N) {
            org.telegram.ui.ActionBar.y6.f23308b = false;
            if (A()) {
                wallPaper = null;
            } else {
                wallPaper = this.f35103n.f43543g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = this.L.f34790a;
            if (h4Var.f22680a) {
                this.f35103n.q(null, wallPaper2, false, Boolean.valueOf(this.M), true);
            } else {
                this.f35103n.q(h4Var, wallPaper2, false, Boolean.valueOf(this.M), true);
            }
            ti tiVar = this.X;
            if (tiVar != null) {
                ij ijVar = tiVar.f33054r0;
                if (ijVar != null) {
                    boolean z10 = this.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                }
                this.X.h1();
            }
            wp wpVar = this.h;
            if (wpVar != null && wpVar.d != null) {
                for (int i10 = 0; i10 < wpVar.d.size(); i10++) {
                    ((xp) wpVar.d.get(i10)).f34792c = this.M ? 1 : 0;
                }
                wpVar.l();
            }
        }
    }
}
