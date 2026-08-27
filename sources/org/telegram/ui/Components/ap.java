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
import android.text.SpannableStringBuilder;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.nc1;

public final class ap extends org.telegram.ui.ActionBar.e3 implements NotificationCenter.NotificationCenterDelegate {

    public static final int f26776e0 = 0;
    public final TextView A;
    public final oi0 B;
    public final to C;
    public final uo D;
    public final View E;
    public final j6 F;
    public final j6 G;
    public final TextView H;
    public zo I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public lh.bb N;
    public float O;
    public ValueAnimator P;
    public x30 Q;
    public boolean R;
    public org.telegram.ui.ActionBar.b4 S;
    public org.telegram.ui.ActionBar.n2 T;
    public gi U;
    public ag.y1 V;
    public j6 W;
    public boolean X;
    public cq Y;
    public boolean Z;

    public boolean f26777a0;

    public final ImageView f26778b;

    public TL_stories.TL_premium_boostsStatus f26779b0;

    public final org.telegram.ui.ActionBar.g2 f26780c;

    public float f26781c0;
    public final TextView d;

    public ValueAnimator f26782d0;

    public final TextView f26783e;

    public TLRPC.WallPaper f26784f;
    public final yo h;

    public final org.telegram.ui.pn f26785n;

    public final org.telegram.ui.ActionBar.b4 f26786r;

    public final boolean f26787s;
    public final org.telegram.ui.rn v;

    public final zk0 f26788w;

    public final f2.k0 f26789x;

    public final h00 f26790y;

