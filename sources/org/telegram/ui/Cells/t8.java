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
import org.telegram.messenger.ll;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.pi0;
public class t8 extends FrameLayout {
    public static final ch.g F = new ch.g("animationProgress", 2);
    public int A;
    public final org.telegram.ui.ActionBar.b6 B;
    public pi0 C;
    public boolean D;
    public boolean E;
    public boolean f25708a;
    public int f25709b;
    public final TextView f25710c;
    public final TextView d;
    public final Switch f25711e;
    public boolean f25712f;
    public boolean h;
    public int f25713n;
    public int f25714r;
    public float f25715s;
    public Paint v;
    public float f25716w;
    public ObjectAnimator f25717x;
    public boolean f25718y;

    public t8(Context context) {
        this(context, 21);
    }

    private float getLastTouchX() {
        int measuredWidth;
        if (this.f25708a) {
            if (LocaleController.isRTL) {
                measuredWidth = AndroidUtilities.dp(22.0f);
            } else {
                measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
            }
            return measuredWidth;
        }
        return this.f25716w;
    }

    public void setAnimationProgress(float f10) {
        this.f25715s = f10;
        float lastTouchX = getLastTouchX();
        float max = (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f25715s;
        Switch r22 = this.f25711e;
        r22.N = lastTouchX;
        r22.O = getMeasuredHeight() / 2;
        r22.P = max;
        r22.invalidate();
    }

    public final void b(int i9, boolean z10) {
        ObjectAnimator objectAnimator = this.f25717x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25717x = null;
        }
        int i10 = this.f25714r;
        if (i10 != 0) {
            setBackgroundColor(i10);
        }
        int i11 = 1;
        if (this.v == null) {
            this.v = new Paint(1);
        }
        if (!z10) {
            i11 = 2;
        }
        this.f25711e.setOverrideColor(i11);
        this.f25714r = i9;
        this.v.setColor(i9);
        this.f25715s = 0.0f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, F, 0.0f, 1.0f);
        this.f25717x = ofFloat;
        ofFloat.addListener(new r8(this, i9, 0));
        this.f25717x.setInterpolator(gr.f28845g);
        this.f25717x.setDuration(240L).start();
    }

    public final void c(int i9, int i10) {
        int i11;
        int i12;
        if (this.C == null) {
            ?? imageView = new ImageView(getContext());
            this.C = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            pi0 pi0Var = this.C;
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            addView(pi0Var, g7.e6.d(29, 29.0f, i11 | 16, 19.0f, 0.0f, 19.0f, 0.0f));
            this.A = AndroidUtilities.dp(65.0f);
            TextView textView = this.f25710c;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            int i13 = 70;
            if (LocaleController.isRTL) {
                i12 = 70;
            } else {
                i12 = this.A;
            }
            marginLayoutParams.leftMargin = i12;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
            if (LocaleController.isRTL) {
                i13 = this.A;
            }
            marginLayoutParams2.rightMargin = i13;
        }
        this.C.setVisibility(0);
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        this.C.setImageResource(i10);
        this.C.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        this.C.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(9.0f), i9));
    }

    public final void d(int i9, int i10, int i11, int i12, int i13) {
        int v02 = org.telegram.ui.ActionBar.f6.v0(i9, this.B);
        TextView textView = this.f25710c;
        textView.setTextColor(v02);
        this.f25711e.d(i10, i11, i12, i13);
        textView.setTag(Integer.valueOf(i9));
    }

    public final void e(ArrayList arrayList, boolean z10) {
        float f10;
        float f11;
        float f12;
        float f13;
        super.setEnabled(z10);
        Switch r02 = this.f25711e;
        TextView textView = this.f25710c;
        TextView textView2 = this.d;
        float f14 = 0.5f;
        if (arrayList != null) {
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.5f;
            }
            float[] fArr = {f12};
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, property, fArr));
            if (z10) {
                f13 = 1.0f;
            } else {
                f13 = 0.5f;
            }
            arrayList.add(ObjectAnimator.ofFloat(r02, property, f13));
            if (textView2.getVisibility() == 0) {
                if (z10) {
                    f14 = 1.0f;
                }
                arrayList.add(ObjectAnimator.ofFloat(textView2, property, f14));
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
        if (z10) {
            f11 = 1.0f;
        } else {
            f11 = 0.5f;
        }
        r02.setAlpha(f11);
        if (textView2.getVisibility() == 0) {
            if (z10) {
                f14 = 1.0f;
            }
            textView2.setAlpha(f14);
        }
    }

    public final void f(CharSequence charSequence, boolean z10, boolean z11) {
        org.telegram.ui.f5.a(charSequence, this);
        TextView textView = this.f25710c;
        textView.setText(charSequence);
        this.h = false;
        Switch r12 = this.f25711e;
        r12.setVisibility(0);
        r12.c(z10, this.E);
        this.f25712f = z11;
        this.d.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public final void g(String str, String str2, boolean z10, boolean z11, boolean z12) {
        org.telegram.ui.f5.a(str, this);
        TextView textView = this.f25710c;
        textView.setText(str);
        TextView textView2 = this.d;
        textView2.setText(str2);
        Switch r42 = this.f25711e;
        r42.setVisibility(0);
        r42.c(z10, false);
        this.f25712f = z12;
        textView2.setVisibility(0);
        this.h = z11;
        if (z11) {
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
        setWillNotDraw(!z12);
    }

    public Switch getCheckBox() {
        return this.f25711e;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E = false;
    }

    @Override
    public void onDraw(Canvas canvas) {
        Paint paint;
        if (this.f25714r != 0) {
            float lastTouchX = getLastTouchX();
            canvas.drawCircle(lastTouchX, getMeasuredHeight() / 2, (Math.max(lastTouchX, getMeasuredWidth() - lastTouchX) + AndroidUtilities.dp(40.0f)) * this.f25715s, this.v);
        }
        if (this.f25712f) {
            org.telegram.ui.ActionBar.b6 b6Var = this.B;
            if (b6Var != null) {
                paint = b6Var.O("paintDivider");
            } else {
                paint = org.telegram.ui.ActionBar.f6.f23121k0;
            }
            Paint paint2 = paint;
            if (paint2 != null) {
                int i9 = 0;
                float f10 = 0.0f;
                if (this.C != null) {
                    if (!LocaleController.isRTL) {
                        f10 = this.A;
                    }
                    float measuredHeight = getMeasuredHeight() - 1;
                    int measuredWidth = getMeasuredWidth();
                    if (LocaleController.isRTL) {
                        i9 = this.A;
                    }
                    canvas.drawLine(f10, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, paint2);
                    return;
                }
                int i10 = 0;
                if (!LocaleController.isRTL) {
                    f10 = AndroidUtilities.dp(20.0f);
                }
                float measuredHeight2 = getMeasuredHeight() - 1;
                int measuredWidth2 = getMeasuredWidth();
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(20.0f);
                }
                canvas.drawLine(f10, measuredHeight2, measuredWidth2 - i10, getMeasuredHeight() - 1, paint2);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f25711e.h);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f25710c.getText());
        TextView textView = this.d;
        if (!TextUtils.isEmpty(textView.getText())) {
            sb2.append('\n');
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setContentDescription(sb2);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        float f10;
        if (this.h) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        if (this.d.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = this.f25713n;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.f25712f ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f25716w = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimatingToThumbInsteadOfTouch(boolean z10) {
        this.f25708a = z10;
    }

    @Override
    public void setBackgroundColor(int i9) {
        if (this.f25714r != i9) {
            clearAnimation();
            this.f25714r = 0;
            super.setBackgroundColor(i9);
        }
    }

    public void setBackgroundColorAnimatedReverse(int i9) {
        ObjectAnimator objectAnimator = this.f25717x;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.f25717x = null;
        }
        int i10 = this.f25714r;
        if (i10 == 0) {
            if (getBackground() instanceof ColorDrawable) {
                i10 = ((ColorDrawable) getBackground()).getColor();
            } else {
                i10 = 0;
            }
        }
        if (this.v == null) {
            this.v = new Paint(1);
        }
        this.v.setColor(i10);
        setBackgroundColor(i9);
        this.f25711e.setOverrideColor(1);
        this.f25714r = i9;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, F, 1.0f, 0.0f).setDuration(240L);
        this.f25717x = duration;
        duration.addListener(new r8(this, i9, 1));
        this.f25717x.setInterpolator(gr.f28845g);
        this.f25717x.start();
    }

    public void setCheckBoxIcon(int i9) {
        this.f25711e.setIcon(i9);
    }

    public void setChecked(boolean z10) {
        this.f25711e.c(z10, true);
    }

    public void setDivider(boolean z10) {
        this.f25712f = z10;
        setWillNotDraw(!z10);
    }

    public void setDrawCheckRipple(boolean z10) {
        this.f25718y = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        this.f25711e.setEnabled(z10);
    }

    public void setHeight(int i9) {
        this.f25713n = i9;
    }

    @Override
    public void setPressed(boolean z10) {
        if (this.f25718y) {
            this.f25711e.setDrawRipple(z10);
        }
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f25710c.setTypeface(typeface);
    }

    public t8(Context context, int i9) {
        this(i9, context, null, false);
    }

    public t8(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        this(21, context, b6Var, false);
    }

    public t8(int i9, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context);
        this.f25713n = 50;
        this.B = b6Var;
        this.A = i9;
        TextView textView = new TextView(context);
        this.f25710c = textView;
        ll.n(z10 ? org.telegram.ui.ActionBar.f6.f23108j5 : org.telegram.ui.ActionBar.f6.G6, b6Var, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -1.0f, (z11 ? 5 : 3) | 48, z11 ? 70.0f : i9, 0.0f, z11 ? i9 : 70.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        ll.n(z10 ? org.telegram.ui.ActionBar.f6.J5 : org.telegram.ui.ActionBar.f6.f23386z6, b6Var, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z12 = LocaleController.isRTL;
        addView(textView2, g7.e6.d(-2, -2.0f, (z12 ? 5 : 3) | 48, z12 ? 70.0f : i9, 35.0f, z12 ? i9 : 70.0f, 0.0f));
        Switch r12 = new Switch(context, b6Var);
        this.f25711e = r12;
        int i10 = org.telegram.ui.ActionBar.f6.M6;
        int i11 = org.telegram.ui.ActionBar.f6.N6;
        int i12 = org.telegram.ui.ActionBar.f6.f23001d6;
        r12.d(i10, i11, i12, i12);
        addView(r12, g7.e6.d(37, 20.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
        this.D = LocaleController.isRTL;
    }
}
