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
public final class a2 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView f30452a;
    public final ImageView f30453b;
    public final FrameLayout f30454c;
    public final org.telegram.ui.ActionBar.i6 d;
    public int f30455e;

    public a2(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        this.d = i6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f30454c = frameLayout;
        frameLayout.setBackgroundResource(2131232449);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.n6.f29832xf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.x(frameLayout, background, i10, i6Var, mode);
        addView(frameLayout, c8.na.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30453b = imageView;
        imageView.setImageResource(2131231246);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.n6.f29794vf), mode));
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, c8.na.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f30452a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        if (org.telegram.ui.ActionBar.n6.i1(i6Var)) {
            i7 = org.telegram.ui.ActionBar.n6.Fa;
        } else {
            i7 = org.telegram.ui.ActionBar.n6.f29813wf;
        }
        org.telegram.ui.ActionBar.u6.U(textView, i7, i6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.na.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.n6.i1(i6Var)) {
            int i11 = org.telegram.ui.ActionBar.n6.Ea;
            org.telegram.ui.ActionBar.u6.B(frameLayout, org.telegram.ui.ActionBar.n6.d0(0, a(i11)), org.telegram.ui.ActionBar.u6.M(i11), i6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i7) {
        Integer num;
        org.telegram.ui.ActionBar.i6 i6Var = this.d;
        if (i6Var != null) {
            num = Integer.valueOf(i6Var.i(i7));
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return org.telegram.ui.ActionBar.n6.x0(null, i7, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.f30454c;
    }

    public ImageView getImageView() {
        return this.f30453b;
    }

    public TextView getTextView() {
        return this.f30452a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
    }

    public void setText(String str) {
        this.f30452a.setText(str);
    }

    @Override
    public final void updateColors() {
        try {
            int a10 = a(org.telegram.ui.ActionBar.n6.f29794vf);
            ImageView imageView = this.f30453b;
            if (imageView != null && a10 != this.f30455e) {
                this.f30455e = a10;
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
