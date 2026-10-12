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
    public final int f37795a;
    public Object f37796b;

    public l0(Context context) {
        super(context);
        this.f37795a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f37795a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.j91 j91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f37795a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f37796b;
                int c10 = ((measuredWidth - ((int) o6Var.f38873c.c())) + ((int) o6Var.f38872b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f38872b.setBounds(0, 0, c10, getHeight());
                o6Var.f38872b.draw(canvas);
                o6Var.f38873c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                o6Var.f38873c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ev evVar = (ev) this.f37796b;
                if (evVar.getParentLayout() != null && (j91Var = evVar.f35679b) != null) {
                    float measuredHeight = j91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.g6.f20022k0);
                    return;
                }
                return;
            case 7:
                j70 j70Var = (j70) this.f37796b;
                bh.f fVar = j70Var.f37288p0;
                gh.d dVar = j70Var.f37289q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    j70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f10153n && dVar.f(measuredWidth2, measuredHeight2)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, j70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6), j70Var.m0);
                return;
            case 9:
                p80 p80Var = (p80) this.f37796b;
                bh.f fVar2 = p80Var.L;
                gh.d dVar2 = p80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    p80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f10153n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        fVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f37796b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f32148x1 == null) {
                        launchActivity.f32148x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f32148x1);
                    int[] iArr2 = launchActivity.f32148x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f32148x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                kh0 kh0Var = (kh0) this.f37796b;
                kh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.g6.f19843a7;
                int themedColor = kh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.g6.f19901d6;
                int themedColor2 = kh0Var.getThemedColor(i14);
                ii1 ii1Var = kh0Var.f37392c;
                float f10 = 1.0f;
                if (ii1Var != null) {
                    f7 = ii1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d = i0.a.d(f7, themedColor, themedColor2);
                int i15 = kh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.g6.m0(d));
                }
                if (kh0Var.N != 0) {
                    canvas.drawRect(getWidth() - kh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.g6.m0(d));
                }
                super.dispatchDraw(canvas);
                kh0Var.d0();
                gh.c cVar = kh0Var.R;
                int themedColor3 = kh0Var.getThemedColor(i13);
                int themedColor4 = kh0Var.getThemedColor(i14);
                ii1 ii1Var2 = kh0Var.f37392c;
                if (ii1Var2 != null) {
                    f10 = ii1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = kh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                r51 r51Var = (r51) this.f37796b;
                if (r51Var.f39607s > 0.0f && r51Var.f39605n != null) {
                    r51Var.f39606r.reset();
                    float width = getWidth() / r51Var.f39604f.getWidth();
                    r51Var.f39606r.postScale(width, width);
                    r51Var.h.setLocalMatrix(r51Var.f39606r);
                    r51Var.f39605n.setAlpha((int) (r51Var.f39607s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), r51Var.f39605n);
                }
                if (r51Var.W && (u1Var = r51Var.O) != null) {
                    u1Var.setVisibility(4);
                    r51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                g61 g61Var = (g61) this.f37796b;
                ImageReceiver imageReceiver2 = g61Var.f38556b;
                Rect rect = g61Var.e;
                r71 r71Var = g61Var.P;
                a71 a71Var = g61Var.f38555a;
                if (g61Var.f38559n != null && g61Var.f38560r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    g61Var.f38560r.setAlpha((int) (g61Var.I * 255.0f));
                    canvas.drawBitmap(g61Var.f38559n, 0.0f, 0.0f, g61Var.f38560r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (a71Var != null) {
                    Drawable drawable = a71Var.E;
                    if (drawable != null) {
                        if (g61Var.f38563x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(g61Var.I, r71Var.f39646m1, r71Var.f39634f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(r71Var.f39644k1);
                        }
                        drawable.setAlpha((int) ((1.0f - g61Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = a71Var.N;
                        if (f11 == 0.0f && a71Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(a71Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - g61Var.I) * (1.0f - a71Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((a71Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (g61Var.I * AndroidUtilities.dp(45.0f)) + g61Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = a71Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - g61Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (r71Var.f39620a0.getX() + r71Var.f39650o0.getX() + g61Var.f38564y), r71Var.f39620a0.getY() + ((int) r71Var.f39650o0.getY()) + g61Var.E);
                        r71Var.f39650o0.draw(canvas);
                        canvas.restore();
                    } else if (a71Var.f34069s && (imageReceiver = a71Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - g61Var.I);
                        a71Var.h.setImageCoords(rect);
                        a71Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(g61Var.I);
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
        switch (this.f37795a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    xt xtVar = (xt) this.f37796b;
                    if (!xtVar.f41945n && !xtVar.K) {
                        xtVar.n();
                        return true;
                    }
                    xtVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f37795a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((r51) this.f37796b).dismiss();
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
        switch (this.f37795a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((ei0) this.f37796b).f35604q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((g61) this.f37796b).f38556b;
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
        switch (this.f37795a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f37795a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((ei0) this.f37796b).f35604q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((g61) this.f37796b).f38556b;
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
        switch (this.f37795a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f37796b).f23282f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((qq0) this.f37796b).f39517b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((hr0) this.f37796b).f36915b.size(), new Object[0]));
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
        switch (this.f37795a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f37796b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
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
        switch (this.f37795a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                g5 g5Var = (g5) this.f37796b;
                g5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.s.b((paddingTop - g5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                g5Var.f36306c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int B = org.telegram.messenger.yh.B(48.0f, (paddingTop - b10) - g5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) g5Var.f36306c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + B;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.yh.c(8.0f, B, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                j70 j70Var = (j70) this.f37796b;
                j70Var.g0();
                j70Var.h0();
                org.telegram.ui.Components.o20 o20Var = j70Var.f37277f;
                ne.e eVar = j70Var.f37271b;
                o20Var.setTranslationY(eVar.e);
                j70Var.i0();
                j70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                a80 a80Var = (a80) this.f37796b;
                TextView textView = a80Var.f34075b;
                if (textView != null) {
                    int measuredWidth = ((a80Var.f34075b.getMeasuredWidth() / 2) + textView.getLeft()) - (a80Var.f34076c.getMeasuredWidth() / 2);
                    int top = (a80Var.e.getTop() + ((a80Var.f34075b.getMeasuredHeight() - a80Var.f34076c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = a80Var.f34076c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, a80Var.f34076c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                p80 p80Var = (p80) this.f37796b;
                p80Var.Z();
                p80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                bh0 bh0Var = (bh0) this.f37796b;
                for (org.telegram.ui.Components.tw0 tw0Var : bh0Var.f34545b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!tw0Var.a() && bh0Var.f34547c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    tw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                kh0 kh0Var = (kh0) this.f37796b;
                kh0Var.i0();
                kh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37796b;
                WindowInsets windowInsets = secretMediaViewer.f32743g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.v vVar = secretMediaViewer.e;
                vVar.layout(i14, 0, vVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f32782y0 = 1.0f;
                        secretMediaViewer.f32777w0 = 0.0f;
                        secretMediaViewer.f32780x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f32782y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((r51) this.f37796b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                g61 g61Var = (g61) this.f37796b;
                Context context = g61Var.getContext();
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
                    Bitmap bitmap = g61Var.f38559n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || g61Var.f38559n.getHeight() != decorView.getMeasuredHeight()) {
                        g61Var.f();
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
        switch (this.f37795a) {
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
                j70 j70Var = (j70) this.f37796b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    j70Var.f37274c0 = AndroidUtilities.dp(56.0f);
                } else {
                    j70Var.f37274c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(j70.c0(j70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) j70Var.f37292s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + j70.d0(j70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) j70Var.e.getLayoutParams()).topMargin = j70.V(j70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) j70Var.f37277f.getLayoutParams()).topMargin = j70.W(j70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) j70Var.h.getLayoutParams()).topMargin = j70.X(j70Var).getMeasuredHeight();
                j70Var.h.getLayoutParams().height = j70Var.f37274c0;
                ((ViewGroup.MarginLayoutParams) j70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + j70.Y(j70Var).getMeasuredHeight() + j70Var.f37274c0;
                j70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                p80 p80Var = (p80) this.f37796b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    p80Var.f39150x = AndroidUtilities.dp(56.0f);
                } else {
                    p80Var.f39150x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(p80.W(p80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) p80Var.f39147r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + p80.X(p80Var).getMeasuredHeight();
                p80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + p80Var.f39150x;
                p80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                kd0 kd0Var = ((nd0) this.f37796b).f38677x;
                if (kd0Var != null) {
                    kd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                bh0 bh0Var = (bh0) this.f37796b;
                for (org.telegram.ui.Components.tw0 tw0Var : bh0Var.f34545b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!tw0Var.a() && bh0Var.f34547c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    tw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                gq0 gq0Var = (gq0) this.f37796b;
                FrameLayout frameLayout = gq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) gq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f37796b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37796b;
                WindowInsets windowInsets = secretMediaViewer.f32743g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f32743g0;
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
                ce1 ce1Var = (ce1) this.f37796b;
                measureChildWithMargins(ce1.t0(ce1Var), i10, 0, i11, 0);
                int measuredHeight2 = ce1.v0(ce1Var).getMeasuredHeight();
                if (ce1.w0(ce1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) ce1Var.f34891n0.getLayoutParams()).topMargin = measuredHeight2;
                ce1Var.f34891n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(ce1Var.f34895p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((oh1) this.f37796b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f37795a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                xt xtVar = (xt) this.f37796b;
                hh.d.c(xtVar.f41950s, xtVar.f41955y);
                xtVar.f41951t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37795a) {
            case 19:
                if (!((PopupNotificationActivity) this.f37796b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f37795a) {
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
        switch (this.f37795a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f37796b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f37795a) {
            case 4:
                super.setTranslationY(f7);
                ((ac) this.f37796b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f37796b).G1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f37795a) {
            case 3:
                o6 o6Var = (o6) this.f37796b;
                if (drawable != o6Var.f38873c && drawable != o6Var.f38872b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f37795a = i10;
        this.f37796b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
