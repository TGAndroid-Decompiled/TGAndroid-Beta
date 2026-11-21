package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.rh0;
public final class x9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.h6 f32357a;
    public final TextView f32358b;
    public final org.telegram.ui.Components.o6 f32359c;
    public final rh0 d;
    public org.telegram.ui.Components.q9 f32360e;
    public final ImageView f32361f;
    public boolean h;
    public boolean f32362n;
    public boolean f32363r;
    public final int f32364s;
    public boolean f32365w;
    public float f32366x;
    public float f32367y;

    public x9(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        this(0, context, h6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z10);
        TextView textView = this.f32358b;
        ImageView imageView = this.f32361f;
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f12));
            if (o6Var.getVisibility() == 0) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(o6Var, "alpha", f13));
            }
            if (imageView.getVisibility() == 0) {
                if (z10) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", f14));
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
        if (o6Var.getVisibility() == 0) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            o6Var.setAlpha(f11);
        }
        if (imageView.getVisibility() == 0) {
            if (z10) {
                f14 = 1.0f;
            }
            imageView.setAlpha(f14);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f32358b.setText(charSequence);
        this.f32359c.setVisibility(4);
        this.f32361f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f32358b.setText(charSequence);
        this.f32361f.setVisibility(4);
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        if (charSequence2 != null) {
            o6Var.c(charSequence2, z10, true);
            o6Var.setVisibility(0);
        } else {
            o6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 3;
        if (gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView textView = this.f32358b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        if (gd.f24241a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        float f10 = this.f32364s;
        addView(textView, c8.ma.d(-1, -1.0f, i10 | 48, f10, 0.0f, f10, 0.0f));
        if (gd.f24241a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        o6Var.setGravity(i11 | 16);
        removeView(o6Var);
        if (gd.f24241a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(o6Var, c8.ma.d(-2, -1.0f, i12 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (gd.f24241a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(view, c8.ma.d(-2, -2.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f32361f;
        removeView(view2);
        if (!gd.f24241a0) {
            i14 = 5;
        }
        addView(view2, c8.ma.d(-2, -2.0f, i14 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7 = 0;
        float f11 = 0.0f;
        if (this.f32363r || this.f32367y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.O5, this.f32357a));
            }
            if (this.f32365w) {
                float f12 = this.f32366x + 0.016f;
                this.f32366x = f12;
                if (f12 > 1.0f) {
                    this.f32366x = 1.0f;
                    this.f32365w = false;
                }
            } else {
                float f13 = this.f32366x - 0.016f;
                this.f32366x = f13;
                if (f13 < 0.0f) {
                    this.f32366x = 0.0f;
                    this.f32365w = true;
                }
            }
            int i10 = this.G;
            if (i10 > 0) {
                this.G = i10 - 15;
            } else {
                boolean z10 = this.f32363r;
                if (z10) {
                    float f14 = this.f32367y;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f32367y = f15;
                        if (f15 > 1.0f) {
                            this.f32367y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.f32367y;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f32367y = f17;
                        if (f17 < 0.0f) {
                            this.f32367y = 0.0f;
                        }
                    }
                }
            }
            this.H.setAlpha((int) (((this.f32366x * 0.4f) + 0.6f) * this.f32367y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f32364s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f18)) - org.telegram.messenger.g0.L(this.E), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (gd.f24241a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.f32359c.setAlpha(1.0f - this.f32367y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f10 = 58.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (!gd.f24241a0) {
                f11 = L;
            }
            float f19 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (gd.f24241a0) {
                i7 = L;
            }
            canvas.drawLine(f19, measuredHeight2, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    public TextView getTextView() {
        return this.f32358b;
    }

    public org.telegram.ui.Components.q9 getValueBackupImageView() {
        int i7;
        if (this.f32360e == null) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
            this.f32360e = q9Var;
            if (gd.f24241a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            float f10 = this.f32364s - 4;
            addView(q9Var, c8.ma.d(24, 24.0f, i7 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.f32360e;
    }

    public ImageView getValueImageView() {
        return this.f32361f;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.f32359c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q9 q9Var = this.f32360e;
        if (q9Var != null && q9Var.getImageReceiver() != null && (this.f32360e.getImageReceiver().t() instanceof org.telegram.ui.Components.p5)) {
            ((org.telegram.ui.Components.p5) this.f32360e.getImageReceiver().t()).n(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f32358b.getText());
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        if (o6Var != null && o6Var.getVisibility() == 0) {
            str = "\n" + ((Object) o6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        if (this.F && getParent() != null) {
            this.G = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        if (this.I) {
            i11 = measuredWidth;
        } else {
            i11 = measuredWidth / 2;
        }
        ImageView imageView = this.f32361f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        rh0 rh0Var = this.d;
        if (rh0Var.getVisibility() == 0) {
            rh0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i11 = n10.x(8.0f, rh0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.f32360e;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(q9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32360e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i11 = n10.x(8.0f, this.f32360e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = n10.x(8.0f, o6Var.getMeasuredWidth(), i11);
            } else {
                measuredWidth = (measuredWidth - o6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = gd.f24241a0;
                int i12 = this.f32364s;
                if (z10) {
                    marginLayoutParams.leftMargin = o6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = o6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.f32358b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.I = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f32362n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 1.0f;
        if (!z10 && this.f32362n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f32358b.setAlpha(f10);
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        if (o6Var.getVisibility() == 0) {
            if (!z10 && this.f32362n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            o6Var.setAlpha(f11);
        }
        ImageView imageView = this.f32361f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f32362n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32358b.getLayoutParams();
        rh0 rh0Var = this.d;
        if (i7 == 0) {
            rh0Var.setVisibility(8);
            boolean z10 = gd.f24241a0;
            int i10 = this.f32364s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        rh0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.t6.s(rh0Var, org.telegram.ui.ActionBar.m6.f29543m6, this.f32357a, PorterDuff.Mode.MULTIPLY);
        rh0Var.setBackground(null);
        rh0Var.setVisibility(0);
        if (gd.f24241a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.f32358b;
        org.telegram.ui.ActionBar.t6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.o6 o6Var = this.f32359c;
        org.telegram.ui.ActionBar.t6.q(o6Var);
        o6Var.setTextColor(i7);
    }

    public x9(Context context) {
        this(0, context, null);
    }

    public x9(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.s2.f26749a;
        this.I = false;
        this.f32357a = h6Var;
        this.f32364s = 21;
        TextView textView = new TextView(context);
        this.f32358b = textView;
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((gd.f24241a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        float f10 = 21;
        addView(textView, c8.ma.d(-1, -1.0f, (gd.f24241a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !gd.f24241a0);
        this.f32359c = o6Var;
        o6Var.b(0.55f, 320L, nr.h);
        o6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        o6Var.setGravity((gd.f24241a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.I6, h6Var);
        float f11 = 17;
        addView(o6Var, c8.ma.d(-2, -1.0f, (gd.f24241a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.m6.f29543m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, mode);
        imageView.setVisibility(8);
        addView((View) imageView, c8.ma.d(-2, -2.0f, (gd.f24241a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f32361f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        org.telegram.ui.ActionBar.t6.s(imageView2, i10, h6Var, mode);
        addView(imageView2, c8.ma.d(-2, -2.0f, (gd.f24241a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
