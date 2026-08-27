package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zm;

public final class o8 extends FrameLayout {

    public int f24818a;

    public final TextView f24819b;

    public final TextView f24820c;
    public final Switch d;

    public boolean f24821e;

    public LinearLayout f24822f;
    public org.telegram.ui.Components.j6 h;

    public View f24823n;

    public zm f24824r;

    public o8(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.f24819b = textView;
        rl.l(org.telegram.ui.ActionBar.g6.G6, null, textView, 1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 64.0f : 21.0f, 0.0f, z10 ? 21.0f : 64.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f24820c = textView2;
        rl.l(org.telegram.ui.ActionBar.g6.f23441z6, null, textView2, 1, 13.0f);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        addView(textView2, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 64.0f : 21.0f, 35.0f, z11 ? 21.0f : 64.0f, 0.0f));
        Switch r10 = new Switch(context, null);
        this.d = r10;
        r10.setDrawIconType(1);
        addView(r10, h7.z5.d(37, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
    }

    public final void a(Runnable runnable, String str, boolean z10) {
        if (this.f24822f == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.f24822f = linearLayout;
            linearLayout.setOrientation(0);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getContext(), false, true, true);
            this.h = j6Var;
            j6Var.setTextSize(AndroidUtilities.dp(14.0f));
            this.h.getDrawable().D = true;
            org.telegram.ui.Components.j6 j6Var2 = this.h;
            int i10 = org.telegram.ui.ActionBar.g6.G6;
            j6Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            this.h.setTypeface(AndroidUtilities.bold());
            this.h.b(0.4f, 320L, er.h);
            this.f24822f.addView(this.h, h7.z5.c(20.0f, -2));
            this.f24823n = new View(getContext());
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
            this.f24823n.setBackground(drawableMutate);
            this.f24822f.addView(this.f24823n, h7.z5.q(16, 16, 16));
            this.f24822f.setClipChildren(false);
            setClipChildren(false);
            addView(this.f24822f, h7.z5.e(-2, -2, 16));
            zm zmVar = new zm(getContext(), 8);
            this.f24824r = zmVar;
            zmVar.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23144i6, false), 2, -1));
            addView(this.f24824r, h7.z5.e(76, -1, LocaleController.isRTL ? 3 : 5));
        }
        this.h.setText(str);
        this.f24823n.animate().cancel();
        this.f24823n.animate().rotation(z10 ? 0.0f : 180.0f).setDuration(340L).setInterpolator(er.h).start();
        this.f24824r.setOnClickListener(new a(runnable, 11));
    }

    public final void b(boolean z10, boolean z11) {
        super.setEnabled(z10);
        Switch r10 = this.d;
        TextView textView = this.f24820c;
        TextView textView2 = this.f24819b;
        if (z11) {
            textView2.clearAnimation();
            textView.clearAnimation();
            r10.clearAnimation();
            textView2.animate().alpha(z10 ? 1.0f : 0.5f).start();
            textView.animate().alpha(z10 ? 1.0f : 0.5f).start();
            r10.animate().alpha(z10 ? 1.0f : 0.5f).start();
            return;
        }
        if (z10) {
            textView2.setAlpha(1.0f);
            textView.setAlpha(1.0f);
            r10.setAlpha(1.0f);
        } else {
            r10.setAlpha(0.5f);
            textView2.setAlpha(0.5f);
            textView.setAlpha(0.5f);
        }
    }

    public final void c(String str, boolean z10, boolean z11) {
        d(str, z10, z11, false);
    }

    public final void d(String str, boolean z10, boolean z11, boolean z12) {
        TextView textView = this.f24819b;
        textView.setText(str);
        this.d.c(z10, z12);
        this.f24821e = z11;
        this.f24820c.setVisibility(8);
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
        if (this.f24821e) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
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
        LinearLayout linearLayout = this.f24822f;
        if (linearLayout != null) {
            boolean z11 = LocaleController.isRTL;
            TextView textView = this.f24819b;
            if (z11) {
                linearLayout.setTranslationX((textView.getLeft() - this.f24822f.getMeasuredWidth()) - AndroidUtilities.dp(8.0f));
            } else {
                linearLayout.setTranslationX(AndroidUtilities.dp(8.0f) + textView.getRight());
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.f24820c.getVisibility() == 0 ? 64.0f : 50.0f) + (this.f24821e ? 1 : 0), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.d.c(z10, true);
    }

    @Override
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        TextView textView = this.f24819b;
        textView.clearAnimation();
        TextView textView2 = this.f24820c;
        textView2.clearAnimation();
        Switch r10 = this.d;
        r10.clearAnimation();
        if (z10) {
            textView.setAlpha(1.0f);
            textView2.setAlpha(1.0f);
            r10.setAlpha(1.0f);
            org.telegram.ui.Components.j6 j6Var = this.h;
            if (j6Var != null) {
                j6Var.setAlpha(1.0f);
            }
            View view = this.f24823n;
            if (view != null) {
                view.setAlpha(1.0f);
                return;
            }
            return;
        }
        r10.setAlpha(0.5f);
        textView.setAlpha(0.5f);
        textView2.setAlpha(0.5f);
        org.telegram.ui.Components.j6 j6Var2 = this.h;
        if (j6Var2 != null) {
            j6Var2.setAlpha(0.6f);
        }
        View view2 = this.f24823n;
        if (view2 != null) {
            view2.setAlpha(0.6f);
        }
    }

    public void setIcon(int i10) {
        this.d.setIcon(i10);
    }
}
