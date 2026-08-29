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
public final class d2 extends HorizontalScrollView implements org.telegram.ui.ActionBar.x5, i3 {
    public final d70 f37277a;
    public final FrameLayout f37278b;
    public final ImageView f37279c;
    public int d;

    public d2(Context context, d70 d70Var) {
        super(context);
        this.f37277a = d70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37278b = frameLayout;
        addView(frameLayout, i7.f6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f37279c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, i7.f6.c(-2.0f, -2));
        e();
    }

    @Override
    public final void e() {
        this.f37279c.setColorFilter(new PorterDuffColorFilter(this.f37277a.b(), PorterDuff.Mode.SRC_IN));
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
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = i12 - i10;
        int i15 = this.d;
        if (i15 > i14) {
            super.onLayout(z10, i10, i11, i12, i13);
            return;
        }
        FrameLayout frameLayout = this.f37278b;
        frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        th.q a2;
        ImageView imageView = this.f37279c;
        imageView.setImageBitmap(null);
        d70 d70Var = this.f37277a;
        d70Var.getClass();
        float f9 = 18;
        int dp = AndroidUtilities.dp(f9);
        d70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f9), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        d70Var.getClass();
        float f10 = 36;
        this.d = AndroidUtilities.dp(f10);
        if (pageblockmath != null && (a2 = th.q.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) != null) {
            imageView.setImageBitmap(a2.f48679a);
            int i10 = a2.f48680b;
            d70Var.getClass();
            int dp2 = AndroidUtilities.dp(f10) + i10;
            this.d = dp2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.f48681c));
        }
    }
}
