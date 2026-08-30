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
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.nr;
public final class aa extends FrameLayout {
    public boolean B;
    public int C;
    public Paint D;
    public boolean E;
    public final org.telegram.ui.ActionBar.f6 f20842a;
    public final TextView f20843b;
    public final org.telegram.ui.Components.k6 f20844c;
    public final jj0 d;
    public org.telegram.ui.Components.p9 e;
    public final ImageView f20845f;
    public boolean h;
    public boolean f20846n;
    public boolean f20847r;
    public final int f20848s;
    public boolean v;
    public float f20849w;
    public float f20850x;
    public int f20851y;

    public aa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 0, f6Var);
    }

    public final void a(ArrayList arrayList, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z4);
        TextView textView = this.f20843b;
        ImageView imageView = this.f20845f;
        org.telegram.ui.Components.k6 k6Var = this.f20844c;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f12));
            if (k6Var.getVisibility() == 0) {
                if (z4) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(k6Var, "alpha", f13));
            }
            if (imageView.getVisibility() == 0) {
                if (z4) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(imageView, "alpha", f14));
                return;
            }
            return;
        }
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        textView.setAlpha(f10);
        if (k6Var.getVisibility() == 0) {
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            k6Var.setAlpha(f11);
        }
        if (imageView.getVisibility() == 0) {
            if (z4) {
                f14 = 1.0f;
            }
            imageView.setAlpha(f14);
        }
    }

    public final void b(CharSequence charSequence, boolean z4) {
        this.f20843b.setText(charSequence);
        this.f20844c.setVisibility(4);
        this.f20845f.setVisibility(4);
        this.h = z4;
        setWillNotDraw(!z4);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z4, boolean z10) {
        this.f20843b.setText(charSequence);
        this.f20845f.setVisibility(4);
        org.telegram.ui.Components.k6 k6Var = this.f20844c;
        if (charSequence2 != null) {
            k6Var.c(charSequence2, z4, true);
            k6Var.setVisibility(0);
        } else {
            k6Var.setVisibility(4);
        }
        this.h = z10;
        setWillNotDraw(true ^ z10);
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
        TextView textView = this.f20843b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f10 = this.f20848s;
        addView(textView, k7.b6.d(-1, -1.0f, i11 | 48, f10, 0.0f, f10, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        org.telegram.ui.Components.k6 k6Var = this.f20844c;
        k6Var.setGravity(i12 | 16);
        removeView(k6Var);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(k6Var, k7.b6.d(-2, -1.0f, i13 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(view, k7.b6.d(-2, -2.0f, i14 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f20845f;
        removeView(view2);
        if (!LocaleController.isRTL) {
            i15 = 5;
        }
        addView(view2, k7.b6.d(-2, -2.0f, i15 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i10 = 0;
        if (this.f20847r || this.f20850x != 0.0f) {
            if (this.D == null) {
                Paint paint = new Paint(1);
                this.D = paint;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, this.f20842a));
            }
            if (this.v) {
                float f12 = this.f20849w + 0.016f;
                this.f20849w = f12;
                if (f12 > 1.0f) {
                    this.f20849w = 1.0f;
                    this.v = false;
                }
            } else {
                float f13 = this.f20849w - 0.016f;
                this.f20849w = f13;
                if (f13 < 0.0f) {
                    this.f20849w = 0.0f;
                    this.v = true;
                }
            }
            int i11 = this.C;
            if (i11 > 0) {
                this.C = i11 - 15;
            } else {
                boolean z4 = this.f20847r;
                if (z4) {
                    float f14 = this.f20850x;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f20850x = f15;
                        if (f15 > 1.0f) {
                            this.f20850x = 1.0f;
                        }
                    }
                }
                if (!z4) {
                    float f16 = this.f20850x;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f20850x = f17;
                        if (f17 < 0.0f) {
                            this.f20850x = 0.0f;
                        }
                    }
                }
            }
            this.D.setAlpha((int) (((this.f20849w * 0.4f) + 0.6f) * this.f20850x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f20848s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f18)) - AndroidUtilities.dp(this.f20851y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f18), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.D);
            invalidate();
        }
        this.f20844c.setAlpha(1.0f - this.f20850x);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f10 = 58.0f;
            } else {
                f10 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f10);
            if (LocaleController.isRTL) {
                f11 = 0.0f;
            } else {
                f11 = dp;
            }
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth2 = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = dp;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20025k0);
        }
    }

    public TextView getTextView() {
        return this.f20843b;
    }

    public org.telegram.ui.Components.p9 getValueBackupImageView() {
        int i10;
        if (this.e == null) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getContext());
            this.e = p9Var;
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            float f10 = this.f20848s - 4;
            addView(p9Var, k7.b6.d(24, 24.0f, i10 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f20845f;
    }

    public org.telegram.ui.Components.k6 getValueTextView() {
        return this.f20844c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.p9 p9Var = this.e;
        if (p9Var != null && p9Var.getImageReceiver() != null && (this.e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.l5)) {
            ((org.telegram.ui.Components.l5) this.e.getImageReceiver().getDrawable()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) this.f20843b.getText());
        org.telegram.ui.Components.k6 k6Var = this.f20844c;
        if (k6Var != null && k6Var.getVisibility() == 0) {
            str = "\n" + ((Object) k6Var.getText());
        } else {
            str = "";
        }
        sb.append(str);
        accessibilityNodeInfo.setText(sb.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (this.B && getParent() != null) {
            this.C = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        if (this.E) {
            i12 = measuredWidth;
        } else {
            i12 = measuredWidth / 2;
        }
        ImageView imageView = this.f20845f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        jj0 jj0Var = this.d;
        if (jj0Var.getVisibility() == 0) {
            jj0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.E) {
                i12 = org.telegram.ui.b.t(8.0f, jj0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.p9 p9Var = this.e;
        if (p9Var != null) {
            p9Var.measure(View.MeasureSpec.makeMeasureSpec(p9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, 1073741824));
            if (this.E) {
                i12 = org.telegram.ui.b.t(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.k6 k6Var = this.f20844c;
        if (k6Var.getVisibility() == 0) {
            k6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.E) {
                measuredWidth = org.telegram.ui.b.t(8.0f, k6Var.getMeasuredWidth(), i12);
            } else {
                measuredWidth = (measuredWidth - k6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z4 = LocaleController.isRTL;
                int i13 = this.f20848s;
                if (z4) {
                    marginLayoutParams.leftMargin = k6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = k6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                }
            }
        }
        this.f20843b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z4) {
        this.E = z4;
    }

    public void setCanDisable(boolean z4) {
        this.f20846n = z4;
    }

    @Override
    public void setEnabled(boolean z4) {
        float f10;
        float f11;
        super.setEnabled(z4);
        float f12 = 1.0f;
        if (!z4 && this.f20846n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f20843b.setAlpha(f10);
        org.telegram.ui.Components.k6 k6Var = this.f20844c;
        if (k6Var.getVisibility() == 0) {
            if (!z4 && this.f20846n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            k6Var.setAlpha(f11);
        }
        ImageView imageView = this.f20845f;
        if (imageView.getVisibility() == 0) {
            if (!z4 && this.f20846n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20843b.getLayoutParams();
        jj0 jj0Var = this.d;
        if (i10 == 0) {
            jj0Var.setVisibility(8);
            boolean z4 = LocaleController.isRTL;
            int i11 = this.f20848s;
            if (z4) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i11);
                return;
            }
        }
        jj0Var.setImageResource(i10);
        jj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20067m6, this.f20842a), PorterDuff.Mode.MULTIPLY));
        jj0Var.setBackground(null);
        jj0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i10) {
        this.f20843b.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.f20844c.setTextColor(i10);
    }

    public aa(Context context) {
        this(context, 0, null);
    }

    public aa(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.E = BuildVars.DEBUG_PRIVATE_VERSION;
        this.f20842a = f6Var;
        this.f20848s = 21;
        TextView textView = new TextView(context);
        this.f20843b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        float f10 = 21;
        addView(textView, k7.b6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, true, true, !LocaleController.isRTL);
        this.f20844c = k6Var;
        k6Var.b(0.55f, 320L, nr.h);
        k6Var.setTextSize(AndroidUtilities.dp(16.0f));
        k6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        float f11 = 17;
        addView(k6Var, k7.b6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.j6.f20067m6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        addView((View) imageView, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f20845f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        addView(imageView2, k7.b6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
