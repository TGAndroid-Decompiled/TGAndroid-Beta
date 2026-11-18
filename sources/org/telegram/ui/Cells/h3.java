package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;
public abstract class h3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean E;
    public boolean f30751a;
    public final f3 f30752b;
    public final org.telegram.ui.ActionBar.i6 f30753c;
    public final int d;
    public boolean f30754e;
    public int f30755f;
    public boolean h;
    public boolean f30756n;
    public boolean f30757r;
    public boolean f30758s;
    public final org.telegram.ui.Components.f5 f30759w;
    public int f30760x;
    public final org.telegram.ui.Components.m6 f30761y;

    public h3(Context context, au0 au0Var, String str, boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        this.f30755f = -1;
        this.f30757r = true;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.f30761y = m6Var;
        m6Var.n(0.2f, 160L, lr.h);
        m6Var.w(org.telegram.messenger.g0.L(15.33f));
        m6Var.f37377b = 5;
        this.d = i7;
        f3 f3Var = new f3(this, context, au0Var, i6Var, z10);
        this.f30752b = f3Var;
        mt editText = f3Var.getEditText();
        editText.setDelegate(new k8.a(14, this, editText));
        f3Var.setWillNotDraw(false);
        this.f30759w = new org.telegram.ui.Components.f5(f3Var);
        m6Var.setCallback(f3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.u6.D(editText, org.telegram.ui.ActionBar.n6.H6, i6Var);
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.U(editText, i10, i6Var);
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((gd.f24216a0 ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.u6.l(editText, 30, i10, i6Var);
        this.f30753c = i6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new g3(this, i7, editText, z10));
        editText.setOnFocusChangeListener(new hi.u6(this, 2));
        addView(f3Var, c8.ma.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.o5.f();
    }

    public final void c() {
        int i7;
        f3 f3Var = this.f30752b;
        if (f3Var != null && f3Var.getEditText() != null) {
            this.f30760x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.f30754e) && ((!this.h || this.f30756n) && ((i7 = this.f30755f) == -1 || this.f30760x <= i7))) {
                str = "" + this.f30760x;
            }
            this.f30761y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f30752b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (gd.f24216a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (gd.f24216a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29519k0);
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
        this.f30752b.setEmojiViewCacheType(i7);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f30754e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.f30755f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f30751a = true;
        f3 f3Var = this.f30752b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f30751a = false;
    }

    @Override
    public final void updateColors() {
        f3 f3Var = this.f30752b;
        if (f3Var != null) {
            try {
                if (f3Var.getEditText() != null) {
                    f3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G6, this.f30753c));
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