    public ap(org.telegram.ui.rn rnVar, org.telegram.ui.pn pnVar) {
        String firstName;
        super(rnVar.getParentActivity(), pnVar, true, false);
        int i10 = 1;
        this.M = -1;
        this.Z = false;
        this.f26777a0 = false;
        this.f26781c0 = 0.0f;
        this.v = rnVar;
        this.f26785n = pnVar;
        this.f26786r = pnVar.f41395f;
        this.f26784f = pnVar.h;
        this.f26787s = org.telegram.ui.ActionBar.g6.I.q();
        yo yoVar = new yo(this.currentAccount, rnVar.a(), pnVar, 0);
        this.h = yoVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i11 = org.telegram.ui.ActionBar.g6.f23143i5;
            this.navBarColor = getThemedColor(i11);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i11), false);
            AndroidUtilities.setLightNavigationBar(this, ((double) AndroidUtilities.computePerceivedBrightness(this.navBarColor)) > 0.721d);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.g6.f23143i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.A = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23161j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f26778b = imageView;
        int iDp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(iDp, iDp, iDp, iDp);
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f26780c = g2Var;
        imageView.setImageDrawable(g2Var);
        imageView.setOnClickListener(new jo(this, i10));
        frameLayout.addView(imageView, h7.z5.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, h7.z5.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        int themedColor = getThemedColor(i12);
        int iDp2 = AndroidUtilities.dp(28.0f);
        oi0 oi0Var = new oi0(R.raw.sun_outline, "" + R.raw.sun_outline, iDp2, iDp2, false, null);
        this.B = oi0Var;
        this.J = org.telegram.ui.ActionBar.g6.I.q() ^ true;
        C(org.telegram.ui.ActionBar.g6.I.q(), false);
        oi0Var.H(true);
        oi0Var.h = true;
        oi0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        to toVar = new to(this, getContext());
        this.C = toVar;
        toVar.setAnimation(oi0Var);
        toVar.setScaleType(ImageView.ScaleType.CENTER);
        int i13 = 2;
        toVar.setOnClickListener(new jo(this, i13));
        frameLayout.addView(toVar, h7.z5.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.D = new uo(getContext());
        zk0 zk0Var = new zk0(getContext(), null);
        this.f26788w = zk0Var;
        zk0Var.setAdapter(yoVar);
        zk0Var.setDrawSelection(false);
        zk0Var.setClipChildren(false);
        zk0Var.setClipToPadding(false);
        zk0Var.setHasFixedSize(true);
        zk0Var.setItemAnimator(null);
        zk0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.k0 k0Var = new f2.k0(0, false);
        this.f26789x = k0Var;
        zk0Var.setLayoutManager(k0Var);
        zk0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        int i14 = 3;
        zk0Var.setOnItemClickListener(new j(this, i14));
        zk0Var.setOnScrollListener(new xm(this, i13));
        h00 h00Var = new h00(getContext(), this.resourcesProvider);
        this.f26790y = h00Var;
        h00Var.setViewType(14);
        h00Var.setVisibility(0);
        frameLayout.addView(h00Var, h7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(zk0Var, h7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.E = view;
        int iDp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i12);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.g6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new jo(this, i14));
        frameLayout.addView(view, h7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.H = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f26784f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new g.a(this, i14));
        frameLayout.addView(textView2, h7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        j6 j6Var = new j6(getContext(), true, true, true);
        this.F = j6Var;
        j6Var.getDrawable().n(true);
        j6Var.f29635n = false;
        j6Var.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.g6.Sh;
        j6Var.setTextColor(getThemedColor(i15));
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(j6Var, h7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        j6 j6Var2 = new j6(getContext(), true, true, true);
        this.G = j6Var2;
        j6Var2.getDrawable().n(true);
        j6Var2.f29635n = false;
        j6Var2.setGravity(17);
        j6Var2.setTextColor(getThemedColor(i15));
        j6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        j6Var2.setAlpha(0.0f);
        j6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(j6Var2, h7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f26784f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new q2(13, this, rnVar));
            frameLayout.addView(textView3, h7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f26783e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (rnVar.i() != null) {
                firstName = UserObject.getFirstName(rnVar.i());
            } else {
                TLRPC.Chat chat = rnVar.f42026e;
                firstName = chat != null ? chat.title : "";
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, firstName));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, h7.z5.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        E();
        F(false);
    }

    public static void m(ap apVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (apVar.getContext() == null) {
            return;
        }
        org.telegram.ui.rn rnVar = apVar.v;
        ag.i1 i1Var = new ag.i1(22, apVar.currentAccount, apVar.getContext(), rnVar, apVar.resourcesProvider);
        i1Var.G1(canApplyBoost);
        i1Var.F1(apVar.f26779b0, true);
        i1Var.H1(apVar.v.a());
        i1Var.M0 = new io(apVar, 2);
        i1Var.show();
    }

    public static void n(ap apVar, org.telegram.ui.rn rnVar) {
        if (apVar.f26784f == null) {
            apVar.dismiss();
            return;
        }
        apVar.f26784f = null;
        apVar.dismiss();
        ChatThemeController.getInstance(apVar.currentAccount).clearWallpaper(rnVar.a(), true);
    }

    public static void p(ap apVar, View view, int i10) {
        up0 up0Var;
        zk0 zk0Var = apVar.f26788w;
        yo yoVar = apVar.h;
        if (yoVar.d.get(i10) == apVar.I || apVar.N != null) {
            return;
        }
        apVar.I = (zo) yoVar.d.get(i10);
        apVar.z();
        yoVar.E(i10);
        apVar.containerView.postDelayed(new ue(apVar, i10, 1), 100L);
        for (int i11 = 0; i11 < zk0Var.getChildCount(); i11++) {
            b11 b11Var = (b11) zk0Var.getChildAt(i11);
            if (b11Var != view && (up0Var = b11Var.F) != null) {
                AndroidUtilities.cancelRunOnUIThread(up0Var);
                b11Var.F.run();
            }
        }
        if (!((zo) yoVar.d.get(i10)).f35316a.f22780a) {
            ((b11) view).d();
        }
        apVar.F(true);
    }

    public static void r(ap apVar, nc1 nc1Var) {
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        org.telegram.ui.rn rnVar = apVar.v;
        nc1Var.f40735a.f40429a = rnVar.getResourceProvider();
        nc1Var.l1 = new so(apVar);
        l2Var.f23621c = new gc(7);
        l2Var.d = new io(apVar, 5);
        l2Var.f23620b = new io(apVar, 6);
        l2Var.f23622e = true;
        apVar.T = nc1Var;
        rnVar.showAsSheet(nc1Var, l2Var);
    }

    public final void B(boolean z10) {
        yo yoVar = this.h;
        ArrayList arrayList = yoVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.S;
        f2.k0 k0Var = this.f26789x;
        zk0 zk0Var = this.f26788w;
        if (b4Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 == arrayList.size()) {
                    i10 = -1;
                    break;
                } else {
                    if (of.b.a(((zo) arrayList.get(i10)).f35316a.f22782c, this.S.f22782c)) {
                        this.I = (zo) arrayList.get(i10);
                        break;
                    }
                    i10++;
                }
            }
            if (i10 != -1) {
                this.M = i10;
                yoVar.E(i10);
                if (i10 > 0 && i10 < arrayList.size() / 2) {
                    i10--;
                }
                int iMin = Math.min(i10, yoVar.d.size() - 1);
                if (z10) {
                    zk0Var.x0(iMin);
                } else {
                    k0Var.h1(iMin, 0);
                }
            }
        } else {
            this.I = (zo) arrayList.get(0);
            yoVar.E(0);
            if (z10) {
                zk0Var.x0(0);
            } else {
                k0Var.h1(0, 0);
            }
        }
        z();
    }

    public final void C(boolean z10, boolean z11) {
        if (this.J == z10) {
            return;
        }
        this.J = z10;
        to toVar = this.C;
        oi0 oi0Var = this.B;
        if (z11) {
            oi0Var.N(z10 ? oi0Var.f31312e[0] : 0);
            if (toVar != null) {
                toVar.d();
                return;
            }
            return;
        }
        int i10 = z10 ? oi0Var.f31312e[0] - 1 : 0;
        oi0Var.L(i10, false, true);
        oi0Var.N(i10);
        if (toVar != null) {
            toVar.invalidate();
        }
    }

    public final void D(boolean z10) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) this.v.getParentActivity().getWindow().getDecorView();
        FrameLayout frameLayout2 = (FrameLayout) getWindow().getDecorView();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        to toVar = this.C;
        toVar.setAlpha(0.0f);
        frameLayout.draw(canvas);
        frameLayout2.draw(canvas);
        toVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        toVar.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        float measuredWidth = (toVar.getMeasuredWidth() / 2.0f) + f10;
        float measuredHeight = (toVar.getMeasuredHeight() / 2.0f) + f11;
        float fMax = Math.max(bitmapCreateBitmap.getHeight(), bitmapCreateBitmap.getWidth()) * 0.9f;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(bitmapCreateBitmap, tileMode, tileMode));
        lh.bb bbVar = new lh.bb(this, getContext(), z10, canvas, measuredWidth, measuredHeight, fMax, paint, bitmapCreateBitmap, paint2, f10, f11, 1);
        this.N = bbVar;
        bbVar.setOnTouchListener(new kh.e(16));
        this.O = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.P = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new mo(this));
        this.P.addListener(new org.telegram.ui.am(this, 19));
        this.P.setDuration(400L);
        this.P.setInterpolator(ws.f34319e);
        this.P.start();
        frameLayout2.addView(this.N, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new fh.f(26, this, z10));
    }

    public final void E() {
        TextView textView = this.f26783e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23268p5));
            int iDp = AndroidUtilities.dp(6.0f);
            int iK = i0.b.k(getThemedColor(org.telegram.ui.ActionBar.g6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i10 = org.telegram.ui.ActionBar.g6.f23269p7;
            textView2.setTextColor(getThemedColor(i10));
            int iDp2 = AndroidUtilities.dp(6.0f);
            int iK2 = i0.b.k(getThemedColor(i10), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp2, iDp2, iDp2, iDp2, 0, iK2, iK2));
        }
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        org.telegram.ui.Cells.z zVarF0 = org.telegram.ui.ActionBar.g6.f0(i0.b.k(getThemedColor(i11), 30), 1, -1);
        ImageView imageView = this.f26778b;
        imageView.setBackground(zVarF0);
        int themedColor = getThemedColor(i11);
        org.telegram.ui.ActionBar.g2 g2Var = this.f26780c;
        g2Var.a(themedColor);
        g2Var.b(getThemedColor(i11));
        imageView.invalidate();
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        this.C.setBackground(org.telegram.ui.ActionBar.g6.f0(i0.b.k(getThemedColor(i12), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.g6.f23214m5);
        TextView textView3 = this.H;
        textView3.setTextColor(themedColor2);
        int iDp3 = AndroidUtilities.dp(6.0f);
        int iK3 = i0.b.k(getThemedColor(i12), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp3, iDp3, iDp3, iDp3, 0, iK3, iK3));
    }

    public final void F(boolean z10) {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus;
        char c10;
        boolean z11;
        boolean z12;
        ValueAnimator valueAnimator;
        float f10;
        float f11;
        org.telegram.ui.ActionBar.b4 b4Var;
        org.telegram.ui.rn rnVar = this.v;
        TLRPC.Chat chat = rnVar.f42026e;
        int i10 = 0;
        if (chat != null && !this.Z && !this.f26777a0 && this.f26779b0 == null) {
            this.Z = true;
            rnVar.getMessagesController().getBoostsController().getBoostsStats(rnVar.a(), new ko(this, i10));
        }
        boolean z13 = this.R;
        h00 h00Var = this.f26790y;
        TextView textView = this.f26783e;
        j6 j6Var = this.G;
        TextView textView2 = this.d;
        TextView textView3 = this.H;
        org.telegram.ui.ActionBar.g2 g2Var = this.f26780c;
        View view = this.E;
        j6 j6Var2 = this.F;
        if (!z13) {
            g2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(h00Var, true, 1.0f, true, z10);
            return;
        }
        AndroidUtilities.updateViewVisibilityAnimated(h00Var, false, 1.0f, true, z10);
        if (!w()) {
            g2Var.c(1.0f, z10);
            view.setEnabled(false);
            AndroidUtilities.updateViewVisibilityAnimated(textView3, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, false, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j6Var2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j6Var, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView, false, 0.9f, false, z10);
            return;
        }
        g2Var.c(0.0f, z10);
        view.setEnabled(true);
        zo zoVar = this.I;
        if (zoVar == null || (b4Var = zoVar.f35316a) == null || !b4Var.f22780a) {
            j6Var2.setText(LocaleController.getString(R.string.ChatApplyTheme));
            if (chat != null && (tL_premium_boostsStatus = this.f26779b0) != null && tL_premium_boostsStatus.level < rnVar.getMessagesController().channelWallpaperLevelMin) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("l");
                if (this.Y == null) {
                    cq cqVar = new cq(R.drawable.mini_switch_lock, 0);
                    this.Y = cqVar;
                    cqVar.setTopOffset(1);
                }
                spannableStringBuilder.setSpan(this.Y, 0, 1, 33);
                c10 = 1;
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", rnVar.getMessagesController().channelWallpaperLevelMin, new Object[0]));
                j6Var.setText(spannableStringBuilder);
                z11 = true;
            }
            if (z10 || j6Var2.getAlpha() <= 0.8f) {
                z12 = false;
            } else {
                z12 = true;
            }
            valueAnimator = this.f26782d0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f26782d0 = null;
            }
            if (z12) {
                float f12 = this.f26781c0;
                if (z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float[] fArr = new float[2];
                fArr[0] = f12;
                fArr[c10] = f11;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
                this.f26782d0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new e6(this, 13));
                this.f26782d0.addListener(new org.telegram.ui.go(6, this, z11));
                this.f26782d0.start();
            } else {
                if (z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                this.f26781c0 = f10;
                j6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.f26781c0);
            }
            AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j6Var2, true, 0.9f, false, z10);
            AndroidUtilities.updateViewVisibilityAnimated(j6Var, z11, 0.9f, false, 0.7f, z10, null);
            AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z10);
        }
        j6Var2.setText(LocaleController.getString(R.string.ChatResetTheme));
        c10 = 1;
        z11 = false;
        if (z10) {
            z12 = false;
        } else {
            z12 = false;
        }
        valueAnimator = this.f26782d0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f26782d0 = null;
        }
        if (z12) {
            float f13 = this.f26781c0;
            if (z11) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            float[] fArr2 = new float[2];
            fArr2[0] = f13;
            fArr2[c10] = f11;
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(fArr2);
            this.f26782d0 = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new e6(this, 13));
            this.f26782d0.addListener(new org.telegram.ui.go(6, this, z11));
            this.f26782d0.start();
        } else {
            if (z11) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            this.f26781c0 = f10;
            j6Var2.setTranslationY((-AndroidUtilities.dp(7.0f)) * this.f26781c0);
        }
        AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(textView2, false, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(view, true, 1.0f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(j6Var2, true, 0.9f, false, z10);
        AndroidUtilities.updateViewVisibilityAnimated(j6Var, z11, 0.9f, false, 0.7f, z10, null);
        AndroidUtilities.updateViewVisibilityAnimated(textView, true, 0.9f, false, z10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new io(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.f6 f6VarN0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.K) {
            org.telegram.ui.pn pnVar = this.f26785n;
            TLRPC.WallPaper wallPaper = pnVar.h;
            if (wallPaper == null) {
                wallPaper = this.f26784f;
            }
            pnVar.i(this.f26786r, wallPaper, true, Boolean.valueOf(this.f26787s), false);
        }
        if (this.J != this.f26787s) {
            if (org.telegram.ui.ActionBar.g6.I.q() == this.f26787s) {
                f6VarN0 = org.telegram.ui.ActionBar.g6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string) != null && !org.telegram.ui.ActionBar.g6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.g6.N0(string2) != null && org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                    str2 = string2;
                }
                f6VarN0 = this.f26787s ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
            }
            org.telegram.ui.ActionBar.g6.t(f6VarN0, false, this.f26787s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        xo xoVar = new xo(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f41980a7) {
            org.telegram.ui.ActionBar.n2 n2Var = this.T;
            if (n2Var instanceof nc1) {
                arrayList.addAll(((nc1) n2Var).S0());
                return arrayList;
            }
        }
        gi giVar = this.U;
        if (giVar != null) {
            arrayList.addAll(giVar.getThemeDescriptions());
        }
        int i10 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, xoVar, org.telegram.ui.ActionBar.g6.f23124h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f26788w, 16, new Class[]{b11.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23143i5));
        int i11 = org.telegram.ui.ActionBar.g6.Oh;
        View view = this.E;
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 32, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.Qh));
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.i6) obj).f23525o = this.f26785n;
        }
        return arrayList;
    }

    @Override
    public final void onBackPressed() {
        u();
    }

    @Override
    public final boolean onContainerTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || !w()) {
            return false;
        }
        int x8 = (int) motionEvent.getX();
        if (((int) motionEvent.getY()) >= this.containerView.getTop() && x8 >= this.containerView.getLeft() && x8 <= this.containerView.getRight()) {
            return false;
        }
        this.v.getFragmentView().dispatchTouchEvent(motionEvent);
        return true;
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        x30 x30Var = this.Q;
        if (x30Var != null) {
            x30Var.b(true);
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
        this.K = false;
        if (chatThemeController.isAllThemesFullyLoaded()) {
            y(chatThemeController.getEmojiThemes(7));
        } else {
            x();
        }
        org.telegram.ui.rn rnVar = this.v;
        if (rnVar.i() == null || SharedConfig.dayNightThemeSwitchHintCount <= 0 || rnVar.i().self) {
            return;
        }
        SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
        x30 x30Var = new x30(9, getContext(), rnVar.getResourceProvider(), false);
        this.Q = x30Var;
        x30Var.setVisibility(4);
        this.Q.setShowingDuration(5000L);
        this.Q.setBottomOffset(-AndroidUtilities.dp(8.0f));
        if (this.J) {
            this.Q.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
        } else {
            this.Q.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
        }
        AndroidUtilities.runOnUIThread(new io(this, 7), 1500L);
        this.container.addView(this.Q, h7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
    }

    public final void t(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        if (this.Z) {
            return;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.f26779b0;
        int i10 = 1;
        org.telegram.ui.rn rnVar = this.v;
        if (tL_premium_boostsStatus != null && tL_premium_boostsStatus.level < rnVar.getMessagesController().channelWallpaperLevelMin) {
            rnVar.getMessagesController().getBoostsController().userCanBoostChannel(rnVar.a(), this.f26779b0, new ko(this, i10));
            return;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.I.f35316a;
        ec ecVarG = null;
        if (b4Var != this.S) {
            TLRPC.ChatTheme chatTheme = !b4Var.f22780a ? b4Var.d : null;
            long giftThemeUser = b4Var.d instanceof TLRPC.TL_chatThemeUniqueGift ? ChatThemeController.getInstance(b4Var.f22785g).getGiftThemeUser(((TLRPC.TL_chatThemeUniqueGift) b4Var.d).gift.slug) : 0L;
            TLRPC.ChatTheme chatTheme2 = b4Var.d;
            if (chatTheme2 instanceof TLRPC.TL_chatThemeUniqueGift) {
                TL_stars.StarGift starGift = ((TLRPC.TL_chatThemeUniqueGift) chatTheme2).gift;
                if (starGift instanceof TL_stars.TL_starGiftUnique) {
                    tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                } else {
                    tL_starGiftUnique = null;
                }
            } else {
                tL_starGiftUnique = null;
            }
            if (giftThemeUser != 0 && tL_starGiftUnique != null && !z10) {
                y4.n0(getContext(), this.resourcesProvider, this.currentAccount, tL_starGiftUnique, giftThemeUser, new io(this, i10));
                return;
            }
            ChatThemeController.getInstance(this.currentAccount).clearWallpaper(rnVar.a(), false);
            ChatThemeController.getInstance(this.currentAccount).setDialogTheme(rnVar.a(), chatTheme, true);
            TLRPC.WallPaper wallPaper = w() ? null : this.f26785n.h;
            boolean z11 = b4Var.f22780a;
            boolean z12 = this.f26787s;
            if (z11) {
                this.f26785n.i(null, wallPaper, true, Boolean.valueOf(z12), false);
            } else {
                this.f26785n.i(b4Var, wallPaper, true, Boolean.valueOf(z12), false);
            }
            this.K = true;
            TLRPC.User userI = rnVar.i();
            if (userI != null && !userI.self) {
                boolean z13 = b4Var.f22780a;
                kw0 kw0Var = new kw0(getContext(), null, 1, -1, b4Var.f(), rnVar.getResourceProvider());
                kw0Var.f26725c.setVisibility(8);
                TextView textView = kw0Var.f26724b;
                if (z13) {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoDisabledForHint", R.string.ThemeAlsoDisabledForHint, userI.first_name)));
                } else {
                    textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ThemeAlsoAppliedForHint", R.string.ThemeAlsoAppliedForHint, userI.first_name)));
                }
                textView.setTypeface(null);
                ecVarG = ec.g(rnVar, kw0Var, 2750);
            }
        }
        dismiss();
        if (ecVarG != null) {
            ecVarG.j();
        }
    }

    public final void u() {
        if (!w()) {
            dismiss();
            return;
        }
        final int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChatThemeSaveDialogText);
        alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.a2(this) {

            public final ap f30433b;

            {
                this.f30433b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i11) {
                switch (i10) {
                    case 0:
                        this.f30433b.t(false);
                        break;
                    default:
                        this.f30433b.dismiss();
                        break;
                }
            }
        });
        final int i11 = 1;
        alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.a2(this) {

            public final ap f30433b;

            {
                this.f30433b = this;
            }

            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i12) {
                switch (i11) {
                    case 0:
                        this.f30433b.t(false);
                        break;
                    default:
                        this.f30433b.dismiss();
                        break;
                }
            }
        });
        alertDialog$Builder.o();
    }

    public final void v() {
        if (isDismissed() || this.K) {
            return;
        }
        org.telegram.ui.ActionBar.g6.f23010b = false;
        TLRPC.WallPaper wallPaper = w() ? null : this.f26785n.h;
        org.telegram.ui.ActionBar.b4 b4Var = this.I.f35316a;
        if (b4Var.f22780a) {
            this.f26785n.i(null, wallPaper, false, Boolean.valueOf(this.J), true);
        } else {
            this.f26785n.i(b4Var, wallPaper, false, Boolean.valueOf(this.J), true);
        }
        gi giVar = this.U;
        if (giVar != null) {
            ui uiVar = giVar.f28673n0;
            if (uiVar != null) {
                boolean z10 = this.J;
                pa paVar = uiVar.v;
                ((ArrayList) paVar.f31572e).clear();
                WallpapersListActivity.z0((ArrayList) paVar.f31572e, z10);
                paVar.l();
            }
            this.U.c1();
        }
        yo yoVar = this.h;
        if (yoVar == null || yoVar.d == null) {
            return;
        }
        for (int i10 = 0; i10 < yoVar.d.size(); i10++) {
            ((zo) yoVar.d.get(i10)).f35318c = this.J ? 1 : 0;
        }
        yoVar.l();
    }

    public final boolean w() {
        if (this.I == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.S;
        of.b bVarD = b4Var != null ? b4Var.f22782c : null;
        if (bVarD == null) {
            bVarD = of.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.I.f35316a;
        of.b bVarD2 = b4Var2 != null ? b4Var2.f22782c : null;
        if (bVarD2 == null) {
            bVarD2 = of.b.d("❌");
        }
        return !of.b.a(bVarD, bVarD2);
    }

    public final void x() {
        if (this.X) {
            return;
        }
        ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
        if (chatThemeController.isAllThemesFullyLoaded()) {
            return;
        }
        this.X = true;
        if (chatThemeController.isGiftThemesFullyLoaded()) {
            chatThemeController.requestAllChatThemes(new vo(this, chatThemeController), false);
        } else {
            chatThemeController.loadNextChatThemes(new wo(this, chatThemeController));
        }
    }

    public final void y(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zo zoVar = new zo((org.telegram.ui.ActionBar.b4) list.get(0));
        ArrayList arrayList = new ArrayList(list.size());
        if (!this.R) {
            org.telegram.ui.ActionBar.b4 b4Var = this.f26785n.f41395f;
            this.S = b4Var;
            if (b4Var != null) {
                b4Var.l();
            }
        }
        arrayList.add(0, zoVar);
        if (!this.R) {
            this.I = zoVar;
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.S;
        of.b bVar = b4Var2 != null ? b4Var2.f22782c : null;
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i10);
            zo zoVar2 = new zo(b4Var3);
            b4Var3.n(this.currentAccount);
            zoVar2.f35318c = this.J ? 1 : 0;
            if (of.b.a(b4Var3.f22782c, bVar)) {
                arrayList.add(1, zoVar2);
                z10 = true;
            } else {
                arrayList.add(zoVar2);
            }
        }
        org.telegram.ui.ActionBar.b4 b4Var4 = this.S;
        if (b4Var4 != null && !z10) {
            zo zoVar3 = new zo(b4Var4);
            b4Var4.n(this.currentAccount);
            zoVar3.f35318c = this.J ? 1 : 0;
            arrayList.add(1, zoVar3);
        }
        yo yoVar = this.h;
        yoVar.d = arrayList;
        yoVar.l();
        this.C.setVisibility(0);
        if (!this.R) {
            B(false);
            this.f26788w.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.R = true;
        F(true);
    }

    public final void z() {
        if (isDismissed() || this.K) {
            return;
        }
        this.L = false;
        this.v.getClass();
        TLRPC.WallPaper wallPaper = w() ? null : this.f26784f;
        org.telegram.ui.ActionBar.b4 b4Var = this.I.f35316a;
        if (b4Var.f22780a) {
            this.f26785n.i(null, wallPaper, true, Boolean.valueOf(this.J), false);
        } else {
            this.f26785n.i(b4Var, wallPaper, true, Boolean.valueOf(this.J), false);
        }
    }
}
