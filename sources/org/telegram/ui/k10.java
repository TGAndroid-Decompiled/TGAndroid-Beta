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

public final class k10 extends FrameLayout {
    public final FiltersSetupActivity A;

    public final org.telegram.ui.ActionBar.h5 f39561a;

    public final TextView f39562b;

    public final ImageView f39563c;
    public int d;

    public int f39564e;

    public final View f39565f;
    public final ImageView h;

    public final org.telegram.ui.Components.x20 f39566n;

    public boolean f39567r;

    public final org.telegram.ui.Components.t80 f39568s;
    public boolean v;

    public float f39569w;

    public MessagesController.DialogFilter f39570x;

    public ValueAnimator f39571y;

    public k10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        this.A = filtersSetupActivity;
        this.d = -2;
        this.f39564e = -1;
        this.f39567r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f39563c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i10 = org.telegram.ui.ActionBar.g6.Uh;
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i10, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        addView(imageView, h7.z5.d(48, 48.0f, (LocaleController.isRTL ? 5 : 3) | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f39565f = view;
        addView(view, h7.z5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f39561a = h5Var;
        h5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setMaxLines(1);
        h5Var.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
        h5Var.i(drawable);
        h5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, ((org.telegram.ui.ActionBar.n2) filtersSetupActivity).resourceProvider));
        boolean z10 = LocaleController.isRTL;
        addView(h5Var, h7.z5.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 80.0f : 64.0f, 10.0f, z10 ? 64.0f : 80.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39562b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23441z6, false));
        textView.setTextSize(1, 13.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        addView(textView, h7.z5.d(-2, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 80.0f : 64.0f, 35.0f, z11 ? 64.0f : 80.0f, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80();
        this.f39568s = t80Var;
        t80Var.C = true;
        t80Var.f32708t = 2.0f;
        int i11 = org.telegram.ui.ActionBar.g6.f23144i6;
        int iW1 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        t80Var.f(org.telegram.ui.ActionBar.g6.l1(0.4f, iW1), org.telegram.ui.ActionBar.g6.l1(1.0f, iW1), org.telegram.ui.ActionBar.g6.l1(0.9f, iW1), org.telegram.ui.ActionBar.g6.l1(1.7f, iW1));
        int iDp = AndroidUtilities.dp(1.0f);
        t80Var.f32710w.setStrokeWidth(iDp);
        t80Var.j(40.0f);
        org.telegram.ui.Components.x20 x20Var = new org.telegram.ui.Components.x20(this, context, iDp, 1);
        this.f39566n = x20Var;
        t80Var.setCallback(x20Var);
        x20Var.setFocusable(false);
        x20Var.setScaleType(scaleType);
        x20Var.setBackground(org.telegram.ui.ActionBar.g6.f0(iW1, 1, -1));
        x20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
        x20Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        x20Var.setVisibility(8);
        x20Var.setImageResource(R.drawable.msg_link_folder);
        x20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
        boolean z12 = LocaleController.isRTL;
        addView(x20Var, h7.z5.d(40, 40.0f, (z12 ? 3 : 5) | 16, z12 ? 52.0f : 6.0f, 0.0f, z12 ? 6.0f : 52.0f, 0.0f));
        x20Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i11, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i10, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        addView(imageView2, h7.z5.d(40, 40.0f, (LocaleController.isRTL ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f39570x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        if (this.v) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(62.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(62.0f) : 0), getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23175k0);
        }
        MessagesController.DialogFilter dialogFilter = this.f39570x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f11 = this.f39569w;
                if (f11 != 1.0f) {
                    this.f39569w = f11 + 0.10666667f;
                    invalidate();
                } else if (!z10) {
                    f10 = this.f39569w;
                    if (f10 != 0.0f) {
                        this.f39569w = f10 - 0.10666667f;
                        invalidate();
                    }
                }
            } else if (!z10) {
                f10 = this.f39569w;
                if (f10 != 0.0f) {
                    this.f39569w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float fClamp = Utilities.clamp(this.f39569w, 1.0f, 0.0f);
        this.f39569w = fClamp;
        org.telegram.ui.ActionBar.h5 h5Var = this.f39561a;
        h5Var.setRightDrawableScale(fClamp);
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
        this.f39563c.setOnTouchListener(onTouchListener);
    }
}
