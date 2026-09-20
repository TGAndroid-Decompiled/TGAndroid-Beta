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
import org.telegram.messenger.rk;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.qr;
public final class fa extends FrameLayout {
    public boolean E;
    public int F;
    public Paint G;
    public boolean H;
    public final org.telegram.ui.ActionBar.f6 f20301a;
    public final TextView f20302b;
    public final org.telegram.ui.Components.o6 f20303c;
    public final kj0 d;
    public org.telegram.ui.Components.v9 e;
    public final ImageView f20304f;
    public boolean h;
    public boolean f20305n;
    public boolean f20306r;
    public final int f20307s;
    public boolean v;
    public float f20308w;
    public float f20309x;
    public int f20310y;

    public fa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        this(context, 0, f6Var);
    }

    public final void a(ArrayList arrayList, boolean z10) {
        float f7;
        float f10;
        float f11;
        float f12;
        setEnabled(z10);
        TextView textView = this.f20302b;
        ImageView imageView = this.f20304f;
        org.telegram.ui.Components.o6 o6Var = this.f20303c;
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
            f7 = 1.0f;
        } else {
            f7 = 0.5f;
        }
        textView.setAlpha(f7);
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
        this.f20302b.setText(charSequence);
        this.f20303c.setVisibility(4);
        this.f20304f.setVisibility(4);
        this.h = z10;
        setWillNotDraw(!z10);
    }

    public final void c(CharSequence charSequence, CharSequence charSequence2, boolean z10, boolean z11) {
        this.f20302b.setText(charSequence);
        this.f20304f.setVisibility(4);
        org.telegram.ui.Components.o6 o6Var = this.f20303c;
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
        TextView textView = this.f20302b;
        textView.setGravity(i10 | 16);
        removeView(textView);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        float f7 = this.f20307s;
        addView(textView, w7.y5.d(-1, -1.0f, i11 | 48, f7, 0.0f, f7, 0.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        org.telegram.ui.Components.o6 o6Var = this.f20303c;
        o6Var.setGravity(i12 | 16);
        removeView(o6Var);
        if (LocaleController.isRTL) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        addView(o6Var, w7.y5.d(-2, -1.0f, i13 | 48, f7, 0.0f, f7, 0.0f));
        View view = this.d;
        removeView(view);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        addView(view, w7.y5.d(-2, -2.0f, i14 | 16, 21.0f, 0.0f, 21.0f, 0.0f));
        View view2 = this.f20304f;
        removeView(view2);
        if (!LocaleController.isRTL) {
            i15 = 5;
        }
        addView(view2, w7.y5.d(-2, -2.0f, i15 | 16, f7, 0.0f, f7, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        int i10 = 0;
        if (this.f20306r || this.f20309x != 0.0f) {
            if (this.G == null) {
                Paint paint = new Paint(1);
                this.G = paint;
                paint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.O5, this.f20301a));
            }
            if (this.v) {
                float f11 = this.f20308w + 0.016f;
                this.f20308w = f11;
                if (f11 > 1.0f) {
                    this.f20308w = 1.0f;
                    this.v = false;
                }
            } else {
                float f12 = this.f20308w - 0.016f;
                this.f20308w = f12;
                if (f12 < 0.0f) {
                    this.f20308w = 0.0f;
                    this.v = true;
                }
            }
            int i11 = this.F;
            if (i11 > 0) {
                this.F = i11 - 15;
            } else {
                boolean z10 = this.f20306r;
                if (z10) {
                    float f13 = this.f20309x;
                    if (f13 != 1.0f) {
                        float f14 = f13 + 0.10666667f;
                        this.f20309x = f14;
                        if (f14 > 1.0f) {
                            this.f20309x = 1.0f;
                        }
                    }
                }
                if (!z10) {
                    float f15 = this.f20309x;
                    if (f15 != 0.0f) {
                        float f16 = f15 - 0.10666667f;
                        this.f20309x = f16;
                        if (f16 < 0.0f) {
                            this.f20309x = 0.0f;
                        }
                    }
                }
            }
            this.G.setAlpha((int) (((this.f20308w * 0.4f) + 0.6f) * this.f20309x * 255.0f));
            int measuredHeight = getMeasuredHeight() >> 1;
            RectF rectF = AndroidUtilities.rectTmp;
            int measuredWidth = getMeasuredWidth();
            float f17 = this.f20307s;
            rectF.set((measuredWidth - AndroidUtilities.dp(f17)) - AndroidUtilities.dp(this.f20310y), measuredHeight - AndroidUtilities.dp(3.0f), getMeasuredWidth() - AndroidUtilities.dp(f17), AndroidUtilities.dp(3.0f) + measuredHeight);
            if (LocaleController.isRTL) {
                rectF.left = getMeasuredWidth() - rectF.left;
                rectF.right = getMeasuredWidth() - rectF.right;
            }
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), this.G);
            invalidate();
        }
        this.f20303c.setAlpha(1.0f - this.f20309x);
        super.dispatchDraw(canvas);
        if (this.h) {
            if (this.d.getVisibility() == 0) {
                f7 = 58.0f;
            } else {
                f7 = 20.0f;
            }
            int dp = AndroidUtilities.dp(f7);
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
            canvas.drawLine(f10, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f19216k0);
        }
    }

    public TextView getTextView() {
        return this.f20302b;
    }

    public org.telegram.ui.Components.v9 getValueBackupImageView() {
        int i10;
        if (this.e == null) {
            org.telegram.ui.Components.v9 v9Var = new org.telegram.ui.Components.v9(getContext());
            this.e = v9Var;
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            float f7 = this.f20307s - 4;
            addView(v9Var, w7.y5.d(24, 24.0f, i10 | 16, f7, 0.0f, f7, 0.0f));
        }
        return this.e;
    }

    public ImageView getValueImageView() {
        return this.f20304f;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.f20303c;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.v9 v9Var = this.e;
        if (v9Var != null && v9Var.getImageReceiver() != null && (this.e.getImageReceiver().getDrawable() instanceof org.telegram.ui.Components.p5)) {
            ((org.telegram.ui.Components.p5) this.e.getImageReceiver().getDrawable()).o(this);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f20302b.getText());
        org.telegram.ui.Components.o6 o6Var = this.f20303c;
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
        if (this.E && getParent() != null) {
            this.F = (int) ((getTop() / ((View) getParent()).getMeasuredHeight()) * 150.0f);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.h ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        if (this.H) {
            i12 = measuredWidth;
        } else {
            i12 = measuredWidth / 2;
        }
        ImageView imageView = this.f20304f;
        if (imageView.getVisibility() == 0) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        }
        kj0 kj0Var = this.d;
        if (kj0Var.getVisibility() == 0) {
            kj0Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), Integer.MIN_VALUE));
            if (this.H) {
                i12 = rk.x(8.0f, kj0Var.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.v9 v9Var = this.e;
        if (v9Var != null) {
            v9Var.measure(View.MeasureSpec.makeMeasureSpec(v9Var.getLayoutParams().height, 1073741824), View.MeasureSpec.makeMeasureSpec(this.e.getLayoutParams().width, 1073741824));
            if (this.H) {
                i12 = rk.x(8.0f, this.e.getMeasuredWidth(), i12);
            }
        }
        org.telegram.ui.Components.o6 o6Var = this.f20303c;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            if (this.H) {
                measuredWidth = rk.x(8.0f, o6Var.getMeasuredWidth(), i12);
            } else {
                measuredWidth = (measuredWidth - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
            }
            if (imageView.getVisibility() == 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                boolean z10 = LocaleController.isRTL;
                int i13 = this.f20307s;
                if (z10) {
                    marginLayoutParams.leftMargin = o6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                } else {
                    marginLayoutParams.rightMargin = o6Var.getMeasuredWidth() + AndroidUtilities.dp(i13 + 4);
                }
            }
        }
        this.f20302b.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setBetterLayout(boolean z10) {
        this.H = z10;
    }

    public void setCanDisable(boolean z10) {
        this.f20305n = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        float f10;
        super.setEnabled(z10);
        float f11 = 1.0f;
        if (!z10 && this.f20305n) {
            f7 = 0.5f;
        } else {
            f7 = 1.0f;
        }
        this.f20302b.setAlpha(f7);
        org.telegram.ui.Components.o6 o6Var = this.f20303c;
        if (o6Var.getVisibility() == 0) {
            if (!z10 && this.f20305n) {
                f10 = 0.5f;
            } else {
                f10 = 1.0f;
            }
            o6Var.setAlpha(f10);
        }
        ImageView imageView = this.f20304f;
        if (imageView.getVisibility() == 0) {
            if (!z10 && this.f20305n) {
                f11 = 0.5f;
            }
            imageView.setAlpha(f11);
        }
    }

    public void setIcon(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f20302b.getLayoutParams();
        kj0 kj0Var = this.d;
        if (i10 == 0) {
            kj0Var.setVisibility(8);
            boolean z10 = LocaleController.isRTL;
            int i11 = this.f20307s;
            if (z10) {
                marginLayoutParams.rightMargin = AndroidUtilities.dp(i11);
                return;
            } else {
                marginLayoutParams.leftMargin = AndroidUtilities.dp(i11);
                return;
            }
        }
        kj0Var.setImageResource(i10);
        kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19259m6, this.f20301a), PorterDuff.Mode.MULTIPLY));
        kj0Var.setBackground(null);
        kj0Var.setVisibility(0);
        if (LocaleController.isRTL) {
            marginLayoutParams.rightMargin = AndroidUtilities.dp(58.0f);
        } else {
            marginLayoutParams.leftMargin = AndroidUtilities.dp(58.0f);
        }
    }

    public void setTextColor(int i10) {
        this.f20302b.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.f20303c.setTextColor(i10);
    }

    public fa(Context context) {
        this(context, 0, null);
    }

    public fa(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.H = BuildVars.DEBUG_PRIVATE_VERSION;
        this.f20301a = f6Var;
        this.f20307s = 21;
        TextView textView = new TextView(context);
        this.f20302b = textView;
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        float f7 = 21;
        addView(textView, w7.y5.d(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, f7, 0.0f, f7, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !LocaleController.isRTL);
        this.f20303c = o6Var;
        o6Var.b(0.55f, 320L, qr.h);
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        o6Var.setGravity((LocaleController.isRTL ? 3 : 5) | 16);
        o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.I6, f6Var));
        float f10 = 17;
        addView(o6Var, w7.y5.d(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, f10, 0.0f, f10, 0.0f));
        ?? imageView = new ImageView(context);
        this.d = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i11 = org.telegram.ui.ActionBar.j6.f19259m6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v02, mode));
        imageView.setVisibility(8);
        addView((View) imageView, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 16.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f20304f = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setVisibility(4);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), mode));
        addView(imageView2, w7.y5.d(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 16, f7, 0.0f, f7, 0.0f));
    }
}
