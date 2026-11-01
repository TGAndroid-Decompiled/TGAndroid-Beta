package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.RadioButton;
public final class l0 extends FrameLayout {
    public final int f39039a;
    public Object f39040b;

    public l0(Context context, int i10) {
        super(context);
        this.f39039a = i10;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39039a) {
            case 12:
                Typeface typeface = org.telegram.messenger.i0.f16145a;
                int childCount = getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    getChildAt(i10).dispatchApplyWindowInsets(windowInsets);
                }
                return windowInsets;
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f39039a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    kt ktVar = (kt) this.f39040b;
                    if (!ktVar.f38988n && !ktVar.K) {
                        ktVar.m();
                        return true;
                    }
                    ktVar.n();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39039a) {
            case 24:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((h11) this.f39040b).dismiss();
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
        switch (this.f39039a) {
            case 5:
                he heVar = (he) this.f39040b;
                if (motionEvent.getActionMasked() == 0) {
                    heVar.f37803x.X0.C0();
                    for (View view : heVar.f37796b.getViewPages()) {
                        if (view instanceof fe) {
                            ((fe) view).f37112a.C0();
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f39039a) {
            case 16:
                super.onAttachedToWindow();
                org.telegram.messenger.i0.h3(((ig0) this.f39040b).f38046q0, 500L);
                return;
            case 25:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((w11) this.f39040b).f36172b;
                if (imageReceiver != null) {
                    imageReceiver.P();
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
        switch (this.f39039a) {
            case 25:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39039a) {
            case 16:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.r(((ig0) this.f39040b).f38046q0);
                return;
            case 25:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((w11) this.f39040b).f36172b;
                if (imageReceiver != null) {
                    imageReceiver.R();
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
        switch (this.f39039a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39040b).f24162f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.dd.G(((wn0) this.f39040b).f43132b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 19:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.dd.G(((jo0) this.f39040b).f38484b.size(), "AccDescrSendPhotos", new Object[0]));
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
        switch (this.f39039a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 21:
                if (!((PopupNotificationActivity) this.f39040b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.av0[] av0VarArr;
        int i14;
        Activity activity;
        switch (this.f39039a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.i0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.i0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.i0.L(48.0f);
                a5 a5Var = (a5) this.f39040b;
                a5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                int b10 = w7.u.b((paddingTop - a5Var.d.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f), min2, min);
                a5Var.f35565c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.a30.y(48.0f, (paddingTop - b10) - a5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) a5Var.f35565c.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(8.0f) + y3;
                layoutParams.topMargin = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.C(8.0f, y3, b10);
                layoutParams.leftMargin = org.telegram.messenger.i0.L(4.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                u50 u50Var = (u50) this.f39040b;
                u50Var.l0();
                u50Var.m0();
                org.telegram.ui.Components.h10 h10Var = u50Var.f41808f;
                fe.f fVar = u50Var.f41802b;
                h10Var.setTranslationY(fVar.f7032f);
                u50Var.n0();
                u50Var.e.setTranslationY(org.telegram.messenger.i0.L(48.0f) + fVar.f7032f);
                return;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                m60 m60Var = (m60) this.f39040b;
                TextView textView = m60Var.f39441b;
                if (textView != null) {
                    int measuredWidth = ((m60Var.f39441b.getMeasuredWidth() / 2) + textView.getLeft()) - (m60Var.f39442c.getMeasuredWidth() / 2);
                    int top = (m60Var.e.getTop() + ((m60Var.f39441b.getMeasuredHeight() - m60Var.f39442c.getMeasuredHeight()) / 2)) - org.telegram.messenger.i0.L(16.0f);
                    TextView textView2 = m60Var.f39442c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, m60Var.f39442c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                gf0 gf0Var = (gf0) this.f39040b;
                for (org.telegram.ui.Components.av0 av0Var : gf0Var.f37473b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) av0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.i0.L(16.0f) + getHeight();
                    if (!av0Var.a() && gf0Var.f37475c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.i0.L(230.0f);
                    }
                    av0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                of0 of0Var = (of0) this.f39040b;
                of0Var.o0();
                of0Var.n0();
                of0Var.k0();
                return;
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39040b;
                WindowInsets windowInsets = secretMediaViewer.f33994e0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                fg.i iVar = secretMediaViewer.e;
                iVar.layout(i14, 0, iVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.I0 == null) {
                        secretMediaViewer.f34032w0 = 1.0f;
                        secretMediaViewer.f34028u0 = 0.0f;
                        secretMediaViewer.f34030v0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.f34032w0);
                    return;
                }
                return;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                ((h11) this.f39040b).d();
                return;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                w11 w11Var = (w11) this.f39040b;
                Context context = w11Var.getContext();
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
                    Bitmap bitmap = w11Var.f36175n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || w11Var.f36175n.getHeight() != decorView.getMeasuredHeight()) {
                        w11Var.f();
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
        org.telegram.ui.Components.av0[] av0VarArr;
        switch (this.f39039a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(171.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(156.0f), 1073741824));
                return;
            case 9:
                u50 u50Var = (u50) this.f39040b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!org.telegram.messenger.i0.Q1() && size2 <= size) {
                    u50Var.f41805c0 = org.telegram.messenger.i0.L(56.0f);
                } else {
                    u50Var.f41805c0 = org.telegram.messenger.i0.L(144.0f);
                }
                measureChildWithMargins(u50.h0(u50Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) u50Var.f41823s.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(48.0f) + u50.i0(u50Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) u50Var.e.getLayoutParams()).topMargin = u50.a0(u50Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) u50Var.f41808f.getLayoutParams()).topMargin = u50.b0(u50Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) u50Var.h.getLayoutParams()).topMargin = u50.c0(u50Var).getMeasuredHeight();
                u50Var.h.getLayoutParams().height = u50Var.f41805c0;
                ((ViewGroup.MarginLayoutParams) u50Var.d.getLayoutParams()).height = org.telegram.messenger.i0.L(53.0f) + u50.d0(u50Var).getMeasuredHeight() + u50Var.f41805c0;
                u50Var.o0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                x60 x60Var = (x60) this.f39040b;
                if (!org.telegram.messenger.i0.Q1() && size4 <= size3) {
                    f7 = 78.0f;
                } else {
                    f7 = 144.0f;
                }
                x60Var.f43272x = org.telegram.messenger.i0.L(f7);
                super.onMeasure(i10, i11);
                return;
            case 13:
                super.onMeasure(i10, i11);
                tb0 tb0Var = ((xb0) this.f39040b).f43328w;
                if (tb0Var != null) {
                    tb0Var.a();
                    return;
                }
                return;
            case 14:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gf0 gf0Var = (gf0) this.f39040b;
                for (org.telegram.ui.Components.av0 av0Var : gf0Var.f37473b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) av0Var.getLayoutParams();
                    int L = org.telegram.messenger.i0.L(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!av0Var.a() && gf0Var.f37475c.getVisibility() == 0) {
                        L += org.telegram.messenger.i0.L(230.0f);
                    }
                    av0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 17:
                rn0 rn0Var = (rn0) this.f39040b;
                FrameLayout frameLayout = rn0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) rn0Var.L.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16166m;
                }
                super.onMeasure(i10, i11);
                return;
            case 22:
                super.onMeasure(i10, i11);
                ProfileActivity.d1((ProfileActivity) this.f39040b);
                return;
            case 23:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39040b;
                WindowInsets windowInsets = secretMediaViewer.f33994e0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.i0.f16179y) {
                        int i12 = org.telegram.messenger.i0.f16172q.y;
                        if (size6 > i12) {
                            size6 = i12;
                        }
                        size6 += org.telegram.messenger.i0.f16166m;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = org.telegram.messenger.i0.f16172q.y;
                    if (size6 > i13) {
                        size6 = i13;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f33994e0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 25:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 27:
                int size7 = View.MeasureSpec.getSize(i10);
                int size8 = View.MeasureSpec.getSize(i11);
                setMeasuredDimension(size7, size8);
                k91 k91Var = (k91) this.f39040b;
                measureChildWithMargins(k91.x0(k91Var), i10, 0, i11, 0);
                int measuredHeight2 = k91.z0(k91Var).getMeasuredHeight();
                if (k91.A0(k91Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) k91Var.f38753o0.getLayoutParams()).topMargin = measuredHeight2;
                k91Var.f38753o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(k91Var.f38757q0, i10, 0, i11, 0);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39039a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                kt ktVar = (kt) this.f39040b;
                yg.d.c(ktVar.f38993s, ktVar.f38998y);
                ktVar.f38994t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39039a) {
            case 21:
                if (!((PopupNotificationActivity) this.f39040b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39039a) {
            case 21:
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
        switch (this.f39039a) {
            case 22:
                super.setScaleX(f7);
                ProfileActivity.d1((ProfileActivity) this.f39040b);
                return;
            case 26:
                super.setScaleX(f7);
                ((c51) this.f39040b).p0();
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39039a) {
            case 4:
                super.setTranslationY(f7);
                ((sb) this.f39040b).X.invalidate();
                return;
            case 20:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39040b).I1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39039a) {
            case 3:
                m6 m6Var = (m6) this.f39040b;
                if (drawable != m6Var.f39439c && drawable != m6Var.f39438b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f39039a = i10;
        this.f39040b = obj;
    }

    public l0(vz vzVar, Context context) {
        super(context);
        String L0;
        this.f39039a = 7;
        this.f39040b = vzVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232199);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(22.0f);
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        int i11 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(L, org.telegram.ui.ActionBar.t6.x0(null, i10, false));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i10);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.a7.k(imageView, d02, N, null, null);
        addView(imageView, w7.b6.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        nh.p pVar = new nh.p(context);
        pVar.setTypeface(org.telegram.messenger.i0.o());
        pVar.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.t6.f21038j5;
        org.telegram.ui.ActionBar.a7.V(pVar, i12, null);
        pVar.setGravity(1);
        pVar.setText(vzVar.e1(pVar));
        org.telegram.messenger.bp bpVar = vzVar.Q1;
        if (bpVar != null && bpVar.f15010n) {
            i11 = 26;
        }
        pVar.f13894s = i11;
        addView(pVar, w7.b6.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (vzVar.R1.isEmpty()) {
            L0 = org.telegram.messenger.dd.L0(2131750645, null);
        } else {
            L0 = org.telegram.messenger.dd.L0(2131750646, null);
        }
        textView.setText(L0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, i12, null);
        addView(textView, w7.b6.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232095);
        org.telegram.ui.ActionBar.a7.t(imageView2, org.telegram.ui.ActionBar.t6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, w7.b6.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
