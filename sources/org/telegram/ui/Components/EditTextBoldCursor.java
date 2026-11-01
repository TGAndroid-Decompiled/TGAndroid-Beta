package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Stack;
public class EditTextBoldCursor extends qt {
    public static Field A1;
    public static boolean B1;
    public static Method C1;
    public static Class D1;
    public static Field E1;
    public static Method F1;
    public static Field f23981y1;
    public static Field f23982z1;
    public float A0;
    public long B0;
    public boolean C0;
    public boolean D0;
    public float E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public int J0;
    public int K0;
    public float L0;
    public boolean M0;
    public float N0;
    public long O0;
    public float P0;
    public float Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public AnimatorSet V0;
    public float W0;
    public org.telegram.ui.ActionBar.s4 X0;
    public org.telegram.ui.ActionBar.d4 Y0;
    public dt Z0;
    public Object f23983a0;
    public View f23984a1;
    public final GradientDrawable f23985b0;
    public View f23986b1;
    public nx0 f23987c0;
    public int f23988c1;
    public float f23989d0;
    public boolean f23990d1;
    public final r5 f23991e0;
    public final ft f23992e1;
    public final Paint f23993f0;
    public final ArrayList f23994f1;
    public final Paint f23995g0;
    public boolean f23996g1;
    public final TextPaint f23997h0;
    public int f23998h1;
    public int f23999i0;
    public final Rect f24000i1;
    public int f24001j0;
    public int f24002j1;
    public int f24003k0;
    public int f24004k1;
    public int f24005l0;
    public Rect l1;
    public float m0;
    public tg.b f24006m1;
    public final Rect f24007n0;
    public Drawable f24008n1;
    public StaticLayout f24009o0;
    public Drawable f24010o1;
    public float f24011p0;
    public Drawable f24012p1;
    public boolean f24013q0;
    public PorterDuffColorFilter f24014q1;
    public boolean f24015r0;
    public int f24016r1;
    public qh.d f24017s0;
    public Runnable f24018s1;
    public et f24019t0;
    public boolean f24020t1;
    public et f24021u0;
    public Paint f24022u1;
    public CharSequence f24023v0;
    public LinearGradient f24024v1;
    public CharSequence f24025w0;
    public Matrix f24026w1;
    public int f24027x0;
    public int f24028x1;
    public int f24029y0;
    public boolean f24030z0;

