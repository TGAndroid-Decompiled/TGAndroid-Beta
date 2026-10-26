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
    public final int f40771a;
    public Object f40772b;

    public k0(Context context) {
        super(context);
        this.f40771a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f40771a) {
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
        switch (this.f40771a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                p6 p6Var = (p6) this.f40772b;
                int c10 = ((measuredWidth - ((int) p6Var.f42367c.c())) + ((int) p6Var.f42366b.c())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                p6Var.f42366b.setBounds(0, 0, c10, getHeight());
                p6Var.f42366b.draw(canvas);
                p6Var.f42367c.setBounds(AndroidUtilities.dp(8.0f) + c10, 0, getWidth(), getHeight());
                p6Var.f42367c.draw(canvas);
                return;
            case 7:
                r60 r60Var = (r60) this.f40772b;
                ch.f fVar = r60Var.f43031p0;
                hh.d dVar = r60Var.f43032q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    r60Var.f0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight = getMeasuredHeight();
                    if (dVar != null && !dVar.f12843r && dVar.c(measuredWidth2, measuredHeight)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, r60Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6), r60Var.m0);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f40772b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f35572z1 == null) {
                        launchActivity.f35572z1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f35572z1);
                    int[] iArr2 = launchActivity.f35572z1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f35572z1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                pg0 pg0Var = (pg0) this.f40772b;
                pg0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.y6.f23299a7;
                int themedColor = pg0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.y6.f23356d6;
                int themedColor2 = pg0Var.getThemedColor(i14);
                tg1 tg1Var = pg0Var.f44135c;
                float f10 = 1.0f;
                if (tg1Var != null) {
                    f7 = tg1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int f11 = i0.a.f(f7, themedColor, themedColor2);
                int i15 = pg0Var.L;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.y6.m0(f11));
                }
                if (pg0Var.M != 0) {
                    canvas.drawRect(getWidth() - pg0Var.M, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.y6.m0(f11));
                }
                super.dispatchDraw(canvas);
                pg0Var.b0();
                hh.c cVar = pg0Var.Q;
                int themedColor3 = pg0Var.getThemedColor(i13);
                int themedColor4 = pg0Var.getThemedColor(i14);
                tg1 tg1Var2 = pg0Var.f44135c;
                if (tg1Var2 != null) {
                    f10 = tg1Var2.r(0);
                }
                cVar.a(i0.a.f(f10, themedColor3, themedColor4));
                View view2 = pg0Var.G;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 23:
                c41 c41Var = (c41) this.f40772b;
                if (c41Var.f38260s > 0.0f && c41Var.f38258n != null) {
                    c41Var.f38259r.reset();
                    float width = getWidth() / c41Var.f38257f.getWidth();
                    c41Var.f38259r.postScale(width, width);
                    c41Var.h.setLocalMatrix(c41Var.f38259r);
                    c41Var.f38258n.setAlpha((int) (c41Var.f38260s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), c41Var.f38258n);
                }
                if (c41Var.W && (s1Var = c41Var.O) != null) {
                    s1Var.setVisibility(4);
                    c41Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                r41 r41Var = (r41) this.f40772b;
                ImageReceiver imageReceiver2 = r41Var.f45960b;
                Rect rect = r41Var.e;
                c61 c61Var = r41Var.P;
                l51 l51Var = r41Var.f45959a;
                if (r41Var.f45963n != null && r41Var.f45964r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    r41Var.f45964r.setAlpha((int) (r41Var.I * 255.0f));
                    canvas.drawBitmap(r41Var.f45963n, 0.0f, 0.0f, r41Var.f45964r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (l51Var != null) {
                    Drawable drawable = l51Var.E;
                    if (drawable != null) {
                        if (r41Var.f45967x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.f(r41Var.I, c61Var.f38311n1, c61Var.f38296f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(c61Var.f38306k1);
                        }
                        drawable.setAlpha((int) ((1.0f - r41Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = l51Var.N;
                        if (f12 == 0.0f && l51Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(l51Var.S * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - r41Var.I) * (1.0f - l51Var.O));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((l51Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (r41Var.I * AndroidUtilities.dp(45.0f)) + r41Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = l51Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - r41Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (c61Var.f38282a0.getX() + c61Var.f38312o0.getX() + r41Var.f45968y), c61Var.f38282a0.getY() + ((int) c61Var.f38312o0.getY()) + r41Var.E);
                        c61Var.f38312o0.draw(canvas);
                        canvas.restore();
                    } else if (l51Var.f41147s && (imageReceiver = l51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - r41Var.I);
                        l51Var.h.setImageCoords(rect);
                        l51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(r41Var.I);
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
        switch (this.f40771a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ft ftVar = (ft) this.f40772b;
                    if (!ftVar.f39461n && !ftVar.K) {
                        ftVar.l();
                        return true;
                    }
                    ftVar.m();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40771a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((c41) this.f40772b).dismiss();
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
        switch (this.f40771a) {
            case 5:
                ge geVar = (ge) this.f40772b;
                if (motionEvent.getActionMasked() == 0) {
                    geVar.f39626w.X0.C0();
                    for (View view : geVar.f39620b.getViewPages()) {
                        if (view instanceof ee) {
                            ((ee) view).f39091a.C0();
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
        switch (this.f40771a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((jh0) this.f40772b).f40665q0, 500L);
                return;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((r41) this.f40772b).f45960b;
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
        switch (this.f40771a) {
            case 24:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f40771a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((jh0) this.f40772b).f40665q0);
                return;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((r41) this.f40772b).f45960b;
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
        switch (this.f40771a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f40772b).f26280f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((aq0) this.f40772b).f37876b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((rq0) this.f40772b).f43244b.size(), new Object[0]));
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
        switch (this.f40771a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 20:
                if (!((PopupNotificationActivity) this.f40772b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.ax0[] ax0VarArr;
        int i14;
        Activity activity;
        switch (this.f40771a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                f5 f5Var = (f5) this.f40772b;
                f5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = a8.ee.b((paddingTop - f5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                f5Var.f39255c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int B = org.telegram.messenger.vh.B(48.0f, (paddingTop - b10) - f5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) f5Var.f39255c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + B;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.t.D(8.0f, B, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                r60 r60Var = (r60) this.f40772b;
                r60Var.h0();
                r60Var.i0();
                org.telegram.ui.Components.m20 m20Var = r60Var.f43020f;
                oe.e eVar = r60Var.f43014b;
                m20Var.setTranslationY(eVar.f19334f);
                r60Var.j0();
                r60Var.e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f19334f);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                i70 i70Var = (i70) this.f40772b;
                TextView textView = i70Var.f40162b;
                if (textView != null) {
                    int measuredWidth = ((i70Var.f40162b.getMeasuredWidth() / 2) + textView.getLeft()) - (i70Var.f40163c.getMeasuredWidth() / 2);
                    int top = (i70Var.e.getTop() + ((i70Var.f40162b.getMeasuredHeight() - i70Var.f40163c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = i70Var.f40163c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, i70Var.f40163c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                gg0 gg0Var = (gg0) this.f40772b;
                for (org.telegram.ui.Components.ax0 ax0Var : gg0Var.f39653b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ax0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!ax0Var.a() && gg0Var.f39655c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    ax0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                pg0 pg0Var = (pg0) this.f40772b;
                pg0Var.f0();
                pg0Var.e0();
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40772b;
                WindowInsets windowInsets = secretMediaViewer.f36167g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                bh.p pVar = secretMediaViewer.e;
                pVar.layout(i14, 0, pVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f36206y0 = 1.0f;
                        secretMediaViewer.f36201w0 = 0.0f;
                        secretMediaViewer.f36204x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f36206y0);
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                ((c41) this.f40772b).d();
                return;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                r41 r41Var = (r41) this.f40772b;
                Context context = r41Var.getContext();
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
                    Bitmap bitmap = r41Var.f45963n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || r41Var.f45963n.getHeight() != decorView.getMeasuredHeight()) {
                        r41Var.f();
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
        org.telegram.ui.Components.ax0[] ax0VarArr;
        int i12;
        switch (this.f40771a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 7:
                r60 r60Var = (r60) this.f40772b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    r60Var.f43017c0 = AndroidUtilities.dp(56.0f);
                } else {
                    r60Var.f43017c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(r60.d0(r60Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) r60Var.f43035s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + r60.e0(r60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) r60Var.e.getLayoutParams()).topMargin = r60.W(r60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) r60Var.f43020f.getLayoutParams()).topMargin = r60.X(r60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) r60Var.h.getLayoutParams()).topMargin = r60.Y(r60Var).getMeasuredHeight();
                r60Var.h.getLayoutParams().height = r60Var.f43017c0;
                ((ViewGroup.MarginLayoutParams) r60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + r60.Z(r60Var).getMeasuredHeight() + r60Var.f43017c0;
                r60Var.k0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                w70 w70Var = (w70) this.f40772b;
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    f7 = 78.0f;
                } else {
                    f7 = 144.0f;
                }
                w70Var.f45000w = AndroidUtilities.dp(f7);
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                mc0 mc0Var = ((pc0) this.f40772b).f42458x;
                if (mc0Var != null) {
                    mc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gg0 gg0Var = (gg0) this.f40772b;
                for (org.telegram.ui.Components.ax0 ax0Var : gg0Var.f39653b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ax0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!ax0Var.a() && gg0Var.f39655c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    ax0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                int paddingLeft = getPaddingLeft();
                int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                if (xj0.Z((xj0) this.f40772b).getOccupyStatusBar()) {
                    i12 = AndroidUtilities.statusBarHeight;
                } else {
                    i12 = 0;
                }
                setPadding(paddingLeft, currentActionBarHeight + i12, getPaddingRight(), 0);
                super.onMeasure(i10, i11);
                return;
            case 16:
                rp0 rp0Var = (rp0) this.f40772b;
                FrameLayout frameLayout = rp0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) rp0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                ProfileActivity.Y0((ProfileActivity) this.f40772b);
                return;
            case 22:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40772b;
                WindowInsets windowInsets = secretMediaViewer.f36167g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f36167g0;
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
                tc1 tc1Var = (tc1) this.f40772b;
                measureChildWithMargins(tc1.t0(tc1Var), i10, 0, i11, 0);
                int measuredHeight2 = tc1.v0(tc1Var).getMeasuredHeight();
                if (tc1.w0(tc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) tc1Var.f43777o0.getLayoutParams()).topMargin = measuredHeight2;
                tc1Var.f43777o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(tc1Var.f43781q0, i10, 0, i11, 0);
                return;
            case 28:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((dg1) this.f40772b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40771a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                ft ftVar = (ft) this.f40772b;
                ih.d.c(ftVar.f39466s, ftVar.f39471y);
                ftVar.f39467t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40771a) {
            case 20:
                if (!((PopupNotificationActivity) this.f40772b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f40771a) {
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
        switch (this.f40771a) {
            case 21:
                super.setScaleX(f7);
                ProfileActivity.Y0((ProfileActivity) this.f40772b);
                return;
            case 25:
                super.setScaleX(f7);
                ((d81) this.f40772b).o0();
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f40771a) {
            case 4:
                super.setTranslationY(f7);
                ((wb) this.f40772b).X.invalidate();
                return;
            case 19:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f40772b).H1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f40771a) {
            case 3:
                p6 p6Var = (p6) this.f40772b;
                if (drawable != p6Var.f42367c && drawable != p6Var.f42366b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Object obj, Context context, int i10) {
        super(context);
        this.f40771a = i10;
        this.f40772b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
