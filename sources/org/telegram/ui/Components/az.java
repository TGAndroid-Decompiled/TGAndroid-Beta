package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

public final class az extends FrameLayout {
    public static final int h = 0;

    public final org.telegram.ui.ActionBar.c6 f26846a;

    public final TextView f26847b;

    public final View f26848c;
    public final ri0 d;

    public boolean f26849e;

    public int f26850f;

    public az(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26846a = c6Var;
        View radialProgressView = new RadialProgressView(context, null);
        addView(radialProgressView, h7.z5.c(-2.0f, -2));
        this.f26848c = radialProgressView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        linearLayout.setGravity(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(1);
        ri0 ri0Var = new ri0(context);
        this.d = ri0Var;
        ri0Var.setScaleType(ImageView.ScaleType.FIT_XY);
        ri0Var.setImportantForAccessibility(2);
        ri0Var.setVisibility(8);
        linearLayout.addView(ri0Var, h7.z5.t(150, 150, 17, 0, 0, 0, 20));
        TextView textView = new TextView(context);
        this.f26847b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23037c7, c6Var));
        textView.setGravity(1);
        textView.setText(LocaleController.getString(R.string.NoResult));
        linearLayout.addView(textView, h7.z5.q(-2, -2, 17));
        addView(linearLayout, h7.z5.c(-2.0f, -2));
        AndroidUtilities.updateViewVisibilityAnimated(textView, false, 2.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(radialProgressView, false, 1.0f, false);
        setOnTouchListener(new kh.e(18));
    }

    public final void a(int i10, int i11, int i12) {
        int i13 = i10 != 0 ? 0 : 8;
        ri0 ri0Var = this.d;
        ri0Var.setVisibility(i13);
        if (i10 != 0) {
            ri0Var.f(i10, i11, i12, null);
            ri0Var.d();
        }
    }

    public final void b() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f26847b, false, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f26848c, true, 1.0f, true);
    }

    public final void c() {
        AndroidUtilities.updateViewVisibilityAnimated(this.f26847b, true, 0.9f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.f26848c, false, 1.0f, true);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        int paddingTop;
        this.f26849e = true;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int childCount = getChildCount();
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = (i14 - childAt.getMeasuredWidth()) / 2;
                View view = this.f26848c;
                if (childAt == view && (view instanceof h00)) {
                    measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                    paddingTop = getPaddingTop();
                } else {
                    int i17 = this.f26850f;
                    if (i17 == 2) {
                        measuredHeight = (AndroidUtilities.dp(100.0f) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else if (i17 == 1) {
                        measuredHeight = ((i15 / 2) - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    } else {
                        measuredHeight = (i15 - childAt.getMeasuredHeight()) / 2;
                        paddingTop = getPaddingTop();
                    }
                }
                int i18 = paddingTop + measuredHeight;
                childAt.layout(measuredWidth, i18, childAt.getMeasuredWidth() + measuredWidth, childAt.getMeasuredHeight() + i18);
            }
        }
        this.f26849e = false;
    }

    @Override
    public final void requestLayout() {
        if (this.f26849e) {
            return;
        }
        super.requestLayout();
    }

    public void setProgressBarColor(int i10) {
        View view = this.f26848c;
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i10);
        }
    }

    public void setShowAtCenter(boolean z10) {
        this.f26850f = z10 ? 1 : 0;
    }

    public void setShowAtTop(boolean z10) {
        this.f26850f = z10 ? 2 : 0;
    }

    public void setText(String str) {
        this.f26847b.setText(str);
    }

    public void setTextColor(int i10) {
        this.f26847b.setTextColor(i10);
    }

    public void setTextSize(int i10) {
        this.f26847b.setTextSize(1, i10);
    }

    public void setTopImage(int i10) {
        TextView textView = this.f26847b;
        if (i10 == 0) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Drawable drawableMutate = getContext().getResources().getDrawable(i10).mutate();
        if (drawableMutate != null) {
            drawableMutate.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23037c7, this.f26846a), PorterDuff.Mode.MULTIPLY));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawableMutate, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(1.0f));
    }
}
