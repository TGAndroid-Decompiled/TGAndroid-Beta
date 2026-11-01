package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.gr;
public final class s8 extends FrameLayout {
    public int f23053a;
    public final TextView f23054b;
    public final TextView f23055c;
    public final Switch d;
    public boolean e;
    public LinearLayout f23056f;
    public org.telegram.ui.Components.f6 h;
    public View f23057n;
    public bn f23058r;

    public s8(Context context) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        TextView textView = new TextView(context);
        this.f23054b = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = dd.X;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f7 = 64.0f;
        } else {
            f7 = 21.0f;
        }
        if (z10) {
            f10 = 21.0f;
        } else {
            f10 = 64.0f;
        }
        addView(textView, w7.b6.d(-2, -1.0f, i14, f7, 0.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23055c = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        textView2.setTextSize(1, 13.0f);
        if (dd.X) {
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
        boolean z11 = dd.X;
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
        addView(textView2, w7.b6.d(-2, -2.0f, i15, f11, 35.0f, f12, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, w7.b6.d(37, 40.0f, (dd.X ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z10) {
        float f7;
        if (this.f23056f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f23056f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getContext(), false, true, true);
            this.h = f6Var;
            f6Var.setTextSize(org.telegram.messenger.i0.L(14.0f));
            this.h.getDrawable().J = true;
            org.telegram.ui.Components.f6 f6Var2 = this.h;
            int i10 = org.telegram.ui.ActionBar.t6.G6;
            org.telegram.ui.ActionBar.a7.Z(f6Var2, i10, null);
            this.h.setTypeface(org.telegram.messenger.i0.o());
            this.h.b(0.4f, 320L, gr.h);
            this.f23056f.addView(this.h, w7.b6.c(20.0f, -2));
            this.f23057n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.a7.y(this, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
            this.f23057n.setBackground(mutate);
            this.f23056f.addView(this.f23057n, w7.b6.r(16, 16, 16));
            this.f23056f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f23056f, w7.b6.e(-2, -2, 16));
            int i11 = 5;
            bn bnVar = new bn(getContext(), 5);
            this.f23058r = bnVar;
            bnVar.setBackground(org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21021i6, false), 2, -1));
            bn bnVar2 = this.f23058r;
            if (dd.X) {
                i11 = 3;
            }
            addView(bnVar2, w7.b6.e(76, -1, i11));
        }
        this.h.setText(str);
        this.f23057n.animate().cancel();
        ViewPropertyAnimator animate = this.f23057n.animate();
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 180.0f;
        }
        animate.rotation(f7).setDuration(340L).setInterpolator(gr.h).start();
        this.f23058r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z10, boolean z11) {
        float f7;
        float f10;
        super.setEnabled(z10);
        Switch r02 = this.d;
        TextView textView = this.f23055c;
        TextView textView2 = this.f23054b;
        float f11 = 0.5f;
        if (z11) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            ViewPropertyAnimator animate = textView2.animate();
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
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
        TextView textView = this.f23054b;
        textView.setText(str);
        this.d.c(z10, z12);
        this.e = z11;
        this.f23055c.setVisibility(8);
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
        float L;
        int i10;
        if (this.e) {
            if (dd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(20.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                i10 = org.telegram.messenger.i0.L(20.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
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
        LinearLayout linearLayout = this.f23056f;
        if (linearLayout != null) {
            boolean z11 = dd.X;
            TextView textView = this.f23054b;
            if (z11) {
                linearLayout.setTranslationX((textView.getLeft() - this.f23056f.getMeasuredWidth()) - org.telegram.messenger.i0.L(8.0f));
                return;
            }
            linearLayout.setTranslationX(org.telegram.messenger.i0.L(8.0f) + textView.getRight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f23055c.getVisibility() == 0) {
            f7 = 64.0f;
        } else {
            f7 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(f7) + (this.e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.d.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        TextView textView = this.f23054b;
        textView.clearAnimation();
        TextView textView2 = this.f23055c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z10) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r22.setAlpha(1.0f);
            org.telegram.ui.Components.f6 f6Var = this.h;
            if (f6Var != null) {
                f6Var.setAlpha(1.0f);
            }
            View view = this.f23057n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r22.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.f6 f6Var2 = this.h;
        if (f6Var2 != null) {
            f6Var2.setAlpha(0.6f);
        }
        View view2 = this.f23057n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i10) {
        this.d.setIcon(i10);
    }
}
