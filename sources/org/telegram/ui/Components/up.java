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
import org.telegram.ui.pc1;
public final class up extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f31173l0 = 0;
    public final xj0 E;
    public final op F;
    public final pp G;
    public final View H;
    public final o6 I;
    public final o6 J;
    public final TextView K;
    public tp L;
    public boolean M;
    public boolean N;
    public boolean O;
    public int P;
    public s21 Q;
    public float R;
    public ValueAnimator S;
    public p40 T;
    public boolean U;
    public org.telegram.ui.ActionBar.f4 V;
    public org.telegram.ui.ActionBar.o2 W;
    public ri X;
    public ah.v Y;
    public o6 Z;
    public boolean f31174a0;
    public final ImageView f31175b;
    public vq f31176b0;
    public final org.telegram.ui.ActionBar.h2 f31177c;
    public boolean f31178c0;
    public final TextView d;
    public boolean f31179d0;
    public final TextView e;
    public TL_stories.TL_premium_boostsStatus f31180e0;
    public TLRPC.WallPaper f31181f;
    public float f31182f0;
    public ValueAnimator f31183g0;
    public final sp h;
    public boolean f31184h0;
    public boolean f31185i0;
    public int f31186j0;
    public int f31187k0;
    public final org.telegram.ui.qn f31188n;
    public final org.telegram.ui.ActionBar.f4 f31189r;
    public final boolean f31190s;
    public final org.telegram.ui.sn v;
    public final lm0 f31191w;
    public final s4.b0 f31192x;
    public final z00 f31193y;

    public up(org.telegram.ui.sn snVar, org.telegram.ui.qn qnVar) {
        super(1, (Context) snVar.getParentActivity(), (org.telegram.ui.ActionBar.g6) qnVar, true);
        String str;
        boolean z10;
        this.P = -1;
        this.f31178c0 = false;
        this.f31179d0 = false;
        this.f31182f0 = 0.0f;
        this.v = snVar;
        this.f31188n = qnVar;
        this.f31189r = qnVar.f40882f;
        this.f31181f = qnVar.f40883g;
        this.f31190s = org.telegram.ui.ActionBar.k6.I.q();
        sp spVar = new sp(this.currentAccount, snVar.a(), qnVar, 0);
        this.h = spVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.k6.f21272i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21272i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        org.telegram.messenger.v0.q(textView, org.telegram.ui.ActionBar.k6.f21290j5, this.resourcesProvider, 1, 20.0f);
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f31175b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f31177c = h2Var;
        imageView.setImageDrawable(h2Var);
        imageView.setOnClickListener(new dp(this, 1));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        xj0 xj0Var = new xj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.E = xj0Var;
        this.M = !org.telegram.ui.ActionBar.k6.I.q();
        F(org.telegram.ui.ActionBar.k6.I.q(), false);
        xj0Var.J(true);
        xj0Var.h = true;
        this.f31186j0 = themedColor;
        xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        op opVar = new op(this, getContext());
        this.F = opVar;
        opVar.setAnimation(xj0Var);
        opVar.setScaleType(ImageView.ScaleType.CENTER);
        opVar.setOnClickListener(new dp(this, 2));
        frameLayout.addView(opVar, w7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.G = new s4.c0(getContext());
        lm0 lm0Var = new lm0(getContext(), null);
        this.f31191w = lm0Var;
        lm0Var.setAdapter(spVar);
        lm0Var.setDrawSelection(false);
        lm0Var.setClipChildren(false);
        lm0Var.setClipToPadding(false);
        lm0Var.setHasFixedSize(true);
        lm0Var.setItemAnimator(null);
        lm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.b0 b0Var = new s4.b0(0, false);
        this.f31192x = b0Var;
        lm0Var.setLayoutManager(b0Var);
        lm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        lm0Var.setOnItemClickListener(new j(this, 3));
        lm0Var.setOnScrollListener(new ah.d0(this, 29));
        z00 z00Var = new z00(getContext(), this.resourcesProvider);
        this.f31193y = z00Var;
        z00Var.setViewType(14);
        z00Var.setVisibility(0);
        frameLayout.addView(z00Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(lm0Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.H = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int i12 = org.telegram.ui.ActionBar.k6.Qh;
        int themedColor3 = getThemedColor(i12);
        Drawable j02 = org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        view.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(view, j02, O, O2, g6Var);
        view.setOnClickListener(new dp(this, 3));
        frameLayout.addView(view, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.K = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f31181f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 8));
        frameLayout.addView(textView2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var = new o6(getContext(), true, true, true);
        this.I = o6Var;
        o6Var.getDrawable().q(true);
        o6Var.f29157n = false;
        o6Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.k6.Sh;
        org.telegram.ui.ActionBar.r6.a0(o6Var, i13, this.resourcesProvider);
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(o6Var, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var2 = new o6(getContext(), true, true, true);
        this.J = o6Var2;
        o6Var2.getDrawable().q(true);
        o6Var2.f29157n = false;
        o6Var2.setGravity(17);
        org.telegram.ui.ActionBar.r6.a0(o6Var2, i13, this.resourcesProvider);
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var2.setAlpha(0.0f);
        o6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(o6Var2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f31181f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new aa(6, this, snVar));
            frameLayout.addView(textView3, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (snVar.i() != null) {
                str = UserObject.getFirstName(snVar.i());
            } else {
                TLRPC.Chat chat = snVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        K();
        L(false);
    }

    public static void I(s21 s21Var) {
        if (s21Var == null) {
            return;
        }
        float width = s21Var.getWidth() / 2.0f;
        float max = Math.max(width, s21Var.getWidth() - width);
        float max2 = Math.max(0.0f, s21Var.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(s21Var, s21.f30418w, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(qt.e);
        ofFloat.addListener(new org.telegram.ui.pq(s21Var, 17));
        ofFloat.start();
    }

    public static void m(up upVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (upVar.getContext() == null) {
            return;
        }
        org.telegram.ui.sn snVar = upVar.v;
        sg.j0 j0Var = new sg.j0(22, upVar.currentAccount, upVar.getContext(), snVar, upVar.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(upVar.f31180e0, true);
        j0Var.L1(upVar.v.a());
        j0Var.Q0 = new cp(upVar, 2);
        j0Var.show();
    }

    public static void n(up upVar, org.telegram.ui.sn snVar) {
        if (upVar.f31181f != null) {
            upVar.f31181f = null;
            upVar.dismiss();
            ChatThemeController.getInstance(upVar.currentAccount).clearWallpaper(snVar.a(), true);
            return;
        }
        upVar.dismiss();
    }

    public static void p(up upVar, View view, int i10) {
        jr0 jr0Var;
        lm0 lm0Var = upVar.f31191w;
        sp spVar = upVar.h;
        if (spVar.d.get(i10) != upVar.L && upVar.Q == null) {
            upVar.L = (tp) spVar.d.get(i10);
            upVar.D();
            spVar.E(i10);
            upVar.containerView.postDelayed(new ff(upVar, i10, 1), 100L);
            for (int i11 = 0; i11 < lm0Var.getChildCount(); i11++) {
                u21 u21Var = (u21) lm0Var.getChildAt(i11);
                if (u21Var != view && (jr0Var = u21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(jr0Var);
                    u21Var.J.run();
                }
            }
            if (!((tp) spVar.d.get(i10)).f30871a.f20885a) {
                ((u21) view).d();
            }
            upVar.L(true);
        }
    }

    public static void r(up upVar, pc1 pc1Var) {
        ?? obj = new Object();
        obj.f21637a = true;
        org.telegram.ui.sn snVar = upVar.v;
        pc1Var.f40442a.f40426a = snVar.getResourceProvider();
        pc1Var.f40488q1 = new np(upVar);
        obj.f21639c = new pc(8);
        obj.d = new cp(upVar, 5);
        obj.f21638b = new cp(upVar, 6);
        obj.e = true;
        upVar.W = pc1Var;
        snVar.showAsSheet(pc1Var, obj);
    }

    public static void s(up upVar) {
        org.telegram.ui.sn snVar = upVar.v;
        ri riVar = new ri(snVar.getParentActivity(), snVar, false, false, false, snVar.getResourceProvider());
        upVar.X = riVar;
        riVar.drawNavigationBar = true;
        riVar.T1(LocaleController.getString(R.string.ChooseBackground));
        ri riVar2 = upVar.X;
        riVar2.f30138c2 = new mp(upVar);
        riVar2.R1(1, false);
        upVar.X.w1();
        upVar.X.f30158j0.f0();
        upVar.X.show();
        upVar.Y = new ah.v(upVar, upVar.getContext());
        o6 o6Var = new o6(upVar.getContext(), true, true, true);
        upVar.Z = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        upVar.Z.setText(LocaleController.getString(R.string.SetColorAsBackground));
        upVar.Z.setGravity(17);
        o6 o6Var2 = upVar.Z;
        int i10 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.a0(o6Var2, i10, upVar.resourcesProvider);
        upVar.Y.addView(upVar.Z, w7.z5.e(-1, -2, 17));
        ah.v vVar = upVar.Y;
        int dp = AndroidUtilities.dp(0.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f21184d6;
        int themedColor = upVar.getThemedColor(i11);
        int o10 = i0.a.o(upVar.getThemedColor(i10), 76);
        org.telegram.ui.ActionBar.r6.S(vVar, org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, themedColor, o10, o10), org.telegram.ui.ActionBar.r6.O(i11), org.telegram.ui.ActionBar.r6.h(i10, 76), upVar.resourcesProvider);
        upVar.Y.setOnClickListener(new dp(upVar, 0));
        upVar.X.f30193u1.addView(upVar.Y, w7.z5.e(-1, -2, 80));
    }

    public static org.telegram.ui.ActionBar.j6 u(boolean z10) {
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string) != null && !org.telegram.ui.ActionBar.k6.P0(string).q()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (org.telegram.ui.ActionBar.k6.P0(string2) != null && org.telegram.ui.ActionBar.k6.P0(string2).q()) {
            str2 = string2;
        }
        if (z10) {
            return org.telegram.ui.ActionBar.k6.P0(str2);
        }
        return org.telegram.ui.ActionBar.k6.P0(str);
    }

    public final boolean A() {
        gg.b bVar;
        if (this.L == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.V;
        gg.b bVar2 = null;
        if (f4Var != null) {
            bVar = f4Var.f20887c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.L.f30871a;
        if (f4Var2 != null) {
            bVar2 = f4Var2.f20887c;
        }
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
    }

    public final void B() {
        if (!this.f31174a0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f31174a0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new qp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new rp(this, chatThemeController));
            }
        }
    }

    public final void C(List list) {
        gg.b bVar;
        if (list != null && !list.isEmpty()) {
            tp tpVar = new tp((org.telegram.ui.ActionBar.f4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.U) {
                org.telegram.ui.ActionBar.f4 f4Var = this.f31188n.f40882f;
                this.V = f4Var;
                if (f4Var != null) {
                    f4Var.k();
                }
            }
            arrayList.add(0, tpVar);
            if (!this.U) {
                this.L = tpVar;
            }
            org.telegram.ui.ActionBar.f4 f4Var2 = this.V;
            if (f4Var2 != null) {
                bVar = f4Var2.f20887c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.f4 f4Var3 = (org.telegram.ui.ActionBar.f4) list.get(i10);
                tp tpVar2 = new tp(f4Var3);
                f4Var3.m(this.currentAccount);
                tpVar2.f30873c = this.M ? 1 : 0;
                if (gg.b.a(f4Var3.f20887c, bVar)) {
                    arrayList.add(1, tpVar2);
                    z10 = true;
                } else {
                    arrayList.add(tpVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.f4 f4Var4 = this.V;
            if (f4Var4 != null && !z10) {
                tp tpVar3 = new tp(f4Var4);
                f4Var4.m(this.currentAccount);
                tpVar3.f30873c = this.M ? 1 : 0;
                arrayList.add(1, tpVar3);
            }
            sp spVar = this.h;
            spVar.d = arrayList;
            spVar.l();
            this.F.setVisibility(0);
            if (!this.U) {
                E(false);
                this.f31191w.animate().alpha(1.0f).setDuration(150L).start();
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
                wallPaper = this.f31181f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.L.f30871a;
            if (f4Var.f20885a) {
                this.f31188n.q(null, wallPaper2, true, Boolean.valueOf(this.M), false);
                return;
            }
            this.f31188n.q(f4Var, wallPaper2, true, Boolean.valueOf(this.M), false);
        }
    }

    public final void E(boolean z10) {
        sp spVar = this.h;
        ArrayList arrayList = spVar.d;
        org.telegram.ui.ActionBar.f4 f4Var = this.V;
        s4.b0 b0Var = this.f31192x;
        lm0 lm0Var = this.f31191w;
        if (f4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (gg.b.a(((tp) arrayList.get(i10)).f30871a.f20887c, this.V.f20887c)) {
                        this.L = (tp) arrayList.get(i10);
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
                spVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, spVar.d.size() - 1);
                if (z10) {
                    lm0Var.x0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.L = (tp) arrayList.get(0);
            spVar.E(0);
            if (z10) {
                lm0Var.x0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        D();
    }

    public final void F(boolean z10, boolean z11) {
        int i10;
        if (this.M != z10) {
            this.M = z10;
            op opVar = this.F;
            xj0 xj0Var = this.E;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = xj0Var.e[0];
                }
                xj0Var.P(i11);
                if (opVar != null) {
                    opVar.d();
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
            if (opVar != null) {
                opVar.invalidate();
            }
        }
    }

    public final void G(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.up.G(boolean):void");
    }

    public final void J(org.telegram.ui.ActionBar.j6 j6Var) {
        if (j6Var != null && j6Var != org.telegram.ui.ActionBar.k6.I) {
            this.f31184h0 = true;
            try {
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, j6Var, Boolean.FALSE, null, -1);
            } finally {
                this.f31184h0 = false;
            }
        }
    }

    public final void K() {
        TextView textView = this.e;
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.p5, this.resourcesProvider);
            int dp = AndroidUtilities.dp(6.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            int o10 = i0.a.o(getThemedColor(i10), 76);
            org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10);
            org.telegram.ui.ActionBar.n6 h = org.telegram.ui.ActionBar.r6.h(i10, 76);
            org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
            textView.setBackground(j02);
            org.telegram.ui.ActionBar.r6.k(textView, j02, null, h, g6Var);
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i11 = org.telegram.ui.ActionBar.k6.f21405p7;
            org.telegram.ui.ActionBar.r6.W(textView2, i11, this.resourcesProvider);
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i11), 76);
            org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(dp2, dp2, dp2, dp2, 0, o11, o11);
            org.telegram.ui.ActionBar.n6 h10 = org.telegram.ui.ActionBar.r6.h(i11, 76);
            org.telegram.ui.ActionBar.g6 g6Var2 = this.resourcesProvider;
            textView2.setBackground(j03);
            org.telegram.ui.ActionBar.r6.k(textView2, j03, null, h10, g6Var2);
        }
        int i12 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1);
        org.telegram.ui.ActionBar.n6 h11 = org.telegram.ui.ActionBar.r6.h(i12, 30);
        org.telegram.ui.ActionBar.g6 g6Var3 = this.resourcesProvider;
        ImageView imageView = this.f31175b;
        org.telegram.ui.ActionBar.r6.S(imageView, g02, null, h11, g6Var3);
        int themedColor = getThemedColor(i12);
        org.telegram.ui.ActionBar.h2 h2Var = this.f31177c;
        h2Var.a(themedColor);
        h2Var.b(getThemedColor(i12));
        imageView.invalidate();
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.S(this.F, org.telegram.ui.ActionBar.k6.g0(i0.a.o(getThemedColor(i13), 30), 1, -1), null, org.telegram.ui.ActionBar.r6.h(i13, 30), this.resourcesProvider);
        int i14 = org.telegram.ui.ActionBar.k6.f21346m5;
        org.telegram.ui.ActionBar.g6 g6Var4 = this.resourcesProvider;
        TextView textView3 = this.K;
        org.telegram.ui.ActionBar.r6.W(textView3, i14, g6Var4);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i13), 76);
        org.telegram.ui.ActionBar.r6.S(textView3, org.telegram.ui.ActionBar.k6.j0(dp3, dp3, dp3, dp3, 0, o12, o12), null, org.telegram.ui.ActionBar.r6.h(i13, 76), this.resourcesProvider);
    }

    public final void L(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.up.L(boolean):void");
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i5));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new cp(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        s21 s21Var;
        org.telegram.ui.ActionBar.j6 u10;
        boolean z10;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        boolean z11 = this.N;
        boolean z12 = this.f31190s;
        if (!z11 && this.M != z12) {
            s21Var = w();
        } else {
            s21Var = null;
        }
        if (!this.N) {
            org.telegram.ui.qn qnVar = this.f31188n;
            TLRPC.WallPaper wallPaper = qnVar.f40883g;
            if (wallPaper == null) {
                wallPaper = this.f31181f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (s21Var == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            qnVar.q(this.f31189r, wallPaper2, z10, Boolean.valueOf(z12), false);
        }
        if (this.M != z12) {
            if (org.telegram.ui.ActionBar.k6.I.q() == z12) {
                u10 = org.telegram.ui.ActionBar.k6.I;
            } else {
                u10 = u(z12);
            }
            if (this.f31185i0) {
                J(u10);
            } else {
                org.telegram.ui.ActionBar.k6.t(u10, false, z12);
            }
        }
        this.f31185i0 = false;
        I(s21Var);
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        gp gpVar = new gp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f41648q7) {
            org.telegram.ui.ActionBar.o2 o2Var = this.W;
            if (o2Var instanceof pc1) {
                arrayList.addAll(((pc1) o2Var).S0());
                return arrayList;
            }
        }
        ri riVar = this.X;
        if (riVar != null) {
            arrayList.addAll(riVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.shadowDrawable}, gpVar, org.telegram.ui.ActionBar.k6.f21255h5));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        View view = this.H;
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.t6) obj).f21869n = this.f31188n;
        }
        return arrayList;
    }

    @Override
    public final void onBackPressed() {
        x();
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && A()) {
            int x10 = (int) motionEvent.getX();
            if (((int) motionEvent.getY()) < this.containerView.getTop() || x10 < this.containerView.getLeft() || x10 > this.containerView.getRight()) {
                this.v.getFragmentView().dispatchTouchEvent(motionEvent);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f7) {
        p40 p40Var = this.T;
        if (p40Var != null) {
            p40Var.b(true);
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
        org.telegram.ui.sn snVar = this.v;
        if (snVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !snVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            p40 p40Var = new p40(9, getContext(), snVar.getResourceProvider(), false);
            this.T = p40Var;
            p40Var.setVisibility(4);
            this.T.setShowingDuration(5000L);
            this.T.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.M) {
                this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.T.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new cp(this, 7), 1500L);
            this.container.addView(this.T, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int themedColor;
        super.onThemeColorsChanged();
        y();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.navBarColorKey == -1 && this.navBarColor != (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.f21272i5))) {
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

    public final void v(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.up.v(boolean):void");
    }

    public final org.telegram.ui.Components.s21 w() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.up.w():org.telegram.ui.Components.s21");
    }

    public final void x() {
        if (A()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) {
                public final up f26404b;

                {
                    this.f26404b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26404b.v(false);
                            return;
                        default:
                            this.f26404b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) {
                public final up f26404b;

                {
                    this.f26404b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26404b.v(false);
                            return;
                        default:
                            this.f26404b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.p();
            return;
        }
        dismiss();
    }

    public final void y() {
        try {
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.Oh);
            xj0 xj0Var = this.E;
            if (xj0Var != null && themedColor != this.f31186j0) {
                this.f31186j0 = themedColor;
                xj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
            }
            org.telegram.ui.ActionBar.h2 h2Var = this.f31177c;
            if (h2Var != null) {
                int i10 = org.telegram.ui.ActionBar.k6.f21290j5;
                h2Var.a(getThemedColor(i10));
                h2Var.b(getThemedColor(i10));
                ImageView imageView = this.f31175b;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5);
            if (themedColor2 != this.f31187k0) {
                this.f31187k0 = themedColor2;
                setBackgroundColor(themedColor2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void z() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.N) {
            org.telegram.ui.ActionBar.k6.f21138b = false;
            if (A()) {
                wallPaper = null;
            } else {
                wallPaper = this.f31188n.f40883g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.L.f30871a;
            if (f4Var.f20885a) {
                this.f31188n.q(null, wallPaper2, false, Boolean.valueOf(this.M), true);
            } else {
                this.f31188n.q(f4Var, wallPaper2, false, Boolean.valueOf(this.M), true);
            }
            ri riVar = this.X;
            if (riVar != null) {
                gj gjVar = riVar.f30182r0;
                if (gjVar != null) {
                    boolean z10 = this.M;
                    xa xaVar = gjVar.v;
                    ((ArrayList) xaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) xaVar.e, z10);
                    xaVar.l();
                }
                this.X.h1();
            }
            sp spVar = this.h;
            if (spVar != null && spVar.d != null) {
                for (int i10 = 0; i10 < spVar.d.size(); i10++) {
                    ((tp) spVar.d.get(i10)).f30873c = this.M ? 1 : 0;
                }
                spVar.l();
            }
        }
    }
}
