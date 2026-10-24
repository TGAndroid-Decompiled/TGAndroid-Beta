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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.XiaomiUtilities;
public final class i51 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f27298a;
    public boolean f27299b;
    public final f51 f27300c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final g51 f27301f;
    public boolean h;
    public final ImageView f27302n;
    public int f27303r;
    public final d6 f27304s;

    public i51(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f27303r = -1;
        this.f27304s = new d6(this, 0L, 320L, zr.h);
        this.f27298a = g6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        f51 f51Var = new f51(this, context);
        this.f27300c = f51Var;
        NotificationCenter.listenEmojiLoading(f51Var);
        f51Var.setTextSize(1, 16.0f);
        f51Var.setMaxLines(1);
        f51Var.setSingleLine();
        f51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(f51Var, w7.z5.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.Cells.b1.e(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        w7.b6.a(textView);
        addView(textView, w7.z5.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? nVar = new wh.n(context);
        this.f27301f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = w7.z5.c(-2.0f, -1);
        this.e = c10;
        addView((View) nVar, c10);
        ImageView imageView = new ImageView(context);
        this.f27302n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        w7.b6.a(imageView);
        addView(imageView, w7.z5.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21508uf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21526vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f27304s.d(this.f27303r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f27299b) {
            if (this.h) {
                view = this.f27300c;
            } else {
                view = this.f27301f;
            }
            Paint V0 = org.telegram.ui.ActionBar.k6.V0("paintDivider", this.f27298a);
            if (V0 == null) {
                V0 = org.telegram.ui.ActionBar.k6.f21305k0;
            }
            Paint paint = V0;
            if (LocaleController.isRTL) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f27303r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f27302n.getVisibility() == 0) {
            Layout layout = this.f27301f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f27303r && !this.h) {
            this.f27303r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f27303r = measuredHeight;
        this.f27304s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        g51 g51Var = this.f27301f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = g51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                g51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = g51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                g51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = g51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                g51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f27298a;
        this.f27300c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.L6;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i11, g6Var))));
        int w03 = org.telegram.ui.ActionBar.k6.w0(i10, g6Var);
        g51 g51Var = this.f27301f;
        g51Var.setTextColor(w03);
        g51Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
        g51Var.setHighlightColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21508uf, g6Var));
        setHandlesColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21526vf, g6Var));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i12, g6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f27302n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i12, g6Var)), 1, -1));
    }
}
