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
public final class u41 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 f28564a;
    public boolean f28565b;
    public final r41 f28566c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final s41 f28567f;
    public boolean h;
    public final ImageView f28568n;
    public int f28569r;
    public final e6 f28570s;

    public u41(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f28569r = -1;
        this.f28570s = new e6(this, 0L, 320L, qr.h);
        this.f28564a = e6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        r41 r41Var = new r41(this, context);
        this.f28566c = r41Var;
        NotificationCenter.listenEmojiLoading(r41Var);
        r41Var.setTextSize(1, 16.0f);
        r41Var.setMaxLines(1);
        r41Var.setSingleLine();
        r41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(r41Var, w7.y5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.a6.a(textView);
        addView(textView, w7.y5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? oVar = new vh.o(context);
        this.f28567f = oVar;
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setTextSize(1, 16.0f);
        oVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.y5.c(-2.0f, -1);
        this.e = c10;
        addView((View) oVar, c10);
        ImageView imageView = new ImageView(context);
        this.f28568n = imageView;
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
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f28570s.d(this.f28569r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.f28564a;
        this.f28566c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, e6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i11, e6Var))));
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, e6Var);
        s41 s41Var = this.f28567f;
        s41Var.setTextColor(v03);
        s41Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
        s41Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19384uf, e6Var));
        setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19401vf, e6Var));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, e6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f28568n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, e6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f28565b) {
            if (this.h) {
                view = this.f28566c;
            } else {
                view = this.f28567f;
            }
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.f28564a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.f19184k0;
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
        this.f28569r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f28568n.getVisibility() == 0) {
            Layout layout = this.f28567f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f28569r && !this.h) {
            this.f28569r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f28569r = measuredHeight;
        this.f28570s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        s41 s41Var = this.f28567f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = s41Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                s41Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = s41Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                s41Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = s41Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                s41Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
