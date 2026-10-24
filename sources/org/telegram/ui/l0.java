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
    public final int f39077a;
    public Object f39078b;

    public l0(Context context) {
        super(context);
        this.f39077a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39077a) {
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
        switch (this.f39077a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f39078b;
                int c10 = ((measuredWidth - ((int) o6Var.f40089c.c())) + ((int) o6Var.f40088b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f40088b.setBounds(0, 0, c10, getHeight());
                o6Var.f40088b.draw(canvas);
                o6Var.f40089c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                o6Var.f40089c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ou ouVar = (ou) this.f39078b;
                if (ouVar.getParentLayout() != null && (k91Var = ouVar.f40258b) != null) {
                    float measuredHeight = k91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.f21305k0);
                    return;
                }
                return;
            case 7:
                p60 p60Var = (p60) this.f39078b;
                bh.f fVar = p60Var.f40367p0;
                gh.d dVar = p60Var.f40368q0;
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
                AndroidUtilities.drawNavigationBarProtection(canvas, this, p60Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6), p60Var.m0);
                return;
            case 9:
                x70 x70Var = (x70) this.f39078b;
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
                LaunchActivity launchActivity = (LaunchActivity) this.f39078b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33508z1 == null) {
                        launchActivity.f33508z1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33508z1);
                    int[] iArr2 = launchActivity.f33508z1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33508z1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                qg0 qg0Var = (qg0) this.f39078b;
                qg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.k6.f21126a7;
                int themedColor = qg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.k6.f21184d6;
                int themedColor2 = qg0Var.getThemedColor(i14);
                sg1 sg1Var = qg0Var.f42051c;
                float f10 = 1.0f;
                if (sg1Var != null) {
                    f7 = sg1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int f11 = i0.a.f(f7, themedColor, themedColor2);
                int i15 = qg0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.k6.m0(f11));
                }
                if (qg0Var.N != 0) {
                    canvas.drawRect(getWidth() - qg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.m0(f11));
                }
                super.dispatchDraw(canvas);
                qg0Var.d0();
                gh.c cVar = qg0Var.R;
                int themedColor3 = qg0Var.getThemedColor(i13);
                int themedColor4 = qg0Var.getThemedColor(i14);
                sg1 sg1Var2 = qg0Var.f42051c;
                if (sg1Var2 != null) {
                    f10 = sg1Var2.r(0);
                }
                cVar.a(i0.a.f(f10, themedColor3, themedColor4));
                View view2 = qg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                a41 a41Var = (a41) this.f39078b;
                if (a41Var.f35587s > 0.0f && a41Var.f35585n != null) {
                    a41Var.f35586r.reset();
                    float width = getWidth() / a41Var.f35584f.getWidth();
                    a41Var.f35586r.postScale(width, width);
                    a41Var.h.setLocalMatrix(a41Var.f35586r);
                    a41Var.f35585n.setAlpha((int) (a41Var.f35587s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), a41Var.f35585n);
                }
                if (a41Var.W && (t1Var = a41Var.O) != null) {
                    t1Var.setVisibility(4);
                    a41Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                p41 p41Var = (p41) this.f39078b;
                ImageReceiver imageReceiver2 = p41Var.f42905b;
                Rect rect = p41Var.e;
                a61 a61Var = p41Var.P;
                j51 j51Var = p41Var.f42904a;
                if (p41Var.f42908n != null && p41Var.f42909r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    p41Var.f42909r.setAlpha((int) (p41Var.I * 255.0f));
                    canvas.drawBitmap(p41Var.f42908n, 0.0f, 0.0f, p41Var.f42909r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (j51Var != null) {
                    Drawable drawable = j51Var.E;
                    if (drawable != null) {
                        if (p41Var.f42912x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(p41Var.I, a61Var.f35634n1, a61Var.f35619f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(a61Var.f35629k1);
                        }
                        drawable.setAlpha((int) ((1.0f - p41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = j51Var.N;
                        if (f12 == 0.0f && j51Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(j51Var.S * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - p41Var.I) * (1.0f - j51Var.O));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((j51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (p41Var.I * AndroidUtilities.dp(45.0f)) + p41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = j51Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - p41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (a61Var.f35605a0.getX() + a61Var.f35635o0.getX() + p41Var.f42913y), a61Var.f35605a0.getY() + ((int) a61Var.f35635o0.getY()) + p41Var.E);
                        a61Var.f35635o0.draw(canvas);
                        canvas.restore();
                    } else if (j51Var.f38468s && (imageReceiver = j51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - p41Var.I);
                        j51Var.h.setImageCoords(rect);
                        j51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(p41Var.I);
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
        switch (this.f39077a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ht htVar = (ht) this.f39078b;
                    if (!htVar.f37998n && !htVar.K) {
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
        switch (this.f39077a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((a41) this.f39078b).dismiss();
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
        switch (this.f39077a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((lh0) this.f39078b).f39291q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((p41) this.f39078b).f42905b;
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
        switch (this.f39077a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39077a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((lh0) this.f39078b).f39291q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((p41) this.f39078b).f42905b;
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
        switch (this.f39077a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39078b).f24488f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((up0) this.f39078b).f42464b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((lq0) this.f39078b).f39335b.size(), new Object[0]));
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
        switch (this.f39077a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f39078b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.sw0[] sw0VarArr;
        int i14;
        Activity activity;
        switch (this.f39077a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                g5 g5Var = (g5) this.f39078b;
                g5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.r.b((paddingTop - g5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                g5Var.f37447c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.tl.A(48.0f, (paddingTop - b10) - g5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) g5Var.f37447c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.v0.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                p60 p60Var = (p60) this.f39078b;
                p60Var.g0();
                p60Var.h0();
                org.telegram.ui.Components.i20 i20Var = p60Var.f40356f;
                ne.e eVar = p60Var.f40350b;
                i20Var.setTranslationY(eVar.e);
                p60Var.i0();
                p60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                g70 g70Var = (g70) this.f39078b;
                TextView textView = g70Var.f37469b;
                if (textView != null) {
                    int measuredWidth = ((g70Var.f37469b.getMeasuredWidth() / 2) + textView.getLeft()) - (g70Var.f37470c.getMeasuredWidth() / 2);
                    int top = (g70Var.e.getTop() + ((g70Var.f37469b.getMeasuredHeight() - g70Var.f37470c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = g70Var.f37470c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, g70Var.f37470c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                x70 x70Var = (x70) this.f39078b;
                x70Var.Z();
                x70Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                hg0 hg0Var = (hg0) this.f39078b;
                for (org.telegram.ui.Components.sw0 sw0Var : hg0Var.f37835b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!sw0Var.a() && hg0Var.f37837c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    sw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                qg0 qg0Var = (qg0) this.f39078b;
                qg0Var.i0();
                qg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39078b;
                WindowInsets windowInsets = secretMediaViewer.f34103g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.v vVar = secretMediaViewer.e;
                vVar.layout(i14, 0, vVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34142y0 = 1.0f;
                        secretMediaViewer.f34137w0 = 0.0f;
                        secretMediaViewer.f34140x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34142y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((a41) this.f39078b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                p41 p41Var = (p41) this.f39078b;
                Context context = p41Var.getContext();
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
                    Bitmap bitmap = p41Var.f42908n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || p41Var.f42908n.getHeight() != decorView.getMeasuredHeight()) {
                        p41Var.f();
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
        org.telegram.ui.Components.sw0[] sw0VarArr;
        switch (this.f39077a) {
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
                p60 p60Var = (p60) this.f39078b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    p60Var.f40353c0 = AndroidUtilities.dp(56.0f);
                } else {
                    p60Var.f40353c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(p60.c0(p60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) p60Var.f40371s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + p60.d0(p60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) p60Var.e.getLayoutParams()).topMargin = p60.V(p60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) p60Var.f40356f.getLayoutParams()).topMargin = p60.W(p60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) p60Var.h.getLayoutParams()).topMargin = p60.X(p60Var).getMeasuredHeight();
                p60Var.h.getLayoutParams().height = p60Var.f40353c0;
                ((ViewGroup.MarginLayoutParams) p60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + p60.Y(p60Var).getMeasuredHeight() + p60Var.f40353c0;
                p60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                x70 x70Var = (x70) this.f39078b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    x70Var.f43495x = AndroidUtilities.dp(56.0f);
                } else {
                    x70Var.f43495x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(x70.W(x70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) x70Var.f43492r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + x70.X(x70Var).getMeasuredHeight();
                x70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + x70Var.f43495x;
                x70Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                oc0 oc0Var = ((rc0) this.f39078b).f41122x;
                if (oc0Var != null) {
                    oc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                hg0 hg0Var = (hg0) this.f39078b;
                for (org.telegram.ui.Components.sw0 sw0Var : hg0Var.f37835b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!sw0Var.a() && hg0Var.f37837c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    sw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                kp0 kp0Var = (kp0) this.f39078b;
                FrameLayout frameLayout = kp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) kp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f39078b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39078b;
                WindowInsets windowInsets = secretMediaViewer.f34103g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34103g0;
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
                pc1 pc1Var = (pc1) this.f39078b;
                measureChildWithMargins(pc1.s0(pc1Var), i10, 0, i11, 0);
                int measuredHeight2 = pc1.u0(pc1Var).getMeasuredHeight();
                if (pc1.v0(pc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) pc1Var.f40483o0.getLayoutParams()).topMargin = measuredHeight2;
                pc1Var.f40483o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(pc1Var.f40487q0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((ag1) this.f39078b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39077a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                ht htVar = (ht) this.f39078b;
                hh.d.c(htVar.f38003s, htVar.f38008y);
                htVar.f38004t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39077a) {
            case 19:
                if (!((PopupNotificationActivity) this.f39078b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39077a) {
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
        switch (this.f39077a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f39078b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39077a) {
            case 4:
                super.setTranslationY(f7);
                ((vb) this.f39078b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39078b).H1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39077a) {
            case 3:
                o6 o6Var = (o6) this.f39078b;
                if (drawable != o6Var.f40089c && drawable != o6Var.f40088b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f39077a = i10;
        this.f39078b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
