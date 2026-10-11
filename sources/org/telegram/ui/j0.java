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
    public final int f38805a;
    public Object f38806b;

    public j0(Context context) {
        super(context);
        this.f38805a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f38805a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.p91 p91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f38805a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                j6 j6Var = (j6) this.f38806b;
                int c10 = ((measuredWidth - ((int) j6Var.f38859c.c())) + ((int) j6Var.f38858b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                j6Var.f38858b.setBounds(0, 0, c10, getHeight());
                j6Var.f38858b.draw(canvas);
                j6Var.f38859c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                j6Var.f38859c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                xu xuVar = (xu) this.f38806b;
                if (xuVar.getParentLayout() != null && (p91Var = xuVar.f44186b) != null) {
                    float measuredHeight = p91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.f20908k0);
                    return;
                }
                return;
            case 7:
                c70 c70Var = (c70) this.f38806b;
                ah.h hVar = c70Var.f36604p0;
                fh.d dVar = c70Var.f36605q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    c70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f9938n && dVar.f(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, c70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6), c70Var.m0);
                return;
            case 9:
                k80 k80Var = (k80) this.f38806b;
                ah.h hVar2 = k80Var.L;
                fh.d dVar2 = k80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    k80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9938n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f38806b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33850x1 == null) {
                        launchActivity.f33850x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33850x1);
                    int[] iArr2 = launchActivity.f33850x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33850x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                eh0 eh0Var = (eh0) this.f38806b;
                eh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.h6.f20730a7;
                int themedColor = eh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.h6.f20786d6;
                int themedColor2 = eh0Var.getThemedColor(i14);
                ai1 ai1Var = eh0Var.f36401c;
                float f10 = 1.0f;
                if (ai1Var != null) {
                    f7 = ai1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d = i0.a.d(f7, themedColor, themedColor2);
                int i15 = eh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.h6.m0(d));
                }
                if (eh0Var.N != 0) {
                    canvas.drawRect(getWidth() - eh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.m0(d));
                }
                super.dispatchDraw(canvas);
                eh0Var.d0();
                fh.c cVar = eh0Var.R;
                int themedColor3 = eh0Var.getThemedColor(i13);
                int themedColor4 = eh0Var.getThemedColor(i14);
                ai1 ai1Var2 = eh0Var.f36401c;
                if (ai1Var2 != null) {
                    f10 = ai1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = eh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                j51 j51Var = (j51) this.f38806b;
                if (j51Var.f38853s > 0.0f && j51Var.f38851n != null) {
                    j51Var.f38852r.reset();
                    float width = getWidth() / j51Var.f38850f.getWidth();
                    j51Var.f38852r.postScale(width, width);
                    j51Var.h.setLocalMatrix(j51Var.f38852r);
                    j51Var.f38851n.setAlpha((int) (j51Var.f38853s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), j51Var.f38851n);
                }
                if (j51Var.W && (u1Var = j51Var.O) != null) {
                    u1Var.setVisibility(4);
                    j51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                y51 y51Var = (y51) this.f38806b;
                ImageReceiver imageReceiver2 = y51Var.f37565b;
                Rect rect = y51Var.f37567e;
                j71 j71Var = y51Var.P;
                s61 s61Var = y51Var.f37564a;
                if (y51Var.f37569n != null && y51Var.f37570r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    y51Var.f37570r.setAlpha((int) (y51Var.I * 255.0f));
                    canvas.drawBitmap(y51Var.f37569n, 0.0f, 0.0f, y51Var.f37570r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (s61Var != null) {
                    Drawable drawable = s61Var.E;
                    if (drawable != null) {
                        if (y51Var.f37573x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(y51Var.I, j71Var.f38903m1, j71Var.f38891f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(j71Var.f38901k1);
                        }
                        drawable.setAlpha((int) ((1.0f - y51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = s61Var.N;
                        if (f11 == 0.0f && s61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(s61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - y51Var.I) * (1.0f - s61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((s61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (y51Var.I * AndroidUtilities.dp(45.0f)) + y51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = s61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - y51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (j71Var.f38876a0.getX() + j71Var.f38907o0.getX() + y51Var.f37574y), j71Var.f38876a0.getY() + ((int) j71Var.f38907o0.getY()) + y51Var.E);
                        j71Var.f38907o0.draw(canvas);
                        canvas.restore();
                    } else if (s61Var.f41607s && (imageReceiver = s61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - y51Var.I);
                        s61Var.h.setImageCoords(rect);
                        s61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(y51Var.I);
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
        switch (this.f38805a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    qt qtVar = (qt) this.f38806b;
                    if (!qtVar.f41246n && !qtVar.K) {
                        qtVar.n();
                        return true;
                    }
                    qtVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f38805a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((j51) this.f38806b).dismiss();
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
        switch (this.f38805a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((yh0) this.f38806b).f44424q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((y51) this.f38806b).f37565b;
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
        switch (this.f38805a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f38805a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((yh0) this.f38806b).f44424q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((y51) this.f38806b).f37565b;
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
        switch (this.f38805a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f38806b).f24292f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((jq0) this.f38806b).f39100b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((ar0) this.f38806b).f36135b.size(), new Object[0]));
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
        switch (this.f38805a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f38806b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.zw0[] zw0VarArr;
        int i14;
        Activity activity;
        switch (this.f38805a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                b5 b5Var = (b5) this.f38806b;
                b5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.o.b((paddingTop - b5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                b5Var.f36267c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.ai.A(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) b5Var.f36267c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.q.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                c70 c70Var = (c70) this.f38806b;
                c70Var.g0();
                c70Var.h0();
                org.telegram.ui.Components.t20 t20Var = c70Var.f36593f;
                me.e eVar = c70Var.f36586b;
                t20Var.setTranslationY(eVar.f16373e);
                c70Var.i0();
                c70Var.f36591e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f16373e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                v70 v70Var = (v70) this.f38806b;
                TextView textView = v70Var.f42892b;
                if (textView != null) {
                    int measuredWidth = ((v70Var.f42892b.getMeasuredWidth() / 2) + textView.getLeft()) - (v70Var.f42893c.getMeasuredWidth() / 2);
                    int top = (v70Var.f42894e.getTop() + ((v70Var.f42892b.getMeasuredHeight() - v70Var.f42893c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = v70Var.f42893c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, v70Var.f42893c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                k80 k80Var = (k80) this.f38806b;
                k80Var.Z();
                k80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                vg0 vg0Var = (vg0) this.f38806b;
                for (org.telegram.ui.Components.zw0 zw0Var : vg0Var.f43013b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!zw0Var.a() && vg0Var.f43015c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    zw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                eh0 eh0Var = (eh0) this.f38806b;
                eh0Var.i0();
                eh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38806b;
                WindowInsets windowInsets = secretMediaViewer.f34457g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.f34451e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.f34451e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34496y0 = 1.0f;
                        secretMediaViewer.f34491w0 = 0.0f;
                        secretMediaViewer.f34494x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34496y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((j51) this.f38806b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                y51 y51Var = (y51) this.f38806b;
                Context context = y51Var.getContext();
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
                    Bitmap bitmap = y51Var.f37569n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || y51Var.f37569n.getHeight() != decorView.getMeasuredHeight()) {
                        y51Var.f();
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
        org.telegram.ui.Components.zw0[] zw0VarArr;
        switch (this.f38805a) {
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
                c70 c70Var = (c70) this.f38806b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    c70Var.f36589c0 = AndroidUtilities.dp(56.0f);
                } else {
                    c70Var.f36589c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(c70.c0(c70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) c70Var.f36608s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + c70.d0(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.f36591e.getLayoutParams()).topMargin = c70.V(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.f36593f.getLayoutParams()).topMargin = c70.W(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.h.getLayoutParams()).topMargin = c70.X(c70Var).getMeasuredHeight();
                c70Var.h.getLayoutParams().height = c70Var.f36589c0;
                ((ViewGroup.MarginLayoutParams) c70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + c70.Y(c70Var).getMeasuredHeight() + c70Var.f36589c0;
                c70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                k80 k80Var = (k80) this.f38806b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    k80Var.f39231x = AndroidUtilities.dp(56.0f);
                } else {
                    k80Var.f39231x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(k80.W(k80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) k80Var.f39228r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + k80.X(k80Var).getMeasuredHeight();
                k80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + k80Var.f39231x;
                k80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                dd0 dd0Var = ((gd0) this.f38806b).f38044x;
                if (dd0Var != null) {
                    dd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                vg0 vg0Var = (vg0) this.f38806b;
                for (org.telegram.ui.Components.zw0 zw0Var : vg0Var.f43013b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!zw0Var.a() && vg0Var.f43015c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    zw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                zp0 zp0Var = (zp0) this.f38806b;
                FrameLayout frameLayout = zp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) zp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f38806b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38806b;
                WindowInsets windowInsets = secretMediaViewer.f34457g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34457g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f34451e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                wd1 wd1Var = (wd1) this.f38806b;
                measureChildWithMargins(wd1.t0(wd1Var), i10, 0, i11, 0);
                int measuredHeight2 = wd1.v0(wd1Var).getMeasuredHeight();
                if (wd1.w0(wd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) wd1Var.f43364n0.getLayoutParams()).topMargin = measuredHeight2;
                wd1Var.f43364n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(wd1Var.f43368p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((hh1) this.f38806b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f38805a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                qt qtVar = (qt) this.f38806b;
                gh.d.c(qtVar.f41251s, qtVar.f41256y);
                qtVar.f41252t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38805a) {
            case 19:
                if (!((PopupNotificationActivity) this.f38806b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f38805a) {
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
        switch (this.f38805a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f38806b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f38805a) {
            case 4:
                super.setTranslationY(f7);
                ((ub) this.f38806b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f38806b).G1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f38805a) {
            case 3:
                j6 j6Var = (j6) this.f38806b;
                if (drawable != j6Var.f38859c && drawable != j6Var.f38858b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f38805a = i10;
        this.f38806b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
