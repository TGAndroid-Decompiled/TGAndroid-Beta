package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Dialog;
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
import org.telegram.ui.jd1;
public final class mp extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f29208f0 = 0;
    public final TextView B;
    public final hj0 C;
    public final ep D;
    public final fp E;
    public final View F;
    public final k6 G;
    public final k6 H;
    public final TextView I;
    public lp J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public wo O;
    public float P;
    public ValueAnimator Q;
    public m40 R;
    public boolean S;
    public org.telegram.ui.ActionBar.f4 T;
    public org.telegram.ui.ActionBar.p2 U;
    public mi V;
    public ag.l W;
    public k6 X;
    public boolean Y;
    public oq Z;
    public boolean f29209a0;
    public final ImageView f29210b;
    public boolean f29211b0;
    public final org.telegram.ui.ActionBar.i2 f29212c;
    public TL_stories.TL_premium_boostsStatus f29213c0;
    public final TextView d;
    public float f29214d0;
    public final TextView f29215e;
    public ValueAnimator f29216e0;
    public TLRPC.WallPaper f29217f;
    public final kp h;
    public final org.telegram.ui.vn f29218n;
    public final org.telegram.ui.ActionBar.f4 f29219r;
    public final boolean f29220s;
    public final org.telegram.ui.xn v;
    public final sl0 f29221w;
    public final f2.j0 f29222x;
    public final u00 f29223y;

    public mp(org.telegram.ui.xn xnVar, org.telegram.ui.vn vnVar) {
        super(xnVar.getParentActivity(), vnVar, true, false);
        String str;
        boolean z4;
        this.N = -1;
        this.f29209a0 = false;
        this.f29211b0 = false;
        this.f29214d0 = 0.0f;
        this.v = xnVar;
        this.f29218n = vnVar;
        this.f29219r = vnVar.f42178f;
        this.f29217f = vnVar.h;
        this.f29220s = org.telegram.ui.ActionBar.k6.I.q();
        kp kpVar = new kp(this.currentAccount, xnVar.a(), vnVar, 0);
        this.h = kpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.k6.f21751i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.k6.f21751i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.B = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21768j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f29210b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f29212c = i2Var;
        imageView.setImageDrawable(i2Var);
        imageView.setOnClickListener(new to(this, 1));
        frameLayout.addView(imageView, k7.c6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, k7.c6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        hj0 hj0Var = new hj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.C = hj0Var;
        this.K = !org.telegram.ui.ActionBar.k6.I.q();
        B(org.telegram.ui.ActionBar.k6.I.q(), false);
        hj0Var.H(true);
        hj0Var.h = true;
        hj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        ep epVar = new ep(this, getContext());
        this.D = epVar;
        epVar.setAnimation(hj0Var);
        epVar.setScaleType(ImageView.ScaleType.CENTER);
        epVar.setOnClickListener(new to(this, 2));
        frameLayout.addView(epVar, k7.c6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.E = new f2.k0(getContext());
        sl0 sl0Var = new sl0(getContext(), null);
        this.f29221w = sl0Var;
        sl0Var.setAdapter(kpVar);
        sl0Var.setDrawSelection(false);
        sl0Var.setClipChildren(false);
        sl0Var.setClipToPadding(false);
        sl0Var.setHasFixedSize(true);
        sl0Var.setItemAnimator(null);
        sl0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.j0 j0Var = new f2.j0(0, false);
        this.f29222x = j0Var;
        sl0Var.setLayoutManager(j0Var);
        sl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        sl0Var.setOnItemClickListener(new k(this, 3));
        sl0Var.setOnScrollListener(new fg.e2(this, 25));
        u00 u00Var = new u00(getContext(), this.resourcesProvider);
        this.f29223y = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        frameLayout.addView(u00Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(sl0Var, k7.c6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.F = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new to(this, 3));
        frameLayout.addView(view, k7.c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.I = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f29217f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.y(this, 8));
        frameLayout.addView(textView2, k7.c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var = new k6(getContext(), true, true, true);
        this.G = k6Var;
        k6Var.getDrawable().n(true);
        k6Var.f28285n = false;
        k6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.k6.Sh;
        k6Var.setTextColor(getThemedColor(i12));
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(k6Var, k7.c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var2 = new k6(getContext(), true, true, true);
        this.H = k6Var2;
        k6Var2.getDrawable().n(true);
        k6Var2.f28285n = false;
        k6Var2.setGravity(17);
        k6Var2.setTextColor(getThemedColor(i12));
        k6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        k6Var2.setAlpha(0.0f);
        k6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(k6Var2, k7.c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f29217f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new w2(10, this, xnVar));
            frameLayout.addView(textView3, k7.c6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f29215e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (xnVar.i() != null) {
                str = UserObject.getFirstName(xnVar.i());
            } else {
                TLRPC.Chat chat = xnVar.f43143e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, k7.c6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(mp mpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (mpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.xn xnVar = mpVar.v;
        fg.v0 v0Var = new fg.v0(22, mpVar.currentAccount, mpVar.getContext(), xnVar, mpVar.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(mpVar.f29213c0, true);
        v0Var.H1(mpVar.v.a());
        v0Var.N0 = new so(mpVar, 2);
        v0Var.show();
    }

    public static void n(mp mpVar, org.telegram.ui.xn xnVar) {
        if (mpVar.f29217f != null) {
            mpVar.f29217f = null;
            mpVar.dismiss();
            ChatThemeController.getInstance(mpVar.currentAccount).clearWallpaper(xnVar.a(), true);
            return;
        }
        mpVar.dismiss();
    }

    public static void o(mp mpVar, View view, int i10) {
        nq0 nq0Var;
        sl0 sl0Var = mpVar.f29221w;
        kp kpVar = mpVar.h;
        if (kpVar.d.get(i10) != mpVar.J && mpVar.O == null) {
            mpVar.J = (lp) kpVar.d.get(i10);
            mpVar.y();
            kpVar.E(i10);
            mpVar.containerView.postDelayed(new ye(mpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                w11 w11Var = (w11) sl0Var.getChildAt(i11);
                if (w11Var != view && (nq0Var = w11Var.G) != null) {
                    AndroidUtilities.cancelRunOnUIThread(nq0Var);
                    w11Var.G.run();
                }
            }
            if (!((lp) kpVar.d.get(i10)).f28819a.f21360a) {
                ((w11) view).d();
            }
            mpVar.E(true);
        }
    }

    public static void q(mp mpVar, jd1 jd1Var) {
        ?? obj = new Object();
        obj.f22158a = true;
        org.telegram.ui.xn xnVar = mpVar.v;
        jd1Var.f37961a.f37625a = xnVar.getResourceProvider();
        jd1Var.f37995m1 = new dp(mpVar);
        obj.f22160c = new jc(8);
        obj.d = new so(mpVar, 5);
        obj.f22159b = new so(mpVar, 6);
        obj.f22161e = true;
        mpVar.U = jd1Var;
        xnVar.showAsSheet(jd1Var, obj);
    }

    public final void A(boolean z4) {
        kp kpVar = this.h;
        ArrayList arrayList = kpVar.d;
        org.telegram.ui.ActionBar.f4 f4Var = this.T;
        f2.j0 j0Var = this.f29222x;
        sl0 sl0Var = this.f29221w;
        if (f4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (tf.b.a(((lp) arrayList.get(i10)).f28819a.f21362c, this.T.f21362c)) {
                        this.J = (lp) arrayList.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 != -1) {
                this.N = i10;
                kpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, kpVar.d.size() - 1);
                if (z4) {
                    sl0Var.x0(min);
                } else {
                    j0Var.h1(min, 0);
                }
            }
        } else {
            this.J = (lp) arrayList.get(0);
            kpVar.E(0);
            if (z4) {
                sl0Var.x0(0);
            } else {
                j0Var.h1(0, 0);
            }
        }
        y();
    }

    public final void B(boolean z4, boolean z10) {
        int i10;
        if (this.K != z4) {
            this.K = z4;
            ep epVar = this.D;
            hj0 hj0Var = this.C;
            int i11 = 0;
            if (z10) {
                if (z4) {
                    i11 = hj0Var.f27524e[0];
                }
                hj0Var.N(i11);
                if (epVar != null) {
                    epVar.d();
                    return;
                }
                return;
            }
            if (z4) {
                i10 = hj0Var.f27524e[0] - 1;
            } else {
                i10 = 0;
            }
            hj0Var.L(i10, false, true);
            hj0Var.N(i10);
            if (epVar != null) {
                epVar.invalidate();
            }
        }
    }

    public final void C(boolean z4) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        ep epVar = this.D;
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
        float f10 = iArr[0];
        float f11 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        wo woVar = new wo(this, getContext(), z4, canvas, (epVar.getMeasuredWidth() / 2.0f) + f10, (epVar.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 0);
        this.O = woVar;
        woVar.setOnTouchListener(new org.telegram.ui.ActionBar.s2(15));
        this.P = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new xo(this));
        this.Q.addListener(new a9(this, 10));
        this.Q.setDuration(400L);
        this.Q.setInterpolator(jt.f28179e);
        this.Q.start();
        frameLayout.addView(this.O, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new kh.f(19, this, z4));
    }

    public final void D() {
        TextView textView = this.f29215e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21876p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.k6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.k6.f21878p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.k6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.k6.f21768j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.k6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f29210b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.i2 i2Var = this.f29212c;
        i2Var.a(themedColor);
        i2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        this.D.setBackground(org.telegram.ui.ActionBar.k6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.f21822m5);
        TextView textView3 = this.I;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.k6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void E(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp.E(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new so(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.j6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.L) {
            org.telegram.ui.vn vnVar = this.f29218n;
            TLRPC.WallPaper wallPaper = vnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f29217f;
            }
            vnVar.i(this.f29219r, wallPaper, true, Boolean.valueOf(this.f29220s), false);
        }
        if (this.K != this.f29220s) {
            if (org.telegram.ui.ActionBar.k6.I.q() == this.f29220s) {
                N0 = org.telegram.ui.ActionBar.k6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.k6.N0(string) != null && !org.telegram.ui.ActionBar.k6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.k6.N0(string2) != null && org.telegram.ui.ActionBar.k6.N0(string2).q()) {
                    str2 = string2;
                }
                if (this.f29220s) {
                    N0 = org.telegram.ui.ActionBar.k6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.k6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.k6.t(N0, false, this.f29220s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ip ipVar = new ip(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f43111b7) {
            org.telegram.ui.ActionBar.p2 p2Var = this.U;
            if (p2Var instanceof jd1) {
                arrayList.addAll(((jd1) p2Var).S0());
                return arrayList;
            }
        }
        mi miVar = this.V;
        if (miVar != null) {
            arrayList.addAll(miVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, ipVar, org.telegram.ui.ActionBar.k6.f21733h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21768j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f29221w, 16, new Class[]{w11.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21751i5));
        int i11 = org.telegram.ui.ActionBar.k6.Oh;
        View view = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.m6) obj).f22153o = this.f29218n;
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
    public final void onContainerTranslationYChanged(float f10) {
        m40 m40Var = this.R;
        if (m40Var != null) {
            m40Var.b(true);
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
        this.L = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.xn xnVar = this.v;
        if (xnVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !xnVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            m40 m40Var = new m40(9, getContext(), xnVar.getResourceProvider(), false);
            this.R = m40Var;
            m40Var.setVisibility(4);
            this.R.setShowingDuration(5000L);
            this.R.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.K) {
                this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new so(this, 7), 1500L);
            this.container.addView(this.R, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.c2(this) {
                public final mp f31944b;

                {
                    this.f31944b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f31944b.s(false);
                            return;
                        default:
                            this.f31944b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.c2(this) {
                public final mp f31944b;

                {
                    this.f31944b = this;
                }

                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f31944b.s(false);
                            return;
                        default:
                            this.f31944b.dismiss();
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
        if (!isDismissed() && !this.L) {
            org.telegram.ui.ActionBar.k6.f21618b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f29218n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.J.f28819a;
            if (f4Var.f21360a) {
                this.f29218n.i(null, wallPaper2, false, Boolean.valueOf(this.K), true);
            } else {
                this.f29218n.i(f4Var, wallPaper2, false, Boolean.valueOf(this.K), true);
            }
            mi miVar = this.V;
            if (miVar != null) {
                bj bjVar = miVar.f29095o0;
                if (bjVar != null) {
                    boolean z4 = this.K;
                    ra raVar = bjVar.v;
                    ((ArrayList) raVar.f30704e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.f30704e, z4);
                    raVar.l();
                }
                this.V.c1();
            }
            kp kpVar = this.h;
            if (kpVar != null && kpVar.d != null) {
                for (int i10 = 0; i10 < kpVar.d.size(); i10++) {
                    ((lp) kpVar.d.get(i10)).f28821c = this.K ? 1 : 0;
                }
                kpVar.l();
            }
        }
    }

    public final boolean v() {
        tf.b bVar;
        if (this.J == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.T;
        tf.b bVar2 = null;
        if (f4Var != null) {
            bVar = f4Var.f21362c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = tf.b.d("❌");
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.J.f28819a;
        if (f4Var2 != null) {
            bVar2 = f4Var2.f21362c;
        }
        if (bVar2 == null) {
            bVar2 = tf.b.d("❌");
        }
        return !tf.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.Y) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.Y = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new gp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new hp(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        tf.b bVar;
        if (list != null && !list.isEmpty()) {
            lp lpVar = new lp((org.telegram.ui.ActionBar.f4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.S) {
                org.telegram.ui.ActionBar.f4 f4Var = this.f29218n.f42178f;
                this.T = f4Var;
                if (f4Var != null) {
                    f4Var.l();
                }
            }
            arrayList.add(0, lpVar);
            if (!this.S) {
                this.J = lpVar;
            }
            org.telegram.ui.ActionBar.f4 f4Var2 = this.T;
            if (f4Var2 != null) {
                bVar = f4Var2.f21362c;
            } else {
                bVar = null;
            }
            boolean z4 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.f4 f4Var3 = (org.telegram.ui.ActionBar.f4) list.get(i10);
                lp lpVar2 = new lp(f4Var3);
                f4Var3.n(this.currentAccount);
                lpVar2.f28821c = this.K ? 1 : 0;
                if (tf.b.a(f4Var3.f21362c, bVar)) {
                    arrayList.add(1, lpVar2);
                    z4 = true;
                } else {
                    arrayList.add(lpVar2);
                }
            }
            org.telegram.ui.ActionBar.f4 f4Var4 = this.T;
            if (f4Var4 != null && !z4) {
                lp lpVar3 = new lp(f4Var4);
                f4Var4.n(this.currentAccount);
                lpVar3.f28821c = this.K ? 1 : 0;
                arrayList.add(1, lpVar3);
            }
            kp kpVar = this.h;
            kpVar.d = arrayList;
            kpVar.l();
            this.D.setVisibility(0);
            if (!this.S) {
                A(false);
                this.f29221w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.S = true;
            E(true);
        }
    }

    public final void y() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.L) {
            this.M = false;
            this.v.getClass();
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f29217f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.J.f28819a;
            if (f4Var.f21360a) {
                this.f29218n.i(null, wallPaper2, true, Boolean.valueOf(this.K), false);
                return;
            }
            this.f29218n.i(f4Var, wallPaper2, true, Boolean.valueOf(this.K), false);
        }
    }
}
