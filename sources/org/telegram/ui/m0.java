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
public final class m0 extends FrameLayout {
    public final int f38993a;
    public Object f38994b;

    public m0(Context context) {
        super(context);
        this.f38993a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f38993a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.b91 b91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f38993a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f38994b;
                int c10 = ((measuredWidth - ((int) o6Var.f39691c.c())) + ((int) o6Var.f39690b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f39690b.setBounds(0, 0, c10, getHeight());
                o6Var.f39690b.draw(canvas);
                o6Var.f39691c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                o6Var.f39691c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                nu nuVar = (nu) this.f38994b;
                if (nuVar.getParentLayout() != null && (b91Var = nuVar.f39577b) != null) {
                    float measuredHeight = b91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.f21114k0);
                    return;
                }
                return;
            case 7:
                n60 n60Var = (n60) this.f38994b;
                bh.f fVar = n60Var.f39373p0;
                gh.d dVar = n60Var.f39374q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    n60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f11063n && dVar.g(measuredWidth2, measuredHeight2)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, n60Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20993d6), n60Var.m0);
                return;
            case 9:
                t70 t70Var = (t70) this.f38994b;
                bh.f fVar2 = t70Var.L;
                gh.d dVar2 = t70Var.M;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    t70Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f11063n && dVar2.g(measuredWidth3, measuredHeight3)) {
                        fVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f38994b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33197y1 == null) {
                        launchActivity.f33197y1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33197y1);
                    int[] iArr2 = launchActivity.f33197y1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33197y1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                pg0 pg0Var = (pg0) this.f38994b;
                pg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.h6.f20935a7;
                int themedColor = pg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.h6.f20993d6;
                int themedColor2 = pg0Var.getThemedColor(i14);
                pg1 pg1Var = pg0Var.f40433c;
                float f10 = 1.0f;
                if (pg1Var != null) {
                    f7 = pg1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int f11 = i0.a.f(f7, themedColor, themedColor2);
                int i15 = pg0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.h6.m0(f11));
                }
                if (pg0Var.N != 0) {
                    canvas.drawRect(getWidth() - pg0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.m0(f11));
                }
                super.dispatchDraw(canvas);
                pg0Var.d0();
                gh.c cVar = pg0Var.R;
                int themedColor3 = pg0Var.getThemedColor(i13);
                int themedColor4 = pg0Var.getThemedColor(i14);
                pg1 pg1Var2 = pg0Var.f40433c;
                if (pg1Var2 != null) {
                    f10 = pg1Var2.r(0);
                }
                cVar.a(i0.a.f(f10, themedColor3, themedColor4));
                View view2 = pg0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                z31 z31Var = (z31) this.f38994b;
                if (z31Var.f43577s > 0.0f && z31Var.f43575n != null) {
                    z31Var.f43576r.reset();
                    float width = getWidth() / z31Var.f43574f.getWidth();
                    z31Var.f43576r.postScale(width, width);
                    z31Var.h.setLocalMatrix(z31Var.f43576r);
                    z31Var.f43575n.setAlpha((int) (z31Var.f43577s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), z31Var.f43575n);
                }
                if (z31Var.W && (u1Var = z31Var.O) != null) {
                    u1Var.setVisibility(4);
                    z31Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                o41 o41Var = (o41) this.f38994b;
                ImageReceiver imageReceiver2 = o41Var.f42141b;
                Rect rect = o41Var.e;
                z51 z51Var = o41Var.P;
                i51 i51Var = o41Var.f42140a;
                if (o41Var.f42144n != null && o41Var.f42145r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    o41Var.f42145r.setAlpha((int) (o41Var.I * 255.0f));
                    canvas.drawBitmap(o41Var.f42144n, 0.0f, 0.0f, o41Var.f42145r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (i51Var != null) {
                    Drawable drawable = i51Var.E;
                    if (drawable != null) {
                        if (o41Var.f42148x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(o41Var.I, z51Var.f43631m1, z51Var.f43619f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(z51Var.f43629k1);
                        }
                        drawable.setAlpha((int) ((1.0f - o41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = i51Var.N;
                        if (f12 == 0.0f && i51Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(i51Var.S * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - o41Var.I) * (1.0f - i51Var.O));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((i51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (o41Var.I * AndroidUtilities.dp(45.0f)) + o41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = i51Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - o41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (z51Var.f43605a0.getX() + z51Var.f43635o0.getX() + o41Var.f42149y), z51Var.f43605a0.getY() + ((int) z51Var.f43635o0.getY()) + o41Var.E);
                        z51Var.f43635o0.draw(canvas);
                        canvas.restore();
                    } else if (i51Var.f37768s && (imageReceiver = i51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - o41Var.I);
                        i51Var.h.setImageCoords(rect);
                        i51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(o41Var.I);
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
        switch (this.f38993a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    gt gtVar = (gt) this.f38994b;
                    if (!gtVar.f37343n && !gtVar.K) {
                        gtVar.n();
                        return true;
                    }
                    gtVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f38993a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((z31) this.f38994b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.m0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f38993a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((kh0) this.f38994b).f38555q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((o41) this.f38994b).f42141b;
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
        switch (this.f38993a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f38993a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((kh0) this.f38994b).f38555q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((o41) this.f38994b).f42141b;
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
        switch (this.f38993a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f38994b).f24344f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((up0) this.f38994b).f42042b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((lq0) this.f38994b).f38913b.size(), new Object[0]));
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
        switch (this.f38993a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f38994b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.ow0[] ow0VarArr;
        int i14;
        Activity activity;
        switch (this.f38993a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                h5 h5Var = (h5) this.f38994b;
                h5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.r.b((paddingTop - h5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                h5Var.f37443c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.kk.A(48.0f, (paddingTop - b10) - h5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) h5Var.f37443c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.g0.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                n60 n60Var = (n60) this.f38994b;
                n60Var.g0();
                n60Var.h0();
                org.telegram.ui.Components.k20 k20Var = n60Var.f39362f;
                ne.e eVar = n60Var.f39356b;
                k20Var.setTranslationY(eVar.e);
                n60Var.i0();
                n60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                e70 e70Var = (e70) this.f38994b;
                TextView textView = e70Var.f36417b;
                if (textView != null) {
                    int measuredWidth = ((e70Var.f36417b.getMeasuredWidth() / 2) + textView.getLeft()) - (e70Var.f36418c.getMeasuredWidth() / 2);
                    int top = (e70Var.e.getTop() + ((e70Var.f36417b.getMeasuredHeight() - e70Var.f36418c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = e70Var.f36418c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, e70Var.f36418c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                t70 t70Var = (t70) this.f38994b;
                t70Var.Z();
                t70Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                fg0 fg0Var = (fg0) this.f38994b;
                for (org.telegram.ui.Components.ow0 ow0Var : fg0Var.f36928b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ow0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!ow0Var.a() && fg0Var.f36930c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    ow0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                pg0 pg0Var = (pg0) this.f38994b;
                pg0Var.i0();
                pg0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38994b;
                WindowInsets windowInsets = secretMediaViewer.f33792g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.v vVar = secretMediaViewer.e;
                vVar.layout(i14, 0, vVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f33831y0 = 1.0f;
                        secretMediaViewer.f33826w0 = 0.0f;
                        secretMediaViewer.f33829x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f33831y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((z31) this.f38994b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                o41 o41Var = (o41) this.f38994b;
                Context context = o41Var.getContext();
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
                    Bitmap bitmap = o41Var.f42144n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || o41Var.f42144n.getHeight() != decorView.getMeasuredHeight()) {
                        o41Var.f();
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
        org.telegram.ui.Components.ow0[] ow0VarArr;
        switch (this.f38993a) {
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
                n60 n60Var = (n60) this.f38994b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    n60Var.f39359c0 = AndroidUtilities.dp(56.0f);
                } else {
                    n60Var.f39359c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(n60.c0(n60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) n60Var.f39377s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + n60.d0(n60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) n60Var.e.getLayoutParams()).topMargin = n60.V(n60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) n60Var.f39362f.getLayoutParams()).topMargin = n60.W(n60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) n60Var.h.getLayoutParams()).topMargin = n60.X(n60Var).getMeasuredHeight();
                n60Var.h.getLayoutParams().height = n60Var.f39359c0;
                ((ViewGroup.MarginLayoutParams) n60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + n60.Y(n60Var).getMeasuredHeight() + n60Var.f39359c0;
                n60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                t70 t70Var = (t70) this.f38994b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    t70Var.f41636x = AndroidUtilities.dp(56.0f);
                } else {
                    t70Var.f41636x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(t70.W(t70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) t70Var.f41633r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + t70.X(t70Var).getMeasuredHeight();
                t70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + t70Var.f41636x;
                t70Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                mc0 mc0Var = ((pc0) this.f38994b).f40086x;
                if (mc0Var != null) {
                    mc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fg0 fg0Var = (fg0) this.f38994b;
                for (org.telegram.ui.Components.ow0 ow0Var : fg0Var.f36928b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ow0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!ow0Var.a() && fg0Var.f36930c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    ow0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                kp0 kp0Var = (kp0) this.f38994b;
                FrameLayout frameLayout = kp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) kp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f38994b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f38994b;
                WindowInsets windowInsets = secretMediaViewer.f33792g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f33792g0;
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
                mc1 mc1Var = (mc1) this.f38994b;
                measureChildWithMargins(mc1.t0(mc1Var), i10, 0, i11, 0);
                int measuredHeight2 = mc1.v0(mc1Var).getMeasuredHeight();
                if (mc1.w0(mc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) mc1Var.f39160n0.getLayoutParams()).topMargin = measuredHeight2;
                mc1Var.f39160n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(mc1Var.f39164p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((xf1) this.f38994b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f38993a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                gt gtVar = (gt) this.f38994b;
                hh.d.c(gtVar.f37348s, gtVar.f37353y);
                gtVar.f37349t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f38993a) {
            case 19:
                if (!((PopupNotificationActivity) this.f38994b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f38993a) {
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
        switch (this.f38993a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f38994b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f38993a) {
            case 4:
                super.setTranslationY(f7);
                ((xb) this.f38994b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f38994b).G1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f38993a) {
            case 3:
                o6 o6Var = (o6) this.f38994b;
                if (drawable != o6Var.f39691c && drawable != o6Var.f39690b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m0(Object obj, Context context, int i10) {
        super(context);
        this.f38993a = i10;
        this.f38994b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
