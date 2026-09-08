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
public final class j0 extends FrameLayout {
    public final int f37487a;
    public Object f37488b;

    public j0(Context context) {
        super(context);
        this.f37487a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f37487a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.h81 h81Var;
        int[] iArr;
        float f7;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f37487a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                l6 l6Var = (l6) this.f37488b;
                int d = ((measuredWidth - ((int) l6Var.f38224c.d())) + ((int) l6Var.f38223b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                l6Var.f38223b.setBounds(0, 0, d, getHeight());
                l6Var.f38223b.draw(canvas);
                l6Var.f38224c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                l6Var.f38224c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                av avVar = (av) this.f37488b;
                if (avVar.getParentLayout() != null && (h81Var = avVar.f34582b) != null) {
                    float measuredHeight = h81Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.j6.f20812k0);
                    return;
                }
                return;
            case 7:
                f70 f70Var = (f70) this.f37488b;
                bh.f fVar = f70Var.f36325p0;
                gh.d dVar = f70Var.f36326q0;
                if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
                    f70Var.e0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f10686n && dVar.f(measuredWidth2, measuredHeight2)) {
                        fVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, f70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6), f70Var.m0);
                return;
            case 9:
                l80 l80Var = (l80) this.f37488b;
                bh.f fVar2 = l80Var.L;
                gh.d dVar2 = l80Var.M;
                if (Build.VERSION.SDK_INT >= 31 && fVar2 != null) {
                    l80Var.Y();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f10686n && dVar2.f(measuredWidth3, measuredHeight3)) {
                        fVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f37488b;
                View view = launchActivity.G0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f33495x1 == null) {
                        launchActivity.f33495x1 = new int[2];
                    }
                    launchActivity.G0.getLocationInWindow(launchActivity.f33495x1);
                    int[] iArr2 = launchActivity.f33495x1;
                    int i10 = iArr2[0];
                    int i11 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i12 = i11 - launchActivity.f33495x1[1];
                    canvas.save();
                    canvas.translate(i10 - iArr[0], i12);
                    launchActivity.G0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                eh0 eh0Var = (eh0) this.f37488b;
                eh0Var.getClass();
                int i13 = org.telegram.ui.ActionBar.j6.f20634a7;
                int themedColor = eh0Var.getThemedColor(i13);
                int i14 = org.telegram.ui.ActionBar.j6.f20690d6;
                int themedColor2 = eh0Var.getThemedColor(i14);
                ai1 ai1Var = eh0Var.f34843c;
                float f10 = 1.0f;
                if (ai1Var != null) {
                    f7 = ai1Var.r(0);
                } else {
                    f7 = 1.0f;
                }
                int d10 = i0.a.d(f7, themedColor, themedColor2);
                int i15 = eh0Var.M;
                if (i15 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i15, getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                if (eh0Var.N != 0) {
                    canvas.drawRect(getWidth() - eh0Var.N, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.j6.l0(d10));
                }
                super.dispatchDraw(canvas);
                eh0Var.d0();
                gh.c cVar = eh0Var.S;
                int themedColor3 = eh0Var.getThemedColor(i13);
                int themedColor4 = eh0Var.getThemedColor(i14);
                ai1 ai1Var2 = eh0Var.f34843c;
                if (ai1Var2 != null) {
                    f10 = ai1Var2.r(0);
                }
                cVar.a(i0.a.d(f10, themedColor3, themedColor4));
                View view2 = eh0Var.H;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                k51 k51Var = (k51) this.f37488b;
                if (k51Var.f37956s > 0.0f && k51Var.f37954n != null) {
                    k51Var.f37955r.reset();
                    float width = getWidth() / k51Var.f37953f.getWidth();
                    k51Var.f37955r.postScale(width, width);
                    k51Var.h.setLocalMatrix(k51Var.f37955r);
                    k51Var.f37954n.setAlpha((int) (k51Var.f37956s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), k51Var.f37954n);
                }
                if (k51Var.W && (t1Var = k51Var.O) != null) {
                    t1Var.setVisibility(4);
                    k51Var.W = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                y51 y51Var = (y51) this.f37488b;
                ImageReceiver imageReceiver2 = y51Var.f36337b;
                Rect rect = y51Var.f36339e;
                j71 j71Var = y51Var.P;
                s61 s61Var = y51Var.f36336a;
                if (y51Var.f36341n != null && y51Var.f36342r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    y51Var.f36342r.setAlpha((int) (y51Var.I * 255.0f));
                    canvas.drawBitmap(y51Var.f36341n, 0.0f, 0.0f, y51Var.f36342r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (s61Var != null) {
                    Drawable drawable = s61Var.E;
                    if (drawable != null) {
                        if (y51Var.f36345x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(y51Var.I, j71Var.f37682m1, j71Var.f37670f1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(j71Var.f37680k1);
                        }
                        drawable.setAlpha((int) ((1.0f - y51Var.I) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f11 = s61Var.N;
                        if (f11 == 0.0f && s61Var.S <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(s61Var.S * 0.8f, f11)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f12 = 1.0f - ((1.0f - y51Var.I) * (1.0f - s61Var.O));
                        canvas.save();
                        if (f12 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f12, 0.0f, 0.0f);
                            canvas.skew((1.0f - f12) * (1.0f - ((s61Var.P * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (y51Var.I * AndroidUtilities.dp(45.0f)) + y51Var.F);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i16 = s61Var.P;
                        if (i16 == 0) {
                            rect2.offset(AndroidUtilities.dp(f12 * 8.0f), 0);
                        } else if (i16 == 1) {
                            rect2.offset(AndroidUtilities.dp(f12 * 4.0f), 0);
                        } else if (i16 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f12 * (-4.0f)), 0);
                        } else if (i16 == 7) {
                            rect2.offset(AndroidUtilities.dp(f12 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - y51Var.I) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (j71Var.f37655a0.getX() + j71Var.f37686o0.getX() + y51Var.f36346y), j71Var.f37655a0.getY() + ((int) j71Var.f37686o0.getY()) + y51Var.E);
                        j71Var.f37686o0.draw(canvas);
                        canvas.restore();
                    } else if (s61Var.f40349s && (imageReceiver = s61Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - y51Var.I);
                        s61Var.h.setImageCoords(rect);
                        s61Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(y51Var.I);
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
        switch (this.f37487a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    st stVar = (st) this.f37488b;
                    if (!stVar.f40567n && !stVar.K) {
                        stVar.n();
                        return true;
                    }
                    stVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f37487a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((k51) this.f37488b).dismiss();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r13, android.view.View r14, long r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.j0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f37487a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((yh0) this.f37488b).f43167q0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((y51) this.f37488b).f36337b;
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
        switch (this.f37487a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f37487a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((yh0) this.f37488b).f43167q0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((y51) this.f37488b).f36337b;
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
        switch (this.f37487a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f37488b).f24137f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((kq0) this.f37488b).f38132b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((br0) this.f37488b).f34910b.size(), new Object[0]));
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
        switch (this.f37487a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f37488b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.tv0[] tv0VarArr;
        int i14;
        Activity activity;
        switch (this.f37487a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                c5 c5Var = (c5) this.f37488b;
                c5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = w7.p.b((paddingTop - c5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                c5Var.f35023c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.wl.y(48.0f, (paddingTop - b10) - c5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) c5Var.f35023c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + y3;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.w1.C(8.0f, y3, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                f70 f70Var = (f70) this.f37488b;
                f70Var.g0();
                f70Var.h0();
                org.telegram.ui.Components.b20 b20Var = f70Var.f36314f;
                le.e eVar = f70Var.f36307b;
                b20Var.setTranslationY(eVar.f15403e);
                f70Var.i0();
                f70Var.f36312e.setTranslationY(AndroidUtilities.dp(48.0f) + eVar.f15403e);
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                w70 w70Var = (w70) this.f37488b;
                TextView textView = w70Var.f41810b;
                if (textView != null) {
                    int measuredWidth = ((w70Var.f41810b.getMeasuredWidth() / 2) + textView.getLeft()) - (w70Var.f41811c.getMeasuredWidth() / 2);
                    int top = (w70Var.f41812e.getTop() + ((w70Var.f41810b.getMeasuredHeight() - w70Var.f41811c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = w70Var.f41811c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, w70Var.f41811c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                l80 l80Var = (l80) this.f37488b;
                l80Var.Z();
                l80Var.b0();
                return;
            case 12:
                super.onLayout(z10, i10, i11, i12, i13);
                wg0 wg0Var = (wg0) this.f37488b;
                for (org.telegram.ui.Components.tv0 tv0Var : wg0Var.f42388b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!tv0Var.a() && wg0Var.f42390c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    tv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                eh0 eh0Var = (eh0) this.f37488b;
                eh0Var.i0();
                eh0Var.h0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37488b;
                WindowInsets windowInsets = secretMediaViewer.f34101g0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                ah.w wVar = secretMediaViewer.f34095e;
                wVar.layout(i14, 0, wVar.getMeasuredWidth() + i14, secretMediaViewer.f34095e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.K0 == null) {
                        secretMediaViewer.f34140y0 = 1.0f;
                        secretMediaViewer.f34135w0 = 0.0f;
                        secretMediaViewer.f34138x0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f34140y0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((k51) this.f37488b).d();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                y51 y51Var = (y51) this.f37488b;
                Context context = y51Var.getContext();
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
                    Bitmap bitmap = y51Var.f36341n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || y51Var.f36341n.getHeight() != decorView.getMeasuredHeight()) {
                        y51Var.f();
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
        org.telegram.ui.Components.tv0[] tv0VarArr;
        switch (this.f37487a) {
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
                f70 f70Var = (f70) this.f37488b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    f70Var.f36310c0 = AndroidUtilities.dp(56.0f);
                } else {
                    f70Var.f36310c0 = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(f70.c0(f70Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) f70Var.f36329s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + f70.d0(f70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) f70Var.f36312e.getLayoutParams()).topMargin = f70.V(f70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) f70Var.f36314f.getLayoutParams()).topMargin = f70.W(f70Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) f70Var.h.getLayoutParams()).topMargin = f70.X(f70Var).getMeasuredHeight();
                f70Var.h.getLayoutParams().height = f70Var.f36310c0;
                ((ViewGroup.MarginLayoutParams) f70Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + f70.Y(f70Var).getMeasuredHeight() + f70Var.f36310c0;
                f70Var.j0();
                super.onMeasure(i10, i11);
                return;
            case 9:
                l80 l80Var = (l80) this.f37488b;
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    l80Var.f38255x = AndroidUtilities.dp(56.0f);
                } else {
                    l80Var.f38255x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(l80.W(l80Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) l80Var.f38252r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + l80.X(l80Var).getMeasuredHeight();
                l80Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + l80Var.f38255x;
                l80Var.a0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, i11);
                fd0 fd0Var = ((id0) this.f37488b).f37361x;
                if (fd0Var != null) {
                    fd0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                wg0 wg0Var = (wg0) this.f37488b;
                for (org.telegram.ui.Components.tv0 tv0Var : wg0Var.f42388b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) tv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!tv0Var.a() && wg0Var.f42390c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    tv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                bq0 bq0Var = (bq0) this.f37488b;
                FrameLayout frameLayout = bq0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) bq0Var.L.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i10, i11);
                return;
            case 20:
                super.onMeasure(i10, i11);
                ProfileActivity.V0((ProfileActivity) this.f37488b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f37488b;
                WindowInsets windowInsets = secretMediaViewer.f34101g0;
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
                WindowInsets windowInsets2 = secretMediaViewer.f34101g0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f34095e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                wd1 wd1Var = (wd1) this.f37488b;
                measureChildWithMargins(wd1.t0(wd1Var), i10, 0, i11, 0);
                int measuredHeight2 = wd1.v0(wd1Var).getMeasuredHeight();
                if (wd1.w0(wd1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) wd1Var.f41980n0.getLayoutParams()).topMargin = measuredHeight2;
                wd1Var.f41980n0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(wd1Var.f41984p0, i10, 0, i11, 0);
                return;
            case 26:
                super.onMeasure(i10, i11);
                ((ViewGroup.MarginLayoutParams) ((hh1) this.f37488b).L.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f37487a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                st stVar = (st) this.f37488b;
                hh.d.c(stVar.f40572s, stVar.f40577y);
                stVar.f40573t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f37487a) {
            case 19:
                if (!((PopupNotificationActivity) this.f37488b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f37487a) {
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
        switch (this.f37487a) {
            case 20:
                super.setScaleX(f7);
                ProfileActivity.V0((ProfileActivity) this.f37488b);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f37487a) {
            case 4:
                super.setTranslationY(f7);
                ((ub) this.f37488b).f41045b0.invalidate();
                return;
            case 18:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.T8;
                ((PhotoViewer) this.f37488b).F1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f37487a) {
            case 3:
                l6 l6Var = (l6) this.f37488b;
                if (drawable != l6Var.f38224c && drawable != l6Var.f38223b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public j0(Object obj, Context context, int i10) {
        super(context);
        this.f37487a = i10;
        this.f37488b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
