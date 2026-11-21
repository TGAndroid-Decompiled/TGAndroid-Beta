package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;
public abstract class i3 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public boolean E;
    public boolean f30827a;
    public final g3 f30828b;
    public final org.telegram.ui.ActionBar.h6 f30829c;
    public final int d;
    public boolean f30830e;
    public int f30831f;
    public boolean h;
    public boolean f30832n;
    public boolean f30833r;
    public boolean f30834s;
    public final org.telegram.ui.Components.g5 f30835w;
    public int f30836x;
    public final org.telegram.ui.Components.n6 f30837y;

    public i3(Context context, du0 du0Var, String str, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f30831f = -1;
        this.f30833r = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true);
        this.f30837y = n6Var;
        n6Var.n(0.2f, 160L, nr.h);
        n6Var.w(org.telegram.messenger.g0.L(15.33f));
        n6Var.f37791b = 5;
        this.d = i7;
        g3 g3Var = new g3(this, context, du0Var, h6Var, z10);
        this.f30828b = g3Var;
        ot editText = g3Var.getEditText();
        editText.setDelegate(new k8.a(14, this, editText));
        g3Var.setWillNotDraw(false);
        this.f30835w = new org.telegram.ui.Components.g5(g3Var);
        n6Var.setCallback(g3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.H6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editText, i10, h6Var);
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((gd.f24241a0 ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.t6.l(editText, 30, i10, h6Var);
        this.f30829c = h6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new h3(this, i7, editText, z10));
        editText.setOnFocusChangeListener(new hi.t6(this, 2));
        addView(g3Var, c8.ma.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.p5.f();
    }

    public final void c() {
        int i7;
        g3 g3Var = this.f30828b;
        if (g3Var != null && g3Var.getEditText() != null) {
            this.f30836x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.f30830e) && ((!this.h || this.f30832n) && ((i7 = this.f30831f) == -1 || this.f30836x <= i7))) {
                str = "" + this.f30836x;
            }
            this.f30837y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f30828b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }

    public void setDivider(boolean z10) {
        this.E = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i7) {
        this.f30828b.setEmojiViewCacheType(i7);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f30830e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.f30831f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f30827a = true;
        g3 g3Var = this.f30828b;
        g3Var.setText(charSequence);
        g3Var.setSelection(g3Var.getText().length());
        this.f30827a = false;
    }

    @Override
    public final void updateColors() {
        g3 g3Var = this.f30828b;
        if (g3Var != null) {
            try {
                if (g3Var.getEditText() != null) {
                    g3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f30829c));
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
