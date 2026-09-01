package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
public final class b2 extends HorizontalScrollView implements org.telegram.ui.ActionBar.b6, g3 {
    public final o70 f35302a;
    public final FrameLayout f35303b;
    public final ImageView f35304c;
    public int d;

    public b2(Context context, o70 o70Var) {
        super(context);
        this.f35302a = o70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f35303b = frameLayout;
        addView(frameLayout, k7.c6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f35304c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, k7.c6.c(-2.0f, -2));
        e();
    }

    @Override
    public final void e() {
        this.f35304c.setColorFilter(new PorterDuffColorFilter(this.f35302a.b(), PorterDuff.Mode.SRC_IN));
    }

    @Override
    public int getBoundLeft() {
        if (this.d > getMeasuredWidth()) {
            return 0;
        }
        return (getMeasuredWidth() - this.d) / 2;
    }

    @Override
    public int getBoundRight() {
        if (this.d > getMeasuredWidth()) {
            return getMeasuredWidth();
        }
        return (getMeasuredWidth() + this.d) / 2;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public int getLastLineBoundRight() {
        return getBoundRight();
    }

    public int getMinWidth() {
        return this.d;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = this.d;
        if (i15 > i14) {
            super.onLayout(z4, i10, i11, i12, i13);
            return;
        }
        FrameLayout frameLayout = this.f35303b;
        frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        wh.r a2;
        ImageView imageView = this.f35304c;
        imageView.setImageBitmap(null);
        o70 o70Var = this.f35302a;
        o70Var.getClass();
        float f10 = 18;
        int dp = AndroidUtilities.dp(f10);
        o70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        o70Var.getClass();
        float f11 = 36;
        this.d = AndroidUtilities.dp(f11);
        if (pageblockmath != null && (a2 = wh.r.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) != null) {
            imageView.setImageBitmap(a2.f49958a);
            int i10 = a2.f49959b;
            o70Var.getClass();
            int dp2 = AndroidUtilities.dp(f11) + i10;
            this.d = dp2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.f49960c));
        }
    }
}
