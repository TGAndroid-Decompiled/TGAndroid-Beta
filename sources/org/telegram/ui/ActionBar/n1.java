package org.telegram.ui.ActionBar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.hd;
public final class n1 extends FrameLayout {
    public final TextView f29396a;
    public final ImageView f29397b;

    public n1(Context context, e6 e6Var) {
        super(context);
        int i7;
        int i10 = j6.I5;
        Drawable h02 = j6.h0(j6.w0(i10, e6Var), 2, -1);
        m6 M = q6.M(i10);
        setBackground(h02);
        q6.j(this, h02, null, M, e6Var);
        setPadding(org.telegram.messenger.g0.L(23.0f), 0, org.telegram.messenger.g0.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.f29397b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        q6.s(imageView, j6.J5, e6Var, PorterDuff.Mode.MULTIPLY);
        if (hd.f24104a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        addView(imageView, ja.e(-2, 40, i7 | 16));
        TextView textView = new TextView(context);
        this.f29396a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        q6.U(textView, j6.f28957j5, e6Var);
        textView.setTextSize(1, 16.0f);
        addView(textView, ja.e(-2, -2, (hd.f24104a0 ? 5 : 3) | 16));
    }

    public final void a(int i7, CharSequence charSequence) {
        int L;
        int i10;
        TextView textView = this.f29396a;
        textView.setText(charSequence);
        ImageView imageView = this.f29397b;
        if (i7 != 0) {
            imageView.setImageResource(i7);
            imageView.setVisibility(0);
            if (hd.f24104a0) {
                L = 0;
            } else {
                L = org.telegram.messenger.g0.L(56.0f);
            }
            if (hd.f24104a0) {
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
        this.f29396a.setGravity(i7);
    }

    public void setTextColor(int i7) {
        this.f29396a.setTextColor(i7);
    }
}
