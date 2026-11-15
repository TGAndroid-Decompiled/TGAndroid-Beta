package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.st0;
public abstract class h3 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public boolean f30374a;
    public final f3 f30375b;
    public final org.telegram.ui.ActionBar.e6 f30376c;
    public final int d;
    public boolean f30377e;
    public int f30378f;
    public boolean h;
    public boolean f30379n;
    public boolean f30380r;
    public boolean f30381s;
    public final org.telegram.ui.Components.x4 f30382w;
    public int f30383x;
    public final org.telegram.ui.Components.g6 f30384y;

    public h3(Context context, st0 st0Var, String str, boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f30378f = -1;
        this.f30380r = true;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.f30384y = g6Var;
        g6Var.n(0.2f, 160L, er.h);
        g6Var.w(org.telegram.messenger.g0.L(15.33f));
        g6Var.f34833b = 5;
        this.d = i7;
        f3 f3Var = new f3(this, context, st0Var, e6Var, z10);
        this.f30375b = f3Var;
        ft editText = f3Var.getEditText();
        editText.setDelegate(new k8.a(14, this, editText));
        f3Var.setWillNotDraw(false);
        this.f30382w = new org.telegram.ui.Components.x4(f3Var);
        g6Var.setCallback(f3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.q6.D(editText, org.telegram.ui.ActionBar.j6.H6, e6Var);
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.q6.U(editText, i10, e6Var);
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((hd.f24104a0 ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.q6.l(editText, 30, i10, e6Var);
        this.f30376c = e6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new g3(this, i7, editText, z10));
        editText.setOnFocusChangeListener(new hi.u6(this, 2));
        addView(f3Var, c8.ja.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.g5.f();
    }

    public final void c() {
        int i7;
        f3 f3Var = this.f30375b;
        if (f3Var != null && f3Var.getEditText() != null) {
            this.f30383x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.f30377e) && ((!this.h || this.f30379n) && ((i7 = this.f30378f) == -1 || this.f30383x <= i7))) {
                str = "" + this.f30383x;
            }
            this.f30384y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f30375b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.E) {
            if (hd.f24104a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (hd.f24104a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f28972k0);
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
        this.f30375b.setEmojiViewCacheType(i7);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.h = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.f30377e = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.f30378f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f30374a = true;
        f3 f3Var = this.f30375b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f30374a = false;
    }

    @Override
    public final void updateColors() {
        f3 f3Var = this.f30375b;
        if (f3Var != null) {
            try {
                if (f3Var.getEditText() != null) {
                    f3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G6, this.f30376c));
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
