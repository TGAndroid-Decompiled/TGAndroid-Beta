package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.id;
public final class o1 extends FrameLayout {
    public final TextView f28332a;
    public final ImageView f28333b;

    public o1(Context context, g6 g6Var) {
        super(context);
        int i7;
        int i10 = l6.I5;
        Drawable h02 = l6.h0(l6.w0(i10, g6Var), 2, -1);
        o6 M = s6.M(i10);
        setBackground(h02);
        s6.j(this, h02, null, M, g6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f28333b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        s6.s(imageView, l6.J5, g6Var, PorterDuff.Mode.MULTIPLY);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ha.e(-2, 40, i7 | 16));
        TextView textView = new TextView(context);
        this.f28332a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        s6.U(textView, l6.f27973j5, g6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ha.e(-2, -2, (id.f23157a0 ? 5 : 3) | 16));
    }

    public final void a(int i7, CharSequence charSequence) {
        int L;
        int i10;
        TextView textView = this.f28332a;
        textView.setText(charSequence);
        ImageView imageView = this.f28333b;
        if (i7 != 0) {
            imageView.setImageResource(i7);
            imageView.setVisibility(0);
            if (id.f23157a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(56.0f);
            }
            if (id.f23157a0) {
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
    }

    public void setGravity(int i7) {
        this.f28332a.setGravity(i7);
    }

    public void setTextColor(int i7) {
        this.f28332a.setTextColor(i7);
    }
}
