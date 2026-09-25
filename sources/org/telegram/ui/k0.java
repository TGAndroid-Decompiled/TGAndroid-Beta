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
    public final int f34903a;
    public Object f34904b;

    public k0(Context context) {
        super(context);
        this.f34903a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f34903a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.v81 v81Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f34903a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                k6 k6Var = (k6) this.f34904b;
                int d = ((measuredWidth - ((int) k6Var.f34948c.d())) + ((int) k6Var.f34947b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                k6Var.f34947b.setBounds(0, 0, d, getHeight());
                k6Var.f34947b.draw(canvas);
                k6Var.f34948c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                k6Var.f34948c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                vu vuVar = (vu) this.f34904b;
                if (vuVar.getParentLayout() != null && (v81Var = vuVar.f38818b) != null) {
                    float measuredHeight = v81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.f19181k0);
                    return;
                }
                return;
            case 7:
                z60 z60Var = (z60) this.f34904b;
                ah.h hVar = z60Var.f40386p0;
                fh.d dVar = z60Var.f40387q0;
                if (Build.VERSION.SDK_INT >= 31 && hVar != null) {
                    z60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f9060n && dVar.g(measuredWidth2, measuredHeight2)) {
                        hVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, z60Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6), z60Var.m0);
                return;
            case 9:
                g80 g80Var = (g80) this.f34904b;
                ah.h hVar2 = g80Var.L;
                fh.d dVar2 = g80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && hVar2 != null) {
                    g80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9060n && dVar2.g(measuredWidth3, measuredHeight3)) {
                        hVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f34904b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f31146x1 == null) {
                        launchActivity.f31146x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f31146x1);
                    int[] iArr2 = launchActivity.f31146x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f31146x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                yg0 yg0Var = (yg0) this.f34904b;
                yg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.h6.f19004a7;
                int themedColor = yg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.h6.f19060d6;
                int themedColor2 = yg0Var.getThemedColor(i14);
                sh1 sh1Var = yg0Var.f38127c;
                float f10 = 1.0f;
                if (sh1Var != null) {
                    f7 = sh1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = yg0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.h6.l0(d10));
                }
                if (yg0Var.N != 0) {
                    canvas.drawRect(getWidth() - yg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.l0(d10));
                }
                super.dispatchDraw(canvas);
                yg0Var.d0();
                fh.c cVar = yg0Var.R;
                int themedColor3 = yg0Var.getThemedColor(i13);
                int themedColor4 = yg0Var.getThemedColor(i14);
                sh1 sh1Var2 = yg0Var.f38127c;
                if (sh1Var2 != null) {
                    f10 = sh1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = yg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                b51 b51Var = (b51) this.f34904b;
                if (b51Var.f32333s > 0.0f && b51Var.f32331n != null) {
                    b51Var.f32332r.reset();
                    float width = getWidth() / b51Var.f32330f.getWidth();
                    b51Var.f32332r.postScale(width, width);
                    b51Var.h.setLocalMatrix(b51Var.f32332r);
                    b51Var.f32331n.setAlpha((int) (b51Var.f32333s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), b51Var.f32331n);
                }
                if (b51Var.W && (u1Var = b51Var.O) != null) {
                    u1Var.setVisibility(4);
                    b51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                p51 p51Var = (p51) this.f34904b;
                ImageReceiver imageReceiver2 = p51Var.f38905b;
                Rect rect = p51Var.e;
                a71 a71Var = p51Var.P;
                j61 j61Var = p51Var.f38904a;
                if (p51Var.f38908n != null && p51Var.f38909r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    p51Var.f38909r.setAlpha((int) (p51Var.I * 255.0f));
                    canvas.drawBitmap(p51Var.f38908n, 0.0f, 0.0f, p51Var.f38909r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (j61Var != null) {
                    Drawable drawable = j61Var.E;
                    if (drawable != null) {
                        if (p51Var.f38912x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(p51Var.I, a71Var.f32037m1, a71Var.f32025f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(a71Var.f32035k1);
                        }
                        drawable.setAlpha((int) ((1.0f - p51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = j61Var.N;
                        if (f11 == 0.0f && j61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(j61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - p51Var.I) * (1.0f - j61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((j61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (p51Var.I * AndroidUtilities.dp(45.0f)) + p51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = j61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - p51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (a71Var.f32011a0.getX() + a71Var.f32041o0.getX() + p51Var.f38913y), a71Var.f32011a0.getY() + ((int) a71Var.f32041o0.getY()) + p51Var.E);
                        a71Var.f32041o0.draw(canvas);
                        canvas.restore();
                    } else if (j61Var.f34669s && (imageReceiver = j61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - p51Var.I);
                        j61Var.h.setImageCoords(rect);
                        j61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(p51Var.I);
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
        switch (this.f34903a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    nt ntVar = (nt) this.f34904b;
                    if (!ntVar.f35988n && !ntVar.K) {
                        ntVar.n();
                        return true;
                    }
                    ntVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f34903a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((b51) this.f34904b).dismiss();
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
        switch (this.f34903a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((sh0) this.f34904b).f37789q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((p51) this.f34904b).f38905b;
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
        switch (this.f34903a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34903a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((sh0) this.f34904b).f37789q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((p51) this.f34904b).f38905b;
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
        switch (this.f34903a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f34904b).f22385f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((cq0) this.f34904b).f32773b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((tq0) this.f34904b).f38191b.size(), new Object[0]));
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
        switch (this.f34903a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f34904b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.fw0[] fw0VarArr;
        int i14;
        Activity activity;
        switch (this.f34903a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f34904b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.q.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f32563c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.ok.A(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f32563c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.f0.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                z60 z60Var = (z60) this.f34904b;
                z60Var.g0();
                z60Var.h0();
                org.telegram.ui.Components.c20 c20Var = z60Var.f40375f;
                le.f fVar = z60Var.f40369b;
                c20Var.setTranslationY(fVar.e);
                z60Var.i0();
                z60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + fVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                r70 r70Var = (r70) this.f34904b;
                TextView textView = r70Var.f37198b;
                if (textView != null) {
                    int measuredWidth = ((r70Var.f37198b.getMeasuredWidth() / 2) + textView.getLeft()) - (r70Var.f37199c.getMeasuredWidth() / 2);
                    int top = (r70Var.e.getTop() + ((r70Var.f37198b.getMeasuredHeight() - r70Var.f37199c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = r70Var.f37199c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, r70Var.f37199c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                g80 g80Var = (g80) this.f34904b;
                g80Var.Z();
                g80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                qg0 qg0Var = (qg0) this.f34904b;
                for (org.telegram.ui.Components.fw0 fw0Var : qg0Var.f36888b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!fw0Var.a() && qg0Var.f36890c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    fw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                yg0 yg0Var = (yg0) this.f34904b;
                yg0Var.i0();
                yg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34904b;
                WindowInsets windowInsets = secretMediaViewer.f31739g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f31778y0 = 1.0f;
                        secretMediaViewer.f31773w0 = 0.0f;
                        secretMediaViewer.f31776x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f31778y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((b51) this.f34904b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                p51 p51Var = (p51) this.f34904b;
                Context context = p51Var.getContext();
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
                    Bitmap bitmap = p51Var.f38908n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || p51Var.f38908n.getHeight() != decorView.getMeasuredHeight()) {
                        p51Var.f();
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
        org.telegram.ui.Components.fw0[] fw0VarArr;
        switch (this.f34903a) {
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
                z60 z60Var = (z60) this.f34904b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    z60Var.f40372c0 = AndroidUtilities.dp(56.0f);
                } else {
                    z60Var.f40372c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(z60.c0(z60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) z60Var.f40390s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + z60.d0(z60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z60Var.e.getLayoutParams()).topMargin = z60.V(z60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z60Var.f40375f.getLayoutParams()).topMargin = z60.W(z60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z60Var.h.getLayoutParams()).topMargin = z60.X(z60Var).getMeasuredHeight();
                z60Var.h.getLayoutParams().height = z60Var.f40372c0;
                ((ViewGroup.MarginLayoutParams) z60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + z60.Y(z60Var).getMeasuredHeight() + z60Var.f40372c0;
                z60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                g80 g80Var = (g80) this.f34904b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    g80Var.f33858x = AndroidUtilities.dp(56.0f);
                } else {
                    g80Var.f33858x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(g80.W(g80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) g80Var.f33855r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + g80.X(g80Var).getMeasuredHeight();
                g80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + g80Var.f33858x;
                g80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                zc0 zc0Var = ((cd0) this.f34904b).f32686x;
                if (zc0Var != null) {
                    zc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                qg0 qg0Var = (qg0) this.f34904b;
                for (org.telegram.ui.Components.fw0 fw0Var : qg0Var.f36888b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!fw0Var.a() && qg0Var.f36890c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    fw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                tp0 tp0Var = (tp0) this.f34904b;
                FrameLayout frameLayout = tp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) tp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f34904b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34904b;
                WindowInsets windowInsets = secretMediaViewer.f31739g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f31739g0;
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
                od1 od1Var = (od1) this.f34904b;
                measureChildWithMargins(od1.t0(od1Var), i10, 0, i11, 0);
                int measuredHeight2 = od1.v0(od1Var).getMeasuredHeight();
                if (od1.w0(od1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) od1Var.f36191n0.getLayoutParams()).topMargin = measuredHeight2;
                od1Var.f36191n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(od1Var.f36195p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((zg1) this.f34904b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34903a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                nt ntVar = (nt) this.f34904b;
                gh.d.c(ntVar.f35993s, ntVar.f35998y);
                ntVar.f35994t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34903a) {
            case 19:
                if (!((PopupNotificationActivity) this.f34904b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f34903a) {
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
        switch (this.f34903a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f34904b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f34903a) {
            case 4:
                super.setTranslationY(f7);
                ((ub) this.f34904b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f34904b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34903a) {
            case 3:
                k6 k6Var = (k6) this.f34904b;
                if (drawable != k6Var.f34948c && drawable != k6Var.f34947b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f34903a = i10;
        this.f34904b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
