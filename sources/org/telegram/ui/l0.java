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
    public final int f39005a;
    public Object f39006b;

    public l0(Context context, int i10) {
        super(context);
        this.f39005a = i10;
    }

    @Override
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        switch (this.f39005a) {
            case 12:
                Typeface typeface = org.telegram.messenger.i0.f15999a;
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
        switch (this.f39005a) {
            case 6:
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    lt ltVar = (lt) this.f39006b;
                    if (!ltVar.f39398n && !ltVar.K) {
                        ltVar.m();
                        return true;
                    }
                    ltVar.n();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f39005a) {
            case 24:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((i11) this.f39006b).dismiss();
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
        switch (this.f39005a) {
            case 5:
                he heVar = (he) this.f39006b;
                if (motionEvent.getActionMasked() == 0) {
                    heVar.f37910x.X0.C0();
                    for (View view : heVar.f37903b.getViewPages()) {
                        if (view instanceof fe) {
                            ((fe) view).f37240a.C0();
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
        switch (this.f39005a) {
            case 16:
                super.onAttachedToWindow();
                org.telegram.messenger.i0.h3(((kg0) this.f39006b).f38814q0, 500L);
                return;
            case 25:
                super.onAttachedToWindow();
                ImageReceiver imageReceiver = ((y11) this.f39006b).f36904b;
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
        switch (this.f39005a) {
            case 25:
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f39005a) {
            case 16:
                super.onDetachedFromWindow();
                org.telegram.messenger.i0.r(((kg0) this.f39006b).f38814q0);
                return;
            case 25:
                super.onDetachedFromWindow();
                ImageReceiver imageReceiver = ((y11) this.f39006b).f36904b;
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
        switch (this.f39005a) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(RadioButton.class.getName());
                accessibilityNodeInfo.setChecked(((RadioButton) this.f39006b).f24161f);
                accessibilityNodeInfo.setCheckable(true);
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                return;
            case 18:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(((yn0) this.f39006b).f43865b.size(), "AccDescrSendPhotos", new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
                return;
            case 19:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(org.telegram.messenger.cd.G(((lo0) this.f39006b).f39329b.size(), "AccDescrSendPhotos", new Object[0]));
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
        switch (this.f39005a) {
            case 3:
                super.onInterceptTouchEvent(motionEvent);
                return true;
            case 21:
                if (!((PopupNotificationActivity) this.f39006b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        org.telegram.ui.Components.zu0[] zu0VarArr;
        int i14;
        Activity activity;
        switch (this.f39005a) {
            case 2:
                int paddingLeft = ((i12 - i10) - getPaddingLeft()) - getPaddingRight();
                int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
                int min = Math.min(paddingLeft, paddingTop) - org.telegram.messenger.i0.L(24.0f);
                int min2 = Math.min(org.telegram.messenger.i0.L(60.0f), min);
                int L = (paddingTop - min2) - org.telegram.messenger.i0.L(48.0f);
                a5 a5Var = (a5) this.f39006b;
                a5Var.d.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(L, Integer.MIN_VALUE));
                int b10 = w7.u.b((paddingTop - a5Var.d.getMeasuredHeight()) - org.telegram.messenger.i0.L(48.0f), min2, min);
                a5Var.f35554c.measure(View.MeasureSpec.makeMeasureSpec(b10, 1073741824), View.MeasureSpec.makeMeasureSpec(b10, 1073741824));
                int y3 = org.telegram.messenger.z20.y(48.0f, (paddingTop - b10) - a5Var.d.getMeasuredHeight(), 2);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a5Var.d.getLayoutParams();
                ((FrameLayout.LayoutParams) a5Var.f35554c.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(8.0f) + y3;
                layoutParams.topMargin = org.telegram.messenger.i0.L(4.0f) + org.telegram.messenger.m5.C(8.0f, y3, b10);
                layoutParams.leftMargin = org.telegram.messenger.i0.L(4.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(4.0f);
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                v50 v50Var = (v50) this.f39006b;
                v50Var.k0();
                v50Var.l0();
                org.telegram.ui.Components.h10 h10Var = v50Var.f42613f;
                fe.f fVar = v50Var.f42607b;
                h10Var.setTranslationY(fVar.f7031f);
                v50Var.m0();
                v50Var.e.setTranslationY(org.telegram.messenger.i0.L(48.0f) + fVar.f7031f);
                return;
            case 10:
                super.onLayout(z10, i10, i11, i12, i13);
                n60 n60Var = (n60) this.f39006b;
                TextView textView = n60Var.f39836b;
                if (textView != null) {
                    int measuredWidth = ((n60Var.f39836b.getMeasuredWidth() / 2) + textView.getLeft()) - (n60Var.f39837c.getMeasuredWidth() / 2);
                    int top = (n60Var.e.getTop() + ((n60Var.f39836b.getMeasuredHeight() - n60Var.f39837c.getMeasuredHeight()) / 2)) - org.telegram.messenger.i0.L(16.0f);
                    TextView textView2 = n60Var.f39837c;
                    textView2.layout(measuredWidth, top, textView2.getMeasuredWidth() + measuredWidth, n60Var.f39837c.getMeasuredHeight() + top);
                    return;
                }
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                hf0 hf0Var = (hf0) this.f39006b;
                for (org.telegram.ui.Components.zu0 zu0Var : hf0Var.f37920b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zu0Var.getLayoutParams();
                    int L2 = org.telegram.messenger.i0.L(16.0f) + getHeight();
                    if (!zu0Var.a() && hf0Var.f37922c.getVisibility() == 0) {
                        L2 += org.telegram.messenger.i0.L(230.0f);
                    }
                    zu0Var.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, L2);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                pf0 pf0Var = (pf0) this.f39006b;
                pf0Var.n0();
                pf0Var.m0();
                pf0Var.j0();
                return;
            case 23:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39006b;
                WindowInsets windowInsets = secretMediaViewer.f33987e0;
                if (windowInsets != null) {
                    i14 = windowInsets.getSystemWindowInsetLeft();
                } else {
                    i14 = 0;
                }
                fg.i iVar = secretMediaViewer.e;
                iVar.layout(i14, 0, iVar.getMeasuredWidth() + i14, secretMediaViewer.e.getMeasuredHeight());
                if (z10) {
                    if (secretMediaViewer.I0 == null) {
                        secretMediaViewer.f34025w0 = 1.0f;
                        secretMediaViewer.f34021u0 = 0.0f;
                        secretMediaViewer.f34023v0 = 0.0f;
                    }
                    secretMediaViewer.o(secretMediaViewer.f34025w0);
                    return;
                }
                return;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                ((i11) this.f39006b).d();
                return;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                y11 y11Var = (y11) this.f39006b;
                Context context = y11Var.getContext();
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
                    Bitmap bitmap = y11Var.f36907n;
                    if (bitmap == null || bitmap.getWidth() != decorView.getMeasuredWidth() || y11Var.f36907n.getHeight() != decorView.getMeasuredHeight()) {
                        y11Var.f();
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
        org.telegram.ui.Components.zu0[] zu0VarArr;
        switch (this.f39005a) {
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
                v50 v50Var = (v50) this.f39006b;
                int size = View.MeasureSpec.getSize(i10);
                int size2 = View.MeasureSpec.getSize(i11);
                if (!org.telegram.messenger.i0.Q1() && size2 <= size) {
                    v50Var.f42610c0 = org.telegram.messenger.i0.L(56.0f);
                } else {
                    v50Var.f42610c0 = org.telegram.messenger.i0.L(144.0f);
                }
                measureChildWithMargins(v50.g0(v50Var), i10, 0, i11, 0);
                ((ViewGroup.MarginLayoutParams) v50Var.f42628s.getLayoutParams()).topMargin = org.telegram.messenger.i0.L(48.0f) + v50.h0(v50Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) v50Var.e.getLayoutParams()).topMargin = v50.Z(v50Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) v50Var.f42613f.getLayoutParams()).topMargin = v50.a0(v50Var).getMeasuredHeight();
                ((ViewGroup.MarginLayoutParams) v50Var.h.getLayoutParams()).topMargin = v50.b0(v50Var).getMeasuredHeight();
                v50Var.h.getLayoutParams().height = v50Var.f42610c0;
                ((ViewGroup.MarginLayoutParams) v50Var.d.getLayoutParams()).height = org.telegram.messenger.i0.L(53.0f) + v50.c0(v50Var).getMeasuredHeight() + v50Var.f42610c0;
                v50Var.n0();
                super.onMeasure(i10, i11);
                return;
            case 11:
                int size3 = View.MeasureSpec.getSize(i10);
                int size4 = View.MeasureSpec.getSize(i11);
                y60 y60Var = (y60) this.f39006b;
                if (!org.telegram.messenger.i0.Q1() && size4 <= size3) {
                    f7 = 78.0f;
                } else {
                    f7 = 144.0f;
                }
                y60Var.f43740x = org.telegram.messenger.i0.L(f7);
                super.onMeasure(i10, i11);
                return;
            case 13:
                super.onMeasure(i10, i11);
                ub0 ub0Var = ((yb0) this.f39006b).f43808w;
                if (ub0Var != null) {
                    ub0Var.a();
                    return;
                }
                return;
            case 14:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                hf0 hf0Var = (hf0) this.f39006b;
                for (org.telegram.ui.Components.zu0 zu0Var : hf0Var.f37920b) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) zu0Var.getLayoutParams();
                    int L = org.telegram.messenger.i0.L(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!zu0Var.a() && hf0Var.f37922c.getVisibility() == 0) {
                        L += org.telegram.messenger.i0.L(230.0f);
                    }
                    zu0Var.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
                }
                return;
            case 17:
                tn0 tn0Var = (tn0) this.f39006b;
                FrameLayout frameLayout = tn0Var.L;
                if (frameLayout != null) {
                    ((ViewGroup.MarginLayoutParams) frameLayout.getLayoutParams()).height = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    ((ViewGroup.MarginLayoutParams) tn0Var.L.getLayoutParams()).topMargin = org.telegram.messenger.i0.f16020m;
                }
                super.onMeasure(i10, i11);
                return;
            case 22:
                super.onMeasure(i10, i11);
                ProfileActivity.c1((ProfileActivity) this.f39006b);
                return;
            case 23:
                int size5 = View.MeasureSpec.getSize(i10);
                int size6 = View.MeasureSpec.getSize(i11);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f39006b;
                WindowInsets windowInsets = secretMediaViewer.f33987e0;
                if (windowInsets != null) {
                    if (org.telegram.messenger.i0.f16033y) {
                        int i12 = org.telegram.messenger.i0.f16026q.y;
                        if (size6 > i12) {
                            size6 = i12;
                        }
                        size6 += org.telegram.messenger.i0.f16020m;
                    }
                    size6 -= windowInsets.getSystemWindowInsetBottom();
                    size5 -= windowInsets.getSystemWindowInsetRight();
                } else {
                    int i13 = org.telegram.messenger.i0.f16026q.y;
                    if (size6 > i13) {
                        size6 = i13;
                    }
                }
                setMeasuredDimension(size5, size6);
                WindowInsets windowInsets2 = secretMediaViewer.f33987e0;
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
                m91 m91Var = (m91) this.f39006b;
                measureChildWithMargins(m91.w0(m91Var), i10, 0, i11, 0);
                int measuredHeight2 = m91.y0(m91Var).getMeasuredHeight();
                if (m91.z0(m91Var).getVisibility() == 0) {
                    size8 -= measuredHeight2;
                }
                ((FrameLayout.LayoutParams) m91Var.f39578o0.getLayoutParams()).topMargin = measuredHeight2;
                m91Var.f39578o0.measure(View.MeasureSpec.makeMeasureSpec(size7, 1073741824), View.MeasureSpec.makeMeasureSpec(size8, 1073741824));
                measureChildWithMargins(m91Var.f39582q0, i10, 0, i11, 0);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39005a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                lt ltVar = (lt) this.f39006b;
                yg.d.c(ltVar.f39403s, ltVar.f39408y);
                ltVar.f39404t.d();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f39005a) {
            case 21:
                if (!((PopupNotificationActivity) this.f39006b).c() && !((PopupNotificationActivity) getContext()).j(motionEvent)) {
                    return false;
                }
                return true;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        switch (this.f39005a) {
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
        switch (this.f39005a) {
            case 22:
                super.setScaleX(f7);
                ProfileActivity.c1((ProfileActivity) this.f39006b);
                return;
            case 26:
                super.setScaleX(f7);
                ((e51) this.f39006b).o0();
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f39005a) {
            case 4:
                super.setTranslationY(f7);
                ((sb) this.f39006b).X.invalidate();
                return;
            case 20:
                super.setTranslationY(f7);
                Drawable[] drawableArr = PhotoViewer.U8;
                ((PhotoViewer) this.f39006b).I1();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f39005a) {
            case 3:
                m6 m6Var = (m6) this.f39006b;
                if (drawable != m6Var.f39479c && drawable != m6Var.f39478b && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l0(Object obj, Context context, int i10) {
        super(context);
        this.f39005a = i10;
        this.f39006b = obj;
    }

    public l0(wz wzVar, Context context) {
        super(context);
        String L0;
        this.f39005a = 7;
        this.f39006b = wzVar;
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
        int i12 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(pVar, i12, null);
        pVar.setGravity(1);
        pVar.setText(wzVar.e1(pVar));
        org.telegram.messenger.ap apVar = wzVar.Q1;
        if (apVar != null && apVar.f14655n) {
            i11 = 26;
        }
        pVar.f13893s = i11;
        addView(pVar, w7.b6.d(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        if (wzVar.R1.isEmpty()) {
            L0 = org.telegram.messenger.cd.L0(2131750645, null);
        } else {
            L0 = org.telegram.messenger.cd.L0(2131750646, null);
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
