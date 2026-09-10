package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.wr;
public abstract class f3 extends FrameLayout {
    public boolean f19108a;
    public final d3 f19109b;
    public final int f19110c;
    public boolean d;
    public int e;
    public boolean f19111f;
    public boolean h;
    public boolean f19112n;
    public final org.telegram.ui.Components.g5 f19113r;
    public int f19114s;
    public final org.telegram.ui.Components.n6 v;
    public boolean f19115w;

    public f3(Context context, aw0 aw0Var, String str, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.e = -1;
        this.f19112n = true;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, true, true, false);
        this.v = n6Var;
        n6Var.k(0.2f, 160L, wr.h);
        n6Var.t(AndroidUtilities.dp(15.33f));
        n6Var.f25425b = 5;
        this.f19110c = i10;
        d3 d3Var = new d3(this, context, aw0Var, f6Var, z10);
        this.f19109b = d3Var;
        fu editText = d3Var.getEditText();
        editText.setDelegate(new og.u0(this, editText, false, 3));
        d3Var.setWillNotDraw(false);
        this.f19113r = new org.telegram.ui.Components.g5(d3Var);
        n6Var.setCallback(d3Var);
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
        addView(d3Var, w7.a6.e(-1, -1, 48));
        c();
    }

    public int a() {
        return org.telegram.ui.Components.p5.g();
    }

    public final void c() {
        int i10;
        d3 d3Var = this.f19109b;
        if (d3Var != null && d3Var.getEditText() != null) {
            this.f19114s = this.f19110c - getText().length();
            String str = "";
            if ((!TextUtils.isEmpty(getText()) || this.d) && ((!this.f19111f || this.h) && ((i10 = this.e) == -1 || this.f19114s <= i10))) {
                str = "" + this.f19114s;
            }
            this.v.q(str, true, true);
        }
    }

    public CharSequence getText() {
        return this.f19109b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        super.onDraw(canvas);
        if (this.f19115w) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f18049k0);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setDivider(boolean z10) {
        this.f19115w = z10;
        setWillNotDraw(!z10);
    }

    public void setEmojiViewCacheType(int i10) {
        this.f19109b.setEmojiViewCacheType(i10);
    }

    public void setShowLimitOnFocus(boolean z10) {
        this.f19111f = z10;
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
        this.f19108a = true;
        d3 d3Var = this.f19109b;
        d3Var.setText(charSequence);
        d3Var.setSelection(d3Var.getText().length());
        this.f19108a = false;
    }

    public void b() {
    }
}
