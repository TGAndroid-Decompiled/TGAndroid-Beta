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
    public final int f39305a;
    public Object f39306b;

    public k0(Context context) {
        super(context);
        this.f39305a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39305a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.t91 t91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f39305a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                n6 n6Var = (n6) this.f39306b;
                int c10 = ((measuredWidth - ((int) n6Var.f40234c.c())) + ((int) n6Var.f40233b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                n6Var.f40233b.setBounds(0, 0, c10, getHeight());
                n6Var.f40233b.draw(canvas);
                n6Var.f40234c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                n6Var.f40234c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                bv bvVar = (bv) this.f39306b;
                if (bvVar.getParentLayout() != null && (t91Var = bvVar.f36257b) != null) {
                    float measuredHeight = t91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.f20681k0);
                    return;
                }
                return;
            case 7:
                e70 e70Var = (e70) this.f39306b;
                ah.h hVar = e70Var.f37011p0;
                fh.d dVar = e70Var.f37012q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    e70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f9937n && dVar.f(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, e70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20559d6), e70Var.m0);
                return;
            case 9:
                n80 n80Var = (n80) this.f39306b;
                ah.h hVar2 = n80Var.L;
                fh.d dVar2 = n80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    n80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9937n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f39306b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33659x1 == null) {
                        launchActivity.f33659x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33659x1);
                    int[] iArr2 = launchActivity.f33659x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33659x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                gh0 gh0Var = (gh0) this.f39306b;
                gh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.h6.f20503a7;
                int themedColor = gh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.h6.f20559d6;
                int themedColor2 = gh0Var.getThemedColor(i14);
                di1 di1Var = gh0Var.f37116c;
                float f10 = 1.0f;
                if (di1Var != null) {
                    f7 = di1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d = i0.a.d(f7, themedColor, themedColor2);
                int i15 = gh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.h6.m0(d));
                }
                if (gh0Var.N != 0) {
                    canvas.drawRect(getWidth() - gh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.m0(d));
                }
                super.dispatchDraw(canvas);
                gh0Var.d0();
                fh.c cVar = gh0Var.R;
                int themedColor3 = gh0Var.getThemedColor(i13);
                int themedColor4 = gh0Var.getThemedColor(i14);
                di1 di1Var2 = gh0Var.f37116c;
                if (di1Var2 != null) {
                    f10 = di1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = gh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                n51 n51Var = (n51) this.f39306b;
                if (n51Var.f40228s > 0.0f && n51Var.f40226n != null) {
                    n51Var.f40227r.reset();
                    float width = getWidth() / n51Var.f40225f.getWidth();
                    n51Var.f40227r.postScale(width, width);
                    n51Var.h.setLocalMatrix(n51Var.f40227r);
                    n51Var.f40226n.setAlpha((int) (n51Var.f40228s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), n51Var.f40226n);
                }
                if (n51Var.W && (u1Var = n51Var.O) != null) {
                    u1Var.setVisibility(4);
                    n51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                c61 c61Var = (c61) this.f39306b;
                ImageReceiver imageReceiver2 = c61Var.f39114b;
                Rect rect = c61Var.f39116e;
                n71 n71Var = c61Var.P;
                w61 w61Var = c61Var.f39113a;
                if (c61Var.f39118n != null && c61Var.f39119r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    c61Var.f39119r.setAlpha((int) (c61Var.I * 255.0f));
                    canvas.drawBitmap(c61Var.f39118n, 0.0f, 0.0f, c61Var.f39119r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (w61Var != null) {
                    Drawable drawable = w61Var.E;
                    if (drawable != null) {
                        if (c61Var.f39122x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(c61Var.I, n71Var.f40281m1, n71Var.f40269f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(n71Var.f40279k1);
                        }
                        drawable.setAlpha((int) ((1.0f - c61Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = w61Var.N;
                        if (f11 == 0.0f && w61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(w61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - c61Var.I) * (1.0f - w61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((w61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (c61Var.I * AndroidUtilities.dp(45.0f)) + c61Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = w61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - c61Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (n71Var.f40254a0.getX() + n71Var.f40285o0.getX() + c61Var.f39123y), n71Var.f40254a0.getY() + ((int) n71Var.f40285o0.getY()) + c61Var.E);
                        n71Var.f40285o0.draw(canvas);
                        canvas.restore();
                    } else if (w61Var.f43059s && (imageReceiver = w61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - c61Var.I);
                        w61Var.h.setImageCoords(rect);
                        w61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(c61Var.I);
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
        switch (this.f39305a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ut utVar = (ut) this.f39306b;
                    if (!utVar.f42580n && !utVar.K) {
                        utVar.n();
                        return true;
                    }
                    utVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39305a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((n51) this.f39306b).dismiss();
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
        switch (this.f39305a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((ai0) this.f39306b).f35834q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((c61) this.f39306b).f39114b;
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
        switch (this.f39305a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39305a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((ai0) this.f39306b).f35834q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((c61) this.f39306b).f39114b;
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
        switch (this.f39305a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39306b).f24077f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((mq0) this.f39306b).f40108b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((dr0) this.f39306b).f36868b.size(), new Object[0]));
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
        switch (this.f39305a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f39306b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.dx0[] dx0VarArr;
        int i14;
        Activity activity;
        switch (this.f39305a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                f5 f5Var = (f5) this.f39306b;
                f5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.n.b((paddingTop - f5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                f5Var.f37626c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.am.A(48.0f, (paddingTop - b10) - f5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) f5Var.f37626c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.f39306b;
                e70Var.g0();
                e70Var.h0();
                org.telegram.ui.Components.v20 v20Var = e70Var.f37000f;
                me.e eVar = e70Var.f36993b;
                v20Var.setTranslationY(eVar.f16095e);
                e70Var.i0();
                e70Var.f36998e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f16095e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                x70 x70Var = (x70) this.f39306b;
                TextView textView = x70Var.f43782b;
                if (textView != null) {
                    int measuredWidth = ((x70Var.f43782b.getMeasuredWidth() / 2) + textView.getLeft()) - (x70Var.f43783c.getMeasuredWidth() / 2);
                    int top = (x70Var.f43784e.getTop() + ((x70Var.f43782b.getMeasuredHeight() - x70Var.f43783c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = x70Var.f43783c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, x70Var.f43783c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                n80 n80Var = (n80) this.f39306b;
                n80Var.Z();
                n80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                xg0 xg0Var = (xg0) this.f39306b;
                for (org.telegram.ui.Components.dx0 dx0Var : xg0Var.f43934b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dx0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!dx0Var.a() && xg0Var.f43936c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    dx0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                gh0 gh0Var = (gh0) this.f39306b;
                gh0Var.i0();
                gh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39306b;
                WindowInsets windowInsets = secretMediaViewer.f34266g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.f34260e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.f34260e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34305y0 = 1.0f;
                        secretMediaViewer.f34300w0 = 0.0f;
                        secretMediaViewer.f34303x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34305y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((n51) this.f39306b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                c61 c61Var = (c61) this.f39306b;
                Context context = c61Var.getContext();
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
                    Bitmap bitmap = c61Var.f39118n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || c61Var.f39118n.getHeight() != decorView.getMeasuredHeight()) {
                        c61Var.f();
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
        org.telegram.ui.Components.dx0[] dx0VarArr;
        switch (this.f39305a) {
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
                e70 e70Var = (e70) this.f39306b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    e70Var.f36996c0 = AndroidUtilities.dp(56.0f);
                } else {
                    e70Var.f36996c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(e70.c0(e70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) e70Var.f37015s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + e70.d0(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.f36998e.getLayoutParams()).topMargin = e70.V(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.f37000f.getLayoutParams()).topMargin = e70.W(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.h.getLayoutParams()).topMargin = e70.X(e70Var).getMeasuredHeight();
                e70Var.h.getLayoutParams().height = e70Var.f36996c0;
                ((ViewGroup.MarginLayoutParams) e70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + e70.Y(e70Var).getMeasuredHeight() + e70Var.f36996c0;
                e70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                n80 n80Var = (n80) this.f39306b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    n80Var.f40324x = AndroidUtilities.dp(56.0f);
                } else {
                    n80Var.f40324x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(n80.W(n80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) n80Var.f40321r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + n80.X(n80Var).getMeasuredHeight();
                n80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + n80Var.f40324x;
                n80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                fd0 fd0Var = ((id0) this.f39306b).f38873x;
                if (fd0Var != null) {
                    fd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xg0 xg0Var = (xg0) this.f39306b;
                for (org.telegram.ui.Components.dx0 dx0Var : xg0Var.f43934b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dx0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!dx0Var.a() && xg0Var.f43936c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    dx0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                cq0 cq0Var = (cq0) this.f39306b;
                FrameLayout frameLayout = cq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) cq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f39306b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39306b;
                WindowInsets windowInsets = secretMediaViewer.f34266g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34266g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f34260e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                zd1 zd1Var = (zd1) this.f39306b;
                measureChildWithMargins(zd1.t0(zd1Var), i10, 0, i11, 0);
                int measuredHeight2 = zd1.v0(zd1Var).getMeasuredHeight();
                if (zd1.w0(zd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) zd1Var.f44768n0.getLayoutParams()).topMargin = measuredHeight2;
                zd1Var.f44768n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(zd1Var.f44772p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((kh1) this.f39306b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39305a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                ut utVar = (ut) this.f39306b;
                gh.d.c(utVar.f42585s, utVar.f42590y);
                utVar.f42586t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39305a) {
            case 19:
                if (!((PopupNotificationActivity) this.f39306b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39305a) {
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
        switch (this.f39305a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f39306b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39305a) {
            case 4:
                super.setTranslationY(f7);
                ((yb) this.f39306b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39306b).G1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39305a) {
            case 3:
                n6 n6Var = (n6) this.f39306b;
                if (drawable != n6Var.f40234c && drawable != n6Var.f40233b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f39305a = i10;
        this.f39306b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
