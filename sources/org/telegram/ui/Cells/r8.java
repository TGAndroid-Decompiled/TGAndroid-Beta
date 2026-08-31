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
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.pr;
public final class r8 extends FrameLayout {
    public int f23593a;
    public final TextView f23594b;
    public final TextView f23595c;
    public final Switch d;
    public boolean f23596e;
    public LinearLayout f23597f;
    public org.telegram.ui.Components.k6 h;
    public View f23598n;
    public jn f23599r;

    public r8(Context context) {
        super(context);
        int i10;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f23594b = textView;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.G6, null, textView, 1, 16.0f);
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
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z4) {
            f10 = 64.0f;
        } else {
            f10 = 21.0f;
        }
        if (z4) {
            f11 = 21.0f;
        } else {
            f11 = 64.0f;
        }
        addView(textView, k7.c6.d(-2, -1.0f, i14, f10, 0.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23595c = textView2;
        org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f22053z6, null, textView2, 1, 13.0f);
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
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z10) {
            f12 = 64.0f;
        } else {
            f12 = 21.0f;
        }
        if (z10) {
            f13 = 21.0f;
        } else {
            f13 = 64.0f;
        }
        addView(textView2, k7.c6.d(-2, -2.0f, i15, f12, 35.0f, f13, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, k7.c6.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z4) {
        float f10;
        int i10;
        if (this.f23597f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f23597f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getContext(), false, true, true);
            this.h = k6Var;
            k6Var.setTextSize(AndroidUtilities.dp(14.0f));
            this.h.getDrawable().D = true;
            org.telegram.ui.Components.k6 k6Var2 = this.h;
            int i11 = org.telegram.ui.ActionBar.k6.G6;
            k6Var2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i11, false));
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.b(0.4f, 320L, pr.h);
            this.f23597f.addView(this.h, k7.c6.c(20.0f, -2));
            this.f23598n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.MULTIPLY));
            this.f23598n.setBackground(mutate);
            this.f23597f.addView(this.f23598n, k7.c6.q(16, 16, 16));
            this.f23597f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f23597f, k7.c6.e(-2, -2, 16));
            jn jnVar = new jn(getContext(), 6);
            this.f23599r = jnVar;
            jnVar.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21750i6, false), 2, -1));
            jn jnVar2 = this.f23599r;
            if (LocaleController.isRTL) {
                i10 = 3;
            } else {
                i10 = 5;
            }
            addView(jnVar2, k7.c6.e(76, -1, i10));
        }
        this.h.setText(str);
        this.f23598n.animate().cancel();
        ViewPropertyAnimator animate = this.f23598n.animate();
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(pr.h).start();
        this.f23599r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z4, boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z4);
        Switch r02 = this.d;
        TextView textView = this.f23595c;
        TextView textView2 = this.f23594b;
        float f12 = 0.5f;
        if (z10) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            ViewPropertyAnimator animate = textView2.animate();
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            animate2.alpha(f11).start();
            ViewPropertyAnimator animate3 = r02.animate();
            if (z4) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).start();
        } else if (z4) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r02.setAlpha(1.0f);
        } else {
            r02.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z4, boolean z10) {
        d(str, z4, z10, false);
    }

    public final void d(String str, boolean z4, boolean z10, boolean z11) {
        TextView textView = this.f23594b;
        textView.setText(str);
        this.d.c(z4, z11);
        this.f23596e = z10;
        this.f23595c.setVisibility(8);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.topMargin = 0;
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z10);
    }

    public Switch getCheckBox() {
        return this.d;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.f23596e) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        LinearLayout linearLayout = this.f23597f;
        if (linearLayout != null) {
            boolean z10 = LocaleController.isRTL;
            TextView textView = this.f23594b;
            if (z10) {
                linearLayout.setTranslationX((textView.getLeft() - this.f23597f.getMeasuredWidth()) - AndroidUtilities.dp(8.0f));
                return;
            }
            linearLayout.setTranslationX(AndroidUtilities.dp(8.0f) + textView.getRight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f23595c.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f10) + (this.f23596e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z4) {
        this.d.c(z4, true);
    }

    @Override
    public void setEnabled(boolean z4) {
        super.setEnabled(z4);
        TextView textView = this.f23594b;
        textView.clearAnimation();
        TextView textView2 = this.f23595c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z4) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r22.setAlpha(1.0f);
            org.telegram.ui.Components.k6 k6Var = this.h;
            if (k6Var != null) {
                k6Var.setAlpha(1.0f);
            }
            View view = this.f23598n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r22.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.k6 k6Var2 = this.h;
        if (k6Var2 != null) {
            k6Var2.setAlpha(0.6f);
        }
        View view2 = this.f23598n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i10) {
        this.d.setIcon(i10);
    }
}
