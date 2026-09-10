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
import org.telegram.ui.ae1;
public final class sp extends org.telegram.ui.ActionBar.h3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27130i0 = 0;
    public final TextView E;
    public final hj0 F;
    public final lp G;
    public final mp H;
    public final View I;
    public final o6 J;
    public final o6 K;
    public final TextView L;
    public rp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public bi.gd R;
    public float S;
    public ValueAnimator T;
    public s40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.f4 W;
    public org.telegram.ui.ActionBar.p2 X;
    public yi Y;
    public bi.n7 Z;
    public o6 f27131a0;
    public final ImageView f27132b;
    public boolean f27133b0;
    public final org.telegram.ui.ActionBar.i2 f27134c;
    public uq f27135c0;
    public final TextView d;
    public boolean f27136d0;
    public final TextView e;
    public boolean f27137e0;
    public TLRPC.WallPaper f27138f;
    public TL_stories.TL_premium_boostsStatus f27139f0;
    public float f27140g0;
    public final qp h;
    public ValueAnimator f27141h0;
    public final org.telegram.ui.bo f27142n;
    public final org.telegram.ui.ActionBar.f4 f27143r;
    public final boolean f27144s;
    public final org.telegram.ui.eo v;
    public final vl0 f27145w;
    public final s4.c0 f27146x;
    public final a10 f27147y;

    public sp(org.telegram.ui.eo eoVar, org.telegram.ui.bo boVar) {
        super(1, (Context) eoVar.getParentActivity(), (org.telegram.ui.ActionBar.f6) boVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f27136d0 = false;
        this.f27137e0 = false;
        this.f27140g0 = 0.0f;
        this.v = eoVar;
        this.f27142n = boVar;
        this.f27143r = boVar.f31302f;
        this.f27138f = boVar.h;
        this.f27144s = org.telegram.ui.ActionBar.j6.I.q();
        qp qpVar = new qp(this.currentAccount, eoVar.a(), boVar, 0);
        this.h = qpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.j6.f18016i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f18016i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f18034j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f27132b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f27134c = i2Var;
        imageView.setImageDrawable(i2Var);
        imageView.setOnClickListener(new bp(this, 1));
        frameLayout.addView(imageView, w7.a6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.a6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        hj0 hj0Var = new hj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = hj0Var;
        this.N = !org.telegram.ui.ActionBar.j6.I.q();
        A(org.telegram.ui.ActionBar.j6.I.q(), false);
        hj0Var.J(true);
        hj0Var.h = true;
        hj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        lp lpVar = new lp(this, getContext());
        this.G = lpVar;
        lpVar.setAnimation(hj0Var);
        lpVar.setScaleType(ImageView.ScaleType.CENTER);
        lpVar.setOnClickListener(new bp(this, 2));
        frameLayout.addView(lpVar, w7.a6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new s4.d0(getContext());
        vl0 vl0Var = new vl0(getContext(), null);
        this.f27145w = vl0Var;
        vl0Var.setAdapter(qpVar);
        vl0Var.setDrawSelection(false);
        vl0Var.setClipChildren(false);
        vl0Var.setClipToPadding(false);
        vl0Var.setHasFixedSize(true);
        vl0Var.setItemAnimator(null);
        vl0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.c0 c0Var = new s4.c0(0, false);
        this.f27146x = c0Var;
        vl0Var.setLayoutManager(c0Var);
        vl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        vl0Var.setOnItemClickListener(new k(this, 3));
        vl0Var.setOnScrollListener(new bi.a2(this, 22));
        a10 a10Var = new a10(getContext(), this.resourcesProvider);
        this.f27147y = a10Var;
        a10Var.setViewType(14);
        a10Var.setVisibility(0);
        frameLayout.addView(a10Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(vl0Var, w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new bp(this, 3));
        frameLayout.addView(view, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f27138f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.x(this, 8));
        frameLayout.addView(textView2, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var = new o6(getContext(), true, true, true);
        this.J = o6Var;
        o6Var.getDrawable().n(true);
        o6Var.f25682n = false;
        o6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.Sh;
        o6Var.setTextColor(getThemedColor(i12));
        o6Var.setTextSize(AndroidUtilities.dp(15.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(o6Var, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        o6 o6Var2 = new o6(getContext(), true, true, true);
        this.K = o6Var2;
        o6Var2.getDrawable().n(true);
        o6Var2.f25682n = false;
        o6Var2.setGravity(17);
        o6Var2.setTextColor(getThemedColor(i12));
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        o6Var2.setAlpha(0.0f);
        o6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(o6Var2, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f27138f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new org.telegram.ui.sh(22, this, eoVar));
            frameLayout.addView(textView3, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (eoVar.i() != null) {
                str = UserObject.getFirstName(eoVar.i());
            } else {
                TLRPC.Chat chat = eoVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.a6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(sp spVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (spVar.getContext() == null) {
            return;
        }
        org.telegram.ui.eo eoVar = spVar.v;
        qg.k0 k0Var = new qg.k0(22, spVar.currentAccount, spVar.getContext(), eoVar, spVar.resourcesProvider);
        k0Var.G1(canApplyBoost);
        k0Var.F1(spVar.f27139f0, true);
        k0Var.H1(spVar.v.a());
        k0Var.Q0 = new ap(spVar, 2);
        k0Var.show();
    }

    public static void n(sp spVar, org.telegram.ui.eo eoVar) {
        if (spVar.f27138f != null) {
            spVar.f27138f = null;
            spVar.dismiss();
            ChatThemeController.getInstance(spVar.currentAccount).clearWallpaper(eoVar.a(), true);
            return;
        }
        spVar.dismiss();
    }

    public static void o(sp spVar, View view, int i10) {
        uq0 uq0Var;
        vl0 vl0Var = spVar.f27145w;
        qp qpVar = spVar.h;
        if (qpVar.d.get(i10) != spVar.M && spVar.R == null) {
            spVar.M = (rp) qpVar.d.get(i10);
            spVar.y();
            qpVar.E(i10);
            spVar.containerView.postDelayed(new kf(spVar, i10, 1), 100L);
            for (int i11 = 0; i11 < vl0Var.getChildCount(); i11++) {
                i21 i21Var = (i21) vl0Var.getChildAt(i11);
                if (i21Var != view && (uq0Var = i21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(uq0Var);
                    i21Var.J.run();
                }
            }
            if (!((rp) qpVar.d.get(i10)).f26733a.f17714a) {
                ((i21) view).d();
            }
            spVar.E(true);
        }
    }

    public static void q(sp spVar, ae1 ae1Var) {
        ?? obj = new Object();
        obj.f18485a = true;
        org.telegram.ui.eo eoVar = spVar.v;
        ae1Var.f30914a.f30901a = eoVar.getResourceProvider();
        ae1Var.f30957p1 = new kp(spVar);
        obj.f18487c = new bi.f0(28);
        obj.d = new ap(spVar, 5);
        obj.f18486b = new ap(spVar, 6);
        obj.e = true;
        spVar.X = ae1Var;
        eoVar.showAsSheet(ae1Var, obj);
    }

    public final void A(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            lp lpVar = this.G;
            hj0 hj0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = hj0Var.e[0];
                }
                hj0Var.P(i11);
                if (lpVar != null) {
                    lpVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = hj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            hj0Var.N(i10, false, true);
            hj0Var.P(i10);
            if (lpVar != null) {
                lpVar.invalidate();
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
        lp lpVar = this.G;
        lpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        lpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        lpVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        bi.gd gdVar = new bi.gd(this, getContext(), z10, canvas, (lpVar.getMeasuredWidth() / 2.0f) + f7, (lpVar.getMeasuredHeight() / 2.0f) + f10, 0.9f * Math.max(createBitmap.getHeight(), createBitmap.getWidth()), paint, createBitmap, paint2, f7, f10, 1);
        this.R = gdVar;
        gdVar.setOnTouchListener(new ai.h(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new ep(this));
        this.T.addListener(new rm(this, 1));
        this.T.setDuration(400L);
        this.T.setInterpolator(pt.e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ai.j(21, this, z10));
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
            int i10 = org.telegram.ui.ActionBar.j6.f18144p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f27132b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.i2 i2Var = this.f27134c;
        i2Var.a(themedColor);
        i2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f18090m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void E(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp.E(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ap(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.bo boVar = this.f27142n;
            TLRPC.WallPaper wallPaper = boVar.h;
            if (wallPaper == null) {
                wallPaper = this.f27138f;
            }
            boVar.i(this.f27143r, wallPaper, true, Boolean.valueOf(this.f27144s), false);
        }
        if (this.N != this.f27144s) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f27144s) {
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
                if (this.f27144s) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N0, false, this.f27144s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        pp ppVar = new pp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.p2 p2Var = this.X;
            if (p2Var instanceof ae1) {
                arrayList.addAll(((ae1) p2Var).S0());
                return arrayList;
            }
        }
        yi yiVar = this.Y;
        if (yiVar != null) {
            arrayList.addAll(yiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, ppVar, org.telegram.ui.ActionBar.j6.f17998h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f18034j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f27145w, 16, new Class[]{i21.class}, null, null, null, org.telegram.ui.ActionBar.j6.f18016i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.l6) obj).f18465o = this.f27142n;
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
        s40 s40Var = this.U;
        if (s40Var != null) {
            s40Var.b(true);
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
        org.telegram.ui.eo eoVar = this.v;
        if (eoVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !eoVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            s40 s40Var = new s40(9, getContext(), eoVar.getResourceProvider(), false);
            this.U = s40Var;
            s40Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new ap(this, 7), 1500L);
            this.container.addView(this.U, w7.a6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.c2(this) {
                public final sp f22451b;

                {
                    this.f22451b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f22451b.s(false);
                            return;
                        default:
                            this.f22451b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.c2(this) {
                public final sp f22451b;

                {
                    this.f22451b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f22451b.s(false);
                            return;
                        default:
                            this.f22451b.dismiss();
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
            org.telegram.ui.ActionBar.j6.f17884b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f27142n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.M.f26733a;
            if (f4Var.f17714a) {
                this.f27142n.i(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f27142n.i(f4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            yi yiVar = this.Y;
            if (yiVar != null) {
                mj mjVar = yiVar.f29402r0;
                if (mjVar != null) {
                    boolean z10 = this.N;
                    ya yaVar = mjVar.v;
                    ((ArrayList) yaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) yaVar.e, z10);
                    yaVar.l();
                }
                this.Y.c1();
            }
            qp qpVar = this.h;
            if (qpVar != null && qpVar.d != null) {
                for (int i10 = 0; i10 < qpVar.d.size(); i10++) {
                    ((rp) qpVar.d.get(i10)).f26735c = this.N ? 1 : 0;
                }
                qpVar.l();
            }
        }
    }

    public final boolean v() {
        eg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.f4 f4Var = this.W;
        eg.b bVar2 = null;
        if (f4Var != null) {
            bVar = f4Var.f17716c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = eg.b.d("❌");
        }
        org.telegram.ui.ActionBar.f4 f4Var2 = this.M.f26733a;
        if (f4Var2 != null) {
            bVar2 = f4Var2.f17716c;
        }
        if (bVar2 == null) {
            bVar2 = eg.b.d("❌");
        }
        return !eg.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.f27133b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f27133b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new np(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new op(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        eg.b bVar;
        if (list != null && !list.isEmpty()) {
            rp rpVar = new rp((org.telegram.ui.ActionBar.f4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.f4 f4Var = this.f27142n.f31302f;
                this.W = f4Var;
                if (f4Var != null) {
                    f4Var.l();
                }
            }
            arrayList.add(0, rpVar);
            if (!this.V) {
                this.M = rpVar;
            }
            org.telegram.ui.ActionBar.f4 f4Var2 = this.W;
            if (f4Var2 != null) {
                bVar = f4Var2.f17716c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.f4 f4Var3 = (org.telegram.ui.ActionBar.f4) list.get(i10);
                rp rpVar2 = new rp(f4Var3);
                f4Var3.n(this.currentAccount);
                rpVar2.f26735c = this.N ? 1 : 0;
                if (eg.b.a(f4Var3.f17716c, bVar)) {
                    arrayList.add(1, rpVar2);
                    z10 = true;
                } else {
                    arrayList.add(rpVar2);
                }
            }
            org.telegram.ui.ActionBar.f4 f4Var4 = this.W;
            if (f4Var4 != null && !z10) {
                rp rpVar3 = new rp(f4Var4);
                f4Var4.n(this.currentAccount);
                rpVar3.f26735c = this.N ? 1 : 0;
                arrayList.add(1, rpVar3);
            }
            qp qpVar = this.h;
            qpVar.d = arrayList;
            qpVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                z(false);
                this.f27145w.animate().alpha(1.0f).setDuration(150L).start();
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
                wallPaper = this.f27138f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.f4 f4Var = this.M.f26733a;
            if (f4Var.f17714a) {
                this.f27142n.i(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f27142n.i(f4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void z(boolean z10) {
        qp qpVar = this.h;
        ArrayList arrayList = qpVar.d;
        org.telegram.ui.ActionBar.f4 f4Var = this.W;
        s4.c0 c0Var = this.f27146x;
        vl0 vl0Var = this.f27145w;
        if (f4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (eg.b.a(((rp) arrayList.get(i10)).f26733a.f17716c, this.W.f17716c)) {
                        this.M = (rp) arrayList.get(i10);
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
                qpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, qpVar.d.size() - 1);
                if (z10) {
                    vl0Var.x0(min);
                } else {
                    c0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (rp) arrayList.get(0);
            qpVar.E(0);
            if (z10) {
                vl0Var.x0(0);
            } else {
                c0Var.h1(0, 0);
            }
        }
        y();
    }
}
