package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ha extends FrameLayout {
    public final TextView f34312a;
    public final ImageView f34313b;
    public s6 f34314c;
    public float d;
    public float e;
    public boolean f34315f;

    public ha(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f34312a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f34313b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, w7.z5.d(16.0f, 16));
    }

    public final void a() {
        float f7;
        float height = (((getHeight() * 0.5f) - AndroidUtilities.dp(19.0f)) * this.d) + AndroidUtilities.dp(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.f34312a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.f34313b;
        imageView.setTranslationX(width - AndroidUtilities.dp(8.0f));
        imageView.setTranslationY(height - AndroidUtilities.dp(8.0f));
        imageView.setAlpha(1.0f - this.d);
        s6 s6Var = this.f34314c;
        if (s6Var != null) {
            s6Var.setTranslationX(width - AndroidUtilities.dp(20.0f));
            this.f34314c.setTranslationY(height - AndroidUtilities.dp(20.0f));
            this.f34314c.setPivotX(AndroidUtilities.dp(20.0f));
            this.f34314c.setPivotY(AndroidUtilities.dp(20.0f));
            this.f34314c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.e * 0.12f) + 1.0f));
            this.f34314c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.e * 0.18f)));
            s6 s6Var2 = this.f34314c;
            if (this.f34315f) {
                f7 = 0.0f;
            } else {
                f7 = this.d;
            }
            s6Var2.setAlpha(f7);
        }
    }

    public final float b() {
        return ((AndroidUtilities.dp(7.0f) - AndroidUtilities.dp(2.0f)) * this.d) + AndroidUtilities.dp(2.0f);
    }

    public final float c() {
        return ((AndroidUtilities.dp(23.0f) - AndroidUtilities.dp(16.0f)) * this.d) + AndroidUtilities.dp(16.0f);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        TextView textView = this.f34312a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.f34313b.layout(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        s6 s6Var = this.f34314c;
        if (s6Var != null) {
            s6Var.layout(0, 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i10) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824);
        TextView textView = this.f34312a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f34313b.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        s6 s6Var = this.f34314c;
        if (s6Var != null) {
            s6Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.gms.internal.play_billing.k3.A(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i10), View.resolveSize(AndroidUtilities.dp(40.0f), i11));
    }
}
