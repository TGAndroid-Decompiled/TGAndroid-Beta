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
public abstract class e31 extends Dialog {
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
    public final i31 P;
    public final s21 f36903a;
    public final ImageReceiver f36904b;
    public final Rect f36905c;
    public final Rect d;
    public final Rect e;
    public final Runnable f36906f;
    public final View h;
    public Bitmap f36907n;
    public Paint f36908r;
    public final l0 f36909s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f36910w;
    public org.telegram.ui.ActionBar.z2 f36911x;
    public boolean f36912y;

    public e31(i31 i31Var, Context context, Runnable runnable, View view, s21 s21Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.ic b10;
        String str;
        ColorFilter colorFilter;
        this.P = i31Var;
        Rect rect = new Rect();
        this.f36905c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.G = iArr;
        this.H = false;
        this.O = false;
        this.f36903a = s21Var;
        this.f36906f = runnable;
        this.h = view;
        final y11 y11Var = (y11) this;
        l0 l0Var = new l0(y11Var, context, 25);
        this.f36909s = l0Var;
        setContentView(l0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new do0(y11Var, context, 5), w7.b6.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232562, 0, context, p6Var);
        this.f36910w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, w7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.t0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131745549, null), false, p6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131745547, null), false, p6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131745546, null), false, p6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131745548, null), false, p6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        y11Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.t0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.cd.L0(2131745544, null), false, p6Var).setOnClickListener(new rv0(2, y11Var, context));
        l0Var.addView(linearLayout, w7.b6.e(-2, -2, 17));
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
            l0Var.setOnApplyWindowInsetsListener(new s01(y11Var, 1));
            attributes.flags |= 1024;
            l0Var.setFitsSystemWindows(true);
            l0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z10 = true;
        }
        if (s21Var != null) {
            s21Var.f41357b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f36904b = imageReceiver;
        imageReceiver.H0(l0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = s21Var.d;
        if (document == null) {
            Drawable drawable = s21Var.E;
            if (drawable instanceof org.telegram.ui.Components.f5) {
                document = ((org.telegram.ui.Components.f5) drawable).e;
            }
        }
        if (document != null) {
            org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(document.thumbs, org.telegram.ui.ActionBar.t6.f21095m6, 0.2f, false);
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.ic.b(document);
                if (d != null) {
                    d.e = 512;
                    d.f14875f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.jj.K2(document, false)) {
                    d.e = 512;
                    d.f14875f = 512;
                }
                b10 = org.telegram.messenger.ic.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.ic.c(w9, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((s21Var.E instanceof org.telegram.ui.Components.f5) && (org.telegram.messenger.jj.C4(document2) || ((org.telegram.ui.Components.f5) s21Var.E).c())) {
                if (!org.telegram.messenger.jj.C4(document2)) {
                    org.telegram.ui.Components.f5 f5Var = (org.telegram.ui.Components.f5) s21Var.E;
                    SparseArray sparseArray = org.telegram.ui.Components.f5.f25962r;
                    if (f5Var == null || !f5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.t6.o0(p6Var);
                        imageReceiver.f14397o1 = colorFilter;
                    }
                }
                colorFilter = i31Var.f38136k1;
                imageReceiver.f14397o1 = colorFilter;
            }
        }
        s21Var.getLocationOnScreen(iArr);
        rect.left = s21Var.getPaddingLeft() + iArr[0];
        rect.top = s21Var.getPaddingTop() + iArr[1];
        rect.right = (s21Var.getWidth() + iArr[0]) - s21Var.getPaddingRight();
        rect.bottom = (s21Var.getHeight() + iArr[1]) - s21Var.getPaddingBottom();
        org.telegram.messenger.i0.X1(rect, rect2, this.I, rect3);
        view.getLocationOnScreen(iArr);
        this.D = iArr[0];
        int i10 = iArr[1];
        this.E = i10;
        this.F = view.getHeight() + i10;
    }

    public static void a(e31 e31Var, Integer num) {
        Runnable runnable;
        y11 y11Var = (y11) e31Var;
        if (num != null && (runnable = y11Var.S.e.U1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(y11 y11Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.N;
        if (valueAnimator != null) {
            if (this.M == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.M = z10;
        float f10 = this.L;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.N = ofFloat;
        ofFloat.addUpdateListener(new u01(this, 6));
        this.N.addListener(new org.telegram.ui.Components.ha0(24, this, z10));
        if (z10) {
            this.N.setDuration(360L);
            this.N.setInterpolator(org.telegram.ui.Components.gr.h);
        } else {
            this.N.setDuration(240L);
            this.N.setInterpolator(org.telegram.ui.Components.gr.f26496g);
        }
        this.N.start();
    }

    public final void d(final boolean z10, a31 a31Var, final a31 a31Var2, final boolean z11) {
        float f7;
        s21 s21Var = this.f36903a;
        if (s21Var == null) {
            if (a31Var != null) {
                a31Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z10) {
                return;
            }
            valueAnimator.cancel();
        }
        this.J = z10;
        if (z10) {
            s21Var.f41357b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f10 = this.I;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                e31 e31Var = e31.this;
                e31Var.I = floatValue;
                org.telegram.messenger.i0.X1(e31Var.f36905c, e31Var.d, floatValue, e31Var.e);
                e31Var.f36909s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    e31Var.f36910w.setAlpha(e31Var.I);
                }
                if (e31Var.I < 0.025f && !z12) {
                    if (z11) {
                        e31Var.f36903a.f41357b = false;
                        e31Var.P.f38129h0.invalidate();
                    }
                    org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 4);
                }
                if (e31Var.I < 0.5f && !z12 && (runnable = a31Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.K.addListener(new d31(this, z10, a31Var2, zArr, z11, a31Var));
        this.K.setDuration(420L);
        this.K.setInterpolator(org.telegram.ui.Components.gr.h);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e31.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
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
        this.f36908r = new Paint(1);
        this.f36907n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19633j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
