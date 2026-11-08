package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class ia extends FrameLayout {
    public final TextView f42650a;
    public final ImageView f42651b;
    public v6 f42652c;
    public float d;
    public float f42653e;
    public boolean f42654f;

    public ia(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f42650a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f42651b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, c8.ha.c(16.0f, 16));
    }

    public final void a() {
        float f10;
        float height = (((getHeight() * 0.5f) - org.telegram.messenger.g0.L(19.0f)) * this.d) + org.telegram.messenger.g0.L(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.f42650a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.f42651b;
        imageView.setTranslationX(width - org.telegram.messenger.g0.L(8.0f));
        imageView.setTranslationY(height - org.telegram.messenger.g0.L(8.0f));
        imageView.setAlpha(1.0f - this.d);
        v6 v6Var = this.f42652c;
        if (v6Var != null) {
            v6Var.setTranslationX(width - org.telegram.messenger.g0.L(20.0f));
            this.f42652c.setTranslationY(height - org.telegram.messenger.g0.L(20.0f));
            this.f42652c.setPivotX(org.telegram.messenger.g0.L(20.0f));
            this.f42652c.setPivotY(org.telegram.messenger.g0.L(20.0f));
            this.f42652c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.f42653e * 0.12f) + 1.0f));
            this.f42652c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.f42653e * 0.18f)));
            v6 v6Var2 = this.f42652c;
            if (this.f42654f) {
                f10 = 0.0f;
            } else {
                f10 = this.d;
            }
            v6Var2.setAlpha(f10);
        }
    }

    public final float b() {
        return ((org.telegram.messenger.g0.L(7.0f) - org.telegram.messenger.g0.L(2.0f)) * this.d) + org.telegram.messenger.g0.L(2.0f);
    }

    public final float c() {
        return ((org.telegram.messenger.g0.L(23.0f) - org.telegram.messenger.g0.L(16.0f)) * this.d) + org.telegram.messenger.g0.L(16.0f);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        TextView textView = this.f42650a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.f42651b.layout(0, 0, org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        v6 v6Var = this.f42652c;
        if (v6Var != null) {
            v6Var.layout(0, 0, org.telegram.messenger.g0.L(40.0f), org.telegram.messenger.g0.L(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i7) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824);
        TextView textView = this.f42650a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f42651b.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(16.0f), 1073741824));
        v6 v6Var = this.f42652c;
        if (v6Var != null) {
            v6Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.recaptcha.internal.a.B(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i7), View.resolveSize(org.telegram.messenger.g0.L(40.0f), i10));
    }
}
