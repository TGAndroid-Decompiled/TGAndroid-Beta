package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class z1 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView f30945a;
    public final ImageView f30946b;
    public final FrameLayout f30947c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int f30948e;

    public z1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        int i7;
        this.d = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30947c = frameLayout;
        frameLayout.setBackgroundResource(2131232444);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.k6.f28173uf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(frameLayout, background, i10, f6Var, mode);
        addView(frameLayout, c8.ha.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30946b = imageView;
        imageView.setImageResource(2131231243);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.k6.f28134sf), mode));
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30945a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (org.telegram.ui.ActionBar.k6.i1(f6Var)) {
            i7 = org.telegram.ui.ActionBar.k6.Fa;
        } else {
            i7 = org.telegram.ui.ActionBar.k6.f28153tf;
        }
        org.telegram.ui.ActionBar.r6.V(textView, i7, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.k6.i1(f6Var)) {
            int i11 = org.telegram.ui.ActionBar.k6.Ea;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.d0(0, a(i11)), org.telegram.ui.ActionBar.r6.N(i11), f6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i7) {
        Integer num;
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        if (f6Var != null) {
            num = Integer.valueOf(f6Var.h(i7));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i7, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f30947c;
    }

    public ImageView getImageView() {
        return this.f30946b;
    }

    public TextView getTextView() {
        return this.f30945a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f30945a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a10 = a(org.telegram.ui.ActionBar.k6.f28134sf);
            ImageView imageView = this.f30946b;
            if (imageView != null && a10 != this.f30948e) {
                this.f30948e = a10;
                imageView.setColorFilter(new PorterDuffColorFilter(a10, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
