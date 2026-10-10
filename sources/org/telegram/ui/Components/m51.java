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
public final class m51 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f28634a;
    public boolean f28635b;
    public final j51 f28636c;
    public final TextView d;
    public final FrameLayout.LayoutParams f28637e;
    public final k51 f28638f;
    public boolean h;
    public final ImageView f28639n;
    public int f28640r;
    public final g6 f28641s;

    public m51(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f28640r = -1;
        this.f28641s = new g6(this, 0L, 320L, is.h);
        this.f28634a = e6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        j51 j51Var = new j51(this, context);
        this.f28636c = j51Var;
        NotificationCenter.listenEmojiLoading(j51Var);
        j51Var.setTextSize(1, 16.0f);
        j51Var.setMaxLines(1);
        j51Var.setSingleLine();
        j51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(j51Var, w7.x5.d(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.z5.a(textView);
        addView(textView, w7.x5.a(18.0f, 0.0f, 1.0f, 0.0f, 0.0f, -2, 53));
        ?? nVar = new vh.n(context);
        this.f28638f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams d = w7.x5.d(-2.0f, -1);
        this.f28637e = d;
        addView((View) nVar, d);
        ImageView imageView = new ImageView(context);
        this.f28639n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.z5.a(imageView);
        addView(imageView, w7.x5.a(38.0f, 0.0f, 0.0f, -16.0f, -12.0f, 38, 85));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f28641s.d(this.f28640r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f28634a;
        this.f28636c.setTextColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i11, e6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(i11, e6Var))));
        int w03 = org.telegram.ui.ActionBar.i6.w0(i10, e6Var);
        k51 k51Var = this.f28638f;
        k51Var.setTextColor(w03);
        k51Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(i11, e6Var));
        k51Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21123uf, e6Var));
        setHandlesColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21140vf, e6Var));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f28639n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.m1(0.1f, org.telegram.ui.ActionBar.i6.w0(i12, e6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f28635b) {
            if (this.h) {
                view = this.f28636c;
            } else {
                view = this.f28638f;
            }
            Paint U0 = org.telegram.ui.ActionBar.i6.U0("paintDivider", this.f28634a);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.i6.f20923k0;
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
        this.f28640r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f28637e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f28639n.getVisibility() == 0) {
            Layout layout = this.f28638f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f28640r && !this.h) {
            this.f28640r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f28640r = measuredHeight;
        this.f28641s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        k51 k51Var = this.f28638f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = k51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                k51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = k51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                k51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = k51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                k51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
