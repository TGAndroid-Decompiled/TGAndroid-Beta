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
import org.telegram.ui.od1;
public final class op extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27066i0 = 0;
    public final TextView E;
    public final jj0 F;
    public final hp G;
    public final ip H;
    public final View I;
    public final p6 J;
    public final p6 K;
    public final TextView L;
    public np M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ci.tb R;
    public float S;
    public ValueAnimator T;
    public k40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.b4 W;
    public org.telegram.ui.ActionBar.m2 X;
    public wi Y;
    public ci.m6 Z;
    public p6 f27067a0;
    public final ImageView f27068b;
    public boolean f27069b0;
    public final org.telegram.ui.ActionBar.f2 f27070c;
    public qq f27071c0;
    public final TextView d;
    public boolean f27072d0;
    public final TextView e;
    public boolean f27073e0;
    public TLRPC.WallPaper f27074f;
    public TL_stories.TL_premium_boostsStatus f27075f0;
    public float f27076g0;
    public final mp h;
    public ValueAnimator f27077h0;
    public final org.telegram.ui.un f27078n;
    public final org.telegram.ui.ActionBar.b4 f27079r;
    public final boolean f27080s;
    public final org.telegram.ui.wn v;
    public final xl0 f27081w;
    public final s4.c0 f27082x;
    public final v00 f27083y;

    public op(org.telegram.ui.wn wnVar, org.telegram.ui.un unVar) {
        super(1, (Context) wnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) unVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f27072d0 = false;
        this.f27073e0 = false;
        this.f27076g0 = 0.0f;
        this.v = wnVar;
        this.f27078n = unVar;
        this.f27079r = unVar.f38505f;
        this.f27074f = unVar.h;
        this.f27080s = org.telegram.ui.ActionBar.h6.I.q();
        mp mpVar = new mp(this.currentAccount, wnVar.a(), unVar, 0);
        this.h = mpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.h6.f19147i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f19147i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f19165j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f27068b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.f2 f2Var = new org.telegram.ui.ActionBar.f2(false);
        this.f27070c = f2Var;
        imageView.setImageDrawable(f2Var);
        imageView.setOnClickListener(new xo(this, 1));
        frameLayout.addView(imageView, w7.y5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.y5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        jj0 jj0Var = new jj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = jj0Var;
        this.N = !org.telegram.ui.ActionBar.h6.I.q();
        A(org.telegram.ui.ActionBar.h6.I.q(), false);
        jj0Var.J(true);
        jj0Var.h = true;
        jj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        hp hpVar = new hp(this, getContext());
        this.G = hpVar;
        hpVar.setAnimation(jj0Var);
        hpVar.setScaleType(ImageView.ScaleType.CENTER);
        hpVar.setOnClickListener(new xo(this, 2));
        frameLayout.addView(hpVar, w7.y5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new s4.d0(getContext());
        xl0 xl0Var = new xl0(getContext(), null);
        this.f27081w = xl0Var;
        xl0Var.setAdapter(mpVar);
        xl0Var.setDrawSelection(false);
        xl0Var.setClipChildren(false);
        xl0Var.setClipToPadding(false);
        xl0Var.setHasFixedSize(true);
        xl0Var.setItemAnimator(null);
        xl0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.f27082x = c0Var;
        xl0Var.setLayoutManager(c0Var);
        xl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        xl0Var.setOnItemClickListener(new j(this, 3));
        xl0Var.setOnScrollListener(new ai.r(this, 24));
        v00 v00Var = new v00(getContext(), this.resourcesProvider);
        this.f27083y = v00Var;
        v00Var.setViewType(14);
        v00Var.setVisibility(0);
        frameLayout.addView(v00Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(xl0Var, w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.h6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new xo(this, 3));
        frameLayout.addView(view, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f27074f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        p6 p6Var = new p6(getContext(), true, true, true);
        this.J = p6Var;
        p6Var.getDrawable().n(true);
        p6Var.f27231n = false;
        p6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        p6Var.setTextColor(getThemedColor(i12));
        p6Var.setTextSize(AndroidUtilities.dp(15.0f));
        p6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(p6Var, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        p6 p6Var2 = new p6(getContext(), true, true, true);
        this.K = p6Var2;
        p6Var2.getDrawable().n(true);
        p6Var2.f27231n = false;
        p6Var2.setGravity(17);
        p6Var2.setTextColor(getThemedColor(i12));
        p6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        p6Var2.setAlpha(0.0f);
        p6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(p6Var2, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f27074f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.pf(this, wnVar));
            frameLayout.addView(textView3, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
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
            frameLayout.addView(textView4, w7.y5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        E();
        F(false);
    }

    public static void m(op opVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (opVar.getContext() == null) {
            return;
        }
        org.telegram.ui.wn wnVar = opVar.v;
        rg.j0 j0Var = new rg.j0(22, opVar.currentAccount, opVar.getContext(), wnVar, opVar.resourcesProvider);
        j0Var.G1(canApplyBoost);
        j0Var.F1(opVar.f27075f0, true);
        j0Var.H1(opVar.v.a());
        j0Var.Q0 = new wo(opVar, 2);
        j0Var.show();
    }

    public static void n(op opVar, org.telegram.ui.wn wnVar) {
        if (opVar.f27074f != null) {
            opVar.f27074f = null;
            opVar.dismiss();
            ChatThemeController.getInstance(opVar.currentAccount).clearWallpaper(wnVar.a(), true);
            return;
        }
        opVar.dismiss();
    }

    public static void o(op opVar, View view, int i10) {
        xq0 xq0Var;
        xl0 xl0Var = opVar.f27081w;
        mp mpVar = opVar.h;
        if (mpVar.d.get(i10) != opVar.M && opVar.R == null) {
            opVar.M = (np) mpVar.d.get(i10);
            opVar.y();
            mpVar.E(i10);
            opVar.containerView.postDelayed(new jf(opVar, i10, 1), 100L);
            for (int i11 = 0; i11 < xl0Var.getChildCount(); i11++) {
                i21 i21Var = (i21) xl0Var.getChildAt(i11);
                if (i21Var != view && (xq0Var = i21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(xq0Var);
                    i21Var.J.run();
                }
            }
            if (!((np) mpVar.d.get(i10)).f26860a.f18756a) {
                ((i21) view).d();
            }
            opVar.F(true);
        }
    }

    public static void q(op opVar, od1 od1Var) {
        ?? obj = new Object();
        obj.f19581a = true;
        org.telegram.ui.wn wnVar = opVar.v;
        od1Var.f36151a.f36138a = wnVar.getResourceProvider();
        od1Var.f36194p1 = new gp(opVar);
        obj.f19583c = new th(3);
        obj.d = new wo(opVar, 5);
        obj.f19582b = new wo(opVar, 6);
        obj.e = true;
        opVar.X = od1Var;
        wnVar.showAsSheet(od1Var, obj);
    }

    public final void A(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            hp hpVar = this.G;
            jj0 jj0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = jj0Var.e[0];
                }
                jj0Var.P(i11);
                if (hpVar != null) {
                    hpVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = jj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            jj0Var.N(i10, false, true);
            jj0Var.P(i10);
            if (hpVar != null) {
                hpVar.invalidate();
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
        hp hpVar = this.G;
        hpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        hpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        hpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ci.tb tbVar = new ci.tb(this, getContext(), z10, canvas, (hpVar.getMeasuredWidth() / 2.0f) + f7, (hpVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = tbVar;
        tbVar.setOnTouchListener(new bi.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new ap(this));
        this.T.addListener(new r8(this, 11));
        this.T.setDuration(400L);
        this.T.setInterpolator(mt.e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new bi.f(22, this, z10));
    }

    public final void E() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.h6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.h6.f19279p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.h6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f27068b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.f2 f2Var = this.f27070c;
        f2Var.a(themedColor);
        f2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.h6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f19222m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void F(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op.F(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new wo(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.un unVar = this.f27078n;
            TLRPC.WallPaper wallPaper = unVar.h;
            if (wallPaper == null) {
                wallPaper = this.f27074f;
            }
            unVar.i(this.f27079r, wallPaper, true, Boolean.valueOf(this.f27080s), false);
        }
        if (this.N != this.f27080s) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.f27080s) {
                N0 = org.telegram.ui.ActionBar.h6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string) != null && !org.telegram.ui.ActionBar.h6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.h6.N0(string2) != null && org.telegram.ui.ActionBar.h6.N0(string2).q()) {
                    str2 = string2;
                }
                if (this.f27080s) {
                    N0 = org.telegram.ui.ActionBar.h6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.h6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.h6.t(N0, false, this.f27080s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        lp lpVar = new lp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.m2 m2Var = this.X;
            if (m2Var instanceof od1) {
                arrayList.addAll(((od1) m2Var).S0());
                return arrayList;
            }
        }
        wi wiVar = this.Y;
        if (wiVar != null) {
            arrayList.addAll(wiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, lpVar, org.telegram.ui.ActionBar.h6.f19129h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f27081w, 16, new Class[]{i21.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19147i5));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.j6) obj).f19525o = this.f27078n;
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
        k40 k40Var = this.U;
        if (k40Var != null) {
            k40Var.b(true);
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
        org.telegram.ui.wn wnVar = this.v;
        if (wnVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !wnVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            k40 k40Var = new k40(9, getContext(), wnVar.getResourceProvider(), false);
            this.U = k40Var;
            k40Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new wo(this, 7), 1500L);
            this.container.addView(this.U, w7.y5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.op.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f18661a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.z1(this) {
                public final op f30934b;

                {
                    this.f30934b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f30934b.s(false);
                            return;
                        default:
                            this.f30934b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.z1(this) {
                public final op f30934b;

                {
                    this.f30934b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f30934b.s(false);
                            return;
                        default:
                            this.f30934b.dismiss();
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
            org.telegram.ui.ActionBar.h6.f19015b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f27078n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f26860a;
            if (b4Var.f18756a) {
                this.f27078n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f27078n.i(b4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            wi wiVar = this.Y;
            if (wiVar != null) {
                lj ljVar = wiVar.f30056r0;
                if (ljVar != null) {
                    boolean z10 = this.N;
                    za zaVar = ljVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                }
                this.Y.c1();
            }
            mp mpVar = this.h;
            if (mpVar != null && mpVar.d != null) {
                for (int i10 = 0; i10 < mpVar.d.size(); i10++) {
                    ((np) mpVar.d.get(i10)).f26862c = this.N ? 1 : 0;
                }
                mpVar.l();
            }
        }
    }

    public final boolean v() {
        fg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        fg.b bVar2 = null;
        if (b4Var != null) {
            bVar = b4Var.f18758c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = fg.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.M.f26860a;
        if (b4Var2 != null) {
            bVar2 = b4Var2.f18758c;
        }
        if (bVar2 == null) {
            bVar2 = fg.b.d("❌");
        }
        return !fg.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.f27069b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f27069b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new jp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new kp(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        fg.b bVar;
        if (list != null && !list.isEmpty()) {
            np npVar = new np((org.telegram.ui.ActionBar.b4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.b4 b4Var = this.f27078n.f38505f;
                this.W = b4Var;
                if (b4Var != null) {
                    b4Var.l();
                }
            }
            arrayList.add(0, npVar);
            if (!this.V) {
                this.M = npVar;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.W;
            if (b4Var2 != null) {
                bVar = b4Var2.f18758c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
                np npVar2 = new np(b4Var3);
                b4Var3.n(this.currentAccount);
                npVar2.f26862c = this.N ? 1 : 0;
                if (fg.b.a(b4Var3.f18758c, bVar)) {
                    arrayList.add(1, npVar2);
                    z10 = true;
                } else {
                    arrayList.add(npVar2);
                }
            }
            org.telegram.ui.ActionBar.b4 b4Var4 = this.W;
            if (b4Var4 != null && !z10) {
                np npVar3 = new np(b4Var4);
                b4Var4.n(this.currentAccount);
                npVar3.f26862c = this.N ? 1 : 0;
                arrayList.add(1, npVar3);
            }
            mp mpVar = this.h;
            mpVar.d = arrayList;
            mpVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                z(false);
                this.f27081w.animate().alpha(1.0f).setDuration(150L).start();
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
                wallPaper = this.f27074f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.M.f26860a;
            if (b4Var.f18756a) {
                this.f27078n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f27078n.i(b4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void z(boolean z10) {
        mp mpVar = this.h;
        ArrayList arrayList = mpVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.W;
        s4.c0 c0Var = this.f27082x;
        xl0 xl0Var = this.f27081w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (fg.b.a(((np) arrayList.get(i10)).f26860a.f18758c, this.W.f18758c)) {
                        this.M = (np) arrayList.get(i10);
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
                mpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, mpVar.d.size() - 1);
                if (z10) {
                    xl0Var.x0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (np) arrayList.get(0);
            mpVar.E(0);
            if (z10) {
                xl0Var.x0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        y();
    }
}
