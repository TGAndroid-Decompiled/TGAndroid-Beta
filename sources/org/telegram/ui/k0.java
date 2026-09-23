package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.RadioButton;
public final class k0 extends FrameLayout {
    public final int f34535a;
    public Object f34536b;

    public k0(Context context) {
        super(context);
        this.f34535a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f34535a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.g81 g81Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f34535a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                l6 l6Var = (l6) this.f34536b;
                int d = ((measuredWidth - ((int) l6Var.f34867c.d())) + ((int) l6Var.f34866b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                l6Var.f34866b.setBounds(0, 0, d, getHeight());
                l6Var.f34866b.draw(canvas);
                l6Var.f34867c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                l6Var.f34867c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                wu wuVar = (wu) this.f34536b;
                if (wuVar.getParentLayout() != null && (g81Var = wuVar.f39092b) != null) {
                    float measuredHeight = g81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.f18910k0);
                    return;
                }
                return;
            case 7:
                b70 b70Var = (b70) this.f34536b;
                ah.h hVar = b70Var.f32002p0;
                fh.d dVar = b70Var.f32003q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    b70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f9061n && dVar.f(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, b70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6), b70Var.m0);
                return;
            case 9:
                i80 i80Var = (i80) this.f34536b;
                ah.h hVar2 = i80Var.L;
                fh.d dVar2 = i80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    i80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9061n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f34536b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f30830x1 == null) {
                        launchActivity.f30830x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f30830x1);
                    int[] iArr2 = launchActivity.f30830x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f30830x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                zg0 zg0Var = (zg0) this.f34536b;
                zg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.h6.f18733a7;
                int themedColor = zg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.h6.f18789d6;
                int themedColor2 = zg0Var.getThemedColor(i14);
                sh1 sh1Var = zg0Var.f37686c;
                float f10 = 1.0f;
                if (sh1Var != null) {
                    f7 = sh1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = zg0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.h6.l0(d10));
                }
                if (zg0Var.N != 0) {
                    canvas.drawRect(getWidth() - zg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.l0(d10));
                }
                super.dispatchDraw(canvas);
                zg0Var.d0();
                fh.c cVar = zg0Var.R;
                int themedColor3 = zg0Var.getThemedColor(i13);
                int themedColor4 = zg0Var.getThemedColor(i14);
                sh1 sh1Var2 = zg0Var.f37686c;
                if (sh1Var2 != null) {
                    f10 = sh1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = zg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                a51 a51Var = (a51) this.f34536b;
                if (a51Var.f31677s > 0.0f && a51Var.f31675n != null) {
                    a51Var.f31676r.reset();
                    float width = getWidth() / a51Var.f31674f.getWidth();
                    a51Var.f31676r.postScale(width, width);
                    a51Var.h.setLocalMatrix(a51Var.f31676r);
                    a51Var.f31675n.setAlpha((int) (a51Var.f31677s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), a51Var.f31675n);
                }
                if (a51Var.W && (t1Var = a51Var.O) != null) {
                    t1Var.setVisibility(4);
                    a51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                o51 o51Var = (o51) this.f34536b;
                ImageReceiver imageReceiver2 = o51Var.f38305b;
                Rect rect = o51Var.e;
                z61 z61Var = o51Var.P;
                i61 i61Var = o51Var.f38304a;
                if (o51Var.f38308n != null && o51Var.f38309r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    o51Var.f38309r.setAlpha((int) (o51Var.I * 255.0f));
                    canvas.drawBitmap(o51Var.f38308n, 0.0f, 0.0f, o51Var.f38309r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (i61Var != null) {
                    Drawable drawable = i61Var.E;
                    if (drawable != null) {
                        if (o51Var.f38312x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(o51Var.I, z61Var.f40030m1, z61Var.f40018f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(z61Var.f40028k1);
                        }
                        drawable.setAlpha((int) ((1.0f - o51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = i61Var.N;
                        if (f11 == 0.0f && i61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(i61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - o51Var.I) * (1.0f - i61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((i61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (o51Var.I * AndroidUtilities.dp(45.0f)) + o51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = i61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - o51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (z61Var.f40004a0.getX() + z61Var.f40034o0.getX() + o51Var.f38313y), z61Var.f40004a0.getY() + ((int) z61Var.f40034o0.getY()) + o51Var.E);
                        z61Var.f40034o0.draw(canvas);
                        canvas.restore();
                    } else if (i61Var.f34039s && (imageReceiver = i61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - o51Var.I);
                        i61Var.h.setImageCoords(rect);
                        i61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(o51Var.I);
                    imageReceiver2.setImageCoords(rect);
                    imageReceiver2.draw(canvas);
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f34535a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    pt ptVar = (pt) this.f34536b;
                    if (!ptVar.f36195n && !ptVar.K) {
                        ptVar.n();
                        return true;
                    }
                    ptVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f34535a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((a51) this.f34536b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f34535a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((th0) this.f34536b).f37675q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((o51) this.f34536b).f38305b;
                if (imageReceiver != null) {
                    imageReceiver.onAttachedToWindow();
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f34535a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34535a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((th0) this.f34536b).f37675q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((o51) this.f34536b).f38305b;
                if (imageReceiver != null) {
                    imageReceiver.onDetachedFromWindow();
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f34535a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f34536b).f22133f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((dq0) this.f34536b).f32696b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((uq0) this.f34536b).f38169b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f34535a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f34536b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.uv0[] uv0VarArr;
        int i14;
        Activity activity;
        switch (this.f34535a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                d5 d5Var = (d5) this.f34536b;
                d5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.p.b((paddingTop - d5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                d5Var.f32508c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.ul.y(48.0f, (paddingTop - b10) - d5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) d5Var.f32508c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.z0.C(8.0f, y3, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                b70 b70Var = (b70) this.f34536b;
                b70Var.g0();
                b70Var.h0();
                org.telegram.ui.Components.c20 c20Var = b70Var.f31991f;
                le.f fVar = b70Var.f31985b;
                c20Var.setTranslationY(fVar.e);
                b70Var.i0();
                b70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + fVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                t70 t70Var = (t70) this.f34536b;
                TextView textView = t70Var.f37546b;
                if (textView != null) {
                    int measuredWidth = ((t70Var.f37546b.getMeasuredWidth() / 2) + textView.getLeft()) - (t70Var.f37547c.getMeasuredWidth() / 2);
                    int top = (t70Var.e.getTop() + ((t70Var.f37546b.getMeasuredHeight() - t70Var.f37547c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = t70Var.f37547c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, t70Var.f37547c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                i80 i80Var = (i80) this.f34536b;
                i80Var.Z();
                i80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                rg0 rg0Var = (rg0) this.f34536b;
                for (org.telegram.ui.Components.uv0 uv0Var : rg0Var.f36820b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!uv0Var.a() && rg0Var.f36822c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    uv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                zg0 zg0Var = (zg0) this.f34536b;
                zg0Var.i0();
                zg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34536b;
                WindowInsets windowInsets = secretMediaViewer.f31423g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f31462y0 = 1.0f;
                        secretMediaViewer.f31457w0 = 0.0f;
                        secretMediaViewer.f31460x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f31462y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((a51) this.f34536b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                o51 o51Var = (o51) this.f34536b;
                Context context = o51Var.getContext();
                while (true) {
                    if (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        activity = null;
                    }
                }
                if (activity != null) {
                    View decorView = activity.getWindow().getDecorView();
                    Bitmap bitmap = o51Var.f38308n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || o51Var.f38308n.getHeight() != decorView.getMeasuredHeight()) {
                        o51Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.uv0[] uv0VarArr;
        switch (this.f34535a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 6:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 7:
                b70 b70Var = (b70) this.f34536b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    b70Var.f31988c0 = AndroidUtilities.dp(56.0f);
                } else {
                    b70Var.f31988c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(b70.c0(b70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) b70Var.f32006s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + b70.d0(b70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) b70Var.e.getLayoutParams()).topMargin = b70.V(b70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) b70Var.f31991f.getLayoutParams()).topMargin = b70.W(b70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) b70Var.h.getLayoutParams()).topMargin = b70.X(b70Var).getMeasuredHeight();
                b70Var.h.getLayoutParams().height = b70Var.f31988c0;
                ((ViewGroup.MarginLayoutParams) b70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + b70.Y(b70Var).getMeasuredHeight() + b70Var.f31988c0;
                b70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                i80 i80Var = (i80) this.f34536b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    i80Var.f34071x = AndroidUtilities.dp(56.0f);
                } else {
                    i80Var.f34071x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(i80.W(i80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) i80Var.f34068r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + i80.X(i80Var).getMeasuredHeight();
                i80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + i80Var.f34071x;
                i80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                ad0 ad0Var = ((dd0) this.f34536b).f32610x;
                if (ad0Var != null) {
                    ad0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                rg0 rg0Var = (rg0) this.f34536b;
                for (org.telegram.ui.Components.uv0 uv0Var : rg0Var.f36820b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!uv0Var.a() && rg0Var.f36822c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    uv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                up0 up0Var = (up0) this.f34536b;
                FrameLayout frameLayout = up0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) up0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f34536b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34536b;
                WindowInsets windowInsets = secretMediaViewer.f31423g0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i12 = AndroidUtilities.displaySize.y;
                        if (size6 > i12) {
                            size6 = i12;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = AndroidUtilities.displaySize.y;
                    if (size6 > i13) {
                        size6 = i13;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f31423g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                od1 od1Var = (od1) this.f34536b;
                measureChildWithMargins(od1.t0(od1Var), i10, 0, i11, 0);
                int measuredHeight2 = od1.v0(od1Var).getMeasuredHeight();
                if (od1.w0(od1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) od1Var.f35818n0.getLayoutParams()).topMargin = measuredHeight2;
                od1Var.f35818n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(od1Var.f35822p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((zg1) this.f34536b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34535a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                pt ptVar = (pt) this.f34536b;
                gh.d.c(ptVar.f36200s, ptVar.f36205y);
                ptVar.f36201t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34535a) {
            case 19:
                if (!((PopupNotificationActivity) this.f34536b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f34535a) {
            case 19:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z10);
                return;
            default:
                super.requestDisallowInterceptTouchEvent(z10);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f34535a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f34536b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f34535a) {
            case 4:
                super.setTranslationY(f7);
                ((ub) this.f34536b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f34536b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34535a) {
            case 3:
                l6 l6Var = (l6) this.f34536b;
                if (drawable != l6Var.f34867c && drawable != l6Var.f34866b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f34535a = i10;
        this.f34536b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
