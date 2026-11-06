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
import org.telegram.messenger.hd;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.xq;
public final class w9 extends FrameLayout {
    public int D;
    public boolean E;
    public int F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.ActionBar.f6 f30741a;
    public final TextView f30742b;
    public final org.telegram.ui.Components.j6 f30743c;
    public final ch0 d;
    public org.telegram.ui.Components.l9 f30744e;
    public final ImageView f30745f;
    public boolean h;
    public boolean f30746n;
    public boolean f30747r;
    public final int f30748s;
    public boolean f30749w;
    public float f30750x;
    public float f30751y;

    public w9(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(0, context, f6Var);
    }

    public final void a(ArrayList arrayList, boolean z9) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z9);
        TextView textView = this.f30742b;
        ImageView imageView = this.f30745f;
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f12));
            if (j6Var.getVisibility() == 0) {
                if (z9) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(j6Var, "alpha", f13));
            }
            if (imageView.getVisibility() == 0) {
                if (z9) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", f14));
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
        if (j6Var.getVisibility() == 0) {
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            j6Var.setAlpha(f11);
        }
        if (imageView.getVisibility() == 0) {
            if (z9) {
                f14 = 1.0f;
            }
            imageView.setAlpha(f14);
        }
    }

    public final void b(CharSequence charSequence, boolean z9) {
        this.f30742b.setText(charSequence);
        this.f30743c.setVisibility(4);
        this.f30745f.setVisibility(4);
        this.h = z9;
        setWillNotDraw(!z9);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z9, boolean z10) {
        this.f30742b.setText(charSequence);
        this.f30745f.setVisibility(4);
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        if (charSequence2 != null) {
            j6Var.c(charSequence2, z9, true);
            j6Var.setVisibility(0);
        } else {
            j6Var.setVisibility(4);
        }
        this.h = z10;
        setWillNotDraw(true ^ z10);
        requestLayout();
    }

    public final void d() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 3;
        if (hd.f22871a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView textView = this.f30742b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        if (hd.f22871a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        float f10 = this.f30748s;
        addView(textView, c8.ha.d(-1, -1.0f, i10 | 48, f10, 0.0f, f10, 0.0f));
        if (hd.f22871a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        j6Var.setGravity(i11 | 16);
        removeView(j6Var);
        if (hd.f22871a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(j6Var, c8.ha.d(-2, -1.0f, i12 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (hd.f22871a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(view, c8.ha.d(-2, -2.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f30745f;
        removeView(view2);
        if (!hd.f22871a0) {
            i14 = 5;
        }
        addView(view2, c8.ha.d(-2, -2.0f, i14 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7 = 0;
        float f11 = 0.0f;
        if (this.f30747r || this.f30751y != 0.0f) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.f30741a));
            }
            if (this.f30749w) {
                float f12 = this.f30750x + 0.016f;
                this.f30750x = f12;
                if (f12 > 1.0f) {
                    this.f30750x = 1.0f;
                    this.f30749w = false;
                }
            } else {
                float f13 = this.f30750x - 0.016f;
                this.f30750x = f13;
                if (f13 < 0.0f) {
                    this.f30750x = 0.0f;
                    this.f30749w = true;
                }
            }
            int i10 = this.F;
            if (i10 > 0) {
                this.F = i10 - 15;
            } else {
                boolean z9 = this.f30747r;
                if (z9) {
                    float f14 = this.f30751y;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f30751y = f15;
                        if (f15 > 1.0f) {
                            this.f30751y = 1.0f;
                        }
                    }
                }
                if (!z9) {
                    float f16 = this.f30751y;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f30751y = f17;
                        if (f17 < 0.0f) {
                            this.f30751y = 0.0f;
                        }
                    }
                }
            }
            this.G.setAlpha((int) (((this.f30750x * 0.4f) + 0.6f) * this.f30751y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f30748s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f18)) - org.telegram.messenger.g0.L(this.D), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (hd.f22871a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.G);
            invalidate();
        }
        this.f30743c.setAlpha(1.0f - this.f30751y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f10 = 58.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (!hd.f22871a0) {
                f11 = L;
            }
            float f19 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (hd.f22871a0) {
                i7 = L;
            }
            canvas.drawLine(f19, measuredHeight2, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    public TextView getTextView() {
        return this.f30742b;
    }

    public org.telegram.ui.Components.l9 getValueBackupImageView() {
        int i7;
        if (this.f30744e == null) {
            org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getContext());
            this.f30744e = l9Var;
            if (hd.f22871a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            float f10 = this.f30748s - 4;
            addView(l9Var, c8.ha.d(24, 24.0f, i7 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.f30744e;
    }

    public ImageView getValueImageView() {
        return this.f30745f;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.f30743c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.l9 l9Var = this.f30744e;
        if (l9Var != null && l9Var.getImageReceiver() != null && (this.f30744e.getImageReceiver().t() instanceof org.telegram.ui.Components.i5)) {
            ((org.telegram.ui.Components.i5) this.f30744e.getImageReceiver().t()).n(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f30742b.getText());
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        if (j6Var != null && j6Var.getVisibility() == 0) {
            str = "\n" + ((Object) j6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (this.E && getParent() != null) {
            this.F = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        if (this.H) {
            i11 = measuredWidth;
        } else {
            i11 = measuredWidth / 2;
        }
        ImageView imageView = this.f30745f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        ch0 ch0Var = this.d;
        if (ch0Var.getVisibility() == 0) {
            ch0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.H) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, ch0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.l9 l9Var = this.f30744e;
        if (l9Var != null) {
            l9Var.measure(View.MeasureSpec.makeMeasureSpec(l9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30744e.getLayoutParams().width, 1073741824));
            if (this.H) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, this.f30744e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.H) {
                measuredWidth = org.telegram.messenger.camera.q.w(8.0f, j6Var.getMeasuredWidth(), i11);
            } else {
                measuredWidth = (measuredWidth - j6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z9 = hd.f22871a0;
                int i12 = this.f30748s;
                if (z9) {
                    marginLayoutParams.leftMargin = j6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = j6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.f30742b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z9) {
        this.H = z9;
    }

    public void setCanDisable(boolean z9) {
        this.f30746n = z9;
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        float f11;
        super.setEnabled(z9);
        float f12 = 1.0f;
        if (!z9 && this.f30746n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f30742b.setAlpha(f10);
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        if (j6Var.getVisibility() == 0) {
            if (!z9 && this.f30746n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            j6Var.setAlpha(f11);
        }
        ImageView imageView = this.f30745f;
        if (imageView.getVisibility() == 0) {
            if (!z9 && this.f30746n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30742b.getLayoutParams();
        ch0 ch0Var = this.d;
        if (i7 == 0) {
            ch0Var.setVisibility(8);
            boolean z9 = hd.f22871a0;
            int i10 = this.f30748s;
            if (z9) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        ch0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.r6.t(ch0Var, org.telegram.ui.ActionBar.k6.f28013m6, this.f30741a, PorterDuff.Mode.MULTIPLY);
        ch0Var.setBackground(null);
        ch0Var.setVisibility(0);
        if (hd.f22871a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.f30742b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.j6 j6Var = this.f30743c;
        org.telegram.ui.ActionBar.r6.r(j6Var);
        j6Var.setTextColor(i7);
    }

    public w9(Context context) {
        this(0, context, null);
    }

    public w9(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        boolean z9 = org.telegram.messenger.r2.f25191a;
        this.H = false;
        this.f30741a = f6Var;
        this.f30748s = 21;
        TextView textView = new TextView(context);
        this.f30742b = textView;
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.f22871a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, f6Var);
        float f10 = 21;
        addView(textView, c8.ha.d(-1, -1.0f, (hd.f22871a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !hd.f22871a0);
        this.f30743c = j6Var;
        j6Var.b(0.55f, 320L, xq.h);
        j6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        j6Var.setGravity((hd.f22871a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.r6.Z(j6Var, org.telegram.ui.ActionBar.k6.I6, f6Var);
        float f11 = 17;
        addView(j6Var, c8.ha.d(-2, -1.0f, (hd.f22871a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.k6.f28013m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, mode);
        imageView.setVisibility(8);
        addView((View) imageView, c8.ha.d(-2, -2.0f, (hd.f22871a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30745f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, f6Var, mode);
        addView(imageView2, c8.ha.d(-2, -2.0f, (hd.f22871a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
