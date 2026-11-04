package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.xs;
public abstract class h3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public boolean f29315a;
    public final f3 f29316b;
    public final org.telegram.ui.ActionBar.e6 f29317c;
    public final int d;
    public boolean f29318e;
    public int f29319f;
    public boolean h;
    public boolean f29320n;
    public boolean f29321r;
    public boolean f29322s;
    public final org.telegram.ui.Components.x4 f29323w;
    public int f29324x;
    public final org.telegram.ui.Components.g6 f29325y;

    public h3(Context context, qt0 qt0Var, String str, boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f29319f = -1;
        this.f29321r = true;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f29325y = g6Var;
        g6Var.n(0.2f, 160L, xq.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f33983b = 5;
        this.d = i3;
        f3 f3Var = new f3(this, context, qt0Var, e6Var, z10);
        this.f29316b = f3Var;
        xs editText = f3Var.getEditText();
        editText.setDelegate(new m2.t(11, this, editText));
        f3Var.setWillNotDraw(false);
        this.f29323w = new org.telegram.ui.Components.x4(f3Var);
        g6Var.setCallback(f3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.r6.E(editText, org.telegram.ui.ActionBar.k6.H6, e6Var);
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(editText, i10, e6Var);
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((bd.f21784a0 ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.r6.m(editText, 30, i10, e6Var);
        this.f29317c = e6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new g3(this, i3, editText, z10));
        editText.setOnFocusChangeListener(new gi.w6(this, 2));
        addView(f3Var, mf.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.g5.f();
    }

    public final void c() {
        int i3;
        f3 f3Var = this.f29316b;
        if (f3Var != null && f3Var.getEditText() != null) {
            this.f29324x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.f29318e) && ((!this.h || this.f29320n) && ((i3 = this.f29319f) == -1 || this.f29324x <= i3))) {
                str = "" + this.f29324x;
            }
            this.f29325y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f29316b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i3;
        super.onDraw(canvas);
        if (this.E) {
            if (bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i3) {
        this.f29316b.setEmojiViewCacheType(i3);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f29318e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i3) {
        this.f29319f = i3;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f29315a = true;
        f3 f3Var = this.f29316b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f29315a = false;
    }

    @Override
    public final void updateColors() {
        f3 f3Var = this.f29316b;
        if (f3Var != null) {
            try {
                if (f3Var.getEditText() != null) {
                    f3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, this.f29317c));
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
