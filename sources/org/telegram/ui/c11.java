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
public abstract class c11 extends Dialog {
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
    public final g11 Q;
    public final q01 f44190a;
    public final ImageReceiver f44191b;
    public final Rect f44192c;
    public final Rect d;
    public final Rect f44193e;
    public final Runnable f44194f;
    public final View h;
    public Bitmap f44195n;
    public Paint f44196r;
    public final l0 f44197s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout f44198w;
    public org.telegram.ui.ActionBar.t2 f44199x;
    public boolean f44200y;

    public c11(g11 g11Var, Context context, Runnable runnable, View view, q01 q01Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        org.telegram.messenger.ac b10;
        String str;
        ColorFilter colorFilter;
        this.Q = g11Var;
        Rect rect = new Rect();
        this.f44192c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.f44193e = rect3;
        int[] iArr = new int[2];
        this.H = iArr;
        this.I = false;
        this.P = false;
        this.f44190a = q01Var;
        this.f44194f = runnable;
        this.h = view;
        final wz0 wz0Var = (wz0) this;
        l0 l0Var = new l0(24, context, wz0Var);
        this.f44197s = l0Var;
        setContentView(l0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new org.telegram.ui.Components.voip.r0(11, context, wz0Var), b8.mf.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232563, 0, context, e6Var);
        this.f44198w = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, b8.mf.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.q0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745542, null), false, e6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745540, null), false, e6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745539, null), false, e6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745541, null), false, e6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        wz0Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.q0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, org.telegram.messenger.bd.M0(2131745537, null), false, e6Var).setOnClickListener(new hb0(14, wz0Var, context));
        l0Var.addView(linearLayout, b8.mf.e(-2, -2, 17));
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
            l0Var.setOnApplyWindowInsetsListener(new uy0(wz0Var, 1));
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
        if (q01Var != null) {
            q01Var.f48718b = z10;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.f44191b = imageReceiver;
        imageReceiver.H0(l0Var);
        imageReceiver.E0(7);
        TLRPC.Document document = q01Var.d;
        if (document == null) {
            Drawable drawable = q01Var.F;
            if (drawable instanceof org.telegram.ui.Components.g5) {
                document = ((org.telegram.ui.Components.g5) drawable).f33966e;
            }
        }
        if (document != null) {
            org.telegram.messenger.jz d = org.telegram.messenger.t5.d(document.thumbs, org.telegram.ui.ActionBar.k6.f28043m6, 0.2f, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(document.thumbs, 90, false, null, false);
            if ("video/webm".equals(document.mime_type)) {
                b10 = org.telegram.messenger.ac.b(document);
                if (d != null) {
                    d.f23763e = 512;
                    d.f23764f = 512;
                }
                str = "160_160_g";
            } else {
                if (d != null && org.telegram.messenger.zi.L2(document, false)) {
                    d.f23763e = 512;
                    d.f23764f = 512;
                }
                b10 = org.telegram.messenger.ac.b(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.u0(b10, str, org.telegram.messenger.ac.c(w10, document), "160_160", null, null, d, document.size, null, document2, 1);
            if ((q01Var.F instanceof org.telegram.ui.Components.g5) && (org.telegram.messenger.zi.D4(document2) || ((org.telegram.ui.Components.g5) q01Var.F).c())) {
                if (!org.telegram.messenger.zi.D4(document2)) {
                    org.telegram.ui.Components.g5 g5Var = (org.telegram.ui.Components.g5) q01Var.F;
                    SparseArray sparseArray = org.telegram.ui.Components.g5.f33957r;
                    if (g5Var == null || !g5Var.k()) {
                        colorFilter = org.telegram.ui.ActionBar.k6.o0(e6Var);
                        imageReceiver.f21261p1 = colorFilter;
                    }
                }
                colorFilter = g11Var.f45462l1;
                imageReceiver.f21261p1 = colorFilter;
            }
        }
        q01Var.getLocationOnScreen(iArr);
        rect.left = q01Var.getPaddingLeft() + iArr[0];
        rect.top = q01Var.getPaddingTop() + iArr[1];
        rect.right = (q01Var.getWidth() + iArr[0]) - q01Var.getPaddingRight();
        rect.bottom = (q01Var.getHeight() + iArr[1]) - q01Var.getPaddingBottom();
        org.telegram.messenger.g0.X1(rect, rect2, this.J, rect3);
        view.getLocationOnScreen(iArr);
        this.E = iArr[0];
        int i3 = iArr[1];
        this.F = i3;
        this.G = view.getHeight() + i3;
    }

    public static void a(c11 c11Var, Integer num) {
        Runnable runnable;
        wz0 wz0Var = (wz0) c11Var;
        if (num != null && (runnable = wz0Var.T.f52134e.V1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(wz0 wz0Var, View view, WindowInsets windowInsets) {
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
        ofFloat.addUpdateListener(new xy0(this, 6));
        this.O.addListener(new u40(8, this, z10));
        if (z10) {
            this.O.setDuration(360L);
            this.O.setInterpolator(org.telegram.ui.Components.xq.h);
        } else {
            this.O.setDuration(240L);
            this.O.setInterpolator(org.telegram.ui.Components.xq.f40453g);
        }
        this.O.start();
    }

    public final void d(final boolean z10, y01 y01Var, final y01 y01Var2, final boolean z11) {
        float f10;
        q01 q01Var = this.f44190a;
        if (q01Var == null) {
            if (y01Var != null) {
                y01Var.run();
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
            q01Var.f48718b = true;
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
                c11 c11Var = c11.this;
                c11Var.J = floatValue;
                org.telegram.messenger.g0.X1(c11Var.f44192c, c11Var.d, floatValue, c11Var.f44193e);
                c11Var.f44197s.invalidate();
                boolean z12 = z10;
                if (!z12) {
                    c11Var.f44198w.setAlpha(c11Var.J);
                }
                if (c11Var.J < 0.025f && !z12) {
                    if (z11) {
                        c11Var.f44190a.f48718b = false;
                        c11Var.Q.f45456i0.invalidate();
                    }
                    org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
                }
                if (c11Var.J < 0.5f && !z12 && (runnable = y01Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.L.addListener(new b11(this, z10, y01Var2, zArr, z11, y01Var));
        this.L.setDuration(420L);
        this.L.setInterpolator(org.telegram.ui.Components.xq.h);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c11.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
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
        this.f44196r = new Paint(1);
        this.f44195n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 4);
        d(true, null, null, true);
        c(true);
    }
}
