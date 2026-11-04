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
import b8.mf;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;
public final class v9 extends FrameLayout {
    public int E;
    public boolean F;
    public int G;
    public Paint H;
    public boolean I;
    public final org.telegram.ui.ActionBar.e6 f30749a;
    public final TextView f30750b;
    public final org.telegram.ui.Components.h6 f30751c;
    public final fh0 d;
    public org.telegram.ui.Components.k9 f30752e;
    public final ImageView f30753f;
    public boolean h;
    public boolean f30754n;
    public boolean f30755r;
    public final int f30756s;
    public boolean f30757w;
    public float f30758x;
    public float f30759y;

    public v9(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        this(0, context, e6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z10);
        TextView textView = this.f30750b;
        ImageView imageView = this.f30753f;
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
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
        this.f30750b.setText(charSequence);
        this.f30751c.setVisibility(4);
        this.f30753f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f30750b.setText(charSequence);
        this.f30753f.setVisibility(4);
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
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
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 3;
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        TextView textView = this.f30750b;
        textView.setGravity(i3 | 16);
        removeView(textView);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        float f10 = this.f30756s;
        addView(textView, mf.d(-1, -1.0f, i10 | 48, f10, 0.0f, f10, 0.0f));
        if (bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
        h6Var.setGravity(i11 | 16);
        removeView(h6Var);
        if (bd.f21784a0) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(h6Var, mf.d(-2, -1.0f, i12 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (bd.f21784a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(view, mf.d(-2, -2.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f30753f;
        removeView(view2);
        if (!bd.f21784a0) {
            i14 = 5;
        }
        addView(view2, mf.d(-2, -2.0f, i14 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        int i3 = 0;
        float f11 = 0.0f;
        if (this.f30755r || this.f30759y != 0.0f) {
            if (this.H == null) {
                Paint paint = new Paint(1);
                this.H = paint;
                paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.O5, this.f30749a));
            }
            if (this.f30757w) {
                float f12 = this.f30758x + 0.016f;
                this.f30758x = f12;
                if (f12 > 1.0f) {
                    this.f30758x = 1.0f;
                    this.f30757w = false;
                }
            } else {
                float f13 = this.f30758x - 0.016f;
                this.f30758x = f13;
                if (f13 < 0.0f) {
                    this.f30758x = 0.0f;
                    this.f30757w = true;
                }
            }
            int i10 = this.G;
            if (i10 > 0) {
                this.G = i10 - 15;
            } else {
                boolean z10 = this.f30755r;
                if (z10) {
                    float f14 = this.f30759y;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f30759y = f15;
                        if (f15 > 1.0f) {
                            this.f30759y = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.f30759y;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f30759y = f17;
                        if (f17 < 0.0f) {
                            this.f30759y = 0.0f;
                        }
                    }
                }
            }
            this.H.setAlpha((int) (((this.f30758x * 0.4f) + 0.6f) * this.f30759y * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = org.telegram.messenger.g0.P;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f30756s;
            rectF.set((measuredWidth - org.telegram.messenger.g0.L(f18)) - org.telegram.messenger.g0.L(this.E), measuredHeight - org.telegram.messenger.g0.L(3.0f), getMeasuredWidth() - org.telegram.messenger.g0.L(f18), org.telegram.messenger.g0.L(3.0f) + measuredHeight);
            if (bd.f21784a0) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(3.0f), org.telegram.messenger.g0.L(3.0f), this.H);
            invalidate();
        }
        this.f30751c.setAlpha(1.0f - this.f30759y);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f10 = 58.0f;
            } else {
                f10 = 20.0f;
            }
            int L = org.telegram.messenger.g0.L(f10);
            if (!bd.f21784a0) {
                f11 = L;
            }
            float f19 = f11;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = L;
            }
            canvas.drawLine(f19, measuredHeight2, measuredWidth2 - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    public TextView getTextView() {
        return this.f30750b;
    }

    public org.telegram.ui.Components.k9 getValueBackupImageView() {
        int i3;
        if (this.f30752e == null) {
            org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getContext());
            this.f30752e = k9Var;
            if (bd.f21784a0) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            float f10 = this.f30756s - 4;
            addView(k9Var, mf.d(24, 24.0f, i3 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.f30752e;
    }

    public ImageView getValueImageView() {
        return this.f30753f;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.f30751c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.k9 k9Var = this.f30752e;
        if (k9Var != null && k9Var.getImageReceiver() != null && (this.f30752e.getImageReceiver().t() instanceof org.telegram.ui.Components.g5)) {
            ((org.telegram.ui.Components.g5) this.f30752e.getImageReceiver().t()).n(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f30750b.getText());
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (this.F && getParent() != null) {
            this.G = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        if (this.I) {
            i11 = measuredWidth;
        } else {
            i11 = measuredWidth / 2;
        }
        ImageView imageView = this.f30753f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        fh0 fh0Var = this.d;
        if (fh0Var.getVisibility() == 0) {
            fh0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.I) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, fh0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.k9 k9Var = this.f30752e;
        if (k9Var != null) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(k9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30752e.getLayoutParams().width, 1073741824));
            if (this.I) {
                i11 = org.telegram.messenger.camera.q.w(8.0f, this.f30752e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
        if (h6Var.getVisibility() == 0) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.I) {
                measuredWidth = org.telegram.messenger.camera.q.w(8.0f, h6Var.getMeasuredWidth(), i11);
            } else {
                measuredWidth = (measuredWidth - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = bd.f21784a0;
                int i12 = this.f30756s;
                if (z10) {
                    marginLayoutParams.leftMargin = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = h6Var.getMeasuredWidth() + org.telegram.messenger.g0.L(i12 + 4);
                }
            }
        }
        this.f30750b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.I = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f30754n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 1.0f;
        if (!z10 && this.f30754n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f30750b.setAlpha(f10);
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
        if (h6Var.getVisibility() == 0) {
            if (!z10 && this.f30754n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            h6Var.setAlpha(f11);
        }
        ImageView imageView = this.f30753f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f30754n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30750b.getLayoutParams();
        fh0 fh0Var = this.d;
        if (i3 == 0) {
            fh0Var.setVisibility(8);
            boolean z10 = bd.f21784a0;
            int i10 = this.f30756s;
            if (z10) {
                marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(i10);
                return;
            }
        }
        fh0Var.setImageResource(i3);
        org.telegram.ui.ActionBar.r6.t(fh0Var, org.telegram.ui.ActionBar.k6.f28043m6, this.f30749a, PorterDuff.Mode.MULTIPLY);
        fh0Var.setBackground(null);
        fh0Var.setVisibility(0);
        if (bd.f21784a0) {
            marginLayoutParams.rightMargin = org.telegram.messenger.g0.L(58.0f);
        } else {
            marginLayoutParams.leftMargin = org.telegram.messenger.g0.L(58.0f);
        }
    }

    public void setTextColor(int i3) {
        TextView textView = this.f30750b;
        org.telegram.ui.ActionBar.r6.r(textView);
        textView.setTextColor(i3);
    }

    public void setTextValueColor(int i3) {
        org.telegram.ui.Components.h6 h6Var = this.f30751c;
        org.telegram.ui.ActionBar.r6.r(h6Var);
        h6Var.setTextColor(i3);
    }

    public v9(Context context) {
        this(0, context, null);
    }

    public v9(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10 = org.telegram.messenger.r2.f25040a;
        this.I = false;
        this.f30749a = e6Var;
        this.f30756s = 21;
        TextView textView = new TextView(context);
        this.f30750b = textView;
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((bd.f21784a0 ? 5 : 3) | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        float f10 = 21;
        addView(textView, mf.d(-1, -1.0f, (bd.f21784a0 ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, !bd.f21784a0);
        this.f30751c = h6Var;
        h6Var.b(0.55f, 320L, xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        h6Var.setGravity((bd.f21784a0 ? 3 : 5) | 16);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.I6, e6Var);
        float f11 = 17;
        addView(h6Var, mf.d(-2, -1.0f, (bd.f21784a0 ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.k6.f28043m6;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, mode);
        imageView.setVisibility(8);
        addView((View) imageView, mf.d(-2, -2.0f, (bd.f21784a0 ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f30753f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, e6Var, mode);
        addView(imageView2, mf.d(-2, -2.0f, (bd.f21784a0 ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
