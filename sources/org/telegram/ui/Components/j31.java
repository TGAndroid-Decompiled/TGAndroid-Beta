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
public final class j31 extends FrameLayout implements org.telegram.ui.ActionBar.w5 {
    public final org.telegram.ui.ActionBar.b6 f29618a;
    public boolean f29619b;
    public final g31 f29620c;
    public final TextView d;
    public final FrameLayout.LayoutParams f29621e;
    public final h31 f29622f;
    public boolean h;
    public final ImageView f29623n;
    public int f29624r;
    public final y5 f29625s;

    public j31(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f29624r = -1;
        this.f29625s = new y5(this, 0L, 320L, gr.h);
        this.f29618a = b6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        g31 g31Var = new g31(this, context);
        this.f29620c = g31Var;
        NotificationCenter.listenEmojiLoading(g31Var);
        g31Var.setTextSize(1, 16.0f);
        g31Var.setMaxLines(1);
        g31Var.setSingleLine();
        g31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(g31Var, g7.e6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.j2.c(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        g7.g6.a(textView);
        addView(textView, g7.e6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? uVar = new dh.u(context);
        this.f29622f = uVar;
        NotificationCenter.listenEmojiLoading(uVar);
        uVar.setTextSize(1, 16.0f);
        uVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = g7.e6.c(-2.0f, -1);
        this.f29621e = c10;
        addView((View) uVar, c10);
        ImageView imageView = new ImageView(context);
        this.f29623n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        g7.g6.a(imageView);
        addView(imageView, g7.e6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        d();
    }

    @Override
    public final void d() {
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.f29618a;
        this.f29620c.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int i10 = org.telegram.ui.ActionBar.f6.L6;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i10, b6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i10, b6Var))));
        int v03 = org.telegram.ui.ActionBar.f6.v0(i9, b6Var);
        h31 h31Var = this.f29622f;
        h31Var.setTextColor(v03);
        h31Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        h31Var.setHighlightColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23312uf, b6Var));
        setHandlesColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23325vf, b6Var));
        int i11 = org.telegram.ui.ActionBar.f6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f29623n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.f6.f0(org.telegram.ui.ActionBar.f6.l1(0.1f, org.telegram.ui.ActionBar.f6.v0(i11, b6Var)), 1, -1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f29625s.d(this.f29624r, false));
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
        if (this.f29619b) {
            if (this.h) {
                view = this.f29620c;
            } else {
                view = this.f29622f;
            }
            Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", this.f29618a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.f6.f23121k0;
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
    public final void onMeasure(int i9, int i10) {
        this.f29624r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f29621e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f29623n.getVisibility() == 0) {
            Layout layout = this.f29622f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f29624r && !this.h) {
            this.f29624r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f29624r = measuredHeight;
        this.f29625s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i9) {
        h31 h31Var = this.f29622f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = h31Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i9, mode);
                h31Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = h31Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i9, mode);
                h31Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = h31Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i9, mode);
                h31Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
