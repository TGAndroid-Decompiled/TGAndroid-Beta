package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class za extends FrameLayout {
    public final TextView f45378a;
    public final ImageView f45379b;
    public m7 f45380c;
    public float d;
    public float f45381e;
    public boolean f45382f;

    public za(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f45378a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f45379b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, c8.na.c(16.0f, 16));
    }

    public final void a() {
        float f10;
        float height = (((getHeight() * 0.5f) - org.telegram.messenger.g0.L(19.0f)) * this.d) + org.telegram.messenger.g0.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.f45378a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.f45379b;
        imageView.setTranslationX(width - org.telegram.messenger.g0.L(8.0f));
        imageView.setTranslationY(height - org.telegram.messenger.g0.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        m7 m7Var = this.f45380c;
        if (m7Var != null) {
            m7Var.setTranslationX(width - org.telegram.messenger.g0.L(20.0f));
            this.f45380c.setTranslationY(height - org.telegram.messenger.g0.L(20.0f));
            this.f45380c.setPivotX(org.telegram.messenger.g0.L(20.0f));
            this.f45380c.setPivotY(org.telegram.messenger.g0.L(20.0f));
            this.f45380c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.f45381e * 0.12f) + 1.0f));
            this.f45380c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.f45381e * 0.18f)));
            m7 m7Var2 = this.f45380c;
            if (this.f45382f) {
                f10 = 0.0f;
            } else {
                f10 = this.d;
            }
            m7Var2.setAlpha(f10);
        }
    }

    public final float b() {
        return ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.0f)) * this.d) + org.telegram.messenger.g0.L(2.0f);
    }

    public final float c() {
        return ((org.telegram.messenger.g0.L(23.0f) - org.telegram.messenger.g0.L(16.0f)) * this.d) + org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        TextView textView = this.f45378a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.f45379b.layout(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        m7 m7Var = this.f45380c;
        if (m7Var != null) {
            m7Var.layout(0, 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i7) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824);
        TextView textView = this.f45378a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f45379b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
        m7 m7Var = this.f45380c;
        if (m7Var != null) {
            m7Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.gms.internal.vision.e2.B(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i7), View.resolveSize(org.telegram.messenger.g0.L(40.0f), i10));
    }
}
