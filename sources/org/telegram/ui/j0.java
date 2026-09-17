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
    public final int f34727a;
    public Object f34728b;

    public j0(Context context) {
        super(context);
        this.f34727a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f34727a) {
            case 9:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f34727a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                m6 m6Var = (m6) this.f34728b;
                int d = ((measuredWidth - ((int) m6Var.f35692c.d())) + ((int) m6Var.f35691b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                m6Var.f35691b.setBounds(0, 0, d, getHeight());
                m6Var.f35691b.draw(canvas);
                m6Var.f35692c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                m6Var.f35692c.draw(canvas);
                return;
            case 6:
                g70 g70Var = (g70) this.f34728b;
                ah.i iVar = g70Var.f33886p0;
                fh.d dVar = g70Var.f33887q0;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    g70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.f9078n && dVar.f(measuredWidth2, measuredHeight)) {
                        iVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, g70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f18862d6), g70Var.m0);
                return;
            case 8:
                n80 n80Var = (n80) this.f34728b;
                ah.i iVar2 = n80Var.L;
                fh.d dVar2 = n80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && iVar2 != null) {
                    n80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9078n && dVar2.f(measuredWidth3, measuredHeight2)) {
                        iVar2.b(dVar2.a(measuredWidth3, measuredHeight2), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f34728b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f30873x1 == null) {
                        launchActivity.f30873x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f30873x1);
                    int[] iArr = launchActivity.f30873x1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.f30873x1;
                    int i12 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i10 - iArr2[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 12:
                gh0 gh0Var = (gh0) this.f34728b;
                gh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.j6.f18806a7;
                int themedColor = gh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.j6.f18862d6;
                int themedColor2 = gh0Var.getThemedColor(i14);
                zh1 zh1Var = gh0Var.f31900c;
                float f10 = 1.0f;
                if (zh1Var != null) {
                    f7 = zh1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = gh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                if (gh0Var.N != 0) {
                    canvas.drawRect(getWidth() - gh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                super.dispatchDraw(canvas);
                gh0Var.d0();
                fh.c cVar = gh0Var.S;
                int themedColor3 = gh0Var.getThemedColor(i13);
                int themedColor4 = gh0Var.getThemedColor(i14);
                zh1 zh1Var2 = gh0Var.f31900c;
                if (zh1Var2 != null) {
                    f10 = zh1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = gh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 21:
                k51 k51Var = (k51) this.f34728b;
                if (k51Var.f35005s > 0.0f && k51Var.f35003n != null) {
                    k51Var.f35004r.reset();
                    float width = getWidth() / k51Var.f35002f.getWidth();
                    k51Var.f35004r.postScale(width, width);
                    k51Var.h.setLocalMatrix(k51Var.f35004r);
                    k51Var.f35003n.setAlpha((int) (k51Var.f35005s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k51Var.f35003n);
                }
                if (k51Var.W && (t1Var = k51Var.O) != null) {
                    t1Var.setVisibility(4);
                    k51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 22:
                x51 x51Var = (x51) this.f34728b;
                ImageReceiver imageReceiver2 = x51Var.f33312b;
                Rect rect = x51Var.e;
                i71 i71Var = x51Var.P;
                r61 r61Var = x51Var.f33311a;
                if (x51Var.f33315n != null && x51Var.f33316r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    x51Var.f33316r.setAlpha((int) (x51Var.I * 255.0f));
                    canvas.drawBitmap(x51Var.f33315n, 0.0f, 0.0f, x51Var.f33316r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (r61Var != null) {
                    Drawable drawable = r61Var.E;
                    if (drawable != null) {
                        if (x51Var.f33319x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(x51Var.I, i71Var.f34470m1, i71Var.f34458f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(i71Var.f34468k1);
                        }
                        drawable.setAlpha((int) ((1.0f - x51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = r61Var.N;
                        if (f11 == 0.0f && r61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(r61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - x51Var.I) * (1.0f - r61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((r61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (x51Var.I * AndroidUtilities.dp(45.0f)) + x51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = r61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - x51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (i71Var.f34444a0.getX() + i71Var.f34474o0.getX() + x51Var.f33320y), i71Var.f34444a0.getY() + ((int) i71Var.f34474o0.getY()) + x51Var.E);
                        i71Var.f34474o0.draw(canvas);
                        canvas.restore();
                    } else if (r61Var.f37099s && (imageReceiver = r61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - x51Var.I);
                        r61Var.h.setImageCoords(rect);
                        r61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(x51Var.I);
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
        switch (this.f34727a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ut utVar = (ut) this.f34728b;
                    if (!utVar.f38210n && !utVar.K) {
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
        switch (this.f34727a) {
            case 21:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((k51) this.f34728b).dismiss();
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
        switch (this.f34727a) {
            case 13:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((ai0) this.f34728b).f31889q0, 500L);
                return;
            case 22:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((x51) this.f34728b).f33312b;
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
        switch (this.f34727a) {
            case 22:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34727a) {
            case 13:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((ai0) this.f34728b).f31889q0);
                return;
            case 22:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((x51) this.f34728b).f33312b;
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
        switch (this.f34727a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f34728b).f22172f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 15:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((lq0) this.f34728b).f35601b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((cr0) this.f34728b).f32873b.size(), new Object[0]));
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
        switch (this.f34727a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 18:
                if (!((PopupNotificationActivity) this.f34728b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vv0[] vv0VarArr;
        int i14;
        Activity activity;
        switch (this.f34727a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f34728b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.p.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f32669c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.wl.y(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f32669c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.C(8.0f, y3, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                g70 g70Var = (g70) this.f34728b;
                g70Var.g0();
                g70Var.h0();
                org.telegram.ui.Components.b20 b20Var = g70Var.f33875f;
                le.e eVar = g70Var.f33869b;
                b20Var.setTranslationY(eVar.e);
                g70Var.i0();
                g70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                y70 y70Var = (y70) this.f34728b;
                TextView textView = y70Var.f39801b;
                if (textView != null) {
                    int measuredWidth = ((y70Var.f39801b.getMeasuredWidth() / 2) + textView.getLeft()) - (y70Var.f39802c.getMeasuredWidth() / 2);
                    int top = (y70Var.e.getTop() + ((y70Var.f39801b.getMeasuredHeight() - y70Var.f39802c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = y70Var.f39802c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, y70Var.f39802c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                n80 n80Var = (n80) this.f34728b;
                n80Var.Z();
                n80Var.b0();
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                yg0 yg0Var = (yg0) this.f34728b;
                for (org.telegram.ui.Components.vv0 vv0Var : yg0Var.f39885b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!vv0Var.a() && yg0Var.f39887c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                gh0 gh0Var = (gh0) this.f34728b;
                gh0Var.i0();
                gh0Var.h0();
                return;
            case 20:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34728b;
                WindowInsets windowInsets = secretMediaViewer.f31465g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.n6 n6Var = secretMediaViewer.e;
                n6Var.layout(i14, 0, n6Var.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f31504y0 = 1.0f;
                        secretMediaViewer.f31499w0 = 0.0f;
                        secretMediaViewer.f31502x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f31504y0);
                    return;
                }
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((k51) this.f34728b).d();
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                x51 x51Var = (x51) this.f34728b;
                Context context = x51Var.getContext();
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
                    Bitmap bitmap = x51Var.f33315n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || x51Var.f33315n.getHeight() != decorView.getMeasuredHeight()) {
                        x51Var.f();
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
        org.telegram.ui.Components.vv0[] vv0VarArr;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f34727a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 6:
                g70 g70Var = (g70) this.f34728b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    g70Var.f33872c0 = AndroidUtilities.dp(56.0f);
                } else {
                    g70Var.f33872c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(g70.c0(g70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) g70Var.f33890s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + g70.d0(g70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) g70Var.e.getLayoutParams()).topMargin = g70.V(g70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) g70Var.f33875f.getLayoutParams()).topMargin = g70.W(g70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) g70Var.h.getLayoutParams()).topMargin = g70.X(g70Var).getMeasuredHeight();
                g70Var.h.getLayoutParams().height = g70Var.f33872c0;
                ((ViewGroup.MarginLayoutParams) g70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + g70.Y(g70Var).getMeasuredHeight() + g70Var.f33872c0;
                g70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 8:
                n80 n80Var = (n80) this.f34728b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    n80Var.f35975x = AndroidUtilities.dp(56.0f);
                } else {
                    n80Var.f35975x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(n80.W(n80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) n80Var.f35972r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + n80.X(n80Var).getMeasuredHeight();
                n80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + n80Var.f35975x;
                n80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 10:
                super.onMeasure(i10, i11);
                hd0 hd0Var = ((kd0) this.f34728b).f35244x;
                if (hd0Var != null) {
                    hd0Var.a();
                    return;
                }
                return;
            case 11:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                yg0 yg0Var = (yg0) this.f34728b;
                for (org.telegram.ui.Components.vv0 vv0Var : yg0Var.f39885b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!vv0Var.a() && yg0Var.f39887c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 14:
                cq0 cq0Var = (cq0) this.f34728b;
                FrameLayout frameLayout = cq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) cq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 19:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f34728b);
                return;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34728b;
                WindowInsets windowInsets = secretMediaViewer.f31465g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f31465g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 22:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 23:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                xd1 xd1Var = (xd1) this.f34728b;
                kVar = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                int measuredHeight2 = kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.o2) xd1Var).actionBar;
                if (kVar3.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) xd1Var.f39569n0.getLayoutParams()).topMargin = measuredHeight2;
                xd1Var.f39569n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(xd1Var.f39573p0, i10, 0, i11, 0);
                return;
            case 25:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((ih1) this.f34728b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34727a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                ut utVar = (ut) this.f34728b;
                gh.d.c(utVar.f38215s, utVar.f38220y);
                utVar.f38216t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34727a) {
            case 18:
                if (!((PopupNotificationActivity) this.f34728b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f34727a) {
            case 18:
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
        switch (this.f34727a) {
            case 19:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f34728b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f34727a) {
            case 4:
                super.setTranslationY(f7);
                ((wb) this.f34728b).X.invalidate();
                return;
            case 17:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.T8;
                ((PhotoViewer) this.f34728b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34727a) {
            case 3:
                m6 m6Var = (m6) this.f34728b;
                if (drawable != m6Var.f35692c && drawable != m6Var.f35691b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f34727a = i10;
        this.f34728b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
