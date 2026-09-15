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
public final class j0 extends FrameLayout {
    public final int f34754a;
    public Object f34755b;

    public j0(Context context) {
        super(context);
        this.f34754a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f34754a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.h81 h81Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f34754a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                l6 l6Var = (l6) this.f34755b;
                int d = ((measuredWidth - ((int) l6Var.f35348c.d())) + ((int) l6Var.f35347b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                l6Var.f35347b.setBounds(0, 0, d, getHeight());
                l6Var.f35347b.draw(canvas);
                l6Var.f35348c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                l6Var.f35348c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                zu zuVar = (zu) this.f34755b;
                if (zuVar.getParentLayout() != null && (h81Var = zuVar.f40300b) != null) {
                    float measuredHeight = h81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.i6.f18958k0);
                    return;
                }
                return;
            case 7:
                e70 e70Var = (e70) this.f34755b;
                ah.h hVar = e70Var.f33250p0;
                fh.d dVar = e70Var.f33251q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    e70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f9073n && dVar.f(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, e70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f18836d6), e70Var.m0);
                return;
            case 9:
                l80 l80Var = (l80) this.f34755b;
                ah.h hVar2 = l80Var.L;
                fh.d dVar2 = l80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    l80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9073n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f34755b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f30859x1 == null) {
                        launchActivity.f30859x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f30859x1);
                    int[] iArr2 = launchActivity.f30859x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f30859x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                eh0 eh0Var = (eh0) this.f34755b;
                eh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.i6.f18780a7;
                int themedColor = eh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.i6.f18836d6;
                int themedColor2 = eh0Var.getThemedColor(i14);
                zh1 zh1Var = eh0Var.f31847c;
                float f10 = 1.0f;
                if (zh1Var != null) {
                    f7 = zh1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = eh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                if (eh0Var.N != 0) {
                    canvas.drawRect(getWidth() - eh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                super.dispatchDraw(canvas);
                eh0Var.d0();
                fh.c cVar = eh0Var.S;
                int themedColor3 = eh0Var.getThemedColor(i13);
                int themedColor4 = eh0Var.getThemedColor(i14);
                zh1 zh1Var2 = eh0Var.f31847c;
                if (zh1Var2 != null) {
                    f10 = zh1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = eh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                h51 h51Var = (h51) this.f34755b;
                if (h51Var.f34170s > 0.0f && h51Var.f34168n != null) {
                    h51Var.f34169r.reset();
                    float width = getWidth() / h51Var.f34167f.getWidth();
                    h51Var.f34169r.postScale(width, width);
                    h51Var.h.setLocalMatrix(h51Var.f34169r);
                    h51Var.f34168n.setAlpha((int) (h51Var.f34170s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), h51Var.f34168n);
                }
                if (h51Var.W && (t1Var = h51Var.O) != null) {
                    t1Var.setVisibility(4);
                    h51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                v51 v51Var = (v51) this.f34755b;
                ImageReceiver imageReceiver2 = v51Var.f32699b;
                Rect rect = v51Var.e;
                g71 g71Var = v51Var.P;
                p61 p61Var = v51Var.f32698a;
                if (v51Var.f32702n != null && v51Var.f32703r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    v51Var.f32703r.setAlpha((int) (v51Var.I * 255.0f));
                    canvas.drawBitmap(v51Var.f32702n, 0.0f, 0.0f, v51Var.f32703r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (p61Var != null) {
                    Drawable drawable = p61Var.E;
                    if (drawable != null) {
                        if (v51Var.f32706x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(v51Var.I, g71Var.f33805m1, g71Var.f33793f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(g71Var.f33803k1);
                        }
                        drawable.setAlpha((int) ((1.0f - v51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = p61Var.N;
                        if (f11 == 0.0f && p61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(p61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - v51Var.I) * (1.0f - p61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((p61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (v51Var.I * AndroidUtilities.dp(45.0f)) + v51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = p61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - v51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (g71Var.f33779a0.getX() + g71Var.f33809o0.getX() + v51Var.f32707y), g71Var.f33779a0.getY() + ((int) g71Var.f33809o0.getY()) + v51Var.E);
                        g71Var.f33809o0.draw(canvas);
                        canvas.restore();
                    } else if (p61Var.f36450s && (imageReceiver = p61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - v51Var.I);
                        p61Var.h.setImageCoords(rect);
                        p61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(v51Var.I);
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
        switch (this.f34754a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    st stVar = (st) this.f34755b;
                    if (!stVar.f37466n && !stVar.K) {
                        stVar.n();
                        return true;
                    }
                    stVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f34754a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((h51) this.f34755b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f34754a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((yh0) this.f34755b).f39902q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((v51) this.f34755b).f32699b;
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
        switch (this.f34754a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34754a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((yh0) this.f34755b).f39902q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((v51) this.f34755b).f32699b;
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
        switch (this.f34754a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f34755b).f22162f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((jq0) this.f34755b).f34952b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((ar0) this.f34755b).f31910b.size(), new Object[0]));
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
        switch (this.f34754a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f34755b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
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
        switch (this.f34754a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f34755b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.p.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f32664c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.wl.y(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f32664c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.C(8.0f, y3, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.f34755b;
                e70Var.g0();
                e70Var.h0();
                org.telegram.ui.Components.b20 b20Var = e70Var.f33239f;
                le.e eVar = e70Var.f33233b;
                b20Var.setTranslationY(eVar.e);
                e70Var.i0();
                e70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                w70 w70Var = (w70) this.f34755b;
                TextView textView = w70Var.f38787b;
                if (textView != null) {
                    int measuredWidth = ((w70Var.f38787b.getMeasuredWidth() / 2) + textView.getLeft()) - (w70Var.f38788c.getMeasuredWidth() / 2);
                    int top = (w70Var.e.getTop() + ((w70Var.f38787b.getMeasuredHeight() - w70Var.f38788c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = w70Var.f38788c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, w70Var.f38788c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                l80 l80Var = (l80) this.f34755b;
                l80Var.Z();
                l80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                wg0 wg0Var = (wg0) this.f34755b;
                for (org.telegram.ui.Components.uv0 uv0Var : wg0Var.f39195b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!uv0Var.a() && wg0Var.f39197c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    uv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                eh0 eh0Var = (eh0) this.f34755b;
                eh0Var.i0();
                eh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34755b;
                WindowInsets windowInsets = secretMediaViewer.f31452g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.n6 n6Var = secretMediaViewer.e;
                n6Var.layout(i14, 0, n6Var.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f31491y0 = 1.0f;
                        secretMediaViewer.f31486w0 = 0.0f;
                        secretMediaViewer.f31489x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f31491y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((h51) this.f34755b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                v51 v51Var = (v51) this.f34755b;
                Context context = v51Var.getContext();
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
                    Bitmap bitmap = v51Var.f32702n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || v51Var.f32702n.getHeight() != decorView.getMeasuredHeight()) {
                        v51Var.f();
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
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f34754a) {
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
                e70 e70Var = (e70) this.f34755b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    e70Var.f33236c0 = AndroidUtilities.dp(56.0f);
                } else {
                    e70Var.f33236c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(e70.c0(e70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) e70Var.f33254s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + e70.d0(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.e.getLayoutParams()).topMargin = e70.V(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.f33239f.getLayoutParams()).topMargin = e70.W(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.h.getLayoutParams()).topMargin = e70.X(e70Var).getMeasuredHeight();
                e70Var.h.getLayoutParams().height = e70Var.f33236c0;
                ((ViewGroup.MarginLayoutParams) e70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + e70.Y(e70Var).getMeasuredHeight() + e70Var.f33236c0;
                e70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                l80 l80Var = (l80) this.f34755b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    l80Var.f35374x = AndroidUtilities.dp(56.0f);
                } else {
                    l80Var.f35374x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(l80.W(l80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) l80Var.f35371r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + l80.X(l80Var).getMeasuredHeight();
                l80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + l80Var.f35374x;
                l80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                fd0 fd0Var = ((id0) this.f34755b).f34642x;
                if (fd0Var != null) {
                    fd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wg0 wg0Var = (wg0) this.f34755b;
                for (org.telegram.ui.Components.uv0 uv0Var : wg0Var.f39195b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) uv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!uv0Var.a() && wg0Var.f39197c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    uv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                aq0 aq0Var = (aq0) this.f34755b;
                FrameLayout frameLayout = aq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) aq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f34755b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34755b;
                WindowInsets windowInsets = secretMediaViewer.f31452g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f31452g0;
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
                vd1 vd1Var = (vd1) this.f34755b;
                kVar = ((org.telegram.ui.ActionBar.n2) vd1Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.n2) vd1Var).actionBar;
                int measuredHeight2 = kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.n2) vd1Var).actionBar;
                if (kVar3.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) vd1Var.f38551n0.getLayoutParams()).topMargin = measuredHeight2;
                vd1Var.f38551n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(vd1Var.f38555p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((gh1) this.f34755b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34754a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                st stVar = (st) this.f34755b;
                gh.d.c(stVar.f37471s, stVar.f37476y);
                stVar.f37472t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34754a) {
            case 19:
                if (!((PopupNotificationActivity) this.f34755b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f34754a) {
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
        switch (this.f34754a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f34755b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f34754a) {
            case 4:
                super.setTranslationY(f7);
                ((ub) this.f34755b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.T8;
                ((PhotoViewer) this.f34755b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34754a) {
            case 3:
                l6 l6Var = (l6) this.f34755b;
                if (drawable != l6Var.f35348c && drawable != l6Var.f35347b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f34754a = i10;
        this.f34755b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
