package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class j31 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f36319a;
    public boolean f36320b;
    public final g31 f36321c;
    public final TextView d;
    public final FrameLayout.LayoutParams f36322e;
    public final h31 f36323f;
    public boolean h;
    public final ImageView f36324n;
    public int f36325r;
    public final c6 f36326s;

    public j31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        float f10;
        this.f36325r = -1;
        this.f36326s = new c6(this, 0L, 320L, lr.h);
        this.f36319a = i6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        g31 g31Var = new g31(this, context);
        this.f36321c = g31Var;
        org.telegram.messenger.ks.i(g31Var);
        g31Var.setTextSize(1, 16.0f);
        g31Var.setMaxLines(1);
        g31Var.setSingleLine();
        g31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(g31Var, c8.ma.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.n10.l(14.0f, 2131751450, 1, textView, null);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        Rect rect = new Rect();
        Paint.FontMetrics fontMetrics = textView.getPaint().getFontMetrics();
        textView.getPaint().getTextBounds("x", 0, 1, rect);
        float f11 = (rect.top / 2.0f) - ((fontMetrics.ascent + fontMetrics.descent) / 2.0f);
        int round = Math.round(Math.abs(f11) * 2.0f);
        int L = org.telegram.messenger.g0.L(8.0f);
        if (f11 < 0.0f) {
            i7 = round;
        } else {
            i7 = 0;
        }
        textView.setPadding(L, i7, org.telegram.messenger.g0.L(8.0f), f11 <= 0.0f ? 0 : round);
        c8.ra.a(textView);
        Paint.FontMetrics fontMetrics2 = g31Var.getPaint().getFontMetrics();
        g31Var.getPaint().getTextBounds("x", 0, 1, rect);
        if (g31Var.getIncludeFontPadding()) {
            f10 = fontMetrics2.top;
        } else {
            f10 = fontMetrics2.ascent;
        }
        addView(textView, c8.ma.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-f10)) - org.telegram.messenger.g0.L(9.0f)) / org.telegram.messenger.g0.f24117p), 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f36323f = lVar;
        org.telegram.messenger.ks.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.ma.c(-2.0f, -1);
        this.f36322e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f36324n = imageView;
        imageView.setImageResource(2131232105);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131751756, null));
        c8.ra.a(imageView);
        addView(imageView, c8.ma.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29550lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29567mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f36326s.e(false, this.f36325r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f36320b) {
            if (this.h) {
                view = this.f36321c;
            } else {
                view = this.f36323f;
            }
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.f36319a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.f29517k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.gd.f24213a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f36325r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f36322e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f36324n.getVisibility() == 0) {
            Layout layout = this.f36323f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f36325r && !this.h) {
            this.f36325r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f36325r = measuredHeight;
        this.f36326s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        h31 h31Var = this.f36323f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.c6.i()) {
            try {
                Drawable textSelectHandleLeft = h31Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                h31Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = h31Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                h31Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = h31Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                h31Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36319a;
        this.f36321c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int i10 = org.telegram.ui.ActionBar.n6.L6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var))));
        int w03 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        h31 h31Var = this.f36323f;
        h31Var.setTextColor(w03);
        h31Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        h31Var.setHighlightColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29550lg, i6Var));
        setHandlesColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29567mg, i6Var));
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f36324n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)), 1, -1));
    }
}
