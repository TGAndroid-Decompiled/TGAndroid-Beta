package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.ys;
public abstract class h3 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public boolean D;
    public boolean f29266a;
    public final f3 f29267b;
    public final org.telegram.ui.ActionBar.h6 f29268c;
    public final int d;
    public boolean f29269e;
    public int f29270f;
    public boolean h;
    public boolean f29271n;
    public boolean f29272r;
    public boolean f29273s;
    public final org.telegram.ui.Components.y4 f29274w;
    public int f29275x;
    public final org.telegram.ui.Components.h6 f29276y;

    public h3(Context context, st0 st0Var, String str, boolean z9, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.f29270f = -1;
        this.f29272r = true;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, true, true);
        this.f29276y = h6Var2;
        h6Var2.n(0.2f, 160L, wq.h);
        h6Var2.w(org.telegram.messenger.g0.L(15.33f));
        h6Var2.f34187b = 5;
        this.d = i7;
        f3 f3Var = new f3(this, context, st0Var, h6Var, z9);
        this.f29267b = f3Var;
        ys editText = f3Var.getEditText();
        editText.setDelegate(new m4.d0(this, editText, false));
        f3Var.setWillNotDraw(false);
        this.f29274w = new org.telegram.ui.Components.y4(f3Var);
        h6Var2.setCallback(f3Var);
        editText.setTextSize(1, 17.0f);
        org.telegram.ui.ActionBar.t6.D(editText, org.telegram.ui.ActionBar.m6.H6, h6Var);
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.U(editText, i10, h6Var);
        editText.setBackground(null);
        if (z9) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), org.telegram.messenger.g0.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((id.f23161a0 ? 5 : 3) | 48);
        editText.setInputType((z9 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        org.telegram.ui.ActionBar.t6.l(editText, 30, i10, h6Var);
        this.f29268c = h6Var;
        editText.setCursorSize(org.telegram.messenger.g0.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new g3(this, i7, editText, z9));
        editText.setOnFocusChangeListener(new fi.v6(this, 2));
        addView(f3Var, c8.ha.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.h5.f();
    }

    public final void c() {
        int i7;
        f3 f3Var = this.f29267b;
        if (f3Var != null && f3Var.getEditText() != null) {
            this.f29275x = this.d - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.f29269e) && ((!this.h || this.f29271n) && ((i7 = this.f29270f) == -1 || this.f29275x <= i7))) {
                str = "" + this.f29275x;
            }
            this.f29276y.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f29267b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        super.onDraw(canvas);
        if (this.D) {
            if (id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(22.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(22.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
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
        this.f29267b.setEmojiViewCacheType(i7);
    }

    public void setShowLimitOnFocus(boolean z9) {
        this.h = z9;
    }

    public void setShowLimitWhenEmpty(boolean z9) {
        this.f29269e = z9;
        if (z9) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i7) {
        this.f29270f = i7;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f29266a = true;
        f3 f3Var = this.f29267b;
        f3Var.setText(charSequence);
        f3Var.setSelection(f3Var.getText().length());
        this.f29266a = false;
    }

    @Override
    public final void updateColors() {
        f3 f3Var = this.f29267b;
        if (f3Var != null) {
            try {
                if (f3Var.getEditText() != null) {
                    f3Var.getEditText().setCursorColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.G6, this.f29268c));
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
