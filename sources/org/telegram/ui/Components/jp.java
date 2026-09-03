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
public final class jp extends org.telegram.ui.ActionBar.g3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f26005f0 = 0;
    public final TextView B;
    public final gj0 C;
    public final bp D;
    public final cp E;
    public final View F;
    public final k6 G;
    public final k6 H;
    public final TextView I;
    public ip J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public to O;
    public float P;
    public ValueAnimator Q;
    public l40 R;
    public boolean S;
    public org.telegram.ui.ActionBar.e4 T;
    public org.telegram.ui.ActionBar.p2 U;
    public li V;
    public ah.e W;
    public k6 X;
    public boolean Y;
    public lq Z;
    public boolean f26006a0;
    public final ImageView f26007b;
    public boolean f26008b0;
    public final org.telegram.ui.ActionBar.i2 f26009c;
    public TL_stories.TL_premium_boostsStatus f26010c0;
    public final TextView d;
    public float f26011d0;
    public final TextView e;
    public ValueAnimator f26012e0;
    public TLRPC.WallPaper f26013f;
    public final hp h;
    public final org.telegram.ui.xn f26014n;
    public final org.telegram.ui.ActionBar.e4 f26015r;
    public final boolean f26016s;
    public final org.telegram.ui.zn v;
    public final rl0 f26017w;
    public final f2.i0 f26018x;
    public final u00 f26019y;

    public jp(org.telegram.ui.zn znVar, org.telegram.ui.xn xnVar) {
        super(znVar.getParentActivity(), xnVar, true, false);
        String str;
        boolean z4;
        this.N = -1;
        this.f26006a0 = false;
        this.f26008b0 = false;
        this.f26011d0 = 0.0f;
        this.v = znVar;
        this.f26014n = xnVar;
        this.f26015r = xnVar.f40028f;
        this.f26013f = xnVar.h;
        this.f26016s = org.telegram.ui.ActionBar.j6.I.q();
        hp hpVar = new hp(this.currentAccount, znVar.a(), xnVar, 0);
        this.h = hpVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.j6.f19970i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z4);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.j6.f19970i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.B = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f19987j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f26007b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.f26009c = i2Var;
        imageView.setImageDrawable(i2Var);
        imageView.setOnClickListener(new qo(this, 1));
        frameLayout.addView(imageView, k7.b6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, k7.b6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        gj0 gj0Var = new gj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.C = gj0Var;
        this.K = !org.telegram.ui.ActionBar.j6.I.q();
        B(org.telegram.ui.ActionBar.j6.I.q(), false);
        gj0Var.H(true);
        gj0Var.h = true;
        gj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        bp bpVar = new bp(this, getContext());
        this.D = bpVar;
        bpVar.setAnimation(gj0Var);
        bpVar.setScaleType(ImageView.ScaleType.CENTER);
        bpVar.setOnClickListener(new qo(this, 2));
        frameLayout.addView(bpVar, k7.b6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.E = new f2.j0(getContext());
        rl0 rl0Var = new rl0(getContext(), null);
        this.f26017w = rl0Var;
        rl0Var.setAdapter(hpVar);
        rl0Var.setDrawSelection(false);
        rl0Var.setClipChildren(false);
        rl0Var.setClipToPadding(false);
        rl0Var.setHasFixedSize(true);
        rl0Var.setItemAnimator(null);
        rl0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.i0 i0Var = new f2.i0(0, false);
        this.f26018x = i0Var;
        rl0Var.setLayoutManager(i0Var);
        rl0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        rl0Var.setOnItemClickListener(new k(this, 3));
        rl0Var.setOnScrollListener(new eg.f2(this, 25));
        u00 u00Var = new u00(getContext(), this.resourcesProvider);
        this.f26019y = u00Var;
        u00Var.setViewType(14);
        u00Var.setVisibility(0);
        frameLayout.addView(u00Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(rl0Var, k7.b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.F = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.j6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new qo(this, 3));
        frameLayout.addView(view, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.I = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f26013f == null) {
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
        k6Var.f26173n = false;
        k6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.j6.Sh;
        k6Var.setTextColor(getThemedColor(i12));
        k6Var.setTextSize(AndroidUtilities.dp(15.0f));
        k6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(k6Var, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        k6 k6Var2 = new k6(getContext(), true, true, true);
        this.H = k6Var2;
        k6Var2.getDrawable().n(true);
        k6Var2.f26173n = false;
        k6Var2.setGravity(17);
        k6Var2.setTextColor(getThemedColor(i12));
        k6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        k6Var2.setAlpha(0.0f);
        k6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(k6Var2, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f26013f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new w2(10, this, znVar));
            frameLayout.addView(textView3, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
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
            frameLayout.addView(textView4, k7.b6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(jp jpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (jpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.zn znVar = jpVar.v;
        eg.v0 v0Var = new eg.v0(22, jpVar.currentAccount, jpVar.getContext(), znVar, jpVar.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(jpVar.f26010c0, true);
        v0Var.H1(jpVar.v.a());
        v0Var.N0 = new po(jpVar, 2);
        v0Var.show();
    }

    public static void n(jp jpVar, org.telegram.ui.zn znVar) {
        if (jpVar.f26013f != null) {
            jpVar.f26013f = null;
            jpVar.dismiss();
            ChatThemeController.getInstance(jpVar.currentAccount).clearWallpaper(znVar.a(), true);
            return;
        }
        jpVar.dismiss();
    }

    public static void o(jp jpVar, View view, int i10) {
        nq0 nq0Var;
        rl0 rl0Var = jpVar.f26017w;
        hp hpVar = jpVar.h;
        if (hpVar.d.get(i10) != jpVar.J && jpVar.O == null) {
            jpVar.J = (ip) hpVar.d.get(i10);
            jpVar.y();
            hpVar.E(i10);
            jpVar.containerView.postDelayed(new ye(jpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < rl0Var.getChildCount(); i11++) {
                w11 w11Var = (w11) rl0Var.getChildAt(i11);
                if (w11Var != view && (nq0Var = w11Var.G) != null) {
                    AndroidUtilities.cancelRunOnUIThread(nq0Var);
                    w11Var.G.run();
                }
            }
            if (!((ip) hpVar.d.get(i10)).f25749a.f19638a) {
                ((w11) view).d();
            }
            jpVar.E(true);
        }
    }

    public static void q(jp jpVar, jd1 jd1Var) {
        ?? obj = new Object();
        obj.f20453a = true;
        org.telegram.ui.zn znVar = jpVar.v;
        jd1Var.f35179a.f35166a = znVar.getResourceProvider();
        jd1Var.f35212m1 = new ap(jpVar);
        obj.f20455c = new mc(6);
        obj.d = new po(jpVar, 5);
        obj.f20454b = new po(jpVar, 6);
        obj.e = true;
        jpVar.U = jd1Var;
        znVar.showAsSheet(jd1Var, obj);
    }

    public final void A(boolean z4) {
        hp hpVar = this.h;
        ArrayList arrayList = hpVar.d;
        org.telegram.ui.ActionBar.e4 e4Var = this.T;
        f2.i0 i0Var = this.f26018x;
        rl0 rl0Var = this.f26017w;
        if (e4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (sf.b.a(((ip) arrayList.get(i10)).f25749a.f19640c, this.T.f19640c)) {
                        this.J = (ip) arrayList.get(i10);
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
                hpVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, hpVar.d.size() - 1);
                if (z4) {
                    rl0Var.x0(min);
                } else {
                    i0Var.h1(min, 0);
                }
            }
        } else {
            this.J = (ip) arrayList.get(0);
            hpVar.E(0);
            if (z4) {
                rl0Var.x0(0);
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
            bp bpVar = this.D;
            gj0 gj0Var = this.C;
            int i11 = 0;
            if (z10) {
                if (z4) {
                    i11 = gj0Var.e[0];
                }
                gj0Var.N(i11);
                if (bpVar != null) {
                    bpVar.d();
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
            if (bpVar != null) {
                bpVar.invalidate();
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
        bp bpVar = this.D;
        bpVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        bpVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        bpVar.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        to toVar = new to(this, getContext(), z4, canvas, (bpVar.getMeasuredWidth() / 2.0f) + f10, (bpVar.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 0);
        this.O = toVar;
        toVar.setOnTouchListener(new oh.d(16));
        this.P = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.Q = ofFloat;
        ofFloat.addUpdateListener(new uo(this));
        this.Q.addListener(new a9(this, 10));
        this.Q.setDuration(400L);
        this.Q.setInterpolator(ft.e);
        this.Q.start();
        frameLayout.addView(this.O, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new jh.f(20, this, z4));
    }

    public final void D() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.f20095p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.j6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.j6.f20097p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.j6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f26007b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.i2 i2Var = this.f26009c;
        i2Var.a(themedColor);
        i2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        this.D.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.j6.f20041m5);
        TextView textView3 = this.I;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.j6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void E(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp.E(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new po(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.i6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.L) {
            org.telegram.ui.xn xnVar = this.f26014n;
            TLRPC.WallPaper wallPaper = xnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f26013f;
            }
            xnVar.i(this.f26015r, wallPaper, true, Boolean.valueOf(this.f26016s), false);
        }
        if (this.K != this.f26016s) {
            if (org.telegram.ui.ActionBar.j6.I.q() == this.f26016s) {
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
                if (this.f26016s) {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.j6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.j6.t(N0, false, this.f26016s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        fp fpVar = new fp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f40531b7) {
            org.telegram.ui.ActionBar.p2 p2Var = this.U;
            if (p2Var instanceof jd1) {
                arrayList.addAll(((jd1) p2Var).S0());
                return arrayList;
            }
        }
        li liVar = this.V;
        if (liVar != null) {
            arrayList.addAll(liVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, fpVar, org.telegram.ui.ActionBar.j6.f19952h5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.B, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.f19987j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26017w, 16, new Class[]{w11.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19970i5));
        int i11 = org.telegram.ui.ActionBar.j6.Oh;
        View view = this.F;
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.l6) obj).f20417o = this.f26014n;
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
        l40 l40Var = this.R;
        if (l40Var != null) {
            l40Var.b(true);
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
        org.telegram.ui.zn znVar = this.v;
        if (znVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !znVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            l40 l40Var = new l40(9, getContext(), znVar.getResourceProvider(), false);
            this.R = l40Var;
            l40Var.setVisibility(4);
            this.R.setShowingDuration(5000L);
            this.R.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.K) {
                this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.R.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new po(this, 7), 1500L);
            this.container.addView(this.R, k7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f19478a.O = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.c2(this) {
                public final jp f28769b;

                {
                    this.f28769b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f28769b.s(false);
                            return;
                        default:
                            this.f28769b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.c2(this) {
                public final jp f28769b;

                {
                    this.f28769b = this;
                }

                @Override
                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f28769b.s(false);
                            return;
                        default:
                            this.f28769b.dismiss();
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
            org.telegram.ui.ActionBar.j6.f19838b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f26014n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.J.f25749a;
            if (e4Var.f19638a) {
                this.f26014n.i(null, wallPaper2, false, Boolean.valueOf(this.K), true);
            } else {
                this.f26014n.i(e4Var, wallPaper2, false, Boolean.valueOf(this.K), true);
            }
            li liVar = this.V;
            if (liVar != null) {
                zi ziVar = liVar.f26721o0;
                if (ziVar != null) {
                    boolean z4 = this.K;
                    ra raVar = ziVar.v;
                    ((ArrayList) raVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) raVar.e, z4);
                    raVar.l();
                }
                this.V.c1();
            }
            hp hpVar = this.h;
            if (hpVar != null && hpVar.d != null) {
                for (int i10 = 0; i10 < hpVar.d.size(); i10++) {
                    ((ip) hpVar.d.get(i10)).f25751c = this.K ? 1 : 0;
                }
                hpVar.l();
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
            bVar = e4Var.f19640c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = sf.b.d("❌");
        }
        org.telegram.ui.ActionBar.e4 e4Var2 = this.J.f25749a;
        if (e4Var2 != null) {
            bVar2 = e4Var2.f19640c;
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
                chatThemeController.requestAllChatThemes(new dp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new ep(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        sf.b bVar;
        if (list != null && !list.isEmpty()) {
            ip ipVar = new ip((org.telegram.ui.ActionBar.e4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.S) {
                org.telegram.ui.ActionBar.e4 e4Var = this.f26014n.f40028f;
                this.T = e4Var;
                if (e4Var != null) {
                    e4Var.l();
                }
            }
            arrayList.add(0, ipVar);
            if (!this.S) {
                this.J = ipVar;
            }
            org.telegram.ui.ActionBar.e4 e4Var2 = this.T;
            if (e4Var2 != null) {
                bVar = e4Var2.f19640c;
            } else {
                bVar = null;
            }
            boolean z4 = false;
            for (int i10 = 1; i10 < list.size(); i10++) {
                org.telegram.ui.ActionBar.e4 e4Var3 = (org.telegram.ui.ActionBar.e4) list.get(i10);
                ip ipVar2 = new ip(e4Var3);
                e4Var3.n(this.currentAccount);
                ipVar2.f25751c = this.K ? 1 : 0;
                if (sf.b.a(e4Var3.f19640c, bVar)) {
                    arrayList.add(1, ipVar2);
                    z4 = true;
                } else {
                    arrayList.add(ipVar2);
                }
            }
            org.telegram.ui.ActionBar.e4 e4Var4 = this.T;
            if (e4Var4 != null && !z4) {
                ip ipVar3 = new ip(e4Var4);
                e4Var4.n(this.currentAccount);
                ipVar3.f25751c = this.K ? 1 : 0;
                arrayList.add(1, ipVar3);
            }
            hp hpVar = this.h;
            hpVar.d = arrayList;
            hpVar.l();
            this.D.setVisibility(0);
            if (!this.S) {
                A(false);
                this.f26017w.animate().alpha(1.0f).setDuration(150L).start();
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
                wallPaper = this.f26013f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.e4 e4Var = this.J.f25749a;
            if (e4Var.f19638a) {
                this.f26014n.i(null, wallPaper2, true, Boolean.valueOf(this.K), false);
                return;
            }
            this.f26014n.i(e4Var, wallPaper2, true, Boolean.valueOf(this.K), false);
        }
    }
}
