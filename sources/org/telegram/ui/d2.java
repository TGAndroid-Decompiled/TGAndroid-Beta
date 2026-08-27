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

    public final d70 f37240a;

    public final FrameLayout f37241b;

    public final ImageView f37242c;
    public int d;

    public d2(Context context, d70 d70Var) {
        super(context);
        this.f37240a = d70Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f37241b = frameLayout;
        addView(frameLayout, h7.z5.c(-2.0f, -2));
        ImageView imageView = new ImageView(context);
        this.f37242c = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, h7.z5.c(-2.0f, -2));
        d();
    }

    @Override
    public final void d() {
        this.f37242c.setColorFilter(new PorterDuffColorFilter(this.f37240a.b(), PorterDuff.Mode.SRC_IN));
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
        return this.d > getMeasuredWidth() ? getMeasuredWidth() : (getMeasuredWidth() + this.d) / 2;
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
        } else {
            FrameLayout frameLayout = this.f37241b;
            frameLayout.layout((i14 - i15) / 2, 0, (i14 + i15) / 2, frameLayout.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setBlock(TL_iv.pageBlockMath pageblockmath) {
        rh.q qVarA;
        ImageView imageView = this.f37242c;
        imageView.setImageBitmap(null);
        d70 d70Var = this.f37240a;
        d70Var.getClass();
        float f10 = 18;
        int iDp = AndroidUtilities.dp(f10);
        d70Var.getClass();
        imageView.setPadding(iDp, 0, AndroidUtilities.dp(f10), 0);
        imageView.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
        d70Var.getClass();
        float f11 = 36;
        this.d = AndroidUtilities.dp(f11);
        if (pageblockmath == null || (qVarA = rh.q.a(pageblockmath.source, AndroidUtilities.dp(20.0f), false)) == null) {
            return;
        }
        imageView.setImageBitmap(qVarA.f47381a);
        int i10 = qVarA.f47382b;
        d70Var.getClass();
        int iDp2 = AndroidUtilities.dp(f11) + i10;
        this.d = iDp2;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(iDp2, qVarA.f47383c));
    }
}
