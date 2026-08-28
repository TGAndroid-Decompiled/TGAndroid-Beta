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
public final class h10 extends FrameLayout {
    public final FiltersSetupActivity A;
    public final org.telegram.ui.ActionBar.h5 f38638a;
    public final TextView f38639b;
    public final ImageView f38640c;
    public int d;
    public int f38641e;
    public final View f38642f;
    public final ImageView h;
    public final org.telegram.ui.Components.t20 f38643n;
    public boolean f38644r;
    public final org.telegram.ui.Components.p80 f38645s;
    public boolean v;
    public float f38646w;
    public MessagesController.DialogFilter f38647x;
    public ValueAnimator f38648y;

    public h10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i9;
        int i10;
        int i11;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i12;
        float f10;
        float f11;
        int i13;
        int i14;
        float f12;
        float f13;
        int i15;
        float f14;
        float f15;
        int i16;
        this.A = filtersSetupActivity;
        this.d = -2;
        this.f38641e = -1;
        this.f38644r = false;
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f38640c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i17 = org.telegram.ui.ActionBar.f6.Uh;
        int w02 = org.telegram.ui.ActionBar.f6.w0(null, i17, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        addView(imageView, g7.e6.d(48, 48.0f, i9 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f38642f = view;
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(view, g7.e6.d(20, 20.0f, i10 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.f38638a = h5Var;
        h5Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        h5Var.setTextSize(16);
        h5Var.setMaxLines(1);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        h5Var.setGravity(i11 | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        drawable.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i17, false), mode));
        h5Var.i(drawable);
        int i18 = org.telegram.ui.ActionBar.f6.Oh;
        b6Var = ((org.telegram.ui.ActionBar.o2) filtersSetupActivity).resourceProvider;
        h5Var.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i18, b6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i19 = i12 | 48;
        if (z10) {
            f10 = 80.0f;
        } else {
            f10 = 64.0f;
        }
        if (z10) {
            f11 = 64.0f;
        } else {
            f11 = 80.0f;
        }
        addView(h5Var, g7.e6.d(-1, -2.0f, i19, f10, 10.0f, f11, 0.0f));
        TextView textView = new TextView(context);
        this.f38639b = textView;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23386z6, false));
        textView.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView.setGravity(i13);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i20 = i14 | 48;
        if (z11) {
            f12 = 80.0f;
        } else {
            f12 = 64.0f;
        }
        if (z11) {
            f13 = 64.0f;
        } else {
            f13 = 80.0f;
        }
        addView(textView, g7.e6.d(-2, -2.0f, i20, f12, 35.0f, f13, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80();
        this.f38645s = p80Var;
        p80Var.C = true;
        p80Var.f31588t = 2.0f;
        int i21 = org.telegram.ui.ActionBar.f6.f23092i6;
        int w03 = org.telegram.ui.ActionBar.f6.w0(null, i21, false);
        p80Var.f(org.telegram.ui.ActionBar.f6.l1(0.4f, w03), org.telegram.ui.ActionBar.f6.l1(1.0f, w03), org.telegram.ui.ActionBar.f6.l1(0.9f, w03), org.telegram.ui.ActionBar.f6.l1(1.7f, w03));
        int dp = AndroidUtilities.dp(1.0f);
        p80Var.f31590w.setStrokeWidth(dp);
        p80Var.j(40.0f);
        org.telegram.ui.Components.t20 t20Var = new org.telegram.ui.Components.t20(this, context, dp, 1);
        this.f38643n = t20Var;
        p80Var.setCallback(t20Var);
        t20Var.setFocusable(false);
        t20Var.setScaleType(scaleType);
        t20Var.setBackground(org.telegram.ui.ActionBar.f6.f0(w03, 1, -1));
        t20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i17, false), mode));
        t20Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        t20Var.setVisibility(8);
        t20Var.setImageResource(R.drawable.msg_link_folder);
        t20Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i17, false), mode));
        boolean z12 = LocaleController.isRTL;
        if (z12) {
            i15 = 3;
        } else {
            i15 = 5;
        }
        int i22 = i15 | 16;
        if (z12) {
            f14 = 52.0f;
        } else {
            f14 = 6.0f;
        }
        if (z12) {
            f15 = 6.0f;
        } else {
            f15 = 52.0f;
        }
        addView(t20Var, g7.e6.d(40, 40.0f, i22, f14, 0.0f, f15, 0.0f));
        t20Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.w0(null, i21, false), 1, -1));
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i17, false), mode));
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (LocaleController.isRTL) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView2, g7.e6.d(40, 40.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f38647x;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i9;
        if (this.v) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(62.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
        MessagesController.DialogFilter dialogFilter = this.f38647x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f10 = this.f38646w;
                if (f10 != 1.0f) {
                    this.f38646w = f10 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f11 = this.f38646w;
                if (f11 != 0.0f) {
                    this.f38646w = f11 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.f38646w, 1.0f, 0.0f);
        this.f38646w = clamp;
        org.telegram.ui.ActionBar.h5 h5Var = this.f38638a;
        h5Var.setRightDrawableScale(clamp);
        h5Var.invalidate();
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f38640c.setOnTouchListener(onTouchListener);
    }
}
