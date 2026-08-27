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
import org.telegram.messenger.rl;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ri0;

public final class x9 extends FrameLayout {
    public boolean A;
    public int B;
    public Paint C;
    public boolean D;

    public final org.telegram.ui.ActionBar.c6 f25956a;

    public final TextView f25957b;

    public final org.telegram.ui.Components.j6 f25958c;
    public final ri0 d;

    public org.telegram.ui.Components.n9 f25959e;

    public final ImageView f25960f;
    public boolean h;

    public boolean f25961n;

    public boolean f25962r;

    public final int f25963s;
    public boolean v;

    public float f25964w;

    public float f25965x;

    public int f25966y;

    public x9(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        this(context, 0, c6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        setEnabled(z10);
        TextView textView = this.f25957b;
        ImageView imageView = this.f25960f;
        org.telegram.ui.Components.j6 j6Var = this.f25958c;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z10 ? 1.0f : 0.5f));
            if (j6Var.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(j6Var, "alpha", z10 ? 1.0f : 0.5f));
            }
            if (imageView.getVisibility() == 0) {
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", z10 ? 1.0f : 0.5f));
                return;
            }
            return;
        }
        textView.setAlpha(z10 ? 1.0f : 0.5f);
        if (j6Var.getVisibility() == 0) {
            j6Var.setAlpha(z10 ? 1.0f : 0.5f);
        }
        if (imageView.getVisibility() == 0) {
            imageView.setAlpha(z10 ? 1.0f : 0.5f);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f25957b.setText(charSequence);
        this.f25958c.setVisibility(4);
        this.f25960f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f25957b.setText(charSequence);
        this.f25960f.setVisibility(4);
        org.telegram.ui.Components.j6 j6Var = this.f25958c;
        if (charSequence2 != null) {
            j6Var.c(charSequence2, z10, true);
            j6Var.setVisibility(0);
        } else {
            j6Var.setVisibility(4);
        }
        this.h = z11;
        setWillNotDraw(true ^ z11);
        requestLayout();
    }

    public final void d() {
        int i10 = LocaleController.isRTL ? 5 : 3;
        TextView textView = this.f25957b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        int i11 = (LocaleController.isRTL ? 5 : 3) | 48;
        float f10 = this.f25963s;
        addView(textView, h7.z5.d(-1, -1.0f, i11, f10, 0.0f, f10, 0.0f));
        int i12 = LocaleController.isRTL ? 3 : 5;
        org.telegram.ui.Components.j6 j6Var = this.f25958c;
        j6Var.setGravity(i12 | 16);
        removeView(j6Var);
        addView(j6Var, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        addView(view, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f25960f;
        removeView(view2);
        addView(view2, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        if (this.f25962r || this.f25965x != 0.0f) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.O5, this.f25956a));
            }
            if (this.v) {
                float f12 = this.f25964w + 0.016f;
                this.f25964w = f12;
                if (f12 > 1.0f) {
                    this.f25964w = 1.0f;
                    this.v = false;
                }
            } else {
                float f13 = this.f25964w - 0.016f;
                this.f25964w = f13;
                if (f13 < 0.0f) {
                    this.f25964w = 0.0f;
                    this.v = true;
                }
            }
            int i10 = this.B;
            if (i10 > 0) {
                this.B = i10 - 15;
            } else {
                boolean z10 = this.f25962r;
                if (z10) {
                    float f14 = this.f25965x;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f25965x = f15;
                        if (f15 > 1.0f) {
                            this.f25965x = 1.0f;
                        }
                    } else if (!z10) {
                        f10 = this.f25965x;
                        if (f10 != 0.0f) {
                            f11 = f10 - 0.10666667f;
                            this.f25965x = f11;
                            if (f11 < 0.0f) {
                                this.f25965x = 0.0f;
                            }
                        }
                    }
                } else if (!z10) {
                    f10 = this.f25965x;
                    if (f10 != 0.0f) {
                        f11 = f10 - 0.10666667f;
                        this.f25965x = f11;
                        if (f11 < 0.0f) {
                            this.f25965x = 0.0f;
                        }
                    }
                }
            }
            this.C.setAlpha((int) (((this.f25964w * 0.4f) + 0.6f) * this.f25965x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f16 = this.f25963s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f16)) - AndroidUtilities.dp(this.f25966y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f16), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.C);
            invalidate();
        }
        this.f25958c.setAlpha(1.0f - this.f25965x);
        super.dispatchDraw(canvas);
        if (this.h) {
            int iDp = AndroidUtilities.dp(this.d.getVisibility() == 0 ? 58.0f : 20.0f);
            canvas.drawLine(LocaleController.isRTL ? 0.0f : iDp, getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? iDp : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
    }

    public TextView getTextView() {
        return this.f25957b;
    }

    public org.telegram.ui.Components.n9 getValueBackupImageView() {
        if (this.f25959e == null) {
            org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(getContext());
            this.f25959e = n9Var;
            int i10 = (LocaleController.isRTL ? 3 : 5) | 16;
            float f10 = this.f25963s - 4;
            addView(n9Var, h7.z5.d(24, 24.0f, i10, f10, 0.0f, f10, 0.0f));
        }
        return this.f25959e;
    }

    public ImageView getValueImageView() {
        return this.f25960f;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.f25958c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.n9 n9Var = this.f25959e;
        if (n9Var == null || n9Var.getImageReceiver() == null || !(this.f25959e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.k5)) {
            return;
        }
        ((org.telegram.ui.Components.k5) this.f25959e.getImageReceiver().getDrawable()).o(this);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f25957b.getText());
        org.telegram.ui.Components.j6 j6Var = this.f25958c;
        if (j6Var == null || j6Var.getVisibility() != 0) {
            str = "";
        } else {
            str = "\n" + ((Object) j6Var.getText());
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (!this.A || getParent() == null) {
            return;
        }
        this.B = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int iU = this.D ? measuredWidth : measuredWidth / 2;
        ImageView imageView = this.f25960f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(iU, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        ri0 ri0Var = this.d;
        if (ri0Var.getVisibility() == 0) {
            ri0Var.measure(View.MeasureSpec.makeMeasureSpec(iU, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.D) {
                iU = rl.u(8.0f, ri0Var.getMeasuredWidth(), iU);
            }
        }
        org.telegram.ui.Components.n9 n9Var = this.f25959e;
        if (n9Var != null) {
            n9Var.measure(View.MeasureSpec.makeMeasureSpec(n9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f25959e.getLayoutParams().width, 1073741824));
            if (this.D) {
                iU = rl.u(8.0f, this.f25959e.getMeasuredWidth(), iU);
            }
        }
        org.telegram.ui.Components.j6 j6Var = this.f25958c;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(iU, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = this.D ? rl.u(8.0f, j6Var.getMeasuredWidth(), iU) : (measuredWidth - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i12 = this.f25963s;
                if (z10) {
                    marginLayoutParams.leftMargin = j6Var.getMeasuredWidth() + AndroidUtilities.dp(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = j6Var.getMeasuredWidth() + AndroidUtilities.dp(i12 + 4);
                }
            }
        }
        this.f25957b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.D = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f25961n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        float f10 = 1.0f;
        this.f25957b.setAlpha((z10 || !this.f25961n) ? 1.0f : 0.5f);
        org.telegram.ui.Components.j6 j6Var = this.f25958c;
        if (j6Var.getVisibility() == 0) {
            j6Var.setAlpha((z10 || !this.f25961n) ? 1.0f : 0.5f);
        }
        ImageView imageView = this.f25960f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f25961n) {
                f10 = 0.5f;
            }
            imageView.setAlpha(f10);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f25957b.getLayoutParams();
        ri0 ri0Var = this.d;
        if (i10 == 0) {
            ri0Var.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            int i11 = this.f25963s;
            if (z10) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i11);
                return;
            }
        }
        ri0Var.setImageResource(i10);
        ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23215m6, this.f25956a), PorterDuff.Mode.MULTIPLY));
        ri0Var.setBackground(null);
        ri0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i10) {
        this.f25957b.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.f25958c.setTextColor(i10);
    }

    public x9(Context context) {
        this(context, 0, null);
    }

    public x9(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.D = BuildVars.DEBUG_PRIVATE_VERSION;
        this.f25956a = c6Var;
        this.f25963s = 21;
        TextView textView = new TextView(context);
        this.f25957b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        float f10 = 21;
        addView(textView, h7.z5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !LocaleController.isRTL);
        this.f25958c = j6Var;
        j6Var.b(0.55f, 320L, er.h);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        j6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        float f11 = 17;
        addView(j6Var, h7.z5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ri0 ri0Var = new ri0(context);
        this.d = ri0Var;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        ri0Var.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.g6.f23215m6;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        ri0Var.setColorFilter(new PorterDuffColorFilter(iV0, mode));
        ri0Var.setVisibility(8);
        addView(ri0Var, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f25960f = imageView;
        imageView.setScaleType(scaleType);
        imageView.setVisibility(4);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), mode));
        addView(imageView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
