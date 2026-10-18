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
import org.telegram.ui.mc1;
public final class wp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f32169i0 = 0;
    public final TextView E;
    public final uj0 F;
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
    public q6 f32170a0;
    public final ImageView f32171b;
    public boolean f32172b0;
    public final org.telegram.ui.ActionBar.g2 f32173c;
    public yq f32174c0;
    public final TextView d;
    public boolean f32175d0;
    public final TextView e;
    public boolean f32176e0;
    public TLRPC.WallPaper f32177f;
    public TL_stories.TL_premium_boostsStatus f32178f0;
    public float f32179g0;
    public final up h;
    public ValueAnimator f32180h0;
    public final org.telegram.ui.qn f32181n;
    public final org.telegram.ui.ActionBar.c4 f32182r;
    public final boolean f32183s;
    public final org.telegram.ui.sn v;
    public final im0 f32184w;
    public final s4.b0 f32185x;
    public final b10 f32186y;

    public wp(org.telegram.ui.sn snVar, org.telegram.ui.qn qnVar) {
        super(1, (Context) snVar.getParentActivity(), (org.telegram.ui.ActionBar.d6) qnVar, true);
        String str;
        boolean z10;
        this.Q = -1;
        this.f32175d0 = false;
        this.f32176e0 = false;
        this.f32179g0 = 0.0f;
        this.v = snVar;
        this.f32181n = qnVar;
        this.f32182r = qnVar.f40443f;
        this.f32177f = qnVar.h;
        this.f32183s = org.telegram.ui.ActionBar.h6.I.q();
        up upVar = new up(this.currentAccount, snVar.a(), qnVar, 0);
        this.h = upVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i10 = org.telegram.ui.ActionBar.h6.f21074i5;
            this.navBarColor = getThemedColor(i10);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i10), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.h6.f21074i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.E = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21092j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f32171b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f32173c = g2Var;
        imageView.setImageDrawable(g2Var);
        imageView.setOnClickListener(new fp(this, 1));
        frameLayout.addView(imageView, w7.z5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, w7.z5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        int themedColor = getThemedColor(i11);
        int dp2 = AndroidUtilities.dp(28.0f);
        uj0 uj0Var = new uj0(R.raw.sun_outline, dp2, dp2, false, null);
        this.F = uj0Var;
        this.N = !org.telegram.ui.ActionBar.h6.I.q();
        C(org.telegram.ui.ActionBar.h6.I.q(), false);
        uj0Var.J(true);
        uj0Var.h = true;
        uj0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        pp ppVar = new pp(this, getContext());
        this.G = ppVar;
        ppVar.setAnimation(uj0Var);
        ppVar.setScaleType(ImageView.ScaleType.CENTER);
        ppVar.setOnClickListener(new fp(this, 2));
        frameLayout.addView(ppVar, w7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.H = new s4.c0(getContext());
        im0 im0Var = new im0(getContext(), null);
        this.f32184w = im0Var;
        im0Var.setAdapter(upVar);
        im0Var.setDrawSelection(false);
        im0Var.setClipChildren(false);
        im0Var.setClipToPadding(false);
        im0Var.setHasFixedSize(true);
        im0Var.setItemAnimator(null);
        im0Var.setNestedScrollingEnabled(false);
        getContext();
        s4.b0 b0Var = new s4.b0(0, false);
        this.f32185x = b0Var;
        im0Var.setLayoutManager(b0Var);
        im0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        im0Var.setOnItemClickListener(new j(this, 3));
        im0Var.setOnScrollListener(new ah.d0(this, 29));
        b10 b10Var = new b10(getContext(), this.resourcesProvider);
        this.f32186y = b10Var;
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(im0Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
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
        if (this.f32177f == null) {
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
        q6Var.f29579n = false;
        q6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.h6.Sh;
        q6Var.setTextColor(getThemedColor(i12));
        q6Var.setTextSize(AndroidUtilities.dp(15.0f));
        q6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(q6Var, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        q6 q6Var2 = new q6(getContext(), true, true, true);
        this.K = q6Var2;
        q6Var2.getDrawable().q(true);
        q6Var2.f29579n = false;
        q6Var2.setGravity(17);
        q6Var2.setTextColor(getThemedColor(i12));
        q6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        q6Var2.setAlpha(0.0f);
        q6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(q6Var2, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f32177f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new ca(5, this, snVar));
            frameLayout.addView(textView3, w7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (snVar.i() != null) {
                str = UserObject.getFirstName(snVar.i());
            } else {
                TLRPC.Chat chat = snVar.e;
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
        F();
        G(false);
    }

    public static void n(wp wpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (wpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.sn snVar = wpVar.v;
        sg.k0 k0Var = new sg.k0(22, wpVar.currentAccount, wpVar.getContext(), snVar, wpVar.resourcesProvider);
        k0Var.H1(canApplyBoost);
        k0Var.G1(wpVar.f32178f0, true);
        k0Var.I1(wpVar.v.a());
        k0Var.Q0 = new ep(wpVar, 2);
        k0Var.show();
    }

    public static void o(wp wpVar, org.telegram.ui.sn snVar) {
        if (wpVar.f32177f != null) {
            wpVar.f32177f = null;
            wpVar.dismiss();
            ChatThemeController.getInstance(wpVar.currentAccount).clearWallpaper(snVar.a(), true);
            return;
        }
        wpVar.dismiss();
    }

    public static void p(wp wpVar, View view, int i10) {
        fr0 fr0Var;
        im0 im0Var = wpVar.f32184w;
        up upVar = wpVar.h;
        if (upVar.d.get(i10) != wpVar.M && wpVar.R == null) {
            wpVar.M = (vp) upVar.d.get(i10);
            wpVar.A();
            upVar.E(i10);
            wpVar.containerView.postDelayed(new hf(wpVar, i10, 1), 100L);
            for (int i11 = 0; i11 < im0Var.getChildCount(); i11++) {
                p21 p21Var = (p21) im0Var.getChildAt(i11);
                if (p21Var != view && (fr0Var = p21Var.J) != null) {
                    AndroidUtilities.cancelRunOnUIThread(fr0Var);
                    p21Var.J.run();
                }
            }
            if (!((vp) upVar.d.get(i10)).f31889a.f20719a) {
                ((p21) view).d();
            }
            wpVar.G(true);
        }
    }

    public static void r(wp wpVar, mc1 mc1Var) {
        ?? obj = new Object();
        obj.f21552a = true;
        org.telegram.ui.sn snVar = wpVar.v;
        mc1Var.f39078a.f39067a = snVar.getResourceProvider();
        mc1Var.f39121p1 = new op(wpVar);
        obj.f21554c = new sc(7);
        obj.d = new ep(wpVar, 5);
        obj.f21553b = new ep(wpVar, 6);
        obj.e = true;
        wpVar.X = mc1Var;
        snVar.showAsSheet(mc1Var, obj);
    }

    public final void A() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.O) {
            this.P = false;
            this.v.getClass();
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f32177f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.M.f31889a;
            if (c4Var.f20719a) {
                this.f32181n.k(null, wallPaper2, true, Boolean.valueOf(this.N), false);
                return;
            }
            this.f32181n.k(c4Var, wallPaper2, true, Boolean.valueOf(this.N), false);
        }
    }

    public final void B(boolean z10) {
        up upVar = this.h;
        ArrayList arrayList = upVar.d;
        org.telegram.ui.ActionBar.c4 c4Var = this.W;
        s4.b0 b0Var = this.f32185x;
        im0 im0Var = this.f32184w;
        if (c4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 != arrayList.size()) {
                    if (gg.b.a(((vp) arrayList.get(i10)).f31889a.f20721c, this.W.f20721c)) {
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
                    im0Var.x0(min);
                } else {
                    b0Var.h1(min, 0);
                }
            }
        } else {
            this.M = (vp) arrayList.get(0);
            upVar.E(0);
            if (z10) {
                im0Var.x0(0);
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
            uj0 uj0Var = this.F;
            int i11 = 0;
            if (z11) {
                if (z10) {
                    i11 = uj0Var.e[0];
                }
                uj0Var.P(i11);
                if (ppVar != null) {
                    ppVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i10 = uj0Var.e[0] - 1;
            } else {
                i10 = 0;
            }
            uj0Var.N(i10, false, true);
            uj0Var.P(i10);
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
        this.T.addListener(new org.telegram.ui.pq(this, 16));
        this.T.setDuration(400L);
        this.T.setInterpolator(st.e);
        this.T.start();
        frameLayout.addView(this.R, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new ah.t(26, this, z10));
    }

    public final void F() {
        TextView textView = this.e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.p5));
            int dp = AndroidUtilities.dp(6.0f);
            int o10 = i0.a.o(getThemedColor(org.telegram.ui.ActionBar.h6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, o10, o10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.h6.f21207p7;
            textView2.setTextColor(getThemedColor(i10));
            int dp2 = AndroidUtilities.dp(6.0f);
            int o11 = i0.a.o(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.j0(dp2, dp2, dp2, dp2, 0, o11, o11));
        }
        int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
        org.telegram.ui.Cells.z g02 = org.telegram.ui.ActionBar.h6.g0(i0.a.o(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f32171b;
        imageView.setBackground(g02);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.f32173c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        this.G.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.o(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.h6.f21148m5);
        TextView textView3 = this.L;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int o12 = i0.a.o(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.h6.j0(dp3, dp3, dp3, dp3, 0, o12, o12));
    }

    public final void G(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.G(boolean):void");
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
            org.telegram.ui.qn qnVar = this.f32181n;
            TLRPC.WallPaper wallPaper = qnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f32177f;
            }
            qnVar.k(this.f32182r, wallPaper, true, Boolean.valueOf(this.f32183s), false);
        }
        if (this.N != this.f32183s) {
            if (org.telegram.ui.ActionBar.h6.I.q() == this.f32183s) {
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
                if (this.f32183s) {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str2);
                } else {
                    O0 = org.telegram.ui.ActionBar.h6.O0(str);
                }
            }
            org.telegram.ui.ActionBar.h6.t(O0, false, this.f32183s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        tp tpVar = new tp(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.e7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.X;
            if (n2Var instanceof mc1) {
                arrayList.addAll(((mc1) n2Var).S0());
                return arrayList;
            }
        }
        ti tiVar = this.Y;
        if (tiVar != null) {
            arrayList.addAll(tiVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, tpVar, org.telegram.ui.ActionBar.h6.f21057h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21092j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f32184w, 16, new Class[]{p21.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21074i5));
        int i11 = org.telegram.ui.ActionBar.h6.Oh;
        View view = this.I;
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.h6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.j6) obj).f21463o = this.f32181n;
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
        org.telegram.ui.sn snVar = this.v;
        if (snVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !snVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            r40 r40Var = new r40(9, getContext(), snVar.getResourceProvider(), false);
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

    public final void t(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp.t(boolean):void");
    }

    public final void v() {
        if (x()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) {
                public final wp f26912b;

                {
                    this.f26912b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26912b.t(false);
                            return;
                        default:
                            this.f26912b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) {
                public final wp f26912b;

                {
                    this.f26912b = this;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
                    switch (r2) {
                        case 0:
                            this.f26912b.t(false);
                            return;
                        default:
                            this.f26912b.dismiss();
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
            org.telegram.ui.ActionBar.h6.f20940b = false;
            if (x()) {
                wallPaper = null;
            } else {
                wallPaper = this.f32181n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.c4 c4Var = this.M.f31889a;
            if (c4Var.f20719a) {
                this.f32181n.k(null, wallPaper2, false, Boolean.valueOf(this.N), true);
            } else {
                this.f32181n.k(c4Var, wallPaper2, false, Boolean.valueOf(this.N), true);
            }
            ti tiVar = this.Y;
            if (tiVar != null) {
                ij ijVar = tiVar.f30610r0;
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
                    ((vp) upVar.d.get(i10)).f31891c = this.N ? 1 : 0;
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
            bVar = c4Var.f20721c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = gg.b.d("❌");
        }
        org.telegram.ui.ActionBar.c4 c4Var2 = this.M.f31889a;
        if (c4Var2 != null) {
            bVar2 = c4Var2.f20721c;
        }
        if (bVar2 == null) {
            bVar2 = gg.b.d("❌");
        }
        return !gg.b.a(bVar, bVar2);
    }

    public final void y() {
        if (!this.f32172b0) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.f32172b0 = true;
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
                org.telegram.ui.ActionBar.c4 c4Var = this.f32181n.f40443f;
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
                bVar = c4Var2.f20721c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            int i10 = 1;
            while (i10 < list.size()) {
                org.telegram.ui.ActionBar.c4 c4Var3 = (org.telegram.ui.ActionBar.c4) list.get(i10);
                vp vpVar2 = new vp(c4Var3);
                c4Var3.m(this.currentAccount);
                vpVar2.f31891c = this.N ? 1 : 0;
                if (gg.b.a(c4Var3.f20721c, bVar)) {
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
                vpVar3.f31891c = this.N ? 1 : 0;
                arrayList.add(1, vpVar3);
            }
            up upVar = this.h;
            upVar.d = arrayList;
            upVar.l();
            this.G.setVisibility(0);
            if (!this.V) {
                B(false);
                this.f32184w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.V = true;
            G(true);
        }
    }
}
