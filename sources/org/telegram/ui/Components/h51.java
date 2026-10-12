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
public final class h51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f25506a;
    public boolean f25507b;
    public final e51 f25508c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final f51 f25509f;
    public boolean h;
    public final ImageView f25510n;
    public int f25511r;
    public final g6 f25512s;

    public h51(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f25511r = -1;
        this.f25512s = new g6(this, 0L, 320L, es.h);
        this.f25506a = c6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        e51 e51Var = new e51(this, context);
        this.f25508c = e51Var;
        NotificationCenter.listenEmojiLoading(e51Var);
        e51Var.setTextSize(1, 16.0f);
        e51Var.setMaxLines(1);
        e51Var.setSingleLine();
        e51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(e51Var, w7.a6.d(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.d0.c(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.c6.a(textView);
        addView(textView, w7.a6.a(18.0f, 0.0f, 1.0f, 0.0f, 0.0f, -2, 53));
        ?? nVar = new wh.n(context);
        this.f25509f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams d = w7.a6.d(-2.0f, -1);
        this.e = d;
        addView((View) nVar, d);
        ImageView imageView = new ImageView(context);
        this.f25510n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.c6.a(imageView);
        addView(imageView, w7.a6.a(38.0f, 0.0f, 0.0f, -16.0f, -12.0f, 38, 85));
        imageView.setVisibility(8);
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f25506a;
        this.f25508c.setTextColor(org.telegram.ui.ActionBar.g6.w0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.g6.L6;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i11, c6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i11, c6Var))));
        int w03 = org.telegram.ui.ActionBar.g6.w0(i10, c6Var);
        f51 f51Var = this.f25509f;
        f51Var.setTextColor(w03);
        f51Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(i11, c6Var));
        f51Var.setHighlightColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20224uf, c6Var));
        setHandlesColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20242vf, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f25510n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(i12, c6Var)), 1, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f25512s.d(this.f25511r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f25507b) {
            if (this.h) {
                view = this.f25508c;
            } else {
                view = this.f25509f;
            }
            Paint U0 = org.telegram.ui.ActionBar.g6.U0("paintDivider", this.f25506a);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.g6.f20022k0;
            }
            Paint paint = U0;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f25511r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f25510n.getVisibility() == 0) {
            Layout layout = this.f25509f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f25511r && !this.h) {
            this.f25511r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f25511r = measuredHeight;
        this.f25512s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        f51 f51Var = this.f25509f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = f51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                f51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = f51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                f51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = f51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                f51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
