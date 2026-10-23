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
    public final int f39075a;
    public Object f39076b;

    public m0(Context context) {
        super(context);
        this.f39075a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39075a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.d91 d91Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.u1 u1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f39075a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                o6 o6Var = (o6) this.f39076b;
                int c10 = ((measuredWidth - ((int) o6Var.f39787c.c())) + ((int) o6Var.f39786b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                o6Var.f39786b.setBounds(0, 0, c10, getHeight());
                o6Var.f39786b.draw(canvas);
                o6Var.f39787c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                o6Var.f39787c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                lu luVar = (lu) this.f39076b;
                if (luVar.getParentLayout() != null && (d91Var = luVar.f39027b) != null) {
                    float measuredHeight = d91Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.h6.f21115k0);
                    return;
                }
                return;
            case 7:
                l60 l60Var = (l60) this.f39076b;
                bh.f fVar = l60Var.f38824p0;
                gh.d dVar = l60Var.f38825q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    l60Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f11060n && dVar.g(measuredWidth2, measuredHeight2)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.c();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, l60Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20994d6), l60Var.m0);
                return;
            case 9:
                r70 r70Var = (r70) this.f39076b;
                bh.f fVar2 = r70Var.L;
                gh.d dVar2 = r70Var.M;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    r70Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f11060n && dVar2.g(measuredWidth3, measuredHeight3)) {
                        fVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.c();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f39076b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33207y1 == null) {
                        launchActivity.f33207y1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33207y1);
                    int[] iArr2 = launchActivity.f33207y1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33207y1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                ng0 ng0Var = (ng0) this.f39076b;
                ng0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.h6.f20936a7;
                int themedColor = ng0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.h6.f20994d6;
                int themedColor2 = ng0Var.getThemedColor(i14);
                ng1 ng1Var = ng0Var.f39892c;
                float f10 = 1.0f;
                if (ng1Var != null) {
                    f7 = ng1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int f11 = i0.a.f(f7, themedColor, themedColor2);
                int i15 = ng0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.h6.m0(f11));
                }
                if (ng0Var.N != 0) {
                    canvas.drawRect(getWidth() - ng0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.h6.m0(f11));
                }
                super.dispatchDraw(canvas);
                ng0Var.d0();
                gh.c cVar = ng0Var.R;
                int themedColor3 = ng0Var.getThemedColor(i13);
                int themedColor4 = ng0Var.getThemedColor(i14);
                ng1 ng1Var2 = ng0Var.f39892c;
                if (ng1Var2 != null) {
                    f10 = ng1Var2.r(0);
                }
                cVar.a(i0.a.f(f10, themedColor3, themedColor4));
                View view2 = ng0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                x31 x31Var = (x31) this.f39076b;
                if (x31Var.f43035s > 0.0f && x31Var.f43033n != null) {
                    x31Var.f43034r.reset();
                    float width = getWidth() / x31Var.f43032f.getWidth();
                    x31Var.f43034r.postScale(width, width);
                    x31Var.h.setLocalMatrix(x31Var.f43034r);
                    x31Var.f43033n.setAlpha((int) (x31Var.f43035s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), x31Var.f43033n);
                }
                if (x31Var.W && (u1Var = x31Var.O) != null) {
                    u1Var.setVisibility(4);
                    x31Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                m41 m41Var = (m41) this.f39076b;
                ImageReceiver imageReceiver2 = m41Var.f41600b;
                Rect rect = m41Var.e;
                x51 x51Var = m41Var.P;
                g51 g51Var = m41Var.f41599a;
                if (m41Var.f41603n != null && m41Var.f41604r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    m41Var.f41604r.setAlpha((int) (m41Var.I * 255.0f));
                    canvas.drawBitmap(m41Var.f41603n, 0.0f, 0.0f, m41Var.f41604r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (g51Var != null) {
                    Drawable drawable = g51Var.E;
                    if (drawable != null) {
                        if (m41Var.f41607x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(m41Var.I, x51Var.f43074m1, x51Var.f43062f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(x51Var.f43072k1);
                        }
                        drawable.setAlpha((int) ((1.0f - m41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = g51Var.N;
                        if (f12 == 0.0f && g51Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(g51Var.S * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - m41Var.I) * (1.0f - g51Var.O));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((g51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (m41Var.I * AndroidUtilities.dp(45.0f)) + m41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = g51Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - m41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (x51Var.f43048a0.getX() + x51Var.f43078o0.getX() + m41Var.f41608y), x51Var.f43048a0.getY() + ((int) x51Var.f43078o0.getY()) + m41Var.E);
                        x51Var.f43078o0.draw(canvas);
                        canvas.restore();
                    } else if (g51Var.f37199s && (imageReceiver = g51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - m41Var.I);
                        g51Var.h.setImageCoords(rect);
                        g51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(m41Var.I);
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
        switch (this.f39075a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    et etVar = (et) this.f39076b;
                    if (!etVar.f36793n && !etVar.K) {
                        etVar.n();
                        return true;
                    }
                    etVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39075a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((x31) this.f39076b).dismiss();
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
        switch (this.f39075a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((ih0) this.f39076b).f38001q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((m41) this.f39076b).f41600b;
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
        switch (this.f39075a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39075a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((ih0) this.f39076b).f38001q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((m41) this.f39076b).f41600b;
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
        switch (this.f39075a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39076b).f24345f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((sp0) this.f39076b).f41511b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((jq0) this.f39076b).f38307b.size(), new Object[0]));
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
        switch (this.f39075a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f39076b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
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
        switch (this.f39075a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                h5 h5Var = (h5) this.f39076b;
                h5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.r.b((paddingTop - h5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                h5Var.f37492c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int A = org.telegram.messenger.nk.A(48.0f, (paddingTop - b10) - h5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) h5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) h5Var.f37492c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + A;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.g0.C(8.0f, A, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                l60 l60Var = (l60) this.f39076b;
                l60Var.g0();
                l60Var.h0();
                org.telegram.ui.Components.k20 k20Var = l60Var.f38813f;
                ne.e eVar = l60Var.f38807b;
                k20Var.setTranslationY(eVar.e);
                l60Var.i0();
                l60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                c70 c70Var = (c70) this.f39076b;
                TextView textView = c70Var.f35857b;
                if (textView != null) {
                    int measuredWidth = ((c70Var.f35857b.getMeasuredWidth() / 2) + textView.getLeft()) - (c70Var.f35858c.getMeasuredWidth() / 2);
                    int top = (c70Var.e.getTop() + ((c70Var.f35857b.getMeasuredHeight() - c70Var.f35858c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = c70Var.f35858c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, c70Var.f35858c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                r70 r70Var = (r70) this.f39076b;
                r70Var.Z();
                r70Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                dg0 dg0Var = (dg0) this.f39076b;
                for (org.telegram.ui.Components.qw0 qw0Var : dg0Var.f36373b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qw0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!qw0Var.a() && dg0Var.f36375c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    qw0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                ng0 ng0Var = (ng0) this.f39076b;
                ng0Var.i0();
                ng0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39076b;
                WindowInsets windowInsets = secretMediaViewer.f33804g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.v vVar = secretMediaViewer.e;
                vVar.layout(i14, 0, vVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f33843y0 = 1.0f;
                        secretMediaViewer.f33838w0 = 0.0f;
                        secretMediaViewer.f33841x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f33843y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((x31) this.f39076b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                m41 m41Var = (m41) this.f39076b;
                Context context = m41Var.getContext();
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
                    Bitmap bitmap = m41Var.f41603n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || m41Var.f41603n.getHeight() != decorView.getMeasuredHeight()) {
                        m41Var.f();
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
        switch (this.f39075a) {
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
                l60 l60Var = (l60) this.f39076b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    l60Var.f38810c0 = AndroidUtilities.dp(56.0f);
                } else {
                    l60Var.f38810c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(l60.c0(l60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) l60Var.f38828s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + l60.d0(l60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) l60Var.e.getLayoutParams()).topMargin = l60.V(l60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) l60Var.f38813f.getLayoutParams()).topMargin = l60.W(l60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) l60Var.h.getLayoutParams()).topMargin = l60.X(l60Var).getMeasuredHeight();
                l60Var.h.getLayoutParams().height = l60Var.f38810c0;
                ((ViewGroup.MarginLayoutParams) l60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + l60.Y(l60Var).getMeasuredHeight() + l60Var.f38810c0;
                l60Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                r70 r70Var = (r70) this.f39076b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    r70Var.f41086x = AndroidUtilities.dp(56.0f);
                } else {
                    r70Var.f41086x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(r70.W(r70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) r70Var.f41083r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + r70.X(r70Var).getMeasuredHeight();
                r70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + r70Var.f41086x;
                r70Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                kc0 kc0Var = ((nc0) this.f39076b).f39532x;
                if (kc0Var != null) {
                    kc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                dg0 dg0Var = (dg0) this.f39076b;
                for (org.telegram.ui.Components.qw0 qw0Var : dg0Var.f36373b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qw0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!qw0Var.a() && dg0Var.f36375c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    qw0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                ip0 ip0Var = (ip0) this.f39076b;
                FrameLayout frameLayout = ip0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) ip0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.W0((ProfileActivity) this.f39076b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39076b;
                WindowInsets windowInsets = secretMediaViewer.f33804g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f33804g0;
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
                kc1 kc1Var = (kc1) this.f39076b;
                measureChildWithMargins(kc1.t0(kc1Var), i10, 0, i11, 0);
                int measuredHeight2 = kc1.v0(kc1Var).getMeasuredHeight();
                if (kc1.w0(kc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) kc1Var.f38559n0.getLayoutParams()).topMargin = measuredHeight2;
                kc1Var.f38559n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(kc1Var.f38563p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((vf1) this.f39076b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39075a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                et etVar = (et) this.f39076b;
                hh.d.c(etVar.f36798s, etVar.f36803y);
                etVar.f36799t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39075a) {
            case 19:
                if (!((PopupNotificationActivity) this.f39076b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39075a) {
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
        switch (this.f39075a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.W0((ProfileActivity) this.f39076b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39075a) {
            case 4:
                super.setTranslationY(f7);
                ((vb) this.f39076b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39076b).H1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39075a) {
            case 3:
                o6 o6Var = (o6) this.f39076b;
                if (drawable != o6Var.f39787c && drawable != o6Var.f39786b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m0(Object obj, Context context, int i10) {
        super(context);
        this.f39075a = i10;
        this.f39076b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
