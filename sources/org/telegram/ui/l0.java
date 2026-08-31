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
    public final int f38539a;
    public Object f38540b;

    public l0(Context context) {
        super(context);
        this.f38539a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f38539a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.l81 l81Var;
        int[] iArr;
        float f10;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f38539a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f38540b;
                int d = ((measuredWidth - ((int) o6Var.f39603c.d())) + ((int) o6Var.f39602b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f39602b.setBounds(0, 0, d, getHeight());
                o6Var.f39602b.draw(canvas);
                o6Var.f39603c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                o6Var.f39603c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                yu yuVar = (yu) this.f38540b;
                if (yuVar.getParentLayout() != null && (l81Var = yuVar.f43711b) != null) {
                    float measuredHeight = l81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.k6.f21779k0);
                    return;
                }
                return;
            case 7:
                z60 z60Var = (z60) this.f38540b;
                og.e eVar = z60Var.m0;
                tg.d dVar = z60Var.f43842n0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    z60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f48092n && dVar.f(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, z60Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21659d6), z60Var.f43838j0);
                return;
            case 9:
                d80 d80Var = (d80) this.f38540b;
                og.e eVar2 = d80Var.I;
                tg.d dVar2 = d80Var.J;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    d80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f48092n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f38540b;
                View view = launchActivity.D0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f34175u1 == null) {
                        launchActivity.f34175u1 = new int[2];
                    }
                    launchActivity.D0.getLocationInWindow(launchActivity.f34175u1);
                    int[] iArr2 = launchActivity.f34175u1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f34175u1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.D0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                wg0 wg0Var = (wg0) this.f38540b;
                wg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.k6.f21605a7;
                int themedColor = wg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.k6.f21659d6;
                int themedColor2 = wg0Var.getThemedColor(i14);
                ih1 ih1Var = wg0Var.f38158c;
                float f11 = 1.0f;
                if (ih1Var != null) {
                    f10 = ih1Var.r(0);
                } else {
                    f10 = 1.0f;
                }
                int d10 = i0.a.d(f10, themedColor, themedColor2);
                int i15 = wg0Var.J;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.k6.l0(d10));
                }
                if (wg0Var.K != 0) {
                    canvas.drawRect(getWidth() - wg0Var.K, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.k6.l0(d10));
                }
                super.dispatchDraw(canvas);
                wg0Var.d0();
                tg.c cVar = wg0Var.P;
                int themedColor3 = wg0Var.getThemedColor(i13);
                int themedColor4 = wg0Var.getThemedColor(i14);
                ih1 ih1Var2 = wg0Var.f38158c;
                if (ih1Var2 != null) {
                    f11 = ih1Var2.r(0);
                }
                cVar.a(i0.a.d(f11, themedColor3, themedColor4));
                View view2 = wg0Var.E;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                r41 r41Var = (r41) this.f38540b;
                if (r41Var.f40774s > 0.0f && r41Var.f40772n != null) {
                    r41Var.f40773r.reset();
                    float width = getWidth() / r41Var.f40771f.getWidth();
                    r41Var.f40773r.postScale(width, width);
                    r41Var.h.setLocalMatrix(r41Var.f40773r);
                    r41Var.f40772n.setAlpha((int) (r41Var.f40774s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), r41Var.f40772n);
                }
                if (r41Var.T && (t1Var = r41Var.L) != null) {
                    t1Var.setVisibility(4);
                    r41Var.T = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                g51 g51Var = (g51) this.f38540b;
                ImageReceiver imageReceiver2 = g51Var.f39319b;
                Rect rect = g51Var.f39321e;
                r61 r61Var = g51Var.M;
                a61 a61Var = g51Var.f39318a;
                if (g51Var.f39323n != null && g51Var.f39324r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    g51Var.f39324r.setAlpha((int) (g51Var.F * 255.0f));
                    canvas.drawBitmap(g51Var.f39323n, 0.0f, 0.0f, g51Var.f39324r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (a61Var != null) {
                    Drawable drawable = a61Var.B;
                    if (drawable != null) {
                        if (g51Var.f39327x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(g51Var.F, r61Var.f40803j1, r61Var.f40787c1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(r61Var.f40799h1);
                        }
                        drawable.setAlpha((int) ((1.0f - g51Var.F) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = a61Var.K;
                        if (f12 == 0.0f && a61Var.P <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(a61Var.P * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - g51Var.F) * (1.0f - a61Var.L));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((a61Var.M * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (g51Var.F * AndroidUtilities.dp(45.0f)) + g51Var.C);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = a61Var.M;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - g51Var.F) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (r61Var.U.getX() + r61Var.f40806l0.getX() + g51Var.f39328y), r61Var.U.getY() + ((int) r61Var.f40806l0.getY()) + g51Var.B);
                        r61Var.f40806l0.draw(canvas);
                        canvas.restore();
                    } else if (a61Var.f35044s && (imageReceiver = a61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - g51Var.F);
                        a61Var.h.setImageCoords(rect);
                        a61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(g51Var.F);
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
        switch (this.f38539a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    qt qtVar = (qt) this.f38540b;
                    if (!qtVar.f40685n && !qtVar.K) {
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
        switch (this.f38539a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((r41) this.f38540b).dismiss();
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
        switch (this.f38539a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((qh0) this.f38540b).f40518n0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((g51) this.f38540b).f39319b;
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
        switch (this.f38539a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f38539a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((qh0) this.f38540b).f40518n0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((g51) this.f38540b).f39319b;
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
        switch (this.f38539a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f38540b).f25006f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((rp0) this.f38540b).f41025b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((hq0) this.f38540b).f37573b.size(), new Object[0]));
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
        switch (this.f38539a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f38540b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.wv0[] wv0VarArr;
        int i14;
        Activity activity;
        switch (this.f38539a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                e5 e5Var = (e5) this.f38540b;
                e5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = k7.o.b((paddingTop - e5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                e5Var.f36398c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int x10 = b.x(48.0f, (paddingTop - b10) - e5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) e5Var.f36398c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + x10;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.y3.C(8.0f, x10, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z4, i10, i11, i12, i13);
                z60 z60Var = (z60) this.f38540b;
                z60Var.g0();
                z60Var.h0();
                org.telegram.ui.Components.d20 d20Var = z60Var.f43833f;
                xd.c cVar = z60Var.f43826b;
                d20Var.setTranslationY(cVar.f50509e);
                z60Var.i0();
                z60Var.f43831e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.f50509e);
                return;
            case 8:
                super.onLayout(z4, i10, i11, i12, i13);
                p70 p70Var = (p70) this.f38540b;
                TextView textView = p70Var.f39934b;
                if (textView != null) {
                    int measuredWidth = ((p70Var.f39934b.getMeasuredWidth() / 2) + textView.getLeft()) - (p70Var.f39935c.getMeasuredWidth() / 2);
                    int top = (p70Var.f39936e.getTop() + ((p70Var.f39934b.getMeasuredHeight() - p70Var.f39935c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = p70Var.f39935c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, p70Var.f39935c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                d80 d80Var = (d80) this.f38540b;
                d80Var.Z();
                d80Var.b0();
                return;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                og0 og0Var = (og0) this.f38540b;
                for (org.telegram.ui.Components.wv0 wv0Var : og0Var.f39752b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!wv0Var.a() && og0Var.f39754c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    wv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z4, i10, i11, i12, i13);
                wg0 wg0Var = (wg0) this.f38540b;
                wg0Var.i0();
                wg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38540b;
                WindowInsets windowInsets = secretMediaViewer.f34768d0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ag.l lVar = secretMediaViewer.f34770e;
                lVar.layout(i14, 0, lVar.getMeasuredWidth() + i14, secretMediaViewer.f34770e.getMeasuredHeight());
                if (z4) {
                    if (secretMediaViewer.H0 == null) {
                        secretMediaViewer.f34806v0 = 1.0f;
                        secretMediaViewer.f34803t0 = 0.0f;
                        secretMediaViewer.f34805u0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34806v0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((r41) this.f38540b).d();
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                g51 g51Var = (g51) this.f38540b;
                Context context = g51Var.getContext();
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
                    Bitmap bitmap = g51Var.f39323n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || g51Var.f39323n.getHeight() != decorView.getMeasuredHeight()) {
                        g51Var.f();
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
        org.telegram.ui.Components.wv0[] wv0VarArr;
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        switch (this.f38539a) {
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
                z60 z60Var = (z60) this.f38540b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    z60Var.Z = AndroidUtilities.dp(56.0f);
                } else {
                    z60Var.Z = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(z60.c0(z60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) z60Var.f43848s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + z60.d0(z60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z60Var.f43831e.getLayoutParams()).topMargin = z60.V(z60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z60Var.f43833f.getLayoutParams()).topMargin = z60.W(z60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z60Var.h.getLayoutParams()).topMargin = z60.X(z60Var).getMeasuredHeight();
                z60Var.h.getLayoutParams().height = z60Var.Z;
                ((ViewGroup.MarginLayoutParams) z60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + z60.Y(z60Var).getMeasuredHeight() + z60Var.Z;
                z60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                d80 d80Var = (d80) this.f38540b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    d80Var.f36141x = AndroidUtilities.dp(56.0f);
                } else {
                    d80Var.f36141x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(d80.W(d80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) d80Var.f36138r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + d80.X(d80Var).getMeasuredHeight();
                d80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + d80Var.f36141x;
                d80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                yc0 yc0Var = ((bd0) this.f38540b).f35483x;
                if (yc0Var != null) {
                    yc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                og0 og0Var = (og0) this.f38540b;
                for (org.telegram.ui.Components.wv0 wv0Var : og0Var.f39752b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!wv0Var.a() && og0Var.f39754c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    wv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                ip0 ip0Var = (ip0) this.f38540b;
                FrameLayout frameLayout = ip0Var.D;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) ip0Var.D.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f38540b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38540b;
                WindowInsets windowInsets = secretMediaViewer.f34768d0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34768d0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f34770e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                ed1 ed1Var = (ed1) this.f38540b;
                kVar = ((org.telegram.ui.ActionBar.p2) ed1Var).actionBar;
                measureChildWithMargins(kVar, i10, 0, i11, 0);
                kVar2 = ((org.telegram.ui.ActionBar.p2) ed1Var).actionBar;
                int measuredHeight2 = kVar2.getMeasuredHeight();
                kVar3 = ((org.telegram.ui.ActionBar.p2) ed1Var).actionBar;
                if (kVar3.getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) ed1Var.f36517k0.getLayoutParams()).topMargin = measuredHeight2;
                ed1Var.f36517k0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(ed1Var.m0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((qg1) this.f38540b).I.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f38539a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                qt qtVar = (qt) this.f38540b;
                ug.c.c(qtVar.f40690s, qtVar.f40695y);
                qtVar.f40691t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38539a) {
            case 19:
                if (!((PopupNotificationActivity) this.f38540b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z4) {
        switch (this.f38539a) {
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
        switch (this.f38539a) {
            case 20:
                super.setScaleX(f10);
                ProfileActivity.V0((ProfileActivity) this.f38540b);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f38539a) {
            case 4:
                super.setTranslationY(f10);
                ((sb) this.f38540b).Y.invalidate();
                return;
            case 18:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.Q8;
                ((PhotoViewer) this.f38540b).F1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f38539a) {
            case 3:
                o6 o6Var = (o6) this.f38540b;
                if (drawable != o6Var.f39603c && drawable != o6Var.f39602b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f38539a = i10;
        this.f38540b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
