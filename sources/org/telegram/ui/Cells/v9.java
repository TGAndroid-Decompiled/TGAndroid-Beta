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
import org.telegram.messenger.i20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fh0;
public final class v9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.e6 f31825a;
    public final TextView f31826b;
    public final org.telegram.ui.Components.h6 f31827c;
    public final fh0 d;
    public org.telegram.ui.Components.i9 f31828e;
    public final ImageView f31829f;
    public boolean h;
    public boolean f31830n;
    public boolean f31831r;
    public final int f31832s;
    public boolean f31833w;
    public float f31834x;
    public float f31835y;

    public v9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(0, context, e6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z10);
        TextView textView = this.f31826b;
        ImageView imageView = this.f31829f;
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f12));
            if (h6Var.getVisibility() == 0) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(h6Var, "alpha", f13));
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
        if (h6Var.getVisibility() == 0) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            h6Var.setAlpha(f11);
        }
        if (imageView.getVisibility() == 0) {
            if (z10) {
                f14 = 1.0f;
            }
            imageView.setAlpha(f14);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f31826b.setText(charSequence);
        this.f31827c.setVisibility(4);
        this.f31829f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f31826b.setText(charSequence);
        this.f31829f.setVisibility(4);
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        if (charSequence2 != null) {
            h6Var.c(charSequence2, z10, true);
            h6Var.setVisibility(0);
        } else {
            h6Var.setVisibility(4);
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
        if (hd.f24101a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        TextView textView = this.f31826b;
        textView.setGravity(i7 | 16);
        removeView(textView);
        if (hd.f24101a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        float f10 = this.f31832s;
        addView(textView, c8.ja.d(-1, -1.0f, i10 | 48, f10, 0.0f, f10, 0.0f));
        if (hd.f24101a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        h6Var.setGravity(i11 | 16);
        removeView(h6Var);
        if (hd.f24101a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(h6Var, c8.ja.d(-2, -1.0f, i12 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (hd.f24101a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(view, c8.ja.d(-2, -2.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f31829f;
        removeView(view2);
        if (!hd.f24101a0) {
            i14 = 5;
        }
        addView(view2, c8.ja.d(-2, -2.0f, i14 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i7 = 0;
        float f11 = 0.0f;
        if (this.f31831r || this.f31835y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.O5, this.f31825a));
            }
            if (this.f31833w) {
                float f12 = this.f31834x + 0.016f;
                this.f31834x = f12;
                if (f12 > 1.0f) {
                    this.f31834x = 1.0f;
                    this.f31833w = false;
                }
            } else {
                float f13 = this.f31834x - 0.016f;
                this.f31834x = f13;
                if (f13 < 0.0f) {
                    this.f31834x = 0.0f;
                    this.f31833w = true;
                }
            }
            int i10 = this.G;
            if (i10 > 0) {
                this.G = i10 - 15;
            } else {
                boolean z10 = this.f31831r;
                if (z10) {
                    float f14 = this.f31835y;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f31835y = f15;
                        if (f15 > 1.0f) {
                            this.f31835y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.f31835y;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f31835y = f17;
                        if (f17 < 0.0f) {
                            this.f31835y = 0.0f;
                        }
                    }
                }
            }
            this.H.setAlpha((int) (((this.f31834x * 0.4f) + 0.6f) * this.f31835y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f31832s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f18)) - org.telegram.messenger.g0.L(this.E), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (hd.f24101a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.f31827c.setAlpha(1.0f - this.f31835y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f10 = 58.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (!hd.f24101a0) {
                f11 = L;
            }
            float f19 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (hd.f24101a0) {
                i7 = L;
            }
            canvas.drawLine(f19, measuredHeight2, measuredWidth2 - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
        }
    }

    public TextView getTextView() {
        return this.f31826b;
    }

    public org.telegram.ui.Components.i9 getValueBackupImageView() {
        int i7;
        if (this.f31828e == null) {
            org.telegram.ui.Components.i9 i9Var = new org.telegram.ui.Components.i9(getContext());
            this.f31828e = i9Var;
            if (hd.f24101a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            float f10 = this.f31832s - 4;
            addView(i9Var, c8.ja.d(24, 24.0f, i7 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.f31828e;
    }

    public ImageView getValueImageView() {
        return this.f31829f;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.f31827c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.i9 i9Var = this.f31828e;
        if (i9Var != null && i9Var.getImageReceiver() != null && (this.f31828e.getImageReceiver().t() instanceof org.telegram.ui.Components.g5)) {
            ((org.telegram.ui.Components.g5) this.f31828e.getImageReceiver().t()).n(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f31826b.getText());
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        if (h6Var != null && h6Var.getVisibility() == 0) {
            str = "\n" + ((Object) h6Var.getText());
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
        ImageView imageView = this.f31829f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        fh0 fh0Var = this.d;
        if (fh0Var.getVisibility() == 0) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i11 = i20.w(8.0f, fh0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.i9 i9Var = this.f31828e;
        if (i9Var != null) {
            i9Var.measure(View.MeasureSpec.makeMeasureSpec(i9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f31828e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i11 = i20.w(8.0f, this.f31828e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        if (h6Var.getVisibility() == 0) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = i20.w(8.0f, h6Var.getMeasuredWidth(), i11);
            } else {
                measuredWidth = (measuredWidth - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = hd.f24101a0;
                int i12 = this.f31832s;
                if (z10) {
                    marginLayoutParams.leftMargin = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.f31826b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.I = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f31830n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 1.0f;
        if (!z10 && this.f31830n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f31826b.setAlpha(f10);
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        if (h6Var.getVisibility() == 0) {
            if (!z10 && this.f31830n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            h6Var.setAlpha(f11);
        }
        ImageView imageView = this.f31829f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f31830n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f31826b.getLayoutParams();
        fh0 fh0Var = this.d;
        if (i7 == 0) {
            fh0Var.setVisibility(8);
            boolean z10 = hd.f24101a0;
            int i10 = this.f31832s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        fh0Var.setImageResource(i7);
        org.telegram.ui.ActionBar.q6.s(fh0Var, org.telegram.ui.ActionBar.j6.f29014m6, this.f31825a, PorterDuff.Mode.MULTIPLY);
        fh0Var.setBackground(null);
        fh0Var.setVisibility(0);
        if (hd.f24101a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i7) {
        TextView textView = this.f31826b;
        org.telegram.ui.ActionBar.q6.q(textView);
        textView.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        org.telegram.ui.Components.h6 h6Var = this.f31827c;
        org.telegram.ui.ActionBar.q6.q(h6Var);
        h6Var.setTextColor(i7);
    }

    public v9(Context context) {
        this(0, context, null);
    }

    public v9(int i7, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.r2.f26198a;
        this.I = false;
        this.f31825a = e6Var;
        this.f31832s = 21;
        TextView textView = new TextView(context);
        this.f31826b = textView;
        i20.p(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((hd.f24101a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, e6Var);
        float f10 = 21;
        addView(textView, c8.ja.d(-1, -1.0f, (hd.f24101a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, !hd.f24101a0);
        this.f31827c = h6Var;
        h6Var.b(0.55f, 320L, er.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity((hd.f24101a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.q6.Y(h6Var, org.telegram.ui.ActionBar.j6.I6, e6Var);
        float f11 = 17;
        addView(h6Var, c8.ja.d(-2, -1.0f, (hd.f24101a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.j6.f29014m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i10, e6Var, mode);
        imageView.setVisibility(8);
        addView((View) imageView, c8.ja.d(-2, -2.0f, (hd.f24101a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f31829f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        org.telegram.ui.ActionBar.q6.s(imageView2, i10, e6Var, mode);
        addView(imageView2, c8.ja.d(-2, -2.0f, (hd.f24101a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
