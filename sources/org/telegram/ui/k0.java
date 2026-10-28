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
    public final int f40639a;
    public Object f40640b;

    public k0(Context context) {
        super(context);
        this.f40639a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f40639a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.s1 s1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f40639a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                p6 p6Var = (p6) this.f40640b;
                int c10 = ((measuredWidth - ((int) p6Var.f42315c.c())) + ((int) p6Var.f42314b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                p6Var.f42314b.setBounds(0, 0, c10, getHeight());
                p6Var.f42314b.draw(canvas);
                p6Var.f42315c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                p6Var.f42315c.draw(canvas);
                return;
            case 7:
                t60 t60Var = (t60) this.f40640b;
                ch.f fVar = t60Var.f43516p0;
                hh.d dVar = t60Var.f43517q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    t60Var.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.f12842r && dVar.c(measuredWidth2, measuredHeight)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, t60Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6), t60Var.m0);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f40640b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f35596z1 == null) {
                        launchActivity.f35596z1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f35596z1);
                    int[] iArr2 = launchActivity.f35596z1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f35596z1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                rg0 rg0Var = (rg0) this.f40640b;
                rg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.y6.f23300a7;
                int themedColor = rg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.y6.f23357d6;
                int themedColor2 = rg0Var.getThemedColor(i14);
                vg1 vg1Var = rg0Var.f45001c;
                float f10 = 1.0f;
                if (vg1Var != null) {
                    f7 = vg1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int f11 = i0.a.f(f7, themedColor, themedColor2);
                int i15 = rg0Var.L;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.y6.m0(f11));
                }
                if (rg0Var.M != 0) {
                    canvas.drawRect(getWidth() - rg0Var.M, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.y6.m0(f11));
                }
                super.dispatchDraw(canvas);
                rg0Var.b0();
                hh.c cVar = rg0Var.Q;
                int themedColor3 = rg0Var.getThemedColor(i13);
                int themedColor4 = rg0Var.getThemedColor(i14);
                vg1 vg1Var2 = rg0Var.f45001c;
                if (vg1Var2 != null) {
                    f10 = vg1Var2.r(0);
                }
                cVar.a(i0.a.f(f10, themedColor3, themedColor4));
                View view2 = rg0Var.G;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 23:
                f41 f41Var = (f41) this.f40640b;
                if (f41Var.f39162s > 0.0f && f41Var.f39160n != null) {
                    f41Var.f39161r.reset();
                    float width = getWidth() / f41Var.f39159f.getWidth();
                    f41Var.f39161r.postScale(width, width);
                    f41Var.h.setLocalMatrix(f41Var.f39161r);
                    f41Var.f39160n.setAlpha((int) (f41Var.f39162s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), f41Var.f39160n);
                }
                if (f41Var.W && (s1Var = f41Var.O) != null) {
                    s1Var.setVisibility(4);
                    f41Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                u41 u41Var = (u41) this.f40640b;
                ImageReceiver imageReceiver2 = u41Var.f37895b;
                Rect rect = u41Var.e;
                f61 f61Var = u41Var.P;
                o51 o51Var = u41Var.f37894a;
                if (u41Var.f37898n != null && u41Var.f37899r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    u41Var.f37899r.setAlpha((int) (u41Var.I * 255.0f));
                    canvas.drawBitmap(u41Var.f37898n, 0.0f, 0.0f, u41Var.f37899r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (o51Var != null) {
                    Drawable drawable = o51Var.E;
                    if (drawable != null) {
                        if (u41Var.f37902x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(u41Var.I, f61Var.f39214n1, f61Var.f39199f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(f61Var.f39209k1);
                        }
                        drawable.setAlpha((int) ((1.0f - u41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = o51Var.N;
                        if (f12 == 0.0f && o51Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(o51Var.S * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - u41Var.I) * (1.0f - o51Var.O));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((o51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (u41Var.I * AndroidUtilities.dp(45.0f)) + u41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = o51Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - u41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (f61Var.f39185a0.getX() + f61Var.f39215o0.getX() + u41Var.f37903y), f61Var.f39185a0.getY() + ((int) f61Var.f39215o0.getY()) + u41Var.E);
                        f61Var.f39215o0.draw(canvas);
                        canvas.restore();
                    } else if (o51Var.f41980s && (imageReceiver = o51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - u41Var.I);
                        o51Var.h.setImageCoords(rect);
                        o51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(u41Var.I);
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
        switch (this.f40639a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ht htVar = (ht) this.f40640b;
                    if (!htVar.f39976n && !htVar.K) {
                        htVar.l();
                        return true;
                    }
                    htVar.m();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40639a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((f41) this.f40640b).dismiss();
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
        switch (this.f40639a) {
            case 5:
                ge geVar = (ge) this.f40640b;
                if (motionEvent.getActionMasked() == 0) {
                    geVar.f39603w.X0.C0();
                    for (View view : geVar.f39597b.getViewPages()) {
                        if (view instanceof ee) {
                            ((ee) view).f38846a.C0();
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
        switch (this.f40639a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((lh0) this.f40640b).f41181q0, 500L);
                return;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((u41) this.f40640b).f37895b;
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
        switch (this.f40639a) {
            case 24:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f40639a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((lh0) this.f40640b).f41181q0);
                return;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((u41) this.f40640b).f37895b;
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
        switch (this.f40639a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f40640b).f26282f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((cq0) this.f40640b).f38433b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((tq0) this.f40640b).f43730b.size(), new Object[0]));
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
        switch (this.f40639a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 20:
                if (!((PopupNotificationActivity) this.f40640b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.bx0[] bx0VarArr;
        int i14;
        Activity activity;
        switch (this.f40639a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                f5 f5Var = (f5) this.f40640b;
                f5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = a8.ee.b((paddingTop - f5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                f5Var.f39168c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int B = org.telegram.messenger.wh.B(48.0f, (paddingTop - b10) - f5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) f5Var.f39168c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + B;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.t.D(8.0f, B, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                t60 t60Var = (t60) this.f40640b;
                t60Var.h0();
                t60Var.i0();
                org.telegram.ui.Components.m20 m20Var = t60Var.f43505f;
                oe.e eVar = t60Var.f43499b;
                m20Var.setTranslationY(eVar.f19333f);
                t60Var.j0();
                t60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f19333f);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                k70 k70Var = (k70) this.f40640b;
                TextView textView = k70Var.f40671b;
                if (textView != null) {
                    int measuredWidth = ((k70Var.f40671b.getMeasuredWidth() / 2) + textView.getLeft()) - (k70Var.f40672c.getMeasuredWidth() / 2);
                    int top = (k70Var.e.getTop() + ((k70Var.f40671b.getMeasuredHeight() - k70Var.f40672c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = k70Var.f40672c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, k70Var.f40672c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                ig0 ig0Var = (ig0) this.f40640b;
                for (org.telegram.ui.Components.bx0 bx0Var : ig0Var.f40142b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bx0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!bx0Var.a() && ig0Var.f40144c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    bx0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                rg0 rg0Var = (rg0) this.f40640b;
                rg0Var.f0();
                rg0Var.e0();
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40640b;
                WindowInsets windowInsets = secretMediaViewer.f36191g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                bh.p pVar = secretMediaViewer.e;
                pVar.layout(i14, 0, pVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f36230y0 = 1.0f;
                        secretMediaViewer.f36225w0 = 0.0f;
                        secretMediaViewer.f36228x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f36230y0);
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                ((f41) this.f40640b).d();
                return;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                u41 u41Var = (u41) this.f40640b;
                Context context = u41Var.getContext();
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
                    Bitmap bitmap = u41Var.f37898n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || u41Var.f37898n.getHeight() != decorView.getMeasuredHeight()) {
                        u41Var.f();
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
        float f7;
        org.telegram.ui.Components.bx0[] bx0VarArr;
        int i12;
        switch (this.f40639a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 7:
                t60 t60Var = (t60) this.f40640b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    t60Var.f43502c0 = AndroidUtilities.dp(56.0f);
                } else {
                    t60Var.f43502c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(t60.d0(t60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) t60Var.f43520s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + t60.e0(t60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) t60Var.e.getLayoutParams()).topMargin = t60.W(t60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) t60Var.f43505f.getLayoutParams()).topMargin = t60.X(t60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) t60Var.h.getLayoutParams()).topMargin = t60.Y(t60Var).getMeasuredHeight();
                t60Var.h.getLayoutParams().height = t60Var.f43502c0;
                ((ViewGroup.MarginLayoutParams) t60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + t60.Z(t60Var).getMeasuredHeight() + t60Var.f43502c0;
                t60Var.k0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                y70 y70Var = (y70) this.f40640b;
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    f7 = 78.0f;
                } else {
                    f7 = 144.0f;
                }
                y70Var.f45873w = AndroidUtilities.dp(f7);
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                oc0 oc0Var = ((rc0) this.f40640b).f42951x;
                if (oc0Var != null) {
                    oc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ig0 ig0Var = (ig0) this.f40640b;
                for (org.telegram.ui.Components.bx0 bx0Var : ig0Var.f40142b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) bx0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!bx0Var.a() && ig0Var.f40144c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    bx0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                int paddingLeft = getPaddingLeft();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (zj0.Z((zj0) this.f40640b).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                setPadding(paddingLeft, currentActionBarHeight + i12, getPaddingRight(), 0);
                super.onMeasure(i10, i11);
                return;
            case 16:
                tp0 tp0Var = (tp0) this.f40640b;
                FrameLayout frameLayout = tp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) tp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                ProfileActivity.Y0((ProfileActivity) this.f40640b);
                return;
            case 22:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40640b;
                WindowInsets windowInsets = secretMediaViewer.f36191g0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i13 = AndroidUtilities.displaySize.y;
                        if (size6 > i13) {
                            size6 = i13;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i14 = AndroidUtilities.displaySize.y;
                    if (size6 > i14) {
                        size6 = i14;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f36191g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 26:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                vc1 vc1Var = (vc1) this.f40640b;
                measureChildWithMargins(vc1.t0(vc1Var), i10, 0, i11, 0);
                int measuredHeight2 = vc1.v0(vc1Var).getMeasuredHeight();
                if (vc1.w0(vc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) vc1Var.f44287o0.getLayoutParams()).topMargin = measuredHeight2;
                vc1Var.f44287o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(vc1Var.f44291q0, i10, 0, i11, 0);
                return;
            case 28:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((fg1) this.f40640b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40639a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                ht htVar = (ht) this.f40640b;
                ih.d.c(htVar.f39981s, htVar.f39986y);
                htVar.f39982t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40639a) {
            case 20:
                if (!((PopupNotificationActivity) this.f40640b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f40639a) {
            case 20:
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
        switch (this.f40639a) {
            case 21:
                super.setScaleX(f7);
                ProfileActivity.Y0((ProfileActivity) this.f40640b);
                return;
            case 25:
                super.setScaleX(f7);
                ((f81) this.f40640b).o0();
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f40639a) {
            case 4:
                super.setTranslationY(f7);
                ((wb) this.f40640b).X.invalidate();
                return;
            case 19:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f40640b).I1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f40639a) {
            case 3:
                p6 p6Var = (p6) this.f40640b;
                if (drawable != p6Var.f42315c && drawable != p6Var.f42314b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f40639a = i10;
        this.f40640b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
