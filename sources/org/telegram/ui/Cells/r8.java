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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
public class r8 extends FrameLayout {
    public static final o8 J = new o8("animationProgress", 0);
    public boolean D;
    public int E;
    public final org.telegram.ui.ActionBar.f6 F;
    public ch0 G;
    public boolean H;
    public boolean I;
    public boolean f30202a;
    public int f30203b;
    public final TextView f30204c;
    public final TextView d;
    public final Switch f30205e;
    public boolean f30206f;
    public boolean h;
    public int f30207n;
    public int f30208r;
    public float f30209s;
    public Paint f30210w;
    public float f30211x;
    public ObjectAnimator f30212y;

    public r8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.f30202a) {
            if (hd.f22871a0) {
                measuredWidth = org.telegram.messenger.g0.L(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
            }
            return measuredWidth;
        }
        return this.f30211x;
    }

    public void setAnimationProgress(float f10) {
        this.f30209s = f10;
        float lastTouchX = getLastTouchX();
        float max = (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + org.telegram.messenger.g0.L(40.0f)) * this.f30209s;
        Switch r22 = this.f30205e;
        r22.Q = lastTouchX;
        r22.R = getMeasuredHeight() / 2;
        r22.S = max;
        r22.invalidate();
    }

    public final void b(int i7, boolean z9) {
        ObjectAnimator objectAnimator = this.f30212y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f30212y = null;
        }
        int i10 = this.f30208r;
        if (i10 != 0) {
            setBackgroundColor(i10);
        }
        int i11 = 1;
        if (this.f30210w == null) {
            this.f30210w = new Paint(1);
        }
        if (!z9) {
            i11 = 2;
        }
        this.f30205e.setOverrideColor(i11);
        this.f30208r = i7;
        this.f30210w.setColor(i7);
        this.f30209s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, J, 0.0f, 1.0f);
        this.f30212y = ofFloat;
        ofFloat.addListener(new p8(this, i7, 0));
        this.f30212y.setInterpolator(xq.f40311g);
        this.f30212y.setDuration(240L).start();
    }

    public final void c(int i7, int i10) {
        int i11;
        int i12;
        if (this.G == null) {
            ?? imageView = new ImageView(getContext());
            this.G = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            ch0 ch0Var = this.G;
            if (hd.f22871a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(ch0Var, c8.ha.d(29, 29.0f, i11 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.E = org.telegram.messenger.g0.L(65.0f);
            TextView textView = this.f30204c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i13 = 70;
            if (hd.f22871a0) {
                i12 = 70;
            } else {
                i12 = this.E;
            }
            marginLayoutParams.leftMargin = i12;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (hd.f22871a0) {
                i13 = this.E;
            }
            marginLayoutParams2.rightMargin = i13;
        }
        this.G.setVisibility(0);
        this.G.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.G.setImageResource(i10);
        this.G.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.G.setBackground(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(9.0f), i7));
    }

    public final void d(int i7, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.f6 f6Var = this.F;
        TextView textView = this.f30204c;
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        this.f30205e.d(i10, i11, i12, i13);
        textView.setTag(Integer.valueOf(i7));
    }

    public final void e(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        super.setEnabled(z9);
        Switch r02 = this.f30205e;
        TextView textView = this.f30204c;
        TextView textView2 = this.d;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            float[] fArr = {f12};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z9) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r02, property, f13));
            if (textView2.getVisibility() == 0) {
                if (z9) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(textView2, property, f14));
                return;
            }
            return;
        }
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z9) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        r02.setAlpha(f11);
        if (textView2.getVisibility() == 0) {
            if (z9) {
                f14 = 1.0f;
            }
            textView2.setAlpha(f14);
        }
    }

    public final void f(CharSequence charSequence, boolean z9, boolean z10) {
        org.telegram.ui.f5.a(charSequence, this);
        TextView textView = this.f30204c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.f30205e;
        r12.setVisibility(0);
        r12.c(z9, this.I);
        this.f30206f = z10;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void g(String str, String str2, boolean z9, boolean z10, boolean z11) {
        org.telegram.ui.f5.a(str, this);
        TextView textView = this.f30204c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.f30205e;
        r42.setVisibility(0);
        r42.c(z9, false);
        this.f30206f = z11;
        textView2.setVisibility(0);
        this.h = z10;
        if (z10) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, org.telegram.messenger.g0.L(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = org.telegram.messenger.g0.L(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public Switch getCheckBox() {
        return this.f30205e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        if (this.f30208r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + org.telegram.messenger.g0.L(40.0f)) * this.f30209s, this.f30210w);
        }
        if (this.f30206f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.F;
            if (f6Var != null) {
                paint = f6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f27971k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                int i7 = 0;
                float f10 = 0.0f;
                if (this.G != null) {
                    if (!hd.f22871a0) {
                        f10 = this.E;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (hd.f22871a0) {
                        i7 = this.E;
                    }
                    canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
                    return;
                }
                int i10 = 0;
                if (!hd.f22871a0) {
                    f10 = org.telegram.messenger.g0.L(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (hd.f22871a0) {
                    i10 = org.telegram.messenger.g0.L(20.0f);
                }
                canvas.drawLine(f10, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f30205e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f30204c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append('\n');
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.d.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f30207n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.f30206f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f30211x = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z9) {
        this.f30202a = z9;
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f30208r != i7) {
            clearAnimation();
            this.f30208r = 0;
            super.setBackgroundColor(i7);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i7) {
        ObjectAnimator objectAnimator = this.f30212y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f30212y = null;
        }
        int i10 = this.f30208r;
        if (i10 == 0) {
            if (getBackground() instanceof ColorDrawable) {
                i10 = ((ColorDrawable) getBackground()).getColor();
            } else {
                i10 = 0;
            }
        }
        if (this.f30210w == null) {
            this.f30210w = new Paint(1);
        }
        this.f30210w.setColor(i10);
        setBackgroundColor(i7);
        this.f30205e.setOverrideColor(1);
        this.f30208r = i7;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, J, 1.0f, 0.0f).setDuration(240L);
        this.f30212y = duration;
        duration.addListener(new p8(this, i7, 1));
        this.f30212y.setInterpolator(xq.f40311g);
        this.f30212y.start();
    }

    public void setCheckBoxIcon(int i7) {
        this.f30205e.setIcon(i7);
    }

    public void setChecked(boolean z9) {
        this.f30205e.c(z9, true);
    }

    public void setDivider(boolean z9) {
        this.f30206f = z9;
        setWillNotDraw(!z9);
    }

    public void setDrawCheckRipple(boolean z9) {
        this.D = z9;
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        this.f30205e.setEnabled(z9);
    }

    public void setHeight(int i7) {
        this.f30207n = i7;
    }

    @Override
    public void setPressed(boolean z9) {
        if (this.D) {
            this.f30205e.setDrawRipple(z9);
        }
        super.setPressed(z9);
    }

    public void setTypeface(Typeface typeface) {
        this.f30204c.setTypeface(typeface);
    }

    public r8(Context context, int i7) {
        this(i7, context, null, false);
    }

    public r8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(21, context, f6Var, false);
    }

    public r8(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context);
        this.f30207n = 50;
        this.F = f6Var;
        this.E = i7;
        TextView textView = new TextView(context);
        this.f30204c = textView;
        org.telegram.ui.ActionBar.r6.V(textView, z9 ? org.telegram.ui.ActionBar.k6.f27956j5 : org.telegram.ui.ActionBar.k6.G6, f6Var);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((hd.f22871a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = hd.f22871a0;
        addView(textView, c8.ha.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 70.0f : i7, 0.0f, z10 ? i7 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, z9 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.f28258z6, f6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(hd.f22871a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = hd.f22871a0;
        addView(textView2, c8.ha.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i7, 35.0f, z11 ? i7 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, f6Var);
        this.f30205e = r12;
        int i10 = org.telegram.ui.ActionBar.k6.M6;
        int i11 = org.telegram.ui.ActionBar.k6.N6;
        int i12 = org.telegram.ui.ActionBar.k6.f27848d6;
        r12.d(i10, i11, i12, i12);
        addView(r12, c8.ha.d(37, 20.0f, (hd.f22871a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.H = hd.f22871a0;
    }
}
