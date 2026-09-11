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
public final class a2 extends HorizontalScrollView implements org.telegram.ui.ActionBar.z5, e3 {
    public final v70 f34292a;
    public final FrameLayout f34293b;
    public final ImageView f34294c;
    public int d;

    public a2(Context context, v70 v70Var) {
        super(context);
        this.f34292a = v70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f34293b = frameLayout;
        addView(frameLayout, w7.x5.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f34294c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, w7.x5.c(-2.0f, -2));
        d();
    }

    @Override
    public final void d() {
        this.f34294c.setColorFilter(new PorterDuffColorFilter(this.f34292a.b(), PorterDuff.Mode.SRC_IN));
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
        FrameLayout frameLayout = this.f34293b;
        frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        ji.s a2;
        ImageView imageView = this.f34294c;
        imageView.setImageBitmap(null);
        v70 v70Var = this.f34292a;
        v70Var.getClass();
        float f7 = 18;
        int dp = AndroidUtilities.dp(f7);
        v70Var.getClass();
        imageView.setPadding(dp, 0, AndroidUtilities.dp(f7), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        v70Var.getClass();
        float f10 = 36;
        this.d = AndroidUtilities.dp(f10);
        if (pageblockmath != null && (a2 = ji.s.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) != null) {
            imageView.setImageBitmap(a2.f14154a);
            int i10 = a2.f14155b;
            v70Var.getClass();
            int dp2 = AndroidUtilities.dp(f10) + i10;
            this.d = dp2;
            imageView.setLayoutParams(new FrameLayout.LayoutParams(dp2, a2.f14156c));
        }
    }
}
