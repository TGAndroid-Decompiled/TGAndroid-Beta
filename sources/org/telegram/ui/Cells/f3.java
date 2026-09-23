package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.rr;
public abstract class f3 extends FrameLayout {
    public boolean f20026a;
    public final d3 f20027b;
    public final int f20028c;
    public boolean d;
    public int e;
    public boolean f20029f;
    public boolean h;
    public boolean f20030n;
    public final org.telegram.ui.Components.h5 f20031r;
    public int f20032s;
    public final org.telegram.ui.Components.o6 v;
    public boolean f20033w;

    public f3(Context context, pv0 pv0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = -1;
        this.f20030n = true;
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(false, true, true, false);
        this.v = o6Var;
        o6Var.k(0.2f, 160L, rr.h);
        o6Var.t(AndroidUtilities.dp(15.33f));
        o6Var.f26614b = 5;
        this.f20028c = i10;
        d3 d3Var = new d3(this, context, pv0Var, d6Var, z10);
        this.f20027b = d3Var;
        cu editText = d3Var.getEditText();
        editText.setDelegate(new n7.a1(this, editText, false, 3));
        d3Var.setWillNotDraw(false);
        this.f20031r = new org.telegram.ui.Components.h5(d3Var);
        o6Var.setCallback(d3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.H6, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new e3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(d3Var, w7.x5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.q5.g();
    }

    public final void c() {
        int i10;
        d3 d3Var = this.f20027b;
        if (d3Var != null && d3Var.getEditText() != null) {
            this.f20032s = this.f20028c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f20029f || this.h) && ((i10 = this.e) == -1 || this.f20032s <= i10))) {
                str = "" + this.f20032s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f20027b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f20033w) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(22.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(22.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f20033w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f20027b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f20029f = z10;
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
        this.f20026a = true;
        d3 d3Var = this.f20027b;
        d3Var.setText(charSequence);
        d3Var.setSelection(d3Var.getText().length());
        this.f20026a = false;
    }

    public void b() {
    }
}
