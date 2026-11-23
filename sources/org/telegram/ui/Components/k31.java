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
public final class k31 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 f36633a;
    public boolean f36634b;
    public final h31 f36635c;
    public final TextView d;
    public final FrameLayout.LayoutParams f36636e;
    public final i31 f36637f;
    public boolean h;
    public final ImageView f36638n;
    public int f36639r;
    public final c6 f36640s;

    public k31(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        int i7;
        float f10;
        this.f36639r = -1;
        this.f36640s = new c6(this, 0L, 320L, kr.h);
        this.f36633a = i6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        h31 h31Var = new h31(this, context);
        this.f36635c = h31Var;
        org.telegram.messenger.ks.i(h31Var);
        h31Var.setTextSize(1, 16.0f);
        h31Var.setMaxLines(1);
        h31Var.setSingleLine();
        h31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(h31Var, c8.na.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.m10.l(14.0f, 2131751449, 1, textView, null);
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
        c8.sa.a(textView);
        Paint.FontMetrics fontMetrics2 = h31Var.getPaint().getFontMetrics();
        h31Var.getPaint().getTextBounds("x", 0, 1, rect);
        if (h31Var.getIncludeFontPadding()) {
            f10 = fontMetrics2.top;
        } else {
            f10 = fontMetrics2.ascent;
        }
        addView(textView, c8.na.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-f10)) - org.telegram.messenger.g0.L(9.0f)) / org.telegram.messenger.g0.f24225p), 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f36637f = lVar;
        org.telegram.messenger.ks.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.na.c(-2.0f, -1);
        this.f36636e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f36638n = imageView;
        imageView.setImageResource(2131232108);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131751755, null));
        c8.sa.a(imageView);
        addView(imageView, c8.na.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29607lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29624mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f36640s.e(false, this.f36639r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f36634b) {
            if (this.h) {
                view = this.f36635c;
            } else {
                view = this.f36637f;
            }
            Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", this.f36633a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.n6.f29574k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.gd.f24314a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f36639r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f36636e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f36638n.getVisibility() == 0) {
            Layout layout = this.f36637f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f36639r && !this.h) {
            this.f36639r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f36639r = measuredHeight;
        this.f36640s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        i31 i31Var = this.f36637f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.c6.i()) {
            try {
                Drawable textSelectHandleLeft = i31Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                i31Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = i31Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                i31Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = i31Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                i31Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.f36633a;
        this.f36635c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int i10 = org.telegram.ui.ActionBar.n6.L6;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, i6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i10, i6Var))));
        int w03 = org.telegram.ui.ActionBar.n6.w0(i7, i6Var);
        i31 i31Var = this.f36637f;
        i31Var.setTextColor(w03);
        i31Var.setLinkTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        i31Var.setHighlightColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29607lg, i6Var));
        setHandlesColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29624mg, i6Var));
        int i11 = org.telegram.ui.ActionBar.n6.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f36638n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.1f, org.telegram.ui.ActionBar.n6.w0(i11, i6Var)), 1, -1));
    }
}