    public EditTextBoldCursor(Context context) {
        super(context, null, 0, 2131755179);
        String str;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        this.f29786a = arrayList;
        this.f29787b = new Stack();
        this.f29788c = new ArrayList();
        this.e = true;
        this.f29790n = new Path();
        this.G = true;
        this.H = null;
        this.J = new ot(this, 0);
        this.K = new Rect();
        if (qt.W == null) {
            String str2 = Build.MANUFACTURER;
            if ((str2 != null && (str2.toLowerCase().contains("honor") || str2.toLowerCase().contains("huawei") || str2.toLowerCase().contains("alps"))) || ((str = Build.MODEL) != null && str.toLowerCase().contains("mediapad"))) {
                z10 = false;
            } else {
                z10 = true;
            }
            qt.W = Boolean.valueOf(z10);
        }
        this.P = qt.W.booleanValue();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            this.f29789f = new nh.n(this, arrayList, new pt(this));
        }
        this.f23991e0 = new r5(this, 1);
        this.f24007n0 = new Rect();
        this.f24030z0 = true;
        this.A0 = 1.0f;
        this.C0 = true;
        this.D0 = false;
        this.E0 = 2.0f;
        this.H0 = false;
        this.M0 = false;
        this.N0 = 0.0f;
        this.P0 = 0.0f;
        this.Q0 = 0.0f;
        this.T0 = true;
        this.f23994f1 = new ArrayList();
        this.f23996g1 = false;
        this.f24000i1 = new Rect();
        this.f24002j1 = -1;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        this.f23993f0 = new Paint();
        this.f23995g0 = new Paint();
        TextPaint textPaint = new TextPaint(1);
        this.f23997h0 = textPaint;
        textPaint.setTextSize(org.telegram.messenger.i0.L(11.0f));
        if (i10 >= 26) {
            setImportantForAutofill(2);
        }
        if (i10 >= 29) {
            ft ftVar = new ft(this);
            this.f23992e1 = ftVar;
            ftVar.setShape(new RectShape());
            this.f23985b0 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
            setTextCursorDrawable(this.f23992e1);
        }
        try {
            if (!B1 && A1 == null) {
                B1 = true;
                Field declaredField = View.class.getDeclaredField("mScrollY");
                A1 = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (Throwable unused) {
        }
        try {
            if (D1 == null) {
                Field declaredField2 = TextView.class.getDeclaredField("mEditor");
                f23981y1 = declaredField2;
                declaredField2.setAccessible(true);
                Class<?> cls = Class.forName("android.widget.Editor");
                D1 = cls;
                try {
                    Field declaredField3 = cls.getDeclaredField("mShowCursor");
                    f23982z1 = declaredField3;
                    declaredField3.setAccessible(true);
                } catch (Exception unused2) {
                }
                try {
                    Method declaredMethod = D1.getDeclaredMethod("invalidateTextDisplayList", null);
                    F1 = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (Exception unused3) {
                }
                Method declaredMethod2 = TextView.class.getDeclaredMethod("getVerticalOffset", Boolean.TYPE);
                C1 = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
        } catch (Throwable th2) {
            org.telegram.messenger.f8.g(th2, true);
        }
        if (this.f23992e1 == null) {
            try {
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-11230757, -11230757});
                this.f23985b0 = gradientDrawable;
                if (Build.VERSION.SDK_INT >= 29) {
                    setTextCursorDrawable(gradientDrawable);
                }
                this.f23983a0 = f23981y1.get(this);
            } catch (Throwable unused4) {
            }
            try {
                if (E1 == null) {
                    Field declaredField4 = TextView.class.getDeclaredField("mCursorDrawableRes");
                    E1 = declaredField4;
                    declaredField4.setAccessible(true);
                }
                Field field = E1;
                if (field != null) {
                    field.set(this, 2131231069);
                }
            } catch (Throwable unused5) {
            }
        }
        this.f23999i0 = org.telegram.messenger.i0.L(24.0f);
    }

    @Override
    public final void addTextChangedListener(TextWatcher textWatcher) {
        this.f23994f1.add(textWatcher);
        if (this.f23996g1) {
            return;
        }
        super.addTextChangedListener(textWatcher);
    }

    public int getActionModeStyle() {
        return 1;
    }

    public int getActiveLineColor() {
        return this.J0;
    }

    @Override
    public int getAutofillType() {
        return 0;
    }

    public int getCursorColor() {
        return this.f23998h1;
    }

    public int getErrorLineColor() {
        return this.K0;
    }

    @Override
    public int getExtendedPaddingBottom() {
        int i10 = this.f24003k0;
        if (i10 != 0) {
            this.f24003k0 = i10 - 1;
            int i11 = this.f24005l0;
            if (i11 != Integer.MAX_VALUE) {
                return -i11;
            }
            return 0;
        }
        return super.getExtendedPaddingBottom();
    }

    @Override
    public int getExtendedPaddingTop() {
        int i10 = this.f24001j0;
        if (i10 != 0) {
            this.f24001j0 = i10 - 1;
            return 0;
        }
        return super.getExtendedPaddingTop();
    }

    public int getHandlesColor() {
        return this.f24016r1;
    }

    public float getHeaderAnimationProgress() {
        return this.W0;
    }

    public int getHeaderHintColor() {
        return this.f24029y0;
    }

    public int getHintColor() {
        return this.f24027x0;
    }

    public Layout getHintLayoutEx() {
        return this.f24009o0;
    }

    public int getLineColor() {
        return this.I0;
    }

    @Override
    public float getLineSpacingExtra() {
        return super.getLineSpacingExtra();
    }

    public float getLineY() {
        return this.L0;
    }

    public Runnable getOnPremiumMenuLockClickListener() {
        return this.f24018s1;
    }

    public org.telegram.ui.ActionBar.p6 getResourcesProvider() {
        return null;
    }

    @Override
    public Drawable getTextCursorDrawable() {
        if (this.f23992e1 != null) {
            return super.getTextCursorDrawable();
        }
        ft ftVar = new ft(this, new RectShape());
        ftVar.getPaint().setColor(0);
        return ftVar;
    }

    @Override
    public Drawable getTextSelectHandle() {
        if (this.f24012p1 == null) {
            this.f24012p1 = y(super.getTextSelectHandle(), true);
        }
        return this.f24012p1;
    }

    @Override
    public Drawable getTextSelectHandleLeft() {
        if (this.f24008n1 == null) {
            this.f24008n1 = y(super.getTextSelectHandleLeft(), true);
        }
        return this.f24008n1;
    }

    @Override
    public Drawable getTextSelectHandleRight() {
        if (this.f24010o1 == null) {
            this.f24010o1 = y(super.getTextSelectHandleRight(), true);
        }
        return this.f24010o1;
    }

    public final void l(boolean z10) {
        boolean z11;
        if (this.S0 && (getText().length() > 0 || (this.T0 && isFocused()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.U0 != z11) {
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            this.U0 = z11;
            float f7 = 0.0f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V0 = animatorSet2;
                if (z11) {
                    f7 = 1.0f;
                }
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this, "headerAnimationProgress", f7));
                this.V0.setDuration(200L);
                this.V0.setInterpolator(gr.h);
                this.V0.start();
            } else {
                if (z11) {
                    f7 = 1.0f;
                }
                this.W0 = f7;
            }
            invalidate();
        }
    }

