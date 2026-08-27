package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.XiaomiUtilities;

public final class l31 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {

    public final org.telegram.ui.ActionBar.c6 f30274a;

    public boolean f30275b;

    public final i31 f30276c;
    public final TextView d;

    public final FrameLayout.LayoutParams f30277e;

    public final j31 f30278f;
    public boolean h;

    public final ImageView f30279n;

    public int f30280r;

    public final y5 f30281s;

    public l31(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30280r = -1;
        this.f30281s = new y5(this, 0L, 320L, er.h);
        this.f30274a = c6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        i31 i31Var = new i31(this, context);
        this.f30276c = i31Var;
        NotificationCenter.listenEmojiLoading(i31Var);
        i31Var.setTextSize(1, 16.0f);
        i31Var.setMaxLines(1);
        i31Var.setSingleLine();
        i31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(i31Var, h7.z5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.pa.c(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        h7.b6.a(textView);
        addView(textView, h7.z5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        j31 j31Var = new j31(context);
        this.f30278f = j31Var;
        NotificationCenter.listenEmojiLoading(j31Var);
        j31Var.setTextSize(1, 16.0f);
        j31Var.setTextIsSelectable(true);
        FrameLayout.LayoutParams layoutParamsC = h7.z5.c(-2.0f, -1);
        this.f30277e = layoutParamsC;
        addView(j31Var, layoutParamsC);
        ImageView imageView = new ImageView(context);
        this.f30279n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        h7.b6.a(imageView);
        addView(imageView, h7.z5.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30274a;
        this.f30276c.setTextColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i11, c6Var);
        TextView textView = this.d;
        textView.setTextColor(iV0);
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var))));
        int iV1 = org.telegram.ui.ActionBar.g6.v0(i10, c6Var);
        j31 j31Var = this.f30278f;
        j31Var.setTextColor(iV1);
        j31Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        j31Var.setHighlightColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23366uf, c6Var));
        setHandlesColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23382vf, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f30279n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i12, c6Var)), 1, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f30281s.d(this.f30280r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f30275b) {
            View view = this.h ? this.f30276c : this.f30278f;
            Paint paintT0 = org.telegram.ui.ActionBar.g6.T0("paintDivider", this.f30274a);
            if (paintT0 == null) {
                paintT0 = org.telegram.ui.ActionBar.g6.f23175k0;
            }
            Paint paint = paintT0;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f30280r = getMeasuredHeight();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f30277e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(iMakeMeasureSpec, i11);
        if (this.f30279n.getVisibility() == 0) {
            Layout layout = this.f30278f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(iMakeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f30280r && !this.h) {
            this.f30280r = getMeasuredHeight();
            invalidate();
        } else {
            int measuredHeight = getMeasuredHeight();
            this.f30280r = measuredHeight;
            this.f30281s.d(measuredHeight, true);
        }
    }

    public void setHandlesColor(int i10) {
        j31 j31Var = this.f30278f;
        if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
            return;
        }
        try {
            Drawable textSelectHandleLeft = j31Var.getTextSelectHandleLeft();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            textSelectHandleLeft.setColorFilter(i10, mode);
            j31Var.setTextSelectHandleLeft(textSelectHandleLeft);
            Drawable textSelectHandle = j31Var.getTextSelectHandle();
            textSelectHandle.setColorFilter(i10, mode);
            j31Var.setTextSelectHandle(textSelectHandle);
            Drawable textSelectHandleRight = j31Var.getTextSelectHandleRight();
            textSelectHandleRight.setColorFilter(i10, mode);
            j31Var.setTextSelectHandleRight(textSelectHandleRight);
        } catch (Exception unused) {
        }
    }
}
