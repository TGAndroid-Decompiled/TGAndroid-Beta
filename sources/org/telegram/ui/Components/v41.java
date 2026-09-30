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
public final class v41 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f29030a;
    public boolean f29031b;
    public final s41 f29032c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final t41 f29033f;
    public boolean h;
    public final ImageView f29034n;
    public int f29035r;
    public final e6 f29036s;

    public v41(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f29035r = -1;
        this.f29036s = new e6(this, 0L, 320L, tr.h);
        this.f29030a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        s41 s41Var = new s41(this, context);
        this.f29032c = s41Var;
        NotificationCenter.listenEmojiLoading(s41Var);
        s41Var.setTextSize(1, 16.0f);
        s41Var.setMaxLines(1);
        s41Var.setSingleLine();
        s41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(s41Var, w7.y5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.c(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.a6.a(textView);
        addView(textView, w7.y5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? nVar = new vh.n(context);
        this.f29033f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.y5.c(-2.0f, -1);
        this.e = c10;
        addView((View) nVar, c10);
        ImageView imageView = new ImageView(context);
        this.f29034n = imageView;
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
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f29036s.d(this.f29035r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f29030a;
        this.f29032c.setTextColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.l1(0.1f, org.telegram.ui.ActionBar.h6.v0(i11, d6Var))));
        int v03 = org.telegram.ui.ActionBar.h6.v0(i10, d6Var);
        t41 t41Var = this.f29033f;
        t41Var.setTextColor(v03);
        t41Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        t41Var.setHighlightColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19398uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19415vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f29034n;
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
        if (this.f29031b) {
            if (this.h) {
                view = this.f29032c;
            } else {
                view = this.f29033f;
            }
            Paint T0 = org.telegram.ui.ActionBar.h6.T0("paintDivider", this.f29030a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.h6.f19197k0;
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
        this.f29035r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f29034n.getVisibility() == 0) {
            Layout layout = this.f29033f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f29035r && !this.h) {
            this.f29035r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f29035r = measuredHeight;
        this.f29036s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        t41 t41Var = this.f29033f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = t41Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                t41Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = t41Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                t41Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = t41Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                t41Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
