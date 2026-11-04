package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class oy extends FrameLayout {
    public final TextView f48379a;
    public final ImageView f48380b;
    public boolean f48381c;

    public oy(Context context) {
        super(context);
        int i3;
        int i10;
        int i11;
        float f10;
        float f11;
        float f12;
        float f13;
        TextView textView = new TextView(context);
        this.f48379a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28121q6, null);
        k2.p1.u(textView, 1, 16.0f, null, 2131751714);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        if (z10) {
            i10 = 16;
        } else {
            i10 = 0;
        }
        if (z10) {
            i11 = 0;
        } else {
            i11 = 16;
        }
        textView.setPadding(i10, 0, i11, 0);
        boolean z11 = org.telegram.messenger.bd.f21784a0;
        if (z11) {
            f10 = 0.0f;
        } else {
            f10 = 64.0f;
        }
        if (z11) {
            f11 = 64.0f;
        } else {
            f11 = 0.0f;
        }
        addView(textView, b8.mf.d(-1, -2.0f, 23, f10, 0.0f, f11, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f48380b = imageView;
        Drawable drawable = context.getResources().getDrawable(2131232557);
        Drawable drawable2 = context.getResources().getDrawable(2131232558);
        int i12 = org.telegram.ui.ActionBar.k6.Ci;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(this, drawable, i12, null, mode);
        org.telegram.ui.ActionBar.r6.y(this, drawable2, org.telegram.ui.ActionBar.k6.f28008k7, null, mode);
        imageView.setImageDrawable(new org.telegram.ui.Components.xp(drawable, drawable2));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        boolean z12 = org.telegram.messenger.bd.f21784a0;
        int i13 = (z12 ? 5 : 3) | 16;
        if (z12) {
            f12 = 0.0f;
        } else {
            f12 = 16.0f;
        }
        if (z12) {
            f13 = 16.0f;
        } else {
            f13 = 0.0f;
        }
        addView(imageView, b8.mf.d(32, 32.0f, i13, f12, 0.0f, f13, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f48381c) {
            TextView textView = this.f48379a;
            canvas.drawRect(textView.getLeft(), getMeasuredHeight() - 1, textView.getRight(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(45.0f), 1073741824));
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        float f11 = 0.5f;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.5f;
        }
        this.f48379a.setAlpha(f10);
        if (z10) {
            f11 = 1.0f;
        }
        this.f48380b.setAlpha(f11);
    }
}
