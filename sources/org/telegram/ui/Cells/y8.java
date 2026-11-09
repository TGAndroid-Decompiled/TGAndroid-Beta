package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.id;
public class y8 extends FrameLayout {
    public final TextView f30939a;
    public final TextView f30940b;
    public final ImageView f30941c;
    public boolean d;
    public boolean f30942e;

    public y8(Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        TextView textView = new TextView(context);
        this.f30939a = textView;
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (id.f23157a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        if (id.f23157a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i10 | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f30940b = textView2;
        org.telegram.ui.ActionBar.s6.U(textView2, org.telegram.ui.ActionBar.l6.f28275z6, null);
        textView2.setTextSize(1, 13.0f);
        if (id.f23157a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView2.setGravity(i11);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        if (id.f23157a0) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i12 | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f30941c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.f28030m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, c8.ha.d(52, 52.0f, (id.f23157a0 ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z9) {
        this.f30939a.setText(str);
        this.f30940b.setText(str2);
        this.d = z9;
        this.f30941c.setVisibility(8);
        setWillNotDraw(!z9);
    }

    public final void b(int i7, String str, String str2, boolean z9) {
        int L;
        int i10;
        int L2;
        int i11;
        int i12;
        TextView textView = this.f30939a;
        textView.setText(str);
        TextView textView2 = this.f30940b;
        textView2.setText(str2);
        ImageView imageView = this.f30941c;
        imageView.setImageResource(i7);
        imageView.setVisibility(0);
        if (id.f23157a0) {
            L = 0;
        } else {
            L = org.telegram.messenger.g0.L(50.0f);
        }
        if (id.f23157a0) {
            i10 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i10 = 0;
        }
        textView.setPadding(L, 0, i10, 0);
        if (id.f23157a0) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.g0.L(50.0f);
        }
        if (id.f23157a0) {
            i11 = org.telegram.messenger.g0.L(50.0f);
        } else {
            i11 = 0;
        }
        if (this.f30942e) {
            i12 = org.telegram.messenger.g0.L(12.0f);
        } else {
            i12 = 0;
        }
        textView2.setPadding(L2, 0, i11, i12);
        this.d = z9;
        setWillNotDraw(!z9);
    }

    public TextView getTextView() {
        return this.f30939a;
    }

    public TextView getValueTextView() {
        return this.f30940b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30939a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        float L;
        int i7;
        if (this.d && org.telegram.ui.ActionBar.l6.f27988k0 != null) {
            boolean z9 = id.f23157a0;
            float f11 = 20.0f;
            ImageView imageView = this.f30941c;
            if (z9) {
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
            if (id.f23157a0) {
                if (imageView.getVisibility() == 0) {
                    f11 = 71.0f;
                }
                i7 = org.telegram.messenger.g0.L(f11);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f12, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.l6.f27988k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        if (!this.f30942e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setMultilineDetail(boolean z9) {
        this.f30942e = z9;
        TextView textView = this.f30940b;
        if (z9) {
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
        this.f30940b.setText(charSequence);
    }
}
