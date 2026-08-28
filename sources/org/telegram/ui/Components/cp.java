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
import org.telegram.ui.oc1;
public final class cp extends org.telegram.ui.ActionBar.f3 implements NotificationCenter.NotificationCenterDelegate {
    public static final int f27519e0 = 0;
    public final TextView A;
    public final mi0 B;
    public final vo C;
    public final wo D;
    public final View E;
    public final j6 F;
    public final j6 G;
    public final TextView H;
    public bp I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public kh.eb N;
    public float O;
    public ValueAnimator P;
    public s30 Q;
    public boolean R;
    public org.telegram.ui.ActionBar.b4 S;
    public org.telegram.ui.ActionBar.o2 T;
    public ki U;
    public fh.v V;
    public j6 W;
    public boolean X;
    public eq Y;
    public boolean Z;
    public boolean f27520a0;
    public final ImageView f27521b;
    public TL_stories.TL_premium_boostsStatus f27522b0;
    public final org.telegram.ui.ActionBar.h2 f27523c;
    public float f27524c0;
    public final TextView d;
    public ValueAnimator f27525d0;
    public final TextView f27526e;
    public TLRPC.WallPaper f27527f;
    public final ap h;
    public final org.telegram.ui.on f27528n;
    public final org.telegram.ui.ActionBar.b4 f27529r;
    public final boolean f27530s;
    public final org.telegram.ui.qn v;
    public final wk0 f27531w;
    public final f2.m0 f27532x;
    public final e00 f27533y;

