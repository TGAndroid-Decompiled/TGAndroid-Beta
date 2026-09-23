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
public final class e41 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f23560a;
    public boolean f23561b;
    public final b41 f23562c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final c41 f23563f;
    public boolean h;
    public final ImageView f23564n;
    public int f23565r;
    public final e6 f23566s;

    public e41(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f23565r = -1;
        this.f23566s = new e6(this, 0L, 320L, rr.h);
        this.f23560a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        b41 b41Var = new b41(this, context);
        this.f23562c = b41Var;
        NotificationCenter.listenEmojiLoading(b41Var);
        b41Var.setTextSize(1, 16.0f);
        b41Var.setMaxLines(1);
        b41Var.setSingleLine();
        b41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(b41Var, w7.x5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.q3.b(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.z5.a(textView);
        addView(textView, w7.x5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? oVar = new vh.o(context);
        this.f23563f = oVar;
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setTextSize(1, 16.0f);
        oVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.x5.c(-2.0f, -1);
        this.e = c10;
        addView((View) oVar, c10);
        ImageView imageView = new ImageView(context);
        this.f23564n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.z5.a(imageView);
        addView(imageView, w7.x5.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f23566s.d(this.f23565r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f23560a;
        this.f23562c.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i11, d6Var))));
        int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        c41 c41Var = this.f23563f;
        c41Var.setTextColor(v03);
        c41Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        c41Var.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19109uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19126vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f23564n;
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
        if (this.f23561b) {
            if (this.h) {
                view = this.f23562c;
            } else {
                view = this.f23563f;
            }
            Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", this.f23560a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.h6.f18910k0;
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
        this.f23565r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f23564n.getVisibility() == 0) {
            Layout layout = this.f23563f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f23565r && !this.h) {
            this.f23565r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f23565r = measuredHeight;
        this.f23566s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        c41 c41Var = this.f23563f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = c41Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                c41Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = c41Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                c41Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = c41Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                c41Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
