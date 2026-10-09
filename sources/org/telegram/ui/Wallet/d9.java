package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class d9 extends FrameLayout {
    public final TextView f34838a;
    public final ImageView f34839b;
    public c6 f34840c;
    public float d;
    public float f34841e;
    public boolean f34842f;

    public d9(Context context) {
        super(context);
        setClipChildren(false);
        setClipToPadding(false);
        TextView textView = new TextView(context);
        this.f34838a = textView;
        textView.setSingleLine(true);
        textView.setIncludeFontPadding(false);
        textView.setGravity(21);
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f34839b = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImportantForAccessibility(2);
        addView(imageView, w7.x5.d(16.0f, 16));
    }

    public final void a() {
        float f7;
        float height = (((getHeight() * 0.5f) - AndroidUtilities.dp(19.0f)) * this.d) + AndroidUtilities.dp(19.0f);
        float width = getWidth() - (c() * 0.5f);
        TextView textView = this.f34838a;
        textView.setPivotX(textView.getWidth());
        textView.setPivotY(textView.getHeight() * 0.5f);
        textView.setScaleX((this.d * 0.42857146f) + 1.0f);
        textView.setScaleY((this.d * 0.42857146f) + 1.0f);
        textView.setTranslationX(((getWidth() - c()) - b()) - textView.getWidth());
        textView.setTranslationY(height - (textView.getHeight() * 0.5f));
        ImageView imageView = this.f34839b;
        imageView.setTranslationX(width - AndroidUtilities.dp(8.0f));
        imageView.setTranslationY(height - AndroidUtilities.dp(8.0f));
        imageView.setAlpha(1.0f - this.d);
        c6 c6Var = this.f34840c;
        if (c6Var != null) {
            c6Var.setTranslationX(width - AndroidUtilities.dp(20.0f));
            this.f34840c.setTranslationY(height - AndroidUtilities.dp(20.0f));
            this.f34840c.setPivotX(AndroidUtilities.dp(20.0f));
            this.f34840c.setPivotY(AndroidUtilities.dp(20.0f));
            this.f34840c.setScaleX(((this.d * 0.4f) + 0.6f) * ((this.f34841e * 0.12f) + 1.0f));
            this.f34840c.setScaleY(((this.d * 0.4f) + 0.6f) * (1.0f - (this.f34841e * 0.18f)));
            c6 c6Var2 = this.f34840c;
            if (this.f34842f) {
                f7 = 0.0f;
            } else {
                f7 = this.d;
            }
            c6Var2.setAlpha(f7);
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
        TextView textView = this.f34838a;
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        this.f34839b.layout(0, 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        c6 c6Var = this.f34840c;
        if (c6Var != null) {
            c6Var.layout(0, 0, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
        }
        a();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (Math.max(0, View.MeasureSpec.getSize(i10) - Math.round(b() + c())) / ((this.d * 0.42857146f) + 1.0f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824);
        TextView textView = this.f34838a;
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        this.f34839b.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
        c6 c6Var = this.f34840c;
        if (c6Var != null) {
            c6Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
        }
        setMeasuredDimension(View.resolveSize((int) Math.ceil(c() + b() + com.google.android.gms.internal.vision.e2.A(this.d, 0.42857146f, 1.0f, textView.getMeasuredWidth())), i10), View.resolveSize(AndroidUtilities.dp(40.0f), i11));
    }
}
