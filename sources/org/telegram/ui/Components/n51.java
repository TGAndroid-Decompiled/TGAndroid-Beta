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
public final class n51 extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 f28959a;
    public boolean f28960b;
    public final k51 f28961c;
    public final TextView d;
    public final FrameLayout.LayoutParams f28962e;
    public final l51 f28963f;
    public boolean h;
    public final ImageView f28964n;
    public int f28965r;
    public final g6 f28966s;

    public n51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f28965r = -1;
        this.f28966s = new g6(this, 0L, 320L, is.h);
        this.f28959a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        k51 k51Var = new k51(this, context);
        this.f28961c = k51Var;
        NotificationCenter.listenEmojiLoading(k51Var);
        k51Var.setTextSize(1, 16.0f);
        k51Var.setMaxLines(1);
        k51Var.setSingleLine();
        k51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(k51Var, w7.x5.d(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.b(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.z5.a(textView);
        addView(textView, w7.x5.a(18.0f, 0.0f, 1.0f, 0.0f, 0.0f, -2, 53));
        ?? nVar = new vh.n(context);
        this.f28963f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams d = w7.x5.d(-2.0f, -1);
        this.f28962e = d;
        addView((View) nVar, d);
        ImageView imageView = new ImageView(context);
        this.f28964n = imageView;
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
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f28966s.d(this.f28965r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f28959a;
        this.f28961c.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.L6;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i11, d6Var))));
        int w03 = org.telegram.ui.ActionBar.h6.w0(i10, d6Var);
        l51 l51Var = this.f28963f;
        l51Var.setTextColor(w03);
        l51Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        l51Var.setHighlightColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21109uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21126vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f28964n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.m1(0.1f, org.telegram.ui.ActionBar.h6.w0(i12, d6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f28960b) {
            if (this.h) {
                view = this.f28961c;
            } else {
                view = this.f28963f;
            }
            Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", this.f28959a);
            if (U0 == null) {
                U0 = org.telegram.ui.ActionBar.h6.f20908k0;
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
        this.f28965r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f28962e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f28964n.getVisibility() == 0) {
            Layout layout = this.f28963f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f28965r && !this.h) {
            this.f28965r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f28965r = measuredHeight;
        this.f28966s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        l51 l51Var = this.f28963f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = l51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                l51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = l51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                l51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = l51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                l51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
