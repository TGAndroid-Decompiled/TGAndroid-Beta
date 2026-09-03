package org.telegram.ui.Cells;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.pr;
public class s8 extends FrameLayout {
    public static final ih.g G = new ih.g("animationProgress", 2);
    public int B;
    public final org.telegram.ui.ActionBar.g6 C;
    public kj0 D;
    public boolean E;
    public boolean F;
    public boolean f23752a;
    public int f23753b;
    public final TextView f23754c;
    public final TextView d;
    public final Switch f23755e;
    public boolean f23756f;
    public boolean h;
    public int f23757n;
    public int f23758r;
    public float f23759s;
    public Paint v;
    public float f23760w;
    public ObjectAnimator f23761x;
    public boolean f23762y;

    public s8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.f23752a) {
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
            }
            return measuredWidth;
        }
        return this.f23760w;
    }

    public void setAnimationProgress(float f10) {
        this.f23759s = f10;
        float lastTouchX = getLastTouchX();
        float max = (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f23759s;
        Switch r22 = this.f23755e;
        r22.O = lastTouchX;
        r22.P = getMeasuredHeight() / 2;
        r22.Q = max;
        r22.invalidate();
    }

    public final void b(int i10, boolean z4) {
        ObjectAnimator objectAnimator = this.f23761x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23761x = null;
        }
        int i11 = this.f23758r;
        if (i11 != 0) {
            setBackgroundColor(i11);
        }
        int i12 = 1;
        if (this.v == null) {
            this.v = new Paint(1);
        }
        if (!z4) {
            i12 = 2;
        }
        this.f23755e.setOverrideColor(i12);
        this.f23758r = i10;
        this.v.setColor(i10);
        this.f23759s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, G, 0.0f, 1.0f);
        this.f23761x = ofFloat;
        ofFloat.addListener(new q8(this, i10, 0));
        this.f23761x.setInterpolator(pr.f30169g);
        this.f23761x.setDuration(240L).start();
    }

    public final void c(int i10, int i11) {
        int i12;
        int i13;
        if (this.D == null) {
            ?? imageView = new ImageView(getContext());
            this.D = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            kj0 kj0Var = this.D;
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            addView(kj0Var, k7.c6.d(29, 29.0f, i12 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.B = AndroidUtilities.dp(65.0f);
            TextView textView = this.f23754c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i14 = 70;
            if (LocaleController.isRTL) {
                i13 = 70;
            } else {
                i13 = this.B;
            }
            marginLayoutParams.leftMargin = i13;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (LocaleController.isRTL) {
                i14 = this.B;
            }
            marginLayoutParams2.rightMargin = i14;
        }
        this.D.setVisibility(0);
        this.D.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.D.setImageResource(i11);
        this.D.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.D.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(9.0f), i10));
    }

    public final void d(int i10, int i11, int i12, int i13, int i14) {
        int v02 = org.telegram.ui.ActionBar.k6.v0(i10, this.C);
        TextView textView = this.f23754c;
        textView.setTextColor(v02);
        this.f23755e.d(i11, i12, i13, i14);
        textView.setTag(Integer.valueOf(i10));
    }

    public final void e(ArrayList arrayList, boolean z4) {
        float f10;
        float f11;
        float f12;
        float f13;
        super.setEnabled(z4);
        Switch r02 = this.f23755e;
        TextView textView = this.f23754c;
        TextView textView2 = this.d;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z4) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            float[] fArr = {f12};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z4) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r02, property, f13));
            if (textView2.getVisibility() == 0) {
                if (z4) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(textView2, property, f14));
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
        if (z4) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        r02.setAlpha(f11);
        if (textView2.getVisibility() == 0) {
            if (z4) {
                f14 = 1.0f;
            }
            textView2.setAlpha(f14);
        }
    }

    public final void f(CharSequence charSequence, boolean z4, boolean z10) {
        org.telegram.ui.i5.a(charSequence, this);
        TextView textView = this.f23754c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.f23755e;
        r12.setVisibility(0);
        r12.c(z4, this.F);
        this.f23756f = z10;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public final void g(String str, String str2, boolean z4, boolean z10, boolean z11) {
        org.telegram.ui.i5.a(str, this);
        TextView textView = this.f23754c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.f23755e;
        r42.setVisibility(0);
        r42.c(z4, false);
        this.f23756f = z11;
        textView2.setVisibility(0);
        this.h = z10;
        if (z10) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, AndroidUtilities.dp(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public Switch getCheckBox() {
        return this.f23755e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        if (this.f23758r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f23759s, this.v);
        }
        if (this.f23756f) {
            org.telegram.ui.ActionBar.g6 g6Var = this.C;
            if (g6Var != null) {
                paint = g6Var.F("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.k6.f21781k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                int i10 = 0;
                float f10 = 0.0f;
                if (this.D != null) {
                    if (!LocaleController.isRTL) {
                        f10 = this.B;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (LocaleController.isRTL) {
                        i10 = this.B;
                    }
                    canvas.drawLine(f10, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, paint2);
                    return;
                }
                int i11 = 0;
                if (!LocaleController.isRTL) {
                    f10 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(20.0f);
                }
                canvas.drawLine(f10, measuredHeight2, measuredWidth2 - i11, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f23755e.h);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23754c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb.append('\n');
            sb.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.d.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f23757n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.f23756f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f23760w = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z4) {
        this.f23752a = z4;
    }

    @Override
    public void setBackgroundColor(int i10) {
        if (this.f23758r != i10) {
            clearAnimation();
            this.f23758r = 0;
            super.setBackgroundColor(i10);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i10) {
        ObjectAnimator objectAnimator = this.f23761x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f23761x = null;
        }
        int i11 = this.f23758r;
        if (i11 == 0) {
            if (getBackground() instanceof ColorDrawable) {
                i11 = ((ColorDrawable) getBackground()).getColor();
            } else {
                i11 = 0;
            }
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.v.setColor(i11);
        setBackgroundColor(i10);
        this.f23755e.setOverrideColor(1);
        this.f23758r = i10;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, G, 1.0f, 0.0f).setDuration(240L);
        this.f23761x = duration;
        duration.addListener(new q8(this, i10, 1));
        this.f23761x.setInterpolator(pr.f30169g);
        this.f23761x.start();
    }

    public void setCheckBoxIcon(int i10) {
        this.f23755e.setIcon(i10);
    }

    public void setChecked(boolean z4) {
        this.f23755e.c(z4, true);
    }

    public void setDivider(boolean z4) {
        this.f23756f = z4;
        setWillNotDraw(!z4);
    }

    public void setDrawCheckRipple(boolean z4) {
        this.f23762y = z4;
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        this.f23755e.setEnabled(z4);
    }

    public void setHeight(int i10) {
        this.f23757n = i10;
    }

    @Override
    public void setPressed(boolean z4) {
        if (this.f23762y) {
            this.f23755e.setDrawRipple(z4);
        }
        super.setPressed(z4);
    }

    public void setTypeface(Typeface typeface) {
        this.f23754c.setTypeface(typeface);
    }

    public s8(Context context, int i10) {
        this(i10, context, null, false);
    }

    public s8(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        this(21, context, g6Var, false);
    }

    public s8(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context);
        this.f23757n = 50;
        this.C = g6Var;
        this.B = i10;
        TextView textView = new TextView(context);
        this.f23754c = textView;
        org.telegram.ui.b.l(z4 ? org.telegram.ui.ActionBar.k6.f21768j5 : org.telegram.ui.ActionBar.k6.G6, g6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = LocaleController.isRTL;
        addView(textView, k7.c6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 70.0f : i10, 0.0f, z10 ? i10 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        org.telegram.ui.b.l(z4 ? org.telegram.ui.ActionBar.k6.J5 : org.telegram.ui.ActionBar.k6.f22055z6, g6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, k7.c6.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i10, 35.0f, z11 ? i10 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, g6Var);
        this.f23755e = r12;
        int i11 = org.telegram.ui.ActionBar.k6.M6;
        int i12 = org.telegram.ui.ActionBar.k6.N6;
        int i13 = org.telegram.ui.ActionBar.k6.f21661d6;
        r12.d(i11, i12, i13, i13);
        addView(r12, k7.c6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.E = LocaleController.isRTL;
    }
}
