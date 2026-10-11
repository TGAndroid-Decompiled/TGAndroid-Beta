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
import org.telegram.ui.wd1;
public final class cq extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f25421i0 = 0;
    public final TextView E;
    public final dk0 F;
    public final vp G;
    public final wp H;
    public final View I;
    public final r6 J;
    public final r6 K;
    public final TextView L;
    public bq M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci.tb R;
    public float S;
    public ValueAnimator T;
    public a50 U;
    public boolean V;
    public org.telegram.ui.ActionBar.b4 W;
    public org.telegram.ui.ActionBar.m2 X;
    public yi Y;
    public ci.m6 Z;
    public r6 f25422a0;
    public final ImageView f25423b;
    public boolean f25424b0;
    public final org.telegram.ui.ActionBar.f2 f25425c;
    public er f25426c0;
    public final TextView d;
    public boolean f25427d0;
    public final TextView f25428e;
    public boolean f25429e0;
    public TLRPC.WallPaper f25430f;
    public TL_stories.TL_premium_boostsStatus f25431f0;
    public float f25432g0;
    public final aq h;
    public ValueAnimator f25433h0;
    public final org.telegram.ui.xn f25434n;
    public final org.telegram.ui.ActionBar.b4 f25435r;
    public final boolean f25436s;
    public final org.telegram.ui.zn v;
    public final rm0 f25437w;
    public final s4.d0 f25438x;
    public final k10 f25439y;

    public cq(org.telegram.ui.zn znVar, org.telegram.ui.xn xnVar) {
        super(1, (Context) znVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) xnVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f25427d0 = false;
        this.f25429e0 = false;
        this.f25432g0 = 0.0f;
        this.v = znVar;
        this.f25434n = xnVar;
        this.f25435r = xnVar.f44149f;
        this.f25430f = xnVar.h;
        this.f25436s = org.telegram.ui.ActionBar.h6.I.q();
        aq aqVar = new aq(this.currentAccount, znVar.a(), xnVar, 0);
        this.h = aqVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.h6.f20912i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f20912i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20930j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f25423b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f25425c = f2Var;
        imageView.setImageDrawable(f2Var);
        imageView.setOnClickListener(new lp(this, 1));
        frameLayout.addView(imageView, w7.x5.a(44.0f, 4.0f, -2.0f, 62.0f, 12.0f, 44, 8388659));
        frameLayout.addView(textView, w7.x5.a(-2.0f, 44.0f, 0.0f, 62.0f, 0.0f, -1, 8388659));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        dk0 dk0Var = new dk0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = dk0Var;
        this.N = !org.telegram.ui.ActionBar.h6.I.q();
        D(org.telegram.ui.ActionBar.h6.I.q(), false);
        dk0Var.J(true);
        dk0Var.h = true;
        dk0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        vp vpVar = new vp(this, getContext());
        this.G = vpVar;
        vpVar.setAnimation(dk0Var);
        vpVar.setScaleType(ImageView.ScaleType.CENTER);
        vpVar.setOnClickListener(new lp(this, 2));
        frameLayout.addView(vpVar, w7.x5.a(44.0f, 0.0f, -2.0f, 7.0f, 0.0f, 44, 8388661));
        this.H = new s4.e0(getContext());
        rm0 rm0Var = new rm0(getContext(), null);
        this.f25437w = rm0Var;
        rm0Var.setAdapter(aqVar);
        rm0Var.setDrawSelection(false);
        rm0Var.setClipChildren(false);
        rm0Var.setClipToPadding(false);
        rm0Var.setHasFixedSize(true);
        rm0Var.setItemAnimator(null);
        rm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.d0 d0Var = new s4.d0(0, false);
        this.f25438x = d0Var;
        rm0Var.setLayoutManager(d0Var);
        rm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        rm0Var.setOnItemClickListener(new j(this, 3));
        rm0Var.setOnScrollListener(new ai.r(this, 24));
        k10 k10Var = new k10(getContext(), this.resourcesProvider);
        this.f25439y = k10Var;
        k10Var.setViewType(14);
        k10Var.setVisibility(0);
        frameLayout.addView(k10Var, w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        frameLayout.addView(rm0Var, w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new lp(this, 3));
        frameLayout.addView(view, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f25430f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        r6 r6Var = new r6(getContext(), true, true, true);
        this.J = r6Var;
        r6Var.getDrawable().q(true);
        r6Var.f30433n = false;
        r6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        r6Var.setTextColor(getThemedColor(i12));
        r6Var.setTextSize(AndroidUtilities.dp(15.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(r6Var, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        r6 r6Var2 = new r6(getContext(), true, true, true);
        this.K = r6Var2;
        r6Var2.getDrawable().q(true);
        r6Var2.f30433n = false;
        r6Var2.setGravity(17);
        r6Var2.setTextColor(getThemedColor(i12));
        r6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        r6Var2.setAlpha(0.0f);
        r6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(r6Var2, w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
        if (this.f25430f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.rf(this, znVar));
            frameLayout.addView(textView3, w7.x5.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
            TextView textView4 = new TextView(getContext());
            this.f25428e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (znVar.i() != null) {
                str = UserObject.getFirstName(znVar.i());
            } else {
                TLRPC.Chat chat = znVar.f44786e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.x5.a(48.0f, 16.0f, 214.0f, 16.0f, 12.0f, -1, 8388611));
        }
        F();
        G(false);
    }

    public static void o(cq cqVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (cqVar.getContext() == null) {
            return;
        }
        org.telegram.ui.zn znVar = cqVar.v;
        rg.j0 j0Var = new rg.j0(22, cqVar.currentAccount, cqVar.getContext(), znVar, cqVar.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(cqVar.f25431f0, true);
        j0Var.I1(cqVar.v.a());
        j0Var.Q0 = new kp(cqVar, 2);
        j0Var.show();
    }

    public static void p(cq cqVar, org.telegram.ui.zn znVar) {
        if (cqVar.f25430f != null) {
            cqVar.f25430f = null;
            cqVar.dismiss();
            ChatThemeController.getInstance(cqVar.currentAccount).clearWallpaper(znVar.a(), true);
            return;
        }
        cqVar.dismiss();
    }

    public static void q(cq cqVar, View view, int i10) {
        pr0 pr0Var;
        rm0 rm0Var = cqVar.f25437w;
        aq aqVar = cqVar.h;
        if (aqVar.d.get(i10) != cqVar.M && cqVar.R == null) {
            cqVar.M = (bq) aqVar.d.get(i10);
            cqVar.B();
            aqVar.E(i10);
            cqVar.containerView.postDelayed(new lf(cqVar, i10, 1), 100L);
            for (int i11 = 0; i11 < rm0Var.getChildCount(); i11++) {
                a31 a31Var = (a31) rm0Var.getChildAt(i11);
                if (a31Var != view && (pr0Var = a31Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(pr0Var);
                    a31Var.J.run();
                }
            }
            if (!((bq) aqVar.d.get(i10)).f25058a.f20503a) {
                ((a31) view).d();
            }
            cqVar.G(true);
        }
    }

    public static void s(cq cqVar, wd1 wd1Var) {
        ?? obj = new Object();
        obj.f21349a = true;
        org.telegram.ui.zn znVar = cqVar.v;
        wd1Var.f43359a.f43344a = znVar.getResourceProvider();
        wd1Var.f43403p1 = new up(cqVar);
        obj.f21351c = new vh(3);
        obj.d = new kp(cqVar, 5);
        obj.f21350b = new kp(cqVar, 6);
        obj.f21352e = true;
        cqVar.X = wd1Var;
        znVar.showAsSheet(wd1Var, obj);
    }

    public final void B() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            this.P = false;
            this.v.getClass();
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f25430f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f25058a;
            if (b4Var.f20503a) {
                this.f25434n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f25434n.i(b4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void C(boolean z10) {
        aq aqVar = this.h;
        ArrayList arrayList = aqVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        s4.d0 d0Var = this.f25438x;
        rm0 rm0Var = this.f25437w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (fg.b.a(((bq) arrayList.get(i10)).f25058a.f20505c, this.W.f20505c)) {
                        this.M = (bq) arrayList.get(i10);
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
                aqVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, aqVar.d.size() - 1);
                if (z10) {
                    rm0Var.x0(min);
                } else {
                    d0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (bq) arrayList.get(0);
            aqVar.E(0);
            if (z10) {
                rm0Var.x0(0);
            } else {
                d0Var.h1(0, 0);
            }
        }
        B();
    }

    public final void D(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            vp vpVar = this.G;
            dk0 dk0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = dk0Var.f25810e[0];
                }
                dk0Var.P(i11);
                if (vpVar != null) {
                    vpVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = dk0Var.f25810e[0] - 1;
            } else {
                i10 = 0;
            }
            dk0Var.N(i10, false, true);
            dk0Var.P(i10);
            if (vpVar != null) {
                vpVar.invalidate();
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
        vp vpVar = this.G;
        vpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        vpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        vpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ci.tb tbVar = new ci.tb(this, getContext(), z10, canvas, (vpVar.getMeasuredWidth() / 2.0f) + f7, (vpVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = tbVar;
        tbVar.setOnTouchListener(new bi.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new op(this));
        this.T.addListener(new t8(this, 11));
        this.T.setDuration(400L);
        this.T.setInterpolator(bu.f25097e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bi.f(23, this, z10));
    }

    public final void F() {
        TextView textView = this.f25428e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.h6.f21043p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f20930j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.h6.g0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f25423b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.f2 f2Var = this.f25425c;
        f2Var.a(themedColor);
        f2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f20986m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void G(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq.G(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new kp(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g6 O0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.xn xnVar = this.f25434n;
            TLRPC.WallPaper wallPaper = xnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f25430f;
            }
            xnVar.i(this.f25435r, wallPaper, true, Boolean.valueOf(this.f25436s), false);
        }
        if (this.N != this.f25436s) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.f25436s) {
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
                if (this.f25436s) {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str2);
                } else {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str);
                }
            }
            org.telegram.ui.ActionBar.h6.t(O0, false, this.f25436s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        zp zpVar = new zp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.m2 m2Var = this.X;
            if (m2Var instanceof wd1) {
                arrayList.addAll(((wd1) m2Var).S0());
                return arrayList;
            }
        }
        yi yiVar = this.Y;
        if (yiVar != null) {
            arrayList.addAll(yiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, zpVar, org.telegram.ui.ActionBar.h6.f20893h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20930j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f25437w, 16, new Class[]{a31.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20912i5));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.j6) obj).f21291o = this.f25434n;
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
        a50 a50Var = this.U;
        if (a50Var != null) {
            a50Var.b(true);
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
        org.telegram.ui.zn znVar = this.v;
        if (znVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !znVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            a50 a50Var = new a50(9, getContext(), znVar.getResourceProvider(), false);
            this.U = a50Var;
            a50Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new kp(this, 7), 1500L);
            this.container.addView(this.U, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
        }
    }

    public final void u(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cq.u(boolean):void");
    }

    public final void v() {
        if (x()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f20404a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f20404a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) {
                public final cq f29208b;

                {
                    this.f29208b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29208b.u(false);
                            return;
                        default:
                            this.f29208b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) {
                public final cq f29208b;

                {
                    this.f29208b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f29208b.u(false);
                            return;
                        default:
                            this.f29208b.dismiss();
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
            org.telegram.ui.ActionBar.h6.f20778b = false;
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f25434n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f25058a;
            if (b4Var.f20503a) {
                this.f25434n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f25434n.i(b4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            yi yiVar = this.Y;
            if (yiVar != null) {
                nj njVar = yiVar.f33325r0;
                if (njVar != null) {
                    boolean z10 = this.N;
                    bb bbVar = njVar.v;
                    ((ArrayList) bbVar.f24967e).clear();
                    WallpapersListActivity.z0((ArrayList) bbVar.f24967e, z10);
                    bbVar.l();
                }
                this.Y.e1();
            }
            aq aqVar = this.h;
            if (aqVar != null && aqVar.d != null) {
                for (int i10 = 0; i10 < aqVar.d.size(); i10++) {
                    ((bq) aqVar.d.get(i10)).f25060c = this.N ? 1 : 0;
                }
                aqVar.l();
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
            bVar = b4Var.f20505c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = fg.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.M.f25058a;
        if (b4Var2 != null) {
            bVar2 = b4Var2.f20505c;
        }
        if (bVar2 == null) {
            bVar2 = fg.b.d("❌");
        }
        return !fg.b.a(bVar, bVar2);
    }

    public final void y() {
        if (!this.f25424b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f25424b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new xp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new yp(this, chatThemeController));
            }
        }
    }

    public final void z(List list) {
        fg.b bVar;
        if (list != null && !list.isEmpty()) {
            bq bqVar = new bq((org.telegram.ui.ActionBar.b4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.b4 b4Var = this.f25434n.f44149f;
                this.W = b4Var;
                if (b4Var != null) {
                    b4Var.l();
                }
            }
            arrayList.add(0, bqVar);
            if (!this.V) {
                this.M = bqVar;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.W;
            if (b4Var2 != null) {
                bVar = b4Var2.f20505c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
                bq bqVar2 = new bq(b4Var3);
                b4Var3.n(this.currentAccount);
                bqVar2.f25060c = this.N ? 1 : 0;
                if (fg.b.a(b4Var3.f20505c, bVar)) {
                    arrayList.add(1, bqVar2);
                    z10 = true;
                } else {
                    arrayList.add(bqVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.b4 b4Var4 = this.W;
            if (b4Var4 != null && !z10) {
                bq bqVar3 = new bq(b4Var4);
                b4Var4.n(this.currentAccount);
                bqVar3.f25060c = this.N ? 1 : 0;
                arrayList.add(1, bqVar3);
            }
            aq aqVar = this.h;
            aqVar.d = arrayList;
            aqVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                C(false);
                this.f25437w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            G(true);
        }
    }
}
