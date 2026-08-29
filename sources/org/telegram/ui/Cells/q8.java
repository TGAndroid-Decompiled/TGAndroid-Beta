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
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jr;
public class q8 extends FrameLayout {
    public static final fh.g F = new fh.g("animationProgress", 2);
    public int A;
    public final org.telegram.ui.ActionBar.c6 B;
    public aj0 C;
    public boolean D;
    public boolean E;
    public boolean f25080a;
    public int f25081b;
    public final TextView f25082c;
    public final TextView d;
    public final Switch f25083e;
    public boolean f25084f;
    public boolean h;
    public int f25085n;
    public int f25086r;
    public float f25087s;
    public Paint v;
    public float f25088w;
    public ObjectAnimator f25089x;
    public boolean f25090y;

    public q8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.f25080a) {
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
            }
            return measuredWidth;
        }
        return this.f25088w;
    }

    public void setAnimationProgress(float f9) {
        this.f25087s = f9;
        float lastTouchX = getLastTouchX();
        float max = (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f25087s;
        Switch r22 = this.f25083e;
        r22.N = lastTouchX;
        r22.O = getMeasuredHeight() / 2;
        r22.P = max;
        r22.invalidate();
    }

    public final void b(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.f25089x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25089x = null;
        }
        int i11 = this.f25086r;
        if (i11 != 0) {
            setBackgroundColor(i11);
        }
        int i12 = 1;
        if (this.v == null) {
            this.v = new Paint(1);
        }
        if (!z10) {
            i12 = 2;
        }
        this.f25083e.setOverrideColor(i12);
        this.f25086r = i10;
        this.v.setColor(i10);
        this.f25087s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, F, 0.0f, 1.0f);
        this.f25089x = ofFloat;
        ofFloat.addListener(new o8(this, i10, 0));
        this.f25089x.setInterpolator(jr.f29801g);
        this.f25089x.setDuration(240L).start();
    }

    public final void c(int i10, int i11) {
        int i12;
        int i13;
        if (this.C == null) {
            ?? imageView = new ImageView(getContext());
            this.C = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            aj0 aj0Var = this.C;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(aj0Var, i7.f6.d(29, 29.0f, i12 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.A = AndroidUtilities.dp(65.0f);
            TextView textView = this.f25082c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i14 = 70;
            if (LocaleController.isRTL) {
                i13 = 70;
            } else {
                i13 = this.A;
            }
            marginLayoutParams.leftMargin = i13;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (LocaleController.isRTL) {
                i14 = this.A;
            }
            marginLayoutParams2.rightMargin = i14;
        }
        this.C.setVisibility(0);
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.C.setImageResource(i11);
        this.C.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.C.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(9.0f), i10));
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        int v02 = org.telegram.ui.ActionBar.g6.v0(i10, this.B);
        TextView textView = this.f25082c;
        textView.setTextColor(v02);
        this.f25083e.d(i11, i12, i13, i14);
        textView.setTag(Integer.valueOf(i10));
    }

    public final void e(ArrayList arrayList, boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        super.setEnabled(z10);
        Switch r02 = this.f25083e;
        TextView textView = this.f25082c;
        TextView textView2 = this.d;
        float f13 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            float[] fArr = {f11};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r02, property, f12));
            if (textView2.getVisibility() == 0) {
                if (z10) {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(textView2, property, f13));
                return;
            }
            return;
        }
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        textView.setAlpha(f9);
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        r02.setAlpha(f10);
        if (textView2.getVisibility() == 0) {
            if (z10) {
                f13 = 1.0f;
            }
            textView2.setAlpha(f13);
        }
    }

    public final void f(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.g5.a(charSequence, this);
        TextView textView = this.f25082c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.f25083e;
        r12.setVisibility(0);
        r12.c(z10, this.E);
        this.f25084f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.g5.a(str, this);
        TextView textView = this.f25082c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.f25083e;
        r42.setVisibility(0);
        r42.c(z10, false);
        this.f25084f = z12;
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
        return this.f25083e;
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
        Paint paint;
        if (this.f25086r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f25087s, this.v);
        }
        if (this.f25084f) {
            org.telegram.ui.ActionBar.c6 c6Var = this.B;
            if (c6Var != null) {
                paint = c6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.g6.f23183k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                int i10 = 0;
                float f9 = 0.0f;
                if (this.C != null) {
                    if (!LocaleController.isRTL) {
                        f9 = this.A;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (LocaleController.isRTL) {
                        i10 = this.A;
                    }
                    canvas.drawLine(f9, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
                    return;
                }
                int i11 = 0;
                if (!LocaleController.isRTL) {
                    f9 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(20.0f);
                }
                canvas.drawLine(f9, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f25083e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25082c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append('\n');
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.d.getVisibility() == 0) {
            f9 = 64.0f;
        } else {
            f9 = this.f25085n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) + (this.f25084f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f25088w = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.f25080a = z10;
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f25086r != i10) {
            clearAnimation();
            this.f25086r = 0;
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i10) {
        ObjectAnimator objectAnimator = this.f25089x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25089x = null;
        }
        int i11 = this.f25086r;
        if (i11 == 0) {
            if (getBackground() instanceof ColorDrawable) {
                i11 = ((ColorDrawable) getBackground()).getColor();
            } else {
                i11 = 0;
            }
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.v.setColor(i11);
        setBackgroundColor(i10);
        this.f25083e.setOverrideColor(1);
        this.f25086r = i10;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, F, 1.0f, 0.0f).setDuration(240L);
        this.f25089x = duration;
        duration.addListener(new o8(this, i10, 1));
        this.f25089x.setInterpolator(jr.f29801g);
        this.f25089x.start();
    }

    public void setCheckBoxIcon(int i10) {
        this.f25083e.setIcon(i10);
    }

    public void setChecked(boolean z10) {
        this.f25083e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f25084f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.f25090y = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f25083e.setEnabled(z10);
    }

    public void setHeight(int i10) {
        this.f25085n = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        if (this.f25090y) {
            this.f25083e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f25082c.setTypeface(typeface);
    }

    public q8(Context context, int i10) {
        this(i10, context, null, false);
    }

    public q8(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(21, context, c6Var, false);
    }

    public q8(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context);
        this.f25085n = 50;
        this.B = c6Var;
        this.A = i10;
        TextView textView = new TextView(context);
        this.f25082c = textView;
        org.telegram.ui.b.m(z10 ? org.telegram.ui.ActionBar.g6.f23169j5 : org.telegram.ui.ActionBar.g6.G6, c6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView, i7.f6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i10, 0.0f, z11 ? i10 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.b.m(z10 ? org.telegram.ui.ActionBar.g6.J5 : org.telegram.ui.ActionBar.g6.f23450z6, c6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, i7.f6.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i10, 35.0f, z12 ? i10 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, c6Var);
        this.f25083e = r12;
        int i11 = org.telegram.ui.ActionBar.g6.M6;
        int i12 = org.telegram.ui.ActionBar.g6.N6;
        int i13 = org.telegram.ui.ActionBar.g6.f23062d6;
        r12.d(i11, i12, i13, i13);
        addView(r12, i7.f6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.D = LocaleController.isRTL;
    }
}
