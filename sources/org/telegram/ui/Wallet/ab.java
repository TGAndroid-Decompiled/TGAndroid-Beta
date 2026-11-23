package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ab extends FrameLayout {
    public final TextView f44070a;
    public final ImageView f44071b;
    public n7 f44072c;
    public float d;
    public float f44073e;
    public boolean f44074f;

    public ab(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f44070a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f44071b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, c8.na.c(16.0f, 16));
    }

    public final void a() {
        float f10;
        float height = (((getHeight() * 0.5f) - org.telegram.messenger.g0.L(19.0f)) * this.d) + org.telegram.messenger.g0.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.f44070a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.f44071b;
        imageView.setTranslationX(width - org.telegram.messenger.g0.L(8.0f));
        imageView.setTranslationY(height - org.telegram.messenger.g0.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        n7 n7Var = this.f44072c;
        if (n7Var != null) {
            n7Var.setTranslationX(width - org.telegram.messenger.g0.L(20.0f));
            this.f44072c.setTranslationY(height - org.telegram.messenger.g0.L(20.0f));
            this.f44072c.setPivotX(org.telegram.messenger.g0.L(20.0f));
            this.f44072c.setPivotY(org.telegram.messenger.g0.L(20.0f));
            this.f44072c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.f44073e * 0.12f) + 1.0f));
            this.f44072c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.f44073e * 0.18f)));
            n7 n7Var2 = this.f44072c;
            if (this.f44074f) {
                f10 = 0.0f;
            } else {
                f10 = this.d;
            }
            n7Var2.setAlpha(f10);
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
        TextView textView = this.f44070a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.f44071b.layout(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        n7 n7Var = this.f44072c;
        if (n7Var != null) {
            n7Var.layout(0, 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i7) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824);
        TextView textView = this.f44070a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f44071b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
        n7 n7Var = this.f44072c;
        if (n7Var != null) {
            n7Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.gms.internal.vision.e2.B(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i7), View.resolveSize(org.telegram.messenger.g0.L(40.0f), i10));
    }
}
