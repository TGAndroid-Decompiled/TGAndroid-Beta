package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public final class l10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public final org.telegram.ui.Components.h6 F;
    public final Paint G;
    public final FiltersSetupActivity H;
    public final org.telegram.ui.ActionBar.b6 f41098a;
    public final TextView f41099b;
    public final ImageView f41100c;
    public int d;
    public int e;
    public final View f41101f;
    public final ImageView h;
    public final org.telegram.ui.Components.u30 f41102n;
    public boolean f41103r;
    public final org.telegram.ui.Components.da0 f41104s;
    public boolean v;
    public float f41105w;
    public MessagesController.DialogFilter f41106x;
    public ValueAnimator f41107y;

    public l10(FiltersSetupActivity filtersSetupActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.u6 u6Var;
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
        this.H = filtersSetupActivity;
        this.d = -2;
        this.e = -1;
        this.f41103r = false;
        this.F = new org.telegram.ui.Components.h6(this, 0L, 420L, org.telegram.ui.Components.ds.h);
        this.G = new Paint(1);
        setWillNotDraw(false);
        ImageView imageView = new ImageView(context);
        this.f41100c = imageView;
        imageView.setFocusable(false);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.list_reorder);
        int i18 = org.telegram.ui.ActionBar.y6.Uh;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i18, null, mode);
        imageView.setContentDescription(LocaleController.getString(R.string.FilterReorder));
        imageView.setClickable(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(imageView, org.telegram.ui.Components.gb1.h(48, 48.0f, i10 | 16, 7.0f, 0.0f, 6.0f, 0.0f));
        View view = new View(context);
        this.f41101f = view;
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        addView(view, org.telegram.ui.Components.gb1.h(20, 20.0f, i11 | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        org.telegram.ui.ActionBar.b6 b6Var = new org.telegram.ui.ActionBar.b6(context);
        this.f41098a = b6Var;
        b6Var.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        org.telegram.ui.ActionBar.f7.Y(b6Var, org.telegram.ui.ActionBar.y6.G6, null);
        b6Var.setTextSize(16);
        b6Var.setMaxLines(1);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        b6Var.setGravity(i12 | 16);
        Drawable drawable = getContext().getDrawable(R.drawable.other_lockedfolders2);
        org.telegram.ui.ActionBar.f7.y(this, drawable, i18, null, mode);
        b6Var.i(drawable);
        int i19 = org.telegram.ui.ActionBar.y6.Oh;
        u6Var = ((org.telegram.ui.ActionBar.r2) filtersSetupActivity).resourceProvider;
        b6Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i19, u6Var));
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
        addView(b6Var, org.telegram.ui.Components.gb1.h(-1, -2.0f, i20, f7, 10.0f, f10, 0.0f));
        TextView textView = new TextView(context);
        this.f41099b = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23765z6, null);
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
        addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, i21, f11, 35.0f, f12, 0.0f));
        textView.setVisibility(8);
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0();
        this.f41104s = da0Var;
        da0Var.D = true;
        da0Var.f27475t = 2.0f;
        int i22 = org.telegram.ui.ActionBar.y6.f23446i6;
        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i22, false);
        da0Var.g(org.telegram.ui.ActionBar.y6.o1(0.4f, x02), org.telegram.ui.ActionBar.y6.o1(1.0f, x02), org.telegram.ui.ActionBar.y6.o1(0.9f, x02), org.telegram.ui.ActionBar.y6.o1(1.7f, x02));
        int dp = AndroidUtilities.dp(1.0f);
        da0Var.f27478x.setStrokeWidth(dp);
        da0Var.k(40.0f);
        org.telegram.ui.Components.u30 u30Var = new org.telegram.ui.Components.u30(this, context, dp, 1);
        this.f41102n = u30Var;
        da0Var.setCallback(u30Var);
        u30Var.setFocusable(false);
        u30Var.setScaleType(scaleType);
        org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(x02, 1, -1);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i22);
        u30Var.setBackground(g02);
        org.telegram.ui.ActionBar.f7.k(u30Var, g02, null, N, null);
        org.telegram.ui.ActionBar.f7.t(u30Var, i18, null, mode);
        u30Var.setContentDescription(LocaleController.getString(R.string.FilterShare));
        u30Var.setVisibility(8);
        u30Var.setImageResource(R.drawable.msg_link_folder);
        org.telegram.ui.ActionBar.f7.t(u30Var, i18, null, mode);
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
        addView(u30Var, org.telegram.ui.Components.gb1.h(40, 40.0f, i23, f13, 0.0f, f14, 0.0f));
        u30Var.setOnClickListener(new a(this, 26));
        ImageView imageView2 = new ImageView(context);
        this.h = imageView2;
        imageView2.setFocusable(false);
        imageView2.setScaleType(scaleType);
        org.telegram.ui.Cells.y g03 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i22, false), 1, -1);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i22);
        imageView2.setBackground(g03);
        org.telegram.ui.ActionBar.f7.k(imageView2, g03, null, N2, null);
        org.telegram.ui.ActionBar.f7.t(imageView2, i18, null, mode);
        imageView2.setImageResource(R.drawable.msg_actions);
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView2, org.telegram.ui.Components.gb1.h(40, 40.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
    }

    public MessagesController.DialogFilter getCurrentFilter() {
        return this.f41106x;
    }

    public float getDraggingProgress() {
        return this.F.f28809c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        float e = this.F.e(this.E);
        int i10 = 0;
        if (e > 0.0f) {
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false);
            Paint paint = this.G;
            paint.setColor(x02);
            paint.setAlpha((int) (255.0f * e));
            paint.setShadowLayer(AndroidUtilities.dp(12.0f) * e, 0.0f, AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.y6.o1(e, 301989888));
            float dp2 = AndroidUtilities.dp(8.0f) * e;
            float dp3 = AndroidUtilities.dp(12.0f) * e;
            canvas.drawRoundRect(dp2, 0.0f, getWidth() - dp2, getHeight(), dp3, dp3, paint);
        }
        if (this.v && e < 1.0f) {
            int alpha = org.telegram.ui.ActionBar.y6.f23476k0.getAlpha();
            org.telegram.ui.ActionBar.y6.f23476k0.setAlpha((int) ((1.0f - e) * alpha));
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(62.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(62.0f);
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
            org.telegram.ui.ActionBar.y6.f23476k0.setAlpha(alpha);
        }
        MessagesController.DialogFilter dialogFilter = this.f41106x;
        if (dialogFilter != null) {
            boolean z10 = dialogFilter.locked;
            if (z10) {
                float f7 = this.f41105w;
                if (f7 != 1.0f) {
                    this.f41105w = f7 + 0.10666667f;
                    invalidate();
                }
            }
            if (!z10) {
                float f10 = this.f41105w;
                if (f10 != 0.0f) {
                    this.f41105w = f10 - 0.10666667f;
                    invalidate();
                }
            }
        }
        float clamp = Utilities.clamp(this.f41105w, 1.0f, 0.0f);
        this.f41105w = clamp;
        org.telegram.ui.ActionBar.b6 b6Var = this.f41098a;
        b6Var.setRightDrawableScale(clamp);
        b6Var.invalidate();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
    }

    public void setDragging(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    public void setOnOptionsClick(View.OnClickListener onClickListener) {
        this.h.setOnClickListener(onClickListener);
    }

    public void setOnReorderButtonTouchListener(View.OnTouchListener onTouchListener) {
        this.f41100c.setOnTouchListener(onTouchListener);
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.ActionBar.u6 u6Var;
        try {
            org.telegram.ui.ActionBar.b6 b6Var = this.f41098a;
            if (b6Var != null) {
                int i10 = org.telegram.ui.ActionBar.y6.Oh;
                u6Var = ((org.telegram.ui.ActionBar.r2) this.H).resourceProvider;
                b6Var.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
