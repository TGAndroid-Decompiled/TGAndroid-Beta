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
    public final int D;
    public final int E;
    public final int F;
    public final int[] G;
    public boolean H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public float L;
    public boolean M;
    public ValueAnimator N;
    public boolean O;
    public final q11 P;
    public final a11 f47621a;
    public final ImageReceiver f47622b;
    public final Rect f47623c;
    public final Rect d;
    public final Rect f47624e;
    public final Runnable f47625f;
    public final View h;
    public Bitmap f47626n;
    public Paint f47627r;
    public final k0 f47628s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f47629w;
    public org.telegram.ui.ActionBar.v2 f47630x;
    public boolean f47631y;

    public m11(q11 q11Var, Context context, Runnable runnable, View view, a11 a11Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z9;
        org.telegram.messenger.hc b10;
        String str;
        ColorFilter colorFilter;
        this.P = q11Var;
        Rect rect = new Rect();
        this.f47623c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f47624e = rect3;
        int[] iArr = new int[2];
        this.G = iArr;
        this.H = false;
        this.O = false;
        this.f47621a = a11Var;
        this.f47625f = runnable;
        this.h = view;
        final g01 g01Var = (g01) this;
        k0 k0Var = new k0(24, context, g01Var);
        this.f47628s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new l00(9, context, g01Var), c8.ha.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 0, context, f6Var);
        this.f47629w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.r0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745533, null), false, f6Var).setOnClickListener(new View.OnClickListener() {
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
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745531, null), false, f6Var).setOnClickListener(new View.OnClickListener() {
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
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745530, null), false, f6Var).setOnClickListener(new View.OnClickListener() {
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
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745532, null), false, f6Var).setOnClickListener(new View.OnClickListener() {
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
        org.telegram.ui.ActionBar.r0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.hd.M0(2131745528, null), false, f6Var).setOnClickListener(new fk0(8, g01Var, context));
        k0Var.addView(linearLayout, c8.ha.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z9 = true;
            k0Var.setOnApplyWindowInsetsListener(new ez0(g01Var, 1));
            attributes.flags |= 1024;
            k0Var.setFitsSystemWindows(true);
            k0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z9 = true;
        }
        if (a11Var != null) {
            a11Var.f43530b = z9;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f47622b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = a11Var.d;
        if (document == null) {
            Drawable drawable = a11Var.E;
            if (drawable instanceof org.telegram.ui.Components.i5) {
                document = ((org.telegram.ui.Components.i5) drawable).f34492e;
            }
        }
        if (document != null) {
            org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28014m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.hc.b(document);
                if (d != null) {
                    d.f25386e = 512;
                    d.f25387f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.ij.L2(document, false)) {
                    d.f25386e = 512;
                    d.f25387f = 512;
                }
                b10 = org.telegram.messenger.hc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.hc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((a11Var.E instanceof org.telegram.ui.Components.i5) && (org.telegram.messenger.ij.D4(document2) || ((org.telegram.ui.Components.i5) a11Var.E).c())) {
                if (!org.telegram.messenger.ij.D4(document2)) {
                    org.telegram.ui.Components.i5 i5Var = (org.telegram.ui.Components.i5) a11Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.i5.f34483r;
                    if (i5Var == null || !i5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.k6.o0(f6Var);
                        imageReceiver.f21206o1 = colorFilter;
                    }
                }
                colorFilter = q11Var.f49041k1;
                imageReceiver.f21206o1 = colorFilter;
            }
        }
        a11Var.getLocationOnScreen(iArr);
        rect.left = a11Var.getPaddingLeft() + iArr[0];
        rect.top = a11Var.getPaddingTop() + iArr[1];
        rect.right = (a11Var.getWidth() + iArr[0]) - a11Var.getPaddingRight();
        rect.bottom = (a11Var.getHeight() + iArr[1]) - a11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        int i7 = iArr[1];
        this.E = i7;
        this.F = view.getHeight() + i7;
    }

    public static void a(m11 m11Var, Integer num) {
        Runnable runnable;
        g01 g01Var = (g01) m11Var;
        if (num != null && (runnable = g01Var.S.f46179e.U1) != null) {
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

    public final void c(boolean z9) {
        float f10;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            if (this.M == z9) {
                return;
            }
            valueAnimator.cancel();
        }
        this.M = z9;
        float f11 = this.L;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new gz0(this, 6));
        this.N.addListener(new z40(8, this, z9));
        if (z9) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.xq.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.xq.f40346g);
        }
        this.N.start();
    }

    public final void d(final boolean z9, i11 i11Var, final i11 i11Var2, final boolean z10) {
        float f10;
        a11 a11Var = this.f47621a;
        if (a11Var == null) {
            if (i11Var != null) {
                i11Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z9) {
                return;
            }
            valueAnimator.cancel();
        }
        this.J = z9;
        if (z9) {
            a11Var.f43530b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f11 = this.I;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m11 m11Var = m11.this;
                m11Var.I = floatValue;
                org.telegram.messenger.g0.X1(m11Var.f47623c, m11Var.d, floatValue, m11Var.f47624e);
                m11Var.f47628s.invalidate();
                boolean z11 = z9;
                if (!z11) {
                    m11Var.f47629w.setAlpha(m11Var.I);
                }
                if (m11Var.I < 0.025f && !z11) {
                    if (z10) {
                        m11Var.f47621a.f43530b = false;
                        m11Var.P.f49034h0.invalidate();
                    }
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25017k1, 4);
                }
                if (m11Var.I < 0.5f && !z11 && (runnable = i11Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.K.addListener(new l11(this, z9, i11Var2, zArr, z10, i11Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.xq.h);
        this.K.start();
    }

    @Override
    public void dismiss() {
        if (this.O) {
            return;
        }
        e(null);
        this.O = true;
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
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27849d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.M().getLastFragment().getVisibleDialog() != null) {
                launchActivity.M().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.G);
            canvas.save();
            canvas.translate(iArr[0], iArr[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.f47627r = new Paint(1);
        this.f47626n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25012j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
