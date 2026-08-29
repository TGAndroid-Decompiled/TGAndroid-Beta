package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.jr;
public final class y9 extends FrameLayout {
    public boolean A;
    public int B;
    public Paint C;
    public boolean D;
    public final org.telegram.ui.ActionBar.c6 f26019a;
    public final TextView f26020b;
    public final org.telegram.ui.Components.o6 f26021c;
    public final aj0 d;
    public org.telegram.ui.Components.t9 f26022e;
    public final ImageView f26023f;
    public boolean h;
    public boolean f26024n;
    public boolean f26025r;
    public final int f26026s;
    public boolean v;
    public float f26027w;
    public float f26028x;
    public int f26029y;

    public y9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 0, c6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f9;
        float f10;
        float f11;
        float f12;
        setEnabled(z10);
        TextView textView = this.f26020b;
        ImageView imageView = this.f26023f;
        org.telegram.ui.Components.o6 o6Var = this.f26021c;
        float f13 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f11));
            if (o6Var.getVisibility() == 0) {
                if (z10) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(o6Var, "alpha", f12));
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
            f9 = 1.0f;
        } else {
            f9 = 0.5f;
        }
        textView.setAlpha(f9);
        if (o6Var.getVisibility() == 0) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            o6Var.setAlpha(f10);
        }
        if (imageView.getVisibility() == 0) {
            if (z10) {
                f13 = 1.0f;
            }
            imageView.setAlpha(f13);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f26020b.setText(charSequence);
        this.f26021c.setVisibility(4);
        this.f26023f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f26020b.setText(charSequence);
        this.f26023f.setVisibility(4);
        org.telegram.ui.Components.o6 o6Var = this.f26021c;
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
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = 3;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        TextView textView = this.f26020b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f9 = this.f26026s;
        addView(textView, i7.f6.d(-1, -1.0f, i11 | 48, f9, 0.0f, f9, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        org.telegram.ui.Components.o6 o6Var = this.f26021c;
        o6Var.setGravity(i12 | 16);
        removeView(o6Var);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(o6Var, i7.f6.d(-2, -1.0f, i13 | 48, f9, 0.0f, f9, 0.0f));
        View view = this.d;
        removeView(view);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(view, i7.f6.d(-2, -2.0f, i14 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f26023f;
        removeView(view2);
        if (!LocaleController.isRTL) {
            i15 = 5;
        }
        addView(view2, i7.f6.d(-2, -2.0f, i15 | 16, f9, 0.0f, f9, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f9;
        float f10;
        int i10 = 0;
        if (this.f26025r || this.f26028x != 0.0f) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, this.f26019a));
            }
            if (this.v) {
                float f11 = this.f26027w + 0.016f;
                this.f26027w = f11;
                if (f11 > 1.0f) {
                    this.f26027w = 1.0f;
                    this.v = false;
                }
            } else {
                float f12 = this.f26027w - 0.016f;
                this.f26027w = f12;
                if (f12 < 0.0f) {
                    this.f26027w = 0.0f;
                    this.v = true;
                }
            }
            int i11 = this.B;
            if (i11 > 0) {
                this.B = i11 - 15;
            } else {
                boolean z10 = this.f26025r;
                if (z10) {
                    float f13 = this.f26028x;
                    if (f13 != 1.0f) {
                        float f14 = f13 + 0.10666667f;
                        this.f26028x = f14;
                        if (f14 > 1.0f) {
                            this.f26028x = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f15 = this.f26028x;
                    if (f15 != 0.0f) {
                        float f16 = f15 - 0.10666667f;
                        this.f26028x = f16;
                        if (f16 < 0.0f) {
                            this.f26028x = 0.0f;
                        }
                    }
                }
            }
            this.C.setAlpha((int) (((this.f26027w * 0.4f) + 0.6f) * this.f26028x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f17 = this.f26026s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f17)) - AndroidUtilities.dp(this.f26029y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f17), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.C);
            invalidate();
        }
        this.f26021c.setAlpha(1.0f - this.f26028x);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f9 = 58.0f;
            } else {
                f9 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f9);
            if (LocaleController.isRTL) {
                f10 = 0.0f;
            } else {
                f10 = dp;
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = dp;
            }
            canvas.drawLine(f10, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    public TextView getTextView() {
        return this.f26020b;
    }

    public org.telegram.ui.Components.t9 getValueBackupImageView() {
        int i10;
        if (this.f26022e == null) {
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(getContext());
            this.f26022e = t9Var;
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            float f9 = this.f26026s - 4;
            addView(t9Var, i7.f6.d(24, 24.0f, i10 | 16, f9, 0.0f, f9, 0.0f));
        }
        return this.f26022e;
    }

    public ImageView getValueImageView() {
        return this.f26023f;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.f26021c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.t9 t9Var = this.f26022e;
        if (t9Var != null && t9Var.getImageReceiver() != null && (this.f26022e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.p5)) {
            ((org.telegram.ui.Components.p5) this.f26022e.getImageReceiver().getDrawable()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f26020b.getText());
        org.telegram.ui.Components.o6 o6Var = this.f26021c;
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (this.A && getParent() != null) {
            this.B = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        if (this.D) {
            i12 = measuredWidth;
        } else {
            i12 = measuredWidth / 2;
        }
        ImageView imageView = this.f26023f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        aj0 aj0Var = this.d;
        if (aj0Var.getVisibility() == 0) {
            aj0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.D) {
                i12 = org.telegram.ui.b.u(8.0f, aj0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.t9 t9Var = this.f26022e;
        if (t9Var != null) {
            t9Var.measure(View.MeasureSpec.makeMeasureSpec(t9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26022e.getLayoutParams().width, 1073741824));
            if (this.D) {
                i12 = org.telegram.ui.b.u(8.0f, this.f26022e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.o6 o6Var = this.f26021c;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.D) {
                measuredWidth = org.telegram.ui.b.u(8.0f, o6Var.getMeasuredWidth(), i12);
            } else {
                measuredWidth = (measuredWidth - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i13 = this.f26026s;
                if (z10) {
                    marginLayoutParams.leftMargin = o6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = o6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                }
            }
        }
        this.f26020b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.D = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f26024n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f9;
        float f10;
        super.setEnabled(z10);
        float f11 = 1.0f;
        if (!z10 && this.f26024n) {
            f9 = 0.5f;
        } else {
            f9 = 1.0f;
        }
        this.f26020b.setAlpha(f9);
        org.telegram.ui.Components.o6 o6Var = this.f26021c;
        if (o6Var.getVisibility() == 0) {
            if (!z10 && this.f26024n) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            o6Var.setAlpha(f10);
        }
        ImageView imageView = this.f26023f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f26024n) {
                f11 = 0.5f;
            }
            imageView.setAlpha(f11);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26020b.getLayoutParams();
        aj0 aj0Var = this.d;
        if (i10 == 0) {
            aj0Var.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            int i11 = this.f26026s;
            if (z10) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i11);
                return;
            }
        }
        aj0Var.setImageResource(i10);
        aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23223m6, this.f26019a), PorterDuff.Mode.MULTIPLY));
        aj0Var.setBackground(null);
        aj0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i10) {
        this.f26020b.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.f26021c.setTextColor(i10);
    }

    public y9(Context context) {
        this(context, 0, null);
    }

    public y9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = BuildVars.DEBUG_PRIVATE_VERSION;
        this.f26019a = c6Var;
        this.f26026s = 21;
        TextView textView = new TextView(context);
        this.f26020b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        float f9 = 21;
        addView(textView, i7.f6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f9, 0.0f, f9, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !LocaleController.isRTL);
        this.f26021c = o6Var;
        o6Var.b(0.55f, 320L, jr.h);
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        float f10 = 17;
        addView(o6Var, i7.f6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.g6.f23223m6;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        addView((View) imageView, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f26023f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        addView(imageView2, i7.f6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f9, 0.0f, f9, 0.0f));
    }
}
