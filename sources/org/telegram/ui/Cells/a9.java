package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
public class a9 extends FrameLayout {
    public final TextView f21691a;
    public final TextView f21692b;
    public final ImageView f21693c;
    public boolean d;
    public boolean e;

    public a9(Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        TextView textView = new TextView(context);
        this.f21691a = textView;
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, null);
        a30.o(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (dd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        if (dd.X) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(textView, w7.b6.d(-2, -2.0f, i11 | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f21692b = textView2;
        org.telegram.ui.ActionBar.a7.V(textView2, org.telegram.ui.ActionBar.t6.f21331z6, null);
        textView2.setTextSize(1, 13.0f);
        if (dd.X) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        if (dd.X) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        addView(textView2, w7.b6.d(-2, -2.0f, i13 | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f21693c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.a7.t(imageView, org.telegram.ui.ActionBar.t6.f21096m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, w7.b6.d(52, 52.0f, (dd.X ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z10) {
        this.f21691a.setText(str);
        this.f21692b.setText(str2);
        this.d = z10;
        this.f21693c.setVisibility(8);
        setWillNotDraw(!z10);
    }

    public final void b(int i10, String str, String str2, boolean z10) {
        int L;
        int i11;
        int L2;
        int i12;
        int i13;
        TextView textView = this.f21691a;
        textView.setText(str);
        TextView textView2 = this.f21692b;
        textView2.setText(str2);
        ImageView imageView = this.f21693c;
        imageView.setImageResource(i10);
        imageView.setVisibility(0);
        if (dd.X) {
            L = 0;
        } else {
            L = org.telegram.messenger.i0.L(50.0f);
        }
        if (dd.X) {
            i11 = org.telegram.messenger.i0.L(50.0f);
        } else {
            i11 = 0;
        }
        textView.setPadding(L, 0, i11, 0);
        if (dd.X) {
            L2 = 0;
        } else {
            L2 = org.telegram.messenger.i0.L(50.0f);
        }
        if (dd.X) {
            i12 = org.telegram.messenger.i0.L(50.0f);
        } else {
            i12 = 0;
        }
        if (this.e) {
            i13 = org.telegram.messenger.i0.L(12.0f);
        } else {
            i13 = 0;
        }
        textView2.setPadding(L2, 0, i12, i13);
        this.d = z10;
        setWillNotDraw(!z10);
    }

    public TextView getTextView() {
        return this.f21691a;
    }

    public TextView getValueTextView() {
        return this.f21692b;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f21691a.invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        float L;
        int i10;
        if (this.d && org.telegram.ui.ActionBar.t6.f21053k0 != null) {
            boolean z10 = dd.X;
            float f10 = 20.0f;
            ImageView imageView = this.f21693c;
            if (z10) {
                L = 0.0f;
            } else {
                if (imageView.getVisibility() == 0) {
                    f7 = 71.0f;
                } else {
                    f7 = 20.0f;
                }
                L = org.telegram.messenger.i0.L(f7);
            }
            float f11 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (dd.X) {
                if (imageView.getVisibility() == 0) {
                    f10 = 71.0f;
                }
                i10 = org.telegram.messenger.i0.L(f10);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f11, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (!this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(64.0f) + (this.d ? 1 : 0), 1073741824));
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    public void setMultilineDetail(boolean z10) {
        this.e = z10;
        TextView textView = this.f21692b;
        if (z10) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.f21692b.setText(charSequence);
    }
}
