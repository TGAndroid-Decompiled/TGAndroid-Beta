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
public final class s41 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 f26945a;
    public boolean f26946b;
    public final p41 f26947c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final q41 f26948f;
    public boolean h;
    public final ImageView f26949n;
    public int f26950r;
    public final d6 f26951s;

    public s41(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26950r = -1;
        this.f26951s = new d6(this, 0L, 320L, wr.h);
        this.f26945a = f6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        p41 p41Var = new p41(this, context);
        this.f26947c = p41Var;
        NotificationCenter.listenEmojiLoading(p41Var);
        p41Var.setTextSize(1, 16.0f);
        p41Var.setMaxLines(1);
        p41Var.setSingleLine();
        p41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(p41Var, w7.a6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.r6.b(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.c6.a(textView);
        addView(textView, w7.a6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? oVar = new uh.o(context);
        this.f26948f = oVar;
        NotificationCenter.listenEmojiLoading(oVar);
        oVar.setTextSize(1, 16.0f);
        oVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.a6.c(-2.0f, -1);
        this.e = c10;
        addView((View) oVar, c10);
        ImageView imageView = new ImageView(context);
        this.f26949n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.c6.a(imageView);
        addView(imageView, w7.a6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f26951s.d(this.f26950r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.f26945a;
        this.f26947c.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.L6;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i11, f6Var))));
        int v03 = org.telegram.ui.ActionBar.j6.v0(i10, f6Var);
        q41 q41Var = this.f26948f;
        q41Var.setTextColor(v03);
        q41Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        q41Var.setHighlightColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18245uf, f6Var));
        setHandlesColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.vf, f6Var));
        int i12 = org.telegram.ui.ActionBar.j6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f26949n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(org.telegram.ui.ActionBar.j6.l1(0.1f, org.telegram.ui.ActionBar.j6.v0(i12, f6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f26946b) {
            if (this.h) {
                view = this.f26947c;
            } else {
                view = this.f26948f;
            }
            Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", this.f26945a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.j6.f18049k0;
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
        this.f26950r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f26949n.getVisibility() == 0) {
            Layout layout = this.f26948f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f26950r && !this.h) {
            this.f26950r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f26950r = measuredHeight;
        this.f26951s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        q41 q41Var = this.f26948f;
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
