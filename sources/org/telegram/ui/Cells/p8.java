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
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.xq;
public final class p8 extends FrameLayout {
    public int f29815a;
    public final TextView f29816b;
    public final TextView f29817c;
    public final Switch d;
    public boolean f29818e;
    public LinearLayout f29819f;
    public org.telegram.ui.Components.h6 h;
    public View f29820n;
    public sm f29821r;

    public p8(Context context) {
        super(context);
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f29816b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = bd.f21784a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 48;
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 21.0f;
        }
        if (z10) {
            f11 = 21.0f;
        } else {
            f11 = 64.0f;
        }
        addView(textView, mf.d(-2, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f29817c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
        textView2.setTextSize(1, 13.0f);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = bd.f21784a0;
        if (z11) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i14 = i12 | 48;
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 21.0f;
        }
        if (z11) {
            f13 = 21.0f;
        } else {
            f13 = 64.0f;
        }
        addView(textView2, mf.d(-2, -2.0f, i14, f12, 35.0f, f13, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, mf.d(37, 40.0f, (bd.f21784a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z10) {
        float f10;
        int i3;
        if (this.f29819f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f29819f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getContext(), false, true, true);
            this.h = h6Var;
            h6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            this.h.getDrawable().J = true;
            org.telegram.ui.Components.h6 h6Var2 = this.h;
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.Z(h6Var2, i10, null);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.b(0.4f, 320L, xq.h);
            this.f29819f.addView(this.h, mf.c(20.0f, -2));
            this.f29820n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
            this.f29820n.setBackground(mutate);
            this.f29819f.addView(this.f29820n, mf.r(16, 16, 16));
            this.f29819f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f29819f, mf.e(-2, -2, 16));
            sm smVar = new sm(getContext(), 9);
            this.f29821r = smVar;
            smVar.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27972i6, false), 2, -1));
            sm smVar2 = this.f29821r;
            if (bd.f21784a0) {
                i3 = 3;
            } else {
                i3 = 5;
            }
            addView(smVar2, mf.e(76, -1, i3));
        }
        this.h.setText(str);
        this.f29820n.animate().cancel();
        ViewPropertyAnimator animate = this.f29820n.animate();
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(xq.h).start();
        this.f29821r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z10, boolean z11) {
        float f10;
        float f11;
        super.setEnabled(z10);
        Switch r02 = this.d;
        TextView textView = this.f29817c;
        TextView textView2 = this.f29816b;
        float f12 = 0.5f;
        if (z11) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            ViewPropertyAnimator animate = textView2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            animate2.alpha(f11).start();
            ViewPropertyAnimator animate3 = r02.animate();
            if (z10) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).start();
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
        TextView textView = this.f29816b;
        textView.setText(str);
        this.d.c(z10, z12);
        this.f29818e = z11;
        this.f29817c.setVisibility(8);
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
        int i3;
        if (this.f29818e) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        LinearLayout linearLayout = this.f29819f;
        if (linearLayout != null) {
            boolean z11 = bd.f21784a0;
            TextView textView = this.f29816b;
            if (z11) {
                linearLayout.setTranslationX((textView.getLeft() - this.f29819f.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f));
                return;
            }
            linearLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + textView.getRight());
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824);
        if (this.f29817c.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.f29818e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.d.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        TextView textView = this.f29816b;
        textView.clearAnimation();
        TextView textView2 = this.f29817c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z10) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r22.setAlpha(1.0f);
            org.telegram.ui.Components.h6 h6Var = this.h;
            if (h6Var != null) {
                h6Var.setAlpha(1.0f);
            }
            View view = this.f29820n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r22.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.h6 h6Var2 = this.h;
        if (h6Var2 != null) {
            h6Var2.setAlpha(0.6f);
        }
        View view2 = this.f29820n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i3) {
        this.d.setIcon(i3);
    }
}
