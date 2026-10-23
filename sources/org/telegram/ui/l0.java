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
public final class l0 extends FrameLayout {
    public final int f39093a;
    public Object f39094b;

    public l0(Context context) {
        super(context);
        this.f39093a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39093a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.k91 k91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f39093a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f39094b;
                int c10 = ((measuredWidth - ((int) o6Var.f40080c.c())) + ((int) o6Var.f40079b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f40079b.setBounds(0, 0, c10, getHeight());
                o6Var.f40079b.draw(canvas);
                o6Var.f40080c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                o6Var.f40080c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ou ouVar = (ou) this.f39094b;
                if (ouVar.getParentLayout() != null && (k91Var = ouVar.f40270b) != null) {
                    float measuredHeight = k91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.f21304k0);
                    return;
                }
                return;
            case 7:
                p60 p60Var = (p60) this.f39094b;
                bh.f fVar = p60Var.f40375p0;
                gh.d dVar = p60Var.f40376q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    p60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f11079n && dVar.g(measuredWidth2, measuredHeight2)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, p60Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6), p60Var.m0);
                return;
            case 9:
                x70 x70Var = (x70) this.f39094b;
                bh.f fVar2 = x70Var.L;
                gh.d dVar2 = x70Var.M;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    x70Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f11079n && dVar2.g(measuredWidth3, measuredHeight3)) {
                        fVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f39094b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.A1 == null) {
                        launchActivity.A1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.A1);
                    int[] iArr2 = launchActivity.A1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.A1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                rg0 rg0Var = (rg0) this.f39094b;
                rg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.k6.f21125a7;
                int themedColor = rg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.k6.f21183d6;
                int themedColor2 = rg0Var.getThemedColor(i14);
                tg1 tg1Var = rg0Var.f42433c;
                float f10 = 1.0f;
                if (tg1Var != null) {
                    f7 = tg1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int f11 = i0.a.f(f7, themedColor, themedColor2);
                int i15 = rg0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.k6.m0(f11));
                }
                if (rg0Var.N != 0) {
                    canvas.drawRect(getWidth() - rg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.m0(f11));
                }
                super.dispatchDraw(canvas);
                rg0Var.d0();
                gh.c cVar = rg0Var.R;
                int themedColor3 = rg0Var.getThemedColor(i13);
                int themedColor4 = rg0Var.getThemedColor(i14);
                tg1 tg1Var2 = rg0Var.f42433c;
                if (tg1Var2 != null) {
                    f10 = tg1Var2.r(0);
                }
                cVar.a(i0.a.f(f10, themedColor3, themedColor4));
                View view2 = rg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                b41 b41Var = (b41) this.f39094b;
                if (b41Var.f35867s > 0.0f && b41Var.f35865n != null) {
                    b41Var.f35866r.reset();
                    float width = getWidth() / b41Var.f35864f.getWidth();
                    b41Var.f35866r.postScale(width, width);
                    b41Var.h.setLocalMatrix(b41Var.f35866r);
                    b41Var.f35865n.setAlpha((int) (b41Var.f35867s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), b41Var.f35865n);
                }
                if (b41Var.W && (t1Var = b41Var.O) != null) {
                    t1Var.setVisibility(4);
                    b41Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                q41 q41Var = (q41) this.f39094b;
                ImageReceiver imageReceiver2 = q41Var.f43500b;
                Rect rect = q41Var.e;
                b61 b61Var = q41Var.P;
                k51 k51Var = q41Var.f43499a;
                if (q41Var.f43503n != null && q41Var.f43504r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    q41Var.f43504r.setAlpha((int) (q41Var.I * 255.0f));
                    canvas.drawBitmap(q41Var.f43503n, 0.0f, 0.0f, q41Var.f43504r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (k51Var != null) {
                    Drawable drawable = k51Var.E;
                    if (drawable != null) {
                        if (q41Var.f43507x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(q41Var.I, b61Var.f35917n1, b61Var.f35902f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(b61Var.f35912k1);
                        }
                        drawable.setAlpha((int) ((1.0f - q41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = k51Var.N;
                        if (f12 == 0.0f && k51Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(k51Var.S * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - q41Var.I) * (1.0f - k51Var.O));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((k51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (q41Var.I * AndroidUtilities.dp(45.0f)) + q41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = k51Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - q41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (b61Var.f35888a0.getX() + b61Var.f35918o0.getX() + q41Var.f43508y), b61Var.f35888a0.getY() + ((int) b61Var.f35918o0.getY()) + q41Var.E);
                        b61Var.f35918o0.draw(canvas);
                        canvas.restore();
                    } else if (k51Var.f38828s && (imageReceiver = k51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - q41Var.I);
                        k51Var.h.setImageCoords(rect);
                        k51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(q41Var.I);
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
        switch (this.f39093a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ht htVar = (ht) this.f39094b;
                    if (!htVar.f37947n && !htVar.K) {
                        htVar.l();
                        return true;
                    }
                    htVar.m();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39093a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((b41) this.f39094b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39093a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((mh0) this.f39094b).f39596q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((q41) this.f39094b).f43500b;
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
        switch (this.f39093a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39093a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((mh0) this.f39094b).f39596q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((q41) this.f39094b).f43500b;
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
        switch (this.f39093a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39094b).f24487f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((vp0) this.f39094b).f42805b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((mq0) this.f39094b).f39645b.size(), new Object[0]));
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
        switch (this.f39093a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f39094b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.tw0[] tw0VarArr;
        int i14;
        Activity activity;
        switch (this.f39093a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                g5 g5Var = (g5) this.f39094b;
                g5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.r.b((paddingTop - g5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                g5Var.f37486c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.sl.A(48.0f, (paddingTop - b10) - g5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) g5Var.f37486c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                p60 p60Var = (p60) this.f39094b;
                p60Var.g0();
                p60Var.h0();
                org.telegram.ui.Components.k20 k20Var = p60Var.f40364f;
                ne.e eVar = p60Var.f40358b;
                k20Var.setTranslationY(eVar.e);
                p60Var.i0();
                p60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                g70 g70Var = (g70) this.f39094b;
                TextView textView = g70Var.f37509b;
                if (textView != null) {
                    int measuredWidth = ((g70Var.f37509b.getMeasuredWidth() / 2) + textView.getLeft()) - (g70Var.f37510c.getMeasuredWidth() / 2);
                    int top = (g70Var.e.getTop() + ((g70Var.f37509b.getMeasuredHeight() - g70Var.f37510c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = g70Var.f37510c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, g70Var.f37510c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                x70 x70Var = (x70) this.f39094b;
                x70Var.Z();
                x70Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ig0 ig0Var = (ig0) this.f39094b;
                for (org.telegram.ui.Components.tw0 tw0Var : ig0Var.f38194b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!tw0Var.a() && ig0Var.f38196c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    tw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                rg0 rg0Var = (rg0) this.f39094b;
                rg0Var.i0();
                rg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39094b;
                WindowInsets windowInsets = secretMediaViewer.f34101g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.v vVar = secretMediaViewer.e;
                vVar.layout(i14, 0, vVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34140y0 = 1.0f;
                        secretMediaViewer.f34135w0 = 0.0f;
                        secretMediaViewer.f34138x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34140y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((b41) this.f39094b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                q41 q41Var = (q41) this.f39094b;
                Context context = q41Var.getContext();
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
                    Bitmap bitmap = q41Var.f43503n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || q41Var.f43503n.getHeight() != decorView.getMeasuredHeight()) {
                        q41Var.f();
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
        org.telegram.ui.Components.tw0[] tw0VarArr;
        switch (this.f39093a) {
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
                p60 p60Var = (p60) this.f39094b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    p60Var.f40361c0 = AndroidUtilities.dp(56.0f);
                } else {
                    p60Var.f40361c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(p60.c0(p60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) p60Var.f40379s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + p60.d0(p60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) p60Var.e.getLayoutParams()).topMargin = p60.V(p60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) p60Var.f40364f.getLayoutParams()).topMargin = p60.W(p60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) p60Var.h.getLayoutParams()).topMargin = p60.X(p60Var).getMeasuredHeight();
                p60Var.h.getLayoutParams().height = p60Var.f40361c0;
                ((ViewGroup.MarginLayoutParams) p60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + p60.Y(p60Var).getMeasuredHeight() + p60Var.f40361c0;
                p60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                x70 x70Var = (x70) this.f39094b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    x70Var.f43529x = AndroidUtilities.dp(56.0f);
                } else {
                    x70Var.f43529x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(x70.W(x70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) x70Var.f43526r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + x70.X(x70Var).getMeasuredHeight();
                x70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + x70Var.f43529x;
                x70Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                pc0 pc0Var = ((sc0) this.f39094b).f41377x;
                if (pc0Var != null) {
                    pc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ig0 ig0Var = (ig0) this.f39094b;
                for (org.telegram.ui.Components.tw0 tw0Var : ig0Var.f38194b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!tw0Var.a() && ig0Var.f38196c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    tw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                lp0 lp0Var = (lp0) this.f39094b;
                FrameLayout frameLayout = lp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) lp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f39094b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39094b;
                WindowInsets windowInsets = secretMediaViewer.f34101g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34101g0;
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
                qc1 qc1Var = (qc1) this.f39094b;
                measureChildWithMargins(qc1.s0(qc1Var), i10, 0, i11, 0);
                int measuredHeight2 = qc1.u0(qc1Var).getMeasuredHeight();
                if (qc1.v0(qc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) qc1Var.f40754o0.getLayoutParams()).topMargin = measuredHeight2;
                qc1Var.f40754o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(qc1Var.f40758q0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((bg1) this.f39094b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39093a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                ht htVar = (ht) this.f39094b;
                hh.d.c(htVar.f37952s, htVar.f37957y);
                htVar.f37953t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39093a) {
            case 19:
                if (!((PopupNotificationActivity) this.f39094b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39093a) {
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
        switch (this.f39093a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f39094b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39093a) {
            case 4:
                super.setTranslationY(f7);
                ((vb) this.f39094b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39094b).H1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39093a) {
            case 3:
                o6 o6Var = (o6) this.f39094b;
                if (drawable != o6Var.f40080c && drawable != o6Var.f40079b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f39093a = i10;
        this.f39094b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
