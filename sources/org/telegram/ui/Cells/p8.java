package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ri0;

public class p8 extends FrameLayout {
    public static final dh.g F = new dh.g("animationProgress", 2);
    public int A;
    public final org.telegram.ui.ActionBar.c6 B;
    public ri0 C;
    public boolean D;
    public boolean E;

    public boolean f25000a;

    public int f25001b;

    public final TextView f25002c;
    public final TextView d;

    public final Switch f25003e;

    public boolean f25004f;
    public boolean h;

    public int f25005n;

    public int f25006r;

    public float f25007s;
    public Paint v;

    public float f25008w;

    public ObjectAnimator f25009x;

    public boolean f25010y;

    public p8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        if (this.f25000a) {
            return LocaleController.isRTL ? AndroidUtilities.dp(22.0f) : getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        }
        return this.f25008w;
    }

    public void setAnimationProgress(float f10) {
        this.f25007s = f10;
        float lastTouchX = getLastTouchX();
        float fMax = Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        float f11 = fMax * this.f25007s;
        Switch r10 = this.f25003e;
        r10.N = lastTouchX;
        r10.O = measuredHeight;
        r10.P = f11;
        r10.invalidate();
    }

    public final void b(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.f25009x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25009x = null;
        }
        int i11 = this.f25006r;
        if (i11 != 0) {
            setBackgroundColor(i11);
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.f25003e.setOverrideColor(z10 ? 1 : 2);
        this.f25006r = i10;
        this.v.setColor(i10);
        this.f25007s = 0.0f;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, F, 0.0f, 1.0f);
        this.f25009x = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new n8(this, i10, 0));
        this.f25009x.setInterpolator(er.f28123g);
        this.f25009x.setDuration(240L).start();
    }

    public final void c(int i10, int i11) {
        if (this.C == null) {
            ri0 ri0Var = new ri0(getContext());
            this.C = ri0Var;
            ri0Var.setScaleType(ImageView.ScaleType.CENTER);
            addView(this.C, h7.z5.d(29, 29.0f, (LocaleController.isRTL ? 5 : 3) | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.A = AndroidUtilities.dp(65.0f);
            TextView textView = this.f25002c;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = LocaleController.isRTL ? 70 : this.A;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = LocaleController.isRTL ? this.A : 70;
        }
        this.C.setVisibility(0);
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.C.setImageResource(i11);
        this.C.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.C.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(9.0f), i10));
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i10, this.B);
        TextView textView = this.f25002c;
        textView.setTextColor(iV0);
        this.f25003e.d(i11, i12, i13, i14);
        textView.setTag(Integer.valueOf(i10));
    }

    public final void e(ArrayList arrayList, boolean z10) {
        super.setEnabled(z10);
        Switch r10 = this.f25003e;
        TextView textView = this.f25002c;
        TextView textView2 = this.d;
        if (arrayList == null) {
            textView.setAlpha(z10 ? 1.0f : 0.5f);
            r10.setAlpha(z10 ? 1.0f : 0.5f);
            if (textView2.getVisibility() == 0) {
                textView2.setAlpha(z10 ? 1.0f : 0.5f);
                return;
            }
            return;
        }
        float[] fArr = {z10 ? 1.0f : 0.5f};
        Property property = View.ALPHA;
        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, fArr));
        arrayList.add(ObjectAnimator.ofFloat(r10, (Property<Switch, Float>) property, z10 ? 1.0f : 0.5f));
        if (textView2.getVisibility() == 0) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, z10 ? 1.0f : 0.5f));
        }
    }

    public final void f(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.g5.a(charSequence, this);
        TextView textView = this.f25002c;
        textView.setText(charSequence);
        this.h = false;
        Switch r10 = this.f25003e;
        r10.setVisibility(0);
        r10.c(z10, this.E);
        this.f25004f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.g5.a(str, this);
        TextView textView = this.f25002c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r10 = this.f25003e;
        r10.setVisibility(0);
        r10.c(z10, false);
        this.f25004f = z12;
        textView2.setVisibility(0);
        this.h = z11;
        if (z11) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, AndroidUtilities.dp(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z12);
    }

    public Switch getCheckBox() {
        return this.f25003e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        if (this.f25006r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f25007s, this.v);
        }
        if (this.f25004f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.B;
            Paint paintN = c6Var != null ? c6Var.N("paintDivider") : org.telegram.ui.ActionBar.g6.f23175k0;
            if (paintN != null) {
                if (this.C != null) {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : this.A, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? this.A : 0), getMeasuredHeight() - 1, paintN);
                } else {
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, paintN);
                }
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f25003e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25002c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append('\n');
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.d.getVisibility() == 0 ? 64.0f : this.f25005n) + (this.f25004f ? 1 : 0), 1073741824));
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f25008w = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.f25000a = z10;
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f25006r != i10) {
            clearAnimation();
            this.f25006r = 0;
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i10) {
        ObjectAnimator objectAnimator = this.f25009x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25009x = null;
        }
        int color = this.f25006r;
        if (color == 0) {
            color = getBackground() instanceof ColorDrawable ? ((ColorDrawable) getBackground()).getColor() : 0;
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.v.setColor(color);
        setBackgroundColor(i10);
        this.f25003e.setOverrideColor(1);
        this.f25006r = i10;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, F, 1.0f, 0.0f).setDuration(240L);
        this.f25009x = duration;
        duration.addListener(new n8(this, i10, 1));
        this.f25009x.setInterpolator(er.f28123g);
        this.f25009x.start();
    }

    public void setCheckBoxIcon(int i10) {
        this.f25003e.setIcon(i10);
    }

    public void setChecked(boolean z10) {
        this.f25003e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f25004f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.f25010y = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f25003e.setEnabled(z10);
    }

    public void setHeight(int i10) {
        this.f25005n = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        if (this.f25010y) {
            this.f25003e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f25002c.setTypeface(typeface);
    }

    public p8(Context context, int i10) {
        this(i10, context, null, false);
    }

    public p8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(21, context, c6Var, false);
    }

    public p8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f25005n = 50;
        this.B = c6Var;
        this.A = i10;
        TextView textView = new TextView(context);
        this.f25002c = textView;
        rl.l(z10 ? org.telegram.ui.ActionBar.g6.f23161j5 : org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i10, 0.0f, z11 ? i10 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        rl.l(z10 ? org.telegram.ui.ActionBar.g6.J5 : org.telegram.ui.ActionBar.g6.f23441z6, c6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i10, 35.0f, z12 ? i10 : 70.0f, 0.0f));
        Switch r10 = new Switch(context, c6Var);
        this.f25003e = r10;
        int i11 = org.telegram.ui.ActionBar.g6.M6;
        int i12 = org.telegram.ui.ActionBar.g6.N6;
        int i13 = org.telegram.ui.ActionBar.g6.f23053d6;
        r10.d(i11, i12, i13, i13);
        addView(r10, h7.z5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.D = LocaleController.isRTL;
    }
}
