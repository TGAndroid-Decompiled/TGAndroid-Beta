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
public final class s41 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f28136a;
    public boolean f28137b;
    public final p41 f28138c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final q41 f28139f;
    public boolean h;
    public final ImageView f28140n;
    public int f28141r;
    public final e6 f28142s;

    public s41(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28141r = -1;
        this.f28142s = new e6(this, 0L, 320L, rr.h);
        this.f28136a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        p41 p41Var = new p41(this, context);
        this.f28138c = p41Var;
        NotificationCenter.listenEmojiLoading(p41Var);
        p41Var.setTextSize(1, 16.0f);
        p41Var.setMaxLines(1);
        p41Var.setSingleLine();
        p41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p41Var, w7.y5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.c(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.a6.a(textView);
        addView(textView, w7.y5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? nVar = new vh.n(context);
        this.f28139f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.y5.c(-2.0f, -1);
        this.e = c10;
        addView((View) nVar, c10);
        ImageView imageView = new ImageView(context);
        this.f28140n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.a6.a(imageView);
        addView(imageView, w7.y5.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f28142s.d(this.f28141r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28136a;
        this.f28138c.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i11, d6Var))));
        int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        q41 q41Var = this.f28139f;
        q41Var.setTextColor(v03);
        q41Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        q41Var.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19367uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19384vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f28140n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i12, d6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f28137b) {
            if (this.h) {
                view = this.f28138c;
            } else {
                view = this.f28139f;
            }
            Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", this.f28136a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.h6.f19166k0;
            }
            Paint paint = T0;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f28141r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f28140n.getVisibility() == 0) {
            Layout layout = this.f28139f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f28141r && !this.h) {
            this.f28141r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f28141r = measuredHeight;
        this.f28142s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        q41 q41Var = this.f28139f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = q41Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                q41Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = q41Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                q41Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = q41Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                q41Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
