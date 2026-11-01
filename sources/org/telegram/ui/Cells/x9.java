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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gr;
public final class x9 extends FrameLayout {
    public int D;
    public boolean E;
    public int F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.ActionBar.p6 f23598a;
    public final TextView f23599b;
    public final org.telegram.ui.Components.f6 f23600c;
    public final fi0 d;
    public org.telegram.ui.Components.g9 e;
    public final ImageView f23601f;
    public boolean h;
    public boolean f23602n;
    public boolean f23603r;
    public final int f23604s;
    public boolean f23605w;
    public float f23606x;
    public float f23607y;

    public x9(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        this(0, context, p6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        setEnabled(z10);
        TextView textView = this.f23599b;
        ImageView imageView = this.f23601f;
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        float f13 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f11));
            if (f6Var.getVisibility() == 0) {
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(f6Var, "alpha", f12));
            }
            if (imageView.getVisibility() == 0) {
                if (z10) {
                    f13 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", f13));
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
        if (f6Var.getVisibility() == 0) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            f6Var.setAlpha(f10);
        }
        if (imageView.getVisibility() == 0) {
            if (z10) {
                f13 = 1.0f;
            }
            imageView.setAlpha(f13);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f23599b.setText(charSequence);
        this.f23600c.setVisibility(4);
        this.f23601f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f23599b.setText(charSequence);
        this.f23601f.setVisibility(4);
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        if (charSequence2 != null) {
            f6Var.c(charSequence2, z10, true);
            f6Var.setVisibility(0);
        } else {
            f6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 3;
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView textView = this.f23599b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f7 = this.f23604s;
        addView(textView, w7.b6.d(-1, -1.0f, i11 | 48, f7, 0.0f, f7, 0.0f));
        if (dd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        f6Var.setGravity(i12 | 16);
        removeView(f6Var);
        if (dd.X) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(f6Var, w7.b6.d(-2, -1.0f, i13 | 48, f7, 0.0f, f7, 0.0f));
        View view = this.d;
        removeView(view);
        if (dd.X) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(view, w7.b6.d(-2, -2.0f, i14 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f23601f;
        removeView(view2);
        if (!dd.X) {
            i15 = 5;
        }
        addView(view2, w7.b6.d(-2, -2.0f, i15 | 16, f7, 0.0f, f7, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        int i10 = 0;
        float f10 = 0.0f;
        if (this.f23603r || this.f23607y != 0.0f) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.O5, this.f23598a));
            }
            if (this.f23605w) {
                float f11 = this.f23606x + 0.016f;
                this.f23606x = f11;
                if (f11 > 1.0f) {
                    this.f23606x = 1.0f;
                    this.f23605w = false;
                }
            } else {
                float f12 = this.f23606x - 0.016f;
                this.f23606x = f12;
                if (f12 < 0.0f) {
                    this.f23606x = 0.0f;
                    this.f23605w = true;
                }
            }
            int i11 = this.F;
            if (i11 > 0) {
                this.F = i11 - 15;
            } else {
                boolean z10 = this.f23603r;
                if (z10) {
                    float f13 = this.f23607y;
                    if (f13 != 1.0f) {
                        float f14 = f13 + 0.10666667f;
                        this.f23607y = f14;
                        if (f14 > 1.0f) {
                            this.f23607y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f15 = this.f23607y;
                    if (f15 != 0.0f) {
                        float f16 = f15 - 0.10666667f;
                        this.f23607y = f16;
                        if (f16 < 0.0f) {
                            this.f23607y = 0.0f;
                        }
                    }
                }
            }
            this.G.setAlpha((int) (((this.f23606x * 0.4f) + 0.6f) * this.f23607y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.i0.P;
            int measuredWidth = getMeasuredWidth();
            float f17 = this.f23604s;
            rectF.set((measuredWidth - org.telegram.messenger.i0.L(f17)) - org.telegram.messenger.i0.L(this.D), measuredHeight - org.telegram.messenger.i0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.i0.L(f17), org.telegram.messenger.i0.L(3.0f) + measuredHeight);
            if (dd.X) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), this.G);
            invalidate();
        }
        this.f23600c.setAlpha(1.0f - this.f23607y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f7 = 58.0f;
            } else {
                f7 = 20.0f;
            }
            int L = org.telegram.messenger.i0.L(f7);
            if (!dd.X) {
                f10 = L;
            }
            float f18 = f10;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (dd.X) {
                i10 = L;
            }
            canvas.drawLine(f18, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    public TextView getTextView() {
        return this.f23599b;
    }

    public org.telegram.ui.Components.g9 getValueBackupImageView() {
        int i10;
        if (this.e == null) {
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getContext());
            this.e = g9Var;
            if (dd.X) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            float f7 = this.f23604s - 4;
            addView(g9Var, w7.b6.d(24, 24.0f, i10 | 16, f7, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f23601f;
    }

    public org.telegram.ui.Components.f6 getValueTextView() {
        return this.f23600c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (g9Var != null && g9Var.getImageReceiver() != null && (this.e.getImageReceiver().t() instanceof org.telegram.ui.Components.f5)) {
            ((org.telegram.ui.Components.f5) this.e.getImageReceiver().t()).n(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f23599b.getText());
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        if (f6Var != null && f6Var.getVisibility() == 0) {
            str = "\n" + ((Object) f6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.E && getParent() != null) {
            this.F = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(34.0f);
        if (this.H) {
            i12 = measuredWidth;
        } else {
            i12 = measuredWidth / 2;
        }
        ImageView imageView = this.f23601f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        fi0 fi0Var = this.d;
        if (fi0Var.getVisibility() == 0) {
            fi0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.H) {
                i12 = a30.w(8.0f, fi0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (g9Var != null) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(g9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, 1073741824));
            if (this.H) {
                i12 = a30.w(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        if (f6Var.getVisibility() == 0) {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.H) {
                measuredWidth = a30.w(8.0f, f6Var.getMeasuredWidth(), i12);
            } else {
                measuredWidth = (measuredWidth - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = dd.X;
                int i13 = this.f23604s;
                if (z10) {
                    marginLayoutParams.leftMargin = f6Var.getMeasuredWidth() + org.telegram.messenger.i0.L(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = f6Var.getMeasuredWidth() + org.telegram.messenger.i0.L(i13 + 4);
                }
            }
        }
        this.f23599b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f23602n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        float f11 = 1.0f;
        if (!z10 && this.f23602n) {
            f7 = 0.5f;
        } else {
            f7 = 1.0f;
        }
        this.f23599b.setAlpha(f7);
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        if (f6Var.getVisibility() == 0) {
            if (!z10 && this.f23602n) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            f6Var.setAlpha(f10);
        }
        ImageView imageView = this.f23601f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f23602n) {
                f11 = 0.5f;
            }
            imageView.setAlpha(f11);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23599b.getLayoutParams();
        fi0 fi0Var = this.d;
        if (i10 == 0) {
            fi0Var.setVisibility(8);
            boolean z10 = dd.X;
            int i11 = this.f23604s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(i11);
                return;
            }
        }
        fi0Var.setImageResource(i10);
        org.telegram.ui.ActionBar.a7.t(fi0Var, org.telegram.ui.ActionBar.t6.f21096m6, this.f23598a, PorterDuff.Mode.MULTIPLY);
        fi0Var.setBackground(null);
        fi0Var.setVisibility(0);
        if (dd.X) {
            marginLayoutParams.rightMargin = org.telegram.messenger.i0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.i0.L(58.0f);
        }
    }

    public void setTextColor(int i10) {
        TextView textView = this.f23599b;
        org.telegram.ui.ActionBar.a7.r(textView);
        textView.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        org.telegram.ui.Components.f6 f6Var = this.f23600c;
        org.telegram.ui.ActionBar.a7.r(f6Var);
        f6Var.setTextColor(i10);
    }

    public x9(Context context) {
        this(0, context, null);
    }

    public x9(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.v2.f18578a;
        this.H = false;
        this.f23598a = p6Var;
        this.f23604s = 21;
        TextView textView = new TextView(context);
        this.f23599b = textView;
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((dd.X ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        float f7 = 21;
        addView(textView, w7.b6.d(-1, -1.0f, (dd.X ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, !dd.X);
        this.f23600c = f6Var;
        f6Var.b(0.55f, 320L, gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        f6Var.setGravity((dd.X ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.I6, p6Var);
        float f10 = 17;
        addView(f6Var, w7.b6.d(-2, -1.0f, (dd.X ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.t6.f21096m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.t(imageView, i11, p6Var, mode);
        imageView.setVisibility(8);
        addView((View) imageView, w7.b6.d(-2, -2.0f, (dd.X ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f23601f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, p6Var, mode);
        addView(imageView2, w7.b6.d(-2, -2.0f, (dd.X ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
    }
}
