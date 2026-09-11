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
import org.telegram.messenger.vl;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.pr;
public class w8 extends FrameLayout {
    public static final t8 J = new t8("animationProgress", 0);
    public int E;
    public final org.telegram.ui.ActionBar.f6 F;
    public aj0 G;
    public boolean H;
    public boolean I;
    public boolean f23487a;
    public int f23488b;
    public final TextView f23489c;
    public final TextView d;
    public final Switch f23490e;
    public boolean f23491f;
    public boolean h;
    public int f23492n;
    public int f23493r;
    public float f23494s;
    public Paint v;
    public float f23495w;
    public ObjectAnimator f23496x;
    public boolean f23497y;

    public w8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.f23487a) {
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
            }
            return measuredWidth;
        }
        return this.f23495w;
    }

    public void setAnimationProgress(float f7) {
        this.f23494s = f7;
        float lastTouchX = getLastTouchX();
        float max = (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f23494s;
        Switch r22 = this.f23490e;
        r22.R = lastTouchX;
        r22.S = getMeasuredHeight() / 2;
        r22.T = max;
        r22.invalidate();
    }

    public final void b(int i10, boolean z10) {
        ObjectAnimator objectAnimator = this.f23496x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23496x = null;
        }
        int i11 = this.f23493r;
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
        this.f23490e.setOverrideColor(i12);
        this.f23493r = i10;
        this.v.setColor(i10);
        this.f23494s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, J, 0.0f, 1.0f);
        this.f23496x = ofFloat;
        ofFloat.addListener(new u8(this, i10, 0));
        this.f23496x.setInterpolator(pr.f29467g);
        this.f23496x.setDuration(240L).start();
    }

    public final void c(int i10, int i11) {
        int i12;
        int i13;
        if (this.G == null) {
            ?? imageView = new ImageView(getContext());
            this.G = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            aj0 aj0Var = this.G;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(aj0Var, w7.x5.d(29, 29.0f, i12 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.E = AndroidUtilities.dp(65.0f);
            TextView textView = this.f23489c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i14 = 70;
            if (LocaleController.isRTL) {
                i13 = 70;
            } else {
                i13 = this.E;
            }
            marginLayoutParams.leftMargin = i13;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (LocaleController.isRTL) {
                i14 = this.E;
            }
            marginLayoutParams2.rightMargin = i14;
        }
        this.G.setVisibility(0);
        this.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.G.setImageResource(i11);
        this.G.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.G.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(9.0f), i10));
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        int v02 = org.telegram.ui.ActionBar.j6.v0(i10, this.F);
        TextView textView = this.f23489c;
        textView.setTextColor(v02);
        this.f23490e.d(i11, i12, i13, i14);
        textView.setTag(Integer.valueOf(i10));
    }

    public final void e(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        super.setEnabled(z10);
        Switch r02 = this.f23490e;
        TextView textView = this.f23489c;
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
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        textView.setAlpha(f7);
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
        TextView textView = this.f23489c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.f23490e;
        r12.setVisibility(0);
        r12.c(z10, this.I);
        this.f23491f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.g5.a(str, this);
        TextView textView = this.f23489c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.f23490e;
        r42.setVisibility(0);
        r42.c(z10, false);
        this.f23491f = z12;
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
        return this.f23490e;
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
        if (this.f23493r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f23494s, this.v);
        }
        if (this.f23491f) {
            org.telegram.ui.ActionBar.f6 f6Var = this.F;
            if (f6Var != null) {
                paint = f6Var.G("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f20785k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                int i10 = 0;
                float f7 = 0.0f;
                if (this.G != null) {
                    if (!LocaleController.isRTL) {
                        f7 = this.E;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (LocaleController.isRTL) {
                        i10 = this.E;
                    }
                    canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
                    return;
                }
                int i11 = 0;
                if (!LocaleController.isRTL) {
                    f7 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(20.0f);
                }
                canvas.drawLine(f7, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f23490e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23489c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append('\n');
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.d.getVisibility() == 0) {
            f7 = 64.0f;
        } else {
            f7 = this.f23492n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + (this.f23491f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f23495w = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.f23487a = z10;
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f23493r != i10) {
            clearAnimation();
            this.f23493r = 0;
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i10) {
        ObjectAnimator objectAnimator = this.f23496x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23496x = null;
        }
        int i11 = this.f23493r;
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
        this.f23490e.setOverrideColor(1);
        this.f23493r = i10;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, J, 1.0f, 0.0f).setDuration(240L);
        this.f23496x = duration;
        duration.addListener(new u8(this, i10, 1));
        this.f23496x.setInterpolator(pr.f29467g);
        this.f23496x.start();
    }

    public void setCheckBoxIcon(int i10) {
        this.f23490e.setIcon(i10);
    }

    public void setChecked(boolean z10) {
        this.f23490e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f23491f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.f23497y = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f23490e.setEnabled(z10);
    }

    public void setHeight(int i10) {
        this.f23492n = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        if (this.f23497y) {
            this.f23490e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f23489c.setTypeface(typeface);
    }

    public w8(Context context, int i10) {
        this(i10, context, null, false);
    }

    public w8(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(21, context, f6Var, false);
    }

    public w8(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context);
        this.f23492n = 50;
        this.F = f6Var;
        this.E = i10;
        TextView textView = new TextView(context);
        this.f23489c = textView;
        vl.n(z10 ? org.telegram.ui.ActionBar.j6.f20770j5 : org.telegram.ui.ActionBar.j6.G6, f6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView, w7.x5.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i10, 0.0f, z11 ? i10 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        vl.n(z10 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.f21061z6, f6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, w7.x5.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i10, 35.0f, z12 ? i10 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, f6Var);
        this.f23490e = r12;
        int i11 = org.telegram.ui.ActionBar.j6.M6;
        int i12 = org.telegram.ui.ActionBar.j6.N6;
        int i13 = org.telegram.ui.ActionBar.j6.f20663d6;
        r12.d(i11, i12, i13, i13);
        addView(r12, w7.x5.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.H = LocaleController.isRTL;
    }
}
