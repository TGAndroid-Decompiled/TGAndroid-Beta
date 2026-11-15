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
import org.telegram.messenger.i20;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
public class q8 extends FrameLayout {
    public static final n8 K = new n8("animationProgress", 0);
    public boolean E;
    public int F;
    public final org.telegram.ui.ActionBar.e6 G;
    public fh0 H;
    public boolean I;
    public boolean J;
    public boolean f31307a;
    public int f31308b;
    public final TextView f31309c;
    public final TextView d;
    public final Switch f31310e;
    public boolean f31311f;
    public boolean h;
    public int f31312n;
    public int f31313r;
    public float f31314s;
    public Paint f31315w;
    public float f31316x;
    public ObjectAnimator f31317y;

    public q8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.f31307a) {
            if (hd.f24101a0) {
                measuredWidth = org.telegram.messenger.g0.L(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(42.0f);
            }
            return measuredWidth;
        }
        return this.f31316x;
    }

    public void setAnimationProgress(float f10) {
        this.f31314s = f10;
        float lastTouchX = getLastTouchX();
        float max = (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + org.telegram.messenger.g0.L(40.0f)) * this.f31314s;
        Switch r22 = this.f31310e;
        r22.R = lastTouchX;
        r22.S = getMeasuredHeight() / 2;
        r22.T = max;
        r22.invalidate();
    }

    public final void b(int i7, boolean z10) {
        ObjectAnimator objectAnimator = this.f31317y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31317y = null;
        }
        int i10 = this.f31313r;
        if (i10 != 0) {
            setBackgroundColor(i10);
        }
        int i11 = 1;
        if (this.f31315w == null) {
            this.f31315w = new Paint(1);
        }
        if (!z10) {
            i11 = 2;
        }
        this.f31310e.setOverrideColor(i11);
        this.f31313r = i7;
        this.f31315w.setColor(i7);
        this.f31314s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, K, 0.0f, 1.0f);
        this.f31317y = ofFloat;
        ofFloat.addListener(new o8(this, i7, 0));
        this.f31317y.setInterpolator(er.f34421g);
        this.f31317y.setDuration(240L).start();
    }

    public final void c(int i7, int i10) {
        int i11;
        int i12;
        if (this.H == null) {
            ?? imageView = new ImageView(getContext());
            this.H = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            fh0 fh0Var = this.H;
            if (hd.f24101a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(fh0Var, c8.ja.d(29, 29.0f, i11 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.F = org.telegram.messenger.g0.L(65.0f);
            TextView textView = this.f31309c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i13 = 70;
            if (hd.f24101a0) {
                i12 = 70;
            } else {
                i12 = this.F;
            }
            marginLayoutParams.leftMargin = i12;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (hd.f24101a0) {
                i13 = this.F;
            }
            marginLayoutParams2.rightMargin = i13;
        }
        this.H.setVisibility(0);
        this.H.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f));
        this.H.setImageResource(i10);
        this.H.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.H.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(9.0f), i7));
    }

    public final void d(int i7, int i10, int i11, int i12, int i13) {
        org.telegram.ui.ActionBar.e6 e6Var = this.G;
        TextView textView = this.f31309c;
        org.telegram.ui.ActionBar.q6.U(textView, i7, e6Var);
        this.f31310e.d(i10, i11, i12, i13);
        textView.setTag(Integer.valueOf(i7));
    }

    public final void e(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        super.setEnabled(z10);
        Switch r02 = this.f31310e;
        TextView textView = this.f31309c;
        TextView textView2 = this.d;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            float[] fArr = {f12};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r02, property, f13));
            if (textView2.getVisibility() == 0) {
                if (z10) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(textView2, property, f14));
                return;
            }
            return;
        }
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        r02.setAlpha(f11);
        if (textView2.getVisibility() == 0) {
            if (z10) {
                f14 = 1.0f;
            }
            textView2.setAlpha(f14);
        }
    }

    public final void f(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.f5.a(charSequence, this);
        TextView textView = this.f31309c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.f31310e;
        r12.setVisibility(0);
        r12.c(z10, this.J);
        this.f31311f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.f5.a(str, this);
        TextView textView = this.f31309c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.f31310e;
        r42.setVisibility(0);
        r42.c(z10, false);
        this.f31311f = z12;
        textView2.setVisibility(0);
        this.h = z11;
        if (z11) {
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
        setWillNotDraw(!z12);
    }

    public Switch getCheckBox() {
        return this.f31310e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.J = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.J = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        if (this.f31313r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + org.telegram.messenger.g0.L(40.0f)) * this.f31314s, this.f31315w);
        }
        if (this.f31311f) {
            org.telegram.ui.ActionBar.e6 e6Var = this.G;
            if (e6Var != null) {
                paint = e6Var.d("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.j6.f28972k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                int i7 = 0;
                float f10 = 0.0f;
                if (this.H != null) {
                    if (!hd.f24101a0) {
                        f10 = this.F;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (hd.f24101a0) {
                        i7 = this.F;
                    }
                    canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, paint2);
                    return;
                }
                int i10 = 0;
                if (!hd.f24101a0) {
                    f10 = org.telegram.messenger.g0.L(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (hd.f24101a0) {
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
        accessibilityNodeInfo.setChecked(this.f31310e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f31309c.getText());
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
            f10 = this.f31312n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.f31311f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f31316x = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.f31307a = z10;
    }

    @Override
    public void setBackgroundColor(int i7) {
        if (this.f31313r != i7) {
            clearAnimation();
            this.f31313r = 0;
            super.setBackgroundColor(i7);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i7) {
        ObjectAnimator objectAnimator = this.f31317y;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f31317y = null;
        }
        int i10 = this.f31313r;
        if (i10 == 0) {
            if (getBackground() instanceof ColorDrawable) {
                i10 = ((ColorDrawable) getBackground()).getColor();
            } else {
                i10 = 0;
            }
        }
        if (this.f31315w == null) {
            this.f31315w = new Paint(1);
        }
        this.f31315w.setColor(i10);
        setBackgroundColor(i7);
        this.f31310e.setOverrideColor(1);
        this.f31313r = i7;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, K, 1.0f, 0.0f).setDuration(240L);
        this.f31317y = duration;
        duration.addListener(new o8(this, i7, 1));
        this.f31317y.setInterpolator(er.f34421g);
        this.f31317y.start();
    }

    public void setCheckBoxIcon(int i7) {
        this.f31310e.setIcon(i7);
    }

    public void setChecked(boolean z10) {
        this.f31310e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f31311f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.E = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f31310e.setEnabled(z10);
    }

    public void setHeight(int i7) {
        this.f31312n = i7;
    }

    @Override
    public void setPressed(boolean z10) {
        if (this.E) {
            this.f31310e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f31309c.setTypeface(typeface);
    }

    public q8(Context context, int i7) {
        this(i7, context, null, false);
    }

    public q8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(21, context, e6Var, false);
    }

    public q8(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context);
        this.f31312n = 50;
        this.G = e6Var;
        this.F = i7;
        TextView textView = new TextView(context);
        this.f31309c = textView;
        org.telegram.ui.ActionBar.q6.U(textView, z10 ? org.telegram.ui.ActionBar.j6.f28957j5 : org.telegram.ui.ActionBar.j6.G6, e6Var);
        i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setGravity((hd.f24101a0 ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = hd.f24101a0;
        addView(textView, c8.ja.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i7, 0.0f, z11 ? i7 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.ActionBar.q6.U(textView2, z10 ? org.telegram.ui.ActionBar.j6.J5 : org.telegram.ui.ActionBar.j6.f29260z6, e6Var);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(hd.f24101a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = hd.f24101a0;
        addView(textView2, c8.ja.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i7, 35.0f, z12 ? i7 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, e6Var);
        this.f31310e = r12;
        int i10 = org.telegram.ui.ActionBar.j6.M6;
        int i11 = org.telegram.ui.ActionBar.j6.N6;
        int i12 = org.telegram.ui.ActionBar.j6.f28849d6;
        r12.d(i10, i11, i12, i12);
        addView(r12, c8.ja.d(37, 20.0f, (hd.f24101a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.I = hd.f24101a0;
    }
}
