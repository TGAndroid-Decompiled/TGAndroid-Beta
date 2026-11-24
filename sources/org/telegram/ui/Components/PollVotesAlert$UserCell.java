package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class PollVotesAlert$UserCell extends LinearLayout implements vlb {
    public ArrayList E;
    public final ih8 F;
    public final bf0 a;
    public final lka b;
    public final TextView c;
    public final TextView d;
    public final pc0 e;
    public final d0b f;
    public TLRPC.User h;
    public TLRPC.Chat n;
    public CharSequence r;
    public boolean s;
    public int w;
    public boolean x;
    public float y;

    public PollVotesAlert$UserCell(ih8 ih8Var, Context context) {
        super(context);
        this.F = ih8Var;
        this.y = 1.0f;
        setOrientation(0);
        setLayoutDirection(3);
        setWillNotDraw(false);
        setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(18.0f));
        addView(bf0Var, qoe.t(34, 34, 16, 0, 0, 11, 0));
        lka lkaVar = new lka(context);
        this.b = lkaVar;
        int i = cmb.i5;
        anb.W(lkaVar, i, null);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        lkaVar.setGravity((jb6.a0 ? 5 : 3) | 16);
        addView(lkaVar, qoe.q(0, 24, 1.0f, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.c = textView;
        anb.X(textView, cmb.q5, null);
        textView.setTextSize(1, 13.0f);
        addView(textView, qoe.q(-2, -2, 0.0f, 21, 4, 0, 2, 0));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        anb.X(textView2, i, null);
        textView2.setTextSize(1, 13.0f);
        addView(textView2, qoe.q(-2, -2, 0.0f, 21, 2, 0, 4, 0));
        this.f = new d0b(20, lkaVar);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.y9));
    }

    public float getPlaceholderAlpha() {
        return this.y;
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.a.a();
    }

    @Override
    public final void onDetachedFromWindow() {
        this.f.a.b();
        super.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredHeight;
        int L;
        int L2;
        int L3;
        int L4;
        int i;
        ih8 ih8Var = this.F;
        RectF rectF = ih8Var.G1;
        Paint paint = ih8Var.A1;
        float f = 0.0f;
        if (this.x || this.y != 0.0f) {
            paint.setAlpha((int) (this.y * 255.0f));
            bf0 bf0Var = this.a;
            canvas.drawCircle((bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft(), (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop(), bf0Var.getMeasuredWidth() / 2, paint);
            if (this.w % 2 == 0) {
                L = gm.L(65.0f);
                L2 = gm.L(48.0f);
            } else {
                L = gm.L(65.0f);
                L2 = gm.L(60.0f);
            }
            if (jb6.a0) {
                L = (getMeasuredWidth() - L) - L2;
            }
            rectF.set(L, measuredHeight - gm.L(4.0f), L + L2, gm.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
            if (this.w % 2 == 0) {
                L3 = gm.L(119.0f);
                L4 = gm.L(60.0f);
            } else {
                L3 = gm.L(131.0f);
                L4 = gm.L(80.0f);
            }
            if (jb6.a0) {
                L3 = (getMeasuredWidth() - L3) - L4;
            }
            rectF.set(L3, measuredHeight - gm.L(4.0f), L3 + L4, gm.L(4.0f) + measuredHeight);
            canvas.drawRoundRect(rectF, gm.L(4.0f), gm.L(4.0f), paint);
        }
        if (this.s) {
            if (!jb6.a0) {
                f = gm.L(64.0f);
            }
            float f2 = f;
            float measuredHeight2 = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(64.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f2, measuredHeight2, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f) + (this.s ? 1 : 0), 1073741824));
    }

    public void setPlaceholderAlpha(float f) {
        this.y = f;
        invalidate();
    }

    @Override
    public final void updateColors() {
        boolean z;
        d0b d0bVar = this.f;
        if (d0bVar != null) {
            try {
                tm tmVar = d0bVar.a;
                if (tmVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && tmVar.G != null) {
                    int i = cmb.y9;
                    ih8 ih8Var = this.F;
                    pn pnVar = ih8.L1;
                    tmVar.k(Integer.valueOf(cmb.v0(i, ih8Var.J0)));
                    lka lkaVar = this.b;
                    if (lkaVar != null) {
                        lkaVar.invalidate();
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
