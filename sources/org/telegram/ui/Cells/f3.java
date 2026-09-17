package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.qv0;
public abstract class f3 extends FrameLayout {
    public boolean f20073a;
    public final d3 f20074b;
    public final int f20075c;
    public boolean d;
    public int e;
    public boolean f20076f;
    public boolean h;
    public boolean f20077n;
    public final org.telegram.ui.Components.f5 f20078r;
    public int f20079s;
    public final org.telegram.ui.Components.m6 v;
    public boolean f20080w;

    public f3(Context context, qv0 qv0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f20077n = true;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true, false);
        this.v = m6Var;
        m6Var.k(0.2f, 160L, qr.h);
        m6Var.t(AndroidUtilities.dp(15.33f));
        m6Var.f26067b = 5;
        this.f20075c = i10;
        d3 d3Var = new d3(this, context, qv0Var, f6Var, z10);
        this.f20074b = d3Var;
        bu editText = d3Var.getEditText();
        editText.setDelegate(new n7.a1(this, editText, false, 3));
        d3Var.setWillNotDraw(false);
        this.f20078r = new org.telegram.ui.Components.f5(d3Var);
        m6Var.setCallback(d3Var);
        editText.setTextSize(1, 17.0f);
        editText.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.H6, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        editText.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
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
        editText.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        editText.setCursorSize(AndroidUtilities.dp(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new e3(this, i10, editText, z10));
        editText.setOnFocusChangeListener(new m.r2(this, 1));
        addView(d3Var, w7.x5.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.o5.g();
    }

    public final void c() {
        int i10;
        d3 d3Var = this.f20074b;
        if (d3Var != null && d3Var.getEditText() != null) {
            this.f20079s = this.f20075c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f20076f || this.h) && ((i10 = this.e) == -1 || this.f20079s <= i10))) {
                str = "" + this.f20079s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f20074b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f20080w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18984k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f20080w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f20074b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f20076f = z10;
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
        this.f20073a = true;
        d3 d3Var = this.f20074b;
        d3Var.setText(charSequence);
        d3Var.setSelection(d3Var.getText().length());
        this.f20073a = false;
    }

    public void b() {
    }
}
