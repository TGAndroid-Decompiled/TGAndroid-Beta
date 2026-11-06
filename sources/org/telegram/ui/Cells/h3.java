package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;
public abstract class h3 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public boolean f29247a;
    public final f3 f29248b;
    public final org.telegram.ui.ActionBar.f6 f29249c;
    public final int d;
    public boolean f29250e;
    public int f29251f;
    public boolean h;
    public boolean f29252n;
    public boolean f29253r;
    public boolean f29254s;
    public final org.telegram.ui.Components.z4 f29255w;
    public int f29256x;
    public final org.telegram.ui.Components.i6 f29257y;

    public h3(Context context, rt0 rt0Var, String str, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f29251f = -1;
        this.f29253r = true;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.f29257y = i6Var;
        i6Var.n(0.2f, 160L, xq.h);
        i6Var.w(org.telegram.messenger.g0.L(15.33f));
        i6Var.f34516b = 5;
        this.d = i7;
        f3 f3Var = new f3(this, context, rt0Var, f6Var, z9);
        this.f29248b = f3Var;
        ys editText = f3Var.getEditText();
        editText.setDelegate(new m4.d0(this, editText, false));
        f3Var.setWillNotDraw(false);
        this.f29255w = new org.telegram.ui.Components.z4(f3Var);
        i6Var.setCallback(f3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.H6, f6Var);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editText, i10, f6Var);
        editText.setBackground(null);
        if (z9) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((hd.f22871a0 ? 5 : 3) | 48);
        editText.setInputType((z9 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.r6.m(editText, 30, i10, f6Var);
        this.f29249c = f6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new g3(this, i7, editText, z9));
        editText.setOnFocusChangeListener(new fi.v6(this, 2));
        addView(f3Var, c8.ha.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.i5.f();
    }

    public final void c() {
        int i7;
        f3 f3Var = this.f29248b;
        if (f3Var != null && f3Var.getEditText() != null) {
            this.f29256x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.f29250e) && ((!this.h || this.f29252n) && ((i7 = this.f29251f) == -1 || this.f29256x <= i7))) {
                str = "" + this.f29256x;
            }
            this.f29257y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f29248b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.D) {
            if (hd.f22871a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f22871a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27971k0);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setDivider(boolean z9) {
        this.D = z9;
        setWillNotDraw(!z9);
    }

    public void setEmojiViewCacheType(int i7) {
        this.f29248b.setEmojiViewCacheType(i7);
    }

    public void setShowLimitOnFocus(boolean z9) {
        this.h = z9;
    }

    public void setShowLimitWhenEmpty(boolean z9) {
        this.f29250e = z9;
        if (z9) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.f29251f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f29247a = true;
        f3 f3Var = this.f29248b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f29247a = false;
    }

    @Override
    public final void updateColors() {
        f3 f3Var = this.f29248b;
        if (f3Var != null) {
            try {
                if (f3Var.getEditText() != null) {
                    f3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f29249c));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
