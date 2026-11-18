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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.ph0;
public final class w9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.i6 f32276a;
    public final TextView f32277b;
    public final org.telegram.ui.Components.n6 f32278c;
    public final ph0 d;
    public org.telegram.ui.Components.q9 f32279e;
    public final ImageView f32280f;
    public boolean h;
    public boolean f32281n;
    public boolean f32282r;
    public final int f32283s;
    public boolean f32284w;
    public float f32285x;
    public float f32286y;

    public w9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        this(0, context, i6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z10);
        TextView textView = this.f32277b;
        ImageView imageView = this.f32280f;
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f12));
            if (n6Var.getVisibility() == 0) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(n6Var, "alpha", f13));
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
        if (n6Var.getVisibility() == 0) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            n6Var.setAlpha(f11);
        }
        if (imageView.getVisibility() == 0) {
            if (z10) {
                f14 = 1.0f;
            }
            imageView.setAlpha(f14);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f32277b.setText(charSequence);
        this.f32278c.setVisibility(4);
        this.f32280f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f32277b.setText(charSequence);
        this.f32280f.setVisibility(4);
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        if (charSequence2 != null) {
            n6Var.c(charSequence2, z10, true);
            n6Var.setVisibility(0);
        } else {
            n6Var.setVisibility(4);
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
        if (gd.f24216a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView textView = this.f32277b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        if (gd.f24216a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        float f10 = this.f32283s;
        addView(textView, c8.ma.d(-1, -1.0f, i10 | 48, f10, 0.0f, f10, 0.0f));
        if (gd.f24216a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        n6Var.setGravity(i11 | 16);
        removeView(n6Var);
        if (gd.f24216a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(n6Var, c8.ma.d(-2, -1.0f, i12 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (gd.f24216a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(view, c8.ma.d(-2, -2.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f32280f;
        removeView(view2);
        if (!gd.f24216a0) {
            i14 = 5;
        }
        addView(view2, c8.ma.d(-2, -2.0f, i14 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7 = 0;
        float f11 = 0.0f;
        if (this.f32282r || this.f32286y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.O5, this.f32276a));
            }
            if (this.f32284w) {
                float f12 = this.f32285x + 0.016f;
                this.f32285x = f12;
                if (f12 > 1.0f) {
                    this.f32285x = 1.0f;
                    this.f32284w = false;
                }
            } else {
                float f13 = this.f32285x - 0.016f;
                this.f32285x = f13;
                if (f13 < 0.0f) {
                    this.f32285x = 0.0f;
                    this.f32284w = true;
                }
            }
            int i10 = this.G;
            if (i10 > 0) {
                this.G = i10 - 15;
            } else {
                boolean z10 = this.f32282r;
                if (z10) {
                    float f14 = this.f32286y;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f32286y = f15;
                        if (f15 > 1.0f) {
                            this.f32286y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.f32286y;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f32286y = f17;
                        if (f17 < 0.0f) {
                            this.f32286y = 0.0f;
                        }
                    }
                }
            }
            this.H.setAlpha((int) (((this.f32285x * 0.4f) + 0.6f) * this.f32286y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f32283s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f18)) - org.telegram.messenger.g0.L(this.E), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (gd.f24216a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.f32278c.setAlpha(1.0f - this.f32286y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f10 = 58.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (!gd.f24216a0) {
                f11 = L;
            }
            float f19 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (gd.f24216a0) {
                i7 = L;
            }
            canvas.drawLine(f19, measuredHeight2, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
        }
    }

    public TextView getTextView() {
        return this.f32277b;
    }

    public org.telegram.ui.Components.q9 getValueBackupImageView() {
        int i7;
        if (this.f32279e == null) {
            org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(getContext());
            this.f32279e = q9Var;
            if (gd.f24216a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            float f10 = this.f32283s - 4;
            addView(q9Var, c8.ma.d(24, 24.0f, i7 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.f32279e;
    }

    public ImageView getValueImageView() {
        return this.f32280f;
    }

    public org.telegram.ui.Components.n6 getValueTextView() {
        return this.f32278c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.q9 q9Var = this.f32279e;
        if (q9Var != null && q9Var.getImageReceiver() != null && (this.f32279e.getImageReceiver().t() instanceof org.telegram.ui.Components.o5)) {
            ((org.telegram.ui.Components.o5) this.f32279e.getImageReceiver().t()).n(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f32277b.getText());
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        if (n6Var != null && n6Var.getVisibility() == 0) {
            str = "\n" + ((Object) n6Var.getText());
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
        ImageView imageView = this.f32280f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        ph0 ph0Var = this.d;
        if (ph0Var.getVisibility() == 0) {
            ph0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i11 = n10.x(8.0f, ph0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.f32279e;
        if (q9Var != null) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(q9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f32279e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i11 = n10.x(8.0f, this.f32279e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        if (n6Var.getVisibility() == 0) {
            n6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = n10.x(8.0f, n6Var.getMeasuredWidth(), i11);
            } else {
                measuredWidth = (measuredWidth - n6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = gd.f24216a0;
                int i12 = this.f32283s;
                if (z10) {
                    marginLayoutParams.leftMargin = n6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = n6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.f32277b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.I = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f32281n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 1.0f;
        if (!z10 && this.f32281n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f32277b.setAlpha(f10);
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        if (n6Var.getVisibility() == 0) {
            if (!z10 && this.f32281n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            n6Var.setAlpha(f11);
        }
        ImageView imageView = this.f32280f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f32281n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f32277b.getLayoutParams();
        ph0 ph0Var = this.d;
        if (i7 == 0) {
            ph0Var.setVisibility(8);
            boolean z10 = gd.f24216a0;
            int i10 = this.f32283s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        ph0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.u6.s(ph0Var, org.telegram.ui.ActionBar.n6.f29561m6, this.f32276a, PorterDuff.Mode.MULTIPLY);
        ph0Var.setBackground(null);
        ph0Var.setVisibility(0);
        if (gd.f24216a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.f32277b;
        org.telegram.ui.ActionBar.u6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.n6 n6Var = this.f32278c;
        org.telegram.ui.ActionBar.u6.q(n6Var);
        n6Var.setTextColor(i7);
    }

    public w9(Context context) {
        this(0, context, null);
    }

    public w9(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.s2.f26723a;
        this.I = false;
        this.f32276a = i6Var;
        this.f32283s = 21;
        TextView textView = new TextView(context);
        this.f32277b = textView;
        n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((gd.f24216a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, i6Var);
        float f10 = 21;
        addView(textView, c8.ma.d(-1, -1.0f, (gd.f24216a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, true, true, !gd.f24216a0);
        this.f32278c = n6Var;
        n6Var.b(0.55f, 320L, lr.h);
        n6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        n6Var.setGravity((gd.f24216a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.u6.Y(n6Var, org.telegram.ui.ActionBar.n6.I6, i6Var);
        float f11 = 17;
        addView(n6Var, c8.ma.d(-2, -1.0f, (gd.f24216a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.n6.f29561m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, mode);
        imageView.setVisibility(8);
        addView((View) imageView, c8.ma.d(-2, -2.0f, (gd.f24216a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f32280f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, i6Var, mode);
        addView(imageView2, c8.ma.d(-2, -2.0f, (gd.f24216a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
