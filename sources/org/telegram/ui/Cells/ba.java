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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pi0;
public final class ba extends FrameLayout {
    public boolean A;
    public int B;
    public Paint C;
    public boolean D;
    public final org.telegram.ui.ActionBar.b6 f24160a;
    public final TextView f24161b;
    public final org.telegram.ui.Components.j6 f24162c;
    public final pi0 d;
    public org.telegram.ui.Components.o9 f24163e;
    public final ImageView f24164f;
    public boolean h;
    public boolean f24165n;
    public boolean f24166r;
    public final int f24167s;
    public boolean v;
    public float f24168w;
    public float f24169x;
    public int f24170y;

    public ba(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(context, 0, b6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        setEnabled(z10);
        TextView textView = this.f24161b;
        ImageView imageView = this.f24164f;
        org.telegram.ui.Components.j6 j6Var = this.f24162c;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", f12));
            if (j6Var.getVisibility() == 0) {
                if (z10) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.5f;
                }
                arrayList.add(ObjectAnimator.ofFloat(j6Var, "alpha", f13));
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
        if (j6Var.getVisibility() == 0) {
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            j6Var.setAlpha(f11);
        }
        if (imageView.getVisibility() == 0) {
            if (z10) {
                f14 = 1.0f;
            }
            imageView.setAlpha(f14);
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        this.f24161b.setText(charSequence);
        this.f24162c.setVisibility(4);
        this.f24164f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f24161b.setText(charSequence);
        this.f24164f.setVisibility(4);
        org.telegram.ui.Components.j6 j6Var = this.f24162c;
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
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = 3;
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        TextView textView = this.f24161b;
        textView.setGravity(i9 | 16);
        removeView(textView);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        float f10 = this.f24167s;
        addView(textView, g7.e6.d(-1, -1.0f, i10 | 48, f10, 0.0f, f10, 0.0f));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        org.telegram.ui.Components.j6 j6Var = this.f24162c;
        j6Var.setGravity(i11 | 16);
        removeView(j6Var);
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        addView(j6Var, g7.e6.d(-2, -1.0f, i12 | 48, f10, 0.0f, f10, 0.0f));
        View view = this.d;
        removeView(view);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(view, g7.e6.d(-2, -2.0f, i13 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f24164f;
        removeView(view2);
        if (!LocaleController.isRTL) {
            i14 = 5;
        }
        addView(view2, g7.e6.d(-2, -2.0f, i14 | 16, f10, 0.0f, f10, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int i9 = 0;
        if (this.f24166r || this.f24169x != 0.0f) {
            if (this.C == null) {
                Paint paint = new Paint(1);
                this.C = paint;
                paint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.O5, this.f24160a));
            }
            if (this.v) {
                float f12 = this.f24168w + 0.016f;
                this.f24168w = f12;
                if (f12 > 1.0f) {
                    this.f24168w = 1.0f;
                    this.v = false;
                }
            } else {
                float f13 = this.f24168w - 0.016f;
                this.f24168w = f13;
                if (f13 < 0.0f) {
                    this.f24168w = 0.0f;
                    this.v = true;
                }
            }
            int i10 = this.B;
            if (i10 > 0) {
                this.B = i10 - 15;
            } else {
                boolean z10 = this.f24166r;
                if (z10) {
                    float f14 = this.f24169x;
                    if (f14 != 1.0f) {
                        float f15 = f14 + 0.10666667f;
                        this.f24169x = f15;
                        if (f15 > 1.0f) {
                            this.f24169x = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f16 = this.f24169x;
                    if (f16 != 0.0f) {
                        float f17 = f16 - 0.10666667f;
                        this.f24169x = f17;
                        if (f17 < 0.0f) {
                            this.f24169x = 0.0f;
                        }
                    }
                }
            }
            this.C.setAlpha((int) (((this.f24168w * 0.4f) + 0.6f) * this.f24169x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f18 = this.f24167s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f18)) - AndroidUtilities.dp(this.f24170y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f18), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.C);
            invalidate();
        }
        this.f24162c.setAlpha(1.0f - this.f24169x);
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
                i9 = dp;
            }
            canvas.drawLine(f11, measuredHeight2, measuredWidth2 - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    public TextView getTextView() {
        return this.f24161b;
    }

    public org.telegram.ui.Components.o9 getValueBackupImageView() {
        int i9;
        if (this.f24163e == null) {
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(getContext());
            this.f24163e = o9Var;
            if (LocaleController.isRTL) {
                i9 = 3;
            } else {
                i9 = 5;
            }
            float f10 = this.f24167s - 4;
            addView(o9Var, g7.e6.d(24, 24.0f, i9 | 16, f10, 0.0f, f10, 0.0f));
        }
        return this.f24163e;
    }

    public ImageView getValueImageView() {
        return this.f24164f;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
        return this.f24162c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.o9 o9Var = this.f24163e;
        if (o9Var != null && o9Var.getImageReceiver() != null && (this.f24163e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.k5)) {
            ((org.telegram.ui.Components.k5) this.f24163e.getImageReceiver().getDrawable()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f24161b.getText());
        org.telegram.ui.Components.j6 j6Var = this.f24162c;
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
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (this.A && getParent() != null) {
            this.B = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        if (this.D) {
            i11 = measuredWidth;
        } else {
            i11 = measuredWidth / 2;
        }
        ImageView imageView = this.f24164f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        pi0 pi0Var = this.d;
        if (pi0Var.getVisibility() == 0) {
            pi0Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.D) {
                i11 = ll.w(8.0f, pi0Var.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.o9 o9Var = this.f24163e;
        if (o9Var != null) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(o9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f24163e.getLayoutParams().width, 1073741824));
            if (this.D) {
                i11 = ll.w(8.0f, this.f24163e.getMeasuredWidth(), i11);
            }
        }
        org.telegram.ui.Components.j6 j6Var = this.f24162c;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.D) {
                measuredWidth = ll.w(8.0f, j6Var.getMeasuredWidth(), i11);
            } else {
                measuredWidth = (measuredWidth - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i12 = this.f24167s;
                if (z10) {
                    marginLayoutParams.leftMargin = j6Var.getMeasuredWidth() + AndroidUtilities.dp(i12 + 4);
                } else {
                    marginLayoutParams.rightMargin = j6Var.getMeasuredWidth() + AndroidUtilities.dp(i12 + 4);
                }
            }
        }
        this.f24161b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.D = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f24165n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z10);
        float f12 = 1.0f;
        if (!z10 && this.f24165n) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f24161b.setAlpha(f10);
        org.telegram.ui.Components.j6 j6Var = this.f24162c;
        if (j6Var.getVisibility() == 0) {
            if (!z10 && this.f24165n) {
                f11 = 0.5f;
            } else {
                f11 = 1.0f;
            }
            j6Var.setAlpha(f11);
        }
        ImageView imageView = this.f24164f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f24165n) {
                f12 = 0.5f;
            }
            imageView.setAlpha(f12);
        }
    }

    public void setIcon(int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f24161b.getLayoutParams();
        pi0 pi0Var = this.d;
        if (i9 == 0) {
            pi0Var.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            int i10 = this.f24167s;
            if (z10) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i10);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i10);
                return;
            }
        }
        pi0Var.setImageResource(i9);
        pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23162m6, this.f24160a), PorterDuff.Mode.MULTIPLY));
        pi0Var.setBackground(null);
        pi0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i9) {
        this.f24161b.setTextColor(i9);
    }

    public void setTextValueColor(int i9) {
        this.f24162c.setTextColor(i9);
    }

    public ba(Context context) {
        this(context, 0, null);
    }

    public ba(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.D = BuildVars.DEBUG_PRIVATE_VERSION;
        this.f24160a = b6Var;
        this.f24167s = 21;
        TextView textView = new TextView(context);
        this.f24161b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        float f10 = 21;
        addView(textView, g7.e6.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f10, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !LocaleController.isRTL);
        this.f24162c = j6Var;
        j6Var.b(0.55f, 320L, gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        j6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var));
        float f11 = 17;
        addView(j6Var, g7.e6.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f11, 0.0f, f11, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i10 = org.telegram.ui.ActionBar.f6.f23162m6;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        addView((View) imageView, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f24164f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), mode));
        addView(imageView2, g7.e6.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f10, 0.0f, f10, 0.0f));
    }
}
