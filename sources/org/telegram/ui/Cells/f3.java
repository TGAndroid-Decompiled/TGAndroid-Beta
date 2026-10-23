package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.lw0;
public abstract class f3 extends FrameLayout {
    public boolean f22232a;
    public final d3 f22233b;
    public final int f22234c;
    public boolean d;
    public int e;
    public boolean f22235f;
    public boolean h;
    public boolean f22236n;
    public final org.telegram.ui.Components.i5 f22237r;
    public int f22238s;
    public final org.telegram.ui.Components.p6 v;
    public boolean f22239w;

    public f3(Context context, lw0 lw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = -1;
        this.f22236n = true;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, true, true);
        this.v = p6Var;
        p6Var.n(0.2f, 160L, bs.h);
        p6Var.w(AndroidUtilities.dp(15.33f));
        p6Var.f29230b = 5;
        this.f22234c = i10;
        d3 d3Var = new d3(this, context, lw0Var, d6Var, z10);
        this.f22233b = d3Var;
        iu editText = d3Var.getEditText();
        editText.setDelegate(new mi.q(this, editText, false, 9));
        d3Var.setWillNotDraw(false);
        this.f22237r = new org.telegram.ui.Components.i5(d3Var);
        p6Var.setCallback(d3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        editText.setBackground(null);
        if (z10) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), AndroidUtilities.dp(0.0f), editText.getPaddingBottom());
        editText.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        editText.setInputType((z10 ? 131072 : 0) | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        editText.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new e3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.s2(this, 1));
        addView(d3Var, w7.z5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.r5.g();
    }

    public final void c() {
        int i10;
        d3 d3Var = this.f22233b;
        if (d3Var != null && d3Var.getEditText() != null) {
            this.f22238s = this.f22234c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f22235f || this.h) && ((i10 = this.e) == -1 || this.f22238s <= i10))) {
                str = "" + this.f22238s;
            }
            this.v.t(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f22233b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f22239w) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(22.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f21115k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f22239w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f22233b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f22235f = z10;
    }

    public void setShowLimitWhenEmpty(boolean z10) {
        this.d = z10;
        if (z10) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i10) {
        this.e = i10;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.f22232a = true;
        d3 d3Var = this.f22233b;
        d3Var.setText(charSequence);
        d3Var.setSelection(d3Var.getText().length());
        this.f22232a = false;
    }

    public void b() {
    }
}
