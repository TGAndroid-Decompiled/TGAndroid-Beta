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
import org.telegram.ui.ce1;
public final class zp extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f31939i0 = 0;
    public final TextView E;
    public final yj0 F;
    public final sp G;
    public final tp H;
    public final View I;
    public final s6 J;
    public final s6 K;
    public final TextView L;
    public yp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public di.sb R;
    public float S;
    public ValueAnimator T;
    public v40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.b4 W;
    public org.telegram.ui.ActionBar.m2 X;
    public vi Y;
    public ah.v Z;
    public s6 f31940a0;
    public final ImageView f31941b;
    public boolean f31942b0;
    public final org.telegram.ui.ActionBar.f2 f31943c;
    public br f31944c0;
    public final TextView d;
    public boolean f31945d0;
    public final TextView e;
    public boolean f31946e0;
    public TLRPC.WallPaper f31947f;
    public TL_stories.TL_premium_boostsStatus f31948f0;
    public float f31949g0;
    public final xp h;
    public ValueAnimator f31950h0;
    public final org.telegram.ui.co f31951n;
    public final org.telegram.ui.ActionBar.b4 f31952r;
    public final boolean f31953s;
    public final org.telegram.ui.fo v;
    public final mm0 f31954w;
    public final s4.b0 f31955x;
    public final f10 f31956y;

    public zp(org.telegram.ui.fo foVar, org.telegram.ui.co coVar) {
        super(1, (Context) foVar.getParentActivity(), (org.telegram.ui.ActionBar.c6) coVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f31945d0 = false;
        this.f31946e0 = false;
        this.f31949g0 = 0.0f;
        this.v = foVar;
        this.f31951n = coVar;
        this.f31952r = coVar.f34982f;
        this.f31947f = coVar.h;
        this.f31953s = org.telegram.ui.ActionBar.g6.I.q();
        xp xpVar = new xp(this.currentAccount, foVar.a(), coVar, 0);
        this.h = xpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.g6.f19989i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f19989i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f20007j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f31941b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f31943c = f2Var;
        imageView.setImageDrawable(f2Var);
        imageView.setOnClickListener(new ip(this, 1));
        frameLayout.addView(imageView, w7.a6.a(44.0f, 4.0f, -2.0f, 62.0f, 12.0f, 44, 8388659));
        frameLayout.addView(textView, w7.a6.a(-2.0f, 44.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        yj0 yj0Var = new yj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = yj0Var;
        this.N = !org.telegram.ui.ActionBar.g6.I.q();
        D(org.telegram.ui.ActionBar.g6.I.q(), false);
        yj0Var.J(true);
        yj0Var.h = true;
        yj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        sp spVar = new sp(this, getContext());
        this.G = spVar;
        spVar.setAnimation(yj0Var);
        spVar.setScaleType(ImageView.ScaleType.CENTER);
        spVar.setOnClickListener(new ip(this, 2));
        frameLayout.addView(spVar, w7.a6.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        this.H = new s4.c0(getContext());
        mm0 mm0Var = new mm0(getContext(), null);
        this.f31954w = mm0Var;
        mm0Var.setAdapter(xpVar);
        mm0Var.setDrawSelection(false);
        mm0Var.setClipChildren(false);
        mm0Var.setClipToPadding(false);
        mm0Var.setHasFixedSize(true);
        mm0Var.setItemAnimator(null);
        mm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.b0 b0Var = new s4.b0(0, false);
        this.f31955x = b0Var;
        mm0Var.setLayoutManager(b0Var);
        mm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        mm0Var.setOnItemClickListener(new j(this, 3));
        mm0Var.setOnScrollListener(new ah.d0(this, 25));
        f10 f10Var = new f10(getContext(), this.resourcesProvider);
        this.f31956y = f10Var;
        f10Var.setViewType(14);
        f10Var.setVisibility(0);
        frameLayout.addView(f10Var, w7.a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        frameLayout.addView(mm0Var, w7.a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new ip(this, 3));
        frameLayout.addView(view, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f31947f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 8));
        frameLayout.addView(textView2, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        s6 s6Var = new s6(getContext(), true, true, true);
        this.J = s6Var;
        s6Var.getDrawable().q(true);
        s6Var.f29047n = false;
        s6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.g6.Sh;
        s6Var.setTextColor(getThemedColor(i12));
        s6Var.setTextSize(AndroidUtilities.dp(15.0f));
        s6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(s6Var, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        s6 s6Var2 = new s6(getContext(), true, true, true);
        this.K = s6Var2;
        s6Var2.getDrawable().q(true);
        s6Var2.f29047n = false;
        s6Var2.setGravity(17);
        s6Var2.setTextColor(getThemedColor(i12));
        s6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        s6Var2.setAlpha(0.0f);
        s6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(s6Var2, w7.a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        if (this.f31947f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.xf(this, foVar));
            frameLayout.addView(textView3, w7.a6.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (foVar.i() != null) {
                str = UserObject.getFirstName(foVar.i());
            } else {
                TLRPC.Chat chat = foVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.a6.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
        }
        F();
        G(false);
    }

    public static void n(zp zpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (zpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.fo foVar = zpVar.v;
        sg.j0 j0Var = new sg.j0(22, zpVar.currentAccount, zpVar.getContext(), foVar, zpVar.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(zpVar.f31948f0, true);
        j0Var.I1(zpVar.v.a());
        j0Var.Q0 = new hp(zpVar, 2);
        j0Var.show();
    }

    public static void o(zp zpVar, org.telegram.ui.fo foVar) {
        if (zpVar.f31947f != null) {
            zpVar.f31947f = null;
            zpVar.dismiss();
            ChatThemeController.getInstance(zpVar.currentAccount).clearWallpaper(foVar.a(), true);
            return;
        }
        zpVar.dismiss();
    }

    public static void q(zp zpVar, View view, int i10) {
        lr0 lr0Var;
        mm0 mm0Var = zpVar.f31954w;
        xp xpVar = zpVar.h;
        if (xpVar.d.get(i10) != zpVar.M && zpVar.R == null) {
            zpVar.M = (yp) xpVar.d.get(i10);
            zpVar.A();
            xpVar.E(i10);
            zpVar.containerView.postDelayed(new kf(zpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < mm0Var.getChildCount(); i11++) {
                v21 v21Var = (v21) mm0Var.getChildAt(i11);
                if (v21Var != view && (lr0Var = v21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(lr0Var);
                    v21Var.J.run();
                }
            }
            if (!((yp) xpVar.d.get(i10)).f31668a.f19642a) {
                ((v21) view).d();
            }
            zpVar.G(true);
        }
    }

    public static void s(zp zpVar, ce1 ce1Var) {
        ?? obj = new Object();
        obj.f20469a = true;
        org.telegram.ui.fo foVar = zpVar.v;
        ce1Var.f34853a.f34838a = foVar.getResourceProvider();
        ce1Var.f34896p1 = new rp(zpVar);
        obj.f20471c = new ve(4);
        obj.d = new hp(zpVar, 5);
        obj.f20470b = new hp(zpVar, 6);
        obj.e = true;
        zpVar.X = ce1Var;
        foVar.showAsSheet(ce1Var, obj);
    }

    public final void A() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            this.P = false;
            this.v.getClass();
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f31947f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f31668a;
            if (b4Var.f19642a) {
                this.f31951n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f31951n.i(b4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void B(boolean z10) {
        xp xpVar = this.h;
        ArrayList arrayList = xpVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        s4.b0 b0Var = this.f31955x;
        mm0 mm0Var = this.f31954w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (gg.b.a(((yp) arrayList.get(i10)).f31668a.f19644c, this.W.f19644c)) {
                        this.M = (yp) arrayList.get(i10);
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
                xpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, xpVar.d.size() - 1);
                if (z10) {
                    mm0Var.x0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (yp) arrayList.get(0);
            xpVar.E(0);
            if (z10) {
                mm0Var.x0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        A();
    }

    public final void D(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            sp spVar = this.G;
            yj0 yj0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = yj0Var.e[0];
                }
                yj0Var.P(i11);
                if (spVar != null) {
                    spVar.d();
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
            if (spVar != null) {
                spVar.invalidate();
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
        sp spVar = this.G;
        spVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        spVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        spVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        di.sb sbVar = new di.sb(this, getContext(), z10, canvas, (spVar.getMeasuredWidth() / 2.0f) + f7, (spVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = sbVar;
        sbVar.setOnTouchListener(new ci.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new lp(this));
        this.T.addListener(new l6(this, 14));
        this.T.setDuration(400L);
        this.T.setInterpolator(xt.e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ah.t(24, this, z10));
    }

    public final void F() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.g6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.g6.f20122p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.g6.g0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f31941b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.f2 f2Var = this.f31943c;
        f2Var.a(themedColor);
        f2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.g6.g0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f20063m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.j0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void G(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.G(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new hp(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.f6 O0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.co coVar = this.f31951n;
            TLRPC.WallPaper wallPaper = coVar.h;
            if (wallPaper == null) {
                wallPaper = this.f31947f;
            }
            coVar.i(this.f31952r, wallPaper, true, Boolean.valueOf(this.f31953s), false);
        }
        if (this.N != this.f31953s) {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.f31953s) {
                O0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string) != null && !org.telegram.ui.ActionBar.g6.O0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.O0(string2) != null && org.telegram.ui.ActionBar.g6.O0(string2).q()) {
                    str2 = string2;
                }
                if (this.f31953s) {
                    O0 = org.telegram.ui.ActionBar.g6.O0(str2);
                } else {
                    O0 = org.telegram.ui.ActionBar.g6.O0(str);
                }
            }
            org.telegram.ui.ActionBar.g6.t(O0, false, this.f31953s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        wp wpVar = new wp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.m2 m2Var = this.X;
            if (m2Var instanceof ce1) {
                arrayList.addAll(((ce1) m2Var).S0());
                return arrayList;
            }
        }
        vi viVar = this.Y;
        if (viVar != null) {
            arrayList.addAll(viVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, wpVar, org.telegram.ui.ActionBar.g6.f19972h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f20007j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f31954w, 16, new Class[]{v21.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19989i5));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.i6) obj).f20383o = this.f31951n;
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
        v40 v40Var = this.U;
        if (v40Var != null) {
            v40Var.b(true);
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
        org.telegram.ui.fo foVar = this.v;
        if (foVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !foVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            v40 v40Var = new v40(9, getContext(), foVar.getResourceProvider(), false);
            this.U = v40Var;
            v40Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new hp(this, 7), 1500L);
            this.container.addView(this.U, w7.a6.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
    }

    public final void u(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zp.u(boolean):void");
    }

    public final void v() {
        if (x()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) {
                public final zp f26775b;

                {
                    this.f26775b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26775b.u(false);
                            return;
                        default:
                            this.f26775b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) {
                public final zp f26775b;

                {
                    this.f26775b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26775b.u(false);
                            return;
                        default:
                            this.f26775b.dismiss();
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
            org.telegram.ui.ActionBar.g6.f19855b = false;
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f31951n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f31668a;
            if (b4Var.f19642a) {
                this.f31951n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f31951n.i(b4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            vi viVar = this.Y;
            if (viVar != null) {
                kj kjVar = viVar.f30037r0;
                if (kjVar != null) {
                    boolean z10 = this.N;
                    bb bbVar = kjVar.v;
                    ((ArrayList) bbVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.e, z10);
                    bbVar.l();
                }
                this.Y.e1();
            }
            xp xpVar = this.h;
            if (xpVar != null && xpVar.d != null) {
                for (int i10 = 0; i10 < xpVar.d.size(); i10++) {
                    ((yp) xpVar.d.get(i10)).f31670c = this.N ? 1 : 0;
                }
                xpVar.l();
            }
        }
    }

    public final boolean x() {
        gg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        gg.b bVar2 = null;
        if (b4Var != null) {
            bVar = b4Var.f19644c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.M.f31668a;
        if (b4Var2 != null) {
            bVar2 = b4Var2.f19644c;
        }
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
    }

    public final void y() {
        if (!this.f31942b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f31942b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new up(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new vp(this, chatThemeController));
            }
        }
    }

    public final void z(List list) {
        gg.b bVar;
        if (list != null && !list.isEmpty()) {
            yp ypVar = new yp((org.telegram.ui.ActionBar.b4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.b4 b4Var = this.f31951n.f34982f;
                this.W = b4Var;
                if (b4Var != null) {
                    b4Var.l();
                }
            }
            arrayList.add(0, ypVar);
            if (!this.V) {
                this.M = ypVar;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.W;
            if (b4Var2 != null) {
                bVar = b4Var2.f19644c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
                yp ypVar2 = new yp(b4Var3);
                b4Var3.n(this.currentAccount);
                ypVar2.f31670c = this.N ? 1 : 0;
                if (gg.b.a(b4Var3.f19644c, bVar)) {
                    arrayList.add(1, ypVar2);
                    z10 = true;
                } else {
                    arrayList.add(ypVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.b4 b4Var4 = this.W;
            if (b4Var4 != null && !z10) {
                yp ypVar3 = new yp(b4Var4);
                b4Var4.n(this.currentAccount);
                ypVar3.f31670c = this.N ? 1 : 0;
                arrayList.add(1, ypVar3);
            }
            xp xpVar = this.h;
            xpVar.d = arrayList;
            xpVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                B(false);
                this.f31954w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            G(true);
        }
    }
}
