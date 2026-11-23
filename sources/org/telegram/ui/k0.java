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
    public final int f49118a;
    public Object f49119b;

    public k0(int i7, Context context, Object obj) {
        super(context);
        this.f49118a = i7;
        this.f49119b = obj;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f49118a) {
            case 12:
                Typeface typeface = org.telegram.messenger.g0.f23982a;
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
        switch (this.f49118a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ns nsVar = (ns) this.f49119b;
                    if (!nsVar.f50304n && !nsVar.K) {
                        nsVar.m();
                        return true;
                    }
                    nsVar.n();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f49118a) {
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((tz0) this.f49119b).dismiss();
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
        switch (this.f49118a) {
            case 5:
                td tdVar = (td) this.f49119b;
                if (motionEvent.getActionMasked() == 0) {
                    tdVar.f52261x.Y0.C0();
                    for (View view : tdVar.f52253b.getViewPages()) {
                        if (view instanceof rd) {
                            ((rd) view).f51588a.C0();
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
        switch (this.f49118a) {
            case 15:
                super.onAttachedToWindow();
                org.telegram.messenger.g0.h3(((ff0) this.f49119b).f47679r0, 500L);
                return;
            case 24:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((h01) this.f49119b).f50048b;
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
        switch (this.f49118a) {
            case 24:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f49118a) {
            case 15:
                super.onDetachedFromWindow();
                org.telegram.messenger.g0.r(((ff0) this.f49119b).f47679r0);
                return;
            case 24:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((h01) this.f49119b).f50048b;
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
        switch (this.f49118a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f49119b).f33095f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 17:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(((qm0) this.f49119b).f51237b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.hd.G(((cn0) this.f49119b).f46581b.size(), "AccDescrSendPhotos", new Object[0]));
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
        switch (this.f49118a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 20:
                if (!((PopupNotificationActivity) this.f49119b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        org.telegram.ui.Components.iu0[] iu0VarArr;
        int i13;
        Activity activity;
        switch (this.f49118a) {
            case 2:
                int paddingLeft = ((i11 - i7) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.g0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.g0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.g0.L(48.0f);
                b5 b5Var = (b5) this.f49119b;
                b5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                int b10 = c8.m9.b((paddingTop - b5Var.d.getMeasuredHeight()) - org.telegram.messenger.g0.L(48.0f), min2, min);
                b5Var.f45732c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int z11 = org.telegram.messenger.o10.z(48.0f, (paddingTop - b10) - b5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) b5Var.f45732c.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(8.0f) + z11;
                layoutParams.topMargin = org.telegram.messenger.g0.L(4.0f) + org.telegram.messenger.f3.C(8.0f, z11, b10);
                layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f);
                layoutParams.rightMargin = org.telegram.messenger.g0.L(4.0f);
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 9:
                super.onLayout(z10, i7, i10, i11, i12);
                z40 z40Var = (z40) this.f49119b;
                z40Var.l0();
                z40Var.m0();
                org.telegram.ui.Components.e10 e10Var = z40Var.f54376f;
                te.c cVar = z40Var.f54369b;
                e10Var.setTranslationY(cVar.f57671f);
                z40Var.n0();
                z40Var.f54374e.setTranslationY(org.telegram.messenger.g0.L(48.0f) + cVar.f57671f);
                return;
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                q50 q50Var = (q50) this.f49119b;
                TextView textView = q50Var.f51005b;
                if (textView != null) {
                    int measuredWidth = ((q50Var.f51005b.getMeasuredWidth() / 2) + textView.getLeft()) - (q50Var.f51006c.getMeasuredWidth() / 2);
                    int top = (q50Var.f51007e.getTop() + ((q50Var.f51005b.getMeasuredHeight() - q50Var.f51006c.getMeasuredHeight()) / 2)) - org.telegram.messenger.g0.L(16.0f);
                    TextView textView2 = q50Var.f51006c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, q50Var.f51006c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 13:
                super.onLayout(z10, i7, i10, i11, i12);
                de0 de0Var = (de0) this.f49119b;
                for (org.telegram.ui.Components.iu0 iu0Var : de0Var.f46888b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iu0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.g0.L(16.0f) + getHeight();
                    if (!iu0Var.a() && de0Var.f46890c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.g0.L(230.0f);
                    }
                    iu0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 14:
                super.onLayout(z10, i7, i10, i11, i12);
                le0 le0Var = (le0) this.f49119b;
                le0Var.o0();
                le0Var.n0();
                le0Var.k0();
                return;
            case 22:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f49119b;
                WindowInsets windowInsets = secretMediaViewer.f43739f0;
                if (windowInsets != null) {
                    i13 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i13 = 0;
                }
                ai.g0 g0Var = secretMediaViewer.f43735e;
                g0Var.layout(i13, 0, g0Var.getMeasuredWidth() + i13, secretMediaViewer.f43735e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.J0 == null) {
                        secretMediaViewer.f43776x0 = 1.0f;
                        secretMediaViewer.f43771v0 = 0.0f;
                        secretMediaViewer.f43774w0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.f43776x0);
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                ((tz0) this.f49119b).d();
                return;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                h01 h01Var = (h01) this.f49119b;
                Context context = h01Var.getContext();
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
                    Bitmap bitmap = h01Var.f50052n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || h01Var.f50052n.getHeight() != decorView.getMeasuredHeight()) {
                        h01Var.f();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        float f10;
        org.telegram.ui.Components.iu0[] iu0VarArr;
        switch (this.f49118a) {
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
                z40 z40Var = (z40) this.f49119b;
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i10);
                if (!org.telegram.messenger.g0.Q1() && size2 <= size) {
                    z40Var.f54373d0 = org.telegram.messenger.g0.L(56.0f);
                } else {
                    z40Var.f54373d0 = org.telegram.messenger.g0.L(144.0f);
                }
                measureChildWithMargins(z40.h0(z40Var), i7, 0, i10, 0);
                ((ViewGroup.MarginLayoutParams) z40Var.f54391s.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(48.0f) + z40.i0(z40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z40Var.f54374e.getLayoutParams()).topMargin = z40.a0(z40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z40Var.f54376f.getLayoutParams()).topMargin = z40.b0(z40Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) z40Var.h.getLayoutParams()).topMargin = z40.c0(z40Var).getMeasuredHeight();
                z40Var.h.getLayoutParams().height = z40Var.f54373d0;
                ((ViewGroup.MarginLayoutParams) z40Var.d.getLayoutParams()).height = org.telegram.messenger.g0.L(53.0f) + z40.d0(z40Var).getMeasuredHeight() + z40Var.f54373d0;
                z40Var.o0();
                super.onMeasure(i7, i10);
                return;
            case 11:
                int size3 = View.MeasureSpec.getSize(i7);
                int size4 = View.MeasureSpec.getSize(i10);
                a60 a60Var = (a60) this.f49119b;
                if (!org.telegram.messenger.g0.Q1() && size4 <= size3) {
                    f10 = 78.0f;
                } else {
                    f10 = 144.0f;
                }
                a60Var.f45486x = org.telegram.messenger.g0.L(f10);
                super.onMeasure(i7, i10);
                return;
            case 13:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                de0 de0Var = (de0) this.f49119b;
                for (org.telegram.ui.Components.iu0 iu0Var : de0Var.f46888b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) iu0Var.getLayoutParams();
                    int L = org.telegram.messenger.g0.L(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!iu0Var.a() && de0Var.f46890c.getVisibility() == 0) {
                        L += org.telegram.messenger.g0.L(230.0f);
                    }
                    iu0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 16:
                lm0 lm0Var = (lm0) this.f49119b;
                FrameLayout frameLayout = lm0Var.M;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) lm0Var.M.getLayoutParams()).topMargin = org.telegram.messenger.g0.f24004m;
                }
                super.onMeasure(i7, i10);
                return;
            case 21:
                super.onMeasure(i7, i10);
                ProfileActivity.d1((ProfileActivity) this.f49119b);
                return;
            case 22:
                int size5 = View.MeasureSpec.getSize(i7);
                int size6 = View.MeasureSpec.getSize(i10);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f49119b;
                WindowInsets windowInsets = secretMediaViewer.f43739f0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.g0.f24017y) {
                        int i11 = org.telegram.messenger.g0.f24010q.y;
                        if (size6 > i11) {
                            size6 = i11;
                        }
                        size6 += org.telegram.messenger.g0.f24004m;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i12 = org.telegram.messenger.g0.f24010q.y;
                    if (size6 > i12) {
                        size6 = i12;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f43739f0;
                if (windowInsets2 != null) {
                    size5 -= windowInsets2.getSystemWindowInsetLeft();
                }
                secretMediaViewer.f43735e.measure(View.MeasureSpec.makeMeasureSpec(size5, 1073741824), View.MeasureSpec.makeMeasureSpec(size6, 1073741824));
                return;
            case 24:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 26:
                int size7 = View.MeasureSpec.getSize(i7);
                int size8 = View.MeasureSpec.getSize(i10);
                setMeasuredDimension(size7, size8);
                x71 x71Var = (x71) this.f49119b;
                measureChildWithMargins(x71.x0(x71Var), i7, 0, i10, 0);
                int measuredHeight2 = x71.z0(x71Var).getMeasuredHeight();
                if (x71.A0(x71Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) x71Var.f53681p0.getLayoutParams()).topMargin = measuredHeight2;
                x71Var.f53681p0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(x71Var.f53686r0, i7, 0, i10, 0);
                return;
            case 28:
                super.onMeasure(i7, i10);
                ((ViewGroup.MarginLayoutParams) ((bb1) this.f49119b).M.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.f24004m;
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f49118a) {
            case 6:
                super.onSizeChanged(i7, i10, i11, i12);
                ns nsVar = (ns) this.f49119b;
                ih.d.c(nsVar.f50309s, nsVar.f50314y);
                nsVar.f50310t.d();
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f49118a) {
            case 20:
                if (!((PopupNotificationActivity) this.f49119b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f49118a) {
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
        switch (this.f49118a) {
            case 21:
                super.setScaleX(f10);
                ProfileActivity.d1((ProfileActivity) this.f49119b);
                return;
            case 25:
                super.setScaleX(f10);
                ((o31) this.f49119b).p0();
                return;
            default:
                super.setScaleX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f49118a) {
            case 4:
                super.setTranslationY(f10);
                ((lb) this.f49119b).Y.invalidate();
                return;
            case 19:
                super.setTranslationY(f10);
                Drawable[] drawableArr = PhotoViewer.Z8;
                ((PhotoViewer) this.f49119b).D1();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f49118a) {
            case 3:
                l6 l6Var = (l6) this.f49119b;
                if (drawable != l6Var.f49484c && drawable != l6Var.f49483b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public k0(Context context, int i7) {
        super(context);
        this.f49118a = i7;
    }

    public k0(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f49118a = 29;
        LinearLayout linearLayout = new LinearLayout(context);
        addView(linearLayout, c8.na.e(-1, -2, 80));
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.t6.V(textView, org.telegram.ui.ActionBar.t6.g(org.telegram.ui.ActionBar.m6.G6, 100), h6Var);
        textView.setTextSize(1, 13.0f);
        org.telegram.messenger.f3.k(textView, 17, null, 2131743613);
        linearLayout.addView(textView, c8.na.t(-1, -2, 0, 16, 17, 17, 16));
        ug.r0 r0Var = new ug.r0(context, h6Var, false);
        this.f49119b = r0Var;
        String N0 = org.telegram.messenger.hd.N0(2131743614, null);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").setSpan(new org.telegram.ui.Components.nq(0, context.getDrawable(2131232311)), 0, 1, 0);
        spannableStringBuilder.append((CharSequence) N0);
        r0Var.f58869f.setText(spannableStringBuilder);
        linearLayout.addView(r0Var, c8.na.t(-1, 48, 0, 16, 0, 16, 16));
    }

    public k0(zy zyVar, Context context) {
        super(context);
        String N0;
        this.f49118a = 7;
        this.f49119b = zyVar;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232202);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(22.0f);
        int i7 = org.telegram.ui.ActionBar.m6.Fi;
        int i10 = 0;
        ShapeDrawable d02 = org.telegram.ui.ActionBar.m6.d0(L, org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i7);
        imageView.setBackground(d02);
        org.telegram.ui.ActionBar.t6.j(imageView, d02, M, null, null);
        addView(imageView, c8.na.d(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xh.l lVar = new xh.l(context);
        lVar.setTypeface(org.telegram.messenger.g0.o());
        lVar.setTextSize(1, 20.0f);
        int i11 = org.telegram.ui.ActionBar.m6.f29455j5;
        org.telegram.ui.ActionBar.t6.U(lVar, i11, null);
        lVar.setGravity(1);
        lVar.setText(zyVar.f1(lVar));
        org.telegram.messenger.so soVar = zyVar.U1;
        if (soVar != null && soVar.f26861n) {
            i10 = 26;
        }
        lVar.f60611s = i10;
        addView(lVar, c8.na.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (zyVar.V1.isEmpty()) {
            N0 = org.telegram.messenger.hd.N0(2131750627, null);
        } else {
            N0 = org.telegram.messenger.hd.N0(2131750628, null);
        }
        textView.setText(N0);
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(textView, i11, null);
        addView(textView, c8.na.d(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232098);
        org.telegram.ui.ActionBar.t6.s(imageView2, org.telegram.ui.ActionBar.m6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 22));
        addView(imageView2, c8.na.d(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    private final void a(Configuration configuration) {
    }
}
