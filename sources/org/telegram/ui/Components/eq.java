package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.zd1;
public final class eq extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f25743i0 = 0;
    public final TextView E;
    public final fk0 F;
    public final xp G;
    public final yp H;
    public final View I;
    public final r6 J;
    public final r6 K;
    public final TextView L;
    public dq M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci.tb R;
    public float S;
    public ValueAnimator T;
    public c50 U;
    public boolean V;
    public org.telegram.ui.ActionBar.b4 W;
    public org.telegram.ui.ActionBar.m2 X;
    public aj Y;
    public ci.m6 Z;
    public r6 f25744a0;
    public final ImageView f25745b;
    public boolean f25746b0;
    public final org.telegram.ui.ActionBar.f2 f25747c;
    public gr f25748c0;
    public final TextView d;
    public boolean f25749d0;
    public final TextView f25750e;
    public boolean f25751e0;
    public TLRPC.WallPaper f25752f;
    public TL_stories.TL_premium_boostsStatus f25753f0;
    public float f25754g0;
    public final cq h;
    public ValueAnimator f25755h0;
    public final org.telegram.ui.bo f25756n;
    public final org.telegram.ui.ActionBar.b4 f25757r;
    public final boolean f25758s;
    public final org.telegram.ui.eo v;
    public final wm0 f25759w;
    public final s4.d0 f25760x;
    public final m10 f25761y;

    public eq(org.telegram.ui.eo eoVar, org.telegram.ui.bo boVar) {
        super(1, (Context) eoVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) boVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f25749d0 = false;
        this.f25751e0 = false;
        this.f25754g0 = 0.0f;
        this.v = eoVar;
        this.f25756n = boVar;
        this.f25757r = boVar.f36218f;
        this.f25752f = boVar.h;
        this.f25758s = org.telegram.ui.ActionBar.h6.I.q();
        cq cqVar = new cq(this.currentAccount, eoVar.a(), boVar, 0);
        this.h = cqVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.h6.f20649i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20649i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20667j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f25745b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f25747c = f2Var;
        imageView.setImageDrawable(f2Var);
        imageView.setOnClickListener(new np(this, 1));
        frameLayout.addView(imageView, w7.w5.a(44.0f, 4.0f, -2.0f, 62.0f, 12.0f, 44, 8388659));
        frameLayout.addView(textView, w7.w5.a(-2.0f, 44.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        fk0 fk0Var = new fk0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = fk0Var;
        this.N = !org.telegram.ui.ActionBar.h6.I.q();
        D(org.telegram.ui.ActionBar.h6.I.q(), false);
        fk0Var.J(true);
        fk0Var.h = true;
        fk0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        xp xpVar = new xp(this, getContext());
        this.G = xpVar;
        xpVar.setAnimation(fk0Var);
        xpVar.setScaleType(ImageView.ScaleType.CENTER);
        xpVar.setOnClickListener(new np(this, 2));
        frameLayout.addView(xpVar, w7.w5.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        this.H = new s4.e0(getContext());
        wm0 wm0Var = new wm0(getContext(), null);
        this.f25759w = wm0Var;
        wm0Var.setAdapter(cqVar);
        wm0Var.setDrawSelection(false);
        wm0Var.setClipChildren(false);
        wm0Var.setClipToPadding(false);
        wm0Var.setHasFixedSize(true);
        wm0Var.setItemAnimator(null);
        wm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.d0 d0Var = new s4.d0(0, false);
        this.f25760x = d0Var;
        wm0Var.setLayoutManager(d0Var);
        wm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wm0Var.setOnItemClickListener(new j(this, 3));
        wm0Var.setOnScrollListener(new ai.r(this, 24));
        m10 m10Var = new m10(getContext(), this.resourcesProvider);
        this.f25761y = m10Var;
        m10Var.setViewType(14);
        m10Var.setVisibility(0);
        frameLayout.addView(m10Var, w7.w5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        frameLayout.addView(wm0Var, w7.w5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new np(this, 3));
        frameLayout.addView(view, w7.w5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f25752f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.w5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        r6 r6Var = new r6(getContext(), true, true, true);
        this.J = r6Var;
        r6Var.getDrawable().q(true);
        r6Var.f30058n = false;
        r6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        r6Var.setTextColor(getThemedColor(i12));
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(r6Var, w7.w5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        r6 r6Var2 = new r6(getContext(), true, true, true);
        this.K = r6Var2;
        r6Var2.getDrawable().q(true);
        r6Var2.f30058n = false;
        r6Var2.setGravity(17);
        r6Var2.setTextColor(getThemedColor(i12));
        r6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        r6Var2.setAlpha(0.0f);
        r6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(r6Var2, w7.w5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        if (this.f25752f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.wf(this, eoVar));
            frameLayout.addView(textView3, w7.w5.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
            TextView textView4 = new TextView(getContext());
            this.f25750e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (eoVar.i() != null) {
                str = UserObject.getFirstName(eoVar.i());
            } else {
                TLRPC.Chat chat = eoVar.f37241e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.w5.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
        }
        F();
        G(false);
    }

    public static void o(eq eqVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (eqVar.getContext() == null) {
            return;
        }
        org.telegram.ui.eo eoVar = eqVar.v;
        rg.j0 j0Var = new rg.j0(22, eqVar.currentAccount, eqVar.getContext(), eoVar, eqVar.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(eqVar.f25753f0, true);
        j0Var.I1(eqVar.v.a());
        j0Var.Q0 = new mp(eqVar, 2);
        j0Var.show();
    }

    public static void p(eq eqVar, org.telegram.ui.eo eoVar) {
        if (eqVar.f25752f != null) {
            eqVar.f25752f = null;
            eqVar.dismiss();
            ChatThemeController.getInstance(eqVar.currentAccount).clearWallpaper(eoVar.a(), true);
            return;
        }
        eqVar.dismiss();
    }

    public static void q(eq eqVar, View view, int i10) {
        ur0 ur0Var;
        wm0 wm0Var = eqVar.f25759w;
        cq cqVar = eqVar.h;
        if (cqVar.d.get(i10) != eqVar.M && eqVar.R == null) {
            eqVar.M = (dq) cqVar.d.get(i10);
            eqVar.A();
            cqVar.E(i10);
            eqVar.containerView.postDelayed(new lf(eqVar, i10, 1), 100L);
            for (int i11 = 0; i11 < wm0Var.getChildCount(); i11++) {
                f31 f31Var = (f31) wm0Var.getChildAt(i11);
                if (f31Var != view && (ur0Var = f31Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(ur0Var);
                    f31Var.J.run();
                }
            }
            if (!((dq) cqVar.d.get(i10)).f25446a.f20239a) {
                ((f31) view).d();
            }
            eqVar.G(true);
        }
    }

    public static void s(eq eqVar, zd1 zd1Var) {
        ?? obj = new Object();
        obj.f21087a = true;
        org.telegram.ui.eo eoVar = eqVar.v;
        zd1Var.f44729a.f44714a = eoVar.getResourceProvider();
        zd1Var.f44773p1 = new wp(eqVar);
        obj.f21089c = new xh(3);
        obj.d = new mp(eqVar, 5);
        obj.f21088b = new mp(eqVar, 6);
        obj.f21090e = true;
        eqVar.X = zd1Var;
        eoVar.showAsSheet(zd1Var, obj);
    }

    public final void A() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            this.P = false;
            this.v.getClass();
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f25752f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f25446a;
            if (b4Var.f20239a) {
                this.f25756n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f25756n.i(b4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void B(boolean z10) {
        cq cqVar = this.h;
        ArrayList arrayList = cqVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        s4.d0 d0Var = this.f25760x;
        wm0 wm0Var = this.f25759w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (fg.b.a(((dq) arrayList.get(i10)).f25446a.f20241c, this.W.f20241c)) {
                        this.M = (dq) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                this.Q = i10;
                cqVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, cqVar.d.size() - 1);
                if (z10) {
                    wm0Var.x0(min);
                } else {
                    d0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (dq) arrayList.get(0);
            cqVar.E(0);
            if (z10) {
                wm0Var.x0(0);
            } else {
                d0Var.h1(0, 0);
            }
        }
        A();
    }

    public final void D(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            xp xpVar = this.G;
            fk0 fk0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = fk0Var.f26107e[0];
                }
                fk0Var.P(i11);
                if (xpVar != null) {
                    xpVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = fk0Var.f26107e[0] - 1;
            } else {
                i10 = 0;
            }
            fk0Var.N(i10, false, true);
            fk0Var.P(i10);
            if (xpVar != null) {
                xpVar.invalidate();
            }
        }
    }

    public final void E(boolean z10) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        xp xpVar = this.G;
        xpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        xpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        xpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ci.tb tbVar = new ci.tb(this, getContext(), z10, canvas, (xpVar.getMeasuredWidth() / 2.0f) + f7, (xpVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = tbVar;
        tbVar.setOnTouchListener(new bi.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new qp(this));
        this.T.addListener(new t8(this, 11));
        this.T.setDuration(400L);
        this.T.setInterpolator(cu.f25018e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bi.f(23, this, z10));
    }

    public final void F() {
        TextView textView = this.f25750e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.h6.f20780p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f20667j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.h6.g0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f25745b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.f2 f2Var = this.f25747c;
        f2Var.a(themedColor);
        f2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f20723m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void G(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eq.G(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new mp(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g6 O0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.bo boVar = this.f25756n;
            TLRPC.WallPaper wallPaper = boVar.h;
            if (wallPaper == null) {
                wallPaper = this.f25752f;
            }
            boVar.i(this.f25757r, wallPaper, true, Boolean.valueOf(this.f25758s), false);
        }
        if (this.N != this.f25758s) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.f25758s) {
                O0 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string) != null && !org.telegram.ui.ActionBar.h6.O0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.O0(string2) != null && org.telegram.ui.ActionBar.h6.O0(string2).q()) {
                    str2 = string2;
                }
                if (this.f25758s) {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str2);
                } else {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str);
                }
            }
            org.telegram.ui.ActionBar.h6.t(O0, false, this.f25758s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        bq bqVar = new bq(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.m2 m2Var = this.X;
            if (m2Var instanceof zd1) {
                arrayList.addAll(((zd1) m2Var).S0());
                return arrayList;
            }
        }
        aj ajVar = this.Y;
        if (ajVar != null) {
            arrayList.addAll(ajVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, bqVar, org.telegram.ui.ActionBar.h6.f20630h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20667j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25759w, 16, new Class[]{f31.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20649i5));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.j6) obj).f21029o = this.f25756n;
        }
        return arrayList;
    }

    @Override
    public final void onBackPressed() {
        v();
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && x()) {
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
        c50 c50Var = this.U;
        if (c50Var != null) {
            c50Var.b(true);
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
        this.O = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            z(chatThemeController.getEmojiThemes(7));
        } else {
            y();
        }
        org.telegram.ui.eo eoVar = this.v;
        if (eoVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !eoVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            c50 c50Var = new c50(9, getContext(), eoVar.getResourceProvider(), false);
            this.U = c50Var;
            c50Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new mp(this, 7), 1500L);
            this.container.addView(this.U, w7.w5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
    }

    public final void u(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eq.u(boolean):void");
    }

    public final void v() {
        if (x()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f20141a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) {
                public final eq f29561b;

                {
                    this.f29561b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29561b.u(false);
                            return;
                        default:
                            this.f29561b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) {
                public final eq f29561b;

                {
                    this.f29561b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29561b.u(false);
                            return;
                        default:
                            this.f29561b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
            return;
        }
        dismiss();
    }

    public final void w() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            org.telegram.ui.ActionBar.h6.f20515b = false;
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f25756n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f25446a;
            if (b4Var.f20239a) {
                this.f25756n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f25756n.i(b4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            aj ajVar = this.Y;
            if (ajVar != null) {
                pj pjVar = ajVar.f24378r0;
                if (pjVar != null) {
                    boolean z10 = this.N;
                    bb bbVar = pjVar.v;
                    ((ArrayList) bbVar.f24608e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.f24608e, z10);
                    bbVar.l();
                }
                this.Y.e1();
            }
            cq cqVar = this.h;
            if (cqVar != null && cqVar.d != null) {
                for (int i10 = 0; i10 < cqVar.d.size(); i10++) {
                    ((dq) cqVar.d.get(i10)).f25448c = this.N ? 1 : 0;
                }
                cqVar.l();
            }
        }
    }

    public final boolean x() {
        fg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        fg.b bVar2 = null;
        if (b4Var != null) {
            bVar = b4Var.f20241c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = fg.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.M.f25446a;
        if (b4Var2 != null) {
            bVar2 = b4Var2.f20241c;
        }
        if (bVar2 == null) {
            bVar2 = fg.b.d("❌");
        }
        return !fg.b.a(bVar, bVar2);
    }

    public final void y() {
        if (!this.f25746b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f25746b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new zp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new aq(this, chatThemeController));
            }
        }
    }

    public final void z(List list) {
        fg.b bVar;
        if (list != null && !list.isEmpty()) {
            dq dqVar = new dq((org.telegram.ui.ActionBar.b4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.b4 b4Var = this.f25756n.f36218f;
                this.W = b4Var;
                if (b4Var != null) {
                    b4Var.l();
                }
            }
            arrayList.add(0, dqVar);
            if (!this.V) {
                this.M = dqVar;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.W;
            if (b4Var2 != null) {
                bVar = b4Var2.f20241c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
                dq dqVar2 = new dq(b4Var3);
                b4Var3.n(this.currentAccount);
                dqVar2.f25448c = this.N ? 1 : 0;
                if (fg.b.a(b4Var3.f20241c, bVar)) {
                    arrayList.add(1, dqVar2);
                    z10 = true;
                } else {
                    arrayList.add(dqVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.b4 b4Var4 = this.W;
            if (b4Var4 != null && !z10) {
                dq dqVar3 = new dq(b4Var4);
                b4Var4.n(this.currentAccount);
                dqVar3.f25448c = this.N ? 1 : 0;
                arrayList.add(1, dqVar3);
            }
            cq cqVar = this.h;
            cqVar.d = arrayList;
            cqVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                B(false);
                this.f25759w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            G(true);
        }
    }
}
