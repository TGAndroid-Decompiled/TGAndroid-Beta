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
public final class fx0 extends FrameLayout {
    public static int D;
    public boolean B;
    public float C;
    public final int f27021a;
    public float f27022b;
    public boolean f27023c;
    public boolean d;
    public final p9 f27024e;
    public final ImageView f27025f;
    public final hg.q h;
    public final View f27026n;
    public boolean f27027r;
    public final int f27028s;
    public SvgHelper.SvgDrawable v;
    public boolean f27029w;
    public ValueAnimator f27030x;
    public float f27031y;

    public fx0(Context context, int i10) {
        super(context);
        this.f27021a = i10;
        int i11 = D;
        D = i11 + 1;
        this.f27028s = i11;
        if (i10 == 2) {
            p9 p9Var = new p9(getContext());
            this.f27024e = p9Var;
            p9Var.setLayerNum(1);
            p9Var.setAspectFit(false);
            p9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(p9Var, k7.c6.e(26, 26, 17));
            this.f27026n = p9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f27025f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, k7.c6.e(24, 24, 17));
            this.f27026n = imageView;
        } else {
            p9 p9Var2 = new p9(getContext());
            this.f27024e = p9Var2;
            p9Var2.setLayerNum(1);
            p9Var2.setAspectFit(true);
            p9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(p9Var2, k7.c6.e(26, 26, 17));
            this.f27026n = p9Var2;
        }
        hg.q qVar = new hg.q(context, 23);
        this.h = qVar;
        qVar.addOnLayoutChangeListener(new h70(this, 1));
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 11.0f);
        qVar.setGravity(1);
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false));
        addView(qVar, k7.c6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        qVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i10 = this.f27021a;
        if (i10 == 2) {
            return;
        }
        boolean z4 = this.f27027r;
        View view = this.f27026n;
        if (z4) {
            if (i10 == 1) {
                f11 = 24.0f;
            } else {
                f11 = 26.0f;
            }
            if (i10 == 1) {
                f12 = 38.0f;
            } else {
                f12 = 44.0f;
            }
            int i11 = pm0.f30127q0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f11) / 2.0f) - (AndroidUtilities.dp(86.0f - f12) / 2.0f)) * f13) - (AndroidUtilities.dp(8.0f) * f10));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f11) / 2.0f) - (AndroidUtilities.dp(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            hg.q qVar = this.h;
            qVar.setAlpha(max);
            qVar.setTranslationY((-AndroidUtilities.dp(40.0f)) * f13);
            qVar.setTranslationX((-AndroidUtilities.dp(12.0f)) * f13);
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            float f14 = ((f11 / f12) * f13) + f10;
            view.setScaleX(f14);
            view.setScaleY(f14);
            return;
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }

    public float getTextWidth() {
        return this.C;
    }

    public void setExpanded(boolean z4) {
        float f10;
        float f11;
        float f12;
        int i10;
        int i11 = this.f27021a;
        if (i11 != 2) {
            this.f27027r = z4;
            if (i11 == 1) {
                f10 = 24.0f;
            } else {
                f10 = 26.0f;
            }
            if (i11 == 1) {
                f11 = 38.0f;
            } else {
                f11 = 44.0f;
            }
            View view = this.f27026n;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (z4) {
                f12 = f11;
            } else {
                f12 = f10;
            }
            layoutParams.width = AndroidUtilities.dp(f12);
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (z4) {
                f10 = f11;
            }
            layoutParams2.height = AndroidUtilities.dp(f10);
            if (z4) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            this.h.setVisibility(i10);
            if (i11 != 1 && this.f27029w) {
                this.f27024e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
