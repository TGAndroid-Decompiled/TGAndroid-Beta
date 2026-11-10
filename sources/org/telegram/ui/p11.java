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
public abstract class p11 extends Dialog {
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
    public final t11 P;
    public final d11 f48617a;
    public final ImageReceiver f48618b;
    public final Rect f48619c;
    public final Rect d;
    public final Rect f48620e;
    public final Runnable f48621f;
    public final View h;
    public Bitmap f48622n;
    public Paint f48623r;
    public final k0 f48624s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f48625w;
    public org.telegram.ui.ActionBar.w2 f48626x;
    public boolean f48627y;

    public p11(t11 t11Var, Context context, Runnable runnable, View view, d11 d11Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z9;
        org.telegram.messenger.hc b10;
        String str;
        ColorFilter colorFilter;
        this.P = t11Var;
        Rect rect = new Rect();
        this.f48619c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f48620e = rect3;
        int[] iArr = new int[2];
        this.G = iArr;
        this.H = false;
        this.O = false;
        this.f48617a = d11Var;
        this.f48621f = runnable;
        this.h = view;
        final j01 j01Var = (j01) this;
        k0 k0Var = new k0(24, context, j01Var);
        this.f48624s = k0Var;
        setContentView(k0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new o00(9, context, j01Var), c8.ha.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232565, 0, context, h6Var);
        this.f48625w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, c8.ha.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.r0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745532, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745530, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745529, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745531, null), false, h6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        j01Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.r0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.id.M0(2131745527, null), false, h6Var).setOnClickListener(new ik0(8, j01Var, context));
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
            k0Var.setOnApplyWindowInsetsListener(new iz0(j01Var, 1));
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
        if (d11Var != null) {
            d11Var.f44872b = z9;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f48618b = imageReceiver;
        imageReceiver.H0(k0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = d11Var.d;
        if (document == null) {
            Drawable drawable = d11Var.E;
            if (drawable instanceof org.telegram.ui.Components.h5) {
                document = ((org.telegram.ui.Components.h5) drawable).f34171e;
            }
        }
        if (document != null) {
            org.telegram.messenger.rz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.m6.f28055m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.hc.b(document);
                if (d != null) {
                    d.f25386e = 512;
                    d.f25387f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.ij.K2(document, false)) {
                    d.f25386e = 512;
                    d.f25387f = 512;
                }
                b10 = org.telegram.messenger.hc.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.hc.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((d11Var.E instanceof org.telegram.ui.Components.h5) && (org.telegram.messenger.ij.C4(document2) || ((org.telegram.ui.Components.h5) d11Var.E).c())) {
                if (!org.telegram.messenger.ij.C4(document2)) {
                    org.telegram.ui.Components.h5 h5Var = (org.telegram.ui.Components.h5) d11Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.h5.f34162r;
                    if (h5Var == null || !h5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.m6.o0(h6Var);
                        imageReceiver.f21214o1 = colorFilter;
                    }
                }
                colorFilter = t11Var.f50043k1;
                imageReceiver.f21214o1 = colorFilter;
            }
        }
        d11Var.getLocationOnScreen(iArr);
        rect.left = d11Var.getPaddingLeft() + iArr[0];
        rect.top = d11Var.getPaddingTop() + iArr[1];
        rect.right = (d11Var.getWidth() + iArr[0]) - d11Var.getPaddingRight();
        rect.bottom = (d11Var.getHeight() + iArr[1]) - d11Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        int i7 = iArr[1];
        this.E = i7;
        this.F = view.getHeight() + i7;
    }

    public static void a(p11 p11Var, Integer num) {
        Runnable runnable;
        j01 j01Var = (j01) p11Var;
        if (num != null && (runnable = j01Var.S.f47131e.U1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(j01 j01Var, View view, WindowInsets windowInsets) {
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
        ofFloat.addUpdateListener(new kz0(this, 6));
        this.N.addListener(new c50(8, this, z9));
        if (z9) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.wq.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.wq.f40047g);
        }
        this.N.start();
    }

    public final void d(final boolean z9, l11 l11Var, final l11 l11Var2, final boolean z10) {
        float f10;
        d11 d11Var = this.f48617a;
        if (d11Var == null) {
            if (l11Var != null) {
                l11Var.run();
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
            d11Var.f44872b = true;
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
                p11 p11Var = p11.this;
                p11Var.I = floatValue;
                org.telegram.messenger.g0.X1(p11Var.f48619c, p11Var.d, floatValue, p11Var.f48620e);
                p11Var.f48624s.invalidate();
                boolean z11 = z9;
                if (!z11) {
                    p11Var.f48625w.setAlpha(p11Var.I);
                }
                if (p11Var.I < 0.025f && !z11) {
                    if (z10) {
                        p11Var.f48617a.f44872b = false;
                        p11Var.P.f50036h0.invalidate();
                    }
                    org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25030k1, 4);
                }
                if (p11Var.I < 0.5f && !z11 && (runnable = l11Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.K.addListener(new o11(this, z9, l11Var2, zArr, z10, l11Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.wq.h);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p11.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false));
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
        this.f48623r = new Paint(1);
        this.f48622n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25025j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
