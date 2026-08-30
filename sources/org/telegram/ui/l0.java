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
    public final int f35858a;
    public Object f35859b;

    public l0(Context context) {
        super(context);
        this.f35858a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f35858a) {
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
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f35858a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f35859b;
                int d = ((measuredWidth - ((int) o6Var.f36798c.d())) + ((int) o6Var.f36797b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f36797b.setBounds(0, 0, d, getHeight());
                o6Var.f36797b.draw(canvas);
                o6Var.f36798c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                o6Var.f36798c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                xu xuVar = (xu) this.f35859b;
                if (xuVar.getParentLayout() != null && (k81Var = xuVar.f40310b) != null) {
                    float measuredHeight = k81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.j6.f20025k0);
                    return;
                }
                return;
            case 7:
                y60 y60Var = (y60) this.f35859b;
                ng.e eVar = y60Var.m0;
                sg.d dVar = y60Var.f40428n0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    y60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f44314n && dVar.e(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, y60Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6), y60Var.f40424j0);
                return;
            case 9:
                c80 c80Var = (c80) this.f35859b;
                ng.e eVar2 = c80Var.I;
                sg.d dVar2 = c80Var.J;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    c80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f44314n && dVar2.e(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f35859b;
                View view = launchActivity.D0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f31653u1 == null) {
                        launchActivity.f31653u1 = new int[2];
                    }
                    launchActivity.D0.getLocationInWindow(launchActivity.f31653u1);
                    int[] iArr2 = launchActivity.f31653u1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f31653u1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.D0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                vg0 vg0Var = (vg0) this.f35859b;
                vg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.j6.f19852a7;
                int themedColor = vg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.j6.f19906d6;
                int themedColor2 = vg0Var.getThemedColor(i14);
                gh1 gh1Var = vg0Var.f34875c;
                float f11 = 1.0f;
                if (gh1Var != null) {
                    f10 = gh1Var.r(0);
                } else {
                    f10 = 1.0f;
                }
                int d10 = i0.a.d(f10, themedColor, themedColor2);
                int i15 = vg0Var.J;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                if (vg0Var.K != 0) {
                    canvas.drawRect(getWidth() - vg0Var.K, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                super.dispatchDraw(canvas);
                vg0Var.d0();
                sg.c cVar = vg0Var.P;
                int themedColor3 = vg0Var.getThemedColor(i13);
                int themedColor4 = vg0Var.getThemedColor(i14);
                gh1 gh1Var2 = vg0Var.f34875c;
                if (gh1Var2 != null) {
                    f11 = gh1Var2.r(0);
                }
                cVar.a(i0.a.d(f11, themedColor3, themedColor4));
                View view2 = vg0Var.E;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                p41 p41Var = (p41) this.f35859b;
                if (p41Var.f37179s > 0.0f && p41Var.f37177n != null) {
                    p41Var.f37178r.reset();
                    float width = getWidth() / p41Var.f37176f.getWidth();
                    p41Var.f37178r.postScale(width, width);
                    p41Var.h.setLocalMatrix(p41Var.f37178r);
                    p41Var.f37177n.setAlpha((int) (p41Var.f37179s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), p41Var.f37177n);
                }
                if (p41Var.T && (t1Var = p41Var.L) != null) {
                    t1Var.setVisibility(4);
                    p41Var.T = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                e51 e51Var = (e51) this.f35859b;
                ImageReceiver imageReceiver2 = e51Var.f36203b;
                Rect rect = e51Var.e;
                q61 q61Var = e51Var.M;
                y51 y51Var = e51Var.f36202a;
                if (e51Var.f36206n != null && e51Var.f36207r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    e51Var.f36207r.setAlpha((int) (e51Var.F * 255.0f));
                    canvas.drawBitmap(e51Var.f36206n, 0.0f, 0.0f, e51Var.f36207r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (y51Var != null) {
                    Drawable drawable = y51Var.B;
                    if (drawable != null) {
                        if (e51Var.f36210x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(e51Var.F, q61Var.f37617j1, q61Var.f37602c1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(q61Var.f37613h1);
                        }
                        drawable.setAlpha((int) ((1.0f - e51Var.F) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = y51Var.K;
                        if (f12 == 0.0f && y51Var.P <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(y51Var.P * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - e51Var.F) * (1.0f - y51Var.L));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((y51Var.M * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (e51Var.F * AndroidUtilities.dp(45.0f)) + e51Var.C);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = y51Var.M;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - e51Var.F) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (q61Var.U.getX() + q61Var.f37620l0.getX() + e51Var.f36211y), q61Var.U.getY() + ((int) q61Var.f37620l0.getY()) + e51Var.B);
                        q61Var.f37620l0.draw(canvas);
                        canvas.restore();
                    } else if (y51Var.f40405s && (imageReceiver = y51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - e51Var.F);
                        y51Var.h.setImageCoords(rect);
                        y51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(e51Var.F);
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
        switch (this.f35858a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    pt ptVar = (pt) this.f35859b;
                    if (!ptVar.f37526n && !ptVar.K) {
                        ptVar.n();
                        return true;
                    }
                    ptVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f35858a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((p41) this.f35859b).dismiss();
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
        switch (this.f35858a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((ph0) this.f35859b).f37334n0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((e51) this.f35859b).f36203b;
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
        switch (this.f35858a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f35858a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((ph0) this.f35859b).f37334n0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((e51) this.f35859b).f36203b;
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
        switch (this.f35858a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f35859b).f23149f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((pp0) this.f35859b).f37428b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((fq0) this.f35859b).f34315b.size(), new Object[0]));
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
        switch (this.f35858a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f35859b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
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
        switch (this.f35858a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                e5 e5Var = (e5) this.f35859b;
                e5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = k7.n.b((paddingTop - e5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                e5Var.f33890c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int x10 = b.x(48.0f, (paddingTop - b10) - e5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) e5Var.f33890c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + x10;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.C(8.0f, x10, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z4, i10, i11, i12, i13);
                y60 y60Var = (y60) this.f35859b;
                y60Var.g0();
                y60Var.h0();
                org.telegram.ui.Components.c20 c20Var = y60Var.f40419f;
                xd.c cVar = y60Var.f40413b;
                c20Var.setTranslationY(cVar.e);
                y60Var.i0();
                y60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.e);
                return;
            case 8:
                super.onLayout(z4, i10, i11, i12, i13);
                o70 o70Var = (o70) this.f35859b;
                TextView textView = o70Var.f36803b;
                if (textView != null) {
                    int measuredWidth = ((o70Var.f36803b.getMeasuredWidth() / 2) + textView.getLeft()) - (o70Var.f36804c.getMeasuredWidth() / 2);
                    int top = (o70Var.e.getTop() + ((o70Var.f36803b.getMeasuredHeight() - o70Var.f36804c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = o70Var.f36804c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, o70Var.f36804c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                c80 c80Var = (c80) this.f35859b;
                c80Var.Z();
                c80Var.b0();
                return;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                ng0 ng0Var = (ng0) this.f35859b;
                for (org.telegram.ui.Components.vv0 vv0Var : ng0Var.f36624b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!vv0Var.a() && ng0Var.f36626c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z4, i10, i11, i12, i13);
                vg0 vg0Var = (vg0) this.f35859b;
                vg0Var.i0();
                vg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35859b;
                WindowInsets windowInsets = secretMediaViewer.f32233d0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.d dVar = secretMediaViewer.e;
                dVar.layout(i14, 0, dVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z4) {
                    if (secretMediaViewer.H0 == null) {
                        secretMediaViewer.f32270v0 = 1.0f;
                        secretMediaViewer.f32267t0 = 0.0f;
                        secretMediaViewer.f32269u0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f32270v0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((p41) this.f35859b).d();
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                e51 e51Var = (e51) this.f35859b;
                Context context = e51Var.getContext();
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
                    Bitmap bitmap = e51Var.f36206n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || e51Var.f36206n.getHeight() != decorView.getMeasuredHeight()) {
                        e51Var.f();
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
        switch (this.f35858a) {
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
                y60 y60Var = (y60) this.f35859b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    y60Var.Z = AndroidUtilities.dp(56.0f);
                } else {
                    y60Var.Z = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(y60.c0(y60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) y60Var.f40434s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + y60.d0(y60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) y60Var.e.getLayoutParams()).topMargin = y60.V(y60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) y60Var.f40419f.getLayoutParams()).topMargin = y60.W(y60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) y60Var.h.getLayoutParams()).topMargin = y60.X(y60Var).getMeasuredHeight();
                y60Var.h.getLayoutParams().height = y60Var.Z;
                ((ViewGroup.MarginLayoutParams) y60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + y60.Y(y60Var).getMeasuredHeight() + y60Var.Z;
                y60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                c80 c80Var = (c80) this.f35859b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    c80Var.f33224x = AndroidUtilities.dp(56.0f);
                } else {
                    c80Var.f33224x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(c80.W(c80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) c80Var.f33221r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + c80.X(c80Var).getMeasuredHeight();
                c80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + c80Var.f33224x;
                c80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                xc0 xc0Var = ((ad0) this.f35859b).f32551x;
                if (xc0Var != null) {
                    xc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ng0 ng0Var = (ng0) this.f35859b;
                for (org.telegram.ui.Components.vv0 vv0Var : ng0Var.f36624b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!vv0Var.a() && ng0Var.f36626c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    vv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                gp0 gp0Var = (gp0) this.f35859b;
                FrameLayout frameLayout = gp0Var.D;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) gp0Var.D.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f35859b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35859b;
                WindowInsets windowInsets = secretMediaViewer.f32233d0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f32233d0;
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
                cd1 cd1Var = (cd1) this.f35859b;
                measureChildWithMargins(cd1.t0(cd1Var), i10, 0, i11, 0);
                int measuredHeight2 = cd1.v0(cd1Var).getMeasuredHeight();
                if (cd1.w0(cd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) cd1Var.f33317k0.getLayoutParams()).topMargin = measuredHeight2;
                cd1Var.f33317k0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(cd1Var.m0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((og1) this.f35859b).I.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f35858a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                pt ptVar = (pt) this.f35859b;
                tg.c.c(ptVar.f37531s, ptVar.f37536y);
                ptVar.f37532t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35858a) {
            case 19:
                if (!((PopupNotificationActivity) this.f35859b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        switch (this.f35858a) {
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
        switch (this.f35858a) {
            case 20:
                super.setScaleX(f10);
                ProfileActivity.V0((ProfileActivity) this.f35859b);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f35858a) {
            case 4:
                super.setTranslationY(f10);
                ((sb) this.f35859b).Y.invalidate();
                return;
            case 18:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((PhotoViewer) this.f35859b).F1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f35858a) {
            case 3:
                o6 o6Var = (o6) this.f35859b;
                if (drawable != o6Var.f36798c && drawable != o6Var.f36797b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f35858a = i10;
        this.f35859b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
