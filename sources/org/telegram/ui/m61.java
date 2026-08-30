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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
public abstract class m61 extends Dialog {
    public final int B;
    public final int C;
    public final int[] D;
    public boolean E;
    public float F;
    public boolean G;
    public ValueAnimator H;
    public float I;
    public boolean J;
    public ValueAnimator K;
    public boolean L;
    public final q61 M;
    public final y51 f36202a;
    public final ImageReceiver f36203b;
    public final Rect f36204c;
    public final Rect d;
    public final Rect e;
    public final Runnable f36205f;
    public final View h;
    public Bitmap f36206n;
    public Paint f36207r;
    public final l0 f36208s;
    public final ActionBarPopupWindow$ActionBarPopupWindowLayout v;
    public org.telegram.ui.ActionBar.g3 f36209w;
    public boolean f36210x;
    public final int f36211y;

    public m61(q61 q61Var, Context context, Runnable runnable, View view, y51 y51Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z4;
        ImageLocation forDocument;
        String str;
        ColorFilter colorFilter;
        this.M = q61Var;
        Rect rect = new Rect();
        this.f36204c = rect;
        Rect rect2 = new Rect();
        this.d = rect2;
        Rect rect3 = new Rect();
        this.e = rect3;
        int[] iArr = new int[2];
        this.D = iArr;
        this.E = false;
        this.L = false;
        this.f36202a = y51Var;
        this.f36205f = runnable;
        this.h = view;
        final e51 e51Var = (e51) this;
        l0 l0Var = new l0(e51Var, context, 23);
        this.f36208s = l0Var;
        setContentView(l0Var, new ViewGroup.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(new gw0(e51Var, context, 4), k7.b6.t(160, 160, 17, 0, 0, 0, 16));
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert2, 0, context, f6Var);
        this.v = actionBarPopupWindow$ActionBarPopupWindowLayout;
        linearLayout.addView(actionBarPopupWindow$ActionBarPopupWindowLayout, k7.b6.t(-2, -2, 17, 0, 0, 0, 0));
        org.telegram.ui.ActionBar.w0.c(true, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil1Hour), false, f6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Hours), false, f6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil8Hours), false, f6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntil2Days), false, f6Var).setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 3600)));
                        return;
                    case 1:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 7200)));
                        return;
                    case 2:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 28800)));
                        return;
                    default:
                        e51Var.e(Integer.valueOf((int) ((System.currentTimeMillis() / 1000) + 172800)));
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0.c(false, true, actionBarPopupWindow$ActionBarPopupWindowLayout, 0, LocaleController.getString(R.string.SetEmojiStatusUntilOther), false, f6Var).setOnClickListener(new gb0(17, e51Var, context));
        l0Var.addView(linearLayout, k7.b6.e(-2, -2, 17));
        Window window = getWindow();
        if (window != null) {
            window.setWindowAnimations(R.style.DialogNoAnimation);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.flags = (attributes.flags & (-3)) | (-2147286784);
            z4 = true;
            l0Var.setOnApplyWindowInsetsListener(new c41(e51Var, 1));
            attributes.flags |= 1024;
            l0Var.setFitsSystemWindows(true);
            l0Var.setSystemUiVisibility(1284);
            attributes.height = -1;
            if (Build.VERSION.SDK_INT >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } else {
            z4 = true;
        }
        if (y51Var != null) {
            y51Var.f40400b = z4;
        }
        f();
        ImageReceiver imageReceiver = new ImageReceiver();
        this.f36203b = imageReceiver;
        imageReceiver.setParentView(l0Var);
        imageReceiver.setLayerNum(7);
        TLRPC.Document document = y51Var.d;
        if (document == null) {
            Drawable drawable = y51Var.B;
            if (drawable instanceof org.telegram.ui.Components.l5) {
                document = ((org.telegram.ui.Components.l5) drawable).e;
            }
        }
        if (document != null) {
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.j6.f20067m6, 0.2f);
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
            if ("video/webm".equals(document.mime_type)) {
                forDocument = ImageLocation.getForDocument(document);
                if (svgThumb != null) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                str = "160_160_g";
            } else {
                if (svgThumb != null && MessageObject.isAnimatedStickerDocument(document, false)) {
                    svgThumb.overrideWidthAndHeight(512, 512);
                }
                forDocument = ImageLocation.getForDocument(document);
                str = "160_160";
            }
            TLRPC.Document document2 = document;
            imageReceiver.setImage(forDocument, str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "160_160", null, null, svgThumb, document.size, null, document2, 1);
            if ((y51Var.B instanceof org.telegram.ui.Components.l5) && (MessageObject.isTextColorEmoji(document2) || ((org.telegram.ui.Components.l5) y51Var.B).c())) {
                if (!MessageObject.isTextColorEmoji(document2)) {
                    org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) y51Var.B;
                    SparseArray sparseArray = org.telegram.ui.Components.l5.f26556q;
                    if (l5Var == null || !l5Var.l()) {
                        colorFilter = org.telegram.ui.ActionBar.j6.n0(f6Var);
                        imageReceiver.setColorFilter(colorFilter);
                    }
                }
                colorFilter = q61Var.f37613h1;
                imageReceiver.setColorFilter(colorFilter);
            }
        }
        y51Var.getLocationOnScreen(iArr);
        rect.left = y51Var.getPaddingLeft() + iArr[0];
        rect.top = y51Var.getPaddingTop() + iArr[1];
        rect.right = (y51Var.getWidth() + iArr[0]) - y51Var.getPaddingRight();
        rect.bottom = (y51Var.getHeight() + iArr[1]) - y51Var.getPaddingBottom();
        AndroidUtilities.lerp(rect, rect2, this.F, rect3);
        view.getLocationOnScreen(iArr);
        this.f36211y = iArr[0];
        int i10 = iArr[1];
        this.B = i10;
        this.C = view.getHeight() + i10;
    }

    public static void a(m61 m61Var, Integer num) {
        Runnable runnable;
        e51 e51Var = (e51) m61Var;
        if (num != null && (runnable = e51Var.P.e.Q1) != null) {
            runnable.run();
        }
        try {
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public static WindowInsets b(e51 e51Var, View view, WindowInsets windowInsets) {
        view.requestLayout();
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public final void c(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            if (this.J == z4) {
                return;
            }
            valueAnimator.cancel();
        }
        this.J = z4;
        float f11 = this.I;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.K = ofFloat;
        ofFloat.addUpdateListener(new h11(this, 10));
        this.K.addListener(new l61(0, this, z4));
        if (z4) {
            this.K.setDuration(360L);
            this.K.setInterpolator(org.telegram.ui.Components.nr.h);
        } else {
            this.K.setDuration(240L);
            this.K.setInterpolator(org.telegram.ui.Components.nr.f27347g);
        }
        this.K.start();
    }

    public final void d(final boolean z4, h61 h61Var, final h61 h61Var2, final boolean z10) {
        float f10;
        y51 y51Var = this.f36202a;
        if (y51Var == null) {
            if (h61Var != null) {
                h61Var.run();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.H;
        if (valueAnimator != null) {
            if (this.G == z4) {
                return;
            }
            valueAnimator.cancel();
        }
        this.G = z4;
        if (z4) {
            y51Var.f40400b = true;
        }
        final boolean[] zArr = new boolean[1];
        float f11 = this.F;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.H = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                Runnable runnable;
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                m61 m61Var = m61.this;
                m61Var.F = floatValue;
                AndroidUtilities.lerp(m61Var.f36204c, m61Var.d, floatValue, m61Var.e);
                m61Var.f36208s.invalidate();
                boolean z11 = z4;
                if (!z11) {
                    m61Var.v.setAlpha(m61Var.F);
                }
                if (m61Var.F < 0.025f && !z11) {
                    if (z10) {
                        m61Var.f36202a.f40400b = false;
                        m61Var.M.f37605e0.invalidate();
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4);
                }
                if (m61Var.F < 0.5f && !z11 && (runnable = h61Var2) != null) {
                    boolean[] zArr2 = zArr;
                    if (!zArr2[0]) {
                        zArr2[0] = true;
                        runnable.run();
                    }
                }
            }
        });
        this.H.addListener(new k61(this, z4, h61Var2, zArr, z10, h61Var));
        this.H.setDuration(420L);
        this.H.setInterpolator(org.telegram.ui.Components.nr.h);
        this.H.start();
    }

    @Override
    public void dismiss() {
        if (this.L) {
            return;
        }
        e(null);
        this.L = true;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m61.e(java.lang.Integer):void");
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
        canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false));
        decorView.draw(canvas);
        if (activity instanceof LaunchActivity) {
            LaunchActivity launchActivity = (LaunchActivity) activity;
            if (launchActivity.O().getLastFragment().getVisibleDialog() != null) {
                launchActivity.O().getLastFragment().getVisibleDialog().getWindow().getDecorView().draw(canvas);
            }
        }
        View view = this.h;
        if (view != null) {
            view.getLocationOnScreen(this.D);
            canvas.save();
            canvas.translate(iArr[0], iArr[1]);
            view.draw(canvas);
            canvas.restore();
        }
        Utilities.stackBlurBitmap(createBitmap, Math.max(10, Math.max(measuredWidth, measuredHeight) / 180));
        this.f36207r = new Paint(1);
        this.f36206n = createBitmap;
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4);
        d(true, null, null, true);
        c(true);
    }
}
