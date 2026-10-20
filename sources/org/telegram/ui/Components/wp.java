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
import org.telegram.ui.kc1;
public final class wp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f32202i0 = 0;
    public final TextView E;
    public final vj0 F;
    public final pp G;
    public final qp H;
    public final View I;
    public final q6 J;
    public final q6 K;
    public final TextView L;
    public vp M;
    public boolean N;
    public boolean O;
    public boolean P;
    public int Q;
    public ei.db R;
    public float S;
    public ValueAnimator T;
    public r40 U;
    public boolean V;
    public org.telegram.ui.ActionBar.c4 W;
    public org.telegram.ui.ActionBar.n2 X;
    public ti Y;
    public ah.v Z;
    public q6 f32203a0;
    public final ImageView f32204b;
    public boolean f32205b0;
    public final org.telegram.ui.ActionBar.g2 f32206c;
    public yq f32207c0;
    public final TextView d;
    public boolean f32208d0;
    public final TextView e;
    public boolean f32209e0;
    public TLRPC.WallPaper f32210f;
    public TL_stories.TL_premium_boostsStatus f32211f0;
    public float f32212g0;
    public final up h;
    public ValueAnimator f32213h0;
    public final org.telegram.ui.on f32214n;
    public final org.telegram.ui.ActionBar.c4 f32215r;
    public final boolean f32216s;
    public final org.telegram.ui.qn v;
    public final jm0 f32217w;
    public final s4.b0 f32218x;
    public final b10 f32219y;

    public wp(org.telegram.ui.qn qnVar, org.telegram.ui.on onVar) {
        super(1, (Context) qnVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) onVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f32208d0 = false;
        this.f32209e0 = false;
        this.f32212g0 = 0.0f;
        this.v = qnVar;
        this.f32214n = onVar;
        this.f32215r = onVar.f39932f;
        this.f32210f = onVar.h;
        this.f32216s = org.telegram.ui.ActionBar.h6.I.q();
        up upVar = new up(this.currentAccount, qnVar.a(), onVar, 0);
        this.h = upVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.h6.f21078i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f21078i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21096j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f32204b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f32206c = g2Var;
        imageView.setImageDrawable(g2Var);
        imageView.setOnClickListener(new fp(this, 1));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        vj0 vj0Var = new vj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = vj0Var;
        this.N = !org.telegram.ui.ActionBar.h6.I.q();
        C(org.telegram.ui.ActionBar.h6.I.q(), false);
        vj0Var.J(true);
        vj0Var.h = true;
        vj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        pp ppVar = new pp(this, getContext());
        this.G = ppVar;
        ppVar.setAnimation(vj0Var);
        ppVar.setScaleType(ImageView.ScaleType.CENTER);
        ppVar.setOnClickListener(new fp(this, 2));
        frameLayout.addView(ppVar, w7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new s4.c0(getContext());
        jm0 jm0Var = new jm0(getContext(), null);
        this.f32217w = jm0Var;
        jm0Var.setAdapter(upVar);
        jm0Var.setDrawSelection(false);
        jm0Var.setClipChildren(false);
        jm0Var.setClipToPadding(false);
        jm0Var.setHasFixedSize(true);
        jm0Var.setItemAnimator(null);
        jm0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.b0 b0Var = new s4.b0(0, false);
        this.f32218x = b0Var;
        jm0Var.setLayoutManager(b0Var);
        jm0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        jm0Var.setOnItemClickListener(new j(this, 3));
        jm0Var.setOnScrollListener(new ah.d0(this, 29));
        b10 b10Var = new b10(getContext(), this.resourcesProvider);
        this.f32219y = b10Var;
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(jm0Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.I = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i11);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.h6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new fp(this, 3));
        frameLayout.addView(view, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.L = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f32210f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.w(this, 8));
        frameLayout.addView(textView2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var = new q6(getContext(), true, true, true);
        this.J = q6Var;
        q6Var.getDrawable().q(true);
        q6Var.f29481n = false;
        q6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        q6Var.setTextColor(getThemedColor(i12));
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(q6Var, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var2 = new q6(getContext(), true, true, true);
        this.K = q6Var2;
        q6Var2.getDrawable().q(true);
        q6Var2.f29481n = false;
        q6Var2.setGravity(17);
        q6Var2.setTextColor(getThemedColor(i12));
        q6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        q6Var2.setAlpha(0.0f);
        q6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(q6Var2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f32210f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new ca(5, this, qnVar));
            frameLayout.addView(textView3, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (qnVar.i() != null) {
                str = UserObject.getFirstName(qnVar.i());
            } else {
                TLRPC.Chat chat = qnVar.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        E();
        F(false);
    }

    public static void n(wp wpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (wpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.qn qnVar = wpVar.v;
        sg.k0 k0Var = new sg.k0(22, wpVar.currentAccount, wpVar.getContext(), qnVar, wpVar.resourcesProvider);
        k0Var.H1(canApplyBoost);
        k0Var.G1(wpVar.f32211f0, true);
        k0Var.I1(wpVar.v.a());
        k0Var.Q0 = new ep(wpVar, 2);
        k0Var.show();
    }

    public static void o(wp wpVar, org.telegram.ui.qn qnVar) {
        if (wpVar.f32210f != null) {
            wpVar.f32210f = null;
            wpVar.dismiss();
            ChatThemeController.getInstance(wpVar.currentAccount).clearWallpaper(qnVar.a(), true);
            return;
        }
        wpVar.dismiss();
    }

    public static void p(wp wpVar, View view, int i10) {
        hr0 hr0Var;
        jm0 jm0Var = wpVar.f32217w;
        up upVar = wpVar.h;
        if (upVar.d.get(i10) != wpVar.M && wpVar.R == null) {
            wpVar.M = (vp) upVar.d.get(i10);
            wpVar.A();
            upVar.E(i10);
            wpVar.containerView.postDelayed(new hf(wpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < jm0Var.getChildCount(); i11++) {
                r21 r21Var = (r21) jm0Var.getChildAt(i11);
                if (r21Var != view && (hr0Var = r21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(hr0Var);
                    r21Var.J.run();
                }
            }
            if (!((vp) upVar.d.get(i10)).f31849a.f20723a) {
                ((r21) view).d();
            }
            wpVar.F(true);
        }
    }

    public static void s(wp wpVar, kc1 kc1Var) {
        ?? obj = new Object();
        obj.f21556a = true;
        org.telegram.ui.qn qnVar = wpVar.v;
        kc1Var.f38516a.f38505a = qnVar.getResourceProvider();
        kc1Var.f38559p1 = new op(wpVar);
        obj.f21558c = new rc(8);
        obj.d = new ep(wpVar, 5);
        obj.f21557b = new ep(wpVar, 6);
        obj.e = true;
        wpVar.X = kc1Var;
        qnVar.showAsSheet(kc1Var, obj);
    }

    public final void A() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            this.P = false;
            this.v.getClass();
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f32210f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.M.f31849a;
            if (c4Var.f20723a) {
                this.f32214n.k(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f32214n.k(c4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void B(boolean z10) {
        up upVar = this.h;
        ArrayList arrayList = upVar.d;
        org.telegram.ui.ActionBar.c4 c4Var = this.W;
        s4.b0 b0Var = this.f32218x;
        jm0 jm0Var = this.f32217w;
        if (c4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (gg.b.a(((vp) arrayList.get(i10)).f31849a.f20725c, this.W.f20725c)) {
                        this.M = (vp) arrayList.get(i10);
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
                upVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int min = Math.min(i10, upVar.d.size() - 1);
                if (z10) {
                    jm0Var.x0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (vp) arrayList.get(0);
            upVar.E(0);
            if (z10) {
                jm0Var.x0(0);
            } else {
                b0Var.h1(0, 0);
            }
        }
        A();
    }

    public final void C(boolean z10, boolean z11) {
        int i10;
        if (this.N != z10) {
            this.N = z10;
            pp ppVar = this.G;
            vj0 vj0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = vj0Var.e[0];
                }
                vj0Var.P(i11);
                if (ppVar != null) {
                    ppVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = vj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            vj0Var.N(i10, false, true);
            vj0Var.P(i10);
            if (ppVar != null) {
                ppVar.invalidate();
            }
        }
    }

    public final void D(boolean z10) {
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
        pp ppVar = this.G;
        ppVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        ppVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        ppVar.getLocationInWindow(iArr);
        float f7 = iArr[0];
        float f10 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        ei.db dbVar = new ei.db(this, getContext(), z10, canvas, (ppVar.getMeasuredWidth() / 2.0f) + f7, (ppVar.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 1);
        this.R = dbVar;
        dbVar.setOnTouchListener(new di.d(16));
        this.S = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.T = ofFloat;
        ofFloat.addUpdateListener(new ip(this));
        this.T.addListener(new org.telegram.ui.nq(this, 16));
        this.T.setDuration(400L);
        this.T.setInterpolator(st.e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ah.t(26, this, z10));
    }

    public final void E() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.h6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, o10, o10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.h6.f21211p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f21096j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.h6.g0(i0.a.o(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f32204b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.f32206c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f21152m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, o12, o12));
    }

    public final void F(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.F(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ep(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g6 O0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.O) {
            org.telegram.ui.on onVar = this.f32214n;
            TLRPC.WallPaper wallPaper = onVar.h;
            if (wallPaper == null) {
                wallPaper = this.f32210f;
            }
            onVar.k(this.f32215r, wallPaper, true, Boolean.valueOf(this.f32216s), false);
        }
        if (this.N != this.f32216s) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.f32216s) {
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
                if (this.f32216s) {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str2);
                } else {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str);
                }
            }
            org.telegram.ui.ActionBar.h6.t(O0, false, this.f32216s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        tp tpVar = new tp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.X;
            if (n2Var instanceof kc1) {
                arrayList.addAll(((kc1) n2Var).S0());
                return arrayList;
            }
        }
        ti tiVar = this.Y;
        if (tiVar != null) {
            arrayList.addAll(tiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, tpVar, org.telegram.ui.ActionBar.h6.f21061h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21096j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32217w, 16, new Class[]{r21.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21078i5));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.j6) obj).f21467o = this.f32214n;
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
        r40 r40Var = this.U;
        if (r40Var != null) {
            r40Var.b(true);
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
        org.telegram.ui.qn qnVar = this.v;
        if (qnVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !qnVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            r40 r40Var = new r40(9, getContext(), qnVar.getResourceProvider(), false);
            this.U = r40Var;
            r40Var.setVisibility(4);
            this.U.setShowingDuration(5000L);
            this.U.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.N) {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.U.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new ep(this, 7), 1500L);
            this.container.addView(this.U, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void u(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.u(boolean):void");
    }

    public final void v() {
        if (x()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) {
                public final wp f26957b;

                {
                    this.f26957b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26957b.u(false);
                            return;
                        default:
                            this.f26957b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) {
                public final wp f26957b;

                {
                    this.f26957b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26957b.u(false);
                            return;
                        default:
                            this.f26957b.dismiss();
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
            org.telegram.ui.ActionBar.h6.f20944b = false;
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f32214n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.M.f31849a;
            if (c4Var.f20723a) {
                this.f32214n.k(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f32214n.k(c4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            ti tiVar = this.Y;
            if (tiVar != null) {
                ij ijVar = tiVar.f30581r0;
                if (ijVar != null) {
                    boolean z10 = this.N;
                    za zaVar = ijVar.v;
                    ((ArrayList) zaVar.e).clear();
                    WallpapersListActivity.z0((ArrayList) zaVar.e, z10);
                    zaVar.l();
                }
                this.Y.e1();
            }
            up upVar = this.h;
            if (upVar != null && upVar.d != null) {
                for (int i10 = 0; i10 < upVar.d.size(); i10++) {
                    ((vp) upVar.d.get(i10)).f31851c = this.N ? 1 : 0;
                }
                upVar.l();
            }
        }
    }

    public final boolean x() {
        gg.b bVar;
        if (this.M == null) {
            return false;
        }
        org.telegram.ui.ActionBar.c4 c4Var = this.W;
        gg.b bVar2 = null;
        if (c4Var != null) {
            bVar = c4Var.f20725c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.c4 c4Var2 = this.M.f31849a;
        if (c4Var2 != null) {
            bVar2 = c4Var2.f20725c;
        }
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
    }

    public final void y() {
        if (!this.f32205b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f32205b0 = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new rp(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new sp(this, chatThemeController));
            }
        }
    }

    public final void z(List list) {
        gg.b bVar;
        if (list != null && !list.isEmpty()) {
            vp vpVar = new vp((org.telegram.ui.ActionBar.c4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.V) {
                org.telegram.ui.ActionBar.c4 c4Var = this.f32214n.f39932f;
                this.W = c4Var;
                if (c4Var != null) {
                    c4Var.k();
                }
            }
            arrayList.add(0, vpVar);
            if (!this.V) {
                this.M = vpVar;
            }
            org.telegram.ui.ActionBar.c4 c4Var2 = this.W;
            if (c4Var2 != null) {
                bVar = c4Var2.f20725c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.c4 c4Var3 = (org.telegram.ui.ActionBar.c4) list.get(i10);
                vp vpVar2 = new vp(c4Var3);
                c4Var3.m(this.currentAccount);
                vpVar2.f31851c = this.N ? 1 : 0;
                if (gg.b.a(c4Var3.f20725c, bVar)) {
                    arrayList.add(1, vpVar2);
                    z10 = true;
                } else {
                    arrayList.add(vpVar2);
                }
                i10++;
                z10 = z10;
            }
            org.telegram.ui.ActionBar.c4 c4Var4 = this.W;
            if (c4Var4 != null && !z10) {
                vp vpVar3 = new vp(c4Var4);
                c4Var4.m(this.currentAccount);
                vpVar3.f31851c = this.N ? 1 : 0;
                arrayList.add(1, vpVar3);
            }
            up upVar = this.h;
            upVar.d = arrayList;
            upVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                B(false);
                this.f32217w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            F(true);
        }
    }
}
