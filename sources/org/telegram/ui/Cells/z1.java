package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import java.util.HashSet;
public final class z1 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final TextView f31024a;
    public final ImageView f31025b;
    public final FrameLayout f31026c;
    public final org.telegram.ui.ActionBar.e6 d;
    public int f31027e;

    public z1(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        this.d = e6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31026c = frameLayout;
        frameLayout.setBackgroundResource(2131232444);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.k6.f28204uf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(frameLayout, background, i10, e6Var, mode);
        addView(frameLayout, mf.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f31025b = imageView;
        imageView.setImageResource(2131231243);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.k6.f28166sf), mode));
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f31024a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (org.telegram.ui.ActionBar.k6.i1(e6Var)) {
            i3 = org.telegram.ui.ActionBar.k6.Fa;
        } else {
            i3 = org.telegram.ui.ActionBar.k6.f28185tf;
        }
        org.telegram.ui.ActionBar.r6.V(textView, i3, e6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, mf.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.k6.i1(e6Var)) {
            int i11 = org.telegram.ui.ActionBar.k6.Ea;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.d0(0, a(i11)), org.telegram.ui.ActionBar.r6.N(i11), e6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i3) {
        Integer num;
        org.telegram.ui.ActionBar.e6 e6Var = this.d;
        if (e6Var != null) {
            num = Integer.valueOf(e6Var.h(i3));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.k6.x0(null, i3, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f31026c;
    }

    public ImageView getImageView() {
        return this.f31025b;
    }

    public TextView getTextView() {
        return this.f31024a;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f31024a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a10 = a(org.telegram.ui.ActionBar.k6.f28166sf);
            ImageView imageView = this.f31025b;
            if (imageView != null && a10 != this.f31027e) {
                this.f31027e = a10;
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
