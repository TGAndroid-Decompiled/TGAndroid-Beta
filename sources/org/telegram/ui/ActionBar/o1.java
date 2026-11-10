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
    public final TextView f28338a;
    public final ImageView f28339b;

    public o1(Context context, h6 h6Var) {
        super(context);
        int i7;
        int i10 = m6.I5;
        Drawable h02 = m6.h0(m6.w0(i10, h6Var), 2, -1);
        p6 M = t6.M(i10);
        setBackground(h02);
        t6.j(this, h02, null, M, h6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f28339b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        t6.s(imageView, m6.J5, h6Var, PorterDuff.Mode.MULTIPLY);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ha.e(-2, 40, i7 | 16));
        TextView textView = new TextView(context);
        this.f28338a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        t6.U(textView, m6.f27998j5, h6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ha.e(-2, -2, (id.f23161a0 ? 5 : 3) | 16));
    }

    public final void a(int i7, CharSequence charSequence) {
        int L;
        int i10;
        TextView textView = this.f28338a;
        textView.setText(charSequence);
        ImageView imageView = this.f28339b;
        if (i7 != 0) {
            imageView.setImageResource(i7);
            imageView.setVisibility(0);
            if (id.f23161a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(56.0f);
            }
            if (id.f23161a0) {
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
        this.f28338a.setGravity(i7);
    }

    public void setTextColor(int i7) {
        this.f28338a.setTextColor(i7);
    }
}
