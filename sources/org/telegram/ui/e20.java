package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class e20 extends FrameLayout {
    public final FiltersSetupActivity E;
    public final org.telegram.ui.ActionBar.h5 f35177a;
    public final TextView f35178b;
    public final ImageView f35179c;
    public int d;
    public int e;
    public final View f35180f;
    public final ImageView h;
    public final org.telegram.ui.Components.w30 f35181n;
    public boolean f35182r;
    public final org.telegram.ui.Components.ha0 f35183s;
    public boolean v;
    public float f35184w;
    public MessagesController.DialogFilter f35185x;
    public ValueAnimator f35186y;

    public e20(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i13;
        float f7;
        float f10;
        int i14;
        int i15;
        float f11;
        float f12;
        int i16;
        float f13;
        float f14;
        int i17;
        this.E = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.f35182r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f35179c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i18 = org.telegram.ui.ActionBar.g6.Uh;
        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i18, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.z5.a(48.0f, 7.0f, 0.0f, 6.0f, 0.0f, 48, i10 | 16));
        View view = new View(context);
        this.f35180f = view;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(view, w7.z5.a(20.0f, 22.0f, 0.0f, 22.0f, 0.0f, 20, i11 | 16));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f35177a = h5Var;
        h5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setMaxLines(1);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i18, false), mode));
        h5Var.i(drawable);
        int i19 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.m2) filtersSetupActivity).resourceProvider;
        h5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.w0(i19, c6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        if (z10) {
            f7 = 80.0f;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 80.0f;
        }
        addView(h5Var, w7.z5.a(-2.0f, f7, 10.0f, f10, 0.0f, -1, i20));
        TextView textView = new TextView(context);
        this.f35178b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20005z6, false));
        textView.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView.setGravity(i14);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i21 = i15 | 48;
        if (z11) {
            f11 = 80.0f;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 80.0f;
        }
        addView(textView, w7.z5.a(-2.0f, f11, 35.0f, f12, 0.0f, -2, i21));
        textView.setVisibility(8);
        org.telegram.ui.Components.ha0 ha0Var = new org.telegram.ui.Components.ha0();
        this.f35183s = ha0Var;
        ha0Var.D = true;
        ha0Var.f25263t = 2.0f;
        int i22 = org.telegram.ui.ActionBar.g6.f19690i6;
        int x03 = org.telegram.ui.ActionBar.g6.x0(null, i22, false);
        ha0Var.g(org.telegram.ui.ActionBar.g6.m1(0.4f, x03), org.telegram.ui.ActionBar.g6.m1(1.0f, x03), org.telegram.ui.ActionBar.g6.m1(0.9f, x03), org.telegram.ui.ActionBar.g6.m1(1.7f, x03));
        int dp = AndroidUtilities.dp(1.0f);
        ha0Var.f25266x.setStrokeWidth(dp);
        ha0Var.k(40.0f);
        org.telegram.ui.Components.w30 w30Var = new org.telegram.ui.Components.w30(this, context, dp, 1);
        this.f35181n = w30Var;
        ha0Var.setCallback(w30Var);
        w30Var.setFocusable(false);
        w30Var.setScaleType(scaleType);
        w30Var.setBackground(org.telegram.ui.ActionBar.g6.g0(x03, 1, -1));
        w30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i18, false), mode));
        w30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        w30Var.setVisibility(8);
        w30Var.setImageResource(R.drawable.msg_link_folder);
        w30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i18, false), mode));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        int i23 = i16 | 16;
        if (z12) {
            f13 = 52.0f;
        } else {
            f13 = 6.0f;
        }
        if (z12) {
            f14 = 6.0f;
        } else {
            f14 = 52.0f;
        }
        addView(w30Var, w7.z5.a(40.0f, f13, 0.0f, f14, 0.0f, 40, i23));
        w30Var.setOnClickListener(new a(this, 25));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.x0(null, i22, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i18, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView2, w7.z5.a(40.0f, 6.0f, 0.0f, 6.0f, 0.0f, 40, i17 | 16));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f35185x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.v) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(62.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f19722k0);
        }
        MessagesController.DialogFilter dialogFilter = this.f35185x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f7 = this.f35184w;
                if (f7 != 1.0f) {
                    this.f35184w = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.f35184w;
                if (f10 != 0.0f) {
                    this.f35184w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.f35184w, 1.0f, 0.0f);
        this.f35184w = clamp;
        org.telegram.ui.ActionBar.h5 h5Var = this.f35177a;
        h5Var.setRightDrawableScale(clamp);
        h5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f35179c.setOnTouchListener(onTouchListener);
    }
}
