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
public abstract class n11 extends Dialog {
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
    public final r11 Q;
    public final b11 f50054a;
    public final ImageReceiver f50055b;
    public final Rect f50056c;
    public final Rect d;
    public final Rect f50057e;
    public final Runnable f50058f;
    public final View h;
    public Bitmap f50059n;
    public Paint f50060r;
    public final k0 f50061s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50062w;
    public org.telegram.ui.ActionBar.x2 f50063x;
    public boolean f50064y;

    public n11(r11 r11Var, Context context, Runnable runnable, View view, b11 b11Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.fc b10;
        String str;
        ColorFilter colorFilter;
        this.Q = r11Var;
        Rect rect = new Rect();
        this.f50056c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f50057e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.f50054a = b11Var;
        this.f50058f = runnable;
        this.h = view;
        final h01 h01Var = (h01) this;
        k0 k0Var = new k0(24, context, h01Var);
        this.f50061s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new uv(10, context, h01Var), c8.ma.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 0, context, i6Var);
        this.f50062w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.r0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131745337, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131745335, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131745334, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131745336, null), false, i6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        h01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.M0(2131745332, null), false, i6Var).setOnClickListener(new bd0(12, h01Var, context));
        k0Var.addView(linearLayout, c8.ma.e(-2, -2, 17));
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
            k0Var.setOnApplyWindowInsetsListener(new gz0(h01Var, 1));
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
        if (b11Var != null) {
            b11Var.f45722b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f50055b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = b11Var.d;
        if (document == null) {
            Drawable drawable = b11Var.F;
            if (drawable instanceof org.telegram.ui.Components.o5) {
                document = ((org.telegram.ui.Components.o5) drawable).f37971e;
            }
        }
        if (document != null) {
            org.telegram.messenger.lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.n6.f29561m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.fc.b(document);
                if (d != null) {
                    d.f25488e = 512;
                    d.f25489f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                    d.f25488e = 512;
                    d.f25489f = 512;
                }
                b10 = org.telegram.messenger.fc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.fc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((b11Var.F instanceof org.telegram.ui.Components.o5) && (org.telegram.messenger.fj.C4(document2) || ((org.telegram.ui.Components.o5) b11Var.F).c())) {
                if (!org.telegram.messenger.fj.C4(document2)) {
                    org.telegram.ui.Components.o5 o5Var = (org.telegram.ui.Components.o5) b11Var.F;
                    SparseArray sparseArray = org.telegram.ui.Components.o5.f37962r;
                    if (o5Var == null || !o5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.n6.o0(i6Var);
                        imageReceiver.f22656p1 = colorFilter;
                    }
                }
                colorFilter = r11Var.l1;
                imageReceiver.f22656p1 = colorFilter;
            }
        }
        b11Var.getLocationOnScreen(iArr);
        rect.left = b11Var.getPaddingLeft() + iArr[0];
        rect.top = b11Var.getPaddingTop() + iArr[1];
        rect.right = (b11Var.getWidth() + iArr[0]) - b11Var.getPaddingRight();
        rect.bottom = (b11Var.getHeight() + iArr[1]) - b11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i7 = iArr[1];
        this.F = i7;
        this.G = view.getHeight() + i7;
    }

    public static void a(n11 n11Var, Integer num) {
        Runnable runnable;
        h01 h01Var = (h01) n11Var;
        if (num != null && (runnable = h01Var.T.f48558e.V1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(h01 h01Var, View view, WindowInsets windowInsets) {
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
        ofFloat.addUpdateListener(new iz0(this, 6));
        this.O.addListener(new c30(9, this, z10));
        if (z10) {
            this.O.setDuration(360L);
            this.O.setInterpolator(org.telegram.ui.Components.lr.h);
        } else {
            this.O.setDuration(240L);
            this.O.setInterpolator(org.telegram.ui.Components.lr.f37209g);
        }
        this.O.start();
    }

    public final void d(final boolean z10, j11 j11Var, final j11 j11Var2, final boolean z11) {
        float f10;
        b11 b11Var = this.f50054a;
        if (b11Var == null) {
            if (j11Var != null) {
                j11Var.run();
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
            b11Var.f45722b = true;
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
                n11 n11Var = n11.this;
                n11Var.J = floatValue;
                org.telegram.messenger.g0.X1(n11Var.f50056c, n11Var.d, floatValue, n11Var.f50057e);
                n11Var.f50061s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    n11Var.f50062w.setAlpha(n11Var.J);
                }
                if (n11Var.J < 0.025f && !z12) {
                    if (z11) {
                        n11Var.f50054a.f45722b = false;
                        n11Var.Q.f51438i0.invalidate();
                    }
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25142k1, 4);
                }
                if (n11Var.J < 0.5f && !z12 && (runnable = j11Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.L.addListener(new m11(this, z10, j11Var2, zArr, z11, j11Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(org.telegram.ui.Components.lr.h);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n11.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29396d6, false));
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
        this.f50060r = new Paint(1);
        this.f50059n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25137j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
