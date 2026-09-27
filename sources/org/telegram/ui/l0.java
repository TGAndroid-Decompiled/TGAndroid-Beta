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
    public final int f35209a;
    public Object f35210b;

    public l0(Context context) {
        super(context);
        this.f35209a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f35209a) {
            case 9:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f35209a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                n6 n6Var = (n6) this.f35210b;
                int d = ((measuredWidth - ((int) n6Var.f35828c.d())) + ((int) n6Var.f35827b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                n6Var.f35827b.setBounds(0, 0, d, getHeight());
                n6Var.f35827b.draw(canvas);
                n6Var.f35828c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                n6Var.f35828c.draw(canvas);
                return;
            case 6:
                c70 c70Var = (c70) this.f35210b;
                ah.i iVar = c70Var.f32554p0;
                fh.d dVar = c70Var.f32555q0;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    c70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.f9065s && dVar.g(measuredWidth2, measuredHeight)) {
                        iVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, c70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6), c70Var.m0);
                return;
            case 8:
                j80 j80Var = (j80) this.f35210b;
                ah.i iVar2 = j80Var.L;
                fh.d dVar2 = j80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && iVar2 != null) {
                    j80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9065s && dVar2.g(measuredWidth3, measuredHeight2)) {
                        iVar2.b(dVar2.a(measuredWidth3, measuredHeight2), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f35210b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f31147x1 == null) {
                        launchActivity.f31147x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f31147x1);
                    int[] iArr = launchActivity.f31147x1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.f31147x1;
                    int i12 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i10 - iArr2[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 12:
                bh0 bh0Var = (bh0) this.f35210b;
                bh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.i6.f19001a7;
                int themedColor = bh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.i6.f19057d6;
                int themedColor2 = bh0Var.getThemedColor(i14);
                qh1 qh1Var = bh0Var.f37134c;
                float f10 = 1.0f;
                if (qh1Var != null) {
                    f7 = qh1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = bh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                if (bh0Var.N != 0) {
                    canvas.drawRect(getWidth() - bh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                super.dispatchDraw(canvas);
                bh0Var.d0();
                fh.c cVar = bh0Var.R;
                int themedColor3 = bh0Var.getThemedColor(i13);
                int themedColor4 = bh0Var.getThemedColor(i14);
                qh1 qh1Var2 = bh0Var.f37134c;
                if (qh1Var2 != null) {
                    f10 = qh1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = bh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 21:
                e51 e51Var = (e51) this.f35210b;
                if (e51Var.f33147s > 0.0f && e51Var.f33145n != null) {
                    e51Var.f33146r.reset();
                    float width = getWidth() / e51Var.f33144f.getWidth();
                    e51Var.f33146r.postScale(width, width);
                    e51Var.h.setLocalMatrix(e51Var.f33146r);
                    e51Var.f33145n.setAlpha((int) (e51Var.f33147s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), e51Var.f33145n);
                }
                if (e51Var.W && (u1Var = e51Var.O) != null) {
                    u1Var.setVisibility(4);
                    e51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 22:
                r51 r51Var = (r51) this.f35210b;
                ImageReceiver imageReceiver2 = r51Var.f40141b;
                Rect rect = r51Var.e;
                c71 c71Var = r51Var.P;
                l61 l61Var = r51Var.f40140a;
                if (r51Var.f40144n != null && r51Var.f40145r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    r51Var.f40145r.setAlpha((int) (r51Var.I * 255.0f));
                    canvas.drawBitmap(r51Var.f40144n, 0.0f, 0.0f, r51Var.f40145r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (l61Var != null) {
                    Drawable drawable = l61Var.E;
                    if (drawable != null) {
                        if (r51Var.f40148x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(r51Var.I, c71Var.f32594m1, c71Var.f32582f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(c71Var.f32592k1);
                        }
                        drawable.setAlpha((int) ((1.0f - r51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = l61Var.N;
                        if (f11 == 0.0f && l61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(l61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - r51Var.I) * (1.0f - l61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((l61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (r51Var.I * AndroidUtilities.dp(45.0f)) + r51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = l61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - r51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (c71Var.f32568a0.getX() + c71Var.f32598o0.getX() + r51Var.f40149y), c71Var.f32568a0.getY() + ((int) c71Var.f32598o0.getY()) + r51Var.E);
                        c71Var.f32598o0.draw(canvas);
                        canvas.restore();
                    } else if (l61Var.f35261s && (imageReceiver = l61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - r51Var.I);
                        l61Var.h.setImageCoords(rect);
                        l61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(r51Var.I);
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
        switch (this.f35209a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    qt qtVar = (qt) this.f35210b;
                    if (!qtVar.f36898n && !qtVar.K) {
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
        switch (this.f35209a) {
            case 21:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((e51) this.f35210b).dismiss();
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
        switch (this.f35209a) {
            case 13:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((vh0) this.f35210b).f38602q0, 500L);
                return;
            case 22:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((r51) this.f35210b).f40141b;
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
        switch (this.f35209a) {
            case 22:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f35209a) {
            case 13:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((vh0) this.f35210b).f38602q0);
                return;
            case 22:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((r51) this.f35210b).f40141b;
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
        switch (this.f35209a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f35210b).f22387f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 15:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((fq0) this.f35210b).f33608b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((wq0) this.f35210b).f39413b.size(), new Object[0]));
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
        switch (this.f35209a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 18:
                if (!((PopupNotificationActivity) this.f35210b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.hw0[] hw0VarArr;
        int i14;
        Activity activity;
        switch (this.f35209a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                e5 e5Var = (e5) this.f35210b;
                e5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.q.b((paddingTop - e5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                e5Var.f33125c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int z11 = org.telegram.messenger.qk.z(48.0f, (paddingTop - b10) - e5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) e5Var.f33125c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + z11;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.C(8.0f, z11, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                c70 c70Var = (c70) this.f35210b;
                c70Var.g0();
                c70Var.h0();
                org.telegram.ui.Components.e20 e20Var = c70Var.f32543f;
                le.f fVar = c70Var.f32537b;
                e20Var.setTranslationY(fVar.e);
                c70Var.i0();
                c70Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + fVar.e);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                u70 u70Var = (u70) this.f35210b;
                TextView textView = u70Var.f38139b;
                if (textView != null) {
                    int measuredWidth = ((u70Var.f38139b.getMeasuredWidth() / 2) + textView.getLeft()) - (u70Var.f38140c.getMeasuredWidth() / 2);
                    int top = (u70Var.e.getTop() + ((u70Var.f38139b.getMeasuredHeight() - u70Var.f38140c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = u70Var.f38140c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, u70Var.f38140c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                j80 j80Var = (j80) this.f35210b;
                j80Var.Z();
                j80Var.b0();
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                tg0 tg0Var = (tg0) this.f35210b;
                for (org.telegram.ui.Components.hw0 hw0Var : tg0Var.f37786b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!hw0Var.a() && tg0Var.f37788c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    hw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                bh0 bh0Var = (bh0) this.f35210b;
                bh0Var.i0();
                bh0Var.h0();
                return;
            case 20:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35210b;
                WindowInsets windowInsets = secretMediaViewer.f31740g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f31779y0 = 1.0f;
                        secretMediaViewer.f31774w0 = 0.0f;
                        secretMediaViewer.f31777x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f31779y0);
                    return;
                }
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((e51) this.f35210b).d();
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                r51 r51Var = (r51) this.f35210b;
                Context context = r51Var.getContext();
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
                    Bitmap bitmap = r51Var.f40144n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || r51Var.f40144n.getHeight() != decorView.getMeasuredHeight()) {
                        r51Var.f();
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
        org.telegram.ui.Components.hw0[] hw0VarArr;
        switch (this.f35209a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 6:
                c70 c70Var = (c70) this.f35210b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    c70Var.f32540c0 = AndroidUtilities.dp(56.0f);
                } else {
                    c70Var.f32540c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(c70.c0(c70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) c70Var.f32558s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + c70.d0(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.e.getLayoutParams()).topMargin = c70.V(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.f32543f.getLayoutParams()).topMargin = c70.W(c70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) c70Var.h.getLayoutParams()).topMargin = c70.X(c70Var).getMeasuredHeight();
                c70Var.h.getLayoutParams().height = c70Var.f32540c0;
                ((ViewGroup.MarginLayoutParams) c70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + c70.Y(c70Var).getMeasuredHeight() + c70Var.f32540c0;
                c70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 8:
                j80 j80Var = (j80) this.f35210b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    j80Var.f34666x = AndroidUtilities.dp(56.0f);
                } else {
                    j80Var.f34666x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(j80.W(j80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) j80Var.f34663r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + j80.X(j80Var).getMeasuredHeight();
                j80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + j80Var.f34666x;
                j80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 10:
                super.onMeasure(i10, i11);
                cd0 cd0Var = ((fd0) this.f35210b).f33516x;
                if (cd0Var != null) {
                    cd0Var.a();
                    return;
                }
                return;
            case 11:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                tg0 tg0Var = (tg0) this.f35210b;
                for (org.telegram.ui.Components.hw0 hw0Var : tg0Var.f37786b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!hw0Var.a() && tg0Var.f37788c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    hw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 14:
                wp0 wp0Var = (wp0) this.f35210b;
                FrameLayout frameLayout = wp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) wp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 19:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f35210b);
                return;
            case 20:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f35210b;
                WindowInsets windowInsets = secretMediaViewer.f31740g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f31740g0;
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
                pd1 pd1Var = (pd1) this.f35210b;
                measureChildWithMargins(pd1.t0(pd1Var), i10, 0, i11, 0);
                int measuredHeight2 = pd1.v0(pd1Var).getMeasuredHeight();
                if (pd1.w0(pd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) pd1Var.f36428n0.getLayoutParams()).topMargin = measuredHeight2;
                pd1Var.f36428n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(pd1Var.f36432p0, i10, 0, i11, 0);
                return;
            case 25:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((zg1) this.f35210b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f35209a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                qt qtVar = (qt) this.f35210b;
                gh.d.c(qtVar.f36903s, qtVar.f36908y);
                qtVar.f36904t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f35209a) {
            case 18:
                if (!((PopupNotificationActivity) this.f35210b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f35209a) {
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
        switch (this.f35209a) {
            case 19:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f35210b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f35209a) {
            case 4:
                super.setTranslationY(f7);
                ((wb) this.f35210b).X.invalidate();
                return;
            case 17:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f35210b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f35209a) {
            case 3:
                n6 n6Var = (n6) this.f35210b;
                if (drawable != n6Var.f35828c && drawable != n6Var.f35827b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f35209a = i10;
        this.f35210b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
