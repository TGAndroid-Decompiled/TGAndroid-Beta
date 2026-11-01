package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.dd;
public final class r1 extends FrameLayout {
    public final TextView f20722a;
    public final ImageView f20723b;

    public r1(Context context, p6 p6Var) {
        super(context);
        int i10;
        int i11 = t6.I5;
        Drawable h02 = t6.h0(t6.w0(i11, p6Var), 2, -1);
        w6 N = a7.N(i11);
        setBackground(h02);
        a7.k(this, h02, null, N, p6Var);
        setPadding(org.telegram.messenger.i0.L(23.0f), 0, org.telegram.messenger.i0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f20723b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        a7.t(imageView, t6.J5, p6Var, PorterDuff.Mode.MULTIPLY);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.b6.e(-2, 40, i10 | 16));
        TextView textView = new TextView(context);
        this.f20722a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        a7.V(textView, t6.f21038j5, p6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, w7.b6.e(-2, -2, (dd.X ? 5 : 3) | 16));
    }

    public final void a(int i10, CharSequence charSequence) {
        int L;
        int i11;
        TextView textView = this.f20722a;
        textView.setText(charSequence);
        ImageView imageView = this.f20723b;
        if (i10 != 0) {
            imageView.setImageResource(i10);
            imageView.setVisibility(0);
            if (dd.X) {
                L = 0;
            } else {
                L = org.telegram.messenger.i0.L(56.0f);
            }
            if (dd.X) {
                i11 = org.telegram.messenger.i0.L(56.0f);
            } else {
                i11 = 0;
            }
            textView.setPadding(L, 0, i11, 0);
            return;
        }
        imageView.setVisibility(4);
        textView.setPadding(0, 0, 0, 0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(48.0f), 1073741824));
    }

    public void setGravity(int i10) {
        this.f20722a.setGravity(i10);
    }

    public void setTextColor(int i10) {
        this.f20722a.setTextColor(i10);
    }
}
