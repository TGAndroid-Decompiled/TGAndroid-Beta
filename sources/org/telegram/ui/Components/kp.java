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
import org.telegram.ui.cd1;
public final class kp extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26335f0 = 0;
    public final TextView B;
    public final gj0 C;
    public final cp D;
    public final dp E;
    public final View F;
    public final k6 G;
    public final k6 H;
    public final TextView I;
    public jp J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public uo O;
    public float P;
    public ValueAnimator Q;
    public k40 R;
    public boolean S;
    public org.telegram.ui.ActionBar.e4 T;
    public org.telegram.ui.ActionBar.p2 U;
    public li V;
    public ah.d W;
    public k6 X;
    public boolean Y;
    public mq Z;
    public boolean f26336a0;
    public final ImageView f26337b;
    public boolean f26338b0;
    public final org.telegram.ui.ActionBar.i2 f26339c;
    public TL_stories.TL_premium_boostsStatus f26340c0;
    public final TextView d;
    public float f26341d0;
    public final TextView e;
    public ValueAnimator f26342e0;
    public TLRPC.WallPaper f26343f;
    public final ip h;
    public final org.telegram.ui.vn f26344n;
    public final org.telegram.ui.ActionBar.e4 f26345r;
    public final boolean f26346s;
    public final org.telegram.ui.xn v;
    public final sl0 f26347w;
    public final f2.i0 f26348x;
    public final t00 f26349y;

    public kp(org.telegram.ui.xn xnVar, org.telegram.ui.vn vnVar) {
        super(xnVar.getParentActivity(), vnVar, true, false);
        String str;
        boolean z4;
        this.N = -1;
        this.f26336a0 = false;
        this.f26338b0 = false;
        this.f26341d0 = 0.0f;
        this.v = xnVar;
        this.f26344n = vnVar;
        this.f26345r = vnVar.f39218f;
        this.f26343f = vnVar.h;
        this.f26346s = org.telegram.ui.ActionBar.j6.I.q();
        ip ipVar = new ip(this.currentAccount, xnVar.a(), vnVar, 0);
        this.h = ipVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.j6.f19995i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19995i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.B = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20012j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f26337b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f26339c = i2Var;
        imageView.setImageDrawable(i2Var);
        imageView.setOnClickListener(new ro(this, 1));
        frameLayout.addView(imageView, k7.b6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i12 = R.raw.sun_outline;
        gj0 gj0Var = new gj0(i12, "" + R.raw.sun_outline, dp2, dp2, false, null);
        this.C = gj0Var;
        this.K = org.telegram.ui.ActionBar.j6.I.q() ^ true;
        B(org.telegram.ui.ActionBar.j6.I.q(), false);
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        cp cpVar = new cp(this, getContext());
        this.D = cpVar;
        cpVar.setAnimation(gj0Var);
        cpVar.setScaleType(ImageView.ScaleType.CENTER);
        cpVar.setOnClickListener(new ro(this, 2));
        frameLayout.addView(cpVar, k7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.E = new f2.j0(getContext());
        sl0 sl0Var = new sl0(getContext(), null);
        this.f26347w = sl0Var;
        sl0Var.setAdapter(ipVar);
        sl0Var.setDrawSelection(false);
        sl0Var.setClipChildren(false);
        sl0Var.setClipToPadding(false);
        sl0Var.setHasFixedSize(true);
        sl0Var.setItemAnimator(null);
        sl0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.i0 i0Var = new f2.i0(0, false);
        this.f26348x = i0Var;
        sl0Var.setLayoutManager(i0Var);
        sl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        sl0Var.setOnItemClickListener(new k(this, 3));
        sl0Var.setOnScrollListener(new eg.f2(this, 25));
        t00 t00Var = new t00(getContext(), this.resourcesProvider);
        this.f26349y = t00Var;
        t00Var.setViewType(14);
        t00Var.setVisibility(0);
        frameLayout.addView(t00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(sl0Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.F = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new ro(this, 3));
        frameLayout.addView(view, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.I = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f26343f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.y(this, 8));
        frameLayout.addView(textView2, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var = new k6(getContext(), true, true, true);
        this.G = k6Var;
        k6Var.getDrawable().n(true);
        k6Var.f26169n = false;
        k6Var.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.j6.Sh;
        k6Var.setTextColor(getThemedColor(i13));
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(k6Var, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var2 = new k6(getContext(), true, true, true);
        this.H = k6Var2;
        k6Var2.getDrawable().n(true);
        k6Var2.f26169n = false;
        k6Var2.setGravity(17);
        k6Var2.setTextColor(getThemedColor(i13));
        k6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        k6Var2.setAlpha(0.0f);
        k6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(k6Var2, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f26343f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new w2(10, this, xnVar));
            frameLayout.addView(textView3, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (xnVar.i() != null) {
                str = UserObject.getFirstName(xnVar.i());
            } else {
                TLRPC.Chat chat = xnVar.e;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(kp kpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (kpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.xn xnVar = kpVar.v;
        eg.v0 v0Var = new eg.v0(22, kpVar.currentAccount, kpVar.getContext(), xnVar, kpVar.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(kpVar.f26340c0, true);
        v0Var.H1(kpVar.v.a());
        v0Var.N0 = new qo(kpVar, 2);
        v0Var.show();
    }

    public static void n(kp kpVar, org.telegram.ui.xn xnVar) {
        if (kpVar.f26343f != null) {
            kpVar.f26343f = null;
            kpVar.dismiss();
            ChatThemeController.getInstance(kpVar.currentAccount).clearWallpaper(xnVar.a(), true);
            return;
        }
        kpVar.dismiss();
    }

    public static void o(kp kpVar, View view, int i10) {
        nq0 nq0Var;
        sl0 sl0Var = kpVar.f26347w;
        ip ipVar = kpVar.h;
        if (ipVar.d.get(i10) != kpVar.J && kpVar.O == null) {
            kpVar.J = (jp) ipVar.d.get(i10);
            kpVar.y();
            ipVar.E(i10);
            kpVar.containerView.postDelayed(new ye(kpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < sl0Var.getChildCount(); i11++) {
                w11 w11Var = (w11) sl0Var.getChildAt(i11);
                if (w11Var != view && (nq0Var = w11Var.G) != null) {
                    AndroidUtilities.cancelRunOnUIThread(nq0Var);
                    w11Var.G.run();
                }
            }
            if (!((jp) ipVar.d.get(i10)).f26015a.f19663a) {
                ((w11) view).d();
            }
            kpVar.E(true);
        }
    }

    public static void q(kp kpVar, cd1 cd1Var) {
        ?? obj = new Object();
        obj.f20478a = true;
        org.telegram.ui.xn xnVar = kpVar.v;
        cd1Var.f33287a.f33270a = xnVar.getResourceProvider();
        cd1Var.f33320m1 = new bp(kpVar);
        obj.f20480c = new mc(6);
        obj.d = new qo(kpVar, 5);
        obj.f20479b = new qo(kpVar, 6);
        obj.e = true;
        kpVar.U = cd1Var;
        xnVar.showAsSheet(cd1Var, obj);
    }

    public final void A(boolean z4) {
        ip ipVar = this.h;
        ArrayList arrayList = ipVar.d;
        org.telegram.ui.ActionBar.e4 e4Var = this.T;
        f2.i0 i0Var = this.f26348x;
        sl0 sl0Var = this.f26347w;
        if (e4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (sf.b.a(((jp) arrayList.get(i10)).f26015a.f19665c, this.T.f19665c)) {
                        this.J = (jp) arrayList.get(i10);
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
                ipVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, ipVar.d.size() - 1);
                if (z4) {
                    sl0Var.x0(min);
                } else {
                    i0Var.h1(min, 0);
                }
            }
        } else {
            this.J = (jp) arrayList.get(0);
            ipVar.E(0);
            if (z4) {
                sl0Var.x0(0);
            } else {
                i0Var.h1(0, 0);
            }
        }
        y();
    }

    public final void B(boolean z4, boolean z10) {
        int i10;
        if (this.K != z4) {
            this.K = z4;
            cp cpVar = this.D;
            gj0 gj0Var = this.C;
            int i11 = 0;
            if (z10) {
                if (z4) {
                    i11 = gj0Var.e[0];
                }
                gj0Var.N(i11);
                if (cpVar != null) {
                    cpVar.d();
                    return;
                }
                return;
            }
            if (z4) {
                i10 = gj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            gj0Var.L(i10, false, true);
            gj0Var.N(i10);
            if (cpVar != null) {
                cpVar.invalidate();
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
        cp cpVar = this.D;
        cpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        cpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        cpVar.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        uo uoVar = new uo(this, getContext(), z4, canvas, (cpVar.getMeasuredWidth() / 2.0f) + f10, (cpVar.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 0);
        this.O = uoVar;
        uoVar.setOnTouchListener(new oh.d(16));
        this.P = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new vo(this));
        this.Q.addListener(new a9(this, 10));
        this.Q.setDuration(400L);
        this.Q.setInterpolator(gt.e);
        this.Q.start();
        frameLayout.addView(this.O, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new jh.f(20, this, z4));
    }

    public final void D() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20120p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.f20122p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f20012j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f26337b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.i2 i2Var = this.f26339c;
        i2Var.a(themedColor);
        i2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.D.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f20066m5);
        TextView textView3 = this.I;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void E(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp.E(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new qo(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.L) {
            org.telegram.ui.vn vnVar = this.f26344n;
            TLRPC.WallPaper wallPaper = vnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f26343f;
            }
            vnVar.i(this.f26345r, wallPaper, true, Boolean.valueOf(this.f26346s), false);
        }
        if (this.K != this.f26346s) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f26346s) {
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
                if (this.f26346s) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N0, false, this.f26346s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        gp gpVar = new gp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f39965b7) {
            org.telegram.ui.ActionBar.p2 p2Var = this.U;
            if (p2Var instanceof cd1) {
                arrayList.addAll(((cd1) p2Var).S0());
                return arrayList;
            }
        }
        li liVar = this.V;
        if (liVar != null) {
            arrayList.addAll(liVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, gpVar, org.telegram.ui.ActionBar.j6.f19977h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f20012j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26347w, 16, new Class[]{w11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19995i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.l6) obj).f20442o = this.f26344n;
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
        k40 k40Var = this.R;
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
        this.L = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.xn xnVar = this.v;
        if (xnVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !xnVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            k40 k40Var = new k40(9, getContext(), xnVar.getResourceProvider(), false);
            this.R = k40Var;
            k40Var.setVisibility(4);
            this.R.setShowingDuration(5000L);
            this.R.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.K) {
                this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new qo(this, 7), 1500L);
            this.container.addView(this.R, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f19503a.O = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f19503a.Q = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.c2(this) {
                public final kp f28997b;

                {
                    this.f28997b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f28997b.s(false);
                            return;
                        default:
                            this.f28997b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.c2(this) {
                public final kp f28997b;

                {
                    this.f28997b = this;
                }

                @Override
                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f28997b.s(false);
                            return;
                        default:
                            this.f28997b.dismiss();
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
            org.telegram.ui.ActionBar.j6.f19863b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f26344n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.J.f26015a;
            if (e4Var.f19663a) {
                this.f26344n.i(null, wallPaper2, false, Boolean.valueOf(this.K), true);
            } else {
                this.f26344n.i(e4Var, wallPaper2, false, Boolean.valueOf(this.K), true);
            }
            li liVar = this.V;
            if (liVar != null) {
                zi ziVar = liVar.f26725o0;
                if (ziVar != null) {
                    boolean z4 = this.K;
                    ra raVar = ziVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                }
                this.V.c1();
            }
            ip ipVar = this.h;
            if (ipVar != null && ipVar.d != null) {
                for (int i10 = 0; i10 < ipVar.d.size(); i10++) {
                    ((jp) ipVar.d.get(i10)).f26017c = this.K ? 1 : 0;
                }
                ipVar.l();
            }
        }
    }

    public final boolean v() {
        sf.b bVar;
        if (this.J == null) {
            return false;
        }
        org.telegram.ui.ActionBar.e4 e4Var = this.T;
        sf.b bVar2 = null;
        if (e4Var != null) {
            bVar = e4Var.f19665c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = sf.b.d("❌");
        }
        org.telegram.ui.ActionBar.e4 e4Var2 = this.J.f26015a;
        if (e4Var2 != null) {
            bVar2 = e4Var2.f19665c;
        }
        if (bVar2 == null) {
            bVar2 = sf.b.d("❌");
        }
        return !sf.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.Y) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.Y = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new ep(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new fp(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        sf.b bVar;
        if (list != null && !list.isEmpty()) {
            jp jpVar = new jp((org.telegram.ui.ActionBar.e4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.S) {
                org.telegram.ui.ActionBar.e4 e4Var = this.f26344n.f39218f;
                this.T = e4Var;
                if (e4Var != null) {
                    e4Var.l();
                }
            }
            arrayList.add(0, jpVar);
            if (!this.S) {
                this.J = jpVar;
            }
            org.telegram.ui.ActionBar.e4 e4Var2 = this.T;
            if (e4Var2 != null) {
                bVar = e4Var2.f19665c;
            } else {
                bVar = null;
            }
            boolean z4 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.e4 e4Var3 = (org.telegram.ui.ActionBar.e4) list.get(i10);
                jp jpVar2 = new jp(e4Var3);
                e4Var3.n(this.currentAccount);
                jpVar2.f26017c = this.K ? 1 : 0;
                if (sf.b.a(e4Var3.f19665c, bVar)) {
                    arrayList.add(1, jpVar2);
                    z4 = true;
                } else {
                    arrayList.add(jpVar2);
                }
            }
            org.telegram.ui.ActionBar.e4 e4Var4 = this.T;
            if (e4Var4 != null && !z4) {
                jp jpVar3 = new jp(e4Var4);
                e4Var4.n(this.currentAccount);
                jpVar3.f26017c = this.K ? 1 : 0;
                arrayList.add(1, jpVar3);
            }
            ip ipVar = this.h;
            ipVar.d = arrayList;
            ipVar.l();
            this.D.setVisibility(0);
            if (!this.S) {
                A(false);
                this.f26347w.animate().alpha(1.0f).setDuration(150L).start();
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
                wallPaper = this.f26343f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.J.f26015a;
            if (e4Var.f19663a) {
                this.f26344n.i(null, wallPaper2, true, Boolean.valueOf(this.K), false);
                return;
            }
            this.f26344n.i(e4Var, wallPaper2, true, Boolean.valueOf(this.K), false);
        }
    }
}
