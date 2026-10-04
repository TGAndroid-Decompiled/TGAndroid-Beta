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
public final class d51 extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 f25564a;
    public boolean f25565b;
    public final a51 f25566c;
    public final TextView d;
    public final FrameLayout.LayoutParams f25567e;
    public final b51 f25568f;
    public boolean h;
    public final ImageView f25569n;
    public int f25570r;
    public final e6 f25571s;

    public d51(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25570r = -1;
        this.f25571s = new e6(this, 0L, 320L, tr.h);
        this.f25564a = d6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        a51 a51Var = new a51(this, context);
        this.f25566c = a51Var;
        NotificationCenter.listenEmojiLoading(a51Var);
        a51Var.setTextSize(1, 16.0f);
        a51Var.setMaxLines(1);
        a51Var.setSingleLine();
        a51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(a51Var, w7.z5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.c1.d(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.b6.a(textView);
        addView(textView, w7.z5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? nVar = new vh.n(context);
        this.f25568f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.z5.c(-2.0f, -1);
        this.f25567e = c10;
        addView((View) nVar, c10);
        ImageView imageView = new ImageView(context);
        this.f25569n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.b6.a(imageView);
        addView(imageView, w7.z5.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f25571s.d(this.f25570r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        org.telegram.ui.ActionBar.d6 d6Var = this.f25564a;
        this.f25566c.setTextColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.L6;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i11, d6Var))));
        int v03 = org.telegram.ui.ActionBar.i6.v0(i10, d6Var);
        b51 b51Var = this.f25568f;
        b51Var.setTextColor(v03);
        b51Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
        b51Var.setHighlightColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21148uf, d6Var));
        setHandlesColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21165vf, d6Var));
        int i12 = org.telegram.ui.ActionBar.i6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f25569n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(org.telegram.ui.ActionBar.i6.l1(0.1f, org.telegram.ui.ActionBar.i6.v0(i12, d6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f25565b) {
            if (this.h) {
                view = this.f25566c;
            } else {
                view = this.f25568f;
            }
            Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", this.f25564a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.i6.f20945k0;
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
        this.f25570r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f25567e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f25569n.getVisibility() == 0) {
            Layout layout = this.f25568f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f25570r && !this.h) {
            this.f25570r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f25570r = measuredHeight;
        this.f25571s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        b51 b51Var = this.f25568f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = b51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                b51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = b51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                b51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = b51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                b51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
