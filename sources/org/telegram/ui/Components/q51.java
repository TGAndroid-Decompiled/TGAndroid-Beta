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
public final class q51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.c6 f29701a;
    public boolean f29702b;
    public final n51 f29703c;
    public final TextView d;
    public final FrameLayout.LayoutParams f29704e;
    public final o51 f29705f;
    public boolean h;
    public final ImageView f29706n;
    public int f29707r;
    public final g6 f29708s;

    public q51(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f29707r = -1;
        this.f29708s = new g6(this, 0L, 320L, js.h);
        this.f29701a = c6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        n51 n51Var = new n51(this, context);
        this.f29703c = n51Var;
        NotificationCenter.listenEmojiLoading(n51Var);
        n51Var.setTextSize(1, 16.0f);
        n51Var.setMaxLines(1);
        n51Var.setSingleLine();
        n51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(n51Var, w7.w5.d(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.y5.a(textView);
        addView(textView, w7.w5.a(18.0f, 0.0f, 1.0f, 0.0f, 0.0f, -2, 53));
        ?? nVar = new vh.n(context);
        this.f29705f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams d = w7.w5.d(-2.0f, -1);
        this.f29704e = d;
        addView((View) nVar, d);
        ImageView imageView = new ImageView(context);
        this.f29706n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.y5.a(imageView);
        addView(imageView, w7.w5.a(38.0f, 0.0f, 0.0f, -16.0f, -12.0f, 38, 85));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f29708s.d(this.f29707r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.f29701a;
        this.f29703c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, c6Var));
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, c6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i11, c6Var))));
        int w03 = org.telegram.ui.ActionBar.h6.w0(i10, c6Var);
        o51 o51Var = this.f29705f;
        o51Var.setTextColor(w03);
        o51Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, c6Var));
        o51Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20883uf, c6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20900vf, c6Var));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, c6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f29706n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i12, c6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f29702b) {
            if (this.h) {
                view = this.f29703c;
            } else {
                view = this.f29705f;
            }
            Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", this.f29701a);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.h6.f20681k0;
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
        this.f29707r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f29704e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f29706n.getVisibility() == 0) {
            Layout layout = this.f29705f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f29707r && !this.h) {
            this.f29707r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f29707r = measuredHeight;
        this.f29708s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        o51 o51Var = this.f29705f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = o51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                o51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = o51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                o51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = o51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                o51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
