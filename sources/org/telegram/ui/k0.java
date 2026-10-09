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
    public final int f39047a;
    public Object f39048b;

    public k0(Context context) {
        super(context);
        this.f39047a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39047a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.n91 n91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f39047a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                k6 k6Var = (k6) this.f39048b;
                int c10 = ((measuredWidth - ((int) k6Var.f39105c.c())) + ((int) k6Var.f39104b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                k6Var.f39104b.setBounds(0, 0, c10, getHeight());
                k6Var.f39104b.draw(canvas);
                k6Var.f39105c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                k6Var.f39105c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                yu yuVar = (yu) this.f39048b;
                if (yuVar.getParentLayout() != null && (n91Var = yuVar.f44413b) != null) {
                    float measuredHeight = n91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.i6.f20919k0);
                    return;
                }
                return;
            case 7:
                c70 c70Var = (c70) this.f39048b;
                ah.h hVar = c70Var.f36562p0;
                fh.d dVar = c70Var.f36563q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    c70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f9939n && dVar.f(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, c70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20797d6), c70Var.m0);
                return;
            case 9:
                l80 l80Var = (l80) this.f39048b;
                ah.h hVar2 = l80Var.L;
                fh.d dVar2 = l80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    l80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9939n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f39048b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33822x1 == null) {
                        launchActivity.f33822x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33822x1);
                    int[] iArr2 = launchActivity.f33822x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33822x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                fh0 fh0Var = (fh0) this.f39048b;
                fh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.i6.f20741a7;
                int themedColor = fh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.i6.f20797d6;
                int themedColor2 = fh0Var.getThemedColor(i14);
                bi1 bi1Var = fh0Var.f36687c;
                float f10 = 1.0f;
                if (bi1Var != null) {
                    f7 = bi1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d = i0.a.d(f7, themedColor, themedColor2);
                int i15 = fh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.i6.m0(d));
                }
                if (fh0Var.N != 0) {
                    canvas.drawRect(getWidth() - fh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.i6.m0(d));
                }
                super.dispatchDraw(canvas);
                fh0Var.d0();
                fh.c cVar = fh0Var.R;
                int themedColor3 = fh0Var.getThemedColor(i13);
                int themedColor4 = fh0Var.getThemedColor(i14);
                bi1 bi1Var2 = fh0Var.f36687c;
                if (bi1Var2 != null) {
                    f10 = bi1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = fh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                k51 k51Var = (k51) this.f39048b;
                if (k51Var.f39099s > 0.0f && k51Var.f39097n != null) {
                    k51Var.f39098r.reset();
                    float width = getWidth() / k51Var.f39096f.getWidth();
                    k51Var.f39098r.postScale(width, width);
                    k51Var.h.setLocalMatrix(k51Var.f39098r);
                    k51Var.f39097n.setAlpha((int) (k51Var.f39099s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k51Var.f39097n);
                }
                if (k51Var.W && (u1Var = k51Var.O) != null) {
                    u1Var.setVisibility(4);
                    k51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                z51 z51Var = (z51) this.f39048b;
                ImageReceiver imageReceiver2 = z51Var.f37903b;
                Rect rect = z51Var.f37905e;
                k71 k71Var = z51Var.P;
                t61 t61Var = z51Var.f37902a;
                if (z51Var.f37907n != null && z51Var.f37908r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    z51Var.f37908r.setAlpha((int) (z51Var.I * 255.0f));
                    canvas.drawBitmap(z51Var.f37907n, 0.0f, 0.0f, z51Var.f37908r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (t61Var != null) {
                    Drawable drawable = t61Var.E;
                    if (drawable != null) {
                        if (z51Var.f37911x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(z51Var.I, k71Var.f39141m1, k71Var.f39129f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(k71Var.f39139k1);
                        }
                        drawable.setAlpha((int) ((1.0f - z51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = t61Var.N;
                        if (f11 == 0.0f && t61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(t61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - z51Var.I) * (1.0f - t61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((t61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (z51Var.I * AndroidUtilities.dp(45.0f)) + z51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = t61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - z51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (k71Var.f39114a0.getX() + k71Var.f39145o0.getX() + z51Var.f37912y), k71Var.f39114a0.getY() + ((int) k71Var.f39145o0.getY()) + z51Var.E);
                        k71Var.f39145o0.draw(canvas);
                        canvas.restore();
                    } else if (t61Var.f41877s && (imageReceiver = t61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - z51Var.I);
                        t61Var.h.setImageCoords(rect);
                        t61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(z51Var.I);
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
        switch (this.f39047a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    rt rtVar = (rt) this.f39048b;
                    if (!rtVar.f41500n && !rtVar.K) {
                        rtVar.n();
                        return true;
                    }
                    rtVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39047a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((k51) this.f39048b).dismiss();
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
        switch (this.f39047a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((zh0) this.f39048b).f44654q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((z51) this.f39048b).f37903b;
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
        switch (this.f39047a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39047a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((zh0) this.f39048b).f44654q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((z51) this.f39048b).f37903b;
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
        switch (this.f39047a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39048b).f24300f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((kq0) this.f39048b).f39330b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((br0) this.f39048b).f36391b.size(), new Object[0]));
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
        switch (this.f39047a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f39048b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.xw0[] xw0VarArr;
        int i14;
        Activity activity;
        switch (this.f39047a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f39048b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.o.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f36521c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.bi.A(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f36521c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.q.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                c70 c70Var = (c70) this.f39048b;
                c70Var.g0();
                c70Var.h0();
                org.telegram.ui.Components.s20 s20Var = c70Var.f36551f;
                me.e eVar = c70Var.f36544b;
                s20Var.setTranslationY(eVar.f16345e);
                c70Var.i0();
                c70Var.f36549e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f16345e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                v70 v70Var = (v70) this.f39048b;
                TextView textView = v70Var.f42668b;
                if (textView != null) {
                    int measuredWidth = ((v70Var.f42668b.getMeasuredWidth() / 2) + textView.getLeft()) - (v70Var.f42669c.getMeasuredWidth() / 2);
                    int top = (v70Var.f42670e.getTop() + ((v70Var.f42668b.getMeasuredHeight() - v70Var.f42669c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = v70Var.f42669c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, v70Var.f42669c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                l80 l80Var = (l80) this.f39048b;
                l80Var.Z();
                l80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                wg0 wg0Var = (wg0) this.f39048b;
                for (org.telegram.ui.Components.xw0 xw0Var : wg0Var.f43576b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!xw0Var.a() && wg0Var.f43578c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    xw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                fh0 fh0Var = (fh0) this.f39048b;
                fh0Var.i0();
                fh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39048b;
                WindowInsets windowInsets = secretMediaViewer.f34429g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.f34423e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.f34423e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34468y0 = 1.0f;
                        secretMediaViewer.f34463w0 = 0.0f;
                        secretMediaViewer.f34466x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34468y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((k51) this.f39048b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                z51 z51Var = (z51) this.f39048b;
                Context context = z51Var.getContext();
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
                    Bitmap bitmap = z51Var.f37907n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || z51Var.f37907n.getHeight() != decorView.getMeasuredHeight()) {
                        z51Var.f();
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
        org.telegram.ui.Components.xw0[] xw0VarArr;
        switch (this.f39047a) {
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
                c70 c70Var = (c70) this.f39048b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    c70Var.f36547c0 = AndroidUtilities.dp(56.0f);
                } else {
                    c70Var.f36547c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(c70.c0(c70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) c70Var.f36566s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + c70.d0(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.f36549e.getLayoutParams()).topMargin = c70.V(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.f36551f.getLayoutParams()).topMargin = c70.W(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.h.getLayoutParams()).topMargin = c70.X(c70Var).getMeasuredHeight();
                c70Var.h.getLayoutParams().height = c70Var.f36547c0;
                ((ViewGroup.MarginLayoutParams) c70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + c70.Y(c70Var).getMeasuredHeight() + c70Var.f36547c0;
                c70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                l80 l80Var = (l80) this.f39048b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    l80Var.f39471x = AndroidUtilities.dp(56.0f);
                } else {
                    l80Var.f39471x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(l80.W(l80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) l80Var.f39468r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + l80.X(l80Var).getMeasuredHeight();
                l80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + l80Var.f39471x;
                l80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                ed0 ed0Var = ((hd0) this.f39048b).f38286x;
                if (ed0Var != null) {
                    ed0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wg0 wg0Var = (wg0) this.f39048b;
                for (org.telegram.ui.Components.xw0 xw0Var : wg0Var.f43576b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) xw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!xw0Var.a() && wg0Var.f43578c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    xw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                aq0 aq0Var = (aq0) this.f39048b;
                FrameLayout frameLayout = aq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) aq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f39048b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39048b;
                WindowInsets windowInsets = secretMediaViewer.f34429g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34429g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f34423e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                xd1 xd1Var = (xd1) this.f39048b;
                measureChildWithMargins(xd1.t0(xd1Var), i10, 0, i11, 0);
                int measuredHeight2 = xd1.v0(xd1Var).getMeasuredHeight();
                if (xd1.w0(xd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) xd1Var.f43976n0.getLayoutParams()).topMargin = measuredHeight2;
                xd1Var.f43976n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(xd1Var.f43980p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((ih1) this.f39048b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39047a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                rt rtVar = (rt) this.f39048b;
                gh.d.c(rtVar.f41505s, rtVar.f41510y);
                rtVar.f41506t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39047a) {
            case 19:
                if (!((PopupNotificationActivity) this.f39048b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39047a) {
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
        switch (this.f39047a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f39048b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39047a) {
            case 4:
                super.setTranslationY(f7);
                ((vb) this.f39048b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39048b).G1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39047a) {
            case 3:
                k6 k6Var = (k6) this.f39048b;
                if (drawable != k6Var.f39105c && drawable != k6Var.f39104b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f39047a = i10;
        this.f39048b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
