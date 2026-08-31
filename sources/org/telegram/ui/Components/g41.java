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
public final class g41 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 f27101a;
    public boolean f27102b;
    public final d41 f27103c;
    public final TextView d;
    public final FrameLayout.LayoutParams f27104e;
    public final e41 f27105f;
    public boolean h;
    public final ImageView f27106n;
    public int f27107r;
    public final z5 f27108s;

    public g41(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f27107r = -1;
        this.f27108s = new z5(this, 0L, 320L, pr.h);
        this.f27101a = g6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        d41 d41Var = new d41(this, context);
        this.f27103c = d41Var;
        NotificationCenter.listenEmojiLoading(d41Var);
        d41Var.setTextSize(1, 16.0f);
        d41Var.setMaxLines(1);
        d41Var.setSingleLine();
        d41Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(d41Var, k7.c6.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.b.e(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        k7.e6.a(textView);
        addView(textView, k7.c6.d(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? sVar = new jh.s(context);
        this.f27105f = sVar;
        NotificationCenter.listenEmojiLoading(sVar);
        sVar.setTextSize(1, 16.0f);
        sVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c3 = k7.c6.c(-2.0f, -1);
        this.f27104e = c3;
        addView((View) sVar, c3);
        ImageView imageView = new ImageView(context);
        this.f27106n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        k7.e6.a(imageView);
        addView(imageView, k7.c6.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        e();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f27108s.d(this.f27107r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.f27101a;
        this.f27103c.setTextColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.L6;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i11, g6Var);
        TextView textView = this.d;
        textView.setTextColor(v02);
        textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(i11, g6Var))));
        int v03 = org.telegram.ui.ActionBar.k6.v0(i10, g6Var);
        e41 e41Var = this.f27105f;
        e41Var.setTextColor(v03);
        e41Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        e41Var.setHighlightColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21970uf, g6Var));
        setHandlesColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21988vf, g6Var));
        int i12 = org.telegram.ui.ActionBar.k6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f27106n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.k6.f0(org.telegram.ui.ActionBar.k6.l1(0.1f, org.telegram.ui.ActionBar.k6.v0(i12, g6Var)), 1, -1));
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f27102b) {
            if (this.h) {
                view = this.f27103c;
            } else {
                view = this.f27105f;
            }
            Paint T0 = org.telegram.ui.ActionBar.k6.T0("paintDivider", this.f27101a);
            if (T0 == null) {
                T0 = org.telegram.ui.ActionBar.k6.f21779k0;
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
        this.f27107r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f27104e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f27106n.getVisibility() == 0) {
            Layout layout = this.f27105f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f27107r && !this.h) {
            this.f27107r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f27107r = measuredHeight;
        this.f27108s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        e41 e41Var = this.f27105f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = e41Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                e41Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = e41Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                e41Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = e41Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                e41Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }
}
