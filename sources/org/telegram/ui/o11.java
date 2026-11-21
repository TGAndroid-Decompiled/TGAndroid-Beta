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
public abstract class o11 extends Dialog {
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
    public final s11 Q;
    public final c11 f50394a;
    public final ImageReceiver f50395b;
    public final Rect f50396c;
    public final Rect d;
    public final Rect f50397e;
    public final Runnable f50398f;
    public final View h;
    public Bitmap f50399n;
    public Paint f50400r;
    public final k0 f50401s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f50402w;
    public org.telegram.ui.ActionBar.w2 f50403x;
    public boolean f50404y;

    public o11(s11 s11Var, Context context, Runnable runnable, View view, c11 c11Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.fc b10;
        String str;
        ColorFilter colorFilter;
        this.Q = s11Var;
        Rect rect = new Rect();
        this.f50396c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f50397e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.f50394a = c11Var;
        this.f50398f = runnable;
        this.h = view;
        final i01 i01Var = (i01) this;
        k0 k0Var = new k0(24, context, i01Var);
        this.f50401s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new uv(10, context, i01Var), c8.ma.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 0, context, h6Var);
        this.f50402w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ma.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.q0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745336, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745334, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745333, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745335, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        i01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.gd.N0(2131745331, null), false, h6Var).setOnClickListener(new jg0(10, i01Var, context));
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
            k0Var.setOnApplyWindowInsetsListener(new gz0(i01Var, 1));
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
        if (c11Var != null) {
            c11Var.f46379b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f50395b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = c11Var.d;
        if (document == null) {
            Drawable drawable = c11Var.F;
            if (drawable instanceof org.telegram.ui.Components.p5) {
                document = ((org.telegram.ui.Components.p5) drawable).f38496e;
            }
        }
        if (document != null) {
            org.telegram.messenger.lz d = org.telegram.messenger.u5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f29543m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.fc.b(document);
                if (d != null) {
                    d.f25514e = 512;
                    d.f25515f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.fj.K2(document, false)) {
                    d.f25514e = 512;
                    d.f25515f = 512;
                }
                b10 = org.telegram.messenger.fc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.fc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((c11Var.F instanceof org.telegram.ui.Components.p5) && (org.telegram.messenger.fj.C4(document2) || ((org.telegram.ui.Components.p5) c11Var.F).c())) {
                if (!org.telegram.messenger.fj.C4(document2)) {
                    org.telegram.ui.Components.p5 p5Var = (org.telegram.ui.Components.p5) c11Var.F;
                    SparseArray sparseArray = org.telegram.ui.Components.p5.f38487r;
                    if (p5Var == null || !p5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.m6.o0(h6Var);
                        imageReceiver.f22681p1 = colorFilter;
                    }
                }
                colorFilter = s11Var.l1;
                imageReceiver.f22681p1 = colorFilter;
            }
        }
        c11Var.getLocationOnScreen(iArr);
        rect.left = c11Var.getPaddingLeft() + iArr[0];
        rect.top = c11Var.getPaddingTop() + iArr[1];
        rect.right = (c11Var.getWidth() + iArr[0]) - c11Var.getPaddingRight();
        rect.bottom = (c11Var.getHeight() + iArr[1]) - c11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i7 = iArr[1];
        this.F = i7;
        this.G = view.getHeight() + i7;
    }

    public static void a(o11 o11Var, Integer num) {
        Runnable runnable;
        i01 i01Var = (i01) o11Var;
        if (num != null && (runnable = i01Var.T.f48857e.V1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(i01 i01Var, View view, WindowInsets windowInsets) {
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
            this.O.setInterpolator(org.telegram.ui.Components.nr.h);
        } else {
            this.O.setDuration(240L);
            this.O.setInterpolator(org.telegram.ui.Components.nr.f37957g);
        }
        this.O.start();
    }

    public final void d(final boolean z10, k11 k11Var, final k11 k11Var2, final boolean z11) {
        float f10;
        c11 c11Var = this.f50394a;
        if (c11Var == null) {
            if (k11Var != null) {
                k11Var.run();
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
            c11Var.f46379b = true;
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
                o11 o11Var = o11.this;
                o11Var.J = floatValue;
                org.telegram.messenger.g0.X1(o11Var.f50396c, o11Var.d, floatValue, o11Var.f50397e);
                o11Var.f50401s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    o11Var.f50402w.setAlpha(o11Var.J);
                }
                if (o11Var.J < 0.025f && !z12) {
                    if (z11) {
                        o11Var.f50394a.f46379b = false;
                        o11Var.Q.f51840i0.invalidate();
                    }
                    org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25168k1, 4);
                }
                if (o11Var.J < 0.5f && !z12 && (runnable = k11Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.L.addListener(new n11(this, z10, k11Var2, zArr, z11, k11Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(org.telegram.ui.Components.nr.h);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.o11.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29378d6, false));
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
        this.f50400r = new Paint(1);
        this.f50399n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25163j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
