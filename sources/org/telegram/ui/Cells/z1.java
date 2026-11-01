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
public final class z1 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView f23634a;
    public final ImageView f23635b;
    public final FrameLayout f23636c;
    public final org.telegram.ui.ActionBar.p6 d;
    public int e;

    public z1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        this.d = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f23636c = frameLayout;
        frameLayout.setBackgroundResource(2131232443);
        Drawable background = frameLayout.getBackground();
        int i11 = org.telegram.ui.ActionBar.t6.f21251uf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(frameLayout, background, i11, p6Var, mode);
        addView(frameLayout, w7.b6.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f23635b = imageView;
        imageView.setImageResource(2131231244);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.t6.f21214sf), mode));
        imageView.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f23634a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
            i10 = org.telegram.ui.ActionBar.t6.Fa;
        } else {
            i10 = org.telegram.ui.ActionBar.t6.f21233tf;
        }
        org.telegram.ui.ActionBar.a7.V(textView, i10, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        addView(textView, w7.b6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
            int i12 = org.telegram.ui.ActionBar.t6.Ea;
            org.telegram.ui.ActionBar.a7.C(frameLayout, org.telegram.ui.ActionBar.t6.d0(0, a(i12)), org.telegram.ui.ActionBar.a7.N(i12), p6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i10) {
        Integer num;
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        if (p6Var != null) {
            num = Integer.valueOf(p6Var.h(i10));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f23636c;
    }

    public ImageView getImageView() {
        return this.f23635b;
    }

    public TextView getTextView() {
        return this.f23634a;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f23634a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a2 = a(org.telegram.ui.ActionBar.t6.f21214sf);
            ImageView imageView = this.f23635b;
            if (imageView != null && a2 != this.e) {
                this.e = a2;
                imageView.setColorFilter(new PorterDuffColorFilter(a2, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
