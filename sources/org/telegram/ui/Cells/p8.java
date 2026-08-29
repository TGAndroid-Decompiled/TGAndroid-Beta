package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.jr;
public final class p8 extends FrameLayout {
    public int f25010a;
    public final TextView f25011b;
    public final TextView f25012c;
    public final Switch d;
    public boolean f25013e;
    public LinearLayout f25014f;
    public org.telegram.ui.Components.o6 h;
    public View f25015n;
    public fn f25016r;

    public p8(Context context) {
        super(context);
        int i10;
        int i11;
        float f9;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        TextView textView = new TextView(context);
        this.f25011b = textView;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.G6, null, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f9 = 64.0f;
        } else {
            f9 = 21.0f;
        }
        if (z10) {
            f10 = 21.0f;
        } else {
            f10 = 64.0f;
        }
        addView(textView, i7.f6.d(-2, -1.0f, i14, f9, 0.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f25012c = textView2;
        org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23450z6, null, textView2, 1, 13.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z11) {
            f11 = 64.0f;
        } else {
            f11 = 21.0f;
        }
        if (z11) {
            f12 = 21.0f;
        } else {
            f12 = 64.0f;
        }
        addView(textView2, i7.f6.d(-2, -2.0f, i15, f11, 35.0f, f12, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, i7.f6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z10) {
        float f9;
        int i10;
        if (this.f25014f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f25014f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getContext(), false, true, true);
            this.h = o6Var;
            o6Var.setTextSize(AndroidUtilities.dp(14.0f));
            this.h.getDrawable().D = true;
            org.telegram.ui.Components.o6 o6Var2 = this.h;
            int i11 = org.telegram.ui.ActionBar.g6.G6;
            o6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.b(0.4f, 320L, jr.h);
            this.f25014f.addView(this.h, i7.f6.c(20.0f, -2));
            this.f25015n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            this.f25015n.setBackground(mutate);
            this.f25014f.addView(this.f25015n, i7.f6.q(16, 16, 16));
            this.f25014f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f25014f, i7.f6.e(-2, -2, 16));
            fn fnVar = new fn(getContext(), 7);
            this.f25016r = fnVar;
            fnVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false), 2, -1));
            fn fnVar2 = this.f25016r;
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(fnVar2, i7.f6.e(76, -1, i10));
        }
        this.h.setText(str);
        this.f25015n.animate().cancel();
        ViewPropertyAnimator animate = this.f25015n.animate();
        if (z10) {
            f9 = 0.0f;
        } else {
            f9 = 180.0f;
        }
        animate.rotation(f9).setDuration(340L).setInterpolator(jr.h).start();
        this.f25016r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z10, boolean z11) {
        float f9;
        float f10;
        super.setEnabled(z10);
        Switch r02 = this.d;
        TextView textView = this.f25012c;
        TextView textView2 = this.f25011b;
        float f11 = 0.5f;
        if (z11) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            ViewPropertyAnimator animate = textView2.animate();
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.5f;
            }
            animate.alpha(f9).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate2.alpha(f10).start();
            ViewPropertyAnimator animate3 = r02.animate();
            if (z10) {
                f11 = 1.0f;
            }
            animate3.alpha(f11).start();
        } else if (z10) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r02.setAlpha(1.0f);
        } else {
            r02.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z10, boolean z11) {
        d(str, z10, z11, false);
    }

    public final void d(String str, boolean z10, boolean z11, boolean z12) {
        TextView textView = this.f25011b;
        textView.setText(str);
        this.d.c(z10, z12);
        this.f25013e = z11;
        this.f25012c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f25013e) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(20.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.d.h);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        LinearLayout linearLayout = this.f25014f;
        if (linearLayout != null) {
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.f25011b;
            if (z11) {
                linearLayout.setTranslationX((textView.getLeft() - this.f25014f.getMeasuredWidth()) - AndroidUtilities.dp(8.0f));
                return;
            }
            linearLayout.setTranslationX(AndroidUtilities.dp(8.0f) + textView.getRight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f25012c.getVisibility() == 0) {
            f9 = 64.0f;
        } else {
            f9 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f9) + (this.f25013e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.d.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        TextView textView = this.f25011b;
        textView.clearAnimation();
        TextView textView2 = this.f25012c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z10) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r22.setAlpha(1.0f);
            org.telegram.ui.Components.o6 o6Var = this.h;
            if (o6Var != null) {
                o6Var.setAlpha(1.0f);
            }
            View view = this.f25015n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r22.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.o6 o6Var2 = this.h;
        if (o6Var2 != null) {
            o6Var2.setAlpha(0.6f);
        }
        View view2 = this.f25015n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i10) {
        this.d.setIcon(i10);
    }
}
