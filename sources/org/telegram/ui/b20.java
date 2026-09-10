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
public final class b20 extends FrameLayout {
    public final FiltersSetupActivity E;
    public final org.telegram.ui.ActionBar.l5 f31133a;
    public final TextView f31134b;
    public final ImageView f31135c;
    public int d;
    public int e;
    public final View f31136f;
    public final ImageView h;
    public final org.telegram.ui.Components.t30 f31137n;
    public boolean f31138r;
    public final org.telegram.ui.Components.q90 f31139s;
    public boolean v;
    public float f31140w;
    public MessagesController.DialogFilter f31141x;
    public ValueAnimator f31142y;

    public b20(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.f6 f6Var;
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
        this.f31138r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f31135c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i18 = org.telegram.ui.ActionBar.j6.Uh;
        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i18, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, w7.a6.d(48, 48.0f, i10 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f31136f = view;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(view, w7.a6.d(20, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.f31133a = l5Var;
        l5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        l5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        l5Var.setTextSize(16);
        l5Var.setMaxLines(1);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        l5Var.setGravity(i12 | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        l5Var.i(drawable);
        int i19 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.p2) filtersSetupActivity).resourceProvider;
        l5Var.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i19, f6Var));
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
        addView(l5Var, w7.a6.d(-1, -2.0f, i20, f7, 10.0f, f10, 0.0f));
        TextView textView = new TextView(context);
        this.f31134b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18325z6, false));
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
        addView(textView, w7.a6.d(-2, -2.0f, i21, f11, 35.0f, f12, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90();
        this.f31139s = q90Var;
        q90Var.C = true;
        q90Var.f26361t = 2.0f;
        int i22 = org.telegram.ui.ActionBar.j6.f18017i6;
        int w03 = org.telegram.ui.ActionBar.j6.w0(null, i22, false);
        q90Var.f(org.telegram.ui.ActionBar.j6.l1(0.4f, w03), org.telegram.ui.ActionBar.j6.l1(1.0f, w03), org.telegram.ui.ActionBar.j6.l1(0.9f, w03), org.telegram.ui.ActionBar.j6.l1(1.7f, w03));
        int dp = AndroidUtilities.dp(1.0f);
        q90Var.f26363w.setStrokeWidth(dp);
        q90Var.j(40.0f);
        org.telegram.ui.Components.t30 t30Var = new org.telegram.ui.Components.t30(this, context, dp, 1);
        this.f31137n = t30Var;
        q90Var.setCallback(t30Var);
        t30Var.setFocusable(false);
        t30Var.setScaleType(scaleType);
        t30Var.setBackground(org.telegram.ui.ActionBar.j6.f0(w03, 1, -1));
        t30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        t30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        t30Var.setVisibility(8);
        t30Var.setImageResource(R.drawable.msg_link_folder);
        t30Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
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
        addView(t30Var, w7.a6.d(40, 40.0f, i23, f13, 0.0f, f14, 0.0f));
        t30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.w0(null, i22, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i18, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView2, w7.a6.d(40, 40.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f31141x;
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
        MessagesController.DialogFilter dialogFilter = this.f31141x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f7 = this.f31140w;
                if (f7 != 1.0f) {
                    this.f31140w = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.f31140w;
                if (f10 != 0.0f) {
                    this.f31140w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.f31140w, 1.0f, 0.0f);
        this.f31140w = clamp;
        org.telegram.ui.ActionBar.l5 l5Var = this.f31133a;
        l5Var.setRightDrawableScale(clamp);
        l5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f31135c.setOnTouchListener(onTouchListener);
    }
}
