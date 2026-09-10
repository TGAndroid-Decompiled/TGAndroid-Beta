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
public final class b2 extends HorizontalScrollView implements org.telegram.ui.ActionBar.a6, f3 {
    public final t70 f31130a;
    public final FrameLayout f31131b;
    public final ImageView f31132c;
    public int d;

    public b2(Context context, t70 t70Var) {
        super(context);
        this.f31130a = t70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f31131b = frameLayout;
        addView(frameLayout, w7.a6.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f31132c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.a6.c(-2.0f, -2));
        e();
    }

    @Override
    public final void e() {
        this.f31132c.setColorFilter(new PorterDuffColorFilter(this.f31130a.b(), PorterDuff.Mode.SRC_IN));
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
        FrameLayout frameLayout = this.f31131b;
        frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        hi.t a2;
        ImageView imageView = this.f31132c;
        imageView.setImageBitmap(null);
        t70 t70Var = this.f31130a;
        t70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        t70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f7), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        t70Var.getClass();
        float f10 = 36;
        this.d = AndroidUtilities.dp(f10);
        if (pageblockmath != null && (a2 = hi.t.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) != null) {
            imageView.setImageBitmap(a2.f9850a);
            int i10 = a2.f9851b;
            t70Var.getClass();
            int dp2 = AndroidUtilities.dp(f10) + i10;
            this.d = dp2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.f9852c));
        }
    }
}
