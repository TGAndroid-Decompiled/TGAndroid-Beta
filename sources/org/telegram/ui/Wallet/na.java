package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class na extends FrameLayout {
    public final TextView f34959a;
    public final ImageView f34960b;
    public a7 f34961c;
    public float d;
    public float e;
    public boolean f34962f;

    public na(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f34959a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f34960b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, w7.b6.c(16.0f, 16));
    }

    public final void a() {
        float f7;
        float height = (((getHeight() * 0.5f) - org.telegram.messenger.i0.L(19.0f)) * this.d) + org.telegram.messenger.i0.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.f34959a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.f34960b;
        imageView.setTranslationX(width - org.telegram.messenger.i0.L(8.0f));
        imageView.setTranslationY(height - org.telegram.messenger.i0.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        a7 a7Var = this.f34961c;
        if (a7Var != null) {
            a7Var.setTranslationX(width - org.telegram.messenger.i0.L(20.0f));
            this.f34961c.setTranslationY(height - org.telegram.messenger.i0.L(20.0f));
            this.f34961c.setPivotX(org.telegram.messenger.i0.L(20.0f));
            this.f34961c.setPivotY(org.telegram.messenger.i0.L(20.0f));
            this.f34961c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.f34961c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            a7 a7Var2 = this.f34961c;
            if (this.f34962f) {
                f7 = 0.0f;
            } else {
                f7 = this.d;
            }
            a7Var2.setAlpha(f7);
        }
    }

    public final float b() {
        return ((org.telegram.messenger.i0.L(7.0f) - org.telegram.messenger.i0.L(2.0f)) * this.d) + org.telegram.messenger.i0.L(2.0f);
    }

    public final float c() {
        return ((org.telegram.messenger.i0.L(23.0f) - org.telegram.messenger.i0.L(16.0f)) * this.d) + org.telegram.messenger.i0.L(16.0f);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView = this.f34959a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.f34960b.layout(0, 0, org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
        a7 a7Var = this.f34961c;
        if (a7Var != null) {
            a7Var.layout(0, 0, org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i10) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824);
        TextView textView = this.f34959a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f34960b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(16.0f), 1073741824));
        a7 a7Var = this.f34961c;
        if (a7Var != null) {
            a7Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + c3.i0.C(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i10), View.resolveSize(org.telegram.messenger.i0.L(40.0f), i11));
    }
}
