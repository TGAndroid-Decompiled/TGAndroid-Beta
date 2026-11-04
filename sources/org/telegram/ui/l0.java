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
import android.text.SpannableStringBuilder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.RadioButton;
public final class l0 extends FrameLayout {
    public final int f47059a;
    public Object f47060b;

    public l0(int i3, Context context, Object obj) {
        super(context);
        this.f47059a = i3;
        this.f47060b = obj;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f47059a) {
            case 12:
                Typeface typeface = org.telegram.messenger.g0.f22580a;
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    getChildAt(i3).dispatchApplyWindowInsets(windowInsets);
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
        switch (this.f47059a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    is isVar = (is) this.f47060b;
                    if (!isVar.f46398n && !isVar.K) {
                        isVar.m();
                        return true;
                    }
                    isVar.n();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f47059a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((iz0) this.f47060b).dismiss();
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
        switch (this.f47059a) {
            case 5:
                td tdVar = (td) this.f47060b;
                if (motionEvent.getActionMasked() == 0) {
                    tdVar.f49784x.Y0.C0();
                    for (View view : tdVar.f49776b.getViewPages()) {
                        if (view instanceof rd) {
                            ((rd) view).f49199a.C0();
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
        switch (this.f47059a) {
            case 15:
                super.onAttachedToWindow();
                org.telegram.messenger.g0.i3(((xe0) this.f47060b).f52006r0, 500L);
                return;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((wz0) this.f47060b).f44191b;
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
        switch (this.f47059a) {
            case 24:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f47059a) {
            case 15:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.r(((xe0) this.f47060b).f52006r0);
                return;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((wz0) this.f47060b).f44191b;
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
        switch (this.f47059a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f47060b).f31589f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(((hm0) this.f47060b).f45936b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.bd.G(((sm0) this.f47060b).f49540b.size(), "AccDescrSendPhotos", new Object[0]));
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
        switch (this.f47059a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 20:
                if (!((PopupNotificationActivity) this.f47060b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        org.telegram.ui.Components.vt0[] vt0VarArr;
        int i13;
        Activity activity;
        switch (this.f47059a) {
            case 2:
                int paddingLeft = ((i11 - i3) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.g0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.g0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.g0.L(48.0f);
                d5 d5Var = (d5) this.f47060b;
                d5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                int b10 = b8.be.b((paddingTop - d5Var.d.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f), min2, min);
                d5Var.f44553c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y9 = org.telegram.messenger.camera.q.y(48.0f, (paddingTop - b10) - d5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) d5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) d5Var.f44553c.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f) + y9;
                layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.C(8.0f, y9, b10);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 9:
                super.onLayout(z10, i3, i10, i11, i12);
                r40 r40Var = (r40) this.f47060b;
                r40Var.l0();
                r40Var.m0();
                org.telegram.ui.Components.n00 n00Var = r40Var.f49040f;
                qe.c cVar = r40Var.f49033b;
                n00Var.setTranslationY(cVar.f53846f);
                r40Var.n0();
                r40Var.f49038e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar.f53846f);
                return;
            case 10:
                super.onLayout(z10, i3, i10, i11, i12);
                j50 j50Var = (j50) this.f47060b;
                TextView textView = j50Var.f46499b;
                if (textView != null) {
                    int measuredWidth = ((j50Var.f46499b.getMeasuredWidth() / 2) + textView.getLeft()) - (j50Var.f46500c.getMeasuredWidth() / 2);
                    int top = (j50Var.f46501e.getTop() + ((j50Var.f46499b.getMeasuredHeight() - j50Var.f46500c.getMeasuredHeight()) / 2)) - org.telegram.messenger.g0.L(16.0f);
                    TextView textView2 = j50Var.f46500c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, j50Var.f46500c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 13:
                super.onLayout(z10, i3, i10, i11, i12);
                xd0 xd0Var = (xd0) this.f47060b;
                for (org.telegram.ui.Components.vt0 vt0Var : xd0Var.f51948b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vt0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.g0.L(16.0f) + getHeight();
                    if (!vt0Var.a() && xd0Var.f51950c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.g0.L(230.0f);
                    }
                    vt0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 14:
                super.onLayout(z10, i3, i10, i11, i12);
                ee0 ee0Var = (ee0) this.f47060b;
                ee0Var.o0();
                ee0Var.n0();
                ee0Var.k0();
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47060b;
                WindowInsets windowInsets = secretMediaViewer.f41940f0;
                if (windowInsets != null) {
                    i13 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i13 = 0;
                }
                ai.c0 c0Var = secretMediaViewer.f41936e;
                c0Var.layout(i13, 0, c0Var.getMeasuredWidth() + i13, secretMediaViewer.f41936e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.J0 == null) {
                        secretMediaViewer.f41977x0 = 1.0f;
                        secretMediaViewer.f41972v0 = 0.0f;
                        secretMediaViewer.f41975w0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.f41977x0);
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i3, i10, i11, i12);
                ((iz0) this.f47060b).d();
                return;
            case 24:
                super.onLayout(z10, i3, i10, i11, i12);
                wz0 wz0Var = (wz0) this.f47060b;
                Context context = wz0Var.getContext();
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
                    Bitmap bitmap = wz0Var.f44195n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || wz0Var.f44195n.getHeight() != decorView.getMeasuredHeight()) {
                        wz0Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        float f10;
        org.telegram.ui.Components.vt0[] vt0VarArr;
        switch (this.f47059a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(171.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(156.0f), 1073741824));
                return;
            case 9:
                r40 r40Var = (r40) this.f47060b;
                int size = View.MeasureSpec.getSize(i3);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    r40Var.f49037d0 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    r40Var.f49037d0 = org.telegram.messenger.g0.L(144.0f);
                }
                measureChildWithMargins(r40.h0(r40Var), i3, 0, i10, 0);
                ((ViewGroup.MarginLayoutParams) r40Var.f49055s.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(48.0f) + r40.i0(r40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) r40Var.f49038e.getLayoutParams()).topMargin = r40.a0(r40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) r40Var.f49040f.getLayoutParams()).topMargin = r40.b0(r40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) r40Var.h.getLayoutParams()).topMargin = r40.c0(r40Var).getMeasuredHeight();
                r40Var.h.getLayoutParams().height = r40Var.f49037d0;
                ((ViewGroup.MarginLayoutParams) r40Var.d.getLayoutParams()).height = org.telegram.messenger.g0.L(53.0f) + r40.d0(r40Var).getMeasuredHeight() + r40Var.f49037d0;
                r40Var.o0();
                super.onMeasure(i3, i10);
                return;
            case 11:
                int size3 = View.MeasureSpec.getSize(i3);
                int size4 = View.MeasureSpec.getSize(i10);
                t50 t50Var = (t50) this.f47060b;
                if (!org.telegram.messenger.g0.Q1() && size4 <= size3) {
                    f10 = 78.0f;
                } else {
                    f10 = 144.0f;
                }
                t50Var.f49709x = org.telegram.messenger.g0.L(f10);
                super.onMeasure(i3, i10);
                return;
            case 13:
                super.onMeasure(i3, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xd0 xd0Var = (xd0) this.f47060b;
                for (org.telegram.ui.Components.vt0 vt0Var : xd0Var.f51948b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vt0Var.getLayoutParams();
                    int L = org.telegram.messenger.g0.L(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!vt0Var.a() && xd0Var.f51950c.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(230.0f);
                    }
                    vt0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 16:
                cm0 cm0Var = (cm0) this.f47060b;
                FrameLayout frameLayout = cm0Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) cm0Var.M.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22602m;
                }
                super.onMeasure(i3, i10);
                return;
            case 21:
                super.onMeasure(i3, i10);
                ProfileActivity.d1((ProfileActivity) this.f47060b);
                return;
            case 22:
                int size5 = View.MeasureSpec.getSize(i3);
                int size6 = View.MeasureSpec.getSize(i10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47060b;
                WindowInsets windowInsets = secretMediaViewer.f41940f0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.g0.f22615y) {
                        int i11 = org.telegram.messenger.g0.f22608q.y;
                        if (size6 > i11) {
                            size6 = i11;
                        }
                        size6 += org.telegram.messenger.g0.f22602m;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i12 = org.telegram.messenger.g0.f22608q.y;
                    if (size6 > i12) {
                        size6 = i12;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f41940f0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f41936e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 26:
                int size7 = View.MeasureSpec.getSize(i3);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                l71 l71Var = (l71) this.f47060b;
                measureChildWithMargins(l71.x0(l71Var), i3, 0, i10, 0);
                int measuredHeight2 = l71.z0(l71Var).getMeasuredHeight();
                if (l71.A0(l71Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) l71Var.f47185p0.getLayoutParams()).topMargin = measuredHeight2;
                l71Var.f47185p0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(l71Var.f47190r0, i3, 0, i10, 0);
                return;
            case 28:
                super.onMeasure(i3, i10);
                ((ViewGroup.MarginLayoutParams) ((ra1) this.f47060b).M.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f22602m;
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        switch (this.f47059a) {
            case 6:
                super.onSizeChanged(i3, i10, i11, i12);
                is isVar = (is) this.f47060b;
                jh.d.c(isVar.f46403s, isVar.f46408y);
                isVar.f46404t.d();
                return;
            default:
                super.onSizeChanged(i3, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f47059a) {
            case 20:
                if (!((PopupNotificationActivity) this.f47060b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f47059a) {
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
    public void setScaleX(float f10) {
        switch (this.f47059a) {
            case 21:
                super.setScaleX(f10);
                ProfileActivity.d1((ProfileActivity) this.f47060b);
                return;
            case 25:
                super.setScaleX(f10);
                ((c31) this.f47060b).p0();
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f47059a) {
            case 4:
                super.setTranslationY(f10);
                ((kb) this.f47060b).Y.invalidate();
                return;
            case 19:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.V8;
                ((PhotoViewer) this.f47060b).I1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f47059a) {
            case 3:
                n6 n6Var = (n6) this.f47060b;
                if (drawable != n6Var.f47896c && drawable != n6Var.f47895b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Context context, int i3) {
        super(context);
        this.f47059a = i3;
    }

    public l0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f47059a = 29;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, b8.mf.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.G6, 100), e6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131743866);
        linearLayout.addView(textView, b8.mf.t(-1, -2, 0, 16, 17, 17, 16));
        vg.o0 o0Var = new vg.o0(context, e6Var, false);
        this.f47060b = o0Var;
        String M0 = org.telegram.messenger.bd.M0(2131743867, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.wp(0, context.getDrawable(2131232309)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        o0Var.f56763f.setText(spannableStringBuilder);
        linearLayout.addView(o0Var, b8.mf.t(-1, 48, 0, 16, 0, 16, 16));
    }

    public l0(sy syVar, Context context) {
        super(context);
        String M0;
        this.f47059a = 7;
        this.f47060b = syVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232200);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(22.0f);
        int i3 = org.telegram.ui.ActionBar.k6.Ci;
        int i10 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i3);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, null);
        addView(imageView, b8.mf.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        yh.l lVar = new yh.l(context);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        lVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(lVar, i11, null);
        lVar.setGravity(1);
        lVar.setText(syVar.e1(lVar));
        org.telegram.messenger.mo moVar = syVar.R1;
        if (moVar != null && moVar.f24248n) {
            i10 = 26;
        }
        lVar.f59561s = i10;
        addView(lVar, b8.mf.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (syVar.S1.isEmpty()) {
            M0 = org.telegram.messenger.bd.M0(2131750645, null);
        } else {
            M0 = org.telegram.messenger.bd.M0(2131750646, null);
        }
        textView.setText(M0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        addView(textView, b8.mf.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232096);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, b8.mf.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
