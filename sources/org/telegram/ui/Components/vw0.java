package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SvgHelper;
public final class vw0 extends FrameLayout {
    public static int C;
    public boolean A;
    public float B;
    public final int f34194a;
    public float f34195b;
    public boolean f34196c;
    public boolean d;
    public final t9 f34197e;
    public final ImageView f34198f;
    public final eg.r h;
    public final View f34199n;
    public boolean f34200r;
    public final int f34201s;
    public SvgHelper.SvgDrawable v;
    public boolean f34202w;
    public ValueAnimator f34203x;
    public float f34204y;

    public vw0(Context context, int i10) {
        super(context);
        this.f34194a = i10;
        int i11 = C;
        C = i11 + 1;
        this.f34201s = i11;
        if (i10 == 2) {
            t9 t9Var = new t9(getContext());
            this.f34197e = t9Var;
            t9Var.setLayerNum(1);
            t9Var.setAspectFit(false);
            t9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(t9Var, i7.f6.e(26, 26, 17));
            this.f34199n = t9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f34198f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, i7.f6.e(24, 24, 17));
            this.f34199n = imageView;
        } else {
            t9 t9Var2 = new t9(getContext());
            this.f34197e = t9Var2;
            t9Var2.setLayerNum(1);
            t9Var2.setAspectFit(true);
            t9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(t9Var2, i7.f6.e(26, 26, 17));
            this.f34199n = t9Var2;
        }
        eg.r rVar = new eg.r(context, 23);
        this.h = rVar;
        rVar.addOnLayoutChangeListener(new a70(this, 1));
        rVar.setLines(1);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        rVar.setTextSize(1, 11.0f);
        rVar.setGravity(1);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        addView(rVar, i7.f6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        rVar.setVisibility(8);
    }

    public final void a(float f9) {
        float f10;
        float f11;
        int i10 = this.f34194a;
        if (i10 == 2) {
            return;
        }
        boolean z10 = this.f34200r;
        View view = this.f34199n;
        if (z10) {
            if (i10 == 1) {
                f10 = 24.0f;
            } else {
                f10 = 26.0f;
            }
            if (i10 == 1) {
                f11 = 38.0f;
            } else {
                f11 = 44.0f;
            }
            int i11 = fm0.f28482p0;
            float f12 = 1.0f - f9;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f10) / 2.0f) - (AndroidUtilities.dp(86.0f - f11) / 2.0f)) * f12) - (AndroidUtilities.dp(8.0f) * f9));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f10) / 2.0f) - (AndroidUtilities.dp(64.0f - f11) / 2.0f)) * f12);
            float max = Math.max(0.0f, (f9 - 0.5f) / 0.5f);
            eg.r rVar = this.h;
            rVar.setAlpha(max);
            rVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f12);
            rVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f12);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            float f13 = ((f10 / f11) * f12) + f9;
            view.setScaleX(f13);
            view.setScaleY(f13);
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public float getTextWidth() {
        return this.B;
    }

    public void setExpanded(boolean z10) {
        float f9;
        float f10;
        float f11;
        int i10;
        int i11 = this.f34194a;
        if (i11 != 2) {
            this.f34200r = z10;
            if (i11 == 1) {
                f9 = 24.0f;
            } else {
                f9 = 26.0f;
            }
            if (i11 == 1) {
                f10 = 38.0f;
            } else {
                f10 = 44.0f;
            }
            View view = this.f34199n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z10) {
                f11 = f10;
            } else {
                f11 = f9;
            }
            layoutParams.width = AndroidUtilities.dp(f11);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z10) {
                f9 = f10;
            }
            layoutParams2.height = AndroidUtilities.dp(f9);
            if (z10) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.h.setVisibility(i10);
            if (i11 != 1 && this.f34202w) {
                this.f34197e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
