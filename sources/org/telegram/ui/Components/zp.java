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
import org.telegram.ui.vc1;
public final class zp extends org.telegram.ui.ActionBar.k3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f35407l0 = 0;
    public final yj0 E;
    public final tp F;
    public final up G;
    public final View H;
    public final s6 I;
    public final s6 J;
    public final TextView K;
    public yp L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public c31 Q;
    public float R;
    public ValueAnimator S;
    public t40 T;
    public boolean U;
    public org.telegram.ui.ActionBar.h4 V;
    public org.telegram.ui.ActionBar.r2 W;
    public ti X;
    public bh.p Y;
    public s6 Z;
    public boolean f35408a0;
    public final ImageView f35409b;
    public zq f35410b0;
    public final org.telegram.ui.ActionBar.j2 f35411c;
    public boolean f35412c0;
    public final TextView d;
    public boolean f35413d0;
    public final TextView e;
    public TL_stories.TL_premium_boostsStatus f35414e0;
    public TLRPC.WallPaper f35415f;
    public float f35416f0;
    public ValueAnimator f35417g0;
    public final xp h;
    public boolean f35418h0;
    public boolean f35419i0;
    public int f35420j0;
    public int f35421k0;
    public final org.telegram.ui.un f35422n;
    public final org.telegram.ui.ActionBar.h4 f35423r;
    public final boolean f35424s;
    public final org.telegram.ui.wn v;
    public final nm0 f35425w;
    public final s4.c0 f35426x;
    public final c10 f35427y;

    public zp(org.telegram.ui.wn wnVar, org.telegram.ui.un unVar) {
        super(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.u6) unVar, true);
        String str;
        boolean z10;
        this.P = -1;
        this.f35412c0 = false;
        this.f35413d0 = false;
        this.f35416f0 = 0.0f;
        this.v = wnVar;
        this.f35422n = unVar;
        this.f35423r = unVar.f44059f;
        this.f35415f = unVar.f44060g;
        this.f35424s = org.telegram.ui.ActionBar.y6.I.q();
        xp xpVar = new xp(this.currentAccount, wnVar.a(), unVar, 0);
        this.h = xpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.y6.f23448i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23448i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        org.telegram.messenger.t.r(textView, org.telegram.ui.ActionBar.y6.f23465j5, this.resourcesProvider, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f35409b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.f35411c = j2Var;
        imageView.setImageDrawable(j2Var);
        imageView.setOnClickListener(new ip(this, 1));
        frameLayout.addView(imageView, kb1.h(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, kb1.h(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        yj0 yj0Var = new yj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.E = yj0Var;
        this.M = !org.telegram.ui.ActionBar.y6.I.q();
        G(org.telegram.ui.ActionBar.y6.I.q(), false);
        yj0Var.J(true);
        yj0Var.h = true;
        this.f35420j0 = themedColor;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        tp tpVar = new tp(this, getContext());
        this.F = tpVar;
        tpVar.setAnimation(yj0Var);
        tpVar.setScaleType(ImageView.ScaleType.CENTER);
        tpVar.setOnClickListener(new ip(this, 2));
        frameLayout.addView(tpVar, kb1.h(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.G = new s4.d0(getContext());
        nm0 nm0Var = new nm0(getContext(), null);
        this.f35425w = nm0Var;
        nm0Var.setAdapter(xpVar);
        nm0Var.setDrawSelection(false);
        nm0Var.setClipChildren(false);
        nm0Var.setClipToPadding(false);
        nm0Var.setHasFixedSize(true);
        nm0Var.setItemAnimator(null);
        nm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.f35426x = c0Var;
        nm0Var.setLayoutManager(c0Var);
        nm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        nm0Var.setOnItemClickListener(new j(this, 3));
        nm0Var.setOnScrollListener(new ml(this, 3));
        c10 c10Var = new c10(getContext(), this.resourcesProvider);
        this.f35427y = c10Var;
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        frameLayout.addView(c10Var, kb1.h(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(nm0Var, kb1.h(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
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
        view.setOnClickListener(new ip(this, 3));
        frameLayout.addView(view, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.K = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f35415f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        s6 s6Var = new s6(getContext(), true, true, true);
        this.I = s6Var;
        s6Var.getDrawable().q(true);
        s6Var.f32492n = false;
        s6Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.y6.Sh;
        org.telegram.ui.ActionBar.f7.Z(s6Var, i13, this.resourcesProvider);
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(s6Var, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        s6 s6Var2 = new s6(getContext(), true, true, true);
        this.J = s6Var2;
        s6Var2.getDrawable().q(true);
        s6Var2.f32492n = false;
        s6Var2.setGravity(17);
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i13, this.resourcesProvider);
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var2.setAlpha(0.0f);
        s6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(s6Var2, kb1.h(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f35415f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new ga(7, this, wnVar));
            frameLayout.addView(textView3, kb1.h(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (wnVar.i() != null) {
                str = UserObject.getFirstName(wnVar.i());
            } else {
                TLRPC.Chat chat = wnVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, kb1.h(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        K();
        L(false);
    }

    public static void I(c31 c31Var) {
        if (c31Var == null) {
            return;
        }
        float width = c31Var.getWidth() / 2.0f;
        float max = Math.max(width, c31Var.getWidth() - width);
        float max2 = Math.max(0.0f, c31Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c31Var, c31.f27045w, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ut.e);
        ofFloat.addListener(new org.telegram.ui.sp(c31Var, 18));
        ofFloat.start();
    }

    public static void m(zp zpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (zpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.wn wnVar = zpVar.v;
        tg.j0 j0Var = new tg.j0(22, zpVar.currentAccount, zpVar.getContext(), wnVar, zpVar.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(zpVar.f35414e0, true);
        j0Var.L1(zpVar.v.a());
        j0Var.Q0 = new hp(zpVar, 2);
        j0Var.show();
    }

    public static void n(zp zpVar, org.telegram.ui.wn wnVar) {
        if (zpVar.f35415f != null) {
            zpVar.f35415f = null;
            zpVar.dismiss();
            ChatThemeController.getInstance(zpVar.currentAccount).clearWallpaper(wnVar.a(), true);
            return;
        }
        zpVar.dismiss();
    }

    public static void o(zp zpVar, View view, int i10) {
        np0 np0Var;
        nm0 nm0Var = zpVar.f35425w;
        xp xpVar = zpVar.h;
        if (xpVar.d.get(i10) != zpVar.L && zpVar.Q == null) {
            zpVar.L = (yp) xpVar.d.get(i10);
            zpVar.D();
            xpVar.E(i10);
            zpVar.containerView.postDelayed(new hf(zpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < nm0Var.getChildCount(); i11++) {
                e31 e31Var = (e31) nm0Var.getChildAt(i11);
                if (e31Var != view && (np0Var = e31Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(np0Var);
                    e31Var.J.run();
                }
            }
            if (!((yp) xpVar.d.get(i10)).f35124a.f22683a) {
                ((e31) view).d();
            }
            zpVar.L(true);
        }
    }

    public static void q(zp zpVar, vc1 vc1Var) {
        ?? obj = new Object();
        obj.f22929a = true;
        org.telegram.ui.wn wnVar = zpVar.v;
        vc1Var.f44246a.f43971a = wnVar.getResourceProvider();
        vc1Var.f44292q1 = new sp(zpVar);
        obj.f22931c = new k5(10);
        obj.d = new hp(zpVar, 5);
        obj.f22930b = new hp(zpVar, 6);
        obj.e = true;
        zpVar.W = vc1Var;
        wnVar.showAsSheet(vc1Var, obj);
    }

    public static void r(zp zpVar) {
        org.telegram.ui.wn wnVar = zpVar.v;
        ti tiVar = new ti(wnVar.getParentActivity(), wnVar, false, false, false, wnVar.getResourceProvider());
        zpVar.X = tiVar;
        tiVar.drawNavigationBar = true;
        tiVar.T1(LocaleController.getString(R.string.ChooseBackground));
        ti tiVar2 = zpVar.X;
        tiVar2.f32982c2 = new rp(zpVar);
        tiVar2.R1(1, false);
        zpVar.X.w1();
        zpVar.X.f33002j0.g0();
        zpVar.X.show();
        zpVar.Y = new bh.p(zpVar, zpVar.getContext());
        s6 s6Var = new s6(zpVar.getContext(), true, true, true);
        zpVar.Z = s6Var;
        s6Var.setTextSize(AndroidUtilities.dp(14.0f));
        zpVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
        zpVar.Z.setGravity(17);
        s6 s6Var2 = zpVar.Z;
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.Z(s6Var2, i10, zpVar.resourcesProvider);
        zpVar.Y.addView(zpVar.Z, kb1.i(-1, -2, 17));
        bh.p pVar = zpVar.Y;
        int dp = AndroidUtilities.dp(0.0f);
        int i11 = org.telegram.ui.ActionBar.y6.f23357d6;
        int themedColor = zpVar.getThemedColor(i11);
        int o10 = i0.a.o(zpVar.getThemedColor(i10), 76);
        org.telegram.ui.ActionBar.f7.R(pVar, org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, themedColor, o10, o10), org.telegram.ui.ActionBar.f7.N(i11), org.telegram.ui.ActionBar.f7.h(i10, 76), zpVar.resourcesProvider);
        zpVar.Y.setOnClickListener(new ip(zpVar, 0));
        zpVar.X.f33037u1.addView(zpVar.Y, kb1.i(-1, -2, 80));
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
            bVar = h4Var.f22685c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = hg.b.d("❌");
        }
        org.telegram.ui.ActionBar.h4 h4Var2 = this.L.f35124a;
        if (h4Var2 != null) {
            bVar2 = h4Var2.f22685c;
        }
        if (bVar2 == null) {
            bVar2 = hg.b.d("❌");
        }
        return !hg.b.a(bVar, bVar2);
    }

    public final void B() {
        if (!this.f35408a0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f35408a0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new vp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new wp(this, chatThemeController));
            }
        }
    }

    public final void C(List list) {
        hg.b bVar;
        if (list != null && !list.isEmpty()) {
            yp ypVar = new yp((org.telegram.ui.ActionBar.h4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.U) {
                org.telegram.ui.ActionBar.h4 h4Var = this.f35422n.f44059f;
                this.V = h4Var;
                if (h4Var != null) {
                    h4Var.k();
                }
            }
            arrayList.add(0, ypVar);
            if (!this.U) {
                this.L = ypVar;
            }
            org.telegram.ui.ActionBar.h4 h4Var2 = this.V;
            if (h4Var2 != null) {
                bVar = h4Var2.f22685c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.h4 h4Var3 = (org.telegram.ui.ActionBar.h4) list.get(i10);
                yp ypVar2 = new yp(h4Var3);
                h4Var3.m(this.currentAccount);
                ypVar2.f35126c = this.M ? 1 : 0;
                if (hg.b.a(h4Var3.f22685c, bVar)) {
                    arrayList.add(1, ypVar2);
                    z10 = true;
                } else {
                    arrayList.add(ypVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.h4 h4Var4 = this.V;
            if (h4Var4 != null && !z10) {
                yp ypVar3 = new yp(h4Var4);
                h4Var4.m(this.currentAccount);
                ypVar3.f35126c = this.M ? 1 : 0;
                arrayList.add(1, ypVar3);
            }
            xp xpVar = this.h;
            xpVar.d = arrayList;
            xpVar.l();
            this.F.setVisibility(0);
            if (!this.U) {
                F(false);
                this.f35425w.animate().alpha(1.0f).setDuration(150L).start();
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
                wallPaper = this.f35415f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = this.L.f35124a;
            if (h4Var.f22683a) {
                this.f35422n.q(null, wallPaper2, true, Boolean.valueOf(this.M), false);
                return;
            }
            this.f35422n.q(h4Var, wallPaper2, true, Boolean.valueOf(this.M), false);
        }
    }

    public final void F(boolean z10) {
        xp xpVar = this.h;
        ArrayList arrayList = xpVar.d;
        org.telegram.ui.ActionBar.h4 h4Var = this.V;
        s4.c0 c0Var = this.f35426x;
        nm0 nm0Var = this.f35425w;
        if (h4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (hg.b.a(((yp) arrayList.get(i10)).f35124a.f22685c, this.V.f22685c)) {
                        this.L = (yp) arrayList.get(i10);
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
                xpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, xpVar.d.size() - 1);
                if (z10) {
                    nm0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.L = (yp) arrayList.get(0);
            xpVar.E(0);
            if (z10) {
                nm0Var.y0(0);
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
            tp tpVar = this.F;
            yj0 yj0Var = this.E;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = yj0Var.e[0];
                }
                yj0Var.P(i11);
                if (tpVar != null) {
                    tpVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = yj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            yj0Var.N(i10, false, true);
            yj0Var.P(i10);
            if (tpVar != null) {
                tpVar.invalidate();
            }
        }
    }

    public final void H(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.H(boolean):void");
    }

    public final void J(org.telegram.ui.ActionBar.x6 x6Var) {
        if (x6Var != null && x6Var != org.telegram.ui.ActionBar.y6.I) {
            this.f35418h0 = true;
            try {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, x6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f35418h0 = false;
            }
        }
    }

    public final void K() {
        TextView textView = this.e;
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23580p5, this.resourcesProvider);
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
            int i11 = org.telegram.ui.ActionBar.y6.f23582p7;
            org.telegram.ui.ActionBar.f7.V(textView2, i11, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i11), 76);
            org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.y6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
            org.telegram.ui.ActionBar.b7 h10 = org.telegram.ui.ActionBar.f7.h(i11, 76);
            org.telegram.ui.ActionBar.u6 u6Var2 = this.resourcesProvider;
            textView2.setBackground(j03);
            org.telegram.ui.ActionBar.f7.k(textView2, j03, null, h10, u6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1);
        org.telegram.ui.ActionBar.b7 h11 = org.telegram.ui.ActionBar.f7.h(i12, 30);
        org.telegram.ui.ActionBar.u6 u6Var3 = this.resourcesProvider;
        ImageView imageView = this.f35409b;
        org.telegram.ui.ActionBar.f7.R(imageView, g02, null, h11, u6Var3);
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.j2 j2Var = this.f35411c;
        j2Var.a(themedColor);
        j2Var.b(getThemedColor(i12));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.R(this.F, org.telegram.ui.ActionBar.y6.g0(i0.a.o(getThemedColor(i13), 30), 1, -1), null, org.telegram.ui.ActionBar.f7.h(i13, 30), this.resourcesProvider);
        int i14 = org.telegram.ui.ActionBar.y6.f23520m5;
        org.telegram.ui.ActionBar.u6 u6Var4 = this.resourcesProvider;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.f7.V(textView3, i14, u6Var4);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i13), 76);
        org.telegram.ui.ActionBar.f7.R(textView3, org.telegram.ui.ActionBar.y6.j0(dp3, dp3, dp3, dp3, 0, o12, o12), null, org.telegram.ui.ActionBar.f7.h(i13, 76), this.resourcesProvider);
    }

    public final void L(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.L(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i5));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new hp(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        c31 c31Var;
        org.telegram.ui.ActionBar.x6 t10;
        boolean z10;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        boolean z11 = this.N;
        boolean z12 = this.f35424s;
        if (!z11 && this.M != z12) {
            c31Var = v();
        } else {
            c31Var = null;
        }
        if (!this.N) {
            org.telegram.ui.un unVar = this.f35422n;
            TLRPC.WallPaper wallPaper = unVar.f44060g;
            if (wallPaper == null) {
                wallPaper = this.f35415f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (c31Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            unVar.q(this.f35423r, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.M != z12) {
            if (org.telegram.ui.ActionBar.y6.I.q() == z12) {
                t10 = org.telegram.ui.ActionBar.y6.I;
            } else {
                t10 = t(z12);
            }
            if (this.f35419i0) {
                J(t10);
            } else {
                org.telegram.ui.ActionBar.y6.t(t10, false, z12);
            }
        }
        this.f35419i0 = false;
        I(c31Var);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        lp lpVar = new lp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f45306u7) {
            org.telegram.ui.ActionBar.r2 r2Var = this.W;
            if (r2Var instanceof vc1) {
                arrayList.addAll(((vc1) r2Var).T0());
                return arrayList;
            }
        }
        ti tiVar = this.X;
        if (tiVar != null) {
            arrayList.addAll(tiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, lpVar, org.telegram.ui.ActionBar.y6.f23428h5));
        int i11 = org.telegram.ui.ActionBar.y6.Oh;
        View view = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.h7) obj).f22701n = this.f35422n;
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
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.emojiLoaded);
        this.N = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            C(chatThemeController.getEmojiThemes(7));
        } else {
            B();
        }
        org.telegram.ui.wn wnVar = this.v;
        if (wnVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !wnVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            t40 t40Var = new t40(9, getContext(), wnVar.getResourceProvider(), false);
            this.T = t40Var;
            t40Var.setVisibility(4);
            this.T.setShowingDuration(5000L);
            this.T.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.M) {
                this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new hp(this, 7), 1500L);
            this.container.addView(this.T, kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        x();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.navBarColorKey == -1 && this.navBarColor != (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.f23448i5))) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.u(boolean):void");
    }

    public final org.telegram.ui.Components.c31 v() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.v():org.telegram.ui.Components.c31");
    }

    public final void w() {
        if (A()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.b2(this) {
                public final zp f29999b;

                {
                    this.f29999b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29999b.u(false);
                            return;
                        default:
                            this.f29999b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.b2(this) {
                public final zp f29999b;

                {
                    this.f29999b = this;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29999b.u(false);
                            return;
                        default:
                            this.f29999b.dismiss();
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
            yj0 yj0Var = this.E;
            if (yj0Var != null && themedColor != this.f35420j0) {
                this.f35420j0 = themedColor;
                yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.j2 j2Var = this.f35411c;
            if (j2Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.f23465j5;
                j2Var.a(getThemedColor(i10));
                j2Var.b(getThemedColor(i10));
                ImageView imageView = this.f35409b;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.f23428h5);
            if (themedColor2 != this.f35421k0) {
                this.f35421k0 = themedColor2;
                setBackgroundColor(themedColor2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void y() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.N) {
            org.telegram.ui.ActionBar.y6.f23311b = false;
            if (A()) {
                wallPaper = null;
            } else {
                wallPaper = this.f35422n.f44060g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.h4 h4Var = this.L.f35124a;
            if (h4Var.f22683a) {
                this.f35422n.q(null, wallPaper2, false, Boolean.valueOf(this.M), true);
            } else {
                this.f35422n.q(h4Var, wallPaper2, false, Boolean.valueOf(this.M), true);
            }
            ti tiVar = this.X;
            if (tiVar != null) {
                ij ijVar = tiVar.f33026r0;
                if (ijVar != null) {
                    boolean z10 = this.M;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.A0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                }
                this.X.h1();
            }
            xp xpVar = this.h;
            if (xpVar != null && xpVar.d != null) {
                for (int i10 = 0; i10 < xpVar.d.size(); i10++) {
                    ((yp) xpVar.d.get(i10)).f35126c = this.M ? 1 : 0;
                }
                xpVar.l();
            }
        }
    }
}
