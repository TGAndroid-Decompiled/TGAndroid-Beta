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
    public final int f36296a;
    public Object f36297b;

    public n0(Context context) {
        super(context);
        this.f36296a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f36296a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.k81 k81Var;
        int[] iArr;
        float f10;
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f36296a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                q6 q6Var = (q6) this.f36297b;
                int d = ((measuredWidth - ((int) q6Var.f37315c.d())) + ((int) q6Var.f37314b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                q6Var.f37314b.setBounds(0, 0, d, getHeight());
                q6Var.f37314b.draw(canvas);
                q6Var.f37315c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                q6Var.f37315c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                zu zuVar = (zu) this.f36297b;
                if (zuVar.getParentLayout() != null && (k81Var = zuVar.f40877b) != null) {
                    float measuredHeight = k81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.j6.f20000k0);
                    return;
                }
                return;
            case 7:
                a70 a70Var = (a70) this.f36297b;
                ng.e eVar = a70Var.m0;
                sg.d dVar = a70Var.f32500n0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    a70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f44379n && dVar.f(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, a70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6), a70Var.f32496j0);
                return;
            case 9:
                e80 e80Var = (e80) this.f36297b;
                ng.e eVar2 = e80Var.I;
                sg.d dVar2 = e80Var.J;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    e80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f44379n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f36297b;
                View view = launchActivity.D0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f31627u1 == null) {
                        launchActivity.f31627u1 = new int[2];
                    }
                    launchActivity.D0.getLocationInWindow(launchActivity.f31627u1);
                    int[] iArr2 = launchActivity.f31627u1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f31627u1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.D0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                xg0 xg0Var = (xg0) this.f36297b;
                xg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.j6.f19827a7;
                int themedColor = xg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.j6.f19881d6;
                int themedColor2 = xg0Var.getThemedColor(i14);
                oh1 oh1Var = xg0Var.f37165c;
                float f11 = 1.0f;
                if (oh1Var != null) {
                    f10 = oh1Var.r(0);
                } else {
                    f10 = 1.0f;
                }
                int d10 = i0.a.d(f10, themedColor, themedColor2);
                int i15 = xg0Var.J;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                if (xg0Var.K != 0) {
                    canvas.drawRect(getWidth() - xg0Var.K, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                super.dispatchDraw(canvas);
                xg0Var.d0();
                sg.c cVar = xg0Var.P;
                int themedColor3 = xg0Var.getThemedColor(i13);
                int themedColor4 = xg0Var.getThemedColor(i14);
                oh1 oh1Var2 = xg0Var.f37165c;
                if (oh1Var2 != null) {
                    f11 = oh1Var2.r(0);
                }
                cVar.a(i0.a.d(f11, themedColor3, themedColor4));
                View view2 = xg0Var.E;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                w41 w41Var = (w41) this.f36297b;
                if (w41Var.f39271s > 0.0f && w41Var.f39269n != null) {
                    w41Var.f39270r.reset();
                    float width = getWidth() / w41Var.f39268f.getWidth();
                    w41Var.f39270r.postScale(width, width);
                    w41Var.h.setLocalMatrix(w41Var.f39270r);
                    w41Var.f39269n.setAlpha((int) (w41Var.f39271s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), w41Var.f39269n);
                }
                if (w41Var.T && (s1Var = w41Var.L) != null) {
                    s1Var.setVisibility(4);
                    w41Var.T = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                l51 l51Var = (l51) this.f36297b;
                ImageReceiver imageReceiver2 = l51Var.f38393b;
                Rect rect = l51Var.e;
                x61 x61Var = l51Var.M;
                f61 f61Var = l51Var.f38392a;
                if (l51Var.f38396n != null && l51Var.f38397r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    l51Var.f38397r.setAlpha((int) (l51Var.F * 255.0f));
                    canvas.drawBitmap(l51Var.f38396n, 0.0f, 0.0f, l51Var.f38397r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (f61Var != null) {
                    Drawable drawable = f61Var.B;
                    if (drawable != null) {
                        if (l51Var.f38400x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(l51Var.F, x61Var.f39874j1, x61Var.f39859c1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(x61Var.f39870h1);
                        }
                        drawable.setAlpha((int) ((1.0f - l51Var.F) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = f61Var.K;
                        if (f12 == 0.0f && f61Var.P <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(f61Var.P * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - l51Var.F) * (1.0f - f61Var.L));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((f61Var.M * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (l51Var.F * AndroidUtilities.dp(45.0f)) + l51Var.C);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = f61Var.M;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - l51Var.F) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (x61Var.U.getX() + x61Var.f39877l0.getX() + l51Var.f38401y), x61Var.U.getY() + ((int) x61Var.f39877l0.getY()) + l51Var.B);
                        x61Var.f39877l0.draw(canvas);
                        canvas.restore();
                    } else if (f61Var.f33969s && (imageReceiver = f61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - l51Var.F);
                        f61Var.h.setImageCoords(rect);
                        f61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(l51Var.F);
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
        switch (this.f36296a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    rt rtVar = (rt) this.f36297b;
                    if (!rtVar.f38042n && !rtVar.K) {
                        rtVar.n();
                        return true;
                    }
                    rtVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f36296a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((w41) this.f36297b).dismiss();
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
        switch (this.f36296a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((rh0) this.f36297b).f37859n0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((l51) this.f36297b).f38393b;
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
        switch (this.f36296a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f36296a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((rh0) this.f36297b).f37859n0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((l51) this.f36297b).f38393b;
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
        switch (this.f36296a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f36297b).f23122f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((wp0) this.f36297b).f39748b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((mq0) this.f36297b).f36163b.size(), new Object[0]));
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
        switch (this.f36296a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f36297b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.vv0[] vv0VarArr;
        int i14;
        Activity activity;
        switch (this.f36296a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                g5 g5Var = (g5) this.f36297b;
                g5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = k7.n.b((paddingTop - g5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                g5Var.f34319c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int x10 = b.x(48.0f, (paddingTop - b10) - g5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) g5Var.f34319c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + x10;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.C(8.0f, x10, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z4, i10, i11, i12, i13);
                a70 a70Var = (a70) this.f36297b;
                a70Var.g0();
                a70Var.h0();
                org.telegram.ui.Components.d20 d20Var = a70Var.f32491f;
                xd.c cVar = a70Var.f32485b;
                d20Var.setTranslationY(cVar.e);
                a70Var.i0();
                a70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.e);
                return;
            case 8:
                super.onLayout(z4, i10, i11, i12, i13);
                q70 q70Var = (q70) this.f36297b;
                TextView textView = q70Var.f37323b;
                if (textView != null) {
                    int measuredWidth = ((q70Var.f37323b.getMeasuredWidth() / 2) + textView.getLeft()) - (q70Var.f37324c.getMeasuredWidth() / 2);
                    int top = (q70Var.e.getTop() + ((q70Var.f37323b.getMeasuredHeight() - q70Var.f37324c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = q70Var.f37324c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, q70Var.f37324c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                e80 e80Var = (e80) this.f36297b;
                e80Var.Z();
                e80Var.b0();
                return;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                pg0 pg0Var = (pg0) this.f36297b;
                for (org.telegram.ui.Components.vv0 vv0Var : pg0Var.f37128b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!vv0Var.a() && pg0Var.f37130c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z4, i10, i11, i12, i13);
                xg0 xg0Var = (xg0) this.f36297b;
                xg0Var.i0();
                xg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36297b;
                WindowInsets windowInsets = secretMediaViewer.f32207d0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.e eVar = secretMediaViewer.e;
                eVar.layout(i14, 0, eVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z4) {
                    if (secretMediaViewer.H0 == null) {
                        secretMediaViewer.f32244v0 = 1.0f;
                        secretMediaViewer.f32241t0 = 0.0f;
                        secretMediaViewer.f32243u0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f32244v0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((w41) this.f36297b).d();
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                l51 l51Var = (l51) this.f36297b;
                Context context = l51Var.getContext();
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
                    Bitmap bitmap = l51Var.f38396n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || l51Var.f38396n.getHeight() != decorView.getMeasuredHeight()) {
                        l51Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.vv0[] vv0VarArr;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f36296a) {
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
                a70 a70Var = (a70) this.f36297b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    a70Var.Z = AndroidUtilities.dp(56.0f);
                } else {
                    a70Var.Z = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(a70.c0(a70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) a70Var.f32506s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + a70.d0(a70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) a70Var.e.getLayoutParams()).topMargin = a70.V(a70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) a70Var.f32491f.getLayoutParams()).topMargin = a70.W(a70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) a70Var.h.getLayoutParams()).topMargin = a70.X(a70Var).getMeasuredHeight();
                a70Var.h.getLayoutParams().height = a70Var.Z;
                ((ViewGroup.MarginLayoutParams) a70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + a70.Y(a70Var).getMeasuredHeight() + a70Var.Z;
                a70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                e80 e80Var = (e80) this.f36297b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    e80Var.f33741x = AndroidUtilities.dp(56.0f);
                } else {
                    e80Var.f33741x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(e80.W(e80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) e80Var.f33738r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + e80.X(e80Var).getMeasuredHeight();
                e80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + e80Var.f33741x;
                e80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                zc0 zc0Var = ((cd0) this.f36297b).f33113x;
                if (zc0Var != null) {
                    zc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                pg0 pg0Var = (pg0) this.f36297b;
                for (org.telegram.ui.Components.vv0 vv0Var : pg0Var.f37128b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!vv0Var.a() && pg0Var.f37130c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                np0 np0Var = (np0) this.f36297b;
                FrameLayout frameLayout = np0Var.I;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) np0Var.I.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f36297b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f36297b;
                WindowInsets windowInsets = secretMediaViewer.f32207d0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f32207d0;
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
                jd1 jd1Var = (jd1) this.f36297b;
                kVar = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                int measuredHeight2 = kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.p2) jd1Var).actionBar;
                if (kVar3.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) jd1Var.f35209k0.getLayoutParams()).topMargin = measuredHeight2;
                jd1Var.f35209k0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(jd1Var.m0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((wg1) this.f36297b).I.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f36296a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                rt rtVar = (rt) this.f36297b;
                tg.c.c(rtVar.f38047s, rtVar.f38052y);
                rtVar.f38048t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f36296a) {
            case 19:
                if (!((PopupNotificationActivity) this.f36297b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        switch (this.f36296a) {
            case 19:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z4);
                return;
            default:
                super.requestDisallowInterceptTouchEvent(z4);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f36296a) {
            case 20:
                super.setScaleX(f10);
                ProfileActivity.V0((ProfileActivity) this.f36297b);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f36296a) {
            case 4:
                super.setTranslationY(f10);
                ((ub) this.f36297b).Y.invalidate();
                return;
            case 18:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((PhotoViewer) this.f36297b).F1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f36296a) {
            case 3:
                q6 q6Var = (q6) this.f36297b;
                if (drawable != q6Var.f37315c && drawable != q6Var.f37314b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n0(Object obj, Context context, int i10) {
        super(context);
        this.f36296a = i10;
        this.f36297b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
