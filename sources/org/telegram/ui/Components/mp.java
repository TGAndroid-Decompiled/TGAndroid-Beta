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
import org.telegram.ui.xd1;
public final class mp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26494i0 = 0;
    public final TextView E;
    public final kj0 F;
    public final fp G;
    public final gp H;
    public final View I;
    public final o6 J;
    public final o6 K;
    public final TextView L;
    public lp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci.wb R;
    public float S;
    public ValueAnimator T;
    public i40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.d4 W;
    public org.telegram.ui.ActionBar.n2 X;
    public vi Y;
    public ci.n6 Z;
    public o6 f26495a0;
    public final ImageView f26496b;
    public boolean f26497b0;
    public final org.telegram.ui.ActionBar.g2 f26498c;
    public oq f26499c0;
    public final TextView d;
    public boolean f26500d0;
    public final TextView e;
    public boolean f26501e0;
    public TLRPC.WallPaper f26502f;
    public TL_stories.TL_premium_boostsStatus f26503f0;
    public float f26504g0;
    public final kp h;
    public ValueAnimator f26505h0;
    public final org.telegram.ui.xn f26506n;
    public final org.telegram.ui.ActionBar.d4 f26507r;
    public final boolean f26508s;
    public final org.telegram.ui.zn v;
    public final yl0 f26509w;
    public final s4.c0 f26510x;
    public final t00 f26511y;

    public mp(org.telegram.ui.zn znVar, org.telegram.ui.xn xnVar) {
        super(1, (Context) znVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) xnVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f26500d0 = false;
        this.f26501e0 = false;
        this.f26504g0 = 0.0f;
        this.v = znVar;
        this.f26506n = xnVar;
        this.f26507r = xnVar.f39650f;
        this.f26502f = xnVar.h;
        this.f26508s = org.telegram.ui.ActionBar.j6.I.q();
        kp kpVar = new kp(this.currentAccount, znVar.a(), xnVar, 0);
        this.h = kpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.j6.f19198i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19198i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19216j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f26496b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f26498c = g2Var;
        imageView.setImageDrawable(g2Var);
        imageView.setOnClickListener(new vo(this, 1));
        frameLayout.addView(imageView, w7.y5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        kj0 kj0Var = new kj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = kj0Var;
        this.N = !org.telegram.ui.ActionBar.j6.I.q();
        A(org.telegram.ui.ActionBar.j6.I.q(), false);
        kj0Var.J(true);
        kj0Var.h = true;
        kj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        fp fpVar = new fp(this, getContext());
        this.G = fpVar;
        fpVar.setAnimation(kj0Var);
        fpVar.setScaleType(ImageView.ScaleType.CENTER);
        fpVar.setOnClickListener(new vo(this, 2));
        frameLayout.addView(fpVar, w7.y5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new s4.d0(getContext());
        yl0 yl0Var = new yl0(getContext(), null);
        this.f26509w = yl0Var;
        yl0Var.setAdapter(kpVar);
        yl0Var.setDrawSelection(false);
        yl0Var.setClipChildren(false);
        yl0Var.setClipToPadding(false);
        yl0Var.setHasFixedSize(true);
        yl0Var.setItemAnimator(null);
        yl0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.f26510x = c0Var;
        yl0Var.setLayoutManager(c0Var);
        yl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        yl0Var.setOnItemClickListener(new j(this, 3));
        yl0Var.setOnScrollListener(new ai.r(this, 25));
        t00 t00Var = new t00(getContext(), this.resourcesProvider);
        this.f26511y = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        frameLayout.addView(t00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(yl0Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new vo(this, 3));
        frameLayout.addView(view, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f26502f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var = new o6(getContext(), true, true, true);
        this.J = o6Var;
        o6Var.getDrawable().n(true);
        o6Var.f26997n = false;
        o6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.Sh;
        o6Var.setTextColor(getThemedColor(i12));
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(o6Var, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var2 = new o6(getContext(), true, true, true);
        this.K = o6Var2;
        o6Var2.getDrawable().n(true);
        o6Var2.f26997n = false;
        o6Var2.setGravity(17);
        o6Var2.setTextColor(getThemedColor(i12));
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var2.setAlpha(0.0f);
        o6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(o6Var2, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f26502f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.sf(this, znVar));
            frameLayout.addView(textView3, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (znVar.i() != null) {
                str = UserObject.getFirstName(znVar.i());
            } else {
                TLRPC.Chat chat = znVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(mp mpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (mpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.zn znVar = mpVar.v;
        rg.j0 j0Var = new rg.j0(22, mpVar.currentAccount, mpVar.getContext(), znVar, mpVar.resourcesProvider);
        j0Var.G1(canApplyBoost);
        j0Var.F1(mpVar.f26503f0, true);
        j0Var.H1(mpVar.v.a());
        j0Var.Q0 = new uo(mpVar, 2);
        j0Var.show();
    }

    public static void n(mp mpVar, org.telegram.ui.zn znVar) {
        if (mpVar.f26502f != null) {
            mpVar.f26502f = null;
            mpVar.dismiss();
            ChatThemeController.getInstance(mpVar.currentAccount).clearWallpaper(znVar.a(), true);
            return;
        }
        mpVar.dismiss();
    }

    public static void o(mp mpVar, View view, int i10) {
        yq0 yq0Var;
        yl0 yl0Var = mpVar.f26509w;
        kp kpVar = mpVar.h;
        if (kpVar.d.get(i10) != mpVar.M && mpVar.R == null) {
            mpVar.M = (lp) kpVar.d.get(i10);
            mpVar.y();
            kpVar.E(i10);
            mpVar.containerView.postDelayed(new hf(mpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < yl0Var.getChildCount(); i11++) {
                k21 k21Var = (k21) yl0Var.getChildAt(i11);
                if (k21Var != view && (yq0Var = k21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(yq0Var);
                    k21Var.J.run();
                }
            }
            if (!((lp) kpVar.d.get(i10)).f26155a.f18822a) {
                ((k21) view).d();
            }
            mpVar.E(true);
        }
    }

    public static void q(mp mpVar, xd1 xd1Var) {
        ?? obj = new Object();
        obj.f19592a = true;
        org.telegram.ui.zn znVar = mpVar.v;
        xd1Var.f39494a.f39482a = znVar.getResourceProvider();
        xd1Var.f39537p1 = new ep(mpVar);
        obj.f19594c = new sh(3);
        obj.d = new uo(mpVar, 5);
        obj.f19593b = new uo(mpVar, 6);
        obj.e = true;
        mpVar.X = xd1Var;
        znVar.showAsSheet(xd1Var, obj);
    }

    public final void A(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            fp fpVar = this.G;
            kj0 kj0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = kj0Var.e[0];
                }
                kj0Var.P(i11);
                if (fpVar != null) {
                    fpVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = kj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            kj0Var.N(i10, false, true);
            kj0Var.P(i10);
            if (fpVar != null) {
                fpVar.invalidate();
            }
        }
    }

    public final void B(boolean z10) {
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
        fp fpVar = this.G;
        fpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        fpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        fpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ci.wb wbVar = new ci.wb(this, getContext(), z10, canvas, (fpVar.getMeasuredWidth() / 2.0f) + f7, (fpVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = wbVar;
        wbVar.setOnTouchListener(new bi.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new yo(this));
        this.T.addListener(new q8(this, 11));
        this.T.setDuration(400L);
        this.T.setInterpolator(kt.e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bi.f(22, this, z10));
    }

    public final void D() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.f19330p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f19216j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f26496b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.f26498c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f19273m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void E(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp.E(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new uo(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.xn xnVar = this.f26506n;
            TLRPC.WallPaper wallPaper = xnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f26502f;
            }
            xnVar.i(this.f26507r, wallPaper, true, Boolean.valueOf(this.f26508s), false);
        }
        if (this.N != this.f26508s) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f26508s) {
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
                if (this.f26508s) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N0, false, this.f26508s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        jp jpVar = new jp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.X;
            if (n2Var instanceof xd1) {
                arrayList.addAll(((xd1) n2Var).S0());
                return arrayList;
            }
        }
        vi viVar = this.Y;
        if (viVar != null) {
            arrayList.addAll(viVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, jpVar, org.telegram.ui.ActionBar.j6.f19180h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19216j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26509w, 16, new Class[]{k21.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19198i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.l6) obj).f19632o = this.f26506n;
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
        org.telegram.ui.zn znVar = this.v;
        if (znVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !znVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            i40 i40Var = new i40(9, getContext(), znVar.getResourceProvider(), false);
            this.U = i40Var;
            i40Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new uo(this, 7), 1500L);
            this.container.addView(this.U, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f18669a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f18669a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) {
                public final mp f30359b;

                {
                    this.f30359b = this;
                }

                @Override
                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f30359b.s(false);
                            return;
                        default:
                            this.f30359b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) {
                public final mp f30359b;

                {
                    this.f30359b = this;
                }

                @Override
                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f30359b.s(false);
                            return;
                        default:
                            this.f30359b.dismiss();
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
            org.telegram.ui.ActionBar.j6.f19065b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f26506n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = this.M.f26155a;
            if (d4Var.f18822a) {
                this.f26506n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f26506n.i(d4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            vi viVar = this.Y;
            if (viVar != null) {
                jj jjVar = viVar.f29132r0;
                if (jjVar != null) {
                    boolean z10 = this.N;
                    ya yaVar = jjVar.v;
                    ((ArrayList) yaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                    yaVar.l();
                }
                this.Y.c1();
            }
            kp kpVar = this.h;
            if (kpVar != null && kpVar.d != null) {
                for (int i10 = 0; i10 < kpVar.d.size(); i10++) {
                    ((lp) kpVar.d.get(i10)).f26157c = this.N ? 1 : 0;
                }
                kpVar.l();
            }
        }
    }

    public final boolean v() {
        fg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.d4 d4Var = this.W;
        fg.b bVar2 = null;
        if (d4Var != null) {
            bVar = d4Var.f18824c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = fg.b.d("❌");
        }
        org.telegram.ui.ActionBar.d4 d4Var2 = this.M.f26155a;
        if (d4Var2 != null) {
            bVar2 = d4Var2.f18824c;
        }
        if (bVar2 == null) {
            bVar2 = fg.b.d("❌");
        }
        return !fg.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.f26497b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f26497b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new hp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new ip(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        fg.b bVar;
        if (list != null && !list.isEmpty()) {
            lp lpVar = new lp((org.telegram.ui.ActionBar.d4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.d4 d4Var = this.f26506n.f39650f;
                this.W = d4Var;
                if (d4Var != null) {
                    d4Var.l();
                }
            }
            arrayList.add(0, lpVar);
            if (!this.V) {
                this.M = lpVar;
            }
            org.telegram.ui.ActionBar.d4 d4Var2 = this.W;
            if (d4Var2 != null) {
                bVar = d4Var2.f18824c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.d4 d4Var3 = (org.telegram.ui.ActionBar.d4) list.get(i10);
                lp lpVar2 = new lp(d4Var3);
                d4Var3.n(this.currentAccount);
                lpVar2.f26157c = this.N ? 1 : 0;
                if (fg.b.a(d4Var3.f18824c, bVar)) {
                    arrayList.add(1, lpVar2);
                    z10 = true;
                } else {
                    arrayList.add(lpVar2);
                }
            }
            org.telegram.ui.ActionBar.d4 d4Var4 = this.W;
            if (d4Var4 != null && !z10) {
                lp lpVar3 = new lp(d4Var4);
                d4Var4.n(this.currentAccount);
                lpVar3.f26157c = this.N ? 1 : 0;
                arrayList.add(1, lpVar3);
            }
            kp kpVar = this.h;
            kpVar.d = arrayList;
            kpVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                z(false);
                this.f26509w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            E(true);
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
                wallPaper = this.f26502f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.d4 d4Var = this.M.f26155a;
            if (d4Var.f18822a) {
                this.f26506n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f26506n.i(d4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void z(boolean z10) {
        kp kpVar = this.h;
        ArrayList arrayList = kpVar.d;
        org.telegram.ui.ActionBar.d4 d4Var = this.W;
        s4.c0 c0Var = this.f26510x;
        yl0 yl0Var = this.f26509w;
        if (d4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (fg.b.a(((lp) arrayList.get(i10)).f26155a.f18824c, this.W.f18824c)) {
                        this.M = (lp) arrayList.get(i10);
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
                kpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, kpVar.d.size() - 1);
                if (z10) {
                    yl0Var.y0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (lp) arrayList.get(0);
            kpVar.E(0);
            if (z10) {
                yl0Var.y0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        y();
    }
}
