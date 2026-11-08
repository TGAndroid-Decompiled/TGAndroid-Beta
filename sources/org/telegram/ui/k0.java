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
public final class k0 extends FrameLayout {
    public final int f47067a;
    public Object f47068b;

    public k0(int i7, Context context, Object obj) {
        super(context);
        this.f47067a = i7;
        this.f47068b = obj;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f47067a) {
            case 12:
                Typeface typeface = org.telegram.messenger.g0.f22535a;
                int childCount = getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    getChildAt(i7).dispatchApplyWindowInsets(windowInsets);
                }
                return windowInsets;
            default:
                return super.dispatchApplyWindowInsets(windowInsets);
        }
    }

    @Override
    public void dispatchDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k0.dispatchDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f47067a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ks ksVar = (ks) this.f47068b;
                    if (!ksVar.f47288n && !ksVar.K) {
                        ksVar.m();
                        return true;
                    }
                    ksVar.n();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f47067a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((rz0) this.f47068b).dismiss();
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
        switch (this.f47067a) {
            case 5:
                vd vdVar = (vd) this.f47068b;
                if (motionEvent.getActionMasked() == 0) {
                    vdVar.f50652x.X0.C0();
                    for (View view : vdVar.f50644b.getViewPages()) {
                        if (view instanceof td) {
                            ((td) view).f50027a.C0();
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
        switch (this.f47067a) {
            case 15:
                super.onAttachedToWindow();
                org.telegram.messenger.g0.i3(((cf0) this.f47068b).f44818q0, 500L);
                return;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((g01) this.f47068b).f47619b;
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
        switch (this.f47067a) {
            case 24:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f47067a) {
            case 15:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.r(((cf0) this.f47068b).f44818q0);
                return;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((g01) this.f47068b).f47619b;
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
        switch (this.f47067a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f47068b).f31517f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.id.G(((mm0) this.f47068b).f47835b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.id.G(((xm0) this.f47068b).f51905b.size(), "AccDescrSendPhotos", new Object[0]));
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
        switch (this.f47067a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 20:
                if (!((PopupNotificationActivity) this.f47068b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.wt0[] wt0VarArr;
        int i13;
        Activity activity;
        switch (this.f47067a) {
            case 2:
                int paddingLeft = ((i11 - i7) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.g0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.g0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.g0.L(48.0f);
                b5 b5Var = (b5) this.f47068b;
                b5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                int b10 = c8.j9.b((paddingTop - b5Var.d.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f), min2, min);
                b5Var.f44190c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y10 = org.telegram.messenger.camera.q.y(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) b5Var.f44190c.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f) + y10;
                layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.k5.C(8.0f, y10, b10);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 9:
                super.onLayout(z9, i7, i10, i11, i12);
                w40 w40Var = (w40) this.f47068b;
                w40Var.l0();
                w40Var.m0();
                org.telegram.ui.Components.s00 s00Var = w40Var.f50876f;
                te.c cVar = w40Var.f50869b;
                s00Var.setTranslationY(cVar.f55493f);
                w40Var.n0();
                w40Var.f50874e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar.f55493f);
                return;
            case 10:
                super.onLayout(z9, i7, i10, i11, i12);
                p50 p50Var = (p50) this.f47068b;
                TextView textView = p50Var.f48640b;
                if (textView != null) {
                    int measuredWidth = ((p50Var.f48640b.getMeasuredWidth() / 2) + textView.getLeft()) - (p50Var.f48641c.getMeasuredWidth() / 2);
                    int top = (p50Var.f48642e.getTop() + ((p50Var.f48640b.getMeasuredHeight() - p50Var.f48641c.getMeasuredHeight()) / 2)) - org.telegram.messenger.g0.L(16.0f);
                    TextView textView2 = p50Var.f48641c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, p50Var.f48641c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 13:
                super.onLayout(z9, i7, i10, i11, i12);
                ce0 ce0Var = (ce0) this.f47068b;
                for (org.telegram.ui.Components.wt0 wt0Var : ce0Var.f44763b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wt0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.g0.L(16.0f) + getHeight();
                    if (!wt0Var.a() && ce0Var.f44765c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.g0.L(230.0f);
                    }
                    wt0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 14:
                super.onLayout(z9, i7, i10, i11, i12);
                je0 je0Var = (je0) this.f47068b;
                je0Var.o0();
                je0Var.n0();
                je0Var.k0();
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47068b;
                WindowInsets windowInsets = secretMediaViewer.f41909e0;
                if (windowInsets != null) {
                    i13 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i13 = 0;
                }
                bi.x5 x5Var = secretMediaViewer.f41908e;
                x5Var.layout(i13, 0, x5Var.getMeasuredWidth() + i13, secretMediaViewer.f41908e.getMeasuredHeight());
                if (z9) {
                    if (secretMediaViewer.I0 == null) {
                        secretMediaViewer.f41946w0 = 1.0f;
                        secretMediaViewer.f41942u0 = 0.0f;
                        secretMediaViewer.f41944v0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.f41946w0);
                    return;
                }
                return;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                ((rz0) this.f47068b).d();
                return;
            case 24:
                super.onLayout(z9, i7, i10, i11, i12);
                g01 g01Var = (g01) this.f47068b;
                Context context = g01Var.getContext();
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
                    Bitmap bitmap = g01Var.f47623n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || g01Var.f47623n.getHeight() != decorView.getMeasuredHeight()) {
                        g01Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.wt0[] wt0VarArr;
        switch (this.f47067a) {
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), View.MeasureSpec.getSize(i10));
                return;
            case 7:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(171.0f), 1073741824));
                return;
            case 8:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(156.0f), 1073741824));
                return;
            case 9:
                w40 w40Var = (w40) this.f47068b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    w40Var.f50872c0 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    w40Var.f50872c0 = org.telegram.messenger.g0.L(144.0f);
                }
                measureChildWithMargins(w40.h0(w40Var), i7, 0, i10, 0);
                ((ViewGroup.MarginLayoutParams) w40Var.f50891s.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(48.0f) + w40.i0(w40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) w40Var.f50874e.getLayoutParams()).topMargin = w40.a0(w40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) w40Var.f50876f.getLayoutParams()).topMargin = w40.b0(w40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) w40Var.h.getLayoutParams()).topMargin = w40.c0(w40Var).getMeasuredHeight();
                w40Var.h.getLayoutParams().height = w40Var.f50872c0;
                ((ViewGroup.MarginLayoutParams) w40Var.d.getLayoutParams()).height = org.telegram.messenger.g0.L(53.0f) + w40.d0(w40Var).getMeasuredHeight() + w40Var.f50872c0;
                w40Var.o0();
                super.onMeasure(i7, i10);
                return;
            case 11:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                z50 z50Var = (z50) this.f47068b;
                if (!org.telegram.messenger.g0.Q1() && size4 <= size3) {
                    f10 = 78.0f;
                } else {
                    f10 = 144.0f;
                }
                z50Var.f52464x = org.telegram.messenger.g0.L(f10);
                super.onMeasure(i7, i10);
                return;
            case 13:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ce0 ce0Var = (ce0) this.f47068b;
                for (org.telegram.ui.Components.wt0 wt0Var : ce0Var.f44763b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) wt0Var.getLayoutParams();
                    int L = org.telegram.messenger.g0.L(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!wt0Var.a() && ce0Var.f44765c.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(230.0f);
                    }
                    wt0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 16:
                hm0 hm0Var = (hm0) this.f47068b;
                FrameLayout frameLayout = hm0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) hm0Var.L.getLayoutParams()).topMargin = org.telegram.messenger.g0.f22557m;
                }
                super.onMeasure(i7, i10);
                return;
            case 21:
                super.onMeasure(i7, i10);
                ProfileActivity.d1((ProfileActivity) this.f47068b);
                return;
            case 22:
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f47068b;
                WindowInsets windowInsets = secretMediaViewer.f41909e0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.g0.f22570y) {
                        int i11 = org.telegram.messenger.g0.f22563q.y;
                        if (size6 > i11) {
                            size6 = i11;
                        }
                        size6 += org.telegram.messenger.g0.f22557m;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i12 = org.telegram.messenger.g0.f22563q.y;
                    if (size6 > i12) {
                        size6 = i12;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f41909e0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f41908e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 26:
                int size7 = View.MeasureSpec.getSize(i7);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                v71 v71Var = (v71) this.f47068b;
                measureChildWithMargins(v71.x0(v71Var), i7, 0, i10, 0);
                int measuredHeight2 = v71.z0(v71Var).getMeasuredHeight();
                if (v71.A0(v71Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) v71Var.f50561o0.getLayoutParams()).topMargin = measuredHeight2;
                v71Var.f50561o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(v71Var.f50565q0, i7, 0, i10, 0);
                return;
            case 28:
                super.onMeasure(i7, i10);
                ((ViewGroup.MarginLayoutParams) ((za1) this.f47068b).L.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f22557m;
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f47067a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                ks ksVar = (ks) this.f47068b;
                ih.d.c(ksVar.f47293s, ksVar.f47298y);
                ksVar.f47294t.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f47067a) {
            case 20:
                if (!((PopupNotificationActivity) this.f47068b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z9) {
        switch (this.f47067a) {
            case 20:
                ((PopupNotificationActivity) getContext()).j(null);
                super.requestDisallowInterceptTouchEvent(z9);
                return;
            default:
                super.requestDisallowInterceptTouchEvent(z9);
                return;
        }
    }

    @Override
    public void setScaleX(float f10) {
        switch (this.f47067a) {
            case 21:
                super.setScaleX(f10);
                ProfileActivity.d1((ProfileActivity) this.f47068b);
                return;
            case 25:
                super.setScaleX(f10);
                ((m31) this.f47068b).p0();
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f47067a) {
            case 4:
                super.setTranslationY(f10);
                ((mb) this.f47068b).X.invalidate();
                return;
            case 19:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.Y8;
                ((PhotoViewer) this.f47068b).D1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f47067a) {
            case 3:
                l6 l6Var = (l6) this.f47068b;
                if (drawable != l6Var.f47453c && drawable != l6Var.f47452b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Context context, int i7) {
        super(context);
        this.f47067a = i7;
    }

    public k0(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f47067a = 29;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, c8.ha.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.r6.h(org.telegram.ui.ActionBar.k6.G6, 100), f6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.k5.m(textView, 17, null, 2131743859);
        linearLayout.addView(textView, c8.ha.t(-1, -2, 0, 16, 17, 17, 16));
        ug.p0 p0Var = new ug.p0(context, f6Var, false);
        this.f47068b = p0Var;
        String M0 = org.telegram.messenger.id.M0(2131743860, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.wp(0, context.getDrawable(2131232309)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) M0);
        p0Var.f56757f.setText(spannableStringBuilder);
        linearLayout.addView(p0Var, c8.ha.t(-1, 48, 0, 16, 0, 16, 16));
    }

    public k0(vy vyVar, Context context) {
        super(context);
        String M0;
        this.f47067a = 7;
        this.f47068b = vyVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232200);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(22.0f);
        int i7 = org.telegram.ui.ActionBar.k6.Ci;
        int i10 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.k6.d0(L, org.telegram.ui.ActionBar.k6.x0(null, i7, false));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.r6.k(imageView, d02, N, null, null);
        addView(imageView, c8.ha.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        lVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.V(lVar, i11, null);
        lVar.setGravity(1);
        lVar.setText(vyVar.e1(lVar));
        org.telegram.messenger.vo voVar = vyVar.Q1;
        if (voVar != null && voVar.f26081n) {
            i10 = 26;
        }
        lVar.f58844s = i10;
        addView(lVar, c8.ha.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (vyVar.R1.isEmpty()) {
            M0 = org.telegram.messenger.id.M0(2131750645, null);
        } else {
            M0 = org.telegram.messenger.id.M0(2131750646, null);
        }
        textView.setText(M0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, i11, null);
        addView(textView, c8.ha.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232096);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, c8.ha.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