    public final void m() {
        org.telegram.ui.ActionBar.s4 s4Var = this.X0;
        if (s4Var != null) {
            s4Var.f20776a.removeOnLayoutChangeListener(s4Var.f20784l);
            org.telegram.ui.ActionBar.q4 q4Var = s4Var.f20777b;
            if (!q4Var.F) {
                q4Var.G = false;
                q4Var.F = true;
                q4Var.f20701x.cancel();
                q4Var.f20700w.start();
                q4Var.D.setEmpty();
            }
            this.X0 = null;
        }
        if (this.Z0 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.Z0);
            this.Z0 = null;
        }
    }

    public void n(Canvas canvas, GradientDrawable gradientDrawable) {
        gradientDrawable.draw(canvas);
    }

    @Override
    public void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f23986b1 = getRootView();
        if (Build.VERSION.SDK_INT < 29) {
            rf.g.d().b(this.f23991e0, 2);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f23986b1 = null;
        if (Build.VERSION.SDK_INT < 29) {
            rf.g.d().g(this.f23991e0);
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.EditTextBoldCursor.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        try {
            super.onFocusChanged(z10, i10, rect);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        l(true);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.EditText");
        if (this.f24009o0 != null) {
            if (getText().length() <= 0) {
                accessibilityNodeInfo.setText(this.f24009o0.getText());
            } else {
                new s0.c(accessibilityNodeInfo).l(this.f24009o0.getText());
            }
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredHeight = getMeasuredHeight() + (getMeasuredWidth() << 16);
        et etVar = this.f24019t0;
        if (etVar != null) {
            etVar.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        et etVar2 = this.f24021u0;
        if (etVar2 != null) {
            etVar2.setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
        }
        StaticLayout staticLayout = this.f24009o0;
        if (staticLayout != null && this.f24019t0 == null) {
            if (this.f23988c1 != measuredHeight) {
                s(this.f24023v0, false, staticLayout.getPaint());
            }
            if (this.f24013q0) {
                this.L0 = ((((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.f24009o0.getHeight()) / 2.0f) + (getPaddingTop() + getExtendedPaddingTop())) + this.f24009o0.getHeight()) - org.telegram.messenger.i0.L(1.0f);
            } else {
                this.L0 = ((getMeasuredHeight() - this.f24009o0.getHeight()) / 2.0f) + this.f24009o0.getHeight() + org.telegram.messenger.i0.L(6.0f);
            }
        } else {
            this.L0 = getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f);
        }
        this.f23988c1 = measuredHeight;
    }

    @Override
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        if (this.S0 && !this.T0) {
            l(true);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f24002j1 = (int) motionEvent.getX();
        }
        return super.onTouchEvent(motionEvent);
    }

    public final StaticLayout p(int i10) {
        if (TextUtils.isEmpty(this.f24025w0)) {
            return null;
        }
        return new StaticLayout(this.f24025w0, this.f23997h0, i10, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    @Override
    public final boolean postDelayed(Runnable runnable, long j10) {
        if (Build.VERSION.SDK_INT >= 29 && runnable != null && j10 == 500 && "android.widget.Editor$Blink".equals(runnable.getClass().getName()) && Looper.myLooper() == Looper.getMainLooper()) {
            rf.g d = rf.g.d();
            d.getClass();
            rf.g.c();
            int max = Math.max(1, Math.min(2, 60));
            d.h(runnable);
            rf.f e = d.e(max);
            if (e.d == null) {
                e.d = new je.b();
            }
            e.d.add(runnable);
            return true;
        }
        return super.postDelayed(runnable, j10);
    }

    public final void q() {
        invalidate();
        if (isHardwareAccelerated()) {
            try {
                if (F1 != null) {
                    if (this.f23983a0 == null) {
                        this.f23983a0 = f23981y1.get(this);
                    }
                    Object obj = this.f23983a0;
                    if (obj != null) {
                        F1.invoke(obj, null);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void r(CharSequence charSequence, boolean z10) {
        s(charSequence, z10, getPaint());
    }

    @Override
    public final boolean removeCallbacks(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            rf.g.d().h(runnable);
        }
        return super.removeCallbacks(runnable);
    }

    @Override
    public final void removeTextChangedListener(TextWatcher textWatcher) {
        this.f23994f1.remove(textWatcher);
        if (this.f23996g1) {
            return;
        }
        super.removeTextChangedListener(textWatcher);
    }

    public final void s(CharSequence charSequence, boolean z10, TextPaint textPaint) {
        boolean z11;
        TextPaint textPaint2;
        String charSequence2;
        String charSequence3;
        boolean z12;
        float f7;
        CharSequence charSequence4 = charSequence;
        et etVar = this.f24019t0;
        if (etVar != null) {
            etVar.t(charSequence4, !org.telegram.messenger.dd.X, true);
            return;
        }
        if (charSequence4 == null) {
            charSequence4 = "";
        }
        CharSequence charSequence5 = charSequence4;
        if (getMeasuredWidth() == 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if (z11) {
            if (this.f23987c0 == null) {
                this.f23987c0 = new nx0(this);
            }
            nx0 nx0Var = this.f23987c0;
            StaticLayout staticLayout = this.f24009o0;
            CharSequence charSequence6 = this.f24023v0;
            nx0Var.getClass();
            if (staticLayout != null && !charSequence6.equals(charSequence5)) {
                ValueAnimator valueAnimator = nx0Var.f28979j;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (charSequence6.length() > charSequence5.length()) {
                    charSequence2 = charSequence6.toString();
                    charSequence3 = charSequence5.toString();
                    z12 = true;
                } else {
                    charSequence2 = charSequence5.toString();
                    charSequence3 = charSequence6.toString();
                    z12 = false;
                }
                int indexOf = charSequence2.indexOf(charSequence3);
                if (indexOf >= 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence2);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence2);
                    if (indexOf != 0) {
                        spannableStringBuilder2.setSpan(new wy(false), 0, indexOf, 0);
                    }
                    if (charSequence3.length() + indexOf != charSequence2.length()) {
                        spannableStringBuilder2.setSpan(new wy(false), charSequence3.length() + indexOf, charSequence2.length(), 0);
                    }
                    spannableStringBuilder.setSpan(new wy(false), indexOf, charSequence3.length() + indexOf, 0);
                    int L = org.telegram.messenger.i0.L(400.0f);
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                    nx0Var.f28974b = new StaticLayout(spannableStringBuilder, textPaint, L, alignment, 1.0f, 0.0f, false);
                    StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, org.telegram.messenger.i0.L(400.0f), alignment, 1.0f, 0.0f, false);
                    nx0Var.d = staticLayout2;
                    nx0Var.e = true;
                    nx0Var.f28976f = z12;
                    if (indexOf == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = -staticLayout2.getPrimaryHorizontal(indexOf);
                    }
                    nx0Var.h = f7;
                    nx0Var.f28975c = null;
                    nx0Var.f28977g = false;
                } else {
                    int L2 = org.telegram.messenger.i0.L(400.0f);
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                    nx0Var.f28974b = new StaticLayout(charSequence5, textPaint, L2, alignment2, 1.0f, 0.0f, false);
                    nx0Var.f28975c = new StaticLayout(charSequence6, textPaint, org.telegram.messenger.i0.L(400.0f), alignment2, 1.0f, 0.0f, false);
                    nx0Var.d = null;
                    nx0Var.e = true;
                    nx0Var.f28977g = true;
                    nx0Var.h = 0.0f;
                }
                nx0Var.f28978i = 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                nx0Var.f28979j = ofFloat;
                ofFloat.addUpdateListener(new r60(nx0Var, 25));
                nx0Var.f28979j.addListener(new t60(nx0Var, 27));
                nx0Var.f28979j.setDuration(150L);
                nx0Var.f28979j.setInterpolator(gr.f26523f);
                nx0Var.f28979j.start();
            }
        } else {
            nx0 nx0Var2 = this.f23987c0;
            if (nx0Var2 != null) {
                ValueAnimator valueAnimator2 = nx0Var2.f28979j;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                nx0Var2.e = false;
            }
        }
        this.f24023v0 = charSequence5;
        if (getMeasuredWidth() != 0) {
            textPaint2 = textPaint;
            charSequence5 = TextUtils.ellipsize(charSequence5, textPaint2, getMeasuredWidth(), TextUtils.TruncateAt.END);
            StaticLayout staticLayout3 = this.f24009o0;
            if (staticLayout3 != null && TextUtils.equals(staticLayout3.getText(), charSequence5)) {
                return;
            }
        } else {
            textPaint2 = textPaint;
        }
        this.f24009o0 = new StaticLayout(charSequence5, textPaint2, org.telegram.messenger.i0.L(1000.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        invalidate();
    }

    public void setActiveLineColor(int i10) {
        this.J0 = i10;
        this.f23995g0.setColor(i10);
        invalidate();
    }

    public void setAllowDrawCursor(boolean z10) {
        this.C0 = z10;
        invalidate();
    }

    public void setBlurredBackgroundDrawableViewFactory(tg.b bVar) {
        this.f24006m1 = bVar;
    }

    public void setCursorColor(int i10) {
        this.f23998h1 = i10;
        ft ftVar = this.f23992e1;
        if (ftVar != null) {
            ftVar.getPaint().setColor(i10);
        }
        GradientDrawable gradientDrawable = this.f23985b0;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i10);
        }
        invalidate();
    }

    public void setCursorSize(int i10) {
        this.f23999i0 = i10;
    }

    public void setCursorWidth(float f7) {
        this.E0 = f7;
    }

    public void setEllipsizeByGradient(boolean z10) {
        this.f24020t1 = z10;
        if (z10) {
            this.f24028x1 = org.telegram.messenger.i0.L(12.0f);
            this.f24022u1 = new Paint(1);
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f24028x1, 0.0f, new int[]{-1, 16777215}, new float[]{0.4f, 1.0f}, Shader.TileMode.CLAMP);
            this.f24024v1 = linearGradient;
            this.f24022u1.setShader(linearGradient);
            this.f24026w1 = new Matrix();
        }
    }

    public void setErrorLineColor(int i10) {
        this.K0 = i10;
        this.f23997h0.setColor(i10);
        invalidate();
    }

    public void setErrorText(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f24025w0)) {
            return;
        }
        this.f24025w0 = charSequence;
        requestLayout();
    }

    public void setForceCursorEnd(boolean z10) {
        this.D0 = z10;
        invalidate();
    }

    public void setHandlesColor(int i10) {
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.d6.i() && this.f24016r1 != i10) {
            this.f24016r1 = i10;
            this.f24014q1 = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
            y(this.f24008n1, false);
            y(this.f24010o1, false);
            y(this.f24012p1, false);
        }
    }

    public void setHeaderAnimationProgress(float f7) {
        this.W0 = f7;
        invalidate();
    }

    public void setHeaderHintColor(int i10) {
        this.f24029y0 = i10;
        invalidate();
    }

    public void setHintColor(int i10) {
        this.f24027x0 = i10;
        et etVar = this.f24019t0;
        if (etVar != null) {
            etVar.u(i10);
        }
        et etVar2 = this.f24021u0;
        if (etVar2 != null) {
            etVar2.u(this.f24027x0);
        }
        invalidate();
    }

    public void setHintRightOffset(int i10) {
        float f7 = i10;
        if (this.f23989d0 == f7) {
            return;
        }
        this.f23989d0 = f7;
        invalidate();
    }

    public void setHintText(CharSequence charSequence) {
        s(charSequence, false, getPaint());
    }

    public void setLineColor(int i10) {
        this.I0 = i10;
        invalidate();
    }

    @Override
    public final void setLineSpacing(float f7, float f10) {
        super.setLineSpacing(f7, f10);
        this.m0 = f7;
    }

    public void setNextSetTextAnimated(boolean z10) {
        this.R0 = z10;
    }

    public void setOnPremiumMenuLockClickListener(Runnable runnable) {
        this.f24018s1 = runnable;
    }

    @Override
    public final void setSelection(int i10, int i11) {
        try {
            super.setSelection(i10, i11);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public void setSupportRtlHint(boolean z10) {
        this.F0 = z10;
    }

    @Override
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        l(this.R0);
        this.R0 = false;
    }

    @Override
    public void setTextSelectHandle(Drawable drawable) {
        Drawable y3 = y(drawable, true);
        this.f24012p1 = y3;
        super.setTextSelectHandle(y3);
    }

    @Override
    public void setTextSelectHandleLeft(Drawable drawable) {
        Drawable y3 = y(drawable, true);
        this.f24008n1 = y3;
        super.setTextSelectHandleLeft(y3);
    }

    @Override
    public void setTextSelectHandleRight(Drawable drawable) {
        Drawable y3 = y(drawable, true);
        this.f24010o1 = y3;
        super.setTextSelectHandleRight(y3);
    }

    @Override
    public void setTextSize(int i10, float f7) {
        et etVar = this.f24019t0;
        if (etVar != null) {
            etVar.w(org.telegram.messenger.i0.L(f7));
        }
        et etVar2 = this.f24021u0;
        if (etVar2 != null) {
            etVar2.w(org.telegram.messenger.i0.L(f7));
        }
        super.setTextSize(i10, f7);
    }

    public void setTransformHintToHeader(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            AnimatorSet animatorSet = this.V0;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
        }
    }

    public void setTransformHintToHeaderOnFocus(boolean z10) {
        if (this.T0 == z10) {
            return;
        }
        this.T0 = z10;
        l(false);
    }

    public void setWindowView(View view) {
        this.f23984a1 = view;
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback) {
        if (this.f23984a1 == null && this.f23986b1 == null) {
            return super.startActionMode(callback);
        }
        org.telegram.ui.ActionBar.d4 d4Var = this.Y0;
        if (d4Var != null) {
            d4Var.finish();
        }
        m();
        Context context = getContext();
        View view = this.f23984a1;
        if (view == null) {
            view = this.f23986b1;
        }
        org.telegram.ui.ActionBar.s4 s4Var = new org.telegram.ui.ActionBar.s4(context, view, getActionModeStyle(), getResourcesProvider(), this.f24006m1);
        this.X0 = s4Var;
        s4Var.f20782j = this.f24018s1;
        s4Var.f20783k = new ct(this, 0);
        org.telegram.ui.ActionBar.d4 d4Var2 = new org.telegram.ui.ActionBar.d4(getContext(), new org.telegram.ui.Cells.i9(this, callback), this, this.X0);
        this.Y0 = d4Var2;
        this.Z0 = new dt(0, this);
        callback.onCreateActionMode(d4Var2, d4Var2.f20255c);
        org.telegram.ui.ActionBar.d4 d4Var3 = this.Y0;
        o(d4Var3, d4Var3.f20255c);
        this.Y0.invalidate();
        getViewTreeObserver().addOnPreDrawListener(this.Z0);
        invalidate();
        return this.Y0;
    }

    public final void t(boolean z10, boolean z11) {
        float f7;
        if (this.f24030z0 == z10) {
            return;
        }
        this.B0 = System.currentTimeMillis();
        this.f24030z0 = z10;
        if (!z11) {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            this.A0 = f7;
        }
        invalidate();
    }

    public final void u(int i10, int i11, int i12) {
        this.H0 = true;
        Drawable drawable = getContext().getResources().getDrawable(2131232680);
        Rect rect = this.f24000i1;
        drawable.getPadding(rect);
        setPadding(rect.left, rect.top, rect.right, rect.bottom);
        this.I0 = i10;
        this.J0 = i11;
        this.f23995g0.setColor(i11);
        this.K0 = i12;
        this.f23997h0.setColor(i12);
        invalidate();
    }

    public final void v(boolean z10, boolean z11) {
        if (this.f23996g1 != z10) {
            this.f23996g1 = z10;
            ArrayList arrayList = this.f23994f1;
            int i10 = 0;
            if (z10) {
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    super.removeTextChangedListener((TextWatcher) obj);
                }
                return;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                TextWatcher textWatcher = (TextWatcher) obj2;
                super.addTextChangedListener(textWatcher);
                if (z11) {
                    textWatcher.beforeTextChanged("", 0, length(), length());
                    textWatcher.onTextChanged(getText(), 0, length(), length());
                    textWatcher.afterTextChanged(getText());
                }
            }
        }
    }

    public final boolean w() {
        Editable text;
        if (!hasSelection() || getSelectionStart() < 0 || getSelectionEnd() < 0 || getSelectionStart() == getSelectionEnd() || (text = getText()) == null) {
            return false;
        }
        wh0[] wh0VarArr = (wh0[]) text.getSpans(getSelectionStart(), getSelectionEnd(), wh0.class);
        if (wh0VarArr != null && wh0VarArr.length != 0) {
            return false;
        }
        return true;
    }

    public final void x() {
        int selectionStart;
        int i10;
        int i11;
        Layout layout = getLayout();
        if (this.D0) {
            selectionStart = layout.getText().length();
        } else {
            selectionStart = getSelectionStart();
        }
        int lineForOffset = layout.getLineForOffset(selectionStart);
        int lineTop = layout.getLineTop(lineForOffset);
        int lineTop2 = layout.getLineTop(lineForOffset + 1);
        float max = Math.max(0.5f, layout.getPrimaryHorizontal(selectionStart) - 0.5f);
        if (this.l1 == null) {
            this.l1 = new Rect();
        }
        GradientDrawable gradientDrawable = this.f23985b0;
        if (gradientDrawable != null) {
            gradientDrawable.getPadding(this.l1);
            i10 = gradientDrawable.getIntrinsicWidth();
        } else {
            this.l1.setEmpty();
            i10 = 0;
        }
        int scrollX = getScrollX();
        float f7 = max - scrollX;
        int width = (getWidth() - getCompoundPaddingLeft()) - getCompoundPaddingRight();
        float f10 = width;
        if (f7 >= f10 - 1.0f) {
            i11 = (width + scrollX) - (i10 - this.l1.right);
        } else if (Math.abs(f7) > 1.0f && (!TextUtils.isEmpty(getText()) || 1048576 - scrollX > f10 + 1.0f || max > 1.0f)) {
            i11 = ((int) max) - this.l1.left;
        } else {
            i11 = scrollX - this.l1.left;
        }
        int L = org.telegram.messenger.i0.L(this.E0);
        Rect rect = this.l1;
        this.f23985b0.setBounds(i11, lineTop - rect.top, L + i11, lineTop2 + rect.bottom);
        layout.getText();
    }

    public final Drawable y(Drawable drawable, boolean z10) {
        if (drawable != null) {
            if (z10) {
                drawable = drawable.mutate();
            }
            PorterDuffColorFilter porterDuffColorFilter = this.f24014q1;
            if (porterDuffColorFilter != null) {
                drawable.setColorFilter(porterDuffColorFilter);
            }
        }
        return drawable;
    }

    @Override
    public void setSelection(int i10) {
        try {
            super.setSelection(i10);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public ActionMode startActionMode(ActionMode.Callback callback, int i10) {
        if (this.f23984a1 == null && this.f23986b1 == null) {
            return super.startActionMode(callback, i10);
        }
        return startActionMode(callback);
    }

    public void o(ActionMode actionMode, Menu menu) {
    }
}