    public cp(org.telegram.ui.qn qnVar, org.telegram.ui.on onVar) {
        super(qnVar.getParentActivity(), onVar, true, false);
        String str;
        boolean z10;
        this.M = -1;
        this.Z = false;
        this.f27520a0 = false;
        this.f27524c0 = 0.0f;
        this.v = qnVar;
        this.f27528n = onVar;
        this.f27529r = onVar.f41205f;
        this.f27527f = onVar.h;
        this.f27530s = org.telegram.ui.ActionBar.f6.I.q();
        ap apVar = new ap(this.currentAccount, qnVar.a(), onVar, 0);
        this.h = apVar;
        setDimBehind(false);
        setCanDismissWithSwipe(false);
        setApplyBottomPadding(false);
        if (Build.VERSION.SDK_INT >= 30) {
            this.navBarColorKey = -1;
            int i9 = org.telegram.ui.ActionBar.f6.f23091i5;
            this.navBarColor = getThemedColor(i9);
            AndroidUtilities.setNavigationBarColor((Dialog) this, getThemedColor(i9), false);
            if (AndroidUtilities.computePerceivedBrightness(this.navBarColor) > 0.721d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightNavigationBar(this, z10);
        } else {
            fixNavigationBar(getThemedColor(org.telegram.ui.ActionBar.f6.f23091i5));
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        setCustomView(frameLayout);
        TextView textView = new TextView(getContext());
        this.A = textView;
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(LocaleController.getString(R.string.SelectTheme));
        textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23108j5));
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.f27521b = imageView;
        int dp = AndroidUtilities.dp(10.0f);
        imageView.setPadding(dp, dp, dp, dp);
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.f27523c = h2Var;
        imageView.setImageDrawable(h2Var);
        imageView.setOnClickListener(new lo(this, 1));
        frameLayout.addView(imageView, g7.e6.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, g7.e6.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        int themedColor = getThemedColor(i10);
        int dp2 = AndroidUtilities.dp(28.0f);
        int i11 = R.raw.sun_outline;
        mi0 mi0Var = new mi0(i11, "" + R.raw.sun_outline, dp2, dp2, false, null);
        this.B = mi0Var;
        this.J = org.telegram.ui.ActionBar.f6.I.q() ^ true;
        A(org.telegram.ui.ActionBar.f6.I.q(), false);
        mi0Var.H(true);
        mi0Var.h = true;
        mi0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        vo voVar = new vo(this, getContext());
        this.C = voVar;
        voVar.setAnimation(mi0Var);
        voVar.setScaleType(ImageView.ScaleType.CENTER);
        voVar.setOnClickListener(new lo(this, 2));
        frameLayout.addView(voVar, g7.e6.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.D = new f2.n0(getContext());
        wk0 wk0Var = new wk0(getContext(), null);
        this.f27531w = wk0Var;
        wk0Var.setAdapter(apVar);
        wk0Var.setDrawSelection(false);
        wk0Var.setClipChildren(false);
        wk0Var.setClipToPadding(false);
        wk0Var.setHasFixedSize(true);
        wk0Var.setItemAnimator(null);
        wk0Var.setNestedScrollingEnabled(false);
        getContext();
        f2.m0 m0Var = new f2.m0(0, false);
        this.f27532x = m0Var;
        wk0Var.setLayoutManager(m0Var);
        wk0Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wk0Var.setOnItemClickListener(new j(this, 3));
        wk0Var.setOnScrollListener(new kn(this, 1));
        e00 e00Var = new e00(getContext(), this.resourcesProvider);
        this.f27533y = e00Var;
        e00Var.setViewType(14);
        e00Var.setVisibility(0);
        frameLayout.addView(e00Var, g7.e6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(wk0Var, g7.e6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.E = view;
        int dp3 = AndroidUtilities.dp(6.0f);
        int themedColor2 = getThemedColor(i10);
        int themedColor3 = getThemedColor(org.telegram.ui.ActionBar.f6.Qh);
        view.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, themedColor2, themedColor3, themedColor3));
        view.setOnClickListener(new lo(this, 3));
        frameLayout.addView(view, g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.H = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.f27527f == null) {
            textView2.setText(LocaleController.getString(R.string.ChooseBackgroundFromGallery));
        } else {
            textView2.setText(LocaleController.getString(R.string.ChooseANewWallpaper));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new androidx.mediarouter.app.y(this, 8));
        frameLayout.addView(textView2, g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        j6 j6Var = new j6(getContext(), true, true, true);
        this.F = j6Var;
        j6Var.getDrawable().n(true);
        j6Var.f29650n = false;
        j6Var.setGravity(17);
        int i12 = org.telegram.ui.ActionBar.f6.Sh;
        j6Var.setTextColor(getThemedColor(i12));
        j6Var.setTextSize(AndroidUtilities.dp(15.0f));
        j6Var.setTypeface(AndroidUtilities.bold());
        frameLayout.addView(j6Var, g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        j6 j6Var2 = new j6(getContext(), true, true, true);
        this.G = j6Var2;
        j6Var2.getDrawable().n(true);
        j6Var2.f29650n = false;
        j6Var2.setGravity(17);
        j6Var2.setTextColor(getThemedColor(i12));
        j6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        j6Var2.setAlpha(0.0f);
        j6Var2.setTranslationY(AndroidUtilities.dp(11.0f));
        frameLayout.addView(j6Var2, g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.f27527f != null) {
            TextView textView3 = new TextView(getContext());
            this.d = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(LocaleController.getString(R.string.RestToDefaultBackground));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new s2(12, this, qnVar));
            frameLayout.addView(textView3, g7.e6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.f27526e = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (qnVar.i() != null) {
                str = UserObject.getFirstName(qnVar.i());
            } else {
                TLRPC.Chat chat = qnVar.f41890e;
                if (chat == null) {
                    str = "";
                } else {
                    str = chat.title;
                }
            }
            textView4.setText(LocaleController.formatString("ChatThemeApplyHint", R.string.ChatThemeApplyHint, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, g7.e6.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        D();
        E(false);
    }

    public static void m(cp cpVar, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        if (cpVar.getContext() == null) {
            return;
        }
        org.telegram.ui.qn qnVar = cpVar.v;
        zf.j0 j0Var = new zf.j0(22, cpVar.currentAccount, cpVar.getContext(), qnVar, cpVar.resourcesProvider);
        j0Var.G1(canApplyBoost);
        j0Var.F1(cpVar.f27522b0, true);
        j0Var.H1(cpVar.v.a());
        j0Var.M0 = new ko(cpVar, 2);
        j0Var.show();
    }

    public static void n(cp cpVar, org.telegram.ui.qn qnVar) {
        if (cpVar.f27527f != null) {
            cpVar.f27527f = null;
            cpVar.dismiss();
            ChatThemeController.getInstance(cpVar.currentAccount).clearWallpaper(qnVar.a(), true);
            return;
        }
        cpVar.dismiss();
    }

    public static void o(cp cpVar, View view, int i9) {
        tp0 tp0Var;
        wk0 wk0Var = cpVar.f27531w;
        ap apVar = cpVar.h;
        if (apVar.d.get(i9) != cpVar.I && cpVar.N == null) {
            cpVar.I = (bp) apVar.d.get(i9);
            cpVar.y();
            apVar.E(i9);
            cpVar.containerView.postDelayed(new ye(cpVar, i9, 1), 100L);
            for (int i10 = 0; i10 < wk0Var.getChildCount(); i10++) {
                a11 a11Var = (a11) wk0Var.getChildAt(i10);
                if (a11Var != view && (tp0Var = a11Var.F) != null) {
                    AndroidUtilities.cancelRunOnUIThread(tp0Var);
                    a11Var.F.run();
                }
            }
            if (!((bp) apVar.d.get(i9)).f27261a.f22748a) {
                ((a11) view).d();
            }
            cpVar.E(true);
        }
    }

    public static void q(cp cpVar, oc1 oc1Var) {
        ?? obj = new Object();
        obj.f23653a = true;
        org.telegram.ui.qn qnVar = cpVar.v;
        oc1Var.f41056a.f41043a = qnVar.getResourceProvider();
        oc1Var.l1 = new uo(cpVar);
        obj.f23655c = new hc(8);
        obj.d = new ko(cpVar, 5);
        obj.f23654b = new ko(cpVar, 6);
        obj.f23656e = true;
        cpVar.T = oc1Var;
        qnVar.showAsSheet(oc1Var, obj);
    }

    public final void A(boolean z10, boolean z11) {
        int i9;
        if (this.J != z10) {
            this.J = z10;
            vo voVar = this.C;
            mi0 mi0Var = this.B;
            int i10 = 0;
            if (z11) {
                if (z10) {
                    i10 = mi0Var.f30847e[0];
                }
                mi0Var.N(i10);
                if (voVar != null) {
                    voVar.d();
                    return;
                }
                return;
            }
            if (z10) {
                i9 = mi0Var.f30847e[0] - 1;
            } else {
                i9 = 0;
            }
            mi0Var.L(i9, false, true);
            mi0Var.N(i9);
            if (voVar != null) {
                voVar.invalidate();
            }
        }
    }

    public final void C(boolean z10) {
        if (isDismissed()) {
            return;
        }
        ValueAnimator valueAnimator = this.P;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FrameLayout frameLayout = (FrameLayout) getWindow().getDecorView();
        Bitmap createBitmap = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        vo voVar = this.C;
        voVar.setAlpha(0.0f);
        ((FrameLayout) this.v.getParentActivity().getWindow().getDecorView()).draw(canvas);
        frameLayout.draw(canvas);
        voVar.setAlpha(1.0f);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        paint2.setFilterBitmap(true);
        int[] iArr = new int[2];
        voVar.getLocationInWindow(iArr);
        float f10 = iArr[0];
        float f11 = iArr[1];
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
        kh.eb ebVar = new kh.eb(this, getContext(), z10, canvas, (voVar.getMeasuredWidth() / 2.0f) + f10, (voVar.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 1);
        this.N = ebVar;
        ebVar.setOnTouchListener(new jh.d(16));
        this.O = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.P = ofFloat;
        ofFloat.addUpdateListener(new oo(this));
        this.P.addListener(new org.telegram.ui.xp(this, 17));
        this.P.setDuration(400L);
        this.P.setInterpolator(xs.f34754e);
        this.P.start();
        frameLayout.addView(this.N, new ViewGroup.LayoutParams(-1, -1));
        AndroidUtilities.runOnUIThread(new eh.f(26, this, z10));
    }

    public final void D() {
        TextView textView = this.f27526e;
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23211p5));
            int dp = AndroidUtilities.dp(6.0f);
            int k10 = i0.a.k(getThemedColor(org.telegram.ui.ActionBar.f6.Oh), 76);
            textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, 0, k10, k10));
        }
        TextView textView2 = this.d;
        if (textView2 != null) {
            int i9 = org.telegram.ui.ActionBar.f6.f23212p7;
            textView2.setTextColor(getThemedColor(i9));
            int dp2 = AndroidUtilities.dp(6.0f);
            int k11 = i0.a.k(getThemedColor(i9), 76);
            textView2.setBackground(org.telegram.ui.ActionBar.f6.i0(dp2, dp2, dp2, dp2, 0, k11, k11));
        }
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        org.telegram.ui.Cells.z f02 = org.telegram.ui.ActionBar.f6.f0(i0.a.k(getThemedColor(i10), 30), 1, -1);
        ImageView imageView = this.f27521b;
        imageView.setBackground(f02);
        int themedColor = getThemedColor(i10);
        org.telegram.ui.ActionBar.h2 h2Var = this.f27523c;
        h2Var.a(themedColor);
        h2Var.b(getThemedColor(i10));
        imageView.invalidate();
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        this.C.setBackground(org.telegram.ui.ActionBar.f6.f0(i0.a.k(getThemedColor(i11), 30), 1, -1));
        int themedColor2 = getThemedColor(org.telegram.ui.ActionBar.f6.f23161m5);
        TextView textView3 = this.H;
        textView3.setTextColor(themedColor2);
        int dp3 = AndroidUtilities.dp(6.0f);
        int k12 = i0.a.k(getThemedColor(i11), 76);
        textView3.setBackground(org.telegram.ui.ActionBar.f6.i0(dp3, dp3, dp3, dp3, 0, k12, k12));
    }

    public final void E(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cp.E(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.emojiLoaded) {
            NotificationCenter.getInstance(this.currentAccount).doOnIdle(new ko(this, 0));
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.e6 N0;
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        super.dismiss();
        this.v.getClass();
        if (!this.K) {
            org.telegram.ui.on onVar = this.f27528n;
            TLRPC.WallPaper wallPaper = onVar.h;
            if (wallPaper == null) {
                wallPaper = this.f27527f;
            }
            onVar.i(this.f27529r, wallPaper, true, Boolean.valueOf(this.f27530s), false);
        }
        if (this.J != this.f27530s) {
            if (org.telegram.ui.ActionBar.f6.I.q() == this.f27530s) {
                N0 = org.telegram.ui.ActionBar.f6.I;
            } else {
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String str = "Blue";
                String string = sharedPreferences.getString("lastDayTheme", "Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string) != null && !org.telegram.ui.ActionBar.f6.N0(string).q()) {
                    str = string;
                }
                String str2 = "Dark Blue";
                String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                if (org.telegram.ui.ActionBar.f6.N0(string2) != null && org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                    str2 = string2;
                }
                if (this.f27530s) {
                    N0 = org.telegram.ui.ActionBar.f6.N0(str2);
                } else {
                    N0 = org.telegram.ui.ActionBar.f6.N0(str);
                }
            }
            org.telegram.ui.ActionBar.f6.t(N0, false, this.f27530s);
        }
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        zo zoVar = new zo(this);
        ArrayList arrayList = new ArrayList();
        if (this.v.f41845a7) {
            org.telegram.ui.ActionBar.o2 o2Var = this.T;
            if (o2Var instanceof oc1) {
                arrayList.addAll(((oc1) o2Var).S0());
                return arrayList;
            }
        }
        ki kiVar = this.U;
        if (kiVar != null) {
            arrayList.addAll(kiVar.getThemeDescriptions());
        }
        int i9 = 0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 32, null, null, new Drawable[]{this.shadowDrawable}, zoVar, org.telegram.ui.ActionBar.f6.f23072h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23108j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f27531w, 16, new Class[]{a11.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23091i5));
        int i10 = org.telegram.ui.ActionBar.f6.Oh;
        View view = this.E;
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 32, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(view, 65568, null, null, null, null, org.telegram.ui.ActionBar.f6.Qh));
        int size = arrayList.size();
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((org.telegram.ui.ActionBar.h6) obj).f23506o = this.f27528n;
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
        s30 s30Var = this.Q;
        if (s30Var != null) {
            s30Var.b(true);
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
            x(chatThemeController.getEmojiThemes(7));
        } else {
            w();
        }
        org.telegram.ui.qn qnVar = this.v;
        if (qnVar.i() != null && SharedConfig.dayNightThemeSwitchHintCount > 0 && !qnVar.i().self) {
            SharedConfig.updateDayNightThemeSwitchHintCount(SharedConfig.dayNightThemeSwitchHintCount - 1);
            s30 s30Var = new s30(9, getContext(), qnVar.getResourceProvider(), false);
            this.Q = s30Var;
            s30Var.setVisibility(4);
            this.Q.setShowingDuration(5000L);
            this.Q.setBottomOffset(-AndroidUtilities.dp(8.0f));
            if (this.J) {
                this.Q.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeDaySwitchTooltip", R.string.ChatThemeDaySwitchTooltip, new Object[0])));
            } else {
                this.Q.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ChatThemeNightSwitchTooltip", R.string.ChatThemeNightSwitchTooltip, new Object[0])));
            }
            AndroidUtilities.runOnUIThread(new ko(this, 7), 1500L);
            this.container.addView(this.Q, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    public final void s(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cp.s(boolean):void");
    }

    public final void t() {
        if (v()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.ChatThemeSaveDialogTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.ChatThemeSaveDialogText);
            alertDialog$Builder.k(LocaleController.getString(R.string.ChatThemeSaveDialogApply), new org.telegram.ui.ActionBar.b2(this) {
                public final cp f31138b;

                {
                    this.f31138b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                    switch (r2) {
                        case 0:
                            this.f31138b.s(false);
                            return;
                        default:
                            this.f31138b.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.h(LocaleController.getString(R.string.ChatThemeSaveDialogDiscard), new org.telegram.ui.ActionBar.b2(this) {
                public final cp f31138b;

                {
                    this.f31138b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
                    switch (r2) {
                        case 0:
                            this.f31138b.s(false);
                            return;
                        default:
                            this.f31138b.dismiss();
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
        if (!isDismissed() && !this.K) {
            org.telegram.ui.ActionBar.f6.f22958b = false;
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f27528n.h;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.I.f27261a;
            if (b4Var.f22748a) {
                this.f27528n.i(null, wallPaper2, false, Boolean.valueOf(this.J), true);
            } else {
                this.f27528n.i(b4Var, wallPaper2, false, Boolean.valueOf(this.J), true);
            }
            ki kiVar = this.U;
            if (kiVar != null) {
                yi yiVar = kiVar.f30137n0;
                if (yiVar != null) {
                    boolean z10 = this.J;
                    ra raVar = yiVar.v;
                    ((ArrayList) raVar.f32121e).clear();
                    WallpapersListActivity.y0((ArrayList) raVar.f32121e, z10);
                    raVar.l();
                }
                this.U.c1();
            }
            ap apVar = this.h;
            if (apVar != null && apVar.d != null) {
                for (int i9 = 0; i9 < apVar.d.size(); i9++) {
                    ((bp) apVar.d.get(i9)).f27263c = this.J ? 1 : 0;
                }
                apVar.l();
            }
        }
    }

    public final boolean v() {
        nf.b bVar;
        if (this.I == null) {
            return false;
        }
        org.telegram.ui.ActionBar.b4 b4Var = this.S;
        nf.b bVar2 = null;
        if (b4Var != null) {
            bVar = b4Var.f22750c;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = nf.b.d("❌");
        }
        org.telegram.ui.ActionBar.b4 b4Var2 = this.I.f27261a;
        if (b4Var2 != null) {
            bVar2 = b4Var2.f22750c;
        }
        if (bVar2 == null) {
            bVar2 = nf.b.d("❌");
        }
        return !nf.b.a(bVar, bVar2);
    }

    public final void w() {
        if (!this.X) {
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            if (chatThemeController.isAllThemesFullyLoaded()) {
                return;
            }
            this.X = true;
            if (chatThemeController.isGiftThemesFullyLoaded()) {
                chatThemeController.requestAllChatThemes(new xo(this, chatThemeController), false);
            } else {
                chatThemeController.loadNextChatThemes(new yo(this, chatThemeController));
            }
        }
    }

    public final void x(List list) {
        nf.b bVar;
        if (list != null && !list.isEmpty()) {
            bp bpVar = new bp((org.telegram.ui.ActionBar.b4) list.get(0));
            ArrayList arrayList = new ArrayList(list.size());
            if (!this.R) {
                org.telegram.ui.ActionBar.b4 b4Var = this.f27528n.f41205f;
                this.S = b4Var;
                if (b4Var != null) {
                    b4Var.l();
                }
            }
            arrayList.add(0, bpVar);
            if (!this.R) {
                this.I = bpVar;
            }
            org.telegram.ui.ActionBar.b4 b4Var2 = this.S;
            if (b4Var2 != null) {
                bVar = b4Var2.f22750c;
            } else {
                bVar = null;
            }
            boolean z10 = false;
            for (int i9 = 1; i9 < list.size(); i9++) {
                org.telegram.ui.ActionBar.b4 b4Var3 = (org.telegram.ui.ActionBar.b4) list.get(i9);
                bp bpVar2 = new bp(b4Var3);
                b4Var3.n(this.currentAccount);
                bpVar2.f27263c = this.J ? 1 : 0;
                if (nf.b.a(b4Var3.f22750c, bVar)) {
                    arrayList.add(1, bpVar2);
                    z10 = true;
                } else {
                    arrayList.add(bpVar2);
                }
            }
            org.telegram.ui.ActionBar.b4 b4Var4 = this.S;
            if (b4Var4 != null && !z10) {
                bp bpVar3 = new bp(b4Var4);
                b4Var4.n(this.currentAccount);
                bpVar3.f27263c = this.J ? 1 : 0;
                arrayList.add(1, bpVar3);
            }
            ap apVar = this.h;
            apVar.d = arrayList;
            apVar.l();
            this.C.setVisibility(0);
            if (!this.R) {
                z(false);
                this.f27531w.animate().alpha(1.0f).setDuration(150L).start();
            }
            this.R = true;
            E(true);
        }
    }

    public final void y() {
        TLRPC.WallPaper wallPaper;
        if (!isDismissed() && !this.K) {
            this.L = false;
            this.v.getClass();
            if (v()) {
                wallPaper = null;
            } else {
                wallPaper = this.f27527f;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            org.telegram.ui.ActionBar.b4 b4Var = this.I.f27261a;
            if (b4Var.f22748a) {
                this.f27528n.i(null, wallPaper2, true, Boolean.valueOf(this.J), false);
                return;
            }
            this.f27528n.i(b4Var, wallPaper2, true, Boolean.valueOf(this.J), false);
        }
    }

    public final void z(boolean z10) {
        ap apVar = this.h;
        ArrayList arrayList = apVar.d;
        org.telegram.ui.ActionBar.b4 b4Var = this.S;
        f2.m0 m0Var = this.f27532x;
        wk0 wk0Var = this.f27531w;
        if (b4Var != null) {
            int i9 = 0;
            while (true) {
                if (i9 != arrayList.size()) {
                    if (nf.b.a(((bp) arrayList.get(i9)).f27261a.f22750c, this.S.f22750c)) {
                        this.I = (bp) arrayList.get(i9);
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 != -1) {
                this.M = i9;
                apVar.E(i9);
                if (i9 > 0 && i9 < arrayList.size() / 2) {
                    i9--;
                }
                int min = Math.min(i9, apVar.d.size() - 1);
                if (z10) {
                    wk0Var.x0(min);
                } else {
                    m0Var.h1(min, 0);
                }
            }
        } else {
            this.I = (bp) arrayList.get(0);
            apVar.E(0);
            if (z10) {
                wk0Var.x0(0);
            } else {
                m0Var.h1(0, 0);
            }
        }
        y();
    }
}
