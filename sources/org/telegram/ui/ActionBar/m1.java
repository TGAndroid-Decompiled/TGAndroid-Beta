package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public final class m1 extends FrameLayout {
    public final TextView f28330a;
    public final ImageView f28331b;

    public m1(Context context, e6 e6Var) {
        super(context);
        int i3;
        int i10 = k6.I5;
        Drawable h02 = k6.h0(k6.w0(i10, e6Var), 2, -1);
        n6 N = r6.N(i10);
        setBackground(h02);
        r6.k(this, h02, null, N, e6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f28331b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        r6.t(imageView, k6.J5, e6Var, PorterDuff.Mode.MULTIPLY);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        addView(imageView, mf.e(-2, 40, i3 | 16));
        TextView textView = new TextView(context);
        this.f28330a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        r6.V(textView, k6.f27988j5, e6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, mf.e(-2, -2, (bd.f21784a0 ? 5 : 3) | 16));
    }

    public final void a(int i3, CharSequence charSequence) {
        int L;
        int i10;
        TextView textView = this.f28330a;
        textView.setText(charSequence);
        ImageView imageView = this.f28331b;
        if (i3 != 0) {
            imageView.setImageResource(i3);
            imageView.setVisibility(0);
            if (bd.f21784a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(56.0f);
            }
            if (bd.f21784a0) {
                i10 = org.telegram.messenger.g0.L(56.0f);
            } else {
                i10 = 0;
            }
            textView.setPadding(L, 0, i10, 0);
            return;
        }
        imageView.setVisibility(4);
        textView.setPadding(0, 0, 0, 0);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void setGravity(int i3) {
        this.f28330a.setGravity(i3);
    }

    public void setTextColor(int i3) {
        this.f28330a.setTextColor(i3);
    }
}
