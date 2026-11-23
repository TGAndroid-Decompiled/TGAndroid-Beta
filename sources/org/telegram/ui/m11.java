package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class m11 extends Dialog {
    public final int E;
    public final int F;
    public final int G;
    public final int[] H;
    public boolean I;
    public float J;
    public boolean K;
    public ValueAnimator L;
    public float M;
    public boolean N;
    public ValueAnimator O;
    public boolean P;
    public final q11 Q;
    public final a11 f49924a;
    public final ImageReceiver f49925b;
    public final Rect f49926c;
    public final Rect d;
    public final Rect f49927e;
    public final Runnable f49928f;
    public final View h;
    public Bitmap f49929n;
    public Paint f49930r;
    public final k0 f49931s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f49932w;
    public org.telegram.ui.ActionBar.w2 f49933x;
    public boolean f49934y;

    public m11(q11 q11Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.fc b10;
        String str;
        ColorFilter colorFilter;
        this.Q = q11Var;
        Rect rect = new Rect();
        this.f49926c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f49927e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.f49924a = a11Var;
        this.f49928f = runnable;
        this.h = view;
        final g01 g01Var = (g01) this;
        k0 k0Var = new k0(24, context, g01Var);
        this.f49931s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new tv(10, context, g01Var), c8.na.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, 0, context, i6Var);
        this.f49932w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.na.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.q0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745336, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745334, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745333, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745335, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        g01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745331, null), false, i6Var).setOnClickListener(new ig0(10, g01Var, context));
        k0Var.addView(linearLayout, c8.na.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z10 = true;
            k0Var.setOnApplyWindowInsetsListener(new fz0(g01Var, 1));
            attributes.flags |= 1024;
            k0Var.setFitsSystemWindows(true);
            k0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (a11Var != null) {
            a11Var.f45547b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f49925b = imageReceiver;
        imageReceiver.I0(k0Var);
        imageReceiver.F0(7);
        TLRPC.Document document = a11Var.d;
        if (document == null) {
            Drawable drawable = a11Var.F;
            if (drawable instanceof org.telegram.ui.Components.o5) {
                document = ((org.telegram.ui.Components.o5) drawable).f38023e;
            }
        }
        if (document != null) {
            org.telegram.messenger.kz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29616m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.fc.b(document);
                if (d != null) {
                    d.f25409e = 512;
                    d.f25410f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                    d.f25409e = 512;
                    d.f25410f = 512;
                }
                b10 = org.telegram.messenger.fc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.v0(b10, str, org.telegram.messenger.fc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((a11Var.F instanceof org.telegram.ui.Components.o5) && (org.telegram.messenger.fj.C4(document2) || ((org.telegram.ui.Components.o5) a11Var.F).c())) {
                if (!org.telegram.messenger.fj.C4(document2)) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) a11Var.F;
                    SparseArray sparseArray = org.telegram.ui.Components.o5.f38014r;
                    if (o5Var == null || !o5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.n6.o0(i6Var);
                        imageReceiver.f22751p1 = colorFilter;
                    }
                }
                colorFilter = q11Var.l1;
                imageReceiver.f22751p1 = colorFilter;
            }
        }
        a11Var.getLocationOnScreen(iArr);
        rect.left = a11Var.getPaddingLeft() + iArr[0];
        rect.top = a11Var.getPaddingTop() + iArr[1];
        rect.right = (a11Var.getWidth() + iArr[0]) - a11Var.getPaddingRight();
        rect.bottom = (a11Var.getHeight() + iArr[1]) - a11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i7 = iArr[1];
        this.F = i7;
        this.G = view.getHeight() + i7;
    }

    public static void a(m11 m11Var, Integer num) {
        Runnable runnable;
        g01 g01Var = (g01) m11Var;
        if (num != null && (runnable = g01Var.T.f48393e.V1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(g01 g01Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null) {
            if (this.N == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.N = z10;
        float f11 = this.M;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.O = ofFloat;
        ofFloat.addUpdateListener(new hz0(this, 6));
        this.O.addListener(new b30(9, this, z10));
        if (z10) {
            this.O.setDuration(360L);
            this.O.setInterpolator(org.telegram.ui.Components.kr.h);
        } else {
            this.O.setDuration(240L);
            this.O.setInterpolator(org.telegram.ui.Components.kr.f36859g);
        }
        this.O.start();
    }

    public final void d(final boolean z10, i11 i11Var, final i11 i11Var2, final boolean z11) {
        float f10;
        a11 a11Var = this.f49924a;
        if (a11Var == null) {
            if (i11Var != null) {
                i11Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            if (this.K == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.K = z10;
        if (z10) {
            a11Var.f45547b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f11 = this.J;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.L = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m11 m11Var = m11.this;
                m11Var.J = floatValue;
                org.telegram.messenger.g0.X1(m11Var.f49926c, m11Var.d, floatValue, m11Var.f49927e);
                m11Var.f49931s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    m11Var.f49932w.setAlpha(m11Var.J);
                }
                if (m11Var.J < 0.025f && !z12) {
                    if (z11) {
                        m11Var.f49924a.f45547b = false;
                        m11Var.Q.f51247i0.invalidate();
                    }
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25239k1, 4);
                }
                if (m11Var.J < 0.5f && !z12 && (runnable = i11Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.L.addListener(new l11(this, z10, i11Var2, zArr, z11, i11Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(org.telegram.ui.Components.kr.h);
        this.L.start();
    }

    @Override
    public void dismiss() {
        if (this.P) {
            return;
        }
        e(null);
        this.P = true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        if (!dispatchTouchEvent && motionEvent.getAction() == 0) {
            dismiss();
            return false;
        }
        return dispatchTouchEvent;
    }

    public final void e(java.lang.Integer r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m11.e(java.lang.Integer):void");
    }

    public final void f() {
        Activity activity;
        int[] iArr;
        Context context = getContext();
        while (true) {
            if (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                activity = null;
                break;
            }
        }
        if (activity == null) {
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        int measuredWidth = (int) (decorView.getMeasuredWidth() / 12.0f);
        int measuredHeight = (int) (decorView.getMeasuredHeight() / 12.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.083333336f, 0.083333336f);
        canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.M().getLastFragment().getVisibleDialog() != null) {
                launchActivity.M().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.H);
            canvas.save();
            canvas.translate(iArr[0], iArr[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.f49930r = new Paint(1);
        this.f49929n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25234j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
