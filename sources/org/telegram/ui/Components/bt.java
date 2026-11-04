package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Stack;
public abstract class bt extends EditText {
    public static Boolean f32381a0;
    public int E;
    public l5 F;
    public PorterDuffColorFilter G;
    public boolean H;
    public Layout I;
    public int J;
    public zs K;
    public Rect L;
    public boolean M;
    public int N;
    public Integer O;
    public float P;
    public boolean Q;
    public va0 R;
    public int S;
    public int T;
    public boolean[] U;
    public boolean V;
    public boolean W;
    public ArrayList f32382a;
    public Stack f32383b;
    public ArrayList f32384c;
    public boolean d;
    public boolean f32385e;
    public df.c f32386f;
    public boolean h;
    public Path f32387n;
    public int f32388r;
    public int f32389s;
    public float f32390w;
    public float f32391x;
    public boolean f32392y;

    public final void d() {
        CharSequence charSequence;
        uy0[] uy0VarArr;
        int i3;
        int i10;
        zs zsVar = this.K;
        if (getLayout() != null) {
            charSequence = getLayout().getText();
        } else {
            charSequence = null;
        }
        boolean z10 = false;
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            for (uy0 uy0Var : (uy0[]) spannable.getSpans(0, spannable.length(), uy0.class)) {
                int spanStart = spannable.getSpanStart(uy0Var);
                int spanEnd = spannable.getSpanEnd(uy0Var);
                if (uy0Var.c() && ((spanStart > (i3 = this.f32388r) && spanEnd < this.f32389s) || ((i3 > spanStart && i3 < spanEnd) || ((i10 = this.f32389s) > spanStart && i10 < spanEnd)))) {
                    removeCallbacks(zsVar);
                    this.f32392y = false;
                    z10 = true;
                    break;
                }
            }
        }
        if (this.d && !z10 && !this.f32392y) {
            this.f32392y = true;
            postDelayed(zsVar, 10000L);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        xg0 xg0Var;
        boolean z12;
        df.c cVar;
        int paddingTop = getPaddingTop() - getScrollY();
        ArrayList arrayList = this.f32384c;
        if (arrayList == null) {
            z10 = false;
        } else {
            int size = arrayList.size();
            z10 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                tg0 tg0Var = (tg0) obj;
                e0.g gVar = tg0Var.f38412e.K;
                if (tg0Var.b() && tg0Var.f38414g.contains(motionEvent.getX(), motionEvent.getY() - paddingTop)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (motionEvent.getAction() == 0) {
                    if (gVar != null) {
                        gVar.g(z11);
                    }
                } else if (motionEvent.getAction() == 1) {
                    if (gVar != null && gVar.f9235c && z11) {
                        tg0Var.f38412e.f40357e = !xg0Var.f40357e;
                        g(true);
                        z10 = true;
                    }
                    if (gVar != null) {
                        gVar.g(false);
                    }
                } else if (motionEvent.getAction() == 3 && gVar != null) {
                    gVar.g(false);
                }
                if ((gVar != null && gVar.f9235c) || z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
        }
        if (!z10) {
            if (this.f32385e && (cVar = this.f32386f) != null && ((GestureDetector) ((y00) cVar.d).f40562a).onTouchEvent(motionEvent)) {
                if (motionEvent.getActionMasked() == 1) {
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                }
                z12 = true;
            } else {
                z12 = false;
            }
            if (!super.dispatchTouchEvent(motionEvent) && !z12) {
                return false;
            }
        }
        return true;
    }

    public int e() {
        return g5.f();
    }

    public final void f() {
        uy0[] uy0VarArr;
        Editable text = getText();
        if (text != null) {
            for (uy0 uy0Var : (uy0[]) text.getSpans(0, text.length(), uy0.class)) {
                if (uy0Var.c()) {
                    boolean z10 = this.d;
                    ty0 ty0Var = uy0Var.f38912b;
                    if (z10) {
                        ty0Var.f38578a |= 512;
                    } else {
                        ty0Var.f38578a &= -513;
                    }
                }
            }
        }
        h();
    }

    public final void g(boolean z10) {
        int i3;
        if (this.V) {
            this.W = true;
            return;
        }
        int i10 = 0;
        if (getLayout() != null && getLayout().getText() != null) {
            i3 = getLayout().getText().length();
        } else {
            i3 = 0;
        }
        if (z10 || this.S != i3) {
            this.T = 2;
            this.S = i3;
        }
        if (this.T > 0) {
            if (this.U == null) {
                this.U = new boolean[1];
            }
            this.U[0] = false;
            this.W = false;
            this.V = true;
            this.f32384c = xg0.d(this, getLayout(), this.f32384c, this.U);
            if (this.W) {
                this.f32384c = xg0.d(this, getLayout(), this.f32384c, this.U);
            }
            this.V = false;
            this.W = false;
            if (this.U[0]) {
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            this.T--;
            if (getLayout() != null && getLayout().getText() != null) {
                i10 = getLayout().getText().length();
            }
            this.S = i10;
        }
    }

    public float getOffsetY() {
        return this.P;
    }

    public CharSequence getTextToUse() {
        Editable text = getText();
        if (text == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        vg0[] vg0VarArr = (vg0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), vg0.class);
        for (int length = vg0VarArr.length - 1; length >= 0; length--) {
            vg0 vg0Var = vg0VarArr[length];
            int spanStart = spannableStringBuilder.getSpanStart(vg0Var);
            int spanEnd = spannableStringBuilder.getSpanEnd(vg0Var);
            spannableStringBuilder.removeSpan(vg0Var);
            spannableStringBuilder.delete(spanStart, spanEnd);
        }
        return spannableStringBuilder;
    }

    public final void h() {
        l5 l5Var;
        l5 l5Var2;
        Stack stack = this.f32383b;
        ArrayList arrayList = this.f32382a;
        if (arrayList == null) {
            return;
        }
        stack.addAll(arrayList);
        arrayList.clear();
        if (this.d) {
            invalidate();
            return;
        }
        Layout layout = getLayout();
        if (layout != null && (layout.getText() instanceof Spannable)) {
            if (this.H && (l5Var2 = this.F) != null) {
                ArrayList arrayList2 = l5Var2.f35600a;
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    ((k5) arrayList2.get(i3)).d.recordPositions = false;
                }
            }
            ArrayList arrayList3 = this.f32384c;
            int i10 = yh.f.A;
            int measuredWidth = getMeasuredWidth();
            Layout layout2 = getLayout();
            if (measuredWidth <= 0) {
                measuredWidth = -2;
            }
            yh.f.a(this, layout2, 0, measuredWidth, (Spanned) getText(), stack, arrayList, arrayList3);
            if (this.H && (l5Var = this.F) != null) {
                ArrayList arrayList4 = l5Var.f35600a;
                for (int i11 = 0; i11 < arrayList4.size(); i11++) {
                    ((k5) arrayList4.get(i11)).d.recordPositions = true;
                }
            }
        }
        invalidate();
    }

    public final void i(yh.f fVar, float f10, float f11) {
        if (!this.d) {
            this.f32390w = f10;
            this.f32391x = f11;
            this.f32392y = false;
            removeCallbacks(this.K);
            j(true, false);
            fVar.f59521q = new ys(this, 0);
            float sqrt = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
            ArrayList arrayList = this.f32382a;
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((yh.f) obj).j(f10, f11, sqrt, false);
            }
        }
    }

    public final void j(boolean z10, boolean z11) {
        uy0[] uy0VarArr;
        this.d = z10;
        Editable text = getText();
        if (text != null) {
            for (uy0 uy0Var : (uy0[]) text.getSpans(0, text.length(), uy0.class)) {
                if (uy0Var.c()) {
                    ty0 ty0Var = uy0Var.f38912b;
                    if (z10) {
                        ty0Var.f38578a |= 512;
                    } else {
                        ty0Var.f38578a &= -513;
                    }
                }
            }
        }
        this.h = true;
        setText(text, TextView.BufferType.EDITABLE);
        setSelection(this.f32388r, this.f32389s);
        this.h = false;
        if (z11) {
            h();
        }
    }

    public final void k(boolean z10) {
        int i3;
        if (this.H) {
            if (getLayout() != null && getLayout().getText() != null) {
                i3 = getLayout().getText().length();
            } else {
                i3 = 0;
            }
            if (!z10 && this.I == getLayout() && this.J == i3) {
                return;
            }
            this.F = p5.update(e(), this, this.F, getLayout());
            this.I = getLayout();
            this.J = i3;
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        k(true);
        g(false);
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K);
        p5.release(this, this.F);
    }

    @Override
    public void onDraw(Canvas canvas) {
        Path path;
        ArrayList arrayList;
        int color;
        boolean z10 = this.Q;
        Rect rect = this.L;
        Path path2 = this.f32387n;
        ArrayList arrayList2 = this.f32382a;
        canvas.save();
        if (this.M && getScrollY() != 0) {
            canvas.clipRect(-org.telegram.messenger.g0.L(3.0f), (getScrollY() - super.getExtendedPaddingTop()) - this.P, getMeasuredWidth(), ((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P);
        }
        int paddingLeft = getPaddingLeft();
        int i3 = 0;
        if (!arrayList2.isEmpty()) {
            path2.rewind();
            int size = arrayList2.size();
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                Rect bounds = ((yh.f) arrayList2.get(i10)).getBounds();
                path2.addRect(bounds.left + paddingLeft, bounds.top, bounds.right + paddingLeft, bounds.bottom, Path.Direction.CW);
                i10 = i11;
            }
            path = path2;
            canvas.clipPath(path, Region.Op.DIFFERENCE);
        } else {
            path = path2;
        }
        g(false);
        for (int i12 = 0; i12 < this.f32384c.size(); i12++) {
            int width = getWidth();
            int i13 = this.E;
            getPaint();
            ((tg0) this.f32384c.get(i12)).a(canvas, width, i13);
        }
        k(false);
        if (z10) {
            if (this.R == null) {
                this.R = new Canvas();
            }
            va0 va0Var = this.R;
            va0Var.f39057a = canvas;
            super.onDraw(va0Var);
        } else {
            super.onDraw(canvas);
        }
        if (this.H && this.F != null) {
            canvas.save();
            canvas.translate(getPaddingLeft(), 0.0f);
            arrayList = arrayList2;
            p5.drawAnimatedEmojis(canvas, getLayout(), this.F, 0.0f, arrayList, computeVerticalScrollOffset() - org.telegram.messenger.g0.L(6.0f), computeVerticalScrollOffset() + computeVerticalScrollExtent(), 0.0f, 1.0f, this.G);
            canvas.restore();
        } else {
            arrayList = arrayList2;
        }
        canvas.restore();
        if (!arrayList.isEmpty()) {
            yh.f fVar = (yh.f) arrayList.get(0);
            if (fVar.f59517m > 0.0f && fVar.f59518n > 0.0f) {
                canvas.save();
                canvas.clipPath(path);
                path.rewind();
                ((yh.f) arrayList.get(0)).e(path);
                canvas.clipPath(path);
                canvas.translate(0.0f, -getPaddingTop());
                if (z10) {
                    if (this.R == null) {
                        this.R = new Canvas();
                    }
                    va0 va0Var2 = this.R;
                    va0Var2.f39057a = canvas;
                    super.onDraw(va0Var2);
                } else {
                    super.onDraw(canvas);
                }
                canvas.restore();
            }
            rect.set(0, (int) ((getScrollY() - super.getExtendedPaddingTop()) - this.P), getWidth(), (int) (((getScrollY() + getMeasuredHeight()) + super.getExtendedPaddingBottom()) - this.P));
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(paddingLeft, 0.0f);
            int size2 = arrayList.size();
            while (i3 < size2) {
                Object obj = arrayList.get(i3);
                i3++;
                yh.f fVar2 = (yh.f) obj;
                Rect bounds2 = fVar2.getBounds();
                int i14 = rect.top;
                int i15 = bounds2.bottom;
                if ((i14 <= i15 && rect.bottom >= bounds2.top) || (bounds2.top <= rect.bottom && i15 >= i14)) {
                    if (fVar2.f59528y) {
                        color = this.E;
                    } else {
                        color = getPaint().getColor();
                    }
                    fVar2.h(color);
                    fVar2.draw(canvas);
                }
            }
            canvas.restore();
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        g(false);
    }

    @Override
    public void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        if (this.h) {
            return;
        }
        this.f32388r = i3;
        this.f32389s = i10;
        d();
    }

    @Override
    public void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        f();
    }

    @Override
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bt.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void setClipToPadding(boolean z10) {
        this.M = z10;
    }

    public void setEmojiColor(Integer num) {
        int intValue;
        this.O = num;
        if (num == null) {
            intValue = this.N;
        } else {
            intValue = num.intValue();
        }
        this.G = new PorterDuffColorFilter(intValue, PorterDuff.Mode.SRC_IN);
        invalidate();
    }

    public void setOffsetY(float f10) {
        this.P = f10;
        invalidate();
    }

    public void setShouldRevealSpoilersByTouch(boolean z10) {
        this.f32385e = z10;
    }

    @Override
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (!this.h) {
            this.d = false;
            Stack stack = this.f32383b;
            if (stack != null) {
                stack.clear();
            }
        }
        super.setText(charSequence, bufferType);
    }

    @Override
    public void setTextColor(int i3) {
        this.N = i3;
        super.setTextColor(i3);
        Integer num = this.O;
        if (num != null) {
            i3 = num.intValue();
        }
        this.G = new PorterDuffColorFilter(i3, PorterDuff.Mode.SRC_IN);
    }
}
