package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class n41 extends FrameLayout {
    public final int f35812a;

    public n41(Context context, int i10) {
        super(context);
        this.f35812a = i10;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f35812a) {
            case 7:
                org.telegram.ui.ActionBar.i6.f19144i3.setBounds(0, 0, getMeasuredWidth(), org.telegram.ui.ActionBar.i6.f19144i3.getIntrinsicHeight());
                org.telegram.ui.ActionBar.i6.f19144i3.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f35812a) {
            case 10:
                return super.drawChild(canvas, view, j3);
            case 11:
            default:
                return super.drawChild(canvas, view, j3);
            case 12:
                return false;
        }
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f35812a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f35812a) {
            case 6:
                super.onDraw(canvas);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, org.telegram.ui.ActionBar.i6.f19179k0);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f35812a) {
            case 3:
                int childCount = getChildCount();
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > getMeasuredWidth()) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    getChildAt(i16).layout(i14, i15, getChildAt(i16).getMeasuredWidth() + i14, getChildAt(i16).getMeasuredHeight() + i15);
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f35812a) {
            case 1:
                super.onMeasure(i10, org.telegram.messenger.qk.C(36.0f, View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 2:
                super.onMeasure(i10, i11);
                return;
            case 3:
                int size = View.MeasureSpec.getSize(i10);
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                int childCount = getChildCount();
                int i13 = 0;
                if (childCount > 0) {
                    i12 = getChildAt(0).getMeasuredHeight();
                } else {
                    i12 = 0;
                }
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < childCount; i16++) {
                    if (getChildAt(i16).getMeasuredWidth() + i14 > size) {
                        i15 += getChildAt(i16).getMeasuredHeight();
                        i14 = 0;
                    }
                    i14 += getChildAt(i16).getMeasuredWidth();
                }
                int measuredWidth = getMeasuredWidth();
                if (getChildCount() != 0) {
                    i13 = AndroidUtilities.dp(16.0f) + i12 + i15;
                }
                setMeasuredDimension(measuredWidth, i13);
                return;
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), 1073741824));
                return;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
                super.onMeasure(i10, i11);
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
                return;
        }
    }

    public n41(o41 o41Var, Context context, int i10, String str, CharSequence charSequence) {
        super(context);
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        org.telegram.ui.ActionBar.e6 e6Var4;
        this.f35812a = 0;
        boolean z10 = LocaleController.isRTL;
        ImageView imageView = new ImageView(getContext());
        Drawable mutate = getContext().getResources().getDrawable(i10).mutate();
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        e6Var = ((org.telegram.ui.ActionBar.g3) o41Var).resourcesProvider;
        mutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setImageDrawable(mutate);
        addView(imageView, w7.y5.d(24, 24.0f, z10 ? 5 : 3, z10 ? 0.0f : 27.0f, 6.0f, z10 ? 27.0f : 0.0f, 0.0f));
        TextView textView = new TextView(getContext());
        textView.setText(str);
        e6Var2 = ((org.telegram.ui.ActionBar.g3) o41Var).resourcesProvider;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var2));
        com.google.android.gms.internal.vision.e2.l(14.0f, 1, textView);
        addView(textView, w7.y5.d(-2, -2.0f, z10 ? 5 : 3, z10 ? 27.0f : 68.0f, 0.0f, z10 ? 68.0f : 27.0f, 0.0f));
        org.telegram.ui.Components.p90 p90Var = new org.telegram.ui.Components.p90(getContext(), null);
        p90Var.setText(charSequence);
        p90Var.setTextSize(1, 14.0f);
        int i12 = org.telegram.ui.ActionBar.i6.Pi;
        e6Var3 = ((org.telegram.ui.ActionBar.g3) o41Var).resourcesProvider;
        p90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, e6Var3));
        int i13 = org.telegram.ui.ActionBar.i6.gc;
        e6Var4 = ((org.telegram.ui.ActionBar.g3) o41Var).resourcesProvider;
        p90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i13, e6Var4));
        p90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p90Var.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
        addView(p90Var, w7.y5.d(-2, -2.0f, z10 ? 5 : 3, (z10 ? 27 : 68) - 4, 18.0f, (z10 ? 68 : 27) - 4, 0.0f));
    }
}
