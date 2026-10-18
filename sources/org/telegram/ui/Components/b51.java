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
public final class b51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f24805a;
    public boolean f24806b;
    public final y41 f24807c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final z41 f24808f;
    public boolean h;
    public final ImageView f24809n;
    public int f24810r;
    public final f6 f24811s;

    public b51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24810r = -1;
        this.f24811s = new f6(this, 0L, 320L, bs.h);
        this.f24805a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        y41 y41Var = new y41(this, context);
        this.f24807c = y41Var;
        NotificationCenter.listenEmojiLoading(y41Var);
        y41Var.setTextSize(1, 16.0f);
        y41Var.setMaxLines(1);
        y41Var.setSingleLine();
        y41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(y41Var, w7.z5.d(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.e(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.b6.a(textView);
        addView(textView, w7.z5.a(18.0f, 0.0f, 1.0f, 0.0f, 0.0f, -2, 53));
        ?? nVar = new wh.n(context);
        this.f24808f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams d = w7.z5.d(-2.0f, -1);
        this.e = d;
        addView((View) nVar, d);
        ImageView imageView = new ImageView(context);
        this.f24809n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.b6.a(imageView);
        addView(imageView, w7.z5.a(38.0f, 0.0f, 0.0f, -16.0f, -12.0f, 38, 85));
        imageView.setVisibility(8);
        d();
    }

    @Override
    public final void d() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f24805a;
        this.f24807c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var))));
        int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        z41 z41Var = this.f24808f;
        z41Var.setTextColor(w03);
        z41Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        z41Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21317uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21335vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f24809n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i12, d6Var)), 1, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f24811s.d(this.f24810r, false));
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
        if (this.f24806b) {
            if (this.h) {
                view = this.f24807c;
            } else {
                view = this.f24808f;
            }
            Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", this.f24805a);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.h6.f21114k0;
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
        this.f24810r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f24809n.getVisibility() == 0) {
            Layout layout = this.f24808f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f24810r && !this.h) {
            this.f24810r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f24810r = measuredHeight;
        this.f24811s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        z41 z41Var = this.f24808f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = z41Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                z41Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = z41Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                z41Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = z41Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                z41Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
