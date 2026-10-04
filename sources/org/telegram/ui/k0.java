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
    public final int f37795a;
    public Object f37796b;

    public k0(Context context) {
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
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f37795a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                n6 n6Var = (n6) this.f37796b;
                int d = ((measuredWidth - ((int) n6Var.f38831c.d())) + ((int) n6Var.f38830b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                n6Var.f38830b.setBounds(0, 0, d, getHeight());
                n6Var.f38830b.draw(canvas);
                n6Var.f38831c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                n6Var.f38831c.draw(canvas);
                return;
            case 7:
                d70 d70Var = (d70) this.f37796b;
                ah.i iVar = d70Var.f35685p0;
                fh.d dVar = d70Var.f35686q0;
                if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
                    d70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.f9865r && dVar.d(measuredWidth2, measuredHeight)) {
                        iVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, d70Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20822d6), d70Var.m0);
                return;
            case 9:
                k80 k80Var = (k80) this.f37796b;
                ah.i iVar2 = k80Var.L;
                fh.d dVar2 = k80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && iVar2 != null) {
                    k80Var.X();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f9865r && dVar2.d(measuredWidth3, measuredHeight2)) {
                        iVar2.b(dVar2.a(measuredWidth3, measuredHeight2), -3);
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
                    if (launchActivity.f33819x1 == null) {
                        launchActivity.f33819x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33819x1);
                    int[] iArr = launchActivity.f33819x1;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    getLocationInWindow(iArr);
                    int[] iArr2 = launchActivity.f33819x1;
                    int i12 = i11 - iArr2[1];
                    canvas.save();
                    canvas.translate(i10 - iArr2[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                ch0 ch0Var = (ch0) this.f37796b;
                ch0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.i6.f20766a7;
                int themedColor = ch0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.i6.f20822d6;
                int themedColor2 = ch0Var.getThemedColor(i14);
                sh1 sh1Var = ch0Var.f40855c;
                float f10 = 1.0f;
                if (sh1Var != null) {
                    f7 = sh1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = ch0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                if (ch0Var.N != 0) {
                    canvas.drawRect(getWidth() - ch0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.i6.l0(d10));
                }
                super.dispatchDraw(canvas);
                ch0Var.d0();
                fh.c cVar = ch0Var.R;
                int themedColor3 = ch0Var.getThemedColor(i13);
                int themedColor4 = ch0Var.getThemedColor(i14);
                sh1 sh1Var2 = ch0Var.f40855c;
                if (sh1Var2 != null) {
                    f10 = sh1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = ch0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                e51 e51Var = (e51) this.f37796b;
                if (e51Var.f35930s > 0.0f && e51Var.f35928n != null) {
                    e51Var.f35929r.reset();
                    float width = getWidth() / e51Var.f35927f.getWidth();
                    e51Var.f35929r.postScale(width, width);
                    e51Var.h.setLocalMatrix(e51Var.f35929r);
                    e51Var.f35928n.setAlpha((int) (e51Var.f35930s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), e51Var.f35928n);
                }
                if (e51Var.W && (u1Var = e51Var.O) != null) {
                    u1Var.setVisibility(4);
                    e51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                r51 r51Var = (r51) this.f37796b;
                ImageReceiver imageReceiver2 = r51Var.f43077b;
                Rect rect = r51Var.f43079e;
                c71 c71Var = r51Var.P;
                l61 l61Var = r51Var.f43076a;
                if (r51Var.f43081n != null && r51Var.f43082r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    r51Var.f43082r.setAlpha((int) (r51Var.I * 255.0f));
                    canvas.drawBitmap(r51Var.f43081n, 0.0f, 0.0f, r51Var.f43082r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (l61Var != null) {
                    Drawable drawable = l61Var.E;
                    if (drawable != null) {
                        if (r51Var.f43085x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(r51Var.I, c71Var.f35329m1, c71Var.f35317f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(c71Var.f35327k1);
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
                        canvas.translate((int) (c71Var.f35302a0.getX() + c71Var.f35333o0.getX() + r51Var.f43086y), c71Var.f35302a0.getY() + ((int) c71Var.f35333o0.getY()) + r51Var.E);
                        c71Var.f35333o0.draw(canvas);
                        canvas.restore();
                    } else if (l61Var.f38183s && (imageReceiver = l61Var.h) != null) {
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
        switch (this.f37795a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    rt rtVar = (rt) this.f37796b;
                    if (!rtVar.f40279n && !rtVar.K) {
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
        switch (this.f37795a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((e51) this.f37796b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View[] viewPages;
        switch (this.f37795a) {
            case 5:
                ie ieVar = (ie) this.f37796b;
                if (motionEvent.getActionMasked() == 0) {
                    ieVar.f37413w.a2.C0();
                    for (View view : ieVar.f37406b.getViewPages()) {
                        if (view instanceof ge) {
                            ((ge) view).f36603a.C0();
                        }
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f37795a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((wh0) this.f37796b).f42495q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((r51) this.f37796b).f43077b;
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
                AndroidUtilities.cancelRunOnUIThread(((wh0) this.f37796b).f42495q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((r51) this.f37796b).f43077b;
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
                accessibilityNodeInfo.setChecked(((RadioButton) this.f37796b).f24301f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((fq0) this.f37796b).f36367b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((wq0) this.f37796b).f42602b.size(), new Object[0]));
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
        org.telegram.ui.Components.qw0[] qw0VarArr;
        int i14;
        Activity activity;
        switch (this.f37795a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                d5 d5Var = (d5) this.f37796b;
                d5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.q.b((paddingTop - d5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                d5Var.f35646c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int z11 = org.telegram.messenger.bi.z(48.0f, (paddingTop - b10) - d5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) d5Var.f35646c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + z11;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.q.C(8.0f, z11, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                d70 d70Var = (d70) this.f37796b;
                d70Var.g0();
                d70Var.h0();
                org.telegram.ui.Components.f20 f20Var = d70Var.f35674f;
                le.e eVar = d70Var.f35667b;
                f20Var.setTranslationY(eVar.f15444e);
                d70Var.i0();
                d70Var.f35672e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f15444e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                v70 v70Var = (v70) this.f37796b;
                TextView textView = v70Var.f41589b;
                if (textView != null) {
                    int measuredWidth = ((v70Var.f41589b.getMeasuredWidth() / 2) + textView.getLeft()) - (v70Var.f41590c.getMeasuredWidth() / 2);
                    int top = (v70Var.f41591e.getTop() + ((v70Var.f41589b.getMeasuredHeight() - v70Var.f41590c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = v70Var.f41590c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, v70Var.f41590c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                k80 k80Var = (k80) this.f37796b;
                k80Var.Y();
                k80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ug0 ug0Var = (ug0) this.f37796b;
                for (org.telegram.ui.Components.qw0 qw0Var : ug0Var.f41202b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!qw0Var.a() && ug0Var.f41204c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    qw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ch0 ch0Var = (ch0) this.f37796b;
                ch0Var.i0();
                ch0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37796b;
                WindowInsets windowInsets = secretMediaViewer.f34426g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ci.m6 m6Var = secretMediaViewer.f34420e;
                m6Var.layout(i14, 0, m6Var.getMeasuredWidth() + i14, secretMediaViewer.f34420e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34465y0 = 1.0f;
                        secretMediaViewer.f34460w0 = 0.0f;
                        secretMediaViewer.f34463x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34465y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((e51) this.f37796b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                r51 r51Var = (r51) this.f37796b;
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
                    Bitmap bitmap = r51Var.f43081n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || r51Var.f43081n.getHeight() != decorView.getMeasuredHeight()) {
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
        org.telegram.ui.Components.qw0[] qw0VarArr;
        switch (this.f37795a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 7:
                d70 d70Var = (d70) this.f37796b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    d70Var.f35670c0 = AndroidUtilities.dp(56.0f);
                } else {
                    d70Var.f35670c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(d70.c0(d70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) d70Var.f35689s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + d70.d0(d70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) d70Var.f35672e.getLayoutParams()).topMargin = d70.T(d70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) d70Var.f35674f.getLayoutParams()).topMargin = d70.U(d70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) d70Var.h.getLayoutParams()).topMargin = d70.W(d70Var).getMeasuredHeight();
                d70Var.h.getLayoutParams().height = d70Var.f35670c0;
                ((ViewGroup.MarginLayoutParams) d70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + d70.X(d70Var).getMeasuredHeight() + d70Var.f35670c0;
                d70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                k80 k80Var = (k80) this.f37796b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    k80Var.f37892x = AndroidUtilities.dp(56.0f);
                } else {
                    k80Var.f37892x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(k80.U(k80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) k80Var.f37889r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + k80.W(k80Var).getMeasuredHeight();
                k80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + k80Var.f37892x;
                k80Var.Z();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                dd0 dd0Var = ((gd0) this.f37796b).f36598x;
                if (dd0Var != null) {
                    dd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ug0 ug0Var = (ug0) this.f37796b;
                for (org.telegram.ui.Components.qw0 qw0Var : ug0Var.f41202b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!qw0Var.a() && ug0Var.f41204c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    qw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                wp0 wp0Var = (wp0) this.f37796b;
                FrameLayout frameLayout = wp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) wp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
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
                WindowInsets windowInsets = secretMediaViewer.f34426g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34426g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f34420e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                rd1 rd1Var = (rd1) this.f37796b;
                measureChildWithMargins(rd1.t0(rd1Var), i10, 0, i11, 0);
                int measuredHeight2 = rd1.v0(rd1Var).getMeasuredHeight();
                if (rd1.w0(rd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) rd1Var.f40076n0.getLayoutParams()).topMargin = measuredHeight2;
                rd1Var.f40076n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(rd1Var.f40080p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((bh1) this.f37796b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f37795a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                rt rtVar = (rt) this.f37796b;
                gh.d.c(rtVar.f40284s, rtVar.f40289y);
                rtVar.f40285t.d();
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
                ((wb) this.f37796b).X.invalidate();
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
                n6 n6Var = (n6) this.f37796b;
                if (drawable != n6Var.f38831c && drawable != n6Var.f38830b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f37795a = i10;
        this.f37796b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
