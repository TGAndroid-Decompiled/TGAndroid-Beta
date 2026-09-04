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
public final class lp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f28254i0 = 0;
    public final TextView E;
    public final xi0 F;
    public final ep G;
    public final fp H;
    public final View I;
    public final q6 J;
    public final q6 K;
    public final TextView L;
    public kp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public di.xb R;
    public float S;
    public ValueAnimator T;
    public i40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.d4 W;
    public org.telegram.ui.ActionBar.n2 X;
    public vi Y;
    public ah.w Z;
    public q6 f28255a0;
    public final ImageView f28256b;
    public boolean f28257b0;
    public final org.telegram.ui.ActionBar.g2 f28258c;
    public nq f28259c0;
    public final TextView d;
    public boolean f28260d0;
    public final TextView f28261e;
    public boolean f28262e0;
    public TLRPC.WallPaper f28263f;
    public TL_stories.TL_premium_boostsStatus f28264f0;
    public float f28265g0;
    public final jp h;
    public ValueAnimator f28266h0;
    public final org.telegram.ui.ao f28267n;
    public final org.telegram.ui.ActionBar.d4 f28268r;
    public final boolean f28269s;
    public final org.telegram.ui.co v;
    public final ll0 f28270w;
    public final s4.c0 f28271x;
    public final t00 f28272y;

    public lp(org.telegram.ui.co coVar, org.telegram.ui.ao aoVar) {
        super(1, (Context) coVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) aoVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f28260d0 = false;
        this.f28262e0 = false;
        this.f28265g0 = 0.0f;
        this.v = coVar;
        this.f28267n = aoVar;
        this.f28268r = aoVar.f34490f;
        this.f28263f = aoVar.h;
        this.f28269s = org.telegram.ui.ActionBar.j6.I.q();
        jp jpVar = new jp(this.currentAccount, coVar.a(), aoVar, 0);
        this.h = jpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.j6.f20752i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f20752i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20770j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f28256b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f28258c = g2Var;
        imageView.setImageDrawable(g2Var);
        imageView.setOnClickListener(new uo(this, 1));
        frameLayout.addView(imageView, w7.x5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.x5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        xi0 xi0Var = new xi0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = xi0Var;
        this.N = !org.telegram.ui.ActionBar.j6.I.q();
        B(org.telegram.ui.ActionBar.j6.I.q(), false);
        xi0Var.H(true);
        xi0Var.h = true;
        xi0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        ep epVar = new ep(this, getContext());
        this.G = epVar;
        epVar.setAnimation(xi0Var);
        epVar.setScaleType(ImageView.ScaleType.CENTER);
        epVar.setOnClickListener(new uo(this, 2));
        frameLayout.addView(epVar, w7.x5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new s4.d0(getContext());
        ll0 ll0Var = new ll0(getContext(), null);
        this.f28270w = ll0Var;
        ll0Var.setAdapter(jpVar);
        ll0Var.setDrawSelection(false);
        ll0Var.setClipChildren(false);
        ll0Var.setClipToPadding(false);
        ll0Var.setHasFixedSize(true);
        ll0Var.setItemAnimator(null);
        ll0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.f28271x = c0Var;
        ll0Var.setLayoutManager(c0Var);
        ll0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ll0Var.setOnItemClickListener(new k(this, 3));
        ll0Var.setOnScrollListener(new ah.e0(this, 25));
        t00 t00Var = new t00(getContext(), this.resourcesProvider);
        this.f28272y = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        frameLayout.addView(t00Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(ll0Var, w7.x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new uo(this, 3));
        frameLayout.addView(view, w7.x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f28263f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var = new q6(getContext(), true, true, true);
        this.J = q6Var;
        q6Var.getDrawable().n(true);
        q6Var.f29600n = false;
        q6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.Sh;
        q6Var.setTextColor(getThemedColor(i12));
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(q6Var, w7.x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var2 = new q6(getContext(), true, true, true);
        this.K = q6Var2;
        q6Var2.getDrawable().n(true);
        q6Var2.f29600n = false;
        q6Var2.setGravity(17);
        q6Var2.setTextColor(getThemedColor(i12));
        q6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        q6Var2.setAlpha(0.0f);
        q6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(q6Var2, w7.x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f28263f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.rf(this, coVar));
            frameLayout.addView(textView3, w7.x5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f28261e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (coVar.i() != null) {
                str = UserObject.getFirstName(coVar.i());
            } else {
                TLRPC.Chat chat = coVar.f35237e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.x5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        F(false);
    }

    public static void m(lp lpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (lpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.co coVar = lpVar.v;
        sg.k0 k0Var = new sg.k0(22, lpVar.currentAccount, lpVar.getContext(), coVar, lpVar.resourcesProvider);
        k0Var.G1(canApplyBoost);
        k0Var.F1(lpVar.f28264f0, true);
        k0Var.H1(lpVar.v.a());
        k0Var.Q0 = new to(lpVar, 2);
        k0Var.show();
    }

    public static void n(lp lpVar, org.telegram.ui.co coVar) {
        if (lpVar.f28263f != null) {
            lpVar.f28263f = null;
            lpVar.dismiss();
            ChatThemeController.getInstance(lpVar.currentAccount).clearWallpaper(coVar.a(), true);
            return;
        }
        lpVar.dismiss();
    }

    public static void o(lp lpVar, View view, int i10) {
        jq0 jq0Var;
        ll0 ll0Var = lpVar.f28270w;
        jp jpVar = lpVar.h;
        if (jpVar.d.get(i10) != lpVar.M && lpVar.R == null) {
            lpVar.M = (kp) jpVar.d.get(i10);
            lpVar.y();
            jpVar.E(i10);
            lpVar.containerView.postDelayed(new jf(lpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < ll0Var.getChildCount(); i11++) {
                t11 t11Var = (t11) ll0Var.getChildAt(i11);
                if (t11Var != view && (jq0Var = t11Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(jq0Var);
                    t11Var.J.run();
                }
            }
            if (!((kp) jpVar.d.get(i10)).f27882a.f20361a) {
                ((t11) view).d();
            }
            lpVar.F(true);
        }
    }

    public static void q(lp lpVar, wd1 wd1Var) {
        ?? obj = new Object();
        obj.f21142a = true;
        org.telegram.ui.co coVar = lpVar.v;
        wd1Var.f41914a.f41898a = coVar.getResourceProvider();
        wd1Var.f41958p1 = new dp(lpVar);
        obj.f21144c = new ue(4);
        obj.d = new to(lpVar, 5);
        obj.f21143b = new to(lpVar, 6);
        obj.f21145e = true;
        lpVar.X = wd1Var;
        coVar.showAsSheet(wd1Var, obj);
    }

    public final void A(boolean z10) {
        jp jpVar = this.h;
        ArrayList arrayList = jpVar.d;
        org.telegram.ui.ActionBar.d4 d4Var = this.W;
        s4.c0 c0Var = this.f28271x;
        ll0 ll0Var = this.f28270w;
        if (d4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (gg.b.a(((kp) arrayList.get(i10)).f27882a.f20363c, this.W.f20363c)) {
                        this.M = (kp) arrayList.get(i10);
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
                jpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, jpVar.d.size() - 1);
                if (z10) {
                    ll0Var.x0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (kp) arrayList.get(0);
            jpVar.E(0);
            if (z10) {
                ll0Var.x0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        y();
    }

    public final void B(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            ep epVar = this.G;
            xi0 xi0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = xi0Var.f32557e[0];
                }
                xi0Var.N(i11);
                if (epVar != null) {
                    epVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = xi0Var.f32557e[0] - 1;
            } else {
                i10 = 0;
            }
            xi0Var.L(i10, false, true);
            xi0Var.N(i10);
            if (epVar != null) {
                epVar.invalidate();
            }
        }
    }

    public final void C(boolean z10) {
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
        ep epVar = this.G;
        epVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        epVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        epVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        di.xb xbVar = new di.xb(this, getContext(), z10, canvas, (epVar.getMeasuredWidth() / 2.0f) + f7, (epVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = xbVar;
        xbVar.setOnTouchListener(new ci.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new xo(this));
        this.T.addListener(new j6(this, 14));
        this.T.setDuration(400L);
        this.T.setInterpolator(jt.f27568e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ah.u(22, this, z10));
    }

    public final void D() {
        TextView textView = this.f28261e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.f20880p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f28256b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.f28258c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f20826m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void F(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp.F(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new to(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.ao aoVar = this.f28267n;
            TLRPC.WallPaper wallPaper = aoVar.h;
            if (wallPaper == null) {
                wallPaper = this.f28263f;
            }
            aoVar.i(this.f28268r, wallPaper, true, Boolean.valueOf(this.f28269s), false);
        }
        if (this.N != this.f28269s) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f28269s) {
                N0 = org.telegram.ui.ActionBar.j6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string) != null && !org.telegram.ui.ActionBar.j6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.j6.N0(string2) != null && org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                    str2 = string2;
                }
                if (this.f28269s) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N0, false, this.f28269s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ip ipVar = new ip(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.X;
            if (n2Var instanceof wd1) {
                arrayList.addAll(((wd1) n2Var).S0());
                return arrayList;
            }
        }
        vi viVar = this.Y;
        if (viVar != null) {
            arrayList.addAll(viVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, ipVar, org.telegram.ui.ActionBar.j6.f20734h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20770j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f28270w, 16, new Class[]{t11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20752i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.l6) obj).f21185o = this.f28267n;
        }
        return arrayList;
    }

    @Override
    public final void onBackPressed() {
        t();
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && v()) {
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
        i40 i40Var = this.U;
        if (i40Var != null) {
            i40Var.b(true);
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
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.co coVar = this.v;
        if (coVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !coVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            i40 i40Var = new i40(9, getContext(), coVar.getResourceProvider(), false);
            this.U = i40Var;
            i40Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new to(this, 7), 1500L);
            this.container.addView(this.U, w7.x5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f20198a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) {
                public final lp f32303b;

                {
                    this.f32303b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f32303b.s(false);
                            return;
                        default:
                            this.f32303b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) {
                public final lp f32303b;

                {
                    this.f32303b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f32303b.s(false);
                            return;
                        default:
                            this.f32303b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
            return;
        }
        dismiss();
    }

    public final void u() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            org.telegram.ui.ActionBar.j6.f20619b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f28267n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = this.M.f27882a;
            if (d4Var.f20361a) {
                this.f28267n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f28267n.i(d4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            vi viVar = this.Y;
            if (viVar != null) {
                jj jjVar = viVar.f31315r0;
                if (jjVar != null) {
                    boolean z10 = this.N;
                    za zaVar = jjVar.v;
                    ((ArrayList) zaVar.f33113e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.f33113e, z10);
                    zaVar.l();
                }
                this.Y.c1();
            }
            jp jpVar = this.h;
            if (jpVar != null && jpVar.d != null) {
                for (int i10 = 0; i10 < jpVar.d.size(); i10++) {
                    ((kp) jpVar.d.get(i10)).f27884c = this.N ? 1 : 0;
                }
                jpVar.l();
            }
        }
    }

    public final boolean v() {
        gg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.d4 d4Var = this.W;
        gg.b bVar2 = null;
        if (d4Var != null) {
            bVar = d4Var.f20363c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.d4 d4Var2 = this.M.f27882a;
        if (d4Var2 != null) {
            bVar2 = d4Var2.f20363c;
        }
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.f28257b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f28257b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new gp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new hp(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        gg.b bVar;
        if (list != null && !list.isEmpty()) {
            kp kpVar = new kp((org.telegram.ui.ActionBar.d4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.d4 d4Var = this.f28267n.f34490f;
                this.W = d4Var;
                if (d4Var != null) {
                    d4Var.l();
                }
            }
            arrayList.add(0, kpVar);
            if (!this.V) {
                this.M = kpVar;
            }
            org.telegram.ui.ActionBar.d4 d4Var2 = this.W;
            if (d4Var2 != null) {
                bVar = d4Var2.f20363c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.d4 d4Var3 = (org.telegram.ui.ActionBar.d4) list.get(i10);
                kp kpVar2 = new kp(d4Var3);
                d4Var3.n(this.currentAccount);
                kpVar2.f27884c = this.N ? 1 : 0;
                if (gg.b.a(d4Var3.f20363c, bVar)) {
                    arrayList.add(1, kpVar2);
                    z10 = true;
                } else {
                    arrayList.add(kpVar2);
                }
            }
            org.telegram.ui.ActionBar.d4 d4Var4 = this.W;
            if (d4Var4 != null && !z10) {
                kp kpVar3 = new kp(d4Var4);
                d4Var4.n(this.currentAccount);
                kpVar3.f27884c = this.N ? 1 : 0;
                arrayList.add(1, kpVar3);
            }
            jp jpVar = this.h;
            jpVar.d = arrayList;
            jpVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                A(false);
                this.f28270w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            F(true);
        }
    }

    public final void y() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            this.P = false;
            this.v.getClass();
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f28263f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = this.M.f27882a;
            if (d4Var.f20361a) {
                this.f28267n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f28267n.i(d4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }
}
