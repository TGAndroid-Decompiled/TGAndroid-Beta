package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
public class x8 extends FrameLayout {
    public final TextView f30966a;
    public final TextView f30967b;
    public final ImageView f30968c;
    public boolean d;
    public boolean f30969e;

    public x8(Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        int i12;
        TextView textView = new TextView(context);
        this.f30966a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        if (bd.f21784a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, mf.d(-2, -2.0f, i10 | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30967b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28290z6, null);
        textView2.setTextSize(1, 13.0f);
        if (bd.f21784a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        if (bd.f21784a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView2, mf.d(-2, -2.0f, i12 | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30968c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.f28043m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, mf.d(52, 52.0f, (bd.f21784a0 ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        this.f30966a.setText(str);
        this.f30967b.setText(str2);
        this.d = z10;
        this.f30968c.setVisibility(8);
        setWillNotDraw(!z10);
    }

    public final void b(int i3, String str, String str2, boolean z10) {
        int L;
        int i10;
        int L2;
        int i11;
        int i12;
        TextView textView = this.f30966a;
        textView.setText(str);
        TextView textView2 = this.f30967b;
        textView2.setText(str2);
        ImageView imageView = this.f30968c;
        imageView.setImageResource(i3);
        imageView.setVisibility(0);
        if (bd.f21784a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(50.0f);
        }
        if (bd.f21784a0) {
            i10 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i10 = 0;
        }
        textView.setPadding(L, 0, i10, 0);
        if (bd.f21784a0) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(50.0f);
        }
        if (bd.f21784a0) {
            i11 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i11 = 0;
        }
        if (this.f30969e) {
            i12 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i12 = 0;
        }
        textView2.setPadding(L2, 0, i11, i12);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public TextView getTextView() {
        return this.f30966a;
    }

    public TextView getValueTextView() {
        return this.f30967b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30966a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i3;
        if (this.d && org.telegram.ui.ActionBar.k6.f28002k0 != null) {
            boolean z10 = bd.f21784a0;
            float f11 = 20.0f;
            ImageView imageView = this.f30968c;
            if (z10) {
                L = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f10 = 71.0f;
                } else {
                    f10 = 20.0f;
                }
                L = org.telegram.messenger.g0.L(f10);
            }
            float f12 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                if (imageView.getVisibility() == 0) {
                    f11 = 71.0f;
                }
                i3 = org.telegram.messenger.g0.L(f11);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        if (!this.f30969e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setMultilineDetail(boolean z10) {
        this.f30969e = z10;
        TextView textView = this.f30967b;
        if (z10) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.f30967b.setText(charSequence);
    }
}
