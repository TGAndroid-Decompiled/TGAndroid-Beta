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
public final class q51 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.ActionBar.u6 f31838a;
    public boolean f31839b;
    public final n51 f31840c;
    public final TextView d;
    public final FrameLayout.LayoutParams e;
    public final o51 f31841f;
    public boolean h;
    public final ImageView f31842n;
    public int f31843r;
    public final h6 f31844s;

    public q51(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f31843r = -1;
        this.f31844s = new h6(this, 0L, 320L, ds.h);
        this.f31838a = u6Var;
        setClipToPadding(false);
        setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
        n51 n51Var = new n51(this, context);
        this.f31840c = n51Var;
        NotificationCenter.listenEmojiLoading(n51Var);
        n51Var.setTextSize(1, 16.0f);
        n51Var.setMaxLines(1);
        n51Var.setSingleLine();
        n51Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(n51Var, gb1.g(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setPadding(org.telegram.ui.d3.h(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
        textView.setGravity(17);
        gb1.b(textView);
        addView(textView, gb1.h(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
        ?? nVar = new xh.n(context);
        this.f31841f = nVar;
        NotificationCenter.listenEmojiLoading(nVar);
        nVar.setTextSize(1, 16.0f);
        nVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams g7 = gb1.g(-2.0f, -1);
        this.e = g7;
        addView((View) nVar, g7);
        ImageView imageView = new ImageView(context);
        this.f31842n = imageView;
        imageView.setImageResource(R.drawable.msg_copy);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Copy));
        gb1.b(imageView);
        addView(imageView, gb1.h(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23682uf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23700vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f31844s.d(this.f31843r, false));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f31839b) {
            if (this.h) {
                view = this.f31840c;
            } else {
                view = this.f31841f;
            }
            Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintDivider", this.f31838a);
            if (V0 == null) {
                V0 = org.telegram.ui.ActionBar.y6.f23478k0;
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
        this.f31843r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i11);
        if (this.f31842n.getVisibility() == 0) {
            Layout layout = this.f31841f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(makeMeasureSpec, i11);
            }
        }
        if (getMeasuredHeight() > this.f31843r && !this.h) {
            this.f31843r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f31843r = measuredHeight;
        this.f31844s.d(measuredHeight, true);
    }

    public void setHandlesColor(int i10) {
        o51 o51Var = this.f31841f;
        if (Build.VERSION.SDK_INT >= 29 && !XiaomiUtilities.isMIUI()) {
            try {
                Drawable textSelectHandleLeft = o51Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i10, mode);
                o51Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = o51Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i10, mode);
                o51Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = o51Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i10, mode);
                o51Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.f31838a;
        this.f31840c.setTextColor(org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        int i11 = org.telegram.ui.ActionBar.y6.L6;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i11, u6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(9.0f), org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i11, u6Var))));
        int w03 = org.telegram.ui.ActionBar.y6.w0(i10, u6Var);
        o51 o51Var = this.f31841f;
        o51Var.setTextColor(w03);
        o51Var.setLinkTextColor(org.telegram.ui.ActionBar.y6.w0(i11, u6Var));
        o51Var.setHighlightColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23682uf, u6Var));
        setHandlesColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23700vf, u6Var));
        int i12 = org.telegram.ui.ActionBar.y6.Oh;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f31842n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.o1(0.1f, org.telegram.ui.ActionBar.y6.w0(i12, u6Var)), 1, -1));
    }
}
