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
    public final int f24975a;
    public float f24976b;
    public boolean f24977c;
    public boolean d;
    public final p9 e;
    public final ImageView f24978f;
    public final gg.q h;
    public final View f24979n;
    public boolean f24980r;
    public final int f24981s;
    public SvgHelper.SvgDrawable v;
    public boolean f24982w;
    public ValueAnimator f24983x;
    public float f24984y;

    public fx0(Context context, int i10) {
        super(context);
        this.f24975a = i10;
        int i11 = D;
        D = i11 + 1;
        this.f24981s = i11;
        if (i10 == 2) {
            p9 p9Var = new p9(getContext());
            this.e = p9Var;
            p9Var.setLayerNum(1);
            p9Var.setAspectFit(false);
            p9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(p9Var, k7.b6.e(26, 26, 17));
            this.f24979n = p9Var;
        } else if (i10 == 1) {
            ImageView imageView = new ImageView(context);
            this.f24978f = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            addView(imageView, k7.b6.e(24, 24, 17));
            this.f24979n = imageView;
        } else {
            p9 p9Var2 = new p9(getContext());
            this.e = p9Var2;
            p9Var2.setLayerNum(1);
            p9Var2.setAspectFit(true);
            p9Var2.setRoundRadius(AndroidUtilities.dp(6.0f));
            addView(p9Var2, k7.b6.e(26, 26, 17));
            this.f24979n = p9Var2;
        }
        gg.q qVar = new gg.q(context, 23);
        this.h = qVar;
        qVar.addOnLayoutChangeListener(new g70(this, 1));
        qVar.setLines(1);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextSize(1, 11.0f);
        qVar.setGravity(1);
        qVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        addView(qVar, k7.b6.d(-1, -2.0f, 81, 8.0f, 0.0f, 8.0f, 10.0f));
        qVar.setVisibility(8);
    }

    public final void a(float f10) {
        float f11;
        float f12;
        int i10 = this.f24975a;
        if (i10 == 2) {
            return;
        }
        boolean z4 = this.f24980r;
        View view = this.f24979n;
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
            int i11 = om0.f27593q0;
            float f13 = 1.0f - f10;
            view.setTranslationY((((AndroidUtilities.dp(36.0f - f11) / 2.0f) - (AndroidUtilities.dp(86.0f - f12) / 2.0f)) * f13) - (AndroidUtilities.dp(8.0f) * f10));
            view.setTranslationX(((AndroidUtilities.dp(33.0f - f11) / 2.0f) - (AndroidUtilities.dp(64.0f - f12) / 2.0f)) * f13);
            float max = Math.max(0.0f, (f10 - 0.5f) / 0.5f);
            gg.q qVar = this.h;
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
        int i11 = this.f24975a;
        if (i11 != 2) {
            this.f24980r = z4;
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
            View view = this.f24979n;
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
            if (i11 != 1 && this.f24982w) {
                this.e.setRoundRadius(AndroidUtilities.dp(view.getLayoutParams().width / 2.0f));
            }
        }
    }
}
