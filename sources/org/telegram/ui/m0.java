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
    public final int f40271a;
    public Object f40272b;

    public m0(Context context) {
        super(context);
        this.f40271a = 1;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f40271a) {
            case 10:
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.Components.m71 m71Var;
        int[] iArr;
        float f10;
        org.telegram.ui.Cells.t1 t1Var;
        ImageReceiver imageReceiver;
        float max;
        switch (this.f40271a) {
            case 3:
                int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                j6 j6Var = (j6) this.f40272b;
                int d = ((measuredWidth - ((int) j6Var.f39382c.d())) + ((int) j6Var.f39381b.d())) / 2;
                if (LocaleController.isRTL) {
                    super.dispatchDraw(canvas);
                    return;
                }
                j6Var.f39381b.setBounds(0, 0, d, getHeight());
                j6Var.f39381b.draw(canvas);
                j6Var.f39382c.setBounds(AndroidUtilities.dp(8.0f) + d, 0, getWidth(), getHeight());
                j6Var.f39382c.draw(canvas);
                return;
            case 6:
                super.dispatchDraw(canvas);
                ou ouVar = (ou) this.f40272b;
                if (ouVar.getParentLayout() != null && (m71Var = ouVar.f41244b) != null) {
                    float measuredHeight = m71Var.getMeasuredHeight();
                    canvas.drawLine(0.0f, measuredHeight, getWidth(), measuredHeight, org.telegram.ui.ActionBar.f6.f23121k0);
                    return;
                }
                return;
            case 7:
                k60 k60Var = (k60) this.f40272b;
                ig.e eVar = k60Var.f39741l0;
                ng.d dVar = k60Var.m0;
                if (Build.VERSION.SDK_INT >= 31 && eVar != null) {
                    k60Var.d0();
                    int measuredWidth2 = getMeasuredWidth();
                    int measuredHeight2 = getMeasuredHeight();
                    if (dVar != null && !dVar.f18606n && dVar.e(measuredWidth2, measuredHeight2)) {
                        eVar.b(dVar.a(measuredWidth2, measuredHeight2), -3);
                        dVar.b();
                    }
                }
                super.dispatchDraw(canvas);
                AndroidUtilities.drawNavigationBarProtection(canvas, this, k60Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6), k60Var.f39738i0);
                return;
            case 9:
                q70 q70Var = (q70) this.f40272b;
                ig.e eVar2 = q70Var.H;
                ng.d dVar2 = q70Var.I;
                if (Build.VERSION.SDK_INT >= 31 && eVar2 != null) {
                    q70Var.X();
                    int measuredWidth3 = getMeasuredWidth();
                    int measuredHeight3 = getMeasuredHeight();
                    if (dVar2 != null && !dVar2.f18606n && dVar2.e(measuredWidth3, measuredHeight3)) {
                        eVar2.b(dVar2.a(measuredWidth3, measuredHeight3), -3);
                        dVar2.b();
                    }
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                LaunchActivity launchActivity = (LaunchActivity) this.f40272b;
                View view = launchActivity.C0;
                if (view != null && view.getBackground() != null) {
                    if (launchActivity.f35533t1 == null) {
                        launchActivity.f35533t1 = new int[2];
                    }
                    launchActivity.C0.getLocationInWindow(launchActivity.f35533t1);
                    int[] iArr2 = launchActivity.f35533t1;
                    int i9 = iArr2[0];
                    int i10 = iArr2[1];
                    getLocationInWindow(iArr2);
                    int i11 = i10 - launchActivity.f35533t1[1];
                    canvas.save();
                    canvas.translate(i9 - iArr[0], i11);
                    launchActivity.C0.getBackground().draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                ng0 ng0Var = (ng0) this.f40272b;
                ng0Var.getClass();
                int i12 = org.telegram.ui.ActionBar.f6.f22947a7;
                int themedColor = ng0Var.getThemedColor(i12);
                int i13 = org.telegram.ui.ActionBar.f6.f23001d6;
                int themedColor2 = ng0Var.getThemedColor(i13);
                sg1 sg1Var = ng0Var.f42999c;
                float f11 = 1.0f;
                if (sg1Var != null) {
                    f10 = sg1Var.r(0);
                } else {
                    f10 = 1.0f;
                }
                int d9 = i0.a.d(f10, themedColor, themedColor2);
                int i14 = ng0Var.I;
                if (i14 != 0) {
                    canvas.drawRect(0.0f, 0.0f, i14, getHeight(), org.telegram.ui.ActionBar.f6.l0(d9));
                }
                if (ng0Var.J != 0) {
                    canvas.drawRect(getWidth() - ng0Var.J, 0.0f, getWidth(), getHeight(), org.telegram.ui.ActionBar.f6.l0(d9));
                }
                super.dispatchDraw(canvas);
                ng0Var.c0();
                ng.c cVar = ng0Var.O;
                int themedColor3 = ng0Var.getThemedColor(i12);
                int themedColor4 = ng0Var.getThemedColor(i13);
                sg1 sg1Var2 = ng0Var.f42999c;
                if (sg1Var2 != null) {
                    f11 = sg1Var2.r(0);
                }
                cVar.a(i0.a.d(f11, themedColor3, themedColor4));
                View view2 = ng0Var.D;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 22:
                d41 d41Var = (d41) this.f40272b;
                if (d41Var.f37411s > 0.0f && d41Var.f37409n != null) {
                    d41Var.f37410r.reset();
                    float width = getWidth() / d41Var.f37408f.getWidth();
                    d41Var.f37410r.postScale(width, width);
                    d41Var.h.setLocalMatrix(d41Var.f37410r);
                    d41Var.f37409n.setAlpha((int) (d41Var.f37411s * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), d41Var.f37409n);
                }
                if (d41Var.S && (t1Var = d41Var.K) != null) {
                    t1Var.setVisibility(4);
                    d41Var.S = false;
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                q41 q41Var = (q41) this.f40272b;
                ImageReceiver imageReceiver2 = q41Var.f44368b;
                Rect rect = q41Var.f44370e;
                b61 b61Var = q41Var.L;
                k51 k51Var = q41Var.f44367a;
                if (q41Var.f44372n != null && q41Var.f44373r != null) {
                    canvas.save();
                    canvas.scale(12.0f, 12.0f);
                    q41Var.f44373r.setAlpha((int) (q41Var.E * 255.0f));
                    canvas.drawBitmap(q41Var.f44372n, 0.0f, 0.0f, q41Var.f44373r);
                    canvas.restore();
                }
                super.dispatchDraw(canvas);
                if (k51Var != null) {
                    Drawable drawable = k51Var.A;
                    if (drawable != null) {
                        if (q41Var.f44376x) {
                            drawable.setColorFilter(new PorterDuffColorFilter(i0.a.d(q41Var.E, b61Var.f36682i1, b61Var.f36665b1), PorterDuff.Mode.MULTIPLY));
                        } else {
                            drawable.setColorFilter(b61Var.f36678g1);
                        }
                        drawable.setAlpha((int) ((1.0f - q41Var.E) * 255.0f));
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(rect);
                        float f12 = k51Var.J;
                        if (f12 == 0.0f && k51Var.O <= 0.0f) {
                            max = 1.0f;
                        } else {
                            max = (((1.0f - Math.max(k51Var.O * 0.8f, f12)) * 0.2f) + 0.8f) * 1.0f;
                        }
                        Rect rect2 = AndroidUtilities.rectTmp2;
                        rect2.set((int) (rectF.centerX() - ((rectF.width() / 2.0f) * max)), (int) (rectF.centerY() - ((rectF.height() / 2.0f) * max)), (int) (((rectF.width() / 2.0f) * max) + rectF.centerX()), (int) (((rectF.height() / 2.0f) * max) + rectF.centerY()));
                        float f13 = 1.0f - ((1.0f - q41Var.E) * (1.0f - k51Var.K));
                        canvas.save();
                        if (f13 < 1.0f) {
                            canvas.translate(rect2.left, rect2.top);
                            canvas.scale(1.0f, f13, 0.0f, 0.0f);
                            canvas.skew((1.0f - f13) * (1.0f - ((k51Var.L * 2.0f) / 8.0f)), 0.0f);
                            canvas.translate(-rect2.left, -rect2.top);
                        }
                        canvas.clipRect(0.0f, 0.0f, getWidth(), (q41Var.E * AndroidUtilities.dp(45.0f)) + q41Var.B);
                        drawable.setBounds(rect2);
                        drawable.draw(canvas);
                        canvas.restore();
                        int i15 = k51Var.L;
                        if (i15 == 0) {
                            rect2.offset(AndroidUtilities.dp(f13 * 8.0f), 0);
                        } else if (i15 == 1) {
                            rect2.offset(AndroidUtilities.dp(f13 * 4.0f), 0);
                        } else if (i15 == 6) {
                            rect2.offset(-AndroidUtilities.dp(f13 * (-4.0f)), 0);
                        } else if (i15 == 7) {
                            rect2.offset(AndroidUtilities.dp(f13 * (-8.0f)), 0);
                        }
                        canvas.saveLayerAlpha(rect2.left, rect2.top, rect2.right, rect2.bottom, (int) ((1.0f - q41Var.E) * 255.0f), 31);
                        canvas.clipRect(rect2);
                        canvas.translate((int) (b61Var.T.getX() + b61Var.f36685k0.getX() + q41Var.f44377y), b61Var.T.getY() + ((int) b61Var.f36685k0.getY()) + q41Var.A);
                        b61Var.f36685k0.draw(canvas);
                        canvas.restore();
                    } else if (k51Var.f39717s && (imageReceiver = k51Var.h) != null) {
                        imageReceiver.setAlpha(1.0f - q41Var.E);
                        k51Var.h.setImageCoords(rect);
                        k51Var.h.draw(canvas);
                    }
                }
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(q41Var.E);
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
        switch (this.f40271a) {
            case 5:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ht htVar = (ht) this.f40272b;
                    if (!htVar.f38925n && !htVar.K) {
                        htVar.n();
                        return true;
                    }
                    htVar.o();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f40271a) {
            case 22:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((d41) this.f40272b).dismiss();
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
        switch (this.f40271a) {
            case 14:
                super.onAttachedToWindow();
                AndroidUtilities.runOnUIThread(((hh0) this.f40272b).m0, 500L);
                return;
            case 23:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((q41) this.f40272b).f44368b;
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
        switch (this.f40271a) {
            case 23:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f40271a) {
            case 14:
                super.onDetachedFromWindow();
                AndroidUtilities.cancelRunOnUIThread(((hh0) this.f40272b).m0);
                return;
            case 23:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((q41) this.f40272b).f44368b;
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
        switch (this.f40271a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f40272b).f26508f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 16:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((ip0) this.f40272b).f39240b.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrSendPhotos", ((zp0) this.f40272b).f45208b.size(), new Object[0]));
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
        switch (this.f40271a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 19:
                if (!((PopupNotificationActivity) this.f40272b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        org.telegram.ui.Components.cv0[] cv0VarArr;
        int i13;
        Activity activity;
        switch (this.f40271a) {
            case 2:
                int paddingLeft = ((i11 - i9) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - AndroidUtilities.dp(24.0f);
                int min2 = Math.min(AndroidUtilities.dp(60.0f), min);
                int dp = (paddingTop - min2) - AndroidUtilities.dp(48.0f);
                b5 b5Var = (b5) this.f40272b;
                b5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(dp, Integer.MIN_VALUE));
                int b10 = g7.n.b((paddingTop - b5Var.d.getMeasuredHeight()) - AndroidUtilities.dp(48.0f), min2, min);
                b5Var.f36636c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y10 = org.telegram.messenger.ll.y(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) b5Var.f36636c.getLayoutParams()).topMargin = AndroidUtilities.dp(8.0f) + y10;
                layoutParams.topMargin = AndroidUtilities.dp(4.0f) + org.telegram.messenger.l0.C(8.0f, y10, b10);
                layoutParams.leftMargin = AndroidUtilities.dp(4.0f);
                layoutParams.rightMargin = AndroidUtilities.dp(4.0f);
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 7:
                super.onLayout(z10, i9, i10, i11, i12);
                k60 k60Var = (k60) this.f40272b;
                k60Var.f0();
                k60Var.g0();
                org.telegram.ui.Components.m10 m10Var = k60Var.f39734f;
                td.c cVar = k60Var.f39727b;
                m10Var.setTranslationY(cVar.f47780e);
                k60Var.h0();
                k60Var.f39732e.setTranslationY(AndroidUtilities.dp(48.0f) + cVar.f47780e);
                return;
            case 8:
                super.onLayout(z10, i9, i10, i11, i12);
                b70 b70Var = (b70) this.f40272b;
                TextView textView = b70Var.f36725b;
                if (textView != null) {
                    int measuredWidth = ((b70Var.f36725b.getMeasuredWidth() / 2) + textView.getLeft()) - (b70Var.f36726c.getMeasuredWidth() / 2);
                    int top = (b70Var.f36727e.getTop() + ((b70Var.f36725b.getMeasuredHeight() - b70Var.f36726c.getMeasuredHeight()) / 2)) - AndroidUtilities.dp(16.0f);
                    TextView textView2 = b70Var.f36726c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, b70Var.f36726c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i9, i10, i11, i12);
                q70 q70Var = (q70) this.f40272b;
                q70Var.Y();
                q70Var.a0();
                return;
            case 12:
                super.onLayout(z10, i9, i10, i11, i12);
                fg0 fg0Var = (fg0) this.f40272b;
                for (org.telegram.ui.Components.cv0 cv0Var : fg0Var.f38261b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cv0Var.getLayoutParams();
                    int dp2 = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!cv0Var.a() && fg0Var.f38263c.getVisibility() == 0) {
                        dp2 += AndroidUtilities.dp(230.0f);
                    }
                    cv0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, dp2);
                }
                return;
            case 13:
                super.onLayout(z10, i9, i10, i11, i12);
                ng0 ng0Var = (ng0) this.f40272b;
                ng0Var.h0();
                ng0Var.g0();
                return;
            case 21:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40272b;
                WindowInsets windowInsets = secretMediaViewer.f36123c0;
                if (windowInsets != null) {
                    i13 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i13 = 0;
                }
                fh.v vVar = secretMediaViewer.f36127e;
                vVar.layout(i13, 0, vVar.getMeasuredWidth() + i13, secretMediaViewer.f36127e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.G0 == null) {
                        secretMediaViewer.f36161u0 = 1.0f;
                        secretMediaViewer.f36158s0 = 0.0f;
                        secretMediaViewer.f36160t0 = 0.0f;
                    }
                    secretMediaViewer.n(secretMediaViewer.f36161u0);
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i9, i10, i11, i12);
                ((d41) this.f40272b).d();
                return;
            case 23:
                super.onLayout(z10, i9, i10, i11, i12);
                q41 q41Var = (q41) this.f40272b;
                Context context = q41Var.getContext();
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
                    Bitmap bitmap = q41Var.f44372n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || q41Var.f44372n.getHeight() != decorView.getMeasuredHeight()) {
                        q41Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        org.telegram.ui.Components.cv0[] cv0VarArr;
        switch (this.f40271a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
                return;
            case 6:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 7:
                k60 k60Var = (k60) this.f40272b;
                int size = View.MeasureSpec.getSize(i9);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!AndroidUtilities.isTablet() && size2 <= size) {
                    k60Var.Y = AndroidUtilities.dp(56.0f);
                } else {
                    k60Var.Y = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(k60.b0(k60Var), i9, 0, i10, 0);
                ((ViewGroup.MarginLayoutParams) k60Var.f39748s.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + k60.c0(k60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) k60Var.f39732e.getLayoutParams()).topMargin = k60.U(k60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) k60Var.f39734f.getLayoutParams()).topMargin = k60.V(k60Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) k60Var.h.getLayoutParams()).topMargin = k60.W(k60Var).getMeasuredHeight();
                k60Var.h.getLayoutParams().height = k60Var.Y;
                ((ViewGroup.MarginLayoutParams) k60Var.d.getLayoutParams()).height = AndroidUtilities.dp(53.0f) + k60.X(k60Var).getMeasuredHeight() + k60Var.Y;
                k60Var.i0();
                super.onMeasure(i9, i10);
                return;
            case 9:
                q70 q70Var = (q70) this.f40272b;
                int size3 = View.MeasureSpec.getSize(i9);
                int size4 = View.MeasureSpec.getSize(i10);
                if (!AndroidUtilities.isTablet() && size4 <= size3) {
                    q70Var.f41709x = AndroidUtilities.dp(56.0f);
                } else {
                    q70Var.f41709x = AndroidUtilities.dp(144.0f);
                }
                measureChildWithMargins(q70.V(q70Var), i9, 0, i10, 0);
                ((ViewGroup.MarginLayoutParams) q70Var.f41706r.getLayoutParams()).topMargin = AndroidUtilities.dp(48.0f) + q70.W(q70Var).getMeasuredHeight();
                q70Var.d.getLayoutParams().height = AndroidUtilities.dp(18.0f) + q70Var.f41709x;
                q70Var.Z();
                super.onMeasure(i9, i10);
                return;
            case 11:
                super.onMeasure(i9, i10);
                mc0 mc0Var = ((pc0) this.f40272b).f41472x;
                if (mc0Var != null) {
                    mc0Var.a();
                    return;
                }
                return;
            case 12:
                super.onMeasure(i9, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                fg0 fg0Var = (fg0) this.f40272b;
                for (org.telegram.ui.Components.cv0 cv0Var : fg0Var.f38261b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) cv0Var.getLayoutParams();
                    int dp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!cv0Var.a() && fg0Var.f38263c.getVisibility() == 0) {
                        dp += AndroidUtilities.dp(230.0f);
                    }
                    cv0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(dp, 1073741824));
                }
                return;
            case 15:
                zo0 zo0Var = (zo0) this.f40272b;
                FrameLayout frameLayout = zo0Var.C;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) zo0Var.C.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight;
                }
                super.onMeasure(i9, i10);
                return;
            case 20:
                super.onMeasure(i9, i10);
                ProfileActivity.V0((ProfileActivity) this.f40272b);
                return;
            case 21:
                int size5 = View.MeasureSpec.getSize(i9);
                int size6 = View.MeasureSpec.getSize(i10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f40272b;
                WindowInsets windowInsets = secretMediaViewer.f36123c0;
                if (windowInsets != null) {
                    if (AndroidUtilities.incorrectDisplaySizeFix) {
                        int i11 = AndroidUtilities.displaySize.y;
                        if (size6 > i11) {
                            size6 = i11;
                        }
                        size6 += AndroidUtilities.statusBarHeight;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i12 = AndroidUtilities.displaySize.y;
                    if (size6 > i12) {
                        size6 = i12;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f36123c0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f36127e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 23:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 24:
                int size7 = View.MeasureSpec.getSize(i9);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                oc1 oc1Var = (oc1) this.f40272b;
                measureChildWithMargins(oc1.s0(oc1Var), i9, 0, i10, 0);
                int measuredHeight2 = oc1.u0(oc1Var).getMeasuredHeight();
                if (oc1.v0(oc1Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) oc1Var.f41084j0.getLayoutParams()).topMargin = measuredHeight2;
                oc1Var.f41084j0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(oc1Var.f41088l0, i9, 0, i10, 0);
                return;
            case 26:
                super.onMeasure(i9, i10);
                ((ViewGroup.MarginLayoutParams) ((ag1) this.f40272b).H.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + AndroidUtilities.statusBarHeight;
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f40271a) {
            case 5:
                super.onSizeChanged(i9, i10, i11, i12);
                ht htVar = (ht) this.f40272b;
                og.d.c(htVar.f38930s, htVar.f38935y);
                htVar.f38931t.d();
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f40271a) {
            case 19:
                if (!((PopupNotificationActivity) this.f40272b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f40271a) {
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
    public void setScaleX(float f10) {
        switch (this.f40271a) {
            case 20:
                super.setScaleX(f10);
                ProfileActivity.V0((ProfileActivity) this.f40272b);
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f40271a) {
            case 4:
                super.setTranslationY(f10);
                ((pb) this.f40272b).X.invalidate();
                return;
            case 18:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.P8;
                ((PhotoViewer) this.f40272b).F1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f40271a) {
            case 3:
                j6 j6Var = (j6) this.f40272b;
                if (drawable != j6Var.f39382c && drawable != j6Var.f39381b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m0(Object obj, Context context, int i9) {
        super(context);
        this.f40271a = i9;
        this.f40272b = obj;
    }

    private final void a(Configuration configuration) {
    }
}
