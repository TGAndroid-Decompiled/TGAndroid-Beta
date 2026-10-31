package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.uu0;
public abstract class j3 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public boolean f22064a;
    public final h3 f22065b;
    public final org.telegram.ui.ActionBar.p6 f22066c;
    public final int d;
    public boolean e;
    public int f22067f;
    public boolean h;
    public boolean f22068n;
    public boolean f22069r;
    public boolean f22070s;
    public final org.telegram.ui.Components.w4 f22071w;
    public int f22072x;
    public final org.telegram.ui.Components.e6 f22073y;

    public j3(Context context, uu0 uu0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f22067f = -1;
        this.f22069r = true;
        org.telegram.ui.Components.e6 e6Var = new org.telegram.ui.Components.e6(false, true, true);
        this.f22073y = e6Var;
        e6Var.n(0.2f, 160L, gr.h);
        e6Var.w(org.telegram.messenger.i0.L(15.33f));
        e6Var.f25695b = 5;
        this.d = i10;
        h3 h3Var = new h3(this, context, uu0Var, p6Var, z10);
        this.f22065b = h3Var;
        mt editText = h3Var.getEditText();
        editText.setDelegate(new m4.c(14, this, editText));
        h3Var.setWillNotDraw(false);
        this.f22071w = new org.telegram.ui.Components.w4(h3Var);
        e6Var.setCallback(h3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.a7.E(editText, org.telegram.ui.ActionBar.t6.H6, p6Var);
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.V(editText, i11, p6Var);
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.i0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((cd.X ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.a7.m(editText, 30, i11, p6Var);
        this.f22066c = p6Var;
        editText.setCursorSize(org.telegram.messenger.i0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new i3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(h3Var, w7.b6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.f5.f();
    }

    public final void c() {
        int i10;
        h3 h3Var = this.f22065b;
        if (h3Var != null && h3Var.getEditText() != null) {
            this.f22072x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.e) && ((!this.h || this.f22068n) && ((i10 = this.f22067f) == -1 || this.f22072x <= i10))) {
                str = "" + this.f22072x;
            }
            this.f22073y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f22065b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i10;
        super.onDraw(canvas);
        if (this.D) {
            if (cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(22.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (cd.X) {
                i10 = org.telegram.messenger.i0.L(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.D = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f22065b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.f22067f = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22064a = true;
        h3 h3Var = this.f22065b;
        h3Var.setText(charSequence);
        h3Var.setSelection(h3Var.getText().length());
        this.f22064a = false;
    }

    @Override
    public final void updateColors() {
        h3 h3Var = this.f22065b;
        if (h3Var != null) {
            try {
                if (h3Var.getEditText() != null) {
                    h3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.G6, this.f22066c));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
