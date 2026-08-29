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
public final class j10 extends FrameLayout {
    public final FiltersSetupActivity A;
    public final org.telegram.ui.ActionBar.h5 f39394a;
    public final TextView f39395b;
    public final ImageView f39396c;
    public int d;
    public int f39397e;
    public final View f39398f;
    public final ImageView h;
    public final org.telegram.ui.Components.g30 f39399n;
    public boolean f39400r;
    public final org.telegram.ui.Components.c90 f39401s;
    public boolean v;
    public float f39402w;
    public MessagesController.DialogFilter f39403x;
    public ValueAnimator f39404y;

    public j10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i13;
        float f9;
        float f10;
        int i14;
        int i15;
        float f11;
        float f12;
        int i16;
        float f13;
        float f14;
        int i17;
        this.A = filtersSetupActivity;
        this.d = -2;
        this.f39397e = -1;
        this.f39400r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f39396c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i18 = org.telegram.ui.ActionBar.g6.Uh;
        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i18, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, i7.f6.d(48, 48.0f, i10 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f39398f = view;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(view, i7.f6.d(20, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f39394a = h5Var;
        h5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setMaxLines(1);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        h5Var.setGravity(i12 | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i18, false), mode));
        h5Var.i(drawable);
        int i19 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity).resourceProvider;
        h5Var.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i19, c6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i20 = i13 | 48;
        if (z10) {
            f9 = 80.0f;
        } else {
            f9 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 80.0f;
        }
        addView(h5Var, i7.f6.d(-1, -2.0f, i20, f9, 10.0f, f10, 0.0f));
        TextView textView = new TextView(context);
        this.f39395b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23450z6, false));
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
        addView(textView, i7.f6.d(-2, -2.0f, i21, f11, 35.0f, f12, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90();
        this.f39401s = c90Var;
        c90Var.C = true;
        c90Var.f27397t = 2.0f;
        int i22 = org.telegram.ui.ActionBar.g6.f23152i6;
        int w03 = org.telegram.ui.ActionBar.g6.w0(null, i22, false);
        c90Var.f(org.telegram.ui.ActionBar.g6.l1(0.4f, w03), org.telegram.ui.ActionBar.g6.l1(1.0f, w03), org.telegram.ui.ActionBar.g6.l1(0.9f, w03), org.telegram.ui.ActionBar.g6.l1(1.7f, w03));
        int dp = AndroidUtilities.dp(1.0f);
        c90Var.f27399w.setStrokeWidth(dp);
        c90Var.j(40.0f);
        org.telegram.ui.Components.g30 g30Var = new org.telegram.ui.Components.g30(this, context, dp, 1);
        this.f39399n = g30Var;
        c90Var.setCallback(g30Var);
        g30Var.setFocusable(false);
        g30Var.setScaleType(scaleType);
        g30Var.setBackground(org.telegram.ui.ActionBar.g6.f0(w03, 1, -1));
        g30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i18, false), mode));
        g30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        g30Var.setVisibility(8);
        g30Var.setImageResource(R.drawable.msg_link_folder);
        g30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i18, false), mode));
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
        addView(g30Var, i7.f6.d(40, 40.0f, i23, f13, 0.0f, f14, 0.0f));
        g30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, i22, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i18, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView2, i7.f6.d(40, 40.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f39403x;
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
        MessagesController.DialogFilter dialogFilter = this.f39403x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f9 = this.f39402w;
                if (f9 != 1.0f) {
                    this.f39402w = f9 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.f39402w;
                if (f10 != 0.0f) {
                    this.f39402w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.f39402w, 1.0f, 0.0f);
        this.f39402w = clamp;
        org.telegram.ui.ActionBar.h5 h5Var = this.f39394a;
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
        this.f39396c.setOnTouchListener(onTouchListener);
    }
}
