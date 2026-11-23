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
public final class l31 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 f37047a;
    public boolean f37048b;
    public final i31 f37049c;
    public final TextView d;
    public final FrameLayout.LayoutParams f37050e;
    public final j31 f37051f;
    public boolean h;
    public final ImageView f37052n;
    public int f37053r;
    public final d6 f37054s;

    public l31(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        float f10;
        this.f37053r = -1;
        this.f37054s = new d6(this, 0L, 320L, nr.h);
        this.f37047a = h6Var;
        setClipToPadding(false);
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(20.0f), org.telegram.messenger.g0.L(16.0f));
        i31 i31Var = new i31(this, context);
        this.f37049c = i31Var;
        org.telegram.messenger.ls.i(i31Var);
        i31Var.setTextSize(1, 16.0f);
        i31Var.setMaxLines(1);
        i31Var.setSingleLine();
        i31Var.setEllipsize(TextUtils.TruncateAt.END);
        addView(i31Var, c8.na.c(-2.0f, -1));
        TextView textView = new TextView(context);
        this.d = textView;
        org.telegram.messenger.o10.l(14.0f, 2131751449, 1, textView, null);
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
        Paint.FontMetrics fontMetrics2 = i31Var.getPaint().getFontMetrics();
        i31Var.getPaint().getTextBounds("x", 0, 1, rect);
        if (i31Var.getIncludeFontPadding()) {
            f10 = fontMetrics2.top;
        } else {
            f10 = fontMetrics2.ascent;
        }
        addView(textView, c8.na.d(-2, 18.0f, 53, 0.0f, Math.max(0.0f, (((rect.top / 2.0f) + (-f10)) - org.telegram.messenger.g0.L(9.0f)) / org.telegram.messenger.g0.f24009p), 0.0f, 0.0f));
        ?? lVar = new xh.l(context);
        this.f37051f = lVar;
        org.telegram.messenger.ls.i(lVar);
        lVar.setTextSize(1, 16.0f);
        lVar.setTextIsSelectable(true);
        FrameLayout.LayoutParams c10 = c8.na.c(-2.0f, -1);
        this.f37050e = c10;
        addView((View) lVar, c10);
        ImageView imageView = new ImageView(context);
        this.f37052n = imageView;
        imageView.setImageResource(2131232105);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131751755, null));
        c8.sa.a(imageView);
        addView(imageView, c8.na.d(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
        imageView.setVisibility(8);
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29503lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29520mg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), this.f37054s.e(false, this.f37053r));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        View view;
        super.onDraw(canvas);
        if (this.f37048b) {
            if (this.h) {
                view = this.f37049c;
            } else {
                view = this.f37051f;
            }
            Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", this.f37047a);
            if (W0 == null) {
                W0 = org.telegram.ui.ActionBar.m6.f29470k0;
            }
            Paint paint = W0;
            if (org.telegram.messenger.hd.f24408a0) {
                canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
            } else {
                canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
            }
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        this.f37053r = getMeasuredHeight();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824);
        FrameLayout.LayoutParams layoutParams = this.f37050e;
        layoutParams.bottomMargin = 0;
        super.onMeasure(makeMeasureSpec, i10);
        if (this.f37052n.getVisibility() == 0) {
            Layout layout = this.f37051f.getLayout();
            if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - org.telegram.messenger.g0.L(42.0f)) {
                layoutParams.bottomMargin = org.telegram.messenger.g0.L(26.0f);
                super.onMeasure(makeMeasureSpec, i10);
            }
        }
        if (getMeasuredHeight() > this.f37053r && !this.h) {
            this.f37053r = getMeasuredHeight();
            invalidate();
            return;
        }
        int measuredHeight = getMeasuredHeight();
        this.f37053r = measuredHeight;
        this.f37054s.e(true, measuredHeight);
    }

    public void setHandlesColor(int i7) {
        j31 j31Var = this.f37051f;
        if (Build.VERSION.SDK_INT >= 29 && !org.telegram.messenger.c6.i()) {
            try {
                Drawable textSelectHandleLeft = j31Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i7, mode);
                j31Var.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = j31Var.getTextSelectHandle();
                textSelectHandle.setColorFilter(i7, mode);
                j31Var.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = j31Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i7, mode);
                j31Var.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.f37047a;
        this.f37049c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        int i10 = org.telegram.ui.ActionBar.m6.L6;
        int w02 = org.telegram.ui.ActionBar.m6.w0(i10, h6Var);
        TextView textView = this.d;
        textView.setTextColor(w02);
        textView.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(9.0f), org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i10, h6Var))));
        int w03 = org.telegram.ui.ActionBar.m6.w0(i7, h6Var);
        j31 j31Var = this.f37051f;
        j31Var.setTextColor(w03);
        j31Var.setLinkTextColor(org.telegram.ui.ActionBar.m6.w0(i10, h6Var));
        j31Var.setHighlightColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29503lg, h6Var));
        setHandlesColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29520mg, h6Var));
        int i11 = org.telegram.ui.ActionBar.m6.Fi;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i11, h6Var), PorterDuff.Mode.SRC_IN);
        ImageView imageView = this.f37052n;
        imageView.setColorFilter(porterDuffColorFilter);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.1f, org.telegram.ui.ActionBar.m6.w0(i11, h6Var)), 1, -1));
    }
}
