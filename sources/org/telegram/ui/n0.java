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
public final class n0 extends FrameLayout {
    public final int f40659a;
    public Object f40660b;

    public n0(Context context) {
        super(context);
        this.f40659a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f40659a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.y71 y71Var;
        int[] iArr;
        float f9;
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f40659a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                k6 k6Var = (k6) this.f40660b;
                int d = ((measuredWidth - ((int) k6Var.f39760c.d())) + ((int) k6Var.f39759b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                k6Var.f39759b.setBounds(0, 0, d, getHeight());
                k6Var.f39759b.draw(canvas);
                k6Var.f39760c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                k6Var.f39760c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                pu puVar = (pu) this.f40660b;
                if (puVar.getParentLayout() != null && (y71Var = puVar.f41466b) != null) {
                    float measuredHeight = y71Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.g6.f23183k0);
                    return;
                }
                return;
            case 7:
                m60 m60Var = (m60) this.f40660b;
                lg.e eVar = m60Var.f40457l0;
                qg.d dVar = m60Var.m0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    m60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f46673n && dVar.e(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, m60Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6), m60Var.f40454i0);
                return;
            case 9:
                s70 s70Var = (s70) this.f40660b;
                lg.e eVar2 = s70Var.H;
                qg.d dVar2 = s70Var.I;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    s70Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f46673n && dVar2.e(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f40660b;
                View view = launchActivity.C0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f35600t1 == null) {
                        launchActivity.f35600t1 = new int[2];
                    }
                    launchActivity.C0.getLocationInWindow(launchActivity.f35600t1);
                    int[] iArr2 = launchActivity.f35600t1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f35600t1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.C0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                ng0 ng0Var = (ng0) this.f40660b;
                ng0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.g6.f23009a7;
                int themedColor = ng0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.g6.f23062d6;
                int themedColor2 = ng0Var.getThemedColor(i14);
                ug1 ug1Var = ng0Var.f43594c;
                float f10 = 1.0f;
                if (ug1Var != null) {
                    f9 = ug1Var.r(0);
                } else {
                    f9 = 1.0f;
                }
                int d10 = i0.a.d(f9, themedColor, themedColor2);
                int i15 = ng0Var.I;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.g6.l0(d10));
                }
                if (ng0Var.J != 0) {
                    canvas.drawRect(getWidth() - ng0Var.J, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.l0(d10));
                }
                super.dispatchDraw(canvas);
                ng0Var.d0();
                qg.c cVar = ng0Var.O;
                int themedColor3 = ng0Var.getThemedColor(i13);
                int themedColor4 = ng0Var.getThemedColor(i14);
                ug1 ug1Var2 = ng0Var.f43594c;
                if (ug1Var2 != null) {
                    f10 = ug1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = ng0Var.D;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                f41 f41Var = (f41) this.f40660b;
                if (f41Var.f37995s > 0.0f && f41Var.f37993n != null) {
                    f41Var.f37994r.reset();
                    float width = getWidth() / f41Var.f37992f.getWidth();
                    f41Var.f37994r.postScale(width, width);
                    f41Var.h.setLocalMatrix(f41Var.f37994r);
                    f41Var.f37993n.setAlpha((int) (f41Var.f37995s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), f41Var.f37993n);
                }
                if (f41Var.S && (s1Var = f41Var.K) != null) {
                    s1Var.setVisibility(4);
                    f41Var.S = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                s41 s41Var = (s41) this.f40660b;
                ImageReceiver imageReceiver2 = s41Var.f45075b;
                Rect rect = s41Var.f45077e;
                d61 d61Var = s41Var.L;
                m51 m51Var = s41Var.f45074a;
                if (s41Var.f45079n != null && s41Var.f45080r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    s41Var.f45080r.setAlpha((int) (s41Var.E * 255.0f));
                    canvas.drawBitmap(s41Var.f45079n, 0.0f, 0.0f, s41Var.f45080r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (m51Var != null) {
                    Drawable drawable = m51Var.A;
                    if (drawable != null) {
                        if (s41Var.f45083x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(s41Var.E, d61Var.f37339i1, d61Var.f37322b1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(d61Var.f37335g1);
                        }
                        drawable.setAlpha((int) ((1.0f - s41Var.E) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = m51Var.J;
                        if (f11 == 0.0f && m51Var.O <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(m51Var.O * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - s41Var.E) * (1.0f - m51Var.K));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((m51Var.L * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (s41Var.E * AndroidUtilities.dp(45.0f)) + s41Var.B);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = m51Var.L;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - s41Var.E) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (d61Var.T.getX() + d61Var.f37342k0.getX() + s41Var.f45084y), d61Var.T.getY() + ((int) d61Var.f37342k0.getY()) + s41Var.A);
                        d61Var.f37342k0.draw(canvas);
                        canvas.restore();
                    } else if (m51Var.f40433s && (imageReceiver = m51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - s41Var.E);
                        m51Var.h.setImageCoords(rect);
                        m51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(s41Var.E);
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
        switch (this.f40659a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ht htVar = (ht) this.f40660b;
                    if (!htVar.f39034n && !htVar.K) {
                        htVar.n();
                        return true;
                    }
                    htVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40659a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((f41) this.f40660b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.n0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f40659a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((hh0) this.f40660b).m0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((s41) this.f40660b).f45075b;
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
        switch (this.f40659a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f40659a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((hh0) this.f40660b).m0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((s41) this.f40660b).f45075b;
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
        switch (this.f40659a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f40660b).f26519f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((hp0) this.f40660b).f38985b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((zp0) this.f40660b).f45273b.size(), new Object[0]));
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
        switch (this.f40659a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f40660b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.mv0[] mv0VarArr;
        int i14;
        Activity activity;
        switch (this.f40659a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f40660b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = i7.w.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f36993c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int x4 = b.x(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f36993c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + x4;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.x3.C(8.0f, x4, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                m60 m60Var = (m60) this.f40660b;
                m60Var.g0();
                m60Var.h0();
                org.telegram.ui.Components.x10 x10Var = m60Var.f40450f;
                vd.c cVar = m60Var.f40443b;
                x10Var.setTranslationY(cVar.f49510e);
                m60Var.i0();
                m60Var.f40448e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.f49510e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.f40660b;
                TextView textView = e70Var.f37710b;
                if (textView != null) {
                    int measuredWidth = ((e70Var.f37710b.getMeasuredWidth() / 2) + textView.getLeft()) - (e70Var.f37711c.getMeasuredWidth() / 2);
                    int top = (e70Var.f37712e.getTop() + ((e70Var.f37710b.getMeasuredHeight() - e70Var.f37711c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = e70Var.f37711c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, e70Var.f37711c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                s70 s70Var = (s70) this.f40660b;
                s70Var.Z();
                s70Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                fg0 fg0Var = (fg0) this.f40660b;
                for (org.telegram.ui.Components.mv0 mv0Var : fg0Var.f38153b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!mv0Var.a() && fg0Var.f38155c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    mv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ng0 ng0Var = (ng0) this.f40660b;
                ng0Var.i0();
                ng0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40660b;
                WindowInsets windowInsets = secretMediaViewer.f36188c0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                bg.d1 d1Var = secretMediaViewer.f36192e;
                d1Var.layout(i14, 0, d1Var.getMeasuredWidth() + i14, secretMediaViewer.f36192e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.G0 == null) {
                        secretMediaViewer.f36226u0 = 1.0f;
                        secretMediaViewer.f36223s0 = 0.0f;
                        secretMediaViewer.f36225t0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f36226u0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((f41) this.f40660b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                s41 s41Var = (s41) this.f40660b;
                Context context = s41Var.getContext();
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
                    Bitmap bitmap = s41Var.f45079n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || s41Var.f45079n.getHeight() != decorView.getMeasuredHeight()) {
                        s41Var.f();
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
        org.telegram.ui.Components.mv0[] mv0VarArr;
        switch (this.f40659a) {
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
                m60 m60Var = (m60) this.f40660b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    m60Var.Y = AndroidUtilities.dp(56.0f);
                } else {
                    m60Var.Y = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(m60.c0(m60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) m60Var.f40464s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + m60.d0(m60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) m60Var.f40448e.getLayoutParams()).topMargin = m60.V(m60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) m60Var.f40450f.getLayoutParams()).topMargin = m60.W(m60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) m60Var.h.getLayoutParams()).topMargin = m60.X(m60Var).getMeasuredHeight();
                m60Var.h.getLayoutParams().height = m60Var.Y;
                ((ViewGroup.MarginLayoutParams) m60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + m60.Y(m60Var).getMeasuredHeight() + m60Var.Y;
                m60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                s70 s70Var = (s70) this.f40660b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    s70Var.f42302x = AndroidUtilities.dp(56.0f);
                } else {
                    s70Var.f42302x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(s70.W(s70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) s70Var.f42299r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + s70.X(s70Var).getMeasuredHeight();
                s70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + s70Var.f42302x;
                s70Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                oc0 oc0Var = ((rc0) this.f40660b).f42063x;
                if (oc0Var != null) {
                    oc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fg0 fg0Var = (fg0) this.f40660b;
                for (org.telegram.ui.Components.mv0 mv0Var : fg0Var.f38153b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) mv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!mv0Var.a() && fg0Var.f38155c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    mv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                yo0 yo0Var = (yo0) this.f40660b;
                FrameLayout frameLayout = yo0Var.C;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) yo0Var.C.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f40660b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40660b;
                WindowInsets windowInsets = secretMediaViewer.f36188c0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f36188c0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f36192e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                qc1 qc1Var = (qc1) this.f40660b;
                measureChildWithMargins(qc1.t0(qc1Var), i10, 0, i11, 0);
                int measuredHeight2 = qc1.v0(qc1Var).getMeasuredHeight();
                if (qc1.w0(qc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) qc1Var.f41651j0.getLayoutParams()).topMargin = measuredHeight2;
                qc1Var.f41651j0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(qc1Var.f41655l0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((cg1) this.f40660b).H.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40659a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                ht htVar = (ht) this.f40660b;
                rg.c.c(htVar.f39039s, htVar.f39044y);
                htVar.f39040t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40659a) {
            case 19:
                if (!((PopupNotificationActivity) this.f40660b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f40659a) {
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
    public void setScaleX(float f9) {
        switch (this.f40659a) {
            case 20:
                super.setScaleX(f9);
                ProfileActivity.V0((ProfileActivity) this.f40660b);
                return;
            default:
                super.setScaleX(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f40659a) {
            case 4:
                super.setTranslationY(f9);
                ((ob) this.f40660b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f9);
                Drawable[] drawableArr = PhotoViewer.P8;
                ((PhotoViewer) this.f40660b).F1();
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f40659a) {
            case 3:
                k6 k6Var = (k6) this.f40660b;
                if (drawable != k6Var.f39760c && drawable != k6Var.f39759b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n0(Object obj, Context context, int i10) {
        super(context);
        this.f40659a = i10;
        this.f40660b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
