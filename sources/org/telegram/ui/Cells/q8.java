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
import org.telegram.messenger.id;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.xq;
public final class q8 extends FrameLayout {
    public int f30158a;
    public final TextView f30159b;
    public final TextView f30160c;
    public final Switch d;
    public boolean f30161e;
    public LinearLayout f30162f;
    public org.telegram.ui.Components.j6 h;
    public View f30163n;
    public tm f30164r;

    public q8(Context context) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f30159b = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z9 = id.f23157a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 48;
        if (z9) {
            f10 = 64.0f;
        } else {
            f10 = 21.0f;
        }
        if (z9) {
            f11 = 21.0f;
        } else {
            f11 = 64.0f;
        }
        addView(textView, c8.ha.d(-2, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30160c = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28262z6, null);
        textView2.setTextSize(1, 13.0f);
        if (id.f23157a0) {
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
        boolean z10 = id.f23157a0;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i14 = i12 | 48;
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
        addView(textView2, c8.ha.d(-2, -2.0f, i14, f12, 35.0f, f13, 0.0f));
        Switch r22 = new Switch(context, null);
        this.d = r22;
        r22.setDrawIconType(1);
        addView(r22, c8.ha.d(37, 40.0f, (id.f23157a0 ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z9) {
        float f10;
        int i7;
        if (this.f30162f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f30162f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
            this.h = j6Var;
            j6Var.setTextSize(org.telegram.messenger.g0.L(14.0f));
            this.h.getDrawable().J = true;
            org.telegram.ui.Components.j6 j6Var2 = this.h;
            int i10 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.Z(j6Var2, i10, null);
            this.h.setTypeface(org.telegram.messenger.g0.o());
            this.h.b(0.4f, 320L, xq.h);
            this.f30162f.addView(this.h, c8.ha.c(20.0f, -2));
            this.f30163n = new View(getContext());
            Drawable mutate = getContext().getResources().getDrawable(2131230871).mutate();
            org.telegram.ui.ActionBar.r6.y(this, mutate, i10, null, PorterDuff.Mode.MULTIPLY);
            this.f30163n.setBackground(mutate);
            this.f30162f.addView(this.f30163n, c8.ha.r(16, 16, 16));
            this.f30162f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f30162f, c8.ha.e(-2, -2, 16));
            tm tmVar = new tm(getContext(), 8);
            this.f30164r = tmVar;
            tmVar.setBackground(org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27944i6, false), 2, -1));
            tm tmVar2 = this.f30164r;
            if (id.f23157a0) {
                i7 = 3;
            } else {
                i7 = 5;
            }
            addView(tmVar2, c8.ha.e(76, -1, i7));
        }
        this.h.setText(str);
        this.f30163n.animate().cancel();
        ViewPropertyAnimator animate = this.f30163n.animate();
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 180.0f;
        }
        animate.rotation(f10).setDuration(340L).setInterpolator(xq.h).start();
        this.f30164r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z9, boolean z10) {
        float f10;
        float f11;
        super.setEnabled(z9);
        Switch r02 = this.d;
        TextView textView = this.f30160c;
        TextView textView2 = this.f30159b;
        float f12 = 0.5f;
        if (z10) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r02.clearAnimation();
            ViewPropertyAnimator animate = textView2.animate();
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
            ViewPropertyAnimator animate2 = textView.animate();
            if (z9) {
                f11 = 1.0f;
            } else {
                f11 = 0.5f;
            }
            animate2.alpha(f11).start();
            ViewPropertyAnimator animate3 = r02.animate();
            if (z9) {
                f12 = 1.0f;
            }
            animate3.alpha(f12).start();
        } else if (z9) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r02.setAlpha(1.0f);
        } else {
            r02.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z9, boolean z10) {
        d(str, z9, z10, false);
    }

    public final void d(String str, boolean z9, boolean z10, boolean z11) {
        TextView textView = this.f30159b;
        textView.setText(str);
        this.d.c(z9, z11);
        this.f30161e = z10;
        this.f30160c.setVisibility(8);
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
        float L;
        int i7;
        if (this.f30161e) {
            if (id.f23157a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(20.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23157a0) {
                i7 = org.telegram.messenger.g0.L(20.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27975k0);
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        LinearLayout linearLayout = this.f30162f;
        if (linearLayout != null) {
            boolean z10 = id.f23157a0;
            TextView textView = this.f30159b;
            if (z10) {
                linearLayout.setTranslationX((textView.getLeft() - this.f30162f.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f));
                return;
            }
            linearLayout.setTranslationX(org.telegram.messenger.g0.L(8.0f) + textView.getRight());
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        float f10;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        if (this.f30160c.getVisibility() == 0) {
            f10 = 64.0f;
        } else {
            f10 = 50.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(f10) + (this.f30161e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z9) {
        this.d.c(z9, true);
    }

    @Override
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        TextView textView = this.f30159b;
        textView.clearAnimation();
        TextView textView2 = this.f30160c;
        textView2.clearAnimation();
        Switch r22 = this.d;
        r22.clearAnimation();
        if (z9) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r22.setAlpha(1.0f);
            org.telegram.ui.Components.j6 j6Var = this.h;
            if (j6Var != null) {
                j6Var.setAlpha(1.0f);
            }
            View view = this.f30163n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r22.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            j6Var2.setAlpha(0.6f);
        }
        View view2 = this.f30163n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i7) {
        this.d.setIcon(i7);
    }
}
