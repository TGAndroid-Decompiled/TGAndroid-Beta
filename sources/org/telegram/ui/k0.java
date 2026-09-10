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
    public final int f34180a;
    public Object f34181b;

    public k0(Context context) {
        super(context);
        this.f34180a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f34180a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.u81 u81Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f34180a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                l6 l6Var = (l6) this.f34181b;
                int d = ((measuredWidth - ((int) l6Var.f34545c.d())) + ((int) l6Var.f34544b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                l6Var.f34544b.setBounds(0, 0, d, getHeight());
                l6Var.f34544b.draw(canvas);
                l6Var.f34545c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                l6Var.f34545c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                bv bvVar = (bv) this.f34181b;
                if (bvVar.getParentLayout() != null && (u81Var = bvVar.f31413b) != null) {
                    float measuredHeight = u81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.j6.f18049k0);
                    return;
                }
                return;
            case 7:
                e70 e70Var = (e70) this.f34181b;
                zg.e eVar = e70Var.f32096p0;
                eh.d dVar = e70Var.f32097q0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    e70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f7522n && dVar.f(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, e70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6), e70Var.m0);
                return;
            case 9:
                k80 k80Var = (k80) this.f34181b;
                zg.e eVar2 = k80Var.L;
                eh.d dVar2 = k80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    k80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f7522n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f34181b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f29972x1 == null) {
                        launchActivity.f29972x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f29972x1);
                    int[] iArr2 = launchActivity.f29972x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f29972x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                fh0 fh0Var = (fh0) this.f34181b;
                fh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.j6.f17872a7;
                int themedColor = fh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.j6.f17928d6;
                int themedColor2 = fh0Var.getThemedColor(i14);
                fi1 fi1Var = fh0Var.f33117c;
                float f10 = 1.0f;
                if (fi1Var != null) {
                    f7 = fi1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = fh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                if (fh0Var.N != 0) {
                    canvas.drawRect(getWidth() - fh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                super.dispatchDraw(canvas);
                fh0Var.d0();
                eh.c cVar = fh0Var.S;
                int themedColor3 = fh0Var.getThemedColor(i13);
                int themedColor4 = fh0Var.getThemedColor(i14);
                fi1 fi1Var2 = fh0Var.f33117c;
                if (fi1Var2 != null) {
                    f10 = fi1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = fh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                n51 n51Var = (n51) this.f34181b;
                if (n51Var.f35131s > 0.0f && n51Var.f35129n != null) {
                    n51Var.f35130r.reset();
                    float width = getWidth() / n51Var.f35128f.getWidth();
                    n51Var.f35130r.postScale(width, width);
                    n51Var.h.setLocalMatrix(n51Var.f35130r);
                    n51Var.f35129n.setAlpha((int) (n51Var.f35131s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), n51Var.f35129n);
                }
                if (n51Var.W && (t1Var = n51Var.O) != null) {
                    t1Var.setVisibility(4);
                    n51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                a61 a61Var = (a61) this.f34181b;
                ImageReceiver imageReceiver2 = a61Var.f33291b;
                Rect rect = a61Var.e;
                l71 l71Var = a61Var.P;
                u61 u61Var = a61Var.f33290a;
                if (a61Var.f33294n != null && a61Var.f33295r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    a61Var.f33295r.setAlpha((int) (a61Var.I * 255.0f));
                    canvas.drawBitmap(a61Var.f33294n, 0.0f, 0.0f, a61Var.f33295r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (u61Var != null) {
                    Drawable drawable = u61Var.E;
                    if (drawable != null) {
                        if (a61Var.f33298x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(a61Var.I, l71Var.f34579m1, l71Var.f34567f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(l71Var.f34577k1);
                        }
                        drawable.setAlpha((int) ((1.0f - a61Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = u61Var.N;
                        if (f11 == 0.0f && u61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(u61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - a61Var.I) * (1.0f - u61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((u61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (a61Var.I * AndroidUtilities.dp(45.0f)) + a61Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = u61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - a61Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (l71Var.f34553a0.getX() + l71Var.f34583o0.getX() + a61Var.f33299y), l71Var.f34553a0.getY() + ((int) l71Var.f34583o0.getY()) + a61Var.E);
                        l71Var.f34583o0.draw(canvas);
                        canvas.restore();
                    } else if (u61Var.f37133s && (imageReceiver = u61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - a61Var.I);
                        u61Var.h.setImageCoords(rect);
                        u61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(a61Var.I);
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
        switch (this.f34180a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    tt ttVar = (tt) this.f34181b;
                    if (!ttVar.f37028n && !ttVar.K) {
                        ttVar.n();
                        return true;
                    }
                    ttVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f34180a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((n51) this.f34181b).dismiss();
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
        switch (this.f34180a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((zh0) this.f34181b).f39342q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((a61) this.f34181b).f33291b;
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
        switch (this.f34180a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f34180a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((zh0) this.f34181b).f39342q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((a61) this.f34181b).f33291b;
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
        switch (this.f34180a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f34181b).f21247f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((kq0) this.f34181b).f34439b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((br0) this.f34181b).f31365b.size(), new Object[0]));
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
        switch (this.f34180a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f34181b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
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
        switch (this.f34180a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f34181b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.q.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f31533c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.em.y(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f31533c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.a2.C(8.0f, y3, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.f34181b;
                e70Var.g0();
                e70Var.h0();
                org.telegram.ui.Components.k20 k20Var = e70Var.f32085f;
                le.e eVar = e70Var.f32079b;
                k20Var.setTranslationY(eVar.e);
                e70Var.i0();
                e70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                v70 v70Var = (v70) this.f34181b;
                TextView textView = v70Var.f37429b;
                if (textView != null) {
                    int measuredWidth = ((v70Var.f37429b.getMeasuredWidth() / 2) + textView.getLeft()) - (v70Var.f37430c.getMeasuredWidth() / 2);
                    int top = (v70Var.e.getTop() + ((v70Var.f37429b.getMeasuredHeight() - v70Var.f37430c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = v70Var.f37430c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, v70Var.f37430c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                k80 k80Var = (k80) this.f34181b;
                k80Var.Z();
                k80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                xg0 xg0Var = (xg0) this.f34181b;
                for (org.telegram.ui.Components.fw0 fw0Var : xg0Var.f38719b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!fw0Var.a() && xg0Var.f38721c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    fw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                fh0 fh0Var = (fh0) this.f34181b;
                fh0Var.i0();
                fh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34181b;
                WindowInsets windowInsets = secretMediaViewer.f30564g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                bi.n7 n7Var = secretMediaViewer.e;
                n7Var.layout(i14, 0, n7Var.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f30603y0 = 1.0f;
                        secretMediaViewer.f30598w0 = 0.0f;
                        secretMediaViewer.f30601x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f30603y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((n51) this.f34181b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                a61 a61Var = (a61) this.f34181b;
                Context context = a61Var.getContext();
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
                    Bitmap bitmap = a61Var.f33294n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || a61Var.f33294n.getHeight() != decorView.getMeasuredHeight()) {
                        a61Var.f();
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
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        switch (this.f34180a) {
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
                e70 e70Var = (e70) this.f34181b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    e70Var.f32082c0 = AndroidUtilities.dp(56.0f);
                } else {
                    e70Var.f32082c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(e70.c0(e70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) e70Var.f32100s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + e70.d0(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.e.getLayoutParams()).topMargin = e70.V(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.f32085f.getLayoutParams()).topMargin = e70.W(e70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) e70Var.h.getLayoutParams()).topMargin = e70.X(e70Var).getMeasuredHeight();
                e70Var.h.getLayoutParams().height = e70Var.f32082c0;
                ((ViewGroup.MarginLayoutParams) e70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + e70.Y(e70Var).getMeasuredHeight() + e70Var.f32082c0;
                e70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                k80 k80Var = (k80) this.f34181b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    k80Var.f34266x = AndroidUtilities.dp(56.0f);
                } else {
                    k80Var.f34266x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(k80.W(k80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) k80Var.f34263r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + k80.X(k80Var).getMeasuredHeight();
                k80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + k80Var.f34266x;
                k80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                fd0 fd0Var = ((id0) this.f34181b).f33644x;
                if (fd0Var != null) {
                    fd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xg0 xg0Var = (xg0) this.f34181b;
                for (org.telegram.ui.Components.fw0 fw0Var : xg0Var.f38719b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!fw0Var.a() && xg0Var.f38721c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    fw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                bq0 bq0Var = (bq0) this.f34181b;
                FrameLayout frameLayout = bq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) bq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f34181b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f34181b;
                WindowInsets windowInsets = secretMediaViewer.f30564g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f30564g0;
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
                ae1 ae1Var = (ae1) this.f34181b;
                lVar = ((org.telegram.ui.ActionBar.p2) ae1Var).actionBar;
                measureChildWithMargins(lVar, i10, 0, i11, 0);
                lVar2 = ((org.telegram.ui.ActionBar.p2) ae1Var).actionBar;
                int measuredHeight2 = lVar2.getMeasuredHeight();
                lVar3 = ((org.telegram.ui.ActionBar.p2) ae1Var).actionBar;
                if (lVar3.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) ae1Var.f30952n0.getLayoutParams()).topMargin = measuredHeight2;
                ae1Var.f30952n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(ae1Var.f30956p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((mh1) this.f34181b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f34180a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                tt ttVar = (tt) this.f34181b;
                fh.d.c(ttVar.f37033s, ttVar.f37038y);
                ttVar.f37034t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f34180a) {
            case 19:
                if (!((PopupNotificationActivity) this.f34181b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f34180a) {
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
        switch (this.f34180a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f34181b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f34180a) {
            case 4:
                super.setTranslationY(f7);
                ((wb) this.f34181b).f37792b0.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.T8;
                ((PhotoViewer) this.f34181b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f34180a) {
            case 3:
                l6 l6Var = (l6) this.f34181b;
                if (drawable != l6Var.f34545c && drawable != l6Var.f34544b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f34180a = i10;
        this.f34181b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
